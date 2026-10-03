package o;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.horcrux.svg.SvgPackage;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.transfer.AbsTransferRequest;
import viva.republica.toss.network.model.transfer.DepositAccountHolder;
import viva.republica.toss.network.model.transfer.TransferAccountDto;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class startListeningToAnimatedNodeValuelambda6 extends AbsTransferRequest {
    public static final int $stable = 8;
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;

    @SerializedName("agreeNotifyReceiverForRcs")
    private Boolean agreeNotifyReceiverForRcs = Boolean.FALSE;

    @SerializedName("amount")
    private String amount;

    @SerializedName("authenticationId")
    private Long authenticationId;

    @SerializedName("certificateType")
    private userDrivenScrollEnded certificateType;

    @SerializedName("depositAccountHolder")
    private DepositAccountHolder depositAccountHolder;
    private transient String externalDoc;

    @SerializedName("fromName")
    private String fromName;

    @SerializedName("forceSend")
    private String isForceTransfer;

    @SerializedName("origin")
    private String origin;

    @SerializedName("otp")
    private String otp;

    @SerializedName("otpType")
    private String otpType;

    @SerializedName("receiveUserPhone")
    private String receiveUserPhone;

    @SerializedName("reserveKey")
    private String reserveKey;

    @SerializedName("sessionKey")
    private String sessionKey;

    @SerializedName("thirdPartyType")
    private Integer thirdPartyType;

    @SerializedName("toAccountNumber")
    private String toAccountNo;

    @SerializedName("bankCode")
    private String toBankCode;

    @SerializedName("transactionAuthKey")
    private String transactionAuthKey;

    @SerializedName("transferUniqueKey")
    private String transferUniqueKey;

    @SerializedName("withdrawAccount")
    private TransferAccountDto withdrawAccount;

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = (~(i7 | i4)) | i6;
        int i9 = i4 | i6 | i7;
        int i10 = i6 + i + i5 + (1159740906 * i3) + ((-617157175) * i2);
        int i11 = i10 * i10;
        int i12 = ((i6 * 934236018) - 2089811968) + (934236018 * i) + (i8 * (-953110385)) + ((-953110385) * i9) + (953110385 * i7) + ((-18874368) * i5) + (1488977920 * i3) + (2111832064 * i2) + (2070937600 * i11);
        int i13 = (i6 * (-824977050)) + 1921657099 + (i * (-824977050)) + (i8 * (-923)) + (i9 * (-923)) + (i7 * 923) + (i5 * (-824977973)) + (i3 * (-135083378)) + (i2 * 1125239651) + (i11 * 298844160);
        int i14 = i12 + (i13 * i13 * 2098200576);
        return i14 != 1 ? i14 != 2 ? onExtraCallbackWithResult(objArr) : onExtraCallback(objArr) : onNavigationEvent(objArr);
    }

    public final void IAuthTabCallbackStubProxy(@Nullable String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 29;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        this.toBankCode = str;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 67;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void access100(@Nullable String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 97;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        this.toAccountNo = str;
        int i5 = i3 + 119;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final void onWarmupCompleted(@Nullable String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        this.fromName = str;
        if (i4 == 0) {
            int i5 = 6 / 0;
        }
        int i6 = i3 + 43;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 35 / 0;
        }
    }

    public final void onExtraCallback(@Nullable DepositAccountHolder depositAccountHolder) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 31;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        this.depositAccountHolder = depositAccountHolder;
        int i5 = i2 + 71;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        startListeningToAnimatedNodeValuelambda6 startlisteningtoanimatednodevaluelambda6 = (startListeningToAnimatedNodeValuelambda6) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 121;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        startlisteningtoanimatednodevaluelambda6.amount = str;
        if (i4 != 0) {
            int i5 = 91 / 0;
        }
        int i6 = i3 + 27;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 53 / 0;
        }
        return null;
    }

    public final void onNavigationEvent(@Nullable TransferAccountDto transferAccountDto) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 75;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        this.withdrawAccount = transferAccountDto;
        if (i4 == 0) {
            int i5 = 67 / 0;
        }
        int i6 = i3 + 123;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public final void onExtraCallback(@Nullable String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 1;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        this.isForceTransfer = str;
        int i5 = i2 + 37;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final void IAuthTabCallbackStub(@Nullable String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 21;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        this.reserveKey = str;
        int i5 = i3 + 111;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final void IAuthTabCallbackDefault(@Nullable String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 101;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        this.otp = str;
        int i5 = i3 + 117;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void asInterface(@Nullable String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 123;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        this.otpType = str;
        int i5 = i3 + 9;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void onExtraCallbackWithResult(@Nullable Long l) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 97;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        this.authenticationId = l;
        if (i3 != 0) {
            throw null;
        }
    }

    public final void access000(@Nullable String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 3;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        this.transactionAuthKey = str;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 103;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        startListeningToAnimatedNodeValuelambda6 startlisteningtoanimatednodevaluelambda6 = (startListeningToAnimatedNodeValuelambda6) objArr[0];
        Integer num = (Integer) objArr[1];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 33;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        startlisteningtoanimatednodevaluelambda6.thirdPartyType = num;
        if (i3 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public final void onTransact(@Nullable String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 75;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        this.receiveUserPhone = str;
        int i5 = i2 + 3;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onWarmupCompleted(@Nullable Boolean bool) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        this.agreeNotifyReceiverForRcs = bool;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 53;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void onWarmupCompleted(@Nullable userDrivenScrollEnded userdrivenscrollended) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 23;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        this.certificateType = userdrivenscrollended;
        if (i3 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        startListeningToAnimatedNodeValuelambda6 startlisteningtoanimatednodevaluelambda6 = (startListeningToAnimatedNodeValuelambda6) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 57;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        startlisteningtoanimatednodevaluelambda6.origin = str;
        int i5 = i2 + 11;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public final void asBinder(@Nullable String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 13;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        this.sessionKey = str;
        int i5 = i2 + 87;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public final void getInterfaceDescriptor(@Nullable String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 125;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        this.transferUniqueKey = str;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 107;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // viva.republica.toss.network.model.SignatureRequest
    public String onNavigationEvent(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        onExtraCallback = i2 % 128;
        String strOnWarmupCompleted = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        String str2 = this.externalDoc;
        if (str2 != null) {
            return str2;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("bankCode", this.toBankCode);
        jsonObject.addProperty("toAccountNumber", this.toAccountNo);
        jsonObject.addProperty("fromName", this.fromName);
        jsonObject.addProperty("amount", this.amount);
        TransferAccountDto transferAccountDto = this.withdrawAccount;
        jsonObject.addProperty("withdrawBankCode", transferAccountDto != null ? Integer.valueOf(transferAccountDto.onExtraCallback()) : null);
        TransferAccountDto transferAccountDto2 = this.withdrawAccount;
        if (transferAccountDto2 != null) {
            strOnWarmupCompleted = transferAccountDto2.onWarmupCompleted();
            int i3 = onExtraCallback + 19;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
        }
        jsonObject.addProperty("withdrawAccountNo", strOnWarmupCompleted);
        jsonObject.addProperty("forceSend", this.isForceTransfer);
        jsonObject.addProperty("receiveUserPhone", this.receiveUserPhone);
        jsonObject.addProperty("agreeNotifyReceiverForRcs", this.agreeNotifyReceiverForRcs);
        jsonObject.addProperty("transactionAuthKey", this.transactionAuthKey);
        jsonObject.addProperty("date", str);
        jsonObject.addProperty("origin", this.origin);
        String string = jsonObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final void IAuthTabCallback(@Nullable String str) {
        int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = SvgPackage.21.onExtraCallbackWithResult();
        onExtraCallbackWithResult(-147647429, new Object[]{this, str}, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, 147647431);
    }

    public final void onExtraCallbackWithResult(@Nullable String str) {
        int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = SvgPackage.21.onExtraCallbackWithResult();
        onExtraCallbackWithResult(162821058, new Object[]{this, str}, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, -162821058);
    }

    public final void onWarmupCompleted(@Nullable Integer num) {
        int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = SvgPackage.21.onExtraCallbackWithResult();
        onExtraCallbackWithResult(-1667110212, new Object[]{this, num}, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, 1667110213);
    }
}
