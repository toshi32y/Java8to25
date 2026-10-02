package java08;

public interface DefaultAndStaticInterface {

    // インターフェースに実装を持つメソッドを定義できるようになりました。
    // abstractメソッドが要らなくなるんだろうか。
    default void hello() {
        System.out.println("Hello");
    }

}
interface MathUtil {
    static int square(int value) {
        return value * value;
    }
}
//int result = MathUtil.square(5);
