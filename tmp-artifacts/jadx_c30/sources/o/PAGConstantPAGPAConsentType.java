package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class PAGConstantPAGPAConsentType extends PAGExpressAdWrapperListener<PAGConstantPAGPAConsentType> {
    private final onRenderSuccess IAuthTabCallback;
    private final boolean onNavigationEvent;
    private final String onWarmupCompleted;

    public PAGConstantPAGPAConsentType(onRenderSuccess onrendersuccess) {
        this.IAuthTabCallback = onrendersuccess;
        String strIAuthTabCallback = onrendersuccess.IAuthTabCallback();
        this.onWarmupCompleted = strIAuthTabCallback;
        for (char c : strIAuthTabCallback.toCharArray()) {
            if (c <= '-') {
                this.onNavigationEvent = true;
                return;
            }
        }
        this.onNavigationEvent = false;
    }

    @Override // java.lang.Comparable
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public int compareTo(PAGConstantPAGPAConsentType pAGConstantPAGPAConsentType) {
        return this.onWarmupCompleted.compareTo(pAGConstantPAGPAConsentType.onWarmupCompleted);
    }

    public boolean onWarmupCompleted() {
        return this.onNavigationEvent;
    }

    public String toString() {
        return this.onWarmupCompleted;
    }
}
