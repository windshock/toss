package im.toss.features.home.core.local.model.dst.element;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.features.home.core.local.model.dst.element.AmountTopLocal;
import im.toss.features.home.core.local.model.dst.handler.HandlerLocal;
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
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.aeu2;
import o.getServiceBeans;
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
public final /* synthetic */ class AmountTopLocal$Right$Button$$serializer implements aeu2<AmountTopLocal.Right.Button> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 1;
    public static final AmountTopLocal$Right$Button$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int[] onNavigationEvent = null;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 105;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 33;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        onNavigationEvent();
        AmountTopLocal$Right$Button$$serializer amountTopLocal$Right$Button$$serializer = new AmountTopLocal$Right$Button$$serializer();
        INSTANCE = amountTopLocal$Right$Button$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.AmountTopLocal.Right.Button", amountTopLocal$Right$Button$$serializer, 6);
        Object[] objArr = new Object[1];
        a(new int[]{1733549200, 161588991, -810906903, 1581854403}, View.MeasureSpec.makeMeasureSpec(0, 0) + 5, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("logTitle", false);
        setanimationsloop.onWarmupCompleted("theme", false);
        Object[] objArr2 = new Object[1];
        a(new int[]{-758783485, -1343791498, -810906903, 1581854403}, (-16777211) - Color.rgb(0, 0, 0), objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("size", false);
        setanimationsloop.onWarmupCompleted("handler", false);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 17;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 9 / 0;
        }
    }

    private AmountTopLocal$Right$Button$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 17;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnExtraCallbackWithResult = AmountTopLocal.Right.Button.onExtraCallbackWithResult();
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {getwrigglelayout, sp.IAuthTabCallback(getwrigglelayout), lazyArrOnExtraCallbackWithResult[2].getValue(), lazyArrOnExtraCallbackWithResult[3].getValue(), lazyArrOnExtraCallbackWithResult[4].getValue(), sp.IAuthTabCallback(setAppxVersionInWorker.onExtraCallback)};
        int i4 = onExtraCallback + 1;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final AmountTopLocal.Right.Button deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        String str;
        getServiceBeans.IAuthTabCallbackStub iAuthTabCallbackStub;
        getServiceBeans.onWarmupCompleted onwarmupcompleted;
        HandlerLocal handlerLocal;
        int i;
        getServiceBeans.IAuthTabCallback iAuthTabCallback;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 33;
        onWarmupCompleted = i3 % 128;
        getServiceBeans.IAuthTabCallback iAuthTabCallback2 = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(descriptor);
            AmountTopLocal.Right.Button.onExtraCallbackWithResult();
            ywVarOnWarmupCompleted.extraCallbackWithResult();
            iAuthTabCallback2.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted2 = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnExtraCallbackWithResult = AmountTopLocal.Right.Button.onExtraCallbackWithResult();
        if (!ywVarOnWarmupCompleted2.extraCallbackWithResult()) {
            handlerLocal = null;
            strAsInterface = null;
            str = null;
            iAuthTabCallbackStub = null;
            onwarmupcompleted = null;
            boolean z = true;
            i = 0;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        strAsInterface = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 0);
                        i |= 1;
                        break;
                    case 1:
                        str = (String) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str);
                        i |= 2;
                        break;
                    case 2:
                        iAuthTabCallbackStub = (getServiceBeans.IAuthTabCallbackStub) ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor, 2, (jp) lazyArrOnExtraCallbackWithResult[2].getValue(), iAuthTabCallbackStub);
                        i |= 4;
                        break;
                    case 3:
                        onwarmupcompleted = (getServiceBeans.onWarmupCompleted) ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor, 3, (jp) lazyArrOnExtraCallbackWithResult[3].getValue(), onwarmupcompleted);
                        i |= 8;
                        break;
                    case 4:
                        iAuthTabCallback2 = (getServiceBeans.IAuthTabCallback) ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor, 4, (jp) lazyArrOnExtraCallbackWithResult[4].getValue(), iAuthTabCallback2);
                        i |= 16;
                        break;
                    case 5:
                        handlerLocal = (HandlerLocal) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 5, setAppxVersionInWorker.onExtraCallback, handlerLocal);
                        i |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            iAuthTabCallback = iAuthTabCallback2;
        } else {
            int i4 = onExtraCallback + 89;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            strAsInterface = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 0);
            str = (String) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, (Object) null);
            iAuthTabCallbackStub = (getServiceBeans.IAuthTabCallbackStub) ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor, 2, (jp) lazyArrOnExtraCallbackWithResult[2].getValue(), (Object) null);
            onwarmupcompleted = (getServiceBeans.onWarmupCompleted) ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor, 3, (jp) lazyArrOnExtraCallbackWithResult[3].getValue(), (Object) null);
            getServiceBeans.IAuthTabCallback iAuthTabCallback3 = (getServiceBeans.IAuthTabCallback) ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor, 4, (jp) lazyArrOnExtraCallbackWithResult[4].getValue(), (Object) null);
            handlerLocal = (HandlerLocal) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 5, setAppxVersionInWorker.onExtraCallback, (Object) null);
            i = 63;
            iAuthTabCallback = iAuthTabCallback3;
        }
        String str2 = strAsInterface;
        String str3 = str;
        getServiceBeans.IAuthTabCallbackStub iAuthTabCallbackStub2 = iAuthTabCallbackStub;
        getServiceBeans.onWarmupCompleted onwarmupcompleted2 = onwarmupcompleted;
        int i6 = i;
        ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor);
        return new AmountTopLocal.Right.Button(i6, str2, str3, iAuthTabCallbackStub2, onwarmupcompleted2, iAuthTabCallback, handlerLocal, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m269deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 103;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull AmountTopLocal.Right.Button button) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 89;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(button, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            AmountTopLocal.Right.Button.onExtraCallbackWithResult(button, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(button, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        AmountTopLocal.Right.Button.onExtraCallbackWithResult(button, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = onWarmupCompleted + 43;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 101;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (AmountTopLocal.Right.Button) obj);
        int i4 = onWarmupCompleted + 37;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 70 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 57;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onWarmupCompleted + 1;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = onNavigationEvent;
        float f = 0.0f;
        int i3 = -1469660336;
        if (iArr2 != null) {
            int i4 = $11 + 5;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i3);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 72 - (ViewConfiguration.getEdgeSlop() >> 16), 8849 - (AudioTrack.getMaxVolume() > f ? 1 : (AudioTrack.getMaxVolume() == f ? 0 : -1)), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i6] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i6++;
                    f = 0.0f;
                    i3 = -1469660336;
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
            int i7 = $11 + 83;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            for (int i9 = 0; i9 < length3; i9++) {
                Object[] objArr3 = {Integer.valueOf(iArr5[i9])};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Gravity.getAbsoluteGravity(0, 0), 71 - ImageFormat.getBitsPerPixel(0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr6[i9] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            int i10 = $10 + 45;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i12 = 0;
            for (int i13 = 16; i12 < i13; i13 = 16) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i12];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTapTimeout() >> 16) + 22252), 39 - View.MeasureSpec.getSize(0), 10300 - TextUtils.lastIndexOf("", '0', 0, 0), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i12++;
            }
            int i14 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i14;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 4032), 79 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 7398 - Color.red(0), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void onNavigationEvent() {
        onNavigationEvent = new int[]{1244408567, 1299746125, 1611952931, -1055842381, -985781439, 1889317437, 1783577291, 1803259462, -1513835391, 1414653218, 478529659, -1787418054, 1559862636, -815774693, 393752440, -1752553411, -666082496, -565166556};
    }
}
