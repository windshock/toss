package o;

import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AFf1cSDK;
import org.jetbrains.annotations.NotNull;

@JvmInline
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFf1cSDK {
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final String onExtraCallbackWithResult;

    static {
        int i = onWarmupCompleted + 99;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static int IAuthTabCallback(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = str.hashCode();
        int i4 = onNavigationEvent + 101;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static String onExtraCallbackWithResult(String str) {
        int i = 2 % 2;
        String str2 = "StableKey(value=" + str + ")";
        int i2 = onExtraCallback + 75;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str2;
    }

    private static String onNavigationEvent(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 63;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 83;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static boolean onWarmupCompleted(String str, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 69;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            boolean z = obj instanceof AFf1cSDK;
            throw null;
        }
        if (obj instanceof AFf1cSDK) {
            return Intrinsics.areEqual(str, ((AFf1cSDK) obj).onExtraCallback());
        }
        int i4 = i2 + 37;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 7;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            onWarmupCompleted(this.onExtraCallbackWithResult, obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        boolean zOnWarmupCompleted = onWarmupCompleted(this.onExtraCallbackWithResult, obj);
        int i3 = onExtraCallback + 3;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return zOnWarmupCompleted;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 107;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String str = this.onExtraCallbackWithResult;
        if (i3 != 0) {
            return IAuthTabCallback(str);
        }
        IAuthTabCallback(str);
        throw null;
    }

    public final /* synthetic */ String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 115;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.onExtraCallbackWithResult;
        int i5 = i2 + 5;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 31;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = this.onExtraCallbackWithResult;
        if (i3 == 0) {
            return onExtraCallbackWithResult(str);
        }
        onExtraCallbackWithResult(str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ String onExtraCallback(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        String strOnNavigationEvent = onNavigationEvent(str);
        int i4 = onNavigationEvent + 15;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return strOnNavigationEvent;
    }

    public static final class onNavigationEvent {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ CharSequence onExtraCallback(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 51;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            CharSequence charSequenceOnWarmupCompleted = onWarmupCompleted(obj);
            int i4 = IAuthTabCallback + 101;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return charSequenceOnWarmupCompleted;
        }

        private onNavigationEvent() {
        }

        public final String onExtraCallbackWithResult(@NotNull Object... objArr) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(objArr, "");
            String strOnExtraCallback = AFf1cSDK.onExtraCallback(ArraysKt___ArraysKt.joinToString$default(objArr, "::", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: im.toss.tosssecurities.uikit.base.compose.StableKey$Companion$$ExternalSyntheticLambda0
                private static int onExtraCallbackWithResult = 0;
                private static int onWarmupCompleted = 1;

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i2 = 2 % 2;
                    int i3 = onWarmupCompleted + 73;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                    CharSequence charSequenceOnExtraCallback = AFf1cSDK.onNavigationEvent.onExtraCallback(obj);
                    int i5 = onExtraCallbackWithResult + 89;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    return charSequenceOnExtraCallback;
                }
            }, 30, (Object) null));
            int i2 = IAuthTabCallback + 123;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return strOnExtraCallback;
            }
            throw null;
        }

        private static final CharSequence onWarmupCompleted(Object obj) {
            int i = 2 % 2;
            if (obj != null) {
                int i2 = IAuthTabCallback + 63;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                String string = obj.toString();
                if (string != null) {
                    return string;
                }
            }
            int i4 = IAuthTabCallback + 115;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return "\u0000";
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }
}
