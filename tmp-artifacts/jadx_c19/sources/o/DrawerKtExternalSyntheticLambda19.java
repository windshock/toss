package o;

import androidx.annotation.Nullable;
import androidx.media3.exoplayer.RendererCapabilities;
import java.nio.ByteBuffer;
import o.setApTextSize;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class DrawerKtExternalSyntheticLambda19 extends TextAnnotatedStringNodeExternalSyntheticLambda4 {
    private DrawerKtExternalSyntheticLambda17 IAuthTabCallback;
    private long onExtraCallback;
    private final SelectionControllerExternalSyntheticLambda2 onExtraCallbackWithResult;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 onWarmupCompleted;

    @Override // androidx.media3.exoplayer.Renderer
    public boolean newAuthTabSession() {
        return true;
    }

    public DrawerKtExternalSyntheticLambda19() {
        super(6);
        this.onExtraCallbackWithResult = new SelectionControllerExternalSyntheticLambda2(1);
        this.onWarmupCompleted = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20();
    }

    @Override // androidx.media3.exoplayer.Renderer, androidx.media3.exoplayer.RendererCapabilities
    public String extraCommand() {
        return "CameraMotionRenderer";
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public int onExtraCallbackWithResult(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
        if ("application/x-camera-motion".equals(basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable)) {
            return RendererCapabilities.IAuthTabCallback(4);
        }
        return RendererCapabilities.IAuthTabCallback(0);
    }

    @Override // o.TextAnnotatedStringNodeExternalSyntheticLambda4
    public void handleMessage(int i2, @Nullable Object obj) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        if (i2 == 8) {
            this.IAuthTabCallback = (DrawerKtExternalSyntheticLambda17) obj;
        } else {
            super.handleMessage(i2, obj);
        }
    }

    @Override // o.TextAnnotatedStringNodeExternalSyntheticLambda4
    public void onExtraCallbackWithResult(long j, boolean z) {
        this.onExtraCallback = Long.MIN_VALUE;
        postMessage();
    }

    @Override // o.TextAnnotatedStringNodeExternalSyntheticLambda4
    public void onMinimized() {
        postMessage();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public void onExtraCallbackWithResult(long j, long j2) {
        while (!extraCallback() && this.onExtraCallback < j + 100000) {
            this.onExtraCallbackWithResult.onNavigationEvent();
            if (onExtraCallback(onTransact(), this.onExtraCallbackWithResult, 0) != -4 || this.onExtraCallbackWithResult.IAuthTabCallback()) {
                return;
            }
            long j3 = this.onExtraCallbackWithResult.onWarmupCompleted;
            this.onExtraCallback = j3;
            boolean z = j3 < IAuthTabCallbackStub();
            if (this.IAuthTabCallback != null && !z) {
                this.onExtraCallbackWithResult.IAuthTabCallbackDefault();
                Object[] objArr = {this.onExtraCallbackWithResult.onExtraCallback};
                float[] fArrOnWarmupCompleted = onWarmupCompleted((ByteBuffer) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), objArr, -1084655742));
                if (fArrOnWarmupCompleted != null) {
                    Object[] objArr2 = {this.IAuthTabCallback};
                    ((DrawerKtExternalSyntheticLambda17) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), objArr2, -1084655742)).onExtraCallbackWithResult(this.onExtraCallback - IAuthTabCallbackStubProxy(), fArrOnWarmupCompleted);
                }
            }
        }
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean prefetch() {
        return extraCallback();
    }

    private float[] onWarmupCompleted(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.onWarmupCompleted.onExtraCallback(byteBuffer.array(), byteBuffer.limit());
        this.onWarmupCompleted.asBinder(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i2 = 0; i2 < 3; i2++) {
            fArr[i2] = Float.intBitsToFloat(this.onWarmupCompleted.getInterfaceDescriptor());
        }
        return fArr;
    }

    private void postMessage() {
        DrawerKtExternalSyntheticLambda17 drawerKtExternalSyntheticLambda17 = this.IAuthTabCallback;
        if (drawerKtExternalSyntheticLambda17 != null) {
            drawerKtExternalSyntheticLambda17.onWarmupCompleted();
        }
    }
}
