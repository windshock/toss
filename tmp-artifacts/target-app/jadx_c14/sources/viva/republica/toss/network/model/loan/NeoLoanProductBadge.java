package viva.republica.toss.network.model.loan;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.TombstoneProtosMemoryMappingBuilder;
import o.access15300;
import o.liq;
import o.updateRenderInfoForVideo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.loan.NeoLoanProductBadge$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class NeoLoanProductBadge implements Parcelable {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;

    @SerializedName("colorStyle")
    private final onExtraCallbackWithResult colorStyle;

    @SerializedName("iconUrl")
    private final String iconUrl;

    @SerializedName("text")
    private final String text;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<NeoLoanProductBadge> CREATOR = new onNavigationEvent();
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.loan.NeoLoanProductBadge$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 99;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                NeoLoanProductBadge.onWarmupCompleted();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            KSerializer kSerializerOnWarmupCompleted = NeoLoanProductBadge.onWarmupCompleted();
            int i3 = onNavigationEvent + 43;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return kSerializerOnWarmupCompleted;
        }
    })};

    public static final class onNavigationEvent implements Parcelable.Creator<NeoLoanProductBadge> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public final NeoLoanProductBadge[] IAuthTabCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 97;
            onWarmupCompleted = i3 % 128;
            NeoLoanProductBadge[] neoLoanProductBadgeArr = new NeoLoanProductBadge[i];
            if (i3 % 2 == 0) {
                return neoLoanProductBadgeArr;
            }
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ NeoLoanProductBadge createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 113;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return onExtraCallbackWithResult(parcel);
            }
            onExtraCallbackWithResult(parcel);
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ NeoLoanProductBadge[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 53;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return IAuthTabCallback(i);
            }
            IAuthTabCallback(i);
            throw null;
        }

        public final NeoLoanProductBadge onExtraCallbackWithResult(Parcel parcel) {
            onExtraCallbackWithResult onextracallbackwithresultValueOf;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                int i2 = onExtraCallback + 117;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                onextracallbackwithresultValueOf = null;
            } else {
                onextracallbackwithresultValueOf = onExtraCallbackWithResult.valueOf(parcel.readString());
            }
            NeoLoanProductBadge neoLoanProductBadge = new NeoLoanProductBadge(string, string2, onextracallbackwithresultValueOf);
            int i4 = onExtraCallback + 67;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return neoLoanProductBadge;
        }
    }

    public NeoLoanProductBadge() {
        this((String) null, (String) null, (onExtraCallbackWithResult) null, 7, (DefaultConstructorMarker) null);
    }

    private static final /* synthetic */ KSerializer asInterface() {
        KSerializer kSerializerOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 21;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.loan.NeoLoanProductBadge.Style", onExtraCallbackWithResult.values());
            int i3 = 43 / 0;
        } else {
            kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.loan.NeoLoanProductBadge.Style", onExtraCallbackWithResult.values());
        }
        int i4 = onNavigationEvent + 43;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 99 / 0;
        }
        return kSerializerOnExtraCallbackWithResult;
    }

    public static /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerAsInterface = asInterface();
        int i4 = onNavigationEvent + 63;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 35 / 0;
        }
        return kSerializerAsInterface;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 41;
        onNavigationEvent = i2 % 128;
        return 1 ^ (i2 % 2 == 0 ? 0 : 1);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback + 117;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof NeoLoanProductBadge)) {
            int i4 = IAuthTabCallback + 67;
            onNavigationEvent = i4 % 128;
            return i4 % 2 == 0;
        }
        NeoLoanProductBadge neoLoanProductBadge = (NeoLoanProductBadge) obj;
        if (!Intrinsics.areEqual(this.text, neoLoanProductBadge.text)) {
            int i5 = onNavigationEvent + 123;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.iconUrl, neoLoanProductBadge.iconUrl)) {
            int i7 = IAuthTabCallback + 39;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 9 / 0;
            }
            return false;
        }
        if (this.colorStyle == neoLoanProductBadge.colorStyle) {
            return true;
        }
        int i9 = IAuthTabCallback + 19;
        onNavigationEvent = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int iHashCode = this.text.hashCode();
        String str = this.iconUrl;
        int iHashCode2 = 0;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        onExtraCallbackWithResult onextracallbackwithresult = this.colorStyle;
        if (onextracallbackwithresult != null) {
            int i2 = onNavigationEvent + 29;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            iHashCode2 = onextracallbackwithresult.hashCode();
            int i4 = onNavigationEvent + 27;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 / 5;
            }
        }
        return (((iHashCode * 31) + iHashCode3) * 31) + iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "NeoLoanProductBadge(text=" + this.text + ", iconUrl=" + this.iconUrl + ", colorStyle=" + this.colorStyle + ")";
        int i2 = IAuthTabCallback + 79;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.text);
        parcel.writeString(this.iconUrl);
        onExtraCallbackWithResult onextracallbackwithresult = this.colorStyle;
        if (onextracallbackwithresult == null) {
            int i3 = IAuthTabCallback + 93;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                parcel.writeInt(0);
                return;
            } else {
                parcel.writeInt(0);
                return;
            }
        }
        parcel.writeInt(1);
        parcel.writeString(onextracallbackwithresult.name());
        int i4 = IAuthTabCallback + 125;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 9 / 0;
        }
    }

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<NeoLoanProductBadge> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 81;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            NeoLoanProductBadge$.serializer serializerVar = NeoLoanProductBadge$.serializer.INSTANCE;
            int i4 = onNavigationEvent + 21;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 89 / 0;
            }
            return serializerVar;
        }
    }

    static {
        int i = onExtraCallback + 109;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            int i2 = 64 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ NeoLoanProductBadge(int r2, java.lang.String r3, java.lang.String r4, viva.republica.toss.network.model.loan.NeoLoanProductBadge.onExtraCallbackWithResult r5, o.okycx r6) {
        /*
            r1 = this;
            r1.<init>()
            r6 = r2 & 1
            r0 = 2
            if (r6 != 0) goto Lc
            int r3 = r0 % r0
            java.lang.String r3 = ""
        Lc:
            r1.text = r3
            r3 = r2 & 2
            r6 = 0
            if (r3 != 0) goto L21
            r1.iconUrl = r6
            int r3 = viva.republica.toss.network.model.loan.NeoLoanProductBadge.onNavigationEvent
            int r3 = r3 + 95
            int r4 = r3 % 128
            viva.republica.toss.network.model.loan.NeoLoanProductBadge.IAuthTabCallback = r4
            int r3 = r3 % r0
            if (r3 == 0) goto L23
            goto L25
        L21:
            r1.iconUrl = r4
        L23:
            int r3 = r0 % r0
        L25:
            r2 = r2 & 4
            if (r2 != 0) goto L35
            r1.colorStyle = r6
            int r2 = viva.republica.toss.network.model.loan.NeoLoanProductBadge.IAuthTabCallback
            int r2 = r2 + 57
            int r3 = r2 % 128
            viva.republica.toss.network.model.loan.NeoLoanProductBadge.onNavigationEvent = r3
            int r2 = r2 % r0
            return
        L35:
            r1.colorStyle = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.NeoLoanProductBadge.<init>(int, java.lang.String, java.lang.String, viva.republica.toss.network.model.loan.NeoLoanProductBadge$onExtraCallbackWithResult, o.okycx):void");
    }

    public NeoLoanProductBadge(@NotNull String str, @Nullable String str2, @Nullable onExtraCallbackWithResult onextracallbackwithresult) {
        Intrinsics.checkNotNullParameter(str, "");
        this.text = str;
        this.iconUrl = str2;
        this.colorStyle = onextracallbackwithresult;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c A[PHI: r1
      0x002c: PHI (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
      (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v10 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v11 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
     binds: [B:8:0x0020, B:10:0x002a, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022 A[PHI: r1
      0x0022: PHI (r1v10 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
      (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v11 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
     binds: [B:8:0x0020, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onExtraCallbackWithResult(viva.republica.toss.network.model.loan.NeoLoanProductBadge r6, o.vyl r7, kotlinx.serialization.descriptors.SerialDescriptor r8) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.loan.NeoLoanProductBadge.IAuthTabCallback
            int r1 = r1 + 15
            int r2 = r1 % 128
            viva.republica.toss.network.model.loan.NeoLoanProductBadge.onNavigationEvent = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L1a
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.loan.NeoLoanProductBadge.$childSerializers
            boolean r4 = r7.onWarmupCompleted(r8, r2)
            r4 = r4 ^ r3
            if (r4 == r3) goto L22
            goto L2c
        L1a:
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.loan.NeoLoanProductBadge.$childSerializers
            boolean r4 = r7.onWarmupCompleted(r8, r2)
            if (r4 != 0) goto L2c
        L22:
            java.lang.String r4 = r6.text
            java.lang.String r5 = ""
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r5)
            if (r4 != 0) goto L31
        L2c:
            java.lang.String r4 = r6.text
            r7.onExtraCallback(r8, r2, r4)
        L31:
            boolean r2 = r7.onWarmupCompleted(r8, r3)
            if (r2 != 0) goto L4b
            int r2 = viva.republica.toss.network.model.loan.NeoLoanProductBadge.onNavigationEvent
            int r2 = r2 + 111
            int r4 = r2 % 128
            viva.republica.toss.network.model.loan.NeoLoanProductBadge.IAuthTabCallback = r4
            int r2 = r2 % r0
            if (r2 != 0) goto L47
            java.lang.String r2 = r6.iconUrl
            if (r2 == 0) goto L52
            goto L4b
        L47:
            java.lang.String r6 = r6.iconUrl
            r6 = 0
            throw r6
        L4b:
            o.getWriggleLayout r2 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r4 = r6.iconUrl
            r7.onExtraCallbackWithResult(r8, r3, r2, r4)
        L52:
            boolean r2 = r7.onWarmupCompleted(r8, r0)
            if (r2 != 0) goto L5c
            viva.republica.toss.network.model.loan.NeoLoanProductBadge$onExtraCallbackWithResult r2 = r6.colorStyle
            if (r2 == 0) goto L72
        L5c:
            r1 = r1[r0]
            java.lang.Object r1 = r1.getValue()
            o.py r1 = (o.py) r1
            viva.republica.toss.network.model.loan.NeoLoanProductBadge$onExtraCallbackWithResult r6 = r6.colorStyle
            r7.onExtraCallbackWithResult(r8, r0, r1, r6)
            int r6 = viva.republica.toss.network.model.loan.NeoLoanProductBadge.onNavigationEvent
            int r6 = r6 + 73
            int r7 = r6 % 128
            viva.republica.toss.network.model.loan.NeoLoanProductBadge.IAuthTabCallback = r7
            int r6 = r6 % r0
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.NeoLoanProductBadge.onExtraCallbackWithResult(viva.republica.toss.network.model.loan.NeoLoanProductBadge, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public static final /* synthetic */ Lazy[] onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 25;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i3 + 87;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return lazyArr;
        }
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ NeoLoanProductBadge(String str, String str2, onExtraCallbackWithResult onextracallbackwithresult, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onNavigationEvent + 125;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 94 / 0;
            }
            int i4 = 2 % 2;
            str = "";
        }
        if ((i & 2) != 0) {
            int i5 = IAuthTabCallback + 107;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 16 / 0;
            }
            int i7 = 2 % 2;
            str2 = null;
        }
        if ((i & 4) != 0) {
            int i8 = 2 % 2;
            onextracallbackwithresult = null;
        }
        this(str, str2, onextracallbackwithresult);
    }

    public final String onNavigationEvent() {
        String str;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 69;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 == 0) {
            str = this.text;
            int i4 = 12 / 0;
        } else {
            str = this.text;
        }
        int i5 = i3 + 9;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onExtraCallback() {
        String str;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 != 0) {
            str = this.iconUrl;
            int i4 = 71 / 0;
        } else {
            str = this.iconUrl;
        }
        int i5 = i3 + 107;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final onExtraCallbackWithResult IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 93;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        onExtraCallbackWithResult onextracallbackwithresult = this.colorStyle;
        int i5 = i3 + 121;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return onextracallbackwithresult;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallbackWithResult {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallbackWithResult[] $VALUES;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        public static final onExtraCallbackWithResult DEFAULT = new onExtraCallbackWithResult("DEFAULT", 0);
        public static final onExtraCallbackWithResult BLUE = new onExtraCallbackWithResult("BLUE", 1);
        public static final onExtraCallbackWithResult ELEPHANT = new onExtraCallbackWithResult("ELEPHANT", 2);
        public static final onExtraCallbackWithResult PURPLE = new onExtraCallbackWithResult("PURPLE", 3);
        public static final onExtraCallbackWithResult RED = new onExtraCallbackWithResult("RED", 4);

        private static final /* synthetic */ onExtraCallbackWithResult[] $values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 19;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            onExtraCallbackWithResult[] onextracallbackwithresultArr = {DEFAULT, BLUE, ELEPHANT, PURPLE, RED};
            int i5 = i3 + 117;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return onextracallbackwithresultArr;
        }

        public static EnumEntries<onExtraCallbackWithResult> getEntries() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 47;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            EnumEntries<onExtraCallbackWithResult> enumEntries = $ENTRIES;
            if (i3 != 0) {
                int i4 = 18 / 0;
            }
            return enumEntries;
        }

        public static onExtraCallbackWithResult valueOf(String str) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 95;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) Enum.valueOf(onExtraCallbackWithResult.class, str);
            int i4 = onWarmupCompleted + 1;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return onextracallbackwithresult;
        }

        public static onExtraCallbackWithResult[] values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 35;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult[] onextracallbackwithresultArr = (onExtraCallbackWithResult[]) $VALUES.clone();
            int i4 = onWarmupCompleted + 49;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return onextracallbackwithresultArr;
        }

        private onExtraCallbackWithResult(String str, int i) {
        }

        static {
            onExtraCallbackWithResult[] onextracallbackwithresultArr$values = $values();
            $VALUES = onextracallbackwithresultArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackwithresultArr$values);
            int i = IAuthTabCallback + 39;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }
    }
}
