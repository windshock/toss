package viva.republica.toss.network.model.loan;

import android.os.Parcel;
import android.os.Parcelable;
import com.iap.ac.android.biz.common.rpc.request.MobilePaymentInquireQuoteRequest;
import im.toss.deeplink.ksp.registry.FeaturesMydataKspDeepLinkRegistry$;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkCanOpenLandingPage;
import o.liq;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.loan.RefinancingInquiryResponse$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RefinancingInquiryResponse implements Parcelable {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final List<LoanAccountInfoResponse> accounts;
    private final boolean alarmTarget;
    private final long preScreenElapsedMilliSeconds;
    private final boolean refinancingEventExposure;
    private final String status;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<RefinancingInquiryResponse> CREATOR = new Creator();
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.loan.RefinancingInquiryResponse$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 43;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
                throw null;
            }
            int iOnExtraCallbackWithResult3 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult4 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
            KSerializer kSerializer = (KSerializer) RefinancingInquiryResponse.IAuthTabCallback(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), 105127217, iOnExtraCallbackWithResult4, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, new Object[0], -105127217);
            int i3 = onNavigationEvent + 45;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 77 / 0;
            }
            return kSerializer;
        }
    })};

    public static final class Creator implements Parcelable.Creator<RefinancingInquiryResponse> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ RefinancingInquiryResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 31;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                onExtraCallbackWithResult(parcel);
                throw null;
            }
            RefinancingInquiryResponse refinancingInquiryResponseOnExtraCallbackWithResult = onExtraCallbackWithResult(parcel);
            int i3 = IAuthTabCallback + 37;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 7 / 0;
            }
            return refinancingInquiryResponseOnExtraCallbackWithResult;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ RefinancingInquiryResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 39;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                return onExtraCallbackWithResult(i);
            }
            onExtraCallbackWithResult(i);
            throw null;
        }

        public final RefinancingInquiryResponse onExtraCallbackWithResult(Parcel parcel) {
            boolean z;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 111;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            boolean z2 = i3 == 0 ? parcel.readInt() != 0 : parcel.readInt() != 0;
            long j = parcel.readLong();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                int i4 = IAuthTabCallback + 23;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                z = false;
            }
            String string = parcel.readString();
            int i6 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i6);
            for (int i7 = 0; i7 != i6; i7++) {
                arrayList.add(LoanAccountInfoResponse.CREATOR.createFromParcel(parcel));
            }
            return new RefinancingInquiryResponse(z2, j, z, string, arrayList);
        }

        public final RefinancingInquiryResponse[] onExtraCallbackWithResult(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 11;
            int i4 = i3 % 128;
            IAuthTabCallback = i4;
            int i5 = i3 % 2;
            RefinancingInquiryResponse[] refinancingInquiryResponseArr = new RefinancingInquiryResponse[i];
            int i6 = i4 + 43;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return refinancingInquiryResponseArr;
        }
    }

    public RefinancingInquiryResponse() {
        this(false, 0L, false, (String) null, (List) null, 31, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~(i6 | i2 | i5);
        int i8 = ~i2;
        int i9 = (~(i8 | i5)) | (~((~i5) | i6));
        int i10 = (~(i5 | (~i6))) | i8;
        int i11 = i6 + i2 + i3 + ((-2044576983) * i) + (1743660113 * i4);
        int i12 = i11 * i11;
        int i13 = ((1047202342 * i6) - 713031680) + (164951516 * i2) + (i7 * 441125413) + (441125413 * i9) + ((-441125413) * i10) + (606076928 * i3) + (689963008 * i) + ((-299892736) * i4) + ((-1081737216) * i12);
        int i14 = ((i6 * 2048727874) - 782056376) + (i2 * 2048728756) + (i7 * (-441)) + (i9 * (-441)) + (i10 * 441) + (i3 * 2048728315) + (i * 2142076211) + (i4 * (-1448904853)) + (i12 * 1885470720);
        return i13 + ((i14 * i14) * (-1618345984)) != 1 ? onNavigationEvent(objArr) : IAuthTabCallback(objArr);
    }

    private static final /* synthetic */ KSerializer IAuthTabCallbackDefault() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(LoanAccountInfoResponse$$serializer.INSTANCE);
        int i2 = onExtraCallbackWithResult + 1;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 73;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        int i4 = onExtraCallbackWithResult + 45;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerIAuthTabCallbackDefault;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 93;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(!(obj instanceof RefinancingInquiryResponse))) {
            RefinancingInquiryResponse refinancingInquiryResponse = (RefinancingInquiryResponse) obj;
            if (this.refinancingEventExposure != refinancingInquiryResponse.refinancingEventExposure) {
                return false;
            }
            if (this.preScreenElapsedMilliSeconds != refinancingInquiryResponse.preScreenElapsedMilliSeconds) {
                int i2 = onExtraCallback + 15;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            if (this.alarmTarget != refinancingInquiryResponse.alarmTarget) {
                int i4 = onExtraCallback + 71;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.status, refinancingInquiryResponse.status)) {
                if (Intrinsics.areEqual(this.accounts, refinancingInquiryResponse.accounts)) {
                    return true;
                }
                int i6 = onExtraCallback + 23;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 45;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((Boolean.hashCode(this.refinancingEventExposure) * 31) + Long.hashCode(this.preScreenElapsedMilliSeconds)) * 31) + Boolean.hashCode(this.alarmTarget)) * 31) + this.status.hashCode()) * 31) + this.accounts.hashCode();
        int i4 = onExtraCallbackWithResult + 9;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RefinancingInquiryResponse(refinancingEventExposure=" + this.refinancingEventExposure + ", preScreenElapsedMilliSeconds=" + this.preScreenElapsedMilliSeconds + ", alarmTarget=" + this.alarmTarget + ", status=" + this.status + ", accounts=" + this.accounts + ")";
        int i2 = onExtraCallbackWithResult + 3;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.refinancingEventExposure ? 1 : 0);
        parcel.writeLong(this.preScreenElapsedMilliSeconds);
        parcel.writeInt(this.alarmTarget ? 1 : 0);
        parcel.writeString(this.status);
        List<LoanAccountInfoResponse> list = this.accounts;
        parcel.writeInt(list.size());
        Iterator<LoanAccountInfoResponse> it = list.iterator();
        int i3 = onExtraCallbackWithResult + 111;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        while (it.hasNext()) {
            int i5 = onExtraCallback + 55;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                Object[] objArr = {it.next(), parcel, Integer.valueOf(i)};
                LoanAccountInfoResponse.onNavigationEvent(-670116786, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 670116789, objArr);
                int i6 = 79 / 0;
            } else {
                Object[] objArr2 = {it.next(), parcel, Integer.valueOf(i)};
                LoanAccountInfoResponse.onNavigationEvent(-670116786, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 670116789, objArr2);
            }
        }
    }

    public static final class Companion {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<RefinancingInquiryResponse> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 23;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            RefinancingInquiryResponse$.serializer serializerVar = RefinancingInquiryResponse$.serializer.INSTANCE;
            if (i3 == 0) {
                return serializerVar;
            }
            throw null;
        }
    }

    static {
        int i = IAuthTabCallback + 53;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ RefinancingInquiryResponse(int r2, boolean r3, long r4, boolean r6, java.lang.String r7, java.util.List r8, o.okycx r9) {
        /*
            r1 = this;
            r1.<init>()
            r9 = r2 & 1
            r0 = 0
            if (r9 != 0) goto Lb
            r1.refinancingEventExposure = r0
            goto Ld
        Lb:
            r1.refinancingEventExposure = r3
        Ld:
            r3 = r2 & 2
            r9 = 2
            if (r3 != 0) goto L1d
            int r3 = viva.republica.toss.network.model.loan.RefinancingInquiryResponse.onExtraCallback
            int r3 = r3 + 37
            int r4 = r3 % 128
            viva.republica.toss.network.model.loan.RefinancingInquiryResponse.onExtraCallbackWithResult = r4
            int r3 = r3 % r9
            r4 = 0
        L1d:
            r1.preScreenElapsedMilliSeconds = r4
            r3 = r2 & 4
            if (r3 != 0) goto L38
            int r3 = viva.republica.toss.network.model.loan.RefinancingInquiryResponse.onExtraCallbackWithResult
            int r3 = r3 + 85
            int r4 = r3 % 128
            viva.republica.toss.network.model.loan.RefinancingInquiryResponse.onExtraCallback = r4
            int r3 = r3 % r9
            r1.alarmTarget = r0
            int r4 = r4 + 3
            int r3 = r4 % 128
            viva.republica.toss.network.model.loan.RefinancingInquiryResponse.onExtraCallbackWithResult = r3
            int r4 = r4 % r9
            if (r4 != 0) goto L43
            goto L45
        L38:
            r1.alarmTarget = r6
            int r3 = viva.republica.toss.network.model.loan.RefinancingInquiryResponse.onExtraCallbackWithResult
            int r3 = r3 + 91
            int r4 = r3 % 128
            viva.republica.toss.network.model.loan.RefinancingInquiryResponse.onExtraCallback = r4
            int r3 = r3 % r9
        L43:
            int r3 = r9 % r9
        L45:
            r3 = r2 & 8
            if (r3 != 0) goto L5f
            int r3 = viva.republica.toss.network.model.loan.RefinancingInquiryResponse.onExtraCallback
            int r3 = r3 + 73
            int r4 = r3 % 128
            viva.republica.toss.network.model.loan.RefinancingInquiryResponse.onExtraCallbackWithResult = r4
            int r3 = r3 % r9
            java.lang.String r4 = "INIT"
            r1.status = r4
            if (r3 == 0) goto L5a
            int r9 = r9 % r9
            goto L61
        L5a:
            r2 = 0
            r2.hashCode()
            throw r2
        L5f:
            r1.status = r7
        L61:
            r2 = r2 & 16
            if (r2 != 0) goto L6c
            java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
            r1.accounts = r2
            return
        L6c:
            r1.accounts = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.RefinancingInquiryResponse.<init>(int, boolean, long, boolean, java.lang.String, java.util.List, o.okycx):void");
    }

    public RefinancingInquiryResponse(boolean z, long j, boolean z2, @NotNull String str, @NotNull List<LoanAccountInfoResponse> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.refinancingEventExposure = z;
        this.preScreenElapsedMilliSeconds = j;
        this.alarmTarget = z2;
        this.status = str;
        this.accounts = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object IAuthTabCallback(java.lang.Object[] r10) {
        /*
            r0 = 0
            r1 = r10[r0]
            viva.republica.toss.network.model.loan.RefinancingInquiryResponse r1 = (viva.republica.toss.network.model.loan.RefinancingInquiryResponse) r1
            r2 = 1
            r3 = r10[r2]
            o.vyl r3 = (o.vyl) r3
            r4 = 2
            r10 = r10[r4]
            kotlinx.serialization.descriptors.SerialDescriptor r10 = (kotlinx.serialization.descriptors.SerialDescriptor) r10
            int r5 = r4 % r4
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r5 = viva.republica.toss.network.model.loan.RefinancingInquiryResponse.$childSerializers
            boolean r6 = r3.onWarmupCompleted(r10, r0)
            if (r6 != 0) goto L30
            int r6 = viva.republica.toss.network.model.loan.RefinancingInquiryResponse.onExtraCallbackWithResult
            int r6 = r6 + 105
            int r7 = r6 % 128
            viva.republica.toss.network.model.loan.RefinancingInquiryResponse.onExtraCallback = r7
            int r6 = r6 % r4
            if (r6 == 0) goto L2c
            boolean r6 = r1.refinancingEventExposure
            r7 = 60
            int r7 = r7 / r0
            if (r6 == r2) goto L30
            goto L35
        L2c:
            boolean r6 = r1.refinancingEventExposure
            if (r6 == 0) goto L35
        L30:
            boolean r6 = r1.refinancingEventExposure
            r3.onNavigationEvent(r10, r0, r6)
        L35:
            boolean r0 = r3.onWarmupCompleted(r10, r2)
            if (r0 != 0) goto L55
            int r0 = viva.republica.toss.network.model.loan.RefinancingInquiryResponse.onExtraCallbackWithResult
            int r0 = r0 + 13
            int r6 = r0 % 128
            viva.republica.toss.network.model.loan.RefinancingInquiryResponse.onExtraCallback = r6
            int r0 = r0 % r4
            long r6 = r1.preScreenElapsedMilliSeconds
            if (r0 == 0) goto L4f
            r8 = 1
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 == 0) goto L63
            goto L55
        L4f:
            r8 = 0
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 == 0) goto L63
        L55:
            long r6 = r1.preScreenElapsedMilliSeconds
            r3.onExtraCallback(r10, r2, r6)
            int r0 = viva.republica.toss.network.model.loan.RefinancingInquiryResponse.onExtraCallback
            int r0 = r0 + 5
            int r2 = r0 % 128
            viva.republica.toss.network.model.loan.RefinancingInquiryResponse.onExtraCallbackWithResult = r2
            int r0 = r0 % r4
        L63:
            boolean r0 = r3.onWarmupCompleted(r10, r4)
            r2 = 0
            if (r0 != 0) goto L7d
            int r0 = viva.republica.toss.network.model.loan.RefinancingInquiryResponse.onExtraCallbackWithResult
            int r0 = r0 + 91
            int r6 = r0 % 128
            viva.republica.toss.network.model.loan.RefinancingInquiryResponse.onExtraCallback = r6
            int r0 = r0 % r4
            if (r0 != 0) goto L7a
            boolean r0 = r1.alarmTarget
            if (r0 == 0) goto L82
            goto L7d
        L7a:
            boolean r10 = r1.alarmTarget
            throw r2
        L7d:
            boolean r0 = r1.alarmTarget
            r3.onNavigationEvent(r10, r4, r0)
        L82:
            r0 = 3
            boolean r6 = r3.onWarmupCompleted(r10, r0)
            if (r6 != 0) goto L93
            java.lang.String r6 = r1.status
            java.lang.String r7 = "INIT"
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r7)
            if (r6 != 0) goto L98
        L93:
            java.lang.String r6 = r1.status
            r3.onExtraCallback(r10, r0, r6)
        L98:
            r0 = 4
            boolean r6 = r3.onWarmupCompleted(r10, r0)
            if (r6 != 0) goto Lab
            java.util.List<viva.republica.toss.network.model.loan.LoanAccountInfoResponse> r6 = r1.accounts
            java.util.List r7 = kotlin.collections.CollectionsKt.emptyList()
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r7)
            if (r6 != 0) goto Lb8
        Lab:
            r5 = r5[r0]
            java.lang.Object r5 = r5.getValue()
            o.py r5 = (o.py) r5
            java.util.List<viva.republica.toss.network.model.loan.LoanAccountInfoResponse> r1 = r1.accounts
            r3.onNavigationEvent(r10, r0, r5, r1)
        Lb8:
            int r10 = viva.republica.toss.network.model.loan.RefinancingInquiryResponse.onExtraCallback
            int r10 = r10 + 13
            int r0 = r10 % 128
            viva.republica.toss.network.model.loan.RefinancingInquiryResponse.onExtraCallbackWithResult = r0
            int r10 = r10 % r4
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.RefinancingInquiryResponse.IAuthTabCallback(java.lang.Object[]):java.lang.Object");
    }

    public static final /* synthetic */ Lazy[] onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 11;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i2 + 5;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return lazyArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RefinancingInquiryResponse(boolean z, long j, boolean z2, String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z3 = false;
        if ((i & 1) != 0) {
            int i2 = onExtraCallbackWithResult + 87;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            z = false;
        }
        long j2 = (i & 2) != 0 ? 0L : j;
        if ((i & 4) != 0) {
            int i4 = onExtraCallbackWithResult + 97;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        } else {
            z3 = z2;
        }
        String str2 = (i & 8) != 0 ? "INIT" : str;
        if ((i & 16) != 0) {
            int i7 = onExtraCallbackWithResult + 29;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            list = CollectionsKt.emptyList();
            int i9 = 2 % 2;
        }
        this(z, j2, z3, str2, list);
    }

    public final boolean IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 37;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        boolean z = this.refinancingEventExposure;
        int i4 = i2 + 115;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final long onExtraCallbackWithResult() {
        long j;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 89;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            j = this.preScreenElapsedMilliSeconds;
            int i4 = 36 / 0;
        } else {
            j = this.preScreenElapsedMilliSeconds;
        }
        int i5 = i2 + 65;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        throw null;
    }

    public final boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 105;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.alarmTarget;
        int i5 = i2 + 29;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final List<LoanAccountInfoResponse> onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 111;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        List<LoanAccountInfoResponse> list = this.accounts;
        int i5 = i2 + 67;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final RefinancingStatus onTransact() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String str = this.status;
        switch (str.hashCode()) {
            case -1922596236:
                if (str.equals("REFINANCING_CHECK_DONE")) {
                    return RefinancingStatus.REFINANCING_CHECK_DONE;
                }
                break;
            case -975821154:
                if (str.equals("REFINANCING_PRE_SCREEN_DONE")) {
                    int i4 = onExtraCallbackWithResult + 93;
                    onExtraCallback = i4 % 128;
                    if (i4 % 2 != 0) {
                        RefinancingStatus refinancingStatus = RefinancingStatus.REFINANCING_PRE_SCREEN_DONE;
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    RefinancingStatus refinancingStatus2 = RefinancingStatus.REFINANCING_PRE_SCREEN_DONE;
                    int i5 = onExtraCallback + 99;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    return refinancingStatus2;
                }
                break;
            case -901713595:
                if (str.equals("REFINANCING_CHECK_PENDING")) {
                    return RefinancingStatus.REFINANCING_CHECK_PENDING;
                }
                break;
            case 443759744:
                if (str.equals("REFINANCING_PRE_SCREEN_LOADING")) {
                    int i7 = onExtraCallbackWithResult + 59;
                    onExtraCallback = i7 % 128;
                    if (i7 % 2 == 0) {
                        return RefinancingStatus.REFINANCING_PRE_SCREEN_LOADING;
                    }
                    int i8 = 8 / 0;
                    return RefinancingStatus.REFINANCING_PRE_SCREEN_LOADING;
                }
                break;
        }
        RefinancingStatus refinancingStatus3 = RefinancingStatus.INIT;
        int i9 = onExtraCallback + 17;
        onExtraCallbackWithResult = i9 % 128;
        int i10 = i9 % 2;
        return refinancingStatus3;
    }

    public static /* synthetic */ KSerializer onWarmupCompleted() {
        int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        return (KSerializer) IAuthTabCallback(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), 105127217, iOnExtraCallbackWithResult2, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[0], -105127217);
    }

    @JvmStatic
    public static final /* synthetic */ void IAuthTabCallback(RefinancingInquiryResponse refinancingInquiryResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
        int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        IAuthTabCallback(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), 1560864129, iOnExtraCallbackWithResult2, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[]{refinancingInquiryResponse, vylVar, serialDescriptor}, -1560864128);
    }
}
