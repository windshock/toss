package im.toss.uikit.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import im.toss.uikit.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.getAdService;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.matches;
import o.readIntokhttp;
import o.setHeadersokhttp;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TdsProgressBarV0View extends View {
    private static int onExtraCallback = 0;
    private static int onTransact = 1;
    private int IAuthTabCallback;
    private int onExtraCallbackWithResult;
    private int onNavigationEvent;
    private int onWarmupCompleted;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsProgressBarV0View(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsProgressBarV0View(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TdsProgressBarV0View(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Configuration configuration = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        this.onExtraCallbackWithResult = new getUrlokhttp(new onNavigationEvent(configuration)).onMessageChannelReady();
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        Configuration configuration2 = context3.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        this.onNavigationEvent = ((Integer) setHeadersokhttp.onExtraCallbackWithResult(-552023978, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{new getUrlokhttp(new IAuthTabCallback(configuration2)).requestPostMessageChannel()}, matches.onExtraCallback(), 552023983, matches.onExtraCallback())).intValue();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.TdsProgressBarV0, 0, 0);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            int i2 = R.styleable.TdsProgressBarV0_baseProgressColor;
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            Configuration configuration3 = context4.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration3, "");
            this.onExtraCallbackWithResult = typedArrayObtainStyledAttributes.getColor(i2, new getUrlokhttp(new onExtraCallback(configuration3)).onMessageChannelReady());
            int i3 = R.styleable.TdsProgressBarV0_activeProgressColor;
            Context context5 = getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "");
            Configuration configuration4 = context5.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration4, "");
            this.onNavigationEvent = typedArrayObtainStyledAttributes.getColor(i3, ((Integer) setHeadersokhttp.onExtraCallbackWithResult(-552023978, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{new getUrlokhttp(new onExtraCallbackWithResult(configuration4)).requestPostMessageChannel()}, matches.onExtraCallback(), 552023983, matches.onExtraCallback())).intValue());
            typedArrayObtainStyledAttributes.recycle();
            int i4 = onExtraCallback + 83;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.onWarmupCompleted = 100;
        int i7 = onExtraCallback + 101;
        onTransact = i7 % 128;
        int i8 = i7 % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TdsProgressBarV0View(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = onExtraCallback + 77;
            onTransact = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i4 = onTransact + Imgproc.COLOR_YUV2RGB_YVYU;
            onExtraCallback = i4 % 128;
            i = i4 % 2 != 0 ? 1 : 0;
            int i5 = 2 % 2;
        }
        this(context, attributeSet, i);
    }

    private final Paint IAuthTabCallback() {
        int i = 2 % 2;
        Paint paint = new Paint();
        paint.setColor(this.onExtraCallbackWithResult);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(getMeasuredHeight());
        int i2 = onExtraCallback + 57;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return paint;
    }

    private final Paint onExtraCallback() {
        int i = 2 % 2;
        Paint paint = new Paint();
        paint.setColor(this.onNavigationEvent);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(getMeasuredHeight());
        int i2 = onExtraCallback + 11;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return paint;
    }

    public final void setActiveProgressColor(int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 55;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        this.onNavigationEvent = i;
        invalidate();
        int i5 = onTransact + 91;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final void setMax(int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 91;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            this.onWarmupCompleted = i;
            invalidate();
            int i4 = 23 / 0;
        } else {
            this.onWarmupCompleted = i;
            invalidate();
        }
    }

    public final void setProgress(int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 77;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        this.IAuthTabCallback = i;
        invalidate();
        int i5 = onTransact + 113;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class IAuthTabCallback implements getAdService {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Configuration onExtraCallback;

        public IAuthTabCallback(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 115;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            int i4 = onWarmupCompleted + 51;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 35 / 0;
            }
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class onExtraCallback implements getAdService {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Configuration onExtraCallback;

        public onExtraCallback(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i2 = onNavigationEvent + 31;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            int i4 = onExtraCallbackWithResult + 111;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 70 / 0;
            }
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class onExtraCallbackWithResult implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onExtraCallbackWithResult(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 15;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                if (readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                    return getSpecialFeatureOptInStatus.Dark;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i3 = IAuthTabCallback + 67;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                return getspecialfeatureoptinstatus;
            }
            readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult);
            throw null;
        }
    }

    public static final class onNavigationEvent implements getAdService {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Configuration onNavigationEvent;

        public onNavigationEvent(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 77;
            onExtraCallbackWithResult = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                if (!readIntokhttp.onExtraCallback(this.onNavigationEvent)) {
                    return getSpecialFeatureOptInStatus.Light;
                }
                int i3 = onWarmupCompleted + 101;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                    throw null;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Dark;
                int i4 = onExtraCallbackWithResult + 57;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return getspecialfeatureoptinstatus2;
            }
            readIntokhttp.onExtraCallback(this.onNavigationEvent);
            obj.hashCode();
            throw null;
        }
    }

    private final float onNavigationEvent() {
        float f;
        float f2;
        int i = 2 % 2;
        int i2 = onTransact + 5;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        float f3 = this.IAuthTabCallback;
        if (i3 != 0) {
            f = f3 % this.onWarmupCompleted;
            f2 = 0.0f;
        } else {
            f = f3 / this.onWarmupCompleted;
            f2 = 1.0f;
        }
        return Math.min(f2, f);
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 75;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        float measuredHeight = getMeasuredHeight() / 2.0f;
        float measuredHeight2 = getMeasuredHeight() / 2.0f;
        Paint paintOnExtraCallback = onExtraCallback();
        float fMax = Math.max(measuredHeight, (getMeasuredWidth() * onNavigationEvent()) - measuredHeight);
        canvas.drawLine(measuredHeight, measuredHeight2, getMeasuredWidth() - measuredHeight, measuredHeight2, IAuthTabCallback());
        canvas.drawLine(measuredHeight, measuredHeight2, fMax, measuredHeight2, paintOnExtraCallback);
        int i4 = onExtraCallback + 41;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }
}
