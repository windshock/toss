package o;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.facepay.validation.image.process.RgbMatWithDetection;
import java.lang.reflect.Method;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import o.isTiny;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.MatOfInt;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.core.Size;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class isTinyGame {
    private static final byte[] $$a;
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onNavigationEvent Companion;
    private static int[] IAuthTabCallback;
    private static int asBinder;
    private final StartClientBundle onExtraCallback = new StartClientBundle(112, 112);
    private final Mat onExtraCallbackWithResult;
    private final double onNavigationEvent;
    private final Size onWarmupCompleted;
    private static final int $$b = 245;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int onTransact = 1;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r9v2, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, short s2, short s3, Object[] objArr) {
        int i;
        int i2;
        int i3;
        int i4 = (s * 3) + 10;
        ?? r9 = 102 - (s3 * 2);
        byte[] bArr = $$a;
        int i5 = s2 + 4;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            byte b = r9;
            i3 = 0;
            int i6 = i5;
            int i7 = i5 + b + 4;
            i = i3;
            int i8 = i6;
            i2 = i7;
            i5 = i8;
            int i9 = i5 + 1;
            i3 = i + 1;
            bArr2[i] = (byte) i2;
            if (i3 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            b = bArr[i9];
            int i10 = i2;
            i6 = i9;
            i5 = i10;
            int i72 = i5 + b + 4;
            i = i3;
            int i82 = i6;
            i2 = i72;
            i5 = i82;
            int i92 = i5 + 1;
            i3 = i + 1;
            bArr2[i] = (byte) i2;
            if (i3 == i4) {
            }
        } else {
            i = 0;
            i2 = r9;
            int i922 = i5 + 1;
            i3 = i + 1;
            bArr2[i] = (byte) i2;
            if (i3 == i4) {
            }
        }
    }

    public static final class IAuthTabCallback {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int asBinder = 1;
        private static int[] onExtraCallback = {-1980772209, 557031795, -937137095, 522372806, 2133542244, -1864414003, -451722769, -1820677299, 105024471, -2063836044, -315702685, 345739229, -1805990620, -1592865659, 1209195964, 2039019682, 1453376804, -1357836434};
        private static int onExtraCallbackWithResult;
        private final Mat IAuthTabCallback;
        private final ActivityAnimBean1 onNavigationEvent;
        private final Mat onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onExtraCallbackWithResult + 125;
                asBinder = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof IAuthTabCallback)) {
                int i4 = asBinder + 91;
                onExtraCallbackWithResult = i4 % 128;
                return i4 % 2 != 0;
            }
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) obj;
            if (!Intrinsics.areEqual(this.onWarmupCompleted, iAuthTabCallback.onWarmupCompleted)) {
                int i5 = onExtraCallbackWithResult + 33;
                asBinder = i5 % 128;
                return i5 % 2 == 0;
            }
            if (!Intrinsics.areEqual(this.onNavigationEvent, iAuthTabCallback.onNavigationEvent)) {
                int i6 = asBinder + 73;
                onExtraCallbackWithResult = i6 % 128;
                return i6 % 2 != 0;
            }
            if (Intrinsics.areEqual(this.IAuthTabCallback, iAuthTabCallback.IAuthTabCallback)) {
                return true;
            }
            int i7 = asBinder + 57;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 == 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = asBinder + 25;
            onExtraCallbackWithResult = i2 % 128;
            int iHashCode = i2 % 2 != 0 ? (((this.onWarmupCompleted.hashCode() << 111) + this.onNavigationEvent.hashCode()) >> 103) >>> this.IAuthTabCallback.hashCode() : (((this.onWarmupCompleted.hashCode() * 31) + this.onNavigationEvent.hashCode()) * 31) + this.IAuthTabCallback.hashCode();
            int i3 = asBinder + 53;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return iHashCode;
        }

        public String toString() throws Throwable {
            int i = 2 % 2;
            Mat mat = this.onWarmupCompleted;
            ActivityAnimBean1 activityAnimBean1 = this.onNavigationEvent;
            Mat mat2 = this.IAuthTabCallback;
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            a(new int[]{903276456, -1755098801, 51282014, 277084568, 1248984232, 778033116, 1279138096, 148279040, -1964750, -853421681, 36604143, 790439581, -496844951, -1133702291, -1677671663, 262820564, 556667523, 1530495189, -2032893038, -1509155514}, 37 - (ViewConfiguration.getTouchSlop() >> 8), objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(mat);
            Object[] objArr2 = new Object[1];
            a(new int[]{1894667599, 1860028747, 1360050571, 931880583, 743845105, -685301781, -491247988, -117134556, -1767553636, 972978394}, Color.argb(0, 0, 0, 0) + 19, objArr2);
            sb.append(((String) objArr2[0]).intern());
            sb.append(activityAnimBean1);
            Object[] objArr3 = new Object[1];
            a(new int[]{463783532, -1051391846, -261127705, -362795609, -80675740, 1449523791}, (ViewConfiguration.getJumpTapTimeout() >> 16) + 12, objArr3);
            sb.append(((String) objArr3[0]).intern());
            sb.append(mat2);
            Object[] objArr4 = new Object[1];
            a(new int[]{-1023297843, -418868650}, Color.green(0) + 1, objArr4);
            sb.append(((String) objArr4[0]).intern());
            String string = sb.toString();
            int i2 = asBinder + 89;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return string;
        }

        public IAuthTabCallback(@NotNull Mat mat, @NotNull ActivityAnimBean1 activityAnimBean1, @NotNull Mat mat2) {
            Intrinsics.checkNotNullParameter(mat, "");
            Intrinsics.checkNotNullParameter(activityAnimBean1, "");
            Intrinsics.checkNotNullParameter(mat2, "");
            this.onWarmupCompleted = mat;
            this.onNavigationEvent = activityAnimBean1;
            this.IAuthTabCallback = mat2;
        }

        public final Mat onNavigationEvent() {
            Mat mat;
            int i = 2 % 2;
            int i2 = asBinder + 99;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            if (i2 % 2 != 0) {
                mat = this.onWarmupCompleted;
                int i4 = 19 / 0;
            } else {
                mat = this.onWarmupCompleted;
            }
            int i5 = i3 + 117;
            asBinder = i5 % 128;
            if (i5 % 2 != 0) {
                return mat;
            }
            throw null;
        }

        public final Mat onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 117;
            int i3 = i2 % 128;
            asBinder = i3;
            int i4 = i2 % 2;
            Mat mat = this.IAuthTabCallback;
            int i5 = i3 + 75;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 35 / 0;
            }
            return mat;
        }

        public final void onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 87;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
                this.onWarmupCompleted.release();
                this.IAuthTabCallback.release();
                int i3 = onExtraCallbackWithResult + 33;
                asBinder = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 3 / 0;
                    return;
                }
                return;
            }
            this.onWarmupCompleted.release();
            this.IAuthTabCallback.release();
            throw null;
        }

        private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
            int length;
            int[] iArr2;
            int i2;
            int i3 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr3 = onExtraCallback;
            int i4 = -1469660336;
            float f = 0.0f;
            int i5 = 16;
            if (iArr3 != null) {
                int i6 = $10 + 29;
                $11 = i6 % 128;
                if (i6 % 2 == 0) {
                    length = iArr3.length;
                    iArr2 = new int[length];
                    i2 = 1;
                } else {
                    length = iArr3.length;
                    iArr2 = new int[length];
                    i2 = 0;
                }
                while (i2 < length) {
                    int i7 = $11 + 103;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr3[i2])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> i5), (TypedValue.complexToFloat(0) > f ? 1 : (TypedValue.complexToFloat(0) == f ? 0 : -1)) + 72, View.getDefaultSize(0, 0) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr2[i2] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                        i2++;
                        f = 0.0f;
                        i5 = 16;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                int i9 = $10 + 29;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                iArr3 = iArr2;
            }
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = onExtraCallback;
            char c = '0';
            if (iArr5 != null) {
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i11 = 0;
                while (i11 < length3) {
                    Object[] objArr3 = {Integer.valueOf(iArr5[i11])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSizeAndState(0, 0, 0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 72, TextUtils.indexOf("", c, 0) + 8849, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i11] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    i11++;
                    i4 = -1469660336;
                    c = '0';
                }
                iArr5 = iArr6;
            }
            System.arraycopy(iArr5, 0, iArr4, 0, length2);
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = 0;
            int i12 = $10 + 89;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
                cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
                cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
                cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
                cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                int i14 = 0;
                for (int i15 = 16; i14 < i15; i15 = 16) {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i14];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 22252), 39 - View.resolveSizeAndState(0, 0, 0), 10301 - (ViewConfiguration.getTouchSlop() >> 8), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                    i14++;
                }
                int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i16;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
                int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
                cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
                cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
                Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.blue(0) + 4033), '~' - AndroidCharacter.getMirror('0'), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr2, 0, i);
        }
    }

    public isTinyGame() {
        Mat mat = new Mat(5, 2, 5);
        mat.put(0, 0, new double[]{38.2946d, 51.6963d});
        mat.put(1, 0, new double[]{73.5318d, 51.5014d});
        mat.put(2, 0, new double[]{56.0252d, 71.7366d});
        mat.put(3, 0, new double[]{41.5493d, 92.3655d});
        mat.put(4, 0, new double[]{70.7299d, 92.2041d});
        this.onExtraCallbackWithResult = mat;
        this.onNavigationEvent = 112.0d;
        this.onWarmupCompleted = new Size(112.0d, 112.0d);
    }

    private final Rect onNavigationEvent(StartAction startAction, Mat mat) {
        int i = 2 % 2;
        int iCoerceIn = RangesKt.coerceIn(startAction.onExtraCallback(), 0, mat.width());
        int iCoerceIn2 = RangesKt.coerceIn(startAction.onNavigationEvent(), 0, mat.height());
        Rect rect = new Rect(iCoerceIn, iCoerceIn2, RangesKt.coerceIn(startAction.onExtraCallback() + startAction.asInterface(), 0, mat.width()) - iCoerceIn, RangesKt.coerceIn(startAction.onNavigationEvent() + startAction.IAuthTabCallback(), 0, mat.height()) - iCoerceIn2);
        int i2 = IAuthTabCallbackStub + 41;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return rect;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Mat onExtraCallback(@NotNull Mat mat, @NotNull StartAction startAction, @NotNull StartClientBundle startClientBundle) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(mat, "");
        Intrinsics.checkNotNullParameter(startAction, "");
        Intrinsics.checkNotNullParameter(startClientBundle, "");
        Mat mat2 = new Mat(mat, onNavigationEvent(startAction, mat));
        Mat matClone = mat2.clone();
        mat2.release();
        if (startClientBundle.onExtraCallbackWithResult() == startAction.IAuthTabCallback()) {
            int i2 = IAuthTabCallbackStub + 61;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            if (startClientBundle.onExtraCallback() != startAction.asInterface()) {
                Imgproc.resize(matClone, matClone, new Size(startClientBundle.onExtraCallback(), startClientBundle.onExtraCallbackWithResult()));
            }
        }
        Intrinsics.checkNotNull(matClone);
        int i4 = IAuthTabCallbackStub + 53;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return matClone;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0200  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Mat onExtraCallback(Mat mat, Mat mat2) throws Throwable {
        Mat mat3;
        Mat mat4;
        Mat matZeros;
        Mat matT;
        Mat mat5;
        Mat mat6;
        Mat mat7;
        Mat mat8;
        Mat mat9;
        Mat mat10;
        Mat mat11;
        int i = 2;
        int i2 = 2 % 2;
        if (mat.rows() != mat2.rows() || mat.cols() != 2 || mat2.cols() != 2) {
            Object[] objArr = new Object[1];
            b(new int[]{-1750495426, -1709441835, 848997133, 495977358, 679928560, 971599830, 1929308406, 2013210310, 1906585436, -1023131961, -2136633427, 7532327, -1440224794, -130041837}, TextUtils.indexOf((CharSequence) "", '0') + 29, objArr);
            throw new IllegalArgumentException(((String) objArr[0]).intern());
        }
        int i3 = IAuthTabCallbackStub + 107;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        int iRows = mat.rows();
        if (iRows < 2) {
            Object[] objArr2 = new Object[1];
            b(new int[]{-896066188, 1556871087, -763758122, -571157845, 1501245543, 859568113, 1390856419, -1414319522, 218076428, -2140856189, -1314474128, -750664612, -1421171099, 147280387, 1057031947, 1975324531, -901498771, -1767703999, 1799881301, 1608700348, -1679772747, 1564302467}, (ViewConfiguration.getPressedStateDuration() >> 16) + 44, objArr2);
            throw new IllegalArgumentException(((String) objArr2[0]).intern());
        }
        Mat mat12 = new Mat();
        Mat mat13 = new Mat();
        mat.convertTo(mat12, 6);
        mat2.convertTo(mat13, 6);
        int i5 = iRows << 1;
        try {
            matZeros = Mat.zeros(i5, 4, 6);
            try {
                Mat matZeros2 = Mat.zeros(i5, 1, 6);
                try {
                    double[] dArr = new double[2];
                    double[] dArr2 = new double[2];
                    int i6 = 0;
                    while (i6 < iRows) {
                        int i7 = IAuthTabCallbackStub + 21;
                        IAuthTabCallbackDefault = i7 % 128;
                        int i8 = i7 % i;
                        mat12.get(i6, 0, dArr);
                        mat13.get(i6, 0, dArr2);
                        double d = dArr[0];
                        Mat mat14 = matZeros2;
                        try {
                            double d2 = dArr[1];
                            double d3 = dArr2[0];
                            double d4 = dArr2[1];
                            int i9 = i6 << 1;
                            try {
                                matZeros.put(i9, 0, new double[]{d});
                                mat3 = mat12;
                                try {
                                } catch (Throwable th) {
                                    th = th;
                                }
                                try {
                                    matZeros.put(i9, 1, new double[]{-d2});
                                    matZeros.put(i9, 2, new double[]{1.0d});
                                    matZeros.put(i9, 3, new double[]{0.0d});
                                    mat9 = mat14;
                                    try {
                                        mat9.put(i9, 0, new double[]{d3});
                                        int i10 = i9 + 1;
                                        matZeros.put(i10, 0, new double[]{d2});
                                        matZeros.put(i10, 1, new double[]{d});
                                        matZeros.put(i10, 2, new double[]{0.0d});
                                        matZeros.put(i10, 3, new double[]{1.0d});
                                        mat9.put(i10, 0, new double[]{d4});
                                        i6++;
                                        int i11 = IAuthTabCallbackDefault + 25;
                                        IAuthTabCallbackStub = i11 % 128;
                                        int i12 = i11 % 2;
                                        matZeros2 = mat9;
                                        mat12 = mat3;
                                        i = 2;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        mat4 = null;
                                        matT = null;
                                        mat5 = mat9;
                                        mat8 = mat4;
                                        mat7 = mat8;
                                        mat6 = mat7;
                                        mat3.release();
                                        mat13.release();
                                        if (matZeros != null) {
                                        }
                                        if (mat5 != null) {
                                        }
                                        if (matT != null) {
                                        }
                                        if (mat7 != null) {
                                        }
                                        if (mat4 != null) {
                                        }
                                        if (mat8 != null) {
                                        }
                                        if (mat6 != null) {
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    mat9 = mat14;
                                    mat4 = null;
                                    matT = null;
                                    mat5 = mat9;
                                    mat8 = mat4;
                                    mat7 = mat8;
                                    mat6 = mat7;
                                    mat3.release();
                                    mat13.release();
                                    if (matZeros != null) {
                                    }
                                    if (mat5 != null) {
                                    }
                                    if (matT != null) {
                                    }
                                    if (mat7 != null) {
                                    }
                                    if (mat4 != null) {
                                    }
                                    if (mat8 != null) {
                                    }
                                    if (mat6 != null) {
                                    }
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                mat3 = mat12;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            mat3 = mat12;
                        }
                    }
                    mat3 = mat12;
                    mat9 = matZeros2;
                    matT = matZeros.t();
                    try {
                        Mat mat15 = new Mat();
                        try {
                            Mat mat16 = new Mat();
                            try {
                                Core.gemm(matT, matZeros, 1.0d, mat16, 0.0d, mat15);
                                mat11 = new Mat();
                                try {
                                    Core.gemm(matT, mat9, 1.0d, mat16, 0.0d, mat11);
                                    mat6 = new Mat();
                                    try {
                                        if (!Core.solve(mat15, mat11, mat6, 1)) {
                                            Object[] objArr3 = new Object[1];
                                            b(new int[]{1693722555, -2125942115, -484106580, -1016651689, -2033918292, 285764418, 1548928131, 1650372691, -1772441730, 585319873, -1290607031, -620397250, 213660783, 1687250833, -255768439, 372061673, 236726303, -140239479}, (ViewConfiguration.getLongPressTimeout() >> 16) + 36, objArr3);
                                            throw new RuntimeException(((String) objArr3[0]).intern());
                                        }
                                        double d5 = mat6.get(0, 0)[0];
                                        double d6 = mat6.get(1, 0)[0];
                                        double d7 = mat6.get(2, 0)[0];
                                        double d8 = mat6.get(3, 0)[0];
                                        Mat mat17 = new Mat(2, 3, 6);
                                        mat17.put(0, 0, new double[]{d5, -d6, d7});
                                        mat17.put(1, 0, new double[]{d6, d5, d8});
                                        mat3.release();
                                        mat13.release();
                                        matZeros.release();
                                        if (mat9 != null) {
                                            mat9.release();
                                        }
                                        if (matT != null) {
                                            int i13 = IAuthTabCallbackDefault + 21;
                                            IAuthTabCallbackStub = i13 % 128;
                                            if (i13 % 2 == 0) {
                                                matT.release();
                                                throw null;
                                            }
                                            matT.release();
                                        }
                                        mat15.release();
                                        mat11.release();
                                        mat16.release();
                                        mat6.release();
                                        return mat17;
                                    } catch (Throwable th6) {
                                        th = th6;
                                        mat4 = mat11;
                                        mat5 = mat9;
                                        mat8 = mat16;
                                        mat7 = mat15;
                                        mat3.release();
                                        mat13.release();
                                        if (matZeros != null) {
                                        }
                                        if (mat5 != null) {
                                        }
                                        if (matT != null) {
                                        }
                                        if (mat7 != null) {
                                        }
                                        if (mat4 != null) {
                                        }
                                        if (mat8 != null) {
                                        }
                                        if (mat6 != null) {
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                    mat10 = null;
                                    mat6 = mat10;
                                    mat4 = mat11;
                                    mat5 = mat9;
                                    mat8 = mat16;
                                    mat7 = mat15;
                                    mat3.release();
                                    mat13.release();
                                    if (matZeros != null) {
                                    }
                                    if (mat5 != null) {
                                    }
                                    if (matT != null) {
                                    }
                                    if (mat7 != null) {
                                    }
                                    if (mat4 != null) {
                                    }
                                    if (mat8 != null) {
                                    }
                                    if (mat6 != null) {
                                    }
                                    throw th;
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                mat10 = null;
                                mat11 = null;
                            }
                        } catch (Throwable th9) {
                            th = th9;
                            mat4 = null;
                            mat6 = null;
                            mat7 = mat15;
                            mat5 = mat9;
                            mat8 = null;
                        }
                    } catch (Throwable th10) {
                        th = th10;
                        mat4 = null;
                        mat5 = mat9;
                        mat8 = mat4;
                        mat7 = mat8;
                        mat6 = mat7;
                        mat3.release();
                        mat13.release();
                        if (matZeros != null) {
                            matZeros.release();
                        }
                        if (mat5 != null) {
                            int i14 = IAuthTabCallbackStub + 13;
                            IAuthTabCallbackDefault = i14 % 128;
                            int i15 = i14 % 2;
                            mat5.release();
                        }
                        if (matT != null) {
                            matT.release();
                        }
                        if (mat7 != null) {
                            int i16 = IAuthTabCallbackStub + 89;
                            IAuthTabCallbackDefault = i16 % 128;
                            int i17 = i16 % 2;
                            mat7.release();
                        }
                        if (mat4 != null) {
                            mat4.release();
                        }
                        if (mat8 != null) {
                            mat8.release();
                        }
                        if (mat6 != null) {
                            mat6.release();
                        }
                        throw th;
                    }
                } catch (Throwable th11) {
                    th = th11;
                    mat3 = mat12;
                    mat9 = matZeros2;
                }
            } catch (Throwable th12) {
                th = th12;
                mat3 = mat12;
                mat4 = null;
                matT = mat4;
                mat5 = matT;
                mat8 = mat4;
                mat7 = mat8;
                mat6 = mat7;
                mat3.release();
                mat13.release();
                if (matZeros != null) {
                }
                if (mat5 != null) {
                }
                if (matT != null) {
                }
                if (mat7 != null) {
                }
                if (mat4 != null) {
                }
                if (mat8 != null) {
                }
                if (mat6 != null) {
                }
                throw th;
            }
        } catch (Throwable th13) {
            th = th13;
            mat3 = mat12;
            mat4 = null;
            matZeros = null;
        }
    }

    private static void b(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = IAuthTabCallback;
        int i4 = -1469660336;
        int i5 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), ((Process.getThreadPriority(0) + 20) >> 6) + 72, Process.getGidForName("") + 8849, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i6] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i6++;
                    i4 = -1469660336;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = IAuthTabCallback;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i7 = $11 + 77;
            $10 = i7 % 128;
            int i8 = 2;
            if (i7 % 2 != 0) {
                int i9 = 2 % 5;
            }
            int i10 = 0;
            while (i10 < length3) {
                int i11 = $10 + 43;
                $11 = i11 % 128;
                int i12 = i11 % i8;
                try {
                    Object[] objArr3 = new Object[1];
                    objArr3[i5] = Integer.valueOf(iArr5[i10]);
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-16777216) - Color.rgb(i5, i5, i5)), 72 - View.MeasureSpec.getSize(i5), 8848 - Color.alpha(i5), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i10] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    i10++;
                    i5 = 0;
                    i8 = 2;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            i2 = i5;
            iArr5 = iArr6;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr5, i2, iArr4, i2, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[i2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            for (int i13 = 0; i13 < 16; i13++) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i13];
                try {
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - (ViewConfiguration.getScrollBarSize() >> 8)), (-16777177) - Color.rgb(0, 0, 0), 10300 - Process.getGidForName(""), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            int i14 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i14;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4033 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 78 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 7398 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
            i2 = 0;
        }
        String str = new String(cArr2, 0, i);
        int i17 = $11 + 55;
        $10 = i17 % 128;
        int i18 = i17 % 2;
        objArr[0] = str;
    }

    public final IAuthTabCallback IAuthTabCallback(@NotNull RgbMatWithDetection rgbMatWithDetection) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(rgbMatWithDetection, "");
        double d = this.onNavigationEvent / 112.0d;
        Mat matIAuthTabCallback = rgbMatWithDetection.IAuthTabCallback();
        isTiny.onWarmupCompleted onwarmupcompletedOnExtraCallbackWithResult = rgbMatWithDetection.onExtraCallbackWithResult();
        Mat mat = new Mat(5, 2, 5);
        mat.put(0, 0, new double[]{onwarmupcompletedOnExtraCallbackWithResult.IAuthTabCallback().onExtraCallbackWithResult().onExtraCallbackWithResult(), onwarmupcompletedOnExtraCallbackWithResult.IAuthTabCallback().onExtraCallbackWithResult().onWarmupCompleted()});
        mat.put(1, 0, new double[]{onwarmupcompletedOnExtraCallbackWithResult.IAuthTabCallback().onNavigationEvent().onExtraCallbackWithResult(), onwarmupcompletedOnExtraCallbackWithResult.IAuthTabCallback().onNavigationEvent().onWarmupCompleted()});
        mat.put(2, 0, new double[]{onwarmupcompletedOnExtraCallbackWithResult.IAuthTabCallback().IAuthTabCallback().onExtraCallbackWithResult(), onwarmupcompletedOnExtraCallbackWithResult.IAuthTabCallback().IAuthTabCallback().onWarmupCompleted()});
        mat.put(3, 0, new double[]{onwarmupcompletedOnExtraCallbackWithResult.IAuthTabCallback().onExtraCallback().onExtraCallbackWithResult(), onwarmupcompletedOnExtraCallbackWithResult.IAuthTabCallback().onExtraCallback().onWarmupCompleted()});
        mat.put(4, 0, new double[]{onwarmupcompletedOnExtraCallbackWithResult.IAuthTabCallback().onWarmupCompleted().onExtraCallbackWithResult(), onwarmupcompletedOnExtraCallbackWithResult.IAuthTabCallback().onWarmupCompleted().onWarmupCompleted()});
        Mat mat2 = new Mat();
        Core.multiply(this.onExtraCallbackWithResult, new Scalar(d, d), mat2);
        Mat matOnExtraCallback = onExtraCallback(mat, mat2);
        Mat mat3 = new Mat();
        Imgproc.warpAffine(matIAuthTabCallback, mat3, matOnExtraCallback, this.onWarmupCompleted);
        Mat mat4 = new Mat();
        mat.convertTo(mat4, 6);
        Mat matOnes = Mat.ones(mat.rows(), 1, 6);
        Mat mat5 = new Mat();
        Core.hconcat(CollectionsKt.listOf(new Mat[]{mat4, matOnes}), mat5);
        Mat mat6 = new Mat();
        Mat mat7 = new Mat();
        Core.gemm(matOnExtraCallback, mat5.t(), 1.0d, mat7, 0.0d, mat6, 0);
        Mat matT = mat6.t();
        MatOfInt matOfInt = new MatOfInt();
        matT.convertTo(matOfInt, 4);
        ActivityAnimBean1 activityAnimBean1 = new ActivityAnimBean1(new getAnimResId((int) matOfInt.get(0, 0)[0], (int) matOfInt.get(0, 1)[0]), new getAnimResId((int) matOfInt.get(1, 0)[0], (int) matOfInt.get(1, 1)[0]), new getAnimResId((int) matOfInt.get(2, 0)[0], (int) matOfInt.get(2, 1)[0]), new getAnimResId((int) matOfInt.get(3, 0)[0], (int) matOfInt.get(3, 1)[0]), new getAnimResId((int) matOfInt.get(4, 0)[0], (int) matOfInt.get(4, 1)[0]));
        matOnes.release();
        mat.release();
        mat4.release();
        mat5.release();
        mat6.release();
        matOfInt.release();
        matT.release();
        mat2.release();
        mat7.release();
        IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(mat3, activityAnimBean1, matOnExtraCallback);
        int i2 = IAuthTabCallbackDefault + 121;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return iAuthTabCallback;
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }

    static {
        byte[] bArr = {25, 43, 92, -56, -9, -2, -2, 7, -19, 20, -19, 0, -9};
        $$a = bArr;
        asBinder = 0;
        onExtraCallback();
        Companion = new onNavigationEvent(null);
        byte b = bArr[11];
        byte b2 = b;
        Object[] objArr = new Object[1];
        a(b2, (byte) (b2 - 1), b, objArr);
        System.loadLibrary((String) objArr[0]);
        int i = onTransact + 19;
        asBinder = i % 128;
        int i2 = i % 2;
    }

    static void onExtraCallback() {
        IAuthTabCallback = new int[]{-1340325391, -229243373, 706981629, -1965501993, -1074545755, -900411409, -1040159247, 553888398, 924389358, 451188919, -1444462943, -410974659, 1974336283, -1508521762, -1526432586, 1341022425, -1231056256, 1816713500};
    }
}
