package array;

class ArrayList{
    private Object[] data;
    private int size;
    private int index; // 다음 데이터 추가할 인덱스 위치

    public ArrayList() {
        this.data = new Object[this.size];
        System.out.println("index: " + this.index + ", size : " + this.size + ", data size : " + this.data.length);
        this.size = 1;
        this.index= 0;
           }

        public void add(Object obj){
            if(this.index == this.size -1) {// 배열방에 데이터를 넣기전에 방이 다 찼는지 비교
                doubling(); //다 찼으면 더블링 실행
            }
            data[this.index] = obj; // 공간이 있으면 가져온 데이터를 끝에 추가
            this.index++;
       }

    private void doubling() { // 배열방 꽉찼을때 실행함수
        this.size = this.size *2;
        Object[] newData = new Object[this.size];
        for (int i = 0; i < data.length; i ++){
            newData[i] = data[i]; //Object니까 포인트를 복사
        }
        this.data = newData; //복사한 데이터를 현재데이터라고 할당
        System.out.println("*** index: " + this.index + ", size: " + this.size + ", data size: " + this.data.length);
    }

    public Object get(int i) throws Exception { //인덱스 번호를 보고 데이터를 가져오는 함수
        if(i > this.index-1){
            throw new Exception("ArrayIndexOutOfBound");
        } else if(i < 0) {
            throw new Exception("Negative Value");
        }
        return this.data[i];
    }

    public void remove(int i) throws Exception { //인덱스 번호를 보고 삭제하는 함수
        if(i > this.index-1){
            throw new Exception("ArrayIndexOutOfBound");
        } else if (i < 0){
            throw new Exception("Negative Value");
        }
        for(int x = i; x < this.data.length -1; x++){
            data[x] = data[x+1];
        }
        this.index--;
    }

}



public class ArrayList01 {

    public static void main(String [] args) throws Exception {
        ArrayList al = new ArrayList();
        al.add("0");
        al.add("1");
        al.add("2");
        al.add("3");
        al.add("4");
        al.add("5");
        al.add("6");
        al.add("7");
        al.add("8");
        al.add("9");
        System.out.println(al.get(5));
        al.remove(5);
        System.out.println(al.get(5));

    }


}
