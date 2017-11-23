
import java.util.Scanner;
public class VillageTribe {
    public static void main (String args[]){
     
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        
        String[] str = new String[T];  
        
        VillageTribe tribe = new VillageTribe();
        for(int i=0; i<T; i++){
            str[i] = sc.nextLine();
            tribe.getAB(str[i]);
        }
    }
    
    public void getAB(String str){
        int A = 0, B = 0;
        boolean expectA = false, expectB = false;
        int gap=0;
        
        String[] stra = str.split("");
        for(int i = 0; i<stra.length; i++){
            
            if(stra[i].contentEquals("A")){
                if(expectA){
                    A++;
                    A+=gap;
                    gap=0;
                } else if(expectB){
                    expectB = false;
                    expectA = true;
                    gap=0;
                    A++;
                } else {
                    expectA = true;
                    A++;
                    gap = 0;
                }
                
            }else if(stra[i].contentEquals("B")){
                if(expectB){
                    B++;
                    B+=gap;
                    gap=0;
                } else if(expectA){
                    expectA=false;
                    expectB=true;
                    gap=0;
                    B++;
                } else {
                    expectB=true;
                    B++;
                    gap=0;
                }
                
            } else {
                gap++;
            }
        }
        
        System.out.println(A + " " + B);
    }
}
