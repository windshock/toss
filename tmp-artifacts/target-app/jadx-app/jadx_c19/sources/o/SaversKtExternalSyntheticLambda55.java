package o;

import androidx.core.util.Pools;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.request.ResourceCallback;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import o.SaversKtExternalSyntheticLambda56;
import o.SaversKtExternalSyntheticLambda60;
import o.forceLayout;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class SaversKtExternalSyntheticLambda55<R> implements SaversKtExternalSyntheticLambda56.onWarmupCompleted<R>, forceLayout.onNavigationEvent {
    private static final IAuthTabCallback onWarmupCompleted = new IAuthTabCallback();
    SaversKtExternalSyntheticLambda7 IAuthTabCallback;
    private final IAuthTabCallback IAuthTabCallbackDefault;
    private final SaversKtExternalSyntheticLambda6 IAuthTabCallbackStub;
    private boolean IAuthTabCallbackStubProxy;
    private boolean IAuthTabCallback_Parcel;
    private Resource<?> ICustomTabsCallback;
    private boolean ICustomTabsCallbackStubProxy;
    private boolean access000;
    private volatile boolean access100;
    private final TypefaceRequestCacheExternalSyntheticLambda0 asBinder;
    private final TypefaceRequestCacheExternalSyntheticLambda0 asInterface;
    private final Pools.onExtraCallback<SaversKtExternalSyntheticLambda55<?>> extraCallback;
    private SaversKtExternalSyntheticLambda26 extraCallbackWithResult;
    private boolean getInterfaceDescriptor;
    private final TypefaceRequestCacheExternalSyntheticLambda0 onActivityLayout;
    private final SaversKtExternalSyntheticLambda60.IAuthTabCallback onActivityResized;
    final onExtraCallbackWithResult onExtraCallback;
    SaversKtExternalSyntheticLambda21 onExtraCallbackWithResult;
    private final TypefaceRequestCacheExternalSyntheticLambda0 onMessageChannelReady;
    private final dispatchDraw onMinimized;
    SaversKtExternalSyntheticLambda60<?> onNavigationEvent;
    private boolean onPostMessage;
    private SaversKtExternalSyntheticLambda56<R> onTransact;
    private final AtomicInteger readTypedObject;
    private boolean writeTypedObject;

    SaversKtExternalSyntheticLambda55(TypefaceRequestCacheExternalSyntheticLambda0 typefaceRequestCacheExternalSyntheticLambda0, TypefaceRequestCacheExternalSyntheticLambda0 typefaceRequestCacheExternalSyntheticLambda02, TypefaceRequestCacheExternalSyntheticLambda0 typefaceRequestCacheExternalSyntheticLambda03, TypefaceRequestCacheExternalSyntheticLambda0 typefaceRequestCacheExternalSyntheticLambda04, SaversKtExternalSyntheticLambda6 saversKtExternalSyntheticLambda6, SaversKtExternalSyntheticLambda60.IAuthTabCallback iAuthTabCallback, Pools.onExtraCallback<SaversKtExternalSyntheticLambda55<?>> onextracallback) {
        this(typefaceRequestCacheExternalSyntheticLambda0, typefaceRequestCacheExternalSyntheticLambda02, typefaceRequestCacheExternalSyntheticLambda03, typefaceRequestCacheExternalSyntheticLambda04, saversKtExternalSyntheticLambda6, iAuthTabCallback, onextracallback, onWarmupCompleted);
    }

    SaversKtExternalSyntheticLambda55(TypefaceRequestCacheExternalSyntheticLambda0 typefaceRequestCacheExternalSyntheticLambda0, TypefaceRequestCacheExternalSyntheticLambda0 typefaceRequestCacheExternalSyntheticLambda02, TypefaceRequestCacheExternalSyntheticLambda0 typefaceRequestCacheExternalSyntheticLambda03, TypefaceRequestCacheExternalSyntheticLambda0 typefaceRequestCacheExternalSyntheticLambda04, SaversKtExternalSyntheticLambda6 saversKtExternalSyntheticLambda6, SaversKtExternalSyntheticLambda60.IAuthTabCallback iAuthTabCallback, Pools.onExtraCallback<SaversKtExternalSyntheticLambda55<?>> onextracallback, IAuthTabCallback iAuthTabCallback2) {
        this.onExtraCallback = new onExtraCallbackWithResult();
        this.onMinimized = dispatchDraw.onWarmupCompleted();
        this.readTypedObject = new AtomicInteger();
        this.asBinder = typefaceRequestCacheExternalSyntheticLambda0;
        this.onMessageChannelReady = typefaceRequestCacheExternalSyntheticLambda02;
        this.onActivityLayout = typefaceRequestCacheExternalSyntheticLambda03;
        this.asInterface = typefaceRequestCacheExternalSyntheticLambda04;
        this.IAuthTabCallbackStub = saversKtExternalSyntheticLambda6;
        this.onActivityResized = iAuthTabCallback;
        this.extraCallback = onextracallback;
        this.IAuthTabCallbackDefault = iAuthTabCallback2;
    }

    SaversKtExternalSyntheticLambda55<R> onNavigationEvent(SaversKtExternalSyntheticLambda26 saversKtExternalSyntheticLambda26, boolean z, boolean z2, boolean z3, boolean z4) {
        synchronized (this) {
            this.extraCallbackWithResult = saversKtExternalSyntheticLambda26;
            this.getInterfaceDescriptor = z;
            this.ICustomTabsCallbackStubProxy = z2;
            this.onPostMessage = z3;
            this.writeTypedObject = z4;
        }
        return this;
    }

    public void IAuthTabCallback(SaversKtExternalSyntheticLambda56<R> saversKtExternalSyntheticLambda56) {
        synchronized (this) {
            this.onTransact = saversKtExternalSyntheticLambda56;
            (saversKtExternalSyntheticLambda56.IAuthTabCallback() ? this.asBinder : asInterface()).execute(saversKtExternalSyntheticLambda56);
        }
    }

    void onExtraCallbackWithResult(ResourceCallback resourceCallback, Executor executor) {
        synchronized (this) {
            this.onMinimized.onExtraCallback();
            this.onExtraCallback.IAuthTabCallback(resourceCallback, executor);
            if (this.IAuthTabCallback_Parcel) {
                onNavigationEvent(1);
                executor.execute(new onWarmupCompleted(resourceCallback));
            } else if (this.IAuthTabCallbackStubProxy) {
                onNavigationEvent(1);
                executor.execute(new onExtraCallback(resourceCallback));
            } else {
                markHierarchyDirty.onExtraCallbackWithResult(!this.access100, "Cannot add callbacks to a cancelled EngineJob");
            }
        }
    }

    void onExtraCallback(ResourceCallback resourceCallback) {
        try {
            resourceCallback.IAuthTabCallback(this.onNavigationEvent, this.onExtraCallbackWithResult, this.access000);
        } catch (Throwable th) {
            throw new SaversKtExternalSyntheticLambda48(th);
        }
    }

    void onNavigationEvent(ResourceCallback resourceCallback) {
        try {
            resourceCallback.onNavigationEvent(this.IAuthTabCallback);
        } catch (Throwable th) {
            throw new SaversKtExternalSyntheticLambda48(th);
        }
    }

    void onWarmupCompleted(ResourceCallback resourceCallback) {
        synchronized (this) {
            this.onMinimized.onExtraCallback();
            this.onExtraCallback.onExtraCallbackWithResult(resourceCallback);
            if (this.onExtraCallback.onExtraCallbackWithResult()) {
                IAuthTabCallback();
                if ((this.IAuthTabCallback_Parcel || this.IAuthTabCallbackStubProxy) && this.readTypedObject.get() == 0) {
                    IAuthTabCallbackDefault();
                }
            }
        }
    }

    boolean asBinder() {
        return this.writeTypedObject;
    }

    private TypefaceRequestCacheExternalSyntheticLambda0 asInterface() {
        if (this.ICustomTabsCallbackStubProxy) {
            return this.onActivityLayout;
        }
        return this.onPostMessage ? this.asInterface : this.onMessageChannelReady;
    }

    void IAuthTabCallback() {
        if (IAuthTabCallbackStub()) {
            return;
        }
        this.access100 = true;
        this.onTransact.onExtraCallback();
        this.IAuthTabCallbackStub.onNavigationEvent(this, this.extraCallbackWithResult);
    }

    private boolean IAuthTabCallbackStub() {
        return this.IAuthTabCallbackStubProxy || this.IAuthTabCallback_Parcel || this.access100;
    }

    void onExtraCallback() {
        synchronized (this) {
            this.onMinimized.onExtraCallback();
            if (this.access100) {
                this.ICustomTabsCallback.asBinder();
                IAuthTabCallbackDefault();
                return;
            }
            if (this.onExtraCallback.onExtraCallbackWithResult()) {
                throw new IllegalStateException("Received a resource without any callbacks to notify");
            }
            if (this.IAuthTabCallback_Parcel) {
                throw new IllegalStateException("Already have resource");
            }
            this.onNavigationEvent = this.IAuthTabCallbackDefault.onWarmupCompleted(this.ICustomTabsCallback, this.getInterfaceDescriptor, this.extraCallbackWithResult, this.onActivityResized);
            this.IAuthTabCallback_Parcel = true;
            onExtraCallbackWithResult onextracallbackwithresultOnExtraCallback = this.onExtraCallback.onExtraCallback();
            onNavigationEvent(onextracallbackwithresultOnExtraCallback.IAuthTabCallback() + 1);
            this.IAuthTabCallbackStub.IAuthTabCallback(this, this.extraCallbackWithResult, this.onNavigationEvent);
            Iterator<onNavigationEvent> it = onextracallbackwithresultOnExtraCallback.iterator();
            while (it.hasNext()) {
                onNavigationEvent next = it.next();
                next.onNavigationEvent.execute(new onWarmupCompleted(next.onExtraCallback));
            }
            onNavigationEvent();
        }
    }

    void onNavigationEvent(int i2) {
        SaversKtExternalSyntheticLambda60<?> saversKtExternalSyntheticLambda60;
        synchronized (this) {
            markHierarchyDirty.onExtraCallbackWithResult(IAuthTabCallbackStub(), "Not yet complete!");
            if (this.readTypedObject.getAndAdd(i2) == 0 && (saversKtExternalSyntheticLambda60 = this.onNavigationEvent) != null) {
                saversKtExternalSyntheticLambda60.onWarmupCompleted();
            }
        }
    }

    void onNavigationEvent() {
        SaversKtExternalSyntheticLambda60<?> saversKtExternalSyntheticLambda60;
        synchronized (this) {
            this.onMinimized.onExtraCallback();
            markHierarchyDirty.onExtraCallbackWithResult(IAuthTabCallbackStub(), "Not yet complete!");
            int iDecrementAndGet = this.readTypedObject.decrementAndGet();
            markHierarchyDirty.onExtraCallbackWithResult(iDecrementAndGet >= 0, "Can't decrement below 0");
            if (iDecrementAndGet == 0) {
                saversKtExternalSyntheticLambda60 = this.onNavigationEvent;
                IAuthTabCallbackDefault();
            } else {
                saversKtExternalSyntheticLambda60 = null;
            }
        }
        if (saversKtExternalSyntheticLambda60 != null) {
            saversKtExternalSyntheticLambda60.onTransact();
        }
    }

    private void IAuthTabCallbackDefault() {
        synchronized (this) {
            if (this.extraCallbackWithResult == null) {
                throw new IllegalArgumentException();
            }
            this.onExtraCallback.onNavigationEvent();
            this.extraCallbackWithResult = null;
            this.onNavigationEvent = null;
            this.ICustomTabsCallback = null;
            this.IAuthTabCallbackStubProxy = false;
            this.access100 = false;
            this.IAuthTabCallback_Parcel = false;
            this.access000 = false;
            this.onTransact.onWarmupCompleted(false);
            this.onTransact = null;
            this.IAuthTabCallback = null;
            this.onExtraCallbackWithResult = null;
            this.extraCallback.onWarmupCompleted(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.SaversKtExternalSyntheticLambda56.onWarmupCompleted
    public void IAuthTabCallback(Resource<R> resource, SaversKtExternalSyntheticLambda21 saversKtExternalSyntheticLambda21, boolean z) {
        synchronized (this) {
            this.ICustomTabsCallback = resource;
            this.onExtraCallbackWithResult = saversKtExternalSyntheticLambda21;
            this.access000 = z;
        }
        onExtraCallback();
    }

    @Override // o.SaversKtExternalSyntheticLambda56.onWarmupCompleted
    public void onExtraCallbackWithResult(SaversKtExternalSyntheticLambda7 saversKtExternalSyntheticLambda7) {
        synchronized (this) {
            this.IAuthTabCallback = saversKtExternalSyntheticLambda7;
        }
        onWarmupCompleted();
    }

    @Override // o.SaversKtExternalSyntheticLambda56.onWarmupCompleted
    public void onExtraCallback(SaversKtExternalSyntheticLambda56<?> saversKtExternalSyntheticLambda56) {
        asInterface().execute(saversKtExternalSyntheticLambda56);
    }

    void onWarmupCompleted() {
        synchronized (this) {
            this.onMinimized.onExtraCallback();
            if (this.access100) {
                IAuthTabCallbackDefault();
                return;
            }
            if (this.onExtraCallback.onExtraCallbackWithResult()) {
                throw new IllegalStateException("Received an exception without any callbacks to notify");
            }
            if (this.IAuthTabCallbackStubProxy) {
                throw new IllegalStateException("Already failed once");
            }
            this.IAuthTabCallbackStubProxy = true;
            SaversKtExternalSyntheticLambda26 saversKtExternalSyntheticLambda26 = this.extraCallbackWithResult;
            onExtraCallbackWithResult onextracallbackwithresultOnExtraCallback = this.onExtraCallback.onExtraCallback();
            onNavigationEvent(onextracallbackwithresultOnExtraCallback.IAuthTabCallback() + 1);
            this.IAuthTabCallbackStub.IAuthTabCallback(this, saversKtExternalSyntheticLambda26, null);
            Iterator<onNavigationEvent> it = onextracallbackwithresultOnExtraCallback.iterator();
            while (it.hasNext()) {
                onNavigationEvent next = it.next();
                next.onNavigationEvent.execute(new onExtraCallback(next.onExtraCallback));
            }
            onNavigationEvent();
        }
    }

    @Override // o.forceLayout.onNavigationEvent
    public dispatchDraw ah_() {
        return this.onMinimized;
    }

    class onExtraCallback implements Runnable {
        private final ResourceCallback onExtraCallbackWithResult;

        onExtraCallback(ResourceCallback resourceCallback) {
            this.onExtraCallbackWithResult = resourceCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.onExtraCallbackWithResult.IAuthTabCallback()) {
                synchronized (SaversKtExternalSyntheticLambda55.this) {
                    if (SaversKtExternalSyntheticLambda55.this.onExtraCallback.onExtraCallback(this.onExtraCallbackWithResult)) {
                        SaversKtExternalSyntheticLambda55.this.onNavigationEvent(this.onExtraCallbackWithResult);
                    }
                    SaversKtExternalSyntheticLambda55.this.onNavigationEvent();
                }
            }
        }
    }

    class onWarmupCompleted implements Runnable {
        private final ResourceCallback onExtraCallbackWithResult;

        onWarmupCompleted(ResourceCallback resourceCallback) {
            this.onExtraCallbackWithResult = resourceCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.onExtraCallbackWithResult.IAuthTabCallback()) {
                synchronized (SaversKtExternalSyntheticLambda55.this) {
                    if (SaversKtExternalSyntheticLambda55.this.onExtraCallback.onExtraCallback(this.onExtraCallbackWithResult)) {
                        SaversKtExternalSyntheticLambda55.this.onNavigationEvent.onWarmupCompleted();
                        SaversKtExternalSyntheticLambda55.this.onExtraCallback(this.onExtraCallbackWithResult);
                        SaversKtExternalSyntheticLambda55.this.onWarmupCompleted(this.onExtraCallbackWithResult);
                    }
                    SaversKtExternalSyntheticLambda55.this.onNavigationEvent();
                }
            }
        }
    }

    static final class onExtraCallbackWithResult implements Iterable<onNavigationEvent> {
        private final List<onNavigationEvent> onNavigationEvent;

        onExtraCallbackWithResult() {
            this(new ArrayList(2));
        }

        onExtraCallbackWithResult(List<onNavigationEvent> list) {
            this.onNavigationEvent = list;
        }

        void IAuthTabCallback(ResourceCallback resourceCallback, Executor executor) {
            this.onNavigationEvent.add(new onNavigationEvent(resourceCallback, executor));
        }

        void onExtraCallbackWithResult(ResourceCallback resourceCallback) {
            this.onNavigationEvent.remove(onWarmupCompleted(resourceCallback));
        }

        boolean onExtraCallback(ResourceCallback resourceCallback) {
            return this.onNavigationEvent.contains(onWarmupCompleted(resourceCallback));
        }

        boolean onExtraCallbackWithResult() {
            return this.onNavigationEvent.isEmpty();
        }

        int IAuthTabCallback() {
            return this.onNavigationEvent.size();
        }

        void onNavigationEvent() {
            this.onNavigationEvent.clear();
        }

        onExtraCallbackWithResult onExtraCallback() {
            return new onExtraCallbackWithResult(new ArrayList(this.onNavigationEvent));
        }

        private static onNavigationEvent onWarmupCompleted(ResourceCallback resourceCallback) {
            return new onNavigationEvent(resourceCallback, setMargin.onWarmupCompleted());
        }

        @Override // java.lang.Iterable
        public Iterator<onNavigationEvent> iterator() {
            return this.onNavigationEvent.iterator();
        }
    }

    static final class onNavigationEvent {
        final ResourceCallback onExtraCallback;
        final Executor onNavigationEvent;

        onNavigationEvent(ResourceCallback resourceCallback, Executor executor) {
            this.onExtraCallback = resourceCallback;
            this.onNavigationEvent = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof onNavigationEvent) {
                return this.onExtraCallback.equals(((onNavigationEvent) obj).onExtraCallback);
            }
            return false;
        }

        public int hashCode() {
            return this.onExtraCallback.hashCode();
        }
    }

    static class IAuthTabCallback {
        IAuthTabCallback() {
        }

        public <R> SaversKtExternalSyntheticLambda60<R> onWarmupCompleted(Resource<R> resource, boolean z, SaversKtExternalSyntheticLambda26 saversKtExternalSyntheticLambda26, SaversKtExternalSyntheticLambda60.IAuthTabCallback iAuthTabCallback) {
            return new SaversKtExternalSyntheticLambda60<>(resource, z, true, saversKtExternalSyntheticLambda26, iAuthTabCallback);
        }
    }
}
