package viva.republica.toss.network.model.transfer;

import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
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
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.TombstoneProtosMemoryMappingBuilder;
import o.appInfo;
import o.checkCanOpenLandingPage;
import o.getWriggleLayout;
import o.htf31;
import o.kt;
import o.liq;
import o.nc;
import o.okycx;
import o.onHostResume;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.transfer.SendPreAction;
import viva.republica.toss.network.model.transfer.SendPreAction$Send$$serializer;

@appInfo(IAuthTabCallback = "action")
@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class SendPreAction implements Parcelable {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
    public static final int $stable = 0;
    public static final Companion Companion;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int[] onWarmupCompleted;
    private final String transferUniqueKey;

    public /* synthetic */ SendPreAction(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public static /* synthetic */ KSerializer onWarmupCompleted() throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback();
        }
        IAuthTabCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final /* synthetic */ KSerializer onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 123;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializer = (KSerializer) SendPreAction.onExtraCallbackWithResult().getValue();
            if (i3 == 0) {
                int i4 = 84 / 0;
            }
            return kSerializer;
        }

        public final KSerializer<SendPreAction> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 73;
            onExtraCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                onNavigationEvent();
                obj.hashCode();
                throw null;
            }
            KSerializer<SendPreAction> kSerializerOnNavigationEvent = onNavigationEvent();
            int i3 = onExtraCallbackWithResult + 125;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return kSerializerOnNavigationEvent;
            }
            obj.hashCode();
            throw null;
        }
    }

    static {
        onExtraCallback();
        Companion = new Companion(null);
        $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.transfer.SendPreAction$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() throws Throwable {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 53;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnWarmupCompleted = SendPreAction.onWarmupCompleted();
                int i4 = onNavigationEvent + 15;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return kSerializerOnWarmupCompleted;
                }
                throw null;
            }
        });
        int i = onExtraCallbackWithResult + 43;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ SendPreAction(int i, String str, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.transferUniqueKey = null;
            int i2 = onExtraCallback + 7;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        this.transferUniqueKey = str;
        int i4 = onExtraCallback + 85;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private SendPreAction(String str) {
        this.transferUniqueKey = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final /* synthetic */ KSerializer IAuthTabCallback() throws Throwable {
        int i = 2 % 2;
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SendPreAction.class);
        KClass[] kClassArr = {Reflection.getOrCreateKotlinClass(Display.class), Reflection.getOrCreateKotlinClass(Redirect.class), Reflection.getOrCreateKotlinClass(Send.class)};
        KSerializer[] kSerializerArr = {SendPreAction$Display$$serializer.INSTANCE, SendPreAction$Redirect$$serializer.INSTANCE, SendPreAction$Send$$serializer.INSTANCE};
        Object[] objArr = new Object[1];
        a(new int[]{1282179944, 2123112676, 112378611, 385399194}, (ViewConfiguration.getEdgeSlop() >> 16) + 6, objArr);
        kt ktVar = new kt("viva.republica.toss.network.model.transfer.SendPreAction", orCreateKotlinClass, kClassArr, kSerializerArr, new Annotation[]{new SendPreAction$Send$$serializer.onWarmupCompleted(((String) objArr[0]).intern())});
        int i2 = onExtraCallback + 93;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return ktVar;
    }

    @JvmStatic
    public static final /* synthetic */ void IAuthTabCallback(SendPreAction sendPreAction, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 117;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            int i4 = onNavigationEvent + 61;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            if (sendPreAction.transferUniqueKey == null) {
                return;
            }
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, sendPreAction.transferUniqueKey);
        int i6 = onNavigationEvent + 35;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
    }

    public static final /* synthetic */ Lazy onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 89;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>> lazy = $cachedSerializer$delegate;
        int i5 = i2 + 55;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 37 / 0;
        }
        return lazy;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SendPreAction(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        if ((i & 1) != 0) {
            int i2 = onNavigationEvent + 9;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 17;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            str = null;
        }
        this(str, defaultConstructorMarker2);
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 81;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.transferUniqueKey;
        int i4 = i2 + 91;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    @nc(IAuthTabCallback = "SEND")
    @liq
    public static final class Send extends SendPreAction {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        private final List<PreSendAlert> displayInfoList;
        private final String tossBankWebAuthRedirectUrl;
        private final BundleTransferInfo tossCoreBundleTransferInfo;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final Parcelable.Creator<Send> CREATOR = new onExtraCallback();
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.transfer.SendPreAction$Send$$ExternalSyntheticLambda0
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 11;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerIAuthTabCallback = SendPreAction.Send.IAuthTabCallback();
                int i4 = onExtraCallback + 67;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return kSerializerIAuthTabCallback;
            }
        }), null, null};

        public static final class onExtraCallback implements Parcelable.Creator<Send> {
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ Send createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 121;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Send sendOnNavigationEvent = onNavigationEvent(parcel);
                int i4 = onWarmupCompleted + 85;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return sendOnNavigationEvent;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ Send[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 19;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0) {
                    onWarmupCompleted(i);
                    throw null;
                }
                Send[] sendArrOnWarmupCompleted = onWarmupCompleted(i);
                int i4 = onWarmupCompleted + 5;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    return sendArrOnWarmupCompleted;
                }
                throw null;
            }

            public final Send onNavigationEvent(Parcel parcel) {
                BundleTransferInfo bundleTransferInfoCreateFromParcel;
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                int i3 = 0;
                while (i3 != i2) {
                    int i4 = onWarmupCompleted + 31;
                    onNavigationEvent = i4 % 128;
                    if (i4 % 2 != 0) {
                        arrayList.add(parcel.readParcelable(Send.class.getClassLoader()));
                        i3 += 8;
                    } else {
                        arrayList.add(parcel.readParcelable(Send.class.getClassLoader()));
                        i3++;
                    }
                }
                String string = parcel.readString();
                if (parcel.readInt() == 0) {
                    int i5 = onNavigationEvent + 21;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    bundleTransferInfoCreateFromParcel = null;
                } else {
                    bundleTransferInfoCreateFromParcel = BundleTransferInfo.CREATOR.createFromParcel(parcel);
                }
                return new Send(arrayList, string, bundleTransferInfoCreateFromParcel);
            }

            public final Send[] onWarmupCompleted(int i) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 123;
                int i4 = i3 % 128;
                onWarmupCompleted = i4;
                Send[] sendArr = new Send[i];
                if (i3 % 2 == 0) {
                    throw null;
                }
                int i5 = i4 + 17;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return sendArr;
            }
        }

        public Send() {
            this(null, null, null, 7, null);
        }

        public static /* synthetic */ KSerializer IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 99;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                IAuthTabCallbackDefault();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            KSerializer kSerializerIAuthTabCallbackDefault = IAuthTabCallbackDefault();
            int i3 = onWarmupCompleted + 85;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return kSerializerIAuthTabCallbackDefault;
        }

        private static final /* synthetic */ KSerializer IAuthTabCallbackDefault() {
            int i = 2 % 2;
            checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(onHostResume.INSTANCE);
            int i2 = onNavigationEvent + 5;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return checkcanopenlandingpage;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 65;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 27;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return 0;
            }
            throw null;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onWarmupCompleted + 39;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof Send)) {
                return false;
            }
            Send send = (Send) obj;
            if (Intrinsics.areEqual(this.displayInfoList, send.displayInfoList)) {
                return ((Intrinsics.areEqual(this.tossBankWebAuthRedirectUrl, send.tossBankWebAuthRedirectUrl) ^ true) || (Intrinsics.areEqual(this.tossCoreBundleTransferInfo, send.tossCoreBundleTransferInfo) ^ true)) ? false : true;
            }
            int i4 = onWarmupCompleted + 17;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int hashCode() {
            /*
                r7 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = viva.republica.toss.network.model.transfer.SendPreAction.Send.onWarmupCompleted
                int r1 = r1 + 109
                int r2 = r1 % 128
                viva.republica.toss.network.model.transfer.SendPreAction.Send.onNavigationEvent = r2
                int r1 = r1 % r0
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L1c
                java.util.List<viva.republica.toss.network.model.transfer.PreSendAlert> r1 = r7.displayInfoList
                int r1 = r1.hashCode()
                java.lang.String r4 = r7.tossBankWebAuthRedirectUrl
                if (r4 != 0) goto L36
                r4 = r2
                goto L27
            L1c:
                java.util.List<viva.republica.toss.network.model.transfer.PreSendAlert> r1 = r7.displayInfoList
                int r1 = r1.hashCode()
                java.lang.String r4 = r7.tossBankWebAuthRedirectUrl
                if (r4 != 0) goto L35
                r4 = r3
            L27:
                int r5 = viva.republica.toss.network.model.transfer.SendPreAction.Send.onNavigationEvent
                int r5 = r5 + 63
                int r6 = r5 % 128
                viva.republica.toss.network.model.transfer.SendPreAction.Send.onWarmupCompleted = r6
                int r5 = r5 % r0
                if (r5 != 0) goto L33
                goto L3c
            L33:
                r2 = r3
                goto L3c
            L35:
                r2 = r3
            L36:
                int r0 = r4.hashCode()
                r4 = r2
                r2 = r0
            L3c:
                viva.republica.toss.network.model.transfer.BundleTransferInfo r0 = r7.tossCoreBundleTransferInfo
                if (r0 == 0) goto L44
                int r4 = r0.hashCode()
            L44:
                int r1 = r1 * 31
                int r1 = r1 + r2
                int r1 = r1 * 31
                int r1 = r1 + r4
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.SendPreAction.Send.hashCode():int");
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Send(displayInfoList=" + this.displayInfoList + ", tossBankWebAuthRedirectUrl=" + this.tossBankWebAuthRedirectUrl + ", tossCoreBundleTransferInfo=" + this.tossCoreBundleTransferInfo + ")";
            int i2 = onWarmupCompleted + 113;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            throw null;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            List<PreSendAlert> list = this.displayInfoList;
            parcel.writeInt(list.size());
            Iterator<PreSendAlert> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable(it.next(), i);
                int i3 = onNavigationEvent + 123;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
            }
            parcel.writeString(this.tossBankWebAuthRedirectUrl);
            BundleTransferInfo bundleTransferInfo = this.tossCoreBundleTransferInfo;
            if (bundleTransferInfo != null) {
                parcel.writeInt(1);
                bundleTransferInfo.writeToParcel(parcel, i);
            } else {
                parcel.writeInt(0);
                int i5 = onWarmupCompleted + 121;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
            }
        }

        public static final class Companion {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Send> serializer() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 87;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                SendPreAction$Send$$serializer sendPreAction$Send$$serializer = SendPreAction$Send$$serializer.INSTANCE;
                int i4 = onExtraCallbackWithResult + 101;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return sendPreAction$Send$$serializer;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        static {
            int i = onExtraCallbackWithResult + 99;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }

        public /* synthetic */ Send(int i, String str, List list, String str2, BundleTransferInfo bundleTransferInfo, okycx okycxVar) {
            super(i, str, okycxVar);
            if ((i & 2) == 0) {
                this.displayInfoList = CollectionsKt.emptyList();
            } else {
                this.displayInfoList = list;
                int i2 = 2 % 2;
            }
            if ((i & 4) == 0) {
                int i3 = onNavigationEvent + 83;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                this.tossBankWebAuthRedirectUrl = null;
                if (i4 == 0) {
                    int i5 = 84 / 0;
                }
                int i6 = 2 % 2;
            } else {
                this.tossBankWebAuthRedirectUrl = str2;
            }
            if ((i & 8) != 0) {
                this.tossCoreBundleTransferInfo = bundleTransferInfo;
                return;
            }
            int i7 = onNavigationEvent;
            int i8 = i7 + 109;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            this.tossCoreBundleTransferInfo = null;
            int i10 = i7 + 5;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        public Send(@NotNull List<? extends PreSendAlert> list, @Nullable String str, @Nullable BundleTransferInfo bundleTransferInfo) {
            Intrinsics.checkNotNullParameter(list, "");
            String str2 = null;
            super(str2, 1, (DefaultConstructorMarker) str2);
            this.displayInfoList = list;
            this.tossBankWebAuthRedirectUrl = str;
            this.tossCoreBundleTransferInfo = bundleTransferInfo;
        }

        public static final /* synthetic */ Lazy[] IAuthTabCallbackStub() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 89;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return $childSerializers;
            }
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0030 A[PHI: r1
          0x0030: PHI (r1v10 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
          (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
          (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
          (r1v14 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
         binds: [B:8:0x0022, B:10:0x002e, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[PHI: r1
          0x0024: PHI (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
          (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
          (r1v14 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
         binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final /* synthetic */ void onNavigationEvent(viva.republica.toss.network.model.transfer.SendPreAction.Send r5, o.vyl r6, kotlinx.serialization.descriptors.SerialDescriptor r7) {
            /*
                r0 = 2
                int r1 = r0 % r0
                int r1 = viva.republica.toss.network.model.transfer.SendPreAction.Send.onNavigationEvent
                int r1 = r1 + 29
                int r2 = r1 % 128
                viva.republica.toss.network.model.transfer.SendPreAction.Send.onWarmupCompleted = r2
                int r1 = r1 % r0
                r2 = 1
                viva.republica.toss.network.model.transfer.SendPreAction.IAuthTabCallback(r5, r6, r7)
                if (r1 != 0) goto L1c
                kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.transfer.SendPreAction.Send.$childSerializers
                r3 = 0
                boolean r3 = r6.onWarmupCompleted(r7, r3)
                if (r3 == r2) goto L30
                goto L24
            L1c:
                kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.transfer.SendPreAction.Send.$childSerializers
                boolean r3 = r6.onWarmupCompleted(r7, r2)
                if (r3 != 0) goto L30
            L24:
                java.util.List<viva.republica.toss.network.model.transfer.PreSendAlert> r3 = r5.displayInfoList
                java.util.List r4 = kotlin.collections.CollectionsKt.emptyList()
                boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
                if (r3 != 0) goto L3d
            L30:
                r1 = r1[r2]
                java.lang.Object r1 = r1.getValue()
                o.py r1 = (o.py) r1
                java.util.List<viva.republica.toss.network.model.transfer.PreSendAlert> r3 = r5.displayInfoList
                r6.onNavigationEvent(r7, r2, r1, r3)
            L3d:
                boolean r1 = r6.onWarmupCompleted(r7, r0)
                if (r1 == r2) goto L47
                java.lang.String r1 = r5.tossBankWebAuthRedirectUrl
                if (r1 == 0) goto L4e
            L47:
                o.getWriggleLayout r1 = o.getWriggleLayout.onNavigationEvent
                java.lang.String r3 = r5.tossBankWebAuthRedirectUrl
                r6.onExtraCallbackWithResult(r7, r0, r1, r3)
            L4e:
                r1 = 3
                boolean r3 = r6.onWarmupCompleted(r7, r1)
                r3 = r3 ^ r2
                if (r3 == r2) goto L57
                goto L64
            L57:
                int r2 = viva.republica.toss.network.model.transfer.SendPreAction.Send.onWarmupCompleted
                int r2 = r2 + 103
                int r3 = r2 % 128
                viva.republica.toss.network.model.transfer.SendPreAction.Send.onNavigationEvent = r3
                int r2 = r2 % r0
                viva.republica.toss.network.model.transfer.BundleTransferInfo r0 = r5.tossCoreBundleTransferInfo
                if (r0 == 0) goto L6b
            L64:
                viva.republica.toss.network.model.transfer.BundleTransferInfo$$serializer r0 = viva.republica.toss.network.model.transfer.BundleTransferInfo$$serializer.INSTANCE
                viva.republica.toss.network.model.transfer.BundleTransferInfo r5 = r5.tossCoreBundleTransferInfo
                r6.onExtraCallbackWithResult(r7, r1, r0, r5)
            L6b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.SendPreAction.Send.onNavigationEvent(viva.republica.toss.network.model.transfer.SendPreAction$Send, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Send(List list, String str, BundleTransferInfo bundleTransferInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
            list = (i & 1) != 0 ? CollectionsKt.emptyList() : list;
            if ((i & 2) != 0) {
                int i2 = onNavigationEvent + 13;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    throw null;
                }
                str = null;
            }
            if ((i & 4) != 0) {
                int i3 = onNavigationEvent + 79;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
                bundleTransferInfo = null;
            }
            this(list, str, bundleTransferInfo);
        }

        public final List<PreSendAlert> asBinder() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 51;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            List<PreSendAlert> list = this.displayInfoList;
            int i5 = i3 + 29;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return list;
        }

        public final String onTransact() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 27;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            String str = this.tossBankWebAuthRedirectUrl;
            int i5 = i2 + 103;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final BundleTransferInfo asInterface() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 99;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            BundleTransferInfo bundleTransferInfo = this.tossCoreBundleTransferInfo;
            int i5 = i2 + 117;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return bundleTransferInfo;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @nc(IAuthTabCallback = "REDIRECT")
    @liq
    public static final class Redirect extends SendPreAction {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Redirect> CREATOR = new onWarmupCompleted();
        public static final Companion Companion;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        private final String redirectUrl;

        public static final class onWarmupCompleted implements Parcelable.Creator<Redirect> {
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ Redirect createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 45;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    onWarmupCompleted(parcel);
                    throw null;
                }
                Redirect redirectOnWarmupCompleted = onWarmupCompleted(parcel);
                int i3 = onWarmupCompleted + 49;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                return redirectOnWarmupCompleted;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ Redirect[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 25;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Redirect[] redirectArrOnWarmupCompleted = onWarmupCompleted(i);
                int i5 = IAuthTabCallback + 5;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return redirectArrOnWarmupCompleted;
            }

            public final Redirect onWarmupCompleted(Parcel parcel) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                Redirect redirect = new Redirect(parcel.readString());
                int i2 = onWarmupCompleted + 105;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return redirect;
            }

            public final Redirect[] onWarmupCompleted(int i) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 61;
                IAuthTabCallback = i3 % 128;
                Redirect[] redirectArr = new Redirect[i];
                if (i3 % 2 != 0) {
                    return redirectArr;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        static {
            DefaultConstructorMarker defaultConstructorMarker = null;
            Companion = new Companion(defaultConstructorMarker);
            int i = onWarmupCompleted + 17;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 == 0) {
                return;
            }
            defaultConstructorMarker.hashCode();
            throw null;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Redirect() {
            String str = null;
            this(str, 1, str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 79;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 3;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 83;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            if (i2 % 2 == 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Redirect)) {
                int i4 = i3 + 5;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.redirectUrl, ((Redirect) obj).redirectUrl)) {
                return true;
            }
            int i6 = onNavigationEvent + 105;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 95;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                this.redirectUrl.hashCode();
                throw null;
            }
            int iHashCode = this.redirectUrl.hashCode();
            int i3 = onNavigationEvent + 113;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Redirect(redirectUrl=" + this.redirectUrl + ")";
            int i2 = onExtraCallback + 7;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 115;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.redirectUrl);
            int i5 = onNavigationEvent + 5;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static final class Companion {
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Redirect> serializer() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 5;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    SendPreAction$Redirect$$serializer sendPreAction$Redirect$$serializer = SendPreAction$Redirect$$serializer.INSTANCE;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                SendPreAction$Redirect$$serializer sendPreAction$Redirect$$serializer2 = SendPreAction$Redirect$$serializer.INSTANCE;
                int i3 = onWarmupCompleted + 3;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                return sendPreAction$Redirect$$serializer2;
            }
        }

        public /* synthetic */ Redirect(int i, String str, String str2, okycx okycxVar) {
            super(i, str, okycxVar);
            if ((i & 2) != 0) {
                this.redirectUrl = str2;
                int i2 = onExtraCallback + 37;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return;
            }
            this.redirectUrl = "";
            int i4 = onExtraCallback + 39;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 53 / 0;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Redirect(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            String str2 = null;
            super(str2, 1, (DefaultConstructorMarker) str2);
            this.redirectUrl = str;
        }

        @JvmStatic
        public static final /* synthetic */ void onExtraCallbackWithResult(Redirect redirect, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            SendPreAction.IAuthTabCallback(redirect, vylVar, serialDescriptor);
            if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
                int i2 = onExtraCallback + 21;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    Intrinsics.areEqual(redirect.redirectUrl, "");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (Intrinsics.areEqual(redirect.redirectUrl, "")) {
                    return;
                }
            }
            vylVar.onExtraCallback(serialDescriptor, 1, redirect.redirectUrl);
            int i3 = onExtraCallback + 53;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Redirect(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = onExtraCallback + 125;
                int i3 = i2 % 128;
                onNavigationEvent = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 5;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
                str = "";
            }
            this(str);
        }

        public final String IAuthTabCallback() {
            String str;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 59;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            if (i2 % 2 == 0) {
                str = this.redirectUrl;
                int i4 = 99 / 0;
            } else {
                str = this.redirectUrl;
            }
            int i5 = i3 + 67;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }
    }

    @nc(IAuthTabCallback = "DISPLAY")
    @liq
    public static final class Display extends SendPreAction {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        private final PreSendAlert displayInfo;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final Parcelable.Creator<Display> CREATOR = new onNavigationEvent();

        public static final class onNavigationEvent implements Parcelable.Creator<Display> {
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ Display createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 117;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Display displayOnNavigationEvent = onNavigationEvent(parcel);
                if (i3 == 0) {
                    int i4 = 40 / 0;
                }
                return displayOnNavigationEvent;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ Display[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 9;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Display[] displayArrOnNavigationEvent = onNavigationEvent(i);
                int i5 = onExtraCallbackWithResult + 119;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    return displayArrOnNavigationEvent;
                }
                throw null;
            }

            public final Display onNavigationEvent(Parcel parcel) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                Display display = new Display((PreSendAlert) parcel.readParcelable(Display.class.getClassLoader()));
                int i2 = onExtraCallbackWithResult + 113;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return display;
            }

            public final Display[] onNavigationEvent(int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 45;
                onWarmupCompleted = i3 % 128;
                Display[] displayArr = new Display[i];
                if (i3 % 2 == 0) {
                    return displayArr;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        static {
            int i = onWarmupCompleted + 41;
            IAuthTabCallback = i % 128;
            if (i % 2 == 0) {
                int i2 = 22 / 0;
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 7;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 5;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onExtraCallbackWithResult + 79;
                onExtraCallback = i2 % 128;
                return i2 % 2 == 0;
            }
            if (!(obj instanceof Display)) {
                int i3 = onExtraCallback + 49;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.displayInfo, ((Display) obj).displayInfo)) {
                return true;
            }
            int i5 = onExtraCallback + 29;
            onExtraCallbackWithResult = i5 % 128;
            return i5 % 2 == 0;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 49;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.displayInfo.hashCode();
            int i4 = onExtraCallbackWithResult + 63;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Display(displayInfo=" + this.displayInfo + ")";
            int i2 = onExtraCallback + 43;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 11;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeParcelable(this.displayInfo, i);
            int i5 = onExtraCallbackWithResult + 101;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
        }

        public static final class Companion {
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Display> serializer() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 13;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                SendPreAction$Display$$serializer sendPreAction$Display$$serializer = SendPreAction$Display$$serializer.INSTANCE;
                int i4 = onWarmupCompleted + 13;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return sendPreAction$Display$$serializer;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Display(int i, String str, PreSendAlert preSendAlert, okycx okycxVar) {
            super(i, str, okycxVar);
            if (2 != (i & 2)) {
                int i2 = onExtraCallbackWithResult + 35;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                htf31.onExtraCallbackWithResult(i, 2, SendPreAction$Display$$serializer.INSTANCE.getDescriptor());
                int i4 = onExtraCallbackWithResult + 113;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 2 % 2;
                }
            }
            this.displayInfo = preSendAlert;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Display(@NotNull PreSendAlert preSendAlert) {
            Intrinsics.checkNotNullParameter(preSendAlert, "");
            String str = null;
            super(str, 1, (DefaultConstructorMarker) str);
            this.displayInfo = preSendAlert;
        }

        @JvmStatic
        public static final /* synthetic */ void onWarmupCompleted(Display display, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 87;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            SendPreAction.IAuthTabCallback(display, vylVar, serialDescriptor);
            vylVar.onNavigationEvent(serialDescriptor, 1, onHostResume.INSTANCE, display.displayInfo);
            int i4 = onExtraCallback + 75;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final PreSendAlert IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 103;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            PreSendAlert preSendAlert = this.displayInfo;
            int i5 = i3 + 31;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return preSendAlert;
        }
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = onWarmupCompleted;
        int i4 = -1469660336;
        if (iArr2 != null) {
            int i5 = $10 + 87;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSizeAndState(0, 0, 0), (Process.myPid() >> 22) + 72, 8847 - TextUtils.indexOf((CharSequence) "", '0'), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i7] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i7++;
                    int i8 = $10 + 9;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    i4 = -1469660336;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = onWarmupCompleted;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i10 = 0;
            while (i10 < length3) {
                int i11 = $11 + 77;
                $10 = i11 % 128;
                int i12 = i11 % i2;
                try {
                    Object[] objArr3 = {Integer.valueOf(iArr5[i10])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), View.combineMeasuredStates(0, 0) + 72, 8848 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i10] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    i10++;
                    i2 = 2;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i13 = 0;
            for (int i14 = 16; i13 < i14; i14 = 16) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i13];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - View.MeasureSpec.getMode(0)), (ViewConfiguration.getTapTimeout() >> 16) + 39, 10301 - KeyEvent.normalizeMetaState(0), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i13++;
            }
            int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i15;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4032 - ImageFormat.getBitsPerPixel(0)), 78 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 7398 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void onExtraCallback() {
        onWarmupCompleted = new int[]{1699197643, 1561205103, 1190539301, 1080671151, -1137010952, 1352766454, 363646287, -419656226, 1735450314, 387899888, -27177147, -674469925, 1122199132, -675544848, 953660110, -333185564, -506867757, 516499374};
    }
}
