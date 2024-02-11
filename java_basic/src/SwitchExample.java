public class SwitchExample {
    public static void main(String[] args) {
        int num = 3;

        switch (num) {
            case 1 : System.out.println("1 입니다..."); break;
            case 2 : System.out.println("2 입니다..."); break;
            case 3 : System.out.println("3 입니다..."); break;
            case 4 : System.out.println("4 입니다..."); break;

            default: System.out.println("5 이상의 수입니다..");
        }

        int age = 30;
        if (age <= 7) {
            System.out.println("미취학입니다...");
        } else if (age <= 13) {
            System.out.println("초등학생입니다...");
        } else if (age <= 16) {
            System.out.println("중학생입니다...");
        } else if (age <= 19) {
            System.out.println("고등학생입니다...");
        } else {
            System.out.println("성인입니다...");
        }

        int grade = 2;
        int coupon = 0;
        switch (grade) {
            case 1 : coupon = 1000; break;
            case 2 : coupon = 2000; break;
            case 3 : coupon = 3000; break;

            default: coupon = 500;
        }
        System.out.printf("당신의 쿠폰금액은 %,d원 입니다 \n", coupon);

        int score = 90;
        switch (score/10) {
            case 10 :                                   // break 생략
            case 9 : System.out.println("수"); break;
            case 8 : System.out.println("우"); break;
            case 7 : System.out.println("미"); break;
            case 6 : System.out.println("양"); break;

            default: System.out.println("가");
        }

        String name = "윤윤윤";
        switch (name) {
            case "윤윤윤" : System.out.println("윤 입니다..."); break;
            case "박박박" : System.out.println("박 입니다..."); break;

            default:
                System.out.println("윤도 박도 아님");
        }

    } // main end
}
