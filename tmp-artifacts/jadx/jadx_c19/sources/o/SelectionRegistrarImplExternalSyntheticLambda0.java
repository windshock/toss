package o;

import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.drm.DrmSession;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface SelectionRegistrarImplExternalSyntheticLambda0 {
    public static final SelectionRegistrarImplExternalSyntheticLambda0 onExtraCallback = new SelectionRegistrarImplExternalSyntheticLambda0() { // from class: o.SelectionRegistrarImplExternalSyntheticLambda0.1
        @Override // o.SelectionRegistrarImplExternalSyntheticLambda0
        public void IAuthTabCallback(Looper looper, SelectionManagerExternalSyntheticLambda12 selectionManagerExternalSyntheticLambda12) {
        }

        @Override // o.SelectionRegistrarImplExternalSyntheticLambda0
        public DrmSession onExtraCallbackWithResult(@Nullable SelectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted selectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
            if (basicTextContextMenuProviderKtExternalSyntheticLambda4.IAuthTabCallback_Parcel == null) {
                return null;
            }
            return new SelectionRegistrarImplExternalSyntheticLambda3(new DrmSession.DrmSessionException(new TextFieldSelectionManagershowSelectionToolbarViaTextToolbar1ExternalSyntheticLambda4(1), 6001));
        }

        @Override // o.SelectionRegistrarImplExternalSyntheticLambda0
        public int onExtraCallbackWithResult(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
            return basicTextContextMenuProviderKtExternalSyntheticLambda4.IAuthTabCallback_Parcel != null ? 1 : 0;
        }
    };

    public interface onWarmupCompleted {
        public static final onWarmupCompleted IAuthTabCallback = new onWarmupCompleted() { // from class: androidx.media3.exoplayer.drm.DrmSessionManager$DrmSessionReference$$ExternalSyntheticLambda0
            @Override // o.SelectionRegistrarImplExternalSyntheticLambda0.onWarmupCompleted
            public final void release() {
            }
        };

        void release();
    }

    default void IAuthTabCallback() {
    }

    void IAuthTabCallback(Looper looper, SelectionManagerExternalSyntheticLambda12 selectionManagerExternalSyntheticLambda12);

    int onExtraCallbackWithResult(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4);

    DrmSession onExtraCallbackWithResult(@Nullable SelectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted selectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4);

    default void onExtraCallbackWithResult() {
    }

    default onWarmupCompleted onNavigationEvent(@Nullable SelectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted selectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
        return onWarmupCompleted.IAuthTabCallback;
    }
}
