package utilities;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Helper {

	public static void CaptureScreenShots(WebDriver driver, String ScreenShotName ) {
		
		
		
		Path dest=Paths.get("./SS",ScreenShotName+".png");
		try {
			Files.createDirectories(dest.getParent());
			FileOutputStream out=new FileOutputStream(dest.toString());
			out.write(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES));
			out.close();
		} catch (IOException e) {
			System.out.println("Exception While Taking ScreenShot"+e.getMessage());
		}
		
	}
}
