package o;

import android.content.Context;
import io.realm.DynamicRealmObject;
import io.realm.Realm;
import io.realm.RealmCache;
import io.realm.RealmChangeListener;
import io.realm.RealmConfiguration;
import io.realm.RealmFieldType;
import io.realm.RealmMigration;
import io.realm.RealmModel;
import io.realm.RealmObjectSchema;
import io.realm.RealmSchema;
import io.realm.exceptions.RealmException;
import io.realm.internal.CheckedRow;
import io.realm.internal.OsObjectStore;
import io.realm.internal.OsRealmConfig;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.OsSharedRealm;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.UncheckedRow;
import io.realm.internal.async.RealmThreadPoolExecutor;
import io.realm.log.RealmLog;
import java.io.Closeable;
import java.io.File;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class TombstoneProtosLogMessageOrBuilder implements Closeable {
    public static volatile Context IAuthTabCallback;
    public OsSharedRealm IAuthTabCallbackDefault;
    private OsSharedRealm.SchemaChangedCallback IAuthTabCallbackStub;
    private boolean access100;
    final boolean asBinder;
    private RealmCache asInterface;
    public final RealmConfiguration onExtraCallbackWithResult;
    public final long onTransact;
    static final RealmThreadPoolExecutor onWarmupCompleted = RealmThreadPoolExecutor.IAuthTabCallback();
    public static final RealmThreadPoolExecutor onNavigationEvent = RealmThreadPoolExecutor.onNavigationEvent();
    public static final onWarmupCompleted onExtraCallback = new onWarmupCompleted();

    public abstract TombstoneProtosLogMessageOrBuilder IAuthTabCallbackStubProxy();

    public abstract RealmSchema access000();

    public TombstoneProtosLogMessageOrBuilder(RealmCache realmCache, @Nullable OsSchemaInfo osSchemaInfo, OsSharedRealm.onWarmupCompleted onwarmupcompleted) {
        this(realmCache.onNavigationEvent(), osSchemaInfo, onwarmupcompleted);
        this.asInterface = realmCache;
    }

    TombstoneProtosLogMessageOrBuilder(RealmConfiguration realmConfiguration, @Nullable OsSchemaInfo osSchemaInfo, OsSharedRealm.onWarmupCompleted onwarmupcompleted) {
        this.IAuthTabCallbackStub = new OsSharedRealm.SchemaChangedCallback() { // from class: o.TombstoneProtosLogMessageOrBuilder.4
            @Override // io.realm.internal.OsSharedRealm.SchemaChangedCallback
            public void onSchemaChanged() {
                RealmSchema realmSchemaAccess000 = TombstoneProtosLogMessageOrBuilder.this.access000();
                if (realmSchemaAccess000 != null) {
                    realmSchemaAccess000.onNavigationEvent();
                }
                if (TombstoneProtosLogMessageOrBuilder.this instanceof Realm) {
                    realmSchemaAccess000.onExtraCallback();
                }
            }
        };
        this.onTransact = Thread.currentThread().getId();
        this.onExtraCallbackWithResult = realmConfiguration;
        this.asInterface = null;
        OsSharedRealm.MigrationCallback migrationCallbackOnExtraCallbackWithResult = (osSchemaInfo == null || realmConfiguration.IAuthTabCallbackStub() == null) ? null : onExtraCallbackWithResult(realmConfiguration.IAuthTabCallbackStub());
        final Realm.Transaction transactionIAuthTabCallbackDefault = realmConfiguration.IAuthTabCallbackDefault();
        OsSharedRealm osSharedRealm = OsSharedRealm.getInstance(new OsRealmConfig.onWarmupCompleted(realmConfiguration).onExtraCallback(new File(IAuthTabCallback.getFilesDir(), ".realm.temp")).onExtraCallback(true).onExtraCallbackWithResult(migrationCallbackOnExtraCallbackWithResult).onNavigationEvent(osSchemaInfo).onWarmupCompleted(transactionIAuthTabCallbackDefault != null ? new OsSharedRealm.InitializationCallback() { // from class: o.TombstoneProtosLogMessageOrBuilder.5
            @Override // io.realm.internal.OsSharedRealm.InitializationCallback
            public void onInit(OsSharedRealm osSharedRealm2) {
                transactionIAuthTabCallbackDefault.execute(Realm.onExtraCallbackWithResult(osSharedRealm2));
            }
        } : null), onwarmupcompleted);
        this.IAuthTabCallbackDefault = osSharedRealm;
        this.asBinder = osSharedRealm.isFrozen();
        this.access100 = true;
        this.IAuthTabCallbackDefault.registerSchemaChangedCallback(this.IAuthTabCallbackStub);
    }

    public TombstoneProtosLogMessageOrBuilder(OsSharedRealm osSharedRealm) {
        this.IAuthTabCallbackStub = new OsSharedRealm.SchemaChangedCallback() { // from class: o.TombstoneProtosLogMessageOrBuilder.4
            @Override // io.realm.internal.OsSharedRealm.SchemaChangedCallback
            public void onSchemaChanged() {
                RealmSchema realmSchemaAccess000 = TombstoneProtosLogMessageOrBuilder.this.access000();
                if (realmSchemaAccess000 != null) {
                    realmSchemaAccess000.onNavigationEvent();
                }
                if (TombstoneProtosLogMessageOrBuilder.this instanceof Realm) {
                    realmSchemaAccess000.onExtraCallback();
                }
            }
        };
        this.onTransact = Thread.currentThread().getId();
        this.onExtraCallbackWithResult = osSharedRealm.getConfiguration();
        this.asInterface = null;
        this.IAuthTabCallbackDefault = osSharedRealm;
        this.asBinder = osSharedRealm.isFrozen();
        this.access100 = false;
    }

    public void writeTypedObject() {
        onTransact();
        IAuthTabCallback();
        if (extraCallback()) {
            throw new IllegalStateException("Cannot refresh a Realm instance inside a transaction.");
        }
        this.IAuthTabCallbackDefault.refresh();
    }

    public boolean extraCallback() {
        onTransact();
        return this.IAuthTabCallbackDefault.isInTransaction();
    }

    public <T extends TombstoneProtosLogMessageOrBuilder> void onExtraCallback(RealmChangeListener<T> realmChangeListener) {
        if (realmChangeListener == null) {
            throw new IllegalArgumentException("Listener should not be null");
        }
        onTransact();
        this.IAuthTabCallbackDefault.capabilities.onNavigationEvent("Listeners cannot be used on current thread.");
        if (this.asBinder) {
            throw new IllegalStateException("It is not possible to add a change listener to a frozen Realm since it never changes.");
        }
        this.IAuthTabCallbackDefault.realmNotifier.addChangeListener(this, realmChangeListener);
    }

    public <T extends TombstoneProtosLogMessageOrBuilder> void IAuthTabCallback(RealmChangeListener<T> realmChangeListener) {
        if (realmChangeListener == null) {
            throw new IllegalArgumentException("Listener should not be null");
        }
        if (extraCallbackWithResult()) {
            RealmLog.onExtraCallbackWithResult("Calling removeChangeListener on a closed Realm %s, make sure to close all listeners before closing the Realm.", this.onExtraCallbackWithResult.asInterface());
        }
        this.IAuthTabCallbackDefault.realmNotifier.removeChangeListener(this, realmChangeListener);
    }

    public void onWarmupCompleted() {
        onTransact();
        this.IAuthTabCallbackDefault.beginTransaction();
    }

    public void asBinder() {
        onTransact();
        this.IAuthTabCallbackDefault.commitTransaction();
    }

    public void onNavigationEvent() {
        onTransact();
        this.IAuthTabCallbackDefault.cancelTransaction();
    }

    public boolean readTypedObject() {
        OsSharedRealm osSharedRealm = this.IAuthTabCallbackDefault;
        if (osSharedRealm == null || osSharedRealm.isClosed()) {
            throw new IllegalStateException("This Realm instance has already been closed, making it unusable.");
        }
        return this.asBinder;
    }

    public void onTransact() {
        OsSharedRealm osSharedRealm = this.IAuthTabCallbackDefault;
        if (osSharedRealm == null || osSharedRealm.isClosed()) {
            throw new IllegalStateException("This Realm instance has already been closed, making it unusable.");
        }
        if (!this.asBinder && this.onTransact != Thread.currentThread().getId()) {
            throw new IllegalStateException("Realm access from incorrect thread. Realm objects can only be accessed on the thread they were created.");
        }
    }

    public void IAuthTabCallback() {
        if (getInterfaceDescriptor().capabilities.onExtraCallback() && !access100().ICustomTabsCallback()) {
            throw new RealmException("Queries on the UI thread have been disabled. They can be enabled by setting 'RealmConfiguration.Builder.allowQueriesOnUiThread(true)'.");
        }
    }

    public void onExtraCallback() {
        if (getInterfaceDescriptor().capabilities.onExtraCallback() && !access100().extraCallback()) {
            throw new RealmException("Running transactions on the UI thread has been disabled. It can be enabled by setting 'RealmConfiguration.Builder.allowWritesOnUiThread(true)'.");
        }
    }

    protected void onExtraCallbackWithResult() {
        if (!this.IAuthTabCallbackDefault.isInTransaction()) {
            throw new IllegalStateException("Changing Realm data can only be done from inside a transaction.");
        }
    }

    public Row onExtraCallbackWithResult(String str, RealmObjectProxy realmObjectProxy, String str2, RealmSchema realmSchema, RealmObjectSchema realmObjectSchema) {
        long jIAuthTabCallbackDefault = realmObjectSchema.IAuthTabCallbackDefault(str2);
        RealmFieldType realmFieldTypeOnTransact = realmObjectSchema.onTransact(str2);
        Row rowIAuthTabCallback = realmObjectProxy.cb_().IAuthTabCallback();
        if (!realmObjectSchema.onWarmupCompleted(realmObjectSchema.onTransact(str2))) {
            throw new IllegalArgumentException(String.format("Field '%s' does not contain a valid link", str2));
        }
        String strOnWarmupCompleted = realmObjectSchema.onWarmupCompleted(str2);
        if (strOnWarmupCompleted.equals(str)) {
            return realmSchema.IAuthTabCallbackDefault(str).onExtraCallback(rowIAuthTabCallback.createEmbeddedObject(jIAuthTabCallbackDefault, realmFieldTypeOnTransact));
        }
        throw new IllegalArgumentException(String.format("Parent type %s expects that property '%s' be of type %s but was %s.", realmObjectSchema.onExtraCallbackWithResult(), str2, strOnWarmupCompleted, str));
    }

    void IAuthTabCallbackDefault() {
        if (this.onExtraCallbackWithResult.readTypedObject()) {
            throw new UnsupportedOperationException("You cannot perform destructive changes to a schema of a synced Realm");
        }
    }

    public String IAuthTabCallback_Parcel() {
        return this.onExtraCallbackWithResult.asInterface();
    }

    public RealmConfiguration access100() {
        return this.onExtraCallbackWithResult;
    }

    public long ICustomTabsCallback() {
        return OsObjectStore.IAuthTabCallback(this.IAuthTabCallbackDefault);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.asBinder && this.onTransact != Thread.currentThread().getId()) {
            throw new IllegalStateException("Realm access from incorrect thread. Realm instance can only be closed on the thread it was created.");
        }
        RealmCache realmCache = this.asInterface;
        if (realmCache != null) {
            realmCache.onNavigationEvent(this);
        } else {
            IAuthTabCallbackStub();
        }
    }

    public void IAuthTabCallbackStub() {
        this.asInterface = null;
        OsSharedRealm osSharedRealm = this.IAuthTabCallbackDefault;
        if (osSharedRealm == null || !this.access100) {
            return;
        }
        osSharedRealm.close();
        this.IAuthTabCallbackDefault = null;
    }

    public boolean extraCallbackWithResult() {
        if (!this.asBinder && this.onTransact != Thread.currentThread().getId()) {
            throw new IllegalStateException("Realm access from incorrect thread. Realm objects can only be accessed on the thread they were created.");
        }
        OsSharedRealm osSharedRealm = this.IAuthTabCallbackDefault;
        return osSharedRealm == null || osSharedRealm.isClosed();
    }

    public <E extends RealmModel> E onExtraCallback(@Nullable Class<E> cls, @Nullable String str, UncheckedRow uncheckedRow) {
        if (str != null) {
            return new DynamicRealmObject(this, CheckedRow.onWarmupCompleted(uncheckedRow));
        }
        return (E) this.onExtraCallbackWithResult.getInterfaceDescriptor().onExtraCallbackWithResult(cls, this, uncheckedRow, access000().onExtraCallback((Class<? extends RealmModel>) cls), false, Collections.EMPTY_LIST);
    }

    public <E extends RealmModel> E IAuthTabCallback(Class<E> cls, long j, boolean z, List<String> list) {
        return (E) this.onExtraCallbackWithResult.getInterfaceDescriptor().onExtraCallbackWithResult(cls, this, access000().onNavigationEvent((Class<? extends RealmModel>) cls).IAuthTabCallbackStub(j), access000().onExtraCallback((Class<? extends RealmModel>) cls), z, list);
    }

    public <E extends RealmModel> E onWarmupCompleted(@Nullable Class<E> cls, @Nullable String str, long j) {
        boolean z = str != null;
        Table tableIAuthTabCallbackDefault = z ? access000().IAuthTabCallbackDefault(str) : access000().onNavigationEvent((Class<? extends RealmModel>) cls);
        if (z) {
            return new DynamicRealmObject(this, j != -1 ? tableIAuthTabCallbackDefault.onExtraCallback(j) : access21900.INSTANCE);
        }
        return (E) this.onExtraCallbackWithResult.getInterfaceDescriptor().onExtraCallbackWithResult(cls, this, j != -1 ? tableIAuthTabCallbackDefault.IAuthTabCallbackStub(j) : access21900.INSTANCE, access000().onExtraCallback((Class<? extends RealmModel>) cls), false, Collections.EMPTY_LIST);
    }

    public void asInterface() {
        onTransact();
        Iterator<RealmObjectSchema> it = access000().IAuthTabCallback().iterator();
        while (it.hasNext()) {
            access000().IAuthTabCallbackDefault(it.next().onExtraCallbackWithResult()).onExtraCallback();
        }
    }

    private static OsSharedRealm.MigrationCallback onExtraCallbackWithResult(final RealmMigration realmMigration) {
        return new OsSharedRealm.MigrationCallback() { // from class: o.TombstoneProtosLogMessageOrBuilder.1
            @Override // io.realm.internal.OsSharedRealm.MigrationCallback
            public void onMigrationNeeded(OsSharedRealm osSharedRealm, long j, long j2) {
                realmMigration.onExtraCallbackWithResult(access21400.onExtraCallback(osSharedRealm), j, j2);
            }
        };
    }

    protected void finalize() throws Throwable {
        OsSharedRealm osSharedRealm;
        if (this.access100 && (osSharedRealm = this.IAuthTabCallbackDefault) != null && !osSharedRealm.isClosed()) {
            RealmLog.onExtraCallbackWithResult("Remember to call close() on all Realm instances. Realm %s is being finalized without being closed, this can lead to running out of native memory.", this.onExtraCallbackWithResult.asInterface());
            RealmCache realmCache = this.asInterface;
            if (realmCache != null) {
                realmCache.IAuthTabCallback();
            }
        }
        super.finalize();
    }

    public OsSharedRealm getInterfaceDescriptor() {
        return this.IAuthTabCallbackDefault;
    }

    static final class onWarmupCompleted extends ThreadLocal<IAuthTabCallback> {
        onWarmupCompleted() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public IAuthTabCallback initialValue() {
            return new IAuthTabCallback();
        }
    }
}
