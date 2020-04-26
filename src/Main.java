import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
          while(sc.hasNext()){

        String str = sc.nextLine();
        String[] str1 = str.split(" ");
        System.out.println(str1[str1.length-1].length());
           }
    }
}
