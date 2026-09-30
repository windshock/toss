package viva.republica.toss.network.model.bank;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import net.sf.scuba.smartcards.BuildConfig;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class TossBankCurrency {
    public static final Companion Companion;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted = 1;
    private final String currency;
    private final String korName;

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        int i = onExtraCallback + 99;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TossBankCurrency() {
        String str = null;
        this(str, str, 3, (DefaultConstructorMarker) str);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback + 123;
            onWarmupCompleted = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(obj instanceof TossBankCurrency)) {
            int i3 = IAuthTabCallback + 117;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        TossBankCurrency tossBankCurrency = (TossBankCurrency) obj;
        if (!Intrinsics.areEqual(this.currency, tossBankCurrency.currency)) {
            int i5 = onWarmupCompleted + 91;
            IAuthTabCallback = i5 % 128;
            return i5 % 2 != 0;
        }
        if (Intrinsics.areEqual(this.korName, tossBankCurrency.korName)) {
            return true;
        }
        int i6 = IAuthTabCallback + 17;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 75;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.currency.hashCode() * 31) + this.korName.hashCode();
        int i4 = IAuthTabCallback + 81;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 38 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TossBankCurrency(currency=" + this.currency + ", korName=" + this.korName + ")";
        int i2 = onWarmupCompleted + 121;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TossBankCurrency> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 113;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            TossBankCurrency$$serializer tossBankCurrency$$serializer = TossBankCurrency$$serializer.INSTANCE;
            int i4 = IAuthTabCallback + 97;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return tossBankCurrency$$serializer;
        }
    }

    public /* synthetic */ TossBankCurrency(int i, String str, String str2, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.currency = BuildConfig.FLAVOR;
            int i2 = onWarmupCompleted + 61;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
        } else {
            this.currency = str;
        }
        int i4 = 2 % 2;
        if ((i & 2) != 0) {
            this.korName = str2;
            return;
        }
        int i5 = IAuthTabCallback + 15;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        this.korName = BuildConfig.FLAVOR;
        if (i6 == 0) {
            int i7 = 52 / 0;
        }
    }

    public TossBankCurrency(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
        this.currency = str;
        this.korName = str2;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallbackWithResult(TossBankCurrency tossBankCurrency, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0) || !Intrinsics.areEqual(tossBankCurrency.currency, BuildConfig.FLAVOR)) {
            vylVar.onExtraCallback(serialDescriptor, 0, tossBankCurrency.currency);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            int i4 = IAuthTabCallback + 89;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            if (!(!Intrinsics.areEqual(tossBankCurrency.korName, BuildConfig.FLAVOR))) {
                return;
            }
        }
        vylVar.onExtraCallback(serialDescriptor, 1, tossBankCurrency.korName);
        int i6 = onWarmupCompleted + 97;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TossBankCurrency(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onWarmupCompleted + 79;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            str = BuildConfig.FLAVOR;
        }
        if ((i & 2) != 0) {
            int i4 = IAuthTabCallback + 3;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
            str2 = BuildConfig.FLAVOR;
        }
        this(str, str2);
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 35;
        onWarmupCompleted = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.currency;
        int i4 = i2 + 75;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 97;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.korName;
        int i5 = i3 + 59;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
