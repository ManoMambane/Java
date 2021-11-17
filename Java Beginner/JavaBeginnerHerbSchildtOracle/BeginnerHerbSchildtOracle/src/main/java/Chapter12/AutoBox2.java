/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter12;

/**
 *
 * @author MO
 */
public class AutoBox2 {
//   this method has Integer parameter
    static void m(Integer v){
        System.out.println("m() recieved " + v);
    }
    
//    method returns int
    static int m2(){
        return 10;
    }
    
//    method returns Integer
    static Integer m3(){
        return 99; //autoboxing 99 unto Integer
    }
    
    public static void main(String[] args) {
        
        // Pass an int to m().  Because m() has an Integer 
    // parameter, the int value passed is automatically boxed. 
    m(199); 
 
    // Here, iOb recieves the int value returned by m2(). 
    // This value is automatically boxed so that it can be 
    // assigned to iOb. 
    Integer iOb = m2();   
    System.out.println("Return value from m2() is " + iOb);  
 
    // Next, m3() is called. It returns an Integer value 
    // which is auto-unboxed into an int. 
    int i = m3(); 
    System.out.println("Return value from m3() is " + i);  
 
    // Next, Math.sqrt() is called with iOb as an argument. 
    // In this case, iOb is auto-unboxed and its value promoted to 
    // double, which is the type needed by sqrt(). 
    iOb = 100; 
    System.out.println("Square root of iOb is " + Math.sqrt(iOb));
    }
}
