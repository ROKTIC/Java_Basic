public class BreakExample {
    public static void main(String[] args) {
        int index = 0;
        int sum = 0;

        while(index < 500) {
            sum += index;
            if(sum >= 300){
                System.out.println("index : " + index + ", sum : " + sum);
                break;
            }
            index++;
        }
        System.out.println("누적 합 : " + sum);
    }
}
