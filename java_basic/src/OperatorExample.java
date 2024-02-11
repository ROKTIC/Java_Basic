public class OperatorExample {
    public static void main(String[] args) {
        int num = 10;
//        num += 1;

        num++;
        System.out.println(num);
        num--;
        System.out.println(num);

        int x = 1;
        int y = ++x;

        System.out.println(x);
        System.out.println(y);

//         논리 연산자 ( &&, ||, ! )
        boolean x1 = true;
        boolean y1 = false;
        System.out.println(x1 && y1);
        System.out.println(x1 || y1);
        System.out.println(!x1);

//        조건 삼항 연산자 ( ? : )
        int a = 545454;
        int b = 34333;
        int c = 88888888;

        int max = a > b ? a : b;
        max = max > c ? max : c;

        System.out.println("3개의 변수에 저장된 숫자 중 최대값은 " + max + " 입니다.");

//      연산자 우선순위
        int result = (10 + 20) * 30;
        System.out.println(result);
    }
}
