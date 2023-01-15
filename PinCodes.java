/*
 * Cody Webster
 * 1/13/2022
 * You’re are given a list of pin codes that can be between 3 - 10 numbers.  A PIN code

* is considered a duplicate of another PIN code if it is in the same or reversed order.

*  Example:

*     123 is a duplicate of 123

*     123 is a duplicate of 321

*     123 is not a duplicate of 213 or 312, etc

* 

* Given pin codes 123,213,321, there are a total of 2 distinct pin codes, 123 and 213

* 

* Write a function that will return the count of distinct PIN codes

* 

* The ideal time complexity for a solution is O(n) 

*

* public int solve(String[] codes);
 * 
 * 
 */



public class PinCodes {
    /**
   * Prints out the number of distinct codes in the array
   * @param args A string array containing the given codes
   * @exception Any exception
   * @return No return value.
   */
    public static void main(String[]args){
        //String codes[] = new String[10];
        String[] codes = {"123","213","321"};

        Help x = new Help(); //  setup a seperate object since solve is non-static
        int value  = x.solve(codes);
      
        System.out.println("The number of distinct values in the given array is: " + value);
        
    }//end main
    
    


}//end class

class Help{
    /**
   * returns the # of dist
   * @param codes A string array containing the codes from main
   * @exception Any exception
   * @return # of distinct codes.
   */
    public int solve(String[] codes){
        String temp; //used for comparison
        //int inc = 0;
        int counter = 0;
        int duplicate = 0;
        temp = codes[0]; // 123
        
        String reverseCode = reversed(temp);
        
        
        for(int i=0;i<codes.length;i++){
            //if the values are different sizes 123 && 1234 they are automatically distint
            if(temp.length()==codes[i].length()){
                if(temp != (codes[i])){
                counter++;
            }
                if(reverseCode==(codes[i])){ //count the number of duplicates in the list so u can later subtract from total number
                duplicate++;
                }


            }
            else{
                counter++;
            }
            

            }//end loop
        
        return counter;
    }
    /**
   * returns the reversed string
   * @param code individual strings to be reveresed 
   * @exception Any exception
   * @return the reveresed value 123 -> 321
   */
    public String reversed(String code){
        String reverse = "";
        for(int i = code.length()-1; i>=0; i--){
            reverse = reverse + code.charAt(i); 
        }
        return reverse;
    }

    

}//end Helper
