package o;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import net.sf.scuba.smartcards.BuildConfig;
import o.spv;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class bh implements KSerializer<jni_YGNodeStyleSetFlexBasisJNI> {
    public static final bh onExtraCallback = new bh();
    private static final SerialDescriptor onWarmupCompleted = ujb.onExtraCallbackWithResult("kotlinx.datetime.LocalDateTime", spv.IAuthTabCallbackStub.onExtraCallback);

    private bh() {
    }

    public SerialDescriptor getDescriptor() {
        return onWarmupCompleted;
    }

    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public jni_YGNodeStyleSetFlexBasisJNI deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
        return jni_YGNodeStyleSetFlexBasisJNI$onNavigationEvent.IAuthTabCallback(jni_YGNodeStyleSetFlexBasisJNI.Companion, decoder.IAuthTabCallback_Parcel(), null, 2, null);
    }

    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public void serialize(@NotNull Encoder encoder, @NotNull jni_YGNodeStyleSetFlexBasisJNI jni_ygnodestylesetflexbasisjni) {
        Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(jni_ygnodestylesetflexbasisjni, BuildConfig.FLAVOR);
        encoder.onExtraCallbackWithResult(jni_ygnodestylesetflexbasisjni.toString());
    }
}
