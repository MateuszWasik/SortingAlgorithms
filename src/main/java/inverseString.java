public class inverseString extends Object{

    String toInverse;

    public inverseString(String stringParameter){
        stringParameter = new StringBuilder(stringParameter).reverse().toString();

        this.toInverse = stringParameter;
    }

    @Override
    public String toString() {
        return toInverse;
    }
}
