package o;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.Converter;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getKey1<T> implements Converter<ResponseBody, T> {
    private final getCertListCrossCert onExtraCallback;
    private final jp<T> onWarmupCompleted;

    /* JADX WARN: Multi-variable type inference failed */
    public getKey1(@NotNull jp<? extends T> jpVar, @NotNull getCertListCrossCert getcertlistcrosscert) {
        Intrinsics.checkNotNullParameter(jpVar, "");
        Intrinsics.checkNotNullParameter(getcertlistcrosscert, "");
        this.onWarmupCompleted = jpVar;
        this.onExtraCallback = getcertlistcrosscert;
    }

    @Override // retrofit2.Converter
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public T convert(@NotNull ResponseBody responseBody) {
        Intrinsics.checkNotNullParameter(responseBody, "");
        return (T) this.onExtraCallback.onWarmupCompleted(this.onWarmupCompleted, responseBody);
    }
}
