/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diebus.cryptography;

import java.util.*;
/**
 *
 * @author Lloyd
 */
public class DiebusCryptography {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Message : ");
        String text = input.nextLine();
        System.out.println("Encrypt : " + Encrypt(text));
        System.out.println("Decrypt : " + Decrypt(Encrypt(text)));
    }
    
    public static String Encrypt(String message)
    {
        String code = "";
        int start = 1;
        for(int x = 0; x < message.length(); x++)
        {
            int letter = (int)message.charAt(x) + start;
            code += (char)letter;
            start++;
            if(start > 7)
                start = 1;
        
        }
        return code;
    }
    
    public static String Decrypt(String code)
    {
        String message = "";
        int start = 1;
        for(int x = 0; x < code.length(); x++)
        {
            int letter = (int)code.charAt(x) - start;
            message += (char)letter;
            start++;
            if(start > 7)
                start = 1;
        
        }
        return message;
    }
    
}
