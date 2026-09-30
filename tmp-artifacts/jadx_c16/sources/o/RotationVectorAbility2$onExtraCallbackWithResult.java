package o;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class RotationVectorAbility2$onExtraCallbackWithResult implements RotationVectorAbility2 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public static final RotationVectorAbility2$onExtraCallbackWithResult onWarmupCompleted = new RotationVectorAbility2$onExtraCallbackWithResult();

    static {
        int i = onExtraCallback + 115;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        if ((r7 instanceof o.RotationVectorAbility2$onExtraCallbackWithResult) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        r7 = r3 + 47;
        o.RotationVectorAbility2$onExtraCallbackWithResult.onExtraCallbackWithResult = r7 % 128;
        r7 = r7 % 2;
        r3 = r3 + 55;
        o.RotationVectorAbility2$onExtraCallbackWithResult.onExtraCallbackWithResult = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
    
        if ((r3 % 2) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        r7 = null;
        r7.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003d, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r1 = r1 + 107;
        o.RotationVectorAbility2$onExtraCallbackWithResult.IAuthTabCallback = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if ((r1 % 2) == 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 75;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        if (i3 % 2 != 0) {
            int i5 = 33 / 0;
        }
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 123;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 27;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 81 / 0;
        }
        return -1372505097;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 17;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 67;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return "ThumbnailBannerWithSdk";
        }
        throw null;
    }

    private RotationVectorAbility2$onExtraCallbackWithResult() {
    }
}
