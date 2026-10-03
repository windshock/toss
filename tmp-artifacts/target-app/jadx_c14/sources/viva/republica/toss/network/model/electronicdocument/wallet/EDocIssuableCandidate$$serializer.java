package viva.republica.toss.network.model.electronicdocument.wallet;

import im.toss.tds.compose.component.compound.tablerow.ComposableSingletons$TdsTableRowV1Kt$;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getBgColor;
import o.getWriggleLayout;
import o.oty1;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class EDocIssuableCandidate$$serializer implements aeu2<EDocIssuableCandidate> {
    private static int IAuthTabCallback = 1;
    public static final EDocIssuableCandidate$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 57;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i3 + 113;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return serialDescriptor;
    }

    static {
        EDocIssuableCandidate$$serializer eDocIssuableCandidate$$serializer = new EDocIssuableCandidate$$serializer();
        INSTANCE = eDocIssuableCandidate$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuableCandidate", eDocIssuableCandidate$$serializer, 8);
        setanimationsloop.onWarmupCompleted("candidateName", true);
        setanimationsloop.onWarmupCompleted("docCodeList", true);
        setanimationsloop.onWarmupCompleted("applyType", true);
        setanimationsloop.onWarmupCompleted("underMaintenance", true);
        setanimationsloop.onWarmupCompleted("maintenanceMessage", true);
        setanimationsloop.onWarmupCompleted("statusMessage", true);
        setanimationsloop.onWarmupCompleted("packageId", true);
        setanimationsloop.onWarmupCompleted("iconUrl", true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 11;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private EDocIssuableCandidate$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 11;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
        int iIAuthTabCallback2 = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
        Lazy[] lazyArr = (Lazy[]) EDocIssuableCandidate.IAuthTabCallback(ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), 1533836587, new Object[0], -1533836586, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2);
        KSerializer<?> kSerializer = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {kSerializer, sp.IAuthTabCallback((KSerializer) lazyArr[1].getValue()), sp.IAuthTabCallback((KSerializer) lazyArr[2].getValue()), getBgColor.IAuthTabCallback, sp.IAuthTabCallback(kSerializer), sp.IAuthTabCallback(kSerializer), sp.IAuthTabCallback(oty1.onExtraCallback), sp.IAuthTabCallback(kSerializer)};
        int i4 = onExtraCallbackWithResult + 85;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 89;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return m19deserialize(decoder);
        }
        m19deserialize(decoder);
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00cc A[PHI: r0 r2 r7
      0x00cc: PHI (r0v5 o.yw) = (r0v1 o.yw), (r0v7 o.yw) binds: [B:8:0x0077, B:5:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x00cc: PHI (r2v8 kotlinx.serialization.descriptors.SerialDescriptor) = (r2v4 kotlinx.serialization.descriptors.SerialDescriptor), (r2v9 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0077, B:5:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x00cc: PHI (r7v11 kotlin.Lazy[]) = (r7v2 kotlin.Lazy[]), (r7v14 kotlin.Lazy[]) binds: [B:8:0x0077, B:5:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0079 A[PHI: r0 r2 r7
      0x0079: PHI (r0v2 o.yw) = (r0v1 o.yw), (r0v7 o.yw) binds: [B:8:0x0077, B:5:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x0079: PHI (r2v5 kotlinx.serialization.descriptors.SerialDescriptor) = (r2v4 kotlinx.serialization.descriptors.SerialDescriptor), (r2v9 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0077, B:5:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x0079: PHI (r7v3 kotlin.Lazy[]) = (r7v2 kotlin.Lazy[]), (r7v14 kotlin.Lazy[]) binds: [B:8:0x0077, B:5:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: deserialize, reason: collision with other method in class */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuableCandidate m19deserialize(@org.jetbrains.annotations.NotNull kotlinx.serialization.encoding.Decoder r23) throws kotlinx.serialization.UnknownFieldException {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuableCandidate$$serializer.m19deserialize(kotlinx.serialization.encoding.Decoder):viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuableCandidate");
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (EDocIssuableCandidate) obj);
        int i4 = IAuthTabCallback + 5;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull EDocIssuableCandidate eDocIssuableCandidate) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 69;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(eDocIssuableCandidate, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        EDocIssuableCandidate.IAuthTabCallback(eDocIssuableCandidate, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallback + 3;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        if (i3 != 0) {
            int i4 = 66 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
