package im.toss.features.leave.domain.response;

import im.toss.features.leave.domain.entity.LeaveTodoTaskStatus;
import im.toss.features.leave.domain.response.LeaveTodoItemResponse$;
import im.toss.features.verify.oneclicklogin.impl.view.presentation.LoginTokenConsentViewModel_HiltModules;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.okycx;
import o.py;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class LeaveTodoItemResponse {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final String description;
    private final String iconUrl;
    private final String scheme;
    private final LeaveTodoTaskStatus status;
    private final String title;
    private final String type;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new LeaveTodoItemResponse$.ExternalSyntheticLambda0()), null};

    public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 115;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[0];
        int iOnNavigationEvent = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        KSerializer kSerializer = (KSerializer) onExtraCallbackWithResult(LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -250271172, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), iOnNavigationEvent, objArr, 250271172, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent());
        int i4 = onExtraCallback + 7;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializer;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 119;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof LeaveTodoItemResponse)) {
            return false;
        }
        LeaveTodoItemResponse leaveTodoItemResponse = (LeaveTodoItemResponse) obj;
        if (!Intrinsics.areEqual(this.type, leaveTodoItemResponse.type)) {
            int i4 = onExtraCallbackWithResult + 121;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.title, leaveTodoItemResponse.title)) {
            int i6 = onExtraCallback + 25;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.description, leaveTodoItemResponse.description)) {
            int i8 = onExtraCallback + 63;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.iconUrl, leaveTodoItemResponse.iconUrl)) {
            return false;
        }
        if (this.status == leaveTodoItemResponse.status) {
            return Intrinsics.areEqual(this.scheme, leaveTodoItemResponse.scheme);
        }
        int i10 = onExtraCallbackWithResult + 93;
        onExtraCallback = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 97;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = this.type.hashCode();
        int iHashCode3 = this.title.hashCode();
        String str = this.description;
        if (str == null) {
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i4 = onExtraCallbackWithResult + 47;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        int iHashCode4 = this.iconUrl.hashCode();
        int iHashCode5 = this.status.hashCode();
        String str2 = this.scheme;
        return (((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LeaveTodoItemResponse(type=" + this.type + ", title=" + this.title + ", description=" + this.description + ", iconUrl=" + this.iconUrl + ", status=" + this.status + ", scheme=" + this.scheme + ")";
        int i2 = onExtraCallbackWithResult + 101;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = onNavigationEvent + 35;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ LeaveTodoItemResponse(int i, String str, String str2, String str3, String str4, LeaveTodoTaskStatus leaveTodoTaskStatus, String str5, okycx okycxVar) {
        if (27 != (i & 27)) {
            htf31.onExtraCallbackWithResult(i, 27, LeaveTodoItemResponse$.serializer.INSTANCE.getDescriptor());
        }
        this.type = str;
        this.title = str2;
        if ((i & 4) == 0) {
            this.description = null;
            int i2 = 2 % 2;
        } else {
            this.description = str3;
        }
        this.iconUrl = str4;
        this.status = leaveTodoTaskStatus;
        if ((i & 32) != 0) {
            this.scheme = str5;
            return;
        }
        int i3 = onExtraCallback + 19;
        int i4 = i3 % 128;
        onExtraCallbackWithResult = i4;
        int i5 = i3 % 2;
        this.scheme = null;
        int i6 = i4 + 111;
        onExtraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 87 / 0;
        }
    }

    public static final /* synthetic */ Lazy[] IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 91;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i4 = i3 + 123;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return lazyArr;
    }

    @JvmStatic
    public static final /* synthetic */ void onWarmupCompleted(LeaveTodoItemResponse leaveTodoItemResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 13;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        vylVar.onExtraCallback(serialDescriptor, 0, leaveTodoItemResponse.type);
        vylVar.onExtraCallback(serialDescriptor, 1, leaveTodoItemResponse.title);
        if (vylVar.onWarmupCompleted(serialDescriptor, 2) || leaveTodoItemResponse.description != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, leaveTodoItemResponse.description);
        }
        vylVar.onExtraCallback(serialDescriptor, 3, leaveTodoItemResponse.iconUrl);
        vylVar.onNavigationEvent(serialDescriptor, 4, (py) lazyArr[4].getValue(), leaveTodoItemResponse.status);
        if (vylVar.onWarmupCompleted(serialDescriptor, 5) || leaveTodoItemResponse.scheme != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 5, getWriggleLayout.onNavigationEvent, leaveTodoItemResponse.scheme);
            int i4 = onExtraCallback + 67;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public final String asInterface() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 41;
        onExtraCallbackWithResult = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.type;
        int i4 = i2 + 77;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String onTransact() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 55;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.title;
        int i5 = i3 + 23;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        LeaveTodoItemResponse leaveTodoItemResponse = (LeaveTodoItemResponse) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 71;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        String str = leaveTodoItemResponse.description;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 101;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 1;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.iconUrl;
        int i4 = i2 + 119;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final LeaveTodoTaskStatus IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        LeaveTodoTaskStatus leaveTodoTaskStatus = this.status;
        int i5 = i3 + 37;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return leaveTodoTaskStatus;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 117;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.scheme;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~i5;
        int i9 = ~i4;
        int i10 = (~(i7 | i8 | i9)) | (~(i5 | i4));
        int i11 = ~(i7 | i9);
        int i12 = i5 | i11;
        int i13 = (~(i4 | i2)) | i11 | (~(i8 | i2));
        int i14 = i2 + i5 + i + (296844165 * i3) + (1729652556 * i6);
        int i15 = i14 * i14;
        int i16 = ((i2 * 599922083) - 580124672) + (599922083 * i5) + (2088888926 * i10) + ((-117189444) * i12) + ((-2088888926) * i13) + ((-1606156288) * i) + ((-279707648) * i3) + ((-265289728) * i6) + (2117271552 * i15);
        int i17 = (i2 * (-1181628991)) + 1322814002 + (i5 * (-1181628991)) + (i10 * (-118)) + (i12 * (-236)) + (i13 * 118) + (i * (-1181629109)) + (i3 * (-698251017)) + (i6 * 1773125444) + (i15 * 938541056);
        if (i16 + (i17 * i17 * (-109772800)) == 1) {
            return onExtraCallback(objArr);
        }
        int i18 = 2 % 2;
        int i19 = onExtraCallback + 9;
        onExtraCallbackWithResult = i19 % 128;
        int i20 = i19 % 2;
        KSerializer kSerializerSerializer = LeaveTodoTaskStatus.Companion.serializer();
        int i21 = onExtraCallbackWithResult + 85;
        onExtraCallback = i21 % 128;
        int i22 = i21 % 2;
        return kSerializerSerializer;
    }

    private static final /* synthetic */ KSerializer asBinder() {
        int iOnNavigationEvent = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        return (KSerializer) onExtraCallbackWithResult(LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -250271172, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), iOnNavigationEvent, new Object[0], 250271172, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent());
    }

    public final String onNavigationEvent() {
        int iOnNavigationEvent = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        return (String) onExtraCallbackWithResult(LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), 1838695245, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), iOnNavigationEvent, new Object[]{this}, -1838695244, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent());
    }
}
