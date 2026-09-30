package im.toss.securities.libs.performance.tracker.data.model;

import im.toss.securities.libs.performance.tracker.data.model.DeviceOption$;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class DeviceOption {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final String deviceId;
    private final String deviceModel;
    private final String os;
    private final String osVersion;

    static {
        int i = onNavigationEvent + 87;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            int i2 = 43 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r6 instanceof im.toss.securities.libs.performance.tracker.data.model.DeviceOption) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r2 = r2 + 91;
        im.toss.securities.libs.performance.tracker.data.model.DeviceOption.onExtraCallback = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        if ((r2 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        r6 = 6 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
    
        r6 = (im.toss.securities.libs.performance.tracker.data.model.DeviceOption) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.os, r6.os) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003e, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.deviceId, r6.deviceId) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.deviceModel, r6.deviceModel) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        r6 = im.toss.securities.libs.performance.tracker.data.model.DeviceOption.IAuthTabCallback + 63;
        im.toss.securities.libs.performance.tracker.data.model.DeviceOption.onExtraCallback = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.osVersion, r6.osVersion) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 == 0) {
            int i4 = 14 / 0;
        }
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 117;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((this.os.hashCode() * 31) + this.deviceId.hashCode()) * 31) + this.deviceModel.hashCode()) * 31) + this.osVersion.hashCode();
        int i4 = IAuthTabCallback + 107;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DeviceOption(os=" + this.os + ", deviceId=" + this.deviceId + ", deviceModel=" + this.deviceModel + ", osVersion=" + this.osVersion + ")";
        int i2 = IAuthTabCallback + 47;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<DeviceOption> serializer() {
            DeviceOption$.serializer serializerVar;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 83;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                serializerVar = DeviceOption$.serializer.INSTANCE;
                int i3 = 61 / 0;
            } else {
                serializerVar = DeviceOption$.serializer.INSTANCE;
            }
            int i4 = onExtraCallbackWithResult + 73;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return serializerVar;
            }
            throw null;
        }
    }

    public /* synthetic */ DeviceOption(int i, String str, String str2, String str3, String str4, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i2 = 15;
        if (15 != (i & 15)) {
            int i3 = IAuthTabCallback + 57;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                descriptor = DeviceOption$.serializer.INSTANCE.getDescriptor();
                i2 = 119;
            } else {
                descriptor = DeviceOption$.serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i, i2, descriptor);
            int i4 = IAuthTabCallback + 23;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.os = str;
        this.deviceId = str2;
        this.deviceModel = str3;
        this.osVersion = str4;
    }

    public DeviceOption(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.os = str;
        this.deviceId = str2;
        this.deviceModel = str3;
        this.osVersion = str4;
    }

    @JvmStatic
    public static final /* synthetic */ void onWarmupCompleted(DeviceOption deviceOption, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 69;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, deviceOption.os);
        vylVar.onExtraCallback(serialDescriptor, 1, deviceOption.deviceId);
        vylVar.onExtraCallback(serialDescriptor, 2, deviceOption.deviceModel);
        vylVar.onExtraCallback(serialDescriptor, 3, deviceOption.osVersion);
        int i4 = onExtraCallback + 69;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }
}
