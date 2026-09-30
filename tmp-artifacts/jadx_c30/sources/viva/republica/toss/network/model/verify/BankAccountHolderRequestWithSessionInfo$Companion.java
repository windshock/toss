package viva.republica.toss.network.model.verify;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class BankAccountHolderRequestWithSessionInfo$Companion {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public /* synthetic */ BankAccountHolderRequestWithSessionInfo$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private BankAccountHolderRequestWithSessionInfo$Companion() {
    }

    public final KSerializer<BankAccountHolderRequestWithSessionInfo> serializer() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 3;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            BankAccountHolderRequestWithSessionInfo$$serializer bankAccountHolderRequestWithSessionInfo$$serializer = BankAccountHolderRequestWithSessionInfo$$serializer.INSTANCE;
            throw null;
        }
        BankAccountHolderRequestWithSessionInfo$$serializer bankAccountHolderRequestWithSessionInfo$$serializer2 = BankAccountHolderRequestWithSessionInfo$$serializer.INSTANCE;
        int i3 = onNavigationEvent + 69;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return bankAccountHolderRequestWithSessionInfo$$serializer2;
    }
}
