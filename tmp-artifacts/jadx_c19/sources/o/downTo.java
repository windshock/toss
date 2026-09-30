package o;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
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
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
import o.callStartTransitionListener;
import o.destroyItem;
import o.restoreViewState;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class downTo extends getVersion implements Serializable {
    protected static final HashMap<String, Class<? extends FragmentFactory<?>>> onExtraCallback;
    protected static final HashMap<String, FragmentFactory<?>> onNavigationEvent;
    protected final RemoteCollectionItems _factoryConfig;

    protected abstract Iterable<LiveDataLifecycleBoundObserver> onExtraCallback();

    static {
        HashMap<String, Class<? extends FragmentFactory<?>>> map = new HashMap<>();
        HashMap<String, FragmentFactory<?>> map2 = new HashMap<>();
        map2.put(String.class.getName(), new LifecycleEffectKtExternalSyntheticLambda11());
        LifecycleEffectKtExternalSyntheticLambda13 lifecycleEffectKtExternalSyntheticLambda13 = LifecycleEffectKtExternalSyntheticLambda13.onNavigationEvent;
        map2.put(StringBuffer.class.getName(), lifecycleEffectKtExternalSyntheticLambda13);
        map2.put(StringBuilder.class.getName(), lifecycleEffectKtExternalSyntheticLambda13);
        map2.put(Character.class.getName(), lifecycleEffectKtExternalSyntheticLambda13);
        map2.put(Character.TYPE.getName(), lifecycleEffectKtExternalSyntheticLambda13);
        clearlifecycle_viewmodel.onExtraCallback(map2);
        map2.put(Boolean.TYPE.getName(), new registerIn(true));
        map2.put(Boolean.class.getName(), new registerIn(false));
        map2.put(BigInteger.class.getName(), new TransformationsswitchMap2ExternalSyntheticLambda0(BigInteger.class));
        map2.put(BigDecimal.class.getName(), new TransformationsswitchMap2ExternalSyntheticLambda0(BigDecimal.class));
        map2.put(Calendar.class.getName(), ReportFragmentCompanion.onWarmupCompleted);
        map2.put(Date.class.getName(), onActivityPrePaused.onExtraCallbackWithResult);
        for (Map.Entry<Class<?>, Object> entry : LifecycleEffectKtExternalSyntheticLambda10.onExtraCallbackWithResult()) {
            Object value = entry.getValue();
            if (value instanceof FragmentFactory) {
                map2.put(entry.getKey().getName(), (FragmentFactory) value);
            } else {
                map.put(entry.getKey().getName(), (Class) value);
            }
        }
        map.put(waitForLoader.class.getName(), LifecycleEffectKtExternalSyntheticLambda3.class);
        onNavigationEvent = map2;
        onExtraCallback = map;
    }

    protected downTo(RemoteCollectionItems remoteCollectionItems) {
        this._factoryConfig = remoteCollectionItems == null ? new RemoteCollectionItems() : remoteCollectionItems;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a0 A[PHI: r2
      0x00a0: PHI (r2v7 o.FragmentFactory<java.lang.Object>) = (r2v6 o.FragmentFactory<java.lang.Object>), (r2v9 o.FragmentFactory<java.lang.Object>) binds: [B:13:0x003a, B:16:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.getVersion
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FragmentFactory<Object> onExtraCallback(FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1, JavaType javaType, FragmentFactory<Object> fragmentFactory) throws JsonMappingException {
        FragmentFactory<?> fragmentFactoryOnExtraCallback;
        findFragmentByTag findfragmentbytagOnNavigationEvent = fragmentManagerExternalSyntheticLambda1.onNavigationEvent();
        onStateNotSaved onstatenotsavedOnNavigationEvent = findfragmentbytagOnNavigationEvent.onNavigationEvent(javaType);
        if (this._factoryConfig.IAuthTabCallback()) {
            Iterator<LiveDataLifecycleBoundObserver> it = this._factoryConfig.onWarmupCompleted().iterator();
            fragmentFactoryOnExtraCallback = null;
            while (it.hasNext() && (fragmentFactoryOnExtraCallback = it.next().onExtraCallback(findfragmentbytagOnNavigationEvent, javaType, onstatenotsavedOnNavigationEvent)) == null) {
            }
        } else {
            fragmentFactoryOnExtraCallback = null;
        }
        if (fragmentFactoryOnExtraCallback == null) {
            FragmentFactory<Object> fragmentFactoryOnWarmupCompleted = onWarmupCompleted(fragmentManagerExternalSyntheticLambda1, onstatenotsavedOnNavigationEvent.ICustomTabsCallback());
            if (fragmentFactoryOnWarmupCompleted != null) {
                fragmentFactory = fragmentFactoryOnWarmupCompleted;
            } else if (fragmentFactory == null) {
                fragmentFactoryOnWarmupCompleted = LifecycleEffectKtExternalSyntheticLambda0.onExtraCallback(findfragmentbytagOnNavigationEvent, javaType.asBinder(), false);
                if (fragmentFactoryOnWarmupCompleted == null) {
                    nCreate ncreateIAuthTabCallbackStub = onstatenotsavedOnNavigationEvent.IAuthTabCallbackStub();
                    if (ncreateIAuthTabCallbackStub == null) {
                        ncreateIAuthTabCallbackStub = onstatenotsavedOnNavigationEvent.asBinder();
                    }
                    if (ncreateIAuthTabCallbackStub != null) {
                        FragmentFactory<Object> fragmentFactoryOnExtraCallback2 = onExtraCallback(fragmentManagerExternalSyntheticLambda1, ncreateIAuthTabCallbackStub.IAuthTabCallback(), fragmentFactory);
                        if (findfragmentbytagOnNavigationEvent.asInterface()) {
                            SavedStateHandleImplExternalSyntheticLambda0.onWarmupCompleted(1769484191, new Object[]{ncreateIAuthTabCallbackStub.IAuthTabCallbackStub(), Boolean.valueOf(findfragmentbytagOnNavigationEvent.onExtraCallback(setLayoutTransition.OVERRIDE_PUBLIC_ACCESS_MODIFIERS))}, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -1769484188, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult());
                        }
                        fragmentFactory = ViewModel.onWarmupCompleted(findfragmentbytagOnNavigationEvent, ncreateIAuthTabCallbackStub, (GridLayout) null, fragmentFactoryOnExtraCallback2);
                    } else {
                        fragmentFactory = LifecycleEffectKtExternalSyntheticLambda0.onWarmupCompleted(findfragmentbytagOnNavigationEvent, javaType.asBinder(), onstatenotsavedOnNavigationEvent.ICustomTabsCallback());
                    }
                }
            }
        } else {
            fragmentFactory = fragmentFactoryOnExtraCallback;
        }
        if (this._factoryConfig.onExtraCallback()) {
            Iterator<LiveData> it2 = this._factoryConfig.onNavigationEvent().iterator();
            while (it2.hasNext()) {
                fragmentFactory = it2.next().onNavigationEvent(findfragmentbytagOnNavigationEvent, javaType, onstatenotsavedOnNavigationEvent, fragmentFactory);
            }
        }
        return fragmentFactory;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.getVersion
    @Deprecated
    public FragmentFactory<Object> onExtraCallbackWithResult(findFragmentByTag findfragmentbytag, JavaType javaType, FragmentFactory<Object> fragmentFactory) {
        onStateNotSaved onstatenotsavedOnNavigationEvent = findfragmentbytag.onNavigationEvent(javaType);
        FragmentFactory<?> fragmentFactoryOnExtraCallback = null;
        if (this._factoryConfig.IAuthTabCallback()) {
            Iterator<LiveDataLifecycleBoundObserver> it = this._factoryConfig.onWarmupCompleted().iterator();
            while (it.hasNext() && (fragmentFactoryOnExtraCallback = it.next().onExtraCallback(findfragmentbytag, javaType, onstatenotsavedOnNavigationEvent)) == null) {
            }
        }
        if (fragmentFactoryOnExtraCallback != null) {
            fragmentFactory = fragmentFactoryOnExtraCallback;
        } else if (fragmentFactory == null && (fragmentFactory = LifecycleEffectKtExternalSyntheticLambda0.onExtraCallback(findfragmentbytag, javaType.asBinder(), false)) == null) {
            fragmentFactory = LifecycleEffectKtExternalSyntheticLambda0.onWarmupCompleted(findfragmentbytag, javaType.asBinder(), onstatenotsavedOnNavigationEvent.ICustomTabsCallback());
        }
        if (this._factoryConfig.onExtraCallback()) {
            Iterator<LiveData> it2 = this._factoryConfig.onNavigationEvent().iterator();
            while (it2.hasNext()) {
                fragmentFactory = it2.next().onNavigationEvent(findfragmentbytag, javaType, onstatenotsavedOnNavigationEvent, fragmentFactory);
            }
        }
        return fragmentFactory;
    }

    @Override // o.getVersion
    public GridLayout onNavigationEvent(findFragmentByTag findfragmentbytag, JavaType javaType) {
        Collection<SurfaceControlV33TransactionExternalSyntheticLambda1> collectionOnExtraCallback;
        AngleMeasurerExternalSyntheticLambda0 angleMeasurerExternalSyntheticLambda0ICustomTabsCallback = findfragmentbytag.asBinder(javaType.asBinder()).ICustomTabsCallback();
        setPrinter<?> setprinterOnExtraCallbackWithResult = findfragmentbytag.asBinder().onExtraCallbackWithResult(findfragmentbytag, angleMeasurerExternalSyntheticLambda0ICustomTabsCallback, javaType);
        if (setprinterOnExtraCallbackWithResult == null) {
            setprinterOnExtraCallbackWithResult = findfragmentbytag.onExtraCallbackWithResult(javaType);
            collectionOnExtraCallback = null;
        } else {
            collectionOnExtraCallback = findfragmentbytag.ICustomTabsCallbackStub().onExtraCallback(findfragmentbytag, angleMeasurerExternalSyntheticLambda0ICustomTabsCallback);
        }
        if (setprinterOnExtraCallbackWithResult == null) {
            return null;
        }
        return setprinterOnExtraCallbackWithResult.onExtraCallback(findfragmentbytag, javaType, collectionOnExtraCallback);
    }

    protected final FragmentFactory<?> onExtraCallback(JavaType javaType, findFragmentByTag findfragmentbytag, onStateNotSaved onstatenotsaved, boolean z) {
        Class<? extends FragmentFactory<?>> cls;
        String name = javaType.asBinder().getName();
        FragmentFactory<?> fragmentFactory = onNavigationEvent.get(name);
        return (fragmentFactory != null || (cls = onExtraCallback.get(name)) == null) ? fragmentFactory : (FragmentFactory) SavedStateHandleImplExternalSyntheticLambda0.onExtraCallbackWithResult(cls, false);
    }

    protected final FragmentFactory<?> onExtraCallbackWithResult(FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1, JavaType javaType, onStateNotSaved onstatenotsaved) throws JsonMappingException {
        if (FragmentActivityExternalSyntheticLambda0.class.isAssignableFrom(javaType.asBinder())) {
            return onCleared.onWarmupCompleted;
        }
        nCreate ncreateAsBinder = onstatenotsaved.asBinder();
        if (ncreateAsBinder == null) {
            return null;
        }
        if (fragmentManagerExternalSyntheticLambda1.onExtraCallbackWithResult()) {
            SavedStateHandleImplExternalSyntheticLambda0.onWarmupCompleted(1769484191, new Object[]{ncreateAsBinder.IAuthTabCallbackStub(), Boolean.valueOf(fragmentManagerExternalSyntheticLambda1.onExtraCallbackWithResult(setLayoutTransition.OVERRIDE_PUBLIC_ACCESS_MODIFIERS))}, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -1769484188, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult());
        }
        JavaType javaTypeIAuthTabCallback = ncreateAsBinder.IAuthTabCallback();
        FragmentFactory<Object> fragmentFactoryOnExtraCallback = onExtraCallback(fragmentManagerExternalSyntheticLambda1, ncreateAsBinder);
        if (fragmentFactoryOnExtraCallback == null) {
            fragmentFactoryOnExtraCallback = (FragmentFactory) javaTypeIAuthTabCallback.getInterfaceDescriptor();
        }
        GridLayout gridLayoutOnNavigationEvent = (GridLayout) javaTypeIAuthTabCallback.access000();
        if (gridLayoutOnNavigationEvent == null) {
            gridLayoutOnNavigationEvent = onNavigationEvent(fragmentManagerExternalSyntheticLambda1.onNavigationEvent(), javaTypeIAuthTabCallback);
        }
        return ViewModel.onWarmupCompleted(fragmentManagerExternalSyntheticLambda1.onNavigationEvent(), ncreateAsBinder, gridLayoutOnNavigationEvent, fragmentFactoryOnExtraCallback);
    }

    protected final FragmentFactory<?> IAuthTabCallback(FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1, JavaType javaType, onStateNotSaved onstatenotsaved, boolean z) throws JsonMappingException {
        if (javaType.onActivityLayout()) {
            return IAuthTabCallback(fragmentManagerExternalSyntheticLambda1.onNavigationEvent(), javaType, onstatenotsaved);
        }
        Class<?> clsAsBinder = javaType.asBinder();
        FragmentFactory<?> fragmentFactoryOnNavigationEvent = onNavigationEvent(fragmentManagerExternalSyntheticLambda1, javaType, onstatenotsaved, z);
        if (fragmentFactoryOnNavigationEvent != null) {
            return fragmentFactoryOnNavigationEvent;
        }
        if (Calendar.class.isAssignableFrom(clsAsBinder)) {
            return ReportFragmentCompanion.onWarmupCompleted;
        }
        if (Date.class.isAssignableFrom(clsAsBinder)) {
            return onActivityPrePaused.onExtraCallbackWithResult;
        }
        if (Map.Entry.class.isAssignableFrom(clsAsBinder)) {
            JavaType javaTypeIAuthTabCallback = javaType.IAuthTabCallback(Map.Entry.class);
            return onExtraCallback(fragmentManagerExternalSyntheticLambda1, javaType, onstatenotsaved, z, javaTypeIAuthTabCallback.onWarmupCompleted(0), javaTypeIAuthTabCallback.onWarmupCompleted(1));
        }
        if (ByteBuffer.class.isAssignableFrom(clsAsBinder)) {
            return new onActivityPostCreated();
        }
        if (InetAddress.class.isAssignableFrom(clsAsBinder)) {
            return new TransformationsExternalSyntheticLambda2();
        }
        if (InetSocketAddress.class.isAssignableFrom(clsAsBinder)) {
            return new TransformationsExternalSyntheticLambda1();
        }
        if (TimeZone.class.isAssignableFrom(clsAsBinder)) {
            return new LifecycleEffectKtExternalSyntheticLambda12();
        }
        if (Charset.class.isAssignableFrom(clsAsBinder)) {
            return LifecycleEffectKtExternalSyntheticLambda13.onNavigationEvent;
        }
        if (Number.class.isAssignableFrom(clsAsBinder)) {
            int i2 = AnonymousClass2.IAuthTabCallback[onstatenotsaved.onTransact().onExtraCallback().ordinal()];
            if (i2 == 1) {
                return LifecycleEffectKtExternalSyntheticLambda13.onNavigationEvent;
            }
            if (i2 == 2 || i2 == 3) {
                return null;
            }
            return TransformationsswitchMap2ExternalSyntheticLambda0.onExtraCallbackWithResult;
        }
        if (ClassLoader.class.isAssignableFrom(clsAsBinder)) {
            return new LifecycleEffectKtExternalSyntheticLambda15(javaType);
        }
        return null;
    }

    protected FragmentFactory<?> onNavigationEvent(FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1, JavaType javaType, onStateNotSaved onstatenotsaved, boolean z) throws JsonMappingException {
        return PathIteratorPreApi34Impl.onNavigationEvent.onNavigationEvent(fragmentManagerExternalSyntheticLambda1.onNavigationEvent(), javaType, onstatenotsaved);
    }

    protected final FragmentFactory<?> onExtraCallbackWithResult(findFragmentByTag findfragmentbytag, JavaType javaType, onStateNotSaved onstatenotsaved, boolean z) throws JsonMappingException {
        Class<?> clsAsBinder = javaType.asBinder();
        if (Iterator.class.isAssignableFrom(clsAsBinder)) {
            JavaType[] javaTypeArrOnExtraCallback = findfragmentbytag.extraCallback().onExtraCallback(javaType, Iterator.class);
            return onWarmupCompleted(findfragmentbytag, javaType, onstatenotsaved, z, (javaTypeArrOnExtraCallback == null || javaTypeArrOnExtraCallback.length != 1) ? LifecycleEffectKtExternalSyntheticLambda4.IAuthTabCallback() : javaTypeArrOnExtraCallback[0]);
        }
        if (Iterable.class.isAssignableFrom(clsAsBinder)) {
            JavaType[] javaTypeArrOnExtraCallback2 = findfragmentbytag.extraCallback().onExtraCallback(javaType, Iterable.class);
            return onNavigationEvent(findfragmentbytag, javaType, onstatenotsaved, z, (javaTypeArrOnExtraCallback2 == null || javaTypeArrOnExtraCallback2.length != 1) ? LifecycleEffectKtExternalSyntheticLambda4.IAuthTabCallback() : javaTypeArrOnExtraCallback2[0]);
        }
        if (CharSequence.class.isAssignableFrom(clsAsBinder)) {
            return LifecycleEffectKtExternalSyntheticLambda13.onNavigationEvent;
        }
        return null;
    }

    protected FragmentFactory<Object> onExtraCallback(FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1, internalPathIteratorPeek internalpathiteratorpeek) throws JsonMappingException {
        Object objOnActivityResized = fragmentManagerExternalSyntheticLambda1.asInterface().onActivityResized(internalpathiteratorpeek);
        if (objOnActivityResized == null) {
            return null;
        }
        return onExtraCallback(fragmentManagerExternalSyntheticLambda1, internalpathiteratorpeek, (FragmentFactory<?>) fragmentManagerExternalSyntheticLambda1.onNavigationEvent(internalpathiteratorpeek, objOnActivityResized));
    }

    protected FragmentFactory<?> onExtraCallback(FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1, internalPathIteratorPeek internalpathiteratorpeek, FragmentFactory<?> fragmentFactory) throws JsonMappingException {
        SavedStateHandleSaverKtExternalSyntheticLambda3<Object, Object> savedStateHandleSaverKtExternalSyntheticLambda3IAuthTabCallback = IAuthTabCallback(fragmentManagerExternalSyntheticLambda1, internalpathiteratorpeek);
        return savedStateHandleSaverKtExternalSyntheticLambda3IAuthTabCallback == null ? fragmentFactory : new DropUnlessLifecycleKtExternalSyntheticLambda0(savedStateHandleSaverKtExternalSyntheticLambda3IAuthTabCallback, savedStateHandleSaverKtExternalSyntheticLambda3IAuthTabCallback.onNavigationEvent(fragmentManagerExternalSyntheticLambda1.onExtraCallback()), fragmentFactory);
    }

    protected SavedStateHandleSaverKtExternalSyntheticLambda3<Object, Object> IAuthTabCallback(FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1, internalPathIteratorPeek internalpathiteratorpeek) throws JsonMappingException {
        Object objOnActivityLayout = fragmentManagerExternalSyntheticLambda1.asInterface().onActivityLayout(internalpathiteratorpeek);
        if (objOnActivityLayout == null) {
            return null;
        }
        return fragmentManagerExternalSyntheticLambda1.onExtraCallback(internalpathiteratorpeek, objOnActivityLayout);
    }

    protected FragmentFactory<?> onWarmupCompleted(FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1, JavaType javaType, onStateNotSaved onstatenotsaved, boolean z) throws JsonMappingException {
        onStateNotSaved onstatenotsaved2;
        onStateNotSaved onstatenotsaved3 = onstatenotsaved;
        findFragmentByTag findfragmentbytagOnNavigationEvent = fragmentManagerExternalSyntheticLambda1.onNavigationEvent();
        boolean z2 = (z || !javaType.extraCommand() || (javaType.onPostMessage() && javaType.IAuthTabCallbackStub().ICustomTabsCallbackDefault())) ? z : true;
        GridLayout gridLayoutOnNavigationEvent = onNavigationEvent(findfragmentbytagOnNavigationEvent, javaType.IAuthTabCallbackStub());
        if (gridLayoutOnNavigationEvent != null) {
            z2 = false;
        }
        boolean z3 = z2;
        FragmentFactory<Object> fragmentFactoryOnNavigationEvent = onNavigationEvent(fragmentManagerExternalSyntheticLambda1, onstatenotsaved.ICustomTabsCallback());
        FragmentFactory<?> fragmentFactoryIAuthTabCallback = null;
        if (javaType.onUnminimized()) {
            MapLikeType mapLikeType = (MapLikeType) javaType;
            FragmentFactory<Object> fragmentFactoryOnWarmupCompleted = onWarmupCompleted(fragmentManagerExternalSyntheticLambda1, onstatenotsaved.ICustomTabsCallback());
            if (mapLikeType instanceof MapType) {
                return onNavigationEvent(fragmentManagerExternalSyntheticLambda1, (MapType) mapLikeType, onstatenotsaved, z3, fragmentFactoryOnWarmupCompleted, gridLayoutOnNavigationEvent, fragmentFactoryOnNavigationEvent);
            }
            Iterator<LiveDataLifecycleBoundObserver> it = onExtraCallback().iterator();
            while (it.hasNext() && (fragmentFactoryIAuthTabCallback = it.next().onWarmupCompleted(findfragmentbytagOnNavigationEvent, mapLikeType, onstatenotsaved, fragmentFactoryOnWarmupCompleted, gridLayoutOnNavigationEvent, fragmentFactoryOnNavigationEvent)) == null) {
            }
            if (fragmentFactoryIAuthTabCallback == null) {
                fragmentFactoryIAuthTabCallback = onExtraCallbackWithResult(fragmentManagerExternalSyntheticLambda1, javaType, onstatenotsaved);
            }
            if (fragmentFactoryIAuthTabCallback != null && this._factoryConfig.onExtraCallback()) {
                Iterator<LiveData> it2 = this._factoryConfig.onNavigationEvent().iterator();
                while (it2.hasNext()) {
                    fragmentFactoryIAuthTabCallback = it2.next().onExtraCallback(findfragmentbytagOnNavigationEvent, mapLikeType, onstatenotsaved3, fragmentFactoryIAuthTabCallback);
                }
            }
            return fragmentFactoryIAuthTabCallback;
        }
        if (javaType.readTypedObject()) {
            CollectionLikeType collectionLikeType = (CollectionLikeType) javaType;
            if (collectionLikeType instanceof CollectionType) {
                return IAuthTabCallback(fragmentManagerExternalSyntheticLambda1, (CollectionType) collectionLikeType, onstatenotsaved, z3, gridLayoutOnNavigationEvent, fragmentFactoryOnNavigationEvent);
            }
            Iterator<LiveDataLifecycleBoundObserver> it3 = onExtraCallback().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    onstatenotsaved2 = onstatenotsaved3;
                    break;
                }
                onstatenotsaved2 = onstatenotsaved3;
                fragmentFactoryIAuthTabCallback = it3.next().IAuthTabCallback(findfragmentbytagOnNavigationEvent, collectionLikeType, onstatenotsaved, gridLayoutOnNavigationEvent, fragmentFactoryOnNavigationEvent);
                if (fragmentFactoryIAuthTabCallback != null) {
                    break;
                }
                onstatenotsaved3 = onstatenotsaved2;
            }
            if (fragmentFactoryIAuthTabCallback == null) {
                fragmentFactoryIAuthTabCallback = onExtraCallbackWithResult(fragmentManagerExternalSyntheticLambda1, javaType, onstatenotsaved);
            }
            if (fragmentFactoryIAuthTabCallback != null && this._factoryConfig.onExtraCallback()) {
                Iterator<LiveData> it4 = this._factoryConfig.onNavigationEvent().iterator();
                while (it4.hasNext()) {
                    fragmentFactoryIAuthTabCallback = it4.next().IAuthTabCallback(findfragmentbytagOnNavigationEvent, collectionLikeType, onstatenotsaved2, fragmentFactoryIAuthTabCallback);
                }
            }
            return fragmentFactoryIAuthTabCallback;
        }
        if (javaType.ICustomTabsCallback()) {
            return onExtraCallback(fragmentManagerExternalSyntheticLambda1, (ArrayType) javaType, onstatenotsaved, z3, gridLayoutOnNavigationEvent, fragmentFactoryOnNavigationEvent);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected FragmentFactory<?> IAuthTabCallback(FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1, CollectionType collectionType, onStateNotSaved onstatenotsaved, boolean z, GridLayout gridLayout, FragmentFactory<Object> fragmentFactory) throws JsonMappingException {
        FragmentFactory<?> fragmentFactoryOnExtraCallbackWithResult;
        findFragmentByTag findfragmentbytagOnNavigationEvent = fragmentManagerExternalSyntheticLambda1.onNavigationEvent();
        Iterator<LiveDataLifecycleBoundObserver> it = onExtraCallback().iterator();
        FragmentFactory<?> fragmentFactoryOnExtraCallbackWithResult2 = null;
        while (it.hasNext() && (fragmentFactoryOnExtraCallbackWithResult2 = it.next().onWarmupCompleted(findfragmentbytagOnNavigationEvent, collectionType, onstatenotsaved, gridLayout, fragmentFactory)) == null) {
        }
        if (fragmentFactoryOnExtraCallbackWithResult2 == null && (fragmentFactoryOnExtraCallbackWithResult2 = onExtraCallbackWithResult(fragmentManagerExternalSyntheticLambda1, (JavaType) collectionType, onstatenotsaved)) == null) {
            if (onstatenotsaved.onTransact().onExtraCallback() == registerOnPreAttachListener$onWarmupCompleted.OBJECT) {
                return null;
            }
            Class<?> clsAsBinder = collectionType.asBinder();
            if (EnumSet.class.isAssignableFrom(clsAsBinder)) {
                JavaType javaTypeIAuthTabCallbackStub = collectionType.IAuthTabCallbackStub();
                fragmentFactoryOnExtraCallbackWithResult2 = onNavigationEvent(javaTypeIAuthTabCallbackStub.onActivityResized() ? javaTypeIAuthTabCallbackStub : null);
            } else {
                Class<?> clsAsBinder2 = collectionType.IAuthTabCallbackStub().asBinder();
                if (IAuthTabCallback(clsAsBinder)) {
                    if (clsAsBinder2 == String.class) {
                        if (SavedStateHandleImplExternalSyntheticLambda0.onExtraCallback(fragmentFactory)) {
                            fragmentFactoryOnExtraCallbackWithResult = LiveDataPublisherLiveDataSubscriptionExternalSyntheticLambda1.IAuthTabCallback;
                        }
                        if (fragmentFactoryOnExtraCallbackWithResult2 == null) {
                            fragmentFactoryOnExtraCallbackWithResult2 = onNavigationEvent(collectionType.IAuthTabCallbackStub(), z, gridLayout, fragmentFactory);
                        }
                    } else {
                        fragmentFactoryOnExtraCallbackWithResult = onExtraCallbackWithResult(collectionType.IAuthTabCallbackStub(), z, gridLayout, fragmentFactory);
                    }
                    fragmentFactoryOnExtraCallbackWithResult2 = fragmentFactoryOnExtraCallbackWithResult;
                    if (fragmentFactoryOnExtraCallbackWithResult2 == null) {
                    }
                } else {
                    if (clsAsBinder2 == String.class && SavedStateHandleImplExternalSyntheticLambda0.onExtraCallback(fragmentFactory)) {
                        fragmentFactoryOnExtraCallbackWithResult = RepeatOnLifecycleKt.onWarmupCompleted;
                        fragmentFactoryOnExtraCallbackWithResult2 = fragmentFactoryOnExtraCallbackWithResult;
                    }
                    if (fragmentFactoryOnExtraCallbackWithResult2 == null) {
                    }
                }
            }
        }
        if (this._factoryConfig.onExtraCallback()) {
            Iterator<LiveData> it2 = this._factoryConfig.onNavigationEvent().iterator();
            while (it2.hasNext()) {
                fragmentFactoryOnExtraCallbackWithResult2 = it2.next().onExtraCallbackWithResult(findfragmentbytagOnNavigationEvent, collectionType, onstatenotsaved, fragmentFactoryOnExtraCallbackWithResult2);
            }
        }
        return fragmentFactoryOnExtraCallbackWithResult2;
    }

    protected boolean IAuthTabCallback(Class<?> cls) {
        return RandomAccess.class.isAssignableFrom(cls);
    }

    public onStartCommand<?> onExtraCallbackWithResult(JavaType javaType, boolean z, GridLayout gridLayout, FragmentFactory<Object> fragmentFactory) {
        return new MutableLiveData(javaType, z, gridLayout, fragmentFactory);
    }

    public onStartCommand<?> onNavigationEvent(JavaType javaType, boolean z, GridLayout gridLayout, FragmentFactory<Object> fragmentFactory) {
        return new onActivityPreStopped(javaType, z, gridLayout, fragmentFactory);
    }

    public FragmentFactory<?> onNavigationEvent(JavaType javaType) {
        return new TransformationsExternalSyntheticLambda0(javaType);
    }

    protected FragmentFactory<?> onNavigationEvent(FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1, MapType mapType, onStateNotSaved onstatenotsaved, boolean z, FragmentFactory<Object> fragmentFactory, GridLayout gridLayout, FragmentFactory<Object> fragmentFactory2) throws JsonMappingException {
        if (onstatenotsaved.onTransact().onExtraCallback() == registerOnPreAttachListener$onWarmupCompleted.OBJECT) {
            return null;
        }
        findFragmentByTag findfragmentbytagOnNavigationEvent = fragmentManagerExternalSyntheticLambda1.onNavigationEvent();
        Iterator<LiveDataLifecycleBoundObserver> it = onExtraCallback().iterator();
        FragmentFactory<?> fragmentFactoryOnExtraCallback = null;
        while (it.hasNext() && (fragmentFactoryOnExtraCallback = it.next().IAuthTabCallback(findfragmentbytagOnNavigationEvent, mapType, onstatenotsaved, fragmentFactory, gridLayout, fragmentFactory2)) == null) {
        }
        if (fragmentFactoryOnExtraCallback == null && (fragmentFactoryOnExtraCallback = onExtraCallbackWithResult(fragmentManagerExternalSyntheticLambda1, (JavaType) mapType, onstatenotsaved)) == null) {
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(findfragmentbytagOnNavigationEvent, onstatenotsaved);
            restoreViewState.onExtraCallbackWithResult onExtraCallbackWithResult = findfragmentbytagOnNavigationEvent.onExtraCallbackWithResult(Map.class, onstatenotsaved.ICustomTabsCallback());
            Set setOnExtraCallbackWithResult = onExtraCallbackWithResult == null ? null : onExtraCallbackWithResult.onExtraCallbackWithResult();
            callStartTransitionListener.onNavigationEvent onNavigationEvent2 = findfragmentbytagOnNavigationEvent.onNavigationEvent(Map.class, onstatenotsaved.ICustomTabsCallback());
            fragmentFactoryOnExtraCallback = IAuthTabCallback(fragmentManagerExternalSyntheticLambda1, onstatenotsaved, TransformationsExternalSyntheticLambda3.onNavigationEvent(setOnExtraCallbackWithResult, onNavigationEvent2 != null ? onNavigationEvent2.onExtraCallback() : null, mapType, z, gridLayout, fragmentFactory, fragmentFactory2, objOnExtraCallbackWithResult));
        }
        if (this._factoryConfig.onExtraCallback()) {
            Iterator<LiveData> it2 = this._factoryConfig.onNavigationEvent().iterator();
            while (it2.hasNext()) {
                fragmentFactoryOnExtraCallback = it2.next().onExtraCallback(findfragmentbytagOnNavigationEvent, mapType, onstatenotsaved, fragmentFactoryOnExtraCallback);
            }
        }
        return fragmentFactoryOnExtraCallback;
    }

    protected TransformationsExternalSyntheticLambda3 IAuthTabCallback(FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1, onStateNotSaved onstatenotsaved, TransformationsExternalSyntheticLambda3 transformationsExternalSyntheticLambda3) throws JsonMappingException {
        JavaType javaTypeOnExtraCallback = transformationsExternalSyntheticLambda3.onExtraCallback();
        dump$onWarmupCompleted dump_onwarmupcompletedOnExtraCallbackWithResult = onExtraCallbackWithResult(fragmentManagerExternalSyntheticLambda1, onstatenotsaved, javaTypeOnExtraCallback, Map.class);
        dump$onExtraCallback dump_onextracallbackIAuthTabCallback = dump_onwarmupcompletedOnExtraCallbackWithResult == null ? dump$onExtraCallback.USE_DEFAULTS : dump_onwarmupcompletedOnExtraCallbackWithResult.IAuthTabCallback();
        Object objOnExtraCallback = null;
        boolean zOnNavigationEvent = true;
        if (dump_onextracallbackIAuthTabCallback == dump$onExtraCallback.USE_DEFAULTS || dump_onextracallbackIAuthTabCallback == dump$onExtraCallback.ALWAYS) {
            return !fragmentManagerExternalSyntheticLambda1.IAuthTabCallback(FragmentManagerExternalSyntheticLambda2.WRITE_NULL_MAP_VALUES) ? transformationsExternalSyntheticLambda3.onExtraCallback((Object) null, true) : transformationsExternalSyntheticLambda3;
        }
        int i2 = AnonymousClass2.onWarmupCompleted[dump_onextracallbackIAuthTabCallback.ordinal()];
        if (i2 == 1) {
            objOnExtraCallback = LocalViewModelStoreOwnerExternalSyntheticLambda0.onExtraCallback(javaTypeOnExtraCallback);
            if (objOnExtraCallback != null && objOnExtraCallback.getClass().isArray()) {
                objOnExtraCallback = LifecycleEffectKtExternalSyntheticLambda9.onWarmupCompleted(objOnExtraCallback);
            }
        } else if (i2 != 2) {
            if (i2 == 3) {
                objOnExtraCallback = TransformationsExternalSyntheticLambda3.IAuthTabCallback;
            } else if (i2 == 4 && (objOnExtraCallback = fragmentManagerExternalSyntheticLambda1.IAuthTabCallback((nSetBufferTransparency) null, dump_onwarmupcompletedOnExtraCallbackWithResult.onWarmupCompleted())) != null) {
                zOnNavigationEvent = fragmentManagerExternalSyntheticLambda1.onNavigationEvent(objOnExtraCallback);
            }
        } else if (javaTypeOnExtraCallback.IAuthTabCallback()) {
            objOnExtraCallback = TransformationsExternalSyntheticLambda3.IAuthTabCallback;
        }
        return transformationsExternalSyntheticLambda3.onExtraCallback(objOnExtraCallback, zOnNavigationEvent);
    }

    protected FragmentFactory<?> onExtraCallback(FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1, JavaType javaType, onStateNotSaved onstatenotsaved, boolean z, JavaType javaType2, JavaType javaType3) throws JsonMappingException {
        Object objOnExtraCallback = null;
        if (registerOnPreAttachListener$onExtraCallback.onExtraCallbackWithResult(onstatenotsaved.onTransact(), fragmentManagerExternalSyntheticLambda1.onExtraCallbackWithResult(Map.Entry.class)).onExtraCallback() == registerOnPreAttachListener$onWarmupCompleted.OBJECT) {
            return null;
        }
        removeSource removesource = new removeSource(javaType3, javaType2, javaType3, z, onNavigationEvent(fragmentManagerExternalSyntheticLambda1.onNavigationEvent(), javaType3), (validateRequestPermissionsRequestCode) null);
        JavaType javaTypeOnNavigationEvent = removesource.onNavigationEvent();
        dump$onWarmupCompleted dump_onwarmupcompletedOnExtraCallbackWithResult = onExtraCallbackWithResult(fragmentManagerExternalSyntheticLambda1, onstatenotsaved, javaTypeOnNavigationEvent, Map.Entry.class);
        dump$onExtraCallback dump_onextracallbackIAuthTabCallback = dump_onwarmupcompletedOnExtraCallbackWithResult == null ? dump$onExtraCallback.USE_DEFAULTS : dump_onwarmupcompletedOnExtraCallbackWithResult.IAuthTabCallback();
        if (dump_onextracallbackIAuthTabCallback == dump$onExtraCallback.USE_DEFAULTS || dump_onextracallbackIAuthTabCallback == dump$onExtraCallback.ALWAYS) {
            return removesource;
        }
        int i2 = AnonymousClass2.onWarmupCompleted[dump_onextracallbackIAuthTabCallback.ordinal()];
        boolean zOnNavigationEvent = true;
        if (i2 == 1) {
            objOnExtraCallback = LocalViewModelStoreOwnerExternalSyntheticLambda0.onExtraCallback(javaTypeOnNavigationEvent);
            if (objOnExtraCallback != null && objOnExtraCallback.getClass().isArray()) {
                objOnExtraCallback = LifecycleEffectKtExternalSyntheticLambda9.onWarmupCompleted(objOnExtraCallback);
            }
        } else if (i2 != 2) {
            if (i2 == 3) {
                objOnExtraCallback = TransformationsExternalSyntheticLambda3.IAuthTabCallback;
            } else if (i2 == 4 && (objOnExtraCallback = fragmentManagerExternalSyntheticLambda1.IAuthTabCallback((nSetBufferTransparency) null, dump_onwarmupcompletedOnExtraCallbackWithResult.onWarmupCompleted())) != null) {
                zOnNavigationEvent = fragmentManagerExternalSyntheticLambda1.onNavigationEvent(objOnExtraCallback);
            }
        } else if (javaTypeOnNavigationEvent.IAuthTabCallback()) {
            objOnExtraCallback = TransformationsExternalSyntheticLambda3.IAuthTabCallback;
        }
        return removesource.onExtraCallback(objOnExtraCallback, zOnNavigationEvent);
    }

    protected dump$onWarmupCompleted onExtraCallbackWithResult(FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1, onStateNotSaved onstatenotsaved, JavaType javaType, Class<?> cls) throws JsonMappingException {
        findFragmentByTag findfragmentbytagOnNavigationEvent = fragmentManagerExternalSyntheticLambda1.onNavigationEvent();
        dump$onWarmupCompleted dump_onwarmupcompletedOnExtraCallbackWithResult = findfragmentbytagOnNavigationEvent.onExtraCallbackWithResult(cls, onstatenotsaved.onExtraCallbackWithResult(findfragmentbytagOnNavigationEvent.onMessageChannelReady()));
        dump$onWarmupCompleted dump_onwarmupcompletedOnExtraCallbackWithResult2 = findfragmentbytagOnNavigationEvent.onExtraCallbackWithResult(javaType.asBinder(), (dump$onWarmupCompleted) null);
        if (dump_onwarmupcompletedOnExtraCallbackWithResult2 != null) {
            int i2 = AnonymousClass2.onWarmupCompleted[dump_onwarmupcompletedOnExtraCallbackWithResult2.onExtraCallbackWithResult().ordinal()];
            if (i2 == 4) {
                return dump_onwarmupcompletedOnExtraCallbackWithResult.onWarmupCompleted(dump_onwarmupcompletedOnExtraCallbackWithResult2.onWarmupCompleted());
            }
            if (i2 != 6) {
                return dump_onwarmupcompletedOnExtraCallbackWithResult.onExtraCallbackWithResult(dump_onwarmupcompletedOnExtraCallbackWithResult2.onExtraCallbackWithResult());
            }
        }
        return dump_onwarmupcompletedOnExtraCallbackWithResult;
    }

    protected FragmentFactory<?> onExtraCallback(FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1, ArrayType arrayType, onStateNotSaved onstatenotsaved, boolean z, GridLayout gridLayout, FragmentFactory<Object> fragmentFactory) throws JsonMappingException {
        findFragmentByTag findfragmentbytagOnNavigationEvent = fragmentManagerExternalSyntheticLambda1.onNavigationEvent();
        Iterator<LiveDataLifecycleBoundObserver> it = onExtraCallback().iterator();
        FragmentFactory<?> fragmentFactoryIAuthTabCallback = null;
        while (it.hasNext() && (fragmentFactoryIAuthTabCallback = it.next().IAuthTabCallback(findfragmentbytagOnNavigationEvent, arrayType, onstatenotsaved, gridLayout, fragmentFactory)) == null) {
        }
        if (fragmentFactoryIAuthTabCallback == null) {
            Class<?> clsAsBinder = arrayType.asBinder();
            if (fragmentFactory == null || SavedStateHandleImplExternalSyntheticLambda0.onExtraCallback(fragmentFactory)) {
                if (String[].class == clsAsBinder) {
                    fragmentFactoryIAuthTabCallback = ProcessLifecycleInitializer.onExtraCallback;
                } else {
                    fragmentFactoryIAuthTabCallback = getCloseable.onNavigationEvent(clsAsBinder);
                }
            }
            if (fragmentFactoryIAuthTabCallback == null) {
                fragmentFactoryIAuthTabCallback = new ViewModelProviderOnRequeryFactory<>(arrayType.IAuthTabCallbackStub(), z, gridLayout, fragmentFactory);
            }
        }
        if (this._factoryConfig.onExtraCallback()) {
            Iterator<LiveData> it2 = this._factoryConfig.onNavigationEvent().iterator();
            while (it2.hasNext()) {
                fragmentFactoryIAuthTabCallback = it2.next().IAuthTabCallback(findfragmentbytagOnNavigationEvent, arrayType, onstatenotsaved, fragmentFactoryIAuthTabCallback);
            }
        }
        return fragmentFactoryIAuthTabCallback;
    }

    public FragmentFactory<?> IAuthTabCallback(FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1, ReferenceType referenceType, onStateNotSaved onstatenotsaved, boolean z) throws JsonMappingException {
        JavaType javaTypeIAuthTabCallbackStub = referenceType.IAuthTabCallbackStub();
        GridLayout gridLayoutOnNavigationEvent = (GridLayout) javaTypeIAuthTabCallbackStub.access000();
        findFragmentByTag findfragmentbytagOnNavigationEvent = fragmentManagerExternalSyntheticLambda1.onNavigationEvent();
        if (gridLayoutOnNavigationEvent == null) {
            gridLayoutOnNavigationEvent = onNavigationEvent(findfragmentbytagOnNavigationEvent, javaTypeIAuthTabCallbackStub);
        }
        GridLayout gridLayout = gridLayoutOnNavigationEvent;
        FragmentFactory<Object> fragmentFactory = (FragmentFactory) javaTypeIAuthTabCallbackStub.getInterfaceDescriptor();
        Iterator<LiveDataLifecycleBoundObserver> it = onExtraCallback().iterator();
        while (it.hasNext()) {
            FragmentFactory<?> fragmentFactoryOnExtraCallback = it.next().onExtraCallback(findfragmentbytagOnNavigationEvent, referenceType, onstatenotsaved, gridLayout, fragmentFactory);
            if (fragmentFactoryOnExtraCallback != null) {
                return fragmentFactoryOnExtraCallback;
            }
        }
        if (referenceType.onWarmupCompleted(AtomicReference.class)) {
            return onExtraCallbackWithResult(fragmentManagerExternalSyntheticLambda1, referenceType, onstatenotsaved, z, gridLayout, fragmentFactory);
        }
        return null;
    }

    protected FragmentFactory<?> onExtraCallbackWithResult(FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1, ReferenceType referenceType, onStateNotSaved onstatenotsaved, boolean z, GridLayout gridLayout, FragmentFactory<Object> fragmentFactory) throws JsonMappingException {
        boolean zOnNavigationEvent;
        JavaType javaTypeIAuthTabCallback_Parcel = referenceType.IAuthTabCallback_Parcel();
        dump$onWarmupCompleted dump_onwarmupcompletedOnExtraCallbackWithResult = onExtraCallbackWithResult(fragmentManagerExternalSyntheticLambda1, onstatenotsaved, javaTypeIAuthTabCallback_Parcel, AtomicReference.class);
        dump$onExtraCallback dump_onextracallbackIAuthTabCallback = dump_onwarmupcompletedOnExtraCallbackWithResult == null ? dump$onExtraCallback.USE_DEFAULTS : dump_onwarmupcompletedOnExtraCallbackWithResult.IAuthTabCallback();
        Object objOnExtraCallback = null;
        if (dump_onextracallbackIAuthTabCallback == dump$onExtraCallback.USE_DEFAULTS || dump_onextracallbackIAuthTabCallback == dump$onExtraCallback.ALWAYS) {
            zOnNavigationEvent = false;
        } else {
            int i2 = AnonymousClass2.onWarmupCompleted[dump_onextracallbackIAuthTabCallback.ordinal()];
            zOnNavigationEvent = true;
            if (i2 == 1) {
                objOnExtraCallback = LocalViewModelStoreOwnerExternalSyntheticLambda0.onExtraCallback(javaTypeIAuthTabCallback_Parcel);
                if (objOnExtraCallback != null && objOnExtraCallback.getClass().isArray()) {
                    objOnExtraCallback = LifecycleEffectKtExternalSyntheticLambda9.onWarmupCompleted(objOnExtraCallback);
                }
            } else if (i2 != 2) {
                if (i2 == 3) {
                    objOnExtraCallback = TransformationsExternalSyntheticLambda3.IAuthTabCallback;
                } else if (i2 == 4 && (objOnExtraCallback = fragmentManagerExternalSyntheticLambda1.IAuthTabCallback((nSetBufferTransparency) null, dump_onwarmupcompletedOnExtraCallbackWithResult.onWarmupCompleted())) != null) {
                    zOnNavigationEvent = fragmentManagerExternalSyntheticLambda1.onNavigationEvent(objOnExtraCallback);
                }
            } else if (javaTypeIAuthTabCallback_Parcel.IAuthTabCallback()) {
                objOnExtraCallback = TransformationsExternalSyntheticLambda3.IAuthTabCallback;
            }
        }
        return new ReportFragment(referenceType, z, gridLayout, fragmentFactory).onWarmupCompleted(objOnExtraCallback, zOnNavigationEvent);
    }

    protected FragmentFactory<?> onWarmupCompleted(findFragmentByTag findfragmentbytag, JavaType javaType, onStateNotSaved onstatenotsaved, boolean z, JavaType javaType2) throws JsonMappingException {
        return new MediatorLiveData(javaType2, z, onNavigationEvent(findfragmentbytag, javaType2));
    }

    protected FragmentFactory<?> onNavigationEvent(findFragmentByTag findfragmentbytag, JavaType javaType, onStateNotSaved onstatenotsaved, boolean z, JavaType javaType2) throws JsonMappingException {
        return new SingleGeneratedAdapterObserver(javaType2, z, onNavigationEvent(findfragmentbytag, javaType2));
    }

    protected FragmentFactory<?> IAuthTabCallback(findFragmentByTag findfragmentbytag, JavaType javaType, onStateNotSaved onstatenotsaved) throws JsonMappingException {
        registerOnPreAttachListener$onExtraCallback registeronpreattachlistener_onextracallbackOnTransact = onstatenotsaved.onTransact();
        if (registeronpreattachlistener_onextracallbackOnTransact.onExtraCallback() == registerOnPreAttachListener$onWarmupCompleted.OBJECT) {
            ((nSetBuffer) onstatenotsaved).onNavigationEvent("declaringClass");
            if (!javaType.onActivityLayout()) {
                return null;
            }
            onExtraCallback(onstatenotsaved);
            return null;
        }
        FragmentFactory<?> fragmentFactoryIAuthTabCallback = SavedStateHandleController.IAuthTabCallback(javaType.asBinder(), findfragmentbytag, onstatenotsaved, registeronpreattachlistener_onextracallbackOnTransact);
        if (this._factoryConfig.onExtraCallback()) {
            Iterator<LiveData> it = this._factoryConfig.onNavigationEvent().iterator();
            while (it.hasNext()) {
                fragmentFactoryIAuthTabCallback = it.next().onWarmupCompleted(findfragmentbytag, javaType, onstatenotsaved, fragmentFactoryIAuthTabCallback);
            }
        }
        return fragmentFactoryIAuthTabCallback;
    }

    private void onExtraCallback(onStateNotSaved onstatenotsaved) {
        Class<?> clsOnExtraCallbackWithResult = SavedStateHandleImplExternalSyntheticLambda0.onExtraCallbackWithResult(onstatenotsaved.getInterfaceDescriptor());
        Iterator<nSetBufferTransparency> it = onstatenotsaved.access000().iterator();
        while (it.hasNext()) {
            nSetBufferTransparency next = it.next();
            JavaType javaTypeWriteTypedObject = next.writeTypedObject();
            if (javaTypeWriteTypedObject.onActivityLayout() && javaTypeWriteTypedObject.onWarmupCompleted(clsOnExtraCallbackWithResult) && next.asBinder().asBinder()) {
                it.remove();
            }
        }
    }

    protected FragmentFactory<Object> onWarmupCompleted(FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1, internalPathIteratorPeek internalpathiteratorpeek) throws JsonMappingException {
        Object objIAuthTabCallbackStub = fragmentManagerExternalSyntheticLambda1.asInterface().IAuthTabCallbackStub(internalpathiteratorpeek);
        if (objIAuthTabCallbackStub != null) {
            return fragmentManagerExternalSyntheticLambda1.onNavigationEvent(internalpathiteratorpeek, objIAuthTabCallbackStub);
        }
        return null;
    }

    protected FragmentFactory<Object> onNavigationEvent(FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1, internalPathIteratorPeek internalpathiteratorpeek) throws JsonMappingException {
        Object objOnNavigationEvent = fragmentManagerExternalSyntheticLambda1.asInterface().onNavigationEvent(internalpathiteratorpeek);
        if (objOnNavigationEvent != null) {
            return fragmentManagerExternalSyntheticLambda1.onNavigationEvent(internalpathiteratorpeek, objOnNavigationEvent);
        }
        return null;
    }

    protected Object onExtraCallbackWithResult(findFragmentByTag findfragmentbytag, onStateNotSaved onstatenotsaved) {
        return findfragmentbytag.asBinder().IAuthTabCallback((internalPathIteratorPeek) onstatenotsaved.ICustomTabsCallback());
    }

    protected boolean IAuthTabCallback(findFragmentByTag findfragmentbytag, onStateNotSaved onstatenotsaved) {
        destroyItem.onExtraCallback onextracallbackOnMinimized = findfragmentbytag.asBinder().onMinimized(onstatenotsaved.ICustomTabsCallback());
        if (onextracallbackOnMinimized != null) {
            int i2 = AnonymousClass2.onNavigationEvent[onextracallbackOnMinimized.ordinal()];
            if (i2 == 1) {
                return false;
            }
            if (i2 == 2) {
                return true;
            }
        }
        return findfragmentbytag.onExtraCallback(setLayoutTransition.USE_STATIC_TYPING);
    }

    /* renamed from: o.downTo$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] IAuthTabCallback;
        static final /* synthetic */ int[] onNavigationEvent;
        static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[destroyItem.onExtraCallback.values().length];
            onNavigationEvent = iArr;
            try {
                iArr[destroyItem.onExtraCallback.DYNAMIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                onNavigationEvent[destroyItem.onExtraCallback.STATIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                onNavigationEvent[destroyItem.onExtraCallback.DEFAULT_TYPING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[dump$onExtraCallback.values().length];
            onWarmupCompleted = iArr2;
            try {
                iArr2[dump$onExtraCallback.NON_DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                onWarmupCompleted[dump$onExtraCallback.NON_ABSENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                onWarmupCompleted[dump$onExtraCallback.NON_EMPTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                onWarmupCompleted[dump$onExtraCallback.CUSTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                onWarmupCompleted[dump$onExtraCallback.NON_NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                onWarmupCompleted[dump$onExtraCallback.USE_DEFAULTS.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr3 = new int[registerOnPreAttachListener$onWarmupCompleted.values().length];
            IAuthTabCallback = iArr3;
            try {
                iArr3[registerOnPreAttachListener$onWarmupCompleted.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                IAuthTabCallback[registerOnPreAttachListener$onWarmupCompleted.OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                IAuthTabCallback[registerOnPreAttachListener$onWarmupCompleted.ARRAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }
}
