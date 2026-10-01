package o;

import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;
import org.jmrtd.lds.CVCAFile;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class dv5 {
    private static final byte[] IAuthTabCallback = {65, CVCAFile.CAR_TAG, 67, ISO7816.INS_REHABILITATE_CHV, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, ISOFileInfo.FCP_BYTE, 99, ISOFileInfo.FMD_BYTE, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, ISOFileInfo.FCI_BYTE, ISO7816.INS_MANAGE_CHANNEL, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, ISO7816.INS_DECREASE, 49, ISO7816.INS_INCREASE, 51, ISO7816.INS_DECREASE_STAMPED, 53, 54, 55, 56, 57, 43, 47};
    private static final int[] onExtraCallback = new int[128];

    static {
        int i = 0;
        while (true) {
            byte[] bArr = IAuthTabCallback;
            if (i >= bArr.length) {
                return;
            }
            onExtraCallback[bArr[i]] = i;
            i++;
        }
    }

    public static String onWarmupCompleted(byte[] bArr) {
        byte[] bArr2 = new byte[((bArr.length / 3) << 2) + (bArr.length % 3 == 0 ? 0 : 4)];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 : bArr) {
            i = (i + 1) % 3;
            if (i4 < 0) {
                i4 += 256;
            }
            i3 = (i3 << 8) + i4;
            if (i == 0) {
                byte[] bArr3 = IAuthTabCallback;
                bArr2[i2] = bArr3[(i3 >> 18) & 63];
                bArr2[i2 + 1] = bArr3[(i3 >> 12) & 63];
                bArr2[i2 + 2] = bArr3[(i3 >> 6) & 63];
                bArr2[i2 + 3] = bArr3[i3 & 63];
                i2 += 4;
            }
        }
        if (i == 1) {
            byte[] bArr4 = IAuthTabCallback;
            bArr2[i2] = bArr4[(i3 >> 2) & 63];
            bArr2[i2 + 1] = bArr4[(i3 << 4) & 63];
            bArr2[i2 + 2] = 61;
            bArr2[i2 + 3] = 61;
        } else if (i == 2) {
            byte[] bArr5 = IAuthTabCallback;
            bArr2[i2] = bArr5[(i3 >> 10) & 63];
            bArr2[i2 + 1] = bArr5[(i3 >> 4) & 63];
            bArr2[i2 + 2] = bArr5[(i3 << 2) & 63];
            bArr2[i2 + 3] = 61;
        }
        return onNavigationEvent(bArr2);
    }

    private static String onNavigationEvent(byte[] bArr) {
        return new String(bArr, 0, 0, bArr.length);
    }
}
