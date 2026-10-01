package im.toss.rome;

import io.realm.Realm;
import io.realm.RealmModel;
import io.realm.RealmQuery;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class Rome$delete$1 implements Function1<Realm, Unit> {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    final /* synthetic */ Function1<RealmQuery<T>, Unit> onNavigationEvent;

    public /* synthetic */ Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 115;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult((Realm) obj);
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            throw null;
        }
        int i4 = onExtraCallbackWithResult + 11;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public final void onExtraCallbackWithResult(Realm realm) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 13;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(realm, "");
        Intrinsics.reifiedOperationMarker(4, "T");
        RealmQuery realmQueryOnExtraCallback = realm.onExtraCallback(RealmModel.class);
        Intrinsics.checkNotNullExpressionValue(realmQueryOnExtraCallback, "");
        this.onNavigationEvent.invoke(realmQueryOnExtraCallback);
        realmQueryOnExtraCallback.onWarmupCompleted().onWarmupCompleted();
        int i4 = onExtraCallback + 47;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }
}
