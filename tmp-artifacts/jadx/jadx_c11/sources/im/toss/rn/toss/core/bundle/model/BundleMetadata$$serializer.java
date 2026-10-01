package im.toss.rn.toss.core.bundle.model;

import im.toss.features.foreigner.home.ui.test.ForeignerHomeTestScreenKt$;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getWriggleLayout;
import o.oty1;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final /* synthetic */ class BundleMetadata$$serializer implements aeu2<BundleMetadata> {
    private static int IAuthTabCallback = 1;
    public static final BundleMetadata$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 81;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 31;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        BundleMetadata$$serializer bundleMetadata$$serializer = new BundleMetadata$$serializer();
        INSTANCE = bundleMetadata$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.rn.toss.core.bundle.model.BundleMetadata", bundleMetadata$$serializer, 7);
        setanimationsloop.onWarmupCompleted("signature", false);
        setanimationsloop.onWarmupCompleted("deploymentId", false);
        setanimationsloop.onWarmupCompleted("deployedAt", false);
        setanimationsloop.onWarmupCompleted("sharedMinDeployedAt", false);
        setanimationsloop.onWarmupCompleted("savedAt", false);
        setanimationsloop.onWarmupCompleted("updatedAt", false);
        setanimationsloop.onWarmupCompleted("reactNativeVersion", true);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 35;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private BundleMetadata$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 93;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            KSerializer<?> kSerializer = getWriggleLayout.onNavigationEvent;
            KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(kSerializer);
            oty1 oty1Var = oty1.onExtraCallback;
            return new KSerializer[]{kSerializer, kSerializer, kSerializer, kSerializer, oty1Var, oty1Var, kSerializerIAuthTabCallback};
        }
        KSerializer<?> kSerializer2 = getWriggleLayout.onNavigationEvent;
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(kSerializer2);
        KSerializer<?>[] kSerializerArr = new KSerializer[99];
        kSerializerArr[0] = kSerializer2;
        kSerializerArr[1] = kSerializer2;
        kSerializerArr[4] = kSerializer2;
        kSerializerArr[2] = kSerializer2;
        oty1 oty1Var2 = oty1.onExtraCallback;
        kSerializerArr[3] = oty1Var2;
        kSerializerArr[3] = oty1Var2;
        kSerializerArr[32] = kSerializerIAuthTabCallback2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final BundleMetadata deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        String strAsInterface2;
        long jIAuthTabCallbackDefault;
        long jIAuthTabCallbackDefault2;
        String str;
        int i;
        String str2;
        String str3;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        String strAsInterface3 = null;
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            boolean z = true;
            String strAsInterface4 = null;
            strAsInterface = null;
            jIAuthTabCallbackDefault2 = 0;
            jIAuthTabCallbackDefault = 0;
            i = 0;
            str = null;
            strAsInterface2 = null;
            while (!(!z)) {
                int i3 = IAuthTabCallback + 11;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        i |= 1;
                        strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        break;
                    case 1:
                        strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                        i |= 2;
                        break;
                    case 2:
                        strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                        i |= 4;
                        break;
                    case 3:
                        strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
                        i |= 8;
                        break;
                    case 4:
                        jIAuthTabCallbackDefault = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 4);
                        i |= 16;
                        break;
                    case 5:
                        jIAuthTabCallbackDefault2 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 5);
                        i |= 32;
                        int i5 = IAuthTabCallback + 25;
                        onWarmupCompleted = i5 % 128;
                        int i6 = i5 % 2;
                        break;
                    case 6:
                        str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, getWriggleLayout.onNavigationEvent, str);
                        i |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            str2 = strAsInterface4;
            str3 = strAsInterface3;
        } else {
            int i7 = onWarmupCompleted + 57;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            String strAsInterface5 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            String strAsInterface6 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
            jIAuthTabCallbackDefault = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 4);
            jIAuthTabCallbackDefault2 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 5);
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, getWriggleLayout.onNavigationEvent, (Object) null);
            int i9 = IAuthTabCallback + 85;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            i = 127;
            str2 = strAsInterface5;
            str3 = strAsInterface6;
        }
        String str4 = strAsInterface2;
        String str5 = strAsInterface;
        long j = jIAuthTabCallbackDefault2;
        long j2 = jIAuthTabCallbackDefault;
        int i11 = i;
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new BundleMetadata(i11, str2, str5, str3, str4, j2, j, str, null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m9deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 21;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        BundleMetadata bundleMetadataDeserialize = deserialize(decoder);
        int i4 = IAuthTabCallback + 97;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return bundleMetadataDeserialize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull BundleMetadata bundleMetadata) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 45;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(bundleMetadata, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        BundleMetadata.onExtraCallback(1735847774, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), -1735847773, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted2, iOnWarmupCompleted, new Object[]{bundleMetadata, vylVarOnExtraCallback, serialDescriptor});
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onWarmupCompleted + 3;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 125;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (BundleMetadata) obj);
        int i4 = onWarmupCompleted + 23;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 49;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
