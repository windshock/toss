package com.otaliastudios.cameraview.preview;

import androidx.annotation.NonNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public interface RendererCameraPreview {
    void onExtraCallbackWithResult(@NonNull RendererFrameCallback rendererFrameCallback);

    void onWarmupCompleted(@NonNull RendererFrameCallback rendererFrameCallback);
}
