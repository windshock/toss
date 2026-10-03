package viva.republica.toss.account.group;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.tosssecurities.singlepage.earning_call.EarningCallComposeView$;
import java.lang.reflect.Method;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.CommonModule_setScreenAwakeMode;
import o.GeckoHubImp;
import o.GraniteModule_onEventListenerRemoved;
import o.JsonReaderUnknownNumberParsing;
import o.RewardedInterstitialAdRewardedInterstitialShowAdConfig;
import o.SessionTrackerb;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.disableOldAndroidAttachmentMetricsWorkarounds;
import o.setMessageBytes;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.account.group.SchemeGroupAccountActivity$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class SchemeGroupAccountActivity extends Hilt_SchemeGroupAccountActivity {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int[] IAuthTabCallbackStub = {-2118657857, 288678309, -1143735954, 1934425876, -403252973, 125025855, 841954803, 392294134, -1269377693, 1838952471, 290242967, -1969138966, 1240011399, 1172233420, 944817619, -973499913, 1685228415, -1754864315};
    private static int asBinder = 1;
    private static int onTransact;
    private String asInterface = "";

    @Inject
    public SessionTrackerb tossRouter;

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~(i7 | i3);
        int i9 = ~i4;
        int i10 = ~i3;
        int i11 = i8 | (~(i9 | i10 | i2));
        int i12 = (~(i3 | i9 | i2)) | (~(i10 | i7));
        int i13 = ~(i7 | i9);
        int i14 = i4 + i2 + i5 + (563899752 * i6) + (667302295 * i);
        int i15 = i14 * i14;
        int i16 = ((i4 * 1426164010) - 416808960) + (1426164010 * i2) + (i11 * 480671447) + (i12 * 480671447) + (480671447 * i13) + (1906835456 * i5) + ((-1270874112) * i6) + (1914175488 * i) + ((-1995833344) * i15);
        int i17 = (i4 * (-901935710)) + 144807674 + (i2 * (-901935710)) + (i11 * 171) + (i12 * 171) + (i13 * 171) + (i5 * (-901935539)) + (i6 * 42244168) + (i * (-913566613)) + (i15 * (-1006501888));
        return i16 + ((i17 * i17) * (-1006239744)) != 1 ? IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Throwable th = (Throwable) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 57;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallbackDefault(th);
        }
        IAuthTabCallbackDefault(th);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(SchemeGroupAccountActivity schemeGroupAccountActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = asBinder + 105;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(schemeGroupAccountActivity, dialogInterface);
        if (i3 != 0) {
            int i4 = 13 / 0;
        }
        int i5 = onTransact + 39;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit IAuthTabCallback(SchemeGroupAccountActivity schemeGroupAccountActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = onTransact + 35;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(schemeGroupAccountActivity, commonModule_setLeftEdgeTouchEnabled);
        int i4 = asBinder + 93;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Throwable th = (Throwable) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 27;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return asInterface(th);
        }
        asInterface(th);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(SchemeGroupAccountActivity schemeGroupAccountActivity, String str, Pair pair) {
        int i = 2 % 2;
        int i2 = asBinder + 29;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            onNavigationEvent(schemeGroupAccountActivity, str, pair);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(schemeGroupAccountActivity, str, pair);
        int i3 = asBinder + 35;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onWarmupCompleted(SchemeGroupAccountActivity schemeGroupAccountActivity, String str, Pair pair) {
        int i = 2 % 2;
        int i2 = asBinder + 15;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(schemeGroupAccountActivity, str, pair);
        }
        IAuthTabCallback(schemeGroupAccountActivity, str, pair);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 125;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i2 + 119;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return -1L;
    }

    public final SessionTrackerb onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asBinder + 77;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        SessionTrackerb sessionTrackerb = this.tossRouter;
        if (sessionTrackerb == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i3 + 23;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i3 + 67;
        asBinder = i7 % 128;
        int i8 = i7 % 2;
        return sessionTrackerb;
    }

    public String getScreenName() {
        int i = 2 % 2;
        int i2 = asBinder + 121;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return "SchemeGroupAccountActivity";
        }
        int i3 = 87 / 0;
        return "SchemeGroupAccountActivity";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // viva.republica.toss.account.group.Hilt_SchemeGroupAccountActivity
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        super.onCreate(bundle);
        Intent intent = getIntent();
        Object[] objArr = new Object[1];
        a(new int[]{-699837320, 630057296, 1037585826, 1989551613}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11, objArr);
        String stringExtra = intent.getStringExtra(((String) objArr[0]).intern());
        if (stringExtra == null) {
            int i2 = asBinder + 7;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            stringExtra = "";
        }
        this.asInterface = stringExtra;
        Intent intent2 = getIntent();
        if (intent2 == null || !intent2.getBooleanExtra("im.toss.is_deep_link_flag", false)) {
            return;
        }
        Uri data = intent2.getData();
        if (data != null) {
            int i4 = asBinder + 41;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            String path = data.getPath();
            if (path != null && StringsKt.contains$default(path, "joint/detail", false, 2, (Object) null)) {
                int i6 = asBinder + 119;
                onTransact = i6 % 128;
                if (i6 % 2 == 0) {
                    onWarmupCompleted(intent2);
                    finish();
                    return;
                } else {
                    onWarmupCompleted(intent2);
                    finish();
                    throw null;
                }
            }
        }
        Uri data2 = intent2.getData();
        if (data2 != null) {
            int i7 = onTransact + 3;
            asBinder = i7 % 128;
            int i8 = i7 % 2;
            String path2 = data2.getPath();
            if (path2 == null || !StringsKt.contains$default(path2, "joint/create", false, 2, (Object) null)) {
                return;
            }
            CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(this, new SchemeGroupAccountActivity$.ExternalSyntheticLambda0(this));
        }
    }

    private static final Unit onWarmupCompleted(SchemeGroupAccountActivity schemeGroupAccountActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = asBinder + 5;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        schemeGroupAccountActivity.finish();
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 101;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onWarmupCompleted(SchemeGroupAccountActivity schemeGroupAccountActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(Integer.valueOf(R.string.app_group_account_creating_closed));
        commonModule_setLeftEdgeTouchEnabled.asBinder(new SchemeGroupAccountActivity$.ExternalSyntheticLambda1(schemeGroupAccountActivity));
        Unit unit = Unit.INSTANCE;
        int i2 = onTransact + 111;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallback(SchemeGroupAccountActivity schemeGroupAccountActivity, String str, Pair pair) {
        int i = 2 % 2;
        int i2 = onTransact + 27;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(pair, "");
        schemeGroupAccountActivity.startActivity(GroupAccountEventInfoActivity.Companion.IAuthTabCallback(schemeGroupAccountActivity, Long.parseLong(str), (RewardedInterstitialAdRewardedInterstitialShowAdConfig) null));
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 1;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallbackDefault(Throwable th) {
        int i = 2 % 2;
        int i2 = onTransact + 119;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 65;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onNavigationEvent(SchemeGroupAccountActivity schemeGroupAccountActivity, String str, Pair pair) {
        int i = 2 % 2;
        int i2 = asBinder + 39;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(pair, "");
            schemeGroupAccountActivity.startActivity(GroupAccountDetailActivity.Companion.onNavigationEvent(schemeGroupAccountActivity, str, schemeGroupAccountActivity.asInterface));
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(pair, "");
        schemeGroupAccountActivity.startActivity(GroupAccountDetailActivity.Companion.onNavigationEvent(schemeGroupAccountActivity, str, schemeGroupAccountActivity.asInterface));
        Unit unit2 = Unit.INSTANCE;
        int i3 = onTransact + 67;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 98 / 0;
        }
        return unit2;
    }

    private static final Unit asInterface(Throwable th) {
        int i = 2 % 2;
        int i2 = onTransact + 115;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 7;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onWarmupCompleted(Intent intent) throws Throwable {
        int i = 2 % 2;
        String stringExtra = intent.getStringExtra("accountId");
        if (stringExtra == null) {
            int i2 = asBinder + 21;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            stringExtra = "";
        }
        String stringExtra2 = intent.getStringExtra("eventId");
        String str = stringExtra2 != null ? stringExtra2 : "";
        intent.getStringExtra("sync");
        Object[] objArr = new Object[1];
        a(new int[]{-699837320, 630057296, 1037585826, 1989551613}, 9 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr);
        intent.getStringExtra(((String) objArr[0]).intern());
        try {
            if (GraniteModule_onEventListenerRemoved.onExtraCallback(stringExtra)) {
                int i4 = onTransact + 91;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
                if (GraniteModule_onEventListenerRemoved.onExtraCallback(str)) {
                    setMessageBytes.onNavigationEvent((JsonReaderUnknownNumberParsing) disableOldAndroidAttachmentMetricsWorkarounds.onExtraCallback(554839421, new Object[]{disableOldAndroidAttachmentMetricsWorkarounds.IAuthTabCallback, false, 1, null}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -554839418, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback()), new SchemeGroupAccountActivity$.ExternalSyntheticLambda2(), (Function0) null, new SchemeGroupAccountActivity$.ExternalSyntheticLambda3(this, str), 2, (Object) null);
                    return;
                }
            }
            if (GraniteModule_onEventListenerRemoved.onExtraCallback(stringExtra)) {
                setMessageBytes.onNavigationEvent((JsonReaderUnknownNumberParsing) disableOldAndroidAttachmentMetricsWorkarounds.onExtraCallback(554839421, new Object[]{disableOldAndroidAttachmentMetricsWorkarounds.IAuthTabCallback, false, 1, null}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -554839418, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback()), new SchemeGroupAccountActivity$.ExternalSyntheticLambda4(), (Function0) null, new SchemeGroupAccountActivity$.ExternalSyntheticLambda5(this, stringExtra), 2, (Object) null);
                return;
            }
            SessionTrackerb sessionTrackerbOnNavigationEvent = onNavigationEvent();
            Object[] objArr2 = new Object[1];
            a(new int[]{766128626, -1309110025, -37571639, -1765039970, -957081230, 803884826, 950676021, -1948982666}, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 16, objArr2);
            SessionTrackerb.IAuthTabCallback(sessionTrackerbOnNavigationEvent, this, ((String) objArr2[0]).intern(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        } catch (Exception unused) {
            SessionTrackerb sessionTrackerbOnNavigationEvent2 = onNavigationEvent();
            Object[] objArr3 = new Object[1];
            a(new int[]{766128626, -1309110025, -37571639, -1765039970, -957081230, 803884826, 950676021, -1948982666}, (ViewConfiguration.getPressedStateDuration() >> 16) + 16, objArr3);
            SessionTrackerb.IAuthTabCallback(sessionTrackerbOnNavigationEvent2, this, ((String) objArr3[0]).intern(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        }
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = IAuthTabCallbackStub;
        int i5 = -1469660336;
        int i6 = 16;
        char c = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $10 + 45;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> i6), 'x' - AndroidCharacter.getMirror('0'), (ViewConfiguration.getLongPressTimeout() >> 16) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i7] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i7++;
                    i5 = -1469660336;
                    i6 = 16;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = IAuthTabCallbackStub;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i10 = 0;
            while (i10 < length3) {
                int i11 = $10 + 121;
                $11 = i11 % 128;
                if (i11 % i3 == 0) {
                    Object[] objArr3 = new Object[1];
                    objArr3[c] = Integer.valueOf(iArr5[i10]);
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myTid() >> 22), TextUtils.indexOf("", "") + 72, (ViewConfiguration.getEdgeSlop() >> 16) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i10] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    i10 <<= 1;
                } else {
                    Object[] objArr4 = {Integer.valueOf(iArr5[i10])};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), 71 - ((byte) KeyEvent.getModifierMetaStateMask()), (ViewConfiguration.getEdgeSlop() >> 16) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i10] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    i10++;
                }
                i3 = 2;
                c = 0;
            }
            int i12 = $11 + 97;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            iArr5 = iArr6;
            i2 = 0;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr5, i2, iArr4, i2, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[i2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i14 = 0;
            for (int i15 = 16; i14 < i15; i15 = 16) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i14];
                Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 22251), 40 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 10301 - View.MeasureSpec.makeMeasureSpec(0, 0), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i14++;
            }
            int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i16;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.normalizeMetaState(0) + 4033), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 77, (ViewConfiguration.getWindowTouchSlop() >> 8) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
            i2 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Throwable th) {
        int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        int iOnNavigationEvent2 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        int iOnNavigationEvent3 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        return (Unit) IAuthTabCallback(EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), -1594017167, iOnNavigationEvent, new Object[]{th}, 1594017168, iOnNavigationEvent2, iOnNavigationEvent3);
    }

    public static /* synthetic */ Unit onTransact(Throwable th) {
        int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        int iOnNavigationEvent2 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        int iOnNavigationEvent3 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        return (Unit) IAuthTabCallback(EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), -246404068, iOnNavigationEvent, new Object[]{th}, 246404068, iOnNavigationEvent2, iOnNavigationEvent3);
    }

    @Override // viva.republica.toss.account.group.Hilt_SchemeGroupAccountActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = onTransact + 73;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = asBinder + 61;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 72 / 0;
        }
    }

    @Override // viva.republica.toss.account.group.Hilt_SchemeGroupAccountActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = asBinder + 59;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = asBinder + 29;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 73 / 0;
        }
    }

    @Override // viva.republica.toss.account.group.Hilt_SchemeGroupAccountActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = onTransact + 79;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            int i4 = 55 / 0;
        }
        int i5 = asBinder + 15;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // viva.republica.toss.account.group.Hilt_SchemeGroupAccountActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = asBinder + 97;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 != 0) {
            int i4 = 73 / 0;
        }
        int i5 = asBinder + 73;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }
}
