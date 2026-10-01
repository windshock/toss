package o;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class showCreativeDebugger {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;

    public static final /* synthetic */ List onWarmupCompleted(View view) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        List<ViewGroup> listOnNavigationEvent = onNavigationEvent(view);
        int i4 = onExtraCallback + 35;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return listOnNavigationEvent;
    }

    private static final List<ViewGroup> onNavigationEvent(View view) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        int i2 = onExtraCallback + 23;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        for (ViewParent parent = view.getParent(); parent instanceof ViewGroup; parent = ((ViewGroup) parent).getParent()) {
            int i4 = onExtraCallback + 97;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            arrayList.add(parent);
        }
        return arrayList;
    }
}
