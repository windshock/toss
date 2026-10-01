package im.toss.features.home.core.local.model.dst.widget;

import android.graphics.Color;
import android.media.AudioTrack;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.home.core.local.model.dst.handler.HandlerLocal;
import im.toss.features.home.core.local.model.dst.property.ColorAttributeLocal;
import im.toss.features.home.core.local.model.dst.property.ColorAttributeLocal$;
import im.toss.features.home.core.local.model.dst.property.PaddingLocal;
import im.toss.features.home.core.local.model.dst.property.PaddingLocal$$serializer;
import im.toss.features.home.core.local.model.dst.widget.TextAttributeLocal$;
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
import o.okycx;
import o.setAnimationsLoop;
import o.setAppxVersionInWorker;
import o.setVideoListener;
import o.sp;
import o.startPage;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class RoundButtonAttributeLocal$$serializer implements aeu2<RoundButtonAttributeLocal> {
    private static int IAuthTabCallback;
    public static final RoundButtonAttributeLocal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static byte[] onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static int onTransact;
    private static short[] onWarmupCompleted;
    private static final byte[] $$a = {68, -127, 122, -15};
    private static final int $$b = 125;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 1;
    private static int IAuthTabCallbackDefault = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, byte b, short s2) {
        int i;
        int i2;
        int i3 = 1 - (b * 2);
        byte[] bArr = $$a;
        int i4 = 4 - (s * 3);
        int i5 = 115 - (s2 * 4);
        byte[] bArr2 = new byte[i3];
        if (bArr == null) {
            int i6 = i5;
            int i7 = 0;
            int i8 = i4;
            int i9 = i4 + i6;
            int i10 = i8 + 1;
            i = i7;
            i5 = i9;
            i4 = i10;
            bArr2[i] = (byte) i5;
            i2 = i + 1;
            if (i2 == i3) {
                return new String(bArr2, 0);
            }
            int i11 = i5;
            i8 = i4;
            i4 = bArr[i4];
            i7 = i2;
            i6 = i11;
            int i92 = i4 + i6;
            int i102 = i8 + 1;
            i = i7;
            i5 = i92;
            i4 = i102;
            bArr2[i] = (byte) i5;
            i2 = i + 1;
            if (i2 == i3) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i5;
            i2 = i + 1;
            if (i2 == i3) {
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 95;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 17;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 82 / 0;
        }
        return serialDescriptor;
    }

    static {
        onTransact = 1;
        onExtraCallback();
        RoundButtonAttributeLocal$$serializer roundButtonAttributeLocal$$serializer = new RoundButtonAttributeLocal$$serializer();
        INSTANCE = roundButtonAttributeLocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.widget.RoundButtonAttributeLocal", roundButtonAttributeLocal$$serializer, 10);
        Object[] objArr = new Object[1];
        a((short) ((-1) - TextUtils.lastIndexOf("", '0')), (byte) (18 - TextUtils.indexOf("", "", 0, 0)), 1612822798 + (ViewConfiguration.getPressedStateDuration() >> 16), TextUtils.getCapsMode("", 0, 0) + 962086622, (-23) - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("color", false);
        setanimationsloop.onWarmupCompleted("radius", false);
        setanimationsloop.onWarmupCompleted("padding", false);
        setanimationsloop.onWarmupCompleted("handler", false);
        setanimationsloop.onWarmupCompleted("longPressHandler", false);
        setanimationsloop.onWarmupCompleted("strokeWidth", false);
        setanimationsloop.onWarmupCompleted("strokeColor", false);
        setanimationsloop.onWarmupCompleted("rightSpace", false);
        setanimationsloop.onWarmupCompleted("rightImage", false);
        descriptor = setanimationsloop;
        int i = IAuthTabCallbackDefault + 39;
        onTransact = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private RoundButtonAttributeLocal$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = asInterface + 67;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializer = ColorAttributeLocal$.serializer.INSTANCE;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(getDynamicHeight.onWarmupCompleted);
        setAppxVersionInWorker setappxversioninworker = setAppxVersionInWorker.onExtraCallback;
        KSerializer<?>[] kSerializerArr = {TextAttributeLocal$.serializer.INSTANCE, kSerializer, kSerializerIAuthTabCallback, PaddingLocal$$serializer.INSTANCE, sp.IAuthTabCallback(setappxversioninworker), sp.IAuthTabCallback(setappxversioninworker), sp.IAuthTabCallback(dj3.onWarmupCompleted), sp.IAuthTabCallback(kSerializer), setVideoListener.onWarmupCompleted, sp.IAuthTabCallback(startPage.onWarmupCompleted)};
        int i4 = asInterface + 103;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 39 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final RoundButtonAttributeLocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        Integer num;
        int i;
        Float f;
        ImageAttributeLocal imageAttributeLocal;
        ColorAttributeLocal colorAttributeLocal;
        PaddingLocal paddingLocal;
        ColorAttributeLocal colorAttributeLocal2;
        double d;
        HandlerLocal handlerLocal;
        HandlerLocal handlerLocal2;
        TextAttributeLocal textAttributeLocal;
        HandlerLocal handlerLocal3;
        int i2 = 2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i4 = 9;
        int i5 = 7;
        int i6 = 6;
        ColorAttributeLocal colorAttributeLocal3 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            TextAttributeLocal textAttributeLocal2 = (TextAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, TextAttributeLocal$.serializer.INSTANCE, (Object) null);
            ColorAttributeLocal$.serializer serializerVar = ColorAttributeLocal$.serializer.INSTANCE;
            colorAttributeLocal2 = (ColorAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, serializerVar, (Object) null);
            Integer num2 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getDynamicHeight.onWarmupCompleted, (Object) null);
            PaddingLocal paddingLocal2 = (PaddingLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, PaddingLocal$$serializer.INSTANCE, (Object) null);
            setAppxVersionInWorker setappxversioninworker = setAppxVersionInWorker.onExtraCallback;
            HandlerLocal handlerLocal4 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, setappxversioninworker, (Object) null);
            HandlerLocal handlerLocal5 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, setappxversioninworker, (Object) null);
            Float f2 = (Float) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, dj3.onWarmupCompleted, (Object) null);
            ColorAttributeLocal colorAttributeLocal4 = (ColorAttributeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, serializerVar, (Object) null);
            double dIAuthTabCallback = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 8);
            i = 1023;
            num = num2;
            imageAttributeLocal = (ImageAttributeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 9, startPage.onWarmupCompleted, (Object) null);
            colorAttributeLocal = colorAttributeLocal4;
            f = f2;
            paddingLocal = paddingLocal2;
            d = dIAuthTabCallback;
            handlerLocal2 = handlerLocal5;
            handlerLocal = handlerLocal4;
            textAttributeLocal = textAttributeLocal2;
        } else {
            boolean z = true;
            int i7 = 0;
            Float f3 = null;
            HandlerLocal handlerLocal6 = null;
            ImageAttributeLocal imageAttributeLocal2 = null;
            num = null;
            HandlerLocal handlerLocal7 = null;
            TextAttributeLocal textAttributeLocal3 = null;
            double dIAuthTabCallback2 = 0.0d;
            PaddingLocal paddingLocal3 = null;
            ColorAttributeLocal colorAttributeLocal5 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                        i2 = 2;
                        i5 = 7;
                        i6 = 6;
                    case 0:
                        i7 |= 1;
                        textAttributeLocal3 = (TextAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, TextAttributeLocal$.serializer.INSTANCE, textAttributeLocal3);
                        handlerLocal7 = handlerLocal7;
                        i2 = 2;
                        i4 = 9;
                        i5 = 7;
                        i6 = 6;
                    case 1:
                        handlerLocal3 = handlerLocal7;
                        colorAttributeLocal5 = (ColorAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, ColorAttributeLocal$.serializer.INSTANCE, colorAttributeLocal5);
                        i7 |= 2;
                        handlerLocal7 = handlerLocal3;
                        i4 = 9;
                        i5 = 7;
                        i6 = 6;
                    case 2:
                        num = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i2, getDynamicHeight.onWarmupCompleted, num);
                        i7 |= 4;
                        i4 = 9;
                        i5 = 7;
                        i6 = 6;
                    case 3:
                        handlerLocal3 = handlerLocal7;
                        paddingLocal3 = (PaddingLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, PaddingLocal$$serializer.INSTANCE, paddingLocal3);
                        i7 |= 8;
                        int i8 = asInterface + 43;
                        IAuthTabCallbackStub = i8 % 128;
                        int i9 = i8 % i2;
                        handlerLocal7 = handlerLocal3;
                        i4 = 9;
                        i5 = 7;
                        i6 = 6;
                    case 4:
                        handlerLocal7 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, setAppxVersionInWorker.onExtraCallback, handlerLocal7);
                        i7 |= 16;
                        i4 = 9;
                        i5 = 7;
                        i6 = 6;
                    case 5:
                        handlerLocal6 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, setAppxVersionInWorker.onExtraCallback, handlerLocal6);
                        i7 |= 32;
                        i4 = 9;
                    case 6:
                        f3 = (Float) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i6, dj3.onWarmupCompleted, f3);
                        i7 |= 64;
                        int i10 = asInterface + 85;
                        IAuthTabCallbackStub = i10 % 128;
                        int i11 = i10 % i2;
                        i4 = 9;
                    case 7:
                        colorAttributeLocal3 = (ColorAttributeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i5, ColorAttributeLocal$.serializer.INSTANCE, colorAttributeLocal3);
                        i7 |= 128;
                    case 8:
                        dIAuthTabCallback2 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 8);
                        i7 |= 256;
                    case 9:
                        imageAttributeLocal2 = (ImageAttributeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i4, startPage.onWarmupCompleted, imageAttributeLocal2);
                        i7 |= 512;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            TextAttributeLocal textAttributeLocal4 = textAttributeLocal3;
            i = i7;
            f = f3;
            imageAttributeLocal = imageAttributeLocal2;
            colorAttributeLocal = colorAttributeLocal3;
            paddingLocal = paddingLocal3;
            colorAttributeLocal2 = colorAttributeLocal5;
            d = dIAuthTabCallback2;
            handlerLocal = handlerLocal7;
            handlerLocal2 = handlerLocal6;
            textAttributeLocal = textAttributeLocal4;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new RoundButtonAttributeLocal(i, textAttributeLocal, colorAttributeLocal2, num, paddingLocal, handlerLocal, handlerLocal2, f, colorAttributeLocal, d, imageAttributeLocal, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m509deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 33;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        RoundButtonAttributeLocal roundButtonAttributeLocalDeserialize = deserialize(decoder);
        if (i3 == 0) {
            int i4 = 1 / 0;
        }
        return roundButtonAttributeLocalDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull RoundButtonAttributeLocal roundButtonAttributeLocal) {
        int i = 2 % 2;
        int i2 = asInterface + 99;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(roundButtonAttributeLocal, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            RoundButtonAttributeLocal.onWarmupCompleted(roundButtonAttributeLocal, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(roundButtonAttributeLocal, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        RoundButtonAttributeLocal.onWarmupCompleted(roundButtonAttributeLocal, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 93;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (RoundButtonAttributeLocal) obj);
        if (i3 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 21;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x01ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        boolean z;
        int i4 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onNavigationEvent)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            long j = 0;
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43423 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (KeyEvent.getMaxKeyCode() >> 16) + 42, 22439 - KeyEvent.getDeadChar(0, 0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            boolean z2 = iIntValue == -1;
            if (z2) {
                int i5 = $10 + 87;
                $11 = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
                byte[] bArr = onExtraCallback;
                char c = '0';
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i6 = 0;
                    while (i6 < length) {
                        try {
                            Object[] objArr3 = {Integer.valueOf(bArr[i6])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                char cIndexOf = (char) (12843 - TextUtils.indexOf("", "", 0));
                                int mirror = 'g' - AndroidCharacter.getMirror(c);
                                int i7 = 2168 - (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1));
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cIndexOf, mirror, i7, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr2[i6] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                            i6++;
                            j = 0;
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
                    int i8 = $11 + 13;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                    byte[] bArr3 = onExtraCallback;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onExtraCallbackWithResult)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AndroidCharacter.getMirror('0') + 43376), 41 - TextUtils.indexOf((CharSequence) "", '0', 0), 22439 - KeyEvent.normalizeMetaState(0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                } else {
                    iIntValue = (short) (((short) (onWarmupCompleted[i + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                int i10 = ((i + iIntValue) - 2) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L)));
                if (z2) {
                    int i11 = $11 + 59;
                    $10 = i11 % 128;
                    int i12 = i11 % 2 != 0 ? 0 : 1;
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i10 + i12;
                    Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(IAuthTabCallback), sb};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 86 - (ViewConfiguration.getLongPressTimeout() >> 16), Color.red(0) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    byte[] bArr4 = onExtraCallback;
                    if (bArr4 != null) {
                        int length2 = bArr4.length;
                        byte[] bArr5 = new byte[length2];
                        for (int i13 = 0; i13 < length2; i13++) {
                            bArr5[i13] = (byte) (bArr4[i13] ^ (-4629411779493505016L));
                        }
                        bArr4 = bArr5;
                    }
                    if (bArr4 != null) {
                        int i14 = $10 + 101;
                        $11 = i14 % 128;
                        int i15 = i14 % 2;
                        z = true;
                    } else {
                        z = false;
                    }
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                    while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                        if (z) {
                            byte[] bArr6 = onExtraCallback;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                        } else {
                            short[] sArr = onWarmupCompleted;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                        }
                        sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                    }
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

    static void onExtraCallback() {
        onExtraCallbackWithResult = 999923450;
        onNavigationEvent = -1538795501;
        IAuthTabCallback = 1658872222;
        onExtraCallback = new byte[]{-26, 9, -21, 8};
    }
}
