package stringArray;

import java.util.*;

public class StringArray {

	String []cities = { "Toronto", "Ottawa", "Brampton", "Hamilton", "London", "Mississauga", "Burlingon", "Kingston",
			"Kitchener" };

	Scanner sc = new Scanner(System.in);

	String findCityName() {
		System.out.println("Enter the name of the city to find");
		String cityToFind = sc.nextLine();
		boolean found=false;
		for (int i = 0; i < cities.length; i++)
		{
			if (cities[i].equalsIgnoreCase(cityToFind))
			{
				System.out.println("City name Found");
				found=true;
				break;
			}
		}
		
			if(!found) {
				System.out.println("City name not found");
			}
		

		return cityToFind;

	}
	
	void findCityEndwithTon()
	{
		System.out.println("City name Found with ton is"+ " " );
		for (int i = 0; i < cities.length; i++)
		{
			if (cities[i].endsWith("ton"))
			{
				System.out.println(cities[i]);
				
			}
		}
		//return cities;
	}
	void replaceCityEndwithTonWithFun()
	{
		System.out.println("City name chaned ton with fun is"+ " " );
		for (int i = 0; i < cities.length; i++)
		{
			if (cities[i].endsWith("ton"))
			{
			cities[i]=	cities[i].replace("ton", "fun");
				System.out.println(cities[i]);
				
			}
		}
		//return cities;
	}
	void extractTheString()
	{
		String str="100 Queen street,Toronto,M5V 3E3";
		String[]extract=str.split(",");
		String streetAddress=extract[0];
		String city=extract[1];
		String zip=extract[2];
		System.out.println("streetAddress" +" "+" is "+streetAddress);
		System.out.println("city"+" "+"is"+ " "+city);
		System.out.println("zip"+" "+"is "+zip);
		
		//return cities;
	}
}
