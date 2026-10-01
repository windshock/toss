package o;

import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import im.toss.securities.widget.calendar.R;
import im.toss.securities.widget.calendar.ui.model.CalendarWidgetState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class q6 {
    private static int IAuthTabCallback = 1;
    public static final q6 onExtraCallback = new q6();
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public static final /* synthetic */ class IAuthTabCallback {
        public static final /* synthetic */ int[] IAuthTabCallback;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        static {
            int[] iArr = new int[r2ExternalSyntheticLambda3.values().length];
            try {
                iArr[r2ExternalSyntheticLambda3.ECONOMIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r2ExternalSyntheticLambda3.EARNING.ordinal()] = 2;
                int i = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[r2ExternalSyntheticLambda3.DIVIDEND.ordinal()] = 3;
                int i2 = onExtraCallback + 125;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 5 % 5;
                } else {
                    int i4 = 2 % 2;
                }
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[r2ExternalSyntheticLambda3.UNKNOWN.ordinal()] = 4;
                int i5 = onExtraCallbackWithResult + 61;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
            } catch (NoSuchFieldError unused4) {
            }
            IAuthTabCallback = iArr;
        }
    }

    static {
        int i = onNavigationEvent + 101;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private q6() {
    }

    public final List<CalendarWidgetState.UiEvents> onWarmupCompleted(@NotNull CalendarWidgetState.Success success) {
        CalendarWidgetState.UiEvents uiEvents;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(success, "");
        List<CalendarWidgetState.UiEvents> listOnWarmupCompleted = success.onWarmupCompleted();
        if (listOnWarmupCompleted == null) {
            CalendarWidgetState.UiEvents uiEventsOnExtraCallbackWithResult = success.onExtraCallbackWithResult();
            CalendarWidgetState.UiEvents uiEventsOnExtraCallback = null;
            if (uiEventsOnExtraCallbackWithResult == null || uiEventsOnExtraCallbackWithResult.onExtraCallback().isEmpty()) {
                uiEventsOnExtraCallbackWithResult = null;
            }
            CalendarWidgetState.UiEvents uiEventsOnExtraCallback2 = success.onExtraCallback();
            if (uiEventsOnExtraCallback2 != null) {
                if (uiEventsOnExtraCallback2.onExtraCallback().isEmpty()) {
                    int i4 = onExtraCallbackWithResult + 103;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    uiEvents = null;
                } else {
                    uiEvents = uiEventsOnExtraCallback2;
                }
                if (uiEvents != null) {
                    uiEventsOnExtraCallback = CalendarWidgetState.UiEvents.onExtraCallback(uiEvents, null, onExtraCallback.onExtraCallback(uiEvents.onNavigationEvent()), null, 5, null);
                }
            }
            listOnWarmupCompleted = CollectionsKt.listOfNotNull(new CalendarWidgetState.UiEvents[]{uiEventsOnExtraCallbackWithResult, uiEventsOnExtraCallback});
        }
        if (!listOnWarmupCompleted.isEmpty()) {
            int i6 = onExtraCallbackWithResult + 39;
            onWarmupCompleted = i6 % 128;
            return i6 % 2 == 0 ? onNavigationEvent(listOnWarmupCompleted, 122) : onNavigationEvent(listOnWarmupCompleted, 100);
        }
        CalendarWidgetState.UiEvents uiEventsOnExtraCallbackWithResult2 = success.onExtraCallbackWithResult();
        if (uiEventsOnExtraCallbackWithResult2 == null) {
            uiEventsOnExtraCallbackWithResult2 = new CalendarWidgetState.UiEvents("", "", CollectionsKt.emptyList());
        }
        return CollectionsKt.listOf(uiEventsOnExtraCallbackWithResult2);
    }

    private final List<CalendarWidgetState.UiEvents> onNavigationEvent(List<CalendarWidgetState.UiEvents> list, int i) {
        int i2 = 2 % 2;
        Iterator<T> it = list.iterator();
        int size = 0;
        while (it.hasNext()) {
            int i3 = onExtraCallbackWithResult + 87;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            size += ((CalendarWidgetState.UiEvents) it.next()).onExtraCallback().size();
        }
        if (size > i) {
            ArrayList arrayList = new ArrayList();
            for (CalendarWidgetState.UiEvents uiEvents : list) {
                if (i <= 0) {
                    break;
                }
                int i5 = onWarmupCompleted + 113;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 2 / 0;
                    if (uiEvents.onExtraCallback().size() <= i) {
                        arrayList.add(uiEvents);
                        i -= uiEvents.onExtraCallback().size();
                    } else {
                        arrayList.add(CalendarWidgetState.UiEvents.onExtraCallback(uiEvents, null, null, CollectionsKt.take(uiEvents.onExtraCallback(), i), 3, null));
                        i = 0;
                    }
                } else if (uiEvents.onExtraCallback().size() <= i) {
                    arrayList.add(uiEvents);
                    i -= uiEvents.onExtraCallback().size();
                } else {
                    arrayList.add(CalendarWidgetState.UiEvents.onExtraCallback(uiEvents, null, null, CollectionsKt.take(uiEvents.onExtraCallback(), i), 3, null));
                    i = 0;
                }
            }
            return arrayList;
        }
        int i7 = onWarmupCompleted + 67;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 == 0) {
            return list;
        }
        throw null;
    }

    private final String onExtraCallback(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        String strRemoveSuffix = StringsKt.removeSuffix(str, "요일");
        int i4 = onExtraCallbackWithResult + 121;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return strRemoveSuffix;
    }

    public final long IAuthTabCallback(@NotNull CalendarWidgetState.UiEvents uiEvents) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(uiEvents, "");
            uiEvents.onExtraCallbackWithResult().hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(uiEvents, "");
        long jHashCode = uiEvents.onExtraCallbackWithResult().hashCode();
        int i3 = onExtraCallbackWithResult + 101;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return jHashCode;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ RemoteViews onExtraCallback(q6 q6Var, Context context, CalendarWidgetState.UiEvents uiEvents, boolean z, boolean z2, boolean z3, Context context2, int i, Object obj) {
        boolean z4;
        Context context3;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 55;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        if ((i & 16) != 0) {
            int i6 = i4 + 7;
            onExtraCallbackWithResult = i6 % 128;
            z4 = i6 % 2 != 0;
        } else {
            z4 = z3;
        }
        if ((i & 32) == 0) {
            context3 = context2;
        } else if (!(!z4)) {
            int i7 = onExtraCallbackWithResult + 13;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            context3 = context;
        } else {
            Context contextIAuthTabCallback = getStartTimeMillis.Companion.onExtraCallback().IAuthTabCallback(context);
            int i9 = onExtraCallbackWithResult + 51;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            context3 = contextIAuthTabCallback;
        }
        return q6Var.onNavigationEvent(context, uiEvents, z, z2, z4, context3);
    }

    public final RemoteViews onNavigationEvent(@NotNull Context context, @NotNull CalendarWidgetState.UiEvents uiEvents, boolean z, boolean z2, boolean z3, @NotNull Context context2) {
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(uiEvents, "");
        Intrinsics.checkNotNullParameter(context2, "");
        float f = context.getResources().getConfiguration().fontScale;
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.securities_widget_calendar_day_section);
        int i3 = R.id.section_divider;
        if (z) {
            int i4 = onWarmupCompleted + 53;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            i = 8;
        } else {
            i = 0;
        }
        remoteViews.setViewVisibility(i3, i);
        remoteViews.setViewVisibility(R.id.section_divider_bottom, z2 ? 0 : 8);
        int i6 = R.id.section_day;
        remoteViews.setTextViewText(i6, uiEvents.onNavigationEvent());
        int i7 = R.id.section_date;
        String str = (String) CollectionsKt.getOrNull(StringsKt.split$default(uiEvents.onExtraCallbackWithResult(), new String[]{"-"}, false, 0, 6, (Object) null), 2);
        remoteViews.setTextViewText(i7, str != null ? str : "");
        remoteViews.setTextViewTextSize(i6, 1, r1.onExtraCallback(11.0f, f, 0.0f, 2, null));
        remoteViews.setTextViewTextSize(i7, 1, r1.onExtraCallback(17.0f, f, 0.0f, 2, null));
        int i8 = R.id.section_events_container;
        remoteViews.removeAllViews(i8);
        if (uiEvents.onExtraCallback().isEmpty()) {
            RemoteViews remoteViews2 = new RemoteViews(context.getPackageName(), R.layout.securities_widget_calendar_no_event);
            int i9 = R.id.calendar_date;
            remoteViews2.setTextViewText(i9, context2.getString(R.string.toss_securities_widget_calendar_no_event));
            remoteViews2.setTextViewTextSize(i9, 1, r1.onExtraCallback(13.0f, f, 0.0f, 2, null));
            remoteViews.addView(i8, remoteViews2);
            int i10 = onWarmupCompleted + 89;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
        } else {
            Iterator<T> it = uiEvents.onExtraCallback().iterator();
            while (it.hasNext()) {
                int i12 = onExtraCallbackWithResult + 3;
                onWarmupCompleted = i12 % 128;
                if (i12 % 2 == 0) {
                    remoteViews.addView(R.id.section_events_container, onExtraCallback.onExtraCallbackWithResult(context, (CalendarWidgetState.UiEvent) it.next()));
                    int i13 = 39 / 0;
                } else {
                    remoteViews.addView(R.id.section_events_container, onExtraCallback.onExtraCallbackWithResult(context, (CalendarWidgetState.UiEvent) it.next()));
                }
            }
        }
        remoteViews.setOnClickFillInIntent(R.id.section_root, new Intent());
        return remoteViews;
    }

    private final RemoteViews onExtraCallbackWithResult(Context context, CalendarWidgetState.UiEvent uiEvent) {
        int i = 2 % 2;
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.securities_widget_calendar_event);
        float f = context.getResources().getConfiguration().fontScale;
        int i2 = R.id.event;
        remoteViews.setTextViewText(i2, uiEvent.IAuthTabCallback());
        Object obj = null;
        remoteViews.setTextViewTextSize(i2, 1, r1.onExtraCallback(13.0f, f, 0.0f, 2, null));
        remoteViews.setImageViewResource(R.id.tag, onExtraCallback.IAuthTabCallback(uiEvent.onNavigationEvent()));
        if (!StringsKt.isBlank(uiEvent.onExtraCallbackWithResult())) {
            int i3 = onExtraCallbackWithResult + 13;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            int i5 = R.id.event_time;
            remoteViews.setTextViewText(i5, uiEvent.onExtraCallbackWithResult());
            remoteViews.setTextViewTextSize(i5, 1, r1.onExtraCallback(10.0f, f, 0.0f, 2, null));
            remoteViews.setViewVisibility(i5, 0);
            return remoteViews;
        }
        remoteViews.setViewVisibility(R.id.event_time, 8);
        int i6 = onExtraCallbackWithResult + 109;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 != 0) {
            return remoteViews;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final int IAuthTabCallback(r2ExternalSyntheticLambda3 r2externalsyntheticlambda3) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback.IAuthTabCallback[r2externalsyntheticlambda3.ordinal()];
        if (i2 == 1) {
            return R.drawable.shape_economic;
        }
        int i3 = onExtraCallbackWithResult + 117;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        if (i2 == 2) {
            return R.drawable.shape_earning;
        }
        int i6 = i4 + 1;
        int i7 = i6 % 128;
        onExtraCallbackWithResult = i7;
        if (i6 % 2 == 0 ? i2 == 3 : i2 == 3) {
            return R.drawable.shape_dividend;
        }
        if (i2 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        int i8 = i7 + 43;
        onWarmupCompleted = i8 % 128;
        Object obj = null;
        if (i8 % 2 == 0) {
            int i9 = R.drawable.shape_etc;
            throw null;
        }
        int i10 = R.drawable.shape_etc;
        int i11 = onExtraCallbackWithResult + 85;
        onWarmupCompleted = i11 % 128;
        if (i11 % 2 != 0) {
            return i10;
        }
        obj.hashCode();
        throw null;
    }
}
