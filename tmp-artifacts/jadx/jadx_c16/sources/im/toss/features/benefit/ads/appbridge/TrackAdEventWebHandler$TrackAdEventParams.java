package im.toss.features.benefit.ads.appbridge;

import im.toss.features.benefit.ads.appbridge.TrackAdEventWebHandler$TrackAdEventParams$;
import im.toss.features.benefit.ads.appbridge.TrackAdEventWebHandler$TrackAdEventParams$Request$;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonObject;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkCanOpenLandingPage;
import o.encryptType4;
import o.getWriggleLayout;
import o.liq;
import o.okycx;
import o.py;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
final class TrackAdEventWebHandler$TrackAdEventParams {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final String requestId;
    private final List<Request> requests;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new TrackAdEventWebHandler$TrackAdEventParams$.ExternalSyntheticLambda0())};

    /* JADX WARN: Multi-variable type inference failed */
    public TrackAdEventWebHandler$TrackAdEventParams() {
        this((String) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    private static final /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(TrackAdEventWebHandler$TrackAdEventParams$Request$.serializer.INSTANCE);
        int i2 = onExtraCallback + 99;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return checkcanopenlandingpage;
        }
        throw null;
    }

    public static /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 101;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i4 = onExtraCallback + 39;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnExtraCallbackWithResult;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrackAdEventWebHandler$TrackAdEventParams)) {
            return false;
        }
        TrackAdEventWebHandler$TrackAdEventParams trackAdEventWebHandler$TrackAdEventParams = (TrackAdEventWebHandler$TrackAdEventParams) obj;
        if (!Intrinsics.areEqual(this.requestId, trackAdEventWebHandler$TrackAdEventParams.requestId)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.requests, trackAdEventWebHandler$TrackAdEventParams.requests)) {
            int i2 = onNavigationEvent + 23;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = onNavigationEvent + 55;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        String str = this.requestId;
        if (str == null) {
            int i2 = onExtraCallback + 9;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i4 = onNavigationEvent + 125;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        List<Request> list = this.requests;
        return (iHashCode * 31) + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TrackAdEventParams(requestId=" + this.requestId + ", requests=" + this.requests + ")";
        int i2 = onExtraCallback + 73;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TrackAdEventWebHandler$TrackAdEventParams> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 35;
            onExtraCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                TrackAdEventWebHandler$TrackAdEventParams$.serializer serializerVar = TrackAdEventWebHandler$TrackAdEventParams$.serializer.INSTANCE;
                throw null;
            }
            TrackAdEventWebHandler$TrackAdEventParams$.serializer serializerVar2 = TrackAdEventWebHandler$TrackAdEventParams$.serializer.INSTANCE;
            int i3 = onExtraCallback + 119;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return serializerVar2;
            }
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = IAuthTabCallback + 51;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ TrackAdEventWebHandler$TrackAdEventParams(int i, String str, List list, okycx okycxVar) {
        Object obj = null;
        if ((i & 1) == 0) {
            this.requestId = null;
            int i2 = onExtraCallback + 65;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 5 / 5;
            }
            if ((i & 2) == 0) {
                this.requests = list;
                return;
            }
            int i4 = onNavigationEvent + 89;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            this.requests = null;
            if (i5 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        this.requestId = str;
        int i6 = 2 % 2;
        if ((i & 2) == 0) {
        }
    }

    public TrackAdEventWebHandler$TrackAdEventParams(@Nullable String str, @Nullable List<Request> list) {
        this.requestId = str;
        this.requests = list;
    }

    public static final /* synthetic */ Lazy[] IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 3;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i3 + 3;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return lazyArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onExtraCallbackWithResult(TrackAdEventWebHandler$TrackAdEventParams trackAdEventWebHandler$TrackAdEventParams, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            int i2 = onExtraCallback + 1;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                String str = trackAdEventWebHandler$TrackAdEventParams.requestId;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (trackAdEventWebHandler$TrackAdEventParams.requestId != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, trackAdEventWebHandler$TrackAdEventParams.requestId);
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            int i3 = onExtraCallback + 99;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            if (trackAdEventWebHandler$TrackAdEventParams.requests == null) {
                return;
            }
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 1, (py) lazyArr[1].getValue(), trackAdEventWebHandler$TrackAdEventParams.requests);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TrackAdEventWebHandler$TrackAdEventParams(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallback + 95;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 55 / 0;
            }
            int i4 = 2 % 2;
            str = null;
        }
        if ((i & 2) != 0) {
            int i5 = onExtraCallback + 105;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
            list = null;
        }
        this(str, list);
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 35;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.requestId;
        int i5 = i3 + 73;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<Request> onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 75;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return this.requests;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @liq
    public static final class Request {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        private final JsonObject body;
        private final String method;
        private final String url;

        static {
            Object obj = null;
            int i = onNavigationEvent + 29;
            onWarmupCompleted = i % 128;
            if (i % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        public Request() {
            this((String) null, (String) null, (JsonObject) null, 7, (DefaultConstructorMarker) null);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Request)) {
                return false;
            }
            Request request = (Request) obj;
            if (!Intrinsics.areEqual(this.url, request.url)) {
                int i2 = onExtraCallback + 33;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.method, request.method)) {
                int i4 = onExtraCallback + 89;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.body, request.body)) {
                return true;
            }
            int i6 = IAuthTabCallback + 47;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }

        public int hashCode() {
            String str;
            int iHashCode;
            int i = 2 % 2;
            int i2 = onExtraCallback + 33;
            IAuthTabCallback = i2 % 128;
            int iHashCode2 = (i2 % 2 != 0 ? (str = this.url) != null : (str = this.url) != null) ? str.hashCode() : 0;
            String str2 = this.method;
            if (str2 == null) {
                int i3 = IAuthTabCallback + 123;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str2.hashCode();
                int i5 = onExtraCallback + 77;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
            }
            JsonObject jsonObject = this.body;
            return (((iHashCode2 * 31) + iHashCode) * 31) + (jsonObject != null ? jsonObject.hashCode() : 0);
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Request(url=" + this.url + ", method=" + this.method + ", body=" + this.body + ")";
            int i2 = onExtraCallback + 33;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 50 / 0;
            }
            return str;
        }

        public /* synthetic */ Request(int i, String str, String str2, JsonObject jsonObject, okycx okycxVar) {
            if ((i & 1) == 0) {
                this.url = null;
                int i2 = IAuthTabCallback + 103;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            } else {
                this.url = str;
            }
            if ((i & 2) == 0) {
                int i5 = IAuthTabCallback + 119;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                this.method = null;
            } else {
                this.method = str2;
                int i7 = onExtraCallback + 49;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
            }
            int i9 = 2 % 2;
            if ((i & 4) == 0) {
                this.body = null;
            } else {
                this.body = jsonObject;
            }
        }

        public Request(@Nullable String str, @Nullable String str2, @Nullable JsonObject jsonObject) {
            this.url = str;
            this.method = str2;
            this.body = jsonObject;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final /* synthetic */ void onExtraCallbackWithResult(Request request, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 115;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0 ? vylVar.onWarmupCompleted(serialDescriptor, 0) : vylVar.onWarmupCompleted(serialDescriptor, 0)) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, request.url);
            } else if (request.url != null) {
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
                int i3 = IAuthTabCallback + 65;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                if (request.method != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, request.method);
                }
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 2) || request.body != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 2, encryptType4.IAuthTabCallback, request.body);
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Request(String str, String str2, JsonObject jsonObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = IAuthTabCallback + 19;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                str = null;
            }
            if ((i & 2) != 0) {
                int i4 = IAuthTabCallback;
                int i5 = i4 + 59;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                int i7 = i4 + 113;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                int i9 = 2 % 2;
                str2 = null;
            }
            if ((i & 4) != 0) {
                int i10 = onExtraCallback + 117;
                IAuthTabCallback = i10 % 128;
                if (i10 % 2 == 0) {
                    throw null;
                }
                int i11 = 2 % 2;
                jsonObject = null;
            }
            this(str, str2, jsonObject);
        }

        public final String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 41;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            String str = this.url;
            int i5 = i2 + 95;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 51;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            String str = this.method;
            int i4 = i3 + 13;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        public final JsonObject onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 35;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            JsonObject jsonObject = this.body;
            int i4 = i3 + 63;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 51 / 0;
            }
            return jsonObject;
        }
    }
}
