package o;

import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class CheckRequestBodyModelGroupType {
    private static final djExternalSyntheticApiModelOutline0 onWarmupCompleted = new djExternalSyntheticApiModelOutline0("REMOVED_TASK");
    private static final djExternalSyntheticApiModelOutline0 onExtraCallback = new djExternalSyntheticApiModelOutline0("CLOSED_EMPTY");

    public static final long onWarmupCompleted(long j) {
        if (j <= 0) {
            return 0L;
        }
        return j >= 9223372036854L ? LongCompanionObject.MAX_VALUE : j * 1000000;
    }

    public static final long onExtraCallback(long j) {
        return j / 1000000;
    }
}
