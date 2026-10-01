package io.realm.rx;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmResults;
import io.realm.rx.RealmObservableFactory;
import o.access11000;
import o.access11100;
import o.access23200;
import o.bigDecimalOrDouble;
import o.serializeObject;
import o.writeBinary;

/* JADX INFO: Add missing generic type declarations: [E] */
/* loaded from: /tmp/toss_alldex/classes30.dex */
class RealmObservableFactory$7<E> implements serializeObject<access23200<RealmResults<E>>> {
    final /* synthetic */ RealmConfiguration IAuthTabCallback;
    final /* synthetic */ RealmObservableFactory onExtraCallback;
    final /* synthetic */ RealmResults onNavigationEvent;

    public void subscribe(final writeBinary<access23200<RealmResults<E>>> writebinary) {
        if (this.onNavigationEvent.onExtraCallback()) {
            final Realm realmOnNavigationEvent = Realm.onNavigationEvent(this.IAuthTabCallback);
            ((RealmObservableFactory.StrongReferenceCounter) RealmObservableFactory.onNavigationEvent(this.onExtraCallback).get()).onWarmupCompleted(this.onNavigationEvent);
            final access11000<RealmResults<E>> access11000Var = new access11000<RealmResults<E>>() { // from class: io.realm.rx.RealmObservableFactory$7.1
                /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
                public void onChange(RealmResults<E> realmResults, access11100 access11100Var) {
                    if (writebinary.isDisposed()) {
                        return;
                    }
                    writebinary.IAuthTabCallback(new access23200(RealmObservableFactory.IAuthTabCallback(RealmObservableFactory$7.this.onExtraCallback) ? RealmObservableFactory$7.this.onNavigationEvent.IAuthTabCallbackStub() : RealmObservableFactory$7.this.onNavigationEvent, access11100Var));
                }
            };
            this.onNavigationEvent.onNavigationEvent(access11000Var);
            writebinary.onNavigationEvent(bigDecimalOrDouble.onExtraCallback(new Runnable() { // from class: io.realm.rx.RealmObservableFactory$7.2
                @Override // java.lang.Runnable
                public void run() {
                    if (!realmOnNavigationEvent.extraCallbackWithResult()) {
                        RealmObservableFactory$7.this.onNavigationEvent.IAuthTabCallback(access11000Var);
                        realmOnNavigationEvent.close();
                    }
                    ((RealmObservableFactory.StrongReferenceCounter) RealmObservableFactory.onNavigationEvent(RealmObservableFactory$7.this.onExtraCallback).get()).onNavigationEvent(RealmObservableFactory$7.this.onNavigationEvent);
                }
            }));
            writebinary.IAuthTabCallback(new access23200(RealmObservableFactory.IAuthTabCallback(this.onExtraCallback) ? this.onNavigationEvent.IAuthTabCallbackStub() : this.onNavigationEvent, null));
        }
    }
}
