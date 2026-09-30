package im.toss.core.tracker.entry;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.skt.usp.UCPApiConstants;
import im.toss.core.tracker.Referrer;
import im.toss.core.tracker.entry.CustomizableLog$;
import im.toss.core.tracker.payload.AppEventPayloadV3;
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
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DetectFaceInSingleImage;
import o.GetFeatureExtension;
import o.GetMotionInteractionState;
import o.InterfaceC0059deInitialize;
import o.TombstoneProtosMemoryMappingBuilder;
import o.access13800;
import o.access14300;
import o.downloadZip;
import o.getMutilBackgroundDrawable;
import o.getWriggleLayout;
import o.liq;
import o.okycx;
import o.oty1;
import o.py;
import o.setApTextSize;
import o.sp;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class CustomizableLog extends downloadZip {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    public static final Companion Companion;
    private static int IAuthTabCallback = 0;
    private static long onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final String company;
    private final String logName;
    private final String logType;
    private final String logVersion;
    private final Map<String, Object> params;
    private final Long schemaId;
    private final String service;

    static final class onExtraCallbackWithResult extends ContinuationImpl {
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
            int i2 = onWarmupCompleted + 111;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallbackWithResult = CustomizableLog.this.onExtraCallbackWithResult(i3 != 0, this);
            int i4 = onNavigationEvent + 91;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }
    }

    public CustomizableLog() {
        this((Long) null, (String) null, (String) null, (String) null, (Map) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    public CustomizableLog(@Nullable Long l) {
        this(l, (String) null, (String) null, (String) null, (Map) null, (String) null, (String) null, 126, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CustomizableLog(@Nullable Long l, @NotNull String str) {
        this(l, str, (String) null, (String) null, (Map) null, (String) null, (String) null, 124, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CustomizableLog(@Nullable Long l, @NotNull String str, @NotNull String str2) {
        this(l, str, str2, (String) null, (Map) null, (String) null, (String) null, UCPApiConstants.ARAM_TIME_OUT, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CustomizableLog(@Nullable Long l, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        this(l, str, str2, str3, (Map) null, (String) null, (String) null, 112, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CustomizableLog(@Nullable Long l, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Map<String, Object> map) {
        this(l, str, str2, str3, map, (String) null, (String) null, 96, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(map, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CustomizableLog(@Nullable Long l, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Map<String, Object> map, @NotNull String str4) {
        this(l, str, str2, str3, map, str4, (String) null, 64, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str4, "");
    }

    public static /* synthetic */ CustomizableLog IAuthTabCallback(CustomizableLog customizableLog, Long l, String str, String str2, String str3, Map map, String str4, String str5, int i, Object obj) {
        String str6;
        String str7;
        String str8;
        Map map2;
        String str9;
        int i2 = 2 % 2;
        Long l2 = (i & 1) != 0 ? customizableLog.schemaId : l;
        if ((i & 2) != 0) {
            str6 = customizableLog.logName;
            int i3 = onWarmupCompleted + 95;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
        } else {
            str6 = str;
        }
        if ((i & 4) != 0) {
            int i5 = onExtraCallbackWithResult + 95;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            str7 = customizableLog.logType;
        } else {
            str7 = str2;
        }
        if ((i & 8) != 0) {
            int i7 = onExtraCallbackWithResult + 23;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 != 0) {
                str8 = customizableLog.service;
                int i8 = 32 / 0;
            } else {
                str8 = customizableLog.service;
            }
        } else {
            str8 = str3;
        }
        if ((i & 16) != 0) {
            map2 = customizableLog.params;
            int i9 = onExtraCallbackWithResult + 43;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
        } else {
            map2 = map;
        }
        String str10 = (i & 32) != 0 ? customizableLog.logVersion : str4;
        if ((i & 64) != 0) {
            int i11 = onExtraCallbackWithResult + 31;
            onWarmupCompleted = i11 % 128;
            if (i11 % 2 != 0) {
                String str11 = customizableLog.company;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str9 = customizableLog.company;
        } else {
            str9 = str5;
        }
        return customizableLog.onExtraCallbackWithResult(l2, str6, str7, str8, map2, str10, str9);
    }

    public static /* synthetic */ KSerializer asBinder() {
        KSerializer kSerializer;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 3;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            kSerializer = (KSerializer) onWarmupCompleted(setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[0], setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), 1811458177, setApTextSize.onNavigationEvent.4.onNavigationEvent(), -1811458177);
            int i3 = 60 / 0;
        } else {
            kSerializer = (KSerializer) onWarmupCompleted(setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[0], setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), 1811458177, setApTextSize.onNavigationEvent.4.onNavigationEvent(), -1811458177);
        }
        int i4 = onWarmupCompleted + 73;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializer;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~(i4 | i6 | i);
        int i8 = ~i6;
        int i9 = (~(i8 | i)) | (~((~i) | i4));
        int i10 = (~(i | (~i4))) | i8;
        int i11 = i4 + i6 + i5 + ((-2044576983) * i2) + (1743660113 * i3);
        int i12 = i11 * i11;
        int i13 = ((1047202342 * i4) - 713031680) + (164951516 * i6) + (i7 * 441125413) + (441125413 * i9) + ((-441125413) * i10) + (606076928 * i5) + (689963008 * i2) + ((-299892736) * i3) + ((-1081737216) * i12);
        int i14 = ((i4 * 2048727874) - 782056376) + (i6 * 2048728756) + (i7 * (-441)) + (i9 * (-441)) + (i10 * 441) + (i5 * 2048728315) + (i2 * 2142076211) + (i3 * (-1448904853)) + (i12 * 1885470720);
        return i13 + ((i14 * i14) * (-1618345984)) != 1 ? onWarmupCompleted(objArr) : onNavigationEvent(objArr);
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i = 2 % 2;
        getMutilBackgroundDrawable getmutilbackgrounddrawable = new getMutilBackgroundDrawable(getWriggleLayout.onNavigationEvent, sp.IAuthTabCallback(GetMotionInteractionState.onExtraCallback));
        int i2 = onWarmupCompleted + 93;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return getmutilbackgrounddrawable;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 103;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomizableLog)) {
            int i4 = i2 + 29;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        CustomizableLog customizableLog = (CustomizableLog) obj;
        if (!Intrinsics.areEqual(this.schemaId, customizableLog.schemaId) || !Intrinsics.areEqual(this.logName, customizableLog.logName)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.logType, customizableLog.logType)) {
            int i6 = onExtraCallbackWithResult + 121;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.service, customizableLog.service)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.params, customizableLog.params)) {
            int i8 = onExtraCallbackWithResult + 5;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.logVersion, customizableLog.logVersion)) {
            int i10 = onWarmupCompleted + 67;
            onExtraCallbackWithResult = i10 % 128;
            return i10 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.company, customizableLog.company)) {
            return false;
        }
        int i11 = onWarmupCompleted + 111;
        onExtraCallbackWithResult = i11 % 128;
        int i12 = i11 % 2;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c A[PHI: r1
      0x001c: PHI (r1v5 java.lang.Long) = (r1v4 java.lang.Long), (r1v11 java.lang.Long) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int hashCode() {
        Long l;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 19;
        onExtraCallbackWithResult = i2 % 128;
        int iHashCode = 0;
        if (i2 % 2 == 0) {
            l = this.schemaId;
            int i3 = 84 / 0;
            if (l != null) {
                iHashCode = l.hashCode();
                int i4 = onExtraCallbackWithResult + 17;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 4 / 2;
                }
            }
        } else {
            l = this.schemaId;
            if (l != null) {
            }
        }
        return (((((((((((iHashCode * 31) + this.logName.hashCode()) * 31) + this.logType.hashCode()) * 31) + this.service.hashCode()) * 31) + this.params.hashCode()) * 31) + this.logVersion.hashCode()) * 31) + this.company.hashCode();
    }

    public final CustomizableLog onExtraCallbackWithResult(@Nullable Long l, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Map<String, Object> map, @NotNull String str4, @NotNull String str5) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        CustomizableLog customizableLog = new CustomizableLog(l, str, str2, str3, map, str4, str5);
        int i2 = onExtraCallbackWithResult + 75;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 21 / 0;
        }
        return customizableLog;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CustomizableLog(schemaId=" + this.schemaId + ", logName=" + this.logName + ", logType=" + this.logType + ", service=" + this.service + ", params=" + this.params + ", logVersion=" + this.logVersion + ", company=" + this.company + ")";
        int i2 = onWarmupCompleted + 91;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 29 / 0;
        }
        return str;
    }

    public static final class Companion {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CustomizableLog> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 13;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                CustomizableLog$.serializer serializerVar = CustomizableLog$.serializer.INSTANCE;
                throw null;
            }
            CustomizableLog$.serializer serializerVar2 = CustomizableLog$.serializer.INSTANCE;
            int i3 = onWarmupCompleted + 11;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                return serializerVar2;
            }
            throw null;
        }
    }

    static {
        getInterfaceDescriptor();
        Companion = new Companion(null);
        $childSerializers = new Lazy[]{null, null, null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.core.tracker.entry.CustomizableLog$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 33;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerAsBinder = CustomizableLog.asBinder();
                if (i3 != 0) {
                    int i4 = 29 / 0;
                }
                return kSerializerAsBinder;
            }
        }), null, null};
        int i = onNavigationEvent + 33;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 55 / 0;
        }
    }

    public /* synthetic */ CustomizableLog(int i, Long l, String str, String str2, String str3, Map map, String str4, String str5, okycx okycxVar) throws Throwable {
        if ((i & 1) == 0) {
            int i2 = 2 % 2;
            l = null;
        }
        this.schemaId = l;
        if ((i & 2) == 0) {
            int i3 = onExtraCallbackWithResult + 85;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            this.logName = "";
            int i5 = 2 % 2;
        } else {
            this.logName = str;
        }
        if ((i & 4) == 0) {
            int i6 = onWarmupCompleted + 31;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            this.logType = "";
        } else {
            this.logType = str2;
        }
        if ((i & 8) == 0) {
            this.service = "";
        } else {
            this.service = str3;
        }
        if ((i & 16) == 0) {
            this.params = new LinkedHashMap();
        } else {
            this.params = map;
        }
        if ((i & 32) == 0) {
            int i8 = onExtraCallbackWithResult + 9;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            Object[] objArr = new Object[1];
            a(new char[]{39408}, Color.rgb(0, 0, 0) + 16778873, objArr);
            this.logVersion = ((String) objArr[0]).intern();
            int i10 = 2 % 2;
        } else {
            this.logVersion = str4;
        }
        if ((i & 64) != 0) {
            this.company = str5;
            return;
        }
        this.company = GetFeatureExtension.onWarmupCompleted.asBinder();
        int i11 = onExtraCallbackWithResult + 19;
        onWarmupCompleted = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 20 / 0;
        }
    }

    public CustomizableLog(@Nullable Long l, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Map<String, Object> map, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.schemaId = l;
        this.logName = str;
        this.logType = str2;
        this.service = str3;
        this.params = map;
        this.logVersion = str4;
        this.company = str5;
    }

    public static final /* synthetic */ Lazy[] onTransact() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (i3 != 0) {
            int i4 = 49 / 0;
        }
        return lazyArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onWarmupCompleted(CustomizableLog customizableLog, vyl vylVar, SerialDescriptor serialDescriptor) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 119;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 0, oty1.onExtraCallback, customizableLog.schemaId);
        } else {
            int i4 = onExtraCallbackWithResult + 105;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            if (customizableLog.schemaId != null) {
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 1) || !Intrinsics.areEqual(customizableLog.logName, "")) {
            vylVar.onExtraCallback(serialDescriptor, 1, customizableLog.logName);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
            int i6 = onExtraCallbackWithResult + 53;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                Intrinsics.areEqual(customizableLog.logType, "");
                throw null;
            }
            if (!Intrinsics.areEqual(customizableLog.logType, "")) {
                vylVar.onExtraCallback(serialDescriptor, 2, customizableLog.logType);
                int i7 = onExtraCallbackWithResult + 63;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 3) || !Intrinsics.areEqual(customizableLog.service, "")) {
            vylVar.onExtraCallback(serialDescriptor, 3, customizableLog.service);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 4) || !Intrinsics.areEqual(customizableLog.onNavigationEvent(), new LinkedHashMap())) {
            vylVar.onNavigationEvent(serialDescriptor, 4, (py) lazyArr[4].getValue(), customizableLog.onNavigationEvent());
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 5)) {
            int i9 = onWarmupCompleted + 89;
            onExtraCallbackWithResult = i9 % 128;
            if (i9 % 2 == 0) {
                String str = customizableLog.logVersion;
                a(new char[]{39408}, 8153 - TextUtils.indexOf("", "", 1, 0), new Object[1]);
                if (!Intrinsics.areEqual(str, ((String) r6[0]).intern())) {
                    vylVar.onExtraCallback(serialDescriptor, 5, customizableLog.logVersion);
                }
            } else {
                String str2 = customizableLog.logVersion;
                a(new char[]{39408}, TextUtils.indexOf("", "", 0, 0) + 1657, new Object[1]);
                if (!Intrinsics.areEqual(str2, ((String) r6[0]).intern())) {
                }
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 6)) {
            int i10 = onExtraCallbackWithResult + 1;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
            if (Intrinsics.areEqual(customizableLog.company, GetFeatureExtension.onWarmupCompleted.asBinder())) {
                return;
            }
        }
        vylVar.onExtraCallback(serialDescriptor, 6, customizableLog.company);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CustomizableLog(Long l, String str, String str2, String str3, Map map, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) throws Throwable {
        String str6;
        String str7;
        Object obj = null;
        if ((i & 1) != 0) {
            int i2 = onExtraCallbackWithResult + 93;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 % 2;
            }
            l = null;
        }
        String str8 = "";
        if ((i & 2) != 0) {
            int i4 = onExtraCallbackWithResult + 113;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            str6 = "";
        } else {
            str6 = str;
        }
        if ((i & 4) != 0) {
            int i6 = 2 % 2;
            str7 = "";
        } else {
            str7 = str2;
        }
        if ((i & 8) != 0) {
            int i7 = onExtraCallbackWithResult + 5;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
        } else {
            str8 = str3;
        }
        Map linkedHashMap = (i & 16) != 0 ? new LinkedHashMap() : map;
        if ((i & 32) != 0) {
            Object[] objArr = new Object[1];
            a(new char[]{39408}, 1657 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr);
            str4 = ((String) objArr[0]).intern();
        }
        this(l, str6, str7, str8, linkedHashMap, str4, (i & 64) != 0 ? GetFeatureExtension.onWarmupCompleted.asBinder() : str5);
    }

    public final Long access000() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 13;
        onExtraCallbackWithResult = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        Long l = this.schemaId;
        int i4 = i2 + 27;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return l;
        }
        obj.hashCode();
        throw null;
    }

    public final String IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 77;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = this.logName;
        int i5 = i2 + 65;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 31;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String str = this.logType;
        if (i3 == 0) {
            int i4 = 60 / 0;
        }
        return str;
    }

    @Override // o.downloadZip
    public Map<String, Object> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 115;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Map<String, Object> map = this.params;
        int i5 = i2 + 87;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return map;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String access100() {
        String str;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 != 0) {
            str = this.logVersion;
            int i4 = 32 / 0;
        } else {
            str = this.logVersion;
        }
        int i5 = i3 + 79;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        CustomizableLog customizableLog = (CustomizableLog) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 87;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        String str = customizableLog.company;
        int i5 = i3 + 81;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CustomizableLog(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Map<String, Object> map, @NotNull String str4, @NotNull String str5) {
        String str6;
        Long longOrNull;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Object obj = map.get("schema_id");
        if (!(obj instanceof String)) {
            int i = 2 % 2;
            str6 = null;
        } else {
            int i2 = onWarmupCompleted + 83;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            str6 = (String) obj;
        }
        if (str6 != null) {
            int i4 = onWarmupCompleted + 5;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                StringsKt.toLongOrNull(str6);
                throw null;
            }
            int i5 = 2 % 2;
            longOrNull = StringsKt.toLongOrNull(str6);
        } else {
            longOrNull = null;
        }
        this(longOrNull, str, str2, str3, map, str4, str5);
    }

    @Override // o.downloadZip
    public void IAuthTabCallbackDefault() {
        int i = 2 % 2;
        String str = this.logType;
        if (str.length() == 0) {
            int i2 = onWarmupCompleted + 15;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 123;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            str = "log";
        }
        downloadZip.onExtraCallback(this, str, this.logName, this.schemaId, null, null, 24, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    @Override // o.aq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onExtraCallbackWithResult(boolean z, @NotNull access13800<? super InterfaceC0059deInitialize> access13800Var) throws Throwable {
        onExtraCallbackWithResult onextracallbackwithresult;
        String str;
        Object obj;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 53;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        if (access13800Var instanceof onExtraCallbackWithResult) {
            onextracallbackwithresult = (onExtraCallbackWithResult) access13800Var;
            int i4 = onextracallbackwithresult.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = onExtraCallbackWithResult + 45;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    onextracallbackwithresult.label = i4 * Integer.MIN_VALUE;
                } else {
                    onextracallbackwithresult.label = i4 - 2147483648;
                }
            } else {
                onextracallbackwithresult = new onExtraCallbackWithResult(access13800Var);
            }
        }
        onExtraCallbackWithResult onextracallbackwithresult2 = onextracallbackwithresult;
        Object objOnExtraCallback = onextracallbackwithresult2.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i6 = onextracallbackwithresult2.label;
        if (i6 != 0) {
            int i7 = onExtraCallbackWithResult + 41;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(objOnExtraCallback);
        } else {
            ResultKt.onNavigationEvent(objOnExtraCallback);
            DetectFaceInSingleImage.onNavigationEvent onnavigationevent = new DetectFaceInSingleImage.onNavigationEvent(this.schemaId, this.logName, this.logType);
            Map<String, Object> mapOnNavigationEvent = onNavigationEvent();
            String str2 = this.company;
            onextracallbackwithresult2.Z$0 = z;
            onextracallbackwithresult2.label = 1;
            objOnExtraCallback = onExtraCallback(onnavigationevent, mapOnNavigationEvent, false, str2, z, onextracallbackwithresult2);
            if (objOnExtraCallback == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        }
        Map map = (Map) objOnExtraCallback;
        String string = this.service;
        if (string.length() == 0 && ((obj = map.get("category")) == null || (string = obj.toString()) == null)) {
            string = "common";
        }
        String str3 = string;
        String strIntern = this.logVersion;
        if (strIntern.length() == 0) {
            Object objRemove = map.remove("log_version");
            String str4 = null;
            if (objRemove instanceof String) {
                int i9 = onWarmupCompleted + 105;
                onExtraCallbackWithResult = i9 % 128;
                if (i9 % 2 == 0) {
                    str4.hashCode();
                    throw null;
                }
                str4 = (String) objRemove;
            }
            if (str4 == null) {
                Object[] objArr = new Object[1];
                a(new char[]{39408}, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1656, objArr);
                strIntern = ((String) objArr[0]).intern();
                str = strIntern;
            } else {
                str = str4;
            }
        } else {
            str = strIntern;
        }
        AppEventPayloadV3 appEventPayloadV3 = new AppEventPayloadV3(this.schemaId, this.logName, this.logType, str3, map, (String) null, onExtraCallbackWithResult(), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, this.company, (String) null, (String) null, (Long) null, str, (String) null, (Referrer) null, (String) null, (String) null, 4054944, (DefaultConstructorMarker) null);
        int i10 = onWarmupCompleted + 119;
        onExtraCallbackWithResult = i10 % 128;
        int i11 = i10 % 2;
        return appEventPayloadV3;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = $11 + 37;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Drawable.resolveOpacity(0, 0), TextUtils.indexOf((CharSequence) "", '0', 0) + 25, 19628 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onExtraCallback ^ 5407414049857832247L);
                try {
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 59, View.getDefaultSize(0, 0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
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
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i6 = $10 + 121;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                try {
                    Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.alpha(0), (ViewConfiguration.getLongPressTimeout() >> 16) + 59, 6383 - ExpandableListView.getPackedPositionType(0L), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    int i7 = 22 / 0;
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            } else {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 59 - (ViewConfiguration.getTouchSlop() >> 8), 6382 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
        }
        objArr[0] = new String(cArr2);
    }

    private static final /* synthetic */ KSerializer readTypedObject() {
        return (KSerializer) onWarmupCompleted(setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[0], setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), 1811458177, setApTextSize.onNavigationEvent.4.onNavigationEvent(), -1811458177);
    }

    public final String asInterface() {
        return (String) onWarmupCompleted(setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{this}, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), -1940829915, setApTextSize.onNavigationEvent.4.onNavigationEvent(), 1940829916);
    }

    static void getInterfaceDescriptor() {
        onExtraCallback = 6142448132665842934L;
    }
}
