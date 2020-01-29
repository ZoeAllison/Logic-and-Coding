public class myBubbleSort{
    
    public static void swap(int[]A, int i, int j){
        int temp=A[i];
        A[i]=A[j];
        A[j]=temp;
    }
    
    public static void bubbleSort(int[]A){
        for(int i=0; i<A.length-1; i++){
            for(int j=0; j<A.length-1-i; j++){
                if(A[j]>A[j+1]){
                    swap(A, j, j+1);
                }
            }
        }
    }
    
    public static void main(String [] args){
        int[] myArray={8,2,5,9,3,1,4,6,7};
        bubbleSort(myArray);
        System.out.println(java.util.Arrays.toString(myArray));
    }
}