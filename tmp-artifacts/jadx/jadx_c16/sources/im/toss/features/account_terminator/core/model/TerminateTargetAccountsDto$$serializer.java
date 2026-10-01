package im.toss.features.account_terminator.core.model;

import java.util.List;
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
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TerminateTargetAccountsDto$$serializer implements aeu2<TerminateTargetAccountsDto> {
    public static final int $stable;
    private static int IAuthTabCallback = 0;
    public static final TerminateTargetAccountsDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 81;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        TerminateTargetAccountsDto$$serializer terminateTargetAccountsDto$$serializer = new TerminateTargetAccountsDto$$serializer();
        INSTANCE = terminateTargetAccountsDto$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.account_terminator.core.model.TerminateTargetAccountsDto", terminateTargetAccountsDto$$serializer, 2);
        setanimationsloop.onWarmupCompleted("terminationTargetAccounts", true);
        setanimationsloop.onWarmupCompleted("transferTargetAccounts", true);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 71;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 82 / 0;
        }
    }

    private TerminateTargetAccountsDto$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnExtraCallbackWithResult = TerminateTargetAccountsDto.onExtraCallbackWithResult();
        KSerializer<?>[] kSerializerArr = {lazyArrOnExtraCallbackWithResult[0].getValue(), lazyArrOnExtraCallbackWithResult[1].getValue()};
        int i4 = IAuthTabCallback + 29;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:10:0x005c A[PHI: r1 r2 r15
      0x005c: PHI (r1v5 kotlinx.serialization.descriptors.SerialDescriptor) = (r1v4 kotlinx.serialization.descriptors.SerialDescriptor), (r1v8 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x003b, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]
      0x005c: PHI (r2v3 kotlin.Lazy[]) = (r2v2 kotlin.Lazy[]), (r2v12 kotlin.Lazy[]) binds: [B:8:0x003b, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]
      0x005c: PHI (r15v2 o.yw) = (r15v1 o.yw), (r15v7 o.yw) binds: [B:8:0x003b, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003d A[PHI: r1 r2 r15
      0x003d: PHI (r1v7 kotlinx.serialization.descriptors.SerialDescriptor) = (r1v4 kotlinx.serialization.descriptors.SerialDescriptor), (r1v8 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x003b, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]
      0x003d: PHI (r2v6 kotlin.Lazy[]) = (r2v2 kotlin.Lazy[]), (r2v12 kotlin.Lazy[]) binds: [B:8:0x003b, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]
      0x003d: PHI (r15v6 o.yw) = (r15v1 o.yw), (r15v7 o.yw) binds: [B:8:0x003b, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TerminateTargetAccountsDto deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        SerialDescriptor serialDescriptor;
        yw ywVarOnWarmupCompleted;
        Lazy[] lazyArrOnExtraCallbackWithResult;
        List list;
        List list2;
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 5;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            lazyArrOnExtraCallbackWithResult = TerminateTargetAccountsDto.onExtraCallbackWithResult();
            int i4 = 76 / 0;
            if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
                int i5 = IAuthTabCallback + 67;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                List list3 = null;
                List list4 = null;
                int i7 = 0;
                boolean z = true;
                while (z) {
                    int i8 = IAuthTabCallback + 49;
                    onNavigationEvent = i8 % 128;
                    int i9 = i8 % 2;
                    int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    if (iOnNavigationEvent != -1) {
                        int i10 = onNavigationEvent;
                        int i11 = i10 + 61;
                        IAuthTabCallback = i11 % 128;
                        int i12 = i11 % 2;
                        if (iOnNavigationEvent != 0) {
                            int i13 = i10 + 73;
                            IAuthTabCallback = i13 % 128;
                            int i14 = i13 % 2;
                            if (iOnNavigationEvent != 1) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            int i15 = i10 + 79;
                            IAuthTabCallback = i15 % 128;
                            int i16 = i15 % 2;
                            list4 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnExtraCallbackWithResult[1].getValue(), list4);
                            i7 |= 2;
                        } else {
                            list3 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnExtraCallbackWithResult[0].getValue(), list3);
                            i7 |= 1;
                        }
                    } else {
                        z = false;
                    }
                }
                list = list3;
                list2 = list4;
                i = i7;
            } else {
                list = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnExtraCallbackWithResult[0].getValue(), (Object) null);
                list2 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnExtraCallbackWithResult[1].getValue(), (Object) null);
                i = 3;
            }
        } else {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            lazyArrOnExtraCallbackWithResult = TerminateTargetAccountsDto.onExtraCallbackWithResult();
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new TerminateTargetAccountsDto(i, list, list2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m67deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 13;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        TerminateTargetAccountsDto terminateTargetAccountsDtoDeserialize = deserialize(decoder);
        if (i3 != 0) {
            int i4 = 52 / 0;
        }
        return terminateTargetAccountsDtoDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull TerminateTargetAccountsDto terminateTargetAccountsDto) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(terminateTargetAccountsDto, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            TerminateTargetAccountsDto.IAuthTabCallback(terminateTargetAccountsDto, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(terminateTargetAccountsDto, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        TerminateTargetAccountsDto.IAuthTabCallback(terminateTargetAccountsDto, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 117;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (TerminateTargetAccountsDto) obj);
        int i4 = IAuthTabCallback + 91;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 73;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        throw null;
    }
}
