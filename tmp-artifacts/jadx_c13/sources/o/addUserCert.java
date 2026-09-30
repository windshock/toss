package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class addUserCert extends Converter.Factory {
    private final getCertListCrossCert IAuthTabCallback;
    private final MediaType onNavigationEvent;

    public addUserCert(@NotNull MediaType mediaType, @NotNull getCertListCrossCert getcertlistcrosscert) {
        Intrinsics.checkNotNullParameter(mediaType, "");
        Intrinsics.checkNotNullParameter(getcertlistcrosscert, "");
        this.onNavigationEvent = mediaType;
        this.IAuthTabCallback = getcertlistcrosscert;
    }

    @Override // retrofit2.Converter.Factory
    public Converter<ResponseBody, ?> responseBodyConverter(@NotNull Type type, @NotNull Annotation[] annotationArr, @NotNull Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(type, "");
        Intrinsics.checkNotNullParameter(annotationArr, "");
        Intrinsics.checkNotNullParameter(retrofit, "");
        return new getKey1(this.IAuthTabCallback.onNavigationEvent(type), this.IAuthTabCallback);
    }

    @Override // retrofit2.Converter.Factory
    public Converter<?, RequestBody> requestBodyConverter(@NotNull Type type, @NotNull Annotation[] annotationArr, @NotNull Annotation[] annotationArr2, @NotNull Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(type, "");
        Intrinsics.checkNotNullParameter(annotationArr, "");
        Intrinsics.checkNotNullParameter(annotationArr2, "");
        Intrinsics.checkNotNullParameter(retrofit, "");
        return new addUserCertRecovery(this.onNavigationEvent, this.IAuthTabCallback.onNavigationEvent(type), this.IAuthTabCallback);
    }
}
