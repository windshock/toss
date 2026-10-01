package o;

import com.fasterxml.jackson.databind.JavaType;
import java.io.IOException;

@FragmentManagerExternalSyntheticLambda0
/* loaded from: /tmp/toss_alldex/classes19.dex */
public class LifecycleEffectKtExternalSyntheticLambda15 extends LifecycleEffectKtExternalSyntheticLambda14<Object> {
    @Override // o.FragmentFactory
    public boolean IAuthTabCallback(FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1, Object obj) {
        return true;
    }

    public LifecycleEffectKtExternalSyntheticLambda15(Class<?> cls) {
        super(cls, false);
    }

    public LifecycleEffectKtExternalSyntheticLambda15(JavaType javaType) {
        super(javaType);
    }

    @Override // o.LifecycleEffectKtExternalSyntheticLambda14, o.FragmentFactory
    public void onExtraCallback(Object obj, getView getview, FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1) throws IOException {
        getview.onNavigationEvent(obj, 0);
        getview.access000();
    }

    @Override // o.FragmentFactory
    public void onExtraCallbackWithResult(Object obj, getView getview, FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1, GridLayout gridLayout) throws IOException {
        gridLayout.IAuthTabCallback(getview, gridLayout.onExtraCallbackWithResult(getview, gridLayout.IAuthTabCallback(obj, getTargetRequestCode.START_OBJECT)));
    }
}
