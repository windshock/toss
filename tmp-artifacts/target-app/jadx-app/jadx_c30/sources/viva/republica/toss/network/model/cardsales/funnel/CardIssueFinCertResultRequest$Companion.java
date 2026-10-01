package viva.republica.toss.network.model.cardsales.funnel;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class CardIssueFinCertResultRequest$Companion {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;

    public /* synthetic */ CardIssueFinCertResultRequest$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CardIssueFinCertResultRequest$Companion() {
    }

    public final KSerializer<CardIssueFinCertResultRequest> serializer() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            CardIssueFinCertResultRequest$$serializer cardIssueFinCertResultRequest$$serializer = CardIssueFinCertResultRequest$$serializer.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        CardIssueFinCertResultRequest$$serializer cardIssueFinCertResultRequest$$serializer2 = CardIssueFinCertResultRequest$$serializer.INSTANCE;
        int i3 = onWarmupCompleted + 85;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return cardIssueFinCertResultRequest$$serializer2;
    }
}
