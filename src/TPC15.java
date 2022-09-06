import kr.tpc.MemberVO;

public class TPC15 {
    public static void main(String[] args) {

        // setter, getter method 필요 없음
        MemberVO m = new MemberVO("홍길동", 40, "010-1111-1111", "서울");
        System.out.println(m.toString());

        MemberVO m1 = new MemberVO();
        m1.setName("나길동");
        m1.setAge(34);
        m1.setTel("010-2222-2222");
        m1.setAddr("광주");

        System.out.print(m1.getName() + "\t");
        System.out.print(m1.getAge() + "\t");
        System.out.print(m1.getTel() + "\t");
        System.out.println(m1.getAddr() + "\t");
        System.out.println(m1.toString());
        System.out.println(m1); //toString 을 생략해도 나옴

    }
}
