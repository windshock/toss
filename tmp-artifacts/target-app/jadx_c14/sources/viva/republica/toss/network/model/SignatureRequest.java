package viva.republica.toss.network.model;

import com.google.gson.annotations.SerializedName;
import com.iap.ac.android.biz.common.rpc.request.MobilePaymentInquireQuoteRequest;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import o.TombstoneProtosMemoryMappingBuilder;
import o.TypeUtils2;
import o.TypeUtilsMethodInheritanceComparator;
import o.giw;
import o.isMalformed2;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.NotNull;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class SignatureRequest {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    @SerializedName("date")
    private String date;

    @SerializedName("doc")
    private String doc;

    @SerializedName("signature")
    private String signature;

    @SerializedName("lv0Cert")
    private boolean useLv0Cert;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.SignatureRequest$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 19;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerAsBinder = SignatureRequest.asBinder();
            if (i3 != 0) {
                int i4 = 31 / 0;
            }
            return kSerializerAsBinder;
        }
    });

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = (~(i7 | i)) | i3;
        int i9 = i | i3 | i7;
        int i10 = i3 + i2 + i5 + (1159740906 * i6) + ((-617157175) * i4);
        int i11 = i10 * i10;
        int i12 = ((i3 * 934236018) - 2089811968) + (934236018 * i2) + (i8 * (-953110385)) + ((-953110385) * i9) + (953110385 * i7) + ((-18874368) * i5) + (1488977920 * i6) + (2111832064 * i4) + (2070937600 * i11);
        int i13 = (i3 * (-824977050)) + 1921657099 + (i2 * (-824977050)) + (i8 * (-923)) + (i9 * (-923)) + (i7 * 923) + (i5 * (-824977973)) + (i6 * (-135083378)) + (i4 * 1125239651) + (i11 * 298844160);
        return i12 + ((i13 * i13) * 2098200576) != 1 ? onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr);
    }

    public static /* synthetic */ KSerializer asBinder() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 17;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        KSerializer kSerializerIAuthTabCallback = IAuthTabCallback();
        int i3 = onExtraCallbackWithResult + 51;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerIAuthTabCallback;
    }

    public static /* synthetic */ String onWarmupCompleted(SignatureRequest signatureRequest, String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 67;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult(signatureRequest, str);
        }
        onExtraCallbackWithResult(signatureRequest, str);
        throw null;
    }

    public abstract String onNavigationEvent(@NotNull String str);

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final /* synthetic */ KSerializer onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 51;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializer = (KSerializer) SignatureRequest.access000().getValue();
            if (i3 == 0) {
                return kSerializer;
            }
            throw null;
        }

        public final KSerializer<SignatureRequest> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 45;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            KSerializer<SignatureRequest> kSerializerOnWarmupCompleted = onWarmupCompleted();
            int i4 = onNavigationEvent + 67;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return kSerializerOnWarmupCompleted;
            }
            throw null;
        }
    }

    static {
        int i = IAuthTabCallback + 71;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            int i2 = 19 / 0;
        }
    }

    public SignatureRequest() {
        this.doc = "";
        this.signature = "";
        this.date = "";
    }

    public /* synthetic */ SignatureRequest(int i, String str, String str2, String str3, boolean z, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.doc = "";
        } else {
            this.doc = str;
        }
        if ((i & 2) == 0) {
            int i2 = onExtraCallback + 87;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.signature = "";
            if (i3 == 0) {
                throw null;
            }
        } else {
            this.signature = str2;
            int i4 = 2 % 2;
        }
        if ((i & 4) == 0) {
            this.date = "";
        } else {
            this.date = str3;
            int i5 = 2 % 2;
        }
        if ((i & 8) == 0) {
            this.useLv0Cert = false;
            return;
        }
        this.useLv0Cert = z;
        int i6 = onExtraCallbackWithResult + 91;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
    }

    private static final /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        giw giwVar = new giw(Reflection.getOrCreateKotlinClass(SignatureRequest.class), new Annotation[0]);
        int i2 = onExtraCallback + 81;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 31 / 0;
        }
        return giwVar;
    }

    public static final /* synthetic */ Lazy access000() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 13;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>> lazy = $cachedSerializer$delegate;
        int i5 = i2 + 59;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return lazy;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object onWarmupCompleted(java.lang.Object[] r7) {
        /*
            r0 = 0
            r1 = r7[r0]
            viva.republica.toss.network.model.SignatureRequest r1 = (viva.republica.toss.network.model.SignatureRequest) r1
            r2 = 1
            r3 = r7[r2]
            o.vyl r3 = (o.vyl) r3
            r4 = 2
            r7 = r7[r4]
            kotlinx.serialization.descriptors.SerialDescriptor r7 = (kotlinx.serialization.descriptors.SerialDescriptor) r7
            int r5 = r4 % r4
            boolean r5 = r3.onWarmupCompleted(r7, r0)
            java.lang.String r6 = ""
            if (r5 != 0) goto L21
            java.lang.String r5 = r1.doc
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r6)
            if (r5 != 0) goto L26
        L21:
            java.lang.String r5 = r1.doc
            r3.onExtraCallback(r7, r0, r5)
        L26:
            boolean r0 = r3.onWarmupCompleted(r7, r2)
            if (r0 != 0) goto L34
            java.lang.String r0 = r1.signature
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r6)
            if (r0 != 0) goto L42
        L34:
            java.lang.String r0 = r1.signature
            r3.onExtraCallback(r7, r2, r0)
            int r0 = viva.republica.toss.network.model.SignatureRequest.onExtraCallback
            int r0 = r0 + 105
            int r2 = r0 % 128
            viva.republica.toss.network.model.SignatureRequest.onExtraCallbackWithResult = r2
            int r0 = r0 % r4
        L42:
            boolean r0 = r3.onWarmupCompleted(r7, r4)
            r2 = 0
            if (r0 != 0) goto L66
            int r0 = viva.republica.toss.network.model.SignatureRequest.onExtraCallback
            int r0 = r0 + 101
            int r5 = r0 % 128
            viva.republica.toss.network.model.SignatureRequest.onExtraCallbackWithResult = r5
            int r0 = r0 % r4
            if (r0 == 0) goto L5d
            java.lang.String r0 = r1.date
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r6)
            if (r0 != 0) goto L6b
            goto L66
        L5d:
            java.lang.String r7 = r1.date
            kotlin.jvm.internal.Intrinsics.areEqual(r7, r6)
            r2.hashCode()
            throw r2
        L66:
            java.lang.String r0 = r1.date
            r3.onExtraCallback(r7, r4, r0)
        L6b:
            r0 = 3
            boolean r5 = r3.onWarmupCompleted(r7, r0)
            if (r5 != 0) goto L76
            boolean r5 = r1.useLv0Cert
            if (r5 == 0) goto L84
        L76:
            boolean r1 = r1.useLv0Cert
            r3.onNavigationEvent(r7, r0, r1)
            int r7 = viva.republica.toss.network.model.SignatureRequest.onExtraCallback
            int r7 = r7 + 13
            int r0 = r7 % 128
            viva.republica.toss.network.model.SignatureRequest.onExtraCallbackWithResult = r0
            int r7 = r7 % r4
        L84:
            int r7 = viva.republica.toss.network.model.SignatureRequest.onExtraCallbackWithResult
            int r7 = r7 + 23
            int r0 = r7 % 128
            viva.republica.toss.network.model.SignatureRequest.onExtraCallback = r0
            int r7 = r7 % r4
            if (r7 != 0) goto L90
            return r2
        L90:
            r2.hashCode()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.SignatureRequest.onWarmupCompleted(java.lang.Object[]):java.lang.Object");
    }

    public final String access100() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 45;
        onExtraCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.doc;
        int i4 = i2 + 109;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        SignatureRequest signatureRequest = (SignatureRequest) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 83;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = signatureRequest.signature;
        if (i3 == 0) {
            return str;
        }
        throw null;
    }

    public final String IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 29;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String str = this.date;
        if (i3 == 0) {
            int i4 = 51 / 0;
        }
        return str;
    }

    public final boolean getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 55;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        boolean z = this.useLv0Cert;
        int i5 = i3 + 89;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    private static final String onExtraCallbackWithResult(SignatureRequest signatureRequest, String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        String strOnNavigationEvent = signatureRequest.onNavigationEvent(str);
        int i4 = onExtraCallback + 55;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 66 / 0;
        }
        return strOnNavigationEvent;
    }

    public void onExtraCallbackWithResult(@NotNull TypeUtils2 typeUtils2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(typeUtils2, "");
        this.useLv0Cert = !Intrinsics.areEqual(typeUtils2.asInterface(), TypeUtilsMethodInheritanceComparator.onExtraCallbackWithResult.IAuthTabCallback);
        isMalformed2 ismalformed2OnExtraCallback = typeUtils2.onExtraCallback(new Function1() { // from class: viva.republica.toss.network.model.SignatureRequest$$ExternalSyntheticLambda1
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 115;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                SignatureRequest signatureRequest = this.f$0;
                String str = (String) obj;
                if (i4 != 0) {
                    return SignatureRequest.onWarmupCompleted(signatureRequest, str);
                }
                String strOnWarmupCompleted = SignatureRequest.onWarmupCompleted(signatureRequest, str);
                int i5 = 55 / 0;
                return strOnWarmupCompleted;
            }
        });
        this.date = ismalformed2OnExtraCallback.onExtraCallbackWithResult();
        this.doc = ismalformed2OnExtraCallback.IAuthTabCallback();
        this.signature = ismalformed2OnExtraCallback.onWarmupCompleted();
        int i2 = onExtraCallback + 17;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 22 / 0;
        }
    }

    public final String IAuthTabCallbackStubProxy() {
        return (String) IAuthTabCallback(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), 840573528, new Object[]{this}, -840573527, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult());
    }
}
