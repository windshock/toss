package o;

import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import im.toss.network.utils.NetworkRxUtils$;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class UtilsKtExternalSyntheticLambda17 {
    public static final UtilsKtExternalSyntheticLambda17 IAuthTabCallback = new UtilsKtExternalSyntheticLambda17();
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    public static final /* synthetic */ class BackHandlerKtExternalSyntheticLambda5 implements deserializeIntNullableCollection {
        private final /* synthetic */ Function1 onExtraCallbackWithResult;

        public BackHandlerKtExternalSyntheticLambda5(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, BuildConfig.FLAVOR);
            this.onExtraCallbackWithResult = function1;
        }

        public final /* synthetic */ Object apply(Object obj) {
            return this.onExtraCallbackWithResult.invoke(obj);
        }
    }

    public static final /* synthetic */ class PipHintTrackerKttrackPipAnimationHintViewflow1ExternalSyntheticLambda0 implements deserializeIntNullableCollection {
        private final /* synthetic */ Function1 onNavigationEvent;

        public PipHintTrackerKttrackPipAnimationHintViewflow1ExternalSyntheticLambda0(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, BuildConfig.FLAVOR);
            this.onNavigationEvent = function1;
        }

        public final /* synthetic */ Object apply(Object obj) {
            return this.onNavigationEvent.invoke(obj);
        }
    }

    public static final /* synthetic */ class onStateChanged implements deserializeIntNullableCollection {
        private final /* synthetic */ Function1 onNavigationEvent;

        public onStateChanged(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, BuildConfig.FLAVOR);
            this.onNavigationEvent = function1;
        }

        public final /* synthetic */ Object apply(Object obj) {
            return this.onNavigationEvent.invoke(obj);
        }
    }

    public static final /* synthetic */ class peekAvailableContext implements deserializeIntNullableCollection {
        private final /* synthetic */ Function1 IAuthTabCallback;

        public peekAvailableContext(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, BuildConfig.FLAVOR);
            this.IAuthTabCallback = function1;
        }

        public final /* synthetic */ Object apply(Object obj) {
            return this.IAuthTabCallback.invoke(obj);
        }
    }

    static {
        int i = onExtraCallbackWithResult + 49;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk IAuthTabCallback(BaseApiResponse baseApiResponse) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 113;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk r8lambdaarg5h4l5ymqb18lwxbfykjvhdskOnExtraCallbackWithResult = onExtraCallbackWithResult(baseApiResponse);
        if (i3 != 0) {
            int i4 = 6 / 0;
        }
        return r8lambdaarg5h4l5ymqb18lwxbfykjvhdskOnExtraCallbackWithResult;
    }

    public static /* synthetic */ r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 63;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk r8lambdaarg5h4l5ymqb18lwxbfykjvhdskOnExtraCallbackWithResult = onExtraCallbackWithResult(function1, obj);
        if (i3 == 0) {
            int i4 = 3 / 0;
        }
        int i5 = onNavigationEvent + 53;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 24 / 0;
        }
        return r8lambdaarg5h4l5ymqb18lwxbfykjvhdskOnExtraCallbackWithResult;
    }

    public static /* synthetic */ r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk onWarmupCompleted(MapConverter mapConverter, MapConverter mapConverter2, JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsing) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 49;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback(mapConverter, mapConverter2, jsonReaderUnknownNumberParsing);
        }
        onExtraCallback(mapConverter, mapConverter2, jsonReaderUnknownNumberParsing);
        throw null;
    }

    private UtilsKtExternalSyntheticLambda17() {
    }

    public static /* synthetic */ writeQuotedString onNavigationEvent(MapConverter mapConverter, MapConverter mapConverter2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            mapConverter = clearTid.onExtraCallback();
        }
        if ((i & 2) != 0) {
            int i3 = onNavigationEvent + 81;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            mapConverter2 = NetConverter3.onExtraCallback();
            int i5 = onExtraCallback + 47;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
        }
        return onExtraCallbackWithResult(mapConverter, mapConverter2);
    }

    @JvmStatic
    public static final <T> writeQuotedString<BaseApiResponse<T>, T> onExtraCallbackWithResult(@Nullable MapConverter mapConverter, @Nullable MapConverter mapConverter2) {
        int i = 2 % 2;
        NetworkRxUtils$.ExternalSyntheticLambda0 externalSyntheticLambda0 = new NetworkRxUtils$.ExternalSyntheticLambda0(mapConverter, mapConverter2);
        int i2 = onNavigationEvent + 79;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return externalSyntheticLambda0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 119;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, BuildConfig.FLAVOR);
            return (r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(obj, BuildConfig.FLAVOR);
        throw null;
    }

    private static final r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk onExtraCallbackWithResult(BaseApiResponse baseApiResponse) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(baseApiResponse, BuildConfig.FLAVOR);
        int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
            if (baseApiResponse.onTransact() != null) {
                return JsonReaderUnknownNumberParsing.onExtraCallback(baseApiResponse.onTransact());
            }
            int i2 = onNavigationEvent + 115;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return JsonReaderUnknownNumberParsing.onNavigationEvent();
        }
        TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
        if (apiErrorExtraCallbackWithResult == null) {
            apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
        }
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingIAuthTabCallback = JsonReaderUnknownNumberParsing.IAuthTabCallback(apiErrorExtraCallbackWithResult);
        int i4 = onExtraCallback + 113;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return jsonReaderUnknownNumberParsingIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk onExtraCallback(MapConverter mapConverter, MapConverter mapConverter2, JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsing) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(jsonReaderUnknownNumberParsing, BuildConfig.FLAVOR);
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingIAuthTabCallback = jsonReaderUnknownNumberParsing.IAuthTabCallback(new NetworkRxUtils$.ExternalSyntheticLambda2(new NetworkRxUtils$.ExternalSyntheticLambda1()));
        if (mapConverter != null) {
            int i2 = onNavigationEvent + 59;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                jsonReaderUnknownNumberParsingIAuthTabCallback = jsonReaderUnknownNumberParsingIAuthTabCallback.onExtraCallback(mapConverter);
                int i3 = 77 / 0;
            } else {
                jsonReaderUnknownNumberParsingIAuthTabCallback = jsonReaderUnknownNumberParsingIAuthTabCallback.onExtraCallback(mapConverter);
            }
        }
        if (mapConverter2 == null) {
            return jsonReaderUnknownNumberParsingIAuthTabCallback;
        }
        int i4 = onExtraCallback + 123;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return jsonReaderUnknownNumberParsingIAuthTabCallback.onWarmupCompleted(mapConverter2);
    }
}
