package androidx.media3.exoplayer.drm;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;
import o.SelectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted;
import o.TextFieldSelectionState_androidKtExternalSyntheticLambda4;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface DrmSession {
    DrmSessionException IAuthTabCallback();

    void IAuthTabCallback(@Nullable SelectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted selectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted);

    Map<String, String> IAuthTabCallbackStub();

    TextFieldSelectionState_androidKtExternalSyntheticLambda4 onExtraCallback();

    UUID onExtraCallbackWithResult();

    void onExtraCallbackWithResult(@Nullable SelectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted selectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted);

    int onNavigationEvent();

    boolean onNavigationEvent(String str);

    default boolean onTransact() {
        return false;
    }

    byte[] onWarmupCompleted();

    static void onWarmupCompleted(@Nullable DrmSession drmSession, @Nullable DrmSession drmSession2) {
        if (drmSession != drmSession2) {
            if (drmSession2 != null) {
                drmSession2.IAuthTabCallback(null);
            }
            if (drmSession != null) {
                drmSession.onExtraCallbackWithResult(null);
            }
        }
    }

    public static class DrmSessionException extends IOException {
        public final int errorCode;

        public DrmSessionException(Throwable th, int i2) {
            super(th);
            this.errorCode = i2;
        }
    }
}
