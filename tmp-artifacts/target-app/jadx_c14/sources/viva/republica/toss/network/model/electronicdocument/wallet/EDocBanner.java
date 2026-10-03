package viva.republica.toss.network.model.electronicdocument.wallet;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkCanOpenLandingPage;
import o.getWriggleLayout;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class EDocBanner {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final String description;
    private final EDocDialog dialogue;
    private final List<String> iconUrls;
    private final String schemeUrl;
    private final String title;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.electronicdocument.wallet.EDocBanner$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 71;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnExtraCallbackWithResult = EDocBanner.onExtraCallbackWithResult();
            int i4 = IAuthTabCallback + 13;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerOnExtraCallbackWithResult;
        }
    }), null};

    public EDocBanner() {
        this((String) null, (String) null, (String) null, (List) null, (EDocDialog) null, 31, (DefaultConstructorMarker) null);
    }

    private static final /* synthetic */ KSerializer IAuthTabCallbackStub() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(getWriggleLayout.onNavigationEvent);
        int i2 = onWarmupCompleted + 105;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 53;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerIAuthTabCallbackStub = IAuthTabCallbackStub();
        if (i3 == 0) {
            int i4 = 53 / 0;
        }
        return kSerializerIAuthTabCallbackStub;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EDocBanner)) {
            return false;
        }
        EDocBanner eDocBanner = (EDocBanner) obj;
        if (!Intrinsics.areEqual(this.title, eDocBanner.title)) {
            int i4 = onExtraCallbackWithResult + 93;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.description, eDocBanner.description)) {
            int i6 = onExtraCallbackWithResult + 39;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 71 / 0;
            }
            return false;
        }
        if (!Intrinsics.areEqual(this.schemeUrl, eDocBanner.schemeUrl)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.iconUrls, eDocBanner.iconUrls)) {
            int i8 = onWarmupCompleted + 79;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.dialogue, eDocBanner.dialogue)) {
            int i10 = onWarmupCompleted + 109;
            onExtraCallbackWithResult = i10 % 128;
            return i10 % 2 == 0;
        }
        int i11 = onExtraCallbackWithResult + 59;
        onWarmupCompleted = i11 % 128;
        int i12 = i11 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 101;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.title.hashCode();
        int iHashCode2 = this.description.hashCode();
        int iHashCode3 = this.schemeUrl.hashCode();
        List<String> list = this.iconUrls;
        int iHashCode4 = 0;
        int iHashCode5 = list == null ? 0 : list.hashCode();
        EDocDialog eDocDialog = this.dialogue;
        if (eDocDialog != null) {
            int i4 = onWarmupCompleted + 7;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                eDocDialog.hashCode();
                throw null;
            }
            iHashCode4 = eDocDialog.hashCode();
        }
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode5) * 31) + iHashCode4;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "EDocBanner(title=" + this.title + ", description=" + this.description + ", schemeUrl=" + this.schemeUrl + ", iconUrls=" + this.iconUrls + ", dialogue=" + this.dialogue + ")";
        int i2 = onWarmupCompleted + 107;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<EDocBanner> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 71;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            EDocBanner$$serializer eDocBanner$$serializer = EDocBanner$$serializer.INSTANCE;
            int i4 = onWarmupCompleted + 1;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 65 / 0;
            }
            return eDocBanner$$serializer;
        }
    }

    static {
        int i = onNavigationEvent + 113;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public /* synthetic */ EDocBanner(int i, String str, String str2, String str3, List list, EDocDialog eDocDialog, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.title = "";
        } else {
            this.title = str;
            int i2 = 2 % 2;
        }
        if ((i & 2) == 0) {
            this.description = "";
            int i3 = 2 % 2;
        } else {
            this.description = str2;
        }
        if ((i & 4) == 0) {
            int i4 = onExtraCallbackWithResult + 99;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            this.schemeUrl = "";
        } else {
            this.schemeUrl = str3;
            int i6 = 2 % 2;
        }
        Object obj = null;
        if ((i & 8) == 0) {
            int i7 = onWarmupCompleted;
            int i8 = i7 + 19;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            this.iconUrls = null;
            int i10 = i7 + 39;
            onExtraCallbackWithResult = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 2 % 2;
            }
        } else {
            this.iconUrls = list;
        }
        if ((i & 16) == 0) {
            this.dialogue = null;
            return;
        }
        this.dialogue = eDocDialog;
        int i12 = onWarmupCompleted + 69;
        onExtraCallbackWithResult = i12 % 128;
        if (i12 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public EDocBanner(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable List<String> list, @Nullable EDocDialog eDocDialog) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.title = str;
        this.description = str2;
        this.schemeUrl = str3;
        this.iconUrls = list;
        this.dialogue = eDocDialog;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006c  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void IAuthTabCallback(viva.republica.toss.network.model.electronicdocument.wallet.EDocBanner r6, o.vyl r7, kotlinx.serialization.descriptors.SerialDescriptor r8) {
        /*
            r0 = 2
            int r1 = r0 % r0
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.electronicdocument.wallet.EDocBanner.$childSerializers
            r2 = 0
            boolean r3 = r7.onWarmupCompleted(r8, r2)
            java.lang.String r4 = ""
            if (r3 != 0) goto L16
            java.lang.String r3 = r6.title
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 != 0) goto L28
        L16:
            java.lang.String r3 = r6.title
            r7.onExtraCallback(r8, r2, r3)
            int r3 = viva.republica.toss.network.model.electronicdocument.wallet.EDocBanner.onWarmupCompleted
            int r3 = r3 + 53
            int r5 = r3 % 128
            viva.republica.toss.network.model.electronicdocument.wallet.EDocBanner.onExtraCallbackWithResult = r5
            int r3 = r3 % r0
            if (r3 != 0) goto L28
            r3 = 5
            int r3 = r3 / r3
        L28:
            r3 = 1
            boolean r5 = r7.onWarmupCompleted(r8, r3)
            if (r5 != 0) goto L37
            java.lang.String r5 = r6.description
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r4)
            if (r5 != 0) goto L3c
        L37:
            java.lang.String r5 = r6.description
            r7.onExtraCallback(r8, r3, r5)
        L3c:
            boolean r3 = r7.onWarmupCompleted(r8, r0)
            if (r3 != 0) goto L4a
            java.lang.String r3 = r6.schemeUrl
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 != 0) goto L4f
        L4a:
            java.lang.String r3 = r6.schemeUrl
            r7.onExtraCallback(r8, r0, r3)
        L4f:
            r3 = 3
            boolean r4 = r7.onWarmupCompleted(r8, r3)
            if (r4 != 0) goto L6c
            int r4 = viva.republica.toss.network.model.electronicdocument.wallet.EDocBanner.onWarmupCompleted
            int r4 = r4 + 103
            int r5 = r4 % 128
            viva.republica.toss.network.model.electronicdocument.wallet.EDocBanner.onExtraCallbackWithResult = r5
            int r4 = r4 % r0
            if (r4 != 0) goto L68
            java.util.List<java.lang.String> r4 = r6.iconUrls
            int r2 = r0 / 0
            if (r4 == 0) goto L79
            goto L6c
        L68:
            java.util.List<java.lang.String> r2 = r6.iconUrls
            if (r2 == 0) goto L79
        L6c:
            r1 = r1[r3]
            java.lang.Object r1 = r1.getValue()
            o.py r1 = (o.py) r1
            java.util.List<java.lang.String> r2 = r6.iconUrls
            r7.onExtraCallbackWithResult(r8, r3, r1, r2)
        L79:
            r1 = 4
            boolean r2 = r7.onWarmupCompleted(r8, r1)
            if (r2 != 0) goto L8c
            int r2 = viva.republica.toss.network.model.electronicdocument.wallet.EDocBanner.onWarmupCompleted
            int r2 = r2 + r3
            int r3 = r2 % 128
            viva.republica.toss.network.model.electronicdocument.wallet.EDocBanner.onExtraCallbackWithResult = r3
            int r2 = r2 % r0
            viva.republica.toss.network.model.electronicdocument.wallet.EDocDialog r0 = r6.dialogue
            if (r0 == 0) goto L93
        L8c:
            viva.republica.toss.network.model.electronicdocument.wallet.EDocDialog$$serializer r0 = viva.republica.toss.network.model.electronicdocument.wallet.EDocDialog$$serializer.INSTANCE
            viva.republica.toss.network.model.electronicdocument.wallet.EDocDialog r6 = r6.dialogue
            r7.onExtraCallbackWithResult(r8, r1, r0, r6)
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.electronicdocument.wallet.EDocBanner.IAuthTabCallback(viva.republica.toss.network.model.electronicdocument.wallet.EDocBanner, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public static final /* synthetic */ Lazy[] onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 5;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i3 + 91;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return lazyArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ EDocBanner(String str, String str2, String str3, List list, EDocDialog eDocDialog, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str4;
        EDocDialog eDocDialog2;
        String str5 = "";
        if ((i & 1) != 0) {
            int i2 = onExtraCallbackWithResult + 41;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 96 / 0;
            }
            int i4 = 2 % 2;
            str = "";
        }
        if ((i & 2) != 0) {
            int i5 = onWarmupCompleted + 21;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            str4 = "";
        } else {
            str4 = str2;
        }
        if ((i & 4) != 0) {
            int i7 = onWarmupCompleted + 47;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
        } else {
            str5 = str3;
        }
        List list2 = (i & 8) != 0 ? null : list;
        if ((i & 16) != 0) {
            int i9 = 2 % 2;
            eDocDialog2 = null;
        } else {
            eDocDialog2 = eDocDialog;
        }
        this(str, str4, str5, list2, eDocDialog2);
    }

    public final String IAuthTabCallbackDefault() {
        String str;
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 35;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.title;
            int i4 = 19 / 0;
        } else {
            str = this.title;
        }
        int i5 = i2 + 79;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 79;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.description;
        int i5 = i2 + 109;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 89 / 0;
        }
        return str;
    }

    public final String asInterface() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 35;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = this.schemeUrl;
        int i5 = i2 + 89;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final List<String> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 61;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<String> list = this.iconUrls;
        int i4 = i2 + 21;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public final EDocDialog onWarmupCompleted() {
        EDocDialog eDocDialog;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 65;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 != 0) {
            eDocDialog = this.dialogue;
            int i4 = 84 / 0;
        } else {
            eDocDialog = this.dialogue;
        }
        int i5 = i3 + 67;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return eDocDialog;
        }
        throw null;
    }
}
