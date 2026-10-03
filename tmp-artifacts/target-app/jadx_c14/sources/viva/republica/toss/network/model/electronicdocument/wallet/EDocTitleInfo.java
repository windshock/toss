package viva.republica.toss.network.model.electronicdocument.wallet;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.electronicdocument.wallet.EDocTitleInfo$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class EDocTitleInfo {
    public static final Companion Companion = new Companion(null);
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final String description;
    private final String iconUrl;
    private final EDocLogoImage logoImage;
    private final String title;

    static {
        int i = onExtraCallbackWithResult + 29;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public EDocTitleInfo() {
        this((String) null, (String) null, (String) null, (EDocLogoImage) null, 15, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(!(obj instanceof EDocTitleInfo))) {
            EDocTitleInfo eDocTitleInfo = (EDocTitleInfo) obj;
            return Intrinsics.areEqual(this.title, eDocTitleInfo.title) && Intrinsics.areEqual(this.description, eDocTitleInfo.description) && Intrinsics.areEqual(this.iconUrl, eDocTitleInfo.iconUrl) && Intrinsics.areEqual(this.logoImage, eDocTitleInfo.logoImage);
        }
        int i2 = onNavigationEvent + 7;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 25;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        String str = this.title;
        int iHashCode2 = 0;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.description;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.iconUrl;
        if (str3 == null) {
            int i2 = onExtraCallback + 43;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str3.hashCode();
        }
        EDocLogoImage eDocLogoImage = this.logoImage;
        if (eDocLogoImage != null) {
            int i4 = onExtraCallback + 77;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = eDocLogoImage.hashCode();
        }
        return (((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode) * 31) + iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "EDocTitleInfo(title=" + this.title + ", description=" + this.description + ", iconUrl=" + this.iconUrl + ", logoImage=" + this.logoImage + ")";
        int i2 = onNavigationEvent + 53;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<EDocTitleInfo> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 105;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                EDocTitleInfo$.serializer serializerVar = EDocTitleInfo$.serializer.INSTANCE;
                throw null;
            }
            EDocTitleInfo$.serializer serializerVar2 = EDocTitleInfo$.serializer.INSTANCE;
            int i3 = onNavigationEvent + 13;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return serializerVar2;
        }
    }

    public /* synthetic */ EDocTitleInfo(int i, String str, String str2, String str3, EDocLogoImage eDocLogoImage, okycx okycxVar) {
        Object obj = null;
        if ((i & 1) == 0) {
            this.title = null;
        } else {
            this.title = str;
            int i2 = onExtraCallback + 41;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 4 % 2;
            } else {
                int i4 = 2 % 2;
            }
        }
        if ((i & 2) == 0) {
            int i5 = onExtraCallback + 103;
            int i6 = i5 % 128;
            onNavigationEvent = i6;
            int i7 = i5 % 2;
            this.description = null;
            if (i7 == 0) {
                obj.hashCode();
                throw null;
            }
            int i8 = i6 + 43;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
        } else {
            this.description = str2;
        }
        if ((i & 4) == 0) {
            this.iconUrl = null;
        } else {
            this.iconUrl = str3;
        }
        if ((i & 8) != 0) {
            this.logoImage = eDocLogoImage;
            return;
        }
        int i11 = onExtraCallback + 87;
        onNavigationEvent = i11 % 128;
        int i12 = i11 % 2;
        this.logoImage = null;
    }

    public EDocTitleInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable EDocLogoImage eDocLogoImage) {
        this.title = str;
        this.description = str2;
        this.iconUrl = str3;
        this.logoImage = eDocLogoImage;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onExtraCallbackWithResult(viva.republica.toss.network.model.electronicdocument.wallet.EDocTitleInfo r4, o.vyl r5, kotlinx.serialization.descriptors.SerialDescriptor r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            r1 = 0
            boolean r2 = r5.onWarmupCompleted(r6, r1)
            if (r2 != 0) goto L21
            int r2 = viva.republica.toss.network.model.electronicdocument.wallet.EDocTitleInfo.onExtraCallback
            int r2 = r2 + 7
            int r3 = r2 % 128
            viva.republica.toss.network.model.electronicdocument.wallet.EDocTitleInfo.onNavigationEvent = r3
            int r2 = r2 % r0
            if (r2 != 0) goto L1d
            java.lang.String r2 = r4.title
            r3 = 95
            int r3 = r3 / r1
            if (r2 == 0) goto L31
            goto L21
        L1d:
            java.lang.String r2 = r4.title
            if (r2 == 0) goto L31
        L21:
            o.getWriggleLayout r2 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r3 = r4.title
            r5.onExtraCallbackWithResult(r6, r1, r2, r3)
            int r1 = viva.republica.toss.network.model.electronicdocument.wallet.EDocTitleInfo.onExtraCallback
            int r1 = r1 + 119
            int r2 = r1 % 128
            viva.republica.toss.network.model.electronicdocument.wallet.EDocTitleInfo.onNavigationEvent = r2
            int r1 = r1 % r0
        L31:
            r1 = 1
            boolean r2 = r5.onWarmupCompleted(r6, r1)
            if (r2 != 0) goto L3c
            java.lang.String r2 = r4.description
            if (r2 == 0) goto L4c
        L3c:
            o.getWriggleLayout r2 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r3 = r4.description
            r5.onExtraCallbackWithResult(r6, r1, r2, r3)
            int r2 = viva.republica.toss.network.model.electronicdocument.wallet.EDocTitleInfo.onExtraCallback
            int r2 = r2 + 69
            int r3 = r2 % 128
            viva.republica.toss.network.model.electronicdocument.wallet.EDocTitleInfo.onNavigationEvent = r3
            int r2 = r2 % r0
        L4c:
            boolean r2 = r5.onWarmupCompleted(r6, r0)
            r1 = r1 ^ r2
            if (r1 == 0) goto L6a
            int r1 = viva.republica.toss.network.model.electronicdocument.wallet.EDocTitleInfo.onExtraCallback
            int r1 = r1 + 59
            int r2 = r1 % 128
            viva.republica.toss.network.model.electronicdocument.wallet.EDocTitleInfo.onNavigationEvent = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L63
            java.lang.String r1 = r4.iconUrl
            if (r1 == 0) goto L71
            goto L6a
        L63:
            java.lang.String r4 = r4.iconUrl
            r4 = 0
            r4.hashCode()
            throw r4
        L6a:
            o.getWriggleLayout r1 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r2 = r4.iconUrl
            r5.onExtraCallbackWithResult(r6, r0, r1, r2)
        L71:
            r0 = 3
            boolean r1 = r5.onWarmupCompleted(r6, r0)
            if (r1 != 0) goto L7c
            viva.republica.toss.network.model.electronicdocument.wallet.EDocLogoImage r1 = r4.logoImage
            if (r1 == 0) goto L83
        L7c:
            viva.republica.toss.network.model.electronicdocument.wallet.EDocLogoImage$$serializer r1 = viva.republica.toss.network.model.electronicdocument.wallet.EDocLogoImage$.serializer.INSTANCE
            viva.republica.toss.network.model.electronicdocument.wallet.EDocLogoImage r4 = r4.logoImage
            r5.onExtraCallbackWithResult(r6, r0, r1, r4)
        L83:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.electronicdocument.wallet.EDocTitleInfo.onExtraCallbackWithResult(viva.republica.toss.network.model.electronicdocument.wallet.EDocTitleInfo, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ EDocTitleInfo(String str, String str2, String str3, EDocLogoImage eDocLogoImage, int i, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        if ((i & 4) != 0) {
            int i2 = onNavigationEvent + 95;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            str3 = null;
        }
        if ((i & 8) != 0) {
            int i3 = onExtraCallback + 21;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            eDocLogoImage = null;
        }
        this(str, str2, str3, eDocLogoImage);
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 29;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.title;
        int i4 = i2 + 39;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 47;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.description;
        int i5 = i3 + 41;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 111;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = this.iconUrl;
        if (i3 != 0) {
            int i4 = 85 / 0;
        }
        return str;
    }

    public final EDocLogoImage IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 7;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.logoImage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
