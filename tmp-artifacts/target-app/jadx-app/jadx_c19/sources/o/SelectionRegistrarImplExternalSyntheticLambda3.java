package o;

import androidx.annotation.Nullable;
import androidx.media3.exoplayer.drm.DrmSession;
import java.util.Map;
import java.util.UUID;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SelectionRegistrarImplExternalSyntheticLambda3 implements DrmSession {
    private final DrmSession.DrmSessionException onExtraCallback;

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public void IAuthTabCallback(@Nullable SelectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted selectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted) {
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public Map<String, String> IAuthTabCallbackStub() {
        return null;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public TextFieldSelectionState_androidKtExternalSyntheticLambda4 onExtraCallback() {
        return null;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public void onExtraCallbackWithResult(@Nullable SelectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted selectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted) {
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public int onNavigationEvent() {
        return 1;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public boolean onNavigationEvent(String str) {
        return false;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public boolean onTransact() {
        return false;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public byte[] onWarmupCompleted() {
        return null;
    }

    public SelectionRegistrarImplExternalSyntheticLambda3(DrmSession.DrmSessionException drmSessionException) {
        this.onExtraCallback = (DrmSession.DrmSessionException) RecordingInputConnection_androidKt.onExtraCallbackWithResult(drmSessionException);
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public DrmSession.DrmSessionException IAuthTabCallback() {
        return this.onExtraCallback;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final UUID onExtraCallbackWithResult() {
        return AddTextContextMenuDataComponentsWithContextNodeExternalSyntheticLambda0.onWarmupCompleted;
    }
}
