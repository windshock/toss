package im.toss.features.home.core.model.account;

import im.toss.features.home.core.model.account.AccountSource$;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import o.TombstoneProtosMemoryMappingBuilder;
import o.access15300;
import o.liq;
import o.updateRenderInfoForVideo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class AccountSource {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AccountSource[] $VALUES;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public static final AccountSource NONE = new AccountSource("NONE", 0);
    public static final AccountSource PREPAID = new AccountSource("PREPAID", 1);
    public static final AccountSource ASSET = new AccountSource("ASSET", 2);
    public static final AccountSource DASHBOARD = new AccountSource("DASHBOARD", 3);

    /* renamed from: $r8$lambda$1BGV-ZgbsS8cYKiFoqjjComOacI, reason: not valid java name */
    public static /* synthetic */ KSerializer m518$r8$lambda$1BGVZgbsS8cYKiFoqjjComOacI() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 29;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializer_init_$_anonymous_ = _init_$_anonymous_();
        int i4 = onWarmupCompleted + 45;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializer_init_$_anonymous_;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ AccountSource[] $values() {
        AccountSource[] accountSourceArr;
        int i = 2 % 2;
        int i2 = onExtraCallback + 49;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 != 0) {
            AccountSource accountSource = NONE;
            AccountSource accountSource2 = PREPAID;
            AccountSource accountSource3 = ASSET;
            AccountSource accountSource4 = DASHBOARD;
            accountSourceArr = new AccountSource[3];
            accountSourceArr[0] = accountSource;
            accountSourceArr[0] = accountSource2;
            accountSourceArr[2] = accountSource3;
            accountSourceArr[3] = accountSource4;
        } else {
            accountSourceArr = new AccountSource[]{NONE, PREPAID, ASSET, DASHBOARD};
        }
        int i4 = i3 + 121;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return accountSourceArr;
        }
        throw null;
    }

    public static EnumEntries<AccountSource> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 19;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        EnumEntries<AccountSource> enumEntries = $ENTRIES;
        int i5 = i3 + 47;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 75 / 0;
        }
        return enumEntries;
    }

    public static AccountSource valueOf(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 9;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        AccountSource accountSource = (AccountSource) Enum.valueOf(AccountSource.class, str);
        if (i3 == 0) {
            throw null;
        }
        int i4 = onExtraCallback + 91;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 32 / 0;
        }
        return accountSource;
    }

    public static AccountSource[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        AccountSource[] accountSourceArr = (AccountSource[]) $VALUES.clone();
        int i4 = onExtraCallback + 17;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return accountSourceArr;
        }
        throw null;
    }

    private AccountSource(String str, int i) {
    }

    private static final /* synthetic */ KSerializer _init_$_anonymous_() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 71;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("im.toss.features.home.core.model.account.AccountSource", values());
        int i4 = onWarmupCompleted + 51;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static final /* synthetic */ Lazy access$get$cachedSerializer$delegate$cp() {
        Lazy<KSerializer<Object>> lazy;
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 105;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            lazy = $cachedSerializer$delegate;
            int i4 = 1 / 0;
        } else {
            lazy = $cachedSerializer$delegate;
        }
        int i5 = i2 + 81;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return lazy;
    }

    static {
        AccountSource[] accountSourceArr$values = $values();
        $VALUES = accountSourceArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(accountSourceArr$values);
        Object obj = null;
        Companion = new Companion((DefaultConstructorMarker) null);
        $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new AccountSource$.ExternalSyntheticLambda0());
        int i = IAuthTabCallback + 121;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
