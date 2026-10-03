package o;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.JsonObject;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_API_GetLicenseTime implements ALCFaceQuality {
    private static final byte[] $$a = {115, 102, 60, 8};
    private static final int $$b = 233;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    private static char[] IAuthTabCallback = {19330, 19961, 18273, 22766, 21057, 27609, 27972, 26311, 30798, 29134, 9417, 8838, 10244, 14228, 15645, 1203, 553, 2481, 6002, 7864, 25665, 25563, 26962, 28831, 32352, 17896, 17273, 19194, 20607, 24079, 42446, 41805, 43740, 7871, 6368, 4715, 3522, 1903, 16069, 14424, 13281, 11591, 9432, 24121, 22974, 21288, 19100, 17425, 32657, 31007, 28800, 27164, 25689, 40959, 39273, 37096, 35417, 34263, 48969};
    private static long onExtraCallbackWithResult = 2347771108330367917L;

    private static String $$c(int i, int i2, int i3) {
        int i4 = 4 - (i2 * 2);
        int i5 = (i3 * 3) + 97;
        int i6 = i * 3;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i6];
        int i7 = 0 - i6;
        int i8 = -1;
        if (bArr == null) {
            i4++;
            i5 = i4 + (-i5);
        }
        while (true) {
            int i9 = i5;
            int i10 = i4;
            i8++;
            bArr2[i8] = (byte) i9;
            if (i8 == i7) {
                return new String(bArr2, 0);
            }
            i4 = i10 + 1;
            i5 = i9 + (-bArr[i10]);
        }
    }

    public /* bridge */ onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        onOutOfMemory onoutofmemoryOnExtraCallback = super/*o.drawTextBox*/.onExtraCallback();
        int i4 = onExtraCallback + 77;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return onoutofmemoryOnExtraCallback;
    }

    @Deprecated
    public /* bridge */ void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 49;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        super.onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, bundle, uri);
        if (i5 != 0) {
            int i6 = 45 / 0;
        }
        int i7 = onExtraCallback + 57;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 91 / 0;
        }
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 17;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
        int i4 = onExtraCallback + 23;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return zOnExtraCallbackWithResult;
    }

    public /* bridge */ boolean onNavigationEvent() {
        boolean zOnNavigationEvent;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 121;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            zOnNavigationEvent = super/*o.drawTextBox*/.onNavigationEvent();
            int i3 = 29 / 0;
        } else {
            zOnNavigationEvent = super/*o.drawTextBox*/.onNavigationEvent();
        }
        int i4 = onExtraCallback + 29;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return zOnNavigationEvent;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 113;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super/*o.drawTextBox*/.onWarmupCompleted(str);
        int i4 = onWarmupCompleted + 73;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return aLCFaceValidationOnWarmupCompleted;
        }
        throw null;
    }

    public /* bridge */ void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 79;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        if (i5 == 0) {
            throw null;
        }
    }

    public void onExtraCallbackWithResult(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        getNativeModuleIteratorReactAndroid_release getnativemoduleiteratorreactandroid_release;
        UST_API_GetLastError uST_API_GetLastError;
        UST_API_GetLastError uST_API_GetLastError2;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        setText settext = new setText(jsonObject);
        getNativeModuleIteratorReactAndroid_release[] getnativemoduleiteratorreactandroid_releaseArrValues = getNativeModuleIteratorReactAndroid_release.values();
        int length = getnativemoduleiteratorreactandroid_releaseArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                getnativemoduleiteratorreactandroid_release = null;
                break;
            }
            getnativemoduleiteratorreactandroid_release = getnativemoduleiteratorreactandroid_releaseArrValues[i2];
            String strName = getnativemoduleiteratorreactandroid_release.name();
            Object[] objArr = new Object[1];
            a(ViewConfiguration.getLongPressTimeout() >> 16, TextUtils.lastIndexOf("", '0') + 11, (char) (Color.red(0) + 42549), objArr);
            if (Intrinsics.areEqual(strName, settext.onNavigationEvent(((String) objArr[0]).intern(), ""))) {
                break;
            } else {
                i2++;
            }
        }
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        StringBuilder sb = new StringBuilder();
        Object[] objArr2 = new Object[1];
        a(10 - (ViewConfiguration.getScrollBarSize() >> 8), Drawable.resolveOpacity(0, 0) + 23, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 51535), objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(getnativemoduleiteratorreactandroid_release);
        Object[] objArr3 = new Object[1];
        a(AndroidCharacter.getMirror('0') - 15, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 26, (char) (62270 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), objArr3);
        ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, ((String) objArr3[0]).intern(), sb.toString(), (Map) null, (String) null, false, (String) null, 60, (Object) null);
        if (r8lambdakrhaimf1bm5cgjbilhp45vln_xq instanceof UST_API_GetLastError) {
            uST_API_GetLastError = (UST_API_GetLastError) r8lambdakrhaimf1bm5cgjbilhp45vln_xq;
            int i3 = onExtraCallback + 91;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
        } else {
            uST_API_GetLastError = null;
        }
        if (uST_API_GetLastError == null) {
            int i5 = onExtraCallback + 65;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            UST_API_GetLastError activity = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getActivity();
            if (activity instanceof UST_API_GetLastError) {
                int i7 = onExtraCallback + 121;
                onWarmupCompleted = i7 % 128;
                if (i7 % 2 == 0) {
                    throw null;
                }
                uST_API_GetLastError2 = activity;
            } else {
                uST_API_GetLastError2 = null;
            }
        } else {
            uST_API_GetLastError2 = uST_API_GetLastError;
        }
        if (getnativemoduleiteratorreactandroid_release == null) {
            if (uST_API_GetLastError2 != null) {
                uST_API_GetLastError2.ICustomTabsServiceDefault();
            }
        } else if (uST_API_GetLastError2 != null) {
            int i8 = onWarmupCompleted + 43;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            uST_API_GetLastError2.onWarmupCompleted(getnativemoduleiteratorreactandroid_release);
        }
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i4 = $11 + 97;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(IAuthTabCallback[i << i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTapTimeout() >> 16) + 59697), 16 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 10972 - MotionEvent.axisFromString(""), 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(onExtraCallbackWithResult), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.green(0) + 46134), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 30, 20220 - (ViewConfiguration.getScrollBarSize() >> 8), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i5] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback3 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - Color.red(0)), 44 - (ViewConfiguration.getWindowTouchSlop() >> 8), 1542 - AndroidCharacter.getMirror('0'), -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                Object[] objArr5 = {Integer.valueOf(IAuthTabCallback[i + i6])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTouchSlop() >> 8) + 59697), 17 - KeyEvent.normalizeMetaState(0), 10974 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objOnExtraCallback4).invoke(null, objArr5)).longValue()), Long.valueOf(i6), Long.valueOf(onExtraCallbackWithResult), Integer.valueOf(c)};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 46133), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 31, Gravity.getAbsoluteGravity(0, 0) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objOnExtraCallback5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback6 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 49124), TextUtils.lastIndexOf("", '0', 0) + 45, 1494 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback6).invoke(null, objArr7);
            }
            int i7 = $10 + 113;
            $11 = i7 % 128;
            int i8 = i7 % 2;
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i9 = $10 + 43;
        $11 = i9 % 128;
        int i10 = i9 % 2;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i11 = $11 + 19;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            try {
                Object[] objArr8 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback7 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 49124), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 44, 1494 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback7).invoke(null, objArr8);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArr);
    }
}
