package im.toss.uikit.widget.helper;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.M_;
import o.O_;
import o.VideoEncoderInfoImplExternalSyntheticLambda0;
import o.getAdService;
import o.getCurrentBacktraceOrBuilderList;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.hasVaryAll;
import o.onVisit;
import o.readIntokhttp;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TdsAdoptionWindow extends View {
    private static int IAuthTabCallbackDefault = 1;
    private static int onTransact;
    private final Paint IAuthTabCallback;
    private O_.onNavigationEvent IAuthTabCallbackStub;
    private final Rect asInterface;
    private final Paint onExtraCallback;
    private final Paint onExtraCallbackWithResult;
    private final Paint onNavigationEvent;
    private float onWarmupCompleted;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsAdoptionWindow(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsAdoptionWindow(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TdsAdoptionWindow(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Configuration configuration = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        paint.setColor(new getUrlokhttp(new IAuthTabCallback(configuration)).requestPostMessageChannel().IEngagementSignalsCallback());
        Intrinsics.checkNotNullExpressionValue(getResources().getDisplayMetrics(), "");
        paint.setStrokeWidth(varyMatches.onNavigationEvent(Float.valueOf(1.0f), r6));
        this.onExtraCallback = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.FILL);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        Configuration configuration2 = context3.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        paint2.setColor(VideoEncoderInfoImplExternalSyntheticLambda0.IAuthTabCallback(new getUrlokhttp(new onExtraCallback(configuration2)).requestPostMessageChannel().IEngagementSignalsCallback(), 32));
        this.onNavigationEvent = paint2;
        Paint paint3 = new Paint(1);
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        Configuration configuration3 = context4.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration3, "");
        paint3.setColor(new getUrlokhttp(new onExtraCallbackWithResult(configuration3)).onUnminimized());
        Float fValueOf = Float.valueOf(14.0f);
        Intrinsics.checkNotNullExpressionValue(getResources().getDisplayMetrics(), "");
        paint3.setTextSize(varyMatches.onNavigationEvent(fValueOf, r1));
        paint3.setTextAlign(Paint.Align.RIGHT);
        Typeface typeface = Typeface.DEFAULT_BOLD;
        paint3.setTypeface(typeface);
        this.onExtraCallbackWithResult = paint3;
        Paint paint4 = new Paint(1);
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "");
        Configuration configuration4 = context5.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration4, "");
        paint4.setColor(new getUrlokhttp(new onWarmupCompleted(configuration4)).requestPostMessageChannel().IEngagementSignalsCallback());
        Intrinsics.checkNotNullExpressionValue(getResources().getDisplayMetrics(), "");
        paint4.setTextSize(varyMatches.onNavigationEvent(fValueOf, r6));
        paint4.setTextAlign(Paint.Align.CENTER);
        paint4.setTypeface(typeface);
        this.IAuthTabCallback = paint4;
        this.asInterface = new Rect();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TdsAdoptionWindow(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = onTransact + 79;
            int i4 = i3 % 128;
            IAuthTabCallbackDefault = i4;
            if (i3 % 2 == 0) {
                throw null;
            }
            int i5 = i4 + 109;
            onTransact = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i7 = IAuthTabCallbackDefault + 105;
            onTransact = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public final void onExtraCallbackWithResult(@Nullable O_.onNavigationEvent onnavigationevent) {
        float fOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onTransact + 7;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        if (i2 % 2 != 0) {
            this.IAuthTabCallbackStub = onnavigationevent;
            float fOnNavigationEvent = 0.0f;
            if (onnavigationevent != null) {
                try {
                    fOnWarmupCompleted = onnavigationevent.onWarmupCompleted();
                } catch (Exception unused) {
                }
            } else {
                int i4 = i3 + 7;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
                fOnWarmupCompleted = 0.0f;
            }
            fOnNavigationEvent = getCurrentBacktraceOrBuilderList.onNavigationEvent(fOnWarmupCompleted * 1000.0f) / 10.0f;
            this.onWarmupCompleted = fOnNavigationEvent;
            invalidate();
            return;
        }
        this.IAuthTabCallbackStub = onnavigationevent;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onTransact + 43;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(null);
        int i4 = IAuthTabCallbackDefault + 79;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class IAuthTabCallback implements getAdService {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Configuration onExtraCallback;

        public IAuthTabCallback(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 17;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                if (!(!readIntokhttp.onExtraCallback(this.onExtraCallback))) {
                    return getSpecialFeatureOptInStatus.Dark;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i3 = onNavigationEvent + 69;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 67 / 0;
                }
                return getspecialfeatureoptinstatus;
            }
            readIntokhttp.onExtraCallback(this.onExtraCallback);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class onExtraCallback implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ Configuration onNavigationEvent;

        public onExtraCallback(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + Imgproc.COLOR_YUV2RGBA_YVYU;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                if (!readIntokhttp.onExtraCallback(this.onNavigationEvent)) {
                    return getSpecialFeatureOptInStatus.Light;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                int i3 = onExtraCallbackWithResult + 85;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                return getspecialfeatureoptinstatus;
            }
            readIntokhttp.onExtraCallback(this.onNavigationEvent);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class onExtraCallbackWithResult implements getAdService {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onExtraCallbackWithResult(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
        
            return o.getSpecialFeatureOptInStatus.Dark;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r4.onExtraCallbackWithResult) != false) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r4.onExtraCallbackWithResult) != true) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
        
            r1 = o.getSpecialFeatureOptInStatus.Light;
            r2 = im.toss.uikit.widget.helper.TdsAdoptionWindow.onExtraCallbackWithResult.onExtraCallback + 61;
            im.toss.uikit.widget.helper.TdsAdoptionWindow.onExtraCallbackWithResult.onNavigationEvent = r2 % 128;
            r2 = r2 % 2;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 53;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 10 / 0;
            }
        }
    }

    public static final class onWarmupCompleted implements getAdService {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Configuration onExtraCallback;

        public onWarmupCompleted(Configuration configuration) {
            this.onExtraCallback = configuration;
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
        
            if (o.readIntokhttp.onExtraCallback(r4.onExtraCallback) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r4.onExtraCallback) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
        
            r1 = o.getSpecialFeatureOptInStatus.Dark;
            r2 = im.toss.uikit.widget.helper.TdsAdoptionWindow.onWarmupCompleted.onExtraCallbackWithResult + 3;
            im.toss.uikit.widget.helper.TdsAdoptionWindow.onWarmupCompleted.onWarmupCompleted = r2 % 128;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 23;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 85 / 0;
            }
        }
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 63;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        O_.onNavigationEvent onnavigationevent = this.IAuthTabCallbackStub;
        if (onnavigationevent != null) {
            String str = "TDS adoption rate: " + this.onWarmupCompleted + "%";
            this.onExtraCallbackWithResult.getTextBounds(str, 0, str.length(), this.asInterface);
            float measuredWidth = getMeasuredWidth();
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            float fOnNavigationEvent = varyMatches.onNavigationEvent(Float.valueOf(10.0f), displayMetrics);
            float fAccess000 = (M_.onExtraCallback.access000() + this.asInterface.height()) / 2;
            Intrinsics.checkNotNullExpressionValue(getResources().getDisplayMetrics(), "");
            canvas.drawText(str, measuredWidth - fOnNavigationEvent, fAccess000 - varyMatches.onNavigationEvent(Float.valueOf(2.0f), r8), this.onExtraCallbackWithResult);
            int i4 = 0;
            for (Object obj : onnavigationevent.onNavigationEvent()) {
                if (i4 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                Rect rect = (Rect) obj;
                Object obj2 = onnavigationevent.IAuthTabCallback().get(i4);
                Intrinsics.checkNotNullExpressionValue(obj2, "");
                View view = (View) obj2;
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                Activity activityIAuthTabCallback = hasVaryAll.IAuthTabCallback(context);
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                if (Intrinsics.areEqual(activityIAuthTabCallback, hasVaryAll.IAuthTabCallback(context2))) {
                    rect.offset(0, -M_.onExtraCallback.access000());
                    canvas.drawRect(rect, this.onExtraCallback);
                    canvas.drawRect(rect, this.onNavigationEvent);
                    String strIAuthTabCallback = onVisit.IAuthTabCallback(view);
                    this.IAuthTabCallback.getTextBounds(strIAuthTabCallback, 0, strIAuthTabCallback.length(), this.asInterface);
                    canvas.drawText(strIAuthTabCallback, rect.left + (rect.width() / 2.0f), rect.top + ((rect.height() + this.asInterface.height()) / 2.0f), this.IAuthTabCallback);
                    int i5 = IAuthTabCallbackDefault + 47;
                    onTransact = i5 % 128;
                    int i6 = i5 % 2;
                }
                i4++;
            }
        }
    }
}
