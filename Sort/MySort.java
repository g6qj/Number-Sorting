
/**
 * Write a description of class MySort here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


import java.util.ArrayList;
import java.util.Math;
public class MySort{
    ArrayList<Double> List;
    public MySort(){
        List.addAll(RandomArray(10000)); //This adds 10,000 random numbers to your list
    }
    public MySort(){
        List = new ArrayList<Double>();
        List.add(1.7);
        List.add(7.7);
        List.add(6.5);
        List.add(8.7);
        List.add(2.5);
        List.add(9.6);
        List.add(6.2);
        List.add(3.3);
        List.add(4.5);
        List.add(1.2);
        List.add(8.3);
        List.add(5.5);
        
        
        for(int i = 0; i < List.size(); i++){
            if (){
                
            }
            else{
                
            }
        }
        
        System.out.println(List);
     }
    private static ArrayList<Double> RandomArray(int n){
        /**This method creates n random numbers between 0 (inclusive) and 100 (exclusive).
         * 
         */
        ArrayList<Double> arrayRandom = new ArrayList<Double>(n);
        for (int i=0; i<n; i++)
        {
            arrayRandom.add(Math.random()*100);
        }
        return arrayRandom;
    }

}
