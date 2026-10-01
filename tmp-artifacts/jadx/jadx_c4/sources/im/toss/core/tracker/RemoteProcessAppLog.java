package im.toss.core.tracker;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RemoteProcessAppLog {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onWarmupCompleted;
    private final String company;
    private final String level;
    private final String message;
    private final String service;
    private final String tag;

    static {
        int i = onWarmupCompleted + 69;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 19 / 0;
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallbackWithResult + 17;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof RemoteProcessAppLog)) {
            return false;
        }
        RemoteProcessAppLog remoteProcessAppLog = (RemoteProcessAppLog) obj;
        if (!Intrinsics.areEqual(this.level, remoteProcessAppLog.level)) {
            int i4 = onExtraCallbackWithResult + 59;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.tag, remoteProcessAppLog.tag)) {
            int i6 = IAuthTabCallback + 89;
            onExtraCallbackWithResult = i6 % 128;
            return i6 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.message, remoteProcessAppLog.message) || !Intrinsics.areEqual(this.service, remoteProcessAppLog.service)) {
            return false;
        }
        if (Intrinsics.areEqual(this.company, remoteProcessAppLog.company)) {
            return true;
        }
        int i7 = onExtraCallbackWithResult + 73;
        IAuthTabCallback = i7 % 128;
        return i7 % 2 == 0;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 83;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode4 = this.level.hashCode();
        String str = this.tag;
        int iHashCode5 = 0;
        if (str == null) {
            int i4 = onExtraCallbackWithResult + 17;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.message;
        if (str2 == null) {
            int i6 = IAuthTabCallback;
            int i7 = i6 + 69;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            int i9 = i6 + 35;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        String str3 = this.service;
        if (str3 == null) {
            int i11 = onExtraCallbackWithResult + 87;
            IAuthTabCallback = i11 % 128;
            iHashCode3 = i11 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode3 = str3.hashCode();
        }
        String str4 = this.company;
        if (str4 != null) {
            int i12 = IAuthTabCallback + 47;
            onExtraCallbackWithResult = i12 % 128;
            int i13 = i12 % 2;
            iHashCode5 = str4.hashCode();
        }
        return (((((((iHashCode4 * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode5;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RemoteProcessAppLog(level=" + this.level + ", tag=" + this.tag + ", message=" + this.message + ", service=" + this.service + ", company=" + this.company + ")";
        int i2 = onExtraCallbackWithResult + 73;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<RemoteProcessAppLog> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 65;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            RemoteProcessAppLog$$serializer remoteProcessAppLog$$serializer = RemoteProcessAppLog$$serializer.INSTANCE;
            if (i3 != 0) {
                int i4 = 3 / 0;
            }
            return remoteProcessAppLog$$serializer;
        }
    }

    public /* synthetic */ RemoteProcessAppLog(int i, String str, String str2, String str3, String str4, String str5, okycx okycxVar) {
        if (1 != (i & 1)) {
            htf31.onExtraCallbackWithResult(i, 1, RemoteProcessAppLog$$serializer.INSTANCE.getDescriptor());
            int i2 = IAuthTabCallback + 63;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        this.level = str;
        Object obj = null;
        if ((i & 2) == 0) {
            this.tag = null;
        } else {
            this.tag = str2;
            int i5 = onExtraCallbackWithResult + 45;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 / 2;
            } else {
                int i7 = 2 % 2;
            }
        }
        if ((i & 4) == 0) {
            int i8 = IAuthTabCallback + 93;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            this.message = null;
            if (i9 != 0) {
                obj.hashCode();
                throw null;
            }
        } else {
            this.message = str3;
        }
        if ((i & 8) == 0) {
            this.service = null;
        } else {
            this.service = str4;
        }
        if ((i & 16) == 0) {
            this.company = null;
            return;
        }
        this.company = str5;
        int i10 = onExtraCallbackWithResult + 85;
        IAuthTabCallback = i10 % 128;
        int i11 = i10 % 2;
    }

    public RemoteProcessAppLog(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        this.level = str;
        this.tag = str2;
        this.message = str3;
        this.service = str4;
        this.company = str5;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void IAuthTabCallback(RemoteProcessAppLog remoteProcessAppLog, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            vylVar.onExtraCallback(serialDescriptor, 0, remoteProcessAppLog.level);
            if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
                int i3 = onExtraCallbackWithResult + 41;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    String str = remoteProcessAppLog.tag;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (remoteProcessAppLog.tag != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, remoteProcessAppLog.tag);
                    int i4 = onExtraCallbackWithResult + 123;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                }
            }
        } else {
            vylVar.onExtraCallback(serialDescriptor, 0, remoteProcessAppLog.level);
            if (vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 2) || remoteProcessAppLog.message != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, remoteProcessAppLog.message);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 3) || remoteProcessAppLog.service != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, remoteProcessAppLog.service);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 4)) {
            int i6 = onExtraCallbackWithResult + 55;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            String str2 = remoteProcessAppLog.company;
            if (i7 == 0) {
                int i8 = 66 / 0;
                if (str2 == null) {
                    return;
                }
            } else if (str2 == null) {
                return;
            }
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, remoteProcessAppLog.company);
    }

    public final String onWarmupCompleted() {
        String str;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 83;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.level;
            int i4 = 79 / 0;
        } else {
            str = this.level;
        }
        int i5 = i2 + 5;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 87;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.tag;
        int i5 = i3 + 41;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 88 / 0;
        }
        return str;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 123;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.message;
        int i5 = i2 + 89;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 93;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.service;
        int i5 = i3 + 27;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 17 / 0;
        }
        return str;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 15;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.company;
        int i5 = i2 + 103;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
