package io.realm;

import io.realm.exceptions.RealmFileException;
import io.realm.internal.OsObjectStore;
import io.realm.internal.OsRealmConfig;
import io.realm.internal.OsSharedRealm;
import io.realm.internal.Util;
import io.realm.log.RealmLog;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import o.TombstoneProtosLogMessageOrBuilder;
import o.access21400;
import o.access22500;
import o.access23600;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class RealmCache {
    private static final List<WeakReference<RealmCache>> onExtraCallbackWithResult = new ArrayList();
    private static final Collection<RealmCache> onNavigationEvent = new ConcurrentLinkedQueue();
    private final String asInterface;
    private RealmConfiguration onExtraCallback;
    private final Map<access23600<RealmCacheType, OsSharedRealm.onWarmupCompleted>, ReferenceCounter> asBinder = new HashMap();
    private final AtomicBoolean IAuthTabCallback = new AtomicBoolean(false);
    private final Set<String> onWarmupCompleted = new HashSet();

    public interface Callback {
        void onWarmupCompleted(int i);
    }

    static abstract class ReferenceCounter {
        protected final ThreadLocal<Integer> IAuthTabCallback;
        protected AtomicInteger onNavigationEvent;

        abstract int IAuthTabCallback();

        abstract TombstoneProtosLogMessageOrBuilder onExtraCallback();

        abstract void onExtraCallbackWithResult();

        abstract boolean onNavigationEvent();

        abstract void onWarmupCompleted(TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilder);

        private ReferenceCounter() {
            this.IAuthTabCallback = new ThreadLocal<>();
            this.onNavigationEvent = new AtomicInteger(0);
        }

        public void onNavigationEvent(int i) {
            Integer num = this.IAuthTabCallback.get();
            ThreadLocal<Integer> threadLocal = this.IAuthTabCallback;
            if (num != null) {
                i += num.intValue();
            }
            threadLocal.set(Integer.valueOf(i));
        }

        public void onExtraCallbackWithResult(int i) {
            this.IAuthTabCallback.set(Integer.valueOf(i));
        }

        public int onWarmupCompleted() {
            return this.onNavigationEvent.get();
        }
    }

    static class GlobalReferenceCounter extends ReferenceCounter {
        private TombstoneProtosLogMessageOrBuilder onExtraCallback;

        private GlobalReferenceCounter() {
            super();
        }

        @Override // io.realm.RealmCache.ReferenceCounter
        boolean onNavigationEvent() {
            return this.onExtraCallback != null;
        }

        @Override // io.realm.RealmCache.ReferenceCounter
        TombstoneProtosLogMessageOrBuilder onExtraCallback() {
            return this.onExtraCallback;
        }

        @Override // io.realm.RealmCache.ReferenceCounter
        void onWarmupCompleted(TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilder) {
            this.onExtraCallback = tombstoneProtosLogMessageOrBuilder;
            this.IAuthTabCallback.set(0);
            this.onNavigationEvent.incrementAndGet();
        }

        @Override // io.realm.RealmCache.ReferenceCounter
        public void onExtraCallbackWithResult() {
            String strIAuthTabCallback_Parcel = this.onExtraCallback.IAuthTabCallback_Parcel();
            this.IAuthTabCallback.set(null);
            this.onExtraCallback = null;
            if (this.onNavigationEvent.decrementAndGet() >= 0) {
                return;
            }
            throw new IllegalStateException("Global reference counter of Realm" + strIAuthTabCallback_Parcel + " not be negative.");
        }

        @Override // io.realm.RealmCache.ReferenceCounter
        int IAuthTabCallback() {
            return this.onNavigationEvent.get();
        }
    }

    static class ThreadConfinedReferenceCounter extends ReferenceCounter {
        private final ThreadLocal<TombstoneProtosLogMessageOrBuilder> onWarmupCompleted;

        private ThreadConfinedReferenceCounter() {
            super();
            this.onWarmupCompleted = new ThreadLocal<>();
        }

        @Override // io.realm.RealmCache.ReferenceCounter
        public boolean onNavigationEvent() {
            return this.onWarmupCompleted.get() != null;
        }

        @Override // io.realm.RealmCache.ReferenceCounter
        public TombstoneProtosLogMessageOrBuilder onExtraCallback() {
            return this.onWarmupCompleted.get();
        }

        @Override // io.realm.RealmCache.ReferenceCounter
        public void onWarmupCompleted(TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilder) {
            this.onWarmupCompleted.set(tombstoneProtosLogMessageOrBuilder);
            this.IAuthTabCallback.set(0);
            this.onNavigationEvent.incrementAndGet();
        }

        @Override // io.realm.RealmCache.ReferenceCounter
        public void onExtraCallbackWithResult() {
            String strIAuthTabCallback_Parcel = this.onWarmupCompleted.get().IAuthTabCallback_Parcel();
            this.IAuthTabCallback.set(null);
            this.onWarmupCompleted.set(null);
            if (this.onNavigationEvent.decrementAndGet() >= 0) {
                return;
            }
            throw new IllegalStateException("Global reference counter of Realm" + strIAuthTabCallback_Parcel + " can not be negative.");
        }

        @Override // io.realm.RealmCache.ReferenceCounter
        public int IAuthTabCallback() {
            Integer num = this.IAuthTabCallback.get();
            if (num != null) {
                return num.intValue();
            }
            return 0;
        }
    }

    enum RealmCacheType {
        TYPED_REALM,
        DYNAMIC_REALM;

        static RealmCacheType valueOf(Class<? extends TombstoneProtosLogMessageOrBuilder> cls) {
            if (cls == Realm.class) {
                return TYPED_REALM;
            }
            if (cls == access21400.class) {
                return DYNAMIC_REALM;
            }
            throw new IllegalArgumentException("The type of Realm class must be Realm or DynamicRealm.");
        }
    }

    private RealmCache(String str) {
        this.asInterface = str;
    }

    private static RealmCache onNavigationEvent(String str, boolean z) {
        RealmCache realmCache;
        List<WeakReference<RealmCache>> list = onExtraCallbackWithResult;
        synchronized (list) {
            Iterator<WeakReference<RealmCache>> it = list.iterator();
            realmCache = null;
            while (it.hasNext()) {
                RealmCache realmCache2 = it.next().get();
                if (realmCache2 == null) {
                    it.remove();
                } else if (realmCache2.asInterface.equals(str)) {
                    realmCache = realmCache2;
                }
            }
            if (realmCache == null && z) {
                realmCache = new RealmCache(str);
                onExtraCallbackWithResult.add(new WeakReference<>(realmCache));
            }
        }
        return realmCache;
    }

    public static <E extends TombstoneProtosLogMessageOrBuilder> E IAuthTabCallback(RealmConfiguration realmConfiguration, Class<E> cls) {
        return (E) onNavigationEvent(realmConfiguration.asInterface(), true).onExtraCallbackWithResult(realmConfiguration, cls, OsSharedRealm.onWarmupCompleted.IAuthTabCallback);
    }

    public static <E extends TombstoneProtosLogMessageOrBuilder> E onWarmupCompleted(RealmConfiguration realmConfiguration, Class<E> cls, OsSharedRealm.onWarmupCompleted onwarmupcompleted) {
        return (E) onNavigationEvent(realmConfiguration.asInterface(), true).onExtraCallbackWithResult(realmConfiguration, cls, onwarmupcompleted);
    }

    private <E extends TombstoneProtosLogMessageOrBuilder> E onExtraCallbackWithResult(RealmConfiguration realmConfiguration, Class<E> cls, OsSharedRealm.onWarmupCompleted onwarmupcompleted) {
        E e;
        synchronized (this) {
            ReferenceCounter referenceCounterOnExtraCallback = onExtraCallback(cls, onwarmupcompleted);
            boolean z = onExtraCallback() == 0;
            if (z) {
                onWarmupCompleted(realmConfiguration);
                boolean zOnMinimized = realmConfiguration.onMinimized();
                if (realmConfiguration.readTypedObject() && (!zOnMinimized || this.onWarmupCompleted.contains(realmConfiguration.asInterface()))) {
                    new OsRealmConfig.onWarmupCompleted(realmConfiguration).onExtraCallback();
                    access22500.onExtraCallback();
                    access22500.onExtraCallback();
                    this.onWarmupCompleted.remove(realmConfiguration.asInterface());
                }
                this.onExtraCallback = realmConfiguration;
            } else {
                onNavigationEvent(realmConfiguration);
            }
            if (!referenceCounterOnExtraCallback.onNavigationEvent()) {
                onExtraCallbackWithResult(cls, referenceCounterOnExtraCallback, onwarmupcompleted);
            }
            referenceCounterOnExtraCallback.onNavigationEvent(1);
            e = (E) referenceCounterOnExtraCallback.onExtraCallback();
            if (z) {
                access22500.onExtraCallback();
                Realm.onExtraCallbackWithResult(e.IAuthTabCallbackDefault);
                if (!realmConfiguration.extraCallbackWithResult()) {
                    e.writeTypedObject();
                }
            }
        }
        return e;
    }

    private <E extends TombstoneProtosLogMessageOrBuilder> ReferenceCounter onExtraCallback(Class<E> cls, OsSharedRealm.onWarmupCompleted onwarmupcompleted) {
        access23600<RealmCacheType, OsSharedRealm.onWarmupCompleted> access23600Var = new access23600<>(RealmCacheType.valueOf((Class<? extends TombstoneProtosLogMessageOrBuilder>) cls), onwarmupcompleted);
        ReferenceCounter globalReferenceCounter = this.asBinder.get(access23600Var);
        if (globalReferenceCounter == null) {
            boolean zEquals = onwarmupcompleted.equals(OsSharedRealm.onWarmupCompleted.IAuthTabCallback);
            if (zEquals) {
                globalReferenceCounter = new ThreadConfinedReferenceCounter();
            } else {
                globalReferenceCounter = new GlobalReferenceCounter();
            }
            this.asBinder.put(access23600Var, globalReferenceCounter);
        }
        return globalReferenceCounter;
    }

    private <E extends TombstoneProtosLogMessageOrBuilder> void onExtraCallbackWithResult(Class<E> cls, ReferenceCounter referenceCounter, OsSharedRealm.onWarmupCompleted onwarmupcompleted) {
        TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilderOnWarmupCompleted;
        if (cls == Realm.class) {
            tombstoneProtosLogMessageOrBuilderOnWarmupCompleted = Realm.onExtraCallback(this, onwarmupcompleted);
            tombstoneProtosLogMessageOrBuilderOnWarmupCompleted.access000().onExtraCallback();
        } else if (cls == access21400.class) {
            tombstoneProtosLogMessageOrBuilderOnWarmupCompleted = access21400.onWarmupCompleted(this, onwarmupcompleted);
        } else {
            throw new IllegalArgumentException("The type of Realm class must be Realm or DynamicRealm.");
        }
        referenceCounter.onWarmupCompleted(tombstoneProtosLogMessageOrBuilderOnWarmupCompleted);
    }

    public void onNavigationEvent(TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilder) {
        TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilderOnExtraCallback;
        synchronized (this) {
            String strIAuthTabCallback_Parcel = tombstoneProtosLogMessageOrBuilder.IAuthTabCallback_Parcel();
            ReferenceCounter referenceCounterOnExtraCallback = onExtraCallback(tombstoneProtosLogMessageOrBuilder.getClass(), tombstoneProtosLogMessageOrBuilder.readTypedObject() ? tombstoneProtosLogMessageOrBuilder.IAuthTabCallbackDefault.getVersionID() : OsSharedRealm.onWarmupCompleted.IAuthTabCallback);
            int iIAuthTabCallback = referenceCounterOnExtraCallback.IAuthTabCallback();
            if (iIAuthTabCallback <= 0) {
                RealmLog.onExtraCallbackWithResult("%s has been closed already. refCount is %s", strIAuthTabCallback_Parcel, Integer.valueOf(iIAuthTabCallback));
                return;
            }
            int i = iIAuthTabCallback - 1;
            if (i == 0) {
                referenceCounterOnExtraCallback.onExtraCallbackWithResult();
                tombstoneProtosLogMessageOrBuilder.IAuthTabCallbackStub();
                if (onWarmupCompleted() == 0) {
                    this.onExtraCallback = null;
                    for (ReferenceCounter referenceCounter : this.asBinder.values()) {
                        if ((referenceCounter instanceof GlobalReferenceCounter) && (tombstoneProtosLogMessageOrBuilderOnExtraCallback = referenceCounter.onExtraCallback()) != null) {
                            while (!tombstoneProtosLogMessageOrBuilderOnExtraCallback.extraCallbackWithResult()) {
                                tombstoneProtosLogMessageOrBuilderOnExtraCallback.close();
                            }
                        }
                    }
                    access22500.onWarmupCompleted(tombstoneProtosLogMessageOrBuilder.access100().readTypedObject());
                    tombstoneProtosLogMessageOrBuilder.access100();
                }
            } else {
                referenceCounterOnExtraCallback.onExtraCallbackWithResult(i);
            }
        }
    }

    private void onNavigationEvent(RealmConfiguration realmConfiguration) {
        if (this.onExtraCallback.equals(realmConfiguration)) {
            return;
        }
        if (!Arrays.equals(this.onExtraCallback.IAuthTabCallback(), realmConfiguration.IAuthTabCallback())) {
            throw new IllegalArgumentException("Wrong key used to decrypt Realm.");
        }
        RealmMigration realmMigrationIAuthTabCallbackStub = realmConfiguration.IAuthTabCallbackStub();
        RealmMigration realmMigrationIAuthTabCallbackStub2 = this.onExtraCallback.IAuthTabCallbackStub();
        if (realmMigrationIAuthTabCallbackStub2 != null && realmMigrationIAuthTabCallbackStub != null && realmMigrationIAuthTabCallbackStub2.getClass().equals(realmMigrationIAuthTabCallbackStub.getClass()) && !realmMigrationIAuthTabCallbackStub.equals(realmMigrationIAuthTabCallbackStub2)) {
            throw new IllegalArgumentException("Configurations cannot be different if used to open the same file. The most likely cause is that equals() and hashCode() are not overridden in the migration class: " + realmConfiguration.IAuthTabCallbackStub().getClass().getCanonicalName());
        }
        throw new IllegalArgumentException("Configurations cannot be different if used to open the same file. \nCached configuration: \n" + this.onExtraCallback + "\n\nNew configuration: \n" + realmConfiguration);
    }

    public static void IAuthTabCallback(RealmConfiguration realmConfiguration, Callback callback) {
        synchronized (onExtraCallbackWithResult) {
            RealmCache realmCacheOnNavigationEvent = onNavigationEvent(realmConfiguration.asInterface(), false);
            if (realmCacheOnNavigationEvent == null) {
                callback.onWarmupCompleted(0);
            } else {
                realmCacheOnNavigationEvent.onExtraCallbackWithResult(callback);
            }
        }
    }

    private void onExtraCallbackWithResult(Callback callback) {
        synchronized (this) {
            callback.onWarmupCompleted(onExtraCallback());
        }
    }

    private static void onWarmupCompleted(final RealmConfiguration realmConfiguration) {
        final File file = realmConfiguration.access000() ? new File(realmConfiguration.asBinder(), realmConfiguration.IAuthTabCallback_Parcel()) : null;
        final String strIAuthTabCallback = access22500.onWarmupCompleted(realmConfiguration.readTypedObject()).IAuthTabCallback(realmConfiguration);
        boolean zOnNavigationEvent = Util.onNavigationEvent(strIAuthTabCallback);
        if (file == null && zOnNavigationEvent) {
            return;
        }
        final boolean z = !zOnNavigationEvent;
        OsObjectStore.onExtraCallback(realmConfiguration, new Runnable() { // from class: io.realm.RealmCache.1
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                if (file != null) {
                    RealmCache.onWarmupCompleted(realmConfiguration.onExtraCallback(), file);
                }
                if (z) {
                    RealmCache.onWarmupCompleted(access22500.onWarmupCompleted(realmConfiguration.readTypedObject()).onExtraCallbackWithResult(realmConfiguration), new File(strIAuthTabCallback));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0089 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void onWarmupCompleted(String str, File file) throws Throwable {
        FileOutputStream fileOutputStream;
        if (file.exists()) {
            return;
        }
        InputStream inputStream = null;
        e = null;
        FileOutputStream fileOutputStream2 = null;
        FileOutputStream fileOutputStream3 = null;
        inputStream = null;
        try {
            InputStream inputStreamOpen = TombstoneProtosLogMessageOrBuilder.IAuthTabCallback.getAssets().open(str);
            try {
                if (inputStreamOpen == null) {
                    throw new RealmFileException(RealmFileException.Kind.ACCESS_ERROR, "Invalid input stream to the asset file: " + str);
                }
                FileOutputStream fileOutputStream4 = new FileOutputStream(file);
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i = inputStreamOpen.read(bArr);
                        if (i >= 0) {
                            fileOutputStream4.write(bArr, 0, i);
                        } else {
                            try {
                                break;
                            } catch (IOException e) {
                                e = e;
                            }
                        }
                    }
                    inputStreamOpen.close();
                    try {
                        fileOutputStream4.close();
                    } catch (IOException e2) {
                        if (e == null) {
                            e = e2;
                        }
                    }
                    if (e != null) {
                        throw new RealmFileException(RealmFileException.Kind.ACCESS_ERROR, e);
                    }
                } catch (IOException e3) {
                    e = e3;
                    fileOutputStream2 = fileOutputStream4;
                    fileOutputStream = fileOutputStream2;
                    inputStream = inputStreamOpen;
                    try {
                        throw new RealmFileException(RealmFileException.Kind.ACCESS_ERROR, "Could not resolve the path to the asset file: " + str, e);
                    } catch (Throwable th) {
                        th = th;
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        if (fileOutputStream == null) {
                            try {
                                fileOutputStream.close();
                                throw th;
                            } catch (IOException unused2) {
                                throw th;
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream3 = fileOutputStream4;
                    fileOutputStream = fileOutputStream3;
                    inputStream = inputStreamOpen;
                    if (inputStream != null) {
                    }
                    if (fileOutputStream == null) {
                    }
                }
            } catch (IOException e4) {
                e = e4;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e5) {
            e = e5;
            fileOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
    }

    public RealmConfiguration onNavigationEvent() {
        return this.onExtraCallback;
    }

    private int onExtraCallback() {
        Iterator<ReferenceCounter> it = this.asBinder.values().iterator();
        int iOnWarmupCompleted = 0;
        while (it.hasNext()) {
            iOnWarmupCompleted += it.next().onWarmupCompleted();
        }
        return iOnWarmupCompleted;
    }

    private int onWarmupCompleted() {
        int iOnWarmupCompleted = 0;
        for (ReferenceCounter referenceCounter : this.asBinder.values()) {
            if (referenceCounter instanceof ThreadConfinedReferenceCounter) {
                iOnWarmupCompleted += referenceCounter.onWarmupCompleted();
            }
        }
        return iOnWarmupCompleted;
    }

    public void IAuthTabCallback() {
        if (this.IAuthTabCallback.getAndSet(true)) {
            return;
        }
        onNavigationEvent.add(this);
    }
}
