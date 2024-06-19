import java.util.Arrays;
import java.util.Comparator;

class T12917 {
    public static void main(String[] args) {
        String str = "Zbcdefg"; // "gfedcbZ"
        String result = solution(str);

        System.out.println(result);
    }
    
    /* 
    * 문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
    * s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다. 
    */
    static String solution(String str){
        String answer = "";
        char[] charArr = str.toCharArray();
        Character[] arr = new Character[charArr.length];

        for(int i=0; i<charArr.length;i++){
            arr[i] = charArr[i];
        }

        Arrays.sort(arr,Comparator.reverseOrder());

        for(int i=0; i<charArr.length;i++){
            charArr[i] = arr[i];
        }

        answer = new String(charArr);

        return answer;
    }
    
}