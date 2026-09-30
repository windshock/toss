package im.toss.features.home.core.local.model.dst.handler;

import android.graphics.Color;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import im.toss.features.home.core.local.model.dst.eventlog.EventLogLocal;
import im.toss.features.home.core.local.model.dst.handler.HandlerLocal;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.BaseWorkerImplRenderReadyListener;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.aeu2;
import o.getBgColor;
import o.getWriggleLayout;
import o.okycx;
import o.onAlipayJSBridgeReady;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HandlerLocal$Toggle$$serializer implements aeu2<HandlerLocal.Toggle> {
    public static final HandlerLocal$Toggle$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static long onExtraCallback;
    private static char onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {60, -123, -116, -1};
    private static final int $$b = 222;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asInterface = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int IAuthTabCallback = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, short s, int i2) {
        int i3;
        byte[] bArr = $$a;
        int i4 = (i * 3) + 4;
        int i5 = s * 4;
        int i6 = i2 + 109;
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            int i7 = i5;
            int i8 = 0;
            i6 = (-i6) + i7;
            i4++;
            i3 = i8;
            bArr2[i3] = (byte) i6;
            i8 = i3 + 1;
            if (i3 == i5) {
                return new String(bArr2, 0);
            }
            i7 = i6;
            i6 = bArr[i4];
            i6 = (-i6) + i7;
            i4++;
            i3 = i8;
            bArr2[i3] = (byte) i6;
            i8 = i3 + 1;
            if (i3 == i5) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i6;
            i8 = i3 + 1;
            if (i3 == i5) {
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = asInterface + 93;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 93;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        int i4 = 0;
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i5 = $11 + 15;
            $10 = i5 % 128;
            int i6 = i5 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                    int capsMode = TextUtils.getCapsMode("", i4, i4) + 43;
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 1452;
                    byte b = $$a[3];
                    byte b2 = (byte) (b + 1);
                    String str$$c = $$c(b2, b2, (byte) (-b));
                    Class[] clsArr = new Class[1];
                    clsArr[i4] = Object.class;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(windowTouchSlop, capsMode, iIndexOf, 228868077, false, str$$c, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        char cLastIndexOf = (char) (49122 - TextUtils.lastIndexOf("", '0', i4));
                        int iArgb = 44 - Color.argb(i4, i4, i4, i4);
                        int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1494;
                        byte b3 = (byte) ($$a[3] + 1);
                        byte b4 = b3;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cLastIndexOf, iArgb, maximumFlingVelocity, 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 23972), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 50, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45849 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), Color.alpha(0) + 29, 12577 - TextUtils.getOffsetBefore("", 0), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                            cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onExtraCallback ^ 7798559133331975163L)) ^ ((int) (onNavigationEvent ^ 7798559133331975163L))) ^ ((char) (onExtraCallbackWithResult ^ 7798559133331975163L)));
                            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                            int i7 = $11 + 107;
                            $10 = i7 % 128;
                            int i8 = i7 % 2;
                            i2 = 2;
                            i4 = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        objArr[0] = new String(cArr6);
    }

    static {
        onWarmupCompleted = 0;
        onWarmupCompleted();
        HandlerLocal$Toggle$$serializer handlerLocal$Toggle$$serializer = new HandlerLocal$Toggle$$serializer();
        INSTANCE = handlerLocal$Toggle$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.handler.HandlerLocal.Toggle", handlerLocal$Toggle$$serializer, 4);
        setanimationsloop.onWarmupCompleted("eventLog", true);
        setanimationsloop.onWarmupCompleted("runOption", true);
        Object[] objArr = new Object[1];
        a((char) (31508 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), (-584414949) + (ViewConfiguration.getScrollBarFadeDuration() >> 16), new char[]{43382, 7540, 54713}, new char[]{0, 0, 0, 0}, new char[]{7052, 10889, 5341, 21115}, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("saveStatus", false);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 121;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private HandlerLocal$Toggle$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 83;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            kSerializerArr = new KSerializer[2];
            kSerializerArr[1] = sp.IAuthTabCallback(onAlipayJSBridgeReady.onExtraCallbackWithResult);
            kSerializerArr[1] = BaseWorkerImplRenderReadyListener.onExtraCallbackWithResult;
            kSerializerArr[3] = getWriggleLayout.onNavigationEvent;
            kSerializerArr[4] = getBgColor.IAuthTabCallback;
        } else {
            kSerializerArr = new KSerializer[]{sp.IAuthTabCallback(onAlipayJSBridgeReady.onExtraCallbackWithResult), BaseWorkerImplRenderReadyListener.onExtraCallbackWithResult, getWriggleLayout.onNavigationEvent, getBgColor.IAuthTabCallback};
        }
        int i3 = asInterface + 111;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final HandlerLocal.Toggle deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        boolean zOnExtraCallbackWithResult;
        HandlerLocal.RunOption runOption;
        EventLogLocal eventLogLocal;
        String strAsInterface;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        HandlerLocal.RunOption runOption2 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            EventLogLocal eventLogLocal2 = (EventLogLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, onAlipayJSBridgeReady.onExtraCallbackWithResult, (Object) null);
            HandlerLocal.RunOption runOption3 = (HandlerLocal.RunOption) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, BaseWorkerImplRenderReadyListener.onExtraCallbackWithResult, (Object) null);
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            eventLogLocal = eventLogLocal2;
            i = 15;
            zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3);
            runOption = runOption3;
        } else {
            EventLogLocal eventLogLocal3 = null;
            String strAsInterface2 = null;
            boolean zOnExtraCallbackWithResult2 = false;
            int i3 = 0;
            boolean z = true;
            while (!(!z)) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i4 = asInterface + 51;
                    IAuthTabCallbackStub = i4 % 128;
                    int i5 = i4 % 2;
                    if (iOnNavigationEvent == 0) {
                        eventLogLocal3 = (EventLogLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, onAlipayJSBridgeReady.onExtraCallbackWithResult, eventLogLocal3);
                        i3 |= 1;
                    } else if (iOnNavigationEvent == 1) {
                        runOption2 = (HandlerLocal.RunOption) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, BaseWorkerImplRenderReadyListener.onExtraCallbackWithResult, runOption2);
                        i3 |= 2;
                    } else if (iOnNavigationEvent == 2) {
                        strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                        i3 |= 4;
                    } else {
                        if (iOnNavigationEvent != 3) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3);
                        i3 |= 8;
                        int i6 = IAuthTabCallbackStub + 15;
                        asInterface = i6 % 128;
                        int i7 = i6 % 2;
                    }
                } else {
                    int i8 = asInterface + 111;
                    IAuthTabCallbackStub = i8 % 128;
                    int i9 = i8 % 2;
                    z = false;
                }
            }
            zOnExtraCallbackWithResult = zOnExtraCallbackWithResult2;
            runOption = runOption2;
            eventLogLocal = eventLogLocal3;
            strAsInterface = strAsInterface2;
            i = i3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new HandlerLocal.Toggle(i, eventLogLocal, runOption, strAsInterface, zOnExtraCallbackWithResult, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m455deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 125;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        HandlerLocal.Toggle toggleDeserialize = deserialize(decoder);
        int i4 = IAuthTabCallbackStub + 23;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return toggleDeserialize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull HandlerLocal.Toggle toggle) {
        int i = 2 % 2;
        int i2 = asInterface + 103;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(toggle, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        HandlerLocal.Toggle.onWarmupCompleted(toggle, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = asInterface + 103;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 47;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (HandlerLocal.Toggle) obj);
        if (i3 == 0) {
            int i4 = 94 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = asInterface + 29;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = asInterface + 43;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        throw null;
    }

    static void onWarmupCompleted() {
        onExtraCallback = 7798559133331975163L;
        onNavigationEvent = 424810818;
        onExtraCallbackWithResult = (char) 27643;
    }
}
