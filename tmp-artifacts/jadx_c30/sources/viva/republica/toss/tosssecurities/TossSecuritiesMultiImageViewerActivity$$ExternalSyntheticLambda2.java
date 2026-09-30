package viva.republica.toss.tosssecurities;

import java.util.List;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class TossSecuritiesMultiImageViewerActivity$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ List f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ TossSecuritiesMultiImageViewerActivity f$2;

    public /* synthetic */ TossSecuritiesMultiImageViewerActivity$$ExternalSyntheticLambda2(List list, int i, TossSecuritiesMultiImageViewerActivity tossSecuritiesMultiImageViewerActivity) {
        this.f$0 = list;
        this.f$1 = i;
        this.f$2 = tossSecuritiesMultiImageViewerActivity;
    }

    public final Object invoke(Object obj, Object obj2) {
        return TossSecuritiesMultiImageViewerActivity.onExtraCallback(this.f$0, this.f$1, this.f$2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
    }
}
