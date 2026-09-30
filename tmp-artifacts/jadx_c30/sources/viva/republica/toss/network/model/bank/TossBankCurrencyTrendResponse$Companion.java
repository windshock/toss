package viva.republica.toss.network.model.bank;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class TossBankCurrencyTrendResponse$Companion {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    public /* synthetic */ TossBankCurrencyTrendResponse$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private TossBankCurrencyTrendResponse$Companion() {
    }

    public final KSerializer<TossBankCurrencyTrendResponse> serializer() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 61;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        TossBankCurrencyTrendResponse$$serializer tossBankCurrencyTrendResponse$$serializer = TossBankCurrencyTrendResponse$$serializer.INSTANCE;
        if (i3 == 0) {
            return tossBankCurrencyTrendResponse$$serializer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
