package io.realm.rx;

import android.os.Looper;
import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmList;
import io.realm.RealmModel;
import io.realm.RealmResults;
import o.JsonReaderUnknownNumberParsing;
import o.JsonReaderWithReader;
import o.MapConverter;
import o.NetConverter3;
import o.access21400;
import o.wasNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class RealmObservableFactory implements RxObservableFactory {
    private static final wasNull IAuthTabCallback = wasNull.LATEST;
    private final boolean onNavigationEvent;
    private ThreadLocal<StrongReferenceCounter<RealmResults>> onWarmupCompleted = new ThreadLocal<StrongReferenceCounter<RealmResults>>() { // from class: io.realm.rx.RealmObservableFactory.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public StrongReferenceCounter<RealmResults> initialValue() {
            return new StrongReferenceCounter<>((AnonymousClass1) null);
        }
    };
    private ThreadLocal<StrongReferenceCounter<RealmList>> onExtraCallbackWithResult = new ThreadLocal<StrongReferenceCounter<RealmList>>() { // from class: io.realm.rx.RealmObservableFactory.2
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public StrongReferenceCounter<RealmList> initialValue() {
            return new StrongReferenceCounter<>((AnonymousClass1) null);
        }
    };
    private ThreadLocal<StrongReferenceCounter<RealmModel>> onExtraCallback = new ThreadLocal<StrongReferenceCounter<RealmModel>>() { // from class: io.realm.rx.RealmObservableFactory.3
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public StrongReferenceCounter<RealmModel> initialValue() {
            return new StrongReferenceCounter<>((AnonymousClass1) null);
        }
    };

    public int hashCode() {
        return 37;
    }

    public RealmObservableFactory(boolean z) {
        this.onNavigationEvent = z;
    }

    @Override // io.realm.rx.RxObservableFactory
    public <E> JsonReaderUnknownNumberParsing<RealmResults<E>> onExtraCallback(Realm realm, RealmResults<E> realmResults) {
        if (realm.readTypedObject()) {
            return JsonReaderUnknownNumberParsing.onExtraCallback(realmResults);
        }
        RealmConfiguration realmConfigurationAccess100 = realm.access100();
        MapConverter mapConverterIAuthTabCallback = IAuthTabCallback();
        return JsonReaderUnknownNumberParsing.onExtraCallback((JsonReaderWithReader) new 6(this, realmResults, realmConfigurationAccess100), IAuthTabCallback).onExtraCallback(mapConverterIAuthTabCallback).onNavigationEvent(mapConverterIAuthTabCallback);
    }

    private MapConverter IAuthTabCallback() {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            throw new IllegalStateException("No looper found");
        }
        return NetConverter3.IAuthTabCallback(looperMyLooper);
    }

    @Override // io.realm.rx.RxObservableFactory
    public <E> JsonReaderUnknownNumberParsing<RealmResults<E>> onExtraCallback(access21400 access21400Var, RealmResults<E> realmResults) {
        if (access21400Var.readTypedObject()) {
            return JsonReaderUnknownNumberParsing.onExtraCallback(realmResults);
        }
        RealmConfiguration realmConfigurationAccess100 = access21400Var.access100();
        MapConverter mapConverterIAuthTabCallback = IAuthTabCallback();
        return JsonReaderUnknownNumberParsing.onExtraCallback((JsonReaderWithReader) new 8(this, realmResults, realmConfigurationAccess100), IAuthTabCallback).onExtraCallback(mapConverterIAuthTabCallback).onNavigationEvent(mapConverterIAuthTabCallback);
    }

    public boolean equals(Object obj) {
        return obj instanceof RealmObservableFactory;
    }
}
