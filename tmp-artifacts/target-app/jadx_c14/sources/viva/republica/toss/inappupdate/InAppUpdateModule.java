package viva.republica.toss.inappupdate;

import android.content.Context;
import javax.inject.Singleton;
import kotlin.jvm.internal.Intrinsics;
import o.withDuration;
import o.withOrigin;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class InAppUpdateModule {
    public static final InAppUpdateModule onWarmupCompleted = new InAppUpdateModule();

    private InAppUpdateModule() {
    }

    @Singleton
    public final withOrigin onWarmupCompleted(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return new withDuration(context);
    }
}
