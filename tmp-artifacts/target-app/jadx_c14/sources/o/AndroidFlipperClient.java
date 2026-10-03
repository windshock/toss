package o;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class AndroidFlipperClient implements supportedLocalesOf {
    public static final int $stable = 0;
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    private final Long amount;
    private final List<String> sourceIds;
    private final String timelineTime;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 79;
            IAuthTabCallback = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!(obj instanceof AndroidFlipperClient)) {
            int i3 = onNavigationEvent;
            int i4 = i3 + 67;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 53;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 == 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        AndroidFlipperClient androidFlipperClient = (AndroidFlipperClient) obj;
        if (!Intrinsics.areEqual(this.sourceIds, androidFlipperClient.sourceIds)) {
            int i7 = onNavigationEvent + 25;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.timelineTime, androidFlipperClient.timelineTime)) {
            return Intrinsics.areEqual(this.amount, androidFlipperClient.amount);
        }
        int i9 = IAuthTabCallback + 75;
        onNavigationEvent = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042 A[PHI: r1 r3 r4
      0x0042: PHI (r1v12 int) = (r1v5 int), (r1v14 int) binds: [B:8:0x0031, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
      0x0042: PHI (r3v4 int) = (r3v1 int), (r3v6 int) binds: [B:8:0x0031, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
      0x0042: PHI (r4v4 java.lang.Long) = (r4v0 java.lang.Long), (r4v5 java.lang.Long) binds: [B:8:0x0031, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033 A[PHI: r1 r3
      0x0033: PHI (r1v6 int) = (r1v5 int), (r1v14 int) binds: [B:8:0x0031, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
      0x0033: PHI (r3v2 int) = (r3v1 int), (r3v6 int) binds: [B:8:0x0031, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.AndroidFlipperClient.IAuthTabCallback
            int r1 = r1 + 25
            int r2 = r1 % 128
            o.AndroidFlipperClient.onNavigationEvent = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L23
            java.util.List<java.lang.String> r1 = r6.sourceIds
            int r1 = r1.hashCode()
            java.lang.String r3 = r6.timelineTime
            int r3 = r3.hashCode()
            java.lang.Long r4 = r6.amount
            r5 = 97
            int r5 = r5 / r2
            if (r4 != 0) goto L42
            goto L33
        L23:
            java.util.List<java.lang.String> r1 = r6.sourceIds
            int r1 = r1.hashCode()
            java.lang.String r3 = r6.timelineTime
            int r3 = r3.hashCode()
            java.lang.Long r4 = r6.amount
            if (r4 != 0) goto L42
        L33:
            int r4 = o.AndroidFlipperClient.onNavigationEvent
            int r4 = r4 + 113
            int r5 = r4 % 128
            o.AndroidFlipperClient.IAuthTabCallback = r5
            int r4 = r4 % r0
            if (r4 == 0) goto L46
            r0 = 5
            int r0 = r0 % 3
            goto L46
        L42:
            int r2 = r4.hashCode()
        L46:
            int r1 = r1 * 31
            int r1 = r1 + r3
            int r1 = r1 * 31
            int r1 = r1 + r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AndroidFlipperClient.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SaveTransactionCustomAmountRequest(sourceIds=" + this.sourceIds + ", timelineTime=" + this.timelineTime + ", amount=" + this.amount + ")";
        int i2 = onNavigationEvent + 43;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public AndroidFlipperClient(@NotNull List<String> list, @NotNull String str, @Nullable Long l) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.sourceIds = list;
        this.timelineTime = str;
        this.amount = l;
    }
}
