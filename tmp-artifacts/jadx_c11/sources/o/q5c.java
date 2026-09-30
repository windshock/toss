package o;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.widget.RemoteViews;
import im.toss.securities.widget.calendar.R;
import im.toss.securities.widget.calendar.ui.model.CalendarWidgetState;
import im.toss.securities.widget.common.utils.RemoteViewsThemeUtil;
import im.toss.securities.widget.common.utils.RemoteViewsThemeUtilKt;
import im.toss.tosssecurities.host.contracts.DisplaySetting;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class q5c {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    public static final q5c onExtraCallbackWithResult = new q5c();
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    static {
        int i = IAuthTabCallback + 29;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            int i2 = 30 / 0;
        }
    }

    private q5c() {
    }

    public static abstract class onExtraCallback {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private final boolean onNavigationEvent;

        public /* synthetic */ onExtraCallback(boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(z);
        }

        private onExtraCallback(boolean z) {
            this.onNavigationEvent = z;
        }

        public boolean onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 5;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            boolean z = this.onNavigationEvent;
            int i5 = i3 + 71;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return z;
        }

        public static final class onNavigationEvent extends onExtraCallback {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback = 0;
            public static final onNavigationEvent onExtraCallbackWithResult = new onNavigationEvent();
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            static {
                int i = IAuthTabCallback + 15;
                onNavigationEvent = i % 128;
                int i2 = i % 2;
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallback;
                int i3 = i2 + 37;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                if (this != obj) {
                    return !((obj instanceof onNavigationEvent) ^ true);
                }
                int i5 = i2 + 111;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 53;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return -231783038;
                }
                int i3 = 36 / 0;
                return -231783038;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 49;
                int i3 = i2 % 128;
                onWarmupCompleted = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 87;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    return "GeneralError";
                }
                throw null;
            }

            private onNavigationEvent() {
                super(true, null);
            }
        }

        /* renamed from: o.q5c$onExtraCallback$onExtraCallback, reason: collision with other inner class name */
        public static final class C0053onExtraCallback extends onExtraCallback {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;
            public static final C0053onExtraCallback onNavigationEvent = new C0053onExtraCallback();
            private static int onWarmupCompleted;

            static {
                int i = onWarmupCompleted + 71;
                onExtraCallback = i % 128;
                if (i % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
            
                if ((r6 instanceof o.q5c.onExtraCallback.C0053onExtraCallback) == true) goto L17;
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
            
                r2 = r2 + 7;
                o.q5c.onExtraCallback.C0053onExtraCallback.onExtraCallbackWithResult = r2 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
            
                if ((r2 % 2) != 0) goto L15;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
            
                return false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
            
                r6 = null;
                r6.hashCode();
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
            
                throw null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
            
                return true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
            
                if (r5 == r6) goto L8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
            
                if (r5 == r6) goto L8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
            
                r2 = r2 + 123;
                o.q5c.onExtraCallback.C0053onExtraCallback.onExtraCallbackWithResult = r2 % 128;
                r2 = r2 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
            
                return true;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 33;
                int i3 = i2 % 128;
                IAuthTabCallback = i3;
                if (i2 % 2 == 0) {
                    int i4 = 52 / 0;
                }
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult;
                int i3 = i2 + 37;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 81;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return -1736126468;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 41;
                int i3 = i2 % 128;
                onExtraCallbackWithResult = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 53;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return "NetworkError";
            }

            private C0053onExtraCallback() {
                super(true, null);
            }
        }

        public static final class IAuthTabCallback extends onExtraCallback {
            private static int IAuthTabCallback = 0;
            public static final IAuthTabCallback onExtraCallback = new IAuthTabCallback();
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            static {
                int i = IAuthTabCallback + 73;
                onWarmupCompleted = i % 128;
                int i2 = i % 2;
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    int i2 = onExtraCallbackWithResult + 55;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    return true;
                }
                if (obj instanceof IAuthTabCallback) {
                    return true;
                }
                int i4 = onExtraCallbackWithResult + 53;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 39;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    return 800071830;
                }
                int i3 = 50 / 0;
                return 800071830;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 61;
                int i3 = i2 % 128;
                onExtraCallbackWithResult = i3;
                if (i2 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i4 = i3 + 47;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return "Guest";
            }

            private IAuthTabCallback() {
                super(false, null);
            }
        }

        public static final class onWarmupCompleted extends onExtraCallback {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;
            public static final onWarmupCompleted onWarmupCompleted = new onWarmupCompleted();

            static {
                int i = onExtraCallback + 91;
                IAuthTabCallback = i % 128;
                if (i % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
            
                if ((r6 instanceof o.q5c.onExtraCallback.onWarmupCompleted) != false) goto L13;
             */
            /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
            
                r2 = r2 + 49;
                o.q5c.onExtraCallback.onWarmupCompleted.onExtraCallbackWithResult = r2 % 128;
                r2 = r2 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
            
                return false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
            
                return true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
            
                if (r5 == r6) goto L8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
            
                if (r5 == r6) goto L8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
            
                return true;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 49;
                int i3 = i2 % 128;
                onNavigationEvent = i3;
                if (i2 % 2 != 0) {
                    int i4 = 4 / 0;
                }
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult;
                int i3 = i2 + 123;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 95;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    return -1709587186;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int i3 = i2 + 31;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 119;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 31 / 0;
                }
                return "Undefined";
            }

            private onWarmupCompleted() {
                super(false, null);
            }
        }

        public static final class onExtraCallbackWithResult extends onExtraCallback {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;
            public static final onExtraCallbackWithResult onWarmupCompleted = new onExtraCallbackWithResult();

            static {
                int i = onNavigationEvent + 19;
                IAuthTabCallback = i % 128;
                if (i % 2 != 0) {
                    throw null;
                }
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    int i2 = onExtraCallback + 75;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    return true;
                }
                if (!(!(obj instanceof onExtraCallbackWithResult))) {
                    return true;
                }
                int i4 = onExtraCallback + 9;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 91;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return -706781359;
                }
                throw null;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 91;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return "Maintenance";
                }
                throw null;
            }

            private onExtraCallbackWithResult() {
                super(false, null);
            }
        }
    }

    public static /* synthetic */ RemoteViews onWarmupCompleted(q5c q5cVar, Context context, int i, CalendarWidgetState calendarWidgetState, boolean z, int i2, Object obj) throws NoWhenBranchMatchedException {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted;
        int i5 = i4 + 21;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        if ((i2 & 8) != 0) {
            int i7 = i4 + 105;
            onExtraCallback = i7 % 128;
            z = i7 % 2 != 0;
        }
        RemoteViews remoteViewsOnExtraCallbackWithResult = q5cVar.onExtraCallbackWithResult(context, i, calendarWidgetState, z);
        int i8 = onExtraCallback + 85;
        onWarmupCompleted = i8 % 128;
        if (i8 % 2 != 0) {
            return remoteViewsOnExtraCallbackWithResult;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final RemoteViews onExtraCallbackWithResult(@NotNull Context context, int i, @NotNull CalendarWidgetState calendarWidgetState, boolean z) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(calendarWidgetState, "");
        if (calendarWidgetState instanceof CalendarWidgetState.Success) {
            return onWarmupCompleted(context, i, (CalendarWidgetState.Success) calendarWidgetState, z);
        }
        if (calendarWidgetState instanceof CalendarWidgetState.Loading) {
            return onWarmupCompleted(context, i, z);
        }
        if (calendarWidgetState instanceof CalendarWidgetState.Error) {
            int i3 = onWarmupCompleted + 27;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            RemoteViews remoteViewsIAuthTabCallback = IAuthTabCallback(context, i, z, onExtraCallback.onNavigationEvent.onExtraCallbackWithResult);
            int i5 = onExtraCallback + 41;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 68 / 0;
            }
            return remoteViewsIAuthTabCallback;
        }
        if (calendarWidgetState instanceof CalendarWidgetState.NetworkError) {
            return IAuthTabCallback(context, i, z, onExtraCallback.C0053onExtraCallback.onNavigationEvent);
        }
        if (calendarWidgetState instanceof CalendarWidgetState.GuestUser) {
            int i7 = onWarmupCompleted + 53;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            return IAuthTabCallback(context, i, z, onExtraCallback.IAuthTabCallback.onExtraCallback);
        }
        if (calendarWidgetState instanceof CalendarWidgetState.UndefinedUser) {
            return IAuthTabCallback(context, i, z, onExtraCallback.onWarmupCompleted.onWarmupCompleted);
        }
        if (calendarWidgetState instanceof CalendarWidgetState.Maintenance) {
            return IAuthTabCallback(context, i, z, onExtraCallback.onExtraCallbackWithResult.onWarmupCompleted);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final RemoteViews onWarmupCompleted(Context context, int i, CalendarWidgetState.Success success, boolean z) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_calendar_main);
        Context contextIAuthTabCallback = z ? context : getStartTimeMillis.Companion.onExtraCallback().IAuthTabCallback(context);
        List<CalendarWidgetState.UiEvents> listOnWarmupCompleted = q6.onExtraCallback.onWarmupCompleted(success);
        RemoteViewsThemeUtil.onNavigationEvent.onExtraCallbackWithResult(remoteViews, R.id.bottom_gradient, DisplaySetting.SYSTEM, 1.0f);
        StringBuilder sb = new StringBuilder();
        Iterator<T> it = listOnWarmupCompleted.iterator();
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                q8a.onWarmupCompleted(getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), new Object[]{q8a.onNavigationEvent, Integer.valueOf(i), StringsKt.take(sb, 500).toString()}, -1919848074, getKekid.onExtraCallback(), 1919848088);
                if (!z) {
                    int i3 = onExtraCallback + 47;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                    int i5 = R.id.widget_root;
                    q7a q7aVar = q7a.IAuthTabCallback;
                    remoteViews.setOnClickPendingIntent(i5, q7aVar.IAuthTabCallback(context, i));
                    if (Build.VERSION.SDK_INT >= 31) {
                        int i6 = onExtraCallback + 87;
                        onWarmupCompleted = i6 % 128;
                        if (i6 % 2 == 0) {
                            remoteViews.setRemoteAdapter(R.id.day_sections_container, ra_(context, listOnWarmupCompleted, contextIAuthTabCallback));
                            obj.hashCode();
                            throw null;
                        }
                        remoteViews.setRemoteAdapter(R.id.day_sections_container, ra_(context, listOnWarmupCompleted, contextIAuthTabCallback));
                    } else {
                        remoteViews.setRemoteAdapter(R.id.day_sections_container, r8lambdaBOV2QNvOs4g5JwR24vJFBV1sIhk.onExtraCallback.onExtraCallback(context, r8lambda7TquQflMeYtI749vTLuIKIOyzRo.class, i));
                    }
                    remoteViews.setPendingIntentTemplate(R.id.day_sections_container, q7aVar.onExtraCallbackWithResult(context, i));
                }
                return remoteViews;
            }
            int i7 = onExtraCallback + 95;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            CalendarWidgetState.UiEvents uiEvents = (CalendarWidgetState.UiEvents) it.next();
            sb.append(uiEvents.onNavigationEvent());
            String str = (String) CollectionsKt.getOrNull(StringsKt.split$default(uiEvents.onExtraCallbackWithResult(), new String[]{"-"}, false, 0, 6, (Object) null), 2);
            if (str == null) {
                int i9 = onWarmupCompleted + 103;
                onExtraCallback = i9 % 128;
                if (i9 % 2 != 0) {
                    int i10 = 76 / 0;
                }
                str = "";
            }
            sb.append(str);
            if (uiEvents.onExtraCallback().isEmpty()) {
                int i11 = onWarmupCompleted + 53;
                onExtraCallback = i11 % 128;
                if (i11 % 2 != 0) {
                    sb.append(contextIAuthTabCallback.getString(R.string.toss_securities_widget_calendar_no_event));
                    throw null;
                }
                sb.append(contextIAuthTabCallback.getString(R.string.toss_securities_widget_calendar_no_event));
            } else {
                int i12 = onExtraCallback + 55;
                onWarmupCompleted = i12 % 128;
                int i13 = i12 % 2;
                for (CalendarWidgetState.UiEvent uiEvent : uiEvents.onExtraCallback()) {
                    sb.append(uiEvent.IAuthTabCallback());
                    sb.append(uiEvent.onExtraCallbackWithResult());
                }
            }
        }
    }

    private final RemoteViews.RemoteCollectionItems ra_(Context context, List<CalendarWidgetState.UiEvents> list, Context context2) {
        boolean z;
        boolean z2;
        int i = 2 % 2;
        RemoteViews.RemoteCollectionItems.Builder viewTypeCount = q7ExternalSyntheticLambda0.rb_().setHasStableIds(true).setViewTypeCount(1);
        Iterator it = list.iterator();
        int i2 = 0;
        for (boolean z3 = true; it.hasNext() == z3; z3 = true) {
            Object next = it.next();
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            CalendarWidgetState.UiEvents uiEvents = (CalendarWidgetState.UiEvents) next;
            q6 q6Var = q6.onExtraCallback;
            long jIAuthTabCallback = q6Var.IAuthTabCallback(uiEvents);
            if (i2 == 0) {
                int i3 = onExtraCallback + 125;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                z = z3;
            } else {
                z = false;
            }
            if (i2 == CollectionsKt.getLastIndex(list)) {
                z2 = z3;
            } else {
                int i5 = onExtraCallback + 37;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                z2 = false;
            }
            viewTypeCount.addItem(jIAuthTabCallback, q6.onExtraCallback(q6Var, context, uiEvents, z, z2, false, context2, 16, null));
            i2++;
            it = it;
        }
        RemoteViews.RemoteCollectionItems remoteCollectionItemsBuild = viewTypeCount.build();
        Intrinsics.checkNotNullExpressionValue(remoteCollectionItemsBuild, "");
        return remoteCollectionItemsBuild;
    }

    private final RemoteViews onWarmupCompleted(Context context, int i, boolean z) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_calendar_loading);
        RemoteViewsThemeUtil remoteViewsThemeUtil = RemoteViewsThemeUtil.onNavigationEvent;
        int iIAuthTabCallback = remoteViewsThemeUtil.IAuthTabCallback(RemoteViewsThemeUtil.SkeletonShape.BAR_8, DisplaySetting.SYSTEM);
        r0c r0cVar = r0c.onWarmupCompleted;
        remoteViewsThemeUtil.IAuthTabCallback(remoteViews, 1.0f, iIAuthTabCallback, CollectionsKt.listOf(new Pair[]{getWrite.IAuthTabCallback(Float.valueOf(r0cVar.onWarmupCompleted(0)), CollectionsKt.listOf(Integer.valueOf(R.id.skeleton_row1))), getWrite.IAuthTabCallback(Float.valueOf(r0cVar.onWarmupCompleted(1)), CollectionsKt.listOf(Integer.valueOf(R.id.skeleton_row2))), getWrite.IAuthTabCallback(Float.valueOf(r0cVar.onWarmupCompleted(2)), CollectionsKt.listOf(Integer.valueOf(R.id.skeleton_row3))), getWrite.IAuthTabCallback(Float.valueOf(r0cVar.onWarmupCompleted(3)), CollectionsKt.listOf(Integer.valueOf(R.id.skeleton_row4))), getWrite.IAuthTabCallback(Float.valueOf(r0cVar.onWarmupCompleted(4)), CollectionsKt.listOf(Integer.valueOf(R.id.skeleton_row5))), getWrite.IAuthTabCallback(Float.valueOf(r0cVar.onWarmupCompleted(5)), CollectionsKt.listOf(Integer.valueOf(R.id.skeleton_row6)))}));
        Object[] objArr = {q8a.onNavigationEvent, Integer.valueOf(i), ""};
        q8a.onWarmupCompleted(getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), objArr, -1919848074, getKekid.onExtraCallback(), 1919848088);
        if (!z) {
            int i3 = onExtraCallback + 95;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            remoteViews.setOnClickPendingIntent(R.id.widget_root, q7a.IAuthTabCallback.IAuthTabCallback(context, i));
        }
        int i5 = onExtraCallback + 89;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 91 / 0;
        }
        return remoteViews;
    }

    private final RemoteViews IAuthTabCallback(Context context, int i, boolean z, onExtraCallback onextracallback) throws NoWhenBranchMatchedException {
        int i2;
        int i3;
        int i4 = 2 % 2;
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_calendar_error);
        String strOnExtraCallbackWithResult = onExtraCallbackWithResult(context, onextracallback);
        int i5 = R.id.error_content;
        remoteViews.setTextViewText(i5, strOnExtraCallbackWithResult);
        remoteViews.setTextColor(i5, onWarmupCompleted(context));
        if (onextracallback.onExtraCallbackWithResult()) {
            int i6 = onWarmupCompleted + 75;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            int i8 = R.id.refresh_button;
            remoteViews.setViewVisibility(i8, 0);
            RemoteViewsThemeUtil.onNavigationEvent.onNavigationEvent(remoteViews, context, DisplaySetting.SYSTEM, r8lambdaMKedLQ34eSPA96F3cZORktsT52c.IAuthTabCallback.IAuthTabCallback(), i8);
            i2 = onWarmupCompleted + 111;
            i3 = i2 % 128;
        } else {
            remoteViews.setViewVisibility(R.id.refresh_button, 8);
            i2 = onWarmupCompleted + 91;
            i3 = i2 % 128;
        }
        onExtraCallback = i3;
        int i9 = i2 % 2;
        Object[] objArr = {q8a.onNavigationEvent, Integer.valueOf(i), strOnExtraCallbackWithResult};
        int iOnExtraCallback = getKekid.onExtraCallback();
        int iOnExtraCallback2 = getKekid.onExtraCallback();
        q8a.onWarmupCompleted(getKekid.onExtraCallback(), getKekid.onExtraCallback(), iOnExtraCallback, objArr, -1919848074, iOnExtraCallback2, 1919848088);
        if (!z) {
            int i10 = onWarmupCompleted + 9;
            onExtraCallback = i10 % 128;
            int i11 = i10 % 2;
            remoteViews.setOnClickPendingIntent(R.id.widget_root, onExtraCallback(context, i, onextracallback));
            if (onextracallback.onExtraCallbackWithResult()) {
                remoteViews.setOnClickPendingIntent(R.id.refresh_button, q7a.IAuthTabCallback.onNavigationEvent(context, i));
            }
        }
        return remoteViews;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final String onExtraCallbackWithResult(Context context, onExtraCallback onextracallback) throws NoWhenBranchMatchedException {
        String string;
        int i = 2 % 2;
        if (onextracallback instanceof onExtraCallback.onNavigationEvent) {
            int i2 = onExtraCallback + 45;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullExpressionValue(context.getString(im.toss.securities.widget.common.R.string.toss_securities_widget_error_content_medium), "");
                throw null;
            }
            String string2 = context.getString(im.toss.securities.widget.common.R.string.toss_securities_widget_error_content_medium);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            return string2;
        }
        if (onextracallback instanceof onExtraCallback.C0053onExtraCallback) {
            int i3 = onExtraCallback + 89;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            String string3 = context.getString(im.toss.securities.widget.common.R.string.toss_securities_widget_network_error_content_medium_title);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            int i5 = onExtraCallback + 101;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return string3;
        }
        if (onextracallback instanceof onExtraCallback.IAuthTabCallback) {
            int i7 = onWarmupCompleted + 105;
            onExtraCallback = i7 % 128;
            if (i7 % 2 != 0) {
                string = context.getString(R.string.toss_securities_widget_calendar_guest_content);
                Intrinsics.checkNotNullExpressionValue(string, "");
                int i8 = 52 / 0;
            } else {
                string = context.getString(R.string.toss_securities_widget_calendar_guest_content);
                Intrinsics.checkNotNullExpressionValue(string, "");
            }
            int i9 = onExtraCallback + 55;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            return string;
        }
        if (!(onextracallback instanceof onExtraCallback.onWarmupCompleted)) {
            if (!(onextracallback instanceof onExtraCallback.onExtraCallbackWithResult)) {
                throw new NoWhenBranchMatchedException();
            }
            String string4 = context.getString(im.toss.securities.widget.common.R.string.toss_securities_widget_maintenance_medium);
            Intrinsics.checkNotNullExpressionValue(string4, "");
            return string4;
        }
        int i11 = onWarmupCompleted + 25;
        onExtraCallback = i11 % 128;
        if (i11 % 2 == 0) {
            String string5 = context.getString(R.string.toss_securities_widget_calendar_undefined_content);
            Intrinsics.checkNotNullExpressionValue(string5, "");
            return string5;
        }
        String string6 = context.getString(R.string.toss_securities_widget_calendar_undefined_content);
        Intrinsics.checkNotNullExpressionValue(string6, "");
        int i12 = 85 / 0;
        return string6;
    }

    private final int onWarmupCompleted(Context context) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 89;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = ByteOrderedDataOutputStream.onNavigationEvent(RemoteViewsThemeUtilKt.IAuthTabCallback(r8lambdaMKedLQ34eSPA96F3cZORktsT52c.IAuthTabCallback.asBinder(), context, DisplaySetting.SYSTEM, null, 4, null));
        int i4 = onWarmupCompleted + 15;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return iOnNavigationEvent;
    }

    private final PendingIntent onExtraCallback(Context context, int i, onExtraCallback onextracallback) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 37;
        onExtraCallback = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            if (!(onextracallback instanceof onExtraCallback.IAuthTabCallback)) {
                return q7a.IAuthTabCallback.IAuthTabCallback(context, i);
            }
            int i5 = i3 + 89;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            PendingIntent pendingIntentOnWarmupCompleted = q7a.IAuthTabCallback.onWarmupCompleted(context, i);
            int i7 = onWarmupCompleted + 111;
            onExtraCallback = i7 % 128;
            if (i7 % 2 == 0) {
                return pendingIntentOnWarmupCompleted;
            }
            throw null;
        }
        boolean z = onextracallback instanceof onExtraCallback.IAuthTabCallback;
        obj.hashCode();
        throw null;
    }
}
