package o;

import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class LifecycleEffectKtExternalSyntheticLambda18 extends LifecycleEffectKtExternalSyntheticLambda14<Object> {
    public abstract String IAuthTabCallback(Object obj);

    public LifecycleEffectKtExternalSyntheticLambda18(Class<?> cls) {
        super(cls, false);
    }

    @Override // o.FragmentFactory
    public boolean IAuthTabCallback(FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1, Object obj) {
        return IAuthTabCallback(obj).isEmpty();
    }

    @Override // o.LifecycleEffectKtExternalSyntheticLambda14, o.FragmentFactory
    public void onExtraCallback(Object obj, getView getview, FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1) throws IOException {
        getview.asBinder(IAuthTabCallback(obj));
    }

    @Override // o.FragmentFactory
    public void onExtraCallbackWithResult(Object obj, getView getview, FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1, GridLayout gridLayout) throws IOException {
        setRetainInstance setretaininstanceOnExtraCallbackWithResult = gridLayout.onExtraCallbackWithResult(getview, gridLayout.IAuthTabCallback(obj, getTargetRequestCode.VALUE_STRING));
        onExtraCallback(obj, getview, fragmentManagerExternalSyntheticLambda1);
        gridLayout.IAuthTabCallback(getview, setretaininstanceOnExtraCallbackWithResult);
    }
}
