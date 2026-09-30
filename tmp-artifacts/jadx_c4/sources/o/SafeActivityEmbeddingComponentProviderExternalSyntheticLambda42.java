package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42 {
    String IAuthTabCallback();

    String IAuthTabCallbackDefault();

    String asBinder();

    String asInterface();

    String onExtraCallback();

    String onExtraCallbackWithResult();

    String onNavigationEvent();

    String onTransact();

    String onWarmupCompleted();

    public static final class IAuthTabCallback implements SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42 {
        private static int IAuthTabCallback_Parcel = 0;
        private static int access000 = 1;
        private final String IAuthTabCallback;
        private final String IAuthTabCallbackDefault;
        private final String IAuthTabCallbackStub;
        private final String asBinder;
        private final String asInterface;
        private final String onExtraCallback;
        private final String onExtraCallbackWithResult;
        private final String onNavigationEvent;
        private final String onTransact;
        private final String onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel + 3;
            int i3 = i2 % 128;
            access000 = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IAuthTabCallback)) {
                int i4 = i3 + 77;
                IAuthTabCallback_Parcel = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) obj;
            if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, iAuthTabCallback.onExtraCallbackWithResult)) {
                int i6 = access000 + 59;
                IAuthTabCallback_Parcel = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.onWarmupCompleted, iAuthTabCallback.onWarmupCompleted)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.onExtraCallback, iAuthTabCallback.onExtraCallback)) {
                int i8 = access000 + 19;
                IAuthTabCallback_Parcel = i8 % 128;
                int i9 = i8 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.asBinder, iAuthTabCallback.asBinder)) {
                int i10 = IAuthTabCallback_Parcel + 61;
                access000 = i10 % 128;
                int i11 = i10 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.IAuthTabCallbackStub, iAuthTabCallback.IAuthTabCallbackStub) || !Intrinsics.areEqual(this.IAuthTabCallback, iAuthTabCallback.IAuthTabCallback) || !Intrinsics.areEqual(this.onTransact, iAuthTabCallback.onTransact)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.asInterface, iAuthTabCallback.asInterface)) {
                int i12 = IAuthTabCallback_Parcel + 61;
                access000 = i12 % 128;
                int i13 = i12 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.onNavigationEvent, iAuthTabCallback.onNavigationEvent)) {
                return Intrinsics.areEqual(this.IAuthTabCallbackDefault, iAuthTabCallback.IAuthTabCallbackDefault);
            }
            int i14 = IAuthTabCallback_Parcel + 69;
            access000 = i14 % 128;
            int i15 = i14 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = access000 + 89;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode2 = this.onExtraCallbackWithResult.hashCode();
            int iHashCode3 = this.onWarmupCompleted.hashCode();
            int iHashCode4 = this.onExtraCallback.hashCode();
            int iHashCode5 = this.asBinder.hashCode();
            int iHashCode6 = this.IAuthTabCallbackStub.hashCode();
            int iHashCode7 = this.IAuthTabCallback.hashCode();
            int iHashCode8 = this.onTransact.hashCode();
            String str = this.asInterface;
            if (str == null) {
                int i4 = IAuthTabCallback_Parcel + 59;
                access000 = i4 % 128;
                int i5 = i4 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
            }
            int iHashCode9 = this.onNavigationEvent.hashCode();
            String str2 = this.IAuthTabCallbackDefault;
            return (((((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode) * 31) + iHashCode9) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            int i = 2 % 2;
            String str = "OneTimePurchase(displayOrderId=" + this.onExtraCallbackWithResult + ", orderId=" + this.onWarmupCompleted + ", miniAppTitle=" + this.onExtraCallback + ", status=" + this.asBinder + ", productName=" + this.IAuthTabCallbackStub + ", amount=" + this.IAuthTabCallback + ", purchasedTxDate=" + this.onTransact + ", refundRejectReason=" + this.asInterface + ", contactEmail=" + this.onNavigationEvent + ", refundedTxDate=" + this.IAuthTabCallbackDefault + ")";
            int i2 = IAuthTabCallback_Parcel + 113;
            access000 = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public IAuthTabCallback(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @Nullable String str8, @NotNull String str9, @Nullable String str10) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(str9, "");
            this.onExtraCallbackWithResult = str;
            this.onWarmupCompleted = str2;
            this.onExtraCallback = str3;
            this.asBinder = str4;
            this.IAuthTabCallbackStub = str5;
            this.IAuthTabCallback = str6;
            this.onTransact = str7;
            this.asInterface = str8;
            this.onNavigationEvent = str9;
            this.IAuthTabCallbackDefault = str10;
        }

        @Override // o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42
        public String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel;
            int i3 = i2 + 79;
            access000 = i3 % 128;
            int i4 = i3 % 2;
            String str = this.onExtraCallbackWithResult;
            int i5 = i2 + 17;
            access000 = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42
        public String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel + 9;
            access000 = i2 % 128;
            if (i2 % 2 != 0) {
                return this.onWarmupCompleted;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42
        public String onExtraCallback() {
            int i = 2 % 2;
            int i2 = access000 + 69;
            int i3 = i2 % 128;
            IAuthTabCallback_Parcel = i3;
            int i4 = i2 % 2;
            String str = this.onExtraCallback;
            int i5 = i3 + 3;
            access000 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 88 / 0;
            }
            return str;
        }

        @Override // o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42
        public String asInterface() {
            String str;
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel;
            int i3 = i2 + 83;
            access000 = i3 % 128;
            if (i3 % 2 == 0) {
                str = this.asBinder;
                int i4 = 18 / 0;
            } else {
                str = this.asBinder;
            }
            int i5 = i2 + 57;
            access000 = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42
        public String IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = access000 + 77;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            String str = this.IAuthTabCallbackStub;
            if (i3 != 0) {
                int i4 = 74 / 0;
            }
            return str;
        }

        @Override // o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42
        public String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel;
            int i3 = i2 + 3;
            access000 = i3 % 128;
            int i4 = i3 % 2;
            String str = this.IAuthTabCallback;
            int i5 = i2 + 103;
            access000 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        @Override // o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42
        public String asBinder() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel + 61;
            int i3 = i2 % 128;
            access000 = i3;
            int i4 = i2 % 2;
            String str = this.onTransact;
            int i5 = i3 + 19;
            IAuthTabCallback_Parcel = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42
        public String onTransact() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel;
            int i3 = i2 + 97;
            access000 = i3 % 128;
            int i4 = i3 % 2;
            String str = this.asInterface;
            int i5 = i2 + 119;
            access000 = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            throw null;
        }

        @Override // o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42
        public String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = access000 + 81;
            IAuthTabCallback_Parcel = i2 % 128;
            if (i2 % 2 == 0) {
                return this.onNavigationEvent;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String IAuthTabCallbackStub() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel + 41;
            access000 = i2 % 128;
            if (i2 % 2 != 0) {
                return this.IAuthTabCallbackDefault;
            }
            throw null;
        }
    }

    public static final class onNavigationEvent implements SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42 {
        private static int IAuthTabCallbackStubProxy = 0;
        private static int access000 = 1;
        private final String IAuthTabCallback;
        private final String IAuthTabCallbackDefault;
        private final String IAuthTabCallbackStub;
        private final String asBinder;
        private final String asInterface;
        private final String onExtraCallback;
        private final String onExtraCallbackWithResult;
        private final String onNavigationEvent;
        private final String onTransact;
        private final String onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = access000 + 11;
            int i3 = i2 % 128;
            IAuthTabCallbackStubProxy = i3;
            int i4 = i2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onNavigationEvent)) {
                int i5 = i3 + 47;
                access000 = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            onNavigationEvent onnavigationevent = (onNavigationEvent) obj;
            if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, onnavigationevent.onExtraCallbackWithResult)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.IAuthTabCallback, onnavigationevent.IAuthTabCallback)) {
                int i7 = access000 + 61;
                IAuthTabCallbackStubProxy = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.onNavigationEvent, onnavigationevent.onNavigationEvent) || !Intrinsics.areEqual(this.IAuthTabCallbackStub, onnavigationevent.IAuthTabCallbackStub) || !Intrinsics.areEqual(this.onTransact, onnavigationevent.onTransact)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.onWarmupCompleted, onnavigationevent.onWarmupCompleted)) {
                int i9 = access000 + 19;
                IAuthTabCallbackStubProxy = i9 % 128;
                if (i9 % 2 != 0) {
                    int i10 = 59 / 0;
                }
                return false;
            }
            if (!Intrinsics.areEqual(this.asInterface, onnavigationevent.asInterface)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.asBinder, onnavigationevent.asBinder)) {
                int i11 = access000 + 49;
                IAuthTabCallbackStubProxy = i11 % 128;
                int i12 = i11 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.onExtraCallback, onnavigationevent.onExtraCallback) || !Intrinsics.areEqual(this.IAuthTabCallbackDefault, onnavigationevent.IAuthTabCallbackDefault)) {
                return false;
            }
            int i13 = IAuthTabCallbackStubProxy + 23;
            access000 = i13 % 128;
            if (i13 % 2 != 0) {
                return true;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int iHashCode2 = this.onExtraCallbackWithResult.hashCode();
            int iHashCode3 = this.IAuthTabCallback.hashCode();
            int iHashCode4 = this.onNavigationEvent.hashCode();
            int iHashCode5 = this.IAuthTabCallbackStub.hashCode();
            int iHashCode6 = this.onTransact.hashCode();
            int iHashCode7 = this.onWarmupCompleted.hashCode();
            int iHashCode8 = this.asInterface.hashCode();
            String str = this.asBinder;
            if (str == null) {
                int i2 = access000 + 77;
                IAuthTabCallbackStubProxy = i2 % 128;
                iHashCode = (i2 % 2 != 0 ? 0 : 1) ^ 1;
            } else {
                iHashCode = str.hashCode();
            }
            int iHashCode9 = (((((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode) * 31) + this.onExtraCallback.hashCode()) * 31) + this.IAuthTabCallbackDefault.hashCode();
            int i3 = access000 + 121;
            IAuthTabCallbackStubProxy = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 45 / 0;
            }
            return iHashCode9;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Cancelled(displayOrderId=" + this.onExtraCallbackWithResult + ", orderId=" + this.IAuthTabCallback + ", miniAppTitle=" + this.onNavigationEvent + ", status=" + this.IAuthTabCallbackStub + ", productName=" + this.onTransact + ", amount=" + this.onWarmupCompleted + ", purchasedTxDate=" + this.asInterface + ", refundRejectReason=" + this.asBinder + ", contactEmail=" + this.onExtraCallback + ", refundedTxDate=" + this.IAuthTabCallbackDefault + ")";
            int i2 = IAuthTabCallbackStubProxy + 59;
            access000 = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            throw null;
        }

        public onNavigationEvent(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @Nullable String str8, @NotNull String str9, @NotNull String str10) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(str9, "");
            Intrinsics.checkNotNullParameter(str10, "");
            this.onExtraCallbackWithResult = str;
            this.IAuthTabCallback = str2;
            this.onNavigationEvent = str3;
            this.IAuthTabCallbackStub = str4;
            this.onTransact = str5;
            this.onWarmupCompleted = str6;
            this.asInterface = str7;
            this.asBinder = str8;
            this.onExtraCallback = str9;
            this.IAuthTabCallbackDefault = str10;
        }

        @Override // o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42
        public String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = access000 + 7;
            int i3 = i2 % 128;
            IAuthTabCallbackStubProxy = i3;
            int i4 = i2 % 2;
            String str = this.onExtraCallbackWithResult;
            int i5 = i3 + 73;
            access000 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        @Override // o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42
        public String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStubProxy + 65;
            int i3 = i2 % 128;
            access000 = i3;
            int i4 = i2 % 2;
            String str = this.IAuthTabCallback;
            int i5 = i3 + 11;
            IAuthTabCallbackStubProxy = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            throw null;
        }

        @Override // o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42
        public String onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStubProxy + 41;
            int i3 = i2 % 128;
            access000 = i3;
            int i4 = i2 % 2;
            String str = this.onNavigationEvent;
            int i5 = i3 + 1;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        @Override // o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42
        public String asInterface() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStubProxy;
            int i3 = i2 + 53;
            access000 = i3 % 128;
            int i4 = i3 % 2;
            String str = this.IAuthTabCallbackStub;
            int i5 = i2 + 45;
            access000 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        @Override // o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42
        public String IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = access000;
            int i3 = i2 + 57;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
            String str = this.onTransact;
            int i5 = i2 + 47;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        @Override // o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42
        public String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = access000 + 77;
            int i3 = i2 % 128;
            IAuthTabCallbackStubProxy = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            String str = this.onWarmupCompleted;
            int i4 = i3 + 57;
            access000 = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        @Override // o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42
        public String asBinder() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStubProxy;
            int i3 = i2 + 83;
            access000 = i3 % 128;
            int i4 = i3 % 2;
            String str = this.asInterface;
            int i5 = i2 + 75;
            access000 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 35 / 0;
            }
            return str;
        }

        @Override // o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42
        public String onTransact() {
            int i = 2 % 2;
            int i2 = access000 + 9;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            String str = this.asBinder;
            if (i3 != 0) {
                int i4 = 13 / 0;
            }
            return str;
        }

        @Override // o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42
        public String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = access000;
            int i3 = i2 + 85;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
            String str = this.onExtraCallback;
            int i5 = i2 + 17;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String IAuthTabCallbackStub() {
            int i = 2 % 2;
            int i2 = access000;
            int i3 = i2 + 15;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
            String str = this.IAuthTabCallbackDefault;
            int i5 = i2 + 115;
            IAuthTabCallbackStubProxy = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 83 / 0;
            }
            return str;
        }
    }

    public static final class onExtraCallback implements SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42 {
        private static int IAuthTabCallback_Parcel = 1;
        private static int access100;
        private final String IAuthTabCallback;
        private final String IAuthTabCallbackDefault;
        private final String IAuthTabCallbackStub;
        private final String asBinder;
        private final String asInterface;
        private final String onExtraCallback;
        private final String onExtraCallbackWithResult;
        private final String onNavigationEvent;
        private final String onTransact;
        private final String onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = access100 + 87;
            IAuthTabCallback_Parcel = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 == 0) {
                obj2.hashCode();
                throw null;
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onExtraCallback)) {
                return false;
            }
            onExtraCallback onextracallback = (onExtraCallback) obj;
            if (!Intrinsics.areEqual(this.onWarmupCompleted, onextracallback.onWarmupCompleted) || !Intrinsics.areEqual(this.IAuthTabCallback, onextracallback.IAuthTabCallback) || !Intrinsics.areEqual(this.onNavigationEvent, onextracallback.onNavigationEvent)) {
                return false;
            }
            if (Intrinsics.areEqual(this.asBinder, onextracallback.asBinder)) {
                if ((!Intrinsics.areEqual(this.IAuthTabCallbackDefault, onextracallback.IAuthTabCallbackDefault)) || !Intrinsics.areEqual(this.onExtraCallback, onextracallback.onExtraCallback)) {
                    return false;
                }
                if (Intrinsics.areEqual(this.IAuthTabCallbackStub, onextracallback.IAuthTabCallbackStub)) {
                    return Intrinsics.areEqual(this.onTransact, onextracallback.onTransact) && Intrinsics.areEqual(this.onExtraCallbackWithResult, onextracallback.onExtraCallbackWithResult) && Intrinsics.areEqual(this.asInterface, onextracallback.asInterface);
                }
                int i3 = IAuthTabCallback_Parcel + 87;
                access100 = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            int i5 = access100;
            int i6 = i5 + 101;
            IAuthTabCallback_Parcel = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i5 + 69;
            IAuthTabCallback_Parcel = i8 % 128;
            if (i8 % 2 != 0) {
                return false;
            }
            obj2.hashCode();
            throw null;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel + 15;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode2 = this.onWarmupCompleted.hashCode();
            int iHashCode3 = this.IAuthTabCallback.hashCode();
            int iHashCode4 = this.onNavigationEvent.hashCode();
            int iHashCode5 = this.asBinder.hashCode();
            int iHashCode6 = this.IAuthTabCallbackDefault.hashCode();
            int iHashCode7 = this.onExtraCallback.hashCode();
            int iHashCode8 = this.IAuthTabCallbackStub.hashCode();
            String str = this.onTransact;
            int i4 = 0;
            if (str == null) {
                int i5 = IAuthTabCallback_Parcel;
                int i6 = i5 + 7;
                access100 = i6 % 128;
                int i7 = i6 % 2;
                int i8 = i5 + 5;
                access100 = i8 % 128;
                int i9 = i8 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
            }
            int iHashCode9 = this.onExtraCallbackWithResult.hashCode();
            String str2 = this.asInterface;
            if (str2 != null) {
                int i10 = access100 + 7;
                IAuthTabCallback_Parcel = i10 % 128;
                int i11 = i10 % 2;
                int iHashCode10 = str2.hashCode();
                if (i11 == 0) {
                    int i12 = 38 / 0;
                }
                i4 = iHashCode10;
            }
            return (((((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode) * 31) + iHashCode9) * 31) + i4;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "SubscriptionPurchased(displayOrderId=" + this.onWarmupCompleted + ", orderId=" + this.IAuthTabCallback + ", miniAppTitle=" + this.onNavigationEvent + ", status=" + this.asBinder + ", productName=" + this.IAuthTabCallbackDefault + ", amount=" + this.onExtraCallback + ", purchasedTxDate=" + this.IAuthTabCallbackStub + ", refundRejectReason=" + this.onTransact + ", contactEmail=" + this.onExtraCallbackWithResult + ", refundedTxDate=" + this.asInterface + ")";
            int i2 = IAuthTabCallback_Parcel + 83;
            access100 = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public onExtraCallback(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @Nullable String str8, @NotNull String str9, @Nullable String str10) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(str9, "");
            this.onWarmupCompleted = str;
            this.IAuthTabCallback = str2;
            this.onNavigationEvent = str3;
            this.asBinder = str4;
            this.IAuthTabCallbackDefault = str5;
            this.onExtraCallback = str6;
            this.IAuthTabCallbackStub = str7;
            this.onTransact = str8;
            this.onExtraCallbackWithResult = str9;
            this.asInterface = str10;
        }

        @Override // o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42
        public String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel + 87;
            int i3 = i2 % 128;
            access100 = i3;
            int i4 = i2 % 2;
            String str = this.onWarmupCompleted;
            int i5 = i3 + 25;
            IAuthTabCallback_Parcel = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42
        public String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = access100 + 39;
            int i3 = i2 % 128;
            IAuthTabCallback_Parcel = i3;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String str = this.IAuthTabCallback;
            int i4 = i3 + 117;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        @Override // o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42
        public String onExtraCallback() {
            int i = 2 % 2;
            int i2 = access100 + 65;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            String str = this.onNavigationEvent;
            if (i3 == 0) {
                int i4 = 3 / 0;
            }
            return str;
        }

        @Override // o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42
        public String asInterface() {
            int i = 2 % 2;
            int i2 = access100 + 73;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            String str = this.asBinder;
            if (i3 == 0) {
                int i4 = 58 / 0;
            }
            return str;
        }

        @Override // o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42
        public String IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel;
            int i3 = i2 + 123;
            access100 = i3 % 128;
            int i4 = i3 % 2;
            String str = this.IAuthTabCallbackDefault;
            int i5 = i2 + 105;
            access100 = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            throw null;
        }

        @Override // o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42
        public String onNavigationEvent() {
            String str;
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel + 109;
            int i3 = i2 % 128;
            access100 = i3;
            if (i2 % 2 != 0) {
                str = this.onExtraCallback;
                int i4 = 25 / 0;
            } else {
                str = this.onExtraCallback;
            }
            int i5 = i3 + 111;
            IAuthTabCallback_Parcel = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        @Override // o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42
        public String asBinder() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel;
            int i3 = i2 + 89;
            access100 = i3 % 128;
            int i4 = i3 % 2;
            String str = this.IAuthTabCallbackStub;
            int i5 = i2 + 11;
            access100 = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            throw null;
        }

        @Override // o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42
        public String onTransact() {
            int i = 2 % 2;
            int i2 = access100;
            int i3 = i2 + 13;
            IAuthTabCallback_Parcel = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            String str = this.onTransact;
            int i4 = i2 + 53;
            IAuthTabCallback_Parcel = i4 % 128;
            if (i4 % 2 != 0) {
                return str;
            }
            obj.hashCode();
            throw null;
        }

        @Override // o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42
        public String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel + 83;
            access100 = i2 % 128;
            if (i2 % 2 == 0) {
                return this.onExtraCallbackWithResult;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String IAuthTabCallbackStub() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel + 3;
            int i3 = i2 % 128;
            access100 = i3;
            int i4 = i2 % 2;
            String str = this.asInterface;
            int i5 = i3 + 105;
            IAuthTabCallback_Parcel = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 36 / 0;
            }
            return str;
        }
    }

    public interface onWarmupCompleted extends SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42 {
        String IAuthTabCallbackStub();

        String IAuthTabCallbackStubProxy();

        String access100();

        public static final class onExtraCallbackWithResult implements onWarmupCompleted {
            private static int extraCallbackWithResult = 1;
            private static int writeTypedObject;
            private final String IAuthTabCallback;
            private final String IAuthTabCallbackDefault;
            private final String IAuthTabCallbackStub;
            private final String IAuthTabCallbackStubProxy;
            private final String IAuthTabCallback_Parcel;
            private final String access000;
            private final String access100;
            private final String asBinder;
            private final String asInterface;
            private final String getInterfaceDescriptor;
            private final String onExtraCallback;
            private final String onExtraCallbackWithResult;
            private final String onNavigationEvent;
            private final String onTransact;
            private final String onWarmupCompleted;

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof onExtraCallbackWithResult)) {
                    int i2 = extraCallbackWithResult + 87;
                    writeTypedObject = i2 % 128;
                    int i3 = i2 % 2;
                    return false;
                }
                onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) obj;
                if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, onextracallbackwithresult.onExtraCallbackWithResult)) {
                    int i4 = extraCallbackWithResult + 111;
                    writeTypedObject = i4 % 128;
                    int i5 = i4 % 2;
                    return false;
                }
                if (!Intrinsics.areEqual(this.asBinder, onextracallbackwithresult.asBinder)) {
                    return false;
                }
                if (!Intrinsics.areEqual(this.asInterface, onextracallbackwithresult.asInterface)) {
                    int i6 = extraCallbackWithResult + 105;
                    writeTypedObject = i6 % 128;
                    int i7 = i6 % 2;
                    return false;
                }
                if (!Intrinsics.areEqual(this.IAuthTabCallbackStubProxy, onextracallbackwithresult.IAuthTabCallbackStubProxy)) {
                    return false;
                }
                if (!Intrinsics.areEqual(this.IAuthTabCallbackDefault, onextracallbackwithresult.IAuthTabCallbackDefault)) {
                    int i8 = extraCallbackWithResult + 47;
                    writeTypedObject = i8 % 128;
                    int i9 = i8 % 2;
                    return false;
                }
                if (!Intrinsics.areEqual(this.onNavigationEvent, onextracallbackwithresult.onNavigationEvent) || !Intrinsics.areEqual(this.onTransact, onextracallbackwithresult.onTransact) || !Intrinsics.areEqual(this.IAuthTabCallbackStub, onextracallbackwithresult.IAuthTabCallbackStub)) {
                    return false;
                }
                if (!Intrinsics.areEqual(this.IAuthTabCallback, onextracallbackwithresult.IAuthTabCallback)) {
                    int i10 = extraCallbackWithResult + 81;
                    writeTypedObject = i10 % 128;
                    int i11 = i10 % 2;
                    return false;
                }
                if (!Intrinsics.areEqual(this.access100, onextracallbackwithresult.access100)) {
                    int i12 = extraCallbackWithResult + 43;
                    writeTypedObject = i12 % 128;
                    int i13 = i12 % 2;
                    return false;
                }
                if (!Intrinsics.areEqual(this.access000, onextracallbackwithresult.access000)) {
                    return false;
                }
                if (Intrinsics.areEqual(this.getInterfaceDescriptor, onextracallbackwithresult.getInterfaceDescriptor)) {
                    return Intrinsics.areEqual(this.onWarmupCompleted, onextracallbackwithresult.onWarmupCompleted) && !(Intrinsics.areEqual(this.onExtraCallback, onextracallbackwithresult.onExtraCallback) ^ true) && Intrinsics.areEqual(this.IAuthTabCallback_Parcel, onextracallbackwithresult.IAuthTabCallback_Parcel);
                }
                int i14 = writeTypedObject + 107;
                extraCallbackWithResult = i14 % 128;
                int i15 = i14 % 2;
                return false;
            }

            public int hashCode() {
                int iHashCode;
                int iHashCode2;
                int i = 2 % 2;
                int i2 = writeTypedObject + 37;
                extraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                int iHashCode3 = this.onExtraCallbackWithResult.hashCode();
                int iHashCode4 = this.asBinder.hashCode();
                int iHashCode5 = this.asInterface.hashCode();
                int iHashCode6 = this.IAuthTabCallbackStubProxy.hashCode();
                int iHashCode7 = this.IAuthTabCallbackDefault.hashCode();
                int iHashCode8 = this.onNavigationEvent.hashCode();
                int iHashCode9 = this.onTransact.hashCode();
                String str = this.IAuthTabCallbackStub;
                if (str == null) {
                    int i4 = extraCallbackWithResult + 27;
                    writeTypedObject = i4 % 128;
                    iHashCode = i4 % 2 != 0 ? 1 : 0;
                } else {
                    iHashCode = str.hashCode();
                }
                int iHashCode10 = this.IAuthTabCallback.hashCode();
                int iHashCode11 = this.access100.hashCode();
                String str2 = this.access000;
                if (str2 == null) {
                    int i5 = writeTypedObject + 85;
                    extraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    iHashCode2 = 0;
                } else {
                    iHashCode2 = str2.hashCode();
                }
                String str3 = this.getInterfaceDescriptor;
                return (((((((((((((((((((((((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + this.onWarmupCompleted.hashCode()) * 31) + this.onExtraCallback.hashCode()) * 31) + this.IAuthTabCallback_Parcel.hashCode();
            }

            public String toString() {
                int i = 2 % 2;
                String str = "SubscriptionExpired(displayOrderId=" + this.onExtraCallbackWithResult + ", orderId=" + this.asBinder + ", miniAppTitle=" + this.asInterface + ", status=" + this.IAuthTabCallbackStubProxy + ", productName=" + this.IAuthTabCallbackDefault + ", amount=" + this.onNavigationEvent + ", purchasedTxDate=" + this.onTransact + ", refundRejectReason=" + this.IAuthTabCallbackStub + ", contactEmail=" + this.IAuthTabCallback + ", subscriptionFee=" + this.access100 + ", subscriptionPeriodStart=" + this.access000 + ", subscriptionPeriodEnd=" + this.getInterfaceDescriptor + ", appName=" + this.onWarmupCompleted + ", deploymentId=" + this.onExtraCallback + ", sku=" + this.IAuthTabCallback_Parcel + ")";
                int i2 = writeTypedObject + 21;
                extraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }

            public onExtraCallbackWithResult(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @Nullable String str8, @NotNull String str9, @NotNull String str10, @Nullable String str11, @Nullable String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str3, "");
                Intrinsics.checkNotNullParameter(str4, "");
                Intrinsics.checkNotNullParameter(str5, "");
                Intrinsics.checkNotNullParameter(str6, "");
                Intrinsics.checkNotNullParameter(str7, "");
                Intrinsics.checkNotNullParameter(str9, "");
                Intrinsics.checkNotNullParameter(str10, "");
                Intrinsics.checkNotNullParameter(str13, "");
                Intrinsics.checkNotNullParameter(str14, "");
                Intrinsics.checkNotNullParameter(str15, "");
                this.onExtraCallbackWithResult = str;
                this.asBinder = str2;
                this.asInterface = str3;
                this.IAuthTabCallbackStubProxy = str4;
                this.IAuthTabCallbackDefault = str5;
                this.onNavigationEvent = str6;
                this.onTransact = str7;
                this.IAuthTabCallbackStub = str8;
                this.IAuthTabCallback = str9;
                this.access100 = str10;
                this.access000 = str11;
                this.getInterfaceDescriptor = str12;
                this.onWarmupCompleted = str13;
                this.onExtraCallback = str14;
                this.IAuthTabCallback_Parcel = str15;
            }

            @Override // o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42
            public String IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = writeTypedObject + 57;
                extraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    return this.onExtraCallbackWithResult;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42
            public String onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = extraCallbackWithResult + 53;
                int i3 = i2 % 128;
                writeTypedObject = i3;
                int i4 = i2 % 2;
                String str = this.asBinder;
                int i5 = i3 + 107;
                extraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }

            @Override // o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42
            public String onExtraCallback() {
                int i = 2 % 2;
                int i2 = extraCallbackWithResult;
                int i3 = i2 + 29;
                writeTypedObject = i3 % 128;
                int i4 = i3 % 2;
                String str = this.asInterface;
                int i5 = i2 + 125;
                writeTypedObject = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }

            @Override // o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42
            public String asInterface() {
                int i = 2 % 2;
                int i2 = extraCallbackWithResult + 93;
                int i3 = i2 % 128;
                writeTypedObject = i3;
                int i4 = i2 % 2;
                String str = this.IAuthTabCallbackStubProxy;
                int i5 = i3 + 9;
                extraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }

            @Override // o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42
            public String IAuthTabCallbackDefault() {
                int i = 2 % 2;
                int i2 = writeTypedObject + 39;
                extraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    return this.IAuthTabCallbackDefault;
                }
                throw null;
            }

            @Override // o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42
            public String onNavigationEvent() {
                int i = 2 % 2;
                int i2 = extraCallbackWithResult + 47;
                int i3 = i2 % 128;
                writeTypedObject = i3;
                int i4 = i2 % 2;
                String str = this.onNavigationEvent;
                int i5 = i3 + 31;
                extraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }

            @Override // o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42
            public String asBinder() {
                int i = 2 % 2;
                int i2 = extraCallbackWithResult + 83;
                writeTypedObject = i2 % 128;
                if (i2 % 2 == 0) {
                    return this.onTransact;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42
            public String onTransact() {
                int i = 2 % 2;
                int i2 = extraCallbackWithResult + 115;
                int i3 = i2 % 128;
                writeTypedObject = i3;
                if (i2 % 2 != 0) {
                    throw null;
                }
                String str = this.IAuthTabCallbackStub;
                int i4 = i3 + 19;
                extraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return str;
            }

            @Override // o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42
            public String onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = writeTypedObject + 77;
                int i3 = i2 % 128;
                extraCallbackWithResult = i3;
                int i4 = i2 % 2;
                String str = this.IAuthTabCallback;
                int i5 = i3 + 3;
                writeTypedObject = i5 % 128;
                if (i5 % 2 == 0) {
                    return str;
                }
                throw null;
            }

            @Override // o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onWarmupCompleted
            public String IAuthTabCallbackStub() {
                int i = 2 % 2;
                int i2 = extraCallbackWithResult + 49;
                writeTypedObject = i2 % 128;
                int i3 = i2 % 2;
                String str = this.access100;
                if (i3 != 0) {
                    int i4 = 57 / 0;
                }
                return str;
            }

            @Override // o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onWarmupCompleted
            public String IAuthTabCallbackStubProxy() {
                int i = 2 % 2;
                int i2 = writeTypedObject + 41;
                int i3 = i2 % 128;
                extraCallbackWithResult = i3;
                int i4 = i2 % 2;
                String str = this.access000;
                int i5 = i3 + 121;
                writeTypedObject = i5 % 128;
                if (i5 % 2 == 0) {
                    return str;
                }
                throw null;
            }

            @Override // o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onWarmupCompleted
            public String access100() {
                int i = 2 % 2;
                int i2 = extraCallbackWithResult;
                int i3 = i2 + 95;
                writeTypedObject = i3 % 128;
                int i4 = i3 % 2;
                String str = this.getInterfaceDescriptor;
                int i5 = i2 + 71;
                writeTypedObject = i5 % 128;
                if (i5 % 2 == 0) {
                    return str;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final String IAuthTabCallback_Parcel() {
                int i = 2 % 2;
                int i2 = writeTypedObject + 85;
                int i3 = i2 % 128;
                extraCallbackWithResult = i3;
                if (i2 % 2 == 0) {
                    throw null;
                }
                String str = this.onWarmupCompleted;
                int i4 = i3 + 39;
                writeTypedObject = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 64 / 0;
                }
                return str;
            }

            public final String access000() {
                int i = 2 % 2;
                int i2 = extraCallbackWithResult + 13;
                writeTypedObject = i2 % 128;
                int i3 = i2 % 2;
                String str = this.onExtraCallback;
                if (i3 != 0) {
                    int i4 = 65 / 0;
                }
                return str;
            }

            public final String getInterfaceDescriptor() {
                int i = 2 % 2;
                int i2 = extraCallbackWithResult + 25;
                writeTypedObject = i2 % 128;
                if (i2 % 2 == 0) {
                    return this.IAuthTabCallback_Parcel;
                }
                throw null;
            }
        }

        /* renamed from: o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42$onWarmupCompleted$onWarmupCompleted, reason: collision with other inner class name */
        public static final class C0019onWarmupCompleted implements onWarmupCompleted {
            private static int ICustomTabsCallback = 1;
            private static int getInterfaceDescriptor;
            private final String IAuthTabCallback;
            private final String IAuthTabCallbackDefault;
            private final String IAuthTabCallbackStub;
            private final String IAuthTabCallbackStubProxy;
            private final String IAuthTabCallback_Parcel;
            private final String access000;
            private final String access100;
            private final String asBinder;
            private final String asInterface;
            private final String onExtraCallback;
            private final String onExtraCallbackWithResult;
            private final String onNavigationEvent;
            private final String onTransact;
            private final String onWarmupCompleted;

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    int i2 = ICustomTabsCallback + 97;
                    getInterfaceDescriptor = i2 % 128;
                    int i3 = i2 % 2;
                    return true;
                }
                if (!(obj instanceof C0019onWarmupCompleted)) {
                    return false;
                }
                C0019onWarmupCompleted c0019onWarmupCompleted = (C0019onWarmupCompleted) obj;
                if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, c0019onWarmupCompleted.onExtraCallbackWithResult) || !Intrinsics.areEqual(this.IAuthTabCallbackStub, c0019onWarmupCompleted.IAuthTabCallbackStub)) {
                    return false;
                }
                if (!Intrinsics.areEqual(this.onExtraCallback, c0019onWarmupCompleted.onExtraCallback)) {
                    int i4 = ICustomTabsCallback + 23;
                    getInterfaceDescriptor = i4 % 128;
                    int i5 = i4 % 2;
                    return false;
                }
                if (!Intrinsics.areEqual(this.IAuthTabCallbackStubProxy, c0019onWarmupCompleted.IAuthTabCallbackStubProxy)) {
                    return false;
                }
                if (!Intrinsics.areEqual(this.asBinder, c0019onWarmupCompleted.asBinder)) {
                    int i6 = ICustomTabsCallback + 115;
                    getInterfaceDescriptor = i6 % 128;
                    int i7 = i6 % 2;
                    return false;
                }
                if (!Intrinsics.areEqual(this.onNavigationEvent, c0019onWarmupCompleted.onNavigationEvent)) {
                    int i8 = getInterfaceDescriptor + 121;
                    ICustomTabsCallback = i8 % 128;
                    int i9 = i8 % 2;
                    return false;
                }
                if (!Intrinsics.areEqual(this.IAuthTabCallbackDefault, c0019onWarmupCompleted.IAuthTabCallbackDefault)) {
                    int i10 = ICustomTabsCallback + 91;
                    getInterfaceDescriptor = i10 % 128;
                    int i11 = i10 % 2;
                    return false;
                }
                Object obj2 = null;
                if (!Intrinsics.areEqual(this.asInterface, c0019onWarmupCompleted.asInterface)) {
                    int i12 = ICustomTabsCallback + 19;
                    getInterfaceDescriptor = i12 % 128;
                    if (i12 % 2 == 0) {
                        return false;
                    }
                    obj2.hashCode();
                    throw null;
                }
                if (!Intrinsics.areEqual(this.IAuthTabCallback, c0019onWarmupCompleted.IAuthTabCallback)) {
                    int i13 = ICustomTabsCallback + 65;
                    getInterfaceDescriptor = i13 % 128;
                    int i14 = i13 % 2;
                    return false;
                }
                if (!Intrinsics.areEqual(this.access000, c0019onWarmupCompleted.access000) || (!Intrinsics.areEqual(this.access100, c0019onWarmupCompleted.access100)) || !Intrinsics.areEqual(this.IAuthTabCallback_Parcel, c0019onWarmupCompleted.IAuthTabCallback_Parcel) || !Intrinsics.areEqual(this.onTransact, c0019onWarmupCompleted.onTransact)) {
                    return false;
                }
                if (Intrinsics.areEqual(this.onWarmupCompleted, c0019onWarmupCompleted.onWarmupCompleted)) {
                    return true;
                }
                int i15 = ICustomTabsCallback + 3;
                getInterfaceDescriptor = i15 % 128;
                if (i15 % 2 == 0) {
                    return false;
                }
                obj2.hashCode();
                throw null;
            }

            public int hashCode() {
                int iHashCode;
                int i;
                int i2 = 2 % 2;
                int iHashCode2 = this.onExtraCallbackWithResult.hashCode();
                int iHashCode3 = this.IAuthTabCallbackStub.hashCode();
                int iHashCode4 = this.onExtraCallback.hashCode();
                int iHashCode5 = this.IAuthTabCallbackStubProxy.hashCode();
                int iHashCode6 = this.asBinder.hashCode();
                int iHashCode7 = this.onNavigationEvent.hashCode();
                int iHashCode8 = this.IAuthTabCallbackDefault.hashCode();
                String str = this.asInterface;
                int iHashCode9 = str == null ? 0 : str.hashCode();
                int iHashCode10 = this.IAuthTabCallback.hashCode();
                int iHashCode11 = this.access000.hashCode();
                String str2 = this.access100;
                if (str2 == null) {
                    int i3 = ICustomTabsCallback + 83;
                    getInterfaceDescriptor = i3 % 128;
                    int i4 = i3 % 2;
                    iHashCode = 0;
                } else {
                    iHashCode = str2.hashCode();
                }
                String str3 = this.IAuthTabCallback_Parcel;
                int iHashCode12 = str3 == null ? 0 : str3.hashCode();
                int iHashCode13 = this.onTransact.hashCode();
                String str4 = this.onWarmupCompleted;
                if (str4 != null) {
                    int i5 = getInterfaceDescriptor + 91;
                    ICustomTabsCallback = i5 % 128;
                    int i6 = i5 % 2;
                    int iHashCode14 = str4.hashCode();
                    int i7 = ICustomTabsCallback + 37;
                    getInterfaceDescriptor = i7 % 128;
                    int i8 = i7 % 2;
                    i = iHashCode14;
                } else {
                    i = 0;
                }
                return (((((((((((((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + i;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "Subscribing(displayOrderId=" + this.onExtraCallbackWithResult + ", orderId=" + this.IAuthTabCallbackStub + ", miniAppTitle=" + this.onExtraCallback + ", status=" + this.IAuthTabCallbackStubProxy + ", productName=" + this.asBinder + ", amount=" + this.onNavigationEvent + ", purchasedTxDate=" + this.IAuthTabCallbackDefault + ", refundRejectReason=" + this.asInterface + ", contactEmail=" + this.IAuthTabCallback + ", subscriptionFee=" + this.access000 + ", subscriptionPeriodStart=" + this.access100 + ", subscriptionPeriodEnd=" + this.IAuthTabCallback_Parcel + ", nextPaymentDate=" + this.onTransact + ", expiresAt=" + this.onWarmupCompleted + ")";
                int i2 = ICustomTabsCallback + 111;
                getInterfaceDescriptor = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }

            public C0019onWarmupCompleted(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @Nullable String str8, @NotNull String str9, @NotNull String str10, @Nullable String str11, @Nullable String str12, @NotNull String str13, @Nullable String str14) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str3, "");
                Intrinsics.checkNotNullParameter(str4, "");
                Intrinsics.checkNotNullParameter(str5, "");
                Intrinsics.checkNotNullParameter(str6, "");
                Intrinsics.checkNotNullParameter(str7, "");
                Intrinsics.checkNotNullParameter(str9, "");
                Intrinsics.checkNotNullParameter(str10, "");
                Intrinsics.checkNotNullParameter(str13, "");
                this.onExtraCallbackWithResult = str;
                this.IAuthTabCallbackStub = str2;
                this.onExtraCallback = str3;
                this.IAuthTabCallbackStubProxy = str4;
                this.asBinder = str5;
                this.onNavigationEvent = str6;
                this.IAuthTabCallbackDefault = str7;
                this.asInterface = str8;
                this.IAuthTabCallback = str9;
                this.access000 = str10;
                this.access100 = str11;
                this.IAuthTabCallback_Parcel = str12;
                this.onTransact = str13;
                this.onWarmupCompleted = str14;
            }

            @Override // o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42
            public String IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = ICustomTabsCallback;
                int i3 = i2 + 23;
                getInterfaceDescriptor = i3 % 128;
                int i4 = i3 % 2;
                String str = this.onExtraCallbackWithResult;
                int i5 = i2 + 115;
                getInterfaceDescriptor = i5 % 128;
                if (i5 % 2 == 0) {
                    return str;
                }
                throw null;
            }

            @Override // o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42
            public String onExtraCallbackWithResult() {
                String str;
                int i = 2 % 2;
                int i2 = ICustomTabsCallback;
                int i3 = i2 + 91;
                getInterfaceDescriptor = i3 % 128;
                if (i3 % 2 != 0) {
                    str = this.IAuthTabCallbackStub;
                    int i4 = 19 / 0;
                } else {
                    str = this.IAuthTabCallbackStub;
                }
                int i5 = i2 + 61;
                getInterfaceDescriptor = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }

            @Override // o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42
            public String onExtraCallback() {
                String str;
                int i = 2 % 2;
                int i2 = ICustomTabsCallback + 113;
                int i3 = i2 % 128;
                getInterfaceDescriptor = i3;
                if (i2 % 2 != 0) {
                    str = this.onExtraCallback;
                    int i4 = 70 / 0;
                } else {
                    str = this.onExtraCallback;
                }
                int i5 = i3 + 69;
                ICustomTabsCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 18 / 0;
                }
                return str;
            }

            @Override // o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42
            public String asInterface() {
                int i = 2 % 2;
                int i2 = ICustomTabsCallback;
                int i3 = i2 + 39;
                getInterfaceDescriptor = i3 % 128;
                int i4 = i3 % 2;
                String str = this.IAuthTabCallbackStubProxy;
                int i5 = i2 + 3;
                getInterfaceDescriptor = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 91 / 0;
                }
                return str;
            }

            @Override // o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42
            public String IAuthTabCallbackDefault() {
                int i = 2 % 2;
                int i2 = getInterfaceDescriptor + 101;
                int i3 = i2 % 128;
                ICustomTabsCallback = i3;
                if (i2 % 2 == 0) {
                    throw null;
                }
                String str = this.asBinder;
                int i4 = i3 + 15;
                getInterfaceDescriptor = i4 % 128;
                int i5 = i4 % 2;
                return str;
            }

            @Override // o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42
            public String onNavigationEvent() {
                int i = 2 % 2;
                int i2 = ICustomTabsCallback + 75;
                int i3 = i2 % 128;
                getInterfaceDescriptor = i3;
                if (i2 % 2 != 0) {
                    throw null;
                }
                String str = this.onNavigationEvent;
                int i4 = i3 + 113;
                ICustomTabsCallback = i4 % 128;
                int i5 = i4 % 2;
                return str;
            }

            @Override // o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42
            public String asBinder() {
                int i = 2 % 2;
                int i2 = ICustomTabsCallback + 15;
                getInterfaceDescriptor = i2 % 128;
                if (i2 % 2 == 0) {
                    return this.IAuthTabCallbackDefault;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42
            public String onTransact() {
                int i = 2 % 2;
                int i2 = ICustomTabsCallback + 67;
                getInterfaceDescriptor = i2 % 128;
                int i3 = i2 % 2;
                String str = this.asInterface;
                if (i3 != 0) {
                    int i4 = 47 / 0;
                }
                return str;
            }

            @Override // o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42
            public String onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = getInterfaceDescriptor + 87;
                int i3 = i2 % 128;
                ICustomTabsCallback = i3;
                int i4 = i2 % 2;
                String str = this.IAuthTabCallback;
                int i5 = i3 + 89;
                getInterfaceDescriptor = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }

            @Override // o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onWarmupCompleted
            public String IAuthTabCallbackStub() {
                int i = 2 % 2;
                int i2 = getInterfaceDescriptor;
                int i3 = i2 + 115;
                ICustomTabsCallback = i3 % 128;
                int i4 = i3 % 2;
                String str = this.access000;
                int i5 = i2 + 63;
                ICustomTabsCallback = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }

            @Override // o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onWarmupCompleted
            public String IAuthTabCallbackStubProxy() {
                int i = 2 % 2;
                int i2 = getInterfaceDescriptor;
                int i3 = i2 + 73;
                ICustomTabsCallback = i3 % 128;
                Object obj = null;
                if (i3 % 2 == 0) {
                    throw null;
                }
                String str = this.access100;
                int i4 = i2 + 35;
                ICustomTabsCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return str;
                }
                obj.hashCode();
                throw null;
            }

            @Override // o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onWarmupCompleted
            public String access100() {
                String str;
                int i = 2 % 2;
                int i2 = getInterfaceDescriptor;
                int i3 = i2 + 83;
                ICustomTabsCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    str = this.IAuthTabCallback_Parcel;
                    int i4 = 98 / 0;
                } else {
                    str = this.IAuthTabCallback_Parcel;
                }
                int i5 = i2 + 31;
                ICustomTabsCallback = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }

            public final String access000() {
                int i = 2 % 2;
                int i2 = ICustomTabsCallback + 97;
                int i3 = i2 % 128;
                getInterfaceDescriptor = i3;
                int i4 = i2 % 2;
                String str = this.onTransact;
                int i5 = i3 + 83;
                ICustomTabsCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    return str;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final String IAuthTabCallback_Parcel() {
                int i = 2 % 2;
                int i2 = ICustomTabsCallback + 111;
                int i3 = i2 % 128;
                getInterfaceDescriptor = i3;
                int i4 = i2 % 2;
                String str = this.onWarmupCompleted;
                int i5 = i3 + 1;
                ICustomTabsCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 38 / 0;
                }
                return str;
            }
        }
    }
}
