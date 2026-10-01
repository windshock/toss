package o;

import com.fasterxml.jackson.databind.JavaType;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.nSetCrop;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class RoundedCorner {
    private final boolean IAuthTabCallbackDefault;
    private final startActivityFromFragment IAuthTabCallbackStub;
    private final Class<?> IAuthTabCallbackStubProxy;
    private final nSetCrop.onWarmupCompleted IAuthTabCallback_Parcel;
    private final RadioButtonKtRadioButtonElement27<?> asBinder;
    private final Class<?> asInterface;
    private final JavaType getInterfaceDescriptor;
    private final LifecycleEffectKtExternalSyntheticLambda6 onTransact;
    private static final RememberLifecycleOwnerKtExternalSyntheticLambda0 IAuthTabCallback = nSetBufferAlpha.IAuthTabCallback();
    private static final Class<?> onWarmupCompleted = Object.class;
    private static final Class<?> onExtraCallback = Enum.class;
    private static final Class<?> onNavigationEvent = List.class;
    private static final Class<?> onExtraCallbackWithResult = Map.class;

    RoundedCorner(RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27, JavaType javaType, nSetCrop.onWarmupCompleted onwarmupcompleted) {
        this.asBinder = radioButtonKtRadioButtonElement27;
        this.getInterfaceDescriptor = javaType;
        Class<?> clsAsBinder = javaType.asBinder();
        this.asInterface = clsAsBinder;
        this.IAuthTabCallback_Parcel = onwarmupcompleted;
        this.onTransact = javaType.onWarmupCompleted();
        startActivityFromFragment startactivityfromfragmentAsBinder = radioButtonKtRadioButtonElement27.ICustomTabsCallback() ? radioButtonKtRadioButtonElement27.asBinder() : null;
        this.IAuthTabCallbackStub = startactivityfromfragmentAsBinder;
        this.IAuthTabCallbackStubProxy = onwarmupcompleted != null ? onwarmupcompleted.onTransact(clsAsBinder) : null;
        this.IAuthTabCallbackDefault = (startactivityfromfragmentAsBinder == null || (SavedStateHandleImplExternalSyntheticLambda0.ICustomTabsCallback(clsAsBinder) && javaType.onPostMessage())) ? false : true;
    }

    RoundedCorner(RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27, Class<?> cls, nSetCrop.onWarmupCompleted onwarmupcompleted) {
        this.asBinder = radioButtonKtRadioButtonElement27;
        this.getInterfaceDescriptor = null;
        this.asInterface = cls;
        this.IAuthTabCallback_Parcel = onwarmupcompleted;
        this.onTransact = LifecycleEffectKtExternalSyntheticLambda6.IAuthTabCallback();
        if (radioButtonKtRadioButtonElement27 == null) {
            this.IAuthTabCallbackStub = null;
            this.IAuthTabCallbackStubProxy = null;
        } else {
            this.IAuthTabCallbackStub = radioButtonKtRadioButtonElement27.ICustomTabsCallback() ? radioButtonKtRadioButtonElement27.asBinder() : null;
            this.IAuthTabCallbackStubProxy = onwarmupcompleted != null ? onwarmupcompleted.onTransact(cls) : null;
        }
        this.IAuthTabCallbackDefault = this.IAuthTabCallbackStub != null;
    }

    public static AngleMeasurerExternalSyntheticLambda0 onNavigationEvent(RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27, JavaType javaType, nSetCrop.onWarmupCompleted onwarmupcompleted) {
        if (javaType.ICustomTabsCallback() && onExtraCallback(radioButtonKtRadioButtonElement27, javaType.asBinder())) {
            return onNavigationEvent(radioButtonKtRadioButtonElement27, javaType.asBinder());
        }
        return new RoundedCorner(radioButtonKtRadioButtonElement27, javaType, onwarmupcompleted).onExtraCallback();
    }

    public static AngleMeasurerExternalSyntheticLambda0 IAuthTabCallback(RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27, Class<?> cls) {
        return onExtraCallbackWithResult(radioButtonKtRadioButtonElement27, cls, radioButtonKtRadioButtonElement27);
    }

    public static AngleMeasurerExternalSyntheticLambda0 onExtraCallbackWithResult(RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27, Class<?> cls, nSetCrop.onWarmupCompleted onwarmupcompleted) {
        if (cls.isArray() && onExtraCallback(radioButtonKtRadioButtonElement27, cls)) {
            return onNavigationEvent(radioButtonKtRadioButtonElement27, cls);
        }
        return new RoundedCorner(radioButtonKtRadioButtonElement27, cls, onwarmupcompleted).onNavigationEvent();
    }

    private static boolean onExtraCallback(RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27, Class<?> cls) {
        return radioButtonKtRadioButtonElement27 == null || radioButtonKtRadioButtonElement27.onTransact(cls) == null;
    }

    static AngleMeasurerExternalSyntheticLambda0 onNavigationEvent(Class<?> cls) {
        return new AngleMeasurerExternalSyntheticLambda0(cls);
    }

    static AngleMeasurerExternalSyntheticLambda0 onNavigationEvent(RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27, Class<?> cls) {
        return new AngleMeasurerExternalSyntheticLambda0(cls);
    }

    AngleMeasurerExternalSyntheticLambda0 onExtraCallback() {
        ArrayList arrayList = new ArrayList(8);
        if (!this.getInterfaceDescriptor.onNavigationEvent(Object.class)) {
            if (this.getInterfaceDescriptor.onRelationshipValidationResult()) {
                IAuthTabCallback(this.getInterfaceDescriptor, arrayList, false);
            } else {
                onNavigationEvent(this.getInterfaceDescriptor, (List<JavaType>) arrayList, false);
            }
        }
        return new AngleMeasurerExternalSyntheticLambda0(this.getInterfaceDescriptor, this.asInterface, arrayList, this.IAuthTabCallbackStubProxy, IAuthTabCallback(arrayList), this.onTransact, this.IAuthTabCallbackStub, this.IAuthTabCallback_Parcel, this.asBinder.extraCallback(), this.IAuthTabCallbackDefault);
    }

    AngleMeasurerExternalSyntheticLambda0 onNavigationEvent() {
        List<JavaType> list = Collections.EMPTY_LIST;
        return new AngleMeasurerExternalSyntheticLambda0(null, this.asInterface, list, this.IAuthTabCallbackStubProxy, IAuthTabCallback(list), this.onTransact, this.IAuthTabCallbackStub, this.IAuthTabCallback_Parcel, this.asBinder.extraCallback(), this.IAuthTabCallbackDefault);
    }

    private static void onNavigationEvent(JavaType javaType, List<JavaType> list, boolean z) {
        Class<?> clsAsBinder = javaType.asBinder();
        if (clsAsBinder == onWarmupCompleted || clsAsBinder == onExtraCallback) {
            return;
        }
        if (z) {
            if (IAuthTabCallback(list, clsAsBinder)) {
                return;
            } else {
                list.add(javaType);
            }
        }
        Iterator<JavaType> it = javaType.IAuthTabCallbackDefault().iterator();
        while (it.hasNext()) {
            IAuthTabCallback(it.next(), list, true);
        }
        JavaType javaTypeIAuthTabCallbackStubProxy = javaType.IAuthTabCallbackStubProxy();
        if (javaTypeIAuthTabCallbackStubProxy != null) {
            onNavigationEvent(javaTypeIAuthTabCallbackStubProxy, list, true);
        }
    }

    private static void IAuthTabCallback(JavaType javaType, List<JavaType> list, boolean z) {
        Class<?> clsAsBinder = javaType.asBinder();
        if (z) {
            if (IAuthTabCallback(list, clsAsBinder)) {
                return;
            }
            list.add(javaType);
            if (clsAsBinder == onNavigationEvent || clsAsBinder == onExtraCallbackWithResult) {
                return;
            }
        }
        Iterator<JavaType> it = javaType.IAuthTabCallbackDefault().iterator();
        while (it.hasNext()) {
            IAuthTabCallback(it.next(), list, true);
        }
    }

    private static boolean IAuthTabCallback(List<JavaType> list, Class<?> cls) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (list.get(i2).asBinder() == cls) {
                return true;
            }
        }
        return false;
    }

    private RememberLifecycleOwnerKtExternalSyntheticLambda0 IAuthTabCallback(List<JavaType> list) {
        if (this.IAuthTabCallbackStub == null) {
            return IAuthTabCallback;
        }
        nSetCrop.onWarmupCompleted onwarmupcompleted = this.IAuthTabCallback_Parcel;
        boolean z = onwarmupcompleted != null && (!(onwarmupcompleted instanceof SurfaceControlCompatTransactionCommittedListener) || ((SurfaceControlCompatTransactionCommittedListener) onwarmupcompleted).onWarmupCompleted());
        if (!z && !this.IAuthTabCallbackDefault) {
            return IAuthTabCallback;
        }
        nSetBufferAlpha nsetbufferalphaOnExtraCallback = nSetBufferAlpha.onExtraCallback();
        Class<?> cls = this.IAuthTabCallbackStubProxy;
        if (cls != null) {
            nsetbufferalphaOnExtraCallback = onNavigationEvent(nsetbufferalphaOnExtraCallback, this.asInterface, cls);
        }
        if (this.IAuthTabCallbackDefault) {
            nsetbufferalphaOnExtraCallback = onNavigationEvent(nsetbufferalphaOnExtraCallback, SavedStateHandleImplExternalSyntheticLambda0.IAuthTabCallback(this.asInterface));
        }
        for (JavaType javaType : list) {
            if (z) {
                Class<?> clsAsBinder = javaType.asBinder();
                nsetbufferalphaOnExtraCallback = onNavigationEvent(nsetbufferalphaOnExtraCallback, clsAsBinder, this.IAuthTabCallback_Parcel.onTransact(clsAsBinder));
            }
            if (this.IAuthTabCallbackDefault) {
                nsetbufferalphaOnExtraCallback = onNavigationEvent(nsetbufferalphaOnExtraCallback, SavedStateHandleImplExternalSyntheticLambda0.IAuthTabCallback(javaType.asBinder()));
            }
        }
        if (z) {
            nsetbufferalphaOnExtraCallback = onNavigationEvent(nsetbufferalphaOnExtraCallback, Object.class, this.IAuthTabCallback_Parcel.onTransact(Object.class));
        }
        return nsetbufferalphaOnExtraCallback.onWarmupCompleted();
    }

    private nSetBufferAlpha onNavigationEvent(nSetBufferAlpha nsetbufferalpha, Class<?> cls, Class<?> cls2) {
        if (cls2 != null) {
            nsetbufferalpha = onNavigationEvent(nsetbufferalpha, SavedStateHandleImplExternalSyntheticLambda0.IAuthTabCallback(cls2));
            Iterator it = SavedStateHandleImplExternalSyntheticLambda0.onWarmupCompleted(cls2, cls, false).iterator();
            while (it.hasNext()) {
                nsetbufferalpha = onNavigationEvent(nsetbufferalpha, SavedStateHandleImplExternalSyntheticLambda0.IAuthTabCallback((Class) it.next()));
            }
        }
        return nsetbufferalpha;
    }

    private nSetBufferAlpha onNavigationEvent(nSetBufferAlpha nsetbufferalpha, Annotation[] annotationArr) {
        if (annotationArr != null) {
            for (Annotation annotation : annotationArr) {
                if (!nsetbufferalpha.onWarmupCompleted(annotation)) {
                    nsetbufferalpha = nsetbufferalpha.onExtraCallbackWithResult(annotation);
                    if (this.IAuthTabCallbackStub.onWarmupCompleted(annotation)) {
                        nsetbufferalpha = IAuthTabCallback(nsetbufferalpha, annotation);
                    }
                }
            }
        }
        return nsetbufferalpha;
    }

    private nSetBufferAlpha IAuthTabCallback(nSetBufferAlpha nsetbufferalpha, Annotation annotation) {
        for (Annotation annotation2 : SavedStateHandleImplExternalSyntheticLambda0.IAuthTabCallback(annotation.annotationType())) {
            if (!(annotation2 instanceof Target) && !(annotation2 instanceof Retention) && !nsetbufferalpha.onWarmupCompleted(annotation2)) {
                nsetbufferalpha = nsetbufferalpha.onExtraCallbackWithResult(annotation2);
                if (this.IAuthTabCallbackStub.onWarmupCompleted(annotation2)) {
                    nsetbufferalpha = IAuthTabCallback(nsetbufferalpha, annotation2);
                }
            }
        }
        return nsetbufferalpha;
    }
}
