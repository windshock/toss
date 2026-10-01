package o;

import com.fasterxml.jackson.core.io.JsonEOFException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.exc.InvalidTypeIdException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;
import com.fasterxml.jackson.databind.exc.ValueInstantiationException;
import im.toss.features.benefit.ui.BenefitItemAdapter$;
import java.io.IOException;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class supportStartPostponedEnterTransition extends supportFinishAfterTransition implements Serializable {
    private static final long serialVersionUID = 1;
    protected transient DateFormat IAuthTabCallback;
    protected final InvisibleActionTrampolineActivity _cache;
    public final startIntentSenderFromFragment _config;
    protected cancelLoadInBackground<JavaType> _currentType;
    protected final RunCallbackActionKt _factory;
    protected final int _featureFlags;
    protected final FragmentContainerView _injectableValues;
    protected final r8lambda4ROHaS4O6f2WoPhKvhOMRg_7Bzo<isAdded> _readCapabilities;
    protected final Class<?> _view;
    protected transient LifecycleEffectKtExternalSyntheticLambda9 onExtraCallback;
    protected transient executePendingTask onExtraCallbackWithResult;
    protected transient RetainInstanceUsageViolation onNavigationEvent;
    protected transient getViewLifecycleOwner onWarmupCompleted;

    public abstract setDrawDisappearingViewsLast onExtraCallbackWithResult(internalPathIteratorPeek internalpathiteratorpeek, Object obj) throws JsonMappingException;

    public abstract ReadableObjectId onWarmupCompleted(Object obj, getParentFragmentManager<?> getparentfragmentmanager, getParentFragment getparentfragment);

    public abstract FragmentActivityExternalSyntheticLambda1<Object> onWarmupCompleted(internalPathIteratorPeek internalpathiteratorpeek, Object obj) throws JsonMappingException;

    public supportStartPostponedEnterTransition(RunCallbackActionKt runCallbackActionKt, InvisibleActionTrampolineActivity invisibleActionTrampolineActivity) {
        Objects.requireNonNull(runCallbackActionKt);
        this._factory = runCallbackActionKt;
        this._cache = invisibleActionTrampolineActivity == null ? new InvisibleActionTrampolineActivity() : invisibleActionTrampolineActivity;
        this._featureFlags = 0;
        this._readCapabilities = null;
        this._config = null;
        this._injectableValues = null;
        this._view = null;
        this.onNavigationEvent = null;
    }

    public supportStartPostponedEnterTransition(supportStartPostponedEnterTransition supportstartpostponedentertransition, startIntentSenderFromFragment startintentsenderfromfragment, getViewLifecycleOwner getviewlifecycleowner, FragmentContainerView fragmentContainerView) {
        this._cache = supportstartpostponedentertransition._cache;
        this._factory = supportstartpostponedentertransition._factory;
        this._readCapabilities = getviewlifecycleowner == null ? null : getviewlifecycleowner.isEngagementSignalsApiAvailable();
        this._config = startintentsenderfromfragment;
        this._featureFlags = startintentsenderfromfragment.onExtraCallback();
        this._view = startintentsenderfromfragment.onMinimized();
        this.onWarmupCompleted = getviewlifecycleowner;
        this._injectableValues = fragmentContainerView;
        this.onNavigationEvent = startintentsenderfromfragment.onPostMessage();
    }

    public supportStartPostponedEnterTransition(supportStartPostponedEnterTransition supportstartpostponedentertransition, startIntentSenderFromFragment startintentsenderfromfragment) {
        this._cache = supportstartpostponedentertransition._cache;
        this._factory = supportstartpostponedentertransition._factory;
        this._readCapabilities = null;
        this._config = startintentsenderfromfragment;
        this._featureFlags = startintentsenderfromfragment.onExtraCallback();
        this._view = null;
        this.onWarmupCompleted = null;
        this._injectableValues = null;
        this.onNavigationEvent = null;
    }

    @Override // o.supportFinishAfterTransition
    /* renamed from: onTransact, reason: merged with bridge method [inline-methods] */
    public startIntentSenderFromFragment onNavigationEvent() {
        return this._config;
    }

    public final Class<?> IAuthTabCallbackDefault() {
        return this._view;
    }

    public final boolean onExtraCallbackWithResult() {
        return this._config.asInterface();
    }

    public final boolean onWarmupCompleted(setLayoutTransition setlayouttransition) {
        return this._config.onExtraCallback(setlayouttransition);
    }

    public final boolean onExtraCallback(RadioButtonKtRadioButton3 radioButtonKtRadioButton3) {
        return this._config.onExtraCallbackWithResult(radioButtonKtRadioButton3);
    }

    public final RadioButtonKtRadioButtonElementinlinedGlanceNode1 access100() {
        return this._config.onActivityResized();
    }

    public final registerOnPreAttachListener$onExtraCallback onExtraCallbackWithResult(Class<?> cls) {
        return this._config.onNavigationEvent(cls);
    }

    public final startActivityFromFragment asBinder() {
        return this._config.asBinder();
    }

    @Override // o.supportFinishAfterTransition
    public final LifecycleEffectKtExternalSyntheticLambda4 onExtraCallback() {
        return this._config.extraCallback();
    }

    public JavaType onExtraCallbackWithResult(JavaType javaType, Class<?> cls) throws IllegalArgumentException {
        return javaType.onNavigationEvent(cls) ? javaType : onNavigationEvent().extraCallback().onWarmupCompleted(javaType, cls, false);
    }

    public Locale IAuthTabCallback_Parcel() {
        return this._config.access100();
    }

    public TimeZone extraCallbackWithResult() {
        return this._config.extraCallbackWithResult();
    }

    public final boolean onWarmupCompleted(supportPostponeEnterTransition supportpostponeentertransition) {
        return (supportpostponeentertransition.getMask() & this._featureFlags) != 0;
    }

    public final boolean onExtraCallback(isAdded isadded) {
        return this._readCapabilities.onNavigationEvent((r8lambda4ROHaS4O6f2WoPhKvhOMRg_7Bzo<isAdded>) isadded);
    }

    public final int access000() {
        return this._featureFlags;
    }

    public final boolean onExtraCallback(int i2) {
        return (i2 & this._featureFlags) != 0;
    }

    public final getViewLifecycleOwner getInterfaceDescriptor() {
        return this.onWarmupCompleted;
    }

    public final Object onExtraCallbackWithResult(Object obj, validateRequestPermissionsRequestCode validaterequestpermissionsrequestcode, Object obj2) throws JsonMappingException {
        FragmentContainerView fragmentContainerView = this._injectableValues;
        if (fragmentContainerView == null) {
            return onWarmupCompleted(SavedStateHandleImplExternalSyntheticLambda0.IAuthTabCallback(obj), String.format("No 'injectableValues' configured, cannot inject value with id [%s]", obj));
        }
        return fragmentContainerView.onWarmupCompleted(obj, this, validaterequestpermissionsrequestcode, obj2);
    }

    public final getPostOnViewCreatedAlpha IAuthTabCallbackStub() {
        return this._config.onTransact();
    }

    public final onActivityStarted IAuthTabCallbackStubProxy() {
        return this._config.onExtraCallbackWithResult();
    }

    public FragmentTransitionImpl onNavigationEvent(LifecycleEffectKtExternalSyntheticLambda8 lifecycleEffectKtExternalSyntheticLambda8, Class<?> cls, FragmentStrictModeExternalSyntheticLambda0 fragmentStrictModeExternalSyntheticLambda0) {
        return this._config.onExtraCallback(lifecycleEffectKtExternalSyntheticLambda8, cls, fragmentStrictModeExternalSyntheticLambda0);
    }

    public FragmentTransitionImpl IAuthTabCallback(LifecycleEffectKtExternalSyntheticLambda8 lifecycleEffectKtExternalSyntheticLambda8, Class<?> cls, FragmentTransitionImpl fragmentTransitionImpl) {
        return this._config.onWarmupCompleted(lifecycleEffectKtExternalSyntheticLambda8, cls, fragmentTransitionImpl);
    }

    public waitForLoader onExtraCallbackWithResult(getViewLifecycleOwner getviewlifecycleowner) {
        return new waitForLoader(getviewlifecycleowner, this);
    }

    public final waitForLoader onWarmupCompleted() {
        return onExtraCallbackWithResult(getInterfaceDescriptor());
    }

    public waitForLoader IAuthTabCallback(getViewLifecycleOwner getviewlifecycleowner) throws JsonEOFException, IOException {
        waitForLoader waitforloaderOnExtraCallbackWithResult = onExtraCallbackWithResult(getviewlifecycleowner);
        waitforloaderOnExtraCallbackWithResult.IAuthTabCallbackDefault(getviewlifecycleowner);
        return waitforloaderOnExtraCallbackWithResult;
    }

    public final FragmentActivityExternalSyntheticLambda1<Object> onNavigationEvent(JavaType javaType, validateRequestPermissionsRequestCode validaterequestpermissionsrequestcode) throws JsonMappingException {
        FragmentActivityExternalSyntheticLambda1<Object> fragmentActivityExternalSyntheticLambda1OnExtraCallback = this._cache.onExtraCallback(this, this._factory, javaType);
        return fragmentActivityExternalSyntheticLambda1OnExtraCallback != null ? onExtraCallback((FragmentActivityExternalSyntheticLambda1<?>) fragmentActivityExternalSyntheticLambda1OnExtraCallback, validaterequestpermissionsrequestcode, javaType) : fragmentActivityExternalSyntheticLambda1OnExtraCallback;
    }

    public final FragmentActivityExternalSyntheticLambda1<Object> IAuthTabCallback(JavaType javaType) throws JsonMappingException {
        return this._cache.onExtraCallback(this, this._factory, javaType);
    }

    public final FragmentActivityExternalSyntheticLambda1<Object> onExtraCallback(JavaType javaType) throws JsonMappingException {
        FragmentActivityExternalSyntheticLambda1<Object> fragmentActivityExternalSyntheticLambda1OnExtraCallback = this._cache.onExtraCallback(this, this._factory, javaType);
        if (fragmentActivityExternalSyntheticLambda1OnExtraCallback == null) {
            return null;
        }
        FragmentActivityExternalSyntheticLambda1<?> fragmentActivityExternalSyntheticLambda1OnExtraCallback2 = onExtraCallback((FragmentActivityExternalSyntheticLambda1<?>) fragmentActivityExternalSyntheticLambda1OnExtraCallback, (validateRequestPermissionsRequestCode) null, javaType);
        setColumnCount setcolumncountOnExtraCallback = this._factory.onExtraCallback(this._config, javaType);
        return setcolumncountOnExtraCallback != null ? new CanvasFrontBufferedRendererExternalSyntheticLambda2(setcolumncountOnExtraCallback.onWarmupCompleted((validateRequestPermissionsRequestCode) null), fragmentActivityExternalSyntheticLambda1OnExtraCallback2) : fragmentActivityExternalSyntheticLambda1OnExtraCallback2;
    }

    public final setDrawDisappearingViewsLast onExtraCallbackWithResult(JavaType javaType, validateRequestPermissionsRequestCode validaterequestpermissionsrequestcode) throws JsonMappingException {
        setDrawDisappearingViewsLast setdrawdisappearingviewslastIAuthTabCallback;
        try {
            setdrawdisappearingviewslastIAuthTabCallback = this._cache.IAuthTabCallback(this, this._factory, javaType);
        } catch (IllegalArgumentException e) {
            onWarmupCompleted(javaType, SavedStateHandleImplExternalSyntheticLambda0.onExtraCallback(e));
            setdrawdisappearingviewslastIAuthTabCallback = null;
        }
        return setdrawdisappearingviewslastIAuthTabCallback instanceof ActionTrampolineActivity ? ((ActionTrampolineActivity) setdrawdisappearingviewslastIAuthTabCallback).onWarmupCompleted(this, validaterequestpermissionsrequestcode) : setdrawdisappearingviewslastIAuthTabCallback;
    }

    public final JavaType onWarmupCompleted(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        return this._config.IAuthTabCallback(cls);
    }

    public Class<?> onExtraCallback(String str) throws ClassNotFoundException {
        return onExtraCallback().IAuthTabCallback(str);
    }

    public final executePendingTask writeTypedObject() {
        executePendingTask executependingtask = this.onExtraCallbackWithResult;
        if (executependingtask == null) {
            return new executePendingTask();
        }
        this.onExtraCallbackWithResult = null;
        return executependingtask;
    }

    public final void onExtraCallbackWithResult(executePendingTask executependingtask) {
        if (this.onExtraCallbackWithResult == null || executependingtask.IAuthTabCallback() >= this.onExtraCallbackWithResult.IAuthTabCallback()) {
            this.onExtraCallbackWithResult = executependingtask;
        }
    }

    public final LifecycleEffectKtExternalSyntheticLambda9 asInterface() {
        if (this.onExtraCallback == null) {
            this.onExtraCallback = new LifecycleEffectKtExternalSyntheticLambda9();
        }
        return this.onExtraCallback;
    }

    public FragmentActivityExternalSyntheticLambda1<?> onNavigationEvent(FragmentActivityExternalSyntheticLambda1<?> fragmentActivityExternalSyntheticLambda1, validateRequestPermissionsRequestCode validaterequestpermissionsrequestcode, JavaType javaType) throws JsonMappingException {
        if (!(fragmentActivityExternalSyntheticLambda1 instanceof RowColumnChildSelector)) {
            return fragmentActivityExternalSyntheticLambda1;
        }
        this._currentType = new cancelLoadInBackground<>(javaType, this._currentType);
        try {
            return ((RowColumnChildSelector) fragmentActivityExternalSyntheticLambda1).onNavigationEvent(this, validaterequestpermissionsrequestcode);
        } finally {
            this._currentType = this._currentType.onWarmupCompleted();
        }
    }

    public FragmentActivityExternalSyntheticLambda1<?> onExtraCallback(FragmentActivityExternalSyntheticLambda1<?> fragmentActivityExternalSyntheticLambda1, validateRequestPermissionsRequestCode validaterequestpermissionsrequestcode, JavaType javaType) throws JsonMappingException {
        if (!(fragmentActivityExternalSyntheticLambda1 instanceof RowColumnChildSelector)) {
            return fragmentActivityExternalSyntheticLambda1;
        }
        this._currentType = new cancelLoadInBackground<>(javaType, this._currentType);
        try {
            return ((RowColumnChildSelector) fragmentActivityExternalSyntheticLambda1).onNavigationEvent(this, validaterequestpermissionsrequestcode);
        } finally {
            this._currentType = this._currentType.onWarmupCompleted();
        }
    }

    public Date onNavigationEvent(String str) throws IllegalArgumentException {
        try {
            return IAuthTabCallback().parse(str);
        } catch (ParseException e) {
            throw new IllegalArgumentException(String.format("Failed to parse Date value '%s': %s", str, SavedStateHandleImplExternalSyntheticLambda0.onExtraCallback(e)));
        }
    }

    public Calendar onExtraCallback(Date date) {
        Calendar calendar = Calendar.getInstance(extraCallbackWithResult());
        calendar.setTime(date);
        return calendar;
    }

    public String onExtraCallbackWithResult(getViewLifecycleOwner getviewlifecycleowner, FragmentActivityExternalSyntheticLambda1<?> fragmentActivityExternalSyntheticLambda1, Class<?> cls) throws IOException {
        return (String) onExtraCallback(cls, getviewlifecycleowner);
    }

    public <T> T onWarmupCompleted(getViewLifecycleOwner getviewlifecycleowner, Class<T> cls) throws IOException {
        return (T) onExtraCallback(getviewlifecycleowner, onExtraCallback().IAuthTabCallback(cls));
    }

    public <T> T onExtraCallback(getViewLifecycleOwner getviewlifecycleowner, JavaType javaType) throws IOException, JsonMappingException {
        FragmentActivityExternalSyntheticLambda1<Object> fragmentActivityExternalSyntheticLambda1OnExtraCallback = onExtraCallback(javaType);
        if (fragmentActivityExternalSyntheticLambda1OnExtraCallback == null) {
            return (T) onWarmupCompleted(javaType, "Could not find JsonDeserializer for type " + SavedStateHandleImplExternalSyntheticLambda0.IAuthTabCallback(javaType));
        }
        return (T) fragmentActivityExternalSyntheticLambda1OnExtraCallback.onExtraCallback(getviewlifecycleowner, this);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException */
    public boolean onNavigationEvent(getViewLifecycleOwner getviewlifecycleowner, FragmentActivityExternalSyntheticLambda1<?> fragmentActivityExternalSyntheticLambda1, Object obj, String str) throws UnrecognizedPropertyException, IOException {
        for (cancelLoadInBackground<RunCallbackActionCompanion> cancelloadinbackgroundIAuthTabCallback = this._config.IAuthTabCallback(); cancelloadinbackgroundIAuthTabCallback != null; cancelloadinbackgroundIAuthTabCallback = cancelloadinbackgroundIAuthTabCallback.onWarmupCompleted()) {
            if (cancelloadinbackgroundIAuthTabCallback.onNavigationEvent().onExtraCallback(this, getviewlifecycleowner, fragmentActivityExternalSyntheticLambda1, obj, str)) {
                return true;
            }
        }
        if (!onWarmupCompleted(supportPostponeEnterTransition.FAIL_ON_UNKNOWN_PROPERTIES)) {
            getviewlifecycleowner.writeTypedList();
            return true;
        }
        throw UnrecognizedPropertyException.IAuthTabCallback(this.onWarmupCompleted, obj, str, fragmentActivityExternalSyntheticLambda1 == null ? null : fragmentActivityExternalSyntheticLambda1.onExtraCallback());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.fasterxml.jackson.databind.JsonMappingException */
    public Object onExtraCallback(Class<?> cls, String str, String str2, Object... objArr) throws IOException, JsonMappingException {
        String strOnExtraCallbackWithResult = onExtraCallbackWithResult(str2, objArr);
        for (cancelLoadInBackground<RunCallbackActionCompanion> cancelloadinbackgroundIAuthTabCallback = this._config.IAuthTabCallback(); cancelloadinbackgroundIAuthTabCallback != null; cancelloadinbackgroundIAuthTabCallback = cancelloadinbackgroundIAuthTabCallback.onWarmupCompleted()) {
            Object objOnWarmupCompleted = cancelloadinbackgroundIAuthTabCallback.onNavigationEvent().onWarmupCompleted(this, cls, str, strOnExtraCallbackWithResult);
            if (objOnWarmupCompleted != RunCallbackActionCompanion.onNavigationEvent) {
                if (objOnWarmupCompleted == null || cls.isInstance(objOnWarmupCompleted)) {
                    return objOnWarmupCompleted;
                }
                throw IAuthTabCallback(str, cls, String.format("DeserializationProblemHandler.handleWeirdKey() for type %s returned value of type %s", SavedStateHandleImplExternalSyntheticLambda0.onNavigationEvent(cls), SavedStateHandleImplExternalSyntheticLambda0.onNavigationEvent(objOnWarmupCompleted)));
            }
        }
        throw onExtraCallbackWithResult(cls, str, strOnExtraCallbackWithResult);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.fasterxml.jackson.databind.JsonMappingException */
    public Object IAuthTabCallback(Class<?> cls, String str, String str2, Object... objArr) throws IOException, JsonMappingException {
        String strOnExtraCallbackWithResult = onExtraCallbackWithResult(str2, objArr);
        for (cancelLoadInBackground<RunCallbackActionCompanion> cancelloadinbackgroundIAuthTabCallback = this._config.IAuthTabCallback(); cancelloadinbackgroundIAuthTabCallback != null; cancelloadinbackgroundIAuthTabCallback = cancelloadinbackgroundIAuthTabCallback.onWarmupCompleted()) {
            Object objOnExtraCallbackWithResult = cancelloadinbackgroundIAuthTabCallback.onNavigationEvent().onExtraCallbackWithResult(this, cls, str, strOnExtraCallbackWithResult);
            if (objOnExtraCallbackWithResult != RunCallbackActionCompanion.onNavigationEvent) {
                if (IAuthTabCallback(cls, objOnExtraCallbackWithResult)) {
                    return objOnExtraCallbackWithResult;
                }
                throw IAuthTabCallback(str, cls, String.format("DeserializationProblemHandler.handleWeirdStringValue() for type %s returned value of type %s", SavedStateHandleImplExternalSyntheticLambda0.onNavigationEvent(cls), SavedStateHandleImplExternalSyntheticLambda0.onNavigationEvent(objOnExtraCallbackWithResult)));
            }
        }
        throw IAuthTabCallback(str, cls, strOnExtraCallbackWithResult);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.fasterxml.jackson.databind.JsonMappingException */
    public Object onWarmupCompleted(Class<?> cls, Number number, String str, Object... objArr) throws IOException, JsonMappingException {
        String strOnExtraCallbackWithResult = onExtraCallbackWithResult(str, objArr);
        for (cancelLoadInBackground<RunCallbackActionCompanion> cancelloadinbackgroundIAuthTabCallback = this._config.IAuthTabCallback(); cancelloadinbackgroundIAuthTabCallback != null; cancelloadinbackgroundIAuthTabCallback = cancelloadinbackgroundIAuthTabCallback.onWarmupCompleted()) {
            Object objOnExtraCallbackWithResult = cancelloadinbackgroundIAuthTabCallback.onNavigationEvent().onExtraCallbackWithResult(this, cls, number, strOnExtraCallbackWithResult);
            if (objOnExtraCallbackWithResult != RunCallbackActionCompanion.onNavigationEvent) {
                if (IAuthTabCallback(cls, objOnExtraCallbackWithResult)) {
                    return objOnExtraCallbackWithResult;
                }
                throw onNavigationEvent(number, cls, onExtraCallbackWithResult("DeserializationProblemHandler.handleWeirdNumberValue() for type %s returned value of type %s", SavedStateHandleImplExternalSyntheticLambda0.onNavigationEvent(cls), SavedStateHandleImplExternalSyntheticLambda0.onNavigationEvent(objOnExtraCallbackWithResult)));
            }
        }
        throw onNavigationEvent(number, cls, strOnExtraCallbackWithResult);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.fasterxml.jackson.databind.JsonMappingException */
    public Object onExtraCallback(JavaType javaType, Object obj, getViewLifecycleOwner getviewlifecycleowner) throws IOException, JsonMappingException {
        Class<?> clsAsBinder = javaType.asBinder();
        for (cancelLoadInBackground<RunCallbackActionCompanion> cancelloadinbackgroundIAuthTabCallback = this._config.IAuthTabCallback(); cancelloadinbackgroundIAuthTabCallback != null; cancelloadinbackgroundIAuthTabCallback = cancelloadinbackgroundIAuthTabCallback.onWarmupCompleted()) {
            Object objOnExtraCallback = cancelloadinbackgroundIAuthTabCallback.onNavigationEvent().onExtraCallback(this, javaType, obj, getviewlifecycleowner);
            if (objOnExtraCallback != RunCallbackActionCompanion.onNavigationEvent) {
                if (objOnExtraCallback == null || clsAsBinder.isInstance(objOnExtraCallback)) {
                    return objOnExtraCallback;
                }
                throw JsonMappingException.onExtraCallbackWithResult(getviewlifecycleowner, onExtraCallbackWithResult("DeserializationProblemHandler.handleWeirdNativeValue() for type %s returned value of type %s", SavedStateHandleImplExternalSyntheticLambda0.onNavigationEvent(javaType), SavedStateHandleImplExternalSyntheticLambda0.onNavigationEvent(objOnExtraCallback)));
            }
        }
        throw onExtraCallback(obj, clsAsBinder);
    }

    public Object onExtraCallback(Class<?> cls, internalGetVerifier internalgetverifier, getViewLifecycleOwner getviewlifecycleowner, String str, Object... objArr) throws IOException, JsonMappingException {
        if (getviewlifecycleowner == null) {
            getviewlifecycleowner = getInterfaceDescriptor();
        }
        String strOnExtraCallbackWithResult = onExtraCallbackWithResult(str, objArr);
        for (cancelLoadInBackground<RunCallbackActionCompanion> cancelloadinbackgroundIAuthTabCallback = this._config.IAuthTabCallback(); cancelloadinbackgroundIAuthTabCallback != null; cancelloadinbackgroundIAuthTabCallback = cancelloadinbackgroundIAuthTabCallback.onWarmupCompleted()) {
            Object objIAuthTabCallback = cancelloadinbackgroundIAuthTabCallback.onNavigationEvent().IAuthTabCallback(this, cls, internalgetverifier, getviewlifecycleowner, strOnExtraCallbackWithResult);
            if (objIAuthTabCallback != RunCallbackActionCompanion.onNavigationEvent) {
                if (IAuthTabCallback(cls, objIAuthTabCallback)) {
                    return objIAuthTabCallback;
                }
                onWarmupCompleted(onWarmupCompleted(cls), String.format("DeserializationProblemHandler.handleMissingInstantiator() for type %s returned value of type %s", SavedStateHandleImplExternalSyntheticLambda0.onNavigationEvent(cls), SavedStateHandleImplExternalSyntheticLambda0.onNavigationEvent(objIAuthTabCallback)));
            }
        }
        if (internalgetverifier == null) {
            return onWarmupCompleted(cls, String.format("Cannot construct instance of %s: %s", SavedStateHandleImplExternalSyntheticLambda0.onActivityResized(cls), strOnExtraCallbackWithResult));
        }
        if (!internalgetverifier.IAuthTabCallbackStubProxy()) {
            return onWarmupCompleted(cls, String.format("Cannot construct instance of %s (no Creators, like default constructor, exist): %s", SavedStateHandleImplExternalSyntheticLambda0.onActivityResized(cls), strOnExtraCallbackWithResult));
        }
        return onWarmupCompleted(cls, String.format("Cannot construct instance of %s (although at least one Creator exists): %s", SavedStateHandleImplExternalSyntheticLambda0.onActivityResized(cls), strOnExtraCallbackWithResult), new Object[0]);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.fasterxml.jackson.databind.JsonMappingException */
    public Object onWarmupCompleted(Class<?> cls, Object obj, Throwable th) throws IOException, JsonMappingException {
        for (cancelLoadInBackground<RunCallbackActionCompanion> cancelloadinbackgroundIAuthTabCallback = this._config.IAuthTabCallback(); cancelloadinbackgroundIAuthTabCallback != null; cancelloadinbackgroundIAuthTabCallback = cancelloadinbackgroundIAuthTabCallback.onWarmupCompleted()) {
            Object objOnWarmupCompleted = cancelloadinbackgroundIAuthTabCallback.onNavigationEvent().onWarmupCompleted(this, cls, obj, th);
            if (objOnWarmupCompleted != RunCallbackActionCompanion.onNavigationEvent) {
                if (IAuthTabCallback(cls, objOnWarmupCompleted)) {
                    return objOnWarmupCompleted;
                }
                onWarmupCompleted(onWarmupCompleted(cls), String.format("DeserializationProblemHandler.handleInstantiationProblem() for type %s returned value of type %s", SavedStateHandleImplExternalSyntheticLambda0.onNavigationEvent(cls), SavedStateHandleImplExternalSyntheticLambda0.onExtraCallbackWithResult(objOnWarmupCompleted)));
            }
        }
        SavedStateHandleImplExternalSyntheticLambda0.onNavigationEvent(th);
        if (!onWarmupCompleted(supportPostponeEnterTransition.WRAP_EXCEPTIONS)) {
            SavedStateHandleImplExternalSyntheticLambda0.IAuthTabCallbackDefault(th);
        }
        throw onExtraCallback(cls, th);
    }

    public Object onExtraCallback(Class<?> cls, getViewLifecycleOwner getviewlifecycleowner) throws IOException {
        return onExtraCallback(onWarmupCompleted(cls), getviewlifecycleowner.asBinder(), getviewlifecycleowner, (String) null, new Object[0]);
    }

    public Object onExtraCallbackWithResult(Class<?> cls, getTargetRequestCode gettargetrequestcode, getViewLifecycleOwner getviewlifecycleowner, String str, Object... objArr) throws IOException {
        return onExtraCallback(onWarmupCompleted(cls), gettargetrequestcode, getviewlifecycleowner, str, objArr);
    }

    public Object onExtraCallbackWithResult(JavaType javaType, getViewLifecycleOwner getviewlifecycleowner) throws IOException {
        return onExtraCallback(javaType, getviewlifecycleowner.asBinder(), getviewlifecycleowner, (String) null, new Object[0]);
    }

    public Object onExtraCallback(JavaType javaType, getTargetRequestCode gettargetrequestcode, getViewLifecycleOwner getviewlifecycleowner, String str, Object... objArr) throws MismatchedInputException, IOException, JsonMappingException {
        String strOnExtraCallbackWithResult = onExtraCallbackWithResult(str, objArr);
        for (cancelLoadInBackground<RunCallbackActionCompanion> cancelloadinbackgroundIAuthTabCallback = this._config.IAuthTabCallback(); cancelloadinbackgroundIAuthTabCallback != null; cancelloadinbackgroundIAuthTabCallback = cancelloadinbackgroundIAuthTabCallback.onWarmupCompleted()) {
            Object objOnNavigationEvent = cancelloadinbackgroundIAuthTabCallback.onNavigationEvent().onNavigationEvent(this, javaType, gettargetrequestcode, getviewlifecycleowner, strOnExtraCallbackWithResult);
            if (objOnNavigationEvent != RunCallbackActionCompanion.onNavigationEvent) {
                if (IAuthTabCallback(javaType.asBinder(), objOnNavigationEvent)) {
                    return objOnNavigationEvent;
                }
                onWarmupCompleted(javaType, String.format("DeserializationProblemHandler.handleUnexpectedToken() for type %s returned value of type %s", SavedStateHandleImplExternalSyntheticLambda0.IAuthTabCallback(javaType), SavedStateHandleImplExternalSyntheticLambda0.onExtraCallbackWithResult(objOnNavigationEvent)));
            }
        }
        if (strOnExtraCallbackWithResult == null) {
            String strIAuthTabCallback = SavedStateHandleImplExternalSyntheticLambda0.IAuthTabCallback(javaType);
            if (gettargetrequestcode == null) {
                strOnExtraCallbackWithResult = String.format("Unexpected end-of-input when trying read value of type %s", strIAuthTabCallback);
            } else {
                strOnExtraCallbackWithResult = String.format("Cannot deserialize value of type %s from %s (token `JsonToken.%s`)", strIAuthTabCallback, onExtraCallback(gettargetrequestcode), gettargetrequestcode);
            }
        }
        if (gettargetrequestcode != null && gettargetrequestcode.isScalarValue()) {
            getviewlifecycleowner.mayLaunchUrl();
        }
        onExtraCallbackWithResult(javaType, strOnExtraCallbackWithResult, new Object[0]);
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.fasterxml.jackson.databind.JsonMappingException */
    public JavaType onExtraCallbackWithResult(JavaType javaType, String str, setColumnOrderPreserved setcolumnorderpreserved, String str2) throws IOException, JsonMappingException {
        for (cancelLoadInBackground<RunCallbackActionCompanion> cancelloadinbackgroundIAuthTabCallback = this._config.IAuthTabCallback(); cancelloadinbackgroundIAuthTabCallback != null; cancelloadinbackgroundIAuthTabCallback = cancelloadinbackgroundIAuthTabCallback.onWarmupCompleted()) {
            JavaType javaTypeOnNavigationEvent = cancelloadinbackgroundIAuthTabCallback.onNavigationEvent().onNavigationEvent(this, javaType, str, setcolumnorderpreserved, str2);
            if (javaTypeOnNavigationEvent != null) {
                if (javaTypeOnNavigationEvent.onNavigationEvent(Void.class)) {
                    return null;
                }
                if (javaTypeOnNavigationEvent.onWarmupCompleted(javaType.asBinder())) {
                    return javaTypeOnNavigationEvent;
                }
                throw onExtraCallbackWithResult(javaType, str, "problem handler tried to resolve into non-subtype: " + SavedStateHandleImplExternalSyntheticLambda0.IAuthTabCallback(javaTypeOnNavigationEvent));
            }
        }
        if (onWarmupCompleted(supportPostponeEnterTransition.FAIL_ON_INVALID_SUBTYPE)) {
            throw onExtraCallbackWithResult(javaType, str, str2);
        }
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.fasterxml.jackson.databind.JsonMappingException */
    public JavaType onExtraCallback(JavaType javaType, setColumnOrderPreserved setcolumnorderpreserved, String str) throws IOException, JsonMappingException {
        for (cancelLoadInBackground<RunCallbackActionCompanion> cancelloadinbackgroundIAuthTabCallback = this._config.IAuthTabCallback(); cancelloadinbackgroundIAuthTabCallback != null; cancelloadinbackgroundIAuthTabCallback = cancelloadinbackgroundIAuthTabCallback.onWarmupCompleted()) {
            JavaType javaTypeOnExtraCallbackWithResult = cancelloadinbackgroundIAuthTabCallback.onNavigationEvent().onExtraCallbackWithResult(this, javaType, setcolumnorderpreserved, str);
            if (javaTypeOnExtraCallbackWithResult != null) {
                if (javaTypeOnExtraCallbackWithResult.onNavigationEvent(Void.class)) {
                    return null;
                }
                if (javaTypeOnExtraCallbackWithResult.onWarmupCompleted(javaType.asBinder())) {
                    return javaTypeOnExtraCallbackWithResult;
                }
                throw onExtraCallbackWithResult(javaType, (String) null, "problem handler tried to resolve into non-subtype: " + SavedStateHandleImplExternalSyntheticLambda0.IAuthTabCallback(javaTypeOnExtraCallbackWithResult));
            }
        }
        throw IAuthTabCallback(javaType, str);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.fasterxml.jackson.databind.exc.InvalidDefinitionException */
    public void onNavigationEvent(FragmentActivityExternalSyntheticLambda1<?> fragmentActivityExternalSyntheticLambda1) throws InvalidDefinitionException, JsonMappingException {
        if (onWarmupCompleted(setLayoutTransition.IGNORE_MERGE_FOR_UNMERGEABLE)) {
            return;
        }
        JavaType javaTypeOnWarmupCompleted = onWarmupCompleted(fragmentActivityExternalSyntheticLambda1.IAuthTabCallback());
        throw InvalidDefinitionException.onExtraCallbackWithResult(getInterfaceDescriptor(), String.format("Invalid configuration: values of type %s cannot be merged", SavedStateHandleImplExternalSyntheticLambda0.IAuthTabCallback(javaTypeOnWarmupCompleted)), javaTypeOnWarmupCompleted);
    }

    protected boolean IAuthTabCallback(Class<?> cls, Object obj) {
        if (obj == null || cls.isInstance(obj)) {
            return true;
        }
        if (cls.isPrimitive()) {
            return ((Class) SavedStateHandleImplExternalSyntheticLambda0.onWarmupCompleted(-446576876, new Object[]{cls}, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), 446576880, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult())).isInstance(obj);
        }
        return false;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.fasterxml.jackson.databind.JsonMappingException */
    public void onExtraCallback(FragmentActivityExternalSyntheticLambda1<?> fragmentActivityExternalSyntheticLambda1, getTargetRequestCode gettargetrequestcode, String str, Object... objArr) throws JsonMappingException {
        throw IAuthTabCallback(getInterfaceDescriptor(), fragmentActivityExternalSyntheticLambda1.IAuthTabCallback(), gettargetrequestcode, onExtraCallbackWithResult(str, objArr));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.fasterxml.jackson.databind.JsonMappingException */
    public void onExtraCallback(JavaType javaType, getTargetRequestCode gettargetrequestcode, String str, Object... objArr) throws JsonMappingException {
        throw onExtraCallbackWithResult(getInterfaceDescriptor(), javaType, gettargetrequestcode, onExtraCallbackWithResult(str, objArr));
    }

    public void onExtraCallback(Class<?> cls, getTargetRequestCode gettargetrequestcode, String str, Object... objArr) throws JsonMappingException {
        throw IAuthTabCallback(getInterfaceDescriptor(), cls, gettargetrequestcode, onExtraCallbackWithResult(str, objArr));
    }

    public <T> T onWarmupCompleted(RenderQueueExternalSyntheticLambda0 renderQueueExternalSyntheticLambda0, Object obj) throws JsonMappingException {
        return (T) onExtraCallbackWithResult((validateRequestPermissionsRequestCode) renderQueueExternalSyntheticLambda0.idProperty, String.format("No Object Id found for an instance of %s, to assign to property '%s'", SavedStateHandleImplExternalSyntheticLambda0.onExtraCallbackWithResult(obj), renderQueueExternalSyntheticLambda0.propertyName), new Object[0]);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.fasterxml.jackson.databind.exc.MismatchedInputException */
    public <T> T onExtraCallback(FragmentActivityExternalSyntheticLambda1<?> fragmentActivityExternalSyntheticLambda1, String str, Object... objArr) throws MismatchedInputException, JsonMappingException {
        throw MismatchedInputException.onNavigationEvent(getInterfaceDescriptor(), fragmentActivityExternalSyntheticLambda1.IAuthTabCallback(), onExtraCallbackWithResult(str, objArr));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.fasterxml.jackson.databind.exc.MismatchedInputException */
    public <T> T onWarmupCompleted(Class<?> cls, String str, Object... objArr) throws MismatchedInputException, JsonMappingException {
        throw MismatchedInputException.onNavigationEvent(getInterfaceDescriptor(), cls, onExtraCallbackWithResult(str, objArr));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.fasterxml.jackson.databind.exc.MismatchedInputException */
    public <T> T onExtraCallbackWithResult(JavaType javaType, String str, Object... objArr) throws MismatchedInputException, JsonMappingException {
        throw MismatchedInputException.onWarmupCompleted(getInterfaceDescriptor(), javaType, onExtraCallbackWithResult(str, objArr));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.fasterxml.jackson.databind.exc.MismatchedInputException */
    public <T> T onExtraCallbackWithResult(validateRequestPermissionsRequestCode validaterequestpermissionsrequestcode, String str, Object... objArr) throws MismatchedInputException, JsonMappingException {
        nCreate ncreateOnExtraCallback;
        MismatchedInputException mismatchedInputExceptionOnWarmupCompleted = MismatchedInputException.onWarmupCompleted(getInterfaceDescriptor(), validaterequestpermissionsrequestcode == null ? null : validaterequestpermissionsrequestcode.IAuthTabCallback(), onExtraCallbackWithResult(str, objArr));
        if (validaterequestpermissionsrequestcode != null && (ncreateOnExtraCallback = validaterequestpermissionsrequestcode.onExtraCallback()) != null) {
            mismatchedInputExceptionOnWarmupCompleted.IAuthTabCallback(ncreateOnExtraCallback.onTransact(), validaterequestpermissionsrequestcode.onExtraCallbackWithResult());
            throw mismatchedInputExceptionOnWarmupCompleted;
        }
        throw mismatchedInputExceptionOnWarmupCompleted;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.fasterxml.jackson.databind.exc.MismatchedInputException */
    public <T> T onExtraCallbackWithResult(Class<?> cls, String str, String str2, Object... objArr) throws MismatchedInputException, JsonMappingException {
        MismatchedInputException mismatchedInputExceptionOnNavigationEvent = MismatchedInputException.onNavigationEvent(getInterfaceDescriptor(), cls, onExtraCallbackWithResult(str2, objArr));
        if (str != null) {
            mismatchedInputExceptionOnNavigationEvent.IAuthTabCallback(cls, str);
            throw mismatchedInputExceptionOnNavigationEvent;
        }
        throw mismatchedInputExceptionOnNavigationEvent;
    }

    public <T> T onNavigationEvent(JavaType javaType, String str, String str2, Object... objArr) throws JsonMappingException {
        return (T) onExtraCallbackWithResult(javaType.asBinder(), str, str2, objArr);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.fasterxml.jackson.databind.exc.InvalidFormatException */
    public <T> T onExtraCallback(FragmentActivityExternalSyntheticLambda1<?> fragmentActivityExternalSyntheticLambda1, Class<?> cls, Object obj, String str, Object... objArr) throws InvalidFormatException, JsonMappingException {
        throw InvalidFormatException.onExtraCallbackWithResult(getInterfaceDescriptor(), onExtraCallbackWithResult(str, objArr), obj, cls);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.fasterxml.jackson.databind.exc.MismatchedInputException */
    public <T> T onWarmupCompleted(Class<?> cls, getViewLifecycleOwner getviewlifecycleowner, getTargetRequestCode gettargetrequestcode) throws MismatchedInputException, JsonMappingException {
        throw MismatchedInputException.onNavigationEvent(getviewlifecycleowner, cls, String.format("Trailing token (of type %s) found after value (bound as %s): not allowed as per `DeserializationFeature.FAIL_ON_TRAILING_TOKENS`", gettargetrequestcode, SavedStateHandleImplExternalSyntheticLambda0.onActivityResized(cls)));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.fasterxml.jackson.databind.exc.InvalidDefinitionException */
    public <T> T onExtraCallbackWithResult(onStateNotSaved onstatenotsaved, String str, Object... objArr) throws InvalidDefinitionException, JsonMappingException {
        throw InvalidDefinitionException.onExtraCallback(this.onWarmupCompleted, String.format("Invalid type definition for type %s: %s", SavedStateHandleImplExternalSyntheticLambda0.onActivityResized(onstatenotsaved.getInterfaceDescriptor()), onExtraCallbackWithResult(str, objArr)), onstatenotsaved, (nSetBufferTransparency) null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.fasterxml.jackson.databind.exc.InvalidDefinitionException */
    public <T> T onNavigationEvent(onStateNotSaved onstatenotsaved, nSetBufferTransparency nsetbuffertransparency, String str, Object... objArr) throws InvalidDefinitionException, JsonMappingException {
        throw InvalidDefinitionException.onExtraCallback(this.onWarmupCompleted, String.format("Invalid definition for property %s (of type %s): %s", SavedStateHandleImplExternalSyntheticLambda0.onExtraCallbackWithResult(nsetbuffertransparency), SavedStateHandleImplExternalSyntheticLambda0.onActivityResized(onstatenotsaved.getInterfaceDescriptor()), onExtraCallbackWithResult(str, objArr)), onstatenotsaved, nsetbuffertransparency);
    }

    @Override // o.supportFinishAfterTransition
    public <T> T onWarmupCompleted(JavaType javaType, String str) throws JsonMappingException {
        throw InvalidDefinitionException.onExtraCallbackWithResult(this.onWarmupCompleted, str, javaType);
    }

    public JsonMappingException onExtraCallbackWithResult(getViewLifecycleOwner getviewlifecycleowner, JavaType javaType, getTargetRequestCode gettargetrequestcode, String str) {
        return MismatchedInputException.onWarmupCompleted(getviewlifecycleowner, javaType, onWarmupCompleted(String.format("Unexpected token (%s), expected %s", getviewlifecycleowner.asBinder(), gettargetrequestcode), str));
    }

    public JsonMappingException IAuthTabCallback(getViewLifecycleOwner getviewlifecycleowner, Class<?> cls, getTargetRequestCode gettargetrequestcode, String str) {
        return MismatchedInputException.onNavigationEvent(getviewlifecycleowner, cls, onWarmupCompleted(String.format("Unexpected token (%s), expected %s", getviewlifecycleowner.asBinder(), gettargetrequestcode), str));
    }

    public JsonMappingException onExtraCallbackWithResult(Class<?> cls, String str, String str2) {
        return InvalidFormatException.onExtraCallbackWithResult(this.onWarmupCompleted, String.format("Cannot deserialize Map key of type %s from String %s: %s", SavedStateHandleImplExternalSyntheticLambda0.onActivityResized(cls), onWarmupCompleted(str), str2), str, cls);
    }

    public JsonMappingException IAuthTabCallback(String str, Class<?> cls, String str2) {
        return InvalidFormatException.onExtraCallbackWithResult(this.onWarmupCompleted, String.format("Cannot deserialize value of type %s from String %s: %s", SavedStateHandleImplExternalSyntheticLambda0.onActivityResized(cls), onWarmupCompleted(str), str2), str, cls);
    }

    public JsonMappingException onNavigationEvent(Number number, Class<?> cls, String str) {
        return InvalidFormatException.onExtraCallbackWithResult(this.onWarmupCompleted, String.format("Cannot deserialize value of type %s from number %s: %s", SavedStateHandleImplExternalSyntheticLambda0.onActivityResized(cls), String.valueOf(number), str), number, cls);
    }

    public JsonMappingException onExtraCallback(Object obj, Class<?> cls) {
        return InvalidFormatException.onExtraCallbackWithResult(this.onWarmupCompleted, String.format("Cannot deserialize value of type %s from native value (`JsonToken.VALUE_EMBEDDED_OBJECT`) of type %s: incompatible types", SavedStateHandleImplExternalSyntheticLambda0.onActivityResized(cls), SavedStateHandleImplExternalSyntheticLambda0.onExtraCallbackWithResult(obj)), obj, cls);
    }

    public JsonMappingException onExtraCallback(Class<?> cls, Throwable th) {
        String strOnExtraCallback;
        if (th == null) {
            strOnExtraCallback = "N/A";
        } else {
            strOnExtraCallback = SavedStateHandleImplExternalSyntheticLambda0.onExtraCallback(th);
            if (strOnExtraCallback == null) {
                strOnExtraCallback = SavedStateHandleImplExternalSyntheticLambda0.onActivityResized(th.getClass());
            }
        }
        return ValueInstantiationException.IAuthTabCallback(this.onWarmupCompleted, String.format("Cannot construct instance of %s, problem: %s", SavedStateHandleImplExternalSyntheticLambda0.onActivityResized(cls), strOnExtraCallback), onWarmupCompleted(cls), th);
    }

    @Override // o.supportFinishAfterTransition
    public JsonMappingException onExtraCallbackWithResult(JavaType javaType, String str, String str2) {
        return InvalidTypeIdException.onExtraCallback(this.onWarmupCompleted, onWarmupCompleted(String.format("Could not resolve type id '%s' as a subtype of %s", str, SavedStateHandleImplExternalSyntheticLambda0.IAuthTabCallback(javaType)), str2), javaType, str);
    }

    public JsonMappingException IAuthTabCallback(JavaType javaType, String str) {
        return InvalidTypeIdException.onExtraCallback(this.onWarmupCompleted, onWarmupCompleted(String.format("Could not resolve subtype of %s", javaType), str), javaType, (String) null);
    }

    protected DateFormat IAuthTabCallback() {
        DateFormat dateFormat = this.IAuthTabCallback;
        if (dateFormat != null) {
            return dateFormat;
        }
        DateFormat dateFormat2 = (DateFormat) this._config.getInterfaceDescriptor().clone();
        this.IAuthTabCallback = dateFormat2;
        return dateFormat2;
    }

    protected String onExtraCallback(getTargetRequestCode gettargetrequestcode) {
        return getTargetRequestCode.valueDescFor(gettargetrequestcode);
    }
}
