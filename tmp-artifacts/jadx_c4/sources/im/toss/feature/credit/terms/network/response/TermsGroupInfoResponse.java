package im.toss.feature.credit.terms.network.response;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
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
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class TermsGroupInfoResponse {
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.feature.credit.terms.network.response.TermsGroupInfoResponse$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 77;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnNavigationEvent = TermsGroupInfoResponse.onNavigationEvent();
            int i4 = IAuthTabCallback + 21;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerOnNavigationEvent;
        }
    })};
    public static final Companion Companion;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final boolean agreed;
    private final String group;
    private final String necessity;
    private final List<CreditTermResponse> terms;
    private final String title;

    public TermsGroupInfoResponse() {
        this((String) null, (String) null, false, (String) null, (List) null, 31, (DefaultConstructorMarker) null);
    }

    private static final /* synthetic */ KSerializer asBinder() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(CreditTermResponse$$serializer.INSTANCE);
        int i2 = onExtraCallbackWithResult + 95;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return checkcanopenlandingpage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ KSerializer onNavigationEvent() {
        KSerializer kSerializerAsBinder;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 119;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            kSerializerAsBinder = asBinder();
            int i3 = 71 / 0;
        } else {
            kSerializerAsBinder = asBinder();
        }
        int i4 = onNavigationEvent + 81;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 48 / 0;
        }
        return kSerializerAsBinder;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TermsGroupInfoResponse)) {
            return false;
        }
        TermsGroupInfoResponse termsGroupInfoResponse = (TermsGroupInfoResponse) obj;
        if (!Intrinsics.areEqual(this.group, termsGroupInfoResponse.group)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.title, termsGroupInfoResponse.title)) {
            int i4 = onNavigationEvent + 71;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.agreed != termsGroupInfoResponse.agreed || (!Intrinsics.areEqual(this.necessity, termsGroupInfoResponse.necessity)) || !Intrinsics.areEqual(this.terms, termsGroupInfoResponse.terms)) {
            return false;
        }
        int i6 = onExtraCallbackWithResult + 77;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 31;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((this.group.hashCode() * 31) + this.title.hashCode()) * 31) + Boolean.hashCode(this.agreed)) * 31) + this.necessity.hashCode()) * 31) + this.terms.hashCode();
        int i4 = onExtraCallbackWithResult + 23;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TermsGroupInfoResponse(group=" + this.group + ", title=" + this.title + ", agreed=" + this.agreed + ", necessity=" + this.necessity + ", terms=" + this.terms + ")";
        int i2 = onExtraCallbackWithResult + 25;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 29 / 0;
        }
        return str;
    }

    public static final class Companion {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TermsGroupInfoResponse> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 57;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            TermsGroupInfoResponse$$serializer termsGroupInfoResponse$$serializer = TermsGroupInfoResponse$$serializer.INSTANCE;
            int i4 = onExtraCallback + 57;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return termsGroupInfoResponse$$serializer;
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        int i = IAuthTabCallback + 11;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public /* synthetic */ TermsGroupInfoResponse(int i, String str, String str2, boolean z, String str3, List list, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.group = "";
        } else {
            this.group = str;
        }
        if ((i & 2) == 0) {
            this.title = "";
            int i2 = onExtraCallbackWithResult + 99;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 / 3;
            } else {
                int i4 = 2 % 2;
            }
        } else {
            this.title = str2;
        }
        if ((i & 4) == 0) {
            this.agreed = false;
            int i5 = onNavigationEvent + 61;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
        } else {
            this.agreed = z;
        }
        if ((i & 8) == 0) {
            this.necessity = "";
            int i8 = onNavigationEvent + 63;
            onExtraCallbackWithResult = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 2 % 2;
            }
        } else {
            this.necessity = str3;
        }
        if ((i & 16) != 0) {
            this.terms = list;
            return;
        }
        int i10 = onExtraCallbackWithResult + 5;
        onNavigationEvent = i10 % 128;
        if (i10 % 2 == 0) {
            this.terms = CollectionsKt.emptyList();
        } else {
            this.terms = CollectionsKt.emptyList();
            throw null;
        }
    }

    public TermsGroupInfoResponse(@NotNull String str, @NotNull String str2, boolean z, @NotNull String str3, @NotNull List<CreditTermResponse> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.group = str;
        this.title = str2;
        this.agreed = z;
        this.necessity = str3;
        this.terms = list;
    }

    public static final /* synthetic */ Lazy[] onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 87;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i2 + 39;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return lazyArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a A[PHI: r1
      0x002a: PHI (r1v10 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
      (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v11 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
     binds: [B:8:0x0020, B:10:0x0028, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022 A[PHI: r1
      0x0022: PHI (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
      (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v11 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
     binds: [B:8:0x0020, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onExtraCallbackWithResult(TermsGroupInfoResponse termsGroupInfoResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
        Lazy<KSerializer<Object>>[] lazyArr;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 17;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            lazyArr = $childSerializers;
            if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
                if (!Intrinsics.areEqual(termsGroupInfoResponse.group, "")) {
                    vylVar.onExtraCallback(serialDescriptor, 0, termsGroupInfoResponse.group);
                }
            }
        } else {
            lazyArr = $childSerializers;
            if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            int i3 = onExtraCallbackWithResult + 21;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            if (!Intrinsics.areEqual(termsGroupInfoResponse.title, "")) {
                vylVar.onExtraCallback(serialDescriptor, 1, termsGroupInfoResponse.title);
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
            int i5 = onNavigationEvent + 7;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 35 / 0;
                if (!(!termsGroupInfoResponse.agreed)) {
                    vylVar.onNavigationEvent(serialDescriptor, 2, termsGroupInfoResponse.agreed);
                }
            } else if (termsGroupInfoResponse.agreed) {
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 3) || !Intrinsics.areEqual(termsGroupInfoResponse.necessity, "")) {
            vylVar.onExtraCallback(serialDescriptor, 3, termsGroupInfoResponse.necessity);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 4) || !Intrinsics.areEqual(termsGroupInfoResponse.terms, CollectionsKt.emptyList())) {
            vylVar.onNavigationEvent(serialDescriptor, 4, (py) lazyArr[4].getValue(), termsGroupInfoResponse.terms);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TermsGroupInfoResponse(String str, String str2, boolean z, String str3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z2;
        String str4 = "";
        if ((i & 1) != 0) {
            int i2 = onNavigationEvent + 77;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 12 / 0;
            }
            int i4 = 2 % 2;
            str = "";
        }
        String str5 = (i & 2) != 0 ? "" : str2;
        if ((i & 4) != 0) {
            int i5 = onNavigationEvent + 49;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            z2 = false;
        } else {
            z2 = z;
        }
        if ((i & 8) != 0) {
            int i8 = onExtraCallbackWithResult + 69;
            onNavigationEvent = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 88 / 0;
            }
            int i10 = 2 % 2;
        } else {
            str4 = str3;
        }
        this(str, str5, z2, str4, (i & 16) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 47;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = this.group;
        int i5 = i3 + 113;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onTransact() {
        String str;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 5;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.title;
            int i4 = 94 / 0;
        } else {
            str = this.title;
        }
        int i5 = i2 + 79;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 83;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        boolean z = this.agreed;
        int i5 = i3 + 11;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return this.necessity;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<CreditTermResponse> IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 7;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        List<CreditTermResponse> list = this.terms;
        int i5 = i2 + 63;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }
}
