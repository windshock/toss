package im.toss.facepay.validation.model.init.config;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.squareup.seismic.ShakeDetector;
import com.tmoney.LiveCheckConstants;
import im.toss.facepay.validation.model.init.config.service.AutoExposureConfig;
import im.toss.facepay.validation.model.init.config.service.AutoExposureConfig$$serializer;
import im.toss.facepay.validation.model.init.config.service.BleConfig;
import im.toss.facepay.validation.model.init.config.service.BleConfig$$serializer;
import im.toss.facepay.validation.model.init.config.service.CandidateFrameConfig;
import im.toss.facepay.validation.model.init.config.service.CandidateFrameConfig$$serializer;
import im.toss.facepay.validation.model.init.config.service.OtaConfig;
import im.toss.facepay.validation.model.init.config.service.OtaConfig$$serializer;
import im.toss.facepay.validation.model.init.config.service.PostAuthConfig;
import im.toss.facepay.validation.model.init.config.service.PostAuthConfig$$serializer;
import im.toss.facepay.validation.model.init.config.service.ResultConfig;
import im.toss.facepay.validation.model.init.config.service.ResultConfig$$serializer;
import im.toss.facepay.validation.model.init.config.service.SystemConfig;
import im.toss.facepay.validation.model.init.config.service.SystemConfig$$serializer;
import im.toss.facepay.validation.model.init.config.service.WarmUpConfig;
import im.toss.facepay.validation.model.init.config.service.WarmUpConfig$$serializer;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.TrackGroupExternalSyntheticLambda0;
import o.aeu2;
import o.getBgColor;
import o.getDynamicHeight;
import o.okycx;
import o.oty1;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final /* synthetic */ class ServiceConfig$$serializer implements aeu2<ServiceConfig> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    public static final ServiceConfig$$serializer INSTANCE;
    private static int asBinder = 1;
    private static int asInterface;
    private static final SerialDescriptor descriptor;
    private static char onExtraCallback;
    private static char[] onExtraCallbackWithResult;
    private static char onNavigationEvent;
    private static char onWarmupCompleted;

    private ServiceConfig$$serializer() {
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = asInterface + 1;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        onWarmupCompleted();
        ServiceConfig$$serializer serviceConfig$$serializer = new ServiceConfig$$serializer();
        INSTANCE = serviceConfig$$serializer;
        Object[] objArr = new Object[1];
        a(new int[]{0, 58, 195, 0}, true, new byte[]{0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0}, objArr);
        setAnimationsLoop setanimationsloop = new setAnimationsLoop(((String) objArr[0]).intern(), serviceConfig$$serializer, 14);
        Object[] objArr2 = new Object[1];
        b(new char[]{17065, 61232, 45630, 54012}, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 3, objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), true);
        Object[] objArr3 = new Object[1];
        b(new char[]{62696, 51511, 36580, 13579, 42859, 27429}, 5 - TextUtils.indexOf((CharSequence) "", '0'), objArr3);
        setanimationsloop.onWarmupCompleted(((String) objArr3[0]).intern(), true);
        Object[] objArr4 = new Object[1];
        b(new char[]{55847, 39319, 3633, 34833, 30376, 29708}, View.MeasureSpec.getSize(0) + 6, objArr4);
        setanimationsloop.onWarmupCompleted(((String) objArr4[0]).intern(), true);
        Object[] objArr5 = new Object[1];
        b(new char[]{52941, 2889, 54418, 61156, 8568, 11673}, 5 - TextUtils.lastIndexOf("", '0', 0), objArr5);
        setanimationsloop.onWarmupCompleted(((String) objArr5[0]).intern(), true);
        Object[] objArr6 = new Object[1];
        b(new char[]{23013, 11613, 12240, 39202, 23861, 20512, 4251, 34105, 36580, 13579, 62696, 51511}, Color.blue(0) + 12, objArr6);
        setanimationsloop.onWarmupCompleted(((String) objArr6[0]).intern(), true);
        Object[] objArr7 = new Object[1];
        b(new char[]{64947, 21139, 25343, 59656, 21430, 15761, 12890, 8575, 53365, 47173, 12122, 23018, 59139, 49494, 5462, 14078, 62696, 51511, 4096, 11578, 34540, 23288, 47928, 16723, 35064, 1425, 31339, 20757, 42959, 50720, 15083, 15955}, 31 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr7);
        setanimationsloop.onWarmupCompleted(((String) objArr7[0]).intern(), true);
        Object[] objArr8 = new Object[1];
        a(new int[]{58, 14, 0, 9}, false, new byte[]{0, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1}, objArr8);
        setanimationsloop.onWarmupCompleted(((String) objArr8[0]).intern(), true);
        Object[] objArr9 = new Object[1];
        b(new char[]{4251, 34105, 3633, 34833, 48901, 62715, 12412, 54816}, View.MeasureSpec.getSize(0) + 8, objArr9);
        setanimationsloop.onWarmupCompleted(((String) objArr9[0]).intern(), true);
        Object[] objArr10 = new Object[1];
        a(new int[]{72, 21, 0, 0}, false, new byte[]{1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 0}, objArr10);
        setanimationsloop.onWarmupCompleted(((String) objArr10[0]).intern(), true);
        Object[] objArr11 = new Object[1];
        a(new int[]{93, 21, 191, 0}, false, new byte[]{0, 1, 1, 1, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0}, objArr11);
        setanimationsloop.onWarmupCompleted(((String) objArr11[0]).intern(), true);
        Object[] objArr12 = new Object[1];
        b(new char[]{26777, 34979, 10685, 7300}, 3 - KeyEvent.normalizeMetaState(0), objArr12);
        setanimationsloop.onWarmupCompleted(((String) objArr12[0]).intern(), true);
        Object[] objArr13 = new Object[1];
        b(new char[]{60786, 26388, 42422, 765, 31629, 12325, 12471, 61233, 60766, 60300, 56884, 64606, 60345, 35354, 47928, 16723, 21632, 26358, 57429, 10703, 51018, 2554, 33185, 25784, 54502, 61469}, 25 - MotionEvent.axisFromString(""), objArr13);
        setanimationsloop.onWarmupCompleted(((String) objArr13[0]).intern(), true);
        Object[] objArr14 = new Object[1];
        b(new char[]{59139, 49494, 46829, 25030, 27990, 48129, 32024, 60148, 43684, 29991, 31629, 12325, 17012, 47367, 57429, 10703, 51018, 2554, 33185, 25784, 54502, 61469}, Color.green(0) + 22, objArr14);
        setanimationsloop.onWarmupCompleted(((String) objArr14[0]).intern(), true);
        Object[] objArr15 = new Object[1];
        b(new char[]{59139, 49494, 46829, 25030, 27990, 48129, 32024, 60148, 43684, 29991, 31629, 12325, 12687, 35956, 35460, 32832, 27225, 15467, 20627, 26944, 59640, 9988, 63131, 32574}, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 23, objArr15);
        setanimationsloop.onWarmupCompleted(((String) objArr15[0]).intern(), true);
        descriptor = setanimationsloop;
        int i = IAuthTabCallbackStub + 35;
        IAuthTabCallbackDefault = i % 128;
        if (i % 2 != 0) {
            int i2 = 13 / 0;
        }
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = asInterface + 15;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(CandidateFrameConfig$$serializer.INSTANCE);
        KSerializer<?> kSerializer = getDynamicHeight.onWarmupCompleted;
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(kSerializer);
        oty1 oty1Var = oty1.onExtraCallback;
        KSerializer<?>[] kSerializerArr = {BleConfig$$serializer.INSTANCE, ResultConfig$$serializer.INSTANCE, SystemConfig$$serializer.INSTANCE, WarmUpConfig$$serializer.INSTANCE, AutoExposureConfig$$serializer.INSTANCE, getBgColor.IAuthTabCallback, kSerializerIAuthTabCallback, PostAuthConfig$$serializer.INSTANCE, kSerializerIAuthTabCallback2, kSerializer, OtaConfig$$serializer.INSTANCE, oty1Var, oty1Var, oty1Var};
        int i4 = asBinder + 119;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final ServiceConfig deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        BleConfig bleConfig;
        AutoExposureConfig autoExposureConfig;
        SystemConfig systemConfig;
        WarmUpConfig warmUpConfig;
        ResultConfig resultConfig;
        long jIAuthTabCallbackDefault;
        long jIAuthTabCallbackDefault2;
        OtaConfig otaConfig;
        long jIAuthTabCallbackDefault3;
        int i2;
        boolean z;
        Integer num;
        CandidateFrameConfig candidateFrameConfig;
        PostAuthConfig postAuthConfig;
        char c;
        int i3 = 2 % 2;
        int i4 = 1;
        int i5 = asBinder + 1;
        asInterface = i5 % 128;
        Integer num2 = null;
        if (i5 % 2 != 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            decoder.onWarmupCompleted(descriptor).extraCallbackWithResult();
            num2.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i6 = 11;
        int i7 = 10;
        int i8 = 9;
        int i9 = 4;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            BleConfig bleConfig2 = (BleConfig) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, BleConfig$$serializer.INSTANCE, (Object) null);
            ResultConfig resultConfig2 = (ResultConfig) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, ResultConfig$$serializer.INSTANCE, (Object) null);
            SystemConfig systemConfig2 = (SystemConfig) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, SystemConfig$$serializer.INSTANCE, (Object) null);
            WarmUpConfig warmUpConfig2 = (WarmUpConfig) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, WarmUpConfig$$serializer.INSTANCE, (Object) null);
            AutoExposureConfig autoExposureConfig2 = (AutoExposureConfig) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, AutoExposureConfig$$serializer.INSTANCE, (Object) null);
            boolean zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5);
            CandidateFrameConfig candidateFrameConfig2 = (CandidateFrameConfig) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, CandidateFrameConfig$$serializer.INSTANCE, (Object) null);
            PostAuthConfig postAuthConfig2 = (PostAuthConfig) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 7, PostAuthConfig$$serializer.INSTANCE, (Object) null);
            Integer num3 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, getDynamicHeight.onWarmupCompleted, (Object) null);
            int iOnTransact = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 9);
            OtaConfig otaConfig2 = (OtaConfig) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 10, OtaConfig$$serializer.INSTANCE, (Object) null);
            resultConfig = resultConfig2;
            otaConfig = otaConfig2;
            autoExposureConfig = autoExposureConfig2;
            systemConfig = systemConfig2;
            jIAuthTabCallbackDefault3 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 11);
            i2 = iOnTransact;
            candidateFrameConfig = candidateFrameConfig2;
            z = zOnExtraCallbackWithResult;
            num = num3;
            postAuthConfig = postAuthConfig2;
            jIAuthTabCallbackDefault = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 12);
            warmUpConfig = warmUpConfig2;
            jIAuthTabCallbackDefault2 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 13);
            i = 16383;
            bleConfig = bleConfig2;
        } else {
            boolean z2 = true;
            AutoExposureConfig autoExposureConfig3 = null;
            PostAuthConfig postAuthConfig3 = null;
            OtaConfig otaConfig3 = null;
            SystemConfig systemConfig3 = null;
            CandidateFrameConfig candidateFrameConfig3 = null;
            BleConfig bleConfig3 = null;
            ResultConfig resultConfig3 = null;
            int i10 = 0;
            int iOnTransact2 = 0;
            boolean zOnExtraCallbackWithResult2 = false;
            long jIAuthTabCallbackDefault4 = 0;
            long jIAuthTabCallbackDefault5 = 0;
            long jIAuthTabCallbackDefault6 = 0;
            WarmUpConfig warmUpConfig3 = null;
            while (z2) {
                int i11 = asInterface + 27;
                asBinder = i11 % 128;
                int i12 = i11 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z2 = false;
                        i4 = 1;
                        i9 = 4;
                        i7 = 10;
                        i8 = 9;
                    case 0:
                        bleConfig3 = (BleConfig) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, BleConfig$$serializer.INSTANCE, bleConfig3);
                        i10 |= 1;
                        i4 = 1;
                        i9 = 4;
                        i6 = 11;
                        i7 = 10;
                        i8 = 9;
                    case 1:
                        resultConfig3 = (ResultConfig) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, i4, ResultConfig$$serializer.INSTANCE, resultConfig3);
                        i10 |= 2;
                        int i13 = asBinder + 7;
                        asInterface = i13 % 128;
                        int i14 = i13 % 2;
                        systemConfig3 = systemConfig3;
                        candidateFrameConfig3 = candidateFrameConfig3;
                        i9 = 4;
                        i6 = 11;
                        i7 = 10;
                    case 2:
                        i10 |= 4;
                        systemConfig3 = (SystemConfig) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, SystemConfig$$serializer.INSTANCE, systemConfig3);
                        candidateFrameConfig3 = candidateFrameConfig3;
                        i9 = 4;
                        i6 = 11;
                        i7 = 10;
                    case 3:
                        c = 6;
                        warmUpConfig3 = (WarmUpConfig) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, WarmUpConfig$$serializer.INSTANCE, warmUpConfig3);
                        i10 |= 8;
                        i9 = 4;
                        i6 = 11;
                        i7 = 10;
                    case 4:
                        c = 6;
                        autoExposureConfig3 = (AutoExposureConfig) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, i9, AutoExposureConfig$$serializer.INSTANCE, autoExposureConfig3);
                        i10 |= 16;
                        candidateFrameConfig3 = candidateFrameConfig3;
                        i6 = 11;
                        i7 = 10;
                    case 5:
                        c = 6;
                        zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5);
                        i10 |= 32;
                        i6 = 11;
                        i7 = 10;
                    case 6:
                        i10 |= 64;
                        candidateFrameConfig3 = (CandidateFrameConfig) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, CandidateFrameConfig$$serializer.INSTANCE, candidateFrameConfig3);
                        i6 = 11;
                        i7 = 10;
                    case 7:
                        postAuthConfig3 = (PostAuthConfig) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 7, PostAuthConfig$$serializer.INSTANCE, postAuthConfig3);
                        i10 |= 128;
                        i6 = 11;
                    case 8:
                        num2 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, getDynamicHeight.onWarmupCompleted, num2);
                        i10 |= 256;
                    case LiveCheckConstants.SVC_LOAD_ADD_IMMEDIATELY /* 9 */:
                        iOnTransact2 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, i8);
                        i10 |= 512;
                    case 10:
                        otaConfig3 = (OtaConfig) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, i7, OtaConfig$$serializer.INSTANCE, otaConfig3);
                        i10 |= 1024;
                    case 11:
                        jIAuthTabCallbackDefault4 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, i6);
                        i10 |= 2048;
                    case LiveCheckConstants.SVC_U1 /* 12 */:
                        jIAuthTabCallbackDefault5 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 12);
                        i10 |= 4096;
                    case ShakeDetector.SENSITIVITY_MEDIUM /* 13 */:
                        jIAuthTabCallbackDefault6 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 13);
                        i10 |= 8192;
                        int i15 = asInterface + i4;
                        asBinder = i15 % 128;
                        if (i15 % 2 == 0) {
                            int i16 = 3 % i9;
                        }
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            CandidateFrameConfig candidateFrameConfig4 = candidateFrameConfig3;
            ResultConfig resultConfig4 = resultConfig3;
            i = i10;
            bleConfig = bleConfig3;
            autoExposureConfig = autoExposureConfig3;
            systemConfig = systemConfig3;
            warmUpConfig = warmUpConfig3;
            resultConfig = resultConfig4;
            jIAuthTabCallbackDefault = jIAuthTabCallbackDefault5;
            jIAuthTabCallbackDefault2 = jIAuthTabCallbackDefault6;
            otaConfig = otaConfig3;
            jIAuthTabCallbackDefault3 = jIAuthTabCallbackDefault4;
            i2 = iOnTransact2;
            z = zOnExtraCallbackWithResult2;
            num = num2;
            candidateFrameConfig = candidateFrameConfig4;
            postAuthConfig = postAuthConfig3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        ServiceConfig serviceConfig = new ServiceConfig(i, bleConfig, resultConfig, systemConfig, warmUpConfig, autoExposureConfig, z, candidateFrameConfig, postAuthConfig, num, i2, otaConfig, jIAuthTabCallbackDefault3, jIAuthTabCallbackDefault, jIAuthTabCallbackDefault2, (okycx) null);
        int i17 = asBinder + 83;
        asInterface = i17 % 128;
        int i18 = i17 % 2;
        return serviceConfig;
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m318deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = asBinder + 25;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ServiceConfig serviceConfig) {
        int i = 2 % 2;
        int i2 = asBinder + 51;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(serviceConfig, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        ServiceConfig.onExtraCallbackWithResult(serviceConfig, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = asBinder + 23;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 13;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ServiceConfig) obj);
        int i4 = asInterface + 47;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i4 = $11 + 63;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            int i6 = 1;
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i7 = 58224;
            int i8 = i3;
            while (i8 < 16) {
                int i9 = $10 + 79;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                char c = cArr3[i6];
                char c2 = cArr3[i3];
                char[] cArr4 = cArr3;
                int i11 = (c2 + i7) ^ ((c2 << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)));
                int i12 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onExtraCallback);
                    objArr2[2] = Integer.valueOf(i12);
                    objArr2[i6] = Integer.valueOf(i11);
                    objArr2[0] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + i6);
                        int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 10;
                        int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[i6] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cLastIndexOf, scrollDefaultDelay, keyRepeatDelay, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr4[i6] = cCharValue;
                    int i13 = i8;
                    Object[] objArr3 = {Integer.valueOf(cArr4[0]), Integer.valueOf((cCharValue + i7) ^ ((cCharValue << 4) + ((char) (onWarmupCompleted ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onNavigationEvent)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - Process.getGidForName("")), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 10, 12434 - (ViewConfiguration.getLongPressTimeout() >> 16), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i7 -= 40503;
                    i8 = i13 + 1;
                    cArr3 = cArr4;
                    i3 = 0;
                    i6 = 1;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.combineMeasuredStates(0, 0) + 16014), View.resolveSize(0, 0) + 14, TextUtils.getOffsetBefore("", 0) + 19901, -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        char[] cArr;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr2 = onExtraCallbackWithResult;
        long j = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.normalizeMetaState(0) + 35283), 35 - (ViewConfiguration.getEdgeSlop() >> 16), ExpandableListView.getPackedPositionGroup(j) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr3[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i7++;
                    j = 0;
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
        char[] cArr4 = new char[i4];
        System.arraycopy(cArr2, i3, cArr4, 0, i4);
        if (bArr != null) {
            int i8 = $11 + 29;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                cArr = new char[i4];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 1;
            } else {
                cArr = new char[i4];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            }
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i9 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - KeyEvent.keyCodeFromString("")), View.resolveSizeAndState(0, 0, 0) + 65, KeyEvent.getDeadChar(0, 0) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr[i9] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), 29 - View.resolveSizeAndState(0, 0, 0), 17657 - (ViewConfiguration.getLongPressTimeout() >> 16), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i10] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c = cArr[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - ExpandableListView.getPackedPositionGroup(0L)), 70 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 12486 - Gravity.getAbsoluteGravity(0, 0), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr4 = cArr;
        }
        if (i6 > 0) {
            int i11 = $10 + 5;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr4, 0, cArr5, 0, i4);
            int i13 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr4, i13, i6);
            System.arraycopy(cArr5, i6, cArr4, 0, i13);
        }
        if (z) {
            int i14 = $10 + 57;
            $11 = i14 % 128;
            int i15 = i14 % 2;
            char[] cArr6 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i16 = $10 + 19;
                $11 = i16 % 128;
                if (i16 % 2 == 0) {
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr4[i4 << trackGroupExternalSyntheticLambda0.onNavigationEvent];
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent - 1;
                } else {
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr4[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
                }
                trackGroupExternalSyntheticLambda0.onNavigationEvent = i;
            }
            int i17 = $11 + 59;
            $10 = i17 % 128;
            int i18 = i17 % 2;
            cArr4 = cArr6;
        }
        if (i5 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    static void onWarmupCompleted() {
        onExtraCallbackWithResult = new char[]{27355, 27493, 27492, 27491, 27519, 27474, 27481, 27497, 27495, 27516, 27513, 27488, 27473, 27469, 27459, 27493, 27492, 27491, 27519, 27490, 27461, 27482, 27519, 27488, 27488, 27456, 27486, 27493, 27497, 27490, 27519, 27486, 27487, 27519, 27489, 27519, 27491, 27499, 27495, 27491, 27495, 27488, 27483, 27480, 27518, 27493, 27491, 27497, 27499, 27496, 27459, 27485, 27512, 27514, 27514, 27482, 27486, 27488, 27260, 27180, 27172, 27170, 27163, 27154, 27175, 27177, 27175, 27178, 27180, 27177, 27175, 27176, 27258, 27173, 27173, 27168, 27152, 27158, 27168, 27197, 27199, 27198, 27195, 27176, 27162, 27166, 27138, 27157, 27173, 27199, 27194, 27170, 27170, 27354, 27492, 27492, 27491, 27491, 27498, 27499, 27478, 27477, 27494, 27496, 27494, 27477, 27472, 27495, 27493, 27478, 27478, 27519, 27518, 27518};
        onWarmupCompleted = (char) 9706;
        onNavigationEvent = (char) 52243;
        IAuthTabCallback = (char) 20038;
        onExtraCallback = (char) 45925;
    }
}
