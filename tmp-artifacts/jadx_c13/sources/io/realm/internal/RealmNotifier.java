package io.realm.internal;

import io.realm.RealmChangeListener;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
import o.access22200;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class RealmNotifier implements Closeable {
    private OsSharedRealm sharedRealm;
    private access22200<RealmObserverPair> realmObserverPairs = new access22200<>();
    private final access22200.onExtraCallbackWithResult<RealmObserverPair> onChangeCallBack = new access22200.onExtraCallbackWithResult<RealmObserverPair>() { // from class: io.realm.internal.RealmNotifier.1
        @Override // o.access22200.onExtraCallbackWithResult
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public void onExtraCallbackWithResult(RealmObserverPair realmObserverPair, Object obj) {
            if (RealmNotifier.this.sharedRealm == null || RealmNotifier.this.sharedRealm.isClosed()) {
                return;
            }
            realmObserverPair.onNavigationEvent(obj);
        }
    };
    private List<Runnable> transactionCallbacks = new ArrayList();
    private List<Runnable> startSendingNotificationsCallbacks = new ArrayList();
    private List<Runnable> finishedSendingNotificationsCallbacks = new ArrayList();

    public abstract boolean post(Runnable runnable);

    static class RealmObserverPair<T> extends access22200.onWarmupCompleted<T, RealmChangeListener<T>> {
        RealmObserverPair(T t, RealmChangeListener<T> realmChangeListener) {
            super(t, realmChangeListener);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void onNavigationEvent(T t) {
            if (t != null) {
                ((RealmChangeListener) this.onExtraCallback).onChange(t);
            }
        }
    }

    public RealmNotifier(@Nullable OsSharedRealm osSharedRealm) {
        this.sharedRealm = osSharedRealm;
    }

    void didChange() {
        this.realmObserverPairs.IAuthTabCallback(this.onChangeCallBack);
        if (this.transactionCallbacks.isEmpty()) {
            return;
        }
        List<Runnable> list = this.transactionCallbacks;
        this.transactionCallbacks = new ArrayList();
        Iterator<Runnable> it = list.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    void beforeNotify() {
        this.sharedRealm.invalidateIterators();
    }

    void willSendNotifications() {
        for (int i = 0; i < this.startSendingNotificationsCallbacks.size(); i++) {
            this.startSendingNotificationsCallbacks.get(i).run();
        }
    }

    void didSendNotifications() {
        for (int i = 0; i < this.startSendingNotificationsCallbacks.size(); i++) {
            this.finishedSendingNotificationsCallbacks.get(i).run();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        removeAllChangeListeners();
        this.startSendingNotificationsCallbacks.clear();
        this.finishedSendingNotificationsCallbacks.clear();
    }

    public <T> void addChangeListener(T t, RealmChangeListener<T> realmChangeListener) {
        this.realmObserverPairs.onExtraCallback(new RealmObserverPair(t, realmChangeListener));
    }

    public <E> void removeChangeListener(E e, RealmChangeListener<E> realmChangeListener) {
        this.realmObserverPairs.IAuthTabCallback(e, realmChangeListener);
    }

    public <E> void removeChangeListeners(E e) {
        this.realmObserverPairs.onWarmupCompleted(e);
    }

    private void removeAllChangeListeners() {
        this.realmObserverPairs.onWarmupCompleted();
    }

    public void addTransactionCallback(Runnable runnable) {
        this.transactionCallbacks.add(runnable);
    }

    public int getListenersListSize() {
        return this.realmObserverPairs.onExtraCallback();
    }

    public void addBeginSendingNotificationsCallback(Runnable runnable) {
        this.startSendingNotificationsCallbacks.add(runnable);
    }

    public void addFinishedSendingNotificationsCallback(Runnable runnable) {
        this.finishedSendingNotificationsCallbacks.add(runnable);
    }
}
