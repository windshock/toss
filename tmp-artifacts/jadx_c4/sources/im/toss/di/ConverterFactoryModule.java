package im.toss.di;

import com.google.gson.Gson;
import javax.inject.Singleton;
import kotlin.jvm.internal.Intrinsics;
import o.ba;
import o.doCheckNativeCrash;
import o.wie2;
import o.zzad;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ConverterFactoryModule {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    public static final ConverterFactoryModule onNavigationEvent = new ConverterFactoryModule();
    private static int onWarmupCompleted = 1;

    static {
        int i = IAuthTabCallback + 83;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private ConverterFactoryModule() {
    }

    @Singleton
    public final doCheckNativeCrash IAuthTabCallback(@NotNull wie2 wie2Var, @NotNull Gson gson, @NotNull zzad zzadVar) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(wie2Var, "");
        Intrinsics.checkNotNullParameter(gson, "");
        Intrinsics.checkNotNullParameter(zzadVar, "");
        doCheckNativeCrash dochecknativecrash = new doCheckNativeCrash(wie2Var, gson);
        int i2 = onWarmupCompleted + 57;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return dochecknativecrash;
    }

    @Singleton
    public final ba onWarmupCompleted(@NotNull wie2 wie2Var, @NotNull zzad zzadVar) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(wie2Var, "");
        Intrinsics.checkNotNullParameter(zzadVar, "");
        ba baVar = new ba(wie2Var);
        int i2 = onExtraCallbackWithResult + 13;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 28 / 0;
        }
        return baVar;
    }
}
