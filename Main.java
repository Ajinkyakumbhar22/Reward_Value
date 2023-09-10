public class Main {
    public static void main(String[] args) {
        // Create a RewardValue object with a cash value of $100
        RewardValue rewardValueCash = new RewardValue(100.0);

        // Get and print the cash and miles values
        System.out.println("Cash Value: $" + rewardValueCash.cashValue());
        System.out.println("Miles Value: " + rewardValueCash.getMilesValue() + " miles");
    }
}
