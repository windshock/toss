package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.QueryProductDetailsParams;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class SafeActivityEmbeddingComponentProviderExternalSyntheticLambda25 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27 onExtraCallbackWithResult(@NotNull QueryProductDetailsParams queryProductDetailsParams) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 117;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(queryProductDetailsParams, "");
        if (queryProductDetailsParams instanceof QueryProductDetailsParams.onExtraCallback) {
            return new SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27() { // from class: o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27$asBinder
                private static int IAuthTabCallbackStub = 1;
                private static int asBinder = 0;
                private static int onExtraCallbackWithResult = 1;
                private static int onWarmupCompleted;
                public static final int onNavigationEvent = 8;

                static {
                    int i4 = onExtraCallbackWithResult + 121;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                }

                public boolean equals(@Nullable Object obj) {
                    int i4 = 2 % 2;
                    if (this != obj) {
                        if (obj instanceof SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27$asBinder) {
                            return true;
                        }
                        int i5 = asBinder + 41;
                        IAuthTabCallbackStub = i5 % 128;
                        return i5 % 2 == 0;
                    }
                    int i6 = asBinder + 41;
                    IAuthTabCallbackStub = i6 % 128;
                    if (i6 % 2 != 0) {
                        return true;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }

                public int hashCode() {
                    int i4 = 2 % 2;
                    int i5 = asBinder;
                    int i6 = i5 + 47;
                    IAuthTabCallbackStub = i6 % 128;
                    int i7 = i6 % 2;
                    int i8 = i5 + 115;
                    IAuthTabCallbackStub = i8 % 128;
                    if (i8 % 2 == 0) {
                        int i9 = 73 / 0;
                    }
                    return 1349942949;
                }

                public String toString() {
                    int i4 = 2 % 2;
                    int i5 = asBinder;
                    int i6 = i5 + 87;
                    IAuthTabCallbackStub = i6 % 128;
                    int i7 = i6 % 2;
                    int i8 = i5 + 117;
                    IAuthTabCallbackStub = i8 % 128;
                    if (i8 % 2 != 0) {
                        return "ProductInfoError";
                    }
                    throw null;
                }
            };
        }
        if (queryProductDetailsParams instanceof QueryProductDetailsParams.onWarmupCompleted) {
            int i4 = onNavigationEvent + 9;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27.IAuthTabCallbackStub.onWarmupCompleted;
        }
        if (queryProductDetailsParams instanceof QueryProductDetailsParams.onTransact) {
            int i6 = onNavigationEvent + 69;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27.IAuthTabCallbackStub.onWarmupCompleted;
        }
        if (queryProductDetailsParams instanceof QueryProductDetailsParams.IAuthTabCallbackStub) {
            int i8 = onWarmupCompleted + 13;
            onNavigationEvent = i8 % 128;
            if (i8 % 2 != 0) {
                return new SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27() { // from class: o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27$onNavigationEvent
                    private static int IAuthTabCallbackDefault = 0;
                    private static int onExtraCallback = 0;
                    private static int onExtraCallbackWithResult = 1;
                    private static int onTransact = 1;
                    public static final int onWarmupCompleted = 8;

                    static {
                        int i9 = onExtraCallback + 39;
                        onExtraCallbackWithResult = i9 % 128;
                        int i10 = i9 % 2;
                    }

                    public boolean equals(@Nullable Object obj) {
                        int i9 = 2 % 2;
                        int i10 = IAuthTabCallbackDefault + 105;
                        int i11 = i10 % 128;
                        onTransact = i11;
                        int i12 = i10 % 2;
                        if (this == obj) {
                            int i13 = i11 + 121;
                            IAuthTabCallbackDefault = i13 % 128;
                            int i14 = i13 % 2;
                            return true;
                        }
                        if (obj instanceof SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27$onNavigationEvent) {
                            return true;
                        }
                        int i15 = i11 + 31;
                        IAuthTabCallbackDefault = i15 % 128;
                        int i16 = i15 % 2;
                        return false;
                    }

                    public int hashCode() {
                        int i9 = 2 % 2;
                        int i10 = onTransact + 115;
                        int i11 = i10 % 128;
                        IAuthTabCallbackDefault = i11;
                        if (i10 % 2 != 0) {
                            int i12 = 50 / 0;
                        }
                        int i13 = i11 + 125;
                        onTransact = i13 % 128;
                        int i14 = i13 % 2;
                        return 775554644;
                    }

                    public String toString() {
                        int i9 = 2 % 2;
                        int i10 = onTransact;
                        int i11 = i10 + 99;
                        IAuthTabCallbackDefault = i11 % 128;
                        int i12 = i11 % 2;
                        int i13 = i10 + 109;
                        IAuthTabCallbackDefault = i13 % 128;
                        int i14 = i13 % 2;
                        return "NetworkError";
                    }
                };
            }
            int i9 = 19 / 0;
            return new SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27() { // from class: o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27$onNavigationEvent
                private static int IAuthTabCallbackDefault = 0;
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;
                private static int onTransact = 1;
                public static final int onWarmupCompleted = 8;

                static {
                    int i92 = onExtraCallback + 39;
                    onExtraCallbackWithResult = i92 % 128;
                    int i10 = i92 % 2;
                }

                public boolean equals(@Nullable Object obj) {
                    int i92 = 2 % 2;
                    int i10 = IAuthTabCallbackDefault + 105;
                    int i11 = i10 % 128;
                    onTransact = i11;
                    int i12 = i10 % 2;
                    if (this == obj) {
                        int i13 = i11 + 121;
                        IAuthTabCallbackDefault = i13 % 128;
                        int i14 = i13 % 2;
                        return true;
                    }
                    if (obj instanceof SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27$onNavigationEvent) {
                        return true;
                    }
                    int i15 = i11 + 31;
                    IAuthTabCallbackDefault = i15 % 128;
                    int i16 = i15 % 2;
                    return false;
                }

                public int hashCode() {
                    int i92 = 2 % 2;
                    int i10 = onTransact + 115;
                    int i11 = i10 % 128;
                    IAuthTabCallbackDefault = i11;
                    if (i10 % 2 != 0) {
                        int i12 = 50 / 0;
                    }
                    int i13 = i11 + 125;
                    onTransact = i13 % 128;
                    int i14 = i13 % 2;
                    return 775554644;
                }

                public String toString() {
                    int i92 = 2 % 2;
                    int i10 = onTransact;
                    int i11 = i10 + 99;
                    IAuthTabCallbackDefault = i11 % 128;
                    int i12 = i11 % 2;
                    int i13 = i10 + 109;
                    IAuthTabCallbackDefault = i13 % 128;
                    int i14 = i13 % 2;
                    return "NetworkError";
                }
            };
        }
        if (queryProductDetailsParams instanceof QueryProductDetailsParams.onNavigationEvent) {
            int i10 = onWarmupCompleted + 113;
            onNavigationEvent = i10 % 128;
            if (i10 % 2 != 0) {
                return new SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27() { // from class: o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27$onExtraCallbackWithResult
                    private static int IAuthTabCallbackDefault = 1;
                    private static int asInterface = 0;
                    public static final int onExtraCallbackWithResult = 8;
                    private static int onNavigationEvent = 1;
                    private static int onWarmupCompleted;

                    static {
                        int i11 = onNavigationEvent + 83;
                        onWarmupCompleted = i11 % 128;
                        if (i11 % 2 == 0) {
                            return;
                        }
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }

                    public boolean equals(@Nullable Object obj) {
                        int i11 = 2 % 2;
                        if (this == obj) {
                            int i12 = asInterface + 63;
                            IAuthTabCallbackDefault = i12 % 128;
                            int i13 = i12 % 2;
                            return true;
                        }
                        if (obj instanceof SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27$onExtraCallbackWithResult) {
                            return true;
                        }
                        int i14 = IAuthTabCallbackDefault + 23;
                        asInterface = i14 % 128;
                        return i14 % 2 != 0;
                    }

                    public int hashCode() {
                        int i11 = 2 % 2;
                        int i12 = IAuthTabCallbackDefault;
                        int i13 = i12 + 27;
                        asInterface = i13 % 128;
                        int i14 = i13 % 2;
                        int i15 = i12 + 111;
                        asInterface = i15 % 128;
                        if (i15 % 2 == 0) {
                            return 265430631;
                        }
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }

                    public String toString() {
                        int i11 = 2 % 2;
                        int i12 = asInterface + 79;
                        int i13 = i12 % 128;
                        IAuthTabCallbackDefault = i13;
                        int i14 = i12 % 2;
                        int i15 = i13 + 37;
                        asInterface = i15 % 128;
                        if (i15 % 2 == 0) {
                            return "DevelopmentError";
                        }
                        throw null;
                    }
                };
            }
            int i11 = 0 / 0;
            return new SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27() { // from class: o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27$onExtraCallbackWithResult
                private static int IAuthTabCallbackDefault = 1;
                private static int asInterface = 0;
                public static final int onExtraCallbackWithResult = 8;
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;

                static {
                    int i112 = onNavigationEvent + 83;
                    onWarmupCompleted = i112 % 128;
                    if (i112 % 2 == 0) {
                        return;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                public boolean equals(@Nullable Object obj) {
                    int i112 = 2 % 2;
                    if (this == obj) {
                        int i12 = asInterface + 63;
                        IAuthTabCallbackDefault = i12 % 128;
                        int i13 = i12 % 2;
                        return true;
                    }
                    if (obj instanceof SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27$onExtraCallbackWithResult) {
                        return true;
                    }
                    int i14 = IAuthTabCallbackDefault + 23;
                    asInterface = i14 % 128;
                    return i14 % 2 != 0;
                }

                public int hashCode() {
                    int i112 = 2 % 2;
                    int i12 = IAuthTabCallbackDefault;
                    int i13 = i12 + 27;
                    asInterface = i13 % 128;
                    int i14 = i13 % 2;
                    int i15 = i12 + 111;
                    asInterface = i15 % 128;
                    if (i15 % 2 == 0) {
                        return 265430631;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                public String toString() {
                    int i112 = 2 % 2;
                    int i12 = asInterface + 79;
                    int i13 = i12 % 128;
                    IAuthTabCallbackDefault = i13;
                    int i14 = i12 % 2;
                    int i15 = i13 + 37;
                    asInterface = i15 % 128;
                    if (i15 % 2 == 0) {
                        return "DevelopmentError";
                    }
                    throw null;
                }
            };
        }
        if (queryProductDetailsParams instanceof QueryProductDetailsParams.onExtraCallbackWithResult) {
            int i12 = onNavigationEvent + 5;
            onWarmupCompleted = i12 % 128;
            int i13 = i12 % 2;
            return new SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27() { // from class: o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27$asInterface
                private static int IAuthTabCallbackDefault = 1;
                private static int onNavigationEvent = 0;
                private static int onTransact = 0;
                private static int onWarmupCompleted = 1;
                public static final int onExtraCallback = 8;

                static {
                    int i14 = onNavigationEvent + 71;
                    onWarmupCompleted = i14 % 128;
                    if (i14 % 2 != 0) {
                        return;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                public boolean equals(@Nullable Object obj) {
                    int i14 = 2 % 2;
                    int i15 = IAuthTabCallbackDefault;
                    int i16 = i15 + 73;
                    int i17 = i16 % 128;
                    onTransact = i17;
                    Object obj2 = null;
                    if (i16 % 2 != 0) {
                        throw null;
                    }
                    if (this == obj) {
                        int i18 = i17 + 45;
                        IAuthTabCallbackDefault = i18 % 128;
                        int i19 = i18 % 2;
                        return true;
                    }
                    if (!(obj instanceof SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27$asInterface)) {
                        int i20 = i15 + 63;
                        onTransact = i20 % 128;
                        int i21 = i20 % 2;
                        return false;
                    }
                    int i22 = i15 + 79;
                    onTransact = i22 % 128;
                    if (i22 % 2 == 0) {
                        return true;
                    }
                    obj2.hashCode();
                    throw null;
                }

                public int hashCode() {
                    int i14 = 2 % 2;
                    int i15 = onTransact;
                    int i16 = i15 + 17;
                    IAuthTabCallbackDefault = i16 % 128;
                    int i17 = i16 % 2;
                    int i18 = i15 + 19;
                    IAuthTabCallbackDefault = i18 % 128;
                    int i19 = i18 % 2;
                    return -511901685;
                }

                public String toString() {
                    int i14 = 2 % 2;
                    int i15 = onTransact;
                    int i16 = i15 + 57;
                    IAuthTabCallbackDefault = i16 % 128;
                    int i17 = i16 % 2;
                    int i18 = i15 + 115;
                    IAuthTabCallbackDefault = i18 % 128;
                    int i19 = i18 % 2;
                    return "PaymentPending";
                }
            };
        }
        if (queryProductDetailsParams instanceof QueryProductDetailsParams.IAuthTabCallback) {
            int i14 = onWarmupCompleted + 17;
            onNavigationEvent = i14 % 128;
            int i15 = i14 % 2;
            return new SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27() { // from class: o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27$onWarmupCompleted
                private static int IAuthTabCallbackDefault = 0;
                public static final int onExtraCallbackWithResult = 8;
                private static int onNavigationEvent = 1;
                private static int onTransact = 1;
                private static int onWarmupCompleted;

                static {
                    int i16 = onWarmupCompleted + 17;
                    onNavigationEvent = i16 % 128;
                    if (i16 % 2 != 0) {
                        return;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                public boolean equals(@Nullable Object obj) {
                    int i16 = 2 % 2;
                    int i17 = IAuthTabCallbackDefault;
                    int i18 = i17 + 53;
                    int i19 = i18 % 128;
                    onTransact = i19;
                    int i20 = i18 % 2;
                    if (this == obj) {
                        return true;
                    }
                    if (obj instanceof SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27$onWarmupCompleted) {
                        int i21 = i17 + 87;
                        onTransact = i21 % 128;
                        int i22 = i21 % 2;
                        return true;
                    }
                    int i23 = i19 + 5;
                    IAuthTabCallbackDefault = i23 % 128;
                    int i24 = i23 % 2;
                    return false;
                }

                public int hashCode() {
                    int i16 = 2 % 2;
                    int i17 = onTransact + 115;
                    int i18 = i17 % 128;
                    IAuthTabCallbackDefault = i18;
                    Object obj = null;
                    if (i17 % 2 != 0) {
                        throw null;
                    }
                    int i19 = i18 + 29;
                    onTransact = i19 % 128;
                    if (i19 % 2 != 0) {
                        return 1223594817;
                    }
                    obj.hashCode();
                    throw null;
                }

                public String toString() {
                    int i16 = 2 % 2;
                    int i17 = IAuthTabCallbackDefault + 39;
                    int i18 = i17 % 128;
                    onTransact = i18;
                    int i19 = i17 % 2;
                    int i20 = i18 + 63;
                    IAuthTabCallbackDefault = i20 % 128;
                    int i21 = i20 % 2;
                    return "AlreadyOwnedError";
                }
            };
        }
        if (queryProductDetailsParams instanceof QueryProductDetailsParams.IAuthTabCallbackDefault) {
            return SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27$IAuthTabCallback_Parcel.onExtraCallbackWithResult;
        }
        if (!(queryProductDetailsParams instanceof QueryProductDetailsParams.asInterface)) {
            if (queryProductDetailsParams instanceof QueryProductDetailsParams.asBinder) {
                return SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27$IAuthTabCallback_Parcel.onExtraCallbackWithResult;
            }
            if (queryProductDetailsParams instanceof QueryProductDetailsParams.access100) {
                return SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27$IAuthTabCallbackStubProxy.onWarmupCompleted;
            }
            throw new NoWhenBranchMatchedException();
        }
        int i16 = onWarmupCompleted + 17;
        onNavigationEvent = i16 % 128;
        if (i16 % 2 != 0) {
            return SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27$IAuthTabCallback_Parcel.onExtraCallbackWithResult;
        }
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27$IAuthTabCallback_Parcel safeActivityEmbeddingComponentProviderExternalSyntheticLambda27$IAuthTabCallback_Parcel = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27$IAuthTabCallback_Parcel.onExtraCallbackWithResult;
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
