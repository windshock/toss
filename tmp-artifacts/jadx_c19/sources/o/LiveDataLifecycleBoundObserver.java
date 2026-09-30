package o;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface LiveDataLifecycleBoundObserver {
    FragmentFactory<?> IAuthTabCallback(findFragmentByTag findfragmentbytag, ArrayType arrayType, onStateNotSaved onstatenotsaved, GridLayout gridLayout, FragmentFactory<Object> fragmentFactory);

    FragmentFactory<?> IAuthTabCallback(findFragmentByTag findfragmentbytag, CollectionLikeType collectionLikeType, onStateNotSaved onstatenotsaved, GridLayout gridLayout, FragmentFactory<Object> fragmentFactory);

    FragmentFactory<?> IAuthTabCallback(findFragmentByTag findfragmentbytag, MapType mapType, onStateNotSaved onstatenotsaved, FragmentFactory<Object> fragmentFactory, GridLayout gridLayout, FragmentFactory<Object> fragmentFactory2);

    FragmentFactory<?> onExtraCallback(findFragmentByTag findfragmentbytag, JavaType javaType, onStateNotSaved onstatenotsaved);

    FragmentFactory<?> onExtraCallback(findFragmentByTag findfragmentbytag, ReferenceType referenceType, onStateNotSaved onstatenotsaved, GridLayout gridLayout, FragmentFactory<Object> fragmentFactory);

    FragmentFactory<?> onWarmupCompleted(findFragmentByTag findfragmentbytag, CollectionType collectionType, onStateNotSaved onstatenotsaved, GridLayout gridLayout, FragmentFactory<Object> fragmentFactory);

    FragmentFactory<?> onWarmupCompleted(findFragmentByTag findfragmentbytag, MapLikeType mapLikeType, onStateNotSaved onstatenotsaved, FragmentFactory<Object> fragmentFactory, GridLayout gridLayout, FragmentFactory<Object> fragmentFactory2);
}
