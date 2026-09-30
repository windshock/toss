package o;

import java.io.Serializable;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class dj12 implements Cloneable, Serializable {
    private static final long serialVersionUID = 1;
    private final long value;
    public static final dj12 onWarmupCompleted = new dj12(33639248);
    public static final dj12 onExtraCallbackWithResult = new dj12(67324752);
    public static final dj12 onNavigationEvent = new dj12(134695760);
    static final dj12 onTransact = new dj12(BodyPartID.bodyIdMax);
    public static final dj12 onExtraCallback = new dj12(808471376);
    public static final dj12 IAuthTabCallback = new dj12(134630224);

    public static byte[] onWarmupCompleted(long j) {
        byte[] bArr = new byte[4];
        onNavigationEvent(j, bArr, 0);
        return bArr;
    }

    public static long onWarmupCompleted(byte[] bArr) {
        return onNavigationEvent(bArr, 0);
    }

    public static long onNavigationEvent(byte[] bArr, int i) {
        return showPrivacyActivity.onExtraCallbackWithResult(bArr, i, 4);
    }

    public static void onNavigationEvent(long j, byte[] bArr, int i) {
        showPrivacyActivity.onNavigationEvent(bArr, j, i, 4);
    }

    public dj12(byte[] bArr, int i) {
        this.value = onNavigationEvent(bArr, i);
    }

    public dj12(long j) {
        this.value = j;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof dj12) && this.value == ((dj12) obj).onWarmupCompleted();
    }

    public byte[] onExtraCallbackWithResult() {
        return onWarmupCompleted(this.value);
    }

    public int IAuthTabCallback() {
        return (int) this.value;
    }

    public long onWarmupCompleted() {
        return this.value;
    }

    public int hashCode() {
        return (int) this.value;
    }

    public void onExtraCallback(byte[] bArr, int i) {
        onNavigationEvent(this.value, bArr, i);
    }

    public String toString() {
        return "ZipLong value: " + this.value;
    }
}
