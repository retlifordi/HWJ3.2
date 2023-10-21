public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.83;
        int wt = 65;
        int bmi = service.calculate(height, wt); // получилось 19
        System.out.println(bmi);
    }
}