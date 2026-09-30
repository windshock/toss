package im.toss.features.home.core.local.model.dst.element;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.home.core.local.model.dst.element.ConsumptionAmountTopLocal;
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
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
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
public final /* synthetic */ class ConsumptionAmountTopLocal$Right$Button$$serializer implements aeu2<ConsumptionAmountTopLocal.Right.Button> {
    private static int IAuthTabCallback;
    public static final ConsumptionAmountTopLocal$Right$Button$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static char onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static long onWarmupCompleted;
    private static final byte[] $$a = {108, -1, -36, 99};
    private static final int $$b = 251;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onTransact = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallback = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, int i, int i2) {
        int i3;
        int i4;
        int i5 = 4 - (i * 2);
        int i6 = 110 - s;
        byte[] bArr = $$a;
        int i7 = i2 * 3;
        byte[] bArr2 = new byte[1 - i7];
        int i8 = 0 - i7;
        if (bArr == null) {
            int i9 = i5;
            int i10 = 0;
            i5 += -i6;
            i4 = i9 + 1;
            i3 = i10;
            bArr2[i3] = (byte) i5;
            if (i3 == i8) {
                return new String(bArr2, 0);
            }
            int i11 = i3 + 1;
            i9 = i4;
            i6 = bArr[i4];
            i10 = i11;
            i5 += -i6;
            i4 = i9 + 1;
            i3 = i10;
            bArr2[i3] = (byte) i5;
            if (i3 == i8) {
            }
        } else {
            i3 = 0;
            i5 = i6;
            i4 = i5;
            bArr2[i3] = (byte) i5;
            if (i3 == i8) {
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 37;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return descriptor;
        }
        throw null;
    }

    static {
        onNavigationEvent = 0;
        IAuthTabCallback();
        ConsumptionAmountTopLocal$Right$Button$$serializer consumptionAmountTopLocal$Right$Button$$serializer = new ConsumptionAmountTopLocal$Right$Button$$serializer();
        INSTANCE = consumptionAmountTopLocal$Right$Button$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.ConsumptionAmountTopLocal.Right.Button", consumptionAmountTopLocal$Right$Button$$serializer, 6);
        Object[] objArr = new Object[1];
        a((char) (Color.red(0) + 567), 249324470 - TextUtils.getOffsetAfter("", 0), new char[]{29427, 64053, 46717, 11565, 1089}, new char[]{0, 0, 0, 0}, new char[]{46839, 56419, 14094, 11266}, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("logTitle", false);
        setanimationsloop.onWarmupCompleted("theme", false);
        Object[] objArr2 = new Object[1];
        a((char) (39698 - ExpandableListView.getPackedPositionChild(0L)), Color.rgb(0, 0, 0) + 615160649, new char[]{30093, 57359, 14122, 21054, 47146}, new char[]{0, 0, 0, 0}, new char[]{18748, 43675, 4899, 49051}, objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("size", false);
        setanimationsloop.onWarmupCompleted("handler", false);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 109;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private ConsumptionAmountTopLocal$Right$Button$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 61;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnNavigationEvent = ConsumptionAmountTopLocal.Right.Button.onNavigationEvent();
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {getwrigglelayout, sp.IAuthTabCallback(getwrigglelayout), lazyArrOnNavigationEvent[2].getValue(), lazyArrOnNavigationEvent[3].getValue(), lazyArrOnNavigationEvent[4].getValue(), sp.IAuthTabCallback(setAppxVersionInWorker.onExtraCallback)};
        int i4 = IAuthTabCallbackStub + 41;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final ConsumptionAmountTopLocal.Right.Button deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        getServiceBeans.IAuthTabCallback iAuthTabCallback;
        HandlerLocal handlerLocal;
        getServiceBeans.onWarmupCompleted onwarmupcompleted;
        getServiceBeans.IAuthTabCallbackStub iAuthTabCallbackStub;
        String str;
        String str2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnNavigationEvent = ConsumptionAmountTopLocal.Right.Button.onNavigationEvent();
        int i3 = 5;
        getServiceBeans.IAuthTabCallback iAuthTabCallback2 = null;
        if (!(!ywVarOnWarmupCompleted.extraCallbackWithResult())) {
            int i4 = onTransact + 11;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            String str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, (Object) null);
            getServiceBeans.IAuthTabCallbackStub iAuthTabCallbackStub2 = (getServiceBeans.IAuthTabCallbackStub) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, (jp) lazyArrOnNavigationEvent[2].getValue(), (Object) null);
            getServiceBeans.onWarmupCompleted onwarmupcompleted2 = (getServiceBeans.onWarmupCompleted) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, (jp) lazyArrOnNavigationEvent[3].getValue(), (Object) null);
            iAuthTabCallbackStub = iAuthTabCallbackStub2;
            iAuthTabCallback = (getServiceBeans.IAuthTabCallback) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, (jp) lazyArrOnNavigationEvent[4].getValue(), (Object) null);
            str2 = strAsInterface;
            str = str3;
            handlerLocal = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, setAppxVersionInWorker.onExtraCallback, (Object) null);
            onwarmupcompleted = onwarmupcompleted2;
            i = 63;
        } else {
            boolean z = true;
            int i6 = 0;
            HandlerLocal handlerLocal2 = null;
            getServiceBeans.onWarmupCompleted onwarmupcompleted3 = null;
            getServiceBeans.IAuthTabCallbackStub iAuthTabCallbackStub3 = null;
            String str4 = null;
            String strAsInterface2 = null;
            while (!(!z)) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                        i3 = 5;
                    case 0:
                        strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i6 |= 1;
                        i3 = 5;
                    case 1:
                        str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str4);
                        i6 |= 2;
                        int i7 = onTransact + 113;
                        IAuthTabCallbackStub = i7 % 128;
                        int i8 = i7 % 2;
                        i3 = 5;
                    case 2:
                        iAuthTabCallbackStub3 = (getServiceBeans.IAuthTabCallbackStub) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, (jp) lazyArrOnNavigationEvent[2].getValue(), iAuthTabCallbackStub3);
                        i6 |= 4;
                        i3 = 5;
                    case 3:
                        onwarmupcompleted3 = (getServiceBeans.onWarmupCompleted) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, (jp) lazyArrOnNavigationEvent[3].getValue(), onwarmupcompleted3);
                        i6 |= 8;
                        int i9 = onTransact + 83;
                        IAuthTabCallbackStub = i9 % 128;
                        int i10 = i9 % 2;
                        i3 = 5;
                    case 4:
                        iAuthTabCallback2 = (getServiceBeans.IAuthTabCallback) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, (jp) lazyArrOnNavigationEvent[4].getValue(), iAuthTabCallback2);
                        i6 |= 16;
                    case 5:
                        handlerLocal2 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i3, setAppxVersionInWorker.onExtraCallback, handlerLocal2);
                        i6 |= 32;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            i = i6;
            iAuthTabCallback = iAuthTabCallback2;
            handlerLocal = handlerLocal2;
            onwarmupcompleted = onwarmupcompleted3;
            iAuthTabCallbackStub = iAuthTabCallbackStub3;
            str = str4;
            str2 = strAsInterface2;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new ConsumptionAmountTopLocal.Right.Button(i, str2, str, iAuthTabCallbackStub, onwarmupcompleted, iAuthTabCallback, handlerLocal, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m320deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onTransact + 75;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        ConsumptionAmountTopLocal.Right.Button buttonDeserialize = deserialize(decoder);
        if (i3 == 0) {
            int i4 = 1 / 0;
        }
        return buttonDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ConsumptionAmountTopLocal.Right.Button button) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 105;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(button, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            ConsumptionAmountTopLocal.Right.Button.onExtraCallbackWithResult(button, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(button, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        ConsumptionAmountTopLocal.Right.Button.onExtraCallbackWithResult(button, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = onTransact + 17;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 62 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 19;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ConsumptionAmountTopLocal.Right.Button) obj);
        int i4 = onTransact + 7;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 8 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onTransact + 69;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            super.typeParametersSerializers();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = IAuthTabCallbackStub + 111;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArrTypeParametersSerializers;
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
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i3 = $11 + 71;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char cArgb = (char) Color.argb(0, 0, 0, 0);
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 43;
                    int iRgb = (-16775765) - Color.rgb(0, 0, 0);
                    byte b = (byte) ($$a[1] + 1);
                    byte b2 = b;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cArgb, iMakeMeasureSpec, iRgb, 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    char packedPositionGroup = (char) (49123 - ExpandableListView.getPackedPositionGroup(0L));
                    int iResolveSize = View.resolveSize(0, 0) + 44;
                    int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 1494;
                    byte b3 = (byte) (-$$a[1]);
                    byte b4 = (byte) (b3 - 1);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(packedPositionGroup, iResolveSize, longPressTimeout, 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23971 - TextUtils.lastIndexOf("", '0')), ExpandableListView.getPackedPositionChild(0L) + 51, (-16754277) - Color.rgb(0, 0, 0), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45847 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (ViewConfiguration.getEdgeSlop() >> 16) + 29, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 12577, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] ^ cArr4[iIntValue2]) ^ (onWarmupCompleted ^ 7798559133331975163L)) ^ ((int) (IAuthTabCallback ^ 7798559133331975163L))) ^ ((char) (onExtraCallbackWithResult ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                int i5 = $10 + 73;
                $11 = i5 % 128;
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

    static void IAuthTabCallback() {
        onWarmupCompleted = 7798559133331975163L;
        IAuthTabCallback = -1776194565;
        onExtraCallbackWithResult = (char) 26895;
    }
}
