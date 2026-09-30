package o;

import im.toss.tosssecurities.singlepage.earning_call.EarningCallComposeView$;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class q4ExternalSyntheticLambda3 {
    private static int access100 = 0;
    private static int extraCallback = 1;
    private final String IAuthTabCallback;
    private final String IAuthTabCallbackDefault;
    private final List<q4ExternalSyntheticLambda6> IAuthTabCallbackStub;
    private final String IAuthTabCallbackStubProxy;
    private final String IAuthTabCallback_Parcel;
    private final String access000;
    private final String asBinder;
    private final boolean asInterface;
    private final String getInterfaceDescriptor;
    private final String onExtraCallback;
    private final Map<String, Object> onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final String onTransact;
    private final String onWarmupCompleted;

    public static /* synthetic */ Object onExtraCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = (~(i6 | i5)) | i;
        int i8 = i5 | i6 | i;
        int i9 = ~i6;
        int i10 = i6 + i + i2 + ((-421447895) * i3) + ((-859425246) * i4);
        int i11 = i10 * i10;
        int i12 = (i6 * (-629045104)) + 1817116672 + ((-629045104) * i) + (i7 * (-1407420559)) + ((-1407420559) * i8) + (1407420559 * i9) + ((-2036465664) * i2) + ((-2125594624) * i3) + (888930304 * i4) + (441384960 * i11);
        int i13 = (i6 * 1303038832) + 2077918271 + (i * 1303038832) + (i7 * (-49)) + (i8 * (-49)) + (i9 * 49) + (i2 * 1303038783) + (i3 * 1583617559) + (i4 * (-1102559138)) + (i11 * 510722048);
        if (i12 + (i13 * i13 * 607191040) != 1) {
            return onWarmupCompleted(objArr);
        }
        q4ExternalSyntheticLambda3 q4externalsyntheticlambda3 = (q4ExternalSyntheticLambda3) objArr[0];
        int i14 = 2 % 2;
        int i15 = extraCallback;
        int i16 = i15 + 19;
        access100 = i16 % 128;
        int i17 = i16 % 2;
        List<q4ExternalSyntheticLambda6> list = q4externalsyntheticlambda3.IAuthTabCallbackStub;
        int i18 = i15 + 69;
        access100 = i18 % 128;
        int i19 = i18 % 2;
        return list;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 1;
        access100 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q4ExternalSyntheticLambda3)) {
            int i4 = i2 + 73;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        q4ExternalSyntheticLambda3 q4externalsyntheticlambda3 = (q4ExternalSyntheticLambda3) obj;
        if (!Intrinsics.areEqual(this.onExtraCallback, q4externalsyntheticlambda3.onExtraCallback)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.access000, q4externalsyntheticlambda3.access000)) {
            int i6 = extraCallback + 13;
            access100 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallback_Parcel, q4externalsyntheticlambda3.IAuthTabCallback_Parcel)) {
            int i8 = extraCallback + 117;
            access100 = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.getInterfaceDescriptor, q4externalsyntheticlambda3.getInterfaceDescriptor)) {
            int i10 = extraCallback + 7;
            access100 = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallback, q4externalsyntheticlambda3.IAuthTabCallback) || !Intrinsics.areEqual(this.IAuthTabCallbackDefault, q4externalsyntheticlambda3.IAuthTabCallbackDefault) || (!Intrinsics.areEqual(this.asBinder, q4externalsyntheticlambda3.asBinder))) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onNavigationEvent, q4externalsyntheticlambda3.onNavigationEvent)) {
            int i12 = extraCallback + 5;
            access100 = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onTransact, q4externalsyntheticlambda3.onTransact)) {
            int i14 = access100 + 117;
            extraCallback = i14 % 128;
            int i15 = i14 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onWarmupCompleted, q4externalsyntheticlambda3.onWarmupCompleted)) {
            return false;
        }
        if (Intrinsics.areEqual(this.IAuthTabCallbackStub, q4externalsyntheticlambda3.IAuthTabCallbackStub)) {
            return Intrinsics.areEqual(this.onExtraCallbackWithResult, q4externalsyntheticlambda3.onExtraCallbackWithResult) && Intrinsics.areEqual(this.IAuthTabCallbackStubProxy, q4externalsyntheticlambda3.IAuthTabCallbackStubProxy) && this.asInterface == q4externalsyntheticlambda3.asInterface;
        }
        int i16 = access100 + 1;
        extraCallback = i16 % 128;
        int i17 = i16 % 2;
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int iHashCode = this.onExtraCallback.hashCode();
        int iHashCode2 = this.access000.hashCode();
        int iHashCode3 = this.IAuthTabCallback_Parcel.hashCode();
        int iHashCode4 = this.getInterfaceDescriptor.hashCode();
        int iHashCode5 = this.IAuthTabCallback.hashCode();
        int iHashCode6 = this.IAuthTabCallbackDefault.hashCode();
        int iHashCode7 = this.asBinder.hashCode();
        int iHashCode8 = this.onNavigationEvent.hashCode();
        int iHashCode9 = this.onTransact.hashCode();
        int iHashCode10 = this.onWarmupCompleted.hashCode();
        int iHashCode11 = this.IAuthTabCallbackStub.hashCode();
        int iHashCode12 = this.onExtraCallbackWithResult.hashCode();
        String str = this.IAuthTabCallbackStubProxy;
        if (str == null) {
            int i3 = access100 + 7;
            extraCallback = i3 % 128;
            int i4 = i3 % 2;
            i = 0;
        } else {
            int iHashCode13 = str.hashCode();
            int i5 = access100 + 117;
            extraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 4 / 2;
            }
            i = iHashCode13;
        }
        return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + i) * 31) + Boolean.hashCode(this.asInterface);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "MonitoringEvent(metricName=" + this.onExtraCallback + ", viewName=" + this.access000 + ", sourceType=" + this.IAuthTabCallback_Parcel + ", samplePolicyId=" + this.getInterfaceDescriptor + ", env=" + this.IAuthTabCallback + ", releaseTrack=" + this.IAuthTabCallbackDefault + ", runningType=" + this.asBinder + ", appVersionBucket=" + this.onNavigationEvent + ", metricOwner=" + this.onTransact + ", journey=" + this.onWarmupCompleted + ", metrics=" + this.IAuthTabCallbackStub + ", dimensions=" + this.onExtraCallbackWithResult + ", sloId=" + this.IAuthTabCallbackStubProxy + ", requiresSlo=" + this.asInterface + ")";
        int i2 = access100 + 117;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 96 / 0;
        }
        return str;
    }

    public q4ExternalSyntheticLambda3(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull List<q4ExternalSyntheticLambda6> list, @NotNull Map<String, ? extends Object> map, @Nullable String str11, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.onExtraCallback = str;
        this.access000 = str2;
        this.IAuthTabCallback_Parcel = str3;
        this.getInterfaceDescriptor = str4;
        this.IAuthTabCallback = str5;
        this.IAuthTabCallbackDefault = str6;
        this.asBinder = str7;
        this.onNavigationEvent = str8;
        this.onTransact = str9;
        this.onWarmupCompleted = str10;
        this.IAuthTabCallbackStub = list;
        this.onExtraCallbackWithResult = map;
        this.IAuthTabCallbackStubProxy = str11;
        this.asInterface = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ q4ExternalSyntheticLambda3(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List list, Map map, String str11, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str12;
        Map mapOnNavigationEvent;
        String str13;
        boolean z2;
        if ((i & 4) != 0) {
            int i2 = access100 + 13;
            extraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 4 / 4;
            } else {
                int i4 = 2 % 2;
            }
            str12 = "native";
        } else {
            str12 = str3;
        }
        if ((i & 2048) != 0) {
            int i5 = 2 % 2;
            mapOnNavigationEvent = access8100.onNavigationEvent();
        } else {
            mapOnNavigationEvent = map;
        }
        if ((i & 4096) != 0) {
            int i6 = 2 % 2;
            str13 = null;
        } else {
            str13 = str11;
        }
        if ((i & 8192) != 0) {
            int i7 = extraCallback + 105;
            int i8 = i7 % 128;
            access100 = i8;
            int i9 = i7 % 2;
            int i10 = i8 + 73;
            extraCallback = i10 % 128;
            int i11 = i10 % 2;
            int i12 = 2 % 2;
            z2 = true;
        } else {
            z2 = z;
        }
        this(str, str2, str12, str4, str5, str6, str7, str8, str9, str10, list, mapOnNavigationEvent, str13, z2);
    }

    public final String onNavigationEvent() {
        String str;
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 71;
        access100 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.onExtraCallback;
            int i4 = 10 / 0;
        } else {
            str = this.onExtraCallback;
        }
        int i5 = i2 + 91;
        access100 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String access100() {
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 39;
        access100 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.access000;
        int i4 = i2 + 111;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 65;
        access100 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.IAuthTabCallback_Parcel;
        int i4 = i2 + 9;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = access100 + 117;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = this.getInterfaceDescriptor;
        if (i3 == 0) {
            int i4 = 60 / 0;
        }
        return str;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = extraCallback + 113;
        int i3 = i2 % 128;
        access100 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.IAuthTabCallback;
        int i4 = i3 + 91;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 36 / 0;
        }
        return str;
    }

    public final String asBinder() {
        int i = 2 % 2;
        int i2 = access100 + 71;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.IAuthTabCallbackDefault;
        }
        throw null;
    }

    public final String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = extraCallback + 41;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        String str = this.asBinder;
        int i5 = i3 + 123;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = access100 + 11;
        int i3 = i2 % 128;
        extraCallback = i3;
        int i4 = i2 % 2;
        String str = this.onNavigationEvent;
        int i5 = i3 + 29;
        access100 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 53 / 0;
        }
        return str;
    }

    public final String onTransact() {
        int i = 2 % 2;
        int i2 = extraCallback + 101;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        String str = this.onTransact;
        int i5 = i3 + 87;
        extraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        q4ExternalSyntheticLambda3 q4externalsyntheticlambda3 = (q4ExternalSyntheticLambda3) objArr[0];
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 111;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = q4externalsyntheticlambda3.onWarmupCompleted;
        int i5 = i2 + 99;
        extraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 5 / 0;
        }
        return str;
    }

    public final Map<String, Object> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = extraCallback + 115;
        int i3 = i2 % 128;
        access100 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Map<String, Object> map = this.onExtraCallbackWithResult;
        int i4 = i3 + 97;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return map;
    }

    public final String access000() {
        int i = 2 % 2;
        int i2 = access100 + 77;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = this.IAuthTabCallbackStubProxy;
        if (i3 == 0) {
            int i4 = 91 / 0;
        }
        return str;
    }

    public final boolean IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = extraCallback + 15;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.asInterface;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onExtraCallback() {
        int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        return (String) onExtraCallback(1170439454, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), new Object[]{this}, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), iOnNavigationEvent, -1170439454);
    }

    public final List<q4ExternalSyntheticLambda6> asInterface() {
        int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        return (List) onExtraCallback(-260581139, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), new Object[]{this}, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), iOnNavigationEvent, 260581140);
    }
}
