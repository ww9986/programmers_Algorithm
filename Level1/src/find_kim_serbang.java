public class find_kim_serbang { // 서울에서 김서방 찾기
    public String solution(String[] seoul) {
        for(int i = 0; i < seoul.length; i++){
            if(seoul[i].equals("Kim"))
                return "김서방은 " + i + "에 있다";
        }
        return null;
    }
}

