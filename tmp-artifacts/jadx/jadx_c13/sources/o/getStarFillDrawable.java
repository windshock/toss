package o;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getStarFillDrawable implements KSerializer<Unit> {
    public static final getStarFillDrawable onExtraCallback = new getStarFillDrawable();
    private final /* synthetic */ htf1<Unit> onNavigationEvent = new htf1<>("kotlin.Unit", Unit.INSTANCE);

    @Override // o.py
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public void serialize(@NotNull Encoder encoder, @NotNull Unit unit) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(unit, "");
        this.onNavigationEvent.serialize(encoder, unit);
    }

    @Override // kotlinx.serialization.KSerializer, o.py, o.jp
    public SerialDescriptor getDescriptor() {
        return this.onNavigationEvent.getDescriptor();
    }

    public void onExtraCallbackWithResult(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "");
        this.onNavigationEvent.deserialize(decoder);
    }

    private getStarFillDrawable() {
    }

    @Override // o.jp
    public /* synthetic */ Object deserialize(Decoder decoder) {
        onExtraCallbackWithResult(decoder);
        return Unit.INSTANCE;
    }
}
