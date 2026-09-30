package viva.republica.toss.network.model.cardsales.funnel;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class CardIssueFinCertResultResp$Companion {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    public /* synthetic */ CardIssueFinCertResultResp$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CardIssueFinCertResultResp$Companion() {
    }

    public final KSerializer<CardIssueFinCertResultResp> serializer() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 89;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            CardIssueFinCertResultResp$$serializer cardIssueFinCertResultResp$$serializer = CardIssueFinCertResultResp$$serializer.INSTANCE;
            throw null;
        }
        CardIssueFinCertResultResp$$serializer cardIssueFinCertResultResp$$serializer2 = CardIssueFinCertResultResp$$serializer.INSTANCE;
        int i3 = IAuthTabCallback + 87;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return cardIssueFinCertResultResp$$serializer2;
    }
}
