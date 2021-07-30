import java.util.Scanner;
 
public class Sort {
 
    public static void main(String[] args) {
        //Create Object for Scanner class to get input from keyword
        Scanner scn = new Scanner(System.in);
         
        System.out.print("Enter number of element count: ");
        //Set array size
        int inputValue = scn.nextInt(), temp;   
         
        //Get input from keyword
        System.out.print("Enter array values\n");
        int[] arr = new int[inputValue];    
         
        //Get all input from keyword
        for(int i =0; i<inputValue;i++){             
            arr[i]=scn.nextInt();
        }
         
        //Validate the element for ascending sort order
        for(int m=0;m<arr.length;m++){
            for(int n=m+1;n<arr.length;n++){
                if(arr[m]>arr[n]){
                    temp = arr[m];
                    arr[m]=arr[n];
                    arr[n]=temp;
                }
            }
        }
         
        //Display the sorted order  
        System.out.print("Sorted order are: \n");
        for(int t: arr){
            System.out.println(t);
        }       
    }
}
