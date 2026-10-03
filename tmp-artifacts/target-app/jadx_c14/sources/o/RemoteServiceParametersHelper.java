package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.cardsales.recommend.CardRecommendCardImage;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RemoteServiceParametersHelper extends RCTCodelessLoggingEventListener {
    public static final Parcelable.Creator<RemoteServiceParametersHelper> CREATOR = new onNavigationEvent();
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final Boolean clearPreviousLayouts;
    private final reportDexLoadingIssue cta;
    private final CardRecommendCardImage image;
    private final List<FileUtilsParentDirNotFoundException> items;
    private final String key;
    private final Map<String, Object> logParam;
    private final DynamicLoader navigationRightButton;
    private final RCTCodelessLoggingEventListener onBack;
    private final String subTitle;
    private final String title;
    private final String type;

    public static final class onNavigationEvent implements Parcelable.Creator<RemoteServiceParametersHelper> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ RemoteServiceParametersHelper createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 33;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            RemoteServiceParametersHelper remoteServiceParametersHelperOnExtraCallbackWithResult = onExtraCallbackWithResult(parcel);
            int i4 = IAuthTabCallback + 25;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return remoteServiceParametersHelperOnExtraCallbackWithResult;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ RemoteServiceParametersHelper[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 51;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            RemoteServiceParametersHelper[] remoteServiceParametersHelperArrOnNavigationEvent = onNavigationEvent(i);
            int i5 = onExtraCallback + 19;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return remoteServiceParametersHelperArrOnNavigationEvent;
        }

        public final RemoteServiceParametersHelper onExtraCallbackWithResult(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = (RCTCodelessLoggingEventListener) parcel.readParcelable(RemoteServiceParametersHelper.class.getClassLoader());
            DynamicLoader dynamicLoaderCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    int i2 = IAuthTabCallback + 107;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
                int i4 = onExtraCallback + 125;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
            }
            if (parcel.readInt() != 0) {
                int i6 = IAuthTabCallback + 25;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                dynamicLoaderCreateFromParcel = DynamicLoader.CREATOR.createFromParcel(parcel);
            }
            DynamicLoader dynamicLoader = dynamicLoaderCreateFromParcel;
            Map<String, Object> mapOnNavigationEvent = Preconditions.INSTANCE.onNavigationEvent(parcel);
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            CardRecommendCardImage cardRecommendCardImageCreateFromParcel = CardRecommendCardImage.CREATOR.createFromParcel(parcel);
            int i8 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i8);
            for (int i9 = 0; i9 != i8; i9++) {
                arrayList.add(FileUtilsParentDirNotFoundException.CREATOR.createFromParcel(parcel));
            }
            return new RemoteServiceParametersHelper(string, string2, rCTCodelessLoggingEventListener, boolValueOf, dynamicLoader, mapOnNavigationEvent, string3, string4, cardRecommendCardImageCreateFromParcel, arrayList, reportDexLoadingIssue.CREATOR.createFromParcel(parcel));
        }

        public final RemoteServiceParametersHelper[] onNavigationEvent(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback;
            int i4 = i3 + 25;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            RemoteServiceParametersHelper[] remoteServiceParametersHelperArr = new RemoteServiceParametersHelper[i];
            int i6 = i3 + 19;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 72 / 0;
            }
            return remoteServiceParametersHelperArr;
        }
    }

    static {
        int i = IAuthTabCallback + 75;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 1;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 35;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 18 / 0;
        }
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 107;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.key);
        parcel.writeString(this.type);
        parcel.writeParcelable(this.onBack, i);
        Boolean bool = this.clearPreviousLayouts;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        DynamicLoader dynamicLoader = this.navigationRightButton;
        if (dynamicLoader == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dynamicLoader.writeToParcel(parcel, i);
            int i5 = onExtraCallbackWithResult + 81;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
        }
        Preconditions.INSTANCE.onExtraCallbackWithResult(this.logParam, parcel, i);
        parcel.writeString(this.title);
        parcel.writeString(this.subTitle);
        this.image.writeToParcel(parcel, i);
        List<FileUtilsParentDirNotFoundException> list = this.items;
        parcel.writeInt(list.size());
        Iterator<FileUtilsParentDirNotFoundException> it = list.iterator();
        int i7 = onExtraCallbackWithResult + 75;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        while (!(!it.hasNext())) {
            it.next().writeToParcel(parcel, i);
        }
        this.cta.writeToParcel(parcel, i);
        int i9 = onExtraCallbackWithResult + 27;
        onNavigationEvent = i9 % 128;
        if (i9 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public RemoteServiceParametersHelper(@NotNull String str, @NotNull String str2, @Nullable RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map, @NotNull String str3, @Nullable String str4, @NotNull CardRecommendCardImage cardRecommendCardImage, @NotNull List<FileUtilsParentDirNotFoundException> list, @NotNull reportDexLoadingIssue reportdexloadingissue) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(cardRecommendCardImage, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(reportdexloadingissue, "");
        this.key = str;
        this.type = str2;
        this.onBack = rCTCodelessLoggingEventListener;
        this.clearPreviousLayouts = bool;
        this.navigationRightButton = dynamicLoader;
        this.logParam = map;
        this.title = str3;
        this.subTitle = str4;
        this.image = cardRecommendCardImage;
        this.items = list;
        this.cta = reportdexloadingissue;
    }

    public String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 69;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return this.key;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 85;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.type;
        int i5 = i2 + 55;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 18 / 0;
        }
        return str;
    }

    public RCTCodelessLoggingEventListener asBinder() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 79;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = this.onBack;
        int i5 = i3 + 13;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return rCTCodelessLoggingEventListener;
    }

    public Boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 85;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        Boolean bool = this.clearPreviousLayouts;
        int i4 = i2 + 75;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 12 / 0;
        }
        return bool;
    }

    public DynamicLoader onTransact() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 81;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        DynamicLoader dynamicLoader = this.navigationRightButton;
        int i5 = i3 + 35;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return dynamicLoader;
    }

    public Map<String, Object> IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 53;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        Map<String, Object> map = this.logParam;
        int i4 = i3 + 65;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return map;
    }

    public final String asInterface() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 85;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.title;
        int i5 = i2 + 67;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 63;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.subTitle;
        int i4 = i2 + 49;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final CardRecommendCardImage onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 51;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        CardRecommendCardImage cardRecommendCardImage = this.image;
        int i5 = i3 + 29;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return cardRecommendCardImage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<FileUtilsParentDirNotFoundException> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 59;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        List<FileUtilsParentDirNotFoundException> list = this.items;
        int i4 = i2 + 33;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public final reportDexLoadingIssue IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 125;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        reportDexLoadingIssue reportdexloadingissue = this.cta;
        int i4 = i3 + 107;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return reportdexloadingissue;
    }
}
