package viva.republica.toss.network.model.bank;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class TossBankCurrencyDetailResponse$Companion {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    public /* synthetic */ TossBankCurrencyDetailResponse$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private TossBankCurrencyDetailResponse$Companion() {
    }

    public final KSerializer<TossBankCurrencyDetailResponse> serializer() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 65;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        TossBankCurrencyDetailResponse$$serializer tossBankCurrencyDetailResponse$$serializer = TossBankCurrencyDetailResponse$$serializer.INSTANCE;
        if (i3 != 0) {
            return tossBankCurrencyDetailResponse$$serializer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
