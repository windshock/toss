package o;

import androidx.core.util.Pools;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import o.forceLayout;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ResourceFont {
    private final getTargetWidget<SaversKtExternalSyntheticLambda26, String> onExtraCallbackWithResult = new getTargetWidget<>(1000);
    private final Pools.onExtraCallback<IAuthTabCallback> onExtraCallback = forceLayout.onNavigationEvent(10, new forceLayout.onExtraCallbackWithResult<IAuthTabCallback>() { // from class: o.ResourceFont.3
        @Override // o.forceLayout.onExtraCallbackWithResult
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public IAuthTabCallback IAuthTabCallback() {
            try {
                return new IAuthTabCallback(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }
    });

    public String onWarmupCompleted(SaversKtExternalSyntheticLambda26 saversKtExternalSyntheticLambda26) {
        String strIAuthTabCallback;
        synchronized (this.onExtraCallbackWithResult) {
            strIAuthTabCallback = this.onExtraCallbackWithResult.IAuthTabCallback(saversKtExternalSyntheticLambda26);
        }
        if (strIAuthTabCallback == null) {
            strIAuthTabCallback = onExtraCallback(saversKtExternalSyntheticLambda26);
        }
        synchronized (this.onExtraCallbackWithResult) {
            this.onExtraCallbackWithResult.onNavigationEvent(saversKtExternalSyntheticLambda26, strIAuthTabCallback);
        }
        return strIAuthTabCallback;
    }

    private String onExtraCallback(SaversKtExternalSyntheticLambda26 saversKtExternalSyntheticLambda26) {
        IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) markHierarchyDirty.onExtraCallbackWithResult(this.onExtraCallback.onNavigationEvent());
        try {
            saversKtExternalSyntheticLambda26.updateDiskCacheKey(iAuthTabCallback.onNavigationEvent);
            return applyConstraintsFromLayoutParams.onExtraCallback(iAuthTabCallback.onNavigationEvent.digest());
        } finally {
            this.onExtraCallback.onWarmupCompleted(iAuthTabCallback);
        }
    }

    static final class IAuthTabCallback implements forceLayout.onNavigationEvent {
        private final dispatchDraw onExtraCallbackWithResult = dispatchDraw.onWarmupCompleted();
        final MessageDigest onNavigationEvent;

        IAuthTabCallback(MessageDigest messageDigest) {
            this.onNavigationEvent = messageDigest;
        }

        @Override // o.forceLayout.onNavigationEvent
        public dispatchDraw ah_() {
            return this.onExtraCallbackWithResult;
        }
    }
}
