package o;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import im.toss.features.foreigner.home.ui.test.ForeignerHomeTestScreenKt$;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.toRealPath;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class line extends toRealPath {
    private final boolean onExtraCallbackWithResult;
    private final int onNavigationEvent;
    private final boolean onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof line)) {
            return false;
        }
        line lineVar = (line) obj;
        return this.onNavigationEvent == lineVar.onNavigationEvent && this.onExtraCallbackWithResult == lineVar.onExtraCallbackWithResult && this.onWarmupCompleted == lineVar.onWarmupCompleted;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.onNavigationEvent) * 31) + Boolean.hashCode(this.onExtraCallbackWithResult)) * 31) + Boolean.hashCode(this.onWarmupCompleted);
    }

    public String toString() {
        return "DividerViewModel(id=" + this.onNavigationEvent + ", isThin=" + this.onExtraCallbackWithResult + ", greyBg=" + this.onWarmupCompleted + ")";
    }

    public /* synthetic */ line(int i, boolean z, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? false : z2);
    }

    public line(int i, boolean z, boolean z2) {
        super(toRealPath.onNavigationEvent.DIVIDER);
        this.onNavigationEvent = i;
        this.onExtraCallbackWithResult = z;
        this.onWarmupCompleted = z2;
    }

    public long onWarmupCompleted() {
        int i = this.onNavigationEvent;
        boolean z = this.onExtraCallbackWithResult;
        return ("divider-" + i + "-" + z).hashCode();
    }

    public final int onExtraCallback() {
        int i = this.onExtraCallbackWithResult ? 1 : 16;
        DisplayMetrics displayMetrics = ((Resources) followRedirects.IAuthTabCallback(1316113812, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{followRedirects.onExtraCallbackWithResult}, -1316113811, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted())).getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        return varyMatches.onNavigationEvent(Integer.valueOf(i), displayMetrics);
    }

    public final int onNavigationEvent() {
        if (!this.onExtraCallbackWithResult) {
            return 0;
        }
        Object[] objArr = {followRedirects.onExtraCallbackWithResult};
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        DisplayMetrics displayMetrics = ((Resources) followRedirects.IAuthTabCallback(1316113812, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), objArr, -1316113811, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted())).getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        return varyMatches.onNavigationEvent(24, displayMetrics);
    }

    public final boolean IAuthTabCallback() {
        return this.onWarmupCompleted;
    }
}
