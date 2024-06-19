class T70128 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b = {-3,-1,0,2};

        int result = solution(a, b);

        System.out.println(result);
    }   
    /*
     * 길이가 같은 두 1차원 정수배열 a, b 주어짐
     * 두 배열의 내적을 return 메서드를 완성시켜라
     * 
     * 내적은
     * a[0]*b[0] + a[1]*b[1] + ... + a[n-1]*b[n-1]
     */
    
    static int solution(int[] a, int[] b){
        int answer = 0;
        for(int i=0; i<a.length; i++){
            answer += a[i]*b[i];
        }
        return answer;
    }
}
