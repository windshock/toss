package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.IntCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class zb {
    public static /* synthetic */ nLockFileSegment onExtraCallbackWithResult(int i, CloseableUtils closeableUtils, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            closeableUtils = CloseableUtils.SUSPEND;
        }
        if ((i2 & 4) != 0) {
            function1 = null;
        }
        return onWarmupCompleted(i, closeableUtils, function1);
    }

    public static final <E> nLockFileSegment<E> onWarmupCompleted(int i, @NotNull CloseableUtils closeableUtils, @Nullable Function1<? super E, Unit> function1) {
        if (i == -2) {
            return closeableUtils == CloseableUtils.SUSPEND ? new nLockFile(nLockFileSegment.a_.onExtraCallbackWithResult(), function1) : new dy(1, closeableUtils, function1);
        }
        if (i == -1) {
            if (closeableUtils != CloseableUtils.SUSPEND) {
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            }
            return new dy(1, CloseableUtils.DROP_OLDEST, function1);
        }
        if (i != 0) {
            if (i != Integer.MAX_VALUE) {
                return closeableUtils == CloseableUtils.SUSPEND ? new nLockFile(i, function1) : new dy(i, closeableUtils, function1);
            }
            return new nLockFile(IntCompanionObject.MAX_VALUE, function1);
        }
        if (closeableUtils == CloseableUtils.SUSPEND) {
            return new nLockFile(0, function1);
        }
        return new dy(1, closeableUtils, function1);
    }
}
