/*
 * Cody Webster
 * 1/12/2022
 * LongestWord: a function to find the longest compound word in a list that is made up of other words in that same list.
* Solve with a custom built data structure, no 3rd party libraries.
 */

public class LongestWord {
    /**
   * returns the # of dist
   * @param args A string array containing words
   * @exception Any exception
   * @return the longest word in a array.
   */
   
    public static void main(String[]args){
        String[] words = {"mouse", "state", "road", "cat", "catch", "building", "catcher", "chase", "dog", "when","tunnel","dogcatcher"};
    
        Helper x = new Helper(); //  setup a seperate object since solve is non-static
        String longestWord = x.solve(words);
        
        System.out.println("The longest word in the array is: " + longestWord);

    }//end main

    
    }//end class


class Helper{
      /**
   * returns the # of dist
   * @param array A string array containing words
   * @exception Any exception
   * @return the longest word in a array.
   */

    int indexTracker;
    public String solve(String[]array){
        int SIZE = array.length;
        
        String temp;
        int max = 0;
        int newmax = 0;;

        for(int i = 0; i < SIZE; i++){
            temp = array[i];
            max = length(temp);

            if(max > newmax){
                newmax = max;
                indexTracker = i;
            }
        }
        temp = array[indexTracker];

        return temp;
}//end solve
      /**
   * returns the # of dist
   * @param test a individual string from the array 
   * @exception Any exception
   * @return the size of the given string
   */
    public int length(String test){
        int count = 0;
        String word = test;
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) != ' '){
                count++;  
            }  
                
        }
        return count;
       
        
    }
}//end Helper





