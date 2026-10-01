package io.realm.rx;

import io.realm.Realm;
import io.realm.RealmResults;
import o.JsonReaderUnknownNumberParsing;
import o.access21400;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface RxObservableFactory {
    <E> JsonReaderUnknownNumberParsing<RealmResults<E>> onExtraCallback(Realm realm, RealmResults<E> realmResults);

    <E> JsonReaderUnknownNumberParsing<RealmResults<E>> onExtraCallback(access21400 access21400Var, RealmResults<E> realmResults);
}
