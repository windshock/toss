package im.toss.facepay.validation.model.init.config.quality;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.getWriggleLayout;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class GeometricConfig {
    public static final Companion Companion;
    private static int IAuthTabCallback;
    private static long onExtraCallback;
    private static char onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private final double faceBoxMaxWidth;
    private final double faceBoxMinWidth;
    private final float faceDiffRatio;
    private final String imagePadding;
    private static final byte[] $$a = {106, 40, -98, -117};
    private static final int $$b = 47;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onTransact = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int onWarmupCompleted = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, byte b, byte b2) {
        int i2;
        int i3;
        int i4 = (b2 * 4) + 1;
        int i5 = (b * 4) + 4;
        byte[] bArr = $$a;
        int i6 = 110 - i;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i7 = i5;
            i2 = 0;
            int i8 = i5;
            i6 += i7;
            i3 = i8 + 1;
            bArr2[i2] = (byte) i6;
            i2++;
            if (i2 == i4) {
                return new String(bArr2, 0);
            }
            i7 = bArr[i3];
            i8 = i3;
            i6 += i7;
            i3 = i8 + 1;
            bArr2[i2] = (byte) i6;
            i2++;
            if (i2 == i4) {
            }
        } else {
            i2 = 0;
            i3 = i5;
            bArr2[i2] = (byte) i6;
            i2++;
            if (i2 == i4) {
            }
        }
    }

    static {
        onNavigationEvent = 1;
        onNavigationEvent();
        Companion = new Companion(null);
        int i = onWarmupCompleted + 63;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public GeometricConfig() {
        this(0.0d, 0.0d, 0.0f, (String) null, 15, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 59;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GeometricConfig)) {
            return false;
        }
        GeometricConfig geometricConfig = (GeometricConfig) obj;
        if (Double.compare(this.faceBoxMinWidth, geometricConfig.faceBoxMinWidth) == 0) {
            return Double.compare(this.faceBoxMaxWidth, geometricConfig.faceBoxMaxWidth) == 0 && Float.compare(this.faceDiffRatio, geometricConfig.faceDiffRatio) == 0 && Intrinsics.areEqual(this.imagePadding, geometricConfig.imagePadding);
        }
        int i4 = onTransact + 97;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e A[PHI: r1 r3 r4 r5
      0x003e: PHI (r1v12 int) = (r1v4 int), (r1v13 int) binds: [B:8:0x003b, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]
      0x003e: PHI (r3v5 int) = (r3v2 int), (r3v7 int) binds: [B:8:0x003b, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]
      0x003e: PHI (r4v3 int) = (r4v1 int), (r4v5 int) binds: [B:8:0x003b, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]
      0x003e: PHI (r5v1 java.lang.String) = (r5v0 java.lang.String), (r5v2 java.lang.String) binds: [B:8:0x003b, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        String str;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 111;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode4 = 0;
        double d = this.faceBoxMinWidth;
        if (i3 != 0) {
            iHashCode = Double.hashCode(d);
            iHashCode2 = Double.hashCode(this.faceBoxMaxWidth);
            iHashCode3 = Float.hashCode(this.faceDiffRatio);
            str = this.imagePadding;
            int i4 = 51 / 0;
            if (str != null) {
                iHashCode4 = str.hashCode();
            }
        } else {
            iHashCode = Double.hashCode(d);
            iHashCode2 = Double.hashCode(this.faceBoxMaxWidth);
            iHashCode3 = Float.hashCode(this.faceDiffRatio);
            str = this.imagePadding;
            if (str != null) {
            }
        }
        int i5 = (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4;
        int i6 = IAuthTabCallbackDefault + 23;
        onTransact = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        double d = this.faceBoxMinWidth;
        double d2 = this.faceBoxMaxWidth;
        float f = this.faceDiffRatio;
        String str = this.imagePadding;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a((char) (MotionEvent.axisFromString("") + 15769), Color.argb(0, 0, 0, 0), new char[]{61471, 7514, 6277, 33505, 43540, 26045, 5090, 4937, 42201, 20206, 15131, 23818, 16962, 45124, 46410, 37316, 11461, 5668, 8416, 26372, 31575, 56945, 60033, 37902, 12857, 56389, 26073, 10894, 25984, 63768, 4733, 7551}, new char[]{0, 0, 0, 0}, new char[]{41007, 18191, 38924, 22077}, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(d);
        Object[] objArr2 = new Object[1];
        a((char) (TextUtils.indexOf((CharSequence) "", '0') + 39203), ExpandableListView.getPackedPositionGroup(0L), new char[]{21943, 24657, 55594, 30895, 65325, 18247, 38658, 29076, 46944, 32856, 43258, 9405, 34532, 58600, 55268, 42955, 29796, 55419}, new char[]{0, 0, 0, 0}, new char[]{22335, 63398, 8921, 59289}, objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(d2);
        Object[] objArr3 = new Object[1];
        a((char) (View.getDefaultSize(0, 0) + 41184), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), new char[]{23650, 37700, 56546, 45145, 21793, 48452, 50144, 29423, 53770, 1394, 36300, 12265, 52856, 43535, 8736, 20733}, new char[]{0, 0, 0, 0}, new char[]{40391, 24513, 57521, 53152}, objArr3);
        sb.append(((String) objArr3[0]).intern());
        sb.append(f);
        Object[] objArr4 = new Object[1];
        a((char) (16569 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), (-1547675870) - (ViewConfiguration.getMaximumFlingVelocity() >> 16), new char[]{42175, 38424, 15139, 59170, 62493, 52047, 25368, 1410, 63355, 39787, 55215, 47629, 22963, 38067, 45158}, new char[]{0, 0, 0, 0}, new char[]{8939, 49239, 47523, 12096}, objArr4);
        sb.append(((String) objArr4[0]).intern());
        sb.append(str);
        Object[] objArr5 = new Object[1];
        a((char) (TextUtils.lastIndexOf("", '0') + 59753), 39040585 - ExpandableListView.getPackedPositionType(0L), new char[]{27880}, new char[]{0, 0, 0, 0}, new char[]{18864, 21430, 26626, 29161}, objArr5);
        sb.append(((String) objArr5[0]).intern());
        String string = sb.toString();
        int i2 = onTransact + 115;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    public static final class Companion {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GeometricConfig> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 41;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            GeometricConfig$$serializer geometricConfig$$serializer = GeometricConfig$$serializer.INSTANCE;
            int i4 = onExtraCallbackWithResult + 15;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 71 / 0;
            }
            return geometricConfig$$serializer;
        }
    }

    public /* synthetic */ GeometricConfig(int i, double d, double d2, float f, String str, okycx okycxVar) throws Throwable {
        this.faceBoxMinWidth = (i & 1) == 0 ? 185.0d : d;
        if ((i & 2) == 0) {
            this.faceBoxMaxWidth = 544.0d;
        } else {
            this.faceBoxMaxWidth = d2;
            int i2 = IAuthTabCallbackDefault + 109;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 % 2;
            }
        }
        if ((i & 4) == 0) {
            int i4 = onTransact + 15;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            this.faceDiffRatio = 1.5f;
        } else {
            this.faceDiffRatio = f;
        }
        if ((i & 8) != 0) {
            this.imagePadding = str;
            return;
        }
        Object[] objArr = new Object[1];
        a((char) (ViewConfiguration.getPressedStateDuration() >> 16), (-1) - TextUtils.lastIndexOf("", '0', 0, 0), new char[]{11175, 40156, 53976, 17555, 3290, 48038, 38680, 14287, 41593, 1833, 28121, 55833, 3287, 19812, 52878, 30571, 11077, 3210, 58230, 28169, 63417, 58662}, new char[]{0, 0, 0, 0}, new char[]{8134, 11259, 56834, 56098}, objArr);
        this.imagePadding = ((String) objArr[0]).intern();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0095  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void IAuthTabCallback(GeometricConfig geometricConfig, vyl vylVar, SerialDescriptor serialDescriptor) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 43;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        if (!(!vylVar.onWarmupCompleted(serialDescriptor, 0)) || Double.compare(geometricConfig.faceBoxMinWidth, 185.0d) != 0) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 0, geometricConfig.faceBoxMinWidth);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 1) || Double.compare(geometricConfig.faceBoxMaxWidth, 544.0d) != 0) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 1, geometricConfig.faceBoxMaxWidth);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
            int i4 = onTransact + 11;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            if (Float.compare(geometricConfig.faceDiffRatio, 1.5f) != 0) {
                vylVar.onExtraCallback(serialDescriptor, 2, geometricConfig.faceDiffRatio);
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 3)) {
            String str = geometricConfig.imagePadding;
            Object[] objArr = new Object[1];
            a((char) Drawable.resolveOpacity(0, 0), ViewConfiguration.getMinimumFlingVelocity() >> 16, new char[]{11175, 40156, 53976, 17555, 3290, 48038, 38680, 14287, 41593, 1833, 28121, 55833, 3287, 19812, 52878, 30571, 11077, 3210, 58230, 28169, 63417, 58662}, new char[]{0, 0, 0, 0}, new char[]{8134, 11259, 56834, 56098}, objArr);
            if (!Intrinsics.areEqual(str, ((String) objArr[0]).intern())) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, geometricConfig.imagePadding);
            }
        }
        int i6 = IAuthTabCallbackDefault + 59;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
    }

    public GeometricConfig(double d, double d2, float f, @Nullable String str) {
        this.faceBoxMinWidth = d;
        this.faceBoxMaxWidth = d2;
        this.faceDiffRatio = f;
        this.imagePadding = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ GeometricConfig(double d, double d2, float f, String str, int i, DefaultConstructorMarker defaultConstructorMarker) throws Throwable {
        double d3;
        double d4;
        float f2;
        String strIntern;
        if ((i & 1) != 0) {
            int i2 = 2 % 2;
            d3 = 185.0d;
        } else {
            d3 = d;
        }
        if ((i & 2) != 0) {
            int i3 = 2 % 2;
            d4 = 544.0d;
        } else {
            d4 = d2;
        }
        if ((i & 4) != 0) {
            int i4 = onTransact + 97;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            f2 = 1.5f;
        } else {
            f2 = f;
        }
        if ((i & 8) != 0) {
            Object[] objArr = new Object[1];
            a((char) (ViewConfiguration.getLongPressTimeout() >> 16), TextUtils.getOffsetAfter("", 0), new char[]{11175, 40156, 53976, 17555, 3290, 48038, 38680, 14287, 41593, 1833, 28121, 55833, 3287, 19812, 52878, 30571, 11077, 3210, 58230, 28169, 63417, 58662}, new char[]{0, 0, 0, 0}, new char[]{8134, 11259, 56834, 56098}, objArr);
            strIntern = ((String) objArr[0]).intern();
            int i7 = onTransact + 47;
            IAuthTabCallbackDefault = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 2 % 2;
            }
        } else {
            strIntern = str;
        }
        this(d3, d4, f2, strIntern);
    }

    public final double onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 51;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return this.faceBoxMinWidth;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final double onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onTransact + 43;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        double d = this.faceBoxMaxWidth;
        int i5 = i3 + 13;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 72 / 0;
        }
        return d;
    }

    public final float onExtraCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 65;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        float f = this.faceDiffRatio;
        int i5 = i3 + 121;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            return f;
        }
        throw null;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 9;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return this.imagePadding;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        int i4 = 0;
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i5 = $11 + 63;
            $10 = i5 % 128;
            int i6 = i5 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                    int i7 = 44 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    int i8 = 1452 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                    byte b = (byte) i4;
                    byte b2 = b;
                    String str$$c = $$c(b, b2, b2);
                    Class[] clsArr = new Class[1];
                    clsArr[i4] = Object.class;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cKeyCodeFromString, i7, i8, 228868077, false, str$$c, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    char threadPriority = (char) (49123 - ((Process.getThreadPriority(i4) + 20) >> 6));
                    int iKeyCodeFromString = 44 - KeyEvent.keyCodeFromString("");
                    int iIndexOf = TextUtils.indexOf("", "") + 1494;
                    byte b3 = (byte) ($$b & 1);
                    byte b4 = (byte) (b3 - 1);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(threadPriority, iKeyCodeFromString, iIndexOf, 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23971 - TextUtils.lastIndexOf("", '0', 0, 0)), 50 - TextUtils.getCapsMode("", 0, 0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 45848), ExpandableListView.getPackedPositionChild(0L) + 30, 12577 - (ViewConfiguration.getFadingEdgeLength() >> 16), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onExtraCallback ^ 7798559133331975163L)) ^ ((int) (IAuthTabCallback ^ 7798559133331975163L))) ^ ((char) (onExtraCallbackWithResult ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                i2 = 2;
                i4 = 0;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i9 = $10 + 99;
        $11 = i9 % 128;
        if (i9 % 2 != 0) {
            objArr[0] = str;
        } else {
            int i10 = 0 / 0;
            objArr[0] = str;
        }
    }

    static void onNavigationEvent() {
        onExtraCallback = 7798559133331975163L;
        IAuthTabCallback = -251290788;
        onExtraCallbackWithResult = (char) 27643;
    }
}
