package im.toss.features.home.core.remote.request;

import im.toss.features.home.core.remote.request.MydataTrialBankSelectionsRequest$;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class MydataTrialBankSelectionsRequest {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final List<String> institutionCodes;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new MydataTrialBankSelectionsRequest$.ExternalSyntheticLambda0())};

    private static final /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(getWriggleLayout.onNavigationEvent);
        int i2 = onExtraCallbackWithResult + 11;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    public static /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnNavigationEvent = onNavigationEvent();
        int i4 = onExtraCallback + 39;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerOnNavigationEvent;
        }
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 11;
        int i4 = i3 % 128;
        onExtraCallbackWithResult = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i4 + 23;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        if (!(!(obj instanceof MydataTrialBankSelectionsRequest))) {
            if (Intrinsics.areEqual(this.institutionCodes, ((MydataTrialBankSelectionsRequest) obj).institutionCodes)) {
                return true;
            }
            int i8 = onExtraCallback + 53;
            onExtraCallbackWithResult = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 65 / 0;
            }
            return false;
        }
        int i10 = i2 + 57;
        onExtraCallbackWithResult = i10 % 128;
        int i11 = i10 % 2;
        int i12 = i2 + 23;
        onExtraCallbackWithResult = i12 % 128;
        if (i12 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 111;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        List<String> list = this.institutionCodes;
        if (i3 != 0) {
            return list.hashCode();
        }
        list.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "MydataTrialBankSelectionsRequest(institutionCodes=" + this.institutionCodes + ")";
        int i2 = onExtraCallbackWithResult + 39;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    static {
        Object obj = null;
        int i = onWarmupCompleted + 27;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ MydataTrialBankSelectionsRequest(int i, List list, okycx okycxVar) {
        if (1 != (i & 1)) {
            int i2 = onExtraCallbackWithResult + 23;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 1, MydataTrialBankSelectionsRequest$.serializer.INSTANCE.getDescriptor());
            int i4 = onExtraCallbackWithResult + 105;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.institutionCodes = list;
    }

    public MydataTrialBankSelectionsRequest(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.institutionCodes = list;
    }

    public static final /* synthetic */ Lazy[] IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i3 + 5;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return lazyArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallback(MydataTrialBankSelectionsRequest mydataTrialBankSelectionsRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 49;
        onExtraCallbackWithResult = i2 % 128;
        vylVar.onNavigationEvent(serialDescriptor, 0, i2 % 2 == 0 ? (py) $childSerializers[1].getValue() : (py) $childSerializers[0].getValue(), mydataTrialBankSelectionsRequest.institutionCodes);
    }
}
