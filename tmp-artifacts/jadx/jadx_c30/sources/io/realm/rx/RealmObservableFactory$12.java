package io.realm.rx;

import io.realm.RealmChangeListener;
import io.realm.RealmConfiguration;
import io.realm.RealmList;
import io.realm.rx.RealmObservableFactory;
import o.JsonReaderWithObjectReader;
import o.JsonReaderWithReader;
import o.access21400;
import o.bigDecimalOrDouble;

/* JADX INFO: Add missing generic type declarations: [E] */
/* loaded from: /tmp/toss_alldex/classes30.dex */
class RealmObservableFactory$12<E> implements JsonReaderWithReader<RealmList<E>> {
    final /* synthetic */ RealmConfiguration IAuthTabCallback;
    final /* synthetic */ RealmObservableFactory onExtraCallback;
    final /* synthetic */ RealmList onNavigationEvent;

    public void subscribe(final JsonReaderWithObjectReader<RealmList<E>> jsonReaderWithObjectReader) {
        if (this.onNavigationEvent.onExtraCallback()) {
            final access21400 access21400VarIAuthTabCallback = access21400.IAuthTabCallback(this.IAuthTabCallback);
            ((RealmObservableFactory.StrongReferenceCounter) RealmObservableFactory.onExtraCallbackWithResult(this.onExtraCallback).get()).onWarmupCompleted(this.onNavigationEvent);
            final RealmChangeListener<RealmList<E>> realmChangeListener = new RealmChangeListener<RealmList<E>>() { // from class: io.realm.rx.RealmObservableFactory$12.1
                /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
                public void onChange(RealmList<E> realmList) {
                    if (!realmList.onExtraCallback()) {
                        jsonReaderWithObjectReader.onNavigationEvent();
                    } else {
                        if (jsonReaderWithObjectReader.onWarmupCompleted()) {
                            return;
                        }
                        JsonReaderWithObjectReader jsonReaderWithObjectReader2 = jsonReaderWithObjectReader;
                        if (RealmObservableFactory.IAuthTabCallback(RealmObservableFactory$12.this.onExtraCallback)) {
                            realmList = realmList.onNavigationEvent();
                        }
                        jsonReaderWithObjectReader2.IAuthTabCallback(realmList);
                    }
                }
            };
            this.onNavigationEvent.onWarmupCompleted(realmChangeListener);
            jsonReaderWithObjectReader.onWarmupCompleted(bigDecimalOrDouble.onExtraCallback(new Runnable() { // from class: io.realm.rx.RealmObservableFactory$12.2
                @Override // java.lang.Runnable
                public void run() {
                    if (!access21400VarIAuthTabCallback.extraCallbackWithResult()) {
                        RealmObservableFactory$12.this.onNavigationEvent.onNavigationEvent(realmChangeListener);
                        access21400VarIAuthTabCallback.close();
                    }
                    ((RealmObservableFactory.StrongReferenceCounter) RealmObservableFactory.onExtraCallbackWithResult(RealmObservableFactory$12.this.onExtraCallback).get()).onNavigationEvent(RealmObservableFactory$12.this.onNavigationEvent);
                }
            }));
            jsonReaderWithObjectReader.IAuthTabCallback(RealmObservableFactory.IAuthTabCallback(this.onExtraCallback) ? this.onNavigationEvent.onNavigationEvent() : this.onNavigationEvent);
        }
    }
}
