package o;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public enum registerOnPreAttachListener$onWarmupCompleted {
    ANY,
    NATURAL,
    SCALAR,
    ARRAY,
    OBJECT,
    NUMBER,
    NUMBER_FLOAT,
    NUMBER_INT,
    STRING,
    BOOLEAN,
    BINARY;

    public boolean isNumeric() {
        return this == NUMBER || this == NUMBER_INT || this == NUMBER_FLOAT;
    }

    public boolean isStructured() {
        return this == OBJECT || this == ARRAY;
    }
}
