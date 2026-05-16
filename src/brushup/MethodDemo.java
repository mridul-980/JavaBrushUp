package brushup;

public class MethodDemo {
    public static void main (String[] args){

        MethodDemo m1 = new MethodDemo();
        m1.getMyName();
        String role = m1.getMyRole();
        System.out.println(role);

    }
    public  void getMyName(){
        System.out.println("Mridul Tripathi");
    }
    public String getMyRole(){
        return "Automation Engineer";
    }
}
