package TestSuites;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import TestCases.RealizarCompraComSucessoCSVTest;
import TestCases.RealizarCompraComSucessoTest;

@Suite
@SelectClasses({RealizarCompraComSucessoTest.class,RealizarCompraComSucessoCSVTest.class})
public class PositivoTest {

}
