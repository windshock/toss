package im.toss.features.home.core.local.model.dst.element;

import android.graphics.Color;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.home.core.local.model.dst.element.AmountTopLocal;
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
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.aeu2;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AmountTopLocal$Title$Text$$serializer implements aeu2<AmountTopLocal.Title.Text> {
    private static int IAuthTabCallback;
    public static final AmountTopLocal$Title$Text$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback;
    private static final byte[] $$a = {52, -107, 59, -11};
    private static final int $$b = 208;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onNavigationEvent = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted = 1;

    private static String $$c(byte b, short s, int i) {
        int i2 = b * 2;
        int i3 = i + 4;
        int i4 = (s * 2) + 105;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i2 + 1];
        int i5 = -1;
        if (bArr == null) {
            i4 += i3;
            i5 = -1;
        }
        while (true) {
            int i6 = i3;
            int i7 = i4;
            int i8 = i5 + 1;
            bArr2[i8] = (byte) i7;
            if (i8 == i2) {
                return new String(bArr2, 0);
            }
            int i9 = i6 + 1;
            i3 = i9;
            i4 = bArr[i9] + i7;
            i5 = i8;
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return descriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        onExtraCallback = 0;
        onExtraCallback();
        AmountTopLocal$Title$Text$$serializer amountTopLocal$Title$Text$$serializer = new AmountTopLocal$Title$Text$$serializer();
        INSTANCE = amountTopLocal$Title$Text$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.AmountTopLocal.Title.Text", amountTopLocal$Title$Text$$serializer, 1);
        Object[] objArr = new Object[1];
        a(4 - (ViewConfiguration.getPressedStateDuration() >> 16), View.getDefaultSize(0, 0) + 3, new char[]{65524, 7, 3, 3}, false, AndroidCharacter.getMirror('0') + 'y', objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 71;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private AmountTopLocal$Title$Text$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 13;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {TextAttributeLocal$.serializer.INSTANCE};
        int i4 = onNavigationEvent + 37;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final AmountTopLocal.Title.Text deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        TextAttributeLocal textAttributeLocal;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i2 = 1;
        Object obj = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            textAttributeLocal = (TextAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, TextAttributeLocal$.serializer.INSTANCE, (Object) null);
        } else {
            boolean z = true;
            int i3 = 0;
            textAttributeLocal = null;
            while (z) {
                int i4 = onNavigationEvent + 49;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    int i5 = onNavigationEvent + 63;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    z = false;
                } else {
                    if (iOnNavigationEvent != 0) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    int i7 = onNavigationEvent + 29;
                    onExtraCallbackWithResult = i7 % 128;
                    int i8 = i7 % 2;
                    textAttributeLocal = (TextAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, TextAttributeLocal$.serializer.INSTANCE, textAttributeLocal);
                    i3 = 1;
                }
            }
            i2 = i3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        AmountTopLocal.Title.Text text = new AmountTopLocal.Title.Text(i2, textAttributeLocal, (okycx) null);
        int i9 = onExtraCallbackWithResult + 97;
        onNavigationEvent = i9 % 128;
        if (i9 % 2 == 0) {
            return text;
        }
        obj.hashCode();
        throw null;
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m272deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 11;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        AmountTopLocal.Title.Text textDeserialize = deserialize(decoder);
        if (i3 != 0) {
            int i4 = 88 / 0;
        }
        return textDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull AmountTopLocal.Title.Text text) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 115;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(text, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        AmountTopLocal.Title.Text.onExtraCallbackWithResult(text, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallbackWithResult + 69;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 125;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (AmountTopLocal.Title.Text) obj);
        if (i3 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 63;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onNavigationEvent + 95;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            int i6 = $10 + 125;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i8 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(IAuthTabCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35125 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), 23 - Color.blue(0), (ViewConfiguration.getEdgeSlop() >> 16) + 10278, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - View.MeasureSpec.getSize(0)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 55, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 2167, 1298711993, false, $$c(b, b2, (byte) (b2 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i2 > 0) {
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            int i9 = $11 + 7;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - ExpandableListView.getPackedPositionType(0L)), 54 - Process.getGidForName(""), (ViewConfiguration.getEdgeSlop() >> 16) + 2167, 1298711993, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i4 = 2083011369;
            }
            cArr2 = cArr4;
        }
        String str = new String(cArr2);
        int i11 = $10 + 89;
        $11 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }

    static void onExtraCallback() {
        IAuthTabCallback = 478308881;
    }
}
