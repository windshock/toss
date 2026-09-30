package o;

import im.toss.tds.view.component.atom.button.TdsButtonV1View;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class setCallTimeoutokhttp {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;

    public static final /* synthetic */ boolean onExtraCallback(TdsButtonV1View.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 123;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult(onextracallbackwithresult);
        int i4 = onWarmupCompleted + 91;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return zOnExtraCallbackWithResult;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        if (r4 != im.toss.tds.view.component.atom.button.TdsButtonV1View.onExtraCallbackWithResult.LOADING) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
    
        if (r4 != im.toss.tds.view.component.atom.button.TdsButtonV1View.onExtraCallbackWithResult.LOADING) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final boolean onExtraCallbackWithResult(TdsButtonV1View.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        if (onextracallbackwithresult != TdsButtonV1View.onExtraCallbackWithResult.ENABLED) {
            int i2 = IAuthTabCallback + 105;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 43 / 0;
            }
        }
        int i4 = IAuthTabCallback + 93;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return true;
        }
        throw null;
    }
}
