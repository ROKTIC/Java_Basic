// 메소드(함수) 이해를 위한 코드
public class MethodExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int a = 40, b = 50;
        /*
        System.out.println(x + " + " + y + " 의 계산 수행");
        int result = x + y;
        System.out.println("계산 결과 : " + result);
        */

//        메소드 실행(호출)
        //sum(x,y);
        int result3 = sum(x,y);
        System.out.println("sum(x,y) 메소드 실행 후 반환된 값 : " + result3);

        int result4 = sum(a,b);
        System.out.println("sum(a,b) 메소드 실행 후 반환된 값 : " + result4);

        System.out.println(sum(500, 600));

//        구구단 출력을 위한 메소드 호출
        printMultiplication();

        int num = 30;
        int value = accumulateSum(num);
        System.out.println(num + "의 누적합 = " + value);

    } // main end

    //사용자 정의 메소드(method)
    public static int sum(int x, int y) {
        System.out.println(x + " + " + y + " 의 함수계산 수행\n");

        int result = x + y;
        System.out.println("계산 결과 : " + result);

        return result;
    }
    public static void printMultiplication(){
        int dan = 9;
        for(int i = 2; i <= dan; i++){
            for(int j = 1; j <= 9; j++){
                System.out.printf("%d x %d = %d \t", i, j, i*j);
            }
            System.out.println();
            //return 생략됨.. compile 시 자동 추가됨..
        }
    }

    /**
     * 누적합 계산 함수
     * @param num
     * @return
     */
    public static int accumulateSum(int num) {
        int sum = 0;
        for (int i = 0; i < num; i++) {
            sum += num;
        }
        return sum;
    }


} // MethodExample class end
