import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/mayank/eclipse-workspace/Introduction/chromedriver_win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		// vtiger
//		driver.get("http://localhost:8888/index.php");
//		driver.findElement(By.name("user_name")).sendKeys("admin");
//		driver.findElement(By.name("user_password")).sendKeys("admin");
//		driver.findElement(By.id("submitButton")).click();
//		System.out.println(driver.findElement(By.tagName("a")));
//		driver.findElement(By.tagName("a")).click();

		//		System.out.println(driver.getTitle());
		
		
		
		// gmail
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
//		driver.findElement(By.name("identifier")).sendKeys("mayank@gmail.com");
//		driver.findElement(By.tagName("input")).sendKeys("mayank@gmail.com");
		driver.findElement(By.className("whsOnd zHQkBf")).sendKeys("mayank@gmail.com");
//		driver.findElement(By.id("identifierId")).sendKeys("mayankjoshi@gmail.com");
//		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
//		driver.findElement(By.id("submitButton")).click();
//		System.out.println(driver.findElement(By.tagName("a")));
	}

}
