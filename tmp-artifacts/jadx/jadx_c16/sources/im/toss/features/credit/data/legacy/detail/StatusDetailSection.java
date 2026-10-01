package im.toss.features.credit.data.legacy.detail;

import im.toss.features.credit.data.legacy.detail.StatusDetailItem$;
import im.toss.features.credit.data.legacy.detail.StatusDetailSection$;
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
import o.liq;
import o.okycx;
import o.py;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class StatusDetailSection {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onWarmupCompleted;
    private final List<StatusDetailItem> fields;
    private final StatusDetailItem title;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new StatusDetailSection$.ExternalSyntheticLambda0())};

    /* JADX WARN: Multi-variable type inference failed */
    public StatusDetailSection() {
        this((StatusDetailItem) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    private static final /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(StatusDetailItem$.serializer.INSTANCE);
        int i2 = IAuthTabCallback + 29;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return checkcanopenlandingpage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 67;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i4 = onExtraCallbackWithResult + 63;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 79;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatusDetailSection)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.title, ((StatusDetailSection) obj).title)) {
            int i4 = onExtraCallbackWithResult + 55;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!(!Intrinsics.areEqual(this.fields, r6.fields))) {
            return true;
        }
        int i6 = IAuthTabCallback + 91;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.title.hashCode() * 31) + this.fields.hashCode();
        int i4 = IAuthTabCallback + 123;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "StatusDetailSection(title=" + this.title + ", fields=" + this.fields + ")";
        int i2 = IAuthTabCallback + 7;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    static {
        Object obj = null;
        int i = onWarmupCompleted + 13;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ StatusDetailSection(int i, StatusDetailItem statusDetailItem, List list, okycx okycxVar) {
        if ((i & 1) == 0) {
            statusDetailItem = new StatusDetailItem((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
            int i2 = IAuthTabCallback + 19;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 % 2;
            }
        }
        this.title = statusDetailItem;
        if ((i & 2) == 0) {
            this.fields = CollectionsKt.emptyList();
            return;
        }
        this.fields = list;
        int i4 = IAuthTabCallback + 9;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public StatusDetailSection(@NotNull StatusDetailItem statusDetailItem, @NotNull List<StatusDetailItem> list) {
        Intrinsics.checkNotNullParameter(statusDetailItem, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.title = statusDetailItem;
        this.fields = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035 A[PHI: r1
      0x0035: PHI (r1v7 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
      (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v8 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
     binds: [B:8:0x001f, B:10:0x0033, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[PHI: r1
      0x0021: PHI (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
      (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v8 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
     binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onExtraCallback(StatusDetailSection statusDetailSection, vyl vylVar, SerialDescriptor serialDescriptor) {
        Lazy<KSerializer<Object>>[] lazyArr;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 107;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            lazyArr = $childSerializers;
            if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
                if (!Intrinsics.areEqual(statusDetailSection.title, new StatusDetailItem((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null))) {
                    vylVar.onNavigationEvent(serialDescriptor, 0, StatusDetailItem$.serializer.INSTANCE, statusDetailSection.title);
                    int i3 = IAuthTabCallback + 9;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                }
            }
        } else {
            lazyArr = $childSerializers;
            if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            int i5 = onExtraCallbackWithResult + 99;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                Intrinsics.areEqual(statusDetailSection.fields, CollectionsKt.emptyList());
                throw null;
            }
            if (Intrinsics.areEqual(statusDetailSection.fields, CollectionsKt.emptyList())) {
                return;
            }
        }
        vylVar.onNavigationEvent(serialDescriptor, 1, (py) lazyArr[1].getValue(), statusDetailSection.fields);
    }

    public static final /* synthetic */ Lazy[] onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 17;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return $childSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ StatusDetailSection(StatusDetailItem statusDetailItem, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        statusDetailItem = (i & 1) != 0 ? new StatusDetailItem((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null) : statusDetailItem;
        if ((i & 2) != 0) {
            int i2 = onExtraCallbackWithResult + 117;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                list = CollectionsKt.emptyList();
                int i3 = onExtraCallbackWithResult + 75;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 2 % 2;
                }
            } else {
                CollectionsKt.emptyList();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        this(statusDetailItem, list);
    }

    public final StatusDetailItem onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 3;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        StatusDetailItem statusDetailItem = this.title;
        int i5 = i3 + 97;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return statusDetailItem;
    }

    public final List<StatusDetailItem> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 125;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<StatusDetailItem> list = this.fields;
        int i4 = i3 + 39;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }
}
