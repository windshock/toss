package viva.republica.toss.network.model.loan;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class BizRefinancePreScreenRequest$Companion {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    public /* synthetic */ BizRefinancePreScreenRequest$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private BizRefinancePreScreenRequest$Companion() {
    }

    public final KSerializer<BizRefinancePreScreenRequest> serializer() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 63;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        BizRefinancePreScreenRequest$$serializer bizRefinancePreScreenRequest$$serializer = BizRefinancePreScreenRequest$$serializer.INSTANCE;
        int i4 = onNavigationEvent + 47;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return bizRefinancePreScreenRequest$$serializer;
    }
}
