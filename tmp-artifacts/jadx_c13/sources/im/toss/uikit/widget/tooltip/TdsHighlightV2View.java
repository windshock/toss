package im.toss.uikit.widget.tooltip;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.internal.ads.zziea;
import im.toss.features.home.ui.view.currency.CurrencyCalculatorActivity;
import im.toss.features.tosscert.ui.R;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.atom.text.Typography6;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.uikit.widget.tooltip.TdsHighlightV2View;
import java.util.List;
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
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt__StringsKt;
import o.Address;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2;
import o.AppLovinSdkSettings;
import o.Cacheurls1;
import o.OkHttp;
import o.TextFieldPressGestureFilterKtExternalSyntheticLambda0;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.access13800;
import o.access14000;
import o.access14100;
import o.access15300;
import o.deprecated_certificatePinner;
import o.deprecated_peerPrincipal;
import o.findResAndMsg;
import o.formatMsgs;
import o.generateLink;
import o.getAdService;
import o.getDEFAULT_CONNECTION_SPECSokhttp;
import o.getExtraParameters;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.hasVaryAll;
import o.isFireOS;
import o.isMuted;
import o.matches;
import o.onLoadStarted;
import o.processDeepLink;
import o.pxToDp;
import o.readIntokhttp;
import o.response;
import o.runOnUiThreadDelayed;
import o.setHasUserConsent;
import o.setHeadersokhttp;
import o.setProxySelectorokhttp;
import o.setTagsokhttp;
import o.setVisitUrl;
import o.varyFields;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TdsHighlightV2View extends ConstraintLayout {
    private static int ICustomTabsCallbackDefault = 0;
    private static int ICustomTabsService = 0;
    private static int extraCommand = 1;
    private static int isEngagementSignalsApiAvailable = 1;
    private final Paint IAuthTabCallback;
    private runOnUiThreadDelayed IAuthTabCallbackDefault;
    private final TdsImageView IAuthTabCallbackStub;
    private boolean IAuthTabCallbackStubProxy;
    private int IAuthTabCallback_Parcel;
    private float ICustomTabsCallback;
    private final Paint ICustomTabsCallbackStub;
    private float ICustomTabsCallbackStubProxy;
    private boolean access000;
    private String access100;
    private ValueAnimator asBinder;
    private runOnUiThreadDelayed asInterface;
    private onExtraCallback extraCallback;
    private final Paint extraCallbackWithResult;
    private boolean getInterfaceDescriptor;
    private int[] onActivityLayout;
    private Rect onActivityResized;
    private float onExtraCallback;
    private float onMessageChannelReady;
    private float onMinimized;
    private ViewGroup onNavigationEvent;
    private View onPostMessage;
    private float onRelationshipValidationResult;
    private ValueAnimator onTransact;
    private int onUnminimized;
    private float onWarmupCompleted;
    private boolean readTypedObject;
    private final TextView writeTypedObject;
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    public static final int onExtraCallbackWithResult = 8;

    public interface onExtraCallback {
    }

    static {
        int i = extraCommand + 3;
        ICustomTabsService = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsHighlightV2View(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsHighlightV2View(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ boolean IAuthTabCallback(TdsHighlightV2View tdsHighlightV2View, View view, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 101;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = onNavigationEvent(tdsHighlightV2View, view, motionEvent);
        int i4 = ICustomTabsCallbackDefault + 97;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 != 0) {
            return zOnNavigationEvent;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        View view = (View) objArr[0];
        TdsHighlightV2View tdsHighlightV2View = (TdsHighlightV2View) objArr[1];
        ViewGroup viewGroup = (ViewGroup) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        String str = (String) objArr[4];
        onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) objArr[5];
        onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) objArr[6];
        long jLongValue = ((Number) objArr[7]).longValue();
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 75;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr2 = {view, tdsHighlightV2View, viewGroup, Integer.valueOf(iIntValue), str, onwarmupcompleted, onextracallbackwithresult, Long.valueOf(jLongValue)};
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        int iIAuthTabCallback2 = zziea.IAuthTabCallback();
        int iIAuthTabCallback3 = zziea.IAuthTabCallback();
        int iIAuthTabCallback4 = zziea.IAuthTabCallback();
        if (i3 != 0) {
            onNavigationEvent(iIAuthTabCallback2, -1923056023, 1923056025, iIAuthTabCallback4, iIAuthTabCallback3, iIAuthTabCallback, objArr2);
            obj.hashCode();
            throw null;
        }
        onNavigationEvent(iIAuthTabCallback2, -1923056023, 1923056025, iIAuthTabCallback4, iIAuthTabCallback3, iIAuthTabCallback, objArr2);
        int i4 = ICustomTabsCallbackDefault + 87;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = i2 | i3 | (~i6);
        int i8 = (~((~i2) | i3)) | (~(i2 | i6));
        int i9 = (~(i6 | (~i3))) | i2;
        int i10 = i2 + i3 + i + ((-1069702238) * i5) + (1645725337 * i4);
        int i11 = i10 * i10;
        int i12 = ((i2 * 2084108943) - 1824784384) + (2084108943 * i3) + (i7 * (-929364622)) + (929364622 * i8) + ((-929364622) * i9) + (1154744320 * i) + ((-1977090048) * i5) + (448004096 * i4) + (1807155200 * i11);
        int i13 = (i2 * (-999696423)) + 1136243370 + (i3 * (-999696423)) + (i7 * 830) + (i8 * (-830)) + (i9 * 830) + (i * (-999695593)) + (i5 * 636963214) + (i4 * (-1077364033)) + (i11 * 980484096);
        switch (i12 + (i13 * i13 * 1287192576)) {
            case 1:
                return onExtraCallbackWithResult(objArr);
            case 2:
                View view = (View) objArr[0];
                TdsHighlightV2View tdsHighlightV2View = (TdsHighlightV2View) objArr[1];
                ViewGroup viewGroup = (ViewGroup) objArr[2];
                int iIntValue = ((Number) objArr[3]).intValue();
                String str = (String) objArr[4];
                onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) objArr[5];
                onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) objArr[6];
                long jLongValue = ((Number) objArr[7]).longValue();
                int i14 = 2 % 2;
                view.getLocationOnScreen(tdsHighlightV2View.onActivityLayout);
                int[] iArr = tdsHighlightV2View.onActivityLayout;
                int i15 = iArr[0];
                tdsHighlightV2View.onActivityResized = new Rect(i15, iArr[1], view.getWidth() + i15, tdsHighlightV2View.onActivityLayout[1] + view.getHeight());
                tdsHighlightV2View.IAuthTabCallback(viewGroup, iIntValue, str, onwarmupcompleted, onextracallbackwithresult, jLongValue);
                int i16 = ICustomTabsCallbackDefault + 111;
                isEngagementSignalsApiAvailable = i16 % 128;
                int i17 = i16 % 2;
                return null;
            case 3:
                TdsHighlightV2View tdsHighlightV2View2 = (TdsHighlightV2View) objArr[0];
                boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
                int i18 = 2 % 2;
                int i19 = isEngagementSignalsApiAvailable + 53;
                int i20 = i19 % 128;
                ICustomTabsCallbackDefault = i20;
                int i21 = i19 % 2;
                tdsHighlightV2View2.IAuthTabCallbackStubProxy = zBooleanValue;
                int i22 = i20 + 67;
                isEngagementSignalsApiAvailable = i22 % 128;
                int i23 = i22 % 2;
                return null;
            case 4:
                return IAuthTabCallback(objArr);
            case 5:
                return onWarmupCompleted(objArr);
            case 6:
                return onNavigationEvent(objArr);
            case 7:
                TdsHighlightV2View tdsHighlightV2View3 = (TdsHighlightV2View) objArr[0];
                int i24 = 2 % 2;
                int i25 = ICustomTabsCallbackDefault + 37;
                int i26 = i25 % 128;
                isEngagementSignalsApiAvailable = i26;
                int i27 = i25 % 2;
                TdsImageView tdsImageView = tdsHighlightV2View3.IAuthTabCallbackStub;
                int i28 = i26 + 53;
                ICustomTabsCallbackDefault = i28 % 128;
                int i29 = i28 % 2;
                return tdsImageView;
            default:
                TdsHighlightV2View tdsHighlightV2View4 = (TdsHighlightV2View) objArr[0];
                onWarmupCompleted onwarmupcompleted2 = (onWarmupCompleted) objArr[1];
                onExtraCallbackWithResult onextracallbackwithresult2 = (onExtraCallbackWithResult) objArr[2];
                int i30 = 2 % 2;
                int i31 = ICustomTabsCallbackDefault + 111;
                isEngagementSignalsApiAvailable = i31 % 128;
                int i32 = i31 % 2;
                Unit unitIAuthTabCallback = IAuthTabCallback(tdsHighlightV2View4, onwarmupcompleted2, onextracallbackwithresult2);
                int i33 = isEngagementSignalsApiAvailable + 41;
                ICustomTabsCallbackDefault = i33 % 128;
                int i34 = i33 % 2;
                return unitIAuthTabCallback;
        }
    }

    public static /* synthetic */ void onNavigationEvent(ValueAnimator valueAnimator, TdsHighlightV2View tdsHighlightV2View, float f, float f2, float f3, ValueAnimator valueAnimator2) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 99;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {valueAnimator, tdsHighlightV2View, Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), valueAnimator2};
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        onNavigationEvent(zziea.IAuthTabCallback(), -710238495, 710238501, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), iIAuthTabCallback, objArr);
        int i4 = ICustomTabsCallbackDefault + 103;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void onNavigationEvent(TdsHighlightV2View tdsHighlightV2View, onWarmupCompleted onwarmupcompleted, onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 87;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(tdsHighlightV2View, onwarmupcompleted, onextracallbackwithresult);
        if (i3 != 0) {
            int i4 = 96 / 0;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        TdsHighlightV2View tdsHighlightV2View = (TdsHighlightV2View) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 83;
        int i3 = i2 % 128;
        isEngagementSignalsApiAvailable = i3;
        int i4 = i2 % 2;
        Rect rect = tdsHighlightV2View.onActivityResized;
        int i5 = i3 + 111;
        ICustomTabsCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return rect;
        }
        throw null;
    }

    public static final /* synthetic */ float IAuthTabCallbackDefault(TdsHighlightV2View tdsHighlightV2View) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable;
        int i3 = i2 + 39;
        ICustomTabsCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        float f = tdsHighlightV2View.ICustomTabsCallbackStubProxy;
        int i5 = i2 + 67;
        ICustomTabsCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public static final /* synthetic */ View IAuthTabCallbackStub(TdsHighlightV2View tdsHighlightV2View) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 39;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        View view = tdsHighlightV2View.onPostMessage;
        if (i3 == 0) {
            return view;
        }
        throw null;
    }

    public static final /* synthetic */ void IAuthTabCallbackStubProxy(TdsHighlightV2View tdsHighlightV2View) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 1;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        tdsHighlightV2View.IAuthTabCallbackDefault();
        if (i3 == 0) {
            int i4 = 55 / 0;
        }
        int i5 = isEngagementSignalsApiAvailable + 71;
        ICustomTabsCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ boolean IAuthTabCallback_Parcel(TdsHighlightV2View tdsHighlightV2View) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 101;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        boolean z = tdsHighlightV2View.IAuthTabCallbackStubProxy;
        if (i3 != 0) {
            int i4 = 87 / 0;
        }
        return z;
    }

    public static final /* synthetic */ boolean access000(TdsHighlightV2View tdsHighlightV2View) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 103;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallback = tdsHighlightV2View.IAuthTabCallback();
        int i4 = ICustomTabsCallbackDefault + 89;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 != 0) {
            return zIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void access100(TdsHighlightV2View tdsHighlightV2View) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 53;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        tdsHighlightV2View.asInterface();
        int i4 = isEngagementSignalsApiAvailable + 5;
        ICustomTabsCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ float asBinder(TdsHighlightV2View tdsHighlightV2View) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 69;
        int i3 = i2 % 128;
        ICustomTabsCallbackDefault = i3;
        int i4 = i2 % 2;
        float f = tdsHighlightV2View.onMessageChannelReady;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 1;
        isEngagementSignalsApiAvailable = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public static final /* synthetic */ onExtraCallback asInterface(TdsHighlightV2View tdsHighlightV2View) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 9;
        int i3 = i2 % 128;
        ICustomTabsCallbackDefault = i3;
        int i4 = i2 % 2;
        onExtraCallback onextracallback = tdsHighlightV2View.extraCallback;
        int i5 = i3 + 5;
        isEngagementSignalsApiAvailable = i5 % 128;
        int i6 = i5 % 2;
        return onextracallback;
    }

    public static final /* synthetic */ ValueAnimator onExtraCallback(TdsHighlightV2View tdsHighlightV2View) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault;
        int i3 = i2 + 69;
        isEngagementSignalsApiAvailable = i3 % 128;
        int i4 = i3 % 2;
        ValueAnimator valueAnimator = tdsHighlightV2View.onTransact;
        int i5 = i2 + 5;
        isEngagementSignalsApiAvailable = i5 % 128;
        int i6 = i5 % 2;
        return valueAnimator;
    }

    public static final /* synthetic */ void onExtraCallback(TdsHighlightV2View tdsHighlightV2View, float f) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault;
        int i3 = i2 + 93;
        isEngagementSignalsApiAvailable = i3 % 128;
        int i4 = i3 % 2;
        tdsHighlightV2View.ICustomTabsCallback = f;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 99;
        isEngagementSignalsApiAvailable = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 22 / 0;
        }
    }

    public static final /* synthetic */ ViewGroup onExtraCallbackWithResult(TdsHighlightV2View tdsHighlightV2View) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 103;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        ViewGroup viewGroup = tdsHighlightV2View.onNavigationEvent;
        if (i3 != 0) {
            return viewGroup;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ String onNavigationEvent(TdsHighlightV2View tdsHighlightV2View) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 39;
        int i3 = i2 % 128;
        ICustomTabsCallbackDefault = i3;
        int i4 = i2 % 2;
        String str = tdsHighlightV2View.access100;
        int i5 = i3 + 111;
        isEngagementSignalsApiAvailable = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static final /* synthetic */ void onNavigationEvent(TdsHighlightV2View tdsHighlightV2View, int i) {
        int i2 = 2 % 2;
        int i3 = isEngagementSignalsApiAvailable + 101;
        ICustomTabsCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        tdsHighlightV2View.IAuthTabCallback_Parcel = i;
        if (i4 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onNavigationEvent(TdsHighlightV2View tdsHighlightV2View, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 27;
        int i3 = i2 % 128;
        isEngagementSignalsApiAvailable = i3;
        int i4 = i2 % 2;
        tdsHighlightV2View.asBinder = valueAnimator;
        int i5 = i3 + Imgproc.COLOR_YUV2RGBA_YVYU;
        ICustomTabsCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void onNavigationEvent(TdsHighlightV2View tdsHighlightV2View, boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault;
        int i3 = i2 + 13;
        isEngagementSignalsApiAvailable = i3 % 128;
        int i4 = i3 % 2;
        tdsHighlightV2View.readTypedObject = z;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 61;
        isEngagementSignalsApiAvailable = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ TextView onWarmupCompleted(TdsHighlightV2View tdsHighlightV2View) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault;
        int i3 = i2 + 49;
        isEngagementSignalsApiAvailable = i3 % 128;
        int i4 = i3 % 2;
        TextView textView = tdsHighlightV2View.writeTypedObject;
        int i5 = i2 + 111;
        isEngagementSignalsApiAvailable = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 99 / 0;
        }
        return textView;
    }

    public static final /* synthetic */ void onWarmupCompleted(TdsHighlightV2View tdsHighlightV2View, float f) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault;
        int i3 = i2 + 5;
        isEngagementSignalsApiAvailable = i3 % 128;
        int i4 = i3 % 2;
        tdsHighlightV2View.onWarmupCompleted = f;
        if (i4 == 0) {
            int i5 = 55 / 0;
        }
        int i6 = i2 + 77;
        isEngagementSignalsApiAvailable = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void onWarmupCompleted(TdsHighlightV2View tdsHighlightV2View, int i) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallbackDefault + 11;
        int i4 = i3 % 128;
        isEngagementSignalsApiAvailable = i4;
        int i5 = i3 % 2;
        tdsHighlightV2View.onUnminimized = i;
        int i6 = i4 + 89;
        ICustomTabsCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
    }

    public static final /* synthetic */ void onWarmupCompleted(TdsHighlightV2View tdsHighlightV2View, Function0 function0) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 111;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        tdsHighlightV2View.onExtraCallback((Function0<Unit>) function0);
        if (i3 == 0) {
            int i4 = 79 / 0;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TdsHighlightV2View(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = ICustomTabsCallbackDefault + 53;
            isEngagementSignalsApiAvailable = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 2 % 2;
            }
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i5 = isEngagementSignalsApiAvailable + Imgproc.COLOR_YUV2RGB_YVYU;
            ICustomTabsCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public static final class IAuthTabCallback_Parcel implements getAdService {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration IAuthTabCallback;

        public IAuthTabCallback_Parcel(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
        
            if ((r2 % 2) == 0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
        
            r0 = null;
            r0.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
        
            r1 = o.getSpecialFeatureOptInStatus.Light;
            r2 = im.toss.uikit.widget.tooltip.TdsHighlightV2View.IAuthTabCallback_Parcel.onNavigationEvent + 15;
            im.toss.uikit.widget.tooltip.TdsHighlightV2View.IAuthTabCallback_Parcel.onWarmupCompleted = r2 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
        
            if ((r2 % 2) != 0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
        
            r0 = 48 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r4.IAuthTabCallback) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r4.IAuthTabCallback) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
        
            r1 = im.toss.uikit.widget.tooltip.TdsHighlightV2View.IAuthTabCallback_Parcel.onNavigationEvent + 75;
            im.toss.uikit.widget.tooltip.TdsHighlightV2View.IAuthTabCallback_Parcel.onWarmupCompleted = r1 % 128;
            r1 = r1 % 2;
            r1 = o.getSpecialFeatureOptInStatus.Dark;
            r2 = im.toss.uikit.widget.tooltip.TdsHighlightV2View.IAuthTabCallback_Parcel.onNavigationEvent + 85;
            im.toss.uikit.widget.tooltip.TdsHighlightV2View.IAuthTabCallback_Parcel.onWarmupCompleted = r2 % 128;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 13;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 55 / 0;
            }
        }
    }

    public static final class asInterface implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public asInterface(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 9;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            if (readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                return getSpecialFeatureOptInStatus.Dark;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
            int i4 = onExtraCallback + 33;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class onNavigationEvent implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Configuration onExtraCallback;

        public onNavigationEvent(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 91;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                if (!readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                    return getSpecialFeatureOptInStatus.Light;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                int i3 = onNavigationEvent + 5;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                return getspecialfeatureoptinstatus;
            }
            readIntokhttp.onExtraCallback(this.onExtraCallback);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        ConstraintLayout constraintLayout = (TdsHighlightV2View) objArr[0];
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 97;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Resources resources = constraintLayout.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        if (generateLink.IAuthTabCallback(resources)) {
            int iArgb = Color.argb(221, 33, 33, 38);
            int i4 = ICustomTabsCallbackDefault + 53;
            isEngagementSignalsApiAvailable = i4 % 128;
            if (i4 % 2 != 0) {
                return Integer.valueOf(iArgb);
            }
            throw null;
        }
        Context context = constraintLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        return Integer.valueOf(((Integer) setHeadersokhttp.onExtraCallbackWithResult(-345361788, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{new getUrlokhttp(new IAuthTabCallback_Parcel(configuration)).requestPostMessageChannel()}, matches.onExtraCallback(), 345361801, matches.onExtraCallback())).intValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int onExtraCallbackWithResult() {
        int i = 2 % 2;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        Configuration configuration = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        int iOnWarmupCompleted = new getDEFAULT_CONNECTION_SPECSokhttp(new IAuthTabCallbackStub(configuration)).onWarmupCompleted();
        int i2 = ICustomTabsCallbackDefault + 55;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        return iOnWarmupCompleted;
    }

    public static final class asBinder implements Animator.AnimatorListener {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 1;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 59;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 73;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
        }

        public asBinder() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 69;
            onWarmupCompleted = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                TdsHighlightV2View.onExtraCallbackWithResult(TdsHighlightV2View.this);
                obj.hashCode();
                throw null;
            }
            ViewGroup viewGroupOnExtraCallbackWithResult = TdsHighlightV2View.onExtraCallbackWithResult(TdsHighlightV2View.this);
            if (viewGroupOnExtraCallbackWithResult == null) {
                int i3 = IAuthTabCallback + 1;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                viewGroupOnExtraCallbackWithResult = null;
            }
            viewGroupOnExtraCallbackWithResult.removeView(TdsHighlightV2View.this);
            TdsHighlightV2View.asInterface(TdsHighlightV2View.this);
            int i5 = IAuthTabCallback + 87;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TdsHighlightV2View(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.onActivityLayout = new int[2];
        this.onActivityResized = new Rect();
        this.IAuthTabCallback_Parcel = setTagsokhttp.onExtraCallbackWithResult(this, 10);
        this.onUnminimized = setTagsokhttp.onExtraCallbackWithResult(this, 10);
        this.onMinimized = setTagsokhttp.onExtraCallbackWithResult(this, 16);
        this.onWarmupCompleted = 1.0f;
        Paint paint = new Paint();
        this.IAuthTabCallback = paint;
        Paint paint2 = new Paint();
        this.ICustomTabsCallbackStub = paint2;
        this.readTypedObject = true;
        this.onMessageChannelReady = -1.0f;
        this.ICustomTabsCallbackStubProxy = -1.0f;
        Paint paint3 = new Paint();
        paint3.setMaskFilter(new BlurMaskFilter(setTagsokhttp.onExtraCallbackWithResult(this, Float.valueOf(Cacheurls1.onNavigationEvent.onExtraCallback.onExtraCallback.onExtraCallback())), BlurMaskFilter.Blur.NORMAL));
        paint3.setColor(onExtraCallbackWithResult());
        this.extraCallbackWithResult = paint3;
        if (getLayoutParams() == null) {
            setLayoutParams(new ConstraintLayout.onExtraCallbackWithResult(-1, -1));
            int i2 = isEngagementSignalsApiAvailable + 43;
            ICustomTabsCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        setClickable(true);
        setFocusable(true);
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        paint.setColor(((Integer) onNavigationEvent(zziea.IAuthTabCallback(), -1817993444, 1817993449, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), iIAuthTabCallback, new Object[]{this})).intValue());
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint2.setColor(0);
        paint2.setStyle(style);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        TdsImageView tdsImageView = new TdsImageView(context2, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Class cls = Integer.TYPE;
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) LinearLayout.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(layoutParams);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.width = setTagsokhttp.onExtraCallbackWithResult(tdsImageView, 24);
        layoutParams2.height = setTagsokhttp.onExtraCallbackWithResult(tdsImageView, 24);
        tdsImageView.setLayoutParams(layoutParams);
        Context context3 = tdsImageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        Configuration configuration = context3.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        tdsImageView.setImageTintList(ColorStateList.valueOf(((Integer) getUrlokhttp.onNavigationEvent(new Object[]{new getUrlokhttp(new onNavigationEvent(configuration))}, -1763178192, 1763178195, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult())).intValue()));
        tdsImageView.setImage(deprecated_peerPrincipal.IAuthTabCallback(OkHttp.onExtraCallback));
        tdsImageView.setVisibility(4);
        setProxySelectorokhttp.onExtraCallbackWithResult(this, tdsImageView);
        this.IAuthTabCallbackStub = tdsImageView;
        BaseTextView baseTextView = (BaseTextView) Typography6.class.getDeclaredConstructor(Context.class).newInstance(getContext());
        Intrinsics.checkNotNull(baseTextView);
        baseTextView.onNavigationEvent(response.Bold);
        baseTextView.setGravity(17);
        baseTextView.setTextSize(1, 15.0f);
        Context context4 = baseTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        Configuration configuration2 = context4.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        baseTextView.setTextColor(((Integer) getUrlokhttp.onNavigationEvent(new Object[]{new getUrlokhttp(new asInterface(configuration2))}, -1763178192, 1763178195, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult())).intValue());
        baseTextView.setVisibility(4);
        Intrinsics.checkNotNull(baseTextView);
        setProxySelectorokhttp.onExtraCallbackWithResult(this, baseTextView);
        this.writeTypedObject = baseTextView;
        int i5 = ICustomTabsCallbackDefault + 119;
        isEngagementSignalsApiAvailable = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ void setTargetView$default(TdsHighlightV2View tdsHighlightV2View, View view, ViewGroup viewGroup, String str, onWarmupCompleted onwarmupcompleted, onExtraCallbackWithResult onextracallbackwithresult, int i, long j, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = isEngagementSignalsApiAvailable + 47;
        ICustomTabsCallbackDefault = i4 % 128;
        tdsHighlightV2View.setTargetView(view, viewGroup, str, onwarmupcompleted, onextracallbackwithresult, i, (i4 % 2 == 0 ? (i2 & 64) == 0 : (i2 & 77) == 0) ? j : 300L);
        int i5 = ICustomTabsCallbackDefault + 83;
        isEngagementSignalsApiAvailable = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setTargetView(@NotNull View view, @NotNull final ViewGroup viewGroup, @Nullable final String str, @NotNull final onWarmupCompleted onwarmupcompleted, @NotNull final onExtraCallbackWithResult onextracallbackwithresult, final int i, final long j) {
        View view2 = view;
        int i2 = 2 % 2;
        int i3 = isEngagementSignalsApiAvailable + 119;
        ICustomTabsCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(viewGroup, "");
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            int i4 = 77 / 0;
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup2 = (ViewGroup) view2;
                if (viewGroup2.getChildCount() == 1) {
                    int i5 = ICustomTabsCallbackDefault + 113;
                    isEngagementSignalsApiAvailable = i5 % 128;
                    int i6 = i5 % 2;
                    if (viewGroup2.getChildAt(0) instanceof TdsListRowV1View) {
                        int i7 = isEngagementSignalsApiAvailable + 95;
                        ICustomTabsCallbackDefault = i7 % 128;
                        int i8 = i7 % 2;
                        View childAt = viewGroup2.getChildAt(0);
                        Intrinsics.checkNotNull(childAt, "");
                        view2 = (TdsListRowV1View) childAt;
                        int i9 = isEngagementSignalsApiAvailable + 11;
                        ICustomTabsCallbackDefault = i9 % 128;
                        int i10 = i9 % 2;
                    }
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(viewGroup, "");
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            if (view2 instanceof ViewGroup) {
            }
        }
        final View view3 = view2;
        this.onPostMessage = view3;
        if (view3 == null) {
            return;
        }
        view3.post(new Runnable() { // from class: im.toss.uikit.widget.tooltip.TdsHighlightV2View$$ExternalSyntheticLambda4
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            @Override // java.lang.Runnable
            public final void run() {
                int i11 = 2 % 2;
                int i12 = IAuthTabCallback + 83;
                onNavigationEvent = i12 % 128;
                int i13 = i12 % 2;
                View view4 = view3;
                TdsHighlightV2View tdsHighlightV2View = this;
                ViewGroup viewGroup3 = viewGroup;
                int i14 = i;
                Object[] objArr = {view4, tdsHighlightV2View, viewGroup3, Integer.valueOf(i14), str, onwarmupcompleted, onextracallbackwithresult, Long.valueOf(j)};
                int iIAuthTabCallback = zziea.IAuthTabCallback();
                TdsHighlightV2View.onNavigationEvent(zziea.IAuthTabCallback(), 675310040, -675310039, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), iIAuthTabCallback, objArr);
                int i15 = onNavigationEvent + 9;
                IAuthTabCallback = i15 % 128;
                if (i15 % 2 == 0) {
                    throw null;
                }
            }
        });
    }

    public static /* synthetic */ void setTargetRect$default(TdsHighlightV2View tdsHighlightV2View, Rect rect, ViewGroup viewGroup, String str, onWarmupCompleted onwarmupcompleted, onExtraCallbackWithResult onextracallbackwithresult, int i, long j, int i2, Object obj) {
        long j2;
        int i3 = 2 % 2;
        if ((i2 & 64) != 0) {
            int i4 = isEngagementSignalsApiAvailable + Imgproc.COLOR_YUV2RGBA_YVYU;
            ICustomTabsCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            j2 = 300;
        } else {
            j2 = j;
        }
        tdsHighlightV2View.setTargetRect(rect, viewGroup, str, onwarmupcompleted, onextracallbackwithresult, i, j2);
        int i6 = ICustomTabsCallbackDefault + 93;
        isEngagementSignalsApiAvailable = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setTargetRect(@NotNull Rect rect, @NotNull ViewGroup viewGroup, @Nullable String str, @NotNull onWarmupCompleted onwarmupcompleted, @NotNull onExtraCallbackWithResult onextracallbackwithresult, int i, long j) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallbackDefault + 83;
        isEngagementSignalsApiAvailable = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(rect, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        this.onActivityResized = rect;
        this.access100 = str;
        this.onMinimized = setTagsokhttp.onExtraCallbackWithResult(this, Integer.valueOf(i));
        IAuthTabCallback(viewGroup, i, this.access100, onwarmupcompleted, onextracallbackwithresult, j);
        int i5 = isEngagementSignalsApiAvailable + 87;
        ICustomTabsCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void onWarmupCompleted(final TdsHighlightV2View tdsHighlightV2View, final onWarmupCompleted onwarmupcompleted, final onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 31;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 71 / 0;
            if (!tdsHighlightV2View.isAttachedToWindow()) {
                return;
            }
        } else if (!tdsHighlightV2View.isAttachedToWindow()) {
            return;
        }
        tdsHighlightV2View.onExtraCallback((Function0<Unit>) new Function0() { // from class: im.toss.uikit.widget.tooltip.TdsHighlightV2View$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = 2 % 2;
                int i5 = onWarmupCompleted + 93;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                Object[] objArr = {this.f$0, onwarmupcompleted, onextracallbackwithresult};
                int iIAuthTabCallback = zziea.IAuthTabCallback();
                Unit unit = (Unit) TdsHighlightV2View.onNavigationEvent(zziea.IAuthTabCallback(), -1662285333, 1662285333, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), iIAuthTabCallback, objArr);
                int i7 = onWarmupCompleted + 97;
                onExtraCallbackWithResult = i7 % 128;
                if (i7 % 2 == 0) {
                    return unit;
                }
                throw null;
            }
        });
        int i4 = ICustomTabsCallbackDefault + 101;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit IAuthTabCallback(TdsHighlightV2View tdsHighlightV2View, onWarmupCompleted onwarmupcompleted, onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 55;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        tdsHighlightV2View.onNavigationEvent(onwarmupcompleted, onextracallbackwithresult);
        Unit unit = Unit.INSTANCE;
        int i4 = isEngagementSignalsApiAvailable + 125;
        ICustomTabsCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IAuthTabCallback(ViewGroup viewGroup, int i, String str, final onWarmupCompleted onwarmupcompleted, final onExtraCallbackWithResult onextracallbackwithresult, long j) {
        int i2 = 2 % 2;
        this.onNavigationEvent = viewGroup;
        this.onMinimized = setTagsokhttp.onExtraCallbackWithResult(this, Integer.valueOf(i));
        this.access100 = str;
        this.writeTypedObject.setText(str);
        postDelayed(new Runnable() { // from class: im.toss.uikit.widget.tooltip.TdsHighlightV2View$$ExternalSyntheticLambda2
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = 2 % 2;
                int i4 = onExtraCallbackWithResult + 97;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                TdsHighlightV2View.onNavigationEvent(this.f$0, onwarmupcompleted, onextracallbackwithresult);
                int i6 = onExtraCallbackWithResult + 53;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }, j);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        if (varyFields.onWarmupCompleted(context)) {
            return;
        }
        setOnTouchListener(new View.OnTouchListener() { // from class: im.toss.uikit.widget.tooltip.TdsHighlightV2View$$ExternalSyntheticLambda3
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int i3 = 2 % 2;
                int i4 = onNavigationEvent + 91;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    TdsHighlightV2View.IAuthTabCallback(this.f$0, view, motionEvent);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                boolean zIAuthTabCallback = TdsHighlightV2View.IAuthTabCallback(this.f$0, view, motionEvent);
                int i5 = onExtraCallbackWithResult + 57;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return zIAuthTabCallback;
            }
        });
        int i3 = ICustomTabsCallbackDefault + 7;
        isEngagementSignalsApiAvailable = i3 % 128;
        int i4 = i3 % 2;
    }

    public static final class IAuthTabCallbackStub implements getAdService {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ Configuration onWarmupCompleted;

        public IAuthTabCallbackStub(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 91;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onWarmupCompleted)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            int i4 = onExtraCallback + 115;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return getspecialfeatureoptinstatus;
        }
    }

    private static final boolean onNavigationEvent(TdsHighlightV2View tdsHighlightV2View, View view, MotionEvent motionEvent) {
        View view2;
        int i = 2 % 2;
        int action = motionEvent.getAction();
        if (action != 0) {
            int i2 = ICustomTabsCallbackDefault + 81;
            int i3 = i2 % 128;
            isEngagementSignalsApiAvailable = i3;
            int i4 = i2 % 2;
            if (action == 1) {
                if (!tdsHighlightV2View.access000) {
                    View view3 = tdsHighlightV2View.onPostMessage;
                    if (view3 != null) {
                        int i5 = i3 + 9;
                        ICustomTabsCallbackDefault = i5 % 128;
                        int i6 = i5 % 2;
                        view3.setPressed(false);
                    }
                    View view4 = tdsHighlightV2View.onPostMessage;
                    if (view4 != null) {
                        view4.onTouchEvent(motionEvent);
                        int i7 = isEngagementSignalsApiAvailable + 29;
                        ICustomTabsCallbackDefault = i7 % 128;
                        int i8 = i7 % 2;
                    }
                    if (tdsHighlightV2View.onExtraCallback(tdsHighlightV2View.onActivityResized, motionEvent.getX(), motionEvent.getY()) && (view2 = tdsHighlightV2View.onPostMessage) != null) {
                        int i9 = ICustomTabsCallbackDefault + 37;
                        isEngagementSignalsApiAvailable = i9 % 128;
                        int i10 = i9 % 2;
                        view2.performClick();
                    }
                }
                tdsHighlightV2View.access000 = false;
            } else if (action == 3) {
                if (!tdsHighlightV2View.access000) {
                    View view5 = tdsHighlightV2View.onPostMessage;
                    if (view5 != null) {
                        int i11 = i3 + 13;
                        ICustomTabsCallbackDefault = i11 % 128;
                        int i12 = i11 % 2;
                        view5.setPressed(false);
                    }
                    View view6 = tdsHighlightV2View.onPostMessage;
                    if (view6 != null) {
                        int i13 = isEngagementSignalsApiAvailable + 91;
                        ICustomTabsCallbackDefault = i13 % 128;
                        if (i13 % 2 != 0) {
                            view6.onTouchEvent(motionEvent);
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        view6.onTouchEvent(motionEvent);
                    }
                }
                tdsHighlightV2View.access000 = false;
                int i14 = ICustomTabsCallbackDefault + 25;
                isEngagementSignalsApiAvailable = i14 % 128;
                int i15 = i14 % 2;
            }
            tdsHighlightV2View.onWarmupCompleted();
        } else {
            boolean zOnExtraCallback = tdsHighlightV2View.onExtraCallback(tdsHighlightV2View.onActivityResized, motionEvent.getX(), motionEvent.getY());
            tdsHighlightV2View.access000 = !zOnExtraCallback;
            if (zOnExtraCallback) {
                View view7 = tdsHighlightV2View.onPostMessage;
                if (view7 != null) {
                    int i16 = isEngagementSignalsApiAvailable + 69;
                    ICustomTabsCallbackDefault = i16 % 128;
                    if (i16 % 2 != 0) {
                        view7.setPressed(false);
                    } else {
                        view7.setPressed(true);
                    }
                    view7.onTouchEvent(motionEvent);
                } else {
                    tdsHighlightV2View.onWarmupCompleted();
                }
            }
        }
        if (!tdsHighlightV2View.access000) {
            int i17 = ICustomTabsCallbackDefault + 77;
            int i18 = i17 % 128;
            isEngagementSignalsApiAvailable = i18;
            int i19 = i17 % 2;
            if (tdsHighlightV2View.onPostMessage == null) {
                int i20 = i18 + 33;
                ICustomTabsCallbackDefault = i20 % 128;
                int i21 = i20 % 2;
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a A[PHI: r5 r7
      0x002a: PHI (r5v2 int) = (r5v1 int), (r5v6 int) binds: [B:11:0x0028, B:8:0x0020] A[DONT_GENERATE, DONT_INLINE]
      0x002a: PHI (r7v2 int) = (r7v1 int), (r7v3 int) binds: [B:11:0x0028, B:8:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean onExtraCallback(Rect rect, float f, float f2) {
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = rect.left;
        int i5 = rect.right;
        int i6 = (int) f;
        if (i4 <= i6 && i6 <= i5) {
            int i7 = isEngagementSignalsApiAvailable + 1;
            ICustomTabsCallbackDefault = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = rect.top;
                i = rect.bottom;
                i2 = (int) f2;
                int i9 = 26 / 0;
                if (i8 <= i2) {
                    if (i2 <= i) {
                        int i10 = isEngagementSignalsApiAvailable + 55;
                        ICustomTabsCallbackDefault = i10 % 128;
                        int i11 = i10 % 2;
                        return true;
                    }
                }
            } else {
                int i12 = rect.top;
                i = rect.bottom;
                i2 = (int) f2;
                if (i12 <= i2) {
                }
            }
        }
        return false;
    }

    public final void setOnDismissListener(@Nullable onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 73;
        int i3 = i2 % 128;
        ICustomTabsCallbackDefault = i3;
        int i4 = i2 % 2;
        this.extraCallback = onextracallback;
        int i5 = i3 + 67;
        isEngagementSignalsApiAvailable = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f A[PHI: r1
      0x001f: PHI (r1v5 o.TextFieldScrollKtExternalSyntheticLambda0) = (r1v4 o.TextFieldScrollKtExternalSyntheticLambda0), (r1v8 o.TextFieldScrollKtExternalSyntheticLambda0) binds: [B:8:0x001d, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallback(Function0<Unit> function0) {
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 93;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 == 0) {
            textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(this);
            int i3 = 95 / 0;
            if (textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult != null) {
                TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent = TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult);
                if (textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent != null) {
                    onLoadStarted.onExtraCallback(textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent, null, null, new IAuthTabCallbackDefault(function0, null), 3, null);
                }
            }
        } else {
            textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(this);
            if (textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult != null) {
            }
        }
        int i4 = ICustomTabsCallbackDefault + 45;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
    }

    static final class IAuthTabCallbackDefault extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ Function0<Unit> $runnable;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallbackDefault(Function0<Unit> function0, access13800<? super IAuthTabCallbackDefault> access13800Var) {
            super(2, access13800Var);
            this.$runnable = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackDefault iAuthTabCallbackDefault = TdsHighlightV2View.this.new IAuthTabCallbackDefault(this.$runnable, access13800Var);
            int i2 = IAuthTabCallback + 95;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return iAuthTabCallbackDefault;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 101;
            onExtraCallback = i2 % 128;
            findResAndMsg findresandmsg2 = findresandmsg;
            access13800<? super Unit> access13800Var2 = access13800Var;
            if (i2 % 2 == 0) {
                return onWarmupCompleted(findresandmsg2, access13800Var2);
            }
            onWarmupCompleted(findresandmsg2, access13800Var2);
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 113;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallbackDefault iAuthTabCallbackDefault = (IAuthTabCallbackDefault) create(findresandmsg, access13800Var);
            if (i3 == 0) {
                iAuthTabCallbackDefault.invokeSuspend(Unit.INSTANCE);
                throw null;
            }
            Object objInvokeSuspend = iAuthTabCallbackDefault.invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 57;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 59;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
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
                if (formatMsgs.onWarmupCompleted(100L, this) == objOnExtraCallback) {
                    int i4 = IAuthTabCallback + 55;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return objOnExtraCallback;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i6 = IAuthTabCallback + 69;
                onExtraCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    ResultKt.onNavigationEvent(obj);
                    int i7 = 36 / 0;
                } else {
                    ResultKt.onNavigationEvent(obj);
                }
            }
            if (TdsHighlightV2View.access000(TdsHighlightV2View.this)) {
                this.$runnable.invoke();
            } else {
                TdsHighlightV2View.onWarmupCompleted(TdsHighlightV2View.this, this.$runnable);
            }
            return Unit.INSTANCE;
        }
    }

    private final boolean IAuthTabCallback() {
        int i = 2 % 2;
        View view = this.onPostMessage;
        boolean z = true;
        if (view == null) {
            int i2 = ICustomTabsCallbackDefault + 83;
            isEngagementSignalsApiAvailable = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        float f = iArr[0];
        float f2 = iArr[1];
        if (this.onMessageChannelReady != f || this.ICustomTabsCallbackStubProxy != f2) {
            int i4 = isEngagementSignalsApiAvailable + 55;
            ICustomTabsCallbackDefault = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 5 % 3;
            }
            z = false;
        }
        this.onMessageChannelReady = f;
        this.ICustomTabsCallbackStubProxy = f2;
        return z;
    }

    static final class IAuthTabCallbackStubProxy extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ onExtraCallbackWithResult $messageAlignment;
        final /* synthetic */ onWarmupCompleted $messagePosition;
        int label;

        public static final /* synthetic */ class onWarmupCompleted {
            public static final /* synthetic */ int[] onExtraCallback;
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            static {
                int[] iArr = new int[onExtraCallbackWithResult.values().length];
                try {
                    iArr[onExtraCallbackWithResult.DEFAULT.ordinal()] = 1;
                    int i = onNavigationEvent + 7;
                    onWarmupCompleted = i % 128;
                    if (i % 2 == 0) {
                        int i2 = 2 % 2;
                    }
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[onExtraCallbackWithResult.LEFT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[onExtraCallbackWithResult.RIGHT.ordinal()] = 3;
                    int i3 = onWarmupCompleted + 33;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    int i5 = 2 % 2;
                } catch (NoSuchFieldError unused3) {
                }
                onExtraCallback = iArr;
                int i6 = onWarmupCompleted + 81;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 62 / 0;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallbackStubProxy(onExtraCallbackWithResult onextracallbackwithresult, onWarmupCompleted onwarmupcompleted, access13800<? super IAuthTabCallbackStubProxy> access13800Var) {
            super(2, access13800Var);
            this.$messageAlignment = onextracallbackwithresult;
            this.$messagePosition = onwarmupcompleted;
        }

        public static /* synthetic */ void IAuthTabCallback(ValueAnimator valueAnimator, TdsHighlightV2View tdsHighlightV2View, ValueAnimator valueAnimator2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 31;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback(valueAnimator, tdsHighlightV2View, valueAnimator2);
            if (i3 != 0) {
                throw null;
            }
        }

        public static /* synthetic */ void onExtraCallback(TdsHighlightV2View tdsHighlightV2View, View view) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 97;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted(tdsHighlightV2View, view);
            if (i3 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = onExtraCallback + 55;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 33 / 0;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy = TdsHighlightV2View.this.new IAuthTabCallbackStubProxy(this.$messageAlignment, this.$messagePosition, access13800Var);
            int i2 = onNavigationEvent + 87;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return iAuthTabCallbackStubProxy;
            }
            throw null;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 25;
            onNavigationEvent = i2 % 128;
            findResAndMsg findresandmsg2 = findresandmsg;
            access13800<? super Unit> access13800Var2 = access13800Var;
            if (i2 % 2 != 0) {
                return onWarmupCompleted(findresandmsg2, access13800Var2);
            }
            onWarmupCompleted(findresandmsg2, access13800Var2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            Object objInvokeSuspend;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 71;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy = (IAuthTabCallbackStubProxy) create(findresandmsg, access13800Var);
            if (i3 != 0) {
                objInvokeSuspend = iAuthTabCallbackStubProxy.invokeSuspend(Unit.INSTANCE);
                int i4 = 92 / 0;
            } else {
                objInvokeSuspend = iAuthTabCallbackStubProxy.invokeSuspend(Unit.INSTANCE);
            }
            int i5 = onExtraCallback + 101;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        /* JADX WARN: Type inference failed for: r1v9, types: [android.view.View, im.toss.uikit.widget.tooltip.TdsHighlightV2View] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int iWidth;
            int iHeight;
            int left;
            float fIAuthTabCallbackDefault;
            float fAsBinder;
            int iOnExtraCallbackWithResult;
            int i = 2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            if (TdsHighlightV2View.onNavigationEvent(TdsHighlightV2View.this) == null || !(!StringsKt__StringsKt.isBlank(r2))) {
                ((TdsImageView) TdsHighlightV2View.onNavigationEvent(zziea.IAuthTabCallback(), -1232163131, 1232163138, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), new Object[]{TdsHighlightV2View.this})).setVisibility(8);
                TdsHighlightV2View.onWarmupCompleted(TdsHighlightV2View.this).setVisibility(8);
            } else {
                int i2 = onExtraCallback + 47;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                View viewIAuthTabCallbackStub = TdsHighlightV2View.IAuthTabCallbackStub(TdsHighlightV2View.this);
                if (viewIAuthTabCallbackStub != null) {
                    iWidth = viewIAuthTabCallbackStub.getWidth();
                } else {
                    iWidth = ((Rect) TdsHighlightV2View.onNavigationEvent(zziea.IAuthTabCallback(), -1910874403, 1910874407, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), new Object[]{TdsHighlightV2View.this})).width();
                }
                View viewIAuthTabCallbackStub2 = TdsHighlightV2View.IAuthTabCallbackStub(TdsHighlightV2View.this);
                if (viewIAuthTabCallbackStub2 != null) {
                    iHeight = viewIAuthTabCallbackStub2.getHeight();
                } else {
                    iHeight = ((Rect) TdsHighlightV2View.onNavigationEvent(zziea.IAuthTabCallback(), -1910874403, 1910874407, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), new Object[]{TdsHighlightV2View.this})).height();
                }
                View viewIAuthTabCallbackStub3 = TdsHighlightV2View.IAuthTabCallbackStub(TdsHighlightV2View.this);
                if (viewIAuthTabCallbackStub3 != null) {
                    int i4 = onNavigationEvent + 109;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    left = viewIAuthTabCallbackStub3.getLeft();
                } else {
                    left = ((Rect) TdsHighlightV2View.onNavigationEvent(zziea.IAuthTabCallback(), -1910874403, 1910874407, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), new Object[]{TdsHighlightV2View.this})).left;
                }
                if (TdsHighlightV2View.IAuthTabCallbackStub(TdsHighlightV2View.this) != null) {
                    fIAuthTabCallbackDefault = TdsHighlightV2View.IAuthTabCallbackDefault(TdsHighlightV2View.this);
                } else {
                    fIAuthTabCallbackDefault = ((Rect) TdsHighlightV2View.onNavigationEvent(zziea.IAuthTabCallback(), -1910874403, 1910874407, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), new Object[]{TdsHighlightV2View.this})).top;
                }
                if (TdsHighlightV2View.IAuthTabCallbackStub(TdsHighlightV2View.this) != null) {
                    fAsBinder = TdsHighlightV2View.asBinder(TdsHighlightV2View.this);
                } else {
                    fAsBinder = ((Rect) TdsHighlightV2View.onNavigationEvent(zziea.IAuthTabCallback(), -1910874403, 1910874407, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), new Object[]{TdsHighlightV2View.this})).left;
                }
                TdsHighlightV2View tdsHighlightV2View = TdsHighlightV2View.this;
                TdsHighlightV2View.onNavigationEvent(zziea.IAuthTabCallback(), -544656461, 544656464, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), new Object[]{tdsHighlightV2View, Boolean.valueOf(TdsHighlightV2View.IAuthTabCallbackStub(tdsHighlightV2View) instanceof TdsListRowV1View)});
                TdsHighlightV2View tdsHighlightV2View2 = TdsHighlightV2View.this;
                TdsHighlightV2View.onNavigationEvent(tdsHighlightV2View2, TdsHighlightV2View.IAuthTabCallbackStub(tdsHighlightV2View2) instanceof TdsListRowV1View ? -setTagsokhttp.onExtraCallbackWithResult(TdsHighlightV2View.this, access14000.onNavigationEvent(10)) : Math.min(left + setTagsokhttp.onExtraCallbackWithResult(TdsHighlightV2View.this, access14000.onNavigationEvent(3)), setTagsokhttp.onExtraCallbackWithResult(TdsHighlightV2View.this, access14000.onNavigationEvent(10))));
                TdsHighlightV2View tdsHighlightV2View3 = TdsHighlightV2View.this;
                if (TdsHighlightV2View.IAuthTabCallbackStub(tdsHighlightV2View3) instanceof TdsListRowV1View) {
                    iOnExtraCallbackWithResult = setTagsokhttp.onExtraCallbackWithResult(TdsHighlightV2View.this, access14000.onNavigationEvent(0));
                    int i6 = onNavigationEvent + 61;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                } else {
                    iOnExtraCallbackWithResult = setTagsokhttp.onExtraCallbackWithResult(TdsHighlightV2View.this, access14000.onNavigationEvent(10));
                }
                TdsHighlightV2View.onWarmupCompleted(tdsHighlightV2View3, iOnExtraCallbackWithResult);
                float f = fAsBinder + (iWidth / 2);
                ((TdsImageView) TdsHighlightV2View.onNavigationEvent(zziea.IAuthTabCallback(), -1232163131, 1232163138, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), new Object[]{TdsHighlightV2View.this})).setX(f - setTagsokhttp.onExtraCallbackWithResult(TdsHighlightV2View.this, access14000.onNavigationEvent(12)));
                int i8 = onWarmupCompleted.onExtraCallback[this.$messageAlignment.ordinal()];
                if (i8 != 1) {
                    if (i8 == 2) {
                        TdsHighlightV2View.onWarmupCompleted(TdsHighlightV2View.this).setX(setTagsokhttp.onExtraCallbackWithResult(TdsHighlightV2View.this, access14000.onNavigationEvent(10)));
                    } else if (i8 != 3) {
                        TdsHighlightV2View.onWarmupCompleted(TdsHighlightV2View.this).setX((TdsHighlightV2View.this.getWidth() - TdsHighlightV2View.onWarmupCompleted(TdsHighlightV2View.this).getWidth()) / 2.0f);
                    } else {
                        TdsHighlightV2View.onWarmupCompleted(TdsHighlightV2View.this).setX((TdsHighlightV2View.this.getWidth() - TdsHighlightV2View.onWarmupCompleted(TdsHighlightV2View.this).getWidth()) - setTagsokhttp.onExtraCallbackWithResult(TdsHighlightV2View.this, access14000.onNavigationEvent(10)));
                    }
                } else if (f - (TdsHighlightV2View.onWarmupCompleted(TdsHighlightV2View.this).getWidth() / 2) < setTagsokhttp.onExtraCallbackWithResult(TdsHighlightV2View.this, access14000.onNavigationEvent(10))) {
                    TdsHighlightV2View.onWarmupCompleted(TdsHighlightV2View.this).setX(setTagsokhttp.onExtraCallbackWithResult(TdsHighlightV2View.this, access14000.onNavigationEvent(10)));
                } else if ((TdsHighlightV2View.onWarmupCompleted(TdsHighlightV2View.this).getWidth() / 2) + f > TdsHighlightV2View.this.getWidth() - setTagsokhttp.onExtraCallbackWithResult(TdsHighlightV2View.this, access14000.onNavigationEvent(10))) {
                    TdsHighlightV2View.onWarmupCompleted(TdsHighlightV2View.this).setX((TdsHighlightV2View.this.getWidth() - TdsHighlightV2View.onWarmupCompleted(TdsHighlightV2View.this).getWidth()) - setTagsokhttp.onExtraCallbackWithResult(TdsHighlightV2View.this, access14000.onNavigationEvent(10)));
                } else {
                    TdsHighlightV2View.onWarmupCompleted(TdsHighlightV2View.this).setX(f - (TdsHighlightV2View.onWarmupCompleted(TdsHighlightV2View.this).getWidth() / 2));
                    int i9 = onNavigationEvent + 33;
                    onExtraCallback = i9 % 128;
                    int i10 = i9 % 2;
                }
                if (this.$messagePosition == onWarmupCompleted.TOP) {
                    TdsHighlightV2View.onNavigationEvent(TdsHighlightV2View.this, false);
                    ((TdsImageView) TdsHighlightV2View.onNavigationEvent(zziea.IAuthTabCallback(), -1232163131, 1232163138, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), new Object[]{TdsHighlightV2View.this})).setRotation(180.0f);
                    ((TdsImageView) TdsHighlightV2View.onNavigationEvent(zziea.IAuthTabCallback(), -1232163131, 1232163138, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), new Object[]{TdsHighlightV2View.this})).setY(((fIAuthTabCallbackDefault - setTagsokhttp.onExtraCallbackWithResult(TdsHighlightV2View.this, access14000.onNavigationEvent(12))) - setTagsokhttp.onExtraCallbackWithResult(TdsHighlightV2View.this, access14000.onNavigationEvent(24))) - (TdsHighlightV2View.IAuthTabCallback_Parcel(TdsHighlightV2View.this) ? 0.0f : setTagsokhttp.onExtraCallbackWithResult(TdsHighlightV2View.this, access14000.onNavigationEvent(10))));
                    TdsHighlightV2View.onWarmupCompleted(TdsHighlightV2View.this).setY(((TdsImageView) TdsHighlightV2View.onNavigationEvent(zziea.IAuthTabCallback(), -1232163131, 1232163138, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), new Object[]{TdsHighlightV2View.this})).getY() - TdsHighlightV2View.onWarmupCompleted(TdsHighlightV2View.this).getHeight());
                } else {
                    TdsHighlightV2View.onNavigationEvent(TdsHighlightV2View.this, true);
                    ((TdsImageView) TdsHighlightV2View.onNavigationEvent(zziea.IAuthTabCallback(), -1232163131, 1232163138, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), new Object[]{TdsHighlightV2View.this})).setRotation(0.0f);
                    TdsImageView tdsImageView = (TdsImageView) TdsHighlightV2View.onNavigationEvent(zziea.IAuthTabCallback(), -1232163131, 1232163138, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), new Object[]{TdsHighlightV2View.this});
                    float f2 = iHeight;
                    float fOnExtraCallbackWithResult = setTagsokhttp.onExtraCallbackWithResult(TdsHighlightV2View.this, access14000.onNavigationEvent(12));
                    if (TdsHighlightV2View.IAuthTabCallback_Parcel(TdsHighlightV2View.this)) {
                        int i11 = onExtraCallback + 69;
                        onNavigationEvent = i11 % 128;
                        int i12 = i11 % 2;
                    } else {
                        fOnExtraCallbackWithResult = setTagsokhttp.onExtraCallbackWithResult(TdsHighlightV2View.this, access14000.onNavigationEvent(10));
                    }
                    tdsImageView.setY(fIAuthTabCallbackDefault + f2 + fOnExtraCallbackWithResult + fOnExtraCallbackWithResult);
                    TextView textViewOnWarmupCompleted = TdsHighlightV2View.onWarmupCompleted(TdsHighlightV2View.this);
                    float y = ((TdsImageView) TdsHighlightV2View.onNavigationEvent(zziea.IAuthTabCallback(), -1232163131, 1232163138, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), new Object[]{TdsHighlightV2View.this})).getY();
                    Object[] objArr = {TdsHighlightV2View.this};
                    textViewOnWarmupCompleted.setY(y + ((TdsImageView) TdsHighlightV2View.onNavigationEvent(zziea.IAuthTabCallback(), -1232163131, 1232163138, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), objArr)).getHeight());
                }
                TdsHighlightV2View.IAuthTabCallbackStubProxy(TdsHighlightV2View.this);
            }
            TdsHighlightV2View.access100(TdsHighlightV2View.this);
            if (processDeepLink.onExtraCallback()) {
                TdsHighlightV2View.onExtraCallback(TdsHighlightV2View.this, 1.0f);
            }
            float fIAuthTabCallback = deprecated_certificatePinner.onExtraCallbackWithResult.onExtraCallbackWithResult().IAuthTabCallback();
            TdsHighlightV2View tdsHighlightV2View4 = TdsHighlightV2View.this;
            final ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            final TdsHighlightV2View tdsHighlightV2View5 = TdsHighlightV2View.this;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: im.toss.uikit.widget.tooltip.TdsHighlightV2View$updateHighlightLayer$1$$ExternalSyntheticLambda0
                private static int onExtraCallbackWithResult = 0;
                private static int onWarmupCompleted = 1;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int i13 = 2 % 2;
                    int i14 = onWarmupCompleted + 107;
                    onExtraCallbackWithResult = i14 % 128;
                    int i15 = i14 % 2;
                    ValueAnimator valueAnimator2 = valueAnimatorOfFloat;
                    if (i15 == 0) {
                        TdsHighlightV2View.IAuthTabCallbackStubProxy.IAuthTabCallback(valueAnimator2, tdsHighlightV2View5, valueAnimator);
                    } else {
                        TdsHighlightV2View.IAuthTabCallbackStubProxy.IAuthTabCallback(valueAnimator2, tdsHighlightV2View5, valueAnimator);
                        int i16 = 39 / 0;
                    }
                }
            });
            valueAnimatorOfFloat.setDuration((long) fIAuthTabCallback);
            valueAnimatorOfFloat.start();
            TdsHighlightV2View.onNavigationEvent(tdsHighlightV2View4, valueAnimatorOfFloat);
            Context context = TdsHighlightV2View.this.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            if (varyFields.onWarmupCompleted(context)) {
                final ?? r1 = TdsHighlightV2View.this;
                r1.setOnClickListener(new View.OnClickListener() { // from class: im.toss.uikit.widget.tooltip.TdsHighlightV2View$updateHighlightLayer$1$$ExternalSyntheticLambda1
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i13 = 2 % 2;
                        int i14 = IAuthTabCallback + 1;
                        onExtraCallbackWithResult = i14 % 128;
                        if (i14 % 2 == 0) {
                            TdsHighlightV2View.IAuthTabCallbackStubProxy.onExtraCallback(r1, view);
                            throw null;
                        }
                        TdsHighlightV2View.IAuthTabCallbackStubProxy.onExtraCallback(r1, view);
                        int i15 = onExtraCallbackWithResult + 73;
                        IAuthTabCallback = i15 % 128;
                        int i16 = i15 % 2;
                    }
                });
            } else {
                TdsHighlightV2View.this.setClickable(false);
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static final void onExtraCallback(ValueAnimator valueAnimator, TdsHighlightV2View tdsHighlightV2View, ValueAnimator valueAnimator2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 53;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object animatedValue = valueAnimator.getAnimatedValue();
            Intrinsics.checkNotNull(animatedValue, "");
            float fFloatValue = ((Float) animatedValue).floatValue();
            deprecated_certificatePinner deprecated_certificatepinner = deprecated_certificatePinner.onExtraCallbackWithResult;
            TdsHighlightV2View.onWarmupCompleted(tdsHighlightV2View, 1.0f - RangesKt___RangesKt.coerceAtLeast(deprecated_certificatepinner.onExtraCallbackWithResult().getInterpolation(RangesKt___RangesKt.coerceIn(fFloatValue, 0.0f, 1.0f)), 0.0f));
            if (!processDeepLink.onExtraCallback()) {
                int i4 = onExtraCallback + 45;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                TdsHighlightV2View.onExtraCallback(tdsHighlightV2View, (deprecated_certificatepinner.onExtraCallbackWithResult().getInterpolation(fFloatValue) * 0.1f) + 0.9f);
            }
            tdsHighlightV2View.invalidate();
            int i6 = onExtraCallback + 23;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
        }

        private static final void onWarmupCompleted(TdsHighlightV2View tdsHighlightV2View, View view) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 19;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            tdsHighlightV2View.onWarmupCompleted();
            if (i3 == 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onNavigationEvent(onWarmupCompleted onwarmupcompleted, onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 85;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(this);
        if (textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult != null) {
            int i4 = isEngagementSignalsApiAvailable + 113;
            ICustomTabsCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent = TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult);
            if (textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent != null) {
                onLoadStarted.onExtraCallback(textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent, null, null, new IAuthTabCallbackStubProxy(onextracallbackwithresult, onwarmupcompleted, null), 3, null);
            }
        }
    }

    public final void onWarmupCompleted() {
        int i = 2 % 2;
        if (this.getInterfaceDescriptor) {
            return;
        }
        this.getInterfaceDescriptor = true;
        ValueAnimator valueAnimator = this.asBinder;
        if (valueAnimator != null) {
            int i2 = ICustomTabsCallbackDefault + 45;
            isEngagementSignalsApiAvailable = i2 % 128;
            if (i2 % 2 == 0) {
                valueAnimator.end();
                throw null;
            }
            valueAnimator.end();
        }
        runOnUiThreadDelayed runonuithreaddelayed = this.asInterface;
        if (runonuithreaddelayed != null) {
            int i3 = ICustomTabsCallbackDefault + 55;
            isEngagementSignalsApiAvailable = i3 % 128;
            int i4 = i3 % 2;
            runonuithreaddelayed.onNavigationEvent();
        }
        runOnUiThreadDelayed runonuithreaddelayed2 = this.IAuthTabCallbackDefault;
        if (runonuithreaddelayed2 != null) {
            runonuithreaddelayed2.onNavigationEvent();
        }
        ValueAnimator valueAnimator2 = this.onTransact;
        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
            ValueAnimator valueAnimator3 = this.onTransact;
            if (valueAnimator3 != null) {
                int i5 = ICustomTabsCallbackDefault + 103;
                isEngagementSignalsApiAvailable = i5 % 128;
                if (i5 % 2 == 0) {
                    valueAnimator3.start();
                    throw null;
                }
                valueAnimator3.start();
            }
            onExtraCallback();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallback() {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 31;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(this);
        if (textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult != null) {
            int i4 = isEngagementSignalsApiAvailable + 49;
            ICustomTabsCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent = TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult);
            if (textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent != null) {
                onLoadStarted.onExtraCallback(textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent, null, null, new onTransact(null), 3, null);
                int i6 = ICustomTabsCallbackDefault + 7;
                isEngagementSignalsApiAvailable = i6 % 128;
                int i7 = i6 % 2;
            }
        }
    }

    static final class onTransact extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        int label;

        onTransact(access13800<? super onTransact> access13800Var) {
            super(2, access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onTransact ontransact = TdsHighlightV2View.this.new onTransact(access13800Var);
            int i2 = onExtraCallbackWithResult + 17;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return ontransact;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 79;
            onExtraCallbackWithResult = i2 % 128;
            findResAndMsg findresandmsg2 = findresandmsg;
            access13800<? super Unit> access13800Var2 = access13800Var;
            if (i2 % 2 != 0) {
                return onNavigationEvent(findresandmsg2, access13800Var2);
            }
            onNavigationEvent(findresandmsg2, access13800Var2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 67;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onTransact ontransact = (onTransact) create(findresandmsg, access13800Var);
            if (i3 == 0) {
                ontransact.invokeSuspend(Unit.INSTANCE);
                throw null;
            }
            Object objInvokeSuspend = ontransact.invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 41;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onExtraCallbackWithResult + 33;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                long jIAuthTabCallback = deprecated_certificatePinner.onExtraCallbackWithResult.onExtraCallbackWithResult().IAuthTabCallback();
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(jIAuthTabCallback, this) == objOnExtraCallback) {
                    return objOnExtraCallback;
                }
            }
            ValueAnimator valueAnimatorOnExtraCallback = TdsHighlightV2View.onExtraCallback(TdsHighlightV2View.this);
            if (valueAnimatorOnExtraCallback != null) {
                valueAnimatorOnExtraCallback.end();
                int i5 = onExtraCallbackWithResult + 55;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
            }
            return Unit.INSTANCE;
        }
    }

    private final void asInterface() {
        int i = 2 % 2;
        deprecated_certificatePinner deprecated_certificatepinner = deprecated_certificatePinner.onExtraCallbackWithResult;
        long jMax = Math.max(deprecated_certificatepinner.IAuthTabCallbackStub().IAuthTabCallback(), 1200L);
        long jIAuthTabCallback = deprecated_certificatepinner.IAuthTabCallbackStub().IAuthTabCallback();
        long jIAuthTabCallback2 = deprecated_certificatepinner.asInterface().IAuthTabCallback();
        long jIAuthTabCallback3 = deprecated_certificatepinner.onExtraCallbackWithResult().IAuthTabCallback();
        float f = jMax;
        final float f2 = f / jIAuthTabCallback3;
        final float f3 = f / jIAuthTabCallback2;
        final float f4 = f / jIAuthTabCallback;
        final ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: im.toss.uikit.widget.tooltip.TdsHighlightV2View$$ExternalSyntheticLambda1
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 49;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Object obj = null;
                ValueAnimator valueAnimator2 = valueAnimatorOfFloat;
                TdsHighlightV2View tdsHighlightV2View = this;
                if (i4 == 0) {
                    TdsHighlightV2View.onNavigationEvent(valueAnimator2, tdsHighlightV2View, f4, f3, f2, valueAnimator);
                    obj.hashCode();
                    throw null;
                }
                TdsHighlightV2View.onNavigationEvent(valueAnimator2, tdsHighlightV2View, f4, f3, f2, valueAnimator);
                int i5 = onExtraCallbackWithResult + 65;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }
        });
        valueAnimatorOfFloat.setDuration(jMax);
        valueAnimatorOfFloat.setInterpolator(Address.onNavigationEvent.asInterface());
        Intrinsics.checkNotNull(valueAnimatorOfFloat);
        valueAnimatorOfFloat.addListener(new asBinder());
        this.onTransact = valueAnimatorOfFloat;
        int i2 = isEngagementSignalsApiAvailable + Imgproc.COLOR_YUV2RGBA_YVYU;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [android.view.View, im.toss.uikit.widget.tooltip.TdsHighlightV2View] */
    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        ValueAnimator valueAnimator = (ValueAnimator) objArr[0];
        ?? r1 = (TdsHighlightV2View) objArr[1];
        float fFloatValue = ((Number) objArr[2]).floatValue();
        float fFloatValue2 = ((Number) objArr[3]).floatValue();
        float fFloatValue3 = ((Number) objArr[4]).floatValue();
        ValueAnimator valueAnimator2 = (ValueAnimator) objArr[5];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 31;
        isEngagementSignalsApiAvailable = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(valueAnimator2, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Intrinsics.checkNotNull(animatedValue, "");
            ((Float) animatedValue).floatValue();
            processDeepLink.onExtraCallback();
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(valueAnimator2, "");
        Object animatedValue2 = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue2, "");
        float fFloatValue4 = ((Float) animatedValue2).floatValue();
        if (!processDeepLink.onExtraCallback()) {
            ((TdsHighlightV2View) r1).onExtraCallback = deprecated_certificatePinner.onExtraCallbackWithResult.IAuthTabCallbackStub().getInterpolation(Math.min(1.0f, fFloatValue * fFloatValue4));
        }
        deprecated_certificatePinner deprecated_certificatepinner = deprecated_certificatePinner.onExtraCallbackWithResult;
        ((TdsHighlightV2View) r1).onRelationshipValidationResult = deprecated_certificatepinner.asInterface().getInterpolation(Math.min(1.0f, fFloatValue2 * fFloatValue4));
        ((TdsHighlightV2View) r1).onWarmupCompleted = deprecated_certificatepinner.onExtraCallbackWithResult().getInterpolation(Math.min(1.0f, fFloatValue4 * fFloatValue3));
        ((TdsHighlightV2View) r1).IAuthTabCallbackStub.setAlpha(1.0f - ((TdsHighlightV2View) r1).onRelationshipValidationResult);
        ((TdsHighlightV2View) r1).writeTypedObject.setAlpha(1.0f - ((TdsHighlightV2View) r1).onRelationshipValidationResult);
        r1.invalidate();
        int i3 = isEngagementSignalsApiAvailable + 19;
        ICustomTabsCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 123;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Float fValueOf = Float.valueOf(1.0f);
        Object obj = null;
        if (this.access100 == null) {
            int i4 = ICustomTabsCallbackDefault + 1;
            isEngagementSignalsApiAvailable = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        float y = this.IAuthTabCallbackStub.getY();
        float y2 = this.writeTypedObject.getY();
        boolean z = this.readTypedObject;
        float fOnExtraCallbackWithResult = setTagsokhttp.onExtraCallbackWithResult(this, 10);
        if (!z) {
            fOnExtraCallbackWithResult = -fOnExtraCallbackWithResult;
        }
        float f = fOnExtraCallbackWithResult;
        this.writeTypedObject.setVisibility(0);
        this.IAuthTabCallbackStub.setVisibility(0);
        this.writeTypedObject.setAlpha(0.0f);
        this.IAuthTabCallbackStub.setAlpha(0.0f);
        if (processDeepLink.onExtraCallback()) {
            pxToDp.onWarmupCompleted onwarmupcompleted = pxToDp.onWarmupCompleted.IAuthTabCallback;
            pxToDp.IAuthTabCallback iAuthTabCallback = pxToDp.IAuthTabCallback.onExtraCallback;
            TdsImageView tdsImageView = this.IAuthTabCallbackStub;
            deprecated_certificatePinner deprecated_certificatepinner = deprecated_certificatePinner.onExtraCallbackWithResult;
            List listListOf = CollectionsKt__CollectionsJVMKt.listOf(RallysKt.onWarmupCompleted((View) null, iAuthTabCallback, CollectionsKt__CollectionsJVMKt.listOf(RallysKt.onWarmupCompleted(tdsImageView, CollectionsKt__CollectionsJVMKt.listOf(isMuted.onNavigationEvent((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.onNavigationEvent()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, fValueOf, (Function1) null, 5, (Object) null)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 4089, (Object) null));
            Boolean bool = Boolean.FALSE;
            this.IAuthTabCallbackDefault = isFireOS.onExtraCallbackWithResult(RallysKt.onWarmupCompleted((View) null, onwarmupcompleted, listListOf, 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, bool, 0, 0L, false, 3833, (Object) null), false, 1, (Object) null);
            this.asInterface = isFireOS.onExtraCallbackWithResult(RallysKt.onWarmupCompleted((View) null, onwarmupcompleted, CollectionsKt__CollectionsJVMKt.listOf(RallysKt.onWarmupCompleted((View) null, iAuthTabCallback, CollectionsKt__CollectionsJVMKt.listOf(RallysKt.onWarmupCompleted(this.writeTypedObject, CollectionsKt__CollectionsJVMKt.listOf(isMuted.onNavigationEvent((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.onNavigationEvent()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, fValueOf, (Function1) null, 5, (Object) null)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 4089, (Object) null)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, bool, 0, 0L, false, 3833, (Object) null), false, 1, (Object) null);
            return;
        }
        pxToDp.onWarmupCompleted onwarmupcompleted2 = pxToDp.onWarmupCompleted.IAuthTabCallback;
        pxToDp.IAuthTabCallback iAuthTabCallback2 = pxToDp.IAuthTabCallback.onExtraCallback;
        TdsImageView tdsImageView2 = this.IAuthTabCallbackStub;
        deprecated_certificatePinner deprecated_certificatepinner2 = deprecated_certificatePinner.onExtraCallbackWithResult;
        Rally rallyOnWarmupCompleted = RallysKt.onWarmupCompleted(tdsImageView2, CollectionsKt__CollectionsJVMKt.listOf(isMuted.onNavigationEvent((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner2.onNavigationEvent()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, fValueOf, (Function1) null, 5, (Object) null)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null);
        TdsImageView tdsImageView3 = this.IAuthTabCallbackStub;
        AppLovinSdkSettings appLovinSdkSettings = new AppLovinSdkSettings();
        Address address = Address.onNavigationEvent;
        Object[] objArr = {appLovinSdkSettings.onWarmupCompleted(address.asBinder()), 600};
        float f2 = y + f;
        List listListOf2 = CollectionsKt__CollectionsKt.listOf((Object[]) new isFireOS[]{RallysKt.onWarmupCompleted((View) null, iAuthTabCallback2, CollectionsKt__CollectionsKt.listOf((Object[]) new Rally[]{rallyOnWarmupCompleted, RallysKt.onWarmupCompleted(tdsImageView3, CollectionsKt__CollectionsJVMKt.listOf(isMuted.getInterfaceDescriptor((AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 1045515484, objArr, -1045515484, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()), Float.valueOf(f2), Float.valueOf(y), (Function1) null, 4, (Object) null)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null)}), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 4089, (Object) null), RallysKt.onWarmupCompleted(this.IAuthTabCallbackStub, CollectionsKt__CollectionsJVMKt.listOf(isMuted.getInterfaceDescriptor((AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 1045515484, new Object[]{new AppLovinSdkSettings().onWarmupCompleted(address.asBinder()), 800}, -1045515484, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()), Float.valueOf(y), Float.valueOf(f2), (Function1) null, 4, (Object) null)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null), RallysKt.onWarmupCompleted(this.IAuthTabCallbackStub, CollectionsKt__CollectionsJVMKt.listOf(isMuted.getInterfaceDescriptor((AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 1045515484, new Object[]{new AppLovinSdkSettings().onWarmupCompleted(address.asBinder()), 800}, -1045515484, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()), Float.valueOf(f2), Float.valueOf(y), (Function1) null, 4, (Object) null)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null)});
        Boolean bool2 = Boolean.FALSE;
        this.IAuthTabCallbackDefault = isFireOS.onExtraCallbackWithResult(RallysKt.onWarmupCompleted((View) null, onwarmupcompleted2, listListOf2, 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, bool2, 0, 0L, false, 3833, (Object) null), false, 1, (Object) null);
        float f3 = f + y2;
        this.asInterface = isFireOS.onExtraCallbackWithResult(RallysKt.onWarmupCompleted((View) null, onwarmupcompleted2, CollectionsKt__CollectionsKt.listOf((Object[]) new isFireOS[]{RallysKt.onWarmupCompleted((View) null, iAuthTabCallback2, CollectionsKt__CollectionsKt.listOf((Object[]) new Rally[]{RallysKt.onWarmupCompleted(this.writeTypedObject, CollectionsKt__CollectionsJVMKt.listOf(isMuted.onNavigationEvent((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner2.onNavigationEvent()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, fValueOf, (Function1) null, 5, (Object) null)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null), RallysKt.onWarmupCompleted(this.writeTypedObject, CollectionsKt__CollectionsJVMKt.listOf(isMuted.getInterfaceDescriptor((AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 1045515484, new Object[]{new AppLovinSdkSettings().onWarmupCompleted(address.asBinder()), 600}, -1045515484, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()), Float.valueOf(f3), Float.valueOf(y2), (Function1) null, 4, (Object) null)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null)}), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 4089, (Object) null), RallysKt.onWarmupCompleted(this.writeTypedObject, CollectionsKt__CollectionsJVMKt.listOf(isMuted.getInterfaceDescriptor((AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 1045515484, new Object[]{new AppLovinSdkSettings().onWarmupCompleted(address.asBinder()), 800}, -1045515484, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()), Float.valueOf(y2), Float.valueOf(f3), (Function1) null, 4, (Object) null)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null), RallysKt.onWarmupCompleted(this.writeTypedObject, CollectionsKt__CollectionsJVMKt.listOf(isMuted.getInterfaceDescriptor((AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 1045515484, new Object[]{new AppLovinSdkSettings().onWarmupCompleted(address.asBinder()), 800}, -1045515484, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()), Float.valueOf(f3), Float.valueOf(y2), (Function1) null, 4, (Object) null)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null)}), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, bool2, 0, 0L, false, 3833, (Object) null), false, 1, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void dispatchDraw(@NotNull Canvas canvas) {
        float f;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(canvas, "");
        View view = this.onPostMessage;
        int width = view != null ? view.getWidth() : this.onActivityResized.width();
        View view2 = this.onPostMessage;
        int height = view2 != null ? view2.getHeight() : this.onActivityResized.height();
        View view3 = this.onPostMessage;
        float f2 = view3 != null ? this.onMessageChannelReady : this.onActivityResized.left;
        if (view3 != null) {
            int i2 = ICustomTabsCallbackDefault + 63;
            isEngagementSignalsApiAvailable = i2 % 128;
            int i3 = i2 % 2;
            f = this.ICustomTabsCallbackStubProxy;
        } else {
            f = this.onActivityResized.top;
        }
        float width2 = getWidth();
        float height2 = getHeight();
        float f3 = this.IAuthTabCallback_Parcel;
        float f4 = f2 - f3;
        float f5 = f2 + width + f3;
        float f6 = this.onUnminimized;
        float f7 = f - f6;
        float f8 = f + height + f6;
        float f9 = (f5 + f4) / 2.0f;
        float f10 = (f8 + f7) / 2.0f;
        float f11 = 1.0f - this.ICustomTabsCallback;
        float f12 = f4 + ((f9 - f4) * f11);
        float f13 = f5 + ((f9 - f5) * f11);
        float f14 = f7 + ((f10 - f7) * f11);
        float f15 = f8 + ((f10 - f8) * f11);
        float f16 = this.onExtraCallback;
        float f17 = (((width2 * 2.5f) - (f13 - f12)) * f16) / 2.0f;
        float f18 = f12 - f17;
        float f19 = (((height2 * 1.5f) - (f15 - f14)) * f16) / 2.0f;
        float f20 = f14 - f19;
        float f21 = f13 + f17;
        float f22 = f15 + f19;
        float fOnExtraCallbackWithResult = this.onMinimized + (f16 * setTagsokhttp.onExtraCallbackWithResult(this, 1000));
        Path path = new Path();
        path.addRoundRect(f18, f20, f21, f22, fOnExtraCallbackWithResult, fOnExtraCallbackWithResult, Path.Direction.CW);
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            int i4 = isEngagementSignalsApiAvailable + 43;
            ICustomTabsCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            canvas.clipOutPath(path);
        } else {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
        }
        canvas.drawColor(new setHasUserConsent(onNavigationEvent(), 0).IAuthTabCallback(this.onWarmupCompleted).intValue());
        if (this.onWarmupCompleted < 0.9f) {
            canvas.drawRoundRect(f18, f20, f21, f22, fOnExtraCallbackWithResult, fOnExtraCallbackWithResult, this.extraCallbackWithResult);
        }
        canvas.restore();
        super.dispatchDraw(canvas);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onWarmupCompleted {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onWarmupCompleted[] $VALUES;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        private static int onWarmupCompleted;
        public static final onWarmupCompleted TOP = new onWarmupCompleted("TOP", 0);
        public static final onWarmupCompleted BOTTOM = new onWarmupCompleted("BOTTOM", 1);

        private static final /* synthetic */ onWarmupCompleted[] $values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 77;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            onWarmupCompleted[] onwarmupcompletedArr = {TOP, BOTTOM};
            int i5 = i2 + 63;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return onwarmupcompletedArr;
        }

        public static EnumEntries<onWarmupCompleted> getEntries() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + Imgproc.COLOR_YUV2RGB_YVYU;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            EnumEntries<onWarmupCompleted> enumEntries = $ENTRIES;
            if (i3 == 0) {
                int i4 = 60 / 0;
            }
            return enumEntries;
        }

        public static onWarmupCompleted valueOf(String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 1;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) Enum.valueOf(onWarmupCompleted.class, str);
            int i4 = IAuthTabCallback + 15;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return onwarmupcompleted;
        }

        public static onWarmupCompleted[] values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + Imgproc.COLOR_YUV2RGB_YVYU;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted[] onwarmupcompletedArr = (onWarmupCompleted[]) $VALUES.clone();
            int i4 = onWarmupCompleted + 51;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return onwarmupcompletedArr;
        }

        private onWarmupCompleted(String str, int i) {
        }

        static {
            onWarmupCompleted[] onwarmupcompletedArr$values = $values();
            $VALUES = onwarmupcompletedArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onwarmupcompletedArr$values);
            int i = onExtraCallbackWithResult + 21;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallbackWithResult {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallbackWithResult[] $VALUES;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        public static final onExtraCallbackWithResult DEFAULT = new onExtraCallbackWithResult("DEFAULT", 0);
        public static final onExtraCallbackWithResult LEFT = new onExtraCallbackWithResult("LEFT", 1);
        public static final onExtraCallbackWithResult CENTER = new onExtraCallbackWithResult("CENTER", 2);
        public static final onExtraCallbackWithResult RIGHT = new onExtraCallbackWithResult("RIGHT", 3);

        private static final /* synthetic */ onExtraCallbackWithResult[] $values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 19;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            onExtraCallbackWithResult[] onextracallbackwithresultArr = {DEFAULT, LEFT, CENTER, RIGHT};
            int i5 = i2 + 39;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return onextracallbackwithresultArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static EnumEntries<onExtraCallbackWithResult> getEntries() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 13;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            EnumEntries<onExtraCallbackWithResult> enumEntries = $ENTRIES;
            if (i3 != 0) {
                int i4 = 9 / 0;
            }
            return enumEntries;
        }

        public static onExtraCallbackWithResult valueOf(String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 107;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) Enum.valueOf(onExtraCallbackWithResult.class, str);
            if (i3 != 0) {
                throw null;
            }
            int i4 = onWarmupCompleted + 5;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return onextracallbackwithresult;
        }

        public static onExtraCallbackWithResult[] values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 9;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult[] onextracallbackwithresultArr = $VALUES;
            if (i3 == 0) {
                return (onExtraCallbackWithResult[]) onextracallbackwithresultArr.clone();
            }
            int i4 = 39 / 0;
            return (onExtraCallbackWithResult[]) onextracallbackwithresultArr.clone();
        }

        private onExtraCallbackWithResult(String str, int i) {
        }

        static {
            onExtraCallbackWithResult[] onextracallbackwithresultArr$values = $values();
            $VALUES = onextracallbackwithresultArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackwithresultArr$values);
            int i = onExtraCallbackWithResult + 17;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }
    }

    public static final class IAuthTabCallback {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }

        public static /* synthetic */ boolean onNavigationEvent(IAuthTabCallback iAuthTabCallback, Context context, String str, Rect rect, onWarmupCompleted onwarmupcompleted, int i, onExtraCallbackWithResult onextracallbackwithresult, onExtraCallback onextracallback, long j, int i2, Object obj) {
            int i3;
            onExtraCallbackWithResult onextracallbackwithresult2;
            long j2;
            onExtraCallbackWithResult onextracallbackwithresult3;
            int i4 = 2 % 2;
            onWarmupCompleted onwarmupcompleted2 = (i2 & 4) != 0 ? onWarmupCompleted.TOP : onwarmupcompleted;
            if ((i2 & 8) != 0) {
                int i5 = onExtraCallbackWithResult + 105;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                i3 = 16;
            } else {
                i3 = i;
            }
            if ((i2 & 16) != 0) {
                int i7 = onExtraCallbackWithResult + 27;
                onExtraCallback = i7 % 128;
                if (i7 % 2 == 0) {
                    onextracallbackwithresult3 = onExtraCallbackWithResult.DEFAULT;
                    int i8 = 28 / 0;
                } else {
                    onextracallbackwithresult3 = onExtraCallbackWithResult.DEFAULT;
                }
                onextracallbackwithresult2 = onextracallbackwithresult3;
            } else {
                onextracallbackwithresult2 = onextracallbackwithresult;
            }
            onExtraCallback onextracallback2 = (i2 & 32) != 0 ? null : onextracallback;
            if ((i2 & 64) != 0) {
                int i9 = onExtraCallbackWithResult + 75;
                onExtraCallback = i9 % 128;
                if (i9 % 2 == 0) {
                    int i10 = 8 / 0;
                }
                j2 = 300;
            } else {
                j2 = j;
            }
            return iAuthTabCallback.onExtraCallback(context, str, rect, onwarmupcompleted2, i3, onextracallbackwithresult2, onextracallback2, j2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
        /* JADX WARN: Type inference failed for: r14v0, types: [android.view.View, im.toss.uikit.widget.tooltip.TdsHighlightV2View] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean onExtraCallback(@NotNull Context context, @Nullable String str, @NotNull Rect rect, @NotNull onWarmupCompleted onwarmupcompleted, int i, @NotNull onExtraCallbackWithResult onextracallbackwithresult, @Nullable onExtraCallback onextracallback, long j) {
            View decorView;
            ViewGroup viewGroup;
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 9;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(rect, "");
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            if (varyFields.onWarmupCompleted(context)) {
                int i5 = onExtraCallbackWithResult + 63;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            Activity activityIAuthTabCallback = hasVaryAll.IAuthTabCallback(context);
            if (activityIAuthTabCallback != null) {
                int i7 = onExtraCallback + Imgproc.COLOR_YUV2RGB_YVYU;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                Window window = activityIAuthTabCallback.getWindow();
                if (window != null) {
                    int i9 = onExtraCallbackWithResult + 91;
                    onExtraCallback = i9 % 128;
                    int i10 = i9 % 2;
                    decorView = window.getDecorView();
                    int i11 = onExtraCallbackWithResult + 51;
                    onExtraCallback = i11 % 128;
                    if (i11 % 2 == 0) {
                        int i12 = 2 / 4;
                    }
                } else {
                    decorView = null;
                }
            }
            if (decorView instanceof ViewGroup) {
                int i13 = onExtraCallback + 59;
                onExtraCallbackWithResult = i13 % 128;
                int i14 = i13 % 2;
                viewGroup = (ViewGroup) decorView;
            } else {
                viewGroup = 0;
            }
            if (viewGroup == 0) {
                return false;
            }
            if (!(!onExtraCallback(viewGroup))) {
                int i15 = onExtraCallback + 23;
                onExtraCallbackWithResult = i15 % 128;
                return i15 % 2 != 0;
            }
            ?? tdsHighlightV2View = new TdsHighlightV2View(context, null, 0, 6, null);
            tdsHighlightV2View.setTargetRect(rect, viewGroup, str, onwarmupcompleted, onextracallbackwithresult, i, j);
            tdsHighlightV2View.setOnDismissListener(onextracallback);
            viewGroup.addView(tdsHighlightV2View);
            int i16 = onExtraCallbackWithResult + 95;
            onExtraCallback = i16 % 128;
            if (i16 % 2 != 0) {
                return true;
            }
            throw null;
        }

        public static /* synthetic */ void onExtraCallbackWithResult(IAuthTabCallback iAuthTabCallback, View view, String str, onWarmupCompleted onwarmupcompleted, int i, onExtraCallbackWithResult onextracallbackwithresult, onExtraCallback onextracallback, long j, int i2, Object obj) {
            onWarmupCompleted onwarmupcompleted2;
            int i3;
            onExtraCallbackWithResult onextracallbackwithresult2;
            long j2;
            int i4 = 2 % 2;
            int i5 = onExtraCallbackWithResult;
            int i6 = i5 + 47;
            onExtraCallback = i6 % 128;
            if (i6 % 2 != 0 ? (i2 & 2) == 0 : (i2 & 2) == 0) {
                onwarmupcompleted2 = onwarmupcompleted;
            } else {
                int i7 = i5 + 85;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                onWarmupCompleted onwarmupcompleted3 = onWarmupCompleted.TOP;
                int i9 = onExtraCallbackWithResult + 27;
                onExtraCallback = i9 % 128;
                int i10 = i9 % 2;
                onwarmupcompleted2 = onwarmupcompleted3;
            }
            if ((i2 & 4) != 0) {
                int i11 = onExtraCallbackWithResult + 35;
                onExtraCallback = i11 % 128;
                i3 = i11 % 2 == 0 ? 126 : 16;
            } else {
                i3 = i;
            }
            if ((i2 & 8) != 0) {
                int i12 = onExtraCallback + 59;
                onExtraCallbackWithResult = i12 % 128;
                if (i12 % 2 != 0) {
                    onExtraCallbackWithResult onextracallbackwithresult3 = onExtraCallbackWithResult.DEFAULT;
                    throw null;
                }
                onextracallbackwithresult2 = onExtraCallbackWithResult.DEFAULT;
            } else {
                onextracallbackwithresult2 = onextracallbackwithresult;
            }
            onExtraCallback onextracallback2 = (i2 & 16) != 0 ? null : onextracallback;
            if ((i2 & 32) != 0) {
                int i13 = onExtraCallbackWithResult;
                int i14 = i13 + 97;
                onExtraCallback = i14 % 128;
                int i15 = i14 % 2;
                int i16 = i13 + 109;
                onExtraCallback = i16 % 128;
                int i17 = i16 % 2;
                j2 = 300;
            } else {
                j2 = j;
            }
            iAuthTabCallback.onExtraCallbackWithResult(view, str, onwarmupcompleted2, i3, onextracallbackwithresult2, onextracallback2, j2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v2, types: [android.view.View, im.toss.uikit.widget.tooltip.TdsHighlightV2View] */
        public final void onExtraCallbackWithResult(@NotNull View view, @Nullable String str, @NotNull onWarmupCompleted onwarmupcompleted, int i, @NotNull onExtraCallbackWithResult onextracallbackwithresult, @Nullable onExtraCallback onextracallback, long j) {
            KeyEvent.Callback decorView;
            Window window;
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            if (!varyFields.onWarmupCompleted(context)) {
                int i3 = onExtraCallbackWithResult + 45;
                onExtraCallback = i3 % 128;
                ViewGroup viewGroup = null;
                if (i3 % 2 == 0) {
                    Context context2 = view.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "");
                    hasVaryAll.IAuthTabCallback(context2);
                    viewGroup.hashCode();
                    throw null;
                }
                Context context3 = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                Activity activityIAuthTabCallback = hasVaryAll.IAuthTabCallback(context3);
                if (activityIAuthTabCallback == null || (window = activityIAuthTabCallback.getWindow()) == null) {
                    decorView = null;
                } else {
                    int i4 = onExtraCallbackWithResult + 61;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    decorView = window.getDecorView();
                }
                if (decorView instanceof ViewGroup) {
                    int i6 = onExtraCallback + 91;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                    viewGroup = (ViewGroup) decorView;
                }
                ViewGroup viewGroup2 = viewGroup;
                if (viewGroup2 != 0) {
                    if (onExtraCallback(viewGroup2)) {
                        return;
                    }
                    Context context4 = view.getContext();
                    Intrinsics.checkNotNullExpressionValue(context4, "");
                    ?? tdsHighlightV2View = new TdsHighlightV2View(context4, null, 0, 6, null);
                    tdsHighlightV2View.setTargetView(view, viewGroup2, str, onwarmupcompleted, onextracallbackwithresult, i, j);
                    tdsHighlightV2View.setOnDismissListener(onextracallback);
                    viewGroup2.addView(tdsHighlightV2View);
                }
            }
        }

        private final boolean onExtraCallback(ViewGroup viewGroup) {
            int i = 2 % 2;
            int childCount = viewGroup.getChildCount();
            boolean z = false;
            for (int i2 = 0; i2 < childCount; i2++) {
                if (viewGroup.getChildAt(i2) instanceof TdsHighlightV2View) {
                    z = true;
                }
            }
            if (!z) {
                return false;
            }
            int i3 = onExtraCallbackWithResult;
            int i4 = i3 + 81;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 55;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
    }

    public static /* synthetic */ Unit onExtraCallback(TdsHighlightV2View tdsHighlightV2View, onWarmupCompleted onwarmupcompleted, onExtraCallbackWithResult onextracallbackwithresult) {
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        int iIAuthTabCallback2 = zziea.IAuthTabCallback();
        int iIAuthTabCallback3 = zziea.IAuthTabCallback();
        return (Unit) onNavigationEvent(iIAuthTabCallback2, -1662285333, 1662285333, zziea.IAuthTabCallback(), iIAuthTabCallback3, iIAuthTabCallback, new Object[]{tdsHighlightV2View, onwarmupcompleted, onextracallbackwithresult});
    }

    public static /* synthetic */ void IAuthTabCallback(View view, TdsHighlightV2View tdsHighlightV2View, ViewGroup viewGroup, int i, String str, onWarmupCompleted onwarmupcompleted, onExtraCallbackWithResult onextracallbackwithresult, long j) {
        Object[] objArr = {view, tdsHighlightV2View, viewGroup, Integer.valueOf(i), str, onwarmupcompleted, onextracallbackwithresult, Long.valueOf(j)};
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        onNavigationEvent(zziea.IAuthTabCallback(), 675310040, -675310039, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), iIAuthTabCallback, objArr);
    }

    public static final /* synthetic */ TdsImageView IAuthTabCallback(TdsHighlightV2View tdsHighlightV2View) {
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        int iIAuthTabCallback2 = zziea.IAuthTabCallback();
        int iIAuthTabCallback3 = zziea.IAuthTabCallback();
        return (TdsImageView) onNavigationEvent(iIAuthTabCallback2, -1232163131, 1232163138, zziea.IAuthTabCallback(), iIAuthTabCallback3, iIAuthTabCallback, new Object[]{tdsHighlightV2View});
    }

    public static final /* synthetic */ Rect onTransact(TdsHighlightV2View tdsHighlightV2View) {
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        int iIAuthTabCallback2 = zziea.IAuthTabCallback();
        int iIAuthTabCallback3 = zziea.IAuthTabCallback();
        return (Rect) onNavigationEvent(iIAuthTabCallback2, -1910874403, 1910874407, zziea.IAuthTabCallback(), iIAuthTabCallback3, iIAuthTabCallback, new Object[]{tdsHighlightV2View});
    }

    public static final /* synthetic */ void onWarmupCompleted(TdsHighlightV2View tdsHighlightV2View, boolean z) {
        Object[] objArr = {tdsHighlightV2View, Boolean.valueOf(z)};
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        onNavigationEvent(zziea.IAuthTabCallback(), -544656461, 544656464, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), iIAuthTabCallback, objArr);
    }

    private final int onNavigationEvent() {
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        int iIAuthTabCallback2 = zziea.IAuthTabCallback();
        int iIAuthTabCallback3 = zziea.IAuthTabCallback();
        return ((Integer) onNavigationEvent(iIAuthTabCallback2, -1817993444, 1817993449, zziea.IAuthTabCallback(), iIAuthTabCallback3, iIAuthTabCallback, new Object[]{this})).intValue();
    }

    private static final void onWarmupCompleted(View view, TdsHighlightV2View tdsHighlightV2View, ViewGroup viewGroup, int i, String str, onWarmupCompleted onwarmupcompleted, onExtraCallbackWithResult onextracallbackwithresult, long j) {
        Object[] objArr = {view, tdsHighlightV2View, viewGroup, Integer.valueOf(i), str, onwarmupcompleted, onextracallbackwithresult, Long.valueOf(j)};
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        onNavigationEvent(zziea.IAuthTabCallback(), -1923056023, 1923056025, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), iIAuthTabCallback, objArr);
    }

    private static final void onWarmupCompleted(ValueAnimator valueAnimator, TdsHighlightV2View tdsHighlightV2View, float f, float f2, float f3, ValueAnimator valueAnimator2) {
        Object[] objArr = {valueAnimator, tdsHighlightV2View, Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), valueAnimator2};
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        onNavigationEvent(zziea.IAuthTabCallback(), -710238495, 710238501, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), iIAuthTabCallback, objArr);
    }
}
