package o;

import android.os.Build;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class fromDescriptorbugsnag_android_core_release {
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;

    static {
        int i = onWarmupCompleted + 47;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 84 / 0;
        }
    }

    public static final class onExtraCallbackWithResult {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        public final String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 53;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            String str = Build.MANUFACTURER;
            String str2 = Build.MODEL;
            Intrinsics.checkNotNull(str2);
            Intrinsics.checkNotNull(str);
            if (StringsKt__StringsJVMKt.startsWith$default(str2, str, false, 2, null)) {
                int i4 = onNavigationEvent + 91;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return str2;
            }
            String str3 = str + " " + str2;
            int i6 = onExtraCallback + 113;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return str3;
        }

        public final String IAuthTabCallback() {
            int i = 2 % 2;
            String str = "Android " + Build.VERSION.RELEASE;
            int i2 = onNavigationEvent + 63;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 29 / 0;
            }
            return str;
        }
    }
}
