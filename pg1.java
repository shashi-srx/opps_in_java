import java.util.*;
abstract class academics
{
String name;
int empid;
abstract void workhour();
int lab(){
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
return t;
}
int theory(){
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
return t;}
}

class faculty extends academics{
int wh;

void workhour(){
wh=lab()+theory();
System.out.println("workhour="+wh);
}
}
class programmer extends academics{
int wh;
void workhour(){
wh=lab();
System.out.println("workhour="+wh);
}
}
class pg1{
public static void main(String ar[])
{
programmer p=new programmer();
faculty f=new faculty();
p.workhour();
f.workhour();


}


}


