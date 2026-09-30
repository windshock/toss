package o;

import android.R;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Random;

/* loaded from: classes.dex */
public class AudioFocusManagerExternalSyntheticLambda0 {
    private static char[] IAuthTabCallback = null;
    private static char IAuthTabCallbackDefault = 0;
    private static char[] IAuthTabCallbackStub = null;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int IAuthTabCallback_Parcel = 1;
    private static int access000 = 1;
    private static int asBinder = 1;
    private static int asInterface;
    private static char[] onExtraCallback;
    public static long onExtraCallbackWithResult;
    public static Object[] onNavigationEvent;
    private static int onTransact;
    public static long onWarmupCompleted;

    static {
        IAuthTabCallback();
        onExtraCallback();
        AndroidCharacter.getMirror('0');
        ExpandableListView.getPackedPositionType(0L);
        ViewConfiguration.getTouchSlop();
        TypedValue.complexToFloat(0);
        PointF.length(0.0f, 0.0f);
        KeyEvent.getDeadChar(0, 0);
        ViewConfiguration.getMinimumFlingVelocity();
        View.combineMeasuredStates(0, 0);
        onExtraCallbackWithResult = -1L;
        onWarmupCompleted = 0L;
        onNavigationEvent = null;
        int i = access000 + 43;
        onTransact = i % 128;
        if (i % 2 != 0) {
            throw new NullPointerException();
        }
    }

    private static void onExtraCallbackWithResult(int[] iArr, boolean z, String str, Object[] objArr) throws UnsupportedEncodingException {
        String str2 = str;
        byte[] bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = bytes;
        UtilExternalSyntheticLambda0 utilExternalSyntheticLambda0 = new UtilExternalSyntheticLambda0();
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        char[] cArr = IAuthTabCallbackStub;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i5 = 0; i5 < length; i5++) {
                cArr2[i5] = (char) (cArr[i5] - 4301814714517170301L);
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i2];
        System.arraycopy(cArr, i, cArr3, 0, i2);
        if (bArr != null) {
            char[] cArr4 = new char[i2];
            utilExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (utilExternalSyntheticLambda0.onNavigationEvent < i2) {
                if (bArr[utilExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    cArr4[utilExternalSyntheticLambda0.onNavigationEvent] = (char) (((cArr3[utilExternalSyntheticLambda0.onNavigationEvent] << 1) + 1) - c);
                } else {
                    cArr4[utilExternalSyntheticLambda0.onNavigationEvent] = (char) ((cArr3[utilExternalSyntheticLambda0.onNavigationEvent] << 1) - c);
                }
                c = cArr4[utilExternalSyntheticLambda0.onNavigationEvent];
                utilExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr4;
        }
        if (i4 > 0) {
            char[] cArr5 = new char[i2];
            System.arraycopy(cArr3, 0, cArr5, 0, i2);
            int i6 = i2 - i4;
            System.arraycopy(cArr5, 0, cArr3, i6, i4);
            System.arraycopy(cArr5, i4, cArr3, 0, i6);
        }
        if (z) {
            char[] cArr6 = new char[i2];
            utilExternalSyntheticLambda0.onNavigationEvent = 0;
            while (utilExternalSyntheticLambda0.onNavigationEvent < i2) {
                cArr6[utilExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i2 - utilExternalSyntheticLambda0.onNavigationEvent) - 1];
                utilExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i3 > 0) {
            utilExternalSyntheticLambda0.onNavigationEvent = 0;
            while (utilExternalSyntheticLambda0.onNavigationEvent < i2) {
                cArr3[utilExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[utilExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                utilExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    private static void onExtraCallbackWithResult(int[] iArr, String str, boolean z, Object[] objArr) throws UnsupportedEncodingException {
        int i;
        char[] cArr;
        String str2 = str;
        int i2 = 2 % 2;
        byte[] bArr = str2;
        if (str2 != null) {
            byte[] bytes = str2.getBytes("ISO-8859-1");
            int i3 = IAuthTabCallbackStubProxy + 3;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
            bArr = bytes;
        }
        byte[] bArr2 = bArr;
        UtilExternalSyntheticLambda0 utilExternalSyntheticLambda0 = new UtilExternalSyntheticLambda0();
        int i5 = iArr[0];
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        char[] cArr2 = onExtraCallback;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i9 = 0; i9 < length; i9++) {
                cArr3[i9] = (char) (cArr2[i9] - 4301814714517170301L);
            }
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i6];
        System.arraycopy(cArr2, i5, cArr4, 0, i6);
        if (bArr2 != null) {
            int i10 = IAuthTabCallback_Parcel + 19;
            IAuthTabCallbackStubProxy = i10 % 128;
            if (i10 % 2 != 0) {
                cArr = new char[i6];
                utilExternalSyntheticLambda0.onNavigationEvent = 1;
            } else {
                cArr = new char[i6];
                utilExternalSyntheticLambda0.onNavigationEvent = 0;
            }
            char c = 0;
            while (utilExternalSyntheticLambda0.onNavigationEvent < i6) {
                if (bArr2[utilExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    cArr[utilExternalSyntheticLambda0.onNavigationEvent] = (char) (((cArr4[utilExternalSyntheticLambda0.onNavigationEvent] << 1) + 1) - c);
                } else {
                    cArr[utilExternalSyntheticLambda0.onNavigationEvent] = (char) ((cArr4[utilExternalSyntheticLambda0.onNavigationEvent] << 1) - c);
                }
                c = cArr[utilExternalSyntheticLambda0.onNavigationEvent];
                utilExternalSyntheticLambda0.onNavigationEvent++;
            }
            int i11 = IAuthTabCallbackStubProxy + 55;
            IAuthTabCallback_Parcel = i11 % 128;
            int i12 = i11 % 2;
            cArr4 = cArr;
        }
        if (i8 > 0) {
            int i13 = IAuthTabCallback_Parcel + 53;
            IAuthTabCallbackStubProxy = i13 % 128;
            if (i13 % 2 != 0) {
                char[] cArr5 = new char[i6];
                System.arraycopy(cArr4, 0, cArr5, 1, i6);
                System.arraycopy(cArr5, 0, cArr4, i6 * i8, i8);
                System.arraycopy(cArr5, i8, cArr4, 1, i6 % i8);
            } else {
                char[] cArr6 = new char[i6];
                System.arraycopy(cArr4, 0, cArr6, 0, i6);
                int i14 = i6 - i8;
                System.arraycopy(cArr6, 0, cArr4, i14, i8);
                System.arraycopy(cArr6, i8, cArr4, 0, i14);
            }
        }
        if (z) {
            char[] cArr7 = new char[i6];
            utilExternalSyntheticLambda0.onNavigationEvent = 0;
            while (utilExternalSyntheticLambda0.onNavigationEvent < i6) {
                int i15 = IAuthTabCallback_Parcel + 111;
                IAuthTabCallbackStubProxy = i15 % 128;
                if (i15 % 2 != 0) {
                    cArr7[utilExternalSyntheticLambda0.onNavigationEvent] = cArr4[utilExternalSyntheticLambda0.onNavigationEvent + i6 + 1];
                    i = utilExternalSyntheticLambda0.onNavigationEvent;
                } else {
                    cArr7[utilExternalSyntheticLambda0.onNavigationEvent] = cArr4[(i6 - utilExternalSyntheticLambda0.onNavigationEvent) - 1];
                    i = utilExternalSyntheticLambda0.onNavigationEvent + 1;
                }
                utilExternalSyntheticLambda0.onNavigationEvent = i;
            }
            cArr4 = cArr7;
        }
        if (i7 > 0) {
            utilExternalSyntheticLambda0.onNavigationEvent = 0;
            while (utilExternalSyntheticLambda0.onNavigationEvent < i6) {
                cArr4[utilExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr4[utilExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                utilExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    public static Object[] IAuthTabCallback(Context context, int i, int i2, int i3) throws Throwable {
        int iIAuthTabCallback;
        String[] strArr;
        int i4 = 2 % 2;
        int i5 = asBinder + 125;
        int i6 = i5 % 128;
        asInterface = i6;
        int i7 = i5 % 2;
        if (context == null) {
            strArr = null;
            iIAuthTabCallback = i;
        } else {
            int i8 = i6 + 79;
            asBinder = i8 % 128;
            int i9 = i8 % 2;
            Object[] objArrOnExtraCallback = onExtraCallback(context, i);
            iIAuthTabCallback = ((int[]) objArrOnExtraCallback[0])[0];
            strArr = (String[]) objArrOnExtraCallback[1];
            if ((i2 & 1) == 0) {
                int i10 = i ^ iIAuthTabCallback;
                int i11 = (i10 | (-i10)) >> 31;
                iIAuthTabCallback = (iIAuthTabCallback & i11) | (IAuthTabCallback(context, i) & (~i11));
                int i12 = asInterface + 33;
                asBinder = i12 % 128;
                int i13 = i12 % 2;
            }
        }
        Object[] objArr = new Object[1];
        onExtraCallbackWithResult(new int[]{0, 12, 0, 10}, "\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001", true, objArr);
        String strIntern = ((String) objArr[0]).intern();
        int i14 = onAudioFocusChange.onExtraCallback + 121;
        onAudioFocusChange.onNavigationEvent = i14 % 128;
        int i15 = i14 % 2;
        long jR = onAudioFocusChange.R(strIntern);
        long j = -1686186276;
        long j2 = -1;
        long j3 = jR ^ j2;
        String[] strArr2 = strArr;
        long j4 = i;
        long j5 = j4 ^ j2;
        long j6 = (j5 | jR) ^ j2;
        long j7 = ((-515) * j) + (517 * jR) + ((-516) * (((j3 | j4) ^ j2) | ((j5 | j) ^ j2) | j6));
        long j8 = 516;
        long j9 = j ^ j2;
        long j10 = j7 + (((((j9 | j3) | j4) ^ j2) | (((j9 | j5) | jR) ^ j2)) * j8) + (j8 * (((jR | j9) ^ j2) | j6)) + 2001763084;
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int i16 = ~elapsedCpuTime;
        int i17 = ((((~(i16 | 1593917488)) | (~((-1593917489) | elapsedCpuTime)) | (~(156691077 | i16))) * 959) + 669689241 + (((~((-1593917489) | i16)) | (~(156691077 | elapsedCpuTime)) | (~(elapsedCpuTime | 1593917488))) * 959)) & ((int) (j10 >> 32));
        int i18 = (int) Runtime.getRuntime().totalMemory();
        int i19 = ~i18;
        int i20 = i17 | (((int) j10) & (597209270 + (((~(980597076 | i19)) | 456629333) * (-865)) + ((~(i18 | (-980597077))) * 865) + (((~(456629333 | i19)) | (~(i19 | (-980597077)))) * 865)));
        int i21 = onAudioFocusChange.onExtraCallback + 39;
        onAudioFocusChange.onNavigationEvent = i21 % 128;
        if (i21 % 2 == 0) {
            throw new ArithmeticException();
        }
        int i22 = (i20 | (-i20)) >> 31;
        int i23 = i ^ iIAuthTabCallback;
        int i24 = (i23 | (-i23)) >> 31;
        int i25 = (((i22 & (i ^ 50)) | ((~i22) & i)) & (~i24)) | (iIAuthTabCallback & i24);
        Object[] objArr2 = new Object[1];
        onWarmupCompleted("\n# #\f\u0003\u0005\b\u001c\u0002\u000e\r\f\u0005\u0016\u001e\u0005\u0000\u0018\u0005", (byte) (119 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 20 - (Process.myPid() >> 22), objArr2);
        String strIntern2 = ((String) objArr2[0]).intern();
        int i26 = onAudioFocusChange.onExtraCallback + 121;
        onAudioFocusChange.onNavigationEvent = i26 % 128;
        int i27 = i26 % 2;
        long jR2 = onAudioFocusChange.R(strIntern2);
        long j11 = -913691067;
        long j12 = 530;
        long j13 = 1058 + (j12 * j11) + (j12 * jR2);
        long j14 = 529;
        long jMyUid = Process.myUid();
        long j15 = j13 + (((((jMyUid ^ j2) | j11) ^ j2) | ((j11 | jR2) ^ j2)) * j14) + (j14 * ((jR2 ^ j2) | ((j11 | jMyUid) ^ j2))) + 1229267875;
        int i28 = ~i;
        int iMyUid = Process.myUid();
        int i29 = ~iMyUid;
        int i30 = (((int) (j15 >> 32)) & (1079365226 + ((~(1911553107 | i28)) * (-560)) + ((~(2112880379 | i)) * (-560)) + (((~((-474326697) | i28)) | 272999424) * 560))) | (((int) j15) & ((-531075893) + (((~(148857895 | i29)) | (~(1288368514 | iMyUid))) * 210) + (((~(iMyUid | (-1140887937))) | (~(i29 | (-1377318)))) * 210)));
        int i31 = onAudioFocusChange.onExtraCallback + 39;
        onAudioFocusChange.onNavigationEvent = i31 % 128;
        if (i31 % 2 == 0) {
            throw new ArithmeticException();
        }
        int i32 = (i30 | (-i30)) >> 31;
        int i33 = i ^ i25;
        int i34 = (i33 | (-i33)) >> 31;
        int i35 = (((i32 & (i ^ 60)) | ((~i32) & i)) & (~i34)) | (i25 & i34);
        Object[] objArr3 = new Object[1];
        onWarmupCompleted("\u0011\u001d\u0003\u0011\u000b\u0011\u001d\u000b\u0011\u0003\u0011#\u000e\u0000\u0006 \u001e\u0012\u000b\t\u000b\u0017\u0015#\u000e\u0012\u001d\u0011\u001b\u0014\u001e\u0016\u001d\u000b\u0011\u0003", (byte) ((ViewConfiguration.getScrollBarSize() >> 8) + 63), ImageFormat.getBitsPerPixel(0) + 37, objArr3);
        String strIntern3 = ((String) objArr3[0]).intern();
        int i36 = onAudioFocusChange.onNavigationEvent;
        int i37 = (i36 ^ 15) + ((i36 & 15) << 1);
        onAudioFocusChange.onExtraCallback = i37 % 128;
        if (i37 % 2 != 0) {
            onAudioFocusChange.run(strIntern3);
            Runtime.getRuntime().totalMemory();
            throw new ArithmeticException();
        }
        long jRun = onAudioFocusChange.run(strIntern3);
        long j16 = 88186501;
        long j17 = -375;
        long j18 = (j17 * j16) + (j17 * jRun);
        long j19 = 376;
        long j20 = j16 ^ j2;
        long j21 = (j16 | jRun) ^ j2;
        long j22 = j18 + ((j4 | ((j20 | (jRun ^ j2)) ^ j2) | j21) * j19) + ((-376) * (((j5 | j16) ^ j2) | j21)) + (j19 * (jRun | ((j20 | j4) ^ j2))) + 299059963;
        int i38 = ((int) (j22 >> 32)) & (((((~((-269746433) | i)) | (-2122235884)) * 449) - 617492862) + (((~((-269746433) | i28)) | (-2122235884)) * 449));
        int iNextInt = new Random().nextInt(442189728);
        int i39 = ~((-174474017) | iNextInt);
        int i40 = ~iNextInt;
        int i41 = (((int) j22) & (713968752 + ((i39 | (~(i40 | 1803017214))) * 497) + (((~(iNextInt | 1803017214)) | (~((-191316789) | i40)) | R.attr.finishOnTaskLaunch) * 497))) | i38;
        int i42 = onAudioFocusChange.onExtraCallback;
        int i43 = (i42 ^ 63) + ((i42 & 63) << 1);
        onAudioFocusChange.onNavigationEvent = i43 % 128;
        int i44 = i43 % 2;
        int i45 = (i41 | (-i41)) >> 31;
        int i46 = i ^ i35;
        int i47 = (i46 | (-i46)) >> 31;
        int i48 = (i35 & i47) | (((i45 & (i ^ 80)) | ((~i45) & i)) & (~i47));
        Object[] objArr4 = new Object[1];
        onWarmupCompleted("\u0011\u001d\u0003\u0011\u000b\u0011\u001d\u000b\u0011\u0003\u0011#\u000e\u0000\u000b\u001a\u0006\u000f\f\u0005\u000b\u0002\u0017\u001d\u001e\u000f\u0015\u0012\u000b\u0014\u001d\u0004\n\t\u0004\n\u000b#\u0005\u0006 \b", (byte) (13 - ((byte) KeyEvent.getModifierMetaStateMask())), ImageFormat.getBitsPerPixel(0) + 43, objArr4);
        String strIntern4 = ((String) objArr4[0]).intern();
        int i49 = onAudioFocusChange.onNavigationEvent;
        int i50 = (i49 ^ 15) + ((i49 & 15) << 1);
        onAudioFocusChange.onExtraCallback = i50 % 128;
        if (i50 % 2 != 0) {
            onAudioFocusChange.run(strIntern4);
            Process.getElapsedCpuTime();
            throw new ArithmeticException();
        }
        long jRun2 = onAudioFocusChange.run(strIntern4);
        long j23 = -724214058;
        long j24 = -560;
        long jNextInt = new Random().nextInt();
        long j25 = jNextInt ^ j2;
        long j26 = ((-559) * j23) + (561 * jRun2) + (((j25 | j23) ^ j2) * j24) + (j24 * ((((jRun2 ^ j2) | j23) | jNextInt) ^ j2)) + (560 * (((j25 | jRun2) ^ j2) | (((j23 ^ j2) | jRun2) ^ j2))) + 1111460522;
        int i51 = (~(226826422 | i28)) | 1646945857;
        int i52 = ~((-209719447) | i);
        int i53 = ((int) (j26 >> 32)) & ((-724641504) + ((i51 | i52) * (-502)) + (((~(1873772279 | i28)) | i52) * 502));
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int i54 = i53 | (((int) j26) & ((((~(527729382 | iUptimeMillis)) | (-1964955793)) * 56) + 1700078653 + (((~((~iUptimeMillis) | (-1964955793))) | 527729382) * 56)));
        int i55 = onAudioFocusChange.onExtraCallback;
        int i56 = (i55 ^ 63) + ((i55 & 63) << 1);
        onAudioFocusChange.onNavigationEvent = i56 % 128;
        int i57 = i56 % 2;
        int i58 = (i54 | (-i54)) >> 31;
        int i59 = i ^ i48;
        int i60 = (i59 | (-i59)) >> 31;
        int i61 = (i48 & i60) | (((i58 & (i ^ 90)) | ((~i58) & i)) & (~i60));
        Object[] objArr5 = new Object[1];
        onWarmupCompleted("\u0006\u0005\u0011\u001b\b\u0017\u000e\u0017\u000e\t\u000e\u0015\u0011\u0003\u000e\u000b\u001f\u0010", (byte) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 80), 18 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr5);
        String strIntern5 = ((String) objArr5[0]).intern();
        int i62 = onAudioFocusChange.onNavigationEvent;
        int i63 = (i62 ^ 15) + ((i62 & 15) << 1);
        onAudioFocusChange.onExtraCallback = i63 % 128;
        if (i63 % 2 != 0) {
            onAudioFocusChange.run(strIntern5);
            throw new ArithmeticException();
        }
        long jRun3 = onAudioFocusChange.run(strIntern5);
        long j27 = -206325298;
        long j28 = j27 ^ j2;
        long startUptimeMillis = (int) Process.getStartUptimeMillis();
        long j29 = (303 * j27) + ((-301) * jRun3) + ((-302) * ((((j28 | (startUptimeMillis ^ j2)) | jRun3) ^ j2) | (((j27 | jRun3) | startUptimeMillis) ^ j2))) + ((-604) * (((j28 | jRun3) | startUptimeMillis) ^ j2)) + (302 * (((jRun3 | startUptimeMillis) ^ j2) | ((j27 | (jRun3 ^ j2)) ^ j2))) + 593571762;
        int i64 = ((int) (j29 >> 32)) & (1519195920 + (((~(1528128663 | i28)) | 1329612221) * (-865)) + ((~((-1528128664) | i)) * 865) + (((~(i28 | (-1528128664))) | (~(1329612221 | i28))) * 865));
        int i65 = ~((int) Runtime.getRuntime().totalMemory());
        int i66 = i64 | (((int) j29) & ((-1082465131) + (((~(i65 | (-940666152))) | 403728386) * (-160)) + (((~(i65 | 496560258)) | (-940666152)) * 160)));
        int i67 = onAudioFocusChange.onExtraCallback;
        int i68 = (i67 ^ 63) + ((i67 & 63) << 1);
        onAudioFocusChange.onNavigationEvent = i68 % 128;
        int i69 = i68 % 2;
        int i70 = (i66 | (-i66)) >> 31;
        int i71 = i ^ i61;
        int i72 = (i71 | (-i71)) >> 31;
        int i73 = (i61 & i72) | (((i70 & (i ^ 100)) | ((~i70) & i)) & (~i72));
        Object[] objArr6 = {new int[1], strArr2, new int[]{i73}, new int[]{i}};
        int i74 = i ^ i73;
        int i75 = (int) Runtime.getRuntime().totalMemory();
        int i76 = 1672962091 + (((~((-268655141) | i75)) | (-21194374)) * (-318));
        int i77 = ~((-21194374) | i75);
        int i78 = ~i75;
        int i79 = i3 + i76 + ((i77 | (~(289636005 | i78))) * 318) + (((~(i75 | 289636005)) | (~((-20980866) | i78))) * 318) + (((i74 | (-i74)) >> 31) & 16);
        int i80 = i79 ^ (i79 << 13);
        int i81 = i80 ^ (i80 >>> 17);
        ((int[]) objArr6[0])[0] = i81 ^ (i81 << 5);
        int i82 = asBinder + 29;
        asInterface = i82 % 128;
        int i83 = i82 % 2;
        return objArr6;
    }

    private static void onWarmupCompleted(String str, byte b, int i, Object[] objArr) {
        int i2;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback_Parcel + 39;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        ReorderingBufferQueue reorderingBufferQueue = new ReorderingBufferQueue();
        char[] cArr2 = IAuthTabCallback;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i6 = 0; i6 < length; i6++) {
                cArr3[i6] = (char) (cArr2[i6] ^ 6292690160322140727L);
            }
            cArr2 = cArr3;
        }
        char c = (char) (6292690160322140727L ^ IAuthTabCallbackDefault);
        char[] cArr4 = new char[i];
        if (i % 2 == 0) {
            i2 = i;
        } else {
            int i7 = IAuthTabCallback_Parcel + 21;
            IAuthTabCallbackStubProxy = i7 % 128;
            if (i7 % 2 != 0) {
                i2 = i + 10;
                cArr4[i2] = (char) (cArr[i2] >> b);
            } else {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            }
        }
        if (i2 > 1) {
            reorderingBufferQueue.onNavigationEvent = 0;
            while (reorderingBufferQueue.onNavigationEvent < i2) {
                int i8 = IAuthTabCallback_Parcel + 51;
                IAuthTabCallbackStubProxy = i8 % 128;
                int i9 = i8 % 2;
                reorderingBufferQueue.onExtraCallbackWithResult = cArr[reorderingBufferQueue.onNavigationEvent];
                reorderingBufferQueue.IAuthTabCallback = cArr[reorderingBufferQueue.onNavigationEvent + 1];
                if (reorderingBufferQueue.onExtraCallbackWithResult != reorderingBufferQueue.IAuthTabCallback) {
                    reorderingBufferQueue.onWarmupCompleted = reorderingBufferQueue.onExtraCallbackWithResult / c;
                    reorderingBufferQueue.asBinder = reorderingBufferQueue.onExtraCallbackWithResult % c;
                    reorderingBufferQueue.onExtraCallback = reorderingBufferQueue.IAuthTabCallback / c;
                    reorderingBufferQueue.onTransact = reorderingBufferQueue.IAuthTabCallback % c;
                    if (reorderingBufferQueue.asBinder == reorderingBufferQueue.onTransact) {
                        reorderingBufferQueue.onWarmupCompleted = ((reorderingBufferQueue.onWarmupCompleted + c) - 1) % c;
                        reorderingBufferQueue.onExtraCallback = ((reorderingBufferQueue.onExtraCallback + c) - 1) % c;
                        int i10 = (reorderingBufferQueue.onWarmupCompleted * c) + reorderingBufferQueue.asBinder;
                        int i11 = (reorderingBufferQueue.onExtraCallback * c) + reorderingBufferQueue.onTransact;
                        cArr4[reorderingBufferQueue.onNavigationEvent] = cArr2[i10];
                        cArr4[reorderingBufferQueue.onNavigationEvent + 1] = cArr2[i11];
                        int i12 = IAuthTabCallback_Parcel + 99;
                        IAuthTabCallbackStubProxy = i12 % 128;
                        int i13 = i12 % 2;
                    } else if (reorderingBufferQueue.onWarmupCompleted != reorderingBufferQueue.onExtraCallback) {
                        int i14 = (reorderingBufferQueue.onWarmupCompleted * c) + reorderingBufferQueue.onTransact;
                        int i15 = (reorderingBufferQueue.onExtraCallback * c) + reorderingBufferQueue.asBinder;
                        cArr4[reorderingBufferQueue.onNavigationEvent] = cArr2[i14];
                        cArr4[reorderingBufferQueue.onNavigationEvent + 1] = cArr2[i15];
                    } else {
                        reorderingBufferQueue.asBinder = ((reorderingBufferQueue.asBinder + c) - 1) % c;
                        reorderingBufferQueue.onTransact = ((reorderingBufferQueue.onTransact + c) - 1) % c;
                        int i16 = (reorderingBufferQueue.onWarmupCompleted * c) + reorderingBufferQueue.asBinder;
                        int i17 = (reorderingBufferQueue.onExtraCallback * c) + reorderingBufferQueue.onTransact;
                        cArr4[reorderingBufferQueue.onNavigationEvent] = cArr2[i16];
                        cArr4[reorderingBufferQueue.onNavigationEvent + 1] = cArr2[i17];
                    }
                } else {
                    int i18 = IAuthTabCallback_Parcel + 19;
                    IAuthTabCallbackStubProxy = i18 % 128;
                    int i19 = i18 % 2;
                    cArr4[reorderingBufferQueue.onNavigationEvent] = (char) (reorderingBufferQueue.onExtraCallbackWithResult - b);
                    cArr4[reorderingBufferQueue.onNavigationEvent + 1] = (char) (reorderingBufferQueue.IAuthTabCallback - b);
                }
                reorderingBufferQueue.onNavigationEvent += 2;
            }
        }
        for (int i20 = 0; i20 < i; i20++) {
            cArr4[i20] = (char) (cArr4[i20] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    private static Object[] onExtraCallback(Context context, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = asBinder + 81;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        try {
            Object[] objArr = new Object[1];
            onExtraCallbackWithResult(new int[]{0, 23, 0, 0}, false, "\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000", objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            onExtraCallbackWithResult(new int[]{23, 14, 177, 8}, false, "\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000", objArr2);
            String str = (String) cls.getMethod((String) objArr2[0], null).invoke(context, null);
            Object[] objArr3 = new Object[1];
            onExtraCallbackWithResult(new int[]{0, 23, 0, 0}, false, "\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000", objArr3);
            Class<?> cls2 = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            onExtraCallbackWithResult(new int[]{37, 18, 108, 0}, false, "\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001", objArr4);
            ApplicationInfo applicationInfo = (ApplicationInfo) cls2.getMethod((String) objArr4[0], null).invoke(context, null);
            int iIndexOf = applicationInfo.dataDir.indexOf(str);
            if (iIndexOf > 0) {
                int i5 = asBinder + 123;
                asInterface = i5 % 128;
                int i6 = i5 % 2;
                int iOnExtraCallback = DefaultRendererCapabilitiesListFactoryExternalSyntheticLambda0.onExtraCallback(applicationInfo.dataDir, 16, -725904754);
                int i7 = i ^ 20;
                int i8 = (iOnExtraCallback | (-iOnExtraCallback)) >> 31;
                int i9 = (i8 & i7) | ((~i8) & i);
                int iOnExtraCallback2 = DefaultRendererCapabilitiesListFactoryExternalSyntheticLambda0.onExtraCallback(applicationInfo.dataDir, 6, -2096167706);
                int i10 = (iOnExtraCallback2 | (-iOnExtraCallback2)) >> 31;
                int i11 = i ^ i9;
                int i12 = (i11 | (-i11)) >> 31;
                int i13 = (i9 & i12) | (((i10 & i7) | ((~i10) & i)) & (~i12));
                int i14 = iIndexOf ^ (-1);
                String strSubstring = applicationInfo.dataDir.substring(0, iIndexOf & ((i14 | (-i14)) >> 31));
                Object[] objArr5 = new Object[1];
                onWarmupCompleted("㘀", (byte) (76 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), -TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr5);
                for (String str2 : strSubstring.split((String) objArr5[0])) {
                    Object[] objArr6 = new Object[1];
                    onWarmupCompleted(" \u000b㘡", (byte) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 90), View.resolveSize(0, 0) + 3, objArr6);
                    if (str2.split((String) objArr6[0]).length > 1) {
                        int i15 = asInterface + 27;
                        asBinder = i15 % 128;
                        int i16 = i15 % 2;
                        if (onExtraCallback(str2)) {
                            int i17 = asInterface + 49;
                            asBinder = i17 % 128;
                            int i18 = i17 % 2;
                            int i19 = i ^ i13;
                            int i20 = (i19 | (-i19)) >> 31;
                            i13 = (i13 & i20) | ((~i20) & i7);
                        }
                    }
                }
                i = i13;
            }
            String[] strArr = {applicationInfo.dataDir};
            ((int[]) objArr[0])[0] = i;
            Object[] objArr7 = {new int[1], strArr};
            return objArr7;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static boolean onExtraCallback(String str) {
        synchronized (AudioFocusManagerExternalSyntheticLambda0.class) {
            try {
                Object[] objArr = new Object[1];
                onExtraCallbackWithResult(new int[]{12, 16, 113, 0}, "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001", true, objArr);
                String strOnExtraCallbackWithResult = RawResourceDataSourceRawResourceDataSourceException.onExtraCallbackWithResult((String) objArr[0], 2000L);
                Object[] objArr2 = new Object[1];
                onWarmupCompleted("㗮", (byte) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 94), 1 - (Process.myTid() >> 22), objArr2);
                for (String str2 : strOnExtraCallbackWithResult.split((String) objArr2[0])) {
                    Object[] objArr3 = new Object[1];
                    onExtraCallbackWithResult(new int[]{28, 19, 0, 0}, "\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001", true, objArr3);
                    if (!str2.startsWith((String) objArr3[0])) {
                        Object[] objArr4 = new Object[1];
                        onWarmupCompleted("\u0005\u0000\u001b\u0005\u0000#\u0002\f\u0018\u0011\b\u000e\u000b\u0017\u0015#\u000e\u0012\u0014\u000b", (byte) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 61), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 20, objArr4);
                        if (str2.startsWith((String) objArr4[0])) {
                            continue;
                        } else {
                            Object[] objArr5 = new Object[1];
                            onExtraCallbackWithResult(new int[]{47, 8, 0, 0}, "\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0001", false, objArr5);
                            if (str2.startsWith((String) objArr5[0])) {
                                Object[] objArr6 = new Object[1];
                                onWarmupCompleted("㘈", (byte) (104 - (Process.myPid() >> 22)), (ViewConfiguration.getEdgeSlop() >> 16) + 1, objArr6);
                                String[] strArrSplit = str2.split((String) objArr6[0]);
                                if (strArrSplit.length > 1 && strArrSplit[1].equalsIgnoreCase(str)) {
                                    return true;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
            } catch (IOException unused) {
            }
            return false;
        }
    }

    private static int IAuthTabCallback(Context context, int i) throws Throwable {
        int i2 = 2 % 2;
        Object[] objArr = new Object[1];
        onExtraCallbackWithResult(new int[]{55, 13, 0, 0}, "\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001", true, objArr);
        try {
            Object[] objArr2 = {(String) objArr[0]};
            Object[] objArr3 = new Object[1];
            onExtraCallbackWithResult(new int[]{0, 23, 0, 0}, false, "\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000", objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            onExtraCallbackWithResult(new int[]{55, 16, 0, 0}, false, "\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000", objArr4);
            Object objInvoke = cls.getMethod((String) objArr4[0], String.class).invoke(context, objArr2);
            if (objInvoke != null) {
                int i3 = asInterface + 85;
                asBinder = i3 % 128;
                if (i3 % 2 == 0) {
                    throw new ArithmeticException();
                }
                Object[] objArr5 = new Object[1];
                onExtraCallbackWithResult(new int[]{71, 37, 0, 0}, false, "\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001", objArr5);
                Class<?> cls2 = Class.forName((String) objArr5[0]);
                Object[] objArr6 = new Object[1];
                onExtraCallbackWithResult(new int[]{108, 15, 0, 0}, false, "\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001", objArr6);
                List list = (List) cls2.getMethod((String) objArr6[0], null).invoke(objInvoke, null);
                if (list != null) {
                    for (Object obj : list) {
                        Object[] objArr7 = new Object[1];
                        onExtraCallbackWithResult(new int[]{123, 29, 0, 0}, false, "\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000", objArr7);
                        Class<?> cls3 = Class.forName((String) objArr7[0]);
                        Object[] objArr8 = new Object[1];
                        onExtraCallbackWithResult(new int[]{23, 14, 177, 8}, false, "\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000", objArr8);
                        String str = (String) cls3.getMethod((String) objArr8[0], null).invoke(obj, null);
                        int i4 = asBinder + 39;
                        asInterface = i4 % 128;
                        int i5 = i4 % 2;
                        Object[] objArr9 = new Object[1];
                        onExtraCallbackWithResult(new int[]{71, 37, 0, 0}, false, "\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001", objArr9);
                        Class<?> cls4 = Class.forName((String) objArr9[0]);
                        Object[] objArr10 = new Object[1];
                        onExtraCallbackWithResult(new int[]{152, 17, 0, 0}, true, "\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000", objArr10);
                        if (((Boolean) cls4.getMethod((String) objArr10[0], String.class).invoke(objInvoke, str)).booleanValue() && DefaultRendererCapabilitiesListFactoryExternalSyntheticLambda0.onExtraCallback(str, 20, 1245577864) != 0) {
                            return i ^ 70;
                        }
                    }
                }
            }
            int i6 = asInterface + 43;
            asBinder = i6 % 128;
            if (i6 % 2 != 0) {
                return i;
            }
            throw new NullPointerException();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    static void onExtraCallback() {
        onExtraCallback = new char[]{10420, 10456, 10443, 10446, 10462, 10480, 10473, 10474, 10475, 10440, 10444, 10471, 10479, 10586, 10580, 10578, 10580, 10581, 10576, 10582, 10550, 10552, 10593, 10588, 10584, 10548, 10548, 10588, 10388, 10438, 10469, 10470, 10472, 10476, 10472, 10439, 10442, 10475, 10470, 10443, 10444, 10467, 10465, 10467, 10468, 10463, 10469, 10421, 10469, 10463, 10468, 10467, 10465, 10467, 10444, 10425, 10475, 10467, 10471, 10474, 10476, 10468, 10463, 10465, 10467, 10476, 10474, 10465};
        IAuthTabCallback = new char[]{61384, 60471, 61376, 61382, 61405, 61388, 60465, 60468, 61315, 61377, 61397, 61314, 61378, 61381, 61335, 61401, 60469, 61379, 61426, 60470, 61380, 61387, 60467, 61385, 61391, 61351, 61403, 60466, 61400, 61390, 61386, 61396, 61424, 61407, 61406, 61430};
        IAuthTabCallbackDefault = (char) 55857;
    }

    static void IAuthTabCallback() {
        IAuthTabCallbackStub = new char[]{10413, 10468, 10470, 10472, 10477, 10473, 10467, 10438, 10437, 10470, 10475, 10478, 10473, 10470, 10478, 10446, 10421, 10454, 10475, 10478, 10473, 10475, 10483, 10507, 10644, 10642, 10644, 10631, 10629, 10645, 10647, 10644, 10644, 10650, 10640, 10630, 10640, 10470, 10575, 10581, 10563, 10561, 10585, 10583, 10579, 10575, 10571, 10579, 10583, 10581, 10583, 10564, 10564, 10579, 10579, 10416, 10467, 10473, 10464, 10467, 10483, 10480, 10473, 10470, 10461, 10457, 10472, 10481, 10476, 10467, 10465, 10413, 10468, 10470, 10472, 10477, 10473, 10467, 10438, 10436, 10469, 10477, 10444, 10436, 10463, 10469, 10472, 10472, 10443, 10422, 10449, 10474, 10476, 10467, 10465, 10455, 10460, 10474, 10471, 10467, 10475, 10464, 10452, 10468, 10468, 10465, 10467, 10472, 10416, 10467, 10473, 10455, 10447, 10472, 10475, 10476, 10474, 10448, 10447, 10469, 10472, 10472, 10477, 10413, 10468, 10470, 10472, 10477, 10473, 10467, 10438, 10437, 10470, 10475, 10478, 10473, 10470, 10478, 10446, 10421, 10454, 10475, 10475, 10476, 10475, 10470, 10470, 10478, 10462, 10452, 10468, 10470, 10421, 10477, 10453, 10454, 10472, 10470, 10479, 10464, 10455, 10469, 10471, 10468, 10471, 10477, 10462, 10462, 10475};
    }
}
