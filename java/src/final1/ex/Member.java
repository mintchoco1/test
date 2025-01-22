package final1.ex;

public class Member {
    private final String id;
    private String name;

    //생성자로 멤버 변수 초기화
    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void changedata(String id, String name) {
        //this.id = id 하면 오류생김. 이미 초기화를 함. 바꿀 수 없다. 바꾸면 안된다는 뜻
        this.name = name;
    }
    public void print(){
        System.out.println("id: " + id + " name: " + name);
    }
}
