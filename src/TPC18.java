import kr.tpc.BookVO;
import kr.tpc.MyUtil;

public class TPC18 {
    public static void main(String[] args) {

        // 1. Java 에서 제공해주는 Class.. API
        // 문자열(String)
        String str = new String("APPLE");
        System.out.println(str.toLowerCase());

        // 2. 직접 만들어서 사용하는 Class.. DTO/VO, DAO, Utility... API
        MyUtil my = new MyUtil();
        int sum = my.hap();
        System.out.println(sum);

//        // 3. 다른 회사에서 만들어 놓은 Class... API
//        // Gson > json
//        Gson g = new Gson();
//        BookVO vo = new BookVO("자바", 13000, "영진", 800);
//        String json = g.toJson(vo);
//        // json 구조로 만들어주는 API
//        System.out.println(json);



    }
}
