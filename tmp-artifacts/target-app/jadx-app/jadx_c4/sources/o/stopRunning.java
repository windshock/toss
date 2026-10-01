package o;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import o.onPreviewFrame;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class stopRunning {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static final access4500 onNavigationEvent = new access4500(-9007199254740991L, 9007199254740991L);
    private static int onWarmupCompleted = 1;

    public static final onPreviewFrame IAuthTabCallback(boolean z) {
        int i = 2 % 2;
        onPreviewFrame.onExtraCallback onextracallback = new onPreviewFrame.onExtraCallback(z);
        int i2 = onExtraCallbackWithResult + 93;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return onextracallback;
    }

    public static final onPreviewFrame IAuthTabCallback(@NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        onPreviewFrame.IAuthTabCallbackDefault iAuthTabCallbackDefault = new onPreviewFrame.IAuthTabCallbackDefault(str);
        int i2 = onExtraCallbackWithResult + 41;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return iAuthTabCallbackDefault;
        }
        throw null;
    }

    public static final onPreviewFrame onWarmupCompleted(@NotNull JsonElement jsonElement) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(jsonElement, "");
        onPreviewFrame.onNavigationEvent onnavigationevent = new onPreviewFrame.onNavigationEvent(jsonElement.toString());
        int i2 = onExtraCallback + 43;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return onnavigationevent;
    }

    public static final onPreviewFrame onNavigationEvent(@NotNull com.google.gson.JsonElement jsonElement) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(jsonElement, "");
        String string = jsonElement.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        onPreviewFrame.onNavigationEvent onnavigationevent = new onPreviewFrame.onNavigationEvent(string);
        int i2 = onExtraCallbackWithResult + 11;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return onnavigationevent;
    }

    public static final onPreviewFrame onExtraCallback(int i) {
        int i2 = 2 % 2;
        onPreviewFrame.onExtraCallbackWithResult onextracallbackwithresult = new onPreviewFrame.onExtraCallbackWithResult(i);
        int i3 = onExtraCallbackWithResult + 11;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 66 / 0;
        }
        return onextracallbackwithresult;
    }

    public static final onPreviewFrame onNavigationEvent(double d) {
        int i = 2 % 2;
        onPreviewFrame.IAuthTabCallback iAuthTabCallback = new onPreviewFrame.IAuthTabCallback(d);
        int i2 = onExtraCallbackWithResult + 69;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return iAuthTabCallback;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002f A[PHI: r2
      0x002f: PHI (r2v2 long) = (r2v1 long), (r2v3 long) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final onPreviewFrame onWarmupCompleted(long j) {
        long jOnNavigationEvent;
        int i = 2 % 2;
        int i2 = onExtraCallback + 75;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            access4500 access4500Var = onNavigationEvent;
            jOnNavigationEvent = access4500Var.onNavigationEvent();
            int i3 = 83 / 0;
            if (j <= access4500Var.IAuthTabCallback()) {
                if (jOnNavigationEvent <= j) {
                    if (-2147483648L > j || j >= 2147483648L) {
                        onPreviewFrame.IAuthTabCallback iAuthTabCallback = new onPreviewFrame.IAuthTabCallback(j);
                        int i4 = onExtraCallback + 121;
                        onExtraCallbackWithResult = i4 % 128;
                        int i5 = i4 % 2;
                        return iAuthTabCallback;
                    }
                    onPreviewFrame.onExtraCallbackWithResult onextracallbackwithresult = new onPreviewFrame.onExtraCallbackWithResult((int) j);
                    int i6 = onExtraCallback + 67;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                    return onextracallbackwithresult;
                }
            }
        } else {
            access4500 access4500Var2 = onNavigationEvent;
            jOnNavigationEvent = access4500Var2.onNavigationEvent();
            if (j <= access4500Var2.IAuthTabCallback()) {
            }
        }
        throw new IllegalArgumentException(("Long value " + j + " exceeds JS Number.MAX_SAFE_INTEGER (±(2^53 - 1)). Use toString().toJsValue() and parse with BigInt(str) on JS side.").toString());
    }

    static {
        int i = onWarmupCompleted + 31;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }
}
