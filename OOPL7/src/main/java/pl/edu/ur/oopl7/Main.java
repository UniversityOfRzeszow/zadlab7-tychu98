/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl7;

/**
 *
 * @author tychu
 */
public class Main {
        public static void main(String[] args) {
            
            Punkt2D a = new Punkt2D();
            a=new Punkt2D(0, 0);
            
            a.setX(a.Random());
            a.setY(a.Random());
                       
            System.out.println(a.toString());
            

            
            Punkt3D b = new Punkt3D();
            b=new Punkt3D(0, 0, 0);
            
            b.setX(b.Random());
            b.setY(b.Random());
            b.setZ(b.Random());
            
            System.out.println(b.toString());
            
            
            
            Punkt2D[] array2D = new Punkt2D[100];
            Punkt3D[] array3D = new Punkt3D[100]; 
            
            
            for (int i=1; i<100 ; i++){
                array2D[i].setX(array2D[i].Random());
                array2D[i].setY(array2D[i].Random());
            }
            
            for (int i=1; i<100 ; i++){
                array3D[i].setX(array2D[i].Random());
                array3D[i].setY(array2D[i].Random());
                array3D[i].setZ(array2D[i].Random());
            }
            
            
            for(int i=0;i<100;i++){
                for (int j=0;j<100;j++){
                     if (array2D[i].getX()==array3D[j].getX() && array2D[i].getY()==array3D[j].getY()){
                    
                         //System.out.println("Punkt A: "+ "X:"+tabA[i].getX() + "Y:"+ tabA[i].getY());
                         //System.out.println("Punkt B: "+ "X:"+tabB[j].getX() + "Y:"+ tabB[j].getY() + "Z:" + tabB[j].getZ());
                         System.out.println("Punkt A: "+array2D[i].toString());
                         System.out.println("Punkt B: "+array3D[j].toString());
                         
                     }
                    
                }
                    
               
            }
     

        }  
        
      
        
    
}
