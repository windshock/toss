package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getAssetInfo extends RetrofitService {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    @Override // o.AssetInfoResponseBody
    public boolean onExtraCallbackWithResult(@NotNull aq aqVar) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 99;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(aqVar, "");
        int i4 = onExtraCallbackWithResult + 115;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public getAssetInfo() {
        super(null);
    }
}
