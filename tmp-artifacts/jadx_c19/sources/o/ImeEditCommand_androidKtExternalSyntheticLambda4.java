package o;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import o.HandwritingGestureApi34ExternalSyntheticLambda16;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ImeEditCommand_androidKtExternalSyntheticLambda4 implements HandwritingGestureApi34ExternalSyntheticLambda16 {
    private HandwritingGestureApi34ExternalSyntheticLambda16.IAuthTabCallback IAuthTabCallback;
    private HandwritingGestureApi34ExternalSyntheticLambda16.IAuthTabCallback IAuthTabCallbackDefault;
    private HandwritingGestureApi34ExternalSyntheticLambda16.IAuthTabCallback IAuthTabCallbackStub;
    private boolean IAuthTabCallbackStubProxy;
    private int IAuthTabCallback_Parcel;
    private float access000;
    private final boolean access100;
    private HandwritingGestureApi34ExternalSyntheticLambda16.IAuthTabCallback asBinder;
    private ByteBuffer asInterface;
    private ImeEditCommand_androidKtExternalSyntheticLambda0 extraCallback;
    private float extraCallbackWithResult;
    private ShortBuffer getInterfaceDescriptor;
    private boolean onExtraCallback;
    private ByteBuffer onExtraCallbackWithResult;
    private long onTransact;
    private long onWarmupCompleted;

    public ImeEditCommand_androidKtExternalSyntheticLambda4() {
        this(false);
    }

    ImeEditCommand_androidKtExternalSyntheticLambda4(boolean z) {
        this.extraCallbackWithResult = 1.0f;
        this.access000 = 1.0f;
        HandwritingGestureApi34ExternalSyntheticLambda16.IAuthTabCallback iAuthTabCallback = HandwritingGestureApi34ExternalSyntheticLambda16.IAuthTabCallback.onNavigationEvent;
        this.IAuthTabCallbackStub = iAuthTabCallback;
        this.asBinder = iAuthTabCallback;
        this.IAuthTabCallback = iAuthTabCallback;
        this.IAuthTabCallbackDefault = iAuthTabCallback;
        ByteBuffer byteBuffer = HandwritingGestureApi34ExternalSyntheticLambda16.onNavigationEvent;
        this.onExtraCallbackWithResult = byteBuffer;
        this.getInterfaceDescriptor = byteBuffer.asShortBuffer();
        this.asInterface = byteBuffer;
        this.IAuthTabCallback_Parcel = -1;
        this.access100 = z;
    }

    public void onExtraCallbackWithResult(float f) {
        RecordingInputConnection_androidKt.onNavigationEvent(f > 0.0f);
        if (this.extraCallbackWithResult != f) {
            this.extraCallbackWithResult = f;
            this.IAuthTabCallbackStubProxy = true;
        }
    }

    public void onNavigationEvent(float f) {
        RecordingInputConnection_androidKt.onNavigationEvent(f > 0.0f);
        if (this.access000 != f) {
            this.access000 = f;
            this.IAuthTabCallbackStubProxy = true;
        }
    }

    public long IAuthTabCallback(long j) {
        if (this.onTransact >= 1024) {
            long jIAuthTabCallback = this.onWarmupCompleted - ((ImeEditCommand_androidKtExternalSyntheticLambda0) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.extraCallback)).IAuthTabCallback();
            int i2 = this.IAuthTabCallbackDefault.onExtraCallbackWithResult;
            int i3 = this.IAuthTabCallback.onExtraCallbackWithResult;
            if (i2 == i3) {
                return TextFieldDecoratorModifierNodeExternalSyntheticLambda6.IAuthTabCallback(j, jIAuthTabCallback, this.onTransact);
            }
            return TextFieldDecoratorModifierNodeExternalSyntheticLambda6.IAuthTabCallback(j, jIAuthTabCallback * i2, this.onTransact * i3);
        }
        return (long) (this.extraCallbackWithResult * j);
    }

    @Override // o.HandwritingGestureApi34ExternalSyntheticLambda16
    public HandwritingGestureApi34ExternalSyntheticLambda16.IAuthTabCallback onExtraCallbackWithResult(HandwritingGestureApi34ExternalSyntheticLambda16.IAuthTabCallback iAuthTabCallback) throws HandwritingGestureApi34ExternalSyntheticLambda16.onExtraCallbackWithResult {
        if (iAuthTabCallback.onExtraCallback != 2) {
            throw new HandwritingGestureApi34ExternalSyntheticLambda16.onExtraCallbackWithResult(iAuthTabCallback);
        }
        int i2 = this.IAuthTabCallback_Parcel;
        if (i2 == -1) {
            i2 = iAuthTabCallback.onExtraCallbackWithResult;
        }
        this.IAuthTabCallbackStub = iAuthTabCallback;
        HandwritingGestureApi34ExternalSyntheticLambda16.IAuthTabCallback iAuthTabCallback2 = new HandwritingGestureApi34ExternalSyntheticLambda16.IAuthTabCallback(i2, iAuthTabCallback.onWarmupCompleted, 2);
        this.asBinder = iAuthTabCallback2;
        this.IAuthTabCallbackStubProxy = true;
        return iAuthTabCallback2;
    }

    @Override // o.HandwritingGestureApi34ExternalSyntheticLambda16
    public boolean IAuthTabCallback() {
        if (this.asBinder.onExtraCallbackWithResult != -1) {
            return this.access100 || !asBinder();
        }
        return false;
    }

    private boolean asBinder() {
        return Math.abs(this.extraCallbackWithResult - 1.0f) < 1.0E-4f && Math.abs(this.access000 - 1.0f) < 1.0E-4f && this.asBinder.onExtraCallbackWithResult == this.IAuthTabCallbackStub.onExtraCallbackWithResult;
    }

    @Override // o.HandwritingGestureApi34ExternalSyntheticLambda16
    public void onExtraCallbackWithResult(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ImeEditCommand_androidKtExternalSyntheticLambda0 imeEditCommand_androidKtExternalSyntheticLambda0 = (ImeEditCommand_androidKtExternalSyntheticLambda0) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.extraCallback);
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.onWarmupCompleted += iRemaining;
            imeEditCommand_androidKtExternalSyntheticLambda0.onExtraCallback(shortBufferAsShortBuffer);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // o.HandwritingGestureApi34ExternalSyntheticLambda16
    public void onNavigationEvent() {
        ImeEditCommand_androidKtExternalSyntheticLambda0 imeEditCommand_androidKtExternalSyntheticLambda0 = this.extraCallback;
        if (imeEditCommand_androidKtExternalSyntheticLambda0 != null) {
            imeEditCommand_androidKtExternalSyntheticLambda0.onNavigationEvent();
        }
        this.onExtraCallback = true;
    }

    @Override // o.HandwritingGestureApi34ExternalSyntheticLambda16
    public ByteBuffer onExtraCallbackWithResult() {
        int iOnExtraCallbackWithResult;
        ImeEditCommand_androidKtExternalSyntheticLambda0 imeEditCommand_androidKtExternalSyntheticLambda0 = this.extraCallback;
        if (imeEditCommand_androidKtExternalSyntheticLambda0 != null && (iOnExtraCallbackWithResult = imeEditCommand_androidKtExternalSyntheticLambda0.onExtraCallbackWithResult()) > 0) {
            if (this.onExtraCallbackWithResult.capacity() < iOnExtraCallbackWithResult) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(iOnExtraCallbackWithResult).order(ByteOrder.nativeOrder());
                this.onExtraCallbackWithResult = byteBufferOrder;
                this.getInterfaceDescriptor = byteBufferOrder.asShortBuffer();
            } else {
                this.onExtraCallbackWithResult.clear();
                this.getInterfaceDescriptor.clear();
            }
            imeEditCommand_androidKtExternalSyntheticLambda0.onNavigationEvent(this.getInterfaceDescriptor);
            this.onTransact += iOnExtraCallbackWithResult;
            this.onExtraCallbackWithResult.limit(iOnExtraCallbackWithResult);
            this.asInterface = this.onExtraCallbackWithResult;
        }
        ByteBuffer byteBuffer = this.asInterface;
        this.asInterface = HandwritingGestureApi34ExternalSyntheticLambda16.onNavigationEvent;
        return byteBuffer;
    }

    @Override // o.HandwritingGestureApi34ExternalSyntheticLambda16
    public boolean onWarmupCompleted() {
        if (!this.onExtraCallback) {
            return false;
        }
        ImeEditCommand_androidKtExternalSyntheticLambda0 imeEditCommand_androidKtExternalSyntheticLambda0 = this.extraCallback;
        return imeEditCommand_androidKtExternalSyntheticLambda0 == null || imeEditCommand_androidKtExternalSyntheticLambda0.onExtraCallbackWithResult() == 0;
    }

    @Override // o.HandwritingGestureApi34ExternalSyntheticLambda16
    public void onExtraCallback() {
        if (IAuthTabCallback()) {
            HandwritingGestureApi34ExternalSyntheticLambda16.IAuthTabCallback iAuthTabCallback = this.IAuthTabCallbackStub;
            this.IAuthTabCallback = iAuthTabCallback;
            HandwritingGestureApi34ExternalSyntheticLambda16.IAuthTabCallback iAuthTabCallback2 = this.asBinder;
            this.IAuthTabCallbackDefault = iAuthTabCallback2;
            if (this.IAuthTabCallbackStubProxy) {
                this.extraCallback = new ImeEditCommand_androidKtExternalSyntheticLambda0(iAuthTabCallback.onExtraCallbackWithResult, iAuthTabCallback.onWarmupCompleted, this.extraCallbackWithResult, this.access000, iAuthTabCallback2.onExtraCallbackWithResult);
            } else {
                ImeEditCommand_androidKtExternalSyntheticLambda0 imeEditCommand_androidKtExternalSyntheticLambda0 = this.extraCallback;
                if (imeEditCommand_androidKtExternalSyntheticLambda0 != null) {
                    imeEditCommand_androidKtExternalSyntheticLambda0.onWarmupCompleted();
                }
            }
        }
        this.asInterface = HandwritingGestureApi34ExternalSyntheticLambda16.onNavigationEvent;
        this.onWarmupCompleted = 0L;
        this.onTransact = 0L;
        this.onExtraCallback = false;
    }

    @Override // o.HandwritingGestureApi34ExternalSyntheticLambda16
    public void onTransact() {
        this.extraCallbackWithResult = 1.0f;
        this.access000 = 1.0f;
        HandwritingGestureApi34ExternalSyntheticLambda16.IAuthTabCallback iAuthTabCallback = HandwritingGestureApi34ExternalSyntheticLambda16.IAuthTabCallback.onNavigationEvent;
        this.IAuthTabCallbackStub = iAuthTabCallback;
        this.asBinder = iAuthTabCallback;
        this.IAuthTabCallback = iAuthTabCallback;
        this.IAuthTabCallbackDefault = iAuthTabCallback;
        ByteBuffer byteBuffer = HandwritingGestureApi34ExternalSyntheticLambda16.onNavigationEvent;
        this.onExtraCallbackWithResult = byteBuffer;
        this.getInterfaceDescriptor = byteBuffer.asShortBuffer();
        this.asInterface = byteBuffer;
        this.IAuthTabCallback_Parcel = -1;
        this.IAuthTabCallbackStubProxy = false;
        this.extraCallback = null;
        this.onWarmupCompleted = 0L;
        this.onTransact = 0L;
        this.onExtraCallback = false;
    }
}
