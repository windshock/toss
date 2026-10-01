package o;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Patterns;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.alibaba.griver.base.common.utils.HexStringUtil;
import im.toss.tosssecurities.features.main.home.ui.view.section.overview.component.overlay.RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class onDetachedFromLayoutParams {
    private static JSONObject IAuthTabCallback = null;
    private static Map<String, String> onExtraCallback = null;
    private static Map<String, String> onExtraCallbackWithResult = null;
    private static boolean onNavigationEvent = false;
    private static Map<String, String> onWarmupCompleted;
    private static final byte[] $$a = {5, -4, -80, 1};
    private static final int $$b = 16;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 1;
    private static int IAuthTabCallbackDefault = 478308875;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, short s2, short s3) {
        int i2;
        int i3 = 4 - (s2 * 3);
        byte[] bArr = $$a;
        int i4 = 105 - (s3 * 4);
        int i5 = s * 2;
        byte[] bArr2 = new byte[1 - i5];
        int i6 = 0 - i5;
        if (bArr == null) {
            int i7 = i4;
            int i8 = 0;
            int i9 = i3;
            int i10 = i3 + i7;
            int i11 = i9 + 1;
            i2 = i8;
            i4 = i10;
            i3 = i11;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
                return new String(bArr2, 0);
            }
            int i12 = i4;
            i9 = i3;
            i3 = bArr[i3];
            i8 = i2 + 1;
            i7 = i12;
            int i102 = i3 + i7;
            int i112 = i9 + 1;
            i2 = i8;
            i4 = i102;
            i3 = i112;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
            }
        }
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i2, int i3, int i4, int i5, Object[] objArr, int i6, int i7) {
        int i8 = ~i7;
        int i9 = ~i6;
        int i10 = ~(i8 | i9);
        int i11 = ~(i4 | i6);
        int i12 = i10 | i11;
        int i13 = ~i4;
        int i14 = i10 | (~(i13 | i7)) | i11;
        int i15 = (~(i6 | i4 | i7)) | (~(i8 | i13 | i9));
        int i16 = i4 + i7 + i2 + (1322235619 * i5) + (440487356 * i3);
        int i17 = i16 * i16;
        int i18 = (((-1102165783) * i4) - 2100690944) + ((-281430247) * i7) + ((-820735536) * i12) + (i14 * 410367768) + (410367768 * i15) + ((-691798016) * i2) + ((-942931968) * i5) + ((-1410334720) * i3) + (1251606528 * i17);
        int i19 = (i4 * 157034417) + 1376579869 + (i7 * 157036385) + (i12 * (-1968)) + (i14 * 984) + (i15 * 984) + (i2 * 157035401) + (i5 * (-982187909)) + (i3 * (-1869533796)) + (i17 * (-899022848));
        return i18 + ((i19 * i19) * (-511311872)) != 1 ? IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr);
    }

    onDetachedFromLayoutParams() {
    }

    static void IAuthTabCallback(File file) {
        int i2 = 2 % 2;
        int i3 = asInterface + 89;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            convertResponseToCredentialManager.onExtraCallback(onDetachedFromLayoutParams.class);
            throw null;
        }
        if (convertResponseToCredentialManager.onExtraCallback(onDetachedFromLayoutParams.class)) {
            return;
        }
        try {
            try {
                IAuthTabCallback = new JSONObject();
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                fileInputStream.close();
                IAuthTabCallback = new JSONObject(new String(bArr, HexStringUtil.DEFAULT_CHARSET_NAME));
                HashMap map = new HashMap();
                onExtraCallback = map;
                Object[] objArr = new Object[1];
                a((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (Process.myTid() >> 22) + 1, new char[]{0}, true, View.resolveSizeAndState(0, 0, 0) + 83, objArr);
                map.put("ENGLISH", ((String) objArr[0]).intern());
                Map<String, String> map2 = onExtraCallback;
                Object[] objArr2 = new Object[1];
                a((ViewConfiguration.getLongPressTimeout() >> 16) + 1, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), new char[]{0}, true, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 83, objArr2);
                map2.put("GERMAN", ((String) objArr2[0]).intern());
                onExtraCallback.put("SPANISH", "3");
                onExtraCallback.put("JAPANESE", "4");
                HashMap map3 = new HashMap();
                onExtraCallbackWithResult = map3;
                Object[] objArr3 = new Object[1];
                a(View.resolveSize(0, 0) + 1, (ViewConfiguration.getFadingEdgeLength() >> 16) + 1, new char[]{0}, false, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 81, objArr3);
                map3.put("VIEW_CONTENT", ((String) objArr3[0]).intern());
                Map<String, String> map4 = onExtraCallbackWithResult;
                Object[] objArr4 = new Object[1];
                a(1 - Color.alpha(0), 1 - View.MeasureSpec.makeMeasureSpec(0, 0), new char[]{0}, true, 83 - (Process.myPid() >> 22), objArr4);
                map4.put("SEARCH", ((String) objArr4[0]).intern());
                Map<String, String> map5 = onExtraCallbackWithResult;
                Object[] objArr5 = new Object[1];
                a((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (ViewConfiguration.getLongPressTimeout() >> 16) + 1, new char[]{0}, true, 84 - TextUtils.indexOf("", "", 0), objArr5);
                map5.put("ADD_TO_CART", ((String) objArr5[0]).intern());
                onExtraCallbackWithResult.put("ADD_TO_WISHLIST", "3");
                onExtraCallbackWithResult.put("INITIATE_CHECKOUT", "4");
                onExtraCallbackWithResult.put("ADD_PAYMENT_INFO", "5");
                onExtraCallbackWithResult.put("PURCHASE", "6");
                onExtraCallbackWithResult.put("LEAD", "7");
                onExtraCallbackWithResult.put("COMPLETE_REGISTRATION", "8");
                HashMap map6 = new HashMap();
                onWarmupCompleted = map6;
                Object[] objArr6 = new Object[1];
                a(KeyEvent.keyCodeFromString("") + 1, '1' - AndroidCharacter.getMirror('0'), new char[]{0}, true, Color.alpha(0) + 83, objArr6);
                map6.put("BUTTON_TEXT", ((String) objArr6[0]).intern());
                Map<String, String> map7 = onWarmupCompleted;
                Object[] objArr7 = new Object[1];
                a(1 - (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1, new char[]{0}, true, 84 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr7);
                map7.put("PAGE_TITLE", ((String) objArr7[0]).intern());
                onWarmupCompleted.put("RESOLVED_DOCUMENT_LINK", "3");
                onWarmupCompleted.put("BUTTON_ID", "4");
                onNavigationEvent = true;
                int i4 = asInterface + 51;
                IAuthTabCallbackStub = i4 % 128;
                if (i4 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, onDetachedFromLayoutParams.class);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        r1 = o.onDetachedFromLayoutParams.onNavigationEvent;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        r2 = o.onDetachedFromLayoutParams.asInterface + 105;
        o.onDetachedFromLayoutParams.IAuthTabCallbackStub = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        o.convertResponseToCredentialManager.onExtraCallbackWithResult(r0, o.onDetachedFromLayoutParams.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if ((!o.convertResponseToCredentialManager.onExtraCallback(o.onDetachedFromLayoutParams.class)) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        if (o.convertResponseToCredentialManager.onExtraCallback(o.onDetachedFromLayoutParams.class) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static boolean onNavigationEvent() {
        int i2 = 2 % 2;
        int i3 = asInterface + 95;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 6 / 0;
        }
    }

    static String IAuthTabCallback(String str, String str2, String str3) {
        int i2 = 2 % 2;
        if (!(!convertResponseToCredentialManager.onExtraCallback(onDetachedFromLayoutParams.class))) {
            int i3 = IAuthTabCallbackStub + 107;
            int i4 = i3 % 128;
            asInterface = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 59;
            IAuthTabCallbackStub = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 58 / 0;
            }
            return null;
        }
        try {
            return (str3 + " | " + str2 + ", " + str).toLowerCase();
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, onDetachedFromLayoutParams.class);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i2, int i3, char[] cArr, boolean z, int i4, Object[] objArr) throws Throwable {
        int i5;
        Throwable cause;
        int i6 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i2];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i5 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i2) {
                break;
            }
            int i7 = $10 + 33;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i4 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i9 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i9]), Integer.valueOf(IAuthTabCallbackDefault)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "", 0, 0) + 35125), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 22, Color.alpha(0) + 10278, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i9] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    char c = (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 12843);
                    int iAlpha = Color.alpha(0) + 55;
                    int iAxisFromString = MotionEvent.axisFromString("") + 2168;
                    byte b = (byte) ($$a[3] - 1);
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c, iAlpha, iAxisFromString, 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
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
        if (i3 > 0) {
            int i10 = $10 + 61;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i3;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            int i12 = $11 + 49;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            char[] cArr4 = new char[i2];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i2) {
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                if (objOnExtraCallback3 == null) {
                    char cRed = (char) (12843 - Color.red(0));
                    int scrollDefaultDelay = 55 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                    int i14 = 2167 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    byte b3 = (byte) ($$a[3] - 1);
                    byte b4 = b3;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cRed, scrollDefaultDelay, i14, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i5 = 2083011369;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    static float[] onExtraCallbackWithResult(JSONObject jSONObject, String str) {
        String lowerCase;
        JSONObject jSONObject2;
        String strOptString;
        JSONArray jSONArray;
        JSONObject jSONObjectOnExtraCallbackWithResult;
        int i2 = 2 % 2;
        if (convertResponseToCredentialManager.onExtraCallback(onDetachedFromLayoutParams.class)) {
            int i3 = asInterface + 67;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            return null;
        }
        try {
            if (!onNavigationEvent) {
                return null;
            }
            float[] fArr = new float[30];
            Arrays.fill(fArr, 0.0f);
            try {
                lowerCase = str.toLowerCase();
                jSONObject2 = new JSONObject(jSONObject.optJSONObject("view").toString());
                strOptString = jSONObject.optString("screenname");
                jSONArray = new JSONArray();
                int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
                ((Boolean) onExtraCallbackWithResult(iOnExtraCallbackWithResult2, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 661836223, iOnExtraCallbackWithResult3, new Object[]{jSONObject2, jSONArray}, iOnExtraCallbackWithResult, -661836223)).booleanValue();
                onExtraCallback(fArr, onNavigationEvent(jSONObject2));
                jSONObjectOnExtraCallbackWithResult = onExtraCallbackWithResult(jSONObject2);
            } catch (JSONException unused) {
            }
            if (jSONObjectOnExtraCallbackWithResult != null) {
                onExtraCallback(fArr, onWarmupCompleted(jSONObjectOnExtraCallbackWithResult, jSONArray, strOptString, jSONObject2.toString(), lowerCase));
                return fArr;
            }
            int i5 = asInterface + 73;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            return null;
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, onDetachedFromLayoutParams.class);
            int i7 = asInterface + 51;
            IAuthTabCallbackStub = i7 % 128;
            if (i7 % 2 == 0) {
                return null;
            }
            throw null;
        }
    }

    private static float[] onNavigationEvent(JSONObject jSONObject) {
        int i2 = 2 % 2;
        int i3 = asInterface + 65;
        IAuthTabCallbackStub = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            convertResponseToCredentialManager.onExtraCallback(onDetachedFromLayoutParams.class);
            obj.hashCode();
            throw null;
        }
        if (convertResponseToCredentialManager.onExtraCallback(onDetachedFromLayoutParams.class)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            Arrays.fill(fArr, 0.0f);
            Object[] objArr = new Object[1];
            a(4 - KeyEvent.getDeadChar(0, 0), Color.alpha(0) + 2, new char[]{7, 3, 3, 65524}, false, (KeyEvent.getMaxKeyCode() >> 16) + 147, objArr);
            String lowerCase = jSONObject.optString(((String) objArr[0]).intern()).toLowerCase();
            String lowerCase2 = jSONObject.optString("hint").toLowerCase();
            String lowerCase3 = jSONObject.optString("classname").toLowerCase();
            int iOptInt = jSONObject.optInt("inputtype", -1);
            String[] strArr = {lowerCase, lowerCase2};
            if (onNavigationEvent(new String[]{"$", "amount", "price", "total"}, strArr)) {
                fArr[0] = (float) (fArr[0] + 1.0d);
            }
            if (onNavigationEvent(new String[]{"password", "pwd"}, strArr)) {
                fArr[1] = (float) (fArr[1] + 1.0d);
            }
            if (onNavigationEvent(new String[]{"tel", "phone"}, strArr)) {
                fArr[2] = (float) (fArr[2] + 1.0d);
            }
            if (onNavigationEvent(new String[]{"search"}, strArr)) {
                fArr[4] = (float) (fArr[4] + 1.0d);
                int i4 = IAuthTabCallbackStub + 69;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
            }
            if (iOptInt >= 0) {
                int i6 = IAuthTabCallbackStub + 79;
                asInterface = i6 % 128;
                if (i6 % 2 == 0) {
                    fArr[3] = (float) (fArr[4] / 0.0d);
                } else {
                    fArr[5] = (float) (fArr[5] + 1.0d);
                }
            }
            if (iOptInt == 3 || iOptInt == 2) {
                fArr[6] = (float) (fArr[6] + 1.0d);
            }
            if (iOptInt == 32 || Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                fArr[7] = (float) (fArr[7] + 1.0d);
            }
            if (lowerCase3.contains("checkbox")) {
                fArr[8] = (float) (fArr[8] + 1.0d);
            }
            if (onNavigationEvent(new String[]{"complete", "confirm", "done", "submit"}, new String[]{lowerCase})) {
                fArr[10] = (float) (fArr[10] + 1.0d);
                int i7 = asInterface + 31;
                IAuthTabCallbackStub = i7 % 128;
                int i8 = i7 % 2;
            }
            if (lowerCase3.contains("radio")) {
                Object[] objArr2 = new Object[1];
                a((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 6, TextUtils.lastIndexOf("", '0', 0) + 5, new char[]{5, 5, 0, 65535, 65523, 6}, false, 144 - TextUtils.lastIndexOf("", '0'), objArr2);
                if (lowerCase3.contains(((String) objArr2[0]).intern())) {
                    fArr[12] = (float) (fArr[12] + 1.0d);
                }
            }
            try {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childviews");
                int length = jSONArrayOptJSONArray.length();
                for (int i9 = 0; i9 < length; i9++) {
                    onExtraCallback(fArr, onNavigationEvent(jSONArrayOptJSONArray.getJSONObject(i9)));
                }
            } catch (JSONException unused) {
            }
            return fArr;
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, onDetachedFromLayoutParams.class);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x01bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static float[] onWarmupCompleted(JSONObject jSONObject, JSONArray jSONArray, String str, String str2, String str3) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        int i2 = 2 % 2;
        if (convertResponseToCredentialManager.onExtraCallback(onDetachedFromLayoutParams.class)) {
            int i3 = IAuthTabCallbackStub + 83;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            return null;
        }
        try {
            float[] fArr = new float[30];
            Arrays.fill(fArr, 0.0f);
            fArr[3] = jSONArray.length() > 1 ? r12 - 1 : 0;
            for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                try {
                    if (IAuthTabCallback(jSONArray.getJSONObject(i5))) {
                        fArr[9] = fArr[9] + 1.0f;
                    }
                } catch (JSONException unused) {
                }
            }
            fArr[13] = -1.0f;
            fArr[14] = -1.0f;
            String str4 = str + '|' + str3;
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            IAuthTabCallback(jSONObject, sb2, sb);
            String string = sb.toString();
            String string2 = sb2.toString();
            if (((Boolean) onExtraCallbackWithResult(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 741567264, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{"ENGLISH", "COMPLETE_REGISTRATION", "BUTTON_TEXT", string2}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -741567263)).booleanValue()) {
                int i6 = asInterface + 57;
                IAuthTabCallbackStub = i6 % 128;
                int i7 = i6 % 2;
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            fArr[15] = f;
            if (((Boolean) onExtraCallbackWithResult(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 741567264, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{"ENGLISH", "COMPLETE_REGISTRATION", "PAGE_TITLE", str4}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -741567263)).booleanValue()) {
                int i8 = asInterface + 61;
                IAuthTabCallbackStub = i8 % 128;
                int i9 = i8 % 2;
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            fArr[16] = f2;
            fArr[17] = ((Boolean) onExtraCallbackWithResult(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 741567264, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{"ENGLISH", "COMPLETE_REGISTRATION", "BUTTON_ID", string}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -741567263)).booleanValue() ? 1.0f : 0.0f;
            fArr[18] = !str2.contains("password") ? 0.0f : 1.0f;
            fArr[19] = !(onExtraCallbackWithResult("(?i)(confirm.*password)|(password.*(confirmation|confirm)|confirmation)", str2) ^ true) ? 1.0f : 0.0f;
            if (onExtraCallbackWithResult("(?i)(sign in)|login|signIn", str2)) {
                int i10 = asInterface + 49;
                IAuthTabCallbackStub = i10 % 128;
                int i11 = i10 % 2;
                f3 = 1.0f;
            } else {
                f3 = 0.0f;
            }
            fArr[20] = f3;
            if (onExtraCallbackWithResult("(?i)(sign.*(up|now)|registration|register|(create|apply).*(profile|account)|open.*account|account.*(open|creation|application)|enroll|join.*now)", str2)) {
                int i12 = IAuthTabCallbackStub + 59;
                asInterface = i12 % 128;
                f4 = i12 % 2 == 0 ? 2.0f : 1.0f;
            } else {
                f4 = 0.0f;
            }
            fArr[21] = f4;
            if (((Boolean) onExtraCallbackWithResult(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 741567264, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{"ENGLISH", "PURCHASE", "BUTTON_TEXT", string2}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -741567263)).booleanValue()) {
                int i13 = asInterface + 21;
                IAuthTabCallbackStub = i13 % 128;
                f5 = i13 % 2 != 0 ? 0.0f : 1.0f;
            }
            fArr[22] = f5;
            fArr[24] = ((Boolean) onExtraCallbackWithResult(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 741567264, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{"ENGLISH", "PURCHASE", "PAGE_TITLE", str4}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -741567263)).booleanValue() ? 1.0f : 0.0f;
            if (onExtraCallbackWithResult("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart", string2)) {
                int i14 = asInterface + 111;
                IAuthTabCallbackStub = i14 % 128;
                int i15 = i14 % 2;
                f6 = 1.0f;
            } else {
                f6 = 0.0f;
            }
            fArr[25] = f6;
            fArr[27] = onExtraCallbackWithResult("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart|shop|buy", str4) ? 1.0f : 0.0f;
            fArr[28] = ((Boolean) onExtraCallbackWithResult(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 741567264, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{"ENGLISH", "LEAD", "BUTTON_TEXT", string2}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -741567263)).booleanValue() ^ true ? 0.0f : 1.0f;
            fArr[29] = ((Boolean) onExtraCallbackWithResult(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 741567264, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{"ENGLISH", "LEAD", "PAGE_TITLE", str4}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -741567263)).booleanValue() ? 1.0f : 0.0f;
            int i16 = asInterface + 25;
            IAuthTabCallbackStub = i16 % 128;
            if (i16 % 2 == 0) {
                return fArr;
            }
            throw null;
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, onDetachedFromLayoutParams.class);
            return null;
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        String str3 = (String) objArr[2];
        String str4 = (String) objArr[3];
        int i2 = 2 % 2;
        if (convertResponseToCredentialManager.onExtraCallback(onDetachedFromLayoutParams.class)) {
            int i3 = asInterface + 83;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        try {
            boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult(IAuthTabCallback.optJSONObject("rulesForLanguage").optJSONObject(onExtraCallback.get(str)).optJSONObject("rulesForEvent").optJSONObject(onExtraCallbackWithResult.get(str2)).optJSONObject("positiveRules").optString(onWarmupCompleted.get(str3)), str4);
            int i5 = asInterface + 5;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            return Boolean.valueOf(zOnExtraCallbackWithResult);
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, onDetachedFromLayoutParams.class);
            return false;
        }
    }

    private static boolean onExtraCallbackWithResult(String str, String str2) {
        int i2 = 2 % 2;
        if (!convertResponseToCredentialManager.onExtraCallback(onDetachedFromLayoutParams.class)) {
            try {
                return Pattern.compile(str).matcher(str2).find();
            } catch (Throwable th) {
                convertResponseToCredentialManager.onExtraCallbackWithResult(th, onDetachedFromLayoutParams.class);
                return false;
            }
        }
        int i3 = IAuthTabCallbackStub + 9;
        int i4 = i3 % 128;
        asInterface = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 23;
        IAuthTabCallbackStub = i6 % 128;
        if (i6 % 2 == 0) {
            return false;
        }
        throw null;
    }

    private static boolean onNavigationEvent(String[] strArr, String[] strArr2) {
        int i2 = 2 % 2;
        int i3 = asInterface + 3;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        if (convertResponseToCredentialManager.onExtraCallback(onDetachedFromLayoutParams.class)) {
            return false;
        }
        try {
            int length = strArr.length;
            int i5 = 0;
            while (i5 < length) {
                String str = strArr[i5];
                for (String str2 : strArr2) {
                    if (str2.contains(str)) {
                        return true;
                    }
                }
                i5++;
                int i6 = IAuthTabCallbackStub + 43;
                asInterface = i6 % 128;
                int i7 = i6 % 2;
            }
            int i8 = asInterface + 119;
            IAuthTabCallbackStub = i8 % 128;
            int i9 = i8 % 2;
            return false;
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, onDetachedFromLayoutParams.class);
            return false;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        boolean z;
        int i2 = 0;
        JSONObject jSONObject = (JSONObject) objArr[0];
        JSONArray jSONArray = (JSONArray) objArr[1];
        int i3 = 2 % 2;
        if (convertResponseToCredentialManager.onExtraCallback(onDetachedFromLayoutParams.class)) {
            int i4 = asInterface + 117;
            IAuthTabCallbackStub = i4 % 128;
            return i4 % 2 != 0;
        }
        try {
            if (!(!jSONObject.optBoolean("is_interacted"))) {
                int i5 = asInterface + 23;
                IAuthTabCallbackStub = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childviews");
            int i7 = 0;
            while (true) {
                if (i7 >= jSONArrayOptJSONArray.length()) {
                    z = false;
                    break;
                }
                int i8 = asInterface + 111;
                IAuthTabCallbackStub = i8 % 128;
                int i9 = i8 % 2;
                if (jSONArrayOptJSONArray.getJSONObject(i7).optBoolean("is_interacted")) {
                    z = true;
                    break;
                }
                i7++;
            }
            JSONArray jSONArray2 = new JSONArray();
            if (!z) {
                while (i2 < jSONArrayOptJSONArray.length()) {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i2);
                    if (((Boolean) onExtraCallbackWithResult(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 661836223, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{jSONObject2, jSONArray}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -661836223)).booleanValue()) {
                        int i10 = asInterface + 71;
                        IAuthTabCallbackStub = i10 % 128;
                        int i11 = i10 % 2;
                        jSONArray2.put(jSONObject2);
                        z = true;
                    }
                    i2++;
                }
                jSONObject.put("childviews", jSONArray2);
                return Boolean.valueOf(z);
            }
            int i12 = asInterface + 125;
            IAuthTabCallbackStub = i12 % 128;
            int i13 = i12 % 2;
            while (i2 < jSONArrayOptJSONArray.length()) {
                int i14 = IAuthTabCallbackStub + 105;
                asInterface = i14 % 128;
                if (i14 % 2 == 0) {
                    jSONArray.put(jSONArrayOptJSONArray.getJSONObject(i2));
                    i2 += 60;
                } else {
                    jSONArray.put(jSONArrayOptJSONArray.getJSONObject(i2));
                    i2++;
                }
                int i15 = IAuthTabCallbackStub + 11;
                asInterface = i15 % 128;
                if (i15 % 2 == 0) {
                    int i16 = 5 / 4;
                }
            }
            return true;
        } catch (JSONException unused) {
            return false;
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, onDetachedFromLayoutParams.class);
            return false;
        }
    }

    private static void onExtraCallback(float[] fArr, float[] fArr2) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 65;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        if (!convertResponseToCredentialManager.onExtraCallback(onDetachedFromLayoutParams.class)) {
            int i5 = IAuthTabCallbackStub + 91;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 0;
            while (i7 < fArr.length) {
                try {
                    fArr[i7] = fArr[i7] + fArr2[i7];
                    i7++;
                    int i8 = asInterface + 25;
                    IAuthTabCallbackStub = i8 % 128;
                    int i9 = i8 % 2;
                } catch (Throwable th) {
                    convertResponseToCredentialManager.onExtraCallbackWithResult(th, onDetachedFromLayoutParams.class);
                    return;
                }
            }
        }
    }

    private static boolean IAuthTabCallback(JSONObject jSONObject) {
        int i2 = 2 % 2;
        if (convertResponseToCredentialManager.onExtraCallback(onDetachedFromLayoutParams.class)) {
            int i3 = asInterface + 79;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        try {
            if ((jSONObject.optInt("classtypebitmask") & 32) <= 0) {
                return false;
            }
            int i5 = asInterface + 125;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            return true;
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, onDetachedFromLayoutParams.class);
            return false;
        }
    }

    private static void IAuthTabCallback(JSONObject jSONObject, StringBuilder sb, StringBuilder sb2) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 47;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            convertResponseToCredentialManager.onExtraCallback(onDetachedFromLayoutParams.class);
            throw null;
        }
        if (convertResponseToCredentialManager.onExtraCallback(onDetachedFromLayoutParams.class)) {
            return;
        }
        int i4 = IAuthTabCallbackStub + 113;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        try {
            Object[] objArr = new Object[1];
            a(4 - Drawable.resolveOpacity(0, 0), 2 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), new char[]{7, 3, 3, 65524}, false, 146 - TextUtils.lastIndexOf("", '0', 0, 0), objArr);
            String lowerCase = jSONObject.optString(((String) objArr[0]).intern(), "").toLowerCase();
            String lowerCase2 = jSONObject.optString("hint", "").toLowerCase();
            if (!lowerCase.isEmpty()) {
                sb.append(lowerCase);
                sb.append(" ");
                int i6 = asInterface + 67;
                IAuthTabCallbackStub = i6 % 128;
                int i7 = i6 % 2;
            }
            if (!lowerCase2.isEmpty()) {
                sb2.append(lowerCase2);
                sb2.append(" ");
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childviews");
            if (jSONArrayOptJSONArray != null) {
                for (int i8 = 0; i8 < jSONArrayOptJSONArray.length(); i8++) {
                    int i9 = asInterface + 1;
                    IAuthTabCallbackStub = i9 % 128;
                    if (i9 % 2 != 0) {
                        try {
                            IAuthTabCallback(jSONArrayOptJSONArray.getJSONObject(i8), sb, sb2);
                            int i10 = 69 / 0;
                        } catch (JSONException unused) {
                        }
                    } else {
                        IAuthTabCallback(jSONArrayOptJSONArray.getJSONObject(i8), sb, sb2);
                    }
                }
            }
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, onDetachedFromLayoutParams.class);
        }
    }

    private static JSONObject onExtraCallbackWithResult(JSONObject jSONObject) {
        int i2 = 2 % 2;
        if (convertResponseToCredentialManager.onExtraCallback(onDetachedFromLayoutParams.class)) {
            int i3 = asInterface + 57;
            IAuthTabCallbackStub = i3 % 128;
            if (i3 % 2 == 0) {
                return null;
            }
            throw null;
        }
        try {
        } catch (JSONException unused) {
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, onDetachedFromLayoutParams.class);
        }
        if (!(!jSONObject.optBoolean("is_interacted"))) {
            return jSONObject;
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childviews");
        if (jSONArrayOptJSONArray == null) {
            return null;
        }
        int i4 = asInterface + 71;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        for (int i6 = 0; i6 < jSONArrayOptJSONArray.length(); i6++) {
            JSONObject jSONObjectOnExtraCallbackWithResult = onExtraCallbackWithResult(jSONArrayOptJSONArray.getJSONObject(i6));
            if (jSONObjectOnExtraCallbackWithResult != null) {
                return jSONObjectOnExtraCallbackWithResult;
            }
        }
        return null;
    }

    private static boolean onExtraCallback(JSONObject jSONObject, JSONArray jSONArray) {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        return ((Boolean) onExtraCallbackWithResult(iOnExtraCallbackWithResult2, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 661836223, iOnExtraCallbackWithResult3, new Object[]{jSONObject, jSONArray}, iOnExtraCallbackWithResult, -661836223)).booleanValue();
    }

    private static boolean onExtraCallback(String str, String str2, String str3, String str4) {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        return ((Boolean) onExtraCallbackWithResult(iOnExtraCallbackWithResult2, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 741567264, iOnExtraCallbackWithResult3, new Object[]{str, str2, str3, str4}, iOnExtraCallbackWithResult, -741567263)).booleanValue();
    }
}
