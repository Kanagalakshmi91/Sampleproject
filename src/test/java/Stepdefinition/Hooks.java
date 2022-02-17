package Stepdefinition;

import org.base.Baseutils;

import io.cucumber.java.Before;

public class Hooks extends Baseutils {

	@Before
	public void init() {
		driver = driverinit("chrome");
	}
}
