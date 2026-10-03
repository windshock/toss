package o;

import android.graphics.Color;
import android.os.Process;
import android.view.ViewConfiguration;
import im.toss.features.edoc.register.AptPasswordActivity$;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class NativeReactDevToolsSettingsManagerSpec {
    public static final int $stable = 8;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private final onWarmupCompleted cardType;
    private String done;
    private final share emptyState;
    private final int excludedCount;
    private final boolean hasForeign;
    private final boolean hasForeignWithExcluded;
    private final String imageUrl;
    private final ArrayList<formatToParts> installments;
    private long lastSyncTs;
    private final String title;
    private final String totalExpense;
    private final String totalExpenseWithExcluded;
    private final String totalIncome;
    private final int transactionCount;
    private final ArrayList<NativeRedBoxSpec> transactions;

    public NativeReactDevToolsSettingsManagerSpec() {
        this(null, null, null, null, false, null, false, 0, null, 0L, null, 0, null, null, null, 32767, null);
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i;
        int i8 = (~(i7 | i5)) | i2;
        int i9 = ~i5;
        int i10 = i7 | i2;
        int i11 = (~(i | i9 | i2)) | (~(i10 | i5));
        int i12 = (~i10) | (~(i9 | (~i2)));
        int i13 = i2 + i5 + i6 + (1353909401 * i4) + ((-1351514252) * i3);
        int i14 = i13 * i13;
        int i15 = (1883508457 * i2) + 799145984 + ((-1483212659) * i5) + (2050486552 * i8) + (i11 * 1122240372) + (1122240372 * i12) + ((-360972288) * i6) + (337379328 * i4) + ((-1540358144) * i3) + (669122560 * i14);
        int i16 = ((i2 * 521834465) - 1171472169) + (i5 * 521833829) + (i8 * (-424)) + (i11 * 212) + (i12 * 212) + (i6 * 521834041) + (i4 * 1123214353) + (i3 * (-684621612)) + (i14 * 1028784128);
        return i15 + ((i16 * i16) * 1635647488) != 1 ? onWarmupCompleted(objArr) : IAuthTabCallback(objArr);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallbackWithResult + 103;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return true;
            }
            throw null;
        }
        if (!(obj instanceof NativeReactDevToolsSettingsManagerSpec)) {
            return false;
        }
        NativeReactDevToolsSettingsManagerSpec nativeReactDevToolsSettingsManagerSpec = (NativeReactDevToolsSettingsManagerSpec) obj;
        if (!Intrinsics.areEqual(this.totalExpense, nativeReactDevToolsSettingsManagerSpec.totalExpense) || !Intrinsics.areEqual(this.totalIncome, nativeReactDevToolsSettingsManagerSpec.totalIncome) || !Intrinsics.areEqual(this.transactions, nativeReactDevToolsSettingsManagerSpec.transactions)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.installments, nativeReactDevToolsSettingsManagerSpec.installments)) {
            int i3 = onExtraCallbackWithResult + 7;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (this.hasForeign != nativeReactDevToolsSettingsManagerSpec.hasForeign || !Intrinsics.areEqual(this.totalExpenseWithExcluded, nativeReactDevToolsSettingsManagerSpec.totalExpenseWithExcluded) || this.hasForeignWithExcluded != nativeReactDevToolsSettingsManagerSpec.hasForeignWithExcluded) {
            return false;
        }
        if (this.excludedCount != nativeReactDevToolsSettingsManagerSpec.excludedCount) {
            int i5 = onExtraCallbackWithResult + 79;
            onExtraCallback = i5 % 128;
            return i5 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.done, nativeReactDevToolsSettingsManagerSpec.done)) {
            int i6 = onExtraCallbackWithResult + 75;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (this.lastSyncTs != nativeReactDevToolsSettingsManagerSpec.lastSyncTs) {
            return false;
        }
        if (!Intrinsics.areEqual(this.imageUrl, nativeReactDevToolsSettingsManagerSpec.imageUrl)) {
            int i8 = onExtraCallbackWithResult + 117;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (this.transactionCount != nativeReactDevToolsSettingsManagerSpec.transactionCount) {
            int i10 = onExtraCallback + 15;
            onExtraCallbackWithResult = i10 % 128;
            if (i10 % 2 == 0) {
                return false;
            }
            throw null;
        }
        if (this.cardType != nativeReactDevToolsSettingsManagerSpec.cardType || !Intrinsics.areEqual(this.emptyState, nativeReactDevToolsSettingsManagerSpec.emptyState)) {
            return false;
        }
        if (Intrinsics.areEqual(this.title, nativeReactDevToolsSettingsManagerSpec.title)) {
            return true;
        }
        int i11 = onExtraCallback + 105;
        onExtraCallbackWithResult = i11 % 128;
        int i12 = i11 % 2;
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 105;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = this.totalExpense.hashCode();
        int iHashCode2 = this.totalIncome.hashCode();
        int iHashCode3 = this.transactions.hashCode();
        int iHashCode4 = this.installments.hashCode();
        int iHashCode5 = Boolean.hashCode(this.hasForeign);
        int iHashCode6 = this.totalExpenseWithExcluded.hashCode();
        int iHashCode7 = Boolean.hashCode(this.hasForeignWithExcluded);
        int iHashCode8 = Integer.hashCode(this.excludedCount);
        int iHashCode9 = this.done.hashCode();
        int iHashCode10 = Long.hashCode(this.lastSyncTs);
        int iHashCode11 = this.imageUrl.hashCode();
        int iHashCode12 = Integer.hashCode(this.transactionCount);
        onWarmupCompleted onwarmupcompleted = this.cardType;
        int iHashCode13 = onwarmupcompleted == null ? 0 : onwarmupcompleted.hashCode();
        share shareVar = this.emptyState;
        if (shareVar != null) {
            int iHashCode14 = shareVar.hashCode();
            int i5 = onExtraCallbackWithResult + 47;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            i = iHashCode14;
        } else {
            i = 0;
        }
        return (((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + i) * 31) + this.title.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ConsumptionTransactions(totalExpense=" + this.totalExpense + ", totalIncome=" + this.totalIncome + ", transactions=" + this.transactions + ", installments=" + this.installments + ", hasForeign=" + this.hasForeign + ", totalExpenseWithExcluded=" + this.totalExpenseWithExcluded + ", hasForeignWithExcluded=" + this.hasForeignWithExcluded + ", excludedCount=" + this.excludedCount + ", done=" + this.done + ", lastSyncTs=" + this.lastSyncTs + ", imageUrl=" + this.imageUrl + ", transactionCount=" + this.transactionCount + ", cardType=" + this.cardType + ", emptyState=" + this.emptyState + ", title=" + this.title + ")";
        int i2 = onExtraCallback + 57;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onWarmupCompleted {
        private static int $10 = 0;
        private static int $11 = 1;
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onWarmupCompleted[] $VALUES;
        public static final onWarmupCompleted CHECK;
        public static final onWarmupCompleted CREDIT;
        private static long IAuthTabCallback = 0;
        public static final onWarmupCompleted UNKNOWN;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        private static final /* synthetic */ onWarmupCompleted[] $values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 33;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return new onWarmupCompleted[]{UNKNOWN, CREDIT, CHECK};
            }
            onWarmupCompleted[] onwarmupcompletedArr = {UNKNOWN, CREDIT};
            onwarmupcompletedArr[2] = CHECK;
            return onwarmupcompletedArr;
        }

        public static EnumEntries<onWarmupCompleted> getEntries() {
            EnumEntries<onWarmupCompleted> enumEntries;
            int i = 2 % 2;
            int i2 = onExtraCallback + 123;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            if (i2 % 2 == 0) {
                enumEntries = $ENTRIES;
                int i4 = 17 / 0;
            } else {
                enumEntries = $ENTRIES;
            }
            int i5 = i3 + 89;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return enumEntries;
        }

        public static onWarmupCompleted valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 75;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) Enum.valueOf(onWarmupCompleted.class, str);
            if (i3 == 0) {
                throw null;
            }
            int i4 = onExtraCallback + 121;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return onwarmupcompleted;
            }
            obj.hashCode();
            throw null;
        }

        public static onWarmupCompleted[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 59;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted[] onwarmupcompletedArr = (onWarmupCompleted[]) $VALUES.clone();
            int i4 = onExtraCallbackWithResult + 55;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 75 / 0;
            }
            return onwarmupcompletedArr;
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
            char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(IAuthTabCallback ^ (-7907085296252847348L), cArr, i);
            timelineExternalSyntheticLambda0.onNavigationEvent = 4;
            while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
                int i3 = $10 + 65;
                $11 = i3 % 128;
                int i4 = i3 % 2;
                timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
                int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(IAuthTabCallback)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45813 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 84 - (ViewConfiguration.getLongPressTimeout() >> 16), 21233 - (ViewConfiguration.getTouchSlop() >> 8), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    try {
                        Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 14185), 19 - (Process.myTid() >> 22), 8808 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 64918803, false, "d", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback2).invoke(null, objArr3);
                        int i6 = $11 + 117;
                        $10 = i6 % 128;
                        int i7 = i6 % 2;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        }

        private onWarmupCompleted(String str, int i) {
        }

        static {
            onWarmupCompleted();
            Object[] objArr = new Object[1];
            a(new char[]{57216, 57301, 32018, 3926, 28011, 27656, 35124, 14936, 6119, 18295, 49433}, (-16777216) - Color.rgb(0, 0, 0), objArr);
            UNKNOWN = new onWarmupCompleted(((String) objArr[0]).intern(), 0);
            CREDIT = new onWarmupCompleted("CREDIT", 1);
            CHECK = new onWarmupCompleted("CHECK", 2);
            onWarmupCompleted[] onwarmupcompletedArr$values = $values();
            $VALUES = onwarmupcompletedArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onwarmupcompletedArr$values);
            int i = onNavigationEvent + 83;
            onWarmupCompleted = i % 128;
            int i2 = i % 2;
        }

        static void onWarmupCompleted() {
            IAuthTabCallback = -6001277093772850938L;
        }
    }

    public NativeReactDevToolsSettingsManagerSpec(@NotNull String str, @NotNull String str2, @NotNull ArrayList<NativeRedBoxSpec> arrayList, @NotNull ArrayList<formatToParts> arrayList2, boolean z, @NotNull String str3, boolean z2, int i, @NotNull String str4, long j, @NotNull String str5, int i2, @Nullable onWarmupCompleted onwarmupcompleted, @Nullable share shareVar, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(arrayList2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.totalExpense = str;
        this.totalIncome = str2;
        this.transactions = arrayList;
        this.installments = arrayList2;
        this.hasForeign = z;
        this.totalExpenseWithExcluded = str3;
        this.hasForeignWithExcluded = z2;
        this.excludedCount = i;
        this.done = str4;
        this.lastSyncTs = j;
        this.imageUrl = str5;
        this.transactionCount = i2;
        this.cardType = onwarmupcompleted;
        this.emptyState = shareVar;
        this.title = str6;
    }

    public /* synthetic */ NativeReactDevToolsSettingsManagerSpec(String str, String str2, ArrayList arrayList, ArrayList arrayList2, boolean z, String str3, boolean z2, int i, String str4, long j, String str5, int i2, onWarmupCompleted onwarmupcompleted, share shareVar, String str6, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        String str7;
        ArrayList arrayList3;
        boolean z3;
        String str8;
        String str9;
        long j2;
        String str10;
        int i4;
        String str11;
        onWarmupCompleted onwarmupcompleted2;
        String str12 = (i3 & 1) != 0 ? "" : str;
        if ((i3 & 2) != 0) {
            int i5 = onExtraCallbackWithResult + 89;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 65 / 0;
            }
            str7 = "";
        } else {
            str7 = str2;
        }
        ArrayList arrayList4 = (i3 & 4) != 0 ? new ArrayList() : arrayList;
        if ((i3 & 8) != 0) {
            arrayList3 = new ArrayList();
            int i7 = 2 % 2;
        } else {
            arrayList3 = arrayList2;
        }
        if ((i3 & 16) != 0) {
            int i8 = onExtraCallbackWithResult + 41;
            onExtraCallback = i8 % 128;
            z3 = i8 % 2 == 0;
        } else {
            z3 = z;
        }
        if ((i3 & 32) != 0) {
            int i9 = onExtraCallbackWithResult + 79;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            str8 = "";
        } else {
            str8 = str3;
        }
        boolean z4 = (i3 & 64) != 0 ? false : z2;
        int i11 = (i3 & 128) != 0 ? 0 : i;
        if ((i3 & 256) != 0) {
            int i12 = onExtraCallback + 123;
            onExtraCallbackWithResult = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 4 / 0;
            }
            int i14 = 2 % 2;
            str9 = "N";
        } else {
            str9 = str4;
        }
        if ((i3 & 512) != 0) {
            int i15 = onExtraCallbackWithResult + 93;
            onExtraCallback = i15 % 128;
            int i16 = i15 % 2;
            j2 = 0;
        } else {
            j2 = j;
        }
        if ((i3 & 1024) != 0) {
            int i17 = 2 % 2;
            str10 = "";
        } else {
            str10 = str5;
        }
        if ((i3 & 2048) != 0) {
            int i18 = 2 % 2;
            i4 = 0;
        } else {
            i4 = i2;
        }
        if ((i3 & 4096) != 0) {
            int i19 = onExtraCallbackWithResult + 99;
            str11 = "";
            onExtraCallback = i19 % 128;
            if (i19 % 2 == 0) {
                shareVar.hashCode();
                throw null;
            }
            onwarmupcompleted2 = null;
        } else {
            str11 = "";
            onwarmupcompleted2 = onwarmupcompleted;
        }
        this(str12, str7, arrayList4, arrayList3, z3, str8, z4, i11, str9, j2, str10, i4, onwarmupcompleted2, (i3 & 8192) == 0 ? shareVar : null, (i3 & 16384) != 0 ? str11 : str6);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        NativeReactDevToolsSettingsManagerSpec nativeReactDevToolsSettingsManagerSpec = (NativeReactDevToolsSettingsManagerSpec) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 63;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = nativeReactDevToolsSettingsManagerSpec.totalExpense;
        if (i4 == 0) {
            int i5 = 66 / 0;
        }
        int i6 = i2 + 63;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final ArrayList<NativeRedBoxSpec> asInterface() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 19;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        ArrayList<NativeRedBoxSpec> arrayList = this.transactions;
        int i5 = i2 + 29;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return arrayList;
    }

    public final ArrayList<formatToParts> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 87;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        ArrayList<formatToParts> arrayList = this.installments;
        int i4 = i2 + 11;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 1 / 0;
        }
        return arrayList;
    }

    public final boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 121;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        boolean z = this.hasForeign;
        int i4 = i3 + 125;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 97 / 0;
        }
        return z;
    }

    public final String onTransact() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 91;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String str = this.totalExpenseWithExcluded;
        if (i3 != 0) {
            int i4 = 83 / 0;
        }
        return str;
    }

    public final boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 7;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        boolean z = this.hasForeignWithExcluded;
        int i4 = i2 + 51;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final int IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 31;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.excludedCount;
        int i6 = i2 + 99;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 51;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.imageUrl;
        int i5 = i2 + 49;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final int IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 9;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.transactionCount;
        int i6 = i2 + 91;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 39 / 0;
        }
        return i5;
    }

    public final String asBinder() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 53;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.title;
        int i4 = i3 + 113;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        NativeReactDevToolsSettingsManagerSpec nativeReactDevToolsSettingsManagerSpec = (NativeReactDevToolsSettingsManagerSpec) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 113;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            nativeReactDevToolsSettingsManagerSpec.transactions.iterator();
            throw null;
        }
        Iterator<T> it = nativeReactDevToolsSettingsManagerSpec.transactions.iterator();
        while (it.hasNext()) {
            ((NativeRedBoxSpec) it.next()).access000();
            int i3 = onExtraCallbackWithResult + 69;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
        }
        Iterator<T> it2 = nativeReactDevToolsSettingsManagerSpec.installments.iterator();
        while (it2.hasNext()) {
            formatToParts.onWarmupCompleted(AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), 1450698653, new Object[]{(formatToParts) it2.next()}, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), -1450698645, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted());
        }
        return null;
    }

    public final boolean getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ArrayList<NativeRedBoxSpec> arrayList = this.transactions;
        if (arrayList != null && arrayList.isEmpty()) {
            int i3 = onExtraCallback + 15;
            onExtraCallbackWithResult = i3 % 128;
            return i3 % 2 != 0;
        }
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            int i4 = onExtraCallback + 69;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            List<formatToParts> listIAuthTabCallbackDefault = ((NativeRedBoxSpec) it.next()).IAuthTabCallbackDefault();
            if (!(listIAuthTabCallbackDefault instanceof Collection) || !listIAuthTabCallbackDefault.isEmpty()) {
                Iterator<T> it2 = listIAuthTabCallbackDefault.iterator();
                while (it2.hasNext()) {
                    int i6 = onExtraCallback + 61;
                    onExtraCallbackWithResult = i6 % 128;
                    if (i6 % 2 != 0) {
                        int i7 = 92 / 0;
                        if (((formatToParts) it2.next()).access100()) {
                            int i8 = onExtraCallbackWithResult + 15;
                            onExtraCallback = i8 % 128;
                            int i9 = i8 % 2;
                            return true;
                        }
                    } else if (((formatToParts) it2.next()).access100()) {
                        int i82 = onExtraCallbackWithResult + 15;
                        onExtraCallback = i82 % 128;
                        int i92 = i82 % 2;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final String IAuthTabCallbackDefault() {
        int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult();
        return (String) onNavigationEvent(iOnExtraCallbackWithResult, -1478617677, UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, 1478617678, new Object[]{this}, iOnExtraCallbackWithResult2);
    }

    public final void access100() {
        int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult();
        onNavigationEvent(iOnExtraCallbackWithResult, 164917426, UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, -164917426, new Object[]{this}, iOnExtraCallbackWithResult2);
    }
}
