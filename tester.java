import java.util.*;

//prompt the user for nums, then use nums to test mergeLinkedList, movingAverage, and findMax .java

public class tester{public static void main(String[]args){

Scanner scan=new Scanner(System.in);

int p=30;int[]a=new int[p];int[]b=new int[p];int[]c=new int[p];int[]d=new int[p];

System.out.println("Enter a number for p less than thirty");p=scan.nextInt();
System.out.println("Enter a number for each number p times.");for(i=0;i<p;i++){[]d=scan.nextInt();}
System.out.println("Enter 10 numbers for list a");for(i=0;i<p;i++){[]a=scan.nextInt();}
System.out.println("Enter 10 numbers for list b");for(i=0;i<p;i++){[]b=scan.nextInt();}

int[]c=int[]a+int[]b;System.out.println(c);
for(i=0;i<c;i++){if(c[i]<=c[i+1]){c[i+1]=c[i]}System.out.println(c);}

}}