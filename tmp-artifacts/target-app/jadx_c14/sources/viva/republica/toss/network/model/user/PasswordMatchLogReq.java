package viva.republica.toss.network.model.user;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonObject;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkCanOpenLandingPage;
import o.encryptType4;
import o.htf31;
import o.liq;
import o.okycx;
import o.py;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.user.PasswordMatchLogReq$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PasswordMatchLogReq {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private final String deviceId;
    private final List<JsonObject> logs;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.user.PasswordMatchLogReq$$ExternalSyntheticLambda0
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 3;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return PasswordMatchLogReq.IAuthTabCallback();
            }
            PasswordMatchLogReq.IAuthTabCallback();
            throw null;
        }
    })};

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 13;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallback = onExtraCallback();
        int i4 = onExtraCallback + 69;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnExtraCallback;
    }

    private static final /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(encryptType4.IAuthTabCallback);
        int i2 = onNavigationEvent + 93;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 19;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PasswordMatchLogReq)) {
            return false;
        }
        if (Intrinsics.areEqual(this.deviceId, ((PasswordMatchLogReq) obj).deviceId)) {
            if (!(!Intrinsics.areEqual(this.logs, r6.logs))) {
                return true;
            }
            int i4 = onExtraCallback + 11;
            onNavigationEvent = i4 % 128;
            return i4 % 2 != 0;
        }
        int i5 = onExtraCallback;
        int i6 = i5 + 119;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        int i8 = i5 + 97;
        onNavigationEvent = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 117;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.deviceId.hashCode();
        return i3 != 0 ? (iHashCode / 5) << this.logs.hashCode() : (iHashCode * 31) + this.logs.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PasswordMatchLogReq(deviceId=" + this.deviceId + ", logs=" + this.logs + ")";
        int i2 = onNavigationEvent + 91;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PasswordMatchLogReq> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 23;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            PasswordMatchLogReq$.serializer serializerVar = PasswordMatchLogReq$.serializer.INSTANCE;
            int i4 = onExtraCallback + 85;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 97 / 0;
            }
            return serializerVar;
        }
    }

    static {
        int i = onExtraCallbackWithResult + 11;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ PasswordMatchLogReq(int i, String str, List list, okycx okycxVar) {
        if (3 != (i & 3)) {
            int i2 = onExtraCallback + 109;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 3, PasswordMatchLogReq$.serializer.INSTANCE.getDescriptor());
            int i4 = onExtraCallback + 77;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
        }
        this.deviceId = str;
        this.logs = list;
    }

    public PasswordMatchLogReq(@NotNull String str, @NotNull List<JsonObject> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.deviceId = str;
        this.logs = list;
    }

    public static final /* synthetic */ Lazy[] onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i3 + 103;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return lazyArr;
    }

    @JvmStatic
    public static final /* synthetic */ void onWarmupCompleted(PasswordMatchLogReq passwordMatchLogReq, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 61;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        vylVar.onExtraCallback(serialDescriptor, 0, passwordMatchLogReq.deviceId);
        vylVar.onNavigationEvent(serialDescriptor, 1, (py) lazyArr[1].getValue(), passwordMatchLogReq.logs);
        int i4 = onExtraCallback + 41;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }
}
