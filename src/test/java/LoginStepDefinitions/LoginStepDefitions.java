
  package LoginStepDefinitions;
  
  //test
  
  import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import groovyjarjarantlr4.v4.codegen.model.Action;
import io.cucumber.java.en.Given; import io.cucumber.java.en.Then; import
  io.cucumber.java.en.When;
import junit.framework.Assert;
  
  public class LoginStepDefitions {
	  
	  WebDriver driver;
  
  @Given("^User is already on loginpage$") public void
  user_is_already_on_loginpage() {
	  System.setProperty("webdriver.chrome.driver", "C:/Users/kalai/eclipse-workspace/cucumbertesting/drivers/chromeDriver.exe");
	  driver =new ChromeDriver();
	  driver.get("https://ui.freecrm.com/");
  }
  
  @When("title of login page in Free CRM") public void
  title_of_login_page_in_free_crm() { 
	  //alt+shift+L
	  String title = driver.getTitle();
	  System.out.println(title );
       Assert.assertEquals("Cogmento CRM", title);
  }
  
  @Then("user enter username and user enter password") public void
  user_enter_username_and_user_enter_password() throws InterruptedException {
	  Thread.sleep(3000);
  	  driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys("skv.sdet@gmail.com");
  	  Thread.sleep(3000);
	  driver.findElement(By.name("password")).sendKeys("Namakkal@123");
	  
  }
  
  
  
 
  @Then("user enter {string} and user enter {string}")
  public void user_enter_and_user_enter(String username, String password) throws Throwable {
	  Thread.sleep(3000);
  	  driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys(username);
  	  System.out.println("i have entered username");
  	  Thread.sleep(3000);
	  driver.findElement(By.name("password")).sendKeys(password);
	  System.out.println("i have entered password");
      
  }



  
  @Then("user is on homepage")
  public void user_is_on_homepage() { // Write
	  try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  WebElement homepage= driver.findElement(By.id("top-header-menu"));
	  homepage.getText();
  }
  @When("user navigate to contact page")
  public void user_navigate_to_contact_page() throws Throwable {
	  Thread.sleep(4000);
	  driver.findElement(By.cssSelector("body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > a:nth-child(1) > span:nth-child(2)")).click();
  }

  @Then("user trying adding new contact")
  public void user_trying_adding_new_contact() throws InterruptedException {
	  Thread.sleep(3000);
	 WebElement ele= driver.findElement(By.cssSelector("body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(2) > i:nth-child(1)"));
	 ele.isDisplayed();
	  
	 Actions act=new Actions(driver);
	 act.doubleClick(ele).perform();
	  Thread.sleep(3000);
	// driver.quit();
  }
  

  


  }



 