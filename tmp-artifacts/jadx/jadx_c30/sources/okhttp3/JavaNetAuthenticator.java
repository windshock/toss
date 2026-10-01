package okhttp3;

import java.io.IOException;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class JavaNetAuthenticator implements Authenticator {
    public Request authenticate(@Nullable Route route, @NotNull Response response) throws IOException {
        Intrinsics.checkNotNullParameter(response, BuildConfig.FLAVOR);
        return Authenticator.JAVA_NET_AUTHENTICATOR.authenticate(route, response);
    }
}
