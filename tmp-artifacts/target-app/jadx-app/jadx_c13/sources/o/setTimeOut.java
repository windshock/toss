package o;

import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setTimeOut {
    private static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    private static final long[] onExtraCallbackWithResult = new long[0];
    private long IAuthTabCallback;
    private final Function2<SerialDescriptor, Integer, Boolean> onExtraCallback;
    private final long[] onNavigationEvent;
    private final SerialDescriptor onWarmupCompleted;

    /* JADX WARN: Multi-variable type inference failed */
    public setTimeOut(@NotNull SerialDescriptor serialDescriptor, @NotNull Function2<? super SerialDescriptor, ? super Integer, Boolean> function2) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        Intrinsics.checkNotNullParameter(function2, "");
        this.onWarmupCompleted = serialDescriptor;
        this.onExtraCallback = function2;
        int iOnExtraCallback = serialDescriptor.onExtraCallback();
        if (iOnExtraCallback <= 64) {
            this.IAuthTabCallback = iOnExtraCallback != 64 ? (-1) << iOnExtraCallback : 0L;
            this.onNavigationEvent = onExtraCallbackWithResult;
        } else {
            this.IAuthTabCallback = 0L;
            this.onNavigationEvent = onNavigationEvent(iOnExtraCallback);
        }
    }

    static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }

    public final void onExtraCallback(int i) {
        if (i < 64) {
            this.IAuthTabCallback |= 1 << i;
        } else {
            IAuthTabCallback(i);
        }
    }

    public final int IAuthTabCallback() {
        int iNumberOfTrailingZeros;
        int iOnExtraCallback = this.onWarmupCompleted.onExtraCallback();
        do {
            long j = this.IAuthTabCallback;
            if (j == -1) {
                if (iOnExtraCallback > 64) {
                    return onExtraCallbackWithResult();
                }
                return -1;
            }
            iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j);
            this.IAuthTabCallback |= 1 << iNumberOfTrailingZeros;
        } while (!this.onExtraCallback.invoke(this.onWarmupCompleted, Integer.valueOf(iNumberOfTrailingZeros)).booleanValue());
        return iNumberOfTrailingZeros;
    }

    private final long[] onNavigationEvent(int i) {
        long[] jArr = new long[(i - 1) >>> 6];
        if ((i & 63) != 0) {
            jArr[ArraysKt___ArraysKt.getLastIndex(jArr)] = (-1) << i;
        }
        return jArr;
    }

    private final void IAuthTabCallback(int i) {
        int i2 = (i >>> 6) - 1;
        long[] jArr = this.onNavigationEvent;
        jArr[i2] = jArr[i2] | (1 << (i & 63));
    }

    private final int onExtraCallbackWithResult() {
        int length = this.onNavigationEvent.length;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            long j = this.onNavigationEvent[i];
            while (j != -1) {
                int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j);
                j |= 1 << iNumberOfTrailingZeros;
                int i3 = iNumberOfTrailingZeros + (i2 << 6);
                if (this.onExtraCallback.invoke(this.onWarmupCompleted, Integer.valueOf(i3)).booleanValue()) {
                    this.onNavigationEvent[i] = j;
                    return i3;
                }
            }
            this.onNavigationEvent[i] = j;
            i = i2;
        }
        return -1;
    }
}
