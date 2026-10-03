package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.cardsales.recommend.CardRecommendCardImage;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class DynamicLoaderFactory implements Parcelable {
    public static final Parcelable.Creator<DynamicLoaderFactory> CREATOR = new onWarmupCompleted();
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final List<createNativeAdRatingApi> additionalFields;
    private final createAdSizeApi confirmAction;
    private final CardRecommendCardImage image;
    private final onExtraCallback style;
    private final String subTitle;
    private final String title;
    private final String value;

    public static final class onWarmupCompleted implements Parcelable.Creator<DynamicLoaderFactory> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0044 A[PHI: r2 r4 r6
          0x0044: PHI (r2v12 java.lang.String) = (r2v4 java.lang.String), (r2v13 java.lang.String) binds: [B:8:0x003d, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]
          0x0044: PHI (r4v12 java.lang.String) = (r4v1 java.lang.String), (r4v13 java.lang.String) binds: [B:8:0x003d, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]
          0x0044: PHI (r6v2 java.lang.String) = (r6v0 java.lang.String), (r6v3 java.lang.String) binds: [B:8:0x003d, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x003f A[PHI: r2 r4 r6
          0x003f: PHI (r2v5 java.lang.String) = (r2v4 java.lang.String), (r2v13 java.lang.String) binds: [B:8:0x003d, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]
          0x003f: PHI (r4v2 java.lang.String) = (r4v1 java.lang.String), (r4v13 java.lang.String) binds: [B:8:0x003d, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]
          0x003f: PHI (r6v1 java.lang.String) = (r6v0 java.lang.String), (r6v3 java.lang.String) binds: [B:8:0x003d, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final o.DynamicLoaderFactory IAuthTabCallback(android.os.Parcel r17) {
            /*
                r16 = this;
                r0 = r17
                r1 = 2
                int r2 = r1 % r1
                int r2 = o.DynamicLoaderFactory.onWarmupCompleted.IAuthTabCallback
                int r2 = r2 + 65
                int r3 = r2 % 128
                o.DynamicLoaderFactory.onWarmupCompleted.onNavigationEvent = r3
                int r2 = r2 % r1
                r3 = 0
                java.lang.String r4 = ""
                r5 = 0
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r4)
                if (r2 == 0) goto L2d
                java.lang.String r2 = r17.readString()
                java.lang.String r4 = r17.readString()
                java.lang.String r6 = r17.readString()
                int r7 = r17.readInt()
                r8 = 50
                int r8 = r8 / r3
                if (r7 != 0) goto L44
                goto L3f
            L2d:
                java.lang.String r2 = r17.readString()
                java.lang.String r4 = r17.readString()
                java.lang.String r6 = r17.readString()
                int r7 = r17.readInt()
                if (r7 != 0) goto L44
            L3f:
                r9 = r2
                r10 = r4
                r12 = r5
                r11 = r6
                goto L50
            L44:
                java.lang.String r7 = r17.readString()
                o.DynamicLoaderFactory$onExtraCallback r7 = o.DynamicLoaderFactory.onExtraCallback.valueOf(r7)
                r9 = r2
                r10 = r4
                r11 = r6
                r12 = r7
            L50:
                int r2 = r17.readInt()
                if (r2 == 0) goto L5c
                android.os.Parcelable$Creator<viva.republica.toss.network.model.cardsales.recommend.CardRecommendCardImage> r2 = viva.republica.toss.network.model.cardsales.recommend.CardRecommendCardImage.CREATOR
                java.lang.Object r5 = r2.createFromParcel(r0)
            L5c:
                r13 = r5
                viva.republica.toss.network.model.cardsales.recommend.CardRecommendCardImage r13 = (viva.republica.toss.network.model.cardsales.recommend.CardRecommendCardImage) r13
                java.lang.Class<o.DynamicLoaderFactory> r2 = o.DynamicLoaderFactory.class
                java.lang.ClassLoader r2 = r2.getClassLoader()
                android.os.Parcelable r2 = r0.readParcelable(r2)
                r14 = r2
                o.createAdSizeApi r14 = (o.createAdSizeApi) r14
                int r2 = r17.readInt()
                java.util.ArrayList r15 = new java.util.ArrayList
                r15.<init>(r2)
            L75:
                if (r3 == r2) goto La2
                int r4 = o.DynamicLoaderFactory.onWarmupCompleted.IAuthTabCallback
                int r4 = r4 + 73
                int r5 = r4 % 128
                o.DynamicLoaderFactory.onWarmupCompleted.onNavigationEvent = r5
                int r4 = r4 % r1
                if (r4 == 0) goto L92
                java.lang.Class<o.DynamicLoaderFactory> r4 = o.DynamicLoaderFactory.class
                java.lang.ClassLoader r4 = r4.getClassLoader()
                android.os.Parcelable r4 = r0.readParcelable(r4)
                r15.add(r4)
                int r3 = r3 + 34
                goto L75
            L92:
                java.lang.Class<o.DynamicLoaderFactory> r4 = o.DynamicLoaderFactory.class
                java.lang.ClassLoader r4 = r4.getClassLoader()
                android.os.Parcelable r4 = r0.readParcelable(r4)
                r15.add(r4)
                int r3 = r3 + 1
                goto L75
            La2:
                o.DynamicLoaderFactory r0 = new o.DynamicLoaderFactory
                r8 = r0
                r8.<init>(r9, r10, r11, r12, r13, r14, r15)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.DynamicLoaderFactory.onWarmupCompleted.IAuthTabCallback(android.os.Parcel):o.DynamicLoaderFactory");
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ DynamicLoaderFactory createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 111;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                IAuthTabCallback(parcel);
                throw null;
            }
            DynamicLoaderFactory dynamicLoaderFactoryIAuthTabCallback = IAuthTabCallback(parcel);
            int i3 = IAuthTabCallback + 39;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                return dynamicLoaderFactoryIAuthTabCallback;
            }
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ DynamicLoaderFactory[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 93;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                return onExtraCallbackWithResult(i);
            }
            onExtraCallbackWithResult(i);
            throw null;
        }

        public final DynamicLoaderFactory[] onExtraCallbackWithResult(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback;
            int i4 = i3 + 25;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            DynamicLoaderFactory[] dynamicLoaderFactoryArr = new DynamicLoaderFactory[i];
            int i6 = i3 + 63;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return dynamicLoaderFactoryArr;
        }
    }

    static {
        int i = IAuthTabCallback + 39;
        onExtraCallback = i % 128;
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
        int i2 = onExtraCallbackWithResult + 123;
        onWarmupCompleted = i2 % 128;
        return i2 % 2 == 0 ? 1 : 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DynamicLoaderFactory)) {
            return false;
        }
        DynamicLoaderFactory dynamicLoaderFactory = (DynamicLoaderFactory) obj;
        if (Intrinsics.areEqual(this.value, dynamicLoaderFactory.value)) {
            if (!(!Intrinsics.areEqual(this.title, dynamicLoaderFactory.title))) {
                if (!Intrinsics.areEqual(this.subTitle, dynamicLoaderFactory.subTitle)) {
                    int i2 = onExtraCallbackWithResult + 65;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    return false;
                }
                if (this.style != dynamicLoaderFactory.style) {
                    int i4 = onExtraCallbackWithResult + 93;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    return false;
                }
                if (!Intrinsics.areEqual(this.image, dynamicLoaderFactory.image)) {
                    return false;
                }
                Object obj2 = null;
                if (Intrinsics.areEqual(this.confirmAction, dynamicLoaderFactory.confirmAction)) {
                    if (!Intrinsics.areEqual(this.additionalFields, dynamicLoaderFactory.additionalFields)) {
                        return false;
                    }
                    int i6 = onExtraCallbackWithResult + 89;
                    onWarmupCompleted = i6 % 128;
                    if (i6 % 2 != 0) {
                        return true;
                    }
                    throw null;
                }
                int i7 = onWarmupCompleted + 101;
                int i8 = i7 % 128;
                onExtraCallbackWithResult = i8;
                int i9 = i7 % 2;
                int i10 = i8 + 17;
                onWarmupCompleted = i10 % 128;
                if (i10 % 2 != 0) {
                    return false;
                }
                obj2.hashCode();
                throw null;
            }
            int i11 = onWarmupCompleted + 121;
            onExtraCallbackWithResult = i11 % 128;
            if (i11 % 2 != 0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.value.hashCode();
        int iHashCode3 = this.title.hashCode();
        String str = this.subTitle;
        int iHashCode4 = 0;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        onExtraCallback onextracallback = this.style;
        int iHashCode6 = onextracallback == null ? 0 : onextracallback.hashCode();
        CardRecommendCardImage cardRecommendCardImage = this.image;
        if (cardRecommendCardImage == null) {
            iHashCode = 0;
        } else {
            iHashCode = cardRecommendCardImage.hashCode();
            int i2 = onWarmupCompleted + 3;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 5 % 5;
            }
        }
        createAdSizeApi createadsizeapi = this.confirmAction;
        if (createadsizeapi != null) {
            int i4 = onWarmupCompleted + 53;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int iHashCode7 = createadsizeapi.hashCode();
                int i5 = 11 / 0;
                iHashCode4 = iHashCode7;
            } else {
                iHashCode4 = createadsizeapi.hashCode();
            }
        }
        return (((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode) * 31) + iHashCode4) * 31) + this.additionalFields.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SelectOption(value=" + this.value + ", title=" + this.title + ", subTitle=" + this.subTitle + ", style=" + this.style + ", image=" + this.image + ", confirmAction=" + this.confirmAction + ", additionalFields=" + this.additionalFields + ")";
        int i2 = onWarmupCompleted + 97;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 13;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        if (i4 != 0) {
            parcel.writeString(this.value);
            parcel.writeString(this.title);
            parcel.writeString(this.subTitle);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        parcel.writeString(this.value);
        parcel.writeString(this.title);
        parcel.writeString(this.subTitle);
        onExtraCallback onextracallback = this.style;
        if (onextracallback == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(onextracallback.name());
        }
        CardRecommendCardImage cardRecommendCardImage = this.image;
        if (cardRecommendCardImage == null) {
            int i5 = onExtraCallbackWithResult + 59;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cardRecommendCardImage.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.confirmAction, i);
        List<createNativeAdRatingApi> list = this.additionalFields;
        parcel.writeInt(list.size());
        Iterator<createNativeAdRatingApi> it = list.iterator();
        int i7 = onWarmupCompleted + 77;
        while (true) {
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            if (!it.hasNext()) {
                return;
            }
            parcel.writeParcelable(it.next(), i);
            i7 = onWarmupCompleted + 113;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DynamicLoaderFactory(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable onExtraCallback onextracallback, @Nullable CardRecommendCardImage cardRecommendCardImage, @Nullable createAdSizeApi createadsizeapi, @NotNull List<? extends createNativeAdRatingApi> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.value = str;
        this.title = str2;
        this.subTitle = str3;
        this.style = onextracallback;
        this.image = cardRecommendCardImage;
        this.confirmAction = createadsizeapi;
        this.additionalFields = list;
    }

    public final String asBinder() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 71;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = this.value;
        int i5 = i2 + 95;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String asInterface() {
        String str;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 103;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 != 0) {
            str = this.title;
            int i4 = 87 / 0;
        } else {
            str = this.title;
        }
        int i5 = i3 + 97;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 39;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return this.subTitle;
        }
        throw null;
    }

    public final onExtraCallback onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 109;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        onExtraCallback onextracallback = this.style;
        int i5 = i3 + 41;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return onextracallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final CardRecommendCardImage onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 13;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        CardRecommendCardImage cardRecommendCardImage = this.image;
        int i4 = i3 + 35;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 33 / 0;
        }
        return cardRecommendCardImage;
    }

    public final createAdSizeApi IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 117;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        createAdSizeApi createadsizeapi = this.confirmAction;
        int i5 = i3 + 63;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return createadsizeapi;
    }

    public final List<createNativeAdRatingApi> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 111;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        List<createNativeAdRatingApi> list = this.additionalFields;
        int i4 = i3 + 17;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return list;
        }
        throw null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallback[] $VALUES;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        public static final onExtraCallback PLAIN = new onExtraCallback("PLAIN", 0);
        public static final onExtraCallback BOLD = new onExtraCallback("BOLD", 1);

        private static final /* synthetic */ onExtraCallback[] $values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 91;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            onExtraCallback[] onextracallbackArr = {PLAIN, BOLD};
            int i5 = i3 + 63;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return onextracallbackArr;
        }

        public static EnumEntries<onExtraCallback> getEntries() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 47;
            IAuthTabCallback = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                throw null;
            }
            EnumEntries<onExtraCallback> enumEntries = $ENTRIES;
            int i4 = i2 + 1;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return enumEntries;
            }
            obj.hashCode();
            throw null;
        }

        public static onExtraCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 19;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallback = (onExtraCallback) Enum.valueOf(onExtraCallback.class, str);
            int i4 = IAuthTabCallback + 123;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return onextracallback;
        }

        public static onExtraCallback[] values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 35;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback[] onextracallbackArr = (onExtraCallback[]) $VALUES.clone();
            int i4 = onWarmupCompleted + 43;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return onextracallbackArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private onExtraCallback(String str, int i) {
        }

        static {
            onExtraCallback[] onextracallbackArr$values = $values();
            $VALUES = onextracallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackArr$values);
            int i = onExtraCallbackWithResult + 85;
            onNavigationEvent = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
