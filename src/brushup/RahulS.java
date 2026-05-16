package brushup;

public class RahulS {
    public static void main(String[] args) {


        String s = "Mridul Tripathi Automation";
        String[] splittedString = s.split(" ");
        System.out.println(splittedString[0]);
        System.out.println(splittedString[1]);
        System.out.println(splittedString[2]);

        String[] split = s.split("Tripathi");
        System.out.println(split[1]);
        System.out.println(split[1].trim());

        // Printing each character of string
//        for (int i =0 ; i< s.length() ; i++){
//            System.out.println(s.charAt(i));
//        }


        // printing in reverse
        for (int i = s.length() -1; i>=0 ; i--){
            System.out.println(s.charAt(i));
        }




    }
}
