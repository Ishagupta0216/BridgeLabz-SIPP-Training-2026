interface CouponValidator {

    boolean validateCoupon(String code);

    static boolean isLengthValid(String code) {
        return code.length() >= 5;
    }
}

class ShoppingCart implements CouponValidator {

    @Override
    public boolean validateCoupon(String code) {
        return code.startsWith("SAVE")
                && CouponValidator.isLengthValid(code);
    }
}

public class Main {
    public static void main(String[] args) {

        String[] coupons = {
                "SAVE10",
                "ABC",
                "SAVE50",
                "DISC20"
        };

        ShoppingCart cart = new ShoppingCart();

        for (String coupon : coupons) {
            if (cart.validateCoupon(coupon)) {
                System.out.println(coupon + " -> Valid");
            } else {
                System.out.println(coupon + " -> Invalid");
            }
        }
    }
}