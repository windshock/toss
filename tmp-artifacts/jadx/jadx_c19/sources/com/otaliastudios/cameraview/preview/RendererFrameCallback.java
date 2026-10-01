package com.otaliastudios.cameraview.preview;

import android.graphics.SurfaceTexture;
import androidx.annotation.NonNull;
import o.getEdgeEffectFactory;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface RendererFrameCallback {
    void onExtraCallback(@NonNull getEdgeEffectFactory getedgeeffectfactory);

    void onExtraCallbackWithResult(int i2);

    void onNavigationEvent(@NonNull SurfaceTexture surfaceTexture, int i2, float f, float f2);
}
