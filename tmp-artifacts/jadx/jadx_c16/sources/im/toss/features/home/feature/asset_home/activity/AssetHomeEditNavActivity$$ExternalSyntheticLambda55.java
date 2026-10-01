package im.toss.features.home.feature.asset_home.activity;

import kotlin.jvm.functions.Function1;
import o.AndroidTextContextMenuToolbarProvidershowTextContextMenu2ExternalSyntheticLambda0;
import o.onMenuItemClick;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetHomeEditNavActivity$$ExternalSyntheticLambda55 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ AssetHomeEditNavActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 79;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        AndroidTextContextMenuToolbarProvidershowTextContextMenu2ExternalSyntheticLambda0 androidTextContextMenuToolbarProvidershowTextContextMenu2ExternalSyntheticLambda0OnTransact = AssetHomeEditNavActivity.onTransact(this.f$0, (onMenuItemClick) obj);
        int i4 = onExtraCallbackWithResult + 39;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return androidTextContextMenuToolbarProvidershowTextContextMenu2ExternalSyntheticLambda0OnTransact;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
