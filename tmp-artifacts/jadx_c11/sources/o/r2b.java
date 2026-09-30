package o;

import im.toss.securities.widget.data.model.overview.FolderOverviewAccounts;
import im.toss.securities.widget.data.model.overview.OverviewItemInfo;
import im.toss.securities.widget.data.model.overview.OverviewRate;
import im.toss.tosssecurities.core.currency.domain.Currency;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.r2ExternalSyntheticLambda2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r2b {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;

    public static final /* synthetic */ class IAuthTabCallback {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[Currency.values().length];
            try {
                iArr[Currency.KRW.ordinal()] = 1;
                int i = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Currency.USD.ordinal()] = 2;
                int i2 = onExtraCallback + 97;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            onWarmupCompleted = iArr;
            int i5 = IAuthTabCallback + 73;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }
    }

    public static final /* synthetic */ Currency onNavigationEvent(List list, Currency currency) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 9;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Currency currencyIAuthTabCallback = IAuthTabCallback(list, currency);
        if (i3 != 0) {
            int i4 = 8 / 0;
        }
        int i5 = onNavigationEvent + 11;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return currencyIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final r2ExternalSyntheticLambda2 onExtraCallback(@Nullable String str, @NotNull r2ExternalSyntheticLambda2 r2externalsyntheticlambda2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 101;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(r2externalsyntheticlambda2, "");
            int i3 = 6 / 0;
            if (str != null) {
                r2ExternalSyntheticLambda2 r2externalsyntheticlambda2OnExtraCallback = r5.onExtraCallback(str);
                if (r2externalsyntheticlambda2OnExtraCallback != null) {
                    int i4 = onNavigationEvent + 47;
                    IAuthTabCallback = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 43 / 0;
                    }
                    return r2externalsyntheticlambda2OnExtraCallback;
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(r2externalsyntheticlambda2, "");
            if (str != null) {
            }
        }
        return r2externalsyntheticlambda2;
    }

    public static final List<OverviewItemInfo> onWarmupCompleted(@NotNull List<? extends OverviewItemInfo> list, @NotNull r2ExternalSyntheticLambda2 r2externalsyntheticlambda2, @NotNull Currency currency, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 73;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(r2externalsyntheticlambda2, "");
            Intrinsics.checkNotNullParameter(currency, "");
            CollectionsKt.sortedWith(list, r2externalsyntheticlambda2.onWarmupCompleted(currency, z));
            throw null;
        }
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(r2externalsyntheticlambda2, "");
        Intrinsics.checkNotNullParameter(currency, "");
        List<OverviewItemInfo> listSortedWith = CollectionsKt.sortedWith(list, r2externalsyntheticlambda2.onWarmupCompleted(currency, z));
        int i3 = IAuthTabCallback + 81;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return listSortedWith;
        }
        obj.hashCode();
        throw null;
    }

    public static final List<OverviewItemInfo> IAuthTabCallback(@NotNull FolderOverviewAccounts.Folder folder) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 77;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(folder, "");
            return folder.onExtraCallback();
        }
        Intrinsics.checkNotNullParameter(folder, "");
        int i3 = 93 / 0;
        return folder.onExtraCallback();
    }

    public static final boolean IAuthTabCallback(@NotNull List<? extends OverviewItemInfo> list) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 117;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        List<? extends OverviewItemInfo> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            int i4 = onNavigationEvent + 1;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 88 / 0;
                if (onExtraCallback((OverviewItemInfo) it.next())) {
                    return true;
                }
            } else if (onExtraCallback((OverviewItemInfo) it.next())) {
                return true;
            }
        }
        return false;
    }

    private static final boolean onExtraCallback(OverviewItemInfo overviewItemInfo) {
        OverviewItemInfo.Stock stock;
        int i = 2 % 2;
        if (overviewItemInfo.IAuthTabCallbackDefault()) {
            return false;
        }
        int i2 = onNavigationEvent;
        int i3 = i2 + 3;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        if (overviewItemInfo instanceof OverviewItemInfo.Stock) {
            stock = (OverviewItemInfo.Stock) overviewItemInfo;
            int i5 = i2 + 85;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
        } else {
            int i7 = i2 + 115;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            stock = null;
        }
        return stock == null || !stock.ICustomTabsService();
    }

    public static final Currency onWarmupCompleted(@NotNull FolderOverviewAccounts.Folder folder, @NotNull Currency currency) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 21;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(folder, "");
        Intrinsics.checkNotNullParameter(currency, "");
        Currency currencyIAuthTabCallback = IAuthTabCallback(IAuthTabCallback(folder), currency);
        int i4 = onNavigationEvent + 5;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return currencyIAuthTabCallback;
    }

    private static final Currency IAuthTabCallback(List<? extends OverviewItemInfo> list, Currency currency) {
        int i = 2 % 2;
        if (currency != Currency.KRW) {
            int i2 = onNavigationEvent + 39;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                boolean z = list instanceof Collection;
                throw null;
            }
            List<? extends OverviewItemInfo> list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    if (((OverviewItemInfo) it.next()).extraCallbackWithResult() == OverviewItemInfo.ShareHoldingsType.kr) {
                    }
                }
            }
            return Currency.USD;
        }
        Currency currency2 = Currency.KRW;
        int i3 = onNavigationEvent + 33;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return currency2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final Double onExtraCallback(@NotNull FolderOverviewAccounts.Folder folder, @NotNull Currency currency, boolean z, @NotNull r2ExternalSyntheticLambda2 r2externalsyntheticlambda2) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(folder, "");
        Intrinsics.checkNotNullParameter(currency, "");
        Intrinsics.checkNotNullParameter(r2externalsyntheticlambda2, "");
        if (r2externalsyntheticlambda2.IAuthTabCallback() == r2ExternalSyntheticLambda2.IAuthTabCallbackDefault.DAILY_PROFIT) {
            return null;
        }
        Currency currencyOnWarmupCompleted = onWarmupCompleted(folder, currency);
        OverviewRate overviewRateAsInterface = z ? folder.asInterface() : folder.asBinder();
        int i2 = IAuthTabCallback.onWarmupCompleted[currencyOnWarmupCompleted.ordinal()];
        if (i2 == 1) {
            if (overviewRateAsInterface == null) {
                return null;
            }
            int i3 = onNavigationEvent + 109;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return overviewRateAsInterface.onExtraCallbackWithResult();
        }
        if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        int i5 = onNavigationEvent + 21;
        int i6 = i5 % 128;
        IAuthTabCallback = i6;
        int i7 = i5 % 2;
        if (overviewRateAsInterface == null) {
            return null;
        }
        int i8 = i6 + 81;
        onNavigationEvent = i8 % 128;
        if (i8 % 2 == 0) {
            return overviewRateAsInterface.onWarmupCompleted();
        }
        overviewRateAsInterface.onWarmupCompleted();
        throw null;
    }
}
