package o;

import java.nio.ByteBuffer;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class AndroidMenu_androidKtExternalSyntheticLambda1 extends SelectionControllerExternalSyntheticLambda2 {
    private long IAuthTabCallbackStub;
    private int asBinder;
    private int asInterface;

    public AndroidMenu_androidKtExternalSyntheticLambda1() {
        super(2);
        this.asBinder = 32;
    }

    @Override // o.SelectionControllerExternalSyntheticLambda2, o.TextFieldSelectionState_androidKtExternalSyntheticLambda5
    public void onNavigationEvent() {
        super.onNavigationEvent();
        this.asInterface = 0;
    }

    public void onTransact(int i2) {
        RecordingInputConnection_androidKt.onNavigationEvent(i2 > 0);
        this.asBinder = i2;
    }

    public long IAuthTabCallback_Parcel() {
        return ((SelectionControllerExternalSyntheticLambda2) this).onWarmupCompleted;
    }

    public long access000() {
        return this.IAuthTabCallbackStub;
    }

    public int getInterfaceDescriptor() {
        return this.asInterface;
    }

    public boolean IAuthTabCallbackStubProxy() {
        return this.asInterface > 0;
    }

    public boolean onExtraCallbackWithResult(SelectionControllerExternalSyntheticLambda2 selectionControllerExternalSyntheticLambda2) {
        RecordingInputConnection_androidKt.onNavigationEvent(!selectionControllerExternalSyntheticLambda2.onTransact());
        RecordingInputConnection_androidKt.onNavigationEvent(!selectionControllerExternalSyntheticLambda2.onExtraCallback());
        RecordingInputConnection_androidKt.onNavigationEvent(!selectionControllerExternalSyntheticLambda2.IAuthTabCallback());
        if (!onNavigationEvent(selectionControllerExternalSyntheticLambda2)) {
            return false;
        }
        int i2 = this.asInterface;
        this.asInterface = i2 + 1;
        if (i2 == 0) {
            ((SelectionControllerExternalSyntheticLambda2) this).onWarmupCompleted = selectionControllerExternalSyntheticLambda2.onWarmupCompleted;
            if (selectionControllerExternalSyntheticLambda2.ac_()) {
                onNavigationEvent(1);
            }
        }
        ByteBuffer byteBuffer = selectionControllerExternalSyntheticLambda2.onExtraCallback;
        if (byteBuffer != null) {
            IAuthTabCallback(byteBuffer.remaining());
            this.onExtraCallback.put(byteBuffer);
        }
        this.IAuthTabCallbackStub = selectionControllerExternalSyntheticLambda2.onWarmupCompleted;
        return true;
    }

    private boolean onNavigationEvent(SelectionControllerExternalSyntheticLambda2 selectionControllerExternalSyntheticLambda2) {
        ByteBuffer byteBuffer;
        if (!IAuthTabCallbackStubProxy()) {
            return true;
        }
        if (this.asInterface >= this.asBinder) {
            return false;
        }
        ByteBuffer byteBuffer2 = selectionControllerExternalSyntheticLambda2.onExtraCallback;
        return byteBuffer2 == null || (byteBuffer = this.onExtraCallback) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000;
    }
}
