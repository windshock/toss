package im.toss.features.home.core.remote.model.consumption.regular;

import im.toss.features.home.core.remote.model.consumption.regular.RegularExpenseUpdateReq$;
import im.toss.features.home.core.remote.model.consumption.regular.RegularExpenseUpdateReq$Command$;
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
import o.htf31;
import o.liq;
import o.okycx;
import o.py;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class RegularExpenseUpdateReq {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final List<Command> commands;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new RegularExpenseUpdateReq$.ExternalSyntheticLambda0())};

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        KSerializer kSerializerOnExtraCallback = onExtraCallback();
        int i3 = IAuthTabCallback + 7;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerOnExtraCallback;
    }

    private static final /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(RegularExpenseUpdateReq$Command$.serializer.INSTANCE);
        int i2 = IAuthTabCallback + 75;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return checkcanopenlandingpage;
        }
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegularExpenseUpdateReq)) {
            int i2 = onNavigationEvent + 79;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return false;
            }
            throw null;
        }
        if (Intrinsics.areEqual(this.commands, ((RegularExpenseUpdateReq) obj).commands)) {
            return true;
        }
        int i3 = onNavigationEvent + 33;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 109;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.commands.hashCode();
        if (i3 == 0) {
            int i4 = 32 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RegularExpenseUpdateReq(commands=" + this.commands + ")";
        int i2 = IAuthTabCallback + 31;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    static {
        int i = onExtraCallbackWithResult + 23;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ RegularExpenseUpdateReq(int i, List list, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i2 = 1;
        if (1 != (i & 1)) {
            int i3 = onNavigationEvent + 15;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                descriptor = RegularExpenseUpdateReq$.serializer.INSTANCE.getDescriptor();
                i2 = 0;
            } else {
                descriptor = RegularExpenseUpdateReq$.serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i, i2, descriptor);
            int i4 = onNavigationEvent + 71;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.commands = list;
    }

    public RegularExpenseUpdateReq(@NotNull List<Command> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.commands = list;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallback(RegularExpenseUpdateReq regularExpenseUpdateReq, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 55;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onNavigationEvent(serialDescriptor, 0, (py) $childSerializers[0].getValue(), regularExpenseUpdateReq.commands);
        int i4 = IAuthTabCallback + 97;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ Lazy[] onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 31;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return $childSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
