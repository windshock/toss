package o;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.main.TabBadgeInfo;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class SkiaPooledImageRegionDecoder1CpuFilter implements KSerializer<TabBadgeInfo> {
    public static final SkiaPooledImageRegionDecoder1CpuFilter onWarmupCompleted = new SkiaPooledImageRegionDecoder1CpuFilter();
    private static final KSerializer<Map<String, Boolean>> IAuthTabCallback = new getMutilBackgroundDrawable(getWriggleLayout.onNavigationEvent, getBgColor.IAuthTabCallback);
    private static final SerialDescriptor onNavigationEvent = ujb.onNavigationEvent("viva.republica.toss.main.TabBadgeInfo", new SerialDescriptor[0], (Function1) null, 4, (Object) null);

    private SkiaPooledImageRegionDecoder1CpuFilter() {
    }

    public SerialDescriptor getDescriptor() {
        return onNavigationEvent;
    }

    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public TabBadgeInfo deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "");
        return new TabBadgeInfo((Map) IAuthTabCallback.deserialize(decoder));
    }

    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public void serialize(@NotNull kotlinx.serialization.encoding.Encoder encoder, @NotNull TabBadgeInfo tabBadgeInfo) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(tabBadgeInfo, "");
        IAuthTabCallback.serialize(encoder, tabBadgeInfo);
    }
}
