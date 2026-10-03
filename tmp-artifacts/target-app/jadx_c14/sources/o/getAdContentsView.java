package o;

import im.toss.network.model.BaseApiResponse;
import java.util.List;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.teens.CvsCashBarcode;
import viva.republica.toss.network.model.teens.CvsCashBarcodeRequest;
import viva.republica.toss.network.model.teens.CvsCashBarcodeTypeRequest;
import viva.republica.toss.network.model.teens.CvsCashSignatureResponse;
import viva.republica.toss.network.model.teens.CvsCashTransactionFeeResponse;
import viva.republica.toss.network.model.teens.GuestTossUserRequest;
import viva.republica.toss.network.model.teens.TeensMinorChargingMethodResponse;
import viva.republica.toss.network.model.teens.UssBenefitTapPointResponse;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public interface getAdContentsView {
    @getIv8(onExtraCallback = "v3/teens-cash/cu/barcodes/{barcode}/signs")
    Object IAuthTabCallback(@getIvD(onNavigationEvent = "barcode") @NotNull String str, @getUserCertList @NotNull CvsCashBarcodeTypeRequest cvsCashBarcodeTypeRequest, @NotNull access13800<? super BaseApiResponse<CvsCashSignatureResponse>> access13800Var);

    @getIv8(onExtraCallback = "v3/teens-cash/cu/barcodes")
    Object IAuthTabCallback(@getUserCertList @NotNull CvsCashBarcodeRequest cvsCashBarcodeRequest, @NotNull access13800<? super BaseApiResponse<CvsCashBarcode>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/family/schools")
    @gf
    writeRaw<BaseApiResponse<ReactHost>> IAuthTabCallback();

    @getIv8(onExtraCallback = "v3/small-saving/saving-boxes/{savingBoxId}/withdraw")
    @gf
    writeRaw<BaseApiResponse<Object>> IAuthTabCallback(@getIvD(onNavigationEvent = "savingBoxId") long j, @getUserCertList @NotNull HeadlessJsTaskServiceExternalSyntheticLambda0 headlessJsTaskServiceExternalSyntheticLambda0);

    @getIv8(onExtraCallback = "v3/family/schools/meal/upload-urls")
    @gf
    writeRaw<BaseApiResponse<ReactFragment>> IAuthTabCallback(@getUserCertList @NotNull ReactApplication reactApplication);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/family/uss-home/virtual-account")
    @gf
    writeRaw<BaseApiResponse<ReactInstanceManagerExternalSyntheticLambda0>> IAuthTabCallbackStub();

    @getIv8(onExtraCallback = "v3/family/uss-home/toss-money/onboarding/send-me-allowance-template")
    @gf
    writeRaw<BaseApiResponse<ReactInstanceManagerExternalSyntheticLambda1>> asBinder();

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/family/uss-home/toss-money")
    @gf
    writeRaw<BaseApiResponse<ReactInstanceEventListener>> asInterface();

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/teens-cash/cu/fee")
    writeRaw<BaseApiResponse<CvsCashTransactionFeeResponse>> onExtraCallback();

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:DELETE"})
    @getIv8(onExtraCallback = "v3/small-saving/saving-boxes/{savingBoxId}")
    @gf
    writeRaw<BaseApiResponse<Object>> onExtraCallback(@getIvD(onNavigationEvent = "savingBoxId") long j);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:PUT"})
    @getIv8(onExtraCallback = "v3/teens-cash/cu/barcodes/{barcode}/signs/{signId}")
    Object onExtraCallbackWithResult(@getIvD(onNavigationEvent = "barcode") @NotNull String str, @getIvD(onNavigationEvent = "signId") long j, @getUserCertList @NotNull CvsCashBarcodeTypeRequest cvsCashBarcodeTypeRequest, @NotNull access13800<? super BaseApiResponse<Object>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/family/openbanking/restriction")
    @gf
    writeRaw<BaseApiResponse<HybridDataDestructor>> onExtraCallbackWithResult();

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/small-saving/saving-boxes/{savingBoxId}")
    @gf
    writeRaw<BaseApiResponse<ReactActivityDelegate>> onExtraCallbackWithResult(@getIvD(onNavigationEvent = "savingBoxId") long j);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:PUT"})
    @getIv8(onExtraCallback = "v3/teens-cash/gs/barcodes/{barcode}/signs/{signId}")
    Object onNavigationEvent(@getIvD(onNavigationEvent = "barcode") @NotNull String str, @getIvD(onNavigationEvent = "signId") long j, @getUserCertList @NotNull CvsCashBarcodeTypeRequest cvsCashBarcodeTypeRequest, @NotNull access13800<? super BaseApiResponse<Object>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/family/guardian-home/minor-charging-methods")
    Object onNavigationEvent(@getKey4(onNavigationEvent = "minorToken") @NotNull String str, @NotNull access13800<? super BaseApiResponse<TeensMinorChargingMethodResponse>> access13800Var);

    @getIv8(onExtraCallback = "v3/family/uss-home/user-no")
    @gf
    Object onNavigationEvent(@getUserCertList @NotNull ReactPackage reactPackage, @NotNull access13800<? super BaseApiResponse<ReactInstanceManagerExternalSyntheticLambda5>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/family/guardians/guardians")
    @gf
    Object onNavigationEvent(@NotNull access13800<? super BaseApiResponse<List<drop>>> access13800Var);

    @getIv8(onExtraCallback = "v3/teens-cash/gs/barcodes")
    Object onNavigationEvent(@getUserCertList @NotNull CvsCashBarcodeRequest cvsCashBarcodeRequest, @NotNull access13800<? super BaseApiResponse<CvsCashBarcode>> access13800Var);

    @getIv8(onExtraCallback = "v3/family/guest/guest-params-logging")
    Object onNavigationEvent(@getUserCertList @NotNull GuestTossUserRequest guestTossUserRequest, @NotNull access13800<? super BaseApiResponse<Unit>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/teens-cash/gs/fee")
    writeRaw<BaseApiResponse<CvsCashTransactionFeeResponse>> onNavigationEvent();

    @getIv8(onExtraCallback = "v3/small-saving/saving-boxes/{savingBoxId}/deposit")
    @gf
    writeRaw<BaseApiResponse<Object>> onNavigationEvent(@getIvD(onNavigationEvent = "savingBoxId") long j, @getUserCertList @NotNull HeadlessJsTaskServiceExternalSyntheticLambda0 headlessJsTaskServiceExternalSyntheticLambda0);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/teens-cash/gs/barcodes/{barcode}")
    writeRaw<BaseApiResponse<CvsCashBarcode>> onNavigationEvent(@getIvD(onNavigationEvent = "barcode") @NotNull String str, @getKey4(onNavigationEvent = "type") @NotNull DestructorThreadDestructor destructorThreadDestructor);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/family/schools/meal/tables")
    @gf
    writeRaw<BaseApiResponse<ReactDelegate>> onNavigationEvent(@getUserCertList @NotNull ReactAndroidHWInputDeviceHelperCompanion reactAndroidHWInputDeviceHelperCompanion);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/family/increase-teens-limit/check")
    @gf
    writeRaw<BaseApiResponse<ReactFragmentCompanion>> onTransact();

    @getIv8(onExtraCallback = "v3/teens-cash/gs/barcodes/{barcode}/signs")
    Object onWarmupCompleted(@getIvD(onNavigationEvent = "barcode") @NotNull String str, @getUserCertList @NotNull CvsCashBarcodeTypeRequest cvsCashBarcodeTypeRequest, @NotNull access13800<? super BaseApiResponse<CvsCashSignatureResponse>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/family/benefit-tab/toss-point")
    Object onWarmupCompleted(@NotNull access13800<? super BaseApiResponse<UssBenefitTapPointResponse>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/small-saving/saving-boxes")
    @gf
    writeRaw<BaseApiResponse<ReactAndroidHWInputDeviceHelper>> onWarmupCompleted();

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/teens-cash/cu/barcodes/{barcode}")
    writeRaw<BaseApiResponse<CvsCashBarcode>> onWarmupCompleted(@getIvD(onNavigationEvent = "barcode") @NotNull String str, @getKey4(onNavigationEvent = "type") @NotNull DestructorThreadDestructor destructorThreadDestructor);

    @getIv8(onExtraCallback = "v3/small-saving/saving-boxes")
    @gf
    writeRaw<BaseApiResponse<ReactActivityDelegateExternalSyntheticLambda1>> onWarmupCompleted(@getUserCertList @NotNull HeadlessJsTaskServiceExternalSyntheticLambda0 headlessJsTaskServiceExternalSyntheticLambda0);

    @getIv8(onExtraCallback = "v3/family/schools")
    @gf
    writeRaw<BaseApiResponse<Object>> onWarmupCompleted(@getUserCertList @NotNull ReactActivityDelegateExternalSyntheticLambda0 reactActivityDelegateExternalSyntheticLambda0);

    @getIv8(onExtraCallback = "v3/family/schools/meal/tables")
    @gf
    writeRaw<BaseApiResponse<Object>> onWarmupCompleted(@getUserCertList @NotNull ReactDelegateExternalSyntheticLambda0 reactDelegateExternalSyntheticLambda0);
}
