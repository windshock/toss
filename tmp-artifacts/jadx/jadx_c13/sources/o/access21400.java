package o;

import io.realm.DynamicRealmObject;
import io.realm.RealmCache;
import io.realm.RealmChangeListener;
import io.realm.RealmConfiguration;
import io.realm.RealmQuery;
import io.realm.RealmSchema;
import io.realm.internal.OsObjectStore;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.OsSharedRealm;
import io.realm.internal.Table;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class access21400 extends TombstoneProtosLogMessageOrBuilder {
    private final RealmSchema asInterface;

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

    private access21400(final RealmCache realmCache, OsSharedRealm.onWarmupCompleted onwarmupcompleted) {
        super(realmCache, (OsSchemaInfo) null, onwarmupcompleted);
        RealmCache.IAuthTabCallback(realmCache.onNavigationEvent(), new RealmCache.Callback() { // from class: o.access21400.3
            @Override // io.realm.RealmCache.Callback
            public void onWarmupCompleted(int i) {
                if (i > 0 || realmCache.onNavigationEvent().extraCallbackWithResult() || OsObjectStore.IAuthTabCallback(access21400.this.IAuthTabCallbackDefault) != -1) {
                    return;
                }
                access21400.this.IAuthTabCallbackDefault.beginTransaction();
                if (OsObjectStore.IAuthTabCallback(access21400.this.IAuthTabCallbackDefault) == -1) {
                    OsObjectStore.onExtraCallback(access21400.this.IAuthTabCallbackDefault, -1L);
                }
                access21400.this.IAuthTabCallbackDefault.commitTransaction();
            }
        });
        this.asInterface = new access10800(this);
    }

    private access21400(OsSharedRealm osSharedRealm) {
        super(osSharedRealm);
        this.asInterface = new access10800(this);
    }

    public static access21400 IAuthTabCallback(RealmConfiguration realmConfiguration) {
        if (realmConfiguration == null) {
            throw new IllegalArgumentException("A non-null RealmConfiguration must be provided");
        }
        return (access21400) RealmCache.IAuthTabCallback(realmConfiguration, access21400.class);
    }

    public RealmQuery<DynamicRealmObject> onExtraCallback(String str) {
        onTransact();
        if (!this.IAuthTabCallbackDefault.hasTable(Table.onExtraCallbackWithResult(str))) {
            throw new IllegalArgumentException("Class does not exist in the Realm and cannot be queried: " + str);
        }
        return RealmQuery.onExtraCallbackWithResult(this, str);
    }

    public void onNavigationEvent(RealmChangeListener<access21400> realmChangeListener) {
        onExtraCallback(realmChangeListener);
    }

    public void onExtraCallbackWithResult(RealmChangeListener<access21400> realmChangeListener) {
        IAuthTabCallback(realmChangeListener);
    }

    public void onWarmupCompleted(String str) {
        onTransact();
        onExtraCallbackWithResult();
        this.asInterface.IAuthTabCallbackDefault(str).onExtraCallback();
    }

    public static access21400 onWarmupCompleted(RealmCache realmCache, OsSharedRealm.onWarmupCompleted onwarmupcompleted) {
        return new access21400(realmCache, onwarmupcompleted);
    }

    static access21400 onExtraCallback(OsSharedRealm osSharedRealm) {
        return new access21400(osSharedRealm);
    }

    @Override // o.TombstoneProtosLogMessageOrBuilder
    public RealmSchema access000() {
        return this.asInterface;
    }

    @Override // o.TombstoneProtosLogMessageOrBuilder
    /* renamed from: onActivityResized, reason: merged with bridge method [inline-methods] */
    public access21400 IAuthTabCallbackStubProxy() {
        OsSharedRealm.onWarmupCompleted versionID;
        try {
            versionID = this.IAuthTabCallbackDefault.getVersionID();
        } catch (IllegalStateException unused) {
            ICustomTabsCallback();
            versionID = this.IAuthTabCallbackDefault.getVersionID();
        }
        return (access21400) RealmCache.onWarmupCompleted(this.onExtraCallbackWithResult, access21400.class, versionID);
    }
}
