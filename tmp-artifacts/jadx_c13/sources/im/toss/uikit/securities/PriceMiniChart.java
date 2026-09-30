package im.toss.uikit.securities;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Range;
import android.view.View;
import im.toss.features.usshome.UssHomeItemAdapter$;
import im.toss.uikit.R;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.VideoEncoderInfoImplExternalSyntheticLambda0;
import o.getAdService;
import o.getFaultAddress;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.readIntokhttp;
import o.setVisitUrl;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class PriceMiniChart extends View {
    private static int extraCallback = 0;
    private static int onActivityLayout = 0;
    private static int onActivityResized = 1;
    private static int onMinimized = 1;
    private final Path IAuthTabCallback;
    private int IAuthTabCallbackDefault;
    private final Path IAuthTabCallbackStub;
    private final Path IAuthTabCallbackStubProxy;
    private final Lazy IAuthTabCallback_Parcel;
    private final Path ICustomTabsCallback;
    private final Lazy access000;
    private final Lazy access100;
    private final Lazy asBinder;
    private List<onWarmupCompleted> asInterface;
    private Range<Double> extraCallbackWithResult;
    private final Path getInterfaceDescriptor;
    private final Lazy onExtraCallbackWithResult;
    private double onTransact;
    private final Lazy onWarmupCompleted;
    private Range<Double> readTypedObject;
    private boolean writeTypedObject;
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    public static final int onNavigationEvent = 8;
    private static final Range<Double> onExtraCallback = new Range<>(Double.valueOf(0.0d), Double.valueOf(100.0d));

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PriceMiniChart(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PriceMiniChart(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ float IAuthTabCallback(Context context) {
        int i = 2 % 2;
        int i2 = onMinimized + 91;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted2 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        float fFloatValue = ((Float) IAuthTabCallback(UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), -1656126763, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), iOnWarmupCompleted2, iOnWarmupCompleted, new Object[]{context}, 1656126765)).floatValue();
        int i4 = onMinimized + 105;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return fFloatValue;
    }

    public static /* synthetic */ Paint IAuthTabCallback(PriceMiniChart priceMiniChart) {
        int i = 2 % 2;
        int i2 = onMinimized + 41;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            asInterface(priceMiniChart);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Paint paintAsInterface = asInterface(priceMiniChart);
        int i3 = onMinimized + 37;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        return paintAsInterface;
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i6;
        int i8 = ~((~i2) | i7);
        int i9 = ~i5;
        int i10 = i8 | (~(i9 | i2)) | (~(i6 | i2));
        int i11 = i7 | i2;
        int i12 = i9 | i11;
        int i13 = i6 + i2 + i4 + ((-1542968645) * i) + (1789173782 * i3);
        int i14 = i13 * i13;
        int i15 = (1553370224 * i6) + 752877568 + ((-368479342) * i2) + (i10 * 1186558865) + (1921849566 * i11) + (1186558865 * i12) + ((-1555038208) * i4) + (1802502144 * i) + (148897792 * i3) + (289275904 * i14);
        int i16 = (i6 * (-930071408)) + 1959937684 + (i2 * (-930070194)) + (i10 * 607) + (i11 * (-1214)) + (i12 * 607) + (i4 * (-930070801)) + (i * 1059663509) + (i3 * (-1428764534)) + (i14 * 484573184);
        int i17 = i15 + (i16 * i16 * 411172864);
        if (i17 == 1) {
            return onExtraCallbackWithResult(objArr);
        }
        if (i17 != 2) {
            return i17 != 3 ? onExtraCallback(objArr) : onWarmupCompleted(objArr);
        }
        Context context = (Context) objArr[0];
        int i18 = 2 % 2;
        int i19 = onMinimized + 91;
        extraCallback = i19 % 128;
        int i20 = i19 % 2;
        float fIAuthTabCallback = varyMatches.IAuthTabCallback(Float.valueOf(1.0f), context);
        int i21 = extraCallback + 49;
        onMinimized = i21 % 128;
        int i22 = i21 % 2;
        return Float.valueOf(fIAuthTabCallback);
    }

    public static /* synthetic */ Paint onExtraCallbackWithResult(PriceMiniChart priceMiniChart) {
        int i = 2 % 2;
        int i2 = onMinimized + 27;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {priceMiniChart};
        int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted2 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted3 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted4 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        if (i3 != 0) {
            throw null;
        }
        Paint paint = (Paint) IAuthTabCallback(iOnWarmupCompleted3, 2092431284, iOnWarmupCompleted4, iOnWarmupCompleted2, iOnWarmupCompleted, objArr, -2092431283);
        int i4 = onMinimized + 47;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return paint;
        }
        throw null;
    }

    public static /* synthetic */ Paint onNavigationEvent(PriceMiniChart priceMiniChart) {
        int i = 2 % 2;
        int i2 = extraCallback + Imgproc.COLOR_YUV2RGB_YVYU;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted2 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        Paint paint = (Paint) IAuthTabCallback(UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), 1737993297, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), iOnWarmupCompleted2, iOnWarmupCompleted, new Object[]{priceMiniChart}, -1737993297);
        int i4 = extraCallback + 73;
        onMinimized = i4 % 128;
        if (i4 % 2 != 0) {
            return paint;
        }
        throw null;
    }

    public static /* synthetic */ float onWarmupCompleted(Context context) {
        int i = 2 % 2;
        int i2 = onMinimized + 81;
        extraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onNavigationEvent(context);
            obj.hashCode();
            throw null;
        }
        float fOnNavigationEvent = onNavigationEvent(context);
        int i3 = extraCallback + 35;
        onMinimized = i3 % 128;
        if (i3 % 2 != 0) {
            return fOnNavigationEvent;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Paint onWarmupCompleted(PriceMiniChart priceMiniChart) {
        int i = 2 % 2;
        int i2 = extraCallback + 41;
        onMinimized = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback(priceMiniChart);
        }
        onExtraCallback(priceMiniChart);
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceMiniChart(@NotNull final Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.asInterface = CollectionsKt__CollectionsKt.emptyList();
        this.onTransact = 50.0d;
        Range<Double> range = onExtraCallback;
        this.extraCallbackWithResult = range;
        this.readTypedObject = range;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Configuration configuration = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        this.IAuthTabCallbackDefault = new getUrlokhttp(new onExtraCallback(configuration)).onPostMessage();
        this.onExtraCallbackWithResult = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: im.toss.uikit.securities.PriceMiniChart$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 27;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Float fValueOf = Float.valueOf(PriceMiniChart.IAuthTabCallback(context));
                int i5 = IAuthTabCallback + 33;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return fValueOf;
            }
        });
        this.access000 = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: im.toss.uikit.securities.PriceMiniChart$$ExternalSyntheticLambda1
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Float fValueOf;
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 99;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    fValueOf = Float.valueOf(PriceMiniChart.onWarmupCompleted(context));
                    int i4 = 53 / 0;
                } else {
                    fValueOf = Float.valueOf(PriceMiniChart.onWarmupCompleted(context));
                }
                int i5 = onExtraCallback + 67;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 94 / 0;
                }
                return fValueOf;
            }
        });
        this.IAuthTabCallback_Parcel = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: im.toss.uikit.securities.PriceMiniChart$$ExternalSyntheticLambda2
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 115;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    PriceMiniChart.onNavigationEvent(this.f$0);
                    throw null;
                }
                Paint paintOnNavigationEvent = PriceMiniChart.onNavigationEvent(this.f$0);
                int i4 = onExtraCallback + 47;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return paintOnNavigationEvent;
            }
        });
        this.access100 = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: im.toss.uikit.securities.PriceMiniChart$$ExternalSyntheticLambda3
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + Imgproc.COLOR_YUV2RGBA_YVYU;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Paint paintIAuthTabCallback = PriceMiniChart.IAuthTabCallback(this.f$0);
                int i5 = onExtraCallbackWithResult + 89;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    return paintIAuthTabCallback;
                }
                throw null;
            }
        });
        this.asBinder = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: im.toss.uikit.securities.PriceMiniChart$$ExternalSyntheticLambda4
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 27;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Paint paintOnExtraCallbackWithResult = PriceMiniChart.onExtraCallbackWithResult(this.f$0);
                int i5 = onNavigationEvent + 85;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 31 / 0;
                }
                return paintOnExtraCallbackWithResult;
            }
        });
        this.onWarmupCompleted = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: im.toss.uikit.securities.PriceMiniChart$$ExternalSyntheticLambda5
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 23;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                PriceMiniChart priceMiniChart = this.f$0;
                if (i4 != 0) {
                    return PriceMiniChart.onWarmupCompleted(priceMiniChart);
                }
                PriceMiniChart.onWarmupCompleted(priceMiniChart);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        this.ICustomTabsCallback = new Path();
        this.IAuthTabCallbackStubProxy = new Path();
        this.IAuthTabCallbackStub = new Path();
        this.getInterfaceDescriptor = new Path();
        this.IAuthTabCallback = new Path();
        if (attributeSet != null) {
            int[] iArr = R.styleable.PriceMiniChart;
            Intrinsics.checkNotNullExpressionValue(iArr, "");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == R.styleable.PriceMiniChart_showGradient) {
                    int i3 = onMinimized + Imgproc.COLOR_YUV2RGBA_YVYU;
                    extraCallback = i3 % 128;
                    int i4 = i3 % 2;
                    setShowGradient(typedArrayObtainStyledAttributes.getBoolean(index, false));
                    int i5 = 2 % 2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            int i6 = 2 % 2;
        }
        int i7 = extraCallback + 43;
        onMinimized = i7 % 128;
        int i8 = i7 % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PriceMiniChart(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = extraCallback + 123;
            onMinimized = i3 % 128;
            int i4 = i3 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i5 = onMinimized + 113;
            extraCallback = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public static final class onWarmupCompleted {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private final boolean onExtraCallback;
        private final double onNavigationEvent;
        private final double onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = IAuthTabCallback + 99;
                onExtraCallbackWithResult = i2 % 128;
                return i2 % 2 != 0;
            }
            if (!(obj instanceof onWarmupCompleted)) {
                return false;
            }
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) obj;
            if (Double.compare(this.onNavigationEvent, onwarmupcompleted.onNavigationEvent) != 0) {
                int i3 = IAuthTabCallback + 105;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            if (Double.compare(this.onWarmupCompleted, onwarmupcompleted.onWarmupCompleted) != 0) {
                return false;
            }
            if (this.onExtraCallback == onwarmupcompleted.onExtraCallback) {
                return true;
            }
            int i5 = IAuthTabCallback + 69;
            onExtraCallbackWithResult = i5 % 128;
            return i5 % 2 == 0;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 125;
            IAuthTabCallback = i2 % 128;
            return i2 % 2 != 0 ? (((Double.hashCode(this.onNavigationEvent) << 72) % Double.hashCode(this.onWarmupCompleted)) << 101) >> Boolean.hashCode(this.onExtraCallback) : (((Double.hashCode(this.onNavigationEvent) * 31) + Double.hashCode(this.onWarmupCompleted)) * 31) + Boolean.hashCode(this.onExtraCallback);
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Entry(x=" + this.onNavigationEvent + ", y=" + this.onWarmupCompleted + ", greyArea=" + this.onExtraCallback + ")";
            int i2 = onExtraCallbackWithResult + 27;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public onWarmupCompleted(double d, double d2, boolean z) {
            this.onNavigationEvent = d;
            this.onWarmupCompleted = d2;
            this.onExtraCallback = z;
        }

        public final double onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 15;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            double d = this.onNavigationEvent;
            int i5 = i3 + 115;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return d;
        }

        public final double onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 79;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            double d = this.onWarmupCompleted;
            int i5 = i2 + 55;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return d;
        }

        public final boolean IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 73;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return this.onExtraCallback;
            }
            throw null;
        }
    }

    public final void setEntries(@NotNull List<onWarmupCompleted> list) {
        int i = 2 % 2;
        int i2 = extraCallback + 87;
        onMinimized = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.areEqual(list, this.asInterface);
            throw null;
        }
        Intrinsics.checkNotNullParameter(list, "");
        if (Intrinsics.areEqual(list, this.asInterface)) {
            return;
        }
        this.asInterface = CollectionsKt___CollectionsKt.sortedWith(list, new IAuthTabCallbackStub());
        invalidate();
        int i3 = onMinimized + 63;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    public final double onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onMinimized + 75;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onTransact;
        }
        throw null;
    }

    public final void setBaselineValue(double d) {
        int i = 2 % 2;
        int i2 = onMinimized;
        int i3 = i2 + 19;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        if (d != this.onTransact) {
            this.onTransact = d;
            invalidate();
            return;
        }
        int i5 = i2 + 39;
        extraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 56 / 0;
        }
    }

    public final void setMaxYAxisValue(double d) {
        int i = 2 % 2;
        setYAxisRange(new Range<>(this.extraCallbackWithResult.getLower(), Double.valueOf(d)));
        invalidate();
        int i2 = extraCallback + 23;
        onMinimized = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final double onExtraCallback() {
        int i = 2 % 2;
        int i2 = extraCallback + 33;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Object upper = this.extraCallbackWithResult.getUpper();
        Intrinsics.checkNotNullExpressionValue(upper, "");
        double dDoubleValue = ((Number) upper).doubleValue();
        int i4 = extraCallback + 3;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        return dDoubleValue;
    }

    public final void setMinYAxisValue(double d) {
        int i = 2 % 2;
        setYAxisRange(new Range<>(Double.valueOf(d), this.extraCallbackWithResult.getUpper()));
        invalidate();
        int i2 = onMinimized + 77;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    public final double onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onMinimized + 113;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object lower = this.extraCallbackWithResult.getLower();
        Intrinsics.checkNotNullExpressionValue(lower, "");
        double dDoubleValue = ((Number) lower).doubleValue();
        int i4 = extraCallback + 31;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        return dDoubleValue;
    }

    public static final class IAuthTabCallback implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public IAuthTabCallback(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 111;
            onExtraCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                if (!readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                    return getSpecialFeatureOptInStatus.Light;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                int i3 = onExtraCallback + 37;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    return getspecialfeatureoptinstatus;
                }
                obj.hashCode();
                throw null;
            }
            readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult);
            obj.hashCode();
            throw null;
        }
    }

    public static final class onExtraCallback implements getAdService {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onExtraCallback;

        public onExtraCallback(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i2 = onExtraCallbackWithResult + 11;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return getspecialfeatureoptinstatus;
            }
            int i4 = onExtraCallbackWithResult + 93;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Dark;
            if (i5 == 0) {
                int i6 = 52 / 0;
            }
            return getspecialfeatureoptinstatus2;
        }
    }

    public static final class onNavigationEvent implements getAdService {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Configuration onExtraCallback;

        public onNavigationEvent(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i2 = onNavigationEvent + 123;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return getspecialfeatureoptinstatus;
            }
            int i4 = onNavigationEvent + 57;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Dark;
            int i6 = onNavigationEvent + 53;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return getspecialfeatureoptinstatus2;
        }
    }

    public final void setYAxisRange(@NotNull Range<Double> range) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(range, "");
        if (!Intrinsics.areEqual(range, this.extraCallbackWithResult)) {
            int i2 = extraCallback + 71;
            onMinimized = i2 % 128;
            if (i2 % 2 == 0) {
                this.extraCallbackWithResult = range;
                invalidate();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            this.extraCallbackWithResult = range;
            invalidate();
        }
        int i3 = onMinimized + 35;
        extraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 9 / 0;
        }
    }

    public final void setXAxisRange(@NotNull Range<Double> range) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(range, "");
        Object obj = null;
        if (!Intrinsics.areEqual(range, this.readTypedObject)) {
            int i2 = onMinimized + 25;
            extraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                this.readTypedObject = range;
                invalidate();
                throw null;
            }
            this.readTypedObject = range;
            invalidate();
        }
        int i3 = onMinimized + 83;
        extraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final void setShowGradient(boolean z) {
        int i = 2 % 2;
        int i2 = extraCallback + 101;
        onMinimized = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (z != this.writeTypedObject) {
            this.writeTypedObject = z;
            invalidate();
        }
        int i3 = extraCallback + 31;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void setGraphColor(int i) {
        int i2 = 2 % 2;
        int i3 = onMinimized + 27;
        int i4 = i3 % 128;
        extraCallback = i4;
        int i5 = i3 % 2;
        if (i != this.IAuthTabCallbackDefault) {
            int i6 = i4 + 17;
            onMinimized = i6 % 128;
            if (i6 % 2 != 0) {
                this.IAuthTabCallbackDefault = i;
                IAuthTabCallbackStub().setColor(i);
                invalidate();
            } else {
                this.IAuthTabCallbackDefault = i;
                IAuthTabCallbackStub().setColor(i);
                invalidate();
                int i7 = 42 / 0;
            }
        }
    }

    public static final class IAuthTabCallbackStub<T> implements Comparator {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 49;
            onExtraCallbackWithResult = i2 % 128;
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) t;
            if (i2 % 2 != 0) {
                return getFaultAddress.onExtraCallbackWithResult(Double.valueOf(onwarmupcompleted.onExtraCallbackWithResult()), Double.valueOf(((onWarmupCompleted) t2).onExtraCallbackWithResult()));
            }
            getFaultAddress.onExtraCallbackWithResult(Double.valueOf(onwarmupcompleted.onExtraCallbackWithResult()), Double.valueOf(((onWarmupCompleted) t2).onExtraCallbackWithResult()));
            throw null;
        }
    }

    private final float onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onMinimized + 123;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        float fFloatValue = ((Number) this.onExtraCallbackWithResult.getValue()).floatValue();
        int i4 = extraCallback + 99;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        return fFloatValue;
    }

    private final float onTransact() {
        int i = 2 % 2;
        int i2 = onMinimized + 61;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.access000.getValue();
        if (i3 == 0) {
            return ((Number) value).floatValue();
        }
        ((Number) value).floatValue();
        throw null;
    }

    private static final float onNavigationEvent(Context context) {
        int i = 2 % 2;
        int i2 = onMinimized + 119;
        extraCallback = i2 % 128;
        float fIAuthTabCallback = varyMatches.IAuthTabCallback(i2 % 2 != 0 ? Float.valueOf(2.0f) : Float.valueOf(2.0f), context);
        int i3 = onMinimized + 3;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        return fIAuthTabCallback;
    }

    private final Paint IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = extraCallback + 63;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Paint paint = (Paint) this.IAuthTabCallback_Parcel.getValue();
        if (i3 == 0) {
            int i4 = 86 / 0;
        }
        return paint;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        PriceMiniChart priceMiniChart = (PriceMiniChart) objArr[0];
        int i = 2 % 2;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(priceMiniChart.onTransact());
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setPathEffect(new CornerPathEffect(4.0f));
        int i2 = extraCallback + 25;
        onMinimized = i2 % 128;
        if (i2 % 2 != 0) {
            return paint;
        }
        throw null;
    }

    private final Paint asBinder() {
        int i = 2 % 2;
        int i2 = extraCallback + 25;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Paint paint = (Paint) this.access100.getValue();
        if (i3 != 0) {
            return paint;
        }
        throw null;
    }

    private static final Paint asInterface(PriceMiniChart priceMiniChart) {
        int i = 2 % 2;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(priceMiniChart.onTransact());
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setPathEffect(new CornerPathEffect(4.0f));
        Context context = priceMiniChart.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        Object[] objArr = {new getUrlokhttp(new IAuthTabCallback(configuration))};
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        paint.setColor(((Integer) getUrlokhttp.onNavigationEvent(objArr, 71998626, -71998625, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult())).intValue());
        int i2 = extraCallback + 17;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        return paint;
    }

    private final Paint asInterface() {
        int i = 2 % 2;
        int i2 = extraCallback + Imgproc.COLOR_YUV2RGBA_YVYU;
        onMinimized = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Paint paint = (Paint) this.asBinder.getValue();
        int i3 = extraCallback + 83;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
        return paint;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        PriceMiniChart priceMiniChart = (PriceMiniChart) objArr[0];
        int i = 2 % 2;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        Intrinsics.checkNotNullExpressionValue(priceMiniChart.getResources().getDisplayMetrics(), "");
        paint.setPathEffect(new CornerPathEffect(varyMatches.onNavigationEvent(2, r4)));
        int i2 = extraCallback + 55;
        onMinimized = i2 % 128;
        if (i2 % 2 != 0) {
            return paint;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        PriceMiniChart priceMiniChart = (PriceMiniChart) objArr[0];
        int i = 2 % 2;
        int i2 = onMinimized + 55;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Paint paint = (Paint) priceMiniChart.onWarmupCompleted.getValue();
        int i4 = extraCallback + 31;
        onMinimized = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 24 / 0;
        }
        return paint;
    }

    private static final Paint onExtraCallback(PriceMiniChart priceMiniChart) {
        int i = 2 % 2;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        Context context = priceMiniChart.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        paint.setColor(new getUrlokhttp(new onNavigationEvent(configuration)).isEngagementSignalsApiAvailable());
        paint.setStrokeWidth(priceMiniChart.onNavigationEvent());
        DisplayMetrics displayMetrics = priceMiniChart.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        float fOnNavigationEvent = varyMatches.onNavigationEvent(3, displayMetrics);
        Intrinsics.checkNotNullExpressionValue(priceMiniChart.getResources().getDisplayMetrics(), "");
        paint.setPathEffect(new DashPathEffect(new float[]{fOnNavigationEvent, varyMatches.onNavigationEvent(2, r7)}, 0.0f));
        int i2 = extraCallback + 57;
        onMinimized = i2 % 128;
        if (i2 % 2 != 0) {
            return paint;
        }
        throw null;
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        int i = 2 % 2;
        int i2 = onMinimized + 73;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(canvas, "");
            super.onDraw(canvas);
            onWarmupCompleted(canvas);
        } else {
            Intrinsics.checkNotNullParameter(canvas, "");
            super.onDraw(canvas);
            onWarmupCompleted(canvas);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private final void onWarmupCompleted(Canvas canvas) {
        float f;
        Iterator it;
        int i = 2 % 2;
        double dOnExtraCallback = onExtraCallback() - onExtraCallbackWithResult();
        if (dOnExtraCallback <= 0.0d) {
            return;
        }
        int measuredHeight = getMeasuredHeight();
        int paddingBottom = getPaddingBottom();
        int paddingTop = getPaddingTop();
        int measuredWidth = getMeasuredWidth() - (getPaddingLeft() + getPaddingRight());
        this.ICustomTabsCallback.reset();
        this.IAuthTabCallbackStub.reset();
        this.IAuthTabCallbackStubProxy.reset();
        this.getInterfaceDescriptor.reset();
        try {
            Result.Companion companion = Result.Companion;
            int iIAuthTabCallback = VideoEncoderInfoImplExternalSyntheticLambda0.IAuthTabCallback(this.IAuthTabCallbackDefault, 76);
            IAuthTabCallbackStub().setColor(this.IAuthTabCallbackDefault);
            float f2 = measuredHeight - (paddingBottom + paddingTop);
            double dOnTransact = (f2 - onTransact()) / dOnExtraCallback;
            onExtraCallbackWithResult(canvas, onNavigationEvent() / 2.0f, this.onTransact, onExtraCallback(), dOnTransact);
            if (!this.asInterface.isEmpty()) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
                float fOnTransact = onTransact() / 2.0f;
                float f3 = f2 - fOnTransact;
                float paddingLeft = getPaddingLeft();
                float paddingTop2 = getPaddingTop() + f2;
                List<onWarmupCompleted> list = this.asInterface;
                ArrayList arrayList = new ArrayList();
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    int i2 = extraCallback + 35;
                    onMinimized = i2 % 128;
                    if (i2 % 2 == 0) {
                        ((onWarmupCompleted) it2.next()).IAuthTabCallback();
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    Object next = it2.next();
                    if (!((onWarmupCompleted) next).IAuthTabCallback()) {
                        arrayList.add(next);
                    }
                }
                int i3 = 0;
                for (Object obj2 : arrayList) {
                    if (i3 < 0) {
                        int i4 = extraCallback + 63;
                        onMinimized = i4 % 128;
                        if (i4 % 2 == 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                            int i5 = 87 / 0;
                        } else {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                        }
                    }
                    onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) obj2;
                    double dOnWarmupCompleted = onwarmupcompleted.onWarmupCompleted();
                    paddingLeft = onNavigationEvent(this.readTypedObject, onwarmupcompleted.onExtraCallbackWithResult()) * measuredWidth;
                    paddingTop2 = ((float) ((onExtraCallback() - dOnWarmupCompleted) * dOnTransact)) + fOnTransact;
                    if (i3 == 0) {
                        int i6 = extraCallback + 107;
                        onMinimized = i6 % 128;
                        int i7 = i6 % 2;
                        this.ICustomTabsCallback.moveTo(paddingLeft, paddingTop2);
                        if (this.writeTypedObject) {
                            this.IAuthTabCallbackStub.moveTo(paddingLeft, paddingTop2);
                        }
                    } else {
                        this.ICustomTabsCallback.lineTo(paddingLeft, paddingTop2);
                        if (this.writeTypedObject) {
                            this.IAuthTabCallbackStub.lineTo(paddingLeft, paddingTop2);
                            int i8 = onMinimized + 125;
                            extraCallback = i8 % 128;
                            int i9 = i8 % 2;
                        }
                    }
                    i3++;
                }
                if (!this.writeTypedObject || arrayList.isEmpty()) {
                    f = f2;
                } else {
                    this.IAuthTabCallbackStub.lineTo(paddingLeft, f3);
                    this.IAuthTabCallbackStub.lineTo(getPaddingLeft(), f3);
                    this.IAuthTabCallbackStub.close();
                    Path path = this.IAuthTabCallbackStub;
                    Paint paintAsInterface = asInterface();
                    f = f2;
                    paintAsInterface.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, f, iIAuthTabCallback, 0, Shader.TileMode.CLAMP));
                    Unit unit = Unit.INSTANCE;
                    canvas.drawPath(path, paintAsInterface);
                }
                canvas.drawPath(this.ICustomTabsCallback, IAuthTabCallbackStub());
                List<onWarmupCompleted> list2 = this.asInterface;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list2) {
                    if (((onWarmupCompleted) obj3).IAuthTabCallback()) {
                        arrayList2.add(obj3);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    int i10 = extraCallback + 49;
                    onMinimized = i10 % 128;
                    if (i10 % 2 == 0) {
                        this.IAuthTabCallbackStubProxy.moveTo(paddingLeft, paddingTop2);
                        this.getInterfaceDescriptor.moveTo(paddingLeft, paddingTop2);
                        it = arrayList2.iterator();
                        int i11 = 80 / 0;
                    } else {
                        this.IAuthTabCallbackStubProxy.moveTo(paddingLeft, paddingTop2);
                        this.getInterfaceDescriptor.moveTo(paddingLeft, paddingTop2);
                        it = arrayList2.iterator();
                    }
                    float fOnNavigationEvent = paddingLeft;
                    while (it.hasNext()) {
                        int i12 = onMinimized + 37;
                        extraCallback = i12 % 128;
                        int i13 = i12 % 2;
                        onWarmupCompleted onwarmupcompleted2 = (onWarmupCompleted) it.next();
                        double dOnWarmupCompleted2 = onwarmupcompleted2.onWarmupCompleted();
                        fOnNavigationEvent = onNavigationEvent(this.readTypedObject, onwarmupcompleted2.onExtraCallbackWithResult()) * measuredWidth;
                        float fOnExtraCallback = ((float) ((onExtraCallback() - dOnWarmupCompleted2) * dOnTransact)) + fOnTransact;
                        this.IAuthTabCallbackStubProxy.lineTo(fOnNavigationEvent, fOnExtraCallback);
                        if (this.writeTypedObject) {
                            this.getInterfaceDescriptor.lineTo(fOnNavigationEvent, fOnExtraCallback);
                        }
                    }
                    if (this.writeTypedObject) {
                        this.getInterfaceDescriptor.lineTo(fOnNavigationEvent, f3);
                        this.getInterfaceDescriptor.lineTo(paddingLeft, f3);
                        this.getInterfaceDescriptor.close();
                        Path path2 = this.getInterfaceDescriptor;
                        Paint paintAsInterface2 = asInterface();
                        paintAsInterface2.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, f, VideoEncoderInfoImplExternalSyntheticLambda0.IAuthTabCallback(asBinder().getColor(), 76), 0, Shader.TileMode.CLAMP));
                        Unit unit2 = Unit.INSTANCE;
                        canvas.drawPath(path2, paintAsInterface2);
                    }
                    canvas.drawPath(this.IAuthTabCallbackStubProxy, asBinder());
                }
            }
            Result.m31constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.m31constructorimpl(ResultKt.createFailure(th));
        }
    }

    private final void onExtraCallbackWithResult(Canvas canvas, float f, double d, double d2, double d3) {
        int i = 2 % 2;
        int i2 = onMinimized + Imgproc.COLOR_YUV2RGBA_YVYU;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallback.reset();
        float f2 = ((float) ((d2 - d) * d3)) + f;
        this.IAuthTabCallback.moveTo(getPaddingLeft(), f2);
        this.IAuthTabCallback.lineTo(getMeasuredWidth() - getPaddingRight(), f2);
        Path path = this.IAuthTabCallback;
        int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        canvas.drawPath(path, (Paint) IAuthTabCallback(UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), -1712546421, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), iOnWarmupCompleted, new Object[]{this}, 1712546424));
        this.IAuthTabCallback.close();
        int i4 = extraCallback + 55;
        onMinimized = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final float onNavigationEvent(Range<Double> range, double d) {
        int i = 2 % 2;
        int i2 = onMinimized + 107;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object lower = range.getLower();
        Intrinsics.checkNotNullExpressionValue(lower, "");
        double dDoubleValue = ((Number) lower).doubleValue();
        double dDoubleValue2 = ((Number) range.getUpper()).doubleValue();
        Object lower2 = range.getLower();
        Intrinsics.checkNotNullExpressionValue(lower2, "");
        float fDoubleValue = (float) ((d - dDoubleValue) / (dDoubleValue2 - ((Number) lower2).doubleValue()));
        int i4 = extraCallback + 33;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        return fDoubleValue;
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }

    static {
        int i = onActivityResized + 47;
        onActivityLayout = i % 128;
        int i2 = i % 2;
    }

    private static final float onExtraCallbackWithResult(Context context) {
        int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted2 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        return ((Float) IAuthTabCallback(UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), -1656126763, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), iOnWarmupCompleted2, iOnWarmupCompleted, new Object[]{context}, 1656126765)).floatValue();
    }

    private final Paint IAuthTabCallback() {
        int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted2 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        return (Paint) IAuthTabCallback(UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), -1712546421, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), iOnWarmupCompleted2, iOnWarmupCompleted, new Object[]{this}, 1712546424);
    }

    private static final Paint onTransact(PriceMiniChart priceMiniChart) {
        int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted2 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        return (Paint) IAuthTabCallback(UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), 2092431284, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), iOnWarmupCompleted2, iOnWarmupCompleted, new Object[]{priceMiniChart}, -2092431283);
    }

    private static final Paint IAuthTabCallbackDefault(PriceMiniChart priceMiniChart) {
        int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted2 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        return (Paint) IAuthTabCallback(UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), 1737993297, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), iOnWarmupCompleted2, iOnWarmupCompleted, new Object[]{priceMiniChart}, -1737993297);
    }
}
