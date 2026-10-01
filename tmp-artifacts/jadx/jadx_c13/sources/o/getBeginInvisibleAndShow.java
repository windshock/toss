package o;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getBeginInvisibleAndShow {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class onExtraCallbackWithResult<T> implements aeu2<T> {
        final /* synthetic */ KSerializer<T> onExtraCallback;

        onExtraCallbackWithResult(KSerializer<T> kSerializer) {
            this.onExtraCallback = kSerializer;
        }

        @Override // o.aeu2
        public KSerializer<?>[] childSerializers() {
            return new KSerializer[]{this.onExtraCallback};
        }

        @Override // kotlinx.serialization.KSerializer, o.py, o.jp
        public SerialDescriptor getDescriptor() {
            throw new IllegalStateException("unsupported");
        }

        @Override // o.py
        public void serialize(Encoder encoder, T t) {
            Intrinsics.checkNotNullParameter(encoder, "");
            throw new IllegalStateException("unsupported");
        }

        @Override // o.jp
        public T deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "");
            throw new IllegalStateException("unsupported");
        }
    }

    public static final <T> SerialDescriptor onExtraCallbackWithResult(@NotNull String str, @NotNull KSerializer<T> kSerializer) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(kSerializer, "");
        return new eaycx(str, new onExtraCallbackWithResult(kSerializer));
    }
}
