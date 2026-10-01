package o;

import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViewsService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFi1zSDK extends RemoteViewsService {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    @Override // android.widget.RemoteViewsService
    public RemoteViewsService.RemoteViewsFactory onGetViewFactory(@NotNull Intent intent) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(intent, "");
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        AFi1uSDK aFi1uSDK = new AFi1uSDK(applicationContext, intent);
        int i2 = onExtraCallbackWithResult + 29;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 42 / 0;
        }
        return aFi1uSDK;
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
    }
}
