package o;

import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
import okio.AsyncTimeout;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TTHistoryActivity1 {
    public int onExtraCallbackWithResult;
    public AsyncTimeout[] onWarmupCompleted = new AsyncTimeout[8];

    public final AsyncTimeout onExtraCallback() {
        return this.onWarmupCompleted[1];
    }

    public final void onWarmupCompleted(@NotNull AsyncTimeout asyncTimeout) {
        Intrinsics.checkNotNullParameter(asyncTimeout, "");
        int i = this.onExtraCallbackWithResult + 1;
        this.onExtraCallbackWithResult = i;
        AsyncTimeout[] asyncTimeoutArr = this.onWarmupCompleted;
        if (i == asyncTimeoutArr.length) {
            AsyncTimeout[] asyncTimeoutArr2 = new AsyncTimeout[i << 1];
            ArraysKt___ArraysJvmKt.copyInto$default(asyncTimeoutArr, asyncTimeoutArr2, 0, 0, 0, 14, (Object) null);
            this.onWarmupCompleted = asyncTimeoutArr2;
        }
        IAuthTabCallback(i, asyncTimeout);
    }

    public final void onExtraCallback(@NotNull AsyncTimeout asyncTimeout) {
        Intrinsics.checkNotNullParameter(asyncTimeout, "");
        int i = asyncTimeout.onExtraCallbackWithResult;
        if (i == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i2 = this.onExtraCallbackWithResult;
        AsyncTimeout asyncTimeout2 = this.onWarmupCompleted[i2];
        Intrinsics.checkNotNull(asyncTimeout2);
        asyncTimeout.onExtraCallbackWithResult = -1;
        this.onWarmupCompleted[i2] = null;
        this.onExtraCallbackWithResult = i2 - 1;
        if (asyncTimeout == asyncTimeout2) {
            return;
        }
        int iCompare = Intrinsics.compare(0L, asyncTimeout2.getTimeoutAt$okio() - asyncTimeout.getTimeoutAt$okio());
        if (iCompare == 0) {
            this.onWarmupCompleted[i] = asyncTimeout2;
            asyncTimeout2.onExtraCallbackWithResult = i;
        } else if (iCompare < 0) {
            onNavigationEvent(i, asyncTimeout2);
        } else {
            IAuthTabCallback(i, asyncTimeout2);
        }
    }

    private final void IAuthTabCallback(int i, AsyncTimeout asyncTimeout) {
        while (true) {
            int i2 = i >> 1;
            if (i2 == 0) {
                break;
            }
            AsyncTimeout asyncTimeout2 = this.onWarmupCompleted[i2];
            Intrinsics.checkNotNull(asyncTimeout2);
            if (Intrinsics.compare(0L, asyncTimeout.getTimeoutAt$okio() - asyncTimeout2.getTimeoutAt$okio()) <= 0) {
                break;
            }
            asyncTimeout2.onExtraCallbackWithResult = i;
            this.onWarmupCompleted[i] = asyncTimeout2;
            i = i2;
        }
        this.onWarmupCompleted[i] = asyncTimeout;
        asyncTimeout.onExtraCallbackWithResult = i;
    }

    private final void onNavigationEvent(int i, AsyncTimeout asyncTimeout) {
        AsyncTimeout asyncTimeout2;
        while (true) {
            int i2 = i << 1;
            int i3 = i2 + 1;
            int i4 = this.onExtraCallbackWithResult;
            if (i3 > i4) {
                if (i2 > i4) {
                    break;
                }
                asyncTimeout2 = this.onWarmupCompleted[i2];
                Intrinsics.checkNotNull(asyncTimeout2);
            } else {
                asyncTimeout2 = this.onWarmupCompleted[i2];
                Intrinsics.checkNotNull(asyncTimeout2);
                AsyncTimeout asyncTimeout3 = this.onWarmupCompleted[i3];
                Intrinsics.checkNotNull(asyncTimeout3);
                if (Intrinsics.compare(0L, asyncTimeout3.getTimeoutAt$okio() - asyncTimeout2.getTimeoutAt$okio()) >= 0) {
                    asyncTimeout2 = asyncTimeout3;
                }
            }
            if (Intrinsics.compare(0L, asyncTimeout2.getTimeoutAt$okio() - asyncTimeout.getTimeoutAt$okio()) <= 0) {
                break;
            }
            int i5 = asyncTimeout2.onExtraCallbackWithResult;
            asyncTimeout2.onExtraCallbackWithResult = i;
            this.onWarmupCompleted[i] = asyncTimeout2;
            i = i5;
        }
        this.onWarmupCompleted[i] = asyncTimeout;
        asyncTimeout.onExtraCallbackWithResult = i;
    }
}
