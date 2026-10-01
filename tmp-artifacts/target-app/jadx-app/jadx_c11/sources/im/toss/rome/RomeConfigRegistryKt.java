package im.toss.rome;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class RomeConfigRegistryKt {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    public static final Realm onWarmupCompleted(@NotNull RealmConfiguration realmConfiguration) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 123;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(realmConfiguration, "");
            Intrinsics.checkNotNullExpressionValue(Realm.onNavigationEvent(realmConfiguration), "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(realmConfiguration, "");
        Realm realmOnNavigationEvent = Realm.onNavigationEvent(realmConfiguration);
        Intrinsics.checkNotNullExpressionValue(realmOnNavigationEvent, "");
        int i3 = onWarmupCompleted + 53;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return realmOnNavigationEvent;
    }
}
