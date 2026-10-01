package o;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class PagerKtExternalSyntheticLambda6 {
    static final int onWarmupCompleted = onWarmupCompleted(1, 3);
    static final int IAuthTabCallback = onWarmupCompleted(1, 4);
    static final int onExtraCallbackWithResult = onWarmupCompleted(2, 0);
    static final int onExtraCallback = onWarmupCompleted(3, 2);

    public static int onExtraCallbackWithResult(int i2) {
        return i2 & 7;
    }

    public static int onNavigationEvent(int i2) {
        return i2 >>> 3;
    }

    public static int onWarmupCompleted(int i2, int i3) {
        return (i2 << 3) | i3;
    }

    public enum onExtraCallback {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(LazyLayoutKtExternalSyntheticLambda3.onExtraCallbackWithResult),
        ENUM(null),
        MESSAGE(null);

        private final Object defaultDefault;

        onExtraCallback(Object obj) {
            this.defaultDefault = obj;
        }

        Object getDefaultDefault() {
            return this.defaultDefault;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'INT64' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static class onNavigationEvent {
        private static final /* synthetic */ onNavigationEvent[] $VALUES;
        public static final onNavigationEvent BOOL;
        public static final onNavigationEvent BYTES;
        public static final onNavigationEvent DOUBLE;
        public static final onNavigationEvent ENUM;
        public static final onNavigationEvent FIXED32;
        public static final onNavigationEvent FIXED64;
        public static final onNavigationEvent FLOAT;
        public static final onNavigationEvent GROUP;
        public static final onNavigationEvent INT32;
        public static final onNavigationEvent INT64;
        public static final onNavigationEvent MESSAGE;
        public static final onNavigationEvent SFIXED32;
        public static final onNavigationEvent SFIXED64;
        public static final onNavigationEvent SINT32;
        public static final onNavigationEvent SINT64;
        public static final onNavigationEvent STRING;
        public static final onNavigationEvent UINT32;
        public static final onNavigationEvent UINT64;
        private final onExtraCallback javaType;
        private final int wireType;

        public boolean isPackable() {
            return true;
        }

        /* synthetic */ onNavigationEvent(String str, int i2, onExtraCallback onextracallback, int i3, AnonymousClass2 anonymousClass2) {
            this(str, i2, onextracallback, i3);
        }

        public static onNavigationEvent valueOf(String str) {
            return (onNavigationEvent) Enum.valueOf(onNavigationEvent.class, str);
        }

        public static onNavigationEvent[] values() {
            return (onNavigationEvent[]) $VALUES.clone();
        }

        static {
            onNavigationEvent onnavigationevent = new onNavigationEvent("DOUBLE", 0, onExtraCallback.DOUBLE, 1);
            DOUBLE = onnavigationevent;
            onNavigationEvent onnavigationevent2 = new onNavigationEvent("FLOAT", 1, onExtraCallback.FLOAT, 5);
            FLOAT = onnavigationevent2;
            onExtraCallback onextracallback = onExtraCallback.LONG;
            onNavigationEvent onnavigationevent3 = new onNavigationEvent("INT64", 2, onextracallback, 0);
            INT64 = onnavigationevent3;
            onNavigationEvent onnavigationevent4 = new onNavigationEvent("UINT64", 3, onextracallback, 0);
            UINT64 = onnavigationevent4;
            onExtraCallback onextracallback2 = onExtraCallback.INT;
            onNavigationEvent onnavigationevent5 = new onNavigationEvent("INT32", 4, onextracallback2, 0);
            INT32 = onnavigationevent5;
            onNavigationEvent onnavigationevent6 = new onNavigationEvent("FIXED64", 5, onextracallback, 1);
            FIXED64 = onnavigationevent6;
            onNavigationEvent onnavigationevent7 = new onNavigationEvent("FIXED32", 6, onextracallback2, 5);
            FIXED32 = onnavigationevent7;
            onNavigationEvent onnavigationevent8 = new onNavigationEvent("BOOL", 7, onExtraCallback.BOOLEAN, 0);
            BOOL = onnavigationevent8;
            onNavigationEvent onnavigationevent9 = new onNavigationEvent("STRING", 8, onExtraCallback.STRING, 2) { // from class: o.PagerKtExternalSyntheticLambda6.onNavigationEvent.4
                @Override // o.PagerKtExternalSyntheticLambda6.onNavigationEvent
                public boolean isPackable() {
                    return false;
                }

                {
                    AnonymousClass2 anonymousClass2 = null;
                }
            };
            STRING = onnavigationevent9;
            onExtraCallback onextracallback3 = onExtraCallback.MESSAGE;
            onNavigationEvent onnavigationevent10 = new onNavigationEvent("GROUP", 9, onextracallback3, 3) { // from class: o.PagerKtExternalSyntheticLambda6.onNavigationEvent.5
                @Override // o.PagerKtExternalSyntheticLambda6.onNavigationEvent
                public boolean isPackable() {
                    return false;
                }

                {
                    AnonymousClass2 anonymousClass2 = null;
                }
            };
            GROUP = onnavigationevent10;
            int i2 = 2;
            onNavigationEvent onnavigationevent11 = new onNavigationEvent("MESSAGE", 10, onextracallback3, i2) { // from class: o.PagerKtExternalSyntheticLambda6.onNavigationEvent.2
                @Override // o.PagerKtExternalSyntheticLambda6.onNavigationEvent
                public boolean isPackable() {
                    return false;
                }

                {
                    AnonymousClass2 anonymousClass2 = null;
                }
            };
            MESSAGE = onnavigationevent11;
            onNavigationEvent onnavigationevent12 = new onNavigationEvent("BYTES", 11, onExtraCallback.BYTE_STRING, i2) { // from class: o.PagerKtExternalSyntheticLambda6.onNavigationEvent.1
                @Override // o.PagerKtExternalSyntheticLambda6.onNavigationEvent
                public boolean isPackable() {
                    return false;
                }

                {
                    AnonymousClass2 anonymousClass2 = null;
                }
            };
            BYTES = onnavigationevent12;
            onNavigationEvent onnavigationevent13 = new onNavigationEvent("UINT32", 12, onextracallback2, 0);
            UINT32 = onnavigationevent13;
            onNavigationEvent onnavigationevent14 = new onNavigationEvent("ENUM", 13, onExtraCallback.ENUM, 0);
            ENUM = onnavigationevent14;
            onNavigationEvent onnavigationevent15 = new onNavigationEvent("SFIXED32", 14, onextracallback2, 5);
            SFIXED32 = onnavigationevent15;
            onNavigationEvent onnavigationevent16 = new onNavigationEvent("SFIXED64", 15, onextracallback, 1);
            SFIXED64 = onnavigationevent16;
            onNavigationEvent onnavigationevent17 = new onNavigationEvent("SINT32", 16, onextracallback2, 0);
            SINT32 = onnavigationevent17;
            onNavigationEvent onnavigationevent18 = new onNavigationEvent("SINT64", 17, onextracallback, 0);
            SINT64 = onnavigationevent18;
            $VALUES = new onNavigationEvent[]{onnavigationevent, onnavigationevent2, onnavigationevent3, onnavigationevent4, onnavigationevent5, onnavigationevent6, onnavigationevent7, onnavigationevent8, onnavigationevent9, onnavigationevent10, onnavigationevent11, onnavigationevent12, onnavigationevent13, onnavigationevent14, onnavigationevent15, onnavigationevent16, onnavigationevent17, onnavigationevent18};
        }

        private onNavigationEvent(String str, int i2, onExtraCallback onextracallback, int i3) {
            this.javaType = onextracallback;
            this.wireType = i3;
        }

        public onExtraCallback getJavaType() {
            return this.javaType;
        }

        public int getWireType() {
            return this.wireType;
        }
    }

    /* renamed from: o.PagerKtExternalSyntheticLambda6$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[onNavigationEvent.values().length];
            onWarmupCompleted = iArr;
            try {
                iArr[onNavigationEvent.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                onWarmupCompleted[onNavigationEvent.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                onWarmupCompleted[onNavigationEvent.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                onWarmupCompleted[onNavigationEvent.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                onWarmupCompleted[onNavigationEvent.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                onWarmupCompleted[onNavigationEvent.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                onWarmupCompleted[onNavigationEvent.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                onWarmupCompleted[onNavigationEvent.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                onWarmupCompleted[onNavigationEvent.BYTES.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                onWarmupCompleted[onNavigationEvent.UINT32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                onWarmupCompleted[onNavigationEvent.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                onWarmupCompleted[onNavigationEvent.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                onWarmupCompleted[onNavigationEvent.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                onWarmupCompleted[onNavigationEvent.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                onWarmupCompleted[onNavigationEvent.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                onWarmupCompleted[onNavigationEvent.GROUP.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                onWarmupCompleted[onNavigationEvent.MESSAGE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                onWarmupCompleted[onNavigationEvent.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }
}
