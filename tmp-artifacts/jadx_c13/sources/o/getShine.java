package o;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.IntCompanionObject;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getShine {
    public static final djExternalSyntheticApiModelOutline0 onWarmupCompleted = new djExternalSyntheticApiModelOutline0("NO_VALUE");

    public static /* synthetic */ getBorderRadius onWarmupCompleted(int i, int i2, CloseableUtils closeableUtils, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            closeableUtils = CloseableUtils.SUSPEND;
        }
        return onExtraCallback(i, i2, closeableUtils);
    }

    public static final <T> getBorderRadius<T> onExtraCallback(int i, int i2, @NotNull CloseableUtils closeableUtils) {
        if (i < 0) {
            throw new IllegalArgumentException(("replay cannot be negative, but was " + i).toString());
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(("extraBufferCapacity cannot be negative, but was " + i2).toString());
        }
        if (i <= 0 && i2 <= 0 && closeableUtils != CloseableUtils.SUSPEND) {
            throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + closeableUtils).toString());
        }
        int i3 = i2 + i;
        if (i3 < 0) {
            i3 = IntCompanionObject.MAX_VALUE;
        }
        return new getMaxCornerRadius(i, i3, closeableUtils);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object onExtraCallbackWithResult(Object[] objArr, long j) {
        return objArr[((int) j) & (objArr.length - 1)];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallbackWithResult(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }

    public static final <T> IAnimation<T> onWarmupCompleted(@NotNull getTileModeX<? extends T> gettilemodex, @NotNull CoroutineContext coroutineContext, int i, @NotNull CloseableUtils closeableUtils) {
        return ((i == 0 || i == -3) && closeableUtils == CloseableUtils.SUSPEND) ? gettilemodex : new setScroller(gettilemodex, coroutineContext, i, closeableUtils);
    }
}
