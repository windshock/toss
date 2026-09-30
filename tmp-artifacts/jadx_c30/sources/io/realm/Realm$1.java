package io.realm;

import io.realm.Realm;
import io.realm.exceptions.RealmException;
import io.realm.internal.OsSharedRealm;
import io.realm.internal.RealmNotifier;
import o.TombstoneProtosLogMessageOrBuilder;

/* loaded from: /tmp/toss_alldex/classes30.dex */
class Realm$1 implements Runnable {
    final /* synthetic */ RealmConfiguration IAuthTabCallback;
    final /* synthetic */ Realm.Transaction asBinder;
    final /* synthetic */ Realm.Transaction.OnError onExtraCallback;
    final /* synthetic */ Realm onExtraCallbackWithResult;
    final /* synthetic */ boolean onNavigationEvent;
    final /* synthetic */ RealmNotifier onTransact;
    final /* synthetic */ Realm.Transaction.OnSuccess onWarmupCompleted;

    /* JADX INFO: Thrown type has an unknown type hierarchy: io.realm.exceptions.RealmException */
    @Override // java.lang.Runnable
    public void run() throws RealmException {
        final OsSharedRealm.onWarmupCompleted versionID;
        if (Thread.currentThread().isInterrupted()) {
            return;
        }
        Realm realmOnNavigationEvent = Realm.onNavigationEvent(this.IAuthTabCallback);
        realmOnNavigationEvent.onWarmupCompleted();
        final Throwable th = null;
        try {
            this.asBinder.execute(realmOnNavigationEvent);
        } catch (Throwable th2) {
            try {
                if (realmOnNavigationEvent.extraCallback()) {
                    realmOnNavigationEvent.onNavigationEvent();
                }
                realmOnNavigationEvent.close();
                versionID = null;
                th = th2;
            } finally {
            }
        }
        if (Thread.currentThread().isInterrupted()) {
            try {
                if (realmOnNavigationEvent.extraCallback()) {
                    realmOnNavigationEvent.onNavigationEvent();
                }
                return;
            } finally {
            }
        }
        realmOnNavigationEvent.asBinder();
        versionID = ((TombstoneProtosLogMessageOrBuilder) realmOnNavigationEvent).IAuthTabCallbackDefault.getVersionID();
        try {
            if (realmOnNavigationEvent.extraCallback()) {
                realmOnNavigationEvent.onNavigationEvent();
            }
            if (!this.onNavigationEvent) {
                if (th != null) {
                    throw new RealmException("Async transaction failed", th);
                }
            } else if (versionID != null && this.onWarmupCompleted != null) {
                this.onTransact.post(new Runnable() { // from class: io.realm.Realm$1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (Realm$1.this.onExtraCallbackWithResult.extraCallbackWithResult()) {
                            Realm.Transaction.OnSuccess onSuccess = Realm$1.this.onWarmupCompleted;
                        } else if (((TombstoneProtosLogMessageOrBuilder) Realm$1.this.onExtraCallbackWithResult).IAuthTabCallbackDefault.getVersionID().onWarmupCompleted(versionID) < 0) {
                            ((TombstoneProtosLogMessageOrBuilder) Realm$1.this.onExtraCallbackWithResult).IAuthTabCallbackDefault.realmNotifier.addTransactionCallback(new Runnable() { // from class: io.realm.Realm.1.1.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    Realm.Transaction.OnSuccess onSuccess2 = Realm$1.this.onWarmupCompleted;
                                }
                            });
                        } else {
                            Realm.Transaction.OnSuccess onSuccess2 = Realm$1.this.onWarmupCompleted;
                        }
                    }
                });
            } else if (th != null) {
                this.onTransact.post(new Runnable() { // from class: io.realm.Realm$1.2
                    /* JADX INFO: Thrown type has an unknown type hierarchy: io.realm.exceptions.RealmException */
                    @Override // java.lang.Runnable
                    public void run() throws RealmException {
                        if (Realm$1.this.onExtraCallback == null) {
                            throw new RealmException("Async transaction failed", th);
                        }
                    }
                });
            }
        } finally {
        }
    }
}
