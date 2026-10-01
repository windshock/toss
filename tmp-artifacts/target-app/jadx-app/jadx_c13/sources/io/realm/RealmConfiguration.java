package io.realm;

import android.content.Context;
import io.realm.Realm;
import io.realm.annotations.RealmModule;
import io.realm.coroutines.RealmFlowFactory;
import io.realm.exceptions.RealmException;
import io.realm.internal.OsRealmConfig;
import io.realm.internal.RealmCore;
import io.realm.internal.RealmProxyMediator;
import io.realm.internal.Util;
import io.realm.rx.RealmObservableFactory;
import io.realm.rx.RxObservableFactory;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import javax.annotation.Nullable;
import kotlin.jvm.internal.LongCompanionObject;
import o.TombstoneProtosLogMessageOrBuilder;
import o.access22800;
import o.access23000;
import o.setTool;
import okhttp3.internal.url._UrlKt;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class RealmConfiguration {
    protected static final RealmProxyMediator onNavigationEvent;
    private static final Object onWarmupCompleted;
    private final boolean IAuthTabCallback;
    private final boolean IAuthTabCallbackDefault;
    private final OsRealmConfig.onExtraCallback IAuthTabCallbackStub;
    private final Realm.Transaction IAuthTabCallbackStubProxy;
    private final byte[] IAuthTabCallback_Parcel;
    private final RealmProxyMediator ICustomTabsCallback;
    private final RealmMigration access000;
    private final long access100;
    private final CompactOnLaunchCallback asBinder;
    private final String asInterface;
    private final RxObservableFactory extraCallback;
    private final File extraCallbackWithResult;
    private final boolean getInterfaceDescriptor;
    private final boolean onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final long onMinimized;
    private final setTool onTransact;
    private final boolean readTypedObject;
    private final String writeTypedObject;

    public boolean readTypedObject() {
        return false;
    }

    static {
        Object objOnPostMessage = Realm.onPostMessage();
        onWarmupCompleted = objOnPostMessage;
        if (objOnPostMessage != null) {
            RealmProxyMediator realmProxyMediatorOnWarmupCompleted = onWarmupCompleted(objOnPostMessage.getClass().getCanonicalName());
            if (!realmProxyMediatorOnWarmupCompleted.onWarmupCompleted()) {
                throw new ExceptionInInitializerError("RealmTransformer doesn't seem to be applied. Please update the project configuration to use the Realm Gradle plugin. See https://docs.mongodb.com/realm/sdk/android/install/#customize-dependecies-defined-by-the-realm-gradle-plugin");
            }
            onNavigationEvent = realmProxyMediatorOnWarmupCompleted;
            return;
        }
        onNavigationEvent = null;
    }

    protected RealmConfiguration(File file, @Nullable String str, @Nullable byte[] bArr, long j, @Nullable RealmMigration realmMigration, boolean z, OsRealmConfig.onExtraCallback onextracallback, RealmProxyMediator realmProxyMediator, @Nullable RxObservableFactory rxObservableFactory, @Nullable setTool settool, @Nullable Realm.Transaction transaction, boolean z2, @Nullable CompactOnLaunchCallback compactOnLaunchCallback, boolean z3, long j2, boolean z4, boolean z5) {
        this.extraCallbackWithResult = file.getParentFile();
        this.writeTypedObject = file.getName();
        this.asInterface = file.getAbsolutePath();
        this.onExtraCallbackWithResult = str;
        this.IAuthTabCallback_Parcel = bArr;
        this.onMinimized = j;
        this.access000 = realmMigration;
        this.IAuthTabCallbackDefault = z;
        this.IAuthTabCallbackStub = onextracallback;
        this.ICustomTabsCallback = realmProxyMediator;
        this.extraCallback = rxObservableFactory;
        this.onTransact = settool;
        this.IAuthTabCallbackStubProxy = transaction;
        this.readTypedObject = z2;
        this.asBinder = compactOnLaunchCallback;
        this.getInterfaceDescriptor = z3;
        this.access100 = j2;
        this.onExtraCallback = z4;
        this.IAuthTabCallback = z5;
    }

    public File asBinder() {
        return this.extraCallbackWithResult;
    }

    public String IAuthTabCallback_Parcel() {
        return this.writeTypedObject;
    }

    public byte[] IAuthTabCallback() {
        byte[] bArr = this.IAuthTabCallback_Parcel;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public long access100() {
        return this.onMinimized;
    }

    public RealmMigration IAuthTabCallbackStub() {
        return this.access000;
    }

    public boolean onMessageChannelReady() {
        return this.IAuthTabCallbackDefault;
    }

    public OsRealmConfig.onExtraCallback onExtraCallbackWithResult() {
        return this.IAuthTabCallbackStub;
    }

    public RealmProxyMediator getInterfaceDescriptor() {
        return this.ICustomTabsCallback;
    }

    public Realm.Transaction IAuthTabCallbackDefault() {
        return this.IAuthTabCallbackStubProxy;
    }

    public boolean access000() {
        return !Util.onNavigationEvent(this.onExtraCallbackWithResult);
    }

    @Nullable
    public String onExtraCallback() {
        return this.onExtraCallbackWithResult;
    }

    public CompactOnLaunchCallback onWarmupCompleted() {
        return this.asBinder;
    }

    public String asInterface() {
        return this.asInterface;
    }

    protected boolean onMinimized() {
        return new File(this.asInterface).exists();
    }

    public RxObservableFactory IAuthTabCallbackStubProxy() {
        RxObservableFactory rxObservableFactory = this.extraCallback;
        if (rxObservableFactory != null) {
            return rxObservableFactory;
        }
        throw new UnsupportedOperationException("RxJava seems to be missing from the classpath. Remember to add it as an implementation dependency. See https://github.com/realm/realm-java/tree/master/examples/rxJavaExample for more details.");
    }

    public boolean extraCallbackWithResult() {
        return this.readTypedObject;
    }

    public boolean writeTypedObject() {
        return this.getInterfaceDescriptor;
    }

    public long onTransact() {
        return this.access100;
    }

    public boolean extraCallback() {
        return this.onExtraCallback;
    }

    public boolean ICustomTabsCallback() {
        return this.IAuthTabCallback;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            RealmConfiguration realmConfiguration = (RealmConfiguration) obj;
            if (this.onMinimized != realmConfiguration.onMinimized || this.IAuthTabCallbackDefault != realmConfiguration.IAuthTabCallbackDefault || this.readTypedObject != realmConfiguration.readTypedObject || this.getInterfaceDescriptor != realmConfiguration.getInterfaceDescriptor) {
                return false;
            }
            File file = this.extraCallbackWithResult;
            if (file == null ? realmConfiguration.extraCallbackWithResult != null : !file.equals(realmConfiguration.extraCallbackWithResult)) {
                return false;
            }
            String str = this.writeTypedObject;
            if (str == null ? realmConfiguration.writeTypedObject != null : !str.equals(realmConfiguration.writeTypedObject)) {
                return false;
            }
            if (!this.asInterface.equals(realmConfiguration.asInterface)) {
                return false;
            }
            String str2 = this.onExtraCallbackWithResult;
            if (str2 == null ? realmConfiguration.onExtraCallbackWithResult != null : !str2.equals(realmConfiguration.onExtraCallbackWithResult)) {
                return false;
            }
            if (!Arrays.equals(this.IAuthTabCallback_Parcel, realmConfiguration.IAuthTabCallback_Parcel)) {
                return false;
            }
            RealmMigration realmMigration = this.access000;
            if (realmMigration == null ? realmConfiguration.access000 != null : !realmMigration.equals(realmConfiguration.access000)) {
                return false;
            }
            if (this.IAuthTabCallbackStub != realmConfiguration.IAuthTabCallbackStub || !this.ICustomTabsCallback.equals(realmConfiguration.ICustomTabsCallback)) {
                return false;
            }
            RxObservableFactory rxObservableFactory = this.extraCallback;
            if (rxObservableFactory == null ? realmConfiguration.extraCallback != null : !rxObservableFactory.equals(realmConfiguration.extraCallback)) {
                return false;
            }
            Realm.Transaction transaction = this.IAuthTabCallbackStubProxy;
            if (transaction == null ? realmConfiguration.IAuthTabCallbackStubProxy != null : !transaction.equals(realmConfiguration.IAuthTabCallbackStubProxy)) {
                return false;
            }
            CompactOnLaunchCallback compactOnLaunchCallback = this.asBinder;
            if (compactOnLaunchCallback == null ? realmConfiguration.asBinder != null : !compactOnLaunchCallback.equals(realmConfiguration.asBinder)) {
                return false;
            }
            if (this.access100 == realmConfiguration.access100) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        File file = this.extraCallbackWithResult;
        int iHashCode = file != null ? file.hashCode() : 0;
        String str = this.writeTypedObject;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        int iHashCode3 = this.asInterface.hashCode();
        String str2 = this.onExtraCallbackWithResult;
        int iHashCode4 = str2 != null ? str2.hashCode() : 0;
        int iHashCode5 = Arrays.hashCode(this.IAuthTabCallback_Parcel);
        long j = this.onMinimized;
        int i = (int) (j ^ (j >>> 32));
        RealmMigration realmMigration = this.access000;
        int iHashCode6 = realmMigration != null ? realmMigration.hashCode() : 0;
        boolean z = this.IAuthTabCallbackDefault;
        int iHashCode7 = this.IAuthTabCallbackStub.hashCode();
        int iHashCode8 = this.ICustomTabsCallback.hashCode();
        RxObservableFactory rxObservableFactory = this.extraCallback;
        int iHashCode9 = rxObservableFactory != null ? rxObservableFactory.hashCode() : 0;
        Realm.Transaction transaction = this.IAuthTabCallbackStubProxy;
        int iHashCode10 = transaction != null ? transaction.hashCode() : 0;
        boolean z2 = this.readTypedObject;
        CompactOnLaunchCallback compactOnLaunchCallback = this.asBinder;
        int iHashCode11 = compactOnLaunchCallback != null ? compactOnLaunchCallback.hashCode() : 0;
        boolean z3 = this.getInterfaceDescriptor;
        int i2 = iHashCode10;
        long j2 = this.access100;
        return (((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + i) * 31) + iHashCode6) * 31) + (z ? 1 : 0)) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + i2) * 31) + (z2 ? 1 : 0)) * 31) + iHashCode11) * 31) + (z3 ? 1 : 0)) * 31) + ((int) ((j2 >>> 32) ^ j2));
    }

    protected static RealmProxyMediator onWarmupCompleted(Set<Object> set, Set<Class<? extends RealmModel>> set2, boolean z) {
        if (set2.size() > 0) {
            return new access22800(onNavigationEvent, set2, z);
        }
        if (set.size() == 1) {
            return onWarmupCompleted(set.iterator().next().getClass().getCanonicalName());
        }
        RealmProxyMediator[] realmProxyMediatorArr = new RealmProxyMediator[set.size()];
        Iterator<Object> it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            realmProxyMediatorArr[i] = onWarmupCompleted(it.next().getClass().getCanonicalName());
            i++;
        }
        return new access23000(realmProxyMediatorArr);
    }

    private static RealmProxyMediator onWarmupCompleted(String str) throws SecurityException {
        String[] strArrSplit = str.split("\\.");
        String str2 = String.format(Locale.US, "io.realm.%s%s", strArrSplit[strArrSplit.length - 1], "Mediator");
        try {
            Constructor<?> constructor = Class.forName(str2).getDeclaredConstructors()[0];
            constructor.setAccessible(true);
            return (RealmProxyMediator) constructor.newInstance(null);
        } catch (ClassNotFoundException e) {
            throw new RealmException("Could not find " + str2, e);
        } catch (IllegalAccessException e2) {
            throw new RealmException("Could not create an instance of " + str2, e2);
        } catch (InstantiationException e3) {
            throw new RealmException("Could not create an instance of " + str2, e3);
        } catch (InvocationTargetException e4) {
            throw new RealmException("Could not create an instance of " + str2, e4);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("realmDirectory: ");
        File file = this.extraCallbackWithResult;
        sb.append(file != null ? file.toString() : _UrlKt.FRAGMENT_ENCODE_SET);
        sb.append("\n");
        sb.append("realmFileName : ");
        sb.append(this.writeTypedObject);
        sb.append("\n");
        sb.append("canonicalPath: ");
        sb.append(this.asInterface);
        sb.append("\n");
        sb.append("key: ");
        sb.append("[length: ");
        sb.append(this.IAuthTabCallback_Parcel == null ? 0 : 64);
        sb.append("]");
        sb.append("\n");
        sb.append("schemaVersion: ");
        sb.append(Long.toString(this.onMinimized));
        sb.append("\n");
        sb.append("migration: ");
        sb.append(this.access000);
        sb.append("\n");
        sb.append("deleteRealmIfMigrationNeeded: ");
        sb.append(this.IAuthTabCallbackDefault);
        sb.append("\n");
        sb.append("durability: ");
        sb.append(this.IAuthTabCallbackStub);
        sb.append("\n");
        sb.append("schemaMediator: ");
        sb.append(this.ICustomTabsCallback);
        sb.append("\n");
        sb.append("readOnly: ");
        sb.append(this.readTypedObject);
        sb.append("\n");
        sb.append("compactOnLaunch: ");
        sb.append(this.asBinder);
        sb.append("\n");
        sb.append("maxNumberOfActiveVersions: ");
        sb.append(this.access100);
        return sb.toString();
    }

    public static class Builder {
        private HashSet<Class<? extends RealmModel>> IAuthTabCallback;
        private boolean IAuthTabCallbackDefault;
        private boolean IAuthTabCallbackStub;
        private long IAuthTabCallbackStubProxy;

        @Nullable
        private setTool IAuthTabCallback_Parcel;
        private boolean ICustomTabsCallback;
        private Realm.Transaction access000;
        private byte[] access100;
        private String asBinder;
        private File asInterface;

        @Nullable
        private RxObservableFactory extraCallbackWithResult;
        private RealmMigration getInterfaceDescriptor;
        private CompactOnLaunchCallback onExtraCallback;
        private boolean onExtraCallbackWithResult;
        private boolean onNavigationEvent;
        private OsRealmConfig.onExtraCallback onTransact;
        private String onWarmupCompleted;
        private HashSet<Object> readTypedObject;
        private long writeTypedObject;

        public Builder() {
            this(TombstoneProtosLogMessageOrBuilder.IAuthTabCallback);
        }

        Builder(Context context) {
            this.readTypedObject = new HashSet<>();
            this.IAuthTabCallback = new HashSet<>();
            this.IAuthTabCallbackStub = false;
            this.IAuthTabCallbackStubProxy = LongCompanionObject.MAX_VALUE;
            if (context == null) {
                throw new IllegalStateException("Call `Realm.init(Context)` before creating a RealmConfiguration");
            }
            RealmCore.onWarmupCompleted(context);
            onExtraCallbackWithResult(context);
        }

        private void onExtraCallbackWithResult(Context context) {
            this.asInterface = context.getFilesDir();
            this.asBinder = "default.realm";
            this.access100 = null;
            this.writeTypedObject = 0L;
            this.getInterfaceDescriptor = null;
            this.IAuthTabCallbackDefault = false;
            this.onTransact = OsRealmConfig.onExtraCallback.FULL;
            this.ICustomTabsCallback = false;
            this.onExtraCallback = null;
            if (RealmConfiguration.onWarmupCompleted != null) {
                this.readTypedObject.add(RealmConfiguration.onWarmupCompleted);
            }
            this.onNavigationEvent = false;
            this.onExtraCallbackWithResult = true;
        }

        public Builder onExtraCallback(String str) {
            if (str == null || str.isEmpty()) {
                throw new IllegalArgumentException("A non-empty filename must be provided");
            }
            this.asBinder = str;
            return this;
        }

        public Builder onExtraCallback(File file) {
            if (file == null) {
                throw new IllegalArgumentException("Non-null 'dir' required.");
            }
            if (file.isFile()) {
                throw new IllegalArgumentException("'dir' is a file, not a directory: " + file.getAbsolutePath() + ".");
            }
            if (!file.exists() && !file.mkdirs()) {
                throw new IllegalArgumentException("Could not create the specified directory: " + file.getAbsolutePath() + ".");
            }
            if (!file.canWrite()) {
                throw new IllegalArgumentException("Realm directory is not writable: " + file.getAbsolutePath() + ".");
            }
            this.asInterface = file;
            return this;
        }

        public Builder onExtraCallback(byte[] bArr) {
            if (bArr == null) {
                throw new IllegalArgumentException("A non-null key must be provided");
            }
            if (bArr.length != 64) {
                throw new IllegalArgumentException(String.format(Locale.US, "The provided key must be %s bytes. Yours was: %s", 64, Integer.valueOf(bArr.length)));
            }
            this.access100 = Arrays.copyOf(bArr, bArr.length);
            return this;
        }

        public Builder onExtraCallbackWithResult(long j) {
            if (j < 0) {
                throw new IllegalArgumentException("Realm schema version numbers must be 0 (zero) or higher. Yours was: " + j);
            }
            this.writeTypedObject = j;
            return this;
        }

        public Builder IAuthTabCallback(RealmMigration realmMigration) {
            if (realmMigration == null) {
                throw new IllegalArgumentException("A non-null migration must be provided");
            }
            this.getInterfaceDescriptor = realmMigration;
            return this;
        }

        public Builder onWarmupCompleted(Object obj, Object... objArr) {
            this.readTypedObject.clear();
            onExtraCallbackWithResult(obj);
            if (objArr != null) {
                for (Object obj2 : objArr) {
                    onExtraCallbackWithResult(obj2);
                }
            }
            return this;
        }

        public final Builder onExtraCallbackWithResult(Object obj) {
            if (obj != null) {
                onExtraCallback(obj);
                this.readTypedObject.add(obj);
            }
            return this;
        }

        public Builder onExtraCallbackWithResult(CompactOnLaunchCallback compactOnLaunchCallback) {
            if (compactOnLaunchCallback == null) {
                throw new IllegalArgumentException("A non-null compactOnLaunch must be provided");
            }
            this.onExtraCallback = compactOnLaunchCallback;
            return this;
        }

        public Builder onWarmupCompleted(boolean z) {
            this.onNavigationEvent = z;
            return this;
        }

        public RealmConfiguration onWarmupCompleted() {
            if (this.ICustomTabsCallback) {
                if (this.access000 != null) {
                    throw new IllegalStateException("This Realm is marked as read-only. Read-only Realms cannot use initialData(Realm.Transaction).");
                }
                if (this.onWarmupCompleted == null) {
                    throw new IllegalStateException("Only Realms provided using 'assetFile(path)' can be marked read-only. No such Realm was provided.");
                }
                if (this.IAuthTabCallbackDefault) {
                    throw new IllegalStateException("'deleteRealmIfMigrationNeeded()' and read-only Realms cannot be combined");
                }
                if (this.onExtraCallback != null) {
                    throw new IllegalStateException("'compactOnLaunch()' and read-only Realms cannot be combined");
                }
            }
            if (this.extraCallbackWithResult == null && Util.onExtraCallbackWithResult()) {
                this.extraCallbackWithResult = new RealmObservableFactory(true);
            }
            if (this.IAuthTabCallback_Parcel == null && Util.onNavigationEvent()) {
                this.IAuthTabCallback_Parcel = new RealmFlowFactory(Boolean.TRUE);
            }
            return new RealmConfiguration(new File(this.asInterface, this.asBinder), this.onWarmupCompleted, this.access100, this.writeTypedObject, this.getInterfaceDescriptor, this.IAuthTabCallbackDefault, this.onTransact, RealmConfiguration.onWarmupCompleted(this.readTypedObject, this.IAuthTabCallback, this.IAuthTabCallbackStub), this.extraCallbackWithResult, this.IAuthTabCallback_Parcel, this.access000, this.ICustomTabsCallback, this.onExtraCallback, false, this.IAuthTabCallbackStubProxy, this.onNavigationEvent, this.onExtraCallbackWithResult);
        }

        private void onExtraCallback(Object obj) {
            if (obj.getClass().isAnnotationPresent(RealmModule.class)) {
                return;
            }
            throw new IllegalArgumentException(obj.getClass().getCanonicalName() + " is not a RealmModule. Add @RealmModule to the class definition.");
        }
    }
}
