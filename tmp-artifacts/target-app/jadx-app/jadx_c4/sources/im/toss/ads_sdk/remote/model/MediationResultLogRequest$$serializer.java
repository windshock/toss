package im.toss.ads_sdk.remote.model;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.skp.smarttouch.sem.tools.smartcard.AbstractSmartcard;
import com.tmoney.LiveCheckConstants;
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
import o.getWriggleLayout;
import o.oty1;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final /* synthetic */ class MediationResultLogRequest$$serializer implements aeu2<MediationResultLogRequest> {
    public static final int $stable;
    private static short[] IAuthTabCallback;
    private static int IAuthTabCallbackStub;
    public static final MediationResultLogRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static byte[] onNavigationEvent;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {66, 42, 112, AbstractSmartcard.BYTE_READ_MORE};
    private static final int $$b = 151;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 0;
    private static int asBinder = 1;
    private static int onTransact = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, int i2, byte b) {
        int i3;
        int i4 = (i2 * 3) + 115;
        int i5 = 3 - (b * 3);
        int i6 = i * 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i6 + 1];
        if (bArr == null) {
            int i7 = i6;
            int i8 = 0;
            i4 += -i7;
            i3 = i8;
            bArr2[i3] = (byte) i4;
            i8 = i3 + 1;
            i5++;
            if (i3 == i6) {
                return new String(bArr2, 0);
            }
            i7 = bArr[i5];
            i4 += -i7;
            i3 = i8;
            bArr2[i3] = (byte) i4;
            i8 = i3 + 1;
            i5++;
            if (i3 == i6) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i4;
            i8 = i3 + 1;
            i5++;
            if (i3 == i6) {
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        SerialDescriptor serialDescriptor;
        int i = 2 % 2;
        int i2 = asBinder + 53;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        if (i2 % 2 != 0) {
            serialDescriptor = descriptor;
            int i4 = 84 / 0;
        } else {
            serialDescriptor = descriptor;
        }
        int i5 = i3 + 89;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        IAuthTabCallbackStub = 0;
        onNavigationEvent();
        MediationResultLogRequest$$serializer mediationResultLogRequest$$serializer = new MediationResultLogRequest$$serializer();
        INSTANCE = mediationResultLogRequest$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.ads_sdk.remote.model.MediationResultLogRequest", mediationResultLogRequest$$serializer, 13);
        setanimationsloop.onWarmupCompleted("mediationId", false);
        setanimationsloop.onWarmupCompleted("requestId", true);
        setanimationsloop.onWarmupCompleted("eventContextToken", true);
        setanimationsloop.onWarmupCompleted("winnerSource", true);
        setanimationsloop.onWarmupCompleted("content", true);
        setanimationsloop.onWarmupCompleted("tossFailed", true);
        setanimationsloop.onWarmupCompleted("adMobFailed", true);
        setanimationsloop.onWarmupCompleted("adMobFailedDetail", true);
        Object[] objArr = new Object[1];
        a((short) TextUtils.getCapsMode("", 0, 0), (byte) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), (-667726052) - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 1837603675 - ((byte) KeyEvent.getModifierMetaStateMask()), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 112, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("adUnitId", true);
        setanimationsloop.onWarmupCompleted("placementId", true);
        setanimationsloop.onWarmupCompleted("automationSessionId", true);
        setanimationsloop.onWarmupCompleted("eventTs", true);
        descriptor = setanimationsloop;
        int i = onTransact + 57;
        IAuthTabCallbackStub = i % 128;
        int i2 = i % 2;
    }

    private MediationResultLogRequest$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = asBinder + 95;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializer = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {kSerializer, sp.IAuthTabCallback(kSerializer), sp.IAuthTabCallback(kSerializer), sp.IAuthTabCallback(kSerializer), sp.IAuthTabCallback(ExposureContent$$serializer.INSTANCE), sp.IAuthTabCallback(kSerializer), sp.IAuthTabCallback(kSerializer), sp.IAuthTabCallback(AdMobFailedDetail$$serializer.INSTANCE), kSerializer, sp.IAuthTabCallback(kSerializer), sp.IAuthTabCallback(oty1.onExtraCallback), sp.IAuthTabCallback(kSerializer), sp.IAuthTabCallback(kSerializer)};
        int i4 = IAuthTabCallbackDefault + 73;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final MediationResultLogRequest deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String str;
        String str2;
        AdMobFailedDetail adMobFailedDetail;
        String str3;
        int i;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        ExposureContent exposureContent;
        Long l;
        String str9;
        String str10;
        String str11;
        int i2 = 2;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 125;
        asBinder = i4 % 128;
        String str12 = null;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            decoder.onWarmupCompleted(descriptor).extraCallbackWithResult();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i5 = 10;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i6 = asBinder + 73;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str13 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, (Object) null);
            String str14 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, (Object) null);
            String str15 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getwrigglelayout, (Object) null);
            ExposureContent exposureContent2 = (ExposureContent) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, ExposureContent$$serializer.INSTANCE, (Object) null);
            String str16 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, getwrigglelayout, (Object) null);
            String str17 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, getwrigglelayout, (Object) null);
            AdMobFailedDetail adMobFailedDetail2 = (AdMobFailedDetail) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, AdMobFailedDetail$$serializer.INSTANCE, (Object) null);
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 8);
            String str18 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 9, getwrigglelayout, (Object) null);
            Long l2 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 10, oty1.onExtraCallback, (Object) null);
            String str19 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 11, getwrigglelayout, (Object) null);
            str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 12, getwrigglelayout, (Object) null);
            l = l2;
            str4 = str18;
            adMobFailedDetail = adMobFailedDetail2;
            str2 = str17;
            str = strAsInterface2;
            str5 = str19;
            str10 = str14;
            i = 8191;
            str6 = str16;
            exposureContent = exposureContent2;
            str7 = strAsInterface;
            str9 = str15;
            str8 = str13;
        } else {
            String strAsInterface3 = null;
            String str20 = null;
            Long l3 = null;
            String str21 = null;
            String str22 = null;
            String str23 = null;
            String strAsInterface4 = null;
            String str24 = null;
            String str25 = null;
            ExposureContent exposureContent3 = null;
            boolean z = true;
            int i8 = 0;
            AdMobFailedDetail adMobFailedDetail3 = null;
            String str26 = null;
            while (z) {
                int i9 = asBinder + 69;
                IAuthTabCallbackDefault = i9 % 128;
                int i10 = i9 % i2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                        i2 = 2;
                        i5 = 10;
                    case 0:
                        str11 = strAsInterface3;
                        strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i8 |= 1;
                        strAsInterface3 = str11;
                        i2 = 2;
                        i5 = 10;
                    case 1:
                        str11 = strAsInterface3;
                        str20 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str20);
                        i8 |= 2;
                        str24 = str24;
                        exposureContent3 = exposureContent3;
                        str25 = str25;
                        strAsInterface3 = str11;
                        i2 = 2;
                        i5 = 10;
                    case 2:
                        str24 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str24);
                        i8 |= 4;
                        i2 = 2;
                        strAsInterface3 = strAsInterface3;
                        i5 = 10;
                    case 3:
                        str25 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, str25);
                        i8 |= 8;
                        i2 = 2;
                        i5 = 10;
                    case 4:
                        exposureContent3 = (ExposureContent) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, ExposureContent$$serializer.INSTANCE, exposureContent3);
                        i8 |= 16;
                        i5 = 10;
                    case 5:
                        str26 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, getWriggleLayout.onNavigationEvent, str26);
                        i8 |= 32;
                        i5 = 10;
                    case 6:
                        str12 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, getWriggleLayout.onNavigationEvent, str12);
                        i8 |= 64;
                        i5 = 10;
                    case 7:
                        adMobFailedDetail3 = (AdMobFailedDetail) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, AdMobFailedDetail$$serializer.INSTANCE, adMobFailedDetail3);
                        i8 |= 128;
                        i5 = 10;
                    case 8:
                        strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 8);
                        i8 |= 256;
                        i5 = 10;
                    case LiveCheckConstants.SVC_LOAD_ADD_IMMEDIATELY /* 9 */:
                        str22 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 9, getWriggleLayout.onNavigationEvent, str22);
                        i8 |= 512;
                        i5 = 10;
                    case 10:
                        l3 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i5, oty1.onExtraCallback, l3);
                        i8 |= 1024;
                        int i11 = asBinder + 81;
                        IAuthTabCallbackDefault = i11 % 128;
                        int i12 = i11 % i2;
                        i5 = 10;
                    case 11:
                        str23 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 11, getWriggleLayout.onNavigationEvent, str23);
                        i8 |= 2048;
                    case LiveCheckConstants.SVC_U1 /* 12 */:
                        str21 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 12, getWriggleLayout.onNavigationEvent, str21);
                        i8 |= 4096;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            str = strAsInterface3;
            String str27 = str24;
            str2 = str12;
            adMobFailedDetail = adMobFailedDetail3;
            str3 = str21;
            i = i8;
            str4 = str22;
            str5 = str23;
            str6 = str26;
            str7 = strAsInterface4;
            str8 = str20;
            exposureContent = exposureContent3;
            l = l3;
            str9 = str25;
            str10 = str27;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new MediationResultLogRequest(i, str7, str8, str10, str9, exposureContent, str6, str2, adMobFailedDetail, str, str4, l, str5, str3, null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m46deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = asBinder + 39;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull MediationResultLogRequest mediationResultLogRequest) {
        int i = 2 % 2;
        int i2 = asBinder + 17;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(mediationResultLogRequest, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        MediationResultLogRequest.onExtraCallbackWithResult(mediationResultLogRequest, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallbackDefault + 83;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 31;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (MediationResultLogRequest) obj);
        int i4 = asBinder + 41;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 111;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        throw null;
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        int i5 = 2;
        int i6 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onExtraCallback)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            char c = '0';
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getOffsetAfter("", 0) + 43424), 41 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), Color.red(0) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                i4 = 1;
            } else {
                int i7 = $10 + 23;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                i4 = 0;
            }
            if (i4 != 0) {
                int i9 = $11 + 103;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                byte[] bArr = onNavigationEvent;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i11 = 0;
                    while (i11 < length) {
                        int i12 = $11 + 53;
                        $10 = i12 % 128;
                        int i13 = i12 % i5;
                        try {
                            Object[] objArr3 = {Integer.valueOf(bArr[i11])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                char trimmedLength = (char) (TextUtils.getTrimmedLength("") + 12843);
                                int keyRepeatDelay = 55 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                int mirror = 2215 - AndroidCharacter.getMirror(c);
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(trimmedLength, keyRepeatDelay, mirror, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr2[i11] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                            i11++;
                            i5 = 2;
                            c = '0';
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onWarmupCompleted)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0') + 43425), Color.argb(0, 0, 0, 0) + 42, (ViewConfiguration.getTouchSlop() >> 8) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L))));
                } else {
                    iIntValue = (short) (((short) (IAuthTabCallback[i + ((int) (onWarmupCompleted ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                int i14 = $11 + 95;
                $10 = i14 % 128;
                int i15 = i14 % 2;
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (onWarmupCompleted ^ (-4629411779493505016L))) + i4;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onExtraCallbackWithResult), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 86 - ((Process.getThreadPriority(0) + 20) >> 6), 9567 - (Process.myTid() >> 22), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = onNavigationEvent;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i16 = 0; i16 < length2; i16++) {
                        int i17 = $11 + 103;
                        $10 = i17 % 128;
                        int i18 = i17 % 2;
                        bArr5[i16] = (byte) (bArr4[i16] ^ (-4629411779493505016L));
                    }
                    bArr4 = bArr5;
                }
                boolean z = bArr4 != null;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (z) {
                        byte[] bArr6 = onNavigationEvent;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = IAuthTabCallback;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
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

    static void onNavigationEvent() {
        onWarmupCompleted = -2088015635;
        onExtraCallback = -1538795406;
        onExtraCallbackWithResult = 910146847;
        onNavigationEvent = new byte[]{19, -35, 3, -13, 17, -8, 10, 10, -7, -11, 8};
    }
}
