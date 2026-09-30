package o;

import im.toss.features.verify.teensmanualselfie.impl.idcardupload.nav.TeensManualSelfieNavGraphKt$;
import java.nio.charset.Charset;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class enableCppPropsIteratorSetter$onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super String>, Object> {
    final /* synthetic */ boolean $appliesUserSalt;
    final /* synthetic */ String $authPasswordHash;
    final /* synthetic */ String $encryptedPrivateKey;
    final /* synthetic */ String $loginPasswordHash;
    final /* synthetic */ asArray $passwordFormat;
    int label;

    public static final /* synthetic */ class IAuthTabCallback {
        public static final /* synthetic */ int[] onExtraCallbackWithResult;

        static {
            int[] iArr = new int[asArray.values().length];
            try {
                iArr[asArray.PW_6_DIGIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[asArray.PW_4_DIGIT_1_ALPHA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            onExtraCallbackWithResult = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public enableCppPropsIteratorSetter$onWarmupCompleted(asArray asarray, String str, String str2, String str3, boolean z, access13800<? super enableCppPropsIteratorSetter$onWarmupCompleted> access13800Var) {
        super(2, access13800Var);
        this.$passwordFormat = asarray;
        this.$encryptedPrivateKey = str;
        this.$loginPasswordHash = str2;
        this.$authPasswordHash = str3;
        this.$appliesUserSalt = z;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        return new enableCppPropsIteratorSetter$onWarmupCompleted(this.$passwordFormat, this.$encryptedPrivateKey, this.$loginPasswordHash, this.$authPasswordHash, this.$appliesUserSalt, access13800Var);
    }

    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public final Object invoke(findResAndMsg findresandmsg, access13800<? super String> access13800Var) {
        return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.onNavigationEvent(obj);
        int i = IAuthTabCallback.onExtraCallbackWithResult[this.$passwordFormat.ordinal()];
        if (i == 1) {
            EstimateFaceQualityFromBGRImage estimateFaceQualityFromBGRImage = EstimateFaceQualityFromBGRImage.IAuthTabCallback;
            Object[] objArr = {estimateFaceQualityFromBGRImage, this.$encryptedPrivateKey, Page.onNavigationEvent(this.$loginPasswordHash, 0, 1, (Object) null)};
            int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
            int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
            return estimateFaceQualityFromBGRImage.IAuthTabCallback((String) EstimateFaceQualityFromBGRImage.onWarmupCompleted(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), 2046127422, objArr, -2046127422, iIAuthTabCallback, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2), getPageContainer.IAuthTabCallback(this.$authPasswordHash));
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (this.$appliesUserSalt) {
            EstimateFaceQualityFromBGRImage estimateFaceQualityFromBGRImage2 = EstimateFaceQualityFromBGRImage.IAuthTabCallback;
            Object[] objArr2 = {estimateFaceQualityFromBGRImage2, this.$encryptedPrivateKey, PageKey.onWarmupCompleted(this.$loginPasswordHash, (Charset) null, 1, (Object) null)};
            int iIAuthTabCallback3 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
            int iIAuthTabCallback4 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
            return estimateFaceQualityFromBGRImage2.IAuthTabCallback((String) EstimateFaceQualityFromBGRImage.onWarmupCompleted(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), 2046127422, objArr2, -2046127422, iIAuthTabCallback3, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback4), getPageContainer.IAuthTabCallback(this.$authPasswordHash));
        }
        return this.$encryptedPrivateKey;
    }
}
