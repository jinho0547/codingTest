class T12918 {
    public static void main(String[] args) {
        String str = "a234";

        System.out.println(solution(str));
    }

    /*
     * 문자열 s의 길이가 4 혹은 6이고, 
     * 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요. 
     * 
     * 예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.
     */
    
    static boolean solution(String str){
        if(str.length() == 4 || str.length() == 6){
            try{
                Integer.parseInt(str);
                return true;
            }catch(Exception e){
                return false;
            }
        }else{
            return false;
        }
    }

    //예외처리로 로직을 처리하는건 금기시한다고 한다.
    //다른 풀이로 풀어보자.
    static boolean solution2(String str) {
        if(str.length() == 4 || str.length() == 6) return str.matches("^[0-9]*$");
        return false;
    }
    
}
