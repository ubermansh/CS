package tryhelloworld;

class Solution {
    public String solution(String s){
        String answer = "";
        int cnt = 0;
        String [] data = s.split(""); // 빈 문자열로 쪼갬 try hello world 3개의 배열 생성

        for(int i=0; i<data.length; i++){
            if(data[i].equals(" ")){
                cnt = 0;
                System.out.println("공백을만나서 cnt 0으로 초기화");
            } else {
                if(cnt % 2 == 0){
                    data[i]=data[i].toUpperCase();
                    System.out.println("data[i].toUppercase" + data[i]);
                    cnt++;
                } else {
                    data[i] = data[i].toLowerCase();
                    cnt++;
                }
            }
            answer += data[i];
        }
        System.out.println(answer);
        return answer;
    }
}

public class TryHelloWolrd {
    public static void main(String[] args) {

        Solution st = new Solution();
        st.solution("try hello world");



        String str = "010 3766 8903";
        String[] mobNum = str.split("");
        String ret1 = mobNum[0];
        String ret2 = mobNum[1];
        String ret3 = mobNum[2];

        System.out.println("ret1 = " + ret1);
        System.out.println("ret2 = " + ret2);
        System.out.println("ret3 = " + ret3);

//        String str2 = "서울,대전,대구,부산,인천,울산";
//        String[] cityArr = str2.split(",");
//
//        for(int i = 0; i <cityArr.length; i++){
//            System.out.println(cityArr[i]);
//        }

        String str2 = "81-2-010-3766-8903";
        String [] arr = str2.split("-", 2);
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        //String은 불변

        String str1 = "hello";
        str1 = str1 + " world";
        System.out.println("str1 = " + str1);
        //기존에 "hello"값이 들어가있던 String 클래스의 참조변수 str이 "hello world"라는 값을
        //가지고 있는 새로운 메모리영역을 가리키게 변경되고 처음 선언했던 "hello"로 값이 할당되어 있던
        // 메모리 영역은 Garbage로 남아있다가 garbage collection에 의해 사라지게 된다.

        StringBuffer sb = new StringBuffer("hello");
        sb.append(" world");
        System.out.println("sb = " + sb);
        //StringBuffer vs StringBuilder의 차이점 동기화 유무 StringBuffer는 멀티쓰레드 환경에서 안전(동기화지원)
        // 단일 쓰레드에서는 StringBuilder가 좋음


    }
}
