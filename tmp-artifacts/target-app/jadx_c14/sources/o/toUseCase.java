package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class toUseCase extends RCTCodelessLoggingEventListener {
    public static final Parcelable.Creator<toUseCase> CREATOR = new onExtraCallback();
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final Boolean clearPreviousLayouts;
    private final String description;
    private final RestrictiveDataManager finCert;
    private final boolean hasTossCert;
    private final String key;
    private final Map<String, Object> logParam;
    private final DynamicLoader navigationRightButton;
    private final RCTCodelessLoggingEventListener onBack;
    private final String title;
    private final RetainingDataSourceSupplier tossCert;
    private final String type;

    public static final class onExtraCallback implements Parcelable.Creator<toUseCase> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ toUseCase createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 77;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            toUseCase tousecaseOnNavigationEvent = onNavigationEvent(parcel);
            if (i3 == 0) {
                int i4 = 51 / 0;
            }
            return tousecaseOnNavigationEvent;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ toUseCase[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 119;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                onNavigationEvent(i);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            toUseCase[] tousecaseArrOnNavigationEvent = onNavigationEvent(i);
            int i4 = onNavigationEvent + 101;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 11 / 0;
            }
            return tousecaseArrOnNavigationEvent;
        }

        public final toUseCase onNavigationEvent(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            DynamicLoader dynamicLoaderCreateFromParcel;
            RetainingDataSourceSupplier retainingDataSourceSupplierCreateFromParcel;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 71;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (i3 != 0) {
                parcel.readString();
                parcel.readString();
                parcel.readInt();
                restrictiveDataManager.hashCode();
                throw null;
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = (RCTCodelessLoggingEventListener) parcel.readParcelable(toUseCase.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    int i4 = onNavigationEvent + 79;
                    onWarmupCompleted = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 3 / 2;
                    }
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            if (parcel.readInt() == 0) {
                int i6 = onWarmupCompleted + 95;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 14 / 0;
                }
                dynamicLoaderCreateFromParcel = null;
            } else {
                dynamicLoaderCreateFromParcel = DynamicLoader.CREATOR.createFromParcel(parcel);
            }
            DynamicLoader dynamicLoader = dynamicLoaderCreateFromParcel;
            Map<String, Object> mapOnNavigationEvent = Preconditions.INSTANCE.onNavigationEvent(parcel);
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                int i8 = onNavigationEvent + 27;
                onWarmupCompleted = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 3 / 0;
                }
                retainingDataSourceSupplierCreateFromParcel = null;
            } else {
                retainingDataSourceSupplierCreateFromParcel = RetainingDataSourceSupplier.CREATOR.createFromParcel(parcel);
            }
            return new toUseCase(string, string2, rCTCodelessLoggingEventListener, boolValueOf, dynamicLoader, mapOnNavigationEvent, string3, string4, z2, retainingDataSourceSupplierCreateFromParcel, parcel.readInt() != 0 ? RestrictiveDataManager.CREATOR.createFromParcel(parcel) : null);
        }

        public final toUseCase[] onNavigationEvent(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 123;
            int i4 = i3 % 128;
            onNavigationEvent = i4;
            int i5 = i3 % 2;
            toUseCase[] tousecaseArr = new toUseCase[i];
            int i6 = i4 + 75;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return tousecaseArr;
        }
    }

    static {
        int i = onWarmupCompleted + 11;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            int i2 = 75 / 0;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 33;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 93;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045 A[PHI: r1
      0x0045: PHI (r1v17 java.lang.Boolean) = (r1v7 java.lang.Boolean), (r1v22 java.lang.Boolean) binds: [B:8:0x003f, B:5:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0041  */
    @Override // android.os.Parcelable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel r6, int r7) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.toUseCase.onExtraCallbackWithResult
            int r1 = r1 + 73
            int r2 = r1 % 128
            o.toUseCase.IAuthTabCallback = r2
            int r1 = r1 % r0
            java.lang.String r2 = ""
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L2b
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r2)
            java.lang.String r1 = r5.key
            r6.writeString(r1)
            java.lang.String r1 = r5.type
            r6.writeString(r1)
            o.RCTCodelessLoggingEventListener r1 = r5.onBack
            r6.writeParcelable(r1, r7)
            java.lang.Boolean r1 = r5.clearPreviousLayouts
            r2 = 4
            int r2 = r2 / r4
            if (r1 != 0) goto L45
            goto L41
        L2b:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r2)
            java.lang.String r1 = r5.key
            r6.writeString(r1)
            java.lang.String r1 = r5.type
            r6.writeString(r1)
            o.RCTCodelessLoggingEventListener r1 = r5.onBack
            r6.writeParcelable(r1, r7)
            java.lang.Boolean r1 = r5.clearPreviousLayouts
            if (r1 != 0) goto L45
        L41:
            r6.writeInt(r4)
            goto L4f
        L45:
            r6.writeInt(r3)
            boolean r1 = r1.booleanValue()
            r6.writeInt(r1)
        L4f:
            o.DynamicLoader r1 = r5.navigationRightButton
            if (r1 != 0) goto L57
            r6.writeInt(r4)
            goto L5d
        L57:
            r6.writeInt(r3)
            r1.writeToParcel(r6, r7)
        L5d:
            o.Preconditions r1 = o.Preconditions.INSTANCE
            java.util.Map<java.lang.String, java.lang.Object> r2 = r5.logParam
            r1.onExtraCallbackWithResult(r2, r6, r7)
            java.lang.String r1 = r5.title
            r6.writeString(r1)
            java.lang.String r1 = r5.description
            r6.writeString(r1)
            boolean r1 = r5.hasTossCert
            r6.writeInt(r1)
            o.RetainingDataSourceSupplier r1 = r5.tossCert
            if (r1 != 0) goto L8a
            int r1 = o.toUseCase.IAuthTabCallback
            int r1 = r1 + 65
            int r2 = r1 % 128
            o.toUseCase.onExtraCallbackWithResult = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L86
            r6.writeInt(r4)
            goto L90
        L86:
            r6.writeInt(r4)
            goto L90
        L8a:
            r6.writeInt(r3)
            r1.writeToParcel(r6, r7)
        L90:
            o.RestrictiveDataManager r0 = r5.finCert
            if (r0 != 0) goto L98
            r6.writeInt(r4)
            return
        L98:
            r6.writeInt(r3)
            r0.writeToParcel(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.toUseCase.writeToParcel(android.os.Parcel, int):void");
    }

    public toUseCase(@NotNull String str, @NotNull String str2, @Nullable RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map, @NotNull String str3, @Nullable String str4, boolean z, @Nullable RetainingDataSourceSupplier retainingDataSourceSupplier, @Nullable RestrictiveDataManager restrictiveDataManager) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.key = str;
        this.type = str2;
        this.onBack = rCTCodelessLoggingEventListener;
        this.clearPreviousLayouts = bool;
        this.navigationRightButton = dynamicLoader;
        this.logParam = map;
        this.title = str3;
        this.description = str4;
        this.hasTossCert = z;
        this.tossCert = retainingDataSourceSupplier;
        this.finCert = restrictiveDataManager;
    }

    public String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 95;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.key;
        int i5 = i3 + 33;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public String IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 67;
        onExtraCallbackWithResult = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.type;
        int i4 = i2 + 51;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public RCTCodelessLoggingEventListener asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 119;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = this.onBack;
        int i5 = i2 + 111;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return rCTCodelessLoggingEventListener;
    }

    public Boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 83;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Boolean bool = this.clearPreviousLayouts;
        int i5 = i2 + 23;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return bool;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public DynamicLoader asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 19;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        DynamicLoader dynamicLoader = this.navigationRightButton;
        int i5 = i2 + 21;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return dynamicLoader;
    }

    public Map<String, Object> IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 77;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        Map<String, Object> map = this.logParam;
        int i5 = i3 + 1;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    public final String onTransact() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 5;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.title;
        int i5 = i2 + 1;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 4 / 0;
        }
        return str;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 99;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.description;
        int i5 = i3 + 83;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean IAuthTabCallback() {
        boolean z;
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 81;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            z = this.hasTossCert;
            int i4 = 45 / 0;
        } else {
            z = this.hasTossCert;
        }
        int i5 = i2 + 99;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final RetainingDataSourceSupplier IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 11;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        RetainingDataSourceSupplier retainingDataSourceSupplier = this.tossCert;
        int i5 = i3 + 11;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return retainingDataSourceSupplier;
    }

    public final RestrictiveDataManager onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 105;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        RestrictiveDataManager restrictiveDataManager = this.finCert;
        int i5 = i3 + 101;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return restrictiveDataManager;
        }
        throw null;
    }
}
