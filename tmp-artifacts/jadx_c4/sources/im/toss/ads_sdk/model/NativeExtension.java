package im.toss.ads_sdk.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.AUTextView;
import o.adInfo;
import o.addTouchables;
import o.liq;
import o.videoFrameChanged;
import o.wie2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq(onNavigationEvent = addTouchables.class)
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class NativeExtension implements Parcelable {
    public static final int $stable = 0;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final String raw;
    private final int schemaVersion;
    private final String sdkTemplateId;
    private final String slotId;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<NativeExtension> CREATOR = new IAuthTabCallback();
    private static final wie2 decodeJson = videoFrameChanged.onWarmupCompleted((wie2) null, new Function1() { // from class: im.toss.ads_sdk.model.NativeExtension$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 65;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnExtraCallbackWithResult = NativeExtension.onExtraCallbackWithResult((adInfo) obj);
            int i4 = IAuthTabCallback + 57;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return unitOnExtraCallbackWithResult;
        }
    }, 1, (Object) null);

    public static final class IAuthTabCallback implements Parcelable.Creator<NativeExtension> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ NativeExtension createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 73;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            NativeExtension nativeExtensionOnExtraCallback = onExtraCallback(parcel);
            int i4 = IAuthTabCallback + 81;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 22 / 0;
            }
            return nativeExtensionOnExtraCallback;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ NativeExtension[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 77;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            NativeExtension[] nativeExtensionArrOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
            int i5 = onNavigationEvent + 29;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return nativeExtensionArrOnExtraCallbackWithResult;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final NativeExtension onExtraCallback(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            NativeExtension nativeExtension = new NativeExtension(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString());
            int i2 = onNavigationEvent + 17;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return nativeExtension;
        }

        public final NativeExtension[] onExtraCallbackWithResult(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 21;
            IAuthTabCallback = i3 % 128;
            NativeExtension[] nativeExtensionArr = new NativeExtension[i];
            if (i3 % 2 != 0) {
                return nativeExtensionArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(adInfo adinfo) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(adinfo);
        if (i3 == 0) {
            int i4 = 86 / 0;
        }
        return unitIAuthTabCallback;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 39;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2 == 0 ? 1 : 0;
        int i5 = i2 + 25;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NativeExtension)) {
            return false;
        }
        NativeExtension nativeExtension = (NativeExtension) obj;
        if (!Intrinsics.areEqual(this.sdkTemplateId, nativeExtension.sdkTemplateId)) {
            return false;
        }
        if (this.schemaVersion != nativeExtension.schemaVersion) {
            int i2 = onExtraCallbackWithResult + 33;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.raw, nativeExtension.raw)) {
            return false;
        }
        if (Intrinsics.areEqual(this.slotId, nativeExtension.slotId)) {
            return true;
        }
        int i4 = onExtraCallbackWithResult;
        int i5 = i4 + 117;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 21;
        onExtraCallback = i7 % 128;
        if (i7 % 2 == 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 41;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((this.sdkTemplateId.hashCode() * 31) + Integer.hashCode(this.schemaVersion)) * 31) + this.raw.hashCode()) * 31) + this.slotId.hashCode();
        int i4 = onExtraCallbackWithResult + 33;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "NativeExtension(sdkTemplateId=" + this.sdkTemplateId + ", schemaVersion=" + this.schemaVersion + ", raw=" + this.raw + ", slotId=" + this.slotId + ")";
        int i2 = onExtraCallbackWithResult + 45;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 75;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.sdkTemplateId);
        parcel.writeInt(this.schemaVersion);
        parcel.writeString(this.raw);
        parcel.writeString(this.slotId);
        if (i4 == 0) {
            throw null;
        }
    }

    public NativeExtension(@NotNull String str, int i, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.sdkTemplateId = str;
        this.schemaVersion = i;
        this.raw = str2;
        this.slotId = str3;
    }

    public static final /* synthetic */ wie2 onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return decodeJson;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ NativeExtension(String str, int i, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = onExtraCallbackWithResult + 33;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            i = 0;
        }
        str2 = (i2 & 4) != 0 ? "" : str2;
        if ((i2 & 8) != 0) {
            int i6 = onExtraCallbackWithResult + 15;
            onExtraCallback = i6 % 128;
            if (i6 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i7 = 2 % 2;
            str3 = "";
        }
        this(str, i, str2, str3);
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 47;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.sdkTemplateId;
        int i4 = i3 + 107;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final int onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 121;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.schemaVersion;
        int i6 = i2 + 115;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 29;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.raw;
        int i5 = i3 + 25;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 89;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.slotId;
        int i5 = i3 + 47;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<NativeExtension> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 35;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                addTouchables addtouchables = addTouchables.onWarmupCompleted;
                throw null;
            }
            addTouchables addtouchables2 = addTouchables.onWarmupCompleted;
            int i3 = onExtraCallbackWithResult + 71;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return addtouchables2;
        }

        public final wie2 onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 85;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            wie2 wie2VarOnNavigationEvent = NativeExtension.onNavigationEvent();
            int i4 = IAuthTabCallback + 43;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return wie2VarOnNavigationEvent;
            }
            throw null;
        }
    }

    static {
        int i = IAuthTabCallback + 103;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private static final Unit IAuthTabCallback(adInfo adinfo) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 37;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(adinfo, "");
            adinfo.IAuthTabCallback(true);
            adinfo.onNavigationEvent(true);
            int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            int iOnExtraCallback2 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            int iOnExtraCallback3 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            adInfo.onExtraCallbackWithResult(-186882588, AUTextView.onExtraCallbackWithResult.onExtraCallback(), iOnExtraCallback3, 186882589, new Object[]{adinfo, false}, iOnExtraCallback2, iOnExtraCallback);
        } else {
            Intrinsics.checkNotNullParameter(adinfo, "");
            adinfo.IAuthTabCallback(true);
            adinfo.onNavigationEvent(false);
            int iOnExtraCallback4 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            int iOnExtraCallback5 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            int iOnExtraCallback6 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            adInfo.onExtraCallbackWithResult(-186882588, AUTextView.onExtraCallbackWithResult.onExtraCallback(), iOnExtraCallback6, 186882589, new Object[]{adinfo, true}, iOnExtraCallback5, iOnExtraCallback4);
        }
        return Unit.INSTANCE;
    }
}
