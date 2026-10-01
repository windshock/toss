package im.toss.features.home.presentation.dst_investment_portfolio.page;

import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.internal.ads.zziea;
import im.toss.uikit.widget.TdsSegmentedControlV1View;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.access13800;
import o.access14300;
import o.findResAndMsg;
import o.formatMsgs;
import o.getAuthContentResult;
import o.isReceivedRemoteReady;

/* loaded from: /tmp/toss_alldex/classes16.dex */
final class HomeDstInvestmentProductFragment$onExtraCallback$1$5 extends SuspendLambda implements Function2<List<? extends isReceivedRemoteReady.onNavigationEvent>, access13800<? super Unit>, Object> {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    final /* synthetic */ findResAndMsg $$this$repeatOnLifecycle;
    final /* synthetic */ getAuthContentResult $binding;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ HomeDstInvestmentProductFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomeDstInvestmentProductFragment$onExtraCallback$1$5(HomeDstInvestmentProductFragment homeDstInvestmentProductFragment, getAuthContentResult getauthcontentresult, findResAndMsg findresandmsg, access13800<? super HomeDstInvestmentProductFragment$onExtraCallback$1$5> access13800Var) {
        super(2, access13800Var);
        this.this$0 = homeDstInvestmentProductFragment;
        this.$binding = getauthcontentresult;
        this.$$this$repeatOnLifecycle = findresandmsg;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        HomeDstInvestmentProductFragment$onExtraCallback$1$5 homeDstInvestmentProductFragment$onExtraCallback$1$5 = new HomeDstInvestmentProductFragment$onExtraCallback$1$5(this.this$0, this.$binding, this.$$this$repeatOnLifecycle, access13800Var);
        homeDstInvestmentProductFragment$onExtraCallback$1$5.L$0 = obj;
        int i2 = onExtraCallbackWithResult + 67;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return homeDstInvestmentProductFragment$onExtraCallback$1$5;
        }
        throw null;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        IAuthTabCallback = i2 % 128;
        List<isReceivedRemoteReady.onNavigationEvent> list = (List) obj;
        access13800<? super Unit> access13800Var = (access13800) obj2;
        if (i2 % 2 == 0) {
            onNavigationEvent(list, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        Object objOnNavigationEvent = onNavigationEvent(list, access13800Var);
        int i3 = IAuthTabCallback + 89;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 45 / 0;
        }
        return objOnNavigationEvent;
    }

    public final Object onNavigationEvent(List<isReceivedRemoteReady.onNavigationEvent> list, access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 103;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object objInvokeSuspend = create(list, access13800Var).invokeSuspend(Unit.INSTANCE);
        int i4 = IAuthTabCallback + 51;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return objInvokeSuspend;
    }

    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        List list = (List) this.L$0;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i2 = onExtraCallbackWithResult + 21;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        ResultKt.onNavigationEvent(obj);
        if (HomeDstInvestmentProductFragment.onWarmupCompleted(this.this$0).onNavigationEvent(list)) {
            TdsSegmentedControlV1View tdsSegmentedControlV1View = this.$binding.IAuthTabCallbackDefault;
            int iIAuthTabCallback = zziea.IAuthTabCallback();
            int iIAuthTabCallback2 = zziea.IAuthTabCallback();
            int iIAuthTabCallback3 = zziea.IAuthTabCallback();
            TdsSegmentedControlV1View.IAuthTabCallback(959335738, zziea.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback, iIAuthTabCallback3, new Object[]{tdsSegmentedControlV1View}, -959335735);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                tdsSegmentedControlV1View.onWarmupCompleted(((isReceivedRemoteReady.onNavigationEvent) it.next()).onWarmupCompleted());
            }
        }
        ViewPager2 viewPager2 = this.$binding.onTransact;
        Intrinsics.checkNotNullExpressionValue(viewPager2, "");
        viewPager2.addOnLayoutChangeListener(new onExtraCallback(list, this.$binding, this.this$0, this.$$this$repeatOnLifecycle));
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 91;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ getAuthContentResult $binding;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(getAuthContentResult getauthcontentresult, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$binding = getauthcontentresult;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$binding, access13800Var);
            int i2 = IAuthTabCallback + 9;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return onwarmupcompleted;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 17;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 101;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnExtraCallbackWithResult;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 125;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 65;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = IAuthTabCallback;
                int i4 = i3 + 115;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0 ? i2 != 1 : i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = i3 + 111;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(50L, this) == objOnWarmupCompleted) {
                    int i7 = onNavigationEvent + 1;
                    IAuthTabCallback = i7 % 128;
                    int i8 = i7 % 2;
                    return objOnWarmupCompleted;
                }
            }
            this.$binding.onExtraCallback.setExpanded(false, false);
            return Unit.INSTANCE;
        }
    }
}
