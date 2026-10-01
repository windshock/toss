package o;

import kotlin.collections.ArraysKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class onPageHide {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    public static final void IAuthTabCallback(@NotNull byte[] bArr) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(bArr, "");
        IntIterator it = ArraysKt.getIndices(bArr).iterator();
        int i2 = onExtraCallbackWithResult + 17;
        onNavigationEvent = i2 % 128;
        while (true) {
            int i3 = i2 % 2;
            if (!it.hasNext()) {
                return;
            }
            bArr[it.nextInt()] = 0;
            i2 = onNavigationEvent + 117;
            onExtraCallbackWithResult = i2 % 128;
        }
    }

    public static final String onExtraCallback(@NotNull byte[] bArr) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 89;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(bArr, "");
        char[] cArr = new char[bArr.length << 1];
        int length = bArr.length;
        int i4 = 0;
        while (i4 < length) {
            byte b = bArr[i4];
            int i5 = i4 << 1;
            cArr[i5] = "0123456789ABCDEF".charAt((b & 255) >> 4);
            cArr[i5 + 1] = "0123456789ABCDEF".charAt(b & 15);
            i4++;
            int i6 = onNavigationEvent + 73;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
        }
        return new String(cArr);
    }
}
