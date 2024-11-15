package DataProvider;

import org.testng.annotations.DataProvider;

public class DataStorage {
	@DataProvider
	public   String[][] logindata() {
		String data[][]= {
				{"admin","admin"},
				{"ad","admin"},
				{"admin","ad"},
				{"ad","ad"}
				};
		return data;
	}
	
	@DataProvider
	public  String[][] registerData() {
		String registerData[][]= {
				{"john","smith","john1234@gmail.com","john@1234","john@1234"},
				{"harley","davidson","harley123@gmail.com","harley@1234","harley@1234"}
		};
		return registerData;		
	}
	
	@DataProvider
	public String[][] LoginDemoWebShop() {
		String dataWeb[][]= {
				{"abhis1234@gmail.com","abhis@1234"},
				{"luke2408@gmail.com","Yuiop@123"},
				{"mike2408@gmail.com","Yuiop@123"},
				{"helen2510@gmail.com","Yuiop@123"}
		};
		return dataWeb;
	}
}
