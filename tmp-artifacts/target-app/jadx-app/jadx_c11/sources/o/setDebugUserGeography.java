package o;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.securities.core.router.spec.TossSecRoute;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.getPrivacyPolicyUri;
import o.setDebugUserGeography;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class setDebugUserGeography {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int[] IAuthTabCallback = null;
    private static int IAuthTabCallbackDefault = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static final accessisMonitoringp<getPrivacyPolicyUri> onWarmupCompleted;

    public static /* synthetic */ getPrivacyPolicyUri onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 55;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        getPrivacyPolicyUri getprivacypolicyuriOnExtraCallback = onExtraCallback();
        int i3 = onNavigationEvent + 125;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return getprivacypolicyuriOnExtraCallback;
    }

    public static final Uri IAuthTabCallback(@Nullable Bundle bundle) {
        Intent intent;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0 ? Build.VERSION.SDK_INT < 33 : Build.VERSION.SDK_INT < 14) {
            Object obj = bundle != null ? bundle.get("android-support-nav:controller:deepLinkIntent") : null;
            if (obj instanceof Intent) {
                intent = (Intent) obj;
                int i3 = onExtraCallbackWithResult + 117;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
            } else {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
        if (bundle != null) {
            int i5 = onExtraCallbackWithResult + 67;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            Intent intent2 = (Intent) bundle.getParcelable("android-support-nav:controller:deepLinkIntent", Intent.class);
            if (intent2 != null) {
                int i7 = onExtraCallbackWithResult + 31;
                onNavigationEvent = i7 % 128;
                if (i7 % 2 == 0) {
                    return intent2.getData();
                }
                intent2.getData();
                throw null;
            }
        }
        return null;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int length;
        int[] iArr2;
        int i3;
        int i4 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = IAuthTabCallback;
        int i5 = -1469660336;
        char c = 0;
        if (iArr3 != null) {
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i6 = 0;
            while (i6 < length2) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), KeyEvent.keyCodeFromString("") + 72, 8848 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr4[i6] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i6++;
                    int i7 = $11 + 77;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                    i5 = -1469660336;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = IAuthTabCallback;
        if (iArr6 != null) {
            int i9 = $10 + 67;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                length = iArr6.length;
                iArr2 = new int[length];
                i3 = 1;
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
                i3 = 0;
            }
            while (i3 < length) {
                int i10 = $10 + 31;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                Object[] objArr3 = new Object[1];
                objArr3[c] = Integer.valueOf(iArr6[i3]);
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getMaxKeyCode() >> 16), ExpandableListView.getPackedPositionType(0L) + 72, (KeyEvent.getMaxKeyCode() >> 16) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr2[i3] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                i3++;
                c = 0;
            }
            int i12 = $10 + 5;
            $11 = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 4 / 4;
            }
            iArr6 = iArr2;
            i2 = 0;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr6, i2, iArr5, i2, length3);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            int i14 = $10 + 67;
            $11 = i14 % 128;
            int i15 = i14 % 2;
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
            int i16 = 0;
            for (int i17 = 16; i16 < i17; i17 = 16) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[i16];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - Color.alpha(0)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 39, 10302 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i16++;
            }
            int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i18;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr5[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[17];
            int i19 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i20 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.keyCodeFromString("") + 4033), 77 - TextUtils.indexOf((CharSequence) "", '0', 0), 7397 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    public static final Map<String, String> onExtraCallbackWithResult(@NotNull TossSecRoute tossSecRoute, @Nullable Uri uri) throws Throwable {
        Set<String> queryParameterNames;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(tossSecRoute, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (uri != null) {
            Uri uri2 = uri.isHierarchical() ? uri : null;
            if (uri2 != null && (queryParameterNames = uri2.getQueryParameterNames()) != null) {
                for (String str : queryParameterNames) {
                    String queryParameter = uri.getQueryParameter(str);
                    if (queryParameter != null) {
                        linkedHashMap.put(str, queryParameter);
                    }
                }
            }
        }
        if (tossSecRoute instanceof TossSecRoute.Main) {
            TossSecRoute.Main main = (TossSecRoute.Main) tossSecRoute;
            String strOnExtraCallbackWithResult = main.onExtraCallbackWithResult();
            if (strOnExtraCallbackWithResult != null) {
                linkedHashMap.put("tab", strOnExtraCallbackWithResult);
            }
            String strOnNavigationEvent = main.onNavigationEvent();
            if (strOnNavigationEvent != null) {
                linkedHashMap.put(TossSecRoute.Main.PARAM_RESTORE_TARGET_TAB, strOnNavigationEvent);
            }
            String strOnWarmupCompleted = main.onWarmupCompleted();
            if (strOnWarmupCompleted != null) {
                int i2 = onNavigationEvent + 5;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    linkedHashMap.put(TossSecRoute.Main.PARAM_SCROLL_TO_SECTION, strOnWarmupCompleted);
                    int i3 = 60 / 0;
                } else {
                    linkedHashMap.put(TossSecRoute.Main.PARAM_SCROLL_TO_SECTION, strOnWarmupCompleted);
                }
            }
            Long lOnExtraCallback = main.onExtraCallback();
            if (lOnExtraCallback != null) {
                linkedHashMap.put(TossSecRoute.Main.PARAM_WATCHLIST_ID, String.valueOf(lOnExtraCallback.longValue()));
                return linkedHashMap;
            }
        } else {
            if (tossSecRoute instanceof TossSecRoute.Web) {
                Object[] objArr = new Object[1];
                a(new int[]{1993158047, 223331510}, TextUtils.getOffsetBefore("", 0) + 3, objArr);
                linkedHashMap.put(((String) objArr[0]).intern(), ((TossSecRoute.Web) tossSecRoute).onWarmupCompleted());
                return linkedHashMap;
            }
            if (tossSecRoute instanceof TossSecRoute.EarningCallDetail) {
                TossSecRoute.EarningCallDetail earningCallDetail = (TossSecRoute.EarningCallDetail) tossSecRoute;
                String strOnWarmupCompleted2 = earningCallDetail.onWarmupCompleted();
                if (strOnWarmupCompleted2 != null) {
                    int i4 = onNavigationEvent + 101;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    linkedHashMap.put("eventId", strOnWarmupCompleted2);
                }
                String strIAuthTabCallback = earningCallDetail.IAuthTabCallback();
                if (strIAuthTabCallback != null) {
                    linkedHashMap.put(TossSecRoute.EarningCallDetail.PARAM_PRODUCT_CODE, strIAuthTabCallback);
                }
                String strOnNavigationEvent2 = earningCallDetail.onNavigationEvent();
                if (strOnNavigationEvent2 != null) {
                    linkedHashMap.put("beforeEntryId", strOnNavigationEvent2);
                }
                String strOnTransact = earningCallDetail.onTransact();
                if (strOnTransact != null) {
                    linkedHashMap.put("tab", strOnTransact);
                    return linkedHashMap;
                }
            } else if (tossSecRoute instanceof TossSecRoute.EarningCallHomeDetailV2) {
                TossSecRoute.EarningCallHomeDetailV2 earningCallHomeDetailV2 = (TossSecRoute.EarningCallHomeDetailV2) tossSecRoute;
                linkedHashMap.put(TossSecRoute.EarningCallHomeDetailV2.PARAM_TAB, earningCallHomeDetailV2.onExtraCallback());
                String strOnWarmupCompleted3 = earningCallHomeDetailV2.onWarmupCompleted();
                if (strOnWarmupCompleted3 != null) {
                    int i6 = onExtraCallbackWithResult + 99;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    linkedHashMap.put(TossSecRoute.EarningCallHomeDetailV2.PARAM_SUB_TAB, strOnWarmupCompleted3);
                }
            }
        }
        return linkedHashMap;
    }

    static {
        onWarmupCompleted();
        onWarmupCompleted = setPostviewFormatSelector.IAuthTabCallback(new Function0() { // from class: im.toss.securities.core.router.spec.LandingArgumentsKt$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 27;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                getPrivacyPolicyUri getprivacypolicyuriOnNavigationEvent = setDebugUserGeography.onNavigationEvent();
                int i4 = onExtraCallbackWithResult + 29;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return getprivacypolicyuriOnNavigationEvent;
            }
        });
        int i = IAuthTabCallbackDefault + 25;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final getPrivacyPolicyUri onExtraCallback() {
        int i = 2 % 2;
        throw new IllegalStateException("No LandingArguments provided");
    }

    static void onWarmupCompleted() {
        IAuthTabCallback = new int[]{-625064179, 779945790, 999323512, -11227177, 694469224, 1563971128, -1963152411, 552873279, -1540045700, -731966225, 1229249617, -1378476719, -423525294, -76533068, -184403138, -215990619, 329343943, 1652223764};
    }
}
