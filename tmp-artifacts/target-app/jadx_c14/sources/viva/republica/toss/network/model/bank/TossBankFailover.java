package viva.republica.toss.network.model.bank;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.bank.TossBankFailover$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class TossBankFailover {
    public static final Companion Companion;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final String landingAppScheme;

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        int i = onExtraCallback + 107;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TossBankFailover)) {
            int i2 = onExtraCallbackWithResult + 119;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.landingAppScheme, ((TossBankFailover) obj).landingAppScheme)) {
            return true;
        }
        int i4 = onExtraCallbackWithResult + 59;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 27;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.landingAppScheme.hashCode();
        int i4 = onExtraCallbackWithResult + 123;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TossBankFailover(landingAppScheme=" + this.landingAppScheme + ")";
        int i2 = onNavigationEvent + 71;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
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

        public final KSerializer<TossBankFailover> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 99;
            IAuthTabCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                TossBankFailover$.serializer serializerVar = TossBankFailover$.serializer.INSTANCE;
                throw null;
            }
            TossBankFailover$.serializer serializerVar2 = TossBankFailover$.serializer.INSTANCE;
            int i3 = IAuthTabCallback + 91;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                return serializerVar2;
            }
            obj.hashCode();
            throw null;
        }
    }

    public /* synthetic */ TossBankFailover(int i, String str, okycx okycxVar) {
        if (1 != (i & 1)) {
            int i2 = onExtraCallbackWithResult + 17;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 1, TossBankFailover$.serializer.INSTANCE.getDescriptor());
            int i4 = onNavigationEvent + 23;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.landingAppScheme = str;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallbackWithResult(TossBankFailover tossBankFailover, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 67;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, tossBankFailover.landingAppScheme);
        int i4 = onNavigationEvent + 93;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 77;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String str = this.landingAppScheme;
        if (i3 == 0) {
            int i4 = 32 / 0;
        }
        return str;
    }
}
