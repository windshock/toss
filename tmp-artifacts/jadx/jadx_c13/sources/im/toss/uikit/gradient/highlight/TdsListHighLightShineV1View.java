package im.toss.uikit.gradient.highlight;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import im.toss.features.tosscert.ui.R;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.uikit.gradient.highlight.TdsListHighLightShineV1View$;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.Address;
import o.BrickModule;
import o.generateLink;
import o.getAdService;
import o.getExtraParameters;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.isFireOS;
import o.isMuted;
import o.nSetPosition;
import o.readIntokhttp;
import o.sMaxAgeSeconds;
import o.setVisitUrl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;
import viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TdsListHighLightShineV1View extends View implements BrickModule {
    private static int IAuthTabCallbackStubProxy = 1;
    private static int asBinder;
    private final Paint IAuthTabCallback;
    private final Paint IAuthTabCallbackDefault;
    private final int[] IAuthTabCallbackStub;
    private final float[] asInterface;
    private Rally onExtraCallback;
    private final RectF onExtraCallbackWithResult;
    private final Lazy onNavigationEvent;
    private final RectF onTransact;
    private final Lazy onWarmupCompleted;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsListHighLightShineV1View(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsListHighLightShineV1View(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ int[] onExtraCallback(Context context) {
        int i = 2 % 2;
        int i2 = asBinder + 17;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int[] iArrOnExtraCallbackWithResult = onExtraCallbackWithResult(context);
        int i4 = asBinder + Imgproc.COLOR_YUV2RGB_YVYU;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return iArrOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ float[] onNavigationEvent(Context context) {
        int i = 2 % 2;
        int i2 = asBinder + 37;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        float[] fArrIAuthTabCallback = IAuthTabCallback(context);
        int i4 = asBinder + 27;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return fArrIAuthTabCallback;
        }
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TdsListHighLightShineV1View(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.IAuthTabCallback = new Paint();
        this.onNavigationEvent = LazyKt__LazyJVMKt.lazy(new TdsListHighLightShineV1View$.ExternalSyntheticLambda0(context));
        this.onWarmupCompleted = LazyKt__LazyJVMKt.lazy(new TdsListHighLightShineV1View$.ExternalSyntheticLambda1(context));
        this.onExtraCallbackWithResult = new RectF();
        this.IAuthTabCallbackDefault = new Paint();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Configuration configuration = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        Object[] objArr = {new getUrlokhttp(new IAuthTabCallback(configuration))};
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        int iIntValue = ((Integer) getUrlokhttp.onNavigationEvent(objArr, -1763178192, 1763178195, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult())).intValue();
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        Configuration configuration2 = context3.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        Object[] objArr2 = {new getUrlokhttp(new onNavigationEvent(configuration2))};
        int iOnExtraCallbackWithResult2 = setVisitUrl.onExtraCallbackWithResult();
        this.IAuthTabCallbackStub = new int[]{iIntValue, 0, 0, ((Integer) getUrlokhttp.onNavigationEvent(objArr2, -1763178192, 1763178195, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, setVisitUrl.onExtraCallbackWithResult())).intValue()};
        this.asInterface = new float[]{0.0f, 0.4f, 0.6f, 1.0f};
        this.onTransact = new RectF();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TdsListHighLightShineV1View(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = IAuthTabCallbackStubProxy + 19;
            asBinder = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i5 = asBinder + 71;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public static final /* synthetic */ void IAuthTabCallback(TdsListHighLightShineV1View tdsListHighLightShineV1View, Rally rally) {
        int i = 2 % 2;
        int i2 = asBinder + 3;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        tdsListHighLightShineV1View.onExtraCallback = rally;
        if (i3 == 0) {
            int i4 = 8 / 0;
        }
    }

    public static final /* synthetic */ Rally onNavigationEvent(TdsListHighLightShineV1View tdsListHighLightShineV1View, int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 21;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        Rally rallyIAuthTabCallback = tdsListHighLightShineV1View.IAuthTabCallback(i);
        int i5 = asBinder + 125;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return rallyIAuthTabCallback;
    }

    private final int[] onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asBinder + 53;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int[] iArr = (int[]) this.onNavigationEvent.getValue();
        int i4 = IAuthTabCallbackStubProxy + 39;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 90 / 0;
        }
        return iArr;
    }

    public static final class onExtraCallback implements View.OnLayoutChangeListener {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ int onWarmupCompleted;

        public onExtraCallback(int i) {
            this.onWarmupCompleted = i;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            TdsListHighLightShineV1View tdsListHighLightShineV1View;
            isFireOS isfireosOnExtraCallbackWithResult;
            int i9 = 2 % 2;
            int i10 = onExtraCallback + 51;
            IAuthTabCallback = i10 % 128;
            if (i10 % 2 == 0) {
                view.removeOnLayoutChangeListener(this);
                tdsListHighLightShineV1View = TdsListHighLightShineV1View.this;
                isfireosOnExtraCallbackWithResult = isFireOS.onExtraCallbackWithResult(TdsListHighLightShineV1View.onNavigationEvent(tdsListHighLightShineV1View, this.onWarmupCompleted), true, 1, (Object) null);
            } else {
                view.removeOnLayoutChangeListener(this);
                tdsListHighLightShineV1View = TdsListHighLightShineV1View.this;
                isfireosOnExtraCallbackWithResult = isFireOS.onExtraCallbackWithResult(TdsListHighLightShineV1View.onNavigationEvent(tdsListHighLightShineV1View, this.onWarmupCompleted), false, 1, (Object) null);
            }
            TdsListHighLightShineV1View.IAuthTabCallback(tdsListHighLightShineV1View, (Rally) isfireosOnExtraCallbackWithResult);
            int i11 = onExtraCallback + 125;
            IAuthTabCallback = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
        }
    }

    private static final int[] onExtraCallbackWithResult(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 93;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            if (((Boolean) generateLink.onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -194147640, new Object[]{context}, 194147643, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).booleanValue()) {
                int i3 = asBinder + 105;
                IAuthTabCallbackStubProxy = i3 % 128;
                int i4 = i3 % 2;
                return new int[]{Color.parseColor("#0017171C"), Color.parseColor("#0AFFFFFF"), Color.parseColor("#0017171C")};
            }
            return new int[]{Color.parseColor("#00FFFFFF"), Color.parseColor("#CCFFFFFF"), Color.parseColor("#00FFFFFF")};
        }
        ((Boolean) generateLink.onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -194147640, new Object[]{context}, 194147643, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).booleanValue();
        throw null;
    }

    private final float[] onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 5;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.onWarmupCompleted.getValue();
        if (i3 == 0) {
            return (float[]) value;
        }
        throw null;
    }

    private static final float[] IAuthTabCallback(Context context) {
        int i = 2 % 2;
        if (!(!((Boolean) generateLink.onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -194147640, new Object[]{context}, 194147643, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).booleanValue())) {
            int i2 = asBinder + 97;
            IAuthTabCallbackStubProxy = i2 % 128;
            return i2 % 2 == 0 ? new float[]{0.5f, 0.4f, 0.0f, 0.0f, 0.6f} : new float[]{0.4f, 0.5f, 0.6f};
        }
        float[] fArr = {0.3f, 0.5f, 0.7f};
        int i3 = asBinder + 41;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            return fArr;
        }
        throw null;
    }

    public static final class IAuthTabCallback implements getAdService {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Configuration IAuthTabCallback;

        public IAuthTabCallback(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (readIntokhttp.onExtraCallback(this.IAuthTabCallback)) {
                int i2 = onExtraCallback + 113;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return getSpecialFeatureOptInStatus.Dark;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
            int i4 = onWarmupCompleted + 47;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class onNavigationEvent implements getAdService {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ Configuration onNavigationEvent;

        public onNavigationEvent(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 87;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                if (!readIntokhttp.onExtraCallback(this.onNavigationEvent)) {
                    return getSpecialFeatureOptInStatus.Light;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                int i3 = onExtraCallback + 49;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                return getspecialfeatureoptinstatus;
            }
            readIntokhttp.onExtraCallback(this.onNavigationEvent);
            throw null;
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        super.onSizeChanged(i, i2, i3, i4);
        float f = i;
        float f2 = i2;
        sMaxAgeSeconds.onWarmupCompleted(this.IAuthTabCallback, f, f, 140.0d, onNavigationEvent(), onWarmupCompleted(), 0.0f, 0.0f, 96, (Object) null);
        sMaxAgeSeconds.onWarmupCompleted(this.IAuthTabCallbackDefault, f, f2, 0.0d, this.IAuthTabCallbackStub, this.asInterface, 0.0f, 0.0f, 96, (Object) null).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.onExtraCallbackWithResult.set(0.0f, 0.0f, f, f);
        this.onTransact.set(0.0f, 0.0f, f, f2);
        setTranslationX(-f);
        int i6 = asBinder + 43;
        IAuthTabCallbackStubProxy = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // android.view.View
    public void draw(@NotNull Canvas canvas) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(canvas, "");
        super.draw(canvas);
        if (getMeasuredWidth() > 0 && getMeasuredHeight() > 0) {
            int i2 = asBinder + 115;
            IAuthTabCallbackStubProxy = i2 % 128;
            if (i2 % 2 == 0) {
                getMeasuredWidth();
                getMeasuredHeight();
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                ((Boolean) generateLink.onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -194147640, new Object[]{context}, 194147643, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).booleanValue();
                throw null;
            }
            float measuredWidth = getMeasuredWidth();
            float measuredHeight = getMeasuredHeight();
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            if (((Boolean) generateLink.onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -194147640, new Object[]{context2}, 194147643, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).booleanValue()) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
                Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                int iSave = canvas2.save();
                try {
                    canvas2.translate((measuredWidth - measuredWidth) / 2.0f, -((measuredWidth - measuredHeight) / 2.0f));
                    canvas2.drawRect(this.onExtraCallbackWithResult, this.IAuthTabCallback);
                    canvas2.restoreToCount(iSave);
                    canvas2.drawRect(this.onTransact, this.IAuthTabCallbackDefault);
                    canvas.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, (Paint) null);
                    return;
                } catch (Throwable th) {
                    canvas2.restoreToCount(iSave);
                    throw th;
                }
            }
            canvas.translate((measuredWidth - measuredWidth) / 2.0f, -((measuredWidth - measuredHeight) / 2.0f));
            canvas.drawRect(this.onExtraCallbackWithResult, this.IAuthTabCallback);
        }
        int i3 = asBinder + 39;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
    }

    private final Rally IAuthTabCallback(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 49;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        Rally rally = (Rally) RallysKt.onWarmupCompleted(new Object[]{this, isMuted.onExtraCallbackWithResult(RallysKt.onExtraCallback((Interpolator) Address.onNavigationEvent(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -1041671130, new Object[]{Address.onNavigationEvent, Float.valueOf(0.7f), Float.valueOf(0.0f), Float.valueOf(0.7f), Float.valueOf(1.0f)}, nSetPosition.onExtraCallbackWithResult(), 1041671131), 2200), Integer.valueOf(-getMeasuredWidth()), Integer.valueOf(getMeasuredWidth()), (Function1) null, 4, (Object) null), Integer.valueOf(i), getExtraParameters.Normal, 100, null, null, Boolean.FALSE, 0, 0L, false, 1888, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        int i5 = asBinder + 113;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return rally;
    }

    public void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 65;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        Rally rally = this.onExtraCallback;
        if (rally != null) {
            int i5 = i3 + 119;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            rally.updateVisuals();
        }
        this.onExtraCallback = null;
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 3;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super.onDetachedFromWindow();
        IAuthTabCallback();
        int i4 = asBinder + 91;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 86 / 0;
        }
    }

    @Override // o.BrickModule
    public void onExtraCallback(@NotNull View view, int i, int i2) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        IAuthTabCallback();
        requestLayout();
        if (isLaidOut()) {
            int i4 = asBinder + 105;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            if (!isLayoutRequested()) {
                int i6 = IAuthTabCallbackStubProxy + 107;
                asBinder = i6 % 128;
                IAuthTabCallback(this, (Rally) (i6 % 2 != 0 ? isFireOS.onExtraCallbackWithResult(onNavigationEvent(this, i), true, 0, (Object) null) : isFireOS.onExtraCallbackWithResult(onNavigationEvent(this, i), false, 1, (Object) null)));
                return;
            }
        }
        addOnLayoutChangeListener(new onExtraCallback(i));
    }
}
