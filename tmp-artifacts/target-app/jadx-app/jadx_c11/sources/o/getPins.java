package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.getPins;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getPins {
    public static final onExtraCallbackWithResult Companion;
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 1;
    private static final getPins onNavigationEvent;
    private static int onWarmupCompleted = 1;
    private final Function1<String, String> onExtraCallback;
    private final Function1<okhttp3.HttpUrl, okhttp3.HttpUrl> onExtraCallbackWithResult;

    /* JADX WARN: Illegal instructions before constructor call */
    public getPins() {
        Function1 function1 = null;
        this(function1, function1, 3, function1);
    }

    public static /* synthetic */ String IAuthTabCallback(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 63;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        String strOnExtraCallback = onExtraCallback(str);
        int i4 = onWarmupCompleted + 57;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 49 / 0;
        }
        return strOnExtraCallback;
    }

    private static final okhttp3.HttpUrl IAuthTabCallback(okhttp3.HttpUrl httpUrl) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 19;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(httpUrl, "");
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onWarmupCompleted + 75;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 50 / 0;
        }
        return httpUrl;
    }

    private static final String onExtraCallback(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        int i4 = onWarmupCompleted + 19;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ okhttp3.HttpUrl onNavigationEvent(okhttp3.HttpUrl httpUrl) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 73;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        okhttp3.HttpUrl httpUrlIAuthTabCallback = IAuthTabCallback(httpUrl);
        int i4 = IAuthTabCallback + 79;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return httpUrlIAuthTabCallback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public getPins(@NotNull Function1<? super okhttp3.HttpUrl, okhttp3.HttpUrl> function1, @NotNull Function1<? super String, String> function12) {
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.onExtraCallbackWithResult = function1;
        this.onExtraCallback = function12;
    }

    public static final /* synthetic */ getPins onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 97;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        getPins getpins = onNavigationEvent;
        int i4 = i3 + 13;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return getpins;
    }

    public /* synthetic */ getPins(Function1 function1, Function1 function12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            function1 = new Function1() { // from class: im.toss.tds.foundation.network.TdsHttpOptions$$ExternalSyntheticLambda0
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj) {
                    int i2 = 2 % 2;
                    int i3 = onExtraCallbackWithResult + 41;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    HttpUrl httpUrlOnNavigationEvent = getPins.onNavigationEvent((HttpUrl) obj);
                    if (i4 == 0) {
                        int i5 = 47 / 0;
                    }
                    int i6 = onExtraCallbackWithResult + 11;
                    onNavigationEvent = i6 % 128;
                    if (i6 % 2 != 0) {
                        return httpUrlOnNavigationEvent;
                    }
                    throw null;
                }
            };
            int i2 = IAuthTabCallback + 47;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
        }
        if ((i & 2) != 0) {
            function12 = new Function1() { // from class: im.toss.tds.foundation.network.TdsHttpOptions$$ExternalSyntheticLambda1
                private static int onExtraCallbackWithResult = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj) {
                    int i4 = 2 % 2;
                    int i5 = onExtraCallbackWithResult + 51;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    String strIAuthTabCallback = getPins.IAuthTabCallback((String) obj);
                    int i7 = onWarmupCompleted + 25;
                    onExtraCallbackWithResult = i7 % 128;
                    int i8 = i7 % 2;
                    return strIAuthTabCallback;
                }
            };
            int i4 = IAuthTabCallback + 41;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 5 % 5;
            } else {
                int i6 = 2 % 2;
            }
        }
        this(function1, function12);
    }

    public final Function1<okhttp3.HttpUrl, okhttp3.HttpUrl> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 59;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        Function1<okhttp3.HttpUrl, okhttp3.HttpUrl> function1 = this.onExtraCallbackWithResult;
        int i4 = i2 + 67;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return function1;
        }
        throw null;
    }

    public final Function1<String, String> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 5;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onExtraCallback;
        }
        throw null;
    }

    public static final class onExtraCallbackWithResult {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        public final getPins onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 23;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            getPins getpinsOnNavigationEvent = getPins.onNavigationEvent();
            if (i3 == 0) {
                int i4 = 65 / 0;
            }
            return getpinsOnNavigationEvent;
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onExtraCallbackWithResult(defaultConstructorMarker);
        onNavigationEvent = new getPins(defaultConstructorMarker, defaultConstructorMarker, 3, defaultConstructorMarker);
        int i = asInterface + 77;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public final OkHttpClient.Builder IAuthTabCallback() {
        int i = 2 % 2;
        OkHttpClient.Builder builderAddInterceptor = new OkHttpClient.Builder().addInterceptor(new onWarmupCompleted()).addInterceptor(new onNavigationEvent());
        int i2 = IAuthTabCallback + 19;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return builderAddInterceptor;
        }
        throw null;
    }

    public static final class onNavigationEvent implements Interceptor {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        public onNavigationEvent() {
        }

        public final Response intercept(Interceptor.Chain chain) {
            String str = "";
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(chain, "");
            Request request = chain.request();
            Request.Builder builderNewBuilder = request.newBuilder();
            Function1<String, String> function1OnExtraCallbackWithResult = getPins.this.onExtraCallbackWithResult();
            String str2 = request.headers().get("User-Agent");
            if (str2 == null) {
                int i2 = onExtraCallback + 13;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 30 / 0;
                }
            } else {
                str = str2;
            }
            Response responseProceed = chain.proceed(builderNewBuilder.addHeader("User-Agent", (String) function1OnExtraCallbackWithResult.invoke(str)).build());
            int i4 = IAuthTabCallback + 39;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 27 / 0;
            }
            return responseProceed;
        }
    }

    public static final class onWarmupCompleted implements Interceptor {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public onWarmupCompleted() {
        }

        public final Response intercept(Interceptor.Chain chain) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 105;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(chain, "");
            Request request = chain.request();
            Response responseProceed = chain.proceed(request.newBuilder().url((okhttp3.HttpUrl) getPins.this.onWarmupCompleted().invoke(request.url())).build());
            int i4 = onExtraCallbackWithResult + 5;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return responseProceed;
        }
    }
}
