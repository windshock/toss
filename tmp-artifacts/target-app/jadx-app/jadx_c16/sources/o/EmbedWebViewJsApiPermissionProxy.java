package o;

import android.graphics.Color;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class EmbedWebViewJsApiPermissionProxy {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder = 0;
    private static int asInterface = 0;
    private static char onExtraCallback = 0;
    private static char onExtraCallbackWithResult = 0;
    private static char onNavigationEvent = 0;
    private static int onTransact = 1;
    public static final EmbedWebViewJsApiPermissionProxy onWarmupCompleted;

    static {
        onWarmupCompleted();
        onWarmupCompleted = new EmbedWebViewJsApiPermissionProxy();
        int i = IAuthTabCallbackStub + 51;
        asBinder = i % 128;
        if (i % 2 != 0) {
            int i2 = 55 / 0;
        }
    }

    private EmbedWebViewJsApiPermissionProxy() {
    }

    public final Uri onWarmupCompleted(@Nullable String str, @Nullable String str2) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 67;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a(new char[]{14761, 2891, 52462, 48518, 49843, 17441, 3879, 25708, 40394, 24048, 34708, 57533, 65091, 57880, 42529, 28393, 20048, 15132, 21219, 2439, 37631, 6984, 11836, 28925, 5918, 7903, 62491, 62267}, (ViewConfiguration.getWindowTouchSlop() >> 8) + 27, objArr);
        Uri.Builder builderBuildUpon = Uri.parse(((String) objArr[0]).intern()).buildUpon();
        Object[] objArr2 = new Object[1];
        a(new char[]{46140, 50818, 40965, 58909, 46140, 50818, 29304, 38558, 15963, 48894, 20452, 26750}, Gravity.getAbsoluteGravity(0, 0) + 11, objArr2);
        Uri.Builder builderAppendQueryParameter = builderBuildUpon.appendQueryParameter(((String) objArr2[0]).intern(), str2);
        Object[] objArr3 = new Object[1];
        a(new char[]{46140, 50818, 24555, 20209, 48599, 1405, 15277, 12257}, 8 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr3);
        Uri uriBuild = builderAppendQueryParameter.appendQueryParameter(((String) objArr3[0]).intern(), str).build();
        Intrinsics.checkNotNullExpressionValue(uriBuild, "");
        int i4 = asInterface + 29;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return uriBuild;
        }
        throw null;
    }

    public static final class IAuthTabCallback {
        public static final IAuthTabCallback IAuthTabCallback;
        private static int onExtraCallback;
        private static int onWarmupCompleted;
        private static final byte[] $$a = {115, 102, 60, 8};
        private static final int $$b = 95;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int IAuthTabCallbackStub = 1;
        private static int onNavigationEvent = 1;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$c(byte b, byte b2, short s) {
            int i;
            int i2 = b2 * 4;
            byte[] bArr = $$a;
            int i3 = (s * 4) + 105;
            int i4 = 4 - (b * 3);
            byte[] bArr2 = new byte[1 - i2];
            int i5 = 0 - i2;
            if (bArr == null) {
                int i6 = i5;
                i = 0;
                i4++;
                i3 += i6;
                bArr2[i] = (byte) i3;
                if (i == i5) {
                    return new String(bArr2, 0);
                }
                i++;
                i6 = bArr[i4];
                i4++;
                i3 += i6;
                bArr2[i] = (byte) i3;
                if (i == i5) {
                }
            } else {
                i = 0;
                bArr2[i] = (byte) i3;
                if (i == i5) {
                }
            }
        }

        static {
            onExtraCallback = 0;
            onExtraCallback();
            IAuthTabCallback = new IAuthTabCallback();
            int i = onNavigationEvent + 91;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }

        private IAuthTabCallback() {
        }

        public static /* synthetic */ Uri IAuthTabCallback(IAuthTabCallback iAuthTabCallback, String str, String str2, String str3, int i, Object obj) {
            int i2 = 2 % 2;
            if ((i & 4) != 0) {
                int i3 = IAuthTabCallbackStub + 21;
                int i4 = i3 % 128;
                onExtraCallbackWithResult = i4;
                Object obj2 = null;
                if (i3 % 2 != 0) {
                    obj2.hashCode();
                    throw null;
                }
                int i5 = i4 + 119;
                IAuthTabCallbackStub = i5 % 128;
                int i6 = i5 % 2;
                str3 = null;
            }
            return iAuthTabCallback.onNavigationEvent(str, str2, str3);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0071  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Uri onNavigationEvent(@NotNull String str, @Nullable String str2, @Nullable String str3) throws Throwable {
            Object obj;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 15;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Object[] objArr = new Object[1];
            a(53 - View.combineMeasuredStates(0, 0), (Process.myTid() >> 22) + 18, new char[]{65535, 65483, 1, '\t', 11, 4, 65483, 65483, 65494, 15, 15, 11, 16, 14, 1, '\f', 17, 15, 0, 0, 65533, 65483, 21, 14, 11, 3, 1, 16, 65533, 65535, 65483, '\n', 11, 5, 16, 65535, 65533, 15, '\n', 65533, 14, 16, 65483, '\n', 11, 5, 16, '\f', '\t', 17, 15, '\n', 11}, true, 124 - (ViewConfiguration.getTapTimeout() >> 16), objArr);
            Uri.Builder builderBuildUpon = Uri.parse(((String) objArr[0]).intern()).buildUpon();
            if (str3 != null && !StringsKt.isBlank(str3)) {
                builderBuildUpon.appendQueryParameter("id", str3);
            }
            if (str2 != null) {
                int i4 = IAuthTabCallbackStub + 11;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 13 / 0;
                    if (!StringsKt.isBlank(str2)) {
                        int i6 = onExtraCallbackWithResult + 63;
                        IAuthTabCallbackStub = i6 % 128;
                        if (i6 % 2 == 0) {
                            builderBuildUpon.appendQueryParameter("previous_screen", str2);
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                        builderBuildUpon.appendQueryParameter("previous_screen", str2);
                    }
                } else if (!StringsKt.isBlank(str2)) {
                }
            }
            if (!StringsKt.isBlank(str)) {
                int i7 = onExtraCallbackWithResult + 45;
                IAuthTabCallbackStub = i7 % 128;
                if (i7 % 2 == 0) {
                    Object[] objArr2 = new Object[1];
                    a(99 >> (ViewConfiguration.getZoomControlsTimeout() > 1L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 1L ? 0 : -1)), TextUtils.lastIndexOf("", 'D', 0, 1) + 77, new char[]{65530, 7, 7, 65530, 65531, 65530, 7, 7}, false, 6387 >>> TextUtils.indexOf("", "", 1, 1), objArr2);
                    obj = objArr2[0];
                } else {
                    Object[] objArr3 = new Object[1];
                    a(9 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0, 0) + 8, new char[]{65530, 7, 7, 65530, 65531, 65530, 7, 7}, true, 131 - TextUtils.indexOf("", "", 0, 0), objArr3);
                    obj = objArr3[0];
                }
                builderBuildUpon.appendQueryParameter(((String) obj).intern(), str);
            }
            Uri uriBuild = builderBuildUpon.build();
            Intrinsics.checkNotNullExpressionValue(uriBuild, "");
            return uriBuild;
        }

        private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
            float f;
            int i4;
            char[] cArr2;
            int i5 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
            char[] cArr3 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            int i6 = $10 + 25;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            while (true) {
                f = 0.0f;
                i4 = 2083011369;
                if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                    break;
                }
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
                cArr3[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
                int i8 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i8]), Integer.valueOf(onWarmupCompleted)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35124 - TextUtils.indexOf((CharSequence) "", '0')), ((byte) KeyEvent.getModifierMetaStateMask()) + 24, 10278 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    try {
                        Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                        if (objOnExtraCallback2 == null) {
                            byte b = (byte) 0;
                            byte b2 = b;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - TextUtils.indexOf("", "")), 55 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 2167 - View.combineMeasuredStates(0, 0), 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
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
            if (i2 > 0) {
                int i9 = $10 + 61;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
                char[] cArr4 = new char[i];
                System.arraycopy(cArr3, 0, cArr4, 0, i);
                System.arraycopy(cArr4, 0, cArr3, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
                System.arraycopy(cArr4, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr3, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            }
            if (!(!z)) {
                int i11 = $10 + 73;
                $11 = i11 % 128;
                if (i11 % 2 == 0) {
                    cArr2 = new char[i];
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 1;
                } else {
                    cArr2 = new char[i];
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
                }
                while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                    int i12 = $11 + 43;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr3[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                    try {
                        Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                        if (objOnExtraCallback3 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.myTid() >> 22) + 12843), 55 - (TypedValue.complexToFloat(0) > f ? 1 : (TypedValue.complexToFloat(0) == f ? 0 : -1)), 2167 - TextUtils.getTrimmedLength(""), 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        f = 0.0f;
                        i4 = 2083011369;
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                }
                int i14 = $11 + 101;
                $10 = i14 % 128;
                int i15 = i14 % 2;
                cArr3 = cArr2;
            }
            objArr[0] = new String(cArr3);
        }

        static void onExtraCallback() {
            onWarmupCompleted = 478308913;
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i4 = $11 + 93;
            $10 = i4 % 128;
            int i5 = 58224;
            if (i4 % 2 != 0) {
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            } else {
                cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            }
            int i6 = i3;
            while (i6 < 16) {
                int i7 = $10 + 25;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i9 = (c2 + i5) ^ ((c2 << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)));
                int i10 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onNavigationEvent);
                    objArr2[2] = Integer.valueOf(i10);
                    objArr2[1] = Integer.valueOf(i9);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char c3 = (char) (TypedValue.complexToFraction(i3, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i3, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int iResolveSize = View.resolveSize(i3, i3) + 10;
                        int iIndexOf = 12434 - TextUtils.indexOf("", "", i3, i3);
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c3, iResolveSize, iIndexOf, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallback)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), 10 - ExpandableListView.getPackedPositionGroup(0L), Color.blue(0) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i5 -= 40503;
                    i6++;
                    cArr3 = cArr4;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 16014), (ViewConfiguration.getJumpTapTimeout() >> 16) + 14, 19901 - (ViewConfiguration.getPressedStateDuration() >> 16), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        String str = new String(cArr2, 0, i);
        int i11 = $10 + 73;
        $11 = i11 % 128;
        int i12 = i11 % 2;
        objArr[0] = str;
    }

    static void onWarmupCompleted() {
        IAuthTabCallback = (char) 15551;
        onExtraCallback = (char) 26036;
        onExtraCallbackWithResult = (char) 6443;
        onNavigationEvent = (char) 32110;
    }
}
