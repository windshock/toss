package mozilla.components.support.base.feature;

import mozilla.components.support.base.feature.LifecycleAwareFeature;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda0;
import o.TextLinkScopeExternalSyntheticLambda5;
import o.getOnceLogCount;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class LifecycleBinding<T extends LifecycleAwareFeature> implements TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda0 {
    private final getOnceLogCount<T> IAuthTabCallback;

    @TextLinkScopeExternalSyntheticLambda5(onExtraCallbackWithResult = TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_START)
    public final void start() {
        this.IAuthTabCallback.onWarmupCompleted();
    }

    @TextLinkScopeExternalSyntheticLambda5(onExtraCallbackWithResult = TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_STOP)
    public final void stop() {
        this.IAuthTabCallback.onExtraCallback();
    }

    @TextLinkScopeExternalSyntheticLambda5(onExtraCallbackWithResult = TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_DESTROY)
    public final void destroy() {
        this.IAuthTabCallback.onNavigationEvent();
    }
}
