package im.toss.uikit.widget.helper;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.M_;
import o.getAdService;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.r8lambdaLwnqQT6KESvpJzaipNghlKf5eMg;
import o.readIntokhttp;
import o.setVisitUrl;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class WeedScannerWindow extends View {
    private static int IAuthTabCallbackStub = 0;
    private static int access000 = 1;
    private final int IAuthTabCallback;
    private final Paint IAuthTabCallbackDefault;
    private final int asBinder;
    private final RectF asInterface;
    private final Paint onExtraCallback;
    private final int onExtraCallbackWithResult;
    private final float onNavigationEvent;
    private r8lambdaLwnqQT6KESvpJzaipNghlKf5eMg.onWarmupCompleted onTransact;
    private final int onWarmupCompleted;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WeedScannerWindow(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WeedScannerWindow(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WeedScannerWindow(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.asBinder = ((Integer) M_.onNavigationEvent(-2118175014, new Object[]{M_.onExtraCallback, context}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 2118175019, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent())).intValue();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        this.IAuthTabCallback = varyMatches.onNavigationEvent(Float.valueOf(8.0f), displayMetrics);
        DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        this.onExtraCallbackWithResult = varyMatches.onNavigationEvent(Float.valueOf(6.0f), displayMetrics2);
        Float fValueOf = Float.valueOf(4.0f);
        DisplayMetrics displayMetrics3 = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
        this.onWarmupCompleted = varyMatches.onNavigationEvent(fValueOf, displayMetrics3);
        Intrinsics.checkNotNullExpressionValue(context.getResources().getDisplayMetrics(), "");
        this.onNavigationEvent = varyMatches.onNavigationEvent(fValueOf, r11);
        this.asInterface = new RectF();
        Paint paint = new Paint(1);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Configuration configuration = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        paint.setColor(((Integer) getUrlokhttp.onNavigationEvent(new Object[]{new getUrlokhttp(new onNavigationEvent(configuration))}, -627730825, 627730831, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult())).intValue());
        Intrinsics.checkNotNullExpressionValue(getResources().getDisplayMetrics(), "");
        paint.setTextSize(varyMatches.onNavigationEvent(Float.valueOf(14.0f), r13));
        paint.setTypeface(Typeface.DEFAULT_BOLD);
        this.IAuthTabCallbackDefault = paint;
        Paint paint2 = new Paint(1);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        Configuration configuration2 = context3.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        paint2.setColor(new getUrlokhttp(new IAuthTabCallback(configuration2)).extraCallbackWithResult());
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAlpha(242);
        this.onExtraCallback = paint2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ WeedScannerWindow(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = access000 + 107;
            IAuthTabCallbackStub = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i5 = IAuthTabCallbackStub + 43;
            access000 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public final void IAuthTabCallback(@Nullable r8lambdaLwnqQT6KESvpJzaipNghlKf5eMg.onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = access000 + 57;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            this.onTransact = onwarmupcompleted;
            invalidate();
            int i3 = 62 / 0;
        } else {
            this.onTransact = onwarmupcompleted;
            invalidate();
        }
    }

    public final void onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 35;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(null);
        int i4 = IAuthTabCallbackStub + 63;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class IAuthTabCallback implements getAdService {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Configuration IAuthTabCallback;

        public IAuthTabCallback(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 55;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                if (readIntokhttp.onExtraCallback(this.IAuthTabCallback)) {
                    getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                    int i3 = onExtraCallback + 91;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    return getspecialfeatureoptinstatus;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Light;
                int i5 = onExtraCallback + 13;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 92 / 0;
                }
                return getspecialfeatureoptinstatus2;
            }
            readIntokhttp.onExtraCallback(this.IAuthTabCallback);
            throw null;
        }
    }

    public static final class onNavigationEvent implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onNavigationEvent(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i2 = onExtraCallback + 23;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return getspecialfeatureoptinstatus;
            }
            int i4 = onExtraCallback + 1;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Dark;
            int i6 = IAuthTabCallback + 23;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return getspecialfeatureoptinstatus2;
        }
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = access000 + Imgproc.COLOR_YUV2RGB_YVYU;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        r8lambdaLwnqQT6KESvpJzaipNghlKf5eMg.onWarmupCompleted onwarmupcompleted = this.onTransact;
        if (onwarmupcompleted != null) {
            int i6 = 0;
            int i7 = 0;
            for (Object obj : onwarmupcompleted.onWarmupCompleted()) {
                if (i7 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                Point point = (Point) obj;
                point.offset(i6, (-M_.onExtraCallback.access000()) + this.onExtraCallbackWithResult);
                Object obj2 = onwarmupcompleted.IAuthTabCallback().get(i7);
                Intrinsics.checkNotNullExpressionValue(obj2, "");
                String str = (String) obj2;
                float fMeasureText = this.IAuthTabCallbackDefault.measureText(str);
                float textSize = this.IAuthTabCallbackDefault.getTextSize();
                float f = point.x;
                float f2 = this.onWarmupCompleted;
                float f3 = f - f2;
                float f4 = point.y - f2;
                this.asInterface.set(f3, f4, f2 + f3 + fMeasureText + f2, f2 + f4 + textSize + f2);
                RectF rectF = this.asInterface;
                float f5 = rectF.right;
                float f6 = this.IAuthTabCallback;
                float f7 = f6 + f5;
                float f8 = this.asBinder;
                if (f7 > f8) {
                    int i8 = access000 + 123;
                    IAuthTabCallbackStub = i8 % 128;
                    if (i8 % 2 != 0) {
                        float f9 = (f5 - f6) % f8;
                        rectF.offset(-f9, 2.0f);
                        i2 = -((int) f9);
                        i = 0;
                    } else {
                        i = 0;
                        float f10 = f7 - f8;
                        rectF.offset(-f10, 0.0f);
                        i2 = -((int) f10);
                    }
                    point.offset(i2, i);
                } else {
                    i = i6;
                }
                RectF rectF2 = this.asInterface;
                float f11 = this.onNavigationEvent;
                canvas.drawRoundRect(rectF2, f11, f11, this.onExtraCallback);
                canvas.drawText(str, point.x, (point.y + this.IAuthTabCallbackDefault.getTextSize()) - (this.onWarmupCompleted / 2), this.IAuthTabCallbackDefault);
                i7++;
                i6 = i;
            }
        }
    }
}
