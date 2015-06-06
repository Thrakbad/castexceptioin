
public class SomeGeneric<T> {

    @SuppressWarnings("unchecked")
    public T getFirst() {

        return (T) new Integer(-9999);
    }

    public static void main(String[] args) {

        SomeGeneric<Integer> withInt = new SomeGeneric<Integer>();
        SomeGeneric<Double> withDouble = new SomeGeneric<Double>();

        // These will work
        int someInt = withInt.getFirst();
        Integer someIntegerInst = withInt.getFirst();

        // These will fail with "Exception in thread "main" java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.Double"
        double someDouble = withDouble.getFirst();
        Double someDoubleInst = withDouble.getFirst();
    }
}


