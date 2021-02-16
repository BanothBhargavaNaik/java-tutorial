import java.io.*; 
import java.net.*;
import java.util.*;
import javax.swing.*; 
public class WordCount
{
	final static Integer ONE = new Integer(1); 
	final static String DELIMITERS = " \t\n\r\f.,&lt;&gt;\"\'=/";

	// Define a Map and create a HashMap 
	Map map = new HashMap(); 

	// Return the map
	public Map getMap()
	{
		return map;
	}

	// Clear the map
	public void clear() 
	{ 
		map.clear(); 
	}

	public void readURL(URL url)
	{
		InputStream is = null;
		try
		{
			is = url.openStream(); 
			// Convert to Reader
			 Reader reader = new InputStreamReader(is);
			 BufferedReader br = new BufferedReader(reader); 
			 // For each line
			 String line = null;
			 while ((line = br.readLine()) != null) 
			{
				 addWords(line);
			}
		}
			catch (IOException ioException)
			{
				System.err.println("Error processing: " + url);
			}
			finally
			{
			if (is != null)
			{
				try 
				{
				is.close();
				}
				catch (IOException ioException) 
					{ }
			}
			}
	}

	private void addWords(String line)
	{
		Map map = getMap(); // Split words 
		StringTokenizer tokenizer = new StringTokenizer(line, DELIMITERS); 
		// For each word 
		while (tokenizer.hasMoreTokens())
		{
			String key = tokenizer.nextToken(); 
			// Get frequency If not fount, add word to map with count one Otherwise, add to map with old count + 1
			Integer frequency = (Integer)map.get(key); 
			if (frequency == null)
			{
				frequency = ONE;
			}
			else
			{
				int value = frequency.intValue();
				frequency = new Integer(value + 1);
			}
			map.put(key, frequency);
		}
	}
}
