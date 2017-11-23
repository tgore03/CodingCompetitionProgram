
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tgore03
 */


 
/**
 * 
 * The string contains one or more words.
 * Each word in the string is "buffalo".
 * Each pair of consecutive words is separated by exactly one space.
 * There are no spaces at the beginning of the string.
 * There are no spaces at the end of the string.

 * @author tgore03
 */

public class BuffaloBuffalo {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        BuffaloBuffalo bb = new BuffaloBuffalo();
        System.out.println(bb.check(str));
    }
    
    public String check(String str){
        
        String not= "Not good";
        
        //Check str length
        if(str.length() == 0 || str.length()>1000)
            return not;
        
        //Check if str ends with space
        if(str.endsWith(" "))
            return not;
        
        //Convrt to string array
        String[] stra = str.split(" ");
        
        for(int i=0;i<stra.length;i++){
            if(!stra[i].contentEquals("Buffalo") && !stra[i].contentEquals("buffalo"))
                return not;
        }
        
        return "Good";
    }
}
