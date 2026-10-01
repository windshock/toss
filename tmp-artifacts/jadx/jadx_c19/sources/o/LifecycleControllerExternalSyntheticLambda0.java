package o;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ser.BeanSerializerFactory$;
import com.fasterxml.jackson.databind.ser.ResolvableSerializer;
import com.fasterxml.jackson.databind.type.ReferenceType;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import o.callStartTransitionListener;
import o.getFragmentManager;
import o.getNextTransition;
import o.restoreViewState;
import o.startActivityFromFragment;
import o.validateRequestPermissionsRequestCode;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class LifecycleControllerExternalSyntheticLambda0 extends downTo implements Serializable {
    public static final LifecycleControllerExternalSyntheticLambda0 onExtraCallbackWithResult = new LifecycleControllerExternalSyntheticLambda0(null);
    private static final long serialVersionUID = 1;

    protected LifecycleControllerExternalSyntheticLambda0(RemoteCollectionItems remoteCollectionItems) {
        super(remoteCollectionItems);
    }

    @Override // o.downTo
    protected Iterable<LiveDataLifecycleBoundObserver> onExtraCallback() {
        return this._factoryConfig.onExtraCallbackWithResult();
    }

    @Override // o.getVersion
    public FragmentFactory<Object> onExtraCallbackWithResult(FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1, JavaType javaType) throws JsonMappingException {
        JavaType javaTypeOnNavigationEvent;
        findFragmentByTag findfragmentbytagOnNavigationEvent = fragmentManagerExternalSyntheticLambda1.onNavigationEvent();
        onStateNotSaved onstatenotsavedOnNavigationEvent = findfragmentbytagOnNavigationEvent.onNavigationEvent(javaType);
        FragmentFactory<?> fragmentFactoryOnExtraCallback = onExtraCallback(fragmentManagerExternalSyntheticLambda1, onstatenotsavedOnNavigationEvent.ICustomTabsCallback());
        if (fragmentFactoryOnExtraCallback != null) {
            return fragmentFactoryOnExtraCallback;
        }
        startActivityFromFragment startactivityfromfragmentAsBinder = findfragmentbytagOnNavigationEvent.asBinder();
        boolean z = false;
        if (startactivityfromfragmentAsBinder == null) {
            javaTypeOnNavigationEvent = javaType;
        } else {
            try {
                javaTypeOnNavigationEvent = startactivityfromfragmentAsBinder.onNavigationEvent(findfragmentbytagOnNavigationEvent, onstatenotsavedOnNavigationEvent.ICustomTabsCallback(), javaType);
            } catch (JsonMappingException e) {
                return (FragmentFactory) fragmentManagerExternalSyntheticLambda1.onWarmupCompleted(onstatenotsavedOnNavigationEvent, e.getMessage(), new Object[0]);
            }
        }
        if (javaTypeOnNavigationEvent != javaType) {
            if (!javaTypeOnNavigationEvent.onNavigationEvent(javaType.asBinder())) {
                onstatenotsavedOnNavigationEvent = findfragmentbytagOnNavigationEvent.onNavigationEvent(javaTypeOnNavigationEvent);
            }
            z = true;
        }
        SavedStateHandleSaverKtExternalSyntheticLambda3<Object, Object> savedStateHandleSaverKtExternalSyntheticLambda3IAuthTabCallback_Parcel = onstatenotsavedOnNavigationEvent.IAuthTabCallback_Parcel();
        if (savedStateHandleSaverKtExternalSyntheticLambda3IAuthTabCallback_Parcel == null) {
            return onExtraCallbackWithResult(fragmentManagerExternalSyntheticLambda1, javaTypeOnNavigationEvent, onstatenotsavedOnNavigationEvent, z);
        }
        JavaType javaTypeOnNavigationEvent2 = savedStateHandleSaverKtExternalSyntheticLambda3IAuthTabCallback_Parcel.onNavigationEvent(fragmentManagerExternalSyntheticLambda1.onExtraCallback());
        if (!javaTypeOnNavigationEvent2.onNavigationEvent(javaTypeOnNavigationEvent.asBinder())) {
            onstatenotsavedOnNavigationEvent = findfragmentbytagOnNavigationEvent.onNavigationEvent(javaTypeOnNavigationEvent2);
            fragmentFactoryOnExtraCallback = onExtraCallback(fragmentManagerExternalSyntheticLambda1, onstatenotsavedOnNavigationEvent.ICustomTabsCallback());
        }
        if (fragmentFactoryOnExtraCallback == null && !javaTypeOnNavigationEvent2.ICustomTabsCallbackDefault()) {
            fragmentFactoryOnExtraCallback = onExtraCallbackWithResult(fragmentManagerExternalSyntheticLambda1, javaTypeOnNavigationEvent2, onstatenotsavedOnNavigationEvent, true);
        }
        return new DropUnlessLifecycleKtExternalSyntheticLambda0(savedStateHandleSaverKtExternalSyntheticLambda3IAuthTabCallback_Parcel, javaTypeOnNavigationEvent2, fragmentFactoryOnExtraCallback);
    }

    protected FragmentFactory<?> onExtraCallbackWithResult(FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1, JavaType javaType, onStateNotSaved onstatenotsaved, boolean z) throws JsonMappingException {
        FragmentFactory<?> fragmentFactoryOnExtraCallbackWithResult;
        findFragmentByTag findfragmentbytagOnNavigationEvent = fragmentManagerExternalSyntheticLambda1.onNavigationEvent();
        if (javaType.onPostMessage()) {
            if (!z) {
                z = IAuthTabCallback(findfragmentbytagOnNavigationEvent, onstatenotsaved);
            }
            fragmentFactoryOnExtraCallbackWithResult = onWarmupCompleted(fragmentManagerExternalSyntheticLambda1, javaType, onstatenotsaved, z);
            if (fragmentFactoryOnExtraCallbackWithResult != null) {
                return fragmentFactoryOnExtraCallbackWithResult;
            }
        } else {
            if (javaType.IAuthTabCallback()) {
                fragmentFactoryOnExtraCallbackWithResult = IAuthTabCallback(fragmentManagerExternalSyntheticLambda1, (ReferenceType) javaType, onstatenotsaved, z);
            } else {
                Iterator<LiveDataLifecycleBoundObserver> it = onExtraCallback().iterator();
                FragmentFactory<?> fragmentFactoryOnExtraCallback = null;
                while (it.hasNext() && (fragmentFactoryOnExtraCallback = it.next().onExtraCallback(findfragmentbytagOnNavigationEvent, javaType, onstatenotsaved)) == null) {
                }
                fragmentFactoryOnExtraCallbackWithResult = fragmentFactoryOnExtraCallback;
            }
            if (fragmentFactoryOnExtraCallbackWithResult == null) {
                fragmentFactoryOnExtraCallbackWithResult = onExtraCallbackWithResult(fragmentManagerExternalSyntheticLambda1, javaType, onstatenotsaved);
            }
        }
        if (fragmentFactoryOnExtraCallbackWithResult == null && (fragmentFactoryOnExtraCallbackWithResult = onExtraCallback(javaType, findfragmentbytagOnNavigationEvent, onstatenotsaved, z)) == null && (fragmentFactoryOnExtraCallbackWithResult = IAuthTabCallback(fragmentManagerExternalSyntheticLambda1, javaType, onstatenotsaved, z)) == null && (fragmentFactoryOnExtraCallbackWithResult = asBinder(fragmentManagerExternalSyntheticLambda1, javaType, onstatenotsaved, z)) == null) {
            fragmentFactoryOnExtraCallbackWithResult = fragmentManagerExternalSyntheticLambda1.IAuthTabCallback(onstatenotsaved.getInterfaceDescriptor());
        }
        if (fragmentFactoryOnExtraCallbackWithResult != null && this._factoryConfig.onExtraCallback()) {
            Iterator<LiveData> it2 = this._factoryConfig.onNavigationEvent().iterator();
            while (it2.hasNext()) {
                fragmentFactoryOnExtraCallbackWithResult = it2.next().onNavigationEvent(findfragmentbytagOnNavigationEvent, onstatenotsaved, fragmentFactoryOnExtraCallbackWithResult);
            }
        }
        return fragmentFactoryOnExtraCallbackWithResult;
    }

    public FragmentFactory<Object> asBinder(FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1, JavaType javaType, onStateNotSaved onstatenotsaved, boolean z) throws JsonMappingException {
        if (onExtraCallbackWithResult(javaType.asBinder()) || SavedStateHandleImplExternalSyntheticLambda0.access100(javaType.asBinder())) {
            return onExtraCallback(fragmentManagerExternalSyntheticLambda1, javaType, onstatenotsaved, z);
        }
        return null;
    }

    public GridLayout onWarmupCompleted(JavaType javaType, findFragmentByTag findfragmentbytag, nCreate ncreate) throws JsonMappingException {
        setPrinter<?> setprinterOnNavigationEvent = findfragmentbytag.asBinder().onNavigationEvent((RadioButtonKtRadioButtonElement27<?>) findfragmentbytag, ncreate, javaType);
        if (setprinterOnNavigationEvent == null) {
            return onNavigationEvent(findfragmentbytag, javaType);
        }
        return setprinterOnNavigationEvent.onExtraCallback(findfragmentbytag, javaType, findfragmentbytag.ICustomTabsCallbackStub().onExtraCallback(findfragmentbytag, ncreate, javaType));
    }

    public GridLayout IAuthTabCallback(JavaType javaType, findFragmentByTag findfragmentbytag, nCreate ncreate) throws JsonMappingException {
        JavaType javaTypeIAuthTabCallbackStub = javaType.IAuthTabCallbackStub();
        setPrinter<?> setprinterOnExtraCallback = findfragmentbytag.asBinder().onExtraCallback(findfragmentbytag, ncreate, javaType);
        if (setprinterOnExtraCallback == null) {
            return onNavigationEvent(findfragmentbytag, javaTypeIAuthTabCallbackStub);
        }
        return setprinterOnExtraCallback.onExtraCallback(findfragmentbytag, javaTypeIAuthTabCallbackStub, findfragmentbytag.ICustomTabsCallbackStub().onExtraCallback(findfragmentbytag, ncreate, javaTypeIAuthTabCallbackStub));
    }

    protected FragmentFactory<Object> onExtraCallback(FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1, JavaType javaType, onStateNotSaved onstatenotsaved, boolean z) throws JsonMappingException {
        List<LifecycleEventObserver> listOnNavigationEvent;
        if (onstatenotsaved.getInterfaceDescriptor() == Object.class) {
            return fragmentManagerExternalSyntheticLambda1.IAuthTabCallback(Object.class);
        }
        FragmentFactory<?> fragmentFactoryOnWarmupCompleted = onWarmupCompleted(fragmentManagerExternalSyntheticLambda1, javaType, onstatenotsaved);
        if (fragmentFactoryOnWarmupCompleted != null) {
            return fragmentFactoryOnWarmupCompleted;
        }
        if (onExtraCallback(fragmentManagerExternalSyntheticLambda1, javaType)) {
            return new LifecycleEffectKtExternalSyntheticLambda15(javaType);
        }
        findFragmentByTag findfragmentbytagOnNavigationEvent = fragmentManagerExternalSyntheticLambda1.onNavigationEvent();
        LifecycleKteventFlow1ExternalSyntheticLambda0 lifecycleKteventFlow1ExternalSyntheticLambda0OnExtraCallback = onExtraCallback(onstatenotsaved);
        lifecycleKteventFlow1ExternalSyntheticLambda0OnExtraCallback.onExtraCallbackWithResult(findfragmentbytagOnNavigationEvent);
        List<LifecycleEventObserver> listOnExtraCallbackWithResult = onExtraCallbackWithResult(fragmentManagerExternalSyntheticLambda1, onstatenotsaved, lifecycleKteventFlow1ExternalSyntheticLambda0OnExtraCallback);
        if (listOnExtraCallbackWithResult == null) {
            listOnNavigationEvent = new ArrayList<>();
        } else {
            listOnNavigationEvent = onNavigationEvent(fragmentManagerExternalSyntheticLambda1, onstatenotsaved, lifecycleKteventFlow1ExternalSyntheticLambda0OnExtraCallback, listOnExtraCallbackWithResult);
        }
        fragmentManagerExternalSyntheticLambda1.asInterface().onNavigationEvent(findfragmentbytagOnNavigationEvent, onstatenotsaved.ICustomTabsCallback(), listOnNavigationEvent);
        if (this._factoryConfig.onExtraCallback()) {
            Iterator<LiveData> it = this._factoryConfig.onNavigationEvent().iterator();
            while (it.hasNext()) {
                listOnNavigationEvent = it.next().onExtraCallbackWithResult(findfragmentbytagOnNavigationEvent, onstatenotsaved, listOnNavigationEvent);
            }
        }
        List<LifecycleEventObserver> listOnExtraCallbackWithResult2 = onExtraCallbackWithResult(findfragmentbytagOnNavigationEvent, onstatenotsaved, onNavigationEvent(findfragmentbytagOnNavigationEvent, onstatenotsaved, listOnNavigationEvent));
        if (this._factoryConfig.onExtraCallback()) {
            Iterator<LiveData> it2 = this._factoryConfig.onNavigationEvent().iterator();
            while (it2.hasNext()) {
                listOnExtraCallbackWithResult2 = it2.next().IAuthTabCallback(findfragmentbytagOnNavigationEvent, onstatenotsaved, listOnExtraCallbackWithResult2);
            }
        }
        lifecycleKteventFlow1ExternalSyntheticLambda0OnExtraCallback.onNavigationEvent(onExtraCallback(fragmentManagerExternalSyntheticLambda1, onstatenotsaved, listOnExtraCallbackWithResult2));
        lifecycleKteventFlow1ExternalSyntheticLambda0OnExtraCallback.IAuthTabCallback(listOnExtraCallbackWithResult2);
        lifecycleKteventFlow1ExternalSyntheticLambda0OnExtraCallback.onNavigationEvent(onExtraCallbackWithResult(findfragmentbytagOnNavigationEvent, onstatenotsaved));
        nCreate ncreateOnNavigationEvent = onstatenotsaved.onNavigationEvent();
        if (ncreateOnNavigationEvent != null) {
            JavaType javaTypeIAuthTabCallback = ncreateOnNavigationEvent.IAuthTabCallback();
            JavaType javaTypeIAuthTabCallbackStub = javaTypeIAuthTabCallback.IAuthTabCallbackStub();
            GridLayout gridLayoutOnNavigationEvent = onNavigationEvent(findfragmentbytagOnNavigationEvent, javaTypeIAuthTabCallbackStub);
            TransformationsExternalSyntheticLambda3 transformationsExternalSyntheticLambda3OnExtraCallback = onExtraCallback(fragmentManagerExternalSyntheticLambda1, ncreateOnNavigationEvent);
            if (transformationsExternalSyntheticLambda3OnExtraCallback == null) {
                transformationsExternalSyntheticLambda3OnExtraCallback = TransformationsExternalSyntheticLambda3.onExtraCallback((Set) null, javaTypeIAuthTabCallback, findfragmentbytagOnNavigationEvent.onExtraCallback(setLayoutTransition.USE_STATIC_TYPING), gridLayoutOnNavigationEvent, (FragmentFactory) null, (FragmentFactory) null, (Object) null);
            }
            lifecycleKteventFlow1ExternalSyntheticLambda0OnExtraCallback.onExtraCallback(new upFrom(new validateRequestPermissionsRequestCode.onExtraCallback(FragmentKtExternalSyntheticLambda0.onExtraCallbackWithResult(ncreateOnNavigationEvent.onExtraCallback()), javaTypeIAuthTabCallbackStub, (FragmentKtExternalSyntheticLambda0) null, ncreateOnNavigationEvent, onFragmentResult.onExtraCallbackWithResult), ncreateOnNavigationEvent, transformationsExternalSyntheticLambda3OnExtraCallback));
        }
        onExtraCallbackWithResult(findfragmentbytagOnNavigationEvent, lifecycleKteventFlow1ExternalSyntheticLambda0OnExtraCallback);
        if (this._factoryConfig.onExtraCallback()) {
            Iterator<LiveData> it3 = this._factoryConfig.onNavigationEvent().iterator();
            while (it3.hasNext()) {
                lifecycleKteventFlow1ExternalSyntheticLambda0OnExtraCallback = it3.next().onExtraCallbackWithResult(findfragmentbytagOnNavigationEvent, onstatenotsaved, lifecycleKteventFlow1ExternalSyntheticLambda0OnExtraCallback);
            }
        }
        try {
            FragmentFactory<Object> fragmentFactoryIAuthTabCallback = lifecycleKteventFlow1ExternalSyntheticLambda0OnExtraCallback.IAuthTabCallback();
            if (fragmentFactoryIAuthTabCallback != null) {
                return fragmentFactoryIAuthTabCallback;
            }
            if (javaType.ICustomTabsCallbackStubProxy() && !isLoadInBackgroundCanceled.onExtraCallback(javaType.asBinder())) {
                return lifecycleKteventFlow1ExternalSyntheticLambda0OnExtraCallback.onExtraCallbackWithResult();
            }
            FragmentFactory<?> fragmentFactoryOnExtraCallbackWithResult = onExtraCallbackWithResult(findfragmentbytagOnNavigationEvent, javaType, onstatenotsaved, z);
            return (fragmentFactoryOnExtraCallbackWithResult == null && onstatenotsaved.onActivityResized()) ? lifecycleKteventFlow1ExternalSyntheticLambda0OnExtraCallback.onExtraCallbackWithResult() : fragmentFactoryOnExtraCallbackWithResult;
        } catch (RuntimeException e) {
            return (FragmentFactory) fragmentManagerExternalSyntheticLambda1.onWarmupCompleted(onstatenotsaved, "Failed to construct BeanSerializer for %s: (%s) %s", onstatenotsaved.onMessageChannelReady(), e.getClass().getName(), e.getMessage());
        }
    }

    protected onActivityPostStarted onExtraCallback(FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1, onStateNotSaved onstatenotsaved, List<LifecycleEventObserver> list) throws JsonMappingException {
        nTransactionReparent ntransactionreparentOnMinimized = onstatenotsaved.onMinimized();
        if (ntransactionreparentOnMinimized == null) {
            return null;
        }
        Class clsOnExtraCallback = ntransactionreparentOnMinimized.onExtraCallback();
        if (clsOnExtraCallback == getNextTransition.onWarmupCompleted.class) {
            String strOnExtraCallbackWithResult = ntransactionreparentOnMinimized.onExtraCallbackWithResult().onExtraCallbackWithResult();
            int size = list.size();
            for (int i2 = 0; i2 != size; i2++) {
                LifecycleEventObserver lifecycleEventObserver = list.get(i2);
                if (strOnExtraCallbackWithResult.equals(lifecycleEventObserver.onExtraCallbackWithResult())) {
                    if (i2 > 0) {
                        list.remove(i2);
                        list.add(0, lifecycleEventObserver);
                    }
                    return onActivityPostStarted.onExtraCallbackWithResult(lifecycleEventObserver.IAuthTabCallback(), (FragmentKtExternalSyntheticLambda0) null, new ProcessLifecycleOwnerExternalSyntheticLambda0(ntransactionreparentOnMinimized, lifecycleEventObserver), ntransactionreparentOnMinimized.onWarmupCompleted());
                }
            }
            throw new IllegalArgumentException(String.format("Invalid Object Id definition for %s: cannot find property with name %s", SavedStateHandleImplExternalSyntheticLambda0.IAuthTabCallback(onstatenotsaved.onMessageChannelReady()), SavedStateHandleImplExternalSyntheticLambda0.onExtraCallbackWithResult(strOnExtraCallbackWithResult)));
        }
        return onActivityPostStarted.onExtraCallbackWithResult(fragmentManagerExternalSyntheticLambda1.onExtraCallback().onExtraCallback(fragmentManagerExternalSyntheticLambda1.onExtraCallbackWithResult((Type) clsOnExtraCallback), getParentFragmentManager.class)[0], ntransactionreparentOnMinimized.onExtraCallbackWithResult(), fragmentManagerExternalSyntheticLambda1.onExtraCallback((internalPathIteratorPeek) onstatenotsaved.ICustomTabsCallback(), ntransactionreparentOnMinimized), ntransactionreparentOnMinimized.onWarmupCompleted());
    }

    protected LifecycleEventObserver onWarmupCompleted(LifecycleEventObserver lifecycleEventObserver, Class<?>[] clsArr) {
        return LiveDataPublisherLiveDataSubscriptionExternalSyntheticLambda0.onNavigationEvent(lifecycleEventObserver, clsArr);
    }

    protected changeActiveCounter onWarmupCompleted(findFragmentByTag findfragmentbytag, onStateNotSaved onstatenotsaved) {
        return new changeActiveCounter(findfragmentbytag, onstatenotsaved);
    }

    protected LifecycleKteventFlow1ExternalSyntheticLambda0 onExtraCallback(onStateNotSaved onstatenotsaved) {
        return new LifecycleKteventFlow1ExternalSyntheticLambda0(onstatenotsaved);
    }

    protected boolean onExtraCallbackWithResult(Class<?> cls) {
        return SavedStateHandleImplExternalSyntheticLambda0.onWarmupCompleted(cls) == null && !SavedStateHandleImplExternalSyntheticLambda0.writeTypedObject(cls);
    }

    protected List<LifecycleEventObserver> onExtraCallbackWithResult(FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1, onStateNotSaved onstatenotsaved, LifecycleKteventFlow1ExternalSyntheticLambda0 lifecycleKteventFlow1ExternalSyntheticLambda0) throws JsonMappingException {
        List<nSetBufferTransparency> listAccess000 = onstatenotsaved.access000();
        findFragmentByTag findfragmentbytagOnNavigationEvent = fragmentManagerExternalSyntheticLambda1.onNavigationEvent();
        IAuthTabCallback(findfragmentbytagOnNavigationEvent, onstatenotsaved, listAccess000);
        if (findfragmentbytagOnNavigationEvent.onExtraCallback(setLayoutTransition.REQUIRE_SETTERS_FOR_GETTERS)) {
            onWarmupCompleted(findfragmentbytagOnNavigationEvent, onstatenotsaved, listAccess000);
        }
        if (listAccess000.isEmpty()) {
            return null;
        }
        boolean zIAuthTabCallback = IAuthTabCallback(findfragmentbytagOnNavigationEvent, onstatenotsaved);
        changeActiveCounter changeactivecounterOnWarmupCompleted = onWarmupCompleted(findfragmentbytagOnNavigationEvent, onstatenotsaved);
        ArrayList arrayList = new ArrayList(listAccess000.size());
        for (nSetBufferTransparency nsetbuffertransparency : listAccess000) {
            RoundedPolygonKt roundedPolygonKtAsBinder = nsetbuffertransparency.asBinder();
            if (!nsetbuffertransparency.ICustomTabsCallbackStubProxy()) {
                startActivityFromFragment.onExtraCallbackWithResult onextracallbackwithresultIAuthTabCallbackStub = nsetbuffertransparency.IAuthTabCallbackStub();
                if (onextracallbackwithresultIAuthTabCallbackStub == null || !onextracallbackwithresultIAuthTabCallbackStub.onNavigationEvent()) {
                    if (roundedPolygonKtAsBinder instanceof nGetPreviousReleaseFenceFd) {
                        arrayList.add(onWarmupCompleted(fragmentManagerExternalSyntheticLambda1, nsetbuffertransparency, changeactivecounterOnWarmupCompleted, zIAuthTabCallback, (nCreate) roundedPolygonKtAsBinder));
                    } else {
                        arrayList.add(onWarmupCompleted(fragmentManagerExternalSyntheticLambda1, nsetbuffertransparency, changeactivecounterOnWarmupCompleted, zIAuthTabCallback, (nCreate) roundedPolygonKtAsBinder));
                    }
                }
            } else if (roundedPolygonKtAsBinder != null) {
                lifecycleKteventFlow1ExternalSyntheticLambda0.onNavigationEvent(roundedPolygonKtAsBinder);
            }
        }
        return arrayList;
    }

    protected List<LifecycleEventObserver> onExtraCallbackWithResult(findFragmentByTag findfragmentbytag, onStateNotSaved onstatenotsaved, List<LifecycleEventObserver> list) {
        restoreViewState.onExtraCallbackWithResult onExtraCallbackWithResult2 = findfragmentbytag.onExtraCallbackWithResult(onstatenotsaved.getInterfaceDescriptor(), onstatenotsaved.ICustomTabsCallback());
        Set setOnExtraCallbackWithResult = onExtraCallbackWithResult2 != null ? onExtraCallbackWithResult2.onExtraCallbackWithResult() : null;
        callStartTransitionListener.onNavigationEvent onNavigationEvent = findfragmentbytag.onNavigationEvent(onstatenotsaved.getInterfaceDescriptor(), onstatenotsaved.ICustomTabsCallback());
        Set setOnExtraCallback = onNavigationEvent != null ? onNavigationEvent.onExtraCallback() : null;
        if (setOnExtraCallback != null || (setOnExtraCallbackWithResult != null && !setOnExtraCallbackWithResult.isEmpty())) {
            Iterator<LifecycleEventObserver> it = list.iterator();
            while (it.hasNext()) {
                if (SavedStateHandleSaverKtExternalSyntheticLambda4.onNavigationEvent(it.next().onExtraCallbackWithResult(), setOnExtraCallbackWithResult, setOnExtraCallback)) {
                    it.remove();
                }
            }
        }
        return list;
    }

    protected List<LifecycleEventObserver> onNavigationEvent(findFragmentByTag findfragmentbytag, onStateNotSaved onstatenotsaved, List<LifecycleEventObserver> list) {
        if (onstatenotsaved.onMessageChannelReady().onWarmupCompleted(CharSequence.class) && list.size() == 1) {
            nCreate ncreateOnExtraCallback = list.get(0).onExtraCallback();
            if ((ncreateOnExtraCallback instanceof nGetPreviousReleaseFenceFd) && "isEmpty".equals(ncreateOnExtraCallback.onExtraCallback()) && ncreateOnExtraCallback.onTransact() == CharSequence.class) {
                list.remove(0);
            }
        }
        return list;
    }

    protected void onExtraCallbackWithResult(findFragmentByTag findfragmentbytag, LifecycleKteventFlow1ExternalSyntheticLambda0 lifecycleKteventFlow1ExternalSyntheticLambda0) {
        List listOnTransact = lifecycleKteventFlow1ExternalSyntheticLambda0.onTransact();
        boolean zOnExtraCallback = findfragmentbytag.onExtraCallback(setLayoutTransition.DEFAULT_VIEW_INCLUSION);
        int size = listOnTransact.size();
        LifecycleEventObserver[] lifecycleEventObserverArr = new LifecycleEventObserver[size];
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            LifecycleEventObserver lifecycleEventObserver = (LifecycleEventObserver) listOnTransact.get(i3);
            Class<?>[] clsArrIAuthTabCallbackDefault = lifecycleEventObserver.IAuthTabCallbackDefault();
            if (clsArrIAuthTabCallbackDefault != null && clsArrIAuthTabCallbackDefault.length != 0) {
                i2++;
                lifecycleEventObserverArr[i3] = onWarmupCompleted(lifecycleEventObserver, clsArrIAuthTabCallbackDefault);
            } else if (zOnExtraCallback) {
                lifecycleEventObserverArr[i3] = lifecycleEventObserver;
            }
        }
        if (zOnExtraCallback && i2 == 0) {
            return;
        }
        lifecycleKteventFlow1ExternalSyntheticLambda0.onNavigationEvent(lifecycleEventObserverArr);
    }

    protected void IAuthTabCallback(findFragmentByTag findfragmentbytag, onStateNotSaved onstatenotsaved, List<nSetBufferTransparency> list) {
        startActivityFromFragment startactivityfromfragmentAsBinder = findfragmentbytag.asBinder();
        HashMap map = new HashMap();
        Iterator<nSetBufferTransparency> it = list.iterator();
        while (it.hasNext()) {
            nSetBufferTransparency next = it.next();
            if (next.asBinder() == null) {
                it.remove();
            } else {
                Class<?> clsICustomTabsCallback = next.ICustomTabsCallback();
                Boolean boolAsInterface = (Boolean) map.get(clsICustomTabsCallback);
                if (boolAsInterface == null) {
                    boolAsInterface = findfragmentbytag.onExtraCallbackWithResult(clsICustomTabsCallback).asInterface();
                    if (boolAsInterface == null && (boolAsInterface = startactivityfromfragmentAsBinder.onTransact(findfragmentbytag.asBinder(clsICustomTabsCallback).ICustomTabsCallback())) == null) {
                        boolAsInterface = Boolean.FALSE;
                    }
                    map.put(clsICustomTabsCallback, boolAsInterface);
                }
                if (boolAsInterface.booleanValue()) {
                    it.remove();
                }
            }
        }
    }

    public static /* synthetic */ boolean onExtraCallbackWithResult(nSetBufferTransparency nsetbuffertransparency) {
        return (nsetbuffertransparency.onWarmupCompleted() || nsetbuffertransparency.onPostMessage()) ? false : true;
    }

    protected void onWarmupCompleted(findFragmentByTag findfragmentbytag, onStateNotSaved onstatenotsaved, List<nSetBufferTransparency> list) {
        list.removeIf(new BeanSerializerFactory$.ExternalSyntheticLambda0());
    }

    protected List<LifecycleEventObserver> onNavigationEvent(FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1, onStateNotSaved onstatenotsaved, LifecycleKteventFlow1ExternalSyntheticLambda0 lifecycleKteventFlow1ExternalSyntheticLambda0, List<LifecycleEventObserver> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            LifecycleEventObserver lifecycleEventObserver = list.get(i2);
            GridLayout gridLayoutIAuthTabCallbackStub = lifecycleEventObserver.IAuthTabCallbackStub();
            if (gridLayoutIAuthTabCallbackStub != null && gridLayoutIAuthTabCallbackStub.onExtraCallbackWithResult() == getFragmentManager.onWarmupCompleted.EXTERNAL_PROPERTY) {
                FragmentKtExternalSyntheticLambda0 fragmentKtExternalSyntheticLambda0OnExtraCallbackWithResult = FragmentKtExternalSyntheticLambda0.onExtraCallbackWithResult(gridLayoutIAuthTabCallbackStub.onExtraCallback());
                Iterator<LifecycleEventObserver> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    LifecycleEventObserver next = it.next();
                    if (next != lifecycleEventObserver && next.IAuthTabCallback(fragmentKtExternalSyntheticLambda0OnExtraCallbackWithResult)) {
                        lifecycleEventObserver.onExtraCallbackWithResult((GridLayout) null);
                        break;
                    }
                }
            }
        }
        return list;
    }

    protected LifecycleEventObserver onWarmupCompleted(FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1, nSetBufferTransparency nsetbuffertransparency, changeActiveCounter changeactivecounter, boolean z, nCreate ncreate) throws JsonMappingException {
        FragmentKtExternalSyntheticLambda0 interfaceDescriptor = nsetbuffertransparency.getInterfaceDescriptor();
        JavaType javaTypeIAuthTabCallback = ncreate.IAuthTabCallback();
        validateRequestPermissionsRequestCode.onExtraCallback onextracallback = new validateRequestPermissionsRequestCode.onExtraCallback(interfaceDescriptor, javaTypeIAuthTabCallback, nsetbuffertransparency.onMinimized(), ncreate, nsetbuffertransparency.IAuthTabCallback_Parcel());
        ResolvableSerializer resolvableSerializerOnExtraCallback = onExtraCallback(fragmentManagerExternalSyntheticLambda1, ncreate);
        if (resolvableSerializerOnExtraCallback instanceof ResolvableSerializer) {
            resolvableSerializerOnExtraCallback.onExtraCallbackWithResult(fragmentManagerExternalSyntheticLambda1);
        }
        return changeactivecounter.onWarmupCompleted(fragmentManagerExternalSyntheticLambda1, nsetbuffertransparency, javaTypeIAuthTabCallback, fragmentManagerExternalSyntheticLambda1.onExtraCallbackWithResult((FragmentFactory<?>) resolvableSerializerOnExtraCallback, (validateRequestPermissionsRequestCode) onextracallback), onWarmupCompleted(javaTypeIAuthTabCallback, fragmentManagerExternalSyntheticLambda1.onNavigationEvent(), ncreate), (javaTypeIAuthTabCallback.onPostMessage() || javaTypeIAuthTabCallback.IAuthTabCallback()) ? IAuthTabCallback(javaTypeIAuthTabCallback, fragmentManagerExternalSyntheticLambda1.onNavigationEvent(), ncreate) : null, ncreate, z);
    }

    protected FragmentFactory<?> onWarmupCompleted(FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1, JavaType javaType, onStateNotSaved onstatenotsaved) throws JsonMappingException {
        String strOnNavigationEvent = LocalViewModelStoreOwnerExternalSyntheticLambda0.onNavigationEvent(javaType);
        if (strOnNavigationEvent == null || fragmentManagerExternalSyntheticLambda1.onNavigationEvent().onTransact(javaType.asBinder()) != null) {
            return null;
        }
        return new RepeatOnLifecycleKtrepeatOnLifecycle3(javaType, strOnNavigationEvent);
    }

    protected boolean onExtraCallback(FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1, JavaType javaType) {
        Class<?> clsAsBinder = javaType.asBinder();
        return setOnApplyWindowInsetsListener.class.isAssignableFrom(clsAsBinder) || loadClass.class.isAssignableFrom(clsAsBinder) || findFragmentById.class.isAssignableFrom(clsAsBinder) || supportFinishAfterTransition.class.isAssignableFrom(clsAsBinder) || isMenuVisible.class.isAssignableFrom(clsAsBinder) || getViewLifecycleOwner.class.isAssignableFrom(clsAsBinder) || getView.class.isAssignableFrom(clsAsBinder);
    }
}
