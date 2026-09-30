package o;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Size;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tmoney.LiveCheckConstants;
import im.toss.facepay.validation.model.init.config.quality.DetectionConfig;
import im.toss.features.home.ui.dst.view.cardbill.detail.HomeDstCardBillDetailFilterActivity$;
import im.toss.features.mydata.ui.mydataPointGrowth.result.MydataPointGrowthResultScreenKt$;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.Scalar;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class isTiny {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallbackWithResult Companion;
    private static char IAuthTabCallbackDefault;
    private static char[] IAuthTabCallbackStub;
    private static int asBinder;
    private static char asInterface;
    private static char onNavigationEvent;
    private static char onTransact;
    private final putPluginConfig<float[]> IAuthTabCallback;
    private final Scalar onExtraCallback;
    private StartClientBundle onExtraCallbackWithResult;
    private getAnimResId onWarmupCompleted;
    private static final byte[] $$a = {62, 54, 60, 44, 1, -12, 0, 6, 6, -69, 54, -6, 1, 1, -7, 4, 0, 14, -16, -3, 16, -22, 5, 8, -12, 14, 6, -10, 3, -16, -2, -6, -46, 3, -7, 5, -6, -2, -3, 69, -15, 5, -4, 10, -16};
    private static final int $$b = 40;
    private static int access000 = 0;
    private static int getInterfaceDescriptor = 1;
    private static int access100 = 1;

    static final class IAuthTabCallbackStub extends ContinuationImpl {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        double D$0;
        float F$0;
        float F$1;
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallbackStub(access13800<? super IAuthTabCallbackStub> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = ((i2 ^ 78) + ((i2 & 78) << 1)) - 1;
            int i4 = i3 % 128;
            onExtraCallback = i4;
            int i5 = i3 % 2;
            this.result = obj;
            int i6 = this.label;
            if (i5 != 0) {
                int i7 = (Integer.MAX_VALUE & i6) | ((~i6) & Integer.MIN_VALUE);
                int i8 = i6 & Integer.MIN_VALUE;
                this.label = (i8 & i7) | (i7 ^ i8);
                int i9 = 14 / 0;
            } else {
                int i10 = i6 & Integer.MIN_VALUE;
                int i11 = (i6 | Integer.MIN_VALUE) & (~i10);
                this.label = (i11 & i10) | (i11 ^ i10);
            }
            int i12 = i4 & 17;
            int i13 = (((i4 ^ 17) | i12) << 1) - ((i4 | 17) & (~i12));
            onNavigationEvent = i13 % 128;
            if (i13 % 2 != 0) {
                return isTiny.this.IAuthTabCallback((Mat) null, (DetectionConfig) null, (access13800<? super AppTypeEnum<onExtraCallback>>) this);
            }
            int i14 = 97 / 0;
            return isTiny.this.IAuthTabCallback((Mat) null, (DetectionConfig) null, (access13800<? super AppTypeEnum<onExtraCallback>>) this);
        }
    }

    static final class asInterface extends ContinuationImpl {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        asInterface(access13800<? super asInterface> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 85;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            Object obj2 = null;
            this.result = obj;
            if (i4 == 0) {
                obj2.hashCode();
                throw null;
            }
            int i5 = this.label;
            int i6 = i2 + 9;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            this.label = (i5 & Integer.MIN_VALUE) | (i5 ^ Integer.MIN_VALUE);
            Object objOnWarmupCompleted = isTiny.this.onWarmupCompleted(null, this);
            int i8 = onExtraCallback;
            int i9 = ((i8 & 55) - (~(-(-(i8 | 55))))) - 1;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            return objOnWarmupCompleted;
        }
    }

    static {
        asBinder = 0;
        onExtraCallbackWithResult();
        Companion = new onExtraCallbackWithResult(null);
        int i = access100 + 95;
        asBinder = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, byte b, short s, Object[] objArr) {
        int i2;
        int i3 = b * 3;
        byte[] bArr = $$a;
        int i4 = 109 - (s * 4);
        int i5 = 4 - (i * 2);
        byte[] bArr2 = new byte[42 - i3];
        int i6 = 41 - i3;
        if (bArr == null) {
            int i7 = i4;
            int i8 = 0;
            int i9 = i5;
            int i10 = i7 + i5 + 1;
            int i11 = i9 + 1;
            i2 = i8;
            i4 = i10;
            i5 = i11;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i12 = i4;
            i9 = i5;
            i5 = bArr[i5];
            i8 = i2 + 1;
            i7 = i12;
            int i102 = i7 + i5 + 1;
            int i112 = i9 + 1;
            i2 = i8;
            i4 = i102;
            i5 = i112;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
            }
        }
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~((~i4) | i5 | i2);
        int i8 = ~((~i5) | i4);
        int i9 = ~i2;
        int i10 = i8 | (~(i9 | i4));
        int i11 = ~(i9 | i5);
        int i12 = i4 + i5 + i6 + ((-1568348280) * i3) + (1617068012 * i);
        int i13 = i12 * i12;
        int i14 = (((-430874860) * i4) - 739508224) + (1544986862 * i5) + (i7 * 987930861) + ((-987930861) * i10) + (987930861 * i11) + (557056000 * i6) + ((-1885339648) * i3) + (1743781888 * i) + (858456064 * i13);
        int i15 = (i4 * (-973781596)) + 539565670 + (i5 * (-973779706)) + (i7 * 945) + (i10 * (-945)) + (i11 * 945) + (i6 * (-973780651)) + (i3 * 424585256) + (i * 537576796) + (i13 * 1078394880);
        return i14 + ((i15 * i15) * 192741376) != 1 ? onExtraCallback(objArr) : onExtraCallbackWithResult(objArr);
    }

    public isTiny(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.IAuthTabCallback = new putPluginConfig<>(context, new RVMonitor());
        this.onExtraCallback = new Scalar(0.0d, 0.0d, 0.0d);
    }

    public Object onWarmupCompleted(int i, boolean z, @NotNull access13800<? super Unit> access13800Var) {
        int i2 = 2 % 2;
        Size sizeOnWarmupCompleted = isH5.IAuthTabCallback.onWarmupCompleted();
        this.onWarmupCompleted = new getAnimResId(sizeOnWarmupCompleted.getWidth() / 2, sizeOnWarmupCompleted.getHeight() / 2);
        this.onExtraCallbackWithResult = new StartClientBundle(sizeOnWarmupCompleted.getHeight(), sizeOnWarmupCompleted.getWidth());
        putPluginConfig<float[]> putpluginconfig = this.IAuthTabCallback;
        byte b = $$a[6];
        byte b2 = b;
        Object[] objArr = new Object[1];
        b(b, b2, b2, objArr);
        Object objOnNavigationEvent = putpluginconfig.onNavigationEvent((String) objArr[0], i, z, access13800Var);
        if (objOnNavigationEvent != access14300.onWarmupCompleted()) {
            return Unit.INSTANCE;
        }
        int i3 = access000;
        int i4 = i3 + 103;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 9;
        getInterfaceDescriptor = i6 % 128;
        int i7 = i6 % 2;
        return objOnNavigationEvent;
    }

    public static final class onWarmupCompleted {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int asInterface = 1;
        private static long onExtraCallback = -4406380200570791376L;
        private final ActivityAnimBean1 onExtraCallbackWithResult;
        private final float onNavigationEvent;
        private final StartAction onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = asInterface + 117;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            if (i2 % 2 != 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onWarmupCompleted)) {
                int i4 = i3 + 39;
                asInterface = i4 % 128;
                return i4 % 2 == 0;
            }
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) obj;
            if (Intrinsics.areEqual(this.onWarmupCompleted, onwarmupcompleted.onWarmupCompleted)) {
                return Float.compare(this.onNavigationEvent, onwarmupcompleted.onNavigationEvent) == 0 && !(Intrinsics.areEqual(this.onExtraCallbackWithResult, onwarmupcompleted.onExtraCallbackWithResult) ^ true);
            }
            int i5 = IAuthTabCallback + 109;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = asInterface + 79;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.onWarmupCompleted.hashCode();
            return i3 != 0 ? (((iHashCode % 21) - Float.hashCode(this.onNavigationEvent)) * 91) / this.onExtraCallbackWithResult.hashCode() : (((iHashCode * 31) + Float.hashCode(this.onNavigationEvent)) * 31) + this.onExtraCallbackWithResult.hashCode();
        }

        public String toString() throws Throwable {
            int i = 2 % 2;
            StartAction startAction = this.onWarmupCompleted;
            float f = this.onNavigationEvent;
            ActivityAnimBean1 activityAnimBean1 = this.onExtraCallbackWithResult;
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            a(new char[]{24387, 52099, 30385, 57793, 3296, 46870, 8744, 19791, 63585, 25798, 36783, 15043, 42483, 53335}, TextUtils.getOffsetBefore("", 0) + 38113, objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(startAction);
            Object[] objArr2 = new Object[1];
            a(new char[]{24363, 41002, 41326, 41539, 41820, 42036, 42284, 42593}, 65341 - AndroidCharacter.getMirror('0'), objArr2);
            sb.append(((String) objArr2[0]).intern());
            sb.append(f);
            Object[] objArr3 = new Object[1];
            a(new char[]{24363, 28458, 16246, 53061, 40778, 44822, 32550, 3893, 57089, 61190, 49142, 20405}, 12301 - View.resolveSizeAndState(0, 0, 0), objArr3);
            sb.append(((String) objArr3[0]).intern());
            sb.append(activityAnimBean1);
            Object[] objArr4 = new Object[1];
            a(new char[]{24366}, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 3413, objArr4);
            sb.append(((String) objArr4[0]).intern());
            String string = sb.toString();
            int i2 = asInterface + 53;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return string;
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
            int length = cArr.length;
            long[] jArr = new long[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i3 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0') + 1), 24 - (ViewConfiguration.getTapTimeout() >> 16), 19628 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i3] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onExtraCallback ^ 5407414049857832247L);
                    try {
                        Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getMaxKeyCode() >> 16), 58 - MotionEvent.axisFromString(""), Color.alpha(0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback2).invoke(null, objArr3);
                        int i4 = $11 + 27;
                        $10 = i4 % 128;
                        int i5 = i4 % 2;
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
                int i6 = $10 + 89;
                $11 = i6 % 128;
                if (i6 % 2 == 0) {
                    cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                    Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), Color.red(0) + 59, 6384 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    throw null;
                }
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.alpha(0), 59 - (ViewConfiguration.getPressedStateDuration() >> 16), 6383 - ExpandableListView.getPackedPositionGroup(0L), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr2);
        }

        public onWarmupCompleted(@NotNull StartAction startAction, float f, @NotNull ActivityAnimBean1 activityAnimBean1) {
            Intrinsics.checkNotNullParameter(startAction, "");
            Intrinsics.checkNotNullParameter(activityAnimBean1, "");
            this.onWarmupCompleted = startAction;
            this.onNavigationEvent = f;
            this.onExtraCallbackWithResult = activityAnimBean1;
        }

        public final ActivityAnimBean1 IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 55;
            int i3 = i2 % 128;
            asInterface = i3;
            int i4 = i2 % 2;
            ActivityAnimBean1 activityAnimBean1 = this.onExtraCallbackWithResult;
            int i5 = i3 + 91;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return activityAnimBean1;
        }

        public final float onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 107;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                return this.onNavigationEvent;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final StartAction onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 15;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                return this.onWarmupCompleted;
            }
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object IAuthTabCallback(@NotNull Mat mat, @NotNull DetectionConfig detectionConfig, @NotNull access13800<? super AppTypeEnum<onExtraCallback>> access13800Var) throws Throwable {
        IAuthTabCallbackStub iAuthTabCallbackStub;
        Mat matOnExtraCallbackWithResult;
        isTiny istiny;
        IAuthTabCallback iAuthTabCallback;
        float f;
        float f2;
        int i;
        double d;
        int i2 = 2 % 2;
        RVPub rVPub = null;
        if (Class.forName("o.isTiny$IAuthTabCallbackStub").isInstance(access13800Var)) {
            int i3 = getInterfaceDescriptor + 105;
            access000 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = ((IAuthTabCallbackStub) access13800Var).label;
                rVPub.hashCode();
                throw null;
            }
            iAuthTabCallbackStub = (IAuthTabCallbackStub) access13800Var;
            int i5 = iAuthTabCallbackStub.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                iAuthTabCallbackStub.label = i5 - 2147483648;
            } else {
                iAuthTabCallbackStub = new IAuthTabCallbackStub(access13800Var);
            }
        }
        Object obj = iAuthTabCallbackStub.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i6 = iAuthTabCallbackStub.label;
        if (i6 == 0) {
            ResultKt.onNavigationEvent(obj);
            float fOnNavigationEvent = detectionConfig.onNavigationEvent();
            int iIAuthTabCallback = detectionConfig.IAuthTabCallback();
            float fOnWarmupCompleted = detectionConfig.onWarmupCompleted();
            onNavigationEvent onnavigationeventIAuthTabCallback = IAuthTabCallback(mat, this.onWarmupCompleted, this.onExtraCallbackWithResult);
            matOnExtraCallbackWithResult = onnavigationeventIAuthTabCallback.onExtraCallbackWithResult();
            IAuthTabCallback IAuthTabCallback2 = onnavigationeventIAuthTabCallback.IAuthTabCallback();
            double dOnNavigationEvent = onnavigationeventIAuthTabCallback.onNavigationEvent();
            iAuthTabCallbackStub.L$0 = this;
            iAuthTabCallbackStub.L$1 = matOnExtraCallbackWithResult;
            iAuthTabCallbackStub.L$2 = IAuthTabCallback2;
            iAuthTabCallbackStub.F$0 = fOnNavigationEvent;
            iAuthTabCallbackStub.I$0 = iIAuthTabCallback;
            iAuthTabCallbackStub.F$1 = fOnWarmupCompleted;
            iAuthTabCallbackStub.D$0 = dOnNavigationEvent;
            iAuthTabCallbackStub.label = 1;
            Object objOnWarmupCompleted2 = onWarmupCompleted(matOnExtraCallbackWithResult, iAuthTabCallbackStub);
            if (objOnWarmupCompleted2 == objOnWarmupCompleted) {
                int i7 = access000;
                int i8 = i7 + 83;
                getInterfaceDescriptor = i8 % 128;
                if (i8 % 2 == 0) {
                    rVPub.hashCode();
                    throw null;
                }
                int i9 = i7 + 61;
                getInterfaceDescriptor = i9 % 128;
                int i10 = i9 % 2;
                return objOnWarmupCompleted;
            }
            istiny = this;
            iAuthTabCallback = IAuthTabCallback2;
            f = fOnWarmupCompleted;
            obj = objOnWarmupCompleted2;
            f2 = fOnNavigationEvent;
            i = iIAuthTabCallback;
            d = dOnNavigationEvent;
        } else {
            if (i6 != 1) {
                Object[] objArr = new Object[1];
                a(new char[]{64557, 18981, 32484, 27711, 18753, 20187, 32319, 7492, 44281, 12924, 9944, 32574, 15412, 50020, 56217, 13432, 17524, 34095, 46681, 25649, 44275, 31425, 11765, 24476, 55322, 18314, 25334, 37707, 44228, 44129, 56217, 13432, 544, 35351, 6392, 24846, 39328, 3058, 32662, 38890, 63107, 31412, 12294, 21457, 14826, 11711, 60099, 42467}, 47 - (ViewConfiguration.getTouchSlop() >> 8), objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            double d2 = iAuthTabCallbackStub.D$0;
            float f3 = iAuthTabCallbackStub.F$1;
            int i11 = iAuthTabCallbackStub.I$0;
            float f4 = iAuthTabCallbackStub.F$0;
            IAuthTabCallback iAuthTabCallback2 = (IAuthTabCallback) iAuthTabCallbackStub.L$2;
            matOnExtraCallbackWithResult = (Mat) iAuthTabCallbackStub.L$1;
            isTiny istiny2 = (isTiny) iAuthTabCallbackStub.L$0;
            ResultKt.onNavigationEvent(obj);
            i = i11;
            istiny = istiny2;
            f2 = f4;
            d = d2;
            f = f3;
            iAuthTabCallback = iAuthTabCallback2;
        }
        matOnExtraCallbackWithResult.release();
        onExtraCallback onextracallback = new onExtraCallback(istiny.onExtraCallback((float[]) obj, iAuthTabCallback, d, f, f2, i), f2);
        if (onextracallback.onExtraCallback().isEmpty()) {
            int i12 = access000 + 109;
            getInterfaceDescriptor = i12 % 128;
            int i13 = i12 % 2;
            rVPub = RVPub.NO_FACE_IN_IMAGE;
            int i14 = access000 + 51;
            getInterfaceDescriptor = i14 % 128;
            int i15 = i14 % 2;
        }
        AppTypeEnum appTypeEnum = new AppTypeEnum(onextracallback, rVPub);
        int i16 = access000 + 77;
        getInterfaceDescriptor = i16 % 128;
        int i17 = i16 % 2;
        return appTypeEnum;
    }

    public static final class onNavigationEvent {
        private final Mat onExtraCallback;
        private final IAuthTabCallback onExtraCallbackWithResult;
        private final double onWarmupCompleted;
        private static final byte[] $$a = {96, -37, -4, -26};
        private static final int $$b = 201;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int asBinder = 0;
        private static int IAuthTabCallbackStub = 1;
        private static char[] IAuthTabCallback = {60804, 58893, 64231, 52901, 49930, 55276, 43957, 48156, 45311, 33956, 39208, 28136, 24995, 31246, 20194, 17061, 22348, 11238, 16319, 12292, 1263, 6326, 60763, 47490, 45605, 44680, 39630, 38758, 33705, 65485, 59505, 58519, 53440, 52541, 60920, 58975, 64240, 52912, 49931, 55274, 43948, 48156, 45279, 33972, 39195, 28129, 25013, 31302, 60925};
        private static long onNavigationEvent = 2413013972737058431L;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$c(byte b, int i, short s) {
            int i2;
            byte[] bArr = $$a;
            int i3 = (i * 4) + 4;
            int i4 = b * 3;
            int i5 = (s * 4) + 97;
            byte[] bArr2 = new byte[i4 + 1];
            if (bArr == null) {
                int i6 = i4;
                i2 = 0;
                i3++;
                i5 += i6;
                bArr2[i2] = (byte) i5;
                if (i2 == i4) {
                    return new String(bArr2, 0);
                }
                i6 = bArr[i3];
                i2++;
                i3++;
                i5 += i6;
                bArr2[i2] = (byte) i5;
                if (i2 == i4) {
                }
            } else {
                i2 = 0;
                bArr2[i2] = (byte) i5;
                if (i2 == i4) {
                }
            }
        }

        public final IAuthTabCallback IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = asBinder;
            int i3 = i2 + 37;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            IAuthTabCallback iAuthTabCallback = this.onExtraCallbackWithResult;
            int i5 = i2 + 3;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 != 0) {
                return iAuthTabCallback;
            }
            throw null;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 105;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onNavigationEvent)) {
                return false;
            }
            onNavigationEvent onnavigationevent = (onNavigationEvent) obj;
            if (!Intrinsics.areEqual(this.onExtraCallback, onnavigationevent.onExtraCallback)) {
                int i4 = asBinder + 11;
                IAuthTabCallbackStub = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, onnavigationevent.onExtraCallbackWithResult)) {
                int i6 = asBinder + 23;
                IAuthTabCallbackStub = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
            if (Double.compare(this.onWarmupCompleted, onnavigationevent.onWarmupCompleted) == 0) {
                return true;
            }
            int i8 = asBinder + 29;
            IAuthTabCallbackStub = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = asBinder + 57;
            IAuthTabCallbackStub = i2 % 128;
            int iHashCode = i2 % 2 == 0 ? (((this.onExtraCallback.hashCode() * 92) - this.onExtraCallbackWithResult.hashCode()) * 89) << Double.hashCode(this.onWarmupCompleted) : (((this.onExtraCallback.hashCode() * 31) + this.onExtraCallbackWithResult.hashCode()) * 31) + Double.hashCode(this.onWarmupCompleted);
            int i3 = IAuthTabCallbackStub + 115;
            asBinder = i3 % 128;
            if (i3 % 2 == 0) {
                return iHashCode;
            }
            throw null;
        }

        public final Mat onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = asBinder;
            int i3 = i2 + 107;
            IAuthTabCallbackStub = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                throw null;
            }
            Mat mat = this.onExtraCallback;
            int i4 = i2 + 65;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 != 0) {
                return mat;
            }
            obj.hashCode();
            throw null;
        }

        public final double onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub;
            int i3 = i2 + 121;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            double d = this.onWarmupCompleted;
            int i5 = i2 + 69;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            return d;
        }

        public String toString() throws Throwable {
            int i = 2 % 2;
            Mat mat = this.onExtraCallback;
            IAuthTabCallback iAuthTabCallback = this.onExtraCallbackWithResult;
            double d = this.onWarmupCompleted;
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            a((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ViewConfiguration.getPressedStateDuration() >> 16) + 23, (char) (Process.myPid() >> 22), objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(mat);
            Object[] objArr2 = new Object[1];
            a(23 - KeyEvent.normalizeMetaState(0), (-16777205) - Color.rgb(0, 0, 0), (char) (21626 - (Process.myTid() >> 22)), objArr2);
            sb.append(((String) objArr2[0]).intern());
            sb.append(iAuthTabCallback);
            Object[] objArr3 = new Object[1];
            a((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 33, 14 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) View.resolveSize(0, 0), objArr3);
            sb.append(((String) objArr3[0]).intern());
            sb.append(d);
            Object[] objArr4 = new Object[1];
            a(48 - Color.blue(0), 1 - Color.argb(0, 0, 0, 0), (char) Color.alpha(0), objArr4);
            sb.append(((String) objArr4[0]).intern());
            String string = sb.toString();
            int i2 = asBinder + 55;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 98 / 0;
            }
            return string;
        }

        private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
            int i3 = 2 % 2;
            TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
            long[] jArr = new long[i2];
            timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
            while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
                int i4 = $11 + 15;
                $10 = i4 % 128;
                int i5 = i4 % 2;
                int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(IAuthTabCallback[i + i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "", 0) + 59697), 17 - ExpandableListView.getPackedPositionGroup(0L), TextUtils.indexOf("", "", 0, 0) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    try {
                        Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(onNavigationEvent), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46135 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 30 - TextUtils.lastIndexOf("", '0', 0), 20220 - View.resolveSize(0, 0), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i6] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                        try {
                            Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                            if (objOnExtraCallback3 == null) {
                                byte b = (byte) 0;
                                byte b2 = b;
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 44 - View.resolveSizeAndState(0, 0, 0), 1493 - MotionEvent.axisFromString(""), -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objOnExtraCallback3).invoke(null, objArr4);
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
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            char[] cArr = new char[i2];
            timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
            while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
                int i7 = $11 + 107;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), KeyEvent.getDeadChar(0, 0) + 44, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1494, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                int i9 = $11 + 57;
                $10 = i9 % 128;
                int i10 = i9 % 2;
            }
            objArr[0] = new String(cArr);
        }

        public onNavigationEvent(@NotNull Mat mat, @NotNull IAuthTabCallback iAuthTabCallback, double d) {
            Intrinsics.checkNotNullParameter(mat, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            this.onExtraCallback = mat;
            this.onExtraCallbackWithResult = iAuthTabCallback;
            this.onWarmupCompleted = d;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        if (r14 == null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final onNavigationEvent IAuthTabCallback(@NotNull Mat mat, @Nullable getAnimResId getanimresid, @Nullable StartClientBundle startClientBundle) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 47;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(mat, "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(mat, "");
        if (getanimresid == null || startClientBundle != null) {
            if (getanimresid == null) {
                int i3 = getInterfaceDescriptor + 5;
                access000 = i3 % 128;
                int i4 = i3 % 2;
            }
            Pair<Mat, Double> pairIAuthTabCallback = IAuthTabCallback(mat, 256);
            Mat mat2 = (Mat) pairIAuthTabCallback.onExtraCallbackWithResult();
            double dDoubleValue = ((Number) pairIAuthTabCallback.IAuthTabCallback()).doubleValue();
            int iOnExtraCallback = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
            int iOnExtraCallback2 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
            int iOnExtraCallback3 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
            Pair pair = (Pair) onExtraCallback(MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), iOnExtraCallback, new Object[]{this, mat2, 256}, iOnExtraCallback3, 529883954, -529883954, iOnExtraCallback2);
            Mat mat3 = (Mat) pair.onExtraCallbackWithResult();
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) pair.IAuthTabCallback();
            Mat mat4 = new Mat();
            mat3.convertTo(mat4, 5);
            mat3.release();
            mat2.release();
            return new onNavigationEvent(mat4, iAuthTabCallback, dDoubleValue);
        }
        Object[] objArr = new Object[1];
        c(true, new byte[]{0, 1, 1, 0, 1, 1, 0, 1, 0, 0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1}, new int[]{0, 48, 2, 12}, objArr);
        throw new IllegalArgumentException(((String) objArr[0]).intern());
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i4 = 58224;
            int i5 = i3;
            while (i5 < 16) {
                int i6 = $10 + 101;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i8 = (c2 + i4) ^ ((c2 << 4) + ((char) (IAuthTabCallbackDefault ^ 1094535280733222934L)));
                int i9 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(asInterface);
                    objArr2[2] = Integer.valueOf(i9);
                    objArr2[1] = Integer.valueOf(i8);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                        int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 10;
                        int i10 = 12434 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(pressedStateDuration, iKeyCodeFromString, i10, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i4) ^ ((cCharValue << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onTransact)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionType(0L), 11 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 12434 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i4 -= 40503;
                    i5++;
                    int i11 = $10 + 5;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    cArr3 = cArr4;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Gravity.getAbsoluteGravity(0, 0) + 16014), 14 - Color.green(0), Gravity.getAbsoluteGravity(0, 0) + 19901, -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    public static final class IAuthTabCallbackDefault<T> implements Comparator {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ float[] onExtraCallbackWithResult;

        public IAuthTabCallbackDefault(float[] fArr) {
            this.onExtraCallbackWithResult = fArr;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            float[] fArr;
            int i;
            int i2;
            int i3;
            float f;
            float f2;
            int i4 = 2 % 2;
            int i5 = (-2) - ((IAuthTabCallback + 34) ^ (-1));
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                int iIntValue = ((Number) t2).intValue();
                fArr = this.onExtraCallbackWithResult;
                i = iIntValue >> 3;
                i2 = 103;
            } else {
                int iIntValue2 = ((Number) t2).intValue();
                fArr = this.onExtraCallbackWithResult;
                i = iIntValue2 << 4;
                i2 = 15;
            }
            int i6 = onNavigationEvent;
            int i7 = i6 & 11;
            int i8 = ((i6 | 11) & (~i7)) + (i7 << 1);
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
            int i10 = i2 * (-563);
            int i11 = i * 565;
            int i12 = i10 & i11;
            int i13 = ((i10 | i11) & (~i12)) + (i12 << 1);
            int i14 = onNavigationEvent;
            int i15 = (i14 & (-108)) | ((~i14) & 107);
            int i16 = (i14 & 107) << 1;
            int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
            int i18 = i17 % 128;
            IAuthTabCallback = i18;
            int i19 = i17 % 2;
            int i20 = ~i2;
            int i21 = ~i;
            int i22 = ~iIAuthTabCallback;
            int i23 = ~iIAuthTabCallback;
            int i24 = i22 & (i23 | iIAuthTabCallback);
            int i25 = i21 ^ i24;
            int i26 = i21 & i24;
            int i27 = ~((i26 & i25) | (i25 ^ i26));
            int i28 = (i27 & i20) | ((~i27) & i20) | ((~i20) & i27);
            int i29 = (i18 ^ 89) + ((i18 & 89) << 1);
            onNavigationEvent = i29 % 128;
            if (i29 % 2 != 0) {
                int i30 = i & iIAuthTabCallback;
                int i31 = (~i30) & (i | iIAuthTabCallback);
                int i32 = ~((i30 & i31) | (i31 ^ i30));
                int i33 = i28 & i32;
                int i34 = (i28 | i32) & (~i33);
                i3 = i13 >> ((-564) % ((i34 & i33) | (i34 ^ i33)));
            } else {
                int i35 = i & iIAuthTabCallback;
                int i36 = (~i35) & (i | iIAuthTabCallback);
                int i37 = (i35 & i36) | (i36 ^ i35);
                int i38 = (i37 | (~i37)) & (~i37);
                int i39 = ((~i38) & i28) | ((~i28) & i38);
                int i40 = i28 & i38;
                int i41 = ((i40 & i39) | (i39 ^ i40)) * (-564);
                i3 = ((i13 | i41) << 1) - (i13 ^ i41);
            }
            int i42 = ((~i2) | i2) & i20;
            int i43 = i18 & 39;
            int i44 = (((~i43) & (i18 | 39)) - (~(-(-(i43 << 1))))) - 1;
            onNavigationEvent = i44 % 128;
            int i45 = i44 % 2;
            int i46 = i42 ^ i;
            int i47 = i42 & i;
            int i48 = (i47 & i46) | (i46 ^ i47);
            int i49 = (i48 & i23) | ((~i48) & iIAuthTabCallback);
            int i50 = iIAuthTabCallback & i48;
            int i51 = (i50 & i49) | (i49 ^ i50);
            int i52 = -(-(1128 * ((i51 | (~i51)) & (~i51))));
            int i53 = i3 & i52;
            int i54 = i53 + ((i52 ^ i3) | i53);
            int i55 = ((~i2) | i2) & i20;
            int i56 = i18 + 105;
            int i57 = i56 % 128;
            onNavigationEvent = i57;
            if (i56 % 2 != 0) {
                int i58 = (i55 & i23) | (i55 ^ i23);
                int i59 = (i58 | (~i58)) & (~i58);
                int i60 = ~((i & i2) | (i2 ^ i));
                int i61 = ((~i60) & i59) | ((~i59) & i60);
                int i62 = i60 & i59;
                f = fArr[i54 / (((i62 & i61) | (i61 ^ i62)) * 564)];
            } else {
                int i63 = i55 & i23;
                int i64 = (i55 | i23) & (~i63);
                int i65 = ~((i64 & i63) | (i64 ^ i63));
                int i66 = ~((i & i2) | (i2 ^ i));
                int i67 = ((~i66) & i65) | ((~i65) & i66);
                int i68 = i66 & i65;
                f = fArr[(i54 - (~(-(-(((i68 & i67) | (i67 ^ i68)) * 564))))) - 1];
            }
            Number number = (Number) t;
            int i69 = i57 + 13;
            IAuthTabCallback = i69 % 128;
            if (i69 % 2 == 0) {
                f2 = this.onExtraCallbackWithResult[(number.intValue() >> 3) * 125];
            } else {
                int iIntValue3 = (number.intValue() << 4) & 15;
                f2 = this.onExtraCallbackWithResult[(iIntValue3 - (~(-(-((15 ^ r4) | iIntValue3))))) - 1];
            }
            int iIAuthTabCallback2 = getCodeNameBytes.IAuthTabCallback(Float.valueOf(f), Float.valueOf(f2));
            int i70 = IAuthTabCallback + 34;
            int i71 = (i70 ^ (-1)) + (i70 << 1);
            onNavigationEvent = i71 % 128;
            if (i71 % 2 == 0) {
                return iIAuthTabCallback2;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private final Pair<Mat, Double> IAuthTabCallback(Mat mat, int i) {
        int i2 = 2 % 2;
        int i3 = getInterfaceDescriptor + 115;
        access000 = i3 % 128;
        if (i3 % 2 == 0) {
            int iRows = mat.rows();
            int iCols = mat.cols();
            int iMax = Math.max(iRows, iCols);
            if (iMax <= i) {
                Pair<Mat, Double> pair = new Pair<>(mat.clone(), Double.valueOf(1.0d));
                int i4 = access000 + 15;
                getInterfaceDescriptor = i4 % 128;
                int i5 = i4 % 2;
                return pair;
            }
            double d = i / iMax;
            int i6 = (int) (iCols * d);
            Mat mat2 = new Mat();
            Imgproc.resize(mat, mat2, new org.opencv.core.Size(i6, (int) (iRows * d)), 0.0d, 0.0d, 1);
            Pair<Mat, Double> pair2 = new Pair<>(mat2, Double.valueOf(d));
            int i7 = access000 + 55;
            getInterfaceDescriptor = i7 % 128;
            int i8 = i7 % 2;
            return pair2;
        }
        Math.max(mat.rows(), mat.cols());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        isTiny istiny = (isTiny) objArr[0];
        Mat mat = (Mat) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int iRows = mat.rows();
        int iCols = mat.cols();
        int i2 = iIntValue - iRows;
        int i3 = iIntValue - iCols;
        IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(iRows, iCols, i2, i3);
        Mat mat2 = new Mat();
        Core.copyMakeBorder(mat, mat2, 0, i2, 0, i3, 0, istiny.onExtraCallback);
        Pair pair = new Pair(mat2, iAuthTabCallback);
        int i4 = access000 + 29;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return pair;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onExtraCallback {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int asBinder = 1;
        private static int[] onExtraCallbackWithResult = {767519087, -1882139540, -312252781, -1993359573, -1001662179, -250328492, -1648353359, 1324840849, -1553714481, 1410632321, -696492597, -768315679, -1547587669, 1955789111, 906168871, -891172900, 844775502, 1321438683};
        private final float onExtraCallback;
        private final List<onWarmupCompleted> onNavigationEvent;
        private final List<onWarmupCompleted> onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = IAuthTabCallback + 37;
                asBinder = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof onExtraCallback)) {
                return false;
            }
            onExtraCallback onextracallback = (onExtraCallback) obj;
            if (Intrinsics.areEqual(this.onNavigationEvent, onextracallback.onNavigationEvent)) {
                return Float.compare(this.onExtraCallback, onextracallback.onExtraCallback) == 0;
            }
            int i4 = asBinder + 49;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 115;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (this.onNavigationEvent.hashCode() * 31) + Float.hashCode(this.onExtraCallback);
            int i4 = asBinder + 7;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return iHashCode;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() throws Throwable {
            int i = 2 % 2;
            List<onWarmupCompleted> list = this.onNavigationEvent;
            float f = this.onExtraCallback;
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            a(new int[]{-1769355927, 1888592023, 1900880307, -2002243883, -893843721, -2009409321, -1172762555, 1269090140, 347956690, -1222992967, -47244110, 1019379633, -2122446863, 1512455263}, 28 - TextUtils.getTrimmedLength(""), objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(list);
            Object[] objArr2 = new Object[1];
            a(new int[]{-1962359338, -1770543656, -1203457569, 1173460241, -617447834, -1220299967, 833398167, 1654518441, 2044425806, 2035077357}, 17 - TextUtils.indexOf("", "", 0, 0), objArr2);
            sb.append(((String) objArr2[0]).intern());
            sb.append(f);
            Object[] objArr3 = new Object[1];
            a(new int[]{-1427903048, 88410557}, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1, objArr3);
            sb.append(((String) objArr3[0]).intern());
            String string = sb.toString();
            int i2 = IAuthTabCallback + 63;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            return string;
        }

        private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
            int i2;
            int i3 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr2 = onExtraCallbackWithResult;
            long j = 0;
            int i4 = -1469660336;
            int i5 = 0;
            if (iArr2 != null) {
                int i6 = $11 + 39;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                int length = iArr2.length;
                int[] iArr3 = new int[length];
                int i8 = 0;
                while (i8 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i8])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myPid() >> 22), (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)) + 71, 8849 - (SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)), -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr3[i8] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                        i8++;
                        j = 0;
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
            int[] iArr5 = onExtraCallbackWithResult;
            if (iArr5 != null) {
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i9 = $10 + 125;
                $11 = i9 % 128;
                int i10 = 2;
                if (i9 % 2 == 0) {
                    int i11 = 5 % 2;
                }
                int i12 = 0;
                while (i12 < length3) {
                    int i13 = $11 + 65;
                    $10 = i13 % 128;
                    if (i13 % i10 != 0) {
                        Object[] objArr3 = new Object[1];
                        objArr3[i5] = Integer.valueOf(iArr5[i12]);
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.combineMeasuredStates(i5, i5), 72 - View.MeasureSpec.getSize(i5), 8848 - TextUtils.getOffsetBefore("", i5), -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr6[i12] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    } else {
                        try {
                            Object[] objArr4 = {Integer.valueOf(iArr5[i12])};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 72, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 8847, -1725547072, false, "h", new Class[]{Integer.TYPE});
                            }
                            iArr6[i12] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                            i12++;
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    i5 = 0;
                    i10 = 2;
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
                for (int i14 = 0; i14 < 16; i14++) {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i14];
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Gravity.getAbsoluteGravity(0, 0) + 22252), 39 - TextUtils.indexOf("", "", 0, 0), TextUtils.lastIndexOf("", '0') + 10302, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                }
                int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i15;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
                int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
                cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
                cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
                Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ImageFormat.getBitsPerPixel(0) + 4034), 77 - TextUtils.lastIndexOf("", '0', 0), 7398 - TextUtils.getOffsetBefore("", 0), 1888082611, false, "f", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
                i2 = 0;
            }
            objArr[0] = new String(cArr2, 0, i);
        }

        public onExtraCallback(@NotNull List<onWarmupCompleted> list, float f) {
            Intrinsics.checkNotNullParameter(list, "");
            this.onNavigationEvent = list;
            this.onExtraCallback = f;
            ArrayList arrayList = new ArrayList();
            int size = list.size();
            int i = 0;
            while (i < size) {
                int i2 = asBinder + 61;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                onWarmupCompleted onwarmupcompleted = list.get(i);
                if (onwarmupcompleted.onExtraCallbackWithResult() > this.onExtraCallback) {
                    arrayList.add(onwarmupcompleted);
                }
                i++;
                int i4 = 2 % 2;
            }
            this.onWarmupCompleted = arrayList;
            int i5 = asBinder + 65;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }

        public final List<onWarmupCompleted> onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 17;
            int i3 = i2 % 128;
            asBinder = i3;
            int i4 = i2 % 2;
            List<onWarmupCompleted> list = this.onWarmupCompleted;
            int i5 = i3 + 97;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return list;
            }
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onWarmupCompleted(@NotNull Mat mat, @NotNull access13800<? super float[]> access13800Var) throws Throwable {
        asInterface asinterface;
        Mat mat2;
        int i = 2 % 2;
        if (!Class.forName("o.isTiny$asInterface").isInstance(access13800Var)) {
            asinterface = new asInterface(access13800Var);
        } else {
            int i2 = access000 + 5;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            asinterface = (asInterface) access13800Var;
            int i4 = asinterface.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                asinterface.label = i4 - 2147483648;
            }
        }
        Object obj = asinterface.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = asinterface.label;
        if (i5 == 0) {
            ResultKt.onNavigationEvent(obj);
            Mat mat3 = new Mat();
            mat.convertTo(mat3, CvType.CV_32FC3);
            putPluginConfig<float[]> putpluginconfig = this.IAuthTabCallback;
            asinterface.L$0 = mat3;
            asinterface.label = 1;
            Object objOnExtraCallback = putpluginconfig.onExtraCallback(mat3, (access13800<? super float[]>) asinterface);
            if (objOnExtraCallback == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
            obj = objOnExtraCallback;
            mat2 = mat3;
        } else {
            if (i5 != 1) {
                Object[] objArr = new Object[1];
                a(new char[]{64557, 18981, 32484, 27711, 18753, 20187, 32319, 7492, 44281, 12924, 9944, 32574, 15412, 50020, 56217, 13432, 17524, 34095, 46681, 25649, 44275, 31425, 11765, 24476, 55322, 18314, 25334, 37707, 44228, 44129, 56217, 13432, 544, 35351, 6392, 24846, 39328, 3058, 32662, 38890, 63107, 31412, 12294, 21457, 14826, 11711, 60099, 42467}, View.resolveSizeAndState(0, 0, 0) + 47, objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            int i6 = access000 + 55;
            getInterfaceDescriptor = i6 % 128;
            int i7 = i6 % 2;
            mat2 = (Mat) asinterface.L$0;
            ResultKt.onNavigationEvent(obj);
        }
        float[] fArr = (float[]) obj;
        mat2.release();
        return fArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        if ((r9 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        r9 = 26 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        r2 = new java.lang.Object[]{r7, onExtraCallbackWithResult(IAuthTabCallback(r8, r12, r13, r14), r9, r10)};
        r1 = im.toss.features.mydata.ui.mydataPointGrowth.result.MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        r6 = im.toss.features.mydata.ui.mydataPointGrowth.result.MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0063, code lost:
    
        return (java.util.List) onExtraCallback(im.toss.features.mydata.ui.mydataPointGrowth.result.MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), r1, r2, im.toss.features.mydata.ui.mydataPointGrowth.result.MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), 1726958943, -1726958942, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        if (r8.length == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (r8.length == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r8 = kotlin.collections.CollectionsKt.emptyList();
        r9 = o.isTiny.getInterfaceDescriptor + 109;
        o.isTiny.access000 = r9 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<onWarmupCompleted> onExtraCallback(@NotNull float[] fArr, @NotNull IAuthTabCallback iAuthTabCallback, double d, float f, float f2, int i) {
        int i2 = 2 % 2;
        int i3 = access000 + 125;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(fArr, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            int i4 = 24 / 0;
        } else {
            Intrinsics.checkNotNullParameter(fArr, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        }
    }

    private static void c(boolean z, byte[] bArr, int[] iArr, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = IAuthTabCallbackStub;
        if (cArr != null) {
            int i6 = $10 + 103;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i8 = 0; i8 < length; i8++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i8])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - KeyEvent.keyCodeFromString("")), 35 - KeyEvent.getDeadChar(0, 0), TextUtils.indexOf("", "", 0, 0) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bArr != null) {
            char[] cArr4 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                int i9 = $10 + 109;
                $11 = i9 % 128;
                if (i9 % 2 != 0 ? bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 1 : bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 0) {
                    int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.argb(0, 0, 0, 0), TextUtils.lastIndexOf("", '0', 0) + 30, 17657 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i10] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - KeyEvent.normalizeMetaState(0)), 65 - (ViewConfiguration.getScrollDefaultDelay() >> 16), TextUtils.indexOf("", "", 0) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i11] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                    int i12 = $10 + 119;
                    $11 = i12 % 128;
                    int i13 = i12 % 2;
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49466 - Process.getGidForName("")), (ViewConfiguration.getEdgeSlop() >> 16) + 70, 12486 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i14 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i14, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i14);
        }
        if (z) {
            char[] cArr6 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            int i15 = $11 + 3;
            $10 = i15 % 128;
            int i16 = i15 % 2;
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                int i17 = $10 + 85;
                $11 = i17 % 128;
                int i18 = i17 % 2;
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    public static final class IAuthTabCallback {
        private static short[] asInterface;
        private final int IAuthTabCallback;
        private final int onExtraCallbackWithResult;
        private final int onNavigationEvent;
        private final int onWarmupCompleted;
        private static final byte[] $$a = {102, -86, -98, 53};
        private static final int $$b = 13;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onTransact = 0;
        private static int access100 = 1;
        private static int onExtraCallback = -1943698403;
        private static int asBinder = -1538795495;
        private static int IAuthTabCallbackDefault = 2008887937;
        private static byte[] IAuthTabCallbackStub = {10, -63, 4, 9, -10, 12, 21, -23, -14, 12, 73, -77, 4, -25, 25, 25, -28, 11, 25, -14, -35, -4, 24, -13, 26, -8, -14, 12, 65, -4, -13, -63, 4, 9, -10, 12, 21, -20, 11, -7, 88, -4, -14, -35, -4, 24, -13, 26, -5, 11, -7, 88, -4, -8};

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
        /* JADX WARN: Type inference failed for: r8v2, types: [int] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$c(short s, byte b, short s2) {
            int i;
            int i2;
            int i3 = 4 - (s * 3);
            ?? r8 = 115 - (s2 * 2);
            int i4 = b * 2;
            byte[] bArr = $$a;
            byte[] bArr2 = new byte[i4 + 1];
            if (bArr == null) {
                byte b2 = r8;
                i = 0;
                int i5 = i3;
                i3++;
                i2 = i5 + (-b2);
                int i6 = i2;
                int i7 = i3;
                bArr2[i] = (byte) i6;
                if (i == i4) {
                    return new String(bArr2, 0);
                }
                i++;
                b2 = bArr[i7];
                i5 = i6;
                i3 = i7;
                i3++;
                i2 = i5 + (-b2);
                int i62 = i2;
                int i72 = i3;
                bArr2[i] = (byte) i62;
                if (i == i4) {
                }
            } else {
                i = 0;
                i2 = r8;
                int i622 = i2;
                int i722 = i3;
                bArr2[i] = (byte) i622;
                if (i == i4) {
                }
            }
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IAuthTabCallback)) {
                int i2 = access100 + 3;
                int i3 = i2 % 128;
                onTransact = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 75;
                access100 = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) obj;
            if (this.onWarmupCompleted != iAuthTabCallback.onWarmupCompleted) {
                int i7 = access100 + 99;
                onTransact = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 21 / 0;
                }
                return false;
            }
            if (this.onExtraCallbackWithResult != iAuthTabCallback.onExtraCallbackWithResult) {
                return false;
            }
            if (this.onNavigationEvent == iAuthTabCallback.onNavigationEvent) {
                return this.IAuthTabCallback == iAuthTabCallback.IAuthTabCallback;
            }
            int i9 = onTransact + 93;
            access100 = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = access100 + 57;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (((((Integer.hashCode(this.onWarmupCompleted) * 31) + Integer.hashCode(this.onExtraCallbackWithResult)) * 31) + Integer.hashCode(this.onNavigationEvent)) * 31) + Integer.hashCode(this.IAuthTabCallback);
            int i4 = access100 + 101;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() throws Throwable {
            int i = 2 % 2;
            int i2 = this.onWarmupCompleted;
            int i3 = this.onExtraCallbackWithResult;
            int i4 = this.onNavigationEvent;
            int i5 = this.IAuthTabCallback;
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            a((short) TextUtils.getCapsMode("", 0, 0), (byte) TextUtils.indexOf("", "", 0), (-677534742) - ExpandableListView.getPackedPositionChild(0L), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 738530760, (-18) - View.combineMeasuredStates(0, 0), objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(i2);
            Object[] objArr2 = new Object[1];
            a((short) ('0' - AndroidCharacter.getMirror('0')), (byte) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 677534723, 738530722 - Process.getGidForName(""), TextUtils.indexOf((CharSequence) "", '0', 0) - 17, objArr2);
            sb.append(((String) objArr2[0]).intern());
            sb.append(i3);
            Object[] objArr3 = new Object[1];
            a((short) ((-1) - ImageFormat.getBitsPerPixel(0)), (byte) KeyEvent.normalizeMetaState(0), Color.green(0) - 677534711, 738530723 - Drawable.resolveOpacity(0, 0), Process.getGidForName("") - 17, objArr3);
            sb.append(((String) objArr3[0]).intern());
            sb.append(i4);
            Object[] objArr4 = new Object[1];
            a((short) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (byte) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (-677534698) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 738530722 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (-19) - MotionEvent.axisFromString(""), objArr4);
            sb.append(((String) objArr4[0]).intern());
            sb.append(i5);
            Object[] objArr5 = new Object[1];
            a((short) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), (byte) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (-677534688) - (ViewConfiguration.getPressedStateDuration() >> 16), 738530720 - (ViewConfiguration.getTouchSlop() >> 8), (-18) - (ViewConfiguration.getEdgeSlop() >> 16), objArr5);
            sb.append(((String) objArr5[0]).intern());
            String string = sb.toString();
            int i6 = onTransact + 87;
            access100 = i6 % 128;
            int i7 = i6 % 2;
            return string;
        }

        private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
            int i4;
            int length;
            byte[] bArr;
            int i5 = 2 % 2;
            TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(asBinder)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 43425), 42 - TextUtils.indexOf("", ""), 22438 - ImageFormat.getBitsPerPixel(0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                if (iIntValue == -1) {
                    int i6 = $11 + 111;
                    $10 = i6 % 128;
                    int i7 = i6 % 2;
                    i4 = 1;
                } else {
                    int i8 = $10 + 21;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    i4 = 0;
                }
                if (i4 != 0) {
                    int i10 = $10;
                    int i11 = i10 + 109;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    byte[] bArr2 = IAuthTabCallbackStub;
                    long j = -1;
                    if (bArr2 != null) {
                        int length2 = bArr2.length;
                        byte[] bArr3 = new byte[length2];
                        int i13 = i10 + 95;
                        $11 = i13 % 128;
                        int i14 = i13 % 2;
                        int i15 = 0;
                        while (i15 < length2) {
                            Object[] objArr3 = {Integer.valueOf(bArr2[i15])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                char scrollBarFadeDuration = (char) (12843 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                                int scrollDefaultDelay = 55 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                int i16 = 2168 - (SystemClock.currentThreadTimeMillis() > j ? 1 : (SystemClock.currentThreadTimeMillis() == j ? 0 : -1));
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(scrollBarFadeDuration, scrollDefaultDelay, i16, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr3[i15] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                            i15++;
                            j = -1;
                        }
                        bArr2 = bArr3;
                    }
                    if (bArr2 != null) {
                        byte[] bArr4 = IAuthTabCallbackStub;
                        try {
                            Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onExtraCallback)};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 43423), 41 - Process.getGidForName(""), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 22438, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            iIntValue = (byte) (((byte) (bArr4[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (asBinder ^ (-4629411779493505016L))));
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        iIntValue = (short) (((short) (asInterface[i + ((int) (onExtraCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (asBinder ^ (-4629411779493505016L))));
                    }
                }
                if (iIntValue > 0) {
                    int i17 = $10 + 33;
                    $11 = i17 % 128;
                    int i18 = i17 % 2;
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (onExtraCallback ^ (-4629411779493505016L))) + i4;
                    Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(IAuthTabCallbackDefault), sb};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", ""), 86 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 9566 - TextUtils.lastIndexOf("", '0'), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    byte[] bArr5 = IAuthTabCallbackStub;
                    if (bArr5 != null) {
                        int i19 = $10 + 79;
                        $11 = i19 % 128;
                        if (i19 % 2 == 0) {
                            length = bArr5.length;
                            bArr = new byte[length];
                        } else {
                            length = bArr5.length;
                            bArr = new byte[length];
                        }
                        for (int i20 = 0; i20 < length; i20++) {
                            int i21 = $10 + 113;
                            $11 = i21 % 128;
                            int i22 = i21 % 2;
                            bArr[i20] = (byte) (bArr5[i20] ^ (-4629411779493505016L));
                        }
                        bArr5 = bArr;
                    }
                    boolean z = bArr5 != null;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                    while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                        int i23 = $10 + 45;
                        $11 = i23 % 128;
                        if (i23 % 2 == 0) {
                            throw null;
                        }
                        if (z) {
                            byte[] bArr6 = IAuthTabCallbackStub;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                        } else {
                            short[] sArr = asInterface;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                        }
                        sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                    }
                }
                objArr[0] = sb.toString();
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }

        public IAuthTabCallback(int i, int i2, int i3, int i4) {
            this.onWarmupCompleted = i;
            this.onExtraCallbackWithResult = i2;
            this.onNavigationEvent = i3;
            this.IAuthTabCallback = i4;
        }

        public final int onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = access100 + 41;
            int i3 = i2 % 128;
            onTransact = i3;
            int i4 = i2 % 2;
            int i5 = this.onWarmupCompleted;
            int i6 = i3 + 103;
            access100 = i6 % 128;
            if (i6 % 2 != 0) {
                return i5;
            }
            throw null;
        }

        public final int IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = access100 + 55;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                return this.onExtraCallbackWithResult;
            }
            throw null;
        }

        public final int onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onTransact;
            int i3 = i2 + 11;
            access100 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = this.onNavigationEvent;
            int i6 = i2 + 71;
            access100 = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 42 / 0;
            }
            return i5;
        }

        public final int onExtraCallback() {
            int i;
            int i2 = 2 % 2;
            int i3 = access100 + 107;
            int i4 = i3 % 128;
            onTransact = i4;
            if (i3 % 2 != 0) {
                i = this.IAuthTabCallback;
                int i5 = 90 / 0;
            } else {
                i = this.IAuthTabCallback;
            }
            int i6 = i4 + 123;
            access100 = i6 % 128;
            int i7 = i6 % 2;
            return i;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int i = 0;
        isTiny istiny = (isTiny) objArr[0];
        char c = 1;
        List list = (List) objArr[1];
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        ArrayList<float[]> arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            float[] fArr = (float[]) list.get(i3);
            ArrayList arrayList2 = new ArrayList(fArr.length);
            for (float f : fArr) {
                if (!Float.isNaN(f)) {
                    int i4 = access000 + 61;
                    getInterfaceDescriptor = i4 % 128;
                    int i5 = i4 % 2;
                    if (!(!Float.isInfinite(f))) {
                        f = 0.0f;
                    }
                }
                arrayList2.add(Float.valueOf(f));
            }
            arrayList.add(CollectionsKt.toFloatArray(arrayList2));
        }
        ArrayList arrayList3 = new ArrayList();
        for (float[] fArr2 : arrayList) {
            int i6 = (int) fArr2[i];
            int i7 = (int) fArr2[c];
            int i8 = (int) fArr2[2];
            int i9 = (int) fArr2[3];
            if (i6 < i8) {
                int i10 = getInterfaceDescriptor + 53;
                access000 = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 84 / i;
                    if (i7 < i9) {
                        onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(new StartAction(i6, i7, i8 - i6, i9 - i7), fArr2[15], new ActivityAnimBean1(new getAnimResId(istiny.IAuthTabCallback(fArr2[4]), istiny.IAuthTabCallback(fArr2[5])), new getAnimResId(istiny.IAuthTabCallback(fArr2[6]), istiny.IAuthTabCallback(fArr2[7])), new getAnimResId(istiny.IAuthTabCallback(fArr2[8]), istiny.IAuthTabCallback(fArr2[9])), new getAnimResId(istiny.IAuthTabCallback(fArr2[10]), istiny.IAuthTabCallback(fArr2[11])), new getAnimResId(istiny.IAuthTabCallback(fArr2[12]), istiny.IAuthTabCallback(fArr2[13]))));
                        if (istiny.onExtraCallbackWithResult(onwarmupcompleted)) {
                            arrayList3.add(onwarmupcompleted);
                        } else {
                            int i12 = access000 + 89;
                            getInterfaceDescriptor = i12 % 128;
                            if (i12 % 2 == 0) {
                                int i13 = 4 / 4;
                            }
                        }
                    }
                } else if (i7 < i9) {
                }
            }
            i = 0;
            c = 1;
        }
        return arrayList3;
    }

    private final int IAuthTabCallback(float f) {
        int iFloor;
        float fAbs;
        int i = 2 % 2;
        int i2 = access000 + 115;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            iFloor = (int) Math.floor(f);
            fAbs = Math.abs(f / iFloor);
            if (fAbs < 0.5f) {
                return iFloor;
            }
        } else {
            iFloor = (int) Math.floor(f);
            fAbs = Math.abs(f - iFloor);
            if (fAbs < 0.5f) {
                return iFloor;
            }
        }
        if (fAbs <= 0.5f) {
            return iFloor % 2 == 0 ? iFloor : f >= 0.0f ? iFloor + 1 : iFloor - 1;
        }
        if (f >= 0.0f) {
            int i3 = getInterfaceDescriptor + 41;
            access000 = i3 % 128;
            int i4 = i3 % 2;
            return iFloor + 1;
        }
        int i5 = iFloor - 1;
        int i6 = getInterfaceDescriptor + 65;
        access000 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    private final boolean onExtraCallbackWithResult(onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = access000 + 103;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        ActivityAnimBean1 activityAnimBean1IAuthTabCallback = onwarmupcompleted.IAuthTabCallback();
        int iOnExtraCallback = onwarmupcompleted.onWarmupCompleted().onExtraCallback();
        int iOnNavigationEvent = onwarmupcompleted.onWarmupCompleted().onNavigationEvent();
        int iOnExtraCallback2 = onwarmupcompleted.onWarmupCompleted().onExtraCallback() + onwarmupcompleted.onWarmupCompleted().asInterface();
        int iOnNavigationEvent2 = onwarmupcompleted.onWarmupCompleted().onNavigationEvent() + onwarmupcompleted.onWarmupCompleted().IAuthTabCallback();
        int iOnExtraCallbackWithResult = activityAnimBean1IAuthTabCallback.onExtraCallbackWithResult().onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = activityAnimBean1IAuthTabCallback.onNavigationEvent().onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = activityAnimBean1IAuthTabCallback.IAuthTabCallback().onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = activityAnimBean1IAuthTabCallback.onExtraCallback().onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult5 = activityAnimBean1IAuthTabCallback.onWarmupCompleted().onExtraCallbackWithResult();
        int iOnWarmupCompleted = activityAnimBean1IAuthTabCallback.onExtraCallbackWithResult().onWarmupCompleted();
        int iOnWarmupCompleted2 = activityAnimBean1IAuthTabCallback.onNavigationEvent().onWarmupCompleted();
        int iOnWarmupCompleted3 = activityAnimBean1IAuthTabCallback.IAuthTabCallback().onWarmupCompleted();
        int iOnWarmupCompleted4 = activityAnimBean1IAuthTabCallback.onExtraCallback().onWarmupCompleted();
        int iOnWarmupCompleted5 = activityAnimBean1IAuthTabCallback.onWarmupCompleted().onWarmupCompleted();
        if (iOnExtraCallbackWithResult < iOnExtraCallback) {
            return false;
        }
        int i4 = getInterfaceDescriptor + 93;
        int i5 = i4 % 128;
        access000 = i5;
        int i6 = i4 % 2;
        if (iOnExtraCallbackWithResult2 < iOnExtraCallback || iOnExtraCallbackWithResult3 < iOnExtraCallback) {
            return false;
        }
        int i7 = i5 + 61;
        int i8 = i7 % 128;
        getInterfaceDescriptor = i8;
        int i9 = i7 % 2;
        if (iOnExtraCallbackWithResult4 < iOnExtraCallback || iOnExtraCallbackWithResult5 < iOnExtraCallback) {
            return false;
        }
        int i10 = i8 + 15;
        access000 = i10 % 128;
        int i11 = i10 % 2;
        if (iOnExtraCallbackWithResult > iOnExtraCallback2 || iOnExtraCallbackWithResult2 > iOnExtraCallback2 || iOnExtraCallbackWithResult3 > iOnExtraCallback2 || iOnExtraCallbackWithResult4 > iOnExtraCallback2 || iOnExtraCallbackWithResult5 > iOnExtraCallback2) {
            return false;
        }
        int i12 = i8 + 27;
        int i13 = i12 % 128;
        access000 = i13;
        if (i12 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (iOnWarmupCompleted < iOnNavigationEvent || iOnWarmupCompleted2 < iOnNavigationEvent || iOnWarmupCompleted3 < iOnNavigationEvent || iOnWarmupCompleted4 < iOnNavigationEvent || iOnWarmupCompleted5 < iOnNavigationEvent || iOnWarmupCompleted > iOnNavigationEvent2) {
            return false;
        }
        int i14 = i13 + 105;
        int i15 = i14 % 128;
        getInterfaceDescriptor = i15;
        int i16 = i14 % 2;
        if (iOnWarmupCompleted2 > iOnNavigationEvent2) {
            return false;
        }
        int i17 = i15 + 77;
        access000 = i17 % 128;
        int i18 = i17 % 2;
        if (iOnWarmupCompleted3 > iOnNavigationEvent2 || iOnWarmupCompleted4 > iOnNavigationEvent2 || iOnWarmupCompleted5 > iOnNavigationEvent2) {
            return false;
        }
        if (iOnExtraCallbackWithResult2 <= iOnExtraCallbackWithResult) {
            int i19 = i15 + 27;
            access000 = i19 % 128;
            int i20 = i19 % 2;
            return false;
        }
        if (iOnExtraCallbackWithResult3 <= iOnExtraCallbackWithResult) {
            return false;
        }
        if (iOnExtraCallbackWithResult2 > iOnExtraCallbackWithResult3) {
            return iOnWarmupCompleted3 > Math.max(iOnWarmupCompleted2, iOnWarmupCompleted) && iOnWarmupCompleted3 < Math.min(iOnWarmupCompleted4, iOnWarmupCompleted5) && iOnExtraCallbackWithResult5 > iOnExtraCallbackWithResult4;
        }
        int i21 = i15 + 91;
        access000 = i21 % 128;
        int i22 = i21 % 2;
        return false;
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }

    public final List<float[]> onExtraCallbackWithResult(@NotNull List<float[]> list, @NotNull IAuthTabCallback iAuthTabCallback, double d) {
        float[] fArr;
        float[] fArrCopyOf;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        int iOnWarmupCompleted = iAuthTabCallback.onWarmupCompleted();
        int iIAuthTabCallback = iAuthTabCallback.IAuthTabCallback();
        int iOnNavigationEvent = iAuthTabCallback.onNavigationEvent();
        double dOnExtraCallback = (iAuthTabCallback.onExtraCallback() + iIAuthTabCallback) / d;
        double d2 = (iOnNavigationEvent + iOnWarmupCompleted) / d;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i3 = 0;
        while (i3 < size) {
            int i4 = getInterfaceDescriptor + 43;
            access000 = i4 % 128;
            if (i4 % 2 != 0) {
                fArr = list.get(i3);
                fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
                Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "");
                i = 1;
            } else {
                fArr = list.get(i3);
                fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
                Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "");
                i = 0;
            }
            while (i < 14) {
                int i5 = getInterfaceDescriptor + 83;
                access000 = i5 % 128;
                int i6 = i5 % 2;
                fArrCopyOf[i] = (float) (fArr[i] * dOnExtraCallback);
                fArrCopyOf[i + 1] = (float) (fArr[r14] * d2);
                i += 2;
                i3 = i3;
            }
            arrayList.add(fArrCopyOf);
            i3++;
        }
        int i7 = access000 + 63;
        getInterfaceDescriptor = i7 % 128;
        if (i7 % 2 != 0) {
            return arrayList;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<float[]> IAuthTabCallback(@NotNull float[] fArr, float f, float f2, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(fArr, "");
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < fArr.length / 16; i3++) {
            if (fArr[(i3 << 4) + 15] > f2) {
                arrayList.add(Integer.valueOf(i3));
            }
        }
        boolean z = true;
        if (arrayList.size() > 1) {
            CollectionsKt.sortWith(arrayList, new IAuthTabCallbackDefault(fArr));
        }
        ArrayList arrayList2 = new ArrayList();
        float[] fArr2 = new float[arrayList.size()];
        float[] fArr3 = new float[arrayList.size()];
        float[] fArr4 = new float[arrayList.size()];
        float[] fArr5 = new float[arrayList.size()];
        float[] fArr6 = new float[arrayList.size()];
        int i4 = 0;
        while (i4 < arrayList.size()) {
            int i5 = getInterfaceDescriptor + 29;
            access000 = i5 % 128;
            int i6 = i5 % 2;
            int iIntValue = ((Number) arrayList.get(i4)).intValue() << 4;
            fArr2[i4] = fArr[iIntValue];
            fArr3[i4] = fArr[iIntValue + 1];
            fArr4[i4] = fArr[iIntValue + 2];
            float f3 = fArr[iIntValue + 3];
            fArr5[i4] = f3;
            fArr6[i4] = (fArr4[i4] - fArr2[i4]) * (f3 - fArr3[i4]);
            i4++;
            int i7 = access000 + 101;
            getInterfaceDescriptor = i7 % 128;
            int i8 = i7 % 2;
        }
        int size = arrayList.size();
        boolean[] zArr = new boolean[size];
        int i9 = 0;
        while (i9 < size) {
            zArr[i9] = true;
            i9++;
            int i10 = access000 + 51;
            getInterfaceDescriptor = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 3 % 5;
            }
        }
        int i12 = 0;
        while (i12 < arrayList.size()) {
            if (!zArr[i12] || arrayList2.size() >= i) {
                i12++;
                z = z;
                arrayList = arrayList;
                fArr2 = fArr2;
                fArr3 = fArr3;
            } else {
                arrayList2.add(arrayList.get(i12));
                float f4 = fArr2[i12];
                float f5 = fArr3[i12];
                float f6 = fArr4[i12];
                float f7 = fArr5[i12];
                float f8 = fArr6[i12];
                int i13 = i12 + 1;
                while (i13 < arrayList.size()) {
                    if (zArr[i13]) {
                        ArrayList arrayList3 = arrayList;
                        float fMax = Math.max(f4, fArr2[i13]);
                        float[] fArr7 = fArr2;
                        float[] fArr8 = fArr3;
                        float fMax2 = Math.max(0.0f, Math.min(f7, fArr5[i13]) - Math.max(f5, fArr3[i13])) * Math.max(0.0f, Math.min(f6, fArr4[i13]) - fMax);
                        float f9 = (f8 + fArr6[i13]) - fMax2;
                        if ((f9 > 0.0f ? fMax2 / f9 : 0.0f) > f) {
                            int i14 = access000 + 63;
                            getInterfaceDescriptor = i14 % 128;
                            if (i14 % 2 == 0) {
                                zArr[i13] = true;
                            } else {
                                zArr[i13] = false;
                                i13++;
                                arrayList = arrayList3;
                                fArr2 = fArr7;
                                fArr3 = fArr8;
                            }
                        }
                        i13++;
                        arrayList = arrayList3;
                        fArr2 = fArr7;
                        fArr3 = fArr8;
                    } else {
                        int i15 = getInterfaceDescriptor + 125;
                        ArrayList arrayList4 = arrayList;
                        access000 = i15 % 128;
                        i13 = i15 % 2 != 0 ? i13 + 80 : i13 + 1;
                        arrayList = arrayList4;
                    }
                }
                i12 = i13;
                z = true;
            }
        }
        ArrayList arrayList5 = new ArrayList(arrayList2.size());
        int size2 = arrayList2.size();
        int i16 = 0;
        while (i16 < size2) {
            int i17 = access000 + 41;
            getInterfaceDescriptor = i17 % 128;
            if (i17 % 2 == 0) {
                int iIntValue2 = ((Number) arrayList2.get(i16)).intValue() * 2;
                arrayList5.add(ArraysKt.copyOfRange(fArr, iIntValue2, iIntValue2 >> 80));
                i16 += 64;
            } else {
                int iIntValue3 = ((Number) arrayList2.get(i16)).intValue() << 4;
                arrayList5.add(ArraysKt.copyOfRange(fArr, iIntValue3, iIntValue3 + 16));
                i16++;
            }
        }
        return arrayList5;
    }

    private final Pair<Mat, IAuthTabCallback> onNavigationEvent(Mat mat, int i) {
        Object[] objArr = {this, mat, Integer.valueOf(i)};
        int iOnExtraCallback = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        int iOnExtraCallback2 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        return (Pair) onExtraCallback(MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), iOnExtraCallback, objArr, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), 529883954, -529883954, iOnExtraCallback2);
    }

    public final List<onWarmupCompleted> onExtraCallback(@NotNull List<float[]> list) {
        int iOnExtraCallback = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        int iOnExtraCallback2 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        int iOnExtraCallback3 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        return (List) onExtraCallback(MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), iOnExtraCallback, new Object[]{this, list}, iOnExtraCallback3, 1726958943, -1726958942, iOnExtraCallback2);
    }

    static void onExtraCallbackWithResult() {
        onNavigationEvent = (char) 13664;
        onTransact = (char) 12486;
        IAuthTabCallbackDefault = (char) 53626;
        asInterface = (char) 64625;
        IAuthTabCallbackStub = new char[]{27231, 27248, 27156, 27177, 27171, 27168, 27197, 27173, 27160, 27158, 27168, 27196, 27195, 27197, 27198, 27143, 27141, 27196, 27143, 27144, 27198, 27197, 27172, 27149, 27138, 27168, 27168, 27141, 27146, 27172, 27196, 27194, 27171, 27169, 27141, 27251, 27167, 27158, 27199, 27197, 27182, 27182, 27168, 27196, 27141, 27146, 27173, 27175};
    }
}
