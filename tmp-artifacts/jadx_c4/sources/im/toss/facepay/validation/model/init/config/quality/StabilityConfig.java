package im.toss.facepay.validation.model.init.config.quality;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.liq;
import o.okycx;
import o.setVideoListener;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class StabilityConfig {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final Companion Companion;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static long onNavigationEvent;
    private static int onWarmupCompleted;
    private final int bufferImageCount;
    private final Double poseStabilityThreshold;
    private final Double positionStabilityThreshold;
    private final double sensitivity;
    private final Double sizeStabilityThreshold;

    static {
        onTransact();
        Companion = new Companion(null);
        int i = onWarmupCompleted + 29;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public StabilityConfig() {
        this((Double) null, (Double) null, (Double) null, 0.0d, 0, 31, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallbackWithResult + 23;
            IAuthTabCallback = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!(obj instanceof StabilityConfig)) {
            int i3 = onExtraCallbackWithResult + 1;
            int i4 = i3 % 128;
            IAuthTabCallback = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 101;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        StabilityConfig stabilityConfig = (StabilityConfig) obj;
        if (!Intrinsics.areEqual(this.positionStabilityThreshold, stabilityConfig.positionStabilityThreshold) || (!Intrinsics.areEqual(this.sizeStabilityThreshold, stabilityConfig.sizeStabilityThreshold))) {
            return false;
        }
        if (!Intrinsics.areEqual(this.poseStabilityThreshold, stabilityConfig.poseStabilityThreshold)) {
            int i7 = onExtraCallbackWithResult + 15;
            IAuthTabCallback = i7 % 128;
            return i7 % 2 != 0;
        }
        if (Double.compare(this.sensitivity, stabilityConfig.sensitivity) != 0) {
            int i8 = onExtraCallbackWithResult + 103;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (this.bufferImageCount == stabilityConfig.bufferImageCount) {
            return true;
        }
        int i10 = IAuthTabCallback + 69;
        onExtraCallbackWithResult = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 123;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Double d = this.positionStabilityThreshold;
        int iHashCode3 = 0;
        if (d == null) {
            iHashCode = 0;
        } else {
            iHashCode = d.hashCode();
            int i4 = onExtraCallbackWithResult + 5;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 / 2;
            }
        }
        Double d2 = this.sizeStabilityThreshold;
        if (d2 == null) {
            int i6 = onExtraCallbackWithResult + 93;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = d2.hashCode();
        }
        Double d3 = this.poseStabilityThreshold;
        if (d3 != null) {
            int i8 = IAuthTabCallback + 99;
            onExtraCallbackWithResult = i8 % 128;
            if (i8 % 2 == 0) {
                d3.hashCode();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            iHashCode3 = d3.hashCode();
        }
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + Double.hashCode(this.sensitivity)) * 31) + Integer.hashCode(this.bufferImageCount);
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        Double d = this.positionStabilityThreshold;
        Double d2 = this.sizeStabilityThreshold;
        Double d3 = this.poseStabilityThreshold;
        double d4 = this.sensitivity;
        int i2 = this.bufferImageCount;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(new char[]{49327, 47097, 11903, 42701, 7505, 38309, 3123, 33951, 31501, 62022, 27385, 57673, 22998, 53288, 18613, 16203, 47004, 11794, 42365, 7670, 37980, 3280, 33573, 31669, 62007, 27265, 57831, 22645, 53449, 18269, 16299, 46631, 11941, 42297, 7574, 38141, 2941, 33754, 31314, 62116, 26936, 57729, 22603}, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 30576, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(d);
        Object[] objArr2 = new Object[1];
        a(new char[]{49360, 17235, 51089, 19000, 52922, 20818, 54773, 22625, 56549, 24729, 58115, 26549, 59937, 28363, 61783, 30153, 63588, 31985, 32919, 786, 34744, 2600, 36570, 4417, 38313}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 33679, objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(d2);
        Object[] objArr3 = new Object[1];
        a(new char[]{49360, 33995, 18594, 3286, 53459, 38122, 22565, 7209, 57381, 42065, 26739, 11373, 61825, 46499, 31175, 15857, 33252, 17673, 2311, 52538, 37208, 21872, 6506, 56969, 41705}, Gravity.getAbsoluteGravity(0, 0) + 17431, objArr3);
        sb.append(((String) objArr3[0]).intern());
        sb.append(d3);
        Object[] objArr4 = new Object[1];
        a(new char[]{49360, 7117, 30381, 20906, 44246, 34778, 58099, 15871, 6173, 29459, 20031, 43315, 33865, 57116}, 56081 - TextUtils.getCapsMode("", 0, 0), objArr4);
        sb.append(((String) objArr4[0]).intern());
        sb.append(d4);
        Object[] objArr5 = new Object[1];
        a(new char[]{49360, 62021, 42412, 22338, 2814, 15463, 61199, 41633, 21629, 2032, 14695, 60424, 40885, 20858, 1229, 13950, 59650, 40097, 19971}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 12952, objArr5);
        sb.append(((String) objArr5[0]).intern());
        sb.append(i2);
        Object[] objArr6 = new Object[1];
        a(new char[]{49365}, 50177 - ExpandableListView.getPackedPositionGroup(0L), objArr6);
        sb.append(((String) objArr6[0]).intern());
        String string = sb.toString();
        int i3 = onExtraCallbackWithResult + 111;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return string;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<StabilityConfig> serializer() {
            StabilityConfig$$serializer stabilityConfig$$serializer;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 51;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                stabilityConfig$$serializer = StabilityConfig$$serializer.INSTANCE;
                int i3 = 26 / 0;
            } else {
                stabilityConfig$$serializer = StabilityConfig$$serializer.INSTANCE;
            }
            int i4 = onNavigationEvent + 5;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return stabilityConfig$$serializer;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005f  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void IAuthTabCallback(StabilityConfig stabilityConfig, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 65;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Double dValueOf = Double.valueOf(0.0d);
        if (vylVar.onWarmupCompleted(serialDescriptor, 0) || !Intrinsics.areEqual(stabilityConfig.positionStabilityThreshold, dValueOf)) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 0, setVideoListener.onWarmupCompleted, stabilityConfig.positionStabilityThreshold);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 1) || !Intrinsics.areEqual(stabilityConfig.sizeStabilityThreshold, dValueOf)) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 1, setVideoListener.onWarmupCompleted, stabilityConfig.sizeStabilityThreshold);
            int i4 = IAuthTabCallback + 107;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
            int i6 = IAuthTabCallback + 7;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            if (!Intrinsics.areEqual(stabilityConfig.poseStabilityThreshold, dValueOf)) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 2, setVideoListener.onWarmupCompleted, stabilityConfig.poseStabilityThreshold);
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 3) || Double.compare(stabilityConfig.sensitivity, 1.0d) != 0) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 3, stabilityConfig.sensitivity);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 4) || stabilityConfig.bufferImageCount != 2) {
            vylVar.onExtraCallback(serialDescriptor, 4, stabilityConfig.bufferImageCount);
        }
    }

    public StabilityConfig(@Nullable Double d, @Nullable Double d2, @Nullable Double d3, double d4, int i) {
        this.positionStabilityThreshold = d;
        this.sizeStabilityThreshold = d2;
        this.poseStabilityThreshold = d3;
        this.sensitivity = d4;
        this.bufferImageCount = i;
    }

    public /* synthetic */ StabilityConfig(int i, Double d, Double d2, Double d3, double d4, int i2, okycx okycxVar) {
        Double dValueOf = Double.valueOf(0.0d);
        if ((i & 1) == 0) {
            this.positionStabilityThreshold = dValueOf;
        } else {
            this.positionStabilityThreshold = d;
        }
        if ((i & 2) == 0) {
            int i3 = onExtraCallbackWithResult + 3;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            this.sizeStabilityThreshold = dValueOf;
            if (i4 != 0) {
                throw null;
            }
        } else {
            this.sizeStabilityThreshold = d2;
        }
        if ((i & 4) == 0) {
            this.poseStabilityThreshold = dValueOf;
        } else {
            this.poseStabilityThreshold = d3;
            int i5 = IAuthTabCallback + 117;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
        }
        if ((i & 8) == 0) {
            this.sensitivity = 1.0d;
        } else {
            this.sensitivity = d4;
            int i7 = IAuthTabCallback + 45;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
        }
        if ((i & 16) == 0) {
            this.bufferImageCount = 2;
        } else {
            this.bufferImageCount = i2;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ StabilityConfig(Double d, Double d2, Double d3, double d4, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        Double d5;
        Double d6;
        double d7;
        Double dValueOf = Double.valueOf(0.0d);
        if ((i2 & 1) != 0) {
            int i3 = IAuthTabCallback + 117;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            d5 = dValueOf;
        } else {
            d5 = d;
        }
        if ((i2 & 2) != 0) {
            int i5 = IAuthTabCallback + 81;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
            d6 = dValueOf;
        } else {
            d6 = d2;
        }
        if ((i2 & 4) != 0) {
            int i6 = 2 % 2;
        } else {
            dValueOf = d3;
        }
        if ((i2 & 8) != 0) {
            int i7 = onExtraCallbackWithResult + 79;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            d7 = 1.0d;
        } else {
            d7 = d4;
        }
        this(d5, d6, dValueOf, d7, (i2 & 16) == 0 ? i : 2);
    }

    public final Double onExtraCallbackWithResult() {
        Double d;
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 97;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            d = this.positionStabilityThreshold;
            int i4 = 27 / 0;
        } else {
            d = this.positionStabilityThreshold;
        }
        int i5 = i2 + 71;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 36 / 0;
        }
        return d;
    }

    public final Double IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 25;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        Double d = this.sizeStabilityThreshold;
        int i5 = i3 + 61;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return d;
    }

    public final Double onNavigationEvent() {
        Double d;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 45;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            d = this.poseStabilityThreshold;
            int i4 = 89 / 0;
        } else {
            d = this.poseStabilityThreshold;
        }
        int i5 = i2 + 45;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return d;
    }

    public final double onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 109;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        double d = this.sensitivity;
        int i5 = i3 + 39;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return d;
    }

    public final int onWarmupCompleted() {
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult;
        int i4 = i3 + 17;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            i = this.bufferImageCount;
            int i5 = 77 / 0;
        } else {
            i = this.bufferImageCount;
        }
        int i6 = i3 + 5;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return i;
        }
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = $11 + 65;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSizeAndState(0, 0, 0), TextUtils.lastIndexOf("", '0') + 25, TextUtils.lastIndexOf("", '0') + 19628, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() - (onNavigationEvent ^ 5407414049857832247L);
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 59 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 6382 - ExpandableListView.getPackedPositionChild(0L), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                Object[] objArr4 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 25 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 19627 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback3).invoke(null, objArr4)).longValue() ^ (onNavigationEvent ^ 5407414049857832247L);
                Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0, 0), 58 - TextUtils.lastIndexOf("", '0'), 6383 - (ViewConfiguration.getWindowTouchSlop() >> 8), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i6 = $10 + 85;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr6 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetAfter("", 0), 59 - Color.argb(0, 0, 0, 0), 6383 - ExpandableListView.getPackedPositionType(0L), -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2);
    }

    static void onTransact() {
        onNavigationEvent = -6704494964714551861L;
    }
}
