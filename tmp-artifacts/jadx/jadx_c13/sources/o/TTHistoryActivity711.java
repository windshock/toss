package o;

import java.io.EOFException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import o.TTBaseActivity;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TTHistoryActivity711 {
    private static final byte[] IAuthTabCallback = TTHistoryActivity6.onExtraCallback("0123456789abcdef");
    private static final long[] onNavigationEvent = {-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, LongCompanionObject.MAX_VALUE};

    public static final byte[] onWarmupCompleted() {
        return IAuthTabCallback;
    }

    public static final boolean onNavigationEvent(@NotNull TTHistoryActivity2 tTHistoryActivity2, int i, @NotNull byte[] bArr, int i2, int i3) {
        Intrinsics.checkNotNullParameter(tTHistoryActivity2, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        int i4 = tTHistoryActivity2.limit;
        byte[] bArr2 = tTHistoryActivity2.data;
        while (i2 < i3) {
            if (i == i4) {
                tTHistoryActivity2 = tTHistoryActivity2.next;
                Intrinsics.checkNotNull(tTHistoryActivity2);
                byte[] bArr3 = tTHistoryActivity2.data;
                bArr2 = bArr3;
                i = tTHistoryActivity2.pos;
                i4 = tTHistoryActivity2.limit;
            }
            if (bArr2[i] != bArr[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public static final String onNavigationEvent(@NotNull TTBaseActivity tTBaseActivity, long j) throws EOFException {
        Intrinsics.checkNotNullParameter(tTBaseActivity, "");
        if (j > 0) {
            long j2 = j - 1;
            if (tTBaseActivity.onExtraCallbackWithResult(j2) == 13) {
                String strIAuthTabCallback = tTBaseActivity.IAuthTabCallback(j2);
                tTBaseActivity.IAuthTabCallbackDefault(2L);
                return strIAuthTabCallback;
            }
        }
        String strIAuthTabCallback2 = tTBaseActivity.IAuthTabCallback(j);
        tTBaseActivity.IAuthTabCallbackDefault(1L);
        return strIAuthTabCallback2;
    }

    public static /* synthetic */ int onNavigationEvent(TTBaseActivity tTBaseActivity, TTFullScreenVideoActivity1 tTFullScreenVideoActivity1, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return onWarmupCompleted(tTBaseActivity, tTFullScreenVideoActivity1, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a4, code lost:
    
        if (r19 == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a6, code lost:
    
        return -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a7, code lost:
    
        return r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009e A[LOOP:0: B:8:0x0024->B:45:0x009e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int onWarmupCompleted(@NotNull TTBaseActivity tTBaseActivity, @NotNull TTFullScreenVideoActivity1 tTFullScreenVideoActivity1, boolean z) {
        int i;
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(tTBaseActivity, "");
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity1, "");
        TTHistoryActivity2 tTHistoryActivity2 = tTBaseActivity.head;
        int i4 = -1;
        if (tTHistoryActivity2 == null) {
            return z ? -2 : -1;
        }
        byte[] bArr = tTHistoryActivity2.data;
        int i5 = tTHistoryActivity2.pos;
        int i6 = tTHistoryActivity2.limit;
        int[] iArrOnExtraCallback = tTFullScreenVideoActivity1.onExtraCallback();
        TTHistoryActivity2 tTHistoryActivity22 = tTHistoryActivity2;
        int i7 = -1;
        int i8 = 0;
        loop0: while (true) {
            int i9 = iArrOnExtraCallback[i8];
            int i10 = i8 + 2;
            int i11 = iArrOnExtraCallback[i8 + 1];
            if (i11 != i4) {
                i7 = i11;
            }
            if (tTHistoryActivity22 == null) {
                break;
            }
            if (i9 >= 0) {
                int i12 = i5 + 1;
                byte b = bArr[i5];
                for (int i13 = i10; i13 != i10 + i9; i13++) {
                    if ((b & 255) == iArrOnExtraCallback[i13]) {
                        int i14 = iArrOnExtraCallback[i13 + i9];
                        if (i12 == i6) {
                            tTHistoryActivity22 = tTHistoryActivity22.next;
                            Intrinsics.checkNotNull(tTHistoryActivity22);
                            i12 = tTHistoryActivity22.pos;
                            bArr = tTHistoryActivity22.data;
                            i6 = tTHistoryActivity22.limit;
                            if (tTHistoryActivity22 == tTHistoryActivity2) {
                                tTHistoryActivity22 = null;
                            }
                        }
                        i5 = i12;
                        i = i14;
                        if (i < 0) {
                        }
                    }
                }
                break loop0;
            }
            int i15 = i10;
            while (true) {
                int i16 = i5 + 1;
                int i17 = i15 + 1;
                if ((bArr[i5] & 255) != iArrOnExtraCallback[i15]) {
                    break loop0;
                }
                boolean z2 = i17 == i10 - i9;
                if (i16 == i6) {
                    Intrinsics.checkNotNull(tTHistoryActivity22);
                    TTHistoryActivity2 tTHistoryActivity23 = tTHistoryActivity22.next;
                    Intrinsics.checkNotNull(tTHistoryActivity23);
                    i3 = tTHistoryActivity23.pos;
                    byte[] bArr2 = tTHistoryActivity23.data;
                    i2 = tTHistoryActivity23.limit;
                    if (tTHistoryActivity23 != tTHistoryActivity2) {
                        tTHistoryActivity22 = tTHistoryActivity23;
                        bArr = bArr2;
                    } else {
                        if (!z2) {
                            break loop0;
                        }
                        bArr = bArr2;
                        tTHistoryActivity22 = null;
                    }
                } else {
                    i2 = i6;
                    i3 = i16;
                }
                if (z2) {
                    i = iArrOnExtraCallback[i17];
                    i5 = i3;
                    i6 = i2;
                    break;
                }
                i5 = i3;
                i6 = i2;
                i15 = i17;
            }
            if (i < 0) {
                return i;
            }
            i8 = -i;
            i4 = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int onNavigationEvent(long j) {
        int iNumberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j)) * 10) >>> 5;
        return iNumberOfLeadingZeros + (j > onNavigationEvent[iNumberOfLeadingZeros] ? 1 : 0);
    }

    public static final long onExtraCallback(@NotNull TTBaseActivity tTBaseActivity, @NotNull TTBaseLandingPageActivity tTBaseLandingPageActivity, long j, long j2, int i, int i2) {
        TTHistoryActivity2 tTHistoryActivity2;
        int i3;
        long j3 = j;
        long jICustomTabsCallbackDefault = j2;
        Intrinsics.checkNotNullParameter(tTBaseActivity, "");
        Intrinsics.checkNotNullParameter(tTBaseLandingPageActivity, "");
        long j4 = i2;
        TTAppOpenAdActivity6.onExtraCallbackWithResult(tTBaseLandingPageActivity.access100(), i, j4);
        if (i2 <= 0) {
            throw new IllegalArgumentException("byteCount == 0");
        }
        long jICustomTabsCallbackDefault2 = 0;
        if (j3 < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j3).toString());
        }
        if (j3 > jICustomTabsCallbackDefault) {
            throw new IllegalArgumentException(("fromIndex > toIndex: " + j3 + " > " + jICustomTabsCallbackDefault).toString());
        }
        if (jICustomTabsCallbackDefault > tTBaseActivity.ICustomTabsCallbackDefault()) {
            jICustomTabsCallbackDefault = tTBaseActivity.ICustomTabsCallbackDefault();
        }
        long j5 = -1;
        if (j3 == jICustomTabsCallbackDefault || (tTHistoryActivity2 = tTBaseActivity.head) == null) {
            return -1L;
        }
        if (tTBaseActivity.ICustomTabsCallbackDefault() - j3 >= j3) {
            while (true) {
                long j6 = (tTHistoryActivity2.limit - tTHistoryActivity2.pos) + jICustomTabsCallbackDefault2;
                if (j6 > j3) {
                    break;
                }
                tTHistoryActivity2 = tTHistoryActivity2.next;
                Intrinsics.checkNotNull(tTHistoryActivity2);
                jICustomTabsCallbackDefault2 = j6;
            }
            byte[] bArrIAuthTabCallbackStub = tTBaseLandingPageActivity.IAuthTabCallbackStub();
            byte b = bArrIAuthTabCallbackStub[i];
            long jMin = Math.min(jICustomTabsCallbackDefault, (tTBaseActivity.ICustomTabsCallbackDefault() - j4) + 1);
            while (jICustomTabsCallbackDefault2 < jMin) {
                byte[] bArr = tTHistoryActivity2.data;
                int iMin = (int) Math.min(tTHistoryActivity2.limit, (tTHistoryActivity2.pos + jMin) - jICustomTabsCallbackDefault2);
                i3 = (int) ((tTHistoryActivity2.pos + j3) - jICustomTabsCallbackDefault2);
                while (i3 < iMin) {
                    if (bArr[i3] == b && onNavigationEvent(tTHistoryActivity2, i3 + 1, bArrIAuthTabCallbackStub, i + 1, i2)) {
                    }
                    i3++;
                }
                jICustomTabsCallbackDefault2 += tTHistoryActivity2.limit - tTHistoryActivity2.pos;
                tTHistoryActivity2 = tTHistoryActivity2.next;
                Intrinsics.checkNotNull(tTHistoryActivity2);
                j3 = jICustomTabsCallbackDefault2;
            }
            return -1L;
        }
        jICustomTabsCallbackDefault2 = tTBaseActivity.ICustomTabsCallbackDefault();
        while (jICustomTabsCallbackDefault2 > j3) {
            tTHistoryActivity2 = tTHistoryActivity2.prev;
            Intrinsics.checkNotNull(tTHistoryActivity2);
            jICustomTabsCallbackDefault2 -= tTHistoryActivity2.limit - tTHistoryActivity2.pos;
        }
        byte[] bArrIAuthTabCallbackStub2 = tTBaseLandingPageActivity.IAuthTabCallbackStub();
        byte b2 = bArrIAuthTabCallbackStub2[i];
        long jMin2 = Math.min(jICustomTabsCallbackDefault, (tTBaseActivity.ICustomTabsCallbackDefault() - j4) + 1);
        while (jICustomTabsCallbackDefault2 < jMin2) {
            byte[] bArr2 = tTHistoryActivity2.data;
            int iMin2 = (int) Math.min(tTHistoryActivity2.limit, (tTHistoryActivity2.pos + jMin2) - jICustomTabsCallbackDefault2);
            i3 = (int) ((tTHistoryActivity2.pos + j3) - jICustomTabsCallbackDefault2);
            while (i3 < iMin2) {
                if (bArr2[i3] != b2 || !onNavigationEvent(tTHistoryActivity2, i3 + 1, bArrIAuthTabCallbackStub2, i + 1, i2)) {
                    i3++;
                }
            }
            jICustomTabsCallbackDefault2 += tTHistoryActivity2.limit - tTHistoryActivity2.pos;
            tTHistoryActivity2 = tTHistoryActivity2.next;
            Intrinsics.checkNotNull(tTHistoryActivity2);
            j3 = jICustomTabsCallbackDefault2;
            j5 = -1;
        }
        return j5;
        return (i3 - tTHistoryActivity2.pos) + jICustomTabsCallbackDefault2;
    }

    public static final TTBaseActivity.onNavigationEvent IAuthTabCallback(@NotNull TTBaseActivity tTBaseActivity, @NotNull TTBaseActivity.onNavigationEvent onnavigationevent) {
        Intrinsics.checkNotNullParameter(tTBaseActivity, "");
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        TTBaseActivity.onNavigationEvent onnavigationeventOnWarmupCompleted = TTAppOpenAdActivity6.onWarmupCompleted(onnavigationevent);
        if (onnavigationeventOnWarmupCompleted.onExtraCallback != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        onnavigationeventOnWarmupCompleted.onExtraCallback = tTBaseActivity;
        onnavigationeventOnWarmupCompleted.onWarmupCompleted = true;
        return onnavigationeventOnWarmupCompleted;
    }
}
