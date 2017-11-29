package Model;

import java.util.ArrayList;

public class Dataset {
	
	// VARIABLES
	private ArrayList<String> attributs;
	private ArrayList<Data> dataset;

	// GUETTERS & SETTERS
	public ArrayList<Data> getDataset() {
		return dataset;
	}

	public void setDataset(ArrayList<Data> dataset) {
		this.dataset = dataset;
	}

	public ArrayList<String> getAttributs() {
		return attributs;
	}

	public void setAttributs(ArrayList<String> attributs) {
		this.attributs = attributs;
	}

	// CONSTRUCTORS
	public Dataset() {
		super();
		this.attributs = new ArrayList<String>();
		this.dataset = new ArrayList<Data>();
	}

	public Dataset(ArrayList<Data> dataset) {
		super();
		this.dataset = dataset;
		this.attributs = new ArrayList<String>();
	}
	
	
}
