package o;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.deeplink.DeeplinkConditionalRouter;
import im.toss.deeplink.annotation.ConditionalDeepLink;
import java.lang.reflect.Method;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@ConditionalDeepLink
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getIssuerUniqueID extends DeeplinkConditionalRouter {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onWarmupCompleted Companion;
    private static int[] IAuthTabCallback = null;
    private static int onExtraCallback = 0;
    public static final int onExtraCallbackWithResult;
    private static int onNavigationEvent = 1;
    private static int onTransact = 1;
    private static int onWarmupCompleted;

    static {
        onExtraCallbackWithResult();
        Companion = new onWarmupCompleted(null);
        onExtraCallbackWithResult = 8;
        int i = onNavigationEvent + 45;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 41 / 0;
        }
    }

    public void execute(@NotNull Context context, @NotNull Uri uri) throws Throwable {
        Object obj;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(uri, "");
        String queryParameter = uri.getQueryParameter("androidAppLink");
        String queryParameter2 = uri.getQueryParameter("androidStoreLink");
        Object[] objArr = new Object[1];
        a(new int[]{2059663887, -1986734681, -457044452, -1595541780}, ExpandableListView.getPackedPositionGroup(0L) + 8, objArr);
        String queryParameter3 = uri.getQueryParameter(((String) objArr[0]).intern());
        String queryParameter4 = uri.getQueryParameter("serviceReferrer");
        String queryParameter5 = uri.getQueryParameter("executionId");
        try {
            Result.Companion companion = Result.Companion;
            Intent intentAddFlags = new Intent("android.intent.action.VIEW").setData(Uri.parse(queryParameter)).addFlags(268435456);
            Intrinsics.checkNotNullExpressionValue(intentAddFlags, "");
            getNavigationBar.IAuthTabCallback(intentAddFlags, context);
            onNavigationEvent(queryParameter, true, queryParameter3, queryParameter4, queryParameter5);
            obj = Result.constructor-impl(Unit.INSTANCE);
            int i2 = onTransact + 107;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.exceptionOrNull-impl(obj) != null) {
            Intent intentAddFlags2 = new Intent("android.intent.action.VIEW").setData(Uri.parse(queryParameter2)).addFlags(268435456);
            Intrinsics.checkNotNullExpressionValue(intentAddFlags2, "");
            getNavigationBar.IAuthTabCallback(intentAddFlags2, context);
            onNavigationEvent(queryParameter, false, queryParameter3, queryParameter4, queryParameter5);
            int i4 = onTransact + 125;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = onTransact + 23;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private final void onNavigationEvent(String str, boolean z, String str2, String str3, String str4) throws Throwable {
        String str5;
        String str6;
        int i = 2 % 2;
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("app_scheme_yn", zzaz.onExtraCallbackWithResult(z));
        String str7 = "";
        if (str == null) {
            int i2 = onTransact + 49;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            str5 = "";
        } else {
            str5 = str;
        }
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("link_url", str5);
        if (str2 == null) {
            int i3 = onWarmupCompleted + 45;
            onTransact = i3 % 128;
            if (i3 % 2 != 0) {
                str6 = "";
            } else {
                throw null;
            }
        } else {
            str6 = str2;
        }
        Object[] objArr = new Object[1];
        a(new int[]{2059663887, -1986734681, -457044452, -1595541780}, (ViewConfiguration.getTapTimeout() >> 16) + 8, objArr);
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), str6);
        Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback("service_referrer", str3 == null ? "" : str3);
        if (str4 == null) {
            int i4 = onTransact + 27;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        } else {
            str7 = str4;
        }
        ConvertFloatArrayToByteArray.onWarmupCompleted(convertFloatArrayToByteArray, 2038058L, false, (String) null, access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, pairIAuthTabCallback4, getWrite.IAuthTabCallback("execution_id", str7)}), (Function1) null, 22, (Object) null);
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = IAuthTabCallback;
        char c = '0';
        int i3 = -1469660336;
        int i4 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i3);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myPid() >> 22), 71 - TextUtils.lastIndexOf("", c, 0), 8847 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i5] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i5++;
                    c = '0';
                    i3 = -1469660336;
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
        int[] iArr5 = IAuthTabCallback;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i6 = 0;
            while (i6 < length3) {
                int i7 = $11 + 1;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                try {
                    Object[] objArr3 = new Object[1];
                    objArr3[i4] = Integer.valueOf(iArr5[i6]);
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.rgb(i4, i4, i4) + 16777216), Gravity.getAbsoluteGravity(i4, i4) + 72, 8847 - ImageFormat.getBitsPerPixel(i4), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i6] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    i6++;
                    i4 = 0;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            iArr5 = iArr6;
        }
        int i9 = i4;
        System.arraycopy(iArr5, i9, iArr4, i9, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i9;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            int i10 = $11 + 35;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            for (int i12 = 0; i12 < 16; i12++) {
                int i13 = $11 + 71;
                $10 = i13 % 128;
                int i14 = i13 % 2;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i12];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((KeyEvent.getMaxKeyCode() >> 16) + 22252), 40 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), TextUtils.lastIndexOf("", '0') + 10302, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
            }
            int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i15;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4033 - (ViewConfiguration.getScrollBarSize() >> 8)), View.getDefaultSize(0, 0) + 78, 7398 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void onExtraCallbackWithResult() {
        IAuthTabCallback = new int[]{433849380, -403012269, -1619131681, -1144193292, 2132553880, 383953463, -1613974497, -1281326581, -194069852, -1254651592, 943609856, 1345205893, -469706792, -559687289, -2002870542, -1141137189, -1095273929, -820360952};
    }
}
