package viva.republica.toss.network.model.verify;

import com.google.gson.annotations.SerializedName;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import o.LocalAsyncImageModelEqualityDelegateKtExternalSyntheticLambda0;
import o.PhotoGrid;
import o.Response;
import o.TombstoneProtosMemoryMappingBuilder;
import o.UserChoiceBillingListener;
import o.giw;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.NotNull;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class VerifyBaseInfo {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted = 1;

    @SerializedName("clientOs")
    private final String clientOs;

    @SerializedName("deviceId")
    private final String deviceId;

    @SerializedName("requesterCode")
    private String requesterCode;

    @SerializedName("requesterId")
    private long requesterId;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.verify.VerifyBaseInfo$$ExternalSyntheticLambda0
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 25;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnExtraCallbackWithResult = VerifyBaseInfo.onExtraCallbackWithResult();
            int i4 = onExtraCallbackWithResult + 87;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerOnExtraCallbackWithResult;
        }
    });

    public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 29;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallback = onExtraCallback();
        int i4 = onExtraCallbackWithResult + 85;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnExtraCallback;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final /* synthetic */ KSerializer onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 83;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializer = (KSerializer) VerifyBaseInfo.onWarmupCompleted().getValue();
            int i4 = IAuthTabCallback + 65;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return kSerializer;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final KSerializer<VerifyBaseInfo> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 103;
            IAuthTabCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                onExtraCallback();
                obj.hashCode();
                throw null;
            }
            KSerializer<VerifyBaseInfo> kSerializerOnExtraCallback = onExtraCallback();
            int i3 = onExtraCallback + 51;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return kSerializerOnExtraCallback;
            }
            throw null;
        }
    }

    static {
        int i = onWarmupCompleted + 57;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public VerifyBaseInfo() {
        this.requesterCode = "";
        Response response = Response.onNavigationEvent;
        this.deviceId = ((LocalAsyncImageModelEqualityDelegateKtExternalSyntheticLambda0) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), LocalAsyncImageModelEqualityDelegateKtExternalSyntheticLambda0.class)).IAuthTabCallback_Parcel().onNavigationEvent();
        this.clientOs = PhotoGrid.onExtraCallbackWithResult();
    }

    public /* synthetic */ VerifyBaseInfo(int i, String str, long j, String str2, String str3, okycx okycxVar) {
        if ((i & 1) == 0) {
            int i2 = IAuthTabCallback + 3;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
            str = "";
        }
        this.requesterCode = str;
        if ((i & 2) == 0) {
            this.requesterId = 0L;
        } else {
            this.requesterId = j;
        }
        if ((i & 4) == 0) {
            int i4 = onExtraCallbackWithResult + 75;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            Response response = Response.onNavigationEvent;
            this.deviceId = ((LocalAsyncImageModelEqualityDelegateKtExternalSyntheticLambda0) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), LocalAsyncImageModelEqualityDelegateKtExternalSyntheticLambda0.class)).IAuthTabCallback_Parcel().onNavigationEvent();
        } else {
            this.deviceId = str2;
        }
        if ((i & 8) != 0) {
            this.clientOs = str3;
            return;
        }
        this.clientOs = PhotoGrid.onExtraCallbackWithResult();
        int i6 = IAuthTabCallback + 105;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 13 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void IAuthTabCallback(viva.republica.toss.network.model.verify.VerifyBaseInfo r6, o.vyl r7, kotlinx.serialization.descriptors.SerialDescriptor r8) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.verify.VerifyBaseInfo.onExtraCallbackWithResult
            int r1 = r1 + 5
            int r2 = r1 % 128
            viva.republica.toss.network.model.verify.VerifyBaseInfo.IAuthTabCallback = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L17
            boolean r1 = r7.onWarmupCompleted(r8, r3)
            if (r1 == r3) goto L27
            goto L1d
        L17:
            boolean r1 = r7.onWarmupCompleted(r8, r2)
            if (r1 != 0) goto L27
        L1d:
            java.lang.String r1 = r6.requesterCode
            java.lang.String r4 = ""
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            if (r1 != 0) goto L2c
        L27:
            java.lang.String r1 = r6.requesterCode
            r7.onExtraCallback(r8, r2, r1)
        L2c:
            boolean r1 = r7.onWarmupCompleted(r8, r3)
            if (r1 != 0) goto L43
            int r1 = viva.republica.toss.network.model.verify.VerifyBaseInfo.IAuthTabCallback
            int r1 = r1 + 93
            int r2 = r1 % 128
            viva.republica.toss.network.model.verify.VerifyBaseInfo.onExtraCallbackWithResult = r2
            int r1 = r1 % r0
            long r1 = r6.requesterId
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L48
        L43:
            long r1 = r6.requesterId
            r7.onExtraCallback(r8, r3, r1)
        L48:
            boolean r1 = r7.onWarmupCompleted(r8, r0)
            r1 = r1 ^ r3
            if (r1 == r3) goto L50
            goto L7b
        L50:
            int r1 = viva.republica.toss.network.model.verify.VerifyBaseInfo.IAuthTabCallback
            int r1 = r1 + 113
            int r2 = r1 % 128
            viva.republica.toss.network.model.verify.VerifyBaseInfo.onExtraCallbackWithResult = r2
            int r1 = r1 % r0
            if (r1 == 0) goto La2
            java.lang.String r1 = r6.deviceId
            o.Response r2 = o.Response.onNavigationEvent
            o.UserChoiceBillingListener r2 = o.UserChoiceBillingListener.onExtraCallback
            android.content.Context r2 = r2.onExtraCallback()
            java.lang.Class<o.LocalAsyncImageModelEqualityDelegateKtExternalSyntheticLambda0> r3 = o.LocalAsyncImageModelEqualityDelegateKtExternalSyntheticLambda0.class
            java.lang.Object r2 = o.Response.onExtraCallback(r2, r3)
            o.LocalAsyncImageModelEqualityDelegateKtExternalSyntheticLambda0 r2 = (o.LocalAsyncImageModelEqualityDelegateKtExternalSyntheticLambda0) r2
            o.ConstraintsSizeResolverExternalSyntheticLambda0 r2 = r2.IAuthTabCallback_Parcel()
            java.lang.String r2 = r2.onNavigationEvent()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L80
        L7b:
            java.lang.String r1 = r6.deviceId
            r7.onExtraCallback(r8, r0, r1)
        L80:
            r1 = 3
            boolean r2 = r7.onWarmupCompleted(r8, r1)
            if (r2 != 0) goto L93
            java.lang.String r2 = r6.clientOs
            java.lang.String r3 = o.PhotoGrid.onExtraCallbackWithResult()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            if (r2 != 0) goto La1
        L93:
            java.lang.String r6 = r6.clientOs
            r7.onExtraCallback(r8, r1, r6)
            int r6 = viva.republica.toss.network.model.verify.VerifyBaseInfo.onExtraCallbackWithResult
            int r6 = r6 + 19
            int r7 = r6 % 128
            viva.republica.toss.network.model.verify.VerifyBaseInfo.IAuthTabCallback = r7
            int r6 = r6 % r0
        La1:
            return
        La2:
            java.lang.String r6 = r6.deviceId
            o.Response r7 = o.Response.onNavigationEvent
            o.UserChoiceBillingListener r7 = o.UserChoiceBillingListener.onExtraCallback
            android.content.Context r7 = r7.onExtraCallback()
            java.lang.Class<o.LocalAsyncImageModelEqualityDelegateKtExternalSyntheticLambda0> r8 = o.LocalAsyncImageModelEqualityDelegateKtExternalSyntheticLambda0.class
            java.lang.Object r7 = o.Response.onExtraCallback(r7, r8)
            o.LocalAsyncImageModelEqualityDelegateKtExternalSyntheticLambda0 r7 = (o.LocalAsyncImageModelEqualityDelegateKtExternalSyntheticLambda0) r7
            o.ConstraintsSizeResolverExternalSyntheticLambda0 r7 = r7.IAuthTabCallback_Parcel()
            java.lang.String r7 = r7.onNavigationEvent()
            kotlin.jvm.internal.Intrinsics.areEqual(r6, r7)
            r6 = 0
            r6.hashCode()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.verify.VerifyBaseInfo.IAuthTabCallback(viva.republica.toss.network.model.verify.VerifyBaseInfo, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    private static final /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        giw giwVar = new giw(Reflection.getOrCreateKotlinClass(VerifyBaseInfo.class), new Annotation[0]);
        int i2 = IAuthTabCallback + 103;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return giwVar;
    }

    public static final /* synthetic */ Lazy onWarmupCompleted() {
        Lazy<KSerializer<Object>> lazy;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 105;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 != 0) {
            lazy = $cachedSerializer$delegate;
            int i4 = 8 / 0;
        } else {
            lazy = $cachedSerializer$delegate;
        }
        int i5 = i3 + 17;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return lazy;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onExtraCallbackWithResult(@NotNull String str, long j) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 7;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.requesterCode = str;
            this.requesterId = j;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.requesterCode = str;
            this.requesterId = j;
            int i3 = 8 / 0;
        }
    }
}
