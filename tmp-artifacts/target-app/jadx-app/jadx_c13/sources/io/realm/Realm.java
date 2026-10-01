package io.realm;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import io.realm.Realm$;
import io.realm.RealmCache;
import io.realm.RealmConfiguration;
import io.realm.exceptions.RealmError;
import io.realm.exceptions.RealmException;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.exceptions.RealmPrimaryKeyConstraintException;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.OsSharedRealm;
import io.realm.internal.RealmCore;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.RealmProxyMediator;
import io.realm.internal.Table;
import io.realm.internal.Util;
import io.realm.log.RealmLog;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import kotlin.jvm.internal.IntCompanionObject;
import o.TombstoneProtosLogMessageOrBuilder;
import o.TombstoneProtosMemoryErrorOrBuilder;
import o.access22000;
import o.access22500;
import o.getBeginAddress;
import o.setBeginAddress;
import okhttp3.internal.url._UrlKt;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class Realm extends TombstoneProtosLogMessageOrBuilder {
    private static final Object IAuthTabCallbackStub = new Object();
    private static RealmConfiguration asInterface;
    private final RealmSchema IAuthTabCallback_Parcel;

    public interface Transaction {
        void execute(Realm realm);
    }

    @Override // o.TombstoneProtosLogMessageOrBuilder
    public /* bridge */ /* synthetic */ String IAuthTabCallback_Parcel() {
        return super.IAuthTabCallback_Parcel();
    }

    @Override // o.TombstoneProtosLogMessageOrBuilder
    public /* bridge */ /* synthetic */ long ICustomTabsCallback() {
        return super.ICustomTabsCallback();
    }

    @Override // o.TombstoneProtosLogMessageOrBuilder
    public /* bridge */ /* synthetic */ RealmConfiguration access100() {
        return super.access100();
    }

    @Override // o.TombstoneProtosLogMessageOrBuilder
    public /* bridge */ /* synthetic */ void asBinder() {
        super.asBinder();
    }

    @Override // o.TombstoneProtosLogMessageOrBuilder
    public /* bridge */ /* synthetic */ void asInterface() {
        super.asInterface();
    }

    @Override // o.TombstoneProtosLogMessageOrBuilder, java.io.Closeable, java.lang.AutoCloseable
    public /* bridge */ /* synthetic */ void close() {
        super.close();
    }

    @Override // o.TombstoneProtosLogMessageOrBuilder
    public /* bridge */ /* synthetic */ boolean extraCallback() {
        return super.extraCallback();
    }

    @Override // o.TombstoneProtosLogMessageOrBuilder
    public /* bridge */ /* synthetic */ boolean extraCallbackWithResult() {
        return super.extraCallbackWithResult();
    }

    @Override // o.TombstoneProtosLogMessageOrBuilder
    public /* bridge */ /* synthetic */ void onNavigationEvent() {
        super.onNavigationEvent();
    }

    @Override // o.TombstoneProtosLogMessageOrBuilder
    public /* bridge */ /* synthetic */ void onWarmupCompleted() {
        super.onWarmupCompleted();
    }

    @Override // o.TombstoneProtosLogMessageOrBuilder
    public /* bridge */ /* synthetic */ boolean readTypedObject() {
        return super.readTypedObject();
    }

    @Override // o.TombstoneProtosLogMessageOrBuilder
    public /* bridge */ /* synthetic */ void writeTypedObject() {
        super.writeTypedObject();
    }

    private Realm(RealmCache realmCache, OsSharedRealm.onWarmupCompleted onwarmupcompleted) {
        super(realmCache, onExtraCallbackWithResult(realmCache.onNavigationEvent().getInterfaceDescriptor()), onwarmupcompleted);
        this.IAuthTabCallback_Parcel = new setBeginAddress(this, new TombstoneProtosMemoryErrorOrBuilder(this.onExtraCallbackWithResult.getInterfaceDescriptor(), this.IAuthTabCallbackDefault.getSchemaInfo()));
        if (this.onExtraCallbackWithResult.extraCallbackWithResult()) {
            RealmProxyMediator interfaceDescriptor = this.onExtraCallbackWithResult.getInterfaceDescriptor();
            Iterator<Class<? extends RealmModel>> it = interfaceDescriptor.onExtraCallback().iterator();
            while (it.hasNext()) {
                String strOnExtraCallbackWithResult = Table.onExtraCallbackWithResult(interfaceDescriptor.asBinder(it.next()));
                if (!this.IAuthTabCallbackDefault.hasTable(strOnExtraCallbackWithResult)) {
                    this.IAuthTabCallbackDefault.close();
                    throw new RealmMigrationNeededException(this.onExtraCallbackWithResult.asInterface(), String.format(Locale.US, "Cannot open the read only Realm. '%s' is missing.", Table.onExtraCallback(strOnExtraCallbackWithResult)));
                }
            }
        }
    }

    private Realm(OsSharedRealm osSharedRealm) {
        super(osSharedRealm);
        this.IAuthTabCallback_Parcel = new setBeginAddress(this, new TombstoneProtosMemoryErrorOrBuilder(this.onExtraCallbackWithResult.getInterfaceDescriptor(), osSharedRealm.getSchemaInfo()));
    }

    private static OsSchemaInfo onExtraCallbackWithResult(RealmProxyMediator realmProxyMediator) {
        return new OsSchemaInfo(realmProxyMediator.onNavigationEvent().values());
    }

    @Override // o.TombstoneProtosLogMessageOrBuilder
    public RealmSchema access000() {
        return this.IAuthTabCallback_Parcel;
    }

    public static void IAuthTabCallback(Context context) {
        synchronized (Realm.class) {
            IAuthTabCallback(context, _UrlKt.FRAGMENT_ENCODE_SET);
        }
    }

    private static boolean onExtraCallbackWithResult(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return context.getPackageManager().isInstantApp();
        }
        try {
            return ((Boolean) Class.forName("com.google.android.gms.instantapps.PackageManagerCompat").getMethod("isInstantApp", null).invoke(Class.forName("com.google.android.gms.instantapps.InstantApps").getMethod("getPackageManagerCompat", Context.class).invoke(null, context), null)).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: io.realm.exceptions.RealmError */
    private static void IAuthTabCallback(Context context, String str) throws RealmError, access22000 {
        if (TombstoneProtosLogMessageOrBuilder.IAuthTabCallback == null) {
            if (context == null) {
                throw new IllegalArgumentException("Non-null context required.");
            }
            onNavigationEvent(context);
            if (onExtraCallbackWithResult(context)) {
                throw new RealmError("Could not initialize Realm: Instant apps are not currently supported.");
            }
            RealmCore.onWarmupCompleted(context);
            onExtraCallbackWithResult(new RealmConfiguration.Builder(context).onWarmupCompleted());
            access22500.onExtraCallback();
            new Realm$.ExternalSyntheticLambda0();
            new Realm$.ExternalSyntheticLambda1();
            if (context.getApplicationContext() != null) {
                TombstoneProtosLogMessageOrBuilder.IAuthTabCallback = context.getApplicationContext();
            } else {
                TombstoneProtosLogMessageOrBuilder.IAuthTabCallback = context;
            }
            OsSharedRealm.initialize(new File(context.getFilesDir(), ".realm.temp"));
        }
    }

    public static /* synthetic */ Realm onExtraCallbackWithResult(RealmConfiguration realmConfiguration, OsSharedRealm.onWarmupCompleted onwarmupcompleted) {
        return (Realm) RealmCache.onWarmupCompleted(realmConfiguration, Realm.class, onwarmupcompleted);
    }

    private static void onNavigationEvent(Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir != null) {
            if (filesDir.exists()) {
                return;
            } else {
                try {
                    filesDir.mkdirs();
                } catch (SecurityException unused) {
                }
            }
        }
        if (filesDir == null || !filesDir.exists()) {
            long[] jArr = {1, 2, 5, 10, 16};
            long j = 0;
            int i = -1;
            do {
                if (context.getFilesDir() != null && context.getFilesDir().exists()) {
                    break;
                }
                i++;
                long j2 = jArr[Math.min(i, 4)];
                SystemClock.sleep(j2);
                j += j2;
            } while (j <= 200);
        }
        if (context.getFilesDir() == null || !context.getFilesDir().exists()) {
            throw new IllegalStateException("Context.getFilesDir() returns " + context.getFilesDir() + " which is not an existing directory. See https://issuetracker.google.com/issues/36918154");
        }
    }

    public static Realm onMessageChannelReady() {
        RealmConfiguration realmConfigurationOnActivityLayout = onActivityLayout();
        if (realmConfigurationOnActivityLayout == null) {
            if (TombstoneProtosLogMessageOrBuilder.IAuthTabCallback == null) {
                throw new IllegalStateException("Call `Realm.init(Context)` before calling this method.");
            }
            throw new IllegalStateException("Set default configuration by using `Realm.setDefaultConfiguration(RealmConfiguration)`.");
        }
        return (Realm) RealmCache.IAuthTabCallback(realmConfigurationOnActivityLayout, Realm.class);
    }

    public static Realm onNavigationEvent(RealmConfiguration realmConfiguration) {
        if (realmConfiguration == null) {
            throw new IllegalArgumentException("A non-null RealmConfiguration must be provided");
        }
        return (Realm) RealmCache.IAuthTabCallback(realmConfiguration, Realm.class);
    }

    public static void onExtraCallbackWithResult(RealmConfiguration realmConfiguration) {
        if (realmConfiguration == null) {
            throw new IllegalArgumentException("A non-null RealmConfiguration must be provided");
        }
        synchronized (IAuthTabCallbackStub) {
            asInterface = realmConfiguration;
        }
    }

    @Nullable
    public static RealmConfiguration onActivityLayout() {
        RealmConfiguration realmConfiguration;
        synchronized (IAuthTabCallbackStub) {
            realmConfiguration = asInterface;
        }
        return realmConfiguration;
    }

    public static void onActivityResized() {
        synchronized (IAuthTabCallbackStub) {
            asInterface = null;
        }
    }

    static Realm onExtraCallback(RealmCache realmCache, OsSharedRealm.onWarmupCompleted onwarmupcompleted) {
        return new Realm(realmCache, onwarmupcompleted);
    }

    public static Realm onExtraCallbackWithResult(OsSharedRealm osSharedRealm) {
        return new Realm(osSharedRealm);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <E extends RealmModel> E onExtraCallback(Class<E> cls, RealmModel realmModel, String str) {
        onTransact();
        Util.onExtraCallback(realmModel, "parentObject");
        Util.IAuthTabCallback(str, "parentProperty");
        if (!RealmObject.onWarmupCompleted(realmModel) || !RealmObject.onTransact(realmModel)) {
            throw new IllegalArgumentException("Only valid, managed objects can be a parent to an embedded object.");
        }
        return (E) this.onExtraCallbackWithResult.getInterfaceDescriptor().onExtraCallbackWithResult(cls, this, onExtraCallbackWithResult(this.IAuthTabCallback_Parcel.IAuthTabCallback((Class<? extends RealmModel>) cls).onExtraCallbackWithResult(), (RealmObjectProxy) realmModel, str, this.IAuthTabCallback_Parcel, this.IAuthTabCallback_Parcel.IAuthTabCallback((Class<? extends RealmModel>) realmModel.getClass())), this.IAuthTabCallback_Parcel.onExtraCallback((Class<? extends RealmModel>) cls), true, Collections.EMPTY_LIST);
    }

    public <E extends RealmModel> E onWarmupCompleted(E e, getBeginAddress... getbeginaddressArr) {
        onNavigationEvent((Realm) e);
        return (E) onExtraCallbackWithResult(e, false, new HashMap(), Util.onWarmupCompleted(getbeginaddressArr));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <E extends RealmModel> E IAuthTabCallback(E e, getBeginAddress... getbeginaddressArr) {
        onNavigationEvent((Realm) e);
        onExtraCallbackWithResult((Class<? extends RealmModel>) e.getClass());
        return (E) onExtraCallbackWithResult(e, true, new HashMap(), Util.onWarmupCompleted(getbeginaddressArr));
    }

    public <E extends RealmModel> List<E> onExtraCallbackWithResult(Iterable<E> iterable) {
        return onExtraCallback(iterable, IntCompanionObject.MAX_VALUE);
    }

    public <E extends RealmModel> List<E> onExtraCallback(Iterable<E> iterable, int i) {
        ArrayList arrayList;
        onNavigationEvent(i);
        if (iterable == null) {
            return new ArrayList(0);
        }
        if (iterable instanceof Collection) {
            arrayList = new ArrayList(((Collection) iterable).size());
        } else {
            arrayList = new ArrayList();
        }
        HashMap map = new HashMap();
        for (E e : iterable) {
            onWarmupCompleted((Realm) e);
            arrayList.add(onExtraCallbackWithResult(e, i, map));
        }
        return arrayList;
    }

    public <E extends RealmModel> E onExtraCallback(E e) {
        return (E) onExtraCallback((Realm) e, IntCompanionObject.MAX_VALUE);
    }

    public <E extends RealmModel> E onExtraCallback(E e, int i) {
        onNavigationEvent(i);
        onWarmupCompleted((Realm) e);
        return (E) onExtraCallbackWithResult(e, i, new HashMap());
    }

    public <E extends RealmModel> RealmQuery<E> onExtraCallback(Class<E> cls) {
        onTransact();
        return RealmQuery.onExtraCallback(this, cls);
    }

    public void onWarmupCompleted(RealmChangeListener<Realm> realmChangeListener) {
        onExtraCallback(realmChangeListener);
    }

    public void onExtraCallbackWithResult(RealmChangeListener<Realm> realmChangeListener) {
        IAuthTabCallback(realmChangeListener);
    }

    public void IAuthTabCallback(Transaction transaction) {
        if (transaction == null) {
            throw new IllegalArgumentException("Transaction should not be null");
        }
        onTransact();
        onExtraCallback();
        onWarmupCompleted();
        try {
            transaction.execute(this);
            asBinder();
        } catch (Throwable th) {
            if (extraCallback()) {
                onNavigationEvent();
            } else {
                RealmLog.onExtraCallbackWithResult("Could not cancel transaction, not currently in a transaction.", new Object[0]);
            }
            throw th;
        }
    }

    private <E extends RealmModel> E onExtraCallbackWithResult(E e, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<getBeginAddress> set) {
        onTransact();
        if (!extraCallback()) {
            throw new IllegalStateException("`copyOrUpdate` can only be called inside a write transaction.");
        }
        if (this.onExtraCallbackWithResult.getInterfaceDescriptor().onExtraCallbackWithResult(Util.onExtraCallbackWithResult(e.getClass()))) {
            throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
        }
        try {
            return (E) this.onExtraCallbackWithResult.getInterfaceDescriptor().onExtraCallbackWithResult(this, e, z, map, set);
        } catch (RuntimeException e2) {
            if (e2.getMessage().startsWith("Attempting to create an object of type")) {
                throw new RealmPrimaryKeyConstraintException(e2.getMessage());
            }
            throw e2;
        }
    }

    private <E extends RealmModel> E onExtraCallbackWithResult(E e, int i, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        onTransact();
        return (E) this.onExtraCallbackWithResult.getInterfaceDescriptor().onExtraCallbackWithResult(e, i, map);
    }

    private <E extends RealmModel> void onNavigationEvent(E e) {
        if (e == null) {
            throw new IllegalArgumentException("Null objects cannot be copied into Realm.");
        }
    }

    private void onExtraCallbackWithResult(Class<? extends RealmModel> cls) {
        if (onWarmupCompleted(cls)) {
            return;
        }
        throw new IllegalArgumentException("A RealmObject with no @PrimaryKey cannot be updated: " + cls.toString());
    }

    boolean onWarmupCompleted(Class<? extends RealmModel> cls) {
        return this.onExtraCallbackWithResult.getInterfaceDescriptor().IAuthTabCallbackDefault(cls);
    }

    private void onNavigationEvent(int i) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException("maxDepth must be > 0. It was: " + i);
    }

    private <E extends RealmModel> void onWarmupCompleted(E e) {
        if (e == null) {
            throw new IllegalArgumentException("Null objects cannot be copied from Realm.");
        }
        if (!RealmObject.onWarmupCompleted(e) || !RealmObject.onTransact(e)) {
            throw new IllegalArgumentException("Only valid managed objects can be copied from Realm.");
        }
        if (e instanceof DynamicRealmObject) {
            throw new IllegalArgumentException("DynamicRealmObject cannot be copied from Realm.");
        }
    }

    @Override // o.TombstoneProtosLogMessageOrBuilder
    /* renamed from: onMinimized, reason: merged with bridge method [inline-methods] */
    public Realm IAuthTabCallbackStubProxy() {
        return (Realm) RealmCache.onWarmupCompleted(this.onExtraCallbackWithResult, Realm.class, this.IAuthTabCallbackDefault.getVersionID());
    }

    public Table onNavigationEvent(Class<? extends RealmModel> cls) {
        return this.IAuthTabCallback_Parcel.onNavigationEvent(cls);
    }

    @Nullable
    public static Object onPostMessage() {
        try {
            Constructor<?> constructor = Class.forName("io.realm.DefaultRealmModule").getDeclaredConstructors()[0];
            constructor.setAccessible(true);
            return constructor.newInstance(null);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (IllegalAccessException e) {
            throw new RealmException("Could not create an instance of io.realm.DefaultRealmModule", e);
        } catch (InstantiationException e2) {
            throw new RealmException("Could not create an instance of io.realm.DefaultRealmModule", e2);
        } catch (InvocationTargetException e3) {
            throw new RealmException("Could not create an instance of io.realm.DefaultRealmModule", e3);
        }
    }

    /* renamed from: io.realm.Realm$2, reason: invalid class name */
    class AnonymousClass2 implements RealmCache.Callback {
        final /* synthetic */ AtomicInteger IAuthTabCallback;

        @Override // io.realm.RealmCache.Callback
        public void onWarmupCompleted(int i) {
            this.IAuthTabCallback.set(i);
        }
    }
}
