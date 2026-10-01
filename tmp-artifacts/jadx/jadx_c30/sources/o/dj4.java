package o;

import java.io.Serializable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class dj4 implements Cloneable, Serializable {
    public static final dj4 onExtraCallback = new dj4(0);
    private static final long serialVersionUID = 1;
    private final int value;

    public static byte[] IAuthTabCallback(int i) {
        byte[] bArr = new byte[2];
        IAuthTabCallback(i, bArr, 0);
        return bArr;
    }

    public static int onExtraCallbackWithResult(byte[] bArr) {
        return IAuthTabCallback(bArr, 0);
    }

    public static int IAuthTabCallback(byte[] bArr, int i) {
        return (int) showPrivacyActivity.onExtraCallbackWithResult(bArr, i, 2);
    }

    public static void IAuthTabCallback(int i, byte[] bArr, int i2) {
        showPrivacyActivity.onNavigationEvent(bArr, i, i2, 2);
    }

    public dj4(byte[] bArr, int i) {
        this.value = IAuthTabCallback(bArr, i);
    }

    public dj4(int i) {
        this.value = i;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof dj4) && this.value == ((dj4) obj).onNavigationEvent();
    }

    public byte[] onExtraCallback() {
        byte[] bArr = new byte[2];
        showPrivacyActivity.onNavigationEvent(bArr, this.value, 0, 2);
        return bArr;
    }

    public int onNavigationEvent() {
        return this.value;
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return "ZipShort value: " + this.value;
    }
}
