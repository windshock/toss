package im.toss.feature.credit.overview.network.response;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
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
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class LoanStatus {
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.feature.credit.overview.network.response.LoanStatus$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 117;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnWarmupCompleted = LoanStatus.onWarmupCompleted();
            int i4 = onExtraCallback + 15;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerOnWarmupCompleted;
        }
    }), null};
    public static final Companion Companion;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final String href;
    private final List<Loan> items;
    private final String referenceDate;

    public LoanStatus() {
        this((String) null, (List) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    private static final /* synthetic */ KSerializer onTransact() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(Loan$$serializer.INSTANCE);
        int i2 = IAuthTabCallback + 109;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    public static /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 19;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnTransact = onTransact();
        if (i3 == 0) {
            int i4 = 76 / 0;
        }
        return kSerializerOnTransact;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 33;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 71;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof LoanStatus)) {
            return false;
        }
        LoanStatus loanStatus = (LoanStatus) obj;
        if (!Intrinsics.areEqual(this.referenceDate, loanStatus.referenceDate) || !Intrinsics.areEqual(this.items, loanStatus.items)) {
            return false;
        }
        if (Intrinsics.areEqual(this.href, loanStatus.href)) {
            return true;
        }
        int i7 = onNavigationEvent + 61;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 == 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        String str;
        int iHashCode;
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 115;
        IAuthTabCallback = i3 % 128;
        int iHashCode2 = 1;
        int iHashCode3 = 0;
        if (i3 % 2 == 0 ? (str = this.referenceDate) != null : (str = this.referenceDate) != null) {
            iHashCode = str.hashCode();
        } else {
            int i4 = i2 + 1;
            int i5 = i4 % 128;
            IAuthTabCallback = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 47;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            iHashCode = 0;
        }
        List<Loan> list = this.items;
        if (list == null) {
            int i9 = onNavigationEvent + 105;
            IAuthTabCallback = i9 % 128;
            if (i9 % 2 == 0) {
                iHashCode2 = 0;
            }
        } else {
            iHashCode2 = list.hashCode();
        }
        String str2 = this.href;
        if (str2 != null) {
            int i10 = onNavigationEvent + 25;
            IAuthTabCallback = i10 % 128;
            int i11 = i10 % 2;
            iHashCode3 = str2.hashCode();
        }
        return (((iHashCode * 31) + iHashCode2) * 31) + iHashCode3;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoanStatus(referenceDate=" + this.referenceDate + ", items=" + this.items + ", href=" + this.href + ")";
        int i2 = onNavigationEvent + 105;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 40 / 0;
        }
        return str;
    }

    public static final class Companion {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<LoanStatus> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 65;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            LoanStatus$$serializer loanStatus$$serializer = LoanStatus$$serializer.INSTANCE;
            int i4 = onExtraCallback + 121;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return loanStatus$$serializer;
            }
            throw null;
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        int i = onWarmupCompleted + 59;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ LoanStatus(int i, String str, List list, String str2, okycx okycxVar) {
        Object obj = null;
        if ((i & 1) == 0) {
            this.referenceDate = null;
            int i2 = 2 % 2;
        } else {
            this.referenceDate = str;
        }
        if ((i & 2) != 0) {
            this.items = list;
            int i3 = onNavigationEvent + 105;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
            }
            if ((i & 4) != 0) {
                this.href = null;
                return;
            }
            this.href = str2;
            int i4 = onNavigationEvent + 29;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        int i6 = IAuthTabCallback + 49;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        this.items = null;
        if (i7 == 0) {
            obj.hashCode();
            throw null;
        }
        int i8 = 2 % 2;
        if ((i & 4) != 0) {
        }
    }

    public LoanStatus(@Nullable String str, @Nullable List<Loan> list, @Nullable String str2) {
        this.referenceDate = str;
        this.items = list;
        this.href = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024 A[PHI: r1
      0x0024: PHI (r1v19 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
      (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v20 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
     binds: [B:8:0x001e, B:10:0x0022, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020 A[PHI: r1
      0x0020: PHI (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
      (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v20 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
     binds: [B:8:0x001e, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onExtraCallback(LoanStatus loanStatus, vyl vylVar, SerialDescriptor serialDescriptor) {
        Lazy<KSerializer<Object>>[] lazyArr;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 29;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            lazyArr = $childSerializers;
            if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
                if (loanStatus.referenceDate != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, loanStatus.referenceDate);
                }
            }
        } else {
            lazyArr = $childSerializers;
            if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            int i3 = onNavigationEvent + 113;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                List<Loan> list = loanStatus.items;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (loanStatus.items != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 1, (py) lazyArr[1].getValue(), loanStatus.items);
                int i4 = IAuthTabCallback + 81;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
            int i6 = IAuthTabCallback + 5;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            if (loanStatus.href == null) {
                return;
            }
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, loanStatus.href);
    }

    public static final /* synthetic */ Lazy[] onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 5;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i3 + 5;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return lazyArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LoanStatus(String str, List list, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onNavigationEvent + 5;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            str = null;
        }
        list = (i & 2) != 0 ? null : list;
        if ((i & 4) != 0) {
            int i5 = IAuthTabCallback + 93;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            str2 = null;
        }
        this(str, list, str2);
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 31;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = this.referenceDate;
        if (i3 != 0) {
            int i4 = 75 / 0;
        }
        return str;
    }

    public final List<Loan> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 107;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.items;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onExtraCallback() {
        String str;
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 93;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.href;
            int i4 = 26 / 0;
        } else {
            str = this.href;
        }
        int i5 = i2 + 23;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
