package o;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getCurrentVideoState {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void onNavigationEvent(Encoder encoder) {
        IAuthTabCallback(encoder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onWarmupCompleted(Decoder decoder) {
        onExtraCallback(decoder);
    }

    public static final setAnimationType onExtraCallback(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "");
        setAnimationType setanimationtype = decoder instanceof setAnimationType ? (setAnimationType) decoder : null;
        if (setanimationtype != null) {
            return setanimationtype;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + Reflection.getOrCreateKotlinClass(decoder.getClass()));
    }

    public static final skipVideo IAuthTabCallback(@NotNull Encoder encoder) {
        Intrinsics.checkNotNullParameter(encoder, "");
        skipVideo skipvideo = encoder instanceof skipVideo ? (skipVideo) encoder : null;
        if (skipvideo != null) {
            return skipvideo;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + Reflection.getOrCreateKotlinClass(encoder.getClass()));
    }

    public static final class onExtraCallbackWithResult implements SerialDescriptor {
        private final Lazy onWarmupCompleted;

        onExtraCallbackWithResult(Function0<? extends SerialDescriptor> function0) {
            this.onWarmupCompleted = LazyKt__LazyJVMKt.lazy(function0);
        }

        private final SerialDescriptor IAuthTabCallbackStub() {
            return (SerialDescriptor) this.onWarmupCompleted.getValue();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public String onExtraCallbackWithResult() {
            return IAuthTabCallbackStub().onExtraCallbackWithResult();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public vbt IAuthTabCallback() {
            return IAuthTabCallbackStub().IAuthTabCallback();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public int onExtraCallback() {
            return IAuthTabCallbackStub().onExtraCallback();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public String onWarmupCompleted(int i) {
            return IAuthTabCallbackStub().onWarmupCompleted(i);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public int onExtraCallbackWithResult(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return IAuthTabCallbackStub().onExtraCallbackWithResult(str);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public List<Annotation> onExtraCallbackWithResult(int i) {
            return IAuthTabCallbackStub().onExtraCallbackWithResult(i);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public SerialDescriptor onNavigationEvent(int i) {
            return IAuthTabCallbackStub().onNavigationEvent(i);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public boolean onExtraCallback(int i) {
            return IAuthTabCallbackStub().onExtraCallback(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SerialDescriptor IAuthTabCallback(Function0<? extends SerialDescriptor> function0) {
        return new onExtraCallbackWithResult(function0);
    }
}
