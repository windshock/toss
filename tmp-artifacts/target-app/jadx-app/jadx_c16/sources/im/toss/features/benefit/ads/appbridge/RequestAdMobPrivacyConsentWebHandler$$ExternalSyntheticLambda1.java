package im.toss.features.benefit.ads.appbridge;

import io.opentelemetry.exporter.otlp.logs.OtlpGrpcLogRecordExporterBuilder$;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;
import o.setFillAlpha;
import o.setStrokeAlpha;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class RequestAdMobPrivacyConsentWebHandler$$ExternalSyntheticLambda1 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ setFillAlpha f$1;
    public final /* synthetic */ String f$2;
    public final /* synthetic */ setStrokeAlpha f$3;

    public /* synthetic */ RequestAdMobPrivacyConsentWebHandler$$ExternalSyntheticLambda1(String str, setFillAlpha setfillalpha, String str2, setStrokeAlpha setstrokealpha) {
        this.f$0 = str;
        this.f$1 = setfillalpha;
        this.f$2 = str2;
        this.f$3 = setstrokealpha;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr = {this.f$0, this.f$1, this.f$2, this.f$3, (SetDetectableSize) obj};
            int iOnWarmupCompleted = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
            int iOnWarmupCompleted2 = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Object[] objArr2 = {this.f$0, this.f$1, this.f$2, this.f$3, (SetDetectableSize) obj};
        int iOnWarmupCompleted3 = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted4 = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        Unit unit = (Unit) RequestAdMobPrivacyConsentWebHandler.IAuthTabCallback(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -1291644078, iOnWarmupCompleted3, objArr2, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1291644078, iOnWarmupCompleted4);
        int i3 = onNavigationEvent + 49;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 54 / 0;
        }
        return unit;
    }
}
