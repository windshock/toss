package o;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.exc.InvalidTypeIdException;
import com.fasterxml.jackson.databind.ser.ResolvableSerializer;
import com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap;
import im.toss.features.benefit.ui.BenefitItemAdapter$;
import java.io.IOException;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class FragmentManagerExternalSyntheticLambda1 extends supportFinishAfterTransition {
    public static final FragmentFactory<Object> onNavigationEvent = new onActive("Null key for a Map not allowed in JSON (use a converting NullKeySerializer?)");
    protected static final FragmentFactory<Object> onWarmupCompleted = new ReflectiveGenericLifecycleObserver();
    protected DateFormat IAuthTabCallback;
    protected final Class<?> IAuthTabCallbackDefault;
    protected final ReadOnlyClassToSerializerMap IAuthTabCallbackStub;
    protected final considerNotify IAuthTabCallbackStubProxy;
    protected final getVersion IAuthTabCallback_Parcel;
    protected FragmentFactory<Object> access000;
    protected final boolean access100;
    protected FragmentFactory<Object> asBinder;
    protected FragmentFactory<Object> asInterface;
    protected transient RetainInstanceUsageViolation onExtraCallback;
    public final findFragmentByTag onExtraCallbackWithResult;
    protected FragmentFactory<Object> onTransact;

    public abstract Object IAuthTabCallback(nSetBufferTransparency nsetbuffertransparency, Class<?> cls) throws JsonMappingException;

    public getView IAuthTabCallbackStub() {
        return null;
    }

    public abstract RepeatOnLifecycleKtrepeatOnLifecycle3111111 onExtraCallbackWithResult(Object obj, getParentFragmentManager<?> getparentfragmentmanager);

    public abstract FragmentFactory<Object> onNavigationEvent(internalPathIteratorPeek internalpathiteratorpeek, Object obj) throws JsonMappingException;

    public abstract boolean onNavigationEvent(Object obj) throws JsonMappingException;

    public FragmentManagerExternalSyntheticLambda1() {
        this.access000 = onWarmupCompleted;
        this.asInterface = TransformationsExternalSyntheticLambda4.onExtraCallbackWithResult;
        this.asBinder = onNavigationEvent;
        this.onExtraCallbackWithResult = null;
        this.IAuthTabCallback_Parcel = null;
        this.IAuthTabCallbackStubProxy = new considerNotify();
        this.IAuthTabCallbackStub = null;
        this.IAuthTabCallbackDefault = null;
        this.onExtraCallback = null;
        this.access100 = true;
    }

    public FragmentManagerExternalSyntheticLambda1(FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1, findFragmentByTag findfragmentbytag, getVersion getversion) {
        this.access000 = onWarmupCompleted;
        this.asInterface = TransformationsExternalSyntheticLambda4.onExtraCallbackWithResult;
        FragmentFactory<Object> fragmentFactory = onNavigationEvent;
        this.asBinder = fragmentFactory;
        this.IAuthTabCallback_Parcel = getversion;
        this.onExtraCallbackWithResult = findfragmentbytag;
        considerNotify considernotify = fragmentManagerExternalSyntheticLambda1.IAuthTabCallbackStubProxy;
        this.IAuthTabCallbackStubProxy = considernotify;
        this.access000 = fragmentManagerExternalSyntheticLambda1.access000;
        this.onTransact = fragmentManagerExternalSyntheticLambda1.onTransact;
        FragmentFactory<Object> fragmentFactory2 = fragmentManagerExternalSyntheticLambda1.asInterface;
        this.asInterface = fragmentFactory2;
        this.asBinder = fragmentManagerExternalSyntheticLambda1.asBinder;
        this.access100 = fragmentFactory2 == fragmentFactory;
        this.IAuthTabCallbackDefault = findfragmentbytag.onMinimized();
        this.onExtraCallback = findfragmentbytag.onPostMessage();
        this.IAuthTabCallbackStub = considernotify.onNavigationEvent();
    }

    protected FragmentManagerExternalSyntheticLambda1(FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1) {
        this.access000 = onWarmupCompleted;
        this.asInterface = TransformationsExternalSyntheticLambda4.onExtraCallbackWithResult;
        this.asBinder = onNavigationEvent;
        this.onExtraCallbackWithResult = null;
        this.IAuthTabCallbackDefault = null;
        this.IAuthTabCallback_Parcel = null;
        this.IAuthTabCallbackStub = null;
        this.IAuthTabCallbackStubProxy = new considerNotify();
        this.access000 = fragmentManagerExternalSyntheticLambda1.access000;
        this.onTransact = fragmentManagerExternalSyntheticLambda1.onTransact;
        this.asInterface = fragmentManagerExternalSyntheticLambda1.asInterface;
        this.asBinder = fragmentManagerExternalSyntheticLambda1.asBinder;
        this.access100 = fragmentManagerExternalSyntheticLambda1.access100;
    }

    protected FragmentManagerExternalSyntheticLambda1(FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1, considerNotify considernotify) {
        this.access000 = onWarmupCompleted;
        this.asInterface = TransformationsExternalSyntheticLambda4.onExtraCallbackWithResult;
        this.asBinder = onNavigationEvent;
        this.IAuthTabCallbackStubProxy = considernotify;
        this.onExtraCallbackWithResult = fragmentManagerExternalSyntheticLambda1.onExtraCallbackWithResult;
        this.IAuthTabCallbackDefault = fragmentManagerExternalSyntheticLambda1.IAuthTabCallbackDefault;
        this.IAuthTabCallback_Parcel = fragmentManagerExternalSyntheticLambda1.IAuthTabCallback_Parcel;
        this.onExtraCallback = fragmentManagerExternalSyntheticLambda1.onExtraCallback;
        this.IAuthTabCallbackStub = fragmentManagerExternalSyntheticLambda1.IAuthTabCallbackStub;
        this.access000 = fragmentManagerExternalSyntheticLambda1.access000;
        this.asInterface = fragmentManagerExternalSyntheticLambda1.asInterface;
        this.asBinder = fragmentManagerExternalSyntheticLambda1.asBinder;
        this.onTransact = fragmentManagerExternalSyntheticLambda1.onTransact;
        this.access100 = fragmentManagerExternalSyntheticLambda1.access100;
    }

    @Override // o.supportFinishAfterTransition
    /* renamed from: onTransact, reason: merged with bridge method [inline-methods] */
    public final findFragmentByTag onNavigationEvent() {
        return this.onExtraCallbackWithResult;
    }

    public final startActivityFromFragment asInterface() {
        return this.onExtraCallbackWithResult.asBinder();
    }

    @Override // o.supportFinishAfterTransition
    public final LifecycleEffectKtExternalSyntheticLambda4 onExtraCallback() {
        return this.onExtraCallbackWithResult.extraCallback();
    }

    public JavaType onWarmupCompleted(JavaType javaType, Class<?> cls) throws IllegalArgumentException {
        return javaType.onNavigationEvent(cls) ? javaType : onNavigationEvent().extraCallback().onWarmupCompleted(javaType, cls, true);
    }

    public final Class<?> onWarmupCompleted() {
        return this.IAuthTabCallbackDefault;
    }

    public final boolean onExtraCallbackWithResult() {
        return this.onExtraCallbackWithResult.asInterface();
    }

    public final boolean onExtraCallbackWithResult(setLayoutTransition setlayouttransition) {
        return this.onExtraCallbackWithResult.onExtraCallback(setlayouttransition);
    }

    public final boolean onExtraCallback(RadioButtonKtRadioButton3 radioButtonKtRadioButton3) {
        return this.onExtraCallbackWithResult.onExtraCallbackWithResult(radioButtonKtRadioButton3);
    }

    public final registerOnPreAttachListener$onExtraCallback onExtraCallbackWithResult(Class<?> cls) {
        return this.onExtraCallbackWithResult.onNavigationEvent(cls);
    }

    public final dump$onWarmupCompleted onExtraCallback(Class<?> cls) {
        return this.onExtraCallbackWithResult.onExtraCallback(cls);
    }

    public Locale getInterfaceDescriptor() {
        return this.onExtraCallbackWithResult.access100();
    }

    public TimeZone access000() {
        return this.onExtraCallbackWithResult.extraCallbackWithResult();
    }

    public Object onExtraCallbackWithResult(Object obj) {
        return this.onExtraCallback.onExtraCallbackWithResult(obj);
    }

    public FragmentManagerExternalSyntheticLambda1 onWarmupCompleted(Object obj, Object obj2) {
        this.onExtraCallback = this.onExtraCallback.onWarmupCompleted(obj, obj2);
        return this;
    }

    public final boolean IAuthTabCallback(FragmentManagerExternalSyntheticLambda2 fragmentManagerExternalSyntheticLambda2) {
        return this.onExtraCallbackWithResult.onExtraCallbackWithResult(fragmentManagerExternalSyntheticLambda2);
    }

    public final LifecycleKteventFlow1ExternalSyntheticLambda1 IAuthTabCallbackDefault() {
        return this.onExtraCallbackWithResult.IAuthTabCallback();
    }

    public waitForLoader onWarmupCompleted(getViewLifecycleOwnerLiveData getviewlifecycleownerlivedata) {
        return new waitForLoader(getviewlifecycleownerlivedata, false);
    }

    public FragmentFactory<Object> onNavigationEvent(Class<?> cls, validateRequestPermissionsRequestCode validaterequestpermissionsrequestcode) throws JsonMappingException {
        FragmentFactory<Object> fragmentFactoryOnExtraCallback = this.IAuthTabCallbackStub.onExtraCallback(cls);
        if (fragmentFactoryOnExtraCallback == null && (fragmentFactoryOnExtraCallback = this.IAuthTabCallbackStubProxy.onExtraCallback(cls)) == null && (fragmentFactoryOnExtraCallback = this.IAuthTabCallbackStubProxy.IAuthTabCallback(this.onExtraCallbackWithResult.IAuthTabCallback(cls))) == null && (fragmentFactoryOnExtraCallback = onWarmupCompleted(cls)) == null) {
            return IAuthTabCallback(cls);
        }
        return onExtraCallback((FragmentFactory<?>) fragmentFactoryOnExtraCallback, validaterequestpermissionsrequestcode);
    }

    public FragmentFactory<Object> IAuthTabCallback(JavaType javaType, validateRequestPermissionsRequestCode validaterequestpermissionsrequestcode) throws JsonMappingException {
        if (javaType == null) {
            IAuthTabCallback("Null passed for `valueType` of `findValueSerializer()`", new Object[0]);
        }
        FragmentFactory<Object> fragmentFactoryOnExtraCallback = this.IAuthTabCallbackStub.onExtraCallback(javaType);
        if (fragmentFactoryOnExtraCallback == null && (fragmentFactoryOnExtraCallback = this.IAuthTabCallbackStubProxy.IAuthTabCallback(javaType)) == null && (fragmentFactoryOnExtraCallback = onNavigationEvent(javaType)) == null) {
            return IAuthTabCallback(javaType.asBinder());
        }
        return onExtraCallback((FragmentFactory<?>) fragmentFactoryOnExtraCallback, validaterequestpermissionsrequestcode);
    }

    public FragmentFactory<Object> onNavigationEvent(Class<?> cls) throws JsonMappingException {
        FragmentFactory<Object> fragmentFactoryOnExtraCallback = this.IAuthTabCallbackStub.onExtraCallback(cls);
        return (fragmentFactoryOnExtraCallback == null && (fragmentFactoryOnExtraCallback = this.IAuthTabCallbackStubProxy.onExtraCallback(cls)) == null && (fragmentFactoryOnExtraCallback = this.IAuthTabCallbackStubProxy.IAuthTabCallback(this.onExtraCallbackWithResult.IAuthTabCallback(cls))) == null && (fragmentFactoryOnExtraCallback = onWarmupCompleted(cls)) == null) ? IAuthTabCallback(cls) : fragmentFactoryOnExtraCallback;
    }

    public FragmentFactory<Object> IAuthTabCallback(JavaType javaType) throws JsonMappingException {
        FragmentFactory<Object> fragmentFactoryOnExtraCallback = this.IAuthTabCallbackStub.onExtraCallback(javaType);
        return (fragmentFactoryOnExtraCallback == null && (fragmentFactoryOnExtraCallback = this.IAuthTabCallbackStubProxy.IAuthTabCallback(javaType)) == null && (fragmentFactoryOnExtraCallback = onNavigationEvent(javaType)) == null) ? IAuthTabCallback(javaType.asBinder()) : fragmentFactoryOnExtraCallback;
    }

    public FragmentFactory<Object> onWarmupCompleted(JavaType javaType, validateRequestPermissionsRequestCode validaterequestpermissionsrequestcode) throws JsonMappingException {
        FragmentFactory<Object> fragmentFactoryOnExtraCallback = this.IAuthTabCallbackStub.onExtraCallback(javaType);
        if (fragmentFactoryOnExtraCallback == null && (fragmentFactoryOnExtraCallback = this.IAuthTabCallbackStubProxy.IAuthTabCallback(javaType)) == null && (fragmentFactoryOnExtraCallback = onNavigationEvent(javaType)) == null) {
            return IAuthTabCallback(javaType.asBinder());
        }
        return onExtraCallbackWithResult((FragmentFactory<?>) fragmentFactoryOnExtraCallback, validaterequestpermissionsrequestcode);
    }

    public FragmentFactory<Object> onWarmupCompleted(Class<?> cls, validateRequestPermissionsRequestCode validaterequestpermissionsrequestcode) throws JsonMappingException {
        FragmentFactory<Object> fragmentFactoryOnExtraCallback = this.IAuthTabCallbackStub.onExtraCallback(cls);
        if (fragmentFactoryOnExtraCallback == null && (fragmentFactoryOnExtraCallback = this.IAuthTabCallbackStubProxy.onExtraCallback(cls)) == null && (fragmentFactoryOnExtraCallback = this.IAuthTabCallbackStubProxy.IAuthTabCallback(this.onExtraCallbackWithResult.IAuthTabCallback(cls))) == null && (fragmentFactoryOnExtraCallback = onWarmupCompleted(cls)) == null) {
            return IAuthTabCallback(cls);
        }
        return onExtraCallbackWithResult((FragmentFactory<?>) fragmentFactoryOnExtraCallback, validaterequestpermissionsrequestcode);
    }

    public FragmentFactory<Object> onNavigationEvent(JavaType javaType, validateRequestPermissionsRequestCode validaterequestpermissionsrequestcode) throws JsonMappingException {
        FragmentFactory<Object> fragmentFactoryOnExtraCallback = this.IAuthTabCallbackStub.onExtraCallback(javaType);
        if (fragmentFactoryOnExtraCallback == null && (fragmentFactoryOnExtraCallback = this.IAuthTabCallbackStubProxy.IAuthTabCallback(javaType)) == null && (fragmentFactoryOnExtraCallback = onNavigationEvent(javaType)) == null) {
            return IAuthTabCallback(javaType.asBinder());
        }
        return onExtraCallback((FragmentFactory<?>) fragmentFactoryOnExtraCallback, validaterequestpermissionsrequestcode);
    }

    public FragmentFactory<Object> onExtraCallback(Class<?> cls, validateRequestPermissionsRequestCode validaterequestpermissionsrequestcode) throws JsonMappingException {
        FragmentFactory<Object> fragmentFactoryOnExtraCallback = this.IAuthTabCallbackStub.onExtraCallback(cls);
        if (fragmentFactoryOnExtraCallback == null && (fragmentFactoryOnExtraCallback = this.IAuthTabCallbackStubProxy.onExtraCallback(cls)) == null && (fragmentFactoryOnExtraCallback = this.IAuthTabCallbackStubProxy.IAuthTabCallback(this.onExtraCallbackWithResult.IAuthTabCallback(cls))) == null && (fragmentFactoryOnExtraCallback = onWarmupCompleted(cls)) == null) {
            return IAuthTabCallback(cls);
        }
        return onExtraCallback((FragmentFactory<?>) fragmentFactoryOnExtraCallback, validaterequestpermissionsrequestcode);
    }

    public FragmentFactory<Object> IAuthTabCallback(Class<?> cls, boolean z, validateRequestPermissionsRequestCode validaterequestpermissionsrequestcode) throws JsonMappingException {
        FragmentFactory<Object> fragmentFactoryOnExtraCallbackWithResult = this.IAuthTabCallbackStub.onExtraCallbackWithResult(cls);
        if (fragmentFactoryOnExtraCallbackWithResult != null) {
            return fragmentFactoryOnExtraCallbackWithResult;
        }
        FragmentFactory<Object> fragmentFactoryOnNavigationEvent = this.IAuthTabCallbackStubProxy.onNavigationEvent(cls);
        if (fragmentFactoryOnNavigationEvent != null) {
            return fragmentFactoryOnNavigationEvent;
        }
        FragmentFactory<Object> fragmentFactoryOnNavigationEvent2 = onNavigationEvent(cls, validaterequestpermissionsrequestcode);
        getVersion getversion = this.IAuthTabCallback_Parcel;
        findFragmentByTag findfragmentbytag = this.onExtraCallbackWithResult;
        GridLayout gridLayoutOnNavigationEvent = getversion.onNavigationEvent(findfragmentbytag, findfragmentbytag.IAuthTabCallback(cls));
        if (gridLayoutOnNavigationEvent != null) {
            fragmentFactoryOnNavigationEvent2 = new RepeatOnLifecycleKtrepeatOnLifecycle31<>(gridLayoutOnNavigationEvent.onWarmupCompleted(validaterequestpermissionsrequestcode), fragmentFactoryOnNavigationEvent2);
        }
        if (z) {
            this.IAuthTabCallbackStubProxy.onExtraCallbackWithResult(cls, fragmentFactoryOnNavigationEvent2);
        }
        return fragmentFactoryOnNavigationEvent2;
    }

    public FragmentFactory<Object> onExtraCallback(JavaType javaType, boolean z, validateRequestPermissionsRequestCode validaterequestpermissionsrequestcode) throws JsonMappingException {
        FragmentFactory<Object> fragmentFactoryOnExtraCallbackWithResult = this.IAuthTabCallbackStub.onExtraCallbackWithResult(javaType);
        if (fragmentFactoryOnExtraCallbackWithResult != null) {
            return fragmentFactoryOnExtraCallbackWithResult;
        }
        FragmentFactory<Object> fragmentFactoryOnWarmupCompleted = this.IAuthTabCallbackStubProxy.onWarmupCompleted(javaType);
        if (fragmentFactoryOnWarmupCompleted != null) {
            return fragmentFactoryOnWarmupCompleted;
        }
        FragmentFactory<Object> fragmentFactoryIAuthTabCallback = IAuthTabCallback(javaType, validaterequestpermissionsrequestcode);
        GridLayout gridLayoutOnNavigationEvent = this.IAuthTabCallback_Parcel.onNavigationEvent(this.onExtraCallbackWithResult, javaType);
        if (gridLayoutOnNavigationEvent != null) {
            fragmentFactoryIAuthTabCallback = new RepeatOnLifecycleKtrepeatOnLifecycle31<>(gridLayoutOnNavigationEvent.onWarmupCompleted(validaterequestpermissionsrequestcode), fragmentFactoryIAuthTabCallback);
        }
        if (z) {
            this.IAuthTabCallbackStubProxy.IAuthTabCallback(javaType, fragmentFactoryIAuthTabCallback);
        }
        return fragmentFactoryIAuthTabCallback;
    }

    public FragmentFactory<Object> onExtraCallback(JavaType javaType, validateRequestPermissionsRequestCode validaterequestpermissionsrequestcode) throws JsonMappingException {
        return onNavigationEvent((FragmentFactory<?>) this.IAuthTabCallback_Parcel.onExtraCallback(this, javaType, this.onTransact), validaterequestpermissionsrequestcode);
    }

    public FragmentFactory<Object> onExtraCallbackWithResult(Class<?> cls, validateRequestPermissionsRequestCode validaterequestpermissionsrequestcode) throws JsonMappingException {
        return onExtraCallback(this.onExtraCallbackWithResult.IAuthTabCallback(cls), validaterequestpermissionsrequestcode);
    }

    public FragmentFactory<Object> asBinder() {
        return this.asInterface;
    }

    public FragmentFactory<Object> onExtraCallbackWithResult(JavaType javaType, validateRequestPermissionsRequestCode validaterequestpermissionsrequestcode) throws JsonMappingException {
        return this.asBinder;
    }

    public FragmentFactory<Object> onNavigationEvent(validateRequestPermissionsRequestCode validaterequestpermissionsrequestcode) throws JsonMappingException {
        return this.asInterface;
    }

    public FragmentFactory<Object> IAuthTabCallback(Class<?> cls) {
        if (cls == Object.class) {
            return this.access000;
        }
        return new ReflectiveGenericLifecycleObserver(cls);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FragmentFactory<?> onExtraCallbackWithResult(FragmentFactory<?> fragmentFactory, validateRequestPermissionsRequestCode validaterequestpermissionsrequestcode) throws JsonMappingException {
        return (fragmentFactory == 0 || !(fragmentFactory instanceof assertMainThread)) ? fragmentFactory : ((assertMainThread) fragmentFactory).onExtraCallbackWithResult(this, validaterequestpermissionsrequestcode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FragmentFactory<?> onExtraCallback(FragmentFactory<?> fragmentFactory, validateRequestPermissionsRequestCode validaterequestpermissionsrequestcode) throws JsonMappingException {
        return (fragmentFactory == 0 || !(fragmentFactory instanceof assertMainThread)) ? fragmentFactory : ((assertMainThread) fragmentFactory).onExtraCallbackWithResult(this, validaterequestpermissionsrequestcode);
    }

    public final void onExtraCallbackWithResult(Object obj, getView getview) throws IOException {
        if (obj == null) {
            if (this.access100) {
                getview.IAuthTabCallbackStubProxy();
                return;
            } else {
                this.asInterface.onExtraCallback(null, getview, this);
                return;
            }
        }
        IAuthTabCallback(obj.getClass(), true, (validateRequestPermissionsRequestCode) null).onExtraCallback(obj, getview, this);
    }

    public final void onExtraCallback(Date date, getView getview) throws IOException {
        if (IAuthTabCallback(FragmentManagerExternalSyntheticLambda2.WRITE_DATES_AS_TIMESTAMPS)) {
            getview.onExtraCallback(date.getTime());
        } else {
            getview.asBinder(IAuthTabCallback().format(date));
        }
    }

    public void onExtraCallback(long j, getView getview) throws IOException {
        if (IAuthTabCallback(FragmentManagerExternalSyntheticLambda2.WRITE_DATE_KEYS_AS_TIMESTAMPS)) {
            getview.onExtraCallbackWithResult(String.valueOf(j));
        } else {
            getview.onExtraCallbackWithResult(IAuthTabCallback().format(new Date(j)));
        }
    }

    public void IAuthTabCallback(Date date, getView getview) throws IOException {
        if (IAuthTabCallback(FragmentManagerExternalSyntheticLambda2.WRITE_DATE_KEYS_AS_TIMESTAMPS)) {
            getview.onExtraCallbackWithResult(String.valueOf(date.getTime()));
        } else {
            getview.onExtraCallbackWithResult(IAuthTabCallback().format(date));
        }
    }

    public final void onWarmupCompleted(getView getview) throws IOException {
        if (this.access100) {
            getview.IAuthTabCallbackStubProxy();
        } else {
            this.asInterface.onExtraCallback(null, getview, this);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.fasterxml.jackson.databind.JsonMappingException */
    public void IAuthTabCallback(String str, Object... objArr) throws JsonMappingException {
        throw onExtraCallback(str, objArr);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.fasterxml.jackson.databind.exc.InvalidDefinitionException */
    public <T> T onWarmupCompleted(onStateNotSaved onstatenotsaved, String str, Object... objArr) throws InvalidDefinitionException, JsonMappingException {
        throw InvalidDefinitionException.IAuthTabCallback(IAuthTabCallbackStub(), String.format("Invalid type definition for type %s: %s", onstatenotsaved == null ? "N/A" : SavedStateHandleImplExternalSyntheticLambda0.onActivityResized(onstatenotsaved.getInterfaceDescriptor()), onExtraCallbackWithResult(str, objArr)), onstatenotsaved, (nSetBufferTransparency) null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.fasterxml.jackson.databind.exc.InvalidDefinitionException */
    public <T> T onExtraCallbackWithResult(onStateNotSaved onstatenotsaved, nSetBufferTransparency nsetbuffertransparency, String str, Object... objArr) throws InvalidDefinitionException, JsonMappingException {
        String strOnWarmupCompleted;
        String strOnExtraCallbackWithResult = onExtraCallbackWithResult(str, objArr);
        String strOnActivityResized = "N/A";
        if (nsetbuffertransparency == null) {
            strOnWarmupCompleted = "N/A";
        } else {
            strOnWarmupCompleted = onWarmupCompleted(nsetbuffertransparency.onExtraCallbackWithResult());
        }
        if (onstatenotsaved != null) {
            strOnActivityResized = SavedStateHandleImplExternalSyntheticLambda0.onActivityResized(onstatenotsaved.getInterfaceDescriptor());
        }
        throw InvalidDefinitionException.IAuthTabCallback(IAuthTabCallbackStub(), String.format("Invalid definition for property %s (of type %s): %s", strOnWarmupCompleted, strOnActivityResized, strOnExtraCallbackWithResult), onstatenotsaved, nsetbuffertransparency);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.fasterxml.jackson.databind.exc.InvalidDefinitionException */
    @Override // o.supportFinishAfterTransition
    public <T> T onWarmupCompleted(JavaType javaType, String str) throws InvalidDefinitionException, JsonMappingException {
        throw InvalidDefinitionException.onWarmupCompleted(IAuthTabCallbackStub(), str, javaType);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.fasterxml.jackson.databind.JsonMappingException */
    public <T> T onNavigationEvent(Class<?> cls, String str, Throwable th) throws JsonMappingException {
        throw InvalidDefinitionException.onWarmupCompleted(IAuthTabCallbackStub(), str, onExtraCallbackWithResult((Type) cls)).IAuthTabCallback(th);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.fasterxml.jackson.databind.JsonMappingException */
    public void onExtraCallback(Throwable th, String str, Object... objArr) throws JsonMappingException {
        throw JsonMappingException.IAuthTabCallback(IAuthTabCallbackStub(), onExtraCallbackWithResult(str, objArr), th);
    }

    @Override // o.supportFinishAfterTransition
    public JsonMappingException onExtraCallbackWithResult(JavaType javaType, String str, String str2) {
        return InvalidTypeIdException.onExtraCallback((getViewLifecycleOwner) null, onWarmupCompleted(String.format("Could not resolve type id '%s' as a subtype of %s", str, SavedStateHandleImplExternalSyntheticLambda0.IAuthTabCallback(javaType)), str2), javaType, str);
    }

    @Deprecated
    public JsonMappingException onExtraCallback(String str, Object... objArr) {
        return JsonMappingException.onWarmupCompleted(IAuthTabCallbackStub(), onExtraCallbackWithResult(str, objArr));
    }

    public void onWarmupCompleted(Object obj, JavaType javaType) throws InvalidDefinitionException, IOException, JsonMappingException {
        if (javaType.ICustomTabsCallbackStub()) {
            if (((Class) SavedStateHandleImplExternalSyntheticLambda0.onWarmupCompleted(-446576876, new Object[]{javaType.asBinder()}, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), 446576880, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult())).isAssignableFrom(obj.getClass())) {
                return;
            }
        }
        onWarmupCompleted(javaType, String.format("Incompatible types: declared root type (%s) vs %s", javaType, SavedStateHandleImplExternalSyntheticLambda0.onExtraCallbackWithResult(obj)));
    }

    protected FragmentFactory<Object> onWarmupCompleted(Class<?> cls) throws InvalidDefinitionException, JsonMappingException {
        FragmentFactory<Object> fragmentFactoryOnExtraCallbackWithResult;
        JavaType javaTypeIAuthTabCallback = this.onExtraCallbackWithResult.IAuthTabCallback(cls);
        try {
            fragmentFactoryOnExtraCallbackWithResult = onExtraCallbackWithResult(javaTypeIAuthTabCallback);
        } catch (IllegalArgumentException e) {
            onWarmupCompleted(javaTypeIAuthTabCallback, SavedStateHandleImplExternalSyntheticLambda0.onExtraCallback(e));
            fragmentFactoryOnExtraCallbackWithResult = null;
        }
        if (fragmentFactoryOnExtraCallbackWithResult != null) {
            this.IAuthTabCallbackStubProxy.onExtraCallbackWithResult(cls, javaTypeIAuthTabCallback, fragmentFactoryOnExtraCallbackWithResult, this);
        }
        return fragmentFactoryOnExtraCallbackWithResult;
    }

    protected FragmentFactory<Object> onNavigationEvent(JavaType javaType) throws JsonMappingException {
        FragmentFactory<Object> fragmentFactoryOnExtraCallbackWithResult;
        try {
            fragmentFactoryOnExtraCallbackWithResult = onExtraCallbackWithResult(javaType);
        } catch (IllegalArgumentException e) {
            onExtraCallback(e, SavedStateHandleImplExternalSyntheticLambda0.onExtraCallback(e), new Object[0]);
            fragmentFactoryOnExtraCallbackWithResult = null;
        }
        if (fragmentFactoryOnExtraCallbackWithResult != null) {
            this.IAuthTabCallbackStubProxy.onExtraCallbackWithResult(javaType, fragmentFactoryOnExtraCallbackWithResult, this);
        }
        return fragmentFactoryOnExtraCallbackWithResult;
    }

    protected FragmentFactory<Object> onExtraCallbackWithResult(JavaType javaType) throws JsonMappingException {
        return this.IAuthTabCallback_Parcel.onExtraCallbackWithResult(this, javaType);
    }

    protected FragmentFactory<Object> onNavigationEvent(FragmentFactory<?> fragmentFactory, validateRequestPermissionsRequestCode validaterequestpermissionsrequestcode) throws JsonMappingException {
        if (fragmentFactory instanceof ResolvableSerializer) {
            ((ResolvableSerializer) fragmentFactory).onExtraCallbackWithResult(this);
        }
        return onExtraCallback(fragmentFactory, validaterequestpermissionsrequestcode);
    }

    public FragmentFactory<Object> onExtraCallback(FragmentFactory<?> fragmentFactory) throws JsonMappingException {
        if (fragmentFactory instanceof ResolvableSerializer) {
            ((ResolvableSerializer) fragmentFactory).onExtraCallbackWithResult(this);
        }
        return fragmentFactory;
    }

    protected final DateFormat IAuthTabCallback() {
        DateFormat dateFormat = this.IAuthTabCallback;
        if (dateFormat != null) {
            return dateFormat;
        }
        DateFormat dateFormat2 = (DateFormat) this.onExtraCallbackWithResult.getInterfaceDescriptor().clone();
        this.IAuthTabCallback = dateFormat2;
        return dateFormat2;
    }
}
