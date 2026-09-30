package o;

import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class LifecycleEffectKtExternalSyntheticLambda1<T> extends LifecycleEffectKtExternalSyntheticLambda14<T> {
    public LifecycleEffectKtExternalSyntheticLambda1(Class<T> cls) {
        super(cls);
    }

    protected LifecycleEffectKtExternalSyntheticLambda1(Class<?> cls, boolean z) {
        super(cls);
    }

    @Override // o.FragmentFactory
    public void onExtraCallbackWithResult(T t, getView getview, FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1, GridLayout gridLayout) throws IOException {
        setRetainInstance setretaininstanceOnExtraCallbackWithResult = gridLayout.onExtraCallbackWithResult(getview, gridLayout.IAuthTabCallback(t, getTargetRequestCode.VALUE_STRING));
        onExtraCallback((LifecycleEffectKtExternalSyntheticLambda1<T>) t, getview, fragmentManagerExternalSyntheticLambda1);
        gridLayout.IAuthTabCallback(getview, setretaininstanceOnExtraCallbackWithResult);
    }
}
