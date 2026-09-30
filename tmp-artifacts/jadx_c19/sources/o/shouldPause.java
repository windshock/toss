package o;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'INT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class shouldPause {
    private static final /* synthetic */ shouldPause[] $VALUES;
    public static final shouldPause BOOLEAN;
    public static final shouldPause BYTE_STRING;
    public static final shouldPause DOUBLE;
    public static final shouldPause ENUM;
    public static final shouldPause FLOAT;
    public static final shouldPause INT;
    public static final shouldPause LONG;
    public static final shouldPause MESSAGE;
    public static final shouldPause STRING;
    public static final shouldPause VOID;
    private final Class<?> boxedType;
    private final Object defaultDefault;
    private final Class<?> type;

    public static shouldPause valueOf(String str) {
        return (shouldPause) Enum.valueOf(shouldPause.class, str);
    }

    public static shouldPause[] values() {
        return (shouldPause[]) $VALUES.clone();
    }

    static {
        shouldPause shouldpause = new shouldPause("VOID", 0, Void.class, Void.class, null);
        VOID = shouldpause;
        Class cls = Integer.TYPE;
        shouldPause shouldpause2 = new shouldPause("INT", 1, cls, Integer.class, 0);
        INT = shouldpause2;
        shouldPause shouldpause3 = new shouldPause("LONG", 2, Long.TYPE, Long.class, 0L);
        LONG = shouldpause3;
        shouldPause shouldpause4 = new shouldPause("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        FLOAT = shouldpause4;
        shouldPause shouldpause5 = new shouldPause("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        DOUBLE = shouldpause5;
        shouldPause shouldpause6 = new shouldPause("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        BOOLEAN = shouldpause6;
        shouldPause shouldpause7 = new shouldPause("STRING", 6, String.class, String.class, "");
        STRING = shouldpause7;
        shouldPause shouldpause8 = new shouldPause("BYTE_STRING", 7, LazyLayoutKtExternalSyntheticLambda3.class, LazyLayoutKtExternalSyntheticLambda3.class, LazyLayoutKtExternalSyntheticLambda3.onExtraCallbackWithResult);
        BYTE_STRING = shouldpause8;
        shouldPause shouldpause9 = new shouldPause("ENUM", 8, cls, Integer.class, null);
        ENUM = shouldpause9;
        shouldPause shouldpause10 = new shouldPause("MESSAGE", 9, Object.class, Object.class, null);
        MESSAGE = shouldpause10;
        $VALUES = new shouldPause[]{shouldpause, shouldpause2, shouldpause3, shouldpause4, shouldpause5, shouldpause6, shouldpause7, shouldpause8, shouldpause9, shouldpause10};
    }

    private shouldPause(String str, int i2, Class cls, Class cls2, Object obj) {
        this.type = cls;
        this.boxedType = cls2;
        this.defaultDefault = obj;
    }

    public Object getDefaultDefault() {
        return this.defaultDefault;
    }

    public Class<?> getType() {
        return this.type;
    }

    public Class<?> getBoxedType() {
        return this.boxedType;
    }

    public boolean isValidType(Class<?> cls) {
        return this.type.isAssignableFrom(cls);
    }
}
