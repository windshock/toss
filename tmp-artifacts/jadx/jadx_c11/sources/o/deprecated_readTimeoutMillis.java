package o;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import im.toss.tds.sharebottomsheet.R;
import im.toss.uikit.widget.snackbar.TdsToastV1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface deprecated_readTimeoutMillis {
    public static final onWarmupCompleted Companion = onWarmupCompleted.onNavigationEvent;

    Intent buildIntent(@NotNull Context context, @Nullable String str, @Nullable String str2, @Nullable Uri uri, @NotNull Function0<Unit> function0, @NotNull Function1<? super Throwable, Unit> function1);

    List<deprecated_retryOnConnectionFailure> getAvailableTypes();

    String getIconUrl();

    String getId();

    int getLabel();

    default boolean isAvailable(@NotNull deprecated_retryOnConnectionFailure deprecated_retryonconnectionfailure) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(deprecated_retryonconnectionfailure, "");
        return getAvailableTypes().contains(deprecated_retryonconnectionfailure);
    }

    static /* synthetic */ void onExtraCallbackWithResult(deprecated_readTimeoutMillis deprecated_readtimeoutmillis, Context context, String str, Uri uri, Function0 function0, Function1 function1, String str2, Function1 function12, int i, Object obj) {
        int i2 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: share");
        }
        deprecated_readtimeoutmillis.share(context, str, uri, function0, function1, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : function12);
    }

    default void share(@NotNull Context context, @Nullable String str, @Nullable Uri uri, @NotNull Function0<Unit> function0, @NotNull Function1<? super Throwable, Unit> function1, @Nullable String str2, @Nullable Function1<? super Intent, ? extends Intent> function12) {
        Intent intent;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intent intentBuildIntent = buildIntent(context, str2, str, uri, function0, function1);
        if (intentBuildIntent != null) {
            if (function12 != null && (intent = (Intent) function12.invoke(intentBuildIntent)) != null) {
                intentBuildIntent = intent;
            }
            onNavigationEvent(context, intentBuildIntent, function0, function1);
        }
    }

    private default void onNavigationEvent(Context context, Intent intent, Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        int i = 2 % 2;
        try {
            if (!(!(context instanceof Activity))) {
                ((Activity) context).startActivityForResult(intent, 7700);
            } else {
                context.startActivity(intent);
            }
            function0.invoke();
        } catch (ActivityNotFoundException e) {
            showErrorToast(context, R.string.tds_sharebottomsheet_activity_not_found);
            ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("Sharable::runIntent", e);
            function1.invoke(e);
        } catch (Exception e2) {
            showErrorToast(context, R.string.tds_sharebottomsheet_error);
            ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("Sharable::runIntent", e2);
            function1.invoke(e2);
        }
    }

    default void showSuccessToast(@NotNull Context context, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        IAuthTabCallback(context, im.toss.uikit.R.drawable.icn_success_color, i);
    }

    default void showErrorToast(@NotNull Context context, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        IAuthTabCallback(context, im.toss.core.R.drawable.icn_attention_color, i);
    }

    private default void IAuthTabCallback(Context context, int i, int i2) {
        int i3 = 2 % 2;
        Activity activityIAuthTabCallback = hasVaryAll.IAuthTabCallback(context);
        if (activityIAuthTabCallback != null) {
            String string = context.getString(i2);
            Intrinsics.checkNotNullExpressionValue(string, "");
            BrickModulePackageExternalSyntheticLambda0.onExtraCallbackWithResult(TdsToastV1.onNavigationEvent.onNavigationEvent(new TdsToastV1.onNavigationEvent(activityIAuthTabCallback, string), i, 0, 2, (Object) null), 0, (Integer) null, 0, 7, (Object) null);
        }
    }

    public static final class onWarmupCompleted {
        private static int IAuthTabCallback = 0;
        private static int IAuthTabCallbackStub = 1;
        private static int asBinder = 0;
        private static int asInterface = 1;
        private static final List<Integer> onExtraCallback;
        private static final int onExtraCallbackWithResult;
        static final /* synthetic */ onWarmupCompleted onNavigationEvent = new onWarmupCompleted();
        private static final int onWarmupCompleted;

        private onWarmupCompleted() {
        }

        static {
            List<Integer> listListOf = CollectionsKt.listOf(new Integer[]{280, 360, 490, 560, 680, 760});
            onExtraCallback = listListOf;
            int size = listListOf.size();
            onWarmupCompleted = size + 2;
            onExtraCallbackWithResult = size;
            int i = asInterface + 89;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }

        public final List<Integer> onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub;
            int i3 = i2 + 51;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            List<Integer> list = onExtraCallback;
            int i5 = i2 + 101;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            return list;
        }

        public final int IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 65;
            int i3 = i2 % 128;
            asBinder = i3;
            int i4 = i2 % 2;
            int i5 = onWarmupCompleted;
            int i6 = i3 + 79;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            return i5;
        }

        public final List<deprecated_readTimeoutMillis> onExtraCallbackWithResult(@NotNull Context context, @Nullable String str, @Nullable Uri uri, @NotNull List<? extends EnumC0078cache> list) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(list, "");
            List<EnumC0078cache> listIAuthTabCallback = IAuthTabCallback(list, context);
            if (listIAuthTabCallback.isEmpty()) {
                int i2 = IAuthTabCallbackStub + 101;
                asBinder = i2 % 128;
                int i3 = i2 % 2;
                return CollectionsKt.emptyList();
            }
            deprecated_retryOnConnectionFailure deprecated_retryonconnectionfailureOnWarmupCompleted = deprecated_retryOnConnectionFailure.Companion.onWarmupCompleted(str, uri);
            ArrayList arrayList = new ArrayList();
            if (deprecated_writeTimeoutMillis.onWarmupCompleted(deprecated_retryonconnectionfailureOnWarmupCompleted)) {
                int i4 = asBinder + 83;
                IAuthTabCallbackStub = i4 % 128;
                if (i4 % 2 == 0) {
                    arrayList.add(deprecated_networkInterceptors.TEXT_COPY);
                    int i5 = 71 / 0;
                } else {
                    arrayList.add(deprecated_networkInterceptors.TEXT_COPY);
                }
            } else if (deprecated_writeTimeoutMillis.onExtraCallback(deprecated_retryonconnectionfailureOnWarmupCompleted)) {
                int i6 = IAuthTabCallbackStub + 101;
                asBinder = i6 % 128;
                int i7 = i6 % 2;
                arrayList.add(deprecated_networkInterceptors.LINK_COPY);
            } else if (deprecated_writeTimeoutMillis.IAuthTabCallback(deprecated_retryonconnectionfailureOnWarmupCompleted)) {
                arrayList.add(deprecated_networkInterceptors.IMAGE_SAVE);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : listIAuthTabCallback) {
                if (((EnumC0078cache) obj).isAvailable(deprecated_retryonconnectionfailureOnWarmupCompleted)) {
                    int i8 = IAuthTabCallbackStub + 65;
                    asBinder = i8 % 128;
                    if (i8 % 2 != 0) {
                        arrayList2.add(obj);
                        throw null;
                    }
                    arrayList2.add(obj);
                }
            }
            arrayList.addAll(CollectionsKt.take(arrayList2, onExtraCallbackWithResult));
            arrayList.add(deprecated_networkInterceptors.MORE);
            if (arrayList.size() < onWarmupCompleted) {
                int i9 = asBinder + 47;
                IAuthTabCallbackStub = i9 % 128;
                int i10 = i9 % 2;
                arrayList.add(arrayList.size() - 1, deprecated_networkInterceptors.SMS);
            }
            return arrayList;
        }

        public final deprecated_readTimeoutMillis onExtraCallback(@NotNull String str) {
            Object obj;
            Object next;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Iterator it = EnumC0078cache.getEntries().iterator();
            while (true) {
                obj = null;
                if (it.hasNext()) {
                    int i2 = asBinder + 93;
                    IAuthTabCallbackStub = i2 % 128;
                    if (i2 % 2 == 0) {
                        Intrinsics.areEqual(str, ((EnumC0078cache) it.next()).getId());
                        throw null;
                    }
                    next = it.next();
                    if (Intrinsics.areEqual(str, ((EnumC0078cache) next).getId())) {
                        break;
                    }
                } else {
                    int i3 = asBinder + 85;
                    IAuthTabCallbackStub = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i4 = 5 / 4;
                    }
                    next = null;
                }
            }
            EnumC0078cache enumC0078cache = (EnumC0078cache) next;
            if (enumC0078cache != null) {
                return enumC0078cache;
            }
            Iterator it2 = deprecated_networkInterceptors.getEntries().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (Intrinsics.areEqual(str, ((deprecated_networkInterceptors) next2).getId())) {
                    obj = next2;
                    break;
                }
            }
            return (deprecated_readTimeoutMillis) obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private final List<EnumC0078cache> IAuthTabCallback(List<? extends EnumC0078cache> list, Context context) {
            int i = 2 % 2;
            int i2 = asBinder + 55;
            IAuthTabCallbackStub = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                context.checkSelfPermission("android.permission.QUERY_ALL_PACKAGES");
                obj.hashCode();
                throw null;
            }
            if (context.checkSelfPermission("android.permission.QUERY_ALL_PACKAGES") != 0) {
                return list;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int i3 = IAuthTabCallbackStub + 15;
                asBinder = i3 % 128;
                if (i3 % 2 != 0) {
                    deprecated_pingIntervalMillis.onNavigationEvent((EnumC0078cache) it.next(), context);
                    obj.hashCode();
                    throw null;
                }
                Object next = it.next();
                if (deprecated_pingIntervalMillis.onNavigationEvent((EnumC0078cache) next, context)) {
                    arrayList.add(next);
                }
            }
            int i4 = asBinder + 33;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            return arrayList;
        }
    }
}
