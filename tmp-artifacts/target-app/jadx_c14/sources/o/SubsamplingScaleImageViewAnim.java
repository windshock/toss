package o;

import android.content.Context;
import java.util.Calendar;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AppMsgReceiver2;
import o.NativeRedBoxSpec;
import o.SubsamplingScaleImageViewAnim;
import o.access502;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class SubsamplingScaleImageViewAnim {
    private final exitAllPages<NativeKeyboardObserverSpec> IAuthTabCallback;
    private Function1<? super NativeRedBoxSpec, Boolean> IAuthTabCallbackStub;
    private final boolean asBinder;
    private final Function2<AppMsgReceiver2<NativeRedBoxSpec>, NativeRedBoxSpec, Unit> asInterface;
    private final Function1<Object, Boolean> onTransact;
    public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
    public static final int onExtraCallbackWithResult = 8;
    private static final int onNavigationEvent = R.layout.row_consumption_transaction_section;
    private static final Calendar onWarmupCompleted = Calendar.getInstance();
    private static final Map<Pair<Locale, String>, IdGeneratorExternalSyntheticLambda1> onExtraCallback = new ConcurrentHashMap();

    public static final class onExtraCallback implements Function1<Object, Boolean> {
        public static final onExtraCallback onExtraCallback = new onExtraCallback();

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return Boolean.valueOf(obj instanceof NativeRedBoxSpec);
        }
    }

    public SubsamplingScaleImageViewAnim(@NotNull exitAllPages<NativeKeyboardObserverSpec> exitallpages, boolean z) {
        Intrinsics.checkNotNullParameter(exitallpages, "");
        this.IAuthTabCallback = exitallpages;
        this.asBinder = z;
        this.onTransact = new Function1() { // from class: viva.republica.toss.home.consumption.transaction.delegate.DailyTransactionDelegate$$ExternalSyntheticLambda2
            public final Object invoke(Object obj) {
                return Boolean.valueOf(SubsamplingScaleImageViewAnim.onNavigationEvent(this.f$0, obj));
            }
        };
        this.asInterface = new Function2() { // from class: viva.republica.toss.home.consumption.transaction.delegate.DailyTransactionDelegate$$ExternalSyntheticLambda3
            public final Object invoke(Object obj, Object obj2) {
                return SubsamplingScaleImageViewAnim.onNavigationEvent(this.f$0, (AppMsgReceiver2) obj, (NativeRedBoxSpec) obj2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onNavigationEvent(SubsamplingScaleImageViewAnim subsamplingScaleImageViewAnim, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        if (!(obj instanceof NativeRedBoxSpec)) {
            return false;
        }
        Function1<? super NativeRedBoxSpec, Boolean> function1 = subsamplingScaleImageViewAnim.IAuthTabCallbackStub;
        return function1 == null || ((Boolean) function1.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit onNavigationEvent(o.SubsamplingScaleImageViewAnim r7, o.AppMsgReceiver2 r8, o.NativeRedBoxSpec r9) {
        /*
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            android.view.View r1 = r8.onNavigationEvent
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r0)
            im.toss.tds.view.component.atom.text.BaseTextView r1 = (im.toss.tds.view.component.atom.text.BaseTextView) r1
            java.lang.String r2 = r9.onNavigationEvent()
            int r2 = r2.length()
            r3 = 0
            if (r2 <= 0) goto Lcc
            java.util.Calendar r2 = o.SubsamplingScaleImageViewAnim.onWarmupCompleted
            o.CommonModule_closeView r4 = o.CommonModule_closeView.onWarmupCompleted
            o.IdGeneratorExternalSyntheticLambda1 r4 = r4.access000()
            java.lang.String r5 = r9.onNavigationEvent()
            java.util.Date r4 = r4.parse(r5)
            r2.setTime(r4)
            boolean r4 = r7.asBinder
            if (r4 == 0) goto L60
            o.commonTestFlag r4 = o.commonTestFlag.onExtraCallback
            java.util.Date r5 = r2.getTime()
            o.zzag r6 = o.zzaj.onWarmupCompleted()
            java.util.Date r6 = r6.asBinder()
            boolean r5 = r4.IAuthTabCallback(r5, r6)
            if (r5 != 0) goto L60
            java.util.Date r5 = r2.getTime()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            o.zzag r6 = o.zzaj.onWarmupCompleted()
            java.util.Date r6 = r6.asBinder()
            boolean r4 = r4.onNavigationEvent(r5, r6)
            if (r4 == 0) goto L5d
            int r4 = viva.republica.toss.R.string.home_consumption_date_format_month_day_weekday
            goto L62
        L5d:
            int r4 = viva.republica.toss.R.string.home_consumption_date_format_year_month_day_weekday
            goto L62
        L60:
            int r4 = viva.republica.toss.R.string.home_consumption_date_format_day_weekday
        L62:
            android.content.Context r5 = r1.getContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            o.IdGeneratorExternalSyntheticLambda1 r4 = r7.onNavigationEvent(r5, r4)
            java.util.Date r2 = r2.getTime()
            java.lang.String r2 = r4.format(r2)
            boolean r9 = r9.IAuthTabCallbackStubProxy()
            if (r9 == 0) goto Lb3
            o.charset r9 = o.charset.onExtraCallbackWithResult
            o.CipherSuiteCompanion r9 = r9.ITrustedWebActivityCallbackStubProxy()
            int r9 = r9.IAuthTabCallback()
            java.lang.String r0 = "#"
            java.lang.String r9 = o.setWriteAbortCountokhttp.IAuthTabCallback(r9, r0, r3)
            android.content.Context r0 = r1.getContext()
            int r4 = viva.republica.toss.R.string.home_consumption_overspending
            java.lang.String r0 = r0.getString(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = " <font color='"
            r4.append(r5)
            r4.append(r9)
            java.lang.String r9 = "'>"
            r4.append(r9)
            r4.append(r0)
            java.lang.String r9 = "</font>"
            r4.append(r9)
            java.lang.String r0 = r4.toString()
        Lb3:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r2)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            java.lang.Object[] r0 = new java.lang.Object[r3]
            android.text.Spanned r9 = o.GraniteModule_onEventListenerRemoved.onExtraCallback(r9, r0)
            r1.setText(r9)
            goto Ld9
        Lcc:
            java.lang.String r9 = r9.onTransact()
            java.lang.Object[] r0 = new java.lang.Object[r3]
            android.text.Spanned r9 = o.GraniteModule_onEventListenerRemoved.onExtraCallback(r9, r0)
            r1.setText(r9)
        Ld9:
            o.exitAllPages<o.NativeKeyboardObserverSpec> r7 = r7.IAuthTabCallback
            java.util.List r7 = r7.onExtraCallbackWithResult()
            int r8 = r8.getAdapterPosition()
            int r8 = r8 + (-1)
            java.lang.Object r7 = kotlin.collections.CollectionsKt.getOrNull(r7, r8)
            boolean r7 = r7 instanceof o.access3102.onExtraCallbackWithResult
            if (r7 == 0) goto L107
            r7 = 12
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            int r7 = o.varyMatches.IAuthTabCallback(r1, r7)
            int r8 = r1.getPaddingLeft()
            int r9 = r1.getPaddingRight()
            int r0 = r1.getPaddingBottom()
            r1.setPadding(r8, r7, r9, r0)
            goto L120
        L107:
            r7 = 20
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            int r7 = o.varyMatches.IAuthTabCallback(r1, r7)
            int r8 = r1.getPaddingLeft()
            int r9 = r1.getPaddingRight()
            int r0 = r1.getPaddingBottom()
            r1.setPadding(r8, r7, r9, r0)
        L120:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.SubsamplingScaleImageViewAnim.onNavigationEvent(o.SubsamplingScaleImageViewAnim, o.AppMsgReceiver2, o.NativeRedBoxSpec):kotlin.Unit");
    }

    private final IdGeneratorExternalSyntheticLambda1 onNavigationEvent(Context context, int i) {
        Locale locale = Locale.getDefault();
        final String string = context.getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "");
        Pair<Locale, String> pairIAuthTabCallback = getWrite.IAuthTabCallback(locale, string);
        Map<Pair<Locale, String>, IdGeneratorExternalSyntheticLambda1> map = onExtraCallback;
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.home.consumption.transaction.delegate.DailyTransactionDelegate$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return SubsamplingScaleImageViewAnim.onNavigationEvent(string, (Pair) obj);
            }
        };
        IdGeneratorExternalSyntheticLambda1 idGeneratorExternalSyntheticLambda1ComputeIfAbsent = map.computeIfAbsent(pairIAuthTabCallback, new Function() { // from class: viva.republica.toss.home.consumption.transaction.delegate.DailyTransactionDelegate$$ExternalSyntheticLambda1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return SubsamplingScaleImageViewAnim.onExtraCallback(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(idGeneratorExternalSyntheticLambda1ComputeIfAbsent, "");
        return idGeneratorExternalSyntheticLambda1ComputeIfAbsent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IdGeneratorExternalSyntheticLambda1 onExtraCallback(Function1 function1, Object obj) {
        return (IdGeneratorExternalSyntheticLambda1) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IdGeneratorExternalSyntheticLambda1 onNavigationEvent(String str, Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        return IdGeneratorExternalSyntheticLambda1.Companion.onExtraCallback(str);
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }

    public final access502<NativeRedBoxSpec, NativeKeyboardObserverSpec> onExtraCallbackWithResult() {
        return new access502.onNavigationEvent().onExtraCallbackWithResult(onExtraCallback.onExtraCallback).onExtraCallbackWithResult(this.onTransact).onNavigationEvent(onNavigationEvent).onExtraCallback(this.asInterface).IAuthTabCallback();
    }
}
