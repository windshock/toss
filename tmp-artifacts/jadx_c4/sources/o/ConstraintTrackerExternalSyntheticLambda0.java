package o;

import java.util.Arrays;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import o.ConstraintTrackerExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ConstraintTrackerExternalSyntheticLambda0 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    public static /* synthetic */ CharSequence onNavigationEvent(byte b) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 13;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        CharSequence charSequenceOnExtraCallbackWithResult = onExtraCallbackWithResult(b);
        int i4 = onExtraCallback + 83;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 98 / 0;
        }
        return charSequenceOnExtraCallbackWithResult;
    }

    private static final CharSequence onExtraCallbackWithResult(byte b) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "");
        int i4 = onExtraCallback + 17;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String IAuthTabCallback(@NotNull byte[] bArr) throws NumberFormatException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(bArr, "");
        String strJoinToString$default = ArraysKt.joinToString$default(bArr, "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: im.toss.ble.scanner.place.MerchantBleKeyParser$$ExternalSyntheticLambda0
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 73;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                byte bByteValue = ((Byte) obj).byteValue();
                if (i4 != 0) {
                    return ConstraintTrackerExternalSyntheticLambda0.onNavigationEvent(bByteValue);
                }
                ConstraintTrackerExternalSyntheticLambda0.onNavigationEvent(bByteValue);
                throw null;
            }
        }, 30, (Object) null);
        String strSlice = StringsKt.slice(onNavigationEvent(strJoinToString$default), RangesKt.until(8, onWarmupCompleted(strJoinToString$default) + 8));
        int i2 = onNavigationEvent + 117;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return strSlice;
        }
        throw null;
    }

    private final int onWarmupCompleted(String str) throws NumberFormatException {
        int i = 2 % 2;
        int i2 = Integer.parseInt(StringsKt.slice(onNavigationEvent(str), new IntRange(6, 7)));
        int i3 = onExtraCallback + 93;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return i2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final String onNavigationEvent(String str) {
        String strReplace$default;
        int i;
        char c;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 37;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            strReplace$default = StringsKt.replace$default(str, "-", "", false, 5, (Object) null);
            i = 59;
            c = '\n';
        } else {
            strReplace$default = StringsKt.replace$default(str, "-", "", false, 4, (Object) null);
            i = 32;
            c = '0';
        }
        return StringsKt.padEnd(strReplace$default, i, c);
    }
}
