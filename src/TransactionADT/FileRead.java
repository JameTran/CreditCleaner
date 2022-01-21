package TransactionADT;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class FileRead {
	public static void main(String args[]) throws FileNotFoundException{
		
		Transaction[] Transactions = transactionFile.readFile();
		/**
		int length = Transactions.length - 1;
		QuickSort.sort(Transactions, "a", 1);
		BinarySearch.binarySearch(Transactions, 149.62, "a");
		QuickSort.sort(Transactions, "d", 1);
		BinarySearch.binarySearch(Transactions, 61796, "d");
		**/
		
		//System.out.println("Dog");
		Digraph G = new Digraph(10000);
		//Transaction[] Transactions = transactionFile.readFile();
		
		//make hash table 
		HashMap<Integer, String> map = new HashMap<>(); 
		//System.out.println(G.E());
       // System.out.println(map); 
        int counter=0;
		for(int i=0;i<Transactions.length;i++) {
			if (((Transactions[i]).getFraud())==1) {
				map.put(counter,(Transactions[i].getEncrypted())[20]);  //hash the the customer ID
				map.put(counter+1,(Transactions[i].getEncrypted())[22]); //hash the merchant ID
				G.addEdge(counter,counter+1); //add an edge between the customer and merchant
				counter=counter+2;
			}
		
		
	}
		System.out.println(G.E());
	}
	}
	
