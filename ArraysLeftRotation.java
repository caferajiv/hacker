
public class ArraysLeftRotation
{
    
    public static void main (String[] args)
    {
        int[] arr = {1,2,3,4,5};
        
        int[] arr2 = new int[arr.length];
        int k = 4;
        rotateArrayLeft(arr,arr2, k);
        
        for(int i : arr2){
            System.out.print(i+ " ");
        }
    }

    private static void rotateArrayLeft (int[] arr,int[] arr2, int k)
    {
        int size = arr.length;
        int currentIndex = 0;
        int newIndex = 0;
        
        while(currentIndex<size){
            newIndex = currentIndex - k;
            if(newIndex<0){
                newIndex += size;
            }
            arr2[newIndex] = arr[currentIndex];
            currentIndex++;
        }
        
    }

   

}
