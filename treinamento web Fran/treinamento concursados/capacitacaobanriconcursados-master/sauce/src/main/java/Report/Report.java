package Report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Media;

import net.bytebuddy.matcher.IsNamedMatcher;

public class Report {
    
    private static final ExtentReports extent = ReportFactory.getInstance();
    private static final ThreadLocal <ExtentTest> test = new ThreadLocal <>();
    private static final ThreadLocal <ExtentTest> parentTest = new ThreadLocal <>();
    
    public static void createTest(String testName, ReportType type) {
        
        if(type.equals(ReportType.SINGLE)) {
            
            ExtentTest extentTest = extent.createTest(testName);
            test.set(extentTest);
            return; 
        }
       
        ExtentTest extentTest = extent.createTest(testName);
        parentTest.set(extentTest);
        
    }
    
    public static void createStep(String stepName) {
        
        try {
            
            ExtentTest child = parentTest.get().createNode(stepName);
            test.set(child);
            
            
        }catch (NullPointerException ignored) {
            // TODO: handle exception
        }
        
    }
    
    private static boolean instanceDoesntExist() {
        
        if(test.get()==null) {
            
            return true;
        }
        
        return false;
    }
    
    public static void log(Status status, String message) {
        
        if(instanceDoesntExist()) {
            
            return;
        }
        test.get().log(status, message);
    }
    
    public static void log(Status status, String message, Media capture) {
        
        if(instanceDoesntExist()) {
            
            return;
        }
        test.get().log(status, message,capture);
    }
    
    public static void close() {
        
        if(instanceDoesntExist()) {
            return;
        }
        extent.flush();
    }
}
