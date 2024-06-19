import java.util.Arrays;

class T258712 {
    public static void main(String[] args) {
        String[] firends = {"muzi", "ryan", "frodo", "neo"};
        String[] gifts = {"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"};
        int result = solution(firends, gifts);

        // System.out.println(result);
    }   
    
    static int solution(String[] firends,String[] gifts){
        int given[][] = new int[firends.length][firends.length];
        // int taken[][] = new int[firends.length][firends.length];

        int expect[] = new int[firends.length];
        int score[] = new int[firends.length];


        for(int i=0; i<gifts.length; i++){
            int giver = Arrays.asList(firends).indexOf(gifts[i].split(" ")[0]);
            int taker = Arrays.asList(firends).indexOf(gifts[i].split(" ")[1]);

            given[giver][taker]++;
        }

        //given의 [0][3]과 [3][0]을 비교
        for(int i=0; i<firends.length; i++){
            for (int j=0; j<firends.length-i; j++){
                score[i] += given[i][j];
                score[i] -= given[j][i];
            }
        }

        // for (int i =0; i<firends.length; i++){
        //     for (int j=0; j<firends.length-i; j++){
        //         if(i == j) continue;
        //         System.out.println("i : "+i + firends[i] +" j : " + j + firends[j]);
                
        //         if (given[i][j] > given[j][i]) {
        //             System.out.println();
        //             System.out.println( firends[j] + "--->" + firends[i]);
        //             expect[i]++;
        //         }else if(given[i][j] < given[j][i]){
        //             System.out.println();
        //             System.out.println( firends[i] + "--->" + firends[j]);
        //             expect[j]++;
        //         }else if (given[i][j] == given[j][i] && score[i] > score[j]){
        //             System.out.println(score[i] + " 점수차 " + score[i]);
        //             System.out.println( firends[j] + "--->" + firends[i]);
        //             expect[i]++;
        //         }
        //     }
        // }
        
        for(int i=4-1; i>0; i--){
            for(int j=1; j<i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        // for (int i : expect){
        //     System.out.println(i);
        // }
        int answer = 0;
        return answer;
    }
}
