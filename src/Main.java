public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double hight = 1.83;
        int wt = 65;
        int bmi = service.calculate(hight, wt); // должно получиться 500
        System.out.println(bmi);
    }
}