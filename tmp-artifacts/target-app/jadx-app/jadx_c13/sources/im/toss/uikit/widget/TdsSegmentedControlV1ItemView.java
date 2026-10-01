package im.toss.uikit.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.zxing.datamatrix.encoder.C40Encoder;
import com.iap.android.mppclient.container.constant.JsParamKeys;
import im.toss.features.tosscert.ui.R;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.atom.text.Typography5;
import im.toss.uikit.widget.TdsSegmentedControlV1View;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import o.AppLovinSdkSettings;
import o.ConnectionPool;
import o.OkHttpClientCompanion;
import o.PostviewFormatValidatorExternalSyntheticLambda0;
import o.RequestBodyCompanion;
import o.SuspendAnimationKtExternalSyntheticLambda4;
import o.accessgetTlsVersionsAsStringp;
import o.authParams;
import o.deprecated_certificatePinner;
import o.eExternalSyntheticLambda0;
import o.getDelegateokhttp;
import o.getTcfVendorConsentStatus;
import o.head;
import o.isMuted;
import o.pin;
import o.response;
import o.setBodyokhttp;
import o.setConnectionSpecsokhttp;
import o.setDnsokhttp;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TdsSegmentedControlV1ItemView extends Typography5 {
    public static final onExtraCallbackWithResult Companion;
    private static int onActivityLayout = 0;
    private static int onActivityResized = 1;
    private static final setDnsokhttp onExtraCallback;
    private static int onMinimized = 0;
    private static int onPostMessage = 1;
    private TdsSegmentedControlV1View.onWarmupCompleted IAuthTabCallbackDefault;
    private TdsSegmentedControlV1View.onExtraCallback IAuthTabCallbackStub;
    private final List<List<Integer>> IAuthTabCallbackStubProxy;
    private final int IAuthTabCallback_Parcel;
    private boolean ICustomTabsCallback;
    private float access000;
    private final Paint access100;
    private final int asBinder;
    private float asInterface;
    private final float extraCallback;
    private boolean extraCallbackWithResult;
    private final int getInterfaceDescriptor;
    private final float onExtraCallbackWithResult;
    private final head onMessageChannelReady;
    private final Paint onNavigationEvent;
    private final int onTransact;
    private float onWarmupCompleted;
    private final List<Float> readTypedObject;
    private final List<Integer> writeTypedObject;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsSegmentedControlV1ItemView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsSegmentedControlV1ItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ Unit onExtraCallback(TdsSegmentedControlV1ItemView tdsSegmentedControlV1ItemView, float f, float f2, float f3) {
        int i = 2 % 2;
        int i2 = onMinimized + 33;
        onPostMessage = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(tdsSegmentedControlV1ItemView, f, f2, f3);
        }
        IAuthTabCallback(tdsSegmentedControlV1ItemView, f, f2, f3);
        throw null;
    }

    public static /* synthetic */ AppLovinSdkSettings onExtraCallbackWithResult(TdsSegmentedControlV1ItemView tdsSegmentedControlV1ItemView, boolean z) {
        int i = 2 % 2;
        int i2 = onMinimized + 63;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        AppLovinSdkSettings appLovinSdkSettingsIAuthTabCallback = IAuthTabCallback(tdsSegmentedControlV1ItemView, z);
        int i4 = onPostMessage + 29;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        return appLovinSdkSettingsIAuthTabCallback;
    }

    public static /* synthetic */ float onNavigationEvent(pin pinVar) {
        int i = 2 % 2;
        int i2 = onMinimized + 7;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        float fOnWarmupCompleted = onWarmupCompleted(pinVar);
        int i4 = onPostMessage + Imgproc.COLOR_YUV2RGB_YVYU;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        return fOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(TdsSegmentedControlV1ItemView tdsSegmentedControlV1ItemView, float f, float f2, float f3) {
        int i = 2 % 2;
        int i2 = onMinimized + 3;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {tdsSegmentedControlV1ItemView, Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3)};
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        if (i3 != 0) {
            return (Unit) onWarmupCompleted(-1637362365, C40Encoder.onExtraCallback(), objArr, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), 1637362365, iOnExtraCallback);
        }
        throw null;
    }

    private static final float onWarmupCompleted(pin pinVar) {
        int i = 2 % 2;
        int i2 = onMinimized + 93;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(pinVar, "");
        if (i3 != 0) {
            return 1.2f;
        }
        int i4 = 69 / 0;
        return 1.2f;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i;
        int i9 = ~(i7 | i8 | i6);
        int i10 = ~((~i6) | i8 | i5);
        int i11 = i9 | i10;
        int i12 = ~(i8 | i5);
        int i13 = (~(i6 | i7)) | (~(i7 | i)) | i10;
        int i14 = i5 + i + i2 + (1787548100 * i3) + (1101416392 * i4);
        int i15 = i14 * i14;
        int i16 = (((-61410478) * i5) - 623378432) + (561581232 * i) + (i11 * (-311495855)) + ((-311495855) * i12) + (311495855 * i13) + (250085376 * i2) + ((-778043392) * i3) + ((-46137344) * i4) + (324403200 * i15);
        int i17 = (i5 * (-930662234)) + 656878810 + (i * (-930660720)) + (i11 * (-757)) + (i12 * (-757)) + (i13 * 757) + (i2 * (-930661477)) + (i3 * 2052861356) + (i4 * 749768216) + (i15 * (-2028863488));
        return i16 + ((i17 * i17) * (-1850081280)) != 1 ? onExtraCallback(objArr) : onExtraCallbackWithResult(objArr);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TdsSegmentedControlV1ItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.readTypedObject = CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(17.0f), Float.valueOf(15.0f)});
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(6, displayMetrics);
        DisplayMetrics displayMetrics2 = getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        this.writeTypedObject = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(iOnNavigationEvent), Integer.valueOf(varyMatches.onNavigationEvent(3, displayMetrics2))});
        DisplayMetrics displayMetrics3 = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
        int iOnNavigationEvent2 = varyMatches.onNavigationEvent(8, displayMetrics3);
        DisplayMetrics displayMetrics4 = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics4, "");
        List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(iOnNavigationEvent2), Integer.valueOf(varyMatches.onNavigationEvent(10, displayMetrics4))});
        DisplayMetrics displayMetrics5 = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics5, "");
        int iOnNavigationEvent3 = varyMatches.onNavigationEvent(12, displayMetrics5);
        DisplayMetrics displayMetrics6 = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics6, "");
        this.IAuthTabCallbackStubProxy = CollectionsKt__CollectionsKt.listOf((Object[]) new List[]{listListOf, CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(iOnNavigationEvent3), Integer.valueOf(varyMatches.onNavigationEvent(13, displayMetrics6))})});
        DisplayMetrics displayMetrics7 = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics7, "");
        this.onTransact = varyMatches.onNavigationEvent(3, displayMetrics7);
        DisplayMetrics displayMetrics8 = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics8, "");
        this.asBinder = varyMatches.onNavigationEvent(-4, displayMetrics8);
        Intrinsics.checkNotNullExpressionValue(context.getResources().getDisplayMetrics(), "");
        this.onExtraCallbackWithResult = varyMatches.onNavigationEvent(3, r8);
        this.IAuthTabCallbackDefault = TdsSegmentedControlV1View.onWarmupCompleted.FIXED;
        this.IAuthTabCallbackStub = TdsSegmentedControlV1View.onExtraCallback.LARGE;
        Paint paint = new Paint();
        paint.setColor(OkHttpClientCompanion.onWarmupCompleted(this, eExternalSyntheticLambda0.RedDotFill));
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        this.onNavigationEvent = paint;
        this.onMessageChannelReady = new head(this, (View) null, false, new Function1() { // from class: im.toss.uikit.widget.TdsSegmentedControlV1ItemView$$ExternalSyntheticLambda1
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 9;
                onNavigationEvent = i3 % 128;
                Object obj2 = null;
                if (i3 % 2 == 0) {
                    TdsSegmentedControlV1ItemView.onExtraCallbackWithResult(this.f$0, ((Boolean) obj).booleanValue());
                    obj2.hashCode();
                    throw null;
                }
                AppLovinSdkSettings appLovinSdkSettingsOnExtraCallbackWithResult = TdsSegmentedControlV1ItemView.onExtraCallbackWithResult(this.f$0, ((Boolean) obj).booleanValue());
                int i4 = onWarmupCompleted + 41;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    return appLovinSdkSettingsOnExtraCallbackWithResult;
                }
                obj2.hashCode();
                throw null;
            }
        }, 6, (DefaultConstructorMarker) null);
        this.getInterfaceDescriptor = OkHttpClientCompanion.onWarmupCompleted(this, eExternalSyntheticLambda0.SegmentedControlItemGradientLayerFillGradientStart);
        this.IAuthTabCallback_Parcel = OkHttpClientCompanion.onWarmupCompleted(this, eExternalSyntheticLambda0.SegmentedControlItemGradientLayerFillGradientEnd);
        this.extraCallback = 0.01f;
        this.access000 = 0.01f;
        this.access100 = new Paint(1);
        setGravity(17);
        onNavigationEvent(response.Medium);
        int iOnNavigationEvent4 = RequestBodyCompanion.onNavigationEvent(this, authParams.TextTertiary);
        setTextColor(new ColorStateList(new int[][]{new int[]{R.attr.state_selected, R.attr.state_enabled}, new int[]{-16842910}, new int[0]}, new int[]{RequestBodyCompanion.onNavigationEvent(this, authParams.TextPrimary), setBodyokhttp.IAuthTabCallback(iOnNavigationEvent4, 0.5f), iOnNavigationEvent4}));
        onNavigationEvent(onExtraCallback);
        onExtraCallbackWithResult(ConnectionPool.onWarmupCompleted.onWarmupCompleted());
        onWarmupCompleted(varyMatches.onNavigationEvent(this, Float.valueOf(getTcfVendorConsentStatus.Companion.asBinder().onNavigationEvent(1.5f).onNavigationEvent(accessgetTlsVersionsAsStringp.Typography5.getSize()))));
        onWarmupCompleted(-2107971767, C40Encoder.onExtraCallback(), new Object[]{this, this.IAuthTabCallbackDefault, this.IAuthTabCallbackStub, true}, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), 2107971768, C40Encoder.onExtraCallback());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TdsSegmentedControlV1ItemView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = onMinimized + 13;
            int i4 = i3 % 128;
            onPostMessage = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 115;
            onMinimized = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 2 % 2;
            }
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i8 = 2 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public final void setTab(boolean z) {
        int i = 2 % 2;
        int i2 = onMinimized + 27;
        int i3 = i2 % 128;
        onPostMessage = i3;
        int i4 = i2 % 2;
        this.ICustomTabsCallback = z;
        int i5 = i3 + 119;
        onMinimized = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, im.toss.uikit.widget.TdsSegmentedControlV1ItemView] */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        ?? r0 = (TdsSegmentedControlV1ItemView) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        float fFloatValue2 = ((Number) objArr[2]).floatValue();
        float fFloatValue3 = ((Number) objArr[3]).floatValue();
        int i = 2 % 2;
        int i2 = onMinimized + 35;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        ((TdsSegmentedControlV1ItemView) r0).onWarmupCompleted = fFloatValue3;
        ((TdsSegmentedControlV1ItemView) r0).asInterface = RangesKt___RangesKt.coerceIn(PostviewFormatValidatorExternalSyntheticLambda0.IAuthTabCallback(fFloatValue, 0.5f, fFloatValue3), 0.0f, 1.0f);
        ((TdsSegmentedControlV1ItemView) r0).access000 = RangesKt___RangesKt.coerceAtLeast(PostviewFormatValidatorExternalSyntheticLambda0.IAuthTabCallback(fFloatValue2, 1.0f, fFloatValue3), ((TdsSegmentedControlV1ItemView) r0).extraCallback);
        r0.postInvalidateOnAnimation();
        Unit unit = Unit.INSTANCE;
        int i4 = onPostMessage + 41;
        onMinimized = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallback(TdsSegmentedControlV1ItemView tdsSegmentedControlV1ItemView, float f, float f2, float f3) {
        int i = 2 % 2;
        int i2 = onPostMessage + 119;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        tdsSegmentedControlV1ItemView.onWarmupCompleted = f3;
        tdsSegmentedControlV1ItemView.asInterface = RangesKt___RangesKt.coerceIn(PostviewFormatValidatorExternalSyntheticLambda0.IAuthTabCallback(0.0f, f, f3), 0.0f, 1.0f);
        tdsSegmentedControlV1ItemView.access000 = RangesKt___RangesKt.coerceAtLeast(PostviewFormatValidatorExternalSyntheticLambda0.IAuthTabCallback(tdsSegmentedControlV1ItemView.extraCallback, f2, f3), tdsSegmentedControlV1ItemView.extraCallback);
        tdsSegmentedControlV1ItemView.postInvalidateOnAnimation();
        Unit unit = Unit.INSTANCE;
        int i4 = onMinimized + 101;
        onPostMessage = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final AppLovinSdkSettings IAuthTabCallback(final TdsSegmentedControlV1ItemView tdsSegmentedControlV1ItemView, boolean z) {
        int i = 2 % 2;
        int i2 = onPostMessage + 65;
        onMinimized = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            float f = tdsSegmentedControlV1ItemView.onWarmupCompleted;
            final float f2 = tdsSegmentedControlV1ItemView.asInterface;
            final float f3 = tdsSegmentedControlV1ItemView.access000;
            if (!tdsSegmentedControlV1ItemView.isSelected() && z) {
                Object[] objArr = {(AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.asInterface()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), Float.valueOf(f), Float.valueOf(1.0f), new Function1() { // from class: im.toss.uikit.widget.TdsSegmentedControlV1ItemView$$ExternalSyntheticLambda2
                    private static int onExtraCallback = 1;
                    private static int onNavigationEvent;

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        int i3 = 2 % 2;
                        int i4 = onNavigationEvent + 17;
                        onExtraCallback = i4 % 128;
                        Object obj3 = null;
                        if (i4 % 2 == 0) {
                            TdsSegmentedControlV1ItemView.onNavigationEvent(this.f$0, f2, f3, ((Float) obj2).floatValue());
                            obj3.hashCode();
                            throw null;
                        }
                        Unit unitOnNavigationEvent = TdsSegmentedControlV1ItemView.onNavigationEvent(this.f$0, f2, f3, ((Float) obj2).floatValue());
                        int i5 = onExtraCallback + 3;
                        onNavigationEvent = i5 % 128;
                        if (i5 % 2 == 0) {
                            return unitOnNavigationEvent;
                        }
                        throw null;
                    }
                }, null, 8, null};
                return isMuted.asBinder((AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, objArr, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), (Float) null, Float.valueOf(0.9f), (Function1) null, 5, (Object) null);
            }
            Object[] objArr2 = {(AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.onNavigationEvent()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), Float.valueOf(f), Float.valueOf(0.0f), new Function1() { // from class: im.toss.uikit.widget.TdsSegmentedControlV1ItemView$$ExternalSyntheticLambda3
                private static int IAuthTabCallback = 0;
                private static int onExtraCallback = 1;

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    int i3 = 2 % 2;
                    int i4 = IAuthTabCallback + Imgproc.COLOR_YUV2RGB_YVYU;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    Unit unitOnExtraCallback = TdsSegmentedControlV1ItemView.onExtraCallback(this.f$0, f2, f3, ((Float) obj2).floatValue());
                    int i6 = IAuthTabCallback + 71;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                    return unitOnExtraCallback;
                }
            }, null, 8, null};
            AppLovinSdkSettings appLovinSdkSettingsAsBinder = isMuted.asBinder((AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, objArr2, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), (Float) null, Float.valueOf(1.0f), (Function1) null, 5, (Object) null);
            int i3 = onPostMessage + 73;
            onMinimized = i3 % 128;
            if (i3 % 2 == 0) {
                return appLovinSdkSettingsAsBinder;
            }
            throw null;
        }
        float f4 = tdsSegmentedControlV1ItemView.onWarmupCompleted;
        float f5 = tdsSegmentedControlV1ItemView.asInterface;
        float f6 = tdsSegmentedControlV1ItemView.access000;
        tdsSegmentedControlV1ItemView.isSelected();
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final float IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onPostMessage + 115;
        onMinimized = i2 % 128;
        float measuredWidth = (i2 % 2 != 0 ? getMeasuredWidth() : getMeasuredWidth()) * this.access000;
        int i3 = onMinimized + 75;
        onPostMessage = i3 % 128;
        if (i3 % 2 != 0) {
            return measuredWidth;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(TdsSegmentedControlV1ItemView tdsSegmentedControlV1ItemView, TdsSegmentedControlV1View.onWarmupCompleted onwarmupcompleted, TdsSegmentedControlV1View.onExtraCallback onextracallback, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            onwarmupcompleted = tdsSegmentedControlV1ItemView.IAuthTabCallbackDefault;
            int i3 = onMinimized + 107;
            onPostMessage = i3 % 128;
            int i4 = i3 % 2;
        }
        if ((i & 2) != 0) {
            int i5 = onMinimized + 89;
            int i6 = i5 % 128;
            onPostMessage = i6;
            int i7 = i5 % 2;
            onextracallback = tdsSegmentedControlV1ItemView.IAuthTabCallbackStub;
            int i8 = i6 + 27;
            onMinimized = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 4 / 3;
            }
        }
        if ((i & 4) != 0) {
            z = false;
        }
        onWarmupCompleted(-2107971767, C40Encoder.onExtraCallback(), new Object[]{tdsSegmentedControlV1ItemView, onwarmupcompleted, onextracallback, Boolean.valueOf(z)}, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), 2107971768, C40Encoder.onExtraCallback());
        int i10 = onPostMessage + 39;
        onMinimized = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 4 / 0;
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        boolean z = false;
        BaseTextView baseTextView = (TdsSegmentedControlV1ItemView) objArr[0];
        TdsSegmentedControlV1View.onWarmupCompleted onwarmupcompleted = (TdsSegmentedControlV1View.onWarmupCompleted) objArr[1];
        TdsSegmentedControlV1View.onExtraCallback onextracallback = (TdsSegmentedControlV1View.onExtraCallback) objArr[2];
        boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        Intrinsics.checkNotNullParameter(onextracallback, "");
        if (((TdsSegmentedControlV1ItemView) baseTextView).IAuthTabCallbackStub != onextracallback) {
            int i2 = onMinimized + 59;
            onPostMessage = i2 % 128;
            if (i2 % 2 != 0) {
                z = true;
            }
        }
        if (!(!zBooleanValue) || z) {
            ((TdsSegmentedControlV1ItemView) baseTextView).IAuthTabCallbackStub = onextracallback;
            baseTextView.setTextSize(2, ((TdsSegmentedControlV1ItemView) baseTextView).readTypedObject.get(onextracallback.ordinal()).floatValue());
            int i3 = onMinimized + 9;
            onPostMessage = i3 % 128;
            int i4 = i3 % 2;
        }
        if (!zBooleanValue) {
            int i5 = onMinimized;
            int i6 = i5 + 125;
            onPostMessage = i6 % 128;
            int i7 = i6 % 2;
            if (((TdsSegmentedControlV1ItemView) baseTextView).IAuthTabCallbackDefault == onwarmupcompleted) {
                int i8 = i5 + 81;
                onPostMessage = i8 % 128;
                int i9 = i8 % 2;
                if (!z) {
                    return null;
                }
            }
        }
        ((TdsSegmentedControlV1ItemView) baseTextView).IAuthTabCallbackDefault = onwarmupcompleted;
        baseTextView.setPadding(((TdsSegmentedControlV1ItemView) baseTextView).IAuthTabCallbackStubProxy.get(onwarmupcompleted.ordinal()).get(onextracallback.ordinal()).intValue(), ((TdsSegmentedControlV1ItemView) baseTextView).writeTypedObject.get(onextracallback.ordinal()).intValue(), ((TdsSegmentedControlV1ItemView) baseTextView).IAuthTabCallbackStubProxy.get(onwarmupcompleted.ordinal()).get(onextracallback.ordinal()).intValue(), ((TdsSegmentedControlV1ItemView) baseTextView).writeTypedObject.get(onextracallback.ordinal()).intValue());
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallbackWithResult(Canvas canvas) {
        int i = 2 % 2;
        if (getMeasuredWidth() > 0) {
            int i2 = onMinimized + 85;
            onPostMessage = i2 % 128;
            int i3 = i2 % 2;
            if (getMeasuredHeight() > 0) {
                float fIAuthTabCallback = IAuthTabCallback();
                Paint paint = this.access100;
                paint.setShader(new RadialGradient(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, IAuthTabCallback(), this.getInterfaceDescriptor, this.IAuthTabCallback_Parcel, Shader.TileMode.CLAMP));
                paint.setAlpha((int) (this.asInterface * 255.0f));
                Unit unit = Unit.INSTANCE;
                canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, fIAuthTabCallback, paint);
                int i4 = onPostMessage + 111;
                onMinimized = i4 % 128;
                int i5 = i4 % 2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IAuthTabCallback(Canvas canvas) {
        int i = 2 % 2;
        int i2 = onMinimized + 57;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        float fMeasureText = getPaint().measureText(getText().toString());
        int textSize = (int) getPaint().getTextSize();
        float fMin = Math.min((getMeasuredWidth() / 2.0f) + (fMeasureText / 2.0f), getMeasuredWidth() - getPaddingLeft());
        float f = this.onExtraCallbackWithResult;
        float f2 = this.onTransact;
        canvas.drawCircle(fMin + f + f2, ((getMeasuredHeight() / 2.0f) - (textSize / 2.0f)) + f + this.asBinder, f, this.onNavigationEvent);
        int i4 = onPostMessage + 103;
        onMinimized = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onTouchEvent(@NotNull MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = onMinimized + 109;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(motionEvent, "");
        this.onMessageChannelReady.onNavigationEvent(motionEvent);
        boolean zOnTouchEvent = super/*android.view.View*/.onTouchEvent(motionEvent);
        int i4 = onPostMessage + 77;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        return zOnTouchEvent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setPressed(boolean z) {
        int i = 2 % 2;
        int i2 = onMinimized + 93;
        onPostMessage = i2 % 128;
        if (i2 % 2 != 0) {
            super/*android.view.View*/.setPressed(z);
            this.onMessageChannelReady.onNavigationEvent(z);
        } else {
            super/*android.view.View*/.setPressed(z);
            this.onMessageChannelReady.onNavigationEvent(z);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setSelected(boolean z) {
        int i = 2 % 2;
        int i2 = onPostMessage + 99;
        onMinimized = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            super/*android.view.View*/.setSelected(z);
            if (isSelected()) {
                int i3 = onPostMessage + 51;
                onMinimized = i3 % 128;
                if (i3 % 2 == 0) {
                    onNavigationEvent(response.SemiBold);
                    return;
                } else {
                    onNavigationEvent(response.SemiBold);
                    throw null;
                }
            }
            onNavigationEvent(response.Medium);
            return;
        }
        super/*android.view.View*/.setSelected(z);
        isSelected();
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onInitializeAccessibilityNodeInfo(@NotNull AccessibilityNodeInfo accessibilityNodeInfo) {
        ViewGroup viewGroup;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(accessibilityNodeInfo, "");
        super/*android.view.View*/.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.extraCallbackWithResult) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", 새로운 업데이트");
        }
        ViewParent parent = getParent();
        Object obj = null;
        if (parent instanceof ViewGroup) {
            int i2 = onPostMessage;
            int i3 = i2 + 55;
            onMinimized = i3 % 128;
            if (i3 % 2 != 0) {
                viewGroup = (ViewGroup) parent;
                int i4 = 86 / 0;
            } else {
                viewGroup = (ViewGroup) parent;
            }
            int i5 = i2 + 39;
            onMinimized = i5 % 128;
            int i6 = i5 % 2;
        } else {
            viewGroup = null;
        }
        if (viewGroup != null) {
            int iIndexOfChild = viewGroup.indexOfChild(this);
            SuspendAnimationKtExternalSyntheticLambda4 suspendAnimationKtExternalSyntheticLambda4OnExtraCallbackWithResult = SuspendAnimationKtExternalSyntheticLambda4.onExtraCallbackWithResult(accessibilityNodeInfo);
            suspendAnimationKtExternalSyntheticLambda4OnExtraCallbackWithResult.onExtraCallback(SuspendAnimationKtExternalSyntheticLambda4.IAuthTabCallbackStub.onNavigationEvent(0, 1, iIndexOfChild, 1, false, isSelected()));
            if (isSelected()) {
                suspendAnimationKtExternalSyntheticLambda4OnExtraCallbackWithResult.IAuthTabCallbackStub(false);
                suspendAnimationKtExternalSyntheticLambda4OnExtraCallbackWithResult.onWarmupCompleted(SuspendAnimationKtExternalSyntheticLambda4.IAuthTabCallback.IAuthTabCallback);
            }
            if (!this.ICustomTabsCallback) {
                return;
            }
            int i7 = onPostMessage + 39;
            onMinimized = i7 % 128;
            int i8 = i7 % 2;
            Resources resources = getResources();
            if (i8 == 0) {
                suspendAnimationKtExternalSyntheticLambda4OnExtraCallbackWithResult.asBinder(resources.getString(com.google.android.material.R.string.item_view_role_description));
            } else {
                suspendAnimationKtExternalSyntheticLambda4OnExtraCallbackWithResult.asBinder(resources.getString(com.google.android.material.R.string.item_view_role_description));
                obj.hashCode();
                throw null;
            }
        }
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onExtraCallbackWithResult(defaultConstructorMarker);
        Function1 function1 = new Function1() { // from class: im.toss.uikit.widget.TdsSegmentedControlV1ItemView$$ExternalSyntheticLambda0
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 61;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                float fOnNavigationEvent = TdsSegmentedControlV1ItemView.onNavigationEvent((pin) obj);
                if (i3 == 0) {
                    return Float.valueOf(fOnNavigationEvent);
                }
                Float.valueOf(fOnNavigationEvent);
                throw null;
            }
        };
        getDelegateokhttp.onExtraCallback onextracallback = getDelegateokhttp.Companion;
        onExtraCallback = setConnectionSpecsokhttp.IAuthTabCallback(function1, 0.0f, onextracallback.onExtraCallbackWithResult(), onextracallback.IAuthTabCallback(), 2, (Object) null);
        int i = onActivityResized + 33;
        onActivityLayout = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDraw(@NotNull Canvas canvas) {
        int i = 2 % 2;
        int i2 = onPostMessage + 53;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(canvas, "");
        float scrollX = getScrollX();
        int iSave = canvas.save();
        canvas.translate(scrollX, 0.0f);
        try {
            onExtraCallbackWithResult(canvas);
            canvas.restoreToCount(iSave);
            super/*im.toss.tds.view.component.atom.text.LineHeightBasedTextView*/.onDraw(canvas);
            float scrollX2 = getScrollX();
            iSave = canvas.save();
            canvas.translate(scrollX2, 0.0f);
            try {
                if (!(!this.extraCallbackWithResult)) {
                    IAuthTabCallback(canvas);
                }
                canvas.restoreToCount(iSave);
                int i4 = onPostMessage + 83;
                onMinimized = i4 % 128;
                int i5 = i4 % 2;
            } finally {
            }
        } finally {
        }
    }

    private static final Unit onWarmupCompleted(TdsSegmentedControlV1ItemView tdsSegmentedControlV1ItemView, float f, float f2, float f3) {
        return (Unit) onWarmupCompleted(-1637362365, C40Encoder.onExtraCallback(), new Object[]{tdsSegmentedControlV1ItemView, Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3)}, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), 1637362365, C40Encoder.onExtraCallback());
    }

    public final void onExtraCallback(@NotNull TdsSegmentedControlV1View.onWarmupCompleted onwarmupcompleted, @NotNull TdsSegmentedControlV1View.onExtraCallback onextracallback, boolean z) {
        onWarmupCompleted(-2107971767, C40Encoder.onExtraCallback(), new Object[]{this, onwarmupcompleted, onextracallback, Boolean.valueOf(z)}, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), 2107971768, C40Encoder.onExtraCallback());
    }
}
