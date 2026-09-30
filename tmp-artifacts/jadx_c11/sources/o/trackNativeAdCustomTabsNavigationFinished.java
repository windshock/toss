package o;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import im.toss.tosssecurities.features.main.home.ui.view.section.overview.component.overlay.RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.EventServiceImplExternalSyntheticLambda0;
import o.RecomposerawaitIdle2;
import o.trackNativeAdCustomTabsNavigationFinished;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.splash.SplashSchemeActivity;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class trackNativeAdCustomTabsNavigationFinished implements trackCheckout {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 1;
    private static int asInterface;
    private final Context IAuthTabCallback;
    private final Lazy onExtraCallback;
    private final zzag onExtraCallbackWithResult;
    private final getTrackedAxonEvents onNavigationEvent;
    private static char[] onWarmupCompleted = {64966, 64985, 64991, 64961};
    private static char IAuthTabCallbackDefault = 51243;

    public static /* synthetic */ CharSequence onExtraCallbackWithResult(Context context, EventServiceImplExternalSyntheticLambda0 eventServiceImplExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = asInterface + 51;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        CharSequence charSequenceOnNavigationEvent = onNavigationEvent(context, eventServiceImplExternalSyntheticLambda0);
        if (i3 == 0) {
            int i4 = 52 / 0;
        }
        return charSequenceOnNavigationEvent;
    }

    public static /* synthetic */ AtomicInteger onWarmupCompleted(trackNativeAdCustomTabsNavigationFinished tracknativeadcustomtabsnavigationfinished) {
        int i = 2 % 2;
        int i2 = asBinder + 39;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback(tracknativeadcustomtabsnavigationfinished);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        AtomicInteger atomicIntegerIAuthTabCallback = IAuthTabCallback(tracknativeadcustomtabsnavigationfinished);
        int i3 = asInterface + 13;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return atomicIntegerIAuthTabCallback;
    }

    @Inject
    public trackNativeAdCustomTabsNavigationFinished(@NotNull zzag zzagVar, @NotNull Context context, @NotNull getTrackedAxonEvents gettrackedaxonevents) {
        Intrinsics.checkNotNullParameter(zzagVar, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(gettrackedaxonevents, "");
        this.onExtraCallbackWithResult = zzagVar;
        this.IAuthTabCallback = context;
        this.onNavigationEvent = gettrackedaxonevents;
        this.onExtraCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.splittarget.impl.notification.NotificationHelperImpl$$ExternalSyntheticLambda0
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 23;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                AtomicInteger atomicIntegerOnWarmupCompleted = trackNativeAdCustomTabsNavigationFinished.onWarmupCompleted(this.f$0);
                int i4 = onExtraCallback + 99;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return atomicIntegerOnWarmupCompleted;
            }
        });
    }

    private static final AtomicInteger IAuthTabCallback(trackNativeAdCustomTabsNavigationFinished tracknativeadcustomtabsnavigationfinished) {
        int i = 2 % 2;
        AtomicInteger atomicInteger = new AtomicInteger((int) (tracknativeadcustomtabsnavigationfinished.onExtraCallbackWithResult.IAuthTabCallbackDefault() / 1000));
        int i2 = asInterface + 95;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return atomicInteger;
    }

    @Override // o.trackCheckout
    public AtomicInteger onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asInterface + 89;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.onExtraCallback.getValue();
        if (i3 != 0) {
            return (AtomicInteger) value;
        }
        int i4 = 45 / 0;
        return (AtomicInteger) value;
    }

    @Override // o.trackCheckout
    public void onWarmupCompleted(@Nullable String str, int i, @NotNull Function1<? super trackEventSynchronously, Unit> function1) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        trackEventSynchronously trackeventsynchronously = new trackEventSynchronously();
        Context context = this.IAuthTabCallback;
        Object systemService = context.getSystemService("notification");
        Intrinsics.checkNotNull(systemService, "");
        function1.invoke(trackeventsynchronously);
        ((NotificationManager) systemService).notify(str, i, IAuthTabCallback(trackeventsynchronously, context));
        int i3 = asBinder + 125;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    private final Notification IAuthTabCallback(trackEventSynchronously trackeventsynchronously, Context context) throws Throwable {
        int i;
        int i2 = 2 % 2;
        NotificationCompat.access100 access100Var = new NotificationCompat.access100(context, trackeventsynchronously.onNavigationEvent().getId());
        access100Var.onExtraCallbackWithResult(ContextCompat.getColor(context, R.color.app_icon_color));
        access100Var.asInterface(im.toss.core.R.drawable.icon_toss_logo_mono);
        access100Var.onExtraCallback(true);
        access100Var.IAuthTabCallback(trackeventsynchronously.onExtraCallback()).IAuthTabCallbackDefault(trackeventsynchronously.onWarmupCompleted());
        Object[] objArr = {trackeventsynchronously.IAuthTabCallbackStub()};
        Uri uri = (Uri) mergeParams.onWarmupCompleted(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -846257502, nSetPosition.onExtraCallbackWithResult(), 846257509, objArr);
        if (uri != null) {
            Intent intentOnExtraCallbackWithResult = SplashSchemeActivity.onNavigationEvent.onExtraCallbackWithResult(SplashSchemeActivity.Companion, context, uri, true, (getJSQueueThread) null, 8, (Object) null);
            Object[] objArr2 = new Object[1];
            a(new char[]{1, 2, 13817}, (byte) (KeyEvent.normalizeMetaState(0) + 3), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2, objArr2);
            Object[] objArr3 = {trackeventsynchronously, intentOnExtraCallbackWithResult.putExtra(((String) objArr2[0]).intern(), uri.toString())};
            trackEventSynchronously.onExtraCallbackWithResult(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1927846129, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -1927846128, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), objArr3, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult());
            int i3 = asBinder + 39;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
        }
        if (trackeventsynchronously.onExtraCallbackWithResult() != null) {
            int i5 = asInterface + 9;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            if (Build.VERSION.SDK_INT >= 31) {
                int i7 = asBinder;
                int i8 = i7 + 5;
                asInterface = i8 % 128;
                int i9 = i8 % 2;
                int i10 = i7 + 57;
                asInterface = i10 % 128;
                int i11 = i10 % 2;
                i = 1241513984;
            } else {
                i = 1207959552;
            }
            access100Var.onExtraCallback(PendingIntent.getActivity(context, 0, trackeventsynchronously.onExtraCallbackWithResult(), i));
        }
        if (trackeventsynchronously.onTransact() != null) {
            int i12 = asBinder + 39;
            asInterface = i12 % 128;
            int i13 = i12 % 2;
            access100Var.onExtraCallback(trackeventsynchronously.onTransact());
        }
        access100Var.onExtraCallbackWithResult(new NotificationCompat.IAuthTabCallbackDefault().onNavigationEvent(trackeventsynchronously.onExtraCallback()));
        access100Var.onWarmupCompleted(trackeventsynchronously.asInterface());
        access100Var.onNavigationEvent(RingtoneManager.getDefaultUri(2));
        if (trackeventsynchronously.asBinder() != null) {
            access100Var.IAuthTabCallback(trackeventsynchronously.asBinder());
            int i14 = asBinder + 23;
            asInterface = i14 % 128;
            int i15 = i14 % 2;
        }
        onWarmupCompleted(access100Var, context, trackeventsynchronously.IAuthTabCallback());
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        access100Var.asInterface(((Boolean) trackEventSynchronously.onExtraCallbackWithResult(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 824163785, iOnExtraCallbackWithResult, -824163785, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{trackeventsynchronously}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult())).booleanValue());
        Notification notificationOnWarmupCompleted = access100Var.onWarmupCompleted();
        Intrinsics.checkNotNullExpressionValue(notificationOnWarmupCompleted, "");
        return notificationOnWarmupCompleted;
    }

    private final NotificationCompat.access100 onWarmupCompleted(NotificationCompat.access100 access100Var, Context context, String str) {
        Bitmap bitmapOnExtraCallbackWithResult;
        int i = 2 % 2;
        if (str != null) {
            Bitmap bitmapCopy = null;
            try {
                CarouselKtExternalSyntheticLambda7 carouselKtExternalSyntheticLambda7OnExtraCallbackWithResult = CarouselKtExternalSyntheticLambda5.onWarmupCompleted(CarouselKtCarousel4ExternalSyntheticLambda0.onExtraCallbackWithResult(context), new RecomposerawaitIdle2.onNavigationEvent(context).onExtraCallback(str).onExtraCallback(256, 256).onExtraCallbackWithResult()).onExtraCallbackWithResult();
                if (carouselKtExternalSyntheticLambda7OnExtraCallbackWithResult != null && (bitmapOnExtraCallbackWithResult = CarouselPagerStateExternalSyntheticLambda1.onExtraCallbackWithResult(carouselKtExternalSyntheticLambda7OnExtraCallbackWithResult, 0, 0, 3, (Object) null)) != null) {
                    int i2 = asInterface + 41;
                    asBinder = i2 % 128;
                    int i3 = i2 % 2;
                    bitmapCopy = bitmapOnExtraCallbackWithResult.copy(Bitmap.Config.ARGB_8888, true);
                }
            } catch (Throwable th) {
                ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("NotificationHelperImpl::setLargeIcon", th);
            }
            if (bitmapCopy != null) {
                int i4 = asInterface + 125;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
                access100Var.onWarmupCompleted(bitmapCopy);
                int i6 = asBinder + 113;
                asInterface = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        return access100Var;
    }

    @Override // o.trackCheckout
    public void onExtraCallback(@Nullable String str, int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 93;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            Object systemService = this.IAuthTabCallback.getSystemService("notification");
            Intrinsics.checkNotNull(systemService, "");
            ((NotificationManager) systemService).cancel(str, i);
            int i4 = 12 / 0;
            return;
        }
        Object systemService2 = this.IAuthTabCallback.getSystemService("notification");
        Intrinsics.checkNotNull(systemService2, "");
        ((NotificationManager) systemService2).cancel(str, i);
    }

    @Override // o.trackCheckout
    public void IAuthTabCallback(@NotNull Context context) {
        int i = 2 % 2;
        int i2 = asBinder + 117;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        if (Build.VERSION.SDK_INT >= 26) {
            onExtraCallbackWithResult(context);
            int i4 = asBinder + 31;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public final void onExtraCallbackWithResult(@NotNull Context context) {
        int i = 2 % 2;
        int i2 = asBinder + 89;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        try {
            asInterface(context);
            int i4 = asBinder + 5;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 38 / 0;
            }
        } catch (Throwable th) {
            ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("NotificationHelperImpl::initOreoPushNotificationChannels", th);
        }
    }

    private final void asInterface(Context context) {
        int i = 2 % 2;
        int i2 = asInterface + 89;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        EncodedDataImplExternalSyntheticLambda0 encodedDataImplExternalSyntheticLambda0OnNavigationEvent = EncodedDataImplExternalSyntheticLambda0.onNavigationEvent(context);
        Intrinsics.checkNotNullExpressionValue(encodedDataImplExternalSyntheticLambda0OnNavigationEvent, "");
        List<VideoEncoderCrashQuirk> listOnExtraCallback = this.onNavigationEvent.onExtraCallback();
        List listOnExtraCallbackWithResult = encodedDataImplExternalSyntheticLambda0OnNavigationEvent.onExtraCallbackWithResult();
        Intrinsics.checkNotNullExpressionValue(listOnExtraCallbackWithResult, "");
        Iterator it = listOnExtraCallbackWithResult.iterator();
        while (!(!it.hasNext())) {
            int i4 = asInterface + 95;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            NotificationChannel notificationChannelJu_ = StopCodecAfterSurfaceRemovalCrashMediaServerQuirk.ju_(it.next());
            List<VideoEncoderCrashQuirk> list = listOnExtraCallback;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    int i6 = asInterface + 55;
                    asBinder = i6 % 128;
                    int i7 = i6 % 2;
                    if (Intrinsics.areEqual(((VideoEncoderCrashQuirk) it2.next()).onNavigationEvent(), notificationChannelJu_.getId())) {
                        break;
                    }
                }
            }
            String id = notificationChannelJu_.getId();
            Intrinsics.checkNotNullExpressionValue(id, "");
            onExtraCallback(encodedDataImplExternalSyntheticLambda0OnNavigationEvent, id);
        }
        encodedDataImplExternalSyntheticLambda0OnNavigationEvent.onNavigationEvent(listOnExtraCallback);
    }

    private final void onExtraCallback(EncodedDataImplExternalSyntheticLambda0 encodedDataImplExternalSyntheticLambda0, String str) {
        int i = 2 % 2;
        int i2 = asInterface + 107;
        asBinder = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                encodedDataImplExternalSyntheticLambda0.onExtraCallbackWithResult(str);
                int i3 = 4 / 0;
            } else {
                encodedDataImplExternalSyntheticLambda0.onExtraCallbackWithResult(str);
            }
        } catch (Throwable th) {
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "NotificationHelperImpl::deleteNotificationChannel", str, th, (Map) null, 8, (Object) null);
        }
    }

    @Override // o.trackCheckout
    public Intent onNavigationEvent(@NotNull Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intent intent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
        if (Build.VERSION.SDK_INT < 26) {
            intent.putExtra("app_package", context.getPackageName());
            intent.putExtra("app_uid", context.getApplicationInfo().uid);
            return intent;
        }
        int i2 = asBinder + 13;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
            int i3 = 95 / 0;
        } else {
            intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
        }
        int i4 = asInterface + 1;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return intent;
    }

    @Override // o.trackCheckout
    public void asBinder(@NotNull Context context) {
        int i = 2 % 2;
        int i2 = asBinder + 125;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
            context.startActivity(onNavigationEvent(context));
        } else {
            Intrinsics.checkNotNullParameter(context, "");
            context.startActivity(onNavigationEvent(context));
            throw null;
        }
    }

    private static final CharSequence onNavigationEvent(Context context, EventServiceImplExternalSyntheticLambda0 eventServiceImplExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = asInterface + 29;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(eventServiceImplExternalSyntheticLambda0, "");
        String string = context.getString(eventServiceImplExternalSyntheticLambda0.getLabelResId());
        Intrinsics.checkNotNullExpressionValue(string, "");
        int i4 = asBinder + 85;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    @Override // o.trackCheckout
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String onWarmupCompleted(@NotNull final Context context, boolean z) {
        Collection collectionEmptyList;
        int importance;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        EncodedDataImplExternalSyntheticLambda0 encodedDataImplExternalSyntheticLambda0OnNavigationEvent = EncodedDataImplExternalSyntheticLambda0.onNavigationEvent(context);
        Intrinsics.checkNotNullExpressionValue(encodedDataImplExternalSyntheticLambda0OnNavigationEvent, "");
        if (Build.VERSION.SDK_INT >= 26) {
            EventServiceImplExternalSyntheticLambda0[] eventServiceImplExternalSyntheticLambda0ArrValues = EventServiceImplExternalSyntheticLambda0.values();
            collectionEmptyList = new ArrayList();
            for (EventServiceImplExternalSyntheticLambda0 eventServiceImplExternalSyntheticLambda0 : eventServiceImplExternalSyntheticLambda0ArrValues) {
                NotificationChannel notificationChannelJU_ = encodedDataImplExternalSyntheticLambda0OnNavigationEvent.jU_(eventServiceImplExternalSyntheticLambda0.getId());
                if (notificationChannelJU_ != null) {
                    int i2 = asInterface + 21;
                    asBinder = i2 % 128;
                    int i3 = i2 % 2;
                    importance = notificationChannelJU_.getImportance();
                } else {
                    importance = 0;
                }
                if (z) {
                    int i4 = asInterface + 65;
                    asBinder = i4 % 128;
                    if (i4 % 2 == 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (importance != 0) {
                        collectionEmptyList.add(eventServiceImplExternalSyntheticLambda0);
                    }
                } else if (importance == 0) {
                }
            }
        } else {
            collectionEmptyList = CollectionsKt.emptyList();
        }
        return CollectionsKt.joinToString$default(collectionEmptyList, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: im.toss.splittarget.impl.notification.NotificationHelperImpl$$ExternalSyntheticLambda1
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj2) {
                CharSequence charSequenceOnExtraCallbackWithResult;
                int i5 = 2 % 2;
                int i6 = onExtraCallbackWithResult + 97;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 != 0) {
                    charSequenceOnExtraCallbackWithResult = trackNativeAdCustomTabsNavigationFinished.onExtraCallbackWithResult(context, (EventServiceImplExternalSyntheticLambda0) obj2);
                    int i7 = 87 / 0;
                } else {
                    charSequenceOnExtraCallbackWithResult = trackNativeAdCustomTabsNavigationFinished.onExtraCallbackWithResult(context, (EventServiceImplExternalSyntheticLambda0) obj2);
                }
                int i8 = onWarmupCompleted + 33;
                onExtraCallbackWithResult = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 29 / 0;
                }
                return charSequenceOnExtraCallbackWithResult;
            }
        }, 30, (Object) null);
    }

    @Override // o.trackCheckout
    public boolean onExtraCallback(@NotNull Context context) {
        int i = 2 % 2;
        int i2 = asInterface + 13;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        boolean zOnWarmupCompleted = EncodedDataImplExternalSyntheticLambda0.onNavigationEvent(context).onWarmupCompleted();
        int i4 = asInterface + 31;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 92 / 0;
        }
        return zOnWarmupCompleted;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        r3 = o.EncodedDataImplExternalSyntheticLambda0.onNavigationEvent(r8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, "");
        r2 = r3.jU_(o.EventServiceImplExternalSyntheticLambda0.GENERAL.getId());
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        if (r2 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
    
        if (r2.getImportance() != 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        r2 = o.trackNativeAdCustomTabsNavigationFinished.asBinder + 21;
        o.trackNativeAdCustomTabsNavigationFinished.asInterface = r2 % 128;
        r2 = r2 % 2;
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
    
        r3 = r3.jU_(o.EventServiceImplExternalSyntheticLambda0.IMPORTANT.getId());
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
    
        if (r3 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
    
        r5 = o.trackNativeAdCustomTabsNavigationFinished.asBinder + 1;
        o.trackNativeAdCustomTabsNavigationFinished.asInterface = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        if ((r5 % 2) == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0066, code lost:
    
        r5 = 94 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0067, code lost:
    
        if (r3.getImportance() != 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0070, code lost:
    
        if (r3.getImportance() != 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0072, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0074, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0075, code lost:
    
        if (r2 != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0077, code lost:
    
        if (r3 != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0079, code lost:
    
        r2 = o.trackNativeAdCustomTabsNavigationFinished.asBinder + 33;
        o.trackNativeAdCustomTabsNavigationFinished.asInterface = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0086, code lost:
    
        if (onExtraCallback(r8) == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0089, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008e, code lost:
    
        return onExtraCallback(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 118) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 26) goto L9;
     */
    @Override // o.trackCheckout
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onWarmupCompleted(@NotNull Context context) {
        int i = 2 % 2;
        int i2 = asBinder + 79;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(context, "");
        } else {
            Intrinsics.checkNotNullParameter(context, "");
        }
    }

    @Override // o.trackCheckout
    public int onExtraCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 15;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            EncodedDataImplExternalSyntheticLambda0.onNavigationEvent(this.IAuthTabCallback).onNavigationEvent();
            throw null;
        }
        int iOnNavigationEvent = EncodedDataImplExternalSyntheticLambda0.onNavigationEvent(this.IAuthTabCallback).onNavigationEvent();
        int i3 = asInterface + 103;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 99 / 0;
        }
        return iOnNavigationEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = onWarmupCompleted;
        int i4 = -1310771303;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = $10 + 93;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 26, 23139 - TextUtils.getOffsetAfter("", 0), -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i7++;
                    i4 = -1310771303;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i8 = $11 + 29;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(IAuthTabCallbackDefault)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), KeyEvent.getDeadChar(0, 0) + 26, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                int i10 = $11 + 105;
                $10 = i10 % 128;
                if (i10 % 2 != 0) {
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent % 0];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                        obj = obj2;
                    } else {
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 24825), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 74, 8087 - TextUtils.lastIndexOf("", '0', 0), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 30 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 19488 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                            int i11 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i11];
                        } else {
                            obj = null;
                            if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                int i12 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                int i13 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i12];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i13];
                            } else {
                                int i14 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                int i15 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i14];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i15];
                            }
                        }
                    }
                } else {
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                obj2 = obj;
            }
        }
        for (int i16 = 0; i16 < i; i16++) {
            cArr4[i16] = (char) (cArr4[i16] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }
}
