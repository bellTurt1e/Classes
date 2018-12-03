package ch2;

import javax.swing.JOptionPane;

public class PI {
public String gender;
private String sexuality;
public String name;
public int age;
public double height;
public String avg;
public int date;
private String sex;
	
	public PI(){
		String gende = JOptionPane.showInputDialog("Are you Male or Female?");
		gende = gender;
		sexuality = JOptionPane.showInputDialog("Are you HeteroSexual or Gay");
		String sex = new String();
		sex = sexuality;
		String ae = JOptionPane.showInputDialog("How old are you?");
		int a = Integer.parseInt(ae);
		a = age;
		String h = JOptionPane.showInputDialog("How tall are you? Please round to the nearest tenth.");
		int he = Integer.parseInt(h);
		he = (int) height;
		date = 2018 - age;

if(gender == "male") {
 System.out.println("So your a Boy good to know.");
 System.out.println(sex);
}
else {
	System.out.println("So your a girl good to know.");
	System.out.println(sex);
}
	if(sexuality.equals("HeteroSexual")) {
		System.out.println("So your straight alrigty.");
	System.out.println(a);
	}
	else {
		System.out.println("So your gay alrighty.");
		System.out.println(a);
	}
	
		if(age >= 18) {
			System.out.println("You can vote! Your profile will be registed");
		}
		else {
			 int toast = age - 18;
			 age = toast;
			System.out.println("You can't vote ;( well you have "+age+ " until you can vote."); 
			 
		}
		if (height >5.3) {
			System.out.println("Your short! Its okay thought.");
			avg = "Short";
			
		}
		else {
			System.out.println("Your either average or tall.");
			avg = "Average or Tall";
		}
		 
	}
		public String toString() {
		String out = new String();
			out = "Your Profile: "+"\n"+ "Sex: "+ gender +"\n"+"Sexuality: "+ sex + "\n" + "Age: "+ age+ "\n"+ "Date of birth: "+date+"\n"+"Height: "+ avg;
			
			return out;
		}
	
		
	}
	
	


