package im.toss.features.benefit.dto;

import im.toss.features.benefit.dto.GlobalAdMobFilter$;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
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
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class GlobalAdMobFilter {
    public static final int $stable = 0;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final List<String> excludeKeywords;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new GlobalAdMobFilter$.ExternalSyntheticLambda0())};

    /* JADX WARN: Illegal instructions before constructor call */
    public GlobalAdMobFilter() {
        List list = null;
        this(list, 1, (DefaultConstructorMarker) list);
    }

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 43;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnNavigationEvent = onNavigationEvent();
        int i4 = onWarmupCompleted + 57;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(getWriggleLayout.onNavigationEvent);
        int i2 = onExtraCallbackWithResult + 47;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return checkcanopenlandingpage;
        }
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallbackWithResult + 43;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof GlobalAdMobFilter) || !Intrinsics.areEqual(this.excludeKeywords, ((GlobalAdMobFilter) obj).excludeKeywords)) {
            return false;
        }
        int i4 = onExtraCallbackWithResult + 111;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return true;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 103;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        List<String> list = this.excludeKeywords;
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
        String str = "GlobalAdMobFilter(excludeKeywords=" + this.excludeKeywords + ")";
        int i2 = onWarmupCompleted + 97;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    static {
        int i = onExtraCallback + 83;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ GlobalAdMobFilter(int i, List list, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.excludeKeywords = CollectionsKt.emptyList();
            int i2 = onExtraCallbackWithResult + 117;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        this.excludeKeywords = list;
        int i4 = onWarmupCompleted + 11;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public GlobalAdMobFilter(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.excludeKeywords = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022 A[PHI: r1
      0x0022: PHI (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
      (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v10 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
     binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void IAuthTabCallback(GlobalAdMobFilter globalAdMobFilter, vyl vylVar, SerialDescriptor serialDescriptor) {
        Lazy<KSerializer<Object>>[] lazyArr;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 47;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            lazyArr = $childSerializers;
            if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
                int i3 = onWarmupCompleted + 87;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                if (!(true ^ Intrinsics.areEqual(globalAdMobFilter.excludeKeywords, CollectionsKt.emptyList()))) {
                    return;
                }
            }
        } else {
            lazyArr = $childSerializers;
            if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            }
        }
        vylVar.onNavigationEvent(serialDescriptor, 0, (py) lazyArr[0].getValue(), globalAdMobFilter.excludeKeywords);
        int i5 = onWarmupCompleted + 119;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ Lazy[] onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 61;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i2 + 87;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return lazyArr;
        }
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ GlobalAdMobFilter(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onWarmupCompleted + 33;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                list = CollectionsKt.emptyList();
                int i3 = onWarmupCompleted + 53;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
            } else {
                CollectionsKt.emptyList();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        this(list);
    }

    public final List<String> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 55;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        List<String> list = this.excludeKeywords;
        int i5 = i3 + 75;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }
}
