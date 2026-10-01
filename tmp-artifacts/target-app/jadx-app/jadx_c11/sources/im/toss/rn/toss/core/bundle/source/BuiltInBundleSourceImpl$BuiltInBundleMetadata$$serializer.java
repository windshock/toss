package im.toss.rn.toss.core.bundle.source;

import im.toss.rn.toss.core.bundle.source.BuiltInBundleSourceImpl;
import java.util.Arrays;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.PangleEncryptConstant;
import o.aeu2;
import o.getWriggleLayout;
import o.oty1;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final /* synthetic */ class BuiltInBundleSourceImpl$BuiltInBundleMetadata$$serializer implements aeu2<BuiltInBundleSourceImpl.BuiltInBundleMetadata> {
    public static final BuiltInBundleSourceImpl$BuiltInBundleMetadata$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        BuiltInBundleSourceImpl$BuiltInBundleMetadata$$serializer builtInBundleSourceImpl$BuiltInBundleMetadata$$serializer = new BuiltInBundleSourceImpl$BuiltInBundleMetadata$$serializer();
        INSTANCE = builtInBundleSourceImpl$BuiltInBundleMetadata$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.rn.toss.core.bundle.source.BuiltInBundleSourceImpl.BuiltInBundleMetadata", builtInBundleSourceImpl$BuiltInBundleMetadata$$serializer, 7);
        setanimationsloop.onWarmupCompleted("signature", false);
        setanimationsloop.onWarmupCompleted("deploymentId", false);
        setanimationsloop.onExtraCallback(new PangleEncryptConstant(new String[]{"deploymentID"}) { // from class: im.toss.rn.toss.core.bundle.source.BuiltInBundleSourceImpl$BuiltInBundleMetadata$$serializer.onExtraCallback
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;
            private final /* synthetic */ String[] onWarmupCompleted;

            {
                Intrinsics.checkNotNullParameter(strArr, "");
                this.onWarmupCompleted = strArr;
            }

            public final /* synthetic */ Class annotationType() {
                Class<PangleEncryptConstant> cls;
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int i3 = i2 + 63;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    cls = PangleEncryptConstant.class;
                    int i4 = 55 / 0;
                } else {
                    cls = PangleEncryptConstant.class;
                }
                int i5 = i2 + 1;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return cls;
            }

            public final boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 95;
                int i3 = i2 % 128;
                onNavigationEvent = i3;
                int i4 = i2 % 2;
                if (!(obj instanceof PangleEncryptConstant)) {
                    int i5 = i3 + 119;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    return false;
                }
                if (Arrays.equals(names(), ((PangleEncryptConstant) obj).names())) {
                    return true;
                }
                int i7 = onExtraCallbackWithResult + 117;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }

            public final int hashCode() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 37;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                int iHashCode = Arrays.hashCode(this.onWarmupCompleted) ^ 397397176;
                int i4 = onExtraCallbackWithResult + 51;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    return iHashCode;
                }
                throw null;
            }

            public final /* synthetic */ String[] names() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 17;
                int i3 = i2 % 128;
                onExtraCallbackWithResult = i3;
                Object obj = null;
                if (i2 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                String[] strArr = this.onWarmupCompleted;
                int i4 = i3 + 41;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    return strArr;
                }
                obj.hashCode();
                throw null;
            }

            public final String toString() {
                int i = 2 % 2;
                String str = "@kotlinx.serialization.json.JsonNames(names=" + Arrays.toString(this.onWarmupCompleted) + ")";
                int i2 = onExtraCallbackWithResult + 93;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }
        });
        setanimationsloop.onWarmupCompleted("deployedAt", false);
        setanimationsloop.onWarmupCompleted("sharedMinDeployedAt", true);
        setanimationsloop.onWarmupCompleted("savedAt", true);
        setanimationsloop.onWarmupCompleted("updatedAt", true);
        setanimationsloop.onWarmupCompleted("reactNativeVersion", true);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 13;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private BuiltInBundleSourceImpl$BuiltInBundleMetadata$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 17;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializer = getWriggleLayout.onNavigationEvent;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(kSerializer);
        oty1 oty1Var = oty1.onExtraCallback;
        KSerializer<?>[] kSerializerArr = {kSerializer, kSerializer, kSerializer, kSerializer, oty1Var, oty1Var, kSerializerIAuthTabCallback};
        int i4 = onExtraCallbackWithResult + 35;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final BuiltInBundleSourceImpl.BuiltInBundleMetadata deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        String str;
        String str2;
        int i;
        String str3;
        String str4;
        long j;
        long j2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i3 = 6;
        String strAsInterface2 = null;
        if (!(!ywVarOnWarmupCompleted.extraCallbackWithResult())) {
            int i4 = onNavigationEvent + 5;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            String strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            String strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            String strAsInterface5 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            String strAsInterface6 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
            long jIAuthTabCallbackDefault = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 4);
            long jIAuthTabCallbackDefault2 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 5);
            str2 = strAsInterface5;
            str4 = strAsInterface4;
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, getWriggleLayout.onNavigationEvent, (Object) null);
            strAsInterface = strAsInterface6;
            j2 = jIAuthTabCallbackDefault2;
            j = jIAuthTabCallbackDefault;
            str3 = strAsInterface3;
            i = 127;
        } else {
            long jIAuthTabCallbackDefault3 = 0;
            boolean z = true;
            int i6 = 0;
            String strAsInterface7 = null;
            String str5 = null;
            strAsInterface = null;
            String strAsInterface8 = null;
            long jIAuthTabCallbackDefault4 = 0;
            while (!(!z)) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        strAsInterface7 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i6 |= 1;
                        break;
                    case 1:
                        strAsInterface8 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                        i6 |= 2;
                        break;
                    case 2:
                        strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                        i6 |= 4;
                        int i7 = onNavigationEvent + 107;
                        onExtraCallbackWithResult = i7 % 128;
                        int i8 = i7 % 2;
                        break;
                    case 3:
                        strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
                        i6 |= 8;
                        continue;
                    case 4:
                        jIAuthTabCallbackDefault4 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 4);
                        i6 |= 16;
                        continue;
                    case 5:
                        jIAuthTabCallbackDefault3 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 5);
                        i6 |= 32;
                        continue;
                    case 6:
                        str5 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i3, getWriggleLayout.onNavigationEvent, str5);
                        i6 |= 64;
                        continue;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
                i3 = 6;
            }
            str = str5;
            str2 = strAsInterface2;
            long j3 = jIAuthTabCallbackDefault3;
            i = i6;
            str3 = strAsInterface7;
            str4 = strAsInterface8;
            j = jIAuthTabCallbackDefault4;
            j2 = j3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new BuiltInBundleSourceImpl.BuiltInBundleMetadata(i, str3, str4, str2, strAsInterface, j, j2, str, null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m10deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        BuiltInBundleSourceImpl.BuiltInBundleMetadata builtInBundleMetadataDeserialize = deserialize(decoder);
        int i4 = onExtraCallbackWithResult + 5;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return builtInBundleMetadataDeserialize;
        }
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull BuiltInBundleSourceImpl.BuiltInBundleMetadata builtInBundleMetadata) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(builtInBundleMetadata, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        BuiltInBundleSourceImpl.BuiltInBundleMetadata.onExtraCallback(builtInBundleMetadata, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onNavigationEvent + 125;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (BuiltInBundleSourceImpl.BuiltInBundleMetadata) obj);
        int i4 = onNavigationEvent + 105;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 55;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            super.typeParametersSerializers();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = onNavigationEvent + 77;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
