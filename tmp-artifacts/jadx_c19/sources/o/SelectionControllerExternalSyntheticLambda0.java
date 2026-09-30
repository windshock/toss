package o;

import java.util.ArrayDeque;
import o.SelectionControllerExternalSyntheticLambda2;
import o.TextAnnotatedStringNodeExternalSyntheticLambda0;
import o.TextFieldSelectionState_androidKtExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class SelectionControllerExternalSyntheticLambda0<I extends SelectionControllerExternalSyntheticLambda2, O extends TextAnnotatedStringNodeExternalSyntheticLambda0, E extends TextFieldSelectionState_androidKtExternalSyntheticLambda3> implements TextFieldSelectionState_androidKtExternalSyntheticLambda6<I, O, E> {
    private final O[] IAuthTabCallback;
    private I IAuthTabCallbackDefault;
    private boolean IAuthTabCallbackStub;
    private int IAuthTabCallback_Parcel;
    private boolean access100;
    private int onExtraCallback;
    private final Thread onExtraCallbackWithResult;
    private final I[] onNavigationEvent;
    private E onTransact;
    private int onWarmupCompleted;
    private final Object asBinder = new Object();
    private long asInterface = -9223372036854775807L;
    private final ArrayDeque<I> access000 = new ArrayDeque<>();
    private final ArrayDeque<O> IAuthTabCallbackStubProxy = new ArrayDeque<>();

    protected abstract I onNavigationEvent();

    protected abstract E onNavigationEvent(I i2, O o2, boolean z);

    protected abstract O onTransact();

    protected abstract E onWarmupCompleted(Throwable th);

    public SelectionControllerExternalSyntheticLambda0(I[] iArr, O[] oArr) {
        this.onNavigationEvent = iArr;
        this.onExtraCallback = iArr.length;
        for (int i2 = 0; i2 < this.onExtraCallback; i2++) {
            ((I[]) this.onNavigationEvent)[i2] = onNavigationEvent();
        }
        this.IAuthTabCallback = oArr;
        this.onWarmupCompleted = oArr.length;
        for (int i3 = 0; i3 < this.onWarmupCompleted; i3++) {
            ((O[]) this.IAuthTabCallback)[i3] = onTransact();
        }
        Thread thread = new Thread("ExoPlayer:SimpleDecoder") { // from class: o.SelectionControllerExternalSyntheticLambda0.3
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                SelectionControllerExternalSyntheticLambda0.this.IAuthTabCallback_Parcel();
            }
        };
        this.onExtraCallbackWithResult = thread;
        thread.start();
    }

    public final void IAuthTabCallback(int i2) {
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onExtraCallback == this.onNavigationEvent.length);
        for (I i3 : this.onNavigationEvent) {
            i3.IAuthTabCallback(i2);
        }
    }

    protected final boolean onWarmupCompleted(long j) {
        boolean z;
        synchronized (this.asBinder) {
            long j2 = this.asInterface;
            z = j2 == -9223372036854775807L || j >= j2;
        }
        return z;
    }

    @Override // o.TextFieldSelectionState_androidKtExternalSyntheticLambda6
    public final void onExtraCallback(long j) {
        synchronized (this.asBinder) {
            RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onExtraCallback == this.onNavigationEvent.length || this.IAuthTabCallbackStub);
            this.asInterface = j;
        }
    }

    @Override // o.TextFieldSelectionState_androidKtExternalSyntheticLambda6
    /* renamed from: IAuthTabCallbackStub, reason: merged with bridge method [inline-methods] */
    public final I onExtraCallbackWithResult() throws TextFieldSelectionState_androidKtExternalSyntheticLambda3 {
        I i2;
        synchronized (this.asBinder) {
            IAuthTabCallbackStubProxy();
            RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.IAuthTabCallbackDefault == null);
            int i3 = this.onExtraCallback;
            if (i3 == 0) {
                i2 = null;
            } else {
                I[] iArr = this.onNavigationEvent;
                int i4 = i3 - 1;
                this.onExtraCallback = i4;
                i2 = iArr[i4];
            }
            this.IAuthTabCallbackDefault = i2;
        }
        return i2;
    }

    @Override // o.TextFieldSelectionState_androidKtExternalSyntheticLambda6
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public final void IAuthTabCallback(I i2) throws TextFieldSelectionState_androidKtExternalSyntheticLambda3 {
        synchronized (this.asBinder) {
            IAuthTabCallbackStubProxy();
            RecordingInputConnection_androidKt.onNavigationEvent(i2 == this.IAuthTabCallbackDefault);
            this.access000.addLast(i2);
            access100();
            this.IAuthTabCallbackDefault = null;
        }
    }

    @Override // o.TextFieldSelectionState_androidKtExternalSyntheticLambda6
    /* renamed from: asBinder, reason: merged with bridge method [inline-methods] */
    public final O onWarmupCompleted() throws TextFieldSelectionState_androidKtExternalSyntheticLambda3 {
        synchronized (this.asBinder) {
            IAuthTabCallbackStubProxy();
            if (this.IAuthTabCallbackStubProxy.isEmpty()) {
                return null;
            }
            return this.IAuthTabCallbackStubProxy.removeFirst();
        }
    }

    public void onWarmupCompleted(O o2) {
        synchronized (this.asBinder) {
            onNavigationEvent(o2);
            access100();
        }
    }

    @Override // o.TextFieldSelectionState_androidKtExternalSyntheticLambda6
    public final void onExtraCallback() {
        synchronized (this.asBinder) {
            this.IAuthTabCallbackStub = true;
            this.IAuthTabCallback_Parcel = 0;
            I i2 = this.IAuthTabCallbackDefault;
            if (i2 != null) {
                IAuthTabCallback((SelectionControllerExternalSyntheticLambda0<I, O, E>) i2);
                this.IAuthTabCallbackDefault = null;
            }
            while (!this.access000.isEmpty()) {
                IAuthTabCallback((SelectionControllerExternalSyntheticLambda0<I, O, E>) this.access000.removeFirst());
            }
            while (!this.IAuthTabCallbackStubProxy.isEmpty()) {
                this.IAuthTabCallbackStubProxy.removeFirst().asInterface();
            }
        }
    }

    @Override // o.TextFieldSelectionState_androidKtExternalSyntheticLambda6
    public void IAuthTabCallback() throws InterruptedException {
        synchronized (this.asBinder) {
            this.access100 = true;
            this.asBinder.notify();
        }
        try {
            this.onExtraCallbackWithResult.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E extends o.TextFieldSelectionState_androidKtExternalSyntheticLambda3 */
    private void IAuthTabCallbackStubProxy() throws E, TextFieldSelectionState_androidKtExternalSyntheticLambda3 {
        E e = this.onTransact;
        if (e != null) {
            throw e;
        }
    }

    private void access100() {
        if (IAuthTabCallbackDefault()) {
            this.asBinder.notify();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IAuthTabCallback_Parcel() {
        do {
            try {
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        } while (asInterface());
    }

    private boolean asInterface() throws InterruptedException {
        E e;
        synchronized (this.asBinder) {
            while (!this.access100 && !IAuthTabCallbackDefault()) {
                this.asBinder.wait();
            }
            if (this.access100) {
                return false;
            }
            I iRemoveFirst = this.access000.removeFirst();
            O[] oArr = this.IAuthTabCallback;
            int i2 = this.onWarmupCompleted - 1;
            this.onWarmupCompleted = i2;
            O o2 = oArr[i2];
            boolean z = this.IAuthTabCallbackStub;
            this.IAuthTabCallbackStub = false;
            if (iRemoveFirst.IAuthTabCallback()) {
                o2.onWarmupCompleted(4);
            } else {
                o2.onNavigationEvent = iRemoveFirst.onWarmupCompleted;
                if (iRemoveFirst.onWarmupCompleted()) {
                    o2.onWarmupCompleted(134217728);
                }
                if (!onWarmupCompleted(iRemoveFirst.onWarmupCompleted)) {
                    o2.IAuthTabCallback = true;
                }
                try {
                    e = (E) onNavigationEvent(iRemoveFirst, o2, z);
                } catch (OutOfMemoryError e2) {
                    e = (E) onWarmupCompleted(e2);
                } catch (RuntimeException e3) {
                    e = (E) onWarmupCompleted(e3);
                }
                if (e != null) {
                    synchronized (this.asBinder) {
                        this.onTransact = e;
                    }
                    return false;
                }
            }
            synchronized (this.asBinder) {
                if (this.IAuthTabCallbackStub) {
                    o2.asInterface();
                } else if (o2.IAuthTabCallback) {
                    this.IAuthTabCallback_Parcel++;
                    o2.asInterface();
                } else {
                    o2.onExtraCallbackWithResult = this.IAuthTabCallback_Parcel;
                    this.IAuthTabCallback_Parcel = 0;
                    this.IAuthTabCallbackStubProxy.addLast(o2);
                }
                IAuthTabCallback((SelectionControllerExternalSyntheticLambda0<I, O, E>) iRemoveFirst);
            }
            return true;
        }
    }

    private boolean IAuthTabCallbackDefault() {
        return !this.access000.isEmpty() && this.onWarmupCompleted > 0;
    }

    private void IAuthTabCallback(I i2) {
        i2.onNavigationEvent();
        I[] iArr = this.onNavigationEvent;
        int i3 = this.onExtraCallback;
        this.onExtraCallback = i3 + 1;
        iArr[i3] = i2;
    }

    private void onNavigationEvent(O o2) {
        o2.onNavigationEvent();
        O[] oArr = this.IAuthTabCallback;
        int i2 = this.onWarmupCompleted;
        this.onWarmupCompleted = i2 + 1;
        oArr[i2] = o2;
    }
}
