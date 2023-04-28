//Checked exception (IOException, ClassNotFoundException,
package com.java.exceptionHandling.TryCatch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CheckedExceptionEx {
    public static void main(String[] args) {

        //IOExceptoin
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter your name : ");
            String name=br.readLine();
            System.out.println("Name is : "+name);
        }
        catch (IOException ioe){
            System.out.println(ioe);
        }

        //classNotFoundException
        try {
            Class.forName("Child");
        }
        catch (ClassNotFoundException cnfe){
            System.out.println(cnfe.getMessage()+" class not found!!!");
        }

    }
}
