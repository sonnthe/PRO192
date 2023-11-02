/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class MyString implements IString {

    @Override
    public int f1(String str) {
      int sum=0;
        String st[]=str.split(" ");
        for(String word:st){
         if(st.length>=2&&!ispalindrome(word))
             sum+=word.length(); }  
         return sum;
    }
    public  static boolean ispalindrome(String s ){
      StringBuilder str  =new StringBuilder(s); 
      return str.equals(str.reverse());
          }   
             
                   
   
                 
    

    @Override
    public String f2(String str) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
