public class BmiService {
    public int calculate(double height, int weight) {
        double bimi = weight / (height * height);
        return (int) bimi;
    }
}
