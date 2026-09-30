package im.toss.features.home.core.remote.request.card;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
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
import o.DefaultGainProviderExternalSyntheticLambda1;
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
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CardTransactionRequest$$serializer implements aeu2<CardTransactionRequest> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    public static final CardTransactionRequest$$serializer INSTANCE;
    private static int asInterface = 1;
    private static final SerialDescriptor descriptor;
    private static char onExtraCallback;
    private static char onExtraCallbackWithResult;
    private static char onNavigationEvent;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 93;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 85;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        onExtraCallbackWithResult();
        CardTransactionRequest$$serializer cardTransactionRequest$$serializer = new CardTransactionRequest$$serializer();
        INSTANCE = cardTransactionRequest$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.remote.request.card.CardTransactionRequest", cardTransactionRequest$$serializer, 6);
        setanimationsloop.onWarmupCompleted("schemeParams", false);
        setanimationsloop.onWarmupCompleted("yearMonth", false);
        setanimationsloop.onWarmupCompleted("cardSource", false);
        setanimationsloop.onWarmupCompleted("transactionToggleOptionKey", false);
        Object[] objArr = new Object[1];
        a(new char[]{30807, 26648, 51267, 35611}, 4 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("referenceId", false);
        descriptor = setanimationsloop;
        int i = IAuthTabCallbackStub + 125;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private CardTransactionRequest$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 117;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {CardTransactionRequest.IAuthTabCallback()[0].getValue(), getwrigglelayout, sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), getwrigglelayout, sp.IAuthTabCallback(getwrigglelayout)};
        int i4 = IAuthTabCallbackDefault + 53;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CardTransactionRequest deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        Map map;
        String str5;
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrIAuthTabCallback = CardTransactionRequest.IAuthTabCallback();
        String strAsInterface = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            Map map2 = (Map) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrIAuthTabCallback[0].getValue(), (Object) null);
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str6 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, (Object) null);
            String str7 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getwrigglelayout, (Object) null);
            String strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
            String str8 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, getwrigglelayout, (Object) null);
            int i5 = asInterface + 19;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            i = 63;
            map = map2;
            str4 = strAsInterface2;
            str5 = str8;
            str = strAsInterface3;
            str2 = str7;
            str3 = str6;
        } else {
            boolean z = true;
            int i7 = 0;
            String str9 = null;
            String str10 = null;
            String strAsInterface4 = null;
            Map map3 = null;
            String str11 = null;
            for (boolean z2 = true; z == z2; z2 = true) {
                int i8 = IAuthTabCallbackDefault + 83;
                asInterface = i8 % 128;
                int i9 = i8 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (i9 == 0) {
                    int i10 = 84 / 0;
                    switch (iOnNavigationEvent) {
                        case -1:
                            z = false;
                            break;
                        case 0:
                            map3 = (Map) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrIAuthTabCallback[0].getValue(), map3);
                            i7 |= 1;
                            break;
                        case 1:
                            i2 = 1;
                            strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, i2);
                            i7 |= 2;
                            i3 = asInterface + 47;
                            IAuthTabCallbackDefault = i3 % 128;
                            if (i3 % 2 != 0) {
                                int i11 = 3 % 5;
                            }
                            break;
                        case 2:
                            str10 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str10);
                            i7 |= 4;
                            break;
                        case 3:
                            str9 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, str9);
                            i7 |= 8;
                            break;
                        case 4:
                            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
                            i7 |= 16;
                            break;
                        case 5:
                            str11 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, getWriggleLayout.onNavigationEvent, str11);
                            i7 |= 32;
                            break;
                        default:
                            throw new UnknownFieldException(iOnNavigationEvent);
                    }
                } else {
                    switch (iOnNavigationEvent) {
                        case -1:
                            break;
                        case 0:
                            break;
                        case 1:
                            i2 = 1;
                            strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, i2);
                            i7 |= 2;
                            i3 = asInterface + 47;
                            IAuthTabCallbackDefault = i3 % 128;
                            if (i3 % 2 != 0) {
                            }
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                        default:
                            throw new UnknownFieldException(iOnNavigationEvent);
                    }
                }
            }
            i = i7;
            str = strAsInterface;
            str2 = str9;
            str3 = str10;
            str4 = strAsInterface4;
            map = map3;
            str5 = str11;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new CardTransactionRequest(i, map, str4, str3, str2, str, str5, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m615deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 73;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            deserialize(decoder);
            throw null;
        }
        CardTransactionRequest cardTransactionRequestDeserialize = deserialize(decoder);
        int i3 = IAuthTabCallbackDefault + 15;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return cardTransactionRequestDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CardTransactionRequest cardTransactionRequest) {
        int i = 2 % 2;
        int i2 = asInterface + 19;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(cardTransactionRequest, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            CardTransactionRequest.onNavigationEvent(cardTransactionRequest, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(cardTransactionRequest, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        CardTransactionRequest.onNavigationEvent(cardTransactionRequest, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = IAuthTabCallbackDefault + 105;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 109;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CardTransactionRequest) obj);
        if (i3 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = asInterface + 37;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallbackDefault + 91;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        int i4 = $10 + 117;
        $11 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 4 % 5;
        }
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i6 = $11 + 15;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i8 = 58224;
            int i9 = i3;
            while (i9 < 16) {
                int i10 = $10 + 119;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i12 = (c2 + i8) ^ ((c2 << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)));
                int i13 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(IAuthTabCallback);
                    objArr2[2] = Integer.valueOf(i13);
                    objArr2[1] = Integer.valueOf(i12);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        int iBlue = Color.blue(i3) + 10;
                        int threadPriority = 12434 - ((Process.getThreadPriority(i3) + 20) >> 6);
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(maximumFlingVelocity, iBlue, threadPriority, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallbackWithResult)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), 10 - TextUtils.indexOf("", "", 0, 0), 12435 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i9++;
                    cArr3 = cArr4;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 15 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), Gravity.getAbsoluteGravity(0, 0) + 19901, -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void onExtraCallbackWithResult() {
        onExtraCallback = (char) 15113;
        onExtraCallbackWithResult = (char) 59668;
        onNavigationEvent = (char) 61438;
        IAuthTabCallback = (char) 52381;
    }
}
