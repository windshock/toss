package kotlinx.serialization.encoding;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.hfycx;
import o.jp;
import o.yw;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface Decoder {
    int IAuthTabCallback(@NotNull SerialDescriptor serialDescriptor);

    hfycx IAuthTabCallback();

    double IAuthTabCallbackDefault();

    byte IAuthTabCallbackStub();

    short IAuthTabCallbackStubProxy();

    String IAuthTabCallback_Parcel();

    long access100();

    float asBinder();

    int asInterface();

    Void onExtraCallback();

    Decoder onExtraCallback(@NotNull SerialDescriptor serialDescriptor);

    boolean onExtraCallbackWithResult();

    boolean onNavigationEvent();

    char onTransact();

    yw onWarmupCompleted(@NotNull SerialDescriptor serialDescriptor);

    default <T> T onWarmupCompleted(@NotNull jp<? extends T> jpVar) {
        Intrinsics.checkNotNullParameter(jpVar, "");
        return jpVar.deserialize(this);
    }
}
