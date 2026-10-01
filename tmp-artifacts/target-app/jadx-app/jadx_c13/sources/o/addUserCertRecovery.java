package o;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.Converter;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class addUserCertRecovery<T> implements Converter<T, RequestBody> {
    private final MediaType onExtraCallback;
    private final getCertListCrossCert onExtraCallbackWithResult;
    private final py<T> onNavigationEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public addUserCertRecovery(@NotNull MediaType mediaType, @NotNull py<? super T> pyVar, @NotNull getCertListCrossCert getcertlistcrosscert) {
        Intrinsics.checkNotNullParameter(mediaType, "");
        Intrinsics.checkNotNullParameter(pyVar, "");
        Intrinsics.checkNotNullParameter(getcertlistcrosscert, "");
        this.onExtraCallback = mediaType;
        this.onNavigationEvent = pyVar;
        this.onExtraCallbackWithResult = getcertlistcrosscert;
    }

    @Override // retrofit2.Converter
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public RequestBody convert(T t) {
        return this.onExtraCallbackWithResult.onExtraCallbackWithResult(this.onExtraCallback, this.onNavigationEvent, t);
    }
}
