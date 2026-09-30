package o;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public enum getTargetRequestCode {
    NOT_AVAILABLE(null, -1),
    START_OBJECT("{", 1),
    END_OBJECT("}", 2),
    START_ARRAY("[", 3),
    END_ARRAY("]", 4),
    FIELD_NAME(null, 5),
    VALUE_EMBEDDED_OBJECT(null, 12),
    VALUE_STRING(null, 6),
    VALUE_NUMBER_INT(null, 7),
    VALUE_NUMBER_FLOAT(null, 8),
    VALUE_TRUE("true", 9),
    VALUE_FALSE("false", 10),
    VALUE_NULL("null", 11);

    final int _id;
    final boolean _isBoolean;
    final boolean _isNumber;
    final boolean _isScalar;
    final boolean _isStructEnd;
    final boolean _isStructStart;
    final String _serialized;
    final byte[] _serializedBytes;
    final char[] _serializedChars;

    getTargetRequestCode(String str, int i2) {
        boolean z = false;
        if (str == null) {
            this._serialized = null;
            this._serializedChars = null;
            this._serializedBytes = null;
        } else {
            this._serialized = str;
            char[] charArray = str.toCharArray();
            this._serializedChars = charArray;
            int length = charArray.length;
            this._serializedBytes = new byte[length];
            for (int i3 = 0; i3 < length; i3++) {
                this._serializedBytes[i3] = (byte) this._serializedChars[i3];
            }
        }
        this._id = i2;
        this._isBoolean = i2 == 10 || i2 == 9;
        this._isNumber = i2 == 7 || i2 == 8;
        boolean z2 = i2 == 1 || i2 == 3;
        this._isStructStart = z2;
        boolean z3 = i2 == 2 || i2 == 4;
        this._isStructEnd = z3;
        if (!z2 && !z3 && i2 != 5 && i2 != -1) {
            z = true;
        }
        this._isScalar = z;
    }

    public final int id() {
        return this._id;
    }

    public final String asString() {
        return this._serialized;
    }

    public final char[] asCharArray() {
        return this._serializedChars;
    }

    public final byte[] asByteArray() {
        return this._serializedBytes;
    }

    public final boolean isNumeric() {
        return this._isNumber;
    }

    public final boolean isStructStart() {
        return this._isStructStart;
    }

    public final boolean isStructEnd() {
        return this._isStructEnd;
    }

    public final boolean isScalarValue() {
        return this._isScalar;
    }

    public final boolean isBoolean() {
        return this._isBoolean;
    }

    public static String valueDescFor(getTargetRequestCode gettargetrequestcode) {
        if (gettargetrequestcode == null) {
            return "<end of input>";
        }
        switch (AnonymousClass1.IAuthTabCallback[gettargetrequestcode.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return "Object value";
            case 4:
            case 5:
                return "Array value";
            case 6:
            case 7:
                return "Boolean value";
            case 8:
                return "Embedded Object value";
            case 9:
                return "Floating-point value";
            case 10:
                return "Integer value";
            case 11:
                return "String value";
            case 12:
                return "Null value";
            default:
                return "[Unavailable value]";
        }
    }

    /* renamed from: o.getTargetRequestCode$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] IAuthTabCallback;

        static {
            int[] iArr = new int[getTargetRequestCode.values().length];
            IAuthTabCallback = iArr;
            try {
                iArr[getTargetRequestCode.START_OBJECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                IAuthTabCallback[getTargetRequestCode.END_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                IAuthTabCallback[getTargetRequestCode.FIELD_NAME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                IAuthTabCallback[getTargetRequestCode.START_ARRAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                IAuthTabCallback[getTargetRequestCode.END_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                IAuthTabCallback[getTargetRequestCode.VALUE_FALSE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                IAuthTabCallback[getTargetRequestCode.VALUE_TRUE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                IAuthTabCallback[getTargetRequestCode.VALUE_EMBEDDED_OBJECT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                IAuthTabCallback[getTargetRequestCode.VALUE_NUMBER_FLOAT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                IAuthTabCallback[getTargetRequestCode.VALUE_NUMBER_INT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                IAuthTabCallback[getTargetRequestCode.VALUE_STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                IAuthTabCallback[getTargetRequestCode.VALUE_NULL.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                IAuthTabCallback[getTargetRequestCode.NOT_AVAILABLE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }
}
