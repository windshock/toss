package o;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import im.toss.features.benefit.ui.BenefitItemAdapter$;
import java.lang.reflect.Type;
import o.SavedStateHandleSaverKtExternalSyntheticLambda3;
import o.SurfaceControlCompatTransactionCompletedListener;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class supportFinishAfterTransition {
    public abstract LifecycleEffectKtExternalSyntheticLambda4 onExtraCallback();

    protected abstract JsonMappingException onExtraCallbackWithResult(JavaType javaType, String str, String str2);

    public abstract RadioButtonKtRadioButtonElement27<?> onNavigationEvent();

    public abstract <T> T onWarmupCompleted(JavaType javaType, String str) throws JsonMappingException;

    public JavaType onExtraCallbackWithResult(Type type) {
        if (type == null) {
            return null;
        }
        return onExtraCallback().IAuthTabCallback(type);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.fasterxml.jackson.databind.JsonMappingException */
    public JavaType IAuthTabCallback(JavaType javaType, String str, SurfaceControlCompatTransactionCompletedListener surfaceControlCompatTransactionCompletedListener) throws JsonMappingException, IllegalArgumentException {
        int iIndexOf = str.indexOf(60);
        if (iIndexOf > 0) {
            return onExtraCallback(javaType, str, surfaceControlCompatTransactionCompletedListener, iIndexOf);
        }
        RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27OnNavigationEvent = onNavigationEvent();
        SurfaceControlCompatTransactionCompletedListener.onExtraCallback onExtraCallback = surfaceControlCompatTransactionCompletedListener.onExtraCallback(radioButtonKtRadioButtonElement27OnNavigationEvent, javaType, str);
        if (onExtraCallback == SurfaceControlCompatTransactionCompletedListener.onExtraCallback.DENIED) {
            return (JavaType) onExtraCallbackWithResult(javaType, str, surfaceControlCompatTransactionCompletedListener);
        }
        try {
            Class<?> clsIAuthTabCallback = onExtraCallback().IAuthTabCallback(str);
            if (!javaType.onExtraCallbackWithResult(clsIAuthTabCallback)) {
                return (JavaType) onExtraCallback(javaType, str);
            }
            JavaType javaTypeIAuthTabCallback = radioButtonKtRadioButtonElement27OnNavigationEvent.extraCallback().IAuthTabCallback(javaType, clsIAuthTabCallback);
            return (onExtraCallback != SurfaceControlCompatTransactionCompletedListener.onExtraCallback.INDETERMINATE || surfaceControlCompatTransactionCompletedListener.onWarmupCompleted(radioButtonKtRadioButtonElement27OnNavigationEvent, javaType, javaTypeIAuthTabCallback) == SurfaceControlCompatTransactionCompletedListener.onExtraCallback.ALLOWED) ? javaTypeIAuthTabCallback : (JavaType) onExtraCallback(javaType, str, surfaceControlCompatTransactionCompletedListener);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (Exception e) {
            throw onExtraCallbackWithResult(javaType, str, String.format("problem: (%s) %s", e.getClass().getName(), SavedStateHandleImplExternalSyntheticLambda0.onExtraCallback(e)));
        }
    }

    private JavaType onExtraCallback(JavaType javaType, String str, SurfaceControlCompatTransactionCompletedListener surfaceControlCompatTransactionCompletedListener, int i2) throws JsonMappingException, IllegalArgumentException {
        RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27OnNavigationEvent = onNavigationEvent();
        SurfaceControlCompatTransactionCompletedListener.onExtraCallback onExtraCallback = surfaceControlCompatTransactionCompletedListener.onExtraCallback(radioButtonKtRadioButtonElement27OnNavigationEvent, javaType, str.substring(0, i2));
        if (onExtraCallback == SurfaceControlCompatTransactionCompletedListener.onExtraCallback.DENIED) {
            return (JavaType) onExtraCallbackWithResult(javaType, str, surfaceControlCompatTransactionCompletedListener);
        }
        JavaType javaTypeOnExtraCallbackWithResult = onExtraCallback().onExtraCallbackWithResult(str);
        if (!javaTypeOnExtraCallbackWithResult.onWarmupCompleted(javaType.asBinder())) {
            return (JavaType) onExtraCallback(javaType, str);
        }
        SurfaceControlCompatTransactionCompletedListener.onExtraCallback onextracallback = SurfaceControlCompatTransactionCompletedListener.onExtraCallback.ALLOWED;
        return (onExtraCallback == onextracallback || surfaceControlCompatTransactionCompletedListener.onWarmupCompleted(radioButtonKtRadioButtonElement27OnNavigationEvent, javaType, javaTypeOnExtraCallbackWithResult) == onextracallback) ? javaTypeOnExtraCallbackWithResult : (JavaType) onExtraCallback(javaType, str, surfaceControlCompatTransactionCompletedListener);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.fasterxml.jackson.databind.JsonMappingException */
    protected <T> T onExtraCallback(JavaType javaType, String str) throws JsonMappingException {
        throw onExtraCallbackWithResult(javaType, str, "Not a subtype");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.fasterxml.jackson.databind.JsonMappingException */
    protected <T> T onExtraCallbackWithResult(JavaType javaType, String str, SurfaceControlCompatTransactionCompletedListener surfaceControlCompatTransactionCompletedListener) throws JsonMappingException {
        throw onExtraCallbackWithResult(javaType, str, "Configured `PolymorphicTypeValidator` (of type " + SavedStateHandleImplExternalSyntheticLambda0.onExtraCallbackWithResult(surfaceControlCompatTransactionCompletedListener) + ") denied resolution");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.fasterxml.jackson.databind.JsonMappingException */
    protected <T> T onExtraCallback(JavaType javaType, String str, SurfaceControlCompatTransactionCompletedListener surfaceControlCompatTransactionCompletedListener) throws JsonMappingException {
        throw onExtraCallbackWithResult(javaType, str, "Configured `PolymorphicTypeValidator` (of type " + SavedStateHandleImplExternalSyntheticLambda0.onExtraCallbackWithResult(surfaceControlCompatTransactionCompletedListener) + ") denied resolution");
    }

    public getParentFragmentManager<?> onExtraCallback(internalPathIteratorPeek internalpathiteratorpeek, nTransactionReparent ntransactionreparent) throws JsonMappingException {
        Class<?> clsOnExtraCallback = ntransactionreparent.onExtraCallback();
        RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27OnNavigationEvent = onNavigationEvent();
        RadioButtonKtRadioButtonElement24 radioButtonKtRadioButtonElement24Access000 = radioButtonKtRadioButtonElement27OnNavigationEvent.access000();
        getParentFragmentManager<?> getparentfragmentmanagerOnWarmupCompleted = radioButtonKtRadioButtonElement24Access000 == null ? null : radioButtonKtRadioButtonElement24Access000.onWarmupCompleted(radioButtonKtRadioButtonElement27OnNavigationEvent, internalpathiteratorpeek, clsOnExtraCallback);
        if (getparentfragmentmanagerOnWarmupCompleted == null) {
            getparentfragmentmanagerOnWarmupCompleted = (getParentFragmentManager) SavedStateHandleImplExternalSyntheticLambda0.onExtraCallbackWithResult(clsOnExtraCallback, radioButtonKtRadioButtonElement27OnNavigationEvent.asInterface());
        }
        return getparentfragmentmanagerOnWarmupCompleted.onExtraCallback(ntransactionreparent.IAuthTabCallbackDefault());
    }

    public getParentFragment IAuthTabCallback(internalPathIteratorPeek internalpathiteratorpeek, nTransactionReparent ntransactionreparent) {
        Class<?> clsOnNavigationEvent = ntransactionreparent.onNavigationEvent();
        RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27OnNavigationEvent = onNavigationEvent();
        RadioButtonKtRadioButtonElement24 radioButtonKtRadioButtonElement24Access000 = radioButtonKtRadioButtonElement27OnNavigationEvent.access000();
        getParentFragment getparentfragmentOnNavigationEvent = radioButtonKtRadioButtonElement24Access000 == null ? null : radioButtonKtRadioButtonElement24Access000.onNavigationEvent(radioButtonKtRadioButtonElement27OnNavigationEvent, internalpathiteratorpeek, clsOnNavigationEvent);
        return getparentfragmentOnNavigationEvent == null ? (getParentFragment) SavedStateHandleImplExternalSyntheticLambda0.onExtraCallbackWithResult(clsOnNavigationEvent, radioButtonKtRadioButtonElement27OnNavigationEvent.asInterface()) : getparentfragmentOnNavigationEvent;
    }

    public SavedStateHandleSaverKtExternalSyntheticLambda3<Object, Object> onExtraCallback(internalPathIteratorPeek internalpathiteratorpeek, Object obj) throws JsonMappingException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof SavedStateHandleSaverKtExternalSyntheticLambda3) {
            return (SavedStateHandleSaverKtExternalSyntheticLambda3) obj;
        }
        if (!(obj instanceof Class)) {
            throw new IllegalStateException("AnnotationIntrospector returned Converter definition of type " + obj.getClass().getName() + "; expected type Converter or Class<Converter> instead");
        }
        Class<?> cls = (Class) obj;
        if (cls != SavedStateHandleSaverKtExternalSyntheticLambda3.onExtraCallbackWithResult.class) {
            if (!((Boolean) SavedStateHandleImplExternalSyntheticLambda0.onWarmupCompleted(-9721623, new Object[]{cls}, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), 9721630, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult())).booleanValue()) {
                if (!SavedStateHandleSaverKtExternalSyntheticLambda3.class.isAssignableFrom(cls)) {
                    throw new IllegalStateException("AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<Converter>");
                }
                RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27OnNavigationEvent = onNavigationEvent();
                RadioButtonKtRadioButtonElement24 radioButtonKtRadioButtonElement24Access000 = radioButtonKtRadioButtonElement27OnNavigationEvent.access000();
                SavedStateHandleSaverKtExternalSyntheticLambda3<?, ?> savedStateHandleSaverKtExternalSyntheticLambda3OnExtraCallback = radioButtonKtRadioButtonElement24Access000 != null ? radioButtonKtRadioButtonElement24Access000.onExtraCallback(radioButtonKtRadioButtonElement27OnNavigationEvent, internalpathiteratorpeek, cls) : null;
                return savedStateHandleSaverKtExternalSyntheticLambda3OnExtraCallback == null ? (SavedStateHandleSaverKtExternalSyntheticLambda3) SavedStateHandleImplExternalSyntheticLambda0.onExtraCallbackWithResult(cls, radioButtonKtRadioButtonElement27OnNavigationEvent.asInterface()) : savedStateHandleSaverKtExternalSyntheticLambda3OnExtraCallback;
            }
        }
        return null;
    }

    public <T> T onWarmupCompleted(Class<?> cls, String str) throws JsonMappingException {
        return (T) onWarmupCompleted(onExtraCallbackWithResult(cls), str);
    }

    protected final String onExtraCallbackWithResult(String str, Object... objArr) {
        return objArr.length > 0 ? String.format(str, objArr) : str;
    }

    protected final String onExtraCallbackWithResult(String str) {
        if (str == null) {
            return "";
        }
        if (str.length() <= 500) {
            return str;
        }
        return str.substring(0, 500) + "]...[" + str.substring(str.length() - 500);
    }

    protected String onWarmupCompleted(String str) {
        if (str == null) {
            return "[N/A]";
        }
        return String.format("\"%s\"", onExtraCallbackWithResult(str));
    }

    protected String onWarmupCompleted(String str, String str2) {
        if (str2 == null) {
            return str;
        }
        return str + ": " + str2;
    }
}
