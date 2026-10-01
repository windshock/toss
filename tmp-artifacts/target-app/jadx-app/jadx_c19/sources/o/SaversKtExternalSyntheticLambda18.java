package o;

import android.util.Log;
import androidx.annotation.NonNull;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SaversKtExternalSyntheticLambda18 {
    private ByteBuffer onExtraCallback;
    private SaversKtExternalSyntheticLambda20 onWarmupCompleted;
    private final byte[] onExtraCallbackWithResult = new byte[256];
    private int IAuthTabCallback = 0;

    public SaversKtExternalSyntheticLambda18 onExtraCallbackWithResult(@NonNull ByteBuffer byteBuffer) {
        access000();
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.onExtraCallback = byteBufferAsReadOnlyBuffer;
        byteBufferAsReadOnlyBuffer.position(0);
        this.onExtraCallback.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public void onExtraCallbackWithResult() {
        this.onExtraCallback = null;
        this.onWarmupCompleted = null;
    }

    private void access000() {
        this.onExtraCallback = null;
        Arrays.fill(this.onExtraCallbackWithResult, (byte) 0);
        this.onWarmupCompleted = new SaversKtExternalSyntheticLambda20();
        this.IAuthTabCallback = 0;
    }

    public SaversKtExternalSyntheticLambda20 onNavigationEvent() {
        if (this.onExtraCallback == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (IAuthTabCallback()) {
            return this.onWarmupCompleted;
        }
        asInterface();
        if (!IAuthTabCallback()) {
            onTransact();
            SaversKtExternalSyntheticLambda20 saversKtExternalSyntheticLambda20 = this.onWarmupCompleted;
            if (saversKtExternalSyntheticLambda20.onExtraCallback < 0) {
                saversKtExternalSyntheticLambda20.getInterfaceDescriptor = 1;
            }
        }
        return this.onWarmupCompleted;
    }

    private void onTransact() {
        onExtraCallbackWithResult(Integer.MAX_VALUE);
    }

    private void onExtraCallbackWithResult(int i2) {
        boolean z = false;
        while (!z && !IAuthTabCallback() && this.onWarmupCompleted.onExtraCallback <= i2) {
            int iOnExtraCallback = onExtraCallback();
            if (iOnExtraCallback == 33) {
                int iOnExtraCallback2 = onExtraCallback();
                if (iOnExtraCallback2 == 1) {
                    access100();
                } else if (iOnExtraCallback2 == 249) {
                    this.onWarmupCompleted.IAuthTabCallback = new SaversKtExternalSyntheticLambda14();
                    IAuthTabCallbackDefault();
                } else if (iOnExtraCallback2 == 254) {
                    access100();
                } else if (iOnExtraCallback2 == 255) {
                    asBinder();
                    StringBuilder sb = new StringBuilder();
                    for (int i3 = 0; i3 < 11; i3++) {
                        sb.append((char) this.onExtraCallbackWithResult[i3]);
                    }
                    if (sb.toString().equals("NETSCAPE2.0")) {
                        IAuthTabCallback_Parcel();
                    } else {
                        access100();
                    }
                } else {
                    access100();
                }
            } else if (iOnExtraCallback == 44) {
                SaversKtExternalSyntheticLambda20 saversKtExternalSyntheticLambda20 = this.onWarmupCompleted;
                if (saversKtExternalSyntheticLambda20.IAuthTabCallback == null) {
                    saversKtExternalSyntheticLambda20.IAuthTabCallback = new SaversKtExternalSyntheticLambda14();
                }
                onWarmupCompleted();
            } else if (iOnExtraCallback != 59) {
                this.onWarmupCompleted.getInterfaceDescriptor = 1;
            } else {
                z = true;
            }
        }
    }

    private void IAuthTabCallbackDefault() {
        onExtraCallback();
        int iOnExtraCallback = onExtraCallback();
        SaversKtExternalSyntheticLambda14 saversKtExternalSyntheticLambda14 = this.onWarmupCompleted.IAuthTabCallback;
        int i2 = (iOnExtraCallback & 28) >> 2;
        saversKtExternalSyntheticLambda14.onExtraCallback = i2;
        if (i2 == 0) {
            saversKtExternalSyntheticLambda14.onExtraCallback = 1;
        }
        saversKtExternalSyntheticLambda14.access100 = (iOnExtraCallback & 1) != 0;
        int iIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy();
        if (iIAuthTabCallbackStubProxy < 2) {
            iIAuthTabCallbackStubProxy = 10;
        }
        SaversKtExternalSyntheticLambda14 saversKtExternalSyntheticLambda142 = this.onWarmupCompleted.IAuthTabCallback;
        saversKtExternalSyntheticLambda142.IAuthTabCallback = iIAuthTabCallbackStubProxy * 10;
        saversKtExternalSyntheticLambda142.IAuthTabCallbackStub = onExtraCallback();
        onExtraCallback();
    }

    private void onWarmupCompleted() {
        this.onWarmupCompleted.IAuthTabCallback.IAuthTabCallbackDefault = IAuthTabCallbackStubProxy();
        this.onWarmupCompleted.IAuthTabCallback.asBinder = IAuthTabCallbackStubProxy();
        this.onWarmupCompleted.IAuthTabCallback.onTransact = IAuthTabCallbackStubProxy();
        this.onWarmupCompleted.IAuthTabCallback.onNavigationEvent = IAuthTabCallbackStubProxy();
        int iOnExtraCallback = onExtraCallback();
        boolean z = (iOnExtraCallback & 128) != 0;
        int iPow = (int) Math.pow(2.0d, (iOnExtraCallback & 7) + 1);
        SaversKtExternalSyntheticLambda14 saversKtExternalSyntheticLambda14 = this.onWarmupCompleted.IAuthTabCallback;
        saversKtExternalSyntheticLambda14.onWarmupCompleted = (iOnExtraCallback & 64) != 0;
        if (z) {
            saversKtExternalSyntheticLambda14.asInterface = onWarmupCompleted(iPow);
        } else {
            saversKtExternalSyntheticLambda14.asInterface = null;
        }
        this.onWarmupCompleted.IAuthTabCallback.onExtraCallbackWithResult = this.onExtraCallback.position();
        getInterfaceDescriptor();
        if (IAuthTabCallback()) {
            return;
        }
        SaversKtExternalSyntheticLambda20 saversKtExternalSyntheticLambda20 = this.onWarmupCompleted;
        saversKtExternalSyntheticLambda20.onExtraCallback++;
        saversKtExternalSyntheticLambda20.onWarmupCompleted.add(saversKtExternalSyntheticLambda20.IAuthTabCallback);
    }

    private void IAuthTabCallback_Parcel() {
        do {
            asBinder();
            byte[] bArr = this.onExtraCallbackWithResult;
            if (bArr[0] == 1) {
                byte b = bArr[1];
                this.onWarmupCompleted.asInterface = ((bArr[2] & 255) << 8) | (b & 255);
            }
            if (this.IAuthTabCallback <= 0) {
                return;
            }
        } while (!IAuthTabCallback());
    }

    private void asInterface() {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < 6; i2++) {
            sb.append((char) onExtraCallback());
        }
        if (!sb.toString().startsWith("GIF")) {
            this.onWarmupCompleted.getInterfaceDescriptor = 1;
            return;
        }
        IAuthTabCallbackStub();
        if (!this.onWarmupCompleted.IAuthTabCallbackStub || IAuthTabCallback()) {
            return;
        }
        SaversKtExternalSyntheticLambda20 saversKtExternalSyntheticLambda20 = this.onWarmupCompleted;
        saversKtExternalSyntheticLambda20.onTransact = onWarmupCompleted(saversKtExternalSyntheticLambda20.asBinder);
        SaversKtExternalSyntheticLambda20 saversKtExternalSyntheticLambda202 = this.onWarmupCompleted;
        saversKtExternalSyntheticLambda202.onNavigationEvent = saversKtExternalSyntheticLambda202.onTransact[saversKtExternalSyntheticLambda202.onExtraCallbackWithResult];
    }

    private void IAuthTabCallbackStub() {
        this.onWarmupCompleted.access100 = IAuthTabCallbackStubProxy();
        this.onWarmupCompleted.IAuthTabCallbackDefault = IAuthTabCallbackStubProxy();
        int iOnExtraCallback = onExtraCallback();
        SaversKtExternalSyntheticLambda20 saversKtExternalSyntheticLambda20 = this.onWarmupCompleted;
        saversKtExternalSyntheticLambda20.IAuthTabCallbackStub = (iOnExtraCallback & 128) != 0;
        saversKtExternalSyntheticLambda20.asBinder = (int) Math.pow(2.0d, (iOnExtraCallback & 7) + 1);
        this.onWarmupCompleted.onExtraCallbackWithResult = onExtraCallback();
        this.onWarmupCompleted.IAuthTabCallback_Parcel = onExtraCallback();
    }

    private int[] onWarmupCompleted(int i2) {
        byte[] bArr = new byte[i2 * 3];
        int[] iArr = null;
        try {
            this.onExtraCallback.get(bArr);
            iArr = new int[256];
            int i3 = 0;
            int i4 = 0;
            while (i4 < i2) {
                byte b = bArr[i3];
                byte b2 = bArr[i3 + 1];
                int i5 = i3 + 3;
                iArr[i4] = (bArr[i3 + 2] & 255) | ((b & 255) << 16) | (-16777216) | ((b2 & 255) << 8);
                i4++;
                i3 = i5;
            }
            return iArr;
        } catch (BufferUnderflowException unused) {
            this.onWarmupCompleted.getInterfaceDescriptor = 1;
            return iArr;
        }
    }

    private void getInterfaceDescriptor() {
        onExtraCallback();
        access100();
    }

    private void access100() {
        int iOnExtraCallback;
        do {
            iOnExtraCallback = onExtraCallback();
            this.onExtraCallback.position(Math.min(this.onExtraCallback.position() + iOnExtraCallback, this.onExtraCallback.limit()));
        } while (iOnExtraCallback > 0);
    }

    private void asBinder() {
        int iOnExtraCallback = onExtraCallback();
        this.IAuthTabCallback = iOnExtraCallback;
        if (iOnExtraCallback <= 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            try {
                int i3 = this.IAuthTabCallback;
                if (i2 >= i3) {
                    return;
                }
                int i4 = i3 - i2;
                this.onExtraCallback.get(this.onExtraCallbackWithResult, i2, i4);
                i2 += i4;
            } catch (Exception unused) {
                Log.isLoggable("GifHeaderParser", 3);
                this.onWarmupCompleted.getInterfaceDescriptor = 1;
                return;
            }
        }
    }

    private int onExtraCallback() {
        try {
            return this.onExtraCallback.get() & 255;
        } catch (Exception unused) {
            this.onWarmupCompleted.getInterfaceDescriptor = 1;
            return 0;
        }
    }

    private int IAuthTabCallbackStubProxy() {
        return this.onExtraCallback.getShort();
    }

    private boolean IAuthTabCallback() {
        return this.onWarmupCompleted.getInterfaceDescriptor != 0;
    }
}
