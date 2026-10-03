package viva.republica.toss.network.model.loan;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkCanOpenLandingPage;
import o.getMutilBackgroundDrawable;
import o.getPreRenderJob;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.loan.ReviewContents;
import viva.republica.toss.network.model.loan.ReviewContents$;
import viva.republica.toss.network.model.loan.ReviewContents$EvaluationContent$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ReviewContents implements Parcelable {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private final EvaluationContent evaluationContent;
    private final List<SubjectiveContent> subjectiveContents;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ReviewContents> CREATOR = new Creator();
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.loan.ReviewContents$$ExternalSyntheticLambda0
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 59;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerIAuthTabCallback = ReviewContents.IAuthTabCallback();
            int i4 = onExtraCallbackWithResult + 99;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return kSerializerIAuthTabCallback;
            }
            throw null;
        }
    })};

    public static final class Creator implements Parcelable.Creator<ReviewContents> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        public final ReviewContents IAuthTabCallback(Parcel parcel) {
            ArrayList arrayList;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            EvaluationContent evaluationContentCreateFromParcel = EvaluationContent.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                int i3 = 0;
                while (i3 != i2) {
                    int i4 = onNavigationEvent + 109;
                    onExtraCallback = i4 % 128;
                    if (i4 % 2 != 0) {
                        arrayList2.add(SubjectiveContent.CREATOR.createFromParcel(parcel));
                        i3 += 7;
                    } else {
                        arrayList2.add(SubjectiveContent.CREATOR.createFromParcel(parcel));
                        i3++;
                    }
                }
                int i5 = onExtraCallback + 83;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                arrayList = arrayList2;
            }
            return new ReviewContents(evaluationContentCreateFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ ReviewContents createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 103;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return IAuthTabCallback(parcel);
            }
            IAuthTabCallback(parcel);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ ReviewContents[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 93;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            ReviewContents[] reviewContentsArrOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
            if (i4 != 0) {
                int i5 = 53 / 0;
            }
            int i6 = onExtraCallback + 5;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 27 / 0;
            }
            return reviewContentsArrOnExtraCallbackWithResult;
        }

        public final ReviewContents[] onExtraCallbackWithResult(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent;
            int i4 = i3 + 75;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            ReviewContents[] reviewContentsArr = new ReviewContents[i];
            int i6 = i3 + 83;
            onExtraCallback = i6 % 128;
            if (i6 % 2 == 0) {
                return reviewContentsArr;
            }
            throw null;
        }
    }

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 73;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent();
        }
        onNavigationEvent();
        throw null;
    }

    private static final /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(ReviewContents$SubjectiveContent$$serializer.INSTANCE);
        int i2 = IAuthTabCallback + 49;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return checkcanopenlandingpage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 77;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 111;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 55 / 0;
        }
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReviewContents)) {
            return false;
        }
        ReviewContents reviewContents = (ReviewContents) obj;
        if (!Intrinsics.areEqual(this.evaluationContent, reviewContents.evaluationContent)) {
            int i2 = IAuthTabCallback + 65;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.subjectiveContents, reviewContents.subjectiveContents)) {
            return true;
        }
        int i4 = onNavigationEvent + 83;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.evaluationContent.hashCode();
        List<SubjectiveContent> list = this.subjectiveContents;
        if (list == null) {
            int i2 = IAuthTabCallback + 1;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = list.hashCode();
        }
        int i4 = (iHashCode2 * 31) + iHashCode;
        int i5 = onNavigationEvent + 37;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 0 / 0;
        }
        return i4;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ReviewContents(evaluationContent=" + this.evaluationContent + ", subjectiveContents=" + this.subjectiveContents + ")";
        int i2 = IAuthTabCallback + 125;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        this.evaluationContent.writeToParcel(parcel, i);
        List<SubjectiveContent> list = this.subjectiveContents;
        if (list == null) {
            int i3 = onNavigationEvent + 59;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                parcel.writeInt(1);
                return;
            } else {
                parcel.writeInt(0);
                return;
            }
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<SubjectiveContent> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
            int i4 = IAuthTabCallback + 85;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ReviewContents> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 31;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            ReviewContents$.serializer serializerVar = ReviewContents$.serializer.INSTANCE;
            if (i3 != 0) {
                return serializerVar;
            }
            throw null;
        }
    }

    static {
        int i = onExtraCallbackWithResult + 37;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ ReviewContents(int i, EvaluationContent evaluationContent, List list, okycx okycxVar) {
        if (1 != (i & 1)) {
            int i2 = onNavigationEvent + 7;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 1, ReviewContents$.serializer.INSTANCE.getDescriptor());
        }
        this.evaluationContent = evaluationContent;
        Object obj = null;
        if ((i & 2) == 0) {
            this.subjectiveContents = CollectionsKt.emptyList();
            int i4 = onNavigationEvent + 115;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        this.subjectiveContents = list;
        int i5 = onNavigationEvent + 99;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public ReviewContents(@NotNull EvaluationContent evaluationContent, @Nullable List<SubjectiveContent> list) {
        Intrinsics.checkNotNullParameter(evaluationContent, "");
        this.evaluationContent = evaluationContent;
        this.subjectiveContents = list;
    }

    public static final /* synthetic */ Lazy[] onExtraCallback() {
        Lazy<KSerializer<Object>>[] lazyArr;
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 5;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            lazyArr = $childSerializers;
            int i4 = 61 / 0;
        } else {
            lazyArr = $childSerializers;
        }
        int i5 = i2 + 7;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return lazyArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003b A[PHI: r1
      0x003b: PHI (r1v6 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
      (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v10 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
     binds: [B:8:0x002d, B:10:0x0039, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f A[PHI: r1
      0x002f: PHI (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
      (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v10 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
     binds: [B:8:0x002d, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onWarmupCompleted(viva.republica.toss.network.model.loan.ReviewContents r6, o.vyl r7, kotlinx.serialization.descriptors.SerialDescriptor r8) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.loan.ReviewContents.IAuthTabCallback
            int r1 = r1 + 119
            int r2 = r1 % 128
            viva.republica.toss.network.model.loan.ReviewContents.onNavigationEvent = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L20
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.loan.ReviewContents.$childSerializers
            viva.republica.toss.network.model.loan.ReviewContents$EvaluationContent$$serializer r4 = viva.republica.toss.network.model.loan.ReviewContents$EvaluationContent$.serializer.INSTANCE
            viva.republica.toss.network.model.loan.ReviewContents$EvaluationContent r5 = r6.evaluationContent
            r7.onNavigationEvent(r8, r3, r4, r5)
            boolean r4 = r7.onWarmupCompleted(r8, r2)
            if (r4 != 0) goto L3b
            goto L2f
        L20:
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.loan.ReviewContents.$childSerializers
            viva.republica.toss.network.model.loan.ReviewContents$EvaluationContent$$serializer r4 = viva.republica.toss.network.model.loan.ReviewContents$EvaluationContent$.serializer.INSTANCE
            viva.republica.toss.network.model.loan.ReviewContents$EvaluationContent r5 = r6.evaluationContent
            r7.onNavigationEvent(r8, r2, r4, r5)
            boolean r4 = r7.onWarmupCompleted(r8, r3)
            if (r4 != 0) goto L3b
        L2f:
            java.util.List<viva.republica.toss.network.model.loan.ReviewContents$SubjectiveContent> r4 = r6.subjectiveContents
            java.util.List r5 = kotlin.collections.CollectionsKt.emptyList()
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r5)
            if (r4 != 0) goto L48
        L3b:
            r1 = r1[r3]
            java.lang.Object r1 = r1.getValue()
            o.py r1 = (o.py) r1
            java.util.List<viva.republica.toss.network.model.loan.ReviewContents$SubjectiveContent> r6 = r6.subjectiveContents
            r7.onExtraCallbackWithResult(r8, r3, r1, r6)
        L48:
            int r6 = viva.republica.toss.network.model.loan.ReviewContents.IAuthTabCallback
            int r6 = r6 + 97
            int r7 = r6 % 128
            viva.republica.toss.network.model.loan.ReviewContents.onNavigationEvent = r7
            int r6 = r6 % r0
            if (r6 != 0) goto L54
            int r0 = r0 / r2
        L54:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.ReviewContents.onWarmupCompleted(viva.republica.toss.network.model.loan.ReviewContents, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public final EvaluationContent onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 63;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.evaluationContent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @liq
    public static final class EvaluationContent implements Parcelable {
        private static final Lazy<KSerializer<Object>>[] $childSerializers;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted = 1;
        private final List<Item> evaluationItems;
        private final String helpText;
        private final List<Item> items;
        private final Map<String, String> logParams;
        private final String noticeText;
        private final String title;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<EvaluationContent> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<EvaluationContent> {
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final EvaluationContent IAuthTabCallback(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int i2 = parcel.readInt();
                    linkedHashMap = new LinkedHashMap(i2);
                    int i3 = 0;
                    while (i3 != i2) {
                        int i4 = onExtraCallback + 75;
                        onExtraCallbackWithResult = i4 % 128;
                        if (i4 % 2 != 0) {
                            linkedHashMap.put(parcel.readString(), parcel.readString());
                            i3 += 5;
                        } else {
                            linkedHashMap.put(parcel.readString(), parcel.readString());
                            i3++;
                        }
                    }
                }
                int i5 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    arrayList.add(Item.CREATOR.createFromParcel(parcel));
                }
                int i7 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i7);
                for (int i8 = 0; i8 != i7; i8++) {
                    int i9 = onExtraCallbackWithResult + 95;
                    onExtraCallback = i9 % 128;
                    int i10 = i9 % 2;
                    arrayList2.add(Item.CREATOR.createFromParcel(parcel));
                }
                return new EvaluationContent(string, string2, string3, linkedHashMap, arrayList, arrayList2);
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ EvaluationContent createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 9;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                EvaluationContent evaluationContentIAuthTabCallback = IAuthTabCallback(parcel);
                int i4 = onExtraCallback + 99;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 28 / 0;
                }
                return evaluationContentIAuthTabCallback;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ EvaluationContent[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 37;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                EvaluationContent[] evaluationContentArrOnNavigationEvent = onNavigationEvent(i);
                int i5 = onExtraCallbackWithResult + 107;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return evaluationContentArrOnNavigationEvent;
            }

            public final EvaluationContent[] onNavigationEvent(int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 33;
                onExtraCallbackWithResult = i3 % 128;
                EvaluationContent[] evaluationContentArr = new EvaluationContent[i];
                if (i3 % 2 == 0) {
                    return evaluationContentArr;
                }
                throw null;
            }
        }

        public EvaluationContent() {
            this((String) null, (String) null, (String) null, (Map) null, (List) null, (List) null, 63, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
            int i7 = ~i6;
            int i8 = ~i2;
            int i9 = ~(i7 | i8);
            int i10 = (~(i7 | i)) | i9 | (~(i8 | i));
            int i11 = ~i;
            int i12 = (~(i8 | i11)) | i9;
            int i13 = (~(i11 | i7)) | i2;
            int i14 = i6 + i2 + i4 + ((-700610695) * i5) + ((-1151578525) * i3);
            int i15 = i14 * i14;
            int i16 = (1165304685 * i6) + 1030029312 + ((-1366800679) * i2) + (i10 * (-1762861932)) + (i12 * (-1762861932)) + ((-1762861932) * i13) + ((-597557248) * i4) + ((-665714688) * i5) + (367394816 * i3) + (374145024 * i15);
            int i17 = ((i6 * 323709325) - 650539883) + (i2 * 323709049) + (i10 * 276) + (i12 * 276) + (i13 * 276) + (i4 * 323709601) + (i5 * (-499299047)) + (i3 * 1568885315) + (i15 * (-395509760));
            int i18 = i16 + (i17 * i17 * (-772603904));
            if (i18 == 1) {
                return onWarmupCompleted(objArr);
            }
            if (i18 != 2) {
                return IAuthTabCallback(objArr);
            }
            EvaluationContent evaluationContent = (EvaluationContent) objArr[0];
            int i19 = 2 % 2;
            int i20 = onWarmupCompleted + 97;
            int i21 = i20 % 128;
            onExtraCallback = i21;
            int i22 = i20 % 2;
            String str = evaluationContent.helpText;
            int i23 = i21 + 101;
            onWarmupCompleted = i23 % 128;
            int i24 = i23 % 2;
            return str;
        }

        private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
            int i = 2 % 2;
            checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(ReviewContents$EvaluationContent$Item$$serializer.INSTANCE);
            int i2 = onWarmupCompleted + 43;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return checkcanopenlandingpage;
            }
            throw null;
        }

        public static /* synthetic */ KSerializer IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 117;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback3 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
            KSerializer kSerializer = (KSerializer) IAuthTabCallback(iIAuthTabCallback, 1110952500, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback3, new Object[0], -1110952500);
            int i4 = onExtraCallback + 123;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return kSerializer;
        }

        private static final /* synthetic */ KSerializer IAuthTabCallbackDefault() {
            int i = 2 % 2;
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            getMutilBackgroundDrawable getmutilbackgrounddrawable = new getMutilBackgroundDrawable(getwrigglelayout, getwrigglelayout);
            int i2 = onExtraCallback + 21;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 80 / 0;
            }
            return getmutilbackgrounddrawable;
        }

        private static final /* synthetic */ KSerializer IAuthTabCallbackStubProxy() {
            int i = 2 % 2;
            checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(ReviewContents$EvaluationContent$Item$$serializer.INSTANCE);
            int i2 = onWarmupCompleted + 101;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return checkcanopenlandingpage;
        }

        public static /* synthetic */ KSerializer onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 69;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerIAuthTabCallbackDefault = IAuthTabCallbackDefault();
            int i4 = onWarmupCompleted + 63;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return kSerializerIAuthTabCallbackDefault;
            }
            throw null;
        }

        public static /* synthetic */ KSerializer onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 53;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy();
            int i4 = onExtraCallback + 101;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 41 / 0;
            }
            return kSerializerIAuthTabCallbackStubProxy;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 105;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 89;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onExtraCallback + 119;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof EvaluationContent)) {
                int i4 = onWarmupCompleted;
                int i5 = i4 + 77;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                int i7 = i4 + 113;
                onExtraCallback = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 10 / 0;
                }
                return false;
            }
            EvaluationContent evaluationContent = (EvaluationContent) obj;
            if (!Intrinsics.areEqual(this.title, evaluationContent.title) || !Intrinsics.areEqual(this.helpText, evaluationContent.helpText) || (!Intrinsics.areEqual(this.noticeText, evaluationContent.noticeText)) || !Intrinsics.areEqual(this.logParams, evaluationContent.logParams)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.items, evaluationContent.items)) {
                int i9 = onWarmupCompleted + 87;
                onExtraCallback = i9 % 128;
                int i10 = i9 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.evaluationItems, evaluationContent.evaluationItems)) {
                return true;
            }
            int i11 = onExtraCallback + 37;
            onWarmupCompleted = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0028 A[PHI: r1 r3 r4
          0x0028: PHI (r1v18 int) = (r1v5 int), (r1v20 int) binds: [B:8:0x0024, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
          0x0028: PHI (r3v3 java.lang.String) = (r3v0 java.lang.String), (r3v5 java.lang.String) binds: [B:8:0x0024, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
          0x0028: PHI (r4v8 int) = (r4v0 int), (r4v9 int) binds: [B:8:0x0024, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0026 A[PHI: r1 r4
          0x0026: PHI (r1v6 int) = (r1v5 int), (r1v20 int) binds: [B:8:0x0024, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
          0x0026: PHI (r4v1 int) = (r4v0 int), (r4v9 int) binds: [B:8:0x0024, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int hashCode() {
            /*
                r7 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = viva.republica.toss.network.model.loan.ReviewContents.EvaluationContent.onExtraCallback
                int r1 = r1 + 105
                int r2 = r1 % 128
                viva.republica.toss.network.model.loan.ReviewContents.EvaluationContent.onWarmupCompleted = r2
                int r1 = r1 % r0
                r2 = 0
                if (r1 != 0) goto L1b
                java.lang.String r1 = r7.title
                int r1 = r1.hashCode()
                java.lang.String r3 = r7.helpText
                r4 = 1
                if (r3 != 0) goto L28
                goto L26
            L1b:
                java.lang.String r1 = r7.title
                int r1 = r1.hashCode()
                java.lang.String r3 = r7.helpText
                r4 = r2
                if (r3 != 0) goto L28
            L26:
                r3 = r2
                goto L2c
            L28:
                int r3 = r3.hashCode()
            L2c:
                java.lang.String r5 = r7.noticeText
                if (r5 != 0) goto L31
                goto L35
            L31:
                int r2 = r5.hashCode()
            L35:
                java.util.Map<java.lang.String, java.lang.String> r5 = r7.logParams
                if (r5 == 0) goto L46
                int r4 = viva.republica.toss.network.model.loan.ReviewContents.EvaluationContent.onWarmupCompleted
                int r4 = r4 + 123
                int r6 = r4 % 128
                viva.republica.toss.network.model.loan.ReviewContents.EvaluationContent.onExtraCallback = r6
                int r4 = r4 % r0
                int r4 = r5.hashCode()
            L46:
                int r1 = r1 * 31
                int r1 = r1 + r3
                int r1 = r1 * 31
                int r1 = r1 + r2
                int r1 = r1 * 31
                int r1 = r1 + r4
                int r1 = r1 * 31
                java.util.List<viva.republica.toss.network.model.loan.ReviewContents$EvaluationContent$Item> r0 = r7.items
                int r0 = r0.hashCode()
                int r1 = r1 + r0
                int r1 = r1 * 31
                java.util.List<viva.republica.toss.network.model.loan.ReviewContents$EvaluationContent$Item> r0 = r7.evaluationItems
                int r0 = r0.hashCode()
                int r1 = r1 + r0
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.ReviewContents.EvaluationContent.hashCode():int");
        }

        public String toString() {
            int i = 2 % 2;
            String str = "EvaluationContent(title=" + this.title + ", helpText=" + this.helpText + ", noticeText=" + this.noticeText + ", logParams=" + this.logParams + ", items=" + this.items + ", evaluationItems=" + this.evaluationItems + ")";
            int i2 = onExtraCallback + 11;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 123;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.title);
            parcel.writeString(this.helpText);
            parcel.writeString(this.noticeText);
            Map<String, String> map = this.logParams;
            if (map == null) {
                int i5 = onWarmupCompleted + 123;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(map.size());
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    int i7 = onWarmupCompleted + 63;
                    onExtraCallback = i7 % 128;
                    int i8 = i7 % 2;
                    parcel.writeString(entry.getKey());
                    parcel.writeString(entry.getValue());
                }
            }
            List<Item> list = this.items;
            parcel.writeInt(list.size());
            Iterator<Item> it = list.iterator();
            while (it.hasNext()) {
                int i9 = onWarmupCompleted + 89;
                onExtraCallback = i9 % 128;
                int i10 = i9 % 2;
                it.next().writeToParcel(parcel, i);
            }
            List<Item> list2 = this.evaluationItems;
            parcel.writeInt(list2.size());
            Iterator<Item> it2 = list2.iterator();
            while (!(!it2.hasNext())) {
                int i11 = onExtraCallback + 19;
                onWarmupCompleted = i11 % 128;
                if (i11 % 2 == 0) {
                    it2.next().writeToParcel(parcel, i);
                    int i12 = 44 / 0;
                } else {
                    it2.next().writeToParcel(parcel, i);
                }
            }
        }

        public static final class Companion {
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<EvaluationContent> serializer() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 29;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    ReviewContents$EvaluationContent$.serializer serializerVar = ReviewContents$EvaluationContent$.serializer.INSTANCE;
                    throw null;
                }
                ReviewContents$EvaluationContent$.serializer serializerVar2 = ReviewContents$EvaluationContent$.serializer.INSTANCE;
                int i3 = onExtraCallbackWithResult + 23;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                return serializerVar2;
            }
        }

        static {
            TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
            $childSerializers = new Lazy[]{null, null, null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.loan.ReviewContents$EvaluationContent$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 1;
                private static int onNavigationEvent;

                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback + 99;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    KSerializer kSerializerOnNavigationEvent = ReviewContents.EvaluationContent.onNavigationEvent();
                    int i4 = onNavigationEvent + 41;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return kSerializerOnNavigationEvent;
                }
            }), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.loan.ReviewContents$EvaluationContent$$ExternalSyntheticLambda1
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback + 51;
                    onExtraCallbackWithResult = i2 % 128;
                    if (i2 % 2 != 0) {
                        return ReviewContents.EvaluationContent.onWarmupCompleted();
                    }
                    ReviewContents.EvaluationContent.onWarmupCompleted();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.loan.ReviewContents$EvaluationContent$$ExternalSyntheticLambda2
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 61;
                    IAuthTabCallback = i2 % 128;
                    if (i2 % 2 == 0) {
                        return ReviewContents.EvaluationContent.IAuthTabCallback();
                    }
                    ReviewContents.EvaluationContent.IAuthTabCallback();
                    throw null;
                }
            })};
            int i = IAuthTabCallback + 3;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }

        public /* synthetic */ EvaluationContent(int i, String str, String str2, String str3, Map map, List list, List list2, okycx okycxVar) {
            if ((i & 1) == 0) {
                str = "";
                int i2 = 2 % 2;
            }
            this.title = str;
            if ((i & 2) == 0) {
                int i3 = onWarmupCompleted + 47;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                this.helpText = null;
            } else {
                this.helpText = str2;
                int i5 = 2 % 2;
            }
            if ((i & 4) == 0) {
                this.noticeText = null;
            } else {
                this.noticeText = str3;
            }
            if ((i & 8) == 0) {
                this.logParams = null;
            } else {
                this.logParams = map;
                int i6 = 2 % 2;
            }
            if ((i & 16) == 0) {
                this.items = CollectionsKt.emptyList();
            } else {
                this.items = list;
            }
            if ((i & 32) != 0) {
                this.evaluationItems = list2;
                return;
            }
            this.evaluationItems = CollectionsKt.emptyList();
            int i7 = onExtraCallback + 45;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
        }

        public EvaluationContent(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Map<String, String> map, @NotNull List<Item> list, @NotNull List<Item> list2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            this.title = str;
            this.helpText = str2;
            this.noticeText = str3;
            this.logParams = map;
            this.items = list;
            this.evaluationItems = list2;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x002a A[PHI: r1
          0x002a: PHI (r1v10 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
          (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
          (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
          (r1v11 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
         binds: [B:8:0x001e, B:10:0x0028, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0020 A[PHI: r1
          0x0020: PHI (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
          (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
          (r1v11 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
         binds: [B:8:0x001e, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final /* synthetic */ void IAuthTabCallback(viva.republica.toss.network.model.loan.ReviewContents.EvaluationContent r5, o.vyl r6, kotlinx.serialization.descriptors.SerialDescriptor r7) {
            /*
                r0 = 2
                int r1 = r0 % r0
                int r1 = viva.republica.toss.network.model.loan.ReviewContents.EvaluationContent.onExtraCallback
                int r1 = r1 + 35
                int r2 = r1 % 128
                viva.republica.toss.network.model.loan.ReviewContents.EvaluationContent.onWarmupCompleted = r2
                int r1 = r1 % r0
                r2 = 0
                if (r1 != 0) goto L18
                kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.loan.ReviewContents.EvaluationContent.$childSerializers
                boolean r3 = r6.onWarmupCompleted(r7, r2)
                if (r3 != 0) goto L2a
                goto L20
            L18:
                kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.loan.ReviewContents.EvaluationContent.$childSerializers
                boolean r3 = r6.onWarmupCompleted(r7, r2)
                if (r3 != 0) goto L2a
            L20:
                java.lang.String r3 = r5.title
                java.lang.String r4 = ""
                boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
                if (r3 != 0) goto L38
            L2a:
                java.lang.String r3 = r5.title
                r6.onExtraCallback(r7, r2, r3)
                int r2 = viva.republica.toss.network.model.loan.ReviewContents.EvaluationContent.onExtraCallback
                int r2 = r2 + 31
                int r3 = r2 % 128
                viva.republica.toss.network.model.loan.ReviewContents.EvaluationContent.onWarmupCompleted = r3
                int r2 = r2 % r0
            L38:
                r2 = 1
                boolean r3 = r6.onWarmupCompleted(r7, r2)
                if (r3 != 0) goto L56
                int r3 = viva.republica.toss.network.model.loan.ReviewContents.EvaluationContent.onExtraCallback
                int r3 = r3 + 89
                int r4 = r3 % 128
                viva.republica.toss.network.model.loan.ReviewContents.EvaluationContent.onWarmupCompleted = r4
                int r3 = r3 % r0
                if (r3 == 0) goto L4f
                java.lang.String r3 = r5.helpText
                if (r3 == 0) goto L5d
                goto L56
            L4f:
                java.lang.String r5 = r5.helpText
                r5 = 0
                r5.hashCode()
                throw r5
            L56:
                o.getWriggleLayout r3 = o.getWriggleLayout.onNavigationEvent
                java.lang.String r4 = r5.helpText
                r6.onExtraCallbackWithResult(r7, r2, r3, r4)
            L5d:
                boolean r2 = r6.onWarmupCompleted(r7, r0)
                if (r2 != 0) goto L67
                java.lang.String r2 = r5.noticeText
                if (r2 == 0) goto L6e
            L67:
                o.getWriggleLayout r2 = o.getWriggleLayout.onNavigationEvent
                java.lang.String r3 = r5.noticeText
                r6.onExtraCallbackWithResult(r7, r0, r2, r3)
            L6e:
                r0 = 3
                boolean r2 = r6.onWarmupCompleted(r7, r0)
                if (r2 != 0) goto L79
                java.util.Map<java.lang.String, java.lang.String> r2 = r5.logParams
                if (r2 == 0) goto L86
            L79:
                r2 = r1[r0]
                java.lang.Object r2 = r2.getValue()
                o.py r2 = (o.py) r2
                java.util.Map<java.lang.String, java.lang.String> r3 = r5.logParams
                r6.onExtraCallbackWithResult(r7, r0, r2, r3)
            L86:
                r0 = 4
                boolean r2 = r6.onWarmupCompleted(r7, r0)
                if (r2 != 0) goto L99
                java.util.List<viva.republica.toss.network.model.loan.ReviewContents$EvaluationContent$Item> r2 = r5.items
                java.util.List r3 = kotlin.collections.CollectionsKt.emptyList()
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
                if (r2 != 0) goto La6
            L99:
                r2 = r1[r0]
                java.lang.Object r2 = r2.getValue()
                o.py r2 = (o.py) r2
                java.util.List<viva.republica.toss.network.model.loan.ReviewContents$EvaluationContent$Item> r3 = r5.items
                r6.onNavigationEvent(r7, r0, r2, r3)
            La6:
                r0 = 5
                boolean r2 = r6.onWarmupCompleted(r7, r0)
                if (r2 != 0) goto Lba
                java.util.List<viva.republica.toss.network.model.loan.ReviewContents$EvaluationContent$Item> r2 = r5.evaluationItems
                java.util.List r3 = kotlin.collections.CollectionsKt.emptyList()
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
                if (r2 == 0) goto Lba
                goto Lc7
            Lba:
                r1 = r1[r0]
                java.lang.Object r1 = r1.getValue()
                o.py r1 = (o.py) r1
                java.util.List<viva.republica.toss.network.model.loan.ReviewContents$EvaluationContent$Item> r5 = r5.evaluationItems
                r6.onNavigationEvent(r7, r0, r1, r5)
            Lc7:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.ReviewContents.EvaluationContent.IAuthTabCallback(viva.republica.toss.network.model.loan.ReviewContents$EvaluationContent, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        public static final /* synthetic */ Lazy[] onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 121;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return $childSerializers;
            }
            throw null;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ EvaluationContent(String str, String str2, String str3, Map map, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            String str4;
            Map map2;
            if ((i & 1) != 0) {
                int i2 = onWarmupCompleted + 79;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 86 / 0;
                }
                int i4 = 2 % 2;
                str = "";
            }
            if ((i & 2) != 0) {
                int i5 = onExtraCallback + 43;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                str4 = null;
            } else {
                str4 = str2;
            }
            String str5 = (i & 4) != 0 ? null : str3;
            if ((i & 8) != 0) {
                int i7 = onWarmupCompleted + 43;
                onExtraCallback = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 2 % 2;
                }
                map2 = null;
            } else {
                map2 = map;
            }
            if ((i & 16) != 0) {
                list = CollectionsKt.emptyList();
                int i9 = 2 % 2;
            }
            List list3 = list;
            if ((i & 32) != 0) {
                int i10 = onExtraCallback + 79;
                onWarmupCompleted = i10 % 128;
                if (i10 % 2 == 0) {
                    CollectionsKt.emptyList();
                    throw null;
                }
                list2 = CollectionsKt.emptyList();
            }
            this(str, str4, str5, map2, list3, list2);
        }

        public final String IAuthTabCallbackStub() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 1;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            String str = this.title;
            int i4 = i3 + 61;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        public final String asInterface() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 113;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            String str = this.noticeText;
            int i5 = i3 + 101;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
            EvaluationContent evaluationContent = (EvaluationContent) objArr[0];
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 21;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Map<String, String> map = evaluationContent.logParams;
            if (i3 == 0) {
                return map;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final List<Item> onTransact() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 31;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            List<Item> list = this.items;
            int i5 = i3 + 45;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return list;
            }
            throw null;
        }

        @liq
        public static final class Item implements Parcelable {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;
            private final LoanProductBadge badge;
            private final String iconUrl;
            private final String mainText;
            private final Float rate;
            public static final Companion Companion = new Companion(null);
            public static final Parcelable.Creator<Item> CREATOR = new Creator();

            public static final class Creator implements Parcelable.Creator<Item> {
                private static int IAuthTabCallback = 0;
                private static int onExtraCallback = 1;

                public final Item IAuthTabCallback(Parcel parcel) {
                    LoanProductBadge loanProductBadgeCreateFromParcel;
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback + 11;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    Intrinsics.checkNotNullParameter(parcel, "");
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    if (parcel.readInt() == 0) {
                        int i4 = onExtraCallback + 101;
                        IAuthTabCallback = i4 % 128;
                        int i5 = i4 % 2;
                        loanProductBadgeCreateFromParcel = null;
                    } else {
                        loanProductBadgeCreateFromParcel = LoanProductBadge.CREATOR.createFromParcel(parcel);
                    }
                    return new Item(string, string2, loanProductBadgeCreateFromParcel, parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null);
                }

                @Override // android.os.Parcelable.Creator
                public /* synthetic */ Item createFromParcel(Parcel parcel) {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 85;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    Item itemIAuthTabCallback = IAuthTabCallback(parcel);
                    int i4 = onExtraCallback + 123;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return itemIAuthTabCallback;
                }

                @Override // android.os.Parcelable.Creator
                public /* synthetic */ Item[] newArray(int i) {
                    int i2 = 2 % 2;
                    int i3 = onExtraCallback + 111;
                    IAuthTabCallback = i3 % 128;
                    if (i3 % 2 == 0) {
                        return onExtraCallbackWithResult(i);
                    }
                    onExtraCallbackWithResult(i);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                public final Item[] onExtraCallbackWithResult(int i) {
                    int i2 = 2 % 2;
                    int i3 = onExtraCallback + 125;
                    int i4 = i3 % 128;
                    IAuthTabCallback = i4;
                    int i5 = i3 % 2;
                    Item[] itemArr = new Item[i];
                    int i6 = i4 + 77;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                    return itemArr;
                }
            }

            static {
                int i = onNavigationEvent + 27;
                IAuthTabCallback = i % 128;
                int i2 = i % 2;
            }

            public Item() {
                this((String) null, (String) null, (LoanProductBadge) null, (Float) null, 15, (DefaultConstructorMarker) null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted;
                int i3 = i2 + 117;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 65;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    return 0;
                }
                throw null;
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 125;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Item)) {
                    return false;
                }
                Item item = (Item) obj;
                if (!Intrinsics.areEqual(this.iconUrl, item.iconUrl)) {
                    int i4 = onWarmupCompleted + 17;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    return false;
                }
                if (!Intrinsics.areEqual(this.mainText, item.mainText)) {
                    int i6 = onWarmupCompleted + 79;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                    return false;
                }
                if (!Intrinsics.areEqual(this.badge, item.badge)) {
                    return false;
                }
                if (Intrinsics.areEqual(this.rate, item.rate)) {
                    return true;
                }
                int i8 = onExtraCallbackWithResult + 41;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
                return false;
            }

            public int hashCode() {
                int iHashCode;
                int i = 2 % 2;
                int iHashCode2 = this.iconUrl.hashCode();
                int iHashCode3 = this.mainText.hashCode();
                LoanProductBadge loanProductBadge = this.badge;
                int iHashCode4 = 0;
                if (loanProductBadge == null) {
                    iHashCode = 0;
                } else {
                    iHashCode = loanProductBadge.hashCode();
                    int i2 = onWarmupCompleted + 51;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                }
                Float f = this.rate;
                if (f != null) {
                    int i4 = onExtraCallbackWithResult + 49;
                    onWarmupCompleted = i4 % 128;
                    if (i4 % 2 != 0) {
                        int iHashCode5 = f.hashCode();
                        int i5 = 61 / 0;
                        iHashCode4 = iHashCode5;
                    } else {
                        iHashCode4 = f.hashCode();
                    }
                }
                return (((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode) * 31) + iHashCode4;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "Item(iconUrl=" + this.iconUrl + ", mainText=" + this.mainText + ", badge=" + this.badge + ", rate=" + this.rate + ")";
                int i2 = onExtraCallbackWithResult + 47;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 19;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.writeString(this.iconUrl);
                    parcel.writeString(this.mainText);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeString(this.iconUrl);
                parcel.writeString(this.mainText);
                LoanProductBadge loanProductBadge = this.badge;
                if (loanProductBadge == null) {
                    parcel.writeInt(0);
                    int i4 = onWarmupCompleted + 57;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                } else {
                    parcel.writeInt(1);
                    loanProductBadge.writeToParcel(parcel, i);
                }
                Float f = this.rate;
                if (f != null) {
                    parcel.writeInt(1);
                    parcel.writeFloat(f.floatValue());
                    return;
                }
                int i6 = onWarmupCompleted + 85;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 == 0) {
                    parcel.writeInt(1);
                } else {
                    parcel.writeInt(0);
                }
            }

            public static final class Companion {
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Item> serializer() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 41;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    ReviewContents$EvaluationContent$Item$$serializer reviewContents$EvaluationContent$Item$$serializer = ReviewContents$EvaluationContent$Item$$serializer.INSTANCE;
                    if (i3 == 0) {
                        return reviewContents$EvaluationContent$Item$$serializer;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public /* synthetic */ Item(int r2, java.lang.String r3, java.lang.String r4, viva.republica.toss.network.model.loan.LoanProductBadge r5, java.lang.Float r6, o.okycx r7) {
                /*
                    r1 = this;
                    r1.<init>()
                    r7 = r2 & 1
                    java.lang.String r0 = ""
                    if (r7 != 0) goto Lc
                    r1.iconUrl = r0
                    goto Le
                Lc:
                    r1.iconUrl = r3
                Le:
                    r3 = r2 & 2
                    r7 = 2
                    if (r3 != 0) goto L1f
                    int r3 = viva.republica.toss.network.model.loan.ReviewContents.EvaluationContent.Item.onExtraCallbackWithResult
                    int r3 = r3 + 117
                    int r4 = r3 % 128
                    viva.republica.toss.network.model.loan.ReviewContents.EvaluationContent.Item.onWarmupCompleted = r4
                    int r3 = r3 % r7
                    r1.mainText = r0
                    goto L23
                L1f:
                    r1.mainText = r4
                    int r3 = r7 % r7
                L23:
                    r3 = r2 & 4
                    r4 = 0
                    if (r3 != 0) goto L2c
                    r1.badge = r4
                L2a:
                    int r7 = r7 % r7
                    goto L3c
                L2c:
                    r1.badge = r5
                    int r3 = viva.republica.toss.network.model.loan.ReviewContents.EvaluationContent.Item.onExtraCallbackWithResult
                    int r3 = r3 + 91
                    int r5 = r3 % 128
                    viva.republica.toss.network.model.loan.ReviewContents.EvaluationContent.Item.onWarmupCompleted = r5
                    int r3 = r3 % r7
                    if (r3 == 0) goto L2a
                    r3 = 4
                    int r3 = r3 / 5
                L3c:
                    r2 = r2 & 8
                    if (r2 != 0) goto L43
                    r1.rate = r4
                    return
                L43:
                    r1.rate = r6
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.ReviewContents.EvaluationContent.Item.<init>(int, java.lang.String, java.lang.String, viva.republica.toss.network.model.loan.LoanProductBadge, java.lang.Float, o.okycx):void");
            }

            public Item(@NotNull String str, @NotNull String str2, @Nullable LoanProductBadge loanProductBadge, @Nullable Float f) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                this.iconUrl = str;
                this.mainText = str2;
                this.badge = loanProductBadge;
                this.rate = f;
            }

            /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
            @kotlin.jvm.JvmStatic
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public static final /* synthetic */ void IAuthTabCallback(viva.republica.toss.network.model.loan.ReviewContents.EvaluationContent.Item r5, o.vyl r6, kotlinx.serialization.descriptors.SerialDescriptor r7) {
                /*
                    r0 = 2
                    int r1 = r0 % r0
                    r1 = 0
                    boolean r2 = r6.onWarmupCompleted(r7, r1)
                    java.lang.String r3 = ""
                    if (r2 != 0) goto L14
                    java.lang.String r2 = r5.iconUrl
                    boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
                    if (r2 != 0) goto L22
                L14:
                    java.lang.String r2 = r5.iconUrl
                    r6.onExtraCallback(r7, r1, r2)
                    int r2 = viva.republica.toss.network.model.loan.ReviewContents.EvaluationContent.Item.onWarmupCompleted
                    int r2 = r2 + 71
                    int r4 = r2 % 128
                    viva.republica.toss.network.model.loan.ReviewContents.EvaluationContent.Item.onExtraCallbackWithResult = r4
                    int r2 = r2 % r0
                L22:
                    r2 = 1
                    boolean r4 = r6.onWarmupCompleted(r7, r2)
                    r4 = r4 ^ r2
                    if (r4 == 0) goto L32
                    java.lang.String r4 = r5.mainText
                    boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r3)
                    if (r3 != 0) goto L37
                L32:
                    java.lang.String r3 = r5.mainText
                    r6.onExtraCallback(r7, r2, r3)
                L37:
                    boolean r2 = r6.onWarmupCompleted(r7, r0)
                    if (r2 != 0) goto L54
                    int r2 = viva.republica.toss.network.model.loan.ReviewContents.EvaluationContent.Item.onWarmupCompleted
                    int r2 = r2 + 43
                    int r3 = r2 % 128
                    viva.republica.toss.network.model.loan.ReviewContents.EvaluationContent.Item.onExtraCallbackWithResult = r3
                    int r2 = r2 % r0
                    if (r2 != 0) goto L50
                    viva.republica.toss.network.model.loan.LoanProductBadge r2 = r5.badge
                    r3 = 37
                    int r3 = r3 / r1
                    if (r2 == 0) goto L64
                    goto L54
                L50:
                    viva.republica.toss.network.model.loan.LoanProductBadge r1 = r5.badge
                    if (r1 == 0) goto L64
                L54:
                    viva.republica.toss.network.model.loan.LoanProductBadge$$serializer r1 = viva.republica.toss.network.model.loan.LoanProductBadge$$serializer.INSTANCE
                    viva.republica.toss.network.model.loan.LoanProductBadge r2 = r5.badge
                    r6.onExtraCallbackWithResult(r7, r0, r1, r2)
                    int r1 = viva.republica.toss.network.model.loan.ReviewContents.EvaluationContent.Item.onWarmupCompleted
                    int r1 = r1 + 7
                    int r2 = r1 % 128
                    viva.republica.toss.network.model.loan.ReviewContents.EvaluationContent.Item.onExtraCallbackWithResult = r2
                    int r1 = r1 % r0
                L64:
                    r1 = 3
                    boolean r2 = r6.onWarmupCompleted(r7, r1)
                    if (r2 != 0) goto L78
                    int r2 = viva.republica.toss.network.model.loan.ReviewContents.EvaluationContent.Item.onWarmupCompleted
                    int r2 = r2 + 35
                    int r3 = r2 % 128
                    viva.republica.toss.network.model.loan.ReviewContents.EvaluationContent.Item.onExtraCallbackWithResult = r3
                    int r2 = r2 % r0
                    java.lang.Float r0 = r5.rate
                    if (r0 == 0) goto L7f
                L78:
                    o.dj3 r0 = o.dj3.onWarmupCompleted
                    java.lang.Float r5 = r5.rate
                    r6.onExtraCallbackWithResult(r7, r1, r0, r5)
                L7f:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.ReviewContents.EvaluationContent.Item.IAuthTabCallback(viva.republica.toss.network.model.loan.ReviewContents$EvaluationContent$Item, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ Item(String str, String str2, LoanProductBadge loanProductBadge, Float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
                if ((i & 1) != 0) {
                    int i2 = onWarmupCompleted + 107;
                    onExtraCallbackWithResult = i2 % 128;
                    if (i2 % 2 == 0) {
                        int i3 = 98 / 0;
                    }
                    str = "";
                }
                if ((i & 2) != 0) {
                    int i4 = onExtraCallbackWithResult + 33;
                    onWarmupCompleted = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 2 % 2;
                    }
                    str2 = "";
                }
                if ((i & 4) != 0) {
                    int i6 = onExtraCallbackWithResult + 119;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                    loanProductBadge = null;
                }
                if ((i & 8) != 0) {
                    int i8 = 2 % 2;
                    f = null;
                }
                this(str, str2, loanProductBadge, f);
            }

            public final String onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 75;
                int i3 = i2 % 128;
                onWarmupCompleted = i3;
                int i4 = i2 % 2;
                String str = this.mainText;
                int i5 = i3 + 109;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }

            public final LoanProductBadge onExtraCallback() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 77;
                int i3 = i2 % 128;
                onWarmupCompleted = i3;
                int i4 = i2 % 2;
                LoanProductBadge loanProductBadge = this.badge;
                int i5 = i3 + 95;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    return loanProductBadge;
                }
                throw null;
            }
        }

        private static final /* synthetic */ KSerializer getInterfaceDescriptor() {
            int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback3 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
            return (KSerializer) IAuthTabCallback(iIAuthTabCallback, 1110952500, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback3, new Object[0], -1110952500);
        }

        public final String onExtraCallbackWithResult() {
            int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback3 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
            return (String) IAuthTabCallback(iIAuthTabCallback, -1885081368, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback3, new Object[]{this}, 1885081370);
        }

        public final Map<String, String> asBinder() {
            int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback3 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
            return (Map) IAuthTabCallback(iIAuthTabCallback, -803775311, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback3, new Object[]{this}, 803775312);
        }
    }

    @liq
    public static final class SubjectiveContent implements Parcelable {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        private final String extraInfo;
        private final String review;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<SubjectiveContent> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<SubjectiveContent> {
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ SubjectiveContent createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 89;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                SubjectiveContent subjectiveContentOnExtraCallbackWithResult = onExtraCallbackWithResult(parcel);
                int i4 = onNavigationEvent + 57;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    return subjectiveContentOnExtraCallbackWithResult;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ SubjectiveContent[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 57;
                onExtraCallbackWithResult = i3 % 128;
                Object obj = null;
                if (i3 % 2 == 0) {
                    onExtraCallbackWithResult(i);
                    obj.hashCode();
                    throw null;
                }
                SubjectiveContent[] subjectiveContentArrOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
                int i4 = onNavigationEvent + 47;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    return subjectiveContentArrOnExtraCallbackWithResult;
                }
                obj.hashCode();
                throw null;
            }

            public final SubjectiveContent onExtraCallbackWithResult(Parcel parcel) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                SubjectiveContent subjectiveContent = new SubjectiveContent(parcel.readString(), parcel.readString());
                int i2 = onExtraCallbackWithResult + 29;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return subjectiveContent;
            }

            public final SubjectiveContent[] onExtraCallbackWithResult(int i) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent;
                int i4 = i3 + 23;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                SubjectiveContent[] subjectiveContentArr = new SubjectiveContent[i];
                int i6 = i3 + 17;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 != 0) {
                    return subjectiveContentArr;
                }
                throw null;
            }
        }

        static {
            int i = onExtraCallback + 87;
            onWarmupCompleted = i % 128;
            int i2 = i % 2;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public SubjectiveContent() {
            String str = null;
            this(str, str, 3, (DefaultConstructorMarker) str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 85;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 93;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 60 / 0;
            }
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onNavigationEvent + 85;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    return true;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (!(obj instanceof SubjectiveContent)) {
                int i3 = onNavigationEvent + 55;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            SubjectiveContent subjectiveContent = (SubjectiveContent) obj;
            if (!Intrinsics.areEqual(this.review, subjectiveContent.review)) {
                return false;
            }
            if (Intrinsics.areEqual(this.extraInfo, subjectiveContent.extraInfo)) {
                return true;
            }
            int i5 = onExtraCallbackWithResult + 109;
            onNavigationEvent = i5 % 128;
            return i5 % 2 != 0;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 59;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (this.review.hashCode() * 31) + this.extraInfo.hashCode();
            int i4 = onNavigationEvent + 87;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return iHashCode;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "SubjectiveContent(review=" + this.review + ", extraInfo=" + this.extraInfo + ")";
            int i2 = onExtraCallbackWithResult + 59;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 37;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.review);
            parcel.writeString(this.extraInfo);
            int i5 = onExtraCallbackWithResult + 117;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
        }

        public static final class Companion {
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<SubjectiveContent> serializer() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 123;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                ReviewContents$SubjectiveContent$$serializer reviewContents$SubjectiveContent$$serializer = ReviewContents$SubjectiveContent$$serializer.INSTANCE;
                int i4 = onExtraCallback + 17;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return reviewContents$SubjectiveContent$$serializer;
            }
        }

        public /* synthetic */ SubjectiveContent(int i, String str, String str2, okycx okycxVar) {
            if ((i & 1) == 0) {
                this.review = "";
                int i2 = onExtraCallbackWithResult + 93;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 2 % 2;
                }
            } else {
                this.review = str;
            }
            Object obj = null;
            if ((i & 2) != 0) {
                this.extraInfo = str2;
                int i4 = onExtraCallbackWithResult + 65;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
                return;
            }
            int i5 = onNavigationEvent + 43;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            this.extraInfo = "";
            if (i6 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        public SubjectiveContent(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.review = str;
            this.extraInfo = str2;
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x001d  */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final /* synthetic */ void onExtraCallbackWithResult(viva.republica.toss.network.model.loan.ReviewContents.SubjectiveContent r5, o.vyl r6, kotlinx.serialization.descriptors.SerialDescriptor r7) {
            /*
                r0 = 2
                int r1 = r0 % r0
                r1 = 0
                boolean r2 = r6.onWarmupCompleted(r7, r1)
                java.lang.String r3 = ""
                if (r2 != 0) goto L1d
                int r2 = viva.republica.toss.network.model.loan.ReviewContents.SubjectiveContent.onNavigationEvent
                int r2 = r2 + 35
                int r4 = r2 % 128
                viva.republica.toss.network.model.loan.ReviewContents.SubjectiveContent.onExtraCallbackWithResult = r4
                int r2 = r2 % r0
                java.lang.String r2 = r5.review
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
                if (r2 != 0) goto L22
            L1d:
                java.lang.String r2 = r5.review
                r6.onExtraCallback(r7, r1, r2)
            L22:
                r1 = 1
                boolean r2 = r6.onWarmupCompleted(r7, r1)
                if (r2 != 0) goto L48
                int r2 = viva.republica.toss.network.model.loan.ReviewContents.SubjectiveContent.onExtraCallbackWithResult
                int r2 = r2 + 67
                int r4 = r2 % 128
                viva.republica.toss.network.model.loan.ReviewContents.SubjectiveContent.onNavigationEvent = r4
                int r2 = r2 % r0
                if (r2 != 0) goto L3e
                java.lang.String r2 = r5.extraInfo
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
                r2 = r2 ^ r1
                if (r2 == r1) goto L48
                goto L56
            L3e:
                java.lang.String r5 = r5.extraInfo
                kotlin.jvm.internal.Intrinsics.areEqual(r5, r3)
                r5 = 0
                r5.hashCode()
                throw r5
            L48:
                java.lang.String r5 = r5.extraInfo
                r6.onExtraCallback(r7, r1, r5)
                int r5 = viva.republica.toss.network.model.loan.ReviewContents.SubjectiveContent.onNavigationEvent
                int r5 = r5 + 63
                int r6 = r5 % 128
                viva.republica.toss.network.model.loan.ReviewContents.SubjectiveContent.onExtraCallbackWithResult = r6
                int r5 = r5 % r0
            L56:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.ReviewContents.SubjectiveContent.onExtraCallbackWithResult(viva.republica.toss.network.model.loan.ReviewContents$SubjectiveContent, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ SubjectiveContent(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = onExtraCallbackWithResult + 53;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 2 % 2;
                }
                str = "";
            }
            if ((i & 2) != 0) {
                int i4 = onExtraCallbackWithResult + 65;
                int i5 = i4 % 128;
                onNavigationEvent = i5;
                int i6 = i4 % 2;
                int i7 = i5 + 25;
                onExtraCallbackWithResult = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 2 % 2;
                }
                str2 = "";
            }
            this(str, str2);
        }
    }
}
