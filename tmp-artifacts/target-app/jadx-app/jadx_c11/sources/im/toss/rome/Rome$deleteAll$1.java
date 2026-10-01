package im.toss.rome;

import io.realm.Realm;
import io.realm.RealmModel;
import io.realm.RealmQuery;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class Rome$deleteAll$1 implements Function1<Realm, Unit> {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    public static final Rome$deleteAll$1 onNavigationEvent = new Rome$deleteAll$1();
    private static int onWarmupCompleted = 1;

    static {
        int i = onExtraCallback + 105;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 25;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted((Realm) obj);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 107;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final void onWarmupCompleted(Realm realm) {
        RealmQuery realmQueryOnExtraCallback;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 105;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(realm, "");
            Intrinsics.reifiedOperationMarker(5, "T");
            realmQueryOnExtraCallback = realm.onExtraCallback(RealmModel.class);
        } else {
            Intrinsics.checkNotNullParameter(realm, "");
            Intrinsics.reifiedOperationMarker(4, "T");
            realmQueryOnExtraCallback = realm.onExtraCallback(RealmModel.class);
        }
        realmQueryOnExtraCallback.onWarmupCompleted().onWarmupCompleted();
        int i3 = onWarmupCompleted + 67;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }
}
