package im.toss.facepay.validation.model.init;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.skp.smarttouch.sem.tools.smartcard.AbstractSmartcard;
import im.toss.facepay.validation.model.init.config.InterpreterConfig;
import im.toss.facepay.validation.model.init.config.InterpreterConfig$$serializer;
import im.toss.facepay.validation.model.init.config.OperationConfig;
import im.toss.facepay.validation.model.init.config.OperationConfig$$serializer;
import im.toss.facepay.validation.model.init.config.QualityModelConfig;
import im.toss.facepay.validation.model.init.config.QualityModelConfig$$serializer;
import im.toss.facepay.validation.model.init.config.ServiceConfig;
import im.toss.facepay.validation.model.init.config.ServiceConfig$$serializer;
import im.toss.facepay.validation.model.init.config.quality.BlurConfig;
import im.toss.facepay.validation.model.init.config.quality.BrightnessConfig;
import im.toss.facepay.validation.model.init.config.quality.DetectionConfig;
import im.toss.facepay.validation.model.init.config.quality.GeometricConfig;
import im.toss.facepay.validation.model.init.config.quality.PreBrightnessConfig;
import im.toss.facepay.validation.model.init.config.quality.QcV2Config;
import im.toss.facepay.validation.model.init.config.quality.StabilityConfig;
import im.toss.facepay.validation.model.init.config.quality.StereoImageCompareConfig;
import java.lang.reflect.Method;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class PolicyAttribute {
    public static final Companion Companion;
    private static short[] IAuthTabCallback;
    private static int asBinder;
    private static int onExtraCallback;
    private static byte[] onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final InterpreterConfig interpreterConfig;
    private final OperationConfig operationConfig;
    private final QualityModelConfig qualityModelConfig;
    private final ServiceConfig serviceConfig;
    private static final byte[] $$a = {66, 42, 112, AbstractSmartcard.BYTE_READ_MORE};
    private static final int $$b = 131;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 1;
    private static int IAuthTabCallbackDefault = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, int i, int i2) {
        int i3;
        int i4;
        int i5 = (i2 * 3) + 115;
        byte[] bArr = $$a;
        int i6 = 4 - (i * 2);
        int i7 = 1 - (s * 2);
        byte[] bArr2 = new byte[i7];
        if (bArr == null) {
            int i8 = i7;
            i4 = 0;
            i5 += i8;
            i6++;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i7) {
                return new String(bArr2, 0);
            }
            i8 = bArr[i6];
            i5 += i8;
            i6++;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i7) {
            }
        } else {
            i3 = 0;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i7) {
            }
        }
    }

    static {
        asBinder = 1;
        onWarmupCompleted();
        Companion = new Companion(null);
        int i = IAuthTabCallbackDefault + 37;
        asBinder = i % 128;
        if (i % 2 == 0) {
            int i2 = 29 / 0;
        }
    }

    public PolicyAttribute() {
        this((ServiceConfig) null, (InterpreterConfig) null, (QualityModelConfig) null, (OperationConfig) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
    
        if ((r6 instanceof im.toss.facepay.validation.model.init.PolicyAttribute) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        r6 = (im.toss.facepay.validation.model.init.PolicyAttribute) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.serviceConfig, r6.serviceConfig) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.interpreterConfig, r6.interpreterConfig) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
    
        r6 = im.toss.facepay.validation.model.init.PolicyAttribute.IAuthTabCallbackStub + 109;
        im.toss.facepay.validation.model.init.PolicyAttribute.asInterface = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.qualityModelConfig, r6.qualityModelConfig) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.operationConfig, r6.operationConfig) == true) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0054, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 77;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 1 / 0;
        }
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        ServiceConfig serviceConfig = this.serviceConfig;
        int iHashCode2 = 0;
        if (serviceConfig == null) {
            int i2 = asInterface + 45;
            IAuthTabCallbackStub = i2 % 128;
            iHashCode = i2 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = serviceConfig.hashCode();
        }
        InterpreterConfig interpreterConfig = this.interpreterConfig;
        if (interpreterConfig != null) {
            iHashCode2 = interpreterConfig.hashCode();
            int i3 = IAuthTabCallbackStub + 115;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
        }
        return (((((iHashCode * 31) + iHashCode2) * 31) + this.qualityModelConfig.hashCode()) * 31) + this.operationConfig.hashCode();
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        ServiceConfig serviceConfig = this.serviceConfig;
        InterpreterConfig interpreterConfig = this.interpreterConfig;
        QualityModelConfig qualityModelConfig = this.qualityModelConfig;
        OperationConfig operationConfig = this.operationConfig;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a((short) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (byte) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), (Process.myTid() >> 22) - 1147026173, 330826670 - KeyEvent.keyCodeFromString(""), (-57) - ((Process.getThreadPriority(0) + 20) >> 6), objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(serviceConfig);
        Object[] objArr2 = new Object[1];
        a((short) ExpandableListView.getPackedPositionGroup(0L), (byte) TextUtils.indexOf("", "", 0, 0), TextUtils.getOffsetAfter("", 0) - 1147026144, (ViewConfiguration.getScrollBarSize() >> 8) + 330826634, (-67) - View.MeasureSpec.getMode(0), objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(interpreterConfig);
        Object[] objArr3 = new Object[1];
        a((short) (KeyEvent.getMaxKeyCode() >> 16), (byte) View.resolveSize(0, 0), (-1163803341) - Color.rgb(0, 0, 0), 330826634 - ExpandableListView.getPackedPositionType(0L), (-16777282) - Color.rgb(0, 0, 0), objArr3);
        sb.append(((String) objArr3[0]).intern());
        sb.append(qualityModelConfig);
        Object[] objArr4 = new Object[1];
        a((short) (MotionEvent.axisFromString("") + 1), (byte) KeyEvent.normalizeMetaState(0), Color.blue(0) - 1147026105, 330826633 - TextUtils.lastIndexOf("", '0', 0, 0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 69, objArr4);
        sb.append(((String) objArr4[0]).intern());
        sb.append(operationConfig);
        Object[] objArr5 = new Object[1];
        a((short) (ViewConfiguration.getEdgeSlop() >> 16), (byte) ExpandableListView.getPackedPositionType(0L), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1147026089, 330826632 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 87, objArr5);
        sb.append(((String) objArr5[0]).intern());
        String string = sb.toString();
        int i2 = asInterface + 65;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    public static final class Companion {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PolicyAttribute> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 119;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            PolicyAttribute$$serializer policyAttribute$$serializer = PolicyAttribute$$serializer.INSTANCE;
            int i4 = onExtraCallback + 39;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return policyAttribute$$serializer;
        }
    }

    public /* synthetic */ PolicyAttribute(int i, ServiceConfig serviceConfig, InterpreterConfig interpreterConfig, QualityModelConfig qualityModelConfig, OperationConfig operationConfig, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.serviceConfig = null;
            int i2 = asInterface + 31;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        } else {
            this.serviceConfig = serviceConfig;
        }
        if ((i & 2) == 0) {
            this.interpreterConfig = null;
            int i5 = IAuthTabCallbackStub + 57;
            asInterface = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 5 / 5;
            } else {
                int i7 = 2 % 2;
            }
        } else {
            this.interpreterConfig = interpreterConfig;
        }
        if ((i & 4) == 0) {
            this.qualityModelConfig = new QualityModelConfig((PreBrightnessConfig) null, (BlurConfig) null, (GeometricConfig) null, (DetectionConfig) null, (BrightnessConfig) null, (StabilityConfig) null, (StereoImageCompareConfig) null, (QcV2Config) null, 255, (DefaultConstructorMarker) null);
            int i8 = 2 % 2;
        } else {
            this.qualityModelConfig = qualityModelConfig;
        }
        this.operationConfig = (i & 8) == 0 ? new OperationConfig() : operationConfig;
        int i9 = asInterface + 5;
        IAuthTabCallbackStub = i9 % 128;
        int i10 = i9 % 2;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallbackWithResult(PolicyAttribute policyAttribute, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = asInterface + 117;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0) || policyAttribute.serviceConfig != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 0, ServiceConfig$$serializer.INSTANCE, policyAttribute.serviceConfig);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 1) || policyAttribute.interpreterConfig != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 1, InterpreterConfig$$serializer.INSTANCE, policyAttribute.interpreterConfig);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 2) || (!Intrinsics.areEqual(policyAttribute.qualityModelConfig, new QualityModelConfig((PreBrightnessConfig) null, (BlurConfig) null, (GeometricConfig) null, (DetectionConfig) null, (BrightnessConfig) null, (StabilityConfig) null, (StereoImageCompareConfig) null, (QcV2Config) null, 255, (DefaultConstructorMarker) null)))) {
            vylVar.onNavigationEvent(serialDescriptor, 2, QualityModelConfig$$serializer.INSTANCE, policyAttribute.qualityModelConfig);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 3) || !Intrinsics.areEqual(policyAttribute.operationConfig, new OperationConfig())) {
            vylVar.onNavigationEvent(serialDescriptor, 3, OperationConfig$$serializer.INSTANCE, policyAttribute.operationConfig);
        }
        int i4 = asInterface + 93;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public PolicyAttribute(@Nullable ServiceConfig serviceConfig, @Nullable InterpreterConfig interpreterConfig, @NotNull QualityModelConfig qualityModelConfig, @NotNull OperationConfig operationConfig) {
        Intrinsics.checkNotNullParameter(qualityModelConfig, "");
        Intrinsics.checkNotNullParameter(operationConfig, "");
        this.serviceConfig = serviceConfig;
        this.interpreterConfig = interpreterConfig;
        this.qualityModelConfig = qualityModelConfig;
        this.operationConfig = operationConfig;
    }

    public /* synthetic */ PolicyAttribute(ServiceConfig serviceConfig, InterpreterConfig interpreterConfig, QualityModelConfig qualityModelConfig, OperationConfig operationConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        ServiceConfig serviceConfig2;
        QualityModelConfig qualityModelConfig2;
        OperationConfig operationConfig2;
        InterpreterConfig interpreterConfig2 = null;
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallbackStub + 49;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 3 / 2;
            } else {
                int i4 = 2 % 2;
            }
            serviceConfig2 = null;
        } else {
            serviceConfig2 = serviceConfig;
        }
        if ((i & 2) != 0) {
            int i5 = asInterface + 57;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 9 / 0;
            }
            int i7 = 2 % 2;
        } else {
            interpreterConfig2 = interpreterConfig;
        }
        if ((i & 4) != 0) {
            qualityModelConfig2 = new QualityModelConfig((PreBrightnessConfig) null, (BlurConfig) null, (GeometricConfig) null, (DetectionConfig) null, (BrightnessConfig) null, (StabilityConfig) null, (StereoImageCompareConfig) null, (QcV2Config) null, 255, (DefaultConstructorMarker) null);
            int i8 = 2 % 2;
        } else {
            qualityModelConfig2 = qualityModelConfig;
        }
        if ((i & 8) != 0) {
            operationConfig2 = new OperationConfig();
            int i9 = IAuthTabCallbackStub + 53;
            asInterface = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 2 % 2;
        } else {
            operationConfig2 = operationConfig;
        }
        this(serviceConfig2, interpreterConfig2, qualityModelConfig2, operationConfig2);
    }

    public final ServiceConfig onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 125;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        ServiceConfig serviceConfig = this.serviceConfig;
        int i5 = i2 + 111;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 24 / 0;
        }
        return serviceConfig;
    }

    public final InterpreterConfig onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 21;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return this.interpreterConfig;
        }
        throw null;
    }

    public final QualityModelConfig IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 35;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        QualityModelConfig qualityModelConfig = this.qualityModelConfig;
        int i4 = i2 + 107;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return qualityModelConfig;
        }
        throw null;
    }

    public final OperationConfig onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 79;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        OperationConfig operationConfig = this.operationConfig;
        int i5 = i3 + 59;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return operationConfig;
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2;
        int i5 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onWarmupCompleted)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            long j = 0;
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 43424), KeyEvent.normalizeMetaState(0) + 42, ExpandableListView.getPackedPositionType(0L) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            int i6 = iIntValue == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = onExtraCallbackWithResult;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i7 = 0;
                    while (i7 < length) {
                        int i8 = $10 + 51;
                        $11 = i8 % 128;
                        int i9 = i8 % i4;
                        Object[] objArr3 = {Integer.valueOf(bArr[i7])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - ExpandableListView.getPackedPositionType(j)), 55 - (ViewConfiguration.getScrollDefaultDelay() >> 16), View.MeasureSpec.getSize(0) + 2167, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr2[i7] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        i7++;
                        i4 = 2;
                        j = 0;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = onExtraCallbackWithResult;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onNavigationEvent)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43423 - ImageFormat.getBitsPerPixel(0)), 42 - (Process.myPid() >> 22), 22439 - (Process.myPid() >> 22), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onWarmupCompleted ^ (-4629411779493505016L))));
                } else {
                    iIntValue = (short) (((short) (IAuthTabCallback[i + ((int) (onNavigationEvent ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onWarmupCompleted ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                int i10 = $10 + 23;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (onNavigationEvent ^ (-4629411779493505016L))) + i6;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onExtraCallback), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 86 - TextUtils.indexOf("", "", 0), (Process.myPid() >> 22) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = onExtraCallbackWithResult;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i12 = 0; i12 < length2; i12++) {
                        bArr5[i12] = (byte) (bArr4[i12] ^ (-4629411779493505016L));
                    }
                    bArr4 = bArr5;
                }
                boolean z = bArr4 != null;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (z) {
                        byte[] bArr6 = onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r4] ^ (-4629411779493505016L))) + s)) ^ b));
                        int i13 = $10 + 43;
                        $11 = i13 % 128;
                        int i14 = i13 % 2;
                    } else {
                        short[] sArr = IAuthTabCallback;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r4] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    static void onWarmupCompleted() {
        onNavigationEvent = -535174411;
        onWarmupCompleted = -1538795425;
        onExtraCallback = 1207968938;
        onExtraCallbackWithResult = new byte[]{-34, -10, 11, -16, -9, 36, -42, 10, -14, -5, 12, 5, -6, 67, -53, -7, -9, 27, -15, -1, -10, 8, 59, -64, 30, -14, -11, -11, 23, -34, -10, 11, -16, -9, 36, -39, 5, -7, 7, -5, 10, -10, 5, -7, 14, 13, 65, -4, -34, -10, 11, -16, -9, 36, -33, 15, 9, -3, 42, -36, 13, 3, -11, 3, -28, 12, 89, -4, -34, -10, 11, -16, -9, 36, -35, -9, 14, -3, 27, -25, 5, -3, 9, 71, -4, 8, 8, 8, 8, 8};
    }
}
