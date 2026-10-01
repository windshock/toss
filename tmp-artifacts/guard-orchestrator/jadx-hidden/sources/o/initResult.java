package o;

import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class initResult {
    static int onWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(initResult.class);
    public static final initResult IAuthTabCallback = new initResult();

    static {
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3558);
    }

    private initResult() {
    }

    public final List<AppNode6> IAuthTabCallback(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1505);
        if ((((((~i2) & iOnWarmupCompleted) | ((~iOnWarmupCompleted) & i2)) >> 24) & 1) == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            ALCEyeBlink.onExtraCallback().fromJson(str, AppNode6[].class);
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Object objFromJson = ALCEyeBlink.onExtraCallback().fromJson(str, AppNode6[].class);
        Intrinsics.checkNotNullExpressionValue(objFromJson, "");
        List<AppNode6> list = ArraysKt.toList((Object[]) objFromJson);
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5837);
        return list;
    }
}
