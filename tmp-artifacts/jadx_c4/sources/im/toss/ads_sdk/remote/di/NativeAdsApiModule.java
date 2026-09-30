package im.toss.ads_sdk.remote.di;

import javax.inject.Singleton;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AUTextView;
import o.adInfo;
import o.addCACert;
import o.onPageScrolled;
import o.pageRight;
import o.setOffscreenPageLimit;
import o.videoFrameChanged;
import o.wie2;
import o.zzad;
import okhttp3.MediaType;
import org.jetbrains.annotations.NotNull;
import retrofit2.Retrofit;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class NativeAdsApiModule {
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallback = 1;
    private static int onTransact;
    private static int onWarmupCompleted;
    public static final NativeAdsApiModule IAuthTabCallback = new NativeAdsApiModule();
    private static final wie2 onExtraCallbackWithResult = videoFrameChanged.onWarmupCompleted((wie2) null, new Function1() { // from class: im.toss.ads_sdk.remote.di.NativeAdsApiModule$$ExternalSyntheticLambda0
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public final Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 125;
            onExtraCallback = i2 % 128;
            adInfo adinfo = (adInfo) obj;
            if (i2 % 2 != 0) {
                NativeAdsApiModule.IAuthTabCallback(adinfo);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            Unit unitIAuthTabCallback = NativeAdsApiModule.IAuthTabCallback(adinfo);
            int i3 = onExtraCallbackWithResult + 1;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return unitIAuthTabCallback;
        }
    }, 1, (Object) null);
    public static final int onNavigationEvent = 8;

    public static /* synthetic */ Unit IAuthTabCallback(adInfo adinfo) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(adinfo);
        int i4 = onWarmupCompleted + 101;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    private NativeAdsApiModule() {
    }

    @Singleton
    public final setOffscreenPageLimit onNavigationEvent(@NotNull pageRight pageright, @NotNull zzad zzadVar) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(pageright, "");
        Intrinsics.checkNotNullParameter(zzadVar, "");
        Object objOnNavigationEvent = new Retrofit.Builder().IAuthTabCallback(zzadVar.onNavigationEvent()).onExtraCallbackWithResult(onPageScrolled.IAuthTabCallback(pageright.IAuthTabCallback(), "NativeAdsApiModule").build()).onExtraCallback(addCACert.onExtraCallback(onExtraCallbackWithResult, MediaType.Companion.get("application/json"))).IAuthTabCallback().onNavigationEvent(setOffscreenPageLimit.class);
        Intrinsics.checkNotNullExpressionValue(objOnNavigationEvent, "");
        setOffscreenPageLimit setoffscreenpagelimit = (setOffscreenPageLimit) objOnNavigationEvent;
        int i2 = onWarmupCompleted + 39;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return setoffscreenpagelimit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        Object obj = null;
        int i = IAuthTabCallbackStub + 73;
        onTransact = i % 128;
        if (i % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final wie2 IAuthTabCallback() {
        wie2 wie2Var;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 73;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 == 0) {
            wie2Var = onExtraCallbackWithResult;
            int i4 = 16 / 0;
        } else {
            wie2Var = onExtraCallbackWithResult;
        }
        int i5 = i3 + 25;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 83 / 0;
        }
        return wie2Var;
    }

    private static final Unit onExtraCallback(adInfo adinfo) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 21;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(adinfo, "");
            adinfo.IAuthTabCallback(true);
            adinfo.onNavigationEvent(false);
            adinfo.onExtraCallbackWithResult(true);
            int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            int iOnExtraCallback2 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            int iOnExtraCallback3 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            adInfo.onExtraCallbackWithResult(-186882588, AUTextView.onExtraCallbackWithResult.onExtraCallback(), iOnExtraCallback3, 186882589, new Object[]{adinfo, true}, iOnExtraCallback2, iOnExtraCallback);
        } else {
            Intrinsics.checkNotNullParameter(adinfo, "");
            adinfo.IAuthTabCallback(true);
            adinfo.onNavigationEvent(false);
            adinfo.onExtraCallbackWithResult(true);
            int iOnExtraCallback4 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            int iOnExtraCallback5 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            int iOnExtraCallback6 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            adInfo.onExtraCallbackWithResult(-186882588, AUTextView.onExtraCallbackWithResult.onExtraCallback(), iOnExtraCallback6, 186882589, new Object[]{adinfo, true}, iOnExtraCallback5, iOnExtraCallback4);
        }
        Unit unit = Unit.INSTANCE;
        int i3 = onWarmupCompleted + 67;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 18 / 0;
        }
        return unit;
    }
}
