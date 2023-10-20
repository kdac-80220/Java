package com.shivshankar.assignment12q1;

public class Labour implements Emp{
	int hours;
	double rate;
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public Labour(int hours, double rate) {
		this.hours = hours;
		this.rate = rate;
	}
	@Override
	public double getSal() {
		return this.hours*this.rate;
	}
	
	@Override
	public double calcIncentives() {
		
		return this.hours>300?this.getSal()*0.05:0.0;
	}
	
}
