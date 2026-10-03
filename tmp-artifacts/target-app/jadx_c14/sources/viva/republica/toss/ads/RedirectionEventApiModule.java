package viva.republica.toss.ads;

import javax.inject.Singleton;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.g1;
import o.zzad;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RedirectionEventApiModule {
    public static final RedirectionEventApiModule onExtraCallback = new RedirectionEventApiModule();

    private RedirectionEventApiModule() {
    }

    @Singleton
    public final RedirectionEventApi IAuthTabCallback(@NotNull g1 g1Var, @NotNull zzad zzadVar) {
        Intrinsics.checkNotNullParameter(g1Var, "");
        Intrinsics.checkNotNullParameter(zzadVar, "");
        return (RedirectionEventApi) g1.onExtraCallback(g1Var, RedirectionEventApi.class, zzadVar.IAuthTabCallbackStub(), (Long) null, (Long) null, (Function1) null, 28, (Object) null);
    }
}
