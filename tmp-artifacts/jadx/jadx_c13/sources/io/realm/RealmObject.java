package io.realm;

import io.realm.annotations.RealmClass;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.log.RealmLog;
import java.util.Collections;
import javax.annotation.Nullable;
import o.TombstoneProtosLogMessageOrBuilder;
import o.access11500;
import o.access21400;
import o.access21900;

@RealmClass
/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class RealmObject implements RealmModel {
    public final void cancelNotification() {
        IAuthTabCallback(this);
    }

    public static <E extends RealmModel> void IAuthTabCallback(E e) {
        if (!(e instanceof RealmObjectProxy)) {
            throw new IllegalArgumentException("Object not managed by Realm, so it cannot be removed.");
        }
        RealmObjectProxy realmObjectProxy = (RealmObjectProxy) e;
        if (realmObjectProxy.cb_().IAuthTabCallback() == null) {
            throw new IllegalStateException("Object malformed: missing object in Realm. Make sure to instantiate RealmObjects with Realm.createObject()");
        }
        if (realmObjectProxy.cb_().onExtraCallback() == null) {
            throw new IllegalStateException("Object malformed: missing Realm. Make sure to instantiate RealmObjects with Realm.createObject()");
        }
        realmObjectProxy.cb_().onExtraCallback().onTransact();
        Row rowIAuthTabCallback = realmObjectProxy.cb_().IAuthTabCallback();
        rowIAuthTabCallback.getTable().access000(rowIAuthTabCallback.getObjectKey());
        realmObjectProxy.cb_().onExtraCallbackWithResult(access21900.INSTANCE);
    }

    public final boolean ax_() {
        return onTransact(this);
    }

    public static <E extends RealmModel> boolean onTransact(@Nullable E e) {
        if (!(e instanceof RealmObjectProxy)) {
            return e != null;
        }
        Row rowIAuthTabCallback = ((RealmObjectProxy) e).cb_().IAuthTabCallback();
        return rowIAuthTabCallback != null && rowIAuthTabCallback.isValid();
    }

    public final <E extends RealmModel> E getActiveNotifications() {
        return (E) onNavigationEvent(this);
    }

    public static <E extends RealmModel> boolean onExtraCallback(E e) {
        if (e instanceof RealmObjectProxy) {
            return ((RealmObjectProxy) e).cb_().onExtraCallback().readTypedObject();
        }
        return false;
    }

    public static <E extends RealmModel> E onNavigationEvent(E e) {
        if (e instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) e;
            TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilderOnExtraCallback = realmObjectProxy.cb_().onExtraCallback();
            TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilderIAuthTabCallbackStubProxy = tombstoneProtosLogMessageOrBuilderOnExtraCallback.readTypedObject() ? tombstoneProtosLogMessageOrBuilderOnExtraCallback : tombstoneProtosLogMessageOrBuilderOnExtraCallback.IAuthTabCallbackStubProxy();
            Row rowFreeze = realmObjectProxy.cb_().IAuthTabCallback().freeze(tombstoneProtosLogMessageOrBuilderIAuthTabCallbackStubProxy.IAuthTabCallbackDefault);
            if (tombstoneProtosLogMessageOrBuilderIAuthTabCallbackStubProxy instanceof access21400) {
                return new DynamicRealmObject(tombstoneProtosLogMessageOrBuilderIAuthTabCallbackStubProxy, rowFreeze);
            }
            if (tombstoneProtosLogMessageOrBuilderIAuthTabCallbackStubProxy instanceof Realm) {
                Class<? super Object> superclass = e.getClass().getSuperclass();
                return (E) tombstoneProtosLogMessageOrBuilderIAuthTabCallbackStubProxy.access100().getInterfaceDescriptor().onExtraCallbackWithResult(superclass, tombstoneProtosLogMessageOrBuilderIAuthTabCallbackStubProxy, rowFreeze, tombstoneProtosLogMessageOrBuilderOnExtraCallback.access000().onExtraCallback((Class<? extends RealmModel>) superclass), false, Collections.EMPTY_LIST);
            }
            throw new UnsupportedOperationException("Unknown Realm type: " + tombstoneProtosLogMessageOrBuilderIAuthTabCallbackStubProxy.getClass().getName());
        }
        throw new IllegalArgumentException("It is only possible to freeze valid managed Realm objects.");
    }

    public static <E extends RealmModel> boolean onExtraCallbackWithResult(E e) {
        if (!(e instanceof RealmObjectProxy)) {
            return true;
        }
        RealmObjectProxy realmObjectProxy = (RealmObjectProxy) e;
        realmObjectProxy.cb_().onExtraCallback().onTransact();
        return realmObjectProxy.cb_().onNavigationEvent();
    }

    public static <E extends RealmModel> boolean onWarmupCompleted(E e) {
        return e instanceof RealmObjectProxy;
    }

    public final <E extends RealmModel> void onNavigationEvent(RealmObjectChangeListener<E> realmObjectChangeListener) {
        onNavigationEvent(this, (RealmObjectChangeListener<RealmObject>) realmObjectChangeListener);
    }

    public final <E extends RealmModel> void onExtraCallback(RealmChangeListener<E> realmChangeListener) {
        IAuthTabCallback(this, realmChangeListener);
    }

    public static <E extends RealmModel> void onNavigationEvent(E e, RealmObjectChangeListener<E> realmObjectChangeListener) {
        if (e == null) {
            throw new IllegalArgumentException("Object should not be null");
        }
        if (realmObjectChangeListener == null) {
            throw new IllegalArgumentException("Listener should not be null");
        }
        if (e instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) e;
            TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilderOnExtraCallback = realmObjectProxy.cb_().onExtraCallback();
            tombstoneProtosLogMessageOrBuilderOnExtraCallback.onTransact();
            tombstoneProtosLogMessageOrBuilderOnExtraCallback.IAuthTabCallbackDefault.capabilities.onNavigationEvent("Listeners cannot be used on current thread.");
            realmObjectProxy.cb_().onWarmupCompleted(realmObjectChangeListener);
            return;
        }
        throw new IllegalArgumentException("Cannot add listener from this unmanaged RealmObject (created outside of Realm)");
    }

    public static <E extends RealmModel> void IAuthTabCallback(E e, RealmChangeListener<E> realmChangeListener) {
        onNavigationEvent((RealmModel) e, (RealmObjectChangeListener) new access11500.onExtraCallbackWithResult(realmChangeListener));
    }

    public final void onWarmupCompleted(RealmChangeListener realmChangeListener) {
        onNavigationEvent(this, (RealmChangeListener<RealmObject>) realmChangeListener);
    }

    public static <E extends RealmModel> void onExtraCallback(E e, RealmObjectChangeListener realmObjectChangeListener) {
        if (e == null) {
            throw new IllegalArgumentException("Object should not be null");
        }
        if (realmObjectChangeListener == null) {
            throw new IllegalArgumentException("Listener should not be null");
        }
        if (e instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) e;
            TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilderOnExtraCallback = realmObjectProxy.cb_().onExtraCallback();
            if (tombstoneProtosLogMessageOrBuilderOnExtraCallback.extraCallbackWithResult()) {
                RealmLog.onExtraCallbackWithResult("Calling removeChangeListener on a closed Realm %s, make sure to close all listeners before closing the Realm.", tombstoneProtosLogMessageOrBuilderOnExtraCallback.onExtraCallbackWithResult.asInterface());
            }
            realmObjectProxy.cb_().onExtraCallbackWithResult(realmObjectChangeListener);
            return;
        }
        throw new IllegalArgumentException("Cannot remove listener from this unmanaged RealmObject (created outside of Realm)");
    }

    public static <E extends RealmModel> void onNavigationEvent(E e, RealmChangeListener<E> realmChangeListener) {
        onExtraCallback(e, new access11500.onExtraCallbackWithResult(realmChangeListener));
    }
}
