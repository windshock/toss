package im.toss.features.account_terminator.core.model;

import im.toss.features.account_terminator.core.model.AccountTerminateBreakTimeInfoDto$;
import im.toss.features.account_terminator.core.model.BreakTime$;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class AccountTerminateBreakTimeInfoDto {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final BreakTime dailyBreakTime;
    private final boolean isNeedAlarm;
    private final String message;
    private final BreakTime systemBreakTime;
    private final String title;

    static {
        Object obj = null;
        int i = onExtraCallbackWithResult + 45;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountTerminateBreakTimeInfoDto)) {
            int i2 = onExtraCallback + 65;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        AccountTerminateBreakTimeInfoDto accountTerminateBreakTimeInfoDto = (AccountTerminateBreakTimeInfoDto) obj;
        if (!Intrinsics.areEqual(this.dailyBreakTime, accountTerminateBreakTimeInfoDto.dailyBreakTime)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.systemBreakTime, accountTerminateBreakTimeInfoDto.systemBreakTime)) {
            int i4 = onNavigationEvent + 125;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.isNeedAlarm != accountTerminateBreakTimeInfoDto.isNeedAlarm) {
            int i6 = onNavigationEvent + 21;
            onExtraCallback = i6 % 128;
            return i6 % 2 != 0;
        }
        if (!(!Intrinsics.areEqual(this.title, accountTerminateBreakTimeInfoDto.title))) {
            return !(Intrinsics.areEqual(this.message, accountTerminateBreakTimeInfoDto.message) ^ true);
        }
        int i7 = onNavigationEvent + 97;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.dailyBreakTime.hashCode();
        BreakTime breakTime = this.systemBreakTime;
        if (breakTime == null) {
            iHashCode = 0;
        } else {
            iHashCode = breakTime.hashCode();
            int i2 = onExtraCallback + 57;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 % 4;
            }
        }
        int iHashCode3 = (((((((iHashCode2 * 31) + iHashCode) * 31) + Boolean.hashCode(this.isNeedAlarm)) * 31) + this.title.hashCode()) * 31) + this.message.hashCode();
        int i4 = onExtraCallback + 91;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode3;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AccountTerminateBreakTimeInfoDto(dailyBreakTime=" + this.dailyBreakTime + ", systemBreakTime=" + this.systemBreakTime + ", isNeedAlarm=" + this.isNeedAlarm + ", title=" + this.title + ", message=" + this.message + ")";
        int i2 = onExtraCallback + 111;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public /* synthetic */ AccountTerminateBreakTimeInfoDto(int i, BreakTime breakTime, BreakTime breakTime2, boolean z, String str, String str2, okycx okycxVar) {
        if (1 != (i & 1)) {
            int i2 = onNavigationEvent + 119;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 1, AccountTerminateBreakTimeInfoDto$.serializer.INSTANCE.getDescriptor());
        }
        this.dailyBreakTime = breakTime;
        Object obj = null;
        if ((i & 2) == 0) {
            this.systemBreakTime = null;
        } else {
            this.systemBreakTime = breakTime2;
        }
        int i4 = 2 % 2;
        if ((i & 4) == 0) {
            int i5 = onNavigationEvent + 87;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                this.isNeedAlarm = true;
            } else {
                this.isNeedAlarm = false;
            }
        } else {
            this.isNeedAlarm = z;
        }
        if ((i & 8) == 0) {
            int i6 = onExtraCallback + 91;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            this.title = "";
            if (i7 == 0) {
                int i8 = 69 / 0;
            }
        } else {
            this.title = str;
            int i9 = onExtraCallback + 1;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
        }
        int i11 = 2 % 2;
        if ((i & 16) != 0) {
            this.message = str2;
            int i12 = onExtraCallback + 23;
            onNavigationEvent = i12 % 128;
            if (i12 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        int i13 = onExtraCallback + 111;
        onNavigationEvent = i13 % 128;
        int i14 = i13 % 2;
        this.message = "";
        if (i14 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void IAuthTabCallback(AccountTerminateBreakTimeInfoDto accountTerminateBreakTimeInfoDto, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        BreakTime$.serializer serializerVar = BreakTime$.serializer.INSTANCE;
        vylVar.onNavigationEvent(serialDescriptor, 0, serializerVar, accountTerminateBreakTimeInfoDto.dailyBreakTime);
        if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            int i2 = onExtraCallback + 79;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                BreakTime breakTime = accountTerminateBreakTimeInfoDto.systemBreakTime;
                throw null;
            }
            if (accountTerminateBreakTimeInfoDto.systemBreakTime != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 1, serializerVar, accountTerminateBreakTimeInfoDto.systemBreakTime);
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
            int i3 = onExtraCallback + 11;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            if (accountTerminateBreakTimeInfoDto.isNeedAlarm) {
                vylVar.onNavigationEvent(serialDescriptor, 2, accountTerminateBreakTimeInfoDto.isNeedAlarm);
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 3) || !Intrinsics.areEqual(accountTerminateBreakTimeInfoDto.title, "")) {
            vylVar.onExtraCallback(serialDescriptor, 3, accountTerminateBreakTimeInfoDto.title);
            int i5 = onExtraCallback + 85;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 4)) {
            int i7 = onExtraCallback + 29;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            if (Intrinsics.areEqual(accountTerminateBreakTimeInfoDto.message, "")) {
                return;
            }
        }
        vylVar.onExtraCallback(serialDescriptor, 4, accountTerminateBreakTimeInfoDto.message);
    }

    public final BreakTime onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 91;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        BreakTime breakTime = this.dailyBreakTime;
        int i4 = i3 + 49;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 4 / 0;
        }
        return breakTime;
    }

    public final BreakTime onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 91;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        BreakTime breakTime = this.systemBreakTime;
        int i5 = i2 + 67;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return breakTime;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 49;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.title;
        }
        throw null;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 113;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.message;
        }
        throw null;
    }
}
