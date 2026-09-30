package im.toss.rome;

import io.realm.Realm;
import io.realm.RealmModel;
import io.realm.RealmQuery;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class Rome$deleteManaged$1 implements Function1<Realm, Unit> {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    final /* synthetic */ Function1<RealmQuery<T>, Unit> onExtraCallbackWithResult;

    public /* synthetic */ Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 123;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult((Realm) obj);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 9;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public final void onExtraCallbackWithResult(Realm realm) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 25;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(realm, "");
        } else {
            Intrinsics.checkNotNullParameter(realm, "");
            i = 4;
        }
        Intrinsics.reifiedOperationMarker(i, "T");
        RealmQuery realmQueryOnExtraCallback = realm.onExtraCallback(RealmModel.class);
        Intrinsics.checkNotNullExpressionValue(realmQueryOnExtraCallback, "");
        this.onExtraCallbackWithResult.invoke(realmQueryOnExtraCallback);
        realmQueryOnExtraCallback.onWarmupCompleted().onWarmupCompleted();
    }
}
