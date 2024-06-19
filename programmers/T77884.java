class T77884 {
    public static void main(String[] args) {
        int left = 13;
        int right = 17;

        int result = solution(left, right);

        System.out.println(result);
    }
    /*
     * 두 정수 left와 right가 매개변수로 주어집니다.
     * left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고, 
     * 약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.
     */

    static int solution(int l, int r){
        int answer = 0;

        for(int i=l; i<=r; i++){
            int cnt = 0;
            for (int j=1; j<=i; j++){
                if(i%j == 0){
                    cnt++;
                }
            }

            if(cnt%2 == 0){
                answer+=i;
            } else {
                answer-=i;
            }
        }
        
        return answer;
    }


    /*
     * 제곱수는 반드시 홀수의 약수를 가진다
     * ex) 12의 경우 1,2,3,4,6,12 -> 6개로 짝수
     * ex) 36의 경우 1,2,3,4,6,9,12,18,36 -> 9개로 홀수
     */
    public int solution2(int left, int right) {
        int answer = 0;

        for (int i=left;i<=right;i++) {
            //제곱수인 경우 약수의 개수가 홀수
            if (i % Math.sqrt(i) == 0) {
                answer -= i;
            }
            //제곱수가 아닌 경우 약수의 개수가 짝수
            else {
                answer += i;
            }
        }

        return answer;
    }
}
