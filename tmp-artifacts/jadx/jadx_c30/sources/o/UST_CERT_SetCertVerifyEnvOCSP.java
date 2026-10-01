package o;

import com.google.firebase.messaging.RemoteMessage;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class UST_CERT_SetCertVerifyEnvOCSP {
    public final void onWarmupCompleted(@NotNull RemoteMessage remoteMessage) {
        Intrinsics.checkNotNullParameter(remoteMessage, BuildConfig.FLAVOR);
    }
}
