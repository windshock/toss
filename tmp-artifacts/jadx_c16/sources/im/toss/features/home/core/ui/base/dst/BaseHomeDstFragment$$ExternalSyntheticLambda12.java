package im.toss.features.home.core.ui.base.dst;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.RVManifestLazyProxyManifest1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BaseHomeDstFragment$$ExternalSyntheticLambda12 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ float f$0;
    public final /* synthetic */ BaseHomeDstFragment f$1;
    public final /* synthetic */ Map f$2;
    public final /* synthetic */ RecyclerView.ViewHolder f$3;
    public final /* synthetic */ Object f$4;

    public /* synthetic */ BaseHomeDstFragment$$ExternalSyntheticLambda12(float f, BaseHomeDstFragment baseHomeDstFragment, Map map, RecyclerView.ViewHolder viewHolder, Object obj) {
        this.f$0 = f;
        this.f$1 = baseHomeDstFragment;
        this.f$2 = map;
        this.f$3 = viewHolder;
        this.f$4 = obj;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 5;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = BaseHomeDstFragment.onWarmupCompleted(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, (RVManifestLazyProxyManifest1) obj);
        int i4 = onNavigationEvent + 97;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
