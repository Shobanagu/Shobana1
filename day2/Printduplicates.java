package week1.day2;
import java.util.Arrays;

public class Printduplicates {
	
	public static void main (String[] args) {
		int NUM[] = {2,5,7,7,5,9,2,3 };
		Arrays.sort(NUM);
       for (int i=0; i< NUM.length-1;i++)
       {
    	   int j = i+1;
    	   if (NUM[i] == NUM [j])
    	   { 
    		   System.out.println("Duplicate numbers are: "+NUM[i]);
       }
	}

}
}