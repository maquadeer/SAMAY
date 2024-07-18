
package mergesort;

public class MergeSort {
 
    int arr[] = {11, 22, 5, 7, 88, 99, 100};
    int n=6;
    
    void mergesort(int l, int h){
        
        if(l<h){
            int m=(l+h)/2;
            mergesort(l,m);
            mergesort(m+1,h);
            merge(l,m,h);
        }
    }
    
    void merge(int l,int m,int h){
        
        int b[]=new int[10];
        int i=l,j=m+1,k=l;
        
        while( ( i<=m) && ( j<=h)){
            if( arr[i] > arr[j]){
                b[k++]=arr[j++];
            }
            else{
                b[k++]=arr[i++];
            }
        }
        
        while(i<=m){
            b[k++]=arr[i++];
        }
        
        while(j<=h){
            b[k++]=arr[j++];
        }
        
        for(int p=l; p <= h; p++){
            arr[p]=b[p];
        }
    }
    
    void display(){
        
        for(int i = 0; i < n; i++)
            System.out.println(" \t"+arr[i]);
        
    }
    
    public static void main(String[] args) {

        MergeSort m = new MergeSort();
        m.mergesort(0,5);
        m.display();
    }
    
}