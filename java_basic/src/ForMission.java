public class ForMission {
    public static void main(String[] args) {

        System.out.println("\n-----------1번-----------");

        // #1
        for (int i = 10; i >= 1; i--) {
            System.out.printf(" %d" ,  i);
        }
        System.out.println("\n-----------2번-----------");

        // #2
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n-----------3번-----------");

        // #3
        for(int i = 5; i > 0; i--){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n-----------4번-----------");

        // #4 *************  "다른 변수 선언"   ************
        int x = 0;
        for(int i = 0; i < 4; i++){
            for(int j = 0; j <= i; j++){
                System.out.printf(" %d", x);
                x += 1;
            }
            System.out.println();
        }

        System.out.println("\n------------5번----------");

        // #5 for 구구단 단별로 1줄로 출력
        for(int i = 2; i <= 9; i++){
            for(int j = 1; j <= 9; j++){
                System.out.printf("%d x %d = %d \t", i, j, i*j);
            }
            System.out.println();
        }
    }
}
