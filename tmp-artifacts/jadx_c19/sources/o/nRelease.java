package o;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.SimpleType;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import o.nSetCrop;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class nRelease extends nSetCrop implements Serializable {
    protected static final nSetBuffer IAuthTabCallback;
    protected static final nSetBuffer onExtraCallbackWithResult;
    protected static final nSetBuffer onNavigationEvent;
    protected static final nSetBuffer onWarmupCompleted;
    private static final long serialVersionUID = 2;
    private static final Class<?> IAuthTabCallbackStub = Object.class;
    private static final Class<?> IAuthTabCallbackDefault = String.class;
    private static final Class<?> asBinder = FragmentActivityExternalSyntheticLambda3.class;
    protected static final nSetBuffer onExtraCallback = nSetBuffer.onWarmupCompleted(null, SimpleType.onExtraCallback((Class<?>) String.class), RoundedCorner.onNavigationEvent(String.class));

    @Override // o.nSetCrop
    public /* synthetic */ onStateNotSaved onNavigationEvent(RadioButtonKtRadioButtonElement27 radioButtonKtRadioButtonElement27, JavaType javaType, nSetCrop.onWarmupCompleted onwarmupcompleted) {
        return onWarmupCompleted((RadioButtonKtRadioButtonElement27<?>) radioButtonKtRadioButtonElement27, javaType, onwarmupcompleted);
    }

    static {
        Class cls = Boolean.TYPE;
        onExtraCallbackWithResult = nSetBuffer.onWarmupCompleted(null, SimpleType.onExtraCallback((Class<?>) cls), RoundedCorner.onNavigationEvent(cls));
        Class cls2 = Integer.TYPE;
        onNavigationEvent = nSetBuffer.onWarmupCompleted(null, SimpleType.onExtraCallback((Class<?>) cls2), RoundedCorner.onNavigationEvent(cls2));
        Class cls3 = Long.TYPE;
        onWarmupCompleted = nSetBuffer.onWarmupCompleted(null, SimpleType.onExtraCallback((Class<?>) cls3), RoundedCorner.onNavigationEvent(cls3));
        IAuthTabCallback = nSetBuffer.onWarmupCompleted(null, SimpleType.onExtraCallback((Class<?>) Object.class), RoundedCorner.onNavigationEvent(Object.class));
    }

    @Override // o.nSetCrop
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public nSetBuffer onNavigationEvent(findFragmentByTag findfragmentbytag, JavaType javaType, nSetCrop.onWarmupCompleted onwarmupcompleted) {
        nSetBuffer nsetbufferIAuthTabCallback = IAuthTabCallback(findfragmentbytag, javaType);
        return (nsetbufferIAuthTabCallback == null && (nsetbufferIAuthTabCallback = onExtraCallbackWithResult(findfragmentbytag, javaType)) == null) ? nSetBuffer.onNavigationEvent(onExtraCallback((RadioButtonKtRadioButtonElement27<?>) findfragmentbytag, javaType, onwarmupcompleted, true)) : nsetbufferIAuthTabCallback;
    }

    @Override // o.nSetCrop
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public nSetBuffer onWarmupCompleted(startIntentSenderFromFragment startintentsenderfromfragment, JavaType javaType, nSetCrop.onWarmupCompleted onwarmupcompleted) {
        nSetBuffer nsetbufferIAuthTabCallback = IAuthTabCallback(startintentsenderfromfragment, javaType);
        return (nsetbufferIAuthTabCallback == null && (nsetbufferIAuthTabCallback = onExtraCallbackWithResult(startintentsenderfromfragment, javaType)) == null) ? nSetBuffer.IAuthTabCallback(onExtraCallback((RadioButtonKtRadioButtonElement27<?>) startintentsenderfromfragment, javaType, onwarmupcompleted, false)) : nsetbufferIAuthTabCallback;
    }

    @Override // o.nSetCrop
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public nSetBuffer IAuthTabCallback(startIntentSenderFromFragment startintentsenderfromfragment, JavaType javaType, nSetCrop.onWarmupCompleted onwarmupcompleted, onStateNotSaved onstatenotsaved) {
        return nSetBuffer.IAuthTabCallback(onExtraCallback(startintentsenderfromfragment, javaType, onwarmupcompleted, onstatenotsaved, false));
    }

    @Override // o.nSetCrop
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public nSetBuffer onExtraCallback(startIntentSenderFromFragment startintentsenderfromfragment, JavaType javaType, nSetCrop.onWarmupCompleted onwarmupcompleted) {
        nSetBuffer nsetbufferIAuthTabCallback = IAuthTabCallback(startintentsenderfromfragment, javaType);
        return (nsetbufferIAuthTabCallback == null && (nsetbufferIAuthTabCallback = onExtraCallbackWithResult(startintentsenderfromfragment, javaType)) == null) ? nSetBuffer.IAuthTabCallback(onExtraCallback((RadioButtonKtRadioButtonElement27<?>) startintentsenderfromfragment, javaType, onwarmupcompleted, false)) : nsetbufferIAuthTabCallback;
    }

    public nSetBuffer onWarmupCompleted(RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27, JavaType javaType, nSetCrop.onWarmupCompleted onwarmupcompleted) {
        nSetBuffer nsetbufferIAuthTabCallback = IAuthTabCallback(radioButtonKtRadioButtonElement27, javaType);
        return nsetbufferIAuthTabCallback == null ? nSetBuffer.onWarmupCompleted(radioButtonKtRadioButtonElement27, javaType, onExtraCallback(radioButtonKtRadioButtonElement27, javaType, onwarmupcompleted)) : nsetbufferIAuthTabCallback;
    }

    protected nSetZOrder onExtraCallback(RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27, JavaType javaType, nSetCrop.onWarmupCompleted onwarmupcompleted, boolean z) {
        internalPathIteratorSize internalpathiteratorsizeOnWarmupCompleted;
        AngleMeasurerExternalSyntheticLambda0 angleMeasurerExternalSyntheticLambda0OnExtraCallback = onExtraCallback(radioButtonKtRadioButtonElement27, javaType, onwarmupcompleted);
        if (javaType.ICustomTabsCallbackStubProxy()) {
            internalpathiteratorsizeOnWarmupCompleted = radioButtonKtRadioButtonElement27.IAuthTabCallbackStub().onNavigationEvent(radioButtonKtRadioButtonElement27, angleMeasurerExternalSyntheticLambda0OnExtraCallback);
        } else {
            internalpathiteratorsizeOnWarmupCompleted = radioButtonKtRadioButtonElement27.IAuthTabCallbackStub().onWarmupCompleted(radioButtonKtRadioButtonElement27, angleMeasurerExternalSyntheticLambda0OnExtraCallback);
        }
        return IAuthTabCallback(radioButtonKtRadioButtonElement27, angleMeasurerExternalSyntheticLambda0OnExtraCallback, javaType, z, internalpathiteratorsizeOnWarmupCompleted);
    }

    protected nSetZOrder onExtraCallback(RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27, JavaType javaType, nSetCrop.onWarmupCompleted onwarmupcompleted, onStateNotSaved onstatenotsaved, boolean z) {
        AngleMeasurerExternalSyntheticLambda0 angleMeasurerExternalSyntheticLambda0OnExtraCallback = onExtraCallback(radioButtonKtRadioButtonElement27, javaType, onwarmupcompleted);
        return IAuthTabCallback(radioButtonKtRadioButtonElement27, angleMeasurerExternalSyntheticLambda0OnExtraCallback, javaType, z, radioButtonKtRadioButtonElement27.IAuthTabCallbackStub().onNavigationEvent(radioButtonKtRadioButtonElement27, angleMeasurerExternalSyntheticLambda0OnExtraCallback, onstatenotsaved));
    }

    protected nSetZOrder IAuthTabCallback(RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27, AngleMeasurerExternalSyntheticLambda0 angleMeasurerExternalSyntheticLambda0, JavaType javaType, boolean z, internalPathIteratorSize internalpathiteratorsize) {
        return new nSetZOrder(radioButtonKtRadioButtonElement27, z, javaType, angleMeasurerExternalSyntheticLambda0, internalpathiteratorsize);
    }

    protected nSetBuffer IAuthTabCallback(RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27, JavaType javaType) {
        Class<?> clsAsBinder = javaType.asBinder();
        if (clsAsBinder.isPrimitive()) {
            if (clsAsBinder == Integer.TYPE) {
                return onNavigationEvent;
            }
            if (clsAsBinder == Long.TYPE) {
                return onWarmupCompleted;
            }
            if (clsAsBinder == Boolean.TYPE) {
                return onExtraCallbackWithResult;
            }
            return null;
        }
        if (SavedStateHandleImplExternalSyntheticLambda0.ICustomTabsCallback(clsAsBinder)) {
            if (clsAsBinder == IAuthTabCallbackStub) {
                return IAuthTabCallback;
            }
            if (clsAsBinder == IAuthTabCallbackDefault) {
                return onExtraCallback;
            }
            if (clsAsBinder == Integer.class) {
                return onNavigationEvent;
            }
            if (clsAsBinder == Long.class) {
                return onWarmupCompleted;
            }
            if (clsAsBinder == Boolean.class) {
                return onExtraCallbackWithResult;
            }
            return null;
        }
        if (asBinder.isAssignableFrom(clsAsBinder)) {
            return nSetBuffer.onWarmupCompleted(radioButtonKtRadioButtonElement27, javaType, RoundedCorner.onNavigationEvent(clsAsBinder));
        }
        return null;
    }

    protected boolean onExtraCallbackWithResult(JavaType javaType) {
        if (javaType.onPostMessage() && !javaType.ICustomTabsCallback()) {
            Class<?> clsAsBinder = javaType.asBinder();
            return SavedStateHandleImplExternalSyntheticLambda0.ICustomTabsCallback(clsAsBinder) && (Collection.class.isAssignableFrom(clsAsBinder) || Map.class.isAssignableFrom(clsAsBinder)) && clsAsBinder.toString().indexOf(36) <= 0;
        }
        return false;
    }

    protected nSetBuffer onExtraCallbackWithResult(RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27, JavaType javaType) {
        if (onExtraCallbackWithResult(javaType)) {
            return nSetBuffer.onWarmupCompleted(radioButtonKtRadioButtonElement27, javaType, onExtraCallback(radioButtonKtRadioButtonElement27, javaType, radioButtonKtRadioButtonElement27));
        }
        return null;
    }

    protected AngleMeasurerExternalSyntheticLambda0 onExtraCallback(RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27, JavaType javaType, nSetCrop.onWarmupCompleted onwarmupcompleted) {
        return RoundedCorner.onNavigationEvent(radioButtonKtRadioButtonElement27, javaType, onwarmupcompleted);
    }
}
