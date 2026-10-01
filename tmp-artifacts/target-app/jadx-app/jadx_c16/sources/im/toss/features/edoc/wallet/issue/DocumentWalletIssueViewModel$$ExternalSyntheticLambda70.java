package im.toss.features.edoc.wallet.issue;

import im.toss.features.edoc.wallet.issue.DocumentWalletContinuousBottomSheet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import o.FileBridgeExtension3;
import o.emitGraniteBrownfieldModule_onVisibilityChanged;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class DocumentWalletIssueViewModel$$ExternalSyntheticLambda70 implements Function2 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ emitGraniteBrownfieldModule_onVisibilityChanged f$0;
    public final /* synthetic */ Map f$1;

    public /* synthetic */ DocumentWalletIssueViewModel$$ExternalSyntheticLambda70(emitGraniteBrownfieldModule_onVisibilityChanged emitgranitebrownfieldmodule_onvisibilitychanged, Map map) {
        this.f$0 = emitgranitebrownfieldmodule_onvisibilitychanged;
        this.f$1 = map;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 51;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        DocumentWalletContinuousBottomSheet.onExtraCallback onextracallbackOnWarmupCompleted = FileBridgeExtension3.onWarmupCompleted(this.f$0, this.f$1, ((Integer) obj).intValue(), (List) obj2);
        int i4 = onExtraCallback + 119;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return onextracallbackOnWarmupCompleted;
    }
}
