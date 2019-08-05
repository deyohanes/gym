/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gyma;
public class ex extends Exception{
    ex(String s){
        super(s);}
    }
    
 class cusex{
     static void validate(int num) throws ex{
         if(num>10)
             throw new ex("Phone number too long");
         else
             System.out.println("cool");
     }
    public static void main(String[] args) throws ex {
        int x =100000000;
        try
        {
            validate(x);
            
        } catch (Exception e) {
        }
    }}
             
       
 
/*
}  
class TestCustomException1{  
  
   static void validate(int age)throws InvalidAgeException{  
     if(age<0)  
      throw new InvalidAgeException("not valid");  
     else  
      System.out.println("welcome to vote");  
   }  
     
   public static void main(String args[]){  
      try{  
      validate(-1);  
      }catch(Exception m){System.out.println("Exception occured: "+m);}  
  
      System.out.println("rest of the code...");  
  }  
}  */

    

