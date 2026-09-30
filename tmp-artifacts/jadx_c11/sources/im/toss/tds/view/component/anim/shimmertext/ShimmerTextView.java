package im.toss.tds.view.component.anim.shimmertext;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.AppCompatTextView;
import com.iap.android.mppclient.container.constant.JsParamKeys;
import im.toss.features.tosscert.ui.R;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.tds.view.component.anim.shimmertext.ShimmerTextView$;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.atom.text.Typography1;
import im.toss.tds.view.component.atom.text.Typography2;
import im.toss.tds.view.component.atom.text.Typography3;
import im.toss.tds.view.component.atom.text.Typography4;
import im.toss.tds.view.component.atom.text.Typography5;
import im.toss.tds.view.component.atom.text.Typography6;
import im.toss.tds.view.component.atom.text.Typography7;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.AppLovinSdkSettings;
import o.getExtraParameters;
import o.getUrlokhttp;
import o.isDuplex;
import o.isMuted;
import o.matches;
import o.onAdViewAdDisplayFailed;
import o.pxToDp;
import o.response;
import o.runOnUiThreadDelayed;
import o.setBodyokhttp;
import o.setHeadersokhttp;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class ShimmerTextView extends View {
    private static int extraCallbackWithResult = 0;
    private static int readTypedObject = 1;
    private final Paint IAuthTabCallback;
    private final Lazy IAuthTabCallbackDefault;
    private String IAuthTabCallbackStub;
    private final Rect IAuthTabCallbackStubProxy;
    private isDuplex IAuthTabCallback_Parcel;
    private final Paint access000;
    private Bitmap access100;
    private BaseTextView asBinder;
    private StaticLayout asInterface;
    private final Paint extraCallback;
    private final Matrix getInterfaceDescriptor;
    private final Rect onExtraCallback;
    private float onExtraCallbackWithResult;
    private final Paint onNavigationEvent;
    private StaticLayout onTransact;
    private String onWarmupCompleted;
    private runOnUiThreadDelayed writeTypedObject;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShimmerTextView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShimmerTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~i5;
        int i9 = ~(i7 | i8 | i3);
        int i10 = ~i3;
        int i11 = (~(i7 | i10)) | (~(i8 | i2 | i3));
        int i12 = (~(i3 | i7)) | (~(i8 | i10));
        int i13 = i2 + i5 + i4 + ((-1255669517) * i) + (533247121 * i6);
        int i14 = i13 * i13;
        int i15 = ((i2 * (-1895547823)) - 858849280) + ((-1895547823) * i5) + (i9 * (-204618832)) + (i11 * (-204618832)) + ((-204618832) * i12) + ((-2100166656) * i4) + (760610816 * i) + ((-1057882112) * i6) + (1344208896 * i14);
        int i16 = ((i2 * (-122328301)) - 2132886715) + (i5 * (-122328301)) + (i9 * 272) + (i11 * 272) + (i12 * 272) + (i4 * (-122328029)) + (i * (-1196579527)) + (i6 * 656595923) + (i14 * 138215424);
        if (i15 + (i16 * i16 * (-833028096)) != 1) {
            return IAuthTabCallback(objArr);
        }
        ShimmerTextView shimmerTextView = (ShimmerTextView) objArr[0];
        isDuplex isduplex = (isDuplex) objArr[1];
        int i17 = 2 % 2;
        shimmerTextView.extraCallback.setColor(isduplex.onWarmupCompleted());
        shimmerTextView.IAuthTabCallback.setShader(new LinearGradient(0.0f, 0.0f, isduplex.IAuthTabCallback(shimmerTextView.getMeasuredWidth()), 0.0f, isduplex.IAuthTabCallback(), isduplex.asBinder(), Shader.TileMode.CLAMP));
        int i18 = extraCallbackWithResult + 69;
        readTypedObject = i18 % 128;
        int i19 = i18 % 2;
        return null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        ShimmerTextView shimmerTextView = (ShimmerTextView) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int i = 2 % 2;
        int i2 = readTypedObject + 97;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(shimmerTextView, fFloatValue);
        if (i3 != 0) {
            int i4 = 98 / 0;
        }
        int i5 = readTypedObject + 13;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    private final float onNavigationEvent(float f, float f2, float f3) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult;
        int i3 = i2 + 101;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        float f4 = f + ((f2 - f) * f3);
        int i5 = i2 + 29;
        readTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return f4;
    }

    public static /* synthetic */ Typography7 onWarmupCompleted(Context context) {
        int i = 2 % 2;
        int i2 = readTypedObject + 17;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Typography7 typography7IAuthTabCallback = IAuthTabCallback(context);
        int i4 = extraCallbackWithResult + 55;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return typography7IAuthTabCallback;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShimmerTextView(@NotNull final Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        Paint paint = new Paint(1);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Configuration configuration = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        paint.setColor(((Integer) setHeadersokhttp.onExtraCallbackWithResult(-552023978, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{new getUrlokhttp(new setBodyokhttp.onWarmupCompleted(configuration)).requestPostMessageChannel()}, matches.onExtraCallback(), 552023983, matches.onExtraCallback())).intValue());
        this.onNavigationEvent = paint;
        this.extraCallback = new Paint(1);
        this.IAuthTabCallback = new Paint(1);
        Paint paint2 = new Paint(1);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_ATOP));
        this.access000 = paint2;
        this.IAuthTabCallbackStubProxy = new Rect();
        this.onExtraCallback = new Rect();
        this.getInterfaceDescriptor = new Matrix();
        this.onWarmupCompleted = "";
        this.IAuthTabCallbackDefault = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.tds.view.component.anim.shimmertext.ShimmerTextView$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 91;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Context context3 = context;
                if (i4 == 0) {
                    return ShimmerTextView.onWarmupCompleted(context3);
                }
                ShimmerTextView.onWarmupCompleted(context3);
                throw null;
            }
        });
        this.IAuthTabCallbackStub = "";
        setLayerType(1, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ShimmerTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = readTypedObject + 47;
            int i4 = i3 % 128;
            extraCallbackWithResult = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 63;
            readTypedObject = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i9 = extraCallbackWithResult + 3;
            readTypedObject = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 2 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    private final BaseTextView onExtraCallback() {
        int i = 2 % 2;
        int i2 = readTypedObject + 83;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        BaseTextView baseTextView = (BaseTextView) this.IAuthTabCallbackDefault.getValue();
        int i4 = extraCallbackWithResult + 11;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 41 / 0;
        }
        return baseTextView;
    }

    private static final Typography7 IAuthTabCallback(Context context) {
        int i = 2 % 2;
        Typography7 typography7 = new Typography7(context, null, 0, 6, null);
        typography7.onNavigationEvent(response.Medium);
        int i2 = extraCallbackWithResult + 79;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 83 / 0;
        }
        return typography7;
    }

    public final void setCurrentProgress(float f) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult;
        int i3 = i2 + 125;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        this.onExtraCallbackWithResult = f;
        int i5 = i2 + 47;
        readTypedObject = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setShimmer(@NotNull isDuplex isduplex) {
        int i = 2 % 2;
        int i2 = readTypedObject + 9;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(isduplex, "");
        this.IAuthTabCallback_Parcel = isduplex;
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        IAuthTabCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), -310083289, new Object[]{this, isduplex}, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, 310083290, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
        onNavigationEvent(isduplex);
        invalidate();
        int i4 = extraCallbackWithResult + 111;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 31 / 0;
        }
    }

    private final void onNavigationEvent(isDuplex isduplex) {
        int i = 2 % 2;
        int i2 = readTypedObject;
        int i3 = i2 + 69;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        runOnUiThreadDelayed runonuithreaddelayed = this.writeTypedObject;
        if (runonuithreaddelayed != null) {
            int i5 = i2 + 5;
            extraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            runonuithreaddelayed.onNavigationEvent();
        }
        Interpolator interpolatorIAuthTabCallbackDefault = isduplex.IAuthTabCallbackDefault();
        if (interpolatorIAuthTabCallbackDefault != null) {
            pxToDp.IAuthTabCallback iAuthTabCallback = pxToDp.IAuthTabCallback.onExtraCallback;
            Object[] objArr = {RallysKt.onExtraCallback((int) isduplex.onExtraCallbackWithResult()), Float.valueOf(0.0f), Float.valueOf(1.0f), new ShimmerTextView$.ExternalSyntheticLambda1(this), null, 8, null};
            this.writeTypedObject = RallysKt.onWarmupCompleted(this, iAuthTabCallback, CollectionsKt.listOf((Rally) RallysKt.onWarmupCompleted(new Object[]{this, ((AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, objArr, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult())).onWarmupCompleted(interpolatorIAuthTabCallbackDefault), -1, getExtraParameters.Normal, 0, null, null, null, 0, 0L, false, 2032, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025)), 0, null, 0, null, null, Boolean.FALSE, 0, 0L, false, 3832, null);
        }
    }

    private static final Unit IAuthTabCallback(ShimmerTextView shimmerTextView, float f) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 45;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            shimmerTextView.onExtraCallbackWithResult = f;
            shimmerTextView.postInvalidateOnAnimation();
            Unit unit = Unit.INSTANCE;
            int i3 = readTypedObject + 39;
            extraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }
        shimmerTextView.onExtraCallbackWithResult = f;
        shimmerTextView.postInvalidateOnAnimation();
        Unit unit2 = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setText(@NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.IAuthTabCallbackStub = str;
        setContentDescription(this.onWarmupCompleted + " " + str);
        int i2 = extraCallbackWithResult + 17;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setLabel(@NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.onWarmupCompleted = str;
        setContentDescription(str + " " + this.IAuthTabCallbackStub);
        int i2 = readTypedObject + 21;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }

    public final BaseTextView onNavigationEvent() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 55;
        int i3 = i2 % 128;
        readTypedObject = i3;
        int i4 = i2 % 2;
        BaseTextView baseTextView = this.asBinder;
        int i5 = i3 + 113;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return baseTextView;
    }

    public final void setMainText(int i) {
        BaseTextView typography1;
        int i2;
        int i3 = 2 % 2;
        int i4 = extraCallbackWithResult + 39;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        switch (i) {
            case 1:
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                typography1 = new Typography1(context, null, 0, 6, null);
                this.asBinder = typography1;
                return;
            case 2:
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                typography1 = new Typography2(context2, null, 0, 6, null);
                i2 = extraCallbackWithResult + 47;
                readTypedObject = i2 % 128;
                int i6 = i2 % 2;
                this.asBinder = typography1;
                return;
            case 3:
                Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                typography1 = new Typography3(context3, null, 0, 6, null);
                this.asBinder = typography1;
                return;
            case 4:
                Context context4 = getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "");
                typography1 = new Typography4(context4, null, 0, 6, null);
                this.asBinder = typography1;
                return;
            case 5:
                Context context5 = getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "");
                typography1 = new Typography5(context5, null, 0, 6, null);
                i2 = readTypedObject + 23;
                extraCallbackWithResult = i2 % 128;
                int i62 = i2 % 2;
                this.asBinder = typography1;
                return;
            case 6:
                Context context6 = getContext();
                Intrinsics.checkNotNullExpressionValue(context6, "");
                typography1 = new Typography6(context6, null, 0, 6, null);
                this.asBinder = typography1;
                return;
            case 7:
                Context context7 = getContext();
                Intrinsics.checkNotNullExpressionValue(context7, "");
                typography1 = new Typography7(context7, null, 0, 6, null);
                this.asBinder = typography1;
                return;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final void setMainTextFont(@NotNull response responseVar) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(responseVar, "");
        BaseTextView baseTextView = this.asBinder;
        if (baseTextView != null) {
            int i2 = readTypedObject + 79;
            extraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            baseTextView.onNavigationEvent(responseVar);
            int i4 = extraCallbackWithResult + 45;
            readTypedObject = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = extraCallbackWithResult + 119;
        readTypedObject = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 85 / 0;
        }
    }

    public final void setLabelColor(int i) {
        int i2 = 2 % 2;
        int i3 = extraCallbackWithResult + 99;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        this.onNavigationEvent.setColor(i);
        int i5 = readTypedObject + 121;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int iMeasureText;
        StaticLayout staticLayout;
        int i3 = 2 % 2;
        super.onMeasure(i, i2);
        AppCompatTextView appCompatTextView = this.asBinder;
        if (appCompatTextView != null) {
            int height = 0;
            if (View.MeasureSpec.getMode(i) == 1073741824) {
                int i4 = readTypedObject + 73;
                extraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                iMeasureText = (getMeasuredWidth() - getPaddingStart()) - getPaddingEnd();
                int i6 = extraCallbackWithResult + 85;
                readTypedObject = i6 % 128;
                int i7 = i6 % 2;
            } else {
                Object obj = null;
                if (StringsKt.contains$default(this.IAuthTabCallbackStub, "\n", false, 2, (Object) null)) {
                    Iterator it = StringsKt.split$default(this.IAuthTabCallbackStub, new String[]{"\n"}, false, 0, 6, (Object) null).iterator();
                    if (!it.hasNext()) {
                        throw new NoSuchElementException();
                    }
                    int i8 = extraCallbackWithResult + 35;
                    readTypedObject = i8 % 128;
                    if (i8 % 2 == 0) {
                        appCompatTextView.getPaint().measureText((String) it.next());
                        obj.hashCode();
                        throw null;
                    }
                    int iMeasureText2 = (int) appCompatTextView.getPaint().measureText((String) it.next());
                    while (it.hasNext()) {
                        int i9 = extraCallbackWithResult + 115;
                        readTypedObject = i9 % 128;
                        if (i9 % 2 == 0) {
                            appCompatTextView.getPaint().measureText((String) it.next());
                            obj.hashCode();
                            throw null;
                        }
                        int iMeasureText3 = (int) appCompatTextView.getPaint().measureText((String) it.next());
                        if (iMeasureText2 < iMeasureText3) {
                            int i10 = extraCallbackWithResult + 71;
                            readTypedObject = i10 % 128;
                            if (i10 % 2 == 0) {
                                throw null;
                            }
                            iMeasureText2 = iMeasureText3;
                        }
                    }
                    iMeasureText = iMeasureText2;
                } else {
                    iMeasureText = (int) appCompatTextView.getPaint().measureText(this.IAuthTabCallbackStub);
                }
            }
            if (iMeasureText < 0) {
                return;
            }
            if (onExtraCallbackWithResult()) {
                String str = this.onWarmupCompleted;
                this.asInterface = StaticLayout.Builder.obtain(str, 0, str.length(), onExtraCallback().getPaint(), iMeasureText).setIncludePad(false).setEllipsize(TextUtils.TruncateAt.END).build();
            }
            String str2 = this.IAuthTabCallbackStub;
            StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(str2, 0, str2.length(), appCompatTextView.getPaint(), iMeasureText).setIncludePad(false).setEllipsize(TextUtils.TruncateAt.END).build();
            int width = staticLayoutBuild.getWidth();
            int paddingStart = getPaddingStart();
            int paddingEnd = getPaddingEnd();
            int height2 = staticLayoutBuild.getHeight();
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            if (!(!onExtraCallbackWithResult()) && (staticLayout = this.asInterface) != null) {
                height = staticLayout.getHeight();
            }
            setMeasuredDimension(width + paddingStart + paddingEnd, height2 + paddingTop + paddingBottom + height);
            this.onTransact = staticLayoutBuild;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0029 A[PHI: r8
      0x0029: PHI (r8v2 android.text.StaticLayout) = (r8v1 android.text.StaticLayout), (r8v10 android.text.StaticLayout) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        StaticLayout staticLayout;
        int i5 = 2 % 2;
        int i6 = extraCallbackWithResult + 7;
        readTypedObject = i6 % 128;
        if (i6 % 2 == 0) {
            super.onSizeChanged(i, i2, i3, i4);
            this.IAuthTabCallbackStubProxy.set(0, 1, i, i2);
            staticLayout = this.asInterface;
            if (staticLayout != null) {
                this.onExtraCallback.set(0, 0, staticLayout.getWidth() + getPaddingStart() + getPaddingEnd(), staticLayout.getHeight() + getPaddingTop());
                int i7 = readTypedObject + 3;
                extraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
            }
        } else {
            super.onSizeChanged(i, i2, i3, i4);
            this.IAuthTabCallbackStubProxy.set(0, 0, i, i2);
            staticLayout = this.asInterface;
            if (staticLayout != null) {
            }
        }
        this.access100 = onWarmupCompleted();
        isDuplex isduplex = this.IAuthTabCallback_Parcel;
        if (isduplex == null) {
            return;
        }
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        IAuthTabCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), -310083289, new Object[]{this, isduplex}, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, 310083290, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r4 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        if (r4 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
    
        r4.setAntiAlias(true);
        r2 = android.graphics.Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, "");
        r5 = new android.graphics.Canvas(r2);
        r6 = r13.asInterface;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0067, code lost:
    
        if (r6 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
    
        r7 = im.toss.tds.view.component.anim.shimmertext.ShimmerTextView.extraCallbackWithResult + 17;
        im.toss.tds.view.component.anim.shimmertext.ShimmerTextView.readTypedObject = r7 % 128;
        r7 = r7 % 2;
        r7 = r6.getLineCount();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0077, code lost:
    
        if (r8 >= r7) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0079, code lost:
    
        r5.drawText(r6.getText().subSequence(r6.getLineStart(r8), r6.getLineEnd(r8)).toString(), getPaddingStart(), r6.getLineBaseline(r8) + getPaddingTop(), r4);
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a3, code lost:
    
        r4 = getPaddingTop();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ab, code lost:
    
        if (onExtraCallbackWithResult() == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ad, code lost:
    
        r6 = im.toss.tds.view.component.anim.shimmertext.ShimmerTextView.extraCallbackWithResult + 19;
        r7 = r6 % 128;
        im.toss.tds.view.component.anim.shimmertext.ShimmerTextView.readTypedObject = r7;
        r6 = r6 % 2;
        r6 = r13.asInterface;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b8, code lost:
    
        if (r6 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ba, code lost:
    
        r7 = r7 + 103;
        im.toss.tds.view.component.anim.shimmertext.ShimmerTextView.extraCallbackWithResult = r7 % 128;
        r7 = r7 % 2;
        r0 = r6.getHeight();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c6, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c7, code lost:
    
        r6 = r13.onTransact;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c9, code lost:
    
        if (r6 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00cb, code lost:
    
        r7 = r6.getLineCount();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cf, code lost:
    
        if (r3 >= r7) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d1, code lost:
    
        r5.drawText(r6.getText().subSequence(r6.getLineStart(r3), r6.getLineEnd(r3)).toString(), getPaddingStart(), r6.getLineBaseline(r3) + (r4 + r0), r1);
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f9, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0101, code lost:
    
        throw new java.lang.IllegalStateException("StaticLayout should not be null!");
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0107, code lost:
    
        throw new java.lang.IllegalStateException("TextView should not be null!");
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001d A[PHI: r1
      0x001d: PHI (r1v5 androidx.appcompat.widget.AppCompatTextView) = (r1v4 androidx.appcompat.widget.AppCompatTextView), (r1v8 androidx.appcompat.widget.AppCompatTextView) binds: [B:8:0x001b, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Bitmap onWarmupCompleted() {
        AppCompatTextView appCompatTextView;
        TextPaint paint;
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 69;
        readTypedObject = i2 % 128;
        int i3 = 0;
        if (i2 % 2 == 0) {
            appCompatTextView = this.asBinder;
            int i4 = 79 / 0;
            if (appCompatTextView != null) {
                TextPaint paint2 = appCompatTextView.getPaint();
                if (paint2 != null) {
                    int i5 = extraCallbackWithResult + 19;
                    readTypedObject = i5 % 128;
                    if (i5 % 2 == 0) {
                        paint2.setAntiAlias(true);
                        paint = onExtraCallback().getPaint();
                    } else {
                        paint2.setAntiAlias(true);
                        paint = onExtraCallback().getPaint();
                    }
                }
            }
        } else {
            appCompatTextView = this.asBinder;
            if (appCompatTextView != null) {
            }
        }
        throw new IllegalStateException("TextView should not be null!");
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(canvas, "");
        IAuthTabCallback(canvas, this.onExtraCallbackWithResult);
        Bitmap bitmap = this.access100;
        if (bitmap != null) {
            int i2 = readTypedObject + 37;
            extraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.access000);
            int i4 = readTypedObject + 35;
            extraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0069 A[PHI: r2
      0x0069: PHI (r2v11 float) = (r2v10 float), (r2v25 float) binds: [B:10:0x0067, B:7:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0078 A[PHI: r2
      0x0078: PHI (r2v19 float) = (r2v10 float), (r2v25 float) binds: [B:10:0x0067, B:7:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void IAuthTabCallback(Canvas canvas, float f) {
        float fWidth;
        float fOnNavigationEvent;
        int i = 2 % 2;
        canvas.drawRect(this.IAuthTabCallbackStubProxy, this.extraCallback);
        canvas.drawRect(this.onExtraCallback, this.onNavigationEvent);
        isDuplex isduplex = this.IAuthTabCallback_Parcel;
        if (isduplex != null) {
            int i2 = readTypedObject + 1;
            extraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                fWidth = (float) (this.IAuthTabCallbackStubProxy.width() / (Math.tan(Math.toRadians(isduplex.onTransact())) / this.IAuthTabCallbackStubProxy.height()));
                if (isduplex.onNavigationEvent() == 0) {
                    fOnNavigationEvent = onNavigationEvent(-fWidth, fWidth, f);
                    int i3 = extraCallbackWithResult + 115;
                    readTypedObject = i3 % 128;
                    int i4 = i3 % 2;
                } else {
                    fOnNavigationEvent = onNavigationEvent(fWidth, -fWidth, f);
                }
            } else {
                fWidth = (float) (this.IAuthTabCallbackStubProxy.width() + (Math.tan(Math.toRadians(isduplex.onTransact())) * this.IAuthTabCallbackStubProxy.height()));
                if (isduplex.onNavigationEvent() == 0) {
                }
            }
            this.getInterfaceDescriptor.reset();
            this.getInterfaceDescriptor.setRotate(isduplex.onTransact(), this.IAuthTabCallbackStubProxy.width() / 2.0f, this.IAuthTabCallbackStubProxy.height() / 2.0f);
            this.getInterfaceDescriptor.postTranslate(fOnNavigationEvent, 0.0f);
            this.IAuthTabCallback.getShader().setLocalMatrix(this.getInterfaceDescriptor);
            canvas.drawRect(this.IAuthTabCallbackStubProxy, this.IAuthTabCallback);
        }
    }

    private final boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = readTypedObject + 23;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean z = !StringsKt.isBlank(this.onWarmupCompleted);
        int i4 = extraCallbackWithResult + 5;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public static /* synthetic */ Unit onNavigationEvent(ShimmerTextView shimmerTextView, float f) {
        return (Unit) IAuthTabCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 1410371811, new Object[]{shimmerTextView, Float.valueOf(f)}, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), -1410371811, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
    }

    private final void onExtraCallbackWithResult(isDuplex isduplex) {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        IAuthTabCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), -310083289, new Object[]{this, isduplex}, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, 310083290, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
    }
}
