package im.toss.features.alltab.feature.total_service.data.model;

import im.toss.features.alltab.feature.total_service.data.model.AddRecentEntryRequest$;
import im.toss.features.alltab.feature.total_service.data.model.AddRecentEntryRequest$Entry$;
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
import o.htf31;
import o.liq;
import o.okycx;
import o.py;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class AddRecentEntryRequest {
    public static final int $stable = 0;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private final List<Entry> entries;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new AddRecentEntryRequest$.ExternalSyntheticLambda0())};

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 107;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback();
        }
        onExtraCallback();
        throw null;
    }

    private static final /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(AddRecentEntryRequest$Entry$.serializer.INSTANCE);
        int i2 = onNavigationEvent + 35;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return checkcanopenlandingpage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 105;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof AddRecentEntryRequest) {
            return Intrinsics.areEqual(this.entries, ((AddRecentEntryRequest) obj).entries);
        }
        int i4 = i3 + 55;
        onExtraCallback = i4 % 128;
        boolean z = i4 % 2 != 0;
        int i5 = i3 + 71;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 55;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.entries.hashCode();
        int i4 = onExtraCallback + 113;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AddRecentEntryRequest(entries=" + this.entries + ")";
        int i2 = onExtraCallback + 97;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    static {
        int i = IAuthTabCallback + 103;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ AddRecentEntryRequest(int i, List list, okycx okycxVar) {
        if (1 != (i & 1)) {
            int i2 = onNavigationEvent + 75;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 1, AddRecentEntryRequest$.serializer.INSTANCE.getDescriptor());
            int i4 = onExtraCallback + 101;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.entries = list;
    }

    public AddRecentEntryRequest(@NotNull List<Entry> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.entries = list;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallback(AddRecentEntryRequest addRecentEntryRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onNavigationEvent(serialDescriptor, 0, (py) $childSerializers[0].getValue(), addRecentEntryRequest.entries);
        int i4 = onExtraCallback + 79;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ Lazy[] onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 79;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i3 + 71;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return lazyArr;
        }
        throw null;
    }

    @liq
    public static final class Entry {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        private static int onWarmupCompleted;
        private final long entryId;
        private final long timestamp;

        static {
            Object obj = null;
            int i = onExtraCallback + 9;
            onWarmupCompleted = i % 128;
            if (i % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 53;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            if (this.entryId != entry.entryId) {
                return false;
            }
            if (this.timestamp == entry.timestamp) {
                return true;
            }
            int i4 = i3 + 85;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 113;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (Long.hashCode(this.entryId) * 31) + Long.hashCode(this.timestamp);
            int i4 = IAuthTabCallback + 111;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Entry(entryId=" + this.entryId + ", timestamp=" + this.timestamp + ")";
            int i2 = onExtraCallbackWithResult + 17;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public /* synthetic */ Entry(int i, long j, long j2, okycx okycxVar) {
            if (3 != (i & 3)) {
                int i2 = IAuthTabCallback + 89;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                htf31.onExtraCallbackWithResult(i, 3, AddRecentEntryRequest$Entry$.serializer.INSTANCE.getDescriptor());
                int i4 = onExtraCallbackWithResult + 11;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            }
            this.entryId = j;
            this.timestamp = j2;
        }

        public Entry(long j, long j2) {
            this.entryId = j;
            this.timestamp = j2;
        }

        @JvmStatic
        public static final /* synthetic */ void IAuthTabCallback(Entry entry, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 29;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = 0;
            if (i2 % 2 != 0) {
                vylVar.onExtraCallback(serialDescriptor, 0, entry.entryId);
            } else {
                vylVar.onExtraCallback(serialDescriptor, 0, entry.entryId);
                i3 = 1;
            }
            vylVar.onExtraCallback(serialDescriptor, i3, entry.timestamp);
        }
    }
}
