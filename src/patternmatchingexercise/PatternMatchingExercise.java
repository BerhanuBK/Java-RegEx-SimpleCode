
package patternmatchingexercise;

import java.util.regex.*;

public class PatternMatchingExercise {


    public static void main(String[] args) {
        //The text to be searched
        String searchWord="The names of the friends and the name of my child Berhanu Nebaot";
        
        //A text searched in the text above
        String searchPattern=".*Berh.*";
        
        //Defining the pattern object  by compiling the searched word/pattern
        Pattern p=Pattern.compile(searchPattern);
        
        //Defining the object with the 
        Matcher m=p.matcher(searchWord);
        
        boolean b=m.matches();
        if(b==true)
            System.out.println("Found");
        else
            System.out.println("Not found");
        
        
    }
    
}
