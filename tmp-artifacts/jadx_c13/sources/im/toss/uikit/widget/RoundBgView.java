package im.toss.uikit.widget;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.MaskFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.iap.android.mppclient.container.constant.JsParamKeys;
import im.toss.features.teens.henembox.transaction.HenemSavingBoxTransationDetailActivity$;
import im.toss.features.tosscert.ui.R;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.tosssecurities.singlepage.earning_call.EarningCallComposeView$;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AppLovinSdkSettings;
import o.Cacheurls1;
import o.VideoEncoderInfoImplExternalSyntheticLambda0;
import o.deprecated_noStore;
import o.isFireOS;
import o.isMuted;
import o.setBodyokhttp;
import o.setUrlokhttp;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class RoundBgView extends FrameLayout {
    private static int extraCommand = 0;
    private static int newSession = 1;
    private final Paint IAuthTabCallback;
    private final RectF IAuthTabCallbackDefault;
    private final Path IAuthTabCallbackStub;
    private final Path IAuthTabCallbackStubProxy;
    private float IAuthTabCallback_Parcel;
    private boolean ICustomTabsCallback;
    private int ICustomTabsCallbackDefault;
    private int ICustomTabsCallbackStub;
    private final Paint ICustomTabsCallbackStubProxy;
    private float ICustomTabsCallback_Parcel;
    private final Paint ICustomTabsService;
    private float access000;
    private final Path access100;
    private final RectF asBinder;
    private final Path asInterface;
    private float extraCallback;
    private float extraCallbackWithResult;
    private final Path getInterfaceDescriptor;
    private float isEngagementSignalsApiAvailable;
    private final Paint mayLaunchUrl;
    private Cacheurls1 onActivityLayout;
    private int onActivityResized;
    private float onExtraCallback;
    private int onExtraCallbackWithResult;
    private Cacheurls1 onMessageChannelReady;
    private Rally onMinimized;
    private float onNavigationEvent;
    private final Paint onPostMessage;
    private Rally onRelationshipValidationResult;
    private float onTransact;
    private final Paint onUnminimized;
    private int onWarmupCompleted;
    private float readTypedObject;
    private int writeTypedObject;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RoundBgView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RoundBgView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ Unit IAuthTabCallback(RoundBgView roundBgView, int i, float f) {
        int i2 = 2 % 2;
        int i3 = newSession + 95;
        extraCommand = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(roundBgView, i, f);
        int i5 = extraCommand + 31;
        newSession = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 42 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = i4 | i7 | (~i2);
        int i9 = ~i4;
        int i10 = (~(i2 | i7)) | (~(i7 | i9));
        int i11 = i3 + i4 + i6 + ((-92689393) * i5) + (1942122663 * i);
        int i12 = i11 * i11;
        int i13 = (((-665130586) * i3) - 357761024) + ((-674687396) * i4) + (4778405 * i8) + (i9 * (-4778405)) + ((-4778405) * i10) + ((-669908992) * i6) + ((-1056047104) * i5) + ((-742522880) * i) + ((-592117760) * i12);
        int i14 = (i3 * 1048061654) + 1366922925 + (i4 * 1048062268) + (i8 * (-307)) + (i9 * 307) + (i10 * 307) + (i6 * 1048061961) + (i5 * 439444615) + (i * (-1279783457)) + (i12 * 173867008);
        return i13 + ((i14 * i14) * (-1898250240)) != 1 ? onExtraCallback(objArr) : onNavigationEvent(objArr);
    }

    public static /* synthetic */ Unit onNavigationEvent(RoundBgView roundBgView, int i, float f) {
        int i2 = 2 % 2;
        int i3 = extraCommand + 125;
        newSession = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(roundBgView, i, f);
        if (i4 == 0) {
            int i5 = 41 / 0;
        }
        int i6 = newSession + 83;
        extraCommand = i6 % 128;
        if (i6 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundBgView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        setWillNotDraw(false);
        this.writeTypedObject = 15;
        this.onWarmupCompleted = 255;
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.IAuthTabCallback = paint;
        Paint paint2 = new Paint();
        Paint.Style style2 = Paint.Style.STROKE;
        paint2.setStyle(style2);
        paint2.setAntiAlias(true);
        Paint.Join join = Paint.Join.ROUND;
        paint2.setStrokeJoin(join);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint2.setStrokeCap(cap);
        this.ICustomTabsService = paint2;
        Paint paint3 = new Paint();
        paint3.setAntiAlias(true);
        paint3.setStyle(style2);
        paint3.setStrokeJoin(join);
        paint3.setStrokeCap(cap);
        this.mayLaunchUrl = paint3;
        Paint paint4 = new Paint();
        paint4.setStyle(style);
        paint4.setAntiAlias(true);
        this.ICustomTabsCallbackStubProxy = paint4;
        Paint paint5 = new Paint();
        paint5.setStyle(style);
        paint5.setAntiAlias(true);
        this.onUnminimized = paint5;
        Cacheurls1.IAuthTabCallback iAuthTabCallback = Cacheurls1.IAuthTabCallback.onWarmupCompleted;
        this.onActivityLayout = iAuthTabCallback;
        this.onMessageChannelReady = iAuthTabCallback;
        Paint paint6 = new Paint();
        paint6.setStyle(style);
        paint6.setAntiAlias(true);
        this.onPostMessage = paint6;
        this.asBinder = new RectF();
        this.getInterfaceDescriptor = new Path();
        this.IAuthTabCallbackStubProxy = new Path();
        this.IAuthTabCallbackStub = new Path();
        this.IAuthTabCallbackDefault = new RectF();
        this.access100 = new Path();
        this.asInterface = new Path();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RoundBgView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = newSession + 125;
            extraCommand = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 2 % 2;
            }
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i5 = newSession + 39;
            extraCommand = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public final float onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = extraCommand + 93;
        int i3 = i2 % 128;
        newSession = i3;
        int i4 = i2 % 2;
        float f = this.readTypedObject;
        int i5 = i3 + 81;
        extraCommand = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 54 / 0;
        }
        return f;
    }

    public final void setDrawInsetLeft(float f) {
        int i = 2 % 2;
        if (f != this.readTypedObject) {
            this.readTypedObject = f;
            invalidate();
            int i2 = newSession + 25;
            extraCommand = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            return;
        }
        int i3 = extraCommand + 55;
        newSession = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    public final float IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = extraCommand;
        int i3 = i2 + 65;
        newSession = i3 % 128;
        int i4 = i3 % 2;
        float f = this.extraCallbackWithResult;
        int i5 = i2 + Imgproc.COLOR_YUV2RGBA_YVYU;
        newSession = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public final void setDrawInsetTop(float f) {
        int i = 2 % 2;
        int i2 = extraCommand + 103;
        int i3 = i2 % 128;
        newSession = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (f != this.extraCallbackWithResult) {
            this.extraCallbackWithResult = f;
            invalidate();
        } else {
            int i4 = i3 + 19;
            extraCommand = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }
    }

    public final void setDrawInsetRight(float f) {
        int i = 2 % 2;
        int i2 = extraCommand + 11;
        newSession = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (f == this.extraCallback) {
            return;
        }
        this.extraCallback = f;
        invalidate();
        int i3 = extraCommand + 91;
        newSession = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final void setDrawInsetBottom(float f) {
        int i = 2 % 2;
        int i2 = newSession + 43;
        int i3 = i2 % 128;
        extraCommand = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (f != this.access000) {
            this.access000 = f;
            invalidate();
        } else {
            int i4 = i3 + 73;
            newSession = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public final float onExtraCallback() {
        int i = 2 % 2;
        int i2 = extraCommand + 103;
        int i3 = i2 % 128;
        newSession = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        float f = this.IAuthTabCallback_Parcel;
        int i4 = i3 + 51;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
        return f;
    }

    public final void setDrawHeight(float f) {
        int i = 2 % 2;
        int i2 = extraCommand + 101;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        if (f == this.IAuthTabCallback_Parcel) {
            return;
        }
        this.IAuthTabCallback_Parcel = f;
        invalidate();
        int i4 = newSession + 31;
        extraCommand = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 61 / 0;
        }
    }

    public final float onTransact() {
        int i = 2 % 2;
        int i2 = newSession + 61;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        float f = this.isEngagementSignalsApiAvailable;
        if (i3 != 0) {
            int i4 = 35 / 0;
        }
        return f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if ((r1 % 2) != 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        r5 = 37 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        r4.isEngagementSignalsApiAvailable = r5;
        invalidate();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (r5 == r4.isEngagementSignalsApiAvailable) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (r5 == r4.isEngagementSignalsApiAvailable) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        r1 = r1 + 19;
        im.toss.uikit.widget.RoundBgView.newSession = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setTopLeftRadius(float f) {
        int i = 2 % 2;
        int i2 = extraCommand;
        int i3 = i2 + 27;
        newSession = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 34 / 0;
        }
    }

    public final void setTopRightRadius(float f) {
        int i = 2 % 2;
        int i2 = newSession + 75;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        if (f == this.ICustomTabsCallback_Parcel) {
            return;
        }
        this.ICustomTabsCallback_Parcel = f;
        invalidate();
        int i4 = newSession + 53;
        extraCommand = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        RoundBgView roundBgView = (RoundBgView) objArr[0];
        int i = 2 % 2;
        int i2 = newSession + 33;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        float f = roundBgView.onTransact;
        if (i3 != 0) {
            int i4 = 78 / 0;
        }
        return Float.valueOf(f);
    }

    public final void setBottomRightRadius(float f) {
        int i = 2 % 2;
        int i2 = extraCommand + 125;
        newSession = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (f == this.onTransact) {
            return;
        }
        this.onTransact = f;
        invalidate();
        int i3 = extraCommand + 47;
        newSession = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    public final void setBottomLeftRadius(float f) {
        int i = 2 % 2;
        int i2 = extraCommand + 15;
        int i3 = i2 % 128;
        newSession = i3;
        int i4 = i2 % 2;
        if (f != this.onNavigationEvent) {
            this.onNavigationEvent = f;
            invalidate();
        } else {
            int i5 = i3 + 15;
            extraCommand = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    public final void setTopRadius(float f) {
        int i = 2 % 2;
        int i2 = newSession + 45;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        setTopLeftRadius(f);
        setTopRightRadius(f);
        int i4 = newSession + 91;
        extraCommand = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 26 / 0;
        }
    }

    public final void setBottomRadius(float f) {
        int i = 2 % 2;
        int i2 = extraCommand + 53;
        newSession = i2 % 128;
        if (i2 % 2 != 0) {
            setBottomLeftRadius(f);
            setBottomRightRadius(f);
        } else {
            setBottomLeftRadius(f);
            setBottomRightRadius(f);
            throw null;
        }
    }

    public final void setRoundType(int i) {
        int i2 = 2 % 2;
        int i3 = newSession;
        int i4 = i3 + 109;
        extraCommand = i4 % 128;
        if (i4 % 2 == 0) {
            if (i != this.writeTypedObject) {
                this.writeTypedObject = i;
                invalidate();
                return;
            } else {
                int i5 = i3 + 71;
                extraCommand = i5 % 128;
                int i6 = i5 % 2;
                return;
            }
        }
        throw null;
    }

    public final void setCornerCircular(boolean z) {
        int i = 2 % 2;
        int i2 = extraCommand;
        int i3 = i2 + 105;
        newSession = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        if (z != this.ICustomTabsCallback) {
            this.ICustomTabsCallback = z;
            invalidate();
            int i5 = extraCommand + 19;
            newSession = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        int i6 = i2 + 29;
        newSession = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    public final float onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = newSession + 41;
        int i3 = i2 % 128;
        extraCommand = i3;
        int i4 = i2 % 2;
        float f = this.onExtraCallback;
        int i5 = i3 + 35;
        newSession = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public final void setBgStrokeWidth(float f) {
        int i = 2 % 2;
        int i2 = extraCommand;
        int i3 = i2 + 1;
        newSession = i3 % 128;
        int i4 = i3 % 2;
        if (f != this.onExtraCallback) {
            this.onExtraCallback = f;
            this.ICustomTabsService.setStrokeWidth(f * 2.0f);
            invalidate();
        } else {
            int i5 = i2 + 55;
            newSession = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    public final void setBgStrokeColor(int i) {
        int i2 = 2 % 2;
        if (i != this.onWarmupCompleted) {
            this.onWarmupCompleted = i;
            this.ICustomTabsService.setColor(i);
            this.ICustomTabsCallbackStubProxy.setColor(i);
            invalidate();
            int i3 = extraCommand + 15;
            newSession = i3 % 128;
            if (i3 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = newSession + 49;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setBgColor(int i) {
        int i2 = 2 % 2;
        int i3 = newSession;
        int i4 = i3 + 69;
        extraCommand = i4 % 128;
        if (i4 % 2 == 0) {
            if (i != this.onExtraCallbackWithResult) {
                this.onExtraCallbackWithResult = i;
                this.IAuthTabCallback.setColor(i);
                invalidate();
                return;
            } else {
                int i5 = i3 + 77;
                extraCommand = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
                return;
            }
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        r4.ICustomTabsCallbackStub = r5;
        invalidate();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r5 == r4.ICustomTabsCallbackStub) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r5 == r4.ICustomTabsCallbackStub) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r1 = r1 + 43;
        im.toss.uikit.widget.RoundBgView.extraCommand = r1 % 128;
        r1 = r1 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setShadow2SpreadDp(int i) {
        int i2 = 2 % 2;
        int i3 = newSession;
        int i4 = i3 + 79;
        extraCommand = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 39 / 0;
        }
    }

    public static /* synthetic */ void setShadow$default(RoundBgView roundBgView, Cacheurls1 cacheurls1, AppLovinSdkSettings appLovinSdkSettings, int i, Object obj) {
        int i2 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setShadow");
        }
        int i3 = newSession + 119;
        int i4 = i3 % 128;
        extraCommand = i4;
        int i5 = i3 % 2;
        if ((i & 2) != 0) {
            int i6 = i4 + 21;
            newSession = i6 % 128;
            int i7 = i6 % 2;
            appLovinSdkSettings = null;
        }
        roundBgView.setShadow(cacheurls1, appLovinSdkSettings);
    }

    private static final Unit onExtraCallback(RoundBgView roundBgView, int i, float f) {
        int i2 = 2 % 2;
        int i3 = extraCommand + 119;
        newSession = i3 % 128;
        int i4 = i3 % 2;
        roundBgView.ICustomTabsCallbackDefault = VideoEncoderInfoImplExternalSyntheticLambda0.IAuthTabCallback(i, (int) f);
        roundBgView.invalidate();
        Unit unit = Unit.INSTANCE;
        int i5 = extraCommand + 55;
        newSession = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005a A[PHI: r6 r7
      0x005a: PHI (r6v5 int) = (r6v4 int), (r6v13 int) binds: [B:13:0x0058, B:10:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x005a: PHI (r7v3 int) = (r7v2 int), (r7v7 int) binds: [B:13:0x0058, B:10:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setShadow(@NotNull Cacheurls1 cacheurls1, @Nullable AppLovinSdkSettings appLovinSdkSettings) {
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = newSession + 111;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(cacheurls1, "");
        Rally rally = this.onRelationshipValidationResult;
        if (rally != null) {
            int i6 = extraCommand + 39;
            newSession = i6 % 128;
            int i7 = i6 % 2;
            rally.ICustomTabsServiceStub();
            int i8 = extraCommand + 53;
            newSession = i8 % 128;
            int i9 = i8 % 2;
        }
        this.onActivityLayout = cacheurls1;
        final int iOnExtraCallback = setUrlokhttp.onExtraCallback(this, cacheurls1);
        this.onUnminimized.setMaskFilter(onExtraCallback(cacheurls1));
        if (appLovinSdkSettings != null) {
            int i10 = extraCommand + 29;
            newSession = i10 % 128;
            if (i10 % 2 == 0) {
                i = this.ICustomTabsCallbackDefault;
                i2 = iOnExtraCallback >> 50;
                if (i2 <= 0) {
                    iOnExtraCallback = i;
                    i = iOnExtraCallback;
                }
                this.onRelationshipValidationResult = (Rally) RallysKt.onWarmupCompleted(new Object[]{this, (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{appLovinSdkSettings, Float.valueOf(i >>> 24), Float.valueOf(i2), new Function1() { // from class: im.toss.uikit.widget.RoundBgView$$ExternalSyntheticLambda0
                    private static int onExtraCallback = 0;
                    private static int onWarmupCompleted = 1;

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i11 = 2 % 2;
                        int i12 = onWarmupCompleted + 39;
                        onExtraCallback = i12 % 128;
                        int i13 = i12 % 2;
                        RoundBgView roundBgView = this.f$0;
                        if (i13 == 0) {
                            return RoundBgView.IAuthTabCallback(roundBgView, iOnExtraCallback, ((Float) obj).floatValue());
                        }
                        Unit unitIAuthTabCallback = RoundBgView.IAuthTabCallback(roundBgView, iOnExtraCallback, ((Float) obj).floatValue());
                        int i14 = 71 / 0;
                        return unitIAuthTabCallback;
                    }
                }, null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 0, null, 0, null, null, Boolean.FALSE, 0, 0L, false, 1916, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
            } else {
                i = this.ICustomTabsCallbackDefault;
                i2 = iOnExtraCallback >>> 24;
                if (i2 <= 0) {
                }
                this.onRelationshipValidationResult = (Rally) RallysKt.onWarmupCompleted(new Object[]{this, (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{appLovinSdkSettings, Float.valueOf(i >>> 24), Float.valueOf(i2), new Function1() { // from class: im.toss.uikit.widget.RoundBgView$$ExternalSyntheticLambda0
                    private static int onExtraCallback = 0;
                    private static int onWarmupCompleted = 1;

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i11 = 2 % 2;
                        int i12 = onWarmupCompleted + 39;
                        onExtraCallback = i12 % 128;
                        int i13 = i12 % 2;
                        RoundBgView roundBgView = this.f$0;
                        if (i13 == 0) {
                            return RoundBgView.IAuthTabCallback(roundBgView, iOnExtraCallback, ((Float) obj).floatValue());
                        }
                        Unit unitIAuthTabCallback = RoundBgView.IAuthTabCallback(roundBgView, iOnExtraCallback, ((Float) obj).floatValue());
                        int i14 = 71 / 0;
                        return unitIAuthTabCallback;
                    }
                }, null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 0, null, 0, null, null, Boolean.FALSE, 0, 0L, false, 1916, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
            }
        } else {
            this.ICustomTabsCallbackDefault = iOnExtraCallback;
        }
        Rally rally2 = this.onRelationshipValidationResult;
        if (rally2 != null) {
            isFireOS.onExtraCallbackWithResult(rally2, false, 1, (Object) null);
        }
        onNavigationEvent(EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), new Object[]{this}, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), -1078255625, 1078255626, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent());
        invalidate();
    }

    public static /* synthetic */ void setShadow2$default(RoundBgView roundBgView, Cacheurls1 cacheurls1, AppLovinSdkSettings appLovinSdkSettings, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = newSession;
        int i4 = i3 + 9;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setShadow2");
        }
        if ((i & 2) != 0) {
            int i6 = i3 + 109;
            extraCommand = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i3 + 57;
            extraCommand = i8 % 128;
            int i9 = i8 % 2;
            appLovinSdkSettings = null;
        }
        roundBgView.setShadow2(cacheurls1, appLovinSdkSettings);
        int i10 = extraCommand + 11;
        newSession = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    private static final Unit onWarmupCompleted(RoundBgView roundBgView, int i, float f) {
        int i2 = 2 % 2;
        int i3 = newSession + 101;
        extraCommand = i3 % 128;
        int i4 = i3 % 2;
        roundBgView.onActivityResized = VideoEncoderInfoImplExternalSyntheticLambda0.IAuthTabCallback(i, (int) f);
        roundBgView.invalidate();
        Unit unit = Unit.INSTANCE;
        int i5 = newSession + 103;
        extraCommand = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003e A[PHI: r3 r4
      0x003e: PHI (r3v5 int) = (r3v4 int), (r3v11 int) binds: [B:13:0x003c, B:10:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x003e: PHI (r4v3 int) = (r4v2 int), (r4v7 int) binds: [B:13:0x003c, B:10:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setShadow2(@NotNull Cacheurls1 cacheurls1, @Nullable AppLovinSdkSettings appLovinSdkSettings) {
        int i;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(cacheurls1, "");
        Rally rally = this.onMinimized;
        if (rally != null) {
            rally.ICustomTabsServiceStub();
        }
        this.onMessageChannelReady = cacheurls1;
        final int iOnExtraCallback = setUrlokhttp.onExtraCallback(this, cacheurls1);
        this.onPostMessage.setMaskFilter(onExtraCallback(cacheurls1));
        if (appLovinSdkSettings != null) {
            int i4 = extraCommand;
            int i5 = i4 + Imgproc.COLOR_YUV2RGB_YVYU;
            newSession = i5 % 128;
            if (i5 % 2 == 0) {
                i = this.onActivityResized;
                i2 = iOnExtraCallback << 48;
                if (i2 <= 0) {
                    iOnExtraCallback = i;
                    int i6 = i4 + 1;
                    newSession = i6 % 128;
                    int i7 = i6 % 2;
                    i = iOnExtraCallback;
                }
                this.onMinimized = (Rally) RallysKt.onWarmupCompleted(new Object[]{this, (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{appLovinSdkSettings, Float.valueOf(i >>> 24), Float.valueOf(i2), new Function1() { // from class: im.toss.uikit.widget.RoundBgView$$ExternalSyntheticLambda1
                    private static int onExtraCallbackWithResult = 1;
                    private static int onNavigationEvent;

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i8 = 2 % 2;
                        int i9 = onExtraCallbackWithResult + 91;
                        onNavigationEvent = i9 % 128;
                        if (i9 % 2 != 0) {
                            RoundBgView.onNavigationEvent(this.f$0, iOnExtraCallback, ((Float) obj).floatValue());
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                        Unit unitOnNavigationEvent = RoundBgView.onNavigationEvent(this.f$0, iOnExtraCallback, ((Float) obj).floatValue());
                        int i10 = onNavigationEvent + 109;
                        onExtraCallbackWithResult = i10 % 128;
                        int i11 = i10 % 2;
                        return unitOnNavigationEvent;
                    }
                }, null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 0, null, 0, null, null, Boolean.FALSE, 0, 0L, false, 1916, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
            } else {
                i = this.onActivityResized;
                i2 = iOnExtraCallback >>> 24;
                if (i2 <= 0) {
                }
                this.onMinimized = (Rally) RallysKt.onWarmupCompleted(new Object[]{this, (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{appLovinSdkSettings, Float.valueOf(i >>> 24), Float.valueOf(i2), new Function1() { // from class: im.toss.uikit.widget.RoundBgView$$ExternalSyntheticLambda1
                    private static int onExtraCallbackWithResult = 1;
                    private static int onNavigationEvent;

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i8 = 2 % 2;
                        int i9 = onExtraCallbackWithResult + 91;
                        onNavigationEvent = i9 % 128;
                        if (i9 % 2 != 0) {
                            RoundBgView.onNavigationEvent(this.f$0, iOnExtraCallback, ((Float) obj).floatValue());
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                        Unit unitOnNavigationEvent = RoundBgView.onNavigationEvent(this.f$0, iOnExtraCallback, ((Float) obj).floatValue());
                        int i10 = onNavigationEvent + 109;
                        onExtraCallbackWithResult = i10 % 128;
                        int i11 = i10 % 2;
                        return unitOnNavigationEvent;
                    }
                }, null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 0, null, 0, null, null, Boolean.FALSE, 0, 0L, false, 1916, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
            }
        } else {
            this.onActivityResized = iOnExtraCallback;
        }
        Rally rally2 = this.onMinimized;
        if (rally2 != null) {
            isFireOS.onExtraCallbackWithResult(rally2, false, 1, (Object) null);
        }
        int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        int iOnNavigationEvent2 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        onNavigationEvent(EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), new Object[]{this}, iOnNavigationEvent, -1078255625, 1078255626, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), iOnNavigationEvent2);
        invalidate();
    }

    public final void setShadowAlpha(float f) {
        int i = 2 % 2;
        int i2 = newSession + 93;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        this.ICustomTabsCallbackDefault = setBodyokhttp.IAuthTabCallback(setUrlokhttp.onExtraCallback(this, this.onActivityLayout), f);
        invalidate();
        int i4 = newSession + 21;
        extraCommand = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 5 / 0;
        }
    }

    private final MaskFilter onExtraCallback(Cacheurls1 cacheurls1) {
        int i = 2 % 2;
        int i2 = extraCommand + 9;
        newSession = i2 % 128;
        if (i2 % 2 == 0) {
            if (cacheurls1.onExtraCallback() <= 2.0f) {
                return null;
            }
        } else if (cacheurls1.onExtraCallback() <= 0.0f) {
            return null;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(varyMatches.IAuthTabCallback(this, Float.valueOf(cacheurls1.onExtraCallback())), BlurMaskFilter.Blur.NORMAL);
        int i3 = extraCommand + 37;
        newSession = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 43 / 0;
        }
        return blurMaskFilter;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        RoundBgView roundBgView = (RoundBgView) objArr[0];
        int i = 2 % 2;
        int i2 = extraCommand + 109;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        if (roundBgView.onActivityLayout.onExtraCallback() <= 0.0f) {
            int i4 = extraCommand + 7;
            newSession = i4 % 128;
            if (i4 % 2 == 0) {
                if (roundBgView.onMessageChannelReady.onExtraCallback() <= 2.0f) {
                    return null;
                }
            } else if (roundBgView.onMessageChannelReady.onExtraCallback() <= 0.0f) {
                return null;
            }
        }
        if (!(roundBgView.getParent() instanceof ViewGroup)) {
            return null;
        }
        ViewParent parent = roundBgView.getParent();
        Intrinsics.checkNotNull(parent, "");
        ViewGroup viewGroup = (ViewGroup) parent;
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020 A[PHI: r1
      0x0020: PHI (r1v5 im.toss.tds.foundation.anim.rally.Rally) = (r1v4 im.toss.tds.foundation.anim.rally.Rally), (r1v10 im.toss.tds.foundation.anim.rally.Rally) binds: [B:8:0x001e, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onDetachedFromWindow() {
        Rally rally;
        int i = 2 % 2;
        int i2 = newSession + 21;
        extraCommand = i2 % 128;
        if (i2 % 2 != 0) {
            super.onDetachedFromWindow();
            rally = this.onRelationshipValidationResult;
            int i3 = 3 / 0;
            if (rally != null) {
                rally.ICustomTabsServiceStub();
            }
        } else {
            super.onDetachedFromWindow();
            rally = this.onRelationshipValidationResult;
            if (rally != null) {
            }
        }
        Rally rally2 = this.onMinimized;
        if (rally2 != null) {
            rally2.ICustomTabsServiceStub();
        }
        int i4 = newSession + 5;
        extraCommand = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 1 / 0;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        int i = 2 % 2;
        int i2 = extraCommand + 31;
        newSession = i2 % 128;
        if (i2 % 2 != 0) {
            super.onAttachedToWindow();
            int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
            int iOnNavigationEvent2 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
            int iOnNavigationEvent3 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
            onNavigationEvent(EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), new Object[]{this}, iOnNavigationEvent, -1078255625, 1078255626, iOnNavigationEvent3, iOnNavigationEvent2);
            int i3 = newSession + 69;
            extraCommand = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        super.onAttachedToWindow();
        int iOnNavigationEvent4 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        int iOnNavigationEvent5 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        int iOnNavigationEvent6 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        onNavigationEvent(EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), new Object[]{this}, iOnNavigationEvent4, -1078255625, 1078255626, iOnNavigationEvent6, iOnNavigationEvent5);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003f A[PHI: r1 r2 r3 r4
      0x003f: PHI (r1v7 float) = (r1v4 float), (r1v8 float) binds: [B:8:0x0032, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
      0x003f: PHI (r2v4 float) = (r2v1 float), (r2v5 float) binds: [B:8:0x0032, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
      0x003f: PHI (r3v5 float) = (r3v1 float), (r3v7 float) binds: [B:8:0x0032, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
      0x003f: PHI (r4v3 float) = (r4v0 float), (r4v4 float) binds: [B:8:0x0032, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0034 A[PHI: r1 r2 r3 r4 r5
      0x0034: PHI (r1v5 float) = (r1v4 float), (r1v8 float) binds: [B:8:0x0032, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
      0x0034: PHI (r2v2 float) = (r2v1 float), (r2v5 float) binds: [B:8:0x0032, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
      0x0034: PHI (r3v2 float) = (r3v1 float), (r3v7 float) binds: [B:8:0x0032, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
      0x0034: PHI (r4v1 float) = (r4v0 float), (r4v4 float) binds: [B:8:0x0032, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
      0x0034: PHI (r5v1 float) = (r5v0 float), (r5v6 float) binds: [B:8:0x0032, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final RectF IAuthTabCallbackStub() {
        float f;
        float f2;
        float width;
        float f3;
        float f4;
        float height;
        int i = 2 % 2;
        int i2 = newSession + 23;
        extraCommand = i2 % 128;
        if (i2 % 2 != 0) {
            f = this.readTypedObject;
            f2 = this.extraCallbackWithResult;
            width = getWidth();
            f3 = this.extraCallback;
            f4 = this.IAuthTabCallback_Parcel;
            if (f4 <= 2.0f) {
                height = getHeight() - this.access000;
            } else {
                int i3 = newSession + 73;
                extraCommand = i3 % 128;
                int i4 = i3 % 2;
                height = f4 + f2;
            }
        } else {
            f = this.readTypedObject;
            f2 = this.extraCallbackWithResult;
            width = getWidth();
            f3 = this.extraCallback;
            f4 = this.IAuthTabCallback_Parcel;
            if (f4 > 0.0f) {
            }
        }
        this.asBinder.set(f, f2, width - f3, height);
        return this.asBinder;
    }

    private final Path onNavigationEvent(RectF rectF, Path path) {
        Path pathOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = extraCommand + 85;
        newSession = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            path.reset();
            float fWidth = rectF.width();
            float fHeight = rectF.height();
            if (this.ICustomTabsCallback) {
                Object[] objArr = {deprecated_noStore.onExtraCallback, Float.valueOf(fWidth), Float.valueOf(fHeight), Float.valueOf(this.isEngagementSignalsApiAvailable), Float.valueOf(this.ICustomTabsCallback_Parcel), Float.valueOf(this.onTransact), Float.valueOf(this.onNavigationEvent), Integer.valueOf(this.writeTypedObject), false, 128, null};
                int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
                int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
                pathOnWarmupCompleted = (Path) deprecated_noStore.onExtraCallbackWithResult(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback, 122333280, objArr, -122333278, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback2);
            } else {
                pathOnWarmupCompleted = deprecated_noStore.onWarmupCompleted(deprecated_noStore.onExtraCallback, fWidth, fHeight, this.isEngagementSignalsApiAvailable, this.ICustomTabsCallback_Parcel, this.onTransact, this.onNavigationEvent, this.writeTypedObject, false, 128, (Object) null);
                int i3 = extraCommand + 55;
                newSession = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 3 % 4;
                }
            }
            path.set(pathOnWarmupCompleted);
            path.offset(rectF.left, rectF.top);
            int i5 = extraCommand + 39;
            newSession = i5 % 128;
            if (i5 % 2 != 0) {
                return path;
            }
            throw null;
        }
        path.reset();
        rectF.width();
        rectF.height();
        obj.hashCode();
        throw null;
    }

    @Override // android.view.View
    public void draw(@NotNull Canvas canvas) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(canvas, "");
        RectF rectFIAuthTabCallbackStub = IAuthTabCallbackStub();
        if (Build.VERSION.SDK_INT >= 28) {
            if (this.onActivityLayout.onExtraCallback() > 0.0f) {
                int i2 = extraCommand + 81;
                newSession = i2 % 128;
                int i3 = i2 % 2;
                onNavigationEvent(rectFIAuthTabCallbackStub, this.IAuthTabCallbackStubProxy);
                this.IAuthTabCallbackStubProxy.offset(0.0f, varyMatches.IAuthTabCallback(this, Float.valueOf(this.onActivityLayout.onExtraCallbackWithResult())));
                this.onUnminimized.setColor(this.ICustomTabsCallbackDefault);
                canvas.drawPath(this.IAuthTabCallbackStubProxy, this.onUnminimized);
                int i4 = extraCommand + 9;
                newSession = i4 % 128;
                int i5 = i4 % 2;
            }
            if (this.onMessageChannelReady.onExtraCallback() > 0.0f) {
                float fIAuthTabCallback = varyMatches.IAuthTabCallback(this, Integer.valueOf(this.ICustomTabsCallbackStub));
                this.IAuthTabCallbackDefault.set(rectFIAuthTabCallbackStub.left - fIAuthTabCallback, rectFIAuthTabCallbackStub.top - fIAuthTabCallback, rectFIAuthTabCallbackStub.right + fIAuthTabCallback, rectFIAuthTabCallbackStub.bottom + fIAuthTabCallback);
                onNavigationEvent(this.IAuthTabCallbackDefault, this.IAuthTabCallbackStub);
                this.IAuthTabCallbackStub.offset(0.0f, varyMatches.IAuthTabCallback(this, Float.valueOf(this.onMessageChannelReady.onExtraCallbackWithResult())));
                this.onPostMessage.setColor(this.onActivityResized);
                canvas.drawPath(this.IAuthTabCallbackStub, this.onPostMessage);
            }
        }
        super.draw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@NotNull Canvas canvas) {
        int i = 2 % 2;
        int i2 = extraCommand + 47;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(canvas, "");
        onNavigationEvent(IAuthTabCallbackStub(), this.getInterfaceDescriptor);
        canvas.drawPath(this.getInterfaceDescriptor, this.IAuthTabCallback);
        Path path = this.getInterfaceDescriptor;
        int iSave = canvas.save();
        canvas.clipPath(path);
        try {
            super.dispatchDraw(canvas);
            canvas.restoreToCount(iSave);
            if (this.ICustomTabsService.getStrokeWidth() > 0.0f) {
                int i4 = newSession + 123;
                extraCommand = i4 % 128;
                int i5 = i4 % 2;
                this.access100.reset();
                this.mayLaunchUrl.setStrokeWidth(this.ICustomTabsService.getStrokeWidth());
                this.mayLaunchUrl.getFillPath(this.getInterfaceDescriptor, this.access100);
                this.asInterface.reset();
                this.asInterface.op(this.access100, this.getInterfaceDescriptor, Path.Op.INTERSECT);
                canvas.drawPath(this.asInterface, this.ICustomTabsCallbackStubProxy);
            }
        } catch (Throwable th) {
            canvas.restoreToCount(iSave);
            throw th;
        }
    }

    private final void asInterface() {
        int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        int iOnNavigationEvent2 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        int iOnNavigationEvent3 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        onNavigationEvent(EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), new Object[]{this}, iOnNavigationEvent, -1078255625, 1078255626, iOnNavigationEvent3, iOnNavigationEvent2);
    }

    public final float onNavigationEvent() {
        int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        int iOnNavigationEvent2 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        int iOnNavigationEvent3 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        return ((Float) onNavigationEvent(EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), new Object[]{this}, iOnNavigationEvent, 9267894, -9267894, iOnNavigationEvent3, iOnNavigationEvent2)).floatValue();
    }
}
