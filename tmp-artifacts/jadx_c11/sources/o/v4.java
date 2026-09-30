package o;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class v4 {
    public static final v4 IAuthTabCallback = new v4();
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    static {
        int i = onExtraCallbackWithResult + 19;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 23 / 0;
        }
    }

    private v4() {
    }

    public static final class onExtraCallbackWithResult {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private final boolean IAuthTabCallback;
        private final boolean onExtraCallback;
        private final boolean onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onExtraCallbackWithResult)) {
                int i2 = onNavigationEvent + 85;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 24 / 0;
                }
                return false;
            }
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) obj;
            if (this.IAuthTabCallback != onextracallbackwithresult.IAuthTabCallback || this.onWarmupCompleted != onextracallbackwithresult.onWarmupCompleted) {
                return false;
            }
            if (this.onExtraCallback == onextracallbackwithresult.onExtraCallback) {
                return true;
            }
            int i4 = onNavigationEvent + 87;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 1;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (((Boolean.hashCode(this.IAuthTabCallback) * 31) + Boolean.hashCode(this.onWarmupCompleted)) * 31) + Boolean.hashCode(this.onExtraCallback);
            int i4 = onExtraCallbackWithResult + 25;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Properties(dismissOnDrag=" + this.IAuthTabCallback + ", dismissOnBackPress=" + this.onWarmupCompleted + ", dismissOnClickOutside=" + this.onExtraCallback + ")";
            int i2 = onNavigationEvent + 53;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public onExtraCallbackWithResult(boolean z, boolean z2, boolean z3) {
            this.IAuthTabCallback = z;
            this.onWarmupCompleted = z2;
            this.onExtraCallback = z3;
        }

        public final boolean onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 35;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            boolean z = this.IAuthTabCallback;
            int i5 = i2 + 93;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return z;
            }
            throw null;
        }

        public final boolean onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 73;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            boolean z = this.onWarmupCompleted;
            int i5 = i3 + 5;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return z;
        }

        public final boolean onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 95;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return this.onExtraCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ onExtraCallbackWithResult(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = onNavigationEvent;
                int i3 = i2 + 63;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 45;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
                z = true;
            }
            this(z);
        }

        public onExtraCallbackWithResult(boolean z) {
            this(z, z, z);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
        
            r1 = r1 + 97;
            r2 = r1 % 128;
            o.v4.onExtraCallbackWithResult.onExtraCallbackWithResult = r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
        
            if ((r1 % 2) == 0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
        
            if (r5 == 3) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0027, code lost:
        
            if (r5 == 2) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
        
            r2 = r2 + 105;
            o.v4.onExtraCallbackWithResult.onNavigationEvent = r2 % 128;
            r2 = r2 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0033, code lost:
        
            return r4.onExtraCallback;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0036, code lost:
        
            return r4.onWarmupCompleted;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0039, code lost:
        
            return r4.IAuthTabCallback;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        
            if (r5 != 0) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
        
            if (r5 != 0) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
        
            if (r5 == 1) goto L20;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean onExtraCallbackWithResult(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent;
            int i4 = i3 + 9;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 13 / 0;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallback[] $VALUES;
        public static final onWarmupCompleted Companion;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        public static final onExtraCallback Drag = new onExtraCallback("Drag", 0);
        public static final onExtraCallback BackPress = new onExtraCallback("BackPress", 1);
        public static final onExtraCallback OutsideClick = new onExtraCallback("OutsideClick", 2);

        private static final /* synthetic */ onExtraCallback[] $values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 65;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return new onExtraCallback[]{Drag, BackPress, OutsideClick};
            }
            onExtraCallback onextracallback = Drag;
            onExtraCallback onextracallback2 = BackPress;
            onExtraCallback onextracallback3 = OutsideClick;
            onExtraCallback[] onextracallbackArr = new onExtraCallback[5];
            onextracallbackArr[0] = onextracallback;
            onextracallbackArr[1] = onextracallback2;
            onextracallbackArr[2] = onextracallback3;
            return onextracallbackArr;
        }

        public static EnumEntries<onExtraCallback> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 37;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return $ENTRIES;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static onExtraCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 113;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallback = (onExtraCallback) Enum.valueOf(onExtraCallback.class, str);
            int i4 = onNavigationEvent + 107;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return onextracallback;
            }
            throw null;
        }

        public static onExtraCallback[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 29;
            onNavigationEvent = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            onExtraCallback[] onextracallbackArr = (onExtraCallback[]) $VALUES.clone();
            int i3 = onNavigationEvent + 65;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                return onextracallbackArr;
            }
            obj.hashCode();
            throw null;
        }

        private onExtraCallback(String str, int i) {
        }

        static {
            onExtraCallback[] onextracallbackArr$values = $values();
            $VALUES = onextracallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackArr$values);
            Companion = new onWarmupCompleted(null);
            int i = IAuthTabCallback + 65;
            onWarmupCompleted = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        public static final class onWarmupCompleted {
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private onWarmupCompleted() {
            }

            public final onExtraCallback IAuthTabCallback(int i) {
                int i2 = 2 % 2;
                if (i == -1) {
                    return onExtraCallback.BackPress;
                }
                int i3 = onNavigationEvent + 85;
                int i4 = i3 % 128;
                onExtraCallbackWithResult = i4;
                if (i3 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (i == 0) {
                    return onExtraCallback.Drag;
                }
                int i5 = i4 + 97;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0 ? i != 1 : i != 0) {
                    if (i == 2) {
                        return onExtraCallback.OutsideClick;
                    }
                    return onExtraCallback.BackPress;
                }
                onExtraCallback onextracallback = onExtraCallback.BackPress;
                int i6 = onNavigationEvent + 85;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 95 / 0;
                }
                return onextracallback;
            }
        }
    }
}
