package com.example.roomServices.model;

import java.util.HashMap;
import java.util.Map;

public class roomServiceModel {
	private double cost;
	private String [] services;
	
	private Map<String, Integer> serviceCost;// = new HashMap<String, Integer>();
	
	public roomServiceModel() {
		super();
		this.cost = 0;
		this.services = null;
		serviceCost=null;
	}
	
	public roomServiceModel(double cost, String[] services) {
		super();
		this.cost = cost;
		this.services = services;
		serviceCost = new HashMap<String, Integer>();
		for(int i=0;i<services.length;i++)
			serviceCost.put(services[i],i+10);
	}
	
	public roomServiceModel(double cost, String[] services, int[] eachCost) {
		super();
		this.cost = cost;
		this.services = services;
		serviceCost = new HashMap<String, Integer>();
		for(int i=0;i<services.length;i++)
			serviceCost.put(services[i],eachCost[i]);
	}
	
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String[] getServices() {
		return services;
	}
	public void setServices(String[] services) {
		this.services = services;
	}

	public Map<String, Integer> getServiceCost() {
		return serviceCost;
	}

	public void setServiceCost(Map<String, Integer> serviceCost) {
		this.serviceCost = serviceCost;
	}
	
	
	
}
