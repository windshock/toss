package o;

import android.os.Build;
import android.text.Layout;
import android.text.ParcelableSpan;
import android.text.SpannableString;
import android.text.style.AlignmentSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TextAppearanceSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.widget.RemoteViews;
import androidx.core.widget.RemoteViewsCompat;
import androidx.glance.appwidget.R;
import androidx.glance.unit.ResourceColorProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import o.BasicTextFieldKtDefaultTextFieldDecorator1ExternalSyntheticLambda0;
import o.BasicTextFieldKtExternalSyntheticLambda6;
import o.BasicTextFieldKtExternalSyntheticLambda7;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class PagerStateExternalSyntheticLambda3 {
    public static final void onWarmupCompleted(@NotNull RemoteViews remoteViews, @NotNull LazyGridItemProviderImplExternalSyntheticLambda0 lazyGridItemProviderImplExternalSyntheticLambda0, @NotNull BasicTextFieldKtExternalSyntheticLambda3 basicTextFieldKtExternalSyntheticLambda3) {
        LazyListStateCompanionExternalSyntheticLambda0 lazyListStateCompanionExternalSyntheticLambda0OnNavigationEvent = LazyListStateKtExternalSyntheticLambda1.onNavigationEvent(remoteViews, lazyGridItemProviderImplExternalSyntheticLambda0, LazyGridDslKtExternalSyntheticLambda0.Text, basicTextFieldKtExternalSyntheticLambda3.onExtraCallbackWithResult());
        onExtraCallback(remoteViews, lazyGridItemProviderImplExternalSyntheticLambda0, lazyListStateCompanionExternalSyntheticLambda0OnNavigationEvent.IAuthTabCallback(), basicTextFieldKtExternalSyntheticLambda3.IAuthTabCallbackStub(), basicTextFieldKtExternalSyntheticLambda3.onWarmupCompleted(), basicTextFieldKtExternalSyntheticLambda3.IAuthTabCallback(), 0, 32, null);
        LazyDslKtExternalSyntheticLambda0.IAuthTabCallback(lazyGridItemProviderImplExternalSyntheticLambda0, remoteViews, basicTextFieldKtExternalSyntheticLambda3.onExtraCallbackWithResult(), lazyListStateCompanionExternalSyntheticLambda0OnNavigationEvent);
    }

    public static /* synthetic */ void onExtraCallback(RemoteViews remoteViews, LazyGridItemProviderImplExternalSyntheticLambda0 lazyGridItemProviderImplExternalSyntheticLambda0, int i2, String str, BasicTextKtExternalSyntheticLambda12 basicTextKtExternalSyntheticLambda12, int i3, int i4, int i5, Object obj) {
        if ((i5 & 32) != 0) {
            i4 = 48;
        }
        onNavigationEvent(remoteViews, lazyGridItemProviderImplExternalSyntheticLambda0, i2, str, basicTextKtExternalSyntheticLambda12, i3, i4);
    }

    public static final void onNavigationEvent(@NotNull RemoteViews remoteViews, @NotNull LazyGridItemProviderImplExternalSyntheticLambda0 lazyGridItemProviderImplExternalSyntheticLambda0, int i2, @NotNull String str, @Nullable BasicTextKtExternalSyntheticLambda12 basicTextKtExternalSyntheticLambda12, int i3, int i4) {
        int i5;
        if (i3 != Integer.MAX_VALUE) {
            RemoteViewsCompat.access000(remoteViews, i2, i3);
        }
        if (basicTextKtExternalSyntheticLambda12 == null) {
            remoteViews.setTextViewText(i2, str);
            return;
        }
        SpannableString spannableString = new SpannableString(str);
        int length = spannableString.length();
        AvoidCaptureProcessProgressAvailabilityCheckQuirk avoidCaptureProcessProgressAvailabilityCheckQuirkOnExtraCallbackWithResult = basicTextKtExternalSyntheticLambda12.onExtraCallbackWithResult();
        if (avoidCaptureProcessProgressAvailabilityCheckQuirkOnExtraCallbackWithResult != null) {
            long jIAuthTabCallback = avoidCaptureProcessProgressAvailabilityCheckQuirkOnExtraCallbackWithResult.IAuthTabCallback();
            if (!AvoidCaptureProcessProgressAvailabilityCheckQuirk.IAuthTabCallbackDefault(jIAuthTabCallback)) {
                throw new IllegalArgumentException("Only Sp is currently supported for font sizes");
            }
            remoteViews.setTextViewTextSize(i2, 2, AvoidCaptureProcessProgressAvailabilityCheckQuirk.onWarmupCompleted(jIAuthTabCallback));
        }
        ArrayList arrayList = new ArrayList();
        BasicTextFieldKtExternalSyntheticLambda7 basicTextFieldKtExternalSyntheticLambda7OnTransact = basicTextKtExternalSyntheticLambda12.onTransact();
        if (basicTextFieldKtExternalSyntheticLambda7OnTransact != null) {
            int iOnNavigationEvent = basicTextFieldKtExternalSyntheticLambda7OnTransact.onNavigationEvent();
            BasicTextFieldKtExternalSyntheticLambda7.onExtraCallback onextracallback = BasicTextFieldKtExternalSyntheticLambda7.Companion;
            if (BasicTextFieldKtExternalSyntheticLambda7.onExtraCallback(iOnNavigationEvent, onextracallback.onWarmupCompleted())) {
                arrayList.add(new StrikethroughSpan());
            }
            if (BasicTextFieldKtExternalSyntheticLambda7.onExtraCallback(iOnNavigationEvent, onextracallback.onExtraCallbackWithResult())) {
                arrayList.add(new UnderlineSpan());
            }
        }
        BasicTextFieldKtExternalSyntheticLambda8 basicTextFieldKtExternalSyntheticLambda8IAuthTabCallback = basicTextKtExternalSyntheticLambda12.IAuthTabCallback();
        if (basicTextFieldKtExternalSyntheticLambda8IAuthTabCallback != null) {
            arrayList.add(new StyleSpan(BasicTextFieldKtExternalSyntheticLambda8.onNavigationEvent(basicTextFieldKtExternalSyntheticLambda8IAuthTabCallback.IAuthTabCallback(), BasicTextFieldKtExternalSyntheticLambda8.Companion.onExtraCallback()) ? 2 : 0));
        }
        BasicTextFieldKtDefaultTextFieldDecorator1ExternalSyntheticLambda0 basicTextFieldKtDefaultTextFieldDecorator1ExternalSyntheticLambda0OnNavigationEvent = basicTextKtExternalSyntheticLambda12.onNavigationEvent();
        if (basicTextFieldKtDefaultTextFieldDecorator1ExternalSyntheticLambda0OnNavigationEvent != null) {
            int iOnExtraCallback = basicTextFieldKtDefaultTextFieldDecorator1ExternalSyntheticLambda0OnNavigationEvent.onExtraCallback();
            BasicTextFieldKtDefaultTextFieldDecorator1ExternalSyntheticLambda0.onExtraCallback onextracallback2 = BasicTextFieldKtDefaultTextFieldDecorator1ExternalSyntheticLambda0.Companion;
            if (BasicTextFieldKtDefaultTextFieldDecorator1ExternalSyntheticLambda0.IAuthTabCallback(iOnExtraCallback, onextracallback2.onNavigationEvent())) {
                i5 = R.style.Glance_AppWidget_TextAppearance_Bold;
            } else {
                i5 = BasicTextFieldKtDefaultTextFieldDecorator1ExternalSyntheticLambda0.IAuthTabCallback(iOnExtraCallback, onextracallback2.onExtraCallback()) ? R.style.Glance_AppWidget_TextAppearance_Medium : R.style.Glance_AppWidget_TextAppearance_Normal;
            }
            arrayList.add(new TextAppearanceSpan(lazyGridItemProviderImplExternalSyntheticLambda0.asBinder(), i5));
        }
        BasicTextFieldKtExternalSyntheticLambda5 basicTextFieldKtExternalSyntheticLambda5OnWarmupCompleted = basicTextKtExternalSyntheticLambda12.onWarmupCompleted();
        if (basicTextFieldKtExternalSyntheticLambda5OnWarmupCompleted != null) {
            arrayList.add(new TypefaceSpan(basicTextFieldKtExternalSyntheticLambda5OnWarmupCompleted.onExtraCallback()));
        }
        BasicTextFieldKtExternalSyntheticLambda6 basicTextFieldKtExternalSyntheticLambda6AsBinder = basicTextKtExternalSyntheticLambda12.asBinder();
        if (basicTextFieldKtExternalSyntheticLambda6AsBinder != null) {
            int iAsBinder = basicTextFieldKtExternalSyntheticLambda6AsBinder.asBinder();
            if (Build.VERSION.SDK_INT >= 31) {
                PagerStateanimateScrollToPage3ExternalSyntheticLambda0.onNavigationEvent.IAuthTabCallback(remoteViews, i2, i4 | onExtraCallbackWithResult(iAsBinder));
            } else {
                arrayList.add(new AlignmentSpan.Standard(onNavigationEvent(iAsBinder, lazyGridItemProviderImplExternalSyntheticLambda0.access100())));
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            spannableString.setSpan((ParcelableSpan) it.next(), 0, length, 17);
        }
        remoteViews.setTextViewText(i2, spannableString);
        BasicTextKtExternalSyntheticLambda11 basicTextKtExternalSyntheticLambda11OnExtraCallback = basicTextKtExternalSyntheticLambda12.onExtraCallback();
        if (basicTextKtExternalSyntheticLambda11OnExtraCallback instanceof BasicTextKtExternalSyntheticLambda14) {
            remoteViews.setTextColor(i2, ByteOrderedDataOutputStream.onNavigationEvent(((BasicTextKtExternalSyntheticLambda14) basicTextKtExternalSyntheticLambda11OnExtraCallback).IAuthTabCallback()));
            return;
        }
        if (basicTextKtExternalSyntheticLambda11OnExtraCallback instanceof ResourceColorProvider) {
            if (Build.VERSION.SDK_INT >= 31) {
                RemoteViewsCompat.getInterfaceDescriptor(remoteViews, i2, ((ResourceColorProvider) basicTextKtExternalSyntheticLambda11OnExtraCallback).onNavigationEvent());
                return;
            } else {
                remoteViews.setTextColor(i2, ByteOrderedDataOutputStream.onNavigationEvent(basicTextKtExternalSyntheticLambda11OnExtraCallback.IAuthTabCallback(lazyGridItemProviderImplExternalSyntheticLambda0.asBinder())));
                return;
            }
        }
        if (basicTextKtExternalSyntheticLambda11OnExtraCallback instanceof SelectableGroupKtExternalSyntheticLambda0) {
            if (Build.VERSION.SDK_INT >= 31) {
                SelectableGroupKtExternalSyntheticLambda0 selectableGroupKtExternalSyntheticLambda0 = (SelectableGroupKtExternalSyntheticLambda0) basicTextKtExternalSyntheticLambda11OnExtraCallback;
                RemoteViewsCompat.onExtraCallbackWithResult(remoteViews, i2, ByteOrderedDataOutputStream.onNavigationEvent(selectableGroupKtExternalSyntheticLambda0.onExtraCallback()), ByteOrderedDataOutputStream.onNavigationEvent(selectableGroupKtExternalSyntheticLambda0.onWarmupCompleted()));
                return;
            } else {
                remoteViews.setTextColor(i2, ByteOrderedDataOutputStream.onNavigationEvent(basicTextKtExternalSyntheticLambda11OnExtraCallback.IAuthTabCallback(lazyGridItemProviderImplExternalSyntheticLambda0.asBinder())));
                return;
            }
        }
        Objects.toString(basicTextKtExternalSyntheticLambda11OnExtraCallback);
    }

    private static final int onExtraCallbackWithResult(int i2) {
        BasicTextFieldKtExternalSyntheticLambda6.onExtraCallback onextracallback = BasicTextFieldKtExternalSyntheticLambda6.Companion;
        if (BasicTextFieldKtExternalSyntheticLambda6.onExtraCallback(i2, onextracallback.IAuthTabCallback())) {
            return 1;
        }
        if (BasicTextFieldKtExternalSyntheticLambda6.onExtraCallback(i2, onextracallback.onWarmupCompleted())) {
            return 3;
        }
        if (BasicTextFieldKtExternalSyntheticLambda6.onExtraCallback(i2, onextracallback.onExtraCallback())) {
            return 5;
        }
        if (BasicTextFieldKtExternalSyntheticLambda6.onExtraCallback(i2, onextracallback.onExtraCallbackWithResult())) {
            return 8388611;
        }
        if (BasicTextFieldKtExternalSyntheticLambda6.onExtraCallback(i2, onextracallback.onNavigationEvent())) {
            return 8388613;
        }
        Objects.toString(BasicTextFieldKtExternalSyntheticLambda6.onExtraCallbackWithResult(i2));
        return 8388611;
    }

    private static final Layout.Alignment onNavigationEvent(int i2, boolean z) {
        BasicTextFieldKtExternalSyntheticLambda6.onExtraCallback onextracallback = BasicTextFieldKtExternalSyntheticLambda6.Companion;
        if (BasicTextFieldKtExternalSyntheticLambda6.onExtraCallback(i2, onextracallback.IAuthTabCallback())) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        if (BasicTextFieldKtExternalSyntheticLambda6.onExtraCallback(i2, onextracallback.onWarmupCompleted())) {
            return z ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        }
        if (BasicTextFieldKtExternalSyntheticLambda6.onExtraCallback(i2, onextracallback.onExtraCallback())) {
            return z ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
        }
        if (BasicTextFieldKtExternalSyntheticLambda6.onExtraCallback(i2, onextracallback.onExtraCallbackWithResult())) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        if (BasicTextFieldKtExternalSyntheticLambda6.onExtraCallback(i2, onextracallback.onNavigationEvent())) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        Objects.toString(BasicTextFieldKtExternalSyntheticLambda6.onExtraCallbackWithResult(i2));
        return Layout.Alignment.ALIGN_NORMAL;
    }
}
