class T250137 {
    public static void main(String args[]){
        int[] bandage = {5,3,2};
        int health = 30;
        int[][] attacks = {{1,1},{4,12}};

        int result = solution(bandage, health, attacks);

        System.out.println(result);
    }


    // 마지막 공격을 맞고도 버티면 끝
    // 마지막이 되기 전에 체력이 0 이하면 끝
    public static int solution(int[] bandage, int health, int[][] attacks) {

        int atkIdx=0;
        int answer=0;
        int healStack=0;
        int nowHealth = health;

        // 마지막 공격때까지 반복
        for (int i=1; i<attacks[attacks.length-1][0]+1; i++){
            //공격 타이밍일 때 (회복하지 않음)
            if(i == attacks[atkIdx][0]){
                nowHealth -= attacks[atkIdx][1];
                healStack = 0;
                atkIdx++;
            } else { //공격 아닐 때
                healStack++;
                nowHealth += bandage[1];
                if(healStack == bandage[0]){
                    healStack=0;
                    nowHealth += bandage[2];
                }

                if(nowHealth > health) {
                    nowHealth = health;
                }
            }

            if (nowHealth < 1) {
                return -1;
            } 

            System.out.println(i+"회차 공격, " + "현재체력 :" + nowHealth);
            System.out.println("공격" + (i == attacks[atkIdx-1][0]?"O":"X") + ", 붕대스택: " + healStack);

            System.out.println();
        }

        answer = nowHealth;

        return answer;
    }

}


/*
  
bandage [시전 시간, 초당 회복량, 추가 회복량] 

bandage	        health	    attacks	                                    result
[5, 1, 5]	    30	        [[2, 10], [9, 15], [10, 5], [11, 5]]	    5
[3, 2, 7]	    20	        [[1, 15], [5, 16], [8, 6]]	                -1
[4, 2, 7]	    20	        [[1, 15], [5, 16], [8, 6]]	                -1
[1, 1, 1]	    5	        [[1, 2], [3, 2]]	                        3

*/