package com.corejava.test;

public class Student {
	
	private String registartionNum;
	
	public Student(String registrationNum){
		
		this.registartionNum = registrationNum;
		
	}

	public String getRegistartionNum() {
		return registartionNum;
	}

	public void setRegistartionNum(String registartionNum) {
		this.registartionNum = registartionNum;
	}
	
	@Override
	public boolean equals(Object o){
		
		if(o != null && o instanceof Student){
			String registartionNum = ((Student)o).getRegistartionNum();
			if(registartionNum != null && registartionNum.equals(this.getRegistartionNum())){
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode(){
		
		return this.registartionNum.hashCode();
	}

}
