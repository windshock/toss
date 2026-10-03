package viva.republica.toss.network.model.loan;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TombstoneProtosMemoryMappingBuilder;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.access15300;
import o.liq;
import o.updateRenderInfoForVideo;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class LoanProductStatus implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LoanProductStatus[] $VALUES;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Parcelable.Creator<LoanProductStatus> CREATOR;
    public static final Companion Companion;
    private static int IAuthTabCallback;
    private static int IAuthTabCallbackStub;

    @SerializedName("INIT")
    public static final LoanProductStatus INIT;

    @SerializedName("INSPECT_DONE")
    public static final LoanProductStatus INSPECT_DONE;

    @SerializedName("INSPECT_PROGRESS")
    public static final LoanProductStatus INSPECT_PROGRESS;

    @SerializedName("LOAN_APPLICATION_COMPLETE")
    public static final LoanProductStatus LOAN_APPLICATION_COMPLETE;

    @SerializedName("LOAN_APPLY")
    public static final LoanProductStatus LOAN_APPLY;

    @SerializedName("LOAN_APPROVE")
    public static final LoanProductStatus LOAN_APPROVE;

    @SerializedName("LOAN_APPROVE_CANCEL")
    public static final LoanProductStatus LOAN_APPROVE_CANCEL;

    @SerializedName("LOAN_CANCEL")
    public static final LoanProductStatus LOAN_CANCEL;
    public static final LoanProductStatus LOAN_DEPOSIT_DROP;

    @SerializedName("LOAN_DEPOSIT_FAIL")
    public static final LoanProductStatus LOAN_DEPOSIT_FAIL;

    @SerializedName("LOAN_DROP")
    public static final LoanProductStatus LOAN_DROP;
    public static final LoanProductStatus LOAN_HOLDING;

    @SerializedName("LOAN_PROGRESS")
    public static final LoanProductStatus LOAN_PROGRESS;

    @SerializedName("PRE_SCREENING_APPROVE")
    public static final LoanProductStatus PRE_SCREENING_APPROVE;

    @SerializedName("PRE_SCREENING_COMPLETE")
    public static final LoanProductStatus PRE_SCREENING_COMPLETE;

    @SerializedName("PRE_SCREENING_DONE")
    public static final LoanProductStatus PRE_SCREENING_DONE;

    @SerializedName("PRE_SCREENING_DROP")
    public static final LoanProductStatus PRE_SCREENING_DROP;

    @SerializedName("PRE_SCREENING_FAIL")
    public static final LoanProductStatus PRE_SCREENING_FAIL;

    @SerializedName("PRE_SCREENING_REQUEST")
    public static final LoanProductStatus PRE_SCREENING_REQUEST;

    @SerializedName("PRE_SCREENING_TIMEOUT")
    public static final LoanProductStatus PRE_SCREENING_TIMEOUT;

    @SerializedName("SCREENING_PROGRESS_DONE")
    public static final LoanProductStatus SCREENING_PROGRESS_DONE;

    @SerializedName("UNKNOWN")
    public static final LoanProductStatus UNKNOWN;
    private static long onExtraCallbackWithResult;
    private static char onWarmupCompleted;
    private static final byte[] $$a = {68, -127, 122, -15};
    private static final int $$b = 224;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onTransact = 1;
    private static int onNavigationEvent = 0;
    private static int onExtraCallback = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, short r7, byte r8) {
        /*
            int r7 = r7 * 2
            int r7 = r7 + 1
            int r8 = r8 * 4
            int r8 = 4 - r8
            int r6 = 110 - r6
            byte[] r0 = viva.republica.toss.network.model.loan.LoanProductStatus.$$a
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L28
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L28:
            int r6 = r6 + r8
            int r8 = r3 + 1
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanProductStatus.$$c(byte, short, byte):java.lang.String");
    }

    public static /* synthetic */ KSerializer $r8$lambda$zohf2wuALg6hgvlgXmH5TD2Vo9g() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 69;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializer_init_$_anonymous_ = _init_$_anonymous_();
        int i4 = onExtraCallback + 97;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializer_init_$_anonymous_;
    }

    private static final /* synthetic */ LoanProductStatus[] $values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 45;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        LoanProductStatus[] loanProductStatusArr = {INIT, PRE_SCREENING_REQUEST, PRE_SCREENING_COMPLETE, PRE_SCREENING_APPROVE, PRE_SCREENING_DONE, PRE_SCREENING_DROP, PRE_SCREENING_TIMEOUT, PRE_SCREENING_FAIL, LOAN_APPLY, LOAN_PROGRESS, LOAN_CANCEL, INSPECT_PROGRESS, INSPECT_DONE, SCREENING_PROGRESS_DONE, LOAN_APPROVE, LOAN_APPLICATION_COMPLETE, LOAN_DROP, LOAN_HOLDING, LOAN_DEPOSIT_FAIL, LOAN_DEPOSIT_DROP, LOAN_APPROVE_CANCEL, UNKNOWN};
        int i5 = i2 + 93;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return loanProductStatusArr;
    }

    public static EnumEntries<LoanProductStatus> getEntries() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        EnumEntries<LoanProductStatus> enumEntries = $ENTRIES;
        int i4 = i3 + 125;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return enumEntries;
    }

    public static LoanProductStatus valueOf(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 25;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        LoanProductStatus loanProductStatus = (LoanProductStatus) Enum.valueOf(LoanProductStatus.class, str);
        int i4 = onExtraCallback + 113;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 20 / 0;
        }
        return loanProductStatus;
    }

    public static LoanProductStatus[] values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 45;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        LoanProductStatus[] loanProductStatusArr = (LoanProductStatus[]) $VALUES.clone();
        int i4 = onNavigationEvent + 83;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return loanProductStatusArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 61;
        onExtraCallback = i2 % 128;
        return i2 % 2 == 0 ? 1 : 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 99;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(name());
        if (i4 != 0) {
            throw null;
        }
    }

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final /* synthetic */ KSerializer IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 45;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializer = (KSerializer) LoanProductStatus.access$get$cachedSerializer$delegate$cp().getValue();
            int i4 = onExtraCallbackWithResult + 123;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return kSerializer;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final KSerializer<LoanProductStatus> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 109;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            KSerializer<LoanProductStatus> kSerializerIAuthTabCallback = IAuthTabCallback();
            int i4 = onExtraCallbackWithResult + 81;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerIAuthTabCallback;
        }
    }

    private LoanProductStatus(String str, int i) {
    }

    private static final /* synthetic */ KSerializer _init_$_anonymous_() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.loan.LoanProductStatus", values());
        int i4 = onExtraCallback + 7;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnExtraCallbackWithResult;
    }

    public static final /* synthetic */ Lazy access$get$cachedSerializer$delegate$cp() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return $cachedSerializer$delegate;
        }
        throw null;
    }

    static {
        IAuthTabCallbackStub = 0;
        onExtraCallbackWithResult();
        INIT = new LoanProductStatus("INIT", 0);
        PRE_SCREENING_REQUEST = new LoanProductStatus("PRE_SCREENING_REQUEST", 1);
        PRE_SCREENING_COMPLETE = new LoanProductStatus("PRE_SCREENING_COMPLETE", 2);
        PRE_SCREENING_APPROVE = new LoanProductStatus("PRE_SCREENING_APPROVE", 3);
        PRE_SCREENING_DONE = new LoanProductStatus("PRE_SCREENING_DONE", 4);
        PRE_SCREENING_DROP = new LoanProductStatus("PRE_SCREENING_DROP", 5);
        PRE_SCREENING_TIMEOUT = new LoanProductStatus("PRE_SCREENING_TIMEOUT", 6);
        PRE_SCREENING_FAIL = new LoanProductStatus("PRE_SCREENING_FAIL", 7);
        LOAN_APPLY = new LoanProductStatus("LOAN_APPLY", 8);
        LOAN_PROGRESS = new LoanProductStatus("LOAN_PROGRESS", 9);
        LOAN_CANCEL = new LoanProductStatus("LOAN_CANCEL", 10);
        INSPECT_PROGRESS = new LoanProductStatus("INSPECT_PROGRESS", 11);
        INSPECT_DONE = new LoanProductStatus("INSPECT_DONE", 12);
        SCREENING_PROGRESS_DONE = new LoanProductStatus("SCREENING_PROGRESS_DONE", 13);
        LOAN_APPROVE = new LoanProductStatus("LOAN_APPROVE", 14);
        LOAN_APPLICATION_COMPLETE = new LoanProductStatus("LOAN_APPLICATION_COMPLETE", 15);
        LOAN_DROP = new LoanProductStatus("LOAN_DROP", 16);
        LOAN_HOLDING = new LoanProductStatus("LOAN_HOLDING", 17);
        LOAN_DEPOSIT_FAIL = new LoanProductStatus("LOAN_DEPOSIT_FAIL", 18);
        LOAN_DEPOSIT_DROP = new LoanProductStatus("LOAN_DEPOSIT_DROP", 19);
        LOAN_APPROVE_CANCEL = new LoanProductStatus("LOAN_APPROVE_CANCEL", 20);
        Object[] objArr = new Object[1];
        a((char) Color.argb(0, 0, 0, 0), (-1685752452) - View.resolveSize(0, 0), new char[]{58993, 44350, 63818, 28981, 5982, 8380, 18755}, new char[]{4903, 50571, 7030, 4117}, new char[]{31919, 34165, 42139, 6444}, objArr);
        UNKNOWN = new LoanProductStatus(((String) objArr[0]).intern(), 21);
        LoanProductStatus[] loanProductStatusArr$values = $values();
        $VALUES = loanProductStatusArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(loanProductStatusArr$values);
        Companion = new Companion(null);
        CREATOR = new Parcelable.Creator<LoanProductStatus>() { // from class: viva.republica.toss.network.model.loan.LoanProductStatus.IAuthTabCallback
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ LoanProductStatus createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 87;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    return onExtraCallback(parcel);
                }
                onExtraCallback(parcel);
                throw null;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ LoanProductStatus[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 115;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                LoanProductStatus[] loanProductStatusArrOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
                int i5 = onNavigationEvent + 11;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return loanProductStatusArrOnExtraCallbackWithResult;
            }

            public final LoanProductStatus onExtraCallback(Parcel parcel) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 81;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                LoanProductStatus loanProductStatusValueOf = LoanProductStatus.valueOf(parcel.readString());
                int i4 = onWarmupCompleted + 115;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return loanProductStatusValueOf;
            }

            public final LoanProductStatus[] onExtraCallbackWithResult(int i) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 105;
                int i4 = i3 % 128;
                onNavigationEvent = i4;
                LoanProductStatus[] loanProductStatusArr = new LoanProductStatus[i];
                if (i3 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i5 = i4 + 21;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return loanProductStatusArr;
            }
        };
        $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.loan.LoanProductStatus$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 105;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializer$r8$lambda$zohf2wuALg6hgvlgXmH5TD2Vo9g = LoanProductStatus.$r8$lambda$zohf2wuALg6hgvlgXmH5TD2Vo9g();
                int i4 = onWarmupCompleted + 87;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    return kSerializer$r8$lambda$zohf2wuALg6hgvlgXmH5TD2Vo9g;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        int i = onTransact + 65;
        IAuthTabCallbackStub = i % 128;
        int i2 = i % 2;
    }

    public final boolean isInternalCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        boolean zContains = CollectionsKt.listOf(LOAN_APPLICATION_COMPLETE).contains(this);
        if (i3 != 0) {
            int i4 = 93 / 0;
        }
        return zContains;
    }

    public final boolean isApproved() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 97;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        List listListOf = CollectionsKt.listOf(LOAN_APPROVE);
        if (i3 != 0) {
            return listListOf.contains(this);
        }
        int i4 = 93 / 0;
        return listListOf.contains(this);
    }

    public final boolean isApplied() {
        List listListOf;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 91;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            LoanProductStatus loanProductStatus = LOAN_APPLY;
            LoanProductStatus loanProductStatus2 = LOAN_PROGRESS;
            LoanProductStatus[] loanProductStatusArr = new LoanProductStatus[4];
            loanProductStatusArr[0] = loanProductStatus;
            loanProductStatusArr[1] = loanProductStatus2;
            listListOf = CollectionsKt.listOf(loanProductStatusArr);
        } else {
            listListOf = CollectionsKt.listOf(new LoanProductStatus[]{LOAN_APPLY, LOAN_PROGRESS});
        }
        boolean zContains = listListOf.contains(this);
        int i3 = onExtraCallback + 51;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 53 / 0;
        }
        return zContains;
    }

    public final boolean isFailed() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 121;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zContains = CollectionsKt.listOf(new LoanProductStatus[]{LOAN_DROP, LOAN_DEPOSIT_FAIL, LOAN_DEPOSIT_DROP, LOAN_APPROVE_CANCEL, LOAN_HOLDING}).contains(this);
        int i4 = onExtraCallback + 97;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return zContains;
    }

    public final boolean canScreeningProcess() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zContains = CollectionsKt.listOf(INIT).contains(this);
        int i4 = onExtraCallback + 123;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 8 / 0;
        }
        return zContains;
    }

    public final boolean isTimeout() {
        boolean zContains;
        int i = 2 % 2;
        int i2 = onExtraCallback + 37;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            zContains = CollectionsKt.listOf(PRE_SCREENING_TIMEOUT).contains(this);
            int i3 = 5 / 0;
        } else {
            zContains = CollectionsKt.listOf(PRE_SCREENING_TIMEOUT).contains(this);
        }
        int i4 = onNavigationEvent + 55;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return zContains;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i4 = $11 + 59;
            $10 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ImageFormat.getBitsPerPixel(0) + 1), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 44, (ViewConfiguration.getEdgeSlop() >> 16) + 1451, 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) 1;
                    byte b4 = (byte) (b3 - 1);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 49124), (-16777172) - Color.rgb(0, 0, 0), Color.green(0) + 1494, 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.resolveSize(0, 0) + 23972), KeyEvent.getDeadChar(0, 0) + 50, Drawable.resolveOpacity(0, 0) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 45847), (ViewConfiguration.getTapTimeout() >> 16) + 29, (ViewConfiguration.getScrollBarSize() >> 8) + 12577, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onExtraCallbackWithResult ^ 7798559133331975163L)) ^ ((int) (IAuthTabCallback ^ 7798559133331975163L))) ^ ((char) (onWarmupCompleted ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                i2 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i6 = $10 + 3;
        $11 = i6 % 128;
        if (i6 % 2 != 0) {
            objArr[0] = str;
        } else {
            int i7 = 60 / 0;
            objArr[0] = str;
        }
    }

    static void onExtraCallbackWithResult() {
        onExtraCallbackWithResult = 8948396549657491676L;
        IAuthTabCallback = -1776194565;
        onWarmupCompleted = (char) 27643;
    }
}
