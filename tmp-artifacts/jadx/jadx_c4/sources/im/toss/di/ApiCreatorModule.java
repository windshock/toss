package im.toss.di;

import javax.inject.Singleton;
import kotlin.jvm.internal.Intrinsics;
import o.GenericViewTarget;
import o.a2;
import o.access1002;
import o.doCheckNativeCrash;
import o.getAdFormatForPlacement;
import o.isExceptionHandlerEnabled;
import o.zzad;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ApiCreatorModule {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    public static final ApiCreatorModule onNavigationEvent = new ApiCreatorModule();
    private static int onWarmupCompleted = 1;

    static {
        int i = onExtraCallback + 49;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private ApiCreatorModule() {
    }

    @Singleton
    public final a2 onWarmupCompleted$7ceaa0fd(@NotNull isExceptionHandlerEnabled isexceptionhandlerenabled, @NotNull access1002 access1002Var, @NotNull Object obj, @NotNull Object obj2, @NotNull HttpLoggingInterceptor.Level level, @NotNull doCheckNativeCrash dochecknativecrash, @NotNull zzad zzadVar, @NotNull OkHttpClient okHttpClient) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(isexceptionhandlerenabled, "");
        Intrinsics.checkNotNullParameter(access1002Var, "");
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        Intrinsics.checkNotNullParameter(level, "");
        Intrinsics.checkNotNullParameter(dochecknativecrash, "");
        Intrinsics.checkNotNullParameter(zzadVar, "");
        Intrinsics.checkNotNullParameter(okHttpClient, "");
        getAdFormatForPlacement getadformatforplacement = new getAdFormatForPlacement(isexceptionhandlerenabled, access1002Var, obj, obj2, level, dochecknativecrash, new GenericViewTarget(), zzadVar, okHttpClient);
        int i2 = onWarmupCompleted + 91;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return getadformatforplacement;
    }
}
