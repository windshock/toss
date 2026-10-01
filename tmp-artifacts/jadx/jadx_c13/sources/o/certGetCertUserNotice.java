package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class certGetCertUserNotice {
    public static final List<decryptRSA> onExtraCallbackWithResult(@NotNull decryptRSA decryptrsa, @NotNull decryptRSA decryptrsa2, boolean z) {
        decryptRSA decryptrsaIAuthTabCallbackDefault;
        Intrinsics.checkNotNullParameter(decryptrsa, "");
        Intrinsics.checkNotNullParameter(decryptrsa2, "");
        int iIAuthTabCallback = IAuthTabCallback(decryptrsa);
        int iIAuthTabCallback2 = IAuthTabCallback(decryptrsa2);
        ArrayList arrayList = new ArrayList();
        while (iIAuthTabCallback != iIAuthTabCallback2) {
            if (iIAuthTabCallback > iIAuthTabCallback2) {
                decryptrsa = getKMCert.onExtraCallbackWithResult(decryptrsa);
                iIAuthTabCallback--;
            } else {
                arrayList.add(decryptrsa2);
                decryptrsa2 = getKMCert.onExtraCallbackWithResult(decryptrsa2);
                iIAuthTabCallback2--;
            }
        }
        while (decryptrsa != decryptrsa2) {
            decryptrsa = getKMCert.onExtraCallbackWithResult(decryptrsa);
            arrayList.add(decryptrsa2);
            decryptrsa2 = getKMCert.onExtraCallbackWithResult(decryptrsa2);
        }
        arrayList.add(decryptrsa);
        if (z && (decryptrsaIAuthTabCallbackDefault = decryptrsa.IAuthTabCallbackDefault()) != null) {
            arrayList.add(decryptrsaIAuthTabCallbackDefault);
        }
        return arrayList;
    }

    public static final certGetAuthorityKeyIdentifierInfo onNavigationEvent(@NotNull decryptRSA decryptrsa, @NotNull Set<? extends decryptRSA> set, boolean z) {
        decryptRSA decryptrsaIAuthTabCallbackDefault;
        Intrinsics.checkNotNullParameter(decryptrsa, "");
        Intrinsics.checkNotNullParameter(set, "");
        if (set.isEmpty()) {
            throw new IllegalArgumentException("States set is empty");
        }
        ArrayList arrayList = new ArrayList();
        for (decryptRSA decryptrsa2 : set) {
            arrayList.add(new onExtraCallbackWithResult(new certGetAuthorityKeyIdentifierInfo(decryptrsa2, new LinkedHashSet()), IAuthTabCallback(decryptrsa2), false, 4, null));
        }
        arrayList.add(new onExtraCallbackWithResult(new certGetAuthorityKeyIdentifierInfo(decryptrsa, new LinkedHashSet()), IAuthTabCallback(decryptrsa), true));
        do {
            Iterator it = arrayList.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            int iOnExtraCallback = ((onExtraCallbackWithResult) it.next()).onExtraCallback();
            while (it.hasNext()) {
                int iOnExtraCallback2 = ((onExtraCallbackWithResult) it.next()).onExtraCallback();
                if (iOnExtraCallback < iOnExtraCallback2) {
                    iOnExtraCallback = iOnExtraCallback2;
                }
            }
            ArrayList<onExtraCallbackWithResult> arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((onExtraCallbackWithResult) obj).onExtraCallback() == iOnExtraCallback) {
                    arrayList2.add(obj);
                }
            }
            for (onExtraCallbackWithResult onextracallbackwithresult : arrayList2) {
                onextracallbackwithresult.onExtraCallback(new certGetAuthorityKeyIdentifierInfo(getKMCert.onExtraCallbackWithResult(onextracallbackwithresult.onWarmupCompleted().onNavigationEvent()), clearNumber.IAuthTabCallbackStub(onextracallbackwithresult.onWarmupCompleted())));
                onextracallbackwithresult.IAuthTabCallback(onextracallbackwithresult.onExtraCallback() - 1);
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (((onExtraCallbackWithResult) obj2).onExtraCallback() == iOnExtraCallback - 1) {
                    arrayList3.add(obj2);
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj3 : arrayList3) {
                decryptRSA decryptrsaOnNavigationEvent = ((onExtraCallbackWithResult) obj3).onWarmupCompleted().onNavigationEvent();
                Object arrayList4 = linkedHashMap.get(decryptrsaOnNavigationEvent);
                if (arrayList4 == null) {
                    arrayList4 = new ArrayList();
                    linkedHashMap.put(decryptrsaOnNavigationEvent, arrayList4);
                }
                ((List) arrayList4).add(obj3);
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                Iterator it2 = ((List) entry.getValue()).iterator();
                int i = 0;
                int i2 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        i2 = -1;
                        break;
                    }
                    if (!((onExtraCallbackWithResult) it2.next()).onNavigationEvent()) {
                        break;
                    }
                    i2++;
                }
                if (i2 != -1) {
                    for (Object obj4 : (Iterable) entry.getValue()) {
                        if (i < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                        }
                        onExtraCallbackWithResult onextracallbackwithresult2 = (onExtraCallbackWithResult) obj4;
                        if (i != i2) {
                            if (!onextracallbackwithresult2.onNavigationEvent()) {
                                ((onExtraCallbackWithResult) ((List) entry.getValue()).get(i2)).onWarmupCompleted().onExtraCallbackWithResult().addAll(onextracallbackwithresult2.onWarmupCompleted().onExtraCallbackWithResult());
                            }
                            arrayList.remove(onextracallbackwithresult2);
                        }
                        i++;
                    }
                }
            }
        } while (arrayList.size() > 1);
        certGetAuthorityKeyIdentifierInfo certgetauthoritykeyidentifierinfoOnWarmupCompleted = ((onExtraCallbackWithResult) CollectionsKt___CollectionsKt.single((List) arrayList)).onWarmupCompleted();
        return (!z || (decryptrsaIAuthTabCallbackDefault = certgetauthoritykeyidentifierinfoOnWarmupCompleted.onNavigationEvent().IAuthTabCallbackDefault()) == null) ? certgetauthoritykeyidentifierinfoOnWarmupCompleted : new certGetAuthorityKeyIdentifierInfo(decryptrsaIAuthTabCallbackDefault, clearNumber.IAuthTabCallbackStub(certgetauthoritykeyidentifierinfoOnWarmupCompleted));
    }

    public static final class onExtraCallbackWithResult {
        private int onExtraCallback;
        private final boolean onExtraCallbackWithResult;
        private certGetAuthorityKeyIdentifierInfo onWarmupCompleted;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onExtraCallbackWithResult)) {
                return false;
            }
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) obj;
            return Intrinsics.areEqual(this.onWarmupCompleted, onextracallbackwithresult.onWarmupCompleted) && this.onExtraCallback == onextracallbackwithresult.onExtraCallback && this.onExtraCallbackWithResult == onextracallbackwithresult.onExtraCallbackWithResult;
        }

        public int hashCode() {
            return (((this.onWarmupCompleted.hashCode() * 31) + Integer.hashCode(this.onExtraCallback)) * 31) + Boolean.hashCode(this.onExtraCallbackWithResult);
        }

        public String toString() {
            return "StatePointer(path=" + this.onWarmupCompleted + ", depth=" + this.onExtraCallback + ", ignore=" + this.onExtraCallbackWithResult + ")";
        }

        public onExtraCallbackWithResult(certGetAuthorityKeyIdentifierInfo certgetauthoritykeyidentifierinfo, int i, boolean z) {
            Intrinsics.checkNotNullParameter(certgetauthoritykeyidentifierinfo, "");
            this.onWarmupCompleted = certgetauthoritykeyidentifierinfo;
            this.onExtraCallback = i;
            this.onExtraCallbackWithResult = z;
        }

        public /* synthetic */ onExtraCallbackWithResult(certGetAuthorityKeyIdentifierInfo certgetauthoritykeyidentifierinfo, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(certgetauthoritykeyidentifierinfo, i, (i2 & 4) != 0 ? false : z);
        }

        public final void onExtraCallback(certGetAuthorityKeyIdentifierInfo certgetauthoritykeyidentifierinfo) {
            Intrinsics.checkNotNullParameter(certgetauthoritykeyidentifierinfo, "");
            this.onWarmupCompleted = certgetauthoritykeyidentifierinfo;
        }

        public final certGetAuthorityKeyIdentifierInfo onWarmupCompleted() {
            return this.onWarmupCompleted;
        }

        public final void IAuthTabCallback(int i) {
            this.onExtraCallback = i;
        }

        public final int onExtraCallback() {
            return this.onExtraCallback;
        }

        public final boolean onNavigationEvent() {
            return this.onExtraCallbackWithResult;
        }
    }

    public static final decryptRSA onWarmupCompleted(@NotNull Set<? extends decryptRSA> set) {
        Intrinsics.checkNotNullParameter(set, "");
        if (set.isEmpty()) {
            throw new IllegalArgumentException("States set is empty");
        }
        ArrayList<Pair> arrayList = new ArrayList();
        for (decryptRSA decryptrsa : set) {
            arrayList.add(getWrite.IAuthTabCallback(decryptrsa, Integer.valueOf(IAuthTabCallback(decryptrsa))));
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        int iIntValue = ((Number) ((Pair) it.next()).getSecond()).intValue();
        while (it.hasNext()) {
            int iIntValue2 = ((Number) ((Pair) it.next()).getSecond()).intValue();
            if (iIntValue > iIntValue2) {
                iIntValue = iIntValue2;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            decryptRSA decryptrsaOnExtraCallbackWithResult = (decryptRSA) pair.onExtraCallbackWithResult();
            for (int iIntValue3 = ((Number) pair.IAuthTabCallback()).intValue(); iIntValue != iIntValue3; iIntValue3--) {
                decryptrsaOnExtraCallbackWithResult = getKMCert.onExtraCallbackWithResult(decryptrsaOnExtraCallbackWithResult);
            }
            arrayList2.add(decryptrsaOnExtraCallbackWithResult);
        }
        while (!IAuthTabCallback(arrayList2)) {
            int i = 0;
            for (Object obj : arrayList2) {
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                arrayList2.set(i, getKMCert.onExtraCallbackWithResult((decryptRSA) obj));
                i++;
            }
        }
        return (decryptRSA) CollectionsKt___CollectionsKt.first((List) arrayList2);
    }

    private static final boolean IAuthTabCallback(List<? extends decryptRSA> list) {
        decryptRSA decryptrsa = (decryptRSA) CollectionsKt___CollectionsKt.first((List) list);
        List<? extends decryptRSA> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return true;
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            if (((decryptRSA) it.next()) != decryptrsa) {
                return false;
            }
        }
        return true;
    }

    public static final int IAuthTabCallback(@NotNull decryptRSA decryptrsa) {
        Intrinsics.checkNotNullParameter(decryptrsa, "");
        int i = 0;
        for (decryptRSA decryptrsaIAuthTabCallbackDefault = decryptrsa.IAuthTabCallbackDefault(); decryptrsaIAuthTabCallbackDefault != null; decryptrsaIAuthTabCallbackDefault = decryptrsaIAuthTabCallbackDefault.IAuthTabCallbackDefault()) {
            i++;
        }
        return i;
    }

    public static final certGetAuthorityKeyIdentifierInfo onWarmupCompleted(@NotNull certGetAuthorityKeyIdentifierInfo certgetauthoritykeyidentifierinfo) {
        certGetAuthorityKeyIdentifierInfo certgetauthoritykeyidentifierinfoOnWarmupCompleted;
        Intrinsics.checkNotNullParameter(certgetauthoritykeyidentifierinfo, "");
        certGetAuthorityKeyIdentifierInfo certgetauthoritykeyidentifierinfo2 = (certGetAuthorityKeyIdentifierInfo) CollectionsKt___CollectionsKt.firstOrNull(certgetauthoritykeyidentifierinfo.onExtraCallbackWithResult());
        return (certgetauthoritykeyidentifierinfo2 == null || (certgetauthoritykeyidentifierinfoOnWarmupCompleted = onWarmupCompleted(certgetauthoritykeyidentifierinfo2)) == null) ? certgetauthoritykeyidentifierinfo : certgetauthoritykeyidentifierinfoOnWarmupCompleted;
    }
}
