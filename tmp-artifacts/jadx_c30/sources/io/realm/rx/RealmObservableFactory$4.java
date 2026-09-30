package io.realm.rx;

import io.realm.Realm;
import io.realm.RealmChangeListener;
import io.realm.RealmConfiguration;
import o.JsonReaderWithObjectReader;
import o.JsonReaderWithReader;
import o.bigDecimalOrDouble;

/* loaded from: /tmp/toss_alldex/classes30.dex */
class RealmObservableFactory$4 implements JsonReaderWithReader<Realm> {
    final /* synthetic */ RealmConfiguration onNavigationEvent;
    final /* synthetic */ RealmObservableFactory onWarmupCompleted;

    public void subscribe(final JsonReaderWithObjectReader<Realm> jsonReaderWithObjectReader) throws Exception {
        final Realm realmOnNavigationEvent = Realm.onNavigationEvent(this.onNavigationEvent);
        final RealmChangeListener<Realm> realmChangeListener = new RealmChangeListener<Realm>() { // from class: io.realm.rx.RealmObservableFactory$4.1
            /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
            public void onChange(Realm realm) {
                if (jsonReaderWithObjectReader.onWarmupCompleted()) {
                    return;
                }
                JsonReaderWithObjectReader jsonReaderWithObjectReader2 = jsonReaderWithObjectReader;
                if (RealmObservableFactory.IAuthTabCallback(RealmObservableFactory$4.this.onWarmupCompleted)) {
                    realm = realm.onMinimized();
                }
                jsonReaderWithObjectReader2.IAuthTabCallback(realm);
            }
        };
        realmOnNavigationEvent.onWarmupCompleted(realmChangeListener);
        jsonReaderWithObjectReader.onWarmupCompleted(bigDecimalOrDouble.onExtraCallback(new Runnable() { // from class: io.realm.rx.RealmObservableFactory$4.2
            @Override // java.lang.Runnable
            public void run() {
                if (realmOnNavigationEvent.extraCallbackWithResult()) {
                    return;
                }
                realmOnNavigationEvent.onExtraCallbackWithResult(realmChangeListener);
                realmOnNavigationEvent.close();
            }
        }));
        if (RealmObservableFactory.IAuthTabCallback(this.onWarmupCompleted)) {
            realmOnNavigationEvent = realmOnNavigationEvent.onMinimized();
        }
        jsonReaderWithObjectReader.IAuthTabCallback(realmOnNavigationEvent);
    }
}
