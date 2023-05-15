package TestSuites;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import TestCases.RealizarCompraComSucessoDataClassTest;
import TestCases.RealizarCompraComSucessoTest;

@Suite
@SelectClasses({RealizarCompraComSucessoDataClassTest.class,RealizarCompraComSucessoTest.class})
public class PositivosTest {

}
