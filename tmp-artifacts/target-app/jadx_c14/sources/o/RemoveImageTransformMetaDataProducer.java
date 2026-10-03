package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RemoveImageTransformMetaDataProducer implements NativeKeyboardObserverSpec {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    @SerializedName("bottomSheetData")
    private final copyBitmap bottomSheetData;

    @SerializedName("iconUrl")
    private final String iconUrl;
    private final String itemId;

    @SerializedName("link")
    private final String link;

    @SerializedName("text")
    private final String text;

    public RemoveImageTransformMetaDataProducer() {
        this(null, null, null, null, 15, null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onWarmupCompleted + 37;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 13;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof RemoveImageTransformMetaDataProducer)) {
            return false;
        }
        RemoveImageTransformMetaDataProducer removeImageTransformMetaDataProducer = (RemoveImageTransformMetaDataProducer) obj;
        if (!Intrinsics.areEqual(this.iconUrl, removeImageTransformMetaDataProducer.iconUrl)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.text, removeImageTransformMetaDataProducer.text)) {
            int i7 = onWarmupCompleted + 9;
            onNavigationEvent = i7 % 128;
            return i7 % 2 == 0;
        }
        if (Intrinsics.areEqual(this.link, removeImageTransformMetaDataProducer.link)) {
            return Intrinsics.areEqual(this.bottomSheetData, removeImageTransformMetaDataProducer.bottomSheetData);
        }
        int i8 = onWarmupCompleted + 39;
        onNavigationEvent = i8 % 128;
        return i8 % 2 == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0046 A[PHI: r1 r3 r4
      0x0046: PHI (r1v14 int) = (r1v5 int), (r1v16 int) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
      0x0046: PHI (r3v4 int) = (r3v1 int), (r3v6 int) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
      0x0046: PHI (r4v8 java.lang.String) = (r4v0 java.lang.String), (r4v10 java.lang.String) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030 A[PHI: r1 r3
      0x0030: PHI (r1v6 int) = (r1v5 int), (r1v16 int) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
      0x0030: PHI (r3v2 int) = (r3v1 int), (r3v6 int) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.RemoveImageTransformMetaDataProducer.onWarmupCompleted
            int r1 = r1 + 43
            int r2 = r1 % 128
            o.RemoveImageTransformMetaDataProducer.onNavigationEvent = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L20
            java.lang.String r1 = r7.iconUrl
            int r1 = r1.hashCode()
            java.lang.String r3 = r7.text
            int r3 = r3.hashCode()
            java.lang.String r4 = r7.link
            if (r4 != 0) goto L46
            goto L30
        L20:
            java.lang.String r1 = r7.iconUrl
            int r1 = r1.hashCode()
            java.lang.String r3 = r7.text
            int r3 = r3.hashCode()
            java.lang.String r4 = r7.link
            if (r4 != 0) goto L46
        L30:
            int r4 = o.RemoveImageTransformMetaDataProducer.onWarmupCompleted
            int r4 = r4 + 53
            int r5 = r4 % 128
            o.RemoveImageTransformMetaDataProducer.onNavigationEvent = r5
            int r4 = r4 % r0
            if (r4 != 0) goto L3d
            r4 = 1
            goto L3e
        L3d:
            r4 = r2
        L3e:
            int r5 = r5 + 21
            int r6 = r5 % 128
            o.RemoveImageTransformMetaDataProducer.onWarmupCompleted = r6
            int r5 = r5 % r0
            goto L4a
        L46:
            int r4 = r4.hashCode()
        L4a:
            o.copyBitmap r5 = r7.bottomSheetData
            if (r5 == 0) goto L66
            int r2 = o.RemoveImageTransformMetaDataProducer.onNavigationEvent
            int r2 = r2 + 41
            int r6 = r2 % 128
            o.RemoveImageTransformMetaDataProducer.onWarmupCompleted = r6
            int r2 = r2 % r0
            if (r2 != 0) goto L5e
            int r2 = r5.hashCode()
            goto L66
        L5e:
            r5.hashCode()
            r0 = 0
            r0.hashCode()
            throw r0
        L66:
            int r1 = r1 * 31
            int r1 = r1 + r3
            int r1 = r1 * 31
            int r1 = r1 + r4
            int r1 = r1 * 31
            int r1 = r1 + r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.RemoveImageTransformMetaDataProducer.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PlccNoticeResponse(iconUrl=" + this.iconUrl + ", text=" + this.text + ", link=" + this.link + ", bottomSheetData=" + this.bottomSheetData + ")";
        int i2 = onNavigationEvent + 69;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public RemoveImageTransformMetaDataProducer(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable copyBitmap copybitmap) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.iconUrl = str;
        this.text = str2;
        this.link = str3;
        this.bottomSheetData = copybitmap;
        this.itemId = str + ":" + str2 + ":" + str3 + ":" + copybitmap;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RemoveImageTransformMetaDataProducer(String str, String str2, String str3, copyBitmap copybitmap, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Object obj = null;
        if ((i & 1) != 0) {
            int i2 = onWarmupCompleted + 93;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            str = "";
        }
        if ((i & 2) != 0) {
            int i3 = onWarmupCompleted + 23;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            str2 = "";
        }
        if ((i & 4) != 0) {
            int i4 = onNavigationEvent + 33;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 66 / 0;
            }
            int i6 = 2 % 2;
            str3 = null;
        }
        if ((i & 8) != 0) {
            int i7 = onNavigationEvent + 19;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
            copybitmap = null;
        }
        this(str, str2, str3, copybitmap);
    }

    @Override // o.NativeKeyboardObserverSpec
    public /* bridge */ long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 49;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        long jIAuthTabCallback = super.IAuthTabCallback();
        int i4 = onNavigationEvent + 55;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return jIAuthTabCallback;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 61;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = this.iconUrl;
        int i5 = i2 + 79;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 63 / 0;
        }
        return str;
    }

    public final String onTransact() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 11;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.text;
        int i5 = i2 + 63;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 94 / 0;
        }
        return str;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 49;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.link;
        int i5 = i2 + 123;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final copyBitmap onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 65;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return this.bottomSheetData;
        }
        throw null;
    }

    @Override // o.NativeKeyboardObserverSpec
    public String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 81;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.itemId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
