package o;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class getTimeOutListener<Element, Collection, Builder> extends wk<Element, Collection, Builder> {
    private final KSerializer<Element> onExtraCallback;

    public /* synthetic */ getTimeOutListener(KSerializer kSerializer, DefaultConstructorMarker defaultConstructorMarker) {
        this(kSerializer);
    }

    @Override // kotlinx.serialization.KSerializer, o.py, o.jp
    public abstract SerialDescriptor getDescriptor();

    protected abstract void onNavigationEvent(Builder builder, int i, Element element);

    private getTimeOutListener(KSerializer<Element> kSerializer) {
        super(null);
        this.onExtraCallback = kSerializer;
    }

    @Override // o.py
    public void serialize(@NotNull Encoder encoder, Collection collection) {
        Intrinsics.checkNotNullParameter(encoder, "");
        int iOnExtraCallback = onExtraCallback(collection);
        SerialDescriptor descriptor = getDescriptor();
        vyl vylVarIAuthTabCallback = encoder.IAuthTabCallback(descriptor, iOnExtraCallback);
        Iterator<Element> itOnExtraCallbackWithResult = onExtraCallbackWithResult(collection);
        for (int i = 0; i < iOnExtraCallback; i++) {
            vylVarIAuthTabCallback.onNavigationEvent(getDescriptor(), i, this.onExtraCallback, itOnExtraCallbackWithResult.next());
        }
        vylVarIAuthTabCallback.onNavigationEvent(descriptor);
    }

    @Override // o.wk
    protected final void onWarmupCompleted(@NotNull yw ywVar, Builder builder, int i, int i2) {
        Intrinsics.checkNotNullParameter(ywVar, "");
        if (i2 < 0) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
        }
        for (int i3 = 0; i3 < i2; i3++) {
            onNavigationEvent(ywVar, i + i3, builder, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.wk
    protected void onNavigationEvent(@NotNull yw ywVar, int i, Builder builder, boolean z) {
        Intrinsics.checkNotNullParameter(ywVar, "");
        onNavigationEvent(builder, i, yw.onExtraCallback(ywVar, getDescriptor(), i, this.onExtraCallback, null, 8, null));
    }
}
