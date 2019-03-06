package fr.ensup.demoTDD.test;

import org.junit.Test;

import fr.ensup.demoTDD.service.Calculatrice;

public class CalculatriceTest {

	/*
	 * @Test public void scenarioAdditionEntier() { org.junit.Assert.fail("echec");
	 * }
	 */

	@Test
	public void scenarioAdditionEntier() {
		Calculatrice mycalc = new Calculatrice();
		int res = mycalc.ajouterEntiers(2,3);
		org.junit.Assert.assertEquals(res,5);
	}
}
