package Practice;

public class sum_of_first_n_terms {
    public static void main(String[] args) {
        System.out.println(sumOfSeries(5));
    }
    static long sumOfSeries(long n){
        int sum = 0;
        for (int i=0; i<=n; i++){
            sum = sum + (i*i*i);
        }
        return sum;
    }
}
