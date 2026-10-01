package o;

import im.toss.components.tuba.variable.v1.model.CdnVars;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RequestDelegate implements ImageRequests_androidKtExternalSyntheticLambda2 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private final zzad IAuthTabCallback;
    private final RequestService_androidKt onWarmupCompleted;

    @Inject
    public RequestDelegate(@NotNull RequestService_androidKt requestService_androidKt, @NotNull zzad zzadVar) {
        Intrinsics.checkNotNullParameter(requestService_androidKt, "");
        Intrinsics.checkNotNullParameter(zzadVar, "");
        this.onWarmupCompleted = requestService_androidKt;
        this.IAuthTabCallback = zzadVar;
    }

    @Override // o.ImageRequests_androidKtExternalSyntheticLambda2
    public Object onNavigationEvent(@Nullable String str, @NotNull access13800<? super CdnVars> access13800Var) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 63;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object objOnNavigationEvent = this.onWarmupCompleted.onNavigationEvent(str, access13800Var);
        int i4 = onNavigationEvent + 7;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return objOnNavigationEvent;
    }
}
