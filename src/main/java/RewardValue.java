public class RewardValue {
    private double cash;
    private int miles;

    public RewardValue (double x) {
        this.cash = x;
    }
    public RewardValue (int y) {
        this.miles = y;
    }

    public double getCashValue() {
        cash = miles * 0.0035;
        return cash;
    }
    public int getMilesValue() {
        miles = (int) (cash / 0.0035);
        return miles;
    }

    public static void main(String[] args) {

    }
}
