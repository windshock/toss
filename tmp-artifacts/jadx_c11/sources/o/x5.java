package o;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class x5 {
    private static int onExtraCallbackWithResult = 0;
    public static final x5 onNavigationEvent = new x5();
    private static int onWarmupCompleted = 1;

    static {
        int i = onWarmupCompleted + 97;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private x5() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class IAuthTabCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ IAuthTabCallback[] $VALUES;
        public static final IAuthTabCallback Left = new IAuthTabCallback("Left", 0);
        public static final IAuthTabCallback Right = new IAuthTabCallback("Right", 1);
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        private static final /* synthetic */ IAuthTabCallback[] $values() {
            IAuthTabCallback[] iAuthTabCallbackArr;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 55;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            if (i2 % 2 == 0) {
                IAuthTabCallback iAuthTabCallback = Left;
                IAuthTabCallback iAuthTabCallback2 = Right;
                iAuthTabCallbackArr = new IAuthTabCallback[5];
                iAuthTabCallbackArr[0] = iAuthTabCallback;
                iAuthTabCallbackArr[1] = iAuthTabCallback2;
            } else {
                iAuthTabCallbackArr = new IAuthTabCallback[]{Left, Right};
            }
            int i4 = i3 + 49;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 82 / 0;
            }
            return iAuthTabCallbackArr;
        }

        public static EnumEntries<IAuthTabCallback> getEntries() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 105;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return $ENTRIES;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static IAuthTabCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 15;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) Enum.valueOf(IAuthTabCallback.class, str);
            int i4 = onNavigationEvent + 121;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return iAuthTabCallback;
        }

        public static IAuthTabCallback[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 13;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            IAuthTabCallback[] iAuthTabCallbackArr = (IAuthTabCallback[]) $VALUES.clone();
            int i3 = onExtraCallbackWithResult + 57;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 72 / 0;
            }
            return iAuthTabCallbackArr;
        }

        private IAuthTabCallback(String str, int i) {
        }

        static {
            IAuthTabCallback[] iAuthTabCallbackArr$values = $values();
            $VALUES = iAuthTabCallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(iAuthTabCallbackArr$values);
            int i = onWarmupCompleted + 123;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }
    }

    public static final class onExtraCallbackWithResult {
        public static final onWarmupCompleted Companion;
        private static final onExtraCallbackWithResult IAuthTabCallback;
        private static int IAuthTabCallbackDefault = 0;
        private static int IAuthTabCallbackStub = 1;
        private static int asInterface = 0;
        private static final onExtraCallbackWithResult onExtraCallback = new onExtraCallbackWithResult(0);
        private static final onExtraCallbackWithResult onExtraCallbackWithResult;
        private static final onExtraCallbackWithResult onNavigationEvent;
        private static int onTransact = 1;
        private final int onWarmupCompleted;

        public onExtraCallbackWithResult(int i) {
            this.onWarmupCompleted = i;
        }

        public static final /* synthetic */ onExtraCallbackWithResult IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 35;
            int i3 = i2 % 128;
            IAuthTabCallbackDefault = i3;
            Object obj = null;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            onExtraCallbackWithResult onextracallbackwithresult = onNavigationEvent;
            int i4 = i3 + 53;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 != 0) {
                return onextracallbackwithresult;
            }
            throw null;
        }

        public static final /* synthetic */ onExtraCallbackWithResult onExtraCallback() {
            onExtraCallbackWithResult onextracallbackwithresult;
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub;
            int i3 = i2 + 17;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 != 0) {
                onextracallbackwithresult = IAuthTabCallback;
                int i4 = 73 / 0;
            } else {
                onextracallbackwithresult = IAuthTabCallback;
            }
            int i5 = i2 + 3;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 == 0) {
                return onextracallbackwithresult;
            }
            throw null;
        }

        public static final /* synthetic */ onExtraCallbackWithResult onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 49;
            int i3 = i2 % 128;
            IAuthTabCallbackDefault = i3;
            Object obj = null;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            onExtraCallbackWithResult onextracallbackwithresult = onExtraCallback;
            int i4 = i3 + 77;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 != 0) {
                return onextracallbackwithresult;
            }
            throw null;
        }

        public static final /* synthetic */ onExtraCallbackWithResult onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 95;
            int i3 = i2 % 128;
            IAuthTabCallbackDefault = i3;
            int i4 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = onExtraCallbackWithResult;
            int i5 = i3 + 29;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 != 0) {
                return onextracallbackwithresult;
            }
            throw null;
        }

        public static final class onWarmupCompleted {
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private onWarmupCompleted() {
            }

            public final onExtraCallbackWithResult onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 3;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return onExtraCallbackWithResult.onExtraCallbackWithResult();
                }
                onExtraCallbackWithResult.onExtraCallbackWithResult();
                throw null;
            }

            public final onExtraCallbackWithResult IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 95;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                onExtraCallbackWithResult onextracallbackwithresultOnExtraCallback = onExtraCallbackWithResult.onExtraCallback();
                int i4 = onExtraCallback + 51;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    return onextracallbackwithresultOnExtraCallback;
                }
                throw null;
            }

            public final onExtraCallbackWithResult onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 67;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                onExtraCallbackWithResult onextracallbackwithresultOnNavigationEvent = onExtraCallbackWithResult.onNavigationEvent();
                int i4 = onExtraCallback + 53;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    return onextracallbackwithresultOnNavigationEvent;
                }
                throw null;
            }

            public final onExtraCallbackWithResult onExtraCallback() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 25;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                onExtraCallbackWithResult onextracallbackwithresultIAuthTabCallback = onExtraCallbackWithResult.IAuthTabCallback();
                int i4 = onNavigationEvent + 73;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return onextracallbackwithresultIAuthTabCallback;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        static {
            DefaultConstructorMarker defaultConstructorMarker = null;
            Companion = new onWarmupCompleted(defaultConstructorMarker);
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(1);
            IAuthTabCallback = onextracallbackwithresult;
            onExtraCallbackWithResult onextracallbackwithresult2 = new onExtraCallbackWithResult(2);
            onExtraCallbackWithResult = onextracallbackwithresult2;
            onNavigationEvent = onextracallbackwithresult.onExtraCallbackWithResult(onextracallbackwithresult2);
            int i = onTransact + 19;
            asInterface = i % 128;
            if (i % 2 == 0) {
                return;
            }
            defaultConstructorMarker.hashCode();
            throw null;
        }

        public final onExtraCallbackWithResult onExtraCallbackWithResult(@NotNull onExtraCallbackWithResult onextracallbackwithresult) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            onExtraCallbackWithResult onextracallbackwithresult2 = new onExtraCallbackWithResult(onextracallbackwithresult.onWarmupCompleted | this.onWarmupCompleted);
            int i2 = IAuthTabCallbackStub + 23;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            return onextracallbackwithresult2;
        }

        public final boolean IAuthTabCallback(@NotNull onExtraCallbackWithResult onextracallbackwithresult) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            int i2 = this.onWarmupCompleted;
            if ((onextracallbackwithresult.onWarmupCompleted | i2) != i2) {
                int i3 = IAuthTabCallbackStub + 9;
                IAuthTabCallbackDefault = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            int i5 = IAuthTabCallbackStub + 99;
            int i6 = i5 % 128;
            IAuthTabCallbackDefault = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 15;
            IAuthTabCallbackStub = i8 % 128;
            if (i8 % 2 != 0) {
                return true;
            }
            throw null;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            Object obj2 = null;
            if (this == obj) {
                int i2 = IAuthTabCallbackStub + 73;
                IAuthTabCallbackDefault = i2 % 128;
                if (i2 % 2 == 0) {
                    return true;
                }
                throw null;
            }
            if (obj instanceof onExtraCallbackWithResult) {
                if (this.onWarmupCompleted == ((onExtraCallbackWithResult) obj).onWarmupCompleted) {
                    return true;
                }
                int i3 = IAuthTabCallbackStub + 75;
                IAuthTabCallbackDefault = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            int i5 = IAuthTabCallbackDefault;
            int i6 = i5 + 99;
            IAuthTabCallbackStub = i6 % 128;
            boolean z = i6 % 2 == 0;
            int i7 = i5 + 27;
            IAuthTabCallbackStub = i7 % 128;
            if (i7 % 2 != 0) {
                return z;
            }
            obj2.hashCode();
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 81;
            int i3 = i2 % 128;
            IAuthTabCallbackDefault = i3;
            int i4 = i2 % 2;
            int i5 = this.onWarmupCompleted;
            int i6 = i3 + 9;
            IAuthTabCallbackStub = i6 % 128;
            if (i6 % 2 != 0) {
                return i5;
            }
            throw null;
        }
    }
}
