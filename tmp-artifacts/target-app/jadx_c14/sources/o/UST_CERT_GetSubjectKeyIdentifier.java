package o;

import android.app.Application;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CERT_GetSubjectKeyIdentifier {
    public static final UST_CERT_GetSubjectKeyIdentifier onExtraCallback = new UST_CERT_GetSubjectKeyIdentifier();

    public final void onExtraCallbackWithResult(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "");
    }

    public final OkHttpClient.Builder onWarmupCompleted(@NotNull OkHttpClient.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "");
        return builder;
    }

    private UST_CERT_GetSubjectKeyIdentifier() {
    }

    public final List<Interceptor> IAuthTabCallback() {
        return CollectionsKt.emptyList();
    }
}
