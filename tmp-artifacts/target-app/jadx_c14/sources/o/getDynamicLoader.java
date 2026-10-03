package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getDynamicLoader implements doCallInitialize {
    public static final Parcelable.Creator<getDynamicLoader> CREATOR = new onNavigationEvent();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final String backgroundColor;
    private final List<makeLoaderUnsafe> contents;
    private final boolean opened;
    private final doMakeLoader title;
    private final String type;

    public static final class onNavigationEvent implements Parcelable.Creator<getDynamicLoader> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ getDynamicLoader createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 19;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            getDynamicLoader getdynamicloaderOnNavigationEvent = onNavigationEvent(parcel);
            int i4 = IAuthTabCallback + 27;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return getdynamicloaderOnNavigationEvent;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ getDynamicLoader[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 7;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            getDynamicLoader[] getdynamicloaderArrOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
            int i5 = onExtraCallback + 121;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return getdynamicloaderArrOnExtraCallbackWithResult;
        }

        public final getDynamicLoader[] onExtraCallbackWithResult(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 19;
            int i4 = i3 % 128;
            onExtraCallback = i4;
            int i5 = i3 % 2;
            getDynamicLoader[] getdynamicloaderArr = new getDynamicLoader[i];
            int i6 = i4 + 101;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 == 0) {
                return getdynamicloaderArr;
            }
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0047  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final o.getDynamicLoader onNavigationEvent(android.os.Parcel r9) {
            /*
                r8 = this;
                r0 = 2
                int r1 = r0 % r0
                java.lang.String r1 = ""
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
                java.lang.String r3 = r9.readString()
                android.os.Parcelable$Creator<o.doMakeLoader> r1 = o.doMakeLoader.CREATOR
                java.lang.Object r1 = r1.createFromParcel(r9)
                r4 = r1
                o.doMakeLoader r4 = (o.doMakeLoader) r4
                int r1 = r9.readInt()
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>(r1)
                r2 = 0
                r6 = r2
            L20:
                if (r6 == r1) goto L32
                java.lang.Class<o.getDynamicLoader> r7 = o.getDynamicLoader.class
                java.lang.ClassLoader r7 = r7.getClassLoader()
                android.os.Parcelable r7 = r9.readParcelable(r7)
                r5.add(r7)
                int r6 = r6 + 1
                goto L20
            L32:
                int r1 = r9.readInt()
                if (r1 == 0) goto L47
                int r1 = o.getDynamicLoader.onNavigationEvent.onExtraCallback
                int r1 = r1 + 125
                int r6 = r1 % 128
                o.getDynamicLoader.onNavigationEvent.IAuthTabCallback = r6
                int r1 = r1 % r0
                if (r1 == 0) goto L44
                goto L47
            L44:
                r1 = 1
                r6 = r1
                goto L48
            L47:
                r6 = r2
            L48:
                o.getDynamicLoader r1 = new o.getDynamicLoader
                java.lang.String r7 = r9.readString()
                r2 = r1
                r2.<init>(r3, r4, r5, r6, r7)
                int r9 = o.getDynamicLoader.onNavigationEvent.IAuthTabCallback
                int r9 = r9 + 119
                int r2 = r9 % 128
                o.getDynamicLoader.onNavigationEvent.onExtraCallback = r2
                int r9 = r9 % r0
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: o.getDynamicLoader.onNavigationEvent.onNavigationEvent(android.os.Parcel):o.getDynamicLoader");
        }
    }

    static {
        int i = onWarmupCompleted + 1;
        onExtraCallbackWithResult = i % 128;
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
        int i2 = IAuthTabCallback + 47;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 49;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getDynamicLoader)) {
            int i2 = IAuthTabCallback + 117;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        getDynamicLoader getdynamicloader = (getDynamicLoader) obj;
        if (!Intrinsics.areEqual(this.type, getdynamicloader.type)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.title, getdynamicloader.title)) {
            int i4 = onExtraCallback + 59;
            IAuthTabCallback = i4 % 128;
            return i4 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.contents, getdynamicloader.contents)) {
            int i5 = IAuthTabCallback + 57;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (this.opened != getdynamicloader.opened || !Intrinsics.areEqual(this.backgroundColor, getdynamicloader.backgroundColor)) {
            return false;
        }
        int i7 = onExtraCallback + 123;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 != 0) {
            return true;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 95;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((this.type.hashCode() * 31) + this.title.hashCode()) * 31) + this.contents.hashCode()) * 31) + Boolean.hashCode(this.opened)) * 31) + this.backgroundColor.hashCode();
        int i4 = IAuthTabCallback + 1;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FaqPlainContent(type=" + this.type + ", title=" + this.title + ", contents=" + this.contents + ", opened=" + this.opened + ", backgroundColor=" + this.backgroundColor + ")";
        int i2 = IAuthTabCallback + 103;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.type);
        this.title.writeToParcel(parcel, i);
        List<makeLoaderUnsafe> list = this.contents;
        parcel.writeInt(list.size());
        Iterator<makeLoaderUnsafe> it = list.iterator();
        int i3 = onExtraCallback + 113;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        while (it.hasNext()) {
            int i5 = onExtraCallback + 15;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            parcel.writeParcelable(it.next(), i);
        }
        parcel.writeInt(this.opened ? 1 : 0);
        parcel.writeString(this.backgroundColor);
        int i7 = onExtraCallback + 17;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public getDynamicLoader(@NotNull String str, @NotNull doMakeLoader domakeloader, @NotNull List<? extends makeLoaderUnsafe> list, boolean z, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(domakeloader, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.type = str;
        this.title = domakeloader;
        this.contents = list;
        this.opened = z;
        this.backgroundColor = str2;
    }

    public final doMakeLoader IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 111;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        doMakeLoader domakeloader = this.title;
        int i5 = i2 + 93;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return domakeloader;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<makeLoaderUnsafe> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 115;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        List<makeLoaderUnsafe> list = this.contents;
        int i5 = i3 + 57;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        throw null;
    }

    public final String onExtraCallbackWithResult() {
        String str;
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 119;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.backgroundColor;
            int i4 = 82 / 0;
        } else {
            str = this.backgroundColor;
        }
        int i5 = i2 + 83;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
