import java.util.ArrayList;

/**
 * fuckz
 */
public class fuckz {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        arr.add(12);
        // int[] arr1 = {1,2,3,4,5,6,7,8,9,10,11,12};
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        for(int i =1;i<13;i++){
            arr1.add(i);
        }
        
        System.out.println(arr1);
        for(Integer i  : arr){
            
            if(arr1.contains(i)){
                arr1.remove(i);
            }

        }
        System.out.println(arr1);
    }
}