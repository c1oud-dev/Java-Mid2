package generic.ex1;

public class BoxMain2 {
    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);
        /*Object object = integerBox.get();
        Integer integer = (Integer) object; // 다운 캐스팅*/

        //주석 처리한 부분을 하나로 합친 것(ctrl + alt + shift + t -> Inline Variable)
        Integer integer2 = (Integer) integerBox.get(); // Object -> Integer 다운 캐스팅
        System.out.println("integer = " + integer2);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");
        String str = (String) stringBox.get(); // Object -> String 다운 캐스팅
        System.out.println("str = " + str);

        //잘못된 타입의 변수 전달시
        integerBox.set("문자100");
        Integer result = (Integer) integerBox.get(); // String -> Integer 캐스팅 예외
        System.out.println("result = " + result);
    }
}

