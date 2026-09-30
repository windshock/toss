package im.toss.core.tracker.entry;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import im.toss.core.tracker.Referrer;
import im.toss.core.tracker.payload.AppEventPayloadV2;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DetectFaceInSingleImage;
import o.GetFeatureExtension;
import o.GetMotionInteractionState;
import o.TombstoneProtosMemoryMappingBuilder;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.access13800;
import o.access14000;
import o.access14300;
import o.downloadZip;
import o.getMutilBackgroundDrawable;
import o.getWriggleLayout;
import o.liq;
import o.okycx;
import o.py;
import o.sp;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class TrackLog extends downloadZip {
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    public static final Companion Companion;
    private static long onExtraCallback;
    private static int onNavigationEvent;
    private static int onTransact;
    private static char onWarmupCompleted;
    private final String company;
    private final String logVersion;
    private final Map<String, Object> params;
    private final long schemaId;
    private static final byte[] $$a = {10, 80, 9, 70};
    private static final int $$b = 218;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    static final class onNavigationEvent extends ContinuationImpl {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        boolean Z$0;
        boolean Z$1;
        int label;
        /* synthetic */ Object result;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 27;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallbackWithResult = TrackLog.this.onExtraCallbackWithResult(false, this);
            int i4 = onExtraCallback + 49;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 23 / 0;
            }
            return objOnExtraCallbackWithResult;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, short s, byte b) {
        int i2;
        int i3;
        int i4 = s + 109;
        int i5 = 1 - (b * 4);
        byte[] bArr = $$a;
        int i6 = i + 4;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i7 = i6;
            int i8 = i5;
            i3 = 0;
            int i9 = i6 + i8;
            i2 = i3;
            int i10 = i7;
            i4 = i9;
            i6 = i10;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            int i11 = i6 + 1;
            if (i3 == i5) {
                return new String(bArr2, 0);
            }
            i8 = bArr[i11];
            int i12 = i4;
            i7 = i11;
            i6 = i12;
            int i92 = i6 + i8;
            i2 = i3;
            int i102 = i7;
            i4 = i92;
            i6 = i102;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            int i112 = i6 + 1;
            if (i3 == i5) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            int i1122 = i6 + 1;
            if (i3 == i5) {
            }
        }
    }

    public TrackLog() {
        this(0L, (Map) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    public TrackLog(long j) {
        this(j, (Map) null, (String) null, (String) null, 14, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TrackLog(long j, @NotNull Map<String, Object> map) {
        this(j, map, (String) null, (String) null, 12, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(map, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TrackLog(long j, @NotNull Map<String, Object> map, @NotNull String str) {
        this(j, map, str, (String) null, 8, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str, "");
    }

    private static final /* synthetic */ KSerializer access100() {
        int i = 2 % 2;
        getMutilBackgroundDrawable getmutilbackgrounddrawable = new getMutilBackgroundDrawable(getWriggleLayout.onNavigationEvent, sp.IAuthTabCallback(GetMotionInteractionState.onExtraCallback));
        int i2 = onExtraCallbackWithResult + 105;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return getmutilbackgrounddrawable;
    }

    public static /* synthetic */ KSerializer onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 11;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerAccess100 = access100();
        int i4 = onExtraCallbackWithResult + 41;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerAccess100;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 45;
        int i4 = i3 % 128;
        onExtraCallbackWithResult = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrackLog)) {
            int i6 = i2 + 45;
            onExtraCallbackWithResult = i6 % 128;
            return i6 % 2 == 0;
        }
        TrackLog trackLog = (TrackLog) obj;
        if (this.schemaId != trackLog.schemaId) {
            int i7 = i4 + 111;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.params, trackLog.params)) {
            int i9 = IAuthTabCallback + 35;
            onExtraCallbackWithResult = i9 % 128;
            return i9 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.company, trackLog.company)) {
            return false;
        }
        if (Intrinsics.areEqual(this.logVersion, trackLog.logVersion)) {
            int i10 = onExtraCallbackWithResult + 71;
            IAuthTabCallback = i10 % 128;
            int i11 = i10 % 2;
            return true;
        }
        int i12 = IAuthTabCallback + 111;
        int i13 = i12 % 128;
        onExtraCallbackWithResult = i13;
        boolean z = i12 % 2 == 0;
        int i14 = i13 + 21;
        IAuthTabCallback = i14 % 128;
        int i15 = i14 % 2;
        return z;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int iHashCode = Long.hashCode(this.schemaId);
        int iHashCode2 = this.params.hashCode();
        int iHashCode3 = this.company.hashCode();
        String str = this.logVersion;
        if (str == null) {
            int i3 = IAuthTabCallback + 93;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            i = 0;
        } else {
            int iHashCode4 = str.hashCode();
            int i5 = IAuthTabCallback + 59;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 4 / 3;
            }
            i = iHashCode4;
        }
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + i;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TrackLog(schemaId=" + this.schemaId + ", params=" + this.params + ", company=" + this.company + ", logVersion=" + this.logVersion + ")";
        int i2 = onExtraCallbackWithResult + 7;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class Companion {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TrackLog> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 91;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            TrackLog$$serializer trackLog$$serializer = TrackLog$$serializer.INSTANCE;
            if (i3 != 0) {
                return trackLog$$serializer;
            }
            throw null;
        }
    }

    static {
        onTransact = 0;
        IAuthTabCallback_Parcel();
        Companion = new Companion(null);
        $childSerializers = new Lazy[]{null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.core.tracker.entry.TrackLog$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 45;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    return TrackLog.onTransact();
                }
                TrackLog.onTransact();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }), null, null};
        int i = IAuthTabCallbackDefault + 55;
        onTransact = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ TrackLog(int i, long j, Map map, String str, String str2, okycx okycxVar) {
        if ((i & 1) == 0) {
            int i2 = IAuthTabCallback + 83;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 % 4;
            } else {
                int i4 = 2 % 2;
            }
            j = -1;
        }
        this.schemaId = j;
        this.params = (i & 2) == 0 ? new LinkedHashMap() : map;
        if ((i & 4) == 0) {
            int i5 = IAuthTabCallback + 71;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                this.company = GetFeatureExtension.onWarmupCompleted.asBinder();
                int i6 = 67 / 0;
            } else {
                this.company = GetFeatureExtension.onWarmupCompleted.asBinder();
            }
        } else {
            this.company = str;
        }
        if ((i & 8) == 0) {
            this.logVersion = null;
        } else {
            this.logVersion = str2;
        }
    }

    public TrackLog(long j, @NotNull Map<String, Object> map, @NotNull String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.schemaId = j;
        this.params = map;
        this.company = str;
        this.logVersion = str2;
    }

    public static final /* synthetic */ Lazy[] asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 119;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return $childSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001d  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onNavigationEvent(TrackLog trackLog, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            int i2 = IAuthTabCallback + 35;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            if (trackLog.schemaId != -1) {
                vylVar.onExtraCallback(serialDescriptor, 0, trackLog.schemaId);
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 1) || !Intrinsics.areEqual(trackLog.onNavigationEvent(), new LinkedHashMap())) {
            vylVar.onNavigationEvent(serialDescriptor, 1, (py) lazyArr[1].getValue(), trackLog.onNavigationEvent());
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
            int i4 = onExtraCallbackWithResult + 47;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 79 / 0;
                if (!Intrinsics.areEqual(trackLog.company, GetFeatureExtension.onWarmupCompleted.asBinder())) {
                    vylVar.onExtraCallback(serialDescriptor, 2, trackLog.company);
                }
            } else if (!Intrinsics.areEqual(trackLog.company, GetFeatureExtension.onWarmupCompleted.asBinder())) {
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 3)) {
            int i6 = IAuthTabCallback + 59;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            String str = trackLog.logVersion;
            if (i7 == 0) {
                int i8 = 34 / 0;
                if (str == null) {
                    return;
                }
            } else if (str == null) {
                return;
            }
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, trackLog.logVersion);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TrackLog(long j, Map map, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str3;
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallback + 45;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            j = -1;
        }
        long j2 = j;
        Map linkedHashMap = (i & 2) != 0 ? new LinkedHashMap() : map;
        Object obj = null;
        if ((i & 4) != 0) {
            int i4 = onExtraCallbackWithResult + 1;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                GetFeatureExtension.onWarmupCompleted.asBinder();
                obj.hashCode();
                throw null;
            }
            str = GetFeatureExtension.onWarmupCompleted.asBinder();
            int i5 = 2 % 2;
        }
        String str4 = str;
        if ((i & 8) != 0) {
            int i6 = IAuthTabCallback + 75;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 4 % 4;
            } else {
                int i8 = 2 % 2;
            }
            str3 = null;
        } else {
            str3 = str2;
        }
        this(j2, linkedHashMap, str4, str3);
    }

    public final long getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 119;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        long j = this.schemaId;
        if (i4 == 0) {
            int i5 = 20 / 0;
        }
        int i6 = i3 + 119;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return j;
        }
        throw null;
    }

    @Override // o.downloadZip
    public Map<String, Object> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 85;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> map = this.params;
        if (i3 != 0) {
            int i4 = 10 / 0;
        }
        return map;
    }

    public final String asBinder() {
        String str;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 67;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            str = this.company;
            int i4 = 21 / 0;
        } else {
            str = this.company;
        }
        int i5 = i3 + 113;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    @Override // o.downloadZip
    public void IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 117;
        IAuthTabCallback = i2 % 128;
        String str = "screen";
        if (i2 % 2 != 0) {
            Intrinsics.areEqual(onNavigationEvent().get("action_type"), "screen");
            throw null;
        }
        if (!Intrinsics.areEqual(onNavigationEvent().get("action_type"), "screen")) {
            int i3 = IAuthTabCallback + 41;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            str = "log";
        }
        downloadZip.onExtraCallback(this, str, null, Long.valueOf(this.schemaId), null, null, 26, null);
    }

    public final boolean access000() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 81;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this.schemaId == -1) {
            return false;
        }
        int i4 = i3 + 1;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    public static final class onWarmupCompleted {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        private Map<String, Object> onExtraCallbackWithResult;
        private long onWarmupCompleted;

        public onWarmupCompleted() {
            this.onExtraCallbackWithResult = new LinkedHashMap();
        }

        public onWarmupCompleted(long j) {
            this();
            this.onWarmupCompleted = j;
        }

        public final onWarmupCompleted onWarmupCompleted(@NotNull String str, @Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 23;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            if (obj != null) {
                int i4 = onExtraCallback + 91;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                this.onExtraCallbackWithResult.put(str, obj);
                if (i5 != 0) {
                    int i6 = 47 / 0;
                }
            }
            return this;
        }

        public final TrackLog onExtraCallbackWithResult() {
            int i = 2 % 2;
            TrackLog trackLog = new TrackLog(this.onWarmupCompleted, this.onExtraCallbackWithResult, (String) null, (String) null, 12, (DefaultConstructorMarker) null);
            int i2 = onExtraCallback + 3;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return trackLog;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    @Override // o.aq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onExtraCallbackWithResult(boolean z, @NotNull access13800<? super AppEventPayloadV2> access13800Var) throws Throwable {
        onNavigationEvent onnavigationevent;
        String str;
        int i = 2 % 2;
        if (access13800Var instanceof onNavigationEvent) {
            onnavigationevent = (onNavigationEvent) access13800Var;
            int i2 = onnavigationevent.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                onnavigationevent.label = i2 - 2147483648;
            } else {
                onnavigationevent = new onNavigationEvent(access13800Var);
            }
        }
        onNavigationEvent onnavigationevent2 = onnavigationevent;
        Object objOnExtraCallback = onnavigationevent2.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i3 = onnavigationevent2.label;
        String str2 = null;
        if (i3 != 0) {
            int i4 = onExtraCallbackWithResult + 39;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0 ? i3 != 1 : i3 != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(objOnExtraCallback);
        } else {
            ResultKt.onNavigationEvent(objOnExtraCallback);
            String str3 = "screen";
            boolean zAreEqual = Intrinsics.areEqual(onNavigationEvent().get("action_type"), "screen");
            Long lOnExtraCallback = access14000.onExtraCallback(this.schemaId);
            if (!zAreEqual) {
                int i5 = IAuthTabCallback + 83;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    str2.hashCode();
                    throw null;
                }
                str3 = "log";
            }
            DetectFaceInSingleImage.onNavigationEvent onnavigationevent3 = new DetectFaceInSingleImage.onNavigationEvent(lOnExtraCallback, null, str3, 2, null);
            Map<String, Object> mapOnNavigationEvent = onNavigationEvent();
            String str4 = this.company;
            onnavigationevent2.Z$0 = z;
            onnavigationevent2.Z$1 = zAreEqual;
            onnavigationevent2.label = 1;
            objOnExtraCallback = onExtraCallback(onnavigationevent3, mapOnNavigationEvent, false, str4, z, onnavigationevent2);
            if (objOnExtraCallback == objOnWarmupCompleted) {
                int i6 = onExtraCallbackWithResult + 105;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 == 0) {
                    return objOnWarmupCompleted;
                }
                str2.hashCode();
                throw null;
            }
        }
        Map map = (Map) objOnExtraCallback;
        String strIntern = this.logVersion;
        if (strIntern == null) {
            Object objRemove = map.remove("log_version");
            if (objRemove instanceof String) {
                str2 = (String) objRemove;
            } else {
                int i7 = onExtraCallbackWithResult + 27;
                IAuthTabCallback = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 4 / 2;
                }
            }
            if (str2 == null) {
                Object[] objArr = new Object[1];
                a((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 19953), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1326193974, new char[]{18923}, new char[]{20016, 49233, 51937, 22640}, new char[]{13963, 3101, 61775, 51021}, objArr);
                strIntern = ((String) objArr[0]).intern();
                str = strIntern;
            } else {
                str = str2;
            }
        } else {
            str = strIntern;
        }
        return new AppEventPayloadV2(this.schemaId, map, (String) null, onExtraCallbackWithResult(), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, this.company, (String) null, (String) null, (Long) null, str, (String) null, (Referrer) null, (String) null, 244724, (DefaultConstructorMarker) null);
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i4 = $10 + 43;
            $11 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) (-1);
                    byte b2 = (byte) (-b);
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 42, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1451, 228868077, false, $$c(b, b2, (byte) (b2 - 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        byte b3 = (byte) (-1);
                        byte b4 = (byte) (b3 + 1);
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (ViewConfiguration.getFadingEdgeLength() >> 16)), TextUtils.lastIndexOf("", '0', 0) + 45, 1494 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 23972), Process.getGidForName("") + 51, (ViewConfiguration.getEdgeSlop() >> 16) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45848 - KeyEvent.getDeadChar(0, 0)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 29, Color.green(0) + 12577, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                            cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onExtraCallback ^ 7798559133331975163L)) ^ ((int) (onNavigationEvent ^ 7798559133331975163L))) ^ ((char) (onWarmupCompleted ^ 7798559133331975163L)));
                            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                            i2 = 2;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        String str = new String(cArr6);
        int i6 = $11 + 59;
        $10 = i6 % 128;
        if (i6 % 2 == 0) {
            objArr[0] = str;
        } else {
            int i7 = 12 / 0;
            objArr[0] = str;
        }
    }

    static void IAuthTabCallback_Parcel() {
        onExtraCallback = 3768042666419299787L;
        onNavigationEvent = -1776194565;
        onWarmupCompleted = (char) 27643;
    }
}
