package o;

import kotlin.collections.ArraysKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdawXVv9xwdiGsnLD64xJ_ruHAm57M {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    private float[] onExtraCallback = r8lambdajZetUjzyoReOiAaP9UrM0Uy5Lok.onWarmupCompleted();
    private r8lambdak4cK2T7U59NdcUrQoctbWqO9xNM onExtraCallbackWithResult;
    private int onWarmupCompleted;

    public final float[] onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 103;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onWarmupCompleted;
        }
        throw null;
    }

    public final void onWarmupCompleted(@NotNull float[] fArr) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 1;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(fArr, "");
        if (onNavigationEvent(this.onExtraCallback, fArr)) {
            return;
        }
        int i4 = IAuthTabCallback + 59;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        this.onExtraCallback = fArr;
        this.onWarmupCompleted++;
        r8lambdak4cK2T7U59NdcUrQoctbWqO9xNM r8lambdak4ck2t7u59ndcurqoctbwqo9xnm = this.onExtraCallbackWithResult;
        if (r8lambdak4ck2t7u59ndcurqoctbwqo9xnm != null) {
            r8lambdak4ck2t7u59ndcurqoctbwqo9xnm.IAuthTabCallbackDefault();
        }
    }

    private final boolean onNavigationEvent(float[] fArr, float[] fArr2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 49;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int length = fArr.length;
            int length2 = fArr2.length;
            throw null;
        }
        if (fArr.length != fArr2.length) {
            return false;
        }
        IntIterator it = ArraysKt.getIndices(fArr).iterator();
        while (it.hasNext()) {
            int i3 = onNavigationEvent + 81;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int iNextInt = it.nextInt();
                int i4 = 8 / 0;
                if (fArr[iNextInt] != fArr2[iNextInt]) {
                    return false;
                }
            } else {
                int iNextInt2 = it.nextInt();
                if (fArr[iNextInt2] != fArr2[iNextInt2]) {
                    return false;
                }
            }
        }
        int i5 = IAuthTabCallback + 71;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return true;
        }
        throw null;
    }

    private final void onExtraCallbackWithResult(r8lambdak4cK2T7U59NdcUrQoctbWqO9xNM r8lambdak4ck2t7u59ndcurqoctbwqo9xnm) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 23;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        this.onExtraCallbackWithResult = r8lambdak4ck2t7u59ndcurqoctbwqo9xnm;
        int i5 = i3 + 61;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    private final void onWarmupCompleted(r8lambdak4cK2T7U59NdcUrQoctbWqO9xNM r8lambdak4ck2t7u59ndcurqoctbwqo9xnm) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 105;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        if (this.onExtraCallbackWithResult == r8lambdak4ck2t7u59ndcurqoctbwqo9xnm) {
            this.onExtraCallbackWithResult = null;
            int i5 = i2 + 79;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    public final void onNavigationEvent(@Nullable r8lambdak4cK2T7U59NdcUrQoctbWqO9xNM r8lambdak4ck2t7u59ndcurqoctbwqo9xnm, @NotNull r8lambdak4cK2T7U59NdcUrQoctbWqO9xNM r8lambdak4ck2t7u59ndcurqoctbwqo9xnm2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdak4ck2t7u59ndcurqoctbwqo9xnm2, "");
        if (r8lambdak4ck2t7u59ndcurqoctbwqo9xnm != null) {
            int i2 = IAuthTabCallback + 119;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                onWarmupCompleted(r8lambdak4ck2t7u59ndcurqoctbwqo9xnm);
                throw null;
            }
            onWarmupCompleted(r8lambdak4ck2t7u59ndcurqoctbwqo9xnm);
        }
        onExtraCallbackWithResult(r8lambdak4ck2t7u59ndcurqoctbwqo9xnm2);
        int i3 = IAuthTabCallback + 73;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void onNavigationEvent(@NotNull r8lambdak4cK2T7U59NdcUrQoctbWqO9xNM r8lambdak4ck2t7u59ndcurqoctbwqo9xnm) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 25;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdak4ck2t7u59ndcurqoctbwqo9xnm, "");
        onWarmupCompleted(r8lambdak4ck2t7u59ndcurqoctbwqo9xnm);
        int i4 = IAuthTabCallback + 101;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }
}
