package im.toss.core.tuba;

import im.toss.features.payment.ui.online.activity.OnlinePayTossOneUserCompleteActivity$;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkCanOpenLandingPage;
import o.clickEvent;
import o.extractEmotion;
import o.extractFaceLandmark;
import o.getWriggleLayout;
import o.liq;
import o.okycx;
import o.py;
import o.updateRenderInfoForVideo;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class Node {
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted = 1;
    private final List<Node> children;
    private final JsonElement constant;
    private final String name;
    private final extractFaceLandmark nodeType;
    private final extractEmotion phrase;

    public Node() {
        this((extractFaceLandmark) null, (List) null, (String) null, (extractEmotion) null, (JsonElement) null, 31, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 109;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallbackStubProxy();
            throw null;
        }
        KSerializer kSerializerIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy();
        int i3 = IAuthTabCallback + 101;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return kSerializerIAuthTabCallbackStubProxy;
        }
        throw null;
    }

    private static final /* synthetic */ KSerializer IAuthTabCallbackStubProxy() {
        KSerializer kSerializerOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 109;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("im.toss.core.tuba.Phrase", extractEmotion.values());
            int i3 = 20 / 0;
        } else {
            kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("im.toss.core.tuba.Phrase", extractEmotion.values());
        }
        int i4 = onWarmupCompleted + 101;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnExtraCallbackWithResult;
    }

    private static final /* synthetic */ KSerializer IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(Node$$serializer.INSTANCE);
        int i2 = onWarmupCompleted + 7;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 44 / 0;
        }
        return checkcanopenlandingpage;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~i3;
        int i9 = (~(i8 | i6)) | i7;
        int i10 = (~(i7 | (~i6) | i3)) | (~(i8 | i7 | i6));
        int i11 = (~(i6 | i3)) | (~(i2 | i3));
        int i12 = i2 + i3 + i4 + ((-1520811122) * i5) + (1880343047 * i);
        int i13 = i12 * i12;
        int i14 = (((-88056299) * i2) - 1254686720) + (875799021 * i3) + ((-481927660) * i9) + (i10 * 481927660) + (481927660 * i11) + (393871360 * i4) + ((-206831616) * i5) + (408289280 * i) + ((-683737088) * i13);
        int i15 = ((i2 * (-660833811)) - 1995073173) + (i3 * (-660833531)) + (i9 * (-140)) + (i10 * 140) + (i11 * 140) + (i4 * (-660833671)) + (i5 * 644061726) + (i * (-2012083377)) + (i13 * (-1027145728));
        return i14 + ((i15 * i15) * 814809088) != 1 ? onExtraCallback(objArr) : onWarmupCompleted(objArr);
    }

    public static /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 117;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerIAuthTabCallback_Parcel = IAuthTabCallback_Parcel();
        int i4 = onWarmupCompleted + 29;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerIAuthTabCallback_Parcel;
    }

    private static final /* synthetic */ KSerializer onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 29;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return updateRenderInfoForVideo.onExtraCallbackWithResult("im.toss.core.tuba.NodeType", extractFaceLandmark.values());
        }
        updateRenderInfoForVideo.onExtraCallbackWithResult("im.toss.core.tuba.NodeType", extractFaceLandmark.values());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 75;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnTransact = onTransact();
        int i4 = IAuthTabCallback + 93;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnTransact;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if ((r6 instanceof im.toss.core.tuba.Node) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r6 = (im.toss.core.tuba.Node) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r5.nodeType == r6.nodeType) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.children, r6.children) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
    
        r6 = im.toss.core.tuba.Node.IAuthTabCallback + 85;
        im.toss.core.tuba.Node.onWarmupCompleted = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.name, r6.name) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0051, code lost:
    
        if (r5.phrase == r6.phrase) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
    
        r6 = im.toss.core.tuba.Node.IAuthTabCallback + 49;
        im.toss.core.tuba.Node.onWarmupCompleted = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.constant, r6.constant) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0068, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r1 = r1 + 103;
        im.toss.core.tuba.Node.IAuthTabCallback = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 31;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 30 / 0;
        }
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        extractFaceLandmark extractfacelandmark = this.nodeType;
        int iHashCode3 = 1;
        if (extractfacelandmark == null) {
            int i2 = onWarmupCompleted + 45;
            IAuthTabCallback = i2 % 128;
            iHashCode = i2 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = extractfacelandmark.hashCode();
            int i3 = IAuthTabCallback + 27;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
        }
        int iHashCode4 = this.children.hashCode();
        String str = this.name;
        if (str == null) {
            int i5 = onWarmupCompleted + 107;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                iHashCode3 = 0;
            }
        } else {
            iHashCode3 = str.hashCode();
        }
        extractEmotion extractemotion = this.phrase;
        if (extractemotion == null) {
            int i6 = IAuthTabCallback + 119;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = extractemotion.hashCode();
        }
        JsonElement jsonElement = this.constant;
        return (((((((iHashCode * 31) + iHashCode4) * 31) + iHashCode3) * 31) + iHashCode2) * 31) + (jsonElement != null ? jsonElement.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Node(nodeType=" + this.nodeType + ", children=" + this.children + ", name=" + this.name + ", phrase=" + this.phrase + ", constant=" + this.constant + ")";
        int i2 = onWarmupCompleted + 61;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public /* synthetic */ Node(int i, extractFaceLandmark extractfacelandmark, List list, String str, extractEmotion extractemotion, JsonElement jsonElement, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.nodeType = null;
        } else {
            this.nodeType = extractfacelandmark;
        }
        if ((i & 2) == 0) {
            this.children = new ArrayList();
            int i2 = 2 % 2;
        } else {
            this.children = list;
        }
        if ((i & 4) == 0) {
            int i3 = onWarmupCompleted + 23;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            this.name = null;
            if (i4 != 0) {
                int i5 = 81 / 0;
            }
        } else {
            this.name = str;
        }
        if ((i & 8) == 0) {
            this.phrase = null;
        } else {
            this.phrase = extractemotion;
            int i6 = IAuthTabCallback + 33;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
        }
        if ((i & 16) != 0) {
            this.constant = jsonElement;
            return;
        }
        int i9 = onWarmupCompleted + 49;
        IAuthTabCallback = i9 % 128;
        int i10 = i9 % 2;
        this.constant = null;
    }

    public Node(@Nullable extractFaceLandmark extractfacelandmark, @NotNull List<Node> list, @Nullable String str, @Nullable extractEmotion extractemotion, @Nullable JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(list, "");
        this.nodeType = extractfacelandmark;
        this.children = list;
        this.name = str;
        this.phrase = extractemotion;
        this.constant = jsonElement;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 123;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i4 = i3 + 19;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return lazyArr;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003a A[PHI: r5
      0x003a: PHI (r5v11 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
      (r5v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r5v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r5v12 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
     binds: [B:8:0x002b, B:10:0x0038, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d A[PHI: r5
      0x002d: PHI (r5v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
      (r5v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r5v12 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
     binds: [B:8:0x002b, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Lazy<KSerializer<Object>>[] lazyArr;
        Node node = (Node) objArr[0];
        vyl vylVar = (vyl) objArr[1];
        SerialDescriptor serialDescriptor = (SerialDescriptor) objArr[2];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 49;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            lazyArr = $childSerializers;
            if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
                int i3 = IAuthTabCallback + 29;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                if (node.nodeType != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 0, (py) lazyArr[0].getValue(), node.nodeType);
                }
            }
        } else {
            lazyArr = $childSerializers;
            if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 1) || !Intrinsics.areEqual(node.children, new ArrayList())) {
            vylVar.onNavigationEvent(serialDescriptor, 1, (py) lazyArr[1].getValue(), node.children);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
            int i5 = IAuthTabCallback + 51;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            if (node.name != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, node.name);
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 3) || node.phrase != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 3, (py) lazyArr[3].getValue(), node.phrase);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 4) && node.constant == null) {
            return null;
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 4, clickEvent.onExtraCallback, node.constant);
        int i7 = IAuthTabCallback + 75;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 != 0) {
            return null;
        }
        int i8 = 3 / 5;
        return null;
    }

    public final extractFaceLandmark asInterface() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 63;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        extractFaceLandmark extractfacelandmark = this.nodeType;
        int i4 = i2 + 93;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return extractfacelandmark;
        }
        throw null;
    }

    public /* synthetic */ Node(extractFaceLandmark extractfacelandmark, List list, String str, extractEmotion extractemotion, JsonElement jsonElement, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str2;
        extractEmotion extractemotion2;
        JsonElement jsonElement2;
        extractFaceLandmark extractfacelandmark2 = (i & 1) != 0 ? null : extractfacelandmark;
        if ((i & 2) != 0) {
            list = new ArrayList();
            int i2 = IAuthTabCallback + 23;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        List list2 = list;
        if ((i & 4) != 0) {
            int i5 = onWarmupCompleted + 29;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
            str2 = null;
        } else {
            str2 = str;
        }
        if ((i & 8) != 0) {
            int i6 = IAuthTabCallback + 103;
            int i7 = i6 % 128;
            onWarmupCompleted = i7;
            int i8 = i6 % 2;
            int i9 = i7 + 117;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 2 % 2;
            extractemotion2 = null;
        } else {
            extractemotion2 = extractemotion;
        }
        if ((i & 16) != 0) {
            int i12 = onWarmupCompleted + 121;
            IAuthTabCallback = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 45 / 0;
            }
            jsonElement2 = null;
        } else {
            jsonElement2 = jsonElement;
        }
        this(extractfacelandmark2, list2, str2, extractemotion2, jsonElement2);
    }

    public final List<Node> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 61;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        List<Node> list = this.children;
        if (i3 == 0) {
            int i4 = 10 / 0;
        }
        return list;
    }

    public final String asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 91;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.name;
        int i4 = i3 + 29;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final extractEmotion IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 111;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        extractEmotion extractemotion = this.phrase;
        int i5 = i3 + 115;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return extractemotion;
    }

    public final JsonElement IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 95;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        JsonElement jsonElement = this.constant;
        int i5 = i2 + 99;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return jsonElement;
        }
        throw null;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<Node> serializer() {
            Node$$serializer node$$serializer;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 31;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                node$$serializer = Node$$serializer.INSTANCE;
                int i3 = 27 / 0;
            } else {
                node$$serializer = Node$$serializer.INSTANCE;
            }
            int i4 = IAuthTabCallback + 115;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return node$$serializer;
        }
    }

    static {
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
        $childSerializers = new Lazy[]{LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.core.tuba.Node$$ExternalSyntheticLambda0
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 87;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnWarmupCompleted = Node.onWarmupCompleted();
                int i4 = onWarmupCompleted + 41;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    return kSerializerOnWarmupCompleted;
                }
                throw null;
            }
        }), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.core.tuba.Node$$ExternalSyntheticLambda1
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                KSerializer kSerializerOnExtraCallback;
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 35;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    kSerializerOnExtraCallback = Node.onExtraCallback();
                    int i3 = 28 / 0;
                } else {
                    kSerializerOnExtraCallback = Node.onExtraCallback();
                }
                int i4 = onWarmupCompleted + 51;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return kSerializerOnExtraCallback;
            }
        }), null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.core.tuba.Node$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 85;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    return Node.IAuthTabCallback();
                }
                Node.IAuthTabCallback();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }), null};
        int i = onExtraCallbackWithResult + 83;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public static final /* synthetic */ Lazy[] onExtraCallbackWithResult() {
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        return (Lazy[]) onExtraCallback(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -2087695286, 2087695286, new Object[0], iOnExtraCallback2, iOnExtraCallback3, iOnExtraCallback);
    }

    @JvmStatic
    public static final /* synthetic */ void onNavigationEvent(Node node, vyl vylVar, SerialDescriptor serialDescriptor) {
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        onExtraCallback(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 66405466, -66405465, new Object[]{node, vylVar, serialDescriptor}, iOnExtraCallback2, iOnExtraCallback3, iOnExtraCallback);
    }
}
