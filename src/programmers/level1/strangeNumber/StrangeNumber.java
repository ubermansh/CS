package programmers.level1.strangeNumber;
//출처 : https://udud0510.tistory.com/43
//문제 : 문자열 s는 한 개 이상의 단어로 구성되어있다. 각 단어는 하나 이상의 공백문자로 구분되어 있다.
// 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성해라
//  제한사항
//      문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단
//      첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 한다.
//  예) s = "try hello world" => return "TrY HeLlo WoRlD"

class Solution{

    public String solution(String s){
//        String answer = "";
//        String data[] = s.split(""); //문자열을 하나씩 분리
//        int cnt = 0; // 공백
//        for(int i=0; i<data.length; i++){
//
//            if(data[i].equals(" ")){
//                cnt = 0;
//                System.out.println("data[i] = 빈칸" + data[i]);
//            } else {
//                if(cnt%2==0){
//                    data[i] = data[i].toUpperCase();
//                    System.out.println("data[i] = 짝수" + data[i]);
//                    cnt++;
//                } else {
//                    data[i] = data[i].toLowerCase();
//                    System.out.println("data[i] = 홀수" + data[i]);
//                    cnt++;
//                }
//                answer += data[i];
//            }
//
//        }
//        System.out.println(answer);
//        return answer;

        // 더 완벽한 풀이

        String answer = "";
        int cnt = 0;
        String [] data = s.split("");

        for(String str : data) {
            cnt = str.contains(" ") ? 0 : cnt+1;
            answer += cnt % 2 == 0 ? str.toUpperCase() : str.toLowerCase();
        }
        System.out.println(answer);
        return answer;
    }

}

public class StrangeNumber {
    public static void main(String[] args){

        Solution st = new Solution();

        st.solution("try hello world");

    }
}
