package o;

import java.lang.reflect.Type;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class getCertListCrossCert {
    public /* synthetic */ getCertListCrossCert(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    protected abstract nq onExtraCallback();

    public abstract <T> RequestBody onExtraCallbackWithResult(@NotNull MediaType mediaType, @NotNull py<? super T> pyVar, T t);

    public abstract <T> T onWarmupCompleted(@NotNull jp<? extends T> jpVar, @NotNull ResponseBody responseBody);

    private getCertListCrossCert() {
    }

    public final KSerializer<Object> onNavigationEvent(@NotNull Type type) {
        Intrinsics.checkNotNullParameter(type, "");
        return nzi.IAuthTabCallback(onExtraCallback().onExtraCallback(), type);
    }

    public static final class onWarmupCompleted extends getCertListCrossCert {
        private final row onExtraCallbackWithResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onWarmupCompleted(@NotNull row rowVar) {
            super(null);
            Intrinsics.checkNotNullParameter(rowVar, "");
            this.onExtraCallbackWithResult = rowVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // o.getCertListCrossCert
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public row onExtraCallback() {
            return this.onExtraCallbackWithResult;
        }

        @Override // o.getCertListCrossCert
        public <T> T onWarmupCompleted(@NotNull jp<? extends T> jpVar, @NotNull ResponseBody responseBody) throws Throwable {
            Intrinsics.checkNotNullParameter(jpVar, "");
            Intrinsics.checkNotNullParameter(responseBody, "");
            return (T) onExtraCallback().onExtraCallback(jpVar, responseBody.string());
        }

        @Override // o.getCertListCrossCert
        public <T> RequestBody onExtraCallbackWithResult(@NotNull MediaType mediaType, @NotNull py<? super T> pyVar, T t) {
            Intrinsics.checkNotNullParameter(mediaType, "");
            Intrinsics.checkNotNullParameter(pyVar, "");
            return RequestBody.Companion.create(onExtraCallback().onWarmupCompleted(pyVar, t), mediaType);
        }
    }
}
