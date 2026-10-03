package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import im.toss.base.BaseActivity;
import im.toss.tds.view.component.compound.listheader.TdsListHeaderV2View;
import im.toss.utils.RxUtils;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.isTagged;
import o.setSignatureKey;
import o.toHashtable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class isTagged extends RecipientIdentifier<getKeyIdentifier> {
    private final TextView ICustomTabsCallback;
    private final View extraCallback;
    private final ViewGroup onActivityLayout;
    private deserializeUriNullableCollection onMessageChannelReady;
    private final TdsListHeaderV2View writeTypedObject;

    public static /* synthetic */ void IAuthTabCallback(toHashtable.IAuthTabCallback iAuthTabCallback, View view) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public isTagged(@NotNull View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        this.writeTypedObject = view.findViewById(R.id.listHeader);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.refreshLayout);
        this.onActivityLayout = viewGroup;
        this.extraCallback = viewGroup.findViewById(R.id.lastSyncTimeLayout);
        this.ICustomTabsCallback = (TextView) viewGroup.findViewById(R.id.lastSyncTimeText);
    }

    @Override // o.RecipientIdentifier
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public void onExtraCallbackWithResult(@NotNull final getKeyIdentifier getkeyidentifier, @Nullable final toHashtable.IAuthTabCallback iAuthTabCallback) {
        Intrinsics.checkNotNullParameter(getkeyidentifier, "");
        this.writeTypedObject.setTitle(getkeyidentifier.onWarmupCompleted());
        this.writeTypedObject.setBorder(getkeyidentifier.onExtraCallbackWithResult());
        if (getkeyidentifier.IAuthTabCallback()) {
            ViewGroup viewGroup = this.onActivityLayout;
            Intrinsics.checkNotNullExpressionValue(viewGroup, "");
            viewGroup.setVisibility(0);
            this.extraCallback.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.card.viewholder.UserCardTransactionSummaryViewHolder$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    isTagged.IAuthTabCallback(iAuthTabCallback, view);
                }
            });
            this.ICustomTabsCallback.setText(getkeyidentifier.onNavigationEvent());
            ViewGroup viewGroup2 = this.onActivityLayout;
            Intrinsics.checkNotNullExpressionValue(viewGroup2, "");
            UST_PKCS12_MakePFX.onExtraCallback(viewGroup2, getkeyidentifier.onExtraCallback());
            deserializeUriNullableCollection deserializeurinullablecollection = this.onMessageChannelReady;
            if (deserializeurinullablecollection != null) {
                zzbr.onWarmupCompleted(deserializeurinullablecollection);
            }
            if (getkeyidentifier.onExtraCallback().isSuccess() || (getkeyidentifier.onExtraCallback().isError() && getkeyidentifier.onNavigationEvent().length() > 0)) {
                writeRaw writerawIAuthTabCallback = writeRaw.onExtraCallback(setSignatureKey.NONE).IAuthTabCallback(1500L, TimeUnit.MILLISECONDS);
                Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
                writeRaw writerawIAuthTabCallback2 = writerawIAuthTabCallback.IAuthTabCallback(RxUtils.onExtraCallbackWithResult((Object) null));
                Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback2, "");
                final Function1 function1 = new Function1() { // from class: viva.republica.toss.card.viewholder.UserCardTransactionSummaryViewHolder$$ExternalSyntheticLambda1
                    public final Object invoke(Object obj) {
                        return isTagged.onExtraCallbackWithResult(getkeyidentifier, this, (setSignatureKey) obj);
                    }
                };
                deserializeFloat deserializefloat = new deserializeFloat() { // from class: viva.republica.toss.card.viewholder.UserCardTransactionSummaryViewHolder$$ExternalSyntheticLambda2
                    public final void accept(Object obj) {
                        isTagged.onExtraCallback(function1, obj);
                    }
                };
                final Function1 function12 = new Function1() { // from class: viva.republica.toss.card.viewholder.UserCardTransactionSummaryViewHolder$$ExternalSyntheticLambda3
                    public final Object invoke(Object obj) {
                        return isTagged.onExtraCallbackWithResult((Throwable) obj);
                    }
                };
                this.onMessageChannelReady = writerawIAuthTabCallback2.onNavigationEvent(deserializefloat, new deserializeFloat() { // from class: viva.republica.toss.card.viewholder.UserCardTransactionSummaryViewHolder$$ExternalSyntheticLambda4
                    public final void accept(Object obj) {
                        isTagged.IAuthTabCallback(function12, obj);
                    }
                });
                BaseActivity baseActivityOnWarmupCompleted = onJsBridgeReady.onWarmupCompleted(onExtraCallbackWithResult());
                if (baseActivityOnWarmupCompleted != null) {
                    deserializeUriNullableCollection deserializeurinullablecollection2 = this.onMessageChannelReady;
                    Intrinsics.checkNotNull(deserializeurinullablecollection2);
                    baseActivityOnWarmupCompleted.addSubscription(deserializeurinullablecollection2);
                    return;
                }
                return;
            }
            return;
        }
        ViewGroup viewGroup3 = this.onActivityLayout;
        Intrinsics.checkNotNullExpressionValue(viewGroup3, "");
        viewGroup3.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallback(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(getKeyIdentifier getkeyidentifier, isTagged istagged, setSignatureKey setsignaturekey) {
        Intrinsics.checkNotNull(setsignaturekey);
        getkeyidentifier.onExtraCallback(setsignaturekey);
        ViewGroup viewGroup = istagged.onActivityLayout;
        Intrinsics.checkNotNullExpressionValue(viewGroup, "");
        UST_PKCS12_MakePFX.onExtraCallback(viewGroup, setsignaturekey);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IAuthTabCallback(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(Throwable th) {
        return Unit.INSTANCE;
    }
}
