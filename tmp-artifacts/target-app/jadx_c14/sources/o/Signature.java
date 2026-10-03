package o;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class Signature {
    public static final int $stable = 0;

    @SerializedName("accountIds")
    private final List<String> accountIds;
    private static final byte[] $$a = {94, -43, -105, 125};
    private static final int $$b = 36;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private static int onNavigationEvent = 478309101;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r7, short r8, int r9) {
        /*
            int r7 = r7 * 2
            int r7 = 3 - r7
            int r9 = r9 * 3
            int r9 = r9 + 1
            byte[] r0 = o.Signature.$$a
            int r8 = r8 * 2
            int r8 = r8 + 105
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L17
            r8 = r7
            r3 = r9
            r5 = r2
            goto L2c
        L17:
            r3 = r2
            r6 = r8
            r8 = r7
            r7 = r6
        L1b:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L28:
            int r8 = r8 + 1
            r3 = r0[r8]
        L2c:
            int r3 = -r3
            int r7 = r7 + r3
            r3 = r5
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: o.Signature.$$c(int, short, int):java.lang.String");
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 51;
        int i4 = i3 % 128;
        onExtraCallbackWithResult = i4;
        int i5 = i3 % 2;
        Object obj2 = null;
        if (this == obj) {
            int i6 = i2 + 35;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0) {
                return true;
            }
            obj2.hashCode();
            throw null;
        }
        if (!(obj instanceof Signature)) {
            int i7 = i4 + 113;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.accountIds, ((Signature) obj).accountIds)) {
            return true;
        }
        int i9 = onWarmupCompleted + 89;
        int i10 = i9 % 128;
        onExtraCallbackWithResult = i10;
        int i11 = i9 % 2;
        int i12 = i10 + 65;
        onWarmupCompleted = i12 % 128;
        if (i12 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 77;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.accountIds.hashCode();
        int i4 = onExtraCallbackWithResult + 39;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        List<String> list = this.accountIds;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(View.MeasureSpec.makeMeasureSpec(0, 0) + 32, 22 - TextUtils.getTrimmedLength(""), new char[]{65534, 65477, 17, 16, 2, 18, 14, 2, 65519, 2, 0, 11, 65534, '\t', 65534, 65503, 65534, 17, 65534, 1, 22, 65514, 65498, 16, 1, 65510, 17, 11, 18, '\f', 0, 0}, true, TextUtils.getTrimmedLength("") + 295, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(list);
        Object[] objArr2 = new Object[1];
        a((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 1 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), new char[]{0}, false, View.MeasureSpec.makeMeasureSpec(0, 0) + 237, objArr2);
        sb.append(((String) objArr2[0]).intern());
        String string = sb.toString();
        int i2 = onExtraCallbackWithResult + 109;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 83 / 0;
        }
        return string;
    }

    public Signature(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.accountIds = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r23, int r24, char[] r25, boolean r26, int r27, java.lang.Object[] r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.Signature.a(int, int, char[], boolean, int, java.lang.Object[]):void");
    }
}
