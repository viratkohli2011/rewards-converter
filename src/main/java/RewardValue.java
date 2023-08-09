public class RewardValue {
    private double cash;
    private int miles;

    public RewardValue (double x) {
        this.cash = x;
    }
    public RewardValue (double x, int y) {
        this.cash = x;
        this.miles = y;
    }

    public double getCashValue() {
        return cash;
    }
    public int getMilesValue() {
        return miles;
    }

    public static void main(String[] args) {
        
    }
}
