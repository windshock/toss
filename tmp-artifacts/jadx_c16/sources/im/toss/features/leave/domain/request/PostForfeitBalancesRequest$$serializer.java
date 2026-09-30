package im.toss.features.leave.domain.request;

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
public final /* synthetic */ class PostForfeitBalancesRequest$$serializer implements aeu2<PostForfeitBalancesRequest> {
    private static int IAuthTabCallback = 1;
    public static final PostForfeitBalancesRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 29;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 1;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return serialDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        PostForfeitBalancesRequest$$serializer postForfeitBalancesRequest$$serializer = new PostForfeitBalancesRequest$$serializer();
        INSTANCE = postForfeitBalancesRequest$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.leave.domain.request.PostForfeitBalancesRequest", postForfeitBalancesRequest$$serializer, 1);
        setanimationsloop.onWarmupCompleted("items", false);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 5;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private PostForfeitBalancesRequest$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {PostForfeitBalancesRequest.IAuthTabCallback()[0].getValue()};
        int i4 = onNavigationEvent + 17;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PostForfeitBalancesRequest deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        SerialDescriptor serialDescriptor;
        yw ywVarOnWarmupCompleted;
        Lazy[] lazyArrIAuthTabCallback;
        boolean z;
        List list;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        onNavigationEvent = i2 % 128;
        int i3 = 1;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            lazyArrIAuthTabCallback = PostForfeitBalancesRequest.IAuthTabCallback();
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
                i3 = 0;
                list = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrIAuthTabCallback[0].getValue(), (Object) null);
            }
            int i4 = onNavigationEvent + 47;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            List list2 = null;
            z = true;
            int i6 = 0;
            while (z) {
                int i7 = onNavigationEvent + 111;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else {
                    if (iOnNavigationEvent != 0) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    list2 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrIAuthTabCallback[0].getValue(), list2);
                    i6 = 1;
                }
            }
            list = list2;
            i3 = i6;
        } else {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            lazyArrIAuthTabCallback = PostForfeitBalancesRequest.IAuthTabCallback();
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
                list = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrIAuthTabCallback[0].getValue(), (Object) null);
            } else {
                int i42 = onNavigationEvent + 47;
                onExtraCallbackWithResult = i42 % 128;
                int i52 = i42 % 2;
                List list22 = null;
                z = true;
                int i62 = 0;
                while (z) {
                }
                list = list22;
                i3 = i62;
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new PostForfeitBalancesRequest(i3, list, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m646deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 111;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        PostForfeitBalancesRequest postForfeitBalancesRequestDeserialize = deserialize(decoder);
        int i4 = onExtraCallbackWithResult + 21;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return postForfeitBalancesRequestDeserialize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull PostForfeitBalancesRequest postForfeitBalancesRequest) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(postForfeitBalancesRequest, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        PostForfeitBalancesRequest.onExtraCallback(postForfeitBalancesRequest, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onNavigationEvent + 89;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 87;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (PostForfeitBalancesRequest) obj);
        int i4 = onExtraCallbackWithResult + 21;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 96 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 45;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
