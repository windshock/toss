package o;

import im.toss.facepay.log.model.LogData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class setPermission {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    public static final LogData.SuccessYn IAuthTabCallback(@Nullable Boolean bool) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 61;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            return LogData.SuccessYn.Y;
        }
        Object obj = null;
        if (!Intrinsics.areEqual(bool, Boolean.FALSE)) {
            int i4 = IAuthTabCallback + 89;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return null;
        }
        int i6 = IAuthTabCallback + 23;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        LogData.SuccessYn successYn = LogData.SuccessYn.N;
        int i8 = IAuthTabCallback + 79;
        onExtraCallbackWithResult = i8 % 128;
        if (i8 % 2 != 0) {
            return successYn;
        }
        obj.hashCode();
        throw null;
    }
}
