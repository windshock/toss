package im.toss.uikit.chart;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ComposeShader;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.iap.android.mppclient.container.constant.JsParamKeys;
import im.toss.features.tosscert.ui.R;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.tds.view.component.atom.badge.TdsBadgeV1View;
import im.toss.uikit.chart.AbsChart;
import im.toss.uikit.chart.BarChart$;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt__StringsKt;
import o.AFj1sSDK;
import o.AppLovinSdkSettings;
import o.access15300;
import o.deprecated_certificatePinner;
import o.getAdService;
import o.getExtraParameters;
import o.getPreRenderJob;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.getWrite;
import o.isFireOS;
import o.isMuted;
import o.pxToDp;
import o.readIntokhttp;
import o.response;
import o.runOnUiThreadDelayed;
import o.setDone;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;
import viva.republica.toss.main.more.notification.NotificationSettingAdapter$;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class BarChart extends AbsChart {
    private static int ICustomTabsCallback_Parcel = 0;
    private static int extraCommand = 0;
    private static int isEngagementSignalsApiAvailable = 1;
    private static int mayLaunchUrl = 1;
    private Paint IAuthTabCallback;
    private boolean IAuthTabCallbackDefault;
    private boolean IAuthTabCallbackStub;
    private final int IAuthTabCallbackStubProxy;
    private Float IAuthTabCallback_Parcel;
    private float ICustomTabsCallback;
    private IAuthTabCallback ICustomTabsCallbackDefault;
    private final float ICustomTabsCallbackStub;
    private int ICustomTabsCallbackStubProxy;
    private float ICustomTabsService;
    private Float access000;
    private boolean access100;
    private boolean asBinder;
    private boolean asInterface;
    private float extraCallback;
    private int extraCallbackWithResult;
    private float getInterfaceDescriptor;
    private float onActivityLayout;
    private final Paint onActivityResized;
    private ArrayList<onExtraCallbackWithResult> onExtraCallback;
    private final float onMessageChannelReady;
    private TdsBadgeV1View.onWarmupCompleted onMinimized;
    private final Lazy onNavigationEvent;
    private float onPostMessage;
    private final Paint onRelationshipValidationResult;
    private onExtraCallbackWithResult onTransact;
    private final float onUnminimized;
    private final Lazy onWarmupCompleted;
    private float readTypedObject;
    private runOnUiThreadDelayed writeTypedObject;
    public static final onExtraCallback Companion = new onExtraCallback(null);
    public static final int onExtraCallbackWithResult = 8;

    public static final /* synthetic */ class onWarmupCompleted {
        public static final /* synthetic */ int[] onExtraCallback;
        private static int onExtraCallbackWithResult = 1;
        public static final /* synthetic */ int[] onNavigationEvent;
        private static int onWarmupCompleted;

        static {
            int[] iArr = new int[onNavigationEvent.values().length];
            try {
                iArr[onNavigationEvent.SPACE_BETWEEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[onNavigationEvent.SPACE_AROUND.ordinal()] = 2;
                int i = onExtraCallbackWithResult + 65;
                onWarmupCompleted = i % 128;
                if (i % 2 != 0) {
                    int i2 = 5 / 3;
                } else {
                    int i3 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            onNavigationEvent = iArr;
            int[] iArr2 = new int[IAuthTabCallback.values().length];
            try {
                iArr2[IAuthTabCallback.SOLID.ordinal()] = 1;
                int i4 = onWarmupCompleted + 43;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[IAuthTabCallback.DASH_DOTTED.ordinal()] = 2;
                int i7 = 2 % 2;
            } catch (NoSuchFieldError unused4) {
            }
            onExtraCallback = iArr2;
        }
    }

    static {
        int i = isEngagementSignalsApiAvailable + 95;
        ICustomTabsCallback_Parcel = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BarChart(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BarChart(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ Path IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 29;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Path pathIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        int i4 = extraCommand + 55;
        mayLaunchUrl = i4 % 128;
        if (i4 % 2 != 0) {
            return pathIAuthTabCallbackDefault;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(onExtraCallbackWithResult onextracallbackwithresult, BarChart barChart, float f) {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 53;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(onextracallbackwithresult, barChart, f);
        if (i3 != 0) {
            int i4 = 97 / 0;
        }
        int i5 = extraCommand + 43;
        mayLaunchUrl = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallbackWithResult;
    }

    private static final boolean onExtraCallbackWithResult(int i) {
        int i2 = 2 % 2;
        int i3 = mayLaunchUrl;
        int i4 = i3 + 105;
        extraCommand = i4 % 128;
        if (i4 % 2 != 0) {
            if (i <= 3) {
                return true;
            }
        } else if (i <= 3) {
            return true;
        }
        int i5 = i3 + 93;
        extraCommand = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~(i6 | i4);
        int i8 = ~i6;
        int i9 = ~i4;
        int i10 = i8 | i9;
        int i11 = i7 | (~(i10 | i3));
        int i12 = i9 | i6;
        int i13 = (~i10) | i3;
        int i14 = i3 + i6 + i2 + ((-1587644119) * i) + (1302866265 * i5);
        int i15 = i14 * i14;
        int i16 = (i3 * (-1579585154)) + 1163788288 + ((-1579585154) * i6) + ((-914001539) * i11) + (i12 * 914001539) + (914001539 * i13) + ((-665583616) * i2) + (1500774400 * i) + ((-1456209920) * i5) + ((-2144468992) * i15);
        int i17 = ((i3 * (-855313886)) - 1253577507) + (i6 * (-855313886)) + (i11 * (-13)) + (i12 * 13) + (i13 * 13) + (i2 * (-855313873)) + (i * (-1467678585)) + (i5 * 593082711) + (i15 * 74579968);
        int i18 = i16 + (i17 * i17 * (-1668153344));
        if (i18 == 1) {
            return onNavigationEvent(objArr);
        }
        if (i18 == 2) {
            return onExtraCallbackWithResult(objArr);
        }
        if (i18 == 3) {
            return IAuthTabCallback(objArr);
        }
        if (i18 == 4) {
            return onWarmupCompleted(objArr);
        }
        onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) objArr[0];
        int i19 = 2 % 2;
        int i20 = mayLaunchUrl + 29;
        extraCommand = i20 % 128;
        int i21 = i20 % 2;
        boolean zOnExtraCallback = onExtraCallback(onextracallbackwithresult);
        int i22 = extraCommand + 57;
        mayLaunchUrl = i22 % 128;
        int i23 = i22 % 2;
        return Boolean.valueOf(zOnExtraCallback);
    }

    public static /* synthetic */ float[] onTransact() {
        int i = 2 % 2;
        int i2 = extraCommand + 85;
        mayLaunchUrl = i2 % 128;
        if (i2 % 2 != 0) {
            return asInterface();
        }
        asInterface();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        int i = 2 % 2;
        int i2 = mayLaunchUrl + Imgproc.COLOR_YUV2RGBA_YVYU;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult(iIntValue);
        int i4 = extraCommand + 61;
        mayLaunchUrl = i4 % 128;
        if (i4 % 2 != 0) {
            return Boolean.valueOf(zOnExtraCallbackWithResult);
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(BarChart barChart) {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 53;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(barChart);
        int i4 = mayLaunchUrl + 95;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BarChart(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.onExtraCallback = new ArrayList<>();
        Paint paint = new Paint(7);
        this.onRelationshipValidationResult = paint;
        Paint paint2 = new Paint(7);
        this.onActivityResized = paint2;
        int iOnTransact = varyMatches.onTransact(this, 11);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        float fMin = Math.min(iOnTransact, varyMatches.onNavigationEvent(14, displayMetrics));
        this.onMessageChannelReady = fMin;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Configuration configuration = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        this.extraCallbackWithResult = new getUrlokhttp(new IAuthTabCallbackStub(configuration)).ICustomTabsCallbackStubProxy();
        DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        this.IAuthTabCallbackStubProxy = varyMatches.onNavigationEvent(4, displayMetrics2);
        this.IAuthTabCallback = new Paint(7);
        Intrinsics.checkNotNullExpressionValue(getResources().getDisplayMetrics(), "");
        this.ICustomTabsCallbackStub = varyMatches.onNavigationEvent(Double.valueOf(1.5d), r13);
        Intrinsics.checkNotNullExpressionValue(getResources().getDisplayMetrics(), "");
        this.onUnminimized = varyMatches.onNavigationEvent(Double.valueOf(0.75d), r13);
        this.onNavigationEvent = LazyKt__LazyJVMKt.lazy(new BarChart$.ExternalSyntheticLambda2());
        this.onWarmupCompleted = LazyKt__LazyJVMKt.lazy(new BarChart$.ExternalSyntheticLambda3());
        this.IAuthTabCallbackDefault = true;
        this.asInterface = true;
        this.asBinder = true;
        this.onMinimized = TdsBadgeV1View.onWarmupCompleted.RED;
        Intrinsics.checkNotNullExpressionValue(context.getResources().getDisplayMetrics(), "");
        this.onActivityLayout = varyMatches.onNavigationEvent(8, r13);
        Intrinsics.checkNotNullExpressionValue(context.getResources().getDisplayMetrics(), "");
        this.extraCallback = varyMatches.onNavigationEvent(6, r13);
        this.ICustomTabsCallbackDefault = IAuthTabCallback.DASH_DOTTED;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        Configuration configuration2 = context3.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        this.ICustomTabsCallbackStubProxy = new getUrlokhttp(new onTransact(configuration2)).onActivityResized();
        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        paint.setTextSize(((Float) onNavigationEvent(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -1438604423, new Object[]{this}, iIAuthTabCallback, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 1438604424)).floatValue());
        Paint.Align align = Paint.Align.CENTER;
        paint.setTextAlign(align);
        paint.setTypeface(response.toTypeface$default(response.SemiBold, context, (setDone) null, 2, (Object) null));
        paint2.setColor(this.extraCallbackWithResult);
        paint2.setTextSize(fMin);
        paint2.setTextAlign(align);
        paint2.setTypeface(response.toTypeface$default(response.Medium, context, (setDone) null, 2, (Object) null));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BarChart(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = extraCommand + Imgproc.COLOR_YUV2RGBA_YVYU;
            mayLaunchUrl = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i5 = mayLaunchUrl + 101;
            extraCommand = i5 % 128;
            i = i5 % 2 != 0 ? 1 : 0;
            int i6 = 2 % 2;
        }
        this(context, attributeSet, i);
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int iOnTransact;
        DisplayMetrics displayMetrics;
        int i;
        BarChart barChart = (BarChart) objArr[0];
        int i2 = 2 % 2;
        int i3 = extraCommand + 73;
        mayLaunchUrl = i3 % 128;
        if (i3 % 2 == 0) {
            iOnTransact = varyMatches.onTransact(barChart, 114);
            displayMetrics = barChart.getContext().getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            i = 77;
        } else {
            iOnTransact = varyMatches.onTransact(barChart, 13);
            displayMetrics = barChart.getContext().getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            i = 15;
        }
        float fMin = Math.min(iOnTransact, varyMatches.onNavigationEvent(Integer.valueOf(i), displayMetrics));
        int i4 = extraCommand + 13;
        mayLaunchUrl = i4 % 128;
        int i5 = i4 % 2;
        return Float.valueOf(fMin);
    }

    private static final Path IAuthTabCallbackDefault() {
        int i = 2 % 2;
        Path path = new Path();
        int i2 = mayLaunchUrl + 97;
        extraCommand = i2 % 128;
        if (i2 % 2 == 0) {
            return path;
        }
        throw null;
    }

    private final Path asBinder() {
        int i = 2 % 2;
        int i2 = extraCommand + 71;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        Path path = (Path) this.onNavigationEvent.getValue();
        if (i3 == 0) {
            int i4 = 87 / 0;
        }
        return path;
    }

    private final float[] getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 55;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        float[] fArr = (float[]) this.onWarmupCompleted.getValue();
        int i4 = extraCommand + 9;
        mayLaunchUrl = i4 % 128;
        int i5 = i4 % 2;
        return fArr;
    }

    private static final float[] asInterface() {
        int i = 2 % 2;
        int i2 = extraCommand;
        int i3 = i2 + 1;
        mayLaunchUrl = i3 % 128;
        float[] fArr = new float[i3 % 2 == 0 ? 52 : 8];
        int i4 = i2 + 87;
        mayLaunchUrl = i4 % 128;
        int i5 = i4 % 2;
        return fArr;
    }

    public final void setBarAllRounded(boolean z) {
        int i = 2 % 2;
        int i2 = extraCommand + 115;
        int i3 = i2 % 128;
        mayLaunchUrl = i3;
        int i4 = i2 % 2;
        Object obj = null;
        this.IAuthTabCallbackDefault = z;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 79;
        extraCommand = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final void setDrawZeroLine(boolean z) {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 27;
        extraCommand = i2 % 128;
        if (i2 % 2 == 0) {
            this.IAuthTabCallbackStub = z;
            requestLayout();
            int i3 = mayLaunchUrl + 79;
            extraCommand = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 91 / 0;
                return;
            }
            return;
        }
        this.IAuthTabCallbackStub = z;
        requestLayout();
        throw null;
    }

    public static final class IAuthTabCallbackStub implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ Configuration onNavigationEvent;

        public IAuthTabCallbackStub(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 109;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                if (!readIntokhttp.onExtraCallback(this.onNavigationEvent)) {
                    return getSpecialFeatureOptInStatus.Light;
                }
                int i3 = onExtraCallback + 49;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                int i5 = onExtraCallback + 89;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return getspecialfeatureoptinstatus;
            }
            readIntokhttp.onExtraCallback(this.onNavigationEvent);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class onTransact implements getAdService {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ Configuration onWarmupCompleted;

        public onTransact(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
        
            return o.getSpecialFeatureOptInStatus.Light;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
        
            r1 = o.getSpecialFeatureOptInStatus.Dark;
            r2 = im.toss.uikit.chart.BarChart.onTransact.onExtraCallback + 51;
            im.toss.uikit.chart.BarChart.onTransact.onExtraCallbackWithResult = r2 % 128;
            r2 = r2 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r4.onWarmupCompleted) != false) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
        
            if ((!o.readIntokhttp.onExtraCallback(r4.onWarmupCompleted)) != false) goto L9;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 115;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 97 / 0;
            }
        }
    }

    public final void setDrawTitleText(boolean z) {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 79;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        this.asInterface = z;
        requestLayout();
        int i4 = extraCommand + Imgproc.COLOR_YUV2RGB_YVYU;
        mayLaunchUrl = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setDrawValueText(boolean z) {
        int i = 2 % 2;
        int i2 = extraCommand + 105;
        mayLaunchUrl = i2 % 128;
        if (i2 % 2 != 0) {
            this.asBinder = z;
            requestLayout();
        } else {
            this.asBinder = z;
            requestLayout();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final void setValueBadge(boolean z) {
        int i = 2 % 2;
        int i2 = extraCommand + 119;
        mayLaunchUrl = i2 % 128;
        if (i2 % 2 != 0) {
            this.access100 = z;
            requestLayout();
        } else {
            this.access100 = z;
            requestLayout();
            throw null;
        }
    }

    public final void setValueBadgeType(@NotNull TdsBadgeV1View.onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = extraCommand + 105;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        this.onMinimized = onwarmupcompleted;
        requestLayout();
        int i4 = mayLaunchUrl + 101;
        extraCommand = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final void setValueMargin(float f) {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 53;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        this.onActivityLayout = f;
        requestLayout();
        int i4 = extraCommand + 69;
        mayLaunchUrl = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setTitleMargin(float f) {
        int i = 2 % 2;
        int i2 = extraCommand + 33;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        this.extraCallback = f;
        requestLayout();
        int i4 = extraCommand + 65;
        mayLaunchUrl = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final void setMaxBarWidth(@Nullable Float f) {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 47;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallback_Parcel = f;
        requestLayout();
        int i4 = extraCommand + 7;
        mayLaunchUrl = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setMaxBarMargin(@Nullable Float f) {
        int i = 2 % 2;
        int i2 = extraCommand + 65;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        this.access000 = f;
        requestLayout();
        int i4 = extraCommand + 15;
        mayLaunchUrl = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final void setZeroLineStyle(@NotNull IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = extraCommand + 39;
        mayLaunchUrl = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            this.ICustomTabsCallbackDefault = iAuthTabCallback;
            requestLayout();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        this.ICustomTabsCallbackDefault = iAuthTabCallback;
        requestLayout();
        int i3 = mayLaunchUrl + 29;
        extraCommand = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void setZeroLineColor(int i) {
        int i2 = 2 % 2;
        int i3 = extraCommand + 105;
        mayLaunchUrl = i3 % 128;
        if (i3 % 2 != 0) {
            this.ICustomTabsCallbackStubProxy = i;
            requestLayout();
            int i4 = extraCommand + 45;
            mayLaunchUrl = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 46 / 0;
                return;
            }
            return;
        }
        this.ICustomTabsCallbackStubProxy = i;
        requestLayout();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(onExtraCallbackWithResult onextracallbackwithresult, BarChart barChart, float f) {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 113;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted3 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        AbsChart.IAuthTabCallback.onExtraCallbackWithResult((AbsChart.IAuthTabCallback) onExtraCallbackWithResult.onExtraCallbackWithResult(568818806, iOnWarmupCompleted2, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), new Object[]{onextracallbackwithresult}, -568818806, iOnWarmupCompleted, iOnWarmupCompleted3), f, false, 2, null);
        AbsChart.IAuthTabCallback.onExtraCallbackWithResult(onextracallbackwithresult.asBinder(), f, false, 2, null);
        AbsChart.IAuthTabCallback.onExtraCallbackWithResult(onextracallbackwithresult.onNavigationEvent(), RangesKt___RangesKt.coerceIn(f, 0.0f, 1.0f), false, 2, null);
        AbsChart.IAuthTabCallback.onExtraCallbackWithResult(onextracallbackwithresult.onTransact(), RangesKt___RangesKt.coerceIn(f, 0.0f, 1.0f), false, 2, null);
        int iOnWarmupCompleted4 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted5 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted6 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        AbsChart.IAuthTabCallback.onExtraCallbackWithResult((AbsChart.IAuthTabCallback) onExtraCallbackWithResult.onExtraCallbackWithResult(-140069223, iOnWarmupCompleted5, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), new Object[]{onextracallbackwithresult}, 140069224, iOnWarmupCompleted4, iOnWarmupCompleted6), f, false, 2, null);
        AbsChart.IAuthTabCallback.onExtraCallbackWithResult(onextracallbackwithresult.IAuthTabCallbackDefault(), f, false, 2, null);
        onextracallbackwithresult.onExtraCallback().IAuthTabCallback(RangesKt___RangesKt.coerceIn(f, 0.0f, 1.0f), true);
        onextracallbackwithresult.asInterface().IAuthTabCallback(RangesKt___RangesKt.coerceIn(f, 0.0f, 1.0f), true);
        onextracallbackwithresult.IAuthTabCallbackStubProxy().IAuthTabCallback(RangesKt___RangesKt.coerceIn(f, 0.0f, 1.0f), true);
        barChart.postInvalidate();
        Unit unit = Unit.INSTANCE;
        int i4 = mayLaunchUrl + 49;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0842 A[LOOP:2: B:168:0x083c->B:170:0x0842, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0904  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0907  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0327  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onMeasure(int i, int i2) {
        float fOnNavigationEvent;
        float f;
        int iOnNavigationEvent;
        float fIAuthTabCallback;
        float f2;
        int iOnNavigationEvent2;
        float fIAuthTabCallback2;
        Iterator<T> it;
        Float fValueOf;
        float fFloatValue;
        Iterator<T> it2;
        Float fValueOf2;
        float fFloatValue2;
        float measuredHeight;
        int paddingBottom;
        Float fValueOf3;
        float fFloatValue3;
        float f3;
        float f4;
        float f5;
        int i3;
        Iterator<T> it3;
        float paddingLeft;
        int i4;
        onNavigationEvent onnavigationevent;
        float f6;
        AbsChart.IAuthTabCallback iAuthTabCallback;
        AbsChart.IAuthTabCallback iAuthTabCallback2;
        AbsChart.IAuthTabCallback iAuthTabCallback3;
        AbsChart.IAuthTabCallback iAuthTabCallback4;
        AbsChart.IAuthTabCallback iAuthTabCallback5;
        AbsChart.IAuthTabCallback iAuthTabCallback6;
        AbsChart.IAuthTabCallback iAuthTabCallback7;
        AbsChart.IAuthTabCallback iAuthTabCallback8;
        AbsChart.IAuthTabCallback iAuthTabCallback9;
        Bitmap bitmap;
        int i5 = 2;
        int i6 = 2 % 2;
        super.onMeasure(i, i2);
        setMeasuredDimension(View.getDefaultSize(getSuggestedMinimumWidth(), i), View.getDefaultSize(getSuggestedMinimumHeight(), i2));
        runOnUiThreadDelayed runonuithreaddelayed = this.writeTypedObject;
        if (runonuithreaddelayed != null) {
            runonuithreaddelayed.onNavigationEvent();
        }
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int size = onWarmupCompleted().size();
        onNavigationEvent onnavigationevent2 = onNavigationEvent.SPACE_BETWEEN;
        float f7 = 0.0f;
        if (size != 0) {
            Float f8 = this.IAuthTabCallback_Parcel;
            if (f8 == null && this.access000 == null) {
                fIAuthTabCallback = (measuredWidth / size) / 8.0f;
                f2 = fIAuthTabCallback * 6.0f;
                onnavigationevent2 = onNavigationEvent.SPACE_AROUND;
            } else {
                if (size >= 2) {
                    if (size < 6) {
                        if (f8 != null) {
                            int i7 = mayLaunchUrl + 41;
                            extraCommand = i7 % 128;
                            int i8 = i7 % 2;
                            fOnNavigationEvent = f8.floatValue();
                        } else {
                            onExtraCallback onextracallback = Companion;
                            Context context = getContext();
                            Intrinsics.checkNotNullExpressionValue(context, "");
                            fOnNavigationEvent = onextracallback.onNavigationEvent(context);
                        }
                        float f9 = measuredWidth;
                        float f10 = size;
                        float f11 = size - 1;
                        f = (f9 - (fOnNavigationEvent * f10)) / f11;
                        Intrinsics.checkNotNullExpressionValue(getContext().getResources().getDisplayMetrics(), "");
                        if (f >= varyMatches.onNavigationEvent(20, r11)) {
                            Float f12 = this.access000;
                            if (f12 != null) {
                                int i9 = extraCommand + 113;
                                mayLaunchUrl = i9 % 128;
                                int i10 = i9 % 2;
                                fIAuthTabCallback2 = f12.floatValue();
                            } else {
                                onExtraCallback onextracallback2 = Companion;
                                Context context2 = getContext();
                                Intrinsics.checkNotNullExpressionValue(context2, "");
                                fIAuthTabCallback2 = onextracallback2.IAuthTabCallback(context2);
                            }
                            if (f > fIAuthTabCallback2) {
                                int i11 = extraCommand + 93;
                                mayLaunchUrl = i11 % 128;
                                int i12 = i11 % 2;
                                Float f13 = this.access000;
                                if (f13 != null) {
                                    fIAuthTabCallback = f13.floatValue();
                                } else {
                                    onExtraCallback onextracallback3 = Companion;
                                    Context context3 = getContext();
                                    Intrinsics.checkNotNullExpressionValue(context3, "");
                                    fIAuthTabCallback = onextracallback3.IAuthTabCallback(context3);
                                }
                            }
                            float f14 = fOnNavigationEvent / 6.0f;
                            if (this.access100) {
                                Context context4 = getContext();
                                Intrinsics.checkNotNullExpressionValue(context4, "");
                                TdsBadgeV1View tdsBadgeV1View = new TdsBadgeV1View(context4);
                                tdsBadgeV1View.setTheme(new TdsBadgeV1View.onExtraCallbackWithResult(this.onMinimized, TdsBadgeV1View.onExtraCallback.WEAK_ROUND, TdsBadgeV1View.IAuthTabCallback.LARGE));
                                tdsBadgeV1View.setIncludeFontPadding(false);
                                tdsBadgeV1View.setText("VALUE");
                                tdsBadgeV1View.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                                this.onPostMessage = tdsBadgeV1View.getMeasuredHeight();
                            } else {
                                this.onPostMessage = this.asBinder ^ true ? 0.0f : this.onRelationshipValidationResult.getFontMetrics().descent - this.onRelationshipValidationResult.getFontMetrics().top;
                            }
                            this.readTypedObject = this.asInterface ? this.onActivityResized.getFontMetrics().descent - this.onActivityResized.getFontMetrics().top : 0.0f;
                            it = onWarmupCompleted().iterator();
                            if (it.hasNext()) {
                                float fIAuthTabCallback3 = ((AFj1sSDK) it.next()).IAuthTabCallback();
                                while (it.hasNext()) {
                                    fIAuthTabCallback3 = Math.max(fIAuthTabCallback3, ((AFj1sSDK) it.next()).IAuthTabCallback());
                                }
                                fValueOf = Float.valueOf(fIAuthTabCallback3);
                            } else {
                                fValueOf = null;
                            }
                            if (fValueOf == null) {
                                fFloatValue = 0.0f;
                            } else {
                                if (fValueOf.floatValue() <= 0.0f) {
                                    int i13 = mayLaunchUrl + 123;
                                    extraCommand = i13 % 128;
                                    if (i13 % 2 != 0) {
                                        int i14 = 70 / 0;
                                    }
                                    fValueOf = null;
                                }
                                if (fValueOf != null) {
                                    fFloatValue = fValueOf.floatValue();
                                }
                            }
                            it2 = onWarmupCompleted().iterator();
                            if (it2.hasNext()) {
                                float fIAuthTabCallback4 = ((AFj1sSDK) it2.next()).IAuthTabCallback();
                                while (it2.hasNext()) {
                                    fIAuthTabCallback4 = Math.min(fIAuthTabCallback4, ((AFj1sSDK) it2.next()).IAuthTabCallback());
                                }
                                fValueOf2 = Float.valueOf(fIAuthTabCallback4);
                            } else {
                                fValueOf2 = null;
                            }
                            if (fValueOf2 == null) {
                                fFloatValue2 = 0.0f;
                            } else {
                                if (fValueOf2.floatValue() >= 0.0f) {
                                    int i15 = mayLaunchUrl + 7;
                                    extraCommand = i15 % 128;
                                    int i16 = i15 % 2;
                                    fValueOf2 = null;
                                }
                                if (fValueOf2 != null) {
                                    int i17 = mayLaunchUrl + 29;
                                    extraCommand = i17 % 128;
                                    int i18 = i17 % 2;
                                    fFloatValue2 = fValueOf2.floatValue();
                                }
                            }
                            float fAbs = Math.abs(fFloatValue2);
                            if (fFloatValue == 0.0f || fAbs == 0.0f) {
                                measuredHeight = ((((getMeasuredHeight() - this.onPostMessage) - this.onActivityLayout) - this.readTypedObject) - this.extraCallback) - getPaddingTop();
                                paddingBottom = getPaddingBottom();
                            } else {
                                measuredHeight = ((((getMeasuredHeight() - (this.onPostMessage * 2.0f)) - (this.onActivityLayout * 2.0f)) - this.readTypedObject) - this.extraCallback) - getPaddingTop();
                                paddingBottom = getPaddingBottom();
                            }
                            this.getInterfaceDescriptor = measuredHeight - paddingBottom;
                            if (this.onExtraCallback.size() != size) {
                                this.onExtraCallback.clear();
                            }
                            if (this.onExtraCallback.size() > size) {
                                int i19 = mayLaunchUrl + 111;
                                extraCommand = i19 % 128;
                                int i20 = i19 % 2;
                                int size2 = this.onExtraCallback.size();
                                for (int i21 = size; i21 < size2; i21++) {
                                    int i22 = extraCommand + 39;
                                    mayLaunchUrl = i22 % 128;
                                    int i23 = i22 % 2;
                                    onExtraCallbackWithResult onextracallbackwithresult = this.onExtraCallback.get(i21);
                                    Intrinsics.checkNotNullExpressionValue(onextracallbackwithresult, "");
                                    onExtraCallbackWithResult onextracallbackwithresult2 = onextracallbackwithresult;
                                    ((AbsChart.IAuthTabCallback) onExtraCallbackWithResult.onExtraCallbackWithResult(568818806, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), new Object[]{onextracallbackwithresult2}, -568818806, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted())).onExtraCallbackWithResult(((AbsChart.IAuthTabCallback) onExtraCallbackWithResult.onExtraCallbackWithResult(568818806, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), new Object[]{onextracallbackwithresult2}, -568818806, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted())).onWarmupCompleted());
                                    onextracallbackwithresult2.asBinder().onExtraCallbackWithResult(onextracallbackwithresult2.asBinder().onWarmupCompleted());
                                    onextracallbackwithresult2.onNavigationEvent().onExtraCallbackWithResult(onextracallbackwithresult2.onNavigationEvent().onWarmupCompleted());
                                    onextracallbackwithresult2.onNavigationEvent().IAuthTabCallback(0.0f);
                                    onextracallbackwithresult2.onTransact().IAuthTabCallback(0.0f);
                                    ((AbsChart.IAuthTabCallback) onExtraCallbackWithResult.onExtraCallbackWithResult(-140069223, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), new Object[]{onextracallbackwithresult2}, 140069224, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted())).onExtraCallbackWithResult(((AbsChart.IAuthTabCallback) onExtraCallbackWithResult.onExtraCallbackWithResult(-140069223, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), new Object[]{onextracallbackwithresult2}, 140069224, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted())).onWarmupCompleted());
                                    onextracallbackwithresult2.IAuthTabCallbackDefault().onExtraCallbackWithResult(onextracallbackwithresult2.IAuthTabCallbackDefault().onWarmupCompleted());
                                    onextracallbackwithresult2.onExtraCallback().onExtraCallbackWithResult(onextracallbackwithresult2.onExtraCallback().onWarmupCompleted());
                                }
                            }
                            fValueOf3 = Float.valueOf(fAbs / (fFloatValue + fAbs));
                            if (Float.isNaN(fValueOf3.floatValue())) {
                                fValueOf3 = null;
                            }
                            fFloatValue3 = fValueOf3 != null ? fValueOf3.floatValue() : 0.0f;
                            this.ICustomTabsCallback = fFloatValue3;
                            if (fFloatValue3 == 1.0f) {
                                int i24 = extraCommand + 125;
                                mayLaunchUrl = i24 % 128;
                                f5 = i24 % 2 == 0 ? (this.getInterfaceDescriptor + this.onPostMessage + this.onActivityLayout) * this.ICustomTabsCallbackStub : ((this.getInterfaceDescriptor + this.onPostMessage) + this.onActivityLayout) - this.ICustomTabsCallbackStub;
                            } else {
                                if (fFloatValue3 == 0.0f) {
                                    f3 = this.getInterfaceDescriptor * fFloatValue3;
                                    f4 = this.ICustomTabsCallbackStub;
                                } else {
                                    f3 = (this.getInterfaceDescriptor * fFloatValue3) + this.onPostMessage;
                                    f4 = this.onActivityLayout;
                                }
                                f5 = f3 + f4;
                            }
                            this.ICustomTabsService = f5;
                            float f15 = this.getInterfaceDescriptor - this.IAuthTabCallbackStubProxy;
                            float f16 = fFloatValue3 == 0.0f ? f15 : (1.0f - fFloatValue3) * f15;
                            if (fFloatValue3 != 1.0f) {
                                f15 *= fFloatValue3;
                            }
                            i3 = 0;
                            while (i3 < size) {
                                int i25 = onWarmupCompleted.onNavigationEvent[onnavigationevent2.ordinal()];
                                if (i25 == 1) {
                                    float f17 = i3;
                                    paddingLeft = getPaddingLeft() + (f17 * fOnNavigationEvent) + (f17 * f) + (fOnNavigationEvent / 2.0f);
                                } else {
                                    if (i25 != i5) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    paddingLeft = getPaddingLeft() + (i3 * ((f * 2.0f) + fOnNavigationEvent)) + (fOnNavigationEvent / 2.0f) + f;
                                }
                                float fIAuthTabCallback5 = onWarmupCompleted().get(i3).IAuthTabCallback();
                                float fAbs2 = fIAuthTabCallback5 == f7 ? this.ICustomTabsService : fIAuthTabCallback5 > f7 ? ((fIAuthTabCallback5 / fFloatValue) * f16) + this.IAuthTabCallbackStubProxy + this.ICustomTabsService : this.ICustomTabsService - (((Math.abs(fIAuthTabCallback5) / fAbs) * f15) + this.IAuthTabCallbackStubProxy);
                                AFj1sSDK aFj1sSDK = onWarmupCompleted().get(i3);
                                Context context5 = getContext();
                                Intrinsics.checkNotNullExpressionValue(context5, "");
                                int iIAuthTabCallback = aFj1sSDK.IAuthTabCallback(context5);
                                AFj1sSDK aFj1sSDK2 = onWarmupCompleted().get(i3);
                                float f18 = fFloatValue;
                                Context context6 = getContext();
                                Intrinsics.checkNotNullExpressionValue(context6, "");
                                int iOnExtraCallback = aFj1sSDK2.onExtraCallback(context6);
                                AFj1sSDK aFj1sSDK3 = onWarmupCompleted().get(i3);
                                float f19 = fAbs;
                                Context context7 = getContext();
                                Intrinsics.checkNotNullExpressionValue(context7, "");
                                int iOnNavigationEvent3 = aFj1sSDK3.onNavigationEvent(context7);
                                if (this.onExtraCallback.size() > i3) {
                                    onExtraCallbackWithResult onextracallbackwithresult3 = this.onExtraCallback.get(i3);
                                    i4 = size;
                                    Intrinsics.checkNotNullExpressionValue(onextracallbackwithresult3, "get(...)");
                                    onExtraCallbackWithResult onextracallbackwithresult4 = onextracallbackwithresult3;
                                    onnavigationevent = onnavigationevent2;
                                    f6 = f;
                                    AbsChart.IAuthTabCallback iAuthTabCallback10 = new AbsChart.IAuthTabCallback(((AbsChart.IAuthTabCallback) onExtraCallbackWithResult.onExtraCallbackWithResult(568818806, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), new Object[]{onextracallbackwithresult4}, -568818806, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted())).onWarmupCompleted(), ((AbsChart.IAuthTabCallback) onExtraCallbackWithResult.onExtraCallbackWithResult(568818806, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), new Object[]{onextracallbackwithresult4}, -568818806, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted())).onWarmupCompleted(), paddingLeft);
                                    AbsChart.IAuthTabCallback iAuthTabCallback11 = new AbsChart.IAuthTabCallback(onextracallbackwithresult4.asBinder().onWarmupCompleted(), onextracallbackwithresult4.asBinder().onWarmupCompleted(), fAbs2);
                                    AbsChart.IAuthTabCallback iAuthTabCallback12 = new AbsChart.IAuthTabCallback(onextracallbackwithresult4.onNavigationEvent().onWarmupCompleted(), onextracallbackwithresult4.onNavigationEvent().onWarmupCompleted(), 1.0f);
                                    AbsChart.IAuthTabCallback iAuthTabCallback13 = new AbsChart.IAuthTabCallback(onextracallbackwithresult4.onTransact().onWarmupCompleted(), onextracallbackwithresult4.onTransact().onWarmupCompleted(), 1.0f);
                                    AbsChart.IAuthTabCallback iAuthTabCallback14 = new AbsChart.IAuthTabCallback(((AbsChart.IAuthTabCallback) onExtraCallbackWithResult.onExtraCallbackWithResult(-140069223, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), new Object[]{onextracallbackwithresult4}, 140069224, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted())).onWarmupCompleted(), ((AbsChart.IAuthTabCallback) onExtraCallbackWithResult.onExtraCallbackWithResult(-140069223, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), new Object[]{onextracallbackwithresult4}, 140069224, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted())).onWarmupCompleted(), fOnNavigationEvent);
                                    AbsChart.IAuthTabCallback iAuthTabCallback15 = new AbsChart.IAuthTabCallback(onextracallbackwithresult4.IAuthTabCallbackDefault().onWarmupCompleted(), onextracallbackwithresult4.IAuthTabCallbackDefault().onWarmupCompleted(), f14);
                                    AbsChart.IAuthTabCallback iAuthTabCallback16 = new AbsChart.IAuthTabCallback(onextracallbackwithresult4.onExtraCallback().onWarmupCompleted(), onextracallbackwithresult4.onExtraCallback().onWarmupCompleted(), iIAuthTabCallback);
                                    AbsChart.IAuthTabCallback iAuthTabCallback17 = new AbsChart.IAuthTabCallback(onextracallbackwithresult4.asInterface().onWarmupCompleted(), onextracallbackwithresult4.asInterface().onWarmupCompleted(), iOnExtraCallback);
                                    AbsChart.IAuthTabCallback iAuthTabCallback18 = new AbsChart.IAuthTabCallback(onextracallbackwithresult4.IAuthTabCallbackStubProxy().onWarmupCompleted(), onextracallbackwithresult4.IAuthTabCallbackStubProxy().onWarmupCompleted(), iOnNavigationEvent3);
                                    Intrinsics.checkNotNull(this.onExtraCallback.remove(i3));
                                    iAuthTabCallback = iAuthTabCallback16;
                                    iAuthTabCallback2 = iAuthTabCallback18;
                                    iAuthTabCallback7 = iAuthTabCallback17;
                                    iAuthTabCallback8 = iAuthTabCallback13;
                                    iAuthTabCallback9 = iAuthTabCallback12;
                                    iAuthTabCallback5 = iAuthTabCallback14;
                                    iAuthTabCallback6 = iAuthTabCallback15;
                                    iAuthTabCallback4 = iAuthTabCallback11;
                                    iAuthTabCallback3 = iAuthTabCallback10;
                                } else {
                                    i4 = size;
                                    onnavigationevent = onnavigationevent2;
                                    f6 = f;
                                    AbsChart.IAuthTabCallback iAuthTabCallback19 = new AbsChart.IAuthTabCallback(paddingLeft, paddingLeft, paddingLeft);
                                    AbsChart.IAuthTabCallback iAuthTabCallback20 = new AbsChart.IAuthTabCallback(0.0f, 0.0f, fAbs2);
                                    AbsChart.IAuthTabCallback iAuthTabCallback21 = new AbsChart.IAuthTabCallback(0.0f, 0.0f, 1.0f);
                                    AbsChart.IAuthTabCallback iAuthTabCallback22 = new AbsChart.IAuthTabCallback(0.0f, 0.0f, 1.0f);
                                    AbsChart.IAuthTabCallback iAuthTabCallback23 = new AbsChart.IAuthTabCallback(fOnNavigationEvent, fOnNavigationEvent, fOnNavigationEvent);
                                    AbsChart.IAuthTabCallback iAuthTabCallback24 = new AbsChart.IAuthTabCallback(f14, f14, f14);
                                    float f20 = iIAuthTabCallback;
                                    AbsChart.IAuthTabCallback iAuthTabCallback25 = new AbsChart.IAuthTabCallback(f20, f20, f20);
                                    float f21 = iOnExtraCallback;
                                    AbsChart.IAuthTabCallback iAuthTabCallback26 = new AbsChart.IAuthTabCallback(f21, f21, f21);
                                    float f22 = iOnNavigationEvent3;
                                    AbsChart.IAuthTabCallback iAuthTabCallback27 = new AbsChart.IAuthTabCallback(f22, f22, f22);
                                    Unit unit = Unit.INSTANCE;
                                    iAuthTabCallback = iAuthTabCallback25;
                                    iAuthTabCallback2 = iAuthTabCallback27;
                                    iAuthTabCallback3 = iAuthTabCallback19;
                                    iAuthTabCallback4 = iAuthTabCallback20;
                                    iAuthTabCallback5 = iAuthTabCallback23;
                                    iAuthTabCallback6 = iAuthTabCallback24;
                                    iAuthTabCallback7 = iAuthTabCallback26;
                                    iAuthTabCallback8 = iAuthTabCallback22;
                                    iAuthTabCallback9 = iAuthTabCallback21;
                                }
                                if (!this.access100 || onWarmupCompleted().get(i3).onExtraCallback().length() <= 0) {
                                    bitmap = null;
                                } else {
                                    Context context8 = getContext();
                                    Intrinsics.checkNotNullExpressionValue(context8, "");
                                    TdsBadgeV1View tdsBadgeV1View2 = new TdsBadgeV1View(context8);
                                    tdsBadgeV1View2.setTheme(new TdsBadgeV1View.onExtraCallbackWithResult(this.onMinimized, TdsBadgeV1View.onExtraCallback.WEAK_ROUND, TdsBadgeV1View.IAuthTabCallback.LARGE));
                                    tdsBadgeV1View2.setIncludeFontPadding(false);
                                    tdsBadgeV1View2.setText(onWarmupCompleted().get(i3).onExtraCallback());
                                    tdsBadgeV1View2.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                                    tdsBadgeV1View2.layout(0, 0, tdsBadgeV1View2.getMeasuredWidth(), tdsBadgeV1View2.getMeasuredHeight());
                                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(tdsBadgeV1View2.getMeasuredWidth(), tdsBadgeV1View2.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                                    tdsBadgeV1View2.draw(new Canvas(bitmapCreateBitmap));
                                    bitmap = bitmapCreateBitmap;
                                }
                                this.onExtraCallback.add(i3, new onExtraCallbackWithResult(onWarmupCompleted().get(i3), iAuthTabCallback3, iAuthTabCallback4, iAuthTabCallback9, iAuthTabCallback8, iAuthTabCallback5, iAuthTabCallback6, iAuthTabCallback, iAuthTabCallback7, iAuthTabCallback2, bitmap));
                                i3++;
                                fFloatValue = f18;
                                fAbs = f19;
                                size = i4;
                                onnavigationevent2 = onnavigationevent;
                                f = f6;
                                i5 = 2;
                                f7 = 0.0f;
                            }
                            ArrayList<onExtraCallbackWithResult> arrayList = this.onExtraCallback;
                            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                            it3 = arrayList.iterator();
                            while (it3.hasNext()) {
                                arrayList2.add(RallysKt.onWarmupCompleted((View) null, pxToDp.IAuthTabCallback.onExtraCallback, CollectionsKt__CollectionsJVMKt.listOf((Rally) RallysKt.onWarmupCompleted(new Object[]{this, (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{new AppLovinSdkSettings(), Float.valueOf(0.0f), Float.valueOf(1.0f), new BarChart$.ExternalSyntheticLambda4((onExtraCallbackWithResult) it3.next(), this), null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025)), 0, (getExtraParameters) null, 0, deprecated_certificatePinner.onExtraCallbackWithResult.IAuthTabCallback(), (Integer) null, Boolean.FALSE, 0, 0L, false, 3769, (Object) null));
                            }
                            this.writeTypedObject = isFireOS.onExtraCallbackWithResult(runOnUiThreadDelayed.onWarmupCompleted(RallysKt.onWarmupCompleted((View) null, new pxToDp.onNavigationEvent(this.onExtraCallback.size() <= 10 ? 80 : 10), arrayList2, 0, (getExtraParameters) null, 0, deprecated_certificatePinner.onExtraCallbackWithResult.IAuthTabCallback(), (Integer) null, (Boolean) null, 0, 0L, false, 4025, (Object) null), (Object) null, new BarChart$.ExternalSyntheticLambda5(this), 1, (Object) null), false, 1, (Object) null);
                        }
                        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
                        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
                        fIAuthTabCallback = varyMatches.onNavigationEvent(20, displayMetrics);
                        f2 = (f9 - (f11 * fIAuthTabCallback)) / f10;
                    } else if (size < 10) {
                        DisplayMetrics displayMetrics2 = getContext().getResources().getDisplayMetrics();
                        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
                        fOnNavigationEvent = varyMatches.onNavigationEvent(40, displayMetrics2);
                        float f23 = measuredWidth;
                        float f24 = size;
                        float f25 = size - 1;
                        float f26 = (f23 - (fOnNavigationEvent * f24)) / f25;
                        Intrinsics.checkNotNullExpressionValue(getContext().getResources().getDisplayMetrics(), "");
                        if (f26 < varyMatches.onNavigationEvent(16, r14)) {
                            DisplayMetrics displayMetrics3 = getContext().getResources().getDisplayMetrics();
                            Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
                            iOnNavigationEvent2 = varyMatches.onNavigationEvent(16, displayMetrics3);
                        } else {
                            Intrinsics.checkNotNullExpressionValue(getContext().getResources().getDisplayMetrics(), "");
                            if (f26 <= varyMatches.onNavigationEvent(20, r2)) {
                                f = f26;
                                float f142 = fOnNavigationEvent / 6.0f;
                                if (this.access100) {
                                }
                                this.readTypedObject = this.asInterface ? this.onActivityResized.getFontMetrics().descent - this.onActivityResized.getFontMetrics().top : 0.0f;
                                it = onWarmupCompleted().iterator();
                                if (it.hasNext()) {
                                }
                                if (fValueOf == null) {
                                }
                                it2 = onWarmupCompleted().iterator();
                                if (it2.hasNext()) {
                                }
                                if (fValueOf2 == null) {
                                }
                                float fAbs3 = Math.abs(fFloatValue2);
                                if (fFloatValue == 0.0f) {
                                    measuredHeight = ((((getMeasuredHeight() - this.onPostMessage) - this.onActivityLayout) - this.readTypedObject) - this.extraCallback) - getPaddingTop();
                                    paddingBottom = getPaddingBottom();
                                }
                                this.getInterfaceDescriptor = measuredHeight - paddingBottom;
                                if (this.onExtraCallback.size() != size) {
                                }
                                if (this.onExtraCallback.size() > size) {
                                }
                                fValueOf3 = Float.valueOf(fAbs3 / (fFloatValue + fAbs3));
                                if (Float.isNaN(fValueOf3.floatValue())) {
                                }
                                if (fValueOf3 != null) {
                                }
                                this.ICustomTabsCallback = fFloatValue3;
                                if (fFloatValue3 == 1.0f) {
                                }
                                this.ICustomTabsService = f5;
                                float f152 = this.getInterfaceDescriptor - this.IAuthTabCallbackStubProxy;
                                if (fFloatValue3 == 0.0f) {
                                }
                                if (fFloatValue3 != 1.0f) {
                                }
                                i3 = 0;
                                while (i3 < size) {
                                }
                                ArrayList<onExtraCallbackWithResult> arrayList3 = this.onExtraCallback;
                                ArrayList arrayList22 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
                                it3 = arrayList3.iterator();
                                while (it3.hasNext()) {
                                }
                                this.writeTypedObject = isFireOS.onExtraCallbackWithResult(runOnUiThreadDelayed.onWarmupCompleted(RallysKt.onWarmupCompleted((View) null, new pxToDp.onNavigationEvent(this.onExtraCallback.size() <= 10 ? 80 : 10), arrayList22, 0, (getExtraParameters) null, 0, deprecated_certificatePinner.onExtraCallbackWithResult.IAuthTabCallback(), (Integer) null, (Boolean) null, 0, 0L, false, 4025, (Object) null), (Object) null, new BarChart$.ExternalSyntheticLambda5(this), 1, (Object) null), false, 1, (Object) null);
                            }
                            DisplayMetrics displayMetrics4 = getContext().getResources().getDisplayMetrics();
                            Intrinsics.checkNotNullExpressionValue(displayMetrics4, "");
                            iOnNavigationEvent2 = varyMatches.onNavigationEvent(20, displayMetrics4);
                        }
                        fIAuthTabCallback = iOnNavigationEvent2;
                        f2 = (f23 - (f25 * fIAuthTabCallback)) / f24;
                    } else {
                        float f27 = measuredWidth / (size + 1);
                        float f28 = measuredWidth;
                        float f29 = size;
                        float f30 = size - 1;
                        float f31 = (f28 - (f27 * f29)) / f30;
                        Intrinsics.checkNotNullExpressionValue(getContext().getResources().getDisplayMetrics(), "");
                        if (f31 < varyMatches.onNavigationEvent(4, r14)) {
                            DisplayMetrics displayMetrics5 = getContext().getResources().getDisplayMetrics();
                            Intrinsics.checkNotNullExpressionValue(displayMetrics5, "");
                            iOnNavigationEvent = varyMatches.onNavigationEvent(4, displayMetrics5);
                        } else {
                            Intrinsics.checkNotNullExpressionValue(getContext().getResources().getDisplayMetrics(), "");
                            if (f31 > varyMatches.onNavigationEvent(8, r1)) {
                                DisplayMetrics displayMetrics6 = getContext().getResources().getDisplayMetrics();
                                Intrinsics.checkNotNullExpressionValue(displayMetrics6, "");
                                iOnNavigationEvent = varyMatches.onNavigationEvent(8, displayMetrics6);
                            } else {
                                fOnNavigationEvent = f27;
                                f = f31;
                            }
                        }
                        fIAuthTabCallback = iOnNavigationEvent;
                        f2 = (f28 - (f30 * fIAuthTabCallback)) / f29;
                    }
                    int i26 = mayLaunchUrl + 69;
                    extraCommand = i26 % 128;
                    int i27 = i26 % 2;
                    float f1422 = fOnNavigationEvent / 6.0f;
                    if (this.access100) {
                    }
                    this.readTypedObject = this.asInterface ? this.onActivityResized.getFontMetrics().descent - this.onActivityResized.getFontMetrics().top : 0.0f;
                    it = onWarmupCompleted().iterator();
                    if (it.hasNext()) {
                    }
                    if (fValueOf == null) {
                    }
                    it2 = onWarmupCompleted().iterator();
                    if (it2.hasNext()) {
                    }
                    if (fValueOf2 == null) {
                    }
                    float fAbs32 = Math.abs(fFloatValue2);
                    if (fFloatValue == 0.0f) {
                    }
                    this.getInterfaceDescriptor = measuredHeight - paddingBottom;
                    if (this.onExtraCallback.size() != size) {
                    }
                    if (this.onExtraCallback.size() > size) {
                    }
                    fValueOf3 = Float.valueOf(fAbs32 / (fFloatValue + fAbs32));
                    if (Float.isNaN(fValueOf3.floatValue())) {
                    }
                    if (fValueOf3 != null) {
                    }
                    this.ICustomTabsCallback = fFloatValue3;
                    if (fFloatValue3 == 1.0f) {
                    }
                    this.ICustomTabsService = f5;
                    float f1522 = this.getInterfaceDescriptor - this.IAuthTabCallbackStubProxy;
                    if (fFloatValue3 == 0.0f) {
                    }
                    if (fFloatValue3 != 1.0f) {
                    }
                    i3 = 0;
                    while (i3 < size) {
                    }
                    ArrayList<onExtraCallbackWithResult> arrayList32 = this.onExtraCallback;
                    ArrayList arrayList222 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList32, 10));
                    it3 = arrayList32.iterator();
                    while (it3.hasNext()) {
                    }
                    this.writeTypedObject = isFireOS.onExtraCallbackWithResult(runOnUiThreadDelayed.onWarmupCompleted(RallysKt.onWarmupCompleted((View) null, new pxToDp.onNavigationEvent(this.onExtraCallback.size() <= 10 ? 80 : 10), arrayList222, 0, (getExtraParameters) null, 0, deprecated_certificatePinner.onExtraCallbackWithResult.IAuthTabCallback(), (Integer) null, (Boolean) null, 0, 0L, false, 4025, (Object) null), (Object) null, new BarChart$.ExternalSyntheticLambda5(this), 1, (Object) null), false, 1, (Object) null);
                }
                if (f8 != null) {
                    fOnNavigationEvent = f8.floatValue();
                } else {
                    onExtraCallback onextracallback4 = Companion;
                    Context context9 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context9, "");
                    fOnNavigationEvent = onextracallback4.onNavigationEvent(context9);
                }
            }
            f = fIAuthTabCallback;
            fOnNavigationEvent = f2;
            int i262 = mayLaunchUrl + 69;
            extraCommand = i262 % 128;
            int i272 = i262 % 2;
            float f14222 = fOnNavigationEvent / 6.0f;
            if (this.access100) {
            }
            this.readTypedObject = this.asInterface ? this.onActivityResized.getFontMetrics().descent - this.onActivityResized.getFontMetrics().top : 0.0f;
            it = onWarmupCompleted().iterator();
            if (it.hasNext()) {
            }
            if (fValueOf == null) {
            }
            it2 = onWarmupCompleted().iterator();
            if (it2.hasNext()) {
            }
            if (fValueOf2 == null) {
            }
            float fAbs322 = Math.abs(fFloatValue2);
            if (fFloatValue == 0.0f) {
            }
            this.getInterfaceDescriptor = measuredHeight - paddingBottom;
            if (this.onExtraCallback.size() != size) {
            }
            if (this.onExtraCallback.size() > size) {
            }
            fValueOf3 = Float.valueOf(fAbs322 / (fFloatValue + fAbs322));
            if (Float.isNaN(fValueOf3.floatValue())) {
            }
            if (fValueOf3 != null) {
            }
            this.ICustomTabsCallback = fFloatValue3;
            if (fFloatValue3 == 1.0f) {
            }
            this.ICustomTabsService = f5;
            float f15222 = this.getInterfaceDescriptor - this.IAuthTabCallbackStubProxy;
            if (fFloatValue3 == 0.0f) {
            }
            if (fFloatValue3 != 1.0f) {
            }
            i3 = 0;
            while (i3 < size) {
            }
            ArrayList<onExtraCallbackWithResult> arrayList322 = this.onExtraCallback;
            ArrayList arrayList2222 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList322, 10));
            it3 = arrayList322.iterator();
            while (it3.hasNext()) {
            }
            this.writeTypedObject = isFireOS.onExtraCallbackWithResult(runOnUiThreadDelayed.onWarmupCompleted(RallysKt.onWarmupCompleted((View) null, new pxToDp.onNavigationEvent(this.onExtraCallback.size() <= 10 ? 80 : 10), arrayList2222, 0, (getExtraParameters) null, 0, deprecated_certificatePinner.onExtraCallbackWithResult.IAuthTabCallback(), (Integer) null, (Boolean) null, 0, 0L, false, 4025, (Object) null), (Object) null, new BarChart$.ExternalSyntheticLambda5(this), 1, (Object) null), false, 1, (Object) null);
        }
        fOnNavigationEvent = measuredWidth;
        f = 0.0f;
        float f142222 = fOnNavigationEvent / 6.0f;
        if (this.access100) {
        }
        this.readTypedObject = this.asInterface ? this.onActivityResized.getFontMetrics().descent - this.onActivityResized.getFontMetrics().top : 0.0f;
        it = onWarmupCompleted().iterator();
        if (it.hasNext()) {
        }
        if (fValueOf == null) {
        }
        it2 = onWarmupCompleted().iterator();
        if (it2.hasNext()) {
        }
        if (fValueOf2 == null) {
        }
        float fAbs3222 = Math.abs(fFloatValue2);
        if (fFloatValue == 0.0f) {
        }
        this.getInterfaceDescriptor = measuredHeight - paddingBottom;
        if (this.onExtraCallback.size() != size) {
        }
        if (this.onExtraCallback.size() > size) {
        }
        fValueOf3 = Float.valueOf(fAbs3222 / (fFloatValue + fAbs3222));
        if (Float.isNaN(fValueOf3.floatValue())) {
        }
        if (fValueOf3 != null) {
        }
        this.ICustomTabsCallback = fFloatValue3;
        if (fFloatValue3 == 1.0f) {
        }
        this.ICustomTabsService = f5;
        float f152222 = this.getInterfaceDescriptor - this.IAuthTabCallbackStubProxy;
        if (fFloatValue3 == 0.0f) {
        }
        if (fFloatValue3 != 1.0f) {
        }
        i3 = 0;
        while (i3 < size) {
        }
        ArrayList<onExtraCallbackWithResult> arrayList3222 = this.onExtraCallback;
        ArrayList arrayList22222 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3222, 10));
        it3 = arrayList3222.iterator();
        while (it3.hasNext()) {
        }
        this.writeTypedObject = isFireOS.onExtraCallbackWithResult(runOnUiThreadDelayed.onWarmupCompleted(RallysKt.onWarmupCompleted((View) null, new pxToDp.onNavigationEvent(this.onExtraCallback.size() <= 10 ? 80 : 10), arrayList22222, 0, (getExtraParameters) null, 0, deprecated_certificatePinner.onExtraCallbackWithResult.IAuthTabCallback(), (Integer) null, (Boolean) null, 0, 0L, false, 4025, (Object) null), (Object) null, new BarChart$.ExternalSyntheticLambda5(this), 1, (Object) null), false, 1, (Object) null);
    }

    private static final boolean onExtraCallback(onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 9;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        if (onextracallbackwithresult.onNavigationEvent().onWarmupCompleted() != 0.0f) {
            return false;
        }
        int i4 = extraCommand + 113;
        mayLaunchUrl = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    private static final Unit onExtraCallback(BarChart barChart) {
        int i = 2 % 2;
        CollectionsKt__MutableCollectionsKt.removeAll((List) barChart.onExtraCallback, (Function1) new BarChart$.ExternalSyntheticLambda1());
        barChart.postInvalidate();
        Unit unit = Unit.INSTANCE;
        int i2 = extraCommand + 61;
        mayLaunchUrl = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    @Override // android.view.View
    public void draw(@NotNull Canvas canvas) {
        int i = 2 % 2;
        int i2 = extraCommand + 75;
        mayLaunchUrl = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(canvas, "");
            super.draw(canvas);
            onExtraCallbackWithResult(canvas);
            onNavigationEvent(canvas);
            IAuthTabCallback(canvas);
            onWarmupCompleted(canvas);
            int i3 = 36 / 0;
        } else {
            Intrinsics.checkNotNullParameter(canvas, "");
            super.draw(canvas);
            onExtraCallbackWithResult(canvas);
            onNavigationEvent(canvas);
            IAuthTabCallback(canvas);
            onWarmupCompleted(canvas);
        }
        int i4 = extraCommand + 67;
        mayLaunchUrl = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void onExtraCallbackWithResult(Canvas canvas) {
        int i = 2 % 2;
        if (this.asInterface) {
            float measuredHeight = getMeasuredHeight() - getPaddingBottom();
            float f = this.onActivityResized.getFontMetrics().bottom;
            for (onExtraCallbackWithResult onextracallbackwithresult : this.onExtraCallback) {
                int i2 = mayLaunchUrl + 9;
                extraCommand = i2 % 128;
                int i3 = i2 % 2;
                this.onActivityResized.setColor((int) onextracallbackwithresult.asInterface().onWarmupCompleted());
                this.onActivityResized.setAlpha((int) (onextracallbackwithresult.onNavigationEvent().onWarmupCompleted() * 255.0f));
                String strOnExtraCallbackWithResult = onextracallbackwithresult.onExtraCallbackWithResult().onExtraCallbackWithResult();
                int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
                canvas.drawText(strOnExtraCallbackWithResult, ((AbsChart.IAuthTabCallback) onExtraCallbackWithResult.onExtraCallbackWithResult(568818806, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), new Object[]{onextracallbackwithresult}, -568818806, iOnWarmupCompleted, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted())).onWarmupCompleted(), measuredHeight - f, this.onActivityResized);
                int i4 = mayLaunchUrl + 77;
                extraCommand = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 2 / 3;
                }
            }
        }
    }

    private final void IAuthTabCallback(Canvas canvas) {
        DashPathEffect dashPathEffect;
        int i = 2 % 2;
        int i2 = extraCommand + 125;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        if (this.IAuthTabCallbackStub) {
            float measuredHeight = (((getMeasuredHeight() - getPaddingBottom()) - this.readTypedObject) - this.extraCallback) - this.ICustomTabsService;
            float paddingLeft = getPaddingLeft();
            float measuredWidth = getMeasuredWidth() - getPaddingRight();
            Paint paint = new Paint(7);
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            float fOnNavigationEvent = varyMatches.onNavigationEvent(2, displayMetrics);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(this.ICustomTabsCallbackStub);
            paint.setColor(this.ICustomTabsCallbackStubProxy);
            int i4 = onWarmupCompleted.onExtraCallback[this.ICustomTabsCallbackDefault.ordinal()];
            if (i4 != 1) {
                int i5 = mayLaunchUrl + Imgproc.COLOR_YUV2RGB_YVYU;
                extraCommand = i5 % 128;
                if (i5 % 2 == 0 ? i4 != 2 : i4 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                Intrinsics.checkNotNullExpressionValue(getResources().getDisplayMetrics(), "");
                dashPathEffect = new DashPathEffect(new float[]{varyMatches.onNavigationEvent(1, r3), fOnNavigationEvent}, 2.0f);
            } else {
                dashPathEffect = null;
            }
            paint.setPathEffect(dashPathEffect);
            canvas.drawLine(paddingLeft, measuredHeight, measuredWidth, measuredHeight, paint);
        }
    }

    private final void onNavigationEvent(Canvas canvas) {
        int i = 2 % 2;
        int i2 = extraCommand + 69;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        float measuredHeight = ((getMeasuredHeight() - getPaddingBottom()) - this.readTypedObject) - this.extraCallback;
        float f = measuredHeight - this.ICustomTabsService;
        Iterator<T> it = this.onExtraCallback.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            int i5 = mayLaunchUrl + 67;
            extraCommand = i5 % 128;
            if (i5 % 2 != 0) {
                it.next();
                throw null;
            }
            Object next = it.next();
            if (i4 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
                int i6 = extraCommand + 69;
                mayLaunchUrl = i6 % 128;
                int i7 = i6 % 2;
            }
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) next;
            if (onextracallbackwithresult.onExtraCallbackWithResult().IAuthTabCallback() != 0.0f) {
                int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
                float fOnWarmupCompleted = ((AbsChart.IAuthTabCallback) onExtraCallbackWithResult.onExtraCallbackWithResult(568818806, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), new Object[]{onextracallbackwithresult}, -568818806, iOnWarmupCompleted, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted())).onWarmupCompleted();
                int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
                float fOnWarmupCompleted2 = fOnWarmupCompleted - (((AbsChart.IAuthTabCallback) onExtraCallbackWithResult.onExtraCallbackWithResult(-140069223, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), new Object[]{onextracallbackwithresult}, 140069224, iOnWarmupCompleted2, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted())).onWarmupCompleted() / 2.0f);
                int iOnWarmupCompleted3 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
                float fOnWarmupCompleted3 = fOnWarmupCompleted2 + ((AbsChart.IAuthTabCallback) onExtraCallbackWithResult.onExtraCallbackWithResult(-140069223, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), new Object[]{onextracallbackwithresult}, 140069224, iOnWarmupCompleted3, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted())).onWarmupCompleted();
                Bitmap bitmapIAuthTabCallback = IAuthTabCallback(onextracallbackwithresult.onExtraCallbackWithResult());
                if (bitmapIAuthTabCallback != null) {
                    int iOnWarmupCompleted4 = (int) onextracallbackwithresult.onExtraCallback().onWarmupCompleted();
                    Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                    this.IAuthTabCallback.setShader(new ComposeShader(new LinearGradient(0.0f, 0.0f, 1.0f, 1.0f, iOnWarmupCompleted4, iOnWarmupCompleted4, tileMode), new BitmapShader(bitmapIAuthTabCallback, tileMode, tileMode), PorterDuff.Mode.SRC_OVER));
                } else {
                    this.IAuthTabCallback.setShader(null);
                    this.IAuthTabCallback.setColor((int) onextracallbackwithresult.onExtraCallback().onWarmupCompleted());
                }
                this.IAuthTabCallback.setAlpha((int) (onextracallbackwithresult.onNavigationEvent().onWarmupCompleted() * 255.0f));
                if (onextracallbackwithresult.onExtraCallbackWithResult().IAuthTabCallback() > 0.0f) {
                    float fOnWarmupCompleted4 = measuredHeight - onextracallbackwithresult.asBinder().onWarmupCompleted();
                    if (this.IAuthTabCallbackDefault) {
                        int i8 = mayLaunchUrl + 37;
                        extraCommand = i8 % 128;
                        int i9 = i8 % 2;
                        canvas.drawRoundRect(fOnWarmupCompleted2, fOnWarmupCompleted4, fOnWarmupCompleted3, f + this.onUnminimized, onextracallbackwithresult.IAuthTabCallbackDefault().onWarmupCompleted(), onextracallbackwithresult.IAuthTabCallbackDefault().onWarmupCompleted(), this.IAuthTabCallback);
                    } else {
                        onNavigationEvent(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 1600167220, new Object[]{this, true, Float.valueOf(onextracallbackwithresult.IAuthTabCallbackDefault().onWarmupCompleted())}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -1600167218);
                        asBinder().reset();
                        asBinder().addRoundRect(fOnWarmupCompleted2, fOnWarmupCompleted4, fOnWarmupCompleted3, f + this.onUnminimized, getInterfaceDescriptor(), Path.Direction.CW);
                        canvas.drawPath(asBinder(), this.IAuthTabCallback);
                    }
                } else {
                    float fOnWarmupCompleted5 = measuredHeight - onextracallbackwithresult.asBinder().onWarmupCompleted();
                    if (this.IAuthTabCallbackDefault) {
                        canvas.drawRoundRect(fOnWarmupCompleted2, f - this.onUnminimized, fOnWarmupCompleted3, fOnWarmupCompleted5, onextracallbackwithresult.IAuthTabCallbackDefault().onWarmupCompleted(), onextracallbackwithresult.IAuthTabCallbackDefault().onWarmupCompleted(), this.IAuthTabCallback);
                    } else {
                        onNavigationEvent(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 1600167220, new Object[]{this, false, Float.valueOf(onextracallbackwithresult.IAuthTabCallbackDefault().onWarmupCompleted())}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -1600167218);
                        asBinder().reset();
                        asBinder().addRoundRect(fOnWarmupCompleted2, f - this.onUnminimized, fOnWarmupCompleted3, fOnWarmupCompleted5, getInterfaceDescriptor(), Path.Direction.CW);
                        canvas.drawPath(asBinder(), this.IAuthTabCallback);
                    }
                }
            }
            i4++;
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Pair pairIAuthTabCallback;
        float f;
        int i = 0;
        BarChart barChart = (BarChart) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        float fFloatValue = ((Number) objArr[2]).floatValue();
        int i2 = 2 % 2;
        Float fValueOf = Float.valueOf(0.0f);
        Function1 function1 = new Function1() { // from class: im.toss.uikit.chart.BarChart$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i3 = 2 % 2;
                int i4 = onWarmupCompleted + 29;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                Object[] objArr2 = {Integer.valueOf(((Integer) obj).intValue())};
                int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
                Boolean boolValueOf = Boolean.valueOf(((Boolean) BarChart.onNavigationEvent(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -765102156, objArr2, iIAuthTabCallback, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 765102160)).booleanValue());
                int i6 = onWarmupCompleted + 89;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                return boolValueOf;
            }
        };
        if (!zBooleanValue) {
            pairIAuthTabCallback = getWrite.IAuthTabCallback(fValueOf, Float.valueOf(fFloatValue));
        } else {
            int i3 = extraCommand + 3;
            mayLaunchUrl = i3 % 128;
            int i4 = i3 % 2;
            pairIAuthTabCallback = getWrite.IAuthTabCallback(Float.valueOf(fFloatValue), fValueOf);
        }
        float fFloatValue2 = ((Number) pairIAuthTabCallback.onExtraCallbackWithResult()).floatValue();
        float fFloatValue3 = ((Number) pairIAuthTabCallback.IAuthTabCallback()).floatValue();
        int length = barChart.getInterfaceDescriptor().length;
        while (i < length) {
            float[] interfaceDescriptor = barChart.getInterfaceDescriptor();
            if (!((Boolean) function1.invoke(Integer.valueOf(i))).booleanValue()) {
                f = fFloatValue3;
            } else {
                int i5 = mayLaunchUrl + 109;
                extraCommand = i5 % 128;
                int i6 = i5 % 2;
                f = fFloatValue2;
            }
            interfaceDescriptor[i] = f;
            i++;
            int i7 = mayLaunchUrl + 75;
            extraCommand = i7 % 128;
            int i8 = i7 % 2;
        }
        return null;
    }

    private static final void IAuthTabCallback(Canvas canvas, onExtraCallbackWithResult onextracallbackwithresult, float f, BarChart barChart) {
        int i = 2 % 2;
        int i2 = extraCommand + 21;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        Bitmap bitmapIAuthTabCallbackStub = onextracallbackwithresult.IAuthTabCallbackStub();
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        canvas.drawBitmap(bitmapIAuthTabCallbackStub, ((AbsChart.IAuthTabCallback) onExtraCallbackWithResult.onExtraCallbackWithResult(568818806, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), new Object[]{onextracallbackwithresult}, -568818806, iOnWarmupCompleted, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted())).onWarmupCompleted() - (onextracallbackwithresult.IAuthTabCallbackStub().getWidth() / 2.0f), ((f - barChart.onActivityLayout) - onextracallbackwithresult.asBinder().onWarmupCompleted()) - onextracallbackwithresult.IAuthTabCallbackStub().getHeight(), (Paint) null);
        int i4 = extraCommand + 57;
        mayLaunchUrl = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Canvas canvas = (Canvas) objArr[0];
        onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) objArr[1];
        float fFloatValue = ((Number) objArr[2]).floatValue();
        BarChart barChart = (BarChart) objArr[3];
        int i = 2 % 2;
        int i2 = extraCommand + 41;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        Bitmap bitmapIAuthTabCallbackStub = onextracallbackwithresult.IAuthTabCallbackStub();
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        canvas.drawBitmap(bitmapIAuthTabCallbackStub, ((AbsChart.IAuthTabCallback) onExtraCallbackWithResult.onExtraCallbackWithResult(568818806, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), new Object[]{onextracallbackwithresult}, -568818806, iOnWarmupCompleted, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted())).onWarmupCompleted() - (onextracallbackwithresult.IAuthTabCallbackStub().getWidth() / 2.0f), ((fFloatValue + barChart.onActivityLayout) - onextracallbackwithresult.asBinder().onWarmupCompleted()) + onextracallbackwithresult.IAuthTabCallbackStub().getHeight(), (Paint) null);
        int i4 = extraCommand + 95;
        mayLaunchUrl = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static final void onWarmupCompleted(float f, BarChart barChart, onExtraCallbackWithResult onextracallbackwithresult, Canvas canvas) {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 69;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        float fOnWarmupCompleted = (f - barChart.onActivityLayout) - onextracallbackwithresult.asBinder().onWarmupCompleted();
        for (String str : CollectionsKt___CollectionsKt.reversed(StringsKt__StringsKt.split$default((CharSequence) onextracallbackwithresult.onExtraCallbackWithResult().onExtraCallback(), new String[]{"\n"}, false, 0, 6, (Object) null))) {
            int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
            int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
            int iOnWarmupCompleted3 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
            canvas.drawText(str, ((AbsChart.IAuthTabCallback) onExtraCallbackWithResult.onExtraCallbackWithResult(568818806, iOnWarmupCompleted2, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), new Object[]{onextracallbackwithresult}, -568818806, iOnWarmupCompleted, iOnWarmupCompleted3)).onWarmupCompleted(), fOnWarmupCompleted, barChart.onRelationshipValidationResult);
            fOnWarmupCompleted -= barChart.onPostMessage;
            int i4 = mayLaunchUrl + 41;
            extraCommand = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static final void onExtraCallbackWithResult(float f, onExtraCallbackWithResult onextracallbackwithresult, BarChart barChart, Canvas canvas) {
        int i = 2 % 2;
        float fOnWarmupCompleted = f - onextracallbackwithresult.asBinder().onWarmupCompleted();
        Iterator it = StringsKt__StringsKt.split$default((CharSequence) onextracallbackwithresult.onExtraCallbackWithResult().onExtraCallback(), new String[]{"\n"}, false, 0, 6, (Object) null).iterator();
        int i2 = mayLaunchUrl + 69;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        while (!(!it.hasNext())) {
            int i4 = mayLaunchUrl + 41;
            extraCommand = i4 % 128;
            int i5 = i4 % 2;
            String str = (String) it.next();
            fOnWarmupCompleted += barChart.onPostMessage;
            int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
            canvas.drawText(str, ((AbsChart.IAuthTabCallback) onExtraCallbackWithResult.onExtraCallbackWithResult(568818806, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), new Object[]{onextracallbackwithresult}, -568818806, iOnWarmupCompleted, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted())).onWarmupCompleted(), fOnWarmupCompleted, barChart.onRelationshipValidationResult);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0099 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0070 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onWarmupCompleted(Canvas canvas) {
        float f;
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 95;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        float measuredHeight = ((getMeasuredHeight() - getPaddingBottom()) - this.readTypedObject) - this.extraCallback;
        for (onExtraCallbackWithResult onextracallbackwithresult : this.onExtraCallback) {
            int i4 = extraCommand + 9;
            mayLaunchUrl = i4 % 128;
            int i5 = i4 % 2;
            if (this.access100) {
                int i6 = extraCommand + 105;
                mayLaunchUrl = i6 % 128;
                if (i6 % 2 == 0) {
                    onextracallbackwithresult.IAuthTabCallbackStub();
                    throw null;
                }
                if (onextracallbackwithresult.IAuthTabCallbackStub() != null) {
                    int i7 = extraCommand + 23;
                    int i8 = i7 % 128;
                    mayLaunchUrl = i8;
                    if (i7 % 2 == 0) {
                        f = this.ICustomTabsCallback;
                        if (f == 1.0f) {
                            IAuthTabCallback(canvas, onextracallbackwithresult, measuredHeight, this);
                        } else if (f != 1.0f) {
                            int i9 = i8 + 77;
                            extraCommand = i9 % 128;
                            int i10 = i9 % 2;
                            onNavigationEvent(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -1397178048, new Object[]{canvas, onextracallbackwithresult, Float.valueOf(measuredHeight), this}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 1397178051);
                        } else if (onextracallbackwithresult.onExtraCallbackWithResult().IAuthTabCallback() > 0.0f) {
                            int i11 = extraCommand + 63;
                            mayLaunchUrl = i11 % 128;
                            if (i11 % 2 == 0) {
                                IAuthTabCallback(canvas, onextracallbackwithresult, measuredHeight, this);
                                throw null;
                            }
                            IAuthTabCallback(canvas, onextracallbackwithresult, measuredHeight, this);
                        } else {
                            onNavigationEvent(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -1397178048, new Object[]{canvas, onextracallbackwithresult, Float.valueOf(measuredHeight), this}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 1397178051);
                        }
                    } else {
                        f = this.ICustomTabsCallback;
                        if (f == 0.0f) {
                            IAuthTabCallback(canvas, onextracallbackwithresult, measuredHeight, this);
                        } else if (f != 1.0f) {
                        }
                    }
                }
            }
            if (this.asBinder) {
                int i12 = extraCommand + 123;
                mayLaunchUrl = i12 % 128;
                int i13 = i12 % 2;
                this.onRelationshipValidationResult.setColor((int) onextracallbackwithresult.IAuthTabCallbackStubProxy().onWarmupCompleted());
                this.onRelationshipValidationResult.setAlpha((int) (onextracallbackwithresult.onTransact().onWarmupCompleted() * 255.0f));
                float f2 = this.ICustomTabsCallback;
                if (f2 == 0.0f) {
                    onWarmupCompleted(measuredHeight, this, onextracallbackwithresult, canvas);
                    int i14 = extraCommand + 91;
                    mayLaunchUrl = i14 % 128;
                    int i15 = i14 % 2;
                } else if (f2 == 1.0f) {
                    onExtraCallbackWithResult(measuredHeight, onextracallbackwithresult, this, canvas);
                } else if (onextracallbackwithresult.onExtraCallbackWithResult().IAuthTabCallback() >= 0.0f) {
                    onWarmupCompleted(measuredHeight, this, onextracallbackwithresult, canvas);
                } else {
                    onExtraCallbackWithResult(measuredHeight, onextracallbackwithresult, this, canvas);
                }
            }
        }
    }

    public final void setTitleTextSize(float f) {
        int i = 2 % 2;
        int i2 = extraCommand + 93;
        mayLaunchUrl = i2 % 128;
        if (i2 % 2 != 0) {
            this.onActivityResized.setTextSize(f);
            requestLayout();
        } else {
            this.onActivityResized.setTextSize(f);
            requestLayout();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final void setTitleFont(@NotNull response responseVar) {
        int i = 2 % 2;
        int i2 = extraCommand + 101;
        mayLaunchUrl = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(responseVar, "");
        } else {
            Intrinsics.checkNotNullParameter(responseVar, "");
        }
        Paint paint = this.onActivityResized;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        paint.setTypeface(response.toTypeface$default(responseVar, context, (setDone) null, 2, (Object) null));
        requestLayout();
        int i3 = extraCommand + 103;
        mayLaunchUrl = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b A[PHI: r1
      0x002b: PHI (r1v10 int) = (r1v9 int), (r1v15 int) binds: [B:10:0x0029, B:7:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(@NotNull MotionEvent motionEvent) {
        int action;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(motionEvent, "");
        if (IAuthTabCallback() == null) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            int i2 = extraCommand + 61;
            mayLaunchUrl = i2 % 128;
            if (i2 % 2 != 0) {
                return zOnTouchEvent;
            }
            throw null;
        }
        int i3 = mayLaunchUrl + 49;
        extraCommand = i3 % 128;
        if (i3 % 2 != 0) {
            action = motionEvent.getAction();
            int i4 = 3 / 0;
            if (action != 0) {
                int i5 = mayLaunchUrl + 13;
                int i6 = i5 % 128;
                extraCommand = i6;
                if (i5 % 2 == 0 ? action == 1 : action == 1) {
                    onExtraCallbackWithResult onextracallbackwithresult = this.onTransact;
                    if (onextracallbackwithresult != null && Intrinsics.areEqual(onextracallbackwithresult, IAuthTabCallback(motionEvent.getX(), motionEvent.getY()))) {
                        onExtraCallbackWithResult onextracallbackwithresult2 = this.onTransact;
                        Intrinsics.checkNotNull(onextracallbackwithresult2);
                        onExtraCallbackWithResult(onextracallbackwithresult2);
                    }
                    this.onTransact = null;
                    int i7 = extraCommand + 61;
                    mayLaunchUrl = i7 % 128;
                    if (i7 % 2 == 0) {
                        int i8 = 3 / 3;
                    }
                } else {
                    int i9 = i6 + 71;
                    mayLaunchUrl = i9 % 128;
                    if (i9 % 2 != 0 ? action == 3 : action == 4) {
                        this.onTransact = null;
                    }
                }
            } else {
                this.onTransact = IAuthTabCallback(motionEvent.getX(), motionEvent.getY());
            }
        } else {
            action = motionEvent.getAction();
            if (action != 0) {
            }
        }
        int i10 = extraCommand + 65;
        mayLaunchUrl = i10 % 128;
        int i11 = i10 % 2;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0051 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final onExtraCallbackWithResult IAuthTabCallback(float f, float f2) {
        boolean z;
        int i = 2 % 2;
        Object obj = null;
        if ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight() <= 0.0f || getPaddingTop() >= f2) {
            return null;
        }
        int i2 = extraCommand + 57;
        mayLaunchUrl = i2 % 128;
        if (i2 % 2 == 0) {
            if (f2 >= getMeasuredHeight() % getPaddingBottom()) {
                return null;
            }
        } else if (f2 >= getMeasuredHeight() - getPaddingBottom()) {
            return null;
        }
        Iterator<T> it = this.onExtraCallback.iterator();
        while (true) {
            boolean z2 = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) next;
            float measuredHeight = ((getMeasuredHeight() - getPaddingBottom()) - this.readTypedObject) - this.extraCallback;
            float size = (StringsKt__StringsKt.split$default((CharSequence) onextracallbackwithresult.onExtraCallbackWithResult().onExtraCallback(), new String[]{"\n"}, false, 0, 6, (Object) null).size() * this.onPostMessage) + this.onActivityLayout;
            if (onextracallbackwithresult.IAuthTabCallback() - (((AbsChart.IAuthTabCallback) onExtraCallbackWithResult.onExtraCallbackWithResult(-140069223, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), new Object[]{onextracallbackwithresult}, 140069224, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted())).onWarmupCompleted() / 2.0f) < f) {
                int i3 = extraCommand + 105;
                mayLaunchUrl = i3 % 128;
                if (i3 % 2 == 0) {
                    z = f < onextracallbackwithresult.IAuthTabCallback() + (((AbsChart.IAuthTabCallback) onExtraCallbackWithResult.onExtraCallbackWithResult(-140069223, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), new Object[]{onextracallbackwithresult}, 140069224, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted())).onWarmupCompleted() * 1.0f);
                } else {
                    if (f < onextracallbackwithresult.IAuthTabCallback() + (((AbsChart.IAuthTabCallback) onExtraCallbackWithResult.onExtraCallbackWithResult(-140069223, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), new Object[]{onextracallbackwithresult}, 140069224, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted())).onWarmupCompleted() / 2.0f)) {
                    }
                }
                float f3 = this.ICustomTabsCallback;
                if (f3 == 0.0f) {
                    int i4 = extraCommand + 33;
                    mayLaunchUrl = i4 % 128;
                    if (i4 % 2 == 0) {
                        if ((measuredHeight / onextracallbackwithresult.asBinder().onWarmupCompleted()) - size < f2) {
                        }
                        if (!z && z2) {
                            obj = next;
                            break;
                        }
                    } else if ((measuredHeight - onextracallbackwithresult.asBinder().onWarmupCompleted()) - size >= f2) {
                        z2 = false;
                        if (!z) {
                        }
                    }
                    if (f2 >= measuredHeight) {
                    }
                    if (!z) {
                    }
                } else if (f3 == 1.0f) {
                    if (measuredHeight - onextracallbackwithresult.asBinder().onWarmupCompleted() >= f2 || f2 >= measuredHeight + size) {
                    }
                    if (!z) {
                    }
                } else if (onextracallbackwithresult.onExtraCallbackWithResult().IAuthTabCallback() >= 0.0f) {
                    int i5 = mayLaunchUrl + 11;
                    extraCommand = i5 % 128;
                    int i6 = i5 % 2;
                    if ((measuredHeight - onextracallbackwithresult.asBinder().onWarmupCompleted()) - size >= f2 || f2 >= measuredHeight) {
                    }
                    if (!z) {
                    }
                } else if (measuredHeight - onextracallbackwithresult.asBinder().onWarmupCompleted() < f2) {
                    int i7 = extraCommand + 111;
                    mayLaunchUrl = i7 % 128;
                    if (i7 % 2 == 0) {
                        int i8 = (f2 > (measuredHeight / size) ? 1 : (f2 == (measuredHeight / size) ? 0 : -1));
                    } else if (f2 >= measuredHeight + size) {
                    }
                    if (!z) {
                    }
                }
            }
        }
        return (onExtraCallbackWithResult) obj;
    }

    private final void onExtraCallbackWithResult(onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        playSoundEffect(0);
        AbsChart.onExtraCallbackWithResult onextracallbackwithresultIAuthTabCallback = IAuthTabCallback();
        if (onextracallbackwithresultIAuthTabCallback != null) {
            int i2 = extraCommand + 77;
            mayLaunchUrl = i2 % 128;
            if (i2 % 2 == 0) {
                onextracallbackwithresultIAuthTabCallback.onNavigationEvent(onextracallbackwithresult.onExtraCallbackWithResult(), onextracallbackwithresult.IAuthTabCallback());
                throw null;
            }
            onextracallbackwithresultIAuthTabCallback.onNavigationEvent(onextracallbackwithresult.onExtraCallbackWithResult(), onextracallbackwithresult.IAuthTabCallback());
            int i3 = extraCommand + 49;
            mayLaunchUrl = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    static final class onExtraCallbackWithResult {
        private static int IAuthTabCallbackStubProxy = 1;
        private static int getInterfaceDescriptor;
        private AbsChart.IAuthTabCallback IAuthTabCallback;
        private AbsChart.IAuthTabCallback IAuthTabCallbackDefault;
        private AbsChart.IAuthTabCallback IAuthTabCallbackStub;
        private AbsChart.IAuthTabCallback access100;
        private AbsChart.IAuthTabCallback asBinder;
        private AbsChart.IAuthTabCallback asInterface;
        private AFj1sSDK onExtraCallback;
        private AbsChart.IAuthTabCallback onExtraCallbackWithResult;
        private AbsChart.IAuthTabCallback onNavigationEvent;
        private final Bitmap onTransact;
        private AbsChart.IAuthTabCallback onWarmupCompleted;

        public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
            int i7 = ~i4;
            int i8 = ~(i7 | i);
            int i9 = ~i;
            int i10 = ~((~i5) | i9);
            int i11 = ~(i9 | i4);
            int i12 = i10 | i11;
            int i13 = (~(i5 | i7)) | i11 | i8;
            int i14 = i + i4 + i2 + ((-168536539) * i6) + (1787681333 * i3);
            int i15 = i14 * i14;
            int i16 = ((-1349843359) * i) + 1460535296 + ((-923239215) * i4) + ((-1716058528) * i8) + (i12 * (-1289454384)) + ((-1289454384) * i13) + (366215168 * i2) + (1604583424 * i6) + (216268800 * i3) + (1778253824 * i15);
            int i17 = (i * (-925914073)) + 175428941 + (i4 * (-925912777)) + (i8 * (-864)) + (i12 * 432) + (i13 * 432) + (i2 * (-925913209)) + (i6 * 1252505731) + (i3 * 30625011) + (i15 * (-2030960640));
            return i16 + ((i17 * i17) * 899809280) != 1 ? onExtraCallback(objArr) : onExtraCallbackWithResult(objArr);
        }

        public onExtraCallbackWithResult(@NotNull AFj1sSDK aFj1sSDK, @NotNull AbsChart.IAuthTabCallback iAuthTabCallback, @NotNull AbsChart.IAuthTabCallback iAuthTabCallback2, @NotNull AbsChart.IAuthTabCallback iAuthTabCallback3, @NotNull AbsChart.IAuthTabCallback iAuthTabCallback4, @NotNull AbsChart.IAuthTabCallback iAuthTabCallback5, @NotNull AbsChart.IAuthTabCallback iAuthTabCallback6, @NotNull AbsChart.IAuthTabCallback iAuthTabCallback7, @NotNull AbsChart.IAuthTabCallback iAuthTabCallback8, @NotNull AbsChart.IAuthTabCallback iAuthTabCallback9, @Nullable Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(aFj1sSDK, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallback2, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallback3, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallback4, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallback5, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallback6, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallback7, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallback8, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallback9, "");
            this.onExtraCallback = aFj1sSDK;
            this.onExtraCallbackWithResult = iAuthTabCallback;
            this.onWarmupCompleted = iAuthTabCallback2;
            this.IAuthTabCallback = iAuthTabCallback3;
            this.asBinder = iAuthTabCallback4;
            this.access100 = iAuthTabCallback5;
            this.asInterface = iAuthTabCallback6;
            this.onNavigationEvent = iAuthTabCallback7;
            this.IAuthTabCallbackDefault = iAuthTabCallback8;
            this.IAuthTabCallbackStub = iAuthTabCallback9;
            this.onTransact = bitmap;
        }

        public final AFj1sSDK onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = getInterfaceDescriptor + 41;
            int i3 = i2 % 128;
            IAuthTabCallbackStubProxy = i3;
            int i4 = i2 % 2;
            AFj1sSDK aFj1sSDK = this.onExtraCallback;
            int i5 = i3 + 85;
            getInterfaceDescriptor = i5 % 128;
            if (i5 % 2 == 0) {
                return aFj1sSDK;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) objArr[0];
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStubProxy + 111;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            AbsChart.IAuthTabCallback iAuthTabCallback = onextracallbackwithresult.onExtraCallbackWithResult;
            if (i3 == 0) {
                return iAuthTabCallback;
            }
            throw null;
        }

        public final AbsChart.IAuthTabCallback asBinder() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStubProxy;
            int i3 = i2 + 71;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
            AbsChart.IAuthTabCallback iAuthTabCallback = this.onWarmupCompleted;
            int i5 = i2 + 75;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
            return iAuthTabCallback;
        }

        public final AbsChart.IAuthTabCallback onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStubProxy;
            int i3 = i2 + 47;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
            AbsChart.IAuthTabCallback iAuthTabCallback = this.IAuthTabCallback;
            int i5 = i2 + 3;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
            return iAuthTabCallback;
        }

        public final AbsChart.IAuthTabCallback onTransact() {
            int i = 2 % 2;
            int i2 = getInterfaceDescriptor;
            int i3 = i2 + 75;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
            AbsChart.IAuthTabCallback iAuthTabCallback = this.asBinder;
            int i5 = i2 + 75;
            IAuthTabCallbackStubProxy = i5 % 128;
            if (i5 % 2 != 0) {
                return iAuthTabCallback;
            }
            throw null;
        }

        private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) objArr[0];
            int i = 2 % 2;
            int i2 = getInterfaceDescriptor;
            int i3 = i2 + 27;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
            AbsChart.IAuthTabCallback iAuthTabCallback = onextracallbackwithresult.access100;
            int i5 = i2 + 39;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            return iAuthTabCallback;
        }

        public final AbsChart.IAuthTabCallback IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStubProxy + 91;
            int i3 = i2 % 128;
            getInterfaceDescriptor = i3;
            int i4 = i2 % 2;
            AbsChart.IAuthTabCallback iAuthTabCallback = this.asInterface;
            int i5 = i3 + 97;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            return iAuthTabCallback;
        }

        public final AbsChart.IAuthTabCallback onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStubProxy + 7;
            int i3 = i2 % 128;
            getInterfaceDescriptor = i3;
            int i4 = i2 % 2;
            AbsChart.IAuthTabCallback iAuthTabCallback = this.onNavigationEvent;
            int i5 = i3 + 93;
            IAuthTabCallbackStubProxy = i5 % 128;
            if (i5 % 2 != 0) {
                return iAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final AbsChart.IAuthTabCallback asInterface() {
            int i = 2 % 2;
            int i2 = getInterfaceDescriptor;
            int i3 = i2 + 109;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
            AbsChart.IAuthTabCallback iAuthTabCallback = this.IAuthTabCallbackDefault;
            int i5 = i2 + 29;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            return iAuthTabCallback;
        }

        public final AbsChart.IAuthTabCallback IAuthTabCallbackStubProxy() {
            int i = 2 % 2;
            int i2 = getInterfaceDescriptor + 111;
            IAuthTabCallbackStubProxy = i2 % 128;
            if (i2 % 2 != 0) {
                return this.IAuthTabCallbackStub;
            }
            throw null;
        }

        public final Bitmap IAuthTabCallbackStub() {
            int i = 2 % 2;
            int i2 = getInterfaceDescriptor + 3;
            int i3 = i2 % 128;
            IAuthTabCallbackStubProxy = i3;
            int i4 = i2 % 2;
            Bitmap bitmap = this.onTransact;
            int i5 = i3 + 95;
            getInterfaceDescriptor = i5 % 128;
            if (i5 % 2 == 0) {
                return bitmap;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final float IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = getInterfaceDescriptor + 65;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            float fOnWarmupCompleted = this.onExtraCallbackWithResult.onWarmupCompleted();
            int i4 = getInterfaceDescriptor + 67;
            IAuthTabCallbackStubProxy = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 81 / 0;
            }
            return fOnWarmupCompleted;
        }

        public final AbsChart.IAuthTabCallback onWarmupCompleted() {
            int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
            int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
            int iOnWarmupCompleted3 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
            return (AbsChart.IAuthTabCallback) onExtraCallbackWithResult(568818806, iOnWarmupCompleted2, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), new Object[]{this}, -568818806, iOnWarmupCompleted, iOnWarmupCompleted3);
        }

        public final AbsChart.IAuthTabCallback access000() {
            int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
            int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
            int iOnWarmupCompleted3 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
            return (AbsChart.IAuthTabCallback) onExtraCallbackWithResult(-140069223, iOnWarmupCompleted2, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), new Object[]{this}, 140069224, iOnWarmupCompleted, iOnWarmupCompleted3);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class IAuthTabCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ IAuthTabCallback[] $VALUES;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        public static final IAuthTabCallback SOLID = new IAuthTabCallback("SOLID", 0);
        public static final IAuthTabCallback DASH_DOTTED = new IAuthTabCallback("DASH_DOTTED", 1);

        private static final /* synthetic */ IAuthTabCallback[] $values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 59;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            IAuthTabCallback[] iAuthTabCallbackArr = {SOLID, DASH_DOTTED};
            int i5 = i2 + 75;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return iAuthTabCallbackArr;
        }

        public static EnumEntries<IAuthTabCallback> getEntries() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 15;
            onExtraCallback = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            EnumEntries<IAuthTabCallback> enumEntries = $ENTRIES;
            int i4 = i2 + 99;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return enumEntries;
            }
            obj.hashCode();
            throw null;
        }

        public static IAuthTabCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 113;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) Enum.valueOf(IAuthTabCallback.class, str);
            int i4 = onNavigationEvent + 87;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return iAuthTabCallback;
        }

        public static IAuthTabCallback[] values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 23;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback[] iAuthTabCallbackArr = (IAuthTabCallback[]) $VALUES.clone();
            int i4 = onExtraCallback + 61;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return iAuthTabCallbackArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private IAuthTabCallback(String str, int i) {
        }

        static {
            IAuthTabCallback[] iAuthTabCallbackArr$values = $values();
            $VALUES = iAuthTabCallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(iAuthTabCallbackArr$values);
            int i = onExtraCallbackWithResult + 13;
            onWarmupCompleted = i % 128;
            int i2 = i % 2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onNavigationEvent {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onNavigationEvent[] $VALUES;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        public static final onNavigationEvent SPACE_BETWEEN = new onNavigationEvent("SPACE_BETWEEN", 0);
        public static final onNavigationEvent SPACE_AROUND = new onNavigationEvent("SPACE_AROUND", 1);

        private static final /* synthetic */ onNavigationEvent[] $values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 37;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            onNavigationEvent[] onnavigationeventArr = {SPACE_BETWEEN, SPACE_AROUND};
            int i5 = i3 + 57;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 55 / 0;
            }
            return onnavigationeventArr;
        }

        public static EnumEntries<onNavigationEvent> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 125;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            EnumEntries<onNavigationEvent> enumEntries = $ENTRIES;
            if (i3 != 0) {
                int i4 = 97 / 0;
            }
            return enumEntries;
        }

        public static onNavigationEvent valueOf(String str) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 103;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationevent = (onNavigationEvent) Enum.valueOf(onNavigationEvent.class, str);
            if (i3 == 0) {
                throw null;
            }
            int i4 = IAuthTabCallback + 41;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return onnavigationevent;
        }

        public static onNavigationEvent[] values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 103;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent[] onnavigationeventArr = (onNavigationEvent[]) $VALUES.clone();
            int i4 = onExtraCallbackWithResult + 105;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return onnavigationeventArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private onNavigationEvent(String str, int i) {
        }

        static {
            onNavigationEvent[] onnavigationeventArr$values = $values();
            $VALUES = onnavigationeventArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onnavigationeventArr$values);
            int i = onNavigationEvent + Imgproc.COLOR_YUV2RGB_YVYU;
            onWarmupCompleted = i % 128;
            int i2 = i % 2;
        }
    }

    public static final class onExtraCallback {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        public final float onNavigationEvent(@NotNull Context context) {
            DisplayMetrics displayMetrics;
            int i;
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 23;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(context, "");
                displayMetrics = context.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
                i = 104;
            } else {
                Intrinsics.checkNotNullParameter(context, "");
                displayMetrics = context.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
                i = 50;
            }
            return varyMatches.onNavigationEvent(Integer.valueOf(i), displayMetrics);
        }

        public final float IAuthTabCallback(@NotNull Context context) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 55;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            float fOnNavigationEvent = varyMatches.onNavigationEvent(24, displayMetrics);
            int i4 = onExtraCallback + 59;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return fOnNavigationEvent;
        }
    }

    public static /* synthetic */ boolean IAuthTabCallback(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        return ((Boolean) onNavigationEvent(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -765102156, objArr, iIAuthTabCallback, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 765102160)).booleanValue();
    }

    public static /* synthetic */ boolean IAuthTabCallback(onExtraCallbackWithResult onextracallbackwithresult) {
        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        return ((Boolean) onNavigationEvent(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback2, -1988753295, new Object[]{onextracallbackwithresult}, iIAuthTabCallback, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 1988753295)).booleanValue();
    }

    private static final void onExtraCallback(Canvas canvas, onExtraCallbackWithResult onextracallbackwithresult, float f, BarChart barChart) {
        Object[] objArr = {canvas, onextracallbackwithresult, Float.valueOf(f), barChart};
        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        onNavigationEvent(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -1397178048, objArr, iIAuthTabCallback, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 1397178051);
    }

    private final float access000() {
        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        return ((Float) onNavigationEvent(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback2, -1438604423, new Object[]{this}, iIAuthTabCallback, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 1438604424)).floatValue();
    }

    private final void onExtraCallback(boolean z, float f) {
        Object[] objArr = {this, Boolean.valueOf(z), Float.valueOf(f)};
        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        onNavigationEvent(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 1600167220, objArr, iIAuthTabCallback, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -1600167218);
    }
}
