package o;

import java.util.Iterator;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class setDefaultValue {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    public static /* synthetic */ void onExtraCallbackWithResult(StringBuffer stringBuffer, IntRange intRange, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 25;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0 && (i & 1) != 0) {
            intRange = StringsKt.getIndices(stringBuffer);
            int i4 = onExtraCallbackWithResult + 27;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        onWarmupCompleted(stringBuffer, intRange);
    }

    public static final void onWarmupCompleted(@NotNull StringBuffer stringBuffer, @NotNull IntRange intRange) {
        Iterator it;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 9;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(stringBuffer, "");
            Intrinsics.checkNotNullParameter(intRange, "");
            it = intRange.iterator();
            int i3 = 88 / 0;
        } else {
            Intrinsics.checkNotNullParameter(stringBuffer, "");
            Intrinsics.checkNotNullParameter(intRange, "");
            it = intRange.iterator();
        }
        while (it.hasNext()) {
            int i4 = onExtraCallbackWithResult + 11;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            stringBuffer.setCharAt(((IntIterator) it).nextInt(), (char) 0);
        }
        stringBuffer.delete(intRange.getFirst(), intRange.getLast() + 1);
    }
}
