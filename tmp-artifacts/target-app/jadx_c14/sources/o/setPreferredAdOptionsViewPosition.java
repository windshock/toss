package o;

import io.opentelemetry.exporter.otlp.logs.OtlpGrpcLogRecordExporterBuilder$;
import viva.republica.toss.network.api.TossDomainLogApi;
import viva.republica.toss.network.impl.di.NetworkApiModule;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class setPreferredAdOptionsViewPosition implements captureStartValues<TossDomainLogApi> {
    private final createAnimators<g1> onNavigationEvent;

    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public TossDomainLogApi get() {
        return onNavigationEvent((g1) this.onNavigationEvent.get());
    }

    public static TossDomainLogApi onNavigationEvent(g1 g1Var) {
        Object[] objArr = {NetworkApiModule.onExtraCallback, g1Var};
        int iOnWarmupCompleted = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        return (TossDomainLogApi) createAnimator.onNavigationEvent((TossDomainLogApi) NetworkApiModule.onExtraCallback(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), objArr, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted2, -1509378785, iOnWarmupCompleted, 1509378785));
    }
}
