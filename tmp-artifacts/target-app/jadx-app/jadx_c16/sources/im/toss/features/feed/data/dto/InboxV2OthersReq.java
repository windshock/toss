package im.toss.features.feed.data.dto;

import im.toss.features.feed.data.dto.InboxV2OthersReq$;
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
import o.liq;
import o.okycx;
import o.py;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class InboxV2OthersReq {
    public static final int $stable = 0;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final String company;
    private final List<String> contents;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new InboxV2OthersReq$.ExternalSyntheticLambda0()), null};

    /* JADX WARN: Multi-variable type inference failed */
    public InboxV2OthersReq() {
        this((List) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 33;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallback = onExtraCallback();
        if (i3 != 0) {
            int i4 = 23 / 0;
        }
        return kSerializerOnExtraCallback;
    }

    private static final /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(getWriggleLayout.onNavigationEvent);
        int i2 = onExtraCallbackWithResult + 7;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InboxV2OthersReq)) {
            int i2 = onExtraCallbackWithResult + 37;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.contents, ((InboxV2OthersReq) obj).contents)) {
            int i4 = onExtraCallbackWithResult + 47;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!(!Intrinsics.areEqual(this.company, r6.company))) {
            return true;
        }
        int i6 = onWarmupCompleted + 13;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        List<String> list;
        int iHashCode;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 75;
        onWarmupCompleted = i2 % 128;
        int iHashCode2 = 0;
        if (i2 % 2 == 0) {
            list = this.contents;
            iHashCode = 1;
            if (list != null) {
                iHashCode2 = 1;
                iHashCode = iHashCode2;
                iHashCode2 = list.hashCode();
            }
        } else {
            list = this.contents;
            if (list == null) {
                iHashCode = 0;
            } else {
                iHashCode = iHashCode2;
                iHashCode2 = list.hashCode();
            }
        }
        String str = this.company;
        if (str != null) {
            int i3 = onWarmupCompleted + 111;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            iHashCode = str.hashCode();
            int i5 = onWarmupCompleted + 67;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "InboxV2OthersReq(contents=" + this.contents + ", company=" + this.company + ")";
        int i2 = onWarmupCompleted + 115;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    static {
        int i = IAuthTabCallback + 103;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ InboxV2OthersReq(int i, List list, String str, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.contents = null;
        } else {
            this.contents = list;
            int i2 = 2 % 2;
        }
        if ((i & 2) != 0) {
            this.company = str;
            int i3 = onWarmupCompleted + 27;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        int i5 = onExtraCallbackWithResult + 11;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        this.company = null;
        if (i6 == 0) {
            int i7 = 41 / 0;
        }
    }

    public InboxV2OthersReq(@Nullable List<String> list, @Nullable String str) {
        this.contents = list;
        this.company = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0022  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void IAuthTabCallback(InboxV2OthersReq inboxV2OthersReq, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            int i4 = onExtraCallbackWithResult + 89;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            if (inboxV2OthersReq.contents != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 0, (py) lazyArr[0].getValue(), inboxV2OthersReq.contents);
                int i6 = onWarmupCompleted + 3;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 1) || inboxV2OthersReq.company != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, inboxV2OthersReq.company);
        }
    }

    public static final /* synthetic */ Lazy[] onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 101;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i3 + 111;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 76 / 0;
        }
        return lazyArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ InboxV2OthersReq(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Object obj = null;
        if ((i & 1) != 0) {
            int i2 = onExtraCallbackWithResult + 9;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i3 = 2 % 2;
            list = null;
        }
        if ((i & 2) != 0) {
            int i4 = onWarmupCompleted + 27;
            int i5 = i4 % 128;
            onExtraCallbackWithResult = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 125;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
            str = null;
        }
        this(list, str);
    }
}
