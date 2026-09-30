package o;

import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.securities.core.router.spec.TossSecRoute;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class onConsentInfoUpdateFailure {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static final Set<String> onExtraCallback;
    private static int onExtraCallbackWithResult = 0;
    private static int[] onNavigationEvent = null;
    private static int onWarmupCompleted = 1;

    static {
        onExtraCallback();
        onExtraCallback = clearFaultAdjacentMetadata.onExtraCallback(new String[]{"tab", TossSecRoute.Main.PARAM_RESTORE_TARGET_TAB, TossSecRoute.Main.PARAM_SCROLL_TO_SECTION, TossSecRoute.Main.PARAM_WATCHLIST_ID});
        int i = onWarmupCompleted + 1;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public static final List<Pair<String, String>> onNavigationEvent(@NotNull TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 69;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(twoLineExternalSyntheticLambda0, "");
            return onExtraCallback(twoLineExternalSyntheticLambda0.onNavigationEvent());
        }
        Intrinsics.checkNotNullParameter(twoLineExternalSyntheticLambda0, "");
        onExtraCallback(twoLineExternalSyntheticLambda0.onNavigationEvent());
        throw null;
    }

    public static final List<Pair<String, String>> onExtraCallback(@NotNull Uri uri) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 7;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(uri, "");
        Uri uriOnExtraCallbackWithResult = onExtraCallbackWithResult(uri);
        if (uriOnExtraCallbackWithResult != null) {
            int i4 = IAuthTabCallbackDefault + 21;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            uri = uriOnExtraCallbackWithResult;
        }
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        onExtraCallbackWithResult(listCreateListBuilder, uri);
        List<Pair<String, String>> listBuild = CollectionsKt.build(listCreateListBuilder);
        int i6 = IAuthTabCallbackDefault + 41;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return listBuild;
    }

    public static final List<Pair<String, String>> onExtraCallback(@Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 25;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Uri uriIAuthTabCallback = setDebugUserGeography.IAuthTabCallback(bundle);
        if (uriIAuthTabCallback != null) {
            return onExtraCallback(uriIAuthTabCallback);
        }
        List<Pair<String, String>> listEmptyList = CollectionsKt.emptyList();
        int i4 = onExtraCallbackWithResult + 33;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return listEmptyList;
    }

    private static final void onExtraCallbackWithResult(List<Pair<String, String>> list, Uri uri) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 67;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            Intrinsics.checkNotNullExpressionValue(queryParameterNames, "");
            queryParameterNames.iterator();
            throw null;
        }
        Set<String> queryParameterNames2 = uri.getQueryParameterNames();
        Intrinsics.checkNotNullExpressionValue(queryParameterNames2, "");
        for (String str : queryParameterNames2) {
            int i3 = IAuthTabCallbackDefault + 45;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            if (!onExtraCallback.contains(str)) {
                List<String> queryParameters = uri.getQueryParameters(str);
                Intrinsics.checkNotNullExpressionValue(queryParameters, "");
                Iterator<T> it = queryParameters.iterator();
                while (it.hasNext()) {
                    int i5 = onExtraCallbackWithResult + 73;
                    IAuthTabCallbackDefault = i5 % 128;
                    if (i5 % 2 == 0) {
                        list.add(getWrite.IAuthTabCallback(str, (String) it.next()));
                        obj.hashCode();
                        throw null;
                    }
                    list.add(getWrite.IAuthTabCallback(str, (String) it.next()));
                    int i6 = onExtraCallbackWithResult + 93;
                    IAuthTabCallbackDefault = i6 % 128;
                    if (i6 % 2 == 0) {
                        int i7 = 5 % 5;
                    }
                }
            }
        }
        int i8 = IAuthTabCallbackDefault + 63;
        onExtraCallbackWithResult = i8 % 128;
        if (i8 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static final Uri onExtraCallbackWithResult(Uri uri) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        IAuthTabCallbackDefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            if (uri.getQueryParameter("tab") != null) {
                return null;
            }
            Object[] objArr = new Object[1];
            a(new int[]{-1508194378, -767498965}, 3 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr);
            String queryParameter = uri.getQueryParameter(((String) objArr[0]).intern());
            if (queryParameter != null) {
                if (StringsKt.isBlank(queryParameter)) {
                    int i3 = IAuthTabCallbackDefault + 73;
                    onExtraCallbackWithResult = i3 % 128;
                    if (i3 % 2 != 0) {
                        throw null;
                    }
                    queryParameter = null;
                }
                if (queryParameter != null) {
                    return Uri.parse(queryParameter);
                }
            }
            return null;
        }
        uri.getQueryParameter("tab");
        obj.hashCode();
        throw null;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = onNavigationEvent;
        int i5 = -1469660336;
        float f = 0.0f;
        int i6 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $10 + 87;
                $11 = i8 % 128;
                if (i8 % i3 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i7])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (PointF.length(f, f) > f ? 1 : (PointF.length(f, f) == f ? 0 : -1)), ((byte) KeyEvent.getModifierMetaStateMask()) + 73, 8847 - ImageFormat.getBitsPerPixel(0), -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr3[i7] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                        i7 >>= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(iArr2[i7])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionGroup(0L), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 72, 8848 - (ViewConfiguration.getJumpTapTimeout() >> 16), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i7] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    i7++;
                }
                i3 = 2;
                f = 0.0f;
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = onNavigationEvent;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i9 = 0;
            while (i9 < length3) {
                int i10 = $10 + 17;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                Object[] objArr4 = new Object[1];
                objArr4[i6] = Integer.valueOf(iArr5[i9]);
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getMaxKeyCode() >> 16), 72 - TextUtils.indexOf("", "", i6), (TypedValue.complexToFloat(i6) > 0.0f ? 1 : (TypedValue.complexToFloat(i6) == 0.0f ? 0 : -1)) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr6[i9] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                i9++;
                i5 = -1469660336;
                i6 = 0;
            }
            i2 = i6;
            iArr5 = iArr6;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr5, i2, iArr4, i2, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
        int i12 = $10 + 121;
        $11 = i12 % 128;
        int i13 = i12 % 2;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
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
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - TextUtils.indexOf("", "", 0, 0)), 39 - (ViewConfiguration.getScrollBarSize() >> 8), 10301 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i14++;
                int i16 = $10 + 41;
                $11 = i16 % 128;
                int i17 = i16 % 2;
            }
            int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i18;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i19 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i20 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
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
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0') + 4034), 78 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), TextUtils.indexOf("", "", 0) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void onExtraCallback() {
        onNavigationEvent = new int[]{-1707970458, -1728437413, 171085893, -1318555209, -2124840787, 1253528404, -1190506481, -1006429522, 639650825, 1741021822, 171979526, 900915425, 682145539, 739087546, 673286408, 391963399, 1650643697, 968962096};
    }
}
