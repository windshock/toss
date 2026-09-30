package com.bytedance.adsdk.zb.lud;

import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda2;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class ry {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 1;
    private static int onWarmupCompleted;
    private static char[] onExtraCallbackWithResult = {32458, 32457, 32460, 32465, 32472, 32473, 32420};
    private static int onExtraCallback = -1184334011;
    private static boolean onNavigationEvent = true;
    private static boolean IAuthTabCallback = true;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static com.bytedance.adsdk.zb.sya.dj ycx(JsonReader jsonReader, com.bytedance.adsdk.zb.ul ulVar) throws IOException {
        int i2;
        int i3 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        jsonReader.beginObject();
        double dNextDouble = 0.0d;
        double dNextDouble2 = 0.0d;
        String strNextString = null;
        String strNextString2 = null;
        char cCharAt = 0;
        while (jsonReader.hasNext()) {
            int i4 = onWarmupCompleted + 33;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            String strNextName = jsonReader.nextName();
            switch (strNextName.hashCode()) {
                case -1866931350:
                    if (!strNextName.equals("fFamily")) {
                        i2 = -1;
                        break;
                    } else {
                        i2 = 0;
                        break;
                    }
                case 119:
                    if (strNextName.equals("w")) {
                        int i6 = asBinder + 111;
                        onWarmupCompleted = i6 % 128;
                        i2 = (i6 % 2 != 0 ? 1 : 0) ^ 1;
                        break;
                    }
                    break;
                case 3173:
                    if (strNextName.equals("ch")) {
                        int i7 = onWarmupCompleted + 87;
                        asBinder = i7 % 128;
                        int i8 = i7 % 2;
                        i2 = 2;
                        break;
                    }
                    break;
                case 3076010:
                    Object[] objArr = new Object[1];
                    a(null, null, new byte[]{-121, -126, -121, -122}, 127 - (ViewConfiguration.getTouchSlop() >> 8), objArr);
                    if (strNextName.equals(((String) objArr[0]).intern())) {
                        int i9 = onWarmupCompleted + 57;
                        asBinder = i9 % 128;
                        int i10 = i9 % 2;
                        i2 = 3;
                        break;
                    }
                    break;
                case 3530753:
                    if (strNextName.equals("size")) {
                        int i11 = onWarmupCompleted + 7;
                        int i12 = i11 % 128;
                        asBinder = i12;
                        i2 = i11 % 2 == 0 ? 3 : 4;
                        int i13 = i12 + 75;
                        onWarmupCompleted = i13 % 128;
                        int i14 = i13 % 2;
                        break;
                    }
                    break;
                case 109780401:
                    Object[] objArr2 = new Object[1];
                    a(null, null, new byte[]{-123, -124, -125, -126, -127}, View.MeasureSpec.getMode(0) + 127, objArr2);
                    if (strNextName.equals(((String) objArr2[0]).intern())) {
                        i2 = 5;
                        break;
                    }
                    break;
            }
            if (i2 == 0) {
                strNextString2 = jsonReader.nextString();
            } else if (i2 == 1) {
                dNextDouble2 = jsonReader.nextDouble();
            } else if (i2 == 2) {
                cCharAt = jsonReader.nextString().charAt(0);
            } else if (i2 == 3) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    int i15 = onWarmupCompleted + 95;
                    asBinder = i15 % 128;
                    int i16 = i15 % 2;
                    if ("shapes".equals(jsonReader.nextName())) {
                        int i17 = asBinder + 83;
                        onWarmupCompleted = i17 % 128;
                        if (i17 % 2 != 0) {
                            jsonReader.beginArray();
                            int i18 = 27 / 0;
                        } else {
                            jsonReader.beginArray();
                        }
                        while (jsonReader.hasNext()) {
                            arrayList.add((com.bytedance.adsdk.zb.sya.zb.dy) fby.ycx(jsonReader, ulVar));
                        }
                        jsonReader.endArray();
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
            } else if (i2 == 4) {
                dNextDouble = jsonReader.nextDouble();
            } else if (i2 != 5) {
                jsonReader.skipValue();
            } else {
                strNextString = jsonReader.nextString();
            }
        }
        jsonReader.endObject();
        return new com.bytedance.adsdk.zb.sya.dj(arrayList, cCharAt, dNextDouble, dNextDouble2, strNextString, strNextString2);
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = onExtraCallbackWithResult;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), TextUtils.indexOf((CharSequence) "", '0', 0) + 78, 20951 - ((byte) KeyEvent.getModifierMetaStateMask()), 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(onExtraCallback)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - MotionEvent.axisFromString("")), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 75, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 16037, -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
            int i5 = 1052772399;
            if (IAuthTabCallback) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i2] - iIntValue);
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - MotionEvent.axisFromString("")), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 62, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    i5 = 1052772399;
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!onNavigationEvent) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    int i6 = $10 + 83;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i2] - iIntValue);
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            int i8 = $11 + 101;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i10 = $11 + 119;
                $10 = i10 % 128;
                if (i10 % 2 != 0) {
                    cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback * defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] << i2] >> iIntValue);
                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myPid() >> 22), 64 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), View.MeasureSpec.makeMeasureSpec(0, 0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                } else {
                    cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i2] - iIntValue);
                    Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getSize(0), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 63, (Process.myPid() >> 22) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback5).invoke(null, objArr6);
                }
            }
            objArr[0] = new String(cArr6);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }
}
