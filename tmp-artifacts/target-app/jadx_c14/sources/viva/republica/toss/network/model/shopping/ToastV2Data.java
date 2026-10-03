package viva.republica.toss.network.model.shopping;

import im.toss.features.foreigner.home.ui.test.ForeignerHomeTestScreenKt$;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.GetMotionInteractionState;
import o.TombstoneProtosMemoryMappingBuilder;
import o.getMutilBackgroundDrawable;
import o.getWriggleLayout;
import o.liq;
import o.okycx;
import o.sp;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.shopping.ToastV2Data$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ToastV2Data {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final String buttonUrl;
    private final Integer duration;
    private final String gradientEndColor;
    private final String gradientStartColor;
    private final String imageShapeType;
    private final String imageUrl;
    private final Map<String, Object> logExtraInfo;
    private final String logType;
    private final String messageText;
    private final int percent;
    private final String service;
    private final String subtitle;
    private final String tabId;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.shopping.ToastV2Data$$ExternalSyntheticLambda0
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 113;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializer = (KSerializer) ToastV2Data.onNavigationEvent(new Object[0], -1812752830, 1812752830, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted());
            int i4 = onNavigationEvent + 73;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return kSerializer;
        }
    }), null, null, null, null, null, null, null};

    public ToastV2Data() {
        this((String) null, (String) null, (String) null, (Integer) null, (String) null, (Map) null, (String) null, (String) null, (String) null, 0, (String) null, (String) null, (String) null, 8191, (DefaultConstructorMarker) null);
    }

    private static final /* synthetic */ KSerializer access100() {
        int i = 2 % 2;
        getMutilBackgroundDrawable getmutilbackgrounddrawable = new getMutilBackgroundDrawable(getWriggleLayout.onNavigationEvent, sp.IAuthTabCallback(GetMotionInteractionState.onExtraCallback));
        int i2 = onExtraCallback + 69;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return getmutilbackgrounddrawable;
    }

    public static /* synthetic */ Object onNavigationEvent(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~(i7 | i5);
        int i9 = ~i;
        int i10 = (~(i9 | i2)) | i8;
        int i11 = ~i5;
        int i12 = i11 | i2;
        int i13 = i10 | (~i12);
        int i14 = i7 | i;
        int i15 = i8 | (~i14);
        int i16 = (~(i5 | i14)) | (~(i7 | i9 | i11)) | (~(i12 | i));
        int i17 = i2 + i + i3 + ((-1254723898) * i4) + ((-1667789834) * i6);
        int i18 = i17 * i17;
        int i19 = ((-534547663) * i2) + 1379663872 + ((-481802647) * i) + ((-17581672) * i13) + (35163344 * i15) + (17581672 * i16) + ((-499384320) * i3) + ((-1033371648) * i4) + ((-106430464) * i6) + (1552875520 * i18);
        int i20 = ((i2 * (-402395399)) - 1316031342) + (i * (-402392591)) + (i13 * (-936)) + (i15 * 1872) + (i16 * 936) + (i3 * (-402393527)) + (i4 * (-1219896714)) + (i6 * (-610841306)) + (i18 * (-825819136));
        int i21 = i19 + (i20 * i20 * (-1063190528));
        if (i21 != 1) {
            return i21 != 2 ? onWarmupCompleted(objArr) : IAuthTabCallback(objArr);
        }
        ToastV2Data toastV2Data = (ToastV2Data) objArr[0];
        int i22 = 2 % 2;
        int i23 = onExtraCallback;
        int i24 = i23 + 85;
        onWarmupCompleted = i24 % 128;
        int i25 = i24 % 2;
        String str = toastV2Data.service;
        int i26 = i23 + 55;
        onWarmupCompleted = i26 % 128;
        int i27 = i26 % 2;
        return str;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 111;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            access100();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        KSerializer kSerializerAccess100 = access100();
        int i3 = onWarmupCompleted + 29;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerAccess100;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if ((r6 instanceof viva.republica.toss.network.model.shopping.ToastV2Data) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r6 = (viva.republica.toss.network.model.shopping.ToastV2Data) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.messageText, r6.messageText) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        r6 = viva.republica.toss.network.model.shopping.ToastV2Data.onExtraCallback + 51;
        viva.republica.toss.network.model.shopping.ToastV2Data.onWarmupCompleted = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if ((r6 % 2) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.imageUrl, r6.imageUrl) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        r6 = viva.republica.toss.network.model.shopping.ToastV2Data.onExtraCallback + 119;
        viva.republica.toss.network.model.shopping.ToastV2Data.onWarmupCompleted = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0052, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.buttonUrl, r6.buttonUrl) == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0065, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.duration, r6.duration) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0067, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0070, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.logType, r6.logType) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0072, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007b, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.logExtraInfo, r6.logExtraInfo) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0086, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.subtitle, r6.subtitle) != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0088, code lost:
    
        r6 = viva.republica.toss.network.model.shopping.ToastV2Data.onWarmupCompleted + 83;
        viva.republica.toss.network.model.shopping.ToastV2Data.onExtraCallback = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0091, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009a, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.gradientStartColor, r6.gradientStartColor) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a5, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.gradientEndColor, r6.gradientEndColor) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a7, code lost:
    
        r6 = viva.republica.toss.network.model.shopping.ToastV2Data.onWarmupCompleted + 81;
        viva.republica.toss.network.model.shopping.ToastV2Data.onExtraCallback = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b0, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b5, code lost:
    
        if (r5.percent == r6.percent) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b7, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c0, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.tabId, r6.tabId) == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ca, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.service, r6.service) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00cc, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d5, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.imageShapeType, r6.imageShapeType) != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d7, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d8, code lost:
    
        r6 = viva.republica.toss.network.model.shopping.ToastV2Data.onWarmupCompleted + 85;
        viva.republica.toss.network.model.shopping.ToastV2Data.onExtraCallback = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00e1, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e2, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r2 = r2 + 119;
        viva.republica.toss.network.model.shopping.ToastV2Data.onExtraCallback = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r6) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.shopping.ToastV2Data.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f A[PHI: r1 r3
      0x002f: PHI (r1v32 int) = (r1v5 int), (r1v34 int) binds: [B:8:0x0022, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]
      0x002f: PHI (r3v6 java.lang.String) = (r3v0 java.lang.String), (r3v8 java.lang.String) binds: [B:8:0x0022, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[PHI: r1
      0x0024: PHI (r1v6 int) = (r1v5 int), (r1v34 int) binds: [B:8:0x0022, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.shopping.ToastV2Data.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ToastV2Data(messageText=" + this.messageText + ", imageUrl=" + this.imageUrl + ", buttonUrl=" + this.buttonUrl + ", duration=" + this.duration + ", logType=" + this.logType + ", logExtraInfo=" + this.logExtraInfo + ", subtitle=" + this.subtitle + ", gradientStartColor=" + this.gradientStartColor + ", gradientEndColor=" + this.gradientEndColor + ", percent=" + this.percent + ", tabId=" + this.tabId + ", service=" + this.service + ", imageShapeType=" + this.imageShapeType + ")";
        int i2 = onExtraCallback + 117;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 71 / 0;
        }
        return str;
    }

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ToastV2Data> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 55;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            ToastV2Data$.serializer serializerVar = ToastV2Data$.serializer.INSTANCE;
            int i4 = onExtraCallback + 65;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 26 / 0;
            }
            return serializerVar;
        }
    }

    static {
        int i = onExtraCallbackWithResult + 49;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ ToastV2Data(int i, String str, String str2, String str3, Integer num, String str4, Map map, String str5, String str6, String str7, int i2, String str8, String str9, String str10, okycx okycxVar) {
        this.messageText = (i & 1) == 0 ? "" : str;
        Object obj = null;
        if ((i & 2) == 0) {
            this.imageUrl = null;
            int i3 = onWarmupCompleted + 95;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 2 % 2;
            }
        } else {
            this.imageUrl = str2;
        }
        if ((i & 4) == 0) {
            int i5 = onExtraCallback + 101;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            this.buttonUrl = null;
            if (i6 == 0) {
                obj.hashCode();
                throw null;
            }
        } else {
            this.buttonUrl = str3;
            int i7 = 2 % 2;
        }
        if ((i & 8) == 0) {
            this.duration = null;
        } else {
            this.duration = num;
        }
        if ((i & 16) == 0) {
            this.logType = null;
        } else {
            this.logType = str4;
        }
        if ((i & 32) == 0) {
            this.logExtraInfo = null;
        } else {
            this.logExtraInfo = map;
        }
        if ((i & 64) == 0) {
            this.subtitle = null;
            int i8 = 2 % 2;
        } else {
            this.subtitle = str5;
        }
        if ((i & 128) == 0) {
            int i9 = onWarmupCompleted + 89;
            int i10 = i9 % 128;
            onExtraCallback = i10;
            int i11 = i9 % 2;
            this.gradientStartColor = null;
            int i12 = i10 + 71;
            onWarmupCompleted = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 2 % 2;
            }
        } else {
            this.gradientStartColor = str6;
        }
        if ((i & 256) == 0) {
            this.gradientEndColor = null;
        } else {
            this.gradientEndColor = str7;
        }
        this.percent = (i & 512) == 0 ? 50 : i2;
        if ((i & 1024) == 0) {
            this.tabId = null;
            int i14 = 2 % 2;
        } else {
            this.tabId = str8;
        }
        if ((i & 2048) == 0) {
            this.service = null;
        } else {
            this.service = str9;
        }
        if ((i & 4096) != 0) {
            this.imageShapeType = str10;
            return;
        }
        int i15 = onExtraCallback + 97;
        onWarmupCompleted = i15 % 128;
        int i16 = i15 % 2;
        this.imageShapeType = null;
    }

    public ToastV2Data(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable String str4, @Nullable Map<String, ? extends Object> map, @Nullable String str5, @Nullable String str6, @Nullable String str7, int i, @Nullable String str8, @Nullable String str9, @Nullable String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        this.messageText = str;
        this.imageUrl = str2;
        this.buttonUrl = str3;
        this.duration = num;
        this.logType = str4;
        this.logExtraInfo = map;
        this.subtitle = str5;
        this.gradientStartColor = str6;
        this.gradientEndColor = str7;
        this.percent = i;
        this.tabId = str8;
        this.service = str9;
        this.imageShapeType = str10;
    }

    public static final /* synthetic */ Lazy[] onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 29;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i3 + 119;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return lazyArr;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f5  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onNavigationEvent(viva.republica.toss.network.model.shopping.ToastV2Data r7, o.vyl r8, kotlinx.serialization.descriptors.SerialDescriptor r9) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.shopping.ToastV2Data.onNavigationEvent(viva.republica.toss.network.model.shopping.ToastV2Data, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ToastV2Data(String str, String str2, String str3, Integer num, String str4, Map map, String str5, String str6, String str7, int i, String str8, String str9, String str10, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        String str11;
        Integer num2;
        Map map2;
        int i3;
        String str12;
        String str13 = (i2 & 1) != 0 ? "" : str;
        if ((i2 & 2) != 0) {
            int i4 = 2 % 2;
            str11 = null;
        } else {
            str11 = str2;
        }
        String str14 = (i2 & 4) != 0 ? null : str3;
        if ((i2 & 8) != 0) {
            int i5 = onWarmupCompleted + 87;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
            num2 = null;
        } else {
            num2 = num;
        }
        String str15 = (i2 & 16) != 0 ? null : str4;
        if ((i2 & 32) != 0) {
            int i7 = onWarmupCompleted + 13;
            onExtraCallback = i7 % 128;
            if (i7 % 2 != 0) {
                str.hashCode();
                throw null;
            }
            map2 = null;
        } else {
            map2 = map;
        }
        String str16 = (i2 & 64) != 0 ? null : str5;
        String str17 = (i2 & 128) != 0 ? null : str6;
        String str18 = (i2 & 256) != 0 ? null : str7;
        if ((i2 & 512) != 0) {
            int i8 = 2 % 2;
            i3 = 50;
        } else {
            i3 = i;
        }
        if ((i2 & 1024) != 0) {
            int i9 = 2 % 2;
            str12 = null;
        } else {
            str12 = str8;
        }
        this(str13, str11, str14, num2, str15, map2, str16, str17, str18, i3, str12, (i2 & 2048) != 0 ? null : str9, (i2 & 4096) == 0 ? str10 : null);
    }

    public final String onTransact() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 91;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return this.messageText;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String asInterface() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 9;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.imageUrl;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 77;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = this.buttonUrl;
        if (i3 != 0) {
            int i4 = 50 / 0;
        }
        return str;
    }

    public final String asBinder() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 89;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.logType;
        int i5 = i3 + 125;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 83 / 0;
        }
        return str;
    }

    public final Map<String, Object> IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        Map<String, Object> map = this.logExtraInfo;
        int i5 = i3 + 105;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    public final String access000() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 69;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = this.subtitle;
        if (i3 != 0) {
            int i4 = 20 / 0;
        }
        return str;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return this.gradientStartColor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 5;
        onWarmupCompleted = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.gradientEndColor;
        int i4 = i2 + 19;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        ToastV2Data toastV2Data = (ToastV2Data) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 79;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        int i5 = toastV2Data.percent;
        int i6 = i3 + 33;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 != 0) {
            return Integer.valueOf(i5);
        }
        throw null;
    }

    public final String IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 77;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = this.tabId;
        int i5 = i2 + 1;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 125;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.imageShapeType;
        int i4 = i3 + 123;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ KSerializer onWarmupCompleted() {
        return (KSerializer) onNavigationEvent(new Object[0], -1812752830, 1812752830, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted());
    }

    public final int IAuthTabCallbackStubProxy() {
        return ((Integer) onNavigationEvent(new Object[]{this}, -435793120, 435793122, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted())).intValue();
    }

    public final String getInterfaceDescriptor() {
        return (String) onNavigationEvent(new Object[]{this}, 1937736350, -1937736349, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted());
    }
}
