package o;

import android.os.Bundle;
import android.view.View;
import im.toss.uikit.widget.Banner;
import java.util.Arrays;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.getOriginatorKey;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getOriginatorKey extends RecipientIdentifier<CMSObjectIdentifiers> {
    private Date ICustomTabsCallback;
    private final Banner extraCallback;
    private deserializeUriNullableCollection onMessageChannelReady;
    private Function0<Unit> writeTypedObject;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getOriginatorKey(@NotNull View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        Banner banner = (Banner) view;
        this.extraCallback = banner;
        banner.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: o.getOriginatorKey.2
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view2) {
                Intrinsics.checkNotNullParameter(view2, "");
                if (getOriginatorKey.this.ICustomTabsCallback != null) {
                    getOriginatorKey.this.onWarmupCompleted();
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view2) {
                Intrinsics.checkNotNullParameter(view2, "");
                getOriginatorKey.this.onExtraCallback();
            }
        });
    }

    @Override // o.RecipientIdentifier
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public void IAuthTabCallback(@NotNull final CMSObjectIdentifiers cMSObjectIdentifiers) {
        Intrinsics.checkNotNullParameter(cMSObjectIdentifiers, "");
        Banner banner = this.extraCallback;
        banner.setTitle(cMSObjectIdentifiers.IAuthTabCallbackStub());
        banner.setBackgroundColor(cMSObjectIdentifiers.onExtraCallbackWithResult());
        this.ICustomTabsCallback = cMSObjectIdentifiers.IAuthTabCallback();
        this.writeTypedObject = cMSObjectIdentifiers.asBinder();
        if (cMSObjectIdentifiers.IAuthTabCallback() != null) {
            onWarmupCompleted();
        } else {
            onExtraCallback();
            banner.setDescription2(cMSObjectIdentifiers.onNavigationEvent());
        }
        String strIAuthTabCallbackDefault = cMSObjectIdentifiers.IAuthTabCallbackDefault();
        if (strIAuthTabCallbackDefault != null) {
            banner.setVideoUrl(strIAuthTabCallbackDefault);
        } else {
            banner.setImageUrl(cMSObjectIdentifiers.onWarmupCompleted());
        }
        final String strOnExtraCallback = cMSObjectIdentifiers.onExtraCallback();
        if (strOnExtraCallback != null) {
            banner.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.card.viewholder.BannerViewHolder$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    getOriginatorKey.onWarmupCompleted(strOnExtraCallback, cMSObjectIdentifiers, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onWarmupCompleted(String str, CMSObjectIdentifiers cMSObjectIdentifiers, View view) {
        SessionTrackerb.onExtraCallbackWithResult(resumeForClick.asBinder, view.getContext(), str, false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        Function1<View, Unit> function1AsInterface = cMSObjectIdentifiers.asInterface();
        if (function1AsInterface != null) {
            Intrinsics.checkNotNull(view);
            function1AsInterface.invoke(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onWarmupCompleted() {
        deserializeUriNullableCollection deserializeurinullablecollection = this.onMessageChannelReady;
        if (deserializeurinullablecollection != null) {
            deserializeurinullablecollection.dispose();
        }
        final Date date = this.ICustomTabsCallback;
        if (date == null || !this.extraCallback.isAttachedToWindow()) {
            return;
        }
        if (date.before(zzaj.onWarmupCompleted().asBinder())) {
            onNavigationEvent();
            return;
        }
        getByteBuffer getbytebufferOnNavigationEvent = getByteBuffer.onNavigationEvent(0L, 500L, TimeUnit.MILLISECONDS);
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.card.viewholder.BannerViewHolder$$ExternalSyntheticLambda2
            public final Object invoke(Object obj) {
                return getOriginatorKey.onWarmupCompleted(date, (Long) obj);
            }
        };
        getByteBuffer getbytebufferAsInterface = getbytebufferOnNavigationEvent.asInterface(new deserializeIntNullableCollection() { // from class: viva.republica.toss.card.viewholder.BannerViewHolder$$ExternalSyntheticLambda3
            public final Object apply(Object obj) {
                return getOriginatorKey.IAuthTabCallback(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: viva.republica.toss.card.viewholder.BannerViewHolder$$ExternalSyntheticLambda4
            public final Object invoke(Object obj) {
                return Boolean.valueOf(getOriginatorKey.IAuthTabCallback(this.f$0, (Long) obj));
            }
        };
        getByteBuffer getbytebufferIAuthTabCallback = getbytebufferAsInterface.IAuthTabCallback(new deserializeLongCollection() { // from class: viva.republica.toss.card.viewholder.BannerViewHolder$$ExternalSyntheticLambda5
            public final boolean test(Object obj) {
                return getOriginatorKey.onNavigationEvent(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: viva.republica.toss.card.viewholder.BannerViewHolder$$ExternalSyntheticLambda6
            public final Object invoke(Object obj) {
                return getOriginatorKey.onNavigationEvent((Long) obj);
            }
        };
        getByteBuffer getbytebufferOnExtraCallbackWithResult = getbytebufferIAuthTabCallback.asInterface(new deserializeIntNullableCollection() { // from class: viva.republica.toss.card.viewholder.BannerViewHolder$$ExternalSyntheticLambda7
            public final Object apply(Object obj) {
                return getOriginatorKey.asBinder(function13, obj);
            }
        }).asBinder().onExtraCallbackWithResult(NetConverter3.onExtraCallback());
        Intrinsics.checkNotNullExpressionValue(getbytebufferOnExtraCallbackWithResult, "");
        this.onMessageChannelReady = setMessageBytes.onExtraCallbackWithResult(getbytebufferOnExtraCallbackWithResult, (Function1) null, (Function0) null, new Function1() { // from class: viva.republica.toss.card.viewholder.BannerViewHolder$$ExternalSyntheticLambda8
            public final Object invoke(Object obj) {
                return getOriginatorKey.IAuthTabCallback(this.f$0, (String) obj);
            }
        }, 3, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long IAuthTabCallback(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Long) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long onWarmupCompleted(Date date, Long l) {
        Intrinsics.checkNotNullParameter(l, "");
        return Long.valueOf(date.getTime() - zzaj.onWarmupCompleted().IAuthTabCallbackDefault());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onNavigationEvent(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean IAuthTabCallback(getOriginatorKey getoriginatorkey, Long l) {
        Intrinsics.checkNotNullParameter(l, "");
        boolean z = l.longValue() < 0;
        if (z) {
            getoriginatorkey.onNavigationEvent();
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String asBinder(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (String) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onNavigationEvent(Long l) {
        Intrinsics.checkNotNullParameter(l, "");
        long jLongValue = l.longValue() / 86400000;
        long jLongValue2 = l.longValue() / 3600000;
        long jLongValue3 = l.longValue() / 60000;
        long jLongValue4 = l.longValue() / 1000;
        StringBuilder sb = new StringBuilder();
        if (jLongValue > 0) {
            sb.append(jLongValue + "일 ");
        }
        String str = String.format("%02d:%02d:%02d초 남음", Arrays.copyOf(new Object[]{Long.valueOf(jLongValue2 % 24), Long.valueOf(jLongValue3 % 60), Long.valueOf(jLongValue4 % 60)}, 3));
        Intrinsics.checkNotNullExpressionValue(str, "");
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallback(getOriginatorKey getoriginatorkey, String str) {
        getoriginatorkey.extraCallback.setDescription2(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onExtraCallback() {
        deserializeUriNullableCollection deserializeurinullablecollection = this.onMessageChannelReady;
        if (deserializeurinullablecollection != null) {
            deserializeurinullablecollection.dispose();
        }
    }

    private final void onNavigationEvent() {
        NetConverter3.onExtraCallback().onExtraCallback(new Runnable() { // from class: viva.republica.toss.card.viewholder.BannerViewHolder$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                getOriginatorKey.onExtraCallback(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallback(getOriginatorKey getoriginatorkey) {
        Function0<Unit> function0 = getoriginatorkey.writeTypedObject;
        if (function0 != null) {
            function0.invoke();
        }
        getoriginatorkey.writeTypedObject = null;
    }
}
