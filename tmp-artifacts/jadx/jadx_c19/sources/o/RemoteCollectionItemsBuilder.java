package o;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import im.toss.features.benefit.ui.BenefitItemAdapter$;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicReference;
import o.Fragment;
import o.callStartTransitionListener;
import o.restoreViewState;
import o.setShowsDialog;
import o.validateRequestPermissionsRequestCode;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class RemoteCollectionItemsBuilder extends RunCallbackActionKt implements Serializable {
    protected final RadioButtonKtRadioButtonElement11 _factoryConfig;
    private static final Class<?> IAuthTabCallbackStub = Object.class;
    private static final Class<?> asInterface = String.class;
    private static final Class<?> onExtraCallbackWithResult = CharSequence.class;
    private static final Class<?> IAuthTabCallback = Iterable.class;
    private static final Class<?> onExtraCallback = Map.Entry.class;
    private static final Class<?> asBinder = Serializable.class;
    protected static final FragmentKtExternalSyntheticLambda0 onWarmupCompleted = new FragmentKtExternalSyntheticLambda0("@JsonUnwrapped");

    protected RemoteCollectionItemsBuilder(RadioButtonKtRadioButtonElement11 radioButtonKtRadioButtonElement11) {
        this._factoryConfig = radioButtonKtRadioButtonElement11;
    }

    @Override // o.RunCallbackActionKt
    public JavaType onNavigationEvent(startIntentSenderFromFragment startintentsenderfromfragment, JavaType javaType) throws JsonMappingException {
        JavaType javaTypeOnExtraCallbackWithResult;
        while (true) {
            javaTypeOnExtraCallbackWithResult = onExtraCallbackWithResult(startintentsenderfromfragment, javaType);
            if (javaTypeOnExtraCallbackWithResult == null) {
                return javaType;
            }
            Class<?> clsAsBinder = javaType.asBinder();
            Class<?> clsAsBinder2 = javaTypeOnExtraCallbackWithResult.asBinder();
            if (clsAsBinder == clsAsBinder2 || !clsAsBinder.isAssignableFrom(clsAsBinder2)) {
                break;
            }
            javaType = javaTypeOnExtraCallbackWithResult;
        }
        throw new IllegalArgumentException("Invalid abstract type resolution from " + javaType + " to " + javaTypeOnExtraCallbackWithResult + ": latter is not a subtype of former");
    }

    private JavaType onExtraCallbackWithResult(startIntentSenderFromFragment startintentsenderfromfragment, JavaType javaType) throws JsonMappingException {
        Class<?> clsAsBinder = javaType.asBinder();
        if (!this._factoryConfig.onExtraCallback()) {
            return null;
        }
        Iterator<onResumeFragments> it = this._factoryConfig.IAuthTabCallback().iterator();
        while (it.hasNext()) {
            JavaType javaTypeOnExtraCallback = it.next().onExtraCallback(startintentsenderfromfragment, javaType);
            if (javaTypeOnExtraCallback != null && !javaTypeOnExtraCallback.onNavigationEvent(clsAsBinder)) {
                return javaTypeOnExtraCallback;
            }
        }
        return null;
    }

    public internalGetVerifier onNavigationEvent(supportStartPostponedEnterTransition supportstartpostponedentertransition, onStateNotSaved onstatenotsaved) throws JsonMappingException {
        startIntentSenderFromFragment startintentsenderfromfragmentOnNavigationEvent = supportstartpostponedentertransition.onNavigationEvent();
        AngleMeasurerExternalSyntheticLambda0 angleMeasurerExternalSyntheticLambda0ICustomTabsCallback = onstatenotsaved.ICustomTabsCallback();
        Object objIAuthTabCallbackDefault = startintentsenderfromfragmentOnNavigationEvent.asBinder().IAuthTabCallbackDefault(angleMeasurerExternalSyntheticLambda0ICustomTabsCallback);
        internalGetVerifier internalgetverifierIAuthTabCallback = objIAuthTabCallbackDefault != null ? IAuthTabCallback(startintentsenderfromfragmentOnNavigationEvent, angleMeasurerExternalSyntheticLambda0ICustomTabsCallback, objIAuthTabCallbackDefault) : null;
        if (internalgetverifierIAuthTabCallback == null && (internalgetverifierIAuthTabCallback = CanvasBufferedRendererV34ExternalSyntheticLambda2.onWarmupCompleted(startintentsenderfromfragmentOnNavigationEvent, onstatenotsaved.getInterfaceDescriptor())) == null) {
            internalgetverifierIAuthTabCallback = IAuthTabCallback(supportstartpostponedentertransition, onstatenotsaved);
        }
        if (this._factoryConfig.asBinder()) {
            for (RowKtRow23 rowKtRow23 : this._factoryConfig.asInterface()) {
                internalgetverifierIAuthTabCallback = rowKtRow23.onWarmupCompleted(startintentsenderfromfragmentOnNavigationEvent, onstatenotsaved, internalgetverifierIAuthTabCallback);
                if (internalgetverifierIAuthTabCallback == null) {
                    supportstartpostponedentertransition.onExtraCallbackWithResult(onstatenotsaved, "Broken registered ValueInstantiators (of type %s): returned null ValueInstantiator", rowKtRow23.getClass().getName());
                }
            }
        }
        return internalgetverifierIAuthTabCallback != null ? internalgetverifierIAuthTabCallback.onWarmupCompleted(supportstartpostponedentertransition, onstatenotsaved) : internalgetverifierIAuthTabCallback;
    }

    protected internalGetVerifier IAuthTabCallback(supportStartPostponedEnterTransition supportstartpostponedentertransition, onStateNotSaved onstatenotsaved) throws InvalidDefinitionException, JsonMappingException {
        RoundedPolygonCompanion roundedPolygonCompanionOnExtraCallback;
        startIntentSenderFromFragment startintentsenderfromfragmentOnNavigationEvent = supportstartpostponedentertransition.onNavigationEvent();
        nTransactionDelete ntransactiondeleteOnPostMessage = onstatenotsaved.onPostMessage();
        GlanceAppWidgetReceiver glanceAppWidgetReceiverOnWarmupCompleted = startintentsenderfromfragmentOnNavigationEvent.onWarmupCompleted();
        nTransactionSetOnCommit<?> ntransactionsetoncommitOnWarmupCompleted = startintentsenderfromfragmentOnNavigationEvent.onWarmupCompleted(onstatenotsaved.getInterfaceDescriptor(), onstatenotsaved.ICustomTabsCallback());
        RowScopeImplInstance rowScopeImplInstance = new RowScopeImplInstance(onstatenotsaved, startintentsenderfromfragmentOnNavigationEvent);
        if (ntransactiondeleteOnPostMessage.onExtraCallback()) {
            nTransactionCreate ntransactioncreate = ntransactiondeleteOnPostMessage.onWarmupCompleted;
            if (ntransactioncreate.onTransact() == 0) {
                rowScopeImplInstance.onNavigationEvent(ntransactioncreate.onWarmupCompleted());
            } else {
                onNavigationEvent(supportstartpostponedentertransition, onstatenotsaved, rowScopeImplInstance, RowKtRow1.onWarmupCompleted(startintentsenderfromfragmentOnNavigationEvent.asBinder(), ntransactioncreate.onWarmupCompleted(), ntransactioncreate.asBinder()));
            }
        }
        boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult(supportstartpostponedentertransition, onstatenotsaved, rowScopeImplInstance, ntransactiondeleteOnPostMessage.onNavigationEvent());
        if (onstatenotsaved.onMessageChannelReady().onMessageChannelReady() && !onstatenotsaved.ICustomTabsCallbackStubProxy()) {
            if (!rowScopeImplInstance.onWarmupCompleted() && (roundedPolygonCompanionOnExtraCallback = onstatenotsaved.onExtraCallback()) != null) {
                rowScopeImplInstance.onNavigationEvent(roundedPolygonCompanionOnExtraCallback);
            }
            if (glanceAppWidgetReceiverOnWarmupCompleted.onExtraCallbackWithResult(onstatenotsaved.getInterfaceDescriptor())) {
                onExtraCallbackWithResult(supportstartpostponedentertransition, onstatenotsaved, ntransactionsetoncommitOnWarmupCompleted, rowScopeImplInstance, ntransactiondeleteOnPostMessage.IAuthTabCallback());
            }
        }
        if (!zOnExtraCallbackWithResult) {
            onNavigationEvent(supportstartpostponedentertransition, ntransactionsetoncommitOnWarmupCompleted, rowScopeImplInstance, ntransactiondeleteOnPostMessage.onExtraCallbackWithResult());
        }
        return rowScopeImplInstance.onExtraCallbackWithResult(supportstartpostponedentertransition);
    }

    public internalGetVerifier IAuthTabCallback(startIntentSenderFromFragment startintentsenderfromfragment, internalPathIteratorPeek internalpathiteratorpeek, Object obj) throws JsonMappingException {
        internalGetVerifier internalgetverifierAsBinder;
        if (obj == null) {
            return null;
        }
        if (obj instanceof internalGetVerifier) {
            return (internalGetVerifier) obj;
        }
        if (!(obj instanceof Class)) {
            throw new IllegalStateException("AnnotationIntrospector returned key deserializer definition of type " + obj.getClass().getName() + "; expected type KeyDeserializer or Class<KeyDeserializer> instead");
        }
        Class<?> cls = (Class) obj;
        if (((Boolean) SavedStateHandleImplExternalSyntheticLambda0.onWarmupCompleted(-9721623, new Object[]{cls}, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), 9721630, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult())).booleanValue()) {
            return null;
        }
        if (!internalGetVerifier.class.isAssignableFrom(cls)) {
            throw new IllegalStateException("AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<ValueInstantiator>");
        }
        RadioButtonKtRadioButtonElement24 radioButtonKtRadioButtonElement24Access000 = startintentsenderfromfragment.access000();
        return (radioButtonKtRadioButtonElement24Access000 == null || (internalgetverifierAsBinder = radioButtonKtRadioButtonElement24Access000.asBinder(startintentsenderfromfragment, internalpathiteratorpeek, cls)) == null) ? (internalGetVerifier) SavedStateHandleImplExternalSyntheticLambda0.onExtraCallbackWithResult(cls, startintentsenderfromfragment.asInterface()) : internalgetverifierAsBinder;
    }

    private boolean onExtraCallbackWithResult(supportStartPostponedEnterTransition supportstartpostponedentertransition, onStateNotSaved onstatenotsaved, RowScopeImplInstance rowScopeImplInstance, List<nTransactionCreate> list) throws JsonMappingException {
        startActivityFromFragment startactivityfromfragmentAsBinder = supportstartpostponedentertransition.asBinder();
        Iterator<nTransactionCreate> it = list.iterator();
        boolean zOnWarmupCompleted = false;
        while (it.hasNext()) {
            zOnWarmupCompleted |= onWarmupCompleted(supportstartpostponedentertransition, onstatenotsaved, rowScopeImplInstance, RowKtRow1.onWarmupCompleted(startactivityfromfragmentAsBinder, it.next().onWarmupCompleted(), (nSetBufferTransparency[]) null));
        }
        return zOnWarmupCompleted;
    }

    private void onExtraCallbackWithResult(supportStartPostponedEnterTransition supportstartpostponedentertransition, onStateNotSaved onstatenotsaved, nTransactionSetOnCommit<?> ntransactionsetoncommit, RowScopeImplInstance rowScopeImplInstance, List<nTransactionCreate> list) throws InvalidDefinitionException, JsonMappingException {
        int i2;
        startActivityFromFragment startactivityfromfragmentAsBinder = supportstartpostponedentertransition.asBinder();
        for (nTransactionCreate ntransactioncreate : list) {
            int iOnTransact = ntransactioncreate.onTransact();
            nSetBufferTransform nsetbuffertransformOnWarmupCompleted = ntransactioncreate.onWarmupCompleted();
            if (iOnTransact == 1) {
                onNavigationEvent(rowScopeImplInstance, nsetbuffertransformOnWarmupCompleted, false, ntransactionsetoncommit.onExtraCallback(nsetbuffertransformOnWarmupCompleted));
            } else {
                RuntimeVersionProtobufRuntimeVersionException[] runtimeVersionProtobufRuntimeVersionExceptionArr = new RuntimeVersionProtobufRuntimeVersionException[iOnTransact];
                int i3 = 0;
                for (int i4 = 0; i4 < iOnTransact; i4 = i2 + 1) {
                    nDupFenceFd ndupfencefdOnExtraCallback = nsetbuffertransformOnWarmupCompleted.onExtraCallback(i4);
                    setShowsDialog.IAuthTabCallback iAuthTabCallbackOnExtraCallbackWithResult = startactivityfromfragmentAsBinder.onExtraCallbackWithResult((nCreate) ndupfencefdOnExtraCallback);
                    if (iAuthTabCallbackOnExtraCallbackWithResult != null) {
                        i2 = i4;
                        runtimeVersionProtobufRuntimeVersionExceptionArr[i2] = IAuthTabCallback(supportstartpostponedentertransition, onstatenotsaved, null, i4, ndupfencefdOnExtraCallback, iAuthTabCallbackOnExtraCallbackWithResult);
                        i3++;
                    } else {
                        i2 = i4;
                        if (startactivityfromfragmentAsBinder.asInterface((nCreate) ndupfencefdOnExtraCallback) != null) {
                            onWarmupCompleted(supportstartpostponedentertransition, onstatenotsaved, ndupfencefdOnExtraCallback);
                        }
                    }
                }
                if (i3 + 1 == iOnTransact) {
                    rowScopeImplInstance.onWarmupCompleted(nsetbuffertransformOnWarmupCompleted, false, runtimeVersionProtobufRuntimeVersionExceptionArr, 0);
                }
            }
        }
    }

    private void onNavigationEvent(supportStartPostponedEnterTransition supportstartpostponedentertransition, nTransactionSetOnCommit<?> ntransactionsetoncommit, RowScopeImplInstance rowScopeImplInstance, List<nTransactionCreate> list) throws JsonMappingException {
        for (nTransactionCreate ntransactioncreate : list) {
            int iOnTransact = ntransactioncreate.onTransact();
            nSetBufferTransform nsetbuffertransformOnWarmupCompleted = ntransactioncreate.onWarmupCompleted();
            if (iOnTransact == 1) {
                onNavigationEvent(rowScopeImplInstance, nsetbuffertransformOnWarmupCompleted, false, ntransactionsetoncommit.onExtraCallback(nsetbuffertransformOnWarmupCompleted));
            }
        }
    }

    private boolean onWarmupCompleted(supportStartPostponedEnterTransition supportstartpostponedentertransition, onStateNotSaved onstatenotsaved, RowScopeImplInstance rowScopeImplInstance, RowKtRow1 rowKtRow1) throws InvalidDefinitionException, JsonMappingException {
        int iOnExtraCallback = rowKtRow1.onExtraCallback();
        RuntimeVersionProtobufRuntimeVersionException[] runtimeVersionProtobufRuntimeVersionExceptionArr = new RuntimeVersionProtobufRuntimeVersionException[iOnExtraCallback];
        if (iOnExtraCallback == 0) {
            rowScopeImplInstance.onExtraCallbackWithResult(rowKtRow1.onWarmupCompleted(), true, runtimeVersionProtobufRuntimeVersionExceptionArr);
            return true;
        }
        int i2 = -1;
        for (int i3 = 0; i3 < iOnExtraCallback; i3++) {
            nDupFenceFd ndupfencefdIAuthTabCallback = rowKtRow1.IAuthTabCallback(i3);
            setShowsDialog.IAuthTabCallback iAuthTabCallbackOnExtraCallbackWithResult = rowKtRow1.onExtraCallbackWithResult(i3);
            if (iAuthTabCallbackOnExtraCallbackWithResult != null) {
                runtimeVersionProtobufRuntimeVersionExceptionArr[i3] = IAuthTabCallback(supportstartpostponedentertransition, onstatenotsaved, null, i3, ndupfencefdIAuthTabCallback, iAuthTabCallbackOnExtraCallbackWithResult);
            } else if (i2 < 0) {
                i2 = i3;
            } else {
                supportstartpostponedentertransition.onExtraCallbackWithResult(onstatenotsaved, "More than one argument (#%d and #%d) left as delegating for Creator %s: only one allowed", Integer.valueOf(i2), Integer.valueOf(i3), rowKtRow1);
            }
        }
        if (i2 < 0) {
            supportstartpostponedentertransition.onExtraCallbackWithResult(onstatenotsaved, "No argument left as delegating for Creator %s: exactly one required", rowKtRow1);
        }
        if (iOnExtraCallback == 1) {
            return onNavigationEvent(rowScopeImplInstance, rowKtRow1.onWarmupCompleted(), true, true);
        }
        rowScopeImplInstance.onWarmupCompleted(rowKtRow1.onWarmupCompleted(), true, runtimeVersionProtobufRuntimeVersionExceptionArr, i2);
        return true;
    }

    private void onNavigationEvent(supportStartPostponedEnterTransition supportstartpostponedentertransition, onStateNotSaved onstatenotsaved, RowScopeImplInstance rowScopeImplInstance, RowKtRow1 rowKtRow1) throws InvalidDefinitionException, JsonMappingException {
        int iOnExtraCallback = rowKtRow1.onExtraCallback();
        RuntimeVersionProtobufRuntimeVersionException[] runtimeVersionProtobufRuntimeVersionExceptionArr = new RuntimeVersionProtobufRuntimeVersionException[iOnExtraCallback];
        int i2 = -1;
        for (int i3 = 0; i3 < iOnExtraCallback; i3++) {
            setShowsDialog.IAuthTabCallback iAuthTabCallbackOnExtraCallbackWithResult = rowKtRow1.onExtraCallbackWithResult(i3);
            nDupFenceFd ndupfencefdIAuthTabCallback = rowKtRow1.IAuthTabCallback(i3);
            FragmentKtExternalSyntheticLambda0 fragmentKtExternalSyntheticLambda0OnExtraCallback = rowKtRow1.onExtraCallback(i3);
            if (Boolean.TRUE.equals(supportstartpostponedentertransition.asBinder().ICustomTabsCallbackStubProxy(ndupfencefdIAuthTabCallback))) {
                if (i2 >= 0) {
                    supportstartpostponedentertransition.onExtraCallbackWithResult(onstatenotsaved, "More than one 'any-setter' specified (parameter #%d vs #%d)", Integer.valueOf(i2), Integer.valueOf(i3));
                } else {
                    i2 = i3;
                }
            } else if (fragmentKtExternalSyntheticLambda0OnExtraCallback == null) {
                if (supportstartpostponedentertransition.asBinder().asInterface((nCreate) ndupfencefdIAuthTabCallback) != null) {
                    onWarmupCompleted(supportstartpostponedentertransition, onstatenotsaved, ndupfencefdIAuthTabCallback);
                }
                if (fragmentKtExternalSyntheticLambda0OnExtraCallback == null && iAuthTabCallbackOnExtraCallbackWithResult == null) {
                    supportstartpostponedentertransition.onExtraCallbackWithResult(onstatenotsaved, "Argument #%d of Creator %s has no property name (and is not Injectable): can not use as property-based Creator", Integer.valueOf(i3), rowKtRow1);
                }
            }
            runtimeVersionProtobufRuntimeVersionExceptionArr[i3] = IAuthTabCallback(supportstartpostponedentertransition, onstatenotsaved, fragmentKtExternalSyntheticLambda0OnExtraCallback, i3, ndupfencefdIAuthTabCallback, iAuthTabCallbackOnExtraCallbackWithResult);
        }
        rowScopeImplInstance.onExtraCallbackWithResult(rowKtRow1.onWarmupCompleted(), true, runtimeVersionProtobufRuntimeVersionExceptionArr);
    }

    private boolean onNavigationEvent(RowScopeImplInstance rowScopeImplInstance, nSetBufferTransform nsetbuffertransform, boolean z, boolean z2) {
        Class<?> clsOnExtraCallbackWithResult = nsetbuffertransform.onExtraCallbackWithResult(0);
        if (clsOnExtraCallbackWithResult == String.class || clsOnExtraCallbackWithResult == onExtraCallbackWithResult) {
            if (z || z2) {
                rowScopeImplInstance.onTransact(nsetbuffertransform, z);
            }
            return true;
        }
        if (clsOnExtraCallbackWithResult == Integer.TYPE || clsOnExtraCallbackWithResult == Integer.class) {
            if (z || z2) {
                rowScopeImplInstance.onExtraCallbackWithResult(nsetbuffertransform, z);
            }
            return true;
        }
        if (clsOnExtraCallbackWithResult == Long.TYPE || clsOnExtraCallbackWithResult == Long.class) {
            if (z || z2) {
                rowScopeImplInstance.IAuthTabCallbackDefault(nsetbuffertransform, z);
            }
            return true;
        }
        if (clsOnExtraCallbackWithResult == Double.TYPE || clsOnExtraCallbackWithResult == Double.class) {
            if (z || z2) {
                rowScopeImplInstance.onNavigationEvent(nsetbuffertransform, z);
            }
            return true;
        }
        if (clsOnExtraCallbackWithResult == Boolean.TYPE || clsOnExtraCallbackWithResult == Boolean.class) {
            if (z || z2) {
                rowScopeImplInstance.IAuthTabCallback(nsetbuffertransform, z);
            }
            return true;
        }
        if (clsOnExtraCallbackWithResult == BigInteger.class && (z || z2)) {
            rowScopeImplInstance.onExtraCallback(nsetbuffertransform, z);
        }
        if (clsOnExtraCallbackWithResult == BigDecimal.class && (z || z2)) {
            rowScopeImplInstance.onWarmupCompleted(nsetbuffertransform, z);
        }
        if (!z) {
            return false;
        }
        rowScopeImplInstance.onWarmupCompleted(nsetbuffertransform, z, (RuntimeVersionProtobufRuntimeVersionException[]) null, 0);
        return true;
    }

    private void onWarmupCompleted(supportStartPostponedEnterTransition supportstartpostponedentertransition, onStateNotSaved onstatenotsaved, nDupFenceFd ndupfencefd) throws InvalidDefinitionException, JsonMappingException {
        supportstartpostponedentertransition.onExtraCallbackWithResult(onstatenotsaved, "Cannot define Creator parameter %d as `@JsonUnwrapped`: combination not yet supported", Integer.valueOf(ndupfencefd.asInterface()));
    }

    protected RuntimeVersionProtobufRuntimeVersionException IAuthTabCallback(supportStartPostponedEnterTransition supportstartpostponedentertransition, onStateNotSaved onstatenotsaved, FragmentKtExternalSyntheticLambda0 fragmentKtExternalSyntheticLambda0, int i2, nDupFenceFd ndupfencefd, setShowsDialog.IAuthTabCallback iAuthTabCallback) throws JsonMappingException {
        FragmentKtExternalSyntheticLambda0 fragmentKtExternalSyntheticLambda0ICustomTabsCallbackDefault;
        onFragmentResult onfragmentresult;
        startIntentSenderFromFragment startintentsenderfromfragmentOnNavigationEvent = supportstartpostponedentertransition.onNavigationEvent();
        startActivityFromFragment startactivityfromfragmentAsBinder = supportstartpostponedentertransition.asBinder();
        if (startactivityfromfragmentAsBinder == null) {
            onfragmentresult = onFragmentResult.IAuthTabCallback;
            fragmentKtExternalSyntheticLambda0ICustomTabsCallbackDefault = null;
        } else {
            onFragmentResult onfragmentresultOnExtraCallbackWithResult = onFragmentResult.onExtraCallbackWithResult(startactivityfromfragmentAsBinder.IAuthTabCallbackDefault((nCreate) ndupfencefd), startactivityfromfragmentAsBinder.extraCallbackWithResult(ndupfencefd), startactivityfromfragmentAsBinder.writeTypedObject(ndupfencefd), startactivityfromfragmentAsBinder.ICustomTabsCallback(ndupfencefd));
            fragmentKtExternalSyntheticLambda0ICustomTabsCallbackDefault = startactivityfromfragmentAsBinder.ICustomTabsCallbackDefault(ndupfencefd);
            onfragmentresult = onfragmentresultOnExtraCallbackWithResult;
        }
        JavaType javaTypeOnWarmupCompleted = onWarmupCompleted(supportstartpostponedentertransition, (nCreate) ndupfencefd, ndupfencefd.IAuthTabCallback());
        validateRequestPermissionsRequestCode onextracallback = new validateRequestPermissionsRequestCode.onExtraCallback(fragmentKtExternalSyntheticLambda0, javaTypeOnWarmupCompleted, fragmentKtExternalSyntheticLambda0ICustomTabsCallbackDefault, ndupfencefd, onfragmentresult);
        setColumnCount setcolumncountOnExtraCallback = (setColumnCount) javaTypeOnWarmupCompleted.access000();
        if (setcolumncountOnExtraCallback == null) {
            setcolumncountOnExtraCallback = onExtraCallback(startintentsenderfromfragmentOnNavigationEvent, javaTypeOnWarmupCompleted);
        }
        RemoteViewsTranslatorApi31Impl remoteViewsTranslatorApi31ImplIAuthTabCallback = RemoteViewsTranslatorApi31Impl.IAuthTabCallback(fragmentKtExternalSyntheticLambda0, javaTypeOnWarmupCompleted, onextracallback.IAuthTabCallbackStub(), setcolumncountOnExtraCallback, onstatenotsaved.writeTypedObject(), ndupfencefd, i2, iAuthTabCallback, onExtraCallbackWithResult(startintentsenderfromfragmentOnNavigationEvent, onextracallback, onfragmentresult));
        FragmentActivityExternalSyntheticLambda1<Object> fragmentActivityExternalSyntheticLambda1OnWarmupCompleted = onWarmupCompleted(supportstartpostponedentertransition, (internalPathIteratorPeek) ndupfencefd);
        if (fragmentActivityExternalSyntheticLambda1OnWarmupCompleted == null) {
            fragmentActivityExternalSyntheticLambda1OnWarmupCompleted = (FragmentActivityExternalSyntheticLambda1) javaTypeOnWarmupCompleted.getInterfaceDescriptor();
        }
        return fragmentActivityExternalSyntheticLambda1OnWarmupCompleted != null ? remoteViewsTranslatorApi31ImplIAuthTabCallback.IAuthTabCallback(supportstartpostponedentertransition.onNavigationEvent((FragmentActivityExternalSyntheticLambda1<?>) fragmentActivityExternalSyntheticLambda1OnWarmupCompleted, (validateRequestPermissionsRequestCode) remoteViewsTranslatorApi31ImplIAuthTabCallback, javaTypeOnWarmupCompleted)) : remoteViewsTranslatorApi31ImplIAuthTabCallback;
    }

    private onFragmentResult onExtraCallbackWithResult(RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27, validateRequestPermissionsRequestCode validaterequestpermissionsrequestcode, onFragmentResult onfragmentresult) {
        getLayoutInflater getlayoutinflaterOnExtraCallback;
        getLayoutInflater getlayoutinflaterOnNavigationEvent;
        getEnterTransitionCallback$onExtraCallbackWithResult getentertransitioncallback_onextracallbackwithresultOnPostMessage;
        startActivityFromFragment startactivityfromfragmentAsBinder = radioButtonKtRadioButtonElement27.asBinder();
        nCreate ncreateOnExtraCallback = validaterequestpermissionsrequestcode.onExtraCallback();
        getLayoutInflater getlayoutinflaterOnNavigationEvent2 = null;
        if (ncreateOnExtraCallback != null) {
            if (startactivityfromfragmentAsBinder == null || (getentertransitioncallback_onextracallbackwithresultOnPostMessage = startactivityfromfragmentAsBinder.onPostMessage(ncreateOnExtraCallback)) == null) {
                getlayoutinflaterOnNavigationEvent = null;
            } else {
                getlayoutinflaterOnNavigationEvent = getentertransitioncallback_onextracallbackwithresultOnPostMessage.onNavigationEvent();
                getlayoutinflaterOnNavigationEvent2 = getentertransitioncallback_onextracallbackwithresultOnPostMessage.onExtraCallback();
            }
            getEnterTransitionCallback$onExtraCallbackWithResult getentertransitioncallback_onextracallbackwithresultIAuthTabCallbackStub = radioButtonKtRadioButtonElement27.onExtraCallbackWithResult(validaterequestpermissionsrequestcode.IAuthTabCallback().asBinder()).IAuthTabCallbackStub();
            if (getentertransitioncallback_onextracallbackwithresultIAuthTabCallbackStub != null) {
                getLayoutInflater getlayoutinflaterOnNavigationEvent3 = getlayoutinflaterOnNavigationEvent == null ? getentertransitioncallback_onextracallbackwithresultIAuthTabCallbackStub.onNavigationEvent() : getlayoutinflaterOnNavigationEvent;
                if (getlayoutinflaterOnNavigationEvent2 == null) {
                    getlayoutinflaterOnNavigationEvent2 = getentertransitioncallback_onextracallbackwithresultIAuthTabCallbackStub.onExtraCallback();
                }
                getlayoutinflaterOnExtraCallback = getlayoutinflaterOnNavigationEvent2;
                getlayoutinflaterOnNavigationEvent2 = getlayoutinflaterOnNavigationEvent3;
            } else {
                getlayoutinflaterOnExtraCallback = getlayoutinflaterOnNavigationEvent2;
                getlayoutinflaterOnNavigationEvent2 = getlayoutinflaterOnNavigationEvent;
            }
        } else {
            getlayoutinflaterOnExtraCallback = null;
        }
        getEnterTransitionCallback$onExtraCallbackWithResult getentertransitioncallback_onextracallbackwithresultIAuthTabCallback_Parcel = radioButtonKtRadioButtonElement27.IAuthTabCallback_Parcel();
        if (getlayoutinflaterOnNavigationEvent2 == null) {
            getlayoutinflaterOnNavigationEvent2 = getentertransitioncallback_onextracallbackwithresultIAuthTabCallback_Parcel.onNavigationEvent();
        }
        if (getlayoutinflaterOnExtraCallback == null) {
            getlayoutinflaterOnExtraCallback = getentertransitioncallback_onextracallbackwithresultIAuthTabCallback_Parcel.onExtraCallback();
        }
        return (getlayoutinflaterOnNavigationEvent2 == null && getlayoutinflaterOnExtraCallback == null) ? onfragmentresult : onfragmentresult.onNavigationEvent(getlayoutinflaterOnNavigationEvent2, getlayoutinflaterOnExtraCallback);
    }

    @Override // o.RunCallbackActionKt
    public FragmentActivityExternalSyntheticLambda1<?> onExtraCallbackWithResult(supportStartPostponedEnterTransition supportstartpostponedentertransition, ArrayType arrayType, onStateNotSaved onstatenotsaved) throws JsonMappingException {
        startIntentSenderFromFragment startintentsenderfromfragmentOnNavigationEvent = supportstartpostponedentertransition.onNavigationEvent();
        JavaType javaTypeIAuthTabCallbackStub = arrayType.IAuthTabCallbackStub();
        FragmentActivityExternalSyntheticLambda1<?> fragmentActivityExternalSyntheticLambda1 = (FragmentActivityExternalSyntheticLambda1) javaTypeIAuthTabCallbackStub.getInterfaceDescriptor();
        setColumnCount setcolumncountOnExtraCallback = (setColumnCount) javaTypeIAuthTabCallbackStub.access000();
        if (setcolumncountOnExtraCallback == null) {
            setcolumncountOnExtraCallback = onExtraCallback(startintentsenderfromfragmentOnNavigationEvent, javaTypeIAuthTabCallbackStub);
        }
        setColumnCount setcolumncount = setcolumncountOnExtraCallback;
        FragmentActivityExternalSyntheticLambda1<?> fragmentActivityExternalSyntheticLambda1OnExtraCallbackWithResult = onExtraCallbackWithResult(arrayType, startintentsenderfromfragmentOnNavigationEvent, onstatenotsaved, setcolumncount, fragmentActivityExternalSyntheticLambda1);
        if (fragmentActivityExternalSyntheticLambda1OnExtraCallbackWithResult == null) {
            if (fragmentActivityExternalSyntheticLambda1 == null) {
                if (javaTypeIAuthTabCallbackStub.ICustomTabsCallbackStub()) {
                    fragmentActivityExternalSyntheticLambda1OnExtraCallbackWithResult = SingleBufferedCanvasRenderermRenderQueue1ExternalSyntheticLambda0.onExtraCallback(javaTypeIAuthTabCallbackStub.asBinder());
                } else if (javaTypeIAuthTabCallbackStub.onNavigationEvent(String.class)) {
                    fragmentActivityExternalSyntheticLambda1OnExtraCallbackWithResult = GLRendererExternalSyntheticLambda1.onExtraCallbackWithResult;
                }
            }
            if (fragmentActivityExternalSyntheticLambda1OnExtraCallbackWithResult == null) {
                fragmentActivityExternalSyntheticLambda1OnExtraCallbackWithResult = new TextureProducerExternalSyntheticLambda2<>(arrayType, fragmentActivityExternalSyntheticLambda1, setcolumncount);
            }
        }
        if (this._factoryConfig.onExtraCallbackWithResult()) {
            Iterator<RemoteViewsInfo> it = this._factoryConfig.onWarmupCompleted().iterator();
            while (it.hasNext()) {
                fragmentActivityExternalSyntheticLambda1OnExtraCallbackWithResult = it.next().onNavigationEvent(startintentsenderfromfragmentOnNavigationEvent, arrayType, onstatenotsaved, fragmentActivityExternalSyntheticLambda1OnExtraCallbackWithResult);
            }
        }
        return fragmentActivityExternalSyntheticLambda1OnExtraCallbackWithResult;
    }

    @Override // o.RunCallbackActionKt
    public FragmentActivityExternalSyntheticLambda1<?> IAuthTabCallback(supportStartPostponedEnterTransition supportstartpostponedentertransition, CollectionType collectionType, onStateNotSaved onstatenotsaved) throws JsonMappingException {
        CollectionType collectionTypeOnExtraCallbackWithResult;
        setRenderCallback gLFrontBufferedRendererExternalSyntheticLambda2;
        JavaType javaTypeIAuthTabCallbackStub = collectionType.IAuthTabCallbackStub();
        FragmentActivityExternalSyntheticLambda1<?> fragmentActivityExternalSyntheticLambda1 = (FragmentActivityExternalSyntheticLambda1) javaTypeIAuthTabCallbackStub.getInterfaceDescriptor();
        startIntentSenderFromFragment startintentsenderfromfragmentOnNavigationEvent = supportstartpostponedentertransition.onNavigationEvent();
        setColumnCount setcolumncountOnExtraCallback = (setColumnCount) javaTypeIAuthTabCallbackStub.access000();
        if (setcolumncountOnExtraCallback == null) {
            setcolumncountOnExtraCallback = onExtraCallback(startintentsenderfromfragmentOnNavigationEvent, javaTypeIAuthTabCallbackStub);
        }
        setColumnCount setcolumncount = setcolumncountOnExtraCallback;
        setRenderCallback setrendercallbackOnExtraCallback = onExtraCallback(collectionType, startintentsenderfromfragmentOnNavigationEvent, onstatenotsaved, setcolumncount, fragmentActivityExternalSyntheticLambda1);
        if (setrendercallbackOnExtraCallback == null) {
            Class<?> clsAsBinder = collectionType.asBinder();
            if (fragmentActivityExternalSyntheticLambda1 == null && EnumSet.class.isAssignableFrom(clsAsBinder)) {
                setrendercallbackOnExtraCallback = new setRenderCallback(javaTypeIAuthTabCallbackStub, (FragmentActivityExternalSyntheticLambda1) null, setcolumncount);
            }
        }
        if (setrendercallbackOnExtraCallback == null) {
            if ((collectionType.onRelationshipValidationResult() || collectionType.writeTypedObject()) && (collectionTypeOnExtraCallbackWithResult = onExtraCallbackWithResult((JavaType) collectionType, startintentsenderfromfragmentOnNavigationEvent)) != null) {
                onstatenotsaved = startintentsenderfromfragmentOnNavigationEvent.IAuthTabCallback((JavaType) collectionTypeOnExtraCallbackWithResult);
                collectionType = collectionTypeOnExtraCallbackWithResult;
            }
            if (setrendercallbackOnExtraCallback == null) {
                internalGetVerifier internalgetverifierOnNavigationEvent = onNavigationEvent(supportstartpostponedentertransition, onstatenotsaved);
                if (!internalgetverifierOnNavigationEvent.IAuthTabCallbackDefault()) {
                    if (collectionType.onNavigationEvent(ArrayBlockingQueue.class)) {
                        return new GLFrontBufferedRendererExternalSyntheticLambda0(collectionType, fragmentActivityExternalSyntheticLambda1, setcolumncount, internalgetverifierOnNavigationEvent);
                    }
                    FragmentActivityExternalSyntheticLambda1<?> fragmentActivityExternalSyntheticLambda1OnWarmupCompleted = ResourceColorProvider.onWarmupCompleted(supportstartpostponedentertransition, collectionType);
                    if (fragmentActivityExternalSyntheticLambda1OnWarmupCompleted != null) {
                        return fragmentActivityExternalSyntheticLambda1OnWarmupCompleted;
                    }
                }
                if (javaTypeIAuthTabCallbackStub.onNavigationEvent(String.class)) {
                    gLFrontBufferedRendererExternalSyntheticLambda2 = new GLThreadExternalSyntheticLambda0(collectionType, fragmentActivityExternalSyntheticLambda1, internalgetverifierOnNavigationEvent);
                } else {
                    gLFrontBufferedRendererExternalSyntheticLambda2 = new GLFrontBufferedRendererExternalSyntheticLambda2(collectionType, fragmentActivityExternalSyntheticLambda1, setcolumncount, internalgetverifierOnNavigationEvent);
                }
                setrendercallbackOnExtraCallback = gLFrontBufferedRendererExternalSyntheticLambda2;
            }
        }
        if (this._factoryConfig.onExtraCallbackWithResult()) {
            Iterator<RemoteViewsInfo> it = this._factoryConfig.onWarmupCompleted().iterator();
            while (it.hasNext()) {
                setrendercallbackOnExtraCallback = it.next().onExtraCallback(startintentsenderfromfragmentOnNavigationEvent, collectionType, onstatenotsaved, (FragmentActivityExternalSyntheticLambda1<?>) setrendercallbackOnExtraCallback);
            }
        }
        return setrendercallbackOnExtraCallback;
    }

    protected CollectionType onExtraCallbackWithResult(JavaType javaType, startIntentSenderFromFragment startintentsenderfromfragment) {
        Class<?> clsOnNavigationEvent = onWarmupCompleted.onNavigationEvent(javaType);
        if (clsOnNavigationEvent != null) {
            return startintentsenderfromfragment.extraCallback().onWarmupCompleted(javaType, clsOnNavigationEvent, true);
        }
        return null;
    }

    @Override // o.RunCallbackActionKt
    public FragmentActivityExternalSyntheticLambda1<?> onExtraCallbackWithResult(supportStartPostponedEnterTransition supportstartpostponedentertransition, CollectionLikeType collectionLikeType, onStateNotSaved onstatenotsaved) throws JsonMappingException {
        JavaType javaTypeIAuthTabCallbackStub = collectionLikeType.IAuthTabCallbackStub();
        FragmentActivityExternalSyntheticLambda1<?> fragmentActivityExternalSyntheticLambda1 = (FragmentActivityExternalSyntheticLambda1) javaTypeIAuthTabCallbackStub.getInterfaceDescriptor();
        startIntentSenderFromFragment startintentsenderfromfragmentOnNavigationEvent = supportstartpostponedentertransition.onNavigationEvent();
        setColumnCount setcolumncount = (setColumnCount) javaTypeIAuthTabCallbackStub.access000();
        FragmentActivityExternalSyntheticLambda1<?> fragmentActivityExternalSyntheticLambda1OnExtraCallbackWithResult = onExtraCallbackWithResult(collectionLikeType, startintentsenderfromfragmentOnNavigationEvent, onstatenotsaved, setcolumncount == null ? onExtraCallback(startintentsenderfromfragmentOnNavigationEvent, javaTypeIAuthTabCallbackStub) : setcolumncount, fragmentActivityExternalSyntheticLambda1);
        if (fragmentActivityExternalSyntheticLambda1OnExtraCallbackWithResult != null && this._factoryConfig.onExtraCallbackWithResult()) {
            Iterator<RemoteViewsInfo> it = this._factoryConfig.onWarmupCompleted().iterator();
            while (it.hasNext()) {
                fragmentActivityExternalSyntheticLambda1OnExtraCallbackWithResult = it.next().onExtraCallback(startintentsenderfromfragmentOnNavigationEvent, collectionLikeType, onstatenotsaved, fragmentActivityExternalSyntheticLambda1OnExtraCallbackWithResult);
            }
        }
        return fragmentActivityExternalSyntheticLambda1OnExtraCallbackWithResult;
    }

    @Override // o.RunCallbackActionKt
    public FragmentActivityExternalSyntheticLambda1<?> onExtraCallbackWithResult(supportStartPostponedEnterTransition supportstartpostponedentertransition, MapType mapType, onStateNotSaved onstatenotsaved) throws JsonMappingException {
        MapType mapType2;
        onStateNotSaved onstatenotsavedIAuthTabCallback;
        internalGetVerifier internalgetverifierOnNavigationEvent;
        startIntentSenderFromFragment startintentsenderfromfragmentOnNavigationEvent = supportstartpostponedentertransition.onNavigationEvent();
        JavaType javaTypeAsInterface = mapType.asInterface();
        JavaType javaTypeIAuthTabCallbackStub = mapType.IAuthTabCallbackStub();
        FragmentActivityExternalSyntheticLambda1<?> fragmentActivityExternalSyntheticLambda1 = (FragmentActivityExternalSyntheticLambda1) javaTypeIAuthTabCallbackStub.getInterfaceDescriptor();
        setDrawDisappearingViewsLast setdrawdisappearingviewslast = (setDrawDisappearingViewsLast) javaTypeAsInterface.getInterfaceDescriptor();
        setColumnCount setcolumncount = (setColumnCount) javaTypeIAuthTabCallbackStub.access000();
        setColumnCount setcolumncountOnExtraCallback = setcolumncount == null ? onExtraCallback(startintentsenderfromfragmentOnNavigationEvent, javaTypeIAuthTabCallbackStub) : setcolumncount;
        GLFrontBufferedRenderermSurfaceCallbacks1ExternalSyntheticLambda0 gLFrontBufferedRenderermSurfaceCallbacks1ExternalSyntheticLambda0OnWarmupCompleted = onWarmupCompleted(mapType, startintentsenderfromfragmentOnNavigationEvent, onstatenotsaved, setdrawdisappearingviewslast, setcolumncountOnExtraCallback, fragmentActivityExternalSyntheticLambda1);
        if (gLFrontBufferedRenderermSurfaceCallbacks1ExternalSyntheticLambda0OnWarmupCompleted == null) {
            Class<?> clsAsBinder = mapType.asBinder();
            if (EnumMap.class.isAssignableFrom(clsAsBinder)) {
                if (clsAsBinder == EnumMap.class) {
                    onstatenotsavedIAuthTabCallback = onstatenotsaved;
                    internalgetverifierOnNavigationEvent = null;
                } else {
                    onstatenotsavedIAuthTabCallback = onstatenotsaved;
                    internalgetverifierOnNavigationEvent = onNavigationEvent(supportstartpostponedentertransition, onstatenotsavedIAuthTabCallback);
                }
                if (!javaTypeAsInterface.onActivityResized()) {
                    throw new IllegalArgumentException("Cannot construct EnumMap; generic (key) type not available");
                }
                gLFrontBufferedRenderermSurfaceCallbacks1ExternalSyntheticLambda0OnWarmupCompleted = new GLFrontBufferedRenderermSurfaceCallbacks1ExternalSyntheticLambda0(mapType, internalgetverifierOnNavigationEvent, (setDrawDisappearingViewsLast) null, fragmentActivityExternalSyntheticLambda1, setcolumncountOnExtraCallback, (RuntimeVersionRuntimeDomain) null);
            } else {
                onstatenotsavedIAuthTabCallback = onstatenotsaved;
            }
            if (gLFrontBufferedRenderermSurfaceCallbacks1ExternalSyntheticLambda0OnWarmupCompleted == null) {
                if (mapType.onRelationshipValidationResult() || mapType.writeTypedObject()) {
                    mapType2 = mapType;
                    MapType mapTypeIAuthTabCallback = IAuthTabCallback((JavaType) mapType2, startintentsenderfromfragmentOnNavigationEvent);
                    if (mapTypeIAuthTabCallback != null) {
                        mapTypeIAuthTabCallback.asBinder();
                        onstatenotsavedIAuthTabCallback = startintentsenderfromfragmentOnNavigationEvent.IAuthTabCallback((JavaType) mapTypeIAuthTabCallback);
                        mapType2 = mapTypeIAuthTabCallback;
                    }
                } else {
                    gLFrontBufferedRenderermSurfaceCallbacks1ExternalSyntheticLambda0OnWarmupCompleted = ResourceColorProvider.onExtraCallbackWithResult(supportstartpostponedentertransition, mapType);
                    if (gLFrontBufferedRenderermSurfaceCallbacks1ExternalSyntheticLambda0OnWarmupCompleted != null) {
                        return gLFrontBufferedRenderermSurfaceCallbacks1ExternalSyntheticLambda0OnWarmupCompleted;
                    }
                    mapType2 = mapType;
                }
                if (gLFrontBufferedRenderermSurfaceCallbacks1ExternalSyntheticLambda0OnWarmupCompleted == null) {
                    gLFrontBufferedRenderermSurfaceCallbacks1ExternalSyntheticLambda0OnWarmupCompleted = new LowLatencyCanvasViewupdate2ExternalSyntheticLambda0(mapType2, onNavigationEvent(supportstartpostponedentertransition, onstatenotsavedIAuthTabCallback), setdrawdisappearingviewslast, fragmentActivityExternalSyntheticLambda1, setcolumncountOnExtraCallback);
                    restoreViewState.onExtraCallbackWithResult onExtraCallbackWithResult2 = startintentsenderfromfragmentOnNavigationEvent.onExtraCallbackWithResult(Map.class, onstatenotsavedIAuthTabCallback.ICustomTabsCallback());
                    gLFrontBufferedRenderermSurfaceCallbacks1ExternalSyntheticLambda0OnWarmupCompleted.onExtraCallback(onExtraCallbackWithResult2 == null ? null : onExtraCallbackWithResult2.onNavigationEvent());
                    callStartTransitionListener.onNavigationEvent onNavigationEvent = startintentsenderfromfragmentOnNavigationEvent.onNavigationEvent(Map.class, onstatenotsavedIAuthTabCallback.ICustomTabsCallback());
                    gLFrontBufferedRenderermSurfaceCallbacks1ExternalSyntheticLambda0OnWarmupCompleted.IAuthTabCallback(onNavigationEvent != null ? onNavigationEvent.onExtraCallback() : null);
                }
            } else {
                mapType2 = mapType;
            }
        } else {
            mapType2 = mapType;
            onstatenotsavedIAuthTabCallback = onstatenotsaved;
        }
        if (this._factoryConfig.onExtraCallbackWithResult()) {
            Iterator<RemoteViewsInfo> it = this._factoryConfig.onWarmupCompleted().iterator();
            while (it.hasNext()) {
                gLFrontBufferedRenderermSurfaceCallbacks1ExternalSyntheticLambda0OnWarmupCompleted = it.next().onExtraCallbackWithResult(startintentsenderfromfragmentOnNavigationEvent, mapType2, onstatenotsavedIAuthTabCallback, gLFrontBufferedRenderermSurfaceCallbacks1ExternalSyntheticLambda0OnWarmupCompleted);
            }
        }
        return gLFrontBufferedRenderermSurfaceCallbacks1ExternalSyntheticLambda0OnWarmupCompleted;
    }

    protected MapType IAuthTabCallback(JavaType javaType, startIntentSenderFromFragment startintentsenderfromfragment) {
        Class<?> clsIAuthTabCallback = onWarmupCompleted.IAuthTabCallback(javaType);
        if (clsIAuthTabCallback != null) {
            return startintentsenderfromfragment.extraCallback().onWarmupCompleted(javaType, clsIAuthTabCallback, true);
        }
        return null;
    }

    @Override // o.RunCallbackActionKt
    public FragmentActivityExternalSyntheticLambda1<?> IAuthTabCallback(supportStartPostponedEnterTransition supportstartpostponedentertransition, MapLikeType mapLikeType, onStateNotSaved onstatenotsaved) throws JsonMappingException {
        JavaType javaTypeAsInterface = mapLikeType.asInterface();
        JavaType javaTypeIAuthTabCallbackStub = mapLikeType.IAuthTabCallbackStub();
        startIntentSenderFromFragment startintentsenderfromfragmentOnNavigationEvent = supportstartpostponedentertransition.onNavigationEvent();
        FragmentActivityExternalSyntheticLambda1<?> fragmentActivityExternalSyntheticLambda1 = (FragmentActivityExternalSyntheticLambda1) javaTypeIAuthTabCallbackStub.getInterfaceDescriptor();
        setDrawDisappearingViewsLast setdrawdisappearingviewslast = (setDrawDisappearingViewsLast) javaTypeAsInterface.getInterfaceDescriptor();
        setColumnCount setcolumncountOnExtraCallback = (setColumnCount) javaTypeIAuthTabCallbackStub.access000();
        if (setcolumncountOnExtraCallback == null) {
            setcolumncountOnExtraCallback = onExtraCallback(startintentsenderfromfragmentOnNavigationEvent, javaTypeIAuthTabCallbackStub);
        }
        FragmentActivityExternalSyntheticLambda1<?> fragmentActivityExternalSyntheticLambda1OnExtraCallback = onExtraCallback(mapLikeType, startintentsenderfromfragmentOnNavigationEvent, onstatenotsaved, setdrawdisappearingviewslast, setcolumncountOnExtraCallback, fragmentActivityExternalSyntheticLambda1);
        if (fragmentActivityExternalSyntheticLambda1OnExtraCallback != null && this._factoryConfig.onExtraCallbackWithResult()) {
            Iterator<RemoteViewsInfo> it = this._factoryConfig.onWarmupCompleted().iterator();
            while (it.hasNext()) {
                fragmentActivityExternalSyntheticLambda1OnExtraCallback = it.next().onWarmupCompleted(startintentsenderfromfragmentOnNavigationEvent, mapLikeType, onstatenotsaved, fragmentActivityExternalSyntheticLambda1OnExtraCallback);
            }
        }
        return fragmentActivityExternalSyntheticLambda1OnExtraCallback;
    }

    @Override // o.RunCallbackActionKt
    public FragmentActivityExternalSyntheticLambda1<?> onWarmupCompleted(supportStartPostponedEnterTransition supportstartpostponedentertransition, JavaType javaType, onStateNotSaved onstatenotsaved) throws InvalidDefinitionException, JsonMappingException {
        FragmentActivityExternalSyntheticLambda1<?> fragmentActivityExternalSyntheticLambda1OnExtraCallback;
        startIntentSenderFromFragment startintentsenderfromfragmentOnNavigationEvent = supportstartpostponedentertransition.onNavigationEvent();
        Class<?> clsAsBinder = javaType.asBinder();
        FragmentActivityExternalSyntheticLambda1<?> fragmentActivityExternalSyntheticLambda1OnExtraCallback2 = onExtraCallback(clsAsBinder, startintentsenderfromfragmentOnNavigationEvent, onstatenotsaved);
        if (fragmentActivityExternalSyntheticLambda1OnExtraCallback2 == null) {
            if (clsAsBinder == Enum.class) {
                return RadioButtonKtisSelectableGroup1.onExtraCallback(onstatenotsaved);
            }
            internalGetVerifier internalgetverifierIAuthTabCallback = IAuthTabCallback(supportstartpostponedentertransition, onstatenotsaved);
            RuntimeVersionProtobufRuntimeVersionException[] runtimeVersionProtobufRuntimeVersionExceptionArrOnExtraCallback = internalgetverifierIAuthTabCallback == null ? null : internalgetverifierIAuthTabCallback.onExtraCallback(supportstartpostponedentertransition.onNavigationEvent());
            Iterator<nGetPreviousReleaseFenceFd> it = onstatenotsaved.extraCallbackWithResult().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                nGetPreviousReleaseFenceFd next = it.next();
                if (onWarmupCompleted((RadioButtonKtRadioButtonElement27<?>) startintentsenderfromfragmentOnNavigationEvent, (internalPathIteratorPeek) next)) {
                    if (next.access100() == 0) {
                        fragmentActivityExternalSyntheticLambda1OnExtraCallback = LowLatencyCanvasView.onNavigationEvent(startintentsenderfromfragmentOnNavigationEvent, clsAsBinder, next);
                    } else {
                        if (!next.writeTypedObject().isAssignableFrom(clsAsBinder)) {
                            supportstartpostponedentertransition.onWarmupCompleted(javaType, String.format("Invalid `@JsonCreator` annotated Enum factory method [%s]: needs to return compatible type", next.toString()));
                        }
                        fragmentActivityExternalSyntheticLambda1OnExtraCallback = LowLatencyCanvasView.onExtraCallback(startintentsenderfromfragmentOnNavigationEvent, clsAsBinder, next, internalgetverifierIAuthTabCallback, runtimeVersionProtobufRuntimeVersionExceptionArrOnExtraCallback);
                    }
                    fragmentActivityExternalSyntheticLambda1OnExtraCallback2 = fragmentActivityExternalSyntheticLambda1OnExtraCallback;
                }
            }
            if (fragmentActivityExternalSyntheticLambda1OnExtraCallback2 == null) {
                fragmentActivityExternalSyntheticLambda1OnExtraCallback2 = new LowLatencyCanvasView<>(IAuthTabCallback(clsAsBinder, startintentsenderfromfragmentOnNavigationEvent, onstatenotsaved), startintentsenderfromfragmentOnNavigationEvent.onExtraCallback(setLayoutTransition.ACCEPT_CASE_INSENSITIVE_ENUMS), onWarmupCompleted(startintentsenderfromfragmentOnNavigationEvent, onstatenotsaved.ICustomTabsCallback()), SavedStateHandleSaverKtExternalSyntheticLambda1.onExtraCallbackWithResult(startintentsenderfromfragmentOnNavigationEvent, onstatenotsaved.ICustomTabsCallback()));
            }
        }
        if (this._factoryConfig.onExtraCallbackWithResult()) {
            Iterator<RemoteViewsInfo> it2 = this._factoryConfig.onWarmupCompleted().iterator();
            while (it2.hasNext()) {
                fragmentActivityExternalSyntheticLambda1OnExtraCallback2 = it2.next().IAuthTabCallback(startintentsenderfromfragmentOnNavigationEvent, javaType, onstatenotsaved, fragmentActivityExternalSyntheticLambda1OnExtraCallback2);
            }
        }
        return fragmentActivityExternalSyntheticLambda1OnExtraCallback2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.RunCallbackActionKt
    public FragmentActivityExternalSyntheticLambda1<?> IAuthTabCallback(startIntentSenderFromFragment startintentsenderfromfragment, JavaType javaType, onStateNotSaved onstatenotsaved) throws JsonMappingException {
        Class<?> clsAsBinder = javaType.asBinder();
        FragmentActivityExternalSyntheticLambda1<?> fragmentActivityExternalSyntheticLambda1OnNavigationEvent = onNavigationEvent((Class<? extends FragmentActivityExternalSyntheticLambda3>) clsAsBinder, startintentsenderfromfragment, onstatenotsaved);
        return fragmentActivityExternalSyntheticLambda1OnNavigationEvent != null ? fragmentActivityExternalSyntheticLambda1OnNavigationEvent : LowLatencyCanvasViewExternalSyntheticLambda2.onExtraCallback(clsAsBinder);
    }

    @Override // o.RunCallbackActionKt
    public FragmentActivityExternalSyntheticLambda1<?> onNavigationEvent(supportStartPostponedEnterTransition supportstartpostponedentertransition, ReferenceType referenceType, onStateNotSaved onstatenotsaved) throws JsonMappingException {
        JavaType javaTypeIAuthTabCallbackStub = referenceType.IAuthTabCallbackStub();
        FragmentActivityExternalSyntheticLambda1<?> fragmentActivityExternalSyntheticLambda1 = (FragmentActivityExternalSyntheticLambda1) javaTypeIAuthTabCallbackStub.getInterfaceDescriptor();
        startIntentSenderFromFragment startintentsenderfromfragmentOnNavigationEvent = supportstartpostponedentertransition.onNavigationEvent();
        setColumnCount setcolumncountOnExtraCallback = (setColumnCount) javaTypeIAuthTabCallbackStub.access000();
        if (setcolumncountOnExtraCallback == null) {
            setcolumncountOnExtraCallback = onExtraCallback(startintentsenderfromfragmentOnNavigationEvent, javaTypeIAuthTabCallbackStub);
        }
        setColumnCount setcolumncount = setcolumncountOnExtraCallback;
        FragmentActivityExternalSyntheticLambda1<?> fragmentActivityExternalSyntheticLambda1IAuthTabCallback = IAuthTabCallback(referenceType, startintentsenderfromfragmentOnNavigationEvent, onstatenotsaved, setcolumncount, fragmentActivityExternalSyntheticLambda1);
        if (fragmentActivityExternalSyntheticLambda1IAuthTabCallback == null && referenceType.onWarmupCompleted(AtomicReference.class)) {
            return new GLFrontBufferedRenderermMultiBufferedRenderCallbacks1ExternalSyntheticLambda0(referenceType, referenceType.asBinder() == AtomicReference.class ? null : onNavigationEvent(supportstartpostponedentertransition, onstatenotsaved), setcolumncount, fragmentActivityExternalSyntheticLambda1);
        }
        if (fragmentActivityExternalSyntheticLambda1IAuthTabCallback != null && this._factoryConfig.onExtraCallbackWithResult()) {
            Iterator<RemoteViewsInfo> it = this._factoryConfig.onWarmupCompleted().iterator();
            while (it.hasNext()) {
                fragmentActivityExternalSyntheticLambda1IAuthTabCallback = it.next().onNavigationEvent(startintentsenderfromfragmentOnNavigationEvent, referenceType, onstatenotsaved, fragmentActivityExternalSyntheticLambda1IAuthTabCallback);
            }
        }
        return fragmentActivityExternalSyntheticLambda1IAuthTabCallback;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.fasterxml.jackson.databind.JsonMappingException */
    @Override // o.RunCallbackActionKt
    public setColumnCount onExtraCallback(startIntentSenderFromFragment startintentsenderfromfragment, JavaType javaType) throws JsonMappingException {
        JavaType javaTypeOnNavigationEvent;
        AngleMeasurerExternalSyntheticLambda0 angleMeasurerExternalSyntheticLambda0ICustomTabsCallback = startintentsenderfromfragment.asBinder(javaType.asBinder()).ICustomTabsCallback();
        setPrinter<?> setprinterOnExtraCallbackWithResult = startintentsenderfromfragment.asBinder().onExtraCallbackWithResult(startintentsenderfromfragment, angleMeasurerExternalSyntheticLambda0ICustomTabsCallback, javaType);
        if (setprinterOnExtraCallbackWithResult == null && (setprinterOnExtraCallbackWithResult = startintentsenderfromfragment.onExtraCallbackWithResult(javaType)) == null) {
            return null;
        }
        Collection<SurfaceControlV33TransactionExternalSyntheticLambda1> collectionOnNavigationEvent = startintentsenderfromfragment.ICustomTabsCallbackStub().onNavigationEvent(startintentsenderfromfragment, angleMeasurerExternalSyntheticLambda0ICustomTabsCallback);
        if (setprinterOnExtraCallbackWithResult.onWarmupCompleted() == null && javaType.writeTypedObject() && (javaTypeOnNavigationEvent = onNavigationEvent(startintentsenderfromfragment, javaType)) != null && !javaTypeOnNavigationEvent.onNavigationEvent(javaType.asBinder())) {
            setprinterOnExtraCallbackWithResult = setprinterOnExtraCallbackWithResult.onExtraCallbackWithResult(javaTypeOnNavigationEvent.asBinder());
        }
        try {
            return setprinterOnExtraCallbackWithResult.onWarmupCompleted(startintentsenderfromfragment, javaType, collectionOnNavigationEvent);
        } catch (IllegalArgumentException | IllegalStateException e) {
            throw InvalidDefinitionException.onExtraCallbackWithResult((getViewLifecycleOwner) null, SavedStateHandleImplExternalSyntheticLambda0.onExtraCallback(e), javaType).IAuthTabCallback(e);
        }
    }

    protected FragmentActivityExternalSyntheticLambda1<?> IAuthTabCallback(supportStartPostponedEnterTransition supportstartpostponedentertransition, JavaType javaType, onStateNotSaved onstatenotsaved) throws JsonMappingException {
        return PathIteratorPreApi34Impl.onNavigationEvent.onNavigationEvent(javaType, supportstartpostponedentertransition.onNavigationEvent(), onstatenotsaved);
    }

    @Override // o.RunCallbackActionKt
    public setDrawDisappearingViewsLast IAuthTabCallback(supportStartPostponedEnterTransition supportstartpostponedentertransition, JavaType javaType) throws JsonMappingException {
        startIntentSenderFromFragment startintentsenderfromfragmentOnNavigationEvent = supportstartpostponedentertransition.onNavigationEvent();
        onStateNotSaved onstatenotsavedOnWarmupCompleted = startintentsenderfromfragmentOnNavigationEvent.onWarmupCompleted(javaType);
        setDrawDisappearingViewsLast setdrawdisappearingviewslastOnExtraCallbackWithResult = onExtraCallbackWithResult(supportstartpostponedentertransition, onstatenotsavedOnWarmupCompleted.ICustomTabsCallback());
        if (setdrawdisappearingviewslastOnExtraCallbackWithResult == null && this._factoryConfig.IAuthTabCallbackStub()) {
            Iterator<internalGetValueMap> it = this._factoryConfig.IAuthTabCallbackDefault().iterator();
            while (it.hasNext() && (setdrawdisappearingviewslastOnExtraCallbackWithResult = it.next().onExtraCallback(javaType, startintentsenderfromfragmentOnNavigationEvent, onstatenotsavedOnWarmupCompleted)) == null) {
            }
        }
        if (setdrawdisappearingviewslastOnExtraCallbackWithResult == null) {
            if (javaType.onActivityLayout()) {
                setdrawdisappearingviewslastOnExtraCallbackWithResult = onExtraCallbackWithResult(supportstartpostponedentertransition, javaType);
            } else {
                setdrawdisappearingviewslastOnExtraCallbackWithResult = GLFrameBufferRendererSurfaceViewProvidercreateSurfaceControl1surfaceHolderCallback1ExternalSyntheticLambda0.onNavigationEvent(startintentsenderfromfragmentOnNavigationEvent, javaType);
            }
        }
        if (setdrawdisappearingviewslastOnExtraCallbackWithResult != null && this._factoryConfig.onExtraCallbackWithResult()) {
            Iterator<RemoteViewsInfo> it2 = this._factoryConfig.onWarmupCompleted().iterator();
            while (it2.hasNext()) {
                setdrawdisappearingviewslastOnExtraCallbackWithResult = it2.next().onNavigationEvent(startintentsenderfromfragmentOnNavigationEvent, javaType, setdrawdisappearingviewslastOnExtraCallbackWithResult);
            }
        }
        return setdrawdisappearingviewslastOnExtraCallbackWithResult;
    }

    private setDrawDisappearingViewsLast onExtraCallbackWithResult(supportStartPostponedEnterTransition supportstartpostponedentertransition, JavaType javaType) throws JsonMappingException {
        startIntentSenderFromFragment startintentsenderfromfragmentOnNavigationEvent = supportstartpostponedentertransition.onNavigationEvent();
        Class<?> clsAsBinder = javaType.asBinder();
        onStateNotSaved onstatenotsavedOnNavigationEvent = startintentsenderfromfragmentOnNavigationEvent.onNavigationEvent(javaType);
        setDrawDisappearingViewsLast setdrawdisappearingviewslastOnExtraCallbackWithResult = onExtraCallbackWithResult(supportstartpostponedentertransition, onstatenotsavedOnNavigationEvent.ICustomTabsCallback());
        if (setdrawdisappearingviewslastOnExtraCallbackWithResult != null) {
            return setdrawdisappearingviewslastOnExtraCallbackWithResult;
        }
        FragmentActivityExternalSyntheticLambda1<?> fragmentActivityExternalSyntheticLambda1OnExtraCallback = onExtraCallback(clsAsBinder, startintentsenderfromfragmentOnNavigationEvent, onstatenotsavedOnNavigationEvent);
        if (fragmentActivityExternalSyntheticLambda1OnExtraCallback != null) {
            return GLFrameBufferRendererSurfaceViewProvidercreateSurfaceControl1surfaceHolderCallback1ExternalSyntheticLambda0.onExtraCallbackWithResult(startintentsenderfromfragmentOnNavigationEvent, javaType, fragmentActivityExternalSyntheticLambda1OnExtraCallback);
        }
        FragmentActivityExternalSyntheticLambda1<Object> fragmentActivityExternalSyntheticLambda1OnWarmupCompleted = onWarmupCompleted(supportstartpostponedentertransition, onstatenotsavedOnNavigationEvent.ICustomTabsCallback());
        if (fragmentActivityExternalSyntheticLambda1OnWarmupCompleted != null) {
            return GLFrameBufferRendererSurfaceViewProvidercreateSurfaceControl1surfaceHolderCallback1ExternalSyntheticLambda0.onExtraCallbackWithResult(startintentsenderfromfragmentOnNavigationEvent, javaType, fragmentActivityExternalSyntheticLambda1OnWarmupCompleted);
        }
        SavedStateHandleSaverKtExternalSyntheticLambda1 savedStateHandleSaverKtExternalSyntheticLambda1IAuthTabCallback = IAuthTabCallback(clsAsBinder, startintentsenderfromfragmentOnNavigationEvent, onstatenotsavedOnNavigationEvent);
        SavedStateHandleSaverKtExternalSyntheticLambda1 savedStateHandleSaverKtExternalSyntheticLambda1OnWarmupCompleted = onWarmupCompleted(startintentsenderfromfragmentOnNavigationEvent, onstatenotsavedOnNavigationEvent.ICustomTabsCallback());
        SavedStateHandleSaverKtExternalSyntheticLambda1 savedStateHandleSaverKtExternalSyntheticLambda1OnExtraCallbackWithResult = SavedStateHandleSaverKtExternalSyntheticLambda1.onExtraCallbackWithResult(startintentsenderfromfragmentOnNavigationEvent, onstatenotsavedOnNavigationEvent.ICustomTabsCallback());
        SavedStateHandleSaverKtExternalSyntheticLambda1 savedStateHandleSaverKtExternalSyntheticLambda1IAuthTabCallback2 = SavedStateHandleSaverKtExternalSyntheticLambda1.IAuthTabCallback(startintentsenderfromfragmentOnNavigationEvent, onstatenotsavedOnNavigationEvent.ICustomTabsCallback());
        for (nGetPreviousReleaseFenceFd ngetpreviousreleasefencefd : onstatenotsavedOnNavigationEvent.extraCallbackWithResult()) {
            if (onWarmupCompleted((RadioButtonKtRadioButtonElement27<?>) startintentsenderfromfragmentOnNavigationEvent, (internalPathIteratorPeek) ngetpreviousreleasefencefd)) {
                if (ngetpreviousreleasefencefd.access100() != 1 || !ngetpreviousreleasefencefd.writeTypedObject().isAssignableFrom(clsAsBinder)) {
                    throw new IllegalArgumentException("Unsuitable method (" + ngetpreviousreleasefencefd + ") decorated with @JsonCreator (for Enum type " + clsAsBinder.getName() + ")");
                }
                if (ngetpreviousreleasefencefd.onExtraCallbackWithResult(0) == String.class) {
                    if (startintentsenderfromfragmentOnNavigationEvent.asInterface()) {
                        SavedStateHandleImplExternalSyntheticLambda0.onWarmupCompleted(1769484191, new Object[]{ngetpreviousreleasefencefd.IAuthTabCallback_Parcel(), Boolean.valueOf(supportstartpostponedentertransition.onWarmupCompleted(setLayoutTransition.OVERRIDE_PUBLIC_ACCESS_MODIFIERS))}, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -1769484188, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult());
                    }
                    return GLFrameBufferRendererSurfaceViewProvidercreateSurfaceControl1surfaceHolderCallback1ExternalSyntheticLambda0.onExtraCallback(savedStateHandleSaverKtExternalSyntheticLambda1IAuthTabCallback, ngetpreviousreleasefencefd, savedStateHandleSaverKtExternalSyntheticLambda1OnWarmupCompleted, savedStateHandleSaverKtExternalSyntheticLambda1OnExtraCallbackWithResult, savedStateHandleSaverKtExternalSyntheticLambda1IAuthTabCallback2);
                }
            }
        }
        return GLFrameBufferRendererSurfaceViewProvidercreateSurfaceControl1surfaceHolderCallback1ExternalSyntheticLambda0.onNavigationEvent(savedStateHandleSaverKtExternalSyntheticLambda1IAuthTabCallback, savedStateHandleSaverKtExternalSyntheticLambda1OnWarmupCompleted, savedStateHandleSaverKtExternalSyntheticLambda1OnExtraCallbackWithResult, savedStateHandleSaverKtExternalSyntheticLambda1IAuthTabCallback2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.fasterxml.jackson.databind.JsonMappingException */
    public setColumnCount onWarmupCompleted(startIntentSenderFromFragment startintentsenderfromfragment, JavaType javaType, nCreate ncreate) throws JsonMappingException {
        setPrinter<?> setprinterOnNavigationEvent = startintentsenderfromfragment.asBinder().onNavigationEvent((RadioButtonKtRadioButtonElement27<?>) startintentsenderfromfragment, ncreate, javaType);
        if (setprinterOnNavigationEvent == null) {
            return onExtraCallback(startintentsenderfromfragment, javaType);
        }
        try {
            return setprinterOnNavigationEvent.onWarmupCompleted(startintentsenderfromfragment, javaType, startintentsenderfromfragment.ICustomTabsCallbackStub().onNavigationEvent(startintentsenderfromfragment, ncreate, javaType));
        } catch (IllegalArgumentException | IllegalStateException e) {
            throw InvalidDefinitionException.onExtraCallbackWithResult((getViewLifecycleOwner) null, SavedStateHandleImplExternalSyntheticLambda0.onExtraCallback(e), javaType).IAuthTabCallback(e);
        }
    }

    public setColumnCount onExtraCallbackWithResult(startIntentSenderFromFragment startintentsenderfromfragment, JavaType javaType, nCreate ncreate) throws JsonMappingException {
        setPrinter<?> setprinterOnExtraCallback = startintentsenderfromfragment.asBinder().onExtraCallback(startintentsenderfromfragment, ncreate, javaType);
        JavaType javaTypeIAuthTabCallbackStub = javaType.IAuthTabCallbackStub();
        if (setprinterOnExtraCallback == null) {
            return onExtraCallback(startintentsenderfromfragment, javaTypeIAuthTabCallbackStub);
        }
        return setprinterOnExtraCallback.onWarmupCompleted(startintentsenderfromfragment, javaTypeIAuthTabCallbackStub, startintentsenderfromfragment.ICustomTabsCallbackStub().onNavigationEvent(startintentsenderfromfragment, ncreate, javaTypeIAuthTabCallbackStub));
    }

    public FragmentActivityExternalSyntheticLambda1<?> onExtraCallbackWithResult(supportStartPostponedEnterTransition supportstartpostponedentertransition, JavaType javaType, onStateNotSaved onstatenotsaved) throws JsonMappingException {
        JavaType javaTypeOnNavigationEvent;
        JavaType javaTypeOnNavigationEvent2;
        Class<?> clsAsBinder = javaType.asBinder();
        if (clsAsBinder == IAuthTabCallbackStub || clsAsBinder == asBinder) {
            startIntentSenderFromFragment startintentsenderfromfragmentOnNavigationEvent = supportstartpostponedentertransition.onNavigationEvent();
            if (this._factoryConfig.onExtraCallback()) {
                javaTypeOnNavigationEvent = onNavigationEvent(startintentsenderfromfragmentOnNavigationEvent, List.class);
                javaTypeOnNavigationEvent2 = onNavigationEvent(startintentsenderfromfragmentOnNavigationEvent, Map.class);
            } else {
                javaTypeOnNavigationEvent = null;
                javaTypeOnNavigationEvent2 = null;
            }
            return new GLThreadExternalSyntheticLambda5(javaTypeOnNavigationEvent, javaTypeOnNavigationEvent2);
        }
        if (clsAsBinder == asInterface || clsAsBinder == onExtraCallbackWithResult) {
            return GLRendererExternalSyntheticLambda2.onNavigationEvent;
        }
        Class<?> cls = IAuthTabCallback;
        if (clsAsBinder == cls) {
            LifecycleEffectKtExternalSyntheticLambda4 lifecycleEffectKtExternalSyntheticLambda4OnExtraCallback = supportstartpostponedentertransition.onExtraCallback();
            JavaType[] javaTypeArrOnExtraCallback = lifecycleEffectKtExternalSyntheticLambda4OnExtraCallback.onExtraCallback(javaType, cls);
            return IAuthTabCallback(supportstartpostponedentertransition, lifecycleEffectKtExternalSyntheticLambda4OnExtraCallback.onExtraCallbackWithResult(Collection.class, (javaTypeArrOnExtraCallback == null || javaTypeArrOnExtraCallback.length != 1) ? LifecycleEffectKtExternalSyntheticLambda4.IAuthTabCallback() : javaTypeArrOnExtraCallback[0]), onstatenotsaved);
        }
        if (clsAsBinder == onExtraCallback) {
            JavaType javaTypeOnWarmupCompleted = javaType.onWarmupCompleted(0);
            JavaType javaTypeOnWarmupCompleted2 = javaType.onWarmupCompleted(1);
            setColumnCount setcolumncountOnExtraCallback = (setColumnCount) javaTypeOnWarmupCompleted2.access000();
            if (setcolumncountOnExtraCallback == null) {
                setcolumncountOnExtraCallback = onExtraCallback(supportstartpostponedentertransition.onNavigationEvent(), javaTypeOnWarmupCompleted2);
            }
            return new TextureProducerExternalSyntheticLambda0(javaType, (setDrawDisappearingViewsLast) javaTypeOnWarmupCompleted.getInterfaceDescriptor(), (FragmentActivityExternalSyntheticLambda1) javaTypeOnWarmupCompleted2.getInterfaceDescriptor(), setcolumncountOnExtraCallback);
        }
        String name = clsAsBinder.getName();
        if (clsAsBinder.isPrimitive() || name.startsWith("java.")) {
            FragmentActivityExternalSyntheticLambda1<?> fragmentActivityExternalSyntheticLambda1OnExtraCallback = PreservedBufferContentsVerifierExternalSyntheticLambda1.onExtraCallback(clsAsBinder, name);
            if (fragmentActivityExternalSyntheticLambda1OnExtraCallback == null) {
                fragmentActivityExternalSyntheticLambda1OnExtraCallback = LowLatencyCanvasViewExternalSyntheticLambda0.onExtraCallback(clsAsBinder, name);
            }
            if (fragmentActivityExternalSyntheticLambda1OnExtraCallback != null) {
                return fragmentActivityExternalSyntheticLambda1OnExtraCallback;
            }
        }
        if (clsAsBinder == waitForLoader.class) {
            return new GLThreadExternalSyntheticLambda1();
        }
        FragmentActivityExternalSyntheticLambda1<?> fragmentActivityExternalSyntheticLambda1IAuthTabCallback = IAuthTabCallback(supportstartpostponedentertransition, javaType, onstatenotsaved);
        return fragmentActivityExternalSyntheticLambda1IAuthTabCallback != null ? fragmentActivityExternalSyntheticLambda1IAuthTabCallback : LowLatencyCanvasViewmSurfaceHolderCallbacks1ExternalSyntheticLambda0.onExtraCallbackWithResult(supportstartpostponedentertransition, clsAsBinder, name);
    }

    protected JavaType onNavigationEvent(startIntentSenderFromFragment startintentsenderfromfragment, Class<?> cls) throws JsonMappingException {
        JavaType javaTypeOnNavigationEvent = onNavigationEvent(startintentsenderfromfragment, startintentsenderfromfragment.IAuthTabCallback(cls));
        if (javaTypeOnNavigationEvent == null || javaTypeOnNavigationEvent.onNavigationEvent(cls)) {
            return null;
        }
        return javaTypeOnNavigationEvent;
    }

    protected FragmentActivityExternalSyntheticLambda1<?> onNavigationEvent(Class<? extends FragmentActivityExternalSyntheticLambda3> cls, startIntentSenderFromFragment startintentsenderfromfragment, onStateNotSaved onstatenotsaved) throws JsonMappingException {
        Iterator<RunCallbackAction> it = this._factoryConfig.onNavigationEvent().iterator();
        while (it.hasNext()) {
            FragmentActivityExternalSyntheticLambda1<?> fragmentActivityExternalSyntheticLambda1OnExtraCallbackWithResult = it.next().onExtraCallbackWithResult(cls, startintentsenderfromfragment, onstatenotsaved);
            if (fragmentActivityExternalSyntheticLambda1OnExtraCallbackWithResult != null) {
                return fragmentActivityExternalSyntheticLambda1OnExtraCallbackWithResult;
            }
        }
        return null;
    }

    protected FragmentActivityExternalSyntheticLambda1<?> IAuthTabCallback(ReferenceType referenceType, startIntentSenderFromFragment startintentsenderfromfragment, onStateNotSaved onstatenotsaved, setColumnCount setcolumncount, FragmentActivityExternalSyntheticLambda1<?> fragmentActivityExternalSyntheticLambda1) throws JsonMappingException {
        Iterator<RunCallbackAction> it = this._factoryConfig.onNavigationEvent().iterator();
        while (it.hasNext()) {
            FragmentActivityExternalSyntheticLambda1<?> fragmentActivityExternalSyntheticLambda1IAuthTabCallback = it.next().IAuthTabCallback(referenceType, startintentsenderfromfragment, onstatenotsaved, setcolumncount, fragmentActivityExternalSyntheticLambda1);
            if (fragmentActivityExternalSyntheticLambda1IAuthTabCallback != null) {
                return fragmentActivityExternalSyntheticLambda1IAuthTabCallback;
            }
        }
        return null;
    }

    protected FragmentActivityExternalSyntheticLambda1<Object> onNavigationEvent(JavaType javaType, startIntentSenderFromFragment startintentsenderfromfragment, onStateNotSaved onstatenotsaved) throws JsonMappingException {
        Iterator<RunCallbackAction> it = this._factoryConfig.onNavigationEvent().iterator();
        while (it.hasNext()) {
            FragmentActivityExternalSyntheticLambda1<?> fragmentActivityExternalSyntheticLambda1OnExtraCallback = it.next().onExtraCallback(javaType, startintentsenderfromfragment, onstatenotsaved);
            if (fragmentActivityExternalSyntheticLambda1OnExtraCallback != null) {
                return fragmentActivityExternalSyntheticLambda1OnExtraCallback;
            }
        }
        return null;
    }

    protected FragmentActivityExternalSyntheticLambda1<?> onExtraCallbackWithResult(ArrayType arrayType, startIntentSenderFromFragment startintentsenderfromfragment, onStateNotSaved onstatenotsaved, setColumnCount setcolumncount, FragmentActivityExternalSyntheticLambda1<?> fragmentActivityExternalSyntheticLambda1) throws JsonMappingException {
        Iterator<RunCallbackAction> it = this._factoryConfig.onNavigationEvent().iterator();
        while (it.hasNext()) {
            FragmentActivityExternalSyntheticLambda1<?> fragmentActivityExternalSyntheticLambda1OnWarmupCompleted = it.next().onWarmupCompleted(arrayType, startintentsenderfromfragment, onstatenotsaved, setcolumncount, fragmentActivityExternalSyntheticLambda1);
            if (fragmentActivityExternalSyntheticLambda1OnWarmupCompleted != null) {
                return fragmentActivityExternalSyntheticLambda1OnWarmupCompleted;
            }
        }
        return null;
    }

    protected FragmentActivityExternalSyntheticLambda1<?> onExtraCallback(CollectionType collectionType, startIntentSenderFromFragment startintentsenderfromfragment, onStateNotSaved onstatenotsaved, setColumnCount setcolumncount, FragmentActivityExternalSyntheticLambda1<?> fragmentActivityExternalSyntheticLambda1) throws JsonMappingException {
        Iterator<RunCallbackAction> it = this._factoryConfig.onNavigationEvent().iterator();
        while (it.hasNext()) {
            FragmentActivityExternalSyntheticLambda1<?> fragmentActivityExternalSyntheticLambda1OnExtraCallback = it.next().onExtraCallback(collectionType, startintentsenderfromfragment, onstatenotsaved, setcolumncount, fragmentActivityExternalSyntheticLambda1);
            if (fragmentActivityExternalSyntheticLambda1OnExtraCallback != null) {
                return fragmentActivityExternalSyntheticLambda1OnExtraCallback;
            }
        }
        return null;
    }

    protected FragmentActivityExternalSyntheticLambda1<?> onExtraCallbackWithResult(CollectionLikeType collectionLikeType, startIntentSenderFromFragment startintentsenderfromfragment, onStateNotSaved onstatenotsaved, setColumnCount setcolumncount, FragmentActivityExternalSyntheticLambda1<?> fragmentActivityExternalSyntheticLambda1) throws JsonMappingException {
        Iterator<RunCallbackAction> it = this._factoryConfig.onNavigationEvent().iterator();
        while (it.hasNext()) {
            FragmentActivityExternalSyntheticLambda1<?> fragmentActivityExternalSyntheticLambda1IAuthTabCallback = it.next().IAuthTabCallback(collectionLikeType, startintentsenderfromfragment, onstatenotsaved, setcolumncount, fragmentActivityExternalSyntheticLambda1);
            if (fragmentActivityExternalSyntheticLambda1IAuthTabCallback != null) {
                return fragmentActivityExternalSyntheticLambda1IAuthTabCallback;
            }
        }
        return null;
    }

    protected FragmentActivityExternalSyntheticLambda1<?> onExtraCallback(Class<?> cls, startIntentSenderFromFragment startintentsenderfromfragment, onStateNotSaved onstatenotsaved) throws JsonMappingException {
        Iterator<RunCallbackAction> it = this._factoryConfig.onNavigationEvent().iterator();
        while (it.hasNext()) {
            FragmentActivityExternalSyntheticLambda1<?> fragmentActivityExternalSyntheticLambda1OnExtraCallback = it.next().onExtraCallback(cls, startintentsenderfromfragment, onstatenotsaved);
            if (fragmentActivityExternalSyntheticLambda1OnExtraCallback != null) {
                return fragmentActivityExternalSyntheticLambda1OnExtraCallback;
            }
        }
        return null;
    }

    protected FragmentActivityExternalSyntheticLambda1<?> onWarmupCompleted(MapType mapType, startIntentSenderFromFragment startintentsenderfromfragment, onStateNotSaved onstatenotsaved, setDrawDisappearingViewsLast setdrawdisappearingviewslast, setColumnCount setcolumncount, FragmentActivityExternalSyntheticLambda1<?> fragmentActivityExternalSyntheticLambda1) throws JsonMappingException {
        Iterator<RunCallbackAction> it = this._factoryConfig.onNavigationEvent().iterator();
        while (it.hasNext()) {
            FragmentActivityExternalSyntheticLambda1<?> fragmentActivityExternalSyntheticLambda1IAuthTabCallback = it.next().IAuthTabCallback(mapType, startintentsenderfromfragment, onstatenotsaved, setdrawdisappearingviewslast, setcolumncount, fragmentActivityExternalSyntheticLambda1);
            if (fragmentActivityExternalSyntheticLambda1IAuthTabCallback != null) {
                return fragmentActivityExternalSyntheticLambda1IAuthTabCallback;
            }
        }
        return null;
    }

    protected FragmentActivityExternalSyntheticLambda1<?> onExtraCallback(MapLikeType mapLikeType, startIntentSenderFromFragment startintentsenderfromfragment, onStateNotSaved onstatenotsaved, setDrawDisappearingViewsLast setdrawdisappearingviewslast, setColumnCount setcolumncount, FragmentActivityExternalSyntheticLambda1<?> fragmentActivityExternalSyntheticLambda1) throws JsonMappingException {
        Iterator<RunCallbackAction> it = this._factoryConfig.onNavigationEvent().iterator();
        while (it.hasNext()) {
            FragmentActivityExternalSyntheticLambda1<?> fragmentActivityExternalSyntheticLambda1OnExtraCallback = it.next().onExtraCallback(mapLikeType, startintentsenderfromfragment, onstatenotsaved, setdrawdisappearingviewslast, setcolumncount, fragmentActivityExternalSyntheticLambda1);
            if (fragmentActivityExternalSyntheticLambda1OnExtraCallback != null) {
                return fragmentActivityExternalSyntheticLambda1OnExtraCallback;
            }
        }
        return null;
    }

    protected FragmentActivityExternalSyntheticLambda1<Object> onWarmupCompleted(supportStartPostponedEnterTransition supportstartpostponedentertransition, internalPathIteratorPeek internalpathiteratorpeek) throws JsonMappingException {
        Object objOnExtraCallback;
        startActivityFromFragment startactivityfromfragmentAsBinder = supportstartpostponedentertransition.asBinder();
        if (startactivityfromfragmentAsBinder == null || (objOnExtraCallback = startactivityfromfragmentAsBinder.onExtraCallback(internalpathiteratorpeek)) == null) {
            return null;
        }
        return supportstartpostponedentertransition.onWarmupCompleted(internalpathiteratorpeek, objOnExtraCallback);
    }

    protected setDrawDisappearingViewsLast onExtraCallbackWithResult(supportStartPostponedEnterTransition supportstartpostponedentertransition, internalPathIteratorPeek internalpathiteratorpeek) throws JsonMappingException {
        Object objOnTransact;
        startActivityFromFragment startactivityfromfragmentAsBinder = supportstartpostponedentertransition.asBinder();
        if (startactivityfromfragmentAsBinder == null || (objOnTransact = startactivityfromfragmentAsBinder.onTransact(internalpathiteratorpeek)) == null) {
            return null;
        }
        return supportstartpostponedentertransition.onExtraCallbackWithResult(internalpathiteratorpeek, objOnTransact);
    }

    protected FragmentActivityExternalSyntheticLambda1<Object> onExtraCallback(supportStartPostponedEnterTransition supportstartpostponedentertransition, internalPathIteratorPeek internalpathiteratorpeek) throws JsonMappingException {
        Object objOnWarmupCompleted;
        startActivityFromFragment startactivityfromfragmentAsBinder = supportstartpostponedentertransition.asBinder();
        if (startactivityfromfragmentAsBinder == null || (objOnWarmupCompleted = startactivityfromfragmentAsBinder.onWarmupCompleted(internalpathiteratorpeek)) == null) {
            return null;
        }
        return supportstartpostponedentertransition.onWarmupCompleted(internalpathiteratorpeek, objOnWarmupCompleted);
    }

    protected JavaType onWarmupCompleted(supportStartPostponedEnterTransition supportstartpostponedentertransition, nCreate ncreate, JavaType javaType) throws JsonMappingException {
        setDrawDisappearingViewsLast setdrawdisappearingviewslastOnExtraCallbackWithResult;
        startActivityFromFragment startactivityfromfragmentAsBinder = supportstartpostponedentertransition.asBinder();
        if (startactivityfromfragmentAsBinder == null) {
            return javaType;
        }
        if (javaType.onUnminimized() && javaType.asInterface() != null && (setdrawdisappearingviewslastOnExtraCallbackWithResult = supportstartpostponedentertransition.onExtraCallbackWithResult(ncreate, startactivityfromfragmentAsBinder.onTransact((internalPathIteratorPeek) ncreate))) != null) {
            javaType = ((MapLikeType) javaType).IAuthTabCallbackDefault(setdrawdisappearingviewslastOnExtraCallbackWithResult);
            javaType.asInterface();
        }
        if (javaType.access100()) {
            FragmentActivityExternalSyntheticLambda1<Object> fragmentActivityExternalSyntheticLambda1OnWarmupCompleted = supportstartpostponedentertransition.onWarmupCompleted(ncreate, startactivityfromfragmentAsBinder.onWarmupCompleted((internalPathIteratorPeek) ncreate));
            if (fragmentActivityExternalSyntheticLambda1OnWarmupCompleted != null) {
                javaType = javaType.onExtraCallbackWithResult(fragmentActivityExternalSyntheticLambda1OnWarmupCompleted);
            }
            setColumnCount setcolumncountOnExtraCallbackWithResult = onExtraCallbackWithResult(supportstartpostponedentertransition.onNavigationEvent(), javaType, ncreate);
            if (setcolumncountOnExtraCallbackWithResult != null) {
                javaType = javaType.onNavigationEvent(setcolumncountOnExtraCallbackWithResult);
            }
        }
        setColumnCount setcolumncountOnWarmupCompleted = onWarmupCompleted(supportstartpostponedentertransition.onNavigationEvent(), javaType, ncreate);
        if (setcolumncountOnWarmupCompleted != null) {
            javaType = javaType.onExtraCallback(setcolumncountOnWarmupCompleted);
        }
        return startactivityfromfragmentAsBinder.IAuthTabCallback(supportstartpostponedentertransition.onNavigationEvent(), ncreate, javaType);
    }

    protected SavedStateHandleSaverKtExternalSyntheticLambda1 IAuthTabCallback(Class<?> cls, startIntentSenderFromFragment startintentsenderfromfragment, onStateNotSaved onstatenotsaved) {
        nCreate ncreateAsBinder = onstatenotsaved.asBinder();
        if (ncreateAsBinder != null) {
            if (startintentsenderfromfragment.asInterface()) {
                SavedStateHandleImplExternalSyntheticLambda0.onWarmupCompleted(1769484191, new Object[]{ncreateAsBinder.IAuthTabCallbackStub(), Boolean.valueOf(startintentsenderfromfragment.onExtraCallback(setLayoutTransition.OVERRIDE_PUBLIC_ACCESS_MODIFIERS))}, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -1769484188, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult());
            }
            return SavedStateHandleSaverKtExternalSyntheticLambda1.onWarmupCompleted(startintentsenderfromfragment, onstatenotsaved.ICustomTabsCallback(), ncreateAsBinder);
        }
        return SavedStateHandleSaverKtExternalSyntheticLambda1.onExtraCallback(startintentsenderfromfragment, onstatenotsaved.ICustomTabsCallback());
    }

    protected SavedStateHandleSaverKtExternalSyntheticLambda1 onWarmupCompleted(startIntentSenderFromFragment startintentsenderfromfragment, AngleMeasurerExternalSyntheticLambda0 angleMeasurerExternalSyntheticLambda0) {
        FragmentActivityExternalSyntheticLambda2 fragmentActivityExternalSyntheticLambda2OnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult(startintentsenderfromfragment.asBinder().onNavigationEvent((RadioButtonKtRadioButtonElement27<?>) startintentsenderfromfragment, angleMeasurerExternalSyntheticLambda0), startintentsenderfromfragment.asInterface());
        if (fragmentActivityExternalSyntheticLambda2OnExtraCallbackWithResult == null) {
            return null;
        }
        return SavedStateHandleSaverKtExternalSyntheticLambda1.onWarmupCompleted(startintentsenderfromfragment, angleMeasurerExternalSyntheticLambda0, fragmentActivityExternalSyntheticLambda2OnExtraCallbackWithResult);
    }

    protected boolean onWarmupCompleted(RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27, internalPathIteratorPeek internalpathiteratorpeek) {
        Fragment.IAuthTabCallback iAuthTabCallbackOnWarmupCompleted;
        startActivityFromFragment startactivityfromfragmentAsBinder = radioButtonKtRadioButtonElement27.asBinder();
        return (startactivityfromfragmentAsBinder == null || (iAuthTabCallbackOnWarmupCompleted = startactivityfromfragmentAsBinder.onWarmupCompleted(radioButtonKtRadioButtonElement27, internalpathiteratorpeek)) == null || iAuthTabCallbackOnWarmupCompleted == Fragment.IAuthTabCallback.DISABLED) ? false : true;
    }
}
