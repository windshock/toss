package o;

import im.toss.network.model.BaseApiResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class withAdListener extends getIconPaddingRight<BaseApiResponse<?>> {
    public static final withAdListener onNavigationEvent = new withAdListener();

    /* JADX WARN: Illegal instructions before constructor call */
    private withAdListener() {
        getTimestampBytes gettimestampbytesIAuthTabCallback = getTimestampBytes.IAuthTabCallback();
        Intrinsics.checkNotNullExpressionValue(gettimestampbytesIAuthTabCallback, "");
        super("tossApiResponseBus", gettimestampbytesIAuthTabCallback);
    }
}
