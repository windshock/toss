package io.realm.rx;

import io.realm.RealmChangeListener;
import io.realm.RealmConfiguration;
import o.JsonReaderWithObjectReader;
import o.JsonReaderWithReader;
import o.access21400;
import o.bigDecimalOrDouble;

/* loaded from: /tmp/toss_alldex/classes30.dex */
class RealmObservableFactory$5 implements JsonReaderWithReader<access21400> {
    final /* synthetic */ RealmConfiguration IAuthTabCallback;
    final /* synthetic */ RealmObservableFactory onWarmupCompleted;

    public void subscribe(final JsonReaderWithObjectReader<access21400> jsonReaderWithObjectReader) throws Exception {
        final access21400 access21400VarIAuthTabCallback = access21400.IAuthTabCallback(this.IAuthTabCallback);
        final RealmChangeListener<access21400> realmChangeListener = new RealmChangeListener<access21400>() { // from class: io.realm.rx.RealmObservableFactory$5.1
            /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
            public void onChange(access21400 access21400Var) {
                if (jsonReaderWithObjectReader.onWarmupCompleted()) {
                    return;
                }
                JsonReaderWithObjectReader jsonReaderWithObjectReader2 = jsonReaderWithObjectReader;
                if (RealmObservableFactory.IAuthTabCallback(RealmObservableFactory$5.this.onWarmupCompleted)) {
                    access21400Var = access21400Var.onActivityResized();
                }
                jsonReaderWithObjectReader2.IAuthTabCallback(access21400Var);
            }
        };
        access21400VarIAuthTabCallback.onNavigationEvent(realmChangeListener);
        jsonReaderWithObjectReader.onWarmupCompleted(bigDecimalOrDouble.onExtraCallback(new Runnable() { // from class: io.realm.rx.RealmObservableFactory$5.2
            @Override // java.lang.Runnable
            public void run() {
                if (access21400VarIAuthTabCallback.extraCallbackWithResult()) {
                    return;
                }
                access21400VarIAuthTabCallback.onExtraCallbackWithResult(realmChangeListener);
                access21400VarIAuthTabCallback.close();
            }
        }));
        if (RealmObservableFactory.IAuthTabCallback(this.onWarmupCompleted)) {
            access21400VarIAuthTabCallback = access21400VarIAuthTabCallback.onActivityResized();
        }
        jsonReaderWithObjectReader.IAuthTabCallback(access21400VarIAuthTabCallback);
    }
}
