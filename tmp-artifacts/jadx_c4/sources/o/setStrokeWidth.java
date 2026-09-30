package o;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdRequest;
import im.toss.ads_sdk.model.NativeAdsDto;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class setStrokeWidth {
    private static long IAuthTabCallback;
    private static int IAuthTabCallbackDefault;
    public static final setStrokeWidth onExtraCallback;
    private static char onNavigationEvent;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {29, -59, -25, -119};
    private static final int $$b = 95;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 1;
    private static int onExtraCallbackWithResult = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, short s2, short s3) {
        int i;
        int i2;
        int i3;
        byte[] bArr = $$a;
        int i4 = (s2 * 4) + 4;
        int i5 = (s3 * 2) + 1;
        int i6 = 110 - s;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            i2 = i4;
            int i7 = i5;
            i3 = 0;
            i4 += -i7;
            i2++;
            i = i3;
            i3 = i + 1;
            bArr2[i] = (byte) i4;
            if (i3 == i5) {
                return new String(bArr2, 0);
            }
            i7 = bArr[i2];
            i4 += -i7;
            i2++;
            i = i3;
            i3 = i + 1;
            bArr2[i] = (byte) i4;
            if (i3 == i5) {
            }
        } else {
            i = 0;
            i4 = i6;
            i2 = i4;
            i3 = i + 1;
            bArr2[i] = (byte) i4;
            if (i3 == i5) {
            }
        }
    }

    static {
        IAuthTabCallbackDefault = 1;
        onWarmupCompleted();
        onExtraCallback = new setStrokeWidth();
        int i = onExtraCallbackWithResult + 119;
        IAuthTabCallbackDefault = i % 128;
        int i2 = i % 2;
    }

    private setStrokeWidth() {
    }

    public static /* synthetic */ AdRequest onNavigationEvent(setStrokeWidth setstrokewidth, NativeAdsDto.AdmobInfo admobInfo, boolean z, int i, Object obj) throws Throwable {
        int i2 = 2 % 2;
        if ((i & 2) != 0) {
            int i3 = IAuthTabCallbackStub + 47;
            int i4 = i3 % 128;
            asInterface = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 49;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        }
        AdRequest adRequestIAuthTabCallback = setstrokewidth.IAuthTabCallback(admobInfo, z);
        int i8 = IAuthTabCallbackStub + 17;
        asInterface = i8 % 128;
        if (i8 % 2 != 0) {
            return adRequestIAuthTabCallback;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final AdRequest IAuthTabCallback(@NotNull NativeAdsDto.AdmobInfo admobInfo, boolean z) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 75;
        IAuthTabCallbackStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(admobInfo, "");
            admobInfo.onWarmupCompleted();
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(admobInfo, "");
        Double dOnWarmupCompleted = admobInfo.onWarmupCompleted();
        AdRequest adRequestOnExtraCallbackWithResult = onExtraCallbackWithResult(dOnWarmupCompleted != null ? Long.valueOf((long) dOnWarmupCompleted.doubleValue()) : null, admobInfo.IAuthTabCallbackDefault(), z);
        int i3 = IAuthTabCallbackStub + 49;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            return adRequestOnExtraCallbackWithResult;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ AdRequest onNavigationEvent(setStrokeWidth setstrokewidth, Long l, NativeAdsDto.AdmobRequestOptions admobRequestOptions, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = asInterface;
        int i4 = i3 + 69;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0 ? (i & 4) != 0 : (i & 2) != 0) {
            int i5 = i3 + 63;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        }
        return setstrokewidth.onExtraCallbackWithResult(l, admobRequestOptions, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x00da A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0087 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AdRequest onExtraCallbackWithResult(@Nullable Long l, @Nullable NativeAdsDto.AdmobRequestOptions admobRequestOptions, boolean z) throws Throwable {
        Map<String, List<String>> mapOnNavigationEvent;
        Long lIAuthTabCallback;
        Object obj;
        String str;
        List list;
        Map.Entry<String, List<String>> next;
        int i = 2 % 2;
        AdRequest.Builder builder = new AdRequest.Builder();
        if (l != null) {
            builder.setPlacementId(l.longValue());
        }
        if (admobRequestOptions != null) {
            int i2 = IAuthTabCallbackStub + 113;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            mapOnNavigationEvent = admobRequestOptions.onExtraCallback();
        } else {
            mapOnNavigationEvent = null;
        }
        if (mapOnNavigationEvent == null) {
            mapOnNavigationEvent = access8100.onNavigationEvent();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, List<String>>> it = mapOnNavigationEvent.entrySet().iterator();
        while (it.hasNext()) {
            int i4 = IAuthTabCallbackStub + 67;
            asInterface = i4 % 128;
            if (i4 % 2 == 0) {
                next = it.next();
                int i5 = 70 / 0;
                if (!StringsKt.isBlank(next.getKey())) {
                    linkedHashMap.put(next.getKey(), next.getValue());
                }
            } else {
                next = it.next();
                if (!StringsKt.isBlank(next.getKey())) {
                    linkedHashMap.put(next.getKey(), next.getValue());
                }
            }
        }
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            int i6 = IAuthTabCallbackStub + 57;
            asInterface = i6 % 128;
            if (i6 % 2 == 0) {
                Map.Entry entry = (Map.Entry) it2.next();
                str = (String) entry.getKey();
                list = (List) entry.getValue();
                if (list.size() == 1) {
                    builder.addCustomTargeting(str, (String) CollectionsKt.first(list));
                } else if (list.size() <= 1) {
                    int i7 = asInterface + 89;
                    IAuthTabCallbackStub = i7 % 128;
                    if (i7 % 2 != 0) {
                        builder.addCustomTargeting(str, list);
                        int i8 = 83 / 0;
                    } else {
                        builder.addCustomTargeting(str, list);
                    }
                }
            } else {
                Map.Entry entry2 = (Map.Entry) it2.next();
                str = (String) entry2.getKey();
                list = (List) entry2.getValue();
                if (list.size() == 1) {
                    builder.addCustomTargeting(str, (String) CollectionsKt.first(list));
                } else if (list.size() <= 1) {
                }
            }
        }
        Bundle bundle = new Bundle();
        if (z) {
            int i9 = IAuthTabCallbackStub + 53;
            asInterface = i9 % 128;
            if (i9 % 2 == 0) {
                Object[] objArr = new Object[1];
                a((char) (KeyEvent.getDeadChar(1, 0) * 65125), 1527293069 >> TextUtils.indexOf((CharSequence) "", '\t'), new char[]{36993}, new char[]{45927, 51735, 4785, 38614}, new char[]{35918, 2212, 25947, 64254}, objArr);
                obj = objArr[0];
            } else {
                Object[] objArr2 = new Object[1];
                a((char) (65125 - KeyEvent.getDeadChar(0, 0)), TextUtils.indexOf((CharSequence) "", '0') + 1527293069, new char[]{36993}, new char[]{45927, 51735, 4785, 38614}, new char[]{35918, 2212, 25947, 64254}, objArr2);
                obj = objArr2[0];
            }
            bundle.putString("ad_transparency_url_requested", ((String) obj).intern());
        }
        if (admobRequestOptions != null && (lIAuthTabCallback = admobRequestOptions.IAuthTabCallback()) != null) {
            Long l2 = lIAuthTabCallback.longValue() > 0 ? lIAuthTabCallback : null;
            if (l2 != null) {
                bundle.putString("rusd", String.valueOf(l2.longValue()));
            }
        }
        if (!bundle.isEmpty()) {
            builder.addNetworkExtrasBundle(AdMobAdapter.class, bundle);
        }
        AdRequest adRequestBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(adRequestBuild, "");
        return adRequestBuild;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        int i3 = 0;
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i4 = $10 + 63;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    int i6 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 42;
                    int iIndexOf = 1451 - TextUtils.indexOf("", "", i3);
                    byte b = (byte) i3;
                    byte b2 = b;
                    String str$$c = $$c(b, b2, b2);
                    Class[] clsArr = new Class[1];
                    clsArr[i3] = Object.class;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(keyRepeatTimeout, i6, iIndexOf, 228868077, false, str$$c, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    char c2 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 49122);
                    int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 44;
                    int i7 = 1495 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                    byte b3 = (byte) ($$b & 1);
                    byte b4 = (byte) (b3 - 1);
                    String str$$c2 = $$c(b3, b4, b4);
                    Class[] clsArr2 = new Class[1];
                    clsArr2[i3] = Object.class;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c2, maximumFlingVelocity, i7, 1533236389, false, str$$c2, clsArr2);
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                int i8 = cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                objArr4[1] = Integer.valueOf(i8);
                objArr4[i3] = trackSelectionParametersBuilderExternalSyntheticLambda0;
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    char cRed = (char) (23972 - Color.red(i3));
                    int keyRepeatTimeout2 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 50;
                    int iResolveOpacity = Drawable.resolveOpacity(i3, i3) + 22939;
                    Class[] clsArr3 = new Class[3];
                    clsArr3[i3] = Object.class;
                    clsArr3[1] = Integer.TYPE;
                    clsArr3[2] = Integer.TYPE;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cRed, keyRepeatTimeout2, iResolveOpacity, 1872485556, false, "k", clsArr3);
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i9 = cArr4[iIntValue2] * 32718;
                Object[] objArr5 = new Object[2];
                objArr5[1] = Integer.valueOf(cArr5[iIntValue]);
                objArr5[i3] = Integer.valueOf(i9);
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    char cRgb = (char) (Color.rgb(i3, i3, i3) + 16823064);
                    int i10 = 30 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    int iRed = Color.red(i3) + 12577;
                    Class[] clsArr4 = new Class[2];
                    clsArr4[i3] = Integer.TYPE;
                    clsArr4[1] = Integer.TYPE;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cRgb, i10, iRed, 1401536470, false, "l", clsArr4);
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((int) (onWarmupCompleted ^ 7798559133331975163L)) ^ ((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (IAuthTabCallback ^ 7798559133331975163L))) ^ ((char) (onNavigationEvent ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                int i11 = $11 + 69;
                $10 = i11 % 128;
                if (i11 % 2 != 0) {
                    int i12 = 3 % 3;
                }
                i3 = 0;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    static void onWarmupCompleted() {
        IAuthTabCallback = -365883903007336292L;
        onWarmupCompleted = -1776194565;
        onNavigationEvent = (char) 27643;
    }
}
