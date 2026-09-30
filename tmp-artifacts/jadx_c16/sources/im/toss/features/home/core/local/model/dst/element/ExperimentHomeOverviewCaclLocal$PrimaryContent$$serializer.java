package im.toss.features.home.core.local.model.dst.element;

import android.graphics.Color;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.features.home.core.local.model.dst.element.ExperimentHomeOverviewCaclLocal;
import im.toss.features.home.core.local.model.dst.handler.HandlerLocal;
import im.toss.features.home.core.local.model.dst.widget.ImageSourceLocal;
import im.toss.features.home.core.local.model.dst.widget.TextContentLocal;
import im.toss.features.home.core.local.model.dst.widget.TextContentLocal$;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.aeu2;
import o.okycx;
import o.removeNextStartHandler;
import o.setAnimationsLoop;
import o.setAppxVersionInWorker;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ExperimentHomeOverviewCaclLocal$PrimaryContent$$serializer implements aeu2<ExperimentHomeOverviewCaclLocal.PrimaryContent> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    public static final ExperimentHomeOverviewCaclLocal$PrimaryContent$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int[] onNavigationEvent;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 27;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        onNavigationEvent();
        ExperimentHomeOverviewCaclLocal$PrimaryContent$$serializer experimentHomeOverviewCaclLocal$PrimaryContent$$serializer = new ExperimentHomeOverviewCaclLocal$PrimaryContent$$serializer();
        INSTANCE = experimentHomeOverviewCaclLocal$PrimaryContent$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.ExperimentHomeOverviewCaclLocal.PrimaryContent", experimentHomeOverviewCaclLocal$PrimaryContent$$serializer, 3);
        setanimationsloop.onWarmupCompleted("image", false);
        Object[] objArr = new Object[1];
        a(new int[]{1486379633, -16066208}, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 4, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("handler", false);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 111;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private ExperimentHomeOverviewCaclLocal$PrimaryContent$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 121;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return new KSerializer[]{removeNextStartHandler.onWarmupCompleted, TextContentLocal$.serializer.INSTANCE, setAppxVersionInWorker.onExtraCallback};
        }
        KSerializer<?>[] kSerializerArr = new KSerializer[5];
        kSerializerArr[0] = removeNextStartHandler.onWarmupCompleted;
        kSerializerArr[0] = TextContentLocal$.serializer.INSTANCE;
        kSerializerArr[3] = setAppxVersionInWorker.onExtraCallback;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ExperimentHomeOverviewCaclLocal.PrimaryContent deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        TextContentLocal textContentLocal;
        ImageSourceLocal imageSourceLocal;
        HandlerLocal handlerLocal;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        TextContentLocal textContentLocal2 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = onWarmupCompleted + 71;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            ImageSourceLocal imageSourceLocal2 = (ImageSourceLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, removeNextStartHandler.onWarmupCompleted, (Object) null);
            TextContentLocal textContentLocal3 = (TextContentLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, TextContentLocal$.serializer.INSTANCE, (Object) null);
            handlerLocal = (HandlerLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, setAppxVersionInWorker.onExtraCallback, (Object) null);
            imageSourceLocal = imageSourceLocal2;
            textContentLocal = textContentLocal3;
            i = 7;
        } else {
            int i5 = 0;
            boolean z = true;
            ImageSourceLocal imageSourceLocal3 = null;
            HandlerLocal handlerLocal2 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    int i6 = onWarmupCompleted + 51;
                    onExtraCallbackWithResult = i6 % 128;
                    if (i6 % 2 == 0) {
                        if (iOnNavigationEvent == 0) {
                            textContentLocal2 = (TextContentLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, TextContentLocal$.serializer.INSTANCE, textContentLocal2);
                            i5 |= 2;
                        } else {
                            if (iOnNavigationEvent == 2) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            handlerLocal2 = (HandlerLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, setAppxVersionInWorker.onExtraCallback, handlerLocal2);
                            i5 |= 4;
                        }
                    } else if (iOnNavigationEvent == 1) {
                        textContentLocal2 = (TextContentLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, TextContentLocal$.serializer.INSTANCE, textContentLocal2);
                        i5 |= 2;
                    } else if (iOnNavigationEvent == 2) {
                    }
                } else {
                    imageSourceLocal3 = (ImageSourceLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, removeNextStartHandler.onWarmupCompleted, imageSourceLocal3);
                    i5 |= 1;
                }
            }
            i = i5;
            textContentLocal = textContentLocal2;
            imageSourceLocal = imageSourceLocal3;
            handlerLocal = handlerLocal2;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new ExperimentHomeOverviewCaclLocal.PrimaryContent(i, imageSourceLocal, textContentLocal, handlerLocal, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m373deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 13;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        ExperimentHomeOverviewCaclLocal.PrimaryContent primaryContentDeserialize = deserialize(decoder);
        int i4 = onExtraCallbackWithResult + 89;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return primaryContentDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ExperimentHomeOverviewCaclLocal.PrimaryContent primaryContent) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(primaryContent, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            ExperimentHomeOverviewCaclLocal.PrimaryContent.onExtraCallback(primaryContent, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(primaryContent, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        ExperimentHomeOverviewCaclLocal.PrimaryContent.onExtraCallback(primaryContent, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = 79 / 0;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 29;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ExperimentHomeOverviewCaclLocal.PrimaryContent) obj);
        if (i3 != 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 89;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        if (i3 != 0) {
            int i4 = 14 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = onNavigationEvent;
        int i5 = -1469660336;
        int i6 = 16;
        if (iArr3 != null) {
            int i7 = $10 + 79;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                length = iArr3.length;
                iArr2 = new int[length];
                i2 = 1;
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
                i2 = 0;
            }
            while (i2 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i2])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatDelay() >> i6), (ViewConfiguration.getTapTimeout() >> 16) + 72, 8848 - (Process.myPid() >> 22), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr2[i2] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i2++;
                    i5 = -1469660336;
                    i6 = 16;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr2;
        }
        int length2 = iArr3.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = onNavigationEvent;
        char c = '0';
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i8 = 0;
            while (i8 < length3) {
                int i9 = $11 + 89;
                $10 = i9 % 128;
                int i10 = i9 % i3;
                Object[] objArr3 = {Integer.valueOf(iArr5[i8])};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf("", c, 0)), Gravity.getAbsoluteGravity(0, 0) + 72, 8848 - (Process.myPid() >> 22), -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr6[i8] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                i8++;
                i3 = 2;
                c = '0';
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            int i11 = $10 + 101;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i13 = 0;
            for (int i14 = 16; i13 < i14; i14 = 16) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i13];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 22251), 39 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 10301 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i13++;
            }
            int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i15;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
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
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4081 - AndroidCharacter.getMirror('0')), 78 - View.MeasureSpec.makeMeasureSpec(0, 0), Color.rgb(0, 0, 0) + 16784614, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void onNavigationEvent() {
        onNavigationEvent = new int[]{-473388365, 262222033, 992496782, 838915896, -1152019064, 230411589, 1297717195, 20061489, -883127517, 1093463832, -450475432, -679638907, -28073975, 655524160, -1853611282, -1713585473, -294167382, -1136977878};
    }
}
