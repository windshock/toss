package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.initialiseDecoder;
import o.isExceptionHandlerEnabled;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class initialiseDecoder {
    private final RxDownloader onNavigationEvent = new RxDownloader();
    private final SkiaPooledImageRegionDecoder1 onExtraCallback = new SkiaPooledImageRegionDecoder1();

    public final RxDownloader onExtraCallback() {
        return this.onNavigationEvent;
    }

    public final SkiaPooledImageRegionDecoder1 IAuthTabCallback() {
        return this.onExtraCallback;
    }

    public static final class onExtraCallback implements PurchasesResult {
        private final Function1<HttpUrl, HttpUrl> IAuthTabCallback;

        onExtraCallback(final isExceptionHandlerEnabled isexceptionhandlerenabled, final initialiseDecoder initialisedecoder) {
            this.IAuthTabCallback = new Function1() { // from class: viva.republica.toss.main.TossHttpManipulator$getUrlManipulatedOkHttpInterceptor$1$$ExternalSyntheticLambda0
                public final Object invoke(Object obj) {
                    return initialiseDecoder.onExtraCallback.onExtraCallbackWithResult(isexceptionhandlerenabled, initialisedecoder, (HttpUrl) obj);
                }
            };
        }

        public /* bridge */ Request onExtraCallbackWithResult(Request request) {
            return super.onExtraCallbackWithResult(request);
        }

        public Function1<HttpUrl, HttpUrl> onNavigationEvent() {
            return this.IAuthTabCallback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public static final HttpUrl onExtraCallbackWithResult(isExceptionHandlerEnabled isexceptionhandlerenabled, initialiseDecoder initialisedecoder, HttpUrl httpUrl) throws NoWhenBranchMatchedException {
            Intrinsics.checkNotNullParameter(httpUrl, "");
            isExceptionHandlerEnabled.onExtraCallbackWithResult onextracallbackwithresultOnExtraCallback = isexceptionhandlerenabled.onExtraCallback();
            if (Intrinsics.areEqual(onextracallbackwithresultOnExtraCallback, isExceptionHandlerEnabled.onExtraCallbackWithResult.onExtraCallback.onExtraCallback)) {
                httpUrl = initialisedecoder.onWarmupCompleted(httpUrl);
            } else if (!Intrinsics.areEqual(onextracallbackwithresultOnExtraCallback, isExceptionHandlerEnabled.onExtraCallbackWithResult.IAuthTabCallback.onExtraCallbackWithResult)) {
                throw new NoWhenBranchMatchedException();
            }
            return (HttpUrl) initialisedecoder.onExtraCallback().onNavigationEvent().invoke(httpUrl);
        }
    }

    public final Interceptor onNavigationEvent(@NotNull isExceptionHandlerEnabled isexceptionhandlerenabled) {
        Intrinsics.checkNotNullParameter(isexceptionhandlerenabled, "");
        return new PurchasesUpdatedListener(new onExtraCallback(isexceptionhandlerenabled, this));
    }

    public final Interceptor onNavigationEvent() {
        return new PurchasesResponseListener(this.onExtraCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HttpUrl onWarmupCompleted(HttpUrl httpUrl) {
        HttpUrl httpUrl2 = this.onNavigationEvent.onExtraCallbackWithResult().get(new HttpUrl.Builder().scheme(httpUrl.scheme()).host(httpUrl.host()).port(httpUrl.port()).build());
        return httpUrl2 != null ? httpUrl.newBuilder().scheme(httpUrl2.scheme()).host(httpUrl2.host()).port(httpUrl2.port()).build() : httpUrl;
    }
}
