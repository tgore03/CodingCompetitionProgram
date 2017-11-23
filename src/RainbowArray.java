
import java.util.Scanner;
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tgore03
 */
public class RainbowArray {
    
    static int t; //No of test cases
    static int n; //No of elements in the array
    static int middle; //Middle position of number
    static Scanner sc;
    static int prev_no;
    static int count_of_prev;
    
    public static void main(String args[]){
        sc = new Scanner(System.in);
        RainbowArray ra = new RainbowArray();
        try{
            t = sc.nextInt(); //Read Input
            }catch(Exception e){
            System.exit(0);
        }
            
        //Check the satisfying conditions
        if(t <0 || t>100){
            System.out.println("false");
            System.exit(0);
        }
            
        for(int i=1; i<=t; i++){
            try{
                n = sc.nextInt(); //Read no of elements in the array
            } catch(Exception e){
                System.out.println("");
                System.out.println("false");
                continue;
            }
            
            //Check the satisfying condition
            if(n<6 || n>100){
                System.out.println("false");
                continue;
            }

            //Calculate the middle index
            if(n%2 == 0)
                middle = n/2;
            else
                middle = (n/2)+ 1;

            boolean result = ra.rainbowArray(n, middle);
            System.out.println(result);
        }
    }
    
    
    public boolean rainbowArray(int n, int middle){
        Stack s = new Stack();
        int no = 0;//Input Number

        try{
            //Store the first half elements in stack 
            for(int j=1;j<=middle;j++){
                //Read the number
                try{
                    no = sc.nextInt();

                    //Check constraint
                    if(no <1 || no >10){
                       System.out.println("1"); 
                       return false;
                    }
                } catch(Exception e){
                    System.out.println("2");
                    return false;
                }
                
                if(s.empty() || no == (int)s.peek() || no == (int)s.peek()+1){
                    s.push(new Integer(no));
                } else{
                    System.out.println("3");
                    return false;
                }
            }
            
            //If n is odd pop off the top of the stack.
            if(n%2 == 1){
                s.pop();
            }
            
            //Remove the elements from the stack
            for(int j = middle+1;j<=n;j++){
                //Read the number
                try{
                    no = sc.nextInt();

                    //Check constraint
                    if(no <1 || no >10){
                        System.out.println("4");
                       return false;
                    }
                } catch(Exception e){
                    System.out.println("5");
                    return false;
                }
                
                int top = (int)s.peek();
                if(no == top)
                    s.pop();
                else {
                    System.out.println("6");
                    return false;
                }
            }
                        
            if(s.empty()){
                System.out.println("7");
                return true;
            }
            else{
                System.out.println("8");
                return false;
            }
        }catch(Exception e){
            System.out.println("9");
            return false;
        }
    } 
}
