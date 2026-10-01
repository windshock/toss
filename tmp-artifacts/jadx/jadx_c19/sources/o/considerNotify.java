package o;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ser.ResolvableSerializer;
import com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap;
import com.google.android.gms.wearable.WearableStatusCodes;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class considerNotify {
    private final AtomicReference<ReadOnlyClassToSerializerMap> IAuthTabCallback;
    private final dispatchOnCancelled<setUpdateThrottle, FragmentFactory<Object>> onExtraCallback;

    public considerNotify() {
        this(WearableStatusCodes.TARGET_NODE_NOT_CONNECTED);
    }

    public considerNotify(int i2) {
        this.IAuthTabCallback = new AtomicReference<>();
        this.onExtraCallback = new SavedStateHandleSaverKtExternalSyntheticLambda5(Math.min(64, i2 >> 2), i2);
    }

    public ReadOnlyClassToSerializerMap onNavigationEvent() {
        ReadOnlyClassToSerializerMap readOnlyClassToSerializerMap = this.IAuthTabCallback.get();
        return readOnlyClassToSerializerMap != null ? readOnlyClassToSerializerMap : IAuthTabCallback();
    }

    private final ReadOnlyClassToSerializerMap IAuthTabCallback() {
        ReadOnlyClassToSerializerMap readOnlyClassToSerializerMapOnNavigationEvent;
        synchronized (this) {
            readOnlyClassToSerializerMapOnNavigationEvent = this.IAuthTabCallback.get();
            if (readOnlyClassToSerializerMapOnNavigationEvent == null) {
                readOnlyClassToSerializerMapOnNavigationEvent = ReadOnlyClassToSerializerMap.onNavigationEvent(this.onExtraCallback);
                this.IAuthTabCallback.set(readOnlyClassToSerializerMapOnNavigationEvent);
            }
        }
        return readOnlyClassToSerializerMapOnNavigationEvent;
    }

    public FragmentFactory<Object> onExtraCallback(Class<?> cls) {
        FragmentFactory<Object> fragmentFactoryOnExtraCallbackWithResult;
        synchronized (this) {
            fragmentFactoryOnExtraCallbackWithResult = this.onExtraCallback.onExtraCallbackWithResult(new setUpdateThrottle(cls, false));
        }
        return fragmentFactoryOnExtraCallbackWithResult;
    }

    public FragmentFactory<Object> IAuthTabCallback(JavaType javaType) {
        FragmentFactory<Object> fragmentFactoryOnExtraCallbackWithResult;
        synchronized (this) {
            fragmentFactoryOnExtraCallbackWithResult = this.onExtraCallback.onExtraCallbackWithResult(new setUpdateThrottle(javaType, false));
        }
        return fragmentFactoryOnExtraCallbackWithResult;
    }

    public FragmentFactory<Object> onWarmupCompleted(JavaType javaType) {
        FragmentFactory<Object> fragmentFactoryOnExtraCallbackWithResult;
        synchronized (this) {
            fragmentFactoryOnExtraCallbackWithResult = this.onExtraCallback.onExtraCallbackWithResult(new setUpdateThrottle(javaType, true));
        }
        return fragmentFactoryOnExtraCallbackWithResult;
    }

    public FragmentFactory<Object> onNavigationEvent(Class<?> cls) {
        FragmentFactory<Object> fragmentFactoryOnExtraCallbackWithResult;
        synchronized (this) {
            fragmentFactoryOnExtraCallbackWithResult = this.onExtraCallback.onExtraCallbackWithResult(new setUpdateThrottle(cls, true));
        }
        return fragmentFactoryOnExtraCallbackWithResult;
    }

    public void IAuthTabCallback(JavaType javaType, FragmentFactory<Object> fragmentFactory) {
        synchronized (this) {
            if (this.onExtraCallback.IAuthTabCallback(new setUpdateThrottle(javaType, true), fragmentFactory) == null) {
                this.IAuthTabCallback.set(null);
            }
        }
    }

    public void onExtraCallbackWithResult(Class<?> cls, FragmentFactory<Object> fragmentFactory) {
        synchronized (this) {
            if (this.onExtraCallback.IAuthTabCallback(new setUpdateThrottle(cls, true), fragmentFactory) == null) {
                this.IAuthTabCallback.set(null);
            }
        }
    }

    public void onExtraCallbackWithResult(JavaType javaType, FragmentFactory<Object> fragmentFactory, FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1) throws JsonMappingException {
        synchronized (this) {
            if (this.onExtraCallback.IAuthTabCallback(new setUpdateThrottle(javaType, false), fragmentFactory) == null) {
                this.IAuthTabCallback.set(null);
            }
            if (fragmentFactory instanceof ResolvableSerializer) {
                ((ResolvableSerializer) fragmentFactory).onExtraCallbackWithResult(fragmentManagerExternalSyntheticLambda1);
            }
        }
    }

    public void onExtraCallbackWithResult(Class<?> cls, JavaType javaType, FragmentFactory<Object> fragmentFactory, FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1) throws JsonMappingException {
        synchronized (this) {
            FragmentFactory<Object> fragmentFactoryIAuthTabCallback = this.onExtraCallback.IAuthTabCallback(new setUpdateThrottle(cls, false), fragmentFactory);
            FragmentFactory<Object> fragmentFactoryIAuthTabCallback2 = this.onExtraCallback.IAuthTabCallback(new setUpdateThrottle(javaType, false), fragmentFactory);
            if (fragmentFactoryIAuthTabCallback == null || fragmentFactoryIAuthTabCallback2 == null) {
                this.IAuthTabCallback.set(null);
            }
            if (fragmentFactory instanceof ResolvableSerializer) {
                ((ResolvableSerializer) fragmentFactory).onExtraCallbackWithResult(fragmentManagerExternalSyntheticLambda1);
            }
        }
    }
}
