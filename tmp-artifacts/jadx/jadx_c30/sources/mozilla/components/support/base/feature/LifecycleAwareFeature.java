package mozilla.components.support.base.feature;

import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda0;
import o.TextLinkScopeExternalSyntheticLambda5;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface LifecycleAwareFeature extends TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda0 {
    @TextLinkScopeExternalSyntheticLambda5(onExtraCallbackWithResult = TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_START)
    void start();

    @TextLinkScopeExternalSyntheticLambda5(onExtraCallbackWithResult = TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_STOP)
    void stop();
}
