package viva.republica.toss.network.model.transfer.periodic;

import android.graphics.Color;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.gson.JsonObject;
import im.toss.core.workerservice.WorkerService$Companion$;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.EncryptedContentInfoParser;
import o.TimelineExternalSyntheticLambda0;
import o.TombstoneProtosMemoryMappingBuilder;
import o.fromArray;
import o.fromBundle;
import o.hasCurrentActivity;
import o.liq;
import o.okycx;
import o.updateRenderInfoForVideo;
import o.userDrivenScrollEnded;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.SignatureRequest;
import viva.republica.toss.network.model.transfer.MyAccountInfo;
import viva.republica.toss.network.model.transfer.periodic.PeriodicTransferPostParam$;
import viva.republica.toss.send.periodic.view.PeriodicTransferPicker;
import viva.republica.toss.send.v3.ReceiverType;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PeriodicTransferPostParam extends SignatureRequest {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    public static final int $stable;
    public static final Companion Companion;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static long onWarmupCompleted;
    private long amount;
    private userDrivenScrollEnded certificateType;
    private String depositAccountNo;
    private int depositBankCode;
    private String depositName;
    private String depositPhone;
    private fromBundle depositType;
    private fromArray dueDateType;
    private boolean isEnableAlarm;
    private boolean isLastDayForDueDate;
    private boolean isRepeat;
    private boolean isUserNoTransfer;
    private String nextTransferDate;
    private Long receiverUserNo;
    private String reserveKey;
    private String sessionKey;
    private String targetType;
    private String title;
    private String transferDueDate;
    private String transferDueDay;
    private String transferEndDate;
    private String transferUniqueKey;
    private String type;
    private String uniqueId;
    private String userMemo;
    private String withdrawAccountNo;
    private int withdrawBankCode;

    private static final /* synthetic */ KSerializer onActivityLayout() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 83;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.transfer.TransferCertificateType", userDrivenScrollEnded.values());
        }
        updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.transfer.TransferCertificateType", userDrivenScrollEnded.values());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 111;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnActivityLayout = onActivityLayout();
        int i4 = onNavigationEvent + 79;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerOnActivityLayout;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 9;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnMessageChannelReady = onMessageChannelReady();
        int i4 = onExtraCallbackWithResult + 59;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnMessageChannelReady;
    }

    private static final /* synthetic */ KSerializer onMessageChannelReady() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 71;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.transfer.periodic.DueDateType", fromArray.values());
        }
        int i3 = 27 / 0;
        return updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.transfer.periodic.DueDateType", fromArray.values());
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 69;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.transfer.periodic.DepositType", fromBundle.values());
        }
        int i3 = 33 / 0;
        return updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.transfer.periodic.DepositType", fromBundle.values());
    }

    public static /* synthetic */ Object onNavigationEvent(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i5;
        int i9 = (~(i7 | i8)) | i6;
        int i10 = i5 | i7;
        int i11 = (~(i5 | i6)) | (~(i7 | (~i6) | i8)) | (~(i6 | i4));
        int i12 = i6 + i4 + i2 + (764943627 * i) + (189947931 * i3);
        int i13 = i12 * i12;
        int i14 = ((i6 * (-973936384)) - 801505280) + ((-973936384) * i4) + (1838296578 * i9) + (1228335359 * i10) + ((-1228335359) * i11) + (2092695552 * i2) + ((-1475084288) * i) + ((-1479278592) * i3) + ((-626393088) * i13);
        int i15 = (i6 * 1860537600) + 224780607 + (i4 * 1860537600) + (i9 * 1034) + (i10 * (-517)) + (i11 * 517) + (i2 * 1860538117) + (i * (-1861700041)) + (i3 * (-831392377)) + (i13 * 995229696);
        switch (i14 + (i15 * i15 * 1053163520)) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return onExtraCallbackWithResult(objArr);
            case 2:
                return onNavigationEvent(objArr);
            case 3:
                return onExtraCallback(objArr);
            case 4:
                return onWarmupCompleted(objArr);
            case 5:
                PeriodicTransferPostParam periodicTransferPostParam = (PeriodicTransferPostParam) objArr[0];
                fromBundle frombundle = (fromBundle) objArr[1];
                int i16 = 2 % 2;
                int i17 = onExtraCallbackWithResult + 27;
                int i18 = i17 % 128;
                onNavigationEvent = i18;
                int i19 = i17 % 2;
                periodicTransferPostParam.depositType = frombundle;
                int i20 = i18 + 41;
                onExtraCallbackWithResult = i20 % 128;
                int i21 = i20 % 2;
                return null;
            case 6:
                return asInterface(objArr);
            case 7:
                return onTransact(objArr);
            case 8:
                return IAuthTabCallbackStub(objArr);
            default:
                return IAuthTabCallback(objArr);
        }
    }

    public static /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        KSerializer kSerializer = (KSerializer) onNavigationEvent(new Object[0], WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1446410981, iIAuthTabCallback, 1446410983);
        int i4 = onNavigationEvent + 9;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializer;
    }

    public PeriodicTransferPostParam() {
    }

    public /* synthetic */ PeriodicTransferPostParam(int i, String str, String str2, String str3, boolean z, String str4, String str5, String str6, String str7, int i2, String str8, int i3, String str9, String str10, String str11, fromBundle frombundle, String str12, long j, fromArray fromarray, String str13, String str14, String str15, boolean z2, String str16, boolean z3, boolean z4, userDrivenScrollEnded userdrivenscrollended, boolean z5, Long l, String str17, String str18, String str19, okycx okycxVar) {
        long j2;
        super(i, str, str2, str3, z, okycxVar);
        if ((i & 16) == 0) {
            this.uniqueId = null;
        } else {
            this.uniqueId = str4;
        }
        if ((i & 32) == 0) {
            this.type = null;
        } else {
            this.type = str5;
        }
        if ((i & 64) == 0) {
            this.targetType = null;
        } else {
            this.targetType = str6;
        }
        if ((i & 128) == 0) {
            int i4 = onNavigationEvent + 9;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            this.title = null;
            if (i5 != 0) {
                throw null;
            }
        } else {
            this.title = str7;
        }
        if ((i & 256) == 0) {
            this.withdrawBankCode = 0;
        } else {
            this.withdrawBankCode = i2;
        }
        if ((i & 512) == 0) {
            this.withdrawAccountNo = null;
        } else {
            this.withdrawAccountNo = str8;
            int i6 = 2 % 2;
        }
        if ((i & 1024) == 0) {
            this.depositBankCode = 0;
        } else {
            this.depositBankCode = i3;
        }
        if ((i & 2048) == 0) {
            this.depositAccountNo = null;
        } else {
            this.depositAccountNo = str9;
        }
        if ((i & 4096) == 0) {
            int i7 = onExtraCallbackWithResult + 95;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            this.depositName = null;
            if (i8 == 0) {
                int i9 = 37 / 0;
            }
        } else {
            this.depositName = str10;
        }
        if ((i & 8192) == 0) {
            this.depositPhone = null;
        } else {
            this.depositPhone = str11;
        }
        if ((i & 16384) == 0) {
            int i10 = onExtraCallbackWithResult + 13;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
            this.depositType = null;
        } else {
            this.depositType = frombundle;
        }
        if ((32768 & i) == 0) {
            this.userMemo = null;
        } else {
            this.userMemo = str12;
        }
        if ((65536 & i) == 0) {
            int i12 = 2 % 2;
            j2 = 0;
        } else {
            j2 = j;
        }
        this.amount = j2;
        if ((131072 & i) == 0) {
            this.dueDateType = null;
        } else {
            this.dueDateType = fromarray;
        }
        if ((262144 & i) == 0) {
            this.transferDueDate = null;
            int i13 = onExtraCallbackWithResult + 27;
            onNavigationEvent = i13 % 128;
            int i14 = i13 % 2;
            int i15 = 2 % 2;
        } else {
            this.transferDueDate = str13;
        }
        if ((524288 & i) == 0) {
            this.transferDueDay = null;
            int i16 = onExtraCallbackWithResult + 119;
            onNavigationEvent = i16 % 128;
            if (i16 % 2 == 0) {
                int i17 = 5 % 4;
            } else {
                int i18 = 2 % 2;
            }
        } else {
            this.transferDueDay = str14;
        }
        if ((1048576 & i) == 0) {
            this.transferEndDate = null;
        } else {
            this.transferEndDate = str15;
        }
        if ((2097152 & i) == 0) {
            int i19 = onExtraCallbackWithResult + 45;
            onNavigationEvent = i19 % 128;
            int i20 = i19 % 2;
            this.isLastDayForDueDate = false;
        } else {
            this.isLastDayForDueDate = z2;
        }
        if ((4194304 & i) == 0) {
            this.nextTransferDate = null;
        } else {
            this.nextTransferDate = str16;
        }
        if ((8388608 & i) == 0) {
            this.isEnableAlarm = false;
        } else {
            this.isEnableAlarm = z3;
        }
        if ((16777216 & i) == 0) {
            this.isRepeat = false;
        } else {
            this.isRepeat = z4;
            int i21 = onExtraCallbackWithResult + 71;
            onNavigationEvent = i21 % 128;
            int i22 = i21 % 2;
            int i23 = 2 % 2;
        }
        if ((33554432 & i) == 0) {
            int i24 = onExtraCallbackWithResult + 27;
            onNavigationEvent = i24 % 128;
            int i25 = i24 % 2;
            this.certificateType = null;
            if (i25 == 0) {
                int i26 = 88 / 0;
            }
        } else {
            this.certificateType = userdrivenscrollended;
        }
        if ((67108864 & i) == 0) {
            this.isUserNoTransfer = false;
        } else {
            this.isUserNoTransfer = z5;
        }
        if ((134217728 & i) == 0) {
            int i27 = onExtraCallbackWithResult + 99;
            onNavigationEvent = i27 % 128;
            int i28 = i27 % 2;
            this.receiverUserNo = null;
        } else {
            this.receiverUserNo = l;
        }
        if ((268435456 & i) == 0) {
            int i29 = onNavigationEvent + 69;
            onExtraCallbackWithResult = i29 % 128;
            int i30 = i29 % 2;
            this.reserveKey = null;
        } else {
            this.reserveKey = str17;
        }
        if ((536870912 & i) == 0) {
            this.sessionKey = null;
        } else {
            this.sessionKey = str18;
        }
        if ((1073741824 & i) == 0) {
            this.transferUniqueKey = null;
        } else {
            this.transferUniqueKey = str19;
        }
    }

    public static final /* synthetic */ Lazy[] IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 83;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i3 + 99;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return lazyArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0187  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onExtraCallbackWithResult(viva.republica.toss.network.model.transfer.periodic.PeriodicTransferPostParam r12, o.vyl r13, kotlinx.serialization.descriptors.SerialDescriptor r14) {
        /*
            Method dump skipped, instructions count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.periodic.PeriodicTransferPostParam.onExtraCallbackWithResult(viva.republica.toss.network.model.transfer.periodic.PeriodicTransferPostParam, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public final void getInterfaceDescriptor(@Nullable String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 35;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        this.uniqueId = str;
        int i5 = i2 + 115;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        PeriodicTransferPostParam periodicTransferPostParam = (PeriodicTransferPostParam) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        periodicTransferPostParam.type = str;
        if (i3 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public final String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 77;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.type;
        int i5 = i3 + 81;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 38 / 0;
        }
        return str;
    }

    public final void asInterface(@Nullable String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        this.targetType = str;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 105;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void onTransact(@Nullable String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 5;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        this.title = str;
        int i5 = i3 + 123;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public final int ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 47;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        int i5 = this.withdrawBankCode;
        int i6 = i3 + 79;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final void onExtraCallbackWithResult(int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 47;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        this.withdrawBankCode = i;
        if (i4 == 0) {
            int i5 = 99 / 0;
        }
    }

    public final String extraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 121;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.withdrawAccountNo;
        int i5 = i2 + 71;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void extraCallback(@Nullable String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 125;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        this.withdrawAccountNo = str;
        int i5 = i3 + 11;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        PeriodicTransferPostParam periodicTransferPostParam = (PeriodicTransferPostParam) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 97;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int i4 = periodicTransferPostParam.depositBankCode;
        if (i3 != 0) {
            int i5 = 58 / 0;
        }
        return Integer.valueOf(i4);
    }

    public final void onWarmupCompleted(int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult;
        int i4 = i3 + 61;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        this.depositBankCode = i;
        int i6 = i3 + 109;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        PeriodicTransferPostParam periodicTransferPostParam = (PeriodicTransferPostParam) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 71;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        periodicTransferPostParam.depositAccountNo = str;
        int i5 = i2 + 23;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 30 / 0;
        }
        return null;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 67;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.depositAccountNo;
        int i5 = i3 + 107;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onWarmupCompleted(@Nullable String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 85;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        this.depositName = str;
        int i5 = i3 + 101;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void onExtraCallbackWithResult(@Nullable String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 103;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        this.depositPhone = str;
        int i5 = i3 + 91;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 5 / 0;
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        PeriodicTransferPostParam periodicTransferPostParam = (PeriodicTransferPostParam) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 117;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        fromBundle frombundle = periodicTransferPostParam.depositType;
        if (i3 != 0) {
            return frombundle;
        }
        throw null;
    }

    public final void ICustomTabsCallback(@Nullable String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 5;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        this.userMemo = str;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 91;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 66 / 0;
        }
    }

    public final void onWarmupCompleted(long j) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 91;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        this.amount = j;
        int i5 = i3 + 99;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        PeriodicTransferPostParam periodicTransferPostParam = (PeriodicTransferPostParam) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        fromArray fromarray = periodicTransferPostParam.dueDateType;
        if (i4 == 0) {
            int i5 = 17 / 0;
        }
        int i6 = i3 + 55;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return fromarray;
    }

    public final void onExtraCallbackWithResult(@Nullable fromArray fromarray) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 49;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        this.dueDateType = fromarray;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 83;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 94 / 0;
        }
    }

    public final void asBinder(@Nullable String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 105;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        this.transferDueDate = str;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void IAuthTabCallbackStubProxy(@Nullable String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 77;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        this.transferDueDay = str;
        int i5 = i3 + 95;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        PeriodicTransferPostParam periodicTransferPostParam = (PeriodicTransferPostParam) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 33;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        periodicTransferPostParam.transferEndDate = str;
        int i5 = i2 + 7;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public final void IAuthTabCallback(boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 37;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        this.isLastDayForDueDate = z;
        int i5 = i3 + 19;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final void onExtraCallback(@Nullable String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 3;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        this.nextTransferDate = str;
        if (i3 != 0) {
            throw null;
        }
    }

    public final void onExtraCallback(boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 77;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        this.isEnableAlarm = z;
        int i5 = i3 + 109;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void onExtraCallbackWithResult(boolean z) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 17;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        this.isRepeat = z;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 107;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 49 / 0;
        }
    }

    public final void onNavigationEvent(@Nullable userDrivenScrollEnded userdrivenscrollended) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 97;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        this.certificateType = userdrivenscrollended;
        if (i3 == 0) {
            throw null;
        }
    }

    public final void onWarmupCompleted(boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 51;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        this.isUserNoTransfer = z;
        int i5 = i2 + 61;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void onWarmupCompleted(@Nullable Long l) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 107;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        this.receiverUserNo = l;
        int i5 = i3 + 47;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        PeriodicTransferPostParam periodicTransferPostParam = (PeriodicTransferPostParam) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 3;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        periodicTransferPostParam.reserveKey = str;
        if (i3 == 0) {
            return null;
        }
        int i4 = 6 / 0;
        return null;
    }

    public final void IAuthTabCallbackDefault(@Nullable String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 117;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        this.sessionKey = str;
        int i5 = i2 + 63;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void access100(@Nullable String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 49;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        this.transferUniqueKey = str;
        int i5 = i3 + 31;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onWarmupCompleted ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $10 + 93;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onWarmupCompleted)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 45812), (ViewConfiguration.getLongPressTimeout() >> 16) + 84, 21233 - Color.green(0), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - View.combineMeasuredStates(0, 0)), KeyEvent.getDeadChar(0, 0) + 19, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 8809, 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        int i6 = $10 + 121;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean writeTypedObject() {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.periodic.PeriodicTransferPostParam.writeTypedObject():boolean");
    }

    public final MyAccountInfo onExtraCallback(@NotNull List<MyAccountInfo> list) {
        Object next;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 83;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        Iterator<T> it = list.iterator();
        int i4 = onExtraCallbackWithResult + 31;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            int i6 = onExtraCallbackWithResult + 101;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                next = it.next();
                MyAccountInfo myAccountInfo = (MyAccountInfo) next;
                int i7 = 74 / 0;
                if (hasCurrentActivity.IAuthTabCallback.onExtraCallbackWithResult(String.valueOf(myAccountInfo.IAuthTabCallbackStub()), myAccountInfo.onExtraCallback(), String.valueOf(this.withdrawBankCode), this.withdrawAccountNo)) {
                    break;
                }
            } else {
                next = it.next();
                MyAccountInfo myAccountInfo2 = (MyAccountInfo) next;
                if (hasCurrentActivity.IAuthTabCallback.onExtraCallbackWithResult(String.valueOf(myAccountInfo2.IAuthTabCallbackStub()), myAccountInfo2.onExtraCallback(), String.valueOf(this.withdrawBankCode), this.withdrawAccountNo)) {
                    break;
                }
            }
        }
        return (MyAccountInfo) next;
    }

    public final MyAccountInfo onNavigationEvent(@NotNull List<MyAccountInfo> list) {
        Object next;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 65;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            int i4 = onExtraCallbackWithResult + 55;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            next = it.next();
            MyAccountInfo myAccountInfo = (MyAccountInfo) next;
            if (hasCurrentActivity.IAuthTabCallback.onExtraCallbackWithResult(String.valueOf(myAccountInfo.IAuthTabCallbackStub()), myAccountInfo.onExtraCallback(), String.valueOf(this.depositBankCode), this.depositAccountNo)) {
                break;
            }
        }
        return (MyAccountInfo) next;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023 A[PHI: r1
      0x0023: PHI (r1v5 java.lang.String) = (r1v4 java.lang.String), (r1v6 java.lang.String) binds: [B:8:0x0021, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String IAuthTabCallback(@org.jetbrains.annotations.NotNull java.util.List<viva.republica.toss.network.model.transfer.MyAccountInfo> r4) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.transfer.periodic.PeriodicTransferPostParam.onNavigationEvent
            int r1 = r1 + 99
            int r2 = r1 % 128
            viva.republica.toss.network.model.transfer.periodic.PeriodicTransferPostParam.onExtraCallbackWithResult = r2
            int r1 = r1 % r0
            java.lang.String r2 = ""
            if (r1 == 0) goto L1c
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
            java.lang.String r1 = r3.type
            r2 = 70
            int r2 = r2 / 0
            if (r1 == 0) goto L3c
            goto L23
        L1c:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
            java.lang.String r1 = r3.type
            if (r1 == 0) goto L3c
        L23:
            o.makeNativeObject$IAuthTabCallback r2 = o.makeNativeObject.Companion
            o.makeNativeObject r2 = r2.onExtraCallbackWithResult(r1)
            if (r2 != 0) goto L3c
            int r4 = viva.republica.toss.network.model.transfer.periodic.PeriodicTransferPostParam.onExtraCallbackWithResult
            int r4 = r4 + 43
            int r2 = r4 % 128
            viva.republica.toss.network.model.transfer.periodic.PeriodicTransferPostParam.onNavigationEvent = r2
            int r4 = r4 % r0
            if (r4 == 0) goto L37
            return r1
        L37:
            r4 = 0
            r4.hashCode()
            throw r4
        L3c:
            o.makeNativeObject$IAuthTabCallback r0 = o.makeNativeObject.Companion
            o.makeNativeObject r4 = r0.onExtraCallbackWithResult(r3, r4)
            java.lang.String r4 = r4.getValue()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.periodic.PeriodicTransferPostParam.IAuthTabCallback(java.util.List):java.lang.String");
    }

    @Override // viva.republica.toss.network.model.SignatureRequest
    public String onNavigationEvent(@NotNull String str) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        JsonObject jsonObject = new JsonObject();
        String str2 = this.type;
        if (str2 == null) {
            str2 = "";
        }
        Object[] objArr = new Object[1];
        a(new char[]{14836, 14720, 59862, 50309, 39548, 49240, 47758, 15765}, (-1) - TextUtils.lastIndexOf("", '0', 0), objArr);
        jsonObject.addProperty(((String) objArr[0]).intern(), str2);
        String str3 = this.targetType;
        if (str3 != null) {
            int i2 = onNavigationEvent + 31;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            jsonObject.addProperty("targetType", str3);
        }
        String str4 = this.title;
        if (str4 == null) {
            str4 = "";
        }
        Object[] objArr2 = new Object[1];
        a(new char[]{61919, 61867, 10375, 1476, 17332, 6548, 48246, 15204, 17682}, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr2);
        jsonObject.addProperty(((String) objArr2[0]).intern(), str4);
        jsonObject.addProperty("withdrawBankCode", Integer.valueOf(this.withdrawBankCode));
        String str5 = this.withdrawAccountNo;
        if (str5 == null) {
            int i4 = onExtraCallbackWithResult + 47;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 39 / 0;
            }
            str5 = "";
        }
        jsonObject.addProperty("withdrawAccountNo", str5);
        String str6 = this.depositName;
        if (str6 == null) {
            int i6 = onExtraCallbackWithResult + 13;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 90 / 0;
            }
            str6 = "";
        }
        jsonObject.addProperty("depositName", str6);
        jsonObject.addProperty("depositBankCode", Integer.valueOf(this.depositBankCode));
        String str7 = this.depositAccountNo;
        if (str7 == null) {
            str7 = "";
        }
        jsonObject.addProperty("depositAccountNo", str7);
        String str8 = this.depositPhone;
        if (str8 == null) {
            str8 = "";
        }
        jsonObject.addProperty("depositPhone", str8);
        jsonObject.addProperty("amount", Long.valueOf(this.amount));
        String str9 = this.transferDueDate;
        if (str9 == null) {
            int i8 = onExtraCallbackWithResult + 103;
            int i9 = i8 % 128;
            onNavigationEvent = i9;
            int i10 = i8 % 2;
            int i11 = i9 + 7;
            onExtraCallbackWithResult = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 5 % 3;
            }
            str9 = "";
        }
        jsonObject.addProperty("transferDueDate", str9);
        String str10 = this.transferEndDate;
        if (str10 == null) {
            str10 = "";
        }
        jsonObject.addProperty("transferEndDueDate", str10);
        jsonObject.addProperty("date", str);
        String string = jsonObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static final class Companion {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        public static final /* synthetic */ class onNavigationEvent {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;
            public static final /* synthetic */ int[] $EnumSwitchMapping$2;
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            static {
                int[] iArr = new int[ReceiverType.values().length];
                try {
                    iArr[ReceiverType.SMS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ReceiverType.MEMBER.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ReceiverType.ACCOUNT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ReceiverType.MY_TOSS.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[PeriodicTransferPicker.IAuthTabCallback.values().length];
                try {
                    iArr2[PeriodicTransferPicker.IAuthTabCallback.MONTHLY.ordinal()] = 1;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[PeriodicTransferPicker.IAuthTabCallback.WEEKLY.ordinal()] = 2;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr2[PeriodicTransferPicker.IAuthTabCallback.DAILY.ordinal()] = 3;
                    int i = onWarmupCompleted + 15;
                    onNavigationEvent = i % 128;
                    if (i % 2 == 0) {
                        int i2 = 2 % 2;
                    }
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr2[PeriodicTransferPicker.IAuthTabCallback.ONE_TIME.ordinal()] = 4;
                } catch (NoSuchFieldError unused8) {
                }
                $EnumSwitchMapping$1 = iArr2;
                int[] iArr3 = new int[fromArray.values().length];
                try {
                    iArr3[fromArray.DAY.ordinal()] = 1;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr3[fromArray.DAY_OF_WEEK.ordinal()] = 2;
                    int i3 = 2 % 2;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr3[fromArray.DAILY.ordinal()] = 3;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr3[fromArray.ONE_TIME.ordinal()] = 4;
                    int i4 = onWarmupCompleted + 23;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    int i6 = 2 % 2;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr3[fromArray.DELAY.ordinal()] = 5;
                    int i7 = 2 % 2;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr3[fromArray.UNKNOWN.ordinal()] = 6;
                    int i8 = 2 % 2;
                } catch (NoSuchFieldError unused14) {
                }
                $EnumSwitchMapping$2 = iArr3;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PeriodicTransferPostParam> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 53;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            PeriodicTransferPostParam$.serializer serializerVar = PeriodicTransferPostParam$.serializer.INSTANCE;
            if (i3 == 0) {
                int i4 = 54 / 0;
            }
            return serializerVar;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:88:0x0228  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x022b  */
        /* JADX WARN: Removed duplicated region for block: B:93:0x023a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final viva.republica.toss.network.model.transfer.periodic.PeriodicTransferPostParam onNavigationEvent(@org.jetbrains.annotations.Nullable java.lang.Long r19, @org.jetbrains.annotations.Nullable viva.republica.toss.network.model.transfer.MyAccountInfo r20, @org.jetbrains.annotations.Nullable viva.republica.toss.send.v4.receiver.ReceiverParam r21, @org.jetbrains.annotations.Nullable o.moduleName r22, boolean r23, @org.jetbrains.annotations.Nullable java.util.Date r24, @org.jetbrains.annotations.Nullable java.lang.String r25, @org.jetbrains.annotations.Nullable java.lang.String r26, @org.jetbrains.annotations.Nullable java.lang.String r27, @org.jetbrains.annotations.Nullable java.lang.String r28, boolean r29, @org.jetbrains.annotations.NotNull java.util.List<viva.republica.toss.network.model.transfer.MyAccountInfo> r30) throws kotlin.NoWhenBranchMatchedException {
            /*
                Method dump skipped, instructions count: 776
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.periodic.PeriodicTransferPostParam.Companion.onNavigationEvent(java.lang.Long, viva.republica.toss.network.model.transfer.MyAccountInfo, viva.republica.toss.send.v4.receiver.ReceiverParam, o.moduleName, boolean, java.util.Date, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.util.List):viva.republica.toss.network.model.transfer.periodic.PeriodicTransferPostParam");
        }
    }

    static {
        readTypedObject();
        Companion = new Companion(null);
        $stable = 8;
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
        $childSerializers = new Lazy[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.transfer.periodic.PeriodicTransferPostParam$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 89;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    PeriodicTransferPostParam.onNavigationEvent();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                KSerializer kSerializerOnNavigationEvent = PeriodicTransferPostParam.onNavigationEvent();
                int i3 = onExtraCallbackWithResult + 113;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                return kSerializerOnNavigationEvent;
            }
        }), null, null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.transfer.periodic.PeriodicTransferPostParam$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 121;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnExtraCallbackWithResult = PeriodicTransferPostParam.onExtraCallbackWithResult();
                int i4 = IAuthTabCallback + 117;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return kSerializerOnExtraCallbackWithResult;
            }
        }), null, null, null, null, null, null, null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.transfer.periodic.PeriodicTransferPostParam$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 47;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnExtraCallback = PeriodicTransferPostParam.onExtraCallback();
                int i4 = IAuthTabCallback + 95;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return kSerializerOnExtraCallback;
            }
        }), null, null, null, null, null};
        int i = onExtraCallback + 27;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private static final /* synthetic */ KSerializer extraCallbackWithResult() {
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        return (KSerializer) onNavigationEvent(new Object[0], WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1446410981, iIAuthTabCallback, 1446410983);
    }

    public final int onTransact() {
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        return ((Integer) onNavigationEvent(new Object[]{this}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 874528015, iIAuthTabCallback, -874528015)).intValue();
    }

    public final fromBundle IAuthTabCallbackStub() {
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        return (fromBundle) onNavigationEvent(new Object[]{this}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 236145608, iIAuthTabCallback, -236145604);
    }

    public final fromArray asInterface() {
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        return (fromArray) onNavigationEvent(new Object[]{this}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1385584018, iIAuthTabCallback, 1385584026);
    }

    public final void IAuthTabCallback(@Nullable String str) {
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        onNavigationEvent(new Object[]{this, str}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1615634664, iIAuthTabCallback, -1615634657);
    }

    public final void IAuthTabCallback(@Nullable fromBundle frombundle) {
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        onNavigationEvent(new Object[]{this, frombundle}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 317825029, iIAuthTabCallback, -317825024);
    }

    public final void IAuthTabCallbackStub(@Nullable String str) {
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        onNavigationEvent(new Object[]{this, str}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1572267331, iIAuthTabCallback, 1572267334);
    }

    public final void access000(@Nullable String str) {
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        onNavigationEvent(new Object[]{this, str}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -593592865, iIAuthTabCallback, 593592871);
    }

    public final void IAuthTabCallback_Parcel(@Nullable String str) {
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        onNavigationEvent(new Object[]{this, str}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1921580702, iIAuthTabCallback, -1921580701);
    }

    static void readTypedObject() {
        onWarmupCompleted = 5698591562307425830L;
    }
}
