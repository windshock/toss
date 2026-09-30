package viva.republica.toss.network.model.loan;

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
import net.sf.scuba.smartcards.BuildConfig;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkCanOpenLandingPage;
import o.liq;
import o.okycx;
import o.py;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class LoanTermsGroup {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private final boolean necessary;
    private final List<LoanTerm> terms;
    private final String title;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.loan.LoanTermsGroup$$ExternalSyntheticLambda0
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 51;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                LoanTermsGroup.onExtraCallback();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            KSerializer kSerializerOnExtraCallback = LoanTermsGroup.onExtraCallback();
            int i3 = onExtraCallbackWithResult + 115;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return kSerializerOnExtraCallback;
        }
    })};

    public LoanTermsGroup() {
        this((String) null, false, (List) null, 7, (DefaultConstructorMarker) null);
    }

    private static final /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(LoanTerm$$serializer.INSTANCE);
        int i2 = onExtraCallback + 9;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 72 / 0;
        }
        return checkcanopenlandingpage;
    }

    public static /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerIAuthTabCallback = IAuthTabCallback();
        int i4 = onExtraCallbackWithResult + 95;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 123;
            onExtraCallbackWithResult = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(obj instanceof LoanTermsGroup)) {
            return false;
        }
        LoanTermsGroup loanTermsGroup = (LoanTermsGroup) obj;
        if (!Intrinsics.areEqual(this.title, loanTermsGroup.title)) {
            int i3 = onExtraCallback + 99;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (this.necessary != loanTermsGroup.necessary) {
            int i5 = onExtraCallbackWithResult + 33;
            onExtraCallback = i5 % 128;
            return i5 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.terms, loanTermsGroup.terms)) {
            return false;
        }
        int i6 = onExtraCallback + 19;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.title.hashCode();
        return i3 == 0 ? (((iHashCode % 9) * Boolean.hashCode(this.necessary)) >>> 3) - this.terms.hashCode() : (((iHashCode * 31) + Boolean.hashCode(this.necessary)) * 31) + this.terms.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoanTermsGroup(title=" + this.title + ", necessary=" + this.necessary + ", terms=" + this.terms + ")";
        int i2 = onExtraCallbackWithResult + 21;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<LoanTermsGroup> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 125;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            LoanTermsGroup$$serializer loanTermsGroup$$serializer = LoanTermsGroup$$serializer.INSTANCE;
            int i4 = onExtraCallbackWithResult + 89;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return loanTermsGroup$$serializer;
        }
    }

    static {
        int i = onNavigationEvent + 91;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 87 / 0;
        }
    }

    public /* synthetic */ LoanTermsGroup(int i, String str, boolean z, List list, okycx okycxVar) {
        this.title = (i & 1) == 0 ? BuildConfig.FLAVOR : str;
        if ((i & 2) == 0) {
            this.necessary = true;
        } else {
            this.necessary = z;
            int i2 = 2 % 2;
        }
        if ((i & 4) != 0) {
            this.terms = list;
            return;
        }
        int i3 = onExtraCallbackWithResult + 11;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        this.terms = CollectionsKt.emptyList();
        int i5 = onExtraCallbackWithResult + 57;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public LoanTermsGroup(@NotNull String str, boolean z, @NotNull List<LoanTerm> list) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(list, BuildConfig.FLAVOR);
        this.title = str;
        this.necessary = z;
        this.terms = list;
    }

    @JvmStatic
    public static final /* synthetic */ void IAuthTabCallback(LoanTermsGroup loanTermsGroup, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0) || !Intrinsics.areEqual(loanTermsGroup.title, BuildConfig.FLAVOR)) {
            vylVar.onExtraCallback(serialDescriptor, 0, loanTermsGroup.title);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 1) || !loanTermsGroup.necessary) {
            vylVar.onNavigationEvent(serialDescriptor, 1, loanTermsGroup.necessary);
            int i2 = onExtraCallbackWithResult + 53;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 2) || !Intrinsics.areEqual(loanTermsGroup.terms, CollectionsKt.emptyList())) {
            vylVar.onNavigationEvent(serialDescriptor, 2, (py) lazyArr[2].getValue(), loanTermsGroup.terms);
            int i4 = onExtraCallback + 63;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static final /* synthetic */ Lazy[] onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 89;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i2 + 13;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return lazyArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LoanTermsGroup(String str, boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i & 1) != 0 ? BuildConfig.FLAVOR : str;
        if ((i & 2) != 0) {
            int i2 = 2 % 2;
            z = true;
        }
        if ((i & 4) != 0) {
            int i3 = onExtraCallbackWithResult + 59;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            list = CollectionsKt.emptyList();
            int i5 = onExtraCallbackWithResult + 109;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 5;
            } else {
                int i7 = 2 % 2;
            }
        }
        this(str, z, list);
    }
}
