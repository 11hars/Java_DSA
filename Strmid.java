// String Middle Element Modification
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String ui = obj.next();
        int n=ui.length(); 
        if(n==1){
            System.out.print("*");
        }
        else if(n%2==0){
        for(int i=0;i<(n/2)-1;i++){
        System.out.print(ui.charAt(i));}
        System.out.print("**");
        for(int j=(n/2)+1;j<n;j++){
        System.out.print(ui.charAt(j));}
        }
        else{
        for(int i=0;i<(n/2);i++){
        System.out.print(ui.charAt(i));}
        System.out.print("*");
        for(int j=(n/2)+1;j<n;j++){
        System.out.print(ui.charAt(j));}
        }
       
    }
}