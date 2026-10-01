package o;

import im.toss.appsintoss.R;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33 {
    private static int IAuthTabCallbackDefault = 1;
    private static int asBinder;
    private final onExtraCallbackWithResult IAuthTabCallback;
    private final String onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final IAuthTabCallback onNavigationEvent;
    private final String onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33)) {
            return false;
        }
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33 safeActivityEmbeddingComponentProviderExternalSyntheticLambda33 = (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33) obj;
        if (!Intrinsics.areEqual(this.onWarmupCompleted, safeActivityEmbeddingComponentProviderExternalSyntheticLambda33.onWarmupCompleted)) {
            int i3 = asBinder + 109;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.onExtraCallback, safeActivityEmbeddingComponentProviderExternalSyntheticLambda33.onExtraCallback)) {
            return Intrinsics.areEqual(this.onExtraCallbackWithResult, safeActivityEmbeddingComponentProviderExternalSyntheticLambda33.onExtraCallbackWithResult) && Intrinsics.areEqual(this.onNavigationEvent, safeActivityEmbeddingComponentProviderExternalSyntheticLambda33.onNavigationEvent) && Intrinsics.areEqual(this.IAuthTabCallback, safeActivityEmbeddingComponentProviderExternalSyntheticLambda33.IAuthTabCallback);
        }
        int i5 = IAuthTabCallbackDefault + 113;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        String str;
        int iHashCode3;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 31;
        asBinder = i3 % 128;
        int iHashCode4 = 0;
        if (i3 % 2 != 0) {
            iHashCode = this.onWarmupCompleted.hashCode();
            iHashCode2 = this.onExtraCallback.hashCode();
            str = this.onExtraCallbackWithResult;
            iHashCode3 = 1;
            if (str != null) {
                iHashCode4 = 1;
                iHashCode3 = iHashCode4;
                iHashCode4 = str.hashCode();
            }
            int i4 = IAuthTabCallbackDefault + 105;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
        } else {
            iHashCode = this.onWarmupCompleted.hashCode();
            iHashCode2 = this.onExtraCallback.hashCode();
            str = this.onExtraCallbackWithResult;
            if (str == null) {
                iHashCode3 = 0;
                int i42 = IAuthTabCallbackDefault + 105;
                asBinder = i42 % 128;
                int i52 = i42 % 2;
            }
            iHashCode3 = iHashCode4;
            iHashCode4 = str.hashCode();
        }
        IAuthTabCallback iAuthTabCallback = this.onNavigationEvent;
        if (iAuthTabCallback != null) {
            int i6 = asBinder + 89;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
            iHashCode3 = iAuthTabCallback.hashCode();
        }
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode4) * 31) + iHashCode3) * 31) + this.IAuthTabCallback.hashCode();
    }

    public String toString() {
        int i2 = 2 % 2;
        String str = "InAppTossPurchaseErrorUIModel(iconUrl=" + this.onWarmupCompleted + ", title=" + this.onExtraCallback + ", subtitle=" + this.onExtraCallbackWithResult + ", description=" + this.onNavigationEvent + ", cta=" + this.IAuthTabCallback + ")";
        int i3 = asBinder + 33;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 21 / 0;
        }
        return str;
    }

    public SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable IAuthTabCallback iAuthTabCallback, @NotNull onExtraCallbackWithResult onextracallbackwithresult) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        this.onWarmupCompleted = str;
        this.onExtraCallback = str2;
        this.onExtraCallbackWithResult = str3;
        this.onNavigationEvent = iAuthTabCallback;
        this.IAuthTabCallback = onextracallbackwithresult;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33(String str, String str2, String str3, IAuthTabCallback iAuthTabCallback, onExtraCallbackWithResult onextracallbackwithresult, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        String str4;
        IAuthTabCallback iAuthTabCallback2;
        if ((i2 & 4) != 0) {
            int i3 = asBinder + 73;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            str4 = null;
        } else {
            str4 = str3;
        }
        if ((i2 & 8) != 0) {
            int i4 = IAuthTabCallbackDefault + 85;
            asBinder = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            int i5 = 2 % 2;
            iAuthTabCallback2 = null;
        } else {
            iAuthTabCallback2 = iAuthTabCallback;
        }
        this(str, str2, str4, iAuthTabCallback2, onextracallbackwithresult);
    }

    public final String onExtraCallbackWithResult() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 51;
        int i4 = i3 % 128;
        asBinder = i4;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.onWarmupCompleted;
        int i5 = i4 + 25;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String onNavigationEvent() {
        int i2 = 2 % 2;
        int i3 = asBinder + 119;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.onExtraCallback;
        if (i4 == 0) {
            int i5 = 58 / 0;
        }
        return str;
    }

    public final String onWarmupCompleted() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 39;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        String str = this.onExtraCallbackWithResult;
        if (i4 != 0) {
            int i5 = 97 / 0;
        }
        return str;
    }

    public final IAuthTabCallback onExtraCallback() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 121;
        int i4 = i3 % 128;
        asBinder = i4;
        int i5 = i3 % 2;
        IAuthTabCallback iAuthTabCallback = this.onNavigationEvent;
        int i6 = i4 + 51;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 != 0) {
            return iAuthTabCallback;
        }
        throw null;
    }

    public final onExtraCallbackWithResult IAuthTabCallback() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault;
        int i4 = i3 + 95;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        onExtraCallbackWithResult onextracallbackwithresult = this.IAuthTabCallback;
        int i6 = i3 + 65;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return onextracallbackwithresult;
    }

    public static final class IAuthTabCallback {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        private final List<String> onExtraCallback;
        private final String onExtraCallbackWithResult;

        public boolean equals(@Nullable Object obj) {
            int i2 = 2 % 2;
            if (this == obj) {
                int i3 = onNavigationEvent + 97;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                return true;
            }
            Object obj2 = null;
            if (!(obj instanceof IAuthTabCallback)) {
                int i5 = onNavigationEvent + 23;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    return false;
                }
                obj2.hashCode();
                throw null;
            }
            if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, ((IAuthTabCallback) obj).onExtraCallbackWithResult)) {
                int i6 = onNavigationEvent + 61;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.onExtraCallback, r7.onExtraCallback)) {
                return false;
            }
            int i8 = onWarmupCompleted + 93;
            onNavigationEvent = i8 % 128;
            if (i8 % 2 != 0) {
                return true;
            }
            obj2.hashCode();
            throw null;
        }

        public int hashCode() {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 25;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            int iHashCode = (this.onExtraCallbackWithResult.hashCode() * 31) + this.onExtraCallback.hashCode();
            int i5 = onNavigationEvent + 43;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return iHashCode;
        }

        public String toString() {
            int i2 = 2 % 2;
            String str = "DescriptionUIModelItem(title=" + this.onExtraCallbackWithResult + ", items=" + this.onExtraCallback + ")";
            int i3 = onWarmupCompleted + 105;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                return str;
            }
            throw null;
        }

        public IAuthTabCallback(@NotNull String str, @NotNull List<String> list) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.onExtraCallbackWithResult = str;
            this.onExtraCallback = list;
        }

        public final String IAuthTabCallback() {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent;
            int i4 = i3 + 37;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            String str = this.onExtraCallbackWithResult;
            int i6 = i3 + 39;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return str;
        }

        public final List<String> onExtraCallback() {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted;
            int i4 = i3 + 79;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            List<String> list = this.onExtraCallback;
            int i6 = i3 + 57;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return list;
        }
    }

    public static final class onExtraCallbackWithResult {
        public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
        private static int IAuthTabCallbackStubProxy = 1;
        private static int access100 = 1;
        private static int getInterfaceDescriptor;
        private static int onTransact;
        private final onExtraCallback IAuthTabCallback;
        private final onExtraCallback IAuthTabCallbackDefault;
        private final String IAuthTabCallbackStub;
        private final String asBinder;
        private final String asInterface;
        private final String onExtraCallback;
        private final String onExtraCallbackWithResult;
        private final String onNavigationEvent;
        private final onExtraCallback onWarmupCompleted;

        static {
            int i2 = IAuthTabCallbackStubProxy + 79;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
        }

        public boolean equals(@Nullable Object obj) {
            int i2 = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onExtraCallbackWithResult)) {
                return false;
            }
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) obj;
            if (!Intrinsics.areEqual(this.onNavigationEvent, onextracallbackwithresult.onNavigationEvent) || !Intrinsics.areEqual(this.IAuthTabCallbackStub, onextracallbackwithresult.IAuthTabCallbackStub)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.onWarmupCompleted, onextracallbackwithresult.onWarmupCompleted)) {
                int i3 = access100 + 57;
                getInterfaceDescriptor = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.asInterface, onextracallbackwithresult.asInterface)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.asBinder, onextracallbackwithresult.asBinder)) {
                int i5 = access100 + 65;
                getInterfaceDescriptor = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.IAuthTabCallbackDefault, onextracallbackwithresult.IAuthTabCallbackDefault)) {
                int i7 = access100 + 51;
                getInterfaceDescriptor = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.onExtraCallback, onextracallbackwithresult.onExtraCallback)) {
                return Intrinsics.areEqual(this.onExtraCallbackWithResult, onextracallbackwithresult.onExtraCallbackWithResult) && Intrinsics.areEqual(this.IAuthTabCallback, onextracallbackwithresult.IAuthTabCallback);
            }
            int i9 = access100 + 13;
            getInterfaceDescriptor = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int i2 = 2 % 2;
            int iHashCode2 = this.onNavigationEvent.hashCode();
            int iHashCode3 = this.IAuthTabCallbackStub.hashCode();
            int iHashCode4 = this.onWarmupCompleted.hashCode();
            String str = this.asInterface;
            int iHashCode5 = 0;
            int iHashCode6 = str == null ? 0 : str.hashCode();
            String str2 = this.asBinder;
            int iHashCode7 = str2 == null ? 0 : str2.hashCode();
            int iHashCode8 = this.IAuthTabCallbackDefault.hashCode();
            String str3 = this.onExtraCallback;
            if (str3 == null) {
                int i3 = getInterfaceDescriptor + 55;
                access100 = i3 % 128;
                int i4 = i3 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str3.hashCode();
            }
            String str4 = this.onExtraCallbackWithResult;
            if (str4 != null) {
                iHashCode5 = str4.hashCode();
                int i5 = access100 + 33;
                getInterfaceDescriptor = i5 % 128;
                int i6 = i5 % 2;
            }
            return (((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode) * 31) + iHashCode5) * 31) + this.IAuthTabCallback.hashCode();
        }

        public String toString() {
            int i2 = 2 % 2;
            String str = "CtaUIModelItem(label=" + this.onNavigationEvent + ", labelLog=" + this.IAuthTabCallbackStub + ", action=" + this.onWarmupCompleted + ", secondaryLabel=" + this.asInterface + ", secondaryLabelLog=" + this.asBinder + ", secondaryAction=" + this.IAuthTabCallbackDefault + ", bottomAccessoryLabel=" + this.onExtraCallback + ", bottomAccessoryLabelLog=" + this.onExtraCallbackWithResult + ", bottomAccessoryAction=" + this.IAuthTabCallback + ")";
            int i3 = access100 + 99;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
            return str;
        }

        public onExtraCallbackWithResult(@NotNull String str, @NotNull String str2, @NotNull onExtraCallback onextracallback, @Nullable String str3, @Nullable String str4, @NotNull onExtraCallback onextracallback2, @Nullable String str5, @Nullable String str6, @NotNull onExtraCallback onextracallback3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(onextracallback, "");
            Intrinsics.checkNotNullParameter(onextracallback2, "");
            Intrinsics.checkNotNullParameter(onextracallback3, "");
            this.onNavigationEvent = str;
            this.IAuthTabCallbackStub = str2;
            this.onWarmupCompleted = onextracallback;
            this.asInterface = str3;
            this.asBinder = str4;
            this.IAuthTabCallbackDefault = onextracallback2;
            this.onExtraCallback = str5;
            this.onExtraCallbackWithResult = str6;
            this.IAuthTabCallback = onextracallback3;
        }

        public final String onWarmupCompleted() {
            int i2 = 2 % 2;
            int i3 = access100 + 69;
            getInterfaceDescriptor = i3 % 128;
            if (i3 % 2 == 0) {
                return this.onNavigationEvent;
            }
            throw null;
        }

        public final String IAuthTabCallback() {
            int i2 = 2 % 2;
            int i3 = access100;
            int i4 = i3 + 51;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
            String str = this.IAuthTabCallbackStub;
            int i6 = i3 + 123;
            getInterfaceDescriptor = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 42 / 0;
            }
            return str;
        }

        public final onExtraCallback onExtraCallback() {
            int i2 = 2 % 2;
            int i3 = getInterfaceDescriptor;
            int i4 = i3 + 73;
            access100 = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            onExtraCallback onextracallback = this.onWarmupCompleted;
            int i5 = i3 + 23;
            access100 = i5 % 128;
            if (i5 % 2 != 0) {
                return onextracallback;
            }
            throw null;
        }

        public final String asInterface() {
            int i2 = 2 % 2;
            int i3 = access100 + 53;
            int i4 = i3 % 128;
            getInterfaceDescriptor = i4;
            int i5 = i3 % 2;
            String str = this.asInterface;
            int i6 = i4 + 69;
            access100 = i6 % 128;
            int i7 = i6 % 2;
            return str;
        }

        public final String IAuthTabCallbackDefault() {
            String str;
            int i2 = 2 % 2;
            int i3 = getInterfaceDescriptor;
            int i4 = i3 + 29;
            access100 = i4 % 128;
            if (i4 % 2 == 0) {
                str = this.asBinder;
                int i5 = 46 / 0;
            } else {
                str = this.asBinder;
            }
            int i6 = i3 + 109;
            access100 = i6 % 128;
            int i7 = i6 % 2;
            return str;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ onExtraCallbackWithResult(String str, String str2, onExtraCallback onextracallback, String str3, String str4, onExtraCallback onextracallback2, String str5, String str6, onExtraCallback onextracallback3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            String str7;
            String str8;
            onExtraCallback onextracallback4;
            Object obj = null;
            String str9 = (i2 & 8) != 0 ? null : str3;
            String str10 = (i2 & 16) != 0 ? null : str4;
            onExtraCallback onextracallback5 = (i2 & 32) != 0 ? onExtraCallback.IAuthTabCallback.onNavigationEvent : onextracallback2;
            if ((i2 & 64) != 0) {
                int i3 = 2 % 2;
                str7 = null;
            } else {
                str7 = str5;
            }
            if ((i2 & 128) != 0) {
                int i4 = getInterfaceDescriptor + 1;
                access100 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 2 % 2;
                }
                str8 = null;
            } else {
                str8 = str6;
            }
            if ((i2 & 256) != 0) {
                int i6 = getInterfaceDescriptor + 77;
                access100 = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 2 % 2;
                    onextracallback4 = onExtraCallback.IAuthTabCallback.onNavigationEvent;
                } else {
                    onExtraCallback.IAuthTabCallback iAuthTabCallback = onExtraCallback.IAuthTabCallback.onNavigationEvent;
                    obj.hashCode();
                    throw null;
                }
            } else {
                onextracallback4 = onextracallback3;
            }
            this(str, str2, onextracallback, str9, str10, onextracallback5, str7, str8, onextracallback4);
        }

        public final onExtraCallback asBinder() {
            int i2 = 2 % 2;
            int i3 = getInterfaceDescriptor + 15;
            int i4 = i3 % 128;
            access100 = i4;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            onExtraCallback onextracallback = this.IAuthTabCallbackDefault;
            int i5 = i4 + 117;
            getInterfaceDescriptor = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 29 / 0;
            }
            return onextracallback;
        }

        public final String onNavigationEvent() {
            int i2 = 2 % 2;
            int i3 = getInterfaceDescriptor + 51;
            access100 = i3 % 128;
            if (i3 % 2 != 0) {
                return this.onExtraCallback;
            }
            throw null;
        }

        public final onExtraCallback onExtraCallbackWithResult() {
            int i2 = 2 % 2;
            int i3 = getInterfaceDescriptor;
            int i4 = i3 + 73;
            access100 = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            onExtraCallback onextracallback = this.IAuthTabCallback;
            int i5 = i3 + 111;
            access100 = i5 % 128;
            int i6 = i5 % 2;
            return onextracallback;
        }

        public static final class IAuthTabCallback {
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private IAuthTabCallback() {
            }

            public final onExtraCallbackWithResult onWarmupCompleted(@Nullable String str, @Nullable String str2, @Nullable onExtraCallback onextracallback, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2, int i3) {
                String strOnExtraCallback;
                int i4 = 2 % 2;
                int i5 = IAuthTabCallback;
                int i6 = i5 + 101;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 != 0 ? (i3 & 1) == 0 : (i3 & 1) == 0) {
                    strOnExtraCallback = str;
                } else {
                    int i7 = i5 + 17;
                    onNavigationEvent = i7 % 128;
                    int i8 = i7 % 2;
                    strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.appsintoss_in_app_purchase_error_cta_confirm, cameraCaptureResultEmptyCameraCaptureResult, 0);
                }
                String str3 = (i3 & 2) != 0 ? "confirm" : str2;
                onExtraCallback onextracallback2 = (i3 & 4) != 0 ? onExtraCallback.onNavigationEvent.onExtraCallbackWithResult : onextracallback;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i9 = onNavigationEvent + 33;
                    IAuthTabCallback = i9 % 128;
                    int i10 = i9 % 2;
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(843599849, i2, -1, "im.toss.appsintoss.iap.model.InAppTossPurchaseErrorUIModel.CtaUIModelItem.Companion.createDefault (InAppTossPurchaseErrorUIModel.kt:40)");
                }
                onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(strOnExtraCallback, str3, onextracallback2, null, null, null, null, null, null, 504, null);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i11 = onNavigationEvent + 95;
                    IAuthTabCallback = i11 % 128;
                    int i12 = i11 % 2;
                }
                return onextracallbackwithresult;
            }
        }
    }

    public interface onExtraCallback {

        public static final class onNavigationEvent implements onExtraCallback {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 0;
            public static final onNavigationEvent onExtraCallbackWithResult = new onNavigationEvent();
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted = 1;

            static {
                int i2 = onWarmupCompleted + 41;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
            }

            public boolean equals(@Nullable Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback;
                int i4 = i3 + 115;
                int i5 = i4 % 128;
                onNavigationEvent = i5;
                int i6 = i4 % 2;
                if (this == obj) {
                    int i7 = i3 + 87;
                    onNavigationEvent = i7 % 128;
                    return i7 % 2 != 0;
                }
                if (obj instanceof onNavigationEvent) {
                    int i8 = i3 + 109;
                    onNavigationEvent = i8 % 128;
                    int i9 = i8 % 2;
                    return true;
                }
                int i10 = i5 + 89;
                onExtraCallback = i10 % 128;
                int i11 = i10 % 2;
                return false;
            }

            public int hashCode() {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 9;
                int i4 = i3 % 128;
                onExtraCallback = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 87;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 47 / 0;
                }
                return -958238408;
            }

            public String toString() {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 121;
                int i4 = i3 % 128;
                onExtraCallback = i4;
                if (i3 % 2 != 0) {
                    throw null;
                }
                int i5 = i4 + 9;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return "ExitFromPurchaseFlow";
            }

            private onNavigationEvent() {
            }
        }

        public static final class onWarmupCompleted implements onExtraCallback {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback = 0;
            public static final onWarmupCompleted onExtraCallbackWithResult = new onWarmupCompleted();
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            static {
                int i2 = onWarmupCompleted + 119;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
            }

            public boolean equals(@Nullable Object obj) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback;
                int i4 = i3 + 119;
                int i5 = i4 % 128;
                onExtraCallback = i5;
                int i6 = i4 % 2;
                if (this == obj) {
                    int i7 = i5 + 67;
                    IAuthTabCallback = i7 % 128;
                    return i7 % 2 != 0;
                }
                if (obj instanceof onWarmupCompleted) {
                    return true;
                }
                int i8 = i3 + 105;
                onExtraCallback = i8 % 128;
                return i8 % 2 != 0;
            }

            public int hashCode() {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 59;
                int i4 = i3 % 128;
                onExtraCallback = i4;
                if (i3 % 2 != 0) {
                    int i5 = 5 / 0;
                }
                int i6 = i4 + 69;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                return -1826272686;
            }

            public String toString() {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 123;
                int i4 = i3 % 128;
                onExtraCallback = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 93;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    return "BackToPurchaseFlow";
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private onWarmupCompleted() {
            }
        }

        public static final class onExtraCallbackWithResult implements onExtraCallback {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            public static final onExtraCallbackWithResult onNavigationEvent = new onExtraCallbackWithResult();
            private static int onWarmupCompleted;

            static {
                int i2 = onExtraCallback + 99;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    throw null;
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
            
                if ((!(r6 instanceof o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33.onExtraCallback.onExtraCallbackWithResult)) == true) goto L13;
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
            
                return true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
            
                return false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
            
                if (r5 == r6) goto L8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
            
                if (r5 == r6) goto L8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
            
                r1 = r1 + 89;
                r6 = r1 % 128;
                o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33.onExtraCallback.onExtraCallbackWithResult.IAuthTabCallback = r6;
                r1 = r1 % 2;
                r6 = r6 + 45;
                o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33.onExtraCallback.onExtraCallbackWithResult.onWarmupCompleted = r6 % 128;
                r6 = r6 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
            
                return true;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public boolean equals(@Nullable Object obj) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted;
                int i4 = i3 + 91;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 41 / 0;
                }
            }

            public int hashCode() {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback;
                int i4 = i3 + 65;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
                int i5 = i3 + 17;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return 1665161503;
            }

            public String toString() {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 63;
                int i4 = i3 % 128;
                IAuthTabCallback = i4;
                Object obj = null;
                if (i3 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                int i5 = i4 + 83;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    return "Contact";
                }
                obj.hashCode();
                throw null;
            }

            private onExtraCallbackWithResult() {
            }
        }

        /* renamed from: o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33$onExtraCallback$onExtraCallback, reason: collision with other inner class name */
        public static final class C0041onExtraCallback implements onExtraCallback {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;
            public static final C0041onExtraCallback onWarmupCompleted = new C0041onExtraCallback();

            static {
                int i2 = onNavigationEvent + 105;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
            }

            public boolean equals(@Nullable Object obj) {
                int i2 = 2 % 2;
                if (this == obj) {
                    int i3 = onExtraCallback + 121;
                    IAuthTabCallback = i3 % 128;
                    if (i3 % 2 == 0) {
                        return true;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                if (obj instanceof C0041onExtraCallback) {
                    return true;
                }
                int i4 = IAuthTabCallback + 77;
                int i5 = i4 % 128;
                onExtraCallback = i5;
                int i6 = i4 % 2;
                int i7 = i5 + 51;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }

            public int hashCode() {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 75;
                int i4 = i3 % 128;
                onExtraCallback = i4;
                if (i3 % 2 == 0) {
                    throw null;
                }
                int i5 = i4 + 29;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return -1351627416;
            }

            public String toString() {
                int i2 = 2 % 2;
                int i3 = onExtraCallback;
                int i4 = i3 + 123;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 119;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 38 / 0;
                }
                return "GoToPlayStorePurchaseList";
            }

            private C0041onExtraCallback() {
            }
        }

        public static final class IAuthTabCallback implements onExtraCallback {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            public static final IAuthTabCallback onNavigationEvent = new IAuthTabCallback();
            private static int onWarmupCompleted;

            static {
                int i2 = onExtraCallback + 41;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 58 / 0;
                }
            }

            public boolean equals(@Nullable Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult;
                int i4 = i3 + 115;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                if (this != obj) {
                    return obj instanceof IAuthTabCallback;
                }
                int i6 = i3 + 93;
                onWarmupCompleted = i6 % 128;
                boolean z = !(i6 % 2 != 0);
                int i7 = i3 + 85;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                return z;
            }

            public int hashCode() {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 77;
                int i4 = i3 % 128;
                onWarmupCompleted = i4;
                Object obj = null;
                if (i3 % 2 != 0) {
                    throw null;
                }
                int i5 = i4 + 13;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    return -2070855167;
                }
                obj.hashCode();
                throw null;
            }

            public String toString() {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted;
                int i4 = i3 + 105;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 27;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                return "DoNothing";
            }

            private IAuthTabCallback() {
            }
        }
    }
}
