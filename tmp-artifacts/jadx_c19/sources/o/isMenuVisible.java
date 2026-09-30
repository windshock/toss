package o;

import java.io.Serializable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class isMenuVisible implements Serializable {
    private static final long serialVersionUID = 2;

    public abstract isDetached IAuthTabCallbackStub();

    public abstract int onExtraCallback();

    protected void IAuthTabCallback(byte[] bArr, int i2, int i3) throws IllegalArgumentException {
        if (bArr == null) {
            onExtraCallback("Invalid `byte[]` argument: `null`");
        }
        int length = bArr.length;
        int i4 = i2 + i3;
        if ((i4 | i2 | i3 | (length - i4)) < 0) {
            onExtraCallback(String.format("Invalid 'offset' (%d) and/or 'len' (%d) arguments for `byte[]` of length %d", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(length)));
        }
    }

    protected <T> T onExtraCallback(String str) throws IllegalArgumentException {
        throw new IllegalArgumentException(str);
    }
}
