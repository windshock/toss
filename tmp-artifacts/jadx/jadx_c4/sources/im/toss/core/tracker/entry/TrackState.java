package im.toss.core.tracker.entry;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.core.tracker.Referrer;
import im.toss.core.tracker.entry.TrackState$;
import im.toss.core.tracker.payload.AppEventPayloadV1;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
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
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DetectFaceInSingleImage;
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

@Deprecated
@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class TrackState extends downloadZip implements ALCFaceSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    public static final Companion Companion;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static long onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private static TrackState previousState;
    private final Map<String, Object> params;
    private final String state;
    private List<String> trackers;

    static final class onExtraCallback extends ContinuationImpl {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 117;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TrackState.this.onExtraCallbackWithResult(i3 == 0, this);
        }
    }

    public TrackState() {
        this((String) null, (Map) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TrackState(@NotNull String str) {
        this(str, (Map) null, (List) null, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TrackState(@NotNull String str, @NotNull Map<String, Object> map) {
        this(str, map, (List) null, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
    }

    private static final /* synthetic */ KSerializer ICustomTabsCallback() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(getWriggleLayout.onNavigationEvent);
        int i2 = onExtraCallbackWithResult + 115;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    public static /* synthetic */ KSerializer asBinder() {
        KSerializer kSerializerICustomTabsCallback;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 77;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            kSerializerICustomTabsCallback = ICustomTabsCallback();
            int i3 = 45 / 0;
        } else {
            kSerializerICustomTabsCallback = ICustomTabsCallback();
        }
        int i4 = onExtraCallbackWithResult + 113;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 54 / 0;
        }
        return kSerializerICustomTabsCallback;
    }

    public static /* synthetic */ KSerializer asInterface() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 41;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            readTypedObject();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        KSerializer typedObject = readTypedObject();
        int i3 = onExtraCallbackWithResult + 21;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 35 / 0;
        }
        return typedObject;
    }

    private static final /* synthetic */ KSerializer readTypedObject() {
        int i = 2 % 2;
        getMutilBackgroundDrawable getmutilbackgrounddrawable = new getMutilBackgroundDrawable(getWriggleLayout.onNavigationEvent, sp.IAuthTabCallback(GetMotionInteractionState.onExtraCallback));
        int i2 = onExtraCallbackWithResult + 41;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return getmutilbackgrounddrawable;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 99;
        onExtraCallbackWithResult = i3 % 128;
        Object obj2 = null;
        if (i3 % 2 != 0) {
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof TrackState) {
            TrackState trackState = (TrackState) obj;
            return Intrinsics.areEqual(this.state, trackState.state) && Intrinsics.areEqual(this.params, trackState.params) && Intrinsics.areEqual(this.trackers, trackState.trackers);
        }
        int i4 = i2 + 11;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return false;
        }
        throw null;
    }

    @Override // o.ALCFaceSDK
    public boolean extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 105;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 105;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return true;
        }
        throw null;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int iHashCode = this.state.hashCode();
        int iHashCode2 = this.params.hashCode();
        List<String> list = this.trackers;
        if (list == null) {
            int i3 = onWarmupCompleted + 9;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            i = 0;
        } else {
            int iHashCode3 = list.hashCode();
            int i5 = onExtraCallbackWithResult + 119;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 3 % 2;
            }
            i = iHashCode3;
        }
        return (((iHashCode * 31) + iHashCode2) * 31) + i;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TrackState(state=" + this.state + ", params=" + this.params + ", trackers=" + this.trackers + ")";
        int i2 = onWarmupCompleted + 9;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public /* synthetic */ TrackState(int i, String str, Map map, List list, okycx okycxVar) {
        String str2;
        ArrayList arrayListArrayListOf;
        if ((i & 1) == 0) {
            int i2 = onExtraCallbackWithResult + 15;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
            str = "";
        }
        this.state = str;
        if ((i & 2) == 0) {
            this.params = new LinkedHashMap();
        } else {
            this.params = map;
        }
        if ((i & 4) == 0) {
            int i4 = onWarmupCompleted + 79;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                String[] strArr = new String[0];
                strArr[0] = r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc.TOSS.getId();
                arrayListArrayListOf = CollectionsKt.arrayListOf(strArr);
            } else {
                arrayListArrayListOf = CollectionsKt.arrayListOf(new String[]{r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc.TOSS.getId()});
            }
            this.trackers = arrayListArrayListOf;
        } else {
            this.trackers = list;
        }
        Map<String, Object> mapOnNavigationEvent = onNavigationEvent();
        TrackState trackState = previousState;
        if (trackState != null) {
            str2 = trackState.state;
            int i5 = 2 % 2;
        } else {
            int i6 = 2 % 2;
            str2 = null;
        }
        mapOnNavigationEvent.put("from_state", str2);
        previousState = this;
    }

    public TrackState(@NotNull String str, @NotNull Map<String, Object> map, @Nullable List<String> list) {
        String str2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.state = str;
        this.params = map;
        this.trackers = list;
        Map<String, Object> mapOnNavigationEvent = onNavigationEvent();
        TrackState trackState = previousState;
        if (trackState != null) {
            str2 = trackState.state;
            int i = onWarmupCompleted + 83;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } else {
            str2 = null;
        }
        mapOnNavigationEvent.put("from_state", str2);
        previousState = this;
        int i4 = onWarmupCompleted + 3;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ TrackState IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        TrackState trackState = previousState;
        int i5 = i3 + 61;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 8 / 0;
        }
        return trackState;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021 A[PHI: r1
      0x0021: PHI (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
      (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v11 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
     binds: [B:8:0x001e, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b A[PHI: r1
      0x002b: PHI (r1v10 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
      (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v11 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
     binds: [B:8:0x001e, B:11:0x0029, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onExtraCallbackWithResult(TrackState trackState, vyl vylVar, SerialDescriptor serialDescriptor) {
        Lazy<KSerializer<Object>>[] lazyArr;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 3;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            lazyArr = $childSerializers;
            if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
                if (!Intrinsics.areEqual(trackState.state, "")) {
                    vylVar.onExtraCallback(serialDescriptor, 0, trackState.state);
                }
            }
        } else {
            lazyArr = $childSerializers;
            if (vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 1) || !Intrinsics.areEqual(trackState.onNavigationEvent(), new LinkedHashMap())) {
            vylVar.onNavigationEvent(serialDescriptor, 1, (py) lazyArr[1].getValue(), trackState.onNavigationEvent());
            int i3 = onWarmupCompleted + 37;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
            int i5 = onExtraCallbackWithResult + 69;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                if (Intrinsics.areEqual(trackState.trackers, CollectionsKt.arrayListOf(new String[]{r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc.TOSS.getId()}))) {
                    return;
                }
            } else if (Intrinsics.areEqual(trackState.trackers, CollectionsKt.arrayListOf(new String[]{r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc.TOSS.getId()}))) {
                return;
            }
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 2, (py) lazyArr[2].getValue(), trackState.trackers);
    }

    public static final /* synthetic */ Lazy[] onTransact() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 23;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return $childSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.ALCFaceSDK
    public /* bridge */ List<r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc> IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 107;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        List<r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc> listIAuthTabCallbackStubProxy = super.IAuthTabCallbackStubProxy();
        int i4 = onExtraCallbackWithResult + 3;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return listIAuthTabCallbackStubProxy;
        }
        throw null;
    }

    @Override // o.ALCFaceSDK
    public /* bridge */ boolean access100() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 121;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return super.access100();
        }
        super.access100();
        throw null;
    }

    @Override // o.ALCFaceSDK
    public /* bridge */ boolean onWarmupCompleted(@NotNull r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc r8lambdaqfjxzpq89uignp4inuj4r5tibc) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 57;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnWarmupCompleted = super.onWarmupCompleted(r8lambdaqfjxzpq89uignp4inuj4r5tibc);
        int i4 = onWarmupCompleted + 43;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return zOnWarmupCompleted;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TrackState(String str, Map map, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onWarmupCompleted + 47;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 % 2;
            }
            str = "";
        }
        map = (i & 2) != 0 ? new LinkedHashMap() : map;
        if ((i & 4) != 0) {
            int i4 = onWarmupCompleted + 27;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            list = CollectionsKt.arrayListOf(new String[]{r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc.TOSS.getId()});
        }
        this(str, map, list);
    }

    public final String getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 91;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = this.state;
        int i5 = i2 + 33;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.downloadZip
    public Map<String, Object> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 15;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Map<String, Object> map = this.params;
        int i4 = i3 + 25;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return map;
    }

    @Override // o.downloadZip
    public void IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 29;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        downloadZip.onExtraCallback(this, "state", this.state, null, null, null, 28, null);
        int i4 = onExtraCallbackWithResult + 49;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // o.ALCFaceSDK
    public List<String> writeTypedObject() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 41;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return this.trackers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.ALCFaceSDK
    public String access000() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 119;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        String str = this.state;
        int i5 = i3 + 35;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TrackState> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 45;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                TrackState$.serializer serializerVar = TrackState$.serializer.INSTANCE;
                throw null;
            }
            TrackState$.serializer serializerVar2 = TrackState$.serializer.INSTANCE;
            int i3 = IAuthTabCallback + 51;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 66 / 0;
            }
            return serializerVar2;
        }

        public final TrackState onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 123;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            TrackState trackStateIAuthTabCallback_Parcel = TrackState.IAuthTabCallback_Parcel();
            int i4 = onExtraCallback + 97;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return trackStateIAuthTabCallback_Parcel;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        extraCallback();
        Companion = new Companion(null);
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
        $childSerializers = new Lazy[]{null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.core.tracker.entry.TrackState$$ExternalSyntheticLambda0
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 75;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    return TrackState.asInterface();
                }
                TrackState.asInterface();
                throw null;
            }
        }), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.core.tracker.entry.TrackState$$ExternalSyntheticLambda1
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 13;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerAsBinder = TrackState.asBinder();
                int i4 = onExtraCallback + 103;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    return kSerializerAsBinder;
                }
                throw null;
            }
        })};
        int i = IAuthTabCallback + 83;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    @Override // o.aq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onExtraCallbackWithResult(boolean z, @NotNull access13800<? super InterfaceC0059deInitialize> access13800Var) throws Throwable {
        onExtraCallback onextracallback;
        String string;
        int i = 2 % 2;
        if (access13800Var instanceof onExtraCallback) {
            onextracallback = (onExtraCallback) access13800Var;
            int i2 = onextracallback.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = onWarmupCompleted + 115;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                onextracallback.label = i2 - 2147483648;
            } else {
                onextracallback = new onExtraCallback(access13800Var);
            }
        }
        onExtraCallback onextracallback2 = onextracallback;
        Object objIAuthTabCallback = onextracallback2.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = onextracallback2.label;
        if (i5 == 0) {
            ResultKt.onNavigationEvent(objIAuthTabCallback);
            DetectFaceInSingleImage.onNavigationEvent onnavigationevent = new DetectFaceInSingleImage.onNavigationEvent(null, this.state, "state", 1, null);
            Map<String, Object> mapOnNavigationEvent = onNavigationEvent();
            onextracallback2.Z$0 = z;
            onextracallback2.label = 1;
            objIAuthTabCallback = downloadZip.IAuthTabCallback(this, onnavigationevent, mapOnNavigationEvent, false, null, z, onextracallback2, 8, null);
            if (objIAuthTabCallback == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i6 = onExtraCallbackWithResult + 75;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            ResultKt.onNavigationEvent(objIAuthTabCallback);
        }
        Map map = (Map) objIAuthTabCallback;
        Object obj = map.get("category");
        if (obj == null || (string = obj.toString()) == null) {
            int i8 = onExtraCallbackWithResult + 75;
            onWarmupCompleted = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 4 / 5;
            }
            string = "common";
        }
        String str = string;
        Object objRemove = map.remove("log_version");
        String strIntern = objRemove instanceof String ? (String) objRemove : null;
        if (strIntern == null) {
            int i10 = onExtraCallbackWithResult + 123;
            onWarmupCompleted = i10 % 128;
            if (i10 % 2 == 0) {
                Object[] objArr = new Object[1];
                a(new char[]{1247}, 45247 % (ViewConfiguration.getEdgeSlop() + 116), objArr);
                strIntern = ((String) objArr[0]).intern();
            } else {
                Object[] objArr2 = new Object[1];
                a(new char[]{1247}, (ViewConfiguration.getEdgeSlop() >> 16) + 45247, objArr2);
                strIntern = ((String) objArr2[0]).intern();
            }
        }
        return new AppEventPayloadV1(this.state, "state", str, map, (String) null, onExtraCallbackWithResult(), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Long) null, strIntern, (String) null, (Referrer) null, (String) null, (String) null, 2031568, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        Object obj;
        Throwable cause;
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (true) {
            obj = null;
            if (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback >= cArr.length) {
                break;
            }
            int i3 = $10 + 107;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTapTimeout() >> 16), 25 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), ExpandableListView.getPackedPositionType(0L) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() & (onNavigationEvent + 5407414049857832247L);
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.makeMeasureSpec(0, 0), 59 - View.resolveSize(0, 0), TextUtils.indexOf((CharSequence) "", '0', 0) + 6384, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause != null) {
                    }
                }
            } else {
                int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                Object[] objArr4 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.argb(0, 0, 0, 0), View.resolveSize(0, 0) + 24, TextUtils.indexOf("", "") + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback3).invoke(null, objArr4)).longValue() ^ (onNavigationEvent ^ 5407414049857832247L);
                Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), (Process.myTid() >> 22) + 59, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 6382, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr6 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarSize() >> 8), MotionEvent.axisFromString("") + 60, Process.getGidForName("") + 6384, -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
            int i6 = $10 + 29;
            $11 = i6 % 128;
            int i7 = i6 % 2;
        }
        String str = new String(cArr2);
        int i8 = $10 + 3;
        $11 = i8 % 128;
        if (i8 % 2 != 0) {
            objArr[0] = str;
        } else {
            obj.hashCode();
            throw null;
        }
    }

    static void extraCallback() {
        onNavigationEvent = 7487735580966552025L;
    }
}
