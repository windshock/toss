package com.bumptech.glide.load;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.Savers_androidKtExternalSyntheticLambda6;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface ImageHeaderParser {
    int IAuthTabCallback(@NonNull InputStream inputStream, @NonNull Savers_androidKtExternalSyntheticLambda6 savers_androidKtExternalSyntheticLambda6) throws IOException;

    int onWarmupCompleted(@NonNull ByteBuffer byteBuffer, @NonNull Savers_androidKtExternalSyntheticLambda6 savers_androidKtExternalSyntheticLambda6) throws IOException;

    ImageType onWarmupCompleted(@NonNull InputStream inputStream) throws IOException;

    ImageType onWarmupCompleted(@NonNull ByteBuffer byteBuffer) throws IOException;

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
    public static final class ImageType {
        private static final /* synthetic */ ImageType[] $VALUES;
        public static final ImageType ANIMATED_WEBP;
        public static final ImageType AVIF;
        public static final ImageType GIF;
        public static final ImageType JPEG;
        public static final ImageType PNG;
        public static final ImageType PNG_A;
        public static final ImageType RAW;
        public static final ImageType UNKNOWN;
        public static final ImageType WEBP;
        public static final ImageType WEBP_A;
        private static int onExtraCallback;
        private static int onWarmupCompleted;
        private final boolean hasAlpha;
        private static final byte[] $$a = {79, 7, -80, -125};
        private static final int $$b = 19;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent = 1;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
        /* JADX WARN: Type inference failed for: r8v2, types: [int] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$c(short s, int i2, short s2) {
            int i3;
            int i4;
            ?? r8 = 105 - (s2 * 3);
            byte[] bArr = $$a;
            int i5 = i2 * 3;
            int i6 = s + 4;
            byte[] bArr2 = new byte[i5 + 1];
            if (bArr == null) {
                byte b = r8;
                i3 = 0;
                int i7 = i6;
                int i8 = i7;
                i4 = i6 + b;
                i6 = i8;
                int i9 = i6 + 1;
                bArr2[i3] = (byte) i4;
                if (i3 == i5) {
                    return new String(bArr2, 0);
                }
                i3++;
                b = bArr[i9];
                int i10 = i4;
                i7 = i9;
                i6 = i10;
                int i82 = i7;
                i4 = i6 + b;
                i6 = i82;
                int i92 = i6 + 1;
                bArr2[i3] = (byte) i4;
                if (i3 == i5) {
                }
            } else {
                i3 = 0;
                i4 = r8;
                int i922 = i6 + 1;
                bArr2[i3] = (byte) i4;
                if (i3 == i5) {
                }
            }
        }

        public static ImageType valueOf(String str) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 53;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            ImageType imageType = (ImageType) Enum.valueOf(ImageType.class, str);
            int i5 = IAuthTabCallback + 119;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 76 / 0;
            }
            return imageType;
        }

        public static ImageType[] values() {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 119;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            ImageType[] imageTypeArr = $VALUES;
            if (i4 != 0) {
                return (ImageType[]) imageTypeArr.clone();
            }
            throw null;
        }

        static {
            onExtraCallback = 0;
            onExtraCallback();
            ImageType imageType = new ImageType("GIF", 0, true);
            GIF = imageType;
            ImageType imageType2 = new ImageType("JPEG", 1, false);
            JPEG = imageType2;
            ImageType imageType3 = new ImageType("RAW", 2, false);
            RAW = imageType3;
            ImageType imageType4 = new ImageType("PNG_A", 3, true);
            PNG_A = imageType4;
            ImageType imageType5 = new ImageType("PNG", 4, false);
            PNG = imageType5;
            ImageType imageType6 = new ImageType("WEBP_A", 5, true);
            WEBP_A = imageType6;
            ImageType imageType7 = new ImageType("WEBP", 6, false);
            WEBP = imageType7;
            ImageType imageType8 = new ImageType("ANIMATED_WEBP", 7, true);
            ANIMATED_WEBP = imageType8;
            ImageType imageType9 = new ImageType("AVIF", 8, true);
            AVIF = imageType9;
            Object[] objArr = new Object[1];
            a(View.resolveSize(0, 0) + 7, 7 - View.combineMeasuredStates(0, 0), new char[]{5, 65534, 65531, 65534, 65535, 7, 65534}, false, 129 - (Process.myTid() >> 22), objArr);
            ImageType imageType10 = new ImageType(((String) objArr[0]).intern(), 9, false);
            UNKNOWN = imageType10;
            $VALUES = new ImageType[]{imageType, imageType2, imageType3, imageType4, imageType5, imageType6, imageType7, imageType8, imageType9, imageType10};
            int i2 = onNavigationEvent + 119;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 38 / 0;
            }
        }

        private ImageType(String str, int i2, boolean z) {
            this.hasAlpha = z;
        }

        public boolean hasAlpha() {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult;
            int i4 = i3 + 47;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            boolean z = this.hasAlpha;
            int i6 = i3 + 101;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return z;
        }

        public boolean isWebp() {
            int i2 = 2 % 2;
            int i3 = AnonymousClass3.onWarmupCompleted[ordinal()];
            if (i3 != 1 && i3 != 2 && i3 != 3) {
                int i4 = onExtraCallbackWithResult + 93;
                IAuthTabCallback = i4 % 128;
                return i4 % 2 == 0;
            }
            int i5 = IAuthTabCallback + 97;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 4 / 0;
            }
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x0181  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0182  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(int i2, int i3, char[] cArr, boolean z, int i4, Object[] objArr) throws Throwable {
            int i5;
            int i6;
            Throwable cause;
            int i7 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
            char[] cArr2 = new char[i2];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (true) {
                i5 = -1;
                i6 = 2083011369;
                if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i2) {
                    break;
                }
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i4 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
                int i8 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(onWarmupCompleted)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35125 - View.MeasureSpec.getSize(0)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 23, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10278, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback2 == null) {
                        byte b = (byte) (-1);
                        byte b2 = (byte) (b + 1);
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 12842), 54 - TextUtils.lastIndexOf("", '0'), 2167 - (Process.myPid() >> 22), 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
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
                int i9 = $11 + 125;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i3;
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr2, 0, cArr3, 0, i2);
                System.arraycopy(cArr3, 0, cArr2, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
                System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            }
            if (z) {
                int i11 = $11 + 125;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                char[] cArr4 = new char[i2];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
                int i13 = $11 + 29;
                $10 = i13 % 128;
                int i14 = i13 % 2;
                while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i2) {
                    int i15 = $10 + 9;
                    $11 = i15 % 128;
                    int i16 = i15 % 2;
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i6);
                    if (objOnExtraCallback3 == null) {
                        byte b3 = (byte) i5;
                        byte b4 = (byte) (b3 + 1);
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Gravity.getAbsoluteGravity(0, 0) + 12843), 55 - Color.red(0), (ViewConfiguration.getLongPressTimeout() >> 16) + 2167, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    int i17 = $10 + 123;
                    $11 = i17 % 128;
                    int i18 = i17 % 2;
                    i5 = -1;
                    i6 = 2083011369;
                }
                int i19 = $10 + 75;
                $11 = i19 % 128;
                int i20 = i19 % 2;
                cArr2 = cArr4;
            }
            objArr[0] = new String(cArr2);
        }

        static void onExtraCallback() {
            onWarmupCompleted = 478308888;
        }
    }

    /* renamed from: com.bumptech.glide.load.ImageHeaderParser$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[ImageType.values().length];
            onWarmupCompleted = iArr;
            try {
                iArr[ImageType.WEBP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                onWarmupCompleted[ImageType.WEBP_A.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                onWarmupCompleted[ImageType.ANIMATED_WEBP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }
}
