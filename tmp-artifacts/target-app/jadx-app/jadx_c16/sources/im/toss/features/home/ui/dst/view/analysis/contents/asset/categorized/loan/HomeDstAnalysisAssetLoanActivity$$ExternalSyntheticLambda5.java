package im.toss.features.home.ui.dst.view.analysis.contents.asset.categorized.loan;

import android.os.Bundle;
import im.toss.base.BaseFragment;
import io.opentelemetry.exporter.otlp.logs.OtlpGrpcLogRecordExporterBuilder$;
import kotlin.jvm.functions.Function2;
import o.FlowMeasureLazyPolicyExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeDstAnalysisAssetLoanActivity$$ExternalSyntheticLambda5 implements Function2 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        BaseFragment baseFragment = (BaseFragment) HomeDstAnalysisAssetLoanActivity.onNavigationEvent(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1369304912, -1369304911, iOnWarmupCompleted2, new Object[]{(FlowMeasureLazyPolicyExternalSyntheticLambda3) obj, (Bundle) obj2}, iOnWarmupCompleted, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
        int i4 = onNavigationEvent + 101;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return baseFragment;
    }
}
