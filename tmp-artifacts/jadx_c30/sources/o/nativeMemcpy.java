package o;

import android.os.Parcel;
import android.os.Parcelable;
import im.toss.features.home.core.ui.compose.dst.HomeAssetSubCategoryHeaderKt$;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.notification.group.RecentMessagesDto;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class nativeMemcpy implements Parcelable {
    public static final Parcelable.Creator<nativeMemcpy> CREATOR = new onExtraCallbackWithResult();
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final RecentMessagesDto item;
    private final int lastVisibleIndexAtClick;

    public static final class onExtraCallbackWithResult implements Parcelable.Creator<nativeMemcpy> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public final nativeMemcpy IAuthTabCallback(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
            nativeMemcpy nativememcpy = new nativeMemcpy((RecentMessagesDto) RecentMessagesDto.CREATOR.createFromParcel(parcel), parcel.readInt());
            int i2 = onWarmupCompleted + 37;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return nativememcpy;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ nativeMemcpy createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 73;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            nativeMemcpy nativememcpyIAuthTabCallback = IAuthTabCallback(parcel);
            int i4 = onExtraCallbackWithResult + 103;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return nativememcpyIAuthTabCallback;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ nativeMemcpy[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 19;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                return onNavigationEvent(i);
            }
            onNavigationEvent(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final nativeMemcpy[] onNavigationEvent(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 79;
            int i4 = i3 % 128;
            onWarmupCompleted = i4;
            int i5 = i3 % 2;
            nativeMemcpy[] nativememcpyArr = new nativeMemcpy[i];
            int i6 = i4 + 13;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return nativememcpyArr;
        }
    }

    static {
        int i = onExtraCallback + 73;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 73;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 7;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 85 / 0;
        }
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallbackWithResult + 45;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 21;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 65 / 0;
            }
            return true;
        }
        if (!(obj instanceof nativeMemcpy)) {
            int i7 = onExtraCallbackWithResult + 125;
            IAuthTabCallback = i7 % 128;
            return i7 % 2 != 0;
        }
        nativeMemcpy nativememcpy = (nativeMemcpy) obj;
        if (!Intrinsics.areEqual(this.item, nativememcpy.item)) {
            return false;
        }
        if (this.lastVisibleIndexAtClick == nativememcpy.lastVisibleIndexAtClick) {
            return true;
        }
        int i8 = onExtraCallbackWithResult + 105;
        IAuthTabCallback = i8 % 128;
        return i8 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 7;
        IAuthTabCallback = i2 % 128;
        int iHashCode = i2 % 2 != 0 ? (this.item.hashCode() / 83) >>> Integer.hashCode(this.lastVisibleIndexAtClick) : (this.item.hashCode() * 31) + Integer.hashCode(this.lastVisibleIndexAtClick);
        int i3 = IAuthTabCallback + 75;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ClickBlockNotificationInfo(item=" + this.item + ", lastVisibleIndexAtClick=" + this.lastVisibleIndexAtClick + ")";
        int i2 = onExtraCallbackWithResult + 113;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 19;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
        RecentMessagesDto.onNavigationEvent(new Object[]{this.item, parcel, Integer.valueOf(i)}, -1019075529, 1019075531, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback());
        parcel.writeInt(this.lastVisibleIndexAtClick);
        int i5 = onExtraCallbackWithResult + 13;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public nativeMemcpy(@NotNull RecentMessagesDto recentMessagesDto, int i) {
        Intrinsics.checkNotNullParameter(recentMessagesDto, BuildConfig.FLAVOR);
        this.item = recentMessagesDto;
        this.lastVisibleIndexAtClick = i;
    }
}
