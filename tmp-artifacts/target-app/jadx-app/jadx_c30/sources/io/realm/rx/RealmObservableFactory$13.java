package io.realm.rx;

import io.realm.RealmConfiguration;
import io.realm.RealmList;
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
class RealmObservableFactory$13<E> implements serializeObject<access23200<RealmList<E>>> {
    final /* synthetic */ RealmObservableFactory IAuthTabCallback;
    final /* synthetic */ RealmList onNavigationEvent;
    final /* synthetic */ RealmConfiguration onWarmupCompleted;

    public void subscribe(final writeBinary<access23200<RealmList<E>>> writebinary) {
        if (this.onNavigationEvent.onExtraCallback()) {
            final access21400 access21400VarIAuthTabCallback = access21400.IAuthTabCallback(this.onWarmupCompleted);
            ((RealmObservableFactory.StrongReferenceCounter) RealmObservableFactory.onExtraCallbackWithResult(this.IAuthTabCallback).get()).onWarmupCompleted(this.onNavigationEvent);
            final access11000<RealmList<E>> access11000Var = new access11000<RealmList<E>>() { // from class: io.realm.rx.RealmObservableFactory$13.1
                /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
                public void onChange(RealmList<E> realmList, access11100 access11100Var) {
                    if (!realmList.onExtraCallback()) {
                        writebinary.onNavigationEvent();
                    } else {
                        if (writebinary.isDisposed()) {
                            return;
                        }
                        writeBinary writebinary2 = writebinary;
                        if (RealmObservableFactory.IAuthTabCallback(RealmObservableFactory$13.this.IAuthTabCallback)) {
                            realmList = realmList.onNavigationEvent();
                        }
                        writebinary2.IAuthTabCallback(new access23200(realmList, access11100Var));
                    }
                }
            };
            this.onNavigationEvent.onNavigationEvent(access11000Var);
            writebinary.onNavigationEvent(bigDecimalOrDouble.onExtraCallback(new Runnable() { // from class: io.realm.rx.RealmObservableFactory$13.2
                @Override // java.lang.Runnable
                public void run() {
                    if (!access21400VarIAuthTabCallback.extraCallbackWithResult()) {
                        RealmObservableFactory$13.this.onNavigationEvent.onExtraCallback(access11000Var);
                        access21400VarIAuthTabCallback.close();
                    }
                    ((RealmObservableFactory.StrongReferenceCounter) RealmObservableFactory.onExtraCallbackWithResult(RealmObservableFactory$13.this.IAuthTabCallback).get()).onNavigationEvent(RealmObservableFactory$13.this.onNavigationEvent);
                }
            }));
            writebinary.IAuthTabCallback(new access23200(RealmObservableFactory.IAuthTabCallback(this.IAuthTabCallback) ? this.onNavigationEvent.onNavigationEvent() : this.onNavigationEvent, null));
        }
    }
}
