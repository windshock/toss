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
public interface RunCallbackAction {
    FragmentActivityExternalSyntheticLambda1<?> IAuthTabCallback(CollectionLikeType collectionLikeType, startIntentSenderFromFragment startintentsenderfromfragment, onStateNotSaved onstatenotsaved, setColumnCount setcolumncount, FragmentActivityExternalSyntheticLambda1<?> fragmentActivityExternalSyntheticLambda1) throws JsonMappingException;

    FragmentActivityExternalSyntheticLambda1<?> IAuthTabCallback(MapType mapType, startIntentSenderFromFragment startintentsenderfromfragment, onStateNotSaved onstatenotsaved, setDrawDisappearingViewsLast setdrawdisappearingviewslast, setColumnCount setcolumncount, FragmentActivityExternalSyntheticLambda1<?> fragmentActivityExternalSyntheticLambda1) throws JsonMappingException;

    FragmentActivityExternalSyntheticLambda1<?> IAuthTabCallback(ReferenceType referenceType, startIntentSenderFromFragment startintentsenderfromfragment, onStateNotSaved onstatenotsaved, setColumnCount setcolumncount, FragmentActivityExternalSyntheticLambda1<?> fragmentActivityExternalSyntheticLambda1) throws JsonMappingException;

    FragmentActivityExternalSyntheticLambda1<?> onExtraCallback(JavaType javaType, startIntentSenderFromFragment startintentsenderfromfragment, onStateNotSaved onstatenotsaved) throws JsonMappingException;

    FragmentActivityExternalSyntheticLambda1<?> onExtraCallback(CollectionType collectionType, startIntentSenderFromFragment startintentsenderfromfragment, onStateNotSaved onstatenotsaved, setColumnCount setcolumncount, FragmentActivityExternalSyntheticLambda1<?> fragmentActivityExternalSyntheticLambda1) throws JsonMappingException;

    FragmentActivityExternalSyntheticLambda1<?> onExtraCallback(MapLikeType mapLikeType, startIntentSenderFromFragment startintentsenderfromfragment, onStateNotSaved onstatenotsaved, setDrawDisappearingViewsLast setdrawdisappearingviewslast, setColumnCount setcolumncount, FragmentActivityExternalSyntheticLambda1<?> fragmentActivityExternalSyntheticLambda1) throws JsonMappingException;

    FragmentActivityExternalSyntheticLambda1<?> onExtraCallback(Class<?> cls, startIntentSenderFromFragment startintentsenderfromfragment, onStateNotSaved onstatenotsaved) throws JsonMappingException;

    FragmentActivityExternalSyntheticLambda1<?> onExtraCallbackWithResult(Class<? extends FragmentActivityExternalSyntheticLambda3> cls, startIntentSenderFromFragment startintentsenderfromfragment, onStateNotSaved onstatenotsaved) throws JsonMappingException;

    FragmentActivityExternalSyntheticLambda1<?> onWarmupCompleted(ArrayType arrayType, startIntentSenderFromFragment startintentsenderfromfragment, onStateNotSaved onstatenotsaved, setColumnCount setcolumncount, FragmentActivityExternalSyntheticLambda1<?> fragmentActivityExternalSyntheticLambda1) throws JsonMappingException;
}
