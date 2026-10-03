package viva.republica.toss.network.model.loan;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkCanOpenLandingPage;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.loan.LoanHomeServices$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class LoanHomeServices {
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.loan.LoanHomeServices$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 55;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return LoanHomeServices.onExtraCallback();
            }
            LoanHomeServices.onExtraCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }), null};
    public static final Companion Companion;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final LoanHomeBannerResponse banner;
    private final List<LoanHomeService> services;

    /* JADX WARN: Multi-variable type inference failed */
    public LoanHomeServices() {
        this((List) null, (LoanHomeBannerResponse) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 7;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnWarmupCompleted = onWarmupCompleted();
        int i4 = IAuthTabCallback + 59;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerOnWarmupCompleted;
        }
        throw null;
    }

    private static final /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(LoanHomeService$$serializer.INSTANCE);
        int i2 = onExtraCallbackWithResult + 5;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return checkcanopenlandingpage;
        }
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback + 29;
            onExtraCallbackWithResult = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!(obj instanceof LoanHomeServices)) {
            int i3 = onExtraCallbackWithResult + 79;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        LoanHomeServices loanHomeServices = (LoanHomeServices) obj;
        if (!Intrinsics.areEqual(this.services, loanHomeServices.services) || !Intrinsics.areEqual(this.banner, loanHomeServices.banner)) {
            return false;
        }
        int i5 = IAuthTabCallback + 57;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 14 / 0;
        }
        return true;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 105;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            this.services.hashCode();
            throw null;
        }
        int iHashCode2 = this.services.hashCode();
        LoanHomeBannerResponse loanHomeBannerResponse = this.banner;
        if (loanHomeBannerResponse == null) {
            int i3 = IAuthTabCallback + 91;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            iHashCode = 0;
        } else {
            iHashCode = loanHomeBannerResponse.hashCode();
        }
        int i5 = (iHashCode2 * 31) + iHashCode;
        int i6 = IAuthTabCallback + 75;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoanHomeServices(services=" + this.services + ", banner=" + this.banner + ")";
        int i2 = onExtraCallbackWithResult + 105;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<LoanHomeServices> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 119;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            LoanHomeServices$.serializer serializerVar = LoanHomeServices$.serializer.INSTANCE;
            int i4 = IAuthTabCallback + 91;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return serializerVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        int i = onNavigationEvent + 19;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public /* synthetic */ LoanHomeServices(int i, List list, LoanHomeBannerResponse loanHomeBannerResponse, okycx okycxVar) {
        if ((i & 1) == 0) {
            list = CollectionsKt.emptyList();
            int i2 = 2 % 2;
        }
        this.services = list;
        Object obj = null;
        if ((i & 2) == 0) {
            this.banner = null;
            int i3 = onExtraCallbackWithResult + 65;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        this.banner = loanHomeBannerResponse;
        int i5 = onExtraCallbackWithResult + 71;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public LoanHomeServices(@NotNull List<LoanHomeService> list, @Nullable LoanHomeBannerResponse loanHomeBannerResponse) {
        Intrinsics.checkNotNullParameter(list, "");
        this.services = list;
        this.banner = loanHomeBannerResponse;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onExtraCallbackWithResult(viva.republica.toss.network.model.loan.LoanHomeServices r5, o.vyl r6, kotlinx.serialization.descriptors.SerialDescriptor r7) {
        /*
            r0 = 2
            int r1 = r0 % r0
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.loan.LoanHomeServices.$childSerializers
            r2 = 0
            boolean r3 = r6.onWarmupCompleted(r7, r2)
            if (r3 != 0) goto L33
            int r3 = viva.republica.toss.network.model.loan.LoanHomeServices.onExtraCallbackWithResult
            int r3 = r3 + 95
            int r4 = r3 % 128
            viva.republica.toss.network.model.loan.LoanHomeServices.IAuthTabCallback = r4
            int r3 = r3 % r0
            if (r3 != 0) goto L27
            java.util.List<viva.republica.toss.network.model.loan.LoanHomeService> r3 = r5.services
            java.util.List r4 = kotlin.collections.CollectionsKt.emptyList()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            r4 = 15
            int r4 = r4 / r2
            if (r3 != 0) goto L40
            goto L33
        L27:
            java.util.List<viva.republica.toss.network.model.loan.LoanHomeService> r3 = r5.services
            java.util.List r4 = kotlin.collections.CollectionsKt.emptyList()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 != 0) goto L40
        L33:
            r1 = r1[r2]
            java.lang.Object r1 = r1.getValue()
            o.py r1 = (o.py) r1
            java.util.List<viva.republica.toss.network.model.loan.LoanHomeService> r3 = r5.services
            r6.onNavigationEvent(r7, r2, r1, r3)
        L40:
            r1 = 1
            boolean r2 = r6.onWarmupCompleted(r7, r1)
            if (r2 != 0) goto L4b
            viva.republica.toss.network.model.loan.LoanHomeBannerResponse r2 = r5.banner
            if (r2 == 0) goto L5b
        L4b:
            viva.republica.toss.network.model.loan.LoanHomeBannerResponse$$serializer r2 = viva.republica.toss.network.model.loan.LoanHomeBannerResponse$.serializer.INSTANCE
            viva.republica.toss.network.model.loan.LoanHomeBannerResponse r5 = r5.banner
            r6.onExtraCallbackWithResult(r7, r1, r2, r5)
            int r5 = viva.republica.toss.network.model.loan.LoanHomeServices.IAuthTabCallback
            int r5 = r5 + 119
            int r6 = r5 % 128
            viva.republica.toss.network.model.loan.LoanHomeServices.onExtraCallbackWithResult = r6
            int r5 = r5 % r0
        L5b:
            int r5 = viva.republica.toss.network.model.loan.LoanHomeServices.IAuthTabCallback
            int r5 = r5 + 13
            int r6 = r5 % 128
            viva.republica.toss.network.model.loan.LoanHomeServices.onExtraCallbackWithResult = r6
            int r5 = r5 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanHomeServices.onExtraCallbackWithResult(viva.republica.toss.network.model.loan.LoanHomeServices, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public static final /* synthetic */ Lazy[] onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 29;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (i3 != 0) {
            int i4 = 99 / 0;
        }
        return lazyArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LoanHomeServices(List list, LoanHomeBannerResponse loanHomeBannerResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallback + 33;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            list = CollectionsKt.emptyList();
        }
        if ((i & 2) != 0) {
            int i4 = IAuthTabCallback + 7;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            loanHomeBannerResponse = null;
        }
        this(list, loanHomeBannerResponse);
    }

    public final List<LoanHomeService> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 35;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        List<LoanHomeService> list = this.services;
        int i5 = i2 + 75;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 8 / 0;
        }
        return list;
    }
}
