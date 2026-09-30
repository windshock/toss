package im.toss.ads_sdk.ui.v2.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.ads_sdk.model.NativeAdsDto;
import im.toss.tds.view.component.atom.text.SubTypography13;
import im.toss.tds.view.component.atom.text.Typography5;
import im.toss.tds.view.component.atom.text.Typography7;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import im.toss.tds.view.component.widget.TdsSquircleLayoutV1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import o.RecomposerKt;
import o.access8100;
import o.deleteProfile;
import o.getAdService;
import o.getRearDisplayMetrics;
import o.getSpecialFeatureOptInStatus;
import o.getStrokeWidth;
import o.getUrlokhttp;
import o.getWrite;
import o.patch;
import o.readIntokhttp;
import o.setRootAlpha;
import o.setTagsokhttp;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class NativeAdsNormalV2View extends ConstraintLayout {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private final setRootAlpha onWarmupCompleted;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NativeAdsNormalV2View(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NativeAdsNormalV2View(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ Unit onExtraCallback(NativeAdsNormalV2View nativeAdsNormalV2View, onNavigationEvent onnavigationevent, NativeAdsDto.Creative.Normal normal, String str, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 125;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(nativeAdsNormalV2View, onnavigationevent, normal, str, motionEvent);
        if (i3 != 0) {
            int i4 = 77 / 0;
        }
        int i5 = onExtraCallbackWithResult + 89;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 45 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallback(NativeAdsNormalV2View nativeAdsNormalV2View, RecomposerKt recomposerKt) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 51;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(nativeAdsNormalV2View, recomposerKt);
        }
        onNavigationEvent(nativeAdsNormalV2View, recomposerKt);
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(NativeAdsNormalV2View nativeAdsNormalV2View, Throwable th) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 7;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(nativeAdsNormalV2View, th);
        if (i3 != 0) {
            int i4 = 89 / 0;
        }
        int i5 = IAuthTabCallback + 119;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NativeAdsNormalV2View(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        setRootAlpha setrootalphaIAuthTabCallback = setRootAlpha.IAuthTabCallback(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(setrootalphaIAuthTabCallback, "");
        this.onWarmupCompleted = setrootalphaIAuthTabCallback;
        TdsRoundLayout tdsRoundLayout = setrootalphaIAuthTabCallback.onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayout, "");
        patch.IAuthTabCallback(tdsRoundLayout, 0.0f, 1, (Object) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ NativeAdsNormalV2View(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = IAuthTabCallback + 101;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 2 % 2;
            }
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i5 = IAuthTabCallback + 73;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public static final class IAuthTabCallback implements getAdService {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onNavigationEvent;

        public IAuthTabCallback(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 59;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onNavigationEvent)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i4 = onExtraCallback + 75;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            if (i5 != 0) {
                return getspecialfeatureoptinstatus;
            }
            throw null;
        }
    }

    public static final class IAuthTabCallbackDefault implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Configuration onExtraCallback;

        public IAuthTabCallbackDefault(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i2 = IAuthTabCallback + 85;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return getspecialfeatureoptinstatus;
            }
            int i4 = onNavigationEvent + 111;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Dark;
            if (i5 == 0) {
                return getspecialfeatureoptinstatus2;
            }
            throw null;
        }
    }

    public static final class IAuthTabCallbackStub implements getAdService {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public IAuthTabCallbackStub(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i2 = onExtraCallback + 81;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            int i4 = onNavigationEvent + 85;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return getspecialfeatureoptinstatus;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class IAuthTabCallback_Parcel implements getAdService {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Configuration onExtraCallback;

        public IAuthTabCallback_Parcel(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 21;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i4 = onNavigationEvent + 23;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return getSpecialFeatureOptInStatus.Dark;
        }
    }

    public static final class asBinder implements getAdService {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Configuration onExtraCallback;

        public asBinder(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i2 = onNavigationEvent + 53;
            onWarmupCompleted = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                throw null;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Dark;
            int i3 = onWarmupCompleted + 39;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                return getspecialfeatureoptinstatus2;
            }
            obj.hashCode();
            throw null;
        }
    }

    public static final class asInterface implements getAdService {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public asInterface(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 125;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            if (!(!readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult))) {
                return getSpecialFeatureOptInStatus.Dark;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
            int i4 = onExtraCallback + 5;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class onExtraCallback implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onExtraCallback(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 67;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i4 = IAuthTabCallback + 101;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return getSpecialFeatureOptInStatus.Dark;
        }
    }

    public static final class onExtraCallbackWithResult implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onExtraCallbackWithResult(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 41;
            IAuthTabCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                if (!readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                    return getSpecialFeatureOptInStatus.Light;
                }
                int i3 = onNavigationEvent + 93;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                if (i4 == 0) {
                    return getspecialfeatureoptinstatus;
                }
                obj.hashCode();
                throw null;
            }
            readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult);
            throw null;
        }
    }

    public static final class onTransact implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Configuration onExtraCallback;

        public onTransact(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                int i2 = IAuthTabCallback + 17;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return getSpecialFeatureOptInStatus.Dark;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
            int i4 = onNavigationEvent + 41;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return getspecialfeatureoptinstatus;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class onWarmupCompleted implements getAdService {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ Configuration onWarmupCompleted;

        public onWarmupCompleted(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
        
            if ((r2 % 2) != 0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
        
            return o.getSpecialFeatureOptInStatus.Light;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r4.onWarmupCompleted) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r4.onWarmupCompleted) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
        
            r1 = o.getSpecialFeatureOptInStatus.Dark;
            r2 = im.toss.ads_sdk.ui.v2.view.NativeAdsNormalV2View.onWarmupCompleted.onExtraCallback + 39;
            im.toss.ads_sdk.ui.v2.view.NativeAdsNormalV2View.onWarmupCompleted.onExtraCallbackWithResult = r2 % 128;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 107;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 29 / 0;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setItem(@NotNull NativeAdsDto.Creative.Normal normal, @NotNull deleteProfile deleteprofile, boolean z, @NotNull onNavigationEvent onnavigationevent) throws NoWhenBranchMatchedException {
        int iIsEngagementSignalsApiAvailable;
        int iIsEngagementSignalsApiAvailable2;
        int iICustomTabsCallbackStubProxy;
        int iOnMinimized;
        int iOnMessageChannelReady;
        Configuration configuration;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 11;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(normal, "");
        Intrinsics.checkNotNullParameter(deleteprofile, "");
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        IAuthTabCallback(normal.asBinder());
        IAuthTabCallback(normal, z);
        getStrokeWidth getstrokewidth = getStrokeWidth.onExtraCallback;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        boolean zOnExtraCallbackWithResult = getstrokewidth.onExtraCallbackWithResult(context, deleteprofile);
        if (zOnExtraCallbackWithResult) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            Configuration configuration2 = context2.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration2, "");
            iIsEngagementSignalsApiAvailable = new getUrlokhttp(new onExtraCallback(configuration2)).onSessionEnded();
        } else {
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            Configuration configuration3 = context3.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration3, "");
            iIsEngagementSignalsApiAvailable = new getUrlokhttp(new onWarmupCompleted(configuration3)).requestPostMessageChannel().isEngagementSignalsApiAvailable();
        }
        if (zOnExtraCallbackWithResult) {
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            Configuration configuration4 = context4.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration4, "");
            iIsEngagementSignalsApiAvailable2 = new getUrlokhttp(new IAuthTabCallback(configuration4)).onSessionEnded();
        } else {
            Context context5 = getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "");
            Configuration configuration5 = context5.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration5, "");
            iIsEngagementSignalsApiAvailable2 = new getUrlokhttp(new asBinder(configuration5)).requestPostMessageChannel().isEngagementSignalsApiAvailable();
        }
        Typography5 typography5 = this.onWarmupCompleted.onExtraCallback;
        if (zOnExtraCallbackWithResult) {
            Context context6 = getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "");
            Configuration configuration6 = context6.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration6, "");
            iICustomTabsCallbackStubProxy = new getUrlokhttp(new IAuthTabCallbackDefault(configuration6)).IPostMessageServiceDefault();
        } else {
            Context context7 = getContext();
            Intrinsics.checkNotNullExpressionValue(context7, "");
            Configuration configuration7 = context7.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration7, "");
            iICustomTabsCallbackStubProxy = new getUrlokhttp(new IAuthTabCallbackStub(configuration7)).requestPostMessageChannel().ICustomTabsCallbackStubProxy();
            int i4 = onExtraCallbackWithResult + 95;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        typography5.setTextColor(iICustomTabsCallbackStubProxy);
        Typography7 typography7 = this.onWarmupCompleted.asInterface;
        if (zOnExtraCallbackWithResult) {
            Context context8 = getContext();
            Intrinsics.checkNotNullExpressionValue(context8, "");
            Configuration configuration8 = context8.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration8, "");
            iOnMinimized = new getUrlokhttp(new onTransact(configuration8)).IPostMessageService();
        } else {
            Context context9 = getContext();
            Intrinsics.checkNotNullExpressionValue(context9, "");
            Configuration configuration9 = context9.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration9, "");
            iOnMinimized = new getUrlokhttp(new asInterface(configuration9)).requestPostMessageChannel().onMinimized();
        }
        typography7.setTextColor(iOnMinimized);
        SubTypography13 subTypography13 = this.onWarmupCompleted.IAuthTabCallback;
        if (zOnExtraCallbackWithResult) {
            Context context10 = getContext();
            Intrinsics.checkNotNullExpressionValue(context10, "");
            Configuration configuration10 = context10.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration10, "");
            iOnMessageChannelReady = new getUrlokhttp(new IAuthTabCallback_Parcel(configuration10)).onVerticalScrollEvent();
        } else {
            Context context11 = getContext();
            Intrinsics.checkNotNullExpressionValue(context11, "");
            Configuration configuration11 = context11.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration11, "");
            iOnMessageChannelReady = new getUrlokhttp(new onExtraCallbackWithResult(configuration11)).requestPostMessageChannel().onMessageChannelReady();
        }
        subTypography13.setTextColor(iOnMessageChannelReady);
        this.onWarmupCompleted.onNavigationEvent.setBackgroundColor(iIsEngagementSignalsApiAvailable);
        this.onWarmupCompleted.onNavigationEvent.setStrokeColor(iIsEngagementSignalsApiAvailable2);
        this.onWarmupCompleted.onNavigationEvent.setStrokeWidth(setTagsokhttp.onExtraCallbackWithResult(this, Double.valueOf(1.5d)));
        DeactivateEncoderSurfaceBeforeStopEncoderQuirk deactivateEncoderSurfaceBeforeStopEncoderQuirk = new DeactivateEncoderSurfaceBeforeStopEncoderQuirk();
        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onNavigationEvent(this.onWarmupCompleted.onWarmupCompleted);
        Context context12 = getContext();
        Intrinsics.checkNotNullExpressionValue(context12, "");
        Resources resources = context12.getResources();
        if (((resources == null || (configuration = resources.getConfiguration()) == null) ? 1.0f : configuration.fontScale) > 1.35f) {
            deactivateEncoderSurfaceBeforeStopEncoderQuirk.onWarmupCompleted(this.onWarmupCompleted.onNavigationEvent.getId(), 3, 0, 3);
            deactivateEncoderSurfaceBeforeStopEncoderQuirk.onExtraCallback(this.onWarmupCompleted.onNavigationEvent.getId(), 4);
        } else {
            deactivateEncoderSurfaceBeforeStopEncoderQuirk.onWarmupCompleted(this.onWarmupCompleted.onNavigationEvent.getId(), 3, this.onWarmupCompleted.onExtraCallback.getId(), 3);
            deactivateEncoderSurfaceBeforeStopEncoderQuirk.onWarmupCompleted(this.onWarmupCompleted.onNavigationEvent.getId(), 4, this.onWarmupCompleted.asInterface.getId(), 4);
            deactivateEncoderSurfaceBeforeStopEncoderQuirk.onNavigationEvent(this.onWarmupCompleted.onNavigationEvent.getId(), 0.5f);
        }
        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onExtraCallbackWithResult(this.onWarmupCompleted.onWarmupCompleted);
        requestLayout();
        StringBuilder sb = new StringBuilder();
        sb.append(normal.asInterface());
        sb.append(" ");
        if (!z) {
            sb.append(normal.IAuthTabCallbackStub());
            int i6 = IAuthTabCallback + 99;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
        } else {
            int i8 = onExtraCallbackWithResult + 19;
            IAuthTabCallback = i8 % 128;
            if (i8 % 2 != 0) {
                sb.append(normal.IAuthTabCallbackStub());
                sb.append(" ・ AD");
                throw null;
            }
            sb.append(normal.IAuthTabCallbackStub());
            sb.append(" ・ AD");
        }
        if (normal.IAuthTabCallbackDefault() != null && (!StringsKt.isBlank(r11))) {
            sb.append(" ");
            sb.append(normal.IAuthTabCallbackDefault());
        }
        this.onWarmupCompleted.onWarmupCompleted.setContentDescription(sb.toString());
        this.onWarmupCompleted.onWarmupCompleted.setFocusable(true);
        this.onWarmupCompleted.onWarmupCompleted.setClickable(true);
        this.onWarmupCompleted.onWarmupCompleted.setImportantForAccessibility(1);
        this.onWarmupCompleted.onNavigationEvent.setImportantForAccessibility(2);
        this.onWarmupCompleted.onExtraCallbackWithResult.setImportantForAccessibility(2);
        this.onWarmupCompleted.onExtraCallback.setImportantForAccessibility(2);
        this.onWarmupCompleted.asInterface.setImportantForAccessibility(2);
        this.onWarmupCompleted.IAuthTabCallback.setImportantForAccessibility(2);
        this.onWarmupCompleted.IAuthTabCallbackDefault.setImportantForAccessibility(2);
        Function0<Unit> function0OnWarmupCompleted = getRearDisplayMetrics.onWarmupCompleted(this, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback(this.onWarmupCompleted.onExtraCallback, "1001"), getWrite.IAuthTabCallback(this.onWarmupCompleted.asInterface, "1002"), getWrite.IAuthTabCallback(this.onWarmupCompleted.onNavigationEvent, "2505")}));
        if (!StringsKt.isBlank(normal.onWarmupCompleted())) {
            onExtraCallback(normal, normal.onWarmupCompleted(), function0OnWarmupCompleted, onnavigationevent);
        }
    }

    private final void IAuthTabCallback(String str) {
        int i = 2 % 2;
        this.onWarmupCompleted.onExtraCallbackWithResult.setImage(str, new Function1() { // from class: im.toss.ads_sdk.ui.v2.view.NativeAdsNormalV2View$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 115;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    NativeAdsNormalV2View.onExtraCallback(this.f$0, (RecomposerKt) obj);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                Unit unitOnExtraCallback = NativeAdsNormalV2View.onExtraCallback(this.f$0, (RecomposerKt) obj);
                int i4 = IAuthTabCallback + 43;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return unitOnExtraCallback;
            }
        }, new Function1() { // from class: im.toss.ads_sdk.ui.v2.view.NativeAdsNormalV2View$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 11;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                NativeAdsNormalV2View nativeAdsNormalV2View = this.f$0;
                Throwable th = (Throwable) obj;
                if (i4 == 0) {
                    return NativeAdsNormalV2View.onNavigationEvent(nativeAdsNormalV2View, th);
                }
                NativeAdsNormalV2View.onNavigationEvent(nativeAdsNormalV2View, th);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        });
        int i2 = onExtraCallbackWithResult + 33;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onNavigationEvent(NativeAdsNormalV2View nativeAdsNormalV2View, RecomposerKt recomposerKt) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 1;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(recomposerKt, "");
        TdsSquircleLayoutV1 tdsSquircleLayoutV1 = nativeAdsNormalV2View.onWarmupCompleted.onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(tdsSquircleLayoutV1, "");
        tdsSquircleLayoutV1.setVisibility(0);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 111;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback(NativeAdsNormalV2View nativeAdsNormalV2View, Throwable th) {
        TdsSquircleLayoutV1 tdsSquircleLayoutV1;
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 11;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(th, "");
            tdsSquircleLayoutV1 = nativeAdsNormalV2View.onWarmupCompleted.onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(tdsSquircleLayoutV1, "");
            i = 41;
        } else {
            Intrinsics.checkNotNullParameter(th, "");
            tdsSquircleLayoutV1 = nativeAdsNormalV2View.onWarmupCompleted.onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(tdsSquircleLayoutV1, "");
            i = 8;
        }
        tdsSquircleLayoutV1.setVisibility(i);
        return Unit.INSTANCE;
    }

    private final void onExtraCallback(final NativeAdsDto.Creative.Normal normal, final String str, Function0<Unit> function0, final onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        getStrokeWidth getstrokewidth = getStrokeWidth.onExtraCallback;
        TdsRoundLayout tdsRoundLayout = this.onWarmupCompleted.onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayout, "");
        getStrokeWidth.onExtraCallback(getstrokewidth, tdsRoundLayout, false, null, 0, null, null, 0.0f, 0.0f, null, false, 0L, null, function0, new Function1() { // from class: im.toss.ads_sdk.ui.v2.view.NativeAdsNormalV2View$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 65;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnExtraCallback = NativeAdsNormalV2View.onExtraCallback(this.f$0, onnavigationevent, normal, str, (MotionEvent) obj);
                int i5 = onWarmupCompleted + 33;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 86 / 0;
                }
                return unitOnExtraCallback;
            }
        }, 2045, null);
        int i2 = onExtraCallbackWithResult + 29;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onWarmupCompleted(NativeAdsNormalV2View nativeAdsNormalV2View, onNavigationEvent onnavigationevent, NativeAdsDto.Creative.Normal normal, String str, MotionEvent motionEvent) {
        String str2;
        int i = 2 % 2;
        if (motionEvent != null) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            getStrokeWidth getstrokewidth = getStrokeWidth.onExtraCallback;
            Typography5 typography5 = nativeAdsNormalV2View.onWarmupCompleted.onExtraCallback;
            Intrinsics.checkNotNullExpressionValue(typography5, "");
            if (getstrokewidth.onExtraCallback((View) typography5, x, y)) {
                int i2 = IAuthTabCallback + 5;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                str2 = "1001";
            } else {
                Typography7 typography7 = nativeAdsNormalV2View.onWarmupCompleted.asInterface;
                Intrinsics.checkNotNullExpressionValue(typography7, "");
                if (getstrokewidth.onExtraCallback((View) typography7, x, y)) {
                    int i4 = onExtraCallbackWithResult + 121;
                    IAuthTabCallback = i4 % 128;
                    if (i4 % 2 != 0) {
                        throw null;
                    }
                    str2 = "1002";
                } else {
                    TdsSquircleLayoutV1 tdsSquircleLayoutV1 = nativeAdsNormalV2View.onWarmupCompleted.onNavigationEvent;
                    Intrinsics.checkNotNullExpressionValue(tdsSquircleLayoutV1, "");
                    if (getstrokewidth.onExtraCallback((View) tdsSquircleLayoutV1, x, y)) {
                        int i5 = IAuthTabCallback + 33;
                        onExtraCallbackWithResult = i5 % 128;
                        int i6 = i5 % 2;
                        str2 = "2505";
                    } else {
                        str2 = null;
                    }
                }
            }
            onnavigationevent.onNavigationEvent(normal, str, str2);
        } else {
            onNavigationEvent.onNavigationEvent(onnavigationevent, normal, str, null, 4, null);
        }
        return Unit.INSTANCE;
    }

    public interface onNavigationEvent {
        void onNavigationEvent(@NotNull NativeAdsDto.Creative.Normal normal, @NotNull String str, @Nullable String str2);

        static /* synthetic */ void onNavigationEvent(onNavigationEvent onnavigationevent, NativeAdsDto.Creative.Normal normal, String str, String str2, int i, Object obj) {
            int i2 = 2 % 2;
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onClick");
            }
            if ((i & 4) != 0) {
                str2 = null;
            }
            onnavigationevent.onNavigationEvent(normal, str, str2);
        }
    }

    private final void IAuthTabCallback(NativeAdsDto.Creative.Normal normal, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 93;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        this.onWarmupCompleted.onExtraCallback.setText(normal.asInterface());
        if (z) {
            this.onWarmupCompleted.asInterface.setText(normal.IAuthTabCallbackStub() + " ・ AD");
        } else {
            this.onWarmupCompleted.asInterface.setText(normal.IAuthTabCallbackStub());
        }
        if (normal.IAuthTabCallbackDefault() != null) {
            int i4 = onExtraCallbackWithResult + 59;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0 ? (!StringsKt.isBlank(r6)) : (!StringsKt.isBlank(r6))) {
                SubTypography13 subTypography13 = this.onWarmupCompleted.IAuthTabCallback;
                Intrinsics.checkNotNullExpressionValue(subTypography13, "");
                subTypography13.setVisibility(0);
                View view = this.onWarmupCompleted.IAuthTabCallbackDefault;
                Intrinsics.checkNotNullExpressionValue(view, "");
                view.setVisibility(0);
                this.onWarmupCompleted.IAuthTabCallback.setText(normal.IAuthTabCallbackDefault());
                if (normal.IAuthTabCallbackDefault().length() > 60) {
                    this.onWarmupCompleted.IAuthTabCallback.setTextSize(1, 6.0f);
                    return;
                } else {
                    this.onWarmupCompleted.IAuthTabCallback.setTextSize(1, 8.0f);
                    return;
                }
            }
        }
        View view2 = this.onWarmupCompleted.IAuthTabCallbackDefault;
        Intrinsics.checkNotNullExpressionValue(view2, "");
        view2.setVisibility(8);
        SubTypography13 subTypography132 = this.onWarmupCompleted.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(subTypography132, "");
        subTypography132.setVisibility(8);
    }
}
