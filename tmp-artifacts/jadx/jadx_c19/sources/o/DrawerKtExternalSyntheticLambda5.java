package o;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class DrawerKtExternalSyntheticLambda5 implements DrawerKtExternalSyntheticLambda9 {
    private final long IAuthTabCallbackStub;
    private final BasicTextContextMenuProviderKtExternalSyntheticLambda0 onExtraCallback;
    private int onExtraCallbackWithResult;
    private long onNavigationEvent;
    private int onWarmupCompleted;
    private byte[] IAuthTabCallback = new byte[65536];
    private final byte[] asInterface = new byte[4096];

    static {
        HandwritingDetectorNodeExternalSyntheticLambda0.onExtraCallback("media3.extractor");
    }

    public DrawerKtExternalSyntheticLambda5(BasicTextContextMenuProviderKtExternalSyntheticLambda0 basicTextContextMenuProviderKtExternalSyntheticLambda0, long j, long j2) {
        this.onExtraCallback = basicTextContextMenuProviderKtExternalSyntheticLambda0;
        this.onNavigationEvent = j;
        this.IAuthTabCallbackStub = j2;
    }

    @Override // o.DrawerKtExternalSyntheticLambda9
    public int onWarmupCompleted(byte[] bArr, int i2, int i3) throws IOException {
        int iOnExtraCallback = onExtraCallback(bArr, i2, i3);
        if (iOnExtraCallback == 0) {
            iOnExtraCallback = IAuthTabCallback(bArr, i2, i3, 0, true);
        }
        onExtraCallbackWithResult(iOnExtraCallback);
        return iOnExtraCallback;
    }

    @Override // o.DrawerKtExternalSyntheticLambda9
    public boolean onExtraCallback(byte[] bArr, int i2, int i3, boolean z) throws IOException {
        int iOnExtraCallback = onExtraCallback(bArr, i2, i3);
        while (iOnExtraCallback < i3 && iOnExtraCallback != -1) {
            iOnExtraCallback = IAuthTabCallback(bArr, i2, i3, iOnExtraCallback, z);
        }
        onExtraCallbackWithResult(iOnExtraCallback);
        return iOnExtraCallback != -1;
    }

    @Override // o.DrawerKtExternalSyntheticLambda9
    public void onNavigationEvent(byte[] bArr, int i2, int i3) throws IOException {
        onExtraCallback(bArr, i2, i3, false);
    }

    @Override // o.DrawerKtExternalSyntheticLambda9
    public int onWarmupCompleted(int i2) throws IOException {
        int iIAuthTabCallbackDefault = IAuthTabCallbackDefault(i2);
        if (iIAuthTabCallbackDefault == 0) {
            byte[] bArr = this.asInterface;
            iIAuthTabCallbackDefault = IAuthTabCallback(bArr, 0, Math.min(i2, bArr.length), 0, true);
        }
        onExtraCallbackWithResult(iIAuthTabCallbackDefault);
        return iIAuthTabCallbackDefault;
    }

    @Override // o.DrawerKtExternalSyntheticLambda9
    public boolean IAuthTabCallback(int i2, boolean z) throws IOException {
        int iIAuthTabCallbackDefault = IAuthTabCallbackDefault(i2);
        while (iIAuthTabCallbackDefault < i2 && iIAuthTabCallbackDefault != -1) {
            iIAuthTabCallbackDefault = IAuthTabCallback(this.asInterface, -iIAuthTabCallbackDefault, Math.min(i2, this.asInterface.length + iIAuthTabCallbackDefault), iIAuthTabCallbackDefault, z);
        }
        onExtraCallbackWithResult(iIAuthTabCallbackDefault);
        return iIAuthTabCallbackDefault != -1;
    }

    @Override // o.DrawerKtExternalSyntheticLambda9
    public void onExtraCallback(int i2) throws IOException {
        IAuthTabCallback(i2, false);
    }

    @Override // o.DrawerKtExternalSyntheticLambda9
    public int onExtraCallbackWithResult(byte[] bArr, int i2, int i3) throws IOException {
        int iMin;
        onNavigationEvent(i3);
        int i4 = this.onExtraCallbackWithResult;
        int i5 = this.onWarmupCompleted;
        int i6 = i4 - i5;
        if (i6 == 0) {
            iMin = IAuthTabCallback(this.IAuthTabCallback, i5, i3, 0, true);
            if (iMin == -1) {
                return -1;
            }
            this.onExtraCallbackWithResult += iMin;
        } else {
            iMin = Math.min(i3, i6);
        }
        System.arraycopy(this.IAuthTabCallback, this.onWarmupCompleted, bArr, i2, iMin);
        this.onWarmupCompleted += iMin;
        return iMin;
    }

    @Override // o.DrawerKtExternalSyntheticLambda9
    public boolean onExtraCallbackWithResult(byte[] bArr, int i2, int i3, boolean z) throws IOException {
        if (!onExtraCallbackWithResult(i3, z)) {
            return false;
        }
        System.arraycopy(this.IAuthTabCallback, this.onWarmupCompleted - i3, bArr, i2, i3);
        return true;
    }

    @Override // o.DrawerKtExternalSyntheticLambda9
    public void IAuthTabCallback(byte[] bArr, int i2, int i3) throws IOException {
        onExtraCallbackWithResult(bArr, i2, i3, false);
    }

    @Override // o.DrawerKtExternalSyntheticLambda9
    public boolean onExtraCallbackWithResult(int i2, boolean z) throws IOException {
        onNavigationEvent(i2);
        int iIAuthTabCallback = this.onExtraCallbackWithResult - this.onWarmupCompleted;
        while (iIAuthTabCallback < i2) {
            iIAuthTabCallback = IAuthTabCallback(this.IAuthTabCallback, this.onWarmupCompleted, i2, iIAuthTabCallback, z);
            if (iIAuthTabCallback == -1) {
                return false;
            }
            this.onExtraCallbackWithResult = this.onWarmupCompleted + iIAuthTabCallback;
        }
        this.onWarmupCompleted += i2;
        return true;
    }

    @Override // o.DrawerKtExternalSyntheticLambda9
    public void IAuthTabCallback(int i2) throws IOException {
        onExtraCallbackWithResult(i2, false);
    }

    @Override // o.DrawerKtExternalSyntheticLambda9
    public void onExtraCallbackWithResult() {
        this.onWarmupCompleted = 0;
    }

    @Override // o.DrawerKtExternalSyntheticLambda9
    public long onWarmupCompleted() {
        return this.onNavigationEvent + this.onWarmupCompleted;
    }

    @Override // o.DrawerKtExternalSyntheticLambda9
    public long IAuthTabCallback() {
        return this.onNavigationEvent;
    }

    @Override // o.DrawerKtExternalSyntheticLambda9
    public long onExtraCallback() {
        return this.IAuthTabCallbackStub;
    }

    private void onNavigationEvent(int i2) {
        int i3 = this.onWarmupCompleted + i2;
        byte[] bArr = this.IAuthTabCallback;
        if (i3 > bArr.length) {
            this.IAuthTabCallback = Arrays.copyOf(this.IAuthTabCallback, TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(bArr.length << 1, 65536 + i3, i3 + 524288));
        }
    }

    private int IAuthTabCallbackDefault(int i2) {
        int iMin = Math.min(this.onExtraCallbackWithResult, i2);
        onTransact(iMin);
        return iMin;
    }

    private int onExtraCallback(byte[] bArr, int i2, int i3) {
        int i4 = this.onExtraCallbackWithResult;
        if (i4 == 0) {
            return 0;
        }
        int iMin = Math.min(i4, i3);
        System.arraycopy(this.IAuthTabCallback, 0, bArr, i2, iMin);
        onTransact(iMin);
        return iMin;
    }

    private void onTransact(int i2) {
        int i3 = this.onExtraCallbackWithResult - i2;
        this.onExtraCallbackWithResult = i3;
        this.onWarmupCompleted = 0;
        byte[] bArr = this.IAuthTabCallback;
        byte[] bArr2 = i3 < bArr.length - 524288 ? new byte[65536 + i3] : bArr;
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        this.IAuthTabCallback = bArr2;
    }

    private int IAuthTabCallback(byte[] bArr, int i2, int i3, int i4, boolean z) throws IOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int iOnWarmupCompleted = this.onExtraCallback.onWarmupCompleted(bArr, i2 + i4, i3 - i4);
        if (iOnWarmupCompleted != -1) {
            return i4 + iOnWarmupCompleted;
        }
        if (i4 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }

    private void onExtraCallbackWithResult(int i2) {
        if (i2 != -1) {
            this.onNavigationEvent += i2;
        }
    }
}
