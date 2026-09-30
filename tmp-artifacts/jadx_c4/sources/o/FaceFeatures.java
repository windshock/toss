package o;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.common.web.message.handlers.GetTelephonyInfoHandler;
import viva.republica.toss.common.web.message.handlers.GetTermsStatesHandler;
import viva.republica.toss.common.web.message.handlers.RefreshAccountsMessageHandler;
import viva.republica.toss.common.web.message.handlers.RefreshExternalBankAccountsHandler;
import viva.republica.toss.common.web.message.handlers.RefreshHomeFailoverStateHandler;
import viva.republica.toss.common.web.message.handlers.RefreshTermsStatesHandler;
import viva.republica.toss.common.web.message.handlers.RefreshTubaVarsHandler;
import viva.republica.toss.common.web.message.handlers.RefreshWebViewHandler;
import viva.republica.toss.common.web.message.handlers.RegisterSmsReceiverForSixDigitsHandler;
import viva.republica.toss.common.web.message.handlers.ReportNetworkUsageHandler;
import viva.republica.toss.common.web.message.handlers.RequestCalendarWritablePermissionHandler;
import viva.republica.toss.common.web.message.handlers.RequestCameraPermissionHandler;
import viva.republica.toss.common.web.message.handlers.RequestDisallowInterceptTouchEventHandler;
import viva.republica.toss.common.web.message.handlers.RequestGeolocationPermissionHandler;
import viva.republica.toss.common.web.message.handlers.RequestIdCardOcrHandler;
import viva.republica.toss.common.web.message.handlers.RequestOverlayPermissionHandler;
import viva.republica.toss.common.web.message.handlers.RequestPassportOcrHandler;
import viva.republica.toss.common.web.message.handlers.RequestPedometerPermissionHandler;
import viva.republica.toss.common.web.message.handlers.RequestPhonePermissionHandler;
import viva.republica.toss.common.web.message.handlers.RequestSelfieHandler;
import viva.republica.toss.common.web.message.handlers.RequestServiceEnterAuthHandler;
import viva.republica.toss.common.web.message.handlers.ReturnAuthCsResultHandler;
import viva.republica.toss.common.web.message.handlers.cascraping.RevokeScrapingHandler;
import viva.republica.toss.common.web.message.handlers.edoc.RegisterGov24Handler;
import viva.republica.toss.common.web.message.handlers.pedometer.RequestPedometerSyncHandler;
import viva.republica.toss.common.web.message.handlers.pension.RegisterPensionNotificationHandler;
import viva.republica.toss.common.web.message.shared.SetScreenAwakeModeHandler;
import viva.republica.toss.inappupdate.RequestInAppUpdateHandler;
import viva.republica.toss.tosscert.handlers.RenewTossCertHandler;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class FaceFeatures implements ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1 {
    private final Map<String, Class<? extends drawTextBox>> IAuthTabCallback;
    private final Map<Class<? extends drawTextBox>, List<String>> onExtraCallback;
    private final int onNavigationEvent;
    private static final byte[] $$a = {77, -64, 102, Byte.MIN_VALUE};
    private static final int $$b = 212;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int access100 = 1;
    private static char[] onWarmupCompleted = {32436, 32417, 32422, 32478, 32399, 32472, 32442, 32426, 32475, 32424, 32423, 32425, 32428, 32474, 32420, 32473, 32479, 32392, 32404, 32429, 32427, 32389, 32416, 32395, 32418, 32443, 32391, 32394, 32446, 32397, 32390, 32441, 32476, 32421, 32393};
    private static int onExtraCallbackWithResult = -1184333995;
    private static boolean asBinder = true;
    private static boolean onTransact = true;
    private static char[] IAuthTabCallbackDefault = {34612, 51376, 6188, 27033, 47360, 2767, 23161, 43999, 64321, 19252, 40096, 60416, 15751, 36184, 57066, 11857, 32744, 53086, 7996, 24760, 45079, 397, 20836, 41675, 62033, 17345, 37811, 58158, 13462, 33792, 60838, 41534, 29371, 780, 54157, 24684, 12538, 49521, 37315, 8624, 63011, 34461, 22305, 59362, 46194, 17629, 5441, 42437, 30126, 2592, 55963, 27406, 15338, 51300, 39123, 10573, 58064, 44372, 32202, 3194, 56549, 28443, 16316, 52793, 40622, 11975, 63825, 35317, 22610, 59541, 47893, 19377, 6688, 43684, 60832, 41524, 29369, 778, 54186, 24702, 12512, 49494, 37374, 8630, 63011, 34453, 22323, 59332, 46179, 17627, 5495, 42463, 30133, 2599, 55965, 27455, 15319, 51267, 60832, 41524, 29369, 778, 54186, 24702, 12512, 49494, 37375, 8626, 63028, 34452, 22323, 59332, 46179, 17627, 5495, 42463, 30133, 2599, 55965, 27424, 15306, 51293, 4716, 24056, 36213, 64710, 11366, 40882, 53036, 16026, 28200, 56958, 2557, 31086, 43263, 6206, 19364, 47914, 60060, 23048, 35448, 62944, 9595, 38135, 50178};
    private static long asInterface = -7040386203633147301L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, int i, short s) {
        int i2;
        int i3;
        int i4;
        int i5 = 1 - (i * 2);
        int i6 = 3 - (s * 4);
        int i7 = (b * 3) + 97;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i8 = i5;
            i3 = i6;
            i4 = 0;
            i6 += i8;
            i2 = i4;
            i4 = i2 + 1;
            bArr2[i2] = (byte) i6;
            i3++;
            if (i4 == i5) {
                return new String(bArr2, 0);
            }
            i8 = bArr[i3];
            i6 += i8;
            i2 = i4;
            i4 = i2 + 1;
            bArr2[i2] = (byte) i6;
            i3++;
            if (i4 == i5) {
            }
        } else {
            i2 = 0;
            i6 = i7;
            i3 = i6;
            i4 = i2 + 1;
            bArr2[i2] = (byte) i6;
            i3++;
            if (i4 == i5) {
            }
        }
    }

    public FaceFeatures() throws Throwable {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.IAuthTabCallback = linkedHashMap;
        this.onExtraCallback = access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback(UST_API_GetLicenseTime.class, CollectionsKt.listOf("selectUssCardDesign")), getWrite.IAuthTabCallback(UST_API_CheckLicense.class, CollectionsKt.listOf("tossBankSetTransferAdditionalAuth")), getWrite.IAuthTabCallback(CxxInspectorPackagerConnectionDelegateImpl.class, CollectionsKt.listOf("signScRepresentativeTerms"))});
        this.onNavigationEvent = linkedHashMap.size();
        linkedHashMap.put("addCalendarEvent", ExtendedKeyUsage.class);
        linkedHashMap.put("showAlert", hasKeyPurposeId.class);
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-117, -118, -118, -119, -120, -121, -126, -126, -122, -123, -124, -125, -126, -126, -127}, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 126, objArr);
        linkedHashMap.put(((String) objArr[0]).intern(), getReasons.class);
        Object[] objArr2 = new Object[1];
        a(null, null, new byte[]{-117, -118, -118, -119, -120, -121, -126, -126, -122, -123, -124, -125, -126, -126, -127, -114, -115, -116}, 127 - Gravity.getAbsoluteGravity(0, 0), objArr2);
        linkedHashMap.put(((String) objArr2[0]).intern(), getReasons.class);
        linkedHashMap.put("authenticateForCustomerService", GeneralNames.class);
        linkedHashMap.put("bypassFinishApplication", getBase.class);
        linkedHashMap.put("checkCalendarPermission", GeneralName.class);
        linkedHashMap.put("checkGeolocationPermission", getMinimum.class);
        linkedHashMap.put("checkGeolocationSettings", getBaseCertificateID.class);
        linkedHashMap.put("checkIsLocalAuthenticated", getEntityName.class);
        linkedHashMap.put("checkNFCSupport", Holder.class);
        linkedHashMap.put("checkPedometerPermission", getObjectDigestInfo.class);
        linkedHashMap.put("checkSamsungDexEnabled", getValueType.class);
        Object[] objArr3 = new Object[1];
        b(View.MeasureSpec.makeMeasureSpec(0, 0) + 30, (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 27267), KeyEvent.getDeadChar(0, 0), objArr3);
        linkedHashMap.put(((String) objArr3[0]).intern(), getPolicyAuthority.class);
        linkedHashMap.put("checkUsbDebugEnabled", IssuerSerial.class);
        linkedHashMap.put("checkWifiDebugEnabled", IetfAttrSyntax.class);
        linkedHashMap.put("checkout", getIssuerUID.class);
        linkedHashMap.put("clearWebViewCache", onlyContainsCACerts.class);
        linkedHashMap.put("continueSignupTutorial", IssuingDistributionPoint.class);
        linkedHashMap.put("setVisibleCTA", getOnlySomeReasons.class);
        linkedHashMap.put("startDetectShakeMotion", isIndirectCRL.class);
        linkedHashMap.put("stopDetectShakeMotion", isIndirectCRL.class);
        linkedHashMap.put("signForElectronicDocument", onlyContainsUserCerts.class);
        linkedHashMap.put("extractOtpWithVerifyId", KeyUsage.class);
        linkedHashMap.put("fetchAlphaToken", NameConstraints.class);
        linkedHashMap.put("fetchAuthToken", KeyPurposeId.class);
        linkedHashMap.put("fetchContacts", getExcludedSubtrees.class);
        linkedHashMap.put("finishApplication", getNoticeNumbers.class);
        linkedHashMap.put("getGeolocationStatus", getOrganization.class);
        linkedHashMap.put("getABTestVars", getPermittedSubtrees.class);
        linkedHashMap.put("getAccounts", ObjectDigestInfo.class);
        linkedHashMap.put("getAdvertisingIdentifier", getObjectDigest.class);
        linkedHashMap.put("getAllAccounts", getOtherObjectTypeID.class);
        linkedHashMap.put("getAppSessionId", getPolicyIdentifier.class);
        linkedHashMap.put("getCallState", PolicyInformation.class);
        linkedHashMap.put("getCameraPermission", getDigestedObjectType.class);
        linkedHashMap.put("getClipboardText", PolicyQualifierInfo.class);
        linkedHashMap.put("getDeviceId", getPolicyQualifiers.class);
        linkedHashMap.put("getDeviceOrientation", PolicyMappings.class);
        linkedHashMap.put("getDeviceRingtoneMode", PolicyQualifierId.class);
        linkedHashMap.put("getEnvironment", getPolicyQualifierId.class);
        linkedHashMap.put("getVolume", PrivateKeyUsagePeriod.class);
        linkedHashMap.put("getNetworkStatus", ReasonFlags.class);
        linkedHashMap.put("getOtpAvailableAccounts", getNotBefore.class);
        linkedHashMap.put("getOverlayPermission", RSAPublicKeyStructure.class);
        linkedHashMap.put("getPrimaryAccount", getNotAfter.class);
        linkedHashMap.put("getScreenReaderStatus", RoleSyntax.class);
        linkedHashMap.put("getSelectedContact", getRoleName.class);
        linkedHashMap.put("getServerTimeDiff", getRoleNameAsString.class);
        linkedHashMap.put("getSystemStatus", getRoleAuthority.class);
        linkedHashMap.put("getTelephonyInfo", GetTelephonyInfoHandler.class);
        linkedHashMap.put("getTermsStates", GetTermsStatesHandler.class);
        linkedHashMap.put("getWebAuthorizationToken", SubjectKeyIdentifier.class);
        linkedHashMap.put("hasCertificates", SubjectPublicKeyInfo.class);
        linkedHashMap.put("knowYourCustomer", TBSCertList.class);
        linkedHashMap.put("loadAnalyzedImages", getVersionNumber.class);
        linkedHashMap.put("loadImages", getUserCertificate.class);
        linkedHashMap.put("getLocale", TBSCertListCRLEntry.class);
        linkedHashMap.put("modifyProfile", TBSCertLista.class);
        linkedHashMap.put("setNavType", getRevocationDate.class);
        linkedHashMap.put("getSafeAreaInsets", getRevocationDate.class);
        linkedHashMap.put("subscribeNetworkStatus", getStartDate.class);
        linkedHashMap.put("unsubscribeNetworkStatus", getStartDate.class);
        linkedHashMap.put("checkNotificationPermission", TBSCertListb.class);
        linkedHashMap.put("onMoneyTransferOccurred", getIssuerUniqueId.class);
        linkedHashMap.put("onPageMove", TBSCertificateStructure.class);
        linkedHashMap.put("openAppStoreInline", getEndDate.class);
        linkedHashMap.put("openClockAppAlarmSetting", getTargetGroup.class);
        linkedHashMap.put("openOsSettings", getSubjectUniqueId.class);
        linkedHashMap.put("open", TargetInformation.class);
        linkedHashMap.put("openScheme", Target.class);
        linkedHashMap.put("exitApp", getTargetsObjects.class);
        linkedHashMap.put("partnerGetDeviceInformation", setEndDate.class);
        linkedHashMap.put("periodicTransferEdit", V1TBSCertificateGenerator.class);
        linkedHashMap.put("periodicTransferPost", UserNotice.class);
        linkedHashMap.put("hasPinShortcut", Targets.class);
        linkedHashMap.put("requestPinShortcut", Targets.class);
        linkedHashMap.put("playTransferCompleteSound", generateTBSCertificate.class);
        linkedHashMap.put("startPollingGeolocationInfo", setStartDate.class);
        linkedHashMap.put("stopPollingGeolocationInfo", setStartDate.class);
        linkedHashMap.put("startPollingMotionInfo", setSerialNumber.class);
        linkedHashMap.put("preloadImagesToNativeCache", setSignature.class);
        linkedHashMap.put("presentUserVerificationInfoView", setIssuer.class);
        linkedHashMap.put("refreshAccounts", RefreshAccountsMessageHandler.class);
        linkedHashMap.put("refreshExternalBankAccounts", RefreshExternalBankAccountsHandler.class);
        linkedHashMap.put("refreshHomeFailoverState", RefreshHomeFailoverStateHandler.class);
        linkedHashMap.put("refreshTermsStates", RefreshTermsStatesHandler.class);
        linkedHashMap.put("refreshTubaVars", RefreshTubaVarsHandler.class);
        linkedHashMap.put("refreshWebView", RefreshWebViewHandler.class);
        linkedHashMap.put("registerSmsReceiverForSixDigits", RegisterSmsReceiverForSixDigitsHandler.class);
        linkedHashMap.put("reportNetworkUsage", ReportNetworkUsageHandler.class);
        linkedHashMap.put("requestCalendarWritablePermission", RequestCalendarWritablePermissionHandler.class);
        linkedHashMap.put("requestCameraPermission", RequestCameraPermissionHandler.class);
        linkedHashMap.put("requestDisallowInterceptTouchEvent", RequestDisallowInterceptTouchEventHandler.class);
        linkedHashMap.put("requestGeolocationPermission", RequestGeolocationPermissionHandler.class);
        linkedHashMap.put("requestIdCardOcr", RequestIdCardOcrHandler.class);
        linkedHashMap.put("requestPassportOcr", RequestPassportOcrHandler.class);
        linkedHashMap.put("requestOverlayPermission", RequestOverlayPermissionHandler.class);
        linkedHashMap.put("requestPedometerPermission", RequestPedometerPermissionHandler.class);
        linkedHashMap.put("requestPhonePermission", RequestPhonePermissionHandler.class);
        linkedHashMap.put("requestSelfie", RequestSelfieHandler.class);
        Object[] objArr4 = new Object[1];
        a(null, null, new byte[]{-108, -112, -122, -109, -119, -118, -112, -117, -110, -118, -120, -115, -111, -119, -118, -121, -112, -114, -118, -122, -113, -118, -119}, 128 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr4);
        linkedHashMap.put(((String) objArr4[0]).intern(), RequestServiceEnterAuthHandler.class);
        Object[] objArr5 = new Object[1];
        b(26 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) Color.alpha(0), (ViewConfiguration.getLongPressTimeout() >> 16) + 30, objArr5);
        linkedHashMap.put(((String) objArr5[0]).intern(), RequestServiceEnterAuthHandler.class);
        linkedHashMap.put("returnAuthenticateForCustomerServiceResult", ReturnAuthCsResultHandler.class);
        linkedHashMap.put("saveAsContact", setSubject.class);
        linkedHashMap.put("saveBase64Data", setExtensions.class);
        linkedHashMap.put("scanCardInfo", addAttribute.class);
        linkedHashMap.put("scanQRCode", V2AttributeCertificateInfoGenerator.class);
        linkedHashMap.put("scanUsim", generateAttributeCertificateInfo.class);
        linkedHashMap.put("secureLoadImages", setSubjectPublicKeyInfo.class);
        Object[] objArr6 = new Object[1];
        b(KeyEvent.keyCodeFromString("") + 18, (char) (Color.alpha(0) + 3937), TextUtils.indexOf("", "") + 56, objArr6);
        linkedHashMap.put(((String) objArr6[0]).intern(), setHolder.class);
        Object[] objArr7 = new Object[1];
        a(null, null, new byte[]{-117, -118, -118, -119, -120, -121, -118, -119, -122, -120, -118, -121, -118, -126, -107, -127, -114, -115, -116}, Drawable.resolveOpacity(0, 0) + 127, objArr7);
        linkedHashMap.put(((String) objArr7[0]).intern(), setHolder.class);
        linkedHashMap.put("getSecureStorageValue", setIssuerUniqueID.class);
        linkedHashMap.put("setSecureStorageValue", setIssuerUniqueID.class);
        linkedHashMap.put("removeSecureStorageValue", setIssuerUniqueID.class);
        linkedHashMap.put("selectMyAccount", V2Form.class);
        linkedHashMap.put("selectSubTab", getIssuerName.class);
        linkedHashMap.put("selectTab", V2TBSCertListGenerator.class);
        linkedHashMap.put("sendEvent", V3TBSCertificateGenerator.class);
        linkedHashMap.put("sendPDF", setThisUpdate.class);
        linkedHashMap.put("sendSMS", setNextUpdate.class);
        linkedHashMap.put("setClipboardText", generateTBSCertList.class);
        linkedHashMap.put("setDeviceOrientation", addCRLEntry.class);
        linkedHashMap.put("setPrimaryAccount", getTBSCertificate.class);
        linkedHashMap.put("setScreenshotEventHandler", X509Attributes.class);
        linkedHashMap.put("setStatusBarIconColor", X509DefaultEntryConverter.class);
        linkedHashMap.put("setSwipeRefreshHandler", getConvertedValue.class);
        linkedHashMap.put("share", X509CertificateStructure.class);
        linkedHashMap.put("shareToSNS", X509Extension.class);
        linkedHashMap.put("showFullScreenImage", X509Extensions.class);
        linkedHashMap.put("showPointComponent", isCritical.class);
        linkedHashMap.put("showTossOneUserTerms", convertValueToObject.class);
        linkedHashMap.put("checkTubaTriggers", equivalent.class);
        linkedHashMap.put("setTubaTriggers", equivalent.class);
        linkedHashMap.put("unblockSession", addExtension.class);
        linkedHashMap.put("updatePrimaryAccount", oids.class);
        linkedHashMap.put("fetchAppsInTossAd", X509ObjectIdentifiers.class);
        linkedHashMap.put("getDeviceAttributes", getAlphabetic.class);
        linkedHashMap.put("fetchTossAd", getSourceDataUri.class);
        linkedHashMap.put("loadTossAdOrAdmob", Iso4217CurrencyCode.class);
        linkedHashMap.put("loadAdWithData", getTypeOfBiometricData.class);
        linkedHashMap.put("showTossAdOrAdmob", getExponent.class);
        linkedHashMap.put("addBroadcastReceiver", QCStatement.class);
        linkedHashMap.put("removeBroadcastReceiver", QCStatement.class);
        linkedHashMap.put("sendBroadcastMessage", QCStatement.class);
        linkedHashMap.put("isCardAppInstalled", RFC3739QCObjectIdentifiers.class);
        linkedHashMap.put("agreeToCardIssueTerm", getStatementInfo.class);
        linkedHashMap.put("getEncryptedRRN", getPredefinedBiometricType.class);
        linkedHashMap.put("getRRNEncryptionPublicKey", getBiometricDataOid.class);
        linkedHashMap.put("sendLayoutAction", TypeOfBiometricData.class);
        linkedHashMap.put("setScrapedResidentIdCardIssueDate", isPredefined.class);
        linkedHashMap.put("checkCertificate", getGivenName.class);
        linkedHashMap.put("encryptCertificate", PersonalData.class);
        linkedHashMap.put("fetchCertificates", getNameOrPseudonym.class);
        linkedHashMap.put("invokeScraping", getNameDistinguisher.class);
        linkedHashMap.put("revokeScraping", RevokeScrapingHandler.class);
        linkedHashMap.put("sendMessageToChild", getDateOfBirth.class);
        linkedHashMap.put("activateDashboard", getPlaceOfBirth.class);
        linkedHashMap.put("closeOnPrintComplete", getCounter.class);
        linkedHashMap.put("registerGov24", RegisterGov24Handler.class);
        linkedHashMap.put("getDebugCustomHeaders", getKeyInfo.class);
        linkedHashMap.put("canOpenMobileIDAppScheme", OtherInfo.class);
        linkedHashMap.put("canOpenSamsungMobileIDAppScheme", getPartyAInfo.class);
        linkedHashMap.put("createM400FromMobileIDCardApp", KeySpecificInfo.class);
        linkedHashMap.put("partnerGetClipboardText", CertPathValidateException.class);
        linkedHashMap.put("partnerSetClipboardText", getSuppPubInfo.class);
        linkedHashMap.put("checkStepCounterAvailability", CMSException.class);
        Object[] objArr8 = new Object[1];
        a(null, null, new byte[]{-116, -118, -126, -107, -127, -117, -110, -119, -118, -112, -118, -105, -125, -116, -118, -106, -112, -118, -114}, 127 - View.resolveSize(0, 0), objArr8);
        linkedHashMap.put(((String) objArr8[0]).intern(), X9FieldID.class);
        Object[] objArr9 = new Object[1];
        a(null, null, new byte[]{-116, -118, -126, -107, -127, -117, -110, -119, -118, -112, -118, -105, -125, -116, -118, -106, -114, -115}, 127 - Color.alpha(0), objArr9);
        linkedHashMap.put(((String) objArr9[0]).intern(), X9FieldID.class);
        linkedHashMap.put("checkPedometerNotificationPermission", NoSuchAlgorithmException.class);
        linkedHashMap.put("requestPedometerSync", RequestPedometerSyncHandler.class);
        linkedHashMap.put("startStepCounterService", CryptoException.class);
        linkedHashMap.put("stopStepCounterService", CryptoException.class);
        linkedHashMap.put("startStepCounterServiceV2", CryptoKeyException.class);
        linkedHashMap.put("stopStepCounterServiceV2", CryptoKeyException.class);
        linkedHashMap.put("registerPensionNotification", RegisterPensionNotificationHandler.class);
        linkedHashMap.put("unregisterPensionNotification", RegisterPensionNotificationHandler.class);
        linkedHashMap.put("decryptWithPin", MalformedDataException.class);
        linkedHashMap.put("encryptWithPin", USToolkitException.class);
        linkedHashMap.put("tossBankRequestIdCardOcrV2", UST_API_GetLastDebugError.class);
        Object[] objArr10 = new Object[1];
        a(null, null, new byte[]{-100, -123, -101, -118, -117, -125, -112, -121, -117, -118, -121, -121, -116, -127, -118, -102, -103, -117, -127, -104, -114, -114, -125, -112}, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 127, objArr10);
        linkedHashMap.put(((String) objArr10[0]).intern(), UST_API_InitAPI.class);
        Object[] objArr11 = new Object[1];
        a(null, null, new byte[]{-105, -125, -116, -117, -127, -102, -112, -114, -125, -98, -108, -112, -115, -99, -100, -123, -101, -118, -117, -125, -112, -121, -117, -118, -121, -121, -116, -127, -118, -102, -103, -117, -127, -104, -114, -114, -125, -112}, 127 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr11);
        linkedHashMap.put(((String) objArr11[0]).intern(), UST_API_InitAPI.class);
        Object[] objArr12 = new Object[1];
        b(25 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 74 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr12);
        linkedHashMap.put(((String) objArr12[0]).intern(), UST_API_InitAPI.class);
        Object[] objArr13 = new Object[1];
        b(AndroidCharacter.getMirror('0') - 24, (char) Gravity.getAbsoluteGravity(0, 0), 98 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr13);
        linkedHashMap.put(((String) objArr13[0]).intern(), UST_API_InitAPI.class);
        Object[] objArr14 = new Object[1];
        b(TextUtils.lastIndexOf("", '0', 0, 0) + 24, (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 65484), 121 - ExpandableListView.getPackedPositionChild(0L), objArr14);
        linkedHashMap.put(((String) objArr14[0]).intern(), UST_API_InitAPI.class);
        Object[] objArr15 = new Object[1];
        a(null, null, new byte[]{-114, -118, -94, -95, -96, -106, -96, -97, -118, -117, -125, -112, -121, -117, -118, -121, -121, -114, -127, -98, -103, -117, -127, -104, -114, -114, -125, -112}, Color.red(0) + 127, objArr15);
        linkedHashMap.put(((String) objArr15[0]).intern(), UST_API_InitAPI.class);
        Object[] objArr16 = new Object[1];
        a(null, null, new byte[]{-106, -96, -97, -118, -117, -125, -112, -121, -117, -118, -121, -121, -118, -112, -118, -126, -118, -93, -103, -117, -127, -104, -114, -114, -125, -112}, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 127, objArr16);
        linkedHashMap.put(((String) objArr16[0]).intern(), UST_API_InitAPI.class);
        linkedHashMap.put("fetchContactsForTossFamily", UST_CERT_GetAuthorityKeyIdentifier.class);
        linkedHashMap.put("tossFamilyRefreshAccount", UST_CERT_GetCRLDP.class);
        linkedHashMap.put("tossFamilyRefreshBalance", UST_CERT_GetBasicConstraints.class);
        linkedHashMap.put("close", UST_CERT_GetCertPolicy.class);
        linkedHashMap.put("setScreenAwakeMode", SetScreenAwakeModeHandler.class);
        linkedHashMap.put("showToast", UST_CERT_GetCertUserNotice.class);
        linkedHashMap.put("toastShort", UST_CERT_GetCertUserNotice.class);
        linkedHashMap.put("toastLong", UST_CERT_GetCertUserNotice.class);
        linkedHashMap.put("showMessage", UST_CERT_GetCertUserNotice.class);
        linkedHashMap.put("getTossSecureStorageValue", UST_CERT_GetIssuerDN.class);
        linkedHashMap.put("setTossSecureStorageValue", UST_CERT_GetIssuerDN.class);
        linkedHashMap.put("removeTossSecureStorageValue", UST_CERT_GetIssuerDN.class);
        linkedHashMap.put("extractUserEmail", toUTF8ByteArray.class);
        linkedHashMap.put("requestInAppUpdate", RequestInAppUpdateHandler.class);
        linkedHashMap.put("getBiometricAuthEnabled", CustomTabMainActivity.class);
        linkedHashMap.put("setBiometricAuthEnabled", onInterstitialDisplayed.class);
        linkedHashMap.put("sendPushNotification", JavaModuleWrapperMethodDescriptor.class);
        linkedHashMap.put("isShakeEnabledForQRPass", pushDouble.class);
        linkedHashMap.put("setShakeEnabledForQRPass", pushDouble.class);
        linkedHashMap.put("prepareEmbeddedRN", MessageQueueThreadImplExternalSyntheticLambda0.class);
        linkedHashMap.put("showEmbeddedRN", startNewBackgroundThread.class);
        linkedHashMap.put("renewTossCert", RenewTossCertHandler.class);
        linkedHashMap.put("issueTossCert", sendEventToAllConnections.class);
        linkedHashMap.put("signTossCert", CxxInspectorPackagerConnectionDelegateImplconnectWebSocketwebSocket1ExternalSyntheticLambda0.class);
        linkedHashMap.put("signTossCertV2", connectWebSocket.class);
        linkedHashMap.put("internalSignTossCertV2", scheduleCallback.class);
        linkedHashMap.put("externalSignTossCert", accessinitHybrid.class);
        linkedHashMap.put("storeTossCert", CxxInspectorPackagerConnectionDelegateImplconnectWebSocketwebSocket1ExternalSyntheticLambda3.class);
        linkedHashMap.put("checkTossCertValidity", CxxInspectorPackagerConnectionDelegateImplconnectWebSocketwebSocket1ExternalSyntheticLambda1.class);
        linkedHashMap.put("removeClientCertificate", RedBoxDialogSurfaceDelegateCompanionrunAfterHostResume1.class);
        linkedHashMap.put("startCardTransition", dispatchUnique.class);
    }

    @Override // o.ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1
    public Map<Class<? extends drawTextBox>, List<String>> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 119;
        access100 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Map<Class<? extends drawTextBox>, List<String>> map = this.onExtraCallback;
        int i4 = i2 + 79;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 89 / 0;
        }
        return map;
    }

    private static void b(int i, char c, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i4 = $11 + 57;
        $10 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 5 % 5;
        }
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i) {
            int i6 = $10 + 77;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(IAuthTabCallbackDefault[i2 + i8])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.red(0) + 59697), (ViewConfiguration.getTapTimeout() >> 16) + 17, 10972 - Process.getGidForName(""), 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i8), Long.valueOf(asInterface), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 46134), (ViewConfiguration.getTapTimeout() >> 16) + 31, Color.red(0) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i8] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 49122), 44 - ((Process.getThreadPriority(0) + 20) >> 6), 1494 - Drawable.resolveOpacity(0, 0), -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i9 = $11 + 123;
                $10 = i9 % 128;
                int i10 = i9 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i) {
            int i11 = $11 + 27;
            $10 = i11 % 128;
            if (i11 % 2 != 0) {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49124 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 44 - View.getDefaultSize(0, 0), 1494 - Color.red(0), -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                throw null;
            }
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr6 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback5 == null) {
                byte b5 = (byte) 0;
                byte b6 = b5;
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - TextUtils.indexOf("", "", 0)), 44 - Color.alpha(0), 1494 - (ViewConfiguration.getKeyRepeatDelay() >> 16), -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr);
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int length;
        char[] cArr2;
        int i2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr3 = onWarmupCompleted;
        long j = 0;
        if (cArr3 != null) {
            int i4 = $11 + 121;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                length = cArr3.length;
                cArr2 = new char[length];
                i2 = 1;
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
                i2 = 0;
            }
            while (i2 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i2])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)) - 1), (ViewConfiguration.getTapTimeout() >> 16) + 77, (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)) + 20951, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr2[i2] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i2++;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        }
        Object[] objArr3 = {Integer.valueOf(onExtraCallbackWithResult)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (Process.myPid() >> 22) + 75, 16037 - Drawable.resolveOpacity(0, 0), -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        if (onTransact) {
            int i5 = $10 + 15;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i7 = $10 + 63;
                $11 = i7 % 128;
                if (i7 % 2 == 0) {
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback % defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] / i] + iIntValue);
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), ExpandableListView.getPackedPositionChild(0L) + 64, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } else {
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.rgb(0, 0, 0) + 16777216), TextUtils.lastIndexOf("", '0') + 64, 12213 - TextUtils.indexOf((CharSequence) "", '0', 0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!asBinder) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            int i8 = $11 + 27;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i10 = $10 + 29;
            $11 = i10 % 128;
            if (i10 % 2 == 0) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback + defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] << iIntValue);
                Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.rgb(0, 0, 0) + 16777216), 63 - (Process.myTid() >> 22), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            } else {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr7 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback6 == null) {
                    objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> 16), 63 - (ViewConfiguration.getWindowTouchSlop() >> 8), 12214 - Color.blue(0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback6).invoke(null, objArr7);
            }
        }
        objArr[0] = new String(cArr6);
    }

    @Override // o.ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1
    public drawTextBox IAuthTabCallback(@NotNull String str) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(str, "");
            Class<? extends drawTextBox> cls = this.IAuthTabCallback.get(str);
            if (cls == null) {
                return null;
            }
            return cls.newInstance();
        }
    }

    @Override // o.ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1
    public Set<String> onExtraCallbackWithResult() {
        Set<String> setKeySet;
        synchronized (this) {
            setKeySet = this.IAuthTabCallback.keySet();
        }
        return setKeySet;
    }
}
