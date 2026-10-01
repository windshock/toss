package im.toss.dynamicfeature.di;

import android.content.Context;
import com.google.android.play.core.splitinstall.SplitInstallManager;
import com.google.android.play.core.splitinstall.SplitInstallManagerFactory;
import javax.inject.Singleton;
import kotlin.jvm.internal.Intrinsics;
import o.EntryInfo1;
import o.LifecycleCallback;
import o.applyTransparentTitle;
import o.zzad;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class TossDynamicFeatureModule {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;

    @Singleton
    public final SplitInstallManager IAuthTabCallback(@NotNull Context context) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 51;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        SplitInstallManager splitInstallManagerCreate = SplitInstallManagerFactory.create(context);
        Intrinsics.checkNotNullExpressionValue(splitInstallManagerCreate, "");
        int i4 = onWarmupCompleted + 55;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return splitInstallManagerCreate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Singleton
    public final applyTransparentTitle onExtraCallbackWithResult(@NotNull SplitInstallManager splitInstallManager, @NotNull zzad zzadVar) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(splitInstallManager, "");
        Intrinsics.checkNotNullParameter(zzadVar, "");
        if (!zzadVar.RemoteActionCompatParcelizer()) {
            int i2 = onWarmupCompleted + 83;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                zzadVar.onActivityLayout();
                throw null;
            }
            if (!zzadVar.onActivityLayout()) {
                LifecycleCallback lifecycleCallback = new LifecycleCallback(splitInstallManager);
                int i3 = onExtraCallback + 73;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0) {
                    return lifecycleCallback;
                }
                throw null;
            }
        }
        return new EntryInfo1();
    }
}
