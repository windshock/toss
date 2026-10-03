package viva.republica.toss.network.model.cardsales.funnel.field;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.createAdSizeApi;
import o.createNativeAdRatingApi;
import o.createNativeBannerAdViewApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RadioField implements createNativeAdRatingApi {
    public static final Parcelable.Creator<RadioField> CREATOR = new Creator();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final String defaultValue;
    private final String description;
    private final boolean disabled;
    private final createAdSizeApi disabledAction;
    private final createNativeBannerAdViewApi helpArea;
    private final String key;
    private final List<RadioOption> options;
    private final String title;
    private final String type;

    public static final class Creator implements Parcelable.Creator<RadioField> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        public final RadioField IAuthTabCallback(Parcel parcel) {
            createNativeBannerAdViewApi createnativebanneradviewapiCreateFromParcel;
            boolean z;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 95;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                int i4 = onExtraCallbackWithResult + 7;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                createnativebanneradviewapiCreateFromParcel = null;
            } else {
                createnativebanneradviewapiCreateFromParcel = createNativeBannerAdViewApi.CREATOR.createFromParcel(parcel);
            }
            createNativeBannerAdViewApi createnativebanneradviewapi = createnativebanneradviewapiCreateFromParcel;
            String string4 = parcel.readString();
            if (parcel.readInt() != 0) {
                int i6 = IAuthTabCallback + 59;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                z = true;
            } else {
                z = false;
            }
            createAdSizeApi createadsizeapi = (createAdSizeApi) parcel.readParcelable(RadioField.class.getClassLoader());
            int i8 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i8);
            for (int i9 = 0; i9 != i8; i9++) {
                arrayList.add(RadioOption.CREATOR.createFromParcel(parcel));
            }
            return new RadioField(string, string2, string3, createnativebanneradviewapi, string4, z, createadsizeapi, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ RadioField createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 9;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            RadioField radioFieldIAuthTabCallback = IAuthTabCallback(parcel);
            int i4 = onExtraCallbackWithResult + 1;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return radioFieldIAuthTabCallback;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ RadioField[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 91;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            RadioField[] radioFieldArrOnWarmupCompleted = onWarmupCompleted(i);
            int i5 = onExtraCallbackWithResult + 103;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return radioFieldArrOnWarmupCompleted;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final RadioField[] onWarmupCompleted(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 113;
            int i4 = i3 % 128;
            onExtraCallbackWithResult = i4;
            RadioField[] radioFieldArr = new RadioField[i];
            if (i3 % 2 != 0) {
                int i5 = 18 / 0;
            }
            int i6 = i4 + 99;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return radioFieldArr;
        }
    }

    static {
        int i = IAuthTabCallback + 43;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 35;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 101;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            int i4 = i3 + 51;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        if (!(obj instanceof RadioField)) {
            return false;
        }
        RadioField radioField = (RadioField) obj;
        if (!Intrinsics.areEqual(this.key, radioField.key)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.type, radioField.type)) {
            int i6 = onExtraCallback + 43;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                return false;
            }
            obj2.hashCode();
            throw null;
        }
        if (!Intrinsics.areEqual(this.title, radioField.title)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.helpArea, radioField.helpArea)) {
            int i7 = onExtraCallback + 77;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.description, radioField.description)) {
            int i9 = onExtraCallback + 99;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (this.disabled != radioField.disabled || !Intrinsics.areEqual(this.disabledAction, radioField.disabledAction)) {
            return false;
        }
        if (Intrinsics.areEqual(this.options, radioField.options)) {
            return Intrinsics.areEqual(this.defaultValue, radioField.defaultValue);
        }
        int i11 = onExtraCallback + 107;
        onExtraCallbackWithResult = i11 % 128;
        int i12 = i11 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032 A[PHI: r1 r3 r4
      0x0032: PHI (r1v24 int) = (r1v5 int), (r1v26 int) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
      0x0032: PHI (r3v4 int) = (r3v1 int), (r3v6 int) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
      0x0032: PHI (r4v3 java.lang.String) = (r4v0 java.lang.String), (r4v5 java.lang.String) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030 A[PHI: r1 r3
      0x0030: PHI (r1v6 int) = (r1v5 int), (r1v26 int) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
      0x0030: PHI (r3v2 int) = (r3v1 int), (r3v6 int) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r8 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.cardsales.funnel.field.RadioField.onExtraCallback
            int r1 = r1 + 59
            int r2 = r1 % 128
            viva.republica.toss.network.model.cardsales.funnel.field.RadioField.onExtraCallbackWithResult = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L20
            java.lang.String r1 = r8.key
            int r1 = r1.hashCode()
            java.lang.String r3 = r8.type
            int r3 = r3.hashCode()
            java.lang.String r4 = r8.title
            if (r4 != 0) goto L32
            goto L30
        L20:
            java.lang.String r1 = r8.key
            int r1 = r1.hashCode()
            java.lang.String r3 = r8.type
            int r3 = r3.hashCode()
            java.lang.String r4 = r8.title
            if (r4 != 0) goto L32
        L30:
            r4 = r2
            goto L36
        L32:
            int r4 = r4.hashCode()
        L36:
            o.createNativeBannerAdViewApi r5 = r8.helpArea
            if (r5 != 0) goto L45
            int r5 = viva.republica.toss.network.model.cardsales.funnel.field.RadioField.onExtraCallback
            int r5 = r5 + 67
            int r6 = r5 % 128
            viva.republica.toss.network.model.cardsales.funnel.field.RadioField.onExtraCallbackWithResult = r6
            int r5 = r5 % r0
            r5 = r2
            goto L49
        L45:
            int r5 = r5.hashCode()
        L49:
            java.lang.String r6 = r8.description
            if (r6 != 0) goto L58
            int r6 = viva.republica.toss.network.model.cardsales.funnel.field.RadioField.onExtraCallbackWithResult
            int r6 = r6 + 95
            int r7 = r6 % 128
            viva.republica.toss.network.model.cardsales.funnel.field.RadioField.onExtraCallback = r7
            int r6 = r6 % r0
            r0 = r2
            goto L5c
        L58:
            int r0 = r6.hashCode()
        L5c:
            boolean r6 = r8.disabled
            int r6 = java.lang.Boolean.hashCode(r6)
            o.createAdSizeApi r7 = r8.disabledAction
            if (r7 == 0) goto L6a
            int r2 = r7.hashCode()
        L6a:
            int r1 = r1 * 31
            int r1 = r1 + r3
            int r1 = r1 * 31
            int r1 = r1 + r4
            int r1 = r1 * 31
            int r1 = r1 + r5
            int r1 = r1 * 31
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r1 = r1 + r6
            int r1 = r1 * 31
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.util.List<viva.republica.toss.network.model.cardsales.funnel.field.RadioOption> r0 = r8.options
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r8.defaultValue
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.cardsales.funnel.field.RadioField.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RadioField(key=" + this.key + ", type=" + this.type + ", title=" + this.title + ", helpArea=" + this.helpArea + ", description=" + this.description + ", disabled=" + this.disabled + ", disabledAction=" + this.disabledAction + ", options=" + this.options + ", defaultValue=" + this.defaultValue + ")";
        int i2 = onExtraCallback + 97;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.key);
        parcel.writeString(this.type);
        parcel.writeString(this.title);
        createNativeBannerAdViewApi createnativebanneradviewapi = this.helpArea;
        if (createnativebanneradviewapi == null) {
            int i3 = onExtraCallbackWithResult + 55;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            createnativebanneradviewapi.writeToParcel(parcel, i);
            int i5 = onExtraCallback + 81;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 4 / 4;
            }
        }
        parcel.writeString(this.description);
        parcel.writeInt(this.disabled ? 1 : 0);
        parcel.writeParcelable(this.disabledAction, i);
        List<RadioOption> list = this.options;
        parcel.writeInt(list.size());
        Iterator<RadioOption> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.defaultValue);
    }

    public RadioField(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable createNativeBannerAdViewApi createnativebanneradviewapi, @Nullable String str4, boolean z, @Nullable createAdSizeApi createadsizeapi, @NotNull List<RadioOption> list, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.key = str;
        this.type = str2;
        this.title = str3;
        this.helpArea = createnativebanneradviewapi;
        this.description = str4;
        this.disabled = z;
        this.disabledAction = createadsizeapi;
        this.options = list;
        this.defaultValue = str5;
    }

    public String asBinder() {
        String str;
        int i = 2 % 2;
        int i2 = onExtraCallback + 113;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            str = this.key;
            int i4 = 18 / 0;
        } else {
            str = this.key;
        }
        int i5 = i3 + 9;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 57;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.title;
        int i4 = i3 + 3;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final createNativeBannerAdViewApi onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        createNativeBannerAdViewApi createnativebanneradviewapi = this.helpArea;
        int i5 = i3 + 19;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 75 / 0;
        }
        return createnativebanneradviewapi;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 71;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return this.description;
        }
        throw null;
    }

    public final boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 85;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.disabled;
        if (i3 != 0) {
            int i4 = 93 / 0;
        }
        return z;
    }

    public final createAdSizeApi IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 77;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        createAdSizeApi createadsizeapi = this.disabledAction;
        int i5 = i3 + 115;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return createadsizeapi;
    }

    public final List<RadioOption> IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 107;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        List<RadioOption> list = this.options;
        int i5 = i3 + 119;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 47;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.defaultValue;
        int i5 = i3 + 119;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
