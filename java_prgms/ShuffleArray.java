import java.util.Random;
public class ShuffleArray {
    public static void main(String args[]) {
        Integer[] array = {1,2,3,4,5,7};
        Random r = new Random();
        for (int i= array.length-1;i>0;i--) 
           {
            int j = r.nextInt(i+1);
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
           }
        for (int element:array)
           {
            System.out.print(element + " ");
           }
    }
}
