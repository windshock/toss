package okhttp3.internal.platform;

import android.content.Context;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.OutlinedTextFieldDefaultsExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class PlatformInitializer implements OutlinedTextFieldDefaultsExternalSyntheticLambda0<Platform> {
    public Platform create(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
        PlatformRegistry.INSTANCE.setApplicationContext(context);
        return Platform.Companion.get();
    }

    public List<Class<OutlinedTextFieldDefaultsExternalSyntheticLambda0<?>>> dependencies() {
        return CollectionsKt.emptyList();
    }
}
