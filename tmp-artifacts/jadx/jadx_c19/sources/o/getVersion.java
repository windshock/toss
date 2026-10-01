package o;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class getVersion {
    public abstract FragmentFactory<Object> onExtraCallbackWithResult(FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1, JavaType javaType) throws JsonMappingException;

    @Deprecated
    public abstract FragmentFactory<Object> onExtraCallbackWithResult(findFragmentByTag findfragmentbytag, JavaType javaType, FragmentFactory<Object> fragmentFactory) throws JsonMappingException;

    public abstract GridLayout onNavigationEvent(findFragmentByTag findfragmentbytag, JavaType javaType) throws JsonMappingException;

    public FragmentFactory<Object> onExtraCallback(FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1, JavaType javaType, FragmentFactory<Object> fragmentFactory) throws JsonMappingException {
        return onExtraCallbackWithResult(fragmentManagerExternalSyntheticLambda1.onNavigationEvent(), javaType, fragmentFactory);
    }
}
