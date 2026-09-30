package io.realm.rx;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmList;
import io.realm.rx.RealmObservableFactory;
import o.access11000;
import o.access11100;
import o.access23200;
import o.bigDecimalOrDouble;
import o.serializeObject;
import o.writeBinary;

/* JADX INFO: Add missing generic type declarations: [E] */
/* loaded from: /tmp/toss_alldex/classes30.dex */
class RealmObservableFactory$11<E> implements serializeObject<access23200<RealmList<E>>> {
    final /* synthetic */ RealmList onExtraCallback;
    final /* synthetic */ RealmObservableFactory onNavigationEvent;
    final /* synthetic */ RealmConfiguration onWarmupCompleted;

    public void subscribe(final writeBinary<access23200<RealmList<E>>> writebinary) {
        if (this.onExtraCallback.onExtraCallback()) {
            final Realm realmOnNavigationEvent = Realm.onNavigationEvent(this.onWarmupCompleted);
            ((RealmObservableFactory.StrongReferenceCounter) RealmObservableFactory.onExtraCallbackWithResult(this.onNavigationEvent).get()).onWarmupCompleted(this.onExtraCallback);
            final access11000<RealmList<E>> access11000Var = new access11000<RealmList<E>>() { // from class: io.realm.rx.RealmObservableFactory$11.1
                /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
                public void onChange(RealmList<E> realmList, access11100 access11100Var) {
                    if (!realmList.onExtraCallback()) {
                        writebinary.onNavigationEvent();
                    } else {
                        if (writebinary.isDisposed()) {
                            return;
                        }
                        writeBinary writebinary2 = writebinary;
                        if (RealmObservableFactory.IAuthTabCallback(RealmObservableFactory$11.this.onNavigationEvent)) {
                            realmList = realmList.onNavigationEvent();
                        }
                        writebinary2.IAuthTabCallback(new access23200(realmList, access11100Var));
                    }
                }
            };
            this.onExtraCallback.onNavigationEvent(access11000Var);
            writebinary.onNavigationEvent(bigDecimalOrDouble.onExtraCallback(new Runnable() { // from class: io.realm.rx.RealmObservableFactory$11.2
                @Override // java.lang.Runnable
                public void run() {
                    if (!realmOnNavigationEvent.extraCallbackWithResult()) {
                        RealmObservableFactory$11.this.onExtraCallback.onExtraCallback(access11000Var);
                        realmOnNavigationEvent.close();
                    }
                    ((RealmObservableFactory.StrongReferenceCounter) RealmObservableFactory.onExtraCallbackWithResult(RealmObservableFactory$11.this.onNavigationEvent).get()).onNavigationEvent(RealmObservableFactory$11.this.onExtraCallback);
                }
            }));
            writebinary.IAuthTabCallback(new access23200(RealmObservableFactory.IAuthTabCallback(this.onNavigationEvent) ? this.onExtraCallback.onNavigationEvent() : this.onExtraCallback, null));
        }
    }
}
