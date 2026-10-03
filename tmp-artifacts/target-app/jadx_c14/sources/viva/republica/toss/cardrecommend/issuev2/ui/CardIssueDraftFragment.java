package viva.republica.toss.cardrecommend.issuev2.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.observability.instrumentation.memory.PssReader$;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.atom.text.SubTypography11;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.tds.view.component.widget.TdsScrollView;
import im.toss.uikit.widget.textView.top.TdsTopV1View;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.CommonModule_setScreenAwakeMode;
import o.ConvertByteArrayToFloatArray;
import o.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import o.DynamicLoader;
import o.KeyDerivationFunc;
import o.PullRefreshStateKtExternalSyntheticLambda0;
import o.RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1;
import o.RecomposerawaitIdle2;
import o.RippleNode;
import o.SetDetectableSize;
import o.TimelineExternalSyntheticLambda0;
import o.TypographyKtExternalSyntheticLambda0;
import o.createNativeAdRatingApi;
import o.getDigestAlgorithms;
import o.getSpecialFeatureOptInStatus;
import o.getSubjectPublicKeyInfo;
import o.getUrlokhttp;
import o.logInvite;
import o.reportDexLoadingIssue;
import o.setBodyokhttp;
import o.setMinWebSocketMessageToCompressokhttp;
import o.setProxySelectorokhttp;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CardIssueDraftFragment extends CardIssueBaseFragment<KeyDerivationFunc> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static long onExtraCallback = 673697820641081060L;
    private static int onNavigationEvent = 1;

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i2;
        int i8 = ~(i7 | i5);
        int i9 = ~i;
        int i10 = ~i5;
        int i11 = (~(i10 | i7)) | i9;
        int i12 = (~(i2 | i5)) | (~(i7 | i9 | i10));
        int i13 = i + i5 + i4 + ((-1136091917) * i6) + (376669458 * i3);
        int i14 = i13 * i13;
        int i15 = ((-905468225) * i) + 1718550528 + ((-1748215485) * i5) + (i8 * (-421373630)) + (421373630 * i11) + ((-421373630) * i12) + ((-1326841856) * i4) + ((-2044854272) * i6) + (41156608 * i3) + (1721171968 * i14);
        int i16 = ((i * (-924404593)) - 1636593565) + (i5 * (-924403757)) + (i8 * 418) + (i11 * (-418)) + (i12 * 418) + (i4 * (-924404175)) + (i6 * (-2083730301)) + (i3 * 182666354) + (i14 * (-51970048));
        int i17 = i15 + (i16 * i16 * (-653721600));
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? onWarmupCompleted(objArr) : IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr) : onExtraCallback(objArr);
    }

    public static /* synthetic */ Unit IAuthTabCallback(CardIssueDraftFragment cardIssueDraftFragment, View view) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 37;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(cardIssueDraftFragment, view);
        int i4 = IAuthTabCallback + 103;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CardIssueDraftFragment cardIssueDraftFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 3;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(cardIssueDraftFragment, setDetectableSize);
        int i4 = onNavigationEvent + 95;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(CardIssueDraftFragment cardIssueDraftFragment, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 77;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(cardIssueDraftFragment, commonModule_setLeftEdgeTouchEnabled);
        int i4 = IAuthTabCallback + 65;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(CardIssueDraftFragment cardIssueDraftFragment, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 63;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(cardIssueDraftFragment, setDetectableSize);
        if (i3 != 0) {
            int i4 = 21 / 0;
        }
        return unitAsBinder;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CardIssueDraftFragment cardIssueDraftFragment, TdsBottomCtaV1View tdsBottomCtaV1View, View view) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 59;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
            int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
            int iOnWarmupCompleted3 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iOnWarmupCompleted4 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted5 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted6 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        Unit unit = (Unit) IAuthTabCallback(-259828737, iOnWarmupCompleted4, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted5, 259828740, new Object[]{cardIssueDraftFragment, tdsBottomCtaV1View, view}, iOnWarmupCompleted6);
        int i3 = IAuthTabCallback + 9;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 1 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(CardIssueDraftFragment cardIssueDraftFragment, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(cardIssueDraftFragment, dialogInterface);
        int i4 = onNavigationEvent + 93;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 14 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(CardIssueDraftFragment cardIssueDraftFragment, DynamicLoader dynamicLoader, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 31;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(cardIssueDraftFragment, dynamicLoader, view);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(cardIssueDraftFragment, dynamicLoader, view);
        int i3 = IAuthTabCallback + 95;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        CardIssueDraftFragment cardIssueDraftFragment = (CardIssueDraftFragment) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 91;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
            int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
            int iOnWarmupCompleted3 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
            return (Unit) IAuthTabCallback(-1465108367, iOnWarmupCompleted, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted2, 1465108368, new Object[]{cardIssueDraftFragment, setDetectableSize}, iOnWarmupCompleted3);
        }
        int iOnWarmupCompleted4 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted5 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted6 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CardIssueDraftFragment cardIssueDraftFragment, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 13;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(cardIssueDraftFragment, dialogInterface);
        if (i3 == 0) {
            int i4 = 21 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CardIssueDraftFragment cardIssueDraftFragment, DynamicLoader dynamicLoader, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 65;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(cardIssueDraftFragment, dynamicLoader, view);
        if (i3 == 0) {
            int i4 = 13 / 0;
        }
        int i5 = onNavigationEvent + 41;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CardIssueDraftFragment cardIssueDraftFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 81;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(cardIssueDraftFragment, setDetectableSize);
        if (i3 != 0) {
            int i4 = 98 / 0;
        }
        int i5 = onNavigationEvent + 77;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 53 / 0;
        }
        return unitAsInterface;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallback ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $11 + 97;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i5 = $11 + 103;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.blue(0) + 45812), Color.argb(0, 0, 0, 0) + 84, TextUtils.lastIndexOf("", '0', 0, 0) + 21234, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), 19 - (ViewConfiguration.getTouchSlop() >> 8), Color.argb(0, 0, 0, 0) + 8808, 64918803, false, "d", new Class[]{Object.class, Object.class});
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
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }

    private static final Unit onExtraCallbackWithResult(CardIssueDraftFragment cardIssueDraftFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 117;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("card_id", cardIssueDraftFragment.extraCallback().IAuthTabCallbackStub());
        setDetectableSize.onExtraCallback("session_id", cardIssueDraftFragment.extraCallback().ICustomTabsCallbackStubProxy());
        setDetectableSize.onExtraCallback("funnel_id", cardIssueDraftFragment.extraCallback().getInterfaceDescriptor());
        setDetectableSize.onExtraCallback("screen_type", cardIssueDraftFragment.readTypedObject().onExtraCallback());
        Object[] objArr = new Object[1];
        a(new char[]{59733, 53749, 42754, 59681, 11262, 40052, 15526, 49706, 56976}, ((byte) KeyEvent.getModifierMetaStateMask()) + 1, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), cardIssueDraftFragment.getString(R.string.app_cardrecommend_issuev2_ui___efa7bea307));
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 91;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit asInterface(CardIssueDraftFragment cardIssueDraftFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 85;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("card_id", cardIssueDraftFragment.extraCallback().IAuthTabCallbackStub());
        setDetectableSize.onExtraCallback("session_id", cardIssueDraftFragment.extraCallback().ICustomTabsCallbackStubProxy());
        setDetectableSize.onExtraCallback("funnel_id", cardIssueDraftFragment.extraCallback().getInterfaceDescriptor());
        setDetectableSize.onExtraCallback("screen_type", cardIssueDraftFragment.readTypedObject().onExtraCallback());
        Object[] objArr = new Object[1];
        a(new char[]{59733, 53749, 42754, 59681, 11262, 40052, 15526, 49706, 56976}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), cardIssueDraftFragment.getString(R.string.app_cardrecommend_issuev2_ui___16dbb45e64));
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 73;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit asBinder(CardIssueDraftFragment cardIssueDraftFragment, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 83;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("card_id", cardIssueDraftFragment.extraCallback().IAuthTabCallbackStub());
        setDetectableSize.onExtraCallback("session_id", cardIssueDraftFragment.extraCallback().ICustomTabsCallbackStubProxy());
        setDetectableSize.onExtraCallback("funnel_id", cardIssueDraftFragment.extraCallback().getInterfaceDescriptor());
        setDetectableSize.onExtraCallback("screen_type", cardIssueDraftFragment.readTypedObject().onExtraCallback());
        setDetectableSize.onExtraCallback("button_text", cardIssueDraftFragment.getString(R.string.close));
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 107;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 78 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallback(final CardIssueDraftFragment cardIssueDraftFragment, DialogInterface dialogInterface) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        ConvertByteArrayToFloatArray.onExtraCallback(1450921L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueDraftFragment$$ExternalSyntheticLambda5
            public final Object invoke(Object obj) {
                return CardIssueDraftFragment.onExtraCallback(this.f$0, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        dialogInterface.dismiss();
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallback + 67;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        CardIssueDraftFragment cardIssueDraftFragment = (CardIssueDraftFragment) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 121;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("card_id", cardIssueDraftFragment.extraCallback().IAuthTabCallbackStub());
        setDetectableSize.onExtraCallback("session_id", cardIssueDraftFragment.extraCallback().ICustomTabsCallbackStubProxy());
        setDetectableSize.onExtraCallback("funnel_id", cardIssueDraftFragment.extraCallback().getInterfaceDescriptor());
        setDetectableSize.onExtraCallback("screen_type", cardIssueDraftFragment.readTypedObject().onExtraCallback());
        setDetectableSize.onExtraCallback("button_text", cardIssueDraftFragment.getString(im.toss.uikit.R.string.uikit_confirm));
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 79;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit IAuthTabCallback(final CardIssueDraftFragment cardIssueDraftFragment, DialogInterface dialogInterface) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        ConvertByteArrayToFloatArray.onExtraCallback(1450921L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueDraftFragment$$ExternalSyntheticLambda4
            public final Object invoke(Object obj) {
                Object[] objArr = {this.f$0, (SetDetectableSize) obj};
                return (Unit) CardIssueDraftFragment.IAuthTabCallback(-271936509, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), 271936509, objArr, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted());
            }
        }, 14, (Object) null);
        dialogInterface.dismiss();
        cardIssueDraftFragment.extraCallback().onExtraCallbackWithResult();
        Unit unit = Unit.INSTANCE;
        int i2 = onNavigationEvent + 93;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 63 / 0;
        }
        return unit;
    }

    private static final Unit onWarmupCompleted(final CardIssueDraftFragment cardIssueDraftFragment, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(cardIssueDraftFragment.getString(R.string.app_cardrecommend_issuev2_ui___16dbb45e64));
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(cardIssueDraftFragment.getString(R.string.app_cardrecommend_issuev2_ui___de9b724cd9));
        String string = cardIssueDraftFragment.getString(R.string.close);
        Intrinsics.checkNotNullExpressionValue(string, "");
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, string, new TdsButtonV1View.asInterface(TdsButtonV1View.IAuthTabCallbackStub.DARK, TdsButtonV1View.IAuthTabCallbackDefault.WEAK, (TdsButtonV1View.onWarmupCompleted) null, (TdsButtonV1View.IAuthTabCallback) null, 12, (DefaultConstructorMarker) null), false, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueDraftFragment$$ExternalSyntheticLambda9
            public final Object invoke(Object obj) {
                return CardIssueDraftFragment.onNavigationEvent(this.f$0, (DialogInterface) obj);
            }
        }, 4, (Object) null)};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1565757672, objArr, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1565757675, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        String string2 = cardIssueDraftFragment.getString(im.toss.uikit.R.string.uikit_confirm);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        Object[] objArr2 = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, string2, new TdsButtonV1View.asInterface(TdsButtonV1View.IAuthTabCallbackStub.DANGER, TdsButtonV1View.IAuthTabCallbackDefault.FILL, (TdsButtonV1View.onWarmupCompleted) null, (TdsButtonV1View.IAuthTabCallback) null, 12, (DefaultConstructorMarker) null), false, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueDraftFragment$$ExternalSyntheticLambda10
            public final Object invoke(Object obj) {
                return CardIssueDraftFragment.onWarmupCompleted(this.f$0, (DialogInterface) obj);
            }
        }, 4, (Object) null)};
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr2, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i2 = onNavigationEvent + 89;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(final CardIssueDraftFragment cardIssueDraftFragment, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        ConvertByteArrayToFloatArray.onExtraCallback(1385612L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueDraftFragment$$ExternalSyntheticLambda6
            public final Object invoke(Object obj) {
                return CardIssueDraftFragment.IAuthTabCallback(this.f$0, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        ConvertByteArrayToFloatArray.onExtraCallback(1450919L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueDraftFragment$$ExternalSyntheticLambda7
            public final Object invoke(Object obj) {
                return CardIssueDraftFragment.onWarmupCompleted(this.f$0, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(cardIssueDraftFragment.requireBaseActivity(), new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueDraftFragment$$ExternalSyntheticLambda8
            public final Object invoke(Object obj) {
                return CardIssueDraftFragment.onExtraCallback(this.f$0, (CommonModule_setLeftEdgeTouchEnabled) obj);
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = onNavigationEvent + 21;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        DynamicLoader dynamicLoaderOnExtraCallback;
        int i;
        DynamicLoader dynamicLoaderOnExtraCallback2;
        CardIssueDraftFragment cardIssueDraftFragment = (CardIssueDraftFragment) objArr[0];
        TdsBottomCtaV1View tdsBottomCtaV1View = (TdsBottomCtaV1View) objArr[1];
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter((View) objArr[2], "");
        reportDexLoadingIssue reportdexloadingissueOnExtraCallbackWithResult = cardIssueDraftFragment.readTypedObject().onExtraCallbackWithResult();
        String strOnNavigationEvent = null;
        strOnNavigationEvent = null;
        if (reportdexloadingissueOnExtraCallbackWithResult != null) {
            int i3 = IAuthTabCallback + 33;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                dynamicLoaderOnExtraCallback = reportdexloadingissueOnExtraCallbackWithResult.onExtraCallback();
                int i4 = 89 / 0;
            } else {
                dynamicLoaderOnExtraCallback = reportdexloadingissueOnExtraCallbackWithResult.onExtraCallback();
            }
        } else {
            int i5 = IAuthTabCallback + 49;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            dynamicLoaderOnExtraCallback = null;
        }
        if (dynamicLoaderOnExtraCallback != null) {
            int i7 = IAuthTabCallback + 33;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            reportDexLoadingIssue reportdexloadingissueOnExtraCallbackWithResult2 = cardIssueDraftFragment.readTypedObject().onExtraCallbackWithResult();
            DynamicLoader dynamicLoaderOnExtraCallback3 = reportdexloadingissueOnExtraCallbackWithResult2 != null ? reportdexloadingissueOnExtraCallbackWithResult2.onExtraCallback() : null;
            Intrinsics.checkNotNull(dynamicLoaderOnExtraCallback3);
            IAuthTabCallback(964442202, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), -964442200, new Object[]{cardIssueDraftFragment, dynamicLoaderOnExtraCallback3}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted());
            i = onNavigationEvent + 105;
        } else {
            getDigestAlgorithms<KeyDerivationFunc> getdigestalgorithmsWriteTypedObject = cardIssueDraftFragment.writeTypedObject();
            TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0OnExtraCallbackWithResult = PullRefreshStateKtExternalSyntheticLambda0.onExtraCallbackWithResult(tdsBottomCtaV1View);
            CardIssueOverviewViewModel cardIssueOverviewViewModelExtraCallback = cardIssueDraftFragment.extraCallback();
            reportDexLoadingIssue reportdexloadingissueOnExtraCallbackWithResult3 = cardIssueDraftFragment.readTypedObject().onExtraCallbackWithResult();
            if (reportdexloadingissueOnExtraCallbackWithResult3 != null && (dynamicLoaderOnExtraCallback2 = reportdexloadingissueOnExtraCallbackWithResult3.onExtraCallback()) != null) {
                int i9 = onNavigationEvent + 101;
                IAuthTabCallback = i9 % 128;
                if (i9 % 2 != 0) {
                    dynamicLoaderOnExtraCallback2.onNavigationEvent();
                    throw null;
                }
                strOnNavigationEvent = dynamicLoaderOnExtraCallback2.onNavigationEvent();
            }
            getDigestAlgorithms.onExtraCallback(getdigestalgorithmsWriteTypedObject, typographyKtExternalSyntheticLambda0OnExtraCallbackWithResult, cardIssueOverviewViewModelExtraCallback, (RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1) null, (String) null, strOnNavigationEvent, (Map) null, 40, (Object) null);
            i = onNavigationEvent + 11;
        }
        IAuthTabCallback = i % 128;
        int i10 = i % 2;
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(CardIssueDraftFragment cardIssueDraftFragment, DynamicLoader dynamicLoader, View view) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted3 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        IAuthTabCallback(964442202, iOnWarmupCompleted, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted2, -964442200, new Object[]{cardIssueDraftFragment, dynamicLoader}, iOnWarmupCompleted3);
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 51;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(CardIssueDraftFragment cardIssueDraftFragment, DynamicLoader dynamicLoader, View view) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 9;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted3 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        IAuthTabCallback(964442202, iOnWarmupCompleted, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted2, -964442200, new Object[]{cardIssueDraftFragment, dynamicLoader}, iOnWarmupCompleted3);
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 71;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Pair pair;
        String string;
        String strOnWarmupCompleted;
        final DynamicLoader dynamicLoaderIAuthTabCallback;
        DynamicLoader dynamicLoaderOnExtraCallback;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        ConstraintLayout constraintLayout = new ConstraintLayout(contextRequireContext);
        Context context = constraintLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        TdsScrollView tdsScrollView = new TdsScrollView(context, (AttributeSet) null, 0, 0, 14, (DefaultConstructorMarker) null);
        tdsScrollView.setId(View.generateViewId());
        Class cls = Integer.TYPE;
        ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult = (ViewGroup.LayoutParams) ConstraintLayout.onExtraCallbackWithResult.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(onextracallbackwithresult);
        ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult2 = onextracallbackwithresult;
        onextracallbackwithresult2.IPostMessageServiceStubProxy = 0;
        ((ViewGroup.MarginLayoutParams) onextracallbackwithresult2).height = 0;
        tdsScrollView.setLayoutParams(onextracallbackwithresult);
        Context context2 = tdsScrollView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        LinearLayout linearLayout = new LinearLayout(context2);
        int i2 = 1;
        linearLayout.setOrientation(1);
        Context context3 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        TdsImageView tdsImageView = new TdsImageView(context3, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) ViewGroup.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(layoutParams);
        layoutParams.width = -2;
        layoutParams.height = -2;
        tdsImageView.setLayoutParams(layoutParams);
        DisplayMetrics displayMetrics = tdsImageView.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        setMinWebSocketMessageToCompressokhttp.IAuthTabCallback(tdsImageView, varyMatches.onNavigationEvent(16, displayMetrics));
        if (readTypedObject().IAuthTabCallbackStub().IAuthTabCallback()) {
            DisplayMetrics displayMetrics2 = tdsImageView.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
            int iOnNavigationEvent = varyMatches.onNavigationEvent(195, displayMetrics2);
            DisplayMetrics displayMetrics3 = tdsImageView.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
            pair = new Pair(Integer.valueOf(iOnNavigationEvent), Integer.valueOf(varyMatches.onNavigationEvent(122, displayMetrics3)));
        } else {
            DisplayMetrics displayMetrics4 = tdsImageView.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics4, "");
            int iOnNavigationEvent2 = varyMatches.onNavigationEvent(158, displayMetrics4);
            DisplayMetrics displayMetrics5 = tdsImageView.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics5, "");
            pair = new Pair(Integer.valueOf(iOnNavigationEvent2), Integer.valueOf(varyMatches.onNavigationEvent(250, displayMetrics5)));
        }
        int iIntValue = ((Number) pair.onExtraCallbackWithResult()).intValue();
        int iIntValue2 = ((Number) pair.IAuthTabCallback()).intValue();
        Context context4 = tdsImageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        TdsImageView.setImage$default(tdsImageView, new RecomposerawaitIdle2.onNavigationEvent(context4).onExtraCallback(readTypedObject().IAuthTabCallbackStub().onNavigationEvent()).onExtraCallback(iIntValue, iIntValue2), (Function1) null, (Function1) null, 6, (Object) null);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsImageView);
        Context context5 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "");
        TdsTopV1View tdsTopV1View = new TdsTopV1View(context5, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        tdsTopV1View.setUpperType(TdsTopV1View.onExtraCallbackWithResult.TOP3);
        tdsTopV1View.setUpperText(readTypedObject().asInterface());
        DisplayMetrics displayMetrics6 = tdsTopV1View.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics6, "");
        setMinWebSocketMessageToCompressokhttp.IAuthTabCallback(tdsTopV1View, varyMatches.onNavigationEvent(16, displayMetrics6));
        DisplayMetrics displayMetrics7 = tdsTopV1View.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics7, "");
        setMinWebSocketMessageToCompressokhttp.onNavigationEvent(tdsTopV1View, varyMatches.onNavigationEvent(16, displayMetrics7));
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsTopV1View);
        for (createNativeAdRatingApi createnativeadratingapi : readTypedObject().onWarmupCompleted()) {
            Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
            linearLayout.addView(getSubjectPublicKeyInfo.onExtraCallback(createnativeadratingapi, contextRequireContext2, RippleNode.onNavigationEvent(this), extraCallback(), writeTypedObject()).onWarmupCompleted());
            int i3 = IAuthTabCallback + 89;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            i2 = 1;
        }
        Class[] clsArr = new Class[i2];
        clsArr[0] = Context.class;
        BaseTextView baseTextView = (BaseTextView) SubTypography11.class.getDeclaredConstructor(clsArr).newInstance(linearLayout.getContext());
        Intrinsics.checkNotNull(baseTextView);
        DisplayMetrics displayMetrics8 = baseTextView.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics8, "");
        setMinWebSocketMessageToCompressokhttp.IAuthTabCallback(baseTextView, varyMatches.onNavigationEvent(42, displayMetrics8));
        DisplayMetrics displayMetrics9 = baseTextView.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics9, "");
        setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -520433888, new Object[]{baseTextView, Integer.valueOf(varyMatches.onNavigationEvent(24, displayMetrics9))}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 520433888);
        DisplayMetrics displayMetrics10 = baseTextView.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics10, "");
        setMinWebSocketMessageToCompressokhttp.onNavigationEvent(baseTextView, varyMatches.onNavigationEvent(16, displayMetrics10));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        UnderlineSpan underlineSpan = new UnderlineSpan();
        int length = spannableStringBuilder.length();
        getUrlokhttp geturlokhttpOnExtraCallback = setBodyokhttp.onExtraCallback(this);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(geturlokhttpOnExtraCallback.ITrustedWebActivityCallbackDefault() == getSpecialFeatureOptInStatus.Dark ? geturlokhttpOnExtraCallback.getInterfaceDescriptor().onMinimized() : geturlokhttpOnExtraCallback.requestPostMessageChannel().onActivityLayout());
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) getString(R.string.app_cardrecommend_issuev2_ui___efa7bea307));
        spannableStringBuilder.setSpan(foregroundColorSpan, length2, spannableStringBuilder.length(), 17);
        spannableStringBuilder.setSpan(underlineSpan, length, spannableStringBuilder.length(), 17);
        baseTextView.setText(new SpannedString(spannableStringBuilder));
        setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1916499490, new Object[]{baseTextView, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueDraftFragment$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return CardIssueDraftFragment.IAuthTabCallback(this.f$0, (View) obj);
            }
        }}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 1916499491);
        Intrinsics.checkNotNull(baseTextView);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, baseTextView);
        setProxySelectorokhttp.onExtraCallbackWithResult(tdsScrollView, linearLayout);
        setProxySelectorokhttp.onExtraCallbackWithResult(constraintLayout, tdsScrollView);
        Context context6 = constraintLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "");
        final TdsBottomCtaV1View tdsBottomCtaV1View = new TdsBottomCtaV1View(context6);
        tdsBottomCtaV1View.setId(View.generateViewId());
        ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult3 = (ViewGroup.LayoutParams) ConstraintLayout.onExtraCallbackWithResult.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(onextracallbackwithresult3);
        onextracallbackwithresult3.IAuthTabCallback = 0;
        tdsBottomCtaV1View.setLayoutParams(onextracallbackwithresult3);
        TdsBottomCtaV1View.onNavigationEvent(tdsBottomCtaV1View, tdsScrollView, false, 0, 6, (Object) null);
        reportDexLoadingIssue reportdexloadingissueOnExtraCallbackWithResult = readTypedObject().onExtraCallbackWithResult();
        if (reportdexloadingissueOnExtraCallbackWithResult == null || (dynamicLoaderOnExtraCallback = reportdexloadingissueOnExtraCallbackWithResult.onExtraCallback()) == null || (string = dynamicLoaderOnExtraCallback.onNavigationEvent()) == null) {
            string = getString(R.string.app_card_issue_draft_cta_title);
            Intrinsics.checkNotNullExpressionValue(string, "");
        }
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, string, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueDraftFragment$$ExternalSyntheticLambda1
            public final Object invoke(Object obj) {
                return CardIssueDraftFragment.onExtraCallbackWithResult(this.f$0, tdsBottomCtaV1View, (View) obj);
            }
        }, (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        reportDexLoadingIssue reportdexloadingissueOnExtraCallbackWithResult2 = readTypedObject().onExtraCallbackWithResult();
        if (reportdexloadingissueOnExtraCallbackWithResult2 != null) {
            int i5 = IAuthTabCallback + 97;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                reportdexloadingissueOnExtraCallbackWithResult2.onNavigationEvent();
                str.hashCode();
                throw null;
            }
            final DynamicLoader dynamicLoaderOnNavigationEvent = reportdexloadingissueOnExtraCallbackWithResult2.onNavigationEvent();
            if (dynamicLoaderOnNavigationEvent != null) {
                logInvite.IAuthTabCallback(tdsBottomCtaV1View, dynamicLoaderOnNavigationEvent.onNavigationEvent(), 0L, (TdsButtonV1View.asInterface) null, false, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueDraftFragment$$ExternalSyntheticLambda2
                    public final Object invoke(Object obj) {
                        return CardIssueDraftFragment.onWarmupCompleted(this.f$0, dynamicLoaderOnNavigationEvent, (View) obj);
                    }
                }, 14, (Object) null);
                Unit unit = Unit.INSTANCE;
            }
        }
        reportDexLoadingIssue reportdexloadingissueOnExtraCallbackWithResult3 = readTypedObject().onExtraCallbackWithResult();
        if (reportdexloadingissueOnExtraCallbackWithResult3 != null && (dynamicLoaderIAuthTabCallback = reportdexloadingissueOnExtraCallbackWithResult3.IAuthTabCallback()) != null) {
            tdsBottomCtaV1View.setBottomButton(dynamicLoaderIAuthTabCallback.onNavigationEvent(), new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueDraftFragment$$ExternalSyntheticLambda3
                public final Object invoke(Object obj) {
                    return CardIssueDraftFragment.onNavigationEvent(this.f$0, dynamicLoaderIAuthTabCallback, (View) obj);
                }
            });
            Unit unit2 = Unit.INSTANCE;
        }
        reportDexLoadingIssue reportdexloadingissueOnExtraCallbackWithResult4 = readTypedObject().onExtraCallbackWithResult();
        if (reportdexloadingissueOnExtraCallbackWithResult4 != null && (strOnWarmupCompleted = reportdexloadingissueOnExtraCallbackWithResult4.onWarmupCompleted()) != null) {
            str = strOnWarmupCompleted.length() > 0 ? strOnWarmupCompleted : null;
            if (str != null) {
                int i6 = IAuthTabCallback + 119;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                tdsBottomCtaV1View.setTopDescription(str);
                Unit unit3 = Unit.INSTANCE;
            }
        }
        setProxySelectorokhttp.onExtraCallbackWithResult(constraintLayout, tdsBottomCtaV1View);
        DeactivateEncoderSurfaceBeforeStopEncoderQuirk deactivateEncoderSurfaceBeforeStopEncoderQuirk = new DeactivateEncoderSurfaceBeforeStopEncoderQuirk();
        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onNavigationEvent(constraintLayout);
        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onWarmupCompleted(tdsScrollView.getId(), 4, tdsBottomCtaV1View.getId(), 3);
        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onExtraCallbackWithResult(constraintLayout);
        Unit unit4 = Unit.INSTANCE;
        return constraintLayout;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        CardIssueDraftFragment cardIssueDraftFragment = (CardIssueDraftFragment) objArr[0];
        DynamicLoader dynamicLoader = (DynamicLoader) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 119;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getDigestAlgorithms.onExtraCallbackWithResult(cardIssueDraftFragment.writeTypedObject(), RippleNode.onNavigationEvent(cardIssueDraftFragment), dynamicLoader.onWarmupCompleted(), cardIssueDraftFragment.extraCallback(), dynamicLoader.onNavigationEvent(), (RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1) null, 16, (Object) null);
        int i4 = onNavigationEvent + 9;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static /* synthetic */ Unit onNavigationEvent(CardIssueDraftFragment cardIssueDraftFragment, SetDetectableSize setDetectableSize) {
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted3 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        return (Unit) IAuthTabCallback(-271936509, iOnWarmupCompleted, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted2, 271936509, new Object[]{cardIssueDraftFragment, setDetectableSize}, iOnWarmupCompleted3);
    }

    private final void onWarmupCompleted(DynamicLoader dynamicLoader) {
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted3 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        IAuthTabCallback(964442202, iOnWarmupCompleted, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted2, -964442200, new Object[]{this, dynamicLoader}, iOnWarmupCompleted3);
    }

    private static final Unit IAuthTabCallbackDefault(CardIssueDraftFragment cardIssueDraftFragment, SetDetectableSize setDetectableSize) {
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted3 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        return (Unit) IAuthTabCallback(-1465108367, iOnWarmupCompleted, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted2, 1465108368, new Object[]{cardIssueDraftFragment, setDetectableSize}, iOnWarmupCompleted3);
    }

    private static final Unit onExtraCallback(CardIssueDraftFragment cardIssueDraftFragment, TdsBottomCtaV1View tdsBottomCtaV1View, View view) {
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted3 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        return (Unit) IAuthTabCallback(-259828737, iOnWarmupCompleted, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted2, 259828740, new Object[]{cardIssueDraftFragment, tdsBottomCtaV1View, view}, iOnWarmupCompleted3);
    }
}
