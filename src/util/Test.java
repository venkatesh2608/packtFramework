package util;

public class Test {

	public static void main(String[] args) throws Exception {
		
		CreateDriver.getInstance().setDriver("chrome", "windows 7", "local");
		
		CreateDriver.getInstance().closeDriver();
		
	}

}
