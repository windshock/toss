package io.realm.internal;

import io.realm.RealmConfiguration;
import io.realm.RealmFieldType;
import io.realm.exceptions.RealmError;
import io.realm.internal.OsRealmConfig;
import io.realm.internal.OsResults;
import io.realm.internal.android.AndroidRealmNotifier;
import java.io.Closeable;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.annotation.Nullable;
import o.TombstoneProtosMemoryErrorTypeTypeVerifier;
import o.access21700;
import o.access22000;
import o.access22100;
import o.access22400;
import o.access22500;
import o.access22900;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class OsSharedRealm implements Closeable, access22100 {
    public static final byte FILE_EXCEPTION_INCOMPATIBLE_SYNC_FILE = 7;
    public static final byte FILE_EXCEPTION_KIND_ACCESS_ERROR = 0;
    public static final byte FILE_EXCEPTION_KIND_BAD_HISTORY = 1;
    public static final byte FILE_EXCEPTION_KIND_EXISTS = 3;
    public static final byte FILE_EXCEPTION_KIND_FORMAT_UPGRADE_REQUIRED = 6;
    public static final byte FILE_EXCEPTION_KIND_INCOMPATIBLE_LOCK_FILE = 5;
    public static final byte FILE_EXCEPTION_KIND_NOT_FOUND = 4;
    public static final byte FILE_EXCEPTION_KIND_PERMISSION_DENIED = 2;
    private static final long nativeFinalizerPtr = nativeGetFinalizerPtr();
    private static final List<OsSharedRealm> sharedRealmsUnderConstruction = new CopyOnWriteArrayList();
    private static volatile File temporaryDirectory;
    public final TombstoneProtosMemoryErrorTypeTypeVerifier capabilities;
    public final access21700 context;
    final List<WeakReference<OsResults.onExtraCallbackWithResult>> iterators;
    private final long nativePtr;
    private final OsRealmConfig osRealmConfig;
    private final List<WeakReference<access22400>> pendingRows;
    public final RealmNotifier realmNotifier;
    private final OsSchemaInfo schemaInfo;
    private final List<OsSharedRealm> tempSharedRealmsForCallback;

    public interface InitializationCallback {
        void onInit(OsSharedRealm osSharedRealm);
    }

    public interface MigrationCallback {
        void onMigrationNeeded(OsSharedRealm osSharedRealm, long j, long j2);
    }

    public interface SchemaChangedCallback {
        void onSchemaChanged();
    }

    private static native void nativeBeginTransaction(long j);

    private static native void nativeCancelTransaction(long j);

    private static native void nativeCloseSharedRealm(long j);

    private static native void nativeCommitTransaction(long j);

    private static native boolean nativeCompact(long j);

    private static native long nativeCreateTable(long j, String str);

    private static native long nativeCreateTableWithPrimaryKeyField(long j, String str, String str2, int i, boolean z);

    private static native long nativeFreeze(long j);

    private static native long nativeGetActiveSubscriptionSet(long j);

    private static native long nativeGetFinalizerPtr();

    private static native long nativeGetLatestSubscriptionSet(long j);

    private static native long nativeGetSchemaInfo(long j);

    private static native long nativeGetSharedRealm(long j, long j2, long j3, RealmNotifier realmNotifier);

    private static native long nativeGetTableRef(long j, String str);

    private static native String[] nativeGetTablesName(long j);

    private static native long[] nativeGetVersionID(long j);

    private static native boolean nativeHasTable(long j, String str);

    private static native void nativeInit(String str);

    private static native boolean nativeIsAutoRefresh(long j);

    private static native boolean nativeIsClosed(long j);

    private static native boolean nativeIsEmpty(long j);

    private static native boolean nativeIsFrozen(long j);

    private static native boolean nativeIsInTransaction(long j);

    private static native long nativeNumberOfVersions(long j);

    private static native void nativeRefresh(long j);

    private static native void nativeRegisterSchemaChangedCallback(long j, SchemaChangedCallback schemaChangedCallback);

    private static native void nativeRenameTable(long j, String str, String str2);

    private static native void nativeSetAutoRefresh(long j, boolean z);

    private static native long nativeSize(long j);

    private static native void nativeStopWaitForChange(long j);

    private static native boolean nativeWaitForChange(long j);

    private static native void nativeWriteCopy(long j, String str, @Nullable byte[] bArr);

    public static class onWarmupCompleted implements Comparable<onWarmupCompleted> {
        public static final onWarmupCompleted IAuthTabCallback = new onWarmupCompleted(-1, -1);
        public final long onExtraCallbackWithResult;
        public final long onNavigationEvent;

        onWarmupCompleted(long j, long j2) {
            this.onExtraCallbackWithResult = j;
            this.onNavigationEvent = j2;
        }

        @Override // java.lang.Comparable
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public int compareTo(onWarmupCompleted onwarmupcompleted) {
            if (onwarmupcompleted == null) {
                throw new IllegalArgumentException("Version cannot be compared to a null value.");
            }
            long j = this.onExtraCallbackWithResult;
            long j2 = onwarmupcompleted.onExtraCallbackWithResult;
            if (j > j2) {
                return 1;
            }
            return j < j2 ? -1 : 0;
        }

        public String toString() {
            return "VersionID{version=" + this.onExtraCallbackWithResult + ", index=" + this.onNavigationEvent + '}';
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) obj;
            return this.onExtraCallbackWithResult == onwarmupcompleted.onExtraCallbackWithResult && this.onNavigationEvent == onwarmupcompleted.onNavigationEvent;
        }

        public int hashCode() {
            long j = this.onExtraCallbackWithResult;
            int i = (int) (j ^ (j >>> 32));
            long j2 = this.onNavigationEvent;
            return (i * 31) + ((int) ((j2 >>> 32) ^ j2));
        }
    }

    private OsSharedRealm(OsRealmConfig osRealmConfig, onWarmupCompleted onwarmupcompleted) {
        ArrayList arrayList = new ArrayList();
        this.tempSharedRealmsForCallback = arrayList;
        this.pendingRows = new CopyOnWriteArrayList();
        this.iterators = new ArrayList();
        access22900 access22900Var = new access22900();
        AndroidRealmNotifier androidRealmNotifier = new AndroidRealmNotifier(this, access22900Var);
        access21700 access21700VarIAuthTabCallback = osRealmConfig.IAuthTabCallback();
        this.context = access21700VarIAuthTabCallback;
        List<OsSharedRealm> list = sharedRealmsUnderConstruction;
        list.add(this);
        try {
            long jNativeGetSharedRealm = nativeGetSharedRealm(osRealmConfig.getNativePtr(), onwarmupcompleted.onExtraCallbackWithResult, onwarmupcompleted.onNavigationEvent, androidRealmNotifier);
            this.nativePtr = jNativeGetSharedRealm;
            arrayList.clear();
            list.remove(this);
            this.osRealmConfig = osRealmConfig;
            this.schemaInfo = new OsSchemaInfo(nativeGetSchemaInfo(jNativeGetSharedRealm), this);
            access21700VarIAuthTabCallback.onWarmupCompleted(this);
            this.capabilities = access22900Var;
            this.realmNotifier = androidRealmNotifier;
            if (onwarmupcompleted.equals(onWarmupCompleted.IAuthTabCallback)) {
                nativeSetAutoRefresh(jNativeGetSharedRealm, access22900Var.onExtraCallbackWithResult());
            }
        } catch (Throwable th) {
            try {
                for (OsSharedRealm osSharedRealm : this.tempSharedRealmsForCallback) {
                    if (!osSharedRealm.isClosed()) {
                        osSharedRealm.close();
                    }
                }
                throw th;
            } catch (Throwable th2) {
                this.tempSharedRealmsForCallback.clear();
                sharedRealmsUnderConstruction.remove(this);
                throw th2;
            }
        }
    }

    OsSharedRealm(long j, OsRealmConfig osRealmConfig) {
        this(j, osRealmConfig, osRealmConfig.IAuthTabCallback());
        for (OsSharedRealm osSharedRealm : sharedRealmsUnderConstruction) {
            if (osSharedRealm.context == osRealmConfig.IAuthTabCallback()) {
                osSharedRealm.tempSharedRealmsForCallback.add(this);
                return;
            }
        }
        throw new IllegalStateException("Cannot find the parent 'OsSharedRealm' which is under construction.");
    }

    OsSharedRealm(long j, OsRealmConfig osRealmConfig, access21700 access21700Var) {
        this.tempSharedRealmsForCallback = new ArrayList();
        this.pendingRows = new CopyOnWriteArrayList();
        this.iterators = new ArrayList();
        this.nativePtr = j;
        this.osRealmConfig = osRealmConfig;
        this.schemaInfo = new OsSchemaInfo(nativeGetSchemaInfo(j), this);
        this.context = access21700Var;
        access21700Var.onWarmupCompleted(this);
        this.capabilities = new access22900();
        this.realmNotifier = null;
        nativeSetAutoRefresh(j, false);
    }

    public static OsSharedRealm getInstance(RealmConfiguration realmConfiguration, onWarmupCompleted onwarmupcompleted) {
        return getInstance(new OsRealmConfig.onWarmupCompleted(realmConfiguration), onwarmupcompleted);
    }

    public static OsSharedRealm getInstance(OsRealmConfig.onWarmupCompleted onwarmupcompleted, onWarmupCompleted onwarmupcompleted2) {
        OsRealmConfig osRealmConfigOnExtraCallback = onwarmupcompleted.onExtraCallback();
        access22500.onExtraCallback();
        return new OsSharedRealm(osRealmConfigOnExtraCallback, onwarmupcompleted2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: o.access22000 */
    public static void initialize(File file) throws access22000 {
        if (temporaryDirectory != null) {
            return;
        }
        String absolutePath = file.getAbsolutePath();
        if (!file.isDirectory() && !file.mkdirs() && !file.isDirectory()) {
            throw new access22000("failed to create temporary directory: " + absolutePath);
        }
        if (!absolutePath.endsWith("/")) {
            absolutePath = absolutePath + "/";
        }
        nativeInit(absolutePath);
        temporaryDirectory = file;
    }

    public static File getTemporaryDirectory() {
        return temporaryDirectory;
    }

    public void beginTransaction() {
        detachIterators();
        executePendingRowQueries();
        nativeBeginTransaction(this.nativePtr);
    }

    public void commitTransaction() {
        nativeCommitTransaction(this.nativePtr);
    }

    public void cancelTransaction() {
        nativeCancelTransaction(this.nativePtr);
    }

    public boolean isInTransaction() {
        return nativeIsInTransaction(this.nativePtr);
    }

    public boolean hasTable(String str) {
        return nativeHasTable(this.nativePtr, str);
    }

    public Table getTable(String str) {
        return new Table(this, nativeGetTableRef(this.nativePtr, str));
    }

    public Table createTable(String str) {
        return new Table(this, nativeCreateTable(this.nativePtr, str));
    }

    public Table createTableWithPrimaryKey(String str, String str2, RealmFieldType realmFieldType, boolean z) {
        return new Table(this, nativeCreateTableWithPrimaryKeyField(this.nativePtr, str, str2, realmFieldType.getNativeValue(), z));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: io.realm.exceptions.RealmError */
    public void renameTable(String str, String str2) throws RealmError {
        try {
            nativeRenameTable(this.nativePtr, str, str2);
        } catch (IllegalArgumentException e) {
            throw new RealmError(e.getMessage());
        }
    }

    public String[] getTablesNames() {
        String[] strArrNativeGetTablesName = nativeGetTablesName(this.nativePtr);
        return strArrNativeGetTablesName != null ? strArrNativeGetTablesName : new String[0];
    }

    public long size() {
        return nativeSize(this.nativePtr);
    }

    public String getPath() {
        return this.osRealmConfig.onWarmupCompleted().asInterface();
    }

    public boolean isEmpty() {
        return nativeIsEmpty(this.nativePtr);
    }

    public void refresh() {
        if (isFrozen()) {
            throw new IllegalStateException("It is not possible to refresh frozen Realms.");
        }
        nativeRefresh(this.nativePtr);
    }

    public onWarmupCompleted getVersionID() {
        long[] jArrNativeGetVersionID = nativeGetVersionID(this.nativePtr);
        if (jArrNativeGetVersionID == null) {
            throw new IllegalStateException("Cannot get versionId, this could be related to a non existing read/write transaction");
        }
        return new onWarmupCompleted(jArrNativeGetVersionID[0], jArrNativeGetVersionID[1]);
    }

    public boolean isClosed() {
        return nativeIsClosed(this.nativePtr);
    }

    public void writeCopy(File file, @Nullable byte[] bArr) {
        if (file.isFile() && file.exists()) {
            throw new IllegalArgumentException("The destination file must not exist");
        }
        if (isSyncRealm()) {
            Util.onWarmupCompleted("writeCopyTo() cannot be called from the main thread when using synchronized Realms.");
        }
        try {
            nativeWriteCopy(this.nativePtr, file.getAbsolutePath(), bArr);
        } catch (RuntimeException e) {
            String message = e.getMessage();
            if (message.contains("Could not write file as not all client changes are integrated in server")) {
                throw new IllegalStateException(message);
            }
            throw e;
        }
    }

    public boolean compact() {
        return nativeCompact(this.nativePtr);
    }

    public void setAutoRefresh(boolean z) {
        this.capabilities.onNavigationEvent(null);
        nativeSetAutoRefresh(this.nativePtr, z);
    }

    public boolean waitForChange() {
        return nativeWaitForChange(this.nativePtr);
    }

    public void stopWaitForChange() {
        nativeStopWaitForChange(this.nativePtr);
    }

    public boolean isAutoRefresh() {
        return nativeIsAutoRefresh(this.nativePtr);
    }

    public RealmConfiguration getConfiguration() {
        return this.osRealmConfig.onWarmupCompleted();
    }

    public long getNumberOfVersions() {
        return nativeNumberOfVersions(this.nativePtr);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        RealmNotifier realmNotifier = this.realmNotifier;
        if (realmNotifier != null) {
            realmNotifier.close();
        }
        synchronized (this.context) {
            nativeCloseSharedRealm(this.nativePtr);
        }
    }

    @Override // o.access22100
    public long getNativePtr() {
        return this.nativePtr;
    }

    @Override // o.access22100
    public long getNativeFinalizerPtr() {
        return nativeFinalizerPtr;
    }

    public OsSchemaInfo getSchemaInfo() {
        return this.schemaInfo;
    }

    public void registerSchemaChangedCallback(SchemaChangedCallback schemaChangedCallback) {
        nativeRegisterSchemaChangedCallback(this.nativePtr, schemaChangedCallback);
    }

    public boolean isSyncRealm() {
        return this.osRealmConfig.onExtraCallback() != null;
    }

    public boolean isFrozen() {
        return nativeIsFrozen(this.nativePtr);
    }

    public OsSharedRealm freeze() {
        return new OsSharedRealm(this.osRealmConfig, getVersionID());
    }

    void addIterator(OsResults.onExtraCallbackWithResult onextracallbackwithresult) {
        this.iterators.add(new WeakReference<>(onextracallbackwithresult));
    }

    private void detachIterators() {
        Iterator<WeakReference<OsResults.onExtraCallbackWithResult>> it = this.iterators.iterator();
        while (it.hasNext()) {
            OsResults.onExtraCallbackWithResult onextracallbackwithresult = it.next().get();
            if (onextracallbackwithresult != null) {
                onextracallbackwithresult.onExtraCallbackWithResult();
            }
        }
        this.iterators.clear();
    }

    void invalidateIterators() {
        Iterator<WeakReference<OsResults.onExtraCallbackWithResult>> it = this.iterators.iterator();
        while (it.hasNext()) {
            OsResults.onExtraCallbackWithResult onextracallbackwithresult = it.next().get();
            if (onextracallbackwithresult != null) {
                onextracallbackwithresult.onWarmupCompleted();
            }
        }
        this.iterators.clear();
    }

    void addPendingRow(access22400 access22400Var) {
        this.pendingRows.add(new WeakReference<>(access22400Var));
    }

    public void removePendingRow(access22400 access22400Var) {
        for (WeakReference<access22400> weakReference : this.pendingRows) {
            access22400 access22400Var2 = weakReference.get();
            if (access22400Var2 == null || access22400Var2 == access22400Var) {
                this.pendingRows.remove(weakReference);
            }
        }
    }

    private void executePendingRowQueries() {
        Iterator<WeakReference<access22400>> it = this.pendingRows.iterator();
        while (it.hasNext()) {
            access22400 access22400Var = it.next().get();
            if (access22400Var != null) {
                access22400Var.onNavigationEvent();
            }
        }
        this.pendingRows.clear();
    }

    private static void runMigrationCallback(long j, OsRealmConfig osRealmConfig, MigrationCallback migrationCallback, long j2) {
        migrationCallback.onMigrationNeeded(new OsSharedRealm(j, osRealmConfig), j2, osRealmConfig.onWarmupCompleted().access100());
    }

    private static void runInitializationCallback(long j, OsRealmConfig osRealmConfig, InitializationCallback initializationCallback) {
        initializationCallback.onInit(new OsSharedRealm(j, osRealmConfig));
    }
}
