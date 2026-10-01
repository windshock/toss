package o;

import android.content.Context;
import android.os.Bundle;
import im.toss.devtool.runtime.data.util.DevToolActionActivity;
import im.toss.devtool.runtime.data.util.DevToolActionActivity$IAuthTabCallback;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AppNode3 implements destroy {
    static int onExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(AppNode3.class);
    private final Context onNavigationEvent;

    public AppNode3(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.onNavigationEvent = context;
    }

    @Override // o.destroy
    public Object onExtraCallback(@NotNull getExtensionManager getextensionmanager, @NotNull Map<String, ? extends List<String>> map, @NotNull access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        Bundle bundle = new Bundle();
        Iterator<Map.Entry<String, ? extends List<String>>> it = map.entrySet().iterator();
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1505);
        int i2 = 273;
        while (true) {
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(i2);
            if (!it.hasNext()) {
                Context context = this.onNavigationEvent;
                DevToolActionActivity$IAuthTabCallback devToolActionActivity$IAuthTabCallback = (DevToolActionActivity$IAuthTabCallback) DevToolActionActivity.Companion;
                String strOnWarmupCompleted = getextensionmanager.onWarmupCompleted();
                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1235);
                context.startActivity(devToolActionActivity$IAuthTabCallback.onWarmupCompleted(context, strOnWarmupCompleted, bundle).addFlags(268435456));
                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4290);
                Unit unit = Unit.INSTANCE;
                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(283);
                return unit;
            }
            int i3 = onExtraCallback;
            int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4709);
            int i4 = (~iOnWarmupCompleted) & i3;
            int i5 = (~i3) & iOnWarmupCompleted;
            if (((((i5 & i4) | (i4 ^ i5)) >> 21) & 1) != 0) {
                it.next().getKey();
                throw null;
            }
            Map.Entry<String, ? extends List<String>> next = it.next();
            String key = next.getKey();
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5720);
            String str = key;
            ArrayList<String> arrayList = new ArrayList<>(next.getValue());
            int i6 = onExtraCallback;
            int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(6100);
            int i7 = (~iOnWarmupCompleted2) & i6;
            int i8 = (~i6) & iOnWarmupCompleted2;
            if (((((i8 & i7) | (i7 ^ i8)) >> 11) & 1) == 0) {
                bundle.putStringArrayList(str, arrayList);
                throw null;
            }
            bundle.putStringArrayList(str, arrayList);
            i2 = 5837;
        }
    }
}
