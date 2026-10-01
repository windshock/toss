package com.initech.xsafe.cert;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.initech.core.x509.x509CertificateInfo;
import java.lang.reflect.Method;
import java.security.cert.X509Certificate;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class AliasOID {
    private static final byte[] $$a = {68, -59, -116, 119};
    private static final int $$b = 47;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onWarmupCompleted = 0;
    private static int onNavigationEvent = 1;
    private static char[] onExtraCallbackWithResult = {58236, 60901};
    private static long onExtraCallback = 8687906609446169030L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, byte b2, byte b3) {
        int i;
        int i2;
        int i3 = (b * 4) + 4;
        int i4 = (b2 * 2) + 1;
        int i5 = (b3 * 2) + 97;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            i2 = i3;
            int i6 = i4;
            i = 0;
            i3 += i6;
            i2++;
            bArr2[i] = (byte) i3;
            i++;
            if (i == i4) {
                return new String(bArr2, 0);
            }
            i6 = bArr[i2];
            i3 += i6;
            i2++;
            bArr2[i] = (byte) i3;
            i++;
            if (i == i4) {
            }
        } else {
            i = 0;
            i2 = i3;
            i3 = i5;
            bArr2[i] = (byte) i3;
            i++;
            if (i == i4) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        if (r6 != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        if (r6 != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        r6 = com.initech.xsafe.cert.AliasOID.onWarmupCompleted + 29;
        com.initech.xsafe.cert.AliasOID.onNavigationEvent = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        if ((r6 % 2) != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean isMatchedCertByFilter(X509Certificate x509Certificate, String str) throws Throwable {
        int i = 2 % 2;
        if (str != null) {
            int i2 = onNavigationEvent + 35;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            if (!str.trim().equals("")) {
                String alias = getAlias(x509CertificateInfo.getCertOID(x509Certificate));
                if (alias != null) {
                    int i4 = onNavigationEvent + 65;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    boolean zContains = str.contains(alias);
                    if (i5 != 0) {
                        int i6 = 68 / 0;
                    }
                }
                int i7 = onWarmupCompleted + 55;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0201  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        long j;
        Object obj;
        Throwable cause;
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (true) {
            j = 0;
            obj = null;
            if (timelineExternalSyntheticLambda1.IAuthTabCallback >= i2) {
                break;
            }
            int i4 = $10 + 73;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onExtraCallbackWithResult[i + i6])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - (Process.myPid() >> 22)), 17 - Color.green(0), 10973 - (ViewConfiguration.getWindowTouchSlop() >> 8), 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(onExtraCallback), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((KeyEvent.getMaxKeyCode() >> 16) + 46134), 31 - Color.green(0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 20219, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 49123), (ViewConfiguration.getWindowTouchSlop() >> 8) + 44, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1494, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
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
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i7 = $10 + 39;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getMode(0) + 49123), 45 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 1494 - (ViewConfiguration.getEdgeSlop() >> 16), -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                obj.hashCode();
                throw null;
            }
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr6 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback5 == null) {
                char jumpTapTimeout = (char) (49123 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                int packedPositionType = ExpandableListView.getPackedPositionType(j) + 44;
                int packedPositionChild = ExpandableListView.getPackedPositionChild(j) + 1495;
                byte b5 = (byte) 0;
                byte b6 = b5;
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(jumpTapTimeout, packedPositionType, packedPositionChild, -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
            j = 0;
        }
        String str = new String(cArr);
        int i8 = $10 + 37;
        $11 = i8 % 128;
        int i9 = i8 % 2;
        objArr[0] = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:174:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x040f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:297:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String getAlias(String str) throws Throwable {
        char c;
        char c2;
        String str2;
        String str3;
        char c3 = 2;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 1;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        if (str != null) {
            int i5 = i3 + 71;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            if (str.length() >= 18) {
                char c4 = 65535;
                if ("5".equals(str.substring(13, 14))) {
                    switch (str.hashCode()) {
                        case -770949016:
                            if (!str.equals("1.2.410.200005.1.1.6.1")) {
                                c3 = 65535;
                                break;
                            } else {
                                c3 = 0;
                                break;
                            }
                        case -770949015:
                            if (str.equals("1.2.410.200005.1.1.6.2")) {
                                c3 = 1;
                                break;
                            }
                            break;
                        case -770949009:
                            if (!str.equals("1.2.410.200005.1.1.6.8")) {
                            }
                            break;
                        case 750034912:
                            if (!(!str.equals("1.2.410.200005.1.1.1"))) {
                                c3 = 3;
                                break;
                            }
                            break;
                        case 750034913:
                            if (str.equals("1.2.410.200005.1.1.2")) {
                                c3 = 4;
                                break;
                            }
                            break;
                        case 750034915:
                            if (str.equals("1.2.410.200005.1.1.4")) {
                                c3 = 5;
                                break;
                            }
                            break;
                        case 750034916:
                            if (str.equals("1.2.410.200005.1.1.5")) {
                                c3 = 6;
                                break;
                            }
                            break;
                    }
                    switch (c3) {
                        case 0:
                            return "a9";
                        case 1:
                            return "a6";
                        case 2:
                            return "a7";
                        case 3:
                            return "a1";
                        case 4:
                            return "a5";
                        case 5:
                            return "a4";
                        case 6:
                            return "a2";
                        default:
                            return "a3";
                    }
                }
                Object[] objArr = new Object[1];
                a(View.MeasureSpec.makeMeasureSpec(0, 0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1, (char) (3738 - (ViewConfiguration.getTouchSlop() >> 8)), objArr);
                if (((String) objArr[0]).intern().equals(str.substring(13, 14))) {
                    switch (str.hashCode()) {
                        case -945796574:
                            if (str.equals("1.2.410.200012.5.19.1.1")) {
                                c4 = 0;
                                break;
                            }
                            break;
                        case -169665796:
                            if (str.equals("1.2.410.200012.1.1.1")) {
                                c4 = 1;
                                break;
                            }
                            break;
                        case -169665794:
                            if (str.equals("1.2.410.200012.1.1.3")) {
                                c4 = 2;
                                break;
                            }
                            break;
                        case 159928829:
                            if (str.equals("1.2.410.200012.1.1.101")) {
                                int i7 = onNavigationEvent + 83;
                                onWarmupCompleted = i7 % 128;
                                if (i7 % 2 == 0) {
                                    c4 = 3;
                                    break;
                                } else {
                                    c4 = 4;
                                    break;
                                }
                            }
                            break;
                        case 159928831:
                            if (str.equals("1.2.410.200012.1.1.103")) {
                            }
                            break;
                        case 159928833:
                            if (str.equals("1.2.410.200012.1.1.105")) {
                                c4 = 5;
                                break;
                            }
                            break;
                    }
                    return c4 != 0 ? c4 != 1 ? c4 != 2 ? c4 != 3 ? c4 != 4 ? c4 != 5 ? "b3" : "b5" : "b7" : "b4" : "b2" : "b1" : "b6";
                }
                String strSubstring = str.substring(17, 18);
                switch (strSubstring.hashCode()) {
                    case 49:
                        c = 6;
                        Object[] objArr2 = new Object[1];
                        a((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 1 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr2);
                        if (!strSubstring.equals(((String) objArr2[0]).intern())) {
                            c2 = 65535;
                            break;
                        } else {
                            c2 = 0;
                            break;
                        }
                    case 50:
                        Object[] objArr3 = new Object[1];
                        a((-1) - Process.getGidForName(""), TextUtils.indexOf("", "") + 1, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 3739), objArr3);
                        if (strSubstring.equals(((String) objArr3[0]).intern())) {
                            c2 = 1;
                            c = 6;
                            break;
                        }
                        c = 6;
                        c2 = 65535;
                        break;
                    case 51:
                    default:
                        c = 6;
                        c2 = 65535;
                        break;
                    case 52:
                        if (strSubstring.equals("4")) {
                            c2 = 2;
                            c = 6;
                            break;
                        }
                        c = 6;
                        c2 = 65535;
                        break;
                    case 53:
                        if (strSubstring.equals("5")) {
                            c2 = 3;
                            c = 6;
                            break;
                        }
                        c = 6;
                        c2 = 65535;
                        break;
                }
                if (c2 == 0) {
                    switch (str.hashCode()) {
                        case 291548074:
                            if (!str.equals("1.2.410.200004.5.1.1.5")) {
                                c3 = 65535;
                                break;
                            } else {
                                c3 = 0;
                                break;
                            }
                        case 291548076:
                            if (str.equals("1.2.410.200004.5.1.1.7")) {
                                c3 = 1;
                                break;
                            }
                            break;
                        case 291548078:
                            if (str.equals("1.2.410.200004.5.1.1.9")) {
                                int i8 = onWarmupCompleted + 83;
                                onNavigationEvent = i8 % 128;
                                int i9 = i8 % 2;
                                break;
                            }
                            break;
                        case 448055626:
                            if (str.equals("1.2.410.200004.5.1.1.10")) {
                                c3 = 3;
                                break;
                            }
                            break;
                        case 448055627:
                            if (str.equals("1.2.410.200004.5.1.1.11")) {
                                c3 = 4;
                                break;
                            }
                            break;
                        case 1004830193:
                            if (str.equals("1.2.410.200004.5.1.1.9.1")) {
                                c3 = 5;
                                break;
                            }
                            break;
                        case 1004830194:
                            if (str.equals("1.2.410.200004.5.1.1.9.2")) {
                                c3 = c;
                                break;
                            }
                            break;
                        case 1084728461:
                            if (str.equals("1.2.410.200004.5.1.1.10.1")) {
                                c3 = 7;
                                break;
                            }
                            break;
                        case 1084728462:
                            if (str.equals("1.2.410.200004.5.1.1.10.2")) {
                                c3 = '\b';
                                break;
                            }
                            break;
                        case 2003478623:
                            if (str.equals("1.2.410.200005.1.1.12.902")) {
                                c3 = '\t';
                                break;
                            }
                            break;
                    }
                    switch (c3) {
                        case 0:
                            str2 = "c1";
                            break;
                        case 1:
                            str2 = "c2";
                            break;
                        case 2:
                            str2 = "c5";
                            break;
                        case 3:
                            str2 = "c8";
                            break;
                        case 4:
                            str2 = "ca";
                            break;
                        case 5:
                            str2 = "c7";
                            break;
                        case 6:
                            str2 = "c4";
                            break;
                        case 7:
                            str2 = "c9";
                            break;
                        case '\b':
                            str2 = "c10";
                            break;
                        case '\t':
                            str2 = "c6";
                            break;
                        default:
                            str2 = "c3";
                            break;
                    }
                } else if (c2 == 1) {
                    switch (str.hashCode()) {
                        case 292471591:
                            if (str.equals("1.2.410.200004.5.2.1.1")) {
                                c4 = 0;
                                break;
                            }
                            break;
                        case 292471592:
                            if (str.equals("1.2.410.200004.5.2.1.2")) {
                                c4 = 1;
                                break;
                            }
                            break;
                        case 1892331952:
                            if (str.equals("1.2.410.200004.5.2.1.7.1")) {
                                c4 = 2;
                                break;
                            }
                            break;
                        case 1892331954:
                            if (str.equals("1.2.410.200004.5.2.1.7.3")) {
                                c4 = 3;
                                break;
                            }
                            break;
                    }
                    str2 = c4 != 0 ? c4 != 1 ? c4 != 2 ? c4 != 3 ? "d3" : "d5" : "d4" : "d1" : "d2";
                } else if (c2 == 2) {
                    switch (str.hashCode()) {
                        case -627633686:
                            if (str.equals("1.2.410.200004.5.4.1.101")) {
                                c4 = 0;
                                break;
                            }
                            break;
                        case -627633685:
                            if (str.equals("1.2.410.200004.5.4.1.102")) {
                                c4 = 1;
                                break;
                            }
                            break;
                        case -627633684:
                            if (str.equals("1.2.410.200004.5.4.1.103")) {
                                c4 = 2;
                                break;
                            }
                            break;
                        case 294318633:
                            if (str.equals("1.2.410.200004.5.4.1.1")) {
                                int i10 = onWarmupCompleted + 77;
                                onNavigationEvent = i10 % 128;
                                int i11 = i10 % 2;
                                c4 = 3;
                                break;
                            }
                            break;
                        case 294318634:
                            if (str.equals("1.2.410.200004.5.4.1.2")) {
                                int i12 = onWarmupCompleted + 101;
                                onNavigationEvent = i12 % 128;
                                int i13 = i12 % 2;
                                c4 = 4;
                                break;
                            }
                            break;
                        case 533973087:
                            if (str.equals("1.2.410.200004.5.4.2.80")) {
                                c4 = 5;
                                break;
                            }
                            break;
                    }
                    str2 = (c4 == 0 || c4 == 1) ? "e4" : c4 != 2 ? c4 != 3 ? c4 != 4 ? c4 != 5 ? "e3" : "e6" : "e2" : "e1" : "e5";
                } else if (c2 == 3) {
                    switch (str.hashCode()) {
                        case 259871855:
                            if (!str.equals("1.2.410.200004.5.5.1.3.1")) {
                                c3 = 65535;
                                break;
                            } else {
                                c3 = 0;
                                break;
                            }
                        case 259872816:
                            if (str.equals("1.2.410.200004.5.5.1.4.1")) {
                                c3 = 1;
                                break;
                            }
                            break;
                        case 259872817:
                            if (str.equals("1.2.410.200004.5.5.1.4.2")) {
                                int i14 = onNavigationEvent + 59;
                                onWarmupCompleted = i14 % 128;
                                int i15 = i14 % 2;
                                break;
                            }
                            break;
                        case 259872819:
                            if (str.equals("1.2.410.200004.5.5.1.4.4")) {
                                c3 = 3;
                                break;
                            }
                            break;
                        case 259872820:
                            if (str.equals("1.2.410.200004.5.5.1.4.5")) {
                                int i16 = onNavigationEvent + 117;
                                onWarmupCompleted = i16 % 128;
                                if (i16 % 2 == 0) {
                                    c3 = 4;
                                    break;
                                }
                            }
                            break;
                        case 295242154:
                            if (str.equals("1.2.410.200004.5.5.1.1")) {
                                int i17 = onNavigationEvent + 33;
                                onWarmupCompleted = i17 % 128;
                                if (i17 % 2 == 0) {
                                    c3 = 5;
                                    break;
                                }
                            }
                            break;
                        case 295242155:
                            if (str.equals("1.2.410.200004.5.5.1.2")) {
                                c3 = c;
                                break;
                            }
                            break;
                    }
                    switch (c3) {
                        case 0:
                            str2 = "g4";
                            break;
                        case 1:
                            str2 = "g5";
                            break;
                        case 2:
                            str2 = "g6";
                            break;
                        case 3:
                            str2 = "g8";
                            break;
                        case 4:
                            str2 = "g9";
                            break;
                        case 5:
                            str2 = "g1";
                            break;
                        case 6:
                            str2 = "g2";
                            break;
                        default:
                            str2 = "g3";
                            break;
                    }
                } else {
                    switch (str.hashCode()) {
                        case 293395112:
                            if (str.equals("1.2.410.200004.5.3.1.1")) {
                                int i18 = onWarmupCompleted + 9;
                                onNavigationEvent = i18 % 128;
                                int i19 = i18 % 2;
                                c4 = 0;
                                break;
                            }
                            break;
                        case 293395113:
                            if (str.equals("1.2.410.200004.5.3.1.2")) {
                                c4 = 1;
                                break;
                            }
                            break;
                        case 293395120:
                            if (str.equals("1.2.410.200004.5.3.1.9")) {
                                c4 = 2;
                                break;
                            }
                            break;
                    }
                    if (c4 == 0) {
                        str2 = "f1";
                    } else if (c4 == 1) {
                        str2 = "f2";
                    } else {
                        if (c4 != 2) {
                            str3 = null;
                            return str.startsWith("1.2.410.100001") ^ true ? "f4" : str3;
                        }
                        str2 = "f3";
                    }
                }
                str3 = str2;
                if (str.startsWith("1.2.410.100001") ^ true) {
                }
            }
        }
        return null;
    }
}
