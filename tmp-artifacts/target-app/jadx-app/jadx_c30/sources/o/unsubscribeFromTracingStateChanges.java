package o;

import android.content.Context;
import android.content.Intent;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.UnderlineSpan;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.ads.zzgsa;
import im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV2View;
import im.toss.uikit.widget.snackbar.TdsToastV1;
import java.lang.reflect.Method;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import net.sf.scuba.smartcards.BuildConfig;
import net.sf.scuba.smartcards.ISOFileInfo;
import o.unsubscribeFromTracingStateChanges;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class unsubscribeFromTracingStateChanges extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallback Companion;
    private static char[] IAuthTabCallbackDefault = null;
    private static boolean IAuthTabCallbackStubProxy = false;
    private static int IAuthTabCallback_Parcel = 0;
    private static int access000 = 1;
    private static int access100 = 0;
    private static boolean asBinder = false;
    private static int asInterface = 0;
    private static int getInterfaceDescriptor = 1;
    public static final int onExtraCallbackWithResult;
    private final boolean IAuthTabCallback;
    private final boolean IAuthTabCallbackStub;
    private final List<reportTimeStamp> onExtraCallback;
    private final boolean onNavigationEvent;
    private onExtraCallbackWithResult onTransact;
    private Pair<PerformanceTracerTracingStateCallback, ? extends View> onWarmupCompleted;

    public interface onExtraCallbackWithResult {
        void IAuthTabCallback(@NotNull String str, boolean z);

        default void onExtraCallbackWithResult(int i) {
        }

        default void onExtraCallbackWithResult(@NotNull String str, boolean z) {
            Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        }
    }

    static {
        onWarmupCompleted();
        Companion = new onExtraCallback(null);
        onExtraCallbackWithResult = 8;
        int i = getInterfaceDescriptor + 97;
        access100 = i % 128;
        int i2 = i % 2;
    }

    public unsubscribeFromTracingStateChanges() {
        this(false, false, false, 7, null);
    }

    public static /* synthetic */ void IAuthTabCallback(unsubscribeFromTracingStateChanges unsubscribefromtracingstatechanges, reportTimeStamp reporttimestamp, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 79;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(unsubscribefromtracingstatechanges, reporttimestamp, view);
        int i4 = IAuthTabCallback_Parcel + 69;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        reportTimeStamp reporttimestamp = (reportTimeStamp) objArr[0];
        unsubscribeFromTracingStateChanges unsubscribefromtracingstatechanges = (unsubscribeFromTracingStateChanges) objArr[1];
        TdsCheckBoxV2View tdsCheckBoxV2View = (TdsCheckBoxV2View) objArr[2];
        boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 93;
        access000 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onExtraCallback(reporttimestamp, unsubscribefromtracingstatechanges, tdsCheckBoxV2View, zBooleanValue);
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(reporttimestamp, unsubscribefromtracingstatechanges, tdsCheckBoxV2View, zBooleanValue);
        int i3 = IAuthTabCallback_Parcel + 41;
        access000 = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ void onExtraCallback(unsubscribeFromTracingStateChanges unsubscribefromtracingstatechanges, reportTimeStamp reporttimestamp, onWarmupCompleted onwarmupcompleted, RecyclerView.ViewHolder viewHolder, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 93;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(unsubscribefromtracingstatechanges, reporttimestamp, onwarmupcompleted, viewHolder, view);
        if (i3 == 0) {
            int i4 = 64 / 0;
        }
        int i5 = IAuthTabCallback_Parcel + 79;
        access000 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(reportTimeStamp reporttimestamp, unsubscribeFromTracingStateChanges unsubscribefromtracingstatechanges, onWarmupCompleted onwarmupcompleted, TdsCheckBoxV2View tdsCheckBoxV2View, boolean z) {
        int i = 2 % 2;
        int i2 = access000 + 119;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(reporttimestamp, unsubscribefromtracingstatechanges, onwarmupcompleted, tdsCheckBoxV2View, z);
        int i4 = IAuthTabCallback_Parcel + 111;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
        reportTimeStamp reporttimestamp = (reportTimeStamp) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 113;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(reporttimestamp, view);
        int i4 = access000 + 121;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i6;
        int i8 = ~i3;
        int i9 = ~(i7 | i8);
        int i10 = i5 | i9;
        int i11 = (~(i7 | i5)) | i9 | (~(i8 | i5));
        int i12 = ~((~i5) | i6 | i3);
        int i13 = i6 + i3 + i4 + ((-2027816600) * i) + ((-1234684791) * i2);
        int i14 = i13 * i13;
        int i15 = (i6 * (-132237830)) + 1711013888 + ((-132237830) * i3) + (i10 * 228444679) + (228444679 * i11) + ((-228444679) * i12) + (96206848 * i4) + (811597824 * i) + (1100742656 * i2) + (1751056384 * i14);
        int i16 = ((i6 * 572746074) - 905264446) + (i3 * 572746074) + (i10 * (-489)) + (i11 * (-489)) + (i12 * 489) + (i4 * 572745585) + (i * 982511336) + (i2 * (-774025351)) + (i14 * 1257177088);
        int i17 = i15 + (i16 * i16 * 1874919424);
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? onNavigationEvent(objArr) : onExtraCallback(objArr) : onWarmupCompleted(objArr) : IAuthTabCallback(objArr);
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        unsubscribeFromTracingStateChanges unsubscribefromtracingstatechanges = (unsubscribeFromTracingStateChanges) objArr[0];
        reportTimeStamp reporttimestamp = (reportTimeStamp) objArr[1];
        onNavigationEvent onnavigationevent = (onNavigationEvent) objArr[2];
        RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) objArr[3];
        View view = (View) objArr[4];
        int i = 2 % 2;
        int i2 = access000 + 83;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(unsubscribefromtracingstatechanges, reporttimestamp, onnavigationevent, viewHolder, view);
        if (i3 != 0) {
            throw null;
        }
        int i4 = access000 + 3;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public unsubscribeFromTracingStateChanges(boolean z, boolean z2, boolean z3) {
        this.onNavigationEvent = z;
        this.IAuthTabCallback = z2;
        this.IAuthTabCallbackStub = z3;
        this.onExtraCallback = new ArrayList();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ unsubscribeFromTracingStateChanges(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = 2 % 2;
            z = true;
        }
        if ((i & 2) != 0) {
            int i3 = access000 + 65;
            IAuthTabCallback_Parcel = i3 % 128;
            z2 = i3 % 2 != 0;
            int i4 = 2 % 2;
        }
        if ((i & 4) != 0) {
            int i5 = access000 + 3;
            IAuthTabCallback_Parcel = i5 % 128;
            z3 = i5 % 2 != 0;
        }
        this(z, z2, z3);
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        unsubscribeFromTracingStateChanges unsubscribefromtracingstatechanges = (unsubscribeFromTracingStateChanges) objArr[0];
        onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 17;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        unsubscribefromtracingstatechanges.onTransact = onextracallbackwithresult;
        if (i3 != 0) {
            return null;
        }
        throw null;
    }

    public final void onExtraCallback(@NotNull List<? extends reportTimeStamp> list) {
        int i = 2 % 2;
        int i2 = access000 + 73;
        IAuthTabCallback_Parcel = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(list, BuildConfig.FLAVOR);
            this.onExtraCallback.clear();
            this.onExtraCallback.addAll(list);
            notifyDataSetChanged();
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(list, BuildConfig.FLAVOR);
        this.onExtraCallback.clear();
        this.onExtraCallback.addAll(list);
        notifyDataSetChanged();
        int i3 = access000 + 85;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0099 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x001a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onNavigationEvent() throws NoWhenBranchMatchedException {
        reportTimeStamp reporttimestamp;
        subscribeToTracingStateChanges subscribetotracingstatechanges;
        PerformanceTracerTracingStateCallback performanceTracerTracingStateCallback;
        int i = 2 % 2;
        List<reportTimeStamp> list = this.onExtraCallback;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            int i2 = IAuthTabCallback_Parcel + 17;
            access000 = i2 % 128;
            if (i2 % 2 == 0) {
                reporttimestamp = (reportTimeStamp) it.next();
                int i3 = 98 / 0;
                if (reporttimestamp instanceof PerformanceTracerTracingStateCallback) {
                    performanceTracerTracingStateCallback = (PerformanceTracerTracingStateCallback) reporttimestamp;
                    if ((!performanceTracerTracingStateCallback.onWarmupCompleted()) && !performanceTracerTracingStateCallback.onExtraCallback()) {
                        return false;
                    }
                } else if (!(reporttimestamp instanceof subscribeToTracingStateChanges)) {
                    int i4 = IAuthTabCallback_Parcel + 91;
                    int i5 = i4 % 128;
                    access000 = i5;
                    int i6 = i4 % 2;
                    if (this.IAuthTabCallback) {
                        int i7 = i5 + 73;
                        IAuthTabCallback_Parcel = i7 % 128;
                        if (i7 % 2 != 0) {
                            subscribetotracingstatechanges = (subscribeToTracingStateChanges) reporttimestamp;
                            int i8 = 77 / 0;
                            if (!subscribetotracingstatechanges.IAuthTabCallback()) {
                                int i9 = access000 + 87;
                                IAuthTabCallback_Parcel = i9 % 128;
                                int i10 = i9 % 2;
                                if (Intrinsics.areEqual(subscribetotracingstatechanges.onNavigationEvent(), Boolean.TRUE)) {
                                    return false;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            subscribetotracingstatechanges = (subscribeToTracingStateChanges) reporttimestamp;
                            if (subscribetotracingstatechanges.IAuthTabCallback()) {
                                continue;
                            } else {
                                int i92 = access000 + 87;
                                IAuthTabCallback_Parcel = i92 % 128;
                                int i102 = i92 % 2;
                                if (Intrinsics.areEqual(subscribetotracingstatechanges.onNavigationEvent(), Boolean.TRUE)) {
                                }
                            }
                        }
                    } else {
                        continue;
                    }
                } else if (!(reporttimestamp instanceof reportMeasure)) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                reporttimestamp = (reportTimeStamp) it.next();
                if (reporttimestamp instanceof PerformanceTracerTracingStateCallback) {
                    performanceTracerTracingStateCallback = (PerformanceTracerTracingStateCallback) reporttimestamp;
                    if (!performanceTracerTracingStateCallback.onWarmupCompleted()) {
                        return false;
                    }
                    continue;
                } else if (!(reporttimestamp instanceof subscribeToTracingStateChanges)) {
                }
            }
        }
        return true;
    }

    public int getItemCount() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 7;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        int size = this.onExtraCallback.size();
        int i4 = access000 + 45;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return size;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
        int i2 = 2 % 2;
        int i3 = access000 + 7;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(viewGroup, BuildConfig.FLAVOR);
        if (i == 0) {
            return new onWarmupCompleted(transparentBackground.onNavigationEvent(viewGroup, R.layout.terms_item_join_terms_header, false), this.onNavigationEvent);
        }
        int i5 = IAuthTabCallback_Parcel + 33;
        int i6 = i5 % 128;
        access000 = i6;
        if (i5 % 2 != 0 ? i == 1 : i == 0) {
            return new onNavigationEvent(transparentBackground.onNavigationEvent(viewGroup, R.layout.terms_item_join_terms_child, false), this.IAuthTabCallback);
        }
        int i7 = i6 + 63;
        IAuthTabCallback_Parcel = i7 % 128;
        int i8 = i7 % 2;
        if (i == 2) {
            return new IAuthTabCallback(transparentBackground.onNavigationEvent(viewGroup, R.layout.terms_item_join_terms_header, false));
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onBindViewHolder(@NotNull final RecyclerView.ViewHolder viewHolder, int i) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(viewHolder, BuildConfig.FLAVOR);
        final reportTimeStamp reporttimestamp = this.onExtraCallback.get(i);
        if (!(reporttimestamp instanceof PerformanceTracerTracingStateCallback)) {
            if (!(reporttimestamp instanceof subscribeToTracingStateChanges)) {
                if (!(reporttimestamp instanceof reportMeasure)) {
                    throw new NoWhenBranchMatchedException();
                }
                ((IAuthTabCallback) viewHolder).onNavigationEvent().setText(((reportMeasure) reporttimestamp).onExtraCallbackWithResult());
                return;
            }
            final onNavigationEvent onnavigationevent = (onNavigationEvent) viewHolder;
            TextView textViewOnExtraCallbackWithResult = onnavigationevent.onExtraCallbackWithResult();
            subscribeToTracingStateChanges subscribetotracingstatechanges = (subscribeToTracingStateChanges) reporttimestamp;
            SpannableString spannableString = new SpannableString(subscribetotracingstatechanges.onExtraCallbackWithResult());
            spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
            textViewOnExtraCallbackWithResult.setText(spannableString);
            ((RecyclerView.ViewHolder) onnavigationevent).onNavigationEvent.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.verify.session.terms.ExpandableTermsAdapter$$ExternalSyntheticLambda3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr = {reporttimestamp, view};
                    int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
                    unsubscribeFromTracingStateChanges.onWarmupCompleted(zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), 280584456, zzgsa.onWarmupCompleted(), iOnWarmupCompleted, -280584456, objArr);
                }
            });
            onnavigationevent.onNavigationEvent().setCheckedState(subscribetotracingstatechanges.IAuthTabCallback());
            if (this.IAuthTabCallback) {
                onnavigationevent.onNavigationEvent().setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.verify.session.terms.ExpandableTermsAdapter$$ExternalSyntheticLambda4
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr = {this.f$0, reporttimestamp, onnavigationevent, viewHolder, view};
                        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
                        unsubscribeFromTracingStateChanges.onWarmupCompleted(zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), -1864801715, zzgsa.onWarmupCompleted(), iOnWarmupCompleted, 1864801717, objArr);
                    }
                });
                onnavigationevent.onNavigationEvent().setOnCheckedChangeListener(new Function2() { // from class: viva.republica.toss.verify.session.terms.ExpandableTermsAdapter$$ExternalSyntheticLambda5
                    public final Object invoke(Object obj, Object obj2) {
                        Object[] objArr = {reporttimestamp, this, (TdsCheckBoxV2View) obj, Boolean.valueOf(((Boolean) obj2).booleanValue())};
                        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
                        return (Unit) unsubscribeFromTracingStateChanges.onWarmupCompleted(zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), -593703600, zzgsa.onWarmupCompleted(), iOnWarmupCompleted, 593703603, objArr);
                    }
                });
                return;
            }
            return;
        }
        int i4 = IAuthTabCallback_Parcel + 31;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) viewHolder;
            PerformanceTracerTracingStateCallback performanceTracerTracingStateCallback = (PerformanceTracerTracingStateCallback) reporttimestamp;
            onwarmupcompleted.onExtraCallbackWithResult().setText(performanceTracerTracingStateCallback.onExtraCallbackWithResult());
            onwarmupcompleted.IAuthTabCallback();
            performanceTracerTracingStateCallback.onNavigationEvent().isEmpty();
            throw null;
        }
        final onWarmupCompleted onwarmupcompleted2 = (onWarmupCompleted) viewHolder;
        PerformanceTracerTracingStateCallback performanceTracerTracingStateCallback2 = (PerformanceTracerTracingStateCallback) reporttimestamp;
        onwarmupcompleted2.onExtraCallbackWithResult().setText(performanceTracerTracingStateCallback2.onExtraCallbackWithResult());
        onwarmupcompleted2.IAuthTabCallback().setRotation(performanceTracerTracingStateCallback2.onNavigationEvent().isEmpty() ? 90.0f : 0.0f);
        ImageView imageViewIAuthTabCallback = onwarmupcompleted2.IAuthTabCallback();
        ComputeExpression computeExpression = ComputeExpression.IAuthTabCallback;
        Context context = ((RecyclerView.ViewHolder) onwarmupcompleted2).onNavigationEvent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, BuildConfig.FLAVOR);
        if (performanceTracerTracingStateCallback2.onNavigationEvent().isEmpty()) {
            int i5 = access000 + 27;
            IAuthTabCallback_Parcel = i5 % 128;
            int i6 = i5 % 2;
            i2 = R.string.terms_accessibility_list_close;
        } else {
            i2 = R.string.terms_accessibility_list_open;
            int i7 = access000 + 123;
            IAuthTabCallback_Parcel = i7 % 128;
            int i8 = i7 % 2;
        }
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-124, ISOFileInfo.FILE_IDENTIFIER, ISOFileInfo.DATA_BYTES2, -126, ISOFileInfo.DATA_BYTES2}, TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0) + 128, objArr);
        imageViewIAuthTabCallback.setContentDescription(computeExpression.onNavigationEvent(context, i2, new Pair[]{getWrite.IAuthTabCallback(((String) objArr[0]).intern(), performanceTracerTracingStateCallback2.onExtraCallbackWithResult())}));
        if (this.IAuthTabCallbackStub) {
            int i9 = access000 + 31;
            IAuthTabCallback_Parcel = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 17 / 0;
                if (!performanceTracerTracingStateCallback2.onExtraCallback()) {
                    int i11 = access000 + 49;
                    IAuthTabCallback_Parcel = i11 % 128;
                    if (i11 % 2 != 0) {
                        onwarmupcompleted2.onWarmupCompleted().setClickable(true);
                    } else {
                        onwarmupcompleted2.onWarmupCompleted().setClickable(false);
                    }
                }
            } else if (!performanceTracerTracingStateCallback2.onExtraCallback()) {
            }
        }
        ((RecyclerView.ViewHolder) onwarmupcompleted2).onNavigationEvent.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.verify.session.terms.ExpandableTermsAdapter$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Throwable {
                unsubscribeFromTracingStateChanges.onExtraCallback(this.f$0, reporttimestamp, onwarmupcompleted2, viewHolder, view);
            }
        });
        onwarmupcompleted2.IAuthTabCallback().setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.verify.session.terms.ExpandableTermsAdapter$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Throwable {
                unsubscribeFromTracingStateChanges.IAuthTabCallback(this.f$0, reporttimestamp, view);
            }
        });
        onwarmupcompleted2.onWarmupCompleted().setOnCheckedChangeListener(new Function2() { // from class: viva.republica.toss.verify.session.terms.ExpandableTermsAdapter$$ExternalSyntheticLambda2
            public final Object invoke(Object obj, Object obj2) {
                return unsubscribeFromTracingStateChanges.onExtraCallbackWithResult(reporttimestamp, this, onwarmupcompleted2, (TdsCheckBoxV2View) obj, ((Boolean) obj2).booleanValue());
            }
        });
        onwarmupcompleted2.onWarmupCompleted().setChecked(performanceTracerTracingStateCallback2.onWarmupCompleted());
    }

    private static final void onNavigationEvent(unsubscribeFromTracingStateChanges unsubscribefromtracingstatechanges, reportTimeStamp reporttimestamp, onWarmupCompleted onwarmupcompleted, RecyclerView.ViewHolder viewHolder, View view) throws Throwable {
        int i = 2 % 2;
        if (!unsubscribefromtracingstatechanges.onNavigationEvent) {
            onwarmupcompleted.IAuthTabCallback().performClick();
            int i2 = access000 + 85;
            IAuthTabCallback_Parcel = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            return;
        }
        if (unsubscribefromtracingstatechanges.IAuthTabCallbackStub) {
            int i3 = IAuthTabCallback_Parcel + 117;
            access000 = i3 % 128;
            int i4 = i3 % 2;
            if (!((PerformanceTracerTracingStateCallback) reporttimestamp).onExtraCallback()) {
                View rootView = onwarmupcompleted.onWarmupCompleted().getRootView();
                Intrinsics.checkNotNullExpressionValue(rootView, BuildConfig.FLAVOR);
                String string = ((RecyclerView.ViewHolder) onwarmupcompleted).onNavigationEvent.getContext().getString(R.string.terms_required_agreement_message);
                Intrinsics.checkNotNullExpressionValue(string, BuildConfig.FLAVOR);
                TdsToastV1.onNavigationEvent onnavigationevent = new TdsToastV1.onNavigationEvent(rootView, string);
                Object[] objArr = new Object[1];
                a(null, null, new byte[]{-112, -113, -122, ISOFileInfo.SECURITY_ATTR_COMPACT, -124, ISOFileInfo.FILE_IDENTIFIER, ISOFileInfo.SECURITY_ATTR_EXP, -107, -126, ISOFileInfo.SECURITY_ATTR_EXP, -109, -112, -113, -126, -113, -107, ISOFileInfo.LCS_BYTE, -108, -109, -113, ISOFileInfo.ENV_TEMP_EF, ISOFileInfo.SECURITY_ATTR_EXP, -126, -119, -110, -111, -119, -112, -113, -122, -119, ISOFileInfo.FCI_EXT, -113, ISOFileInfo.ENV_TEMP_EF, ISOFileInfo.SECURITY_ATTR_EXP, -126, -119, ISOFileInfo.CHANNEL_SECURITY, -126, ISOFileInfo.SECURITY_ATTR_COMPACT, ISOFileInfo.FCI_EXT, ISOFileInfo.FCI_EXT, ISOFileInfo.ENV_TEMP_EF, ISOFileInfo.DATA_BYTES2, ISOFileInfo.SECURITY_ATTR_COMPACT, ISOFileInfo.SECURITY_ATTR_EXP, -126, ISOFileInfo.DATA_BYTES2, ISOFileInfo.LCS_BYTE, ISOFileInfo.DATA_BYTES2, ISOFileInfo.FCI_EXT, -119, -119, -120, ISOFileInfo.FCI_EXT, -122, ISOFileInfo.DATA_BYTES2, ISOFileInfo.DATA_BYTES2, ISOFileInfo.PROP_INFO}, 127 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0), objArr);
                TdsToastV1.onNavigationEvent onnavigationeventOnExtraCallback = TdsToastV1.onNavigationEvent.onExtraCallback(onnavigationevent, ((String) objArr[0]).intern(), 0, 2, (Object) null);
                int iOnExtraCallbackWithResult = M_.onExtraCallback.onExtraCallbackWithResult();
                DisplayMetrics displayMetrics = viewHolder.onNavigationEvent.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics, BuildConfig.FLAVOR);
                onnavigationeventOnExtraCallback.IAuthTabCallback(iOnExtraCallbackWithResult + varyMatches.onNavigationEvent(8, displayMetrics)).onNavigationEvent();
                return;
            }
        }
        onwarmupcompleted.onWarmupCompleted().toggle();
        int i5 = IAuthTabCallback_Parcel + 63;
        access000 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    private static final void onExtraCallback(unsubscribeFromTracingStateChanges unsubscribefromtracingstatechanges, reportTimeStamp reporttimestamp, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 65;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        PerformanceTracerTracingStateCallback performanceTracerTracingStateCallback = (PerformanceTracerTracingStateCallback) reporttimestamp;
        Intrinsics.checkNotNull(view);
        if (i3 != 0) {
            unsubscribefromtracingstatechanges.onNavigationEvent(performanceTracerTracingStateCallback, view);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        unsubscribefromtracingstatechanges.onNavigationEvent(performanceTracerTracingStateCallback, view);
        int i4 = IAuthTabCallback_Parcel + 71;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onExtraCallback(reportTimeStamp reporttimestamp, unsubscribeFromTracingStateChanges unsubscribefromtracingstatechanges, onWarmupCompleted onwarmupcompleted, TdsCheckBoxV2View tdsCheckBoxV2View, boolean z) {
        boolean z2;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(tdsCheckBoxV2View, BuildConfig.FLAVOR);
        PerformanceTracerTracingStateCallback performanceTracerTracingStateCallback = (PerformanceTracerTracingStateCallback) reporttimestamp;
        if (performanceTracerTracingStateCallback.onWarmupCompleted() != z) {
            int i2 = access000 + 75;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            z2 = true;
        } else {
            z2 = false;
        }
        performanceTracerTracingStateCallback.onWarmupCompleted(z);
        onExtraCallbackWithResult onextracallbackwithresult = unsubscribefromtracingstatechanges.onTransact;
        if (onextracallbackwithresult != null) {
            onextracallbackwithresult.IAuthTabCallback(performanceTracerTracingStateCallback.onExtraCallbackWithResult(), z);
        }
        if (z2) {
            int i4 = access000 + 85;
            int i5 = i4 % 128;
            IAuthTabCallback_Parcel = i5;
            int i6 = i4 % 2;
            if (unsubscribefromtracingstatechanges.IAuthTabCallback) {
                int i7 = i5 + 23;
                access000 = i7 % 128;
                int i8 = i7 % 2;
                unsubscribefromtracingstatechanges.onExtraCallbackWithResult(performanceTracerTracingStateCallback, z);
            }
        }
        if (unsubscribefromtracingstatechanges.IAuthTabCallbackStub && z) {
            int i9 = access000 + 55;
            IAuthTabCallback_Parcel = i9 % 128;
            int i10 = i9 % 2;
            if (performanceTracerTracingStateCallback.onExtraCallback()) {
                onwarmupcompleted.IAuthTabCallback().performClick();
            }
        }
        return Unit.INSTANCE;
    }

    private static final void onExtraCallback(reportTimeStamp reporttimestamp, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 27;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            subscribeToTracingStateChanges subscribetotracingstatechanges = (subscribeToTracingStateChanges) reporttimestamp;
            String strDecode = URLDecoder.decode(StringsKt.trim(subscribetotracingstatechanges.onWarmupCompleted()).toString(), "utf-8");
            Intrinsics.checkNotNullExpressionValue(strDecode, BuildConfig.FLAVOR);
            String string = StringsKt.trim(strDecode).toString();
            if (string.length() <= 0) {
                if (subscribetotracingstatechanges.onExtraCallback() != null) {
                    int i3 = access000 + 9;
                    IAuthTabCallback_Parcel = i3 % 128;
                    int i4 = i3 % 2;
                    view.getContext().startActivity(subscribetotracingstatechanges.onExtraCallback());
                    return;
                }
                return;
            }
            Object[] objArr = new Object[1];
            a(null, null, new byte[]{-105, -124, -108, -119, -119, -120, ISOFileInfo.FCI_EXT, ISOFileInfo.FCI_EXT, ISOFileInfo.ENV_TEMP_EF, ISOFileInfo.DATA_BYTES2, -107, -124, -122, -106, ISOFileInfo.FCI_EXT}, 126 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0), objArr);
            Uri.Builder builderBuildUpon = Uri.parse(((String) objArr[0]).intern()).buildUpon();
            Object[] objArr2 = new Object[1];
            a(null, null, new byte[]{ISOFileInfo.FILE_IDENTIFIER, -107, -106}, 127 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr2);
            Uri.Builder builderAppendQueryParameter = builderBuildUpon.appendQueryParameter(((String) objArr2[0]).intern(), string);
            Object[] objArr3 = new Object[1];
            a(null, null, new byte[]{-124, ISOFileInfo.FILE_IDENTIFIER, ISOFileInfo.DATA_BYTES2, -126, ISOFileInfo.DATA_BYTES2}, 127 - (Process.myPid() >> 22), objArr3);
            view.getContext().startActivity(new Intent("android.intent.action.VIEW", builderAppendQueryParameter.appendQueryParameter(((String) objArr3[0]).intern(), StringsKt.trim(subscribetotracingstatechanges.onExtraCallbackWithResult()).toString()).build()));
            return;
        }
        String strDecode2 = URLDecoder.decode(StringsKt.trim(((subscribeToTracingStateChanges) reporttimestamp).onWarmupCompleted()).toString(), "utf-8");
        Intrinsics.checkNotNullExpressionValue(strDecode2, BuildConfig.FLAVOR);
        StringsKt.trim(strDecode2).toString().length();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(((o.subscribeToTracingStateChanges) r5).onNavigationEvent(), java.lang.Boolean.FALSE) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(((o.subscribeToTracingStateChanges) r5).onNavigationEvent(), java.lang.Boolean.FALSE) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        r5 = ((androidx.recyclerview.widget.RecyclerView.ViewHolder) r6).onNavigationEvent.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, net.sf.scuba.smartcards.BuildConfig.FLAVOR);
        r5 = o.hasVaryAll.IAuthTabCallback(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
    
        if (r5 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        r1 = r5.getString(viva.republica.toss.R.string.terms_required_agreement_message);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, net.sf.scuba.smartcards.BuildConfig.FLAVOR);
        r3 = new im.toss.uikit.widget.snackbar.TdsToastV1.onNavigationEvent(r5, r1);
        r0 = new java.lang.Object[1];
        a(null, null, new byte[]{-112, -113, -122, net.sf.scuba.smartcards.ISOFileInfo.SECURITY_ATTR_COMPACT, -124, net.sf.scuba.smartcards.ISOFileInfo.FILE_IDENTIFIER, net.sf.scuba.smartcards.ISOFileInfo.SECURITY_ATTR_EXP, -107, -126, net.sf.scuba.smartcards.ISOFileInfo.SECURITY_ATTR_EXP, -109, -112, -113, -126, -113, -107, net.sf.scuba.smartcards.ISOFileInfo.LCS_BYTE, -108, -109, -113, net.sf.scuba.smartcards.ISOFileInfo.ENV_TEMP_EF, net.sf.scuba.smartcards.ISOFileInfo.SECURITY_ATTR_EXP, -126, -119, -110, -111, -119, -112, -113, -122, -119, net.sf.scuba.smartcards.ISOFileInfo.FCI_EXT, -113, net.sf.scuba.smartcards.ISOFileInfo.ENV_TEMP_EF, net.sf.scuba.smartcards.ISOFileInfo.SECURITY_ATTR_EXP, -126, -119, net.sf.scuba.smartcards.ISOFileInfo.CHANNEL_SECURITY, -126, net.sf.scuba.smartcards.ISOFileInfo.SECURITY_ATTR_COMPACT, net.sf.scuba.smartcards.ISOFileInfo.FCI_EXT, net.sf.scuba.smartcards.ISOFileInfo.FCI_EXT, net.sf.scuba.smartcards.ISOFileInfo.ENV_TEMP_EF, net.sf.scuba.smartcards.ISOFileInfo.DATA_BYTES2, net.sf.scuba.smartcards.ISOFileInfo.SECURITY_ATTR_COMPACT, net.sf.scuba.smartcards.ISOFileInfo.SECURITY_ATTR_EXP, -126, net.sf.scuba.smartcards.ISOFileInfo.DATA_BYTES2, net.sf.scuba.smartcards.ISOFileInfo.LCS_BYTE, net.sf.scuba.smartcards.ISOFileInfo.DATA_BYTES2, net.sf.scuba.smartcards.ISOFileInfo.FCI_EXT, -119, -119, -120, net.sf.scuba.smartcards.ISOFileInfo.FCI_EXT, -122, net.sf.scuba.smartcards.ISOFileInfo.DATA_BYTES2, net.sf.scuba.smartcards.ISOFileInfo.DATA_BYTES2, net.sf.scuba.smartcards.ISOFileInfo.PROP_INFO}, android.view.KeyEvent.getDeadChar(0, 0) + org.bouncycastle.asn1.eac.CertificateBody.profileType, r0);
        r4 = im.toss.uikit.widget.snackbar.TdsToastV1.onNavigationEvent.onExtraCallback(r3, ((java.lang.String) r0[0]).intern(), 0, 2, (java.lang.Object) null);
        r5 = o.M_.onExtraCallback.onExtraCallbackWithResult();
        r7 = r7.onNavigationEvent.getResources().getDisplayMetrics();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, net.sf.scuba.smartcards.BuildConfig.FLAVOR);
        r4.IAuthTabCallback(r5 + o.varyMatches.onNavigationEvent(8, r7)).onNavigationEvent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a4, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onExtraCallbackWithResult(unsubscribeFromTracingStateChanges unsubscribefromtracingstatechanges, reportTimeStamp reporttimestamp, onNavigationEvent onnavigationevent, RecyclerView.ViewHolder viewHolder, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 83;
        int i3 = i2 % 128;
        access000 = i3;
        if (i2 % 2 != 0) {
            if (!(!unsubscribefromtracingstatechanges.IAuthTabCallbackStub)) {
                int i4 = i3 + 35;
                IAuthTabCallback_Parcel = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 55 / 0;
                }
            }
            onnavigationevent.onNavigationEvent().toggle();
            return;
        }
        boolean z = unsubscribefromtracingstatechanges.IAuthTabCallbackStub;
        throw null;
    }

    private static final Unit onExtraCallback(reportTimeStamp reporttimestamp, unsubscribeFromTracingStateChanges unsubscribefromtracingstatechanges, TdsCheckBoxV2View tdsCheckBoxV2View, boolean z) {
        boolean z2;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(tdsCheckBoxV2View, BuildConfig.FLAVOR);
        subscribeToTracingStateChanges subscribetotracingstatechanges = (subscribeToTracingStateChanges) reporttimestamp;
        if (subscribetotracingstatechanges.IAuthTabCallback() != z) {
            z2 = true;
        } else {
            int i2 = access000 + 49;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            z2 = false;
        }
        subscribetotracingstatechanges.onWarmupCompleted(z);
        onExtraCallbackWithResult onextracallbackwithresult = unsubscribefromtracingstatechanges.onTransact;
        if (onextracallbackwithresult != null) {
            onextracallbackwithresult.onExtraCallbackWithResult(subscribetotracingstatechanges.onExtraCallbackWithResult(), z);
        }
        if (z2) {
            int i4 = IAuthTabCallback_Parcel;
            int i5 = i4 + 49;
            access000 = i5 % 128;
            int i6 = i5 % 2;
            if (unsubscribefromtracingstatechanges.IAuthTabCallbackStub) {
                int i7 = i4 + 117;
                access000 = i7 % 128;
                int i8 = i7 % 2;
                unsubscribefromtracingstatechanges.onExtraCallback(subscribetotracingstatechanges, z);
            }
            unsubscribefromtracingstatechanges.onExtraCallbackWithResult(subscribetotracingstatechanges);
        }
        return Unit.INSTANCE;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        char[] cArr2;
        int length;
        char[] cArr3;
        int i2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr4 = IAuthTabCallbackDefault;
        char c = '0';
        if (cArr4 != null) {
            int i4 = $10 + 83;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                length = cArr4.length;
                cArr3 = new char[length];
                i2 = 1;
            } else {
                length = cArr4.length;
                cArr3 = new char[length];
                i2 = 0;
            }
            while (i2 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr4[i2])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0), View.MeasureSpec.getSize(0) + 77, TextUtils.indexOf(BuildConfig.FLAVOR, c) + 20953, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i2] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i2++;
                    c = '0';
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr4 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(asInterface)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        long j = 0;
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 75, Process.getGidForName(BuildConfig.FLAVOR) + 16038, -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        if (IAuthTabCallbackStubProxy) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i5 = $10 + 109;
                $11 = i5 % 128;
                if (i5 % 2 == 0) {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr4[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) * defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] * iIntValue);
                    try {
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTapTimeout() >> 16), 63 - (ViewConfiguration.getPressedStateDuration() >> 16), 12214 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 260110015, false, "v", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr4[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 63, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
            }
            objArr[0] = new String(cArr5);
            return;
        }
        if (!asBinder) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr4[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            String str = new String(cArr6);
            int i6 = $10 + 17;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            objArr[0] = str;
            return;
        }
        int i8 = $10 + 97;
        $11 = i8 % 128;
        if (i8 % 2 == 0) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 1;
        } else {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        }
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            cArr2[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr4[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1))), 63 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0) + 12215, 260110015, false, "v", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
            j = 0;
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i, @NotNull List<Object> list) throws Throwable {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(viewHolder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(list, BuildConfig.FLAVOR);
        if (list.isEmpty()) {
            int i3 = access000 + 105;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
            onBindViewHolder(viewHolder, i);
            return;
        }
        reportTimeStamp reporttimestamp = this.onExtraCallback.get(i);
        Object obj = null;
        if (reporttimestamp instanceof PerformanceTracerTracingStateCallback) {
            ((onWarmupCompleted) viewHolder).onWarmupCompleted().setCheckedState(((PerformanceTracerTracingStateCallback) reporttimestamp).onWarmupCompleted());
            int i5 = IAuthTabCallback_Parcel + 115;
            access000 = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
            return;
        }
        if (reporttimestamp instanceof subscribeToTracingStateChanges) {
            ((onNavigationEvent) viewHolder).onNavigationEvent().setCheckedState(((subscribeToTracingStateChanges) reporttimestamp).IAuthTabCallback());
            return;
        }
        if (!(reporttimestamp instanceof reportMeasure)) {
            throw new NoWhenBranchMatchedException();
        }
        int i6 = access000 + 79;
        IAuthTabCallback_Parcel = i6 % 128;
        if (i6 % 2 == 0) {
        } else {
            obj.hashCode();
            throw null;
        }
    }

    private final void onNavigationEvent(PerformanceTracerTracingStateCallback performanceTracerTracingStateCallback, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 61;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            performanceTracerTracingStateCallback.onNavigationEvent().isEmpty();
            throw null;
        }
        if (performanceTracerTracingStateCallback.onNavigationEvent().isEmpty()) {
            onExtraCallbackWithResult(performanceTracerTracingStateCallback, view);
            this.onWarmupCompleted = null;
            return;
        }
        Pair<PerformanceTracerTracingStateCallback, ? extends View> pair = this.onWarmupCompleted;
        if (pair != null) {
            onExtraCallbackWithResult((PerformanceTracerTracingStateCallback) pair.getFirst(), (View) pair.getSecond());
        }
        onWarmupCompleted(performanceTracerTracingStateCallback, view);
        onExtraCallbackWithResult onextracallbackwithresult = this.onTransact;
        if (onextracallbackwithresult != null) {
            onextracallbackwithresult.onExtraCallbackWithResult(this.onExtraCallback.indexOf(performanceTracerTracingStateCallback));
        }
        if (this.IAuthTabCallback) {
            return;
        }
        this.onWarmupCompleted = new Pair<>(performanceTracerTracingStateCallback, view);
        int i3 = IAuthTabCallback_Parcel + 25;
        access000 = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public int getItemViewType(int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = access000 + 103;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        reportTimeStamp reporttimestamp = this.onExtraCallback.get(i);
        if (!(!(reporttimestamp instanceof PerformanceTracerTracingStateCallback))) {
            int i5 = IAuthTabCallback_Parcel + 89;
            access000 = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }
        if (reporttimestamp instanceof subscribeToTracingStateChanges) {
            return 1;
        }
        if (!(reporttimestamp instanceof reportMeasure)) {
            throw new NoWhenBranchMatchedException();
        }
        int i7 = access000 + 21;
        IAuthTabCallback_Parcel = i7 % 128;
        return i7 % 2 != 0 ? 4 : 2;
    }

    private final void onExtraCallbackWithResult(PerformanceTracerTracingStateCallback performanceTracerTracingStateCallback, View view) throws Throwable {
        int i = 2 % 2;
        int iIndexOf = this.onExtraCallback.indexOf(performanceTracerTracingStateCallback) + 1;
        List listDrop = CollectionsKt.drop(this.onExtraCallback, iIndexOf);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listDrop) {
            int i2 = access000 + 61;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            if (!(((reportTimeStamp) obj) instanceof subscribeToTracingStateChanges)) {
                break;
            }
            int i4 = access000 + 77;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            arrayList.add(obj);
        }
        ArrayList<subscribeToTracingStateChanges> arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            Object obj2 = null;
            if (!it.hasNext()) {
                performanceTracerTracingStateCallback.onNavigationEvent().addAll(arrayList2);
                for (subscribeToTracingStateChanges subscribetotracingstatechanges : arrayList2) {
                    int i6 = access000 + 3;
                    IAuthTabCallback_Parcel = i6 % 128;
                    int i7 = i6 % 2;
                    this.onExtraCallback.remove(iIndexOf);
                }
                notifyItemRangeRemoved(iIndexOf, arrayList2.size());
                transparentBackground.onExtraCallbackWithResult(view, 0.0f);
                ComputeExpression computeExpression = ComputeExpression.IAuthTabCallback;
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, BuildConfig.FLAVOR);
                int i8 = R.string.terms_accessibility_list_open;
                Object[] objArr = new Object[1];
                a(null, null, new byte[]{-124, ISOFileInfo.FILE_IDENTIFIER, ISOFileInfo.DATA_BYTES2, -126, ISOFileInfo.DATA_BYTES2}, (Process.myTid() >> 22) + CertificateBody.profileType, objArr);
                view.setContentDescription(computeExpression.onNavigationEvent(context, i8, new Pair[]{getWrite.IAuthTabCallback(((String) objArr[0]).intern(), performanceTracerTracingStateCallback.onExtraCallbackWithResult())}));
                return;
            }
            int i9 = access000 + 27;
            IAuthTabCallback_Parcel = i9 % 128;
            if (i9 % 2 != 0) {
                reportTimeStamp reporttimestamp = (reportTimeStamp) it.next();
                Intrinsics.checkNotNull(reporttimestamp, BuildConfig.FLAVOR);
                arrayList2.add((subscribeToTracingStateChanges) reporttimestamp);
                obj2.hashCode();
                throw null;
            }
            reportTimeStamp reporttimestamp2 = (reportTimeStamp) it.next();
            Intrinsics.checkNotNull(reporttimestamp2, BuildConfig.FLAVOR);
            arrayList2.add((subscribeToTracingStateChanges) reporttimestamp2);
        }
    }

    private final void onWarmupCompleted(PerformanceTracerTracingStateCallback performanceTracerTracingStateCallback, View view) throws Throwable {
        int i = 2 % 2;
        int iIndexOf = this.onExtraCallback.indexOf(performanceTracerTracingStateCallback);
        List<reportTimeStamp> list = this.onExtraCallback;
        int i2 = iIndexOf + 1;
        List<subscribeToTracingStateChanges> listOnNavigationEvent = performanceTracerTracingStateCallback.onNavigationEvent();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listOnNavigationEvent, 10));
        for (subscribeToTracingStateChanges subscribetotracingstatechanges : listOnNavigationEvent) {
            int i3 = IAuthTabCallback_Parcel + 57;
            access000 = i3 % 128;
            int i4 = i3 % 2;
            subscribetotracingstatechanges.onWarmupCompleted(performanceTracerTracingStateCallback.onWarmupCompleted());
            arrayList.add(subscribetotracingstatechanges);
        }
        list.addAll(i2, arrayList);
        notifyItemRangeInserted(i2, performanceTracerTracingStateCallback.onNavigationEvent().size());
        performanceTracerTracingStateCallback.onNavigationEvent().clear();
        transparentBackground.onExtraCallbackWithResult(view, 90.0f);
        ComputeExpression computeExpression = ComputeExpression.IAuthTabCallback;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, BuildConfig.FLAVOR);
        int i5 = R.string.terms_accessibility_list_close;
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-124, ISOFileInfo.FILE_IDENTIFIER, ISOFileInfo.DATA_BYTES2, -126, ISOFileInfo.DATA_BYTES2}, 127 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr);
        view.setContentDescription(computeExpression.onNavigationEvent(context, i5, new Pair[]{getWrite.IAuthTabCallback(((String) objArr[0]).intern(), performanceTracerTracingStateCallback.onExtraCallbackWithResult())}));
        int i6 = IAuthTabCallback_Parcel + 83;
        access000 = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    private final void onExtraCallbackWithResult(subscribeToTracingStateChanges subscribetotracingstatechanges) {
        int i = 2 % 2;
        Integer numValueOf = Integer.valueOf(this.onExtraCallback.indexOf(subscribetotracingstatechanges));
        Object obj = null;
        if (numValueOf.intValue() < 0) {
            int i2 = IAuthTabCallback_Parcel + 63;
            access000 = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            numValueOf = null;
        }
        if (numValueOf != null) {
            int i3 = access000 + 93;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
            PerformanceTracerTracingStateCallback performanceTracerTracingStateCallback = (PerformanceTracerTracingStateCallback) CollectionsKt.lastOrNull(CollectionsKt.filterIsInstance(CollectionsKt.take(this.onExtraCallback, numValueOf.intValue()), PerformanceTracerTracingStateCallback.class));
            if (performanceTracerTracingStateCallback != null) {
                int iIndexOf = this.onExtraCallback.indexOf(performanceTracerTracingStateCallback);
                List listDrop = CollectionsKt.drop(this.onExtraCallback, iIndexOf + 1);
                ArrayList<reportTimeStamp> arrayList = new ArrayList();
                for (Object obj2 : listDrop) {
                    if (!(((reportTimeStamp) obj2) instanceof subscribeToTracingStateChanges)) {
                        break;
                    } else {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                for (reportTimeStamp reporttimestamp : arrayList) {
                    Intrinsics.checkNotNull(reporttimestamp, BuildConfig.FLAVOR);
                    arrayList2.add((subscribeToTracingStateChanges) reporttimestamp);
                }
                boolean z = true;
                if (!arrayList2.isEmpty()) {
                    Iterator it = arrayList2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        int i5 = access000 + 9;
                        IAuthTabCallback_Parcel = i5 % 128;
                        if (i5 % 2 != 0) {
                            ((subscribeToTracingStateChanges) it.next()).IAuthTabCallback();
                            obj.hashCode();
                            throw null;
                        }
                        if (!((subscribeToTracingStateChanges) it.next()).IAuthTabCallback()) {
                            z = false;
                            break;
                        }
                    }
                } else {
                    int i6 = access000 + 57;
                    IAuthTabCallback_Parcel = i6 % 128;
                    int i7 = i6 % 2;
                }
                performanceTracerTracingStateCallback.onWarmupCompleted(z);
                onExtraCallbackWithResult onextracallbackwithresult = this.onTransact;
                if (onextracallbackwithresult != null) {
                    int i8 = IAuthTabCallback_Parcel + 107;
                    access000 = i8 % 128;
                    if (i8 % 2 == 0) {
                        onextracallbackwithresult.IAuthTabCallback(performanceTracerTracingStateCallback.onExtraCallbackWithResult(), performanceTracerTracingStateCallback.onWarmupCompleted());
                        throw null;
                    }
                    onextracallbackwithresult.IAuthTabCallback(performanceTracerTracingStateCallback.onExtraCallbackWithResult(), performanceTracerTracingStateCallback.onWarmupCompleted());
                }
                notifyItemChanged(iIndexOf, "UpdateCheckBox");
            }
        }
    }

    private final void onExtraCallback(subscribeToTracingStateChanges subscribetotracingstatechanges, boolean z) {
        int i = 2 % 2;
        int i2 = access000 + 21;
        IAuthTabCallback_Parcel = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Integer.valueOf(this.onExtraCallback.indexOf(subscribetotracingstatechanges)).intValue();
            throw null;
        }
        Integer numValueOf = Integer.valueOf(this.onExtraCallback.indexOf(subscribetotracingstatechanges));
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            PerformanceTracerTracingStateCallback performanceTracerTracingStateCallback = (PerformanceTracerTracingStateCallback) CollectionsKt.lastOrNull(CollectionsKt.filterIsInstance(CollectionsKt.take(this.onExtraCallback, numValueOf.intValue()), PerformanceTracerTracingStateCallback.class));
            if (performanceTracerTracingStateCallback != null) {
                int iIndexOf = this.onExtraCallback.indexOf(performanceTracerTracingStateCallback) + 1;
                List listDrop = CollectionsKt.drop(this.onExtraCallback, iIndexOf);
                ArrayList<reportTimeStamp> arrayList = new ArrayList();
                for (Object obj2 : listDrop) {
                    if (!(((reportTimeStamp) obj2) instanceof subscribeToTracingStateChanges)) {
                        break;
                    } else {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                for (reportTimeStamp reporttimestamp : arrayList) {
                    Intrinsics.checkNotNull(reporttimestamp, BuildConfig.FLAVOR);
                    arrayList2.add((subscribeToTracingStateChanges) reporttimestamp);
                    int i3 = IAuthTabCallback_Parcel + 61;
                    access000 = i3 % 128;
                    int i4 = i3 % 2;
                }
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                int i5 = access000 + 55;
                IAuthTabCallback_Parcel = i5 % 128;
                int i6 = i5 % 2;
                while (it.hasNext()) {
                    int i7 = IAuthTabCallback_Parcel + 23;
                    access000 = i7 % 128;
                    int i8 = i7 % 2;
                    ((subscribeToTracingStateChanges) it.next()).onWarmupCompleted(z);
                    arrayList3.add(Unit.INSTANCE);
                }
                notifyItemRangeChanged(iIndexOf, arrayList2.size());
            }
        }
        int i9 = access000 + 3;
        IAuthTabCallback_Parcel = i9 % 128;
        if (i9 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private final void onExtraCallbackWithResult(PerformanceTracerTracingStateCallback performanceTracerTracingStateCallback, boolean z) {
        int i = 2 % 2;
        int iIndexOf = this.onExtraCallback.indexOf(performanceTracerTracingStateCallback) + 1;
        List listDrop = CollectionsKt.drop(this.onExtraCallback, iIndexOf);
        ArrayList<reportTimeStamp> arrayList = new ArrayList();
        for (Object obj : listDrop) {
            int i2 = IAuthTabCallback_Parcel + 125;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            if (!(((reportTimeStamp) obj) instanceof subscribeToTracingStateChanges)) {
                break;
            }
            int i4 = IAuthTabCallback_Parcel + 61;
            access000 = i4 % 128;
            int i5 = i4 % 2;
            arrayList.add(obj);
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (reportTimeStamp reporttimestamp : arrayList) {
            Intrinsics.checkNotNull(reporttimestamp, BuildConfig.FLAVOR);
            arrayList2.add((subscribeToTracingStateChanges) reporttimestamp);
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            int i6 = IAuthTabCallback_Parcel + 55;
            access000 = i6 % 128;
            if (i6 % 2 == 0) {
                ((subscribeToTracingStateChanges) it.next()).onWarmupCompleted(z);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            subscribeToTracingStateChanges subscribetotracingstatechanges = (subscribeToTracingStateChanges) it.next();
            subscribetotracingstatechanges.onWarmupCompleted(z);
            onExtraCallbackWithResult onextracallbackwithresult = this.onTransact;
            if (onextracallbackwithresult != null) {
                onextracallbackwithresult.onExtraCallbackWithResult(subscribetotracingstatechanges.onExtraCallbackWithResult(), subscribetotracingstatechanges.IAuthTabCallback());
            }
        }
        notifyItemRangeChanged(iIndexOf, arrayList2.size(), "UpdateCheckBox");
        int i7 = access000 + 89;
        IAuthTabCallback_Parcel = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 57 / 0;
        }
    }

    public static final class onWarmupCompleted extends RecyclerView.ViewHolder {
        private final TdsCheckBoxV2View ICustomTabsCallback;
        private final ImageView extraCallback;
        private final TextView writeTypedObject;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onWarmupCompleted(@NotNull View view, final boolean z) {
            super(view);
            Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
            TdsCheckBoxV2View tdsCheckBoxV2ViewFindViewById = view.findViewById(R.id.checkBox);
            Intrinsics.checkNotNullExpressionValue(tdsCheckBoxV2ViewFindViewById, BuildConfig.FLAVOR);
            TdsCheckBoxV2View tdsCheckBoxV2View = tdsCheckBoxV2ViewFindViewById;
            this.ICustomTabsCallback = tdsCheckBoxV2View;
            View viewFindViewById = view.findViewById(R.id.titleText);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, BuildConfig.FLAVOR);
            this.writeTypedObject = (TextView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.expandButton);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, BuildConfig.FLAVOR);
            this.extraCallback = (ImageView) viewFindViewById2;
            tdsCheckBoxV2View.setVisibility(z ? 0 : 8);
            setProtocolsokhttp.onExtraCallbackWithResult(view, new AccessibilityDelegateCompat() { // from class: o.unsubscribeFromTracingStateChanges.onWarmupCompleted.3
                public void onInitializeAccessibilityEvent(View view2, AccessibilityEvent accessibilityEvent) {
                    Intrinsics.checkNotNullParameter(view2, BuildConfig.FLAVOR);
                    Intrinsics.checkNotNullParameter(accessibilityEvent, BuildConfig.FLAVOR);
                    super.onInitializeAccessibilityEvent(view2, accessibilityEvent);
                    accessibilityEvent.setChecked(onWarmupCompleted.this.onWarmupCompleted().isChecked());
                }

                public void onInitializeAccessibilityNodeInfo(View view2, SuspendAnimationKtExternalSyntheticLambda4 suspendAnimationKtExternalSyntheticLambda4) {
                    Intrinsics.checkNotNullParameter(view2, BuildConfig.FLAVOR);
                    Intrinsics.checkNotNullParameter(suspendAnimationKtExternalSyntheticLambda4, BuildConfig.FLAVOR);
                    super.onInitializeAccessibilityNodeInfo(view2, suspendAnimationKtExternalSyntheticLambda4);
                    suspendAnimationKtExternalSyntheticLambda4.onExtraCallback(z);
                    suspendAnimationKtExternalSyntheticLambda4.IAuthTabCallback(onWarmupCompleted.this.onWarmupCompleted().isChecked());
                }
            });
        }

        public final TdsCheckBoxV2View onWarmupCompleted() {
            return this.ICustomTabsCallback;
        }

        public final TextView onExtraCallbackWithResult() {
            return this.writeTypedObject;
        }

        public final ImageView IAuthTabCallback() {
            return this.extraCallback;
        }
    }

    public static final class onNavigationEvent extends RecyclerView.ViewHolder {
        private final TextView ICustomTabsCallback;
        private final TdsCheckBoxV2View extraCallback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onNavigationEvent(@NotNull View view, final boolean z) {
            super(view);
            Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
            TdsCheckBoxV2View tdsCheckBoxV2ViewFindViewById = view.findViewById(R.id.checkBox);
            Intrinsics.checkNotNullExpressionValue(tdsCheckBoxV2ViewFindViewById, BuildConfig.FLAVOR);
            TdsCheckBoxV2View tdsCheckBoxV2View = tdsCheckBoxV2ViewFindViewById;
            this.extraCallback = tdsCheckBoxV2View;
            View viewFindViewById = view.findViewById(R.id.titleText);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, BuildConfig.FLAVOR);
            this.ICustomTabsCallback = (TextView) viewFindViewById;
            tdsCheckBoxV2View.setVisibility(z ? 0 : 8);
            ViewGroup.LayoutParams layoutParams = tdsCheckBoxV2View.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int i = z ? 56 : 16;
                DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics, BuildConfig.FLAVOR);
                marginLayoutParams.leftMargin = varyMatches.onNavigationEvent(Integer.valueOf(i), displayMetrics);
                tdsCheckBoxV2View.setLayoutParams(marginLayoutParams);
                setProtocolsokhttp.onExtraCallbackWithResult(view, new AccessibilityDelegateCompat() { // from class: o.unsubscribeFromTracingStateChanges.onNavigationEvent.4
                    public void onInitializeAccessibilityEvent(View view2, AccessibilityEvent accessibilityEvent) {
                        Intrinsics.checkNotNullParameter(view2, BuildConfig.FLAVOR);
                        Intrinsics.checkNotNullParameter(accessibilityEvent, BuildConfig.FLAVOR);
                        super.onInitializeAccessibilityEvent(view2, accessibilityEvent);
                        accessibilityEvent.setChecked(onNavigationEvent.this.onNavigationEvent().isChecked());
                    }

                    public void onInitializeAccessibilityNodeInfo(View view2, SuspendAnimationKtExternalSyntheticLambda4 suspendAnimationKtExternalSyntheticLambda4) {
                        Intrinsics.checkNotNullParameter(view2, BuildConfig.FLAVOR);
                        Intrinsics.checkNotNullParameter(suspendAnimationKtExternalSyntheticLambda4, BuildConfig.FLAVOR);
                        super.onInitializeAccessibilityNodeInfo(view2, suspendAnimationKtExternalSyntheticLambda4);
                        suspendAnimationKtExternalSyntheticLambda4.onExtraCallback(z);
                        suspendAnimationKtExternalSyntheticLambda4.IAuthTabCallback(onNavigationEvent.this.onNavigationEvent().isChecked());
                    }
                });
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }

        public final TdsCheckBoxV2View onNavigationEvent() {
            return this.extraCallback;
        }

        public final TextView onExtraCallbackWithResult() {
            return this.ICustomTabsCallback;
        }
    }

    static final class IAuthTabCallback extends RecyclerView.ViewHolder {
        private final TextView ICustomTabsCallback;
        private final TdsCheckBoxV2View extraCallback;
        private final ImageView writeTypedObject;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallback(@NotNull View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
            TdsCheckBoxV2View tdsCheckBoxV2ViewFindViewById = view.findViewById(R.id.checkBox);
            Intrinsics.checkNotNullExpressionValue(tdsCheckBoxV2ViewFindViewById, BuildConfig.FLAVOR);
            TdsCheckBoxV2View tdsCheckBoxV2View = tdsCheckBoxV2ViewFindViewById;
            this.extraCallback = tdsCheckBoxV2View;
            View viewFindViewById = view.findViewById(R.id.titleText);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, BuildConfig.FLAVOR);
            this.ICustomTabsCallback = (TextView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.expandButton);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, BuildConfig.FLAVOR);
            ImageView imageView = (ImageView) viewFindViewById2;
            this.writeTypedObject = imageView;
            tdsCheckBoxV2View.setVisibility(8);
            imageView.setVisibility(8);
        }

        public final TextView onNavigationEvent() {
            return this.ICustomTabsCallback;
        }
    }

    public static /* synthetic */ void IAuthTabCallback(unsubscribeFromTracingStateChanges unsubscribefromtracingstatechanges, reportTimeStamp reporttimestamp, onNavigationEvent onnavigationevent, RecyclerView.ViewHolder viewHolder, View view) {
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
        onWarmupCompleted(zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), -1864801715, iOnWarmupCompleted2, iOnWarmupCompleted, 1864801717, new Object[]{unsubscribefromtracingstatechanges, reporttimestamp, onnavigationevent, viewHolder, view});
    }

    public static /* synthetic */ void IAuthTabCallback(reportTimeStamp reporttimestamp, View view) {
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
        onWarmupCompleted(zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), 280584456, iOnWarmupCompleted2, iOnWarmupCompleted, -280584456, new Object[]{reporttimestamp, view});
    }

    public static /* synthetic */ Unit IAuthTabCallback(reportTimeStamp reporttimestamp, unsubscribeFromTracingStateChanges unsubscribefromtracingstatechanges, TdsCheckBoxV2View tdsCheckBoxV2View, boolean z) {
        Object[] objArr = {reporttimestamp, unsubscribefromtracingstatechanges, tdsCheckBoxV2View, Boolean.valueOf(z)};
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        return (Unit) onWarmupCompleted(zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), -593703600, zzgsa.onWarmupCompleted(), iOnWarmupCompleted, 593703603, objArr);
    }

    public final void IAuthTabCallback(@Nullable onExtraCallbackWithResult onextracallbackwithresult) {
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
        onWarmupCompleted(zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), -1243348636, iOnWarmupCompleted2, iOnWarmupCompleted, 1243348637, new Object[]{this, onextracallbackwithresult});
    }

    static void onWarmupCompleted() {
        IAuthTabCallbackDefault = new char[]{32617, 32636, 32625, 32632, 32637, 32629, 32618, 32547, 32566, 32580, 32634, 32567, 32630, 32624, 32631, 32638, 32553, 32621, 32560, 32622, 32619, 32616, 32635};
        asInterface = -1184333851;
        asBinder = true;
        IAuthTabCallbackStubProxy = true;
    }
}
