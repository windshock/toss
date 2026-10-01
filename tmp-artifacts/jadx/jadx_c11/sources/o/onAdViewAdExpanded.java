package o;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class onAdViewAdExpanded {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private final AtomicBoolean onWarmupCompleted = new AtomicBoolean(false);

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        r6.invoke();
        r6 = o.onAdViewAdExpanded.onExtraCallbackWithResult + 85;
        o.onAdViewAdExpanded.onExtraCallback = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
    
        if ((r6 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
    
        r6 = 80 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        if (r5.onWarmupCompleted.compareAndSet(true, false) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if (r5.onWarmupCompleted.compareAndSet(false, true) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        r6 = o.onAdViewAdExpanded.onExtraCallback + 67;
        o.onAdViewAdExpanded.onExtraCallbackWithResult = r6 % 128;
        r6 = r6 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean IAuthTabCallback(@NotNull Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 109;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function0, "");
        } else {
            Intrinsics.checkNotNullParameter(function0, "");
        }
    }

    public final void onNavigationEvent() {
        AtomicBoolean atomicBoolean;
        boolean z;
        int i = 2 % 2;
        int i2 = onExtraCallback + 17;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            atomicBoolean = this.onWarmupCompleted;
            z = true;
        } else {
            atomicBoolean = this.onWarmupCompleted;
            z = false;
        }
        atomicBoolean.set(z);
        int i3 = onExtraCallbackWithResult + 25;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
    }
}
