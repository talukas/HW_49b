package core;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign_Up_POM_PF {
	
	static WebDriver driver;
	static final String baseUrl = "http://alex.academy/exercises/signup/v1/";
	static  String  first_name = "Rick";
	static String last_name = "Smith";
	static String last_name_error = "Wu";
	static String email = "ts@mail.ru";
	static String phone = "1233467896";
	static String current_location = "id_current_location";
	
	@FindBy(id="id_fname")
	static WebElement fname_field;
	@FindBy(id="id_lname")
	static WebElement lname_field;
	@FindBy(id="id_email") 
	static WebElement email_field;
	@FindBy(id="id_phone") 
	static WebElement phone_field;
	@FindBy(id="id_current_location")
	static WebElement location;
	@FindBy(id="id_temperature")
	static WebElement grade;
	@FindBy(id="id_checkbox")
	static WebElement gender;
	@FindBy(id="id_state")
	static WebElement place;
	@FindBy(id="id_quotes")
	static WebElement mind;
	@FindBy(id="timestamp")
	static WebElement time;
	@FindBy(id="copyright")
	static WebElement copy;
	@FindBy(id="os_browser")
	static WebElement system;
	@FindBy(id="id_submit_button")
	static WebElement submit_button;
	@FindBy(id="id_img_facebook")
	static WebElement link_facebook;
	@FindBy(id="id_img_twitter")
	static WebElement link_twitter;
	@FindBy(id="id_img_flickr")
	static WebElement link_flickr;
	@FindBy(id="id_img_youtube")
	static WebElement link_youtube;
	@FindBy(id="id_fname_conf")
	static WebElement first_name_conf;
	@FindBy(id="id_lname_conf")
	static WebElement last_name_conf;
	@FindBy(id="id_email_conf")
	static WebElement email_confirm;
	@FindBy(id="id_phone_conf")
	static WebElement phone_confirm;

	public static void main(String[] args)
	//{
	//if (browser.equalsIgnoreCase("chrome"))
	{
	Logger logger = Logger.getLogger("");
	logger.setLevel(Level.OFF);
	System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver");
	System.setProperty("webdriver.chrome.silentOutput", "true");
	ChromeOptions option = new ChromeOptions();
	option.addArguments("-start-fullscreen");
	driver = new ChromeDriver(option);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	//}
	//else {driver = new HtmlUnitDriver();
	//((HtmlUnitDriver) driver).setJavascriptEnabled(true);
	//}
	driver.get(baseUrl);

		PageFactory.initElements(driver, Sign_Up_POM_PF.class);
			
		fname_field.sendKeys(first_name);
		lname_field.sendKeys(last_name);
		email_field.sendKeys(email);
		phone_field.sendKeys(phone);
		location.getText();
		grade.isEnabled();
		gender.click();
		place.sendKeys("CA");
		mind.getText();
		time.getText();
		copy.getText();
		system.getText();
		link_facebook.click();
		link_twitter.click();
		link_flickr.click();
		link_youtube.click();
		submit_button.click();
		first_name_conf.isEnabled();
		last_name_conf.isEnabled();
		email_confirm.isEnabled();
		phone_confirm.isEnabled();
	
	driver.quit();
	}

	}		



