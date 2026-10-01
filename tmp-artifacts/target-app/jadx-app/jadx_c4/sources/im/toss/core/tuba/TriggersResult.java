package im.toss.core.tuba;

import im.toss.core.tuba.TriggersResult$;
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
import o.liq;
import o.okycx;
import o.py;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class TriggersResult {
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.core.tuba.TriggersResult$$ExternalSyntheticLambda0
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 119;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                TriggersResult.IAuthTabCallback();
                throw null;
            }
            KSerializer kSerializerIAuthTabCallback = TriggersResult.IAuthTabCallback();
            int i3 = onNavigationEvent + 119;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return kSerializerIAuthTabCallback;
            }
            throw null;
        }
    })};
    public static final Companion Companion;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private final List<Trigger> triggers;

    /* JADX WARN: Illegal instructions before constructor call */
    public TriggersResult() {
        List list = null;
        this(list, 1, (DefaultConstructorMarker) list);
    }

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i4 = onExtraCallbackWithResult + 9;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnExtraCallbackWithResult;
    }

    private static final /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(Trigger$$serializer.INSTANCE);
        int i2 = onExtraCallbackWithResult + 93;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return checkcanopenlandingpage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 7;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof TriggersResult) {
            return !(Intrinsics.areEqual(this.triggers, ((TriggersResult) obj).triggers) ^ true);
        }
        int i5 = i2 + 55;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 61;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.triggers.hashCode();
        int i4 = IAuthTabCallback + 17;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TriggersResult(triggers=" + this.triggers + ")";
        int i2 = IAuthTabCallback + 95;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 29 / 0;
        }
        return str;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TriggersResult> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 113;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            TriggersResult$.serializer serializerVar = TriggersResult$.serializer.INSTANCE;
            int i4 = onWarmupCompleted + 115;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return serializerVar;
            }
            throw null;
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        int i = onExtraCallback + 13;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public /* synthetic */ TriggersResult(int i, List list, okycx okycxVar) {
        Object obj = null;
        if ((i & 1) == 0) {
            this.triggers = CollectionsKt.emptyList();
            int i2 = IAuthTabCallback + 107;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        this.triggers = list;
        int i3 = onExtraCallbackWithResult + 73;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public TriggersResult(@NotNull List<Trigger> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.triggers = list;
    }

    public static final /* synthetic */ Lazy[] onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 1;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return $childSerializers;
        }
        throw null;
    }

    @JvmStatic
    public static final /* synthetic */ void onWarmupCompleted(TriggersResult triggersResult, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 121;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            int i4 = IAuthTabCallback + 39;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            if (Intrinsics.areEqual(triggersResult.triggers, CollectionsKt.emptyList())) {
                return;
            }
        }
        vylVar.onNavigationEvent(serialDescriptor, 0, (py) lazyArr[0].getValue(), triggersResult.triggers);
        int i6 = onExtraCallbackWithResult + 99;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TriggersResult(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallback + 41;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            list = CollectionsKt.emptyList();
            int i4 = onExtraCallbackWithResult + 11;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
        }
        this(list);
    }

    public final List<Trigger> onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 99;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.triggers;
        }
        throw null;
    }
}
