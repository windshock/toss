package im.toss.features.home.core.local.model.dst.widget;

import android.graphics.Color;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.home.core.local.model.dst.handler.HandlerLocal;
import im.toss.features.home.core.local.model.dst.widget.FullTooltipAttributeLocal;
import java.lang.reflect.Method;
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
import o.setAppxVersionInWorker;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class FullTooltipAttributeLocal$$serializer implements aeu2<FullTooltipAttributeLocal> {
    private static int IAuthTabCallback;
    public static final FullTooltipAttributeLocal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static byte[] onExtraCallback;
    private static short[] onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static int onTransact;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {41, -64, -63, -4};
    private static final int $$b = 156;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 0;
    private static int asInterface = 1;
    private static int IAuthTabCallbackStub = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, int i2, byte b) {
        int i3;
        int i4 = (i2 * 4) + 4;
        byte[] bArr = $$a;
        int i5 = i * 4;
        int i6 = (b * 3) + 115;
        byte[] bArr2 = new byte[1 - i5];
        int i7 = 0 - i5;
        if (bArr == null) {
            int i8 = i7;
            int i9 = i4;
            i3 = 0;
            i4++;
            i6 = i9 + i8;
            int i10 = i6;
            int i11 = i4;
            bArr2[i3] = (byte) i10;
            if (i3 == i7) {
                return new String(bArr2, 0);
            }
            i8 = bArr[i11];
            i3++;
            i9 = i10;
            i4 = i11;
            i4++;
            i6 = i9 + i8;
            int i102 = i6;
            int i112 = i4;
            bArr2[i3] = (byte) i102;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            int i1022 = i6;
            int i1122 = i4;
            bArr2[i3] = (byte) i1022;
            if (i3 == i7) {
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 17;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i2 + 9;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return serialDescriptor;
    }

    static {
        onTransact = 0;
        IAuthTabCallback();
        FullTooltipAttributeLocal$$serializer fullTooltipAttributeLocal$$serializer = new FullTooltipAttributeLocal$$serializer();
        INSTANCE = fullTooltipAttributeLocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.widget.FullTooltipAttributeLocal", fullTooltipAttributeLocal$$serializer, 4);
        Object[] objArr = new Object[1];
        a((short) (Color.rgb(0, 0, 0) + 16777216), (byte) ((-48) - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), View.resolveSize(0, 0) - 774162613, (KeyEvent.getMaxKeyCode() >> 16) + 2008780118, (ViewConfiguration.getJumpTapTimeout() >> 16) - 52, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("textAlignment", false);
        setanimationsloop.onWarmupCompleted("handler", false);
        setanimationsloop.onWarmupCompleted("textAlt", false);
        descriptor = setanimationsloop;
        int i = IAuthTabCallbackStub + 65;
        onTransact = i % 128;
        int i2 = i % 2;
    }

    private FullTooltipAttributeLocal$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = asInterface + 59;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Lazy[] lazyArrOnWarmupCompleted = FullTooltipAttributeLocal.onWarmupCompleted();
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            return new KSerializer[]{getwrigglelayout, lazyArrOnWarmupCompleted[1].getValue(), sp.IAuthTabCallback(setAppxVersionInWorker.onExtraCallback), sp.IAuthTabCallback(getwrigglelayout)};
        }
        Lazy[] lazyArrOnWarmupCompleted2 = FullTooltipAttributeLocal.onWarmupCompleted();
        KSerializer<?>[] kSerializerArr = new KSerializer[3];
        getWriggleLayout getwrigglelayout2 = getWriggleLayout.onNavigationEvent;
        kSerializerArr[0] = getwrigglelayout2;
        kSerializerArr[0] = lazyArrOnWarmupCompleted2[1].getValue();
        kSerializerArr[2] = sp.IAuthTabCallback(setAppxVersionInWorker.onExtraCallback);
        kSerializerArr[4] = sp.IAuthTabCallback(getwrigglelayout2);
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final FullTooltipAttributeLocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        HandlerLocal handlerLocal;
        String str;
        String str2;
        int i;
        FullTooltipAttributeLocal.onExtraCallbackWithResult onextracallbackwithresult;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnWarmupCompleted = FullTooltipAttributeLocal.onWarmupCompleted();
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = asInterface + 15;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            FullTooltipAttributeLocal.onExtraCallbackWithResult onextracallbackwithresult2 = (FullTooltipAttributeLocal.onExtraCallbackWithResult) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnWarmupCompleted[1].getValue(), (Object) null);
            handlerLocal = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, setAppxVersionInWorker.onExtraCallback, (Object) null);
            onextracallbackwithresult = onextracallbackwithresult2;
            str2 = strAsInterface;
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, (Object) null);
            i = 15;
        } else {
            int i5 = 0;
            boolean z = true;
            HandlerLocal handlerLocal2 = null;
            FullTooltipAttributeLocal.onExtraCallbackWithResult onextracallbackwithresult3 = null;
            String strAsInterface2 = null;
            String str3 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i6 = asInterface + 11;
                    IAuthTabCallbackDefault = i6 % 128;
                    if (i6 % 2 != 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (iOnNavigationEvent == 0) {
                        strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i5 |= 1;
                    } else if (iOnNavigationEvent == 1) {
                        onextracallbackwithresult3 = (FullTooltipAttributeLocal.onExtraCallbackWithResult) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnWarmupCompleted[1].getValue(), onextracallbackwithresult3);
                        i5 |= 2;
                    } else if (iOnNavigationEvent == 2) {
                        handlerLocal2 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, setAppxVersionInWorker.onExtraCallback, handlerLocal2);
                        i5 |= 4;
                    } else {
                        if (iOnNavigationEvent != 3) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, str3);
                        i5 |= 8;
                        int i7 = IAuthTabCallbackDefault + 17;
                        asInterface = i7 % 128;
                        int i8 = i7 % 2;
                    }
                } else {
                    z = false;
                }
            }
            handlerLocal = handlerLocal2;
            str = str3;
            str2 = strAsInterface2;
            i = i5;
            onextracallbackwithresult = onextracallbackwithresult3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new FullTooltipAttributeLocal(i, str2, onextracallbackwithresult, handlerLocal, str, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m489deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 59;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull FullTooltipAttributeLocal fullTooltipAttributeLocal) {
        int i = 2 % 2;
        int i2 = asInterface + 15;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(fullTooltipAttributeLocal, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        FullTooltipAttributeLocal.onNavigationEvent(fullTooltipAttributeLocal, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallbackDefault + 45;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 81 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 41;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (FullTooltipAttributeLocal) obj);
        int i4 = IAuthTabCallbackDefault + 43;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = asInterface + 69;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x01a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        int i5 = 2;
        int i6 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(IAuthTabCallback)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            long j = 0;
            float f = 0.0f;
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43425 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 42 - View.resolveSize(0, 0), 22439 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            boolean z = iIntValue == -1;
            if (z) {
                byte[] bArr = onExtraCallback;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i7 = 0;
                    while (i7 < length) {
                        int i8 = $10 + 25;
                        $11 = i8 % 128;
                        int i9 = i8 % i5;
                        Object[] objArr3 = {Integer.valueOf(bArr[i7])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            char c = (char) ((TypedValue.complexToFraction(0, f, f) > f ? 1 : (TypedValue.complexToFraction(0, f, f) == f ? 0 : -1)) + 12843);
                            int packedPositionChild = ExpandableListView.getPackedPositionChild(j) + 56;
                            int i10 = 2168 - (ViewConfiguration.getScrollFriction() > f ? 1 : (ViewConfiguration.getScrollFriction() == f ? 0 : -1));
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c, packedPositionChild, i10, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr2[i7] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        i7++;
                        i5 = 2;
                        j = 0;
                        f = 0.0f;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = onExtraCallback;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onWarmupCompleted)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.rgb(0, 0, 0) + 16820640), 42 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ViewConfiguration.getTapTimeout() >> 16) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallback ^ (-4629411779493505016L))));
                    i4 = 2;
                } else {
                    iIntValue = (short) (((short) (onExtraCallbackWithResult[i + ((int) (onWarmupCompleted ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallback ^ (-4629411779493505016L))));
                    int i11 = $10 + 35;
                    $11 = i11 % 128;
                    i4 = 2;
                    int i12 = i11 % 2;
                }
            } else {
                i4 = 2;
            }
            if (iIntValue > 0) {
                int i13 = $10;
                int i14 = i13 + 117;
                $11 = i14 % 128;
                int i15 = i14 % i4;
                int i16 = ((i + iIntValue) - i4) + ((int) (onWarmupCompleted ^ (-4629411779493505016L)));
                if (z) {
                    int i17 = i13 + 121;
                    $11 = i17 % 128;
                    int i18 = i17 % 2 == 0 ? 0 : 1;
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i16 + i18;
                    Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onNavigationEvent), sb};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (MotionEvent.axisFromString("") + 1), View.MeasureSpec.getMode(0) + 86, 9567 - View.MeasureSpec.getSize(0), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    byte[] bArr4 = onExtraCallback;
                    if (bArr4 != null) {
                        int length2 = bArr4.length;
                        byte[] bArr5 = new byte[length2];
                        int i19 = 0;
                        while (i19 < length2) {
                            bArr5[i19] = (byte) (bArr4[i19] ^ (-4629411779493505016L));
                            i19++;
                            int i20 = $11 + 109;
                            $10 = i20 % 128;
                            int i21 = i20 % 2;
                        }
                        bArr4 = bArr5;
                    }
                    boolean z2 = !(bArr4 == null);
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                    while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                        if (z2) {
                            byte[] bArr6 = onExtraCallback;
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

    static void IAuthTabCallback() {
        onWarmupCompleted = -1973219139;
        IAuthTabCallback = -1538795461;
        onNavigationEvent = 738437910;
        onExtraCallback = new byte[]{-39, 36, -53, 41};
    }
}
