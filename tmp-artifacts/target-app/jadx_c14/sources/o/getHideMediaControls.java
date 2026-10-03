package o;

import io.opentelemetry.exporter.otlp.logs.OtlpGrpcLogRecordExporterBuilder$;
import viva.republica.toss.network.api.TossLogApi;
import viva.republica.toss.network.impl.di.NetworkApiModule;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getHideMediaControls implements captureStartValues<TossLogApi> {
    private final createAnimators<g1> onExtraCallback;
    private final createAnimators<ea> onWarmupCompleted;

    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public TossLogApi get() {
        return onWarmupCompleted((g1) this.onExtraCallback.get(), (ea) this.onWarmupCompleted.get());
    }

    public static TossLogApi onWarmupCompleted(g1 g1Var, ea eaVar) {
        Object[] objArr = {NetworkApiModule.onExtraCallback, g1Var, eaVar};
        int iOnWarmupCompleted = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        return (TossLogApi) createAnimator.onNavigationEvent((TossLogApi) NetworkApiModule.onExtraCallback(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), objArr, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted2, -1489873829, iOnWarmupCompleted, 1489873831));
    }
}
