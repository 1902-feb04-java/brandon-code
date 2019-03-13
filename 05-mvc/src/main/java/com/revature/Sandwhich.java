package com.revature;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Sandwhich
{
	List<String> ingredients = new ArrayList<String>();
	String prepStyle;
	boolean isWrap;

	public Sandwhich(List<String> ingredients, String prepStyle, boolean isWrap)
	{
		// super();
		this.ingredients = ingredients;
		this.prepStyle = prepStyle;
		this.isWrap = isWrap;
	}

	public Sandwhich(String fileName)
	{
		try (BufferedReader br = new BufferedReader(new FileReader(fileName));)
		{
			while (br.ready())
			{
				ingredients.add(br.readLine());
			}
			this.prepStyle = "hot";
			this.isWrap = true;
		} catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public String toString()
	{
		return "Sandwhich [ingredients=" + ingredients + ", prepStyle=" + prepStyle + ", isWrap=" + isWrap + "]";
	}

}
