package o;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.setLottieAdDescMaxLength;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class setLottieAdTitleMaxLength<Element, Array, Builder extends setLottieAdDescMaxLength<Array>> extends getTimeOutListener<Element, Array, Builder> {
    private final SerialDescriptor onNavigationEvent;

    protected abstract void onExtraCallbackWithResult(@NotNull vyl vylVar, Array array, int i);

    protected abstract Array onNavigationEvent();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setLottieAdTitleMaxLength(@NotNull KSerializer<Element> kSerializer) {
        super(kSerializer, null);
        Intrinsics.checkNotNullParameter(kSerializer, "");
        this.onNavigationEvent = new setDislikeColor(kSerializer.getDescriptor());
    }

    @Override // o.getTimeOutListener, kotlinx.serialization.KSerializer, o.py, o.jp
    public final SerialDescriptor getDescriptor() {
        return this.onNavigationEvent;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.wk
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public final int onWarmupCompleted(@NotNull Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "");
        return builder.onExtraCallback();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.wk
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public final Array onNavigationEvent(@NotNull Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "");
        return (Array) builder.onExtraCallbackWithResult();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.wk
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public final void onNavigationEvent(@NotNull Builder builder, int i) {
        Intrinsics.checkNotNullParameter(builder, "");
        builder.onWarmupCompleted(i);
    }

    @Override // o.wk
    protected final Iterator<Element> onExtraCallbackWithResult(Array array) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.getTimeOutListener
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public final void onNavigationEvent(@NotNull Builder builder, int i, Element element) {
        Intrinsics.checkNotNullParameter(builder, "");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.wk
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public final Builder onExtraCallbackWithResult() {
        return IAuthTabCallback((setLottieAdTitleMaxLength<Element, Array, Builder>) onNavigationEvent());
    }

    @Override // o.getTimeOutListener, o.py
    public final void serialize(@NotNull Encoder encoder, Array array) {
        Intrinsics.checkNotNullParameter(encoder, "");
        int iOnExtraCallback = onExtraCallback(array);
        SerialDescriptor serialDescriptor = this.onNavigationEvent;
        vyl vylVarIAuthTabCallback = encoder.IAuthTabCallback(serialDescriptor, iOnExtraCallback);
        onExtraCallbackWithResult(vylVarIAuthTabCallback, array, iOnExtraCallback);
        vylVarIAuthTabCallback.onNavigationEvent(serialDescriptor);
    }

    @Override // o.wk, o.jp
    public final Array deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "");
        return onNavigationEvent(decoder, (Decoder) null);
    }
}
