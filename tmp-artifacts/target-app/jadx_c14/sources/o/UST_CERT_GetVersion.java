package o;

import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.UST_CMP_IssueCertificate;

@Singleton
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CERT_GetVersion implements reportDartError721849be {
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);

    @Inject
    public UST_CERT_GetVersion() {
    }

    public void onWarmupCompleted() {
        UST_CMP_IssueCertificate.onNavigationEvent(false, UST_CMP_IssueCertificate.onExtraCallback.SECURITY, "mtls-cert-error", null, 5, 9, null);
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }
}
