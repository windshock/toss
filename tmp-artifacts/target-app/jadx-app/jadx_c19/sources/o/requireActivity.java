package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import im.toss.rn.granite.core.module.appsintoss.bridge.ad.ShowTossAdOrAdmobBridge$;
import java.lang.reflect.Method;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class requireActivity {
    private static long IAuthTabCallback = 1000000000;
    private static final String[] IAuthTabCallbackDefault;
    private static final int[] IAuthTabCallbackStub;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int access000 = 0;
    private static final String[] asBinder;
    private static long asInterface = -2147483648L;
    private static long onExtraCallback = 2147483647L;
    private static int onExtraCallbackWithResult = 1000000000;
    static final String onNavigationEvent;
    private static int onTransact = 1000000;
    static final String onWarmupCompleted;
    private static final byte[] $$a = {77, -64, 102, Byte.MIN_VALUE};
    private static final int $$b = 133;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int getInterfaceDescriptor = 0;
    private static int access100 = 1;
    private static int IAuthTabCallback_Parcel = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i2, int i3, short s) {
        int i4;
        int i5 = 105 - (i3 * 2);
        int i6 = 3 - (i2 * 3);
        int i7 = s * 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i7];
        int i8 = 0 - i7;
        if (bArr == null) {
            int i9 = i8;
            i4 = 0;
            i5 += -i9;
            i6++;
            bArr2[i4] = (byte) i5;
            if (i4 == i8) {
                return new String(bArr2, 0);
            }
            i4++;
            i9 = bArr[i6];
            i5 += -i9;
            i6++;
            bArr2[i4] = (byte) i5;
            if (i4 == i8) {
            }
        } else {
            i4 = 0;
            i6++;
            bArr2[i4] = (byte) i5;
            if (i4 == i8) {
            }
        }
    }

    static int IAuthTabCallback(int i2) {
        int i3 = 2 % 2;
        int i4 = getInterfaceDescriptor;
        int i5 = i4 + 25;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        int i7 = (int) ((i2 * 274877907) >>> 38);
        int i8 = i4 + 99;
        access100 = i8 % 128;
        int i9 = i8 % 2;
        return i7;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i2, int i3, int i4, int i5, int i6, int i7, Object[] objArr) {
        int i8 = ~(i4 | i6 | i5);
        int i9 = ~i4;
        int i10 = ~i6;
        int i11 = ~(i9 | i10);
        int i12 = ~i5;
        int i13 = (~(i9 | i12)) | i11 | (~(i10 | i12));
        int i14 = i12 | i11;
        int i15 = i4 + i6 + i7 + (105149790 * i3) + ((-719480883) * i2);
        int i16 = i15 * i15;
        int i17 = (i4 * (-424837635)) + 281018368 + ((-424837635) * i6) + (1798143484 * i8) + (i13 * (-1798143484)) + ((-1798143484) * i14) + (2071986176 * i7) + ((-654311424) * i3) + (1702887424 * i2) + ((-155189248) * i16);
        int i18 = (i4 * 910058005) + 1460508013 + (i6 * 910058005) + (i8 * (-484)) + (i13 * 484) + (i14 * 484) + (i7 * 910058489) + (i3 * (-759332242)) + (i2 * (-1121784475)) + (i16 * 1086324736);
        int i19 = i17 + (i18 * i18 * (-1925185536));
        return i19 != 1 ? i19 != 2 ? i19 != 3 ? onExtraCallback(objArr) : onExtraCallbackWithResult(objArr) : onNavigationEvent(objArr) : onWarmupCompleted(objArr);
    }

    static {
        access000 = 1;
        IAuthTabCallback();
        onWarmupCompleted = "-2147483648";
        onNavigationEvent = "-9223372036854775808";
        IAuthTabCallbackStub = new int[1000];
        int i2 = 2 % 2;
        int i3 = 0;
        for (int i4 = 0; i4 < 10; i4++) {
            for (int i5 = 0; i5 < 10; i5++) {
                int i6 = IAuthTabCallback_Parcel + 1;
                access000 = i6 % 128;
                int i7 = i6 % 2;
                int i8 = 0;
                while (i8 < 10) {
                    int i9 = IAuthTabCallback_Parcel + 69;
                    access000 = i9 % 128;
                    if (i9 % 2 == 0) {
                        IAuthTabCallbackStub[i3] = ((i4 % 103) - 28) | ((i5 + 16) * 39) | (i8 * 101);
                        i8 += 51;
                        i3 += 27;
                    } else {
                        IAuthTabCallbackStub[i3] = ((i4 + 48) << 16) | ((i5 + 48) << 8) | (i8 + 48);
                        i8++;
                        i3++;
                    }
                }
            }
        }
        Object[] objArr = new Object[1];
        a((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), new char[]{0}, true, 222 - TextUtils.lastIndexOf("", '0', 0, 0), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1, -MotionEvent.axisFromString(""), new char[]{0}, true, 223 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr2);
        String strIntern2 = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a(-ImageFormat.getBitsPerPixel(0), -TextUtils.indexOf((CharSequence) "", '0'), new char[]{0}, false, 226 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr3);
        IAuthTabCallbackDefault = new String[]{strIntern, strIntern2, ((String) objArr3[0]).intern(), "3", "4", "5", "6", "7", "8", "9", "10"};
        asBinder = new String[]{"-1", "-2", "-3", "-4", "-5", "-6", "-7", "-8", "-9", "-10"};
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i2;
        int i3;
        int iIntValue = ((Number) objArr[0]).intValue();
        char[] cArr = (char[]) objArr[1];
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int i4 = 2 % 2;
        if (iIntValue < 0) {
            if (iIntValue == Integer.MIN_VALUE) {
                int i5 = getInterfaceDescriptor + 73;
                access100 = i5 % 128;
                if (i5 % 2 != 0) {
                    return Integer.valueOf(onExtraCallbackWithResult(cArr, iIntValue2));
                }
                int i6 = 22 / 0;
                return Integer.valueOf(onExtraCallbackWithResult(cArr, iIntValue2));
            }
            cArr[iIntValue2] = '-';
            iIntValue = -iIntValue;
            iIntValue2++;
        }
        if (iIntValue < onTransact) {
            if (iIntValue < 1000) {
                int i7 = getInterfaceDescriptor + 89;
                access100 = i7 % 128;
                if (i7 % 2 != 0 ? iIntValue < 10 : iIntValue < 52) {
                    cArr[iIntValue2] = (char) (iIntValue + 48);
                    return Integer.valueOf(iIntValue2 + 1);
                }
                return Integer.valueOf(onExtraCallbackWithResult(iIntValue, cArr, iIntValue2));
            }
            int iIAuthTabCallback = IAuthTabCallback(iIntValue);
            return Integer.valueOf(onWarmupCompleted(iIntValue - (iIAuthTabCallback * 1000), cArr, onExtraCallbackWithResult(iIAuthTabCallback, cArr, iIntValue2)));
        }
        int i8 = onExtraCallbackWithResult;
        if (iIntValue >= i8) {
            int i9 = access100 + 83;
            int i10 = i9 % 128;
            getInterfaceDescriptor = i10;
            if (i9 % 2 == 0 ? (i2 = iIntValue - i8) < i8 : (i2 = iIntValue >> i8) < i8) {
                i3 = iIntValue2 + 1;
                cArr[iIntValue2] = '1';
            } else {
                int i11 = i10 + 83;
                access100 = i11 % 128;
                int i12 = i11 % 2;
                i2 -= i8;
                i3 = iIntValue2 + 1;
                cArr[iIntValue2] = '2';
            }
            return Integer.valueOf(onNavigationEvent(i2, cArr, i3));
        }
        int iIAuthTabCallback2 = IAuthTabCallback(iIntValue);
        int iIAuthTabCallback3 = IAuthTabCallback(iIAuthTabCallback2);
        return Integer.valueOf(onWarmupCompleted(iIntValue - (iIAuthTabCallback2 * 1000), cArr, onWarmupCompleted(iIAuthTabCallback2 - (iIAuthTabCallback3 * 1000), cArr, onExtraCallbackWithResult(iIAuthTabCallback3, cArr, iIntValue2))));
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i2, int i3, char[] cArr, boolean z, int i4, Object[] objArr) throws Throwable {
        int i5;
        char[] cArr2;
        Throwable cause;
        int i6 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr3 = new char[i2];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i5 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i2) {
                break;
            }
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr3[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i4 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i7 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr3[i7]), Integer.valueOf(IAuthTabCallbackStubProxy)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 35126), 22 - MotionEvent.axisFromString(""), 10278 - TextUtils.getCapsMode("", 0, 0), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr3[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (ViewConfiguration.getTapTimeout() >> 16)), 55 - KeyEvent.normalizeMetaState(0), 2166 - TextUtils.lastIndexOf("", '0', 0), 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
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
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i3;
            char[] cArr4 = new char[i2];
            System.arraycopy(cArr3, 0, cArr4, 0, i2);
            System.arraycopy(cArr4, 0, cArr3, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr4, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr3, 0, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            int i8 = $10 + 87;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                cArr2 = new char[i2];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 1;
            } else {
                cArr2 = new char[i2];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            }
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i2) {
                int i9 = $11 + 73;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr3[(i2 % simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) >> 1];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                    if (objOnExtraCallback3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 56 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), Color.blue(0) + 2167, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } else {
                    cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr3[(i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback4 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 12842), Color.red(0) + 55, KeyEvent.keyCodeFromString("") + 2167, 1298711993, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                i5 = 2083011369;
            }
            cArr3 = cArr2;
        }
        objArr[0] = new String(cArr3);
    }

    public static int IAuthTabCallback(int i2, byte[] bArr, int i3) {
        int i4;
        int i5;
        int i6 = i2;
        int i7 = 2 % 2;
        if (i6 >= 0) {
            i4 = i3;
        } else {
            if (i6 == Integer.MIN_VALUE) {
                int i8 = access100 + 63;
                getInterfaceDescriptor = i8 % 128;
                if (i8 % 2 == 0) {
                    Object[] objArr = {bArr, Integer.valueOf(i3)};
                    int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
                    int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
                    return ((Integer) onWarmupCompleted(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), -1608473608, iOnNavigationEvent, 1608473608, iOnNavigationEvent2, objArr)).intValue();
                }
                Object[] objArr2 = {bArr, Integer.valueOf(i3)};
                int iOnNavigationEvent3 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
                int iOnNavigationEvent4 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
                ((Integer) onWarmupCompleted(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), -1608473608, iOnNavigationEvent3, 1608473608, iOnNavigationEvent4, objArr2)).intValue();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            bArr[i3] = 45;
            i6 = -i6;
            i4 = i3 + 1;
        }
        if (i6 < onTransact) {
            int i9 = getInterfaceDescriptor + 71;
            access100 = i9 % 128;
            int i10 = i9 % 2;
            if (i6 < 1000) {
                if (i6 >= 10) {
                    return onExtraCallbackWithResult(i6, bArr, i4);
                }
                bArr[i4] = (byte) (i6 + 48);
                return i4 + 1;
            }
            int iIAuthTabCallback = IAuthTabCallback(i6);
            Object[] objArr3 = {Integer.valueOf(i6 - (iIAuthTabCallback * 1000)), bArr, Integer.valueOf(onExtraCallbackWithResult(iIAuthTabCallback, bArr, i4))};
            int iOnNavigationEvent5 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
            int iOnNavigationEvent6 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
            return ((Integer) onWarmupCompleted(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), -565810453, iOnNavigationEvent5, 565810454, iOnNavigationEvent6, objArr3)).intValue();
        }
        int i11 = onExtraCallbackWithResult;
        if (i6 < i11) {
            int iIAuthTabCallback2 = IAuthTabCallback(i6);
            int iIAuthTabCallback3 = IAuthTabCallback(iIAuthTabCallback2);
            Object[] objArr4 = {Integer.valueOf(iIAuthTabCallback2 - (iIAuthTabCallback3 * 1000)), bArr, Integer.valueOf(onExtraCallbackWithResult(iIAuthTabCallback3, bArr, i4))};
            int iOnNavigationEvent7 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
            int iOnNavigationEvent8 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
            Object[] objArr5 = {Integer.valueOf(i6 - (iIAuthTabCallback2 * 1000)), bArr, Integer.valueOf(((Integer) onWarmupCompleted(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), -565810453, iOnNavigationEvent7, 565810454, iOnNavigationEvent8, objArr4)).intValue())};
            int iOnNavigationEvent9 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
            int iOnNavigationEvent10 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
            return ((Integer) onWarmupCompleted(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), -565810453, iOnNavigationEvent9, 565810454, iOnNavigationEvent10, objArr5)).intValue();
        }
        int i12 = i6 - i11;
        if (i12 >= i11) {
            i12 -= i11;
            i5 = i4 + 1;
            bArr[i4] = 50;
            int i13 = access100 + 35;
            getInterfaceDescriptor = i13 % 128;
            int i14 = i13 % 2;
        } else {
            i5 = i4 + 1;
            bArr[i4] = 49;
        }
        Object[] objArr6 = {Integer.valueOf(i12), bArr, Integer.valueOf(i5)};
        int iOnNavigationEvent11 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent12 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        return ((Integer) onWarmupCompleted(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), -640435805, iOnNavigationEvent11, 640435808, iOnNavigationEvent12, objArr6)).intValue();
    }

    public static int onExtraCallbackWithResult(long j, char[] cArr, int i2) {
        int iOnNavigationEvent;
        int i3 = 2 % 2;
        if (j < 0) {
            int i4 = getInterfaceDescriptor + 59;
            int i5 = i4 % 128;
            access100 = i5;
            int i6 = i4 % 2;
            if (j > asInterface) {
                Object[] objArr = {Integer.valueOf((int) j), cArr, Integer.valueOf(i2)};
                return ((Integer) onWarmupCompleted(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), -1336744677, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 1336744679, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), objArr)).intValue();
            }
            if (j == Long.MIN_VALUE) {
                int i7 = i5 + 103;
                getInterfaceDescriptor = i7 % 128;
                int i8 = i7 % 2;
                int iIAuthTabCallback = IAuthTabCallback(cArr, i2);
                int i9 = getInterfaceDescriptor + 15;
                access100 = i9 % 128;
                if (i9 % 2 != 0) {
                    return iIAuthTabCallback;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            cArr[i2] = '-';
            j = -j;
            i2++;
        } else if (j <= onExtraCallback) {
            Object[] objArr2 = {Integer.valueOf((int) j), cArr, Integer.valueOf(i2)};
            return ((Integer) onWarmupCompleted(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), -1336744677, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 1336744679, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), objArr2)).intValue();
        }
        long j2 = IAuthTabCallback;
        long j3 = j / j2;
        if (j3 < j2) {
            iOnNavigationEvent = IAuthTabCallback((int) j3, cArr, i2);
        } else {
            long j4 = j3 / j2;
            iOnNavigationEvent = onNavigationEvent((int) (j3 - (j4 * j2)), cArr, onExtraCallbackWithResult((int) j4, cArr, i2));
            int i10 = getInterfaceDescriptor + 101;
            access100 = i10 % 128;
            int i11 = i10 % 2;
        }
        return onNavigationEvent((int) (j - (j3 * j2)), cArr, iOnNavigationEvent);
    }

    public static int onExtraCallbackWithResult(long j, byte[] bArr, int i2) {
        int iIntValue;
        long j2 = j;
        int i3 = i2;
        int i4 = 2 % 2;
        if (j2 < 0) {
            int i5 = getInterfaceDescriptor + 77;
            int i6 = i5 % 128;
            access100 = i6;
            int i7 = i5 % 2;
            if (j2 > asInterface) {
                int i8 = i6 + 99;
                getInterfaceDescriptor = i8 % 128;
                int i9 = i8 % 2;
                return IAuthTabCallback((int) j2, bArr, i3);
            }
            if (j2 == Long.MIN_VALUE) {
                int i10 = i6 + 47;
                getInterfaceDescriptor = i10 % 128;
                if (i10 % 2 == 0) {
                    return onExtraCallbackWithResult(bArr, i2);
                }
                int i11 = 53 / 0;
                return onExtraCallbackWithResult(bArr, i2);
            }
            bArr[i3] = 45;
            j2 = -j2;
            i3++;
        } else if (j2 <= onExtraCallback) {
            return IAuthTabCallback((int) j2, bArr, i3);
        }
        long j3 = IAuthTabCallback;
        long j4 = j2 / j3;
        if (j4 < j3) {
            iIntValue = onExtraCallback((int) j4, bArr, i3);
        } else {
            long j5 = j4 / j3;
            Object[] objArr = {Integer.valueOf((int) (j4 - (j5 * j3))), bArr, Integer.valueOf(onExtraCallbackWithResult((int) j5, bArr, i3))};
            iIntValue = ((Integer) onWarmupCompleted(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), -640435805, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 640435808, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), objArr)).intValue();
        }
        Object[] objArr2 = {Integer.valueOf((int) (j2 - (j4 * j3))), bArr, Integer.valueOf(iIntValue)};
        return ((Integer) onWarmupCompleted(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), -640435805, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 640435808, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), objArr2)).intValue();
    }

    public static String onWarmupCompleted(double d, boolean z) {
        int i2 = 2 % 2;
        int i3 = getInterfaceDescriptor;
        int i4 = i3 + 15;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        if (!z) {
            String string = Double.toString(d);
            int i5 = access100 + 75;
            getInterfaceDescriptor = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 40 / 0;
            }
            return string;
        }
        int i7 = i3 + 57;
        access100 = i7 % 128;
        int i8 = i7 % 2;
        String strOnWarmupCompleted = setEnterTransition.onWarmupCompleted(d);
        int i9 = getInterfaceDescriptor + 43;
        access100 = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 88 / 0;
        }
        return strOnWarmupCompleted;
    }

    public static String onWarmupCompleted(float f, boolean z) {
        int i2 = 2 % 2;
        if (!(!z)) {
            int i3 = getInterfaceDescriptor + 85;
            access100 = i3 % 128;
            int i4 = i3 % 2;
            return setArguments.onNavigationEvent(f);
        }
        String string = Float.toString(f);
        int i5 = access100 + 87;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return string;
    }

    public static boolean onNavigationEvent(double d) {
        int i2 = 2 % 2;
        int i3 = getInterfaceDescriptor + 93;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        boolean zIsFinite = Double.isFinite(d);
        return i4 == 0 ? zIsFinite : !zIsFinite;
    }

    public static boolean onExtraCallback(float f) {
        int i2 = 2 % 2;
        int i3 = getInterfaceDescriptor + 43;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = !Float.isFinite(f);
        int i5 = access100 + 99;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static int IAuthTabCallback(int i2, char[] cArr, int i3) {
        int i4 = 2 % 2;
        if (i2 < onTransact) {
            int i5 = access100 + 83;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
            if (i2 >= 1000) {
                int iIAuthTabCallback = IAuthTabCallback(i2);
                return onExtraCallback(cArr, i3, iIAuthTabCallback, i2 - (iIAuthTabCallback * 1000));
            }
            int iOnExtraCallbackWithResult = onExtraCallbackWithResult(i2, cArr, i3);
            int i7 = getInterfaceDescriptor + 97;
            access100 = i7 % 128;
            if (i7 % 2 != 0) {
                return iOnExtraCallbackWithResult;
            }
            throw null;
        }
        int iIAuthTabCallback2 = IAuthTabCallback(i2);
        int iIAuthTabCallback3 = IAuthTabCallback(iIAuthTabCallback2);
        int iOnExtraCallbackWithResult2 = onExtraCallbackWithResult(iIAuthTabCallback3, cArr, i3);
        int[] iArr = IAuthTabCallbackStub;
        int i8 = iArr[iIAuthTabCallback2 - (iIAuthTabCallback3 * 1000)];
        cArr[iOnExtraCallbackWithResult2] = (char) (i8 >> 16);
        cArr[iOnExtraCallbackWithResult2 + 1] = (char) ((i8 >> 8) & 127);
        cArr[iOnExtraCallbackWithResult2 + 2] = (char) (i8 & 127);
        int i9 = iArr[i2 - (iIAuthTabCallback2 * 1000)];
        cArr[iOnExtraCallbackWithResult2 + 3] = (char) (i9 >> 16);
        cArr[iOnExtraCallbackWithResult2 + 4] = (char) ((i9 >> 8) & 127);
        cArr[iOnExtraCallbackWithResult2 + 5] = (char) (i9 & 127);
        int i10 = iOnExtraCallbackWithResult2 + 6;
        int i11 = access100 + 59;
        getInterfaceDescriptor = i11 % 128;
        int i12 = i11 % 2;
        return i10;
    }

    private static int onNavigationEvent(int i2, char[] cArr, int i3) {
        int i4 = 2 % 2;
        int i5 = getInterfaceDescriptor + 53;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        int iIAuthTabCallback = IAuthTabCallback(i2);
        int iIAuthTabCallback2 = IAuthTabCallback(iIAuthTabCallback);
        int[] iArr = IAuthTabCallbackStub;
        int i7 = iArr[iIAuthTabCallback2];
        cArr[i3] = (char) (i7 >> 16);
        cArr[i3 + 1] = (char) ((i7 >> 8) & 127);
        cArr[i3 + 2] = (char) (i7 & 127);
        int i8 = iArr[iIAuthTabCallback - (iIAuthTabCallback2 * 1000)];
        cArr[i3 + 3] = (char) (i8 >> 16);
        cArr[i3 + 4] = (char) ((i8 >> 8) & 127);
        cArr[i3 + 5] = (char) (i8 & 127);
        int i9 = iArr[i2 - (iIAuthTabCallback * 1000)];
        cArr[i3 + 6] = (char) (i9 >> 16);
        cArr[i3 + 7] = (char) ((i9 >> 8) & 127);
        cArr[i3 + 8] = (char) (i9 & 127);
        int i10 = i3 + 9;
        int i11 = access100 + 3;
        getInterfaceDescriptor = i11 % 128;
        if (i11 % 2 == 0) {
            return i10;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static int onExtraCallback(int i2, byte[] bArr, int i3) {
        int i4 = 2 % 2;
        int i5 = getInterfaceDescriptor + 85;
        int i6 = i5 % 128;
        access100 = i6;
        int i7 = i5 % 2;
        if (i2 < onTransact) {
            int i8 = i6 + 81;
            getInterfaceDescriptor = i8 % 128;
            int i9 = i8 % 2;
            if (i2 >= 1000) {
                int iIAuthTabCallback = IAuthTabCallback(i2);
                return onWarmupCompleted(bArr, i3, iIAuthTabCallback, i2 - (iIAuthTabCallback * 1000));
            }
            int i10 = i6 + 111;
            getInterfaceDescriptor = i10 % 128;
            if (i10 % 2 != 0) {
                onExtraCallbackWithResult(i2, bArr, i3);
                throw null;
            }
            int iOnExtraCallbackWithResult = onExtraCallbackWithResult(i2, bArr, i3);
            int i11 = access100 + 91;
            getInterfaceDescriptor = i11 % 128;
            int i12 = i11 % 2;
            return iOnExtraCallbackWithResult;
        }
        int iIAuthTabCallback2 = IAuthTabCallback(i2);
        int iIAuthTabCallback3 = IAuthTabCallback(iIAuthTabCallback2);
        int iOnExtraCallbackWithResult2 = onExtraCallbackWithResult(iIAuthTabCallback3, bArr, i3);
        int[] iArr = IAuthTabCallbackStub;
        int i13 = iArr[iIAuthTabCallback2 - (iIAuthTabCallback3 * 1000)];
        bArr[iOnExtraCallbackWithResult2] = (byte) (i13 >> 16);
        bArr[iOnExtraCallbackWithResult2 + 1] = (byte) (i13 >> 8);
        bArr[iOnExtraCallbackWithResult2 + 2] = (byte) i13;
        int i14 = iArr[i2 - (iIAuthTabCallback2 * 1000)];
        bArr[iOnExtraCallbackWithResult2 + 3] = (byte) (i14 >> 16);
        bArr[iOnExtraCallbackWithResult2 + 4] = (byte) (i14 >> 8);
        bArr[iOnExtraCallbackWithResult2 + 5] = (byte) i14;
        return iOnExtraCallbackWithResult2 + 6;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        byte[] bArr = (byte[]) objArr[1];
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int i2 = 2 % 2;
        int i3 = access100 + 77;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        int iIAuthTabCallback = IAuthTabCallback(iIntValue);
        int iIAuthTabCallback2 = IAuthTabCallback(iIAuthTabCallback);
        int[] iArr = IAuthTabCallbackStub;
        int i5 = iArr[iIAuthTabCallback2];
        bArr[iIntValue2] = (byte) (i5 >> 16);
        bArr[iIntValue2 + 1] = (byte) (i5 >> 8);
        bArr[iIntValue2 + 2] = (byte) i5;
        int i6 = iArr[iIAuthTabCallback - (iIAuthTabCallback2 * 1000)];
        bArr[iIntValue2 + 3] = (byte) (i6 >> 16);
        bArr[iIntValue2 + 4] = (byte) (i6 >> 8);
        bArr[iIntValue2 + 5] = (byte) i6;
        int i7 = iArr[iIntValue - (iIAuthTabCallback * 1000)];
        bArr[iIntValue2 + 6] = (byte) (i7 >> 16);
        bArr[iIntValue2 + 7] = (byte) (i7 >> 8);
        bArr[iIntValue2 + 8] = (byte) i7;
        int i8 = iIntValue2 + 9;
        int i9 = getInterfaceDescriptor + 103;
        access100 = i9 % 128;
        if (i9 % 2 != 0) {
            return Integer.valueOf(i8);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static int onExtraCallback(char[] cArr, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = getInterfaceDescriptor;
        int i7 = i6 + 39;
        access100 = i7 % 128;
        int i8 = i7 % 2;
        int[] iArr = IAuthTabCallbackStub;
        int i9 = iArr[i3];
        if (i3 > 9) {
            int i10 = i6 + 65;
            access100 = i10 % 128;
            if (i10 % 2 != 0 ? i3 > 99 : i3 > 22) {
                int i11 = i6 + 95;
                access100 = i11 % 128;
                if (i11 % 2 == 0) {
                    cArr[i2] = (char) (i9 >>> 126);
                    i2 >>= 1;
                } else {
                    cArr[i2] = (char) (i9 >> 16);
                    i2++;
                }
            }
            cArr[i2] = (char) ((i9 >> 8) & 127);
            i2++;
        }
        cArr[i2] = (char) (i9 & 127);
        int i12 = iArr[i4];
        cArr[i2 + 1] = (char) (i12 >> 16);
        cArr[i2 + 2] = (char) ((i12 >> 8) & 127);
        cArr[i2 + 3] = (char) (i12 & 127);
        return i2 + 4;
    }

    private static int onWarmupCompleted(byte[] bArr, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int[] iArr = IAuthTabCallbackStub;
        int i6 = iArr[i3];
        if (i3 > 9) {
            if (i3 > 99) {
                int i7 = access100 + 61;
                getInterfaceDescriptor = i7 % 128;
                int i8 = i7 % 2;
                bArr[i2] = (byte) (i6 >> 16);
                i2++;
            }
            bArr[i2] = (byte) (i6 >> 8);
            i2++;
            int i9 = getInterfaceDescriptor + 75;
            access100 = i9 % 128;
            int i10 = i9 % 2;
        }
        bArr[i2] = (byte) i6;
        int i11 = iArr[i4];
        bArr[i2 + 1] = (byte) (i11 >> 16);
        bArr[i2 + 2] = (byte) (i11 >> 8);
        bArr[i2 + 3] = (byte) i11;
        int i12 = i2 + 4;
        int i13 = access100 + 113;
        getInterfaceDescriptor = i13 % 128;
        int i14 = i13 % 2;
        return i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f A[PHI: r1
      0x001f: PHI (r1v6 int) = (r1v5 int), (r1v9 int) binds: [B:8:0x001d, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int onExtraCallbackWithResult(int i2, char[] cArr, int i3) {
        int i4;
        int i5 = 2 % 2;
        int i6 = getInterfaceDescriptor + 95;
        int i7 = i6 % 128;
        access100 = i7;
        if (i6 % 2 == 0) {
            i4 = IAuthTabCallbackStub[i2];
            if (i2 > 103) {
                int i8 = i7 + 55;
                getInterfaceDescriptor = i8 % 128;
                if (i8 % 2 == 0 ? i2 > 99 : i2 > 6) {
                    cArr[i3] = (char) (i4 >> 16);
                    i3++;
                }
                cArr[i3] = (char) ((i4 >> 8) & 127);
                i3++;
            }
        } else {
            i4 = IAuthTabCallbackStub[i2];
            if (i2 > 9) {
            }
        }
        cArr[i3] = (char) (i4 & 127);
        return i3 + 1;
    }

    private static int onExtraCallbackWithResult(int i2, byte[] bArr, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallbackStub[i2];
        if (i2 > 9) {
            int i6 = access100;
            int i7 = i6 + 109;
            getInterfaceDescriptor = i7 % 128;
            int i8 = i7 % 2;
            if (i2 > 99) {
                int i9 = i6 + 89;
                getInterfaceDescriptor = i9 % 128;
                int i10 = i9 % 2;
                bArr[i3] = (byte) (i5 >> 16);
                i3++;
            }
            bArr[i3] = (byte) (i5 >> 8);
            i3++;
        }
        bArr[i3] = (byte) i5;
        return i3 + 1;
    }

    private static int onWarmupCompleted(int i2, char[] cArr, int i3) {
        int i4 = 2 % 2;
        int i5 = getInterfaceDescriptor;
        int i6 = i5 + 99;
        access100 = i6 % 128;
        int i7 = i6 % 2;
        int i8 = IAuthTabCallbackStub[i2];
        cArr[i3] = (char) (i8 >> 16);
        cArr[i3 + 1] = (char) ((i8 >> 8) & 127);
        cArr[i3 + 2] = (char) (i8 & 127);
        int i9 = i3 + 3;
        int i10 = i5 + 73;
        access100 = i10 % 128;
        int i11 = i10 % 2;
        return i9;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        byte[] bArr = (byte[]) objArr[1];
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int i2 = 2 % 2;
        int i3 = getInterfaceDescriptor;
        int i4 = i3 + 53;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        int i6 = IAuthTabCallbackStub[iIntValue];
        bArr[iIntValue2] = (byte) (i6 >> 16);
        bArr[iIntValue2 + 1] = (byte) (i6 >> 8);
        bArr[iIntValue2 + 2] = (byte) i6;
        int i7 = iIntValue2 + 3;
        int i8 = i3 + 45;
        access100 = i8 % 128;
        if (i8 % 2 != 0) {
            return Integer.valueOf(i7);
        }
        int i9 = 88 / 0;
        return Integer.valueOf(i7);
    }

    private static int IAuthTabCallback(char[] cArr, int i2) {
        int i3 = 2 % 2;
        int i4 = getInterfaceDescriptor + 91;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        String str = onNavigationEvent;
        int length = str.length();
        str.getChars(0, length, cArr, i2);
        int i6 = i2 + length;
        int i7 = getInterfaceDescriptor + 57;
        access100 = i7 % 128;
        if (i7 % 2 != 0) {
            return i6;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static int onExtraCallbackWithResult(byte[] bArr, int i2) {
        int i3 = 2 % 2;
        int i4 = access100 + 111;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        int length = onNavigationEvent.length();
        int i6 = 0;
        while (i6 < length) {
            bArr[i2] = (byte) onNavigationEvent.charAt(i6);
            i6++;
            i2++;
        }
        int i7 = access100 + 81;
        getInterfaceDescriptor = i7 % 128;
        int i8 = i7 % 2;
        return i2;
    }

    private static int onExtraCallbackWithResult(char[] cArr, int i2) {
        int i3 = 2 % 2;
        int i4 = getInterfaceDescriptor + 59;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        String str = onWarmupCompleted;
        int length = str.length();
        str.getChars(0, length, cArr, i2);
        int i6 = i2 + length;
        int i7 = access100 + 59;
        getInterfaceDescriptor = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int length;
        int i2 = 0;
        byte[] bArr = (byte[]) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i3 = 2 % 2;
        int i4 = access100 + 109;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            length = onWarmupCompleted.length();
            i2 = 1;
        } else {
            length = onWarmupCompleted.length();
        }
        while (i2 < length) {
            bArr[iIntValue] = (byte) onWarmupCompleted.charAt(i2);
            i2++;
            iIntValue++;
            int i5 = getInterfaceDescriptor + 65;
            access100 = i5 % 128;
            int i6 = i5 % 2;
        }
        return Integer.valueOf(iIntValue);
    }

    private static int onNavigationEvent(int i2, byte[] bArr, int i3) {
        Object[] objArr = {Integer.valueOf(i2), bArr, Integer.valueOf(i3)};
        int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        return ((Integer) onWarmupCompleted(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), -565810453, iOnNavigationEvent, 565810454, iOnNavigationEvent2, objArr)).intValue();
    }

    private static int onWarmupCompleted(int i2, byte[] bArr, int i3) {
        Object[] objArr = {Integer.valueOf(i2), bArr, Integer.valueOf(i3)};
        int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        return ((Integer) onWarmupCompleted(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), -640435805, iOnNavigationEvent, 640435808, iOnNavigationEvent2, objArr)).intValue();
    }

    private static int IAuthTabCallback(byte[] bArr, int i2) {
        Object[] objArr = {bArr, Integer.valueOf(i2)};
        int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        return ((Integer) onWarmupCompleted(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), -1608473608, iOnNavigationEvent, 1608473608, iOnNavigationEvent2, objArr)).intValue();
    }

    public static int onExtraCallback(int i2, char[] cArr, int i3) {
        Object[] objArr = {Integer.valueOf(i2), cArr, Integer.valueOf(i3)};
        int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        return ((Integer) onWarmupCompleted(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), -1336744677, iOnNavigationEvent, 1336744679, iOnNavigationEvent2, objArr)).intValue();
    }

    static void IAuthTabCallback() {
        IAuthTabCallbackStubProxy = 478308998;
    }
}
