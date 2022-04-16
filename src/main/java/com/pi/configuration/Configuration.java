package com.pi.configuration;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Configuration
{
	static final String APPLICATION_ADDRESS = "applicationAddress";
	static final String GRID_HUB_URL = "gridHubUrl";
	static final String BROWSER_NAME = "browserName";
	static final String DRIVER_TYPE = "driverType";

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
