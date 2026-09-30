package o;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class encryptForHidingPrivateKeyWithPin implements getAppCertList {
    @Override // o.getAppCertList
    public getCertV3ExpirationDate onWarmupCompleted(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
        return new getCertV2PEM(view);
    }
}
