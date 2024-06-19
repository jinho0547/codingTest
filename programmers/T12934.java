class T12934 {
    public static void main(String[] args) {
        long n = 121;

        long result = solution(n);

        System.out.println(result);
    }   

    /**
     * 임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
     * n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
     */


    static long solution(long n){
        long answer = 0;
        double sqrt = Math.sqrt(n);

        long temp1 = (long)Math.floor(sqrt);
        long temp2 = (long)Math.ceil(sqrt);

        if (temp1 == temp2) {
            answer = ((long)sqrt + 1)*((long)sqrt + 1);
        }else{
            answer = -1;
        }

        return answer;
    }
}
