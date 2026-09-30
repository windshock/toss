package im.toss.features.feed.data.dto;

import im.toss.features.feed.data.dto.ContentId$;
import im.toss.features.feed.data.dto.SetReadReq$;
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
public final class SetReadReq {
    public static final int $stable = 0;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final List<ContentId> contentList;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new SetReadReq$.ExternalSyntheticLambda0())};

    public static /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnWarmupCompleted = onWarmupCompleted();
        if (i3 != 0) {
            int i4 = 88 / 0;
        }
        return kSerializerOnWarmupCompleted;
    }

    private static final /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(ContentId$.serializer.INSTANCE);
        int i2 = onWarmupCompleted + 49;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 57;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetReadReq)) {
            int i4 = i2 + 37;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.contentList, ((SetReadReq) obj).contentList)) {
            return true;
        }
        int i6 = onWarmupCompleted + 19;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            this.contentList.hashCode();
            throw null;
        }
        int iHashCode = this.contentList.hashCode();
        int i3 = onWarmupCompleted + 3;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SetReadReq(contentList=" + this.contentList + ")";
        int i2 = onNavigationEvent + 63;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    static {
        int i = IAuthTabCallback + 57;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ SetReadReq(int i, List list, okycx okycxVar) {
        if (1 != (i & 1)) {
            int i2 = onWarmupCompleted + 109;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 1, SetReadReq$.serializer.INSTANCE.getDescriptor());
            int i4 = onWarmupCompleted + 83;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
        }
        this.contentList = list;
    }

    public SetReadReq(@NotNull List<ContentId> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.contentList = list;
    }

    public static final /* synthetic */ Lazy[] IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i3 + 67;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return lazyArr;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallback(SetReadReq setReadReq, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 21;
        onNavigationEvent = i2 % 128;
        vylVar.onNavigationEvent(serialDescriptor, 0, (py) (i2 % 2 != 0 ? $childSerializers[0] : $childSerializers[0]).getValue(), setReadReq.contentList);
    }
}
