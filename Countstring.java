// Count String Occurrences
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence=sc.nextLine();
        String S=sc.nextLine();
        int count=0,index=0;
        while((index=sentence.indexOf(S, index))!=-1)
        {
            count++;
            index=index+S.length();
    }
    if(count==0)
    {
        System.out.println("-1");
    }
    else
    {
        System.out.println(count);
    }
}
}
