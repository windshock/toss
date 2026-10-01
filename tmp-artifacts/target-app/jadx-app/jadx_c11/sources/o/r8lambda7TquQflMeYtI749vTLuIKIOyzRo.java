package o;

import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViewsService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambda7TquQflMeYtI749vTLuIKIOyzRo extends RemoteViewsService {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;

    @Override // android.widget.RemoteViewsService
    public RemoteViewsService.RemoteViewsFactory onGetViewFactory(@NotNull Intent intent) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(intent, "");
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        q8 q8Var = new q8(applicationContext, intent);
        int i2 = onExtraCallbackWithResult + 99;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return q8Var;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
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
