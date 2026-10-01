package im.toss.features.home.core.ui.base.dst;

import android.view.View;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import o.IIpcChannelStubProxy;
import o.doInitialize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BaseHomeDstActivity$$ExternalSyntheticLambda28 implements Function2 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ doInitialize f$0;
    public final /* synthetic */ BaseHomeDstActivity f$1;
    public final /* synthetic */ Map f$2;
    public final /* synthetic */ IIpcChannelStubProxy f$3;

    public /* synthetic */ BaseHomeDstActivity$$ExternalSyntheticLambda28(doInitialize doinitialize, BaseHomeDstActivity baseHomeDstActivity, Map map, IIpcChannelStubProxy iIpcChannelStubProxy) {
        this.f$0 = doinitialize;
        this.f$1 = baseHomeDstActivity;
        this.f$2 = map;
        this.f$3 = iIpcChannelStubProxy;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 9;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return BaseHomeDstActivity.onExtraCallbackWithResult(this.f$0, this.f$1, this.f$2, this.f$3, ((Integer) obj).intValue(), (View) obj2);
        }
        BaseHomeDstActivity.onExtraCallbackWithResult(this.f$0, this.f$1, this.f$2, this.f$3, ((Integer) obj).intValue(), (View) obj2);
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }
}
