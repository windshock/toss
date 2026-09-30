package o;

import java.io.File;
import o.LayoutIntrinsics_androidKtExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class FontFamilyResolverImplExternalSyntheticLambda3 implements LayoutIntrinsics_androidKtExternalSyntheticLambda0.onNavigationEvent {
    private final IAuthTabCallback onExtraCallbackWithResult;
    private final long onWarmupCompleted;

    public interface IAuthTabCallback {
        File onWarmupCompleted();
    }

    public FontFamilyResolverImplExternalSyntheticLambda3(IAuthTabCallback iAuthTabCallback, long j) {
        this.onWarmupCompleted = j;
        this.onExtraCallbackWithResult = iAuthTabCallback;
    }

    @Override // o.LayoutIntrinsics_androidKtExternalSyntheticLambda0.onNavigationEvent
    public LayoutIntrinsics_androidKtExternalSyntheticLambda0 onExtraCallbackWithResult() {
        File fileOnWarmupCompleted = this.onExtraCallbackWithResult.onWarmupCompleted();
        if (fileOnWarmupCompleted == null) {
            return null;
        }
        if (fileOnWarmupCompleted.isDirectory() || fileOnWarmupCompleted.mkdirs()) {
            return FontFamilyResolverImplExternalSyntheticLambda2.onNavigationEvent(fileOnWarmupCompleted, this.onWarmupCompleted);
        }
        return null;
    }
}
