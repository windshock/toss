package viva.republica.toss.cardrecommend.issuev2.ui.id.ocr;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.ByteArrayOutputStream;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.ConvertFloatArrayToByteArray;
import o.GeckoHubImp;
import o.Page;
import o.WebResourceResponseModel;
import o.access13800;
import o.access14300;
import o.access15400;
import o.castToDouble;
import o.findResAndMsg;
import o.maybeUpdateAnimatable;
import o.putChannelInfo;
import viva.republica.toss.network.model.cardsales.funnel.formvalue.IdVerificationFormValue;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class CardIssueOcrVerifyFragment$IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    final /* synthetic */ String $croppedImage;
    final /* synthetic */ String $driverLicenseIssuer;
    final /* synthetic */ String $driverLicenseNumber;
    final /* synthetic */ IdVerificationFormValue.IdType $idType;
    final /* synthetic */ String $issueDate;
    final /* synthetic */ String $maskedImage;
    final /* synthetic */ Set<castToDouble> $modifiedFields;
    final /* synthetic */ IdVerificationFormValue $scrapingFormValue;
    int I$0;
    int I$1;
    Object L$0;
    boolean Z$0;
    int label;
    final /* synthetic */ CardIssueOcrVerifyFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CardIssueOcrVerifyFragment$IAuthTabCallback(CardIssueOcrVerifyFragment cardIssueOcrVerifyFragment, IdVerificationFormValue.IdType idType, String str, String str2, String str3, Set<? extends castToDouble> set, String str4, IdVerificationFormValue idVerificationFormValue, String str5, access13800<? super CardIssueOcrVerifyFragment$IAuthTabCallback> access13800Var) {
        super(2, access13800Var);
        this.this$0 = cardIssueOcrVerifyFragment;
        this.$idType = idType;
        this.$issueDate = str;
        this.$driverLicenseNumber = str2;
        this.$driverLicenseIssuer = str3;
        this.$modifiedFields = set;
        this.$maskedImage = str4;
        this.$scrapingFormValue = idVerificationFormValue;
        this.$croppedImage = str5;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        return new CardIssueOcrVerifyFragment$IAuthTabCallback(this.this$0, this.$idType, this.$issueDate, this.$driverLicenseNumber, this.$driverLicenseIssuer, this.$modifiedFields, this.$maskedImage, this.$scrapingFormValue, this.$croppedImage, access13800Var);
    }

    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006b, code lost:
    
        if (r15 != r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ea, code lost:
    
        if (viva.republica.toss.cardrecommend.issuev2.ui.id.ocr.CardIssueOcrVerifyFragment.IAuthTabCallback(r2, r4, r5, r14) == r0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f9, code lost:
    
        if (viva.republica.toss.cardrecommend.issuev2.ui.id.ocr.CardIssueOcrVerifyFragment.IAuthTabCallback(r15, r1, r2, r14) == r0) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        String str;
        boolean zBooleanValue;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i = this.label;
        try {
        } catch (Exception e) {
            Result.Companion companion = Result.Companion;
            obj2 = Result.constructor-impl(ResultKt.createFailure(e));
        } catch (WebResourceResponseModel e2) {
            Result.Companion companion2 = Result.Companion;
            obj2 = Result.constructor-impl(ResultKt.createFailure(e2));
        } catch (CancellationException e3) {
            throw e3;
        }
        if (i == 0) {
            ResultKt.onNavigationEvent(obj);
            if (this.this$0.readTypedObject().onExtraCallbackWithResult().asBinder()) {
                String str2 = this.$croppedImage;
                Result.Companion companion3 = Result.Companion;
                GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
                onNavigationEvent onnavigationevent = new onNavigationEvent(str2, null);
                this.L$0 = access15400.onNavigationEvent(this);
                this.I$0 = 0;
                this.I$1 = 0;
                this.label = 1;
                obj = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, onnavigationevent, this);
            } else {
                CardIssueOcrVerifyFragment cardIssueOcrVerifyFragment = this.this$0;
                String str3 = this.$maskedImage;
                IdVerificationFormValue idVerificationFormValue = this.$scrapingFormValue;
                this.label = 4;
            }
            return objOnWarmupCompleted;
        }
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                } else if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                return Unit.INSTANCE;
            }
            str = (String) this.L$0;
            ResultKt.onNavigationEvent(obj);
            zBooleanValue = ((Boolean) obj).booleanValue();
            if (zBooleanValue) {
                CardIssueOcrVerifyFragment cardIssueOcrVerifyFragment2 = this.this$0;
                String str4 = this.$maskedImage;
                IdVerificationFormValue idVerificationFormValue2 = this.$scrapingFormValue;
                this.L$0 = access15400.onNavigationEvent(str);
                this.Z$0 = zBooleanValue;
                this.label = 3;
            }
            return Unit.INSTANCE;
        }
        ResultKt.onNavigationEvent(obj);
        obj2 = Result.constructor-impl(obj);
        CardIssueOcrVerifyFragment cardIssueOcrVerifyFragment3 = this.this$0;
        Throwable th = Result.exceptionOrNull-impl(obj2);
        if (th != null) {
            cardIssueOcrVerifyFragment3.dismissProgressDialog();
            ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("CardIssueOcrVerifyFragment", th);
            CardIssueOcrVerifyFragment.onNavigationEvent(cardIssueOcrVerifyFragment3);
        }
        str = (String) (Result.onExtraCallback(obj2) ? null : obj2);
        if (str == null) {
            return Unit.INSTANCE;
        }
        CardIssueOcrVerifyFragment cardIssueOcrVerifyFragment4 = this.this$0;
        IdVerificationFormValue.IdType idType = this.$idType;
        String str5 = this.$issueDate;
        String str6 = this.$driverLicenseNumber;
        String str7 = this.$driverLicenseIssuer;
        Set<castToDouble> set = this.$modifiedFields;
        String str8 = this.$maskedImage;
        this.L$0 = access15400.onNavigationEvent(str);
        this.label = 2;
        obj = CardIssueOcrVerifyFragment.onNavigationEvent(cardIssueOcrVerifyFragment4, idType, str5, str6, str7, set, str, str8, this);
        if (obj != objOnWarmupCompleted) {
            zBooleanValue = ((Boolean) obj).booleanValue();
            if (zBooleanValue) {
            }
            return Unit.INSTANCE;
        }
        return objOnWarmupCompleted;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super String>, Object> {
        final /* synthetic */ String $croppedImage;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(String str, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$croppedImage = str;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new onNavigationEvent(this.$croppedImage, access13800Var);
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super String> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            byte[] bArrOnNavigationEvent = Page.onNavigationEvent(this.$croppedImage, 0, 1, (Object) null);
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrOnNavigationEvent, 0, bArrOnNavigationEvent.length);
            Intrinsics.checkNotNullExpressionValue(bitmapDecodeByteArray, BuildConfig.FLAVOR);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                bitmapDecodeByteArray.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Intrinsics.checkNotNullExpressionValue(byteArray, BuildConfig.FLAVOR);
                String strOnExtraCallbackWithResult = Page.onExtraCallbackWithResult(byteArray, 0, 1, (Object) null);
                CloseableKt.closeFinally(byteArrayOutputStream, (Throwable) null);
                return strOnExtraCallbackWithResult;
            } finally {
            }
        }
    }
}
