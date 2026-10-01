package viva.republica.toss.network.model.loan;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class RefinancingScheduleResponse$Companion {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    public /* synthetic */ RefinancingScheduleResponse$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private RefinancingScheduleResponse$Companion() {
    }

    public final KSerializer<RefinancingScheduleResponse> serializer() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 79;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        RefinancingScheduleResponse$$serializer refinancingScheduleResponse$$serializer = RefinancingScheduleResponse$$serializer.INSTANCE;
        int i4 = onExtraCallbackWithResult + 63;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return refinancingScheduleResponse$$serializer;
    }
}
