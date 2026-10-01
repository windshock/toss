package o;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Map;
import o.registerOnPreAttachListener;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class LifecycleEffectKtExternalSyntheticLambda14<T> extends FragmentFactory<T> implements Serializable {
    private static final Object onNavigationEvent = new Object();
    private static final long serialVersionUID = 1;
    public final Class<T> _handledType;

    protected static final boolean onExtraCallback(Object obj, Object obj2) {
        return (obj == null || obj2 == null) ? false : true;
    }

    @Override // o.FragmentFactory
    public abstract void onExtraCallback(T t, getView getview, FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1) throws IOException;

    public LifecycleEffectKtExternalSyntheticLambda14(Class<T> cls) {
        this._handledType = cls;
    }

    public LifecycleEffectKtExternalSyntheticLambda14(JavaType javaType) {
        this._handledType = (Class<T>) javaType.asBinder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LifecycleEffectKtExternalSyntheticLambda14(Class<?> cls, boolean z) {
        this._handledType = cls;
    }

    public LifecycleEffectKtExternalSyntheticLambda14(LifecycleEffectKtExternalSyntheticLambda14<?> lifecycleEffectKtExternalSyntheticLambda14) {
        this._handledType = (Class<T>) lifecycleEffectKtExternalSyntheticLambda14._handledType;
    }

    @Override // o.FragmentFactory
    public Class<T> onWarmupCompleted() {
        return this._handledType;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.fasterxml.jackson.databind.JsonMappingException */
    public void onWarmupCompleted(FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1, Throwable th, Object obj, String str) throws IOException, JsonMappingException {
        while ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        SavedStateHandleImplExternalSyntheticLambda0.IAuthTabCallback(th);
        boolean z = fragmentManagerExternalSyntheticLambda1 == null || fragmentManagerExternalSyntheticLambda1.IAuthTabCallback(FragmentManagerExternalSyntheticLambda2.WRAP_EXCEPTIONS);
        if (th instanceof IOException) {
            if (!z || !(th instanceof JacksonException)) {
                throw ((IOException) th);
            }
        } else if (!z) {
            SavedStateHandleImplExternalSyntheticLambda0.IAuthTabCallbackDefault(th);
        }
        throw JsonMappingException.onExtraCallback(th, obj, str);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.fasterxml.jackson.databind.JsonMappingException */
    public void IAuthTabCallback(FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1, Throwable th, Object obj, int i2) throws IOException, JsonMappingException {
        while ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        SavedStateHandleImplExternalSyntheticLambda0.IAuthTabCallback(th);
        boolean z = fragmentManagerExternalSyntheticLambda1 == null || fragmentManagerExternalSyntheticLambda1.IAuthTabCallback(FragmentManagerExternalSyntheticLambda2.WRAP_EXCEPTIONS);
        if (th instanceof IOException) {
            if (!z || !(th instanceof JacksonException)) {
                throw ((IOException) th);
            }
        } else if (!z) {
            SavedStateHandleImplExternalSyntheticLambda0.IAuthTabCallbackDefault(th);
        }
        throw JsonMappingException.onNavigationEvent(th, obj, i2);
    }

    public FragmentFactory<?> onWarmupCompleted(FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1, validateRequestPermissionsRequestCode validaterequestpermissionsrequestcode, FragmentFactory<?> fragmentFactory) throws JsonMappingException {
        Object obj = onNavigationEvent;
        Map identityHashMap = (Map) fragmentManagerExternalSyntheticLambda1.onExtraCallbackWithResult(obj);
        if (identityHashMap != null) {
            if (identityHashMap.get(validaterequestpermissionsrequestcode) != null) {
                return fragmentFactory;
            }
        } else {
            identityHashMap = new IdentityHashMap();
            fragmentManagerExternalSyntheticLambda1.onWarmupCompleted(obj, identityHashMap);
        }
        identityHashMap.put(validaterequestpermissionsrequestcode, Boolean.TRUE);
        try {
            FragmentFactory<?> fragmentFactoryIAuthTabCallback = IAuthTabCallback(fragmentManagerExternalSyntheticLambda1, validaterequestpermissionsrequestcode, fragmentFactory);
            return fragmentFactoryIAuthTabCallback != null ? fragmentManagerExternalSyntheticLambda1.onExtraCallback(fragmentFactoryIAuthTabCallback, validaterequestpermissionsrequestcode) : fragmentFactory;
        } finally {
            identityHashMap.remove(validaterequestpermissionsrequestcode);
        }
    }

    @Deprecated
    protected FragmentFactory<?> IAuthTabCallback(FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1, validateRequestPermissionsRequestCode validaterequestpermissionsrequestcode, FragmentFactory<?> fragmentFactory) throws JsonMappingException {
        nCreate ncreateOnExtraCallback;
        Object objAsBinder;
        startActivityFromFragment startactivityfromfragmentAsInterface = fragmentManagerExternalSyntheticLambda1.asInterface();
        if (!onExtraCallback(startactivityfromfragmentAsInterface, validaterequestpermissionsrequestcode) || (ncreateOnExtraCallback = validaterequestpermissionsrequestcode.onExtraCallback()) == null || (objAsBinder = startactivityfromfragmentAsInterface.asBinder(ncreateOnExtraCallback)) == null) {
            return fragmentFactory;
        }
        SavedStateHandleSaverKtExternalSyntheticLambda3<Object, Object> savedStateHandleSaverKtExternalSyntheticLambda3OnExtraCallback = fragmentManagerExternalSyntheticLambda1.onExtraCallback(validaterequestpermissionsrequestcode.onExtraCallback(), objAsBinder);
        JavaType javaTypeOnNavigationEvent = savedStateHandleSaverKtExternalSyntheticLambda3OnExtraCallback.onNavigationEvent(fragmentManagerExternalSyntheticLambda1.onExtraCallback());
        if (fragmentFactory == null && !javaTypeOnNavigationEvent.ICustomTabsCallbackDefault()) {
            fragmentFactory = fragmentManagerExternalSyntheticLambda1.IAuthTabCallback(javaTypeOnNavigationEvent);
        }
        return new DropUnlessLifecycleKtExternalSyntheticLambda0(savedStateHandleSaverKtExternalSyntheticLambda3OnExtraCallback, javaTypeOnNavigationEvent, fragmentFactory);
    }

    protected dispatchingValue onExtraCallback(FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1, Object obj, Object obj2) throws JsonMappingException {
        LifecycleKteventFlow1ExternalSyntheticLambda1 lifecycleKteventFlow1ExternalSyntheticLambda1IAuthTabCallbackDefault = fragmentManagerExternalSyntheticLambda1.IAuthTabCallbackDefault();
        if (lifecycleKteventFlow1ExternalSyntheticLambda1IAuthTabCallbackDefault == null) {
            return (dispatchingValue) fragmentManagerExternalSyntheticLambda1.onWarmupCompleted((Class<?>) onWarmupCompleted(), "Cannot resolve PropertyFilter with id '" + obj + "'; no FilterProvider configured");
        }
        return lifecycleKteventFlow1ExternalSyntheticLambda1IAuthTabCallbackDefault.IAuthTabCallback(obj, obj2);
    }

    protected registerOnPreAttachListener$onExtraCallback onWarmupCompleted(FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1, validateRequestPermissionsRequestCode validaterequestpermissionsrequestcode, Class<?> cls) {
        if (validaterequestpermissionsrequestcode != null) {
            return validaterequestpermissionsrequestcode.IAuthTabCallback(fragmentManagerExternalSyntheticLambda1.onNavigationEvent(), cls);
        }
        return fragmentManagerExternalSyntheticLambda1.onExtraCallbackWithResult(cls);
    }

    public Boolean IAuthTabCallback(FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1, validateRequestPermissionsRequestCode validaterequestpermissionsrequestcode, Class<?> cls, registerOnPreAttachListener.onExtraCallbackWithResult onextracallbackwithresult) {
        registerOnPreAttachListener$onExtraCallback registeronpreattachlistener_onextracallbackOnWarmupCompleted = onWarmupCompleted(fragmentManagerExternalSyntheticLambda1, validaterequestpermissionsrequestcode, cls);
        if (registeronpreattachlistener_onextracallbackOnWarmupCompleted != null) {
            return registeronpreattachlistener_onextracallbackOnWarmupCompleted.onWarmupCompleted(onextracallbackwithresult);
        }
        return null;
    }

    protected dump$onWarmupCompleted onExtraCallback(FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1, validateRequestPermissionsRequestCode validaterequestpermissionsrequestcode, Class<?> cls) {
        if (validaterequestpermissionsrequestcode != null) {
            return validaterequestpermissionsrequestcode.onExtraCallback(fragmentManagerExternalSyntheticLambda1.onNavigationEvent(), cls);
        }
        return fragmentManagerExternalSyntheticLambda1.onExtraCallback(cls);
    }

    public FragmentFactory<?> onExtraCallback(FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1, validateRequestPermissionsRequestCode validaterequestpermissionsrequestcode) throws JsonMappingException {
        Object objOnNavigationEvent;
        if (validaterequestpermissionsrequestcode == null) {
            return null;
        }
        nCreate ncreateOnExtraCallback = validaterequestpermissionsrequestcode.onExtraCallback();
        startActivityFromFragment startactivityfromfragmentAsInterface = fragmentManagerExternalSyntheticLambda1.asInterface();
        if (ncreateOnExtraCallback == null || (objOnNavigationEvent = startactivityfromfragmentAsInterface.onNavigationEvent((internalPathIteratorPeek) ncreateOnExtraCallback)) == null) {
            return null;
        }
        return fragmentManagerExternalSyntheticLambda1.onNavigationEvent(ncreateOnExtraCallback, objOnNavigationEvent);
    }

    public boolean IAuthTabCallback(FragmentFactory<?> fragmentFactory) {
        return SavedStateHandleImplExternalSyntheticLambda0.onExtraCallback(fragmentFactory);
    }

    protected static final boolean onExtraCallback(Collection<?> collection) {
        return (collection == null || collection.isEmpty()) ? false : true;
    }
}
