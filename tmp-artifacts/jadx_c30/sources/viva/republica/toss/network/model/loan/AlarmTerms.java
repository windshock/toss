package viva.republica.toss.network.model.loan;

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
public final class AlarmTerms {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted = 1;
    private final String contentUrl;
    private final boolean necessary;
    private final long termsId;
    private final String title;

    static {
        int i = onExtraCallback + 81;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public AlarmTerms() {
        this(false, (String) null, 0L, (String) null, 15, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback + 79;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof AlarmTerms)) {
            int i4 = IAuthTabCallback + 23;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return false;
            }
            throw null;
        }
        AlarmTerms alarmTerms = (AlarmTerms) obj;
        if (this.necessary != alarmTerms.necessary) {
            return false;
        }
        if (Intrinsics.areEqual(this.title, alarmTerms.title)) {
            return this.termsId == alarmTerms.termsId && Intrinsics.areEqual(this.contentUrl, alarmTerms.contentUrl);
        }
        int i5 = IAuthTabCallback + 85;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((Boolean.hashCode(this.necessary) * 31) + this.title.hashCode()) * 31) + Long.hashCode(this.termsId)) * 31) + this.contentUrl.hashCode();
        int i4 = IAuthTabCallback + 45;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AlarmTerms(necessary=" + this.necessary + ", title=" + this.title + ", termsId=" + this.termsId + ", contentUrl=" + this.contentUrl + ")";
        int i2 = onWarmupCompleted + 75;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AlarmTerms> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 45;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            AlarmTerms$$serializer alarmTerms$$serializer = AlarmTerms$$serializer.INSTANCE;
            if (i3 != 0) {
                return alarmTerms$$serializer;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public /* synthetic */ AlarmTerms(int i, boolean z, String str, long j, String str2, okycx okycxVar) {
        this.necessary = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            int i2 = IAuthTabCallback;
            int i3 = i2 + 3;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            this.title = BuildConfig.FLAVOR;
            int i5 = i2 + 55;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
        } else {
            this.title = str;
        }
        if ((i & 4) == 0) {
            this.termsId = -1L;
        } else {
            this.termsId = j;
            int i7 = 2 % 2;
        }
        if ((i & 8) != 0) {
            this.contentUrl = str2;
            return;
        }
        int i8 = onWarmupCompleted + 47;
        IAuthTabCallback = i8 % 128;
        int i9 = i8 % 2;
        this.contentUrl = BuildConfig.FLAVOR;
    }

    public AlarmTerms(boolean z, @NotNull String str, long j, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
        this.necessary = z;
        this.title = str;
        this.termsId = j;
        this.contentUrl = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void IAuthTabCallback(AlarmTerms alarmTerms, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0) || alarmTerms.necessary) {
            vylVar.onNavigationEvent(serialDescriptor, 0, alarmTerms.necessary);
        }
        Object obj = null;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            int i2 = IAuthTabCallback + 1;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.areEqual(alarmTerms.title, BuildConfig.FLAVOR);
                throw null;
            }
            if (!Intrinsics.areEqual(alarmTerms.title, BuildConfig.FLAVOR)) {
                vylVar.onExtraCallback(serialDescriptor, 1, alarmTerms.title);
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
            int i3 = onWarmupCompleted + 75;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                long j = alarmTerms.termsId;
                throw null;
            }
            if (alarmTerms.termsId != -1) {
                vylVar.onExtraCallback(serialDescriptor, 2, alarmTerms.termsId);
            }
        }
        if (!(!vylVar.onWarmupCompleted(serialDescriptor, 3)) || !Intrinsics.areEqual(alarmTerms.contentUrl, BuildConfig.FLAVOR)) {
            vylVar.onExtraCallback(serialDescriptor, 3, alarmTerms.contentUrl);
            int i4 = IAuthTabCallback + 43;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 5 % 3;
            }
        }
        int i6 = onWarmupCompleted + 31;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AlarmTerms(boolean z, String str, long j, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str3;
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallback + 13;
            onWarmupCompleted = i2 % 128;
            z = i2 % 2 == 0;
        }
        int i3 = i & 2;
        String str4 = BuildConfig.FLAVOR;
        if (i3 != 0) {
            int i4 = onWarmupCompleted + 101;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            str3 = BuildConfig.FLAVOR;
        } else {
            str3 = str;
        }
        if ((i & 4) != 0) {
            int i5 = IAuthTabCallback + 119;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
            int i6 = 2 % 2;
            j = -1;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            int i7 = 2 % 2;
        } else {
            str4 = str2;
        }
        this(z, str3, j2, str4);
    }
}
