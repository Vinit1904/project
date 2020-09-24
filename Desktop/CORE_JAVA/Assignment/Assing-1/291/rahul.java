import java.lang.*;
import java.util.*;

interface A{
    void m1();
    void m2();
}

class Myclass implements A{
   public void m1(){
        System.out.println("Method m1");
    }
    
    public void m2(){
        System.out.println("Method m2");
    }
}

class rahul{
    public static void main(String rahul[]){
        Myclass m = new Myclass();
        m.m1();
        m.m2();
    }
} 