public class BmiService {
    public int calculate(double hight, int wt) {
        double bimi;
        bimi = wt / (hight * hight);
        return (int) bimi;
    }
}
