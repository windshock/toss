package im.toss.uikit.gradient.highlight;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import com.iap.android.mppclient.container.constant.JsParamKeys;
import im.toss.features.tosscert.ui.R;
import im.toss.features.verify.teensmanualselfie.impl.idcardupload.nav.TeensManualSelfieNavGraphKt$;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.uikit.gradient.highlight.TdsListHighLightBlinkV1View;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2;
import o.AppLovinSdkSettings;
import o.BrickModule;
import o.TextFieldPressGestureFilterKtExternalSyntheticLambda0;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.access13800;
import o.access14000;
import o.access14100;
import o.attachAppLovinSdk;
import o.deprecated_certificatePinner;
import o.findResAndMsg;
import o.formatMsgs;
import o.getAdService;
import o.getExtraParameters;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.isFireOS;
import o.isMuted;
import o.onLoadStarted;
import o.pxToDp;
import o.readIntokhttp;
import o.runOnUiThreadDelayed;
import o.sMaxAgeSeconds;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TdsListHighLightBlinkV1View extends View implements BrickModule {
    private static int access000 = 1;
    private static int getInterfaceDescriptor;
    private final int IAuthTabCallback;
    private final Paint IAuthTabCallbackDefault;
    private final RectF IAuthTabCallbackStub;
    private Rally IAuthTabCallbackStubProxy;
    private runOnUiThreadDelayed asBinder;
    private float asInterface;
    private final Lazy onExtraCallback;
    private final int onExtraCallbackWithResult;
    private final Paint onNavigationEvent;
    private Rally onTransact;
    private final RectF onWarmupCompleted;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsListHighLightBlinkV1View(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsListHighLightBlinkV1View(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ Unit IAuthTabCallback(TdsListHighLightBlinkV1View tdsListHighLightBlinkV1View, float f) {
        int i = 2 % 2;
        int i2 = access000 + 103;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            onTransact(tdsListHighLightBlinkV1View, f);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnTransact = onTransact(tdsListHighLightBlinkV1View, f);
        int i3 = access000 + 51;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        return unitOnTransact;
    }

    public static /* synthetic */ Unit onExtraCallback(TdsListHighLightBlinkV1View tdsListHighLightBlinkV1View, float f) {
        int i = 2 % 2;
        int i2 = access000 + 93;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {tdsListHighLightBlinkV1View, Float.valueOf(f)};
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        Unit unit = (Unit) onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), 678331377, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr, -678331377);
        int i4 = access000 + 47;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final int onExtraCallbackWithResult(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = getInterfaceDescriptor + 87;
        access000 = i4 % 128;
        return (i & 16777215) | (i4 % 2 == 0 ? i2 * 59 : i2 << 24);
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i4;
        int i8 = ~(i7 | i2);
        int i9 = ~(i6 | i2);
        int i10 = ~i6;
        int i11 = ~i2;
        int i12 = i8 | i9 | (~(i10 | i11 | i4));
        int i13 = i8 | (~(i7 | i6)) | i9;
        int i14 = (~(i2 | i4)) | (~(i10 | i2)) | (~(i7 | i11 | i6));
        int i15 = i4 + i6 + i + (1880080305 * i5) + (458392769 * i3);
        int i16 = i15 * i15;
        int i17 = ((766573918 * i4) - 2147483648) + (1582236324 * i6) + (i12 * (-407831203)) + (815662406 * i13) + ((-407831203) * i14) + (1174405120 * i) + (1711276032 * i5) + ((-973078528) * i3) + (68288512 * i16);
        int i18 = ((i4 * 319678698) - 2002258816) + (i6 * 319678284) + (i12 * 207) + (i13 * (-414)) + (i14 * 207) + (i * 319678491) + (i5 * (-161570901)) + (i3 * (-1160779685)) + (i16 * (-1109000192));
        int i19 = i17 + (i18 * i18 * (-1432485888));
        if (i19 == 1) {
            return onExtraCallback(objArr);
        }
        if (i19 != 2) {
            return i19 != 3 ? i19 != 4 ? i19 != 5 ? onWarmupCompleted(objArr) : onNavigationEvent(objArr) : IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr);
        }
        TdsListHighLightBlinkV1View tdsListHighLightBlinkV1View = (TdsListHighLightBlinkV1View) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int i20 = 2 % 2;
        int i21 = access000 + 71;
        getInterfaceDescriptor = i21 % 128;
        tdsListHighLightBlinkV1View.onNavigationEvent(i21 % 2 != 0 ? (int) (255.0f / fFloatValue) : (int) (fFloatValue * 255.0f));
        Unit unit = Unit.INSTANCE;
        int i22 = getInterfaceDescriptor + 47;
        access000 = i22 % 128;
        int i23 = i22 % 2;
        return unit;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 7;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        Unit unit = (Unit) onExtraCallbackWithResult(iIAuthTabCallback2, iIAuthTabCallback, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), -71467090, iIAuthTabCallback3, new Object[]{attachapplovinsdk}, 71467094);
        int i4 = getInterfaceDescriptor + 13;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(TdsListHighLightBlinkV1View tdsListHighLightBlinkV1View, View view) {
        int i = 2 % 2;
        int i2 = access000 + 47;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallback(tdsListHighLightBlinkV1View, view);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(tdsListHighLightBlinkV1View, view);
        int i3 = getInterfaceDescriptor + 73;
        access000 = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = access000 + 71;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(attachapplovinsdk);
        if (i3 != 0) {
            int i4 = 38 / 0;
        }
        int i5 = access000 + Imgproc.COLOR_YUV2RGB_YVYU;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ int[] onExtraCallbackWithResult(TdsListHighLightBlinkV1View tdsListHighLightBlinkV1View) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 111;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        int[] iArrOnExtraCallback = onExtraCallback(tdsListHighLightBlinkV1View);
        int i4 = access000 + 45;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return iArrOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(TdsListHighLightBlinkV1View tdsListHighLightBlinkV1View, float f) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 97;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {tdsListHighLightBlinkV1View, Float.valueOf(f)};
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        Unit unit = (Unit) onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), -739347621, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr, 739347623);
        int i4 = getInterfaceDescriptor + 11;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(TdsListHighLightBlinkV1View tdsListHighLightBlinkV1View, View view) {
        int i = 2 % 2;
        int i2 = access000 + 63;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(tdsListHighLightBlinkV1View, view);
        int i4 = getInterfaceDescriptor + 3;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = access000 + 89;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            return asBinder(attachapplovinsdk);
        }
        asBinder(attachapplovinsdk);
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(TdsListHighLightBlinkV1View tdsListHighLightBlinkV1View, float f) {
        int i = 2 % 2;
        int i2 = access000 + 11;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(tdsListHighLightBlinkV1View, f);
        if (i3 != 0) {
            int i4 = 74 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TdsListHighLightBlinkV1View(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Configuration configuration = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        int iAsBinder = new getUrlokhttp(new IAuthTabCallback(configuration)).asBinder();
        this.IAuthTabCallback = iAsBinder;
        Paint paint = new Paint();
        paint.setAlpha(0);
        this.IAuthTabCallbackDefault = paint;
        this.onExtraCallback = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: im.toss.uikit.gradient.highlight.TdsListHighLightBlinkV1View$$ExternalSyntheticLambda9
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 111;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                TdsListHighLightBlinkV1View tdsListHighLightBlinkV1View = this.f$0;
                if (i4 != 0) {
                    return TdsListHighLightBlinkV1View.onExtraCallbackWithResult(tdsListHighLightBlinkV1View);
                }
                TdsListHighLightBlinkV1View.onExtraCallbackWithResult(tdsListHighLightBlinkV1View);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        this.onExtraCallbackWithResult = 10;
        Paint paint2 = new Paint();
        paint2.setColor(iAsBinder);
        paint2.setAlpha(0);
        this.onNavigationEvent = paint2;
        this.IAuthTabCallbackStub = new RectF();
        this.onWarmupCompleted = new RectF();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TdsListHighLightBlinkV1View(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = getInterfaceDescriptor + 69;
            access000 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 2 / 2;
            } else {
                int i5 = 2 % 2;
            }
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i6 = access000;
            int i7 = i6 + 7;
            getInterfaceDescriptor = i7 % 128;
            int i8 = i7 % 2 != 0 ? 1 : 0;
            int i9 = i6 + 25;
            getInterfaceDescriptor = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 2 % 2;
            i = i8;
        }
        this(context, attributeSet, i);
    }

    public static final /* synthetic */ Rally IAuthTabCallback(TdsListHighLightBlinkV1View tdsListHighLightBlinkV1View) {
        int i = 2 % 2;
        int i2 = access000 + 79;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Rally rally = tdsListHighLightBlinkV1View.onTransact;
        if (i3 == 0) {
            return rally;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        TdsListHighLightBlinkV1View tdsListHighLightBlinkV1View = (TdsListHighLightBlinkV1View) objArr[0];
        runOnUiThreadDelayed runonuithreaddelayed = (runOnUiThreadDelayed) objArr[1];
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 77;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        tdsListHighLightBlinkV1View.asBinder = runonuithreaddelayed;
        int i5 = i2 + 123;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public static final /* synthetic */ void onExtraCallback(TdsListHighLightBlinkV1View tdsListHighLightBlinkV1View, Rally rally) {
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 57;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        tdsListHighLightBlinkV1View.onTransact = rally;
        int i5 = i2 + 23;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(TdsListHighLightBlinkV1View tdsListHighLightBlinkV1View, Rally rally) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 29;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        tdsListHighLightBlinkV1View.IAuthTabCallbackStubProxy = rally;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        TdsListHighLightBlinkV1View tdsListHighLightBlinkV1View = (TdsListHighLightBlinkV1View) objArr[0];
        View view = (View) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = access000 + 45;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            tdsListHighLightBlinkV1View.onExtraCallbackWithResult(view, iIntValue);
            throw null;
        }
        runOnUiThreadDelayed runonuithreaddelayedOnExtraCallbackWithResult = tdsListHighLightBlinkV1View.onExtraCallbackWithResult(view, iIntValue);
        int i3 = access000 + 27;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        return runonuithreaddelayedOnExtraCallbackWithResult;
    }

    public static final /* synthetic */ runOnUiThreadDelayed onNavigationEvent(TdsListHighLightBlinkV1View tdsListHighLightBlinkV1View) {
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 25;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        runOnUiThreadDelayed runonuithreaddelayed = tdsListHighLightBlinkV1View.asBinder;
        int i5 = i2 + 29;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 37 / 0;
        }
        return runonuithreaddelayed;
    }

    private final void onExtraCallbackWithResult(float f) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 9;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        this.asInterface = f;
        postInvalidateOnAnimation();
        int i4 = access000 + Imgproc.COLOR_YUV2RGBA_YVYU;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static final class onExtraCallback implements View.OnLayoutChangeListener {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ View onExtraCallback;
        final /* synthetic */ int onExtraCallbackWithResult;

        public onExtraCallback(View view, int i) {
            this.onExtraCallback = view;
            this.onExtraCallbackWithResult = i;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9 = 2 % 2;
            int i10 = IAuthTabCallback + 17;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
            view.removeOnLayoutChangeListener(this);
            TdsListHighLightBlinkV1View tdsListHighLightBlinkV1View = TdsListHighLightBlinkV1View.this;
            Object[] objArr = {tdsListHighLightBlinkV1View, this.onExtraCallback, Integer.valueOf(this.onExtraCallbackWithResult)};
            Object[] objArr2 = {tdsListHighLightBlinkV1View, isFireOS.onExtraCallbackWithResult((runOnUiThreadDelayed) TdsListHighLightBlinkV1View.onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), -2145004772, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr, 2145004777), false, 1, (Object) null)};
            TdsListHighLightBlinkV1View.onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), -38949907, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr2, 38949908);
            int i12 = IAuthTabCallback + 103;
            onNavigationEvent = i12 % 128;
            int i13 = i12 % 2;
        }
    }

    private final int[] onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 105;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        int[] iArr = (int[]) this.onExtraCallback.getValue();
        int i3 = access000 + 35;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 == 0) {
            return iArr;
        }
        throw null;
    }

    private static final int[] onExtraCallback(TdsListHighLightBlinkV1View tdsListHighLightBlinkV1View) {
        int[] iArr;
        int i = 2 % 2;
        int i2 = access000 + Imgproc.COLOR_YUV2RGB_YVYU;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            iArr = new int[]{tdsListHighLightBlinkV1View.onExtraCallbackWithResult(tdsListHighLightBlinkV1View.IAuthTabCallback, 1), tdsListHighLightBlinkV1View.onExtraCallbackWithResult(tdsListHighLightBlinkV1View.IAuthTabCallback, 115)};
        } else {
            iArr = new int[]{tdsListHighLightBlinkV1View.onExtraCallbackWithResult(tdsListHighLightBlinkV1View.IAuthTabCallback, 25), tdsListHighLightBlinkV1View.onExtraCallbackWithResult(tdsListHighLightBlinkV1View.IAuthTabCallback, 0)};
        }
        int i3 = access000 + 119;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        return iArr;
    }

    private final void onNavigationEvent(int i) {
        int i2 = 2 % 2;
        int i3 = access000 + 113;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 == 0) {
            this.IAuthTabCallbackDefault.setAlpha(i);
            postInvalidateOnAnimation();
            int i4 = getInterfaceDescriptor + 97;
            access000 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 87 / 0;
                return;
            }
            return;
        }
        this.IAuthTabCallbackDefault.setAlpha(i);
        postInvalidateOnAnimation();
        throw null;
    }

    private final void IAuthTabCallback(int i) {
        int i2 = 2 % 2;
        int i3 = access000 + 111;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        this.onNavigationEvent.setAlpha(i);
        postInvalidateOnAnimation();
        int i5 = access000 + 97;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final class IAuthTabCallback implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Configuration onExtraCallback;

        public IAuthTabCallback(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 35;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i4 = IAuthTabCallback + 81;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            int i6 = onWarmupCompleted + 91;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return getspecialfeatureoptinstatus;
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = access000 + 57;
        getInterfaceDescriptor = i6 % 128;
        int i7 = i6 % 2;
        super.onSizeChanged(i, i2, i3, i4);
        float f = i;
        sMaxAgeSeconds.IAuthTabCallback(this.IAuthTabCallbackDefault, f, f, onExtraCallbackWithResult(), new float[]{0.0f, 1.0f}, 0.0f, 0.0f, 48, (Object) null);
        this.IAuthTabCallbackStub.set(0.0f, 0.0f, f, f);
        this.onWarmupCompleted.set(0.0f, 0.0f, f, i2);
        int i8 = getInterfaceDescriptor + 103;
        access000 = i8 % 128;
        if (i8 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(TdsListHighLightBlinkV1View tdsListHighLightBlinkV1View, float f) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 75;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        tdsListHighLightBlinkV1View.IAuthTabCallback((int) (tdsListHighLightBlinkV1View.onExtraCallbackWithResult * f));
        Unit unit = Unit.INSTANCE;
        int i4 = access000 + 21;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 47;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(deprecated_certificatePinner.onExtraCallbackWithResult.onExtraCallbackWithResult());
        attachapplovinsdk.onExtraCallback(480);
        Unit unit = Unit.INSTANCE;
        int i4 = access000 + 89;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int i;
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
        int i2 = 2 % 2;
        int i3 = access000 + 103;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(deprecated_certificatePinner.onExtraCallbackWithResult.onExtraCallbackWithResult());
            i = 127;
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(deprecated_certificatePinner.onExtraCallbackWithResult.onExtraCallbackWithResult());
            i = 80;
        }
        attachapplovinsdk.onExtraCallback(i);
        Unit unit = Unit.INSTANCE;
        int i4 = getInterfaceDescriptor + 113;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onTransact(TdsListHighLightBlinkV1View tdsListHighLightBlinkV1View, float f) {
        int i = 2 % 2;
        int i2 = access000 + 71;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        tdsListHighLightBlinkV1View.onExtraCallbackWithResult(f);
        Unit unit = Unit.INSTANCE;
        int i4 = getInterfaceDescriptor + 65;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit asBinder(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 59;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(deprecated_certificatePinner.onExtraCallbackWithResult.IAuthTabCallbackStub());
        attachapplovinsdk.onExtraCallback(80);
        Unit unit = Unit.INSTANCE;
        int i4 = access000 + 115;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        TdsListHighLightBlinkV1View tdsListHighLightBlinkV1View = (TdsListHighLightBlinkV1View) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 61;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            tdsListHighLightBlinkV1View.onNavigationEvent((int) (255.0f % fFloatValue));
            tdsListHighLightBlinkV1View.IAuthTabCallback((int) (tdsListHighLightBlinkV1View.onExtraCallbackWithResult + fFloatValue));
        } else {
            tdsListHighLightBlinkV1View.onNavigationEvent((int) (255.0f * fFloatValue));
            tdsListHighLightBlinkV1View.IAuthTabCallback((int) (tdsListHighLightBlinkV1View.onExtraCallbackWithResult * fFloatValue));
        }
        tdsListHighLightBlinkV1View.postInvalidateOnAnimation();
        Unit unit = Unit.INSTANCE;
        int i3 = getInterfaceDescriptor + 39;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ View $itemView;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(View view, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$itemView = view;
        }

        public static /* synthetic */ Unit onWarmupCompleted(TdsListHighLightBlinkV1View tdsListHighLightBlinkV1View, View view) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 13;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnExtraCallback = onExtraCallback(tdsListHighLightBlinkV1View, view);
            if (i3 != 0) {
                int i4 = 73 / 0;
            }
            int i5 = onWarmupCompleted + 115;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return unitOnExtraCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = TdsListHighLightBlinkV1View.this.new onExtraCallbackWithResult(this.$itemView, access13800Var);
            int i2 = onNavigationEvent + 93;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return onextracallbackwithresult;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 73;
            onNavigationEvent = i2 % 128;
            findResAndMsg findresandmsg2 = findresandmsg;
            access13800<? super Unit> access13800Var2 = access13800Var;
            if (i2 % 2 == 0) {
                onExtraCallback(findresandmsg2, access13800Var2);
                throw null;
            }
            Object objOnExtraCallback = onExtraCallback(findresandmsg2, access13800Var2);
            int i3 = onNavigationEvent + 41;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 125;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((onExtraCallbackWithResult) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 1;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        private static final Unit onExtraCallback(TdsListHighLightBlinkV1View tdsListHighLightBlinkV1View, View view) {
            int i = 2 % 2;
            runOnUiThreadDelayed runonuithreaddelayedOnNavigationEvent = TdsListHighLightBlinkV1View.onNavigationEvent(tdsListHighLightBlinkV1View);
            if (runonuithreaddelayedOnNavigationEvent != null) {
                int i2 = onWarmupCompleted + 97;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0 ? runonuithreaddelayedOnNavigationEvent.postMessage() : !runonuithreaddelayedOnNavigationEvent.postMessage()) {
                    TdsListHighLightBlinkV1View.onExtraCallbackWithResult(tdsListHighLightBlinkV1View, isFireOS.onExtraCallbackWithResult((Rally) RallysKt.onWarmupCompleted(new Object[]{view, isMuted.asBinder((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.IAuthTabCallbackStub()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, Float.valueOf(1.0f), (Function1) null, 5, (Object) null), 0, null, 0, null, null, Boolean.FALSE, 0, 0L, false, 1916, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), false, 1, (Object) null));
                    int i3 = onNavigationEvent + 45;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 43;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                access14100.onExtraCallback();
                throw null;
            }
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                TdsListHighLightBlinkV1View tdsListHighLightBlinkV1View = TdsListHighLightBlinkV1View.this;
                Rally rally = (Rally) RallysKt.onWarmupCompleted(new Object[]{this.$itemView, isMuted.asBinder((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.onExtraCallbackWithResult()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, access14000.onExtraCallbackWithResult(1.02f), (Function1) null, 5, (Object) null), 0, null, 0, null, null, access14000.onNavigationEvent(false), 0, 0L, false, 1916, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
                final TdsListHighLightBlinkV1View tdsListHighLightBlinkV1View2 = TdsListHighLightBlinkV1View.this;
                final View view = this.$itemView;
                TdsListHighLightBlinkV1View.onExtraCallback(tdsListHighLightBlinkV1View, isFireOS.onExtraCallbackWithResult(Rally.onExtraCallbackWithResult(rally, (Object) null, new Function0() { // from class: im.toss.uikit.gradient.highlight.TdsListHighLightBlinkV1View$getHighLightRadialTimeline$1$1$$ExternalSyntheticLambda0
                    private static int onExtraCallback = 1;
                    private static int onNavigationEvent;

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i4 = 2 % 2;
                        int i5 = onNavigationEvent + 57;
                        onExtraCallback = i5 % 128;
                        int i6 = i5 % 2;
                        Unit unitOnWarmupCompleted = TdsListHighLightBlinkV1View.onExtraCallbackWithResult.onWarmupCompleted(tdsListHighLightBlinkV1View2, view);
                        int i7 = onNavigationEvent + 3;
                        onExtraCallback = i7 % 128;
                        if (i7 % 2 != 0) {
                            return unitOnWarmupCompleted;
                        }
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                }, 1, (Object) null), false, 1, (Object) null));
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(300L, this) == objOnExtraCallback) {
                    int i4 = onWarmupCompleted + 5;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    return objOnExtraCallback;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            Rally rallyIAuthTabCallback = TdsListHighLightBlinkV1View.IAuthTabCallback(TdsListHighLightBlinkV1View.this);
            if (rallyIAuthTabCallback != null) {
                rallyIAuthTabCallback.ICustomTabsServiceStub();
            }
            return Unit.INSTANCE;
        }
    }

    private static final Unit onExtraCallback(TdsListHighLightBlinkV1View tdsListHighLightBlinkV1View, View view) {
        int i = 2 % 2;
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(tdsListHighLightBlinkV1View);
        if (textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult != null) {
            int i2 = access000 + 99;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent = TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult);
            if (textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent != null) {
                onLoadStarted.onExtraCallback(textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent, null, null, tdsListHighLightBlinkV1View.new onExtraCallbackWithResult(view, null), 3, null);
            }
        }
        Unit unit = Unit.INSTANCE;
        int i4 = access000 + 7;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 68 / 0;
        }
        return unit;
    }

    private final runOnUiThreadDelayed onExtraCallbackWithResult(final View view, int i) {
        int i2 = 2 % 2;
        AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent = isMuted.onNavigationEvent(isMuted.onNavigationEvent(isMuted.onNavigationEvent(new AppLovinSdkSettings(), 0.0f, 1.0f, new Function1() { // from class: im.toss.uikit.gradient.highlight.TdsListHighLightBlinkV1View$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i3 = 2 % 2;
                int i4 = onWarmupCompleted + 79;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                Unit unitOnWarmupCompleted = TdsListHighLightBlinkV1View.onWarmupCompleted(this.f$0, ((Float) obj).floatValue());
                int i6 = onExtraCallbackWithResult + 61;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 31 / 0;
                }
                return unitOnWarmupCompleted;
            }
        }, new Function1() { // from class: im.toss.uikit.gradient.highlight.TdsListHighLightBlinkV1View$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i3 = 2 % 2;
                int i4 = IAuthTabCallback + 123;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                Unit unitOnExtraCallbackWithResult = TdsListHighLightBlinkV1View.onExtraCallbackWithResult((attachAppLovinSdk) obj);
                int i6 = IAuthTabCallback + 59;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 != 0) {
                    return unitOnExtraCallbackWithResult;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }), 0.0f, 1.0f, new Function1() { // from class: im.toss.uikit.gradient.highlight.TdsListHighLightBlinkV1View$$ExternalSyntheticLambda2
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i3 = 2 % 2;
                int i4 = onNavigationEvent + 77;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                Unit unitOnNavigationEvent = TdsListHighLightBlinkV1View.onNavigationEvent(this.f$0, ((Float) obj).floatValue());
                int i6 = onWarmupCompleted + 11;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                return unitOnNavigationEvent;
            }
        }, new Function1() { // from class: im.toss.uikit.gradient.highlight.TdsListHighLightBlinkV1View$$ExternalSyntheticLambda3
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i3 = 2 % 2;
                int i4 = IAuthTabCallback + 77;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
                int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
                int iIAuthTabCallback3 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
                Unit unit = (Unit) TdsListHighLightBlinkV1View.onExtraCallbackWithResult(iIAuthTabCallback2, iIAuthTabCallback, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), -844508168, iIAuthTabCallback3, new Object[]{(attachAppLovinSdk) obj}, 844508171);
                int i6 = onExtraCallback + 29;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 27 / 0;
                }
                return unit;
            }
        }), 0.0f, 1.0f, new Function1() { // from class: im.toss.uikit.gradient.highlight.TdsListHighLightBlinkV1View$$ExternalSyntheticLambda4
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i3 = 2 % 2;
                int i4 = onExtraCallbackWithResult + 83;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                Unit unitIAuthTabCallback = TdsListHighLightBlinkV1View.IAuthTabCallback(this.f$0, ((Float) obj).floatValue());
                int i6 = onWarmupCompleted + 57;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                return unitIAuthTabCallback;
            }
        }, new Function1() { // from class: im.toss.uikit.gradient.highlight.TdsListHighLightBlinkV1View$$ExternalSyntheticLambda5
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i3 = 2 % 2;
                int i4 = onWarmupCompleted + 79;
                onExtraCallbackWithResult = i4 % 128;
                attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) obj;
                if (i4 % 2 != 0) {
                    return TdsListHighLightBlinkV1View.onNavigationEvent(attachapplovinsdk);
                }
                TdsListHighLightBlinkV1View.onNavigationEvent(attachapplovinsdk);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        });
        AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{(AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.IAuthTabCallbackStub()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), Float.valueOf(1.0f), Float.valueOf(0.0f), new Function1() { // from class: im.toss.uikit.gradient.highlight.TdsListHighLightBlinkV1View$$ExternalSyntheticLambda6
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i3 = 2 % 2;
                int i4 = onNavigationEvent + 59;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    TdsListHighLightBlinkV1View.onExtraCallback(this.f$0, ((Float) obj).floatValue());
                    throw null;
                }
                Unit unitOnExtraCallback = TdsListHighLightBlinkV1View.onExtraCallback(this.f$0, ((Float) obj).floatValue());
                int i5 = IAuthTabCallback + 47;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    return unitOnExtraCallback;
                }
                throw null;
            }
        }, null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
        pxToDp.onWarmupCompleted onwarmupcompleted = pxToDp.onWarmupCompleted.IAuthTabCallback;
        Boolean bool = Boolean.FALSE;
        runOnUiThreadDelayed runonuithreaddelayedOnWarmupCompleted = runOnUiThreadDelayed.onWarmupCompleted(runOnUiThreadDelayed.IAuthTabCallbackDefault(RallysKt.onWarmupCompleted((View) null, onwarmupcompleted, CollectionsKt__CollectionsKt.listOf((Object[]) new Rally[]{(Rally) RallysKt.onWarmupCompleted(new Object[]{view, appLovinSdkSettingsOnNavigationEvent, 0, null, 0, null, null, bool, 0, 0L, false, 1916, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), (Rally) RallysKt.onWarmupCompleted(new Object[]{view, appLovinSdkSettings, 0, null, 0, null, null, bool, Integer.valueOf(i), 0L, false, 1660, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025)}), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, bool, 0, 0L, false, 3833, (Object) null), (Object) null, new Function0() { // from class: im.toss.uikit.gradient.highlight.TdsListHighLightBlinkV1View$$ExternalSyntheticLambda7
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = 2 % 2;
                int i4 = IAuthTabCallback + 9;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    TdsListHighLightBlinkV1View.onExtraCallbackWithResult(this.f$0, view);
                    throw null;
                }
                Unit unitOnExtraCallbackWithResult = TdsListHighLightBlinkV1View.onExtraCallbackWithResult(this.f$0, view);
                int i5 = onExtraCallbackWithResult + 97;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    return unitOnExtraCallbackWithResult;
                }
                throw null;
            }
        }, 1, (Object) null), (Object) null, new Function0() { // from class: im.toss.uikit.gradient.highlight.TdsListHighLightBlinkV1View$$ExternalSyntheticLambda8
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = 2 % 2;
                int i4 = onExtraCallback + 27;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                Unit unitOnNavigationEvent = TdsListHighLightBlinkV1View.onNavigationEvent(this.f$0, view);
                int i6 = onNavigationEvent + 9;
                onExtraCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    return unitOnNavigationEvent;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }, 1, (Object) null);
        int i3 = getInterfaceDescriptor + 111;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        return runonuithreaddelayedOnWarmupCompleted;
    }

    private static final Unit IAuthTabCallback(TdsListHighLightBlinkV1View tdsListHighLightBlinkV1View, View view) {
        int i = 2 % 2;
        Rally rally = tdsListHighLightBlinkV1View.onTransact;
        if (rally != null) {
            rally.updateVisuals();
        }
        Rally rally2 = tdsListHighLightBlinkV1View.IAuthTabCallbackStubProxy;
        if (rally2 != null) {
            int i2 = getInterfaceDescriptor + 81;
            access000 = i2 % 128;
            if (i2 % 2 == 0) {
                rally2.updateVisuals();
                throw null;
            }
            rally2.updateVisuals();
            int i3 = access000 + 123;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
        }
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        tdsListHighLightBlinkV1View.onTransact = null;
        tdsListHighLightBlinkV1View.IAuthTabCallbackStubProxy = null;
        return Unit.INSTANCE;
    }

    public void onExtraCallback() {
        int i = 2 % 2;
        runOnUiThreadDelayed runonuithreaddelayed = this.asBinder;
        if (runonuithreaddelayed != null) {
            int i2 = getInterfaceDescriptor + 119;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            runonuithreaddelayed.IAuthTabCallback();
            int i4 = getInterfaceDescriptor + 5;
            access000 = i4 % 128;
            int i5 = i4 % 2;
        }
        this.asBinder = null;
        int i6 = getInterfaceDescriptor + 7;
        access000 = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        int i = 2 % 2;
        int i2 = access000 + 87;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            super.onDetachedFromWindow();
            onExtraCallback();
        } else {
            super.onDetachedFromWindow();
            onExtraCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // android.view.View
    public void draw(@NotNull Canvas canvas) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 73;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(canvas, "");
        super.draw(canvas);
        int iSave = canvas.save();
        try {
            float fWidth = (this.IAuthTabCallbackStub.width() * (1.0f - this.asInterface)) / 2.0f;
            canvas.translate(fWidth, (-((this.IAuthTabCallbackStub.width() - getMeasuredHeight()) / 2.0f)) + fWidth);
            canvas.drawRect(0.0f, 0.0f, this.IAuthTabCallbackStub.width() * this.asInterface, this.IAuthTabCallbackStub.height() * this.asInterface, this.IAuthTabCallbackDefault);
            canvas.restoreToCount(iSave);
            canvas.drawRect(this.onWarmupCompleted, this.onNavigationEvent);
            int i4 = getInterfaceDescriptor + 81;
            access000 = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            canvas.restoreToCount(iSave);
            throw th;
        }
    }

    @Override // o.BrickModule
    public void onExtraCallback(@NotNull View view, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = access000 + 113;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        onExtraCallback();
        requestLayout();
        if (!isLaidOut() || !(!isLayoutRequested())) {
            addOnLayoutChangeListener(new onExtraCallback(view, i2));
            return;
        }
        int i6 = access000 + 5;
        getInterfaceDescriptor = i6 % 128;
        if (i6 % 2 != 0) {
            Object[] objArr = {this, view, Integer.valueOf(i2)};
            Object[] objArr2 = {this, isFireOS.onExtraCallbackWithResult((runOnUiThreadDelayed) onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), -2145004772, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr, 2145004777), false, 0, (Object) null)};
            onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), -38949907, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr2, 38949908);
            return;
        }
        Object[] objArr3 = {this, view, Integer.valueOf(i2)};
        Object[] objArr4 = {this, isFireOS.onExtraCallbackWithResult((runOnUiThreadDelayed) onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), -2145004772, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr3, 2145004777), false, 1, (Object) null)};
        onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), -38949907, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr4, 38949908);
    }

    public static /* synthetic */ Unit IAuthTabCallback(attachAppLovinSdk attachapplovinsdk) {
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Unit) onExtraCallbackWithResult(iIAuthTabCallback2, iIAuthTabCallback, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), -844508168, iIAuthTabCallback3, new Object[]{attachapplovinsdk}, 844508171);
    }

    public static final /* synthetic */ runOnUiThreadDelayed onExtraCallback(TdsListHighLightBlinkV1View tdsListHighLightBlinkV1View, View view, int i) {
        Object[] objArr = {tdsListHighLightBlinkV1View, view, Integer.valueOf(i)};
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (runOnUiThreadDelayed) onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), -2145004772, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr, 2145004777);
    }

    public static final /* synthetic */ void onNavigationEvent(TdsListHighLightBlinkV1View tdsListHighLightBlinkV1View, runOnUiThreadDelayed runonuithreaddelayed) {
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        onExtraCallbackWithResult(iIAuthTabCallback2, iIAuthTabCallback, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), -38949907, iIAuthTabCallback3, new Object[]{tdsListHighLightBlinkV1View, runonuithreaddelayed}, 38949908);
    }

    private static final Unit asInterface(TdsListHighLightBlinkV1View tdsListHighLightBlinkV1View, float f) {
        Object[] objArr = {tdsListHighLightBlinkV1View, Float.valueOf(f)};
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Unit) onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), -739347621, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr, 739347623);
    }

    private static final Unit onWarmupCompleted(attachAppLovinSdk attachapplovinsdk) {
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Unit) onExtraCallbackWithResult(iIAuthTabCallback2, iIAuthTabCallback, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), -71467090, iIAuthTabCallback3, new Object[]{attachapplovinsdk}, 71467094);
    }

    private static final Unit IAuthTabCallbackDefault(TdsListHighLightBlinkV1View tdsListHighLightBlinkV1View, float f) {
        Object[] objArr = {tdsListHighLightBlinkV1View, Float.valueOf(f)};
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Unit) onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), 678331377, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr, -678331377);
    }
}
