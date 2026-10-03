package o;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.NativeDialogManagerAndroidSpec;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigTitle;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class NativeDeviceInfoSpec {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;

    @SerializedName("allowPartialFailure")
    private final boolean allowPartialFailure;

    @SerializedName("guideText")
    private final DocumentWalletConfigTitle guideText;

    @SerializedName("retryable")
    private final boolean retryable;

    @SerializedName("statusList")
    private final List<NativeDialogManagerAndroidSpec> statusList;

    public NativeDeviceInfoSpec() {
        this(null, false, false, null, 15, null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallbackWithResult + 41;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof NativeDeviceInfoSpec)) {
            int i4 = onExtraCallback + 85;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        NativeDeviceInfoSpec nativeDeviceInfoSpec = (NativeDeviceInfoSpec) obj;
        if (!Intrinsics.areEqual(this.statusList, nativeDeviceInfoSpec.statusList)) {
            int i6 = onExtraCallbackWithResult + 19;
            onExtraCallback = i6 % 128;
            return i6 % 2 == 0;
        }
        if (this.allowPartialFailure != nativeDeviceInfoSpec.allowPartialFailure || this.retryable != nativeDeviceInfoSpec.retryable) {
            return false;
        }
        if (Intrinsics.areEqual(this.guideText, nativeDeviceInfoSpec.guideText)) {
            return true;
        }
        int i7 = onExtraCallbackWithResult + 97;
        int i8 = i7 % 128;
        onExtraCallback = i8;
        int i9 = i7 % 2;
        int i10 = i8 + 99;
        onExtraCallbackWithResult = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.statusList.hashCode();
        int iHashCode3 = Boolean.hashCode(this.allowPartialFailure);
        int iHashCode4 = Boolean.hashCode(this.retryable);
        DocumentWalletConfigTitle documentWalletConfigTitle = this.guideText;
        if (documentWalletConfigTitle == null) {
            int i2 = onExtraCallbackWithResult + 67;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = documentWalletConfigTitle.hashCode();
        }
        int i4 = (((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode;
        int i5 = onExtraCallback + 19;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DocumentWalletIssueStatusResp(statusList=" + this.statusList + ", allowPartialFailure=" + this.allowPartialFailure + ", retryable=" + this.retryable + ", guideText=" + this.guideText + ")";
        int i2 = onExtraCallbackWithResult + 43;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public NativeDeviceInfoSpec(@NotNull List<NativeDialogManagerAndroidSpec> list, boolean z, boolean z2, @Nullable DocumentWalletConfigTitle documentWalletConfigTitle) {
        Intrinsics.checkNotNullParameter(list, "");
        this.statusList = list;
        this.allowPartialFailure = z;
        this.retryable = z2;
        this.guideText = documentWalletConfigTitle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ NativeDeviceInfoSpec(List list, boolean z, boolean z2, DocumentWalletConfigTitle documentWalletConfigTitle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallbackWithResult + 85;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                CollectionsKt.emptyList();
                throw null;
            }
            list = CollectionsKt.emptyList();
        }
        if ((i & 2) != 0) {
            int i3 = onExtraCallback + 7;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            z = false;
        }
        if ((i & 4) != 0) {
            int i5 = onExtraCallback + 19;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            z2 = false;
        }
        if ((i & 8) != 0) {
            int i8 = onExtraCallbackWithResult + 11;
            onExtraCallback = i8 % 128;
            if (i8 % 2 == 0) {
                throw null;
            }
            int i9 = 2 % 2;
            documentWalletConfigTitle = null;
        }
        this(list, z, z2, documentWalletConfigTitle);
    }

    public final List<NativeDialogManagerAndroidSpec> asInterface() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        List<NativeDialogManagerAndroidSpec> list = this.statusList;
        int i5 = i3 + 101;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public final boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return this.allowPartialFailure;
        }
        throw null;
    }

    public final boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 47;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        boolean z = this.retryable;
        int i5 = i3 + 73;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final DocumentWalletConfigTitle onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 9;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return this.guideText;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o.NativeDialogManagerAndroidSpec.onWarmupCompleted onExtraCallback() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            java.util.List r1 = r4.asBinder()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r2 = r1 instanceof java.util.Collection
            if (r2 == 0) goto L16
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L36
        L16:
            java.util.Iterator r1 = r1.iterator()
            int r2 = o.NativeDeviceInfoSpec.onExtraCallbackWithResult
            int r2 = r2 + 123
            int r3 = r2 % 128
            o.NativeDeviceInfoSpec.onExtraCallback = r3
            int r2 = r2 % r0
        L23:
            boolean r2 = r1.hasNext()
            r3 = 1
            r2 = r2 ^ r3
            if (r2 == r3) goto L36
            java.lang.Object r2 = r1.next()
            o.NativeDialogManagerAndroidSpec$onWarmupCompleted r2 = (o.NativeDialogManagerAndroidSpec.onWarmupCompleted) r2
            o.NativeDialogManagerAndroidSpec$onWarmupCompleted r3 = o.NativeDialogManagerAndroidSpec.onWarmupCompleted.IN_PROCESS
            if (r2 != r3) goto L23
            return r3
        L36:
            java.util.List r1 = r4.asBinder()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r2 = r1 instanceof java.util.Collection
            if (r2 == 0) goto L49
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L9c
        L49:
            java.util.Iterator r1 = r1.iterator()
            int r2 = o.NativeDeviceInfoSpec.onExtraCallbackWithResult
            int r2 = r2 + 117
            int r3 = r2 % 128
            o.NativeDeviceInfoSpec.onExtraCallback = r3
            int r2 = r2 % r0
        L56:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L9c
            java.lang.Object r2 = r1.next()
            o.NativeDialogManagerAndroidSpec$onWarmupCompleted r2 = (o.NativeDialogManagerAndroidSpec.onWarmupCompleted) r2
            o.NativeDialogManagerAndroidSpec$onWarmupCompleted r3 = o.NativeDialogManagerAndroidSpec.onWarmupCompleted.SUCCESS
            if (r2 == r3) goto L56
            java.util.List r1 = r4.asBinder()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r2 = r1 instanceof java.util.Collection
            if (r2 == 0) goto L82
            int r2 = o.NativeDeviceInfoSpec.onExtraCallbackWithResult
            int r2 = r2 + 61
            int r3 = r2 % 128
            o.NativeDeviceInfoSpec.onExtraCallback = r3
            int r2 = r2 % r0
            r0 = r1
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L99
        L82:
            java.util.Iterator r0 = r1.iterator()
        L86:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L99
            java.lang.Object r1 = r0.next()
            o.NativeDialogManagerAndroidSpec$onWarmupCompleted r1 = (o.NativeDialogManagerAndroidSpec.onWarmupCompleted) r1
            o.NativeDialogManagerAndroidSpec$onWarmupCompleted r2 = o.NativeDialogManagerAndroidSpec.onWarmupCompleted.RESERVED
            if (r1 == r2) goto L86
            o.NativeDialogManagerAndroidSpec$onWarmupCompleted r0 = o.NativeDialogManagerAndroidSpec.onWarmupCompleted.FAIL
            return r0
        L99:
            o.NativeDialogManagerAndroidSpec$onWarmupCompleted r0 = o.NativeDialogManagerAndroidSpec.onWarmupCompleted.RESERVED
            return r0
        L9c:
            o.NativeDialogManagerAndroidSpec$onWarmupCompleted r1 = o.NativeDialogManagerAndroidSpec.onWarmupCompleted.SUCCESS
            int r2 = o.NativeDeviceInfoSpec.onExtraCallbackWithResult
            int r2 = r2 + 43
            int r3 = r2 % 128
            o.NativeDeviceInfoSpec.onExtraCallback = r3
            int r2 = r2 % r0
            if (r2 != 0) goto Lad
            r0 = 14
            int r0 = r0 / 0
        Lad:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.NativeDeviceInfoSpec.onExtraCallback():o.NativeDialogManagerAndroidSpec$onWarmupCompleted");
    }

    public final boolean IAuthTabCallback() {
        int i = 2 % 2;
        List<NativeDialogManagerAndroidSpec> list = this.statusList;
        ArrayList arrayList = new ArrayList();
        int i2 = onExtraCallback + 55;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        for (Object obj : list) {
            if (((NativeDialogManagerAndroidSpec) obj).asInterface() == NativeDialogManagerAndroidSpec.onWarmupCompleted.SUCCESS) {
                int i4 = onExtraCallback + 29;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    arrayList.add(obj);
                    throw null;
                }
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            int i5 = onExtraCallbackWithResult + 5;
            onExtraCallback = i5 % 128;
            return i5 % 2 != 0;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((NativeDialogManagerAndroidSpec) it.next()).onExtraCallback()) {
                return false;
            }
        }
        int i6 = onExtraCallbackWithResult + 65;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    private final List<NativeDialogManagerAndroidSpec.onWarmupCompleted> asBinder() {
        int i = 2 % 2;
        List<NativeDialogManagerAndroidSpec> list = this.statusList;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        int i2 = onExtraCallbackWithResult + 59;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        while (it.hasNext()) {
            NativeDialogManagerAndroidSpec.onWarmupCompleted onwarmupcompletedAsInterface = ((NativeDialogManagerAndroidSpec) it.next()).asInterface();
            if (onwarmupcompletedAsInterface != null) {
                int i4 = onExtraCallback + 45;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                arrayList.add(onwarmupcompletedAsInterface);
            }
        }
        return arrayList;
    }
}
