package im.toss.features.home.core.local.model.dst.handler;

import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
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
public final /* synthetic */ class HandlerLocal$Link$$serializer implements aeu2<HandlerLocal.Link> {
    private static int IAuthTabCallback;
    public static final HandlerLocal$Link$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback;
    private static long onExtraCallbackWithResult;
    private static char onWarmupCompleted;
    private static final byte[] $$a = {61, -49, -70, 93};
    private static final int $$b = 216;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onTransact = 0;
    private static int asBinder = 1;
    private static int onNavigationEvent = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, int i, byte b2) {
        int i2;
        int i3 = 110 - b;
        int i4 = 4 - (i * 2);
        byte[] bArr = $$a;
        int i5 = b2 * 4;
        byte[] bArr2 = new byte[1 - i5];
        int i6 = 0 - i5;
        if (bArr == null) {
            i3 = i4;
            int i7 = i6;
            i2 = 0;
            i4++;
            i3 += i7;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
                return new String(bArr2, 0);
            }
            i2++;
            i7 = bArr[i4];
            i4++;
            i3 += i7;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 19;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 35;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        onExtraCallback = 0;
        onExtraCallback();
        HandlerLocal$Link$$serializer handlerLocal$Link$$serializer = new HandlerLocal$Link$$serializer();
        INSTANCE = handlerLocal$Link$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.handler.HandlerLocal.Link", handlerLocal$Link$$serializer, 3);
        setanimationsloop.onWarmupCompleted("eventLog", true);
        setanimationsloop.onWarmupCompleted("runOption", true);
        Object[] objArr = new Object[1];
        a((char) (37500 - Process.getGidForName("")), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 312317462, new char[]{12603, 28598, 50284}, new char[]{55122, 56053, 35165, 25749}, new char[]{6004, 40342, 32018, 25234}, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 35;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 87 / 0;
        }
    }

    private HandlerLocal$Link$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onTransact + 3;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return new KSerializer[]{sp.IAuthTabCallback(onAlipayJSBridgeReady.onExtraCallbackWithResult), BaseWorkerImplRenderReadyListener.onExtraCallbackWithResult, getWriggleLayout.onNavigationEvent};
        }
        KSerializer<?>[] kSerializerArr = new KSerializer[5];
        kSerializerArr[0] = sp.IAuthTabCallback(onAlipayJSBridgeReady.onExtraCallbackWithResult);
        kSerializerArr[1] = BaseWorkerImplRenderReadyListener.onExtraCallbackWithResult;
        kSerializerArr[5] = getWriggleLayout.onNavigationEvent;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final HandlerLocal.Link deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        HandlerLocal.RunOption runOption;
        EventLogLocal eventLogLocal;
        String str;
        int i2 = 2 % 2;
        int i3 = asBinder + 87;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        HandlerLocal.RunOption runOption2 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i5 = asBinder + 105;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            EventLogLocal eventLogLocal2 = (EventLogLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, onAlipayJSBridgeReady.onExtraCallbackWithResult, (Object) null);
            HandlerLocal.RunOption runOption3 = (HandlerLocal.RunOption) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, BaseWorkerImplRenderReadyListener.onExtraCallbackWithResult, (Object) null);
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            int i7 = onTransact + 9;
            asBinder = i7 % 128;
            int i8 = i7 % 2;
            i = 7;
            eventLogLocal = eventLogLocal2;
            runOption = runOption3;
            str = strAsInterface;
        } else {
            int i9 = 0;
            boolean z = true;
            EventLogLocal eventLogLocal3 = null;
            String strAsInterface2 = null;
            while (z) {
                int i10 = asBinder + 113;
                onTransact = i10 % 128;
                int i11 = i10 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    eventLogLocal3 = (EventLogLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, onAlipayJSBridgeReady.onExtraCallbackWithResult, eventLogLocal3);
                    i9 |= 1;
                } else if (iOnNavigationEvent == 1) {
                    runOption2 = (HandlerLocal.RunOption) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, BaseWorkerImplRenderReadyListener.onExtraCallbackWithResult, runOption2);
                    i9 |= 2;
                } else {
                    if (iOnNavigationEvent != 2) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    int i12 = onTransact + 45;
                    asBinder = i12 % 128;
                    strAsInterface2 = i12 % 2 == 0 ? ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4) : ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                    i9 |= 4;
                }
            }
            i = i9;
            runOption = runOption2;
            eventLogLocal = eventLogLocal3;
            str = strAsInterface2;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new HandlerLocal.Link(i, eventLogLocal, runOption, str, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m431deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onTransact + 7;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        HandlerLocal.Link linkDeserialize = deserialize(decoder);
        if (i3 == 0) {
            int i4 = 55 / 0;
        }
        return linkDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull HandlerLocal.Link link) {
        int i = 2 % 2;
        int i2 = onTransact + 3;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(link, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        HandlerLocal.Link.onExtraCallbackWithResult(link, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = asBinder + 71;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 35;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (HandlerLocal.Link) obj);
        if (i3 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onTransact + 85;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        throw null;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        int i3 = $11 + 43;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getMode(0), TextUtils.getTrimmedLength("") + 43, TextUtils.indexOf("", "", 0, 0) + 1451, 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) 1;
                    byte b4 = (byte) (b3 - 1);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49122 - TextUtils.indexOf((CharSequence) "", '0')), 44 - (ViewConfiguration.getTouchSlop() >> 8), 1494 - (ViewConfiguration.getPressedStateDuration() >> 16), 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23972 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), TextUtils.indexOf((CharSequence) "", '0') + 51, 22939 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45848 - View.MeasureSpec.getMode(0)), 29 - ExpandableListView.getPackedPositionGroup(0L), 12576 - ImageFormat.getBitsPerPixel(0), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onExtraCallbackWithResult ^ 7798559133331975163L)) ^ ((int) (IAuthTabCallback ^ 7798559133331975163L))) ^ ((char) (onWarmupCompleted ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                int i5 = $11 + 1;
                $10 = i5 % 128;
                int i6 = i5 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    static void onExtraCallback() {
        onExtraCallbackWithResult = 625865569124793513L;
        IAuthTabCallback = -1776194565;
        onWarmupCompleted = (char) 27643;
    }
}
