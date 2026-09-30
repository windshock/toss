package im.toss.features.home.core.local.model.dst.element;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.home.core.local.model.dst.element.ConsumptionAmountTopLocal;
import im.toss.features.home.core.local.model.dst.widget.TextAttributeLocal;
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
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ConsumptionAmountTopLocal$Title$Text$$serializer implements aeu2<ConsumptionAmountTopLocal.Title.Text> {
    private static int IAuthTabCallback;
    private static int IAuthTabCallbackDefault;
    public static final ConsumptionAmountTopLocal$Title$Text$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static short[] onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static byte[] onWarmupCompleted;
    private static final byte[] $$a = {105, -91, -115, 31};
    private static final int $$b = 71;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asInterface = 0;
    private static int onTransact = 1;
    private static int asBinder = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, int i2, int i3) {
        int i4;
        int i5 = 3 - (i3 * 4);
        byte[] bArr = $$a;
        int i6 = i * 3;
        int i7 = (i2 * 4) + 115;
        byte[] bArr2 = new byte[1 - i6];
        int i8 = 0 - i6;
        if (bArr == null) {
            int i9 = i5;
            int i10 = 0;
            i7 = (-i7) + i9;
            i4 = i10;
            int i11 = i5;
            int i12 = i7;
            bArr2[i4] = (byte) i12;
            int i13 = i11 + 1;
            i10 = i4 + 1;
            if (i4 == i8) {
                return new String(bArr2, 0);
            }
            i5 = i13;
            i7 = bArr[i13];
            i9 = i12;
            i7 = (-i7) + i9;
            i4 = i10;
            int i112 = i5;
            int i122 = i7;
            bArr2[i4] = (byte) i122;
            int i132 = i112 + 1;
            i10 = i4 + 1;
            if (i4 == i8) {
            }
        } else {
            i4 = 0;
            int i1122 = i5;
            int i1222 = i7;
            bArr2[i4] = (byte) i1222;
            int i1322 = i1122 + 1;
            i10 = i4 + 1;
            if (i4 == i8) {
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 59;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 97;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        IAuthTabCallbackDefault = 0;
        onExtraCallbackWithResult();
        ConsumptionAmountTopLocal$Title$Text$$serializer consumptionAmountTopLocal$Title$Text$$serializer = new ConsumptionAmountTopLocal$Title$Text$$serializer();
        INSTANCE = consumptionAmountTopLocal$Title$Text$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.ConsumptionAmountTopLocal.Title.Text", consumptionAmountTopLocal$Title$Text$$serializer, 1);
        Object[] objArr = new Object[1];
        a((short) (61 - (ViewConfiguration.getTouchSlop() >> 8)), (byte) (Color.green(0) - 117), View.resolveSize(0, 0) + 940517973, 1140516963 - TextUtils.lastIndexOf("", '0', 0, 0), (-95) - TextUtils.getOffsetBefore("", 0), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        descriptor = setanimationsloop;
        int i = asBinder + 39;
        IAuthTabCallbackDefault = i % 128;
        if (i % 2 != 0) {
            int i2 = 76 / 0;
        }
    }

    private ConsumptionAmountTopLocal$Title$Text$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onTransact + 17;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {TextAttributeLocal$.serializer.INSTANCE};
        int i4 = onTransact + 31;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ConsumptionAmountTopLocal.Title.Text deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        SerialDescriptor serialDescriptor;
        yw ywVarOnWarmupCompleted;
        boolean z;
        TextAttributeLocal textAttributeLocal;
        int i = 2 % 2;
        int i2 = asInterface + 19;
        onTransact = i2 % 128;
        int i3 = 1;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
                i3 = 0;
                textAttributeLocal = (TextAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, TextAttributeLocal$.serializer.INSTANCE, (Object) null);
            }
            z = true;
            TextAttributeLocal textAttributeLocal2 = null;
            int i4 = 0;
            while (z) {
                int i5 = asInterface + 53;
                onTransact = i5 % 128;
                if (i5 % 2 == 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else {
                    if (iOnNavigationEvent != 0) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    textAttributeLocal2 = (TextAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, TextAttributeLocal$.serializer.INSTANCE, textAttributeLocal2);
                    int i6 = asInterface + 17;
                    onTransact = i6 % 128;
                    int i7 = i6 % 2;
                    i4 = 1;
                }
            }
            textAttributeLocal = textAttributeLocal2;
            i3 = i4;
        } else {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
                textAttributeLocal = (TextAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, TextAttributeLocal$.serializer.INSTANCE, (Object) null);
            } else {
                z = true;
                TextAttributeLocal textAttributeLocal22 = null;
                int i42 = 0;
                while (z) {
                }
                textAttributeLocal = textAttributeLocal22;
                i3 = i42;
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new ConsumptionAmountTopLocal.Title.Text(i3, textAttributeLocal, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m323deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onTransact + 43;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        ConsumptionAmountTopLocal.Title.Text textDeserialize = deserialize(decoder);
        int i4 = onTransact + 83;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 58 / 0;
        }
        return textDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ConsumptionAmountTopLocal.Title.Text text) {
        int i = 2 % 2;
        int i2 = onTransact + 41;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(text, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            ConsumptionAmountTopLocal.Title.Text.onWarmupCompleted(text, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(text, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        ConsumptionAmountTopLocal.Title.Text.onWarmupCompleted(text, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = onTransact + 23;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 115;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ConsumptionAmountTopLocal.Title.Text) obj);
        int i4 = onTransact + 91;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = asInterface + 55;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = asInterface + 117;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0221  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        boolean z;
        boolean z2;
        int i4;
        int i5 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onExtraCallbackWithResult)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - View.resolveSizeAndState(0, 0, 0)), (ViewConfiguration.getEdgeSlop() >> 16) + 42, 22439 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            Object obj = null;
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i6 = $10 + 39;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int i8 = $10 + 95;
                $11 = i8 % 128;
                if (i8 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                byte[] bArr = onWarmupCompleted;
                long j = 0;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i9 = 0;
                    while (i9 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i9])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12842 - MotionEvent.axisFromString("")), (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)) + 54, 2167 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr2[i9] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        i9++;
                        j = 0;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    int i10 = $10 + 93;
                    $11 = i10 % 128;
                    if (i10 % 2 == 0) {
                        byte[] bArr3 = onWarmupCompleted;
                        Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(IAuthTabCallback)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionChild(0L) + 43425), Color.alpha(0) + 42, 22440 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i4 = ((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) >> ((int) (onExtraCallbackWithResult | (-4629411779493505016L)));
                    } else {
                        byte[] bArr4 = onWarmupCompleted;
                        Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(IAuthTabCallback)};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 43424), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 42, AndroidCharacter.getMirror('0') + 22391, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i4 = ((byte) (bArr4[((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue()] ^ (-4629411779493505016L))) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L)));
                    }
                    iIntValue = (byte) i4;
                } else {
                    iIntValue = (short) (((short) (onExtraCallback[i + ((int) (IAuthTabCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                int i11 = ((i + iIntValue) - 2) + ((int) (IAuthTabCallback ^ (-4629411779493505016L)));
                if (z) {
                    int i12 = $10 + 125;
                    $11 = i12 % 128;
                    int i13 = i12 % 2 == 0 ? 0 : 1;
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i11 + i13;
                    Object[] objArr6 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onNavigationEvent), sb};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 87 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 9567 - TextUtils.indexOf("", "", 0, 0), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objOnExtraCallback5).invoke(null, objArr6)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    byte[] bArr5 = onWarmupCompleted;
                    if (bArr5 != null) {
                        int length2 = bArr5.length;
                        byte[] bArr6 = new byte[length2];
                        for (int i14 = 0; i14 < length2; i14++) {
                            int i15 = $10 + 101;
                            $11 = i15 % 128;
                            int i16 = i15 % 2;
                            bArr6[i14] = (byte) (bArr5[i14] ^ (-4629411779493505016L));
                        }
                        bArr5 = bArr6;
                    }
                    if (bArr5 != null) {
                        int i17 = $11 + 3;
                        $10 = i17 % 128;
                        int i18 = i17 % 2;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                    while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                        if (z2) {
                            byte[] bArr7 = onWarmupCompleted;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr7[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                        } else {
                            short[] sArr = onExtraCallback;
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
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    static void onExtraCallbackWithResult() {
        IAuthTabCallback = 1672940963;
        onExtraCallbackWithResult = -1538795434;
        onNavigationEvent = 407027736;
        onWarmupCompleted = new byte[]{-82, 50, 83, 53};
    }
}
