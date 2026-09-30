package im.toss.features.home.core.ui.base.dst;

import android.view.MotionEvent;
import android.view.View;
import java.util.Map;
import o.IIpcChannelStubProxy;
import o.doInitialize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BaseHomeDstActivity$$ExternalSyntheticLambda26 implements View.OnTouchListener {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ IIpcChannelStubProxy f$0;
    public final /* synthetic */ doInitialize f$1;
    public final /* synthetic */ BaseHomeDstActivity f$2;
    public final /* synthetic */ Map f$3;

    public /* synthetic */ BaseHomeDstActivity$$ExternalSyntheticLambda26(IIpcChannelStubProxy iIpcChannelStubProxy, doInitialize doinitialize, BaseHomeDstActivity baseHomeDstActivity, Map map) {
        this.f$0 = iIpcChannelStubProxy;
        this.f$1 = doinitialize;
        this.f$2 = baseHomeDstActivity;
        this.f$3 = map;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 99;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallback = BaseHomeDstActivity.onExtraCallback(this.f$0, this.f$1, this.f$2, this.f$3, view, motionEvent);
        int i4 = onExtraCallbackWithResult + 89;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return zOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
