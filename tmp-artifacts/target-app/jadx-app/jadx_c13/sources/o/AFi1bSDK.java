package o;

import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFi1bSDK extends setTopGuideFontStyle {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    public static final int onNavigationEvent = 8;

    static {
        int i = onWarmupCompleted + 89;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ AFi1bSDK(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private AFi1bSDK(String str) {
        super("TossSecuritiesNative", str);
    }

    public static final class onNavigationEvent {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }

        public final AFi1bSDK onExtraCallbackWithResult(boolean z, boolean z2, boolean z3) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 85;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            String[] strArr = {"Auth"};
            if (z) {
                strArr = (String[]) ArraysKt___ArraysJvmKt.plus(strArr, "Socket");
            }
            boolean z4 = !z2;
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (!z4) {
                int i4 = IAuthTabCallback + 81;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
                strArr = (String[]) ArraysKt___ArraysJvmKt.plus(strArr, "TubaV1");
            }
            if (z3) {
                int i5 = onExtraCallbackWithResult + 17;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                strArr = (String[]) ArraysKt___ArraysJvmKt.plus(strArr, "TubaV2");
            }
            return new AFi1bSDK(ArraysKt___ArraysKt.joinToString$default(strArr, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null), defaultConstructorMarker);
        }
    }
}
