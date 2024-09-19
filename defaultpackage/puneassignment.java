package defaultpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class puneassignment {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.thepric.com/lm/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement CreatedLockedMessage=driver.findElement(By.xpath("//button[@class='btn btn-gradient-primary']"));
		CreatedLockedMessage.click();
		WebElement Amount =driver.findElement(By.name("price"));
		Amount.sendKeys("200");
		WebElement VisibleMessage= driver.findElement(By.name("visibleMessage"));
		VisibleMessage.sendKeys("aslfniuwnfwocv");
		WebElement premiumContent=driver.findElement(By.name("premiumContent"));
		premiumContent.sendKeys("fcwevrve");
		WebElement selectImage=driver.findElement(By.xpath("//button[@type='button']"));
		selectImage.click();
		WebElement Activatelimitedtimeoffer = driver.findElement(By.xpath("//input[@type='checkbox']"));
		Activatelimitedtimeoffer.click();
		WebElement TimetoExpire = driver.findElement(By.name("fomoTimeSelection"));
		TimetoExpire.sendKeys("3 Minutes");
		WebElement Discount = driver.findElement(By.name("fomoDiscount"));
		Discount.sendKeys("3 Minutes");
		WebElement ExpireMessage = driver.findElement(By.name("isExpire"));
		ExpireMessage.click();
		WebElement CustomPrice  = driver.findElement(By.xpath("//input[@type='checkbox']"));
		CustomPrice.click();
		WebElement Submit  = driver.findElement(By.xpath("//button[@type='button']"));
		Submit.click();
		WebElement Edit = driver.findElement(By.xpath("//i[class='fe fe-edit']"));
		Edit.click();
		WebElement NewAmount =driver.findElement(By.name("price"));
		NewAmount.sendKeys("500");
		WebElement NewVisibleMessage= driver.findElement(By.name("visibleMessage"));
		NewVisibleMessage.sendKeys("aslfniuwnfwocv");
		WebElement NewpremiumContent=driver.findElement(By.name("premiumContent"));
		NewpremiumContent.sendKeys("fcwevrve");
		WebElement Delete = driver.findElement(By.xpath("//i[class='fe fe-trash']"));
		Delete.click();
		
}
}
