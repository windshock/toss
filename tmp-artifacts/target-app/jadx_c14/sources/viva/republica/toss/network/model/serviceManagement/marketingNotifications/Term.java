package viva.republica.toss.network.model.serviceManagement.marketingNotifications;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.htf31;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class Term {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final String contentsType;
    private final String contentsUrl;
    private final boolean isSigned;
    private final String key;
    private final StdConsentModuleCodes stdConsentModuleCodes;
    private final long termsId;
    private final String title;
    private final String updatedAt;

    static {
        int i = onWarmupCompleted + 11;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Term)) {
            return false;
        }
        Term term = (Term) obj;
        if (!Intrinsics.areEqual(this.contentsType, term.contentsType)) {
            int i2 = onNavigationEvent + 71;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!(!Intrinsics.areEqual(this.contentsUrl, term.contentsUrl))) {
            return this.isSigned == term.isSigned && this.termsId == term.termsId && Intrinsics.areEqual(this.title, term.title) && Intrinsics.areEqual(this.updatedAt, term.updatedAt) && Intrinsics.areEqual(this.key, term.key) && Intrinsics.areEqual(this.stdConsentModuleCodes, term.stdConsentModuleCodes);
        }
        int i4 = onNavigationEvent + 115;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int iHashCode3 = this.contentsType.hashCode();
        int iHashCode4 = this.contentsUrl.hashCode();
        int iHashCode5 = Boolean.hashCode(this.isSigned);
        int iHashCode6 = Long.hashCode(this.termsId);
        int iHashCode7 = this.title.hashCode();
        String str = this.updatedAt;
        int iHashCode8 = 0;
        if (str == null) {
            int i2 = onExtraCallback + 5;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.key;
        if (str2 == null) {
            int i4 = onNavigationEvent + 11;
            onExtraCallback = i4 % 128;
            iHashCode2 = i4 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        StdConsentModuleCodes stdConsentModuleCodes = this.stdConsentModuleCodes;
        if (stdConsentModuleCodes != null) {
            int i5 = onNavigationEvent + 35;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                stdConsentModuleCodes.hashCode();
                throw null;
            }
            iHashCode8 = stdConsentModuleCodes.hashCode();
        }
        return (((((((((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode8;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Term(contentsType=" + this.contentsType + ", contentsUrl=" + this.contentsUrl + ", isSigned=" + this.isSigned + ", termsId=" + this.termsId + ", title=" + this.title + ", updatedAt=" + this.updatedAt + ", key=" + this.key + ", stdConsentModuleCodes=" + this.stdConsentModuleCodes + ")";
        int i2 = onExtraCallback + 63;
        onNavigationEvent = i2 % 128;
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

        public final KSerializer<Term> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 119;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Term$$serializer term$$serializer = Term$$serializer.INSTANCE;
            int i4 = onExtraCallback + 19;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return term$$serializer;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public /* synthetic */ Term(int i, String str, String str2, boolean z, long j, String str3, String str4, String str5, StdConsentModuleCodes stdConsentModuleCodes, okycx okycxVar) {
        if (31 != (i & 31)) {
            htf31.onExtraCallbackWithResult(i, 31, Term$$serializer.INSTANCE.getDescriptor());
            int i2 = onNavigationEvent + 27;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 % 2;
            }
        }
        this.contentsType = str;
        this.contentsUrl = str2;
        this.isSigned = z;
        this.termsId = j;
        this.title = str3;
        if ((i & 32) == 0) {
            this.updatedAt = null;
            int i4 = onExtraCallback + 87;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
        } else {
            this.updatedAt = str4;
        }
        if ((i & 64) == 0) {
            int i6 = onNavigationEvent;
            int i7 = i6 + 79;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            this.key = null;
            int i9 = i6 + 105;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
        } else {
            this.key = str5;
        }
        int i11 = 2 % 2;
        if ((i & 128) == 0) {
            this.stdConsentModuleCodes = null;
        } else {
            this.stdConsentModuleCodes = stdConsentModuleCodes;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0044  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onWarmupCompleted(viva.republica.toss.network.model.serviceManagement.marketingNotifications.Term r7, o.vyl r8, kotlinx.serialization.descriptors.SerialDescriptor r9) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.serviceManagement.marketingNotifications.Term.onNavigationEvent
            int r1 = r1 + 9
            int r2 = r1 % 128
            viva.republica.toss.network.model.serviceManagement.marketingNotifications.Term.onExtraCallback = r2
            int r1 = r1 % r0
            java.lang.String r1 = r7.contentsType
            r2 = 0
            r8.onExtraCallback(r9, r2, r1)
            r1 = 1
            java.lang.String r3 = r7.contentsUrl
            r8.onExtraCallback(r9, r1, r3)
            boolean r1 = r7.isSigned
            r8.onNavigationEvent(r9, r0, r1)
            long r3 = r7.termsId
            r1 = 3
            r8.onExtraCallback(r9, r1, r3)
            r3 = 4
            java.lang.String r4 = r7.title
            r8.onExtraCallback(r9, r3, r4)
            r3 = 5
            boolean r4 = r8.onWarmupCompleted(r9, r3)
            r5 = 7
            if (r4 != 0) goto L44
            int r4 = viva.republica.toss.network.model.serviceManagement.marketingNotifications.Term.onExtraCallback
            int r4 = r4 + r5
            int r6 = r4 % 128
            viva.republica.toss.network.model.serviceManagement.marketingNotifications.Term.onNavigationEvent = r6
            int r4 = r4 % r0
            if (r4 == 0) goto L40
            java.lang.String r4 = r7.updatedAt
            if (r4 == 0) goto L4b
            goto L44
        L40:
            java.lang.String r7 = r7.updatedAt
            r7 = 0
            throw r7
        L44:
            o.getWriggleLayout r4 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r6 = r7.updatedAt
            r8.onExtraCallbackWithResult(r9, r3, r4, r6)
        L4b:
            r3 = 6
            boolean r4 = r8.onWarmupCompleted(r9, r3)
            if (r4 != 0) goto L56
            java.lang.String r4 = r7.key
            if (r4 == 0) goto L5d
        L56:
            o.getWriggleLayout r4 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r6 = r7.key
            r8.onExtraCallbackWithResult(r9, r3, r4, r6)
        L5d:
            boolean r3 = r8.onWarmupCompleted(r9, r5)
            if (r3 != 0) goto L67
            viva.republica.toss.network.model.serviceManagement.marketingNotifications.StdConsentModuleCodes r3 = r7.stdConsentModuleCodes
            if (r3 == 0) goto L77
        L67:
            viva.republica.toss.network.model.serviceManagement.marketingNotifications.StdConsentModuleCodes$$serializer r3 = viva.republica.toss.network.model.serviceManagement.marketingNotifications.StdConsentModuleCodes$$serializer.INSTANCE
            viva.republica.toss.network.model.serviceManagement.marketingNotifications.StdConsentModuleCodes r7 = r7.stdConsentModuleCodes
            r8.onExtraCallbackWithResult(r9, r5, r3, r7)
            int r7 = viva.republica.toss.network.model.serviceManagement.marketingNotifications.Term.onNavigationEvent
            int r7 = r7 + 41
            int r8 = r7 % 128
            viva.republica.toss.network.model.serviceManagement.marketingNotifications.Term.onExtraCallback = r8
            int r7 = r7 % r0
        L77:
            int r7 = viva.republica.toss.network.model.serviceManagement.marketingNotifications.Term.onExtraCallback
            int r7 = r7 + r1
            int r8 = r7 % 128
            viva.republica.toss.network.model.serviceManagement.marketingNotifications.Term.onNavigationEvent = r8
            int r7 = r7 % r0
            if (r7 != 0) goto L84
            r7 = 13
            int r7 = r7 / r2
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.serviceManagement.marketingNotifications.Term.onWarmupCompleted(viva.republica.toss.network.model.serviceManagement.marketingNotifications.Term, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 113;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.contentsType;
        int i5 = i2 + 83;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 49;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.contentsUrl;
        int i5 = i2 + 71;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 37 / 0;
        }
        return str;
    }

    public final boolean asBinder() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 103;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        boolean z = this.isSigned;
        int i4 = i2 + 23;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 28 / 0;
        }
        return z;
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 47;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        long j = this.termsId;
        int i5 = i3 + 85;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        throw null;
    }

    public final String onTransact() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 93;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.title;
        int i5 = i2 + 71;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 78 / 0;
        }
        return str;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 37;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = this.key;
        if (i3 != 0) {
            int i4 = 31 / 0;
        }
        return str;
    }

    public final StdConsentModuleCodes IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 23;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        StdConsentModuleCodes stdConsentModuleCodes = this.stdConsentModuleCodes;
        int i5 = i2 + 65;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return stdConsentModuleCodes;
    }
}
