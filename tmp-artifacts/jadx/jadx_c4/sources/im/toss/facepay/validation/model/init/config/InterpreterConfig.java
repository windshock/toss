package im.toss.facepay.validation.model.init.config;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
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
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class InterpreterConfig {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final Companion Companion;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static long onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final ModelConfig detection;
    private final ModelConfig qcV2;

    static {
        onExtraCallback();
        Companion = new Companion(null);
        int i = onNavigationEvent + 41;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 11 / 0;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public InterpreterConfig() {
        ModelConfig modelConfig = null;
        this(modelConfig, modelConfig, 3, (DefaultConstructorMarker) modelConfig);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 59;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterpreterConfig)) {
            int i5 = i2 + 15;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return false;
            }
            throw null;
        }
        InterpreterConfig interpreterConfig = (InterpreterConfig) obj;
        if (!Intrinsics.areEqual(this.detection, interpreterConfig.detection)) {
            int i6 = onExtraCallback + 5;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.qcV2, interpreterConfig.qcV2)) {
            return true;
        }
        int i8 = onExtraCallback + 83;
        onWarmupCompleted = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.detection.hashCode() * 31) + this.qcV2.hashCode();
        int i4 = onWarmupCompleted + 37;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        ModelConfig modelConfig = this.detection;
        ModelConfig modelConfig2 = this.qcV2;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(new char[]{59709, 49917, 48846, 27300, 18074, 12935, 61036, 55872, 46648, 25102, 24064, 3034, 59343, 54177, 36784, 31636, 22371, 779, 65326, 43828, 34572, 28898, 11469, 6337, 62645, 41108, 40044, 18452}, Color.red(0) + 11239, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(modelConfig);
        Object[] objArr2 = new Object[1];
        a(new char[]{59736, 11897, 26463, 48272, 62870, 2727, 16967}, Color.alpha(0) + 50989, objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(modelConfig2);
        Object[] objArr3 = new Object[1];
        a(new char[]{59741}, 37397 - (Process.myTid() >> 22), objArr3);
        sb.append(((String) objArr3[0]).intern());
        String string = sb.toString();
        int i2 = onWarmupCompleted + 27;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InterpreterConfig> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 37;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            InterpreterConfig$$serializer interpreterConfig$$serializer = InterpreterConfig$$serializer.INSTANCE;
            int i4 = onNavigationEvent + 115;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 23 / 0;
            }
            return interpreterConfig$$serializer;
        }
    }

    public /* synthetic */ InterpreterConfig(int i, ModelConfig modelConfig, ModelConfig modelConfig2, okycx okycxVar) {
        if ((i & 1) == 0) {
            modelConfig = new ModelConfig(1, false);
            int i2 = onWarmupCompleted + 103;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        this.detection = modelConfig;
        if ((i & 2) != 0) {
            this.qcV2 = modelConfig2;
            return;
        }
        this.qcV2 = new ModelConfig(1, false);
        int i5 = onWarmupCompleted + 11;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void IAuthTabCallback(InterpreterConfig interpreterConfig, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0 ? vylVar.onWarmupCompleted(serialDescriptor, 0) : vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            vylVar.onNavigationEvent(serialDescriptor, 0, InterpreterConfig$ModelConfig$$serializer.INSTANCE, interpreterConfig.detection);
            int i3 = onWarmupCompleted + 21;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
        } else if (!Intrinsics.areEqual(interpreterConfig.detection, new ModelConfig(1, false))) {
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 1) || !Intrinsics.areEqual(interpreterConfig.qcV2, new ModelConfig(1, false))) {
            vylVar.onNavigationEvent(serialDescriptor, 1, InterpreterConfig$ModelConfig$$serializer.INSTANCE, interpreterConfig.qcV2);
        }
    }

    public InterpreterConfig(@NotNull ModelConfig modelConfig, @NotNull ModelConfig modelConfig2) {
        Intrinsics.checkNotNullParameter(modelConfig, "");
        Intrinsics.checkNotNullParameter(modelConfig2, "");
        this.detection = modelConfig;
        this.qcV2 = modelConfig2;
    }

    public final ModelConfig IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 119;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        ModelConfig modelConfig = this.detection;
        int i5 = i3 + 119;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return modelConfig;
    }

    public /* synthetic */ InterpreterConfig(ModelConfig modelConfig, ModelConfig modelConfig2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            modelConfig = new ModelConfig(1, false);
            int i2 = onExtraCallback + 71;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        if ((i & 2) != 0) {
            modelConfig2 = new ModelConfig(1, false);
            int i5 = onWarmupCompleted + 91;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
        }
        this(modelConfig, modelConfig2);
    }

    public final ModelConfig onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 5;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        ModelConfig modelConfig = this.qcV2;
        int i4 = i3 + 71;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return modelConfig;
        }
        throw null;
    }

    @liq
    public static final class ModelConfig {
        private static int $10 = 0;
        private static int $11 = 1;
        public static final Companion Companion;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        private static int onNavigationEvent;
        private static long onWarmupCompleted;
        private final boolean gpuEnabled;
        private final int threadCount;

        static {
            onExtraCallbackWithResult();
            Companion = new Companion(null);
            int i = onExtraCallbackWithResult + 33;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ModelConfig() {
            this(0, (boolean) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) null);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ModelConfig)) {
                int i2 = onNavigationEvent + 75;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 11 / 0;
                }
                return false;
            }
            ModelConfig modelConfig = (ModelConfig) obj;
            if (this.threadCount == modelConfig.threadCount) {
                if (this.gpuEnabled == modelConfig.gpuEnabled) {
                    return true;
                }
                int i4 = onNavigationEvent + 89;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return false;
                }
                throw null;
            }
            int i5 = onNavigationEvent;
            int i6 = i5 + 13;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i5 + 93;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 89;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (Integer.hashCode(this.threadCount) * 31) + Boolean.hashCode(this.gpuEnabled);
            int i4 = onExtraCallback + 39;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return iHashCode;
            }
            throw null;
        }

        public String toString() throws Throwable {
            int i = 2 % 2;
            int i2 = this.threadCount;
            boolean z = this.gpuEnabled;
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            a(new char[]{16882, 42803, 35869, 62835, 55903, 50067, 10370, 4580, 30401, 23597, 17670, 43606, 37743, 63568, 57767, 50839, 12270, 5320, 31242, 25353, 18550, 45390, 38473, 65511}, 59107 - View.MeasureSpec.getMode(0), objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(i2);
            Object[] objArr2 = new Object[1];
            a(new char[]{16787, 57384, 694, 42218, 50966, 26985, 35739, 11743, 19557, 61116, 4348, 45830, 54550}, 41399 - Color.alpha(0), objArr2);
            sb.append(((String) objArr2[0]).intern());
            sb.append(z);
            Object[] objArr3 = new Object[1];
            a(new char[]{16790}, 17706 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr3);
            sb.append(((String) objArr3[0]).intern());
            String string = sb.toString();
            int i3 = onExtraCallback + 101;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return string;
        }

        public static final class Companion {
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<ModelConfig> serializer() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 45;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    InterpreterConfig$ModelConfig$$serializer interpreterConfig$ModelConfig$$serializer = InterpreterConfig$ModelConfig$$serializer.INSTANCE;
                    throw null;
                }
                InterpreterConfig$ModelConfig$$serializer interpreterConfig$ModelConfig$$serializer2 = InterpreterConfig$ModelConfig$$serializer.INSTANCE;
                int i3 = onExtraCallback + 57;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                return interpreterConfig$ModelConfig$$serializer2;
            }
        }

        public /* synthetic */ ModelConfig(int i, int i2, boolean z, okycx okycxVar) {
            if ((i & 1) == 0) {
                int i3 = 2 % 2;
                i2 = 1;
            }
            this.threadCount = i2;
            if ((i & 2) != 0) {
                this.gpuEnabled = z;
                int i4 = onExtraCallback + 119;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 41 / 0;
                    return;
                }
                return;
            }
            this.gpuEnabled = false;
            int i6 = onExtraCallback + 83;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final /* synthetic */ void onExtraCallbackWithResult(ModelConfig modelConfig, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 71;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            if (vylVar.onWarmupCompleted(serialDescriptor, 0) || modelConfig.threadCount != 1) {
                vylVar.onExtraCallback(serialDescriptor, 0, modelConfig.threadCount);
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
                int i4 = onNavigationEvent + 63;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                if (modelConfig.gpuEnabled) {
                    vylVar.onNavigationEvent(serialDescriptor, 1, modelConfig.gpuEnabled);
                }
            }
            int i6 = onExtraCallback + 105;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
        }

        public ModelConfig(int i, boolean z) {
            this.threadCount = i;
            this.gpuEnabled = z;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ ModelConfig(int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i2 & 1) != 0) {
                int i3 = onNavigationEvent;
                int i4 = i3 + 47;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 113;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                int i8 = 2 % 2;
                i = 1;
            }
            if ((i2 & 2) != 0) {
                int i9 = onNavigationEvent + 79;
                onExtraCallback = i9 % 128;
                int i10 = i9 % 2;
                z = false;
            }
            this(i, z);
        }

        public final int IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 53;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return this.threadCount;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final boolean onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 97;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            boolean z = this.gpuEnabled;
            int i5 = i2 + 123;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return z;
            }
            Object obj = null;
            obj.hashCode();
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
                int i3 = $10 + 87;
                $11 = i3 % 128;
                int i4 = i3 % 2;
                int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 24, 19627 - (ViewConfiguration.getEdgeSlop() >> 16), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onWarmupCompleted ^ 5407414049857832247L);
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.blue(0), Color.argb(0, 0, 0, 0) + 59, 6382 - ExpandableListView.getPackedPositionChild(0L), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                    int i6 = $11 + 53;
                    $10 = i6 % 128;
                    int i7 = i6 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr2 = new char[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i8 = $11 + 57;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                    Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getLongPressTimeout() >> 16), 59 - (ViewConfiguration.getPressedStateDuration() >> 16), 6383 - (ViewConfiguration.getTouchSlop() >> 8), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    throw null;
                }
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSizeAndState(0, 0, 0), 59 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getFadingEdgeLength() >> 16) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr2);
        }

        static void onExtraCallbackWithResult() {
            onWarmupCompleted = 9163445297467868296L;
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = $10 + 113;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.argb(0, 0, 0, 0), 24 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 19627 - (ViewConfiguration.getWindowTouchSlop() >> 8), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onExtraCallbackWithResult ^ 5407414049857832247L);
                try {
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 58, 6384 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i6 = $10 + 87;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.argb(0, 0, 0, 0), Color.alpha(0) + 59, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i7 = 16 / 0;
            } else {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.makeMeasureSpec(0, 0), Color.alpha(0) + 59, (ViewConfiguration.getJumpTapTimeout() >> 16) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            int i8 = $11 + 75;
            $10 = i8 % 128;
            int i9 = i8 % 2;
        }
        objArr[0] = new String(cArr2);
    }

    static void onExtraCallback() {
        onExtraCallbackWithResult = 7855137700009045059L;
    }
}
