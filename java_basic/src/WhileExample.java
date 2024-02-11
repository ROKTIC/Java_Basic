public class WhileExample {
    public static void main(String[] args) {
//      1 ~ 100 까지의 합
        int count = 1;
        int end = 100;

        int sum = 0;
        while (count <= end) {
            sum += count;
            count++;
        }
        System.out.println("누적합 : " + sum);

//        홀수합, 짝수합 구하기
        count = 1;
        end = 100;

        int oddSum = 0 , evenSum = 0;

        while (count <= end) {
            //짝수인 경우
            if ((count % 2) == 0) {
                evenSum += count;
            }else { //홀수인 경우
                oddSum += count;
            }
            count++;
        }
        System.out.println("홀수 누적합 : " + oddSum + ", 짝수 누적합 : " + evenSum);





    } // main end
} // WhileExample class end
