/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greedyknapsack1;

/**
 *
 * @author Student
 */
public class GreedyKnapsack1 {

    /**
     * @param args the command line arguments
     */
    void greedks(){
        int i;
        int n=7;
        float profit[]={6, 10, 18, 15, 3, 5, 7};
        float weight[]={1, 2, 4, 5, 1, 3, 7};
        int m=15;
        float x[]={0, 0, 0, 0, 0, 0, 0};
        float U=m;
        for(i=0; i<n; i++){
            if(weight[i]>U){
                break;
            }
            x[i]=1;
            U=U-weight[i];
            
        }
        if(i<=n){
            x[i]=U/weight[i];
            
        }
        float total=0;
        for(i=0; i<n;i++){
            System.out.println("Quantities of object"+(i+1)+":"+x[i]);
        }
        System.out.println("");
        for(i=0;i<n;i++){
            System.out.println("Profit of object"+(i+1)+":"+x[i]+"*"+profit[i]+"="+(profit[i]*x[i]));
            total=total+(profit[i]*x[i]);
        }
        System.out.println("Final Profit:"+total);
        
        }
    
    public static void main(String[] args) {
        // TODO code application logic here
   GreedyKnapsack1 G=new GreedyKnapsack1();
   G.greedks();
    }
    
}
