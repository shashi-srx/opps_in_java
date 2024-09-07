class MyEx extends Exception{
MyEx(String s){
    super(s);
}
}
public class pg2 {
    static void check(int age) throws MyEx{
        if (age <18) throw new MyEx("below 18 not allowed");
        else System.out.println("Chaliye Shuru karte hai");
    }
     public static void main(String ar[]){
        try{
        int at=50/0;
        }  
        catch(ArithmeticException e) { //unchecked exceptions
        System.out.println(e);
        }
        
        //checked Exception 
        try{
            Class.forName("notDefind");
        }
        
    catch (ClassNotFoundException e){
        System.out.println(e);
    }

    // user defined exceptions 18+ checking
try{
    check(13);
}
catch(MyEx e){
    
System.out.println(e);
}
        
}}
