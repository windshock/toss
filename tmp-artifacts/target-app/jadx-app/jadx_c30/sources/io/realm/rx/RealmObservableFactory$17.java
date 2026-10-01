package io.realm.rx;

import io.realm.DynamicRealmObject;
import io.realm.RealmConfiguration;
import io.realm.RealmObject;
import io.realm.RealmObjectChangeListener;
import io.realm.rx.RealmObservableFactory;
import o.TombstoneProtosMemoryDumpMetadataCase;
import o.access21400;
import o.access23300;
import o.bigDecimalOrDouble;
import o.serializeObject;
import o.writeBinary;

/* loaded from: /tmp/toss_alldex/classes30.dex */
class RealmObservableFactory$17 implements serializeObject<access23300<DynamicRealmObject>> {
    final /* synthetic */ RealmConfiguration IAuthTabCallback;
    final /* synthetic */ DynamicRealmObject onNavigationEvent;
    final /* synthetic */ RealmObservableFactory onWarmupCompleted;

    public void subscribe(final writeBinary<access23300<DynamicRealmObject>> writebinary) {
        if (RealmObject.onTransact(this.onNavigationEvent)) {
            final access21400 access21400VarIAuthTabCallback = access21400.IAuthTabCallback(this.IAuthTabCallback);
            ((RealmObservableFactory.StrongReferenceCounter) RealmObservableFactory.onWarmupCompleted(this.onWarmupCompleted).get()).onWarmupCompleted(this.onNavigationEvent);
            final RealmObjectChangeListener<DynamicRealmObject> realmObjectChangeListener = new RealmObjectChangeListener<DynamicRealmObject>() { // from class: io.realm.rx.RealmObservableFactory$17.1
                /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
                public void onChange(DynamicRealmObject dynamicRealmObject, TombstoneProtosMemoryDumpMetadataCase tombstoneProtosMemoryDumpMetadataCase) {
                    if (writebinary.isDisposed()) {
                        return;
                    }
                    writeBinary writebinary2 = writebinary;
                    if (RealmObservableFactory.IAuthTabCallback(RealmObservableFactory$17.this.onWarmupCompleted)) {
                        dynamicRealmObject = (DynamicRealmObject) RealmObject.onNavigationEvent(dynamicRealmObject);
                    }
                    writebinary2.IAuthTabCallback(new access23300(dynamicRealmObject, tombstoneProtosMemoryDumpMetadataCase));
                }
            };
            this.onNavigationEvent.onNavigationEvent(realmObjectChangeListener);
            writebinary.onNavigationEvent(bigDecimalOrDouble.onExtraCallback(new Runnable() { // from class: io.realm.rx.RealmObservableFactory$17.2
                @Override // java.lang.Runnable
                public void run() {
                    if (!access21400VarIAuthTabCallback.extraCallbackWithResult()) {
                        RealmObject.onExtraCallback(RealmObservableFactory$17.this.onNavigationEvent, realmObjectChangeListener);
                        access21400VarIAuthTabCallback.close();
                    }
                    ((RealmObservableFactory.StrongReferenceCounter) RealmObservableFactory.onWarmupCompleted(RealmObservableFactory$17.this.onWarmupCompleted).get()).onNavigationEvent(RealmObservableFactory$17.this.onNavigationEvent);
                }
            }));
            writebinary.IAuthTabCallback(new access23300(RealmObservableFactory.IAuthTabCallback(this.onWarmupCompleted) ? RealmObject.onNavigationEvent(this.onNavigationEvent) : this.onNavigationEvent, null));
        }
    }
}
