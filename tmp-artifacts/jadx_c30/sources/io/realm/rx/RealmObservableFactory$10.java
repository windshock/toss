package io.realm.rx;

import io.realm.Realm;
import io.realm.RealmChangeListener;
import io.realm.RealmConfiguration;
import io.realm.RealmList;
import io.realm.rx.RealmObservableFactory;
import o.JsonReaderWithObjectReader;
import o.JsonReaderWithReader;
import o.bigDecimalOrDouble;

/* JADX INFO: Add missing generic type declarations: [E] */
/* loaded from: /tmp/toss_alldex/classes30.dex */
class RealmObservableFactory$10<E> implements JsonReaderWithReader<RealmList<E>> {
    final /* synthetic */ RealmList IAuthTabCallback;
    final /* synthetic */ RealmObservableFactory onExtraCallbackWithResult;
    final /* synthetic */ RealmConfiguration onNavigationEvent;

    public void subscribe(final JsonReaderWithObjectReader<RealmList<E>> jsonReaderWithObjectReader) {
        if (this.IAuthTabCallback.onExtraCallback()) {
            final Realm realmOnNavigationEvent = Realm.onNavigationEvent(this.onNavigationEvent);
            ((RealmObservableFactory.StrongReferenceCounter) RealmObservableFactory.onExtraCallbackWithResult(this.onExtraCallbackWithResult).get()).onWarmupCompleted(this.IAuthTabCallback);
            final RealmChangeListener<RealmList<E>> realmChangeListener = new RealmChangeListener<RealmList<E>>() { // from class: io.realm.rx.RealmObservableFactory$10.1
                /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
                public void onChange(RealmList<E> realmList) {
                    if (!realmList.onExtraCallback()) {
                        jsonReaderWithObjectReader.onNavigationEvent();
                    } else {
                        if (jsonReaderWithObjectReader.onWarmupCompleted()) {
                            return;
                        }
                        JsonReaderWithObjectReader jsonReaderWithObjectReader2 = jsonReaderWithObjectReader;
                        if (RealmObservableFactory.IAuthTabCallback(RealmObservableFactory$10.this.onExtraCallbackWithResult)) {
                            realmList = realmList.onNavigationEvent();
                        }
                        jsonReaderWithObjectReader2.IAuthTabCallback(realmList);
                    }
                }
            };
            this.IAuthTabCallback.onWarmupCompleted(realmChangeListener);
            jsonReaderWithObjectReader.onWarmupCompleted(bigDecimalOrDouble.onExtraCallback(new Runnable() { // from class: io.realm.rx.RealmObservableFactory$10.2
                @Override // java.lang.Runnable
                public void run() {
                    if (!realmOnNavigationEvent.extraCallbackWithResult()) {
                        RealmObservableFactory$10.this.IAuthTabCallback.onNavigationEvent(realmChangeListener);
                        realmOnNavigationEvent.close();
                    }
                    ((RealmObservableFactory.StrongReferenceCounter) RealmObservableFactory.onExtraCallbackWithResult(RealmObservableFactory$10.this.onExtraCallbackWithResult).get()).onNavigationEvent(RealmObservableFactory$10.this.IAuthTabCallback);
                }
            }));
            jsonReaderWithObjectReader.IAuthTabCallback(RealmObservableFactory.IAuthTabCallback(this.onExtraCallbackWithResult) ? this.IAuthTabCallback.onNavigationEvent() : this.IAuthTabCallback);
        }
    }
}
