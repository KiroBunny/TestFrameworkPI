package com.pi.configuration;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Configuration
{
	public static final String APPLICATION_ADDRESS = "applicationAddress";
	public static final String BROWSER_NAME = "browserName";

	private static FileReader reader;
	private static Properties properties;

	private static void setUpConfig() throws IOException
	{
		reader = new FileReader("src/main/resources/project.properties");
		properties = new Properties();
		properties.load(reader);
	}

	public static String getProperty(final String property)
	{
		try
		{
			setUpConfig();
		}
		catch (final IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				reader.close();
			}
			catch (final IOException e)
			{
				e.printStackTrace();
			}
		}

		return properties.getProperty(property);
	}
}
