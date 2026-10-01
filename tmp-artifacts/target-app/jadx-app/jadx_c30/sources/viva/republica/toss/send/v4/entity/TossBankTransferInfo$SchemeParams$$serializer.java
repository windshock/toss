package viva.republica.toss.send.v4.entity;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import net.sf.scuba.smartcards.BuildConfig;
import net.sf.scuba.smartcards.ISOFileInfo;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.PKCS12;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.aeu2;
import o.getBgColor;
import o.getWriggleLayout;
import o.okycx;
import o.oty1;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.send.v4.entity.TossBankTransferInfo;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class TossBankTransferInfo$SchemeParams$$serializer implements aeu2<TossBankTransferInfo.SchemeParams> {
    public static final int $stable;
    private static short[] IAuthTabCallback;
    private static int IAuthTabCallbackDefault;
    public static final TossBankTransferInfo$SchemeParams$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback;
    private static byte[] onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {77, -67, ISOFileInfo.FILE_IDENTIFIER, 9};
    private static final int $$b = 167;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 1;
    private static int asInterface = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, short s2, byte b) {
        int i;
        int i2;
        int i3 = 3 - (b * 4);
        int i4 = (s * 4) + 1;
        int i5 = (s2 * 3) + 115;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i6 = i3;
            int i7 = 0;
            i5 += i3;
            i3 = i6;
            i = i7;
            int i8 = i3 + 1;
            bArr2[i] = (byte) i5;
            i2 = i + 1;
            if (i2 == i4) {
                return new String(bArr2, 0);
            }
            i6 = i8;
            i3 = bArr[i8];
            i7 = i2;
            i5 += i3;
            i3 = i6;
            i = i7;
            int i82 = i3 + 1;
            bArr2[i] = (byte) i5;
            i2 = i + 1;
            if (i2 == i4) {
            }
        } else {
            i = 0;
            int i822 = i3 + 1;
            bArr2[i] = (byte) i5;
            i2 = i + 1;
            if (i2 == i4) {
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 69;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 125;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        IAuthTabCallbackDefault = 1;
        onWarmupCompleted();
        TossBankTransferInfo$SchemeParams$$serializer tossBankTransferInfo$SchemeParams$$serializer = new TossBankTransferInfo$SchemeParams$$serializer();
        INSTANCE = tossBankTransferInfo$SchemeParams$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.send.v4.entity.TossBankTransferInfo.SchemeParams", tossBankTransferInfo$SchemeParams$$serializer, 11);
        setanimationsloop.onWarmupCompleted(PKCS12.KEY_FIXED_AMOUNT, false);
        setanimationsloop.onWarmupCompleted("maxAmount", false);
        setanimationsloop.onWarmupCompleted(PKCS12.KEY_JUST_CLOSE, false);
        setanimationsloop.onWarmupCompleted("redirectUrlOnComplete", false);
        setanimationsloop.onWarmupCompleted(PKCS12.KEY_SKIP_AD, false);
        setanimationsloop.onWarmupCompleted(PKCS12.KEY_MESSAGE, false);
        setanimationsloop.onWarmupCompleted("hint", false);
        setanimationsloop.onWarmupCompleted(PKCS12.KEY_TRANSFER_TEXT_TYPE, false);
        setanimationsloop.onWarmupCompleted(PKCS12.KEY_ORIGIN, false);
        Object[] objArr = new Object[1];
        a((short) TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0), (byte) (ViewConfiguration.getFadingEdgeLength() >> 16), 296081224 + (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (-789075633) - TextUtils.getTrimmedLength(BuildConfig.FLAVOR), ImageFormat.getBitsPerPixel(0) - 122, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted(PKCS12.KEY_RESERVE_KEY, false);
        descriptor = setanimationsloop;
        int i = asInterface + 115;
        IAuthTabCallbackDefault = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private TossBankTransferInfo$SchemeParams$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = asBinder + 109;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(oty1.onExtraCallback);
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(getwrigglelayout);
        KSerializer<?> kSerializerIAuthTabCallback3 = sp.IAuthTabCallback(getwrigglelayout);
        KSerializer<?> kSerializerIAuthTabCallback4 = sp.IAuthTabCallback(getwrigglelayout);
        KSerializer<?> kSerializerIAuthTabCallback5 = sp.IAuthTabCallback(getwrigglelayout);
        KSerializer<?> kSerializerIAuthTabCallback6 = sp.IAuthTabCallback(getwrigglelayout);
        KSerializer<?> kSerializerIAuthTabCallback7 = sp.IAuthTabCallback(getwrigglelayout);
        KSerializer<?> kSerializerIAuthTabCallback8 = sp.IAuthTabCallback(getwrigglelayout);
        getBgColor getbgcolor = getBgColor.IAuthTabCallback;
        KSerializer<?>[] kSerializerArr = {getbgcolor, kSerializerIAuthTabCallback, getbgcolor, kSerializerIAuthTabCallback2, getbgcolor, kSerializerIAuthTabCallback3, kSerializerIAuthTabCallback4, kSerializerIAuthTabCallback5, kSerializerIAuthTabCallback6, kSerializerIAuthTabCallback7, kSerializerIAuthTabCallback8};
        int i4 = asBinder + 73;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 44 / 0;
        }
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 9;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        TossBankTransferInfo.SchemeParams schemeParamsM125deserialize = m125deserialize(decoder);
        int i4 = asBinder + 73;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return schemeParamsM125deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final TossBankTransferInfo.SchemeParams m125deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i;
        boolean z2;
        boolean z3;
        String str6;
        Long l;
        String str7;
        String str8;
        char c;
        int i2 = 2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i4 = 10;
        int i5 = 9;
        int i6 = 0;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            boolean zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0);
            Long l2 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, oty1.onExtraCallback, (Object) null);
            boolean zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2);
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str9 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getwrigglelayout, (Object) null);
            boolean zOnExtraCallbackWithResult3 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4);
            String str10 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, getwrigglelayout, (Object) null);
            String str11 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, getwrigglelayout, (Object) null);
            String str12 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, getwrigglelayout, (Object) null);
            String str13 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, getwrigglelayout, (Object) null);
            String str14 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 9, getwrigglelayout, (Object) null);
            z = zOnExtraCallbackWithResult2;
            z2 = zOnExtraCallbackWithResult;
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 10, getwrigglelayout, (Object) null);
            str3 = str14;
            str5 = str12;
            str4 = str11;
            str7 = str10;
            str6 = str9;
            str2 = str13;
            z3 = zOnExtraCallbackWithResult3;
            l = l2;
            i = 2047;
        } else {
            boolean z4 = true;
            boolean zOnExtraCallbackWithResult4 = false;
            boolean zOnExtraCallbackWithResult5 = false;
            String str15 = null;
            String str16 = null;
            String str17 = null;
            String str18 = null;
            String str19 = null;
            String str20 = null;
            Long l3 = null;
            String str21 = null;
            boolean zOnExtraCallbackWithResult6 = false;
            while (!(!z4)) {
                int i7 = asBinder + 53;
                IAuthTabCallbackStub = i7 % 128;
                int i8 = i7 % i2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        i5 = 9;
                        z4 = false;
                    case 0:
                        zOnExtraCallbackWithResult6 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0);
                        i6 |= 1;
                        int i9 = IAuthTabCallbackStub + 11;
                        asBinder = i9 % 128;
                        int i10 = i9 % 2;
                        i2 = 2;
                        str21 = str21;
                        str20 = str20;
                        l3 = l3;
                        i4 = 10;
                        i5 = 9;
                    case 1:
                        i6 |= 2;
                        l3 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, oty1.onExtraCallback, l3);
                        str21 = str21;
                        str20 = str20;
                        i2 = 2;
                        i4 = 10;
                        i5 = 9;
                    case 2:
                        zOnExtraCallbackWithResult4 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i2);
                        i6 |= 4;
                        i4 = 10;
                        i5 = 9;
                    case 3:
                        str8 = str21;
                        str20 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, str20);
                        i6 |= 8;
                        str21 = str8;
                        i4 = 10;
                        i5 = 9;
                    case 4:
                        str8 = str21;
                        zOnExtraCallbackWithResult5 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4);
                        i6 |= 16;
                        str21 = str8;
                        i4 = 10;
                        i5 = 9;
                    case 5:
                        i6 |= 32;
                        str21 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, getWriggleLayout.onNavigationEvent, str21);
                        i4 = 10;
                        i5 = 9;
                    case 6:
                        str18 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, getWriggleLayout.onNavigationEvent, str18);
                        i6 |= 64;
                        i4 = 10;
                        i5 = 9;
                    case 7:
                        c = '\b';
                        str19 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, getWriggleLayout.onNavigationEvent, str19);
                        i6 |= 128;
                        i4 = 10;
                    case 8:
                        c = '\b';
                        str16 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, getWriggleLayout.onNavigationEvent, str16);
                        i6 |= 256;
                        int i11 = asBinder + 103;
                        IAuthTabCallbackStub = i11 % 128;
                        int i12 = i11 % i2;
                        i4 = 10;
                    case 9:
                        str17 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i5, getWriggleLayout.onNavigationEvent, str17);
                        i6 |= 512;
                    case 10:
                        str15 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i4, getWriggleLayout.onNavigationEvent, str15);
                        i6 |= 1024;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            z = zOnExtraCallbackWithResult4;
            str = str15;
            str2 = str16;
            str3 = str17;
            str4 = str18;
            str5 = str19;
            i = i6;
            z2 = zOnExtraCallbackWithResult6;
            z3 = zOnExtraCallbackWithResult5;
            str6 = str20;
            l = l3;
            str7 = str21;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new TossBankTransferInfo.SchemeParams(i, z2, l, z, str6, z3, str7, str4, str5, str2, str3, str, (okycx) null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 101;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (TossBankTransferInfo.SchemeParams) obj);
        int i4 = IAuthTabCallbackStub + 49;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull TossBankTransferInfo.SchemeParams schemeParams) {
        int i = 2 % 2;
        int i2 = asBinder + 7;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(schemeParams, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        TossBankTransferInfo.SchemeParams.onWarmupCompleted(schemeParams, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = asBinder + 17;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 67;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01c0 A[Catch: all -> 0x02c4, TryCatch #0 {all -> 0x02c4, blocks: (B:3:0x000f, B:5:0x0028, B:6:0x0057, B:18:0x0083, B:20:0x0094, B:21:0x00cb, B:26:0x00ea, B:28:0x0101, B:29:0x0132, B:42:0x01a3, B:44:0x01c0, B:45:0x0200), top: B:74:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0259  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        boolean z;
        int i4;
        int i5;
        Object objOnExtraCallback;
        byte[] bArr;
        int i6 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onExtraCallback)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 43423), Gravity.getAbsoluteGravity(0, 0) + 42, 22439 - (Process.myPid() >> 22), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i7 = $11 + 61;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                z = true;
            } else {
                z = false;
            }
            long j = 0;
            if (z) {
                byte[] bArr2 = onExtraCallbackWithResult;
                if (bArr2 != null) {
                    int length = bArr2.length;
                    byte[] bArr3 = new byte[length];
                    int i9 = 0;
                    while (i9 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr2[i9])};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback3 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1)) + 12842), 55 - ((Process.getThreadPriority(0) + 20) >> 6), 2167 - (KeyEvent.getMaxKeyCode() >> 16), -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr3[i9] = ((Byte) ((Method) objOnExtraCallback3).invoke(null, objArr3)).byteValue();
                        i9++;
                        j = 0;
                    }
                    bArr2 = bArr3;
                }
                if (bArr2 != null) {
                    byte[] bArr4 = onExtraCallbackWithResult;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onNavigationEvent)};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 43424), 42 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 22439 - Color.argb(0, 0, 0, 0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr4[((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L))));
                    i4 = 2;
                } else {
                    iIntValue = (short) (((short) (IAuthTabCallback[i + ((int) (onNavigationEvent ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L))));
                    int i10 = $11 + 3;
                    $10 = i10 % 128;
                    i4 = 2;
                    int i11 = i10 % 2;
                }
            } else {
                i4 = 2;
            }
            if (iIntValue > 0) {
                int i12 = ((i + iIntValue) - i4) + ((int) (onNavigationEvent ^ (-4629411779493505016L)));
                if (!z) {
                    i5 = 0;
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i12 + i5;
                    Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onWarmupCompleted), sb};
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 85, 9567 - (ViewConfiguration.getPressedStateDuration() >> 16), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objOnExtraCallback).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    bArr = onExtraCallbackWithResult;
                    if (bArr != null) {
                        int length2 = bArr.length;
                        byte[] bArr5 = new byte[length2];
                        int i13 = 0;
                        while (i13 < length2) {
                            int i14 = $11;
                            int i15 = i14 + 75;
                            $10 = i15 % 128;
                            if (i15 % 2 != 0) {
                                bArr5[i13] = (byte) (bArr[i13] - 4629411779493505016L);
                            } else {
                                bArr5[i13] = (byte) (bArr[i13] ^ (-4629411779493505016L));
                                i13++;
                            }
                            int i16 = i14 + 81;
                            $10 = i16 % 128;
                            int i17 = i16 % 2;
                        }
                        bArr = bArr5;
                    }
                    boolean z2 = bArr == null;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                    while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                        int i18 = $10;
                        int i19 = i18 + 29;
                        $11 = i19 % 128;
                        int i20 = i19 % 2;
                        if (z2) {
                            int i21 = i18 + 87;
                            $11 = i21 % 128;
                            int i22 = i21 % 2;
                            byte[] bArr6 = onExtraCallbackWithResult;
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
                } else {
                    int i23 = $11 + 115;
                    $10 = i23 % 128;
                    if (i23 % 2 == 0) {
                        i5 = 1;
                    }
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i12 + i5;
                    Object[] objArr52 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onWarmupCompleted), sb};
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                    if (objOnExtraCallback == null) {
                    }
                    ((StringBuilder) ((Method) objOnExtraCallback).invoke(null, objArr52)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    bArr = onExtraCallbackWithResult;
                    if (bArr != null) {
                    }
                    if (bArr == null) {
                    }
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                    while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    }
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
        onNavigationEvent = 1243476159;
        onExtraCallback = -1538795406;
        onWarmupCompleted = -1957720277;
        onExtraCallbackWithResult = new byte[]{-122, 5, -5, 8, 5, -9, 9, -5};
    }
}
