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

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class nowNanos extends RCTCodelessLoggingEventListener {
    public static final Parcelable.Creator<nowNanos> CREATOR = new onNavigationEvent();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final Boolean clearPreviousLayouts;
    private final List<doCallInitialize> contents;
    private final reportDexLoadingIssue cta;
    private final String ctaTextRemainingScroll;
    private final String key;
    private final Map<String, Object> logParam;
    private final DynamicLoader navigationRightButton;
    private final RCTCodelessLoggingEventListener onBack;
    private final boolean requiresScrollToBottom;
    private final String subtitle;
    private final String title;
    private final createDefaultMediaViewVideoRendererApi topButton;
    private final String type;

    public static final class onNavigationEvent implements Parcelable.Creator<nowNanos> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public final nowNanos IAuthTabCallback(Parcel parcel) {
            Boolean boolValueOf;
            DynamicLoader dynamicLoaderCreateFromParcel;
            boolean z;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = (RCTCodelessLoggingEventListener) parcel.readParcelable(nowNanos.class.getClassLoader());
            createDefaultMediaViewVideoRendererApi createdefaultmediaviewvideorendererapiCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                int i2 = onNavigationEvent + 103;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 62 / 0;
                }
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                int i4 = IAuthTabCallback + 9;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                dynamicLoaderCreateFromParcel = null;
            } else {
                dynamicLoaderCreateFromParcel = DynamicLoader.CREATOR.createFromParcel(parcel);
            }
            DynamicLoader dynamicLoader = dynamicLoaderCreateFromParcel;
            Map<String, Object> mapOnNavigationEvent = Preconditions.INSTANCE.onNavigationEvent(parcel);
            String string3 = parcel.readString();
            if (parcel.readInt() != 0) {
                createdefaultmediaviewvideorendererapiCreateFromParcel = createDefaultMediaViewVideoRendererApi.CREATOR.createFromParcel(parcel);
                int i6 = onNavigationEvent + 71;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
            }
            createDefaultMediaViewVideoRendererApi createdefaultmediaviewvideorendererapi = createdefaultmediaviewvideorendererapiCreateFromParcel;
            String string4 = parcel.readString();
            int i8 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i8);
            for (int i9 = 0; i9 != i8; i9++) {
                arrayList.add(parcel.readParcelable(nowNanos.class.getClassLoader()));
            }
            reportDexLoadingIssue reportdexloadingissueCreateFromParcel = reportDexLoadingIssue.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                int i10 = IAuthTabCallback + 69;
                onNavigationEvent = i10 % 128;
                int i11 = i10 % 2;
                z = false;
            } else {
                z = true;
            }
            return new nowNanos(string, string2, rCTCodelessLoggingEventListener, boolValueOf, dynamicLoader, mapOnNavigationEvent, string3, createdefaultmediaviewvideorendererapi, string4, arrayList, reportdexloadingissueCreateFromParcel, z, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ nowNanos createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 47;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return IAuthTabCallback(parcel);
            }
            IAuthTabCallback(parcel);
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ nowNanos[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 67;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            nowNanos[] nownanosArrOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
            int i5 = onNavigationEvent + 45;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return nownanosArrOnExtraCallbackWithResult;
        }

        public final nowNanos[] onExtraCallbackWithResult(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 29;
            onNavigationEvent = i3 % 128;
            nowNanos[] nownanosArr = new nowNanos[i];
            if (i3 % 2 == 0) {
                return nownanosArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = onExtraCallback + 1;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 113;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 63;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 38 / 0;
        }
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 27;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            int i5 = i4 + 81;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof nowNanos)) {
            int i7 = i2 + 31;
            onWarmupCompleted = i7 % 128;
            return i7 % 2 != 0;
        }
        nowNanos nownanos = (nowNanos) obj;
        if (!Intrinsics.areEqual(this.type, nownanos.type)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.key, nownanos.key)) {
            int i8 = onWarmupCompleted + 55;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onBack, nownanos.onBack)) {
            int i10 = onWarmupCompleted + 41;
            IAuthTabCallback = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.clearPreviousLayouts, nownanos.clearPreviousLayouts)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.navigationRightButton, nownanos.navigationRightButton)) {
            int i12 = onWarmupCompleted + 103;
            IAuthTabCallback = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.logParam, nownanos.logParam)) {
            int i14 = onWarmupCompleted + 89;
            IAuthTabCallback = i14 % 128;
            return i14 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.title, nownanos.title)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.topButton, nownanos.topButton)) {
            int i15 = onWarmupCompleted + 43;
            IAuthTabCallback = i15 % 128;
            return i15 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.subtitle, nownanos.subtitle)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.contents, nownanos.contents)) {
            int i16 = onWarmupCompleted + 113;
            IAuthTabCallback = i16 % 128;
            if (i16 % 2 != 0) {
                return false;
            }
            throw null;
        }
        if (!Intrinsics.areEqual(this.cta, nownanos.cta)) {
            return false;
        }
        if (this.requiresScrollToBottom == nownanos.requiresScrollToBottom) {
            return Intrinsics.areEqual(this.ctaTextRemainingScroll, nownanos.ctaTextRemainingScroll);
        }
        int i17 = onWarmupCompleted + 91;
        IAuthTabCallback = i17 % 128;
        if (i17 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.type.hashCode();
        int iHashCode3 = this.key.hashCode();
        RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = this.onBack;
        int iHashCode4 = 0;
        int iHashCode5 = rCTCodelessLoggingEventListener == null ? 0 : rCTCodelessLoggingEventListener.hashCode();
        Boolean bool = this.clearPreviousLayouts;
        int iHashCode6 = bool == null ? 0 : bool.hashCode();
        DynamicLoader dynamicLoader = this.navigationRightButton;
        int iHashCode7 = dynamicLoader == null ? 0 : dynamicLoader.hashCode();
        Map<String, Object> map = this.logParam;
        int iHashCode8 = map == null ? 0 : map.hashCode();
        int iHashCode9 = this.title.hashCode();
        createDefaultMediaViewVideoRendererApi createdefaultmediaviewvideorendererapi = this.topButton;
        if (createdefaultmediaviewvideorendererapi == null) {
            int i2 = IAuthTabCallback + 27;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = createdefaultmediaviewvideorendererapi.hashCode();
        }
        int iHashCode10 = this.subtitle.hashCode();
        int iHashCode11 = this.contents.hashCode();
        int iHashCode12 = this.cta.hashCode();
        int iHashCode13 = Boolean.hashCode(this.requiresScrollToBottom);
        String str = this.ctaTextRemainingScroll;
        if (str != null) {
            int i4 = onWarmupCompleted + 93;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            iHashCode4 = str.hashCode();
        }
        return (((((((((((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode4;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ProductDescriptionLayoutDto(type=" + this.type + ", key=" + this.key + ", onBack=" + this.onBack + ", clearPreviousLayouts=" + this.clearPreviousLayouts + ", navigationRightButton=" + this.navigationRightButton + ", logParam=" + this.logParam + ", title=" + this.title + ", topButton=" + this.topButton + ", subtitle=" + this.subtitle + ", contents=" + this.contents + ", cta=" + this.cta + ", requiresScrollToBottom=" + this.requiresScrollToBottom + ", ctaTextRemainingScroll=" + this.ctaTextRemainingScroll + ")";
        int i2 = onWarmupCompleted + 11;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.type);
        parcel.writeString(this.key);
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
            int i3 = IAuthTabCallback + 121;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
        } else {
            parcel.writeInt(1);
            dynamicLoader.writeToParcel(parcel, i);
        }
        Preconditions.INSTANCE.onExtraCallbackWithResult(this.logParam, parcel, i);
        parcel.writeString(this.title);
        createDefaultMediaViewVideoRendererApi createdefaultmediaviewvideorendererapi = this.topButton;
        if (createdefaultmediaviewvideorendererapi == null) {
            parcel.writeInt(0);
            int i5 = IAuthTabCallback + 15;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
        } else {
            parcel.writeInt(1);
            createdefaultmediaviewvideorendererapi.writeToParcel(parcel, i);
        }
        parcel.writeString(this.subtitle);
        List<doCallInitialize> list = this.contents;
        parcel.writeInt(list.size());
        Iterator<doCallInitialize> it = list.iterator();
        while (it.hasNext()) {
            int i7 = IAuthTabCallback + 21;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            parcel.writeParcelable(it.next(), i);
        }
        this.cta.writeToParcel(parcel, i);
        parcel.writeInt(this.requiresScrollToBottom ? 1 : 0);
        parcel.writeString(this.ctaTextRemainingScroll);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public nowNanos(@NotNull String str, @NotNull String str2, @Nullable RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map, @NotNull String str3, @Nullable createDefaultMediaViewVideoRendererApi createdefaultmediaviewvideorendererapi, @NotNull String str4, @NotNull List<? extends doCallInitialize> list, @NotNull reportDexLoadingIssue reportdexloadingissue, boolean z, @Nullable String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(reportdexloadingissue, "");
        this.type = str;
        this.key = str2;
        this.onBack = rCTCodelessLoggingEventListener;
        this.clearPreviousLayouts = bool;
        this.navigationRightButton = dynamicLoader;
        this.logParam = map;
        this.title = str3;
        this.topButton = createdefaultmediaviewvideorendererapi;
        this.subtitle = str4;
        this.contents = list;
        this.cta = reportdexloadingissue;
        this.requiresScrollToBottom = z;
        this.ctaTextRemainingScroll = str5;
    }

    public String IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        String str = this.type;
        if (i3 != 0) {
            int i4 = 58 / 0;
        }
        return str;
    }

    public String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 99;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.key;
        int i5 = i3 + 101;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public RCTCodelessLoggingEventListener asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 47;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = this.onBack;
        int i5 = i2 + 119;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 62 / 0;
        }
        return rCTCodelessLoggingEventListener;
    }

    public Boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 81;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Boolean bool = this.clearPreviousLayouts;
        int i5 = i2 + 27;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return bool;
        }
        throw null;
    }

    public DynamicLoader asInterface() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 89;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        DynamicLoader dynamicLoader = this.navigationRightButton;
        int i5 = i2 + 67;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return dynamicLoader;
    }

    public Map<String, Object> IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 97;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.logParam;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 31;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.title;
        int i4 = i3 + 119;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final createDefaultMediaViewVideoRendererApi access100() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 85;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        createDefaultMediaViewVideoRendererApi createdefaultmediaviewvideorendererapi = this.topButton;
        int i5 = i2 + 7;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 61 / 0;
        }
        return createdefaultmediaviewvideorendererapi;
    }

    public final String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 117;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.subtitle;
        int i5 = i3 + 63;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final List<doCallInitialize> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 57;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        List<doCallInitialize> list = this.contents;
        int i5 = i2 + 37;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final reportDexLoadingIssue onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 15;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        reportDexLoadingIssue reportdexloadingissue = this.cta;
        int i5 = i3 + 9;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return reportdexloadingissue;
        }
        throw null;
    }

    public final boolean onTransact() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 31;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.requiresScrollToBottom;
        if (i3 == 0) {
            int i4 = 89 / 0;
        }
        return z;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 53;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return this.ctaTextRemainingScroll;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
