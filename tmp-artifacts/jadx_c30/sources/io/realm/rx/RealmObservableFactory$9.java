package io.realm.rx;

import io.realm.RealmConfiguration;
import io.realm.RealmResults;
import io.realm.rx.RealmObservableFactory;
import o.access11000;
import o.access11100;
import o.access21400;
import o.access23200;
import o.bigDecimalOrDouble;
import o.serializeObject;
import o.writeBinary;

/* JADX INFO: Add missing generic type declarations: [E] */
/* loaded from: /tmp/toss_alldex/classes30.dex */
class RealmObservableFactory$9<E> implements serializeObject<access23200<RealmResults<E>>> {
    final /* synthetic */ RealmObservableFactory IAuthTabCallback;
    final /* synthetic */ RealmConfiguration onNavigationEvent;
    final /* synthetic */ RealmResults onWarmupCompleted;

    public void subscribe(final writeBinary<access23200<RealmResults<E>>> writebinary) {
        if (this.onWarmupCompleted.onExtraCallback()) {
            final access21400 access21400VarIAuthTabCallback = access21400.IAuthTabCallback(this.onNavigationEvent);
            ((RealmObservableFactory.StrongReferenceCounter) RealmObservableFactory.onNavigationEvent(this.IAuthTabCallback).get()).onWarmupCompleted(this.onWarmupCompleted);
            final access11000<RealmResults<E>> access11000Var = new access11000<RealmResults<E>>() { // from class: io.realm.rx.RealmObservableFactory$9.1
                /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
                public void onChange(RealmResults<E> realmResults, access11100 access11100Var) {
                    if (writebinary.isDisposed()) {
                        return;
                    }
                    writeBinary writebinary2 = writebinary;
                    if (RealmObservableFactory.IAuthTabCallback(RealmObservableFactory$9.this.IAuthTabCallback)) {
                        realmResults = realmResults.IAuthTabCallbackStub();
                    }
                    writebinary2.IAuthTabCallback(new access23200(realmResults, access11100Var));
                }
            };
            this.onWarmupCompleted.onNavigationEvent(access11000Var);
            writebinary.onNavigationEvent(bigDecimalOrDouble.onExtraCallback(new Runnable() { // from class: io.realm.rx.RealmObservableFactory$9.2
                @Override // java.lang.Runnable
                public void run() {
                    if (!access21400VarIAuthTabCallback.extraCallbackWithResult()) {
                        RealmObservableFactory$9.this.onWarmupCompleted.IAuthTabCallback(access11000Var);
                        access21400VarIAuthTabCallback.close();
                    }
                    ((RealmObservableFactory.StrongReferenceCounter) RealmObservableFactory.onNavigationEvent(RealmObservableFactory$9.this.IAuthTabCallback).get()).onNavigationEvent(RealmObservableFactory$9.this.onWarmupCompleted);
                }
            }));
            writebinary.IAuthTabCallback(new access23200(RealmObservableFactory.IAuthTabCallback(this.IAuthTabCallback) ? this.onWarmupCompleted.IAuthTabCallbackStub() : this.onWarmupCompleted, null));
        }
    }
}
