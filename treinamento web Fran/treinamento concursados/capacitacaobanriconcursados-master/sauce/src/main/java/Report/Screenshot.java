package Report;

import java.io.File;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.output.ByteArrayOutputStream;
import org.apache.hc.client5.http.utils.Base64;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.assertthat.selenium_shutterbug.core.PageSnapshot;
import com.assertthat.selenium_shutterbug.core.Shutterbug;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.model.Media;

import Framework.Utils.CreateFolder;
import Framework.Utils.DateTime;

public class Screenshot {
    
    private static final String PATH_SCREENSHOT = ReportFactory.PATH_REPORT + 
            File.separator + "Screenshot";
    
    public static Media capture(WebDriver driver) {
        
        try {
            
            CreateFolder.createFolderReport(PATH_SCREENSHOT);
            File scrshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            String screenshot = PATH_SCREENSHOT +File.separator + 
                    "Image_" + DateTime.getDateTimeFormatScreenshot();
            FileUtils.copyFile(scrshot, new File(screenshot));
            return MediaEntityBuilder.createScreenCaptureFromPath(screenshot).build();
            
        }catch (Exception e) {
            String message = "Ocorreu um erro ao capturar a tela" + e.getMessage();
        }  
        
        return null;
    }
    
    public static Media captureBase64(WebDriver driver) {
        
        
        try {
            
            PageSnapshot screenshot = Shutterbug.shootPage(driver);
            ByteArrayOutputStream stream = new ByteArrayOutputStream();
            ImageIO.write(screenshot.getImage(), "png", stream);
            String base64Image = Base64.encodeBase64String(stream.toByteArray());
            return MediaEntityBuilder.createScreenCaptureFromBase64String(base64Image).build();
            
            
        }catch (Exception e) {
            
            String message = "Ocorreu um erro ao capturar a tela" + e.getMessage();
        }
        
        return null;
    }
    
    
    
    

}
