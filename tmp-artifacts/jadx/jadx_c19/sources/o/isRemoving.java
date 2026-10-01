package o;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import o.getView;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class isRemoving extends getView {
    protected static final int onExtraCallbackWithResult = (getView.IAuthTabCallback.WRITE_NUMBERS_AS_STRINGS.getMask() | getView.IAuthTabCallback.ESCAPE_NON_ASCII.getMask()) | getView.IAuthTabCallback.STRICT_DUPLICATE_DETECTION.getMask();
    public int IAuthTabCallbackDefault;
    protected boolean IAuthTabCallbackStub;
    protected getViewLifecycleOwnerLiveData asBinder;
    public final performViewCreated asInterface;
    public setInitialSavedState getInterfaceDescriptor;
    public boolean onTransact;

    protected abstract void IAuthTabCallback_Parcel(String str) throws IOException;

    public isRemoving(int i2, getViewLifecycleOwnerLiveData getviewlifecycleownerlivedata, performViewCreated performviewcreated) {
        this.IAuthTabCallbackDefault = i2;
        this.asBinder = getviewlifecycleownerlivedata;
        this.asInterface = performviewcreated;
        this.getInterfaceDescriptor = setInitialSavedState.onNavigationEvent(getView.IAuthTabCallback.STRICT_DUPLICATE_DETECTION.enabledIn(i2) ? setEnterSharedElementCallback.onNavigationEvent(this) : null);
        this.onTransact = getView.IAuthTabCallback.WRITE_NUMBERS_AS_STRINGS.enabledIn(i2);
    }

    @Override // o.getView
    public void IAuthTabCallback(Object obj) {
        setInitialSavedState setinitialsavedstate = this.getInterfaceDescriptor;
        if (setinitialsavedstate != null) {
            setinitialsavedstate.onWarmupCompleted(obj);
        }
    }

    @Override // o.getView
    public final boolean onExtraCallbackWithResult(getView.IAuthTabCallback iAuthTabCallback) {
        return (iAuthTabCallback.getMask() & this.IAuthTabCallbackDefault) != 0;
    }

    @Override // o.getView
    public int IAuthTabCallbackDefault() {
        return this.IAuthTabCallbackDefault;
    }

    @Override // o.getView
    public getView onWarmupCompleted(getView.IAuthTabCallback iAuthTabCallback) {
        int mask = iAuthTabCallback.getMask();
        this.IAuthTabCallbackDefault &= ~mask;
        if ((mask & onExtraCallbackWithResult) != 0) {
            if (iAuthTabCallback == getView.IAuthTabCallback.WRITE_NUMBERS_AS_STRINGS) {
                this.onTransact = false;
                return this;
            }
            if (iAuthTabCallback == getView.IAuthTabCallback.ESCAPE_NON_ASCII) {
                onExtraCallback(0);
                return this;
            }
            if (iAuthTabCallback == getView.IAuthTabCallback.STRICT_DUPLICATE_DETECTION) {
                this.getInterfaceDescriptor = this.getInterfaceDescriptor.onWarmupCompleted((setEnterSharedElementCallback) null);
            }
        }
        return this;
    }

    @Override // o.getView
    @Deprecated
    public getView IAuthTabCallback(int i2) {
        int i3 = this.IAuthTabCallbackDefault ^ i2;
        this.IAuthTabCallbackDefault = i2;
        if (i3 != 0) {
            onNavigationEvent(i2, i3);
        }
        return this;
    }

    @Override // o.getView
    public getView onExtraCallbackWithResult(int i2, int i3) {
        int i4 = this.IAuthTabCallbackDefault;
        int i5 = (i2 & i3) | ((~i3) & i4);
        int i6 = i4 ^ i5;
        if (i6 != 0) {
            this.IAuthTabCallbackDefault = i5;
            onNavigationEvent(i5, i6);
        }
        return this;
    }

    public void onNavigationEvent(int i2, int i3) {
        if ((onExtraCallbackWithResult & i3) != 0) {
            this.onTransact = getView.IAuthTabCallback.WRITE_NUMBERS_AS_STRINGS.enabledIn(i2);
            getView.IAuthTabCallback iAuthTabCallback = getView.IAuthTabCallback.ESCAPE_NON_ASCII;
            if (iAuthTabCallback.enabledIn(i3)) {
                if (iAuthTabCallback.enabledIn(i2)) {
                    onExtraCallback(127);
                } else {
                    onExtraCallback(0);
                }
            }
            getView.IAuthTabCallback iAuthTabCallback2 = getView.IAuthTabCallback.STRICT_DUPLICATE_DETECTION;
            if (iAuthTabCallback2.enabledIn(i3)) {
                if (iAuthTabCallback2.enabledIn(i2)) {
                    if (this.getInterfaceDescriptor.extraCallbackWithResult() == null) {
                        this.getInterfaceDescriptor = this.getInterfaceDescriptor.onWarmupCompleted(setEnterSharedElementCallback.onNavigationEvent(this));
                        return;
                    }
                    return;
                }
                this.getInterfaceDescriptor = this.getInterfaceDescriptor.onWarmupCompleted((setEnterSharedElementCallback) null);
            }
        }
    }

    @Override // o.getView
    public getUserVisibleHint onTransact() {
        return this.getInterfaceDescriptor;
    }

    @Override // o.getView
    public void IAuthTabCallbackStub(Object obj) throws IOException {
        getInterfaceDescriptor();
        if (obj != null) {
            IAuthTabCallback(obj);
        }
    }

    @Override // o.getView
    public void onNavigationEvent(hasOptionsMenu hasoptionsmenu) throws IOException {
        onExtraCallbackWithResult(hasoptionsmenu.onWarmupCompleted());
    }

    @Override // o.getView
    public void onExtraCallbackWithResult(hasOptionsMenu hasoptionsmenu) throws IOException {
        asBinder(hasoptionsmenu.onWarmupCompleted());
    }

    @Override // o.getView
    public void IAuthTabCallbackStub(String str) throws IOException {
        IAuthTabCallback_Parcel("write raw value");
        onTransact(str);
    }

    @Override // o.getView
    public void onExtraCallback(hasOptionsMenu hasoptionsmenu) throws IOException {
        IAuthTabCallback_Parcel("write raw value");
        IAuthTabCallback(hasoptionsmenu);
    }

    @Override // o.getView
    public int onExtraCallbackWithResult(getPostOnViewCreatedAlpha getpostonviewcreatedalpha, InputStream inputStream, int i2) throws IOException {
        IAuthTabCallback();
        return 0;
    }

    @Override // o.getView
    public void onExtraCallbackWithResult(Object obj) throws IOException {
        if (obj == null) {
            IAuthTabCallbackStubProxy();
            return;
        }
        getViewLifecycleOwnerLiveData getviewlifecycleownerlivedata = this.asBinder;
        if (getviewlifecycleownerlivedata != null) {
            getviewlifecycleownerlivedata.onWarmupCompleted(this, obj);
        } else {
            onExtraCallback(obj);
        }
    }

    @Override // o.getView, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.IAuthTabCallbackStub) {
            return;
        }
        performViewCreated performviewcreated = this.asInterface;
        if (performviewcreated != null) {
            performviewcreated.close();
        }
        this.IAuthTabCallbackStub = true;
    }

    public boolean readTypedObject() {
        return this.IAuthTabCallbackStub;
    }

    public String onWarmupCompleted(BigDecimal bigDecimal) throws IOException {
        if (getView.IAuthTabCallback.WRITE_BIGDECIMAL_AS_PLAIN.enabledIn(this.IAuthTabCallbackDefault)) {
            int iScale = bigDecimal.scale();
            if (iScale < -9999 || iScale > 9999) {
                IAuthTabCallback(String.format("Attempt to write plain `java.math.BigDecimal` (see JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN) with illegal scale (%d): needs to be between [-%d, %d]", Integer.valueOf(iScale), 9999, 9999));
            }
            return bigDecimal.toPlainString();
        }
        return bigDecimal.toString();
    }

    public final int onWarmupCompleted(int i2, int i3) throws IOException {
        if (i3 < 56320 || i3 > 57343) {
            IAuthTabCallback(String.format("Incomplete surrogate pair: first char 0x%04X, second 0x%04X", Integer.valueOf(i2), Integer.valueOf(i3)));
        }
        return ((i2 << 10) + i3) - 56613888;
    }

    public void onNavigationEvent(byte[] bArr, int i2, int i3) throws IOException {
        if (bArr == null) {
            IAuthTabCallback("Invalid `byte[]` argument: `null`");
        }
        int length = bArr.length;
        int i4 = i2 + i3;
        if ((i4 | i2 | i3 | (length - i4)) < 0) {
            IAuthTabCallback(String.format("Invalid 'offset' (%d) and/or 'len' (%d) arguments for `byte[]` of length %d", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(length)));
        }
    }

    public void onExtraCallback(char[] cArr, int i2, int i3) throws IOException {
        if (cArr == null) {
            IAuthTabCallback("Invalid `char[]` argument: `null`");
        }
        int length = cArr.length;
        int i4 = i2 + i3;
        if ((i4 | i2 | i3 | (length - i4)) < 0) {
            IAuthTabCallback(String.format("Invalid 'offset' (%d) and/or 'len' (%d) arguments for `char[]` of length %d", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(length)));
        }
    }

    public void onWarmupCompleted(String str, int i2, int i3) throws IOException {
        if (str == null) {
            IAuthTabCallback("Invalid `String` argument: `null`");
        }
        int length = str.length();
        int i4 = i2 + i3;
        if ((i4 | i2 | i3 | (length - i4)) < 0) {
            IAuthTabCallback(String.format("Invalid 'offset' (%d) and/or 'len' (%d) arguments for `String` of length %d", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(length)));
        }
    }
}
