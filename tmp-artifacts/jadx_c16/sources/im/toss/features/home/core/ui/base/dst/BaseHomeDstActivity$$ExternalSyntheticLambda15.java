package im.toss.features.home.core.ui.base.dst;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.RVManifestLazyProxyManifest1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BaseHomeDstActivity$$ExternalSyntheticLambda15 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ BaseHomeDstActivity f$0;
    public final /* synthetic */ Map f$1;
    public final /* synthetic */ RecyclerView.ViewHolder f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ float f$4;

    public /* synthetic */ BaseHomeDstActivity$$ExternalSyntheticLambda15(BaseHomeDstActivity baseHomeDstActivity, Map map, RecyclerView.ViewHolder viewHolder, Object obj, float f) {
        this.f$0 = baseHomeDstActivity;
        this.f$1 = map;
        this.f$2 = viewHolder;
        this.f$3 = obj;
        this.f$4 = f;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        BaseHomeDstActivity baseHomeDstActivity = this.f$0;
        Map map = this.f$1;
        RecyclerView.ViewHolder viewHolder = this.f$2;
        Object obj2 = this.f$3;
        float f = this.f$4;
        RVManifestLazyProxyManifest1 rVManifestLazyProxyManifest1 = (RVManifestLazyProxyManifest1) obj;
        if (i3 == 0) {
            BaseHomeDstActivity.IAuthTabCallback(baseHomeDstActivity, map, viewHolder, obj2, f, rVManifestLazyProxyManifest1);
            throw null;
        }
        Unit unitIAuthTabCallback = BaseHomeDstActivity.IAuthTabCallback(baseHomeDstActivity, map, viewHolder, obj2, f, rVManifestLazyProxyManifest1);
        int i4 = onExtraCallbackWithResult + 73;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }
}
