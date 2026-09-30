package im.toss.features.feed.data.dto;

import im.toss.features.feed.data.dto.InboxMessageV2Dto$;
import im.toss.features.feed.data.dto.InboxV2OthersResp$;
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
import o.liq;
import o.okycx;
import o.py;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class InboxV2OthersResp {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final List<InboxMessageV2Dto> otherContents;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final int $stable = 8;
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new InboxV2OthersResp$.ExternalSyntheticLambda0())};

    /* JADX WARN: Illegal instructions before constructor call */
    public InboxV2OthersResp() {
        List list = null;
        this(list, 1, (DefaultConstructorMarker) list);
    }

    private static final /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(InboxMessageV2Dto$.serializer.INSTANCE);
        int i2 = onExtraCallbackWithResult + 93;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    public static /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        KSerializer kSerializerOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i3 = onExtraCallback + 3;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 67 / 0;
        }
        return kSerializerOnExtraCallbackWithResult;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 93;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof InboxV2OthersResp)) {
            int i4 = onExtraCallback + 87;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.otherContents, ((InboxV2OthersResp) obj).otherContents)) {
            return true;
        }
        int i6 = onExtraCallback + 107;
        onExtraCallbackWithResult = i6 % 128;
        return i6 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 91;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        List<InboxMessageV2Dto> list = this.otherContents;
        if (list == null) {
            return 0;
        }
        int iHashCode = list.hashCode();
        int i3 = onExtraCallbackWithResult + 55;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return iHashCode;
        }
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "InboxV2OthersResp(otherContents=" + this.otherContents + ")";
        int i2 = onExtraCallback + 101;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    static {
        int i = onNavigationEvent + 91;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ InboxV2OthersResp(int i, List list, okycx okycxVar) {
        if ((i & 1) != 0) {
            this.otherContents = list;
            int i2 = onExtraCallback + 17;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        Object obj = null;
        this.otherContents = null;
        int i4 = onExtraCallback + 23;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public InboxV2OthersResp(@Nullable List<InboxMessageV2Dto> list) {
        this.otherContents = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035 A[PHI: r1
      0x0035: PHI (r1v6 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
      (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v10 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
     binds: [B:8:0x0020, B:12:0x002f, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022 A[PHI: r1
      0x0022: PHI (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
      (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v10 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
     binds: [B:8:0x0020, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void IAuthTabCallback(InboxV2OthersResp inboxV2OthersResp, vyl vylVar, SerialDescriptor serialDescriptor) {
        Lazy<KSerializer<Object>>[] lazyArr;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 93;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            lazyArr = $childSerializers;
            if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
                int i3 = onExtraCallback + 83;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    List<InboxMessageV2Dto> list = inboxV2OthersResp.otherContents;
                    throw null;
                }
                if (inboxV2OthersResp.otherContents != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 0, (py) lazyArr[0].getValue(), inboxV2OthersResp.otherContents);
                }
            }
        } else {
            lazyArr = $childSerializers;
            if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            }
        }
        int i4 = onExtraCallback + 83;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Lazy[] IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 93;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i4 = i3 + 25;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return lazyArr;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ InboxV2OthersResp(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallback + 103;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 85 / 0;
            }
            int i4 = 2 % 2;
            list = null;
        }
        this(list);
    }

    public final List<InboxMessageV2Dto> onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 85;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.otherContents;
        }
        throw null;
    }
}
