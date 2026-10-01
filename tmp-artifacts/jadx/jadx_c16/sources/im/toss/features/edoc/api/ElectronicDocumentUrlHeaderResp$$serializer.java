package im.toss.features.edoc.api;

import java.util.Map;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ElectronicDocumentUrlHeaderResp$$serializer implements aeu2<ElectronicDocumentUrlHeaderResp> {
    public static final int $stable;
    private static int IAuthTabCallback = 0;
    public static final ElectronicDocumentUrlHeaderResp$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        SerialDescriptor serialDescriptor;
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 119;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            serialDescriptor = descriptor;
            int i4 = 90 / 0;
        } else {
            serialDescriptor = descriptor;
        }
        int i5 = i2 + 31;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 0 / 0;
        }
        return serialDescriptor;
    }

    static {
        ElectronicDocumentUrlHeaderResp$$serializer electronicDocumentUrlHeaderResp$$serializer = new ElectronicDocumentUrlHeaderResp$$serializer();
        INSTANCE = electronicDocumentUrlHeaderResp$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.edoc.api.ElectronicDocumentUrlHeaderResp", electronicDocumentUrlHeaderResp$$serializer, 1);
        setanimationsloop.onWarmupCompleted("header", true);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 99;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private ElectronicDocumentUrlHeaderResp$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 37;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return new KSerializer[]{sp.IAuthTabCallback((KSerializer) ElectronicDocumentUrlHeaderResp.onNavigationEvent()[0].getValue())};
        }
        KSerializer<?>[] kSerializerArr = new KSerializer[0];
        kSerializerArr[1] = sp.IAuthTabCallback((KSerializer) ElectronicDocumentUrlHeaderResp.onNavigationEvent()[0].getValue());
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0052 A[PHI: r1 r2 r12
      0x0052: PHI (r1v7 kotlinx.serialization.descriptors.SerialDescriptor) = (r1v4 kotlinx.serialization.descriptors.SerialDescriptor), (r1v8 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0038, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x0052: PHI (r2v10 kotlin.Lazy[]) = (r2v2 kotlin.Lazy[]), (r2v12 kotlin.Lazy[]) binds: [B:8:0x0038, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x0052: PHI (r12v5 o.yw) = (r12v1 o.yw), (r12v7 o.yw) binds: [B:8:0x0038, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003a A[PHI: r1 r2 r12
      0x003a: PHI (r1v5 kotlinx.serialization.descriptors.SerialDescriptor) = (r1v4 kotlinx.serialization.descriptors.SerialDescriptor), (r1v8 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0038, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x003a: PHI (r2v3 kotlin.Lazy[]) = (r2v2 kotlin.Lazy[]), (r2v12 kotlin.Lazy[]) binds: [B:8:0x0038, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x003a: PHI (r12v2 o.yw) = (r12v1 o.yw), (r12v7 o.yw) binds: [B:8:0x0038, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ElectronicDocumentUrlHeaderResp deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        SerialDescriptor serialDescriptor;
        yw ywVarOnWarmupCompleted;
        Lazy[] lazyArrOnNavigationEvent;
        Map map;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 85;
        onWarmupCompleted = i2 % 128;
        int i3 = 1;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            lazyArrOnNavigationEvent = ElectronicDocumentUrlHeaderResp.onNavigationEvent();
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
                map = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, (jp) lazyArrOnNavigationEvent[0].getValue(), (Object) null);
                int i4 = onWarmupCompleted + 101;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
            } else {
                int i6 = onWarmupCompleted + 85;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                boolean z = true;
                Map map2 = null;
                int i8 = 0;
                while (z) {
                    int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    if (iOnNavigationEvent != -1) {
                        int i9 = IAuthTabCallback + 15;
                        onWarmupCompleted = i9 % 128;
                        if (i9 % 2 == 0) {
                            obj.hashCode();
                            throw null;
                        }
                        if (iOnNavigationEvent != 0) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        map2 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, (jp) lazyArrOnNavigationEvent[0].getValue(), map2);
                        i8 = 1;
                    } else {
                        z = false;
                    }
                }
                map = map2;
                i3 = i8;
            }
        } else {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            lazyArrOnNavigationEvent = ElectronicDocumentUrlHeaderResp.onNavigationEvent();
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new ElectronicDocumentUrlHeaderResp(i3, map, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m231deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 113;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        ElectronicDocumentUrlHeaderResp electronicDocumentUrlHeaderRespDeserialize = deserialize(decoder);
        int i4 = onWarmupCompleted + 105;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return electronicDocumentUrlHeaderRespDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ElectronicDocumentUrlHeaderResp electronicDocumentUrlHeaderResp) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 63;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(electronicDocumentUrlHeaderResp, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        ElectronicDocumentUrlHeaderResp.onNavigationEvent(electronicDocumentUrlHeaderResp, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onWarmupCompleted + 27;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 27;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ElectronicDocumentUrlHeaderResp) obj);
        if (i3 != 0) {
            int i4 = 92 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 85;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallback + 49;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
