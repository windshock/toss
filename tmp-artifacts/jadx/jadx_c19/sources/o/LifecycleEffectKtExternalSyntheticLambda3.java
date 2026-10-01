package o;

import java.io.IOException;

@FragmentManagerExternalSyntheticLambda0
/* loaded from: /tmp/toss_alldex/classes19.dex */
public class LifecycleEffectKtExternalSyntheticLambda3 extends LifecycleEffectKtExternalSyntheticLambda14<waitForLoader> {
    public LifecycleEffectKtExternalSyntheticLambda3() {
        super(waitForLoader.class);
    }

    @Override // o.LifecycleEffectKtExternalSyntheticLambda14, o.FragmentFactory
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public void onExtraCallback(waitForLoader waitforloader, getView getview, FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1) throws IOException {
        waitforloader.onExtraCallbackWithResult(getview);
    }

    @Override // o.FragmentFactory
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public final void onExtraCallbackWithResult(waitForLoader waitforloader, getView getview, FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1, GridLayout gridLayout) throws IOException {
        setRetainInstance setretaininstanceOnExtraCallbackWithResult = gridLayout.onExtraCallbackWithResult(getview, gridLayout.IAuthTabCallback(waitforloader, getTargetRequestCode.VALUE_EMBEDDED_OBJECT));
        onExtraCallback(waitforloader, getview, fragmentManagerExternalSyntheticLambda1);
        gridLayout.IAuthTabCallback(getview, setretaininstanceOnExtraCallbackWithResult);
    }
}
