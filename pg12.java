import java.util.*;
interface bank{
void earning();
void deduction();
void bonus();
}
abstract class manager implements bank{
int basic;
public void earning (){
Scanner sc=new Scanner(System.in);
basic=sc.nextInt();
System.out.println("Earning="+(basic+basic*0.80+basic*0.15));
}
public void deduction (){
System.out.println("deduction="+basic*0.12);

}
}
class staff extends manager{
public void bonus(){

System.out.println("Bonus="+basic*0.5);
}

}
class pg12{
public static void main(String ar[]){
staff s=new staff();
s.earning();
s.deduction();
s.bonus();

}

}
