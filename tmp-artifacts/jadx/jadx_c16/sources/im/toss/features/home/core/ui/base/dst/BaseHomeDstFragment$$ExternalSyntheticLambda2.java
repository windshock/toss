package im.toss.features.home.core.ui.base.dst;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function0;
import viva.republica.toss.main.more.notification.NotificationSettingAdapter$;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BaseHomeDstFragment$$ExternalSyntheticLambda2 implements Function0 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ RecyclerView.ViewHolder f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ float f$2;
    public final /* synthetic */ BaseHomeDstFragment f$3;

    public /* synthetic */ BaseHomeDstFragment$$ExternalSyntheticLambda2(RecyclerView.ViewHolder viewHolder, Object obj, float f, BaseHomeDstFragment baseHomeDstFragment) {
        this.f$0 = viewHolder;
        this.f$1 = obj;
        this.f$2 = f;
        this.f$3 = baseHomeDstFragment;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        RecyclerView.ViewHolder viewHolder = this.f$0;
        if (i3 != 0) {
            Object obj = this.f$1;
            float f = this.f$2;
            return Boolean.valueOf(((Boolean) BaseHomeDstFragment.onExtraCallbackWithResult(new Object[]{viewHolder, obj, Float.valueOf(f), this.f$3}, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), 571407379, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), -571407366, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted())).booleanValue());
        }
        Object obj2 = this.f$1;
        float f2 = this.f$2;
        Boolean.valueOf(((Boolean) BaseHomeDstFragment.onExtraCallbackWithResult(new Object[]{viewHolder, obj2, Float.valueOf(f2), this.f$3}, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), 571407379, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), -571407366, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted())).booleanValue());
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }
}
