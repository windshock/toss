package im.toss.features.home.core.remote.request;

import im.toss.features.home.core.remote.request.InvestmentPortfolioSaveSelectedInvestAccountIdReq$;
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
public final class InvestmentPortfolioSaveSelectedInvestAccountIdReq {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private final List<String> ids;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new InvestmentPortfolioSaveSelectedInvestAccountIdReq$.ExternalSyntheticLambda0())};

    public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 117;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnNavigationEvent = onNavigationEvent();
        int i4 = IAuthTabCallback + 19;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnNavigationEvent;
    }

    private static final /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(getWriggleLayout.onNavigationEvent);
        int i2 = onNavigationEvent + 77;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r5 instanceof im.toss.features.home.core.remote.request.InvestmentPortfolioSaveSelectedInvestAccountIdReq) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r4.ids, ((im.toss.features.home.core.remote.request.InvestmentPortfolioSaveSelectedInvestAccountIdReq) r5).ids) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
    
        r5 = im.toss.features.home.core.remote.request.InvestmentPortfolioSaveSelectedInvestAccountIdReq.onNavigationEvent + 9;
        im.toss.features.home.core.remote.request.InvestmentPortfolioSaveSelectedInvestAccountIdReq.IAuthTabCallback = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        if ((r5 % 2) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
    
        r5 = null;
        r5.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r4 == r5) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r4 == r5) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 19;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 59 / 0;
        }
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 45;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.ids.hashCode();
        if (i3 == 0) {
            int i4 = 85 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "InvestmentPortfolioSaveSelectedInvestAccountIdReq(ids=" + this.ids + ")";
        int i2 = onNavigationEvent + 79;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = onExtraCallbackWithResult + 107;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ InvestmentPortfolioSaveSelectedInvestAccountIdReq(int i, List list, okycx okycxVar) {
        if (1 != (i & 1)) {
            int i2 = IAuthTabCallback + 75;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 1, InvestmentPortfolioSaveSelectedInvestAccountIdReq$.serializer.INSTANCE.getDescriptor());
            int i4 = 2 % 2;
        }
        this.ids = list;
    }

    public InvestmentPortfolioSaveSelectedInvestAccountIdReq(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.ids = list;
    }

    @JvmStatic
    public static final /* synthetic */ void IAuthTabCallback(InvestmentPortfolioSaveSelectedInvestAccountIdReq investmentPortfolioSaveSelectedInvestAccountIdReq, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 45;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onNavigationEvent(serialDescriptor, 0, (py) $childSerializers[0].getValue(), investmentPortfolioSaveSelectedInvestAccountIdReq.ids);
        int i4 = onNavigationEvent + 31;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ Lazy[] IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 77;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (i3 == 0) {
            int i4 = 39 / 0;
        }
        return lazyArr;
    }
}
