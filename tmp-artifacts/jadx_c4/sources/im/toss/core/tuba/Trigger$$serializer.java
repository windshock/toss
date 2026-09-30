package im.toss.core.tuba;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.tmoney.LiveCheckConstants;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Lazy;
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
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final /* synthetic */ class Trigger$$serializer implements aeu2<Trigger> {
    private static int IAuthTabCallback;
    public static final Trigger$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback;
    private static short[] onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static int onTransact;
    private static byte[] onWarmupCompleted;
    private static final byte[] $$a = {8, -40, 43, -43};
    private static final int $$b = 53;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int asInterface = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, short s, byte b2) {
        int i;
        int i2;
        int i3 = 1 - (s * 2);
        int i4 = 115 - (b * 3);
        int i5 = 4 - (b2 * 3);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i3];
        if (bArr == null) {
            int i6 = i3;
            i4 = i5;
            i2 = 0;
            i5++;
            i4 += i6;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i3) {
                return new String(bArr2, 0);
            }
            i6 = bArr[i5];
            i5++;
            i4 += i6;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i3) {
            }
        } else {
            i = 0;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i3) {
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = asBinder + 93;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 99;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        onTransact = 1;
        IAuthTabCallback();
        Trigger$$serializer trigger$$serializer = new Trigger$$serializer();
        INSTANCE = trigger$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.core.tuba.Trigger", trigger$$serializer, 10);
        setanimationsloop.onWarmupCompleted("_id", true);
        Object[] objArr = new Object[1];
        a((short) (ImageFormat.getBitsPerPixel(0) + 7), (byte) View.MeasureSpec.getMode(0), 1912012973 + KeyEvent.keyCodeFromString(""), (-1742262946) - TextUtils.indexOf("", "", 0), AndroidCharacter.getMirror('0') - 'f', objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("triggerType", true);
        setanimationsloop.onWarmupCompleted("parameters", true);
        setanimationsloop.onWarmupCompleted("conditions", true);
        setanimationsloop.onWarmupCompleted("triggerLimit", true);
        setanimationsloop.onWarmupCompleted("triggerWhen", true);
        setanimationsloop.onWarmupCompleted("triggerFrequencyByPeriod", true);
        setanimationsloop.onWarmupCompleted("triggerInactiveHour", true);
        setanimationsloop.onWarmupCompleted("triggerFrequencyCapGroupId", true);
        descriptor = setanimationsloop;
        int i = asInterface + 123;
        onTransact = i % 128;
        if (i % 2 == 0) {
            int i2 = 76 / 0;
        }
    }

    private Trigger$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = asBinder + 97;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnExtraCallbackWithResult = Trigger.onExtraCallbackWithResult();
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {getwrigglelayout, getwrigglelayout, getwrigglelayout, lazyArrOnExtraCallbackWithResult[3].getValue(), lazyArrOnExtraCallbackWithResult[4].getValue(), sp.IAuthTabCallback(TriggerLimit$$serializer.INSTANCE), sp.IAuthTabCallback(TriggerWhen$$serializer.INSTANCE), sp.IAuthTabCallback(TriggerFrequencyByPeriod$$serializer.INSTANCE), sp.IAuthTabCallback(TriggerInactiveHour$$serializer.INSTANCE), sp.IAuthTabCallback(getwrigglelayout)};
        int i4 = IAuthTabCallbackStub + 21;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 85 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final Trigger deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        TriggerWhen triggerWhen;
        Map map;
        TriggerInactiveHour triggerInactiveHour;
        String str;
        TriggerFrequencyByPeriod triggerFrequencyByPeriod;
        List list;
        String str2;
        String str3;
        TriggerLimit triggerLimit;
        String str4;
        char c;
        boolean z;
        char c2;
        int i2 = 2;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStub + 29;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnExtraCallbackWithResult = Trigger.onExtraCallbackWithResult();
        int i6 = 9;
        int i7 = 8;
        boolean z2 = true;
        TriggerFrequencyByPeriod triggerFrequencyByPeriod2 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i8 = IAuthTabCallbackStub + 89;
            asBinder = i8 % 128;
            int i9 = i8 % 2;
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            String strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            Map map2 = (Map) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, (jp) lazyArrOnExtraCallbackWithResult[3].getValue(), (Object) null);
            List list2 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, (jp) lazyArrOnExtraCallbackWithResult[4].getValue(), (Object) null);
            TriggerLimit triggerLimit2 = (TriggerLimit) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, TriggerLimit$$serializer.INSTANCE, (Object) null);
            TriggerWhen triggerWhen2 = (TriggerWhen) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, TriggerWhen$$serializer.INSTANCE, (Object) null);
            TriggerFrequencyByPeriod triggerFrequencyByPeriod3 = (TriggerFrequencyByPeriod) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, TriggerFrequencyByPeriod$$serializer.INSTANCE, (Object) null);
            TriggerInactiveHour triggerInactiveHour2 = (TriggerInactiveHour) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, TriggerInactiveHour$$serializer.INSTANCE, (Object) null);
            String str5 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 9, getWriggleLayout.onNavigationEvent, (Object) null);
            int i10 = IAuthTabCallbackStub + 3;
            asBinder = i10 % 128;
            int i11 = i10 % 2;
            i = 1023;
            list = list2;
            str4 = strAsInterface;
            str = str5;
            triggerFrequencyByPeriod = triggerFrequencyByPeriod3;
            triggerWhen = triggerWhen2;
            triggerLimit = triggerLimit2;
            triggerInactiveHour = triggerInactiveHour2;
            str2 = strAsInterface2;
            str3 = strAsInterface3;
            map = map2;
        } else {
            int i12 = 0;
            boolean z3 = true;
            TriggerWhen triggerWhen3 = null;
            Map map3 = null;
            TriggerInactiveHour triggerInactiveHour3 = null;
            String str6 = null;
            List list3 = null;
            String strAsInterface4 = null;
            String strAsInterface5 = null;
            TriggerLimit triggerLimit3 = null;
            String strAsInterface6 = null;
            while (z3 == z2) {
                int i13 = asBinder + 25;
                IAuthTabCallbackStub = i13 % 128;
                int i14 = i13 % i2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z3 = false;
                        i2 = 2;
                        i6 = 9;
                        i7 = 8;
                        z2 = true;
                    case 0:
                        z = true;
                        c2 = 7;
                        strAsInterface6 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i12 |= 1;
                        i2 = 2;
                        i6 = 9;
                        i7 = 8;
                        z2 = z;
                    case 1:
                        z = true;
                        c2 = 7;
                        strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                        i12 |= 2;
                        i6 = 9;
                        i7 = 8;
                        z2 = z;
                    case 2:
                        c = 7;
                        strAsInterface5 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, i2);
                        i12 |= 4;
                        i6 = 9;
                        i7 = 8;
                        z2 = true;
                    case 3:
                        c = 7;
                        map3 = (Map) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, (jp) lazyArrOnExtraCallbackWithResult[3].getValue(), map3);
                        i12 |= 8;
                        i6 = 9;
                        i7 = 8;
                        z2 = true;
                    case 4:
                        c = 7;
                        list3 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, (jp) lazyArrOnExtraCallbackWithResult[4].getValue(), list3);
                        i12 |= 16;
                        i6 = 9;
                        i7 = 8;
                        z2 = true;
                    case 5:
                        c = 7;
                        triggerLimit3 = (TriggerLimit) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, TriggerLimit$$serializer.INSTANCE, triggerLimit3);
                        i12 |= 32;
                        i6 = 9;
                        i7 = 8;
                        z2 = true;
                    case 6:
                        triggerWhen3 = (TriggerWhen) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, TriggerWhen$$serializer.INSTANCE, triggerWhen3);
                        i12 |= 64;
                        i6 = 9;
                        z2 = true;
                    case 7:
                        triggerFrequencyByPeriod2 = (TriggerFrequencyByPeriod) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, TriggerFrequencyByPeriod$$serializer.INSTANCE, triggerFrequencyByPeriod2);
                        i12 |= 128;
                        z2 = true;
                    case 8:
                        triggerInactiveHour3 = (TriggerInactiveHour) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i7, TriggerInactiveHour$$serializer.INSTANCE, triggerInactiveHour3);
                        i12 |= 256;
                        z2 = true;
                    case LiveCheckConstants.SVC_LOAD_ADD_IMMEDIATELY /* 9 */:
                        str6 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i6, getWriggleLayout.onNavigationEvent, str6);
                        i12 |= 512;
                        z2 = true;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            i = i12;
            triggerWhen = triggerWhen3;
            map = map3;
            triggerInactiveHour = triggerInactiveHour3;
            str = str6;
            triggerFrequencyByPeriod = triggerFrequencyByPeriod2;
            list = list3;
            str2 = strAsInterface4;
            str3 = strAsInterface5;
            triggerLimit = triggerLimit3;
            str4 = strAsInterface6;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new Trigger(i, str4, str2, str3, map, list, triggerLimit, triggerWhen, triggerFrequencyByPeriod, triggerInactiveHour, str, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m91deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = asBinder + 113;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull Trigger trigger) {
        int i = 2 % 2;
        int i2 = asBinder + 73;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(trigger, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            Trigger.onWarmupCompleted(trigger, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            int i3 = 12 / 0;
        } else {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(trigger, "");
            SerialDescriptor serialDescriptor2 = descriptor;
            vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
            Trigger.onWarmupCompleted(trigger, vylVarOnExtraCallback2, serialDescriptor2);
            vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        }
        int i4 = asBinder + 79;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 45;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (Trigger) obj);
        if (i3 != 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 47;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        int i5;
        int i6 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onNavigationEvent)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - Color.blue(0)), 42 - (ViewConfiguration.getScrollDefaultDelay() >> 16), Drawable.resolveOpacity(0, 0) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i7 = $10 + 89;
                $11 = i7 % 128;
                i4 = i7 % 2 == 0 ? 0 : 1;
            }
            if (i4 != 0) {
                byte[] bArr = onWarmupCompleted;
                if (bArr != null) {
                    int i8 = $11 + 125;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i10 = 0; i10 < length; i10++) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i10])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 56 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 2167 - (ViewConfiguration.getTapTimeout() >> 16), -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr2[i10] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                    }
                    int i11 = $10 + 43;
                    $11 = i11 % 128;
                    i5 = 2;
                    int i12 = i11 % 2;
                    bArr = bArr2;
                } else {
                    i5 = 2;
                }
                if (bArr != null) {
                    byte[] bArr3 = onWarmupCompleted;
                    Object[] objArr4 = new Object[i5];
                    objArr4[1] = Integer.valueOf(onExtraCallback);
                    objArr4[0] = Integer.valueOf(i);
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getOffsetAfter("", 0) + 43424), (ViewConfiguration.getWindowTouchSlop() >> 8) + 42, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                } else {
                    iIntValue = (short) (((short) (onExtraCallbackWithResult[i + ((int) (onExtraCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (onExtraCallback ^ (-4629411779493505016L))) + i4;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(IAuthTabCallback), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 86 - (ViewConfiguration.getJumpTapTimeout() >> 16), 9567 - KeyEvent.keyCodeFromString(""), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = onWarmupCompleted;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i13 = 0; i13 < length2; i13++) {
                        bArr5[i13] = (byte) (bArr4[i13] ^ (-4629411779493505016L));
                    }
                    bArr4 = bArr5;
                }
                boolean z = bArr4 != null;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (z) {
                        byte[] bArr6 = onWarmupCompleted;
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
                    int i14 = $10 + 47;
                    $11 = i14 % 128;
                    int i15 = i14 % 2;
                }
            }
            String string = sb.toString();
            int i16 = $11 + 65;
            $10 = i16 % 128;
            int i17 = i16 % 2;
            objArr[0] = string;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    static void IAuthTabCallback() {
        onExtraCallback = 709830491;
        onNavigationEvent = -1538795459;
        IAuthTabCallback = -1012987112;
        onWarmupCompleted = new byte[]{-57, -6, 14, -27};
    }
}
