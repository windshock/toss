package o;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.ResolvableDeserializer;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import im.toss.features.benefit.ui.BenefitItemAdapter$;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import o.FragmentActivityExternalSyntheticLambda1;
import o.getParentFragmentManager;
import o.setDrawDisappearingViewsLast;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class RemoteViewsTranslatorKt extends supportStartPostponedEnterTransition implements Serializable {
    private static final long serialVersionUID = 1;
    private List<getParentFragment> _objectIdResolvers;
    protected transient LinkedHashMap<getParentFragmentManager.onExtraCallbackWithResult, ReadableObjectId> asBinder;

    public abstract RemoteViewsTranslatorKt IAuthTabCallback(startIntentSenderFromFragment startintentsenderfromfragment, getViewLifecycleOwner getviewlifecycleowner, FragmentContainerView fragmentContainerView);

    public abstract RemoteViewsTranslatorKt onExtraCallbackWithResult(startIntentSenderFromFragment startintentsenderfromfragment);

    protected RemoteViewsTranslatorKt(RunCallbackActionKt runCallbackActionKt, InvisibleActionTrampolineActivity invisibleActionTrampolineActivity) {
        super(runCallbackActionKt, invisibleActionTrampolineActivity);
    }

    protected RemoteViewsTranslatorKt(RemoteViewsTranslatorKt remoteViewsTranslatorKt, startIntentSenderFromFragment startintentsenderfromfragment, getViewLifecycleOwner getviewlifecycleowner, FragmentContainerView fragmentContainerView) {
        super(remoteViewsTranslatorKt, startintentsenderfromfragment, getviewlifecycleowner, fragmentContainerView);
    }

    protected RemoteViewsTranslatorKt(RemoteViewsTranslatorKt remoteViewsTranslatorKt, startIntentSenderFromFragment startintentsenderfromfragment) {
        super(remoteViewsTranslatorKt, startintentsenderfromfragment);
    }

    @Override // o.supportStartPostponedEnterTransition
    public ReadableObjectId onWarmupCompleted(Object obj, getParentFragmentManager<?> getparentfragmentmanager, getParentFragment getparentfragment) {
        getParentFragment getparentfragmentOnNavigationEvent = null;
        if (obj == null) {
            return null;
        }
        getParentFragmentManager.onExtraCallbackWithResult onextracallbackwithresultIAuthTabCallback = getparentfragmentmanager.IAuthTabCallback(obj);
        LinkedHashMap<getParentFragmentManager.onExtraCallbackWithResult, ReadableObjectId> linkedHashMap = this.asBinder;
        if (linkedHashMap == null) {
            this.asBinder = new LinkedHashMap<>();
        } else {
            ReadableObjectId readableObjectId = linkedHashMap.get(onextracallbackwithresultIAuthTabCallback);
            if (readableObjectId != null) {
                return readableObjectId;
            }
        }
        List<getParentFragment> list = this._objectIdResolvers;
        if (list == null) {
            this._objectIdResolvers = new ArrayList(8);
        } else {
            Iterator<getParentFragment> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                getParentFragment next = it.next();
                if (next.IAuthTabCallback(getparentfragment)) {
                    getparentfragmentOnNavigationEvent = next;
                    break;
                }
            }
        }
        if (getparentfragmentOnNavigationEvent == null) {
            getparentfragmentOnNavigationEvent = getparentfragment.onNavigationEvent(this);
            this._objectIdResolvers.add(getparentfragmentOnNavigationEvent);
        }
        ReadableObjectId readableObjectIdOnExtraCallback = onExtraCallback(onextracallbackwithresultIAuthTabCallback);
        readableObjectIdOnExtraCallback.onWarmupCompleted(getparentfragmentOnNavigationEvent);
        this.asBinder.put(onextracallbackwithresultIAuthTabCallback, readableObjectIdOnExtraCallback);
        return readableObjectIdOnExtraCallback;
    }

    protected ReadableObjectId onExtraCallback(getParentFragmentManager.onExtraCallbackWithResult onextracallbackwithresult) {
        return new ReadableObjectId(onextracallbackwithresult);
    }

    @Override // o.supportStartPostponedEnterTransition
    public FragmentActivityExternalSyntheticLambda1<Object> onWarmupCompleted(internalPathIteratorPeek internalpathiteratorpeek, Object obj) throws JsonMappingException {
        FragmentActivityExternalSyntheticLambda1<Object> fragmentActivityExternalSyntheticLambda1;
        if (obj == null) {
            return null;
        }
        if (obj instanceof FragmentActivityExternalSyntheticLambda1) {
            fragmentActivityExternalSyntheticLambda1 = (FragmentActivityExternalSyntheticLambda1) obj;
        } else {
            if (!(obj instanceof Class)) {
                throw new IllegalStateException("AnnotationIntrospector returned deserializer definition of type " + obj.getClass().getName() + "; expected type JsonDeserializer or Class<JsonDeserializer> instead");
            }
            Class<?> cls = (Class) obj;
            if (cls != FragmentActivityExternalSyntheticLambda1.onNavigationEvent.class) {
                if (!((Boolean) SavedStateHandleImplExternalSyntheticLambda0.onWarmupCompleted(-9721623, new Object[]{cls}, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), 9721630, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult())).booleanValue()) {
                    if (!FragmentActivityExternalSyntheticLambda1.class.isAssignableFrom(cls)) {
                        throw new IllegalStateException("AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<JsonDeserializer>");
                    }
                    RadioButtonKtRadioButtonElement24 radioButtonKtRadioButtonElement24Access000 = this._config.access000();
                    FragmentActivityExternalSyntheticLambda1<Object> fragmentActivityExternalSyntheticLambda1IAuthTabCallback = radioButtonKtRadioButtonElement24Access000 != null ? radioButtonKtRadioButtonElement24Access000.IAuthTabCallback(this._config, internalpathiteratorpeek, cls) : null;
                    fragmentActivityExternalSyntheticLambda1 = fragmentActivityExternalSyntheticLambda1IAuthTabCallback == null ? (FragmentActivityExternalSyntheticLambda1) SavedStateHandleImplExternalSyntheticLambda0.onExtraCallbackWithResult(cls, this._config.asInterface()) : fragmentActivityExternalSyntheticLambda1IAuthTabCallback;
                }
            }
            return null;
        }
        if (fragmentActivityExternalSyntheticLambda1 instanceof ResolvableDeserializer) {
            ((ResolvableDeserializer) fragmentActivityExternalSyntheticLambda1).onExtraCallback(this);
        }
        return fragmentActivityExternalSyntheticLambda1;
    }

    @Override // o.supportStartPostponedEnterTransition
    public final setDrawDisappearingViewsLast onExtraCallbackWithResult(internalPathIteratorPeek internalpathiteratorpeek, Object obj) throws JsonMappingException {
        setDrawDisappearingViewsLast setdrawdisappearingviewslast;
        if (obj == null) {
            return null;
        }
        if (obj instanceof setDrawDisappearingViewsLast) {
            setdrawdisappearingviewslast = (setDrawDisappearingViewsLast) obj;
        } else {
            if (!(obj instanceof Class)) {
                throw new IllegalStateException("AnnotationIntrospector returned key deserializer definition of type " + obj.getClass().getName() + "; expected type KeyDeserializer or Class<KeyDeserializer> instead");
            }
            Class<?> cls = (Class) obj;
            if (cls != setDrawDisappearingViewsLast.onNavigationEvent.class) {
                if (!((Boolean) SavedStateHandleImplExternalSyntheticLambda0.onWarmupCompleted(-9721623, new Object[]{cls}, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), 9721630, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult())).booleanValue()) {
                    if (!setDrawDisappearingViewsLast.class.isAssignableFrom(cls)) {
                        throw new IllegalStateException("AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<KeyDeserializer>");
                    }
                    RadioButtonKtRadioButtonElement24 radioButtonKtRadioButtonElement24Access000 = this._config.access000();
                    setDrawDisappearingViewsLast setdrawdisappearingviewslastOnExtraCallbackWithResult = radioButtonKtRadioButtonElement24Access000 != null ? radioButtonKtRadioButtonElement24Access000.onExtraCallbackWithResult(this._config, internalpathiteratorpeek, cls) : null;
                    setdrawdisappearingviewslast = setdrawdisappearingviewslastOnExtraCallbackWithResult == null ? (setDrawDisappearingViewsLast) SavedStateHandleImplExternalSyntheticLambda0.onExtraCallbackWithResult(cls, this._config.asInterface()) : setdrawdisappearingviewslastOnExtraCallbackWithResult;
                }
            }
            return null;
        }
        if (setdrawdisappearingviewslast instanceof ResolvableDeserializer) {
            ((ResolvableDeserializer) setdrawdisappearingviewslast).onExtraCallback(this);
        }
        return setdrawdisappearingviewslast;
    }

    public Object onExtraCallback(getViewLifecycleOwner getviewlifecycleowner, JavaType javaType, FragmentActivityExternalSyntheticLambda1<Object> fragmentActivityExternalSyntheticLambda1, Object obj) throws IOException {
        if (this._config.onNavigationEvent()) {
            return onNavigationEvent(getviewlifecycleowner, javaType, fragmentActivityExternalSyntheticLambda1, obj);
        }
        if (obj == null) {
            return fragmentActivityExternalSyntheticLambda1.onExtraCallback(getviewlifecycleowner, this);
        }
        return fragmentActivityExternalSyntheticLambda1.onExtraCallbackWithResult(getviewlifecycleowner, this, obj);
    }

    protected Object onNavigationEvent(getViewLifecycleOwner getviewlifecycleowner, JavaType javaType, FragmentActivityExternalSyntheticLambda1<Object> fragmentActivityExternalSyntheticLambda1, Object obj) throws IOException, JsonMappingException {
        Object objOnExtraCallbackWithResult;
        String strOnExtraCallbackWithResult = this._config.IAuthTabCallbackStub(javaType).onExtraCallbackWithResult();
        getTargetRequestCode gettargetrequestcodeAsBinder = getviewlifecycleowner.asBinder();
        getTargetRequestCode gettargetrequestcode = getTargetRequestCode.START_OBJECT;
        if (gettargetrequestcodeAsBinder != gettargetrequestcode) {
            onExtraCallback(javaType, gettargetrequestcode, "Current token not START_OBJECT (needed to unwrap root name %s), but %s", SavedStateHandleImplExternalSyntheticLambda0.onExtraCallbackWithResult(strOnExtraCallbackWithResult), getviewlifecycleowner.asBinder());
        }
        getTargetRequestCode gettargetrequestcodeValidateRelationship = getviewlifecycleowner.validateRelationship();
        getTargetRequestCode gettargetrequestcode2 = getTargetRequestCode.FIELD_NAME;
        if (gettargetrequestcodeValidateRelationship != gettargetrequestcode2) {
            onExtraCallback(javaType, gettargetrequestcode2, "Current token not FIELD_NAME (to contain expected root name %s), but %s", SavedStateHandleImplExternalSyntheticLambda0.onExtraCallbackWithResult(strOnExtraCallbackWithResult), getviewlifecycleowner.asBinder());
        }
        String strAsInterface = getviewlifecycleowner.asInterface();
        if (!strOnExtraCallbackWithResult.equals(strAsInterface)) {
            onNavigationEvent(javaType, strAsInterface, "Root name (%s) does not match expected (%s) for type %s", SavedStateHandleImplExternalSyntheticLambda0.onExtraCallbackWithResult(strAsInterface), SavedStateHandleImplExternalSyntheticLambda0.onExtraCallbackWithResult(strOnExtraCallbackWithResult), SavedStateHandleImplExternalSyntheticLambda0.IAuthTabCallback(javaType));
        }
        getviewlifecycleowner.validateRelationship();
        if (obj == null) {
            objOnExtraCallbackWithResult = fragmentActivityExternalSyntheticLambda1.onExtraCallback(getviewlifecycleowner, this);
        } else {
            objOnExtraCallbackWithResult = fragmentActivityExternalSyntheticLambda1.onExtraCallbackWithResult(getviewlifecycleowner, this, obj);
        }
        getTargetRequestCode gettargetrequestcodeValidateRelationship2 = getviewlifecycleowner.validateRelationship();
        getTargetRequestCode gettargetrequestcode3 = getTargetRequestCode.END_OBJECT;
        if (gettargetrequestcodeValidateRelationship2 != gettargetrequestcode3) {
            onExtraCallback(javaType, gettargetrequestcode3, "Current token not END_OBJECT (to match wrapper object with root name %s), but %s", SavedStateHandleImplExternalSyntheticLambda0.onExtraCallbackWithResult(strOnExtraCallbackWithResult), getviewlifecycleowner.asBinder());
        }
        return objOnExtraCallbackWithResult;
    }

    public static final class onNavigationEvent extends RemoteViewsTranslatorKt {
        private static final long serialVersionUID = 1;

        public onNavigationEvent(RunCallbackActionKt runCallbackActionKt) {
            super(runCallbackActionKt, new InvisibleActionTrampolineActivity());
        }

        private onNavigationEvent(onNavigationEvent onnavigationevent, startIntentSenderFromFragment startintentsenderfromfragment, getViewLifecycleOwner getviewlifecycleowner, FragmentContainerView fragmentContainerView) {
            super(onnavigationevent, startintentsenderfromfragment, getviewlifecycleowner, fragmentContainerView);
        }

        private onNavigationEvent(onNavigationEvent onnavigationevent, startIntentSenderFromFragment startintentsenderfromfragment) {
            super(onnavigationevent, startintentsenderfromfragment);
        }

        @Override // o.RemoteViewsTranslatorKt
        public RemoteViewsTranslatorKt IAuthTabCallback(startIntentSenderFromFragment startintentsenderfromfragment, getViewLifecycleOwner getviewlifecycleowner, FragmentContainerView fragmentContainerView) {
            return new onNavigationEvent(this, startintentsenderfromfragment, getviewlifecycleowner, fragmentContainerView);
        }

        @Override // o.RemoteViewsTranslatorKt
        public RemoteViewsTranslatorKt onExtraCallbackWithResult(startIntentSenderFromFragment startintentsenderfromfragment) {
            return new onNavigationEvent(this, startintentsenderfromfragment);
        }
    }
}
