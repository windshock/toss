package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getAndResetCustomPostBody {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    public static final String onExtraCallbackWithResult(int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 1;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String strRepeat = StringsKt.repeat("*", i);
        int i5 = onExtraCallback + 63;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return strRepeat;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            if (StringsKt.contains$default(str, "<", false, 3, (Object) null)) {
                int i3 = onExtraCallbackWithResult + 91;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    mqm.onExtraCallback(str).newSessionWithExtras();
                    throw null;
                }
                str = mqm.onExtraCallback(str).newSessionWithExtras();
            }
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            if (StringsKt.contains$default(str, "<", false, 2, (Object) null)) {
            }
        }
        Intrinsics.checkNotNull(str);
        String strTake = StringsKt.take(str, 1024);
        int i4 = onExtraCallback + 81;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 25 / 0;
        }
        return strTake;
    }
}
