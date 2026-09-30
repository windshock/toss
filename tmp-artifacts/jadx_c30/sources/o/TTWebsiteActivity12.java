package o;

import java.util.Arrays;
import java.util.zip.ZipException;
import o.onPostExecute;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class TTWebsiteActivity12 extends onPostExecute {
    private int IAuthTabCallback;
    private int IAuthTabCallbackDefault;
    private onPostExecute.onNavigationEvent IAuthTabCallbackStub;
    private byte[] IAuthTabCallbackStubProxy;
    private byte[] IAuthTabCallback_Parcel;
    private long asBinder;
    private byte[] asInterface;
    private byte[] getInterfaceDescriptor;
    private onPostExecute.onExtraCallback onExtraCallback;
    private byte[] onExtraCallbackWithResult;
    private int onNavigationEvent;
    private byte[] onTransact;
    private int onWarmupCompleted;

    public TTWebsiteActivity12() {
        super(new dj4(23));
    }

    private void onExtraCallbackWithResult(String str, int i, int i2, int i3) throws ZipException {
        if (i2 + i <= i3) {
            return;
        }
        throw new ZipException("Invalid X0017_StrongEncryptionHeader: " + str + " " + i + " doesn't fit into " + i3 + " bytes of data at position " + i2);
    }

    public void onExtraCallbackWithResult(byte[] bArr, int i, int i2) throws ZipException {
        onNavigationEvent(12, i2);
        this.IAuthTabCallback = dj4.IAuthTabCallback(bArr, i);
        this.onExtraCallback = onPostExecute.onExtraCallback.getAlgorithmByCode(dj4.IAuthTabCallback(bArr, i + 2));
        this.onWarmupCompleted = dj4.IAuthTabCallback(bArr, i + 4);
        this.onNavigationEvent = dj4.IAuthTabCallback(bArr, i + 6);
        long jOnNavigationEvent = dj12.onNavigationEvent(bArr, i + 8);
        this.asBinder = jOnNavigationEvent;
        if (jOnNavigationEvent > 0) {
            onNavigationEvent(16, i2);
            this.IAuthTabCallbackStub = onPostExecute.onNavigationEvent.getAlgorithmByCode(dj4.IAuthTabCallback(bArr, i + 12));
            this.IAuthTabCallbackDefault = dj4.IAuthTabCallback(bArr, i + 14);
        }
    }

    public void IAuthTabCallback(byte[] bArr, int i, int i2) throws ZipException {
        onNavigationEvent(4, i2);
        int iIAuthTabCallback = dj4.IAuthTabCallback(bArr, i);
        onExtraCallbackWithResult("ivSize", iIAuthTabCallback, 4, i2);
        int i3 = i + 4;
        onNavigationEvent(i3, iIAuthTabCallback);
        this.onTransact = Arrays.copyOfRange(bArr, i3, iIAuthTabCallback);
        int i4 = iIAuthTabCallback + 16;
        onNavigationEvent(i4, i2);
        int i5 = i + iIAuthTabCallback;
        this.IAuthTabCallback = dj4.IAuthTabCallback(bArr, i5 + 6);
        this.onExtraCallback = onPostExecute.onExtraCallback.getAlgorithmByCode(dj4.IAuthTabCallback(bArr, i5 + 8));
        this.onWarmupCompleted = dj4.IAuthTabCallback(bArr, i5 + 10);
        this.onNavigationEvent = dj4.IAuthTabCallback(bArr, i5 + 12);
        int iIAuthTabCallback2 = dj4.IAuthTabCallback(bArr, i5 + 14);
        onExtraCallbackWithResult("erdSize", iIAuthTabCallback2, i4, i2);
        int i6 = i5 + 16;
        onNavigationEvent(i6, iIAuthTabCallback2);
        this.onExtraCallbackWithResult = Arrays.copyOfRange(bArr, i6, iIAuthTabCallback2);
        int i7 = iIAuthTabCallback + 20 + iIAuthTabCallback2;
        onNavigationEvent(i7, i2);
        long jOnNavigationEvent = dj12.onNavigationEvent(bArr, i6 + iIAuthTabCallback2);
        this.asBinder = jOnNavigationEvent;
        if (jOnNavigationEvent == 0) {
            onNavigationEvent(i7 + 2, i2);
            int iIAuthTabCallback3 = dj4.IAuthTabCallback(bArr, i5 + 20 + iIAuthTabCallback2);
            onExtraCallbackWithResult("vSize", iIAuthTabCallback3, iIAuthTabCallback + 22 + iIAuthTabCallback2, i2);
            if (iIAuthTabCallback3 < 4) {
                throw new ZipException("Invalid X0017_StrongEncryptionHeader: vSize " + iIAuthTabCallback3 + " is too small to hold CRC");
            }
            int i8 = i5 + 22 + iIAuthTabCallback2;
            int i9 = iIAuthTabCallback3 - 4;
            onNavigationEvent(i8, i9);
            this.IAuthTabCallback_Parcel = Arrays.copyOfRange(bArr, i8, i9);
            int i10 = (i8 + iIAuthTabCallback3) - 4;
            onNavigationEvent(i10, 4);
            this.getInterfaceDescriptor = Arrays.copyOfRange(bArr, i10, 4);
            return;
        }
        onNavigationEvent(i7 + 6, i2);
        this.IAuthTabCallbackStub = onPostExecute.onNavigationEvent.getAlgorithmByCode(dj4.IAuthTabCallback(bArr, i5 + 20 + iIAuthTabCallback2));
        int i11 = i5 + 22 + iIAuthTabCallback2;
        this.IAuthTabCallbackDefault = dj4.IAuthTabCallback(bArr, i11);
        int i12 = i5 + 24 + iIAuthTabCallback2;
        int iIAuthTabCallback4 = dj4.IAuthTabCallback(bArr, i12);
        if (iIAuthTabCallback4 < this.IAuthTabCallbackDefault) {
            throw new ZipException("Invalid X0017_StrongEncryptionHeader: resize " + iIAuthTabCallback4 + " is too small to hold hashSize" + this.IAuthTabCallbackDefault);
        }
        onExtraCallbackWithResult("resize", iIAuthTabCallback4, iIAuthTabCallback + 24 + iIAuthTabCallback2, i2);
        this.IAuthTabCallbackStubProxy = Arrays.copyOfRange(bArr, i12, this.IAuthTabCallbackDefault);
        int i13 = this.IAuthTabCallbackDefault;
        this.asInterface = Arrays.copyOfRange(bArr, i12 + i13, iIAuthTabCallback4 - i13);
        onNavigationEvent(iIAuthTabCallback + 26 + iIAuthTabCallback2 + iIAuthTabCallback4 + 2, i2);
        int iIAuthTabCallback5 = dj4.IAuthTabCallback(bArr, i5 + 26 + iIAuthTabCallback2 + iIAuthTabCallback4);
        if (iIAuthTabCallback5 < 4) {
            throw new ZipException("Invalid X0017_StrongEncryptionHeader: vSize " + iIAuthTabCallback5 + " is too small to hold CRC");
        }
        onExtraCallbackWithResult("vSize", iIAuthTabCallback5, iIAuthTabCallback + 22 + iIAuthTabCallback2 + iIAuthTabCallback4, i2);
        int i14 = i11 + iIAuthTabCallback4;
        this.IAuthTabCallback_Parcel = Arrays.copyOfRange(bArr, i14, iIAuthTabCallback5 - 4);
        this.getInterfaceDescriptor = Arrays.copyOfRange(bArr, (i14 + iIAuthTabCallback5) - 4, 4);
    }

    @Override // o.onPostExecute, o.dj11
    public void onExtraCallback(byte[] bArr, int i, int i2) throws ZipException {
        super.onExtraCallback(bArr, i, i2);
        onExtraCallbackWithResult(bArr, i, i2);
    }

    @Override // o.onPostExecute, o.dj11
    public void onWarmupCompleted(byte[] bArr, int i, int i2) throws ZipException {
        super.onWarmupCompleted(bArr, i, i2);
        IAuthTabCallback(bArr, i, i2);
    }
}
