package o;

import io.realm.RealmModel;
import io.realm.RealmObject;
import io.realm.RealmObjectChangeListener;
import io.realm.internal.OsObject;
import io.realm.internal.OsSharedRealm;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.UncheckedRow;
import java.util.List;
import o.access22200;
import o.access22400;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access11500<E extends RealmModel> implements access22400.onExtraCallbackWithResult {
    private static IAuthTabCallback onWarmupCompleted = new IAuthTabCallback();
    private List<String> IAuthTabCallback;
    private TombstoneProtosLogMessageOrBuilder IAuthTabCallbackDefault;
    private OsObject IAuthTabCallbackStub;
    private Row asBinder;
    private E onExtraCallbackWithResult;
    private boolean onNavigationEvent;
    private boolean onTransact = true;
    private access22200<OsObject.onWarmupCompleted> onExtraCallback = new access22200<>();

    static class IAuthTabCallback implements access22200.onExtraCallbackWithResult<OsObject.onWarmupCompleted> {
        private IAuthTabCallback() {
        }

        @Override // o.access22200.onExtraCallbackWithResult
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public void onExtraCallbackWithResult(OsObject.onWarmupCompleted onwarmupcompleted, Object obj) {
            onwarmupcompleted.onExtraCallback((RealmModel) obj, null);
        }
    }

    public access11500() {
    }

    public access11500(E e) {
        this.onExtraCallbackWithResult = e;
    }

    public TombstoneProtosLogMessageOrBuilder onExtraCallback() {
        return this.IAuthTabCallbackDefault;
    }

    public void onExtraCallbackWithResult(TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilder) {
        this.IAuthTabCallbackDefault = tombstoneProtosLogMessageOrBuilder;
    }

    public Row IAuthTabCallback() {
        return this.asBinder;
    }

    public void onExtraCallbackWithResult(Row row) {
        this.asBinder = row;
    }

    public boolean onWarmupCompleted() {
        return this.onNavigationEvent;
    }

    public void onNavigationEvent(boolean z) {
        this.onNavigationEvent = z;
    }

    public List<String> onExtraCallbackWithResult() {
        return this.IAuthTabCallback;
    }

    public void onNavigationEvent(List<String> list) {
        this.IAuthTabCallback = list;
    }

    private void asInterface() {
        this.onExtraCallback.IAuthTabCallback(onWarmupCompleted);
    }

    public void onWarmupCompleted(RealmObjectChangeListener<E> realmObjectChangeListener) {
        Row row = this.asBinder;
        if (row instanceof access22400) {
            this.onExtraCallback.onExtraCallback(new OsObject.onWarmupCompleted(this.onExtraCallbackWithResult, realmObjectChangeListener));
            return;
        }
        if (row instanceof UncheckedRow) {
            onTransact();
            OsObject osObject = this.IAuthTabCallbackStub;
            if (osObject != null) {
                osObject.addListener(this.onExtraCallbackWithResult, realmObjectChangeListener);
            }
        }
    }

    public void onExtraCallbackWithResult(RealmObjectChangeListener<E> realmObjectChangeListener) {
        OsObject osObject = this.IAuthTabCallbackStub;
        if (osObject != null) {
            osObject.removeListener(this.onExtraCallbackWithResult, realmObjectChangeListener);
        } else {
            this.onExtraCallback.IAuthTabCallback(this.onExtraCallbackWithResult, realmObjectChangeListener);
        }
    }

    public boolean IAuthTabCallbackStub() {
        return this.onTransact;
    }

    public void IAuthTabCallbackDefault() {
        this.onTransact = false;
        this.IAuthTabCallback = null;
    }

    private void onTransact() {
        OsSharedRealm osSharedRealm = this.IAuthTabCallbackDefault.IAuthTabCallbackDefault;
        if (osSharedRealm == null || osSharedRealm.isClosed() || !this.asBinder.isValid() || this.IAuthTabCallbackStub != null) {
            return;
        }
        OsObject osObject = new OsObject(this.IAuthTabCallbackDefault.IAuthTabCallbackDefault, (UncheckedRow) this.asBinder);
        this.IAuthTabCallbackStub = osObject;
        osObject.setObserverPairs(this.onExtraCallback);
        this.onExtraCallback = null;
    }

    public boolean onNavigationEvent() {
        return this.asBinder.isLoaded();
    }

    @Override // o.access22400.onExtraCallbackWithResult
    public void IAuthTabCallback(Row row) {
        this.asBinder = row;
        asInterface();
        if (row.isValid()) {
            onTransact();
        }
    }

    public void onNavigationEvent(RealmModel realmModel) {
        if (!RealmObject.onTransact(realmModel) || !RealmObject.onWarmupCompleted(realmModel)) {
            throw new IllegalArgumentException("'value' is not a valid managed object.");
        }
        if (((RealmObjectProxy) realmModel).cb_().onExtraCallback() != onExtraCallback()) {
            throw new IllegalArgumentException("'value' belongs to a different Realm.");
        }
    }
}
