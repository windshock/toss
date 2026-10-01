package im.toss.features.home.core.remote.model;

import im.toss.features.home.core.remote.model.MydataTrialBankSelectionsResponse$;
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
public final class MydataTrialBankSelectionsResponse {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final List<String> institutionCodes;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new MydataTrialBankSelectionsResponse$.ExternalSyntheticLambda0())};

    /* JADX WARN: Illegal instructions before constructor call */
    public MydataTrialBankSelectionsResponse() {
        List list = null;
        this(list, 1, (DefaultConstructorMarker) list);
    }

    private static final /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(getWriggleLayout.onNavigationEvent);
        int i2 = IAuthTabCallback + 71;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    public static /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 111;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerIAuthTabCallback = IAuthTabCallback();
        int i4 = onNavigationEvent + 113;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerIAuthTabCallback;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 95;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i4 + 99;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        if (obj instanceof MydataTrialBankSelectionsResponse) {
            return Intrinsics.areEqual(this.institutionCodes, ((MydataTrialBankSelectionsResponse) obj).institutionCodes);
        }
        int i8 = i2 + 91;
        IAuthTabCallback = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 85;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        List<String> list = this.institutionCodes;
        if (i3 == 0) {
            return list.hashCode();
        }
        list.hashCode();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "MydataTrialBankSelectionsResponse(institutionCodes=" + this.institutionCodes + ")";
        int i2 = onNavigationEvent + 61;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    static {
        int i = onWarmupCompleted + 13;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ MydataTrialBankSelectionsResponse(int i, List list, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.institutionCodes = CollectionsKt.emptyList();
            int i2 = IAuthTabCallback + 115;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        this.institutionCodes = list;
        int i4 = onNavigationEvent + 69;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 81 / 0;
        }
    }

    public MydataTrialBankSelectionsResponse(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.institutionCodes = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003b  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void IAuthTabCallback(MydataTrialBankSelectionsResponse mydataTrialBankSelectionsResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 101;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            int i4 = IAuthTabCallback + 57;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                if (!Intrinsics.areEqual(mydataTrialBankSelectionsResponse.institutionCodes, CollectionsKt.emptyList())) {
                    vylVar.onNavigationEvent(serialDescriptor, 0, (py) lazyArr[0].getValue(), mydataTrialBankSelectionsResponse.institutionCodes);
                }
            } else {
                Intrinsics.areEqual(mydataTrialBankSelectionsResponse.institutionCodes, CollectionsKt.emptyList());
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        int i5 = onNavigationEvent + 31;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ Lazy[] onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 95;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (i3 != 0) {
            int i4 = 55 / 0;
        }
        return lazyArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MydataTrialBankSelectionsResponse(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onNavigationEvent + 117;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            list = CollectionsKt.emptyList();
            int i4 = onNavigationEvent + 39;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this(list);
    }
}
