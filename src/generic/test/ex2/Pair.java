package generic.test.ex2;

public class Pair<T, S> { //타입 이름이 같으면 안 됨
    private T first;
    private S second;

    public void setFirst(T first) {
        this.first = first;
    }
    public void setSecond(S second) {
        this.second = second;
    }

    public T getFirst() {
        return first;
    }
    public S getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
