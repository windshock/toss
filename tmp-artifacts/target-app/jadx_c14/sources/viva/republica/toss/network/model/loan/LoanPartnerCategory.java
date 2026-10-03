package viva.republica.toss.network.model.loan;

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
import o.htf31;
import o.liq;
import o.okycx;
import o.py;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class LoanPartnerCategory {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final List<LoanCompany> companies;
    private final String title;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.loan.LoanPartnerCategory$$ExternalSyntheticLambda0
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 115;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnExtraCallbackWithResult = LoanPartnerCategory.onExtraCallbackWithResult();
            int i4 = onExtraCallbackWithResult + 23;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerOnExtraCallbackWithResult;
        }
    })};

    private static final /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(LoanCompany$$serializer.INSTANCE);
        int i2 = IAuthTabCallback + 35;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 63;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallback = onExtraCallback();
        int i4 = onNavigationEvent + 109;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnExtraCallback;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback + 97;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof LoanPartnerCategory)) {
            return false;
        }
        LoanPartnerCategory loanPartnerCategory = (LoanPartnerCategory) obj;
        if (!Intrinsics.areEqual(this.title, loanPartnerCategory.title)) {
            return false;
        }
        if (Intrinsics.areEqual(this.companies, loanPartnerCategory.companies)) {
            return true;
        }
        int i4 = onNavigationEvent + 123;
        int i5 = i4 % 128;
        IAuthTabCallback = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 107;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 90 / 0;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        IAuthTabCallback = i2 % 128;
        int iHashCode = i2 % 2 != 0 ? (this.title.hashCode() >>> 43) - this.companies.hashCode() : (this.title.hashCode() * 31) + this.companies.hashCode();
        int i3 = IAuthTabCallback + 75;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoanPartnerCategory(title=" + this.title + ", companies=" + this.companies + ")";
        int i2 = onNavigationEvent + 15;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<LoanPartnerCategory> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 99;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            LoanPartnerCategory$$serializer loanPartnerCategory$$serializer = LoanPartnerCategory$$serializer.INSTANCE;
            int i4 = onExtraCallbackWithResult + 57;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return loanPartnerCategory$$serializer;
        }
    }

    static {
        int i = onExtraCallback + 23;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ LoanPartnerCategory(int i, String str, List list, okycx okycxVar) {
        if (3 != (i & 3)) {
            int i2 = onNavigationEvent + 57;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                htf31.onExtraCallbackWithResult(i, 2, LoanPartnerCategory$$serializer.INSTANCE.getDescriptor());
            } else {
                htf31.onExtraCallbackWithResult(i, 3, LoanPartnerCategory$$serializer.INSTANCE.getDescriptor());
            }
            int i3 = 2 % 2;
        }
        this.title = str;
        this.companies = list;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallbackWithResult(LoanPartnerCategory loanPartnerCategory, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 19;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        vylVar.onExtraCallback(serialDescriptor, 0, loanPartnerCategory.title);
        vylVar.onNavigationEvent(serialDescriptor, 1, (py) lazyArr[1].getValue(), loanPartnerCategory.companies);
        int i4 = IAuthTabCallback + 99;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ Lazy[] onWarmupCompleted() {
        Lazy<KSerializer<Object>>[] lazyArr;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 25;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 != 0) {
            lazyArr = $childSerializers;
            int i4 = 70 / 0;
        } else {
            lazyArr = $childSerializers;
        }
        int i5 = i3 + 87;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return lazyArr;
        }
        throw null;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 67;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.title;
        int i5 = i2 + 73;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final List<LoanCompany> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 69;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        List<LoanCompany> list = this.companies;
        int i5 = i3 + 31;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 25 / 0;
        }
        return list;
    }
}
