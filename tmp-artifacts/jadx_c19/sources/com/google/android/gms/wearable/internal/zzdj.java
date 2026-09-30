package com.google.android.gms.wearable.internal;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.common.data.DataBufferRef;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.DataEvent;
import com.google.android.gms.wearable.DataItem;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzdj extends DataBufferRef implements DataEvent {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    private static int[] onNavigationEvent = {2102639234, 2034965927, -1353388356, 423904375, 529476725, 1291712688, 1052697503, 56199052, -223524514, -432560743, 584028583, -1355657515, 1403668943, 1174325177, -1080116374, 85153087, -389632359, -599394733};
    private final int zza;

    public zzdj(DataHolder dataHolder, int i2, int i3) {
        super(dataHolder, i2);
        this.zza = i3;
    }

    public final /* synthetic */ Object freeze() {
        int i2 = 2 % 2;
        zzdi zzdiVar = new zzdi(this);
        int i3 = IAuthTabCallback + 109;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 83 / 0;
        }
        return zzdiVar;
    }

    @Override // com.google.android.gms.wearable.DataEvent
    public final DataItem getDataItem() {
        int i2 = 2 % 2;
        zzdq zzdqVar = new zzdq(this.mDataHolder, this.mDataRow, this.zza);
        int i3 = IAuthTabCallback + 37;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return zzdqVar;
    }

    @Override // com.google.android.gms.wearable.DataEvent
    public final int getType() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 117;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        int integer = getInteger("event_type");
        int i5 = onExtraCallback + 109;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return integer;
    }

    public final String toString() throws Throwable {
        String strIntern;
        int i2 = 2 % 2;
        if (getInteger("event_type") == 1) {
            strIntern = "changed";
        } else if (getInteger("event_type") == 2) {
            int i3 = onExtraCallback + 41;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            strIntern = "deleted";
        } else {
            Object[] objArr = new Object[1];
            a(new int[]{1656421837, 779559842, -586224246, 1746663124}, ExpandableListView.getPackedPositionType(0L) + 7, objArr);
            strIntern = ((String) objArr[0]).intern();
        }
        String str = "DataEventRef{ type=" + strIntern + ", dataitem=" + getDataItem().toString() + " }";
        int i4 = onExtraCallback + 55;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static void a(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = onNavigationEvent;
        int i4 = -1469660336;
        int i5 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $10 + 81;
                $11 = i7 % 128;
                if (i7 % 2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i6])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.red(0), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 72, (ViewConfiguration.getTouchSlop() >> 8) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr3[i6] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                        i6 %= 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(iArr2[i6])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTapTimeout() >> 16), Drawable.resolveOpacity(0, 0) + 72, TextUtils.indexOf("", "", 0) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i6] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    i6++;
                }
                i4 = -1469660336;
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = onNavigationEvent;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i8 = 0;
            while (i8 < length3) {
                int i9 = $11 + 61;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    Object[] objArr4 = new Object[1];
                    objArr4[i5] = Integer.valueOf(iArr5[i8]);
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 72 - Color.argb(i5, i5, i5, i5), TextUtils.lastIndexOf("", '0', i5) + 8849, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i8] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                } else {
                    Object[] objArr5 = {Integer.valueOf(iArr5[i8])};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 73 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 8849 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i8] = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                    i8++;
                }
                i5 = 0;
            }
            iArr5 = iArr6;
        }
        int i10 = i5;
        System.arraycopy(iArr5, i10, iArr4, i10, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i10;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[i10] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i11 = 0;
            for (int i12 = 16; i11 < i12; i12 = 16) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i11];
                Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - View.resolveSize(0, 0)), 39 - Color.green(0), ((byte) KeyEvent.getModifierMetaStateMask()) + 10302, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback5).invoke(null, objArr6)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i11++;
            }
            int i13 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i13;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i14 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr7 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback6 == null) {
                objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4033 - TextUtils.getCapsMode("", 0, 0)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 77, ExpandableListView.getPackedPositionGroup(0L) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback6).invoke(null, objArr7);
            i10 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }
}
