public class Employee_UC1 {
    public static void main(String[] args) {
        int isfulltime=1;
        double empcheck=Math.floor(Math.random()*10%2);
        if (empcheck==isfulltime)
            System.out.println("Employee Is Present");
        else
            System.out.println("Employee Is Absent");
    }
}
