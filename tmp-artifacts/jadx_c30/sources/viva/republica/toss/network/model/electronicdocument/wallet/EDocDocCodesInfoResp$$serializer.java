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
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class EDocDocCodesInfoResp$$serializer implements aeu2<EDocDocCodesInfoResp> {
    private static int IAuthTabCallback = 0;
    public static final EDocDocCodesInfoResp$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        throw null;
    }

    static {
        EDocDocCodesInfoResp$$serializer eDocDocCodesInfoResp$$serializer = new EDocDocCodesInfoResp$$serializer();
        INSTANCE = eDocDocCodesInfoResp$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.electronicdocument.wallet.EDocDocCodesInfoResp", eDocDocCodesInfoResp$$serializer, 1);
        setanimationsloop.onWarmupCompleted("docCodeMetas", true);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 75;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private EDocDocCodesInfoResp$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 81;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return new KSerializer[]{sp.IAuthTabCallback((KSerializer) EDocDocCodesInfoResp.onExtraCallbackWithResult()[0].getValue())};
        }
        KSerializer<?>[] kSerializerArr = new KSerializer[1];
        kSerializerArr[1] = sp.IAuthTabCallback((KSerializer) EDocDocCodesInfoResp.onExtraCallbackWithResult()[1].getValue());
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 57;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        EDocDocCodesInfoResp eDocDocCodesInfoRespM55deserialize = m55deserialize(decoder);
        int i4 = onWarmupCompleted + 5;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 68 / 0;
        }
        return eDocDocCodesInfoRespM55deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final EDocDocCodesInfoResp m55deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        List list;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnExtraCallbackWithResult = EDocDocCodesInfoResp.onExtraCallbackWithResult();
        int i2 = 1;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = onWarmupCompleted + 9;
            onNavigationEvent = i3 % 128;
            list = (List) (i3 % 2 == 0 ? ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArrOnExtraCallbackWithResult[0].getValue(), (Object) null) : ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, (jp) lazyArrOnExtraCallbackWithResult[0].getValue(), (Object) null));
        } else {
            boolean z = true;
            List list2 = null;
            int i4 = 0;
            while (z) {
                int i5 = onWarmupCompleted + 99;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    int i6 = onWarmupCompleted + 3;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    z = false;
                } else {
                    if (iOnNavigationEvent != 0) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    list2 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, (jp) lazyArrOnExtraCallbackWithResult[0].getValue(), list2);
                    i4 = 1;
                }
            }
            list = list2;
            i2 = i4;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new EDocDocCodesInfoResp(i2, list, (okycx) null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 67;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (EDocDocCodesInfoResp) obj);
        if (i3 != 0) {
            int i4 = 90 / 0;
        }
        int i5 = onWarmupCompleted + 113;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull EDocDocCodesInfoResp eDocDocCodesInfoResp) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
            Intrinsics.checkNotNullParameter(eDocDocCodesInfoResp, BuildConfig.FLAVOR);
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            EDocDocCodesInfoResp.onNavigationEvent(eDocDocCodesInfoResp, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(eDocDocCodesInfoResp, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        EDocDocCodesInfoResp.onNavigationEvent(eDocDocCodesInfoResp, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = onNavigationEvent + 67;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 34 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 67;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onWarmupCompleted + 57;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 80 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
