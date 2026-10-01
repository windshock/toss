package o;

import android.content.Context;
import androidx.glance.unit.ResourceColorProvider;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class PagerWrapperFlingBehaviorExternalSyntheticLambda0 implements BringIntoViewRequesterImplExternalSyntheticLambda0 {
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    public static final int IAuthTabCallback = 8;
    private final BasicTextKtExternalSyntheticLambda11 onExtraCallback;
    private final BasicTextKtExternalSyntheticLambda11 onExtraCallbackWithResult;
    private final String onNavigationEvent;

    public /* synthetic */ PagerWrapperFlingBehaviorExternalSyntheticLambda0(String str, BasicTextKtExternalSyntheticLambda11 basicTextKtExternalSyntheticLambda11, BasicTextKtExternalSyntheticLambda11 basicTextKtExternalSyntheticLambda112, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, basicTextKtExternalSyntheticLambda11, basicTextKtExternalSyntheticLambda112);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PagerWrapperFlingBehaviorExternalSyntheticLambda0)) {
            return false;
        }
        PagerWrapperFlingBehaviorExternalSyntheticLambda0 pagerWrapperFlingBehaviorExternalSyntheticLambda0 = (PagerWrapperFlingBehaviorExternalSyntheticLambda0) obj;
        return Intrinsics.areEqual(this.onNavigationEvent, pagerWrapperFlingBehaviorExternalSyntheticLambda0.onNavigationEvent) && Intrinsics.areEqual(this.onExtraCallback, pagerWrapperFlingBehaviorExternalSyntheticLambda0.onExtraCallback) && Intrinsics.areEqual(this.onExtraCallbackWithResult, pagerWrapperFlingBehaviorExternalSyntheticLambda0.onExtraCallbackWithResult);
    }

    public int hashCode() {
        return (((this.onNavigationEvent.hashCode() * 31) + this.onExtraCallback.hashCode()) * 31) + this.onExtraCallbackWithResult.hashCode();
    }

    public String toString() {
        return "CheckedUncheckedColorProvider(source=" + this.onNavigationEvent + ", checked=" + this.onExtraCallback + ", unchecked=" + this.onExtraCallbackWithResult + ')';
    }

    private PagerWrapperFlingBehaviorExternalSyntheticLambda0(String str, BasicTextKtExternalSyntheticLambda11 basicTextKtExternalSyntheticLambda11, BasicTextKtExternalSyntheticLambda11 basicTextKtExternalSyntheticLambda112) {
        this.onNavigationEvent = str;
        this.onExtraCallback = basicTextKtExternalSyntheticLambda11;
        this.onExtraCallbackWithResult = basicTextKtExternalSyntheticLambda112;
        if ((basicTextKtExternalSyntheticLambda11 instanceof ResourceColorProvider) || (basicTextKtExternalSyntheticLambda112 instanceof ResourceColorProvider)) {
            throw new IllegalArgumentException(("Cannot provide resource-backed ColorProviders to " + str).toString());
        }
    }

    public final long onExtraCallbackWithResult(@NotNull Context context, boolean z, boolean z2) {
        if (z2) {
            return onNavigationEvent(this.onExtraCallback, z, context);
        }
        return onNavigationEvent(this.onExtraCallbackWithResult, z, context);
    }

    private final long onNavigationEvent(BasicTextKtExternalSyntheticLambda11 basicTextKtExternalSyntheticLambda11, boolean z, Context context) {
        if (basicTextKtExternalSyntheticLambda11 instanceof SelectableGroupKtExternalSyntheticLambda0) {
            return ((SelectableGroupKtExternalSyntheticLambda0) basicTextKtExternalSyntheticLambda11).onExtraCallback(z);
        }
        return basicTextKtExternalSyntheticLambda11.IAuthTabCallback(context);
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        public final BringIntoViewRequesterImplExternalSyntheticLambda0 onNavigationEvent(@NotNull String str, @NotNull BasicTextKtExternalSyntheticLambda11 basicTextKtExternalSyntheticLambda11, @NotNull BasicTextKtExternalSyntheticLambda11 basicTextKtExternalSyntheticLambda112) {
            return new PagerWrapperFlingBehaviorExternalSyntheticLambda0(str, basicTextKtExternalSyntheticLambda11, basicTextKtExternalSyntheticLambda112, null);
        }
    }
}
