class pg14{
public static void main(String ar[]){
int[] a={8,9,9,98};
try{
int at=50/0;

}

catch(ArithmeticException e) {

System.out.println(e);

}
try{
System.out.println(a[8]);

}

catch(ArrayIndexOutOfBoundsException e) {

System.out.println(e);

}






}


}
