package viva.republica.toss.network.model.electronicdocument.wallet;

import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import net.sf.scuba.smartcards.BuildConfig;
import o.aeu2;
import o.getDynamicHeight;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class EDocListForPrintResp$$serializer implements aeu2<EDocListForPrintResp> {
    private static int IAuthTabCallback = 0;
    public static final EDocListForPrintResp$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        SerialDescriptor serialDescriptor;
        int i = 2 % 2;
        int i2 = onExtraCallback + 11;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 != 0) {
            serialDescriptor = descriptor;
            int i4 = 57 / 0;
        } else {
            serialDescriptor = descriptor;
        }
        int i5 = i3 + 57;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        EDocListForPrintResp$$serializer eDocListForPrintResp$$serializer = new EDocListForPrintResp$$serializer();
        INSTANCE = eDocListForPrintResp$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.electronicdocument.wallet.EDocListForPrintResp", eDocListForPrintResp$$serializer, 2);
        setanimationsloop.onWarmupCompleted("maxPrint", true);
        setanimationsloop.onWarmupCompleted("documents", true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 11;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private EDocListForPrintResp$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 29;
        onExtraCallback = i2 % 128;
        return i2 % 2 == 0 ? new KSerializer[]{getDynamicHeight.onWarmupCompleted, EDocListForPrintResp.onWarmupCompleted()[0].getValue()} : new KSerializer[]{getDynamicHeight.onWarmupCompleted, EDocListForPrintResp.onWarmupCompleted()[1].getValue()};
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        EDocListForPrintResp eDocListForPrintRespM57deserialize = m57deserialize(decoder);
        int i4 = IAuthTabCallback + 89;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return eDocListForPrintRespM57deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final EDocListForPrintResp m57deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int iOnTransact;
        List list;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnWarmupCompleted = EDocListForPrintResp.onWarmupCompleted();
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            boolean z = true;
            list = null;
            i = 0;
            iOnTransact = 0;
            while (z) {
                int i3 = onExtraCallback + 31;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    iOnTransact = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 0);
                    i |= 1;
                } else {
                    if (iOnNavigationEvent != 1) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    list = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnWarmupCompleted[1].getValue(), list);
                    i |= 2;
                }
            }
        } else {
            int i4 = IAuthTabCallback + 47;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            iOnTransact = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 0);
            list = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnWarmupCompleted[1].getValue(), (Object) null);
            int i6 = IAuthTabCallback + 109;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            i = 3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new EDocListForPrintResp(i, iOnTransact, list, (okycx) null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 23;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (EDocListForPrintResp) obj);
        int i4 = onExtraCallback + 73;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull EDocListForPrintResp eDocListForPrintResp) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 113;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(eDocListForPrintResp, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        EDocListForPrintResp.onNavigationEvent(eDocListForPrintResp, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallback + 55;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 48 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        KSerializer<?>[] kSerializerArrTypeParametersSerializers;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 79;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
            int i3 = 27 / 0;
        } else {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        }
        int i4 = IAuthTabCallback + 69;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        throw null;
    }
}
