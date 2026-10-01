package o;

import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class setCornerBottomRightRadius {
    private static final onExtraCallback onWarmupCompleted = new onWarmupCompleted();
    private final int[] IAuthTabCallback;
    private int IAuthTabCallbackDefault;
    private int IAuthTabCallbackStub;
    private final int[] IAuthTabCallbackStubProxy;
    private final setCornerTopLeftRadius access000;
    private final byte[] access100;
    private int asBinder;
    private int asInterface;
    private final int getInterfaceDescriptor;
    private final IAuthTabCallback onExtraCallback;
    private int onExtraCallbackWithResult;
    private int onNavigationEvent;
    private boolean onTransact;

    public interface IAuthTabCallback {
        void accept(onExtraCallback onextracallback) throws IOException;
    }

    public static abstract class onExtraCallback {

        public enum onExtraCallbackWithResult {
            LITERAL,
            BACK_REFERENCE,
            EOD
        }

        public abstract onExtraCallbackWithResult IAuthTabCallback();
    }

    private int onNavigationEvent(int i, byte b) {
        return ((i << 5) ^ (b & 255)) & 32767;
    }

    public static final class onExtraCallbackWithResult extends onExtraCallback {
        private final int IAuthTabCallback;
        private final int onWarmupCompleted;

        public onExtraCallbackWithResult(int i, int i2) {
            this.IAuthTabCallback = i;
            this.onWarmupCompleted = i2;
        }

        public int onWarmupCompleted() {
            return this.onWarmupCompleted;
        }

        public int onNavigationEvent() {
            return this.IAuthTabCallback;
        }

        @Override // o.setCornerBottomRightRadius.onExtraCallback
        public onExtraCallback.onExtraCallbackWithResult IAuthTabCallback() {
            return onExtraCallback.onExtraCallbackWithResult.BACK_REFERENCE;
        }

        public String toString() {
            return "BackReference with offset " + this.IAuthTabCallback + " and length " + this.onWarmupCompleted;
        }
    }

    public static final class onWarmupCompleted extends onExtraCallback {
        @Override // o.setCornerBottomRightRadius.onExtraCallback
        public onExtraCallback.onExtraCallbackWithResult IAuthTabCallback() {
            return onExtraCallback.onExtraCallbackWithResult.EOD;
        }
    }

    public static final class onNavigationEvent extends onExtraCallback {
        private final byte[] IAuthTabCallback;
        private final int onExtraCallbackWithResult;
        private final int onWarmupCompleted;

        public onNavigationEvent(byte[] bArr, int i, int i2) {
            this.IAuthTabCallback = bArr;
            this.onExtraCallbackWithResult = i;
            this.onWarmupCompleted = i2;
        }

        public byte[] onExtraCallbackWithResult() {
            return this.IAuthTabCallback;
        }

        public int onNavigationEvent() {
            return this.onWarmupCompleted;
        }

        public int onWarmupCompleted() {
            return this.onExtraCallbackWithResult;
        }

        @Override // o.setCornerBottomRightRadius.onExtraCallback
        public onExtraCallback.onExtraCallbackWithResult IAuthTabCallback() {
            return onExtraCallback.onExtraCallbackWithResult.LITERAL;
        }

        public String toString() {
            return "LiteralBlock starting at " + this.onExtraCallbackWithResult + " with length " + this.onWarmupCompleted;
        }
    }

    private void onNavigationEvent() {
        while (true) {
            int i = this.IAuthTabCallbackDefault;
            if (i <= 0) {
                return;
            }
            int i2 = this.onExtraCallbackWithResult;
            this.IAuthTabCallbackDefault = i - 1;
            onNavigationEvent(i2 - i);
        }
    }

    private void onExtraCallbackWithResult() throws IOException {
        int iOnWarmupCompleted;
        int iIAuthTabCallbackStub = this.access000.IAuthTabCallbackStub();
        boolean zOnWarmupCompleted = this.access000.onWarmupCompleted();
        int iOnExtraCallback = this.access000.onExtraCallback();
        while (this.IAuthTabCallbackStub >= iIAuthTabCallbackStub) {
            onNavigationEvent();
            int iOnNavigationEvent = onNavigationEvent(this.onExtraCallbackWithResult);
            if (iOnNavigationEvent == -1 || iOnNavigationEvent - this.onExtraCallbackWithResult > this.access000.onTransact()) {
                iOnWarmupCompleted = 0;
            } else {
                iOnWarmupCompleted = onWarmupCompleted(iOnNavigationEvent);
                if (zOnWarmupCompleted && iOnWarmupCompleted <= iOnExtraCallback && this.IAuthTabCallbackStub > iIAuthTabCallbackStub) {
                    iOnWarmupCompleted = onExtraCallback(iOnWarmupCompleted);
                }
            }
            if (iOnWarmupCompleted >= iIAuthTabCallbackStub) {
                if (this.onNavigationEvent != this.onExtraCallbackWithResult) {
                    onWarmupCompleted();
                    this.onNavigationEvent = -1;
                }
                IAuthTabCallback(iOnWarmupCompleted);
                onExtraCallbackWithResult(iOnWarmupCompleted);
                this.IAuthTabCallbackStub -= iOnWarmupCompleted;
                int i = this.onExtraCallbackWithResult + iOnWarmupCompleted;
                this.onExtraCallbackWithResult = i;
                this.onNavigationEvent = i;
            } else {
                this.IAuthTabCallbackStub--;
                int i2 = this.onExtraCallbackWithResult + 1;
                this.onExtraCallbackWithResult = i2;
                if (i2 - this.onNavigationEvent >= this.access000.IAuthTabCallback()) {
                    onWarmupCompleted();
                    this.onNavigationEvent = this.onExtraCallbackWithResult;
                }
            }
        }
    }

    public void onWarmupCompleted(byte[] bArr, int i, int i2) throws IOException {
        int iAsInterface = this.access000.asInterface();
        while (i2 > iAsInterface) {
            onExtraCallback(bArr, i, iAsInterface);
            i += iAsInterface;
            i2 -= iAsInterface;
        }
        if (i2 > 0) {
            onExtraCallback(bArr, i, i2);
        }
    }

    private void onExtraCallback(byte[] bArr, int i, int i2) throws IOException {
        if (i2 > (this.access100.length - this.onExtraCallbackWithResult) - this.IAuthTabCallbackStub) {
            asInterface();
        }
        System.arraycopy(bArr, i, this.access100, this.onExtraCallbackWithResult + this.IAuthTabCallbackStub, i2);
        int i3 = this.IAuthTabCallbackStub + i2;
        this.IAuthTabCallbackStub = i3;
        if (!this.onTransact && i3 >= this.access000.IAuthTabCallbackStub()) {
            IAuthTabCallback();
        }
        if (this.onTransact) {
            onExtraCallbackWithResult();
        }
    }

    public void onExtraCallback() throws IOException {
        int i = this.onNavigationEvent;
        int i2 = this.onExtraCallbackWithResult;
        if (i != i2 || this.IAuthTabCallbackStub > 0) {
            this.onExtraCallbackWithResult = i2 + this.IAuthTabCallbackStub;
            onWarmupCompleted();
        }
        this.onExtraCallback.accept(onWarmupCompleted);
    }

    private void IAuthTabCallback(int i) throws IOException {
        this.onExtraCallback.accept(new onExtraCallbackWithResult(this.onExtraCallbackWithResult - this.asInterface, i));
    }

    private void onWarmupCompleted() throws IOException {
        IAuthTabCallback iAuthTabCallback = this.onExtraCallback;
        byte[] bArr = this.access100;
        int i = this.onNavigationEvent;
        iAuthTabCallback.accept(new onNavigationEvent(bArr, i, this.onExtraCallbackWithResult - i));
    }

    private void IAuthTabCallback() {
        for (int i = 0; i < 2; i++) {
            this.asBinder = onNavigationEvent(this.asBinder, this.access100[i]);
        }
        this.onTransact = true;
    }

    private int onNavigationEvent(int i) {
        int iOnNavigationEvent = onNavigationEvent(this.asBinder, this.access100[i + 2]);
        this.asBinder = iOnNavigationEvent;
        int[] iArr = this.IAuthTabCallback;
        int i2 = iArr[iOnNavigationEvent];
        this.IAuthTabCallbackStubProxy[this.getInterfaceDescriptor & i] = i2;
        iArr[iOnNavigationEvent] = i;
        return i2;
    }

    private void onExtraCallbackWithResult(int i) {
        int iMin = Math.min(i - 1, this.IAuthTabCallbackStub - 3);
        for (int i2 = 1; i2 <= iMin; i2++) {
            onNavigationEvent(this.onExtraCallbackWithResult + i2);
        }
        this.IAuthTabCallbackDefault = (i - iMin) - 1;
    }

    private int onWarmupCompleted(int i) {
        int iIAuthTabCallbackStub = this.access000.IAuthTabCallbackStub() - 1;
        int iMin = Math.min(this.access000.onNavigationEvent(), this.IAuthTabCallbackStub);
        int iMax = Math.max(0, this.onExtraCallbackWithResult - this.access000.onTransact());
        int iMin2 = Math.min(iMin, this.access000.asBinder());
        int iOnExtraCallbackWithResult = this.access000.onExtraCallbackWithResult();
        for (int i2 = 0; i2 < iOnExtraCallbackWithResult && i >= iMax; i2++) {
            int i3 = 0;
            for (int i4 = 0; i4 < iMin; i4++) {
                byte[] bArr = this.access100;
                if (bArr[i + i4] != bArr[this.onExtraCallbackWithResult + i4]) {
                    break;
                }
                i3++;
            }
            if (i3 > iIAuthTabCallbackStub) {
                this.asInterface = i;
                if (i3 >= iMin2) {
                    return i3;
                }
                iIAuthTabCallbackStub = i3;
            }
            i = this.IAuthTabCallbackStubProxy[i & this.getInterfaceDescriptor];
        }
        return iIAuthTabCallbackStub;
    }

    private int onExtraCallback(int i) {
        int i2 = this.asInterface;
        int i3 = this.asBinder;
        this.IAuthTabCallbackStub--;
        int i4 = this.onExtraCallbackWithResult + 1;
        this.onExtraCallbackWithResult = i4;
        int iOnNavigationEvent = onNavigationEvent(i4);
        int i5 = this.IAuthTabCallbackStubProxy[this.onExtraCallbackWithResult & this.getInterfaceDescriptor];
        int iOnWarmupCompleted = onWarmupCompleted(iOnNavigationEvent);
        if (iOnWarmupCompleted > i) {
            return iOnWarmupCompleted;
        }
        this.asInterface = i2;
        this.IAuthTabCallback[this.asBinder] = i5;
        this.asBinder = i3;
        this.onExtraCallbackWithResult--;
        this.IAuthTabCallbackStub++;
        return i;
    }

    private void asInterface() throws IOException {
        int iAsInterface = this.access000.asInterface();
        int i = this.onNavigationEvent;
        if (i != this.onExtraCallbackWithResult && i < iAsInterface) {
            onWarmupCompleted();
            this.onNavigationEvent = this.onExtraCallbackWithResult;
        }
        byte[] bArr = this.access100;
        System.arraycopy(bArr, iAsInterface, bArr, 0, iAsInterface);
        this.onExtraCallbackWithResult -= iAsInterface;
        this.asInterface -= iAsInterface;
        this.onNavigationEvent -= iAsInterface;
        int i2 = 0;
        while (true) {
            int i3 = -1;
            if (i2 >= 32768) {
                break;
            }
            int[] iArr = this.IAuthTabCallback;
            int i4 = iArr[i2];
            if (i4 >= iAsInterface) {
                i3 = i4 - iAsInterface;
            }
            iArr[i2] = i3;
            i2++;
        }
        for (int i5 = 0; i5 < iAsInterface; i5++) {
            int[] iArr2 = this.IAuthTabCallbackStubProxy;
            int i6 = iArr2[i5];
            iArr2[i5] = i6 >= iAsInterface ? i6 - iAsInterface : -1;
        }
    }
}
