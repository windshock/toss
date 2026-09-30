package o;

import kotlin.jvm.internal.Intrinsics;
import o.getCertListCrossCert;
import okhttp3.MediaType;
import org.jetbrains.annotations.NotNull;
import retrofit2.Converter;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class addCACert {
    public static final Converter.Factory onExtraCallback(@NotNull row rowVar, @NotNull MediaType mediaType) {
        Intrinsics.checkNotNullParameter(rowVar, "");
        Intrinsics.checkNotNullParameter(mediaType, "");
        return new addUserCert(mediaType, new getCertListCrossCert.onWarmupCompleted(rowVar));
    }
}
