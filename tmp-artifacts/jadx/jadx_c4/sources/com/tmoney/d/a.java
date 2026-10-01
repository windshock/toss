package com.tmoney.d;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class a {
    private static int IAuthTabCallbackStub;
    private static a a;
    private static int onExtraCallback;
    private static long onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static char onWarmupCompleted;
    private String b = "";
    private String c = "";
    private byte[] d;
    private byte[] e;
    private byte[] f;
    private static final byte[] $$a = {5, -4, -80, 1};
    private static final int $$b = 25;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asInterface = 0;
    private static int onTransact = 1;
    private static int IAuthTabCallback = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, int i, int i2) {
        int i3;
        int i4;
        int i5 = (i2 * 4) + 4;
        int i6 = (i * 3) + 1;
        byte[] bArr = $$a;
        int i7 = 110 - s;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i8 = i5;
            i4 = 0;
            int i9 = i6;
            i7 = (-i7) + i9;
            i5 = i8 + 1;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i7;
            if (i4 == i6) {
                return new String(bArr2, 0);
            }
            byte b = bArr[i5];
            int i10 = i5;
            i9 = i7;
            i7 = b;
            i8 = i10;
            i7 = (-i7) + i9;
            i5 = i8 + 1;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i7;
            if (i4 == i6) {
            }
        } else {
            i3 = 0;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i7;
            if (i4 == i6) {
            }
        }
    }

    static {
        IAuthTabCallbackStub = 1;
        onWarmupCompleted();
        int i = IAuthTabCallback + 21;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void clear() {
        int i = 2 % 2;
        int i2 = onTransact + 91;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        a = null;
        if (i3 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static a getInstance() {
        a aVar;
        synchronized (a.class) {
            if (a == null) {
                a = new a();
            }
            aVar = a;
        }
        return aVar;
    }

    public final byte[] cryptoHelperByteKey() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 115;
        onTransact = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        byte[] bArr = this.d;
        int i4 = i2 + 17;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return bArr;
        }
        obj.hashCode();
        throw null;
    }

    public final String getKsccApiBusinessUrl(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 97;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            return "api/mbgw/gwComReq/";
        }
        throw null;
    }

    public final String getKsccIpBusinessUrl(int i) throws Throwable {
        Object obj;
        Object obj2;
        int i2 = 2 % 2;
        if (i == 0) {
            Object[] objArr = new Object[1];
            g((char) Color.argb(0, 0, 0, 0), 237263551 - (ViewConfiguration.getWindowTouchSlop() >> 8), new char[]{22546, 43222, 13593, 60985, 20629, 25743, 15420, 36728, 24382, 19063, 63603, 12140, 21563, 48599, 32399, 35049, 60865, 63857, 10922, 7373, 17119, 39952, 45133, 61281, 54435, 56359, 19200, 16824, 64192, 63444, 17197, 60283, 61292, 27341, 6664}, new char[]{41455, 39103, 47803, 23364}, new char[]{49130, 9306, 31502, 8579}, objArr);
            return ((String) objArr[0]).intern();
        }
        if (i == 1) {
            int i3 = onTransact + 59;
            asInterface = i3 % 128;
            if (i3 % 2 != 0) {
                Object[] objArr2 = new Object[1];
                h(Color.alpha(0) * 79, ExpandableListView.getPackedPositionGroup(1L) + 101, new char[]{'\f', 65497, 65497, 65508, 29, 26, 30, 30, 18, 65497, 65498, 65501, 65500, 65498, 65499, 65508, 28, 21, 65496, 25, '\r', 65496, '#', 15, 24, 25, 23, 30, 65496, 19, 26, 11, 23, 65495, 11, 30, 15}, 30559 >> TextUtils.indexOf("", "", 0, 0), true, objArr2);
                obj2 = objArr2[0];
            } else {
                Object[] objArr3 = new Object[1];
                h(9 - Color.alpha(0), 37 - ExpandableListView.getPackedPositionGroup(0L), new char[]{'\f', 65497, 65497, 65508, 29, 26, 30, 30, 18, 65497, 65498, 65501, 65500, 65498, 65499, 65508, 28, 21, 65496, 25, '\r', 65496, '#', 15, 24, 25, 23, 30, 65496, 19, 26, 11, 23, 65495, 11, 30, 15}, 167 - TextUtils.indexOf("", "", 0, 0), true, objArr3);
                obj2 = objArr3[0];
            }
            return ((String) obj2).intern();
        }
        if (i != 2) {
            return "";
        }
        int i4 = onTransact + 23;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            Object[] objArr4 = new Object[1];
            h(75 << TextUtils.indexOf("", ""), (ViewConfiguration.getEdgeSlop() >> 93) + 8, new char[]{'\b', 17, 18, 16, 23, 65489, '\f', 19, 4, 16, 65490, 65490, 65501, 22, 19, 23, 23, 11, 65490, 21, 14, 65489, 18, 6, 65489, 28}, 5437 >>> View.MeasureSpec.makeMeasureSpec(1, 1), false, objArr4);
            obj = objArr4[0];
        } else {
            Object[] objArr5 = new Object[1];
            h(18 - TextUtils.indexOf("", ""), (ViewConfiguration.getEdgeSlop() >> 16) + 26, new char[]{'\b', 17, 18, 16, 23, 65489, '\f', 19, 4, 16, 65490, 65490, 65501, 22, 19, 23, 23, 11, 65490, 21, 14, 65489, 18, 6, 65489, 28}, 174 - View.MeasureSpec.makeMeasureSpec(0, 0), true, objArr5);
            obj = objArr5[0];
        }
        return ((String) obj).intern();
    }

    public final int getKsccTimeOut(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 13;
        int i4 = i3 % 128;
        onTransact = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 93;
        asInterface = i6 % 128;
        if (i6 % 2 == 0) {
            return 15000;
        }
        throw null;
    }

    public final String getKtAppKey() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 3;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        String str = this.c;
        int i5 = i2 + 77;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getLogoPathUrl(int i) throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        int i3 = asInterface + 1;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr = new Object[1];
            g((char) (10417 / (ViewConfiguration.getMaximumFlingVelocity() + 122)), ViewConfiguration.getScrollDefaultDelay() - (-1303374178), new char[]{10371, 5331, 46723, 30958, 33433, 27883, 28477, 26568, 7541, 10932, 47620, 49578, 53176, 56945, 3857, 57533, 24404, 55199, 33774, 12957, 61243, 63043, 59463, 63709, 27234, 32499, 53696, 40651, 42406, 3864, 4932, 52181, 32444, 53394, 26189, 37160, 63516, 60894, 58074, 45977, 62893, 34469, 47210, 64510, 22266, 1629, 13534, 4954, 39287, 48921, 8046, 26401, 53023, 37555, 33599, 52881, 23979, 24139, 49067, 25576, 58304, 34839, 50283, 7421, 26743, 19001, 20773, 1161, 60020, 64348, 43122, 30033, 25258, 38479, 42552, 26740, 36227, 49985, 44840}, new char[]{41455, 39103, 47803, 23364}, new char[]{54029, 45033, 24909, 29212}, objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            g((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 7265), 1303374291 - (ViewConfiguration.getScrollDefaultDelay() >> 16), new char[]{10371, 5331, 46723, 30958, 33433, 27883, 28477, 26568, 7541, 10932, 47620, 49578, 53176, 56945, 3857, 57533, 24404, 55199, 33774, 12957, 61243, 63043, 59463, 63709, 27234, 32499, 53696, 40651, 42406, 3864, 4932, 52181, 32444, 53394, 26189, 37160, 63516, 60894, 58074, 45977, 62893, 34469, 47210, 64510, 22266, 1629, 13534, 4954, 39287, 48921, 8046, 26401, 53023, 37555, 33599, 52881, 23979, 24139, 49067, 25576, 58304, 34839, 50283, 7421, 26743, 19001, 20773, 1161, 60020, 64348, 43122, 30033, 25258, 38479, 42552, 26740, 36227, 49985, 44840}, new char[]{41455, 39103, 47803, 23364}, new char[]{54029, 45033, 24909, 29212}, objArr2);
            obj = objArr2[0];
        }
        String strIntern = ((String) obj).intern();
        int i4 = onTransact + 29;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return strIntern;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final String getOtaUrl(int i) throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        if (i == 0) {
            Object[] objArr = new Object[1];
            h(24 - (ViewConfiguration.getJumpTapTimeout() >> 16), 63 - TextUtils.indexOf("", "", 0, 0), new char[]{22, 22, 18, 65524, 7, 5, 7, 11, 24, 7, 20, 65520, 7, 25, 65512, 65518, 65508, 65488, 15, 5, 11, 16, '\b', 4, '\n', 22, 22, 18, 21, 65500, 65489, 65489, 6, 7, 24, 17, 22, 3, 65488, 22, 15, 17, 16, 7, 27, 65488, 5, 17, 65488, '\r', 20, 65489, 65521, 65526, 65507, 17, 16, 14, 11, 16, 7, 65489, 65514}, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 175, false, objArr);
            obj = objArr[0];
        } else {
            if (i != 1) {
                if (i != 2) {
                    return "";
                }
                Object[] objArr2 = new Object[1];
                h(ImageFormat.getBitsPerPixel(0) + 41, 60 - (ViewConfiguration.getScrollBarSize() >> 8), new char[]{17, 65488, '\r', 20, 65489, 65521, 65526, 65507, 17, 16, 14, 11, 16, 7, 65489, 65514, 22, 22, 18, 65524, 7, 5, 7, 11, 24, 7, 20, 65520, 7, 25, 65512, 65518, 65508, 65488, 15, 5, 11, 16, '\b', 4, '\n', 22, 22, 18, 21, 65500, 65489, 65489, 17, 22, 3, 65488, 22, 15, 17, 16, 7, 27, 65488, 5}, (ViewConfiguration.getTapTimeout() >> 16) + 175, false, objArr2);
                String strIntern = ((String) objArr2[0]).intern();
                int i3 = asInterface + 75;
                onTransact = i3 % 128;
                if (i3 % 2 != 0) {
                    return strIntern;
                }
                throw null;
            }
            int i4 = onTransact + 25;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
                Object[] objArr3 = new Object[1];
                h(75 >> (Process.myTid() * 106), 113 % (ViewConfiguration.getLongPressTimeout() - 80), new char[]{17, 65488, '\r', 20, 65489, 65521, 65526, 65507, 17, 16, 14, 11, 16, 7, 65489, 65514, 22, 22, 18, 65524, 7, 5, 7, 11, 24, 7, 20, 65520, 7, 25, 65512, 65518, 65508, 65488, 15, 5, 11, 16, '\b', 4, '\n', 22, 22, 18, 21, 65500, 65489, 65489, 17, 22, 3, 65488, 22, 15, 17, 16, 7, 27, 65488, 5}, 18667 / (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), false, objArr3);
                obj = objArr3[0];
            } else {
                Object[] objArr4 = new Object[1];
                h((Process.myTid() >> 22) + 40, (ViewConfiguration.getLongPressTimeout() >> 16) + 60, new char[]{17, 65488, '\r', 20, 65489, 65521, 65526, 65507, 17, 16, 14, 11, 16, 7, 65489, 65514, 22, 22, 18, 65524, 7, 5, 7, 11, 24, 7, 20, 65520, 7, 25, 65512, 65518, 65508, 65488, 15, 5, 11, 16, '\b', 4, '\n', 22, 22, 18, 21, 65500, 65489, 65489, 17, 22, 3, 65488, 22, 15, 17, 16, 7, 27, 65488, 5}, 176 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), false, objArr4);
                obj = objArr4[0];
            }
        }
        return ((String) obj).intern();
    }

    public final String getPhoneBillUrl(int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = asInterface;
        int i4 = i3 + 31;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        if (i == 0) {
            int i6 = i3 + 45;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            Object[] objArr = new Object[1];
            g((char) (35165 - ExpandableListView.getPackedPositionGroup(0L)), ViewConfiguration.getScrollBarFadeDuration() >> 16, new char[]{38454, 53962, 3340, 43051, 49944, 40364, 63618, 59473, 29421, 20307, 50433, 60911, 54285, 22416, 40419, 54313, 12445, 10549, 40419, 41806, 28025, 35236, 6211, 23084, 8180, 22622, 18039, 46302, 36533, 42334, 64188, 60264, 2904, 19363, 12701, 37514, 62330, 56614, 46205, 40435, 56991, 52133, 10833, 22088}, new char[]{41455, 39103, 47803, 23364}, new char[]{6697, 40237, 23981, 44937}, objArr);
            return ((String) objArr[0]).intern();
        }
        if (i != 1) {
            if (i != 2) {
                return "";
            }
            Object[] objArr2 = new Object[1];
            h((ViewConfiguration.getKeyRepeatDelay() >> 16) + 6, 38 - (KeyEvent.getMaxKeyCode() >> 16), new char[]{65505, 26, 23, 27, 27, 15, 65494, 19, 19, 16, '\t', '\f', 21, 22, 15, 23, 65494, 65504, 65503, 65495, 65503, 65505, 20, 22, '\n', 65493, 27, '\f', 21, 22, 20, 65492, 27, 65493, 27, 20, 65494, 65494}, TextUtils.lastIndexOf("", '0', 0, 0) + 171, true, objArr2);
            return ((String) objArr2[0]).intern();
        }
        Object[] objArr3 = new Object[1];
        h(TextUtils.lastIndexOf("", '0', 0, 0) + 7, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 38, new char[]{65505, 26, 23, 27, 27, 15, 65494, 19, 19, 16, '\t', '\f', 21, 22, 15, 23, 65494, 65504, 65503, 65495, 65503, 65505, 20, 22, '\n', 65493, 27, '\f', 21, 22, 20, 65492, 27, 65493, 27, 20, 65494, 65494}, 170 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), true, objArr3);
        String strIntern = ((String) objArr3[0]).intern();
        int i8 = asInterface + 81;
        onTransact = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 36 / 0;
        }
        return strIntern;
    }

    public final String getPhoneBillUrlLenCheck() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 125;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 123;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return "pay/app/spayPhonebill/spay_charge_order_result";
    }

    public final String getPointAppToken() {
        String str;
        int i = 2 % 2;
        int i2 = asInterface + 71;
        int i3 = i2 % 128;
        onTransact = i3;
        if (i2 % 2 == 0) {
            str = this.b;
            int i4 = 29 / 0;
        } else {
            str = this.b;
        }
        int i5 = i3 + 71;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getPointAppid() {
        int i = 2 % 2;
        int i2 = asInterface + 7;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return "01";
        }
        int i3 = 83 / 0;
        return "01";
    }

    public final String getPointUrl(int i) throws Throwable {
        int i2 = 2 % 2;
        if (i == 0) {
            Object[] objArr = new Object[1];
            g((char) (48974 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1, new char[]{49979, 40454, 20024, 36240, 63494, 64205, 47891, 34187, 55618, 56675, 2411, 37869, 52092, 12538, 23620, 1166, 56651, 16095, 28717, 65005, 41060, 37538, 53594, 43173, 58892, 6950, 30116, 49930, 49430, 48775, 27861, 38397, 399, 43817, 23276, 18356, 56429, 5003, 9021, 33747, 41588, 52056, 37413, 24300, 50854, 55460, 61933, 34400, 45726, 1810, 41193, 51443, 65040, 57926, 53043, 42902, 13506, 6739}, new char[]{41455, 39103, 47803, 23364}, new char[]{2942, 34604, 19747, 50623}, objArr);
            String strIntern = ((String) objArr[0]).intern();
            int i3 = onTransact + 9;
            asInterface = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 56 / 0;
            }
            return strIntern;
        }
        if (i != 1) {
            if (i != 2) {
                return "";
            }
            Object[] objArr2 = new Object[1];
            g((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), ViewConfiguration.getJumpTapTimeout() >> 16, new char[]{58213, 39416, 46600, 54986, 19247, 45990, 10463, 34875, 35793, 53271, 51902, 13567, 16179, 31999, 63236, 55316, 55827, 13802, 19911, 59294, 11657, 43610, 36710, 17260, 31205, 24915, 33888, 39528, 5421, 47431, 26678, 32792, 61886, 60550, 11295, 51197, 36021, 39105, 64491, 43159, 15895, 15007, 64836, 25975, 43623, 65103, 6499, 16602, 31582, 62460}, new char[]{41455, 39103, 47803, 23364}, new char[]{40338, 52345, 41989, 33811}, objArr2);
            return ((String) objArr2[0]).intern();
        }
        Object[] objArr3 = new Object[1];
        g((char) TextUtils.getTrimmedLength(""), View.MeasureSpec.getMode(0), new char[]{58213, 39416, 46600, 54986, 19247, 45990, 10463, 34875, 35793, 53271, 51902, 13567, 16179, 31999, 63236, 55316, 55827, 13802, 19911, 59294, 11657, 43610, 36710, 17260, 31205, 24915, 33888, 39528, 5421, 47431, 26678, 32792, 61886, 60550, 11295, 51197, 36021, 39105, 64491, 43159, 15895, 15007, 64836, 25975, 43623, 65103, 6499, 16602, 31582, 62460}, new char[]{41455, 39103, 47803, 23364}, new char[]{40338, 52345, 41989, 33811}, objArr3);
        String strIntern2 = ((String) objArr3[0]).intern();
        int i5 = onTransact + 73;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 31 / 0;
        }
        return strIntern2;
    }

    public final String getPrefName() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 55;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 19;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 34 / 0;
        }
        return "pref.tmoney.sdk";
    }

    public final int getTimeOut(int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 53;
        int i4 = i3 % 128;
        asInterface = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 25;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        return 15000;
    }

    public final String getTmonetServerIp(int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onTransact + 91;
        int i4 = i3 % 128;
        asInterface = i4;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (i == 0) {
            Object[] objArr = new Object[1];
            g((char) (ExpandableListView.getPackedPositionGroup(0L) + 47691), TextUtils.lastIndexOf("", '0') + 1, new char[]{32283, 64387, 25371, 35013, 7067, 29289, 36812, 18779, 33337, 54284, 19991, 37602, 6808, 40631, 30430, 28640, 62941, 6499, 38509, 47723, 33883, 63874, 41838, 60163, 43139, 9116, 4701, 4994, 54385, 61139, 26111, 46669, 42254, 7674, 44279, 41393, 15753, 51322, 27054, 63748}, new char[]{41455, 39103, 47803, 23364}, new char[]{31610, 52397, 19352, 56250}, objArr);
            return ((String) objArr[0]).intern();
        }
        if (i != 1) {
            if (i != 2) {
                return "";
            }
            Object[] objArr2 = new Object[1];
            g((char) (23194 - (ViewConfiguration.getTouchSlop() >> 8)), (-1333500988) - TextUtils.lastIndexOf("", '0', 0), new char[]{4638, 41470, 50998, 42623, 6190, 24311, 56224, 60147, 3873, 4757, 54580, 22227, 42919, 38974, 10568, 56410, 61445, 12785, 59168, 24222, 62394, 21925, 21561, 40132, 26688, 14944, 2353, 24323, 8224, 6915, 11097, 7957, 20112, 17960, 8857, 43009, 45127, 12295, 46673}, new char[]{41455, 39103, 47803, 23364}, new char[]{50559, 33891, 39600, 13146}, objArr2);
            return ((String) objArr2[0]).intern();
        }
        int i5 = i4 + 105;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        Object[] objArr3 = new Object[1];
        g((char) (44980 - KeyEvent.normalizeMetaState(0)), ViewConfiguration.getPressedStateDuration() >> 16, new char[]{26936, 19243, 6492, 32417, 22865, 34894, 60227, 25004, 17022, 12891, 32293, 12363, 60220, 3924, 33792, 8666, 9991, 17680, 9266, 44662, 44461, 19297, 18873, 52098, 48369, 16293, 50304, 61857, 12548, 54442, 7986, 38168, 24223, 51347, 44687, 43893, 58948, 13671, 993, 33460}, new char[]{41455, 39103, 47803, 23364}, new char[]{33817, 24783, 46157, 17839}, objArr3);
        return ((String) objArr3[0]).intern();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004d, code lost:
    
        if (r15 != 1) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004f, code lost:
    
        r2 = r2 + 59;
        com.tmoney.d.a.onTransact = r2 % 128;
        r2 = r2 % 2;
        r15 = new java.lang.Object[1];
        g((char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1)) + 18503), android.text.AndroidCharacter.getMirror('0') - '0', new char[]{7636, 5465, 13588, 54838, 36445, 34199, 5945, 12176, 39281, 38677, 11268, 31185, 6925, 8035, 26366, 38320, 41047, 28637, 6891, 43802, 4909, 57862, 31693, 62376, 21861, 36469, 40497, 13305, 20095, 2400, 26756, 27037, 34894, 9746, 14906, 64346, 33090, 22676, 38699, 22094, 22265, 24290, 45122, 58404, 47460, 11759, 10639, 38419, 8972, 7265, 9266, 42077, 53421, 18350}, new char[]{41455, 39103, 47803, 23364}, new char[]{56756, 50177, 18154, 13896}, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0086, code lost:
    
        return ((java.lang.String) r15[0]).intern();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0089, code lost:
    
        if (r15 != 2) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x008b, code lost:
    
        r15 = new java.lang.Object[1];
        g((char) (android.os.Process.getGidForName("") + 18503), android.widget.ExpandableListView.getPackedPositionChild(0) + 1, new char[]{7636, 5465, 13588, 54838, 36445, 34199, 5945, 12176, 39281, 38677, 11268, 31185, 6925, 8035, 26366, 38320, 41047, 28637, 6891, 43802, 4909, 57862, 31693, 62376, 21861, 36469, 40497, 13305, 20095, 2400, 26756, 27037, 34894, 9746, 14906, 64346, 33090, 22676, 38699, 22094, 22265, 24290, 45122, 58404, 47460, 11759, 10639, 38419, 8972, 7265, 9266, 42077, 53421, 18350}, new char[]{41455, 39103, 47803, 23364}, new char[]{56756, 50177, 18154, 13896}, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b7, code lost:
    
        return ((java.lang.String) r15[0]).intern();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b8, code lost:
    
        return "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r15 == 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
    
        if (r15 == 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        r15 = new java.lang.Object[1];
        g((char) (15307 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16)), (-2118737988) - android.view.View.MeasureSpec.getMode(0), new char[]{46346, 15113, 52134, 16507, 9180, 24244, 16041, 42065, 11992, 20368, 19053, 47468, 22794, 1587, 1365, 17427, 48658, 48479, 19985, 38907, 49211, 4447, 11074, 46059, 50802, 31288, 60164, 36637, 41372, 27398, 19440, 13039, 20258, 35381, 19608, 40536, 60132, 47044, 27716, 20329, 29090, 30220, 63034, 47665, 27382, 20686, 46002, 29348, 17791, 49463, 568, 59764, 6121, 60130, 46224, 47450, 44658}, new char[]{41455, 39103, 47803, 23364}, new char[]{48171, 46751, 52097, 54587}, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004a, code lost:
    
        return ((java.lang.String) r15[0]).intern();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String getTmoneyUsableCheckUrl(int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onTransact + 81;
        int i4 = i3 % 128;
        asInterface = i4;
        if (i3 % 2 != 0) {
            int i5 = 63 / 0;
        }
    }

    public final String getTpoInfoUrl(int i) throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        if (i == 0) {
            Object[] objArr = new Object[1];
            h(View.resolveSizeAndState(0, 0, 0) + 48, 49 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), new char[]{'\f', 24, 24, 20, 23, 65502, 65491, 65491, '\b', '\t', 26, 17, 24, 20, 19, 65490, 24, 17, 19, 18, '\t', 29, 65490, 7, 19, 65490, 15, 22, 65502, 65499, 65498, 65494, 65495, 65491, 22, 24, 65512, 5, 24, 5, 65527, '\t', 18, '\b', 65490, 24, 20, 19}, ((Process.getThreadPriority(0) + 20) >> 6) + 173, false, objArr);
            obj = objArr[0];
        } else {
            if (i != 1) {
                if (i == 2) {
                    int i3 = onTransact + 81;
                    asInterface = i3 % 128;
                    int i4 = i3 % 2;
                    Object[] objArr2 = new Object[1];
                    h(23 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 39, new char[]{65487, 16, 4, 65487, 26, 6, 15, 16, 14, 21, 65487, 16, 17, 21, 65488, 65488, 65499, 20, 17, 21, 21, '\t', 16, 17, 21, 65487, 5, 15, 6, 65524, 2, 21, 2, 65509, 21, 19, 65488, 19, '\f'}, 176 - View.getDefaultSize(0, 0), true, objArr2);
                    return ((String) objArr2[0]).intern();
                }
                int i5 = asInterface + 7;
                onTransact = i5 % 128;
                if (i5 % 2 != 0) {
                    return "";
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            int i6 = onTransact + 119;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            Object[] objArr3 = new Object[1];
            h(Color.rgb(0, 0, 0) + 16777238, 38 - ImageFormat.getBitsPerPixel(0), new char[]{65487, 16, 4, 65487, 26, 6, 15, 16, 14, 21, 65487, 16, 17, 21, 65488, 65488, 65499, 20, 17, 21, 21, '\t', 16, 17, 21, 65487, 5, 15, 6, 65524, 2, 21, 2, 65509, 21, 19, 65488, 19, '\f'}, 176 - TextUtils.getCapsMode("", 0, 0), true, objArr3);
            obj = objArr3[0];
        }
        return ((String) obj).intern();
    }

    public final String getUsePlaceUrl(int i) throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        int i3 = asInterface;
        int i4 = i3 + 65;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        if (i == 0) {
            Object[] objArr = new Object[1];
            g((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 64181), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1035969469, new char[]{2316, 44525, 51758, 43199, 20726, 41284, 58182, 9815, 51471, 14874, 59874, 18969, 36512, 4565, 40580, 9148, 32033, 18903, 2277, 21921, 31172, 6164, 39695, 9012, 13882, 47288, 46428, 26844, 30107, 58616, 48347, 23302, 21799, 24877, 33646, 36547, 3188, 58659, 25170, 56165, 61893, 23520, 32453, 51504, 29026, 23318, 7338, 43699, 57811, 30120, 28941, 20989, 41340, 25084, 19204}, new char[]{41455, 39103, 47803, 23364}, new char[]{17483, 16476, 46274, 64762}, objArr);
            obj = objArr[0];
        } else {
            if (i == 1) {
                Object[] objArr2 = new Object[1];
                g((char) (29245 - TextUtils.getOffsetBefore("", 0)), TextUtils.indexOf("", "", 0, 0), new char[]{29773, 14930, 4797, 33584, 57075, 26474, 47401, 38049, 33470, 20240, 12655, 40399, 56086, 10797, 60499, 46545, 15533, 4622, 50460, 24898, 62405, 31656, 12808, 26223, 35989, 46172, 59373, 45997, 5182, 22769, 10148, 55247, 32214, 63643, 1631, 5780, 53838, 56080, 58966, 20748, 15771, 62717, 39657, 22466, 53557, 29051, 11741, 28843, 46847, 13510, 19359, 6773}, new char[]{41455, 39103, 47803, 23364}, new char[]{11208, 62253, 15855, 17010}, objArr2);
                return ((String) objArr2[0]).intern();
            }
            if (i != 2) {
                return "";
            }
            int i6 = i3 + 21;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            Object[] objArr3 = new Object[1];
            g((char) (TextUtils.indexOf("", "") + 29245), ViewConfiguration.getFadingEdgeLength() >> 16, new char[]{29773, 14930, 4797, 33584, 57075, 26474, 47401, 38049, 33470, 20240, 12655, 40399, 56086, 10797, 60499, 46545, 15533, 4622, 50460, 24898, 62405, 31656, 12808, 26223, 35989, 46172, 59373, 45997, 5182, 22769, 10148, 55247, 32214, 63643, 1631, 5780, 53838, 56080, 58966, 20748, 15771, 62717, 39657, 22466, 53557, 29051, 11741, 28843, 46847, 13510, 19359, 6773}, new char[]{41455, 39103, 47803, 23364}, new char[]{11208, 62253, 15855, 17010}, objArr3);
            obj = objArr3[0];
        }
        return ((String) obj).intern();
    }

    public final byte[] ivByteKey() {
        byte[] bArr;
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 61;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            bArr = this.e;
            int i4 = 54 / 0;
        } else {
            bArr = this.e;
        }
        int i5 = i2 + 111;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 48 / 0;
        }
        return bArr;
    }

    public final String logAlgorithm() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 79;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 33;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return "DES";
    }

    public final byte[] logKey() {
        byte[] bArr;
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 13;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            bArr = this.f;
            int i4 = 82 / 0;
        } else {
            bArr = this.f;
        }
        int i5 = i2 + 9;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return bArr;
    }

    public final String logTransformation() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 43;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 67 / 0;
        }
        int i5 = i2 + 41;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return "DES/ECB/PKCS5Padding";
    }

    public final String sdkAlgorithm() throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 69;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        g((char) ((KeyEvent.getMaxKeyCode() >> 16) + 5254), 764872089 - (ViewConfiguration.getDoubleTapTimeout() >> 16), new char[]{18156, 49734, 30066}, new char[]{41455, 39103, 47803, 23364}, new char[]{39401, 38661, 34349, 12052}, objArr);
        String strIntern = ((String) objArr[0]).intern();
        int i4 = onTransact + 119;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return strIntern;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String sdkTransformation() throws Throwable {
        Object obj;
        int i = 2 % 2;
        int i2 = onTransact + 61;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            Object[] objArr = new Object[1];
            g((char) Color.green(0), ExpandableListView.getPackedPositionGroup(1L), new char[]{31691, 27948, 5116, 6759, 11257, 21544, 15488, 47283, 50679, 16715, 44926, 19396, 44936, 62925, 47205, 58115, 33144, 9654, 60750, 35941}, new char[]{41455, 39103, 47803, 23364}, new char[]{48822, 60685, 11486, 17803}, objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            g((char) Color.green(0), ExpandableListView.getPackedPositionGroup(0L), new char[]{31691, 27948, 5116, 6759, 11257, 21544, 15488, 47283, 50679, 16715, 44926, 19396, 44936, 62925, 47205, 58115, 33144, 9654, 60750, 35941}, new char[]{41455, 39103, 47803, 23364}, new char[]{48822, 60685, 11486, 17803}, objArr2);
            obj = objArr2[0];
        }
        String strIntern = ((String) obj).intern();
        int i3 = onTransact + 15;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 80 / 0;
        }
        return strIntern;
    }

    public final void setCryptoHelperKey(String str) {
        int i = 2 % 2;
        int i2 = asInterface + 119;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        byte[] bytes = str.getBytes();
        if (i3 == 0) {
            this.d = bytes;
            throw null;
        }
        this.d = bytes;
        int i4 = asInterface + 75;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setIvByteKey(String str) {
        int i = 2 % 2;
        int i2 = onTransact + 33;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        byte[] bytes = str.getBytes();
        if (i3 == 0) {
            this.e = bytes;
        } else {
            this.e = bytes;
            int i4 = 14 / 0;
        }
    }

    public final void setKtAppKey(String str) {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 19;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        this.c = str;
        int i5 = i2 + 97;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public final void setLogKey(String str) {
        int i = 2 % 2;
        int i2 = asInterface + 107;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        byte[] bytes = str.getBytes();
        if (i3 == 0) {
            this.f = bytes;
            int i4 = 81 / 0;
        } else {
            this.f = bytes;
        }
        int i5 = asInterface + 57;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void setMktpAppToken(String str) {
        int i = 2 % 2;
        int i2 = onTransact + 3;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        this.b = str;
        int i5 = i3 + 115;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
    }

    private static void g(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        int i4 = $11 + 89;
        $10 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 5 % 5;
        }
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i6 = $11 + 23;
            $10 = i6 % 128;
            int i7 = i6 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1);
                    int iLastIndexOf = 42 - TextUtils.lastIndexOf("", '0', 0, 0);
                    int iLastIndexOf2 = TextUtils.lastIndexOf("", '0') + 1452;
                    byte b = (byte) ($$a[3] - 1);
                    byte b2 = b;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cIndexOf, iLastIndexOf, iLastIndexOf2, 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    char c2 = (char) (49124 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                    int iIndexOf = 44 - TextUtils.indexOf("", "", 0);
                    int size = 1494 - View.MeasureSpec.getSize(0);
                    byte b3 = $$a[3];
                    byte b4 = (byte) (b3 - 1);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c2, iIndexOf, size, 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23972 - (Process.myTid() >> 22)), View.resolveSize(0, 0) + 50, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 22938, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45848 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 29 - (Process.myTid() >> 22), (ViewConfiguration.getTapTimeout() >> 16) + 12577, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((int) (onExtraCallback ^ 7798559133331975163L)) ^ ((cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] ^ cArr4[iIntValue2]) ^ (onExtraCallbackWithResult ^ 7798559133331975163L))) ^ ((char) (onWarmupCompleted ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                i2 = 2;
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

    /* JADX WARN: Removed duplicated region for block: B:32:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void h(int i, int i2, char[] cArr, int i3, boolean z, Object[] objArr) throws Throwable {
        int i4;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i2];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i2) {
                break;
            }
            int i6 = $11 + 77;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i8 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(onNavigationEvent)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35126 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 23 - (ViewConfiguration.getTapTimeout() >> 16), ExpandableListView.getPackedPositionGroup(0L) + 10278, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    char packedPositionGroup = (char) (ExpandableListView.getPackedPositionGroup(0L) + 12843);
                    int i9 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 54;
                    int pressedStateDuration = 2167 - (ViewConfiguration.getPressedStateDuration() >> 16);
                    byte b = $$a[0];
                    byte b2 = (byte) (b - 5);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(packedPositionGroup, i9, pressedStateDuration, 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
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
        if (i > 0) {
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            char[] cArr4 = new char[i2];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i2) {
                int i10 = $10 + 123;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    char bitsPerPixel = (char) (12842 - ImageFormat.getBitsPerPixel(0));
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 56;
                    int iArgb = Color.argb(0, 0, 0, 0) + 2167;
                    byte b3 = $$a[0];
                    byte b4 = (byte) (b3 - 5);
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(bitsPerPixel, iLastIndexOf, iArgb, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i4 = 2083011369;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    static void onWarmupCompleted() {
        onExtraCallbackWithResult = 3998834236103510548L;
        onExtraCallback = -1776194565;
        onWarmupCompleted = (char) 27643;
        onNavigationEvent = 478308984;
    }
}
