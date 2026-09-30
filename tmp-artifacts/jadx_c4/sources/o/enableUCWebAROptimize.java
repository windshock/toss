package o;

import java.util.Arrays;
import java.util.Date;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class enableUCWebAROptimize {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public static final String onExtraCallbackWithResult(@NotNull Pair<Integer, Integer> pair) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(pair, "");
        Object first = pair.getFirst();
        String str = String.format("%02d", Arrays.copyOf(new Object[]{pair.getSecond()}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "");
        String str2 = first + ":" + str;
        int i2 = onNavigationEvent + 23;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return str2;
        }
        throw null;
    }

    public static /* synthetic */ String IAuthTabCallback(String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 53;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        if (i3 % 2 != 0 ? (i & 1) != 0 : (i & 1) != 0) {
            str2 = "M월 d일 (EEE)";
            int i5 = i4 + 55;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
        }
        return IAuthTabCallback(str, str2);
    }

    public static final String IAuthTabCallback(@Nullable String str, @NotNull String str2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 19;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str2, "");
        try {
            commonTestFlag commontestflag = commonTestFlag.onExtraCallback;
            Intrinsics.checkNotNull(str);
            Date dateOnExtraCallbackWithResult = commontestflag.onExtraCallbackWithResult("yyyyMMdd", str);
            Intrinsics.checkNotNull(dateOnExtraCallbackWithResult);
            str = commontestflag.IAuthTabCallback(str2, dateOnExtraCallbackWithResult);
        } catch (NullPointerException unused) {
        }
        int i4 = onNavigationEvent + 55;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final Pair<priorityUploadRate, String> IAuthTabCallback(@NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        int iOnExtraCallbackWithResult = onExtraCallbackWithResult(str);
        Pair<priorityUploadRate, String> pairIAuthTabCallback = getWrite.IAuthTabCallback(priorityUploadRate.Companion.onWarmupCompleted(str), iOnExtraCallbackWithResult + ":" + StringsKt.substringAfter$default(str, ":", (String) null, 2, (Object) null));
        int i2 = onWarmupCompleted + 21;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return pairIAuthTabCallback;
    }

    public static final int onExtraCallbackWithResult(@NotNull String str) {
        int iIntValue;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 39;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Integer intOrNull = StringsKt.toIntOrNull(StringsKt.substringBefore$default(str, ":", (String) null, 2, (Object) null));
        if (intOrNull != null) {
            int i4 = onWarmupCompleted + 87;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                intOrNull.intValue();
                throw null;
            }
            iIntValue = intOrNull.intValue();
        } else {
            iIntValue = 0;
        }
        if (iIntValue > 12) {
            iIntValue -= 12;
        }
        int i5 = onNavigationEvent + 27;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 73 / 0;
        }
        return iIntValue;
    }

    public static final String onWarmupCompleted(@NotNull String str) {
        int iIntValue;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        int iOnExtraCallbackWithResult = onExtraCallbackWithResult(str);
        Integer intOrNull = StringsKt.toIntOrNull(StringsKt.substringAfter$default(str, ":", (String) null, 2, (Object) null));
        if (intOrNull != null) {
            int i2 = onNavigationEvent + 63;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            iIntValue = intOrNull.intValue();
        } else {
            iIntValue = 0;
        }
        String str2 = String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(iIntValue)}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "");
        String str3 = iOnExtraCallbackWithResult + ":" + str2;
        int i4 = onWarmupCompleted + 79;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return str3;
    }
}
