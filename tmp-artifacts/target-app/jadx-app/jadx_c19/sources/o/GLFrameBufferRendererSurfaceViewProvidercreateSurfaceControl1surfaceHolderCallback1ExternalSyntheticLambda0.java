package o;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers$;
import im.toss.features.benefit.ui.BenefitItemAdapter$;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.List;
import o.Fragment;
import o.TextureProducerExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class GLFrameBufferRendererSurfaceViewProvidercreateSurfaceControl1surfaceHolderCallback1ExternalSyntheticLambda0 implements internalGetValueMap, Serializable {
    private static final long serialVersionUID = 1;

    public static setDrawDisappearingViewsLast onNavigationEvent(SavedStateHandleSaverKtExternalSyntheticLambda1 savedStateHandleSaverKtExternalSyntheticLambda1, SavedStateHandleSaverKtExternalSyntheticLambda1 savedStateHandleSaverKtExternalSyntheticLambda12, SavedStateHandleSaverKtExternalSyntheticLambda1 savedStateHandleSaverKtExternalSyntheticLambda13, SavedStateHandleSaverKtExternalSyntheticLambda1 savedStateHandleSaverKtExternalSyntheticLambda14) {
        return new TextureProducerExternalSyntheticLambda3.IAuthTabCallback(savedStateHandleSaverKtExternalSyntheticLambda1, (nGetPreviousReleaseFenceFd) null, savedStateHandleSaverKtExternalSyntheticLambda12, savedStateHandleSaverKtExternalSyntheticLambda13, savedStateHandleSaverKtExternalSyntheticLambda14);
    }

    public static setDrawDisappearingViewsLast onExtraCallback(SavedStateHandleSaverKtExternalSyntheticLambda1 savedStateHandleSaverKtExternalSyntheticLambda1, nGetPreviousReleaseFenceFd ngetpreviousreleasefencefd, SavedStateHandleSaverKtExternalSyntheticLambda1 savedStateHandleSaverKtExternalSyntheticLambda12, SavedStateHandleSaverKtExternalSyntheticLambda1 savedStateHandleSaverKtExternalSyntheticLambda13, SavedStateHandleSaverKtExternalSyntheticLambda1 savedStateHandleSaverKtExternalSyntheticLambda14) {
        return new TextureProducerExternalSyntheticLambda3.IAuthTabCallback(savedStateHandleSaverKtExternalSyntheticLambda1, ngetpreviousreleasefencefd, savedStateHandleSaverKtExternalSyntheticLambda12, savedStateHandleSaverKtExternalSyntheticLambda13, savedStateHandleSaverKtExternalSyntheticLambda14);
    }

    public static setDrawDisappearingViewsLast onExtraCallbackWithResult(startIntentSenderFromFragment startintentsenderfromfragment, JavaType javaType, FragmentActivityExternalSyntheticLambda1<?> fragmentActivityExternalSyntheticLambda1) {
        return new TextureProducerExternalSyntheticLambda3.onNavigationEvent(javaType.asBinder(), fragmentActivityExternalSyntheticLambda1);
    }

    public static setDrawDisappearingViewsLast onNavigationEvent(startIntentSenderFromFragment startintentsenderfromfragment, JavaType javaType) throws JsonMappingException {
        onStateNotSaved onstatenotsavedIAuthTabCallback = startintentsenderfromfragment.IAuthTabCallback(javaType);
        internalPathIteratorRawSize<RoundedPolygonCompanion, Fragment.IAuthTabCallback> internalpathiteratorrawsizeOnExtraCallback = onExtraCallback(onstatenotsavedIAuthTabCallback);
        if (internalpathiteratorrawsizeOnExtraCallback != null && internalpathiteratorrawsizeOnExtraCallback.onNavigationEvent != null) {
            return onExtraCallbackWithResult(startintentsenderfromfragment, (nCreate) internalpathiteratorrawsizeOnExtraCallback.onWarmupCompleted);
        }
        List<internalPathIteratorRawSize<nGetPreviousReleaseFenceFd, Fragment.IAuthTabCallback>> typedObject = onstatenotsavedIAuthTabCallback.readTypedObject();
        typedObject.removeIf(new StdKeyDeserializers$.ExternalSyntheticLambda0());
        nGetPreviousReleaseFenceFd ngetpreviousreleasefencefdIAuthTabCallback = IAuthTabCallback(typedObject);
        if (ngetpreviousreleasefencefdIAuthTabCallback != null) {
            return onExtraCallbackWithResult(startintentsenderfromfragment, ngetpreviousreleasefencefdIAuthTabCallback);
        }
        if (internalpathiteratorrawsizeOnExtraCallback != null) {
            return onExtraCallbackWithResult(startintentsenderfromfragment, (nCreate) internalpathiteratorrawsizeOnExtraCallback.onWarmupCompleted);
        }
        if (typedObject.isEmpty()) {
            return null;
        }
        return onExtraCallbackWithResult(startintentsenderfromfragment, (nCreate) typedObject.get(0).onWarmupCompleted);
    }

    public static /* synthetic */ boolean IAuthTabCallback(internalPathIteratorRawSize internalpathiteratorrawsize) {
        return (internalpathiteratorrawsize.onWarmupCompleted.access100() == 1 && internalpathiteratorrawsize.onWarmupCompleted.onExtraCallbackWithResult(0) == String.class && internalpathiteratorrawsize.onNavigationEvent != Fragment.IAuthTabCallback.PROPERTIES) ? false : true;
    }

    private static setDrawDisappearingViewsLast onExtraCallbackWithResult(startIntentSenderFromFragment startintentsenderfromfragment, nCreate ncreate) {
        if (ncreate instanceof RoundedPolygonCompanion) {
            Constructor<?> constructorOnWarmupCompleted = ((RoundedPolygonCompanion) ncreate).onWarmupCompleted();
            if (startintentsenderfromfragment.asInterface()) {
                SavedStateHandleImplExternalSyntheticLambda0.onWarmupCompleted(1769484191, new Object[]{constructorOnWarmupCompleted, Boolean.valueOf(startintentsenderfromfragment.onExtraCallback(setLayoutTransition.OVERRIDE_PUBLIC_ACCESS_MODIFIERS))}, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -1769484188, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult());
            }
            return new TextureProducerExternalSyntheticLambda3.onExtraCallback(constructorOnWarmupCompleted);
        }
        Method methodIAuthTabCallbackDefault = ((nGetPreviousReleaseFenceFd) ncreate).IAuthTabCallbackDefault();
        if (startintentsenderfromfragment.asInterface()) {
            SavedStateHandleImplExternalSyntheticLambda0.onWarmupCompleted(1769484191, new Object[]{methodIAuthTabCallbackDefault, Boolean.valueOf(startintentsenderfromfragment.onExtraCallback(setLayoutTransition.OVERRIDE_PUBLIC_ACCESS_MODIFIERS))}, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -1769484188, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult());
        }
        return new TextureProducerExternalSyntheticLambda3.onWarmupCompleted(methodIAuthTabCallbackDefault);
    }

    private static internalPathIteratorRawSize<RoundedPolygonCompanion, Fragment.IAuthTabCallback> onExtraCallback(onStateNotSaved onstatenotsaved) {
        for (internalPathIteratorRawSize<RoundedPolygonCompanion, Fragment.IAuthTabCallback> internalpathiteratorrawsize : onstatenotsaved.extraCallback()) {
            RoundedPolygonCompanion roundedPolygonCompanion = (RoundedPolygonCompanion) internalpathiteratorrawsize.onWarmupCompleted;
            if (roundedPolygonCompanion.access100() == 1 && String.class == roundedPolygonCompanion.onExtraCallbackWithResult(0)) {
                return internalpathiteratorrawsize;
            }
        }
        return null;
    }

    private static nGetPreviousReleaseFenceFd IAuthTabCallback(List<internalPathIteratorRawSize<nGetPreviousReleaseFenceFd, Fragment.IAuthTabCallback>> list) throws JsonMappingException {
        nGetPreviousReleaseFenceFd ngetpreviousreleasefencefd = null;
        for (internalPathIteratorRawSize<nGetPreviousReleaseFenceFd, Fragment.IAuthTabCallback> internalpathiteratorrawsize : list) {
            if (internalpathiteratorrawsize.onNavigationEvent != null) {
                if (ngetpreviousreleasefencefd != null) {
                    throw new IllegalArgumentException("Multiple suitable annotated Creator factory methods to be used as the Key deserializer for type " + SavedStateHandleImplExternalSyntheticLambda0.onActivityResized(internalpathiteratorrawsize.onWarmupCompleted.onTransact()));
                }
                ngetpreviousreleasefencefd = (nGetPreviousReleaseFenceFd) internalpathiteratorrawsize.onWarmupCompleted;
            }
        }
        return ngetpreviousreleasefencefd;
    }

    @Override // o.internalGetValueMap
    public setDrawDisappearingViewsLast onExtraCallback(JavaType javaType, startIntentSenderFromFragment startintentsenderfromfragment, onStateNotSaved onstatenotsaved) throws JsonMappingException {
        Class<?> clsAsBinder = javaType.asBinder();
        if (clsAsBinder.isPrimitive()) {
            clsAsBinder = (Class) SavedStateHandleImplExternalSyntheticLambda0.onWarmupCompleted(-446576876, new Object[]{clsAsBinder}, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), 446576880, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult());
        }
        return TextureProducerExternalSyntheticLambda3.onExtraCallback(clsAsBinder);
    }
}
