package o;

import java.util.zip.Checksum;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class isCoverSrc implements Checksum {
    private final byte[] IAuthTabCallback;
    private int IAuthTabCallbackDefault;
    private final byte[] onExtraCallback;
    private int onExtraCallbackWithResult;
    private final int onNavigationEvent;
    private final int[] onWarmupCompleted;

    private static int onExtraCallbackWithResult(byte[] bArr, int i) {
        return (int) showPrivacyActivity.onExtraCallbackWithResult(bArr, i, 4);
    }

    public isCoverSrc() {
        this(0);
    }

    public isCoverSrc(int i) {
        this.IAuthTabCallback = new byte[1];
        this.onWarmupCompleted = new int[4];
        this.onExtraCallback = new byte[16];
        this.onNavigationEvent = i;
        onExtraCallback();
    }

    @Override // java.util.zip.Checksum
    public long getValue() {
        int iRotateLeft;
        int i = 0;
        if (this.IAuthTabCallbackDefault > 16) {
            iRotateLeft = Integer.rotateLeft(this.onWarmupCompleted[0], 1) + Integer.rotateLeft(this.onWarmupCompleted[1], 7) + Integer.rotateLeft(this.onWarmupCompleted[2], 12) + Integer.rotateLeft(this.onWarmupCompleted[3], 18);
        } else {
            iRotateLeft = this.onWarmupCompleted[2] + 374761393;
        }
        int iRotateLeft2 = iRotateLeft + this.IAuthTabCallbackDefault;
        int i2 = this.onExtraCallbackWithResult;
        while (i <= i2 - 4) {
            iRotateLeft2 = Integer.rotateLeft(iRotateLeft2 + (onExtraCallbackWithResult(this.onExtraCallback, i) * (-1028477379)), 17) * 668265263;
            i += 4;
        }
        while (i < this.onExtraCallbackWithResult) {
            iRotateLeft2 = Integer.rotateLeft(iRotateLeft2 + ((this.onExtraCallback[i] & 255) * 374761393), 11) * (-1640531535);
            i++;
        }
        int i3 = (iRotateLeft2 ^ (iRotateLeft2 >>> 15)) * (-2048144777);
        int i4 = (i3 ^ (i3 >>> 13)) * (-1028477379);
        return (i4 ^ (i4 >>> 16)) & BodyPartID.bodyIdMax;
    }

    private void onExtraCallback() {
        int[] iArr = this.onWarmupCompleted;
        int i = this.onNavigationEvent;
        iArr[0] = 606290984 + i;
        iArr[1] = (-2048144777) + i;
        iArr[2] = i;
        iArr[3] = i + 1640531535;
    }

    private void onNavigationEvent(byte[] bArr, int i) {
        int[] iArr = this.onWarmupCompleted;
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int iRotateLeft = Integer.rotateLeft(i2 + (onExtraCallbackWithResult(bArr, i) * (-2048144777)), 13);
        int iRotateLeft2 = Integer.rotateLeft(i3 + (onExtraCallbackWithResult(bArr, i + 4) * (-2048144777)), 13);
        int iRotateLeft3 = Integer.rotateLeft(i4 + (onExtraCallbackWithResult(bArr, i + 8) * (-2048144777)), 13);
        int iRotateLeft4 = Integer.rotateLeft(i5 + (onExtraCallbackWithResult(bArr, i + 12) * (-2048144777)), 13);
        int[] iArr2 = this.onWarmupCompleted;
        iArr2[0] = iRotateLeft * (-1640531535);
        iArr2[1] = iRotateLeft2 * (-1640531535);
        iArr2[2] = iRotateLeft3 * (-1640531535);
        iArr2[3] = iRotateLeft4 * (-1640531535);
        this.onExtraCallbackWithResult = 0;
    }

    @Override // java.util.zip.Checksum
    public void reset() {
        onExtraCallback();
        this.IAuthTabCallbackDefault = 0;
        this.onExtraCallbackWithResult = 0;
    }

    @Override // java.util.zip.Checksum
    public void update(byte[] bArr, int i, int i2) {
        if (i2 > 0) {
            this.IAuthTabCallbackDefault += i2;
            int i3 = i + i2;
            int i4 = this.onExtraCallbackWithResult;
            if (i4 + i2 < 16) {
                System.arraycopy(bArr, i, this.onExtraCallback, i4, i2);
                this.onExtraCallbackWithResult += i2;
                return;
            }
            if (i4 > 0) {
                int i5 = 16 - i4;
                System.arraycopy(bArr, i, this.onExtraCallback, i4, i5);
                onNavigationEvent(this.onExtraCallback, 0);
                i += i5;
            }
            while (i <= i3 - 16) {
                onNavigationEvent(bArr, i);
                i += 16;
            }
            if (i < i3) {
                int i6 = i3 - i;
                this.onExtraCallbackWithResult = i6;
                System.arraycopy(bArr, i, this.onExtraCallback, 0, i6);
            }
        }
    }

    @Override // java.util.zip.Checksum
    public void update(int i) {
        byte[] bArr = this.IAuthTabCallback;
        bArr[0] = (byte) i;
        update(bArr, 0, 1);
    }
}
