package o;

import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class SavedStateHandleAttacher extends LifecycleEffectKtExternalSyntheticLambda1<Class<?>> {
    public SavedStateHandleAttacher() {
        super(Class.class, false);
    }

    @Override // o.LifecycleEffectKtExternalSyntheticLambda14, o.FragmentFactory
    public void onExtraCallback(Class<?> cls, getView getview, FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1) throws IOException {
        getview.asBinder(cls.getName());
    }
}
