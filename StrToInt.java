/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copart.pkg2017.spring;

/**
 * git 
 * @author Ashwin
 */
public class StrToInt {
    public static void main(String args[]) {
        String str = "-1234";
        int n = stringToInteger(str);
        System.out.println(n);
    }
    
    // Function to convert String to Integer
    public static int stringToInteger(String s) {
        //Take care of the first bit of number, which can be a sign {-.+}
        char sig = s.charAt(0);
        //Initialize Accumulator and Step factor for convert every integer bit of the string
        //to the actual number
        int acc=0,step=1;
        //System.out.println(sig);
        
        //Handle cases for + sign, - sign and no sign.
        switch(sig){
            case '-':
                s = s.substring(1,s.length());
                //System.out.println(s+"\n");
                for(int i=s.length()-1;i>=0;i--){
                    acc = acc + (s.charAt(i) - '0')*step;
                    step = step * 10;
                }
                return -acc;
            case '+':
                
                s = s.substring( 1, s.length());
                for(int i=s.length()-1;i>=0;i--){
                    acc = acc + (s.charAt(i) - '0')*step;
                    step = step * 10;
                }
                return acc;
            default :
                for(int i=s.length()-1;i>=0;i--){
                    acc = acc + (s.charAt(i) - '0')*step;
                    step = step * 10;
                }
                return acc;
        }
    }
}