package o;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TTHistoryActivity {
    private static final int IAuthTabCallback;
    private static final AtomicReference<TTHistoryActivity2>[] onNavigationEvent;
    public static final TTHistoryActivity onExtraCallbackWithResult = new TTHistoryActivity();
    private static final int onWarmupCompleted = Imgproc.FLOODFILL_FIXED_RANGE;
    private static final TTHistoryActivity2 onExtraCallback = new TTHistoryActivity2(new byte[0], 0, 0, false, false);

    private TTHistoryActivity() {
    }

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() << 1) - 1);
        IAuthTabCallback = iHighestOneBit;
        AtomicReference<TTHistoryActivity2>[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference<>();
        }
        onNavigationEvent = atomicReferenceArr;
    }

    @JvmStatic
    public static final TTHistoryActivity2 onWarmupCompleted() {
        AtomicReference<TTHistoryActivity2> atomicReferenceOnExtraCallback = onExtraCallbackWithResult.onExtraCallback();
        TTHistoryActivity2 tTHistoryActivity2 = onExtraCallback;
        TTHistoryActivity2 andSet = atomicReferenceOnExtraCallback.getAndSet(tTHistoryActivity2);
        if (andSet == tTHistoryActivity2) {
            return new TTHistoryActivity2();
        }
        if (andSet == null) {
            atomicReferenceOnExtraCallback.set(null);
            return new TTHistoryActivity2();
        }
        atomicReferenceOnExtraCallback.set(andSet.next);
        andSet.next = null;
        andSet.limit = 0;
        return andSet;
    }

    @JvmStatic
    public static final void onExtraCallback(@NotNull TTHistoryActivity2 tTHistoryActivity2) {
        AtomicReference<TTHistoryActivity2> atomicReferenceOnExtraCallback;
        TTHistoryActivity2 tTHistoryActivity22;
        TTHistoryActivity2 andSet;
        Intrinsics.checkNotNullParameter(tTHistoryActivity2, "");
        if (tTHistoryActivity2.next != null || tTHistoryActivity2.prev != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (tTHistoryActivity2.shared || (andSet = (atomicReferenceOnExtraCallback = onExtraCallbackWithResult.onExtraCallback()).getAndSet((tTHistoryActivity22 = onExtraCallback))) == tTHistoryActivity22) {
            return;
        }
        int i = andSet != null ? andSet.limit : 0;
        if (i >= onWarmupCompleted) {
            atomicReferenceOnExtraCallback.set(andSet);
            return;
        }
        tTHistoryActivity2.next = andSet;
        tTHistoryActivity2.pos = 0;
        tTHistoryActivity2.limit = i + TTHistoryActivity2.SIZE;
        atomicReferenceOnExtraCallback.set(tTHistoryActivity2);
    }

    private final AtomicReference<TTHistoryActivity2> onExtraCallback() {
        return onNavigationEvent[(int) (Thread.currentThread().getId() & (IAuthTabCallback - 1))];
    }
}
