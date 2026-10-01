package o;

import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.ResourceCacheGenerator;
import com.bumptech.glide.load.engine.ResourceCacheKey;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import o.SaversKtExternalSyntheticLambda53;
import o.SaversKtExternalSyntheticLambda54;
import o.forceLayout;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class SaversKtExternalSyntheticLambda56<R> implements SaversKtExternalSyntheticLambda53.onExtraCallback, Runnable, Comparable<SaversKtExternalSyntheticLambda56<?>>, forceLayout.onNavigationEvent {
    private SaversKtExternalSyntheticLambda35<?> IAuthTabCallback;
    private volatile SaversKtExternalSyntheticLambda53 IAuthTabCallbackDefault;
    private SaversKtExternalSyntheticLambda58 IAuthTabCallbackStubProxy;
    private final onExtraCallback IAuthTabCallback_Parcel;
    private SaversKtExternalSyntheticLambda59 ICustomTabsCallback;
    private SaversKtExternalSyntheticLambda26 ICustomTabsCallbackDefault;
    private IAuthTabCallbackStub ICustomTabsCallbackStubProxy;
    private volatile boolean access000;
    private int access100;
    private Thread asInterface;
    private volatile boolean extraCallback;
    private boolean extraCallbackWithResult;
    private int extraCommand;
    private SaversKtExternalSyntheticLambda10 getInterfaceDescriptor;
    private SaversKtExternalSyntheticLambda11 onActivityLayout;
    private Object onExtraCallback;
    private onWarmupCompleted<R> onExtraCallbackWithResult;
    private final Pools.onExtraCallback<SaversKtExternalSyntheticLambda56<?>> onMessageChannelReady;
    private int onMinimized;
    private SaversKtExternalSyntheticLambda26 onNavigationEvent;
    private SaversKtExternalSyntheticLambda30 onPostMessage;
    private long onRelationshipValidationResult;
    private SaversKtExternalSyntheticLambda26 onTransact;
    private IAuthTabCallbackDefault onUnminimized;
    private SaversKtExternalSyntheticLambda21 onWarmupCompleted;
    private boolean readTypedObject;
    private Object writeTypedObject;
    private final SaversKtExternalSyntheticLambda52<R> IAuthTabCallbackStub = new SaversKtExternalSyntheticLambda52<>();
    private final List<Throwable> isEngagementSignalsApiAvailable = new ArrayList();
    private final dispatchDraw ICustomTabsCallbackStub = dispatchDraw.onWarmupCompleted();
    private final onExtraCallbackWithResult<?> asBinder = new onExtraCallbackWithResult<>();
    private final IAuthTabCallback onActivityResized = new IAuthTabCallback();

    enum IAuthTabCallbackDefault {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    enum IAuthTabCallbackStub {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    interface onExtraCallback {
        LayoutIntrinsics_androidKtExternalSyntheticLambda0 onExtraCallback();
    }

    interface onWarmupCompleted<R> {
        void IAuthTabCallback(Resource<R> resource, SaversKtExternalSyntheticLambda21 saversKtExternalSyntheticLambda21, boolean z);

        void onExtraCallback(SaversKtExternalSyntheticLambda56<?> saversKtExternalSyntheticLambda56);

        void onExtraCallbackWithResult(SaversKtExternalSyntheticLambda7 saversKtExternalSyntheticLambda7);
    }

    SaversKtExternalSyntheticLambda56(onExtraCallback onextracallback, Pools.onExtraCallback<SaversKtExternalSyntheticLambda56<?>> onextracallback2) {
        this.IAuthTabCallback_Parcel = onextracallback;
        this.onMessageChannelReady = onextracallback2;
    }

    SaversKtExternalSyntheticLambda56<R> onNavigationEvent(SaversKtExternalSyntheticLambda10 saversKtExternalSyntheticLambda10, Object obj, SaversKtExternalSyntheticLambda59 saversKtExternalSyntheticLambda59, SaversKtExternalSyntheticLambda26 saversKtExternalSyntheticLambda26, int i2, int i3, Class<?> cls, Class<R> cls2, SaversKtExternalSyntheticLambda11 saversKtExternalSyntheticLambda11, SaversKtExternalSyntheticLambda58 saversKtExternalSyntheticLambda58, Map<Class<?>, SaversKtExternalSyntheticLambda29<?>> map, boolean z, boolean z2, boolean z3, SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30, onWarmupCompleted<R> onwarmupcompleted, int i4) {
        this.IAuthTabCallbackStub.onWarmupCompleted(saversKtExternalSyntheticLambda10, obj, saversKtExternalSyntheticLambda26, i2, i3, saversKtExternalSyntheticLambda58, cls, cls2, saversKtExternalSyntheticLambda11, saversKtExternalSyntheticLambda30, map, z, z2, this.IAuthTabCallback_Parcel);
        this.getInterfaceDescriptor = saversKtExternalSyntheticLambda10;
        this.ICustomTabsCallbackDefault = saversKtExternalSyntheticLambda26;
        this.onActivityLayout = saversKtExternalSyntheticLambda11;
        this.ICustomTabsCallback = saversKtExternalSyntheticLambda59;
        this.extraCommand = i2;
        this.access100 = i3;
        this.IAuthTabCallbackStubProxy = saversKtExternalSyntheticLambda58;
        this.readTypedObject = z3;
        this.onPostMessage = saversKtExternalSyntheticLambda30;
        this.onExtraCallbackWithResult = onwarmupcompleted;
        this.onMinimized = i4;
        this.ICustomTabsCallbackStubProxy = IAuthTabCallbackStub.INITIALIZE;
        this.writeTypedObject = obj;
        return this;
    }

    boolean IAuthTabCallback() {
        IAuthTabCallbackDefault iAuthTabCallbackDefaultOnWarmupCompleted = onWarmupCompleted(IAuthTabCallbackDefault.INITIALIZE);
        return iAuthTabCallbackDefaultOnWarmupCompleted == IAuthTabCallbackDefault.RESOURCE_CACHE || iAuthTabCallbackDefaultOnWarmupCompleted == IAuthTabCallbackDefault.DATA_CACHE;
    }

    void onWarmupCompleted(boolean z) {
        if (this.onActivityResized.IAuthTabCallback(z)) {
            access000();
        }
    }

    private void IAuthTabCallbackDefault() {
        if (this.onActivityResized.onNavigationEvent()) {
            access000();
        }
    }

    private void IAuthTabCallbackStub() {
        if (this.onActivityResized.onExtraCallback()) {
            access000();
        }
    }

    private void access000() {
        this.onActivityResized.IAuthTabCallback();
        this.asBinder.IAuthTabCallback();
        this.IAuthTabCallbackStub.onExtraCallback();
        this.access000 = false;
        this.getInterfaceDescriptor = null;
        this.ICustomTabsCallbackDefault = null;
        this.onPostMessage = null;
        this.onActivityLayout = null;
        this.ICustomTabsCallback = null;
        this.onExtraCallbackWithResult = null;
        this.onUnminimized = null;
        this.IAuthTabCallbackDefault = null;
        this.asInterface = null;
        this.onTransact = null;
        this.onExtraCallback = null;
        this.onWarmupCompleted = null;
        this.IAuthTabCallback = null;
        this.onRelationshipValidationResult = 0L;
        this.extraCallback = false;
        this.writeTypedObject = null;
        this.isEngagementSignalsApiAvailable.clear();
        this.onMessageChannelReady.onWarmupCompleted(this);
    }

    @Override // java.lang.Comparable
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NonNull SaversKtExternalSyntheticLambda56<?> saversKtExternalSyntheticLambda56) {
        int iAsBinder = asBinder() - saversKtExternalSyntheticLambda56.asBinder();
        return iAsBinder == 0 ? this.onMinimized - saversKtExternalSyntheticLambda56.onMinimized : iAsBinder;
    }

    private int asBinder() {
        return this.onActivityLayout.ordinal();
    }

    public void onExtraCallback() {
        this.extraCallback = true;
        SaversKtExternalSyntheticLambda53 saversKtExternalSyntheticLambda53 = this.IAuthTabCallbackDefault;
        if (saversKtExternalSyntheticLambda53 != null) {
            saversKtExternalSyntheticLambda53.IAuthTabCallback();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        SaversKtExternalSyntheticLambda35<?> saversKtExternalSyntheticLambda35 = this.IAuthTabCallback;
        try {
            try {
                if (this.extraCallback) {
                    asInterface();
                } else {
                    IAuthTabCallbackStubProxy();
                    if (saversKtExternalSyntheticLambda35 != null) {
                        saversKtExternalSyntheticLambda35.onExtraCallback();
                    }
                }
            } finally {
                if (saversKtExternalSyntheticLambda35 != null) {
                    saversKtExternalSyntheticLambda35.onExtraCallback();
                }
            }
        } catch (SaversKtExternalSyntheticLambda48 e) {
            throw e;
        } catch (Throwable th) {
            if (Log.isLoggable("DecodeJob", 3)) {
                Objects.toString(this.onUnminimized);
            }
            if (this.onUnminimized != IAuthTabCallbackDefault.ENCODE) {
                this.isEngagementSignalsApiAvailable.add(th);
                asInterface();
            }
            if (!this.extraCallback) {
                throw th;
            }
            throw th;
        }
    }

    private void IAuthTabCallbackStubProxy() {
        int i2 = AnonymousClass1.onExtraCallback[this.ICustomTabsCallbackStubProxy.ordinal()];
        if (i2 == 1) {
            this.onUnminimized = onWarmupCompleted(IAuthTabCallbackDefault.INITIALIZE);
            this.IAuthTabCallbackDefault = onTransact();
            getInterfaceDescriptor();
        } else if (i2 == 2) {
            getInterfaceDescriptor();
        } else {
            if (i2 == 3) {
                onNavigationEvent();
                return;
            }
            throw new IllegalStateException("Unrecognized run reason: " + this.ICustomTabsCallbackStubProxy);
        }
    }

    private SaversKtExternalSyntheticLambda53 onTransact() {
        int i2 = AnonymousClass1.onExtraCallbackWithResult[this.onUnminimized.ordinal()];
        if (i2 == 1) {
            return new ResourceCacheGenerator(this.IAuthTabCallbackStub, this);
        }
        if (i2 == 2) {
            return new SaversKtExternalSyntheticLambda5(this.IAuthTabCallbackStub, this);
        }
        if (i2 == 3) {
            return new SaversKtExternalSyntheticLambda9(this.IAuthTabCallbackStub, this);
        }
        if (i2 == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.onUnminimized);
    }

    private void getInterfaceDescriptor() {
        this.asInterface = Thread.currentThread();
        this.onRelationshipValidationResult = getSharedValues.IAuthTabCallback();
        boolean zOnNavigationEvent = false;
        while (!this.extraCallback && this.IAuthTabCallbackDefault != null && !(zOnNavigationEvent = this.IAuthTabCallbackDefault.onNavigationEvent())) {
            this.onUnminimized = onWarmupCompleted(this.onUnminimized);
            this.IAuthTabCallbackDefault = onTransact();
            if (this.onUnminimized == IAuthTabCallbackDefault.SOURCE) {
                onWarmupCompleted();
                return;
            }
        }
        if ((this.onUnminimized == IAuthTabCallbackDefault.FINISHED || this.extraCallback) && !zOnNavigationEvent) {
            asInterface();
        }
    }

    private void asInterface() {
        access100();
        this.onExtraCallbackWithResult.onExtraCallbackWithResult(new SaversKtExternalSyntheticLambda7("Failed to load resource", new ArrayList(this.isEngagementSignalsApiAvailable)));
        IAuthTabCallbackStub();
    }

    private void onNavigationEvent(Resource<R> resource, SaversKtExternalSyntheticLambda21 saversKtExternalSyntheticLambda21, boolean z) {
        access100();
        this.onExtraCallbackWithResult.IAuthTabCallback(resource, saversKtExternalSyntheticLambda21, z);
    }

    private void access100() {
        Throwable th;
        this.ICustomTabsCallbackStub.onExtraCallback();
        if (this.access000) {
            if (this.isEngagementSignalsApiAvailable.isEmpty()) {
                th = null;
            } else {
                List<Throwable> list = this.isEngagementSignalsApiAvailable;
                th = list.get(list.size() - 1);
            }
            throw new IllegalStateException("Already notified", th);
        }
        this.access000 = true;
    }

    private IAuthTabCallbackDefault onWarmupCompleted(IAuthTabCallbackDefault iAuthTabCallbackDefault) {
        int i2 = AnonymousClass1.onExtraCallbackWithResult[iAuthTabCallbackDefault.ordinal()];
        if (i2 == 1) {
            if (this.IAuthTabCallbackStubProxy.onNavigationEvent()) {
                return IAuthTabCallbackDefault.DATA_CACHE;
            }
            return onWarmupCompleted(IAuthTabCallbackDefault.DATA_CACHE);
        }
        if (i2 == 2) {
            return this.readTypedObject ? IAuthTabCallbackDefault.FINISHED : IAuthTabCallbackDefault.SOURCE;
        }
        if (i2 == 3 || i2 == 4) {
            return IAuthTabCallbackDefault.FINISHED;
        }
        if (i2 == 5) {
            if (this.IAuthTabCallbackStubProxy.onExtraCallback()) {
                return IAuthTabCallbackDefault.RESOURCE_CACHE;
            }
            return onWarmupCompleted(IAuthTabCallbackDefault.RESOURCE_CACHE);
        }
        throw new IllegalArgumentException("Unrecognized stage: " + iAuthTabCallbackDefault);
    }

    @Override // o.SaversKtExternalSyntheticLambda53.onExtraCallback
    public void onWarmupCompleted() {
        this.ICustomTabsCallbackStubProxy = IAuthTabCallbackStub.SWITCH_TO_SOURCE_SERVICE;
        this.onExtraCallbackWithResult.onExtraCallback(this);
    }

    @Override // o.SaversKtExternalSyntheticLambda53.onExtraCallback
    public void onExtraCallback(SaversKtExternalSyntheticLambda26 saversKtExternalSyntheticLambda26, Object obj, SaversKtExternalSyntheticLambda35<?> saversKtExternalSyntheticLambda35, SaversKtExternalSyntheticLambda21 saversKtExternalSyntheticLambda21, SaversKtExternalSyntheticLambda26 saversKtExternalSyntheticLambda262) {
        this.onTransact = saversKtExternalSyntheticLambda26;
        this.onExtraCallback = obj;
        this.IAuthTabCallback = saversKtExternalSyntheticLambda35;
        this.onWarmupCompleted = saversKtExternalSyntheticLambda21;
        this.onNavigationEvent = saversKtExternalSyntheticLambda262;
        this.extraCallbackWithResult = saversKtExternalSyntheticLambda26 != this.IAuthTabCallbackStub.onNavigationEvent().get(0);
        if (Thread.currentThread() != this.asInterface) {
            this.ICustomTabsCallbackStubProxy = IAuthTabCallbackStub.DECODE_DATA;
            this.onExtraCallbackWithResult.onExtraCallback(this);
        } else {
            onNavigationEvent();
        }
    }

    @Override // o.SaversKtExternalSyntheticLambda53.onExtraCallback
    public void onWarmupCompleted(SaversKtExternalSyntheticLambda26 saversKtExternalSyntheticLambda26, Exception exc, SaversKtExternalSyntheticLambda35<?> saversKtExternalSyntheticLambda35, SaversKtExternalSyntheticLambda21 saversKtExternalSyntheticLambda21) {
        saversKtExternalSyntheticLambda35.onExtraCallback();
        SaversKtExternalSyntheticLambda7 saversKtExternalSyntheticLambda7 = new SaversKtExternalSyntheticLambda7("Fetching data failed", exc);
        saversKtExternalSyntheticLambda7.onNavigationEvent(saversKtExternalSyntheticLambda26, saversKtExternalSyntheticLambda21, saversKtExternalSyntheticLambda35.onNavigationEvent());
        this.isEngagementSignalsApiAvailable.add(saversKtExternalSyntheticLambda7);
        if (Thread.currentThread() != this.asInterface) {
            this.ICustomTabsCallbackStubProxy = IAuthTabCallbackStub.SWITCH_TO_SOURCE_SERVICE;
            this.onExtraCallbackWithResult.onExtraCallback(this);
        } else {
            getInterfaceDescriptor();
        }
    }

    private void onNavigationEvent() {
        Resource<R> resourceOnWarmupCompleted;
        if (Log.isLoggable("DecodeJob", 2)) {
            onExtraCallback("Retrieved data", this.onRelationshipValidationResult, "data: " + this.onExtraCallback + ", cache key: " + this.onTransact + ", fetcher: " + this.IAuthTabCallback);
        }
        try {
            resourceOnWarmupCompleted = onWarmupCompleted(this.IAuthTabCallback, this.onExtraCallback, this.onWarmupCompleted);
        } catch (SaversKtExternalSyntheticLambda7 e) {
            e.onExtraCallbackWithResult(this.onNavigationEvent, this.onWarmupCompleted);
            this.isEngagementSignalsApiAvailable.add(e);
            resourceOnWarmupCompleted = null;
        }
        if (resourceOnWarmupCompleted != null) {
            onExtraCallbackWithResult(resourceOnWarmupCompleted, this.onWarmupCompleted, this.extraCallbackWithResult);
        } else {
            getInterfaceDescriptor();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void onExtraCallbackWithResult(Resource<R> resource, SaversKtExternalSyntheticLambda21 saversKtExternalSyntheticLambda21, boolean z) {
        Savers_androidKtExternalSyntheticLambda1 savers_androidKtExternalSyntheticLambda1;
        if (resource instanceof Savers_androidKtExternalSyntheticLambda0) {
            ((Savers_androidKtExternalSyntheticLambda0) resource).onWarmupCompleted();
        }
        if (this.asBinder.onExtraCallback()) {
            resource = Savers_androidKtExternalSyntheticLambda1.onNavigationEvent(resource);
            savers_androidKtExternalSyntheticLambda1 = resource;
        } else {
            savers_androidKtExternalSyntheticLambda1 = 0;
        }
        onNavigationEvent(resource, saversKtExternalSyntheticLambda21, z);
        this.onUnminimized = IAuthTabCallbackDefault.ENCODE;
        try {
            if (this.asBinder.onExtraCallback()) {
                this.asBinder.onExtraCallbackWithResult(this.IAuthTabCallback_Parcel, this.onPostMessage);
            }
            IAuthTabCallbackDefault();
        } finally {
            if (savers_androidKtExternalSyntheticLambda1 != 0) {
                savers_androidKtExternalSyntheticLambda1.onWarmupCompleted();
            }
        }
    }

    private <Data> Resource<R> onWarmupCompleted(SaversKtExternalSyntheticLambda35<?> saversKtExternalSyntheticLambda35, Data data, SaversKtExternalSyntheticLambda21 saversKtExternalSyntheticLambda21) throws SaversKtExternalSyntheticLambda7 {
        if (data != null) {
            try {
                long jIAuthTabCallback = getSharedValues.IAuthTabCallback();
                Resource<R> resourceOnNavigationEvent = onNavigationEvent(data, saversKtExternalSyntheticLambda21);
                if (Log.isLoggable("DecodeJob", 2)) {
                    onExtraCallbackWithResult("Decoded result " + resourceOnNavigationEvent, jIAuthTabCallback);
                }
                return resourceOnNavigationEvent;
            } finally {
                saversKtExternalSyntheticLambda35.onExtraCallback();
            }
        }
        saversKtExternalSyntheticLambda35.onExtraCallback();
        return null;
    }

    private <Data> Resource<R> onNavigationEvent(Data data, SaversKtExternalSyntheticLambda21 saversKtExternalSyntheticLambda21) throws SaversKtExternalSyntheticLambda7 {
        return onExtraCallbackWithResult((SaversKtExternalSyntheticLambda56<R>) data, saversKtExternalSyntheticLambda21, (Savers_androidKtExternalSyntheticLambda2<SaversKtExternalSyntheticLambda56<R>, ResourceType, R>) this.IAuthTabCallbackStub.onNavigationEvent(data.getClass()));
    }

    private SaversKtExternalSyntheticLambda30 onNavigationEvent(SaversKtExternalSyntheticLambda21 saversKtExternalSyntheticLambda21) {
        SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30 = this.onPostMessage;
        if (Build.VERSION.SDK_INT < 26) {
            return saversKtExternalSyntheticLambda30;
        }
        boolean z = saversKtExternalSyntheticLambda21 == SaversKtExternalSyntheticLambda21.RESOURCE_DISK_CACHE || this.IAuthTabCallbackStub.IAuthTabCallbackStubProxy();
        SaversKtExternalSyntheticLambda3<Boolean> saversKtExternalSyntheticLambda3 = Api33ImplExternalSyntheticLambda0.onWarmupCompleted;
        Boolean bool = (Boolean) saversKtExternalSyntheticLambda30.IAuthTabCallback(saversKtExternalSyntheticLambda3);
        if (bool != null && (!bool.booleanValue() || z)) {
            return saversKtExternalSyntheticLambda30;
        }
        SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda302 = new SaversKtExternalSyntheticLambda30();
        saversKtExternalSyntheticLambda302.onWarmupCompleted(this.onPostMessage);
        saversKtExternalSyntheticLambda302.IAuthTabCallback(saversKtExternalSyntheticLambda3, Boolean.valueOf(z));
        return saversKtExternalSyntheticLambda302;
    }

    private <Data, ResourceType> Resource<R> onExtraCallbackWithResult(Data data, SaversKtExternalSyntheticLambda21 saversKtExternalSyntheticLambda21, Savers_androidKtExternalSyntheticLambda2<Data, ResourceType, R> savers_androidKtExternalSyntheticLambda2) throws SaversKtExternalSyntheticLambda7 {
        SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30OnNavigationEvent = onNavigationEvent(saversKtExternalSyntheticLambda21);
        SaversKtExternalSyntheticLambda33<Data> saversKtExternalSyntheticLambda33OnExtraCallbackWithResult = this.getInterfaceDescriptor.asBinder().onExtraCallbackWithResult(data);
        try {
            return savers_androidKtExternalSyntheticLambda2.IAuthTabCallback(saversKtExternalSyntheticLambda33OnExtraCallbackWithResult, saversKtExternalSyntheticLambda30OnNavigationEvent, this.extraCommand, this.access100, new onNavigationEvent(saversKtExternalSyntheticLambda21));
        } finally {
            saversKtExternalSyntheticLambda33OnExtraCallbackWithResult.onWarmupCompleted();
        }
    }

    private void onExtraCallbackWithResult(String str, long j) {
        onExtraCallback(str, j, null);
    }

    private void onExtraCallback(String str, long j, String str2) {
        getSharedValues.onWarmupCompleted(j);
        Objects.toString(this.ICustomTabsCallback);
        if (str2 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(", ");
            sb.append(str2);
        }
        Thread.currentThread().getName();
    }

    @Override // o.forceLayout.onNavigationEvent
    public dispatchDraw ah_() {
        return this.ICustomTabsCallbackStub;
    }

    <Z> Resource<Z> IAuthTabCallback(SaversKtExternalSyntheticLambda21 saversKtExternalSyntheticLambda21, @NonNull Resource<Z> resource) {
        Resource<Z> resourceTransform;
        SaversKtExternalSyntheticLambda29<Z> saversKtExternalSyntheticLambda29;
        SaversKtExternalSyntheticLambda23 saversKtExternalSyntheticLambda23IAuthTabCallback;
        SaversKtExternalSyntheticLambda26 saversKtExternalSyntheticLambda51;
        Class<?> cls = resource.IAuthTabCallback().getClass();
        ResourceEncoder<Z> resourceEncoderOnExtraCallback = null;
        if (saversKtExternalSyntheticLambda21 != SaversKtExternalSyntheticLambda21.RESOURCE_DISK_CACHE) {
            SaversKtExternalSyntheticLambda29<Z> saversKtExternalSyntheticLambda29OnWarmupCompleted = this.IAuthTabCallbackStub.onWarmupCompleted((Class) cls);
            saversKtExternalSyntheticLambda29 = saversKtExternalSyntheticLambda29OnWarmupCompleted;
            resourceTransform = saversKtExternalSyntheticLambda29OnWarmupCompleted.transform(this.getInterfaceDescriptor, resource, this.extraCommand, this.access100);
        } else {
            resourceTransform = resource;
            saversKtExternalSyntheticLambda29 = null;
        }
        if (!resource.equals(resourceTransform)) {
            resource.asBinder();
        }
        if (this.IAuthTabCallbackStub.onExtraCallbackWithResult((Resource<?>) resourceTransform)) {
            resourceEncoderOnExtraCallback = this.IAuthTabCallbackStub.onExtraCallback(resourceTransform);
            saversKtExternalSyntheticLambda23IAuthTabCallback = resourceEncoderOnExtraCallback.IAuthTabCallback(this.onPostMessage);
        } else {
            saversKtExternalSyntheticLambda23IAuthTabCallback = SaversKtExternalSyntheticLambda23.NONE;
        }
        ResourceEncoder resourceEncoder = resourceEncoderOnExtraCallback;
        if (!this.IAuthTabCallbackStubProxy.onNavigationEvent(!this.IAuthTabCallbackStub.onExtraCallback(this.onTransact), saversKtExternalSyntheticLambda21, saversKtExternalSyntheticLambda23IAuthTabCallback)) {
            return resourceTransform;
        }
        if (resourceEncoder == null) {
            throw new Registry.NoResultEncoderAvailableException(resourceTransform.IAuthTabCallback().getClass());
        }
        int i2 = AnonymousClass1.onWarmupCompleted[saversKtExternalSyntheticLambda23IAuthTabCallback.ordinal()];
        if (i2 == 1) {
            saversKtExternalSyntheticLambda51 = new SaversKtExternalSyntheticLambda51(this.onTransact, this.ICustomTabsCallbackDefault);
        } else if (i2 == 2) {
            saversKtExternalSyntheticLambda51 = new ResourceCacheKey(this.IAuthTabCallbackStub.onExtraCallbackWithResult(), this.onTransact, this.ICustomTabsCallbackDefault, this.extraCommand, this.access100, saversKtExternalSyntheticLambda29, cls, this.onPostMessage);
        } else {
            throw new IllegalArgumentException("Unknown strategy: " + saversKtExternalSyntheticLambda23IAuthTabCallback);
        }
        Savers_androidKtExternalSyntheticLambda1 savers_androidKtExternalSyntheticLambda1OnNavigationEvent = Savers_androidKtExternalSyntheticLambda1.onNavigationEvent(resourceTransform);
        this.asBinder.onExtraCallbackWithResult(saversKtExternalSyntheticLambda51, resourceEncoder, savers_androidKtExternalSyntheticLambda1OnNavigationEvent);
        return savers_androidKtExternalSyntheticLambda1OnNavigationEvent;
    }

    /* renamed from: o.SaversKtExternalSyntheticLambda56$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] onExtraCallback;
        static final /* synthetic */ int[] onExtraCallbackWithResult;
        static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[SaversKtExternalSyntheticLambda23.values().length];
            onWarmupCompleted = iArr;
            try {
                iArr[SaversKtExternalSyntheticLambda23.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                onWarmupCompleted[SaversKtExternalSyntheticLambda23.TRANSFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[IAuthTabCallbackDefault.values().length];
            onExtraCallbackWithResult = iArr2;
            try {
                iArr2[IAuthTabCallbackDefault.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                onExtraCallbackWithResult[IAuthTabCallbackDefault.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                onExtraCallbackWithResult[IAuthTabCallbackDefault.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                onExtraCallbackWithResult[IAuthTabCallbackDefault.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                onExtraCallbackWithResult[IAuthTabCallbackDefault.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[IAuthTabCallbackStub.values().length];
            onExtraCallback = iArr3;
            try {
                iArr3[IAuthTabCallbackStub.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                onExtraCallback[IAuthTabCallbackStub.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                onExtraCallback[IAuthTabCallbackStub.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    final class onNavigationEvent<Z> implements SaversKtExternalSyntheticLambda54.IAuthTabCallback<Z> {
        private final SaversKtExternalSyntheticLambda21 onNavigationEvent;

        onNavigationEvent(SaversKtExternalSyntheticLambda21 saversKtExternalSyntheticLambda21) {
            this.onNavigationEvent = saversKtExternalSyntheticLambda21;
        }

        @Override // o.SaversKtExternalSyntheticLambda54.IAuthTabCallback
        public Resource<Z> onWarmupCompleted(@NonNull Resource<Z> resource) {
            return SaversKtExternalSyntheticLambda56.this.IAuthTabCallback(this.onNavigationEvent, resource);
        }
    }

    static class IAuthTabCallback {
        private boolean IAuthTabCallback;
        private boolean onNavigationEvent;
        private boolean onWarmupCompleted;

        IAuthTabCallback() {
        }

        boolean IAuthTabCallback(boolean z) {
            boolean zOnExtraCallback;
            synchronized (this) {
                this.onWarmupCompleted = true;
                zOnExtraCallback = onExtraCallback(z);
            }
            return zOnExtraCallback;
        }

        boolean onNavigationEvent() {
            boolean zOnExtraCallback;
            synchronized (this) {
                this.IAuthTabCallback = true;
                zOnExtraCallback = onExtraCallback(false);
            }
            return zOnExtraCallback;
        }

        boolean onExtraCallback() {
            boolean zOnExtraCallback;
            synchronized (this) {
                this.onNavigationEvent = true;
                zOnExtraCallback = onExtraCallback(false);
            }
            return zOnExtraCallback;
        }

        void IAuthTabCallback() {
            synchronized (this) {
                this.IAuthTabCallback = false;
                this.onWarmupCompleted = false;
                this.onNavigationEvent = false;
            }
        }

        private boolean onExtraCallback(boolean z) {
            return (this.onNavigationEvent || z || this.IAuthTabCallback) && this.onWarmupCompleted;
        }
    }

    static class onExtraCallbackWithResult<Z> {
        private SaversKtExternalSyntheticLambda26 IAuthTabCallback;
        private ResourceEncoder<Z> onExtraCallbackWithResult;
        private Savers_androidKtExternalSyntheticLambda1<Z> onWarmupCompleted;

        onExtraCallbackWithResult() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        <X> void onExtraCallbackWithResult(SaversKtExternalSyntheticLambda26 saversKtExternalSyntheticLambda26, ResourceEncoder<X> resourceEncoder, Savers_androidKtExternalSyntheticLambda1<X> savers_androidKtExternalSyntheticLambda1) {
            this.IAuthTabCallback = saversKtExternalSyntheticLambda26;
            this.onExtraCallbackWithResult = resourceEncoder;
            this.onWarmupCompleted = savers_androidKtExternalSyntheticLambda1;
        }

        void onExtraCallbackWithResult(onExtraCallback onextracallback, SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) {
            try {
                onextracallback.onExtraCallback().IAuthTabCallback(this.IAuthTabCallback, new SaversKtExternalSyntheticLambda50(this.onExtraCallbackWithResult, this.onWarmupCompleted, saversKtExternalSyntheticLambda30));
            } finally {
                this.onWarmupCompleted.onWarmupCompleted();
            }
        }

        boolean onExtraCallback() {
            return this.onWarmupCompleted != null;
        }

        void IAuthTabCallback() {
            this.IAuthTabCallback = null;
            this.onExtraCallbackWithResult = null;
            this.onWarmupCompleted = null;
        }
    }
}
