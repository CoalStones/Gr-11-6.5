package ch6ex5;
import java.util.Scanner;

public class Ch6Ex5 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String uin;
        
        System.out.println("Enter a positive number");
            uin=input.nextLine();
                for(int count=0; count<uin.length(); count++){
                    System.out.println(uin.substring(count,count+1));
                }
    }
    
}
