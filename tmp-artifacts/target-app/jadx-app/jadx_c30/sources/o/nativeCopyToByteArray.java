package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class nativeCopyToByteArray implements Parcelable {
    public static final Parcelable.Creator<nativeCopyToByteArray> CREATOR = new onExtraCallback();
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    @SerializedName("contentType")
    private final NativeMemoryChunkPool contentType;

    @SerializedName("contentUrl")
    private final String contentUrl;

    @SerializedName("height")
    private final int height;

    @SerializedName("width")
    private final int width;

    public static final class onExtraCallback implements Parcelable.Creator<nativeCopyToByteArray> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ nativeCopyToByteArray createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 67;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            nativeCopyToByteArray nativecopytobytearrayOnExtraCallbackWithResult = onExtraCallbackWithResult(parcel);
            int i4 = onExtraCallback + 1;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return nativecopytobytearrayOnExtraCallbackWithResult;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ nativeCopyToByteArray[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 65;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            nativeCopyToByteArray[] nativecopytobytearrayArrOnExtraCallback = onExtraCallback(i);
            int i5 = onNavigationEvent + 109;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return nativecopytobytearrayArrOnExtraCallback;
        }

        public final nativeCopyToByteArray[] onExtraCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 65;
            int i4 = i3 % 128;
            onExtraCallback = i4;
            int i5 = i3 % 2;
            nativeCopyToByteArray[] nativecopytobytearrayArr = new nativeCopyToByteArray[i];
            int i6 = i4 + 7;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 != 0) {
                return nativecopytobytearrayArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final nativeCopyToByteArray onExtraCallbackWithResult(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
            nativeCopyToByteArray nativecopytobytearray = new nativeCopyToByteArray(NativeMemoryChunkPool.valueOf(parcel.readString()), parcel.readString(), parcel.readInt(), parcel.readInt());
            int i2 = onNavigationEvent + 121;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return nativecopytobytearray;
        }
    }

    static {
        int i = onExtraCallback + 61;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        IAuthTabCallback = i2 % 128;
        return i2 % 2 != 0 ? 1 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r7 instanceof o.nativeCopyToByteArray) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        r7 = (o.nativeCopyToByteArray) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
    
        if (r6.contentType == r7.contentType) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
    
        r1 = r1 + 73;
        o.nativeCopyToByteArray.onNavigationEvent = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r6.contentUrl, r7.contentUrl) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
    
        if (r6.width == r7.width) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
    
        if (r6.height == r7.height) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0046, code lost:
    
        r7 = o.nativeCopyToByteArray.onNavigationEvent + 31;
        o.nativeCopyToByteArray.IAuthTabCallback = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 15;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 11 / 0;
        }
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 31;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((this.contentType.hashCode() * 31) + this.contentUrl.hashCode()) * 31) + Integer.hashCode(this.width)) * 31) + Integer.hashCode(this.height);
        int i4 = IAuthTabCallback + 55;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Content(contentType=" + this.contentType + ", contentUrl=" + this.contentUrl + ", width=" + this.width + ", height=" + this.height + ")";
        int i2 = onNavigationEvent + 87;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 61;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
        parcel.writeString(this.contentType.name());
        parcel.writeString(this.contentUrl);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        int i5 = IAuthTabCallback + 51;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
    }

    public nativeCopyToByteArray(@NotNull NativeMemoryChunkPool nativeMemoryChunkPool, @NotNull String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(nativeMemoryChunkPool, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        this.contentType = nativeMemoryChunkPool;
        this.contentUrl = str;
        this.width = i;
        this.height = i2;
    }
}
