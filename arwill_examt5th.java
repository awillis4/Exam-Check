import java.util.*;import java.io.*;

public class arwill_examt5th{arwill_examt5th(){}
public static Scanner scan=new Scanner(System.in);

public void mergeLinkedList(){

//make 2 lists of nums, merge the list, sort the nums.

int p=1000;

System.out.println("enter the number of values c for list a");int c=scan.nextInt();
System.out.println("enter a value then press space c times");int[]a=new int[c];
for(c=0;c<p;c++){a[c]=scan.nextInt();}

System.out.println("enter the number of values d for list b");int d=scan.nextInt();
System.out.println("enter a value then press space d times");int[]b=new int[d];
for(d=0;d<p;d++){b[d]=scan.nextInt();}

LinkedList ac=new LinkedList(Arrays.asList(a));
LinkedList bd=new LinkedList(Arrays.asList(b));

Iterator it=ac.iterator();Iterator er=bd.iterator();
while(it.hasNext()){System.out.println((String)it.next());}
while(er.hasNext()){System.out.println((String)er.next());}

List newList=new LinkedList();newList.addAll(ac);newList.addAll(bd);
System.out.println(newList);Collections.sort(newList);System.out.println(newList);}

public void findMax(){

 Stack min=new Stack(); Stack max=new Stack();

 push(int val){
    if(val<=min()){min.push(val);}
    if(val>max()){max.push(val);}
    super.push(val);}

public Integer pop(){int val=super.pop();
if(val==min()){min.pop();}
if(val==max()){max.pop();}
return val;}

public int min(){
    if(min.isEmpty()){return Integer.MAX_VALUE;}
    else{return min.peek();}}

public int max(){
    if(max.isEmpty()){return Integer.MIN_VALUE;}
    else{return max.peek();}} 

    Stack<Integer>s=new Stack<Integer>();
    System.out.println("enter an int for the size of the que.");
    int n=scan.nextInt();int c;int x,e=0;
    System.out.println("now enter the values of the que,");
    while(n-->0){c=scan.nextInt();
    if(c==1){x=scan.nextInt();if(s.isEmpty()){s.push(x);}
    else{int y=s.peek();s.push(Math.max(x, y));}}
    if(c==2){if(!s.isEmpty()){s.pop();}
    if(c==3){System.out.println(s.peek());}}} }
    
    public void movingAverage(){

private final Queue<Float>window=new LinkedList<Float>();
private int period;private float sum;

public movingAverage(int period){this.period=period;}
public void newNum(float num){sum+=num;window.add(num);
if(window.size()>period){sum-=window.remove();}}
public float getAvg(){if(window.isEmpty()){return sum/window.size();}return 0;}


int p=30;int q=0;int r=0;float[]data=new float[p];int[]winsize=new int[p];

System.out.println("Enter number datapoints, enter, window sizes, enter.");
q=scan.nextInt();r=scan.nextInt();

System.out.println("enter each data point then press enter now.");
for(p=0;p<q;p++){data[p]=scan.nextFloat();}
System.out.println("now enter the window sizes.");
for(p=0;p<r;p++){winsize[p]=scan.nextInt();}

for(int winsiz:winsize){movingAverage mama=new movingAverage(winsiz);
for(float x:data){mama.newNum(x);System.out.println("nexnum= "+x+", SMA= "+mama.getAvg());}        
System.out.println();}}

public static void main(String[]args)throws IOException{arwill_examt5th t= new arwill_examt5th();
t.mergeLinkedList();t.findMax();t.movingAverage();}}