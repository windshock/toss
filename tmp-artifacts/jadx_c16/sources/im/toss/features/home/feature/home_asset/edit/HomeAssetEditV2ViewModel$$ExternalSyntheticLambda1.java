package im.toss.features.home.feature.home_asset.edit;

import java.util.function.Predicate;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeAssetEditV2ViewModel$$ExternalSyntheticLambda1 implements Predicate {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ Function1 f$0;

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallback = HomeAssetEditV2ViewModel.onExtraCallback(this.f$0, obj);
        int i4 = onExtraCallback + 13;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return zOnExtraCallback;
    }
}
