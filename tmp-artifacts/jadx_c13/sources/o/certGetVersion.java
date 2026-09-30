package o;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import o.certGetPublicKeyAlgorithm;
import org.jetbrains.annotations.NotNull;
import ru.nsk.kstatemachine.persistence.Record;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class certGetVersion {
    private final logicDisuseCertRr IAuthTabCallback;
    private final List<Record> onExtraCallback;
    private final logicCMSEnvelopedData onExtraCallbackWithResult;

    public certGetVersion(@NotNull logicDisuseCertRr logicdisusecertrr, @NotNull logicCMSEnvelopedData logiccmsenvelopeddata) {
        Intrinsics.checkNotNullParameter(logicdisusecertrr, "");
        Intrinsics.checkNotNullParameter(logiccmsenvelopeddata, "");
        this.IAuthTabCallback = logicdisusecertrr;
        this.onExtraCallbackWithResult = logiccmsenvelopeddata;
        this.onExtraCallback = new ArrayList();
    }

    public final void onExtraCallbackWithResult(@NotNull logicIssueCertMakePOPOSigningInputMsg<?> logicissuecertmakepoposigninginputmsg, @NotNull logicChangeCertPW logicchangecertpw) {
        logicIssueCertMakePOPOSigningInputMsg<?> logicissuecertmakepoposigninginputmsgIAuthTabCallback;
        Intrinsics.checkNotNullParameter(logicissuecertmakepoposigninginputmsg, "");
        Intrinsics.checkNotNullParameter(logicchangecertpw, "");
        Record record = (Record) CollectionsKt___CollectionsKt.lastOrNull((List) this.onExtraCallback);
        certGetOCSPAddress certgetocspaddressOnWarmupCompleted = (record == null || (logicissuecertmakepoposigninginputmsgIAuthTabCallback = record.IAuthTabCallback()) == null) ? null : logicissuecertmakepoposigninginputmsgIAuthTabCallback.onWarmupCompleted();
        certGetPublicKeyAlgorithm certgetpublickeyalgorithm = certgetocspaddressOnWarmupCompleted instanceof certGetPublicKeyAlgorithm ? (certGetPublicKeyAlgorithm) certgetocspaddressOnWarmupCompleted : null;
        certGetPublicKeyAlgorithm.onExtraCallbackWithResult onextracallbackwithresultOnExtraCallback = certgetpublickeyalgorithm != null ? certgetpublickeyalgorithm.onExtraCallback() : null;
        if (onextracallbackwithresultOnExtraCallback instanceof certGetPublicKeyAlgorithm.onExtraCallbackWithResult.C0025onExtraCallbackWithResult) {
            throw new IllegalStateException(("Internal error, onProcessEvent called after " + Reflection.getOrCreateKotlinClass(certGetIssuerDN.class).getSimpleName() + " processing, which is considered as last possible event").toString());
        }
        if (this.onExtraCallbackWithResult.IAuthTabCallback() && logicchangecertpw == logicChangeCertPW.IGNORED) {
            return;
        }
        if (this.onExtraCallbackWithResult.onExtraCallbackWithResult() && Intrinsics.areEqual(onextracallbackwithresultOnExtraCallback, certGetPublicKeyAlgorithm.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted)) {
            this.onExtraCallback.clear();
        }
        logicIssueCertMakePOPOSigningInputMsg logicissuecertmakepoposigninginputmsgOnWarmupCompleted = certPkcs8Prikey.onWarmupCompleted(logicissuecertmakepoposigninginputmsg);
        if (logicissuecertmakepoposigninginputmsgOnWarmupCompleted != null) {
            this.onExtraCallback.add(new Record(logicissuecertmakepoposigninginputmsgOnWarmupCompleted, logicchangecertpw));
        }
    }
}
