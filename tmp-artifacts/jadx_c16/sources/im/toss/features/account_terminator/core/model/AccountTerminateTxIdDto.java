package im.toss.features.account_terminator.core.model;

import im.toss.features.account_terminator.core.model.AccountTerminateTxIdDto$;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class AccountTerminateTxIdDto {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final String terminateTxId;

    static {
        int i = onNavigationEvent + 63;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if ((r7 instanceof im.toss.features.account_terminator.core.model.AccountTerminateTxIdDto) == true) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        r2 = r2 + 107;
        im.toss.features.account_terminator.core.model.AccountTerminateTxIdDto.onExtraCallback = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        if ((r2 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r6.terminateTxId, ((im.toss.features.account_terminator.core.model.AccountTerminateTxIdDto) r7).terminateTxId) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:
    
        r7 = im.toss.features.account_terminator.core.model.AccountTerminateTxIdDto.onWarmupCompleted + 87;
        im.toss.features.account_terminator.core.model.AccountTerminateTxIdDto.onExtraCallback = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        if ((r7 % 2) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 33;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 != 0) {
            int i4 = 78 / 0;
        }
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.terminateTxId.hashCode();
        int i4 = onWarmupCompleted + 89;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AccountTerminateTxIdDto(terminateTxId=" + this.terminateTxId + ")";
        int i2 = onWarmupCompleted + 125;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 23 / 0;
        }
        return str;
    }

    public /* synthetic */ AccountTerminateTxIdDto(int i, String str, okycx okycxVar) {
        if (1 != (i & 1)) {
            int i2 = onWarmupCompleted + 61;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 1, AccountTerminateTxIdDto$.serializer.INSTANCE.getDescriptor());
            int i4 = onWarmupCompleted + 55;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 5;
            } else {
                int i6 = 2 % 2;
            }
        }
        this.terminateTxId = str;
    }

    @JvmStatic
    public static final /* synthetic */ void onNavigationEvent(AccountTerminateTxIdDto accountTerminateTxIdDto, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 51;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, accountTerminateTxIdDto.terminateTxId);
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 15;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.terminateTxId;
        }
        throw null;
    }
}
