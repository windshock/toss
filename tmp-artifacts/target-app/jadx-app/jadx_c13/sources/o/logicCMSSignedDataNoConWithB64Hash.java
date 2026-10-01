package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class logicCMSSignedDataNoConWithB64Hash {
    public static final InterfaceC0051getSignPrikey onWarmupCompleted(@NotNull Function1<? super logicCMSSignedData, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        logicCMSSignedDataNoConWithSign logiccmssigneddatanoconwithsign = new logicCMSSignedDataNoConWithSign(false, false, false, false, null, 31, null);
        function1.invoke(logiccmssigneddatanoconwithsign);
        return logicCMSSignedDataNoConWithSign.IAuthTabCallback(logiccmssigneddatanoconwithsign, false, false, false, false, null, 31, null);
    }
}
