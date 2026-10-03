package o;

import com.google.gson.annotations.SerializedName;
import im.toss.core.workerservice.WorkerService$Companion$;
import java.util.Iterator;
import java.util.List;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.transfer.MyAccountInfo;
import viva.republica.toss.network.model.transfer.periodic.PeriodicTransferPostParam;
import viva.republica.toss.send.v3.ReceiverType;
import viva.republica.toss.send.v4.receiver.ReceiverParam;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class makeNativeObject {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ makeNativeObject[] $VALUES;
    public static final IAuthTabCallback Companion;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final String value;

    @SerializedName("TRANSFER")
    public static final makeNativeObject TRANSFER = new makeNativeObject("TRANSFER", 0, "TRANSFER");

    @SerializedName("TOSS_BANK")
    public static final makeNativeObject TOSS_BANK = new makeNativeObject("TOSS_BANK", 1, "TOSS_BANK");

    private static final /* synthetic */ makeNativeObject[] $values() {
        makeNativeObject[] makenativeobjectArr;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 85;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            makeNativeObject makenativeobject = TRANSFER;
            makeNativeObject makenativeobject2 = TOSS_BANK;
            makenativeobjectArr = new makeNativeObject[5];
            makenativeobjectArr[0] = makenativeobject;
            makenativeobjectArr[1] = makenativeobject2;
        } else {
            makenativeobjectArr = new makeNativeObject[]{TRANSFER, TOSS_BANK};
        }
        int i4 = i2 + 91;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return makenativeobjectArr;
    }

    public static EnumEntries<makeNativeObject> getEntries() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 69;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        EnumEntries<makeNativeObject> enumEntries = $ENTRIES;
        if (i3 == 0) {
            int i4 = 1 / 0;
        }
        return enumEntries;
    }

    public static makeNativeObject valueOf(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 39;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        makeNativeObject makenativeobject = (makeNativeObject) Enum.valueOf(makeNativeObject.class, str);
        int i4 = onExtraCallbackWithResult + 19;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 89 / 0;
        }
        return makenativeobject;
    }

    public static makeNativeObject[] values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 107;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        makeNativeObject[] makenativeobjectArr = (makeNativeObject[]) $VALUES.clone();
        int i4 = onNavigationEvent + 55;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return makenativeobjectArr;
        }
        throw null;
    }

    private makeNativeObject(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        String str;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 57;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.value;
            int i4 = 80 / 0;
        } else {
            str = this.value;
        }
        int i5 = i2 + 35;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 22 / 0;
        }
        return str;
    }

    static {
        makeNativeObject[] makenativeobjectArr$values = $values();
        $VALUES = makenativeobjectArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(makenativeobjectArr$values);
        Companion = new IAuthTabCallback(null);
        int i = onWarmupCompleted + 101;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static final class IAuthTabCallback {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }

        public final makeNativeObject onExtraCallbackWithResult(@NotNull String str) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            makeNativeObject[] makenativeobjectArrValues = makeNativeObject.values();
            int length = makenativeobjectArrValues.length;
            int i2 = 0;
            while (i2 < length) {
                int i3 = onExtraCallback + 109;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                makeNativeObject makenativeobject = makenativeobjectArrValues[i2];
                if (Intrinsics.areEqual(makenativeobject.getValue(), str)) {
                    int i5 = onExtraCallback + 81;
                    onNavigationEvent = i5 % 128;
                    if (i5 % 2 != 0) {
                        return makenativeobject;
                    }
                    throw null;
                }
                i2++;
                int i6 = onExtraCallback + 53;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
            }
            return null;
        }

        public final makeNativeObject onExtraCallbackWithResult(@NotNull PeriodicTransferPostParam periodicTransferPostParam, @NotNull List<MyAccountInfo> list) {
            Object obj;
            Object next;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(periodicTransferPostParam, "");
            Intrinsics.checkNotNullParameter(list, "");
            if (((fromBundle) PeriodicTransferPostParam.onNavigationEvent(new Object[]{periodicTransferPostParam}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 236145608, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -236145604)) != fromBundle.BANK_ACCOUNT) {
                return makeNativeObject.TRANSFER;
            }
            List<MyAccountInfo> list2 = list;
            Iterator<T> it = list2.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                int i2 = onExtraCallback + 43;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                next = it.next();
                MyAccountInfo myAccountInfo = (MyAccountInfo) next;
                if (hasCurrentActivity.IAuthTabCallback.onExtraCallbackWithResult(String.valueOf(myAccountInfo.IAuthTabCallbackStub()), myAccountInfo.onExtraCallback(), String.valueOf(periodicTransferPostParam.ICustomTabsCallback()), periodicTransferPostParam.extraCallback())) {
                    break;
                }
            }
            MyAccountInfo myAccountInfo2 = (MyAccountInfo) next;
            if (myAccountInfo2 == null) {
                makeNativeObject makenativeobject = makeNativeObject.TRANSFER;
                int i4 = onExtraCallback + 33;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return makenativeobject;
            }
            Iterator<T> it2 = list2.iterator();
            int i6 = onExtraCallback + 99;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                MyAccountInfo myAccountInfo3 = (MyAccountInfo) next2;
                if (hasCurrentActivity.IAuthTabCallback.onExtraCallbackWithResult(String.valueOf(myAccountInfo3.IAuthTabCallbackStub()), myAccountInfo3.onExtraCallback(), String.valueOf(((Integer) PeriodicTransferPostParam.onNavigationEvent(new Object[]{periodicTransferPostParam}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 874528015, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -874528015)).intValue()), periodicTransferPostParam.onWarmupCompleted())) {
                    obj = next2;
                    break;
                }
            }
            return onExtraCallbackWithResult(myAccountInfo2, (MyAccountInfo) obj);
        }

        public final makeNativeObject onExtraCallbackWithResult(@NotNull MyAccountInfo myAccountInfo, @NotNull ReceiverParam receiverParam, @NotNull List<MyAccountInfo> list) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 3;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(myAccountInfo, "");
            Intrinsics.checkNotNullParameter(receiverParam, "");
            Intrinsics.checkNotNullParameter(list, "");
            if (receiverParam.IAuthTabCallbackDefault() == ReceiverType.ACCOUNT) {
                return onExtraCallbackWithResult(myAccountInfo, receiverParam.onExtraCallbackWithResult(list));
            }
            int i4 = onNavigationEvent + 109;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            makeNativeObject makenativeobject = makeNativeObject.TRANSFER;
            int i6 = onExtraCallback + 79;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return makenativeobject;
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0054 A[PHI: r4
          0x0054: PHI (r4v3 o.checkNavigationBarBySystemProperties) = (r4v2 o.checkNavigationBarBySystemProperties), (r4v7 o.checkNavigationBarBySystemProperties) binds: [B:25:0x0052, B:22:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final o.makeNativeObject onExtraCallbackWithResult(viva.republica.toss.network.model.transfer.MyAccountInfo r4, viva.republica.toss.network.model.transfer.MyAccountInfo r5) {
            /*
                r3 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = o.makeNativeObject.IAuthTabCallback.onExtraCallback
                int r1 = r1 + 19
                int r2 = r1 % 128
                o.makeNativeObject.IAuthTabCallback.onNavigationEvent = r2
                int r1 = r1 % r0
                r2 = 0
                if (r1 == 0) goto L72
                boolean r1 = r4.onMinimized()
                if (r1 == 0) goto L26
                int r4 = o.makeNativeObject.IAuthTabCallback.onNavigationEvent
                int r4 = r4 + 23
                int r5 = r4 % 128
                o.makeNativeObject.IAuthTabCallback.onExtraCallback = r5
                int r4 = r4 % r0
                if (r4 != 0) goto L23
                o.makeNativeObject r4 = o.makeNativeObject.TRANSFER
                return r4
            L23:
                o.makeNativeObject r4 = o.makeNativeObject.TRANSFER
                throw r2
            L26:
                boolean r1 = r4.onActivityLayout()
                if (r1 == 0) goto L2f
                o.makeNativeObject r4 = o.makeNativeObject.TOSS_BANK
                return r4
            L2f:
                if (r5 == 0) goto L6f
                boolean r5 = r5.onActivityLayout()
                r1 = 1
                if (r5 != r1) goto L6f
                int r5 = o.makeNativeObject.IAuthTabCallback.onExtraCallback
                int r5 = r5 + 125
                int r2 = r5 % 128
                o.makeNativeObject.IAuthTabCallback.onNavigationEvent = r2
                int r5 = r5 % r0
                if (r5 != 0) goto L4e
                o.checkNavigationBarBySystemProperties r4 = r4.IAuthTabCallbackDefault()
                r5 = 14
                int r5 = r5 / 0
                if (r4 == 0) goto L6f
                goto L54
            L4e:
                o.checkNavigationBarBySystemProperties r4 = r4.IAuthTabCallbackDefault()
                if (r4 == 0) goto L6f
            L54:
                int r5 = o.makeNativeObject.IAuthTabCallback.onNavigationEvent
                int r5 = r5 + 119
                int r2 = r5 % 128
                o.makeNativeObject.IAuthTabCallback.onExtraCallback = r2
                int r5 = r5 % r0
                if (r5 == 0) goto L66
                boolean r4 = r4.ICustomTabsCallback()
                if (r4 != 0) goto L6f
                goto L6c
            L66:
                boolean r4 = r4.ICustomTabsCallback()
                if (r4 != r1) goto L6f
            L6c:
                o.makeNativeObject r4 = o.makeNativeObject.TOSS_BANK
                return r4
            L6f:
                o.makeNativeObject r4 = o.makeNativeObject.TRANSFER
                return r4
            L72:
                r4.onMinimized()
                r2.hashCode()
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: o.makeNativeObject.IAuthTabCallback.onExtraCallbackWithResult(viva.republica.toss.network.model.transfer.MyAccountInfo, viva.republica.toss.network.model.transfer.MyAccountInfo):o.makeNativeObject");
        }
    }
}
