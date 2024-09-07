import java.util.*;
abstract class student {
int rollno,regno;
abstract void course(); 
}
class kiitians extends student{
void course ()
{
System.out.println("Rollno="+rollno+" Registration no="+regno+" Course= CSE");

}


}
class pg11{
public static void main(String ar[])
{
kiitians k=new kiitians();
k.rollno=21051682;
k.regno=2109773933;
k.course();


}



}
