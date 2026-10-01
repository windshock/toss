package im.toss.ads_sdk.remote.api;

import com.google.gson.annotations.SerializedName;
import im.toss.ads_sdk.remote.api.ApiServerError$;
import java.util.HashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.getMutilBackgroundDrawable;
import o.getWriggleLayout;
import o.liq;
import o.okycx;
import o.py;
import o.setCurrentItem;
import o.vyl;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ApiServerError {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    @SerializedName("data")
    private Map<String, ? extends Object> data;

    @SerializedName("errorCode")
    private String errorCode;

    @SerializedName("errorType")
    private int errorType;

    @SerializedName("reason")
    private String reason;

    @SerializedName("title")
    private String title;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.ads_sdk.remote.api.ApiServerError$$ExternalSyntheticLambda0
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 109;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnNavigationEvent = ApiServerError.onNavigationEvent();
            int i4 = onNavigationEvent + 57;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return kSerializerOnNavigationEvent;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    })};

    private static final /* synthetic */ KSerializer asBinder() {
        int i = 2 % 2;
        getMutilBackgroundDrawable getmutilbackgrounddrawable = new getMutilBackgroundDrawable(getWriggleLayout.onNavigationEvent, setCurrentItem.onExtraCallback);
        int i2 = onNavigationEvent + 71;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return getmutilbackgrounddrawable;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 23;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerAsBinder = asBinder();
        if (i3 != 0) {
            int i4 = 81 / 0;
        }
        return kSerializerAsBinder;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ApiServerError> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 39;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                ApiServerError$.serializer serializerVar = ApiServerError$.serializer.INSTANCE;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            ApiServerError$.serializer serializerVar2 = ApiServerError$.serializer.INSTANCE;
            int i3 = onExtraCallbackWithResult + 21;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 40 / 0;
            }
            return serializerVar2;
        }
    }

    static {
        int i = IAuthTabCallback + 23;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public ApiServerError() {
        this.errorCode = "";
        this.reason = "";
        this.data = new HashMap();
    }

    public /* synthetic */ ApiServerError(int i, int i2, String str, String str2, String str3, Map map, okycx okycxVar) {
        if ((i & 1) == 0) {
            int i3 = onNavigationEvent + 113;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 2 % 2;
            }
            i2 = 0;
        }
        this.errorType = i2;
        if ((i & 2) == 0) {
            this.errorCode = "";
        } else {
            this.errorCode = str;
            int i5 = 2 % 2;
        }
        if ((i & 4) == 0) {
            this.reason = "";
            int i6 = onExtraCallbackWithResult + 5;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 2 % 2;
            }
        } else {
            this.reason = str2;
        }
        if ((i & 8) == 0) {
            int i8 = onNavigationEvent + 83;
            int i9 = i8 % 128;
            onExtraCallbackWithResult = i9;
            int i10 = i8 % 2;
            Object obj = null;
            this.title = null;
            if (i10 == 0) {
                obj.hashCode();
                throw null;
            }
            int i11 = i9 + 53;
            onNavigationEvent = i11 % 128;
            int i12 = i11 % 2;
            int i13 = 2 % 2;
        } else {
            this.title = str3;
        }
        if ((i & 16) == 0) {
            this.data = new HashMap();
        } else {
            this.data = map;
        }
    }

    public static final /* synthetic */ Lazy[] IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 13;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return $childSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onExtraCallback(ApiServerError apiServerError, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0) || apiServerError.errorType != 0) {
            vylVar.onExtraCallback(serialDescriptor, 0, apiServerError.errorType);
            int i2 = onExtraCallbackWithResult + 25;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 1) || !Intrinsics.areEqual(apiServerError.errorCode, "")) {
            vylVar.onExtraCallback(serialDescriptor, 1, apiServerError.errorCode);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
            int i4 = onNavigationEvent + 35;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            if (!Intrinsics.areEqual(apiServerError.reason, "")) {
                vylVar.onExtraCallback(serialDescriptor, 2, apiServerError.reason);
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 3) || apiServerError.title != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, apiServerError.title);
            int i6 = onNavigationEvent + 67;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 4) || !Intrinsics.areEqual(apiServerError.data, new HashMap())) {
            vylVar.onNavigationEvent(serialDescriptor, 4, (py) lazyArr[4].getValue(), apiServerError.data);
            int i8 = onNavigationEvent + 103;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
        }
    }

    public final int onExtraCallbackWithResult() {
        int i;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 17;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            i = this.errorType;
            int i5 = 22 / 0;
        } else {
            i = this.errorType;
        }
        int i6 = i3 + 27;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return i;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 125;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.errorCode;
        int i5 = i3 + 93;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String IAuthTabCallbackDefault() {
        String str;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            str = this.reason;
            int i4 = 97 / 0;
        } else {
            str = this.reason;
        }
        int i5 = i3 + 11;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 81 / 0;
        }
        return str;
    }

    public final String asInterface() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 125;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String str = this.title;
        if (i3 == 0) {
            int i4 = 54 / 0;
        }
        return str;
    }

    public final Map<String, Object> onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 71;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return this.data;
        }
        throw null;
    }
}
