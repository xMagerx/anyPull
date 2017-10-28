package hw10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import lessons10.Person;

public class Main {

	public static void main(String[] args) {
		List<Commodity> com = new ArrayList<Commodity>();
		System.out.println("��� �������� �� ������� ��� 䳿 ������ �����: ");
		System.out.println("");
		System.out.println("1) ������ �����.");
		System.out.println("2)�������� �����.");
		System.out.println("3)������� �����.");
		System.out.println("4)������� � ��������� ����� �� ������.");
		System.out.println("5)������� � ��������� ����� �� �����.");
		System.out.println("6)������� � ��������� ����� �� �������.");
		System.out.println("7)����� � ��������.");
		System.out.println("");
		
		com.add(new Commodity("Bear",30,45));
		com.add(new Commodity("milk",15,6));
		com.add(new Commodity("meat",70,30));
		com.add(new Commodity("cheeze",90,40));
		com.add(new Commodity("oil",25,37));
		System.out.println(com);
		boolean col=true;
		
	while(col) {
		Scanner sc = new Scanner(System.in);
//	    System.out.println("Number");
	    int number = sc.nextInt();
	    switch(number) {
	    case 1:{
	    	System.out.println("������ ����� ������: ");
	    	String name = sc.next();
	    	System.out.println("������ ���� ������: ");
	    	int price = sc.nextInt();
	    	System.out.println("������ ������� ������: ");
	    	int amount = sc.nextInt();
	    	com.add(new Commodity(name,price,amount));
	    	System.out.println(com);
	    	break;
	    }
	    case 2:{
	    	System.out.println("������ ����� ������ ��� ���������: ");
	    	Iterator<Commodity> iter =com.iterator();
	    	String name = sc.next();
			while(iter.hasNext()){
				if(iter.next().getName().equals(name)) {
				iter.remove();
				}
			}
	    	System.out.println(com);
	    	break;
	    }
	    case 3:{
	    	System.out.println("������ ����� ������ , ���� ������ �������: ");
	    	Iterator<Commodity> iter =com.iterator();
	    	String name = sc.next();
			while(iter.hasNext()){
				if(iter.next().getName().equals(name)) {
				iter.remove();
				}
			}
			System.out.println("������ ����� ������ ������: ");
	    	String name1 = sc.next();
	    	System.out.println("������ ���� ������ ������: ");
	    	int price = sc.nextInt();
	    	System.out.println("������ ������� ������ ������: ");
	    	int amount = sc.nextInt();
	    	com.add(new Commodity(name1,price,amount));
	    	System.out.println(com);
	    	break;
	    }
	    case 4:{
	    	com.sort(new SortByName());
	    	System.out.println(com);
	    	break;
	    }
	    case 5:{
	    	com.sort(new SortByPrice());
	    	System.out.println(com);
	    	break;
	    }
	    case 6:{
	    	com.sort(new SortByAmount());
	    	System.out.println(com);
	    	break;
	    }
	    
	    case 7:{
	    	col=false;
	    	System.out.println("EXIT");
	    	break;
	    }
	    default :{
	    	System.out.println("������� ���������� �����!!!");
	    	break;
	    }
	    }
		

	    }
	}

}