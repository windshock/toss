package o;

import com.fasterxml.jackson.databind.JsonMappingException;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ReflectiveGenericLifecycleObserver extends LifecycleEffectKtExternalSyntheticLambda15 {
    public ReflectiveGenericLifecycleObserver() {
        super((Class<?>) Object.class);
    }

    public ReflectiveGenericLifecycleObserver(Class<?> cls) {
        super(cls);
    }

    @Override // o.LifecycleEffectKtExternalSyntheticLambda15, o.LifecycleEffectKtExternalSyntheticLambda14, o.FragmentFactory
    public void onExtraCallback(Object obj, getView getview, FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1) throws IOException, JsonMappingException {
        if (fragmentManagerExternalSyntheticLambda1.IAuthTabCallback(FragmentManagerExternalSyntheticLambda2.FAIL_ON_EMPTY_BEANS)) {
            onNavigationEvent(fragmentManagerExternalSyntheticLambda1, obj);
        }
        super.onExtraCallback(obj, getview, fragmentManagerExternalSyntheticLambda1);
    }

    @Override // o.LifecycleEffectKtExternalSyntheticLambda15, o.FragmentFactory
    public void onExtraCallbackWithResult(Object obj, getView getview, FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1, GridLayout gridLayout) throws IOException, JsonMappingException {
        if (fragmentManagerExternalSyntheticLambda1.IAuthTabCallback(FragmentManagerExternalSyntheticLambda2.FAIL_ON_EMPTY_BEANS)) {
            onNavigationEvent(fragmentManagerExternalSyntheticLambda1, obj);
        }
        super.onExtraCallbackWithResult(obj, getview, fragmentManagerExternalSyntheticLambda1, gridLayout);
    }

    protected void onNavigationEvent(FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1, Object obj) throws JsonMappingException {
        Class<?> cls = obj.getClass();
        if (isLoadInBackgroundCanceled.onExtraCallback(cls)) {
            fragmentManagerExternalSyntheticLambda1.onWarmupCompleted(onWarmupCompleted(), String.format("No serializer found for class %s and no properties discovered to create BeanSerializer (to avoid exception, disable SerializationFeature.FAIL_ON_EMPTY_BEANS). This appears to be a native image, in which case you may need to configure reflection for the class that is to be serialized", cls.getName()));
        } else {
            fragmentManagerExternalSyntheticLambda1.onWarmupCompleted(onWarmupCompleted(), String.format("No serializer found for class %s and no properties discovered to create BeanSerializer (to avoid exception, disable SerializationFeature.FAIL_ON_EMPTY_BEANS)", cls.getName()));
        }
    }
}
