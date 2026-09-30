package o;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class SensorBridgeExtension5 extends SensorBridgeExtension3 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private final int onExtraCallback;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        if ((!(r7 instanceof o.SensorBridgeExtension5)) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
    
        r3 = r3 + 93;
        o.SensorBridgeExtension5.onExtraCallbackWithResult = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        if (r6.onExtraCallback == ((o.SensorBridgeExtension5) r7).onExtraCallback) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r1 = r1 + 111;
        o.SensorBridgeExtension5.IAuthTabCallback = r1 % 128;
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
        int i3 = i2 + 45;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        if (i3 % 2 != 0) {
            int i5 = 82 / 0;
        }
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 77;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = Integer.hashCode(this.onExtraCallback);
        int i4 = onExtraCallbackWithResult + 13;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 15 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PaddingItem(paddingDp=" + this.onExtraCallback + ")";
        int i2 = onExtraCallbackWithResult + 97;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public SensorBridgeExtension5(int i) {
        this.onExtraCallback = i;
    }

    public final int onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 121;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = this.onExtraCallback;
        int i5 = i3 + 71;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        obj.hashCode();
        throw null;
    }
}
