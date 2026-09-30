package io.realm.rx;

import io.realm.DynamicRealmObject;
import io.realm.RealmChangeListener;
import io.realm.RealmConfiguration;
import io.realm.RealmObject;
import io.realm.rx.RealmObservableFactory;
import o.JsonReaderWithObjectReader;
import o.JsonReaderWithReader;
import o.access21400;
import o.bigDecimalOrDouble;

/* loaded from: /tmp/toss_alldex/classes30.dex */
class RealmObservableFactory$16 implements JsonReaderWithReader<DynamicRealmObject> {
    final /* synthetic */ access21400 onExtraCallback;
    final /* synthetic */ DynamicRealmObject onExtraCallbackWithResult;
    final /* synthetic */ RealmConfiguration onNavigationEvent;
    final /* synthetic */ RealmObservableFactory onWarmupCompleted;

    public void subscribe(final JsonReaderWithObjectReader<DynamicRealmObject> jsonReaderWithObjectReader) {
        if (this.onExtraCallback.extraCallbackWithResult()) {
            return;
        }
        final access21400 access21400VarIAuthTabCallback = access21400.IAuthTabCallback(this.onNavigationEvent);
        ((RealmObservableFactory.StrongReferenceCounter) RealmObservableFactory.onWarmupCompleted(this.onWarmupCompleted).get()).onWarmupCompleted(this.onExtraCallbackWithResult);
        final RealmChangeListener<DynamicRealmObject> realmChangeListener = new RealmChangeListener<DynamicRealmObject>() { // from class: io.realm.rx.RealmObservableFactory$16.1
            /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
            public void onChange(DynamicRealmObject dynamicRealmObject) {
                if (jsonReaderWithObjectReader.onWarmupCompleted()) {
                    return;
                }
                JsonReaderWithObjectReader jsonReaderWithObjectReader2 = jsonReaderWithObjectReader;
                if (RealmObservableFactory.IAuthTabCallback(RealmObservableFactory$16.this.onWarmupCompleted)) {
                    dynamicRealmObject = (DynamicRealmObject) RealmObject.onNavigationEvent(dynamicRealmObject);
                }
                jsonReaderWithObjectReader2.IAuthTabCallback(dynamicRealmObject);
            }
        };
        RealmObject.IAuthTabCallback(this.onExtraCallbackWithResult, realmChangeListener);
        jsonReaderWithObjectReader.onWarmupCompleted(bigDecimalOrDouble.onExtraCallback(new Runnable() { // from class: io.realm.rx.RealmObservableFactory$16.2
            @Override // java.lang.Runnable
            public void run() {
                if (!access21400VarIAuthTabCallback.extraCallbackWithResult()) {
                    RealmObject.onNavigationEvent(RealmObservableFactory$16.this.onExtraCallbackWithResult, realmChangeListener);
                    access21400VarIAuthTabCallback.close();
                }
                ((RealmObservableFactory.StrongReferenceCounter) RealmObservableFactory.onWarmupCompleted(RealmObservableFactory$16.this.onWarmupCompleted).get()).onNavigationEvent(RealmObservableFactory$16.this.onExtraCallbackWithResult);
            }
        }));
        jsonReaderWithObjectReader.IAuthTabCallback(RealmObservableFactory.IAuthTabCallback(this.onWarmupCompleted) ? (DynamicRealmObject) RealmObject.onNavigationEvent(this.onExtraCallbackWithResult) : this.onExtraCallbackWithResult);
    }
}
