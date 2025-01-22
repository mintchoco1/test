package final1.ex;

public class MemberMain {
    public static void main(String[] args) {
        Member member = new Member("myid", "kim");//인스턴스 만들고 생성자 호출하면서 멤버변수 초기화
        member.print();
        member.changedata("yourid", "kjjim");
        member.print();
    }
}
