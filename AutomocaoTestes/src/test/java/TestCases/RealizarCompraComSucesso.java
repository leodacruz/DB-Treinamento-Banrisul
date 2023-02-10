package TestCases;

import org.junit.jupiter.api.Test;

import Tasks.HomeTask;

public class RealizarCompraComSucesso {

	HomeTask homeTask = new HomeTask(driver);
	
	
	@Test
	public void realizarCompra() {
		homeTask.efetuarLogin();
		
	}
}
