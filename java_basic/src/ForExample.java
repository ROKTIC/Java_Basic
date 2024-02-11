public class ForExample {
    public static void main(String[] args) {
      /*  int i = 0;
        while(i < 5){
            System.out.println(i);
            i++;
        }*/

        for(int i = 0; i < 5; i++){
            System.out.println(i);
        }

        int sum = 0;
        for(int i = 0; i < 100; i++){
            sum += i;
        }

//        for문의 변형된 형태
        /*for (;;) {
            System.out.println("무한 루프");
        }*/

//       중첩 반복문
        for (int i = 0; i < 10; i++) {
            System.out.println("외부 for 시작 : i = " + i);
            for (int j = 0; j < 5; j++) {
                System.out.println("내부 for : i = " + i + ", j = " + j);
            }
            System.out.println("외부 for 종료 : i = " + i);
            System.out.println("");
        }
    }
}
