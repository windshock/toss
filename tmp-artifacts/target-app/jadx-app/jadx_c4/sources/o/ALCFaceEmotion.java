package o;

import android.os.SystemClock;
import com.google.gson.annotations.SerializedName;
import im.toss.compose.v0.ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ALCFaceEmotion;
import o.makeJpegBase64;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ALCFaceEmotion implements Serializable {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;

    @SerializedName("completedMeasures")
    private final List<makeJpegBase64> completedMeasures;

    @SerializedName("extras")
    private final Map<String, Object> extras;

    @SerializedName("inProgressMeasure")
    private makeJpegBase64 inProgressMeasure;
    private String name;
    private String traceId;
    public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
    private static final AppSetIdAndScope1 onWarmupCompleted = ea10.onExtraCallbackWithResult("TimeMeasure");

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i6;
        int i8 = ~i3;
        int i9 = ~i4;
        int i10 = (~(i7 | i8 | i9)) | (~(i3 | i4));
        int i11 = ~(i7 | i9);
        int i12 = i3 | i11;
        int i13 = (~(i4 | i6)) | i11 | (~(i8 | i6));
        int i14 = i6 + i3 + i2 + (296844165 * i) + (1729652556 * i5);
        int i15 = i14 * i14;
        int i16 = ((i6 * 599922083) - 580124672) + (599922083 * i3) + (2088888926 * i10) + ((-117189444) * i12) + ((-2088888926) * i13) + ((-1606156288) * i2) + ((-279707648) * i) + ((-265289728) * i5) + (2117271552 * i15);
        int i17 = (i6 * (-1181628991)) + 1322814002 + (i3 * (-1181628991)) + (i10 * (-118)) + (i12 * (-236)) + (i13 * 118) + (i2 * (-1181629109)) + (i * (-698251017)) + (i5 * 1773125444) + (i15 * 938541056);
        return i16 + ((i17 * i17) * (-109772800)) != 1 ? onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr);
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        makeJpegBase64 makejpegbase64 = (makeJpegBase64) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 45;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {makejpegbase64};
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback4 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        if (i3 == 0) {
            throw null;
        }
        CharSequence charSequence = (CharSequence) IAuthTabCallback(iOnExtraCallback3, iOnExtraCallback2, 907415262, iOnExtraCallback, iOnExtraCallback4, -907415262, objArr2);
        int i4 = onExtraCallbackWithResult + 55;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return charSequence;
    }

    public ALCFaceEmotion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.name = str;
        this.completedMeasures = new ArrayList();
        this.extras = new LinkedHashMap();
    }

    public final List<makeJpegBase64> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 23;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        List<makeJpegBase64> list = this.completedMeasures;
        int i4 = i3 + 93;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return list;
        }
        obj.hashCode();
        throw null;
    }

    public final Map<String, Object> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 45;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Map<String, Object> map = this.extras;
        int i5 = i2 + 107;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 63 / 0;
        }
        return map;
    }

    public final void onNavigationEvent(@Nullable String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 87;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        this.traceId = str;
        if (i4 != 0) {
            int i5 = 56 / 0;
        }
        int i6 = i2 + 19;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public final void onWarmupCompleted(@NotNull ALCFaceEmotion aLCFaceEmotion) {
        makeJpegBase64 makejpegbase64IAuthTabCallback;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(aLCFaceEmotion, "");
        aLCFaceEmotion.completedMeasures.clear();
        List<makeJpegBase64> list = aLCFaceEmotion.completedMeasures;
        List<makeJpegBase64> list2 = this.completedMeasures;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            int i2 = IAuthTabCallback + 57;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            arrayList.add(makeJpegBase64.IAuthTabCallback((makeJpegBase64) it.next(), 0L, null, 0L, 7, null));
        }
        list.addAll(arrayList);
        makeJpegBase64 makejpegbase64 = this.inProgressMeasure;
        if (makejpegbase64 != null) {
            int i4 = IAuthTabCallback + 111;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            makejpegbase64IAuthTabCallback = makeJpegBase64.IAuthTabCallback(makejpegbase64, 0L, null, 0L, 7, null);
        } else {
            makejpegbase64IAuthTabCallback = null;
        }
        aLCFaceEmotion.inProgressMeasure = makejpegbase64IAuthTabCallback;
        aLCFaceEmotion.traceId = this.traceId;
        aLCFaceEmotion.extras.putAll(this.extras);
    }

    public final boolean onExtraCallback() {
        int i = 2 % 2;
        if (this.inProgressMeasure != null) {
            int i2 = IAuthTabCallback + 79;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = onExtraCallbackWithResult + 55;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(ALCFaceEmotion aLCFaceEmotion, long j, int i, Object obj) throws Throwable {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 113;
        int i4 = i3 % 128;
        onExtraCallbackWithResult = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 83;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 != 0) {
                SystemClock.elapsedRealtime();
                throw null;
            }
            j = SystemClock.elapsedRealtime();
        }
        aLCFaceEmotion.onExtraCallbackWithResult(j);
    }

    public final void onExtraCallbackWithResult(long j) throws Throwable {
        int i = 2 % 2;
        if (this.inProgressMeasure != null) {
            ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "TimeMeasure", this.name + " already exists started measurement", access8100.onNavigationEvent(getWrite.IAuthTabCallback("timeMeasureInfo", this.completedMeasures)), (String) null, false, (String) null, 56, (Object) null);
        }
        makeJpegBase64 makejpegbase64 = new makeJpegBase64(0L, null, 0L, 7, null);
        makejpegbase64.onNavigationEvent(j);
        this.inProgressMeasure = makejpegbase64;
        int i2 = IAuthTabCallback + 73;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void onNavigationEvent(ALCFaceEmotion aLCFaceEmotion, String str, boolean z, long j, int i, Object obj) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult;
        int i4 = i3 + 43;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0 ? (i & 2) != 0 : (i & 4) != 0) {
            int i5 = i3 + 9;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        }
        if ((i & 4) != 0) {
            int i7 = IAuthTabCallback + 97;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            j = SystemClock.elapsedRealtime();
        }
        aLCFaceEmotion.onExtraCallbackWithResult(str, z, j);
    }

    public final void onExtraCallbackWithResult(@NotNull String str, boolean z, long j) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        makeJpegBase64 makejpegbase64 = this.inProgressMeasure;
        if (makejpegbase64 != null) {
            makejpegbase64.onExtraCallbackWithResult(str, j);
            this.completedMeasures.add(makejpegbase64);
            this.inProgressMeasure = null;
        }
        if (z) {
            onNavigationEvent();
            List<makeJpegBase64> list = this.completedMeasures;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (makeJpegBase64 makejpegbase642 : list) {
                arrayList.add(makejpegbase642.onExtraCallbackWithResult() + ":" + makejpegbase642.onNavigationEvent() + "ms");
            }
            CollectionsKt.joinToString$default(arrayList, " → ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
        } else {
            onNavigationEvent();
            List<makeJpegBase64> list2 = this.completedMeasures;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (makeJpegBase64 makejpegbase643 : list2) {
                arrayList2.add(makejpegbase643.onExtraCallbackWithResult() + ":" + makejpegbase643.onNavigationEvent() + "ms");
            }
            CollectionsKt.joinToString$default(arrayList2, " → ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
        }
        if (!z) {
            int i2 = onExtraCallbackWithResult + 77;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult(j + 1);
        }
        int i4 = onExtraCallbackWithResult + 107;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ downloadZip onExtraCallback(ALCFaceEmotion aLCFaceEmotion, String str, String str2, Boolean bool, Boolean bool2, boolean z, Long l, Long l2, Long l3, String str3, int i, Object obj) {
        Long l4;
        Long l5;
        int i2 = 2 % 2;
        Long l6 = (i & 32) != 0 ? null : l;
        if ((i & 64) != 0) {
            int i3 = onExtraCallbackWithResult + 3;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 87 / 0;
            }
            l4 = null;
        } else {
            l4 = l2;
        }
        if ((i & 128) != 0) {
            int i5 = IAuthTabCallback + 89;
            int i6 = i5 % 128;
            onExtraCallbackWithResult = i6;
            if (i5 % 2 == 0) {
                int i7 = 14 / 0;
            }
            int i8 = i6 + 45;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            l5 = null;
        } else {
            l5 = l3;
        }
        return aLCFaceEmotion.onExtraCallbackWithResult(str, str2, bool, bool2, z, l6, l4, l5, (i & 256) != 0 ? null : str3);
    }

    public final downloadZip onExtraCallbackWithResult(@NotNull String str, @NotNull String str2, @Nullable Boolean bool, @Nullable Boolean bool2, boolean z, @Nullable Long l, @Nullable Long l2, @Nullable Long l3, @Nullable String str3) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 111;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (!(!this.completedMeasures.isEmpty())) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<makeJpegBase64> list = this.completedMeasures;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (makeJpegBase64 makejpegbase64 : list) {
            int i4 = IAuthTabCallback + 105;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            arrayList.add(getWrite.IAuthTabCallback(makejpegbase64.onExtraCallbackWithResult(), Long.valueOf(makejpegbase64.onNavigationEvent())));
        }
        access8100.onExtraCallbackWithResult(linkedHashMap, CollectionsKt.toMutableList(arrayList));
        return Error.Companion.onNavigationEvent("ui-launch", str, onNavigationEvent(), str2, bool != null ? bool.booleanValue() : false, z, linkedHashMap, this.traceId, bool2, l, l2, l3, str3, this.extras);
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        makeJpegBase64 makejpegbase64 = (makeJpegBase64) objArr[0];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(makejpegbase64, "");
        String str = makejpegbase64.onExtraCallbackWithResult() + ":" + makejpegbase64.onNavigationEvent() + "ms";
        int i2 = onExtraCallbackWithResult + 5;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TimeMeasure([" + this.name + "] total:" + onNavigationEvent() + "ms (" + CollectionsKt.joinToString$default(this.completedMeasures, " → ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: im.toss.core.utils.TimeMeasure$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 99;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
                int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
                CharSequence charSequence = (CharSequence) ALCFaceEmotion.IAuthTabCallback(ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2, -2065514573, iOnExtraCallback, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), 2065514574, new Object[]{(makeJpegBase64) obj});
                int i5 = onExtraCallbackWithResult + 85;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 17 / 0;
                }
                return charSequence;
            }
        }, 30, (Object) null) + ")";
        int i2 = onExtraCallbackWithResult + 75;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (Intrinsics.areEqual(ALCFaceEmotion.class, obj != null ? obj.getClass() : null)) {
            Intrinsics.checkNotNull(obj, "");
            ALCFaceEmotion aLCFaceEmotion = (ALCFaceEmotion) obj;
            if (Intrinsics.areEqual(this.completedMeasures, aLCFaceEmotion.completedMeasures)) {
                return Intrinsics.areEqual(this.inProgressMeasure, aLCFaceEmotion.inProgressMeasure);
            }
            int i2 = onExtraCallbackWithResult + 17;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = onExtraCallbackWithResult + 11;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 109;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = this.completedMeasures.hashCode();
        makeJpegBase64 makejpegbase64 = this.inProgressMeasure;
        if (makejpegbase64 != null) {
            int i4 = IAuthTabCallback + 15;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                makejpegbase64.hashCode();
                throw null;
            }
            iHashCode = makejpegbase64.hashCode();
        } else {
            iHashCode = 0;
        }
        int i5 = (iHashCode2 * 31) + iHashCode;
        int i6 = onExtraCallbackWithResult + 109;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 23 / 0;
        }
        return i5;
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }

    static {
        int i = onNavigationEvent + 13;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 109;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        if (this.completedMeasures.isEmpty()) {
            return 0L;
        }
        List<makeJpegBase64> list = this.completedMeasures;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        int i4 = onExtraCallbackWithResult + 61;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        while (it.hasNext()) {
            int i6 = IAuthTabCallback + 125;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            arrayList.add(Long.valueOf(((makeJpegBase64) it.next()).onNavigationEvent()));
        }
        Iterator it2 = arrayList.iterator();
        if (!it2.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it2.next();
        while (it2.hasNext()) {
            int i8 = IAuthTabCallback + 125;
            onExtraCallbackWithResult = i8 % 128;
            if (i8 % 2 == 0) {
                next = Long.valueOf(((Number) next).longValue() ^ ((Number) it2.next()).longValue());
            } else {
                next = Long.valueOf(((Number) next).longValue() + ((Number) it2.next()).longValue());
            }
        }
        return ((Number) next).longValue();
    }

    public static /* synthetic */ CharSequence onNavigationEvent(makeJpegBase64 makejpegbase64) {
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        return (CharSequence) IAuthTabCallback(ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2, -2065514573, iOnExtraCallback, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), 2065514574, new Object[]{makejpegbase64});
    }

    private static final CharSequence onExtraCallbackWithResult(makeJpegBase64 makejpegbase64) {
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        return (CharSequence) IAuthTabCallback(ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2, 907415262, iOnExtraCallback, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), -907415262, new Object[]{makejpegbase64});
    }
}
