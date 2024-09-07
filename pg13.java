interface motor {
String capacity="8kg";
void run();
void consume();

}
class washingmachine implements motor{

public void run(){
System.out.println("Run 1 hrs");

}
public void consume(){
System.out.println("Consuems 1KWs");}

}
class pg13{
public static void main(String ar[]){
washingmachine w=new washingmachine();
w.run();
w.consume();
System.out.println("Capacity="+w.capacity);
}

}
