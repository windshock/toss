package com.tmoney.ota.b;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tmoney.ota.dto.APDU;
import com.tmoney.ota.dto.EfIssuActCDTO;
import com.tmoney.utils.ByteHelper;
import com.tmoney.utils.LogHelper;
import com.tmoney.utils.StringHelper;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class a extends b {
    public static final String PROGRAM_ID = "EfIssuActC";
    private static short[] onWarmupCompleted;
    private final String b;
    private EfIssuActCDTO c;
    private final int d;
    private static final byte[] $$a = {35, -27, Byte.MIN_VALUE, 50};
    private static final int $$b = 97;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 1;
    private static int IAuthTabCallback = 1985545553;
    private static int onExtraCallback = -1538795394;
    private static int onExtraCallbackWithResult = 505593848;
    private static byte[] onNavigationEvent = {-125};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, byte b2, short s) {
        int i;
        int i2 = 3 - (b2 * 3);
        int i3 = (b * 2) + 115;
        int i4 = s * 2;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i4];
        int i5 = 0 - i4;
        if (bArr == null) {
            int i6 = i3;
            i3 = i5;
            i = 0;
            i3 += i6;
            bArr2[i] = (byte) i3;
            if (i == i5) {
                return new String(bArr2, 0);
            }
            i2++;
            i++;
            i6 = bArr[i2];
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

    public a(EfIssuActCDTO efIssuActCDTO) {
        super(PROGRAM_ID);
        this.b = a.class.getSimpleName();
        this.d = 446;
        this.c = efIssuActCDTO;
    }

    @Override // com.tmoney.ota.b.b
    protected final byte[] a() throws Throwable {
        int i = 2 % 2;
        String str = "";
        for (int i2 = 0; i2 < this.c.getTrmApduList().size(); i2++) {
            APDU apdu = this.c.getTrmApduList().get(i2);
            str = str + apdu.getCMD();
            if (apdu.getSW().length > 0) {
                int i3 = asInterface + 67;
                IAuthTabCallbackStub = i3 % 128;
                if (i3 % 2 == 0 ? apdu.getSW()[0] != null : apdu.getSW()[1] != null) {
                    if (!"".equals(apdu.getSW()[0])) {
                        str = str + "^";
                    }
                }
            }
            for (int i4 = 0; i4 < apdu.getSW().length; i4++) {
                str = str + apdu.getSW()[i4];
                if (i4 < apdu.getSW().length - 1) {
                    str = str + ";";
                }
            }
            if (i2 < this.c.getTrmApduList().size() - 1) {
                str = str + "|";
            }
        }
        int length = str.length() / 260;
        if (str.length() % 260 > 0) {
            length++;
        }
        int i5 = length * 260;
        int i6 = i5 + 446;
        LogHelper.d(this.b, "PACKET TOTAL >> appCount = " + length + " total length = " + i6);
        byte[] bArr = new byte[i6];
        ByteHelper.MEMSET(bArr, 0, (byte) 32, i6);
        ByteHelper.STRNCPYToSpace(bArr, 0, this.c.getISSU_REQ_SNO().getBytes(), 0, 16);
        Object[] objArr = new Object[1];
        e((short) (Drawable.resolveOpacity(0, 0) - 77), (byte) (51 - TextUtils.getCapsMode("", 0, 0)), 769729190 - TextUtils.indexOf((CharSequence) "", '0', 0), ExpandableListView.getPackedPositionGroup(0L) + 1167759425, (ViewConfiguration.getKeyRepeatDelay() >> 16) - 119, objArr);
        ByteHelper.STRNCPYToSpace(bArr, 16, ((String) objArr[0]).intern().getBytes(), 0, 1);
        ByteHelper.STRNCPYToSpace(bArr, 17, this.c.getTLCN_SERV_ID().getBytes(), 0, 3);
        ByteHelper.STRNCPYToSpace(bArr, 20, StringHelper.padZero(this.c.getMSG_SNO(), 3).getBytes(), 0, 3);
        ByteHelper.STRNCPYToSpace(bArr, 23, this.c.getSP_ID().getBytes(), 0, 7);
        ByteHelper.STRNCPYToSpace(bArr, 30, this.c.getRST_CD().getBytes(), 0, 1);
        ByteHelper.STRNCPYToSpace(bArr, 31, this.c.getRTRM_YN().getBytes(), 0, 1);
        ByteHelper.STRNCPYToSpace(bArr, 32, this.c.getCardPrdInhrNo().getBytes(), 0, 16);
        ByteHelper.STRNCPYToSpace(bArr, 48, this.c.getUnicCardNo().getBytes(), 0, 20);
        ByteHelper.STRNCPYToSpace(bArr, 68, this.c.getTmcrNo().getBytes(), 0, 16);
        ByteHelper.STRNCPYToSpace(bArr, 84, this.c.getHndhTelNo().getBytes(), 0, 12);
        LogHelper.d(this.b, "TLCM_CD:" + this.c.getTlcmCd());
        ByteHelper.STRNCPYToSpace(bArr, 96, this.c.getTlcmCd().getBytes(), 0, 3);
        ByteHelper.STRNCPYToSpace(bArr, 99, this.c.getCardPrdId().getBytes(), 0, 4);
        if (this.c.getDtaRecSno() != null) {
            ByteHelper.STRNCPYToSpace(bArr, 103, this.c.getDtaRecSno().getBytes(), 0, 4);
        }
        if (this.c.getAfltPrdId() != null) {
            int i7 = asInterface + 67;
            IAuthTabCallbackStub = i7 % 128;
            if (i7 % 2 != 0) {
                ByteHelper.STRNCPYToSpace(bArr, 51, this.c.getAfltPrdId().getBytes(), 1, 66);
            } else {
                ByteHelper.STRNCPYToSpace(bArr, 107, this.c.getAfltPrdId().getBytes(), 0, 12);
            }
        }
        ByteHelper.STRNCPYToSpace(bArr, 119, this.c.getCardStaCd().getBytes(), 0, 4);
        ByteHelper.STRNCPYToSpace(bArr, 123, StringHelper.padZero(length, 3).getBytes(), 0, 3);
        ByteHelper.STRNCPYToSpace(bArr, 126, str.getBytes(), 0, i5);
        ByteHelper.STRNCPYToSpace(bArr, i5 + 126, this.c.getTL_PRRS_CD().getBytes(), 0, 4);
        ByteHelper.STRNCPYToSpace(bArr, i5 + 130, this.c.getRST_MSG().getBytes(), 0, 300);
        int i8 = IAuthTabCallbackStub + 57;
        asInterface = i8 % 128;
        if (i8 % 2 != 0) {
            return bArr;
        }
        throw null;
    }

    private static void e(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        long j;
        int i4;
        boolean z;
        int i5 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onExtraCallback)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43425 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), View.MeasureSpec.getMode(0) + 42, 22440 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            boolean z2 = iIntValue == -1;
            if (z2) {
                int i6 = $10 + 9;
                int i7 = i6 % 128;
                $11 = i7;
                int i8 = i6 % 2;
                byte[] bArr = onNavigationEvent;
                if (bArr != null) {
                    int i9 = i7 + 15;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i11 = 0;
                    while (i11 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i11])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - Color.alpha(0)), 55 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 2167 - (ViewConfiguration.getLongPressTimeout() >> 16), -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr2[i11] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        i11++;
                        int i12 = $10 + 7;
                        $11 = i12 % 128;
                        int i13 = i12 % 2;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(IAuthTabCallback)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.blue(0) + 43424), 42 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 22438 - ExpandableListView.getPackedPositionChild(0L), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L))));
                    j = -4629411779493505016L;
                } else {
                    j = -4629411779493505016L;
                    iIntValue = (short) (((short) (onWarmupCompleted[i + ((int) (IAuthTabCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L))));
                }
            } else {
                j = -4629411779493505016L;
            }
            if (iIntValue > 0) {
                int i14 = ((i + iIntValue) - 2) + ((int) (IAuthTabCallback ^ j));
                if (z2) {
                    int i15 = $10 + 123;
                    $11 = i15 % 128;
                    int i16 = i15 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i14 + i4;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onExtraCallbackWithResult), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 87, 9615 - AndroidCharacter.getMirror('0'), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = onNavigationEvent;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i17 = 0; i17 < length2; i17++) {
                        bArr5[i17] = (byte) (bArr4[i17] ^ (-4629411779493505016L));
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i18 = $11 + 31;
                    $10 = i18 % 128;
                    int i19 = i18 % 2;
                    z = true;
                } else {
                    z = false;
                }
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (!z) {
                        short[] sArr = onWarmupCompleted;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        byte[] bArr6 = onNavigationEvent;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
