package viva.republica.toss.network.model.cardsales.funnel;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class CheckOcrResultReq$Companion {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;

    public /* synthetic */ CheckOcrResultReq$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CheckOcrResultReq$Companion() {
    }

    public final KSerializer<CheckOcrResultReq> serializer() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 65;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            CheckOcrResultReq$$serializer checkOcrResultReq$$serializer = CheckOcrResultReq$$serializer.INSTANCE;
            throw null;
        }
        CheckOcrResultReq$$serializer checkOcrResultReq$$serializer2 = CheckOcrResultReq$$serializer.INSTANCE;
        int i3 = onExtraCallback + 89;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return checkOcrResultReq$$serializer2;
        }
        throw null;
    }
}
