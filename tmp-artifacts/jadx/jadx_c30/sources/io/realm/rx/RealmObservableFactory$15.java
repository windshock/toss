package io.realm.rx;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmModel;
import io.realm.RealmObject;
import io.realm.RealmObjectChangeListener;
import io.realm.rx.RealmObservableFactory;
import o.TombstoneProtosMemoryDumpMetadataCase;
import o.access23300;
import o.bigDecimalOrDouble;
import o.serializeObject;
import o.writeBinary;

/* JADX INFO: Add missing generic type declarations: [E] */
/* loaded from: /tmp/toss_alldex/classes30.dex */
class RealmObservableFactory$15<E> implements serializeObject<access23300<E>> {
    final /* synthetic */ RealmModel IAuthTabCallback;
    final /* synthetic */ RealmObservableFactory onExtraCallback;
    final /* synthetic */ RealmConfiguration onWarmupCompleted;

    public void subscribe(final writeBinary<access23300<E>> writebinary) {
        if (RealmObject.onTransact(this.IAuthTabCallback)) {
            final Realm realmOnNavigationEvent = Realm.onNavigationEvent(this.onWarmupCompleted);
            ((RealmObservableFactory.StrongReferenceCounter) RealmObservableFactory.onWarmupCompleted(this.onExtraCallback).get()).onWarmupCompleted(this.IAuthTabCallback);
            final RealmObjectChangeListener<E> realmObjectChangeListener = new RealmObjectChangeListener<E>() { // from class: io.realm.rx.RealmObservableFactory$15.1
                /* JADX WARN: Incorrect types in method signature: (TE;Lo/TombstoneProtosMemoryDumpMetadataCase;)V */
                public void onChange(RealmModel realmModel, TombstoneProtosMemoryDumpMetadataCase tombstoneProtosMemoryDumpMetadataCase) {
                    if (writebinary.isDisposed()) {
                        return;
                    }
                    writeBinary writebinary2 = writebinary;
                    if (RealmObservableFactory.IAuthTabCallback(RealmObservableFactory$15.this.onExtraCallback)) {
                        realmModel = RealmObject.onNavigationEvent(realmModel);
                    }
                    writebinary2.IAuthTabCallback(new access23300(realmModel, tombstoneProtosMemoryDumpMetadataCase));
                }
            };
            RealmObject.onNavigationEvent(this.IAuthTabCallback, realmObjectChangeListener);
            writebinary.onNavigationEvent(bigDecimalOrDouble.onExtraCallback(new Runnable() { // from class: io.realm.rx.RealmObservableFactory$15.2
                @Override // java.lang.Runnable
                public void run() {
                    if (!realmOnNavigationEvent.extraCallbackWithResult()) {
                        RealmObject.onExtraCallback(RealmObservableFactory$15.this.IAuthTabCallback, realmObjectChangeListener);
                        realmOnNavigationEvent.close();
                    }
                    ((RealmObservableFactory.StrongReferenceCounter) RealmObservableFactory.onWarmupCompleted(RealmObservableFactory$15.this.onExtraCallback).get()).onNavigationEvent(RealmObservableFactory$15.this.IAuthTabCallback);
                }
            }));
            writebinary.IAuthTabCallback(new access23300(RealmObservableFactory.IAuthTabCallback(this.onExtraCallback) ? RealmObject.onNavigationEvent(this.IAuthTabCallback) : this.IAuthTabCallback, null));
        }
    }
}
