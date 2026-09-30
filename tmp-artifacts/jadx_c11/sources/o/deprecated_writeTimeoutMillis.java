package o;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class deprecated_writeTimeoutMillis {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public static final boolean onWarmupCompleted(@NotNull deprecated_retryOnConnectionFailure deprecated_retryonconnectionfailure) {
        List listListOf;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 65;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(deprecated_retryonconnectionfailure, "");
            deprecated_retryOnConnectionFailure deprecated_retryonconnectionfailure2 = deprecated_retryOnConnectionFailure.TEXT;
            deprecated_retryOnConnectionFailure deprecated_retryonconnectionfailure3 = deprecated_retryOnConnectionFailure.IMAGE_WITH_TEXT;
            deprecated_retryOnConnectionFailure[] deprecated_retryonconnectionfailureArr = new deprecated_retryOnConnectionFailure[3];
            deprecated_retryonconnectionfailureArr[0] = deprecated_retryonconnectionfailure2;
            deprecated_retryonconnectionfailureArr[0] = deprecated_retryonconnectionfailure3;
            listListOf = CollectionsKt.listOf(deprecated_retryonconnectionfailureArr);
        } else {
            Intrinsics.checkNotNullParameter(deprecated_retryonconnectionfailure, "");
            listListOf = CollectionsKt.listOf(new deprecated_retryOnConnectionFailure[]{deprecated_retryOnConnectionFailure.TEXT, deprecated_retryOnConnectionFailure.IMAGE_WITH_TEXT});
        }
        boolean zContains = listListOf.contains(deprecated_retryonconnectionfailure);
        int i3 = onWarmupCompleted + 67;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 89 / 0;
        }
        return zContains;
    }

    public static final boolean onExtraCallback(@NotNull deprecated_retryOnConnectionFailure deprecated_retryonconnectionfailure) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 107;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(deprecated_retryonconnectionfailure, "");
        boolean zContains = CollectionsKt.listOf(new deprecated_retryOnConnectionFailure[]{deprecated_retryOnConnectionFailure.LINK, deprecated_retryOnConnectionFailure.IMAGE_WITH_LINK}).contains(deprecated_retryonconnectionfailure);
        int i4 = onNavigationEvent + 11;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return zContains;
        }
        throw null;
    }

    public static final boolean IAuthTabCallback(@NotNull deprecated_retryOnConnectionFailure deprecated_retryonconnectionfailure) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 49;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(deprecated_retryonconnectionfailure, "");
        boolean zContains = CollectionsKt.listOf(new deprecated_retryOnConnectionFailure[]{deprecated_retryOnConnectionFailure.IMAGE, deprecated_retryOnConnectionFailure.IMAGE_WITH_TEXT, deprecated_retryOnConnectionFailure.IMAGE_WITH_LINK}).contains(deprecated_retryonconnectionfailure);
        int i4 = onNavigationEvent + 115;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return zContains;
        }
        throw null;
    }
}
