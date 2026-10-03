package o;

import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getIssuerAndSerialNumber {
    private static final boolean IAuthTabCallback = false;
    public static final getIssuerAndSerialNumber onNavigationEvent = new getIssuerAndSerialNumber();
    private static final Map<UST_CMP_IssueCertificate_SendConf, String> onWarmupCompleted = access8100.IAuthTabCallback(new Pair[]{getWrite.IAuthTabCallback(UST_CMP_IssueCertificate_SendConf.BANK, "undefined"), getWrite.IAuthTabCallback(UST_CMP_IssueCertificate_SendConf.CARD, "undefined")});

    private getIssuerAndSerialNumber() {
    }

    public final boolean onNavigationEvent(@NotNull UST_CMP_IssueCertificate_SendConf uST_CMP_IssueCertificate_SendConf) {
        Intrinsics.checkNotNullParameter(uST_CMP_IssueCertificate_SendConf, "");
        return !Intrinsics.areEqual(onWarmupCompleted(uST_CMP_IssueCertificate_SendConf), "undefined");
    }

    public final String onWarmupCompleted(@NotNull UST_CMP_IssueCertificate_SendConf uST_CMP_IssueCertificate_SendConf) {
        Intrinsics.checkNotNullParameter(uST_CMP_IssueCertificate_SendConf, "");
        String str = onWarmupCompleted.get(uST_CMP_IssueCertificate_SendConf);
        return str == null ? "undefined" : str;
    }

    public final void onWarmupCompleted(@NotNull UST_CMP_IssueCertificate_SendConf uST_CMP_IssueCertificate_SendConf, @NotNull String str) {
        Intrinsics.checkNotNullParameter(uST_CMP_IssueCertificate_SendConf, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (IAuthTabCallback) {
            Objects.toString(uST_CMP_IssueCertificate_SendConf);
        }
        onWarmupCompleted.put(uST_CMP_IssueCertificate_SendConf, str);
    }

    public final void onExtraCallback(@NotNull UST_CMP_IssueCertificate_SendConf uST_CMP_IssueCertificate_SendConf) {
        Intrinsics.checkNotNullParameter(uST_CMP_IssueCertificate_SendConf, "");
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        onWarmupCompleted(uST_CMP_IssueCertificate_SendConf, string);
    }
}
