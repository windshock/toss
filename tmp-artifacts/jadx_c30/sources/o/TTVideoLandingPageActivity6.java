package o;

import java.nio.charset.Charset;
import java.util.zip.CRC32;
import java.util.zip.ZipException;
import net.sf.scuba.smartcards.BuildConfig;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class TTVideoLandingPageActivity6 implements dj11, Cloneable {
    private static final dj4 onWarmupCompleted = new dj4(30062);
    private int IAuthTabCallback;
    private int IAuthTabCallbackDefault;
    private int asBinder;
    private boolean onNavigationEvent;
    private String onExtraCallbackWithResult = BuildConfig.FLAVOR;
    private CRC32 onExtraCallback = new CRC32();

    public Object clone() {
        try {
            TTVideoLandingPageActivity6 tTVideoLandingPageActivity6 = (TTVideoLandingPageActivity6) super.clone();
            tTVideoLandingPageActivity6.onExtraCallback = new CRC32();
            return tTVideoLandingPageActivity6;
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // o.dj11
    public byte[] onWarmupCompleted() {
        return onExtraCallbackWithResult();
    }

    @Override // o.dj11
    public dj4 IAuthTabCallback() {
        return onExtraCallback();
    }

    public int onNavigationEvent() {
        return this.IAuthTabCallback;
    }

    @Override // o.dj11
    public dj4 onTransact() {
        return onWarmupCompleted;
    }

    public String IAuthTabCallbackStub() {
        return this.onExtraCallbackWithResult;
    }

    @Override // o.dj11
    public byte[] onExtraCallbackWithResult() {
        int iOnNavigationEvent = onExtraCallback().onNavigationEvent();
        int i = iOnNavigationEvent - 4;
        byte[] bArr = new byte[i];
        System.arraycopy(dj4.IAuthTabCallback(asBinder()), 0, bArr, 0, 2);
        byte[] bytes = IAuthTabCallbackStub().getBytes(Charset.defaultCharset());
        System.arraycopy(dj12.onWarmupCompleted(bytes.length), 0, bArr, 2, 4);
        System.arraycopy(dj4.IAuthTabCallback(asInterface()), 0, bArr, 6, 2);
        System.arraycopy(dj4.IAuthTabCallback(onNavigationEvent()), 0, bArr, 8, 2);
        System.arraycopy(bytes, 0, bArr, 10, bytes.length);
        this.onExtraCallback.reset();
        this.onExtraCallback.update(bArr);
        byte[] bArr2 = new byte[iOnNavigationEvent];
        System.arraycopy(dj12.onWarmupCompleted(this.onExtraCallback.getValue()), 0, bArr2, 0, 4);
        System.arraycopy(bArr, 0, bArr2, 4, i);
        return bArr2;
    }

    @Override // o.dj11
    public dj4 onExtraCallback() {
        return new dj4(IAuthTabCallbackStub().getBytes(Charset.defaultCharset()).length + 14);
    }

    public int asBinder() {
        return this.asBinder;
    }

    protected int onExtraCallback(int i) {
        int i2;
        if (getInterfaceDescriptor()) {
            i2 = 40960;
        } else {
            i2 = IAuthTabCallbackDefault() ? 16384 : 32768;
        }
        return (i & 4095) | i2;
    }

    public int asInterface() {
        return this.IAuthTabCallbackDefault;
    }

    public boolean IAuthTabCallbackDefault() {
        return this.onNavigationEvent && !getInterfaceDescriptor();
    }

    public boolean getInterfaceDescriptor() {
        return !IAuthTabCallbackStub().isEmpty();
    }

    @Override // o.dj11
    public void onExtraCallback(byte[] bArr, int i, int i2) throws ZipException {
        onWarmupCompleted(bArr, i, i2);
    }

    @Override // o.dj11
    public void onWarmupCompleted(byte[] bArr, int i, int i2) throws ZipException {
        if (i2 < 14) {
            throw new ZipException("The length is too short, only " + i2 + " bytes, expected at least 14");
        }
        long jOnNavigationEvent = dj12.onNavigationEvent(bArr, i);
        int i3 = i2 - 4;
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i + 4, bArr2, 0, i3);
        this.onExtraCallback.reset();
        this.onExtraCallback.update(bArr2);
        long value = this.onExtraCallback.getValue();
        if (jOnNavigationEvent != value) {
            throw new ZipException("Bad CRC checksum, expected " + Long.toHexString(jOnNavigationEvent) + " instead of " + Long.toHexString(value));
        }
        int iIAuthTabCallback = dj4.IAuthTabCallback(bArr2, 0);
        int iOnNavigationEvent = (int) dj12.onNavigationEvent(bArr2, 2);
        if (iOnNavigationEvent < 0 || iOnNavigationEvent > i2 - 14) {
            throw new ZipException("Bad symbolic link name length " + iOnNavigationEvent + " in ASI extra field");
        }
        this.IAuthTabCallbackDefault = dj4.IAuthTabCallback(bArr2, 6);
        this.IAuthTabCallback = dj4.IAuthTabCallback(bArr2, 8);
        if (iOnNavigationEvent == 0) {
            this.onExtraCallbackWithResult = BuildConfig.FLAVOR;
        } else {
            byte[] bArr3 = new byte[iOnNavigationEvent];
            System.arraycopy(bArr2, 10, bArr3, 0, iOnNavigationEvent);
            this.onExtraCallbackWithResult = new String(bArr3, Charset.defaultCharset());
        }
        onNavigationEvent((iIAuthTabCallback & 16384) != 0);
        onExtraCallbackWithResult(iIAuthTabCallback);
    }

    public void onNavigationEvent(boolean z) {
        this.onNavigationEvent = z;
        this.asBinder = onExtraCallback(this.asBinder);
    }

    public void onExtraCallbackWithResult(int i) {
        this.asBinder = onExtraCallback(i);
    }
}
