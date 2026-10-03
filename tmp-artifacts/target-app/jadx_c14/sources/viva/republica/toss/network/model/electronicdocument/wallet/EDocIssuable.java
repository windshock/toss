package viva.republica.toss.network.model.electronicdocument.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkCanOpenLandingPage;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class EDocIssuable implements Parcelable {
    public static final Companion Companion;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final List<EDocIssuableCandidate> candidates;
    private final String categoryName;
    public static final Parcelable.Creator<EDocIssuable> CREATOR = new IAuthTabCallback();
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuable$$ExternalSyntheticLambda0
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 33;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnNavigationEvent = EDocIssuable.onNavigationEvent();
            if (i3 == 0) {
                int i4 = 65 / 0;
            }
            return kSerializerOnNavigationEvent;
        }
    })};

    public static final class IAuthTabCallback implements Parcelable.Creator<EDocIssuable> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        public final EDocIssuable[] IAuthTabCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback;
            int i4 = i3 + 75;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            EDocIssuable[] eDocIssuableArr = new EDocIssuable[i];
            int i6 = i3 + 69;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 != 0) {
                return eDocIssuableArr;
            }
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ EDocIssuable createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 77;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return onNavigationEvent(parcel);
            }
            onNavigationEvent(parcel);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ EDocIssuable[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 5;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            EDocIssuable[] eDocIssuableArrIAuthTabCallback = IAuthTabCallback(i);
            int i5 = onNavigationEvent + 83;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 90 / 0;
            }
            return eDocIssuableArrIAuthTabCallback;
        }

        public final EDocIssuable onNavigationEvent(Parcel parcel) {
            ArrayList arrayList;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                int i3 = 0;
                while (i3 != i2) {
                    int i4 = onNavigationEvent + 37;
                    onExtraCallback = i4 % 128;
                    if (i4 % 2 != 0) {
                        arrayList2.add(EDocIssuableCandidate.CREATOR.createFromParcel(parcel));
                        i3 += 4;
                    } else {
                        arrayList2.add(EDocIssuableCandidate.CREATOR.createFromParcel(parcel));
                        i3++;
                    }
                }
                int i5 = onExtraCallback + 95;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                arrayList = arrayList2;
            }
            return new EDocIssuable(string, arrayList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EDocIssuable() {
        this((String) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 71;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnWarmupCompleted = onWarmupCompleted();
        int i4 = IAuthTabCallback + 75;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 41 / 0;
        }
        return kSerializerOnWarmupCompleted;
    }

    private static final /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(EDocIssuableCandidate$$serializer.INSTANCE);
        int i2 = onExtraCallback + 17;
        IAuthTabCallback = i2 % 128;
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
        int i2 = onExtraCallback + 39;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r6 instanceof viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuable) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        r6 = (viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuable) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.categoryName, r6.categoryName) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        r6 = viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuable.onExtraCallback + 77;
        viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuable.IAuthTabCallback = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.candidates, r6.candidates) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        r6 = viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuable.onExtraCallback + 73;
        viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuable.IAuthTabCallback = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        if ((r6 % 2) != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuable.IAuthTabCallback
            int r1 = r1 + 121
            int r2 = r1 % 128
            viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuable.onExtraCallback = r2
            int r1 = r1 % r0
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L16
            r1 = 16
            int r1 = r1 / r3
            if (r5 != r6) goto L19
            goto L18
        L16:
            if (r5 != r6) goto L19
        L18:
            return r2
        L19:
            boolean r1 = r6 instanceof viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuable
            if (r1 != 0) goto L1e
            return r3
        L1e:
            viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuable r6 = (viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuable) r6
            java.lang.String r1 = r5.categoryName
            java.lang.String r4 = r6.categoryName
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            if (r1 != 0) goto L34
            int r6 = viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuable.onExtraCallback
            int r6 = r6 + 77
            int r1 = r6 % 128
            viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuable.IAuthTabCallback = r1
            int r6 = r6 % r0
            return r3
        L34:
            java.util.List<viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuableCandidate> r1 = r5.candidates
            java.util.List<viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuableCandidate> r6 = r6.candidates
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r6)
            if (r6 != 0) goto L4b
            int r6 = viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuable.onExtraCallback
            int r6 = r6 + 73
            int r1 = r6 % 128
            viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuable.IAuthTabCallback = r1
            int r6 = r6 % r0
            if (r6 != 0) goto L4a
            goto L4b
        L4a:
            r2 = r3
        L4b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuable.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onExtraCallback + 9;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = this.categoryName.hashCode();
        List<EDocIssuableCandidate> list = this.candidates;
        if (list == null) {
            int i4 = onExtraCallback + 67;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = list.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "EDocIssuable(categoryName=" + this.categoryName + ", candidates=" + this.candidates + ")";
        int i2 = onExtraCallback + 5;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.categoryName);
        List<EDocIssuableCandidate> list = this.candidates;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<EDocIssuableCandidate> it = list.iterator();
        while (it.hasNext()) {
            int i3 = onExtraCallback + 121;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                it.next().writeToParcel(parcel, i);
                int i4 = 65 / 0;
            } else {
                it.next().writeToParcel(parcel, i);
            }
            int i5 = IAuthTabCallback + 69;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    public static final class Companion {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<EDocIssuable> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 31;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            EDocIssuable$$serializer eDocIssuable$$serializer = EDocIssuable$$serializer.INSTANCE;
            int i4 = onNavigationEvent + 61;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return eDocIssuable$$serializer;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        int i = onWarmupCompleted + 23;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public /* synthetic */ EDocIssuable(int i, String str, List list, okycx okycxVar) {
        this.categoryName = (i & 1) == 0 ? "" : str;
        if ((i & 2) != 0) {
            this.candidates = list;
            int i2 = onExtraCallback + 125;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        int i4 = onExtraCallback;
        int i5 = i4 + 121;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        this.candidates = null;
        if (i6 == 0) {
            int i7 = 27 / 0;
        }
        int i8 = i4 + 41;
        IAuthTabCallback = i8 % 128;
        int i9 = i8 % 2;
    }

    public EDocIssuable(@NotNull String str, @Nullable List<EDocIssuableCandidate> list) {
        Intrinsics.checkNotNullParameter(str, "");
        this.categoryName = str;
        this.candidates = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0028  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void IAuthTabCallback(viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuable r5, o.vyl r6, kotlinx.serialization.descriptors.SerialDescriptor r7) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuable.onExtraCallback
            int r1 = r1 + 5
            int r2 = r1 % 128
            viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuable.IAuthTabCallback = r2
            int r1 = r1 % r0
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuable.$childSerializers
            r2 = 0
            boolean r3 = r6.onWarmupCompleted(r7, r2)
            if (r3 != 0) goto L28
            int r3 = viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuable.onExtraCallback
            int r3 = r3 + 73
            int r4 = r3 % 128
            viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuable.IAuthTabCallback = r4
            int r3 = r3 % r0
            java.lang.String r0 = r5.categoryName
            java.lang.String r3 = ""
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r0 != 0) goto L2d
        L28:
            java.lang.String r0 = r5.categoryName
            r6.onExtraCallback(r7, r2, r0)
        L2d:
            r0 = 1
            boolean r2 = r6.onWarmupCompleted(r7, r0)
            if (r2 != 0) goto L38
            java.util.List<viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuableCandidate> r2 = r5.candidates
            if (r2 == 0) goto L45
        L38:
            r1 = r1[r0]
            java.lang.Object r1 = r1.getValue()
            o.py r1 = (o.py) r1
            java.util.List<viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuableCandidate> r5 = r5.candidates
            r6.onExtraCallbackWithResult(r7, r0, r1, r5)
        L45:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuable.IAuthTabCallback(viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuable, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public static final /* synthetic */ Lazy[] onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 111;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i4 = i3 + 35;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return lazyArr;
        }
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ EDocIssuable(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallback + 17;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            str = "";
        }
        if ((i & 2) != 0) {
            int i5 = onExtraCallback + 45;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            list = null;
        }
        this(str, list);
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 17;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.categoryName;
        }
        throw null;
    }

    public final List<EDocIssuableCandidate> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 121;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<EDocIssuableCandidate> list = this.candidates;
        int i4 = i2 + 105;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }
}
