public class BmiService {
    public int calculate(double a, int b) {
        double bimi;
        bimi = b / ( a * a );
        return (int)bimi;
    }
}
