package viva.republica.toss.password;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.core.biometric.RxBiometric;
import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingFunnelAdapter$;
import im.toss.global.features.kyc.eu.main.cdd.ui.identity_confirm.GlobalKycEuIdentityConfirmViewModel;
import im.toss.rn.granite.core.module.appsintoss.bridge.ad.ShowTossAdOrAdmobBridge$;
import im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV1View;
import im.toss.uikit.widget.dialog.TdsDialogV1;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.properties.ObservableProperty;
import kotlin.text.StringsKt;
import o.AFj1rSDK;
import o.ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda0;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CatalystInstanceImplPendingJSCall;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.CommonModule_setScreenAwakeMode;
import o.ConvertByteArrayToFloatArray;
import o.EmbeddingAdapterExternalSyntheticLambda1;
import o.EncryptedContentInfoParser;
import o.GraniteBrownfieldModule_closeView;
import o.IndicatorView;
import o.M_;
import o.ReactNativeFeatureFlagsExternalSyntheticLambda0;
import o.SetDetectableSize;
import o.TimelineExternalSyntheticLambda0;
import o.UTF8Decoder;
import o._get_isNull_lambda0;
import o.access8100;
import o.accessMapSafely;
import o.addAllCommandLine;
import o.asDouble;
import o.asMaplambda6;
import o.createPaints;
import o.disableImageViewPreallocationAndroid;
import o.enableFabricRenderer;
import o.enableImagePrefetchingOnUiThreadAndroid;
import o.generateLink;
import o.getConsentFlowUserGeography;
import o.getIconPaddingLeft;
import o.getSWidth;
import o.getUrlokhttp;
import o.getWrite;
import o.importAppCert;
import o.isJSONTypeIgnore;
import o.isNumber;
import o.isOneShot;
import o.noStore;
import o.setBodyokhttp;
import o.setProtocolsokhttp;
import o.setVisitUrl;
import o.startRearDisplaySession;
import o.transparentBackground;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.main.more.notification.NotificationSettingAdapter$$ExternalSyntheticLambda2;
import viva.republica.toss.password.PasswordFragment;

@ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda0(onExtraCallback = startRearDisplaySession.HIGH)
@EmbeddingAdapterExternalSyntheticLambda1
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class Password6DFragment extends PasswordFragment implements View.OnClickListener {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onWarmupCompleted Companion;
    private static int ICustomTabsServiceDefault = 1;
    private static int ICustomTabsServiceStub = 0;
    static final /* synthetic */ addAllCommandLine<Object>[] onExtraCallbackWithResult;
    public static final int onWarmupCompleted;
    private static long prefetchWithMultipleUrls = 0;
    private static long requestPostMessageChannel = 0;
    private static int updateVisuals = 1;
    private static int warmup;
    public TextView IAuthTabCallback;
    public View IAuthTabCallbackDefault;
    private boolean ICustomTabsCallback_Parcel;
    private LinearLayout ICustomTabsService;
    private boolean mayLaunchUrl;
    private Button newAuthTabSession;
    private TdsCheckBoxV1View newSession;
    private String newSessionWithExtras;
    public ScrollView onExtraCallback;
    public ViewGroup onNavigationEvent;
    private ImageView onRelationshipValidationResult;
    private Button onTransact;
    private PasswordFragment.onExtraCallback postMessage;
    private TextView prefetch;
    private boolean receiveFile;
    private TextView requestPostMessageChannelWithExtras;
    private TextView setEngagementSignalsCallback;
    private final ArrayList<TextView> isEngagementSignalsApiAvailable = new ArrayList<>();
    private final ArrayList<String> extraCommand = new ArrayList<>();
    private final ArrayList<TextView> onUnminimized = new ArrayList<>();
    private final char[] ICustomTabsCallbackStubProxy = new char[6];
    private final Lazy ICustomTabsCallbackStub = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.password.Password6DFragment$$ExternalSyntheticLambda15
        public final Object invoke() {
            Object[] objArr = {this.f$0};
            return (importAppCert) Password6DFragment.onExtraCallbackWithResult(TTVideoLandingPageActivity.onExtraCallbackWithResult(), 2104119678, TTVideoLandingPageActivity.onExtraCallbackWithResult(), -2104119675, objArr, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult());
        }
    });
    private final ObservableProperty ICustomTabsCallbackDefault = ReactNativeFeatureFlagsExternalSyntheticLambda0.IAuthTabCallback(new GraniteBrownfieldModule_closeView((char[]) null, 1, (DefaultConstructorMarker) null));

    static {
        access000();
        Object[] objArr = new Object[1];
        b(new char[]{18679, 47883, 44824, 37658, 34566, 35625, 65309, 58160, 55093, 56122, 53055, 13093, 10046}, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 62459, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        b(new char[]{18681, 63136, 13404, 29638, 45468, 65321, 16073, 31895, 47638, 63948, 10083, 25860, 42157, 57966, 8214, 28591, 44294, 60604, 10932, 26678, 38895, 54726, 4920, 21212, 36965, 56846, 7567, 23410, 39171, 55482, 1629, 17903, 33745, 49488, 252, 20102, 35902, 52170, 2355, 46864, 63171, 13422, 29189, 45477, 65375, 15666, 31920, 47705, 63975, 10139, 25919, 42116}, 48731 - View.combineMeasuredStates(0, 0), objArr2);
        onExtraCallbackWithResult = new addAllCommandLine[]{new MutablePropertyReference1Impl<>(Password6DFragment.class, strIntern, ((String) objArr2[0]).intern(), 0)};
        Companion = new onWarmupCompleted(null);
        onWarmupCompleted = 8;
        int i = updateVisuals + 3;
        warmup = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Password6DFragment password6DFragment, isJSONTypeIgnore isjsontypeignore) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 109;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(password6DFragment, isjsontypeignore);
        int i4 = ICustomTabsServiceStub + 7;
        ICustomTabsServiceDefault = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ void IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 25;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        onExtraCallbackWithResult(iOnExtraCallbackWithResult, 666744783, TTVideoLandingPageActivity.onExtraCallbackWithResult(), -666744779, new Object[]{function1, obj}, iOnExtraCallbackWithResult2, TTVideoLandingPageActivity.onExtraCallbackWithResult());
        int i4 = ICustomTabsServiceDefault + 63;
        ICustomTabsServiceStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void IAuthTabCallback(Password6DFragment password6DFragment, DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsServiceDefault + 51;
        ICustomTabsServiceStub = i3 % 128;
        int i4 = i3 % 2;
        onExtraCallbackWithResult(password6DFragment, dialogInterface, i);
        if (i4 != 0) {
            int i5 = 85 / 0;
        }
    }

    public static /* synthetic */ Unit onExtraCallback(Password6DFragment password6DFragment, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 59;
        ICustomTabsServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(password6DFragment, commonModule_setLeftEdgeTouchEnabled);
        int i4 = ICustomTabsServiceStub + 53;
        ICustomTabsServiceDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 53 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallback(Password6DFragment password6DFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 53;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(password6DFragment, setDetectableSize);
        int i4 = ICustomTabsServiceDefault + 15;
        ICustomTabsServiceStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 5 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ void onExtraCallback(TextView textView, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 19;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(textView, valueAnimator);
        if (i3 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i2;
        int i9 = i7 | i8;
        int i10 = ~(i9 | i);
        int i11 = ~i;
        int i12 = (~(i7 | i2)) | (~(i8 | i11)) | (~(i8 | i4));
        int i13 = ~(i11 | i9);
        int i14 = i4 + i2 + i5 + (1938118820 * i3) + ((-1869228383) * i6);
        int i15 = i14 * i14;
        int i16 = (i4 * (-1046486968)) + 2037645312 + ((-1046486968) * i2) + (1604861810 * i10) + (i12 * (-1345052743)) + ((-1345052743) * i13) + (1903427584 * i5) + ((-1907359744) * i3) + (1374945280 * i6) + (1516044288 * i15);
        int i17 = ((i4 * 647972376) - 1941852458) + (i2 * 647972376) + (i10 * 1702) + (i12 * 851) + (i13 * 851) + (i5 * 647973227) + (i3 * (-1260466036)) + (i6 * 1557372491) + (i15 * 1239351296);
        switch (i16 + (i17 * i17 * 490405888)) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return onNavigationEvent(objArr);
            case 2:
                return onExtraCallback(objArr);
            case 3:
                return onWarmupCompleted(objArr);
            case 4:
                return onExtraCallbackWithResult(objArr);
            case 5:
                return asBinder(objArr);
            case 6:
                int i18 = 2 % 2;
                int i19 = ICustomTabsServiceStub + 73;
                ICustomTabsServiceDefault = i19 % 128;
                int i20 = i19 % 2;
                Unit unit = Unit.INSTANCE;
                int i21 = ICustomTabsServiceStub + 37;
                ICustomTabsServiceDefault = i21 % 128;
                int i22 = i21 % 2;
                return unit;
            case 7:
                return asInterface(objArr);
            case 8:
                return IAuthTabCallbackStub(objArr);
            default:
                return IAuthTabCallback(objArr);
        }
    }

    public static /* synthetic */ String onExtraCallbackWithResult(Password6DFragment password6DFragment, String str) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 43;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        String str2 = (String) onExtraCallbackWithResult(iOnExtraCallbackWithResult, 1654022982, TTVideoLandingPageActivity.onExtraCallbackWithResult(), -1654022974, new Object[]{password6DFragment, str}, iOnExtraCallbackWithResult2, TTVideoLandingPageActivity.onExtraCallbackWithResult());
        int i4 = ICustomTabsServiceDefault + 13;
        ICustomTabsServiceStub = i4 % 128;
        int i5 = i4 % 2;
        return str2;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Password6DFragment password6DFragment, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 25;
        ICustomTabsServiceStub = i2 % 128;
        if (i2 % 2 != 0) {
            onNavigationEvent(password6DFragment, view);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(password6DFragment, view);
        int i3 = ICustomTabsServiceDefault + 33;
        ICustomTabsServiceStub = i3 % 128;
        int i4 = i3 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Password6DFragment password6DFragment, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled, DialogInterface dialogInterface) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 113;
        ICustomTabsServiceDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(password6DFragment, commonModule_setLeftEdgeTouchEnabled, dialogInterface);
        }
        onWarmupCompleted(password6DFragment, commonModule_setLeftEdgeTouchEnabled, dialogInterface);
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Password6DFragment password6DFragment = (Password6DFragment) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 121;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        asInterface(password6DFragment, view);
        if (i3 == 0) {
            return null;
        }
        int i4 = 86 / 0;
        return null;
    }

    public static /* synthetic */ Unit onNavigationEvent(Throwable th) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 3;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr = {th};
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) onExtraCallbackWithResult(iOnExtraCallbackWithResult, 735835263, TTVideoLandingPageActivity.onExtraCallbackWithResult(), -735835257, objArr, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult());
        int i4 = ICustomTabsServiceStub + 61;
        ICustomTabsServiceDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(Password6DFragment password6DFragment, int i, View view) throws Throwable {
        int i2 = 2 % 2;
        int i3 = ICustomTabsServiceDefault + 75;
        ICustomTabsServiceStub = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(password6DFragment, i, view);
        if (i4 != 0) {
            int i5 = 13 / 0;
        }
        int i6 = ICustomTabsServiceStub + 101;
        ICustomTabsServiceDefault = i6 % 128;
        int i7 = i6 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onNavigationEvent(Password6DFragment password6DFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 51;
        ICustomTabsServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(password6DFragment, setDetectableSize);
        int i4 = ICustomTabsServiceStub + 55;
        ICustomTabsServiceDefault = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ void onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 107;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(function1, obj);
        if (i3 != 0) {
            int i4 = 66 / 0;
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        Password6DFragment password6DFragment = (Password6DFragment) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 115;
        ICustomTabsServiceDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback(password6DFragment);
        }
        onExtraCallback(password6DFragment);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(Password6DFragment password6DFragment, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 25;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(password6DFragment, view);
        int i4 = ICustomTabsServiceDefault + 69;
        ICustomTabsServiceStub = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(requestPostMessageChannel ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $11 + 81;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(requestPostMessageChannel)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 45812), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 83, 21233 - Color.blue(0), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.myPid() >> 22) + 14185), 19 - ExpandableListView.getPackedPositionType(0L), 8809 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 64918803, false, "d", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        int i6 = $10 + 87;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }

    @Override // viva.republica.toss.password.PasswordFragment
    public ScrollView IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault;
        int i3 = i2 + 125;
        ICustomTabsServiceStub = i3 % 128;
        int i4 = i3 % 2;
        ScrollView scrollView = this.onExtraCallback;
        Object obj = null;
        if (scrollView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i2 + 23;
        ICustomTabsServiceStub = i5 % 128;
        if (i5 % 2 == 0) {
            return scrollView;
        }
        obj.hashCode();
        throw null;
    }

    public void onExtraCallbackWithResult(@NotNull ScrollView scrollView) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 7;
        ICustomTabsServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(scrollView, "");
        this.onExtraCallback = scrollView;
        int i4 = ICustomTabsServiceStub + 99;
        ICustomTabsServiceDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // viva.republica.toss.password.PasswordFragment
    public TextView IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 51;
        int i3 = i2 % 128;
        ICustomTabsServiceDefault = i3;
        int i4 = i2 % 2;
        TextView textView = this.prefetch;
        int i5 = i3 + 95;
        ICustomTabsServiceStub = i5 % 128;
        int i6 = i5 % 2;
        return textView;
    }

    @Override // viva.republica.toss.password.PasswordFragment
    public void onWarmupCompleted(@Nullable TextView textView) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub;
        int i3 = i2 + 81;
        ICustomTabsServiceDefault = i3 % 128;
        int i4 = i3 % 2;
        this.prefetch = textView;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 43;
        ICustomTabsServiceDefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 85 / 0;
        }
    }

    private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = $10 + 43;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), Color.green(0) + 24, 19627 - (ViewConfiguration.getScrollBarSize() >> 8), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() / (prefetchWithMultipleUrls * 5407414049857832247L);
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", ""), Color.alpha(0) + 59, View.MeasureSpec.getMode(0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                Object[] objArr4 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), ExpandableListView.getPackedPositionType(0L) + 24, 19627 - (ViewConfiguration.getTouchSlop() >> 8), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback3).invoke(null, objArr4)).longValue() ^ (prefetchWithMultipleUrls ^ 5407414049857832247L);
                Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> 16), 59 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 6382 - TextUtils.lastIndexOf("", '0', 0, 0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i6 = $11 + 69;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr6 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.argb(0, 0, 0, 0), 59 - View.MeasureSpec.getSize(0), 6382 - TextUtils.indexOf((CharSequence) "", '0', 0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
                throw null;
            }
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr7 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback6 == null) {
                objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 58 - TextUtils.lastIndexOf("", '0', 0, 0), (ViewConfiguration.getEdgeSlop() >> 16) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback6).invoke(null, objArr7);
            int i7 = $11 + 23;
            $10 = i7 % 128;
            int i8 = i7 % 2;
        }
        String str = new String(cArr2);
        int i9 = $10 + 43;
        $11 = i9 % 128;
        if (i9 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }

    public void onNavigationEvent(@NotNull TextView textView) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 91;
        ICustomTabsServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(textView, "");
        this.IAuthTabCallback = textView;
        int i4 = ICustomTabsServiceStub + 15;
        ICustomTabsServiceDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // viva.republica.toss.password.PasswordFragment
    public TextView onTransact() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub;
        int i3 = i2 + 53;
        ICustomTabsServiceDefault = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        TextView textView = this.IAuthTabCallback;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i4 = i2 + 19;
        ICustomTabsServiceDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 89 / 0;
        }
        return textView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        r1 = viva.republica.toss.password.Password6DFragment.ICustomTabsServiceDefault + 37;
        viva.republica.toss.password.Password6DFragment.ICustomTabsServiceStub = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        if ((r1 % 2) != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        return r1;
     */
    @Override // viva.republica.toss.password.PasswordFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.ViewGroup onExtraCallbackWithResult() {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.password.Password6DFragment.ICustomTabsServiceStub
            int r1 = r1 + 61
            int r2 = r1 % 128
            viva.republica.toss.password.Password6DFragment.ICustomTabsServiceDefault = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L17
            android.view.ViewGroup r1 = r3.onNavigationEvent
            r2 = 56
            int r2 = r2 / 0
            if (r1 == 0) goto L1c
            goto L1b
        L17:
            android.view.ViewGroup r1 = r3.onNavigationEvent
            if (r1 == 0) goto L1c
        L1b:
            return r1
        L1c:
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            int r1 = viva.republica.toss.password.Password6DFragment.ICustomTabsServiceDefault
            int r1 = r1 + 37
            int r2 = r1 % 128
            viva.republica.toss.password.Password6DFragment.ICustomTabsServiceStub = r2
            int r1 = r1 % r0
            r0 = 0
            if (r1 != 0) goto L2e
            return r0
        L2e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.Password6DFragment.onExtraCallbackWithResult():android.view.ViewGroup");
    }

    public void onExtraCallbackWithResult(@NotNull ViewGroup viewGroup) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 77;
        ICustomTabsServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(viewGroup, "");
        this.onNavigationEvent = viewGroup;
        int i4 = ICustomTabsServiceStub + 15;
        ICustomTabsServiceDefault = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if ((r2 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        r2 = r2 + 77;
        viva.republica.toss.password.Password6DFragment.ICustomTabsServiceStub = r2 % 128;
     */
    @Override // viva.republica.toss.password.PasswordFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View asBinder() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.password.Password6DFragment.ICustomTabsServiceStub
            int r1 = r1 + 49
            int r2 = r1 % 128
            viva.republica.toss.password.Password6DFragment.ICustomTabsServiceDefault = r2
            int r1 = r1 % r0
            r3 = 0
            if (r1 != 0) goto L18
            android.view.View r1 = r5.IAuthTabCallbackDefault
            r4 = 61
            int r4 = r4 / 0
            if (r1 == 0) goto L2a
            goto L1c
        L18:
            android.view.View r1 = r5.IAuthTabCallbackDefault
            if (r1 == 0) goto L2a
        L1c:
            int r2 = r2 + 77
            int r4 = r2 % 128
            viva.republica.toss.password.Password6DFragment.ICustomTabsServiceStub = r4
            int r2 = r2 % r0
            if (r2 != 0) goto L26
            return r1
        L26:
            r3.hashCode()
            throw r3
        L2a:
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.Password6DFragment.asBinder():android.view.View");
    }

    public void onExtraCallback(@NotNull View view) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 47;
        ICustomTabsServiceStub = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            this.IAuthTabCallbackDefault = view;
            int i3 = 22 / 0;
        } else {
            Intrinsics.checkNotNullParameter(view, "");
            this.IAuthTabCallbackDefault = view;
        }
        int i4 = ICustomTabsServiceStub + 33;
        ICustomTabsServiceDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final importAppCert receiveFile() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 111;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        importAppCert importappcert = (importAppCert) this.ICustomTabsCallbackStub.getValue();
        if (i3 == 0) {
            return importappcert;
        }
        throw null;
    }

    private static final importAppCert onExtraCallback(Password6DFragment password6DFragment) throws Throwable {
        int iIsEngagementSignalsApiAvailable;
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 59;
        ICustomTabsServiceStub = i2 % 128;
        if (i2 % 2 == 0) {
            Context contextRequireContext = password6DFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            Resources resources = password6DFragment.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "");
            if (generateLink.IAuthTabCallback(resources)) {
                Object[] objArr = new Object[1];
                c(new char[]{7082, 7049, 63755, 1074, 4786, 54040, 14493, 64010, 46510, 24826, 33100, 35553, 18418}, AndroidCharacter.getMirror('0') - '/', objArr);
                iIsEngagementSignalsApiAvailable = Color.parseColor(((String) objArr[0]).intern());
                int i3 = ICustomTabsServiceDefault + 19;
                ICustomTabsServiceStub = i3 % 128;
                int i4 = i3 % 2;
            } else {
                iIsEngagementSignalsApiAvailable = setBodyokhttp.onExtraCallback(password6DFragment).isEngagementSignalsApiAvailable();
            }
            return new importAppCert(contextRequireContext, true, iIsEngagementSignalsApiAvailable, (Integer) null, 8, (DefaultConstructorMarker) null);
        }
        Intrinsics.checkNotNullExpressionValue(password6DFragment.requireContext(), "");
        Resources resources2 = password6DFragment.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "");
        generateLink.IAuthTabCallback(resources2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onExtraCallback(GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 75;
        ICustomTabsServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        this.ICustomTabsCallbackDefault.setValue(this, onExtraCallbackWithResult[0], graniteBrownfieldModule_closeView);
        int i4 = ICustomTabsServiceDefault + 57;
        ICustomTabsServiceStub = i4 % 128;
        int i5 = i4 % 2;
    }

    private final GraniteBrownfieldModule_closeView requestPostMessageChannelWithExtras() {
        ObservableProperty observableProperty;
        addAllCommandLine<Object> addallcommandline;
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 19;
        ICustomTabsServiceStub = i2 % 128;
        if (i2 % 2 != 0) {
            observableProperty = this.ICustomTabsCallbackDefault;
            addallcommandline = onExtraCallbackWithResult[0];
        } else {
            observableProperty = this.ICustomTabsCallbackDefault;
            addallcommandline = onExtraCallbackWithResult[0];
        }
        return (GraniteBrownfieldModule_closeView) observableProperty.getValue(this, addallcommandline);
    }

    private static final void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 77;
        ICustomTabsServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = ICustomTabsServiceStub + 77;
        ICustomTabsServiceDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 89;
        ICustomTabsServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        function1.invoke(obj);
        if (i3 == 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = ICustomTabsServiceStub + 105;
        ICustomTabsServiceDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 63 / 0;
        }
        return null;
    }

    private static final Unit onNavigationEvent(Password6DFragment password6DFragment, isJSONTypeIgnore isjsontypeignore) {
        int i = 2 % 2;
        getIconPaddingLeft.IAuthTabCallback.onExtraCallbackWithResult(new asDouble(isNumber.BIOMETRIC, isjsontypeignore.onNavigationEvent(), null, null, false, false, false, false, false, null, 1020, null));
        FragmentActivity activity = password6DFragment.getActivity();
        if (activity != null) {
            int i2 = ICustomTabsServiceDefault + 77;
            ICustomTabsServiceStub = i2 % 128;
            int i3 = i2 % 2;
            activity.finish();
            int i4 = ICustomTabsServiceDefault + 19;
            ICustomTabsServiceStub = i4 % 128;
            int i5 = i4 % 2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:210:0x068e  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x06c1  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x06c8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0127 A[PHI: r4
      0x0127: PHI (r4v18 java.lang.String) = (r4v81 java.lang.String), (r4v82 java.lang.String) binds: [B:35:0x0125, B:32:0x0103] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // viva.republica.toss.password.PasswordFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1897
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.Password6DFragment.onCreate(android.os.Bundle):void");
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        Password6DFragment password6DFragment = (Password6DFragment) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 109;
        ICustomTabsServiceDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullExpressionValue(password6DFragment.getString(R.string.help_text), "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        String string = password6DFragment.getString(R.string.help_text);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    private static final void IAuthTabCallback(final Password6DFragment password6DFragment, View view) throws Throwable {
        CharSequence text;
        String logValue;
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 73;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        if (password6DFragment.isEngagementSignalsApiAvailable()) {
            asMaplambda6 asmaplambda6 = asMaplambda6.onExtraCallback;
            createPaints createpaints = createPaints.IAuthTabCallback;
            IndicatorView indicatorViewAccess100 = createpaints.access100();
            String strValueOf = String.valueOf(indicatorViewAccess100 != null ? indicatorViewAccess100.getLoginYN() : null);
            IndicatorView indicatorViewAccess1002 = createpaints.access100();
            if (indicatorViewAccess1002 != null) {
                int i4 = ICustomTabsServiceDefault + 123;
                ICustomTabsServiceStub = i4 % 128;
                if (i4 % 2 != 0) {
                    indicatorViewAccess1002.getLogValue();
                    charSequence.hashCode();
                    throw null;
                }
                logValue = indicatorViewAccess1002.getLogValue();
            } else {
                logValue = null;
            }
            String strValueOf2 = String.valueOf(logValue);
            TextView textViewIAuthTabCallbackStub = password6DFragment.IAuthTabCallbackStub();
            asmaplambda6.onExtraCallback(strValueOf, strValueOf2, String.valueOf(textViewIAuthTabCallbackStub != null ? textViewIAuthTabCallbackStub.getText() : null), password6DFragment.onTransact().getText().toString(), password6DFragment.newSession(), password6DFragment.IAuthTabCallback_Parcel());
        } else {
            asMaplambda6 asmaplambda62 = asMaplambda6.onExtraCallback;
            createPaints createpaints2 = createPaints.IAuthTabCallback;
            IndicatorView indicatorViewAccess1003 = createpaints2.access100();
            String strValueOf3 = String.valueOf(indicatorViewAccess1003 != null ? indicatorViewAccess1003.getLoginYN() : null);
            IndicatorView indicatorViewAccess1004 = createpaints2.access100();
            String strValueOf4 = String.valueOf(indicatorViewAccess1004 != null ? indicatorViewAccess1004.getLogValue() : null);
            TextView textViewIAuthTabCallbackStub2 = password6DFragment.IAuthTabCallbackStub();
            if (textViewIAuthTabCallbackStub2 != null) {
                int i5 = ICustomTabsServiceDefault + 21;
                ICustomTabsServiceStub = i5 % 128;
                int i6 = i5 % 2;
                text = textViewIAuthTabCallbackStub2.getText();
            } else {
                text = null;
            }
            String strValueOf5 = String.valueOf(text);
            String string = password6DFragment.onTransact().getText().toString();
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1049608869);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getMaxKeyCode() >> 16), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 30, 24887 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -265239605, false, "onWarmupCompleted", (Class[]) null);
            }
            Object obj = ((Field) objOnExtraCallback).get(null);
            try {
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2027109327);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-16777216) - Color.rgb(0, 0, 0)), 30 - View.MeasureSpec.makeMeasureSpec(0, 0), 24886 - Process.getGidForName(""), -1234421087, false, "IAuthTabCallbackStub", new Class[0]);
                }
                asMaplambda6.onExtraCallbackWithResult(1721522975, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), -1721522972, new Object[]{asmaplambda62, strValueOf3, strValueOf4, strValueOf5, string, String.valueOf(((Integer) ((Method) objOnExtraCallback2).invoke(obj, null)).intValue()), password6DFragment.newSession(), password6DFragment.IAuthTabCallback_Parcel(), Long.valueOf(password6DFragment.readTypedObject()), null, 256, null});
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        Context contextRequireContext = password6DFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(contextRequireContext, new Function1() { // from class: viva.republica.toss.password.Password6DFragment$$ExternalSyntheticLambda12
            public final Object invoke(Object obj2) {
                return Password6DFragment.onExtraCallback(this.f$0, (CommonModule_setLeftEdgeTouchEnabled) obj2);
            }
        });
    }

    private static final Unit onWarmupCompleted(Password6DFragment password6DFragment, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled, DialogInterface dialogInterface) throws Throwable {
        String loginYN;
        String logValue;
        String loginYN2;
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 33;
        ICustomTabsServiceStub = i2 % 128;
        String logValue2 = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(dialogInterface, "");
            password6DFragment.isEngagementSignalsApiAvailable();
            logValue2.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        if (password6DFragment.isEngagementSignalsApiAvailable()) {
            asMaplambda6 asmaplambda6 = asMaplambda6.onExtraCallback;
            createPaints createpaints = createPaints.IAuthTabCallback;
            IndicatorView indicatorViewAccess100 = createpaints.access100();
            if (indicatorViewAccess100 != null) {
                int i3 = ICustomTabsServiceDefault + 25;
                ICustomTabsServiceStub = i3 % 128;
                if (i3 % 2 != 0) {
                    indicatorViewAccess100.getLoginYN();
                    throw null;
                }
                loginYN2 = indicatorViewAccess100.getLoginYN();
            } else {
                loginYN2 = null;
            }
            String strValueOf = String.valueOf(loginYN2);
            IndicatorView indicatorViewAccess1002 = createpaints.access100();
            if (indicatorViewAccess1002 != null) {
                int i4 = ICustomTabsServiceStub + 97;
                ICustomTabsServiceDefault = i4 % 128;
                if (i4 % 2 == 0) {
                    indicatorViewAccess1002.getLogValue();
                    throw null;
                }
                logValue2 = indicatorViewAccess1002.getLogValue();
            }
            String strValueOf2 = String.valueOf(logValue2);
            String strValueOf3 = String.valueOf((CharSequence) CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1303993273, new Object[]{commonModule_setLeftEdgeTouchEnabled}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1303993264, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult()));
            String strValueOf4 = String.valueOf(commonModule_setLeftEdgeTouchEnabled.onNavigationEvent());
            String string = password6DFragment.getString(im.toss.uikit.R.string.uikit_confirm);
            Intrinsics.checkNotNullExpressionValue(string, "");
            asmaplambda6.IAuthTabCallback(strValueOf, strValueOf2, strValueOf3, strValueOf4, string, password6DFragment.newSession(), password6DFragment.IAuthTabCallback_Parcel());
        } else {
            asMaplambda6 asmaplambda62 = asMaplambda6.onExtraCallback;
            createPaints createpaints2 = createPaints.IAuthTabCallback;
            IndicatorView indicatorViewAccess1003 = createpaints2.access100();
            if (indicatorViewAccess1003 != null) {
                int i5 = ICustomTabsServiceStub + 79;
                ICustomTabsServiceDefault = i5 % 128;
                int i6 = i5 % 2;
                loginYN = indicatorViewAccess1003.getLoginYN();
            } else {
                loginYN = null;
            }
            String strValueOf5 = String.valueOf(loginYN);
            IndicatorView indicatorViewAccess1004 = createpaints2.access100();
            if (indicatorViewAccess1004 != null) {
                logValue = indicatorViewAccess1004.getLogValue();
                int i7 = ICustomTabsServiceStub + 37;
                ICustomTabsServiceDefault = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 5 / 2;
                }
            } else {
                logValue = null;
            }
            String strValueOf6 = String.valueOf(logValue);
            String strValueOf7 = String.valueOf((CharSequence) CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1303993273, new Object[]{commonModule_setLeftEdgeTouchEnabled}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1303993264, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult()));
            String strValueOf8 = String.valueOf(commonModule_setLeftEdgeTouchEnabled.onNavigationEvent());
            String string2 = password6DFragment.getString(im.toss.uikit.R.string.uikit_confirm);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1049608869);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0, 0), (Process.myPid() >> 22) + 30, ExpandableListView.getPackedPositionChild(0L) + 24888, -265239605, false, "onWarmupCompleted", (Class[]) null);
            }
            Object obj = ((Field) objOnExtraCallback).get(null);
            try {
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2027109327);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (MotionEvent.axisFromString("") + 1), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 29, 24887 - (ViewConfiguration.getWindowTouchSlop() >> 8), -1234421087, false, "IAuthTabCallbackStub", new Class[0]);
                }
                asMaplambda6.onNavigationEvent(asmaplambda62, strValueOf5, strValueOf6, strValueOf7, strValueOf8, string2, String.valueOf(((Integer) ((Method) objOnExtraCallback2).invoke(obj, null)).intValue()), password6DFragment.newSession(), password6DFragment.IAuthTabCallback_Parcel(), password6DFragment.readTypedObject(), null, 512, null);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        dialogInterface.dismiss();
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(final Password6DFragment password6DFragment, final CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(password6DFragment.IAuthTabCallbackStubProxy());
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(password6DFragment.getString(R.string.password_use_biometric_dialog_message));
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, commonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(new Function1() { // from class: viva.republica.toss.password.Password6DFragment$$ExternalSyntheticLambda11
            public final Object invoke(Object obj) {
                return Password6DFragment.onExtraCallbackWithResult(this.f$0, commonModule_setLeftEdgeTouchEnabled, (DialogInterface) obj);
            }
        })};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i2 = ICustomTabsServiceStub + 113;
        ICustomTabsServiceDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(Password6DFragment password6DFragment, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 19;
        ICustomTabsServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        password6DFragment.onClick(view);
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsServiceDefault + 85;
        ICustomTabsServiceStub = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(Password6DFragment password6DFragment, SetDetectableSize setDetectableSize) throws Throwable {
        String strIEngagementSignalsCallbackDefault;
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 5;
        ICustomTabsServiceDefault = i2 % 128;
        String strUpdateVisuals = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback();
            PasswordFragment.onExtraCallback onextracallback = password6DFragment.postMessage;
            strUpdateVisuals.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Map mapOnExtraCallback = setDetectableSize.onExtraCallback();
        PasswordFragment.onExtraCallback onextracallback2 = password6DFragment.postMessage;
        if (onextracallback2 != null) {
            int i3 = ICustomTabsServiceDefault + 17;
            ICustomTabsServiceStub = i3 % 128;
            int i4 = i3 % 2;
            strIEngagementSignalsCallbackDefault = onextracallback2.IEngagementSignalsCallbackDefault();
        } else {
            strIEngagementSignalsCallbackDefault = null;
        }
        Object[] objArr = new Object[1];
        c(new char[]{29210, 29290, 61761, 14604, 6821, 61048, 29094, 45918, 56411, 26869, 48171, 50145}, 1 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr);
        mapOnExtraCallback.put(((String) objArr[0]).intern(), strIEngagementSignalsCallbackDefault);
        Map mapOnExtraCallback2 = setDetectableSize.onExtraCallback();
        Object[] objArr2 = new Object[1];
        c(new char[]{50319, 50414, 16592, 42178, 43819, 29625, 33087, 17393, 27351, 55664, 8686, 13126, 39042, 1914, 38701, 23707, 52839, 46737, 17691, 36566, 31744, 58593, 11073, 14581, 41983}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr2);
        mapOnExtraCallback2.put(((String) objArr2[0]).intern(), CatalystInstanceImplPendingJSCall.onNavigationEvent(CatalystInstanceImplPendingJSCall.onWarmupCompleted(password6DFragment.postMessage)));
        Map mapOnExtraCallback3 = setDetectableSize.onExtraCallback();
        Object[] objArr3 = new Object[1];
        b(new char[]{18664, 24714, 6173, 12723, 59691, 33465, 47700, 21490, 2882, 9466, 56444, 62972}, Color.rgb(0, 0, 0) + 16787573, objArr3);
        mapOnExtraCallback3.put(((String) objArr3[0]).intern(), _get_isNull_lambda0.onExtraCallbackWithResult.onWarmupCompleted());
        Map mapOnExtraCallback4 = setDetectableSize.onExtraCallback();
        Button button = password6DFragment.newAuthTabSession;
        if (button == null) {
            int i5 = ICustomTabsServiceStub + 95;
            ICustomTabsServiceDefault = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            button = null;
        }
        Object[] objArr4 = new Object[1];
        b(new char[]{18684, 36522, 50280, 6697, 20981, 38837, 60743, 9005, 31487, 45219, 63096, 52272}, TextUtils.getCapsMode("", 0, 0) + 50753, objArr4);
        mapOnExtraCallback4.put(((String) objArr4[0]).intern(), button.getText().toString());
        Map mapOnExtraCallback5 = setDetectableSize.onExtraCallback();
        TextView textViewIAuthTabCallbackStub = password6DFragment.IAuthTabCallbackStub();
        CharSequence text = textViewIAuthTabCallbackStub != null ? textViewIAuthTabCallbackStub.getText() : null;
        Object[] objArr5 = new Object[1];
        b(new char[]{18666, 33112, 56244, 5631, 28231}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 51631, objArr5);
        mapOnExtraCallback5.put(((String) objArr5[0]).intern(), String.valueOf(text));
        Map mapOnExtraCallback6 = setDetectableSize.onExtraCallback();
        Object[] objArr6 = new Object[1];
        b(new char[]{18682, 52416, 16539, 50252, 22528, 56784, 20876, 54647, 26927, 61154, 25278}, 33851 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr6);
        mapOnExtraCallback6.put(((String) objArr6[0]).intern(), password6DFragment.onTransact().getText().toString());
        Map mapOnExtraCallback7 = setDetectableSize.onExtraCallback();
        createPaints createpaints = createPaints.IAuthTabCallback;
        IndicatorView indicatorViewAccess100 = createpaints.access100();
        String loginYN = indicatorViewAccess100 != null ? indicatorViewAccess100.getLoginYN() : null;
        Object[] objArr7 = new Object[1];
        b(new char[]{18674, 30476, 14083, 63232, 46852, 30512, 14089, 63259}, 16381 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr7);
        mapOnExtraCallback7.put(((String) objArr7[0]).intern(), loginYN);
        Map mapOnExtraCallback8 = setDetectableSize.onExtraCallback();
        IndicatorView indicatorViewAccess1002 = createpaints.access100();
        String logValue = indicatorViewAccess1002 != null ? indicatorViewAccess1002.getLogValue() : null;
        Object[] objArr8 = new Object[1];
        c(new char[]{22439, 22478, 29847, 46776, 40820, 25028, 1151, 50868, 63996, 60705, 13225, 46619, 2998, 13074, 34143}, -Process.getGidForName(""), objArr8);
        mapOnExtraCallback8.put(((String) objArr8[0]).intern(), logValue);
        Map mapOnExtraCallback9 = setDetectableSize.onExtraCallback();
        Object[] objArr9 = new Object[1];
        b(new char[]{18687, 12281, 34508, 32194, 54463, 19377, 8856, 39236, 28773, 55131, 20052}, (ViewConfiguration.getScrollBarSize() >> 8) + 26387, objArr9);
        String strIntern = ((String) objArr9[0]).intern();
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1049608869);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 29 - MotionEvent.axisFromString(""), 24887 - (Process.myPid() >> 22), -265239605, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2027109327);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.normalizeMetaState(0), 30 - (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getPressedStateDuration() >> 16) + 24887, -1234421087, false, "IAuthTabCallbackStub", new Class[0]);
            }
            mapOnExtraCallback9.put(strIntern, Integer.valueOf(((Integer) ((Method) objOnExtraCallback2).invoke(obj, null)).intValue() + 1));
            Map mapOnExtraCallback10 = setDetectableSize.onExtraCallback();
            Object[] objArr10 = new Object[1];
            b(new char[]{18684, 22386, 30715, 5710, 14059, 54642, 62964, 37973, 46313, 21322, 29634}, 8068 - ImageFormat.getBitsPerPixel(0), objArr10);
            mapOnExtraCallback10.put(((String) objArr10[0]).intern(), password6DFragment.newSession());
            Map mapOnExtraCallback11 = setDetectableSize.onExtraCallback();
            Object[] objArr11 = new Object[1];
            b(new char[]{18684, 49616, 23231, 54196, 27747, 58664, 32256, 35047, 505, 39586, 4976, 44118, 9513, 48654, 51427, 16814, 55936}, 35110 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr11);
            mapOnExtraCallback11.put(((String) objArr11[0]).intern(), password6DFragment.IAuthTabCallback_Parcel());
            Map mapOnExtraCallback12 = setDetectableSize.onExtraCallback();
            Object[] objArr12 = new Object[1];
            b(new char[]{18680, 1658, 54738, 41795, 29375, 49191, 40871, 27904, 15474}, View.MeasureSpec.makeMeasureSpec(0, 0) + 20113, objArr12);
            mapOnExtraCallback12.put(((String) objArr12[0]).intern(), Long.valueOf(password6DFragment.readTypedObject()));
            Map mapOnExtraCallback13 = setDetectableSize.onExtraCallback();
            Object[] objArr13 = new Object[1];
            c(new char[]{51635, 51589, 35379, 15576, 25038, 60331, 54353, 5784, 26584, 5003, 47608}, -TextUtils.lastIndexOf("", '0'), objArr13);
            String strIntern2 = ((String) objArr13[0]).intern();
            Object[] objArr14 = new Object[1];
            c(new char[]{12411, 12322, 24741, 11146, 26370}, TextUtils.getOffsetAfter("", 0) + 1, objArr14);
            mapOnExtraCallback13.put(strIntern2, ((String) objArr14[0]).intern());
            Map mapOnExtraCallback14 = setDetectableSize.onExtraCallback();
            PasswordFragment.onExtraCallback onextracallback3 = password6DFragment.postMessage;
            if (onextracallback3 != null) {
                int i7 = ICustomTabsServiceDefault + 21;
                ICustomTabsServiceStub = i7 % 128;
                if (i7 % 2 != 0) {
                    onextracallback3.updateVisuals();
                    throw null;
                }
                strUpdateVisuals = onextracallback3.updateVisuals();
            }
            Object[] objArr15 = new Object[1];
            b(new char[]{18683, 6511, 60408, 48247, 3803, 57196, 41409, 29263, 50352, 38176}, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 20873, objArr15);
            mapOnExtraCallback14.put(((String) objArr15[0]).intern(), strUpdateVisuals);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static final void asInterface(final Password6DFragment password6DFragment, View view) {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1520731L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.password.Password6DFragment$$ExternalSyntheticLambda14
            public final Object invoke(Object obj) {
                return Password6DFragment.onExtraCallback(this.f$0, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        PasswordFragment.IAuthTabCallback iAuthTabCallbackExtraCallbackWithResult = password6DFragment.extraCallbackWithResult();
        if (iAuthTabCallbackExtraCallbackWithResult != null) {
            int i2 = ICustomTabsServiceDefault + 15;
            ICustomTabsServiceStub = i2 % 128;
            int i3 = i2 % 2;
            iAuthTabCallbackExtraCallbackWithResult.IAuthTabCallback();
        }
        int i4 = ICustomTabsServiceStub + 45;
        ICustomTabsServiceDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(Password6DFragment password6DFragment, int i, View view) throws Throwable {
        int i2 = 2 % 2;
        int i3 = ICustomTabsServiceStub + 53;
        ICustomTabsServiceDefault = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            password6DFragment.onClick(view);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(view, "");
        password6DFragment.onClick(view);
        int i4 = 25 / 0;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        View viewInflate = layoutInflater.inflate(R.layout.fragment_password_6d, viewGroup, false);
        Intrinsics.checkNotNull(viewInflate);
        IAuthTabCallback(viewInflate);
        View viewFindViewById = viewInflate.findViewById(R.id.password_llNumberpad);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        this.ICustomTabsService = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.password_llInput);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
        onExtraCallbackWithResult((ViewGroup) viewFindViewById2);
        getConsentFlowUserGeography.onExtraCallbackWithResult(onExtraCallbackWithResult());
        View viewFindViewById3 = viewInflate.findViewById(R.id.scroll_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
        onExtraCallbackWithResult((ScrollView) viewFindViewById3);
        onWarmupCompleted((TextView) viewInflate.findViewById(R.id.password_tvInfo));
        View viewFindViewById4 = viewInflate.findViewById(R.id.password_tvSubInfo);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "");
        onNavigationEvent((TextView) viewFindViewById4);
        int iAsInterface = M_.onExtraCallback.asInterface();
        LinearLayout linearLayout = this.ICustomTabsService;
        Object obj = null;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            linearLayout = null;
        }
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(iAsInterface - varyMatches.onNavigationEvent(24, displayMetrics), -1));
        onNavigationEvent(this.ICustomTabsCallbackStubProxy);
        View viewFindViewById5 = viewInflate.findViewById(R.id.password_ibtNumberBack);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "");
        this.onRelationshipValidationResult = (ImageView) viewFindViewById5;
        View viewFindViewById6 = viewInflate.findViewById(R.id.password_btnLookAhead);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "");
        this.onTransact = (Button) viewFindViewById6;
        View viewFindViewById7 = viewInflate.findViewById(R.id.reset_password_button);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "");
        this.newAuthTabSession = (Button) viewFindViewById7;
        View viewFindViewById8 = viewInflate.findViewById(R.id.password_use_fingerprint);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "");
        onExtraCallback(viewFindViewById8);
        View viewFindViewById9 = viewInflate.findViewById(R.id.password_use_fingerprint_message);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "");
        this.requestPostMessageChannelWithExtras = (TextView) viewFindViewById9;
        TdsCheckBoxV1View tdsCheckBoxV1ViewFindViewById = viewInflate.findViewById(R.id.password_use_fingerprint_checkbox);
        Intrinsics.checkNotNull(tdsCheckBoxV1ViewFindViewById, "");
        this.newSession = tdsCheckBoxV1ViewFindViewById;
        View viewFindViewById10 = viewInflate.findViewById(R.id.password_use_fingerprint_question);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "");
        this.setEngagementSignalsCallback = (TextView) viewFindViewById10;
        asBinder().setVisibility(8);
        View viewAsBinder = asBinder();
        TextView textView = this.requestPostMessageChannelWithExtras;
        if (textView == null) {
            int i2 = ICustomTabsServiceStub + 1;
            ICustomTabsServiceDefault = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                obj.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            textView = null;
        }
        CharSequence text = textView.getText();
        TdsCheckBoxV1View tdsCheckBoxV1View = this.newSession;
        if (tdsCheckBoxV1View == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            tdsCheckBoxV1View = null;
        }
        String string = getString(tdsCheckBoxV1View.isChecked() ? R.string.app_password_check_done : R.string.app_password_check_not_done);
        StringBuilder sb = new StringBuilder();
        sb.append((Object) text);
        Object[] objArr = new Object[1];
        c(new char[]{8362, 8330, 35775, 31381, 25447}, 1 - TextUtils.indexOf("", ""), objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(string);
        viewAsBinder.setContentDescription(sb.toString());
        TextView textView2 = this.setEngagementSignalsCallback;
        if (textView2 == null) {
            int i3 = ICustomTabsServiceStub + 103;
            ICustomTabsServiceDefault = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            textView2 = null;
        }
        Object[] objArr2 = new Object[1];
        c(new char[]{53980, 54012, 7210, 14601, 6018, 4998}, Color.red(0) + 1, objArr2);
        textView2.setText(((String) objArr2[0]).intern());
        transparentBackground.onWarmupCompleted(NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted(), new Object[]{textView2, new Function1() { // from class: viva.republica.toss.password.Password6DFragment$$ExternalSyntheticLambda5
            public final Object invoke(Object obj2) {
                return Password6DFragment.onExtraCallbackWithResult(this.f$0, (String) obj2);
            }
        }, null, false, 6, null}, NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted(), -2039764647, NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted(), 2039764661, NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted());
        textView2.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.password.Password6DFragment$$ExternalSyntheticLambda6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Throwable {
                Password6DFragment.onWarmupCompleted(this.f$0, view);
            }
        });
        asBinder().setOnClickListener(this);
        importAppCert importappcertReceiveFile = receiveFile();
        ImageView imageView = this.onRelationshipValidationResult;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = ICustomTabsServiceDefault + 35;
            ICustomTabsServiceStub = i4 % 128;
            int i5 = i4 % 2;
            imageView = null;
        }
        importappcertReceiveFile.IAuthTabCallback(imageView, new Function1() { // from class: viva.republica.toss.password.Password6DFragment$$ExternalSyntheticLambda7
            public final Object invoke(Object obj2) {
                return Password6DFragment.onExtraCallbackWithResult(this.f$0, (View) obj2);
            }
        });
        boolean z = (extraCallbackWithResult() == null || onMessageChannelReady()) ? false : true;
        this.receiveFile = z;
        if (z) {
            int i6 = ICustomTabsServiceStub + 35;
            ICustomTabsServiceDefault = i6 % 128;
            if (i6 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            Button button = this.onTransact;
            if (button == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                button = null;
            }
            button.setVisibility(8);
            Button button2 = this.newAuthTabSession;
            if (button2 == null) {
                int i7 = ICustomTabsServiceStub + 23;
                ICustomTabsServiceDefault = i7 % 128;
                if (i7 % 2 == 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i8 = 71 / 0;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                button2 = null;
            }
            button2.setVisibility(0);
            Button button3 = this.newAuthTabSession;
            if (button3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                button3 = null;
            }
            button3.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.password.Password6DFragment$$ExternalSyntheticLambda8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {this.f$0, view};
                    Password6DFragment.onExtraCallbackWithResult(TTVideoLandingPageActivity.onExtraCallbackWithResult(), 961695099, TTVideoLandingPageActivity.onExtraCallbackWithResult(), -961695098, objArr3, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult());
                }
            });
        } else {
            Button button4 = this.onTransact;
            if (button4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                button4 = null;
            }
            button4.setVisibility(4);
            Button button5 = this.onTransact;
            if (button5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                button5 = null;
            }
            button5.setOnClickListener(this);
            Button button6 = this.newAuthTabSession;
            if (button6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                button6 = null;
            }
            button6.setVisibility(8);
        }
        this.onUnminimized.clear();
        this.onUnminimized.add(viewInflate.findViewById(R.id.password_tvInput1));
        this.onUnminimized.add(viewInflate.findViewById(R.id.password_tvInput2));
        this.onUnminimized.add(viewInflate.findViewById(R.id.password_tvInput3));
        this.onUnminimized.add(viewInflate.findViewById(R.id.password_tvInput4));
        this.onUnminimized.add(viewInflate.findViewById(R.id.password_tvInput5));
        this.onUnminimized.add(viewInflate.findViewById(R.id.password_tvInput6));
        this.isEngagementSignalsApiAvailable.clear();
        this.isEngagementSignalsApiAvailable.add(viewInflate.findViewById(R.id.password_btnNumber1));
        this.isEngagementSignalsApiAvailable.add(viewInflate.findViewById(R.id.password_btnNumber2));
        this.isEngagementSignalsApiAvailable.add(viewInflate.findViewById(R.id.password_btnNumber3));
        this.isEngagementSignalsApiAvailable.add(viewInflate.findViewById(R.id.password_btnNumber4));
        this.isEngagementSignalsApiAvailable.add(viewInflate.findViewById(R.id.password_btnNumber5));
        this.isEngagementSignalsApiAvailable.add(viewInflate.findViewById(R.id.password_btnNumber6));
        this.isEngagementSignalsApiAvailable.add(viewInflate.findViewById(R.id.password_btnNumber7));
        this.isEngagementSignalsApiAvailable.add(viewInflate.findViewById(R.id.password_btnNumber8));
        this.isEngagementSignalsApiAvailable.add(viewInflate.findViewById(R.id.password_btnNumber9));
        this.isEngagementSignalsApiAvailable.add(viewInflate.findViewById(R.id.password_btnNumber0));
        this.extraCommand.clear();
        int i9 = 0;
        while (i9 < 10) {
            int i10 = ICustomTabsServiceDefault + 61;
            ICustomTabsServiceStub = i10 % 128;
            if (i10 % 2 != 0) {
                this.extraCommand.add(String.valueOf(i9));
                i9 += 60;
            } else {
                this.extraCommand.add(String.valueOf(i9));
                i9++;
            }
        }
        Collections.shuffle(this.extraCommand);
        int i11 = 0;
        for (Object obj2 : this.onUnminimized) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                int i13 = ICustomTabsServiceStub + 85;
                ICustomTabsServiceDefault = i13 % 128;
                if (i13 % 2 == 0) {
                    CollectionsKt.throwIndexOverflow();
                    int i14 = 89 / 0;
                } else {
                    CollectionsKt.throwIndexOverflow();
                }
            }
            ((TextView) obj2).setContentDescription(getString(R.string.app_password___e445d6d193, new Object[]{Integer.valueOf(i12)}));
            i11 = i12;
        }
        int i15 = 0;
        for (TextView textView3 : this.isEngagementSignalsApiAvailable) {
            String str = this.extraCommand.get(i15);
            Intrinsics.checkNotNullExpressionValue(str, "");
            textView3.setText(str);
            i15++;
        }
        receiveFile().onNavigationEvent(this.extraCommand);
        receiveFile().onExtraCallback(this.isEngagementSignalsApiAvailable, new Function2() { // from class: viva.republica.toss.password.Password6DFragment$$ExternalSyntheticLambda9
            public final Object invoke(Object obj3, Object obj4) {
                return Password6DFragment.onNavigationEvent(this.f$0, ((Integer) obj3).intValue(), (View) obj4);
            }
        });
        ArrayList<TextView> arrayList = this.isEngagementSignalsApiAvailable;
        ImageView imageView2 = this.onRelationshipValidationResult;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            imageView2 = null;
        }
        for (View view : CollectionsKt.plus(arrayList, imageView2)) {
            getConsentFlowUserGeography.onExtraCallbackWithResult(view);
            setProtocolsokhttp.onExtraCallback(view);
        }
        if (getContext() != null) {
            int i16 = ICustomTabsServiceStub + 67;
            ICustomTabsServiceDefault = i16 % 128;
            int i17 = i16 % 2;
            if (((Boolean) PasswordFragment.onNavigationEvent(-1249015494, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 1249015496, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this})).booleanValue()) {
                asBinder().setVisibility(0);
                TdsCheckBoxV1View tdsCheckBoxV1View2 = this.newSession;
                if (tdsCheckBoxV1View2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    tdsCheckBoxV1View2 = null;
                }
                tdsCheckBoxV1View2.setChecked(true);
                TextView textView4 = this.requestPostMessageChannelWithExtras;
                if (textView4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    textView4 = null;
                }
                textView4.setText(getString(R.string.face_auth_impl_use_face_auth_next_time));
                TextView textView5 = this.setEngagementSignalsCallback;
                if (textView5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    textView5 = null;
                }
                textView5.setVisibility(8);
            } else {
                asBinder().setVisibility(PasswordFragment.onWarmupCompleted(this, (UTF8Decoder) null, 1, (Object) null) ? 0 : 8);
                TdsCheckBoxV1View tdsCheckBoxV1View3 = this.newSession;
                if (tdsCheckBoxV1View3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    tdsCheckBoxV1View3 = null;
                }
                tdsCheckBoxV1View3.setChecked(!((Boolean) PasswordFragment.onNavigationEvent(267836324, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), -267836323, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this})).booleanValue());
                TextView textView6 = this.requestPostMessageChannelWithExtras;
                if (textView6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    textView6 = null;
                }
                textView6.setText(access100());
            }
        }
        if (((CharSequence) PasswordFragment.onNavigationEvent(-1529118887, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 1529118893, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this})) == null) {
            int i18 = ICustomTabsServiceDefault + 27;
            ICustomTabsServiceStub = i18 % 128;
            if (i18 % 2 != 0) {
                onExtraCallback(onExtraCallbackWithResult(onActivityLayout()), (CharSequence) PasswordFragment.onNavigationEvent(50819534, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), -50819529, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this, onActivityLayout()}));
                obj.hashCode();
                throw null;
            }
            onExtraCallback(onExtraCallbackWithResult(onActivityLayout()), (CharSequence) PasswordFragment.onNavigationEvent(50819534, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), -50819529, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this, onActivityLayout()}));
            int i19 = ICustomTabsServiceStub + 71;
            ICustomTabsServiceDefault = i19 % 128;
            int i20 = i19 % 2;
        } else {
            CharSequence charSequence = (CharSequence) PasswordFragment.onNavigationEvent(-1529118887, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 1529118893, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this});
            Intrinsics.checkNotNull(charSequence);
            CharSequence charSequenceOnPostMessage = onPostMessage();
            Intrinsics.checkNotNull(charSequenceOnPostMessage);
            onNavigationEvent(charSequence, charSequenceOnPostMessage);
            onExtraCallback((CharSequence) null);
            onWarmupCompleted((CharSequence) null);
        }
        onExtraCallbackWithResult(viewInflate);
        return viewInflate;
    }

    private static final void onExtraCallbackWithResult(Password6DFragment password6DFragment, DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsServiceStub + 93;
        ICustomTabsServiceDefault = i3 % 128;
        int i4 = i3 % 2;
        password6DFragment.ICustomTabsCallback_Parcel = true;
        dialogInterface.dismiss();
        int i5 = ICustomTabsServiceStub + 89;
        ICustomTabsServiceDefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 0 / 0;
        }
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Throwable thOnExtraCallback;
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 13;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        accessMapSafely accessmapsafely = accessMapSafely.onNavigationEvent;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        if (accessmapsafely.IAuthTabCallback(contextRequireContext) && (thOnExtraCallback = enableFabricRenderer.onExtraCallback.onExtraCallback()) != null) {
            int i4 = ICustomTabsServiceDefault + 91;
            ICustomTabsServiceStub = i4 % 128;
            if (i4 % 2 != 0) {
                RxBiometric.Companion.onExtraCallbackWithResult(thOnExtraCallback);
                throw null;
            }
            if (RxBiometric.Companion.onExtraCallbackWithResult(thOnExtraCallback)) {
                TdsDialogV1.onExtraCallbackWithResult onextracallbackwithresult = TdsDialogV1.Companion;
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted onwarmupcompleted = (TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) onextracallbackwithresult.onExtraCallback(context).onNavigationEvent(false);
                String string = getString(R.string.app_password___b2387d7b1d);
                Intrinsics.checkNotNullExpressionValue(string, "");
                TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted onwarmupcompleted2 = (TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), -963962278, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), 963962280, new Object[]{(TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) onwarmupcompleted.onNavigationEvent(string), Integer.valueOf(R.drawable.image_popup_fingerprint_add)}, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback());
                String string2 = getString(R.string.app_password___df8739daab);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted onwarmupcompleted3 = (TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) onwarmupcompleted2.onExtraCallbackWithResult(string2);
                String string3 = getString(im.toss.uikit.R.string.uikit_confirm);
                Intrinsics.checkNotNullExpressionValue(string3, "");
                TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted.onExtraCallback(onwarmupcompleted3, string3, new DialogInterface.OnClickListener() { // from class: viva.republica.toss.password.Password6DFragment$$ExternalSyntheticLambda0
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i5) {
                        Password6DFragment.IAuthTabCallback(this.f$0, dialogInterface, i5);
                    }
                }, (TdsButtonV1View.asInterface) null, false, 12, (Object) null).readTypedObject();
            }
        }
        if (!(!ICustomTabsCallback_Parcel())) {
            prefetch();
        }
        int i5 = ICustomTabsServiceStub + 53;
        ICustomTabsServiceDefault = i5 % 128;
        int i6 = i5 % 2;
    }

    private final String newSession() throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 95;
        ICustomTabsServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        if (!(!PasswordFragment.onWarmupCompleted(this, (UTF8Decoder) null, 1, (Object) null))) {
            int i4 = ICustomTabsServiceStub + 49;
            ICustomTabsServiceDefault = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            c(new char[]{12411, 12322, 24741, 11146, 26370}, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1, objArr);
            return ((String) objArr[0]).intern();
        }
        Object[] objArr2 = new Object[1];
        b(new char[]{18640}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 30868, objArr2);
        String strIntern = ((String) objArr2[0]).intern();
        int i6 = ICustomTabsServiceDefault + 55;
        ICustomTabsServiceStub = i6 % 128;
        if (i6 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String IAuthTabCallback_Parcel() throws java.lang.Throwable {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV1View r1 = r6.newSession
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L4e
            int r4 = viva.republica.toss.password.Password6DFragment.ICustomTabsServiceStub
            int r4 = r4 + 89
            int r5 = r4 % 128
            viva.republica.toss.password.Password6DFragment.ICustomTabsServiceDefault = r5
            int r4 = r4 % r0
            if (r1 != 0) goto L23
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            int r1 = viva.republica.toss.password.Password6DFragment.ICustomTabsServiceDefault
            int r1 = r1 + 109
            int r4 = r1 % 128
            viva.republica.toss.password.Password6DFragment.ICustomTabsServiceStub = r4
            int r1 = r1 % r0
            r1 = 0
        L23:
            boolean r1 = r1.isChecked()
            if (r1 == 0) goto L4e
            int r1 = viva.republica.toss.password.Password6DFragment.ICustomTabsServiceDefault
            int r1 = r1 + 43
            int r4 = r1 % 128
            viva.republica.toss.password.Password6DFragment.ICustomTabsServiceStub = r4
            int r1 = r1 % r0
            r0 = 5
            char[] r0 = new char[r0]
            r0 = {x0062: FILL_ARRAY_DATA , data: [12411, 12322, 24741, 11146, 26370} // fill-array
            int r1 = android.view.ViewConfiguration.getTouchSlop()
            int r1 = r1 >> 8
            int r1 = 1 - r1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            c(r0, r1, r2)
            r0 = r2[r3]
        L47:
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            return r0
        L4e:
            char[] r0 = new char[r2]
            r1 = 18640(0x48d0, float:2.612E-41)
            r0[r3] = r1
            int r1 = android.view.View.resolveSize(r3, r3)
            int r1 = 30869 - r1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            b(r0, r1, r2)
            r0 = r2[r3]
            goto L47
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.Password6DFragment.IAuthTabCallback_Parcel():java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0296  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onClick(@org.jetbrains.annotations.NotNull android.view.View r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 847
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.Password6DFragment.onClick(android.view.View):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object asInterface(java.lang.Object[] r12) {
        /*
            r0 = 0
            r12 = r12[r0]
            viva.republica.toss.password.Password6DFragment r12 = (viva.republica.toss.password.Password6DFragment) r12
            r1 = 2
            int r2 = r1 % r1
            int r2 = viva.republica.toss.password.Password6DFragment.ICustomTabsServiceDefault
            int r2 = r2 + 55
            int r3 = r2 % 128
            viva.republica.toss.password.Password6DFragment.ICustomTabsServiceStub = r3
            int r2 = r2 % r1
            java.lang.Object[] r9 = new java.lang.Object[]{r12}
            int r4 = im.toss.rn.granite.core.module.appsintoss.bridge.ad.ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent()
            int r7 = im.toss.rn.granite.core.module.appsintoss.bridge.ad.ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent()
            int r6 = im.toss.rn.granite.core.module.appsintoss.bridge.ad.ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent()
            int r8 = im.toss.rn.granite.core.module.appsintoss.bridge.ad.ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent()
            r3 = -1249015494(0xffffffffb58d893a, float:-1.0545257E-6)
            r5 = 1249015496(0x4a7276c8, float:3972530.0)
            java.lang.Object r2 = viva.republica.toss.password.PasswordFragment.onNavigationEvent(r3, r4, r5, r6, r7, r8, r9)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            java.lang.String r3 = ""
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L70
            android.view.View r2 = r12.asBinder()
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L6d
            int r2 = viva.republica.toss.password.Password6DFragment.ICustomTabsServiceStub
            int r6 = r2 + 17
            int r7 = r6 % 128
            viva.republica.toss.password.Password6DFragment.ICustomTabsServiceDefault = r7
            int r6 = r6 % r1
            im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV1View r6 = r12.newSession
            if (r6 != 0) goto L5d
            int r2 = r2 + 95
            int r6 = r2 % 128
            viva.republica.toss.password.Password6DFragment.ICustomTabsServiceDefault = r6
            int r2 = r2 % r1
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
            r6 = r5
        L5d:
            boolean r2 = r6.isChecked()
            if (r2 == 0) goto L6d
            int r0 = viva.republica.toss.password.Password6DFragment.ICustomTabsServiceStub
            int r0 = r0 + 43
            int r2 = r0 % 128
            viva.republica.toss.password.Password6DFragment.ICustomTabsServiceDefault = r2
            int r0 = r0 % r1
            r0 = r4
        L6d:
            r12.mayLaunchUrl = r0
            goto Lab
        L70:
            boolean r2 = r12.ICustomTabsCallback_Parcel
            if (r2 == r4) goto L9f
            android.view.View r2 = r12.asBinder()
            int r2 = r2.getVisibility()
            if (r2 != 0) goto La9
            int r2 = viva.republica.toss.password.Password6DFragment.ICustomTabsServiceDefault
            int r2 = r2 + 75
            int r6 = r2 % 128
            viva.republica.toss.password.Password6DFragment.ICustomTabsServiceStub = r6
            int r2 = r2 % r1
            if (r2 == 0) goto L91
            im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV1View r2 = r12.newSession
            r6 = 53
            int r6 = r6 / r0
            if (r2 != 0) goto L99
            goto L95
        L91:
            im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV1View r2 = r12.newSession
            if (r2 != 0) goto L99
        L95:
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
            r2 = r5
        L99:
            boolean r2 = r2.isChecked()
            if (r2 == 0) goto La9
        L9f:
            int r0 = viva.republica.toss.password.Password6DFragment.ICustomTabsServiceStub
            int r0 = r0 + 47
            int r2 = r0 % 128
            viva.republica.toss.password.Password6DFragment.ICustomTabsServiceDefault = r2
            int r0 = r0 % r1
            r0 = r4
        La9:
            r12.ICustomTabsCallback_Parcel = r0
        Lab:
            o.GraniteBrownfieldModule_closeView r0 = new o.GraniteBrownfieldModule_closeView
            char[] r2 = r12.ICustomTabsCallbackStubProxy
            r0.<init>(r2)
            r12.onExtraCallback(r0)
            viva.republica.toss.password.PasswordFragment$onWarmupCompleted r6 = r12.extraCallback()
            if (r6 == 0) goto Ld7
            int r0 = viva.republica.toss.password.Password6DFragment.ICustomTabsServiceStub
            int r0 = r0 + 119
            int r2 = r0 % 128
            viva.republica.toss.password.Password6DFragment.ICustomTabsServiceDefault = r2
            int r0 = r0 % r1
            o.GraniteBrownfieldModule_closeView r7 = r12.requestPostMessageChannelWithExtras()
            boolean r8 = r12.ICustomTabsCallback_Parcel
            java.lang.String r9 = r12.newSession()
            java.lang.String r10 = r12.IAuthTabCallback_Parcel()
            boolean r11 = r12.mayLaunchUrl
            r6.onWarmupCompleted(r7, r8, r9, r10, r11)
        Ld7:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.Password6DFragment.asInterface(java.lang.Object[]):java.lang.Object");
    }

    public void onSaveInstanceState(@NotNull Bundle bundle) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 125;
        ICustomTabsServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(bundle, "");
        Object[] objArr = new Object[1];
        c(new char[]{48094, 48046, 48896, 30376, 21759, 41431, 39149, 23100, 5561, 9890, 62356, 10882, 59347, 63643, 17764, 17746, 45359, 18764}, 1 - (KeyEvent.getMaxKeyCode() >> 16), objArr);
        bundle.putString(((String) objArr[0]).intern(), this.newSessionWithExtras);
        super/*im.toss.uikit.base.UIKitBaseFragment*/.onSaveInstanceState(bundle);
        int i4 = ICustomTabsServiceDefault + 111;
        ICustomTabsServiceStub = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void onExtraCallbackWithResult(TextView textView, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 63;
        ICustomTabsServiceStub = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Intrinsics.checkNotNull(animatedValue, "");
            float fFloatValue = ((Float) animatedValue).floatValue();
            textView.setScaleX(fFloatValue);
            textView.setScaleY(fFloatValue);
            throw null;
        }
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Object animatedValue2 = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue2, "");
        float fFloatValue2 = ((Float) animatedValue2).floatValue();
        textView.setScaleX(fFloatValue2);
        textView.setScaleY(fFloatValue2);
        int i3 = ICustomTabsServiceDefault + 1;
        ICustomTabsServiceStub = i3 % 128;
        int i4 = i3 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        String strIntern;
        Password6DFragment password6DFragment = (Password6DFragment) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 111;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        password6DFragment.onExtraCallback(password6DFragment.onExtraCallbackWithResult(password6DFragment.onActivityLayout()), (CharSequence) PasswordFragment.onNavigationEvent(50819534, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), -50819529, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{password6DFragment, password6DFragment.onActivityLayout()}));
        int iIntValue = ((Integer) onExtraCallbackWithResult(TTVideoLandingPageActivity.onExtraCallbackWithResult(), 1457981334, TTVideoLandingPageActivity.onExtraCallbackWithResult(), -1457981329, new Object[]{password6DFragment, password6DFragment.ICustomTabsCallbackStubProxy}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult())).intValue();
        TextView textView = password6DFragment.onUnminimized.get(iIntValue - 1);
        Intrinsics.checkNotNullExpressionValue(textView, "");
        final TextView textView2 = textView;
        textView2.setTextColor(((Integer) getUrlokhttp.onNavigationEvent(new Object[]{setBodyokhttp.onExtraCallback(password6DFragment)}, -1763178192, 1763178195, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult())).intValue());
        Button button = password6DFragment.onTransact;
        if (button == null) {
            int i4 = ICustomTabsServiceStub + 85;
            ICustomTabsServiceDefault = i4 % 128;
            if (i4 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i5 = 99 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            button = null;
        }
        if (button.isSelected()) {
            strIntern = str;
        } else {
            Object[] objArr2 = new Object[1];
            b(new char[]{27985}, 40739 - TextUtils.indexOf("", "", 0), objArr2);
            strIntern = ((String) objArr2[0]).intern();
        }
        textView2.setText(strIntern);
        textView2.setContentDescription(password6DFragment.getString(R.string.app_password___64098e62fc, new Object[]{Integer.valueOf(iIntValue)}));
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 1.2f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: viva.republica.toss.password.Password6DFragment$$ExternalSyntheticLambda13
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Password6DFragment.onExtraCallback(textView2, valueAnimator);
            }
        });
        valueAnimatorOfFloat.setDuration(100L);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.start();
        password6DFragment.onExtraCallbackWithResult().announceForAccessibility(password6DFragment.getString(R.string.app_password___49003299c7, new Object[]{str, Integer.valueOf(((Integer) onExtraCallbackWithResult(TTVideoLandingPageActivity.onExtraCallbackWithResult(), 1457981334, TTVideoLandingPageActivity.onExtraCallbackWithResult(), -1457981329, new Object[]{password6DFragment, password6DFragment.ICustomTabsCallbackStubProxy}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult())).intValue())}));
        return null;
    }

    @Override // viva.republica.toss.password.PasswordFragment
    public void asInterface() throws Throwable {
        int i = 2 % 2;
        onWarmupCompleted(true);
        int i2 = 0;
        for (Object obj : this.onUnminimized) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
                int i4 = ICustomTabsServiceStub + 21;
                ICustomTabsServiceDefault = i4 % 128;
                int i5 = i4 % 2;
            }
            TextView textView = (TextView) obj;
            Object[] objArr = new Object[1];
            b(new char[]{27985}, (ViewConfiguration.getPressedStateDuration() >> 16) + 40739, objArr);
            textView.setText(((String) objArr[0]).intern());
            textView.setContentDescription(AFj1rSDK.onExtraCallback.onExtraCallback(R.string.app_password___e445d6d193, new Object[]{Integer.valueOf(i3)}));
            textView.setTextColor(setBodyokhttp.onExtraCallback(this).requestPostMessageChannel().onSessionEnded());
            i2 = i3;
        }
        onNavigationEvent(this.ICustomTabsCallbackStubProxy);
        Object obj2 = null;
        if (!this.receiveFile) {
            int i6 = ICustomTabsServiceStub + 79;
            ICustomTabsServiceDefault = i6 % 128;
            int i7 = i6 % 2;
            Button button = this.onTransact;
            if (button == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                button = null;
            }
            button.setVisibility(4);
            Button button2 = this.onTransact;
            if (button2 == null) {
                int i8 = ICustomTabsServiceDefault + 45;
                ICustomTabsServiceStub = i8 % 128;
                if (i8 % 2 != 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    obj2.hashCode();
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException("");
                button2 = null;
            }
            button2.setSelected(false);
        }
        ImageView imageView = this.onRelationshipValidationResult;
        if (imageView == null) {
            int i9 = ICustomTabsServiceStub + 49;
            ICustomTabsServiceDefault = i9 % 128;
            if (i9 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            imageView = null;
        }
        imageView.setVisibility(4);
        onExtraCallbackWithResult().announceForAccessibility(AFj1rSDK.onExtraCallback.onExtraCallbackWithResult(R.string.app_password___6bb9cb3c1f));
        int i10 = ICustomTabsServiceStub + 83;
        ICustomTabsServiceDefault = i10 % 128;
        if (i10 % 2 != 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(Password6DFragment password6DFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 69;
        ICustomTabsServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        b(new char[]{18684, 22386, 30715, 5710, 14059, 54642, 62964, 37973, 46313, 21322, 29634}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 8069, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), password6DFragment.newSession());
        Object[] objArr2 = new Object[1];
        b(new char[]{18684, 49616, 23231, 54196, 27747, 58664, 32256, 35047, 505, 39586, 4976, 44118, 9513, 48654, 51427, 16814, 55936}, 35112 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), password6DFragment.IAuthTabCallback_Parcel());
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsServiceDefault + 95;
        ICustomTabsServiceStub = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final void IAuthTabCallback(String str) {
        String str2;
        CharSequence text;
        String loginYN;
        String strIEngagementSignalsCallbackDefault;
        String logValue;
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 89;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        getSWidth.IAuthTabCallback(getSWidth.onExtraCallback, 0L, 1, null);
        if (ICustomTabsCallbackDefault()) {
            onWarmupCompleted(false);
            asMaplambda6 asmaplambda6 = asMaplambda6.onExtraCallback;
            Set<isNumber> setOnWarmupCompleted = CatalystInstanceImplPendingJSCall.onWarmupCompleted(this.postMessage);
            createPaints createpaints = createPaints.IAuthTabCallback;
            IndicatorView indicatorViewAccess100 = createpaints.access100();
            String str3 = (indicatorViewAccess100 == null || (logValue = indicatorViewAccess100.getLogValue()) == null) ? "" : logValue;
            String eventName = isNumber.PASSWORD.getEventName();
            long typedObject = readTypedObject();
            PasswordFragment.onExtraCallback onextracallback = this.postMessage;
            if (onextracallback == null || (strIEngagementSignalsCallbackDefault = onextracallback.IEngagementSignalsCallbackDefault()) == null) {
                int i4 = ICustomTabsServiceStub + 41;
                ICustomTabsServiceDefault = i4 % 128;
                int i5 = i4 % 2;
                str2 = "";
            } else {
                str2 = strIEngagementSignalsCallbackDefault;
            }
            TextView textViewIAuthTabCallbackStub = IAuthTabCallbackStub();
            if (textViewIAuthTabCallbackStub != null) {
                text = textViewIAuthTabCallbackStub.getText();
                int i6 = ICustomTabsServiceDefault + 37;
                ICustomTabsServiceStub = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 3 / 5;
                }
            } else {
                text = null;
            }
            String strValueOf = String.valueOf(text);
            String string = onTransact().getText().toString();
            IndicatorView indicatorViewAccess1002 = createpaints.access100();
            String str4 = (indicatorViewAccess1002 == null || (loginYN = indicatorViewAccess1002.getLoginYN()) == null) ? "" : loginYN;
            PasswordFragment.onExtraCallback onextracallback2 = this.postMessage;
            asmaplambda6.onNavigationEvent((Set<? extends isNumber>) setOnWarmupCompleted, str3, eventName, typedObject, str2, strValueOf, string, str4, onextracallback2 != null ? onextracallback2.updateVisuals() : null, new Function1() { // from class: viva.republica.toss.password.Password6DFragment$$ExternalSyntheticLambda10
                public final Object invoke(Object obj) {
                    return Password6DFragment.onNavigationEvent(this.f$0, (SetDetectableSize) obj);
                }
            });
        }
        isOneShot.onExtraCallbackWithResult(this, noStore.Companion.asBinder());
        if (((Integer) onExtraCallbackWithResult(TTVideoLandingPageActivity.onExtraCallbackWithResult(), 1457981334, TTVideoLandingPageActivity.onExtraCallbackWithResult(), -1457981329, new Object[]{this, this.ICustomTabsCallbackStubProxy}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult())).intValue() < 6) {
            onExtraCallbackWithResult(TTVideoLandingPageActivity.onExtraCallbackWithResult(), -226100989, TTVideoLandingPageActivity.onExtraCallbackWithResult(), 226100991, new Object[]{this, this.ICustomTabsCallbackStubProxy, str}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult());
            onExtraCallbackWithResult(TTVideoLandingPageActivity.onExtraCallbackWithResult(), 2054124780, TTVideoLandingPageActivity.onExtraCallbackWithResult(), -2054124780, new Object[]{this, str}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult());
            if (((Integer) onExtraCallbackWithResult(TTVideoLandingPageActivity.onExtraCallbackWithResult(), 1457981334, TTVideoLandingPageActivity.onExtraCallbackWithResult(), -1457981329, new Object[]{this, this.ICustomTabsCallbackStubProxy}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult())).intValue() == 6) {
                int i8 = ICustomTabsServiceStub + 113;
                ICustomTabsServiceDefault = i8 % 128;
                int i9 = i8 % 2;
                onExtraCallbackWithResult(TTVideoLandingPageActivity.onExtraCallbackWithResult(), 565217720, TTVideoLandingPageActivity.onExtraCallbackWithResult(), -565217713, new Object[]{this}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult());
            }
        }
        int i10 = ICustomTabsServiceStub + 79;
        ICustomTabsServiceDefault = i10 % 128;
        int i11 = i10 % 2;
    }

    private final void requestPostMessageChannel() throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 99;
        ICustomTabsServiceDefault = i2 % 128;
        if (i2 % 2 == 0) {
            if (((Integer) onExtraCallbackWithResult(TTVideoLandingPageActivity.onExtraCallbackWithResult(), 1457981334, TTVideoLandingPageActivity.onExtraCallbackWithResult(), -1457981329, new Object[]{this, this.ICustomTabsCallbackStubProxy}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult())).intValue() == 63) {
                return;
            }
        } else {
            if (((Integer) onExtraCallbackWithResult(TTVideoLandingPageActivity.onExtraCallbackWithResult(), 1457981334, TTVideoLandingPageActivity.onExtraCallbackWithResult(), -1457981329, new Object[]{this, this.ICustomTabsCallbackStubProxy}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult())).intValue() == 6) {
                return;
            }
        }
        isOneShot.onExtraCallbackWithResult(this, (noStore) noStore.onExtraCallback.onWarmupCompleted(new Object[]{noStore.Companion}, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), 47463863, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), -47463863, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted()));
        if (((Integer) onExtraCallbackWithResult(TTVideoLandingPageActivity.onExtraCallbackWithResult(), 1457981334, TTVideoLandingPageActivity.onExtraCallbackWithResult(), -1457981329, new Object[]{this, this.ICustomTabsCallbackStubProxy}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult())).intValue() != 0) {
            int iIntValue = ((Integer) onExtraCallbackWithResult(TTVideoLandingPageActivity.onExtraCallbackWithResult(), 1457981334, TTVideoLandingPageActivity.onExtraCallbackWithResult(), -1457981329, new Object[]{this, this.ICustomTabsCallbackStubProxy}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult())).intValue();
            int i3 = iIntValue - 1;
            TextView textView = this.onUnminimized.get(i3);
            Intrinsics.checkNotNullExpressionValue(textView, "");
            TextView textView2 = textView;
            textView2.setTextColor(setBodyokhttp.onExtraCallback(this).requestPostMessageChannel().onSessionEnded());
            Object[] objArr = new Object[1];
            b(new char[]{27985}, View.MeasureSpec.makeMeasureSpec(0, 0) + 40739, objArr);
            textView2.setText(((String) objArr[0]).intern());
            textView2.setContentDescription(getString(R.string.app_password___e445d6d193, new Object[]{Integer.valueOf(iIntValue)}));
            onExtraCallbackWithResult(this.ICustomTabsCallbackStubProxy, i3);
            int i4 = ICustomTabsServiceDefault + 53;
            ICustomTabsServiceStub = i4 % 128;
            int i5 = i4 % 2;
        }
        onExtraCallbackWithResult().announceForAccessibility(getString(R.string.app_password___1b56688847, new Object[]{Integer.valueOf(((Integer) onExtraCallbackWithResult(TTVideoLandingPageActivity.onExtraCallbackWithResult(), 1457981334, TTVideoLandingPageActivity.onExtraCallbackWithResult(), -1457981329, new Object[]{this, this.ICustomTabsCallbackStubProxy}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult())).intValue())}));
    }

    private final void onExtraCallback(TextView textView) throws Throwable {
        int i = 2 % 2;
        if (isEngagementSignalsApiAvailable()) {
            int i2 = ICustomTabsServiceStub + 105;
            ICustomTabsServiceDefault = i2 % 128;
            int i3 = i2 % 2;
            ConvertByteArrayToFloatArray.onExtraCallback(1365174L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
        } else {
            ConvertByteArrayToFloatArray.onExtraCallback(1365134L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
        }
        int i4 = 0;
        if (textView.isSelected()) {
            textView.setSelected(false);
            int length = this.ICustomTabsCallbackStubProxy.length;
            for (int i5 = 0; i5 < length; i5++) {
                TextView textView2 = this.onUnminimized.get(i5);
                Object[] objArr = new Object[1];
                b(new char[]{27985}, (ViewConfiguration.getJumpTapTimeout() >> 16) + 40739, objArr);
                textView2.setText(((String) objArr[0]).intern());
            }
            return;
        }
        textView.setSelected(true);
        int length2 = this.ICustomTabsCallbackStubProxy.length;
        int i6 = ICustomTabsServiceStub + 39;
        ICustomTabsServiceDefault = i6 % 128;
        while (true) {
            int i7 = i6 % 2;
            if (i4 >= length2) {
                return;
            }
            this.onUnminimized.get(i4).setText(String.valueOf(this.ICustomTabsCallbackStubProxy[i4]));
            i4++;
            i6 = ICustomTabsServiceDefault + 53;
            ICustomTabsServiceStub = i6 % 128;
        }
    }

    @Override // viva.republica.toss.password.PasswordFragment
    public void onDestroyView() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 27;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        super.onDestroyView();
        _get_isNull_lambda0 _get_isnull_lambda0 = _get_isNull_lambda0.onExtraCallbackWithResult;
        _get_isnull_lambda0.onExtraCallbackWithResult(newSession());
        _get_isnull_lambda0.IAuthTabCallback(IAuthTabCallback_Parcel());
        onNavigationEvent(this.ICustomTabsCallbackStubProxy);
        requestPostMessageChannelWithExtras().destroy();
        int i4 = ICustomTabsServiceDefault + 51;
        ICustomTabsServiceStub = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 77;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        if (isEngagementSignalsApiAvailable()) {
            int i4 = ICustomTabsServiceDefault + 19;
            ICustomTabsServiceStub = i4 % 128;
            if (i4 % 2 == 0) {
                return 1223321L;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        PasswordFragment.onExtraCallback onextracallback = this.postMessage;
        if (onextracallback == null) {
            return -1L;
        }
        int i5 = ICustomTabsServiceStub + 35;
        ICustomTabsServiceDefault = i5 % 128;
        int i6 = i5 % 2;
        Long lIAuthTabCallback = onextracallback.IAuthTabCallback();
        if (lIAuthTabCallback == null) {
            return -1L;
        }
        int i7 = ICustomTabsServiceStub + 109;
        ICustomTabsServiceDefault = i7 % 128;
        int i8 = i7 % 2;
        long jLongValue = lIAuthTabCallback.longValue();
        if (i8 == 0) {
            int i9 = 52 / 0;
        }
        return jLongValue;
    }

    public Map<String, Object> getScreenParams() throws Throwable {
        String loginYN;
        Map mapIAuthTabCallback;
        Map<String, Object> mapICustomTabsServiceStub;
        String loginYN2;
        String logValue;
        int i = 2 % 2;
        Map mapOnNavigationEvent = null;
        if (!isEngagementSignalsApiAvailable()) {
            createPaints createpaints = createPaints.IAuthTabCallback;
            IndicatorView indicatorViewAccess100 = createpaints.access100();
            if (indicatorViewAccess100 != null) {
                int i2 = ICustomTabsServiceStub + 33;
                ICustomTabsServiceDefault = i2 % 128;
                int i3 = i2 % 2;
                loginYN2 = indicatorViewAccess100.getLoginYN();
            } else {
                int i4 = ICustomTabsServiceStub + 23;
                ICustomTabsServiceDefault = i4 % 128;
                int i5 = i4 % 2;
                loginYN2 = null;
            }
            Object[] objArr = new Object[1];
            b(new char[]{18674, 30476, 14083, 63232, 46852, 30512, 14089, 63259}, 16381 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr);
            Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), loginYN2);
            IndicatorView indicatorViewAccess1002 = createpaints.access100();
            if (indicatorViewAccess1002 != null) {
                int i6 = ICustomTabsServiceDefault + 95;
                ICustomTabsServiceStub = i6 % 128;
                int i7 = i6 % 2;
                logValue = indicatorViewAccess1002.getLogValue();
            } else {
                logValue = null;
            }
            Object[] objArr2 = new Object[1];
            c(new char[]{22439, 22478, 29847, 46776, 40820, 25028, 1151, 50868, 63996, 60705, 13225, 46619, 2998, 13074, 34143}, TextUtils.getCapsMode("", 0, 0) + 1, objArr2);
            Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), logValue);
            Object[] objArr3 = new Object[1];
            b(new char[]{18684, 22386, 30715, 5710, 14059, 54642, 62964, 37973, 46313, 21322, 29634}, 8068 - TextUtils.lastIndexOf("", '0'), objArr3);
            Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), newSession());
            Object[] objArr4 = new Object[1];
            b(new char[]{18684, 49616, 23231, 54196, 27747, 58664, 32256, 35047, 505, 39586, 4976, 44118, 9513, 48654, 51427, 16814, 55936}, 35110 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr4);
            Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback(((String) objArr4[0]).intern(), IAuthTabCallback_Parcel());
            Object[] objArr5 = new Object[1];
            b(new char[]{18680, 1658, 54738, 41795, 29375, 49191, 40871, 27904, 15474}, 20113 - Color.blue(0), objArr5);
            mapIAuthTabCallback = access8100.IAuthTabCallback(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, pairIAuthTabCallback4, getWrite.IAuthTabCallback(((String) objArr5[0]).intern(), Long.valueOf(readTypedObject()))});
        } else {
            createPaints createpaints2 = createPaints.IAuthTabCallback;
            IndicatorView indicatorViewAccess1003 = createpaints2.access100();
            if (indicatorViewAccess1003 != null) {
                loginYN = indicatorViewAccess1003.getLoginYN();
                int i8 = ICustomTabsServiceDefault + 37;
                ICustomTabsServiceStub = i8 % 128;
                int i9 = i8 % 2;
            } else {
                loginYN = null;
            }
            Object[] objArr6 = new Object[1];
            b(new char[]{18674, 30476, 14083, 63232, 46852, 30512, 14089, 63259}, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 16382, objArr6);
            Pair pairIAuthTabCallback5 = getWrite.IAuthTabCallback(((String) objArr6[0]).intern(), loginYN);
            IndicatorView indicatorViewAccess1004 = createpaints2.access100();
            String logValue2 = indicatorViewAccess1004 != null ? indicatorViewAccess1004.getLogValue() : null;
            Object[] objArr7 = new Object[1];
            c(new char[]{22439, 22478, 29847, 46776, 40820, 25028, 1151, 50868, 63996, 60705, 13225, 46619, 2998, 13074, 34143}, -TextUtils.lastIndexOf("", '0'), objArr7);
            Pair pairIAuthTabCallback6 = getWrite.IAuthTabCallback(((String) objArr7[0]).intern(), logValue2);
            Object[] objArr8 = new Object[1];
            b(new char[]{18684, 22386, 30715, 5710, 14059, 54642, 62964, 37973, 46313, 21322, 29634}, 8069 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr8);
            Pair pairIAuthTabCallback7 = getWrite.IAuthTabCallback(((String) objArr8[0]).intern(), newSession());
            Object[] objArr9 = new Object[1];
            b(new char[]{18684, 49616, 23231, 54196, 27747, 58664, 32256, 35047, 505, 39586, 4976, 44118, 9513, 48654, 51427, 16814, 55936}, Color.blue(0) + 35111, objArr9);
            Pair pairIAuthTabCallback8 = getWrite.IAuthTabCallback(((String) objArr9[0]).intern(), IAuthTabCallback_Parcel());
            Object[] objArr10 = new Object[1];
            b(new char[]{18680, 1658, 54738, 41795, 29375, 49191, 40871, 27904, 15474}, MotionEvent.axisFromString("") + 20114, objArr10);
            mapIAuthTabCallback = access8100.IAuthTabCallback(new Pair[]{pairIAuthTabCallback5, pairIAuthTabCallback6, pairIAuthTabCallback7, pairIAuthTabCallback8, getWrite.IAuthTabCallback(((String) objArr10[0]).intern(), Long.valueOf(readTypedObject()))});
        }
        PasswordFragment.onExtraCallback onextracallback = this.postMessage;
        if (onextracallback != null && (mapICustomTabsServiceStub = onextracallback.ICustomTabsServiceStub()) != null) {
            mapOnNavigationEvent = access8100.onWarmupCompleted(mapICustomTabsServiceStub);
        }
        if (mapOnNavigationEvent == null) {
            mapOnNavigationEvent = access8100.onNavigationEvent();
            int i10 = ICustomTabsServiceDefault + 57;
            ICustomTabsServiceStub = i10 % 128;
            int i11 = i10 % 2;
        }
        Map<String, Object> mapOnWarmupCompleted = access8100.onWarmupCompleted(access8100.onWarmupCompleted(mapIAuthTabCallback, mapOnNavigationEvent));
        Object[] objArr11 = new Object[1];
        c(new char[]{51635, 51589, 35379, 15576, 25038, 60331, 54353, 5784, 26584, 5003, 47608}, (ViewConfiguration.getEdgeSlop() >> 16) + 1, objArr11);
        String strIntern = ((String) objArr11[0]).intern();
        Object[] objArr12 = new Object[1];
        c(new char[]{12411, 12322, 24741, 11146, 26370}, 1 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr12);
        mapOnWarmupCompleted.put(strIntern, ((String) objArr12[0]).intern());
        return mapOnWarmupCompleted;
    }

    @Override // viva.republica.toss.password.PasswordFragment
    public String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub;
        int i3 = i2 + 1;
        ICustomTabsServiceDefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 49;
        ICustomTabsServiceDefault = i5 % 128;
        int i6 = i5 % 2;
        return "";
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Password6DFragment password6DFragment = (Password6DFragment) objArr[0];
        char[] cArr = (char[]) objArr[1];
        String str = (String) objArr[2];
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 75;
        ICustomTabsServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        cArr[((Integer) onExtraCallbackWithResult(iOnExtraCallbackWithResult, 1457981334, TTVideoLandingPageActivity.onExtraCallbackWithResult(), -1457981329, new Object[]{password6DFragment, cArr}, iOnExtraCallbackWithResult2, TTVideoLandingPageActivity.onExtraCallbackWithResult())).intValue()] = StringsKt.single(str);
        int i4 = ICustomTabsServiceDefault + 45;
        ICustomTabsServiceStub = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private final void onExtraCallbackWithResult(char[] cArr, int i) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsServiceStub;
        int i4 = i3 + 61;
        ICustomTabsServiceDefault = i4 % 128;
        int i5 = i4 % 2;
        cArr[i] = 9679;
        int i6 = i3 + 39;
        ICustomTabsServiceDefault = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onNavigationEvent(char[] cArr) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceDefault + 65;
        ICustomTabsServiceStub = i2 % 128;
        int i3 = i2 % 2;
        Arrays.fill(cArr, (char) 9679);
        int i4 = ICustomTabsServiceDefault + 31;
        ICustomTabsServiceStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }

    @Override // viva.republica.toss.password.Hilt_PasswordFragment
    public void onAttach(@NotNull Context context) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        super.onAttach(context);
        boolean z = context instanceof PasswordFragment.onExtraCallback;
        Object parentFragment = context;
        if (!z) {
            int i2 = ICustomTabsServiceStub + 89;
            ICustomTabsServiceDefault = i2 % 128;
            if (i2 % 2 == 0) {
                getParentFragment();
                throw null;
            }
            Fragment parentFragment2 = getParentFragment();
            if (parentFragment2 != null) {
                boolean z2 = parentFragment2 instanceof PasswordFragment.onExtraCallback;
                int i3 = ICustomTabsServiceStub + 63;
                ICustomTabsServiceDefault = i3 % 128;
                int i4 = i3 % 2;
                if (!z2) {
                    Object[] objArr = new Object[1];
                    c(new char[]{60005, 59944, 8939, 7613, 51475, 51924, 26203, 42120, 17521, 47939, 39070, 54307, 46689, 25979, 11858, 48098, 57495, 54454, 64555, 27048, 21204, 34522, 37435, 57245, 36096, 28697, 9160, 36099, 65339, 8796, 61824, 29498, 10537, 35938, 34650, 8937, 39840, 32680, 21875, 37103, 62960, 10729, 60199, 18074, 9243, 39703, 47339, 13406, 38521, 17741, 20121, 39499, 49235, 14180, 7254, 18936, 12972, 59071, 45677, 16311}, 1 - Color.red(0), objArr);
                    throw new IllegalStateException(((String) objArr[0]).intern());
                }
            }
            int i5 = ICustomTabsServiceDefault + 105;
            ICustomTabsServiceStub = i5 % 128;
            int i6 = i5 % 2;
            parentFragment = getParentFragment();
        }
        this.postMessage = (PasswordFragment.onExtraCallback) parentFragment;
    }

    private final void IAuthTabCallback(View view) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 57;
        ICustomTabsServiceDefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            View viewFindViewById = view.findViewById(R.id.space_status_bar);
            View viewFindViewById2 = view.findViewById(R.id.space_top);
            View viewFindViewById3 = view.findViewById(R.id.container_content);
            if (!(requireActivity() instanceof PasswordActivity)) {
                Intrinsics.checkNotNull(viewFindViewById);
                viewFindViewById.setVisibility(8);
                Intrinsics.checkNotNull(viewFindViewById2);
                viewFindViewById2.setVisibility(8);
                Intrinsics.checkNotNull(viewFindViewById3);
                viewFindViewById3.setPadding(viewFindViewById3.getPaddingLeft(), viewFindViewById3.getPaddingTop(), viewFindViewById3.getPaddingRight(), 0);
                return;
            }
            int i3 = ICustomTabsServiceDefault + 65;
            ICustomTabsServiceStub = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNull(viewFindViewById);
            viewFindViewById.setVisibility(0);
            Intrinsics.checkNotNull(viewFindViewById2);
            viewFindViewById2.setVisibility(0);
            Intrinsics.checkNotNull(viewFindViewById3);
            disableImageViewPreallocationAndroid.IAuthTabCallback(viewFindViewById3, 0, false, 2, (Object) null);
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            enableImagePrefetchingOnUiThreadAndroid.onExtraCallback(viewFindViewById3, varyMatches.onNavigationEvent(Float.valueOf(24.0f), displayMetrics), 0L, 0L, (Interpolator) null, (Function1) null, (Function1) null, 62, (Object) null);
            return;
        }
        view.findViewById(R.id.space_status_bar);
        view.findViewById(R.id.space_top);
        view.findViewById(R.id.container_content);
        boolean z = requireActivity() instanceof PasswordActivity;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        int length;
        int i;
        int i2 = 0;
        char[] cArr = (char[]) objArr[1];
        int i3 = 2 % 2;
        int i4 = ICustomTabsServiceStub + 65;
        ICustomTabsServiceDefault = i4 % 128;
        if (i4 % 2 == 0) {
            i = 1;
            length = cArr.length;
            i2 = 1;
        } else {
            length = cArr.length;
            i = 0;
        }
        while (i2 < length) {
            if (cArr[i2] == 9679) {
                return Integer.valueOf(i);
            }
            i2++;
            i++;
        }
        int i5 = ICustomTabsServiceStub + 79;
        ICustomTabsServiceDefault = i5 % 128;
        int i6 = i5 % 2;
        return 6;
    }

    public static /* synthetic */ importAppCert onExtraCallbackWithResult(Password6DFragment password6DFragment) {
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        return (importAppCert) onExtraCallbackWithResult(iOnExtraCallbackWithResult, 2104119678, TTVideoLandingPageActivity.onExtraCallbackWithResult(), -2104119675, new Object[]{password6DFragment}, iOnExtraCallbackWithResult2, TTVideoLandingPageActivity.onExtraCallbackWithResult());
    }

    public static /* synthetic */ void onExtraCallback(Password6DFragment password6DFragment, View view) {
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        onExtraCallbackWithResult(iOnExtraCallbackWithResult, 961695099, TTVideoLandingPageActivity.onExtraCallbackWithResult(), -961695098, new Object[]{password6DFragment, view}, iOnExtraCallbackWithResult2, TTVideoLandingPageActivity.onExtraCallbackWithResult());
    }

    private final void onNavigationEvent(char[] cArr, String str) {
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        onExtraCallbackWithResult(iOnExtraCallbackWithResult, -226100989, TTVideoLandingPageActivity.onExtraCallbackWithResult(), 226100991, new Object[]{this, cArr, str}, iOnExtraCallbackWithResult2, TTVideoLandingPageActivity.onExtraCallbackWithResult());
    }

    private final int onWarmupCompleted(char[] cArr) {
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        return ((Integer) onExtraCallbackWithResult(iOnExtraCallbackWithResult, 1457981334, TTVideoLandingPageActivity.onExtraCallbackWithResult(), -1457981329, new Object[]{this, cArr}, iOnExtraCallbackWithResult2, TTVideoLandingPageActivity.onExtraCallbackWithResult())).intValue();
    }

    private final void prefetchWithMultipleUrls() {
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        onExtraCallbackWithResult(iOnExtraCallbackWithResult, 565217720, TTVideoLandingPageActivity.onExtraCallbackWithResult(), -565217713, new Object[]{this}, iOnExtraCallbackWithResult2, TTVideoLandingPageActivity.onExtraCallbackWithResult());
    }

    private static final Unit onWarmupCompleted(Throwable th) {
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(iOnExtraCallbackWithResult, 735835263, TTVideoLandingPageActivity.onExtraCallbackWithResult(), -735835257, new Object[]{th}, iOnExtraCallbackWithResult2, TTVideoLandingPageActivity.onExtraCallbackWithResult());
    }

    private static final void onExtraCallback(Function1 function1, Object obj) {
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        onExtraCallbackWithResult(iOnExtraCallbackWithResult, 666744783, TTVideoLandingPageActivity.onExtraCallbackWithResult(), -666744779, new Object[]{function1, obj}, iOnExtraCallbackWithResult2, TTVideoLandingPageActivity.onExtraCallbackWithResult());
    }

    private static final String onNavigationEvent(Password6DFragment password6DFragment, String str) {
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        return (String) onExtraCallbackWithResult(iOnExtraCallbackWithResult, 1654022982, TTVideoLandingPageActivity.onExtraCallbackWithResult(), -1654022974, new Object[]{password6DFragment, str}, iOnExtraCallbackWithResult2, TTVideoLandingPageActivity.onExtraCallbackWithResult());
    }

    private final void onWarmupCompleted(String str) {
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        onExtraCallbackWithResult(iOnExtraCallbackWithResult, 2054124780, TTVideoLandingPageActivity.onExtraCallbackWithResult(), -2054124780, new Object[]{this, str}, iOnExtraCallbackWithResult2, TTVideoLandingPageActivity.onExtraCallbackWithResult());
    }

    static void access000() {
        prefetchWithMultipleUrls = 4483849348072656297L;
        requestPostMessageChannel = -7030483235194236799L;
    }
}
