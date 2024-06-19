
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class T86051 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,6,7,8,0};
        int result = solution(numbers);

        System.out.println(result);
    }   
    
    static int solution(int[] numbers){
        int answer = 0;
        List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());

        for(int i=0; i<10; i++){
            if(list.indexOf(i) == -1 ){
                answer += i;
            } else {
                continue;
            }
        }
        return answer;
    }
    
}
