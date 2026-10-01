package o;

import im.toss.ads_sdk.remote.model.SdkTemplate;
import im.toss.ads_sdk.remote.model.SdkTemplateAdvertiser;
import im.toss.ads_sdk.remote.model.SdkTemplateCta;
import im.toss.ads_sdk.remote.model.SdkTemplateHeader;
import im.toss.ads_sdk.remote.model.SdkTemplateItem;
import im.toss.ads_sdk.remote.model.SdkTemplateQuestionnaire;
import im.toss.ads_sdk.remote.model.SdkTemplateReviewed;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.RearDisplayPresentationSessionPresenterImpl;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class WindowAreaControllerImplwindowAreaInfos1ExternalSyntheticLambda0 {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;

    public static final RearDisplayPresentationSessionPresenterImpl onNavigationEvent(@NotNull SdkTemplate sdkTemplate) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(sdkTemplate, "");
            boolean z = sdkTemplate instanceof SdkTemplate.onNavigationEvent;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(sdkTemplate, "");
        if (sdkTemplate instanceof SdkTemplate.onNavigationEvent) {
            int i3 = onWarmupCompleted + 9;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return onWarmupCompleted((SdkTemplate.onNavigationEvent) sdkTemplate);
            }
            int i4 = 72 / 0;
            return onWarmupCompleted((SdkTemplate.onNavigationEvent) sdkTemplate);
        }
        if (sdkTemplate instanceof SdkTemplate.onExtraCallbackWithResult) {
            return onExtraCallbackWithResult((SdkTemplate.onExtraCallbackWithResult) sdkTemplate);
        }
        int i5 = onExtraCallback + 107;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final RearDisplayPresentationSessionPresenterImpl onWarmupCompleted(SdkTemplate.onNavigationEvent onnavigationevent) {
        String str;
        String str2;
        String strOnExtraCallbackWithResult;
        String str3;
        String str4;
        String strOnWarmupCompleted;
        String strOnWarmupCompleted2;
        String strIAuthTabCallback;
        String strOnWarmupCompleted3;
        int i = 2 % 2;
        List<SdkTemplateItem> listAsBinder = onnavigationevent.asBinder();
        if (listAsBinder.isEmpty()) {
            return null;
        }
        SdkTemplateHeader sdkTemplateHeaderOnExtraCallbackWithResult = onnavigationevent.onExtraCallbackWithResult();
        String strOnExtraCallback = sdkTemplateHeaderOnExtraCallbackWithResult != null ? sdkTemplateHeaderOnExtraCallbackWithResult.onExtraCallback() : null;
        if (strOnExtraCallback == null) {
            int i2 = onWarmupCompleted + 23;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            str = "";
        } else {
            str = strOnExtraCallback;
        }
        SdkTemplateHeader sdkTemplateHeaderOnExtraCallbackWithResult2 = onnavigationevent.onExtraCallbackWithResult();
        if (sdkTemplateHeaderOnExtraCallbackWithResult2 == null || (strOnWarmupCompleted3 = sdkTemplateHeaderOnExtraCallbackWithResult2.onWarmupCompleted()) == null) {
            str2 = null;
        } else {
            int i3 = onExtraCallback + 9;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                StringsKt.isBlank(strOnWarmupCompleted3);
                throw null;
            }
            if (!StringsKt.isBlank(strOnWarmupCompleted3)) {
                str2 = strOnWarmupCompleted3;
            }
        }
        SdkTemplateReviewed sdkTemplateReviewedIAuthTabCallbackStub = onnavigationevent.IAuthTabCallbackStub();
        if (sdkTemplateReviewedIAuthTabCallbackStub != null) {
            strOnExtraCallbackWithResult = sdkTemplateReviewedIAuthTabCallbackStub.onExtraCallbackWithResult();
        } else {
            int i4 = onWarmupCompleted + 21;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            strOnExtraCallbackWithResult = null;
        }
        SdkTemplateCta sdkTemplateCtaOnWarmupCompleted = onnavigationevent.onWarmupCompleted();
        if (sdkTemplateCtaOnWarmupCompleted == null || StringsKt.isBlank(sdkTemplateCtaOnWarmupCompleted.onWarmupCompleted())) {
            sdkTemplateCtaOnWarmupCompleted = null;
        }
        if (listAsBinder.size() < 2) {
            SdkTemplateItem sdkTemplateItem = (SdkTemplateItem) CollectionsKt.first(listAsBinder);
            String strOnWarmupCompleted4 = sdkTemplateItem.onWarmupCompleted();
            String strIAuthTabCallback2 = sdkTemplateItem.IAuthTabCallback();
            String strOnExtraCallback2 = sdkTemplateItem.onExtraCallback();
            SdkTemplateCta sdkTemplateCtaOnNavigationEvent = sdkTemplateItem.onNavigationEvent();
            String strOnWarmupCompleted5 = sdkTemplateCtaOnNavigationEvent != null ? sdkTemplateCtaOnNavigationEvent.onWarmupCompleted() : null;
            if (strOnWarmupCompleted5 == null) {
                int i6 = onExtraCallback + 95;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                str3 = "";
            } else {
                str3 = strOnWarmupCompleted5;
            }
            RearDisplayPresentationSessionPresenterImpl.IAuthTabCallbackDefault iAuthTabCallbackDefaultOnExtraCallback = onExtraCallback(onnavigationevent.onExtraCallback());
            RearDisplayPresentationSessionPresenterImpl.IAuthTabCallback iAuthTabCallbackOnWarmupCompleted = onWarmupCompleted(onnavigationevent.onExtraCallback());
            SdkTemplateCta sdkTemplateCtaOnNavigationEvent2 = sdkTemplateItem.onNavigationEvent();
            String strIAuthTabCallback3 = sdkTemplateCtaOnNavigationEvent2 != null ? sdkTemplateCtaOnNavigationEvent2.IAuthTabCallback() : null;
            if (sdkTemplateCtaOnWarmupCompleted != null) {
                int i8 = onWarmupCompleted + 103;
                onExtraCallback = i8 % 128;
                if (i8 % 2 == 0) {
                    strOnWarmupCompleted = sdkTemplateCtaOnWarmupCompleted.onWarmupCompleted();
                    int i9 = 19 / 0;
                } else {
                    strOnWarmupCompleted = sdkTemplateCtaOnWarmupCompleted.onWarmupCompleted();
                }
                str4 = strOnWarmupCompleted;
            } else {
                str4 = null;
            }
            if (sdkTemplateCtaOnWarmupCompleted != null) {
                int i10 = onExtraCallback + 103;
                onWarmupCompleted = i10 % 128;
                if (i10 % 2 != 0) {
                    sdkTemplateCtaOnWarmupCompleted.IAuthTabCallback();
                    throw null;
                }
                strIAuthTabCallback = sdkTemplateCtaOnWarmupCompleted.IAuthTabCallback();
            }
            return new RearDisplayPresentationSessionPresenterImpl.IAuthTabCallbackStub(str, strOnWarmupCompleted4, strIAuthTabCallback2, strOnExtraCallback2, str3, null, strOnExtraCallbackWithResult, null, iAuthTabCallbackDefaultOnExtraCallback, iAuthTabCallbackOnWarmupCompleted, str2, strIAuthTabCallback3, str4, strIAuthTabCallback, 160, null);
        }
        RearDisplayPresentationSessionPresenterImpl.IAuthTabCallback iAuthTabCallbackOnWarmupCompleted2 = onWarmupCompleted(onnavigationevent.onExtraCallback());
        List<SdkTemplateItem> list = listAsBinder;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            int i11 = onWarmupCompleted + 93;
            onExtraCallback = i11 % 128;
            if (i11 % 2 == 0) {
                SdkTemplateItem sdkTemplateItem2 = (SdkTemplateItem) it.next();
                sdkTemplateItem2.onWarmupCompleted();
                sdkTemplateItem2.IAuthTabCallback();
                sdkTemplateItem2.onExtraCallback();
                sdkTemplateItem2.onNavigationEvent();
                strIAuthTabCallback.hashCode();
                throw null;
            }
            SdkTemplateItem sdkTemplateItem3 = (SdkTemplateItem) it.next();
            String strOnWarmupCompleted6 = sdkTemplateItem3.onWarmupCompleted();
            String strIAuthTabCallback4 = sdkTemplateItem3.IAuthTabCallback();
            String strOnExtraCallback3 = sdkTemplateItem3.onExtraCallback();
            SdkTemplateCta sdkTemplateCtaOnNavigationEvent3 = sdkTemplateItem3.onNavigationEvent();
            String strOnWarmupCompleted7 = sdkTemplateCtaOnNavigationEvent3 != null ? sdkTemplateCtaOnNavigationEvent3.onWarmupCompleted() : null;
            String str5 = strOnWarmupCompleted7 == null ? "" : strOnWarmupCompleted7;
            SdkTemplateCta sdkTemplateCtaOnNavigationEvent4 = sdkTemplateItem3.onNavigationEvent();
            if (sdkTemplateCtaOnNavigationEvent4 != null) {
                int i12 = onWarmupCompleted + 27;
                onExtraCallback = i12 % 128;
                if (i12 % 2 == 0) {
                    sdkTemplateCtaOnNavigationEvent4.IAuthTabCallback();
                    throw null;
                }
                strIAuthTabCallback = sdkTemplateCtaOnNavigationEvent4.IAuthTabCallback();
            } else {
                strIAuthTabCallback = null;
            }
            arrayList.add(new RearDisplayPresentationSessionPresenterImpl.onTransact(strOnWarmupCompleted6, strIAuthTabCallback4, strOnExtraCallback3, str5, null, null, strIAuthTabCallback, 48, null));
        }
        if (sdkTemplateCtaOnWarmupCompleted != null) {
            strOnWarmupCompleted2 = sdkTemplateCtaOnWarmupCompleted.onWarmupCompleted();
        } else {
            int i13 = onWarmupCompleted + 81;
            onExtraCallback = i13 % 128;
            int i14 = i13 % 2;
            strOnWarmupCompleted2 = null;
        }
        return new RearDisplayPresentationSessionPresenterImpl.asBinder(str, arrayList, iAuthTabCallbackOnWarmupCompleted2, strOnWarmupCompleted2, strOnExtraCallbackWithResult, str2, sdkTemplateCtaOnWarmupCompleted != null ? sdkTemplateCtaOnWarmupCompleted.IAuthTabCallback() : null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final RearDisplayPresentationSessionPresenterImpl onExtraCallbackWithResult(SdkTemplate.onExtraCallbackWithResult onextracallbackwithresult) throws NoWhenBranchMatchedException {
        String strOnWarmupCompleted;
        String str;
        String str2;
        String str3;
        String str4;
        int i = 2 % 2;
        SdkTemplateCta sdkTemplateCtaAsBinder = onextracallbackwithresult.asBinder();
        if (sdkTemplateCtaAsBinder != null && (strOnWarmupCompleted = sdkTemplateCtaAsBinder.onWarmupCompleted()) != null) {
            String str5 = StringsKt.isBlank(strOnWarmupCompleted) ? null : strOnWarmupCompleted;
            if (str5 != null) {
                int i2 = onExtraCallback + 57;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                if (onextracallbackwithresult instanceof SdkTemplate.onExtraCallback) {
                    String strAsInterface = onextracallbackwithresult.asInterface();
                    SdkTemplate.onExtraCallback onextracallback = (SdkTemplate.onExtraCallback) onextracallbackwithresult;
                    String strOnWarmupCompleted2 = onextracallback.onWarmupCompleted();
                    String strOnExtraCallbackWithResult = onextracallback.onExtraCallbackWithResult();
                    String str6 = (strOnExtraCallbackWithResult == null || StringsKt.isBlank(strOnExtraCallbackWithResult)) ? null : strOnExtraCallbackWithResult;
                    String strIAuthTabCallbackDefault = onextracallbackwithresult.IAuthTabCallbackDefault();
                    if (strIAuthTabCallbackDefault != null) {
                        int i4 = onExtraCallback + 33;
                        onWarmupCompleted = i4 % 128;
                        int i5 = i4 % 2;
                        str4 = StringsKt.isBlank(strIAuthTabCallbackDefault) ? null : strIAuthTabCallbackDefault;
                    }
                    return new RearDisplayPresentationSessionPresenterImpl.onExtraCallbackWithResult(strAsInterface, strOnWarmupCompleted2, str5, str6, str4);
                }
                if (!(onextracallbackwithresult instanceof SdkTemplate.NanaSurveyChoiceSat)) {
                    if (!(onextracallbackwithresult instanceof SdkTemplate.NanaSurveyButtonSat)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    SdkTemplate.NanaSurveyButtonSat nanaSurveyButtonSat = (SdkTemplate.NanaSurveyButtonSat) onextracallbackwithresult;
                    String strAsInterface2 = nanaSurveyButtonSat.asInterface();
                    SdkTemplateAdvertiser sdkTemplateAdvertiserOnExtraCallbackWithResult = nanaSurveyButtonSat.onExtraCallbackWithResult();
                    String strIAuthTabCallback = sdkTemplateAdvertiserOnExtraCallbackWithResult != null ? sdkTemplateAdvertiserOnExtraCallbackWithResult.IAuthTabCallback() : null;
                    if (strIAuthTabCallback == null) {
                        strIAuthTabCallback = "";
                    }
                    String strIAuthTabCallbackStub = nanaSurveyButtonSat.IAuthTabCallbackStub();
                    String str7 = (strIAuthTabCallbackStub == null || StringsKt.isBlank(strIAuthTabCallbackStub)) ? null : strIAuthTabCallbackStub;
                    String strIAuthTabCallbackDefault2 = nanaSurveyButtonSat.IAuthTabCallbackDefault();
                    if (strIAuthTabCallbackDefault2 != null) {
                        int i6 = onWarmupCompleted + 49;
                        onExtraCallback = i6 % 128;
                        if (i6 % 2 == 0) {
                            StringsKt.isBlank(strIAuthTabCallbackDefault2);
                            throw null;
                        }
                        str3 = StringsKt.isBlank(strIAuthTabCallbackDefault2) ? null : strIAuthTabCallbackDefault2;
                    }
                    return new RearDisplayPresentationSessionPresenterImpl.onExtraCallback.onExtraCallbackWithResult(strAsInterface2, str5, strIAuthTabCallback, str7, str3);
                }
                SdkTemplate.NanaSurveyChoiceSat nanaSurveyChoiceSat = (SdkTemplate.NanaSurveyChoiceSat) onextracallbackwithresult;
                SdkTemplateQuestionnaire sdkTemplateQuestionnaireIAuthTabCallbackStub = nanaSurveyChoiceSat.IAuthTabCallbackStub();
                if (sdkTemplateQuestionnaireIAuthTabCallbackStub == null) {
                    int i7 = onWarmupCompleted + 33;
                    onExtraCallback = i7 % 128;
                    int i8 = i7 % 2;
                    return null;
                }
                if (true ^ sdkTemplateQuestionnaireIAuthTabCallbackStub.onWarmupCompleted().isEmpty()) {
                    String strIAuthTabCallback2 = sdkTemplateQuestionnaireIAuthTabCallbackStub.IAuthTabCallback();
                    List<String> listOnWarmupCompleted = sdkTemplateQuestionnaireIAuthTabCallbackStub.onWarmupCompleted();
                    RearDisplayPresentationSessionPresenterImpl.onExtraCallback.onWarmupCompleted onwarmupcompletedOnNavigationEvent = onNavigationEvent(sdkTemplateQuestionnaireIAuthTabCallbackStub.onExtraCallback());
                    SdkTemplateAdvertiser sdkTemplateAdvertiserOnExtraCallbackWithResult2 = nanaSurveyChoiceSat.onExtraCallbackWithResult();
                    String strIAuthTabCallback3 = sdkTemplateAdvertiserOnExtraCallbackWithResult2 != null ? sdkTemplateAdvertiserOnExtraCallbackWithResult2.IAuthTabCallback() : null;
                    if (strIAuthTabCallback3 == null) {
                        int i9 = onWarmupCompleted + 29;
                        onExtraCallback = i9 % 128;
                        int i10 = i9 % 2;
                        str = "";
                    } else {
                        str = strIAuthTabCallback3;
                    }
                    String strOnTransact = nanaSurveyChoiceSat.onTransact();
                    if (strOnTransact != null) {
                        int i11 = onExtraCallback + 29;
                        onWarmupCompleted = i11 % 128;
                        int i12 = i11 % 2;
                        str2 = StringsKt.isBlank(strOnTransact) ? null : strOnTransact;
                    }
                    return new RearDisplayPresentationSessionPresenterImpl.onExtraCallback.C0018onExtraCallback(strIAuthTabCallback2, listOnWarmupCompleted, str5, onwarmupcompletedOnNavigationEvent, str, str2, onWarmupCompleted(nanaSurveyChoiceSat.asInterface(), nanaSurveyChoiceSat.IAuthTabCallbackDefault()), null, 128, null);
                }
            }
        }
        return null;
    }

    private static final String onWarmupCompleted(String str, String str2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 79;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            if (!(!StringsKt.isBlank(str))) {
                int i3 = onWarmupCompleted + 55;
                onExtraCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 32 / 0;
                }
                str = null;
            }
            if (str2 == null || StringsKt.isBlank(str2)) {
                str2 = null;
            }
            String strJoinToString$default = CollectionsKt.joinToString$default(CollectionsKt.listOfNotNull(new String[]{str, str2}), "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
            if (StringsKt.isBlank(strJoinToString$default)) {
                int i5 = onExtraCallback + 19;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return null;
            }
            int i7 = onWarmupCompleted + 9;
            onExtraCallback = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 34 / 0;
            }
            return strJoinToString$default;
        }
        StringsKt.isBlank(str);
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        return o.RearDisplayPresentationSessionPresenterImpl.onExtraCallback.onWarmupCompleted.MULTIPLE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r4, "SINGLE") != true) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if ((!kotlin.jvm.internal.Intrinsics.areEqual(r4, "SINGLE")) != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        r4 = o.RearDisplayPresentationSessionPresenterImpl.onExtraCallback.onWarmupCompleted.SINGLE;
        r1 = o.WindowAreaControllerImplwindowAreaInfos1ExternalSyntheticLambda0.onWarmupCompleted + 67;
        o.WindowAreaControllerImplwindowAreaInfos1ExternalSyntheticLambda0.onExtraCallback = r1 % 128;
        r1 = r1 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final RearDisplayPresentationSessionPresenterImpl.onExtraCallback.onWarmupCompleted onNavigationEvent(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 111;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 39 / 0;
        }
    }

    private static final RearDisplayPresentationSessionPresenterImpl.IAuthTabCallbackDefault onExtraCallback(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        if (Intrinsics.areEqual(str, "nana-list-bat")) {
            int i4 = onWarmupCompleted + 83;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return RearDisplayPresentationSessionPresenterImpl.IAuthTabCallbackDefault.PRODUCT;
            }
            RearDisplayPresentationSessionPresenterImpl.IAuthTabCallbackDefault iAuthTabCallbackDefault = RearDisplayPresentationSessionPresenterImpl.IAuthTabCallbackDefault.PRODUCT;
            throw null;
        }
        RearDisplayPresentationSessionPresenterImpl.IAuthTabCallbackDefault iAuthTabCallbackDefault2 = RearDisplayPresentationSessionPresenterImpl.IAuthTabCallbackDefault.SERVICE;
        int i5 = onWarmupCompleted + 1;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return iAuthTabCallbackDefault2;
        }
        obj.hashCode();
        throw null;
    }

    private static final RearDisplayPresentationSessionPresenterImpl.IAuthTabCallback onWarmupCompleted(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.areEqual(str, "nana-list-sat");
            throw null;
        }
        if (!(!Intrinsics.areEqual(str, "nana-list-sat"))) {
            int i3 = onWarmupCompleted + 53;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return RearDisplayPresentationSessionPresenterImpl.IAuthTabCallback.SQUIRCLE;
        }
        RearDisplayPresentationSessionPresenterImpl.IAuthTabCallback iAuthTabCallback = RearDisplayPresentationSessionPresenterImpl.IAuthTabCallback.SQUARE;
        int i5 = onExtraCallback + 9;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return iAuthTabCallback;
        }
        throw null;
    }
}
