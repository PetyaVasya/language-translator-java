package language;

public enum ExpressionType {
    INT("int"), BOOLEAN("bool");

    public final String cName;

    ExpressionType(String cName) {
        this.cName = cName;
    }
}
