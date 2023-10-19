package test;

import model.*;
import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		/*Person[] pList = {
				new Student ("Jhonny", "Silverhand", 18, "5E"),
				new Person ("Giutarro","Ferraro", 18),
				new Student ("Vincent", "Fazzone", 105, "1A"),
				new Person ("Simux", "Exposito", 18)
		};*/
		
		ArrayList<Object> pList = new ArrayList<Object>();
		pList.add(new Student ("Jhonny", "Silverhand", 18, "5E"));
		pList.add(new Person ("Giutarro","Ferraro", 18));
		pList.add(new Student ("Vincent", "Fazzone", 105, "1A"));
		pList.add(new Person ("Simux", "Exposito", 18));
		
		/*for (int i = 0;i < pList.length;i++) {
			System.out.println(pList[i].toString());
		}*/		
		for(Object p: pList) {
			System.out.println(p.toString());
		}
	}
}