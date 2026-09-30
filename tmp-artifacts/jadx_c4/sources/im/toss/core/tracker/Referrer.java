package im.toss.core.tracker;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.core.tracker.entry.CustomizableLog;
import im.toss.core.tracker.entry.TrackEvent;
import im.toss.core.tracker.entry.TrackLog;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.clearFaultAdjacentMetadata;
import o.downloadZip;
import o.getWriggleLayout;
import o.liq;
import o.okycx;
import o.oty1;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class Referrer {
    public static final Companion Companion;
    private static int IAuthTabCallback;
    private static final Set<String> ORGANIC_TOSS_REFERRER_VALUES;
    private static byte[] onExtraCallback;
    private static short[] onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static int onTransact;
    private static int onWarmupCompleted;
    private String tossReferrer;
    private String tossReferrerTemplateKey;
    private String tossServiceReferrerActType;
    private String tossServiceReferrerClickLogName;
    private Long tossServiceReferrerClickSchemaId;
    private Long tossServiceReferrerScreenSchemaId;
    private String tossServiceReferrerText;
    private static final byte[] $$a = {121, -58, 81, 67};
    private static final int $$b = 206;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int asInterface = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, int i2, byte b) {
        int i3;
        int i4 = 4 - (i * 2);
        int i5 = (b * 2) + 115;
        int i6 = i2 * 2;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i6 + 1];
        if (bArr == null) {
            int i7 = i6;
            i3 = 0;
            i4++;
            i5 += i7;
            bArr2[i3] = (byte) i5;
            if (i3 == i6) {
                return new String(bArr2, 0);
            }
            i3++;
            i7 = bArr[i4];
            i4++;
            i5 += i7;
            bArr2[i3] = (byte) i5;
            if (i3 == i6) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i5;
            if (i3 == i6) {
            }
        }
    }

    public Referrer() {
        this((String) null, (String) null, (String) null, (Long) null, (Long) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ Referrer onNavigationEvent(Referrer referrer, String str, String str2, String str3, Long l, Long l2, String str4, String str5, int i, Object obj) {
        String str6;
        String str7;
        String str8;
        int i2 = 2 % 2;
        String str9 = (i & 1) != 0 ? referrer.tossReferrer : str;
        String str10 = (i & 2) != 0 ? referrer.tossReferrerTemplateKey : str2;
        if ((i & 4) != 0) {
            int i3 = asBinder + 9;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 == 0) {
                String str11 = referrer.tossServiceReferrerActType;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str6 = referrer.tossServiceReferrerActType;
        } else {
            str6 = str3;
        }
        Long l3 = (i & 8) != 0 ? referrer.tossServiceReferrerScreenSchemaId : l;
        Long l4 = (i & 16) != 0 ? referrer.tossServiceReferrerClickSchemaId : l2;
        if ((i & 32) != 0) {
            str7 = referrer.tossServiceReferrerClickLogName;
            int i4 = IAuthTabCallbackDefault + 31;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
        } else {
            str7 = str4;
        }
        if ((i & 64) != 0) {
            int i6 = asBinder + 29;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
            str8 = referrer.tossServiceReferrerText;
        } else {
            str8 = str5;
        }
        return referrer.onExtraCallback(str9, str10, str6, l3, l4, str7, str8);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Referrer)) {
            int i2 = IAuthTabCallbackDefault + 49;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        Referrer referrer = (Referrer) obj;
        if (!Intrinsics.areEqual(this.tossReferrer, referrer.tossReferrer)) {
            int i4 = asBinder + 57;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.tossReferrerTemplateKey, referrer.tossReferrerTemplateKey)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.tossServiceReferrerActType, referrer.tossServiceReferrerActType)) {
            int i6 = IAuthTabCallbackDefault + 1;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.tossServiceReferrerScreenSchemaId, referrer.tossServiceReferrerScreenSchemaId)) {
            int i8 = IAuthTabCallbackDefault + 29;
            asBinder = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.tossServiceReferrerClickSchemaId, referrer.tossServiceReferrerClickSchemaId)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.tossServiceReferrerClickLogName, referrer.tossServiceReferrerClickLogName)) {
            int i10 = IAuthTabCallbackDefault + 41;
            asBinder = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.tossServiceReferrerText, referrer.tossServiceReferrerText)) {
            return true;
        }
        int i12 = asBinder + 23;
        IAuthTabCallbackDefault = i12 % 128;
        int i13 = i12 % 2;
        return false;
    }

    public int hashCode() {
        String str;
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 113;
        asBinder = i2 % 128;
        int iHashCode3 = (i2 % 2 == 0 ? (str = this.tossReferrer) != null : (str = this.tossReferrer) != null) ? str.hashCode() : 0;
        String str2 = this.tossReferrerTemplateKey;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.tossServiceReferrerActType;
        if (str3 == null) {
            int i3 = IAuthTabCallbackDefault + 57;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str3.hashCode();
        }
        Long l = this.tossServiceReferrerScreenSchemaId;
        int iHashCode5 = l == null ? 0 : l.hashCode();
        Long l2 = this.tossServiceReferrerClickSchemaId;
        if (l2 == null) {
            int i5 = asBinder + 11;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = l2.hashCode();
        }
        String str4 = this.tossServiceReferrerClickLogName;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.tossServiceReferrerText;
        return (((((((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode) * 31) + iHashCode5) * 31) + iHashCode2) * 31) + iHashCode6) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    public final Referrer onExtraCallback(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Long l, @Nullable Long l2, @Nullable String str4, @Nullable String str5) {
        int i = 2 % 2;
        Referrer referrer = new Referrer(str, str2, str3, l, l2, str4, str5);
        int i2 = asBinder + 111;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        return referrer;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Referrer(tossReferrer=" + this.tossReferrer + ", tossReferrerTemplateKey=" + this.tossReferrerTemplateKey + ", tossServiceReferrerActType=" + this.tossServiceReferrerActType + ", tossServiceReferrerScreenSchemaId=" + this.tossServiceReferrerScreenSchemaId + ", tossServiceReferrerClickSchemaId=" + this.tossServiceReferrerClickSchemaId + ", tossServiceReferrerClickLogName=" + this.tossServiceReferrerClickLogName + ", tossServiceReferrerText=" + this.tossServiceReferrerText + ")";
        int i2 = IAuthTabCallbackDefault + 69;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public /* synthetic */ Referrer(int i, String str, String str2, String str3, Long l, Long l2, String str4, String str5, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.tossReferrer = null;
        } else {
            this.tossReferrer = str;
            int i2 = asBinder + 29;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        if ((i & 2) == 0) {
            int i5 = asBinder + 61;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            this.tossReferrerTemplateKey = null;
            if (i6 == 0) {
                throw null;
            }
        } else {
            this.tossReferrerTemplateKey = str2;
            int i7 = 2 % 2;
        }
        if ((i & 4) == 0) {
            this.tossServiceReferrerActType = null;
        } else {
            this.tossServiceReferrerActType = str3;
        }
        if ((i & 8) == 0) {
            this.tossServiceReferrerScreenSchemaId = null;
            int i8 = asBinder + 125;
            IAuthTabCallbackDefault = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
        } else {
            this.tossServiceReferrerScreenSchemaId = l;
        }
        if ((i & 16) == 0) {
            this.tossServiceReferrerClickSchemaId = null;
        } else {
            this.tossServiceReferrerClickSchemaId = l2;
        }
        if ((i & 32) == 0) {
            this.tossServiceReferrerClickLogName = null;
        } else {
            this.tossServiceReferrerClickLogName = str4;
            int i11 = 2 % 2;
        }
        if ((i & 64) == 0) {
            this.tossServiceReferrerText = null;
        } else {
            this.tossServiceReferrerText = str5;
        }
    }

    public Referrer(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Long l, @Nullable Long l2, @Nullable String str4, @Nullable String str5) {
        this.tossReferrer = str;
        this.tossReferrerTemplateKey = str2;
        this.tossServiceReferrerActType = str3;
        this.tossServiceReferrerScreenSchemaId = l;
        this.tossServiceReferrerClickSchemaId = l2;
        this.tossServiceReferrerClickLogName = str4;
        this.tossServiceReferrerText = str5;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009b  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onWarmupCompleted(Referrer referrer, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0) || referrer.tossReferrer != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, referrer.tossReferrer);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            int i2 = asBinder + 87;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 == 0) {
                String str = referrer.tossReferrerTemplateKey;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (referrer.tossReferrerTemplateKey != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, referrer.tossReferrerTemplateKey);
                int i3 = IAuthTabCallbackDefault + 77;
                asBinder = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 4 / 3;
                }
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 2) || referrer.tossServiceReferrerActType != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, referrer.tossServiceReferrerActType);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 3)) {
            int i5 = IAuthTabCallbackDefault + 101;
            asBinder = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 0 / 0;
                if (referrer.tossServiceReferrerScreenSchemaId != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 3, oty1.onExtraCallback, referrer.tossServiceReferrerScreenSchemaId);
                    int i7 = IAuthTabCallbackDefault + 3;
                    asBinder = i7 % 128;
                    if (i7 % 2 != 0) {
                        int i8 = 2 / 3;
                    }
                }
            } else if (referrer.tossServiceReferrerScreenSchemaId != null) {
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 4)) {
            int i9 = asBinder + 85;
            IAuthTabCallbackDefault = i9 % 128;
            int i10 = i9 % 2;
            if (referrer.tossServiceReferrerClickSchemaId != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 4, oty1.onExtraCallback, referrer.tossServiceReferrerClickSchemaId);
            }
        }
        if (!(!vylVar.onWarmupCompleted(serialDescriptor, 5)) || referrer.tossServiceReferrerClickLogName != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 5, getWriggleLayout.onNavigationEvent, referrer.tossServiceReferrerClickLogName);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 6) || referrer.tossServiceReferrerText != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 6, getWriggleLayout.onNavigationEvent, referrer.tossServiceReferrerText);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Referrer(String str, String str2, String str3, Long l, Long l2, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str6;
        String str7;
        Long l3;
        Long l4;
        String str8;
        String str9 = null;
        String str10 = (i & 1) != 0 ? null : str;
        if ((i & 2) != 0) {
            int i2 = IAuthTabCallbackDefault + 13;
            int i3 = i2 % 128;
            asBinder = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 123;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            str6 = null;
        } else {
            str6 = str2;
        }
        if ((i & 4) != 0) {
            int i8 = asBinder + 41;
            IAuthTabCallbackDefault = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 93 / 0;
            }
            int i10 = 2 % 2;
            str7 = null;
        } else {
            str7 = str3;
        }
        if ((i & 8) != 0) {
            int i11 = asBinder + 5;
            IAuthTabCallbackDefault = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 90 / 0;
            }
            l3 = null;
        } else {
            l3 = l;
        }
        if ((i & 16) != 0) {
            int i13 = IAuthTabCallbackDefault + 29;
            asBinder = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 63 / 0;
            }
            int i15 = 2 % 2;
            l4 = null;
        } else {
            l4 = l2;
        }
        if ((i & 32) != 0) {
            int i16 = asBinder + 59;
            IAuthTabCallbackDefault = i16 % 128;
            if (i16 % 2 == 0) {
                str9.hashCode();
                throw null;
            }
            str8 = null;
        } else {
            str8 = str4;
        }
        if ((i & 64) != 0) {
            int i17 = asBinder + 65;
            IAuthTabCallbackDefault = i17 % 128;
            int i18 = i17 % 2;
            int i19 = 2 % 2;
        } else {
            str9 = str5;
        }
        this(str10, str6, str7, l3, l4, str8, str9);
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 87;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.tossReferrer;
        int i4 = i2 + 95;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 34 / 0;
        }
        return str;
    }

    public final boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        if (this.tossReferrer != null) {
            return true;
        }
        int i2 = asBinder;
        int i3 = i2 + 13;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        if (this.tossServiceReferrerActType != null || this.tossServiceReferrerScreenSchemaId != null || this.tossServiceReferrerClickSchemaId != null) {
            return true;
        }
        int i5 = i2 + 37;
        int i6 = i5 % 128;
        IAuthTabCallbackDefault = i6;
        if (i5 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.tossServiceReferrerClickLogName != null || this.tossServiceReferrerText != null) {
            return true;
        }
        int i7 = i6 + 117;
        asBinder = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onExtraCallback(boolean z) {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 7;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        if (z) {
            int i5 = i2 + 37;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 99 / 0;
                if (!CollectionsKt.contains(ORGANIC_TOSS_REFERRER_VALUES, this.tossReferrer)) {
                    this.tossReferrer = null;
                }
            } else if (!CollectionsKt.contains(ORGANIC_TOSS_REFERRER_VALUES, this.tossReferrer)) {
            }
        }
        this.tossReferrerTemplateKey = null;
        this.tossServiceReferrerActType = null;
        this.tossServiceReferrerScreenSchemaId = null;
        this.tossServiceReferrerClickSchemaId = null;
        this.tossServiceReferrerClickLogName = null;
        this.tossServiceReferrerText = null;
    }

    public final void IAuthTabCallback(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 67;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.tossReferrer = str;
            this.tossReferrerTemplateKey = null;
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        this.tossReferrer = str;
        this.tossReferrerTemplateKey = null;
        int i3 = asBinder + 55;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void onExtraCallback(@NotNull String str, @Nullable String str2) {
        int i = 2 % 2;
        int i2 = asBinder + 53;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.tossReferrer = str;
        this.tossReferrerTemplateKey = str2;
        this.tossServiceReferrerActType = null;
        this.tossServiceReferrerScreenSchemaId = null;
        this.tossServiceReferrerClickSchemaId = null;
        this.tossServiceReferrerClickLogName = null;
        this.tossServiceReferrerText = null;
        int i4 = IAuthTabCallbackDefault + 113;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class Companion {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<Referrer> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 47;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Referrer$$serializer referrer$$serializer = Referrer$$serializer.INSTANCE;
            int i4 = onWarmupCompleted + 87;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return referrer$$serializer;
        }
    }

    static {
        onTransact = 1;
        onWarmupCompleted();
        Companion = new Companion(null);
        Object[] objArr = new Object[1];
        a((short) (ViewConfiguration.getJumpTapTimeout() >> 16), (byte) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) - 8), (-1804363322) - Color.green(0), 824308650 - KeyEvent.normalizeMetaState(0), (Process.myTid() >> 22) - 87, objArr);
        ORGANIC_TOSS_REFERRER_VALUES = clearFaultAdjacentMetadata.onExtraCallback(new String[]{"normal", ((String) objArr[0]).intern()});
        int i = asInterface + 119;
        onTransact = i % 128;
        if (i % 2 == 0) {
            int i2 = 38 / 0;
        }
    }

    public final void onNavigationEvent(@Nullable String str, @Nullable downloadZip downloadzip, @Nullable downloadZip downloadzip2) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 123;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        this.tossServiceReferrerActType = str;
        this.tossServiceReferrerScreenSchemaId = null;
        this.tossServiceReferrerClickSchemaId = null;
        this.tossServiceReferrerClickLogName = null;
        this.tossServiceReferrerText = null;
        if (downloadzip != null && (downloadzip instanceof TrackLog)) {
            int i5 = i3 + 3;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 == 0) {
                this.tossServiceReferrerScreenSchemaId = Long.valueOf(((TrackLog) downloadzip).getInterfaceDescriptor());
                throw null;
            }
            this.tossServiceReferrerScreenSchemaId = Long.valueOf(((TrackLog) downloadzip).getInterfaceDescriptor());
        }
        if (downloadzip2 != null) {
            int i6 = IAuthTabCallbackDefault + 119;
            int i7 = i6 % 128;
            asBinder = i7;
            int i8 = i6 % 2;
            if (downloadzip2 instanceof TrackLog) {
                this.tossServiceReferrerClickSchemaId = Long.valueOf(((TrackLog) downloadzip2).getInterfaceDescriptor());
                return;
            }
            if (downloadzip2 instanceof CustomizableLog) {
                int i9 = i7 + 9;
                IAuthTabCallbackDefault = i9 % 128;
                int i10 = i9 % 2;
                CustomizableLog customizableLog = (CustomizableLog) downloadzip2;
                this.tossServiceReferrerClickLogName = customizableLog.IAuthTabCallback_Parcel();
                Map<String, Object> mapOnNavigationEvent = customizableLog.onNavigationEvent();
                Object[] objArr = new Object[1];
                a((short) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (byte) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 55), ((Process.getThreadPriority(0) + 20) >> 6) - 1804363316, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 824308649, (-90) - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr);
                Object obj = mapOnNavigationEvent.get(((String) objArr[0]).intern());
                this.tossServiceReferrerText = obj != null ? obj.toString() : null;
                return;
            }
            if (downloadzip2 instanceof TrackEvent) {
                this.tossServiceReferrerClickLogName = ((TrackEvent) downloadzip2).getInterfaceDescriptor();
            }
        }
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        long j;
        int i4;
        int length;
        byte[] bArr;
        int i5 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onNavigationEvent)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - View.resolveSize(0, 0)), 42 - TextUtils.indexOf("", ""), 22439 - TextUtils.indexOf("", "", 0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            int i6 = iIntValue == -1 ? 1 : 0;
            long j2 = 0;
            if (i6 != 1) {
                j = -4629411779493505016L;
            } else {
                int i7 = $10 + 85;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                byte[] bArr2 = onExtraCallback;
                if (bArr2 != null) {
                    int length2 = bArr2.length;
                    byte[] bArr3 = new byte[length2];
                    int i9 = 0;
                    while (i9 < length2) {
                        Object[] objArr3 = {Integer.valueOf(bArr2[i9])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionChild(j2) + 12844), 55 - View.MeasureSpec.makeMeasureSpec(0, 0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2167, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr3[i9] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        i9++;
                        j2 = 0;
                    }
                    int i10 = $11 + 57;
                    $10 = i10 % 128;
                    if (i10 % 2 != 0) {
                        int i11 = 4 / 5;
                    }
                    bArr2 = bArr3;
                }
                if (bArr2 != null) {
                    byte[] bArr4 = onExtraCallback;
                    try {
                        Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onWarmupCompleted)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), ((byte) KeyEvent.getModifierMetaStateMask()) + 43, Color.green(0) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (bArr4[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                        j = -4629411779493505016L;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    j = -4629411779493505016L;
                    iIntValue = (short) (((short) (onExtraCallbackWithResult[i + ((int) (onWarmupCompleted ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (onWarmupCompleted ^ j)) + i6;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(IAuthTabCallback), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 86, 9566 - ExpandableListView.getPackedPositionChild(0L), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr5 = onExtraCallback;
                if (bArr5 != null) {
                    int i12 = $10 + 117;
                    $11 = i12 % 128;
                    if (i12 % 2 == 0) {
                        length = bArr5.length;
                        bArr = new byte[length];
                    } else {
                        length = bArr5.length;
                        bArr = new byte[length];
                    }
                    int i13 = 0;
                    while (i13 < length) {
                        int i14 = $10 + 17;
                        $11 = i14 % 128;
                        if (i14 % 2 == 0) {
                            bArr[i13] = (byte) (bArr5[i13] ^ (-4629411779493505016L));
                        } else {
                            bArr[i13] = (byte) (bArr5[i13] ^ (-4629411779493505016L));
                            i13++;
                        }
                    }
                    bArr5 = bArr;
                }
                boolean z = bArr5 != null;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (z) {
                        int i15 = $10 + 85;
                        $11 = i15 % 128;
                        if (i15 % 2 == 0) {
                            byte[] bArr6 = onExtraCallback;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent;
                            i4 = trackSelectionParametersExternalSyntheticLambda0.onExtraCallback / (((byte) (((byte) (bArr6[r4] * (-4629411779493505016L))) - s)) ^ b);
                        } else {
                            byte[] bArr7 = onExtraCallback;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            i4 = trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr7[r4] ^ (-4629411779493505016L))) + s)) ^ b);
                        }
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) i4;
                    } else {
                        short[] sArr = onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r4] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    static void onWarmupCompleted() {
        onWarmupCompleted = -808731086;
        onNavigationEvent = -1538795434;
        IAuthTabCallback = 1788466371;
        onExtraCallback = new byte[]{7, -8, -15, -13, 13, 9, 62, -47, 51, 8, 8};
    }
}
