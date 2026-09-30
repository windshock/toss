package o;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import java.io.Serializable;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class LiveData implements Serializable {
    private static final long serialVersionUID = 1;

    public List<LifecycleEventObserver> IAuthTabCallback(findFragmentByTag findfragmentbytag, onStateNotSaved onstatenotsaved, List<LifecycleEventObserver> list) {
        return list;
    }

    public FragmentFactory<?> IAuthTabCallback(findFragmentByTag findfragmentbytag, ArrayType arrayType, onStateNotSaved onstatenotsaved, FragmentFactory<?> fragmentFactory) {
        return fragmentFactory;
    }

    public FragmentFactory<?> IAuthTabCallback(findFragmentByTag findfragmentbytag, CollectionLikeType collectionLikeType, onStateNotSaved onstatenotsaved, FragmentFactory<?> fragmentFactory) {
        return fragmentFactory;
    }

    public FragmentFactory<?> onExtraCallback(findFragmentByTag findfragmentbytag, MapLikeType mapLikeType, onStateNotSaved onstatenotsaved, FragmentFactory<?> fragmentFactory) {
        return fragmentFactory;
    }

    public FragmentFactory<?> onExtraCallback(findFragmentByTag findfragmentbytag, MapType mapType, onStateNotSaved onstatenotsaved, FragmentFactory<?> fragmentFactory) {
        return fragmentFactory;
    }

    public List<LifecycleEventObserver> onExtraCallbackWithResult(findFragmentByTag findfragmentbytag, onStateNotSaved onstatenotsaved, List<LifecycleEventObserver> list) {
        return list;
    }

    public FragmentFactory<?> onExtraCallbackWithResult(findFragmentByTag findfragmentbytag, CollectionType collectionType, onStateNotSaved onstatenotsaved, FragmentFactory<?> fragmentFactory) {
        return fragmentFactory;
    }

    public LifecycleKteventFlow1ExternalSyntheticLambda0 onExtraCallbackWithResult(findFragmentByTag findfragmentbytag, onStateNotSaved onstatenotsaved, LifecycleKteventFlow1ExternalSyntheticLambda0 lifecycleKteventFlow1ExternalSyntheticLambda0) {
        return lifecycleKteventFlow1ExternalSyntheticLambda0;
    }

    public FragmentFactory<?> onNavigationEvent(findFragmentByTag findfragmentbytag, JavaType javaType, onStateNotSaved onstatenotsaved, FragmentFactory<?> fragmentFactory) {
        return fragmentFactory;
    }

    public FragmentFactory<?> onNavigationEvent(findFragmentByTag findfragmentbytag, onStateNotSaved onstatenotsaved, FragmentFactory<?> fragmentFactory) {
        return fragmentFactory;
    }

    public FragmentFactory<?> onWarmupCompleted(findFragmentByTag findfragmentbytag, JavaType javaType, onStateNotSaved onstatenotsaved, FragmentFactory<?> fragmentFactory) {
        return fragmentFactory;
    }
}
