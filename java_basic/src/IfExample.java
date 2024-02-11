public class IfExample {
    public static void main(String[] args) {
        int age = 20;
//      단순 if문
/*        if(age >= 18) {
            System.out.println("성인입니다...");
        }
        if(age < 18) {
            System.out.println("성인이 아닙니다...");
        }*/

//        if ~ else문
        if(age >= 18) {
            System.out.println("성인입니다...");
        } else{
            System.out.println("성인이 아닙니다...");
        }

//        다중분기  ( if~else if~else )
        int score = 99;
        if (score >= 90) {
            System.out.println("수입니다...");
        } else if (score >= 80) {
            System.out.println("우입니다...");
        } else if (score >= 70) {
            System.out.println("미입니다...");
        } else if (score >= 60) {
            System.out.println("양입니다...");
        } else {
            System.out.println("가입니다...");
        }
        System.out.println("-------------------------");
//          홀수 짝수를 구별하기 위한 코드 작성
        int x = 45454454;
        String result = "";

        if(x % 2 == 0){
            result = "짝수";
        } else {
            result = "홀수";
        }
        System.out.println("x 변수에 저장된 숫자는 " + result + "입니다.");

        System.out.println("-------------------------");
    }
}
