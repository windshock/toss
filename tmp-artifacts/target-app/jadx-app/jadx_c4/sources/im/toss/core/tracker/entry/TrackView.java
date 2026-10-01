package im.toss.core.tracker.entry;

import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.core.tracker.Referrer;
import im.toss.core.tracker.entry.TrackView$;
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
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DetectFaceInSingleImage;
import o.GetMotionInteractionState;
import o.InterfaceC0059deInitialize;
import o.TombstoneProtosMemoryMappingBuilder;
import o.TrackGroupExternalSyntheticLambda0;
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
public final class TrackView extends downloadZip implements ALCFaceSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    public static final Companion Companion;
    private static char[] IAuthTabCallback = null;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final Map<String, Object> params;
    private List<String> trackers;
    private final String view;

    static final class onExtraCallback extends ContinuationImpl {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 9;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallbackWithResult = TrackView.this.onExtraCallbackWithResult(false, this);
            int i4 = onExtraCallback + 111;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnExtraCallbackWithResult;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    public TrackView() {
        this((String) null, (Map) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TrackView(@NotNull String str) {
        this(str, (Map) null, (List) null, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TrackView(@NotNull String str, @NotNull Map<String, Object> map) {
        this(str, map, (List) null, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
    }

    private static final /* synthetic */ KSerializer ICustomTabsCallback() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(getWriggleLayout.onNavigationEvent);
        int i2 = onExtraCallbackWithResult + 119;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return checkcanopenlandingpage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ KSerializer asInterface() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 13;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerICustomTabsCallback = ICustomTabsCallback();
        int i4 = onExtraCallback + 71;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 7 / 0;
        }
        return kSerializerICustomTabsCallback;
    }

    private static final /* synthetic */ KSerializer extraCallback() {
        int i = 2 % 2;
        getMutilBackgroundDrawable getmutilbackgrounddrawable = new getMutilBackgroundDrawable(getWriggleLayout.onNavigationEvent, sp.IAuthTabCallback(GetMotionInteractionState.onExtraCallback));
        int i2 = onExtraCallbackWithResult + 91;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return getmutilbackgrounddrawable;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ KSerializer onTransact() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 3;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerExtraCallback = extraCallback();
        int i4 = onExtraCallback + 125;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 93;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 16 / 0;
            }
            return true;
        }
        if (!(obj instanceof TrackView)) {
            return false;
        }
        TrackView trackView = (TrackView) obj;
        if (!Intrinsics.areEqual(this.view, trackView.view)) {
            int i4 = onExtraCallback + 75;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.params, trackView.params)) {
            int i6 = onExtraCallback + 45;
            onExtraCallbackWithResult = i6 % 128;
            return i6 % 2 == 0;
        }
        if (Intrinsics.areEqual(this.trackers, trackView.trackers)) {
            return true;
        }
        int i7 = onExtraCallback + 113;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    @Override // o.ALCFaceSDK
    public boolean extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 7;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return true;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = this.view.hashCode();
        int iHashCode3 = this.params.hashCode();
        List<String> list = this.trackers;
        if (list == null) {
            int i4 = onExtraCallback + 71;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = list.hashCode();
        }
        return (((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TrackView(view=" + this.view + ", params=" + this.params + ", trackers=" + this.trackers + ")";
        int i2 = onExtraCallback + 123;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
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

        public final KSerializer<TrackView> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 113;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            TrackView$.serializer serializerVar = TrackView$.serializer.INSTANCE;
            int i4 = onExtraCallback + 45;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 56 / 0;
            }
            return serializerVar;
        }
    }

    static {
        IAuthTabCallback_Parcel();
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
        $childSerializers = new Lazy[]{null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.core.tracker.entry.TrackView$$ExternalSyntheticLambda0
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 53;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnTransact = TrackView.onTransact();
                int i4 = onExtraCallback + 91;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    return kSerializerOnTransact;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.core.tracker.entry.TrackView$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 87;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return TrackView.asInterface();
                }
                TrackView.asInterface();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        })};
        int i = onNavigationEvent + 121;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ TrackView(int i, String str, Map map, List list, okycx okycxVar) {
        ArrayList arrayListArrayListOf;
        this.view = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.params = new LinkedHashMap();
            int i2 = onExtraCallbackWithResult + 31;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
            }
            if ((i & 4) == 0) {
                this.trackers = list;
                return;
            }
            int i3 = onExtraCallbackWithResult + 35;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                String[] strArr = new String[0];
                strArr[0] = r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc.TOSS.getId();
                arrayListArrayListOf = CollectionsKt.arrayListOf(strArr);
            } else {
                arrayListArrayListOf = CollectionsKt.arrayListOf(new String[]{r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc.TOSS.getId()});
            }
            this.trackers = arrayListArrayListOf;
            return;
        }
        this.params = map;
        int i4 = 2 % 2;
        if ((i & 4) == 0) {
        }
    }

    public TrackView(@NotNull String str, @NotNull Map<String, Object> map, @Nullable List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.view = str;
        this.params = map;
        this.trackers = list;
    }

    public static final /* synthetic */ Lazy[] asBinder() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 103;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i3 + 115;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 88 / 0;
        }
        return lazyArr;
    }

    @JvmStatic
    public static final /* synthetic */ void onWarmupCompleted(TrackView trackView, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (!(!vylVar.onWarmupCompleted(serialDescriptor, 0)) || !Intrinsics.areEqual(trackView.view, "")) {
            vylVar.onExtraCallback(serialDescriptor, 0, trackView.view);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 1) || !Intrinsics.areEqual(trackView.onNavigationEvent(), new LinkedHashMap())) {
            vylVar.onNavigationEvent(serialDescriptor, 1, (py) lazyArr[1].getValue(), trackView.onNavigationEvent());
            int i2 = onExtraCallbackWithResult + 7;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
            int i4 = onExtraCallback + 95;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            if (Intrinsics.areEqual(trackView.trackers, CollectionsKt.arrayListOf(new String[]{r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc.TOSS.getId()}))) {
                return;
            }
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 2, (py) lazyArr[2].getValue(), trackView.trackers);
    }

    @Override // o.ALCFaceSDK
    public /* bridge */ List<r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc> IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 25;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        List<r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc> listIAuthTabCallbackStubProxy = super.IAuthTabCallbackStubProxy();
        int i4 = onExtraCallback + 97;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return listIAuthTabCallbackStubProxy;
    }

    @Override // o.ALCFaceSDK
    public /* bridge */ boolean access100() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 37;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zAccess100 = super.access100();
        int i4 = onExtraCallback + 103;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 55 / 0;
        }
        return zAccess100;
    }

    @Override // o.ALCFaceSDK
    public /* bridge */ boolean onWarmupCompleted(@NotNull r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc r8lambdaqfjxzpq89uignp4inuj4r5tibc) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 81;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnWarmupCompleted = super.onWarmupCompleted(r8lambdaqfjxzpq89uignp4inuj4r5tibc);
        int i4 = onExtraCallback + 59;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return zOnWarmupCompleted;
    }

    public /* synthetic */ TrackView(String str, Map map, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallbackWithResult + 97;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = i3 + 37;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            str = "";
        }
        if ((i & 2) != 0) {
            map = new LinkedHashMap();
            int i7 = 2 % 2;
        }
        if ((i & 4) != 0) {
            list = CollectionsKt.arrayListOf(new String[]{r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc.TOSS.getId()});
            int i8 = onExtraCallback + 63;
            onExtraCallbackWithResult = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 2 % 2;
            }
        }
        this(str, map, list);
    }

    public final String getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 73;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.view;
        int i5 = i2 + 21;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override // o.downloadZip
    public Map<String, Object> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 43;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return this.params;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.downloadZip
    public void IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 95;
        onExtraCallbackWithResult = i2 % 128;
        downloadZip.onExtraCallback(this, "view", this.view, null, null, null, i2 % 2 == 0 ? 52 : 28, null);
        int i3 = onExtraCallbackWithResult + 71;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.ALCFaceSDK
    public List<String> writeTypedObject() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        List<String> list = this.trackers;
        int i5 = i3 + 23;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        throw null;
    }

    @Override // o.ALCFaceSDK
    public String access000() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 21;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.view;
        int i5 = i2 + 79;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0098  */
    @Override // o.aq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onExtraCallbackWithResult(boolean z, @NotNull access13800<? super InterfaceC0059deInitialize> access13800Var) throws Throwable {
        onExtraCallback onextracallback;
        String string;
        String strIntern;
        int i = 2 % 2;
        String str = null;
        if (access13800Var instanceof onExtraCallback) {
            int i2 = onExtraCallback + 67;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = ((onExtraCallback) access13800Var).label;
                throw null;
            }
            onextracallback = (onExtraCallback) access13800Var;
            int i4 = onextracallback.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                onextracallback.label = i4 - 2147483648;
                int i5 = onExtraCallbackWithResult + 55;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
            } else {
                onextracallback = new onExtraCallback(access13800Var);
            }
        }
        onExtraCallback onextracallback2 = onextracallback;
        Object objIAuthTabCallback = onextracallback2.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i7 = onextracallback2.label;
        if (i7 == 0) {
            ResultKt.onNavigationEvent(objIAuthTabCallback);
            DetectFaceInSingleImage.onNavigationEvent onnavigationevent = new DetectFaceInSingleImage.onNavigationEvent(null, this.view, "view", 1, null);
            Map<String, Object> mapOnNavigationEvent = onNavigationEvent();
            onextracallback2.Z$0 = z;
            onextracallback2.label = 1;
            objIAuthTabCallback = downloadZip.IAuthTabCallback(this, onnavigationevent, mapOnNavigationEvent, false, null, z, onextracallback2, 8, null);
            if (objIAuthTabCallback == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(objIAuthTabCallback);
        }
        Map map = (Map) objIAuthTabCallback;
        Object obj = map.get("category");
        if (obj != null) {
            int i8 = onExtraCallbackWithResult + 123;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            string = obj.toString();
            if (string == null) {
                int i10 = onExtraCallback + 79;
                onExtraCallbackWithResult = i10 % 128;
                int i11 = i10 % 2;
                string = "common";
            }
        }
        String str2 = string;
        Object objRemove = map.remove("log_version");
        if (objRemove instanceof String) {
            int i12 = onExtraCallback + 99;
            onExtraCallbackWithResult = i12 % 128;
            int i13 = i12 % 2;
            str = (String) objRemove;
        }
        if (str == null) {
            Object[] objArr = new Object[1];
            a(new int[]{0, 1, 90, 1}, true, new byte[]{1}, objArr);
            strIntern = ((String) objArr[0]).intern();
        } else {
            strIntern = str;
        }
        return new AppEventPayloadV1(this.view, "view", str2, map, (String) null, onExtraCallbackWithResult(), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Long) null, strIntern, (String) null, (Referrer) null, (String) null, (String) null, 2031568, (DefaultConstructorMarker) null);
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        char[] cArr;
        int i = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr2 = IAuthTabCallback;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i6 = 0; i6 < length; i6++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 35282), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 36, 14239 - (ViewConfiguration.getEdgeSlop() >> 16), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
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
        char[] cArr4 = new char[i3];
        System.arraycopy(cArr2, i2, cArr4, 0, i3);
        if (bArr != null) {
            int i7 = $10 + 9;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            char[] cArr5 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                int i9 = $10 + 117;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i11 = $11 + 101;
                    $10 = i11 % 128;
                    if (i11 % 2 != 0) {
                        int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr3 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Gravity.getAbsoluteGravity(0, 0) + 10935), 'q' - AndroidCharacter.getMirror('0'), MotionEvent.axisFromString("") + 16719, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr5[i12] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        throw null;
                    }
                    int i13 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 65 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 16718 - View.MeasureSpec.getSize(0), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[i13] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                } else {
                    int i14 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr5 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", ""), 29 - (KeyEvent.getMaxKeyCode() >> 16), TextUtils.indexOf("", "", 0) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[i14] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                }
                c = cArr5[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr6 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 49468), 70 - KeyEvent.normalizeMetaState(0), TextUtils.getOffsetAfter("", 0) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            cArr4 = cArr5;
        }
        if (i5 > 0) {
            int i15 = $11 + 123;
            $10 = i15 % 128;
            int i16 = i15 % 2;
            char[] cArr6 = new char[i3];
            System.arraycopy(cArr4, 0, cArr6, 0, i3);
            int i17 = i3 - i5;
            System.arraycopy(cArr6, 0, cArr4, i17, i5);
            System.arraycopy(cArr6, i5, cArr4, 0, i17);
        }
        if (z) {
            int i18 = $10 + 83;
            $11 = i18 % 128;
            if (i18 % 2 == 0) {
                cArr = new char[i3];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 1;
            } else {
                cArr = new char[i3];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            }
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr4[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr4 = cArr;
        }
        if (i4 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    static void IAuthTabCallback_Parcel() {
        IAuthTabCallback = new char[]{27147};
    }
}
