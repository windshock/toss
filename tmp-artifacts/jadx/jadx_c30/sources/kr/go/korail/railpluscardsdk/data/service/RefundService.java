package kr.go.korail.railpluscardsdk.data.service;

import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kr.go.korail.railpluscardsdk.data.exceptions.RefundCardException;
import kr.go.korail.railpluscardsdk.data.model.ResponseWithDate;
import kr.go.korail.railpluscardsdk.data.model.dto.result.RefundResult;
import kr.go.korail.railpluscardsdk.data.model.mappers.RefundMapper;
import net.sf.scuba.smartcards.BuildConfig;
import o.AdSlotBuilder;
import o.ApmHelper;
import o.access13800;
import o.access14300;
import o.getBidAdm;
import o.getCacheScene;
import o.getCodeId;
import o.getExt;
import o.getImgAcceptedWidth;
import o.getIsRotateBanner;
import o.getMediaExtra;
import o.getRewardAmount;
import o.getUserID;
import o.isAutoPlay;
import o.setBannerType;
import o.setExpressViewAccepted;
import o.setImageAcceptedSize;
import o.setIsRotateBanner;
import o.setMediaExtra;
import o.setNativeAdType;
import o.setRequestExtraMap;
import o.setRewardAmount;
import o.setUserData;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class RefundService implements setRequestExtraMap<RefundResult> {
    private int IAuthTabCallback;
    private ResponseWithDate<setExpressViewAccepted> IAuthTabCallbackDefault;
    private boolean IAuthTabCallbackStub;
    private final int IAuthTabCallbackStubProxy;
    private final String IAuthTabCallback_Parcel;
    private final String access000;
    private AdSlotBuilder asBinder;
    private final String asInterface;
    private setBannerType getInterfaceDescriptor;
    private int onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final setImageAcceptedSize onNavigationEvent;
    private final getRewardAmount onTransact;
    private getUserID onWarmupCompleted;

    private final RefundResult IAuthTabCallback() {
        getUserID getuserid = this.onWarmupCompleted;
        AdSlotBuilder adSlotBuilder = null;
        if (getuserid == null) {
            Intrinsics.throwUninitializedPropertyAccessException(BuildConfig.FLAVOR);
            getuserid = null;
        }
        String strOnExtraCallbackWithResult = getuserid.onExtraCallbackWithResult();
        AdSlotBuilder adSlotBuilder2 = this.asBinder;
        if (adSlotBuilder2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(BuildConfig.FLAVOR);
        } else {
            adSlotBuilder = adSlotBuilder2;
        }
        return new RefundResult(strOnExtraCallbackWithResult, Integer.parseInt(adSlotBuilder.onWarmupCompleted(), CharsKt.IAuthTabCallback(16)), this.onExtraCallback, this.IAuthTabCallback, this.IAuthTabCallbackStubProxy, this.IAuthTabCallbackStub);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: o.getBidAdm */
    private final void asInterface() throws getBidAdm {
        if (this.IAuthTabCallbackStubProxy % 10 != 0) {
            throw new getBidAdm(getImgAcceptedWidth.VALIDATION_ERROR, "1원 단위 지불환불은 불가능합니다.", (Exception) null, 4, (DefaultConstructorMarker) null);
        }
        getUserID getuseridOnWarmupCompleted = onNavigationEvent().onWarmupCompleted();
        this.onWarmupCompleted = getuseridOnWarmupCompleted;
        if (this.onExtraCallbackWithResult != null) {
            if (getuseridOnWarmupCompleted == null) {
                Intrinsics.throwUninitializedPropertyAccessException(BuildConfig.FLAVOR);
                getuseridOnWarmupCompleted = null;
            }
            if (!Intrinsics.areEqual(getuseridOnWarmupCompleted.onExtraCallbackWithResult(), this.onExtraCallbackWithResult)) {
                throw new getBidAdm(getImgAcceptedWidth.VALIDATION_CARD_MISMATCH, "카드번호가 일치하지 않습니다.", (Exception) null, 4, (DefaultConstructorMarker) null);
            }
        }
        int iOnExtraCallbackWithResult = onNavigationEvent().onExtraCallbackWithResult();
        this.onExtraCallback = iOnExtraCallbackWithResult;
        this.IAuthTabCallback = iOnExtraCallbackWithResult;
        if (iOnExtraCallbackWithResult - this.IAuthTabCallbackStubProxy < 0) {
            throw new getBidAdm(getImgAcceptedWidth.VALIDATION_ERROR, "지불환불 후 잔액이 0원 보다 작을 수 없습니다.", (Exception) null, 4, (DefaultConstructorMarker) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: o.getBidAdm */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onExtraCallback(AdSlotBuilder adSlotBuilder, setExpressViewAccepted setexpressviewaccepted, setBannerType setbannertype, access13800<? super Unit> access13800Var) throws getBidAdm, getCacheScene {
        RefundService$creditPSAM$1 refundService$creditPSAM$1;
        if (access13800Var instanceof RefundService$creditPSAM$1) {
            refundService$creditPSAM$1 = (RefundService$creditPSAM$1) access13800Var;
            int i = refundService$creditPSAM$1.label;
            if ((i & PKIFailureInfo.systemUnavail) != 0) {
                refundService$creditPSAM$1.label = i + PKIFailureInfo.systemUnavail;
            } else {
                refundService$creditPSAM$1 = new RefundService$creditPSAM$1(this, access13800Var);
            }
        }
        Object objOnWarmupCompleted = refundService$creditPSAM$1.result;
        Object objOnWarmupCompleted2 = access14300.onWarmupCompleted();
        int i2 = refundService$creditPSAM$1.label;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(objOnWarmupCompleted);
            RefundMapper refundMapper = RefundMapper.onExtraCallback;
            String strIAuthTabCallback = setRewardAmount.IAuthTabCallback(this.IAuthTabCallbackStubProxy);
            Intrinsics.checkNotNullExpressionValue(strIAuthTabCallback, BuildConfig.FLAVOR);
            isAutoPlay isautoplayIAuthTabCallback = refundMapper.IAuthTabCallback(adSlotBuilder, setexpressviewaccepted, strIAuthTabCallback, setbannertype.onExtraCallback(), this.access000, this.asInterface, setexpressviewaccepted.onWarmupCompleted(), BuildConfig.FLAVOR, BuildConfig.FLAVOR);
            setMediaExtra setmediaextraOnExtraCallback = onExtraCallbackWithResult().onExtraCallback();
            refundService$creditPSAM$1.label = 1;
            objOnWarmupCompleted = setmediaextraOnExtraCallback.onWarmupCompleted(isautoplayIAuthTabCallback, refundService$creditPSAM$1);
            if (objOnWarmupCompleted == objOnWarmupCompleted2) {
                return objOnWarmupCompleted2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(objOnWarmupCompleted);
        }
        setNativeAdType.onExtraCallbackWithResult onextracallbackwithresult = (setNativeAdType) objOnWarmupCompleted;
        if (onextracallbackwithresult instanceof setNativeAdType.IAuthTabCallback) {
            throw new getCacheScene(getImgAcceptedWidth.REFUND_CREDIT_PSAM, "Credit Refund PSAM error " + onextracallbackwithresult);
        }
        if (onextracallbackwithresult instanceof setNativeAdType.onExtraCallbackWithResult) {
            setNativeAdType.onExtraCallbackWithResult onextracallbackwithresult2 = onextracallbackwithresult;
            if (!((setUserData) ((getCodeId) onextracallbackwithresult2.onWarmupCompleted()).onWarmupCompleted()).onWarmupCompleted().equals("00")) {
                throw new getBidAdm(getImgAcceptedWidth.REFUND_CREDIT_PSAM, "Credit Refund PSAM error " + onextracallbackwithresult2.onWarmupCompleted(), (Exception) null, 4, (DefaultConstructorMarker) null);
            }
        }
        return Unit.INSTANCE;
    }

    private final void onExtraCallback() {
        ApmHelper.onNavigationEvent("check Final Balance", new Object[0]);
        int iOnExtraCallbackWithResult = onNavigationEvent().onExtraCallbackWithResult();
        this.IAuthTabCallback = iOnExtraCallbackWithResult;
        if (iOnExtraCallbackWithResult != this.onExtraCallback - this.IAuthTabCallbackStubProxy) {
            ApmHelper.IAuthTabCallback("환불 후 잔액이 일치하지 않습니다.  before (" + this.onExtraCallback + "), after (" + this.IAuthTabCallback + ')');
            this.IAuthTabCallbackStub = false;
        }
    }

    private final setBannerType onExtraCallbackWithResult(ResponseWithDate<setExpressViewAccepted> responseWithDate) {
        return onNavigationEvent().IAuthTabCallback(responseWithDate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: o.getBidAdm */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onNavigationEvent(AdSlotBuilder adSlotBuilder, access13800<? super ResponseWithDate<setExpressViewAccepted>> access13800Var) throws getExt, NoWhenBranchMatchedException, getBidAdm {
        RefundService$initPSAM$1 refundService$initPSAM$1;
        RefundService refundService;
        AdSlotBuilder adSlotBuilder2;
        if (access13800Var instanceof RefundService$initPSAM$1) {
            refundService$initPSAM$1 = (RefundService$initPSAM$1) access13800Var;
            int i = refundService$initPSAM$1.label;
            if ((i & PKIFailureInfo.systemUnavail) != 0) {
                refundService$initPSAM$1.label = i + PKIFailureInfo.systemUnavail;
            } else {
                refundService$initPSAM$1 = new RefundService$initPSAM$1(this, access13800Var);
            }
        }
        Object objOnExtraCallback = refundService$initPSAM$1.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i2 = refundService$initPSAM$1.label;
        try {
            if (i2 == 0) {
                ResultKt.onNavigationEvent(objOnExtraCallback);
                RefundMapper refundMapper = RefundMapper.onExtraCallback;
                String strIAuthTabCallback = setRewardAmount.IAuthTabCallback(this.IAuthTabCallbackStubProxy);
                getUserID getuserid = this.onWarmupCompleted;
                getUserID getuserid2 = null;
                if (getuserid == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(BuildConfig.FLAVOR);
                    getuserid = null;
                }
                String strOnNavigationEvent = getuserid.onNavigationEvent();
                getUserID getuserid3 = this.onWarmupCompleted;
                if (getuserid3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(BuildConfig.FLAVOR);
                } else {
                    getuserid2 = getuserid3;
                }
                String strIAuthTabCallback2 = getuserid2.IAuthTabCallback();
                String str = this.asInterface;
                String str2 = this.IAuthTabCallback_Parcel;
                String str3 = this.access000;
                Intrinsics.checkNotNullExpressionValue(strIAuthTabCallback, BuildConfig.FLAVOR);
                setIsRotateBanner setisrotatebannerOnExtraCallback = refundMapper.onExtraCallback(adSlotBuilder, strIAuthTabCallback, "072121 ", strIAuthTabCallback2, str, strOnNavigationEvent, str2, str3);
                ApmHelper.onNavigationEvent("initPSAM Request : " + setisrotatebannerOnExtraCallback, new Object[0]);
                setMediaExtra setmediaextraOnExtraCallback = onExtraCallbackWithResult().onExtraCallback();
                refundService$initPSAM$1.L$0 = this;
                refundService$initPSAM$1.L$1 = adSlotBuilder;
                refundService$initPSAM$1.label = 1;
                objOnExtraCallback = setmediaextraOnExtraCallback.onExtraCallback(setisrotatebannerOnExtraCallback, refundService$initPSAM$1);
                if (objOnExtraCallback == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
                refundService = this;
                adSlotBuilder2 = adSlotBuilder;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AdSlotBuilder adSlotBuilder3 = (AdSlotBuilder) refundService$initPSAM$1.L$1;
                refundService = (RefundService) refundService$initPSAM$1.L$0;
                ResultKt.onNavigationEvent(objOnExtraCallback);
                adSlotBuilder2 = adSlotBuilder3;
            }
            setNativeAdType.onExtraCallbackWithResult onextracallbackwithresult = (setNativeAdType) objOnExtraCallback;
            if (onextracallbackwithresult instanceof setNativeAdType.IAuthTabCallback) {
                throw new getExt(getImgAcceptedWidth.REFUND_INIT_PSAM, "Initialize Refund PSAM error");
            }
            if (!(onextracallbackwithresult instanceof setNativeAdType.onExtraCallbackWithResult)) {
                throw new NoWhenBranchMatchedException();
            }
            ResponseWithDate responseWithDateOnExtraCallback = getIsRotateBanner.onExtraCallback((getCodeId) onextracallbackwithresult.onWarmupCompleted());
            ApmHelper.onNavigationEvent("card_ST_CODE " + ((setExpressViewAccepted) responseWithDateOnExtraCallback.IAuthTabCallback()).onWarmupCompleted() + "  resp_CODE " + ((setExpressViewAccepted) responseWithDateOnExtraCallback.IAuthTabCallback()).onExtraCallback() + "  NT_PSAM " + ((setExpressViewAccepted) responseWithDateOnExtraCallback.IAuthTabCallback()).onNavigationEvent(), new Object[0]);
            if (!((setExpressViewAccepted) responseWithDateOnExtraCallback.IAuthTabCallback()).onExtraCallback().equals("00")) {
                ApmHelper.onNavigationEvent("Refund J2 Error, card_ST_CODE " + ((setExpressViewAccepted) responseWithDateOnExtraCallback.IAuthTabCallback()).onExtraCallback(), new Object[0]);
                RefundMapper refundMapper2 = RefundMapper.onExtraCallback;
                setExpressViewAccepted setexpressviewaccepted = (setExpressViewAccepted) responseWithDateOnExtraCallback.IAuthTabCallback();
                String strIAuthTabCallback3 = setRewardAmount.IAuthTabCallback(refundService.IAuthTabCallbackStubProxy);
                Intrinsics.checkNotNullExpressionValue(strIAuthTabCallback3, BuildConfig.FLAVOR);
                refundMapper2.IAuthTabCallback(adSlotBuilder2, setexpressviewaccepted, strIAuthTabCallback3, "00000000", refundService.access000, refundService.asInterface, (448 & 64) != 0 ? BuildConfig.FLAVOR : null, (448 & 128) != 0 ? BuildConfig.FLAVOR : null, (448 & 256) != 0 ? BuildConfig.FLAVOR : null);
            }
            return responseWithDateOnExtraCallback;
        } catch (Exception unused) {
            throw new getBidAdm(getImgAcceptedWidth.REFUND_INIT_PSAM, "Initialize Refund PSAM error", (Exception) null, 4, (DefaultConstructorMarker) null);
        }
    }

    private final AdSlotBuilder onWarmupCompleted() {
        return onNavigationEvent().onWarmupCompleted(this.IAuthTabCallbackStubProxy);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onExtraCallback(access13800<? super RefundResult> access13800Var) throws getExt, NoWhenBranchMatchedException, getBidAdm {
        RefundService$doProcess$1 refundService$doProcess$1;
        RefundService refundService;
        RefundService refundService2;
        RefundService refundService3;
        if (access13800Var instanceof RefundService$doProcess$1) {
            refundService$doProcess$1 = (RefundService$doProcess$1) access13800Var;
            int i = refundService$doProcess$1.label;
            if ((i & PKIFailureInfo.systemUnavail) != 0) {
                refundService$doProcess$1.label = i + PKIFailureInfo.systemUnavail;
            } else {
                refundService$doProcess$1 = new RefundService$doProcess$1(this, access13800Var);
            }
        }
        Object objOnNavigationEvent = refundService$doProcess$1.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i2 = refundService$doProcess$1.label;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(objOnNavigationEvent);
            asInterface();
            this.asBinder = onWarmupCompleted();
            StringBuilder sb = new StringBuilder("init Card Response : ");
            AdSlotBuilder adSlotBuilder = this.asBinder;
            if (adSlotBuilder == null) {
                Intrinsics.throwUninitializedPropertyAccessException(BuildConfig.FLAVOR);
                adSlotBuilder = null;
            }
            sb.append(adSlotBuilder);
            ApmHelper.onNavigationEvent(sb.toString(), new Object[0]);
            AdSlotBuilder adSlotBuilder2 = this.asBinder;
            if (adSlotBuilder2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(BuildConfig.FLAVOR);
                adSlotBuilder2 = null;
            }
            refundService$doProcess$1.L$0 = this;
            refundService$doProcess$1.L$1 = this;
            refundService$doProcess$1.label = 1;
            objOnNavigationEvent = onNavigationEvent(adSlotBuilder2, refundService$doProcess$1);
            if (objOnNavigationEvent != objOnWarmupCompleted) {
                refundService = this;
                refundService2 = refundService;
            }
            return objOnWarmupCompleted;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            refundService3 = (RefundService) refundService$doProcess$1.L$0;
            ResultKt.onNavigationEvent(objOnNavigationEvent);
            refundService3.onExtraCallback();
            return refundService3.IAuthTabCallback();
        }
        refundService = (RefundService) refundService$doProcess$1.L$1;
        refundService2 = (RefundService) refundService$doProcess$1.L$0;
        ResultKt.onNavigationEvent(objOnNavigationEvent);
        refundService.IAuthTabCallbackDefault = (ResponseWithDate) objOnNavigationEvent;
        ResponseWithDate<setExpressViewAccepted> responseWithDate = refundService2.IAuthTabCallbackDefault;
        if (responseWithDate == null) {
            Intrinsics.throwUninitializedPropertyAccessException(BuildConfig.FLAVOR);
            responseWithDate = null;
        }
        refundService2.getInterfaceDescriptor = refundService2.onExtraCallbackWithResult(responseWithDate);
        AdSlotBuilder adSlotBuilder3 = refundService2.asBinder;
        if (adSlotBuilder3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(BuildConfig.FLAVOR);
            adSlotBuilder3 = null;
        }
        ResponseWithDate<setExpressViewAccepted> responseWithDate2 = refundService2.IAuthTabCallbackDefault;
        if (responseWithDate2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(BuildConfig.FLAVOR);
            responseWithDate2 = null;
        }
        setExpressViewAccepted setexpressviewaccepted = (setExpressViewAccepted) responseWithDate2.IAuthTabCallback();
        setBannerType setbannertype = refundService2.getInterfaceDescriptor;
        if (setbannertype == null) {
            Intrinsics.throwUninitializedPropertyAccessException(BuildConfig.FLAVOR);
            setbannertype = null;
        }
        refundService$doProcess$1.L$0 = refundService2;
        refundService$doProcess$1.L$1 = null;
        refundService$doProcess$1.label = 2;
        if (refundService2.onExtraCallback(adSlotBuilder3, setexpressviewaccepted, setbannertype, (access13800<? super Unit>) refundService$doProcess$1) != objOnWarmupCompleted) {
            refundService3 = refundService2;
            refundService3.onExtraCallback();
            return refundService3.IAuthTabCallback();
        }
        return objOnWarmupCompleted;
    }

    public getMediaExtra<RefundResult> onExtraCallback(Exception exc) {
        Intrinsics.checkNotNullParameter(exc, BuildConfig.FLAVOR);
        if (exc instanceof RefundCardException) {
            RefundCardException refundCardException = (RefundCardException) exc;
            return onWarmupCompleted(refundCardException.onExtraCallback(), refundCardException.getMessage(), IAuthTabCallback(), null);
        }
        return setRequestExtraMap.IAuthTabCallback.onExtraCallback(this, (getImgAcceptedWidth) null, "Unexpected error\n" + exc.getMessage(), IAuthTabCallback(), (String) null, 1, (Object) null);
    }

    public Object onExtraCallbackWithResult(access13800<? super Unit> access13800Var) {
        return setRequestExtraMap.IAuthTabCallback.onNavigationEvent(this, access13800Var);
    }

    public setImageAcceptedSize onExtraCallbackWithResult() {
        return this.onNavigationEvent;
    }

    public getRewardAmount onNavigationEvent() {
        return this.onTransact;
    }

    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public getMediaExtra<RefundResult> onWarmupCompleted(getImgAcceptedWidth getimgacceptedwidth, String str, RefundResult refundResult, String str2) {
        return setRequestExtraMap.IAuthTabCallback.onExtraCallback(this, getimgacceptedwidth, str, refundResult, str2);
    }

    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public getMediaExtra<RefundResult> IAuthTabCallback(RefundResult refundResult) {
        return setRequestExtraMap.IAuthTabCallback.onWarmupCompleted(this, refundResult);
    }
}
