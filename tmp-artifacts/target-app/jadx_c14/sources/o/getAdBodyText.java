package o;

import io.opentelemetry.exporter.otlp.logs.OtlpGrpcLogRecordExporterBuilder$;
import viva.republica.toss.network.impl.di.NetworkApiModule;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getAdBodyText implements captureStartValues<InterstitialAdListener> {
    private final createAnimators<g1> onNavigationEvent;

    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public InterstitialAdListener get() {
        return onNavigationEvent((g1) this.onNavigationEvent.get());
    }

    public static InterstitialAdListener onNavigationEvent(g1 g1Var) {
        Object[] objArr = {NetworkApiModule.onExtraCallback, g1Var};
        int iOnWarmupCompleted = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        return (InterstitialAdListener) createAnimator.onNavigationEvent((InterstitialAdListener) NetworkApiModule.onExtraCallback(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), objArr, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted2, -558603639, iOnWarmupCompleted, 558603643));
    }
}
