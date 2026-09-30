package org.jmrtd.lds.iso19794;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import net.sf.scuba.smartcards.BuildConfig;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'UNKNOWN' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class FaceImageInfo$SourceType {
    private static final /* synthetic */ FaceImageInfo$SourceType[] $VALUES;
    public static final FaceImageInfo$SourceType STATIC_PHOTO_DIGITAL_CAM;
    public static final FaceImageInfo$SourceType STATIC_PHOTO_SCANNER;
    public static final FaceImageInfo$SourceType STATIC_PHOTO_UNKNOWN_SOURCE;
    public static final FaceImageInfo$SourceType UNKNOWN;
    public static final FaceImageInfo$SourceType UNSPECIFIED;
    public static final FaceImageInfo$SourceType VIDEO_FRAME_ANALOG_CAM;
    public static final FaceImageInfo$SourceType VIDEO_FRAME_DIGITAL_CAM;
    public static final FaceImageInfo$SourceType VIDEO_FRAME_UNKNOWN_SOURCE;
    private static int onExtraCallback;
    private static int onNavigationEvent;
    private static final byte[] $$a = {70, 83, 77, 1};
    private static final int $$b = 49;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private static int IAuthTabCallback = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, byte b, int i2) {
        int i3;
        int i4 = b * 2;
        int i5 = (i2 * 3) + 4;
        int i6 = 105 - (i * 2);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i7 = i4;
            i3 = 0;
            i6 += -i7;
            i5++;
            bArr2[i3] = (byte) i6;
            if (i3 == i4) {
                return new String(bArr2, 0);
            }
            i3++;
            i7 = bArr[i5];
            i6 += -i7;
            i5++;
            bArr2[i3] = (byte) i6;
            if (i3 == i4) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i6;
            if (i3 == i4) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0172  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        char c;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            c = 3;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i6 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(onExtraCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35125 - ((Process.getThreadPriority(0) + 20) >> 6)), 23 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0) + 10278, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    char capsMode = (char) (TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0) + 12843);
                    int i7 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 54;
                    int iMyTid = (Process.myTid() >> 22) + 2167;
                    byte b = (byte) ($$a[3] - 1);
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(capsMode, i7, iMyTid, 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
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
        if (i2 > 0) {
            int i8 = $11 + 3;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                int i10 = $10 + 15;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    char c2 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 12842);
                    int maximumDrawingCacheSize = 55 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    int iLastIndexOf = 2166 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0);
                    byte b3 = (byte) ($$a[c] - 1);
                    byte b4 = b3;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c2, maximumDrawingCacheSize, iLastIndexOf, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i4 = 2083011369;
                c = 3;
            }
            cArr2 = cArr4;
        }
        String str = new String(cArr2);
        int i12 = $11 + 87;
        $10 = i12 % 128;
        if (i12 % 2 == 0) {
            objArr[0] = str;
        } else {
            int i13 = 25 / 0;
            objArr[0] = str;
        }
    }

    private FaceImageInfo$SourceType(String str, int i) {
    }

    public static FaceImageInfo$SourceType valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 25;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        FaceImageInfo$SourceType faceImageInfo$SourceType = (FaceImageInfo$SourceType) Enum.valueOf(FaceImageInfo$SourceType.class, str);
        if (i3 != 0) {
            return faceImageInfo$SourceType;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static FaceImageInfo$SourceType[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 23;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        FaceImageInfo$SourceType[] faceImageInfo$SourceTypeArr = (FaceImageInfo$SourceType[]) $VALUES.clone();
        int i4 = onWarmupCompleted + 73;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return faceImageInfo$SourceTypeArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        onNavigationEvent = 1;
        onExtraCallbackWithResult();
        FaceImageInfo$SourceType faceImageInfo$SourceType = new FaceImageInfo$SourceType("UNSPECIFIED", 0);
        UNSPECIFIED = faceImageInfo$SourceType;
        FaceImageInfo$SourceType faceImageInfo$SourceType2 = new FaceImageInfo$SourceType("STATIC_PHOTO_UNKNOWN_SOURCE", 1);
        STATIC_PHOTO_UNKNOWN_SOURCE = faceImageInfo$SourceType2;
        FaceImageInfo$SourceType faceImageInfo$SourceType3 = new FaceImageInfo$SourceType("STATIC_PHOTO_DIGITAL_CAM", 2);
        STATIC_PHOTO_DIGITAL_CAM = faceImageInfo$SourceType3;
        FaceImageInfo$SourceType faceImageInfo$SourceType4 = new FaceImageInfo$SourceType("STATIC_PHOTO_SCANNER", 3);
        STATIC_PHOTO_SCANNER = faceImageInfo$SourceType4;
        FaceImageInfo$SourceType faceImageInfo$SourceType5 = new FaceImageInfo$SourceType("VIDEO_FRAME_UNKNOWN_SOURCE", 4);
        VIDEO_FRAME_UNKNOWN_SOURCE = faceImageInfo$SourceType5;
        FaceImageInfo$SourceType faceImageInfo$SourceType6 = new FaceImageInfo$SourceType("VIDEO_FRAME_ANALOG_CAM", 5);
        VIDEO_FRAME_ANALOG_CAM = faceImageInfo$SourceType6;
        FaceImageInfo$SourceType faceImageInfo$SourceType7 = new FaceImageInfo$SourceType("VIDEO_FRAME_DIGITAL_CAM", 6);
        VIDEO_FRAME_DIGITAL_CAM = faceImageInfo$SourceType7;
        Object[] objArr = new Object[1];
        a(Process.getGidForName(BuildConfig.FLAVOR) + 8, View.combineMeasuredStates(0, 0) + 1, new char[]{65534, 5, 65534, 65531, 65534, 65535, 7}, false, ((Process.getThreadPriority(0) + 20) >> 6) + 260, objArr);
        FaceImageInfo$SourceType faceImageInfo$SourceType8 = new FaceImageInfo$SourceType(((String) objArr[0]).intern(), 7);
        UNKNOWN = faceImageInfo$SourceType8;
        $VALUES = new FaceImageInfo$SourceType[]{faceImageInfo$SourceType, faceImageInfo$SourceType2, faceImageInfo$SourceType3, faceImageInfo$SourceType4, faceImageInfo$SourceType5, faceImageInfo$SourceType6, faceImageInfo$SourceType7, faceImageInfo$SourceType8};
        int i = IAuthTabCallback + 5;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    static void onExtraCallbackWithResult() {
        onExtraCallback = 478309021;
    }
}
