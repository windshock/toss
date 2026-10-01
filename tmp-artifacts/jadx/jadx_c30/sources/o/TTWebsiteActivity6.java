package o;

import java.io.Serializable;
import java.math.BigInteger;
import net.sf.scuba.smartcards.ISOFileInfo;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class TTWebsiteActivity6 implements Serializable {
    public static final TTWebsiteActivity6 IAuthTabCallback = new TTWebsiteActivity6(0);
    private static final long serialVersionUID = 1;
    private final BigInteger value;

    public static byte[] onExtraCallbackWithResult(BigInteger bigInteger) {
        long jLongValue = bigInteger.longValue();
        byte[] bArr = {(byte) (255 & jLongValue), (byte) ((65280 & jLongValue) >> 8), (byte) ((16711680 & jLongValue) >> 16), (byte) ((4278190080L & jLongValue) >> 24), (byte) ((1095216660480L & jLongValue) >> 32), (byte) ((280375465082880L & jLongValue) >> 40), (byte) ((71776119061217280L & jLongValue) >> 48), (byte) ((jLongValue & 9151314442816847872L) >> 56)};
        if (bigInteger.testBit(63)) {
            bArr[7] = (byte) (bArr[7] | ISOFileInfo.DATA_BYTES1);
        }
        return bArr;
    }

    public static byte[] IAuthTabCallback(long j) {
        return onExtraCallbackWithResult(BigInteger.valueOf(j));
    }

    public static BigInteger onWarmupCompleted(byte[] bArr, int i) {
        int i2 = i + 7;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(((bArr[i2] << 56) & 9151314442816847872L) + ((bArr[i + 6] << 48) & 71776119061217280L) + ((bArr[i + 5] << 40) & 280375465082880L) + ((bArr[i + 4] << 32) & 1095216660480L) + ((bArr[i + 3] << 24) & 4278190080L) + ((bArr[i + 2] << 16) & 16711680) + ((bArr[i + 1] << 8) & 65280) + (255 & bArr[i]));
        return (bArr[i2] & ISOFileInfo.DATA_BYTES1) == -128 ? bigIntegerValueOf.setBit(63) : bigIntegerValueOf;
    }

    public TTWebsiteActivity6(BigInteger bigInteger) {
        this.value = bigInteger;
    }

    public TTWebsiteActivity6(byte[] bArr, int i) {
        this.value = onWarmupCompleted(bArr, i);
    }

    public TTWebsiteActivity6(long j) {
        this(BigInteger.valueOf(j));
    }

    public boolean equals(Object obj) {
        if (obj instanceof TTWebsiteActivity6) {
            return this.value.equals(((TTWebsiteActivity6) obj).onExtraCallbackWithResult());
        }
        return false;
    }

    public byte[] IAuthTabCallback() {
        return onExtraCallbackWithResult(this.value);
    }

    public long onExtraCallback() {
        return this.value.longValue();
    }

    public BigInteger onExtraCallbackWithResult() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public String toString() {
        return "ZipEightByteInteger value: " + this.value;
    }
}
