package viva.republica.toss.network.model.electronicdocument.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.NativeFrameRateLoggerSpec;
import o.TombstoneProtosMemoryMappingBuilder;
import o.liq;
import o.updateRenderInfoForVideo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class DocumentWalletConfigTitle implements Parcelable {
    public static final Companion Companion;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    @SerializedName("ctaTitle")
    private final String ctaTitle;

    @SerializedName("subtitle")
    private final String subtitle;

    @SerializedName("title")
    private final String title;

    @SerializedName("titleType")
    private final NativeFrameRateLoggerSpec titleType;
    public static final Parcelable.Creator<DocumentWalletConfigTitle> CREATOR = new IAuthTabCallback();
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigTitle$$ExternalSyntheticLambda0
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 49;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnExtraCallbackWithResult = DocumentWalletConfigTitle.onExtraCallbackWithResult();
            if (i3 != 0) {
                int i4 = 54 / 0;
            }
            return kSerializerOnExtraCallbackWithResult;
        }
    })};

    public static final class IAuthTabCallback implements Parcelable.Creator<DocumentWalletConfigTitle> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ DocumentWalletConfigTitle createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 35;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            DocumentWalletConfigTitle documentWalletConfigTitleOnExtraCallback = onExtraCallback(parcel);
            int i4 = onNavigationEvent + 49;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return documentWalletConfigTitleOnExtraCallback;
            }
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ DocumentWalletConfigTitle[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 63;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return onWarmupCompleted(i);
            }
            onWarmupCompleted(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final DocumentWalletConfigTitle onExtraCallback(Parcel parcel) {
            NativeFrameRateLoggerSpec nativeFrameRateLoggerSpecValueOf;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 75;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                int i4 = IAuthTabCallback + 51;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                nativeFrameRateLoggerSpecValueOf = null;
            } else {
                nativeFrameRateLoggerSpecValueOf = NativeFrameRateLoggerSpec.valueOf(parcel.readString());
                int i6 = onNavigationEvent + 29;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
            }
            return new DocumentWalletConfigTitle(string, string2, string3, nativeFrameRateLoggerSpecValueOf);
        }

        public final DocumentWalletConfigTitle[] onWarmupCompleted(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback;
            int i4 = i3 + 85;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            DocumentWalletConfigTitle[] documentWalletConfigTitleArr = new DocumentWalletConfigTitle[i];
            int i6 = i3 + 85;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return documentWalletConfigTitleArr;
        }
    }

    public DocumentWalletConfigTitle() {
        this((String) null, (String) null, (String) null, (NativeFrameRateLoggerSpec) null, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 89;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnTransact = onTransact();
        int i4 = onExtraCallbackWithResult + 27;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnTransact;
    }

    private static final /* synthetic */ KSerializer onTransact() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 105;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.electronicdocument.wallet.TitleType", NativeFrameRateLoggerSpec.values());
        int i4 = IAuthTabCallback + 115;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 53 / 0;
        }
        return kSerializerOnExtraCallbackWithResult;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 35;
        IAuthTabCallback = i2 % 128;
        return i2 % 2 == 0 ? 1 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        r7 = null;
        r7.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        if ((r7 instanceof viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigTitle) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
    
        r3 = r3 + 115;
        viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigTitle.onExtraCallbackWithResult = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        r7 = (viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigTitle) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r6.title, r7.title) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r6.subtitle, r7.subtitle) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
    
        r7 = viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigTitle.IAuthTabCallback + 1;
        viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigTitle.onExtraCallbackWithResult = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0052, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r6.ctaTitle, r7.ctaTitle) != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
    
        if (r6.titleType == r7.titleType) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0064, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0065, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r1 = r1 + 105;
        viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigTitle.IAuthTabCallback = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if ((r1 % 2) == 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigTitle.onExtraCallbackWithResult
            int r2 = r1 + 13
            int r3 = r2 % 128
            viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigTitle.IAuthTabCallback = r3
            int r2 = r2 % r0
            r4 = 1
            r5 = 0
            if (r2 != 0) goto L16
            r2 = 89
            int r2 = r2 / r5
            if (r6 != r7) goto L27
            goto L18
        L16:
            if (r6 != r7) goto L27
        L18:
            int r1 = r1 + 105
            int r7 = r1 % 128
            viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigTitle.IAuthTabCallback = r7
            int r1 = r1 % r0
            if (r1 == 0) goto L22
            return r4
        L22:
            r7 = 0
            r7.hashCode()
            throw r7
        L27:
            boolean r1 = r7 instanceof viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigTitle
            if (r1 != 0) goto L33
            int r3 = r3 + 115
            int r7 = r3 % 128
            viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigTitle.onExtraCallbackWithResult = r7
            int r3 = r3 % r0
            return r5
        L33:
            viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigTitle r7 = (viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigTitle) r7
            java.lang.String r1 = r6.title
            java.lang.String r2 = r7.title
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L40
            return r5
        L40:
            java.lang.String r1 = r6.subtitle
            java.lang.String r2 = r7.subtitle
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L53
            int r7 = viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigTitle.IAuthTabCallback
            int r7 = r7 + r4
            int r1 = r7 % 128
            viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigTitle.onExtraCallbackWithResult = r1
            int r7 = r7 % r0
            return r5
        L53:
            java.lang.String r0 = r6.ctaTitle
            java.lang.String r1 = r7.ctaTitle
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 != 0) goto L5e
            return r5
        L5e:
            o.NativeFrameRateLoggerSpec r0 = r6.titleType
            o.NativeFrameRateLoggerSpec r7 = r7.titleType
            if (r0 == r7) goto L65
            return r5
        L65:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigTitle.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c A[PHI: r1 r3
      0x001c: PHI (r1v13 java.lang.String) = (r1v4 java.lang.String), (r1v15 java.lang.String) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]
      0x001c: PHI (r3v8 int) = (r3v0 int), (r3v9 int) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a A[PHI: r3
      0x001a: PHI (r3v1 int) = (r3v0 int), (r3v9 int) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigTitle.IAuthTabCallback
            int r1 = r1 + 57
            int r2 = r1 % 128
            viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigTitle.onExtraCallbackWithResult = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L15
            java.lang.String r1 = r7.title
            r3 = 1
            if (r1 != 0) goto L1c
            goto L1a
        L15:
            java.lang.String r1 = r7.title
            r3 = r2
            if (r1 != 0) goto L1c
        L1a:
            r1 = r2
            goto L2d
        L1c:
            int r1 = r1.hashCode()
            int r4 = viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigTitle.IAuthTabCallback
            int r4 = r4 + 5
            int r5 = r4 % 128
            viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigTitle.onExtraCallbackWithResult = r5
            int r4 = r4 % r0
            if (r4 == 0) goto L2d
            int r4 = r0 / 3
        L2d:
            java.lang.String r4 = r7.subtitle
            if (r4 != 0) goto L33
            r4 = r2
            goto L37
        L33:
            int r4 = r4.hashCode()
        L37:
            java.lang.String r5 = r7.ctaTitle
            if (r5 != 0) goto L3d
            r5 = r2
            goto L41
        L3d:
            int r5 = r5.hashCode()
        L41:
            o.NativeFrameRateLoggerSpec r6 = r7.titleType
            if (r6 == 0) goto L49
            int r3 = r6.hashCode()
        L49:
            int r1 = r1 * 31
            int r1 = r1 + r4
            int r1 = r1 * 31
            int r1 = r1 + r5
            int r1 = r1 * 31
            int r1 = r1 + r3
            int r3 = viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigTitle.IAuthTabCallback
            int r3 = r3 + 111
            int r4 = r3 % 128
            viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigTitle.onExtraCallbackWithResult = r4
            int r3 = r3 % r0
            if (r3 == 0) goto L60
            r0 = 58
            int r0 = r0 / r2
        L60:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigTitle.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DocumentWalletConfigTitle(title=" + this.title + ", subtitle=" + this.subtitle + ", ctaTitle=" + this.ctaTitle + ", titleType=" + this.titleType + ")";
        int i2 = onExtraCallbackWithResult + 103;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 5;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeString(this.ctaTitle);
        NativeFrameRateLoggerSpec nativeFrameRateLoggerSpec = this.titleType;
        if (nativeFrameRateLoggerSpec != null) {
            parcel.writeInt(1);
            parcel.writeString(nativeFrameRateLoggerSpec.name());
            return;
        }
        int i5 = IAuthTabCallback + 51;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        parcel.writeInt(0);
        int i7 = onExtraCallbackWithResult + 61;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<DocumentWalletConfigTitle> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 15;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            DocumentWalletConfigTitle$$serializer documentWalletConfigTitle$$serializer = DocumentWalletConfigTitle$$serializer.INSTANCE;
            int i4 = onNavigationEvent + 95;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 98 / 0;
            }
            return documentWalletConfigTitle$$serializer;
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        int i = onWarmupCompleted + 25;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ DocumentWalletConfigTitle(int r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, o.NativeFrameRateLoggerSpec r6, o.okycx r7) {
        /*
            r1 = this;
            r1.<init>()
            r7 = r2 & 1
            r0 = 0
            if (r7 != 0) goto Lb
            r1.title = r0
            goto Ld
        Lb:
            r1.title = r3
        Ld:
            r3 = r2 & 2
            r7 = 2
            if (r3 != 0) goto L25
            int r3 = viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigTitle.IAuthTabCallback
            int r3 = r3 + 113
            int r4 = r3 % 128
            viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigTitle.onExtraCallbackWithResult = r4
            int r3 = r3 % r7
            r1.subtitle = r0
            int r4 = r4 + 17
            int r3 = r4 % 128
            viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigTitle.IAuthTabCallback = r3
            int r4 = r4 % r7
            goto L33
        L25:
            r1.subtitle = r4
            int r3 = viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigTitle.onExtraCallbackWithResult
            int r3 = r3 + 53
            int r4 = r3 % 128
            viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigTitle.IAuthTabCallback = r4
            int r3 = r3 % r7
            if (r3 != 0) goto L33
            goto L34
        L33:
            int r7 = r7 % r7
        L34:
            r3 = r2 & 4
            if (r3 != 0) goto L3b
            r1.ctaTitle = r0
            goto L3d
        L3b:
            r1.ctaTitle = r5
        L3d:
            r2 = r2 & 8
            if (r2 != 0) goto L44
            r1.titleType = r0
            return
        L44:
            r1.titleType = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigTitle.<init>(int, java.lang.String, java.lang.String, java.lang.String, o.NativeFrameRateLoggerSpec, o.okycx):void");
    }

    public DocumentWalletConfigTitle(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable NativeFrameRateLoggerSpec nativeFrameRateLoggerSpec) {
        this.title = str;
        this.subtitle = str2;
        this.ctaTitle = str3;
        this.titleType = nativeFrameRateLoggerSpec;
    }

    public static final /* synthetic */ Lazy[] onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 43;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i2 + 1;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return lazyArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025 A[PHI: r1
      0x0025: PHI (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
      (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v10 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v11 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
     binds: [B:8:0x001f, B:10:0x0023, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[PHI: r1
      0x0021: PHI (r1v10 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
      (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v11 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
     binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onExtraCallbackWithResult(viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigTitle r6, o.vyl r7, kotlinx.serialization.descriptors.SerialDescriptor r8) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigTitle.IAuthTabCallback
            int r1 = r1 + 115
            int r2 = r1 % 128
            viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigTitle.onExtraCallbackWithResult = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L19
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigTitle.$childSerializers
            boolean r4 = r7.onWarmupCompleted(r8, r3)
            if (r4 == 0) goto L21
            goto L25
        L19:
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigTitle.$childSerializers
            boolean r4 = r7.onWarmupCompleted(r8, r2)
            if (r4 != 0) goto L25
        L21:
            java.lang.String r4 = r6.title
            if (r4 == 0) goto L2c
        L25:
            o.getWriggleLayout r4 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r5 = r6.title
            r7.onExtraCallbackWithResult(r8, r2, r4, r5)
        L2c:
            boolean r4 = r7.onWarmupCompleted(r8, r3)
            if (r4 != 0) goto L36
            java.lang.String r4 = r6.subtitle
            if (r4 == 0) goto L46
        L36:
            o.getWriggleLayout r4 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r5 = r6.subtitle
            r7.onExtraCallbackWithResult(r8, r3, r4, r5)
            int r3 = viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigTitle.onExtraCallbackWithResult
            int r3 = r3 + 13
            int r4 = r3 % 128
            viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigTitle.IAuthTabCallback = r4
            int r3 = r3 % r0
        L46:
            boolean r3 = r7.onWarmupCompleted(r8, r0)
            if (r3 != 0) goto L50
            java.lang.String r3 = r6.ctaTitle
            if (r3 == 0) goto L60
        L50:
            o.getWriggleLayout r3 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r4 = r6.ctaTitle
            r7.onExtraCallbackWithResult(r8, r0, r3, r4)
            int r3 = viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigTitle.IAuthTabCallback
            int r3 = r3 + 71
            int r4 = r3 % 128
            viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigTitle.onExtraCallbackWithResult = r4
            int r3 = r3 % r0
        L60:
            r3 = 3
            boolean r4 = r7.onWarmupCompleted(r8, r3)
            if (r4 != 0) goto L6b
            o.NativeFrameRateLoggerSpec r4 = r6.titleType
            if (r4 == 0) goto L78
        L6b:
            r1 = r1[r3]
            java.lang.Object r1 = r1.getValue()
            o.py r1 = (o.py) r1
            o.NativeFrameRateLoggerSpec r6 = r6.titleType
            r7.onExtraCallbackWithResult(r8, r3, r1, r6)
        L78:
            int r6 = viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigTitle.onExtraCallbackWithResult
            int r6 = r6 + 101
            int r7 = r6 % 128
            viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigTitle.IAuthTabCallback = r7
            int r6 = r6 % r0
            if (r6 != 0) goto L86
            r6 = 66
            int r6 = r6 / r2
        L86:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigTitle.onExtraCallbackWithResult(viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigTitle, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DocumentWalletConfigTitle(String str, String str2, String str3, NativeFrameRateLoggerSpec nativeFrameRateLoggerSpec, int i, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i & 1) != 0 ? null : str;
        if ((i & 2) != 0) {
            int i2 = IAuthTabCallback + 23;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            str2 = null;
        }
        if ((i & 4) != 0) {
            int i5 = onExtraCallbackWithResult + 125;
            int i6 = i5 % 128;
            IAuthTabCallback = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 3;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
            str3 = null;
        }
        if ((i & 8) != 0) {
            int i11 = onExtraCallbackWithResult + 87;
            IAuthTabCallback = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
            nativeFrameRateLoggerSpec = null;
        }
        this(str, str2, str3, nativeFrameRateLoggerSpec);
    }

    public final String IAuthTabCallback() {
        String str;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 5;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 != 0) {
            str = this.title;
            int i4 = 31 / 0;
        } else {
            str = this.title;
        }
        int i5 = i3 + 115;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 123;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.subtitle;
        int i5 = i3 + 27;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final NativeFrameRateLoggerSpec onWarmupCompleted() {
        NativeFrameRateLoggerSpec nativeFrameRateLoggerSpec;
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 121;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            nativeFrameRateLoggerSpec = this.titleType;
            int i4 = 9 / 0;
        } else {
            nativeFrameRateLoggerSpec = this.titleType;
        }
        int i5 = i2 + 99;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return nativeFrameRateLoggerSpec;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
