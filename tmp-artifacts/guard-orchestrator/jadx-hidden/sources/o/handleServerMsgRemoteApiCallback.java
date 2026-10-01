package o;

import android.net.Uri;
import im.toss.define.TossAffiliate;
import im.toss.tosssecurities.features.main.ui.TossSecMainViewModel;
import java.util.Iterator;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class handleServerMsgRemoteApiCallback implements AppMsgReceiver1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ handleServerMsgRemoteApiCallback[] $VALUES;
    public static final onWarmupCompleted Companion;
    private static int IAuthTabCallback = 0;
    private static final handleServerMsgRemoteApiCallback[] all;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final TossAffiliate affiliate;
    private final String domainName;
    private final String koreanName;
    private final String simplifiedHost = (String) filterCreatePageParams.onWarmupCompleted(new Object[]{getDomainName()}, 850240680, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -850240678);
    public static final handleServerMsgRemoteApiCallback CORE = new handleServerMsgRemoteApiCallback("CORE", 0, "toss.im", TossAffiliate.CORE, "토스코어");
    public static final handleServerMsgRemoteApiCallback INVEST = new handleServerMsgRemoteApiCallback("INVEST", 1, "tossinvest.com", TossAffiliate.SECURITIES, "토스증권");
    public static final handleServerMsgRemoteApiCallback PAYMENTS = new handleServerMsgRemoteApiCallback("PAYMENTS", 2, "tosspayments.com", TossAffiliate.PAYMENTS, "토스페이먼츠");
    public static final handleServerMsgRemoteApiCallback INSURANCE = new handleServerMsgRemoteApiCallback("INSURANCE", 3, "tossinsu.com", TossAffiliate.INSURANCE, "토스인슈어런스");
    public static final handleServerMsgRemoteApiCallback BANK = new handleServerMsgRemoteApiCallback("BANK", 4, "tossbank.com", TossAffiliate.BANK, "토스뱅크");
    public static final handleServerMsgRemoteApiCallback PLACE = new handleServerMsgRemoteApiCallback("PLACE", 5, "tossplace.com", TossAffiliate.PLACE, "토스플레이스");
    public static final handleServerMsgRemoteApiCallback CX = new handleServerMsgRemoteApiCallback("CX", 6, "tosscx.com", TossAffiliate.CX, "토스CX");
    public static final handleServerMsgRemoteApiCallback MOBILE = new handleServerMsgRemoteApiCallback("MOBILE", 7, "tossmobile.co.kr", TossAffiliate.MOBILE, "토스모바일");
    public static final handleServerMsgRemoteApiCallback INCOME = new handleServerMsgRemoteApiCallback("INCOME", 8, "tossincome.com", TossAffiliate.INCOME, "토스인컴");

    private static final /* synthetic */ handleServerMsgRemoteApiCallback[] $values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 55;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        handleServerMsgRemoteApiCallback[] handleservermsgremoteapicallbackArr = {CORE, INVEST, PAYMENTS, INSURANCE, BANK, PLACE, CX, MOBILE, INCOME};
        int i5 = i2 + 11;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 91 / 0;
        }
        return handleservermsgremoteapicallbackArr;
    }

    public static EnumEntries<handleServerMsgRemoteApiCallback> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 35;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        EnumEntries<handleServerMsgRemoteApiCallback> enumEntries = $ENTRIES;
        int i5 = i3 + 1;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return enumEntries;
        }
        throw null;
    }

    public static handleServerMsgRemoteApiCallback valueOf(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 59;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        handleServerMsgRemoteApiCallback handleservermsgremoteapicallback = (handleServerMsgRemoteApiCallback) Enum.valueOf(handleServerMsgRemoteApiCallback.class, str);
        int i4 = onWarmupCompleted + 75;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 69 / 0;
        }
        return handleservermsgremoteapicallback;
    }

    public static handleServerMsgRemoteApiCallback[] values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        handleServerMsgRemoteApiCallback[] handleservermsgremoteapicallbackArr = (handleServerMsgRemoteApiCallback[]) $VALUES.clone();
        int i4 = onWarmupCompleted + 123;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return handleservermsgremoteapicallbackArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private handleServerMsgRemoteApiCallback(String str, int i, String str2, TossAffiliate tossAffiliate, String str3) {
        this.domainName = str2;
        this.affiliate = tossAffiliate;
        this.koreanName = str3;
    }

    public static final /* synthetic */ handleServerMsgRemoteApiCallback[] access$getAll$cp() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 33;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        handleServerMsgRemoteApiCallback[] handleservermsgremoteapicallbackArr = all;
        int i5 = i2 + 125;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return handleservermsgremoteapicallbackArr;
    }

    public final TossAffiliate getAffiliate() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 17;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        TossAffiliate tossAffiliate = this.affiliate;
        int i5 = i3 + 15;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return tossAffiliate;
    }

    @Override // o.AppMsgReceiver1
    public String getDomainName() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 123;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String str = this.domainName;
        if (i3 != 0) {
            int i4 = 46 / 0;
        }
        return str;
    }

    public final String getKoreanName() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        String str = this.koreanName;
        if (i3 == 0) {
            int i4 = 95 / 0;
        }
        return str;
    }

    static {
        handleServerMsgRemoteApiCallback[] handleservermsgremoteapicallbackArr$values = $values();
        $VALUES = handleservermsgremoteapicallbackArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(handleservermsgremoteapicallbackArr$values);
        Companion = new onWarmupCompleted(null);
        all = (handleServerMsgRemoteApiCallback[]) getEntries().toArray(new handleServerMsgRemoteApiCallback[0]);
        int i = IAuthTabCallback + 85;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public final String toRegionDomain(@NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        String str2 = str + "." + getDomainName();
        int i2 = onWarmupCompleted + 103;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 94 / 0;
        }
        return str2;
    }

    public String getSimplifiedHost() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 33;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return this.simplifiedHost;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onWarmupCompleted {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }

        public final handleServerMsgRemoteApiCallback[] onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 75;
            IAuthTabCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                handleServerMsgRemoteApiCallback.access$getAll$cp();
                obj.hashCode();
                throw null;
            }
            handleServerMsgRemoteApiCallback[] handleservermsgremoteapicallbackArrAccess$getAll$cp = handleServerMsgRemoteApiCallback.access$getAll$cp();
            int i3 = IAuthTabCallback + 99;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                return handleservermsgremoteapicallbackArrAccess$getAll$cp;
            }
            obj.hashCode();
            throw null;
        }

        public final handleServerMsgRemoteApiCallback IAuthTabCallback(@NotNull String str) {
            Object obj;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            try {
                Result.Companion companion = Result.Companion;
                obj = Result.constructor-impl(Uri.parse(str));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th));
            }
            if (Result.onExtraCallback(obj)) {
                int i2 = IAuthTabCallback + 3;
                int i3 = i2 % 128;
                onExtraCallbackWithResult = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 57;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 5 % 5;
                }
                obj = null;
            }
            Uri uri = (Uri) obj;
            if (uri == null) {
                return null;
            }
            return onExtraCallback(uri);
        }

        public final handleServerMsgRemoteApiCallback onExtraCallback(@NotNull Uri uri) {
            Object next;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 7;
            IAuthTabCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(uri, "");
                uri.getHost();
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(uri, "");
            String host = uri.getHost();
            if (host == null) {
                return null;
            }
            String str = (String) filterCreatePageParams.onWarmupCompleted(new Object[]{host}, 850240680, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -850240678);
            if (str == null) {
                int i3 = IAuthTabCallback + 75;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                return null;
            }
            Iterator it = handleServerMsgRemoteApiCallback.getEntries().iterator();
            while (it.hasNext()) {
                int i5 = onExtraCallbackWithResult + 11;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    next = it.next();
                    if (!(!filterCreatePageParams.onExtraCallbackWithResult(str, (String) filterCreatePageParams.onWarmupCompleted(new Object[]{((handleServerMsgRemoteApiCallback) next).getDomainName()}, 850240680, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -850240678)))) {
                        obj = next;
                        break;
                    }
                } else {
                    next = it.next();
                    int i6 = 8 / 0;
                    if (filterCreatePageParams.onExtraCallbackWithResult(str, (String) filterCreatePageParams.onWarmupCompleted(new Object[]{((handleServerMsgRemoteApiCallback) next).getDomainName()}, 850240680, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -850240678))) {
                        obj = next;
                        break;
                    }
                }
            }
            return (handleServerMsgRemoteApiCallback) obj;
        }
    }
}
