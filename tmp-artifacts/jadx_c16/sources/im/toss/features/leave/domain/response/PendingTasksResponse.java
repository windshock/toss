package im.toss.features.leave.domain.response;

import im.toss.features.leave.domain.entity.PendingTaskButton;
import im.toss.features.leave.domain.entity.PendingTaskButton$;
import im.toss.features.leave.domain.response.PendingTasksResponse$;
import im.toss.features.leave.domain.response.PendingTasksResponse$PendingTaskResponse$;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkCanOpenLandingPage;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.okycx;
import o.py;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class PendingTasksResponse {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final List<PendingTaskResponse> items;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new PendingTasksResponse$.ExternalSyntheticLambda0())};

    private static final /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(PendingTasksResponse$PendingTaskResponse$.serializer.INSTANCE);
        int i2 = onWarmupCompleted + 117;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return checkcanopenlandingpage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback();
        }
        IAuthTabCallback();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PendingTasksResponse)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.items, ((PendingTasksResponse) obj).items)) {
            int i2 = onWarmupCompleted + 107;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = onWarmupCompleted + 1;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.items.hashCode();
        int i4 = onWarmupCompleted + 99;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PendingTasksResponse(items=" + this.items + ")";
        int i2 = onExtraCallback + 83;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    static {
        int i = IAuthTabCallback + 29;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ PendingTasksResponse(int i, List list, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i2 = 1;
        if (1 != (i & 1)) {
            int i3 = onWarmupCompleted + 25;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                descriptor = PendingTasksResponse$.serializer.INSTANCE.getDescriptor();
                i2 = 0;
            } else {
                descriptor = PendingTasksResponse$.serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i, i2, descriptor);
            int i4 = onExtraCallback + 41;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
        }
        this.items = list;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallback(PendingTasksResponse pendingTasksResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 37;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onNavigationEvent(serialDescriptor, 0, (py) $childSerializers[0].getValue(), pendingTasksResponse.items);
        int i4 = onWarmupCompleted + 87;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ Lazy[] onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 101;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (i3 == 0) {
            int i4 = 14 / 0;
        }
        return lazyArr;
    }

    public final List<PendingTaskResponse> onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 61;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<PendingTaskResponse> list = this.items;
        int i4 = i3 + 45;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    @liq
    public static final class PendingTaskResponse {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        private final PendingTaskButton button;
        private final String description;
        private final String iconUrl;
        private final String title;
        private final String type;

        static {
            int i = IAuthTabCallback + 119;
            onExtraCallback = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 17;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PendingTaskResponse)) {
                return false;
            }
            PendingTaskResponse pendingTaskResponse = (PendingTaskResponse) obj;
            if (!Intrinsics.areEqual(this.type, pendingTaskResponse.type)) {
                int i3 = onExtraCallbackWithResult + 93;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            if ((!Intrinsics.areEqual(this.title, pendingTaskResponse.title)) || !Intrinsics.areEqual(this.description, pendingTaskResponse.description) || !Intrinsics.areEqual(this.iconUrl, pendingTaskResponse.iconUrl)) {
                return false;
            }
            if (Intrinsics.areEqual(this.button, pendingTaskResponse.button)) {
                return true;
            }
            int i5 = onWarmupCompleted + 41;
            int i6 = i5 % 128;
            onExtraCallbackWithResult = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 45;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x003b A[PHI: r1 r3 r4
          0x003b: PHI (r1v16 int) = (r1v5 int), (r1v18 int) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
          0x003b: PHI (r3v5 int) = (r3v1 int), (r3v7 int) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
          0x003b: PHI (r4v6 java.lang.String) = (r4v0 java.lang.String), (r4v8 java.lang.String) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0030 A[PHI: r1 r3
          0x0030: PHI (r1v6 int) = (r1v5 int), (r1v18 int) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
          0x0030: PHI (r3v2 int) = (r3v1 int), (r3v7 int) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int hashCode() {
            int iHashCode;
            int iHashCode2;
            String str;
            int iHashCode3;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 73;
            onExtraCallbackWithResult = i2 % 128;
            int iHashCode4 = 0;
            if (i2 % 2 == 0) {
                iHashCode = this.type.hashCode();
                iHashCode2 = this.title.hashCode();
                str = this.description;
                if (str == null) {
                    int i3 = onWarmupCompleted + 39;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                    iHashCode3 = 0;
                } else {
                    iHashCode3 = str.hashCode();
                }
            } else {
                iHashCode = this.type.hashCode();
                iHashCode2 = this.title.hashCode();
                str = this.description;
                if (str == null) {
                }
            }
            String str2 = this.iconUrl;
            if (str2 != null) {
                int i5 = onExtraCallbackWithResult + 117;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 42 / 0;
                    iHashCode4 = str2.hashCode();
                } else {
                    iHashCode4 = str2.hashCode();
                }
            }
            int iHashCode5 = (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + this.button.hashCode();
            int i7 = onWarmupCompleted + 75;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            return iHashCode5;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "PendingTaskResponse(type=" + this.type + ", title=" + this.title + ", description=" + this.description + ", iconUrl=" + this.iconUrl + ", button=" + this.button + ")";
            int i2 = onWarmupCompleted + 7;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public /* synthetic */ PendingTaskResponse(int i, String str, String str2, String str3, String str4, PendingTaskButton pendingTaskButton, okycx okycxVar) {
            SerialDescriptor descriptor;
            int i2 = 19;
            if (19 != (i & 19)) {
                int i3 = onExtraCallbackWithResult + 7;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 != 0) {
                    descriptor = PendingTasksResponse$PendingTaskResponse$.serializer.INSTANCE.getDescriptor();
                    i2 = 108;
                } else {
                    descriptor = PendingTasksResponse$PendingTaskResponse$.serializer.INSTANCE.getDescriptor();
                }
                htf31.onExtraCallbackWithResult(i, i2, descriptor);
            }
            this.type = str;
            this.title = str2;
            if ((i & 4) == 0) {
                this.description = null;
            } else {
                this.description = str3;
            }
            if ((i & 8) == 0) {
                int i4 = onExtraCallbackWithResult + 9;
                int i5 = i4 % 128;
                onWarmupCompleted = i5;
                int i6 = i4 % 2;
                this.iconUrl = null;
                int i7 = i5 + 39;
                onExtraCallbackWithResult = i7 % 128;
                if (i7 % 2 != 0) {
                }
                this.button = pendingTaskButton;
            }
            this.iconUrl = str4;
            int i8 = 2 % 2;
            this.button = pendingTaskButton;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final /* synthetic */ void onExtraCallback(PendingTaskResponse pendingTaskResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 67;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            vylVar.onExtraCallback(serialDescriptor, 0, pendingTaskResponse.type);
            vylVar.onExtraCallback(serialDescriptor, 1, pendingTaskResponse.title);
            if (vylVar.onWarmupCompleted(serialDescriptor, 2) || pendingTaskResponse.description != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, pendingTaskResponse.description);
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 3)) {
                int i4 = onWarmupCompleted + 9;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                if (pendingTaskResponse.iconUrl != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, pendingTaskResponse.iconUrl);
                }
            }
            vylVar.onNavigationEvent(serialDescriptor, 4, PendingTaskButton$.serializer.INSTANCE, pendingTaskResponse.button);
            int i6 = onWarmupCompleted + 125;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
        }

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 45;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            String str = this.type;
            int i4 = i3 + 43;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        public final String onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 59;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            String str = this.title;
            int i5 = i2 + 81;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 18 / 0;
            }
            return str;
        }

        public final String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 55;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            String str = this.description;
            int i5 = i3 + 27;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 61;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            String str = this.iconUrl;
            int i5 = i2 + 69;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final PendingTaskButton IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 45;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return this.button;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
