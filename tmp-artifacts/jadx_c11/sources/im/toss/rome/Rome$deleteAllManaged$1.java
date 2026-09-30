package im.toss.rome;

import io.realm.Realm;
import io.realm.RealmModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class Rome$deleteAllManaged$1 implements Function1<Realm, Unit> {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    public static final Rome$deleteAllManaged$1 onWarmupCompleted = new Rome$deleteAllManaged$1();

    static {
        int i = onExtraCallbackWithResult + 71;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public /* synthetic */ Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 53;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback((Realm) obj);
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 95;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public final void IAuthTabCallback(Realm realm) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 43;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(realm, "");
        Intrinsics.reifiedOperationMarker(4, "T");
        realm.onExtraCallback(RealmModel.class).onWarmupCompleted().onWarmupCompleted();
        int i4 = onNavigationEvent + 97;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }
}
