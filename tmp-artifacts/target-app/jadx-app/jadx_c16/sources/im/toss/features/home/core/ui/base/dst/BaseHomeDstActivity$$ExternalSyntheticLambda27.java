package im.toss.features.home.core.ui.base.dst;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function0;
import o.getPreRenderJob;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BaseHomeDstActivity$$ExternalSyntheticLambda27 implements Function0 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ RecyclerView.ViewHolder f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ float f$2;
    public final /* synthetic */ BaseHomeDstActivity f$3;

    public /* synthetic */ BaseHomeDstActivity$$ExternalSyntheticLambda27(RecyclerView.ViewHolder viewHolder, Object obj, float f, BaseHomeDstActivity baseHomeDstActivity) {
        this.f$0 = viewHolder;
        this.f$1 = obj;
        this.f$2 = f;
        this.f$3 = baseHomeDstActivity;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 113;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        RecyclerView.ViewHolder viewHolder = this.f$0;
        if (i3 != 0) {
            Object obj = this.f$1;
            float f = this.f$2;
            Object[] objArr = {viewHolder, obj, Float.valueOf(f), this.f$3};
            return Boolean.valueOf(((Boolean) BaseHomeDstActivity.IAuthTabCallback(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -358676298, objArr, 358676314, getPreRenderJob.onNavigationEvent.IAuthTabCallback())).booleanValue());
        }
        Object obj2 = this.f$1;
        float f2 = this.f$2;
        Object[] objArr2 = {viewHolder, obj2, Float.valueOf(f2), this.f$3};
        int i4 = 94 / 0;
        return Boolean.valueOf(((Boolean) BaseHomeDstActivity.IAuthTabCallback(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -358676298, objArr2, 358676314, getPreRenderJob.onNavigationEvent.IAuthTabCallback())).booleanValue());
    }
}
