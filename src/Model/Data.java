package Model;

import java.util.ArrayList;

public class Data {
	
	// VARIABLE
	private String id;
	//private double[] dims;
	private ArrayList<Double> dims;
	
	// GUETTERS & SETTERS
	public String getId(){
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	/*public double[] getDims() {
		return dims;
	}
	public void setDims(double[] dims) {
		this.dims = dims;
	}*/
	public ArrayList<Double> getDims() {
		return dims;
	}
	public void setDims(ArrayList<Double> dims) {
		this.dims = dims;
	}
	
	// CONSTRUCTORS
	public Data() {
		super();
		//this.dims = new double[];
		this.dims = new ArrayList<Double>();
	}
	public Data(ArrayList<Double> dims) {
		super();
		this.dims = dims;
	}
	public Data(String id) {
		super();
		this.id = id;
		//this.dims = new double[];
		this.dims = new ArrayList<Double>();
	}
	/*
	public Data(String id, double[] dims) {
		super();
		this.id = id;
		this.dims = dims;
	}*/
	public Data(String id, ArrayList<Double> dims) {
		super();
		this.id = id;
		this.dims = dims;
	}
	
	// METHODS
	public void addDim(Double value)
	{
		this.dims.add(value);
	}
	
}
