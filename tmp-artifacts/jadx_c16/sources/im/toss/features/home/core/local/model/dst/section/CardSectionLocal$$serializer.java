package im.toss.features.home.core.local.model.dst.section;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.features.home.core.local.model.dst.property.ColorAttributeLocal;
import im.toss.features.home.core.local.model.dst.property.ColorAttributeLocal$;
import im.toss.features.home.core.local.model.dst.property.MarginLocal;
import im.toss.features.home.core.local.model.dst.property.MarginLocal$$serializer;
import im.toss.features.home.core.local.model.dst.property.OuterStrokeLocal;
import im.toss.features.home.core.local.model.dst.property.OuterStrokeLocal$$serializer;
import im.toss.features.home.core.local.model.dst.property.PaddingLocal;
import im.toss.features.home.core.local.model.dst.property.PaddingLocal$$serializer;
import im.toss.features.home.core.local.model.dst.property.StrokeAttributeLocal;
import im.toss.features.home.core.local.model.dst.property.StrokeAttributeLocal$$serializer;
import im.toss.features.home.core.local.model.dst.section.BaseSectionLocal;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.aeu2;
import o.getWriggleLayout;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.setVideoListener;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CardSectionLocal$$serializer implements aeu2<CardSectionLocal> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    public static final CardSectionLocal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int[] onNavigationEvent;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 55;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        if (i3 == 0) {
            int i4 = 87 / 0;
        }
        return serialDescriptor;
    }

    static {
        onWarmupCompleted();
        CardSectionLocal$$serializer cardSectionLocal$$serializer = new CardSectionLocal$$serializer();
        INSTANCE = cardSectionLocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.section.CardSectionLocal", cardSectionLocal$$serializer, 10);
        setanimationsloop.onWarmupCompleted("id", false);
        Object[] objArr = new Object[1];
        a(new int[]{-1296612781, -1492471035}, TextUtils.lastIndexOf("", '0') + 5, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("items", false);
        setanimationsloop.onWarmupCompleted("padding", false);
        setanimationsloop.onWarmupCompleted("margin", false);
        setanimationsloop.onWarmupCompleted("backgroundColor", false);
        setanimationsloop.onWarmupCompleted("cornerRadius", false);
        setanimationsloop.onWarmupCompleted("corners", false);
        setanimationsloop.onWarmupCompleted("stroke", false);
        setanimationsloop.onWarmupCompleted("outerStroke", false);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 5;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            int i2 = 73 / 0;
        }
    }

    private CardSectionLocal$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnNavigationEvent = CardSectionLocal.onNavigationEvent();
        KSerializer<?>[] kSerializerArr = {getWriggleLayout.onNavigationEvent, sp.IAuthTabCallback((KSerializer) lazyArrOnNavigationEvent[1].getValue()), lazyArrOnNavigationEvent[2].getValue(), sp.IAuthTabCallback(PaddingLocal$$serializer.INSTANCE), sp.IAuthTabCallback(MarginLocal$$serializer.INSTANCE), sp.IAuthTabCallback(ColorAttributeLocal$.serializer.INSTANCE), sp.IAuthTabCallback(setVideoListener.onWarmupCompleted), lazyArrOnNavigationEvent[7].getValue(), sp.IAuthTabCallback(StrokeAttributeLocal$$serializer.INSTANCE), sp.IAuthTabCallback(OuterStrokeLocal$$serializer.INSTANCE)};
        int i4 = onExtraCallback + 79;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final CardSectionLocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        PaddingLocal paddingLocal;
        int i;
        StrokeAttributeLocal strokeAttributeLocal;
        Set set;
        List list;
        OuterStrokeLocal outerStrokeLocal;
        MarginLocal marginLocal;
        String str;
        ColorAttributeLocal colorAttributeLocal;
        Double d;
        BaseSectionLocal.onWarmupCompleted onwarmupcompleted;
        Double d2;
        ColorAttributeLocal colorAttributeLocal2;
        int i2 = 2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnNavigationEvent = CardSectionLocal.onNavigationEvent();
        int i4 = 9;
        int i5 = 8;
        OuterStrokeLocal outerStrokeLocal2 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i6 = onExtraCallback + 95;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            BaseSectionLocal.onWarmupCompleted onwarmupcompleted2 = (BaseSectionLocal.onWarmupCompleted) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArrOnNavigationEvent[1].getValue(), (Object) null);
            List list2 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, (jp) lazyArrOnNavigationEvent[2].getValue(), (Object) null);
            PaddingLocal paddingLocal2 = (PaddingLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, PaddingLocal$$serializer.INSTANCE, (Object) null);
            MarginLocal marginLocal2 = (MarginLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, MarginLocal$$serializer.INSTANCE, (Object) null);
            ColorAttributeLocal colorAttributeLocal3 = (ColorAttributeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, ColorAttributeLocal$.serializer.INSTANCE, (Object) null);
            Double d3 = (Double) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, setVideoListener.onWarmupCompleted, (Object) null);
            Set set2 = (Set) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 7, (jp) lazyArrOnNavigationEvent[7].getValue(), (Object) null);
            StrokeAttributeLocal strokeAttributeLocal2 = (StrokeAttributeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, StrokeAttributeLocal$$serializer.INSTANCE, (Object) null);
            set = set2;
            outerStrokeLocal = (OuterStrokeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 9, OuterStrokeLocal$$serializer.INSTANCE, (Object) null);
            d = d3;
            strokeAttributeLocal = strokeAttributeLocal2;
            marginLocal = marginLocal2;
            colorAttributeLocal = colorAttributeLocal3;
            i = 1023;
            onwarmupcompleted = onwarmupcompleted2;
            list = list2;
            str = strAsInterface;
            paddingLocal = paddingLocal2;
        } else {
            int i8 = 0;
            boolean z = true;
            StrokeAttributeLocal strokeAttributeLocal3 = null;
            Set set3 = null;
            paddingLocal = null;
            List list3 = null;
            MarginLocal marginLocal3 = null;
            BaseSectionLocal.onWarmupCompleted onwarmupcompleted3 = null;
            Double d4 = null;
            ColorAttributeLocal colorAttributeLocal4 = null;
            String strAsInterface2 = null;
            while (z) {
                int i9 = onExtraCallback + 5;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % i2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                        i2 = 2;
                        i4 = 9;
                        i5 = 8;
                    case 0:
                        strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i8 |= 1;
                        onwarmupcompleted3 = onwarmupcompleted3;
                        colorAttributeLocal4 = colorAttributeLocal4;
                        d4 = d4;
                        i2 = 2;
                        i4 = 9;
                        i5 = 8;
                    case 1:
                        onwarmupcompleted3 = (BaseSectionLocal.onWarmupCompleted) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArrOnNavigationEvent[1].getValue(), onwarmupcompleted3);
                        i8 |= 2;
                        i2 = 2;
                        i4 = 9;
                        i5 = 8;
                    case 2:
                        list3 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, i2, (jp) lazyArrOnNavigationEvent[i2].getValue(), list3);
                        i8 |= 4;
                        i4 = 9;
                        i5 = 8;
                    case 3:
                        d2 = d4;
                        colorAttributeLocal2 = colorAttributeLocal4;
                        paddingLocal = (PaddingLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, PaddingLocal$$serializer.INSTANCE, paddingLocal);
                        i8 |= 8;
                        int i11 = IAuthTabCallback + 19;
                        onExtraCallback = i11 % 128;
                        int i12 = i11 % i2;
                        colorAttributeLocal4 = colorAttributeLocal2;
                        d4 = d2;
                        i4 = 9;
                        i5 = 8;
                    case 4:
                        d2 = d4;
                        colorAttributeLocal2 = colorAttributeLocal4;
                        marginLocal3 = (MarginLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, MarginLocal$$serializer.INSTANCE, marginLocal3);
                        i8 |= 16;
                        colorAttributeLocal4 = colorAttributeLocal2;
                        d4 = d2;
                        i4 = 9;
                        i5 = 8;
                    case 5:
                        i8 |= 32;
                        colorAttributeLocal4 = (ColorAttributeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, ColorAttributeLocal$.serializer.INSTANCE, colorAttributeLocal4);
                        i4 = 9;
                        i5 = 8;
                    case 6:
                        i8 |= 64;
                        d4 = (Double) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, setVideoListener.onWarmupCompleted, d4);
                        i4 = 9;
                    case 7:
                        set3 = (Set) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 7, (jp) lazyArrOnNavigationEvent[7].getValue(), set3);
                        i8 |= 128;
                    case 8:
                        strokeAttributeLocal3 = (StrokeAttributeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i5, StrokeAttributeLocal$$serializer.INSTANCE, strokeAttributeLocal3);
                        i8 |= 256;
                    case 9:
                        outerStrokeLocal2 = (OuterStrokeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i4, OuterStrokeLocal$$serializer.INSTANCE, outerStrokeLocal2);
                        i8 |= 512;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            BaseSectionLocal.onWarmupCompleted onwarmupcompleted4 = onwarmupcompleted3;
            i = i8;
            strokeAttributeLocal = strokeAttributeLocal3;
            set = set3;
            list = list3;
            outerStrokeLocal = outerStrokeLocal2;
            marginLocal = marginLocal3;
            str = strAsInterface2;
            colorAttributeLocal = colorAttributeLocal4;
            d = d4;
            onwarmupcompleted = onwarmupcompleted4;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new CardSectionLocal(i, str, onwarmupcompleted, list, paddingLocal, marginLocal, colorAttributeLocal, d, set, strokeAttributeLocal, outerStrokeLocal, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m467deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 61;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        CardSectionLocal cardSectionLocalDeserialize = deserialize(decoder);
        if (i3 == 0) {
            int i4 = 57 / 0;
        }
        return cardSectionLocalDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CardSectionLocal cardSectionLocal) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 13;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(cardSectionLocal, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        CardSectionLocal.onExtraCallbackWithResult(cardSectionLocal, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallback + 63;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 87;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CardSectionLocal) obj);
        if (i3 == 0) {
            int i4 = 51 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallback + 49;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = onNavigationEvent;
        int i5 = -1469660336;
        float f = 0.0f;
        int i6 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFraction(0, f, f) > f ? 1 : (TypedValue.complexToFraction(0, f, f) == f ? 0 : -1)), Color.argb(0, 0, 0, 0) + 72, 8849 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i7] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i7++;
                    i5 = -1469660336;
                    f = 0.0f;
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
        int[] iArr5 = onNavigationEvent;
        if (iArr5 != null) {
            int i8 = $11 + 121;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i10 = 0;
            while (i10 < length3) {
                int i11 = $10 + 27;
                $11 = i11 % 128;
                if (i11 % i3 == 0) {
                    try {
                        Object[] objArr3 = new Object[1];
                        objArr3[i6] = Integer.valueOf(iArr5[i10]);
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myPid() >> 22), 72 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 8849 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr6[i10] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    try {
                        Object[] objArr4 = {Integer.valueOf(iArr5[i10])};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getTrimmedLength(""), TextUtils.indexOf((CharSequence) "", '0', 0) + 73, 8848 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr6[i10] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                        i10++;
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                }
                i3 = 2;
                i6 = 0;
            }
            i2 = i6;
            iArr5 = iArr6;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr5, i2, iArr4, i2, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            int i12 = $11 + 69;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i14 = $11 + 37;
            $10 = i14 % 128;
            if (i14 % 2 != 0) {
                int i15 = 3 % 5;
            }
            for (int i16 = 0; i16 < 16; i16++) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i16];
                try {
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - View.MeasureSpec.makeMeasureSpec(0, 0)), 39 - (ViewConfiguration.getScrollBarSize() >> 8), TextUtils.getCapsMode("", 0, 0) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                } catch (Throwable th4) {
                    Throwable cause4 = th4.getCause();
                    if (cause4 == null) {
                        throw th4;
                    }
                    throw cause4;
                }
            }
            int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i17;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i19 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
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
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4032 - TextUtils.indexOf((CharSequence) "", '0')), 78 - (ViewConfiguration.getTapTimeout() >> 16), 7398 - Color.argb(0, 0, 0, 0), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void onWarmupCompleted() {
        onNavigationEvent = new int[]{-255943617, 1650699770, 266196105, 1769812898, 870182143, 1853243131, -993091500, 1160491143, 307346912, -1059833937, -1975445261, 1923888003, 1907112633, 1798366458, -33954929, -767513224, 1694602593, 1532332287};
    }
}
