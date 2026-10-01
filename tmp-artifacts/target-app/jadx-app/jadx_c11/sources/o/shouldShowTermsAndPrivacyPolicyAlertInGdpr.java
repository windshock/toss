package o;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.iap.android.mppclient.container.constant.JsParamKeys;
import im.toss.securities.core.router.spec.TossSecRoute;
import im.toss.tosssecurities.auth.domain.model.SecuritiesMemberState;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.deprecated_address;
import o.shouldShowTermsAndPrivacyPolicyAlertInGdpr;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class shouldShowTermsAndPrivacyPolicyAlertInGdpr {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final Lazy IAuthTabCallback;
    private static final String IAuthTabCallbackDefault;
    private static final Function2<String, String, String> IAuthTabCallbackStub;
    private static final String IAuthTabCallbackStubProxy;
    private static final String IAuthTabCallback_Parcel;
    private static final String ICustomTabsCallback;
    private static long ICustomTabsCallbackDefault = 0;
    private static int ICustomTabsCallbackStub = 0;
    private static final String ICustomTabsCallbackStubProxy;
    private static final String access000;
    private static final String access100;
    private static final String asBinder;
    private static final Lazy asInterface;
    private static final String extraCallback;
    private static final String extraCallbackWithResult;
    private static final String getInterfaceDescriptor;
    private static int mayLaunchUrl = 1;
    private static final String onActivityLayout;
    private static final String onActivityResized;
    private static final String onExtraCallback;
    public static final shouldShowTermsAndPrivacyPolicyAlertInGdpr onExtraCallbackWithResult;
    private static final String onMessageChannelReady;
    private static final String onMinimized;
    private static final String onNavigationEvent;
    private static final String onPostMessage;
    private static int onRelationshipValidationResult = 1;
    private static final Function1<String, String> onTransact;
    private static int onUnminimized;
    private static final String onWarmupCompleted;
    private static final String readTypedObject;
    private static final String writeTypedObject;

    public static /* synthetic */ String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onUnminimized + 61;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = JsParamKeys.onExtraCallbackWithResult();
        String str = (String) onExtraCallback(iOnExtraCallbackWithResult2, JsParamKeys.onExtraCallbackWithResult(), -724518909, 724518916, iOnExtraCallbackWithResult3, new Object[0], iOnExtraCallbackWithResult);
        int i4 = onRelationshipValidationResult + 95;
        onUnminimized = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~((~i6) | i3 | i4);
        int i8 = i6 | i3 | i4;
        int i9 = (~((~i3) | (~i4))) | i7;
        int i10 = i3 + i4 + i + (1512347918 * i5) + (2033855975 * i2);
        int i11 = i10 * i10;
        int i12 = ((i3 * 1295388527) - 26148864) + (1295388527 * i4) + (2139102940 * i7) + (i8 * 1077932178) + (1077932178 * i9) + ((-1921646592) * i) + (1114898432 * i5) + (1668939776 * i2) + (346619904 * i11);
        int i13 = ((i3 * 1848112433) - 751391395) + (i4 * 1848112433) + (i7 * (-92)) + (i8 * 46) + (i9 * 46) + (i * 1848112479) + (i5 * (-818859470)) + (i2 * (-357164103)) + (i11 * 1740046336);
        switch (i12 + (i13 * i13 * 1721171968)) {
            case 1:
                int i14 = 2 % 2;
                int i15 = onUnminimized;
                int i16 = i15 + 53;
                onRelationshipValidationResult = i16 % 128;
                int i17 = i16 % 2;
                String str = onMinimized;
                int i18 = i15 + 107;
                onRelationshipValidationResult = i18 % 128;
                int i19 = i18 % 2;
                return str;
            case 2:
                return onNavigationEvent(objArr);
            case 3:
                return onExtraCallbackWithResult(objArr);
            case 4:
                int i20 = 2 % 2;
                int i21 = onUnminimized + 87;
                int i22 = i21 % 128;
                onRelationshipValidationResult = i22;
                int i23 = i21 % 2;
                String str2 = getInterfaceDescriptor;
                int i24 = i22 + 25;
                onUnminimized = i24 % 128;
                int i25 = i24 % 2;
                return str2;
            case 5:
                shouldShowTermsAndPrivacyPolicyAlertInGdpr shouldshowtermsandprivacypolicyalertingdpr = (shouldShowTermsAndPrivacyPolicyAlertInGdpr) objArr[0];
                String str3 = (String) objArr[1];
                String str4 = (String) objArr[2];
                int iIntValue = ((Number) objArr[3]).intValue();
                Object obj = objArr[4];
                int i26 = 2 % 2;
                int i27 = onRelationshipValidationResult + 23;
                int i28 = i27 % 128;
                onUnminimized = i28;
                if (i27 % 2 == 0 ? (iIntValue & 1) != 0 : (iIntValue & 1) != 0) {
                    str3 = null;
                }
                if ((iIntValue & 2) != 0) {
                    int i29 = i28 + 51;
                    onRelationshipValidationResult = i29 % 128;
                    if (i29 % 2 == 0) {
                        int i30 = 4 / 5;
                    }
                    str4 = "navigate";
                }
                return shouldshowtermsandprivacypolicyalertingdpr.onWarmupCompleted(str3, str4);
            case 6:
                return onExtraCallback(objArr);
            case 7:
                return onWarmupCompleted(objArr);
            case 8:
                return asBinder(objArr);
            default:
                return IAuthTabCallback(objArr);
        }
    }

    public static /* synthetic */ String onExtraCallback(String str) {
        int i = 2 % 2;
        int i2 = onUnminimized + 37;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        String strAsInterface = asInterface(str);
        int i4 = onRelationshipValidationResult + 9;
        onUnminimized = i4 % 128;
        int i5 = i4 % 2;
        return strAsInterface;
    }

    public static /* synthetic */ deprecated_address onExtraCallback() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 25;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        deprecated_address deprecated_addressVarOnActivityResized = onActivityResized();
        if (i3 != 0) {
            int i4 = 12 / 0;
        }
        return deprecated_addressVarOnActivityResized;
    }

    public static /* synthetic */ String onNavigationEvent(String str, String str2) {
        int i = 2 % 2;
        int i2 = onUnminimized + 57;
        onRelationshipValidationResult = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback(str, str2);
        }
        onExtraCallback(str, str2);
        throw null;
    }

    private shouldShowTermsAndPrivacyPolicyAlertInGdpr() {
    }

    public static final /* synthetic */ String onExtraCallbackWithResult(shouldShowTermsAndPrivacyPolicyAlertInGdpr shouldshowtermsandprivacypolicyalertingdpr, String str, Pair... pairArr) {
        int i = 2 % 2;
        int i2 = onUnminimized + 99;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        String strOnExtraCallbackWithResult = shouldshowtermsandprivacypolicyalertingdpr.onExtraCallbackWithResult(str, (Pair<String, ? extends Object>[]) pairArr);
        int i4 = onUnminimized + 125;
        onRelationshipValidationResult = i4 % 128;
        int i5 = i4 % 2;
        return strOnExtraCallbackWithResult;
    }

    static {
        extraCallback();
        shouldShowTermsAndPrivacyPolicyAlertInGdpr shouldshowtermsandprivacypolicyalertingdpr = new shouldShowTermsAndPrivacyPolicyAlertInGdpr();
        onExtraCallbackWithResult = shouldshowtermsandprivacypolicyalertingdpr;
        onWarmupCompleted = StandardCharsets.UTF_8.name();
        asInterface = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.securities.core.router.spec.SecuritiesSchemes$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            public static int onExtraCallbackWithResult;
            public static int onNavigationEvent;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 71;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    shouldShowTermsAndPrivacyPolicyAlertInGdpr.onExtraCallback();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                deprecated_address deprecated_addressVarOnExtraCallback = shouldShowTermsAndPrivacyPolicyAlertInGdpr.onExtraCallback();
                int i3 = onWarmupCompleted + 79;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                return deprecated_addressVarOnExtraCallback;
            }

            public static int onNavigationEvent() {
                int i = onNavigationEvent;
                int i2 = i % 8377518;
                onNavigationEvent = i + 1;
                if (i2 != 0) {
                    return onExtraCallbackWithResult;
                }
                int streamMaxVolume = ((AudioManager) ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getSystemService("audio")).getStreamMaxVolume(3);
                onExtraCallbackWithResult = streamMaxVolume;
                return streamMaxVolume;
            }
        });
        IAuthTabCallbackStubProxy = TossSecRoute.Main.PATH;
        access000 = "/events/native-onboarding/features";
        access100 = shouldshowtermsandprivacypolicyalertingdpr.onExtraCallbackWithResult("/common/guide/high-contrast-mode", getWrite.IAuthTabCallback("_type", "mts"));
        extraCallback = "/options/apply-realtime";
        Object[] objArr = new Object[1];
        a(new char[]{15423, 37590, 25033, 12536, 34800, 22180, 9670, 62667, 19340, 6847, 59829, 47264, 3908, 56916, 44357, 31778, 54131, 41597, 28958, 49163, 38749, 26151, 13620, 33915, 23241, 10715, 63684, 20399, 7848, 60832, 48337, 5069, 58056, 45476, 175, 55111, 42574, 29955, 50232, 39732, 27193, 14618, 34820, 24343, 11822, 64891, 19552}, 44788 - TextUtils.lastIndexOf("", '0', 0), objArr);
        onNavigationEvent = ((String) objArr[0]).intern();
        onMinimized = "/search";
        extraCallbackWithResult = "/all-tab";
        onPostMessage = shouldshowtermsandprivacypolicyalertingdpr.onExtraCallbackWithResult("/calendar", getWrite.IAuthTabCallback("_type", "mts"));
        onMessageChannelReady = "/home/major-indices";
        onActivityResized = shouldshowtermsandprivacypolicyalertingdpr.onExtraCallbackWithResult("/user/investor-propensity/intro", getWrite.IAuthTabCallback("_type", "mts"));
        readTypedObject = shouldshowtermsandprivacypolicyalertingdpr.access100("/common/auth/");
        ICustomTabsCallbackStubProxy = "/exchange-rate";
        ICustomTabsCallback = "/settings";
        writeTypedObject = "/settings/ats";
        asBinder = "/common/customer-center";
        getInterfaceDescriptor = "/watchlist/edit";
        IAuthTabCallback_Parcel = "/watchlist/edit";
        onActivityLayout = "/bonds";
        IAuthTabCallbackDefault = "/common/invest-guide";
        onTransact = new Function1() { // from class: im.toss.securities.core.router.spec.SecuritiesSchemes$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 59;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                String strOnExtraCallback = shouldShowTermsAndPrivacyPolicyAlertInGdpr.onExtraCallback((String) obj);
                int i4 = IAuthTabCallback + 11;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    return strOnExtraCallback;
                }
                throw null;
            }
        };
        IAuthTabCallbackStub = new Function2() { // from class: im.toss.securities.core.router.spec.SecuritiesSchemes$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 59;
                IAuthTabCallback = i2 % 128;
                String str = (String) obj;
                String str2 = (String) obj2;
                if (i2 % 2 != 0) {
                    return shouldShowTermsAndPrivacyPolicyAlertInGdpr.onNavigationEvent(str, str2);
                }
                String strOnNavigationEvent = shouldShowTermsAndPrivacyPolicyAlertInGdpr.onNavigationEvent(str, str2);
                int i3 = 84 / 0;
                return strOnNavigationEvent;
            }
        };
        onExtraCallback = "/community/profile/new";
        IAuthTabCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.securities.core.router.spec.SecuritiesSchemes$$ExternalSyntheticLambda3
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 73;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                String strIAuthTabCallback = shouldShowTermsAndPrivacyPolicyAlertInGdpr.IAuthTabCallback();
                int i4 = onWarmupCompleted + 67;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return strIAuthTabCallback;
                }
                throw null;
            }
        });
        int i = ICustomTabsCallbackStub + 61;
        mayLaunchUrl = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private final deprecated_address onActivityLayout() {
        int i = 2 % 2;
        int i2 = onUnminimized + 65;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        deprecated_address deprecated_addressVar = (deprecated_address) asInterface.getValue();
        int i4 = onRelationshipValidationResult + 37;
        onUnminimized = i4 % 128;
        int i5 = i4 % 2;
        return deprecated_addressVar;
    }

    private static final deprecated_address onActivityResized() {
        int i = 2 % 2;
        int i2 = onUnminimized + 3;
        onRelationshipValidationResult = i2 % 128;
        if (i2 % 2 == 0) {
            Response response = Response.onNavigationEvent;
            int i3 = 0 / 0;
            return ((deprecated_address.onWarmupCompleted) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), Class.forName("o.deprecated_address$onWarmupCompleted"))).show();
        }
        Response response2 = Response.onNavigationEvent;
        return ((deprecated_address.onWarmupCompleted) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), Class.forName("o.deprecated_address$onWarmupCompleted"))).show();
    }

    public final String asInterface() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 41;
        int i3 = i2 % 128;
        onUnminimized = i3;
        int i4 = i2 % 2;
        String str = access100;
        int i5 = i3 + 9;
        onRelationshipValidationResult = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult;
        int i3 = i2 + 71;
        onUnminimized = i3 % 128;
        int i4 = i3 % 2;
        String str = extraCallback;
        int i5 = i2 + 79;
        onUnminimized = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 41 / 0;
        }
        return str;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 123;
        onUnminimized = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x019d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        Object obj;
        Throwable cause;
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (true) {
            obj = null;
            if (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback >= cArr.length) {
                break;
            }
            int i3 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (KeyEvent.getMaxKeyCode() >> 16) + 24, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 19626, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (ICustomTabsCallbackDefault ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), TextUtils.getCapsMode("", 0, 0) + 59, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 6382, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i4 = $10 + 39;
                $11 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 5 / 5;
                }
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i6 = $10 + 9;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                try {
                    Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), Drawable.resolveOpacity(0, 0) + 59, 6383 - KeyEvent.normalizeMetaState(0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    obj.hashCode();
                    throw null;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetBefore("", 0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 59, 6382 - ExpandableListView.getPackedPositionChild(0L), -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2);
    }

    public final String IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = onUnminimized + 103;
        int i3 = i2 % 128;
        onRelationshipValidationResult = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = extraCallbackWithResult;
        int i4 = i3 + 53;
        onUnminimized = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String access000() {
        int i = 2 % 2;
        int i2 = onUnminimized;
        int i3 = i2 + 89;
        onRelationshipValidationResult = i3 % 128;
        int i4 = i3 % 2;
        String str = onPostMessage;
        int i5 = i2 + 91;
        onRelationshipValidationResult = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String IAuthTabCallbackStubProxy() {
        String str;
        int i = 2 % 2;
        int i2 = onUnminimized + 47;
        int i3 = i2 % 128;
        onRelationshipValidationResult = i3;
        if (i2 % 2 == 0) {
            str = onMessageChannelReady;
            int i4 = 56 / 0;
        } else {
            str = onMessageChannelReady;
        }
        int i5 = i3 + 103;
        onUnminimized = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String IAuthTabCallbackStub(@Nullable String str) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 31;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        String strOnExtraCallbackWithResult = onExtraCallbackWithResult("/home/asset-dashboard/edit", getWrite.IAuthTabCallback("temporaryAccountKey", str));
        int i4 = onRelationshipValidationResult + 41;
        onUnminimized = i4 % 128;
        if (i4 % 2 == 0) {
            return strOnExtraCallbackWithResult;
        }
        throw null;
    }

    public final String ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 83;
        int i3 = i2 % 128;
        onUnminimized = i3;
        int i4 = i2 % 2;
        String str = onActivityResized;
        int i5 = i3 + 35;
        onRelationshipValidationResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 25 / 0;
        }
        return str;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onUnminimized;
        int i3 = i2 + 53;
        onRelationshipValidationResult = i3 % 128;
        int i4 = i3 % 2;
        String str = readTypedObject;
        int i5 = i2 + 65;
        onRelationshipValidationResult = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String readTypedObject() {
        int i = 2 % 2;
        int i2 = onUnminimized;
        int i3 = i2 + 71;
        onRelationshipValidationResult = i3 % 128;
        int i4 = i3 % 2;
        String str = ICustomTabsCallbackStubProxy;
        int i5 = i2 + 87;
        onRelationshipValidationResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onExtraCallbackWithResult(long j) {
        int i = 2 % 2;
        int i2 = onUnminimized + 1;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        String strOnExtraCallbackWithResult = setPrivacyPolicyUri.onExtraCallbackWithResult("/watchlist/table-view", "selectedGroupId", String.valueOf(j));
        int i4 = onRelationshipValidationResult + 13;
        onUnminimized = i4 % 128;
        int i5 = i4 % 2;
        return strOnExtraCallbackWithResult;
    }

    public static final class onWarmupCompleted {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        public static final onWarmupCompleted onNavigationEvent = new onWarmupCompleted();
        private static int onWarmupCompleted = 1;

        static {
            int i = onWarmupCompleted + 57;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class onNavigationEvent {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ onNavigationEvent[] $VALUES;
            public static final onNavigationEvent CONTENTS;
            public static final onNavigationEvent ETC;
            public static final onNavigationEvent LOUNGES;
            public static final onNavigationEvent NEWS;
            public static final onNavigationEvent OPTIONS;
            public static final onNavigationEvent STOCKS;
            private static int onExtraCallback;
            private static int onExtraCallbackWithResult;
            private final String value;
            private static final byte[] $$a = {79, 7, -80, -125};
            private static final int $$b = 244;
            private static int $10 = 0;
            private static int $11 = 1;
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static String $$c(short s, int i, byte b) {
                int i2;
                byte[] bArr = $$a;
                int i3 = i * 2;
                int i4 = (b * 2) + 105;
                int i5 = 4 - (s * 3);
                byte[] bArr2 = new byte[i3 + 1];
                if (bArr == null) {
                    int i6 = i4;
                    int i7 = 0;
                    i4 = i3;
                    i5++;
                    i4 += i6;
                    i2 = i7;
                    bArr2[i2] = (byte) i4;
                    i7 = i2 + 1;
                    if (i2 == i3) {
                        return new String(bArr2, 0);
                    }
                    i6 = bArr[i5];
                    i5++;
                    i4 += i6;
                    i2 = i7;
                    bArr2[i2] = (byte) i4;
                    i7 = i2 + 1;
                    if (i2 == i3) {
                    }
                } else {
                    i2 = 0;
                    bArr2[i2] = (byte) i4;
                    i7 = i2 + 1;
                    if (i2 == i3) {
                    }
                }
            }

            private static final /* synthetic */ onNavigationEvent[] $values() {
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int i3 = i2 + 17;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                onNavigationEvent[] onnavigationeventArr = {STOCKS, NEWS, CONTENTS, LOUNGES, ETC, OPTIONS};
                int i5 = i2 + 101;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return onnavigationeventArr;
            }

            public static EnumEntries<onNavigationEvent> getEntries() {
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int i3 = i2 + 9;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                EnumEntries<onNavigationEvent> enumEntries = $ENTRIES;
                int i5 = i2 + 65;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return enumEntries;
            }

            public static onNavigationEvent valueOf(String str) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 27;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                onNavigationEvent onnavigationevent = (onNavigationEvent) Enum.valueOf(onNavigationEvent.class, str);
                if (i3 == 0) {
                    return onnavigationevent;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static onNavigationEvent[] values() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 21;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                onNavigationEvent[] onnavigationeventArr = $VALUES;
                if (i3 == 0) {
                    return (onNavigationEvent[]) onnavigationeventArr.clone();
                }
                throw null;
            }

            /* JADX WARN: Removed duplicated region for block: B:33:0x0168  */
            /* JADX WARN: Removed duplicated region for block: B:34:0x0169  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
                int i4;
                Throwable cause;
                int i5 = 2 % 2;
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
                char[] cArr2 = new char[i];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
                while (true) {
                    i4 = 2083011369;
                    if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                        break;
                    }
                    int i6 = $10 + 3;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
                    cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
                    int i8 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(onExtraCallback)};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (MotionEvent.axisFromString("") + 35126), (-16777193) - Color.rgb(0, 0, 0), 10279 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                        if (objOnExtraCallback2 == null) {
                            byte b = (byte) 0;
                            byte b2 = b;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), Process.getGidForName("") + 56, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2167, 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback2).invoke(null, objArr3);
                    } catch (Throwable th) {
                        cause = th.getCause();
                        if (cause != null) {
                        }
                    }
                    cause = th.getCause();
                    if (cause != null) {
                        throw th;
                    }
                    throw cause;
                }
                if (i2 > 0) {
                    int i9 = $10 + 123;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
                    char[] cArr3 = new char[i];
                    System.arraycopy(cArr2, 0, cArr3, 0, i);
                    System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
                    System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
                }
                if (z) {
                    int i11 = $10 + 35;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    char[] cArr4 = new char[i];
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
                    while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                        cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                        Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                        if (objOnExtraCallback3 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.argb(0, 0, 0, 0) + 12843), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 55, 2168 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        i4 = 2083011369;
                    }
                    cArr2 = cArr4;
                }
                objArr[0] = new String(cArr2);
            }

            private onNavigationEvent(String str, int i, String str2) {
                this.value = str2;
            }

            public final String getValue() {
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int i3 = i2 + 25;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                String str = this.value;
                int i5 = i2 + 11;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }

            static {
                onExtraCallbackWithResult = 1;
                onExtraCallback();
                STOCKS = new onNavigationEvent("STOCKS", 0, "stocks");
                NEWS = new onNavigationEvent("NEWS", 1, "news");
                CONTENTS = new onNavigationEvent("CONTENTS", 2, "contents");
                LOUNGES = new onNavigationEvent("LOUNGES", 3, "lounges");
                ETC = new onNavigationEvent("ETC", 4, "etc");
                Object[] objArr = new Object[1];
                a((ViewConfiguration.getScrollBarSize() >> 8) + 7, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 5, new char[]{5, 65530, 0, 65535, 4, 0, 1}, false, 204 - Color.argb(0, 0, 0, 0), objArr);
                OPTIONS = new onNavigationEvent("OPTIONS", 5, ((String) objArr[0]).intern());
                onNavigationEvent[] onnavigationeventArr$values = $values();
                $VALUES = onnavigationeventArr$values;
                $ENTRIES = access15300.onExtraCallbackWithResult(onnavigationeventArr$values);
                int i = IAuthTabCallback + 113;
                onExtraCallbackWithResult = i % 128;
                int i2 = i % 2;
            }

            static void onExtraCallback() {
                onExtraCallback = 478308980;
            }
        }

        private onWarmupCompleted() {
        }

        public final String onWarmupCompleted(@NotNull onNavigationEvent onnavigationevent, @NotNull String str) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            Intrinsics.checkNotNullParameter(str, "");
            String str2 = "/community/" + onnavigationevent.getValue() + TossSecRoute.Main.PATH + str + "/comments";
            int i2 = onExtraCallback + 37;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return str2;
            }
            throw null;
        }

        public static /* synthetic */ String onWarmupCompleted(onWarmupCompleted onwarmupcompleted, String str, String str2, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback;
            int i4 = i3 + 17;
            onExtraCallbackWithResult = i4 % 128;
            Object obj2 = null;
            if (i4 % 2 == 0 ? (i & 2) != 0 : (i & 4) != 0) {
                int i5 = i3 + 115;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    obj2.hashCode();
                    throw null;
                }
                str2 = "RECENT";
            }
            String strIAuthTabCallback = onwarmupcompleted.IAuthTabCallback(str, str2);
            int i6 = onExtraCallbackWithResult + 81;
            onExtraCallback = i6 % 128;
            if (i6 % 2 != 0) {
                return strIAuthTabCallback;
            }
            throw null;
        }

        public final String IAuthTabCallback(@NotNull String str, @NotNull String str2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 101;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            String string = Uri.parse(onWarmupCompleted(onNavigationEvent.LOUNGES, str)).buildUpon().appendQueryParameter("sort-type", str2).build().toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            int i4 = onExtraCallbackWithResult + 121;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return string;
            }
            throw null;
        }

        public final String onExtraCallback(@NotNull String str) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            String string = Uri.parse("/community/comments/" + str).buildUpon().appendQueryParameter("_type", "mts").build().toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            int i2 = onExtraCallbackWithResult + 111;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return string;
        }
    }

    public final String onWarmupCompleted(@Nullable Long l) {
        String strValueOf;
        int i = 2 % 2;
        Uri.Builder builderPath = new Uri.Builder().path(getInterfaceDescriptor);
        Intrinsics.checkNotNullExpressionValue(builderPath, "");
        if (l != null) {
            int i2 = onUnminimized + 39;
            onRelationshipValidationResult = i2 % 128;
            int i3 = i2 % 2;
            strValueOf = String.valueOf(l.longValue());
        } else {
            int i4 = onRelationshipValidationResult + 5;
            onUnminimized = i4 % 128;
            int i5 = i4 % 2;
            strValueOf = null;
        }
        String string = setPrivacyPolicyUri.onWarmupCompleted(builderPath, "selectedId", strValueOf).build().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final String onWarmupCompleted(@Nullable String str, @Nullable String str2) {
        int i = 2 % 2;
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().path("watchlist/create").appendQueryParameter("status", "add");
        Intrinsics.checkNotNullExpressionValue(builderAppendQueryParameter, "");
        String string = setPrivacyPolicyUri.onWarmupCompleted(setPrivacyPolicyUri.onWarmupCompleted(builderAppendQueryParameter, "afterCreate", str2), "productCodesToAdd", str).build().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        int i2 = onRelationshipValidationResult + 123;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    public final String IAuthTabCallback(long j) {
        int i = 2 % 2;
        String str = "/watchlist/add/" + j;
        int i2 = onRelationshipValidationResult + 29;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        ((Number) objArr[1]).longValue();
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 61;
        onUnminimized = i2 % 128;
        if (i2 % 2 == 0) {
            return getInterfaceDescriptor;
        }
        throw null;
    }

    public static /* synthetic */ String IAuthTabCallback(shouldShowTermsAndPrivacyPolicyAlertInGdpr shouldshowtermsandprivacypolicyalertingdpr, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onUnminimized;
        int i4 = i3 + 101;
        onRelationshipValidationResult = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 55;
            onRelationshipValidationResult = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 4 % 2;
            }
            str = null;
        }
        return shouldshowtermsandprivacypolicyalertingdpr.IAuthTabCallback(str);
    }

    public final String IAuthTabCallback(@Nullable String str) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 19;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        Pair<String, ? extends Object> pairIAuthTabCallback = getWrite.IAuthTabCallback("agreementTitle", str);
        if (i3 == 0) {
            return onExtraCallbackWithResult("/accounts/open", pairIAuthTabCallback, getWrite.IAuthTabCallback("_type", "mts"));
        }
        Pair<String, ? extends Object> pairIAuthTabCallback2 = getWrite.IAuthTabCallback("_type", "mts");
        Pair<String, ? extends Object>[] pairArr = new Pair[2];
        pairArr[0] = pairIAuthTabCallback;
        pairArr[0] = pairIAuthTabCallback2;
        return onExtraCallbackWithResult("/accounts/open", pairArr);
    }

    public final String onNavigationEvent(@Nullable String str) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 109;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        String strOnExtraCallbackWithResult = onExtraCallbackWithResult("/accounts/open/funnel", getWrite.IAuthTabCallback("accountType", "01"), getWrite.IAuthTabCallback("agreementTitle", str), getWrite.IAuthTabCallback("_type", "mts"));
        int i4 = onUnminimized + 121;
        onRelationshipValidationResult = i4 % 128;
        int i5 = i4 % 2;
        return strOnExtraCallbackWithResult;
    }

    public final String onWarmupCompleted(@Nullable String str) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 73;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        String strOnExtraCallbackWithResult = onExtraCallbackWithResult("/dashboard", getWrite.IAuthTabCallback("temporaryAccountKey", str));
        int i4 = onRelationshipValidationResult + 1;
        onUnminimized = i4 % 128;
        int i5 = i4 % 2;
        return strOnExtraCallbackWithResult;
    }

    public final String writeTypedObject() {
        int i = 2 % 2;
        int i2 = onUnminimized + 93;
        onRelationshipValidationResult = i2 % 128;
        if (i2 % 2 != 0) {
            return onActivityLayout;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String IAuthTabCallbackDefault(@NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        String str2 = "/bonds/" + str;
        int i2 = onRelationshipValidationResult + 89;
        onUnminimized = i2 % 128;
        if (i2 % 2 == 0) {
            return str2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onTransact(@NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        String str2 = "/options/" + str;
        int i2 = onRelationshipValidationResult + 43;
        onUnminimized = i2 % 128;
        if (i2 % 2 == 0) {
            return str2;
        }
        throw null;
    }

    public final String onExtraCallbackWithResult(@NotNull String str, @Nullable String str2) {
        String str3;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        String str4 = "/tics/" + str;
        Pair<String, ? extends Object> pairIAuthTabCallback = getWrite.IAuthTabCallback("market", str2);
        if (str2 != null) {
            int i2 = onRelationshipValidationResult + 113;
            int i3 = i2 % 128;
            onUnminimized = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 95;
            onRelationshipValidationResult = i5 % 128;
            int i6 = i5 % 2;
            str3 = "periodProfitRate";
        } else {
            str3 = null;
        }
        return onExtraCallbackWithResult(str4, pairIAuthTabCallback, getWrite.IAuthTabCallback("ranking", str3));
    }

    public static final class onNavigationEvent {
        private static int $10 = 0;
        private static int $11 = 1;
        public static final onNavigationEvent IAuthTabCallback;
        private static int asBinder = 0;
        private static char[] onExtraCallback = null;
        private static int onExtraCallbackWithResult = 0;
        private static char onNavigationEvent = 0;
        private static int onTransact = 1;
        private static int onWarmupCompleted = 1;

        static {
            onExtraCallbackWithResult();
            IAuthTabCallback = new onNavigationEvent();
            int i = onWarmupCompleted + 95;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
        }

        private onNavigationEvent() {
        }

        public static /* synthetic */ String onExtraCallback(onNavigationEvent onnavigationevent, String str, String str2, Boolean bool, int i, Object obj) {
            int i2 = 2 % 2;
            if ((i & 2) != 0) {
                int i3 = asBinder + 15;
                onTransact = i3 % 128;
                int i4 = i3 % 2;
                str2 = null;
            }
            if ((i & 4) != 0) {
                int i5 = asBinder + 19;
                onTransact = i5 % 128;
                int i6 = i5 % 2;
                bool = null;
            }
            return onnavigationevent.onWarmupCompleted(str, str2, bool);
        }

        public final String onWarmupCompleted(@Nullable String str, @Nullable String str2, @Nullable Boolean bool) {
            Object obj;
            int i = 2 % 2;
            shouldShowTermsAndPrivacyPolicyAlertInGdpr shouldshowtermsandprivacypolicyalertingdpr = shouldShowTermsAndPrivacyPolicyAlertInGdpr.onExtraCallbackWithResult;
            Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("temporaryAccountKey", str);
            Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("tab", str2);
            String str3 = "true";
            Object obj2 = null;
            if (str2 != null) {
                int i2 = asBinder + 121;
                onTransact = i2 % 128;
                if (i2 % 2 == 0) {
                    obj2.hashCode();
                    throw null;
                }
                obj = "true";
            } else {
                obj = null;
            }
            Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback("scrollToTab", obj);
            if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                int i3 = onTransact + 9;
                asBinder = i3 % 128;
                int i4 = i3 % 2;
            } else {
                str3 = null;
            }
            return shouldShowTermsAndPrivacyPolicyAlertInGdpr.onExtraCallbackWithResult(shouldshowtermsandprivacypolicyalertingdpr, "/home/asset-dashboard", pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, getWrite.IAuthTabCallback("hidden", str3));
        }

        public static /* synthetic */ String onExtraCallbackWithResult(onNavigationEvent onnavigationevent, String str, String str2, int i, Object obj) throws Throwable {
            int i2 = 2 % 2;
            int i3 = asBinder + 39;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            if ((i & 2) != 0) {
                Object[] objArr = new Object[1];
                a(new char[]{2, 3, 1, 0}, (byte) (Process.getGidForName("") + 6), (ViewConfiguration.getScrollBarSize() >> 8) + 4, objArr);
                str2 = ((String) objArr[0]).intern();
                int i5 = asBinder + 27;
                onTransact = i5 % 128;
                int i6 = i5 % 2;
            }
            return onnavigationevent.onExtraCallback(str, str2);
        }

        public final String onExtraCallback(@Nullable String str, @NotNull String str2) {
            int i = 2 % 2;
            int i2 = asBinder + 27;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(str2, "");
            String strOnExtraCallbackWithResult = shouldShowTermsAndPrivacyPolicyAlertInGdpr.onExtraCallbackWithResult(shouldShowTermsAndPrivacyPolicyAlertInGdpr.onExtraCallbackWithResult, "/create-folder", getWrite.IAuthTabCallback("temporaryAccountKey", str), getWrite.IAuthTabCallback("source", str2), getWrite.IAuthTabCallback("_type", "mts"));
            int i4 = onTransact + 101;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            return strOnExtraCallbackWithResult;
        }

        public static /* synthetic */ String IAuthTabCallback(onNavigationEvent onnavigationevent, String str, String str2, String str3, int i, Object obj) throws Throwable {
            Object obj2;
            int i2 = 2 % 2;
            int i3 = onTransact + 23;
            int i4 = i3 % 128;
            asBinder = i4;
            int i5 = i3 % 2;
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                int i6 = i4 + 5;
                onTransact = i6 % 128;
                if (i6 % 2 == 0) {
                    Object[] objArr = new Object[1];
                    a(new char[]{2, 3, 1, 0}, (byte) (96 >>> (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 4 >>> TextUtils.indexOf((CharSequence) "", 'o'), objArr);
                    obj2 = objArr[0];
                } else {
                    Object[] objArr2 = new Object[1];
                    a(new char[]{2, 3, 1, 0}, (byte) (6 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), TextUtils.indexOf((CharSequence) "", '0') + 5, objArr2);
                    obj2 = objArr2[0];
                }
                str3 = ((String) obj2).intern();
            }
            return onnavigationevent.onWarmupCompleted(str, str2, str3);
        }

        public final String onWarmupCompleted(@Nullable String str, @Nullable String str2, @NotNull String str3) {
            int i = 2 % 2;
            int i2 = onTransact + 13;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(str3, "");
            String strOnExtraCallbackWithResult = shouldShowTermsAndPrivacyPolicyAlertInGdpr.onExtraCallbackWithResult(shouldShowTermsAndPrivacyPolicyAlertInGdpr.onExtraCallbackWithResult, "/folder-settings", getWrite.IAuthTabCallback("scrollToFolder", str2), getWrite.IAuthTabCallback("temporaryAccountKey", str), getWrite.IAuthTabCallback("source", str3), getWrite.IAuthTabCallback("_type", "mts"));
            int i4 = onTransact + 11;
            asBinder = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 6 / 0;
            }
            return strOnExtraCallbackWithResult;
        }

        private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
            int i2;
            int i3 = 2;
            int i4 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
            char[] cArr2 = onExtraCallback;
            long j = 0;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i5 = 0;
                while (i5 < length) {
                    int i6 = $11 + 79;
                    $10 = i6 % 128;
                    if (i6 % i3 != 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                            if (objOnExtraCallback == null) {
                                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0') + 1), TextUtils.getOffsetAfter("", 0) + 26, ExpandableListView.getPackedPositionGroup(j) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                            }
                            cArr3[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                            i5 >>= 1;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        try {
                            Object[] objArr3 = {Integer.valueOf(cArr2[i5])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                            if (objOnExtraCallback2 == null) {
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 27 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (ViewConfiguration.getScrollBarSize() >> 8) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                            }
                            cArr3[i5] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                            i5++;
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    i3 = 2;
                    j = 0;
                }
                cArr2 = cArr3;
            }
            Object[] objArr4 = {Integer.valueOf(onNavigationEvent)};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 26 - Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 23138, -2137011959, false, "z", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                int i7 = $11 + 41;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    } else {
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24824 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), 74 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), ExpandableListView.getPackedPositionChild(0L) + 8089, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                            int i9 = $11 + 65;
                            $10 = i9 % 128;
                            int i10 = i9 % 2;
                            Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                            if (objOnExtraCallback5 == null) {
                                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 30 - (ViewConfiguration.getScrollBarSize() >> 8), 19489 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            int iIntValue = ((Integer) ((Method) objOnExtraCallback5).invoke(null, objArr6)).intValue();
                            int i11 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i11];
                        } else if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            int i12 = $11 + 77;
                            $10 = i12 % 128;
                            int i13 = i12 % 2;
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                            int i14 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i15 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i14];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i15];
                        } else {
                            int i16 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i17 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i16];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i17];
                        }
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                }
            }
            for (int i18 = 0; i18 < i; i18++) {
                cArr4[i18] = (char) (cArr4[i18] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        }

        static void onExtraCallbackWithResult() {
            onExtraCallback = new char[]{64990, 64982, 64988, 64987};
            onNavigationEvent = (char) 51243;
        }
    }

    public static /* synthetic */ String onExtraCallback(shouldShowTermsAndPrivacyPolicyAlertInGdpr shouldshowtermsandprivacypolicyalertingdpr, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onRelationshipValidationResult + 59;
        int i4 = i3 % 128;
        onUnminimized = i4;
        int i5 = i3 % 2;
        if ((i & 2) != 0) {
            int i6 = i4 + 13;
            onRelationshipValidationResult = i6 % 128;
            int i7 = i6 % 2;
            str2 = null;
        }
        return shouldshowtermsandprivacypolicyalertingdpr.IAuthTabCallback(str, str2);
    }

    public final String IAuthTabCallback(@NotNull String str, @Nullable String str2) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        String str3 = "/indices/" + str;
        if (str2 != null) {
            int i2 = onRelationshipValidationResult + 11;
            onUnminimized = i2 % 128;
            int i3 = i2 % 2;
            String string = StringsKt.trim(str2).toString();
            if (string != null) {
                int i4 = onUnminimized + 3;
                onRelationshipValidationResult = i4 % 128;
                int i5 = i4 % 2;
                if (string.length() <= 0) {
                    string = null;
                }
                if (string != null) {
                    int i6 = onUnminimized + 81;
                    onRelationshipValidationResult = i6 % 128;
                    int i7 = i6 % 2;
                    Object[] objArr = new Object[1];
                    a(new char[]{15395, 58347, 33673, 41796, 17254}, Color.red(0) + 57301, objArr);
                    String strOnExtraCallbackWithResult = setPrivacyPolicyUri.onExtraCallbackWithResult(str3, ((String) objArr[0]).intern(), string);
                    if (strOnExtraCallbackWithResult != null) {
                        return strOnExtraCallbackWithResult;
                    }
                }
            }
        }
        return str3;
    }

    public final String onExtraCallbackWithResult(@Nullable String str) {
        int i = 2 % 2;
        String str2 = "/news/" + str;
        int i2 = onRelationshipValidationResult + 107;
        onUnminimized = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 36 / 0;
        }
        return str2;
    }

    public final String asBinder(@NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        String str2 = "/minor/parents-rights?accountKey=" + str;
        int i2 = onUnminimized + 3;
        onRelationshipValidationResult = i2 % 128;
        if (i2 % 2 != 0) {
            return str2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onExtraCallback(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        int i = 2 % 2;
        if (!((SecuritiesMemberState) onActivityLayout().IAuthTabCallbackDefault().IAuthTabCallback()).isGuest()) {
            if (str3 == null) {
                return "";
            }
            int i2 = onRelationshipValidationResult + 29;
            onUnminimized = i2 % 128;
            int i3 = i2 % 2;
            return str3;
        }
        int i4 = onRelationshipValidationResult + 109;
        onUnminimized = i4 % 128;
        int i5 = i4 % 2;
        Uri.Builder builderBuildUpon = Uri.parse("securitiestoss://accounts/v2/open").buildUpon();
        Intrinsics.checkNotNullExpressionValue(builderBuildUpon, "");
        Uri uriBuild = setPrivacyPolicyUri.onWarmupCompleted(setPrivacyPolicyUri.onWarmupCompleted(setPrivacyPolicyUri.onWarmupCompleted(builderBuildUpon, "header", str), "cta", str2), "landingUrl", str3).build();
        Intrinsics.checkNotNull(uriBuild);
        String string = onExtraCallbackWithResult(uriBuild).toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult;
        int i3 = i2 + 93;
        onUnminimized = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Function1<String, String> function1 = onTransact;
        int i4 = i2 + 125;
        onUnminimized = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 81 / 0;
        }
        return function1;
    }

    private static final String asInterface(String str) {
        int i = 2 % 2;
        String str2 = "/news/all?companyCode=" + str;
        int i2 = onRelationshipValidationResult + 47;
        onUnminimized = i2 % 128;
        if (i2 % 2 == 0) {
            return str2;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onUnminimized;
        int i3 = i2 + 91;
        onRelationshipValidationResult = i3 % 128;
        int i4 = i3 % 2;
        Function2<String, String, String> function2 = IAuthTabCallbackStub;
        int i5 = i2 + 51;
        onRelationshipValidationResult = i5 % 128;
        if (i5 % 2 != 0) {
            return function2;
        }
        throw null;
    }

    private static final String onExtraCallback(String str, String str2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        String str3 = "/news/" + str + "/?from=stock." + str2;
        int i2 = onUnminimized + 9;
        onRelationshipValidationResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 24 / 0;
        }
        return str3;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 87;
        onUnminimized = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback;
        }
        throw null;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onUnminimized + 125;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) IAuthTabCallback.getValue();
        int i4 = onRelationshipValidationResult + 51;
        onUnminimized = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        int i = 2 % 2;
        Object[] objArr2 = new Object[1];
        a(new char[]{15423, 23642, 64721, 7500, 48576, 56880, 32430, 40759, 16380, 22649, 63647, 6420, 47573, 55814, 31398, 39731, 15284, 21559, 62651, 5338, 46406, 54729, 30277, 38566, 14188, 22505, 61552, 4283, 45327, 53639, 29199, 37529, 13076, 21419, 60520, 3263, 44348, 52548, 28117, 36445, 11985, 20290, 61438, 2091, 43263, 51579, 27034, 35331, 10891, 19231, 60316, 1057, 42150, 50472, 26108, 34251, 9792, 18123, 59216, 1985, 41061, 49387, 24941, 33257}, 24697 - View.getDefaultSize(0, 0), objArr2);
        String strEncode = Uri.encode(((String) objArr2[0]).intern());
        StringBuilder sb = new StringBuilder();
        Object[] objArr3 = new Object[1];
        a(new char[]{15396, 20539, 58389, 30841, 35905, 8286, 46254, 51339, 23788, 61580, 1154, 39275, 11532, 16759, 54635, 26911, 64946, 4492, 42489, 14769}, 27673 - Color.alpha(0), objArr3);
        sb.append(((String) objArr3[0]).intern());
        sb.append(strEncode);
        sb.append("&external=true");
        String string = sb.toString();
        int i2 = onRelationshipValidationResult + 115;
        onUnminimized = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 38 / 0;
        }
        return string;
    }

    public final Uri onExtraCallbackWithResult(@NotNull Uri uri) throws Throwable {
        int i = 2 % 2;
        int i2 = onUnminimized + 17;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(uri, "");
        Object[] objArr = new Object[1];
        a(new char[]{15396, 31909, 48425, 64935, 15929, 32384, 48914, 65429, 14364, 30930, 47422, 63925, 14967, 31486, 47956, 64464, 13396, 29904, 46408, 63008, 14014, 30506, 47033, 61531, 12428, 28957, 45459, 61980, 13050, 29567, 46048, 60451, 11456, 27989, 44507}, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 16519, objArr);
        Uri.Builder builderBuildUpon = Uri.parse(((String) objArr[0]).intern()).buildUpon();
        Object[] objArr2 = new Object[1];
        a(new char[]{15394, 53324, 58601}, 60521 - View.getDefaultSize(0, 0), objArr2);
        Uri uriBuild = builderBuildUpon.appendQueryParameter(((String) objArr2[0]).intern(), uri.toString()).build();
        Intrinsics.checkNotNullExpressionValue(uriBuild, "");
        int i4 = onRelationshipValidationResult + 1;
        onUnminimized = i4 % 128;
        int i5 = i4 % 2;
        return uriBuild;
    }

    private final String access100(String str) throws Throwable {
        int i = 2 % 2;
        Uri.Builder builder = new Uri.Builder();
        Object[] objArr = new Object[1];
        a(new char[]{15396, 24449, 64338, 5947, 45801, 52801, 27153, 34267, 8618, 48495, 55517, 29833, 36928, 11315}, View.MeasureSpec.getMode(0) + 25523, objArr);
        String string = builder.scheme(((String) objArr[0]).intern()).authority("").path(str).appendQueryParameter("_transparent", "adaptive").appendQueryParameter("_isTransitionEnabled", "false").build().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        int i2 = onUnminimized + 59;
        onRelationshipValidationResult = i2 % 128;
        if (i2 % 2 != 0) {
            return string;
        }
        throw null;
    }

    private final String onExtraCallbackWithResult(String str, Pair<String, ? extends Object>... pairArr) {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder(str);
        char c = '?';
        int i2 = 0;
        if (StringsKt.contains$default(str, '?', false, 2, (Object) null)) {
            int i3 = onUnminimized + 53;
            onRelationshipValidationResult = i3 % 128;
            int i4 = i3 % 2;
            c = '&';
        }
        int length = pairArr.length;
        while (i2 < length) {
            Pair<String, ? extends Object> pair = pairArr[i2];
            String str2 = (String) pair.onExtraCallbackWithResult();
            Object objIAuthTabCallback = pair.IAuthTabCallback();
            if (objIAuthTabCallback != null) {
                int i5 = onRelationshipValidationResult + 7;
                onUnminimized = i5 % 128;
                int i6 = i5 % 2;
                sb.append(c);
                String str3 = onWarmupCompleted;
                sb.append(URLEncoder.encode(str2, str3));
                sb.append('=');
                sb.append(URLEncoder.encode(objIAuthTabCallback.toString(), str3));
                c = '&';
            }
            i2++;
            int i7 = onRelationshipValidationResult + 47;
            onUnminimized = i7 % 128;
            int i8 = i7 % 2;
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    private static final String extraCallbackWithResult() {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = JsParamKeys.onExtraCallbackWithResult();
        return (String) onExtraCallback(iOnExtraCallbackWithResult2, JsParamKeys.onExtraCallbackWithResult(), -724518909, 724518916, iOnExtraCallbackWithResult3, new Object[0], iOnExtraCallbackWithResult);
    }

    public static /* synthetic */ String onWarmupCompleted(shouldShowTermsAndPrivacyPolicyAlertInGdpr shouldshowtermsandprivacypolicyalertingdpr, String str, String str2, int i, Object obj) {
        Object[] objArr = {shouldshowtermsandprivacypolicyalertingdpr, str, str2, Integer.valueOf(i), obj};
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        return (String) onExtraCallback(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 246573557, -246573552, JsParamKeys.onExtraCallbackWithResult(), objArr, iOnExtraCallbackWithResult);
    }

    public final String onNavigationEvent() {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = JsParamKeys.onExtraCallbackWithResult();
        return (String) onExtraCallback(iOnExtraCallbackWithResult2, JsParamKeys.onExtraCallbackWithResult(), 1854871305, -1854871299, iOnExtraCallbackWithResult3, new Object[]{this}, iOnExtraCallbackWithResult);
    }

    public final Function1<String, String> IAuthTabCallbackStub() {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = JsParamKeys.onExtraCallbackWithResult();
        return (Function1) onExtraCallback(iOnExtraCallbackWithResult2, JsParamKeys.onExtraCallbackWithResult(), -1544354386, 1544354394, iOnExtraCallbackWithResult3, new Object[]{this}, iOnExtraCallbackWithResult);
    }

    public final Function2<String, String, String> asBinder() {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = JsParamKeys.onExtraCallbackWithResult();
        return (Function2) onExtraCallback(iOnExtraCallbackWithResult2, JsParamKeys.onExtraCallbackWithResult(), 1193352536, -1193352533, iOnExtraCallbackWithResult3, new Object[]{this}, iOnExtraCallbackWithResult);
    }

    public final String onTransact() {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = JsParamKeys.onExtraCallbackWithResult();
        return (String) onExtraCallback(iOnExtraCallbackWithResult2, JsParamKeys.onExtraCallbackWithResult(), -2100049064, 2100049068, iOnExtraCallbackWithResult3, new Object[]{this}, iOnExtraCallbackWithResult);
    }

    public final String access100() {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = JsParamKeys.onExtraCallbackWithResult();
        return (String) onExtraCallback(iOnExtraCallbackWithResult2, JsParamKeys.onExtraCallbackWithResult(), 1647760690, -1647760690, iOnExtraCallbackWithResult3, new Object[]{this}, iOnExtraCallbackWithResult);
    }

    public final String getInterfaceDescriptor() {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = JsParamKeys.onExtraCallbackWithResult();
        return (String) onExtraCallback(iOnExtraCallbackWithResult2, JsParamKeys.onExtraCallbackWithResult(), -377474008, 377474009, iOnExtraCallbackWithResult3, new Object[]{this}, iOnExtraCallbackWithResult);
    }

    public final String onExtraCallback(long j) {
        Object[] objArr = {this, Long.valueOf(j)};
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        return (String) onExtraCallback(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 113819625, -113819623, JsParamKeys.onExtraCallbackWithResult(), objArr, iOnExtraCallbackWithResult);
    }

    static void extraCallback() {
        ICustomTabsCallbackDefault = 2918887153763596640L;
    }
}
