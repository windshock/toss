package o;

import com.fasterxml.jackson.core.util.ReadConstrainedTextBuffer;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class performViewCreated implements AutoCloseable {
    protected final registerForContextMenu IAuthTabCallback;
    protected byte[] IAuthTabCallbackDefault;
    protected char[] IAuthTabCallbackStub;
    protected final isInLayout IAuthTabCallbackStubProxy;

    @Deprecated
    protected final Object IAuthTabCallback_Parcel;
    protected char[] access000;
    protected byte[] access100;
    protected final boolean asBinder;
    protected boolean asInterface = true;
    private boolean extraCallback = false;
    protected final isDetached getInterfaceDescriptor;
    protected char[] onExtraCallback;
    protected byte[] onExtraCallbackWithResult;
    protected final setSharedElementReturnTransition onNavigationEvent;
    protected final getSharedElementReturnTransition onTransact;
    protected getSharedElementSourceNames onWarmupCompleted;

    public performViewCreated(isDetached isdetached, isInLayout isinlayout, getSharedElementReturnTransition getsharedelementreturntransition, setSharedElementReturnTransition setsharedelementreturntransition, registerForContextMenu registerforcontextmenu, boolean z) {
        this.getInterfaceDescriptor = isdetached;
        this.IAuthTabCallbackStubProxy = isinlayout;
        this.onTransact = getsharedelementreturntransition;
        this.onNavigationEvent = setsharedelementreturntransition;
        this.IAuthTabCallback = registerforcontextmenu;
        this.IAuthTabCallback_Parcel = registerforcontextmenu.IAuthTabCallbackDefault();
        this.asBinder = z;
    }

    public performViewCreated getInterfaceDescriptor() {
        this.asInterface = false;
        return this;
    }

    public isDetached access100() {
        return this.getInterfaceDescriptor;
    }

    public isInLayout IAuthTabCallback_Parcel() {
        return this.IAuthTabCallbackStubProxy;
    }

    public getSharedElementReturnTransition IAuthTabCallbackStub() {
        return this.onTransact;
    }

    public void onExtraCallback(getSharedElementSourceNames getsharedelementsourcenames) {
        this.onWarmupCompleted = getsharedelementsourcenames;
    }

    public getSharedElementSourceNames asBinder() {
        return this.onWarmupCompleted;
    }

    public boolean onTransact() {
        return this.asBinder;
    }

    public registerForContextMenu IAuthTabCallbackDefault() {
        return this.IAuthTabCallback;
    }

    public markState asInterface() {
        return new ReadConstrainedTextBuffer(this.getInterfaceDescriptor, this.onNavigationEvent);
    }

    public byte[] onNavigationEvent() {
        IAuthTabCallback((Object) this.IAuthTabCallbackDefault);
        byte[] bArrOnExtraCallbackWithResult = this.onNavigationEvent.onExtraCallbackWithResult(0);
        this.IAuthTabCallbackDefault = bArrOnExtraCallbackWithResult;
        return bArrOnExtraCallbackWithResult;
    }

    public byte[] onExtraCallbackWithResult() {
        IAuthTabCallback((Object) this.access100);
        byte[] bArrOnExtraCallbackWithResult = this.onNavigationEvent.onExtraCallbackWithResult(1);
        this.access100 = bArrOnExtraCallbackWithResult;
        return bArrOnExtraCallbackWithResult;
    }

    public byte[] IAuthTabCallback() {
        IAuthTabCallback((Object) this.onExtraCallbackWithResult);
        byte[] bArrOnExtraCallbackWithResult = this.onNavigationEvent.onExtraCallbackWithResult(3);
        this.onExtraCallbackWithResult = bArrOnExtraCallbackWithResult;
        return bArrOnExtraCallbackWithResult;
    }

    public char[] onWarmupCompleted() {
        IAuthTabCallback((Object) this.access000);
        char[] cArrIAuthTabCallback = this.onNavigationEvent.IAuthTabCallback(0);
        this.access000 = cArrIAuthTabCallback;
        return cArrIAuthTabCallback;
    }

    public char[] onExtraCallback() {
        IAuthTabCallback((Object) this.onExtraCallback);
        char[] cArrIAuthTabCallback = this.onNavigationEvent.IAuthTabCallback(1);
        this.onExtraCallback = cArrIAuthTabCallback;
        return cArrIAuthTabCallback;
    }

    public char[] IAuthTabCallback(int i2) {
        IAuthTabCallback((Object) this.IAuthTabCallbackStub);
        char[] cArrIAuthTabCallback = this.onNavigationEvent.IAuthTabCallback(3, i2);
        this.IAuthTabCallbackStub = cArrIAuthTabCallback;
        return cArrIAuthTabCallback;
    }

    public void onExtraCallback(byte[] bArr) {
        if (bArr != null) {
            onExtraCallbackWithResult(bArr, this.IAuthTabCallbackDefault);
            this.IAuthTabCallbackDefault = null;
            this.onNavigationEvent.onNavigationEvent(0, bArr);
        }
    }

    public void IAuthTabCallback(byte[] bArr) {
        if (bArr != null) {
            onExtraCallbackWithResult(bArr, this.access100);
            this.access100 = null;
            this.onNavigationEvent.onNavigationEvent(1, bArr);
        }
    }

    public void onNavigationEvent(byte[] bArr) {
        if (bArr != null) {
            onExtraCallbackWithResult(bArr, this.onExtraCallbackWithResult);
            this.onExtraCallbackWithResult = null;
            this.onNavigationEvent.onNavigationEvent(3, bArr);
        }
    }

    public void IAuthTabCallback(char[] cArr) {
        if (cArr != null) {
            onWarmupCompleted(cArr, this.access000);
            this.access000 = null;
            this.onNavigationEvent.IAuthTabCallback(0, cArr);
        }
    }

    public void onExtraCallback(char[] cArr) {
        if (cArr != null) {
            onWarmupCompleted(cArr, this.onExtraCallback);
            this.onExtraCallback = null;
            this.onNavigationEvent.IAuthTabCallback(1, cArr);
        }
    }

    public void onExtraCallbackWithResult(char[] cArr) {
        if (cArr != null) {
            onWarmupCompleted(cArr, this.IAuthTabCallbackStub);
            this.IAuthTabCallbackStub = null;
            this.onNavigationEvent.IAuthTabCallback(3, cArr);
        }
    }

    protected final void IAuthTabCallback(Object obj) {
        if (obj != null) {
            throw new IllegalStateException("Trying to call same allocXxx() method second time");
        }
    }

    protected final void onExtraCallbackWithResult(byte[] bArr, byte[] bArr2) {
        if (bArr != bArr2 && bArr.length < bArr2.length) {
            throw access000();
        }
    }

    protected final void onWarmupCompleted(char[] cArr, char[] cArr2) {
        if (cArr != cArr2 && cArr.length < cArr2.length) {
            throw access000();
        }
    }

    private IllegalArgumentException access000() {
        return new IllegalArgumentException("Trying to release buffer smaller than original");
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        if (this.extraCallback) {
            return;
        }
        this.extraCallback = true;
        if (this.asInterface) {
            this.asInterface = false;
            this.onNavigationEvent.onNavigationEvent();
        }
    }
}
