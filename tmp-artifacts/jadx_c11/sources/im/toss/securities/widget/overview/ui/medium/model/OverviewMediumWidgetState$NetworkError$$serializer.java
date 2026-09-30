package im.toss.securities.widget.overview.ui.medium.model;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.securities.widget.overview.ui.medium.model.OverviewMediumWidgetState;
import im.toss.tosssecurities.host.contracts.DisplaySetting;
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
import o.dj3;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final /* synthetic */ class OverviewMediumWidgetState$NetworkError$$serializer implements aeu2<OverviewMediumWidgetState.NetworkError> {
    public static final int $stable;
    private static short[] IAuthTabCallback;
    public static final OverviewMediumWidgetState$NetworkError$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static byte[] onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static int onTransact;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {66, 42, 112, 97};
    private static final int $$b = 204;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int asInterface = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, byte b, int i2) {
        int i3;
        int i4 = i * 4;
        int i5 = 4 - (i2 * 4);
        int i6 = 115 - (b * 2);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i4 + 1];
        int i7 = -1;
        if (bArr == null) {
            int i8 = i4;
            i3 = i5;
            i5 += -i8;
            i3++;
            i7++;
            bArr2[i7] = (byte) i5;
            if (i7 == i4) {
                return new String(bArr2, 0);
            }
            i8 = bArr[i3];
            i5 += -i8;
            i3++;
            i7++;
            bArr2[i7] = (byte) i5;
            if (i7 == i4) {
            }
        } else {
            i5 = i6;
            i3 = i5;
            i7++;
            bArr2[i7] = (byte) i5;
            if (i7 == i4) {
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 9;
        IAuthTabCallbackStub = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i2 + 71;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return serialDescriptor;
        }
        obj.hashCode();
        throw null;
    }

    static {
        onTransact = 1;
        onExtraCallbackWithResult();
        OverviewMediumWidgetState$NetworkError$$serializer overviewMediumWidgetState$NetworkError$$serializer = new OverviewMediumWidgetState$NetworkError$$serializer();
        INSTANCE = overviewMediumWidgetState$NetworkError$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("NetworkError", overviewMediumWidgetState$NetworkError$$serializer, 2);
        setanimationsloop.onWarmupCompleted("displaySetting", true);
        Object[] objArr = new Object[1];
        a((short) ((-115) - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), (byte) (ViewConfiguration.getKeyRepeatDelay() >> 16), ExpandableListView.getPackedPositionGroup(0L) - 1800908834, Color.argb(0, 0, 0, 0) + 325966582, TextUtils.indexOf("", "", 0) - 33, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        descriptor = setanimationsloop;
        int i = asInterface + 13;
        onTransact = i % 128;
        int i2 = i % 2;
    }

    private OverviewMediumWidgetState$NetworkError$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 7;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return new KSerializer[]{OverviewMediumWidgetState.NetworkError.IAuthTabCallback()[0].getValue(), dj3.onWarmupCompleted};
        }
        KSerializer<?>[] kSerializerArr = new KSerializer[4];
        kSerializerArr[1] = OverviewMediumWidgetState.NetworkError.IAuthTabCallback()[0].getValue();
        kSerializerArr[0] = dj3.onWarmupCompleted;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final OverviewMediumWidgetState.NetworkError deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        DisplaySetting displaySetting;
        float fOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = 3;
        int i3 = IAuthTabCallbackDefault + 3;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrIAuthTabCallback = OverviewMediumWidgetState.NetworkError.IAuthTabCallback();
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            displaySetting = (DisplaySetting) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrIAuthTabCallback[0].getValue(), (Object) null);
            fOnWarmupCompleted = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 1);
        } else {
            float fOnWarmupCompleted2 = 0.0f;
            DisplaySetting displaySetting2 = null;
            int i5 = 0;
            boolean z = true;
            while (!(!z)) {
                int i6 = IAuthTabCallbackDefault + 41;
                IAuthTabCallbackStub = i6 % 128;
                int i7 = i6 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i8 = IAuthTabCallbackDefault + 43;
                    IAuthTabCallbackStub = i8 % 128;
                    int i9 = i8 % 2;
                    if (iOnNavigationEvent == 0) {
                        displaySetting2 = (DisplaySetting) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrIAuthTabCallback[0].getValue(), displaySetting2);
                        i5 |= 1;
                    } else {
                        if (iOnNavigationEvent != 1) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        fOnWarmupCompleted2 = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 1);
                        i5 |= 2;
                    }
                } else {
                    int i10 = IAuthTabCallbackDefault + 39;
                    IAuthTabCallbackStub = i10 % 128;
                    int i11 = i10 % 2;
                    z = false;
                }
            }
            displaySetting = displaySetting2;
            i2 = i5;
            fOnWarmupCompleted = fOnWarmupCompleted2;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new OverviewMediumWidgetState.NetworkError(i2, displaySetting, fOnWarmupCompleted, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m70deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 55;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull OverviewMediumWidgetState.NetworkError networkError) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 1;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(networkError, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        OverviewMediumWidgetState.NetworkError.onExtraCallbackWithResult(networkError, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallbackDefault + 61;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 69;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (OverviewMediumWidgetState.NetworkError) obj);
        if (i3 != 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 93;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        if (i3 == 0) {
            int i4 = 38 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        boolean z;
        int i5 = 2;
        int i6 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onWarmupCompleted)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Drawable.resolveOpacity(0, 0) + 43424), 42 - KeyEvent.keyCodeFromString(""), Process.getGidForName("") + 22440, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            int i7 = iIntValue == -1 ? 1 : 0;
            if (i7 != 1) {
                i4 = 2;
            } else {
                byte[] bArr = onExtraCallback;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i8 = 0;
                    while (i8 < length) {
                        int i9 = $10 + 41;
                        $11 = i9 % 128;
                        int i10 = i9 % i5;
                        try {
                            Object[] objArr3 = {Integer.valueOf(bArr[i8])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - TextUtils.getTrimmedLength("")), 55 - Color.alpha(0), 2167 - (ViewConfiguration.getLongPressTimeout() >> 16), -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr2[i8] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                            i8++;
                            i5 = 2;
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
                    byte[] bArr3 = onExtraCallback;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onExtraCallbackWithResult)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.getGidForName("") + 43425), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 42, 22440 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onWarmupCompleted ^ (-4629411779493505016L))));
                    i4 = 2;
                } else {
                    iIntValue = (short) (((short) (IAuthTabCallback[i + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onWarmupCompleted ^ (-4629411779493505016L))));
                    int i11 = $11 + 85;
                    $10 = i11 % 128;
                    i4 = 2;
                    int i12 = i11 % 2;
                }
            }
            if (iIntValue > 0) {
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - i4) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L))) + i7;
                try {
                    Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onNavigationEvent), sb};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.alpha(0), Color.argb(0, 0, 0, 0) + 86, Color.argb(0, 0, 0, 0) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    byte[] bArr4 = onExtraCallback;
                    if (bArr4 != null) {
                        int length2 = bArr4.length;
                        byte[] bArr5 = new byte[length2];
                        int i13 = 0;
                        while (i13 < length2) {
                            bArr5[i13] = (byte) (bArr4[i13] ^ (-4629411779493505016L));
                            i13++;
                            int i14 = $10 + 85;
                            $11 = i14 % 128;
                            if (i14 % 2 == 0) {
                                int i15 = 5 % 3;
                            }
                        }
                        bArr4 = bArr5;
                    }
                    if (bArr4 != null) {
                        int i16 = $11 + 93;
                        $10 = i16 % 128;
                        int i17 = i16 % 2;
                        z = true;
                    } else {
                        z = false;
                    }
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                    while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                        int i18 = $10 + 59;
                        $11 = i18 % 128;
                        if (i18 % 2 == 0) {
                            throw null;
                        }
                        if (!z) {
                            short[] sArr = IAuthTabCallback;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                        } else {
                            byte[] bArr6 = onExtraCallback;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                        }
                        sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th3) {
            Throwable cause3 = th3.getCause();
            if (cause3 == null) {
                throw th3;
            }
            throw cause3;
        }
    }

    static void onExtraCallbackWithResult() {
        onExtraCallbackWithResult = -821008342;
        onWarmupCompleted = -1538795474;
        onNavigationEvent = 1221983587;
        onExtraCallback = new byte[]{100, 99, Byte.MAX_VALUE, 118, 8};
    }
}
