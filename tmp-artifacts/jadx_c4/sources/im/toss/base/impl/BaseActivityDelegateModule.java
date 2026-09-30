package im.toss.base.impl;

import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import im.toss.uikit.base.UIKitBaseActivity;
import java.lang.reflect.Constructor;
import kotlin.jvm.internal.Intrinsics;
import o.AppLovinExceptionHandler;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SidecarWindowBackendWindowLayoutChangeCallbackWrapperExternalSyntheticLambda0;
import o.getForegroundInfoAsync;
import o.zzad;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class BaseActivityDelegateModule {
    private static int IAuthTabCallback = 1;
    public static final BaseActivityDelegateModule onExtraCallback = new BaseActivityDelegateModule();
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    static {
        int i = onNavigationEvent + 53;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            int i2 = 10 / 0;
        }
    }

    private BaseActivityDelegateModule() {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SidecarWindowBackendWindowLayoutChangeCallbackWrapperExternalSyntheticLambda0 IAuthTabCallback(@NotNull Context context, @NotNull zzad zzadVar) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 99;
        onExtraCallbackWithResult = i2 % 128;
        AppLovinExceptionHandler appLovinExceptionHandler = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(zzadVar, "");
            zzadVar.MediaBrowserCompatMediaItem();
            throw null;
        }
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(zzadVar, "");
        if (!zzadVar.MediaBrowserCompatMediaItem()) {
            int i3 = IAuthTabCallback + 119;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            if (!zzadVar.onActivityLayout()) {
                int i5 = IAuthTabCallback + 67;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    zzadVar.RemoteActionCompatParcelizer();
                    throw null;
                }
                if (zzadVar.RemoteActionCompatParcelizer()) {
                    try {
                        Object[] objArr = {(UIKitBaseActivity) context};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-635960626);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getTrimmedLength("") + 8567), 25 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 23065, -346489762, false, (String) null, new Class[]{UIKitBaseActivity.class});
                        }
                        appLovinExceptionHandler = (AppLovinExceptionHandler) ((Constructor) objOnExtraCallback).newInstance(objArr);
                        int i6 = onExtraCallbackWithResult + 123;
                        IAuthTabCallback = i6 % 128;
                        int i7 = i6 % 2;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
            }
        }
        return new getForegroundInfoAsync(appLovinExceptionHandler);
    }
}
