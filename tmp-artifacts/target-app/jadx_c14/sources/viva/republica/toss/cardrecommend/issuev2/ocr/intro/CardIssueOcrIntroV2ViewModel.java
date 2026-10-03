package viva.republica.toss.cardrecommend.issuev2.ocr.intro;

import android.app.Application;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CloseableUtils;
import o.ProcessTextApi23ImplExternalSyntheticLambda0;
import o.TextFieldCursorKtExternalSyntheticLambda1;
import o.TextLinkScopeExternalSyntheticLambda7;
import o.access13800;
import o.access14300;
import o.encodeUTF8;
import o.findResAndMsg;
import o.getBorderRadius;
import o.getCornerRadius;
import o.getCreatorConstructor;
import o.getPackageType;
import o.getShine;
import o.getTileModeX;
import o.isIdent;
import o.maybeUpdateAnimatable;
import o.setRandomHost;
import o.setRubIn;
import o.setShine;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CardIssueOcrIntroV2ViewModel extends TextFieldCursorKtExternalSyntheticLambda1 {
    private final getTileModeX<onExtraCallbackWithResult> IAuthTabCallback;
    private final setRubIn<Boolean> IAuthTabCallbackDefault;
    private getPackageType IAuthTabCallbackStub;
    private final encodeUTF8 asBinder;
    private final TextLinkScopeExternalSyntheticLambda7 asInterface;
    private boolean onExtraCallback;
    private final getCornerRadius<Boolean> onExtraCallbackWithResult;
    private isIdent onNavigationEvent;
    private boolean onTransact;
    private final getBorderRadius<onExtraCallbackWithResult> onWarmupCompleted;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public CardIssueOcrIntroV2ViewModel(@NotNull Application application, @NotNull TextLinkScopeExternalSyntheticLambda7 textLinkScopeExternalSyntheticLambda7, @NotNull encodeUTF8 encodeutf8) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(textLinkScopeExternalSyntheticLambda7, "");
        Intrinsics.checkNotNullParameter(encodeutf8, "");
        this.asInterface = textLinkScopeExternalSyntheticLambda7;
        this.asBinder = encodeutf8;
        getCornerRadius<Boolean> getcornerradiusOnNavigationEvent = setShine.onNavigationEvent(Boolean.FALSE);
        this.onExtraCallbackWithResult = getcornerradiusOnNavigationEvent;
        this.IAuthTabCallbackDefault = getcornerradiusOnNavigationEvent;
        getBorderRadius<onExtraCallbackWithResult> getborderradiusOnWarmupCompleted = getShine.onWarmupCompleted(0, 0, (CloseableUtils) null, 7, (Object) null);
        this.onWarmupCompleted = getborderradiusOnWarmupCompleted;
        this.IAuthTabCallback = getborderradiusOnWarmupCompleted;
        onTransact();
    }

    public final setRubIn<Boolean> asBinder() {
        return this.IAuthTabCallbackDefault;
    }

    public final getTileModeX<onExtraCallbackWithResult> onNavigationEvent() {
        return this.IAuthTabCallback;
    }

    public final boolean onExtraCallbackWithResult() {
        return this.onTransact;
    }

    public final void onWarmupCompleted(boolean z) {
        this.onTransact = z;
    }

    public final getCreatorConstructor onExtraCallback() {
        getCreatorConstructor getcreatorconstructor = (getCreatorConstructor) this.asInterface.onExtraCallback("EXTRA_IDENTITY_DOCUMENT_TYPE");
        return getcreatorconstructor == null ? getCreatorConstructor.ID_CARD : getcreatorconstructor;
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        Object L$0;
        int label;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return CardIssueOcrIntroV2ViewModel.this.new IAuthTabCallback(access13800Var);
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            CardIssueOcrIntroV2ViewModel cardIssueOcrIntroV2ViewModel;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                CardIssueOcrIntroV2ViewModel cardIssueOcrIntroV2ViewModel2 = CardIssueOcrIntroV2ViewModel.this;
                encodeUTF8 encodeutf8 = cardIssueOcrIntroV2ViewModel2.asBinder;
                Application applicationOnWarmupCompleted = CardIssueOcrIntroV2ViewModel.this.onWarmupCompleted();
                this.L$0 = cardIssueOcrIntroV2ViewModel2;
                this.label = 1;
                Object objOnWarmupCompleted2 = encodeUTF8.onWarmupCompleted(encodeutf8, applicationOnWarmupCompleted, false, false, this, 6, (Object) null);
                if (objOnWarmupCompleted2 == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
                cardIssueOcrIntroV2ViewModel = cardIssueOcrIntroV2ViewModel2;
                obj = objOnWarmupCompleted2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cardIssueOcrIntroV2ViewModel = (CardIssueOcrIntroV2ViewModel) this.L$0;
                ResultKt.onNavigationEvent(obj);
            }
            cardIssueOcrIntroV2ViewModel.onNavigationEvent = (isIdent) obj;
            return Unit.INSTANCE;
        }
    }

    public final void onTransact() {
        this.IAuthTabCallbackStub = maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallback(null), 3, (Object) null);
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int label;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return CardIssueOcrIntroV2ViewModel.this.new onWarmupCompleted(access13800Var);
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x0092, code lost:
        
            if (r6.emit(r1, r5) == r0) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00a9, code lost:
        
            if (r6.emit(r1, r5) == r0) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00bb, code lost:
        
            if (r6.emit(r1, r5) == r0) goto L39;
         */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = o.access14300.onWarmupCompleted()
                int r1 = r5.label
                r2 = 2
                r3 = 1
                switch(r1) {
                    case 0: goto L24;
                    case 1: goto L20;
                    case 2: goto L1c;
                    case 3: goto L18;
                    case 4: goto L13;
                    case 5: goto L13;
                    case 6: goto L13;
                    default: goto Lb;
                }
            Lb:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L13:
                kotlin.ResultKt.onNavigationEvent(r6)
                goto Lbe
            L18:
                kotlin.ResultKt.onNavigationEvent(r6)
                goto L5d
            L1c:
                kotlin.ResultKt.onNavigationEvent(r6)
                goto L49
            L20:
                kotlin.ResultKt.onNavigationEvent(r6)
                goto L39
            L24:
                kotlin.ResultKt.onNavigationEvent(r6)
                viva.republica.toss.cardrecommend.issuev2.ocr.intro.CardIssueOcrIntroV2ViewModel r6 = viva.republica.toss.cardrecommend.issuev2.ocr.intro.CardIssueOcrIntroV2ViewModel.this
                o.getCornerRadius r6 = viva.republica.toss.cardrecommend.issuev2.ocr.intro.CardIssueOcrIntroV2ViewModel.onNavigationEvent(r6)
                java.lang.Boolean r1 = o.access14000.onNavigationEvent(r3)
                r5.label = r3
                java.lang.Object r6 = r6.emit(r1, r5)
                if (r6 == r0) goto Lc1
            L39:
                viva.republica.toss.cardrecommend.issuev2.ocr.intro.CardIssueOcrIntroV2ViewModel r6 = viva.republica.toss.cardrecommend.issuev2.ocr.intro.CardIssueOcrIntroV2ViewModel.this
                o.getPackageType r6 = viva.republica.toss.cardrecommend.issuev2.ocr.intro.CardIssueOcrIntroV2ViewModel.onExtraCallbackWithResult(r6)
                if (r6 == 0) goto L49
                r5.label = r2
                java.lang.Object r6 = r6.onNavigationEvent(r5)
                if (r6 == r0) goto Lc1
            L49:
                viva.republica.toss.cardrecommend.issuev2.ocr.intro.CardIssueOcrIntroV2ViewModel r6 = viva.republica.toss.cardrecommend.issuev2.ocr.intro.CardIssueOcrIntroV2ViewModel.this
                o.getCornerRadius r6 = viva.republica.toss.cardrecommend.issuev2.ocr.intro.CardIssueOcrIntroV2ViewModel.onNavigationEvent(r6)
                r1 = 0
                java.lang.Boolean r1 = o.access14000.onNavigationEvent(r1)
                r4 = 3
                r5.label = r4
                java.lang.Object r6 = r6.emit(r1, r5)
                if (r6 == r0) goto Lc1
            L5d:
                viva.republica.toss.cardrecommend.issuev2.ocr.intro.CardIssueOcrIntroV2ViewModel r6 = viva.republica.toss.cardrecommend.issuev2.ocr.intro.CardIssueOcrIntroV2ViewModel.this
                boolean r6 = viva.republica.toss.cardrecommend.issuev2.ocr.intro.CardIssueOcrIntroV2ViewModel.IAuthTabCallback(r6)
                if (r6 == 0) goto L68
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
            L68:
                viva.republica.toss.cardrecommend.issuev2.ocr.intro.CardIssueOcrIntroV2ViewModel r6 = viva.republica.toss.cardrecommend.issuev2.ocr.intro.CardIssueOcrIntroV2ViewModel.this
                o.isIdent r6 = viva.republica.toss.cardrecommend.issuev2.ocr.intro.CardIssueOcrIntroV2ViewModel.asInterface(r6)
                if (r6 != 0) goto L72
                r6 = -1
                goto L7a
            L72:
                int[] r1 = viva.republica.toss.cardrecommend.issuev2.ocr.intro.CardIssueOcrIntroV2ViewModel.onWarmupCompleted.onExtraCallback.onWarmupCompleted
                int r6 = r6.ordinal()
                r6 = r1[r6]
            L7a:
                if (r6 == r3) goto Lac
                if (r6 == r2) goto L95
                viva.republica.toss.cardrecommend.issuev2.ocr.intro.CardIssueOcrIntroV2ViewModel r6 = viva.republica.toss.cardrecommend.issuev2.ocr.intro.CardIssueOcrIntroV2ViewModel.this
                o.getBorderRadius r6 = viva.republica.toss.cardrecommend.issuev2.ocr.intro.CardIssueOcrIntroV2ViewModel.onWarmupCompleted(r6)
                viva.republica.toss.cardrecommend.issuev2.ocr.intro.CardIssueOcrIntroV2ViewModel$onExtraCallbackWithResult$onExtraCallbackWithResult r1 = new viva.republica.toss.cardrecommend.issuev2.ocr.intro.CardIssueOcrIntroV2ViewModel$onExtraCallbackWithResult$onExtraCallbackWithResult
                o.isIdent r2 = o.isIdent.NETWORK_ERROR
                r1.<init>(r2)
                r2 = 6
                r5.label = r2
                java.lang.Object r6 = r6.emit(r1, r5)
                if (r6 != r0) goto Lbe
                goto Lc1
            L95:
                viva.republica.toss.cardrecommend.issuev2.ocr.intro.CardIssueOcrIntroV2ViewModel r6 = viva.republica.toss.cardrecommend.issuev2.ocr.intro.CardIssueOcrIntroV2ViewModel.this
                o.getBorderRadius r6 = viva.republica.toss.cardrecommend.issuev2.ocr.intro.CardIssueOcrIntroV2ViewModel.onWarmupCompleted(r6)
                viva.republica.toss.cardrecommend.issuev2.ocr.intro.CardIssueOcrIntroV2ViewModel$onExtraCallbackWithResult$onExtraCallbackWithResult r1 = new viva.republica.toss.cardrecommend.issuev2.ocr.intro.CardIssueOcrIntroV2ViewModel$onExtraCallbackWithResult$onExtraCallbackWithResult
                o.isIdent r2 = o.isIdent.STORAGE_ERROR
                r1.<init>(r2)
                r2 = 5
                r5.label = r2
                java.lang.Object r6 = r6.emit(r1, r5)
                if (r6 != r0) goto Lbe
                goto Lc1
            Lac:
                viva.republica.toss.cardrecommend.issuev2.ocr.intro.CardIssueOcrIntroV2ViewModel r6 = viva.republica.toss.cardrecommend.issuev2.ocr.intro.CardIssueOcrIntroV2ViewModel.this
                o.getBorderRadius r6 = viva.republica.toss.cardrecommend.issuev2.ocr.intro.CardIssueOcrIntroV2ViewModel.onWarmupCompleted(r6)
                viva.republica.toss.cardrecommend.issuev2.ocr.intro.CardIssueOcrIntroV2ViewModel$onExtraCallbackWithResult$onWarmupCompleted r1 = viva.republica.toss.cardrecommend.issuev2.ocr.intro.CardIssueOcrIntroV2ViewModel.onExtraCallbackWithResult.onWarmupCompleted.onExtraCallbackWithResult
                r2 = 4
                r5.label = r2
                java.lang.Object r6 = r6.emit(r1, r5)
                if (r6 != r0) goto Lbe
                goto Lc1
            Lbe:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
            Lc1:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.cardrecommend.issuev2.ocr.intro.CardIssueOcrIntroV2ViewModel.onWarmupCompleted.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void IAuthTabCallback() {
        maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), (CoroutineContext) null, (setRandomHost) null, new onWarmupCompleted(null), 3, (Object) null);
    }

    public interface onExtraCallbackWithResult {

        public static final class onWarmupCompleted implements onExtraCallbackWithResult {
            public static final onWarmupCompleted onExtraCallbackWithResult = new onWarmupCompleted();

            private onWarmupCompleted() {
            }
        }

        /* renamed from: viva.republica.toss.cardrecommend.issuev2.ocr.intro.CardIssueOcrIntroV2ViewModel$onExtraCallbackWithResult$onExtraCallbackWithResult, reason: collision with other inner class name */
        public static final class C0024onExtraCallbackWithResult implements onExtraCallbackWithResult {
            private final isIdent onWarmupCompleted;

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0024onExtraCallbackWithResult) && this.onWarmupCompleted == ((C0024onExtraCallbackWithResult) obj).onWarmupCompleted;
            }

            public int hashCode() {
                return this.onWarmupCompleted.hashCode();
            }

            public String toString() {
                return "FailDownloadSsaModelFile(reason=" + this.onWarmupCompleted + ")";
            }

            public C0024onExtraCallbackWithResult(@NotNull isIdent isident) {
                Intrinsics.checkNotNullParameter(isident, "");
                this.onWarmupCompleted = isident;
            }
        }
    }
}
