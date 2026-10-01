package o;

import android.app.Application;
import android.content.Context;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface copyFile {

    public interface onWarmupCompleted {
        copyFile onUnminimized();
    }

    String IAuthTabCallback();

    String IAuthTabCallbackStub();

    boolean asBinder();

    String onExtraCallback();

    void onExtraCallback(@NotNull Application application);

    void onExtraCallback(@NotNull Context context, @NotNull String str);

    Object onExtraCallbackWithResult(long j, @NotNull access13800<? super String> access13800Var);

    String onExtraCallbackWithResult();

    void onExtraCallbackWithResult(@NotNull Application application);

    void onNavigationEvent();

    void onNavigationEvent(@NotNull Application application);

    String onWarmupCompleted();

    void onWarmupCompleted(@NotNull Application application);
}
