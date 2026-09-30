package o;

import im.toss.global.features.kyc.eu.main.cdd.ui.identity_confirm.GlobalKycEuIdentityConfirmViewModel;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class noStore {
    public static final onExtraCallback Companion;
    private static final noStore IAuthTabCallback;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int access100 = 1;
    private static int asInterface;
    private static final noStore onExtraCallback;
    private static final noStore onExtraCallbackWithResult;
    private static final noStore onNavigationEvent;
    private static final noStore onWarmupCompleted;
    private final int[] asBinder;
    private final long[] onTransact;

    public String toString() {
        int i = 2 % 2;
        String str = "Haptic(timings=" + Arrays.toString(this.onTransact) + ", amplitudes=" + Arrays.toString(this.asBinder) + ")";
        int i2 = asInterface + 7;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 98 / 0;
        }
        return str;
    }

    public noStore(@NotNull long[] jArr, @NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(jArr, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        this.onTransact = jArr;
        this.asBinder = iArr;
    }

    public static final /* synthetic */ noStore IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = access100 + 69;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        noStore nostore = onNavigationEvent;
        int i5 = i3 + 69;
        access100 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 89 / 0;
        }
        return nostore;
    }

    public static final /* synthetic */ noStore onExtraCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 99;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted;
        }
        throw null;
    }

    public static final /* synthetic */ noStore onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asInterface + 61;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult;
        }
        throw null;
    }

    public static final /* synthetic */ noStore onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asInterface + 73;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback;
        }
        throw null;
    }

    public static final /* synthetic */ noStore onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asInterface + 57;
        int i3 = i2 % 128;
        access100 = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        noStore nostore = onExtraCallback;
        int i4 = i3 + 85;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return nostore;
        }
        obj.hashCode();
        throw null;
    }

    public final long[] IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 25;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        long[] jArr = this.onTransact;
        int i5 = i2 + 35;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return jArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int[] asBinder() {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 1;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        int[] iArr = this.asBinder;
        int i5 = i2 + 59;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return iArr;
    }

    public boolean equals(@Nullable Object obj) {
        Class<?> cls;
        int i = 2 % 2;
        if (this == obj) {
            int i2 = access100 + 87;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            int i4 = access100 + 107;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            cls = null;
        }
        if (!Intrinsics.areEqual(noStore.class, cls)) {
            int i6 = access100 + 67;
            asInterface = i6 % 128;
            return i6 % 2 != 0;
        }
        Intrinsics.checkNotNull(obj, "");
        noStore nostore = (noStore) obj;
        if (Arrays.equals(this.onTransact, nostore.onTransact)) {
            return Arrays.equals(this.asBinder, nostore.asBinder);
        }
        int i7 = asInterface + 115;
        access100 = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 15 / 0;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = asInterface + 79;
        access100 = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (Arrays.hashCode(this.onTransact) + 105) % Arrays.hashCode(this.asBinder) : (Arrays.hashCode(this.onTransact) * 31) + Arrays.hashCode(this.asBinder);
        int i3 = asInterface + 5;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public static final class onExtraCallback {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Object onWarmupCompleted(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
            int i7 = (~((~i6) | i2)) | i4;
            int i8 = ~i4;
            int i9 = (~(i8 | i2)) | (~(i8 | i6)) | (~(i2 | i6));
            int i10 = (~(i6 | (~i2))) | i8;
            int i11 = i4 + i2 + i5 + ((-2137991558) * i) + (111092868 * i3);
            int i12 = i11 * i11;
            int i13 = (((-431794203) * i4) - 566755328) + (427185167 * i2) + (i7 * 1717982222) + (1717982222 * i9) + ((-1717982222) * i10) + ((-1290797056) * i5) + ((-1247805440) * i) + ((-1807745024) * i3) + ((-591921152) * i12);
            int i14 = (i4 * (-1469267343)) + 1003592187 + (i2 * (-1469268429)) + (i7 * (-362)) + (i9 * (-362)) + (i10 * 362) + (i5 * (-1469268067)) + (i * 1951436498) + (i3 * (-746069772)) + (i12 * (-1529348096));
            if (i13 + (i14 * i14 * 1762131968) != 1) {
                return IAuthTabCallback(objArr);
            }
            int i15 = 2 % 2;
            noStore nostore = new noStore(new long[]{20}, new int[]{100});
            int i16 = onExtraCallbackWithResult + 29;
            onExtraCallback = i16 % 128;
            int i17 = i16 % 2;
            return nostore;
        }

        private onExtraCallback() {
        }

        public static final /* synthetic */ noStore onExtraCallback(onExtraCallback onextracallback, noStore[] nostoreArr, long[] jArr) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 61;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            noStore nostoreOnNavigationEvent = onextracallback.onNavigationEvent(nostoreArr, jArr);
            if (i3 != 0) {
                int i4 = 7 / 0;
            }
            return nostoreOnNavigationEvent;
        }

        public final noStore onExtraCallbackWithResult() {
            int i = 2 % 2;
            noStore nostore = new noStore(new long[]{0}, new int[]{0});
            int i2 = onExtraCallbackWithResult + 37;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return nostore;
            }
            throw null;
        }

        private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
            int i = 2 % 2;
            noStore nostore = new noStore(new long[]{1}, new int[]{160});
            int i2 = onExtraCallback + 45;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return nostore;
            }
            throw null;
        }

        public final noStore IAuthTabCallbackDefault() {
            int i = 2 % 2;
            noStore nostore = new noStore(new long[]{10, 10}, new int[]{10, 150});
            int i2 = onExtraCallbackWithResult + 33;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return nostore;
        }

        public final noStore asInterface() {
            int i = 2 % 2;
            noStore nostore = new noStore(new long[]{10, 5}, new int[]{20, 255});
            int i2 = onExtraCallbackWithResult + 73;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return nostore;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final noStore onNavigationEvent() {
            int i = 2 % 2;
            noStore nostore = new noStore(new long[]{2}, new int[]{120});
            int i2 = onExtraCallback + 61;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return nostore;
        }

        public final noStore onExtraCallback() {
            int i = 2 % 2;
            noStore nostore = new noStore(new long[]{4}, new int[]{130});
            int i2 = onExtraCallback + 39;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return nostore;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final noStore IAuthTabCallbackStub() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 105;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            noStore nostoreOnNavigationEvent = noStore.onNavigationEvent();
            int i4 = onExtraCallback + 71;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 8 / 0;
            }
            return nostoreOnNavigationEvent;
        }

        public final noStore access100() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 35;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            noStore nostoreIAuthTabCallback = noStore.IAuthTabCallback();
            int i4 = onExtraCallback + 9;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return nostoreIAuthTabCallback;
            }
            throw null;
        }

        public final noStore onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 87;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            noStore nostoreOnExtraCallbackWithResult = noStore.onExtraCallbackWithResult();
            int i4 = onExtraCallback + 49;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return nostoreOnExtraCallbackWithResult;
        }

        public final noStore asBinder() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 115;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            noStore nostoreOnExtraCallback = noStore.onExtraCallback();
            int i4 = onExtraCallbackWithResult + 53;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return nostoreOnExtraCallback;
            }
            throw null;
        }

        public final noStore IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 81;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            noStore nostoreOnWarmupCompleted = noStore.onWarmupCompleted();
            int i4 = onExtraCallback + 27;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return nostoreOnWarmupCompleted;
            }
            throw null;
        }

        private final noStore onNavigationEvent(noStore[] nostoreArr, long[] jArr) {
            int i = 2 % 2;
            int length = jArr.length;
            int length2 = nostoreArr.length;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int length3 = nostoreArr.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length3) {
                int i4 = onExtraCallback + 91;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                noStore nostore = nostoreArr[i2];
                arrayList.addAll(ArraysKt.toList(nostore.IAuthTabCallbackDefault()));
                arrayList2.addAll(ArraysKt.toList(nostore.asBinder()));
                if (i3 < nostoreArr.length - 1) {
                    int i6 = onExtraCallback + 41;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                    arrayList.add(Long.valueOf(jArr[i3] - ArraysKt.sum(nostore.IAuthTabCallbackDefault())));
                    arrayList2.add(0);
                }
                i2++;
                i3++;
            }
            noStore nostore2 = new noStore(CollectionsKt.toLongArray(arrayList), CollectionsKt.toIntArray(arrayList2));
            int i8 = onExtraCallback + 15;
            onExtraCallbackWithResult = i8 % 128;
            if (i8 % 2 != 0) {
                return nostore2;
            }
            throw null;
        }

        public final noStore onTransact() {
            int iOnWarmupCompleted = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
            return (noStore) onWarmupCompleted(new Object[]{this}, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), 502194663, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), -502194662, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted);
        }

        public final noStore getInterfaceDescriptor() {
            int iOnWarmupCompleted = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
            return (noStore) onWarmupCompleted(new Object[]{this}, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), 47463863, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), -47463863, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted);
        }
    }

    static {
        onExtraCallback onextracallback = new onExtraCallback(null);
        Companion = onextracallback;
        IAuthTabCallback = onExtraCallback.onExtraCallback(onextracallback, new noStore[]{onextracallback.onExtraCallback(), onextracallback.asInterface(), onextracallback.onExtraCallback()}, new long[]{350, 250});
        noStore nostoreOnExtraCallback = onextracallback.onExtraCallback();
        int iOnWarmupCompleted = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
        noStore nostore = (noStore) onExtraCallback.onWarmupCompleted(new Object[]{onextracallback}, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), 502194663, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), -502194662, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted);
        int iOnWarmupCompleted2 = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
        onNavigationEvent = onExtraCallback.onExtraCallback(onextracallback, new noStore[]{nostoreOnExtraCallback, nostore, (noStore) onExtraCallback.onWarmupCompleted(new Object[]{onextracallback}, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), 47463863, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), -47463863, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted2)}, new long[]{100, 100});
        onExtraCallbackWithResult = new noStore(new long[]{5, 10, 240}, new int[]{160, 0, 20});
        int iOnWarmupCompleted3 = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
        onWarmupCompleted = (noStore) onExtraCallback.onWarmupCompleted(new Object[]{onextracallback}, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), 502194663, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), -502194662, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted3);
        noStore nostoreOnExtraCallbackWithResult = onextracallback.onExtraCallbackWithResult();
        noStore nostoreAsInterface = onextracallback.asInterface();
        int iOnWarmupCompleted4 = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
        noStore nostore2 = (noStore) onExtraCallback.onWarmupCompleted(new Object[]{onextracallback}, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), 47463863, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), -47463863, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted4);
        int iOnWarmupCompleted5 = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
        noStore nostore3 = (noStore) onExtraCallback.onWarmupCompleted(new Object[]{onextracallback}, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), 47463863, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), -47463863, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted5);
        int iOnWarmupCompleted6 = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
        noStore nostore4 = (noStore) onExtraCallback.onWarmupCompleted(new Object[]{onextracallback}, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), 47463863, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), -47463863, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted6);
        int iOnWarmupCompleted7 = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
        noStore nostore5 = (noStore) onExtraCallback.onWarmupCompleted(new Object[]{onextracallback}, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), 47463863, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), -47463863, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted7);
        int iOnWarmupCompleted8 = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
        noStore nostore6 = (noStore) onExtraCallback.onWarmupCompleted(new Object[]{onextracallback}, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), 47463863, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), -47463863, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted8);
        int iOnWarmupCompleted9 = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
        onExtraCallback = onExtraCallback.onExtraCallback(onextracallback, new noStore[]{nostoreOnExtraCallbackWithResult, nostoreAsInterface, nostore2, nostore3, nostore4, nostore5, nostore6, (noStore) onExtraCallback.onWarmupCompleted(new Object[]{onextracallback}, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), 47463863, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), -47463863, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted9)}, new long[]{390, 110, 70, 80, 120, 160, 110});
        int i = IAuthTabCallbackDefault + 61;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 == 0) {
            int i2 = 73 / 0;
        }
    }
}
