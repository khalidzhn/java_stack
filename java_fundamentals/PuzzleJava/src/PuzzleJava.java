import java.util.ArrayList;
public class PuzzleJava {
    public ArrayList PuzzleJava() {
        int[] arr = {3, 5, 1, 2, 7, 9, 8, 13, 25, 32};
        ArrayList <Integer> arr1= new ArrayList<Integer>();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            if(10<arr[i]){
              arr1.add(arr[i]);
            }
        }
        System.out.println(sum);
        return arr1;
    }
}
