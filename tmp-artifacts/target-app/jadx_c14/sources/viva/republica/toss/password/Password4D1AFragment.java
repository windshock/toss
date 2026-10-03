package viva.republica.toss.password;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
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
import im.toss.core.biometric.RxBiometric;
import im.toss.features.home.ui.view.currency.CurrencyCalculatorActivity;
import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingFunnelAdapter$;
import im.toss.rn.granite.core.module.appsintoss.bridge.ad.ShowTossAdOrAdmobBridge$;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV1View;
import im.toss.uikit.widget.dialog.TdsDialogV1;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.properties.ObservableProperty;
import kotlin.text.StringsKt;
import o.AFj1rSDK;
import o.ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CatalystInstanceImplPendingJSCall;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.CommonModule_setScreenAwakeMode;
import o.ConvertByteArrayToFloatArray;
import o.EmbeddingAdapterExternalSyntheticLambda1;
import o.EncryptedContentInfoParser;
import o.GraniteBrownfieldModule_closeView;
import o.IndicatorView;
import o.ReactNativeFeatureFlagsExternalSyntheticLambda0;
import o.SetDetectableSize;
import o.UTF8Decoder;
import o._get_isNull_lambda0;
import o.access8100;
import o.accessMapSafely;
import o.addAllCommandLine;
import o.asDouble;
import o.createPaints;
import o.dangerouslyForceOverride;
import o.disableImageViewPreallocationAndroid;
import o.enableFabricRenderer;
import o.enableImagePrefetchingOnUiThreadAndroid;
import o.getIconPaddingLeft;
import o.getUrlokhttp;
import o.getWrite;
import o.importAppCert;
import o.isJSONTypeIgnore;
import o.isNumber;
import o.isOneShot;
import o.noStore;
import o.setBodyokhttp;
import o.setTestMode;
import o.setVisitUrl;
import o.startRearDisplaySession;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.password.PasswordFragment;

@ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda0(onExtraCallback = startRearDisplaySession.HIGH)
@EmbeddingAdapterExternalSyntheticLambda1
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class Password4D1AFragment extends PasswordFragment implements View.OnClickListener {
    private static int IEngagementSignalsCallbackStub;
    private static char[] access200;
    public static final int onExtraCallback;
    static final /* synthetic */ addAllCommandLine<Object>[] onExtraCallbackWithResult;
    private static long writeTypedList;
    public ScrollView IAuthTabCallback;
    private Button IAuthTabCallbackDefault;
    private ImageView ICustomTabsCallbackStub;
    private TextView ICustomTabsServiceDefault;
    private boolean ICustomTabsServiceStub;
    private View newAuthTabSession;
    private LinearLayout newSession;
    private LinearLayout newSessionWithExtras;
    public ViewGroup onNavigationEvent;
    private ImageView onRelationshipValidationResult;
    public View onTransact;
    public TextView onWarmupCompleted;
    private boolean postMessage;
    private boolean prefetch;
    private PasswordFragment.onExtraCallback prefetchWithMultipleUrls;
    private Button requestPostMessageChannelWithExtras;
    private String setEngagementSignalsCallback;
    private TdsCheckBoxV1View updateVisuals;
    private TextView validateRelationship;
    private TextView warmup;
    private static final byte[] $$d = {62, 54, 60, 44};
    private static final int $$e = 235;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ICustomTabsService_Parcel = 0;
    private static int ICustomTabsServiceStubProxy = 0;
    private static int IEngagementSignalsCallback = 1;
    private final int[] mayLaunchUrl = {R.id.password_btnKey0, R.id.password_btnKey1, R.id.password_btnKey2, R.id.password_btnKey3, R.id.password_btnKey4, R.id.password_btnKey5, R.id.password_btnKey6, R.id.password_btnKey7, R.id.password_btnKey8, R.id.password_btnKey9, R.id.password_btnKey10, R.id.password_btnKey11, R.id.password_btnKey12, R.id.password_btnKey13, R.id.password_btnKey14, R.id.password_btnKey15, R.id.password_btnKey16, R.id.password_btnKey17, R.id.password_btnKey18, R.id.password_btnKey19, R.id.password_btnKey20, R.id.password_btnKey21, R.id.password_btnKey22, R.id.password_btnKey23, R.id.password_btnKey24, R.id.password_btnKey25};
    private final ArrayList<TextView> receiveFile = new ArrayList<>();
    private final ArrayList<TextView> extraCommand = new ArrayList<>();
    private final ArrayList<String> requestPostMessageChannel = new ArrayList<>();
    private final ArrayList<String> isEngagementSignalsApiAvailable = new ArrayList<>();
    private final ArrayList<TextView> onUnminimized = new ArrayList<>();
    private final char[] ICustomTabsCallbackStubProxy = new char[5];
    private boolean ICustomTabsService = true;
    private final ObservableProperty ICustomTabsCallbackDefault = ReactNativeFeatureFlagsExternalSyntheticLambda0.IAuthTabCallback(new GraniteBrownfieldModule_closeView((char[]) null, 1, (DefaultConstructorMarker) null));
    private final Lazy ICustomTabsCallback_Parcel = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.password.Password4D1AFragment$$ExternalSyntheticLambda1
        public final Object invoke() {
            return Password4D1AFragment.onNavigationEvent(this.f$0);
        }
    });

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$f(byte r7, byte r8, byte r9) {
        /*
            int r8 = r8 * 3
            int r8 = r8 + 4
            int r7 = r7 * 2
            int r7 = 97 - r7
            int r9 = r9 * 4
            int r9 = 1 - r9
            byte[] r0 = viva.republica.toss.password.Password4D1AFragment.$$d
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L17
            r7 = r8
            r3 = r9
            r4 = r2
            goto L2d
        L17:
            r3 = r2
        L18:
            r6 = r8
            r8 = r7
            r7 = r6
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r9) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L28:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r6
        L2d:
            int r8 = r8 + 1
            int r7 = r7 + r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.Password4D1AFragment.$$f(byte, byte, byte):java.lang.String");
    }

    static {
        IEngagementSignalsCallbackStub = 1;
        IAuthTabCallback_Parcel();
        Object[] objArr = new Object[1];
        b(13 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 13091), ExpandableListView.getPackedPositionGroup(0L), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        b(52 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) Drawable.resolveOpacity(0, 0), 13 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr2);
        onExtraCallbackWithResult = new addAllCommandLine[]{new MutablePropertyReference1Impl<>(Password4D1AFragment.class, strIntern, ((String) objArr2[0]).intern(), 0)};
        onExtraCallback = 8;
        int i = ICustomTabsService_Parcel + 115;
        IEngagementSignalsCallbackStub = i % 128;
        if (i % 2 == 0) {
            int i2 = 20 / 0;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(Password4D1AFragment password4D1AFragment, int i, View view) {
        int i2 = 2 % 2;
        int i3 = IEngagementSignalsCallback + 15;
        ICustomTabsServiceStubProxy = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        Object[] objArr = {password4D1AFragment, Integer.valueOf(i), view};
        int iOnExtraCallback = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        int iOnExtraCallback2 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        int iOnExtraCallback3 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        int iOnExtraCallback4 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        if (i4 != 0) {
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) onWarmupCompleted(-1717088188, 1717088189, iOnExtraCallback2, iOnExtraCallback4, objArr, iOnExtraCallback, iOnExtraCallback3);
        int i5 = IEngagementSignalsCallback + 77;
        ICustomTabsServiceStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Password4D1AFragment password4D1AFragment, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 67;
        ICustomTabsServiceStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(password4D1AFragment, commonModule_setLeftEdgeTouchEnabled);
        int i4 = IEngagementSignalsCallback + 57;
        ICustomTabsServiceStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ void IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 123;
        ICustomTabsServiceStubProxy = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(function1, obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = ICustomTabsServiceStubProxy + 65;
        IEngagementSignalsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        Password4D1AFragment password4D1AFragment = (Password4D1AFragment) objArr[0];
        ValueAnimator valueAnimator = (ValueAnimator) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStubProxy + 69;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(password4D1AFragment, valueAnimator);
        int i4 = IEngagementSignalsCallback + 121;
        ICustomTabsServiceStubProxy = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        Password4D1AFragment password4D1AFragment = (Password4D1AFragment) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 49;
        ICustomTabsServiceStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallback = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
            int iOnExtraCallback2 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
            int iOnExtraCallback3 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iOnExtraCallback4 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        int iOnExtraCallback5 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        int iOnExtraCallback6 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        Unit unit = (Unit) onWarmupCompleted(-228878750, 228878754, iOnExtraCallback5, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), new Object[]{password4D1AFragment, setDetectableSize}, iOnExtraCallback4, iOnExtraCallback6);
        int i3 = ICustomTabsServiceStubProxy + 35;
        IEngagementSignalsCallback = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        Password4D1AFragment password4D1AFragment = (Password4D1AFragment) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStubProxy + 61;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(password4D1AFragment, view);
        int i4 = IEngagementSignalsCallback + 55;
        ICustomTabsServiceStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Password4D1AFragment password4D1AFragment = (Password4D1AFragment) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStubProxy + 87;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackDefault(password4D1AFragment, view);
        int i4 = ICustomTabsServiceStubProxy + 49;
        IEngagementSignalsCallback = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStubProxy + 95;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        onNavigationEvent(function1, obj);
        if (i3 == 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = IEngagementSignalsCallback + 7;
        ICustomTabsServiceStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Password4D1AFragment password4D1AFragment, DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsServiceStubProxy + 83;
        IEngagementSignalsCallback = i3 % 128;
        int i4 = i3 % 2;
        onNavigationEvent(password4D1AFragment, dialogInterface, i);
        int i5 = ICustomTabsServiceStubProxy + 39;
        IEngagementSignalsCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ String onNavigationEvent(Password4D1AFragment password4D1AFragment, String str) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 7;
        ICustomTabsServiceStubProxy = i2 % 128;
        int i3 = i2 % 2;
        String strOnExtraCallbackWithResult = onExtraCallbackWithResult(password4D1AFragment, str);
        int i4 = IEngagementSignalsCallback + 81;
        ICustomTabsServiceStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return strOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onNavigationEvent(Password4D1AFragment password4D1AFragment, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 57;
        ICustomTabsServiceStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(password4D1AFragment, view);
        if (i3 != 0) {
            int i4 = 62 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onNavigationEvent(Password4D1AFragment password4D1AFragment, isJSONTypeIgnore isjsontypeignore) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStubProxy + 95;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(password4D1AFragment, isjsontypeignore);
        int i4 = IEngagementSignalsCallback + 35;
        ICustomTabsServiceStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ importAppCert onNavigationEvent(Password4D1AFragment password4D1AFragment) throws Throwable {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 41;
        ICustomTabsServiceStubProxy = i2 % 128;
        int i3 = i2 % 2;
        importAppCert importappcertIAuthTabCallback = IAuthTabCallback(password4D1AFragment);
        if (i3 != 0) {
            int i4 = 43 / 0;
        }
        return importappcertIAuthTabCallback;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        Throwable th = (Throwable) objArr[0];
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 37;
        ICustomTabsServiceStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(th);
        int i4 = IEngagementSignalsCallback + 97;
        ICustomTabsServiceStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~i2;
        int i9 = (~i5) | i8;
        int i10 = ~(i5 | i8);
        int i11 = i2 + i + i3 + ((-714989572) * i6) + (1142003473 * i4);
        int i12 = i11 * i11;
        int i13 = (((-190873766) * i2) - 1983905792) + (1136689320 * i) + (i7 * (-1483702105)) + (1483702105 * i9) + ((-1483702105) * i10) + ((-1674575872) * i3) + ((-1891631104) * i6) + ((-1355808768) * i4) + ((-1882259456) * i12);
        int i14 = (i2 * (-1158907614)) + 1427560840 + (i * (-1158905656)) + (i7 * 979) + (i9 * (-979)) + (i10 * 979) + (i3 * (-1158906635)) + (i6 * 1387703340) + (i4 * 1202573125) + (i12 * (-451215360));
        switch (i13 + (i14 * i14 * (-310837248))) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return onExtraCallbackWithResult(objArr);
            case 2:
                return onWarmupCompleted(objArr);
            case 3:
                return onExtraCallback(objArr);
            case 4:
                return IAuthTabCallback(objArr);
            case 5:
                return IAuthTabCallbackDefault(objArr);
            case 6:
                return asBinder(objArr);
            case 7:
                return asInterface(objArr);
            case 8:
                return onTransact(objArr);
            case 9:
                return IAuthTabCallbackStub(objArr);
            default:
                return onNavigationEvent(objArr);
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(Password4D1AFragment password4D1AFragment, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 17;
        ICustomTabsServiceStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallback = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
            int iOnExtraCallback2 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
            int iOnExtraCallback3 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
            return (Unit) onWarmupCompleted(487741544, -487741539, iOnExtraCallback2, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), new Object[]{password4D1AFragment, setDetectableSize}, iOnExtraCallback, iOnExtraCallback3);
        }
        int iOnExtraCallback4 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        int iOnExtraCallback5 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        int iOnExtraCallback6 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(TextView textView, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 113;
        ICustomTabsServiceStubProxy = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(textView, valueAnimator);
        int i4 = ICustomTabsServiceStubProxy + 93;
        IEngagementSignalsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // viva.republica.toss.password.PasswordFragment
    public ScrollView IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStubProxy + 103;
        int i3 = i2 % 128;
        IEngagementSignalsCallback = i3;
        int i4 = i2 % 2;
        ScrollView scrollView = this.IAuthTabCallback;
        if (scrollView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i3 + 75;
        ICustomTabsServiceStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            return scrollView;
        }
        throw null;
    }

    public void onExtraCallback(@NotNull ScrollView scrollView) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 7;
        ICustomTabsServiceStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(scrollView, "");
        this.IAuthTabCallback = scrollView;
        int i4 = ICustomTabsServiceStubProxy + 125;
        IEngagementSignalsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // viva.republica.toss.password.PasswordFragment
    public TextView IAuthTabCallbackStub() {
        TextView textView;
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStubProxy + 93;
        int i3 = i2 % 128;
        IEngagementSignalsCallback = i3;
        if (i2 % 2 == 0) {
            textView = this.ICustomTabsServiceDefault;
            int i4 = 62 / 0;
        } else {
            textView = this.ICustomTabsServiceDefault;
        }
        int i5 = i3 + 85;
        ICustomTabsServiceStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return textView;
    }

    @Override // viva.republica.toss.password.PasswordFragment
    public void onWarmupCompleted(@Nullable TextView textView) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 93;
        int i3 = i2 % 128;
        ICustomTabsServiceStubProxy = i3;
        int i4 = i2 % 2;
        this.ICustomTabsServiceDefault = textView;
        int i5 = i3 + 7;
        IEngagementSignalsCallback = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public void onNavigationEvent(@NotNull TextView textView) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 33;
        ICustomTabsServiceStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(textView, "");
            this.onWarmupCompleted = textView;
        } else {
            Intrinsics.checkNotNullParameter(textView, "");
            this.onWarmupCompleted = textView;
            int i3 = 96 / 0;
        }
    }

    @Override // viva.republica.toss.password.PasswordFragment
    public TextView onTransact() {
        int i = 2 % 2;
        TextView textView = this.onWarmupCompleted;
        if (textView != null) {
            int i2 = IEngagementSignalsCallback + 85;
            ICustomTabsServiceStubProxy = i2 % 128;
            if (i2 % 2 == 0) {
                return textView;
            }
            throw null;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i3 = IEngagementSignalsCallback + 61;
        ICustomTabsServiceStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 59 / 0;
        }
        return null;
    }

    public void onExtraCallback(@NotNull ViewGroup viewGroup) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 117;
        ICustomTabsServiceStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            this.onNavigationEvent = viewGroup;
        } else {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            this.onNavigationEvent = viewGroup;
            throw null;
        }
    }

    @Override // viva.republica.toss.password.PasswordFragment
    public ViewGroup onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStubProxy + 45;
        int i3 = i2 % 128;
        IEngagementSignalsCallback = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        ViewGroup viewGroup = this.onNavigationEvent;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i4 = i3 + 69;
        ICustomTabsServiceStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return viewGroup;
        }
        throw null;
    }

    @Override // viva.republica.toss.password.PasswordFragment
    public View asBinder() {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 25;
        ICustomTabsServiceStubProxy = i2 % 128;
        int i3 = i2 % 2;
        View view = this.onTransact;
        if (view != null) {
            return view;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = IEngagementSignalsCallback + 39;
        ICustomTabsServiceStubProxy = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public void onWarmupCompleted(@NotNull View view) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 107;
        ICustomTabsServiceStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        this.onTransact = view;
        int i4 = IEngagementSignalsCallback + 79;
        ICustomTabsServiceStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(int r28, char r29, int r30, java.lang.Object[] r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.Password4D1AFragment.b(int, char, int, java.lang.Object[]):void");
    }

    private final void IAuthTabCallback(GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStubProxy + 45;
        IEngagementSignalsCallback = i2 % 128;
        this.ICustomTabsCallbackDefault.setValue(this, i2 % 2 == 0 ? onExtraCallbackWithResult[1] : onExtraCallbackWithResult[0], graniteBrownfieldModule_closeView);
    }

    private final GraniteBrownfieldModule_closeView requestPostMessageChannel() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStubProxy + 59;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView = (GraniteBrownfieldModule_closeView) this.ICustomTabsCallbackDefault.getValue(this, onExtraCallbackWithResult[0]);
        int i4 = ICustomTabsServiceStubProxy + 61;
        IEngagementSignalsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return graniteBrownfieldModule_closeView;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final importAppCert setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStubProxy + 15;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        importAppCert importappcert = (importAppCert) this.ICustomTabsCallback_Parcel.getValue();
        int i4 = IEngagementSignalsCallback + 7;
        ICustomTabsServiceStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return importappcert;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0073 A[PHI: r1
      0x0073: PHI (r1v7 android.content.Context) = (r1v4 android.content.Context), (r1v8 android.content.Context) binds: [B:8:0x003b, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003d A[PHI: r1
      0x003d: PHI (r1v5 android.content.Context) = (r1v4 android.content.Context), (r1v8 android.content.Context) binds: [B:8:0x003b, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final o.importAppCert IAuthTabCallback(viva.republica.toss.password.Password4D1AFragment r10) throws java.lang.Throwable {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.password.Password4D1AFragment.IEngagementSignalsCallback
            int r1 = r1 + 117
            int r2 = r1 % 128
            viva.republica.toss.password.Password4D1AFragment.ICustomTabsServiceStubProxy = r2
            int r1 = r1 % r0
            java.lang.String r2 = ""
            r3 = 0
            if (r1 == 0) goto L29
            android.content.Context r1 = r10.requireContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            android.content.res.Resources r4 = r10.getResources()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r2)
            boolean r2 = o.generateLink.IAuthTabCallback(r4)
            r4 = 60
            int r4 = r4 / r3
            if (r2 == 0) goto L73
            goto L3d
        L29:
            android.content.Context r1 = r10.requireContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            android.content.res.Resources r4 = r10.getResources()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r2)
            boolean r2 = o.generateLink.IAuthTabCallback(r4)
            if (r2 == 0) goto L73
        L3d:
            int r10 = android.view.Gravity.getAbsoluteGravity(r3, r3)
            int r10 = r10 + 9
            int r2 = android.view.ViewConfiguration.getKeyRepeatTimeout()
            int r2 = r2 >> 16
            char r2 = (char) r2
            int r4 = android.view.View.combineMeasuredStates(r3, r3)
            int r4 = r4 + 67
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]
            b(r10, r2, r4, r5)
            r10 = r5[r3]
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r10 = r10.intern()
            int r10 = android.graphics.Color.parseColor(r10)
            int r2 = viva.republica.toss.password.Password4D1AFragment.ICustomTabsServiceStubProxy
            int r2 = r2 + 21
            int r3 = r2 % 128
            viva.republica.toss.password.Password4D1AFragment.IEngagementSignalsCallback = r3
            int r2 = r2 % r0
            if (r2 != 0) goto L70
            r0 = 3
            int r0 = r0 / 4
        L70:
            r6 = r10
            r4 = r1
            goto L85
        L73:
            o.getUrlokhttp r10 = o.setBodyokhttp.onExtraCallback(r10)
            int r10 = r10.isEngagementSignalsApiAvailable()
            int r2 = viva.republica.toss.password.Password4D1AFragment.IEngagementSignalsCallback
            int r2 = r2 + 57
            int r3 = r2 % 128
            viva.republica.toss.password.Password4D1AFragment.ICustomTabsServiceStubProxy = r3
            int r2 = r2 % r0
            goto L70
        L85:
            o.importAppCert r10 = new o.importAppCert
            r5 = 1
            r7 = 0
            r8 = 8
            r9 = 0
            r3 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.Password4D1AFragment.IAuthTabCallback(viva.republica.toss.password.Password4D1AFragment):o.importAppCert");
    }

    private static final void onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStubProxy + 83;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = IEngagementSignalsCallback + 51;
        ICustomTabsServiceStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onExtraCallbackWithResult(Password4D1AFragment password4D1AFragment, isJSONTypeIgnore isjsontypeignore) {
        int i = 2 % 2;
        getIconPaddingLeft.IAuthTabCallback.onExtraCallbackWithResult(new asDouble(isNumber.BIOMETRIC, isjsontypeignore.onNavigationEvent(), null, null, false, false, false, false, false, null, 1020, null));
        FragmentActivity activity = password4D1AFragment.getActivity();
        if (activity != null) {
            int i2 = ICustomTabsServiceStubProxy + 81;
            IEngagementSignalsCallback = i2 % 128;
            if (i2 % 2 == 0) {
                activity.finish();
                int i3 = 99 / 0;
            } else {
                activity.finish();
            }
            int i4 = IEngagementSignalsCallback + 89;
            ICustomTabsServiceStubProxy = i4 % 128;
            int i5 = i4 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final void onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 7;
        ICustomTabsServiceStubProxy = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            int i4 = 48 / 0;
        }
    }

    private static final Unit onWarmupCompleted(Throwable th) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 83;
        ICustomTabsServiceStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsServiceStubProxy + 21;
        IEngagementSignalsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:199:0x067e  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x06c3  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x06c8  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x06ca  */
    /* JADX WARN: Type inference failed for: r1v103 */
    /* JADX WARN: Type inference failed for: r1v110 */
    /* JADX WARN: Type inference failed for: r1v112 */
    /* JADX WARN: Type inference failed for: r1v113 */
    /* JADX WARN: Type inference failed for: r1v114 */
    /* JADX WARN: Type inference failed for: r1v115 */
    /* JADX WARN: Type inference failed for: r1v116 */
    /* JADX WARN: Type inference failed for: r1v117 */
    /* JADX WARN: Type inference failed for: r1v118 */
    /* JADX WARN: Type inference failed for: r1v119 */
    /* JADX WARN: Type inference failed for: r1v120 */
    /* JADX WARN: Type inference failed for: r1v121 */
    /* JADX WARN: Type inference failed for: r1v122 */
    /* JADX WARN: Type inference failed for: r1v123 */
    /* JADX WARN: Type inference failed for: r1v124 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v32, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v39, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v55, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v61, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v67, types: [java.lang.Object[]] */
    @Override // viva.republica.toss.password.PasswordFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1779
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.Password4D1AFragment.onCreate(android.os.Bundle):void");
    }

    private static final String onExtraCallbackWithResult(Password4D1AFragment password4D1AFragment, String str) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStubProxy + 71;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        String string = password4D1AFragment.getString(R.string.help_text);
        Intrinsics.checkNotNullExpressionValue(string, "");
        int i4 = ICustomTabsServiceStubProxy + 15;
        IEngagementSignalsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void IAuthTabCallback(final Password4D1AFragment password4D1AFragment, View view) {
        int i = 2 % 2;
        FragmentActivity fragmentActivityRequireActivity = password4D1AFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(fragmentActivityRequireActivity, new Function1() { // from class: viva.republica.toss.password.Password4D1AFragment$$ExternalSyntheticLambda15
            public final Object invoke(Object obj) {
                return Password4D1AFragment.IAuthTabCallback(this.f$0, (CommonModule_setLeftEdgeTouchEnabled) obj);
            }
        });
        int i2 = IEngagementSignalsCallback + 15;
        ICustomTabsServiceStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static final Unit onNavigationEvent(Password4D1AFragment password4D1AFragment, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 7;
        ICustomTabsServiceStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(password4D1AFragment.IAuthTabCallbackStubProxy());
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(password4D1AFragment.getString(R.string.password_use_biometric_dialog_message));
        commonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsServiceStubProxy + 101;
        IEngagementSignalsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(Password4D1AFragment password4D1AFragment, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 49;
        ICustomTabsServiceStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        password4D1AFragment.onClick(view);
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsServiceStubProxy + 95;
        IEngagementSignalsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 98 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        String strIEngagementSignalsCallbackDefault;
        String loginYN;
        String logValue;
        Object obj;
        Password4D1AFragment password4D1AFragment = (Password4D1AFragment) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Map mapOnExtraCallback = setDetectableSize.onExtraCallback();
        PasswordFragment.onExtraCallback onextracallback = password4D1AFragment.prefetchWithMultipleUrls;
        String strUpdateVisuals = null;
        if (onextracallback != null) {
            int i2 = IEngagementSignalsCallback + 17;
            ICustomTabsServiceStubProxy = i2 % 128;
            if (i2 % 2 != 0) {
                strIEngagementSignalsCallbackDefault = onextracallback.IEngagementSignalsCallbackDefault();
                int i3 = 24 / 0;
            } else {
                strIEngagementSignalsCallbackDefault = onextracallback.IEngagementSignalsCallbackDefault();
            }
        } else {
            strIEngagementSignalsCallbackDefault = null;
        }
        Object[] objArr2 = new Object[1];
        b(9 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), ExpandableListView.getPackedPositionType(0L) + 77, objArr2);
        mapOnExtraCallback.put(((String) objArr2[0]).intern(), strIEngagementSignalsCallbackDefault);
        Map mapOnExtraCallback2 = setDetectableSize.onExtraCallback();
        Object[] objArr3 = new Object[1];
        b(View.combineMeasuredStates(0, 0) + 21, (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 58749), 85 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr3);
        mapOnExtraCallback2.put(((String) objArr3[0]).intern(), CatalystInstanceImplPendingJSCall.onNavigationEvent(CatalystInstanceImplPendingJSCall.onWarmupCompleted(password4D1AFragment.prefetchWithMultipleUrls)));
        Map mapOnExtraCallback3 = setDetectableSize.onExtraCallback();
        Object[] objArr4 = new Object[1];
        b(12 - TextUtils.indexOf("", "", 0), (char) (60774 - ((Process.getThreadPriority(0) + 20) >> 6)), 106 - View.getDefaultSize(0, 0), objArr4);
        mapOnExtraCallback3.put(((String) objArr4[0]).intern(), _get_isNull_lambda0.onExtraCallbackWithResult.onWarmupCompleted());
        Map mapOnExtraCallback4 = setDetectableSize.onExtraCallback();
        Button button = password4D1AFragment.requestPostMessageChannelWithExtras;
        if (button == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            button = null;
        }
        Object[] objArr5 = new Object[1];
        b(12 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (26186 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), MotionEvent.axisFromString("") + 119, objArr5);
        mapOnExtraCallback4.put(((String) objArr5[0]).intern(), button.getText().toString());
        Map mapOnExtraCallback5 = setDetectableSize.onExtraCallback();
        TextView textViewIAuthTabCallbackStub = password4D1AFragment.IAuthTabCallbackStub();
        CharSequence text = textViewIAuthTabCallbackStub != null ? textViewIAuthTabCallbackStub.getText() : null;
        Object[] objArr6 = new Object[1];
        b(5 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 130 - View.getDefaultSize(0, 0), objArr6);
        mapOnExtraCallback5.put(((String) objArr6[0]).intern(), String.valueOf(text));
        Map mapOnExtraCallback6 = setDetectableSize.onExtraCallback();
        Object[] objArr7 = new Object[1];
        b((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 10, (char) (ExpandableListView.getPackedPositionType(0L) + 12041), 134 - TextUtils.lastIndexOf("", '0', 0), objArr7);
        mapOnExtraCallback6.put(((String) objArr7[0]).intern(), password4D1AFragment.onTransact().getText().toString());
        Map mapOnExtraCallback7 = setDetectableSize.onExtraCallback();
        createPaints createpaints = createPaints.IAuthTabCallback;
        IndicatorView indicatorViewAccess100 = createpaints.access100();
        if (indicatorViewAccess100 != null) {
            loginYN = indicatorViewAccess100.getLoginYN();
            int i4 = IEngagementSignalsCallback + 39;
            ICustomTabsServiceStubProxy = i4 % 128;
            int i5 = i4 % 2;
        } else {
            loginYN = null;
        }
        Object[] objArr8 = new Object[1];
        b(Color.argb(0, 0, 0, 0) + 8, (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 37438), KeyEvent.normalizeMetaState(0) + 146, objArr8);
        mapOnExtraCallback7.put(((String) objArr8[0]).intern(), loginYN);
        Map mapOnExtraCallback8 = setDetectableSize.onExtraCallback();
        IndicatorView indicatorViewAccess1002 = createpaints.access100();
        if (indicatorViewAccess1002 != null) {
            int i6 = IEngagementSignalsCallback + 29;
            ICustomTabsServiceStubProxy = i6 % 128;
            if (i6 % 2 != 0) {
                indicatorViewAccess1002.getLogValue();
                strUpdateVisuals.hashCode();
                throw null;
            }
            logValue = indicatorViewAccess1002.getLogValue();
        } else {
            logValue = null;
        }
        Object[] objArr9 = new Object[1];
        b(11 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 154, objArr9);
        mapOnExtraCallback8.put(((String) objArr9[0]).intern(), logValue);
        Map mapOnExtraCallback9 = setDetectableSize.onExtraCallback();
        Object[] objArr10 = new Object[1];
        b(11 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) View.MeasureSpec.getSize(0), TextUtils.lastIndexOf("", '0', 0) + 166, objArr10);
        String strIntern = ((String) objArr10[0]).intern();
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1049608869);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 30 - ((Process.getThreadPriority(0) + 20) >> 6), 24887 - Gravity.getAbsoluteGravity(0, 0), -265239605, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj2 = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2027109327);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 30 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), Color.argb(0, 0, 0, 0) + 24887, -1234421087, false, "IAuthTabCallbackStub", new Class[0]);
            }
            mapOnExtraCallback9.put(strIntern, Integer.valueOf(((Integer) ((Method) objOnExtraCallback2).invoke(obj2, null)).intValue() + 1));
            Map mapOnExtraCallback10 = setDetectableSize.onExtraCallback();
            Object[] objArr11 = new Object[1];
            b((Process.myPid() >> 22) + 11, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 176, objArr11);
            mapOnExtraCallback10.put(((String) objArr11[0]).intern(), password4D1AFragment.newSession());
            Map mapOnExtraCallback11 = setDetectableSize.onExtraCallback();
            Object[] objArr12 = new Object[1];
            b(17 - (ViewConfiguration.getTapTimeout() >> 16), (char) (32455 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 187 - View.resolveSizeAndState(0, 0, 0), objArr12);
            mapOnExtraCallback11.put(((String) objArr12[0]).intern(), password4D1AFragment.access000());
            Map mapOnExtraCallback12 = setDetectableSize.onExtraCallback();
            Object[] objArr13 = new Object[1];
            b(9 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (26714 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 204 - Gravity.getAbsoluteGravity(0, 0), objArr13);
            mapOnExtraCallback12.put(((String) objArr13[0]).intern(), Long.valueOf(password4D1AFragment.readTypedObject()));
            Map mapOnExtraCallback13 = setDetectableSize.onExtraCallback();
            if (setTestMode.IAuthTabCallbackDefault()) {
                int i7 = ICustomTabsServiceStubProxy + 49;
                IEngagementSignalsCallback = i7 % 128;
                int i8 = i7 % 2;
                Object[] objArr14 = new Object[1];
                b((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (14424 - Color.argb(0, 0, 0, 0)), 65 - (ViewConfiguration.getEdgeSlop() >> 16), objArr14);
                obj = objArr14[0];
            } else {
                Object[] objArr15 = new Object[1];
                b(KeyEvent.getDeadChar(0, 0) + 1, (char) (ViewConfiguration.getTouchSlop() >> 8), TextUtils.lastIndexOf("", '0') + 67, objArr15);
                obj = objArr15[0];
            }
            String strIntern2 = ((String) obj).intern();
            Object[] objArr16 = new Object[1];
            b(7 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 30466), Gravity.getAbsoluteGravity(0, 0) + 213, objArr16);
            mapOnExtraCallback13.put(((String) objArr16[0]).intern(), strIntern2);
            Map mapOnExtraCallback14 = setDetectableSize.onExtraCallback();
            PasswordFragment.onExtraCallback onextracallback2 = password4D1AFragment.prefetchWithMultipleUrls;
            if (onextracallback2 != null) {
                int i9 = IEngagementSignalsCallback + 87;
                ICustomTabsServiceStubProxy = i9 % 128;
                int i10 = i9 % 2;
                strUpdateVisuals = onextracallback2.updateVisuals();
            }
            Object[] objArr17 = new Object[1];
            b(10 - (ViewConfiguration.getScrollBarSize() >> 8), (char) ExpandableListView.getPackedPositionGroup(0L), 220 - View.combineMeasuredStates(0, 0), objArr17);
            mapOnExtraCallback14.put(((String) objArr17[0]).intern(), strUpdateVisuals);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static final void IAuthTabCallbackDefault(final Password4D1AFragment password4D1AFragment, View view) {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1520731L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.password.Password4D1AFragment$$ExternalSyntheticLambda13
            public final Object invoke(Object obj) {
                Object[] objArr = {this.f$0, (SetDetectableSize) obj};
                int iOnExtraCallback = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
                return (Unit) Password4D1AFragment.onWarmupCompleted(2041099297, -2041099291, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), objArr, iOnExtraCallback, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback());
            }
        }, 14, (Object) null);
        PasswordFragment.IAuthTabCallback iAuthTabCallbackExtraCallbackWithResult = password4D1AFragment.extraCallbackWithResult();
        if (iAuthTabCallbackExtraCallbackWithResult != null) {
            int i2 = IEngagementSignalsCallback + 61;
            ICustomTabsServiceStubProxy = i2 % 128;
            int i3 = i2 % 2;
            iAuthTabCallbackExtraCallbackWithResult.IAuthTabCallback();
            if (i3 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = ICustomTabsServiceStubProxy + 47;
            IEngagementSignalsCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
        Password4D1AFragment password4D1AFragment = (Password4D1AFragment) objArr[0];
        ((Number) objArr[1]).intValue();
        View view = (View) objArr[2];
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStubProxy + 35;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        password4D1AFragment.onClick(view);
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsServiceStubProxy + 9;
        IEngagementSignalsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull android.view.LayoutInflater r22, @org.jetbrains.annotations.Nullable android.view.ViewGroup r23, @org.jetbrains.annotations.Nullable android.os.Bundle r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.Password4D1AFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    private static final void onNavigationEvent(Password4D1AFragment password4D1AFragment, DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        int i3 = IEngagementSignalsCallback + 7;
        ICustomTabsServiceStubProxy = i3 % 128;
        int i4 = i3 % 2;
        password4D1AFragment.postMessage = true;
        dialogInterface.dismiss();
        int i5 = IEngagementSignalsCallback + 23;
        ICustomTabsServiceStubProxy = i5 % 128;
        int i6 = i5 % 2;
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStubProxy + 113;
        IEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            super.onViewCreated(view, bundle);
            accessMapSafely accessmapsafely = accessMapSafely.onNavigationEvent;
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            accessmapsafely.IAuthTabCallback(contextRequireContext);
            throw null;
        }
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        accessMapSafely accessmapsafely2 = accessMapSafely.onNavigationEvent;
        Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
        if (accessmapsafely2.IAuthTabCallback(contextRequireContext2)) {
            int i3 = IEngagementSignalsCallback + 79;
            ICustomTabsServiceStubProxy = i3 % 128;
            if (i3 % 2 != 0) {
                enableFabricRenderer.onExtraCallback.onExtraCallback();
                throw null;
            }
            Throwable thOnExtraCallback = enableFabricRenderer.onExtraCallback.onExtraCallback();
            if (thOnExtraCallback != null && RxBiometric.Companion.onExtraCallbackWithResult(thOnExtraCallback)) {
                TdsDialogV1.onExtraCallbackWithResult onextracallbackwithresult = TdsDialogV1.Companion;
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted onwarmupcompleted = (TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) onextracallbackwithresult.onExtraCallback(context).onNavigationEvent(false);
                String string = getString(R.string.app_password___b2387d7b1d);
                Intrinsics.checkNotNullExpressionValue(string, "");
                Object[] objArr = {(TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) onwarmupcompleted.onNavigationEvent(string), Integer.valueOf(R.drawable.image_popup_fingerprint_add)};
                int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
                TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted onwarmupcompleted2 = (TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), -963962278, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), 963962280, objArr, iOnExtraCallback);
                String string2 = getString(R.string.app_password___df8739daab);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted onwarmupcompleted3 = (TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) onwarmupcompleted2.onExtraCallbackWithResult(string2);
                String string3 = getString(im.toss.uikit.R.string.uikit_confirm);
                Intrinsics.checkNotNullExpressionValue(string3, "");
                TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted.onExtraCallback(onwarmupcompleted3, string3, new DialogInterface.OnClickListener() { // from class: viva.republica.toss.password.Password4D1AFragment$$ExternalSyntheticLambda14
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i4) {
                        Password4D1AFragment.onExtraCallbackWithResult(this.f$0, dialogInterface, i4);
                    }
                }, (TdsButtonV1View.asInterface) null, false, 12, (Object) null).readTypedObject();
            }
        }
        if (ICustomTabsCallback_Parcel()) {
            prefetch();
            int i4 = IEngagementSignalsCallback + 45;
            ICustomTabsServiceStubProxy = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0145  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onClick(@org.jetbrains.annotations.NotNull android.view.View r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 545
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.Password4D1AFragment.onClick(android.view.View):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object onNavigationEvent(java.lang.Object[] r18) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.Password4D1AFragment.onNavigationEvent(java.lang.Object[]):java.lang.Object");
    }

    public void onSaveInstanceState(@NotNull Bundle bundle) throws Throwable {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 77;
        ICustomTabsServiceStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(bundle, "");
        Object[] objArr = new Object[1];
        b(14 - Color.green(0), (char) View.combineMeasuredStates(0, 0), Color.argb(0, 0, 0, 0) + 331, objArr);
        bundle.putString(((String) objArr[0]).intern(), this.setEngagementSignalsCallback);
        super/*im.toss.uikit.base.UIKitBaseFragment*/.onSaveInstanceState(bundle);
        int i4 = ICustomTabsServiceStubProxy + 31;
        IEngagementSignalsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 74 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void onExtraCallback(java.lang.String r11) throws java.lang.Throwable {
        /*
            r10 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.password.Password4D1AFragment.IEngagementSignalsCallback
            r2 = 5
            int r1 = r1 + r2
            int r3 = r1 % 128
            viva.republica.toss.password.Password4D1AFragment.ICustomTabsServiceStubProxy = r3
            int r1 = r1 % r0
            if (r1 == 0) goto L40
            o.noStore$onExtraCallback r1 = o.noStore.Companion
            o.noStore r1 = r1.asBinder()
            o.isOneShot.onExtraCallbackWithResult(r10, r1)
            char[] r1 = r10.ICustomTabsCallbackStubProxy
            java.lang.Object[] r7 = new java.lang.Object[]{r10, r1}
            int r8 = im.toss.features.home.ui.view.currency.CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()
            int r5 = im.toss.features.home.ui.view.currency.CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()
            int r9 = im.toss.features.home.ui.view.currency.CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()
            int r6 = im.toss.features.home.ui.view.currency.CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()
            r4 = 156355348(0x951cb14, float:2.5252947E-33)
            r3 = -156355346(0xfffffffff6ae34ee, float:-1.7666664E33)
            java.lang.Object r1 = onWarmupCompleted(r3, r4, r5, r6, r7, r8, r9)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 != r2) goto Lbf
            goto L72
        L40:
            o.noStore$onExtraCallback r1 = o.noStore.Companion
            o.noStore r1 = r1.asBinder()
            o.isOneShot.onExtraCallbackWithResult(r10, r1)
            char[] r1 = r10.ICustomTabsCallbackStubProxy
            java.lang.Object[] r7 = new java.lang.Object[]{r10, r1}
            int r8 = im.toss.features.home.ui.view.currency.CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()
            int r5 = im.toss.features.home.ui.view.currency.CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()
            int r9 = im.toss.features.home.ui.view.currency.CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()
            int r6 = im.toss.features.home.ui.view.currency.CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()
            r4 = 156355348(0x951cb14, float:2.5252947E-33)
            r3 = -156355346(0xfffffffff6ae34ee, float:-1.7666664E33)
            java.lang.Object r1 = onWarmupCompleted(r3, r4, r5, r6, r7, r8, r9)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r3 = 4
            if (r1 != r3) goto Lbf
        L72:
            char[] r1 = r10.ICustomTabsCallbackStubProxy
            r10.onWarmupCompleted(r1, r11)
            r10.IAuthTabCallback(r11)
            char[] r11 = r10.ICustomTabsCallbackStubProxy
            java.lang.Object[] r7 = new java.lang.Object[]{r10, r11}
            int r8 = im.toss.features.home.ui.view.currency.CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()
            int r5 = im.toss.features.home.ui.view.currency.CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()
            int r9 = im.toss.features.home.ui.view.currency.CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()
            int r6 = im.toss.features.home.ui.view.currency.CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()
            r4 = 156355348(0x951cb14, float:2.5252947E-33)
            r3 = -156355346(0xfffffffff6ae34ee, float:-1.7666664E33)
            java.lang.Object r11 = onWarmupCompleted(r3, r4, r5, r6, r7, r8, r9)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            if (r11 != r2) goto Lbf
            java.lang.Object[] r7 = new java.lang.Object[]{r10}
            int r8 = im.toss.features.home.ui.view.currency.CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()
            int r5 = im.toss.features.home.ui.view.currency.CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()
            int r9 = im.toss.features.home.ui.view.currency.CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()
            int r6 = im.toss.features.home.ui.view.currency.CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()
            r4 = 670321045(0x27f44995, float:6.7803382E-15)
            r3 = -670321045(0xffffffffd80bb66b, float:-6.144624E14)
            onWarmupCompleted(r3, r4, r5, r6, r7, r8, r9)
        Lbf:
            int r11 = viva.republica.toss.password.Password4D1AFragment.ICustomTabsServiceStubProxy
            int r11 = r11 + 99
            int r1 = r11 % 128
            viva.republica.toss.password.Password4D1AFragment.IEngagementSignalsCallback = r1
            int r11 = r11 % r0
            if (r11 != 0) goto Lce
            r11 = 25
            int r11 = r11 / 0
        Lce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.Password4D1AFragment.onExtraCallback(java.lang.String):void");
    }

    private static final void onExtraCallback(TextView textView, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 81;
        ICustomTabsServiceStubProxy = i2 % 128;
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
        int i3 = ICustomTabsServiceStubProxy + 125;
        IEngagementSignalsCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    private final void IAuthTabCallback(String str) throws Throwable {
        String strIntern;
        int i = 2 % 2;
        onExtraCallback(onExtraCallbackWithResult(onActivityLayout()), (CharSequence) PasswordFragment.onNavigationEvent(50819534, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), -50819529, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this, onActivityLayout()}));
        int iIntValue = ((Integer) onWarmupCompleted(-156355346, 156355348, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), new Object[]{this, this.ICustomTabsCallbackStubProxy}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback())).intValue();
        TextView textView = this.onUnminimized.get(iIntValue - 1);
        Intrinsics.checkNotNullExpressionValue(textView, "");
        final TextView textView2 = textView;
        textView2.setTextColor(((Integer) getUrlokhttp.onNavigationEvent(new Object[]{setBodyokhttp.onExtraCallback(this)}, -1763178192, 1763178195, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult())).intValue());
        Button button = this.IAuthTabCallbackDefault;
        Object obj = null;
        if (button == null) {
            int i2 = ICustomTabsServiceStubProxy + 9;
            IEngagementSignalsCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i3 = 54 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            button = null;
        }
        if (button.isSelected()) {
            int i4 = IEngagementSignalsCallback + 91;
            ICustomTabsServiceStubProxy = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 3 % 2;
            }
            strIntern = str;
        } else {
            Object[] objArr = new Object[1];
            b(1 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (Color.green(0) + 44206), 76 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr);
            strIntern = ((String) objArr[0]).intern();
        }
        textView2.setText(strIntern);
        textView2.setContentDescription(getString(R.string.app_password___64098e62fc, new Object[]{Integer.valueOf(iIntValue)}));
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 1.2f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: viva.republica.toss.password.Password4D1AFragment$$ExternalSyntheticLambda2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Password4D1AFragment.onWarmupCompleted(textView2, valueAnimator);
            }
        });
        valueAnimatorOfFloat.setDuration(100L);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.start();
        onExtraCallbackWithResult().announceForAccessibility(getString(R.string.app_password___49003299c7, new Object[]{str, Integer.valueOf(((Integer) onWarmupCompleted(-156355346, 156355348, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), new Object[]{this, this.ICustomTabsCallbackStubProxy}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback())).intValue())}));
        int i6 = IEngagementSignalsCallback + 105;
        ICustomTabsServiceStubProxy = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007e A[PHI: r6 r7
      0x007e: PHI (r6v11 java.lang.Object) = (r6v8 java.lang.Object), (r6v12 java.lang.Object) binds: [B:16:0x007c, B:13:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x007e: PHI (r7v16 int) = (r7v4 int), (r7v17 int) binds: [B:16:0x007c, B:13:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0051  */
    @Override // viva.republica.toss.password.PasswordFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void asInterface() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.Password4D1AFragment.asInterface():void");
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) throws Throwable {
        Password4D1AFragment password4D1AFragment = (Password4D1AFragment) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 75;
        ICustomTabsServiceStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr2 = new Object[1];
        b(11 - TextUtils.indexOf("", "", 0, 0), (char) View.getDefaultSize(0, 0), 176 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), password4D1AFragment.newSession());
        Object[] objArr3 = new Object[1];
        b((ViewConfiguration.getJumpTapTimeout() >> 16) + 17, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 32455), 186 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr3);
        setDetectableSize.onExtraCallback(((String) objArr3[0]).intern(), password4D1AFragment.access000());
        Unit unit = Unit.INSTANCE;
        int i4 = IEngagementSignalsCallback + 31;
        ICustomTabsServiceStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void onNavigationEvent(java.lang.String r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.Password4D1AFragment.onNavigationEvent(java.lang.String):void");
    }

    private final void requestPostMessageChannelWithExtras() throws Throwable {
        int i = 2 % 2;
        if (((Integer) onWarmupCompleted(-156355346, 156355348, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), new Object[]{this, this.ICustomTabsCallbackStubProxy}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback())).intValue() == 5) {
            int i2 = ICustomTabsServiceStubProxy + 35;
            IEngagementSignalsCallback = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        isOneShot.onExtraCallbackWithResult(this, noStore.Companion.asBinder());
        if (((Integer) onWarmupCompleted(-156355346, 156355348, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), new Object[]{this, this.ICustomTabsCallbackStubProxy}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback())).intValue() != 0) {
            int i4 = ICustomTabsServiceStubProxy + 61;
            IEngagementSignalsCallback = i4 % 128;
            int i5 = i4 % 2;
            int iIntValue = ((Integer) onWarmupCompleted(-156355346, 156355348, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), new Object[]{this, this.ICustomTabsCallbackStubProxy}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback())).intValue();
            int i6 = iIntValue - 1;
            TextView textView = this.onUnminimized.get(i6);
            Intrinsics.checkNotNullExpressionValue(textView, "");
            TextView textView2 = textView;
            textView2.setTextColor(setBodyokhttp.onExtraCallback(this).requestPostMessageChannel().onSessionEnded());
            Object[] objArr = new Object[1];
            b('1' - AndroidCharacter.getMirror('0'), (char) (44206 - TextUtils.indexOf("", "", 0, 0)), 75 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr);
            textView2.setText(((String) objArr[0]).intern());
            textView2.setContentDescription(getString(R.string.app_password___e445d6d193, new Object[]{Integer.valueOf(iIntValue)}));
            onNavigationEvent(this.ICustomTabsCallbackStubProxy, i6);
        }
        if (((Integer) onWarmupCompleted(-156355346, 156355348, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), new Object[]{this, this.ICustomTabsCallbackStubProxy}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback())).intValue() == 3) {
            int i7 = IEngagementSignalsCallback + 115;
            ICustomTabsServiceStubProxy = i7 % 128;
            int i8 = i7 % 2;
            ICustomTabsServiceDefault();
        }
        onExtraCallbackWithResult().announceForAccessibility(getString(R.string.app_password___1b56688847, new Object[]{Integer.valueOf(((Integer) onWarmupCompleted(-156355346, 156355348, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), new Object[]{this, this.ICustomTabsCallbackStubProxy}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback())).intValue())}));
    }

    private final void IAuthTabCallback(TextView textView) throws Throwable {
        int i = 2 % 2;
        if (isEngagementSignalsApiAvailable()) {
            ConvertByteArrayToFloatArray.onExtraCallback(1365174L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
        } else {
            ConvertByteArrayToFloatArray.onExtraCallback(1365134L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
        }
        if (!textView.isSelected()) {
            textView.setSelected(true);
            int length = this.ICustomTabsCallbackStubProxy.length;
            int i2 = 0;
            while (i2 < length) {
                int i3 = ICustomTabsServiceStubProxy + 47;
                IEngagementSignalsCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    this.onUnminimized.get(i2).setText(String.valueOf(this.ICustomTabsCallbackStubProxy[i2]));
                    i2 += 31;
                } else {
                    this.onUnminimized.get(i2).setText(String.valueOf(this.ICustomTabsCallbackStubProxy[i2]));
                    i2++;
                }
            }
        } else {
            int i4 = IEngagementSignalsCallback + 43;
            ICustomTabsServiceStubProxy = i4 % 128;
            int i5 = i4 % 2;
            textView.setSelected(false);
            int length2 = this.ICustomTabsCallbackStubProxy.length;
            for (int i6 = 0; i6 < length2; i6++) {
                TextView textView2 = this.onUnminimized.get(i6);
                Object[] objArr = new Object[1];
                b(Color.alpha(0) + 1, (char) (View.combineMeasuredStates(0, 0) + 44206), View.resolveSizeAndState(0, 0, 0) + 76, objArr);
                textView2.setText(((String) objArr[0]).intern());
            }
        }
        int i7 = IEngagementSignalsCallback + 19;
        ICustomTabsServiceStubProxy = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 83 / 0;
        }
    }

    private final void receiveFile() throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStubProxy + 125;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        if (this.ICustomTabsService) {
            this.ICustomTabsService = false;
            AnimatorSet animatorSet = new AnimatorSet();
            LinearLayout linearLayout = this.newSession;
            LinearLayout linearLayout2 = null;
            if (linearLayout == null) {
                int i4 = ICustomTabsServiceStubProxy + 103;
                IEngagementSignalsCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i5 = 54 / 0;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                linearLayout = null;
            }
            LinearLayout linearLayout3 = this.newSession;
            if (linearLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i6 = ICustomTabsServiceStubProxy + 95;
                IEngagementSignalsCallback = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 4 / 2;
                }
                linearLayout3 = null;
            }
            Object[] objArr = new Object[1];
            b('<' - AndroidCharacter.getMirror('0'), (char) View.resolveSizeAndState(0, 0, 0), 229 - TextUtils.lastIndexOf("", '0'), objArr);
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(linearLayout, ((String) objArr[0]).intern(), 0.0f, -linearLayout3.getWidth());
            LinearLayout linearLayout4 = this.newSessionWithExtras;
            if (linearLayout4 == null) {
                int i8 = ICustomTabsServiceStubProxy + 31;
                IEngagementSignalsCallback = i8 % 128;
                int i9 = i8 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                linearLayout4 = null;
            }
            LinearLayout linearLayout5 = this.newSessionWithExtras;
            if (linearLayout5 == null) {
                int i10 = IEngagementSignalsCallback + 27;
                ICustomTabsServiceStubProxy = i10 % 128;
                int i11 = i10 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                linearLayout5 = null;
            }
            Object[] objArr2 = new Object[1];
            b((ViewConfiguration.getLongPressTimeout() >> 16) + 12, (char) (Color.rgb(0, 0, 0) + 16777216), 231 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr2);
            animatorSet.playTogether(objectAnimatorOfFloat, ObjectAnimator.ofFloat(linearLayout4, ((String) objArr2[0]).intern(), 0.0f, -linearLayout5.getWidth()));
            animatorSet.setInterpolator(dangerouslyForceOverride.onExtraCallbackWithResult.IAuthTabCallback());
            animatorSet.setDuration(400L).start();
            LinearLayout linearLayout6 = this.newSessionWithExtras;
            if (linearLayout6 == null) {
                int i12 = ICustomTabsServiceStubProxy + 1;
                IEngagementSignalsCallback = i12 % 128;
                int i13 = i12 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                linearLayout2 = linearLayout6;
            }
            linearLayout2.announceForAccessibility(getString(R.string.app_password___14bc8c3a26));
        }
    }

    private static final void onWarmupCompleted(Password4D1AFragment password4D1AFragment, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "");
        float fFloatValue = ((Float) animatedValue).floatValue();
        LinearLayout linearLayout = password4D1AFragment.newSession;
        LinearLayout linearLayout2 = null;
        if (linearLayout == null) {
            int i2 = ICustomTabsServiceStubProxy + 25;
            IEngagementSignalsCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = ICustomTabsServiceStubProxy + 89;
            IEngagementSignalsCallback = i4 % 128;
            int i5 = i4 % 2;
            linearLayout = null;
        }
        LinearLayout linearLayout3 = password4D1AFragment.newSession;
        if (linearLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            linearLayout3 = null;
        }
        linearLayout.setTranslationX((-linearLayout3.getWidth()) * fFloatValue);
        LinearLayout linearLayout4 = password4D1AFragment.newSessionWithExtras;
        if (linearLayout4 == null) {
            int i6 = ICustomTabsServiceStubProxy + 95;
            IEngagementSignalsCallback = i6 % 128;
            int i7 = i6 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i7 == 0) {
                linearLayout2.hashCode();
                throw null;
            }
            linearLayout4 = null;
        }
        LinearLayout linearLayout5 = password4D1AFragment.newSessionWithExtras;
        if (linearLayout5 == null) {
            int i8 = ICustomTabsServiceStubProxy + 71;
            IEngagementSignalsCallback = i8 % 128;
            int i9 = i8 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            linearLayout2 = linearLayout5;
        }
        linearLayout4.setTranslationX((-linearLayout2.getWidth()) * fFloatValue);
    }

    private final void ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 53;
        ICustomTabsServiceStubProxy = i2 % 128;
        int i3 = i2 % 2;
        if (this.ICustomTabsService) {
            return;
        }
        this.ICustomTabsService = true;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: viva.republica.toss.password.Password4D1AFragment$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Object[] objArr = {this.f$0, valueAnimator};
                int iOnExtraCallback = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
                Password4D1AFragment.onWarmupCompleted(1258242986, -1258242977, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), objArr, iOnExtraCallback, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback());
            }
        });
        valueAnimatorOfFloat.setInterpolator(dangerouslyForceOverride.onExtraCallbackWithResult.IAuthTabCallback());
        valueAnimatorOfFloat.setDuration(400L);
        valueAnimatorOfFloat.start();
        View view = this.newAuthTabSession;
        LinearLayout linearLayout = null;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            view = null;
        }
        view.setVisibility(0);
        LinearLayout linearLayout2 = this.newSession;
        if (linearLayout2 == null) {
            int i4 = IEngagementSignalsCallback + 11;
            ICustomTabsServiceStubProxy = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            linearLayout = linearLayout2;
        }
        linearLayout.announceForAccessibility(AFj1rSDK.onExtraCallback.onExtraCallbackWithResult(R.string.app_password___1d4c0c654f));
    }

    @Override // viva.republica.toss.password.PasswordFragment
    public void onDestroyView() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStubProxy + 55;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onDestroyView();
        onWarmupCompleted(this.ICustomTabsCallbackStubProxy);
        requestPostMessageChannel().destroy();
        int i4 = ICustomTabsServiceStubProxy + 101;
        IEngagementSignalsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public long getScreenId() {
        Long lIAuthTabCallback;
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 19;
        ICustomTabsServiceStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        PasswordFragment.onExtraCallback onextracallback = this.prefetchWithMultipleUrls;
        if (onextracallback != null && (lIAuthTabCallback = onextracallback.IAuthTabCallback()) != null) {
            return lIAuthTabCallback.longValue();
        }
        int i3 = IEngagementSignalsCallback + 99;
        ICustomTabsServiceStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            return -1L;
        }
        obj.hashCode();
        throw null;
    }

    public String getScreenName() throws Throwable {
        String engagementSignalsCallback;
        int i = 2 % 2;
        PasswordFragment.onExtraCallback onextracallback = this.prefetchWithMultipleUrls;
        if (onextracallback != null) {
            int i2 = IEngagementSignalsCallback + 39;
            ICustomTabsServiceStubProxy = i2 % 128;
            if (i2 % 2 != 0) {
                engagementSignalsCallback = onextracallback.setEngagementSignalsCallback();
                int i3 = 61 / 0;
            } else {
                engagementSignalsCallback = onextracallback.setEngagementSignalsCallback();
            }
        } else {
            int i4 = IEngagementSignalsCallback + 47;
            ICustomTabsServiceStubProxy = i4 % 128;
            int i5 = i4 % 2;
            engagementSignalsCallback = null;
        }
        if (engagementSignalsCallback != null) {
            int i6 = ICustomTabsServiceStubProxy + 115;
            IEngagementSignalsCallback = i6 % 128;
            int i7 = i6 % 2;
            if (engagementSignalsCallback.length() > 0) {
                return engagementSignalsCallback;
            }
        }
        Object[] objArr = new Object[1];
        b(8 - View.resolveSize(0, 0), (char) (TextUtils.getTrimmedLength("") + 6128), 242 - (ViewConfiguration.getTouchSlop() >> 8), objArr);
        return ((String) objArr[0]).intern();
    }

    public Map<String, Object> getScreenParams() throws Throwable {
        Map<String, Object> mapICustomTabsServiceStub;
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStubProxy + 45;
        IEngagementSignalsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            PasswordFragment.onExtraCallback onextracallback = this.prefetchWithMultipleUrls;
            if (onextracallback != null && (mapICustomTabsServiceStub = onextracallback.ICustomTabsServiceStub()) != null) {
                Object[] objArr = new Object[1];
                b(11 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) ((-1) - MotionEvent.axisFromString("")), 175 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr);
                mapICustomTabsServiceStub.put(((String) objArr[0]).intern(), newSession());
                Object[] objArr2 = new Object[1];
                b(17 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 32454), KeyEvent.keyCodeFromString("") + 187, objArr2);
                mapICustomTabsServiceStub.put(((String) objArr2[0]).intern(), access000());
                return mapICustomTabsServiceStub;
            }
            Object[] objArr3 = new Object[1];
            b(6 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (61534 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), 250 - TextUtils.indexOf("", "", 0, 0), objArr3);
            String strIntern = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            b((ViewConfiguration.getDoubleTapTimeout() >> 16) + 8, (char) (6129 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), View.MeasureSpec.getMode(0) + 242, objArr4);
            Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(strIntern, ((String) objArr4[0]).intern());
            Object[] objArr5 = new Object[1];
            b((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 5, (char) (TextUtils.lastIndexOf("", '0') + 56603), 255 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr5);
            Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(((String) objArr5[0]).intern(), onActivityLayout().getEventValue());
            Object[] objArr6 = new Object[1];
            b((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 4, (char) TextUtils.getCapsMode("", 0, 0), KeyEvent.keyCodeFromString("") + 260, objArr6);
            Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback(((String) objArr6[0]).intern(), this.setEngagementSignalsCallback);
            Object[] objArr7 = new Object[1];
            b(TextUtils.getOffsetAfter("", 0) + 10, (char) ((Process.myTid() >> 22) + 44936), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 263, objArr7);
            Map<String, Object> mapIAuthTabCallback = access8100.IAuthTabCallback(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, getWrite.IAuthTabCallback(((String) objArr7[0]).intern(), (String) PasswordFragment.onNavigationEvent(-420298243, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 420298251, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this}))});
            int i3 = ICustomTabsServiceStubProxy + 71;
            IEngagementSignalsCallback = i3 % 128;
            int i4 = i3 % 2;
            return mapIAuthTabCallback;
        }
        throw null;
    }

    @Override // viva.republica.toss.password.PasswordFragment
    public String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStubProxy + 115;
        IEngagementSignalsCallback = i2 % 128;
        int i3 = i2 % 2;
        String string = getString(R.string.password_format_4_digit_1_alphabet);
        Intrinsics.checkNotNullExpressionValue(string, "");
        int i4 = IEngagementSignalsCallback + 109;
        ICustomTabsServiceStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onWarmupCompleted(char[] cArr, String str) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 7;
        ICustomTabsServiceStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallback = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
            int iOnExtraCallback2 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
            int iOnExtraCallback3 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
            cArr[((Integer) onWarmupCompleted(-156355346, 156355348, iOnExtraCallback2, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), new Object[]{this, cArr}, iOnExtraCallback, iOnExtraCallback3)).intValue()] = StringsKt.single(str);
            return;
        }
        int iOnExtraCallback4 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        int iOnExtraCallback5 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        int iOnExtraCallback6 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        cArr[((Integer) onWarmupCompleted(-156355346, 156355348, iOnExtraCallback5, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), new Object[]{this, cArr}, iOnExtraCallback4, iOnExtraCallback6)).intValue()] = StringsKt.single(str);
        throw null;
    }

    private final void onNavigationEvent(char[] cArr, int i) {
        int i2 = 2 % 2;
        int i3 = IEngagementSignalsCallback;
        int i4 = i3 + 13;
        ICustomTabsServiceStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            cArr[i] = 4217;
        } else {
            cArr[i] = 9679;
        }
        int i5 = i3 + 7;
        ICustomTabsServiceStubProxy = i5 % 128;
        int i6 = i5 % 2;
    }

    private final void onWarmupCompleted(char[] cArr) {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStubProxy + 107;
        IEngagementSignalsCallback = i2 % 128;
        Arrays.fill(cArr, i2 % 2 == 0 ? (char) 5378 : (char) 9679);
        int i3 = IEngagementSignalsCallback + 33;
        ICustomTabsServiceStubProxy = i3 % 128;
        int i4 = i3 % 2;
    }

    private final String newSession() throws Throwable {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 29;
        ICustomTabsServiceStubProxy = i2 % 128;
        int i3 = i2 % 2;
        if (!PasswordFragment.onWarmupCompleted(this, (UTF8Decoder) null, 1, (Object) null)) {
            Object[] objArr = new Object[1];
            b((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 66 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr);
            return ((String) objArr[0]).intern();
        }
        Object[] objArr2 = new Object[1];
        b((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1, (char) (Color.green(0) + 14424), Color.rgb(0, 0, 0) + 16777281, objArr2);
        String strIntern = ((String) objArr2[0]).intern();
        int i4 = ICustomTabsServiceStubProxy + 125;
        IEngagementSignalsCallback = i4 % 128;
        int i5 = i4 % 2;
        return strIntern;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001e A[PHI: r2
      0x001e: PHI (r2v3 im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV1View) = 
      (r2v2 im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV1View)
      (r2v17 im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV1View)
     binds: [B:8:0x001c, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String access000() throws java.lang.Throwable {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.password.Password4D1AFragment.IEngagementSignalsCallback
            int r2 = r1 + 105
            int r3 = r2 % 128
            viva.republica.toss.password.Password4D1AFragment.ICustomTabsServiceStubProxy = r3
            int r2 = r2 % r0
            java.lang.String r3 = ""
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L1a
            im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV1View r2 = r7.updateVisuals
            r6 = 51
            int r6 = r6 / r5
            if (r2 == 0) goto L86
            goto L1e
        L1a:
            im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV1View r2 = r7.updateVisuals
            if (r2 == 0) goto L86
        L1e:
            if (r2 != 0) goto L2b
            int r1 = r1 + 81
            int r2 = r1 % 128
            viva.republica.toss.password.Password4D1AFragment.ICustomTabsServiceStubProxy = r2
            int r1 = r1 % r0
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
            r2 = 0
        L2b:
            boolean r1 = r2.isChecked()
            if (r1 == r4) goto L32
            goto L86
        L32:
            int r1 = viva.republica.toss.password.Password4D1AFragment.ICustomTabsServiceStubProxy
            int r1 = r1 + 113
            int r2 = r1 % 128
            viva.republica.toss.password.Password4D1AFragment.IEngagementSignalsCallback = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L64
            long r0 = android.widget.ExpandableListView.getPackedPositionForChild(r4, r4)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            int r0 = -r0
            int r1 = android.graphics.Color.alpha(r4)
            r2 = 11793(0x2e11, float:1.6526E-41)
            int r2 = r2 % r1
            char r1 = (char) r2
            int r2 = android.view.View.MeasureSpec.getSize(r5)
            r3 = 124(0x7c, float:1.74E-43)
            int r2 = r3 >>> r2
            java.lang.Object[] r3 = new java.lang.Object[r4]
            b(r0, r1, r2, r3)
            r0 = r3[r5]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            return r0
        L64:
            long r0 = android.widget.ExpandableListView.getPackedPositionForChild(r5, r5)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            int r0 = -r0
            int r1 = android.graphics.Color.alpha(r5)
            int r1 = 14424 - r1
            char r1 = (char) r1
            int r2 = android.view.View.MeasureSpec.getSize(r5)
            int r2 = r2 + 65
            java.lang.Object[] r3 = new java.lang.Object[r4]
            b(r0, r1, r2, r3)
            r0 = r3[r5]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            return r0
        L86:
            int r0 = android.view.MotionEvent.axisFromString(r3)
            int r0 = -r0
            int r1 = android.text.TextUtils.indexOf(r3, r3)
            char r1 = (char) r1
            int r2 = android.view.View.getDefaultSize(r5, r5)
            int r2 = r2 + 66
            java.lang.Object[] r3 = new java.lang.Object[r4]
            b(r0, r1, r2, r3)
            r0 = r3[r5]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.Password4D1AFragment.access000():java.lang.String");
    }

    @Override // viva.republica.toss.password.Hilt_PasswordFragment
    public void onAttach(@NotNull Context context) throws Throwable {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 97;
        ICustomTabsServiceStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(context, "");
            super.onAttach(context);
            boolean z = context instanceof PasswordFragment.onExtraCallback;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(context, "");
        super.onAttach(context);
        boolean z2 = context instanceof PasswordFragment.onExtraCallback;
        Object obj2 = context;
        if (!z2) {
            Fragment parentFragment = getParentFragment();
            if (parentFragment != null && !(parentFragment instanceof PasswordFragment.onExtraCallback)) {
                Object[] objArr = new Object[1];
                b(Color.alpha(0) + 56, (char) (9874 - TextUtils.lastIndexOf("", '0')), (ViewConfiguration.getEdgeSlop() >> 16) + 274, objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            PasswordFragment.onExtraCallback parentFragment2 = getParentFragment();
            int i3 = IEngagementSignalsCallback + 47;
            ICustomTabsServiceStubProxy = i3 % 128;
            int i4 = i3 % 2;
            obj2 = parentFragment2;
        }
        this.prefetchWithMultipleUrls = (PasswordFragment.onExtraCallback) obj2;
    }

    private final void onNavigationEvent(View view) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallback + 57;
        ICustomTabsServiceStubProxy = i2 % 128;
        int i3 = i2 % 2;
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
        int i4 = IEngagementSignalsCallback + 37;
        ICustomTabsServiceStubProxy = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNull(viewFindViewById);
        viewFindViewById.setVisibility(0);
        Intrinsics.checkNotNull(viewFindViewById2);
        viewFindViewById2.setVisibility(0);
        Intrinsics.checkNotNull(viewFindViewById3);
        disableImageViewPreallocationAndroid.IAuthTabCallback(viewFindViewById3, 0, false, 2, (Object) null);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        enableImagePrefetchingOnUiThreadAndroid.onExtraCallback(viewFindViewById3, varyMatches.onNavigationEvent(Float.valueOf(24.0f), displayMetrics), 0L, 0L, (Interpolator) null, (Function1) null, (Function1) null, 62, (Object) null);
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i = 0;
        char[] cArr = (char[]) objArr[1];
        int i2 = 2 % 2;
        int i3 = IEngagementSignalsCallback + 27;
        ICustomTabsServiceStubProxy = i3 % 128;
        int i4 = i3 % 2;
        int length = cArr.length;
        int i5 = 0;
        while (i < length) {
            int i6 = ICustomTabsServiceStubProxy;
            int i7 = i6 + 101;
            IEngagementSignalsCallback = i7 % 128;
            if (i7 % 2 == 0) {
                if (cArr[i] == 8933) {
                    return Integer.valueOf(i5);
                }
                i++;
                i5++;
                int i8 = i6 + 19;
                IEngagementSignalsCallback = i8 % 128;
                int i9 = i8 % 2;
            } else {
                if (cArr[i] == 9679) {
                    return Integer.valueOf(i5);
                }
                i++;
                i5++;
                int i82 = i6 + 19;
                IEngagementSignalsCallback = i82 % 128;
                int i92 = i82 % 2;
            }
        }
        return 5;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Password4D1AFragment password4D1AFragment, SetDetectableSize setDetectableSize) {
        int iOnExtraCallback = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        int iOnExtraCallback2 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        int iOnExtraCallback3 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        return (Unit) onWarmupCompleted(2041099297, -2041099291, iOnExtraCallback2, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), new Object[]{password4D1AFragment, setDetectableSize}, iOnExtraCallback, iOnExtraCallback3);
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Password4D1AFragment password4D1AFragment, ValueAnimator valueAnimator) {
        int iOnExtraCallback = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        int iOnExtraCallback2 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        int iOnExtraCallback3 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        onWarmupCompleted(1258242986, -1258242977, iOnExtraCallback2, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), new Object[]{password4D1AFragment, valueAnimator}, iOnExtraCallback, iOnExtraCallback3);
    }

    public static /* synthetic */ void onExtraCallback(Password4D1AFragment password4D1AFragment, View view) {
        int iOnExtraCallback = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        int iOnExtraCallback2 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        int iOnExtraCallback3 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        onWarmupCompleted(-1099496193, 1099496200, iOnExtraCallback2, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), new Object[]{password4D1AFragment, view}, iOnExtraCallback, iOnExtraCallback3);
    }

    public static /* synthetic */ void onWarmupCompleted(Password4D1AFragment password4D1AFragment, View view) {
        int iOnExtraCallback = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        int iOnExtraCallback2 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        int iOnExtraCallback3 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        onWarmupCompleted(314291983, -314291980, iOnExtraCallback2, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), new Object[]{password4D1AFragment, view}, iOnExtraCallback, iOnExtraCallback3);
    }

    public static /* synthetic */ Unit onNavigationEvent(Throwable th) {
        int iOnExtraCallback = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        int iOnExtraCallback2 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        int iOnExtraCallback3 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        return (Unit) onWarmupCompleted(1422191327, -1422191319, iOnExtraCallback2, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), new Object[]{th}, iOnExtraCallback, iOnExtraCallback3);
    }

    private final int onExtraCallbackWithResult(char[] cArr) {
        int iOnExtraCallback = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        int iOnExtraCallback2 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        int iOnExtraCallback3 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        return ((Integer) onWarmupCompleted(-156355346, 156355348, iOnExtraCallback2, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), new Object[]{this, cArr}, iOnExtraCallback, iOnExtraCallback3)).intValue();
    }

    private final void prefetchWithMultipleUrls() {
        int iOnExtraCallback = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        int iOnExtraCallback2 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        int iOnExtraCallback3 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        onWarmupCompleted(-670321045, 670321045, iOnExtraCallback2, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), new Object[]{this}, iOnExtraCallback, iOnExtraCallback3);
    }

    private static final Unit onExtraCallback(Password4D1AFragment password4D1AFragment, SetDetectableSize setDetectableSize) {
        int iOnExtraCallback = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        int iOnExtraCallback2 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        int iOnExtraCallback3 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        return (Unit) onWarmupCompleted(-228878750, 228878754, iOnExtraCallback2, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), new Object[]{password4D1AFragment, setDetectableSize}, iOnExtraCallback, iOnExtraCallback3);
    }

    private static final Unit onWarmupCompleted(Password4D1AFragment password4D1AFragment, int i, View view) {
        Object[] objArr = {password4D1AFragment, Integer.valueOf(i), view};
        int iOnExtraCallback = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        return (Unit) onWarmupCompleted(-1717088188, 1717088189, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), objArr, iOnExtraCallback, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback());
    }

    private static final Unit onNavigationEvent(Password4D1AFragment password4D1AFragment, SetDetectableSize setDetectableSize) {
        int iOnExtraCallback = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        int iOnExtraCallback2 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        int iOnExtraCallback3 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        return (Unit) onWarmupCompleted(487741544, -487741539, iOnExtraCallback2, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), new Object[]{password4D1AFragment, setDetectableSize}, iOnExtraCallback, iOnExtraCallback3);
    }

    static void IAuthTabCallback_Parcel() {
        access200 = new char[]{56985, 43128, 13132, 47671, 1308, 36062, 6133, 40649, 27059, 61585, 31331, 50528, 19548, 60851, 39767, 'l', 35119, 13858, 49114, 9413, 44522, 23220, 50083, 18779, 63045, 32619, 58389, 27954, 6858, 33692, 2235, 45492, 16047, 42049, 11557, 55908, 17169, 51255, 29137, 65191, 26595, 60565, 38321, 841, 34938, 12603, 48647, 10028, 44239, 21984, 49817, 19423, 61581, 32321, 59233, 27677, 5380, 33337, 3049, 45300, 14748, 42653, 12220, 54623, 16957, 54741, 60826, 60919, 39686, '(', 35158, 13948, 49050, 9344, 44462, 23252, 25781, 60836, 39771, 'v', 35129, 13881, 49119, 9433, 44538, 2248, 32313, 58628, 27762, 54109, 23222, 49583, 18575, 49148, 9952, 44088, 4910, 39445, 367, 34898, 65463, 26262, 60803, 21740, 56264, 16677, 196, 30261, 60695, 25714, 56139, 21154, 51618, 16551, 47094, 11997, 42046, 6965, 35839, 64782, 26149, 61275, 20586, 55693, 17062, 52131, 15556, 42495, 12045, 36890, 60832, 39771, 'l', 35082, 13865, 49849, 46174, 12130, 42508, 6455, 37066, 3017, 33507, 30084, 60580, 26191, 32646, 2403, 37441, 6961, 42012, 11723, 46839, 16334, 60861, 39772, '~', 35082, 13859, 49117, 9455, 44522, 23197, 50098, 18765, 60853, 39750, 'l', 35075, 13857, 49114, 9412, 44481, 23175, 50092, 18780, 60854, 39771, 'w', 35129, 13869, 49119, 9412, 44534, 23227, 50107, 18758, 37744, 58781, 32433, 63487, 18667, 49433, 23042, 54064, 9341, 48487, 14214, 34965, 441, 39639, 5081, 25617, 64796, 34280, 62237, 26668, 57682, 24179, 55196, 19637, 50605, 13018, 39648, 60480, 30579, 65034, 16657, 51409, 21468, 60849, 39754, 'l', 35092, 13869, 49141, 9433, 44528, 23170, 50093, 60832, 39744, 'y', 35080, 13887, 49094, 9425, 44522, 23181, 50093, 18758, 63086, 64084, 36003, 6043, 40677, 8651, 43061, 13106, 47626, 7655, 27401, 61490, 31056, 50813, 20368, 12474, 18001, 56690, 21529, 60834, 39771, '}', 35089, 16943, 13535, 45026, 9880, 39341, 4161, 35677, 585, 62725, 27694, 51978, 48596, 9976, 44929, 4351, 39248, 590, 35709, 31771, 58676, 28630, 53440, 23009, 49821, 19443, 15454, 42310, 11885, 38663, 6199, 33502, 3066, 64744, 26061, 61105, 22339, 55412, 16744, 51791, 45881, 9682, 44783, 6114, 39055, 447, 35349, 29534, 58394, 27927, 54820, 22721, 49656, 19087, 13212, 42223, 11590, 38497, 8029, 32801, 2355, 62410, 25842, 60818, 22204, 57261, 16473, 60916, 60836, 39744, '}', 35088, 13855, 49097, 9410, 44539, 23169, 50092, 18790, 63063, 32625, 58399, 58464, 37531, 2493, 32965, 16380, 46596, 11522, 42016, 21336, 51811, 16536, 65417, 30388, 24895, 60916, 39771, 'k', 35142, 13858, 49093, 9412, 44478, 23191, 50103, 18776, 63046, 32627, 58376, 27956, 6859, 33744, 3477, 39798};
        writeTypedList = -4102523174959080654L;
    }
}
