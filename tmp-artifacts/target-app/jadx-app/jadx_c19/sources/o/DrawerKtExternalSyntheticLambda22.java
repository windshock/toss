package o;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.video.spherical.SceneRenderer$;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import o.TextFieldDecoratorModifierNodeExternalSyntheticLambda12;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class DrawerKtExternalSyntheticLambda22 implements DrawerKtExternalSyntheticLambda0, DrawerKtExternalSyntheticLambda17 {
    private byte[] IAuthTabCallback;
    private int access100;
    private SurfaceTexture getInterfaceDescriptor;
    private final AtomicBoolean onNavigationEvent = new AtomicBoolean();
    private final AtomicBoolean IAuthTabCallbackStub = new AtomicBoolean(true);
    private final DrawerKtExternalSyntheticLambda24 asBinder = new DrawerKtExternalSyntheticLambda24();
    private final DrawerKtExternalSyntheticLambda21 onExtraCallbackWithResult = new DrawerKtExternalSyntheticLambda21();
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda26<Long> asInterface = new TextFieldDecoratorModifierNodeExternalSyntheticLambda26<>();
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda26<DrawerKtExternalSyntheticLambda2> onTransact = new TextFieldDecoratorModifierNodeExternalSyntheticLambda26<>();
    private final float[] IAuthTabCallbackDefault = new float[16];
    private final float[] access000 = new float[16];
    private volatile int onExtraCallback = 0;
    private int onWarmupCompleted = -1;

    public void onWarmupCompleted(int i2) {
        this.onExtraCallback = i2;
    }

    public SurfaceTexture IAuthTabCallback() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            TextFieldDecoratorModifierNodeExternalSyntheticLambda12.onNavigationEvent();
            this.asBinder.onExtraCallbackWithResult();
            TextFieldDecoratorModifierNodeExternalSyntheticLambda12.onNavigationEvent();
            this.access100 = TextFieldDecoratorModifierNodeExternalSyntheticLambda12.onExtraCallbackWithResult();
        } catch (TextFieldDecoratorModifierNodeExternalSyntheticLambda12.onWarmupCompleted e) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("SceneRenderer", "Failed to initialize the renderer", e);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.access100);
        this.getInterfaceDescriptor = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SceneRenderer$.ExternalSyntheticLambda0(this));
        return this.getInterfaceDescriptor;
    }

    public void onWarmupCompleted(float[] fArr, boolean z) {
        GLES20.glClear(16384);
        try {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda12.onNavigationEvent();
        } catch (TextFieldDecoratorModifierNodeExternalSyntheticLambda12.onWarmupCompleted e) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("SceneRenderer", "Failed to draw a frame", e);
        }
        if (this.onNavigationEvent.compareAndSet(true, false)) {
            ((SurfaceTexture) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.getInterfaceDescriptor)).updateTexImage();
            try {
                TextFieldDecoratorModifierNodeExternalSyntheticLambda12.onNavigationEvent();
            } catch (TextFieldDecoratorModifierNodeExternalSyntheticLambda12.onWarmupCompleted e2) {
                TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("SceneRenderer", "Failed to draw a frame", e2);
            }
            if (this.IAuthTabCallbackStub.compareAndSet(true, false)) {
                TextFieldDecoratorModifierNodeExternalSyntheticLambda12.onExtraCallback(this.IAuthTabCallbackDefault);
            }
            long timestamp = this.getInterfaceDescriptor.getTimestamp();
            Long lOnExtraCallback = this.asInterface.onExtraCallback(timestamp);
            if (lOnExtraCallback != null) {
                this.onExtraCallbackWithResult.onExtraCallback(this.IAuthTabCallbackDefault, lOnExtraCallback.longValue());
            }
            DrawerKtExternalSyntheticLambda2 drawerKtExternalSyntheticLambda2OnExtraCallbackWithResult = this.onTransact.onExtraCallbackWithResult(timestamp);
            if (drawerKtExternalSyntheticLambda2OnExtraCallbackWithResult != null) {
                this.asBinder.onWarmupCompleted(drawerKtExternalSyntheticLambda2OnExtraCallbackWithResult);
            }
        }
        Matrix.multiplyMM(this.access000, 0, fArr, 0, this.IAuthTabCallbackDefault, 0);
        this.asBinder.onExtraCallbackWithResult(this.access100, this.access000, z);
    }

    @Override // o.DrawerKtExternalSyntheticLambda0
    public void onVideoFrameAboutToBeRendered(long j, long j2, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, @Nullable MediaFormat mediaFormat) {
        this.asInterface.onWarmupCompleted(j2, Long.valueOf(j));
        onWarmupCompleted(basicTextContextMenuProviderKtExternalSyntheticLambda4.extraCommand, basicTextContextMenuProviderKtExternalSyntheticLambda4.postMessage, j2);
    }

    @Override // o.DrawerKtExternalSyntheticLambda17
    public void onExtraCallbackWithResult(long j, float[] fArr) {
        this.onExtraCallbackWithResult.onExtraCallbackWithResult(j, fArr);
    }

    @Override // o.DrawerKtExternalSyntheticLambda17
    public void onWarmupCompleted() {
        this.asInterface.onNavigationEvent();
        this.onExtraCallbackWithResult.onWarmupCompleted();
        this.IAuthTabCallbackStub.set(true);
    }

    private void onWarmupCompleted(@Nullable byte[] bArr, int i2, long j) {
        byte[] bArr2 = this.IAuthTabCallback;
        int i3 = this.onWarmupCompleted;
        this.IAuthTabCallback = bArr;
        if (i2 == -1) {
            i2 = this.onExtraCallback;
        }
        this.onWarmupCompleted = i2;
        if (i3 == i2 && Arrays.equals(bArr2, this.IAuthTabCallback)) {
            return;
        }
        byte[] bArr3 = this.IAuthTabCallback;
        DrawerKtExternalSyntheticLambda2 drawerKtExternalSyntheticLambda2OnNavigationEvent = bArr3 != null ? DrawerKtExternalSyntheticLambda18.onNavigationEvent(bArr3, this.onWarmupCompleted) : null;
        if (drawerKtExternalSyntheticLambda2OnNavigationEvent == null || !DrawerKtExternalSyntheticLambda24.onExtraCallback(drawerKtExternalSyntheticLambda2OnNavigationEvent)) {
            drawerKtExternalSyntheticLambda2OnNavigationEvent = DrawerKtExternalSyntheticLambda2.IAuthTabCallback(this.onWarmupCompleted);
        }
        this.onTransact.onWarmupCompleted(j, drawerKtExternalSyntheticLambda2OnNavigationEvent);
    }
}
