package im.toss.features.leave.domain.response;

import im.toss.features.leave.domain.response.LeaveTodoItemResponse$;
import im.toss.features.leave.domain.response.LeaveTodoResponse$;
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
import o.htf31;
import o.liq;
import o.okycx;
import o.py;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class LeaveTodoResponse {
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final List<String> disclaimers;
    private final List<LeaveTodoItemResponse> items;

    private static final /* synthetic */ KSerializer asBinder() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(LeaveTodoItemResponse$.serializer.INSTANCE);
        int i2 = onExtraCallbackWithResult + 11;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return checkcanopenlandingpage;
        }
        throw null;
    }

    private static final /* synthetic */ KSerializer asInterface() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(getWriggleLayout.onNavigationEvent);
        int i2 = onExtraCallbackWithResult + 63;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    public static /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            asInterface();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        KSerializer kSerializerAsInterface = asInterface();
        int i3 = onExtraCallbackWithResult + 73;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerAsInterface;
    }

    public static /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 1;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            asBinder();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        KSerializer kSerializerAsBinder = asBinder();
        int i3 = onNavigationEvent + 89;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerAsBinder;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 97;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof LeaveTodoResponse) {
            LeaveTodoResponse leaveTodoResponse = (LeaveTodoResponse) obj;
            if (Intrinsics.areEqual(this.items, leaveTodoResponse.items)) {
                return Intrinsics.areEqual(this.disclaimers, leaveTodoResponse.disclaimers);
            }
            int i4 = onExtraCallbackWithResult + 35;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = onNavigationEvent + 13;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 77;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.items.hashCode();
        return i3 == 0 ? (iHashCode + 37) >>> this.disclaimers.hashCode() : (iHashCode * 31) + this.disclaimers.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LeaveTodoResponse(items=" + this.items + ", disclaimers=" + this.disclaimers + ")";
        int i2 = onNavigationEvent + 3;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
        $childSerializers = new Lazy[]{LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new LeaveTodoResponse$.ExternalSyntheticLambda0()), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new LeaveTodoResponse$.ExternalSyntheticLambda1())};
        int i = IAuthTabCallback + 65;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public /* synthetic */ LeaveTodoResponse(int i, List list, List list2, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i2 = 1;
        if (1 != (i & 1)) {
            int i3 = onNavigationEvent + 119;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                descriptor = LeaveTodoResponse$.serializer.INSTANCE.getDescriptor();
                i2 = 0;
            } else {
                descriptor = LeaveTodoResponse$.serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i, i2, descriptor);
            int i4 = 2 % 2;
        }
        this.items = list;
        if ((i & 2) == 0) {
            this.disclaimers = CollectionsKt.emptyList();
            return;
        }
        this.disclaimers = list2;
        int i5 = onNavigationEvent + 51;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0050 A[PHI: r1
      0x0050: PHI (r1v6 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
      (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v10 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
     binds: [B:8:0x0039, B:10:0x004e, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003b A[PHI: r1
      0x003b: PHI (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
      (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v10 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
     binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onExtraCallbackWithResult(LeaveTodoResponse leaveTodoResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
        Lazy<KSerializer<Object>>[] lazyArr;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 59;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            lazyArr = $childSerializers;
            vylVar.onNavigationEvent(serialDescriptor, 0, (py) lazyArr[1].getValue(), leaveTodoResponse.items);
            if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
                int i3 = onNavigationEvent + 117;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                if (!Intrinsics.areEqual(leaveTodoResponse.disclaimers, CollectionsKt.emptyList())) {
                    vylVar.onNavigationEvent(serialDescriptor, 1, (py) lazyArr[1].getValue(), leaveTodoResponse.disclaimers);
                }
            }
        } else {
            lazyArr = $childSerializers;
            vylVar.onNavigationEvent(serialDescriptor, 0, (py) lazyArr[0].getValue(), leaveTodoResponse.items);
            if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            }
        }
        int i5 = onExtraCallbackWithResult + 5;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ Lazy[] onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 73;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i4 = i3 + 87;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return lazyArr;
    }

    public final List<LeaveTodoItemResponse> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 97;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        List<LeaveTodoItemResponse> list = this.items;
        int i5 = i3 + 105;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final List<String> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        List<String> list = this.disclaimers;
        int i5 = i3 + 21;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }
}
