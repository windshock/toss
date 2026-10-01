package im.toss.features.home.core.ui.base.dst;

import android.view.View;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.RVManifestLazyProxyManifest1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BaseHomeDstActivity$$ExternalSyntheticLambda20 implements Function2 {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ BaseHomeDstActivity f$0;
    public final /* synthetic */ Map f$1;
    public final /* synthetic */ float f$2;

    public /* synthetic */ BaseHomeDstActivity$$ExternalSyntheticLambda20(BaseHomeDstActivity baseHomeDstActivity, Map map, float f) {
        this.f$0 = baseHomeDstActivity;
        this.f$1 = map;
        this.f$2 = f;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = BaseHomeDstActivity.onExtraCallback(this.f$0, this.f$1, this.f$2, (RVManifestLazyProxyManifest1) obj, (View) obj2);
        int i4 = onNavigationEvent + 77;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }
}
