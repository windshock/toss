package im.toss.features.home.feature.asset_home.activity;

import kotlin.jvm.functions.Function1;
import o.AndroidTextContextMenuToolbarProvidershowTextContextMenu2ExternalSyntheticLambda0;
import o.onMenuItemClick;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetHomeEditNavActivity$$ExternalSyntheticLambda24 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ AssetHomeEditNavActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            AssetHomeEditNavActivity.IAuthTabCallbackDefault(this.f$0, (onMenuItemClick) obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        AndroidTextContextMenuToolbarProvidershowTextContextMenu2ExternalSyntheticLambda0 androidTextContextMenuToolbarProvidershowTextContextMenu2ExternalSyntheticLambda0IAuthTabCallbackDefault = AssetHomeEditNavActivity.IAuthTabCallbackDefault(this.f$0, (onMenuItemClick) obj);
        int i3 = IAuthTabCallback + 115;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return androidTextContextMenuToolbarProvidershowTextContextMenu2ExternalSyntheticLambda0IAuthTabCallbackDefault;
    }
}
