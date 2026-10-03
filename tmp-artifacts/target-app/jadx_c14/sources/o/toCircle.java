package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.annotations.SerializedName;
import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class toCircle implements Parcelable {
    public static final int $stable = 0;
    private static final String CLEAR_CARD_DARK_SHADOW_IMAGE_URL;
    public static final Parcelable.Creator<toCircle> CREATOR;
    public static final onExtraCallbackWithResult Companion;
    private static byte[] IAuthTabCallback;
    private static final String SOLID_CARD_SHADOW_IMAGE_URL;
    private static int asInterface;
    private static int onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static short[] onNavigationEvent;
    private static int onWarmupCompleted;

    @SerializedName("cardNum")
    private final String cardNum;

    @SerializedName("cardStatus")
    private final buildArgumentExtractors cardStatus;

    @SerializedName("designCode")
    private final IAuthTabCallback designCode;

    @SerializedName("firstActivation")
    private final boolean firstActivation;

    @SerializedName("id")
    private final long id;

    @SerializedName("traffic")
    private final boolean traffic;
    private static final byte[] $$a = {89, 120, -98, -110};
    private static final int $$b = 86;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int onTransact = 1;
    private static int asBinder = 0;

    public static final class onWarmupCompleted implements Parcelable.Creator<toCircle> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ toCircle createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 29;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            toCircle tocircleOnWarmupCompleted = onWarmupCompleted(parcel);
            int i4 = onNavigationEvent + 105;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return tocircleOnWarmupCompleted;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ toCircle[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 29;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                return onExtraCallbackWithResult(i);
            }
            onExtraCallbackWithResult(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final toCircle[] onExtraCallbackWithResult(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 79;
            onExtraCallbackWithResult = i3 % 128;
            toCircle[] tocircleArr = new toCircle[i];
            if (i3 % 2 == 0) {
                return tocircleArr;
            }
            throw null;
        }

        public final toCircle onWarmupCompleted(Parcel parcel) {
            IAuthTabCallback iAuthTabCallbackValueOf;
            boolean z;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            long j = parcel.readLong();
            String string = parcel.readString();
            buildArgumentExtractors buildargumentextractorsValueOf = buildArgumentExtractors.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                int i2 = onNavigationEvent + 33;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                iAuthTabCallbackValueOf = null;
            } else {
                iAuthTabCallbackValueOf = IAuthTabCallback.valueOf(parcel.readString());
            }
            IAuthTabCallback iAuthTabCallback = iAuthTabCallbackValueOf;
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                int i4 = onNavigationEvent + 91;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                z = false;
            } else {
                z = true;
            }
            return new toCircle(j, string, buildargumentextractorsValueOf, iAuthTabCallback, z2, z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r6, short r7, byte r8) {
        /*
            int r8 = r8 * 2
            int r8 = 3 - r8
            byte[] r0 = o.toCircle.$$a
            int r7 = r7 * 3
            int r7 = 115 - r7
            int r6 = r6 * 3
            int r6 = r6 + 1
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2e
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            int r8 = r8 + 1
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L27:
            r4 = r0[r8]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r7 = -r7
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.toCircle.$$c(short, short, byte):java.lang.String");
    }

    static {
        asInterface = 1;
        onTransact();
        Object[] objArr = new Object[1];
        a((short) View.getDefaultSize(0, 0), (byte) (116 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), Color.green(0) - 1498636260, TextUtils.indexOf("", "", 0) + 1442806562, (-42) - KeyEvent.normalizeMetaState(0), objArr);
        SOLID_CARD_SHADOW_IMAGE_URL = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a((short) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (byte) ((-33) - ExpandableListView.getPackedPositionChild(0L)), (KeyEvent.getMaxKeyCode() >> 16) - 1498636179, 1442806562 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getTouchSlop() >> 8) - 42, objArr2);
        CLEAR_CARD_DARK_SHADOW_IMAGE_URL = ((String) objArr2[0]).intern();
        Companion = new onExtraCallbackWithResult(null);
        CREATOR = new onWarmupCompleted();
        int i = asBinder + 3;
        asInterface = i % 128;
        int i2 = i % 2;
    }

    public toCircle() {
        this(0L, null, null, null, false, false, 63, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 71;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 101;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof toCircle)) {
            int i2 = IAuthTabCallbackStub + 85;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        toCircle tocircle = (toCircle) obj;
        if (this.id != tocircle.id || !Intrinsics.areEqual(this.cardNum, tocircle.cardNum)) {
            return false;
        }
        if (this.cardStatus != tocircle.cardStatus) {
            int i4 = onTransact + 125;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.designCode != tocircle.designCode) {
            return false;
        }
        if (this.traffic == tocircle.traffic) {
            return this.firstActivation == tocircle.firstActivation;
        }
        int i6 = IAuthTabCallbackStub + 113;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 71;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            Long.hashCode(this.id);
            this.cardNum.hashCode();
            this.cardStatus.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iHashCode = Long.hashCode(this.id);
        int iHashCode2 = this.cardNum.hashCode();
        int iHashCode3 = this.cardStatus.hashCode();
        IAuthTabCallback iAuthTabCallback = this.designCode;
        if (iAuthTabCallback == null) {
            i = 0;
        } else {
            int iHashCode4 = iAuthTabCallback.hashCode();
            int i4 = IAuthTabCallbackStub + 37;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            i = iHashCode4;
        }
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + i) * 31) + Boolean.hashCode(this.traffic)) * 31) + Boolean.hashCode(this.firstActivation);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PlccCard(id=" + this.id + ", cardNum=" + this.cardNum + ", cardStatus=" + this.cardStatus + ", designCode=" + this.designCode + ", traffic=" + this.traffic + ", firstActivation=" + this.firstActivation + ")";
        int i2 = onTransact + 79;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.id);
        parcel.writeString(this.cardNum);
        parcel.writeString(this.cardStatus.name());
        IAuthTabCallback iAuthTabCallback = this.designCode;
        if (iAuthTabCallback == null) {
            parcel.writeInt(0);
            i2 = IAuthTabCallbackStub + 17;
        } else {
            parcel.writeInt(1);
            parcel.writeString(iAuthTabCallback.name());
            i2 = IAuthTabCallbackStub + 123;
        }
        onTransact = i2 % 128;
        int i4 = i2 % 2;
        parcel.writeInt(this.traffic ? 1 : 0);
        parcel.writeInt(this.firstActivation ? 1 : 0);
    }

    public toCircle(long j, @NotNull String str, @NotNull buildArgumentExtractors buildargumentextractors, @Nullable IAuthTabCallback iAuthTabCallback, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(buildargumentextractors, "");
        this.id = j;
        this.cardNum = str;
        this.cardStatus = buildargumentextractors;
        this.designCode = iAuthTabCallback;
        this.traffic = z;
        this.firstActivation = z2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ toCircle(long j, String str, buildArgumentExtractors buildargumentextractors, IAuthTabCallback iAuthTabCallback, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str2;
        IAuthTabCallback iAuthTabCallback2;
        boolean z3;
        long j2 = (i & 1) != 0 ? 0L : j;
        if ((i & 2) != 0) {
            int i2 = onTransact + 33;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 119;
            onTransact = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
            str2 = "";
        } else {
            str2 = str;
        }
        buildArgumentExtractors buildargumentextractors2 = (i & 4) != 0 ? buildArgumentExtractors.NORMAL : buildargumentextractors;
        boolean z4 = true;
        if ((i & 8) != 0) {
            int i7 = IAuthTabCallbackStub + 1;
            onTransact = i7 % 128;
            int i8 = i7 % 2;
            iAuthTabCallback2 = null;
        } else {
            iAuthTabCallback2 = iAuthTabCallback;
        }
        if ((i & 16) != 0) {
            int i9 = 2 % 2;
            z3 = false;
        } else {
            z3 = z;
        }
        if ((i & 32) != 0) {
            int i10 = onTransact + 63;
            IAuthTabCallbackStub = i10 % 128;
            if (i10 % 2 == 0) {
                z4 = false;
            }
        } else {
            z4 = z2;
        }
        this(j2, str2, buildargumentextractors2, iAuthTabCallback2, z3, z4);
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onTransact + 27;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return this.id;
        }
        int i3 = 26 / 0;
        return this.id;
    }

    public final buildArgumentExtractors onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 107;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        buildArgumentExtractors buildargumentextractors = this.cardStatus;
        int i5 = i2 + 39;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return buildargumentextractors;
    }

    public final IAuthTabCallback IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 119;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        IAuthTabCallback iAuthTabCallback = this.designCode;
        int i4 = i3 + 31;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return iAuthTabCallback;
    }

    public final boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 31;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.traffic;
        int i5 = i2 + 39;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 73 / 0;
        }
        return z;
    }

    public final boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 119;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return this.firstActivation;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class IAuthTabCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ IAuthTabCallback[] $VALUES;

        @SerializedName("A")
        public static final IAuthTabCallback CLEAR_BLUE;

        @SerializedName("B")
        public static final IAuthTabCallback CLEAR_WHITE;
        public static final C0016IAuthTabCallback Companion;

        @SerializedName("C")
        public static final IAuthTabCallback GRAY;
        private static long IAuthTabCallback;

        @SerializedName("D")
        public static final IAuthTabCallback WHITE;
        private static int onExtraCallback;
        private static char[] onWarmupCompleted;
        private final String darkShadowImageUrl;
        private final String displayName;
        private final String logName;
        private final String nonTrafficCardImageUrl;
        private final String shadowImageUrl;
        private final String styleIconUrl;
        private final String trafficCardImageUrl;
        private final String value;
        private static final byte[] $$a = {13, 38, -109, 117};
        private static final int $$b = 237;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallbackStub = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(int r5, short r6, byte r7) {
            /*
                int r5 = r5 * 3
                int r5 = r5 + 97
                byte[] r0 = o.toCircle.IAuthTabCallback.$$a
                int r6 = r6 * 4
                int r1 = r6 + 1
                int r7 = r7 * 2
                int r7 = 4 - r7
                byte[] r1 = new byte[r1]
                r2 = 0
                if (r0 != 0) goto L16
                r3 = r6
                r4 = r2
                goto L26
            L16:
                r3 = r2
            L17:
                byte r4 = (byte) r5
                r1[r3] = r4
                int r4 = r3 + 1
                if (r3 != r6) goto L24
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                return r5
            L24:
                r3 = r0[r7]
            L26:
                int r7 = r7 + 1
                int r3 = -r3
                int r5 = r5 + r3
                r3 = r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: o.toCircle.IAuthTabCallback.$$c(int, short, byte):java.lang.String");
        }

        private static final /* synthetic */ IAuthTabCallback[] $values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 49;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return new IAuthTabCallback[]{CLEAR_BLUE, CLEAR_WHITE, GRAY, WHITE};
            }
            IAuthTabCallback iAuthTabCallback = CLEAR_BLUE;
            IAuthTabCallback iAuthTabCallback2 = CLEAR_WHITE;
            IAuthTabCallback iAuthTabCallback3 = GRAY;
            IAuthTabCallback iAuthTabCallback4 = WHITE;
            IAuthTabCallback[] iAuthTabCallbackArr = new IAuthTabCallback[2];
            iAuthTabCallbackArr[1] = iAuthTabCallback;
            iAuthTabCallbackArr[1] = iAuthTabCallback2;
            iAuthTabCallbackArr[4] = iAuthTabCallback3;
            iAuthTabCallbackArr[4] = iAuthTabCallback4;
            return iAuthTabCallbackArr;
        }

        public static EnumEntries<IAuthTabCallback> getEntries() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 13;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            EnumEntries<IAuthTabCallback> enumEntries = $ENTRIES;
            int i4 = i3 + 9;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return enumEntries;
        }

        public static IAuthTabCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 107;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) Enum.valueOf(IAuthTabCallback.class, str);
            if (i3 == 0) {
                throw null;
            }
            int i4 = onExtraCallbackWithResult + 11;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return iAuthTabCallback;
            }
            throw null;
        }

        public static IAuthTabCallback[] values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 89;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback[] iAuthTabCallbackArr = $VALUES;
            if (i3 == 0) {
                return (IAuthTabCallback[]) iAuthTabCallbackArr.clone();
            }
            throw null;
        }

        private IAuthTabCallback(String str, int i, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
            this.value = str2;
            this.nonTrafficCardImageUrl = str3;
            this.trafficCardImageUrl = str4;
            this.shadowImageUrl = str5;
            this.darkShadowImageUrl = str6;
            this.styleIconUrl = str7;
            this.displayName = str8;
            this.logName = str9;
        }

        public static final /* synthetic */ String access$getValue$p(IAuthTabCallback iAuthTabCallback) {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 99;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            String str = iAuthTabCallback.value;
            if (i4 != 0) {
                throw null;
            }
            int i5 = i2 + 47;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String getStyleIconUrl() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 25;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            String str = this.styleIconUrl;
            int i5 = i2 + 79;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String getDisplayName() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 27;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            String str = this.displayName;
            int i5 = i3 + 93;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 8 / 0;
            }
            return str;
        }

        public final String getLogName() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 15;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            String str = this.logName;
            int i5 = i3 + 51;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static {
            onExtraCallback = 0;
            onWarmupCompleted();
            Object[] objArr = new Object[1];
            a((-1) - TextUtils.lastIndexOf("", '0', 0), 80 - TextUtils.lastIndexOf("", '0'), (char) Color.blue(0), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a((ViewConfiguration.getFadingEdgeLength() >> 16) + 81, MotionEvent.axisFromString("") + 71, (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr2);
            String strIntern2 = ((String) objArr2[0]).intern();
            Object[] objArr3 = new Object[1];
            a(150 - TextUtils.lastIndexOf("", '0'), Gravity.getAbsoluteGravity(0, 0) + 80, (char) KeyEvent.normalizeMetaState(0), objArr3);
            String strIntern3 = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            a(231 - TextUtils.getCapsMode("", 0, 0), 88 - MotionEvent.axisFromString(""), (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 53118), objArr4);
            String strIntern4 = ((String) objArr4[0]).intern();
            Object[] objArr5 = new Object[1];
            a(320 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 86 - (Process.myPid() >> 22), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 61075), objArr5);
            CLEAR_BLUE = new IAuthTabCallback("CLEAR_BLUE", 0, "A", strIntern, strIntern2, strIntern3, strIntern4, ((String) objArr5[0]).intern(), "투명블루", "blueclear");
            Object[] objArr6 = new Object[1];
            a(Color.argb(0, 0, 0, 0) + 406, 80 - ImageFormat.getBitsPerPixel(0), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), objArr6);
            String strIntern5 = ((String) objArr6[0]).intern();
            Object[] objArr7 = new Object[1];
            a(MotionEvent.axisFromString("") + 488, 71 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (6420 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), objArr7);
            String strIntern6 = ((String) objArr7[0]).intern();
            Object[] objArr8 = new Object[1];
            a(557 - (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 81, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), objArr8);
            String strIntern7 = ((String) objArr8[0]).intern();
            Object[] objArr9 = new Object[1];
            a(230 - ExpandableListView.getPackedPositionChild(0L), (ViewConfiguration.getTapTimeout() >> 16) + 89, (char) (53118 - View.MeasureSpec.getSize(0)), objArr9);
            String strIntern8 = ((String) objArr9[0]).intern();
            Object[] objArr10 = new Object[1];
            a((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 637, 84 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) View.resolveSize(0, 0), objArr10);
            CLEAR_WHITE = new IAuthTabCallback("CLEAR_WHITE", 1, "B", strIntern5, strIntern6, strIntern7, strIntern8, ((String) objArr10[0]).intern(), "투명", "clearwhite");
            Object[] objArr11 = new Object[1];
            a(TextUtils.getCapsMode("", 0, 0) + 722, Color.argb(0, 0, 0, 0) + 67, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), objArr11);
            String strIntern9 = ((String) objArr11[0]).intern();
            Object[] objArr12 = new Object[1];
            a((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 721, KeyEvent.keyCodeFromString("") + 67, (char) Color.red(0), objArr12);
            String strIntern10 = ((String) objArr12[0]).intern();
            Object[] objArr13 = new Object[1];
            a(TextUtils.indexOf((CharSequence) "", '0', 0) + 790, 82 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (ExpandableListView.getPackedPositionChild(0L) + 16877), objArr13);
            String strIntern11 = ((String) objArr13[0]).intern();
            Object[] objArr14 = new Object[1];
            a((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 789, 81 - (ViewConfiguration.getScrollBarSize() >> 8), (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 16876), objArr14);
            String strIntern12 = ((String) objArr14[0]).intern();
            Object[] objArr15 = new Object[1];
            a((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 869, 80 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), objArr15);
            GRAY = new IAuthTabCallback("GRAY", 2, "C", strIntern9, strIntern10, strIntern11, strIntern12, ((String) objArr15[0]).intern(), "그레이", "gray");
            Object[] objArr16 = new Object[1];
            a((ViewConfiguration.getTapTimeout() >> 16) + 951, 65 - TextUtils.getOffsetAfter("", 0), (char) (MotionEvent.axisFromString("") + 47928), objArr16);
            String strIntern13 = ((String) objArr16[0]).intern();
            Object[] objArr17 = new Object[1];
            a(950 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 66 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (ExpandableListView.getPackedPositionGroup(0L) + 47927), objArr17);
            String strIntern14 = ((String) objArr17[0]).intern();
            Object[] objArr18 = new Object[1];
            a(788 - TextUtils.lastIndexOf("", '0', 0, 0), Process.getGidForName("") + 82, (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 16876), objArr18);
            String strIntern15 = ((String) objArr18[0]).intern();
            Object[] objArr19 = new Object[1];
            a(Color.argb(0, 0, 0, 0) + 789, (Process.myPid() >> 22) + 81, (char) (KeyEvent.keyCodeFromString("") + 16876), objArr19);
            String strIntern16 = ((String) objArr19[0]).intern();
            Object[] objArr20 = new Object[1];
            a(1016 - (ViewConfiguration.getFadingEdgeLength() >> 16), 80 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (23063 - TextUtils.lastIndexOf("", '0', 0)), objArr20);
            WHITE = new IAuthTabCallback("WHITE", 3, "D", strIntern13, strIntern14, strIntern15, strIntern16, ((String) objArr20[0]).intern(), "화이트", "white");
            IAuthTabCallback[] iAuthTabCallbackArr$values = $values();
            $VALUES = iAuthTabCallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(iAuthTabCallbackArr$values);
            Companion = new C0016IAuthTabCallback(null);
            int i = IAuthTabCallbackStub + 37;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final String getCardImageUrl(boolean z) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            if (z) {
                return this.trafficCardImageUrl;
            }
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            int i2 = onNavigationEvent;
            int i3 = i2 + 59;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            String str = this.nonTrafficCardImageUrl;
            int i5 = i2 + 7;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final String getShadowImageUrl(boolean z) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 115;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            if (!z) {
                if (z) {
                    throw new NoWhenBranchMatchedException();
                }
                int i5 = i2 + 57;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return this.shadowImageUrl;
            }
            String str = this.darkShadowImageUrl;
            int i7 = i2 + 121;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* renamed from: o.toCircle$IAuthTabCallback$IAuthTabCallback, reason: collision with other inner class name */
        public static final class C0016IAuthTabCallback {
            public /* synthetic */ C0016IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0016IAuthTabCallback() {
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:77:0x0327  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x0328  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(int r28, int r29, char r30, java.lang.Object[] r31) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 817
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.toCircle.IAuthTabCallback.a(int, int, char, java.lang.Object[]):void");
        }

        static void onWarmupCompleted() {
            char[] cArr = new char[1095];
            ByteBuffer.wrap("í¼\u009cÅ\u000fj¹\u008b(3Û\u0017E¥ô8f\u008f\u0011-\u0080G2÷½\u0001/\u0096Þ|IKûëj\u0012\u0014½\u0087\u00856Y ðSUÝ®LÀÿeiã\u0018\u0000\u008a¬5Ö¤/V\u008cÁ\u001bs¼âÓmt\u001f\u008e\u008eb9C«ÚZ{Ä¦w2æL\u0090û\u0003f\u008d\u0091<-¯AYåÈ\u0007z¿å\u000f\u0094M\u0006ö±\u0006#¸ÒÌ]iÏð~\u0014è \u009bÃ\n}´ö'\u001dÑ\u0081@Ùóo}\u009fì.\u009e²\tÎ¸u*\u0083Õ0D[ö\u009bab\u0013\u0091\u0082#í¼\u009cÅ\u000fj¹\u008b(3Û\u0017E¥ô8f\u008f\u0011-\u0080G2÷½\u0001/\u0096Þ|IKûëj\u0012\u0014½\u0087\u00856Y ðSUÝ®LÀÿeiã\u0018\u0000\u008a¬5Ö¤/V\u008cÁ\u001bs¼âÓmt\u001f\u008e\u008eb9C«ÚZ{Ä¦w2æL\u0090û\u0003f\u008d\u0091<-¯AYåÈ\u0007z¿å\u000f\u0094M\u0006ö±\u0006#¸ÒÌ]iÏð~\u0014è \u009bÃ\n}´ö'\u001dÑð@Ëón}\u008aí¼\u009cÅ\u000fj¹\u008b(3Û\u0017E¥ô8f\u008f\u0011-\u0080G2÷½\u0001/\u0096Þ|IKûëj\u0012\u0014½\u0087\u00856Y ðSUÝ¦Lßÿzió\u0018\u0007\u008a«5\u008a¤vV\u0080Á\u0007s¢âÝmz\u001f\u0092\u008e)9\u0005«ÔZ}Ä\u008bw\"æ|\u0090á\u0003x\u008d\u0093<8¯AY®È\u0007z¦å7\u0094b\u0006î±\b#¿ÒÚ]UÏá~\u001dè¡\u009bË\n{´Ë'\u0002Ñ¶@Úód}\u0082ì=\u009e\u0088\tÞ¸u*\u0093Õ&D\u0006öÅa|\u0013\u0098\"ÂS»À\u0014võçM\u0014i\u008aÛ;F©ñÞSO9ý\u0089r\u007fàè\u0011\u0002\u008654\u0095¥lÛÃHûù'o\u008e\u009c+\u0012Ø\u0083¡0\u0004¦\u008d×yEÕúôk\b\u0099þ\u000ey¼Ü-£¢\u0004ÐìAWö{dª\u0095\u0003\u000bõ¸\\)\u0002_\u009fÌ\u0006BíóF`?\u0096Ð\u0007yµØ*I[\u001cÉ\u0090~vìÁ\u001d¤\u0092+\u0000\u009f±c'ßTµÅ\u0005{µè|\u001eÈ\u008f¤<\u001a²ü#CQöÆ¡w\u000båý\u001a\\\u008b$9¯®\rÜóMQÂ2p\u009fáq\u0017ë\u0084\r54«\u0097Øu\u0003(rQáþW\u001fÆ§5\u0083«1\u001a¬\u0088\u001bÿ¹nÓÜcS\u0095Á\u00020è§ß\u0015\u007f\u0084\u0086ú)i\u0011ØÍNd½Á32¢K\u0011î\u0087gö\u0093d?Û\u001eJâ¸\u0014/\u0093\u009d6\fI\u0083îñ\u0006`½×\u0091E@´é*\u001f\u0099¶\bè~uíìc\u0007Ò¬AÕ·:&\u0099\u00940\u000b¨zÆè|_ÜÍ,<R³Ñ!t\u0090\u008f\u0006#uSäÿZiÉ\u0091?\u0015®L\u001dû\u0093\u0015\u0002±p1çwVîÄ\u001e;²ªÝ\u0018S\u008fäý\u0007l¥ãÐQ4À\u008f6\n¥®í¼\u009cÅ\u000fj¹\u008b(3Û\u0017E¥ô8f\u008f\u0011-\u0080G2÷½\u0001/\u0096Þ|IKûëj\u0012\u0014½\u0087\u00856Y ðSUÝ®LÀÿeiã\u0018\u0000\u008a¬5Ö¤/V\u008cÁ\u001bs¼âÓmt\u001f\u008e\u008eb9C«ÚZ{Ä¦w2æL\u0090û\u0003f\u008d\u0091<-¯AYåÈ\u0007z¿å\u000f\u0094M\u0006ö±\u0006#¸ÒÌ]iÏð~\u0014è \u009bÃ\n}´ã'\u0005Ñ\u0081@Ùóo}\u009fì.\u009e²\tÎ¸u*\u0083Õ0D[ö\u009bab\u0013\u0091\u0082#ô¨\u0085Ñ\u0016~ \u009f1'Â\u0003\\±í,\u007f\u009b\b9\u0099S+ã¤\u00156\u0082ÇhP_âÿs\u0006\r©\u009e\u0091/M¹äJAÄºUÔæqp÷\u0001\u0014\u0093¸,Â½;O\u0098Ø\u000fj¨ûÇt`\u0006\u009a\u0097v W²ÎCoÝ²n&ÿX\u0089ï\u001ar\u0094\u0085%9¶U@ñÑ\u0013c«ü\u001b\u008dY\u001fâ¨\u0012:¬ËØD}Öäg\u0000ñ´\u0082×\u0013i\u00ad÷>\u0011ÈäYßêzd\u009eí¼\u009cÅ\u000fj¹\u008b(3Û\u0017E¥ô8f\u008f\u0011-\u0080G2÷½\u0001/\u0096Þ|IKûëj\u0012\u0014½\u0087\u00856Y ðSUÝ¦Lßÿzió\u0018\u0007\u008a«5\u008a¤vV\u0080Á\u0007s¢âÝmz\u001f\u0092\u008e)9\u0005«ÔZ}Ä\u008bw\"æ|\u0090á\u0003x\u008d\u0093<8¯AY®È\u0007z¦å7\u0094b\u0006î±\b#¿ÒÚ]UÏá~\u001dè¡\u009bË\n{´Ë'\u0002Ñ¶@Úód}\u0082ì=\u009e\u0088\tß¸u*\u0083Õ\"DZö\u009bab\u0013\u0091\u0082#í¼\u009cÅ\u000fj¹\u008b(3Û\u0017E¥ô8f\u008f\u0011-\u0080G2÷½\u0001/\u0096Þ|IKûëj\u0012\u0014½\u0087\u00856Y ðSUÝ¦Lßÿzió\u0018\u0007\u008a«5\u008a¤vV\u0080Á\u0007s¢âÝmz\u001f\u0092\u008e)9\u0005«ÔZ}Ä\u008bw\"æ|\u0090á\u0003x\u008d\u0093<8¯AY®È\rz¤å<\u0094R\u0006è±H#¸ÒÆ]EÏà~\u001bè·\u009bÇ\nk´ý'\u0005Ñ\u0081@Øóo}\u0081ì%\u009e¥\tã¸z*\u008aÕ&DIöÇae\u0013\u008b\u0082j\rQ¿à.\fí¼\u009cÅ\u000fj¹\u008b(3Û\u0017E¥ô8f\u008f\u0011-\u0080G2÷½\u0001/\u0096Þ|IKûëj\u0012\u0014½\u0087\u00856Y ðSUÝ®LÀÿeiã\u0018\u0000\u008a¬5Ö¤/V\u008cÁ\u001bs¼âÓmt\u001f\u008e\u008eb9C«ÚZ{Ä¦w2æL\u0090û\u0003f\u008d\u0091<-¯AYåÈ\u0007z¿å\u000f\u0094M\u0006ö±\u0006#¸ÒÌ]iÏô~\nè¤\u009bÛ\n!´ä'\u001fÑ¹¬PÝ)N\u0086øgiß\u009aû\u0004IµÔ'cPÁÁ«s\u001büínz\u009f\u0090\b§º\u0007+þUQÆiwµá\u001c\u0012¹\u009cJ\r3¾\u0096(\u001fYëËGtfå\u009a\u0017l\u0080ë2N£1,\u0096^~ÏÅxéê8\u001b\u0091\u0085g6Î§\u0090Ñ\rB\u0094Ì\u007f}Ôî\u00ad\u0018B\u0089ë;J¤ÛÕ\u008eG\u0002ðäbS\u00936\u001c¹\u008e\r?ñ©MÚ'K\u0097õ'fî\u0090Z\u00016²\u0088<n\u00adÑßdH#ù\u009akf\u0094Æ\u0005 ·w \u008eR}ÃÏí¼\u009cÅ\u000fj¹\u008b(3Û\u0017E¥ô8f\u008f\u0011-\u0080G2÷½\u0001/\u0096Þ|IKûëj\u0012\u0014½\u0087\u00856Y ðSUÝ¦Lßÿzió\u0018\u0007\u008a«5\u008a¤vV\u0080Á\u0007s¢âÝmz\u001f\u0092\u008e)9\u0005«ÔZ}Ä\u008bw\"æ|\u0090á\u0003x\u008d\u0093<8¯AY®È\rz¤å<\u0094R\u0006è±H#¸ÒÆ]EÏà~\u001bè·\u009bÇ\nk´ý'\u0005Ñ\u0081@Øóo}\u0081ì%\u009e¥\tã¸~*\u0094Õ\"DQö\u009bab\u0013\u0091\u0082#V\u008b'ò´]\u0002¼\u0093\u0004` þ\u0092O\u000fÝ¸ª\u001a;p\u0089À\u00066\u0094¡eKò|@ÜÑ%¯\u008a<²\u008dn\u001bÇèbf\u0099÷÷DRÒÔ£71\u009b\u008eá\u001f\u0018í»z,È\u008bYäÖC¤¹5U\u0082t\u0010íáL\u007f\u0091Ì\u0005]{+Ì¸Q6¦\u0087\u001a\u0014vâÒs0Á\u0088^8/z½Á\n1\u0098\u008fiûæ^tÓÅ;SÜ å±V\u000fÄ·¤ÆÝUrã\u0093r+\u0081\u000f\u001f½® <\u0097K5Ú_hïç\u0019u\u008e\u0084d\u0013S¡ó0\nN¥Ý\u009dlAúè\tM\u0087¾\u0016Ç¥b3ëB\u001fÐ³o\u0092þn\f\u0098\u009b\u001f)º¸Å7bE\u008aÔ1c\u001dñÌ\u0000e\u009e\u0093-:¼dÊùY`×\u008bf õY\u0003¶\u0092\u0015 ¼¿$ÎJ\\ðëPy \u0088Þ\u0007]\u0095ø$\u0003²¯ÁßPsîå}\u001d\u008b\u0099\u001aÀ©w'\u0099¶=Ä½Sûâvp\u008a\u008fu\u001e@¬Ã;m".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1095);
            onWarmupCompleted = cArr;
            IAuthTabCallback = -220431866729620303L;
        }
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0091 A[PHI: r14
      0x0091: PHI (r14v3 byte[] A[IMMUTABLE_TYPE]) = (r14v2 byte[]), (r14v6 byte[]) binds: [B:22:0x008f, B:19:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x018e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(short r26, byte r27, int r28, int r29, int r30, java.lang.Object[] r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.toCircle.a(short, byte, int, int, int, java.lang.Object[]):void");
    }

    static void onTransact() {
        onWarmupCompleted = -48986132;
        onExtraCallback = -1538795487;
        onExtraCallbackWithResult = 239557966;
        IAuthTabCallback = new byte[]{32, -123, -126, 62, -74, -121, -127, -127, Byte.MIN_VALUE, 104, -108, 116, 119, Byte.MAX_VALUE, -123, -119, 104, -105, 119, 121, -125, -113, 115, -116, 124, 120, -121, 105, -124, -122, 120, 70, -74, -126, 122, -120, 120, 118, -121, -114, 109, -126, 72, -73, -114, 109, -126, -116, 124, 120, -121, 57, -64, -125, 115, -114, 124, 110, 78, -66, 120, 71, -57, 124, 120, -121, 58, -73, -122, -119, 111, -111, 125, 56, 124, -119, -69, Byte.MAX_VALUE, Byte.MIN_VALUE, 124, 112, 56, 17, 22, -86, 33, -23, 29, -22, -22, 17, -7, 21, 26, -7, 20, 17, -31, -20, 0, -32, -29, -21, 17, 29, -4, 3, -29, -19, 23, 27, -25, 24, -24, -20, 19, -3, 16, 18, -20, -46, 34, 22, -18, 28, -20, -30, 19, 26, -7, 22, -36, 35, 26, -7, 22, 24, -24, -20, 19, -83, 84, 23, -25, 26, -24, -6, -38, 42, -20, -45, 83, -24, -20, 19, -82, 35, 18, 29, -5, 5, -23, -84, -24, 29, 47, -21, 20, -24, -28};
    }
}
