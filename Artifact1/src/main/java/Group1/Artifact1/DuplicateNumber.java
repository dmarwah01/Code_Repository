package Group1.Artifact1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DuplicateNumber {
	 
    public int findDuplicateNumber(List<Integer> numbers){
         
        int highestNumber = numbers.size() - 1;
        System.out.println(highestNumber);
        int total = getSum(numbers);
        int duplicate = total - (highestNumber*(highestNumber+1)/2);
        return duplicate;
    }
     
    public int getSum(List<Integer> numbers){
         
        int sum = 0;
        for(int num:numbers){
            sum += num;
        }
        return sum;
    }
     
    public static void main(String a[]){
    	Scanner sc = new Scanner(System.in);
    	int x = sc.nextInt();
    	int y = sc.nextInt();
        List<Integer> numbers = new ArrayList<Integer>();
        for(int i=1;i<x;i++){
            numbers.add(i);
        }
        //add duplicate number into the list
        numbers.add(y);
        DuplicateNumber dn = new DuplicateNumber();
        System.out.println("Duplicate Number: "+dn.findDuplicateNumber(numbers));
    }
}
