package com.data;

public class demoString {

	
	private String name;
    private int age;
    public demoString(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demoString d=new demoString("pradeep", 30);
		System.out.println(d.toString());

		String message="Personal details:"+d;
		System.out.println(message);
	}

}
