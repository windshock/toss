package viva.republica.toss.network.model.electronicdocument.wallet;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.electronicdocument.wallet.EDocLogoImage$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class EDocLogoImage {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onWarmupCompleted;
    private final String darkUri;
    private final String uri;

    static {
        int i = onWarmupCompleted + 105;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EDocLogoImage() {
        String str = null;
        this(str, str, 3, (DefaultConstructorMarker) str);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 65;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EDocLogoImage)) {
            return false;
        }
        EDocLogoImage eDocLogoImage = (EDocLogoImage) obj;
        if (!Intrinsics.areEqual(this.uri, eDocLogoImage.uri)) {
            return false;
        }
        if (Intrinsics.areEqual(this.darkUri, eDocLogoImage.darkUri)) {
            return true;
        }
        int i4 = IAuthTabCallback;
        int i5 = i4 + 121;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 71;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 == 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 53;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.uri;
        int iHashCode2 = 0;
        if (str == null) {
            int i5 = i2 + 3;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 / 3;
            }
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.darkUri;
        if (str2 != null) {
            int i7 = onExtraCallbackWithResult + 101;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            iHashCode2 = str2.hashCode();
            int i9 = onExtraCallbackWithResult + 83;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
        }
        return (iHashCode * 31) + iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "EDocLogoImage(uri=" + this.uri + ", darkUri=" + this.darkUri + ")";
        int i2 = IAuthTabCallback + 45;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<EDocLogoImage> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 3;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            EDocLogoImage$.serializer serializerVar = EDocLogoImage$.serializer.INSTANCE;
            if (i3 == 0) {
                int i4 = 93 / 0;
            }
            return serializerVar;
        }
    }

    public /* synthetic */ EDocLogoImage(int i, String str, String str2, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.uri = null;
            int i2 = 2 % 2;
        } else {
            this.uri = str;
        }
        if ((i & 2) != 0) {
            this.darkUri = str2;
            return;
        }
        int i3 = onExtraCallbackWithResult;
        int i4 = i3 + 115;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        this.darkUri = null;
        int i6 = i3 + 7;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 28 / 0;
        }
    }

    public EDocLogoImage(@Nullable String str, @Nullable String str2) {
        this.uri = str;
        this.darkUri = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onNavigationEvent(viva.republica.toss.network.model.electronicdocument.wallet.EDocLogoImage r5, o.vyl r6, kotlinx.serialization.descriptors.SerialDescriptor r7) {
        /*
            r0 = 2
            int r1 = r0 % r0
            r1 = 0
            boolean r2 = r6.onWarmupCompleted(r7, r1)
            r3 = 0
            if (r2 != 0) goto L1e
            int r2 = viva.republica.toss.network.model.electronicdocument.wallet.EDocLogoImage.onExtraCallbackWithResult
            int r2 = r2 + 125
            int r4 = r2 % 128
            viva.republica.toss.network.model.electronicdocument.wallet.EDocLogoImage.IAuthTabCallback = r4
            int r2 = r2 % r0
            if (r2 == 0) goto L1b
            java.lang.String r2 = r5.uri
            if (r2 == 0) goto L25
            goto L1e
        L1b:
            java.lang.String r5 = r5.uri
            throw r3
        L1e:
            o.getWriggleLayout r2 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r4 = r5.uri
            r6.onExtraCallbackWithResult(r7, r1, r2, r4)
        L25:
            r1 = 1
            boolean r2 = r6.onWarmupCompleted(r7, r1)
            r2 = r2 ^ r1
            if (r2 == r1) goto L2e
            goto L3d
        L2e:
            int r2 = viva.republica.toss.network.model.electronicdocument.wallet.EDocLogoImage.IAuthTabCallback
            int r2 = r2 + 5
            int r4 = r2 % 128
            viva.republica.toss.network.model.electronicdocument.wallet.EDocLogoImage.onExtraCallbackWithResult = r4
            int r2 = r2 % r0
            if (r2 != 0) goto L4e
            java.lang.String r2 = r5.darkUri
            if (r2 == 0) goto L4d
        L3d:
            o.getWriggleLayout r2 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r5 = r5.darkUri
            r6.onExtraCallbackWithResult(r7, r1, r2, r5)
            int r5 = viva.republica.toss.network.model.electronicdocument.wallet.EDocLogoImage.onExtraCallbackWithResult
            int r5 = r5 + 67
            int r6 = r5 % 128
            viva.republica.toss.network.model.electronicdocument.wallet.EDocLogoImage.IAuthTabCallback = r6
            int r5 = r5 % r0
        L4d:
            return
        L4e:
            java.lang.String r5 = r5.darkUri
            r3.hashCode()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.electronicdocument.wallet.EDocLogoImage.onNavigationEvent(viva.republica.toss.network.model.electronicdocument.wallet.EDocLogoImage, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ EDocLogoImage(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallback + 33;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 103;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
            str = null;
        }
        if ((i & 2) != 0) {
            int i7 = onExtraCallbackWithResult + 109;
            int i8 = i7 % 128;
            IAuthTabCallback = i8;
            if (i7 % 2 == 0) {
                int i9 = 2 / 0;
            }
            int i10 = i8 + 39;
            onExtraCallbackWithResult = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 2 % 2;
            }
            str2 = null;
        }
        this(str, str2);
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String str = this.uri;
        if (i3 != 0) {
            int i4 = 47 / 0;
        }
        return str;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 31;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String str = this.darkUri;
        if (i3 != 0) {
            int i4 = 3 / 0;
        }
        return str;
    }
}
