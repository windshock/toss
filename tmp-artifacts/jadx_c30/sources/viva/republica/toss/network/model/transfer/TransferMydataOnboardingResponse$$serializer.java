package viva.republica.toss.network.model.transfer;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import net.sf.scuba.smartcards.BuildConfig;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.aeu2;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.transfer.TransferMydataOnboardingResponse;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class TransferMydataOnboardingResponse$$serializer implements aeu2<TransferMydataOnboardingResponse> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 0;
    public static final TransferMydataOnboardingResponse$$serializer INSTANCE;
    private static int asBinder = 1;
    private static int asInterface = 1;
    private static final SerialDescriptor descriptor;
    private static char onExtraCallback;
    private static char onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static char onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 91;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 59;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        onNavigationEvent();
        TransferMydataOnboardingResponse$$serializer transferMydataOnboardingResponse$$serializer = new TransferMydataOnboardingResponse$$serializer();
        INSTANCE = transferMydataOnboardingResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.transfer.TransferMydataOnboardingResponse", transferMydataOnboardingResponse$$serializer, 1);
        Object[] objArr = new Object[1];
        a(new char[]{24762, 48361, 55579, 26976}, Color.rgb(0, 0, 0) + 16777220, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 77;
        asInterface = i % 128;
        int i2 = i % 2;
    }

    private TransferMydataOnboardingResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlinx.serialization.KSerializer[]] */
    /* JADX WARN: Type inference failed for: r4v2, types: [kotlinx.serialization.KSerializer[]] */
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = asBinder + 105;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            ?? r4 = new KSerializer[1];
            r4[1] = TransferMydataOnboardingResponse.onNavigationEvent()[0].getValue();
            kSerializerArr = r4;
        } else {
            kSerializerArr = new KSerializer[]{TransferMydataOnboardingResponse.onNavigationEvent()[0].getValue()};
        }
        int i3 = asBinder + 35;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 55;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return m103deserialize(decoder);
        }
        m103deserialize(decoder);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final TransferMydataOnboardingResponse m103deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        TransferMydataOnboardingResponse.IAuthTabCallback iAuthTabCallback;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnNavigationEvent = TransferMydataOnboardingResponse.onNavigationEvent();
        int i2 = 1;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            iAuthTabCallback = (TransferMydataOnboardingResponse.IAuthTabCallback) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnNavigationEvent[0].getValue(), (Object) null);
        } else {
            TransferMydataOnboardingResponse.IAuthTabCallback iAuthTabCallback2 = null;
            boolean z = true;
            int i3 = 0;
            while (z) {
                int i4 = IAuthTabCallbackDefault + 13;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i6 = asBinder + 83;
                    IAuthTabCallbackDefault = i6 % 128;
                    if (i6 % 2 != 0) {
                        int i7 = 39 / 0;
                        if (iOnNavigationEvent != 0) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        iAuthTabCallback2 = (TransferMydataOnboardingResponse.IAuthTabCallback) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnNavigationEvent[0].getValue(), iAuthTabCallback2);
                        i3 = 1;
                    } else {
                        if (iOnNavigationEvent != 0) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        iAuthTabCallback2 = (TransferMydataOnboardingResponse.IAuthTabCallback) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnNavigationEvent[0].getValue(), iAuthTabCallback2);
                        i3 = 1;
                    }
                } else {
                    z = false;
                }
            }
            iAuthTabCallback = iAuthTabCallback2;
            i2 = i3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new TransferMydataOnboardingResponse(i2, iAuthTabCallback, (okycx) null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 65;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (TransferMydataOnboardingResponse) obj);
        int i4 = asBinder + 17;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull TransferMydataOnboardingResponse transferMydataOnboardingResponse) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 65;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(transferMydataOnboardingResponse, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        TransferMydataOnboardingResponse.onNavigationEvent(transferMydataOnboardingResponse, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallbackDefault + 85;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 33;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i4 = $11 + 41;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i8 = (c2 + i6) ^ ((c2 << 4) + ((char) (onWarmupCompleted ^ 1094535280733222934L)));
                int i9 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onExtraCallback);
                    objArr2[2] = Integer.valueOf(i9);
                    objArr2[1] = Integer.valueOf(i8);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        int capsMode = 10 - TextUtils.getCapsMode(BuildConfig.FLAVOR, i3, i3);
                        int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 12435;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(keyRepeatTimeout, capsMode, modifierMetaStateMask, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(IAuthTabCallback)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getMode(0), 10 - View.combineMeasuredStates(0, 0), 12434 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7++;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.getDefaultSize(0, 0) + 16014), 14 - View.getDefaultSize(0, 0), ((byte) KeyEvent.getModifierMetaStateMask()) + 19902, -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            int i10 = $10 + 115;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void onNavigationEvent() {
        onExtraCallbackWithResult = (char) 5042;
        IAuthTabCallback = (char) 49693;
        onWarmupCompleted = (char) 33664;
        onExtraCallback = (char) 18256;
    }
}
