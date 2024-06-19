import java.util.*;

class T12933 {
    public static void main(String[] args) {
        long n = 118372;

        long result = solution(n);

        System.out.println(result);
    }   
    
    static long solution(long n){
        long answer = 0;
        String nToString = String.valueOf(n);

        List<String> list = new ArrayList<>();
        list = Arrays.asList(nToString.split(""));
        Collections.sort(list,Comparator.reverseOrder());
        for(int i=0; i<list.size(); i++) {
            answer += Integer.parseInt(list.get(i)) * Math.pow(10,(list.size()-1-i));
        }
        return answer;
    }
}
