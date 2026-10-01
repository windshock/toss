package o;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import im.toss.features.benefit.ui.BenefitItemAdapter$;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import o.LifecycleService;
import o.RemoteViewsTranslatorKt;
import o.nSetDesiredPresentTime;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class setOnApplyWindowInsetsListener extends getViewLifecycleOwnerLiveData implements Serializable {
    protected static final startActivityFromFragment onExtraCallbackWithResult;
    protected static final isViewFromObject onWarmupCompleted;
    private static final long serialVersionUID = 2;
    protected final SpecialEffectsControllerExternalSyntheticLambda1 _coercionConfigs;
    protected final RadioButtonKtRadioButton1 _configOverrides;
    protected startIntentSenderFromFragment _deserializationConfig;
    protected RemoteViewsTranslatorKt _deserializationContext;
    protected FragmentContainerView _injectableValues;
    public final getReturnTransition _jsonFactory;
    protected SurfaceControlCompatTransactionCommittedListener _mixIns;
    protected Set<Object> _registeredModuleTypes;
    protected final ConcurrentHashMap<JavaType, FragmentActivityExternalSyntheticLambda1<Object>> _rootDeserializers;
    protected findFragmentByTag _serializationConfig;
    protected getVersion _serializerFactory;
    protected LifecycleService _serializerProvider;
    protected SurfaceControlV33TransactionExternalSyntheticLambda2 _subtypeResolver;
    protected LifecycleEffectKtExternalSyntheticLambda4 _typeFactory;

    static {
        nSetScale nsetscale = new nSetScale();
        onExtraCallbackWithResult = nsetscale;
        onWarmupCompleted = new isViewFromObject(null, nsetscale, null, LifecycleEffectKtExternalSyntheticLambda4.onWarmupCompleted(), null, onCanceled.asBinder, null, Locale.getDefault(), null, getPopEnterAnim.onNavigationEvent(), dupeFileDescriptor.onExtraCallbackWithResult, new nSetDesiredPresentTime.onNavigationEvent(), RadioButtonKtRadioButtonElement21.onExtraCallback());
    }

    public setOnApplyWindowInsetsListener() {
        this(null, null, null);
    }

    public setOnApplyWindowInsetsListener(getReturnTransition getreturntransition) {
        this(getreturntransition, null, null);
    }

    public setOnApplyWindowInsetsListener(getReturnTransition getreturntransition, LifecycleService lifecycleService, RemoteViewsTranslatorKt remoteViewsTranslatorKt) {
        this._rootDeserializers = new ConcurrentHashMap<>(64, 0.6f, 2);
        if (getreturntransition == null) {
            this._jsonFactory = new isFragmentClass(this);
        } else {
            this._jsonFactory = getreturntransition;
            if (getreturntransition.IAuthTabCallback() == null) {
                getreturntransition.IAuthTabCallback(this);
            }
        }
        this._subtypeResolver = new nDup();
        RootNameLookup rootNameLookup = new RootNameLookup();
        this._typeFactory = LifecycleEffectKtExternalSyntheticLambda4.onWarmupCompleted();
        SurfaceControlCompatTransactionCommittedListener surfaceControlCompatTransactionCommittedListener = new SurfaceControlCompatTransactionCommittedListener(null);
        this._mixIns = surfaceControlCompatTransactionCommittedListener;
        isViewFromObject isviewfromobjectOnExtraCallbackWithResult = onWarmupCompleted.onExtraCallbackWithResult(onExtraCallback());
        RadioButtonKtRadioButton1 radioButtonKtRadioButton1 = new RadioButtonKtRadioButton1();
        this._configOverrides = radioButtonKtRadioButton1;
        SpecialEffectsControllerExternalSyntheticLambda1 specialEffectsControllerExternalSyntheticLambda1 = new SpecialEffectsControllerExternalSyntheticLambda1();
        this._coercionConfigs = specialEffectsControllerExternalSyntheticLambda1;
        this._serializationConfig = new findFragmentByTag(isviewfromobjectOnExtraCallbackWithResult, this._subtypeResolver, surfaceControlCompatTransactionCommittedListener, rootNameLookup, radioButtonKtRadioButton1, RadioButtonKtRadioButtonElementinlinedGlanceNode1.onWarmupCompleted());
        this._deserializationConfig = new startIntentSenderFromFragment(isviewfromobjectOnExtraCallbackWithResult, this._subtypeResolver, surfaceControlCompatTransactionCommittedListener, rootNameLookup, radioButtonKtRadioButton1, specialEffectsControllerExternalSyntheticLambda1, RadioButtonKtRadioButtonElementinlinedGlanceNode1.onWarmupCompleted());
        boolean zIAuthTabCallbackDefault = this._jsonFactory.IAuthTabCallbackDefault();
        findFragmentByTag findfragmentbytag = this._serializationConfig;
        setLayoutTransition setlayouttransition = setLayoutTransition.SORT_PROPERTIES_ALPHABETICALLY;
        if (findfragmentbytag.onExtraCallback(setlayouttransition) ^ zIAuthTabCallbackDefault) {
            onExtraCallbackWithResult(setlayouttransition, zIAuthTabCallbackDefault);
        }
        this._serializerProvider = lifecycleService == null ? new LifecycleService.onNavigationEvent() : lifecycleService;
        this._deserializationContext = remoteViewsTranslatorKt == null ? new RemoteViewsTranslatorKt.onNavigationEvent(RemoteViewsCompositionResult.onExtraCallback) : remoteViewsTranslatorKt;
        this._serializerFactory = LifecycleControllerExternalSyntheticLambda0.onExtraCallbackWithResult;
    }

    protected nSetCrop onExtraCallback() {
        return new nRelease();
    }

    protected loadClass onExtraCallback(startIntentSenderFromFragment startintentsenderfromfragment, JavaType javaType, Object obj, getRetainInstance getretaininstance, FragmentContainerView fragmentContainerView) {
        return new loadClass(this, startintentsenderfromfragment, javaType, obj, getretaininstance, fragmentContainerView);
    }

    protected findFragmentById onExtraCallbackWithResult(findFragmentByTag findfragmentbytag) {
        return new findFragmentById(this, findfragmentbytag);
    }

    public getView onWarmupCompleted(OutputStream outputStream, getSharedElementSourceNames getsharedelementsourcenames) throws IOException {
        onWarmupCompleted("out", outputStream);
        getView getviewOnNavigationEvent = this._jsonFactory.onNavigationEvent(outputStream, getsharedelementsourcenames);
        this._serializationConfig.IAuthTabCallback(getviewOnNavigationEvent);
        return getviewOnNavigationEvent;
    }

    public findFragmentByTag onWarmupCompleted() {
        return this._serializationConfig;
    }

    public startIntentSenderFromFragment onExtraCallbackWithResult() {
        return this._deserializationConfig;
    }

    public setOnApplyWindowInsetsListener IAuthTabCallback(getEnterTransitionCallback$onExtraCallbackWithResult getentertransitioncallback_onextracallbackwithresult) {
        this._configOverrides.onWarmupCompleted(getentertransitioncallback_onextracallbackwithresult);
        return this;
    }

    public RadioButtonKtRadioButtonElement3 IAuthTabCallback(Class<?> cls) {
        return this._configOverrides.onNavigationEvent(cls);
    }

    @Override // o.getViewLifecycleOwnerLiveData
    public getReturnTransition onNavigationEvent() {
        return this._jsonFactory;
    }

    @Deprecated
    public setOnApplyWindowInsetsListener onExtraCallbackWithResult(setLayoutTransition setlayouttransition, boolean z) {
        this._serializationConfig = z ? this._serializationConfig.onExtraCallbackWithResult(setlayouttransition) : this._serializationConfig.onNavigationEvent(setlayouttransition);
        this._deserializationConfig = z ? this._deserializationConfig.onExtraCallbackWithResult(setlayouttransition) : this._deserializationConfig.onNavigationEvent(setlayouttransition);
        return this;
    }

    public boolean onNavigationEvent(supportPostponeEnterTransition supportpostponeentertransition) {
        return this._deserializationConfig.onNavigationEvent(supportpostponeentertransition);
    }

    @Override // o.getViewLifecycleOwnerLiveData
    public void onWarmupCompleted(getView getview, Object obj) throws IOException, JsonMappingException, DatabindException {
        onWarmupCompleted("g", getview);
        findFragmentByTag findfragmentbytagOnWarmupCompleted = onWarmupCompleted();
        if (findfragmentbytagOnWarmupCompleted.onExtraCallbackWithResult(FragmentManagerExternalSyntheticLambda2.INDENT_OUTPUT) && getview.IAuthTabCallbackStub() == null) {
            getview.onNavigationEvent(findfragmentbytagOnWarmupCompleted.onExtraCallbackWithResult());
        }
        if (findfragmentbytagOnWarmupCompleted.onExtraCallbackWithResult(FragmentManagerExternalSyntheticLambda2.CLOSE_CLOSEABLE) && (obj instanceof Closeable)) {
            onExtraCallback(getview, obj, findfragmentbytagOnWarmupCompleted);
            return;
        }
        IAuthTabCallback(findfragmentbytagOnWarmupCompleted).onExtraCallback(getview, obj);
        if (findfragmentbytagOnWarmupCompleted.onExtraCallbackWithResult(FragmentManagerExternalSyntheticLambda2.FLUSH_AFTER_WRITE_VALUE)) {
            getview.flush();
        }
    }

    public byte[] onNavigationEvent(Object obj) throws JsonProcessingException {
        setSharedElementReturnTransition setsharedelementreturntransitionOnNavigationEvent = this._jsonFactory.onNavigationEvent();
        try {
            try {
                startPostponedEnterTransition startpostponedentertransition = new startPostponedEnterTransition(setsharedelementreturntransitionOnNavigationEvent);
                try {
                    onExtraCallbackWithResult(onWarmupCompleted(startpostponedentertransition, getSharedElementSourceNames.UTF8), obj);
                    byte[] bArrAsInterface = startpostponedentertransition.asInterface();
                    startpostponedentertransition.onExtraCallback();
                    startpostponedentertransition.close();
                    return bArrAsInterface;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        try {
                            startpostponedentertransition.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
            } catch (JsonProcessingException e) {
                throw e;
            } catch (IOException e2) {
                throw JsonMappingException.onWarmupCompleted(e2);
            }
        } finally {
            setsharedelementreturntransitionOnNavigationEvent.onNavigationEvent();
        }
    }

    public findFragmentById onTransact() {
        return onExtraCallbackWithResult(onWarmupCompleted());
    }

    public loadClass onWarmupCompleted(Class<?> cls) {
        return onExtraCallback(onExtraCallbackWithResult(), cls == null ? null : this._typeFactory.IAuthTabCallback(cls), null, null, this._injectableValues);
    }

    public <T> T IAuthTabCallback(Object obj, Class<T> cls) throws IllegalArgumentException {
        return (T) IAuthTabCallback(obj, this._typeFactory.IAuthTabCallback(cls));
    }

    public <T> T onWarmupCompleted(Object obj, setSharedElementNames<T> setsharedelementnames) throws IllegalArgumentException {
        return (T) IAuthTabCallback(obj, this._typeFactory.IAuthTabCallback((setSharedElementNames<?>) setsharedelementnames));
    }

    protected Object IAuthTabCallback(Object obj, JavaType javaType) throws MismatchedInputException, JsonMappingException, IllegalArgumentException {
        Object objOnExtraCallback;
        LifecycleService lifecycleServiceIAuthTabCallback = IAuthTabCallback(onWarmupCompleted().onWarmupCompleted(FragmentManagerExternalSyntheticLambda2.WRAP_ROOT_VALUE));
        waitForLoader waitforloaderOnWarmupCompleted = lifecycleServiceIAuthTabCallback.onWarmupCompleted(this);
        if (onNavigationEvent(supportPostponeEnterTransition.USE_BIG_DECIMAL_FOR_FLOATS)) {
            waitforloaderOnWarmupCompleted = waitforloaderOnWarmupCompleted.IAuthTabCallback(true);
        }
        try {
            lifecycleServiceIAuthTabCallback.onExtraCallback(waitforloaderOnWarmupCompleted, obj);
            getViewLifecycleOwner getviewlifecycleownerExtraCallback = waitforloaderOnWarmupCompleted.extraCallback();
            startIntentSenderFromFragment startintentsenderfromfragmentOnExtraCallbackWithResult = onExtraCallbackWithResult();
            getTargetRequestCode gettargetrequestcodeOnExtraCallbackWithResult = onExtraCallbackWithResult(getviewlifecycleownerExtraCallback, javaType);
            if (gettargetrequestcodeOnExtraCallbackWithResult == getTargetRequestCode.VALUE_NULL) {
                RemoteViewsTranslatorKt remoteViewsTranslatorKtOnNavigationEvent = onNavigationEvent(getviewlifecycleownerExtraCallback, startintentsenderfromfragmentOnExtraCallbackWithResult);
                objOnExtraCallback = onExtraCallbackWithResult(remoteViewsTranslatorKtOnNavigationEvent, javaType).onNavigationEvent(remoteViewsTranslatorKtOnNavigationEvent);
            } else if (gettargetrequestcodeOnExtraCallbackWithResult == getTargetRequestCode.END_ARRAY || gettargetrequestcodeOnExtraCallbackWithResult == getTargetRequestCode.END_OBJECT) {
                objOnExtraCallback = null;
            } else {
                RemoteViewsTranslatorKt remoteViewsTranslatorKtOnNavigationEvent2 = onNavigationEvent(getviewlifecycleownerExtraCallback, startintentsenderfromfragmentOnExtraCallbackWithResult);
                objOnExtraCallback = onExtraCallbackWithResult(remoteViewsTranslatorKtOnNavigationEvent2, javaType).onExtraCallback(getviewlifecycleownerExtraCallback, remoteViewsTranslatorKtOnNavigationEvent2);
            }
            getviewlifecycleownerExtraCallback.close();
            return objOnExtraCallback;
        } catch (IOException e) {
            throw new IllegalArgumentException(e.getMessage(), e);
        }
    }

    protected LifecycleService IAuthTabCallback(findFragmentByTag findfragmentbytag) {
        return this._serializerProvider.onExtraCallbackWithResult(findfragmentbytag, this._serializerFactory);
    }

    protected final void onExtraCallbackWithResult(getView getview, Object obj) throws IOException, JsonMappingException {
        findFragmentByTag findfragmentbytagOnWarmupCompleted = onWarmupCompleted();
        if (findfragmentbytagOnWarmupCompleted.onExtraCallbackWithResult(FragmentManagerExternalSyntheticLambda2.CLOSE_CLOSEABLE) && (obj instanceof Closeable)) {
            onWarmupCompleted(getview, obj, findfragmentbytagOnWarmupCompleted);
            return;
        }
        try {
            IAuthTabCallback(findfragmentbytagOnWarmupCompleted).onExtraCallback(getview, obj);
            getview.close();
        } catch (Exception e) {
            SavedStateHandleImplExternalSyntheticLambda0.onWarmupCompleted(602149247, new Object[]{getview, e}, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -602149241, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult());
        }
    }

    private final void onWarmupCompleted(getView getview, Object obj, findFragmentByTag findfragmentbytag) throws IOException, JsonMappingException {
        Closeable closeable = (Closeable) obj;
        try {
            IAuthTabCallback(findfragmentbytag).onExtraCallback(getview, obj);
        } catch (Exception e) {
            e = e;
        }
        try {
            closeable.close();
            getview.close();
        } catch (Exception e2) {
            e = e2;
            closeable = null;
            SavedStateHandleImplExternalSyntheticLambda0.onNavigationEvent(getview, closeable, e);
        }
    }

    private final void onExtraCallback(getView getview, Object obj, findFragmentByTag findfragmentbytag) throws IOException, JsonMappingException {
        Closeable closeable = (Closeable) obj;
        try {
            IAuthTabCallback(findfragmentbytag).onExtraCallback(getview, obj);
            if (findfragmentbytag.onExtraCallbackWithResult(FragmentManagerExternalSyntheticLambda2.FLUSH_AFTER_WRITE_VALUE)) {
                getview.flush();
            }
            closeable.close();
        } catch (Exception e) {
            SavedStateHandleImplExternalSyntheticLambda0.onNavigationEvent((getView) null, closeable, e);
        }
    }

    protected RemoteViewsTranslatorKt onNavigationEvent(getViewLifecycleOwner getviewlifecycleowner, startIntentSenderFromFragment startintentsenderfromfragment) {
        return this._deserializationContext.IAuthTabCallback(startintentsenderfromfragment, getviewlifecycleowner, this._injectableValues);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.fasterxml.jackson.databind.exc.MismatchedInputException */
    protected getTargetRequestCode onExtraCallbackWithResult(getViewLifecycleOwner getviewlifecycleowner, JavaType javaType) throws MismatchedInputException, IOException {
        this._deserializationConfig.IAuthTabCallback(getviewlifecycleowner);
        getTargetRequestCode gettargetrequestcodeAsBinder = getviewlifecycleowner.asBinder();
        if (gettargetrequestcodeAsBinder != null) {
            return gettargetrequestcodeAsBinder;
        }
        getTargetRequestCode gettargetrequestcodeValidateRelationship = getviewlifecycleowner.validateRelationship();
        if (gettargetrequestcodeValidateRelationship != null) {
            return gettargetrequestcodeValidateRelationship;
        }
        throw MismatchedInputException.onWarmupCompleted(getviewlifecycleowner, javaType, "No content to map due to end-of-input");
    }

    protected FragmentActivityExternalSyntheticLambda1<Object> onExtraCallbackWithResult(supportStartPostponedEnterTransition supportstartpostponedentertransition, JavaType javaType) throws JsonMappingException, DatabindException {
        FragmentActivityExternalSyntheticLambda1<Object> fragmentActivityExternalSyntheticLambda1 = this._rootDeserializers.get(javaType);
        if (fragmentActivityExternalSyntheticLambda1 != null) {
            return fragmentActivityExternalSyntheticLambda1;
        }
        FragmentActivityExternalSyntheticLambda1<Object> fragmentActivityExternalSyntheticLambda1OnExtraCallback = supportstartpostponedentertransition.onExtraCallback(javaType);
        if (fragmentActivityExternalSyntheticLambda1OnExtraCallback == null) {
            return (FragmentActivityExternalSyntheticLambda1) supportstartpostponedentertransition.onWarmupCompleted(javaType, "Cannot find a deserializer for type " + javaType);
        }
        this._rootDeserializers.put(javaType, fragmentActivityExternalSyntheticLambda1OnExtraCallback);
        return fragmentActivityExternalSyntheticLambda1OnExtraCallback;
    }

    protected final void onWarmupCompleted(String str, Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException(String.format("argument \"%s\" is null", str));
        }
    }
}
