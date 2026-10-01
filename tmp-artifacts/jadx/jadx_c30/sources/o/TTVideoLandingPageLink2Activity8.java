package o;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class TTVideoLandingPageLink2Activity8 extends setCornerBottomLeftRadius {
    private final boolean[] IAuthTabCallback;

    public TTVideoLandingPageLink2Activity8(InputStream inputStream) {
        super(inputStream, ByteOrder.LITTLE_ENDIAN);
        onNavigationEvent(9);
        onWarmupCompleted(13);
        this.IAuthTabCallback = new boolean[onTransact()];
        for (int i = 0; i < 256; i++) {
            this.IAuthTabCallback[i] = true;
        }
        IAuthTabCallback(onExtraCallback() + 1);
    }

    @Override // o.setCornerBottomLeftRadius
    public int onExtraCallback(int i, byte b) throws IOException {
        int iIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        while (iIAuthTabCallbackDefault < 8192 && this.IAuthTabCallback[iIAuthTabCallbackDefault]) {
            iIAuthTabCallbackDefault++;
        }
        IAuthTabCallback(iIAuthTabCallbackDefault);
        int iOnExtraCallbackWithResult = onExtraCallbackWithResult(i, b, PKIFailureInfo.certRevoked);
        if (iOnExtraCallbackWithResult >= 0) {
            this.IAuthTabCallback[iOnExtraCallbackWithResult] = true;
        }
        return iOnExtraCallbackWithResult;
    }

    @Override // o.setCornerBottomLeftRadius
    public int IAuthTabCallback() throws IOException {
        int iAsInterface = asInterface();
        if (iAsInterface < 0) {
            return -1;
        }
        boolean z = false;
        if (iAsInterface != onExtraCallback()) {
            if (!this.IAuthTabCallback[iAsInterface]) {
                iAsInterface = onWarmupCompleted();
                z = true;
            }
            return onExtraCallbackWithResult(iAsInterface, z);
        }
        int iAsInterface2 = asInterface();
        if (iAsInterface2 < 0) {
            throw new IOException("Unexpected EOF;");
        }
        if (iAsInterface2 == 1) {
            if (onNavigationEvent() >= 13) {
                throw new IOException("Attempt to increase code size beyond maximum");
            }
            asBinder();
        } else if (iAsInterface2 == 2) {
            IAuthTabCallbackStub();
            IAuthTabCallback(onExtraCallback() + 1);
        } else {
            throw new IOException("Invalid clear code subcode " + iAsInterface2);
        }
        return 0;
    }

    private void IAuthTabCallbackStub() {
        boolean[] zArr = new boolean[PKIFailureInfo.certRevoked];
        int i = 0;
        while (true) {
            boolean[] zArr2 = this.IAuthTabCallback;
            if (i >= zArr2.length) {
                break;
            }
            if (zArr2[i] && onExtraCallback(i) != -1) {
                zArr[onExtraCallback(i)] = true;
            }
            i++;
        }
        for (int iOnExtraCallback = onExtraCallback() + 1; iOnExtraCallback < 8192; iOnExtraCallback++) {
            if (!zArr[iOnExtraCallback]) {
                this.IAuthTabCallback[iOnExtraCallback] = false;
                onNavigationEvent(iOnExtraCallback, -1);
            }
        }
    }
}
