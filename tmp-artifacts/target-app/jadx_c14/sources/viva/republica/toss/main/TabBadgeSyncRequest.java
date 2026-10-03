package viva.republica.toss.main;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkCanOpenLandingPage;
import o.getWriggleLayout;
import o.liq;
import o.okycx;
import o.py;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.main.TabBadgeSyncRequest$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class TabBadgeSyncRequest {
    public static final int $stable = 0;
    private final List<String> setRedDot;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.main.TabBadgeSyncRequest$$ExternalSyntheticLambda0
        public final Object invoke() {
            return TabBadgeSyncRequest.IAuthTabCallback();
        }
    })};

    /* JADX WARN: Illegal instructions before constructor call */
    public TabBadgeSyncRequest() {
        List list = null;
        this(list, 1, (DefaultConstructorMarker) list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer IAuthTabCallback() {
        return new checkCanOpenLandingPage(getWriggleLayout.onNavigationEvent);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TabBadgeSyncRequest) && Intrinsics.areEqual(this.setRedDot, ((TabBadgeSyncRequest) obj).setRedDot);
    }

    public int hashCode() {
        return this.setRedDot.hashCode();
    }

    public String toString() {
        return "TabBadgeSyncRequest(setRedDot=" + this.setRedDot + ")";
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TabBadgeSyncRequest> serializer() {
            return TabBadgeSyncRequest$.serializer.INSTANCE;
        }
    }

    public /* synthetic */ TabBadgeSyncRequest(int i, List list, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.setRedDot = CollectionsKt.emptyList();
        } else {
            this.setRedDot = list;
        }
    }

    public TabBadgeSyncRequest(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.setRedDot = list;
    }

    @JvmStatic
    public static final /* synthetic */ void onNavigationEvent(TabBadgeSyncRequest tabBadgeSyncRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0) || !Intrinsics.areEqual(tabBadgeSyncRequest.setRedDot, CollectionsKt.emptyList())) {
            vylVar.onNavigationEvent(serialDescriptor, 0, (py) lazyArr[0].getValue(), tabBadgeSyncRequest.setRedDot);
        }
    }

    public /* synthetic */ TabBadgeSyncRequest(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list);
    }
}
