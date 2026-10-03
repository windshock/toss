package o;

import android.content.Context;
import im.toss.base.BaseActivity;
import im.toss.utils.RxUtils;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.toRealPath;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.account.detail.viewmodel.header.FilterViewModel$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getIv6 extends toRealPath {
    private Long IAuthTabCallback;
    private final boolean IAuthTabCallbackDefault;
    private deserializeUriNullableCollection IAuthTabCallbackStub;
    private setSignatureKey onExtraCallback;
    private String onExtraCallbackWithResult;
    private final Context onNavigationEvent;
    private final onNavigationEvent onWarmupCompleted;

    public interface onNavigationEvent {
        default void ICustomTabsService_Parcel() {
        }

        void validateRelationship();
    }

    public /* synthetic */ getIv6(Context context, onNavigationEvent onnavigationevent, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, onnavigationevent, (i & 4) != 0 ? false : z);
    }

    public final boolean onTransact() {
        return this.IAuthTabCallbackDefault;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getIv6(@NotNull Context context, @NotNull onNavigationEvent onnavigationevent, boolean z) {
        super(toRealPath.onNavigationEvent.FILTER);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        this.onNavigationEvent = context;
        this.onWarmupCompleted = onnavigationevent;
        this.IAuthTabCallbackDefault = z;
        String string = context.getString(ResultUtil.ALL.getTypeTextResId());
        Intrinsics.checkNotNullExpressionValue(string, "");
        this.onExtraCallbackWithResult = string;
        this.onExtraCallback = setSignatureKey.NONE;
    }

    public long onWarmupCompleted() {
        onNavigationEvent onnavigationevent = this.onWarmupCompleted;
        String str = this.onExtraCallbackWithResult;
        return (onnavigationevent + str).hashCode();
    }

    public final String IAuthTabCallback() {
        return this.onExtraCallbackWithResult;
    }

    public final void onWarmupCompleted(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.onExtraCallbackWithResult = str;
        onExtraCallback(ContextMenuUiKtExternalSyntheticLambda0.onExtraCallback);
    }

    public final setSignatureKey onExtraCallback() {
        return this.onExtraCallback;
    }

    public final void IAuthTabCallback(@NotNull setSignatureKey setsignaturekey) {
        Intrinsics.checkNotNullParameter(setsignaturekey, "");
        this.onExtraCallback = setsignaturekey;
        onExtraCallback(ContextMenuUiKtExternalSyntheticLambda0.onTransact);
        deserializeUriNullableCollection deserializeurinullablecollection = this.IAuthTabCallbackStub;
        if (deserializeurinullablecollection != null) {
            zzbr.onWarmupCompleted(deserializeurinullablecollection);
        }
        if (!setsignaturekey.isSuccess()) {
            if (!setsignaturekey.isError()) {
                return;
            }
            Long l = this.IAuthTabCallback;
            if ((l != null ? l.longValue() : 0L) <= 0) {
                return;
            }
        }
        writeRaw writerawIAuthTabCallback = writeRaw.onExtraCallback(setSignatureKey.NONE).IAuthTabCallback(1500L, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
        writeRaw writerawIAuthTabCallback2 = writerawIAuthTabCallback.IAuthTabCallback(RxUtils.onExtraCallbackWithResult((Object) null));
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback2, "");
        this.IAuthTabCallbackStub = writerawIAuthTabCallback2.onNavigationEvent(new FilterViewModel$.ExternalSyntheticLambda1(new FilterViewModel$.ExternalSyntheticLambda0(this)), new FilterViewModel$.ExternalSyntheticLambda3(new FilterViewModel$.ExternalSyntheticLambda2()));
        BaseActivity baseActivityOnWarmupCompleted = onJsBridgeReady.onWarmupCompleted(this.onNavigationEvent);
        if (baseActivityOnWarmupCompleted != null) {
            deserializeUriNullableCollection deserializeurinullablecollection2 = this.IAuthTabCallbackStub;
            Intrinsics.checkNotNull(deserializeurinullablecollection2);
            baseActivityOnWarmupCompleted.addSubscription(deserializeurinullablecollection2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onWarmupCompleted(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(getIv6 getiv6, setSignatureKey setsignaturekey) {
        Intrinsics.checkNotNull(setsignaturekey);
        getiv6.IAuthTabCallback(setsignaturekey);
        getiv6.onExtraCallback(ContextMenuUiKtExternalSyntheticLambda0.onTransact);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallback(Throwable th) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallback(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public final String onNavigationEvent() {
        Long l = this.IAuthTabCallback;
        if ((l != null ? l.longValue() : 0L) <= 0) {
            return "";
        }
        commonTestFlag commontestflag = commonTestFlag.onExtraCallback;
        Context context = this.onNavigationEvent;
        Long l2 = this.IAuthTabCallback;
        return commontestflag.onWarmupCompleted(context, l2 != null ? l2.longValue() : 0L);
    }

    public final void asInterface() {
        this.onWarmupCompleted.validateRelationship();
    }

    public final void asBinder() {
        this.onWarmupCompleted.ICustomTabsService_Parcel();
    }
}
