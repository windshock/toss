package o;

import java.io.InputStream;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal._UtilCommonKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class sha1Hash implements RgbCompanionExternalSyntheticLambda2 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    private final Lazy onNavigationEvent;

    public sha1Hash(@NotNull Function0<? extends okhttp3.OkHttpClient> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.onNavigationEvent = LazyKt.onExtraCallbackWithResult(function0);
    }

    private final okhttp3.OkHttpClient onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        okhttp3.OkHttpClient okHttpClient = (okhttp3.OkHttpClient) this.onNavigationEvent.getValue();
        int i4 = onExtraCallback + 119;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return okHttpClient;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public RgbCompanionExternalSyntheticLambda0 onExtraCallback(@NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(str, onWarmupCompleted().newCall(new Request.Builder().url(str).build()).execute());
        int i2 = onWarmupCompleted + 9;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return iAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class IAuthTabCallback implements RgbCompanionExternalSyntheticLambda0 {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        private final Response onExtraCallbackWithResult;
        private final String onNavigationEvent;

        public IAuthTabCallback(@NotNull String str, @NotNull Response response) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(response, "");
            this.onNavigationEvent = str;
            this.onExtraCallbackWithResult = response;
        }

        public void close() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 89;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                _UtilCommonKt.closeQuietly(this.onExtraCallbackWithResult);
                throw null;
            }
            _UtilCommonKt.closeQuietly(this.onExtraCallbackWithResult);
            int i3 = onWarmupCompleted + 43;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
        }

        public boolean onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 67;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            boolean zIsSuccessful = this.onExtraCallbackWithResult.isSuccessful();
            int i4 = onWarmupCompleted + 79;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return zIsSuccessful;
        }

        public InputStream onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 95;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            InputStream inputStreamByteStream = this.onExtraCallbackWithResult.body().byteStream();
            int i4 = onWarmupCompleted + 27;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return inputStreamByteStream;
        }

        public String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 61;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            MediaType mediaTypeContentType = this.onExtraCallbackWithResult.body().contentType();
            Object obj = null;
            if (mediaTypeContentType == null) {
                int i4 = onWarmupCompleted + 19;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return null;
            }
            int i6 = onExtraCallback + 105;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                return mediaTypeContentType.toString();
            }
            mediaTypeContentType.toString();
            obj.hashCode();
            throw null;
        }

        public String IAuthTabCallback() {
            int i = 2 % 2;
            if (onNavigationEvent()) {
                int i2 = onWarmupCompleted + 1;
                int i3 = i2 % 128;
                onExtraCallback = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 67;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return null;
            }
            return "Unable to fetch " + this.onNavigationEvent + ". Failed with " + this.onExtraCallbackWithResult.code() + "\n" + this.onExtraCallbackWithResult.body().string();
        }
    }
}
