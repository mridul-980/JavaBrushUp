package brushup;

public class conditional {
    public static void main(RahulS[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,12,14,15,17,18,19,20};
        for (int i=0; i<arr.length; i++){
            if (arr[i] % 2 == 0){
                System.out.println(arr[i]+  " is even");
            }
            else {
                System.out.println(arr[i] + " is not even");
            }
        }
    }
}
