package o;

import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.util.Random;

/* loaded from: classes.dex */
public class DataSourceBitmapLoaderExternalSyntheticLambda1 {
    private static final byte[] $$a;
    public static long IAuthTabCallback;
    private static long IAuthTabCallbackDefault;
    private static final long[] IAuthTabCallbackStub;
    private static onNavigationEvent onExtraCallback;
    public static Object[] onExtraCallbackWithResult;
    private static onWarmupCompleted onNavigationEvent;
    private static int onTransact;
    public static long onWarmupCompleted;
    private static final int $$b = 123;
    private static int access000 = 0;
    private static int getInterfaceDescriptor = 1;
    private static int IAuthTabCallbackStubProxy = 1;
    private static int asInterface = 0;
    private static int asBinder = 1;

    public interface onNavigationEvent {
        void onNavigationEvent();
    }

    public interface onWarmupCompleted {
        void IAuthTabCallback(int i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r8v2, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 31
            int r0 = r6 + 16
            byte[] r1 = o.DataSourceBitmapLoaderExternalSyntheticLambda1.$$a
            int r7 = r7 * 46
            int r7 = 50 - r7
            int r8 = r8 * 38
            int r8 = 111 - r8
            byte[] r0 = new byte[r0]
            int r6 = r6 + 15
            r2 = 0
            if (r1 != 0) goto L19
            r4 = r8
            r3 = r2
            r8 = r7
            goto L2e
        L19:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L1d:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L2a:
            int r3 = r3 + 1
            r4 = r1[r8]
        L2e:
            int r7 = r7 + r4
            int r7 = r7 + (-6)
            int r8 = r8 + 1
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DataSourceBitmapLoaderExternalSyntheticLambda1.a(byte, short, short, java.lang.Object[]):void");
    }

    private static native long read(Method method, int i, int i2, String[][] strArr);

    static {
        byte[] bArr = {75, -35, 114, 51, -59, 40, 34, -5, 8, 8, 9, 13, 3, -2, 7, 19, -40, 35, 25, -13, -8, 34, 12, 3, -9, 8, -26, 57, 2, -9, 19, 2, -7, 17, -19, 44, -5, 12, -6, 3, 21, -5, 0, -17, 27, 18, -5, 8, 3, -43, -2, 58, 5, -6, -14, 19, 7, -25, 36, 17, 6, -4, 5, 8, 14};
        $$a = bArr;
        onTransact = 0;
        onWarmupCompleted();
        onWarmupCompleted = -1L;
        IAuthTabCallback = 0L;
        onExtraCallbackWithResult = null;
        IAuthTabCallbackStub = new long[]{1250572000330386032L, 7614687793866738288L};
        byte b = (byte) (123 & 5);
        try {
            Object[] objArr = new Object[1];
            a(b, b, bArr[42], objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            byte b2 = bArr[42];
            byte b3 = b2;
            Object[] objArr2 = new Object[1];
            a(b2, b3, (byte) (b3 + 1), objArr2);
            cls.getMethod((String) objArr2[0], null).invoke(null, null);
            int i = IAuthTabCallbackStubProxy + 37;
            onTransact = i % 128;
            if (i % 2 != 0) {
                throw new NullPointerException();
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static void IAuthTabCallback(String str, int i, Object[] objArr) {
        int i2 = 2 % 2;
        int i3 = access000 + 29;
        int i4 = i3 % 128;
        getInterfaceDescriptor = i4;
        int i5 = i3 % 2;
        char[] charArray = str;
        if (str != null) {
            int i6 = i4 + 35;
            access000 = i6 % 128;
            if (i6 % 2 != 0) {
                throw new ArithmeticException();
            }
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        UtilExternalSyntheticLambda4 utilExternalSyntheticLambda4 = new UtilExternalSyntheticLambda4();
        utilExternalSyntheticLambda4.onExtraCallbackWithResult = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        utilExternalSyntheticLambda4.IAuthTabCallback = 0;
        while (utilExternalSyntheticLambda4.IAuthTabCallback < cArr.length) {
            int i7 = access000 + 45;
            getInterfaceDescriptor = i7 % 128;
            int i8 = i7 % 2;
            jArr[utilExternalSyntheticLambda4.IAuthTabCallback] = (cArr[utilExternalSyntheticLambda4.IAuthTabCallback] ^ (utilExternalSyntheticLambda4.IAuthTabCallback * utilExternalSyntheticLambda4.onExtraCallbackWithResult)) ^ (IAuthTabCallbackDefault - (-916733648318839497L));
            utilExternalSyntheticLambda4.IAuthTabCallback++;
        }
        char[] cArr2 = new char[length];
        utilExternalSyntheticLambda4.IAuthTabCallback = 0;
        while (utilExternalSyntheticLambda4.IAuthTabCallback < cArr.length) {
            cArr2[utilExternalSyntheticLambda4.IAuthTabCallback] = (char) jArr[utilExternalSyntheticLambda4.IAuthTabCallback];
            utilExternalSyntheticLambda4.IAuthTabCallback++;
        }
        objArr[0] = new String(cArr2);
    }

    static synchronized void onExtraCallback(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface;
        int i4 = i3 + 29;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            throw new NullPointerException();
        }
        onNavigationEvent onnavigationevent = onExtraCallback;
        if (onnavigationevent != null) {
            onnavigationevent.onNavigationEvent();
            return;
        }
        onWarmupCompleted onwarmupcompleted = onNavigationEvent;
        if (onwarmupcompleted != null) {
            int i5 = i3 + 107;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            onwarmupcompleted.IAuthTabCallback(i);
        }
    }

    public static synchronized Object[] onExtraCallback(onNavigationEvent onnavigationevent, onWarmupCompleted onwarmupcompleted, int i, int i2) {
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = asBinder + 29;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        onExtraCallback = onnavigationevent;
        onNavigationEvent = onwarmupcompleted;
        if (onNavigationEvent()) {
            Object[] objArr = {new String[0], new int[]{0}, new int[]{0}, new int[]{i ^ (i << 5)}};
            int i8 = i + (((((~((-244250512) | r0)) | (~((-978424319) | i))) | (~(r0 | 978424318))) * 959) - 792769958) + (((~((~i) | (-978424319))) | (~((-244250512) | i)) | (~(i | 978424318))) * 959);
            int i9 = i8 ^ (i8 << 13);
            int i10 = i9 ^ (i9 >>> 17);
            return objArr;
        }
        int i11 = 2 % 2;
        int i12 = ExoPlayerBuilderExternalSyntheticLambda1.onNavigationEvent + 111;
        ExoPlayerBuilderExternalSyntheticLambda1.onWarmupCompleted = i12 % 128;
        int i13 = i12 % 2;
        long j = ExoPlayerBuilderExternalSyntheticLambda1.read();
        long j2 = 332197738;
        long j3 = -743;
        long j4 = j2 | j;
        long j5 = -1;
        long j6 = i;
        long j7 = (j3 * j2) + (j3 * j) + ((-744) * ((j4 ^ j5) | ((j2 | j6) ^ j5) | ((j | j6) ^ j5)));
        long j8 = 744;
        long j9 = (-1103027100) + j7 + (((j6 ^ j5) | (((j ^ j5) | (j2 ^ j5)) ^ j5)) * j8) + (j8 * (j4 | j6));
        int i14 = ~((-1969723645) | i);
        int i15 = ~i;
        int i16 = ((int) (j9 >> 32)) & ((-568346274) + ((i14 | (~((-177750786) | i15))) * (-406)) + ((~((-354746449) | i15)) * (-406)) + (((~(532497233 | i)) | (~(1969723644 | i15))) * 406));
        int i17 = (int) Runtime.getRuntime().totalMemory();
        int i18 = ~i17;
        int i19 = (((int) j9) & ((-1041648838) + (((~(1434440601 | i17)) | (~(i18 | (-1161544466))) | 2785808) * 717) + (((~(i17 | (-1161544466))) | (~(1434440601 | i18)) | 2785808) * 717))) | i16;
        int i20 = ExoPlayerBuilderExternalSyntheticLambda1.onNavigationEvent;
        int i21 = ((i20 | 51) << 1) - (i20 ^ 51);
        ExoPlayerBuilderExternalSyntheticLambda1.onWarmupCompleted = i21 % 128;
        if (i21 % 2 != 0) {
            throw new NullPointerException();
        }
        if (i19 == 1) {
            Object[] objArr2 = {new String[0], new int[]{16}, new int[]{0}, new int[]{i ^ (i << 5)}};
            int i22 = i + (-1308326031) + ((i | 17416) * 988) + (((~(153380394 | i15)) | 915931457) * (-1976)) + (((~((-1069294436) | i)) | 17416 | (~(1069294435 | i15))) * 988) + 16;
            int i23 = i22 ^ (i22 << 13);
            int i24 = i23 ^ (i23 >>> 17);
            return objArr2;
        }
        if (i19 > 1) {
            Object[] objArr3 = {new String[0], new int[]{0}, new int[]{0}, new int[1]};
            int iMyPid = Process.myPid();
            int i25 = ~((-243844195) | iMyPid);
            int i26 = ~iMyPid;
            int i27 = i25 | (~(978830635 | i26));
            int i28 = ~(243844194 | i26);
            int i29 = i + (-73206679) + ((i27 | i28) * (-516)) + (((~(iMyPid | (-167822371))) | (~((-811008266) | i26))) * 516) + ((811008265 | i28) * 516);
            int i30 = i29 ^ (i29 << 13);
            int i31 = i30 ^ (i30 >>> 17);
            ((int[]) objArr3[3])[0] = i31 ^ (i31 << 5);
            return objArr3;
        }
        try {
            Method declaredMethod = Class.forName("o.DataSourceBitmapLoaderExternalSyntheticLambda1").getDeclaredMethod("onExtraCallback", Integer.TYPE);
            declaredMethod.setAccessible(true);
            String[][] strArr = new String[1][];
            int i32 = 2 % 2;
            int i33 = asInterface + 17;
            asBinder = i33 % 128;
            try {
                if (i33 % 2 == 0) {
                    read(declaredMethod, i, i2, strArr);
                    throw new NullPointerException();
                }
                long j10 = read(declaredMethod, i, i2, strArr);
                long j11 = 1854005970;
                long j12 = -575;
                long j13 = (j12 * j11) + (j12 * j10);
                long j14 = 576;
                long j15 = j11 ^ j5;
                long j16 = j10 ^ j5;
                long j17 = (j15 | j16) ^ j5;
                long startUptimeMillis = (int) Process.getStartUptimeMillis();
                long j18 = j13 + ((j17 | ((j16 | startUptimeMillis) ^ j5)) * j14) + (((j5 ^ ((j16 | (startUptimeMillis ^ j5)) | j11)) | ((j15 | j10) ^ j5)) * j14) + (j14 * j17) + 119008646;
                int i34 = (int) (j18 >> 32);
                int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                int i35 = i34 & (1520786966 + (((~((~startElapsedRealtime) | (-2136647788))) | 710541417) * 529) + (((~(startElapsedRealtime | (-2136647788))) | 721093097) * 529));
                int i36 = (int) j18;
                int iMyUid = Process.myUid();
                int i37 = ~(766137765 | iMyUid);
                int i38 = ~iMyUid;
                int i39 = i35 | (i36 & ((-2038855459) + ((i37 | (~(i38 | (-27923457)))) * 920) + (((~(699012100 | i38)) | (-766137766)) * 920) + (((~(iMyUid | (-27923457))) | (~(766137765 | i38)) | (~((-67125666) | iMyUid))) * 920)));
                if (i39 >= 15) {
                    Object[] objArr4 = {new String[0], new int[]{0}, new int[]{0}, new int[1]};
                    int iNextInt = new Random().nextInt(567590736);
                    int i40 = ~iNextInt;
                    int i41 = i + (((~((-1218208901) | i40)) | (~(1222541197 | iNextInt))) * 988) + 1075989541 + (((~(iNextInt | (-1218342533))) | 133632 | (~(i40 | 1222541197))) * 988);
                    int i42 = i41 ^ (i41 << 13);
                    int i43 = i42 ^ (i42 >>> 17);
                    ((int[]) objArr4[3])[0] = i43 ^ (i43 << 5);
                    return objArr4;
                }
                int i44 = asInterface;
                int i45 = i44 + 123;
                asBinder = i45 % 128;
                if (i45 % 2 == 0) {
                    if (i39 != 0) {
                        int i46 = 2 % 2;
                        i4 = 16;
                    }
                    int i47 = i44 + 65;
                    asBinder = i47 % 128;
                    int i48 = i47 % 2;
                    int i49 = 2 % 2;
                    i4 = 0;
                } else if (i39 == 0) {
                    int i472 = i44 + 65;
                    asBinder = i472 % 128;
                    int i482 = i472 % 2;
                    int i492 = 2 % 2;
                    i4 = 0;
                } else {
                    int i462 = 2 % 2;
                    i4 = 16;
                }
                int i50 = 0;
                try {
                    String[] strArr2 = strArr[0];
                    Object[] objArr5 = new Object[4];
                    int[] iArr = new int[1];
                    objArr5[1] = iArr;
                    int[] iArr2 = new int[1];
                    objArr5[2] = iArr2;
                    objArr5[3] = new int[1];
                    i50 = 0;
                    iArr2[0] = 0;
                    iArr[0] = i39;
                    objArr5[0] = strArr2;
                    int iUptimeMillis = (int) SystemClock.uptimeMillis();
                    int i51 = ~iUptimeMillis;
                    int i52 = i + (-927220496) + (((~((-392965951) | i51)) | 101197104) * 98) + (((~(i51 | (-829708880))) | (-392965951) | (~(829708879 | iUptimeMillis))) * (-49)) + (((~(iUptimeMillis | (-392965951))) | (-930905984)) * 49) + i4;
                    int i53 = i52 ^ (i52 << 13);
                    int i54 = i53 ^ (i53 >>> 17);
                    i3 = 0;
                    try {
                        ((int[]) objArr5[3])[0] = i54 ^ (i54 << 5);
                        return objArr5;
                    } catch (Exception unused) {
                        Object[] objArr6 = {new String[i3], new int[]{10}, new int[]{0}, new int[1]};
                        int i55 = ~(((int) Process.getStartUptimeMillis()) | 566608137);
                        int i56 = i + ((115280269 | i55) * (-658)) + 1128084143 + ((i55 | 102369412) * 658) + 16;
                        int i57 = i56 ^ (i56 << 13);
                        int i58 = i57 ^ (i57 >>> 17);
                        ((int[]) objArr6[3])[0] = i58 ^ (i58 << 5);
                        return objArr6;
                    }
                } catch (Exception unused2) {
                    i3 = i50;
                }
            } catch (Exception unused3) {
                i3 = 0;
            }
        } catch (Exception unused4) {
            i3 = 0;
        }
    }

    private static boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asBinder + 113;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        IAuthTabCallback("䳽鮝\ue2de준၍磆䟛긎\uf546\udd83⒋猆婒ꊕ角큌㽁ވ滎딍鱛\ue497㏌", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 55103, objArr);
        String str = (String) objArr[0];
        long[] jArr = IAuthTabCallbackStub;
        int i4 = ResolvingDataSourceFactory.onExtraCallback;
        int i5 = ((i4 | 61) << 1) - (i4 ^ 61);
        ResolvingDataSourceFactory.onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            ResolvingDataSourceFactory.read(str, 5, Long.MAX_VALUE, jArr);
            Process.getStartElapsedRealtime();
            throw new NullPointerException();
        }
        long j = ResolvingDataSourceFactory.read(str, 5, Long.MAX_VALUE, jArr);
        long j2 = -447419027;
        long j3 = -1;
        long j4 = j2 ^ j3;
        long jMyTid = Process.myTid();
        long j5 = (567 * j2) + ((-565) * j) + ((-566) * (((j4 | j) ^ j3) | ((j4 | jMyTid) ^ j3)));
        long j6 = 566;
        long j7 = j ^ j3;
        long j8 = ((j5 + (((j2 | j7) ^ j3) * j6)) + (j6 * ((jMyTid | (j7 | j4)) ^ j3))) - 1475156572;
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        if (((((int) (j8 >> 32)) & ((((-1320242614) + (((~((-1884567115) | elapsedCpuTime)) | 1616123456) * 1504)) + ((~(elapsedCpuTime | (-268443659))) * (-1504))) - 1235686560)) | (((int) j8) & ((((~((-1342181393) | r3)) * 521) - 1871961000) + (((~((~Process.myUid()) | (-1342181393))) | 2376005) * 521)))) <= 0) {
            return false;
        }
        int i6 = asBinder + 125;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    static void onWarmupCompleted() {
        IAuthTabCallbackDefault = 7283502742133871113L;
    }
}
