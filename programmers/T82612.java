class form {
    public static void main(String[] args) {
        int price = 0;
        int money = 0;
        int count = 0;
        int result = solution(price, money, count);

        System.out.println(result);
    }
    /*
     * 새로 생긴 놀이기구는 인기가 매우 많아 줄이 끊이질 않습니다.
     * 이 놀이기구의 원래 이용료는 price원 인데, 놀이기구를 N 번 째 이용한다면 원래 이용료의 N배를 받기로 하였습니다.
     * 즉, 처음 이용료가 100이었다면 2번째에는 200, 3번째에는 300으로 요금이 인상됩니다.
     * 놀이기구를 count번 타게 되면 현재 자신이 가지고 있는 금액에서 얼마가 모자라는지를 return 하도록 solution 함수를 완성하세요.
     * 단, 금액이 부족하지 않으면 0을 return 하세요.
     */
    static int solution(int price, int money, int count){
        int pee = 0;
        for(int i=1; i<=count; i++){
            pee += i*price;
        }
        if(money-pee > 0){
            return 0;
        } else {
            return pee-money;
        }
    }
}
