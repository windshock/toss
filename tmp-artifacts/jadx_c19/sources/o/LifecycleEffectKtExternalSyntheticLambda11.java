package o;

import java.io.IOException;

@FragmentManagerExternalSyntheticLambda0
/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class LifecycleEffectKtExternalSyntheticLambda11 extends LifecycleEffectKtExternalSyntheticLambda1<Object> {
    private static final long serialVersionUID = 1;

    public LifecycleEffectKtExternalSyntheticLambda11() {
        super(String.class, false);
    }

    @Override // o.FragmentFactory
    public boolean IAuthTabCallback(FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1, Object obj) {
        return ((String) obj).isEmpty();
    }

    @Override // o.LifecycleEffectKtExternalSyntheticLambda14, o.FragmentFactory
    public void onExtraCallback(Object obj, getView getview, FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1) throws IOException {
        getview.asBinder((String) obj);
    }

    @Override // o.LifecycleEffectKtExternalSyntheticLambda1, o.FragmentFactory
    public final void onExtraCallbackWithResult(Object obj, getView getview, FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1, GridLayout gridLayout) throws IOException {
        getview.asBinder((String) obj);
    }
}
