package homepagetest;

import org.testng.annotations.Test;

import homepagebase.Homevalidation;

public class Homepagewebelemntpage extends Baseclass {
	@Test
	public void validation() {
		Homevalidation af=new Homevalidation();
		af.searchingFunctionality();
	}

}
