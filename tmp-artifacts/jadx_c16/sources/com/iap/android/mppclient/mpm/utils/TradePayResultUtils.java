package com.iap.android.mppclient.mpm.utils;

import android.graphics.Color;
import android.graphics.PointF;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.iap.android.mppclient.basic.log.ACLogEvent;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackGroupExternalSyntheticLambda0;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class TradePayResultUtils {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    public static final String RESULT_CODE_KEY = "resultCode";
    public static final String TRADE_PAY_CODE_PAY_CANCELED = "6001";
    public static final String TRADE_PAY_CODE_PAY_FAILED = "4000";
    public static final String TRADE_PAY_CODE_PAY_PROCESSING = "8000";
    public static final String TRADE_PAY_CODE_PAY_SUCCEED = "9000";
    private static int onNavigationEvent = 1;
    private static char[] onWarmupCompleted = {27236, 27162, 27165, 27165, 27138, 27146, 27149};

    public static JSONObject getTradePayResultJsonObject(String str) throws Throwable {
        String str2;
        int i = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        Object[] objArr = new Object[1];
        a(new int[]{0, 7, 0, 2}, true, new byte[]{1, 0, 0, 0, 0, 0, 0}, objArr);
        if (TextUtils.equals(((String) objArr[0]).intern(), str)) {
            int i2 = onNavigationEvent + 55;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            str2 = TRADE_PAY_CODE_PAY_SUCCEED;
        } else if (!(!TextUtils.equals("1004", str))) {
            int i4 = onNavigationEvent + 45;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            str2 = TRADE_PAY_CODE_PAY_CANCELED;
        } else if (TextUtils.equals("PROCESSING", str)) {
            int i6 = IAuthTabCallback + 115;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            str2 = TRADE_PAY_CODE_PAY_PROCESSING;
        } else {
            str2 = TRADE_PAY_CODE_PAY_FAILED;
        }
        try {
            jSONObject.put(RESULT_CODE_KEY, str2);
        } catch (Throwable unused) {
        }
        ACLogEvent.newLogger("mpp_mpm_launch_cnh5_jsapi_tradepay_end").addParams(RESULT_CODE_KEY, str2).event();
        return jSONObject;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        char[] cArr;
        char c;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr2 = onWarmupCompleted;
        Object obj = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i7 = 0; i7 < length; i7++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - View.getDefaultSize(0, 0)), 35 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr3[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i8 = $10 + 29;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i4];
        System.arraycopy(cArr2, i3, cArr4, 0, i4);
        if (bArr != null) {
            int i10 = $11 + 85;
            $10 = i10 % 128;
            if (i10 % 2 != 0) {
                cArr = new char[i4];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 1;
                c = 1;
            } else {
                cArr = new char[i4];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                c = 0;
            }
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - View.MeasureSpec.getMode(0)), AndroidCharacter.getMirror('0') + 17, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i11] = ((Character) ((Method) objOnExtraCallback2).invoke(obj, objArr3)).charValue();
                } else {
                    int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getLongPressTimeout() >> 16), 29 - ExpandableListView.getPackedPositionType(0L), 17656 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i12] = ((Character) ((Method) objOnExtraCallback3).invoke(obj, objArr4)).charValue();
                }
                c = cArr[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.argb(0, 0, 0, 0) + 49467), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 70, 12486 - View.MeasureSpec.makeMeasureSpec(0, 0), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                obj = null;
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr4 = cArr;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr4, 0, cArr5, 0, i4);
            int i13 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr4, i13, i6);
            System.arraycopy(cArr5, i6, cArr4, 0, i13);
        }
        if (z) {
            char[] cArr6 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr4[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr4 = cArr6;
        }
        if (i5 > 0) {
            int i14 = $10 + 67;
            $11 = i14 % 128;
            int i15 = i14 % 2;
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i16 = $10 + 97;
                $11 = i16 % 128;
                if (i16 % 2 == 0) {
                    cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] % iArr[3]);
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent % 1;
                } else {
                    cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
                }
                trackGroupExternalSyntheticLambda0.onNavigationEvent = i;
            }
        }
        objArr[0] = new String(cArr4);
    }
}
