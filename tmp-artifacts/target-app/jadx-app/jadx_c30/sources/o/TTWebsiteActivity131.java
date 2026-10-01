package o;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.zip.ZipException;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class TTWebsiteActivity131 implements dj11, Cloneable, Serializable {
    private static final long serialVersionUID = 1;
    private BigInteger gid;
    private BigInteger uid;
    private int version = 1;
    private static final dj4 onWarmupCompleted = new dj4(30837);
    private static final dj4 IAuthTabCallback = new dj4(0);
    private static final BigInteger onExtraCallback = BigInteger.valueOf(1000);

    @Override // o.dj11
    public void onExtraCallback(byte[] bArr, int i, int i2) throws ZipException {
    }

    static byte[] onExtraCallbackWithResult(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        int i = 0;
        for (int i2 = 0; i2 < length && bArr[i2] == 0; i2++) {
            i++;
        }
        int iMax = Math.max(1, bArr.length - i);
        byte[] bArr2 = new byte[iMax];
        int length2 = iMax - (bArr.length - i);
        System.arraycopy(bArr, i, bArr2, length2, iMax - length2);
        return bArr2;
    }

    public TTWebsiteActivity131() {
        onNavigationEvent();
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TTWebsiteActivity131)) {
            return false;
        }
        TTWebsiteActivity131 tTWebsiteActivity131 = (TTWebsiteActivity131) obj;
        return this.version == tTWebsiteActivity131.version && this.uid.equals(tTWebsiteActivity131.uid) && this.gid.equals(tTWebsiteActivity131.gid);
    }

    @Override // o.dj11
    public byte[] onWarmupCompleted() {
        return showPrivacyActivity.onExtraCallback;
    }

    @Override // o.dj11
    public dj4 IAuthTabCallback() {
        return IAuthTabCallback;
    }

    @Override // o.dj11
    public dj4 onTransact() {
        return onWarmupCompleted;
    }

    @Override // o.dj11
    public byte[] onExtraCallbackWithResult() {
        byte[] byteArray = this.uid.toByteArray();
        byte[] byteArray2 = this.gid.toByteArray();
        byte[] bArrOnExtraCallbackWithResult = onExtraCallbackWithResult(byteArray);
        int length = bArrOnExtraCallbackWithResult != null ? bArrOnExtraCallbackWithResult.length : 0;
        byte[] bArrOnExtraCallbackWithResult2 = onExtraCallbackWithResult(byteArray2);
        int length2 = bArrOnExtraCallbackWithResult2 != null ? bArrOnExtraCallbackWithResult2.length : 0;
        int i = length + 3;
        byte[] bArr = new byte[i + length2];
        if (bArrOnExtraCallbackWithResult != null) {
            dj5.onExtraCallback(bArrOnExtraCallbackWithResult);
        }
        if (bArrOnExtraCallbackWithResult2 != null) {
            dj5.onExtraCallback(bArrOnExtraCallbackWithResult2);
        }
        bArr[0] = dj5.onWarmupCompleted(this.version);
        bArr[1] = dj5.onWarmupCompleted(length);
        if (bArrOnExtraCallbackWithResult != null) {
            System.arraycopy(bArrOnExtraCallbackWithResult, 0, bArr, 2, length);
        }
        bArr[length + 2] = dj5.onWarmupCompleted(length2);
        if (bArrOnExtraCallbackWithResult2 != null) {
            System.arraycopy(bArrOnExtraCallbackWithResult2, 0, bArr, i, length2);
        }
        return bArr;
    }

    @Override // o.dj11
    public dj4 onExtraCallback() {
        byte[] bArrOnExtraCallbackWithResult = onExtraCallbackWithResult(this.uid.toByteArray());
        int length = bArrOnExtraCallbackWithResult == null ? 0 : bArrOnExtraCallbackWithResult.length;
        byte[] bArrOnExtraCallbackWithResult2 = onExtraCallbackWithResult(this.gid.toByteArray());
        return new dj4(length + 3 + (bArrOnExtraCallbackWithResult2 != null ? bArrOnExtraCallbackWithResult2.length : 0));
    }

    public int hashCode() {
        return ((this.version * (-1234567)) ^ Integer.rotateLeft(this.uid.hashCode(), 16)) ^ this.gid.hashCode();
    }

    @Override // o.dj11
    public void onWarmupCompleted(byte[] bArr, int i, int i2) throws ZipException {
        onNavigationEvent();
        if (i2 < 3) {
            throw new ZipException("X7875_NewUnix length is too short, only " + i2 + " bytes");
        }
        this.version = dj5.onWarmupCompleted(bArr[i]);
        int i3 = i + 2;
        int iOnWarmupCompleted = dj5.onWarmupCompleted(bArr[i + 1]);
        int i4 = iOnWarmupCompleted + 3;
        if (i4 > i2) {
            throw new ZipException("X7875_NewUnix invalid: uidSize " + iOnWarmupCompleted + " doesn't fit into " + i2 + " bytes");
        }
        int i5 = iOnWarmupCompleted + i3;
        this.uid = new BigInteger(1, dj5.onExtraCallback(Arrays.copyOfRange(bArr, i3, i5)));
        int i6 = i5 + 1;
        int iOnWarmupCompleted2 = dj5.onWarmupCompleted(bArr[i5]);
        if (i4 + iOnWarmupCompleted2 > i2) {
            throw new ZipException("X7875_NewUnix invalid: gidSize " + iOnWarmupCompleted2 + " doesn't fit into " + i2 + " bytes");
        }
        this.gid = new BigInteger(1, dj5.onExtraCallback(Arrays.copyOfRange(bArr, i6, iOnWarmupCompleted2 + i6)));
    }

    private void onNavigationEvent() {
        BigInteger bigInteger = onExtraCallback;
        this.uid = bigInteger;
        this.gid = bigInteger;
    }

    public String toString() {
        return "0x7875 Zip Extra Field: UID=" + this.uid + " GID=" + this.gid;
    }
}
