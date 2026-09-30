package o;

import java.nio.ByteBuffer;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class SelectionControllerExternalSyntheticLambda2 extends TextFieldSelectionState_androidKtExternalSyntheticLambda5 {
    public final TextFieldSelectionState_androidKtExternalSyntheticLambda2 IAuthTabCallback;
    public boolean IAuthTabCallbackDefault;
    private final int asInterface;
    public ByteBuffer onExtraCallback;
    public BasicTextContextMenuProviderKtExternalSyntheticLambda4 onExtraCallbackWithResult;
    public ByteBuffer onNavigationEvent;
    private final int onTransact;
    public long onWarmupCompleted;

    static {
        HandwritingDetectorNodeExternalSyntheticLambda0.onExtraCallback("media3.decoder");
    }

    public static final class onWarmupCompleted extends IllegalStateException {
        public final int currentCapacity;
        public final int requiredCapacity;

        public onWarmupCompleted(int i2, int i3) {
            super("Buffer too small (" + i2 + " < " + i3 + ")");
            this.currentCapacity = i2;
            this.requiredCapacity = i3;
        }
    }

    public static SelectionControllerExternalSyntheticLambda2 asInterface() {
        return new SelectionControllerExternalSyntheticLambda2(0);
    }

    public SelectionControllerExternalSyntheticLambda2(int i2) {
        this(i2, 0);
    }

    public SelectionControllerExternalSyntheticLambda2(int i2, int i3) {
        this.IAuthTabCallback = new TextFieldSelectionState_androidKtExternalSyntheticLambda2();
        this.asInterface = i2;
        this.onTransact = i3;
    }

    @EnsuresNonNull
    public void onExtraCallbackWithResult(int i2) {
        ByteBuffer byteBuffer = this.onNavigationEvent;
        if (byteBuffer == null || byteBuffer.capacity() < i2) {
            this.onNavigationEvent = ByteBuffer.allocate(i2);
        } else {
            this.onNavigationEvent.clear();
        }
    }

    @EnsuresNonNull
    public void IAuthTabCallback(int i2) {
        int i3 = i2 + this.onTransact;
        ByteBuffer byteBuffer = this.onExtraCallback;
        if (byteBuffer == null) {
            this.onExtraCallback = IAuthTabCallbackStub(i3);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i4 = i3 + iPosition;
        if (iCapacity >= i4) {
            this.onExtraCallback = byteBuffer;
            return;
        }
        ByteBuffer byteBufferIAuthTabCallbackStub = IAuthTabCallbackStub(i4);
        byteBufferIAuthTabCallbackStub.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferIAuthTabCallbackStub.put(byteBuffer);
        }
        this.onExtraCallback = byteBufferIAuthTabCallbackStub;
    }

    public final boolean onTransact() {
        return onExtraCallback(1073741824);
    }

    public final void IAuthTabCallbackDefault() {
        ByteBuffer byteBuffer = this.onExtraCallback;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.onNavigationEvent;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    @Override // o.TextFieldSelectionState_androidKtExternalSyntheticLambda5
    public void onNavigationEvent() {
        super.onNavigationEvent();
        ByteBuffer byteBuffer = this.onExtraCallback;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.onNavigationEvent;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.IAuthTabCallbackDefault = false;
    }

    private ByteBuffer IAuthTabCallbackStub(int i2) {
        int i3 = this.asInterface;
        if (i3 == 1) {
            return ByteBuffer.allocate(i2);
        }
        if (i3 == 2) {
            return ByteBuffer.allocateDirect(i2);
        }
        ByteBuffer byteBuffer = this.onExtraCallback;
        throw new onWarmupCompleted(byteBuffer == null ? 0 : byteBuffer.capacity(), i2);
    }
}
