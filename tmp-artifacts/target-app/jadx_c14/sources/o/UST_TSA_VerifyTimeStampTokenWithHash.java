package o;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_TSA_VerifyTimeStampTokenWithHash implements Comparator<KeyBoardVisiblePoint> {
    @Override // java.util.Comparator
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public int compare(@NotNull KeyBoardVisiblePoint keyBoardVisiblePoint, @NotNull KeyBoardVisiblePoint keyBoardVisiblePoint2) {
        Intrinsics.checkNotNullParameter(keyBoardVisiblePoint, "");
        Intrinsics.checkNotNullParameter(keyBoardVisiblePoint2, "");
        boolean z = keyBoardVisiblePoint instanceof onDisclaimerClick;
        boolean z2 = keyBoardVisiblePoint2 instanceof onDisclaimerClick;
        if (z != z2) {
            return Boolean.compare(z2, z);
        }
        boolean z3 = (keyBoardVisiblePoint instanceof TabBarInfoQueryPointOnTabBarInfoQueryListener) && DERConstructedSet.onExtraCallback(keyBoardVisiblePoint.IAuthTabCallbackStub());
        boolean z4 = (keyBoardVisiblePoint2 instanceof TabBarInfoQueryPointOnTabBarInfoQueryListener) && DERConstructedSet.onExtraCallback(keyBoardVisiblePoint2.IAuthTabCallbackStub());
        if (z3 != z4) {
            return Boolean.compare(z4, z3);
        }
        return !Intrinsics.areEqual(keyBoardVisiblePoint.asInterface(), keyBoardVisiblePoint2.asInterface()) ? keyBoardVisiblePoint2.asInterface().compareTo(keyBoardVisiblePoint.asInterface()) : keyBoardVisiblePoint.onExtraCallbackWithResult().compareTo(keyBoardVisiblePoint2.onExtraCallbackWithResult());
    }
}
