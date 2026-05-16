package brushup;

public class Ex1 {
    public static void main(RahulS[] args) {
        double[] num = {1,2,3,4,5};
        System.out.println("First number: " + num[0]);
        System.out.println("Last number: " + num[num.length-1]);

        //Reverse
        System.out.println("Reverse the Array");
        for (int i = num.length -1 ; i >= 0; i--) {
            System.out.println(num[i]);
        }
        System.out.println("------------");
        System.out.println("Total numbers in Array "+ num.length);

    }
}
