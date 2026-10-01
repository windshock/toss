package o;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.logicDisuseCertRr;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface getLastDebugError extends logicDisuseCertRr {

    public static final class onWarmupCompleted {
        public static void onExtraCallback(@NotNull getLastDebugError getlastdebugerror, @NotNull pkcs12GetCertWithPFXEncPKCS8 pkcs12getcertwithpfxencpkcs8) {
            Intrinsics.checkNotNullParameter(pkcs12getcertwithpfxencpkcs8, "");
            logicDisuseCertRr.onWarmupCompleted.onWarmupCompleted(getlastdebugerror, pkcs12getcertwithpfxencpkcs8);
        }

        public static Object onExtraCallbackWithResult(@NotNull getLastDebugError getlastdebugerror, @NotNull logicVerifyCMSSignedData logicverifycmssigneddata, @NotNull access13800<? super Unit> access13800Var) {
            Object objOnWarmupCompleted = logicDisuseCertRr.onWarmupCompleted.onWarmupCompleted(getlastdebugerror, logicverifycmssigneddata, access13800Var);
            return objOnWarmupCompleted == access14100.onExtraCallback() ? objOnWarmupCompleted : Unit.INSTANCE;
        }
    }
}
