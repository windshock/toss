package viva.republica.toss.network.model.verify;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import net.sf.scuba.smartcards.BuildConfig;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class SessionUnknownType implements SessionType {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted = 1;
    private final String name;

    static {
        int i = onExtraCallbackWithResult + 17;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 115;
            onWarmupCompleted = i2 % 128;
            return i2 % 2 != 0;
        }
        if (obj instanceof SessionUnknownType) {
            return Intrinsics.areEqual(this.name, ((SessionUnknownType) obj).name);
        }
        int i3 = onWarmupCompleted;
        int i4 = i3 + 67;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 79;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 94 / 0;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 101;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.name.hashCode();
        int i4 = onExtraCallback + 99;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SessionUnknownType(name=" + this.name + ")";
        int i2 = onWarmupCompleted + 89;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 67 / 0;
        }
        return str;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SessionUnknownType> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 109;
            onExtraCallbackWithResult = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                SessionUnknownType$$serializer sessionUnknownType$$serializer = SessionUnknownType$$serializer.INSTANCE;
                obj.hashCode();
                throw null;
            }
            SessionUnknownType$$serializer sessionUnknownType$$serializer2 = SessionUnknownType$$serializer.INSTANCE;
            int i3 = onExtraCallbackWithResult + 105;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return sessionUnknownType$$serializer2;
            }
            obj.hashCode();
            throw null;
        }
    }

    public /* synthetic */ SessionUnknownType(int i, String str, okycx okycxVar) {
        if (1 != (i & 1)) {
            int i2 = onExtraCallback + 3;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 1, SessionUnknownType$$serializer.INSTANCE.getDescriptor());
            int i4 = onWarmupCompleted + 77;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.name = str;
    }

    public SessionUnknownType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        this.name = str;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallbackWithResult(SessionUnknownType sessionUnknownType, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        onExtraCallback = i2 % 128;
        vylVar.onExtraCallback(serialDescriptor, i2 % 2 != 0 ? 1 : 0, sessionUnknownType.getName());
        int i3 = onExtraCallback + 59;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
    }

    public String getName() {
        String str;
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 == 0) {
            str = this.name;
            int i4 = 88 / 0;
        } else {
            str = this.name;
        }
        int i5 = i3 + 27;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 14 / 0;
        }
        return str;
    }
}
