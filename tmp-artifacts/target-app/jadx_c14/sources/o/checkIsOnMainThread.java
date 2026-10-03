package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class checkIsOnMainThread extends RCTCodelessLoggingEventListener {
    public static final Parcelable.Creator<checkIsOnMainThread> CREATOR = new onExtraCallbackWithResult();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final Boolean clearPreviousLayouts;
    private final reportDexLoadingIssue cta;
    private final String ctaTextRemainingAgree;
    private final List<createAudienceNetworkAdsApi> fields;
    private final String key;
    private final List<String> lastDescriptions;
    private final Map<String, Object> logParam;
    private final DynamicLoader navigationRightButton;
    private final RCTCodelessLoggingEventListener onBack;
    private final String subTitle;
    private final String title;
    private final String type;

    public static final class onExtraCallbackWithResult implements Parcelable.Creator<checkIsOnMainThread> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final o.checkIsOnMainThread IAuthTabCallback(android.os.Parcel r18) {
            /*
                r17 = this;
                r0 = r18
                r1 = 2
                int r2 = r1 % r1
                java.lang.String r2 = ""
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
                java.lang.String r4 = r18.readString()
                java.lang.String r5 = r18.readString()
                java.lang.Class<o.checkIsOnMainThread> r2 = o.checkIsOnMainThread.class
                java.lang.ClassLoader r2 = r2.getClassLoader()
                android.os.Parcelable r2 = r0.readParcelable(r2)
                r6 = r2
                o.RCTCodelessLoggingEventListener r6 = (o.RCTCodelessLoggingEventListener) r6
                int r2 = r18.readInt()
                r3 = 0
                r7 = 0
                if (r2 != 0) goto L29
                r2 = r7
                goto L42
            L29:
                int r2 = r18.readInt()
                if (r2 == 0) goto L3d
                int r2 = o.checkIsOnMainThread.onExtraCallbackWithResult.onExtraCallbackWithResult
                int r2 = r2 + 35
                int r8 = r2 % 128
                o.checkIsOnMainThread.onExtraCallbackWithResult.onWarmupCompleted = r8
                int r2 = r2 % r1
                if (r2 == 0) goto L3b
                goto L3d
            L3b:
                r2 = 1
                goto L3e
            L3d:
                r2 = r3
            L3e:
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            L42:
                int r8 = r18.readInt()
                if (r8 != 0) goto L59
                int r8 = o.checkIsOnMainThread.onExtraCallbackWithResult.onExtraCallbackWithResult
                int r8 = r8 + 105
                int r9 = r8 % 128
                o.checkIsOnMainThread.onExtraCallbackWithResult.onWarmupCompleted = r9
                int r8 = r8 % r1
                if (r8 != 0) goto L55
                r8 = r7
                goto L5f
            L55:
                r7.hashCode()
                throw r7
            L59:
                android.os.Parcelable$Creator<o.DynamicLoader> r8 = o.DynamicLoader.CREATOR
                java.lang.Object r8 = r8.createFromParcel(r0)
            L5f:
                o.DynamicLoader r8 = (o.DynamicLoader) r8
                o.Preconditions r9 = o.Preconditions.INSTANCE
                java.util.Map r9 = r9.onNavigationEvent(r0)
                java.lang.String r10 = r18.readString()
                java.lang.String r11 = r18.readString()
                java.lang.String r12 = r18.readString()
                java.util.ArrayList r13 = r18.createStringArrayList()
                int r14 = r18.readInt()
                java.util.ArrayList r15 = new java.util.ArrayList
                r15.<init>(r14)
            L80:
                if (r3 == r14) goto L96
                int r16 = r18.readInt()
                if (r16 != 0) goto L89
                goto L8f
            L89:
                android.os.Parcelable$Creator<o.createAudienceNetworkAdsApi> r7 = o.createAudienceNetworkAdsApi.CREATOR
                java.lang.Object r7 = r7.createFromParcel(r0)
            L8f:
                r15.add(r7)
                int r3 = r3 + 1
                r7 = 0
                goto L80
            L96:
                o.checkIsOnMainThread r16 = new o.checkIsOnMainThread
                android.os.Parcelable$Creator<o.reportDexLoadingIssue> r3 = o.reportDexLoadingIssue.CREATOR
                java.lang.Object r0 = r3.createFromParcel(r0)
                o.reportDexLoadingIssue r0 = (o.reportDexLoadingIssue) r0
                r3 = r16
                r7 = r2
                r14 = r15
                r15 = r0
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
                int r0 = o.checkIsOnMainThread.onExtraCallbackWithResult.onExtraCallbackWithResult
                int r0 = r0 + 87
                int r2 = r0 % 128
                o.checkIsOnMainThread.onExtraCallbackWithResult.onWarmupCompleted = r2
                int r0 = r0 % r1
                return r16
            */
            throw new UnsupportedOperationException("Method not decompiled: o.checkIsOnMainThread.onExtraCallbackWithResult.IAuthTabCallback(android.os.Parcel):o.checkIsOnMainThread");
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ checkIsOnMainThread createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 59;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            checkIsOnMainThread checkisonmainthreadIAuthTabCallback = IAuthTabCallback(parcel);
            if (i3 == 0) {
                int i4 = 4 / 0;
            }
            return checkisonmainthreadIAuthTabCallback;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ checkIsOnMainThread[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 89;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                return onExtraCallbackWithResult(i);
            }
            onExtraCallbackWithResult(i);
            throw null;
        }

        public final checkIsOnMainThread[] onExtraCallbackWithResult(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted;
            int i4 = i3 + 59;
            onExtraCallbackWithResult = i4 % 128;
            checkIsOnMainThread[] checkisonmainthreadArr = new checkIsOnMainThread[i];
            if (i4 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = i3 + 83;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 12 / 0;
            }
            return checkisonmainthreadArr;
        }
    }

    static {
        int i = onExtraCallback + 49;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 1;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 117;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return 0;
        }
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.key);
        parcel.writeString(this.type);
        parcel.writeParcelable(this.onBack, i);
        Boolean bool = this.clearPreviousLayouts;
        if (bool == null) {
            int i3 = IAuthTabCallback + 73;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
            int i5 = IAuthTabCallback + 111;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
        }
        DynamicLoader dynamicLoader = this.navigationRightButton;
        if (dynamicLoader == null) {
            int i7 = IAuthTabCallback + 9;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dynamicLoader.writeToParcel(parcel, i);
        }
        Preconditions.INSTANCE.onExtraCallbackWithResult(this.logParam, parcel, i);
        parcel.writeString(this.title);
        parcel.writeString(this.subTitle);
        parcel.writeString(this.ctaTextRemainingAgree);
        parcel.writeStringList(this.lastDescriptions);
        List<createAudienceNetworkAdsApi> list = this.fields;
        parcel.writeInt(list.size());
        for (createAudienceNetworkAdsApi createaudiencenetworkadsapi : list) {
            if (createaudiencenetworkadsapi == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                createaudiencenetworkadsapi.writeToParcel(parcel, i);
                int i9 = IAuthTabCallback + 19;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
            }
        }
        this.cta.writeToParcel(parcel, i);
        int i11 = onNavigationEvent + 103;
        IAuthTabCallback = i11 % 128;
        if (i11 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public checkIsOnMainThread(@NotNull String str, @NotNull String str2, @Nullable RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map, @NotNull String str3, @Nullable String str4, @NotNull String str5, @Nullable List<String> list, @NotNull List<createAudienceNetworkAdsApi> list2, @NotNull reportDexLoadingIssue reportdexloadingissue) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(reportdexloadingissue, "");
        this.key = str;
        this.type = str2;
        this.onBack = rCTCodelessLoggingEventListener;
        this.clearPreviousLayouts = bool;
        this.navigationRightButton = dynamicLoader;
        this.logParam = map;
        this.title = str3;
        this.subTitle = str4;
        this.ctaTextRemainingAgree = str5;
        this.lastDescriptions = list;
        this.fields = list2;
        this.cta = reportdexloadingissue;
    }

    public String onExtraCallbackWithResult() {
        String str;
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 93;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.key;
            int i4 = 32 / 0;
        } else {
            str = this.key;
        }
        int i5 = i2 + 65;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 26 / 0;
        }
        return str;
    }

    public String IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 43;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String str = this.type;
        if (i3 != 0) {
            int i4 = 69 / 0;
        }
        return str;
    }

    public RCTCodelessLoggingEventListener asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 3;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = this.onBack;
        int i5 = i2 + 123;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 6 / 0;
        }
        return rCTCodelessLoggingEventListener;
    }

    public Boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 65;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Boolean bool = this.clearPreviousLayouts;
        int i5 = i2 + 25;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return bool;
    }

    public DynamicLoader onTransact() {
        DynamicLoader dynamicLoader;
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 65;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            dynamicLoader = this.navigationRightButton;
            int i4 = 32 / 0;
        } else {
            dynamicLoader = this.navigationRightButton;
        }
        int i5 = i2 + 71;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return dynamicLoader;
    }

    public Map<String, Object> IAuthTabCallbackDefault() {
        Map<String, Object> map;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 101;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 != 0) {
            map = this.logParam;
            int i4 = 38 / 0;
        } else {
            map = this.logParam;
        }
        int i5 = i3 + 17;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return map;
        }
        throw null;
    }

    public final String getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.title;
        int i5 = i3 + 71;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 62 / 0;
        }
        return str;
    }

    public final String asInterface() {
        String str;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 91;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 != 0) {
            str = this.subTitle;
            int i4 = 92 / 0;
        } else {
            str = this.subTitle;
        }
        int i5 = i3 + 15;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 31;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return this.ctaTextRemainingAgree;
        }
        throw null;
    }

    public final List<String> IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 71;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        List<String> list = this.lastDescriptions;
        int i5 = i2 + 23;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 11 / 0;
        }
        return list;
    }

    public final List<createAudienceNetworkAdsApi> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        List<createAudienceNetworkAdsApi> list = this.fields;
        int i5 = i3 + 9;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final reportDexLoadingIssue onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 57;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        reportDexLoadingIssue reportdexloadingissue = this.cta;
        int i4 = i2 + 59;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 43 / 0;
        }
        return reportdexloadingissue;
    }
}
