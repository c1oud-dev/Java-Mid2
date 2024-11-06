package generic.ex1;

public class ObjectBox {
    private Object value;
    public void set(Object object) {
        this.value = object;
    }
    public Object get() {
        return value;
    }
}
/**
 * 앞에서 했던 Integer 나 String 은 타입만 다를 뿐 같은 기능을 한다.
 * 이러한 중복성을 없애기 위해 다형적 참조를 사용하자.
 *
 * Object 는 모든 타입의 부모이다.
 * 따라서 다형성(다형적 참조)를 사용해서 이 문제를 간단히 해결해보자
 */
