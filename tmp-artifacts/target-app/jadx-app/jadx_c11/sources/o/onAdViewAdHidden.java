package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class onAdViewAdHidden {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private boolean onExtraCallbackWithResult;

    public final void onNavigationEvent(@NotNull onInterstitialAdLoadFailed oninterstitialadloadfailed) {
        boolean z;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(oninterstitialadloadfailed, "");
        if (oninterstitialadloadfailed == onInterstitialAdLoadFailed.RECYCLE) {
            int i2 = onExtraCallback + 39;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            z = true;
        } else {
            int i4 = IAuthTabCallback + 105;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            z = false;
        }
        this.onExtraCallbackWithResult = z;
    }

    public final void onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallbackWithResult = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        r6.onExtraCallbackWithResult = false;
        r1 = r1 + 35;
        o.onAdViewAdHidden.onExtraCallback = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        if ((r1 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        if (r6.onExtraCallbackWithResult == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r6.onExtraCallbackWithResult != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 63;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 63 / 0;
        }
    }
}
