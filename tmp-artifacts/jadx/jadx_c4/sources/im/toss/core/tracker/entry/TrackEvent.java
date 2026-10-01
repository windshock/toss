package im.toss.core.tracker.entry;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tmoney.LiveCheckConstants;
import im.toss.core.tracker.Referrer;
import im.toss.core.tracker.payload.AppEventPayloadV1;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.ALCFaceSDK;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.DetectFaceInSingleImage;
import o.GetFeatureExtension;
import o.GetMotionInteractionState;
import o.InterfaceC0059deInitialize;
import o.TombstoneProtosMemoryMappingBuilder;
import o.access13800;
import o.access14300;
import o.checkCanOpenLandingPage;
import o.downloadZip;
import o.getMutilBackgroundDrawable;
import o.getWriggleLayout;
import o.liq;
import o.okycx;
import o.py;
import o.r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc;
import o.sp;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class TrackEvent extends downloadZip implements ALCFaceSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    public static final Companion Companion;
    private static char IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static char[] onWarmupCompleted;
    private final String company;
    private final String event;
    private final Map<String, Object> params;
    private List<String> trackers;

    public static final class onExtraCallbackWithResult extends ContinuationImpl {
        public static int IAuthTabCallback = 0;
        public static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 117;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallbackWithResult = TrackEvent.this.onExtraCallbackWithResult(false, this);
            int i4 = onNavigationEvent + 25;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 75 / 0;
            }
            return objOnExtraCallbackWithResult;
        }

        public static int onNavigationEvent() {
            int i = IAuthTabCallback;
            int i2 = i % 6613622;
            IAuthTabCallback = i + 1;
            if (i2 != 0) {
                return onExtraCallbackWithResult;
            }
            int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenHeightDp;
            onExtraCallbackWithResult = i3;
            return i3;
        }
    }

    public TrackEvent() {
        this((String) null, (Map) null, (List) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TrackEvent(@NotNull String str) {
        this(str, (Map) null, (List) null, (String) null, 14, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TrackEvent(@NotNull String str, @NotNull Map<String, Object> map) {
        this(str, map, (List) null, (String) null, 12, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TrackEvent(@NotNull String str, @NotNull Map<String, Object> map, @Nullable List<String> list) {
        this(str, map, list, (String) null, 8, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
    }

    public static /* synthetic */ KSerializer asInterface() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 81;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            extraCallback();
            throw null;
        }
        KSerializer kSerializerExtraCallback = extraCallback();
        int i3 = onExtraCallbackWithResult + 19;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerExtraCallback;
    }

    private static final /* synthetic */ KSerializer extraCallback() {
        int i = 2 % 2;
        getMutilBackgroundDrawable getmutilbackgrounddrawable = new getMutilBackgroundDrawable(getWriggleLayout.onNavigationEvent, sp.IAuthTabCallback(GetMotionInteractionState.onExtraCallback));
        int i2 = onExtraCallback + 99;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return getmutilbackgrounddrawable;
    }

    public static /* synthetic */ KSerializer onTransact() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 29;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            readTypedObject();
            throw null;
        }
        KSerializer typedObject = readTypedObject();
        int i3 = onExtraCallbackWithResult + 81;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return typedObject;
    }

    private static final /* synthetic */ KSerializer readTypedObject() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(getWriggleLayout.onNavigationEvent);
        int i2 = onExtraCallbackWithResult + 89;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback;
            int i3 = i2 + 37;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 89;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof TrackEvent)) {
            return false;
        }
        TrackEvent trackEvent = (TrackEvent) obj;
        if (!Intrinsics.areEqual(this.event, trackEvent.event)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.params, trackEvent.params)) {
            int i7 = onExtraCallbackWithResult + 79;
            onExtraCallback = i7 % 128;
            return i7 % 2 != 0;
        }
        if (Intrinsics.areEqual(this.trackers, trackEvent.trackers)) {
            return Intrinsics.areEqual(this.company, trackEvent.company);
        }
        int i8 = onExtraCallbackWithResult + 5;
        onExtraCallback = i8 % 128;
        if (i8 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.event.hashCode();
        int iHashCode3 = this.params.hashCode();
        List<String> list = this.trackers;
        if (list == null) {
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 25;
            onExtraCallback = i3 % 128;
            iHashCode = i3 % 2 != 0 ? 1 : 0;
            int i4 = i2 + 11;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        } else {
            iHashCode = list.hashCode();
        }
        return (((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode) * 31) + this.company.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TrackEvent(event=" + this.event + ", params=" + this.params + ", trackers=" + this.trackers + ", company=" + this.company + ")";
        int i2 = onExtraCallbackWithResult + 81;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TrackEvent> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 87;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            TrackEvent$$serializer trackEvent$$serializer = TrackEvent$$serializer.INSTANCE;
            int i4 = onWarmupCompleted + 65;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 63 / 0;
            }
            return trackEvent$$serializer;
        }
    }

    static {
        ICustomTabsCallback();
        Companion = new Companion(null);
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
        $childSerializers = new Lazy[]{null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.core.tracker.entry.TrackEvent$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 113;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerAsInterface = TrackEvent.asInterface();
                int i4 = onNavigationEvent + 1;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 74 / 0;
                }
                return kSerializerAsInterface;
            }
        }), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.core.tracker.entry.TrackEvent$$ExternalSyntheticLambda1
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 29;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    TrackEvent.onTransact();
                    throw null;
                }
                KSerializer kSerializerOnTransact = TrackEvent.onTransact();
                int i3 = onExtraCallback + 85;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                return kSerializerOnTransact;
            }
        }), null};
        int i = onNavigationEvent + 63;
        IAuthTabCallbackDefault = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ TrackEvent(int i, String str, Map map, List list, String str2, okycx okycxVar) {
        if ((i & 1) == 0) {
            int i2 = 2 % 2;
            str = "";
        }
        this.event = str;
        if ((i & 2) == 0) {
            this.params = new LinkedHashMap();
        } else {
            this.params = map;
            int i3 = onExtraCallback + 97;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
        }
        if ((i & 4) == 0) {
            this.trackers = CollectionsKt.listOf(r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc.TOSS.getId());
            int i6 = 2 % 2;
        } else {
            this.trackers = list;
        }
        if ((i & 8) != 0) {
            this.company = str2;
            return;
        }
        int i7 = onExtraCallbackWithResult + 89;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        this.company = GetFeatureExtension.onWarmupCompleted.asBinder();
    }

    public TrackEvent(@NotNull String str, @NotNull Map<String, Object> map, @Nullable List<String> list, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.event = str;
        this.params = map;
        this.trackers = list;
        this.company = str2;
    }

    public static final /* synthetic */ Lazy[] asBinder() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 89;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i2 + 13;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 29 / 0;
        }
        return lazyArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0091  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onExtraCallback(TrackEvent trackEvent, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0) || !Intrinsics.areEqual(trackEvent.event, "")) {
            vylVar.onExtraCallback(serialDescriptor, 0, trackEvent.event);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 1) || !Intrinsics.areEqual(trackEvent.onNavigationEvent(), new LinkedHashMap())) {
            vylVar.onNavigationEvent(serialDescriptor, 1, (py) lazyArr[1].getValue(), trackEvent.onNavigationEvent());
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 2) || !Intrinsics.areEqual(trackEvent.trackers, CollectionsKt.listOf(r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc.TOSS.getId()))) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 2, (py) lazyArr[2].getValue(), trackEvent.trackers);
        }
        Object obj = null;
        if (!(!vylVar.onWarmupCompleted(serialDescriptor, 3))) {
            vylVar.onExtraCallback(serialDescriptor, 3, trackEvent.company);
        } else {
            int i4 = onExtraCallback + 95;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                Intrinsics.areEqual(trackEvent.company, GetFeatureExtension.onWarmupCompleted.asBinder());
                throw null;
            }
            if (!Intrinsics.areEqual(trackEvent.company, GetFeatureExtension.onWarmupCompleted.asBinder())) {
            }
        }
        int i5 = onExtraCallbackWithResult + 89;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.ALCFaceSDK
    public /* bridge */ List<r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc> IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 7;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            super.IAuthTabCallbackStubProxy();
            throw null;
        }
        List<r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc> listIAuthTabCallbackStubProxy = super.IAuthTabCallbackStubProxy();
        int i3 = onExtraCallback + 15;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return listIAuthTabCallbackStubProxy;
    }

    @Override // o.ALCFaceSDK
    public /* bridge */ boolean access100() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 55;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            super.access100();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zAccess100 = super.access100();
        int i3 = onExtraCallbackWithResult + 125;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 14 / 0;
        }
        return zAccess100;
    }

    @Override // o.ALCFaceSDK
    public /* bridge */ boolean extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 101;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zExtraCallbackWithResult = super.extraCallbackWithResult();
        int i4 = onExtraCallbackWithResult + 57;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return zExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.ALCFaceSDK
    public /* bridge */ boolean onWarmupCompleted(@NotNull r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc r8lambdaqfjxzpq89uignp4inuj4r5tibc) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 101;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return super.onWarmupCompleted(r8lambdaqfjxzpq89uignp4inuj4r5tibc);
        }
        super.onWarmupCompleted(r8lambdaqfjxzpq89uignp4inuj4r5tibc);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TrackEvent(String str, Map map, List list, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallback + 31;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 5 / 0;
            }
            int i4 = 2 % 2;
            str = "";
        }
        map = (i & 2) != 0 ? new LinkedHashMap() : map;
        list = (i & 4) != 0 ? CollectionsKt.listOf(r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc.TOSS.getId()) : list;
        if ((i & 8) != 0) {
            int i5 = onExtraCallback + 27;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            str2 = GetFeatureExtension.onWarmupCompleted.asBinder();
        }
        this(str, map, list, str2);
    }

    public final String getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 115;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.event;
        int i5 = i3 + 43;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.downloadZip
    public Map<String, Object> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> map = this.params;
        if (i3 == 0) {
            int i4 = 14 / 0;
        }
        return map;
    }

    public final String IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 103;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.company;
        int i4 = i2 + 75;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 72 / 0;
        }
        return str;
    }

    @Override // o.ALCFaceSDK
    public List<String> writeTypedObject() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 65;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        List<String> list = this.trackers;
        int i5 = i2 + 83;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        throw null;
    }

    @Override // o.ALCFaceSDK
    public String access000() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 49;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = this.event;
        if (i3 != 0) {
            int i4 = 90 / 0;
        }
        return str;
    }

    @Override // o.downloadZip
    public void IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 75;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        downloadZip.onExtraCallback(this, "event", this.event, null, null, null, 28, null);
        int i4 = onExtraCallback + 115;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 0 / 0;
        }
    }

    public static final class IAuthTabCallback {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        private List<String> onExtraCallback;
        private Map<String, Object> onExtraCallbackWithResult;
        private String onNavigationEvent;

        public IAuthTabCallback() {
            this.onNavigationEvent = "";
            this.onExtraCallbackWithResult = new LinkedHashMap();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallback(@NotNull String str) {
            this();
            Intrinsics.checkNotNullParameter(str, "");
            this.onNavigationEvent = str;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallback(@NotNull String str, @NotNull String str2) {
            this(str + "_" + str2);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.onExtraCallbackWithResult.put("category", str);
        }

        public final IAuthTabCallback onNavigationEvent(@NotNull String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 41;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            this.onNavigationEvent = str;
            int i4 = IAuthTabCallback + 89;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return this;
        }

        public final IAuthTabCallback onNavigationEvent(@NotNull String str, @Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 111;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            if (obj != null) {
                this.onExtraCallbackWithResult.put(str, obj);
                int i4 = onWarmupCompleted + 61;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
            }
            return this;
        }

        public final IAuthTabCallback IAuthTabCallback(@Nullable Map<String, ? extends Object> map) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 49;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            if (map != null) {
                int i4 = i2 + 19;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                        int i5 = onWarmupCompleted + 45;
                        IAuthTabCallback = i5 % 128;
                        int i6 = i5 % 2;
                        onNavigationEvent(entry.getKey(), entry.getValue());
                    }
                } else {
                    map.entrySet().iterator();
                    throw null;
                }
            }
            int i7 = onWarmupCompleted + 75;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            return this;
        }

        public final IAuthTabCallback IAuthTabCallback(@NotNull r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc... r8lambdaqfjxzpq89uignp4inuj4r5tibcArr) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(r8lambdaqfjxzpq89uignp4inuj4r5tibcArr, "");
            ArrayList arrayList = new ArrayList(r8lambdaqfjxzpq89uignp4inuj4r5tibcArr.length);
            int i2 = IAuthTabCallback + 95;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            for (r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc r8lambdaqfjxzpq89uignp4inuj4r5tibc : r8lambdaqfjxzpq89uignp4inuj4r5tibcArr) {
                int i4 = onWarmupCompleted + 7;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                arrayList.add(r8lambdaqfjxzpq89uignp4inuj4r5tibc.getId());
            }
            this.onExtraCallback = arrayList;
            return this;
        }

        public final TrackEvent onWarmupCompleted() {
            int i = 2 % 2;
            TrackEvent trackEvent = new TrackEvent(this.onNavigationEvent, this.onExtraCallbackWithResult, this.onExtraCallback, (String) null, 8, (DefaultConstructorMarker) null);
            int i2 = IAuthTabCallback + 59;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return trackEvent;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    @Override // o.aq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onExtraCallbackWithResult(boolean z, @NotNull access13800<? super InterfaceC0059deInitialize> access13800Var) throws Throwable {
        onExtraCallbackWithResult onextracallbackwithresult;
        String string;
        String str;
        String strIntern;
        int i = 2 % 2;
        if (access13800Var instanceof onExtraCallbackWithResult) {
            onextracallbackwithresult = (onExtraCallbackWithResult) access13800Var;
            int i2 = onextracallbackwithresult.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = onExtraCallback + 93;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                onextracallbackwithresult.label = i2 - 2147483648;
            } else {
                onextracallbackwithresult = new onExtraCallbackWithResult(access13800Var);
            }
        }
        onExtraCallbackWithResult onextracallbackwithresult2 = onextracallbackwithresult;
        Object objOnExtraCallback = onextracallbackwithresult2.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = onextracallbackwithresult2.label;
        if (i5 == 0) {
            ResultKt.onNavigationEvent(objOnExtraCallback);
            DetectFaceInSingleImage.onNavigationEvent onnavigationevent = new DetectFaceInSingleImage.onNavigationEvent(null, this.event, "event", 1, null);
            Map<String, Object> mapOnNavigationEvent = onNavigationEvent();
            String str2 = this.company;
            onextracallbackwithresult2.Z$0 = z;
            onextracallbackwithresult2.label = 1;
            objOnExtraCallback = onExtraCallback(onnavigationevent, mapOnNavigationEvent, false, str2, z, onextracallbackwithresult2);
            if (objOnExtraCallback == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i6 = onExtraCallbackWithResult + 81;
            onExtraCallback = i6 % 128;
            if (i6 % 2 != 0) {
                ResultKt.onNavigationEvent(objOnExtraCallback);
                int i7 = 85 / 0;
            } else {
                ResultKt.onNavigationEvent(objOnExtraCallback);
            }
        }
        Map map = (Map) objOnExtraCallback;
        Object obj = map.get("category");
        if (obj == null || (string = obj.toString()) == null) {
            string = "common";
        }
        String str3 = string;
        Object objRemove = map.remove("log_version");
        String str4 = null;
        if (!(!(objRemove instanceof String))) {
            int i8 = onExtraCallbackWithResult + 87;
            onExtraCallback = i8 % 128;
            if (i8 % 2 != 0) {
                throw null;
            }
            str4 = (String) objRemove;
        }
        if (str4 == null) {
            int i9 = onExtraCallback + 7;
            onExtraCallbackWithResult = i9 % 128;
            if (i9 % 2 == 0) {
                Object[] objArr = new Object[1];
                a(new char[]{13833}, (byte) (49 - (KeyEvent.getMaxKeyCode() - 59)), (ViewConfiguration.getGlobalActionKeyTimeout() > 1L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 1L ? 0 : -1)), objArr);
                strIntern = ((String) objArr[0]).intern();
            } else {
                Object[] objArr2 = new Object[1];
                a(new char[]{13833}, (byte) ((KeyEvent.getMaxKeyCode() >> 16) + 94), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr2);
                strIntern = ((String) objArr2[0]).intern();
            }
            str = strIntern;
        } else {
            str = str4;
        }
        AppEventPayloadV1 appEventPayloadV1 = new AppEventPayloadV1(this.event, "event", str3, map, (String) null, onExtraCallbackWithResult(), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, this.company, (String) null, (String) null, (Long) null, str, (String) null, (Referrer) null, (String) null, (String) null, 2027472, (DefaultConstructorMarker) null);
        int i10 = onExtraCallbackWithResult + 43;
        onExtraCallback = i10 % 128;
        int i11 = i10 % 2;
        return appEventPayloadV1;
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3;
        Object obj;
        int i4 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = onWarmupCompleted;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i5 = 0; i5 < length; i5++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetBefore("", 0), 26 - Color.green(0), 23139 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(IAuthTabCallback)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0, 0), 26 - (ViewConfiguration.getWindowTouchSlop() >> 8), TextUtils.indexOf((CharSequence) "", '0', 0) + 23140, -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i3 = i - 1;
            cArr4[i3] = (char) (cArr[i3] - b);
            int i6 = $10 + 57;
            $11 = i6 % 128;
            i2 = 2;
            int i7 = i6 % 2;
        } else {
            i2 = 2;
            i3 = i;
        }
        if (i3 > 1) {
            int i8 = $10 + 97;
            $11 = i8 % 128;
            if (i8 % i2 == 0) {
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 1;
            } else {
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            }
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i3) {
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    obj = obj2;
                } else {
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 24823), 74 - ExpandableListView.getPackedPositionType(0L), 8088 - (ViewConfiguration.getFadingEdgeLength() >> 16), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", ""), 30 - (ViewConfiguration.getTapTimeout() >> 16), 19488 - (KeyEvent.getMaxKeyCode() >> 16), 2013852918, false, LiveCheckConstants.UNLOAD_SERVICE_CANCEL_R0_ACK, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                        int i9 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i9];
                    } else {
                        obj = null;
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            int i10 = $10 + 39;
                            $11 = i10 % 128;
                            int i11 = i10 % 2;
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                            int i12 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i13 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i12];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i13];
                        } else {
                            int i14 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i15 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i14];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i15];
                        }
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                int i16 = $10 + 105;
                $11 = i16 % 128;
                int i17 = i16 % 2;
                obj2 = obj;
            }
        }
        for (int i18 = 0; i18 < i; i18++) {
            cArr4[i18] = (char) (cArr4[i18] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    static void ICustomTabsCallback() {
        onWarmupCompleted = new char[]{64898};
        IAuthTabCallback = (char) 51240;
    }
}
