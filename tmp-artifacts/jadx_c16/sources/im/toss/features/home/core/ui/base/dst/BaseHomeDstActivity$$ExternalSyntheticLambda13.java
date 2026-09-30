package im.toss.features.home.core.ui.base.dst;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.RVManifestLazyProxyManifest1;
import o.getPreRenderJob;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BaseHomeDstActivity$$ExternalSyntheticLambda13 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ BaseHomeDstActivity f$0;
    public final /* synthetic */ Map f$1;
    public final /* synthetic */ RecyclerView.ViewHolder f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ float f$4;

    public /* synthetic */ BaseHomeDstActivity$$ExternalSyntheticLambda13(BaseHomeDstActivity baseHomeDstActivity, Map map, RecyclerView.ViewHolder viewHolder, Object obj, float f) {
        this.f$0 = baseHomeDstActivity;
        this.f$1 = map;
        this.f$2 = viewHolder;
        this.f$3 = obj;
        this.f$4 = f;
    }

    public final Object invoke(Object obj) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 37;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            BaseHomeDstActivity baseHomeDstActivity = this.f$0;
            Map map = this.f$1;
            RecyclerView.ViewHolder viewHolder = this.f$2;
            Object obj2 = this.f$3;
            Float fValueOf = Float.valueOf(this.f$4);
            int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback3 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
            unit = (Unit) BaseHomeDstActivity.IAuthTabCallback(iIAuthTabCallback, iIAuthTabCallback2, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 330907128, new Object[]{baseHomeDstActivity, map, viewHolder, obj2, fValueOf, (RVManifestLazyProxyManifest1) obj}, -330907113, iIAuthTabCallback3);
            int i3 = 69 / 0;
        } else {
            BaseHomeDstActivity baseHomeDstActivity2 = this.f$0;
            Map map2 = this.f$1;
            RecyclerView.ViewHolder viewHolder2 = this.f$2;
            Object obj3 = this.f$3;
            Float fValueOf2 = Float.valueOf(this.f$4);
            int iIAuthTabCallback4 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback5 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback6 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
            unit = (Unit) BaseHomeDstActivity.IAuthTabCallback(iIAuthTabCallback4, iIAuthTabCallback5, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 330907128, new Object[]{baseHomeDstActivity2, map2, viewHolder2, obj3, fValueOf2, (RVManifestLazyProxyManifest1) obj}, -330907113, iIAuthTabCallback6);
        }
        int i4 = onExtraCallback + 53;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }
}
