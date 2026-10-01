package im.toss.core.webkit;

import android.webkit.PermissionRequest;
import androidx.fragment.app.FragmentActivity;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.setCircleColor;
import o.shouldBeKeptAsChild;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TossWebChromeClient$$ExternalSyntheticLambda10 implements Function1 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ setCircleColor f$0;
    public final /* synthetic */ ArrayList f$1;
    public final /* synthetic */ PermissionRequest f$2;
    public final /* synthetic */ FragmentActivity f$3;

    public /* synthetic */ TossWebChromeClient$$ExternalSyntheticLambda10(setCircleColor setcirclecolor, ArrayList arrayList, PermissionRequest permissionRequest, FragmentActivity fragmentActivity) {
        this.f$0 = setcirclecolor;
        this.f$1 = arrayList;
        this.f$2 = permissionRequest;
        this.f$3 = fragmentActivity;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 13;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        setCircleColor setcirclecolor = this.f$0;
        if (i3 == 0) {
            return setCircleColor.onWarmupCompleted(setcirclecolor, this.f$1, this.f$2, this.f$3, (shouldBeKeptAsChild) obj);
        }
        Unit unitOnWarmupCompleted = setCircleColor.onWarmupCompleted(setcirclecolor, this.f$1, this.f$2, this.f$3, (shouldBeKeptAsChild) obj);
        int i4 = 63 / 0;
        return unitOnWarmupCompleted;
    }
}
