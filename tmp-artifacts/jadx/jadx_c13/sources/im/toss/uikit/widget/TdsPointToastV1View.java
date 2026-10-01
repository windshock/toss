package im.toss.uikit.widget;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Interpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.iap.android.mppclient.container.constant.JsParamKeys;
import im.toss.features.home.ui.view.currency.CurrencyCalculatorActivity;
import im.toss.features.tosscert.ui.R;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.atom.text.SubTypography8;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import java.lang.reflect.Method;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.AFj1ySDKAFa1ySDK;
import o.Address;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2;
import o.AppLovinSdkSettings;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.Cacheurls1;
import o.M_;
import o.TextFieldPressGestureFilterKtExternalSyntheticLambda0;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.VideoEncoderInfoImplExternalSyntheticLambda0;
import o.access13800;
import o.access14000;
import o.access14100;
import o.access15300;
import o.deprecated_certificatePinner;
import o.deprecated_dns;
import o.findResAndMsg;
import o.formatMsgs;
import o.generateLink;
import o.getAdService;
import o.getExtraParameters;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.getVersionCode;
import o.hasVaryAll;
import o.isFireOS;
import o.isMuted;
import o.isOneShot;
import o.nSetPosition;
import o.noStore;
import o.onLoadStarted;
import o.pxToDp;
import o.readIntokhttp;
import o.response;
import o.runOnUiThreadDelayed;
import o.setHasUserConsent;
import o.setVisitUrl;
import o.varyMatches;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TdsPointToastV1View extends ConstraintLayout {
    private static int asInterface = 0;
    private static int onTransact = 1;
    private final AFj1ySDKAFa1ySDK IAuthTabCallback;
    private final Lazy IAuthTabCallbackStub;
    private long onExtraCallback;
    private long onExtraCallbackWithResult;
    private runOnUiThreadDelayed onNavigationEvent;
    private final Lazy onWarmupCompleted;

    public static /* synthetic */ Unit IAuthTabCallback(TdsPointToastV1View tdsPointToastV1View, float f) {
        int i = 2 % 2;
        int i2 = asInterface + Imgproc.COLOR_YUV2RGBA_YVYU;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onWarmupCompleted(new Object[]{tdsPointToastV1View, Float.valueOf(f)}, nSetPosition.onExtraCallbackWithResult(), -1581741907, nSetPosition.onExtraCallbackWithResult(), 1581741913, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult());
        int i4 = onTransact + Imgproc.COLOR_YUV2RGB_YVYU;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 57 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(TdsPointToastV1View tdsPointToastV1View, long j, long j2) {
        int i = 2 % 2;
        int i2 = onTransact + 75;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(tdsPointToastV1View, j, j2);
        int i4 = onTransact + 107;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onTransact + 57;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            ICustomTabsCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iICustomTabsCallback = ICustomTabsCallback();
        int i3 = asInterface + 67;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return Integer.valueOf(iICustomTabsCallback);
    }

    public static /* synthetic */ boolean onNavigationEvent(TdsPointToastV1View tdsPointToastV1View) {
        int i = 2 % 2;
        int i2 = onTransact + 11;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallbackStub(tdsPointToastV1View);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zIAuthTabCallbackStub = IAuthTabCallbackStub(tdsPointToastV1View);
        int i3 = onTransact + 57;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return zIAuthTabCallbackStub;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        TdsPointToastV1View tdsPointToastV1View = (TdsPointToastV1View) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = onTransact + 19;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback(tdsPointToastV1View, zBooleanValue);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(tdsPointToastV1View, zBooleanValue);
        int i3 = onTransact + 27;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Object onWarmupCompleted(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~i4;
        int i9 = ~i5;
        int i10 = (~(i7 | i8 | i9)) | (~(i2 | i4));
        int i11 = ~(i5 | i4);
        int i12 = i10 | i11;
        int i13 = ~(i7 | i4);
        int i14 = i11 | i7 | (~(i8 | i9));
        int i15 = i2 + i4 + i6 + (1349231875 * i) + (1735201104 * i3);
        int i16 = i15 * i15;
        int i17 = ((-413510627) * i2) + 1558183936 + (237349861 * i4) + (i12 * 325430244) + (325430244 * i13) + ((-325430244) * i14) + ((-88080384) * i6) + ((-1337982976) * i) + (469762048 * i3) + (1272971264 * i16);
        int i18 = ((i2 * 236314795) - 374860141) + (i4 * 236313123) + (i12 * (-836)) + (i13 * (-836)) + (i14 * 836) + (i6 * 236313959) + (i * (-66979019)) + (i3 * (-1872492752)) + (i16 * (-417333248));
        switch (i17 + (i18 * i18 * 639631360)) {
            case 1:
                return onWarmupCompleted(objArr);
            case 2:
                TdsPointToastV1View tdsPointToastV1View = (TdsPointToastV1View) objArr[0];
                int i19 = 2 % 2;
                int i20 = onTransact + 53;
                asInterface = i20 % 128;
                int i21 = i20 % 2;
                TdsImageView tdsImageView = tdsPointToastV1View.IAuthTabCallback.onWarmupCompleted;
                Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
                int i22 = onTransact + 21;
                asInterface = i22 % 128;
                int i23 = i22 % 2;
                return tdsImageView;
            case 3:
                TdsPointToastV1View tdsPointToastV1View2 = (TdsPointToastV1View) objArr[0];
                int i24 = 2 % 2;
                int i25 = asInterface + 69;
                onTransact = i25 % 128;
                int i26 = i25 % 2;
                SubTypography8 subTypography8 = tdsPointToastV1View2.IAuthTabCallback.onTransact;
                Intrinsics.checkNotNullExpressionValue(subTypography8, "");
                int i27 = onTransact + 95;
                asInterface = i27 % 128;
                int i28 = i27 % 2;
                return subTypography8;
            case 4:
                return IAuthTabCallback(objArr);
            case 5:
                return onExtraCallbackWithResult(objArr);
            case 6:
                ConstraintLayout constraintLayout = (TdsPointToastV1View) objArr[0];
                float fFloatValue = ((Number) objArr[1]).floatValue();
                int i29 = 2 % 2;
                int color = Color.parseColor("#96DBFB");
                Context context = constraintLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                Configuration configuration = context.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration, "");
                ((TdsImageView) onWarmupCompleted(new Object[]{constraintLayout}, nSetPosition.onExtraCallbackWithResult(), -2091729634, nSetPosition.onExtraCallbackWithResult(), 2091729636, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult())).setImageTintList(ColorStateList.valueOf(new setHasUserConsent(color, new getUrlokhttp(new onActivityLayout(configuration)).asBinder()).IAuthTabCallback(fFloatValue).intValue()));
                Unit unit = Unit.INSTANCE;
                int i30 = onTransact + 93;
                asInterface = i30 % 128;
                int i31 = i30 % 2;
                return unit;
            case 7:
                return onExtraCallback(objArr);
            default:
                return onNavigationEvent(objArr);
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(TdsPointToastV1View tdsPointToastV1View, float f) {
        int i = 2 % 2;
        int i2 = onTransact + 23;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(tdsPointToastV1View, f);
        if (i3 != 0) {
            int i4 = 93 / 0;
        }
        int i5 = asInterface + 25;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static final class IAuthTabCallback_Parcel implements View.OnLayoutChangeListener {
        private static int IAuthTabCallbackDefault = 1;
        private static int onTransact;
        final /* synthetic */ long IAuthTabCallback;
        final /* synthetic */ int asInterface;
        final /* synthetic */ boolean onExtraCallback;
        final /* synthetic */ ViewGroup onExtraCallbackWithResult;
        final /* synthetic */ long onNavigationEvent;
        final /* synthetic */ long onWarmupCompleted;

        public IAuthTabCallback_Parcel(long j, boolean z, int i, long j2, long j3, ViewGroup viewGroup) {
            this.onWarmupCompleted = j;
            this.onExtraCallback = z;
            this.asInterface = i;
            this.IAuthTabCallback = j2;
            this.onNavigationEvent = j3;
            this.onExtraCallbackWithResult = viewGroup;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9 = 2 % 2;
            int i10 = onTransact + 57;
            IAuthTabCallbackDefault = i10 % 128;
            int i11 = i10 % 2;
            view.removeOnLayoutChangeListener(this);
            TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(TdsPointToastV1View.this);
            if (textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult != null) {
                int i12 = onTransact + 99;
                IAuthTabCallbackDefault = i12 % 128;
                if (i12 % 2 == 0) {
                    TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent = TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult);
                if (textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent != null) {
                    onLoadStarted.onExtraCallback(textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent, null, null, new extraCallback(this.onWarmupCompleted, TdsPointToastV1View.this, this.onExtraCallback, this.asInterface, this.IAuthTabCallback, this.onNavigationEvent, this.onExtraCallbackWithResult, null), 3, null);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private TdsPointToastV1View(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AFj1ySDKAFa1ySDK aFj1ySDKAFa1ySDKIAuthTabCallback = AFj1ySDKAFa1ySDK.IAuthTabCallback(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(aFj1ySDKAFa1ySDKIAuthTabCallback, "");
        this.IAuthTabCallback = aFj1ySDKAFa1ySDKIAuthTabCallback;
        this.IAuthTabCallbackStub = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: im.toss.uikit.widget.TdsPointToastV1View$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 45;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    return Integer.valueOf(((Integer) TdsPointToastV1View.onWarmupCompleted(new Object[0], nSetPosition.onExtraCallbackWithResult(), 2128897978, nSetPosition.onExtraCallbackWithResult(), -2128897978, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult())).intValue());
                }
                int i4 = 19 / 0;
                return Integer.valueOf(((Integer) TdsPointToastV1View.onWarmupCompleted(new Object[0], nSetPosition.onExtraCallbackWithResult(), 2128897978, nSetPosition.onExtraCallbackWithResult(), -2128897978, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult())).intValue());
            }
        });
        this.onWarmupCompleted = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: im.toss.uikit.widget.TdsPointToastV1View$$ExternalSyntheticLambda3
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 33;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Boolean boolValueOf = Boolean.valueOf(TdsPointToastV1View.onNavigationEvent(this.f$0));
                int i5 = IAuthTabCallback + 99;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return boolValueOf;
            }
        });
        this.onExtraCallbackWithResult = 1500L;
        this.onExtraCallback = 3000L;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* synthetic */ TdsPointToastV1View(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = asInterface + 87;
            onTransact = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 95 / 0;
            }
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i5 = onTransact + 15;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        TdsPointToastV1View tdsPointToastV1View = (TdsPointToastV1View) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        long jLongValue2 = ((Number) objArr[2]).longValue();
        int iIntValue = ((Number) objArr[3]).intValue();
        boolean zBooleanValue = ((Boolean) objArr[4]).booleanValue();
        int i = 2 % 2;
        int i2 = asInterface + 97;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        runOnUiThreadDelayed runonuithreaddelayedOnWarmupCompleted = tdsPointToastV1View.onWarmupCompleted(jLongValue, jLongValue2, iIntValue, zBooleanValue);
        int i4 = onTransact + 103;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 80 / 0;
        }
        return runonuithreaddelayedOnWarmupCompleted;
    }

    public static final /* synthetic */ AFj1ySDKAFa1ySDK IAuthTabCallback(TdsPointToastV1View tdsPointToastV1View) {
        int i = 2 % 2;
        int i2 = asInterface + 47;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        AFj1ySDKAFa1ySDK aFj1ySDKAFa1ySDK = tdsPointToastV1View.IAuthTabCallback;
        int i5 = i3 + 95;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return aFj1ySDKAFa1ySDK;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ runOnUiThreadDelayed IAuthTabCallback(TdsPointToastV1View tdsPointToastV1View, int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 5;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        runOnUiThreadDelayed runonuithreaddelayedOnNavigationEvent = tdsPointToastV1View.onNavigationEvent(i);
        int i5 = onTransact + 5;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 14 / 0;
        }
        return runonuithreaddelayedOnNavigationEvent;
    }

    public static final /* synthetic */ runOnUiThreadDelayed IAuthTabCallbackDefault(TdsPointToastV1View tdsPointToastV1View) {
        int i = 2 % 2;
        int i2 = asInterface + 123;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            tdsPointToastV1View.IAuthTabCallback_Parcel();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        runOnUiThreadDelayed runonuithreaddelayedIAuthTabCallback_Parcel = tdsPointToastV1View.IAuthTabCallback_Parcel();
        int i3 = onTransact + 83;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return runonuithreaddelayedIAuthTabCallback_Parcel;
    }

    public static final /* synthetic */ TdsRollingNumberV1View onExtraCallback(TdsPointToastV1View tdsPointToastV1View) {
        int i = 2 % 2;
        int i2 = asInterface + Imgproc.COLOR_YUV2RGBA_YVYU;
        onTransact = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            tdsPointToastV1View.IAuthTabCallbackStub();
            throw null;
        }
        TdsRollingNumberV1View tdsRollingNumberV1ViewIAuthTabCallbackStub = tdsPointToastV1View.IAuthTabCallbackStub();
        int i3 = onTransact + 91;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            return tdsRollingNumberV1ViewIAuthTabCallbackStub;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        TdsPointToastV1View tdsPointToastV1View = (TdsPointToastV1View) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 7;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        TdsRoundLayout tdsRoundLayoutAsBinder = tdsPointToastV1View.asBinder();
        int i4 = asInterface + 31;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return tdsRoundLayoutAsBinder;
        }
        throw null;
    }

    public static final /* synthetic */ void onExtraCallback(TdsPointToastV1View tdsPointToastV1View, runOnUiThreadDelayed runonuithreaddelayed) {
        int i = 2 % 2;
        int i2 = asInterface + 93;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        tdsPointToastV1View.onNavigationEvent = runonuithreaddelayed;
        int i5 = i3 + 125;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ runOnUiThreadDelayed onNavigationEvent(TdsPointToastV1View tdsPointToastV1View, int i, boolean z, int i2) {
        int i3 = 2 % 2;
        int i4 = asInterface + 73;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        runOnUiThreadDelayed runonuithreaddelayedOnWarmupCompleted = tdsPointToastV1View.onWarmupCompleted(i, z, i2);
        int i6 = asInterface + 23;
        onTransact = i6 % 128;
        if (i6 % 2 != 0) {
            return runonuithreaddelayedOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ runOnUiThreadDelayed onWarmupCompleted(TdsPointToastV1View tdsPointToastV1View) {
        int i = 2 % 2;
        int i2 = onTransact + 91;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        runOnUiThreadDelayed runonuithreaddelayed = tdsPointToastV1View.onNavigationEvent;
        if (i3 == 0) {
            return runonuithreaddelayed;
        }
        throw null;
    }

    public static final /* synthetic */ runOnUiThreadDelayed onWarmupCompleted(TdsPointToastV1View tdsPointToastV1View, boolean z) {
        int i = 2 % 2;
        int i2 = asInterface + 87;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        runOnUiThreadDelayed runonuithreaddelayed = (runOnUiThreadDelayed) onWarmupCompleted(new Object[]{tdsPointToastV1View, Boolean.valueOf(z)}, nSetPosition.onExtraCallbackWithResult(), -712344012, nSetPosition.onExtraCallbackWithResult(), 712344017, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult());
        int i4 = asInterface + 63;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return runonuithreaddelayed;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final int ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 115;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int iAsInterface = M_.onExtraCallback.asInterface();
        int i4 = asInterface + 99;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return iAsInterface;
    }

    private final int asInterface() {
        int i = 2 % 2;
        int i2 = asInterface + 43;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = ((Number) this.IAuthTabCallbackStub.getValue()).intValue();
        int i4 = onTransact + 119;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return iIntValue;
    }

    public static final class IAuthTabCallbackDefault implements getAdService {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public IAuthTabCallbackDefault(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 125;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i4 = onExtraCallback + 37;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            if (i5 != 0) {
                return getspecialfeatureoptinstatus;
            }
            throw null;
        }
    }

    public static final class IAuthTabCallbackStub implements getAdService {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Configuration onWarmupCompleted;

        public IAuthTabCallbackStub(Configuration configuration) {
            this.onWarmupCompleted = configuration;
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
        
            if (o.readIntokhttp.onExtraCallback(r4.onWarmupCompleted) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r4.onWarmupCompleted) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
        
            r1 = o.getSpecialFeatureOptInStatus.Dark;
            r2 = im.toss.uikit.widget.TdsPointToastV1View.IAuthTabCallbackStub.onNavigationEvent + 45;
            im.toss.uikit.widget.TdsPointToastV1View.IAuthTabCallbackStub.onExtraCallbackWithResult = r2 % 128;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 55;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 12 / 0;
            }
        }
    }

    public static final class IAuthTabCallbackStubProxy implements getAdService {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Configuration onExtraCallback;

        public IAuthTabCallbackStubProxy(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!(!readIntokhttp.onExtraCallback(this.onExtraCallback))) {
                int i2 = onWarmupCompleted + 79;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return getSpecialFeatureOptInStatus.Dark;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
            int i4 = onNavigationEvent + 73;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return getspecialfeatureoptinstatus;
            }
            throw null;
        }
    }

    public static final class ICustomTabsCallback implements getAdService {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Configuration onExtraCallback;

        public ICustomTabsCallback(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i2 = onExtraCallbackWithResult + 65;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            int i4 = onNavigationEvent + 31;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class access000 implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ Configuration onNavigationEvent;

        public access000(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (readIntokhttp.onExtraCallback(this.onNavigationEvent)) {
                int i2 = IAuthTabCallback + 105;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return getSpecialFeatureOptInStatus.Dark;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
            int i4 = IAuthTabCallback + 75;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class asBinder implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public asBinder(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
        
            return o.getSpecialFeatureOptInStatus.Dark;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
        
            r1 = o.getSpecialFeatureOptInStatus.Light;
            r2 = im.toss.uikit.widget.TdsPointToastV1View.asBinder.IAuthTabCallback + 67;
            im.toss.uikit.widget.TdsPointToastV1View.asBinder.onExtraCallback = r2 % 128;
            r2 = r2 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
        
            if ((!o.readIntokhttp.onExtraCallback(r4.onExtraCallbackWithResult)) != false) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r4.onExtraCallbackWithResult) != false) goto L9;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 79;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 43 / 0;
            }
        }
    }

    public static final class asInterface implements getAdService {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Configuration IAuthTabCallback;

        public asInterface(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 33;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                if (!(!readIntokhttp.onExtraCallback(this.IAuthTabCallback))) {
                    return getSpecialFeatureOptInStatus.Dark;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i3 = onExtraCallbackWithResult + 75;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                return getspecialfeatureoptinstatus;
            }
            readIntokhttp.onExtraCallback(this.IAuthTabCallback);
            throw null;
        }
    }

    public static final class extraCallbackWithResult implements getAdService {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onNavigationEvent;

        public extraCallbackWithResult(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 85;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onNavigationEvent)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i4 = onWarmupCompleted + 17;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            if (i5 == 0) {
                return getspecialfeatureoptinstatus;
            }
            throw null;
        }
    }

    public static final class getInterfaceDescriptor implements getAdService {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onExtraCallback;

        public getInterfaceDescriptor(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
        
            if ((r2 % 2) != 0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
        
            r0 = 28 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
        
            return o.getSpecialFeatureOptInStatus.Light;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r4.onExtraCallback) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r4.onExtraCallback) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
        
            r1 = o.getSpecialFeatureOptInStatus.Dark;
            r2 = im.toss.uikit.widget.TdsPointToastV1View.getInterfaceDescriptor.onNavigationEvent + 95;
            im.toss.uikit.widget.TdsPointToastV1View.getInterfaceDescriptor.onWarmupCompleted = r2 % 128;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 25;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 5 / 0;
            }
        }
    }

    public static final class onActivityLayout implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Configuration onExtraCallback;

        public onActivityLayout(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i2 = onNavigationEvent + 61;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            int i4 = IAuthTabCallback + 23;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class onExtraCallback implements getAdService {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Configuration IAuthTabCallback;

        public onExtraCallback(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.IAuthTabCallback)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i2 = onWarmupCompleted + 15;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            int i4 = onWarmupCompleted + 21;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return getspecialfeatureoptinstatus;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class onExtraCallbackWithResult implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onExtraCallbackWithResult(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 25;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i4 = onNavigationEvent + 81;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return getSpecialFeatureOptInStatus.Dark;
        }
    }

    public static final class onTransact implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onTransact(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 61;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            if (readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                int i4 = IAuthTabCallback + 37;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return getSpecialFeatureOptInStatus.Dark;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
            int i6 = onNavigationEvent + 119;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class onWarmupCompleted implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ Configuration onNavigationEvent;

        public onWarmupCompleted(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 53;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onNavigationEvent)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i4 = onExtraCallback + 7;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            int i6 = IAuthTabCallback + 37;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class readTypedObject implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public readTypedObject(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!(!readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult))) {
                int i2 = IAuthTabCallback + 29;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return getSpecialFeatureOptInStatus.Dark;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
            int i4 = IAuthTabCallback + 97;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 88 / 0;
            }
            return getspecialfeatureoptinstatus;
        }
    }

    private final ViewGroup IAuthTabCallback() {
        ConstraintLayout constraintLayout;
        int i = 2 % 2;
        int i2 = asInterface + 33;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            constraintLayout = this.IAuthTabCallback.onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            int i3 = 98 / 0;
        } else {
            constraintLayout = this.IAuthTabCallback.onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        }
        int i4 = onTransact + 99;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return constraintLayout;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class IAuthTabCallback {
        private static int $10 = 0;
        private static int $11 = 1;
        private static long IAuthTabCallback_Parcel = 5182738114717057383L;
        private static int access000 = 0;
        private static int getInterfaceDescriptor = 1;
        private long IAuthTabCallback;
        private onNavigationEvent IAuthTabCallbackDefault;
        private long IAuthTabCallbackStub;
        private boolean asBinder;
        private long asInterface;
        private String onExtraCallback;
        private long onExtraCallbackWithResult;
        private final Context onNavigationEvent;
        private int onTransact;
        private long onWarmupCompleted;

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
            int length = cArr.length;
            long[] jArr = new long[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i3 = $11 + 3;
                $10 = i3 % 128;
                int i4 = i3 % 2;
                int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.getDeadChar(0, 0), 24 - (ViewConfiguration.getTouchSlop() >> 8), Process.getGidForName(_UrlKt.FRAGMENT_ENCODE_SET) + 19628, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (IAuthTabCallback_Parcel ^ 5407414049857832247L);
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myPid() >> 22), 59 - Color.red(0), View.getDefaultSize(0, 0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr2 = new char[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i6 = $11 + Imgproc.COLOR_YUV2RGB_YVYU;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myTid() >> 22), 59 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), TextUtils.getTrimmedLength(_UrlKt.FRAGMENT_ENCODE_SET) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr2);
        }

        public IAuthTabCallback(@NotNull Context context) throws Throwable {
            Intrinsics.checkNotNullParameter(context, "");
            this.onNavigationEvent = context;
            this.IAuthTabCallbackDefault = onNavigationEvent.IMMEDIATE;
            Object[] objArr = new Object[1];
            a(new char[]{1080, 37615, 10674, 49217, 24335, 62877, 36029, 7154, 45691, 18695, 59359, 32413, 5565, 44156, 15204, 53697, 26767, 1880, 40549, 13679, 50149, 23194, 61709, 34820, 10043, 48620, 21664, 58186, 31307, 4319, 45044, 18082, 56607, 29775, 734, 39358, 12469, 53092, 26141, 64723, 35781, 8867, 47473, 20512, 61146, 34187, 7175, 43894, 16937, 55545, 30613, 3661, 42249, 15482, 51951, 24994, 63574, 38668, 11648, 50409, 21418, 60008}, 38603 - (ViewConfiguration.getScrollBarSize() >> 8), objArr);
            this.onExtraCallback = ((String) objArr[0]).intern();
            this.asBinder = true;
            this.IAuthTabCallback = 1500L;
            this.onWarmupCompleted = 1500L;
        }

        public final IAuthTabCallback onWarmupCompleted(long j) {
            int i = 2 % 2;
            int i2 = access000 + 93;
            int i3 = i2 % 128;
            getInterfaceDescriptor = i3;
            int i4 = i2 % 2;
            this.asInterface = j;
            int i5 = i3 + 31;
            access000 = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        public final IAuthTabCallback onExtraCallback(long j) {
            int i = 2 % 2;
            int i2 = access000;
            int i3 = i2 + 107;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
            this.IAuthTabCallbackStub = j;
            int i5 = i2 + 79;
            getInterfaceDescriptor = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 90 / 0;
            }
            return this;
        }

        public final IAuthTabCallback onExtraCallbackWithResult(@NotNull onNavigationEvent onnavigationevent) {
            int i = 2 % 2;
            int i2 = access000 + 119;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            this.IAuthTabCallbackDefault = onnavigationevent;
            int i4 = access000 + 11;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
            return this;
        }

        public final IAuthTabCallback onNavigationEvent(long j) {
            int i = 2 % 2;
            int i2 = access000 + 45;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            this.onExtraCallbackWithResult = j;
            if (i3 == 0) {
                int i4 = 98 / 0;
            }
            return this;
        }

        public final IAuthTabCallback IAuthTabCallback(boolean z) {
            int i = 2 % 2;
            int i2 = access000 + 83;
            int i3 = i2 % 128;
            getInterfaceDescriptor = i3;
            int i4 = i2 % 2;
            this.asBinder = z;
            if (i4 == 0) {
                throw null;
            }
            int i5 = i3 + 19;
            access000 = i5 % 128;
            if (i5 % 2 == 0) {
                return this;
            }
            throw null;
        }

        public final IAuthTabCallback onNavigationEvent(int i) {
            int i2 = 2 % 2;
            int i3 = getInterfaceDescriptor + 17;
            access000 = i3 % 128;
            int i4 = i3 % 2;
            this.onTransact = i;
            if (i4 == 0) {
                return this;
            }
            throw null;
        }

        public final IAuthTabCallback IAuthTabCallback(long j) {
            int i = 2 % 2;
            int i2 = access000 + 75;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            this.IAuthTabCallback = j;
            if (i3 != 0) {
                return this;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final IAuthTabCallback onExtraCallbackWithResult(long j) {
            int i = 2 % 2;
            int i2 = getInterfaceDescriptor + 55;
            int i3 = i2 % 128;
            access000 = i3;
            int i4 = i2 % 2;
            this.onWarmupCompleted = j;
            int i5 = i3 + 93;
            getInterfaceDescriptor = i5 % 128;
            if (i5 % 2 != 0) {
                return this;
            }
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0041 A[PHI: r2
          0x0041: PHI (r2v14 android.view.Window) = (r2v13 android.view.Window), (r2v16 android.view.Window) binds: [B:14:0x003f, B:11:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
        /* JADX WARN: Type inference failed for: r1v2, types: [android.view.View, im.toss.uikit.widget.TdsPointToastV1View] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void IAuthTabCallback() {
            View decorView;
            Window window;
            int i = 2 % 2;
            if (this.IAuthTabCallbackStub <= 0) {
                int i2 = access000 + 93;
                getInterfaceDescriptor = i2 % 128;
                int i3 = i2 % 2;
                if (this.onExtraCallbackWithResult <= 0) {
                    return;
                }
            }
            Activity activityIAuthTabCallback = hasVaryAll.IAuthTabCallback(this.onNavigationEvent);
            if (activityIAuthTabCallback != null) {
                int i4 = getInterfaceDescriptor + 105;
                access000 = i4 % 128;
                if (i4 % 2 != 0) {
                    window = activityIAuthTabCallback.getWindow();
                    int i5 = 76 / 0;
                    if (window != null) {
                        decorView = window.getDecorView();
                        int i6 = access000 + 45;
                        getInterfaceDescriptor = i6 % 128;
                        int i7 = i6 % 2;
                    } else {
                        decorView = null;
                    }
                } else {
                    window = activityIAuthTabCallback.getWindow();
                    if (window != null) {
                    }
                }
            }
            ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : 0;
            if (viewGroup != 0) {
                ?? tdsPointToastV1View = new TdsPointToastV1View(this.onNavigationEvent, null, 0, 6, null);
                long j = this.asInterface;
                long j2 = this.IAuthTabCallbackStub;
                long j3 = this.onExtraCallbackWithResult;
                String str = this.onExtraCallback;
                String string = tdsPointToastV1View.getContext().getString(this.IAuthTabCallbackDefault.getLabel());
                Intrinsics.checkNotNullExpressionValue(string, "");
                boolean z = this.asBinder;
                int i8 = this.onTransact;
                DisplayMetrics displayMetrics = tdsPointToastV1View.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
                tdsPointToastV1View.onNavigationEvent(viewGroup, j, j2, j3, str, string, z, varyMatches.onNavigationEvent(54, displayMetrics) + i8, this.IAuthTabCallback, this.onWarmupCompleted);
                viewGroup.addView(tdsPointToastV1View);
            }
        }
    }

    private final TdsImageView onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onTransact + 101;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullExpressionValue(this.IAuthTabCallback.IAuthTabCallback, "");
            throw null;
        }
        TdsImageView tdsImageView = this.IAuthTabCallback.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        int i3 = asInterface + 31;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return tdsImageView;
    }

    private final TdsImageView onExtraCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 33;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            TdsImageView tdsImageView = this.IAuthTabCallback.onExtraCallbackWithResult;
            Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
            return tdsImageView;
        }
        Intrinsics.checkNotNullExpressionValue(this.IAuthTabCallback.onExtraCallbackWithResult, "");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final TdsImageView onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onTransact + 119;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        TdsImageView tdsImageView = this.IAuthTabCallback.onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        int i4 = asInterface + 19;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return tdsImageView;
    }

    private final TdsRoundLayout asBinder() {
        int i = 2 % 2;
        int i2 = onTransact + 73;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            TdsRoundLayout tdsRoundLayout = this.IAuthTabCallback.IAuthTabCallbackDefault;
            Intrinsics.checkNotNullExpressionValue(tdsRoundLayout, "");
            return tdsRoundLayout;
        }
        Intrinsics.checkNotNullExpressionValue(this.IAuthTabCallback.IAuthTabCallbackDefault, "");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final TdsRollingNumberV1View IAuthTabCallbackStub() {
        TdsRollingNumberV1View tdsRollingNumberV1View;
        int i = 2 % 2;
        int i2 = asInterface + 35;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            tdsRollingNumberV1View = this.IAuthTabCallback.asInterface;
            Intrinsics.checkNotNullExpressionValue(tdsRollingNumberV1View, "");
            int i3 = 88 / 0;
        } else {
            tdsRollingNumberV1View = this.IAuthTabCallback.asInterface;
            Intrinsics.checkNotNullExpressionValue(tdsRollingNumberV1View, "");
        }
        int i4 = onTransact + 57;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return tdsRollingNumberV1View;
    }

    private final boolean access000() {
        int i = 2 % 2;
        int i2 = onTransact + 107;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            ((Boolean) this.onWarmupCompleted.getValue()).booleanValue();
            throw null;
        }
        boolean zBooleanValue = ((Boolean) this.onWarmupCompleted.getValue()).booleanValue();
        int i3 = onTransact + 35;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            return zBooleanValue;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final boolean IAuthTabCallbackStub(TdsPointToastV1View tdsPointToastV1View) {
        int i = 2 % 2;
        int i2 = onTransact + 125;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Resources resources = tdsPointToastV1View.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        boolean zIAuthTabCallback = generateLink.IAuthTabCallback(resources);
        int i4 = asInterface + Imgproc.COLOR_YUV2RGBA_YVYU;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return zIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = onTransact + 81;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        access100();
        IAuthTabCallbackStubProxy();
        int i4 = onTransact + Imgproc.COLOR_YUV2RGBA_YVYU;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void access100() {
        int i = 2 % 2;
        IAuthTabCallback().setLayoutParams(new ViewGroup.LayoutParams(asInterface() << 2, asInterface() << 2));
        onExtraCallbackWithResult().setLayoutParams(new ViewGroup.LayoutParams(asInterface() << 1, asInterface() << 1));
        onExtraCallback().setLayoutParams(new ViewGroup.LayoutParams(asInterface() << 1, asInterface() << 1));
        onNavigationEvent().setLayoutParams(new ViewGroup.LayoutParams(asInterface() << 1, asInterface() << 1));
        IAuthTabCallback().setTranslationX(asInterface() * (-1.5f));
        IAuthTabCallback().setTranslationY(asInterface() * (-2.0f));
        Iterator it = CollectionsKt__CollectionsKt.listOf((Object[]) new TdsImageView[]{onExtraCallbackWithResult(), onExtraCallback(), onNavigationEvent()}).iterator();
        while (it.hasNext()) {
            int i2 = asInterface + 85;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                TdsImageView tdsImageView = (TdsImageView) it.next();
                tdsImageView.setX(asInterface());
                tdsImageView.setY(asInterface());
                throw null;
            }
            TdsImageView tdsImageView2 = (TdsImageView) it.next();
            tdsImageView2.setX(asInterface());
            tdsImageView2.setY(asInterface());
        }
        onExtraCallbackWithResult().setTranslationX(asInterface() * 0.5f);
        onExtraCallback().setTranslationX(asInterface());
        onNavigationEvent().setTranslationX(asInterface() * 1.5f);
        onExtraCallbackWithResult().setTranslationY(asInterface() * 0.5f);
        onExtraCallback().setTranslationY(asInterface());
        onNavigationEvent().setTranslationY(asInterface() * 0.5f);
        int i3 = onTransact + 5;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 8 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = asInterface + 23;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        AFj1ySDKAFa1ySDK aFj1ySDKAFa1ySDK = this.IAuthTabCallback;
        if (access000()) {
            aFj1ySDKAFa1ySDK.IAuthTabCallbackDefault.setElevation(0.0f);
            TdsRoundLayout tdsRoundLayout = aFj1ySDKAFa1ySDK.IAuthTabCallbackDefault;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Configuration configuration = context.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            tdsRoundLayout.setBackgroundColor(new getUrlokhttp(new onExtraCallback(configuration)).access200());
        } else {
            TdsRoundLayout tdsRoundLayout2 = aFj1ySDKAFa1ySDK.IAuthTabCallbackDefault;
            Intrinsics.checkNotNullExpressionValue(getResources().getDisplayMetrics(), "");
            tdsRoundLayout2.setElevation(varyMatches.onNavigationEvent(11, r7));
            TdsRoundLayout tdsRoundLayout3 = aFj1ySDKAFa1ySDK.IAuthTabCallbackDefault;
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            Configuration configuration2 = context2.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration2, "");
            tdsRoundLayout3.setBackgroundColor(((Integer) getUrlokhttp.onNavigationEvent(new Object[]{new getUrlokhttp(new onExtraCallbackWithResult(configuration2))}, -1763178192, 1763178195, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult())).intValue());
            if (Build.VERSION.SDK_INT >= 28) {
                TdsRoundLayout tdsRoundLayout4 = aFj1ySDKAFa1ySDK.IAuthTabCallbackDefault;
                Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                Configuration configuration3 = context3.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration3, "");
                tdsRoundLayout4.setOutlineAmbientShadowColor(new getUrlokhttp(new onWarmupCompleted(configuration3)).onPostMessage());
                TdsRoundLayout tdsRoundLayout5 = aFj1ySDKAFa1ySDK.IAuthTabCallbackDefault;
                Context context4 = getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "");
                Configuration configuration4 = context4.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration4, "");
                tdsRoundLayout5.setOutlineSpotShadowColor(new getUrlokhttp(new onTransact(configuration4)).onPostMessage());
            }
        }
        aFj1ySDKAFa1ySDK.IAuthTabCallbackDefault.setCornerCircular(true);
        SubTypography8 subTypography8 = aFj1ySDKAFa1ySDK.onTransact;
        Intrinsics.checkNotNullExpressionValue(getResources().getDisplayMetrics(), "");
        subTypography8.onWarmupCompleted(varyMatches.onNavigationEvent(23, r7));
        TdsRollingNumberV1View tdsRollingNumberV1View = aFj1ySDKAFa1ySDK.asInterface;
        Intrinsics.checkNotNull(tdsRollingNumberV1View);
        int iOnTransact = varyMatches.onTransact(tdsRollingNumberV1View, 19);
        DisplayMetrics displayMetrics = tdsRollingNumberV1View.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        TdsRollingNumberV1View.setTextSize$default(tdsRollingNumberV1View, Math.min(iOnTransact, varyMatches.onNavigationEvent(23, displayMetrics)), false, false, 6, (Object) null);
        response responseVar = response.Bold;
        TdsRollingNumberV1View.setFont$default(tdsRollingNumberV1View, responseVar, false, false, 6, (Object) null);
        if (access000()) {
            Context context5 = tdsRollingNumberV1View.getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "");
            Configuration configuration5 = context5.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration5, "");
            TdsRollingNumberV1View.setTextColor$default(tdsRollingNumberV1View, ((Integer) getUrlokhttp.onNavigationEvent(new Object[]{new getUrlokhttp(new asInterface(configuration5))}, -1763178192, 1763178195, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult())).intValue(), false, false, 6, (Object) null);
            int i4 = asInterface + 71;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
        } else {
            Context context6 = tdsRollingNumberV1View.getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "");
            Configuration configuration6 = context6.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration6, "");
            TdsRollingNumberV1View.setTextColor$default(tdsRollingNumberV1View, new getUrlokhttp(new IAuthTabCallbackDefault(configuration6)).onUnminimized(), false, false, 6, (Object) null);
        }
        TdsRollingNumberV1View tdsRollingNumberV1View2 = aFj1ySDKAFa1ySDK.IAuthTabCallbackStubProxy;
        Intrinsics.checkNotNull(tdsRollingNumberV1View2);
        int iOnTransact2 = varyMatches.onTransact(tdsRollingNumberV1View2, 19);
        DisplayMetrics displayMetrics2 = tdsRollingNumberV1View2.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        TdsRollingNumberV1View.setTextSize$default(tdsRollingNumberV1View2, Math.min(iOnTransact2, varyMatches.onNavigationEvent(23, displayMetrics2)), false, false, 6, (Object) null);
        TdsRollingNumberV1View.setFont$default(tdsRollingNumberV1View2, responseVar, false, false, 6, (Object) null);
        if (access000()) {
            Context context7 = tdsRollingNumberV1View2.getContext();
            Intrinsics.checkNotNullExpressionValue(context7, "");
            Configuration configuration7 = context7.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration7, "");
            TdsRollingNumberV1View.setTextColor$default(tdsRollingNumberV1View2, ((Integer) getUrlokhttp.onNavigationEvent(new Object[]{new getUrlokhttp(new IAuthTabCallbackStub(configuration7))}, -1763178192, 1763178195, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult())).intValue(), false, false, 6, (Object) null);
            return;
        }
        Context context8 = tdsRollingNumberV1View2.getContext();
        Intrinsics.checkNotNullExpressionValue(context8, "");
        Configuration configuration8 = context8.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration8, "");
        TdsRollingNumberV1View.setTextColor$default(tdsRollingNumberV1View2, new getUrlokhttp(new asBinder(configuration8)).onUnminimized(), false, false, 6, (Object) null);
    }

    static final class extraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ long $addAmount;
        final /* synthetic */ long $initAmount;
        final /* synthetic */ long $initialDelay;
        final /* synthetic */ ViewGroup $parent;
        final /* synthetic */ boolean $showGradientBg;
        final /* synthetic */ int $topDistance;
        int label;
        final /* synthetic */ TdsPointToastV1View this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        extraCallback(long j, TdsPointToastV1View tdsPointToastV1View, boolean z, int i, long j2, long j3, ViewGroup viewGroup, access13800<? super extraCallback> access13800Var) {
            super(2, access13800Var);
            this.$initialDelay = j;
            this.this$0 = tdsPointToastV1View;
            this.$showGradientBg = z;
            this.$topDistance = i;
            this.$initAmount = j2;
            this.$addAmount = j3;
            this.$parent = viewGroup;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            extraCallback extracallback = new extraCallback(this.$initialDelay, this.this$0, this.$showGradientBg, this.$topDistance, this.$initAmount, this.$addAmount, this.$parent, access13800Var);
            int i2 = onExtraCallback + 113;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 58 / 0;
            }
            return extracallback;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 111;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
            int i4 = onWarmupCompleted + 111;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 69;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((extraCallback) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 21;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onExtraCallback + 19;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0 ? i2 != 1 : i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                int i4 = onExtraCallback + 97;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 3 % 3;
                }
            } else {
                ResultKt.onNavigationEvent(obj);
                long j = this.$initialDelay;
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(j, this) == objOnExtraCallback) {
                    return objOnExtraCallback;
                }
            }
            int width = ((TdsRoundLayout) TdsPointToastV1View.onWarmupCompleted(new Object[]{this.this$0}, nSetPosition.onExtraCallbackWithResult(), 1157883390, nSetPosition.onExtraCallbackWithResult(), -1157883383, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult())).getWidth();
            int width2 = TdsPointToastV1View.IAuthTabCallback(this.this$0).IAuthTabCallbackStubProxy.getWidth() - TdsPointToastV1View.IAuthTabCallback(this.this$0).asInterface.getWidth();
            ((TdsRoundLayout) TdsPointToastV1View.onWarmupCompleted(new Object[]{this.this$0}, nSetPosition.onExtraCallbackWithResult(), 1157883390, nSetPosition.onExtraCallbackWithResult(), -1157883383, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult())).getLayoutParams().width = 0;
            ((TdsRoundLayout) TdsPointToastV1View.onWarmupCompleted(new Object[]{this.this$0}, nSetPosition.onExtraCallbackWithResult(), 1157883390, nSetPosition.onExtraCallbackWithResult(), -1157883383, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult())).getLayoutParams().height = ((TdsRoundLayout) TdsPointToastV1View.onWarmupCompleted(new Object[]{this.this$0}, nSetPosition.onExtraCallbackWithResult(), 1157883390, nSetPosition.onExtraCallbackWithResult(), -1157883383, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult())).getHeight();
            Object obj2 = null;
            if (this.$showGradientBg) {
                isFireOS.onExtraCallbackWithResult(TdsPointToastV1View.IAuthTabCallback(this.this$0, this.$topDistance), false, 1, (Object) null);
                runOnUiThreadDelayed runonuithreaddelayedOnWarmupCompleted = TdsPointToastV1View.onWarmupCompleted(this.this$0);
                if (runonuithreaddelayedOnWarmupCompleted != null) {
                    int i6 = onExtraCallback + 95;
                    onWarmupCompleted = i6 % 128;
                    if (i6 % 2 != 0) {
                        runonuithreaddelayedOnWarmupCompleted.onNavigationEvent();
                        throw null;
                    }
                    runonuithreaddelayedOnWarmupCompleted.onNavigationEvent();
                }
                TdsPointToastV1View tdsPointToastV1View = this.this$0;
                runOnUiThreadDelayed runonuithreaddelayedOnWarmupCompleted2 = RallysKt.onWarmupCompleted((View) null, pxToDp.IAuthTabCallback.onExtraCallback, CollectionsKt__CollectionsKt.listOf((Object[]) new runOnUiThreadDelayed[]{TdsPointToastV1View.IAuthTabCallbackDefault(tdsPointToastV1View), TdsPointToastV1View.onNavigationEvent(this.this$0, width, true, this.$topDistance), (runOnUiThreadDelayed) TdsPointToastV1View.onWarmupCompleted(new Object[]{this.this$0, Long.valueOf(this.$initAmount), Long.valueOf(this.$addAmount), Integer.valueOf(width2), true}, nSetPosition.onExtraCallbackWithResult(), -459761083, nSetPosition.onExtraCallbackWithResult(), 459761087, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult()), TdsPointToastV1View.onWarmupCompleted(this.this$0, true)}), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, access14000.onNavigationEvent(false), 0, 0L, false, 3833, (Object) null);
                final ViewGroup viewGroup = this.$parent;
                final TdsPointToastV1View tdsPointToastV1View2 = this.this$0;
                TdsPointToastV1View.onExtraCallback(tdsPointToastV1View, isFireOS.onExtraCallbackWithResult(runOnUiThreadDelayed.onWarmupCompleted(runonuithreaddelayedOnWarmupCompleted2, (Object) null, new Function0<Unit>() { // from class: im.toss.uikit.widget.TdsPointToastV1View.extraCallback.4
                    private static int IAuthTabCallback = 1;
                    private static int onNavigationEvent;

                    @Override // kotlin.jvm.functions.Function0
                    public /* synthetic */ Unit invoke() {
                        Unit unit;
                        int i7 = 2 % 2;
                        int i8 = IAuthTabCallback + 59;
                        onNavigationEvent = i8 % 128;
                        int i9 = i8 % 2;
                        onExtraCallback();
                        if (i9 != 0) {
                            unit = Unit.INSTANCE;
                            int i10 = 31 / 0;
                        } else {
                            unit = Unit.INSTANCE;
                        }
                        int i11 = onNavigationEvent + 113;
                        IAuthTabCallback = i11 % 128;
                        int i12 = i11 % 2;
                        return unit;
                    }

                    public final void onExtraCallback() {
                        int i7 = 2 % 2;
                        int i8 = onNavigationEvent + 1;
                        IAuthTabCallback = i8 % 128;
                        int i9 = i8 % 2;
                        viewGroup.removeView(tdsPointToastV1View2);
                        int i10 = onNavigationEvent + 37;
                        IAuthTabCallback = i10 % 128;
                        int i11 = i10 % 2;
                    }
                }, 1, (Object) null), false, 1, (Object) null));
            } else {
                runOnUiThreadDelayed runonuithreaddelayedOnWarmupCompleted3 = TdsPointToastV1View.onWarmupCompleted(this.this$0);
                if (runonuithreaddelayedOnWarmupCompleted3 != null) {
                    int i7 = onExtraCallback + 39;
                    onWarmupCompleted = i7 % 128;
                    if (i7 % 2 != 0) {
                        runonuithreaddelayedOnWarmupCompleted3.onNavigationEvent();
                        obj2.hashCode();
                        throw null;
                    }
                    runonuithreaddelayedOnWarmupCompleted3.onNavigationEvent();
                }
                TdsPointToastV1View tdsPointToastV1View3 = this.this$0;
                runOnUiThreadDelayed runonuithreaddelayedOnWarmupCompleted4 = RallysKt.onWarmupCompleted((View) null, pxToDp.IAuthTabCallback.onExtraCallback, CollectionsKt__CollectionsKt.listOf((Object[]) new runOnUiThreadDelayed[]{TdsPointToastV1View.onNavigationEvent(tdsPointToastV1View3, width, false, this.$topDistance), (runOnUiThreadDelayed) TdsPointToastV1View.onWarmupCompleted(new Object[]{this.this$0, Long.valueOf(this.$initAmount), Long.valueOf(this.$addAmount), Integer.valueOf(width2), false}, nSetPosition.onExtraCallbackWithResult(), -459761083, nSetPosition.onExtraCallbackWithResult(), 459761087, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult()), TdsPointToastV1View.onWarmupCompleted(this.this$0, false)}), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, access14000.onNavigationEvent(false), 0, 0L, false, 3833, (Object) null);
                final ViewGroup viewGroup2 = this.$parent;
                final TdsPointToastV1View tdsPointToastV1View4 = this.this$0;
                TdsPointToastV1View.onExtraCallback(tdsPointToastV1View3, isFireOS.onExtraCallbackWithResult(runOnUiThreadDelayed.onWarmupCompleted(runonuithreaddelayedOnWarmupCompleted4, (Object) null, new Function0<Unit>() { // from class: im.toss.uikit.widget.TdsPointToastV1View.extraCallback.2
                    private static int onNavigationEvent = 1;
                    private static int onWarmupCompleted;

                    @Override // kotlin.jvm.functions.Function0
                    public /* synthetic */ Unit invoke() {
                        Unit unit;
                        int i8 = 2 % 2;
                        int i9 = onNavigationEvent + 99;
                        onWarmupCompleted = i9 % 128;
                        int i10 = i9 % 2;
                        onExtraCallback();
                        if (i10 != 0) {
                            unit = Unit.INSTANCE;
                            int i11 = 19 / 0;
                        } else {
                            unit = Unit.INSTANCE;
                        }
                        int i12 = onNavigationEvent + 61;
                        onWarmupCompleted = i12 % 128;
                        if (i12 % 2 == 0) {
                            return unit;
                        }
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }

                    public final void onExtraCallback() {
                        int i8 = 2 % 2;
                        int i9 = onWarmupCompleted + 69;
                        onNavigationEvent = i9 % 128;
                        if (i9 % 2 == 0) {
                            viewGroup2.removeView(tdsPointToastV1View4);
                            throw null;
                        }
                        viewGroup2.removeView(tdsPointToastV1View4);
                        int i10 = onNavigationEvent + 113;
                        onWarmupCompleted = i10 % 128;
                        int i11 = i10 % 2;
                    }
                }, 1, (Object) null), false, 1, (Object) null));
            }
            return Unit.INSTANCE;
        }
    }

    private final runOnUiThreadDelayed onNavigationEvent(int i) {
        float f;
        int i2 = 2 % 2;
        Float fValueOf = Float.valueOf(0.02f);
        pxToDp.IAuthTabCallback iAuthTabCallback = pxToDp.IAuthTabCallback.onExtraCallback;
        ViewGroup viewGroupIAuthTabCallback = IAuthTabCallback();
        deprecated_certificatePinner deprecated_certificatepinner = deprecated_certificatePinner.onExtraCallbackWithResult;
        AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.IAuthTabCallbackStub()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368);
        if (access000()) {
            f = 0.1f;
        } else {
            int i3 = onTransact + 65;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            f = 0.3f;
        }
        runOnUiThreadDelayed runonuithreaddelayedOnExtraCallbackWithResult = isFireOS.onExtraCallbackWithResult(RallysKt.onWarmupCompleted((View) null, iAuthTabCallback, CollectionsKt__CollectionsKt.listOf((Object[]) new Rally[]{RallysKt.onWarmupCompleted(viewGroupIAuthTabCallback, CollectionsKt__CollectionsJVMKt.listOf(isMuted.onNavigationEvent(appLovinSdkSettings, Float.valueOf(0.0f), Float.valueOf(f), (Function1) null, 4, (Object) null)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null), RallysKt.onWarmupCompleted(onExtraCallbackWithResult(), CollectionsKt__CollectionsJVMKt.listOf(isMuted.getInterfaceDescriptor(isMuted.IAuthTabCallback_Parcel(isMuted.asBinder((AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, new Object[]{(AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.onNavigationEvent()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), Integer.valueOf(Imgproc.COLOR_BGR2YUV_YVYU)}, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()), (Float) null, fValueOf, (Function1) null, 5, (Object) null), (Float) null, Float.valueOf(asInterface()), (Function1) null, 5, (Object) null), (Float) null, Float.valueOf(asInterface()), (Function1) null, 5, (Object) null)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null), RallysKt.onWarmupCompleted(onExtraCallback(), CollectionsKt__CollectionsJVMKt.listOf(isMuted.asBinder((AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, new Object[]{(AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.onNavigationEvent()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), Integer.valueOf(Imgproc.COLOR_BGR2YUV_YVYU)}, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()), (Float) null, fValueOf, (Function1) null, 5, (Object) null)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null), RallysKt.onWarmupCompleted(onNavigationEvent(), CollectionsKt__CollectionsJVMKt.listOf(isMuted.getInterfaceDescriptor(isMuted.IAuthTabCallback_Parcel(isMuted.asBinder((AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, new Object[]{(AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.onNavigationEvent()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), Integer.valueOf(Imgproc.COLOR_BGR2YUV_YVYU)}, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()), (Float) null, fValueOf, (Function1) null, 5, (Object) null), (Float) null, Float.valueOf(asInterface()), (Function1) null, 5, (Object) null), (Float) null, Float.valueOf(asInterface()), (Function1) null, 5, (Object) null)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null), RallysKt.onWarmupCompleted(IAuthTabCallback(), CollectionsKt__CollectionsJVMKt.listOf(isMuted.onWarmupCompleted((AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 1045515484, new Object[]{(AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, new Object[]{new AppLovinSdkSettings().onWarmupCompleted(Address.onNavigationEvent.asBinder()), 80}, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()), 2000}, -1045515484, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()), (Float) null, Float.valueOf(360.0f), (Function1) null, 5, (Object) null)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null), RallysKt.onWarmupCompleted(IAuthTabCallback(), CollectionsKt__CollectionsJVMKt.listOf(isMuted.getInterfaceDescriptor((AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, new Object[]{(AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.asBinder()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), Integer.valueOf(deprecated_certificatepinner.onNavigationEvent().IAuthTabCallback())}, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()), (Float) null, Float.valueOf((asInterface() * (-2.0f)) + i + (asBinder().getHeight() * 0.5f)), (Function1) null, 5, (Object) null)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null)}), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, Boolean.TRUE, 0, 0L, false, 3833, (Object) null), false, 1, (Object) null);
        int i5 = asInterface + 63;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            return runonuithreaddelayedOnExtraCallbackWithResult;
        }
        throw null;
    }

    private final runOnUiThreadDelayed IAuthTabCallback_Parcel() {
        float f;
        int i = 2 % 2;
        pxToDp.IAuthTabCallback iAuthTabCallback = pxToDp.IAuthTabCallback.onExtraCallback;
        TdsImageView tdsImageViewOnExtraCallbackWithResult = onExtraCallbackWithResult();
        deprecated_certificatePinner deprecated_certificatepinner = deprecated_certificatePinner.onExtraCallbackWithResult;
        Rally rallyOnWarmupCompleted = RallysKt.onWarmupCompleted(tdsImageViewOnExtraCallbackWithResult, CollectionsKt__CollectionsJVMKt.listOf(isMuted.getInterfaceDescriptor(isMuted.IAuthTabCallback_Parcel((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.asBinder()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), Float.valueOf(asInterface()), Float.valueOf(asInterface() * 0.5f), (Function1) null, 4, (Object) null), Float.valueOf(asInterface()), Float.valueOf(asInterface() * 0.5f), (Function1) null, 4, (Object) null)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null);
        TdsImageView tdsImageViewOnExtraCallbackWithResult2 = onExtraCallbackWithResult();
        AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{new deprecated_dns(150.0d, 40.0d)}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368);
        Float fValueOf = Float.valueOf(0.02f);
        Float fValueOf2 = Float.valueOf(1.5f);
        Rally rallyOnWarmupCompleted2 = RallysKt.onWarmupCompleted(tdsImageViewOnExtraCallbackWithResult2, CollectionsKt__CollectionsJVMKt.listOf(isMuted.asBinder(appLovinSdkSettings, fValueOf, fValueOf2, (Function1) null, 4, (Object) null)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null);
        Rally rallyOnWarmupCompleted3 = RallysKt.onWarmupCompleted(onExtraCallback(), CollectionsKt__CollectionsJVMKt.listOf(isMuted.asBinder((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{new deprecated_dns(150.0d, 40.0d)}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), fValueOf, fValueOf2, (Function1) null, 4, (Object) null)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null);
        Rally rallyOnWarmupCompleted4 = RallysKt.onWarmupCompleted(onNavigationEvent(), CollectionsKt__CollectionsJVMKt.listOf(isMuted.asBinder((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{new deprecated_dns(150.0d, 40.0d)}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), fValueOf, fValueOf2, (Function1) null, 4, (Object) null)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null);
        Rally rallyOnWarmupCompleted5 = RallysKt.onWarmupCompleted(onNavigationEvent(), CollectionsKt__CollectionsJVMKt.listOf(isMuted.getInterfaceDescriptor(isMuted.IAuthTabCallback_Parcel((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.asBinder()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), Float.valueOf(asInterface()), Float.valueOf(asInterface() * 1.5f), (Function1) null, 4, (Object) null), Float.valueOf(asInterface()), Float.valueOf(asInterface() * 0.5f), (Function1) null, 4, (Object) null)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null);
        ViewGroup viewGroupIAuthTabCallback = IAuthTabCallback();
        AppLovinSdkSettings appLovinSdkSettingsOnWarmupCompleted = ((AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 1045515484, new Object[]{new AppLovinSdkSettings(), Integer.valueOf(((int) this.onExtraCallbackWithResult) + 2000)}, -1045515484, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback())).onWarmupCompleted(Address.onNavigationEvent.asInterface());
        if (access000()) {
            int i2 = asInterface + Imgproc.COLOR_YUV2RGBA_YVYU;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            f = 0.1f;
        } else {
            int i4 = asInterface + 39;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            f = 0.3f;
        }
        return isFireOS.onExtraCallbackWithResult(RallysKt.onWarmupCompleted((View) null, iAuthTabCallback, CollectionsKt__CollectionsKt.listOf((Object[]) new Rally[]{rallyOnWarmupCompleted, rallyOnWarmupCompleted2, rallyOnWarmupCompleted3, rallyOnWarmupCompleted4, rallyOnWarmupCompleted5, RallysKt.onWarmupCompleted(viewGroupIAuthTabCallback, CollectionsKt__CollectionsJVMKt.listOf(isMuted.onNavigationEvent(appLovinSdkSettingsOnWarmupCompleted, Float.valueOf(f), Float.valueOf(0.0f), (Function1) null, 4, (Object) null)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null)}), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, Boolean.TRUE, 500, 0L, false, 3321, (Object) null), false, 1, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0057 A[PHI: r3 r7
      0x0057: PHI (r3v14 java.lang.Float) = (r3v4 java.lang.Float), (r3v16 java.lang.Float) binds: [B:8:0x0034, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
      0x0057: PHI (r7v7 java.lang.Float) = (r7v0 java.lang.Float), (r7v8 java.lang.Float) binds: [B:8:0x0034, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0036 A[PHI: r3 r7
      0x0036: PHI (r3v5 java.lang.Float) = (r3v4 java.lang.Float), (r3v16 java.lang.Float) binds: [B:8:0x0034, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
      0x0036: PHI (r7v1 java.lang.Float) = (r7v0 java.lang.Float), (r7v8 java.lang.Float) binds: [B:8:0x0034, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final runOnUiThreadDelayed onWarmupCompleted(int i, final boolean z, int i2) {
        Float fValueOf;
        Float fValueOf2;
        int iAccess200;
        int i3 = 2 % 2;
        int i4 = onTransact + 23;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            fValueOf = Float.valueOf(2.0f);
            fValueOf2 = Float.valueOf(2.0f);
            if (access000()) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                Configuration configuration = context.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration, "");
                iAccess200 = new getUrlokhttp(new ICustomTabsCallback(configuration)).access200();
            } else {
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                Configuration configuration2 = context2.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration2, "");
                iAccess200 = ((Integer) getUrlokhttp.onNavigationEvent(new Object[]{new getUrlokhttp(new readTypedObject(configuration2))}, -1763178192, 1763178195, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult())).intValue();
            }
        } else {
            fValueOf = Float.valueOf(1.0f);
            fValueOf2 = Float.valueOf(0.0f);
            if (access000()) {
            }
        }
        int i5 = z ^ true ? 100 : 300;
        pxToDp.IAuthTabCallback iAuthTabCallback = pxToDp.IAuthTabCallback.onExtraCallback;
        TdsRoundLayout tdsRoundLayoutAsBinder = asBinder();
        deprecated_certificatePinner deprecated_certificatepinner = deprecated_certificatePinner.onExtraCallbackWithResult;
        Rally rallyOnWarmupCompleted = RallysKt.onWarmupCompleted(tdsRoundLayoutAsBinder, CollectionsKt__CollectionsJVMKt.listOf(isMuted.getInterfaceDescriptor((AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, new Object[]{(AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.asBinder()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), 100}, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()), Float.valueOf(-asBinder().getHeight()), Float.valueOf(i2), (Function1) null, 4, (Object) null)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null);
        Rally rallyOnWarmupCompleted2 = RallysKt.onWarmupCompleted(asBinder(), CollectionsKt__CollectionsJVMKt.listOf(isMuted.asBinder((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{new deprecated_dns(150.0d, 40.0d)}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), fValueOf2, fValueOf, (Function1) null, 4, (Object) null)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null);
        Rally rallyOnWarmupCompleted3 = RallysKt.onWarmupCompleted(asBinder(), CollectionsKt__CollectionsJVMKt.listOf((AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 1901736661, new Object[]{(AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.onNavigationEvent()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), fValueOf2, Float.valueOf(i), null, 4, null}, -1901736628, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult())), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null);
        Rally rallyOnWarmupCompleted4 = RallysKt.onWarmupCompleted(asBinder(), CollectionsKt__CollectionsJVMKt.listOf((AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, new Object[]{isMuted.onWarmupCompleted((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.IAuthTabCallbackStub()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), Integer.valueOf(VideoEncoderInfoImplExternalSyntheticLambda0.IAuthTabCallback(iAccess200, 0)), Integer.valueOf(iAccess200), (Function1) null, 4, (Object) null), 170}, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback())), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null);
        TdsImageView tdsImageView = (TdsImageView) onWarmupCompleted(new Object[]{this}, nSetPosition.onExtraCallbackWithResult(), -2091729634, nSetPosition.onExtraCallbackWithResult(), 2091729636, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult());
        AppLovinSdkSettings appLovinSdkSettings = new AppLovinSdkSettings();
        Address address = Address.onNavigationEvent;
        Rally rallyOnWarmupCompleted5 = RallysKt.onWarmupCompleted(tdsImageView, CollectionsKt__CollectionsJVMKt.listOf((AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -1818891848, new Object[]{(AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, new Object[]{(AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 1045515484, new Object[]{appLovinSdkSettings.onWarmupCompleted((Interpolator) Address.onNavigationEvent(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -1041671130, new Object[]{address, Float.valueOf(0.4f), Float.valueOf(1.32f), Float.valueOf(0.62f), Float.valueOf(1.06f)}, nSetPosition.onExtraCallbackWithResult(), 1041671131)), 1000}, -1045515484, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()), 100}, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()), null, Float.valueOf(360.0f), null, 5, null}, 1818891874, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult())), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null);
        TdsImageView tdsImageView2 = (TdsImageView) onWarmupCompleted(new Object[]{this}, nSetPosition.onExtraCallbackWithResult(), -2091729634, nSetPosition.onExtraCallbackWithResult(), 2091729636, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult());
        AppLovinSdkSettings appLovinSdkSettings2 = new AppLovinSdkSettings();
        getVersionCode getversioncode = getVersionCode.STRONG;
        Rally rallyOnWarmupCompleted6 = RallysKt.onWarmupCompleted(tdsImageView2, CollectionsKt__CollectionsJVMKt.listOf(isMuted.onWarmupCompleted(appLovinSdkSettings2, getversioncode, getversioncode, (Function1) null, 4, (Object) null)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null);
        Float f = fValueOf;
        Rally rallyOnWarmupCompleted7 = RallysKt.onWarmupCompleted((TdsImageView) onWarmupCompleted(new Object[]{this}, nSetPosition.onExtraCallbackWithResult(), -2091729634, nSetPosition.onExtraCallbackWithResult(), 2091729636, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult()), CollectionsKt__CollectionsJVMKt.listOf((AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, new Object[]{isMuted.onNavigationEvent((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.onExtraCallbackWithResult()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), fValueOf2, f, (Function1) null, 4, (Object) null), 200}, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback())), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null);
        Rally rallyOnWarmupCompleted8 = RallysKt.onWarmupCompleted((TdsImageView) onWarmupCompleted(new Object[]{this}, nSetPosition.onExtraCallbackWithResult(), -2091729634, nSetPosition.onExtraCallbackWithResult(), 2091729636, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult()), CollectionsKt__CollectionsJVMKt.listOf((AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, new Object[]{(AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 1045515484, new Object[]{(AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{new AppLovinSdkSettings().onWarmupCompleted(address.asInterface()), Float.valueOf(0.0f), Float.valueOf(1.0f), new Function1() { // from class: im.toss.uikit.widget.TdsPointToastV1View$$ExternalSyntheticLambda0
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i6 = 2 % 2;
                int i7 = onExtraCallback + 27;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                Unit unitIAuthTabCallback = TdsPointToastV1View.IAuthTabCallback(this.f$0, ((Float) obj).floatValue());
                int i9 = onWarmupCompleted + 29;
                onExtraCallback = i9 % 128;
                int i10 = i9 % 2;
                return unitIAuthTabCallback;
            }
        }, null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 600}, -1045515484, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()), 600}, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback())), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null);
        TdsRollingNumberV1View tdsRollingNumberV1View = this.IAuthTabCallback.asInterface;
        Intrinsics.checkNotNullExpressionValue(tdsRollingNumberV1View, "");
        Rally rallyOnWarmupCompleted9 = RallysKt.onWarmupCompleted(tdsRollingNumberV1View, CollectionsKt__CollectionsJVMKt.listOf(isMuted.onNavigationEvent((AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, new Object[]{(AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.onExtraCallbackWithResult()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), 300}, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()), fValueOf2, f, (Function1) null, 4, (Object) null)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null);
        Rally rallyOnWarmupCompleted10 = RallysKt.onWarmupCompleted((BaseTextView) onWarmupCompleted(new Object[]{this}, nSetPosition.onExtraCallbackWithResult(), -1728521881, nSetPosition.onExtraCallbackWithResult(), 1728521884, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult()), CollectionsKt__CollectionsJVMKt.listOf(isMuted.onNavigationEvent((AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, new Object[]{(AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.onExtraCallbackWithResult()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), 300}, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()), fValueOf2, f, (Function1) null, 4, (Object) null)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null);
        BaseTextView baseTextView = (BaseTextView) onWarmupCompleted(new Object[]{this}, nSetPosition.onExtraCallbackWithResult(), -1728521881, nSetPosition.onExtraCallbackWithResult(), 1728521884, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult());
        AppLovinSdkSettings appLovinSdkSettings3 = (AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, new Object[]{new AppLovinSdkSettings().onWarmupCompleted(address.asInterface()), 350}, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback());
        int color = Color.parseColor("#96DBFB");
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        Configuration configuration3 = context3.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration3, "");
        runOnUiThreadDelayed runonuithreaddelayedOnNavigationEvent = runOnUiThreadDelayed.onNavigationEvent(RallysKt.onWarmupCompleted((View) null, iAuthTabCallback, CollectionsKt__CollectionsKt.listOf((Object[]) new Rally[]{rallyOnWarmupCompleted, rallyOnWarmupCompleted2, rallyOnWarmupCompleted3, rallyOnWarmupCompleted4, rallyOnWarmupCompleted5, rallyOnWarmupCompleted6, rallyOnWarmupCompleted7, rallyOnWarmupCompleted8, rallyOnWarmupCompleted9, rallyOnWarmupCompleted10, RallysKt.onWarmupCompleted(baseTextView, CollectionsKt__CollectionsJVMKt.listOf(isMuted.IAuthTabCallback(appLovinSdkSettings3, Integer.valueOf(color), Integer.valueOf(new getUrlokhttp(new extraCallbackWithResult(configuration3)).asBinder()), (Function1) null, 4, (Object) null)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null)}), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, Boolean.FALSE, i5, 0L, false, 3321, (Object) null), (Object) null, new Function0() { // from class: im.toss.uikit.widget.TdsPointToastV1View$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i6 = 2 % 2;
                int i7 = onNavigationEvent + 45;
                IAuthTabCallback = i7 % 128;
                if (i7 % 2 != 0) {
                    return (Unit) TdsPointToastV1View.onWarmupCompleted(new Object[]{this.f$0, Boolean.valueOf(z)}, nSetPosition.onExtraCallbackWithResult(), -1132779223, nSetPosition.onExtraCallbackWithResult(), 1132779224, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult());
                }
                throw null;
            }
        }, 1, (Object) null);
        int i6 = onTransact + Imgproc.COLOR_YUV2RGB_YVYU;
        asInterface = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 11 / 0;
        }
        return runonuithreaddelayedOnNavigationEvent;
    }

    static final class writeTypedObject extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ boolean $showGradientBg;
        int label;
        final /* synthetic */ TdsPointToastV1View this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        writeTypedObject(boolean z, TdsPointToastV1View tdsPointToastV1View, access13800<? super writeTypedObject> access13800Var) {
            super(2, access13800Var);
            this.$showGradientBg = z;
            this.this$0 = tdsPointToastV1View;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            writeTypedObject writetypedobject = new writeTypedObject(this.$showGradientBg, this.this$0, access13800Var);
            int i2 = onExtraCallback + 53;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 12 / 0;
            }
            return writetypedobject;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 1;
            onWarmupCompleted = i2 % 128;
            findResAndMsg findresandmsg2 = findresandmsg;
            access13800<? super Unit> access13800Var2 = access13800Var;
            if (i2 % 2 == 0) {
                return onExtraCallback(findresandmsg2, access13800Var2);
            }
            onExtraCallback(findresandmsg2, access13800Var2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 83;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((writeTypedObject) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
            if (i3 != 0) {
                int i4 = 98 / 0;
            }
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                if (!this.$showGradientBg) {
                    this.label = 1;
                    if (formatMsgs.onWarmupCompleted(170L, this) == objOnExtraCallback) {
                        int i3 = onWarmupCompleted + 45;
                        onExtraCallback = i3 % 128;
                        if (i3 % 2 == 0) {
                            int i4 = 16 / 0;
                        }
                        return objOnExtraCallback;
                    }
                }
                Unit unit = Unit.INSTANCE;
                int i5 = onWarmupCompleted + 89;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return unit;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i7 = onWarmupCompleted + 29;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            ResultKt.onNavigationEvent(obj);
            ((TdsRoundLayout) TdsPointToastV1View.onWarmupCompleted(new Object[]{this.this$0}, nSetPosition.onExtraCallbackWithResult(), 1157883390, nSetPosition.onExtraCallbackWithResult(), -1157883383, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult())).setShadow(Cacheurls1.onWarmupCompleted.onExtraCallbackWithResult.onExtraCallback, (AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.IAuthTabCallbackStub()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368));
            Unit unit2 = Unit.INSTANCE;
            int i52 = onWarmupCompleted + 89;
            onExtraCallback = i52 % 128;
            int i62 = i52 % 2;
            return unit2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallback(TdsPointToastV1View tdsPointToastV1View, boolean z) {
        TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent;
        int i = 2 % 2;
        int i2 = asInterface + 119;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(tdsPointToastV1View);
            if (textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult != null && (textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent = TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult)) != null) {
                onLoadStarted.onExtraCallback(textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent, null, null, new writeTypedObject(z, tdsPointToastV1View, null), 3, null);
                int i3 = onTransact + 63;
                asInterface = i3 % 128;
                int i4 = i3 % 2;
            }
            tdsPointToastV1View.asBinder().setAlpha(1.0f);
            return Unit.INSTANCE;
        }
        AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(tdsPointToastV1View);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallbackWithResult(TdsPointToastV1View tdsPointToastV1View, float f) {
        int iOnUnminimized;
        int i = 2 % 2;
        if (tdsPointToastV1View.access000()) {
            Context context = tdsPointToastV1View.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Configuration configuration = context.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            Object[] objArr = {new getUrlokhttp(new IAuthTabCallbackStubProxy(configuration))};
            int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
            iOnUnminimized = ((Integer) getUrlokhttp.onNavigationEvent(objArr, -1763178192, 1763178195, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult())).intValue();
        } else {
            Context context2 = tdsPointToastV1View.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            Configuration configuration2 = context2.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration2, "");
            iOnUnminimized = new getUrlokhttp(new access000(configuration2)).onUnminimized();
            int i2 = onTransact + 97;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 4 % 2;
            }
        }
        Context context3 = tdsPointToastV1View.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        Configuration configuration3 = context3.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration3, "");
        TdsRollingNumberV1View.setTextColor$default(tdsPointToastV1View.IAuthTabCallbackStub(), new setHasUserConsent(iOnUnminimized, new getUrlokhttp(new getInterfaceDescriptor(configuration3)).asBinder()).IAuthTabCallback(f).intValue(), false, false, 6, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 107;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0046 A[PHI: r2 r3 r4 r9 r10
      0x0046: PHI (r2v5 java.lang.Float) = (r2v4 java.lang.Float), (r2v13 java.lang.Float) binds: [B:8:0x0044, B:5:0x002e] A[DONT_GENERATE, DONT_INLINE]
      0x0046: PHI (r3v3 java.lang.Float) = (r3v2 java.lang.Float), (r3v8 java.lang.Float) binds: [B:8:0x0044, B:5:0x002e] A[DONT_GENERATE, DONT_INLINE]
      0x0046: PHI (r4v2 java.lang.Float) = (r4v1 java.lang.Float), (r4v11 java.lang.Float) binds: [B:8:0x0044, B:5:0x002e] A[DONT_GENERATE, DONT_INLINE]
      0x0046: PHI (r9v1 java.lang.Float) = (r9v0 java.lang.Float), (r9v37 java.lang.Float) binds: [B:8:0x0044, B:5:0x002e] A[DONT_GENERATE, DONT_INLINE]
      0x0046: PHI (r10v2 int) = (r10v1 int), (r10v24 int) binds: [B:8:0x0044, B:5:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final runOnUiThreadDelayed onWarmupCompleted(final long j, final long j2, int i, boolean z) {
        Float fValueOf;
        Float fValueOf2;
        Float fValueOf3;
        Float fValueOf4;
        int i2;
        int i3 = 2 % 2;
        int i4 = asInterface + 19;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            fValueOf = Float.valueOf(1.0f);
            fValueOf2 = Float.valueOf(1.5f);
            fValueOf3 = Float.valueOf(1.1f);
            fValueOf4 = Float.valueOf(1.0f);
            i2 = (int) this.onExtraCallbackWithResult;
            if (!z) {
                i2 -= 100;
                int i5 = onTransact + 125;
                asInterface = i5 % 128;
                int i6 = i5 % 2;
            }
        } else {
            fValueOf = Float.valueOf(0.0f);
            fValueOf2 = Float.valueOf(1.5f);
            fValueOf3 = Float.valueOf(1.1f);
            fValueOf4 = Float.valueOf(1.0f);
            i2 = (int) this.onExtraCallbackWithResult;
            if (!z) {
            }
        }
        Float f = fValueOf4;
        int i7 = i2;
        pxToDp.IAuthTabCallback iAuthTabCallback = pxToDp.IAuthTabCallback.onExtraCallback;
        TdsRoundLayout tdsRoundLayoutAsBinder = asBinder();
        AppLovinSdkSettings appLovinSdkSettings = new AppLovinSdkSettings();
        Address address = Address.onNavigationEvent;
        Rally rallyOnWarmupCompleted = RallysKt.onWarmupCompleted(tdsRoundLayoutAsBinder, CollectionsKt__CollectionsJVMKt.listOf(isMuted.asBinder((AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 1045515484, new Object[]{appLovinSdkSettings.onWarmupCompleted(address.asInterface()), 100}, -1045515484, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()), f, fValueOf3, (Function1) null, 4, (Object) null)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null);
        Float f2 = fValueOf;
        Rally rallyOnWarmupCompleted2 = RallysKt.onWarmupCompleted(asBinder(), CollectionsKt__CollectionsJVMKt.listOf(isMuted.asBinder((AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, new Object[]{(AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{new deprecated_dns(300.0d, 12.0d)}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), 100}, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()), fValueOf3, f, (Function1) null, 4, (Object) null)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null);
        Rally rallyOnWarmupCompleted3 = RallysKt.onWarmupCompleted(asBinder(), CollectionsKt__CollectionsJVMKt.listOf((AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 1115090779, new Object[]{(AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, new Object[]{(AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{new deprecated_dns(300.0d, 18.0d)}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), 50}, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()), null, Integer.valueOf((asBinder().getWidth() - ((BaseTextView) onWarmupCompleted(new Object[]{this}, nSetPosition.onExtraCallbackWithResult(), -1728521881, nSetPosition.onExtraCallbackWithResult(), 1728521884, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult())).getWidth()) + i), null, 5, null}, -1115090763, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult())), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null);
        Rally rallyOnWarmupCompleted4 = RallysKt.onWarmupCompleted((TdsImageView) onWarmupCompleted(new Object[]{this}, nSetPosition.onExtraCallbackWithResult(), -2091729634, nSetPosition.onExtraCallbackWithResult(), 2091729636, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult()), CollectionsKt__CollectionsJVMKt.listOf(isMuted.asBinder((AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 1045515484, new Object[]{new AppLovinSdkSettings().onWarmupCompleted(address.asInterface()), 100}, -1045515484, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()), f, fValueOf2, (Function1) null, 4, (Object) null)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null);
        Rally rallyOnWarmupCompleted5 = RallysKt.onWarmupCompleted((TdsImageView) onWarmupCompleted(new Object[]{this}, nSetPosition.onExtraCallbackWithResult(), -2091729634, nSetPosition.onExtraCallbackWithResult(), 2091729636, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult()), CollectionsKt__CollectionsJVMKt.listOf(isMuted.asBinder((AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, new Object[]{(AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{new deprecated_dns(300.0d, 12.0d)}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), 100}, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()), fValueOf2, f, (Function1) null, 4, (Object) null)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null);
        TdsRollingNumberV1View tdsRollingNumberV1ViewIAuthTabCallbackStub = IAuthTabCallbackStub();
        deprecated_certificatePinner deprecated_certificatepinner = deprecated_certificatePinner.onExtraCallbackWithResult;
        return runOnUiThreadDelayed.onNavigationEvent(RallysKt.onWarmupCompleted((View) null, iAuthTabCallback, CollectionsKt__CollectionsKt.listOf((Object[]) new Rally[]{rallyOnWarmupCompleted, rallyOnWarmupCompleted2, rallyOnWarmupCompleted3, rallyOnWarmupCompleted4, rallyOnWarmupCompleted5, RallysKt.onWarmupCompleted(tdsRollingNumberV1ViewIAuthTabCallbackStub, CollectionsKt__CollectionsJVMKt.listOf((AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{(AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.onExtraCallbackWithResult()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), Float.valueOf(0.0f), Float.valueOf(1.0f), new Function1() { // from class: im.toss.uikit.widget.TdsPointToastV1View$$ExternalSyntheticLambda4
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i8 = 2 % 2;
                int i9 = IAuthTabCallback + 53;
                onWarmupCompleted = i9 % 128;
                int i10 = i9 % 2;
                Unit unitOnWarmupCompleted = TdsPointToastV1View.onWarmupCompleted(this.f$0, ((Float) obj).floatValue());
                int i11 = IAuthTabCallback + 55;
                onWarmupCompleted = i11 % 128;
                if (i11 % 2 != 0) {
                    int i12 = 68 / 0;
                }
                return unitOnWarmupCompleted;
            }
        }, null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult())), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null), RallysKt.onWarmupCompleted((BaseTextView) onWarmupCompleted(new Object[]{this}, nSetPosition.onExtraCallbackWithResult(), -1728521881, nSetPosition.onExtraCallbackWithResult(), 1728521884, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult()), CollectionsKt__CollectionsJVMKt.listOf((AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, new Object[]{isMuted.IAuthTabCallback_Parcel((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.onExtraCallbackWithResult()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, Float.valueOf(-((BaseTextView) onWarmupCompleted(new Object[]{this}, nSetPosition.onExtraCallbackWithResult(), -1728521881, nSetPosition.onExtraCallbackWithResult(), 1728521884, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult())).getWidth()), (Function1) null, 5, (Object) null), 30}, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback())), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null), RallysKt.onWarmupCompleted((BaseTextView) onWarmupCompleted(new Object[]{this}, nSetPosition.onExtraCallbackWithResult(), -1728521881, nSetPosition.onExtraCallbackWithResult(), 1728521884, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult()), CollectionsKt__CollectionsJVMKt.listOf(isMuted.onNavigationEvent(isMuted.asBinder((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.asBinder()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, f2, (Function1) null, 5, (Object) null), f, f2, (Function1) null, 4, (Object) null)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null)}), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, Boolean.TRUE, i7, 0L, false, 3321, (Object) null), (Object) null, new Function0() { // from class: im.toss.uikit.widget.TdsPointToastV1View$$ExternalSyntheticLambda5
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i8 = 2 % 2;
                int i9 = onExtraCallbackWithResult + 7;
                onWarmupCompleted = i9 % 128;
                int i10 = i9 % 2;
                Unit unitOnExtraCallbackWithResult = TdsPointToastV1View.onExtraCallbackWithResult(this.f$0, j, j2);
                int i11 = onExtraCallbackWithResult + 115;
                onWarmupCompleted = i11 % 128;
                int i12 = i11 % 2;
                return unitOnExtraCallbackWithResult;
            }
        }, 1, (Object) null);
    }

    static final class access100 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ long $addAmount;
        final /* synthetic */ long $initAmount;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        access100(long j, long j2, access13800<? super access100> access13800Var) {
            super(2, access13800Var);
            this.$initAmount = j;
            this.$addAmount = j2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            access100 access100Var = TdsPointToastV1View.this.new access100(this.$initAmount, this.$addAmount, access13800Var);
            int i2 = IAuthTabCallback + 45;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return access100Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 95;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent(findresandmsg, access13800Var);
            int i4 = IAuthTabCallback + 37;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnNavigationEvent;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 17;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((access100) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 107;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 81;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                access14100.onExtraCallback();
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(30L, this) == objOnExtraCallback) {
                    int i4 = onExtraCallbackWithResult + 35;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return objOnExtraCallback;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                int i6 = onExtraCallbackWithResult + 49;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
            }
            isOneShot.onExtraCallbackWithResult(TdsPointToastV1View.this, noStore.Companion.IAuthTabCallbackDefault());
            TdsRollingNumberV1View.setNumber$default(TdsPointToastV1View.onExtraCallback(TdsPointToastV1View.this), this.$initAmount + this.$addAmount, false, (TdsRollingNumberV1View.access000) null, false, 14, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallback(TdsPointToastV1View tdsPointToastV1View, long j, long j2) {
        int i = 2 % 2;
        int i2 = asInterface + Imgproc.COLOR_YUV2RGBA_YVYU;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(tdsPointToastV1View);
        if (textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult != null) {
            int i4 = onTransact + 97;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent = TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult);
            if (textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent != null) {
                onLoadStarted.onExtraCallback(textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent, null, null, tdsPointToastV1View.new access100(j, j2, null), 3, null);
            }
        }
        Unit unit = Unit.INSTANCE;
        int i6 = asInterface + 17;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int i;
        int i2;
        TdsPointToastV1View tdsPointToastV1View = (TdsPointToastV1View) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i3 = 2 % 2;
        int i4 = asInterface + 111;
        int i5 = i4 % 128;
        onTransact = i5;
        if (i4 % 2 == 0) {
            i = (int) tdsPointToastV1View.onExtraCallback;
            int i6 = 85 / 0;
            if (zBooleanValue) {
                int i7 = i5 + 13;
                asInterface = i7 % 128;
                int i8 = i7 % 2;
                i2 = i + 300;
            } else {
                i2 = i + 100;
            }
        } else {
            int i9 = (int) tdsPointToastV1View.onExtraCallback;
            if (true ^ zBooleanValue) {
                i = i9;
                i2 = i + 100;
            } else {
                i = i9;
                int i72 = i5 + 13;
                asInterface = i72 % 128;
                int i82 = i72 % 2;
                i2 = i + 300;
            }
        }
        int i10 = i2;
        pxToDp.IAuthTabCallback iAuthTabCallback = pxToDp.IAuthTabCallback.onExtraCallback;
        ConstraintLayout constraintLayoutOnWarmupCompleted = tdsPointToastV1View.IAuthTabCallback.onWarmupCompleted();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutOnWarmupCompleted, "");
        return RallysKt.onWarmupCompleted((View) null, iAuthTabCallback, CollectionsKt__CollectionsJVMKt.listOf(RallysKt.onWarmupCompleted(constraintLayoutOnWarmupCompleted, CollectionsKt__CollectionsJVMKt.listOf(isMuted.onNavigationEvent((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.onExtraCallbackWithResult()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, Float.valueOf(0.0f), (Function1) null, 5, (Object) null)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, Boolean.TRUE, i10, 0L, false, 3321, (Object) null);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onNavigationEvent {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onNavigationEvent[] $VALUES;
        public static final onWarmupCompleted Companion;
        public static final onNavigationEvent IMMEDIATE = new onNavigationEvent("IMMEDIATE", 0, im.toss.uikit.R.string.money_suffix_won);
        public static final onNavigationEvent LATER = new onNavigationEvent("LATER", 1, im.toss.uikit.R.string.point_toast_add_later);
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        private static int onWarmupCompleted;
        private final int label;

        private static final /* synthetic */ onNavigationEvent[] $values() {
            onNavigationEvent[] onnavigationeventArr;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 1;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            if (i2 % 2 == 0) {
                onNavigationEvent onnavigationevent = IMMEDIATE;
                onNavigationEvent onnavigationevent2 = LATER;
                onnavigationeventArr = new onNavigationEvent[4];
                onnavigationeventArr[0] = onnavigationevent;
                onnavigationeventArr[0] = onnavigationevent2;
            } else {
                onnavigationeventArr = new onNavigationEvent[]{IMMEDIATE, LATER};
            }
            int i4 = i3 + 95;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return onnavigationeventArr;
            }
            throw null;
        }

        public static EnumEntries<onNavigationEvent> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 105;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            EnumEntries<onNavigationEvent> enumEntries = $ENTRIES;
            int i5 = i2 + 83;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return enumEntries;
        }

        public static onNavigationEvent valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 49;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationevent = (onNavigationEvent) Enum.valueOf(onNavigationEvent.class, str);
            int i4 = onNavigationEvent + 5;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return onnavigationevent;
        }

        public static onNavigationEvent[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 69;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            onNavigationEvent[] onnavigationeventArr = (onNavigationEvent[]) $VALUES.clone();
            int i3 = onNavigationEvent + 87;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return onnavigationeventArr;
        }

        private onNavigationEvent(String str, int i, int i2) {
            this.label = i2;
        }

        public final int getLabel() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 15;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return this.label;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static {
            onNavigationEvent[] onnavigationeventArr$values = $values();
            $VALUES = onnavigationeventArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onnavigationeventArr$values);
            Companion = new onWarmupCompleted(null);
            int i = onWarmupCompleted + 77;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 == 0) {
                int i2 = 1 / 0;
            }
        }

        public static final class onWarmupCompleted {
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private onWarmupCompleted() {
            }

            public final onNavigationEvent onWarmupCompleted(@NotNull String str) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 41;
                IAuthTabCallback = i2 % 128;
                onNavigationEvent onnavigationevent = null;
                if (i2 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(str, "");
                    onNavigationEvent.getEntries().iterator();
                    onnavigationevent.hashCode();
                    throw null;
                }
                Intrinsics.checkNotNullParameter(str, "");
                Iterator<onNavigationEvent> it = onNavigationEvent.getEntries().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    int i3 = IAuthTabCallback + 33;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                    onNavigationEvent next = it.next();
                    if (Intrinsics.areEqual(next.name(), str)) {
                        int i5 = IAuthTabCallback + 45;
                        onWarmupCompleted = i5 % 128;
                        if (i5 % 2 != 0) {
                            int i6 = 54 / 0;
                        }
                        onnavigationevent = next;
                    }
                }
                return onnavigationevent;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onNavigationEvent(@NotNull ViewGroup viewGroup, long j, long j2, long j3, @NotNull String str, @NotNull String str2, boolean z, int i, long j4, long j5) {
        TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent;
        int i2 = 2 % 2;
        int i3 = onTransact + 45;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(viewGroup, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.onExtraCallbackWithResult = j4;
        this.onExtraCallback = j4 + j5;
        if (!StringsKt__StringsKt.isBlank(str)) {
            int i5 = asInterface + 61;
            onTransact = i5 % 128;
            if (i5 % 2 == 0) {
                TdsImageView tdsImageView = this.IAuthTabCallback.onWarmupCompleted;
                Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
                TdsImageView.setImage$default(tdsImageView, str, (Function1) null, (Function1) null, 42, (Object) null);
            } else {
                TdsImageView tdsImageView2 = this.IAuthTabCallback.onWarmupCompleted;
                Intrinsics.checkNotNullExpressionValue(tdsImageView2, "");
                TdsImageView.setImage$default(tdsImageView2, str, (Function1) null, (Function1) null, 6, (Object) null);
            }
        }
        TdsRollingNumberV1View tdsRollingNumberV1View = this.IAuthTabCallback.asInterface;
        Intrinsics.checkNotNullExpressionValue(tdsRollingNumberV1View, "");
        TdsRollingNumberV1View.setNumber$default(tdsRollingNumberV1View, j2, false, (TdsRollingNumberV1View.access000) null, false, 12, (Object) null);
        TdsRollingNumberV1View tdsRollingNumberV1View2 = this.IAuthTabCallback.IAuthTabCallbackStubProxy;
        Intrinsics.checkNotNullExpressionValue(tdsRollingNumberV1View2, "");
        TdsRollingNumberV1View.setNumber$default(tdsRollingNumberV1View2, j2 + j3, false, (TdsRollingNumberV1View.access000) null, false, 12, (Object) null);
        ((BaseTextView) onWarmupCompleted(new Object[]{this}, nSetPosition.onExtraCallbackWithResult(), -1728521881, nSetPosition.onExtraCallbackWithResult(), 1728521884, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult())).setText("+" + j3 + str2);
        getInterfaceDescriptor();
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new IAuthTabCallback_Parcel(j, z, i, j2, j3, viewGroup));
            return;
        }
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(this);
        if (textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult != null && (textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent = TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult)) != null) {
            onLoadStarted.onExtraCallback(textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent, null, null, new extraCallback(j, this, z, i, j2, j3, viewGroup, null), 3, null);
        }
        int i6 = asInterface + 73;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(TdsPointToastV1View tdsPointToastV1View, boolean z) {
        return (Unit) onWarmupCompleted(new Object[]{tdsPointToastV1View, Boolean.valueOf(z)}, nSetPosition.onExtraCallbackWithResult(), -1132779223, nSetPosition.onExtraCallbackWithResult(), 1132779224, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult());
    }

    public static final /* synthetic */ TdsRoundLayout onExtraCallbackWithResult(TdsPointToastV1View tdsPointToastV1View) {
        return (TdsRoundLayout) onWarmupCompleted(new Object[]{tdsPointToastV1View}, nSetPosition.onExtraCallbackWithResult(), 1157883390, nSetPosition.onExtraCallbackWithResult(), -1157883383, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult());
    }

    public static final /* synthetic */ runOnUiThreadDelayed onNavigationEvent(TdsPointToastV1View tdsPointToastV1View, long j, long j2, int i, boolean z) {
        return (runOnUiThreadDelayed) onWarmupCompleted(new Object[]{tdsPointToastV1View, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), Boolean.valueOf(z)}, nSetPosition.onExtraCallbackWithResult(), -459761083, nSetPosition.onExtraCallbackWithResult(), 459761087, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult());
    }

    private final TdsImageView onTransact() {
        return (TdsImageView) onWarmupCompleted(new Object[]{this}, nSetPosition.onExtraCallbackWithResult(), -2091729634, nSetPosition.onExtraCallbackWithResult(), 2091729636, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult());
    }

    private final BaseTextView IAuthTabCallbackDefault() {
        return (BaseTextView) onWarmupCompleted(new Object[]{this}, nSetPosition.onExtraCallbackWithResult(), -1728521881, nSetPosition.onExtraCallbackWithResult(), 1728521884, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult());
    }

    private final runOnUiThreadDelayed onExtraCallbackWithResult(boolean z) {
        return (runOnUiThreadDelayed) onWarmupCompleted(new Object[]{this, Boolean.valueOf(z)}, nSetPosition.onExtraCallbackWithResult(), -712344012, nSetPosition.onExtraCallbackWithResult(), 712344017, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult());
    }

    private static final Unit onNavigationEvent(TdsPointToastV1View tdsPointToastV1View, float f) {
        return (Unit) onWarmupCompleted(new Object[]{tdsPointToastV1View, Float.valueOf(f)}, nSetPosition.onExtraCallbackWithResult(), -1581741907, nSetPosition.onExtraCallbackWithResult(), 1581741913, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult());
    }
}
