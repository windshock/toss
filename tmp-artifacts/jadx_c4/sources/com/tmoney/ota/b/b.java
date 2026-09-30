package com.tmoney.ota.b;

import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tmoney.utils.ByteHelper;
import com.tmoney.utils.DateTimeHelper;
import com.tmoney.utils.LogHelper;
import com.tmoney.utils.StringHelper;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class b {
    protected String a;
    private final String b = "OTAPacket";
    private static final byte[] $$d = {46, -35, 45, 111};
    private static final int $$e = 99;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 0;
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted = 478308968;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$f(byte b, short s, int i) {
        int i2;
        int i3;
        byte[] bArr = $$d;
        int i4 = (b * 4) + 4;
        int i5 = 1 - (s * 4);
        int i6 = (i * 4) + 105;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i7 = i6;
            i3 = 0;
            int i8 = i4;
            int i9 = i4 + i7;
            int i10 = i8 + 1;
            i2 = i3;
            i6 = i9;
            i4 = i10;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i5) {
                return new String(bArr2, 0);
            }
            int i11 = i6;
            i8 = i4;
            i4 = bArr[i4];
            i7 = i11;
            int i92 = i4 + i7;
            int i102 = i8 + 1;
            i2 = i3;
            i6 = i92;
            i4 = i102;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i5) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i5) {
            }
        }
    }

    public b(String str) {
        this.a = str;
    }

    protected abstract byte[] a();

    public String makePacket() throws Throwable {
        int i = 2 % 2;
        byte[] bArr = new byte[398];
        ByteHelper.MEMSET(bArr, 0, (byte) 32, 398);
        ByteHelper.STRNCPYToSpace(bArr, 0, DateTimeHelper.date("yyyyMMdd").getBytes(), 0, 8);
        ByteHelper.STRNCPYToSpace(bArr, 8, "solaris20000".getBytes(), 0, 12);
        ByteHelper.STRNCPYToSpace(bArr, 20, "11032335800001".getBytes(), 0, 14);
        ByteHelper.STRNCPYToSpace(bArr, 34, "00".getBytes(), 0, 2);
        ByteHelper.STRNCPYToSpace(bArr, 36, "D01".getBytes(), 0, 3);
        ByteHelper.STRNCPYToSpace(bArr, 39, "D".getBytes(), 0, 1);
        ByteHelper.STRNCPYToSpace(bArr, 40, "CRN".getBytes(), 0, 3);
        ByteHelper.STRNCPYToSpace(bArr, 43, "CRN".getBytes(), 0, 3);
        ByteHelper.STRNCPYToSpace(bArr, 46, "0101".getBytes(), 0, 4);
        ByteHelper.STRNCPYToSpace(bArr, 50, "S".getBytes(), 0, 1);
        ByteHelper.STRNCPYToSpace(bArr, 51, "S".getBytes(), 0, 1);
        ByteHelper.STRNCPYToSpace(bArr, 52, DateTimeHelper.date("yyyyMMddHHmmssttt").getBytes(), 0, 17);
        ByteHelper.STRNCPYToSpace(bArr, 69, this.a.getBytes(), 0, 12);
        ByteHelper.STRNCPYToSpace(bArr, 81, "".getBytes(), 0, 12);
        ByteHelper.STRNCPYToSpace(bArr, 93, "CBS_BSM_DVS00001".getBytes(), 0, 16);
        ByteHelper.STRNCPYToSpace(bArr, 109, "".getBytes(), 0, 17);
        ByteHelper.STRNCPYToSpace(bArr, 126, "".getBytes(), 0, 1);
        ByteHelper.STRNCPYToSpace(bArr, 127, "".getBytes(), 0, 9);
        ByteHelper.STRNCPYToSpace(bArr, 136, "".getBytes(), 0, 4);
        ByteHelper.STRNCPYToSpace(bArr, 140, "".getBytes(), 0, 20);
        ByteHelper.STRNCPYToSpace(bArr, 160, "".getBytes(), 0, 8);
        ByteHelper.STRNCPYToSpace(bArr, 168, "".getBytes(), 0, 8);
        ByteHelper.STRNCPYToSpace(bArr, 176, "".getBytes(), 0, 20);
        ByteHelper.STRNCPYToSpace(bArr, 196, "".getBytes(), 0, 80);
        ByteHelper.STRNCPYToSpace(bArr, 276, "98".getBytes(), 0, 2);
        ByteHelper.STRNCPYToSpace(bArr, 278, "00000110".getBytes(), 0, 8);
        ByteHelper.STRNCPYToSpace(bArr, 286, "".getBytes(), 0, 10);
        ByteHelper.STRNCPYToSpace(bArr, 296, "".getBytes(), 0, 100);
        ByteHelper.STRNCPYToSpace(bArr, 396, "90".getBytes(), 0, 2);
        LogHelper.d("OTAPacket", this.a + " header.length:398");
        byte[] bArrA = a();
        LogHelper.d("OTAPacket", this.a + " body.length:" + bArrA.length);
        byte[] bArr2 = new byte[bArrA.length + 416];
        ByteHelper.MEMSET(bArr2, 0, (byte) 32, bArrA.length + 416);
        String strValueOf = String.valueOf(bArrA.length + 408);
        Object[] objArr = new Object[1];
        f(View.getDefaultSize(0, 0) + 1, -ExpandableListView.getPackedPositionChild(0L), new char[]{0}, 113 - ((Process.getThreadPriority(0) + 20) >> 6), false, objArr);
        ByteHelper.STRNCPYToSpace(bArr2, 0, StringHelper.lpad(strValueOf, 8, ((String) objArr[0]).intern()).getBytes(), 0, 8);
        System.arraycopy(bArr, 0, bArr2, 8, 398);
        String strValueOf2 = String.valueOf(bArrA.length);
        Object[] objArr2 = new Object[1];
        f(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -TextUtils.indexOf((CharSequence) "", '0', 0, 0), new char[]{0}, 113 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), false, objArr2);
        ByteHelper.STRNCPYToSpace(bArr2, 406, StringHelper.lpad(strValueOf2, 8, ((String) objArr2[0]).intern()).getBytes(), 0, 8);
        System.arraycopy(bArrA, 0, bArr2, 414, bArrA.length);
        ByteHelper.STRNCPYToSpace(bArr2, bArrA.length + 414, "@@".getBytes(), 0, 2);
        String str = new String(bArr2);
        int i2 = IAuthTabCallback + 1;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    private static void f(int i, int i2, char[] cArr, int i3, boolean z, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i2];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i2) {
            int i5 = $11 + 71;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i7 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(onWarmupCompleted)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35125 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), 23 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.indexOf("", "") + 10278, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12844 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 55, View.MeasureSpec.getMode(0) + 2167, 1298711993, false, $$f(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i > 0) {
            int i8 = $10 + 103;
            $11 = i8 % 128;
            int i9 = i8 % 2;
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
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), Process.getGidForName("") + 56, 2167 - ExpandableListView.getPackedPositionGroup(0L), 1298711993, false, $$f(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        String str = new String(cArr2);
        int i10 = $10 + 55;
        $11 = i10 % 128;
        int i11 = i10 % 2;
        objArr[0] = str;
    }
}
