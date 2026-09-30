package im.toss.features.benefit.dto;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.benefit.dto.BenefitActivationIntelligence;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.aeu2;
import o.dj3;
import o.getDynamicHeight;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BenefitActivationIntelligence$Row$$serializer implements aeu2<BenefitActivationIntelligence.Row> {
    public static final int $stable;
    private static int IAuthTabCallback;
    public static final BenefitActivationIntelligence$Row$$serializer INSTANCE;
    private static int asBinder;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback;
    private static short[] onExtraCallbackWithResult;
    private static byte[] onNavigationEvent;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {69, -38, -90, 81};
    private static final int $$b = 169;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 0;
    private static int onTransact = 1;
    private static int asInterface = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, short s, int i2) {
        int i3;
        int i4;
        int i5 = (s * 4) + 1;
        byte[] bArr = $$a;
        int i6 = i2 + 4;
        int i7 = 115 - (i * 4);
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i8 = i6;
            i4 = 0;
            i7 += i6;
            i6 = i8;
            i3 = i4;
            i4 = i3 + 1;
            int i9 = i6 + 1;
            bArr2[i3] = (byte) i7;
            if (i4 == i5) {
                return new String(bArr2, 0);
            }
            i8 = i9;
            i6 = bArr[i9];
            i7 += i6;
            i6 = i8;
            i3 = i4;
            i4 = i3 + 1;
            int i92 = i6 + 1;
            bArr2[i3] = (byte) i7;
            if (i4 == i5) {
            }
        } else {
            i3 = 0;
            i4 = i3 + 1;
            int i922 = i6 + 1;
            bArr2[i3] = (byte) i7;
            if (i4 == i5) {
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 69;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 7;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        asBinder = 1;
        IAuthTabCallback();
        BenefitActivationIntelligence$Row$$serializer benefitActivationIntelligence$Row$$serializer = new BenefitActivationIntelligence$Row$$serializer();
        INSTANCE = benefitActivationIntelligence$Row$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.benefit.dto.BenefitActivationIntelligence.Row", benefitActivationIntelligence$Row$$serializer, 7);
        setanimationsloop.onWarmupCompleted("iconUrl", true);
        Object[] objArr = new Object[1];
        a((short) (ViewConfiguration.getScrollBarSize() >> 8), (byte) (MotionEvent.axisFromString("") + 1), 1422703669 - ExpandableListView.getPackedPositionGroup(0L), 1531987559 - TextUtils.getCapsMode("", 0, 0), Color.red(0) - 23, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        Object[] objArr2 = new Object[1];
        a((short) TextUtils.getTrimmedLength(""), (byte) (ImageFormat.getBitsPerPixel(0) + 1), 1422703673 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), Gravity.getAbsoluteGravity(0, 0) + 1531987558, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 21, objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("landingUrl", true);
        setanimationsloop.onWarmupCompleted("rightButtonText", true);
        setanimationsloop.onWarmupCompleted("intervalSec", true);
        setanimationsloop.onWarmupCompleted("loopCount", true);
        descriptor = setanimationsloop;
        int i = asInterface + 109;
        asBinder = i % 128;
        if (i % 2 == 0) {
            int i2 = 17 / 0;
        }
    }

    private BenefitActivationIntelligence$Row$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onTransact + 53;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(getwrigglelayout);
        BenefitActivationIntelligence$RollingNumberText$$serializer benefitActivationIntelligence$RollingNumberText$$serializer = BenefitActivationIntelligence$RollingNumberText$$serializer.INSTANCE;
        KSerializer<?>[] kSerializerArr = {kSerializerIAuthTabCallback, sp.IAuthTabCallback(benefitActivationIntelligence$RollingNumberText$$serializer), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(benefitActivationIntelligence$RollingNumberText$$serializer), dj3.onWarmupCompleted, sp.IAuthTabCallback(getDynamicHeight.onWarmupCompleted)};
        int i4 = IAuthTabCallbackDefault + 125;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 68 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final BenefitActivationIntelligence.Row deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String str;
        BenefitActivationIntelligence.RollingNumberText rollingNumberText;
        String str2;
        BenefitActivationIntelligence.RollingNumberText rollingNumberText2;
        Integer num;
        int i;
        String str3;
        float f;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        String str4 = null;
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            float fOnWarmupCompleted = 0.0f;
            boolean z = true;
            num = null;
            rollingNumberText2 = null;
            str2 = null;
            str = null;
            rollingNumberText = null;
            i = 0;
            while (z) {
                int i4 = onTransact + 23;
                IAuthTabCallbackDefault = i4 % 128;
                int i5 = i4 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                    case 0:
                        str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str);
                        i |= 1;
                        i2 = IAuthTabCallbackDefault + 95;
                        onTransact = i2 % 128;
                        int i6 = i2 % 2;
                    case 1:
                        rollingNumberText = (BenefitActivationIntelligence.RollingNumberText) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, BenefitActivationIntelligence$RollingNumberText$$serializer.INSTANCE, rollingNumberText);
                        i |= 2;
                        i2 = IAuthTabCallbackDefault + 51;
                        onTransact = i2 % 128;
                        int i62 = i2 % 2;
                    case 2:
                        str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str2);
                        i |= 4;
                    case 3:
                        str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, str4);
                        i |= 8;
                    case 4:
                        rollingNumberText2 = (BenefitActivationIntelligence.RollingNumberText) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, BenefitActivationIntelligence$RollingNumberText$$serializer.INSTANCE, rollingNumberText2);
                        i |= 16;
                    case 5:
                        fOnWarmupCompleted = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 5);
                        i |= 32;
                        i2 = IAuthTabCallbackDefault + 15;
                        onTransact = i2 % 128;
                        int i622 = i2 % 2;
                    case 6:
                        num = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, getDynamicHeight.onWarmupCompleted, num);
                        i |= 64;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            f = fOnWarmupCompleted;
            str3 = str4;
        } else {
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, (Object) null);
            BenefitActivationIntelligence$RollingNumberText$$serializer benefitActivationIntelligence$RollingNumberText$$serializer = BenefitActivationIntelligence$RollingNumberText$$serializer.INSTANCE;
            rollingNumberText = (BenefitActivationIntelligence.RollingNumberText) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, benefitActivationIntelligence$RollingNumberText$$serializer, (Object) null);
            str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, (Object) null);
            String str5 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getwrigglelayout, (Object) null);
            rollingNumberText2 = (BenefitActivationIntelligence.RollingNumberText) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, benefitActivationIntelligence$RollingNumberText$$serializer, (Object) null);
            float fOnWarmupCompleted2 = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 5);
            num = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, getDynamicHeight.onWarmupCompleted, (Object) null);
            i = 127;
            str3 = str5;
            f = fOnWarmupCompleted2;
        }
        BenefitActivationIntelligence.RollingNumberText rollingNumberText3 = rollingNumberText2;
        String str6 = str2;
        String str7 = str;
        BenefitActivationIntelligence.RollingNumberText rollingNumberText4 = rollingNumberText;
        int i7 = i;
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new BenefitActivationIntelligence.Row(i7, str7, rollingNumberText4, str6, str3, rollingNumberText3, f, num, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m88deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onTransact + 77;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            deserialize(decoder);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        BenefitActivationIntelligence.Row rowDeserialize = deserialize(decoder);
        int i3 = onTransact + 19;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return rowDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull BenefitActivationIntelligence.Row row) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 79;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(row, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            BenefitActivationIntelligence.Row.onNavigationEvent(row, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            int i3 = 91 / 0;
        } else {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(row, "");
            SerialDescriptor serialDescriptor2 = descriptor;
            vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
            BenefitActivationIntelligence.Row.onNavigationEvent(row, vylVarOnExtraCallback2, serialDescriptor2);
            vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        }
        int i4 = onTransact + 3;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 77;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (BenefitActivationIntelligence.Row) obj);
        if (i3 != 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 59;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallbackDefault + 85;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x01af A[PHI: r0
      0x01af: PHI (r0v9 int) = (r0v8 int), (r0v39 int) binds: [B:38:0x01ad, B:35:0x019c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01b1 A[PHI: r0
      0x01b1: PHI (r0v36 int) = (r0v8 int), (r0v39 int) binds: [B:38:0x01ad, B:35:0x019c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        int i5;
        boolean z;
        int i6 = 2;
        int i7 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(IAuthTabCallback)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 42, 22439 - (KeyEvent.getMaxKeyCode() >> 16), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            boolean z2 = iIntValue == -1;
            if (z2) {
                byte[] bArr = onNavigationEvent;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i8 = $11 + 33;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                    int i10 = 0;
                    while (i10 < length) {
                        int i11 = $11 + 45;
                        $10 = i11 % 128;
                        int i12 = i11 % i6;
                        Object[] objArr3 = {Integer.valueOf(bArr[i10])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 12842), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 54, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 2167, -299036574, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                        }
                        bArr2[i10] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        i10++;
                        i6 = 2;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onWarmupCompleted)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (Process.myPid() >> 22)), 'Z' - AndroidCharacter.getMirror('0'), 22439 - (Process.myTid() >> 22), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallback ^ (-4629411779493505016L))));
                } else {
                    iIntValue = (short) (((short) (onExtraCallbackWithResult[i + ((int) (onWarmupCompleted ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallback ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                int i13 = $10 + 105;
                $11 = i13 % 128;
                if (i13 % 2 == 0) {
                    i4 = ((i % iIntValue) >>> 2) >> ((int) (onWarmupCompleted * (-4629411779493505016L)));
                    i5 = z2 ? 1 : 0;
                } else {
                    i4 = ((i + iIntValue) - 2) + ((int) (onWarmupCompleted ^ (-4629411779493505016L)));
                    if (z2) {
                    }
                }
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i4 + i5;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onExtraCallback), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), 86 - (ViewConfiguration.getEdgeSlop() >> 16), View.resolveSize(0, 0) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = onNavigationEvent;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i14 = 0; i14 < length2; i14++) {
                        int i15 = $10 + 95;
                        $11 = i15 % 128;
                        int i16 = i15 % 2;
                        bArr5[i14] = (byte) (bArr4[i14] ^ (-4629411779493505016L));
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    z = true;
                } else {
                    int i17 = $10 + 41;
                    $11 = i17 % 128;
                    int i18 = i17 % 2;
                    z = false;
                }
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    int i19 = $10 + 93;
                    $11 = i19 % 128;
                    int i20 = i19 % 2;
                    if (z) {
                        byte[] bArr6 = onNavigationEvent;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                    int i21 = $11 + 89;
                    $10 = i21 % 128;
                    int i22 = i21 % 2;
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

    static void IAuthTabCallback() {
        onWarmupCompleted = 259300291;
        IAuthTabCallback = -1538795500;
        onExtraCallback = 15229445;
        onNavigationEvent = new byte[]{-15, -16, 3, -3, -15, -16, 3, -3, 26, -27, 10, 8, 8};
    }
}
