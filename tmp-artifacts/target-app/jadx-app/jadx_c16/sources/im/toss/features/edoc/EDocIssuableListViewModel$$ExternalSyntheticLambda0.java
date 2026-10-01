package im.toss.features.edoc;

import java.util.List;
import kotlin.jvm.functions.Function1;
import o.getAllSubFiles;
import viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuableListForPrintResp;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class EDocIssuableListViewModel$$ExternalSyntheticLambda0 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 59;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        List listOnExtraCallbackWithResult = getAllSubFiles.onExtraCallbackWithResult((EDocIssuableListForPrintResp) obj);
        int i4 = onExtraCallbackWithResult + 77;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return listOnExtraCallbackWithResult;
    }
}
