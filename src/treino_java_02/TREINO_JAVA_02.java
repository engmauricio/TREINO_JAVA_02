/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treino_java_02;

import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author EngMauricio
 */
public class TREINO_JAVA_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        
        System.out.printf(" digite o numero ");
            
            Scanner Ler_int = new Scanner(System.in);
        
                n = Ler_int.nextInt();
                
                    if(n%2==0){
                        
                        System.out.println(" o numero eh par ");
                    }else{
        
                        System.out.println(" NAO par ");
        
    }
    
}
}
