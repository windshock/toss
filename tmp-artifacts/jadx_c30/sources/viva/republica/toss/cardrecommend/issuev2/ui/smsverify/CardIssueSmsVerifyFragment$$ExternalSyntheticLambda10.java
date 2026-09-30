package viva.republica.toss.cardrecommend.issuev2.ui.smsverify;

import io.opentelemetry.exporter.otlp.logs.OtlpGrpcLogRecordExporterBuilder$;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.setNativeOption;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class CardIssueSmsVerifyFragment$$ExternalSyntheticLambda10 implements Function1 {
    public final /* synthetic */ CardIssueSmsVerifyFragment f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ CardIssueSmsVerifyFragment$$ExternalSyntheticLambda10(CardIssueSmsVerifyFragment cardIssueSmsVerifyFragment, Function1 function1) {
        this.f$0 = cardIssueSmsVerifyFragment;
        this.f$1 = function1;
    }

    public final Object invoke(Object obj) {
        Object[] objArr = {this.f$0, this.f$1, (setNativeOption) obj};
        int iOnWarmupCompleted = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        return (Unit) CardIssueSmsVerifyFragment.IAuthTabCallback(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 688251517, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -688251516, iOnWarmupCompleted, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), objArr);
    }
}
