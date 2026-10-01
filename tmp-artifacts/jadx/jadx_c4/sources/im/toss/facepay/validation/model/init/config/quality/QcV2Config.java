package im.toss.facepay.validation.model.init.config.quality;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tmoney.LiveCheckConstants;
import im.toss.features.payment.ui.setting.viewmodel.OfflinePayAuthSkipSettingViewModel;
import java.lang.reflect.Method;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class QcV2Config {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final Companion Companion;
    private static char IAuthTabCallback = 0;
    private static int IAuthTabCallbackStub = 1;
    private static char[] onExtraCallback = null;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onTransact;
    private static long onWarmupCompleted;
    private final float closedEyes;
    private final float mask;
    private final float neutralExpression;
    private final float occlusion;
    private final double pitch;
    private final float qualityScore;
    private final double roll;
    private final float sunglasses;
    private final double yaw;

    static {
        IAuthTabCallbackStub();
        Companion = new Companion(null);
        int i = onExtraCallbackWithResult + 113;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            int i2 = 71 / 0;
        }
    }

    public QcV2Config() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0d, 0.0d, 0.0d, 0.0f, 511, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~((~i3) | i4);
        int i8 = ~((~i4) | i2);
        int i9 = i8 | i7;
        int i10 = i8 | (~((~i2) | i4));
        int i11 = i4 + i2 + i6 + (762724209 * i5) + (1201824936 * i);
        int i12 = i11 * i11;
        int i13 = ((-126223985) * i4) + 43253760 + (1339426419 * i2) + ((-1465650404) * i7) + (1465650404 * i9) + (1414658446 * i10) + ((-1540882432) * i6) + (1302855680 * i5) + (1514143744 * i) + (1905524736 * i12);
        int i14 = ((i4 * 162561953) - 555857873) + (i2 * 162559997) + (i7 * 1956) + (i9 * (-1956)) + (i10 * 978) + (i6 * 162560975) + (i5 * 701011807) + (i * 237771736) + (i12 * (-223608832));
        return i13 + ((i14 * i14) * 703332352) != 1 ? onExtraCallback(objArr) : onExtraCallbackWithResult(objArr);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallbackStub + 55;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof QcV2Config)) {
            int i4 = onTransact + 23;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        QcV2Config qcV2Config = (QcV2Config) obj;
        if (Float.compare(this.closedEyes, qcV2Config.closedEyes) != 0 || Float.compare(this.occlusion, qcV2Config.occlusion) != 0) {
            return false;
        }
        Object obj2 = null;
        if (Float.compare(this.mask, qcV2Config.mask) != 0) {
            int i6 = IAuthTabCallbackStub + 29;
            onTransact = i6 % 128;
            if (i6 % 2 == 0) {
                return false;
            }
            obj2.hashCode();
            throw null;
        }
        if (Float.compare(this.sunglasses, qcV2Config.sunglasses) != 0 || Float.compare(this.neutralExpression, qcV2Config.neutralExpression) != 0) {
            return false;
        }
        if (Double.compare(this.yaw, qcV2Config.yaw) != 0) {
            int i7 = onTransact + 115;
            IAuthTabCallbackStub = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (Double.compare(this.pitch, qcV2Config.pitch) != 0) {
            int i9 = IAuthTabCallbackStub + 43;
            onTransact = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (Double.compare(this.roll, qcV2Config.roll) != 0) {
            int i11 = IAuthTabCallbackStub + 81;
            onTransact = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }
        if (Float.compare(this.qualityScore, qcV2Config.qualityScore) == 0) {
            return true;
        }
        int i13 = IAuthTabCallbackStub + 91;
        onTransact = i13 % 128;
        if (i13 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 13;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((((((Float.hashCode(this.closedEyes) * 31) + Float.hashCode(this.occlusion)) * 31) + Float.hashCode(this.mask)) * 31) + Float.hashCode(this.sunglasses)) * 31) + Float.hashCode(this.neutralExpression)) * 31) + Double.hashCode(this.yaw)) * 31) + Double.hashCode(this.pitch)) * 31) + Double.hashCode(this.roll)) * 31) + Float.hashCode(this.qualityScore);
        int i4 = IAuthTabCallbackStub + 73;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        float f = this.closedEyes;
        float f2 = this.occlusion;
        float f3 = this.mask;
        float f4 = this.sunglasses;
        float f5 = this.neutralExpression;
        double d = this.yaw;
        double d2 = this.pitch;
        double d3 = this.roll;
        float f6 = this.qualityScore;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(new char[]{55104, 55057, 30702, 7723, 1553, 54539, 31508, 18388, 29083, 3706, 32667, 39160, 39449, 43162, 9797, 61781, 9444, 17194, 49526, 19403, 19780, 6760, 27588, 44067, 38859, 46216}, ViewConfiguration.getKeyRepeatTimeout() >> 16, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(f);
        Object[] objArr2 = new Object[1];
        a(new char[]{52520, 52484, 41099, 51469, 6644, 51927, 31528, 18361, 27603, 55647, 24677, 39121, 32881, 32692, 14822, 61751}, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(f2);
        Object[] objArr3 = new Object[1];
        b((byte) (97 - View.getDefaultSize(0, 0)), 8 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), new char[]{'\f', 0, 2, 0, 16, '\n', 13832}, objArr3);
        sb.append(((String) objArr3[0]).intern());
        sb.append(f3);
        Object[] objArr4 = new Object[1];
        b((byte) (109 - TextUtils.indexOf((CharSequence) "", '0', 0)), 12 - ImageFormat.getBitsPerPixel(0), new char[]{'\f', 0, 16, 15, 17, 23, 24, 3, 13911, 13911, 5, 16, 13845}, objArr4);
        sb.append(((String) objArr4[0]).intern());
        sb.append(f4);
        Object[] objArr5 = new Object[1];
        a(new char[]{5535, 5555, 20588, 14826, 15116, 59438, 38638, 43641, 45938, 10656, 17050, 29957, 22723, 36729, 6920, 7356, 58917, 25825, 64619, 42535, 36758, 15747, 22222, 16769}, TextUtils.getCapsMode("", 0, 0), objArr5);
        sb.append(((String) objArr5[0]).intern());
        sb.append(f5);
        Object[] objArr6 = new Object[1];
        b((byte) (80 - (KeyEvent.getMaxKeyCode() >> 16)), Gravity.getAbsoluteGravity(0, 0) + 6, new char[]{'\f', 0, 19, '\t', 1, 15}, objArr6);
        sb.append(((String) objArr6[0]).intern());
        sb.append(d);
        Object[] objArr7 = new Object[1];
        b((byte) (36 - View.getDefaultSize(0, 0)), Color.rgb(0, 0, 0) + 16777224, new char[]{'\f', 0, 0, 23, 6, 23, 11, 18}, objArr7);
        sb.append(((String) objArr7[0]).intern());
        sb.append(d2);
        Object[] objArr8 = new Object[1];
        b((byte) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 66), (ViewConfiguration.getLongPressTimeout() >> 16) + 7, new char[]{'\f', 0, 4, 14, 13880, 13880, 13801}, objArr8);
        sb.append(((String) objArr8[0]).intern());
        sb.append(d3);
        Object[] objArr9 = new Object[1];
        b((byte) (Color.argb(0, 0, 0, 0) + 21), 14 - MotionEvent.axisFromString(""), new char[]{'\f', 0, '\t', 17, 3, 24, 23, 5, '\n', '\t', 24, 6, 21, '\t', 13756}, objArr9);
        sb.append(((String) objArr9[0]).intern());
        sb.append(f6);
        Object[] objArr10 = new Object[1];
        a(new char[]{12238, 12263, 41090, 60049, 58483}, TextUtils.indexOf("", ""), objArr10);
        sb.append(((String) objArr10[0]).intern());
        String string = sb.toString();
        int i2 = onTransact + 47;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return string;
        }
        throw null;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<QcV2Config> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 21;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            QcV2Config$$serializer qcV2Config$$serializer = QcV2Config$$serializer.INSTANCE;
            int i4 = onExtraCallbackWithResult + 49;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return qcV2Config$$serializer;
            }
            throw null;
        }
    }

    public /* synthetic */ QcV2Config(int i, float f, float f2, float f3, float f4, float f5, double d, double d2, double d3, float f6, okycx okycxVar) {
        this.closedEyes = (i & 1) == 0 ? 0.539f : f;
        if ((i & 2) == 0) {
            this.occlusion = 0.5f;
            int i2 = 2 % 2;
        } else {
            this.occlusion = f2;
        }
        Object obj = null;
        if ((i & 4) == 0) {
            int i3 = IAuthTabCallbackStub + 39;
            onTransact = i3 % 128;
            f3 = 0.2f;
            if (i3 % 2 != 0) {
                this.mask = 0.2f;
                obj.hashCode();
                throw null;
            }
        }
        this.mask = f3;
        if ((i & 8) == 0) {
            this.sunglasses = 0.122f;
        } else {
            this.sunglasses = f4;
        }
        if ((i & 16) == 0) {
            int i4 = IAuthTabCallbackStub + 69;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            this.neutralExpression = -3.4028235E38f;
            if (i5 != 0) {
                int i6 = 96 / 0;
            }
            int i7 = 2 % 2;
        } else {
            this.neutralExpression = f5;
        }
        if ((i & 32) == 0) {
            int i8 = IAuthTabCallbackStub + 19;
            onTransact = i8 % 128;
            int i9 = i8 % 2;
            this.yaw = 15.0d;
            if (i9 != 0) {
                throw null;
            }
        } else {
            this.yaw = d;
        }
        if ((i & 64) == 0) {
            this.pitch = 20.0d;
        } else {
            this.pitch = d2;
        }
        int i10 = 2 % 2;
        if ((i & 128) == 0) {
            this.roll = 15.0d;
        } else {
            this.roll = d3;
        }
        if ((i & 256) != 0) {
            this.qualityScore = f6;
            return;
        }
        int i11 = onTransact + 53;
        IAuthTabCallbackStub = i11 % 128;
        int i12 = i11 % 2;
        this.qualityScore = -3.4028235E38f;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        QcV2Config qcV2Config = (QcV2Config) objArr[0];
        vyl vylVar = (vyl) objArr[1];
        SerialDescriptor serialDescriptor = (SerialDescriptor) objArr[2];
        int i = 2 % 2;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0) || Float.compare(qcV2Config.closedEyes, 0.539f) != 0) {
            vylVar.onExtraCallback(serialDescriptor, 0, qcV2Config.closedEyes);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            int i2 = IAuthTabCallbackStub + 3;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            if (Float.compare(qcV2Config.occlusion, 0.5f) != 0) {
                vylVar.onExtraCallback(serialDescriptor, 1, qcV2Config.occlusion);
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
            int i4 = IAuthTabCallbackStub + 79;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            if (Float.compare(qcV2Config.mask, 0.2f) != 0) {
                vylVar.onExtraCallback(serialDescriptor, 2, qcV2Config.mask);
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 3) || Float.compare(qcV2Config.sunglasses, 0.122f) != 0) {
            vylVar.onExtraCallback(serialDescriptor, 3, qcV2Config.sunglasses);
        }
        Object obj = null;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 4)) {
            int i6 = onTransact + 67;
            IAuthTabCallbackStub = i6 % 128;
            if (i6 % 2 == 0) {
                Float.compare(qcV2Config.neutralExpression, -3.4028235E38f);
                obj.hashCode();
                throw null;
            }
            if (Float.compare(qcV2Config.neutralExpression, -3.4028235E38f) != 0) {
                vylVar.onExtraCallback(serialDescriptor, 4, qcV2Config.neutralExpression);
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 5) || Double.compare(qcV2Config.yaw, 15.0d) != 0) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 5, qcV2Config.yaw);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 6) || Double.compare(qcV2Config.pitch, 20.0d) != 0) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 6, qcV2Config.pitch);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 7)) {
            int i7 = IAuthTabCallbackStub + 49;
            onTransact = i7 % 128;
            int i8 = i7 % 2;
            if (Double.compare(qcV2Config.roll, 15.0d) != 0) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 7, qcV2Config.roll);
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 8) || Float.compare(qcV2Config.qualityScore, -3.4028235E38f) != 0) {
            vylVar.onExtraCallback(serialDescriptor, 8, qcV2Config.qualityScore);
        }
        return null;
    }

    public QcV2Config(float f, float f2, float f3, float f4, float f5, double d, double d2, double d3, float f6) {
        this.closedEyes = f;
        this.occlusion = f2;
        this.mask = f3;
        this.sunglasses = f4;
        this.neutralExpression = f5;
        this.yaw = d;
        this.pitch = d2;
        this.roll = d3;
        this.qualityScore = f6;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ QcV2Config(float f, float f2, float f3, float f4, float f5, double d, double d2, double d3, float f6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        if ((i & 1) != 0) {
            int i2 = onTransact + 113;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i3 = 2 % 2;
            f7 = 0.539f;
        } else {
            f7 = f;
        }
        if ((i & 2) != 0) {
            int i4 = onTransact + 27;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            f8 = 0.5f;
        } else {
            f8 = f2;
        }
        if ((i & 4) != 0) {
            int i7 = onTransact + 91;
            IAuthTabCallbackStub = i7 % 128;
            int i8 = i7 % 2;
            f9 = 0.2f;
        } else {
            f9 = f3;
        }
        if ((i & 8) != 0) {
            int i9 = IAuthTabCallbackStub + 57;
            onTransact = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 2 % 2;
            f10 = 0.122f;
        } else {
            f10 = f4;
        }
        float f12 = -3.4028235E38f;
        if ((i & 16) != 0) {
            int i12 = 2 % 2;
            f11 = -3.4028235E38f;
        } else {
            f11 = f5;
        }
        double d4 = 15.0d;
        double d5 = (i & 32) != 0 ? 15.0d : d;
        double d6 = (i & 64) != 0 ? 20.0d : d2;
        if ((i & 128) != 0) {
            int i13 = IAuthTabCallbackStub + 123;
            onTransact = i13 % 128;
            int i14 = i13 % 2;
            int i15 = 2 % 2;
        } else {
            d4 = d3;
        }
        if ((i & 256) != 0) {
            int i16 = IAuthTabCallbackStub + 125;
            onTransact = i16 % 128;
            int i17 = i16 % 2;
        } else {
            f12 = f6;
        }
        this(f7, f8, f9, f10, f11, d5, d6, d4, f12);
    }

    public final float onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 13;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return this.closedEyes;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final float onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 45;
        int i3 = i2 % 128;
        onTransact = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        float f = this.occlusion;
        int i4 = i3 + 123;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return f;
        }
        throw null;
    }

    public final float onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 75;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return this.mask;
        }
        throw null;
    }

    public final float onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 115;
        onTransact = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        float f = this.sunglasses;
        int i4 = i2 + 41;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return f;
        }
        throw null;
    }

    public final float IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 41;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        float f = this.neutralExpression;
        int i4 = i3 + 13;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return f;
    }

    public final double IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 33;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        double d = this.yaw;
        int i5 = i3 + 69;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return d;
        }
        throw null;
    }

    public final double onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 53;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return this.pitch;
        }
        throw null;
    }

    public final double asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 101;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        double d = this.roll;
        int i4 = i2 + 77;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return d;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        QcV2Config qcV2Config = (QcV2Config) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 83;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        float f = qcV2Config.qualityScore;
        int i5 = i2 + 61;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return Float.valueOf(f);
        }
        int i6 = 38 / 0;
        return Float.valueOf(f);
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onWarmupCompleted ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $10 + 59;
        $11 = i3 % 128;
        while (true) {
            int i4 = i3 % 2;
            if (timelineExternalSyntheticLambda0.onNavigationEvent >= cArrOnWarmupCompleted.length) {
                objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
                return;
            }
            int i5 = $10 + 81;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onWarmupCompleted)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (MotionEvent.axisFromString("") + 45813), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 84, 21233 - Color.green(0), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 19 - (Process.myTid() >> 22), 8808 - Gravity.getAbsoluteGravity(0, 0), 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                i3 = $11 + 75;
                $10 = i3 % 128;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
    }

    private static void b(byte b, int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        char c;
        Object obj;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = onExtraCallback;
        char c2 = '0';
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetBefore("", 0), 25 - TextUtils.lastIndexOf("", '0'), 23139 - View.MeasureSpec.getSize(0), -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(IAuthTabCallback)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), 27 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 23139 - KeyEvent.keyCodeFromString(""), -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i5 = $11 + 31;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                i2 = i + 65;
                cArr4[i2] = (char) (cArr[i2] << b);
            } else {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            int i6 = $11 + 23;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    c = c2;
                    obj = obj2;
                } else {
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24824 - ExpandableListView.getPackedPositionType(0L)), ImageFormat.getBitsPerPixel(0) + 75, 8089 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        int i8 = $11 + 93;
                        $10 = i8 % 128;
                        int i9 = i8 % 2;
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                        if (objOnExtraCallback4 == null) {
                            c = '0';
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionType(0L), 30 - TextUtils.getCapsMode("", 0, 0), TextUtils.lastIndexOf("", '0', 0, 0) + 19489, 2013852918, false, LiveCheckConstants.UNLOAD_SERVICE_CANCEL_R0_ACK, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        } else {
                            c = '0';
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                        int i10 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i10];
                    } else {
                        c = '0';
                        obj = null;
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                            int i11 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i12 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i11];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i12];
                        } else {
                            int i13 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i14 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i13];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i14];
                        }
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                c2 = c;
                obj2 = obj;
            }
        }
        int i15 = $10 + 77;
        $11 = i15 % 128;
        int i16 = i15 % 2;
        for (int i17 = 0; i17 < i; i17++) {
            cArr4[i17] = (char) (cArr4[i17] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    @JvmStatic
    public static final /* synthetic */ void IAuthTabCallback(QcV2Config qcV2Config, vyl vylVar, SerialDescriptor serialDescriptor) {
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent3 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), -1896173477, iOnNavigationEvent, 1896173478, new Object[]{qcV2Config, vylVar, serialDescriptor}, iOnNavigationEvent3, iOnNavigationEvent2);
    }

    public final float asInterface() {
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent3 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        return ((Float) onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), 1867840897, iOnNavigationEvent, -1867840897, new Object[]{this}, iOnNavigationEvent3, iOnNavigationEvent2)).floatValue();
    }

    static void IAuthTabCallbackStub() {
        onWarmupCompleted = 7333310348820353706L;
        onExtraCallback = new char[]{64964, 64990, 64915, 64963, 64978, 64992, 64982, 64962, 64967, 64988, 64927, 64984, 64985, 64987, 64970, 64960, 64910, 64977, 64989, 64966, 64986, 64976, 64980, 64991, 64961};
        IAuthTabCallback = (char) 51244;
    }
}
