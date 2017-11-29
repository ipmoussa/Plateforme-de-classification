package Model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Test {

	public static void main(String[] args) {
		
		try 
		{
			int nbData = 0;
			
			// Dans le cas ou la 1ere ligne correspond aux noms d'attributs
			boolean premiereColonneDescription = true;
			
			Dataset ds = new Dataset();
			
			Reader in = new FileReader("Dataset_2.csv");
			Iterable<CSVRecord> records = CSVFormat.DEFAULT.parse(in);
			
			for (CSVRecord record : records) 
			{
			    //String column = record.get(2);
				
				if (premiereColonneDescription)
				{
					if (nbData == 0)
					{
						for (int i=0; i<record.size(); i++)
						{
							String column = record.get(i);
							//d.addDim(Double.valueOf(column));
							ds.getAttributs().add(column);
						}
						
						premiereColonneDescription = false;
					}
				}
				
				else //(nbData != 0)
				{
					Data d = new Data(Integer.toString(nbData));	
					
					for (int i=0; i<record.size(); i++)
					{
						String column = record.get(i);
						d.addDim(Double.valueOf(column));
					}
			    
					ds.getDataset().add(d);
				}
				
				nbData ++;
			    
			    //System.out.println(record);
			    //String columnTwo = record.get(1);
			}
			//System.out.println("Nombre d'exemples " + nb);
			
			System.out.println(ds.getAttributs());
			System.out.println(ds.getDataset().get(0).getDims());
			
		} 
		catch (FileNotFoundException e) 
		{	
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		catch (NumberFormatException e)
		{
			//e.printStackTrace();
			System.out.println("Erreur lors du chargement du jeu de données :");
			System.out.println("Les valeurs chargées ne sont pas numériques.");
		}
		
		
	}

}
