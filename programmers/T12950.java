class T12950 {
    public static void main(String[] args) {

        int[][] arr1 ={{1,2},{2,3}};
        int[][] arr2 ={{3,4},{5,6}};
        int[][] result = solution(arr1, arr2);

        System.out.println(result.toString());
    }
    
/*
 * 행렬의 덧셈은 행과 열의 크기가 같은 두 행렬의 같은 행, 같은 열의 값을 서로 더한 결과가 됩니다. 
 * 2개의 행렬 arr1과 arr2를 입력받아, 행렬 덧셈의 결과를 반환하는 함수, solution을 완성해주세요.
 */
    static int[][] solution(int[][] arr1, int[][] arr2){
        int depth1 = arr1.length;
        int depth2 = arr1[0].length;


        int[][] answer = new int[arr1.length][arr1[0].length];

        for(int i=0; i<depth1; i++){
            for(int j=0; j<depth2; j++){
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }
}
