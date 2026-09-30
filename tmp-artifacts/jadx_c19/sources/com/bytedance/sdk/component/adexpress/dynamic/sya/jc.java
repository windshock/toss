package com.bytedance.sdk.component.adexpress.dynamic.sya;

import android.content.Context;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.ariver.app.ui.DefaultViewSpecProvider;
import com.google.android.material.button.MaterialButton;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class jc {
    private static final byte[] $$a = {120, 11, 65, 93};
    private static final int $$b = 186;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onWarmupCompleted = 0;
    private static int IAuthTabCallback = 1;
    private static long onExtraCallback = 7798559133331975163L;
    private static int onExtraCallbackWithResult = -1776194565;
    private static char onNavigationEvent = 49078;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, byte b, short s2) {
        int i2;
        int i3 = 110 - s;
        int i4 = 4 - (b * 2);
        int i5 = s2 * 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i5];
        int i6 = 0 - i5;
        if (bArr == null) {
            i3 = i4;
            int i7 = i6;
            int i8 = 0;
            i4++;
            i3 += i7;
            i2 = i8;
            bArr2[i2] = (byte) i3;
            i8 = i2 + 1;
            if (i2 == i6) {
                return new String(bArr2, 0);
            }
            i7 = bArr[i4];
            i4++;
            i3 += i7;
            i2 = i8;
            bArr2[i2] = (byte) i3;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ul ycx(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lud ludVar, com.bytedance.sdk.component.adexpress.dynamic.dj.ul ulVar, com.bytedance.sdk.component.adexpress.dynamic.dj.jc jcVar, com.bytedance.sdk.component.adexpress.zb.ry ryVar) throws Throwable {
        String str;
        String str2;
        int i2 = 2 % 2;
        if (context != null) {
            int i3 = IAuthTabCallback + 71;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            if (ludVar != null && ulVar != null) {
                String strDc = ulVar.dc();
                String strDv = ryVar.dv();
                int iHashCode = strDc.hashCode();
                char c = 16;
                if (iHashCode != 1598) {
                    if (iHashCode != 1607) {
                        switch (iHashCode) {
                            case 48:
                                Object[] objArr = new Object[1];
                                a((char) (ImageFormat.getBitsPerPixel(0) + 62214), TextUtils.indexOf("", "", 0) + 145312082, new char[]{43675}, new char[]{0, 0, 0, 0}, new char[]{21206, 43337, 1288, 54515}, objArr);
                                if (strDc.equals(((String) objArr[0]).intern())) {
                                    int i5 = IAuthTabCallback + 29;
                                    onWarmupCompleted = i5 % 128;
                                    int i6 = i5 % 2;
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 49:
                                Object[] objArr2 = new Object[1];
                                a((char) (28495 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), (ViewConfiguration.getKeyRepeatTimeout() >> 16) - 971784289, new char[]{39292}, new char[]{0, 0, 0, 0}, new char[]{40825, 5055, 20422, 34927}, objArr2);
                                if (!strDc.equals(((String) objArr2[0]).intern())) {
                                    c = 65535;
                                    break;
                                } else {
                                    int i7 = IAuthTabCallback + 53;
                                    onWarmupCompleted = i7 % 128;
                                    if (i7 % 2 == 0) {
                                        c = 1;
                                        break;
                                    } else {
                                        c = 0;
                                        break;
                                    }
                                }
                            case 50:
                                Object[] objArr3 = new Object[1];
                                a((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 24092), AndroidCharacter.getMirror('0') - 58097, new char[]{57413}, new char[]{0, 0, 0, 0}, new char[]{16336, 46109, 7342, 58462}, objArr3);
                                if (strDc.equals(((String) objArr3[0]).intern())) {
                                    int i8 = IAuthTabCallback + 13;
                                    onWarmupCompleted = i8 % 128;
                                    if (i8 % 2 == 0) {
                                        c = 2;
                                        break;
                                    } else {
                                        c = 5;
                                        break;
                                    }
                                }
                                break;
                            default:
                                switch (iHashCode) {
                                    case 53:
                                        if (strDc.equals("5")) {
                                            int i9 = onWarmupCompleted + 75;
                                            IAuthTabCallback = i9 % 128;
                                            int i10 = i9 % 2;
                                            c = 3;
                                            break;
                                        }
                                        break;
                                    case DefaultViewSpecProvider.TAB_BAR_HEIGHT_DP /* 54 */:
                                        if (strDc.equals("6")) {
                                            c = 4;
                                            break;
                                        }
                                        break;
                                    case 55:
                                        if (strDc.equals("7")) {
                                        }
                                        break;
                                    case 56:
                                        if (strDc.equals("8")) {
                                            c = 6;
                                            break;
                                        }
                                        break;
                                    case 57:
                                        if (strDc.equals("9")) {
                                            c = 7;
                                            break;
                                        }
                                        break;
                                    default:
                                        switch (iHashCode) {
                                            case 1567:
                                                if (strDc.equals("10")) {
                                                    c = '\b';
                                                    break;
                                                }
                                                break;
                                            case 1568:
                                                if (strDc.equals("11")) {
                                                    c = '\t';
                                                    break;
                                                }
                                                break;
                                            case 1569:
                                                if (strDc.equals("12")) {
                                                    c = '\n';
                                                    break;
                                                }
                                                break;
                                            case 1570:
                                                if (strDc.equals("13")) {
                                                    c = 11;
                                                    break;
                                                }
                                                break;
                                            case 1571:
                                                if (!(!strDc.equals("14"))) {
                                                    c = '\f';
                                                    break;
                                                }
                                                break;
                                            default:
                                                switch (iHashCode) {
                                                    case 1573:
                                                        if (strDc.equals("16")) {
                                                            c = '\r';
                                                            break;
                                                        }
                                                        break;
                                                    case 1574:
                                                        if (strDc.equals("17")) {
                                                            c = 14;
                                                            break;
                                                        }
                                                        break;
                                                    case 1575:
                                                        if (strDc.equals("18")) {
                                                            c = 15;
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        switch (iHashCode) {
                                                            case 1600:
                                                                if (strDc.equals("22")) {
                                                                    int i11 = IAuthTabCallback + 45;
                                                                    onWarmupCompleted = i11 % 128;
                                                                    if (i11 % 2 == 0) {
                                                                        c = 17;
                                                                        break;
                                                                    } else {
                                                                        c = 'c';
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                            case 1601:
                                                                if (strDc.equals("23")) {
                                                                    c = 18;
                                                                    break;
                                                                }
                                                                break;
                                                            case 1602:
                                                                if (strDc.equals("24")) {
                                                                    c = 19;
                                                                    break;
                                                                }
                                                                break;
                                                            case 1603:
                                                                if (strDc.equals("25")) {
                                                                    int i12 = IAuthTabCallback + 121;
                                                                    onWarmupCompleted = i12 % 128;
                                                                    if (i12 % 2 == 0) {
                                                                        c = 20;
                                                                        break;
                                                                    } else {
                                                                        c = 'O';
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                }
                                        }
                                }
                        }
                    } else if (strDc.equals("29")) {
                        c = 21;
                    }
                } else if (strDc.equals("20")) {
                    int i13 = IAuthTabCallback + 85;
                    onWarmupCompleted = i13 % 128;
                    if (i13 % 2 != 0) {
                        c = 'x';
                    }
                }
                switch (c) {
                    case 0:
                        return new lud(context, ludVar, ulVar);
                    case 1:
                        return new sya(context, ludVar, ulVar);
                    case 2:
                        zb zbVar = new zb(context, ludVar, ulVar);
                        int i14 = onWarmupCompleted + 77;
                        IAuthTabCallback = i14 % 128;
                        int i15 = i14 % 2;
                        return zbVar;
                    case 3:
                        return ulVar.yi() == 1 ? new wie(context, ludVar, ulVar, ulVar.iq()) : new dy(context, ludVar, ulVar);
                    case 4:
                    case '\t':
                        return new xkz(context, ludVar, ulVar);
                    case 5:
                    case '\f':
                        return new ok(context, ludVar, ulVar);
                    case 6:
                        return new ry(context, ludVar, ulVar);
                    case 7:
                    case '\r':
                        return new syc(context, ludVar, ulVar, strDc, jcVar.ycx(), jcVar.zb(), jcVar.dj(), jcVar.ul());
                    case '\b':
                        return new dj(context, ludVar, ulVar);
                    case '\n':
                        return new dy(context, ludVar, ulVar);
                    case 11:
                        return new wie(context, ludVar, ulVar);
                    case 14:
                    case 15:
                        return new uh(context, ludVar, ulVar, strDc, jcVar);
                    case MaterialButton.ICON_GRAVITY_TOP /* 16 */:
                        if (com.bytedance.sdk.component.adexpress.dj.zb()) {
                            return new ea(context, ludVar, ulVar, strDv + "static/lotties/glass-swipe/glass-swipe.json", "20");
                        }
                        if (TextUtils.isEmpty(strDv)) {
                            str = null;
                        } else {
                            str = strDv + "brush_mask.json";
                        }
                        return new ea(context, ludVar, ulVar, str, "20");
                    case 17:
                        if (!com.bytedance.sdk.component.adexpress.dj.zb()) {
                            return new pmi(context, ludVar, ulVar);
                        }
                        return new ea(context, ludVar, ulVar, strDv + "static/lotties/202327swiper-up-star/index.json", "22");
                    case 18:
                        if (com.bytedance.sdk.component.adexpress.dj.zb()) {
                            ea eaVar = new ea(context, ludVar, ulVar, strDv + "static/lotties/202327swiper-up-star/click.json", "23");
                            int i16 = onWarmupCompleted + 123;
                            IAuthTabCallback = i16 % 128;
                            if (i16 % 2 == 0) {
                                int i17 = 4 % 4;
                            }
                            return eaVar;
                        }
                        return null;
                    case 19:
                        if (com.bytedance.sdk.component.adexpress.dj.zb()) {
                            return new ycx(context, ludVar, ulVar);
                        }
                        if (TextUtils.isEmpty(strDv)) {
                            str2 = null;
                        } else {
                            str2 = strDv + "swiper_up_star.json";
                        }
                        return new ea(context, ludVar, ulVar, str2, "24");
                    case 20:
                        if (com.bytedance.sdk.component.adexpress.dj.zb()) {
                            return new ea(context, ludVar, ulVar, strDv + "static/lotties/gesture-slide.json", "25");
                        }
                        return null;
                    case 21:
                        return new lt(context, ludVar, ulVar, jcVar.ycx(), jcVar.zb(), jcVar.dj(), jcVar.ul());
                    default:
                        return null;
                }
            }
        }
        return null;
    }

    private static void a(char c, int i2, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i3 = 2;
        int i4 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        int i5 = 0;
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i2));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i6 = $10 + 65;
            $11 = i6 % 128;
            int i7 = i6 % i3;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0'));
                    int iMyTid = (Process.myTid() >> 22) + 43;
                    int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1451;
                    byte b = (byte) i5;
                    byte b2 = b;
                    String str$$c = $$c(b, b2, b2);
                    Class[] clsArr = new Class[1];
                    clsArr[i5] = Object.class;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cLastIndexOf, iMyTid, keyRepeatTimeout, 228868077, false, str$$c, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) 1;
                    byte b4 = (byte) (b3 - 1);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (MotionEvent.axisFromString("") + 49124), 44 - Gravity.getAbsoluteGravity(i5, i5), 1493 - TextUtils.lastIndexOf("", '0'), 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23972 - (ViewConfiguration.getScrollBarSize() >> 8)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 50, TextUtils.indexOf("", "", 0, 0) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 45848), 30 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 12577 - TextUtils.getCapsMode("", 0, 0), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onExtraCallback ^ 7798559133331975163L)) ^ ((int) (onExtraCallbackWithResult ^ 7798559133331975163L))) ^ ((char) (onNavigationEvent ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                int i8 = $11 + 25;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                i3 = 2;
                i5 = 0;
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
}
