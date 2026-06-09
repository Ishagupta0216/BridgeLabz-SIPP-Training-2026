public class calculateProfitAndLose {
    public static void main(String[] args) {
        int costPrice=129;
        int sellingPrice=191;
        if(sellingPrice>costPrice){
            int profit=sellingPrice-costPrice;
            int percentageProfit=(profit*100)/costPrice;
            System.out.println("Profit:"+profit);
            System.out.println("Percentage Profit:"+percentageProfit);
        }
        else if(costPrice>sellingPrice){
            int loss=costPrice-sellingPrice;
            int percentageLoss=(loss*100)/costPrice;
            System.out.println("Loss:"+loss);
            System.out.println("Percentage Loss:"+percentageLoss);
        }
        else{
            System.out.println("No profit no loss");
        }
    }
}