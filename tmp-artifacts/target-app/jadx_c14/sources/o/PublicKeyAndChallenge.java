package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PublicKeyAndChallenge {
    public static final MicrosoftObjectIdentifiers onExtraCallback(@NotNull makeFallbackLoader makefallbackloader) {
        Intrinsics.checkNotNullParameter(makefallbackloader, "");
        if (makefallbackloader instanceof DynamicLoaderFactoryExternalSyntheticApiModelOutline0) {
            return new getKeyLength((DynamicLoaderFactoryExternalSyntheticApiModelOutline0) makefallbackloader);
        }
        if (makefallbackloader instanceof DynamicLoaderFallback) {
            return new getIV((DynamicLoaderFallback) makefallbackloader);
        }
        throw new IllegalStateException(("Unknown ShinhanProductDescriptionField type: " + Reflection.getOrCreateKotlinClass(makefallbackloader.getClass())).toString());
    }
}
