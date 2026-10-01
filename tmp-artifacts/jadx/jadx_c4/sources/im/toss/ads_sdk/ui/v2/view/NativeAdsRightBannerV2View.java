package im.toss.ads_sdk.ui.v2.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import im.toss.ads_sdk.model.NativeAdsDto;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.Typography;
import im.toss.tds.view.component.atom.text.Typography5;
import im.toss.tds.view.component.atom.text.Typography7;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import im.toss.tds.view.component.widget.TdsSquircleLayoutV1;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.AFj1qSDK;
import o.CarouselKtCarousel4ExternalSyntheticLambda0;
import o.CarouselKtExternalSyntheticLambda7;
import o.CarouselPagerStateExternalSyntheticLambda1;
import o.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import o.RecomposerawaitIdle2;
import o.RecomposerrecompositionRunner2;
import o.ReusableRememberObserverHolder;
import o.access8100;
import o.getAdService;
import o.getRearDisplayMetrics;
import o.getSpecialFeatureOptInStatus;
import o.getStrokeWidth;
import o.getUrlokhttp;
import o.getWrite;
import o.patch;
import o.readIntokhttp;
import o.setPathData;
import o.setTagsokhttp;
import o.setVisitUrl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class NativeAdsRightBannerV2View extends ConstraintLayout {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    private final setPathData onWarmupCompleted;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NativeAdsRightBannerV2View(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NativeAdsRightBannerV2View(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(NativeAdsRightBannerV2View nativeAdsRightBannerV2View, onNavigationEvent onnavigationevent, NativeAdsDto.Creative.RightBanner rightBanner, String str, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 65;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(nativeAdsRightBannerV2View, onnavigationevent, rightBanner, str, motionEvent);
        int i4 = IAuthTabCallback + 105;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NativeAdsRightBannerV2View(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        setPathData setpathdataIAuthTabCallback = setPathData.IAuthTabCallback(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(setpathdataIAuthTabCallback, "");
        this.onWarmupCompleted = setpathdataIAuthTabCallback;
        TdsRoundLayout tdsRoundLayout = setpathdataIAuthTabCallback.onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayout, "");
        patch.IAuthTabCallback(tdsRoundLayout, 0.0f, 1, (Object) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ NativeAdsRightBannerV2View(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = onNavigationEvent + 95;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 35 / 0;
            }
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i5 = IAuthTabCallback + 25;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public static final /* synthetic */ setPathData onExtraCallback(NativeAdsRightBannerV2View nativeAdsRightBannerV2View) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 55;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        setPathData setpathdata = nativeAdsRightBannerV2View.onWarmupCompleted;
        if (i3 == 0) {
            return setpathdata;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setItem(@NotNull NativeAdsDto.Creative.RightBanner rightBanner, boolean z, @NotNull onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 37;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(rightBanner, "");
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        onNavigationEvent(rightBanner, z);
        IAuthTabCallback(rightBanner, rightBanner.onWarmupCompleted(), getRearDisplayMetrics.onWarmupCompleted(this, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback(this.onWarmupCompleted.onTransact, "1001"), getWrite.IAuthTabCallback(this.onWarmupCompleted.onExtraCallback, "1002"), getWrite.IAuthTabCallback(this.onWarmupCompleted.IAuthTabCallback, "2505")})), onnavigationevent);
        int i4 = onNavigationEvent + 93;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void IAuthTabCallback(final NativeAdsDto.Creative.RightBanner rightBanner, final String str, Function0<Unit> function0, final onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        getStrokeWidth getstrokewidth = getStrokeWidth.onExtraCallback;
        TdsRoundLayout tdsRoundLayout = this.onWarmupCompleted.onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayout, "");
        getStrokeWidth.onExtraCallback(getstrokewidth, tdsRoundLayout, false, null, 0, null, null, 0.0f, 0.0f, null, false, 0L, null, function0, new Function1() { // from class: im.toss.ads_sdk.ui.v2.view.NativeAdsRightBannerV2View$$ExternalSyntheticLambda0
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 61;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                NativeAdsRightBannerV2View nativeAdsRightBannerV2View = this.f$0;
                if (i4 != 0) {
                    return NativeAdsRightBannerV2View.onExtraCallbackWithResult(nativeAdsRightBannerV2View, onnavigationevent, rightBanner, str, (MotionEvent) obj);
                }
                NativeAdsRightBannerV2View.onExtraCallbackWithResult(nativeAdsRightBannerV2View, onnavigationevent, rightBanner, str, (MotionEvent) obj);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }, 2045, null);
        int i2 = IAuthTabCallback + 23;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
    }

    public static final class IAuthTabCallback implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ Configuration onNavigationEvent;

        public IAuthTabCallback(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
        
            return o.getSpecialFeatureOptInStatus.Light;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
        
            if ((!o.readIntokhttp.onExtraCallback(r4.onNavigationEvent)) != false) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r4.onNavigationEvent) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
        
            r1 = o.getSpecialFeatureOptInStatus.Dark;
            r2 = im.toss.ads_sdk.ui.v2.view.NativeAdsRightBannerV2View.IAuthTabCallback.onExtraCallbackWithResult + 15;
            im.toss.ads_sdk.ui.v2.view.NativeAdsRightBannerV2View.IAuthTabCallback.IAuthTabCallback = r2 % 128;
            r2 = r2 % 2;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 85;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 76 / 0;
            }
        }
    }

    public static final class IAuthTabCallbackDefault implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Configuration onExtraCallback;

        public IAuthTabCallbackDefault(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i2 = onWarmupCompleted + 51;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return getspecialfeatureoptinstatus;
                }
                throw null;
            }
            int i3 = IAuthTabCallback + 47;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Dark;
            if (i4 == 0) {
                return getspecialfeatureoptinstatus2;
            }
            throw null;
        }
    }

    public static final class IAuthTabCallbackStub implements getAdService {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onNavigationEvent;

        public IAuthTabCallbackStub(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onNavigationEvent)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i2 = onWarmupCompleted + 125;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            int i4 = onExtraCallback + 63;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 62 / 0;
            }
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class IAuthTabCallback_Parcel implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public IAuthTabCallback_Parcel(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i2 = onNavigationEvent + 63;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            int i4 = IAuthTabCallback + 55;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return getspecialfeatureoptinstatus;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class asBinder implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public asBinder(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 119;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i4 = IAuthTabCallback + 111;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            int i6 = onNavigationEvent + 25;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class asInterface implements getAdService {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public asInterface(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                int i2 = onExtraCallback + 113;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return getSpecialFeatureOptInStatus.Dark;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
            int i4 = onNavigationEvent + 31;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class onExtraCallback implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onExtraCallback(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 77;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i4 = IAuthTabCallback + 61;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            if (i5 != 0) {
                return getspecialfeatureoptinstatus;
            }
            throw null;
        }
    }

    public static final class onExtraCallbackWithResult implements getAdService {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Configuration IAuthTabCallback;

        public onExtraCallbackWithResult(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
        
            return o.getSpecialFeatureOptInStatus.Light;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r4.IAuthTabCallback) != true) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r4.IAuthTabCallback) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
        
            r1 = o.getSpecialFeatureOptInStatus.Dark;
            r2 = im.toss.ads_sdk.ui.v2.view.NativeAdsRightBannerV2View.onExtraCallbackWithResult.onNavigationEvent + 89;
            im.toss.ads_sdk.ui.v2.view.NativeAdsRightBannerV2View.onExtraCallbackWithResult.onWarmupCompleted = r2 % 128;
            r2 = r2 % 2;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 51;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 31 / 0;
            }
        }
    }

    public static final class onTransact implements getAdService {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ Configuration onNavigationEvent;

        public onTransact(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 117;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            if (readIntokhttp.onExtraCallback(this.onNavigationEvent)) {
                return getSpecialFeatureOptInStatus.Dark;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
            int i4 = onExtraCallbackWithResult + 31;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class onWarmupCompleted implements getAdService {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Configuration IAuthTabCallback;

        public onWarmupCompleted(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.IAuthTabCallback)) {
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i2 = onExtraCallback + 99;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return getspecialfeatureoptinstatus;
            }
            int i4 = onNavigationEvent + 125;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Dark;
            if (i5 != 0) {
                int i6 = 6 / 0;
            }
            return getspecialfeatureoptinstatus2;
        }
    }

    private static final Unit onExtraCallback(NativeAdsRightBannerV2View nativeAdsRightBannerV2View, onNavigationEvent onnavigationevent, NativeAdsDto.Creative.RightBanner rightBanner, String str, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 113;
        onNavigationEvent = i2 % 128;
        String str2 = null;
        if (i2 % 2 != 0) {
            str2.hashCode();
            throw null;
        }
        if (motionEvent != null) {
            getStrokeWidth getstrokewidth = getStrokeWidth.onExtraCallback;
            Typography5 typography5 = nativeAdsRightBannerV2View.onWarmupCompleted.onTransact;
            Intrinsics.checkNotNullExpressionValue(typography5, "");
            if (getstrokewidth.onExtraCallback((View) typography5, motionEvent.getX(), motionEvent.getY())) {
                str2 = "1001";
            } else {
                Intrinsics.checkNotNullExpressionValue(nativeAdsRightBannerV2View.onWarmupCompleted.onExtraCallback, "");
                if (!(!getstrokewidth.onExtraCallback((View) r3, motionEvent.getX(), motionEvent.getY()))) {
                    str2 = "1002";
                } else {
                    TdsSquircleLayoutV1 tdsSquircleLayoutV1 = nativeAdsRightBannerV2View.onWarmupCompleted.IAuthTabCallback;
                    Intrinsics.checkNotNullExpressionValue(tdsSquircleLayoutV1, "");
                    if (getstrokewidth.onExtraCallback((View) tdsSquircleLayoutV1, motionEvent.getX(), motionEvent.getY())) {
                        int i3 = onNavigationEvent + 27;
                        IAuthTabCallback = i3 % 128;
                        int i4 = i3 % 2;
                        str2 = "2505";
                    }
                }
            }
            onnavigationevent.onWarmupCompleted(rightBanner, str, str2);
            int i5 = onNavigationEvent + 75;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
        } else {
            onNavigationEvent.onExtraCallbackWithResult(onnavigationevent, rightBanner, str, null, 4, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onNavigationEvent(NativeAdsDto.Creative.RightBanner rightBanner, boolean z) {
        float f;
        int iIsEngagementSignalsApiAvailable;
        int iIsEngagementSignalsApiAvailable2;
        int i = 2 % 2;
        DeactivateEncoderSurfaceBeforeStopEncoderQuirk deactivateEncoderSurfaceBeforeStopEncoderQuirk = new DeactivateEncoderSurfaceBeforeStopEncoderQuirk();
        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onNavigationEvent(this.onWarmupCompleted.onNavigationEvent);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Resources resources = context.getResources();
        if (resources != null) {
            int i2 = IAuthTabCallback + 53;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Configuration configuration = resources.getConfiguration();
            f = configuration != null ? configuration.fontScale : 1.0f;
        }
        if (f > 1.35f) {
            deactivateEncoderSurfaceBeforeStopEncoderQuirk.onWarmupCompleted(this.onWarmupCompleted.IAuthTabCallback.getId(), 3, 0, 3);
            deactivateEncoderSurfaceBeforeStopEncoderQuirk.onExtraCallback(this.onWarmupCompleted.IAuthTabCallback.getId(), 4);
        } else {
            deactivateEncoderSurfaceBeforeStopEncoderQuirk.onWarmupCompleted(this.onWarmupCompleted.IAuthTabCallback.getId(), 3, 0, 3);
            deactivateEncoderSurfaceBeforeStopEncoderQuirk.onWarmupCompleted(this.onWarmupCompleted.IAuthTabCallback.getId(), 4, 0, 4);
            deactivateEncoderSurfaceBeforeStopEncoderQuirk.onNavigationEvent(this.onWarmupCompleted.IAuthTabCallback.getId(), 0.5f);
        }
        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onExtraCallbackWithResult(this.onWarmupCompleted.onNavigationEvent);
        requestLayout();
        this.onWarmupCompleted.onTransact.setText(rightBanner.asInterface());
        if (z) {
            this.onWarmupCompleted.onExtraCallback.setText(rightBanner.IAuthTabCallbackStub() + " ・ AD");
        } else {
            this.onWarmupCompleted.onExtraCallback.setText(rightBanner.IAuthTabCallbackStub());
        }
        String strIAuthTabCallbackDefault = rightBanner.IAuthTabCallbackDefault();
        if (strIAuthTabCallbackDefault == null || StringsKt.isBlank(strIAuthTabCallbackDefault)) {
            Typography typography = this.onWarmupCompleted.IAuthTabCallbackDefault;
            Intrinsics.checkNotNullExpressionValue(typography, "");
            typography.setVisibility(8);
        } else {
            int i4 = onNavigationEvent + 115;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            Typography typography2 = this.onWarmupCompleted.IAuthTabCallbackDefault;
            Intrinsics.checkNotNullExpressionValue(typography2, "");
            typography2.setVisibility(0);
            this.onWarmupCompleted.IAuthTabCallbackDefault.setText(rightBanner.IAuthTabCallbackDefault());
        }
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Resources resources2 = context2.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "");
        Configuration configuration2 = resources2.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        if (readIntokhttp.onExtraCallback(configuration2)) {
            Typography5 typography5 = this.onWarmupCompleted.onTransact;
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            Configuration configuration3 = context3.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration3, "");
            typography5.setTextColor(((Integer) getUrlokhttp.onNavigationEvent(new Object[]{new getUrlokhttp(new onExtraCallbackWithResult(configuration3))}, -1763178192, 1763178195, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult())).intValue());
            Typography7 typography7 = this.onWarmupCompleted.onExtraCallback;
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            Configuration configuration4 = context4.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration4, "");
            typography7.setTextColor(new getUrlokhttp(new onWarmupCompleted(configuration4)).IPostMessageService());
            Typography typography3 = this.onWarmupCompleted.IAuthTabCallbackDefault;
            Context context5 = getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "");
            Configuration configuration5 = context5.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration5, "");
            typography3.setTextColor(new getUrlokhttp(new IAuthTabCallback(configuration5)).onVerticalScrollEvent());
        } else {
            Typography5 typography52 = this.onWarmupCompleted.onTransact;
            Context context6 = getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "");
            Configuration configuration6 = context6.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration6, "");
            typography52.setTextColor(new getUrlokhttp(new onTransact(configuration6)).requestPostMessageChannel().ICustomTabsCallbackDefault());
            Typography7 typography72 = this.onWarmupCompleted.onExtraCallback;
            Context context7 = getContext();
            Intrinsics.checkNotNullExpressionValue(context7, "");
            Configuration configuration7 = context7.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration7, "");
            typography72.setTextColor(new getUrlokhttp(new IAuthTabCallbackStub(configuration7)).requestPostMessageChannel().onMinimized());
            Typography typography4 = this.onWarmupCompleted.IAuthTabCallbackDefault;
            Context context8 = getContext();
            Intrinsics.checkNotNullExpressionValue(context8, "");
            Configuration configuration8 = context8.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration8, "");
            typography4.setTextColor(new getUrlokhttp(new IAuthTabCallbackDefault(configuration8)).requestPostMessageChannel().onMessageChannelReady());
        }
        String strAsBinder = rightBanner.asBinder();
        if (StringsKt.isBlank(strAsBinder)) {
            TdsSquircleLayoutV1 tdsSquircleLayoutV1 = this.onWarmupCompleted.IAuthTabCallback;
            Intrinsics.checkNotNullExpressionValue(tdsSquircleLayoutV1, "");
            tdsSquircleLayoutV1.setVisibility(8);
            int i6 = onNavigationEvent + 97;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Context context9 = getContext();
        Intrinsics.checkNotNullExpressionValue(context9, "");
        Resources resources3 = context9.getResources();
        Intrinsics.checkNotNullExpressionValue(resources3, "");
        Configuration configuration9 = resources3.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration9, "");
        if (readIntokhttp.onExtraCallback(configuration9)) {
            Context context10 = getContext();
            Intrinsics.checkNotNullExpressionValue(context10, "");
            Configuration configuration10 = context10.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration10, "");
            iIsEngagementSignalsApiAvailable = new getUrlokhttp(new asInterface(configuration10)).onSessionEnded();
        } else {
            Context context11 = getContext();
            Intrinsics.checkNotNullExpressionValue(context11, "");
            Configuration configuration11 = context11.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration11, "");
            iIsEngagementSignalsApiAvailable = new getUrlokhttp(new asBinder(configuration11)).requestPostMessageChannel().isEngagementSignalsApiAvailable();
        }
        Context context12 = getContext();
        Intrinsics.checkNotNullExpressionValue(context12, "");
        Resources resources4 = context12.getResources();
        Intrinsics.checkNotNullExpressionValue(resources4, "");
        Configuration configuration12 = resources4.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration12, "");
        if (readIntokhttp.onExtraCallback(configuration12)) {
            Context context13 = getContext();
            Intrinsics.checkNotNullExpressionValue(context13, "");
            Configuration configuration13 = context13.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration13, "");
            iIsEngagementSignalsApiAvailable2 = new getUrlokhttp(new IAuthTabCallback_Parcel(configuration13)).onSessionEnded();
        } else {
            Context context14 = getContext();
            Intrinsics.checkNotNullExpressionValue(context14, "");
            Configuration configuration14 = context14.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration14, "");
            iIsEngagementSignalsApiAvailable2 = new getUrlokhttp(new onExtraCallback(configuration14)).requestPostMessageChannel().isEngagementSignalsApiAvailable();
        }
        this.onWarmupCompleted.IAuthTabCallback.setBackgroundColor(iIsEngagementSignalsApiAvailable);
        this.onWarmupCompleted.IAuthTabCallback.setStrokeColor(iIsEngagementSignalsApiAvailable2);
        this.onWarmupCompleted.IAuthTabCallback.setStrokeWidth(setTagsokhttp.onExtraCallbackWithResult(this, Double.valueOf(1.5d)));
        TdsSquircleLayoutV1 tdsSquircleLayoutV12 = this.onWarmupCompleted.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(tdsSquircleLayoutV12, "");
        tdsSquircleLayoutV12.setVisibility(0);
        TdsImageView tdsImageView = this.onWarmupCompleted.onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        tdsImageView.setVisibility(0);
        LottieAnimationView lottieAnimationView = this.onWarmupCompleted.onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "");
        lottieAnimationView.setVisibility(8);
        Context context15 = getContext();
        Intrinsics.checkNotNullExpressionValue(context15, "");
        RecomposerawaitIdle2.onNavigationEvent onnavigationeventOnExtraCallback = new RecomposerawaitIdle2.onNavigationEvent(context15).onExtraCallback(strAsBinder);
        Context context16 = getContext();
        Intrinsics.checkNotNullExpressionValue(context16, "");
        CarouselKtCarousel4ExternalSyntheticLambda0.onExtraCallbackWithResult(context16).onWarmupCompleted(RecomposerrecompositionRunner2.IAuthTabCallback(onnavigationeventOnExtraCallback.IAuthTabCallback(new access100()), true).onExtraCallbackWithResult());
    }

    public static final class access100 implements ReusableRememberObserverHolder {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        access100() {
        }

        public /* bridge */ void IAuthTabCallback(CarouselKtExternalSyntheticLambda7 carouselKtExternalSyntheticLambda7) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 73;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            super.IAuthTabCallback(carouselKtExternalSyntheticLambda7);
            int i4 = onNavigationEvent + 11;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public /* bridge */ void onWarmupCompleted(CarouselKtExternalSyntheticLambda7 carouselKtExternalSyntheticLambda7) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 9;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            super.onWarmupCompleted(carouselKtExternalSyntheticLambda7);
            int i4 = onNavigationEvent + 31;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 29 / 0;
            }
        }

        public void onExtraCallbackWithResult(CarouselKtExternalSyntheticLambda7 carouselKtExternalSyntheticLambda7) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 51;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(carouselKtExternalSyntheticLambda7, "");
            NativeAdsRightBannerV2View.onExtraCallback(NativeAdsRightBannerV2View.this).onWarmupCompleted.setImageBitmap(CarouselPagerStateExternalSyntheticLambda1.onExtraCallbackWithResult(carouselKtExternalSyntheticLambda7, 0, 0, 3, (Object) null));
            NativeAdsRightBannerV2View.onExtraCallback(NativeAdsRightBannerV2View.this).IAuthTabCallback.setApplySquircle(!AFj1qSDK.onNavigationEvent.onExtraCallback(r5));
            int i4 = onExtraCallbackWithResult + 29;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public interface onNavigationEvent {
        void onWarmupCompleted(@NotNull NativeAdsDto.Creative.RightBanner rightBanner, @NotNull String str, @Nullable String str2);

        static /* synthetic */ void onExtraCallbackWithResult(onNavigationEvent onnavigationevent, NativeAdsDto.Creative.RightBanner rightBanner, String str, String str2, int i, Object obj) {
            int i2 = 2 % 2;
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onClick");
            }
            if ((i & 4) != 0) {
                str2 = null;
            }
            onnavigationevent.onWarmupCompleted(rightBanner, str, str2);
        }
    }
}
