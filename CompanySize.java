/*
 * Cody Webster
 * 1/11/2022
 * A company has a hierarchical structure where a manager can manage at most 8 employees.  All employees have exactly 1 manager
* except for the top level manager whom does not have a manager.
* Write a function to calculate the maximum number of employees possible at the company for a given number of management levels n.
* Solve recursively or iteratively using no built in math power libraries.
 */


import java.util.Scanner;

public class CompanySize {
    /**
   * returns the # of dist
   * @param args A string array containing the codes from main
   * @exception Any exception
   * @return # of distinct codes.
   */
    public static void main(String[]args){
    int n,result;

    Scanner input = new Scanner(System.in);
    System.out.println("Please enter the number of mangement levels");
     n = input.nextInt();

    result = solve(n);
    
    System.out.println("The number of mangement levels: " + n);
    System.out.println("The number employees: " + result);
    input.close();
}//end of main

public static int solve(int n){
    int employees = 8;
    int total = 1;
    int temp = 0;

   if(n==0){
    return 1;
   }
   else{
    for(int i = 0;i < n; i++){
        total = total * employees;
        temp = temp + total;
    }
        temp = temp + 1;
    
    return temp;
    
   }
}

}
