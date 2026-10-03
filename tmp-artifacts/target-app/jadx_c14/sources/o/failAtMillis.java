package o;

import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class failAtMillis {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    private final List<createRewardedInterstitialAd> accounts;
    private final int cursor;
    private final String debugMode;
    private final boolean forceNewSession;
    private final Map<String, Object> formValues;
    private final String referrer;
    private final String sessionId;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 121;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof failAtMillis)) {
            return false;
        }
        failAtMillis failatmillis = (failAtMillis) obj;
        if (this.cursor != failatmillis.cursor) {
            int i5 = i3 + 7;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (!Intrinsics.areEqual(this.formValues, failatmillis.formValues) || !Intrinsics.areEqual(this.accounts, failatmillis.accounts)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.debugMode, failatmillis.debugMode)) {
            int i6 = IAuthTabCallback + 55;
            onNavigationEvent = i6 % 128;
            return i6 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.sessionId, failatmillis.sessionId) || this.forceNewSession != failatmillis.forceNewSession) {
            return false;
        }
        if (Intrinsics.areEqual(this.referrer, failatmillis.referrer)) {
            return true;
        }
        int i7 = onNavigationEvent + 43;
        IAuthTabCallback = i7 % 128;
        return i7 % 2 != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r11 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.failAtMillis.onNavigationEvent
            int r1 = r1 + 47
            int r2 = r1 % 128
            o.failAtMillis.IAuthTabCallback = r2
            int r1 = r1 % r0
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2a
            int r1 = r11.cursor
            int r1 = java.lang.Integer.hashCode(r1)
            java.util.Map<java.lang.String, java.lang.Object> r4 = r11.formValues
            int r4 = r4.hashCode()
            java.util.List<o.createRewardedInterstitialAd> r5 = r11.accounts
            int r5 = r5.hashCode()
            java.lang.String r6 = r11.debugMode
            if (r6 != 0) goto L28
            r6 = r2
            goto L41
        L28:
            r7 = r2
            goto L51
        L2a:
            int r1 = r11.cursor
            int r1 = java.lang.Integer.hashCode(r1)
            java.util.Map<java.lang.String, java.lang.Object> r4 = r11.formValues
            int r4 = r4.hashCode()
            java.util.List<o.createRewardedInterstitialAd> r5 = r11.accounts
            int r5 = r5.hashCode()
            java.lang.String r6 = r11.debugMode
            if (r6 != 0) goto L50
            r6 = r3
        L41:
            int r7 = o.failAtMillis.onNavigationEvent
            int r7 = r7 + 47
            int r8 = r7 % 128
            o.failAtMillis.IAuthTabCallback = r8
            int r7 = r7 % r0
            if (r7 == 0) goto L4e
            r7 = r2
            goto L58
        L4e:
            r7 = r3
            goto L58
        L50:
            r7 = r3
        L51:
            int r6 = r6.hashCode()
            r10 = r7
            r7 = r6
            r6 = r10
        L58:
            java.lang.String r8 = r11.sessionId
            if (r8 != 0) goto L6a
            int r8 = o.failAtMillis.IAuthTabCallback
            int r8 = r8 + 69
            int r9 = r8 % 128
            o.failAtMillis.onNavigationEvent = r9
            int r8 = r8 % r0
            if (r8 != 0) goto L68
            goto L6e
        L68:
            r2 = r3
            goto L6e
        L6a:
            int r2 = r8.hashCode()
        L6e:
            boolean r0 = r11.forceNewSession
            int r0 = java.lang.Boolean.hashCode(r0)
            java.lang.String r3 = r11.referrer
            if (r3 == 0) goto L7c
            int r6 = r3.hashCode()
        L7c:
            int r1 = r1 * 31
            int r1 = r1 + r4
            int r1 = r1 * 31
            int r1 = r1 + r5
            int r1 = r1 * 31
            int r1 = r1 + r7
            int r1 = r1 * 31
            int r1 = r1 + r2
            int r1 = r1 * 31
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r1 = r1 + r6
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.failAtMillis.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CreditCardIssueFunnelRequest(cursor=" + this.cursor + ", formValues=" + this.formValues + ", accounts=" + this.accounts + ", debugMode=" + this.debugMode + ", sessionId=" + this.sessionId + ", forceNewSession=" + this.forceNewSession + ", referrer=" + this.referrer + ")";
        int i2 = IAuthTabCallback + 59;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public failAtMillis(int i, @NotNull Map<String, ? extends Object> map, @NotNull List<createRewardedInterstitialAd> list, @Nullable String str, @Nullable String str2, boolean z, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.cursor = i;
        this.formValues = map;
        this.accounts = list;
        this.debugMode = str;
        this.sessionId = str2;
        this.forceNewSession = z;
        this.referrer = str3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ failAtMillis(int i, Map map, List list, String str, String str2, boolean z, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        String str4;
        String str5;
        Map mapOnNavigationEvent = (i2 & 2) != 0 ? access8100.onNavigationEvent() : map;
        List listEmptyList = (i2 & 4) != 0 ? CollectionsKt.emptyList() : list;
        String str6 = null;
        if ((i2 & 8) != 0) {
            int i3 = IAuthTabCallback + 43;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            int i4 = 2 % 2;
            str4 = null;
        } else {
            str4 = str;
        }
        if ((i2 & 16) != 0) {
            int i5 = IAuthTabCallback + 41;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 4 / 0;
            }
            str5 = null;
        } else {
            str5 = str2;
        }
        boolean z2 = (i2 & 32) == 0 ? z : false;
        if ((i2 & 64) != 0) {
            int i7 = onNavigationEvent + 79;
            IAuthTabCallback = i7 % 128;
            if (i7 % 2 != 0) {
                str6.hashCode();
                throw null;
            }
            int i8 = 2 % 2;
        } else {
            str6 = str3;
        }
        this(i, mapOnNavigationEvent, listEmptyList, str4, str5, z2, str6);
    }
}
