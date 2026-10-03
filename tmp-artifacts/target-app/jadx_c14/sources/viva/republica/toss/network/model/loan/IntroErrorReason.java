package viva.republica.toss.network.model.loan;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class IntroErrorReason implements Parcelable {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final Parcelable.Creator<IntroErrorReason> CREATOR;
    public static final Companion Companion;
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 0;
    private static int asInterface = 1;
    private static char onExtraCallback = 0;
    private static char onExtraCallbackWithResult = 0;
    private static char onNavigationEvent = 0;
    private static int onTransact = 1;
    private static char onWarmupCompleted;
    private final String ctaTitle;
    private final String imageUrl;
    private final String subtitle;
    private final String title;

    public static final class IAuthTabCallback implements Parcelable.Creator<IntroErrorReason> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public final IntroErrorReason IAuthTabCallback(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            IntroErrorReason introErrorReason = new IntroErrorReason(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = onNavigationEvent + 117;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return introErrorReason;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ IntroErrorReason createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 51;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return IAuthTabCallback(parcel);
            }
            IAuthTabCallback(parcel);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ IntroErrorReason[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 37;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                onWarmupCompleted(i);
                throw null;
            }
            IntroErrorReason[] introErrorReasonArrOnWarmupCompleted = onWarmupCompleted(i);
            int i4 = onNavigationEvent + 49;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return introErrorReasonArrOnWarmupCompleted;
        }

        public final IntroErrorReason[] onWarmupCompleted(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent;
            int i4 = i3 + 67;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            IntroErrorReason[] introErrorReasonArr = new IntroErrorReason[i];
            int i6 = i3 + 71;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                return introErrorReasonArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        onExtraCallbackWithResult();
        Companion = new Companion(null);
        CREATOR = new IAuthTabCallback();
        int i = onTransact + 79;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public IntroErrorReason() {
        this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 89;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 53;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 37;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntroErrorReason)) {
            return false;
        }
        IntroErrorReason introErrorReason = (IntroErrorReason) obj;
        if (!Intrinsics.areEqual(this.imageUrl, introErrorReason.imageUrl)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.title, introErrorReason.title)) {
            int i4 = IAuthTabCallbackDefault + 117;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.subtitle, introErrorReason.subtitle)) {
            int i6 = asInterface + 25;
            IAuthTabCallbackDefault = i6 % 128;
            return i6 % 2 != 0;
        }
        if (Intrinsics.areEqual(this.ctaTitle, introErrorReason.ctaTitle)) {
            return true;
        }
        int i7 = asInterface + 89;
        IAuthTabCallbackDefault = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 45;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((this.imageUrl.hashCode() * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31) + this.ctaTitle.hashCode();
        int i4 = asInterface + 11;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "IntroErrorReason(imageUrl=" + this.imageUrl + ", title=" + this.title + ", subtitle=" + this.subtitle + ", ctaTitle=" + this.ctaTitle + ")";
        int i2 = IAuthTabCallbackDefault + 5;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 63;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.imageUrl);
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeString(this.ctaTitle);
        int i5 = IAuthTabCallbackDefault + 109;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class Companion {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<IntroErrorReason> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 43;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            IntroErrorReason$$serializer introErrorReason$$serializer = IntroErrorReason$$serializer.INSTANCE;
            int i4 = onNavigationEvent + 105;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return introErrorReason$$serializer;
        }
    }

    public /* synthetic */ IntroErrorReason(int i, String str, String str2, String str3, String str4, okycx okycxVar) throws Throwable {
        if ((i & 1) == 0) {
            Object[] objArr = new Object[1];
            a(new char[]{64442, 28066, 3126, 2114, 23498, 26362, 44301, 10924, 50070, 50599, 53001, 65265, 28832, 7337, 50239, 48362, 51479, 3606, 33627, 4740, 54346, 30827, 28065, 12676, 8894, 29554, 27403, 48626, 11143, 22360, 37981, 12469, 61318, 38267, 64130, 36946, 5064, 43692, 38911, 2276, 10320, 14012, 56256, 1709, 21049, 37383, 28883, 22296, 8894, 29554, 13861, 41235, 50279, 30730, 30042, 21142}, 56 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr);
            str = ((String) objArr[0]).intern();
            int i2 = 2 % 2;
        }
        this.imageUrl = str;
        if ((i & 2) == 0) {
            this.title = "지금은 갈아탈 대출을 찾을 수 없어요";
            int i3 = asInterface + 9;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 2 % 2;
            }
        } else {
            this.title = str2;
        }
        if ((i & 4) == 0) {
            int i5 = IAuthTabCallbackDefault + 59;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            this.subtitle = "잠시 후 다시 시도해주세요.";
        } else {
            this.subtitle = str3;
            int i7 = IAuthTabCallbackDefault + 79;
            asInterface = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
        }
        if ((i & 8) != 0) {
            this.ctaTitle = str4;
            return;
        }
        this.ctaTitle = "가능한 시간에 결과 받기";
        int i10 = IAuthTabCallbackDefault + 121;
        asInterface = i10 % 128;
        if (i10 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public IntroErrorReason(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.imageUrl = str;
        this.title = str2;
        this.subtitle = str3;
        this.ctaTitle = str4;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0039  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onExtraCallback(viva.republica.toss.network.model.loan.IntroErrorReason r7, o.vyl r8, kotlinx.serialization.descriptors.SerialDescriptor r9) throws java.lang.Throwable {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.loan.IntroErrorReason.IAuthTabCallbackDefault
            int r1 = r1 + 59
            int r2 = r1 % 128
            viva.republica.toss.network.model.loan.IntroErrorReason.asInterface = r2
            int r1 = r1 % r0
            r1 = 0
            boolean r2 = r8.onWarmupCompleted(r9, r1)
            r3 = 1
            if (r2 == 0) goto L15
            goto L39
        L15:
            java.lang.String r2 = r7.imageUrl
            r4 = 56
            char[] r4 = new char[r4]
            r4 = {x008a: FILL_ARRAY_DATA , data: [-1094, 28066, 3126, 2114, 23498, 26362, -21235, 10924, -15466, -14937, -12535, -271, 28832, 7337, -15297, -17174, -14057, 3606, -31909, 4740, -11190, 30827, 28065, 12676, 8894, 29554, 27403, -16910, 11143, 22360, -27555, 12469, -4218, -27269, -1406, -28590, 5064, -21844, -26625, 2276, 10320, 14012, -9280, 1709, 21049, -28153, 28883, 22296, 8894, 29554, 13861, -24301, -15257, 30730, 30042, 21142} // fill-array
            java.lang.String r5 = ""
            int r5 = android.text.TextUtils.getTrimmedLength(r5)
            int r5 = 55 - r5
            java.lang.Object[] r6 = new java.lang.Object[r3]
            a(r4, r5, r6)
            r4 = r6[r1]
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = r4.intern()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r4)
            if (r2 != 0) goto L3e
        L39:
            java.lang.String r2 = r7.imageUrl
            r8.onExtraCallback(r9, r1, r2)
        L3e:
            boolean r1 = r8.onWarmupCompleted(r9, r3)
            if (r1 != 0) goto L57
            int r1 = viva.republica.toss.network.model.loan.IntroErrorReason.IAuthTabCallbackDefault
            int r1 = r1 + 89
            int r2 = r1 % 128
            viva.republica.toss.network.model.loan.IntroErrorReason.asInterface = r2
            int r1 = r1 % r0
            java.lang.String r1 = r7.title
            java.lang.String r2 = "지금은 갈아탈 대출을 찾을 수 없어요"
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L5c
        L57:
            java.lang.String r1 = r7.title
            r8.onExtraCallback(r9, r3, r1)
        L5c:
            boolean r1 = r8.onWarmupCompleted(r9, r0)
            if (r1 != 0) goto L6d
            java.lang.String r1 = r7.subtitle
            java.lang.String r2 = "잠시 후 다시 시도해주세요."
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            r1 = r1 ^ r3
            if (r1 == 0) goto L72
        L6d:
            java.lang.String r1 = r7.subtitle
            r8.onExtraCallback(r9, r0, r1)
        L72:
            r0 = 3
            boolean r1 = r8.onWarmupCompleted(r9, r0)
            if (r1 != 0) goto L83
            java.lang.String r1 = r7.ctaTitle
            java.lang.String r2 = "가능한 시간에 결과 받기"
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L88
        L83:
            java.lang.String r7 = r7.ctaTitle
            r8.onExtraCallback(r9, r0, r7)
        L88:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.IntroErrorReason.onExtraCallback(viva.republica.toss.network.model.loan.IntroErrorReason, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ IntroErrorReason(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) throws Throwable {
        if ((i & 1) != 0) {
            Object[] objArr = new Object[1];
            a(new char[]{64442, 28066, 3126, 2114, 23498, 26362, 44301, 10924, 50070, 50599, 53001, 65265, 28832, 7337, 50239, 48362, 51479, 3606, 33627, 4740, 54346, 30827, 28065, 12676, 8894, 29554, 27403, 48626, 11143, 22360, 37981, 12469, 61318, 38267, 64130, 36946, 5064, 43692, 38911, 2276, 10320, 14012, 56256, 1709, 21049, 37383, 28883, 22296, 8894, 29554, 13861, 41235, 50279, 30730, 30042, 21142}, 55 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
            str = ((String) objArr[0]).intern();
            int i2 = IAuthTabCallbackDefault + 105;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        if ((i & 2) != 0) {
            int i5 = asInterface + 93;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 89 / 0;
            }
            str2 = "지금은 갈아탈 대출을 찾을 수 없어요";
        }
        Object obj = null;
        if ((i & 4) != 0) {
            int i7 = IAuthTabCallbackDefault + 35;
            asInterface = i7 % 128;
            if (i7 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            str3 = "잠시 후 다시 시도해주세요.";
        }
        if ((i & 8) != 0) {
            int i8 = asInterface + 23;
            IAuthTabCallbackDefault = i8 % 128;
            if (i8 % 2 != 0) {
                throw null;
            }
            int i9 = 2 % 2;
            str4 = "가능한 시간에 결과 받기";
        }
        this(str, str2, str3, str4);
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 85;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.imageUrl;
        int i4 = i3 + 107;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 77;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        String str = this.title;
        int i5 = i2 + 45;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 103;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        String str = this.subtitle;
        int i5 = i2 + 25;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 99;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.ctaTitle;
        int i5 = i2 + 39;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i4 = $10 + 13;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                int i8 = $10 + 17;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i10 = (c2 + i6) ^ ((c2 << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)));
                int i11 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onExtraCallback);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char c3 = (char) (TypedValue.complexToFloat(i3) > 0.0f ? 1 : (TypedValue.complexToFloat(i3) == 0.0f ? 0 : -1));
                        int packedPositionGroup = 10 - ExpandableListView.getPackedPositionGroup(0L);
                        int iLastIndexOf = 12433 - TextUtils.lastIndexOf("", '0', i3, i3);
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c3, packedPositionGroup, iLastIndexOf, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (onWarmupCompleted ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallbackWithResult)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 10 - View.resolveSize(0, 0), View.MeasureSpec.getSize(0) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7++;
                    int i12 = $10 + 43;
                    $11 = i12 % 128;
                    int i13 = i12 % 2;
                    cArr3 = cArr4;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - (ViewConfiguration.getLongPressTimeout() >> 16)), 14 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 19901 - (ViewConfiguration.getJumpTapTimeout() >> 16), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void onExtraCallbackWithResult() {
        onWarmupCompleted = (char) 28732;
        onExtraCallbackWithResult = (char) 12695;
        onNavigationEvent = (char) 52971;
        onExtraCallback = (char) 12294;
    }
}
