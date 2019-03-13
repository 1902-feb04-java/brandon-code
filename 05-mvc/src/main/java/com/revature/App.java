package com.revature;

public class App
{

	public static void main(String[] args)
	{
		Sandwhich s = new Sandwhich("ingredients.txt");
		System.out.println(s.toString());
		
		
//	 Database connections "protocol:subprotocal://address:port/database" = "jdbc:postgresql://localhost:5432/PubHub"
	}

}
