package com.corejava.test;

public class ReportCard {
	
	private int score;
	
	public ReportCard(){
		
		this.score = (int)((Math.random()*101)+1);
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}
