package o;

import im.toss.ads_sdk.model.NativeAdsDto;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import o.adInfo;
import o.sortChildDrawingOrder;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class sortChildDrawingOrder {
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public static final sortChildDrawingOrder IAuthTabCallback = new sortChildDrawingOrder();
    private static final wie2 onNavigationEvent = videoFrameChanged.onWarmupCompleted((wie2) null, new Function1() { // from class: im.toss.ads_sdk.model.NativeAdsDtoJsonCodec$$ExternalSyntheticLambda0
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 29;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnNavigationEvent = sortChildDrawingOrder.onNavigationEvent((adInfo) obj);
            int i4 = onWarmupCompleted + 45;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 4 / 0;
            }
            return unitOnNavigationEvent;
        }
    }, 1, (Object) null);
    public static final int onExtraCallback = 8;

    public static /* synthetic */ Unit onNavigationEvent(adInfo adinfo) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(adinfo);
        int i4 = onExtraCallbackWithResult + 85;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 9 / 0;
        }
        return unitOnWarmupCompleted;
    }

    private sortChildDrawingOrder() {
    }

    static {
        int i = IAuthTabCallbackStub + 9;
        asBinder = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private static final Unit onWarmupCompleted(adInfo adinfo) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 121;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(adinfo, "");
        adinfo.IAuthTabCallback(true);
        adinfo.onExtraCallbackWithResult(true);
        adinfo.asBinder(false);
        adinfo.onExtraCallback("styleId");
        adinfo.onNavigationEvent(false);
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 27;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public final String onExtraCallback(@NotNull NativeAdsDto nativeAdsDto) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 1;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(nativeAdsDto, "");
        String strOnWarmupCompleted = onNavigationEvent.onWarmupCompleted(NativeAdsDto.Companion.serializer(), nativeAdsDto);
        int i4 = onWarmupCompleted + 5;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return strOnWarmupCompleted;
    }

    public final JsonElement onWarmupCompleted(@NotNull NativeAdsDto nativeAdsDto) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(nativeAdsDto, "");
            onNavigationEvent.IAuthTabCallback(NativeAdsDto.Companion.serializer(), nativeAdsDto);
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(nativeAdsDto, "");
        JsonElement jsonElementIAuthTabCallback = onNavigationEvent.IAuthTabCallback(NativeAdsDto.Companion.serializer(), nativeAdsDto);
        int i3 = onWarmupCompleted + 43;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return jsonElementIAuthTabCallback;
        }
        obj.hashCode();
        throw null;
    }

    public final NativeAdsDto onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 107;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        NativeAdsDto nativeAdsDto = (NativeAdsDto) onNavigationEvent.onExtraCallback(NativeAdsDto.Companion.serializer(), str);
        int i3 = onExtraCallbackWithResult + 29;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return nativeAdsDto;
    }

    public final NativeAdsDto onExtraCallback(@NotNull JsonElement jsonElement) {
        NativeAdsDto nativeAdsDto;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 125;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(jsonElement, "");
            nativeAdsDto = (NativeAdsDto) onNavigationEvent.onExtraCallbackWithResult(NativeAdsDto.Companion.serializer(), jsonElement);
            int i3 = 24 / 0;
        } else {
            Intrinsics.checkNotNullParameter(jsonElement, "");
            nativeAdsDto = (NativeAdsDto) onNavigationEvent.onExtraCallbackWithResult(NativeAdsDto.Companion.serializer(), jsonElement);
        }
        int i4 = onExtraCallbackWithResult + 37;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return nativeAdsDto;
    }
}
