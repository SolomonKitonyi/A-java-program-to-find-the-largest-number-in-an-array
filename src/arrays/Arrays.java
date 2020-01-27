/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author solomon
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int MyArrays[]={10,2,233,8000,12,34,56,78,98,3,4,15,45,109,1223,34,56,12000,3000,8,34,56,78};
        
        int max=MyArrays[0];
        for(int i=MyArrays[1];i<MyArrays.length;i++){
            if(MyArrays[i]>max){
               max=MyArrays[i];
            }

        }
     System.out.println(max);         
    }
    
        
    }


