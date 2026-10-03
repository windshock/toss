package o;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.shimmer.ShimmerFrameLayout;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import kotlin.jvm.internal.Intrinsics;
import o.getCRLs;
import o.toHashtable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getCRLs extends RecipientIdentifier<getRecipientInfos> {
    private final TextView ICustomTabsCallback;
    private final TextView extraCallback;
    private final ShimmerFrameLayout onPostMessage;
    private final ImageView writeTypedObject;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getCRLs(@NotNull View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        this.writeTypedObject = (ImageView) view.findViewById(R.id.cardImage);
        this.extraCallback = (TextView) view.findViewById(R.id.monthText);
        this.ICustomTabsCallback = (TextView) view.findViewById(R.id.totalAmount);
        this.onPostMessage = view.findViewById(R.id.totalAmountLoading);
    }

    @Override // o.RecipientIdentifier
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public void onExtraCallbackWithResult(@NotNull final getRecipientInfos getrecipientinfos, @Nullable toHashtable.IAuthTabCallback iAuthTabCallback) {
        int i;
        Intrinsics.checkNotNullParameter(getrecipientinfos, "");
        nativeToCircleWithBorderFilter nativetocirclewithborderfilterIAuthTabCallback = getrecipientinfos.IAuthTabCallback();
        int iOnExtraCallback = getrecipientinfos.onExtraCallback();
        OriginatorIdentifierOrKey originatorIdentifierOrKey = OriginatorIdentifierOrKey.onExtraCallbackWithResult;
        String strOnNavigationEvent = nativetocirclewithborderfilterIAuthTabCallback != null ? nativetocirclewithborderfilterIAuthTabCallback.onNavigationEvent() : null;
        ImageView imageView = this.writeTypedObject;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        originatorIdentifierOrKey.onExtraCallbackWithResult(strOnNavigationEvent, imageView, true, (248 & 8) != 0 ? 0 : 0, (248 & 16) != 0 ? 0 : 0, (248 & 32) != 0 ? null : null, (248 & 64) != 0, (248 & 128) != 0 ? null : null);
        ShimmerFrameLayout shimmerFrameLayout = this.onPostMessage;
        Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout, "");
        shimmerFrameLayout.setVisibility(nativetocirclewithborderfilterIAuthTabCallback == null ? 0 : 8);
        TextView textView = this.ICustomTabsCallback;
        textView.setText(getLongName.onNavigationEvent(nativetocirclewithborderfilterIAuthTabCallback != null ? nativetocirclewithborderfilterIAuthTabCallback.onExtraCallbackWithResult() : 0L, (ParamImpl) null, 1, (Object) null));
        Intrinsics.checkNotNull(textView);
        textView.setVisibility(nativetocirclewithborderfilterIAuthTabCallback != null ? 0 : 8);
        if (iOnExtraCallback == 0) {
            this.extraCallback.setText(onExtraCallbackWithResult().getString(R.string.app_amount_spent_this_month));
        } else {
            Calendar calendarOnNavigationEvent = zzaj.onWarmupCompleted().onNavigationEvent();
            calendarOnNavigationEvent.add(2, iOnExtraCallback);
            boolean z = calendarOnNavigationEvent.get(1) == zzaj.onWarmupCompleted().onNavigationEvent().get(1);
            Context contextOnExtraCallbackWithResult = onExtraCallbackWithResult();
            if (z) {
                i = R.string.app_plcc_amount_spent_in_month;
            } else {
                i = R.string.app_plcc_amount_spent_in_year_month;
            }
            this.extraCallback.setText(new SimpleDateFormat(contextOnExtraCallbackWithResult.getString(i)).format(calendarOnNavigationEvent.getTime()));
        }
        this.extraCallback.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.card.viewholder.PlccCardTransactionHeaderViewHolder$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                getCRLs.onExtraCallback(getrecipientinfos, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallback(getRecipientInfos getrecipientinfos, View view) {
        getrecipientinfos.onWarmupCompleted().invoke();
    }
}
