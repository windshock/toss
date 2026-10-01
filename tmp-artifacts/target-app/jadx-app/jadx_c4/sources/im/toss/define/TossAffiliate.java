package im.toss.define;

import android.graphics.Color;
import android.os.Process;
import android.view.ViewConfiguration;
import java.lang.reflect.Constructor;
import java.util.Locale;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.access15300;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class TossAffiliate {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TossAffiliate[] $VALUES;
    public static final Object Companion;
    public static final String EXTRA_KEY = "__TossAffiliate__";
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final String lowerCaseName;
    public static final TossAffiliate CORE = new TossAffiliate("CORE", 0);
    public static final TossAffiliate CX = new TossAffiliate("CX", 1);
    public static final TossAffiliate BANK = new TossAffiliate("BANK", 2);
    public static final TossAffiliate PAYMENTS = new TossAffiliate("PAYMENTS", 3);
    public static final TossAffiliate INSURANCE = new TossAffiliate("INSURANCE", 4);
    public static final TossAffiliate PLACE = new TossAffiliate("PLACE", 5);
    public static final TossAffiliate MOBILE = new TossAffiliate("MOBILE", 6);
    public static final TossAffiliate SECURITIES = new TossAffiliate("SECURITIES", 7);
    public static final TossAffiliate INCOME = new TossAffiliate("INCOME", 8);

    private static final /* synthetic */ TossAffiliate[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 107;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        TossAffiliate[] tossAffiliateArr = {CORE, CX, BANK, PAYMENTS, INSURANCE, PLACE, MOBILE, SECURITIES, INCOME};
        int i5 = i3 + 95;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return tossAffiliateArr;
    }

    public static EnumEntries<TossAffiliate> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 57;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return $ENTRIES;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static TossAffiliate valueOf(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 99;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        TossAffiliate tossAffiliate = (TossAffiliate) Enum.valueOf(TossAffiliate.class, str);
        int i4 = IAuthTabCallback + 67;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return tossAffiliate;
        }
        throw null;
    }

    public static TossAffiliate[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 55;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        TossAffiliate[] tossAffiliateArr = (TossAffiliate[]) $VALUES.clone();
        int i4 = onExtraCallbackWithResult + 103;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return tossAffiliateArr;
    }

    private TossAffiliate(String str, int i) {
        String lowerCase = name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        this.lowerCaseName = lowerCase;
    }

    static {
        TossAffiliate[] tossAffiliateArr$values = $values();
        $VALUES = tossAffiliateArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(tossAffiliateArr$values);
        try {
            Object[] objArr = {null};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(242913029);
            Companion = ((Constructor) (objOnExtraCallback == null ? BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myPid() >> 22), (ViewConfiguration.getJumpTapTimeout() >> 16) + 45, Color.blue(0) + 7049, 1060794773, false, (String) null, new Class[]{DefaultConstructorMarker.class}) : objOnExtraCallback)).newInstance(objArr);
            int i = onExtraCallback + 35;
            onWarmupCompleted = i % 128;
            int i2 = i % 2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public final boolean isCore() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 103;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this != CORE) {
            return false;
        }
        int i4 = i2 + 31;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    public final boolean isBank() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 99;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        if (this != BANK) {
            return false;
        }
        int i5 = i2 + 1;
        onExtraCallbackWithResult = i5 % 128;
        return !(i5 % 2 == 0);
    }

    public final boolean isSecurities() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 11;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        if (this != SECURITIES) {
            return false;
        }
        int i5 = i3 + 13;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public final String getLowerCaseName() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 41;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.lowerCaseName;
        int i5 = i2 + 63;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
