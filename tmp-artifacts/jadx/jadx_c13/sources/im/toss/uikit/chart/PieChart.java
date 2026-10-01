package im.toss.uikit.chart;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;
import im.toss.uikit.chart.AbsChart;
import im.toss.uikit.chart.PieChart;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AFj1sSDK;
import o.TransitionKtExternalSyntheticLambda2;
import o.getAdService;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.matches;
import o.readIntokhttp;
import o.response;
import o.setDone;
import o.setHeadersokhttp;
import o.varyMatches;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class PieChart extends AbsChart {
    private static int ICustomTabsCallback = 0;
    private static int writeTypedObject = 1;
    private final Interpolator IAuthTabCallback;
    private long IAuthTabCallbackDefault;
    private ArrayList<onExtraCallbackWithResult> IAuthTabCallbackStub;
    private int IAuthTabCallbackStubProxy;
    private AbsChart.IAuthTabCallback IAuthTabCallback_Parcel;
    private String access000;
    private float access100;
    private final long asBinder;
    private float asInterface;
    private float extraCallback;
    private Paint extraCallbackWithResult;
    private final Interpolator getInterfaceDescriptor;
    private final long onExtraCallback;
    private onExtraCallbackWithResult onExtraCallbackWithResult;
    private final Paint onNavigationEvent;
    private onExtraCallbackWithResult onTransact;
    private final Paint onWarmupCompleted;
    private final Rect readTypedObject;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PieChart(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PieChart(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ boolean onExtraCallback(onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 125;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(onextracallbackwithresult);
        }
        onWarmupCompleted(onextracallbackwithresult);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PieChart(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.IAuthTabCallbackStub = new ArrayList<>();
        Paint paint = new Paint(7);
        this.onWarmupCompleted = paint;
        Paint paint2 = new Paint(7);
        this.onNavigationEvent = paint2;
        Interpolator interpolatorIAuthTabCallback = TransitionKtExternalSyntheticLambda2.IAuthTabCallback(0.0f, 0.55f, 0.45f, 1.0f);
        Intrinsics.checkNotNullExpressionValue(interpolatorIAuthTabCallback, "");
        this.IAuthTabCallback = interpolatorIAuthTabCallback;
        this.onExtraCallback = 800L;
        Interpolator interpolatorIAuthTabCallback2 = TransitionKtExternalSyntheticLambda2.IAuthTabCallback(0.645f, 0.045f, 0.355f, 1.0f);
        Intrinsics.checkNotNullExpressionValue(interpolatorIAuthTabCallback2, "");
        this.getInterfaceDescriptor = interpolatorIAuthTabCallback2;
        this.asBinder = 200L;
        this.access000 = _UrlKt.FRAGMENT_ENCODE_SET;
        this.extraCallbackWithResult = new Paint(7);
        this.IAuthTabCallback_Parcel = new AbsChart.IAuthTabCallback(0.0f, 0.0f, 0.0f);
        this.readTypedObject = new Rect();
        setLayerType(1, null);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Configuration configuration = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        paint.setColor(((Integer) setHeadersokhttp.onExtraCallbackWithResult(-552023978, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{new getUrlokhttp(new onWarmupCompleted(configuration)).requestPostMessageChannel()}, matches.onExtraCallback(), 552023983, matches.onExtraCallback())).intValue());
        Intrinsics.checkNotNullExpressionValue(context.getResources().getDisplayMetrics(), "");
        paint.setStrokeWidth(varyMatches.onNavigationEvent(30, r3));
        paint2.setStyle(style);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        Configuration configuration2 = context3.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        paint2.setColor(new getUrlokhttp(new IAuthTabCallback(configuration2)).requestPostMessageChannel().IEngagementSignalsCallback());
        Intrinsics.checkNotNullExpressionValue(context.getResources().getDisplayMetrics(), "");
        paint2.setStrokeWidth(varyMatches.onNavigationEvent(3, r13));
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.extraCallbackWithResult.setTypeface(response.toTypeface$default(response.Bold, context, (setDone) null, 2, (Object) null));
        Paint paint3 = this.extraCallbackWithResult;
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        Configuration configuration3 = context4.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration3, "");
        paint3.setColor(new getUrlokhttp(new onExtraCallback(configuration3)).onUnminimized());
        Paint paint4 = this.extraCallbackWithResult;
        int iOnTransact = varyMatches.onTransact(this, 16);
        Intrinsics.checkNotNullExpressionValue(context.getResources().getDisplayMetrics(), "");
        paint4.setTextSize(Math.min(iOnTransact, varyMatches.onNavigationEvent(18, r12)));
        this.extraCallbackWithResult.setTextAlign(Paint.Align.CENTER);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PieChart(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = writeTypedObject + 55;
            ICustomTabsCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 2 % 2;
            }
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i5 = ICustomTabsCallback + 1;
            int i6 = i5 % 128;
            writeTypedObject = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 31;
            ICustomTabsCallback = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 2 % 2;
            }
            i = 0;
        }
        this(context, attributeSet, i);
    }

    private final float IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 115;
        ICustomTabsCallback = i2 % 128;
        return i2 % 2 != 0 ? Math.min(this.onExtraCallback, Math.max(1L, System.currentTimeMillis() | onExtraCallbackWithResult())) + this.onExtraCallback : Math.min(this.onExtraCallback, Math.max(0L, System.currentTimeMillis() - onExtraCallbackWithResult())) / this.onExtraCallback;
    }

    private final float asBinder() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 23;
        ICustomTabsCallback = i2 % 128;
        return i2 % 2 != 0 ? Math.min(this.asBinder, Math.max(0L, System.currentTimeMillis() & this.IAuthTabCallbackDefault)) - this.asBinder : Math.min(this.asBinder, Math.max(0L, System.currentTimeMillis() - this.IAuthTabCallbackDefault)) / this.asBinder;
    }

    public static final class IAuthTabCallback implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public IAuthTabCallback(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 63;
            IAuthTabCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                if (!readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                    return getSpecialFeatureOptInStatus.Light;
                }
                int i3 = onWarmupCompleted + 103;
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

    public static final class onExtraCallback implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ Configuration onNavigationEvent;

        public onExtraCallback(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 109;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onNavigationEvent)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i4 = onExtraCallback + 19;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            int i6 = onExtraCallback + 77;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class onWarmupCompleted implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Configuration onNavigationEvent;

        public onWarmupCompleted(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 13;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                if (!readIntokhttp.onExtraCallback(this.onNavigationEvent)) {
                    return getSpecialFeatureOptInStatus.Light;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                int i3 = onWarmupCompleted + 51;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 56 / 0;
                }
                return getspecialfeatureoptinstatus;
            }
            readIntokhttp.onExtraCallback(this.onNavigationEvent);
            throw null;
        }
    }

    @Override // im.toss.uikit.chart.AbsChart
    public boolean onNavigationEvent(@NotNull List<? extends AFj1sSDK> list) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 107;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        boolean zOnNavigationEvent = super.onNavigationEvent(list);
        if (!(!zOnNavigationEvent)) {
            IAuthTabCallback((onExtraCallbackWithResult) null);
            int i4 = ICustomTabsCallback + 125;
            writeTypedObject = i4 % 128;
            int i5 = i4 % 2;
        }
        return zOnNavigationEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x009c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onMeasure(int i, int i2) {
        float fOnWarmupCompleted;
        float fIAuthTabCallback;
        int i3;
        AbsChart.IAuthTabCallback iAuthTabCallback;
        float f;
        AbsChart.IAuthTabCallback iAuthTabCallback2;
        AbsChart.IAuthTabCallback iAuthTabCallback3;
        AbsChart.IAuthTabCallback iAuthTabCallback4;
        AbsChart.IAuthTabCallback iAuthTabCallback5;
        AbsChart.IAuthTabCallback iAuthTabCallback6;
        int i4 = 2;
        int i5 = 2 % 2;
        int i6 = writeTypedObject + 41;
        ICustomTabsCallback = i6 % 128;
        int i7 = i6 % 2;
        super.onMeasure(i, i2);
        setMeasuredDimension(View.getDefaultSize(getSuggestedMinimumWidth(), i), View.getDefaultSize(getSuggestedMinimumHeight(), i2));
        int iMin = Math.min((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        Intrinsics.checkNotNullExpressionValue(getContext().getResources().getDisplayMetrics(), "");
        float f2 = iMin;
        float fMin = Math.min(varyMatches.onNavigationEvent(30, r3), f2 / 6.0f);
        this.extraCallback = fMin;
        this.asInterface = (f2 / 2.0f) - (fMin / 2.0f);
        this.onWarmupCompleted.setStrokeWidth(fMin);
        onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) CollectionsKt___CollectionsKt.lastOrNull((List) this.IAuthTabCallbackStub);
        float f3 = -90.0f;
        if (onextracallbackwithresult != null) {
            int i8 = writeTypedObject + 69;
            ICustomTabsCallback = i8 % 128;
            int i9 = i8 % 2;
            AbsChart.IAuthTabCallback iAuthTabCallbackOnExtraCallbackWithResult = onextracallbackwithresult.onExtraCallbackWithResult();
            fOnWarmupCompleted = iAuthTabCallbackOnExtraCallbackWithResult != null ? iAuthTabCallbackOnExtraCallbackWithResult.onWarmupCompleted() : -90.0f;
        }
        float f4 = 0.0f;
        if (this.IAuthTabCallbackStub.size() > onWarmupCompleted().size()) {
            int size = this.IAuthTabCallbackStub.size();
            for (int size2 = onWarmupCompleted().size(); size2 < size; size2++) {
                onExtraCallbackWithResult onextracallbackwithresult2 = this.IAuthTabCallbackStub.get(size2);
                Intrinsics.checkNotNullExpressionValue(onextracallbackwithresult2, "");
                onExtraCallbackWithResult onextracallbackwithresult3 = onextracallbackwithresult2;
                onextracallbackwithresult3.asBinder().onExtraCallbackWithResult(onextracallbackwithresult3.asBinder().onWarmupCompleted());
                onextracallbackwithresult3.asBinder().IAuthTabCallback(270.0f);
                onextracallbackwithresult3.onExtraCallbackWithResult().onExtraCallbackWithResult(onextracallbackwithresult3.onExtraCallbackWithResult().onWarmupCompleted());
                onextracallbackwithresult3.onExtraCallbackWithResult().IAuthTabCallback(270.0f);
                onextracallbackwithresult3.onWarmupCompleted().onExtraCallbackWithResult(onextracallbackwithresult3.onWarmupCompleted().onWarmupCompleted());
                onextracallbackwithresult3.onExtraCallback().onExtraCallbackWithResult(onextracallbackwithresult3.onExtraCallback().onWarmupCompleted());
                onextracallbackwithresult3.onExtraCallback().IAuthTabCallback(0.0f);
            }
        }
        int i10 = 0;
        for (Object obj : onWarmupCompleted()) {
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            AFj1sSDK aFj1sSDK = (AFj1sSDK) obj;
            if (onExtraCallback() > f4) {
                int i11 = writeTypedObject + 85;
                ICustomTabsCallback = i11 % 128;
                int i12 = i11 % i4;
                fIAuthTabCallback = aFj1sSDK.IAuthTabCallback() / onExtraCallback();
            } else {
                fIAuthTabCallback = f4;
            }
            float f5 = (fIAuthTabCallback * 360.0f) + f3;
            if (this.IAuthTabCallbackStub.size() > i10) {
                onExtraCallbackWithResult onextracallbackwithresult4 = this.IAuthTabCallbackStub.get(i10);
                Intrinsics.checkNotNullExpressionValue(onextracallbackwithresult4, "");
                onExtraCallbackWithResult onextracallbackwithresult5 = onextracallbackwithresult4;
                AbsChart.IAuthTabCallback iAuthTabCallback7 = new AbsChart.IAuthTabCallback(onextracallbackwithresult5.asBinder().onWarmupCompleted(), onextracallbackwithresult5.asBinder().onWarmupCompleted(), f3);
                AbsChart.IAuthTabCallback iAuthTabCallback8 = new AbsChart.IAuthTabCallback(onextracallbackwithresult5.onExtraCallbackWithResult().onWarmupCompleted(), onextracallbackwithresult5.onExtraCallbackWithResult().onWarmupCompleted(), f5);
                float fOnWarmupCompleted2 = onextracallbackwithresult5.onWarmupCompleted().onWarmupCompleted();
                float fOnWarmupCompleted3 = onextracallbackwithresult5.onWarmupCompleted().onWarmupCompleted();
                Intrinsics.checkNotNullExpressionValue(getContext(), "");
                AbsChart.IAuthTabCallback iAuthTabCallback9 = new AbsChart.IAuthTabCallback(fOnWarmupCompleted2, fOnWarmupCompleted3, aFj1sSDK.IAuthTabCallback(r15));
                AbsChart.IAuthTabCallback iAuthTabCallback10 = new AbsChart.IAuthTabCallback(onextracallbackwithresult5.onExtraCallback().onWarmupCompleted(), onextracallbackwithresult5.onExtraCallback().onWarmupCompleted(), 1.0f);
                AbsChart.IAuthTabCallback iAuthTabCallback11 = new AbsChart.IAuthTabCallback(onextracallbackwithresult5.IAuthTabCallbackStub().onWarmupCompleted(), onextracallbackwithresult5.IAuthTabCallbackStub().onWarmupCompleted(), 1.0f);
                AbsChart.IAuthTabCallback iAuthTabCallback12 = new AbsChart.IAuthTabCallback(onextracallbackwithresult5.onNavigationEvent().onWarmupCompleted(), onextracallbackwithresult5.onNavigationEvent().onWarmupCompleted(), 1.0f);
                Intrinsics.checkNotNull(this.IAuthTabCallbackStub.remove(i10));
                int i13 = ICustomTabsCallback + 15;
                writeTypedObject = i13 % 128;
                i3 = 2;
                int i14 = i13 % 2;
                iAuthTabCallback5 = iAuthTabCallback12;
                iAuthTabCallback2 = iAuthTabCallback7;
                iAuthTabCallback4 = iAuthTabCallback11;
                f = 0.0f;
                iAuthTabCallback6 = iAuthTabCallback8;
                iAuthTabCallback3 = iAuthTabCallback10;
                iAuthTabCallback = iAuthTabCallback9;
            } else {
                i3 = i4;
                AbsChart.IAuthTabCallback iAuthTabCallback13 = new AbsChart.IAuthTabCallback(fOnWarmupCompleted, fOnWarmupCompleted, f3);
                AbsChart.IAuthTabCallback iAuthTabCallback14 = new AbsChart.IAuthTabCallback(fOnWarmupCompleted, fOnWarmupCompleted, f5);
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                float fIAuthTabCallback2 = aFj1sSDK.IAuthTabCallback(context);
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                float fIAuthTabCallback3 = aFj1sSDK.IAuthTabCallback(context2);
                Intrinsics.checkNotNullExpressionValue(getContext(), "");
                iAuthTabCallback = new AbsChart.IAuthTabCallback(fIAuthTabCallback2, fIAuthTabCallback3, aFj1sSDK.IAuthTabCallback(r12));
                f = 0.0f;
                iAuthTabCallback2 = iAuthTabCallback13;
                iAuthTabCallback3 = new AbsChart.IAuthTabCallback(0.0f, 0.0f, 1.0f);
                iAuthTabCallback4 = new AbsChart.IAuthTabCallback(1.0f, 1.0f, 1.0f);
                iAuthTabCallback5 = new AbsChart.IAuthTabCallback(1.0f, 1.0f, 1.0f);
                iAuthTabCallback6 = iAuthTabCallback14;
            }
            this.IAuthTabCallbackStub.add(i10, new onExtraCallbackWithResult(aFj1sSDK, iAuthTabCallback2, iAuthTabCallback6, iAuthTabCallback, iAuthTabCallback3, iAuthTabCallback4, iAuthTabCallback5));
            i10++;
            f3 = f5;
            i4 = i3;
            f4 = f;
        }
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0084 A[PHI: r1 r2 r3
      0x0084: PHI (r1v40 im.toss.uikit.chart.PieChart$onExtraCallbackWithResult) = 
      (r1v39 im.toss.uikit.chart.PieChart$onExtraCallbackWithResult)
      (r1v45 im.toss.uikit.chart.PieChart$onExtraCallbackWithResult)
     binds: [B:11:0x0082, B:8:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x0084: PHI (r2v25 float) = (r2v24 float), (r2v39 float) binds: [B:11:0x0082, B:8:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x0084: PHI (r3v13 float) = (r3v12 float), (r3v31 float) binds: [B:11:0x0082, B:8:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x012b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void draw(@NotNull Canvas canvas) {
        onExtraCallbackWithResult onextracallbackwithresult;
        float fOnWarmupCompleted;
        float fOnWarmupCompleted2;
        float f;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(canvas, "");
        super.draw(canvas);
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float measuredHeight = getMeasuredHeight() / 2.0f;
        float f2 = this.asInterface;
        float f3 = measuredWidth - f2;
        Iterator<T> it = this.IAuthTabCallbackStub.iterator();
        while (it.hasNext()) {
            int i2 = writeTypedObject + 101;
            ICustomTabsCallback = i2 % 128;
            if (i2 % 2 != 0) {
                onextracallbackwithresult = (onExtraCallbackWithResult) it.next();
                fOnWarmupCompleted = onextracallbackwithresult.asBinder().onWarmupCompleted();
                fOnWarmupCompleted2 = onextracallbackwithresult.onExtraCallbackWithResult().onWarmupCompleted() - onextracallbackwithresult.asBinder().onWarmupCompleted();
                if (fOnWarmupCompleted2 > 0.0f) {
                    float f4 = fOnWarmupCompleted;
                    float f5 = fOnWarmupCompleted2;
                    this.onWarmupCompleted.setAlpha((int) (onextracallbackwithresult.onExtraCallback().onWarmupCompleted() * onextracallbackwithresult.onNavigationEvent().onWarmupCompleted() * 255.0f));
                    Bitmap bitmapIAuthTabCallback = IAuthTabCallback(onextracallbackwithresult.IAuthTabCallback());
                    if (bitmapIAuthTabCallback != null) {
                        int iOnWarmupCompleted = (int) onextracallbackwithresult.onWarmupCompleted().onWarmupCompleted();
                        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                        this.onWarmupCompleted.setShader(new ComposeShader(new LinearGradient(0.0f, 0.0f, 1.0f, 1.0f, iOnWarmupCompleted, iOnWarmupCompleted, tileMode), new BitmapShader(bitmapIAuthTabCallback, tileMode, tileMode), PorterDuff.Mode.SRC_OVER));
                        int i3 = ICustomTabsCallback + 37;
                        writeTypedObject = i3 % 128;
                        int i4 = i3 % 2;
                    } else {
                        this.onWarmupCompleted.setShader(null);
                        this.onWarmupCompleted.setColor((int) onextracallbackwithresult.onWarmupCompleted().onWarmupCompleted());
                    }
                    canvas.save();
                    canvas.scale(onextracallbackwithresult.IAuthTabCallbackStub().onWarmupCompleted(), onextracallbackwithresult.IAuthTabCallbackStub().onWarmupCompleted(), measuredWidth, measuredHeight);
                    f = f2;
                    canvas.drawArc(f3, measuredHeight - f2, measuredWidth + f2, f2 + measuredHeight, f4, f5, false, this.onWarmupCompleted);
                    canvas.restore();
                } else {
                    f = f2;
                }
            } else {
                onextracallbackwithresult = (onExtraCallbackWithResult) it.next();
                fOnWarmupCompleted = onextracallbackwithresult.asBinder().onWarmupCompleted();
                fOnWarmupCompleted2 = onextracallbackwithresult.onExtraCallbackWithResult().onWarmupCompleted() - onextracallbackwithresult.asBinder().onWarmupCompleted();
                if (fOnWarmupCompleted2 > 0.0f) {
                }
            }
            f2 = f;
        }
        for (onExtraCallbackWithResult onextracallbackwithresult2 : this.IAuthTabCallbackStub) {
            int i5 = writeTypedObject + 125;
            ICustomTabsCallback = i5 % 128;
            int i6 = i5 % 2;
            float fOnWarmupCompleted3 = onextracallbackwithresult2.asBinder().onWarmupCompleted();
            float fOnWarmupCompleted4 = onextracallbackwithresult2.onExtraCallbackWithResult().onWarmupCompleted();
            float fOnWarmupCompleted5 = onextracallbackwithresult2.asBinder().onWarmupCompleted();
            if (onextracallbackwithresult2.onExtraCallbackWithResult().onWarmupCompleted() - onextracallbackwithresult2.asBinder().onWarmupCompleted() > 0.0f) {
                double d = (fOnWarmupCompleted3 + fOnWarmupCompleted4) - fOnWarmupCompleted5;
                float fCos = (float) Math.cos(Math.toRadians(d));
                float fSin = (float) Math.sin(Math.toRadians(d));
                float f6 = this.asInterface;
                float f7 = this.extraCallback;
                float f8 = f7 / 2.0f;
                float f9 = f6 - f7;
                float f10 = f8 + f6;
                canvas.drawLine((f9 * fCos) + measuredWidth, (f9 * fSin) + measuredHeight, (fCos * f10) + measuredWidth, (f10 * fSin) + measuredHeight, this.onNavigationEvent);
                int i7 = writeTypedObject + 13;
                ICustomTabsCallback = i7 % 128;
                int i8 = i7 % 2;
            }
        }
        this.extraCallbackWithResult.setColor(this.IAuthTabCallbackStubProxy);
        this.extraCallbackWithResult.setAlpha((int) (this.IAuthTabCallback_Parcel.onWarmupCompleted() * 255.0f));
        if (this.extraCallbackWithResult.getAlpha() > 0.0f) {
            int i9 = writeTypedObject + 45;
            ICustomTabsCallback = i9 % 128;
            int i10 = i9 % 2;
            String str = this.access000;
            Intrinsics.checkNotNullExpressionValue(getContext().getResources().getDisplayMetrics(), "");
            canvas.drawText(str, measuredWidth + varyMatches.onNavigationEvent(Double.valueOf(1.5d), r2), measuredHeight + (this.access100 / 2.0f), this.extraCallbackWithResult);
        }
        onTransact();
    }

    private static final boolean onWarmupCompleted(onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 75;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        if (onextracallbackwithresult.onExtraCallback().onWarmupCompleted() != 0.0f) {
            return false;
        }
        int i4 = ICustomTabsCallback;
        int i5 = i4 + 61;
        writeTypedObject = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 109;
        writeTypedObject = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    private final void onTransact() {
        int i = 2 % 2;
        float interpolation = this.IAuthTabCallback.getInterpolation(IAuthTabCallbackDefault());
        float interpolation2 = this.getInterfaceDescriptor.getInterpolation(asBinder());
        Iterator<T> it = this.IAuthTabCallbackStub.iterator();
        int i2 = ICustomTabsCallback + 21;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 2 / 5;
        }
        boolean zOnExtraCallbackWithResult = false;
        while (it.hasNext()) {
            int i4 = ICustomTabsCallback + 119;
            writeTypedObject = i4 % 128;
            int i5 = i4 % 2;
            zOnExtraCallbackWithResult |= ((onExtraCallbackWithResult) it.next()).onExtraCallbackWithResult(interpolation, interpolation2);
        }
        if ((CollectionsKt__MutableCollectionsKt.removeAll((List) this.IAuthTabCallbackStub, new Function1() { // from class: im.toss.uikit.chart.PieChart$$ExternalSyntheticLambda0
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i6 = 2 % 2;
                int i7 = onExtraCallbackWithResult + 55;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                Boolean boolValueOf = Boolean.valueOf(PieChart.onExtraCallback((PieChart.onExtraCallbackWithResult) obj));
                int i9 = onExtraCallback + 91;
                onExtraCallbackWithResult = i9 % 128;
                if (i9 % 2 != 0) {
                    int i10 = 36 / 0;
                }
                return boolValueOf;
            }
        }) | zOnExtraCallbackWithResult) || AbsChart.IAuthTabCallback.onExtraCallbackWithResult(this.IAuthTabCallback_Parcel, interpolation2, false, 2, null)) {
            int i6 = ICustomTabsCallback + 89;
            writeTypedObject = i6 % 128;
            int i7 = i6 % 2;
            invalidate();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NotNull MotionEvent motionEvent) {
        onExtraCallbackWithResult onextracallbackwithresult;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 55;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(motionEvent, "");
            motionEvent.getAction();
            throw null;
        }
        Intrinsics.checkNotNullParameter(motionEvent, "");
        int action = motionEvent.getAction();
        if (action != 0) {
            int i3 = writeTypedObject + 63;
            int i4 = i3 % 128;
            ICustomTabsCallback = i4;
            int i5 = i3 % 2;
            if (action == 1) {
                onExtraCallbackWithResult onextracallbackwithresult2 = this.onExtraCallbackWithResult;
                if (onextracallbackwithresult2 != null) {
                    int i6 = i4 + 115;
                    writeTypedObject = i6 % 128;
                    int i7 = i6 % 2;
                    if (Intrinsics.areEqual(onextracallbackwithresult2, IAuthTabCallback(motionEvent.getX(), motionEvent.getY()))) {
                        playSoundEffect(0);
                        if (Intrinsics.areEqual(this.onTransact, this.onExtraCallbackWithResult)) {
                            int i8 = writeTypedObject + 105;
                            ICustomTabsCallback = i8 % 128;
                            if (i8 % 2 != 0) {
                                int i9 = 70 / 0;
                            }
                            onextracallbackwithresult = null;
                        } else {
                            onextracallbackwithresult = this.onExtraCallbackWithResult;
                        }
                        IAuthTabCallback(onextracallbackwithresult);
                    }
                }
                this.onExtraCallbackWithResult = null;
            } else if (action == 3) {
                this.onExtraCallbackWithResult = null;
            }
        } else {
            this.onExtraCallbackWithResult = IAuthTabCallback(motionEvent.getX(), motionEvent.getY());
        }
        return true;
    }

    public final void onNavigationEvent(@NotNull AFj1sSDK aFj1sSDK) {
        AFj1sSDK aFj1sSDKIAuthTabCallback;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(aFj1sSDK, "");
        onExtraCallbackWithResult onextracallbackwithresult = this.onTransact;
        Object obj = null;
        if (onextracallbackwithresult != null) {
            int i2 = ICustomTabsCallback + 35;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
            aFj1sSDKIAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
        } else {
            aFj1sSDKIAuthTabCallback = null;
        }
        if (Intrinsics.areEqual(aFj1sSDKIAuthTabCallback, aFj1sSDK)) {
            IAuthTabCallback((onExtraCallbackWithResult) null);
            return;
        }
        Iterator<T> it = this.IAuthTabCallbackStub.iterator();
        int i4 = writeTypedObject + 97;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (Intrinsics.areEqual(((onExtraCallbackWithResult) next).IAuthTabCallback(), aFj1sSDK)) {
                obj = next;
                break;
            }
        }
        IAuthTabCallback((onExtraCallbackWithResult) obj);
        int i6 = writeTypedObject + 9;
        ICustomTabsCallback = i6 % 128;
        int i7 = i6 % 2;
    }

    private final void IAuthTabCallback(onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        this.onTransact = onextracallbackwithresult;
        ArrayList<onExtraCallbackWithResult> arrayList = this.IAuthTabCallbackStub;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator<T> it = arrayList.iterator();
        int i2 = ICustomTabsCallback + 67;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        while (true) {
            if (!it.hasNext()) {
                Pair pair = new Pair(arrayList2, arrayList3);
                for (onExtraCallbackWithResult onextracallbackwithresult2 : (Iterable) pair.getFirst()) {
                    int i4 = writeTypedObject + 79;
                    ICustomTabsCallback = i4 % 128;
                    int i5 = i4 % 2;
                    onextracallbackwithresult2.IAuthTabCallbackStub().onExtraCallbackWithResult(onextracallbackwithresult2.IAuthTabCallbackStub().onWarmupCompleted());
                    onextracallbackwithresult2.IAuthTabCallbackStub().IAuthTabCallback(1.0f);
                    onextracallbackwithresult2.onNavigationEvent().onExtraCallbackWithResult(onextracallbackwithresult2.onNavigationEvent().onWarmupCompleted());
                    onextracallbackwithresult2.onNavigationEvent().IAuthTabCallback(1.0f);
                }
                Iterator it2 = ((Iterable) pair.getSecond()).iterator();
                while (it2.hasNext()) {
                    int i6 = writeTypedObject + 87;
                    ICustomTabsCallback = i6 % 128;
                    if (i6 % 2 != 0) {
                        onExtraCallbackWithResult onextracallbackwithresult3 = (onExtraCallbackWithResult) it2.next();
                        onextracallbackwithresult3.IAuthTabCallbackStub().onExtraCallbackWithResult(onextracallbackwithresult3.IAuthTabCallbackStub().onWarmupCompleted());
                        onextracallbackwithresult3.IAuthTabCallbackStub();
                        aFj1sSDK.hashCode();
                        throw null;
                    }
                    onExtraCallbackWithResult onextracallbackwithresult4 = (onExtraCallbackWithResult) it2.next();
                    onextracallbackwithresult4.IAuthTabCallbackStub().onExtraCallbackWithResult(onextracallbackwithresult4.IAuthTabCallbackStub().onWarmupCompleted());
                    onextracallbackwithresult4.IAuthTabCallbackStub().IAuthTabCallback(this.onTransact == null ? 1.0f : 0.95f);
                    onextracallbackwithresult4.onNavigationEvent().onExtraCallbackWithResult(onextracallbackwithresult4.onNavigationEvent().onWarmupCompleted());
                    onextracallbackwithresult4.onNavigationEvent().IAuthTabCallback(this.onTransact == null ? 1.0f : 0.5f);
                    int i7 = ICustomTabsCallback + 13;
                    writeTypedObject = i7 % 128;
                    int i8 = i7 % 2;
                }
                onExtraCallbackWithResult onextracallbackwithresult5 = this.onTransact;
                if (onextracallbackwithresult5 == null) {
                    int i9 = ICustomTabsCallback + 49;
                    writeTypedObject = i9 % 128;
                    if (i9 % 2 == 0) {
                        AbsChart.IAuthTabCallback iAuthTabCallback = this.IAuthTabCallback_Parcel;
                        iAuthTabCallback.onExtraCallbackWithResult(iAuthTabCallback.onWarmupCompleted());
                        this.IAuthTabCallback_Parcel.IAuthTabCallback(1.0f);
                    } else {
                        AbsChart.IAuthTabCallback iAuthTabCallback2 = this.IAuthTabCallback_Parcel;
                        iAuthTabCallback2.onExtraCallbackWithResult(iAuthTabCallback2.onWarmupCompleted());
                        this.IAuthTabCallback_Parcel.IAuthTabCallback(0.0f);
                    }
                } else {
                    Intrinsics.checkNotNull(onextracallbackwithresult5);
                    this.access000 = onextracallbackwithresult5.IAuthTabCallback().onExtraCallback();
                    onExtraCallbackWithResult onextracallbackwithresult6 = this.onTransact;
                    Intrinsics.checkNotNull(onextracallbackwithresult6);
                    AFj1sSDK aFj1sSDKIAuthTabCallback = onextracallbackwithresult6.IAuthTabCallback();
                    Context context = getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    this.IAuthTabCallbackStubProxy = aFj1sSDKIAuthTabCallback.onNavigationEvent(context);
                    Paint paint = this.extraCallbackWithResult;
                    String str = this.access000;
                    paint.getTextBounds(str, 0, str.length(), this.readTypedObject);
                    float fHeight = this.readTypedObject.height();
                    Intrinsics.checkNotNullExpressionValue(getContext().getResources().getDisplayMetrics(), "");
                    this.access100 = fHeight - varyMatches.onNavigationEvent(Double.valueOf(2.5d), r1);
                    AbsChart.IAuthTabCallback iAuthTabCallback3 = this.IAuthTabCallback_Parcel;
                    iAuthTabCallback3.onExtraCallbackWithResult(iAuthTabCallback3.onWarmupCompleted());
                    this.IAuthTabCallback_Parcel.IAuthTabCallback(1.0f);
                }
                AbsChart.onExtraCallback onextracallbackOnNavigationEvent = onNavigationEvent();
                if (onextracallbackOnNavigationEvent != null) {
                    int i10 = writeTypedObject + 91;
                    ICustomTabsCallback = i10 % 128;
                    if (i10 % 2 != 0) {
                        aFj1sSDK.hashCode();
                        throw null;
                    }
                    onExtraCallbackWithResult onextracallbackwithresult7 = this.onTransact;
                    onextracallbackOnNavigationEvent.IAuthTabCallback(onextracallbackwithresult7 != null ? onextracallbackwithresult7.IAuthTabCallback() : null);
                }
                this.IAuthTabCallbackDefault = System.currentTimeMillis();
                invalidate();
                return;
            }
            Object next = it.next();
            if (!Intrinsics.areEqual((onExtraCallbackWithResult) next, this.onTransact)) {
                arrayList3.add(next);
            } else {
                int i11 = writeTypedObject + 107;
                ICustomTabsCallback = i11 % 128;
                if (i11 % 2 != 0) {
                    arrayList2.add(next);
                    aFj1sSDK.hashCode();
                    throw null;
                }
                arrayList2.add(next);
            }
        }
    }

    private final onExtraCallbackWithResult IAuthTabCallback(float f, float f2) {
        float degrees;
        int i = 2 % 2;
        int i2 = writeTypedObject + 83;
        ICustomTabsCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            getPaddingTop();
            throw null;
        }
        if (getPaddingTop() >= f2) {
            return null;
        }
        int i3 = writeTypedObject + 75;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        if (f2 >= getMeasuredHeight() - getPaddingBottom()) {
            return null;
        }
        float measuredWidth = f - (getMeasuredWidth() / 2.0f);
        float measuredHeight = f2 - (getMeasuredHeight() / 2.0f);
        if (measuredWidth == 0.0f) {
            degrees = measuredHeight >= 0.0f ? -90.0f : 90.0f;
        } else if (measuredWidth >= 0.0f) {
            degrees = (float) Math.toDegrees((float) Math.atan(measuredHeight / measuredWidth));
        } else {
            degrees = ((float) Math.toDegrees((float) Math.atan(measuredHeight / measuredWidth))) + 180.0f;
        }
        float fHypot = (float) Math.hypot(measuredWidth, measuredHeight);
        float f3 = this.asInterface;
        float f4 = this.extraCallback / 1.5f;
        if (f3 - f4 >= fHypot || fHypot >= f3 + f4) {
            return null;
        }
        Iterator<T> it = this.IAuthTabCallbackStub.iterator();
        int i5 = writeTypedObject + 123;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((onExtraCallbackWithResult) next).onWarmupCompleted(degrees)) {
                obj = next;
                break;
            }
        }
        return (onExtraCallbackWithResult) obj;
    }

    static final class onExtraCallbackWithResult {
        private static int asInterface = 1;
        private static int onTransact;
        private AbsChart.IAuthTabCallback IAuthTabCallback;
        private AbsChart.IAuthTabCallback IAuthTabCallbackDefault;
        private AbsChart.IAuthTabCallback IAuthTabCallbackStub;
        private AbsChart.IAuthTabCallback onExtraCallback;
        private AFj1sSDK onExtraCallbackWithResult;
        private AbsChart.IAuthTabCallback onNavigationEvent;
        private AbsChart.IAuthTabCallback onWarmupCompleted;

        public onExtraCallbackWithResult(@NotNull AFj1sSDK aFj1sSDK, @NotNull AbsChart.IAuthTabCallback iAuthTabCallback, @NotNull AbsChart.IAuthTabCallback iAuthTabCallback2, @NotNull AbsChart.IAuthTabCallback iAuthTabCallback3, @NotNull AbsChart.IAuthTabCallback iAuthTabCallback4, @NotNull AbsChart.IAuthTabCallback iAuthTabCallback5, @NotNull AbsChart.IAuthTabCallback iAuthTabCallback6) {
            Intrinsics.checkNotNullParameter(aFj1sSDK, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallback2, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallback3, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallback4, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallback5, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallback6, "");
            this.onExtraCallbackWithResult = aFj1sSDK;
            this.IAuthTabCallbackStub = iAuthTabCallback;
            this.onExtraCallback = iAuthTabCallback2;
            this.onWarmupCompleted = iAuthTabCallback3;
            this.IAuthTabCallback = iAuthTabCallback4;
            this.IAuthTabCallbackDefault = iAuthTabCallback5;
            this.onNavigationEvent = iAuthTabCallback6;
        }

        public final AFj1sSDK IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onTransact + 61;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                return this.onExtraCallbackWithResult;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final AbsChart.IAuthTabCallback asBinder() {
            int i = 2 % 2;
            int i2 = asInterface + 41;
            int i3 = i2 % 128;
            onTransact = i3;
            int i4 = i2 % 2;
            AbsChart.IAuthTabCallback iAuthTabCallback = this.IAuthTabCallbackStub;
            int i5 = i3 + 7;
            asInterface = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 50 / 0;
            }
            return iAuthTabCallback;
        }

        public final AbsChart.IAuthTabCallback onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = asInterface + Imgproc.COLOR_YUV2RGB_YVYU;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                return this.onExtraCallback;
            }
            throw null;
        }

        public final AbsChart.IAuthTabCallback onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = asInterface;
            int i3 = i2 + 39;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            AbsChart.IAuthTabCallback iAuthTabCallback = this.onWarmupCompleted;
            int i5 = i2 + 83;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            return iAuthTabCallback;
        }

        public final AbsChart.IAuthTabCallback onExtraCallback() {
            int i = 2 % 2;
            int i2 = onTransact + Imgproc.COLOR_YUV2RGB_YVYU;
            int i3 = i2 % 128;
            asInterface = i3;
            int i4 = i2 % 2;
            AbsChart.IAuthTabCallback iAuthTabCallback = this.IAuthTabCallback;
            int i5 = i3 + 23;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            return iAuthTabCallback;
        }

        public final AbsChart.IAuthTabCallback IAuthTabCallbackStub() {
            int i = 2 % 2;
            int i2 = asInterface;
            int i3 = i2 + 53;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            AbsChart.IAuthTabCallback iAuthTabCallback = this.IAuthTabCallbackDefault;
            int i5 = i2 + 83;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            return iAuthTabCallback;
        }

        public final AbsChart.IAuthTabCallback onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onTransact + 7;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            AbsChart.IAuthTabCallback iAuthTabCallback = this.onNavigationEvent;
            if (i3 == 0) {
                int i4 = 19 / 0;
            }
            return iAuthTabCallback;
        }

        public final boolean onExtraCallbackWithResult(float f, float f2) {
            int i = 2 % 2;
            boolean zOnExtraCallbackWithResult = AbsChart.IAuthTabCallback.onExtraCallbackWithResult(this.IAuthTabCallbackStub, f, false, 2, null);
            boolean zOnExtraCallbackWithResult2 = AbsChart.IAuthTabCallback.onExtraCallbackWithResult(this.onExtraCallback, f, false, 2, null);
            boolean zIAuthTabCallback = this.onWarmupCompleted.IAuthTabCallback(f, true);
            AbsChart.IAuthTabCallback iAuthTabCallback = this.IAuthTabCallback;
            if (iAuthTabCallback.onExtraCallback() != 0.0f) {
                int i2 = onTransact + 93;
                asInterface = i2 % 128;
                int i3 = i2 % 2;
                f = Math.min(1.0f, f * 2.0f);
                int i4 = onTransact + 21;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
            }
            return AbsChart.IAuthTabCallback.onExtraCallbackWithResult(iAuthTabCallback, f, false, 2, null) | zOnExtraCallbackWithResult | zOnExtraCallbackWithResult2 | zIAuthTabCallback | AbsChart.IAuthTabCallback.onExtraCallbackWithResult(this.IAuthTabCallbackDefault, f2, false, 2, null) | AbsChart.IAuthTabCallback.onExtraCallbackWithResult(this.onNavigationEvent, f2, false, 2, null);
        }

        public final boolean onWarmupCompleted(float f) {
            int i = 2 % 2;
            if (this.IAuthTabCallbackStub.onWarmupCompleted() < f && f < this.onExtraCallback.onWarmupCompleted()) {
                int i2 = onTransact + 79;
                asInterface = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            int i4 = onTransact + 111;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
                return false;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
