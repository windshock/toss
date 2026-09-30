package im.toss.components.sharedpreferences.di.cipher;

import javax.inject.Singleton;
import kotlin.jvm.internal.Intrinsics;
import o.ConstraintsSizeResolverExternalSyntheticLambda0;
import o.DiskLruCacheExternalSyntheticLambda0;
import o.ExifOrientationStrategyExternalSyntheticLambda2;
import o.ResourceMetadata;
import o.StaticImageDecoderExternalSyntheticLambda0;
import o.StaticImageDecoderKtExternalSyntheticLambda0;
import o.SubcomposeAsyncImageKtExternalSyntheticLambda0;
import o.supports;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class CipherProvideModule {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public static final CipherProvideModule onExtraCallbackWithResult = new CipherProvideModule();
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    static {
        int i = onWarmupCompleted + 31;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private CipherProvideModule() {
    }

    @Singleton
    public final SubcomposeAsyncImageKtExternalSyntheticLambda0 onNavigationEvent(@NotNull ResourceMetadata resourceMetadata, @NotNull StaticImageDecoderKtExternalSyntheticLambda0 staticImageDecoderKtExternalSyntheticLambda0, @NotNull supports supportsVar, @NotNull DiskLruCacheExternalSyntheticLambda0 diskLruCacheExternalSyntheticLambda0, @Nullable ExifOrientationStrategyExternalSyntheticLambda2 exifOrientationStrategyExternalSyntheticLambda2, @Nullable StaticImageDecoderExternalSyntheticLambda0 staticImageDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(resourceMetadata, "");
        Intrinsics.checkNotNullParameter(staticImageDecoderKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(supportsVar, "");
        Intrinsics.checkNotNullParameter(diskLruCacheExternalSyntheticLambda0, "");
        SubcomposeAsyncImageKtExternalSyntheticLambda0 subcomposeAsyncImageKtExternalSyntheticLambda0 = new SubcomposeAsyncImageKtExternalSyntheticLambda0(resourceMetadata, staticImageDecoderKtExternalSyntheticLambda0, supportsVar, diskLruCacheExternalSyntheticLambda0, exifOrientationStrategyExternalSyntheticLambda2, staticImageDecoderExternalSyntheticLambda0);
        int i2 = onExtraCallback + 39;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return subcomposeAsyncImageKtExternalSyntheticLambda0;
    }

    @Singleton
    public final StaticImageDecoderExternalSyntheticLambda0 IAuthTabCallback() {
        int i = 2 % 2;
        try {
            StaticImageDecoderExternalSyntheticLambda0 staticImageDecoderExternalSyntheticLambda0 = new StaticImageDecoderExternalSyntheticLambda0();
            int i2 = onExtraCallback + 33;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return staticImageDecoderExternalSyntheticLambda0;
            }
            throw null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Singleton
    public final ExifOrientationStrategyExternalSyntheticLambda2 onNavigationEvent(@NotNull ConstraintsSizeResolverExternalSyntheticLambda0 constraintsSizeResolverExternalSyntheticLambda0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(constraintsSizeResolverExternalSyntheticLambda0, "");
        try {
            ExifOrientationStrategyExternalSyntheticLambda2 exifOrientationStrategyExternalSyntheticLambda2 = new ExifOrientationStrategyExternalSyntheticLambda2(constraintsSizeResolverExternalSyntheticLambda0);
            int i2 = IAuthTabCallback + 69;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 60 / 0;
            }
            return exifOrientationStrategyExternalSyntheticLambda2;
        } catch (Throwable unused) {
            return null;
        }
    }
}
