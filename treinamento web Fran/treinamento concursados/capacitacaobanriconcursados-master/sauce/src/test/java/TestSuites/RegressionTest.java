package TestSuites;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectPackages("TestCases")
@IncludeTags ("regressao")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class RegressionTest {

}
