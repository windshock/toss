package viva.republica.toss.network.model.electronicdocument.wallet;

import com.iap.android.mppclient.container.constant.JsParamKeys;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkCanOpenLandingPage;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletPackageConfigResp$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class DocumentWalletPackageConfigResp {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private final List<DocumentWalletConfigDoc> docCodes;
    private final String dropOutScheme;
    private final boolean inProgress;
    private final boolean isPackage;
    private final DocumentWalletConfigTitle onboardingText;
    private final DocumentWalletPollCheckMeta pollCheckMeta;
    private final String successScheme;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletPackageConfigResp$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 125;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = JsParamKeys.onExtraCallbackWithResult();
            KSerializer kSerializer = (KSerializer) DocumentWalletPackageConfigResp.onExtraCallback(396868867, JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, new Object[0], iOnExtraCallbackWithResult3, -396868866);
            int i4 = IAuthTabCallback + 101;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return kSerializer;
        }
    }), null, null, null, null};

    public DocumentWalletPackageConfigResp() {
        this(false, (DocumentWalletConfigTitle) null, (List) null, (DocumentWalletPollCheckMeta) null, (String) null, (String) null, false, 127, (DefaultConstructorMarker) null);
    }

    private static final /* synthetic */ KSerializer asInterface() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(DocumentWalletConfigDoc$$serializer.INSTANCE);
        int i2 = onExtraCallbackWithResult + 31;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i3;
        int i9 = (~(i7 | i8)) | (~(i6 | i3)) | (~(i | i3));
        int i10 = ~i;
        int i11 = (~(i10 | i3)) | i6;
        int i12 = (~(i3 | i6 | i)) | (~(i8 | i10));
        int i13 = i6 + i + i4 + ((-373584967) * i5) + ((-1711780345) * i2);
        int i14 = i13 * i13;
        int i15 = (i6 * 1075882953) + 1902575616 + (1075882953 * i) + ((-462509112) * i9) + (925018224 * i11) + (462509112 * i12) + (1538392064 * i4) + ((-375259136) * i5) + ((-1109524480) * i2) + (585564160 * i14);
        int i16 = ((i6 * 235012993) - 778813113) + (i * 235012993) + (i9 * (-632)) + (i11 * 1264) + (i12 * 632) + (i4 * 235013625) + (i5 * 915899377) + (i2 * (-1709701169)) + (i14 * 1974403072);
        return i15 + ((i16 * i16) * (-848756736)) != 1 ? IAuthTabCallback(objArr) : onExtraCallback(objArr);
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 63;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return asInterface();
        }
        asInterface();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 31;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 9;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                return true;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (!(obj instanceof DocumentWalletPackageConfigResp)) {
            return false;
        }
        DocumentWalletPackageConfigResp documentWalletPackageConfigResp = (DocumentWalletPackageConfigResp) obj;
        if (this.inProgress != documentWalletPackageConfigResp.inProgress || !Intrinsics.areEqual(this.onboardingText, documentWalletPackageConfigResp.onboardingText) || !Intrinsics.areEqual(this.docCodes, documentWalletPackageConfigResp.docCodes) || !Intrinsics.areEqual(this.pollCheckMeta, documentWalletPackageConfigResp.pollCheckMeta)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.successScheme, documentWalletPackageConfigResp.successScheme)) {
            int i6 = IAuthTabCallback + 77;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.dropOutScheme, documentWalletPackageConfigResp.dropOutScheme)) {
            return false;
        }
        if (this.isPackage == documentWalletPackageConfigResp.isPackage) {
            return true;
        }
        int i8 = onExtraCallbackWithResult + 83;
        IAuthTabCallback = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int iHashCode3 = Boolean.hashCode(this.inProgress);
        DocumentWalletConfigTitle documentWalletConfigTitle = this.onboardingText;
        int iHashCode4 = documentWalletConfigTitle == null ? 0 : documentWalletConfigTitle.hashCode();
        List<DocumentWalletConfigDoc> list = this.docCodes;
        int iHashCode5 = list == null ? 0 : list.hashCode();
        DocumentWalletPollCheckMeta documentWalletPollCheckMeta = this.pollCheckMeta;
        if (documentWalletPollCheckMeta == null) {
            int i2 = IAuthTabCallback + 9;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = documentWalletPollCheckMeta.hashCode();
        }
        String str = this.successScheme;
        if (str == null) {
            int i4 = IAuthTabCallback + 95;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str.hashCode();
        }
        String str2 = this.dropOutScheme;
        return (((((((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode) * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.isPackage);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DocumentWalletPackageConfigResp(inProgress=" + this.inProgress + ", onboardingText=" + this.onboardingText + ", docCodes=" + this.docCodes + ", pollCheckMeta=" + this.pollCheckMeta + ", successScheme=" + this.successScheme + ", dropOutScheme=" + this.dropOutScheme + ", isPackage=" + this.isPackage + ")";
        int i2 = IAuthTabCallback + 99;
        onExtraCallbackWithResult = i2 % 128;
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

        public final KSerializer<DocumentWalletPackageConfigResp> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 55;
            onExtraCallbackWithResult = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                DocumentWalletPackageConfigResp$.serializer serializerVar = DocumentWalletPackageConfigResp$.serializer.INSTANCE;
                obj.hashCode();
                throw null;
            }
            DocumentWalletPackageConfigResp$.serializer serializerVar2 = DocumentWalletPackageConfigResp$.serializer.INSTANCE;
            int i3 = IAuthTabCallback + 73;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                return serializerVar2;
            }
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = onNavigationEvent + 71;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 6 / 0;
        }
    }

    public /* synthetic */ DocumentWalletPackageConfigResp(int i, boolean z, DocumentWalletConfigTitle documentWalletConfigTitle, List list, DocumentWalletPollCheckMeta documentWalletPollCheckMeta, String str, String str2, boolean z2, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.inProgress = false;
            int i2 = 2 % 2;
        } else {
            this.inProgress = z;
        }
        Object obj = null;
        if ((i & 2) == 0) {
            this.onboardingText = null;
            int i3 = 2 % 2;
        } else {
            this.onboardingText = documentWalletConfigTitle;
        }
        if ((i & 4) == 0) {
            this.docCodes = null;
        } else {
            this.docCodes = list;
            int i4 = 2 % 2;
        }
        if ((i & 8) == 0) {
            this.pollCheckMeta = null;
        } else {
            this.pollCheckMeta = documentWalletPollCheckMeta;
        }
        if ((i & 16) == 0) {
            int i5 = onExtraCallbackWithResult + 93;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            this.successScheme = null;
            if (i6 != 0) {
                obj.hashCode();
                throw null;
            }
        } else {
            this.successScheme = str;
            int i7 = 2 % 2;
        }
        if ((i & 32) == 0) {
            this.dropOutScheme = null;
            int i8 = 2 % 2;
        } else {
            this.dropOutScheme = str2;
        }
        if ((i & 64) != 0) {
            this.isPackage = z2;
            return;
        }
        int i9 = IAuthTabCallback + 5;
        onExtraCallbackWithResult = i9 % 128;
        int i10 = i9 % 2;
        this.isPackage = false;
    }

    public DocumentWalletPackageConfigResp(boolean z, @Nullable DocumentWalletConfigTitle documentWalletConfigTitle, @Nullable List<DocumentWalletConfigDoc> list, @Nullable DocumentWalletPollCheckMeta documentWalletPollCheckMeta, @Nullable String str, @Nullable String str2, boolean z2) {
        this.inProgress = z;
        this.onboardingText = documentWalletConfigTitle;
        this.docCodes = list;
        this.pollCheckMeta = documentWalletPollCheckMeta;
        this.successScheme = str;
        this.dropOutScheme = str2;
        this.isPackage = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object IAuthTabCallback(java.lang.Object[] r7) {
        /*
            r0 = 0
            r1 = r7[r0]
            viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletPackageConfigResp r1 = (viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletPackageConfigResp) r1
            r2 = 1
            r3 = r7[r2]
            o.vyl r3 = (o.vyl) r3
            r4 = 2
            r7 = r7[r4]
            kotlinx.serialization.descriptors.SerialDescriptor r7 = (kotlinx.serialization.descriptors.SerialDescriptor) r7
            int r5 = r4 % r4
            int r5 = viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletPackageConfigResp.IAuthTabCallback
            int r5 = r5 + 15
            int r6 = r5 % 128
            viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletPackageConfigResp.onExtraCallbackWithResult = r6
            int r5 = r5 % r4
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r5 = viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletPackageConfigResp.$childSerializers
            boolean r6 = r3.onWarmupCompleted(r7, r0)
            if (r6 != 0) goto L26
            boolean r6 = r1.inProgress
            if (r6 == 0) goto L2b
        L26:
            boolean r6 = r1.inProgress
            r3.onNavigationEvent(r7, r0, r6)
        L2b:
            boolean r0 = r3.onWarmupCompleted(r7, r2)
            if (r0 != 0) goto L35
            viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigTitle r0 = r1.onboardingText
            if (r0 == 0) goto L3c
        L35:
            viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigTitle$$serializer r0 = viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigTitle$$serializer.INSTANCE
            viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigTitle r6 = r1.onboardingText
            r3.onExtraCallbackWithResult(r7, r2, r0, r6)
        L3c:
            boolean r0 = r3.onWarmupCompleted(r7, r4)
            if (r0 != 0) goto L46
            java.util.List<viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigDoc> r0 = r1.docCodes
            if (r0 == 0) goto L53
        L46:
            r0 = r5[r4]
            java.lang.Object r0 = r0.getValue()
            o.py r0 = (o.py) r0
            java.util.List<viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigDoc> r2 = r1.docCodes
            r3.onExtraCallbackWithResult(r7, r4, r0, r2)
        L53:
            r0 = 3
            boolean r2 = r3.onWarmupCompleted(r7, r0)
            if (r2 != 0) goto L5e
            viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletPollCheckMeta r2 = r1.pollCheckMeta
            if (r2 == 0) goto L65
        L5e:
            viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletPollCheckMeta$$serializer r2 = viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletPollCheckMeta$$serializer.INSTANCE
            viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletPollCheckMeta r5 = r1.pollCheckMeta
            r3.onExtraCallbackWithResult(r7, r0, r2, r5)
        L65:
            r0 = 4
            boolean r2 = r3.onWarmupCompleted(r7, r0)
            if (r2 != 0) goto L70
            java.lang.String r2 = r1.successScheme
            if (r2 == 0) goto L77
        L70:
            o.getWriggleLayout r2 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r5 = r1.successScheme
            r3.onExtraCallbackWithResult(r7, r0, r2, r5)
        L77:
            r0 = 5
            boolean r2 = r3.onWarmupCompleted(r7, r0)
            if (r2 != 0) goto L82
            java.lang.String r2 = r1.dropOutScheme
            if (r2 == 0) goto L89
        L82:
            o.getWriggleLayout r2 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r5 = r1.dropOutScheme
            r3.onExtraCallbackWithResult(r7, r0, r2, r5)
        L89:
            r0 = 6
            boolean r2 = r3.onWarmupCompleted(r7, r0)
            r5 = 0
            if (r2 != 0) goto La7
            int r2 = viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletPackageConfigResp.IAuthTabCallback
            int r2 = r2 + 121
            int r6 = r2 % 128
            viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletPackageConfigResp.onExtraCallbackWithResult = r6
            int r2 = r2 % r4
            if (r2 == 0) goto La1
            boolean r2 = r1.isPackage
            if (r2 == 0) goto Lac
            goto La7
        La1:
            boolean r7 = r1.isPackage
            r5.hashCode()
            throw r5
        La7:
            boolean r1 = r1.isPackage
            r3.onNavigationEvent(r7, r0, r1)
        Lac:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletPackageConfigResp.IAuthTabCallback(java.lang.Object[]):java.lang.Object");
    }

    public static final /* synthetic */ Lazy[] IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 61;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i2 + 59;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return lazyArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DocumentWalletPackageConfigResp(boolean z, DocumentWalletConfigTitle documentWalletConfigTitle, List list, DocumentWalletPollCheckMeta documentWalletPollCheckMeta, String str, String str2, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        DocumentWalletConfigTitle documentWalletConfigTitle2;
        DocumentWalletPollCheckMeta documentWalletPollCheckMeta2;
        String str3;
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallback + 45;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            z = false;
        }
        String str4 = null;
        if ((i & 2) != 0) {
            int i5 = 2 % 2;
            documentWalletConfigTitle2 = null;
        } else {
            documentWalletConfigTitle2 = documentWalletConfigTitle;
        }
        List list2 = (i & 4) != 0 ? null : list;
        if ((i & 8) != 0) {
            int i6 = 2 % 2;
            documentWalletPollCheckMeta2 = null;
        } else {
            documentWalletPollCheckMeta2 = documentWalletPollCheckMeta;
        }
        if ((i & 16) != 0) {
            int i7 = onExtraCallbackWithResult + 79;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            str3 = null;
        } else {
            str3 = str;
        }
        if ((i & 32) != 0) {
            int i9 = 2 % 2;
        } else {
            str4 = str2;
        }
        this(z, documentWalletConfigTitle2, list2, documentWalletPollCheckMeta2, str3, str4, (i & 64) == 0 ? z2 : false);
    }

    public final boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 35;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.inProgress;
        int i5 = i2 + 121;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final DocumentWalletConfigTitle asBinder() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 35;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        DocumentWalletConfigTitle documentWalletConfigTitle = this.onboardingText;
        int i5 = i3 + 95;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 94 / 0;
        }
        return documentWalletConfigTitle;
    }

    public final List<DocumentWalletConfigDoc> onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 69;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        List<DocumentWalletConfigDoc> list = this.docCodes;
        int i5 = i2 + 87;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public final DocumentWalletPollCheckMeta IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 107;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        DocumentWalletPollCheckMeta documentWalletPollCheckMeta = this.pollCheckMeta;
        int i4 = i2 + 13;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return documentWalletPollCheckMeta;
        }
        throw null;
    }

    public final String onTransact() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 49;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.successScheme;
        int i4 = i2 + 11;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 95;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.dropOutScheme;
        int i5 = i2 + 79;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final boolean IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 43;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.isPackage;
        int i5 = i2 + 11;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = JsParamKeys.onExtraCallbackWithResult();
        return (KSerializer) onExtraCallback(396868867, JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, new Object[0], iOnExtraCallbackWithResult3, -396868866);
    }

    @JvmStatic
    public static final /* synthetic */ void IAuthTabCallback(DocumentWalletPackageConfigResp documentWalletPackageConfigResp, vyl vylVar, SerialDescriptor serialDescriptor) {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = JsParamKeys.onExtraCallbackWithResult();
        onExtraCallback(1001430464, JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, new Object[]{documentWalletPackageConfigResp, vylVar, serialDescriptor}, iOnExtraCallbackWithResult3, -1001430464);
    }
}
