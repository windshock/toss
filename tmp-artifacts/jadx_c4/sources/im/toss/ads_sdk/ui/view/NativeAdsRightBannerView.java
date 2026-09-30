package im.toss.ads_sdk.ui.view;

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
import o.setVisitUrl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class NativeAdsRightBannerView extends ConstraintLayout {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    private final setPathData IAuthTabCallback;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NativeAdsRightBannerView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NativeAdsRightBannerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(NativeAdsRightBannerView nativeAdsRightBannerView, onNavigationEvent onnavigationevent, NativeAdsDto.Creative.RightBanner rightBanner, String str, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 49;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            IAuthTabCallback(nativeAdsRightBannerView, onnavigationevent, rightBanner, str, motionEvent);
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(nativeAdsRightBannerView, onnavigationevent, rightBanner, str, motionEvent);
        int i3 = onExtraCallback + 87;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NativeAdsRightBannerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        setPathData setpathdataIAuthTabCallback = setPathData.IAuthTabCallback(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(setpathdataIAuthTabCallback, "");
        this.IAuthTabCallback = setpathdataIAuthTabCallback;
        TdsRoundLayout tdsRoundLayout = setpathdataIAuthTabCallback.onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayout, "");
        patch.IAuthTabCallback(tdsRoundLayout, 0.0f, 1, (Object) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ NativeAdsRightBannerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = onWarmupCompleted + 63;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i6 = onWarmupCompleted + 83;
            int i7 = i6 % 128;
            onExtraCallback = i7;
            int i8 = i6 % 2;
            int i9 = i7 + 115;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 2 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public static final /* synthetic */ setPathData onExtraCallbackWithResult(NativeAdsRightBannerView nativeAdsRightBannerView) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 77;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        setPathData setpathdata = nativeAdsRightBannerView.IAuthTabCallback;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 91;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return setpathdata;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setItem(@NotNull NativeAdsDto.Creative.RightBanner rightBanner, boolean z, @NotNull onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 61;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(rightBanner, "");
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        onNavigationEvent(rightBanner, z);
        IAuthTabCallback(rightBanner, rightBanner.onWarmupCompleted(), getRearDisplayMetrics.onWarmupCompleted(this, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback(this.IAuthTabCallback.onTransact, "101"), getWrite.IAuthTabCallback(this.IAuthTabCallback.onExtraCallback, "102"), getWrite.IAuthTabCallback(this.IAuthTabCallback.IAuthTabCallback, "202")})), onnavigationevent);
        int i4 = onWarmupCompleted + 17;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void IAuthTabCallback(final NativeAdsDto.Creative.RightBanner rightBanner, final String str, Function0<Unit> function0, final onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        getStrokeWidth getstrokewidth = getStrokeWidth.onExtraCallback;
        TdsRoundLayout tdsRoundLayout = this.IAuthTabCallback.onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayout, "");
        getStrokeWidth.onExtraCallback(getstrokewidth, tdsRoundLayout, false, null, 0, null, null, 0.0f, 0.0f, null, false, 0L, null, function0, new Function1() { // from class: im.toss.ads_sdk.ui.view.NativeAdsRightBannerView$$ExternalSyntheticLambda0
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 83;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnExtraCallbackWithResult = NativeAdsRightBannerView.onExtraCallbackWithResult(this.f$0, onnavigationevent, rightBanner, str, (MotionEvent) obj);
                int i5 = onWarmupCompleted + 37;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 43 / 0;
                }
                return unitOnExtraCallbackWithResult;
            }
        }, 2045, null);
        int i2 = onWarmupCompleted + 75;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    public static final class IAuthTabCallback implements getAdService {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Configuration onWarmupCompleted;

        public IAuthTabCallback(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 43;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onWarmupCompleted)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i4 = onExtraCallback + 103;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            if (i5 != 0) {
                int i6 = 30 / 0;
            }
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class asInterface implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Configuration onWarmupCompleted;

        public asInterface(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 63;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onWarmupCompleted)) {
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i4 = IAuthTabCallback + 119;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return getspecialfeatureoptinstatus;
            }
            int i6 = IAuthTabCallback + 37;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Dark;
            if (i7 == 0) {
                int i8 = 81 / 0;
            }
            return getspecialfeatureoptinstatus2;
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
            if (!readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i2 = IAuthTabCallback + 23;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            int i4 = IAuthTabCallback + 25;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return getspecialfeatureoptinstatus;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class onExtraCallbackWithResult implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Configuration onExtraCallback;

        public onExtraCallbackWithResult(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i2 = onNavigationEvent + 59;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            int i4 = onNavigationEvent + 25;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return getspecialfeatureoptinstatus;
            }
            throw null;
        }
    }

    public static final class onTransact implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onNavigationEvent;

        public onTransact(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (readIntokhttp.onExtraCallback(this.onNavigationEvent)) {
                int i2 = IAuthTabCallback + 85;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return getSpecialFeatureOptInStatus.Dark;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
            int i4 = IAuthTabCallback + 23;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class onWarmupCompleted implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onWarmupCompleted(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
        
            if ((r2 % 2) != 0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
        
            r0 = 61 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
        
            return o.getSpecialFeatureOptInStatus.Light;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
        
            if ((!o.readIntokhttp.onExtraCallback(r4.onExtraCallbackWithResult)) != false) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r4.onExtraCallbackWithResult) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
        
            r1 = o.getSpecialFeatureOptInStatus.Dark;
            r2 = im.toss.ads_sdk.ui.view.NativeAdsRightBannerView.onWarmupCompleted.onWarmupCompleted + 19;
            im.toss.ads_sdk.ui.view.NativeAdsRightBannerView.onWarmupCompleted.IAuthTabCallback = r2 % 128;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 87;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 42 / 0;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0048 A[PHI: r1
      0x0048: PHI (r1v6 o.getStrokeWidth) = (r1v5 o.getStrokeWidth), (r1v8 o.getStrokeWidth) binds: [B:10:0x0043, B:7:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(NativeAdsRightBannerView nativeAdsRightBannerView, onNavigationEvent onnavigationevent, NativeAdsDto.Creative.RightBanner rightBanner, String str, MotionEvent motionEvent) {
        getStrokeWidth getstrokewidth;
        String str2;
        int i = 2 % 2;
        if (motionEvent != null) {
            int i2 = onWarmupCompleted + 19;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                getstrokewidth = getStrokeWidth.onExtraCallback;
                Typography5 typography5 = nativeAdsRightBannerView.IAuthTabCallback.onTransact;
                Intrinsics.checkNotNullExpressionValue(typography5, "");
                int i3 = 23 / 0;
                if (getstrokewidth.onExtraCallback((View) typography5, motionEvent.getX(), motionEvent.getY())) {
                    str2 = "101";
                } else {
                    Typography7 typography7 = nativeAdsRightBannerView.IAuthTabCallback.onExtraCallback;
                    Intrinsics.checkNotNullExpressionValue(typography7, "");
                    Object obj = null;
                    if (!getstrokewidth.onExtraCallback((View) typography7, motionEvent.getX(), motionEvent.getY())) {
                        TdsSquircleLayoutV1 tdsSquircleLayoutV1 = nativeAdsRightBannerView.IAuthTabCallback.IAuthTabCallback;
                        Intrinsics.checkNotNullExpressionValue(tdsSquircleLayoutV1, "");
                        str2 = getstrokewidth.onExtraCallback((View) tdsSquircleLayoutV1, motionEvent.getX(), motionEvent.getY()) ? "202" : null;
                    } else {
                        int i4 = onWarmupCompleted;
                        int i5 = i4 + 115;
                        onExtraCallback = i5 % 128;
                        if (i5 % 2 == 0) {
                            obj.hashCode();
                            throw null;
                        }
                        int i6 = i4 + 97;
                        onExtraCallback = i6 % 128;
                        int i7 = i6 % 2;
                        str2 = "102";
                    }
                }
            } else {
                getstrokewidth = getStrokeWidth.onExtraCallback;
                Typography5 typography52 = nativeAdsRightBannerView.IAuthTabCallback.onTransact;
                Intrinsics.checkNotNullExpressionValue(typography52, "");
                if (getstrokewidth.onExtraCallback((View) typography52, motionEvent.getX(), motionEvent.getY())) {
                }
            }
            onnavigationevent.onExtraCallbackWithResult(rightBanner, str, str2);
        } else {
            onNavigationEvent.onWarmupCompleted(onnavigationevent, rightBanner, str, null, 4, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onNavigationEvent(NativeAdsDto.Creative.RightBanner rightBanner, boolean z) {
        float f;
        Configuration configuration;
        int i = 2 % 2;
        DeactivateEncoderSurfaceBeforeStopEncoderQuirk deactivateEncoderSurfaceBeforeStopEncoderQuirk = new DeactivateEncoderSurfaceBeforeStopEncoderQuirk();
        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onNavigationEvent(this.IAuthTabCallback.onNavigationEvent);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Resources resources = context.getResources();
        if (resources == null || (configuration = resources.getConfiguration()) == null) {
            f = 1.0f;
        } else {
            int i2 = onExtraCallback + 121;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            f = configuration.fontScale;
        }
        if (f > 1.35f) {
            deactivateEncoderSurfaceBeforeStopEncoderQuirk.onWarmupCompleted(this.IAuthTabCallback.IAuthTabCallback.getId(), 3, 0, 3);
            deactivateEncoderSurfaceBeforeStopEncoderQuirk.onExtraCallback(this.IAuthTabCallback.IAuthTabCallback.getId(), 4);
        } else {
            deactivateEncoderSurfaceBeforeStopEncoderQuirk.onWarmupCompleted(this.IAuthTabCallback.IAuthTabCallback.getId(), 3, 0, 3);
            deactivateEncoderSurfaceBeforeStopEncoderQuirk.onWarmupCompleted(this.IAuthTabCallback.IAuthTabCallback.getId(), 4, 0, 4);
            deactivateEncoderSurfaceBeforeStopEncoderQuirk.onNavigationEvent(this.IAuthTabCallback.IAuthTabCallback.getId(), 0.5f);
        }
        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onExtraCallbackWithResult(this.IAuthTabCallback.onNavigationEvent);
        requestLayout();
        this.IAuthTabCallback.onTransact.setText(rightBanner.asInterface());
        if (z) {
            this.IAuthTabCallback.onExtraCallback.setText(rightBanner.IAuthTabCallbackStub() + " ・ AD");
        } else {
            this.IAuthTabCallback.onExtraCallback.setText(rightBanner.IAuthTabCallbackStub());
            int i4 = onExtraCallback + 83;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }
        String strIAuthTabCallbackDefault = rightBanner.IAuthTabCallbackDefault();
        if (strIAuthTabCallbackDefault == null || StringsKt.isBlank(strIAuthTabCallbackDefault)) {
            Typography typography = this.IAuthTabCallback.IAuthTabCallbackDefault;
            Intrinsics.checkNotNullExpressionValue(typography, "");
            typography.setVisibility(8);
        } else {
            int i6 = onWarmupCompleted + 49;
            onExtraCallback = i6 % 128;
            if (i6 % 2 == 0) {
                Typography typography2 = this.IAuthTabCallback.IAuthTabCallbackDefault;
                Intrinsics.checkNotNullExpressionValue(typography2, "");
                typography2.setVisibility(1);
            } else {
                Typography typography3 = this.IAuthTabCallback.IAuthTabCallbackDefault;
                Intrinsics.checkNotNullExpressionValue(typography3, "");
                typography3.setVisibility(0);
            }
            this.IAuthTabCallback.IAuthTabCallbackDefault.setText(rightBanner.IAuthTabCallbackDefault());
        }
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Resources resources2 = context2.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "");
        Configuration configuration2 = resources2.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        if (readIntokhttp.onExtraCallback(configuration2)) {
            Typography5 typography5 = this.IAuthTabCallback.onTransact;
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            Configuration configuration3 = context3.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration3, "");
            typography5.setTextColor(((Integer) getUrlokhttp.onNavigationEvent(new Object[]{new getUrlokhttp(new onWarmupCompleted(configuration3))}, -1763178192, 1763178195, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult())).intValue());
            Typography7 typography7 = this.IAuthTabCallback.onExtraCallback;
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            Configuration configuration4 = context4.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration4, "");
            typography7.setTextColor(new getUrlokhttp(new onExtraCallback(configuration4)).IPostMessageService());
            Typography typography4 = this.IAuthTabCallback.IAuthTabCallbackDefault;
            Context context5 = getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "");
            Configuration configuration5 = context5.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration5, "");
            typography4.setTextColor(new getUrlokhttp(new IAuthTabCallback(configuration5)).onVerticalScrollEvent());
        } else {
            Typography5 typography52 = this.IAuthTabCallback.onTransact;
            Context context6 = getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "");
            Configuration configuration6 = context6.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration6, "");
            typography52.setTextColor(new getUrlokhttp(new onExtraCallbackWithResult(configuration6)).requestPostMessageChannel().onUnminimized());
            Typography7 typography72 = this.IAuthTabCallback.onExtraCallback;
            Context context7 = getContext();
            Intrinsics.checkNotNullExpressionValue(context7, "");
            Configuration configuration7 = context7.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration7, "");
            typography72.setTextColor(new getUrlokhttp(new asInterface(configuration7)).requestPostMessageChannel().onMinimized());
            Typography typography6 = this.IAuthTabCallback.IAuthTabCallbackDefault;
            Context context8 = getContext();
            Intrinsics.checkNotNullExpressionValue(context8, "");
            Configuration configuration8 = context8.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration8, "");
            typography6.setTextColor(new getUrlokhttp(new onTransact(configuration8)).requestPostMessageChannel().onMessageChannelReady());
            int i7 = onExtraCallback + 107;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
        }
        String strAsBinder = rightBanner.asBinder();
        if (!(!StringsKt.isBlank(strAsBinder))) {
            TdsSquircleLayoutV1 tdsSquircleLayoutV1 = this.IAuthTabCallback.IAuthTabCallback;
            Intrinsics.checkNotNullExpressionValue(tdsSquircleLayoutV1, "");
            tdsSquircleLayoutV1.setVisibility(8);
            return;
        }
        TdsSquircleLayoutV1 tdsSquircleLayoutV12 = this.IAuthTabCallback.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(tdsSquircleLayoutV12, "");
        tdsSquircleLayoutV12.setVisibility(0);
        TdsImageView tdsImageView = this.IAuthTabCallback.onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        tdsImageView.setVisibility(0);
        LottieAnimationView lottieAnimationView = this.IAuthTabCallback.onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "");
        lottieAnimationView.setVisibility(8);
        Context context9 = getContext();
        Intrinsics.checkNotNullExpressionValue(context9, "");
        RecomposerawaitIdle2.onNavigationEvent onnavigationeventOnExtraCallback = new RecomposerawaitIdle2.onNavigationEvent(context9).onExtraCallback(strAsBinder);
        Context context10 = getContext();
        Intrinsics.checkNotNullExpressionValue(context10, "");
        CarouselKtCarousel4ExternalSyntheticLambda0.onExtraCallbackWithResult(context10).onWarmupCompleted(RecomposerrecompositionRunner2.IAuthTabCallback(onnavigationeventOnExtraCallback.IAuthTabCallback(new asBinder()), true).onExtraCallbackWithResult());
    }

    public static final class asBinder implements ReusableRememberObserverHolder {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        asBinder() {
        }

        public /* bridge */ void IAuthTabCallback(CarouselKtExternalSyntheticLambda7 carouselKtExternalSyntheticLambda7) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 59;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            super.IAuthTabCallback(carouselKtExternalSyntheticLambda7);
            int i4 = onExtraCallback + 55;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }

        public /* bridge */ void onWarmupCompleted(CarouselKtExternalSyntheticLambda7 carouselKtExternalSyntheticLambda7) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 77;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            super.onWarmupCompleted(carouselKtExternalSyntheticLambda7);
            int i4 = onNavigationEvent + 117;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public void onExtraCallbackWithResult(CarouselKtExternalSyntheticLambda7 carouselKtExternalSyntheticLambda7) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 103;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(carouselKtExternalSyntheticLambda7, "");
            NativeAdsRightBannerView.onExtraCallbackWithResult(NativeAdsRightBannerView.this).onWarmupCompleted.setImageBitmap(CarouselPagerStateExternalSyntheticLambda1.onExtraCallbackWithResult(carouselKtExternalSyntheticLambda7, 0, 0, 3, (Object) null));
            NativeAdsRightBannerView.onExtraCallbackWithResult(NativeAdsRightBannerView.this).IAuthTabCallback.setApplySquircle(!AFj1qSDK.onNavigationEvent.onExtraCallback(r5));
            int i4 = onExtraCallback + 1;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public interface onNavigationEvent {
        void onExtraCallbackWithResult(@NotNull NativeAdsDto.Creative.RightBanner rightBanner, @NotNull String str, @Nullable String str2);

        static /* synthetic */ void onWarmupCompleted(onNavigationEvent onnavigationevent, NativeAdsDto.Creative.RightBanner rightBanner, String str, String str2, int i, Object obj) {
            int i2 = 2 % 2;
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onClick");
            }
            if ((i & 4) != 0) {
                str2 = null;
            }
            onnavigationevent.onExtraCallbackWithResult(rightBanner, str, str2);
        }
    }
}
