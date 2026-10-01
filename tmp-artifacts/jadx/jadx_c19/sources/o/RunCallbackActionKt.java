package o;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class RunCallbackActionKt {
    protected static final RunCallbackAction[] onNavigationEvent = new RunCallbackAction[0];

    public abstract FragmentActivityExternalSyntheticLambda1<?> IAuthTabCallback(startIntentSenderFromFragment startintentsenderfromfragment, JavaType javaType, onStateNotSaved onstatenotsaved) throws JsonMappingException;

    public abstract FragmentActivityExternalSyntheticLambda1<?> IAuthTabCallback(supportStartPostponedEnterTransition supportstartpostponedentertransition, CollectionType collectionType, onStateNotSaved onstatenotsaved) throws JsonMappingException;

    public abstract FragmentActivityExternalSyntheticLambda1<?> IAuthTabCallback(supportStartPostponedEnterTransition supportstartpostponedentertransition, MapLikeType mapLikeType, onStateNotSaved onstatenotsaved) throws JsonMappingException;

    public abstract setDrawDisappearingViewsLast IAuthTabCallback(supportStartPostponedEnterTransition supportstartpostponedentertransition, JavaType javaType) throws JsonMappingException;

    public abstract FragmentActivityExternalSyntheticLambda1<Object> asInterface(supportStartPostponedEnterTransition supportstartpostponedentertransition, JavaType javaType, onStateNotSaved onstatenotsaved) throws JsonMappingException;

    public abstract setColumnCount onExtraCallback(startIntentSenderFromFragment startintentsenderfromfragment, JavaType javaType) throws JsonMappingException;

    public abstract FragmentActivityExternalSyntheticLambda1<Object> onExtraCallbackWithResult(supportStartPostponedEnterTransition supportstartpostponedentertransition, JavaType javaType, onStateNotSaved onstatenotsaved, Class<?> cls) throws JsonMappingException;

    public abstract FragmentActivityExternalSyntheticLambda1<?> onExtraCallbackWithResult(supportStartPostponedEnterTransition supportstartpostponedentertransition, ArrayType arrayType, onStateNotSaved onstatenotsaved) throws JsonMappingException;

    public abstract FragmentActivityExternalSyntheticLambda1<?> onExtraCallbackWithResult(supportStartPostponedEnterTransition supportstartpostponedentertransition, CollectionLikeType collectionLikeType, onStateNotSaved onstatenotsaved) throws JsonMappingException;

    public abstract FragmentActivityExternalSyntheticLambda1<?> onExtraCallbackWithResult(supportStartPostponedEnterTransition supportstartpostponedentertransition, MapType mapType, onStateNotSaved onstatenotsaved) throws JsonMappingException;

    public abstract JavaType onNavigationEvent(startIntentSenderFromFragment startintentsenderfromfragment, JavaType javaType) throws JsonMappingException;

    public abstract FragmentActivityExternalSyntheticLambda1<?> onNavigationEvent(supportStartPostponedEnterTransition supportstartpostponedentertransition, ReferenceType referenceType, onStateNotSaved onstatenotsaved) throws JsonMappingException;

    public abstract FragmentActivityExternalSyntheticLambda1<?> onWarmupCompleted(supportStartPostponedEnterTransition supportstartpostponedentertransition, JavaType javaType, onStateNotSaved onstatenotsaved) throws JsonMappingException;
}
