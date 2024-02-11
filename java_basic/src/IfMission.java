public class IfMission {
    public static void main(String[] args) {
        int price = 10000;
        int age = 10;
        int discount = 0;

        if (price >= 10000) {
           discount += 1000;
            System.out.println("가격이 10000원 이상이어서 1000원 할인");
        }
        if (age <= 10) {
            discount += 1000;
            System.out.println("나이가 10살 이하여서 1000원 할인");
        }

        System.out.printf("총 할인 금액은 %,d원입니다.\n", discount);
    }
}
