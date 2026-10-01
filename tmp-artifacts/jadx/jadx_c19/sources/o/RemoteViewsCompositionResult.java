package o;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import im.toss.features.benefit.ui.BenefitItemAdapter$;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.FragmentManagerExternalSyntheticLambda5;
import o.callStartTransitionListener;
import o.getNextTransition;
import o.restoreViewState;
import o.startActivityFromFragment;
import o.validateRequestPermissionsRequestCode;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class RemoteViewsCompositionResult extends RemoteCollectionItemsBuilder implements Serializable {
    private static final long serialVersionUID = 1;
    private static final Class<?>[] onExtraCallbackWithResult = {Throwable.class};
    public static final RemoteViewsCompositionResult onExtraCallback = new RemoteViewsCompositionResult(new RadioButtonKtRadioButtonElement11());

    public RemoteViewsCompositionResult(RadioButtonKtRadioButtonElement11 radioButtonKtRadioButtonElement11) {
        super(radioButtonKtRadioButtonElement11);
    }

    @Override // o.RunCallbackActionKt
    public FragmentActivityExternalSyntheticLambda1<Object> asInterface(supportStartPostponedEnterTransition supportstartpostponedentertransition, JavaType javaType, onStateNotSaved onstatenotsaved) throws JsonMappingException {
        JavaType javaTypeAccess000;
        startIntentSenderFromFragment startintentsenderfromfragmentOnNavigationEvent = supportstartpostponedentertransition.onNavigationEvent();
        FragmentActivityExternalSyntheticLambda1<?> fragmentActivityExternalSyntheticLambda1OnNavigationEvent = onNavigationEvent(javaType, startintentsenderfromfragmentOnNavigationEvent, onstatenotsaved);
        if (fragmentActivityExternalSyntheticLambda1OnNavigationEvent != null) {
            if (this._factoryConfig.onExtraCallbackWithResult()) {
                Iterator<RemoteViewsInfo> it = this._factoryConfig.onWarmupCompleted().iterator();
                while (it.hasNext()) {
                    fragmentActivityExternalSyntheticLambda1OnNavigationEvent = it.next().onNavigationEvent(supportstartpostponedentertransition.onNavigationEvent(), onstatenotsaved, fragmentActivityExternalSyntheticLambda1OnNavigationEvent);
                }
            }
            return fragmentActivityExternalSyntheticLambda1OnNavigationEvent;
        }
        if (javaType.ICustomTabsCallback_Parcel()) {
            return IAuthTabCallbackStub(supportstartpostponedentertransition, javaType, onstatenotsaved);
        }
        if (javaType.writeTypedObject() && !javaType.ICustomTabsCallbackStub() && !javaType.onActivityLayout() && (javaTypeAccess000 = access000(supportstartpostponedentertransition, javaType, onstatenotsaved)) != null) {
            return onTransact(supportstartpostponedentertransition, javaTypeAccess000, startintentsenderfromfragmentOnNavigationEvent.onNavigationEvent(javaTypeAccess000));
        }
        FragmentActivityExternalSyntheticLambda1<?> fragmentActivityExternalSyntheticLambda1AsBinder = asBinder(supportstartpostponedentertransition, javaType, onstatenotsaved);
        if (fragmentActivityExternalSyntheticLambda1AsBinder != null) {
            return fragmentActivityExternalSyntheticLambda1AsBinder;
        }
        if (!onExtraCallbackWithResult(javaType.asBinder())) {
            return null;
        }
        onNavigationEvent(supportstartpostponedentertransition, javaType, onstatenotsaved);
        FragmentActivityExternalSyntheticLambda1<Object> fragmentActivityExternalSyntheticLambda1OnExtraCallback = onExtraCallback(supportstartpostponedentertransition, javaType, onstatenotsaved);
        return fragmentActivityExternalSyntheticLambda1OnExtraCallback != null ? fragmentActivityExternalSyntheticLambda1OnExtraCallback : onTransact(supportstartpostponedentertransition, javaType, onstatenotsaved);
    }

    @Override // o.RunCallbackActionKt
    public FragmentActivityExternalSyntheticLambda1<Object> onExtraCallbackWithResult(supportStartPostponedEnterTransition supportstartpostponedentertransition, JavaType javaType, onStateNotSaved onstatenotsaved, Class<?> cls) throws JsonMappingException {
        JavaType javaTypeOnWarmupCompleted;
        if (supportstartpostponedentertransition.onWarmupCompleted(setLayoutTransition.INFER_BUILDER_TYPE_BINDINGS)) {
            javaTypeOnWarmupCompleted = supportstartpostponedentertransition.onExtraCallback().onExtraCallbackWithResult(cls, javaType.onWarmupCompleted());
        } else {
            javaTypeOnWarmupCompleted = supportstartpostponedentertransition.onWarmupCompleted(cls);
        }
        return IAuthTabCallbackDefault(supportstartpostponedentertransition, javaType, supportstartpostponedentertransition.onNavigationEvent().onExtraCallback(javaTypeOnWarmupCompleted, onstatenotsaved));
    }

    protected FragmentActivityExternalSyntheticLambda1<?> asBinder(supportStartPostponedEnterTransition supportstartpostponedentertransition, JavaType javaType, onStateNotSaved onstatenotsaved) throws JsonMappingException {
        FragmentActivityExternalSyntheticLambda1<?> fragmentActivityExternalSyntheticLambda1OnExtraCallbackWithResult = onExtraCallbackWithResult(supportstartpostponedentertransition, javaType, onstatenotsaved);
        if (fragmentActivityExternalSyntheticLambda1OnExtraCallbackWithResult != null && this._factoryConfig.onExtraCallbackWithResult()) {
            Iterator<RemoteViewsInfo> it = this._factoryConfig.onWarmupCompleted().iterator();
            while (it.hasNext()) {
                fragmentActivityExternalSyntheticLambda1OnExtraCallbackWithResult = it.next().onNavigationEvent(supportstartpostponedentertransition.onNavigationEvent(), onstatenotsaved, fragmentActivityExternalSyntheticLambda1OnExtraCallbackWithResult);
            }
        }
        return fragmentActivityExternalSyntheticLambda1OnExtraCallbackWithResult;
    }

    protected FragmentActivityExternalSyntheticLambda1<Object> onExtraCallback(supportStartPostponedEnterTransition supportstartpostponedentertransition, JavaType javaType, onStateNotSaved onstatenotsaved) throws JsonMappingException {
        String strOnNavigationEvent = LocalViewModelStoreOwnerExternalSyntheticLambda0.onNavigationEvent(javaType);
        if (strOnNavigationEvent == null || supportstartpostponedentertransition.onNavigationEvent().onTransact(javaType.asBinder()) != null) {
            return null;
        }
        return new CanvasFrontBufferedRendererExternalSyntheticLambda5(javaType, strOnNavigationEvent);
    }

    protected JavaType access000(supportStartPostponedEnterTransition supportstartpostponedentertransition, JavaType javaType, onStateNotSaved onstatenotsaved) throws JsonMappingException {
        Iterator<onResumeFragments> it = this._factoryConfig.IAuthTabCallback().iterator();
        while (it.hasNext()) {
            JavaType javaTypeOnNavigationEvent = it.next().onNavigationEvent(supportstartpostponedentertransition.onNavigationEvent(), onstatenotsaved);
            if (javaTypeOnNavigationEvent != null) {
                return javaTypeOnNavigationEvent;
            }
        }
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.fasterxml.jackson.databind.JsonMappingException */
    public FragmentActivityExternalSyntheticLambda1<Object> onTransact(supportStartPostponedEnterTransition supportstartpostponedentertransition, JavaType javaType, onStateNotSaved onstatenotsaved) throws InvalidDefinitionException, JsonMappingException {
        RadioButtonKtisSelectableGroup1 radioButtonKtisSelectableGroup1OnExtraCallbackWithResult;
        try {
            internalGetVerifier internalgetverifierOnNavigationEvent = onNavigationEvent(supportstartpostponedentertransition, onstatenotsaved);
            RemoteViewsTranslatorApi28Impl remoteViewsTranslatorApi28ImplOnWarmupCompleted = onWarmupCompleted(supportstartpostponedentertransition, onstatenotsaved);
            remoteViewsTranslatorApi28ImplOnWarmupCompleted.onExtraCallback(internalgetverifierOnNavigationEvent);
            onWarmupCompleted(supportstartpostponedentertransition, onstatenotsaved, remoteViewsTranslatorApi28ImplOnWarmupCompleted);
            onExtraCallback(supportstartpostponedentertransition, onstatenotsaved, remoteViewsTranslatorApi28ImplOnWarmupCompleted);
            IAuthTabCallback(supportstartpostponedentertransition, onstatenotsaved, remoteViewsTranslatorApi28ImplOnWarmupCompleted);
            onExtraCallbackWithResult(supportstartpostponedentertransition, onstatenotsaved, remoteViewsTranslatorApi28ImplOnWarmupCompleted);
            startIntentSenderFromFragment startintentsenderfromfragmentOnNavigationEvent = supportstartpostponedentertransition.onNavigationEvent();
            if (this._factoryConfig.onExtraCallbackWithResult()) {
                Iterator<RemoteViewsInfo> it = this._factoryConfig.onWarmupCompleted().iterator();
                while (it.hasNext()) {
                    remoteViewsTranslatorApi28ImplOnWarmupCompleted = it.next().IAuthTabCallback(startintentsenderfromfragmentOnNavigationEvent, onstatenotsaved, remoteViewsTranslatorApi28ImplOnWarmupCompleted);
                }
            }
            if (javaType.writeTypedObject() && !internalgetverifierOnNavigationEvent.IAuthTabCallbackStubProxy()) {
                radioButtonKtisSelectableGroup1OnExtraCallbackWithResult = remoteViewsTranslatorApi28ImplOnWarmupCompleted.onExtraCallback();
            } else {
                radioButtonKtisSelectableGroup1OnExtraCallbackWithResult = remoteViewsTranslatorApi28ImplOnWarmupCompleted.onExtraCallbackWithResult();
            }
            if (this._factoryConfig.onExtraCallbackWithResult()) {
                Iterator<RemoteViewsInfo> it2 = this._factoryConfig.onWarmupCompleted().iterator();
                while (it2.hasNext()) {
                    radioButtonKtisSelectableGroup1OnExtraCallbackWithResult = it2.next().onNavigationEvent(startintentsenderfromfragmentOnNavigationEvent, onstatenotsaved, (FragmentActivityExternalSyntheticLambda1<?>) radioButtonKtisSelectableGroup1OnExtraCallbackWithResult);
                }
            }
            return radioButtonKtisSelectableGroup1OnExtraCallbackWithResult;
        } catch (IllegalArgumentException e) {
            throw InvalidDefinitionException.onExtraCallback(supportstartpostponedentertransition.getInterfaceDescriptor(), SavedStateHandleImplExternalSyntheticLambda0.onExtraCallback(e), onstatenotsaved, (nSetBufferTransparency) null).IAuthTabCallback(e);
        } catch (NoClassDefFoundError e2) {
            return new markNow(e2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.fasterxml.jackson.databind.exc.InvalidDefinitionException */
    protected FragmentActivityExternalSyntheticLambda1<Object> IAuthTabCallbackDefault(supportStartPostponedEnterTransition supportstartpostponedentertransition, JavaType javaType, onStateNotSaved onstatenotsaved) throws InvalidDefinitionException, JsonMappingException {
        try {
            internalGetVerifier internalgetverifierOnNavigationEvent = onNavigationEvent(supportstartpostponedentertransition, onstatenotsaved);
            startIntentSenderFromFragment startintentsenderfromfragmentOnNavigationEvent = supportstartpostponedentertransition.onNavigationEvent();
            RemoteViewsTranslatorApi28Impl remoteViewsTranslatorApi28ImplOnWarmupCompleted = onWarmupCompleted(supportstartpostponedentertransition, onstatenotsaved);
            remoteViewsTranslatorApi28ImplOnWarmupCompleted.onExtraCallback(internalgetverifierOnNavigationEvent);
            onWarmupCompleted(supportstartpostponedentertransition, onstatenotsaved, remoteViewsTranslatorApi28ImplOnWarmupCompleted);
            onExtraCallback(supportstartpostponedentertransition, onstatenotsaved, remoteViewsTranslatorApi28ImplOnWarmupCompleted);
            IAuthTabCallback(supportstartpostponedentertransition, onstatenotsaved, remoteViewsTranslatorApi28ImplOnWarmupCompleted);
            onExtraCallbackWithResult(supportstartpostponedentertransition, onstatenotsaved, remoteViewsTranslatorApi28ImplOnWarmupCompleted);
            FragmentManagerExternalSyntheticLambda5.IAuthTabCallback iAuthTabCallbackAccess100 = onstatenotsaved.access100();
            String str = iAuthTabCallbackAccess100 == null ? "build" : iAuthTabCallbackAccess100.onNavigationEvent;
            nGetPreviousReleaseFenceFd ngetpreviousreleasefencefdOnNavigationEvent = onstatenotsaved.onNavigationEvent(str, null);
            if (ngetpreviousreleasefencefdOnNavigationEvent != null && startintentsenderfromfragmentOnNavigationEvent.asInterface()) {
                SavedStateHandleImplExternalSyntheticLambda0.onWarmupCompleted(1769484191, new Object[]{ngetpreviousreleasefencefdOnNavigationEvent.IAuthTabCallback_Parcel(), Boolean.valueOf(startintentsenderfromfragmentOnNavigationEvent.onExtraCallback(setLayoutTransition.OVERRIDE_PUBLIC_ACCESS_MODIFIERS))}, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -1769484188, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult());
            }
            remoteViewsTranslatorApi28ImplOnWarmupCompleted.IAuthTabCallback(ngetpreviousreleasefencefdOnNavigationEvent, iAuthTabCallbackAccess100);
            if (this._factoryConfig.onExtraCallbackWithResult()) {
                Iterator<RemoteViewsInfo> it = this._factoryConfig.onWarmupCompleted().iterator();
                while (it.hasNext()) {
                    remoteViewsTranslatorApi28ImplOnWarmupCompleted = it.next().IAuthTabCallback(startintentsenderfromfragmentOnNavigationEvent, onstatenotsaved, remoteViewsTranslatorApi28ImplOnWarmupCompleted);
                }
            }
            FragmentActivityExternalSyntheticLambda1<?> fragmentActivityExternalSyntheticLambda1IAuthTabCallback = remoteViewsTranslatorApi28ImplOnWarmupCompleted.IAuthTabCallback(javaType, str);
            if (this._factoryConfig.onExtraCallbackWithResult()) {
                Iterator<RemoteViewsInfo> it2 = this._factoryConfig.onWarmupCompleted().iterator();
                while (it2.hasNext()) {
                    fragmentActivityExternalSyntheticLambda1IAuthTabCallback = it2.next().onNavigationEvent(startintentsenderfromfragmentOnNavigationEvent, onstatenotsaved, fragmentActivityExternalSyntheticLambda1IAuthTabCallback);
                }
            }
            return fragmentActivityExternalSyntheticLambda1IAuthTabCallback;
        } catch (IllegalArgumentException e) {
            throw InvalidDefinitionException.onExtraCallback(supportstartpostponedentertransition.getInterfaceDescriptor(), SavedStateHandleImplExternalSyntheticLambda0.onExtraCallback(e), onstatenotsaved, (nSetBufferTransparency) null);
        } catch (NoClassDefFoundError e2) {
            return new markNow(e2);
        }
    }

    protected void onExtraCallback(supportStartPostponedEnterTransition supportstartpostponedentertransition, onStateNotSaved onstatenotsaved, RemoteViewsTranslatorApi28Impl remoteViewsTranslatorApi28Impl) throws JsonMappingException {
        RuntimeVersionProtobufRuntimeVersionException runtimeVersionProtobufRuntimeVersionExceptionOnWarmupCompleted;
        getParentFragmentManager getparentfragmentmanagerOnExtraCallback;
        JavaType javaType;
        nTransactionReparent ntransactionreparentOnMinimized = onstatenotsaved.onMinimized();
        if (ntransactionreparentOnMinimized == null) {
            return;
        }
        Class<?> clsOnExtraCallback = ntransactionreparentOnMinimized.onExtraCallback();
        getParentFragment getparentfragmentIAuthTabCallback = supportstartpostponedentertransition.IAuthTabCallback(onstatenotsaved.ICustomTabsCallback(), ntransactionreparentOnMinimized);
        if (clsOnExtraCallback == getNextTransition.onWarmupCompleted.class) {
            FragmentKtExternalSyntheticLambda0 fragmentKtExternalSyntheticLambda0OnExtraCallbackWithResult = ntransactionreparentOnMinimized.onExtraCallbackWithResult();
            runtimeVersionProtobufRuntimeVersionExceptionOnWarmupCompleted = remoteViewsTranslatorApi28Impl.onWarmupCompleted(fragmentKtExternalSyntheticLambda0OnExtraCallbackWithResult);
            if (runtimeVersionProtobufRuntimeVersionExceptionOnWarmupCompleted == null) {
                throw new IllegalArgumentException(String.format("Invalid Object Id definition for %s: cannot find property with name %s", SavedStateHandleImplExternalSyntheticLambda0.IAuthTabCallback(onstatenotsaved.onMessageChannelReady()), SavedStateHandleImplExternalSyntheticLambda0.onExtraCallbackWithResult(fragmentKtExternalSyntheticLambda0OnExtraCallbackWithResult)));
            }
            JavaType javaTypeIAuthTabCallback = runtimeVersionProtobufRuntimeVersionExceptionOnWarmupCompleted.IAuthTabCallback();
            javaType = javaTypeIAuthTabCallback;
            getparentfragmentmanagerOnExtraCallback = new SurfaceTextureRendererExternalSyntheticLambda0(ntransactionreparentOnMinimized.IAuthTabCallbackDefault());
        } else {
            JavaType javaType2 = supportstartpostponedentertransition.onExtraCallback().onExtraCallback(supportstartpostponedentertransition.onWarmupCompleted(clsOnExtraCallback), getParentFragmentManager.class)[0];
            runtimeVersionProtobufRuntimeVersionExceptionOnWarmupCompleted = null;
            getparentfragmentmanagerOnExtraCallback = supportstartpostponedentertransition.onExtraCallback((internalPathIteratorPeek) onstatenotsaved.ICustomTabsCallback(), ntransactionreparentOnMinimized);
            javaType = javaType2;
        }
        FragmentActivityExternalSyntheticLambda1<Object> fragmentActivityExternalSyntheticLambda1OnExtraCallback = supportstartpostponedentertransition.onExtraCallback(javaType);
        remoteViewsTranslatorApi28Impl.onWarmupCompleted(RenderQueueExternalSyntheticLambda0.onNavigationEvent(javaType, ntransactionreparentOnMinimized.onExtraCallbackWithResult(), getparentfragmentmanagerOnExtraCallback, fragmentActivityExternalSyntheticLambda1OnExtraCallback, runtimeVersionProtobufRuntimeVersionExceptionOnWarmupCompleted, getparentfragmentIAuthTabCallback));
    }

    public FragmentActivityExternalSyntheticLambda1<Object> IAuthTabCallbackStub(supportStartPostponedEnterTransition supportstartpostponedentertransition, JavaType javaType, onStateNotSaved onstatenotsaved) throws InvalidDefinitionException, JsonMappingException {
        startIntentSenderFromFragment startintentsenderfromfragmentOnNavigationEvent = supportstartpostponedentertransition.onNavigationEvent();
        RemoteViewsTranslatorApi28Impl remoteViewsTranslatorApi28ImplOnWarmupCompleted = onWarmupCompleted(supportstartpostponedentertransition, onstatenotsaved);
        remoteViewsTranslatorApi28ImplOnWarmupCompleted.onExtraCallback(onNavigationEvent(supportstartpostponedentertransition, onstatenotsaved));
        onWarmupCompleted(supportstartpostponedentertransition, onstatenotsaved, remoteViewsTranslatorApi28ImplOnWarmupCompleted);
        Iterator itAsBinder = remoteViewsTranslatorApi28ImplOnWarmupCompleted.asBinder();
        while (true) {
            if (!itAsBinder.hasNext()) {
                break;
            }
            if ("setCause".equals(((RuntimeVersionProtobufRuntimeVersionException) itAsBinder.next()).onExtraCallback().onExtraCallback())) {
                itAsBinder.remove();
                break;
            }
        }
        nGetPreviousReleaseFenceFd ngetpreviousreleasefencefdOnNavigationEvent = onstatenotsaved.onNavigationEvent("initCause", onExtraCallbackWithResult);
        if (ngetpreviousreleasefencefdOnNavigationEvent != null) {
            String strOnWarmupCompleted = "cause";
            RemoteViewsTranslatorApi31Impl remoteViewsTranslatorApi31ImplOnWarmupCompleted = remoteViewsTranslatorApi28ImplOnWarmupCompleted.onWarmupCompleted(FragmentKtExternalSyntheticLambda0.onExtraCallbackWithResult("cause"));
            if (remoteViewsTranslatorApi31ImplOnWarmupCompleted instanceof RemoteViewsTranslatorApi31Impl) {
                remoteViewsTranslatorApi31ImplOnWarmupCompleted.onExtraCallbackWithResult((RuntimeVersionProtobufRuntimeVersionException) null);
            } else {
                loadFragmentClass typedObject = startintentsenderfromfragmentOnNavigationEvent.readTypedObject();
                if (typedObject != null) {
                    strOnWarmupCompleted = typedObject.onWarmupCompleted(startintentsenderfromfragmentOnNavigationEvent, ngetpreviousreleasefencefdOnNavigationEvent, "cause");
                }
                RuntimeVersionProtobufRuntimeVersionException runtimeVersionProtobufRuntimeVersionExceptionOnExtraCallbackWithResult = onExtraCallbackWithResult(supportstartpostponedentertransition, onstatenotsaved, (nSetBufferTransparency) onCancelLoad.onExtraCallback(supportstartpostponedentertransition.onNavigationEvent(), ngetpreviousreleasefencefdOnNavigationEvent, new FragmentKtExternalSyntheticLambda0(strOnWarmupCompleted)), ngetpreviousreleasefencefdOnNavigationEvent.onNavigationEvent(0));
                if (runtimeVersionProtobufRuntimeVersionExceptionOnExtraCallbackWithResult != null) {
                    remoteViewsTranslatorApi28ImplOnWarmupCompleted.onExtraCallbackWithResult(runtimeVersionProtobufRuntimeVersionExceptionOnExtraCallbackWithResult, true);
                }
            }
        }
        if (this._factoryConfig.onExtraCallbackWithResult()) {
            Iterator<RemoteViewsInfo> it = this._factoryConfig.onWarmupCompleted().iterator();
            while (it.hasNext()) {
                remoteViewsTranslatorApi28ImplOnWarmupCompleted = it.next().IAuthTabCallback(startintentsenderfromfragmentOnNavigationEvent, onstatenotsaved, remoteViewsTranslatorApi28ImplOnWarmupCompleted);
            }
        }
        GLThreadExternalSyntheticLambda3 gLThreadExternalSyntheticLambda3OnExtraCallbackWithResult = remoteViewsTranslatorApi28ImplOnWarmupCompleted.onExtraCallbackWithResult();
        if (gLThreadExternalSyntheticLambda3OnExtraCallbackWithResult instanceof RemoteCollectionItemsCompanion) {
            gLThreadExternalSyntheticLambda3OnExtraCallbackWithResult = GLThreadExternalSyntheticLambda3.onNavigationEvent(supportstartpostponedentertransition, (RemoteCollectionItemsCompanion) gLThreadExternalSyntheticLambda3OnExtraCallbackWithResult);
        }
        if (this._factoryConfig.onExtraCallbackWithResult()) {
            Iterator<RemoteViewsInfo> it2 = this._factoryConfig.onWarmupCompleted().iterator();
            while (it2.hasNext()) {
                gLThreadExternalSyntheticLambda3OnExtraCallbackWithResult = it2.next().onNavigationEvent(startintentsenderfromfragmentOnNavigationEvent, onstatenotsaved, (FragmentActivityExternalSyntheticLambda1<?>) gLThreadExternalSyntheticLambda3OnExtraCallbackWithResult);
            }
        }
        return gLThreadExternalSyntheticLambda3OnExtraCallbackWithResult;
    }

    protected RemoteViewsTranslatorApi28Impl onWarmupCompleted(supportStartPostponedEnterTransition supportstartpostponedentertransition, onStateNotSaved onstatenotsaved) {
        return new RemoteViewsTranslatorApi28Impl(onstatenotsaved, supportstartpostponedentertransition);
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onWarmupCompleted(supportStartPostponedEnterTransition supportstartpostponedentertransition, onStateNotSaved onstatenotsaved, RemoteViewsTranslatorApi28Impl remoteViewsTranslatorApi28Impl) throws InvalidDefinitionException, JsonMappingException {
        Set<String> setOnNavigationEvent;
        Set<String> set;
        RuntimeVersionProtobufRuntimeVersionException runtimeVersionProtobufRuntimeVersionExceptionOnWarmupCompleted;
        RemoteViewsTranslatorApi31Impl remoteViewsTranslatorApi31Impl;
        internalGetVerifier internalgetverifierAsInterface = remoteViewsTranslatorApi28Impl.asInterface();
        RuntimeVersionProtobufRuntimeVersionException[] runtimeVersionProtobufRuntimeVersionExceptionArrOnExtraCallback = internalgetverifierAsInterface != null ? internalgetverifierAsInterface.onExtraCallback(supportstartpostponedentertransition.onNavigationEvent()) : null;
        boolean z = runtimeVersionProtobufRuntimeVersionExceptionArrOnExtraCallback != null;
        restoreViewState.onExtraCallbackWithResult onExtraCallbackWithResult2 = supportstartpostponedentertransition.onNavigationEvent().onExtraCallbackWithResult(onstatenotsaved.getInterfaceDescriptor(), onstatenotsaved.ICustomTabsCallback());
        if (onExtraCallbackWithResult2 != null) {
            remoteViewsTranslatorApi28Impl.onExtraCallbackWithResult(onExtraCallbackWithResult2.onExtraCallback());
            setOnNavigationEvent = onExtraCallbackWithResult2.onNavigationEvent();
            Iterator<String> it = setOnNavigationEvent.iterator();
            while (it.hasNext()) {
                remoteViewsTranslatorApi28Impl.onWarmupCompleted(it.next());
            }
        } else {
            setOnNavigationEvent = Collections.EMPTY_SET;
        }
        Set<String> set2 = setOnNavigationEvent;
        callStartTransitionListener.onNavigationEvent onNavigationEvent = supportstartpostponedentertransition.onNavigationEvent().onNavigationEvent(onstatenotsaved.getInterfaceDescriptor(), onstatenotsaved.ICustomTabsCallback());
        if (onNavigationEvent != null) {
            Set<String> setOnExtraCallback = onNavigationEvent.onExtraCallback();
            if (setOnExtraCallback != null) {
                Iterator<String> it2 = setOnExtraCallback.iterator();
                while (it2.hasNext()) {
                    remoteViewsTranslatorApi28Impl.IAuthTabCallback(it2.next());
                }
            }
            set = setOnExtraCallback;
        } else {
            set = null;
        }
        RadioButtonTranslatorKt radioButtonTranslatorKtOnWarmupCompleted = onWarmupCompleted(supportstartpostponedentertransition, onstatenotsaved, runtimeVersionProtobufRuntimeVersionExceptionArrOnExtraCallback);
        if (radioButtonTranslatorKtOnWarmupCompleted != null) {
            remoteViewsTranslatorApi28Impl.onWarmupCompleted(radioButtonTranslatorKtOnWarmupCompleted);
        } else {
            Set<String> setOnActivityLayout = onstatenotsaved.onActivityLayout();
            if (setOnActivityLayout != null) {
                Iterator<String> it3 = setOnActivityLayout.iterator();
                while (it3.hasNext()) {
                    remoteViewsTranslatorApi28Impl.onWarmupCompleted(it3.next());
                }
            }
        }
        boolean z2 = supportstartpostponedentertransition.onWarmupCompleted(setLayoutTransition.USE_GETTERS_AS_SETTERS) && supportstartpostponedentertransition.onWarmupCompleted(setLayoutTransition.AUTO_DETECT_GETTERS);
        List<nSetBufferTransparency> listOnExtraCallback = onExtraCallback(supportstartpostponedentertransition, onstatenotsaved, remoteViewsTranslatorApi28Impl, onstatenotsaved.access000(), set2, set);
        if (this._factoryConfig.onExtraCallbackWithResult()) {
            Iterator<RemoteViewsInfo> it4 = this._factoryConfig.onWarmupCompleted().iterator();
            while (it4.hasNext()) {
                listOnExtraCallback = it4.next().onNavigationEvent(supportstartpostponedentertransition.onNavigationEvent(), onstatenotsaved, listOnExtraCallback);
            }
        }
        for (nSetBufferTransparency nsetbuffertransparency : listOnExtraCallback) {
            if (nsetbuffertransparency.onMessageChannelReady()) {
                runtimeVersionProtobufRuntimeVersionExceptionOnWarmupCompleted = onExtraCallbackWithResult(supportstartpostponedentertransition, onstatenotsaved, nsetbuffertransparency, nsetbuffertransparency.extraCallbackWithResult().onNavigationEvent(0));
            } else if (nsetbuffertransparency.onActivityLayout()) {
                runtimeVersionProtobufRuntimeVersionExceptionOnWarmupCompleted = onExtraCallbackWithResult(supportstartpostponedentertransition, onstatenotsaved, nsetbuffertransparency, nsetbuffertransparency.IAuthTabCallbackStubProxy().IAuthTabCallback());
            } else {
                nGetPreviousReleaseFenceFd ngetpreviousreleasefencefdAccess100 = nsetbuffertransparency.access100();
                if (ngetpreviousreleasefencefdAccess100 == null) {
                    runtimeVersionProtobufRuntimeVersionExceptionOnWarmupCompleted = null;
                } else if (z2 && IAuthTabCallback(ngetpreviousreleasefencefdAccess100.onNavigationEvent())) {
                    if (!remoteViewsTranslatorApi28Impl.onExtraCallbackWithResult(nsetbuffertransparency.onExtraCallbackWithResult())) {
                        runtimeVersionProtobufRuntimeVersionExceptionOnWarmupCompleted = onWarmupCompleted(supportstartpostponedentertransition, onstatenotsaved, nsetbuffertransparency);
                    }
                } else if (!nsetbuffertransparency.onActivityResized() && nsetbuffertransparency.IAuthTabCallback_Parcel().onExtraCallbackWithResult() != null) {
                    runtimeVersionProtobufRuntimeVersionExceptionOnWarmupCompleted = onWarmupCompleted(supportstartpostponedentertransition, onstatenotsaved, nsetbuffertransparency);
                }
            }
            if (z && nsetbuffertransparency.onActivityResized()) {
                String strOnExtraCallbackWithResult = nsetbuffertransparency.onExtraCallbackWithResult();
                int length = runtimeVersionProtobufRuntimeVersionExceptionArrOnExtraCallback.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        remoteViewsTranslatorApi31Impl = null;
                        break;
                    }
                    RuntimeVersionProtobufRuntimeVersionException runtimeVersionProtobufRuntimeVersionException = runtimeVersionProtobufRuntimeVersionExceptionArrOnExtraCallback[i2];
                    if (strOnExtraCallbackWithResult.equals(runtimeVersionProtobufRuntimeVersionException.onExtraCallbackWithResult()) && (runtimeVersionProtobufRuntimeVersionException instanceof RemoteViewsTranslatorApi31Impl)) {
                        remoteViewsTranslatorApi31Impl = (RemoteViewsTranslatorApi31Impl) runtimeVersionProtobufRuntimeVersionException;
                        break;
                    }
                    i2++;
                }
                if (remoteViewsTranslatorApi31Impl == null) {
                    ArrayList arrayList = new ArrayList();
                    for (RuntimeVersionProtobufRuntimeVersionException runtimeVersionProtobufRuntimeVersionException2 : runtimeVersionProtobufRuntimeVersionExceptionArrOnExtraCallback) {
                        arrayList.add(runtimeVersionProtobufRuntimeVersionException2.onExtraCallbackWithResult());
                    }
                    supportstartpostponedentertransition.onNavigationEvent(onstatenotsaved, nsetbuffertransparency, "Could not find creator property with name %s (known Creator properties: %s)", SavedStateHandleImplExternalSyntheticLambda0.onExtraCallbackWithResult(strOnExtraCallbackWithResult), arrayList);
                } else {
                    if (runtimeVersionProtobufRuntimeVersionExceptionOnWarmupCompleted != null) {
                        remoteViewsTranslatorApi31Impl.onExtraCallbackWithResult(runtimeVersionProtobufRuntimeVersionExceptionOnWarmupCompleted);
                    }
                    Class<?>[] clsArrOnTransact = nsetbuffertransparency.onTransact();
                    if (clsArrOnTransact == null) {
                        clsArrOnTransact = onstatenotsaved.onWarmupCompleted();
                    }
                    remoteViewsTranslatorApi31Impl.onExtraCallbackWithResult(clsArrOnTransact);
                    remoteViewsTranslatorApi28Impl.onExtraCallbackWithResult(remoteViewsTranslatorApi31Impl);
                }
            } else if (runtimeVersionProtobufRuntimeVersionExceptionOnWarmupCompleted != null) {
                Class<?>[] clsArrOnTransact2 = nsetbuffertransparency.onTransact();
                if (clsArrOnTransact2 == null) {
                    clsArrOnTransact2 = onstatenotsaved.onWarmupCompleted();
                }
                runtimeVersionProtobufRuntimeVersionExceptionOnWarmupCompleted.onExtraCallbackWithResult(clsArrOnTransact2);
                remoteViewsTranslatorApi28Impl.onWarmupCompleted(runtimeVersionProtobufRuntimeVersionExceptionOnWarmupCompleted);
            }
        }
    }

    private RadioButtonTranslatorKt onWarmupCompleted(supportStartPostponedEnterTransition supportstartpostponedentertransition, onStateNotSaved onstatenotsaved, RuntimeVersionProtobufRuntimeVersionException[] runtimeVersionProtobufRuntimeVersionExceptionArr) throws JsonMappingException {
        if (runtimeVersionProtobufRuntimeVersionExceptionArr != null) {
            for (RuntimeVersionProtobufRuntimeVersionException runtimeVersionProtobufRuntimeVersionException : runtimeVersionProtobufRuntimeVersionExceptionArr) {
                nCreate ncreateOnExtraCallback = runtimeVersionProtobufRuntimeVersionException.onExtraCallback();
                if (ncreateOnExtraCallback != null && Boolean.TRUE.equals(supportstartpostponedentertransition.asBinder().ICustomTabsCallbackStubProxy(ncreateOnExtraCallback))) {
                    return onNavigationEvent(supportstartpostponedentertransition, onstatenotsaved, ncreateOnExtraCallback);
                }
            }
        }
        nCreate ncreateIAuthTabCallback = onstatenotsaved.IAuthTabCallback();
        if (ncreateIAuthTabCallback != null) {
            return onNavigationEvent(supportstartpostponedentertransition, onstatenotsaved, ncreateIAuthTabCallback);
        }
        return null;
    }

    private boolean IAuthTabCallback(Class<?> cls) {
        return Collection.class.isAssignableFrom(cls) || Map.class.isAssignableFrom(cls);
    }

    protected List<nSetBufferTransparency> onExtraCallback(supportStartPostponedEnterTransition supportstartpostponedentertransition, onStateNotSaved onstatenotsaved, RemoteViewsTranslatorApi28Impl remoteViewsTranslatorApi28Impl, List<nSetBufferTransparency> list, Set<String> set, Set<String> set2) {
        Class<?> clsICustomTabsCallback;
        ArrayList arrayList = new ArrayList(Math.max(4, list.size()));
        HashMap map = new HashMap();
        for (nSetBufferTransparency nsetbuffertransparency : list) {
            String strOnExtraCallbackWithResult = nsetbuffertransparency.onExtraCallbackWithResult();
            if (!SavedStateHandleSaverKtExternalSyntheticLambda4.onNavigationEvent(strOnExtraCallbackWithResult, set, set2)) {
                if (!nsetbuffertransparency.onActivityResized() && (clsICustomTabsCallback = nsetbuffertransparency.ICustomTabsCallback()) != null && onExtraCallback(supportstartpostponedentertransition.onNavigationEvent(), nsetbuffertransparency, clsICustomTabsCallback, map)) {
                    remoteViewsTranslatorApi28Impl.onWarmupCompleted(strOnExtraCallbackWithResult);
                } else {
                    arrayList.add(nsetbuffertransparency);
                }
            }
        }
        return arrayList;
    }

    protected void IAuthTabCallback(supportStartPostponedEnterTransition supportstartpostponedentertransition, onStateNotSaved onstatenotsaved, RemoteViewsTranslatorApi28Impl remoteViewsTranslatorApi28Impl) throws JsonMappingException {
        List<nSetBufferTransparency> listOnExtraCallbackWithResult = onstatenotsaved.onExtraCallbackWithResult();
        if (listOnExtraCallbackWithResult != null) {
            for (nSetBufferTransparency nsetbuffertransparency : listOnExtraCallbackWithResult) {
                remoteViewsTranslatorApi28Impl.onNavigationEvent(nsetbuffertransparency.IAuthTabCallbackDefault(), onExtraCallbackWithResult(supportstartpostponedentertransition, onstatenotsaved, nsetbuffertransparency, nsetbuffertransparency.writeTypedObject()));
            }
        }
    }

    protected void onExtraCallbackWithResult(supportStartPostponedEnterTransition supportstartpostponedentertransition, onStateNotSaved onstatenotsaved, RemoteViewsTranslatorApi28Impl remoteViewsTranslatorApi28Impl) throws JsonMappingException {
        Map<Object, nCreate> mapIAuthTabCallbackDefault = onstatenotsaved.IAuthTabCallbackDefault();
        if (mapIAuthTabCallbackDefault != null) {
            for (Map.Entry<Object, nCreate> entry : mapIAuthTabCallbackDefault.entrySet()) {
                nCreate value = entry.getValue();
                remoteViewsTranslatorApi28Impl.onExtraCallback(FragmentKtExternalSyntheticLambda0.onExtraCallbackWithResult(value.onExtraCallback()), value.IAuthTabCallback(), onstatenotsaved.writeTypedObject(), value, entry.getKey());
            }
        }
    }

    protected RadioButtonTranslatorKt onNavigationEvent(supportStartPostponedEnterTransition supportstartpostponedentertransition, onStateNotSaved onstatenotsaved, nCreate ncreate) throws JsonMappingException {
        JavaType javaTypeAsInterface;
        JavaType javaTypeIAuthTabCallbackStub;
        validateRequestPermissionsRequestCode.onExtraCallback onextracallback;
        JavaType javaTypeOnWarmupCompleted;
        validateRequestPermissionsRequestCode.onExtraCallback onextracallback2;
        boolean z = ncreate instanceof RoundedPolygonKt;
        boolean z2 = ncreate instanceof nDupFenceFd;
        int iAsInterface = -1;
        if (ncreate instanceof nGetPreviousReleaseFenceFd) {
            nGetPreviousReleaseFenceFd ngetpreviousreleasefencefd = (nGetPreviousReleaseFenceFd) ncreate;
            javaTypeAsInterface = ngetpreviousreleasefencefd.onNavigationEvent(0);
            javaTypeOnWarmupCompleted = onWarmupCompleted(supportstartpostponedentertransition, ncreate, ngetpreviousreleasefencefd.onNavigationEvent(1));
            onextracallback2 = new validateRequestPermissionsRequestCode.onExtraCallback(FragmentKtExternalSyntheticLambda0.onExtraCallbackWithResult(ncreate.onExtraCallback()), javaTypeOnWarmupCompleted, (FragmentKtExternalSyntheticLambda0) null, ncreate, onFragmentResult.onExtraCallbackWithResult);
        } else {
            if (z) {
                JavaType javaTypeIAuthTabCallback = ((RoundedPolygonKt) ncreate).IAuthTabCallback();
                if (javaTypeIAuthTabCallback.onUnminimized()) {
                    JavaType javaTypeOnWarmupCompleted2 = onWarmupCompleted(supportstartpostponedentertransition, ncreate, javaTypeIAuthTabCallback);
                    javaTypeAsInterface = javaTypeOnWarmupCompleted2.asInterface();
                    javaTypeIAuthTabCallbackStub = javaTypeOnWarmupCompleted2.IAuthTabCallbackStub();
                    onextracallback = new validateRequestPermissionsRequestCode.onExtraCallback(FragmentKtExternalSyntheticLambda0.onExtraCallbackWithResult(ncreate.onExtraCallback()), javaTypeOnWarmupCompleted2, (FragmentKtExternalSyntheticLambda0) null, ncreate, onFragmentResult.onExtraCallbackWithResult);
                } else {
                    if (javaTypeIAuthTabCallback.onNavigationEvent(FragmentActivityExternalSyntheticLambda3.class) || javaTypeIAuthTabCallback.onNavigationEvent(FlowLiveDataConversionsasFlow1ExternalSyntheticLambda0.class)) {
                        JavaType javaTypeOnWarmupCompleted3 = onWarmupCompleted(supportstartpostponedentertransition, ncreate, javaTypeIAuthTabCallback);
                        JavaType javaTypeOnWarmupCompleted4 = supportstartpostponedentertransition.onWarmupCompleted(FragmentActivityExternalSyntheticLambda3.class);
                        return RadioButtonTranslatorKt.onExtraCallback(supportstartpostponedentertransition, new validateRequestPermissionsRequestCode.onExtraCallback(FragmentKtExternalSyntheticLambda0.onExtraCallbackWithResult(ncreate.onExtraCallback()), javaTypeOnWarmupCompleted3, (FragmentKtExternalSyntheticLambda0) null, ncreate, onFragmentResult.onExtraCallbackWithResult), ncreate, javaTypeOnWarmupCompleted4, supportstartpostponedentertransition.onExtraCallback(javaTypeOnWarmupCompleted4));
                    }
                    return (RadioButtonTranslatorKt) supportstartpostponedentertransition.onWarmupCompleted(onstatenotsaved.onMessageChannelReady(), String.format("Unsupported type for any-setter: %s -- only support `Map`s, `JsonNode` and `ObjectNode` ", SavedStateHandleImplExternalSyntheticLambda0.IAuthTabCallback(javaTypeIAuthTabCallback)));
                }
            } else if (z2) {
                nDupFenceFd ndupfencefd = (nDupFenceFd) ncreate;
                JavaType javaTypeIAuthTabCallback2 = ndupfencefd.IAuthTabCallback();
                iAsInterface = ndupfencefd.asInterface();
                if (javaTypeIAuthTabCallback2.onUnminimized()) {
                    JavaType javaTypeOnWarmupCompleted5 = onWarmupCompleted(supportstartpostponedentertransition, ncreate, javaTypeIAuthTabCallback2);
                    javaTypeAsInterface = javaTypeOnWarmupCompleted5.asInterface();
                    javaTypeIAuthTabCallbackStub = javaTypeOnWarmupCompleted5.IAuthTabCallbackStub();
                    onextracallback = new validateRequestPermissionsRequestCode.onExtraCallback(FragmentKtExternalSyntheticLambda0.onExtraCallbackWithResult(ncreate.onExtraCallback()), javaTypeOnWarmupCompleted5, (FragmentKtExternalSyntheticLambda0) null, ncreate, onFragmentResult.onExtraCallbackWithResult);
                } else {
                    if (javaTypeIAuthTabCallback2.onNavigationEvent(FragmentActivityExternalSyntheticLambda3.class) || javaTypeIAuthTabCallback2.onNavigationEvent(FlowLiveDataConversionsasFlow1ExternalSyntheticLambda0.class)) {
                        JavaType javaTypeOnWarmupCompleted6 = onWarmupCompleted(supportstartpostponedentertransition, ncreate, javaTypeIAuthTabCallback2);
                        JavaType javaTypeOnWarmupCompleted7 = supportstartpostponedentertransition.onWarmupCompleted(FragmentActivityExternalSyntheticLambda3.class);
                        return RadioButtonTranslatorKt.onWarmupCompleted(supportstartpostponedentertransition, new validateRequestPermissionsRequestCode.onExtraCallback(FragmentKtExternalSyntheticLambda0.onExtraCallbackWithResult(ncreate.onExtraCallback()), javaTypeOnWarmupCompleted6, (FragmentKtExternalSyntheticLambda0) null, ncreate, onFragmentResult.onExtraCallbackWithResult), ncreate, javaTypeOnWarmupCompleted7, supportstartpostponedentertransition.onExtraCallback(javaTypeOnWarmupCompleted7), iAsInterface);
                    }
                    return (RadioButtonTranslatorKt) supportstartpostponedentertransition.onWarmupCompleted(onstatenotsaved.onMessageChannelReady(), String.format("Unsupported type for any-setter: %s -- only support `Map`s, `JsonNode` and `ObjectNode` ", SavedStateHandleImplExternalSyntheticLambda0.IAuthTabCallback(javaTypeIAuthTabCallback2)));
                }
            } else {
                return (RadioButtonTranslatorKt) supportstartpostponedentertransition.onWarmupCompleted(onstatenotsaved.onMessageChannelReady(), String.format("Unrecognized mutator type for any-setter: %s", SavedStateHandleImplExternalSyntheticLambda0.onActivityResized(ncreate.getClass())));
            }
            javaTypeOnWarmupCompleted = javaTypeIAuthTabCallbackStub;
            onextracallback2 = onextracallback;
        }
        setDrawDisappearingViewsLast setdrawdisappearingviewslastOnExtraCallbackWithResult = onExtraCallbackWithResult(supportstartpostponedentertransition, ncreate);
        if (setdrawdisappearingviewslastOnExtraCallbackWithResult == null) {
            setdrawdisappearingviewslastOnExtraCallbackWithResult = (setDrawDisappearingViewsLast) javaTypeAsInterface.getInterfaceDescriptor();
        }
        if (setdrawdisappearingviewslastOnExtraCallbackWithResult == null) {
            setdrawdisappearingviewslastOnExtraCallbackWithResult = supportstartpostponedentertransition.onExtraCallbackWithResult(javaTypeAsInterface, (validateRequestPermissionsRequestCode) onextracallback2);
        } else if (setdrawdisappearingviewslastOnExtraCallbackWithResult instanceof ActionTrampolineActivity) {
            setdrawdisappearingviewslastOnExtraCallbackWithResult = ((ActionTrampolineActivity) setdrawdisappearingviewslastOnExtraCallbackWithResult).onWarmupCompleted(supportstartpostponedentertransition, onextracallback2);
        }
        setDrawDisappearingViewsLast setdrawdisappearingviewslast = setdrawdisappearingviewslastOnExtraCallbackWithResult;
        FragmentActivityExternalSyntheticLambda1<?> fragmentActivityExternalSyntheticLambda1OnExtraCallback = onExtraCallback(supportstartpostponedentertransition, ncreate);
        if (fragmentActivityExternalSyntheticLambda1OnExtraCallback == null) {
            fragmentActivityExternalSyntheticLambda1OnExtraCallback = (FragmentActivityExternalSyntheticLambda1) javaTypeOnWarmupCompleted.getInterfaceDescriptor();
        }
        if (fragmentActivityExternalSyntheticLambda1OnExtraCallback != null) {
            fragmentActivityExternalSyntheticLambda1OnExtraCallback = supportstartpostponedentertransition.onNavigationEvent(fragmentActivityExternalSyntheticLambda1OnExtraCallback, (validateRequestPermissionsRequestCode) onextracallback2, javaTypeOnWarmupCompleted);
        }
        FragmentActivityExternalSyntheticLambda1<?> fragmentActivityExternalSyntheticLambda1 = fragmentActivityExternalSyntheticLambda1OnExtraCallback;
        setColumnCount setcolumncount = (setColumnCount) javaTypeOnWarmupCompleted.access000();
        if (z) {
            return RadioButtonTranslatorKt.IAuthTabCallback(supportstartpostponedentertransition, onextracallback2, ncreate, javaTypeOnWarmupCompleted, setdrawdisappearingviewslast, fragmentActivityExternalSyntheticLambda1, setcolumncount);
        }
        if (z2) {
            return RadioButtonTranslatorKt.onExtraCallback(supportstartpostponedentertransition, onextracallback2, ncreate, javaTypeOnWarmupCompleted, setdrawdisappearingviewslast, fragmentActivityExternalSyntheticLambda1, setcolumncount, iAsInterface);
        }
        return RadioButtonTranslatorKt.onNavigationEvent(supportstartpostponedentertransition, onextracallback2, ncreate, javaTypeOnWarmupCompleted, setdrawdisappearingviewslast, fragmentActivityExternalSyntheticLambda1, setcolumncount);
    }

    protected RuntimeVersionProtobufRuntimeVersionException onExtraCallbackWithResult(supportStartPostponedEnterTransition supportstartpostponedentertransition, onStateNotSaved onstatenotsaved, nSetBufferTransparency nsetbuffertransparency, JavaType javaType) throws InvalidDefinitionException, JsonMappingException {
        RenderQueue sessionWorker;
        nGetPreviousReleaseFenceFd typedObject = nsetbuffertransparency.readTypedObject();
        if (typedObject == null) {
            supportstartpostponedentertransition.onNavigationEvent(onstatenotsaved, nsetbuffertransparency, "No non-constructor mutator available", new Object[0]);
        }
        JavaType javaTypeOnWarmupCompleted = onWarmupCompleted(supportstartpostponedentertransition, (nCreate) typedObject, javaType);
        setColumnCount setcolumncount = (setColumnCount) javaTypeOnWarmupCompleted.access000();
        if (typedObject instanceof nGetPreviousReleaseFenceFd) {
            sessionWorker = new RenderQueue(nsetbuffertransparency, javaTypeOnWarmupCompleted, setcolumncount, onstatenotsaved.writeTypedObject(), typedObject);
        } else {
            sessionWorker = new SessionWorker(nsetbuffertransparency, javaTypeOnWarmupCompleted, setcolumncount, onstatenotsaved.writeTypedObject(), (RoundedPolygonKt) typedObject);
        }
        FragmentActivityExternalSyntheticLambda1<?> fragmentActivityExternalSyntheticLambda1OnWarmupCompleted = onWarmupCompleted(supportstartpostponedentertransition, (internalPathIteratorPeek) typedObject);
        if (fragmentActivityExternalSyntheticLambda1OnWarmupCompleted == null) {
            fragmentActivityExternalSyntheticLambda1OnWarmupCompleted = (FragmentActivityExternalSyntheticLambda1) javaTypeOnWarmupCompleted.getInterfaceDescriptor();
        }
        if (fragmentActivityExternalSyntheticLambda1OnWarmupCompleted != null) {
            sessionWorker = sessionWorker.IAuthTabCallback(supportstartpostponedentertransition.onNavigationEvent(fragmentActivityExternalSyntheticLambda1OnWarmupCompleted, (validateRequestPermissionsRequestCode) sessionWorker, javaTypeOnWarmupCompleted));
        }
        startActivityFromFragment.onExtraCallbackWithResult onextracallbackwithresultIAuthTabCallbackStub = nsetbuffertransparency.IAuthTabCallbackStub();
        if (onextracallbackwithresultIAuthTabCallbackStub != null && onextracallbackwithresultIAuthTabCallbackStub.IAuthTabCallback()) {
            sessionWorker.onNavigationEvent(onextracallbackwithresultIAuthTabCallbackStub.onWarmupCompleted());
        }
        nTransactionReparent ntransactionreparentOnExtraCallback = nsetbuffertransparency.onExtraCallback();
        if (ntransactionreparentOnExtraCallback != null) {
            sessionWorker.IAuthTabCallback(ntransactionreparentOnExtraCallback);
        }
        return sessionWorker;
    }

    protected RuntimeVersionProtobufRuntimeVersionException onWarmupCompleted(supportStartPostponedEnterTransition supportstartpostponedentertransition, onStateNotSaved onstatenotsaved, nSetBufferTransparency nsetbuffertransparency) throws JsonMappingException {
        nGetPreviousReleaseFenceFd ngetpreviousreleasefencefdAccess100 = nsetbuffertransparency.access100();
        JavaType javaTypeOnWarmupCompleted = onWarmupCompleted(supportstartpostponedentertransition, (nCreate) ngetpreviousreleasefencefdAccess100, ngetpreviousreleasefencefdAccess100.IAuthTabCallback());
        CanvasFrontBufferedRendererExternalSyntheticLambda4 canvasFrontBufferedRendererExternalSyntheticLambda4 = new CanvasFrontBufferedRendererExternalSyntheticLambda4(nsetbuffertransparency, javaTypeOnWarmupCompleted, (setColumnCount) javaTypeOnWarmupCompleted.access000(), onstatenotsaved.writeTypedObject(), ngetpreviousreleasefencefdAccess100);
        FragmentActivityExternalSyntheticLambda1<?> fragmentActivityExternalSyntheticLambda1OnWarmupCompleted = onWarmupCompleted(supportstartpostponedentertransition, (internalPathIteratorPeek) ngetpreviousreleasefencefdAccess100);
        if (fragmentActivityExternalSyntheticLambda1OnWarmupCompleted == null) {
            fragmentActivityExternalSyntheticLambda1OnWarmupCompleted = (FragmentActivityExternalSyntheticLambda1) javaTypeOnWarmupCompleted.getInterfaceDescriptor();
        }
        return fragmentActivityExternalSyntheticLambda1OnWarmupCompleted != null ? canvasFrontBufferedRendererExternalSyntheticLambda4.IAuthTabCallback(supportstartpostponedentertransition.onNavigationEvent(fragmentActivityExternalSyntheticLambda1OnWarmupCompleted, (validateRequestPermissionsRequestCode) canvasFrontBufferedRendererExternalSyntheticLambda4, javaTypeOnWarmupCompleted)) : canvasFrontBufferedRendererExternalSyntheticLambda4;
    }

    protected boolean onExtraCallbackWithResult(Class<?> cls) {
        String strOnWarmupCompleted = SavedStateHandleImplExternalSyntheticLambda0.onWarmupCompleted(cls);
        if (strOnWarmupCompleted != null) {
            throw new IllegalArgumentException("Cannot deserialize Class " + cls.getName() + " (of type " + strOnWarmupCompleted + ") as a Bean");
        }
        if (SavedStateHandleImplExternalSyntheticLambda0.writeTypedObject(cls)) {
            throw new IllegalArgumentException("Cannot deserialize Proxy class " + cls.getName() + " as a Bean");
        }
        String str = (String) SavedStateHandleImplExternalSyntheticLambda0.onWarmupCompleted(461968241, new Object[]{cls, true}, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -461968232, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult());
        if (str == null) {
            return true;
        }
        throw new IllegalArgumentException("Cannot deserialize Class " + cls.getName() + " (of type " + str + ") as a Bean");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected boolean onExtraCallback(startIntentSenderFromFragment startintentsenderfromfragment, nSetBufferTransparency nsetbuffertransparency, Class<?> cls, Map<Class<?>, Boolean> map) {
        Boolean boolAsInterface;
        Boolean bool = map.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        if (cls == String.class || cls.isPrimitive()) {
            boolAsInterface = Boolean.FALSE;
        } else {
            boolAsInterface = startintentsenderfromfragment.onExtraCallbackWithResult(cls).asInterface();
            if (boolAsInterface == null) {
                boolAsInterface = startintentsenderfromfragment.asBinder().onTransact(startintentsenderfromfragment.asBinder(cls).ICustomTabsCallback());
                if (boolAsInterface == null) {
                }
            }
        }
        map.put(cls, boolAsInterface);
        return boolAsInterface.booleanValue();
    }

    protected void onNavigationEvent(supportStartPostponedEnterTransition supportstartpostponedentertransition, JavaType javaType, onStateNotSaved onstatenotsaved) throws JsonMappingException {
        WorkerFactoryModule.IAuthTabCallback().onWarmupCompleted(supportstartpostponedentertransition, javaType, onstatenotsaved);
    }
}
