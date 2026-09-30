package o;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.ResolvableDeserializer;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import im.toss.features.benefit.ui.BenefitItemAdapter$;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.locks.ReentrantLock;
import o.FragmentActivityExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class InvisibleActionTrampolineActivity implements Serializable {
    private static final long serialVersionUID = 1;
    protected final dispatchOnCancelled<JavaType, FragmentActivityExternalSyntheticLambda1<Object>> _cachedDeserializers;
    protected final HashMap<JavaType, FragmentActivityExternalSyntheticLambda1<Object>> _incompleteDeserializers;
    private final ReentrantLock _incompleteDeserializersLock;

    public InvisibleActionTrampolineActivity() {
        this(2000);
    }

    public InvisibleActionTrampolineActivity(int i2) {
        this(new SavedStateHandleSaverKtExternalSyntheticLambda5(Math.min(64, i2 >> 2), i2));
    }

    public InvisibleActionTrampolineActivity(dispatchOnCancelled<JavaType, FragmentActivityExternalSyntheticLambda1<Object>> dispatchoncancelled) {
        this._incompleteDeserializers = new HashMap<>(8);
        this._incompleteDeserializersLock = new ReentrantLock();
        this._cachedDeserializers = dispatchoncancelled;
    }

    Object writeReplace() {
        this._incompleteDeserializers.clear();
        return this;
    }

    public FragmentActivityExternalSyntheticLambda1<Object> onExtraCallback(supportStartPostponedEnterTransition supportstartpostponedentertransition, RunCallbackActionKt runCallbackActionKt, JavaType javaType) throws JsonMappingException {
        Objects.requireNonNull(javaType, "Null 'propertyType' passed");
        FragmentActivityExternalSyntheticLambda1<Object> fragmentActivityExternalSyntheticLambda1OnNavigationEvent = onNavigationEvent(javaType);
        if (fragmentActivityExternalSyntheticLambda1OnNavigationEvent != null) {
            return fragmentActivityExternalSyntheticLambda1OnNavigationEvent;
        }
        FragmentActivityExternalSyntheticLambda1<Object> fragmentActivityExternalSyntheticLambda1OnNavigationEvent2 = onNavigationEvent(supportstartpostponedentertransition, runCallbackActionKt, javaType);
        return fragmentActivityExternalSyntheticLambda1OnNavigationEvent2 == null ? onWarmupCompleted(supportstartpostponedentertransition, javaType) : fragmentActivityExternalSyntheticLambda1OnNavigationEvent2;
    }

    public setDrawDisappearingViewsLast IAuthTabCallback(supportStartPostponedEnterTransition supportstartpostponedentertransition, RunCallbackActionKt runCallbackActionKt, JavaType javaType) throws JsonMappingException {
        Objects.requireNonNull(javaType, "Null 'type' passed");
        ResolvableDeserializer resolvableDeserializerIAuthTabCallback = runCallbackActionKt.IAuthTabCallback(supportstartpostponedentertransition, javaType);
        if (resolvableDeserializerIAuthTabCallback == null) {
            return onNavigationEvent(supportstartpostponedentertransition, javaType);
        }
        if (resolvableDeserializerIAuthTabCallback instanceof ResolvableDeserializer) {
            resolvableDeserializerIAuthTabCallback.onExtraCallback(supportstartpostponedentertransition);
        }
        return resolvableDeserializerIAuthTabCallback;
    }

    protected FragmentActivityExternalSyntheticLambda1<Object> onNavigationEvent(JavaType javaType) {
        if (onWarmupCompleted(javaType)) {
            return null;
        }
        return this._cachedDeserializers.onExtraCallbackWithResult(javaType);
    }

    protected FragmentActivityExternalSyntheticLambda1<Object> onNavigationEvent(supportStartPostponedEnterTransition supportstartpostponedentertransition, RunCallbackActionKt runCallbackActionKt, JavaType javaType) throws JsonMappingException {
        FragmentActivityExternalSyntheticLambda1<Object> fragmentActivityExternalSyntheticLambda1;
        FragmentActivityExternalSyntheticLambda1<Object> fragmentActivityExternalSyntheticLambda1OnExtraCallbackWithResult;
        boolean zOnWarmupCompleted = onWarmupCompleted(javaType);
        if (!zOnWarmupCompleted && (fragmentActivityExternalSyntheticLambda1OnExtraCallbackWithResult = this._cachedDeserializers.onExtraCallbackWithResult(javaType)) != null) {
            return fragmentActivityExternalSyntheticLambda1OnExtraCallbackWithResult;
        }
        this._incompleteDeserializersLock.lock();
        if (!zOnWarmupCompleted) {
            try {
                FragmentActivityExternalSyntheticLambda1<Object> fragmentActivityExternalSyntheticLambda1OnExtraCallbackWithResult2 = this._cachedDeserializers.onExtraCallbackWithResult(javaType);
                if (fragmentActivityExternalSyntheticLambda1OnExtraCallbackWithResult2 != null) {
                    return fragmentActivityExternalSyntheticLambda1OnExtraCallbackWithResult2;
                }
            } finally {
                this._incompleteDeserializersLock.unlock();
            }
        }
        int size = this._incompleteDeserializers.size();
        if (size > 0 && (fragmentActivityExternalSyntheticLambda1 = this._incompleteDeserializers.get(javaType)) != null) {
            return fragmentActivityExternalSyntheticLambda1;
        }
        try {
            return IAuthTabCallback(supportstartpostponedentertransition, runCallbackActionKt, javaType, zOnWarmupCompleted);
        } finally {
            if (size == 0 && this._incompleteDeserializers.size() > 0) {
                this._incompleteDeserializers.clear();
            }
        }
    }

    protected FragmentActivityExternalSyntheticLambda1<Object> IAuthTabCallback(supportStartPostponedEnterTransition supportstartpostponedentertransition, RunCallbackActionKt runCallbackActionKt, JavaType javaType, boolean z) throws JsonMappingException {
        FragmentActivityExternalSyntheticLambda1<Object> fragmentActivityExternalSyntheticLambda1OnExtraCallbackWithResult;
        try {
            fragmentActivityExternalSyntheticLambda1OnExtraCallbackWithResult = onExtraCallbackWithResult(supportstartpostponedentertransition, runCallbackActionKt, javaType);
        } catch (IllegalArgumentException e) {
            supportstartpostponedentertransition.onWarmupCompleted(javaType, SavedStateHandleImplExternalSyntheticLambda0.onExtraCallback(e));
            fragmentActivityExternalSyntheticLambda1OnExtraCallbackWithResult = null;
        }
        if (fragmentActivityExternalSyntheticLambda1OnExtraCallbackWithResult == null) {
            return null;
        }
        boolean z2 = !z && fragmentActivityExternalSyntheticLambda1OnExtraCallbackWithResult.onTransact();
        if (fragmentActivityExternalSyntheticLambda1OnExtraCallbackWithResult instanceof ResolvableDeserializer) {
            this._incompleteDeserializers.put(javaType, fragmentActivityExternalSyntheticLambda1OnExtraCallbackWithResult);
            try {
                ((ResolvableDeserializer) fragmentActivityExternalSyntheticLambda1OnExtraCallbackWithResult).onExtraCallback(supportstartpostponedentertransition);
            } finally {
                this._incompleteDeserializers.remove(javaType);
            }
        }
        if (z2) {
            this._cachedDeserializers.IAuthTabCallback(javaType, fragmentActivityExternalSyntheticLambda1OnExtraCallbackWithResult);
        }
        return fragmentActivityExternalSyntheticLambda1OnExtraCallbackWithResult;
    }

    protected FragmentActivityExternalSyntheticLambda1<Object> onExtraCallbackWithResult(supportStartPostponedEnterTransition supportstartpostponedentertransition, RunCallbackActionKt runCallbackActionKt, JavaType javaType) throws JsonMappingException {
        startIntentSenderFromFragment startintentsenderfromfragmentOnTransact = supportstartpostponedentertransition.onNavigationEvent();
        if (javaType.writeTypedObject() || javaType.onUnminimized() || javaType.readTypedObject()) {
            javaType = runCallbackActionKt.onNavigationEvent(startintentsenderfromfragmentOnTransact, javaType);
        }
        onStateNotSaved onstatenotsavedOnNavigationEvent = startintentsenderfromfragmentOnTransact.onNavigationEvent(javaType);
        FragmentActivityExternalSyntheticLambda1<Object> fragmentActivityExternalSyntheticLambda1OnWarmupCompleted = onWarmupCompleted(supportstartpostponedentertransition, onstatenotsavedOnNavigationEvent.ICustomTabsCallback());
        if (fragmentActivityExternalSyntheticLambda1OnWarmupCompleted != null) {
            return fragmentActivityExternalSyntheticLambda1OnWarmupCompleted;
        }
        JavaType javaTypeOnNavigationEvent = onNavigationEvent(supportstartpostponedentertransition, onstatenotsavedOnNavigationEvent.ICustomTabsCallback(), javaType);
        if (javaTypeOnNavigationEvent != javaType) {
            onstatenotsavedOnNavigationEvent = startintentsenderfromfragmentOnTransact.onNavigationEvent(javaTypeOnNavigationEvent);
            javaType = javaTypeOnNavigationEvent;
        }
        Class<?> clsIAuthTabCallbackStubProxy = onstatenotsavedOnNavigationEvent.IAuthTabCallbackStubProxy();
        if (clsIAuthTabCallbackStubProxy != null) {
            return runCallbackActionKt.onExtraCallbackWithResult(supportstartpostponedentertransition, javaType, onstatenotsavedOnNavigationEvent, clsIAuthTabCallbackStubProxy);
        }
        SavedStateHandleSaverKtExternalSyntheticLambda3<Object, Object> savedStateHandleSaverKtExternalSyntheticLambda3AsInterface = onstatenotsavedOnNavigationEvent.asInterface();
        if (savedStateHandleSaverKtExternalSyntheticLambda3AsInterface != null) {
            JavaType javaTypeOnExtraCallbackWithResult = savedStateHandleSaverKtExternalSyntheticLambda3AsInterface.onExtraCallbackWithResult(supportstartpostponedentertransition.onExtraCallback());
            if (!javaTypeOnExtraCallbackWithResult.onNavigationEvent(javaType.asBinder())) {
                onstatenotsavedOnNavigationEvent = startintentsenderfromfragmentOnTransact.onNavigationEvent(javaTypeOnExtraCallbackWithResult);
            }
            return new GLFrameBufferRenderercreateFrameBufferRenderer1onDrawCompletetransaction1ExternalSyntheticLambda0(savedStateHandleSaverKtExternalSyntheticLambda3AsInterface, javaTypeOnExtraCallbackWithResult, onExtraCallback(supportstartpostponedentertransition, runCallbackActionKt, javaTypeOnExtraCallbackWithResult, onstatenotsavedOnNavigationEvent));
        }
        return onExtraCallback(supportstartpostponedentertransition, runCallbackActionKt, javaType, onstatenotsavedOnNavigationEvent);
    }

    protected FragmentActivityExternalSyntheticLambda1<?> onExtraCallback(supportStartPostponedEnterTransition supportstartpostponedentertransition, RunCallbackActionKt runCallbackActionKt, JavaType javaType, onStateNotSaved onstatenotsaved) throws JsonMappingException {
        startIntentSenderFromFragment startintentsenderfromfragmentOnTransact = supportstartpostponedentertransition.onNavigationEvent();
        if (javaType.onActivityLayout()) {
            return runCallbackActionKt.onWarmupCompleted(supportstartpostponedentertransition, javaType, onstatenotsaved);
        }
        if (javaType.onPostMessage()) {
            if (javaType.ICustomTabsCallback()) {
                return runCallbackActionKt.onExtraCallbackWithResult(supportstartpostponedentertransition, (ArrayType) javaType, onstatenotsaved);
            }
            if (javaType.onUnminimized() && onstatenotsaved.onTransact().onExtraCallback() != registerOnPreAttachListener$onWarmupCompleted.OBJECT) {
                MapLikeType mapLikeType = (MapLikeType) javaType;
                if (mapLikeType instanceof MapType) {
                    return runCallbackActionKt.onExtraCallbackWithResult(supportstartpostponedentertransition, (MapType) mapLikeType, onstatenotsaved);
                }
                return runCallbackActionKt.IAuthTabCallback(supportstartpostponedentertransition, mapLikeType, onstatenotsaved);
            }
            if (javaType.readTypedObject() && onstatenotsaved.onTransact().onExtraCallback() != registerOnPreAttachListener$onWarmupCompleted.OBJECT) {
                CollectionLikeType collectionLikeType = (CollectionLikeType) javaType;
                if (collectionLikeType instanceof CollectionType) {
                    return runCallbackActionKt.IAuthTabCallback(supportstartpostponedentertransition, (CollectionType) collectionLikeType, onstatenotsaved);
                }
                return runCallbackActionKt.onExtraCallbackWithResult(supportstartpostponedentertransition, collectionLikeType, onstatenotsaved);
            }
        }
        if (javaType.IAuthTabCallback()) {
            return runCallbackActionKt.onNavigationEvent(supportstartpostponedentertransition, (ReferenceType) javaType, onstatenotsaved);
        }
        if (FragmentActivityExternalSyntheticLambda3.class.isAssignableFrom(javaType.asBinder())) {
            return runCallbackActionKt.IAuthTabCallback(startintentsenderfromfragmentOnTransact, javaType, onstatenotsaved);
        }
        return runCallbackActionKt.asInterface(supportstartpostponedentertransition, javaType, onstatenotsaved);
    }

    protected FragmentActivityExternalSyntheticLambda1<Object> onWarmupCompleted(supportStartPostponedEnterTransition supportstartpostponedentertransition, internalPathIteratorPeek internalpathiteratorpeek) throws JsonMappingException {
        Object objOnExtraCallback = supportstartpostponedentertransition.asBinder().onExtraCallback(internalpathiteratorpeek);
        if (objOnExtraCallback == null) {
            return null;
        }
        return onExtraCallbackWithResult(supportstartpostponedentertransition, internalpathiteratorpeek, supportstartpostponedentertransition.onWarmupCompleted(internalpathiteratorpeek, objOnExtraCallback));
    }

    protected FragmentActivityExternalSyntheticLambda1<Object> onExtraCallbackWithResult(supportStartPostponedEnterTransition supportstartpostponedentertransition, internalPathIteratorPeek internalpathiteratorpeek, FragmentActivityExternalSyntheticLambda1<Object> fragmentActivityExternalSyntheticLambda1) throws JsonMappingException {
        SavedStateHandleSaverKtExternalSyntheticLambda3<Object, Object> savedStateHandleSaverKtExternalSyntheticLambda3OnExtraCallbackWithResult = onExtraCallbackWithResult(supportstartpostponedentertransition, internalpathiteratorpeek);
        return savedStateHandleSaverKtExternalSyntheticLambda3OnExtraCallbackWithResult == null ? fragmentActivityExternalSyntheticLambda1 : new GLFrameBufferRenderercreateFrameBufferRenderer1onDrawCompletetransaction1ExternalSyntheticLambda0(savedStateHandleSaverKtExternalSyntheticLambda3OnExtraCallbackWithResult, savedStateHandleSaverKtExternalSyntheticLambda3OnExtraCallbackWithResult.onExtraCallbackWithResult(supportstartpostponedentertransition.onExtraCallback()), fragmentActivityExternalSyntheticLambda1);
    }

    protected SavedStateHandleSaverKtExternalSyntheticLambda3<Object, Object> onExtraCallbackWithResult(supportStartPostponedEnterTransition supportstartpostponedentertransition, internalPathIteratorPeek internalpathiteratorpeek) throws JsonMappingException {
        Object objOnExtraCallbackWithResult = supportstartpostponedentertransition.asBinder().onExtraCallbackWithResult(internalpathiteratorpeek);
        if (objOnExtraCallbackWithResult == null) {
            return null;
        }
        return supportstartpostponedentertransition.onExtraCallback(internalpathiteratorpeek, objOnExtraCallbackWithResult);
    }

    private JavaType onNavigationEvent(supportStartPostponedEnterTransition supportstartpostponedentertransition, internalPathIteratorPeek internalpathiteratorpeek, JavaType javaType) throws JsonMappingException {
        Object objOnWarmupCompleted;
        FragmentActivityExternalSyntheticLambda1<Object> fragmentActivityExternalSyntheticLambda1OnWarmupCompleted;
        JavaType javaTypeAsInterface;
        Object objOnTransact;
        setDrawDisappearingViewsLast setdrawdisappearingviewslastOnExtraCallbackWithResult;
        startActivityFromFragment startactivityfromfragmentAsBinder = supportstartpostponedentertransition.asBinder();
        if (startactivityfromfragmentAsBinder == null) {
            return javaType;
        }
        if (javaType.onUnminimized() && (javaTypeAsInterface = javaType.asInterface()) != null && javaTypeAsInterface.getInterfaceDescriptor() == null && (objOnTransact = startactivityfromfragmentAsBinder.onTransact(internalpathiteratorpeek)) != null && (setdrawdisappearingviewslastOnExtraCallbackWithResult = supportstartpostponedentertransition.onExtraCallbackWithResult(internalpathiteratorpeek, objOnTransact)) != null) {
            javaType = ((MapLikeType) javaType).IAuthTabCallbackDefault(setdrawdisappearingviewslastOnExtraCallbackWithResult);
        }
        JavaType javaTypeIAuthTabCallbackStub = javaType.IAuthTabCallbackStub();
        if (javaTypeIAuthTabCallbackStub != null && javaTypeIAuthTabCallbackStub.getInterfaceDescriptor() == null && (objOnWarmupCompleted = startactivityfromfragmentAsBinder.onWarmupCompleted(internalpathiteratorpeek)) != null) {
            if (objOnWarmupCompleted instanceof FragmentActivityExternalSyntheticLambda1) {
                fragmentActivityExternalSyntheticLambda1OnWarmupCompleted = (FragmentActivityExternalSyntheticLambda1) objOnWarmupCompleted;
            } else {
                Class<?> clsOnNavigationEvent = onNavigationEvent(objOnWarmupCompleted, "findContentDeserializer", FragmentActivityExternalSyntheticLambda1.onNavigationEvent.class);
                fragmentActivityExternalSyntheticLambda1OnWarmupCompleted = clsOnNavigationEvent != null ? supportstartpostponedentertransition.onWarmupCompleted(internalpathiteratorpeek, clsOnNavigationEvent) : null;
            }
            if (fragmentActivityExternalSyntheticLambda1OnWarmupCompleted != null) {
                javaType = javaType.onExtraCallbackWithResult(fragmentActivityExternalSyntheticLambda1OnWarmupCompleted);
            }
        }
        return startactivityfromfragmentAsBinder.IAuthTabCallback(supportstartpostponedentertransition.onNavigationEvent(), internalpathiteratorpeek, javaType);
    }

    private boolean onWarmupCompleted(JavaType javaType) {
        if (!javaType.onPostMessage()) {
            return false;
        }
        JavaType javaTypeIAuthTabCallbackStub = javaType.IAuthTabCallbackStub();
        if (javaTypeIAuthTabCallbackStub == null || (javaTypeIAuthTabCallbackStub.getInterfaceDescriptor() == null && javaTypeIAuthTabCallbackStub.access000() == null)) {
            return javaType.onUnminimized() && javaType.asInterface().getInterfaceDescriptor() != null;
        }
        return true;
    }

    private Class<?> onNavigationEvent(Object obj, String str, Class<?> cls) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof Class)) {
            throw new IllegalStateException("AnnotationIntrospector." + str + "() returned value of type " + obj.getClass().getName() + ": expected type JsonSerializer or Class<JsonSerializer> instead");
        }
        Class<?> cls2 = (Class) obj;
        if (cls2 != cls) {
            if (!((Boolean) SavedStateHandleImplExternalSyntheticLambda0.onWarmupCompleted(-9721623, new Object[]{cls2}, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), 9721630, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult())).booleanValue()) {
                return cls2;
            }
        }
        return null;
    }

    protected FragmentActivityExternalSyntheticLambda1<Object> onWarmupCompleted(supportStartPostponedEnterTransition supportstartpostponedentertransition, JavaType javaType) throws JsonMappingException {
        if (!SavedStateHandleImplExternalSyntheticLambda0.IAuthTabCallbackStubProxy(javaType.asBinder())) {
            return (FragmentActivityExternalSyntheticLambda1) supportstartpostponedentertransition.onWarmupCompleted(javaType, "Cannot find a Value deserializer for abstract type " + javaType);
        }
        return (FragmentActivityExternalSyntheticLambda1) supportstartpostponedentertransition.onWarmupCompleted(javaType, "Cannot find a Value deserializer for type " + javaType);
    }

    protected setDrawDisappearingViewsLast onNavigationEvent(supportStartPostponedEnterTransition supportstartpostponedentertransition, JavaType javaType) throws JsonMappingException {
        return (setDrawDisappearingViewsLast) supportstartpostponedentertransition.onWarmupCompleted(javaType, "Cannot find a (Map) Key deserializer for type " + javaType);
    }
}
