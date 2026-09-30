package io.realm.rx;

import io.realm.Realm;
import io.realm.RealmChangeListener;
import io.realm.RealmConfiguration;
import io.realm.RealmModel;
import io.realm.RealmObject;
import io.realm.rx.RealmObservableFactory;
import o.JsonReaderWithObjectReader;
import o.JsonReaderWithReader;
import o.bigDecimalOrDouble;

/* JADX INFO: Add missing generic type declarations: [E] */
/* loaded from: /tmp/toss_alldex/classes30.dex */
class RealmObservableFactory$14<E> implements JsonReaderWithReader<E> {
    final /* synthetic */ RealmConfiguration IAuthTabCallback;
    final /* synthetic */ Realm onExtraCallback;
    final /* synthetic */ RealmObservableFactory onNavigationEvent;
    final /* synthetic */ RealmModel onWarmupCompleted;

    public void subscribe(final JsonReaderWithObjectReader<E> jsonReaderWithObjectReader) {
        if (this.onExtraCallback.extraCallbackWithResult()) {
            return;
        }
        final Realm realmOnNavigationEvent = Realm.onNavigationEvent(this.IAuthTabCallback);
        ((RealmObservableFactory.StrongReferenceCounter) RealmObservableFactory.onWarmupCompleted(this.onNavigationEvent).get()).onWarmupCompleted(this.onWarmupCompleted);
        final RealmChangeListener<E> realmChangeListener = new RealmChangeListener<E>() { // from class: io.realm.rx.RealmObservableFactory$14.1
            /* JADX WARN: Incorrect types in method signature: (TE;)V */
            /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
            public void onChange(RealmModel realmModel) {
                if (jsonReaderWithObjectReader.onWarmupCompleted()) {
                    return;
                }
                JsonReaderWithObjectReader jsonReaderWithObjectReader2 = jsonReaderWithObjectReader;
                if (RealmObservableFactory.IAuthTabCallback(RealmObservableFactory$14.this.onNavigationEvent)) {
                    realmModel = RealmObject.onNavigationEvent(realmModel);
                }
                jsonReaderWithObjectReader2.IAuthTabCallback(realmModel);
            }
        };
        RealmObject.IAuthTabCallback(this.onWarmupCompleted, realmChangeListener);
        jsonReaderWithObjectReader.onWarmupCompleted(bigDecimalOrDouble.onExtraCallback(new Runnable() { // from class: io.realm.rx.RealmObservableFactory$14.2
            @Override // java.lang.Runnable
            public void run() {
                if (!realmOnNavigationEvent.extraCallbackWithResult()) {
                    RealmObject.onNavigationEvent(RealmObservableFactory$14.this.onWarmupCompleted, realmChangeListener);
                    realmOnNavigationEvent.close();
                }
                ((RealmObservableFactory.StrongReferenceCounter) RealmObservableFactory.onWarmupCompleted(RealmObservableFactory$14.this.onNavigationEvent).get()).onNavigationEvent(RealmObservableFactory$14.this.onWarmupCompleted);
            }
        }));
        jsonReaderWithObjectReader.IAuthTabCallback(RealmObservableFactory.IAuthTabCallback(this.onNavigationEvent) ? RealmObject.onNavigationEvent(this.onWarmupCompleted) : this.onWarmupCompleted);
    }
}
