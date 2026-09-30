package o;

import im.toss.ads_sdk.admob.AdmobRequestOptionsParser$;
import im.toss.ads_sdk.model.NativeAdsDto;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class setTrimPathStart {
    private static int IAuthTabCallbackStub = 1;
    private static int asInterface = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public static final setTrimPathStart IAuthTabCallback = new setTrimPathStart();
    private static final wie2 onExtraCallback = videoFrameChanged.onWarmupCompleted((wie2) null, new AdmobRequestOptionsParser$.ExternalSyntheticLambda0(), 1, (Object) null);
    public static final int onWarmupCompleted = 8;

    public static /* synthetic */ Unit onWarmupCompleted(adInfo adinfo) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 13;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(adinfo);
        int i4 = onExtraCallbackWithResult + 31;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 52 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    private setTrimPathStart() {
    }

    static {
        int i = IAuthTabCallbackStub + 43;
        asInterface = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private static final Unit onExtraCallbackWithResult(adInfo adinfo) {
        boolean z;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 47;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(adinfo, "");
            z = false;
        } else {
            Intrinsics.checkNotNullParameter(adinfo, "");
            z = true;
        }
        adinfo.IAuthTabCallback(z);
        Unit unit = Unit.INSTANCE;
        int i3 = onExtraCallbackWithResult + 93;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final NativeAdsDto.AdmobRequestOptions onNavigationEvent(@Nullable String str) {
        NativeAdsDto.AdmobRequestOptions admobRequestOptions;
        int i = 2 % 2;
        if (str != null) {
            int i2 = onExtraCallbackWithResult + 99;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (StringsKt.isBlank(str)) {
                str = null;
            }
            if (str != null) {
                try {
                    Result.Companion companion = Result.Companion;
                    wie2 wie2Var = onExtraCallback;
                    wie2Var.onExtraCallback();
                    admobRequestOptions = Result.constructor-impl((NativeAdsDto.AdmobRequestOptions) wie2Var.onExtraCallback(NativeAdsDto.AdmobRequestOptions.Companion.serializer(), str));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    admobRequestOptions = Result.constructor-impl(ResultKt.createFailure(th));
                }
                admobRequestOptions = Result.onExtraCallback(admobRequestOptions) ? null : admobRequestOptions;
                int i4 = onExtraCallbackWithResult + 9;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 5 / 5;
                }
            }
        }
        int i6 = onNavigationEvent + 115;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return admobRequestOptions;
    }
}
