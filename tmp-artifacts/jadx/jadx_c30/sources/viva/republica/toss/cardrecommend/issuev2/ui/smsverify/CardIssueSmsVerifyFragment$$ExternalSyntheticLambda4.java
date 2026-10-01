package viva.republica.toss.cardrecommend.issuev2.ui.smsverify;

import io.opentelemetry.exporter.otlp.logs.OtlpGrpcLogRecordExporterBuilder$;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.NativeComponentTagApi;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class CardIssueSmsVerifyFragment$$ExternalSyntheticLambda4 implements Function1 {
    public final /* synthetic */ CardIssueSmsVerifyFragment f$0;
    public final /* synthetic */ boolean f$1;

    public /* synthetic */ CardIssueSmsVerifyFragment$$ExternalSyntheticLambda4(CardIssueSmsVerifyFragment cardIssueSmsVerifyFragment, boolean z) {
        this.f$0 = cardIssueSmsVerifyFragment;
        this.f$1 = z;
    }

    public final Object invoke(Object obj) {
        CardIssueSmsVerifyFragment cardIssueSmsVerifyFragment = this.f$0;
        Boolean boolValueOf = Boolean.valueOf(this.f$1);
        int iOnWarmupCompleted = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        return (Unit) CardIssueSmsVerifyFragment.IAuthTabCallback(iOnWarmupCompleted2, -1356237882, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1356237884, iOnWarmupCompleted, iOnWarmupCompleted3, new Object[]{cardIssueSmsVerifyFragment, boolValueOf, (NativeComponentTagApi) obj});
    }
}
