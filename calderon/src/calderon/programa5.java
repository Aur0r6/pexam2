package calderon;
import java.util.Scanner;
public class programa5 {
    public static void main(String[] args) {
   Scanner Leer=new Scanner(System.in);
    int p;
    int [] num =new int[10];
    for(p=0;p<=9;p++)
    {
      System.out.print("Ingresa un valor:");
      num[p]=Leer.nextInt();
    }
    for(p=9;p<=0;p--)
    {
       System.out.print("visualiza:"+num[p]); 
    }
}
}