package o;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class setExceptionHandlerEnabled {
    private static int ICustomTabsCallback = 1;
    private static int extraCallbackWithResult;
    private final String IAuthTabCallback;
    private final boolean IAuthTabCallbackDefault;
    private final String IAuthTabCallbackStub;
    private final Set<String> IAuthTabCallbackStubProxy;
    private final String IAuthTabCallback_Parcel;
    private final long access000;
    private final String access100;
    private final String asBinder;
    private final String asInterface;
    private final Set<String> extraCallback;
    private final int getInterfaceDescriptor;
    private final String onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final setPluginVersion onNavigationEvent;
    private final String onTransact;
    private final boolean onWarmupCompleted;
    private final String readTypedObject;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setExceptionHandlerEnabled)) {
            return false;
        }
        setExceptionHandlerEnabled setexceptionhandlerenabled = (setExceptionHandlerEnabled) obj;
        if (this.access000 != setexceptionhandlerenabled.access000) {
            int i2 = extraCallbackWithResult + 33;
            ICustomTabsCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return false;
            }
            throw null;
        }
        if (!Intrinsics.areEqual(this.onTransact, setexceptionhandlerenabled.onTransact)) {
            int i3 = extraCallbackWithResult + 85;
            ICustomTabsCallback = i3 % 128;
            return i3 % 2 == 0;
        }
        if ((!Intrinsics.areEqual(this.readTypedObject, setexceptionhandlerenabled.readTypedObject)) || !Intrinsics.areEqual(this.IAuthTabCallback_Parcel, setexceptionhandlerenabled.IAuthTabCallback_Parcel) || !Intrinsics.areEqual(this.onExtraCallbackWithResult, setexceptionhandlerenabled.onExtraCallbackWithResult) || !Intrinsics.areEqual(this.IAuthTabCallbackStub, setexceptionhandlerenabled.IAuthTabCallbackStub)) {
            return false;
        }
        if (this.IAuthTabCallbackDefault != setexceptionhandlerenabled.IAuthTabCallbackDefault) {
            int i4 = ICustomTabsCallback + 89;
            extraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallbackStubProxy, setexceptionhandlerenabled.IAuthTabCallbackStubProxy)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.extraCallback, setexceptionhandlerenabled.extraCallback)) {
            int i6 = ICustomTabsCallback + 47;
            extraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (this.onWarmupCompleted != setexceptionhandlerenabled.onWarmupCompleted) {
            return false;
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallback, setexceptionhandlerenabled.IAuthTabCallback)) {
            int i8 = ICustomTabsCallback + 1;
            extraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.asInterface, setexceptionhandlerenabled.asInterface)) {
            int i10 = ICustomTabsCallback + 117;
            extraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (this.getInterfaceDescriptor != setexceptionhandlerenabled.getInterfaceDescriptor || this.onNavigationEvent != setexceptionhandlerenabled.onNavigationEvent) {
            return false;
        }
        if (!Intrinsics.areEqual(this.access100, setexceptionhandlerenabled.access100)) {
            int i12 = ICustomTabsCallback + 71;
            extraCallbackWithResult = i12 % 128;
            return i12 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.onExtraCallback, setexceptionhandlerenabled.onExtraCallback)) {
            return false;
        }
        if (Intrinsics.areEqual(this.asBinder, setexceptionhandlerenabled.asBinder)) {
            return true;
        }
        int i13 = ICustomTabsCallback + 93;
        extraCallbackWithResult = i13 % 128;
        int i14 = i13 % 2;
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = extraCallbackWithResult + 77;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = Long.hashCode(this.access000);
        int iHashCode2 = this.onTransact.hashCode();
        int iHashCode3 = this.readTypedObject.hashCode();
        int iHashCode4 = this.IAuthTabCallback_Parcel.hashCode();
        int iHashCode5 = this.onExtraCallbackWithResult.hashCode();
        int iHashCode6 = this.IAuthTabCallbackStub.hashCode();
        int iHashCode7 = Boolean.hashCode(this.IAuthTabCallbackDefault);
        int iHashCode8 = this.IAuthTabCallbackStubProxy.hashCode();
        int iHashCode9 = this.extraCallback.hashCode();
        int iHashCode10 = Boolean.hashCode(this.onWarmupCompleted);
        int iHashCode11 = this.IAuthTabCallback.hashCode();
        int iHashCode12 = this.asInterface.hashCode();
        int iHashCode13 = Integer.hashCode(this.getInterfaceDescriptor);
        int iHashCode14 = this.onNavigationEvent.hashCode();
        int iHashCode15 = this.access100.hashCode();
        int iHashCode16 = this.onExtraCallback.hashCode();
        String str = this.asBinder;
        if (str == null) {
            i = 0;
        } else {
            int iHashCode17 = str.hashCode();
            int i5 = ICustomTabsCallback + 89;
            extraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            i = iHashCode17;
        }
        int i7 = (((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + i;
        int i8 = ICustomTabsCallback + 91;
        extraCallbackWithResult = i8 % 128;
        int i9 = i8 % 2;
        return i7;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CheckoutResult(timestamp=" + this.access000 + ", gaNo=" + this.onTransact + ", userNo=" + this.readTypedObject + ", userName=" + this.IAuthTabCallback_Parcel + ", birthday=" + this.onExtraCallbackWithResult + ", gender=" + this.IAuthTabCallbackStub + ", minor=" + this.IAuthTabCallbackDefault + ", userGroups=" + this.IAuthTabCallbackStubProxy + ", userTypes=" + this.extraCallback + ", accountVerified=" + this.onWarmupCompleted + ", carrier=" + this.IAuthTabCallback + ", nationality=" + this.asInterface + ", rrn7th=" + this.getInterfaceDescriptor + ", currentPasswordFormat=" + this.onNavigationEvent + ", salt=" + this.access100 + ", callingCode=" + this.onExtraCallback + ", middleName=" + this.asBinder + ")";
        int i2 = extraCallbackWithResult + 63;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public setExceptionHandlerEnabled(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, boolean z, @NotNull Set<String> set, @NotNull Set<String> set2, boolean z2, @NotNull String str6, @NotNull String str7, int i, @NotNull setPluginVersion setpluginversion, @NotNull String str8, @NotNull String str9, @Nullable String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(set, "");
        Intrinsics.checkNotNullParameter(set2, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(setpluginversion, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        this.access000 = j;
        this.onTransact = str;
        this.readTypedObject = str2;
        this.IAuthTabCallback_Parcel = str3;
        this.onExtraCallbackWithResult = str4;
        this.IAuthTabCallbackStub = str5;
        this.IAuthTabCallbackDefault = z;
        this.IAuthTabCallbackStubProxy = set;
        this.extraCallback = set2;
        this.onWarmupCompleted = z2;
        this.IAuthTabCallback = str6;
        this.asInterface = str7;
        this.getInterfaceDescriptor = i;
        this.onNavigationEvent = setpluginversion;
        this.access100 = str8;
        this.onExtraCallback = str9;
        this.asBinder = str10;
    }
}
