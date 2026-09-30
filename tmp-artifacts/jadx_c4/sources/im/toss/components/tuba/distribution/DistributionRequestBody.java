package im.toss.components.tuba.distribution;

import im.toss.components.tuba.distribution.DistributionRequestBody$;
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

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class DistributionRequestBody {
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.components.tuba.distribution.DistributionRequestBody$$ExternalSyntheticLambda0
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 93;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnWarmupCompleted = DistributionRequestBody.onWarmupCompleted();
            int i4 = onNavigationEvent + 27;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return kSerializerOnWarmupCompleted;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    })};
    public static final Companion Companion;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final List<String> distributionIds;

    /* JADX WARN: Illegal instructions before constructor call */
    public DistributionRequestBody() {
        List list = null;
        this(list, 1, (DefaultConstructorMarker) list);
    }

    private static final /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(getWriggleLayout.onNavigationEvent);
        int i2 = onWarmupCompleted + 3;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    public static /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 51;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnNavigationEvent = onNavigationEvent();
        int i4 = onExtraCallback + 19;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnNavigationEvent;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DistributionRequestBody)) {
            int i2 = onExtraCallback + 115;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.distributionIds, ((DistributionRequestBody) obj).distributionIds)) {
            int i4 = onWarmupCompleted + 31;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = onWarmupCompleted + 69;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 113;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        List<String> list = this.distributionIds;
        if (i3 != 0) {
            return list.hashCode();
        }
        list.hashCode();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DistributionRequestBody(distributionIds=" + this.distributionIds + ")";
        int i2 = onWarmupCompleted + 101;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<DistributionRequestBody> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 113;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            DistributionRequestBody$.serializer serializerVar = DistributionRequestBody$.serializer.INSTANCE;
            int i4 = onExtraCallbackWithResult + 21;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return serializerVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        int i = onNavigationEvent + 99;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public /* synthetic */ DistributionRequestBody(int i, List list, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.distributionIds = CollectionsKt.emptyList();
            int i2 = onExtraCallback + 29;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 / 0;
                return;
            }
            return;
        }
        this.distributionIds = list;
        int i4 = onExtraCallback + 37;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 8 / 0;
        }
    }

    public DistributionRequestBody(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.distributionIds = list;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallback(DistributionRequestBody distributionRequestBody, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            int i2 = onWarmupCompleted + 7;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            if (Intrinsics.areEqual(distributionRequestBody.distributionIds, CollectionsKt.emptyList())) {
                return;
            }
        }
        vylVar.onNavigationEvent(serialDescriptor, 0, (py) lazyArr[0].getValue(), distributionRequestBody.distributionIds);
        int i4 = onExtraCallback + 63;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 5 % 3;
        }
    }

    public static final /* synthetic */ Lazy[] onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 55;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i3 + 21;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return lazyArr;
        }
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DistributionRequestBody(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onWarmupCompleted + 65;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                list = CollectionsKt.emptyList();
                int i3 = 2 % 2;
            } else {
                CollectionsKt.emptyList();
                throw null;
            }
        }
        this(list);
    }
}
