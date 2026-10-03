package o;

import android.content.Context;
import android.content.res.Configuration;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.recyclerview.widget.RecyclerView;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AppMsgReceiver2;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.JsonWriterHelper;
import o.RecomposerawaitIdle2;
import o.access502;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class JsonWriterHelper extends exitAllPages<Object> implements Filterable {
    private final ArrayList<onSwitchToDarkTheme> IAuthTabCallback;
    private final ArrayList<Object> IAuthTabCallbackDefault;
    private final Function0<Unit> asInterface;
    private final onWarmupCompleted onNavigationEvent;

    public static final class onExtraCallbackWithResult implements getAdService {
        final /* synthetic */ Configuration IAuthTabCallback;

        public onExtraCallbackWithResult(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.IAuthTabCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class onNavigationEvent implements getAdService {
        final /* synthetic */ Configuration onExtraCallback;

        public onNavigationEvent(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public JsonWriterHelper(@NotNull final JavaScriptContextHolder javaScriptContextHolder, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(javaScriptContextHolder, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.asInterface = function0;
        this.IAuthTabCallback = new ArrayList<>();
        this.IAuthTabCallbackDefault = new ArrayList<>();
        this.onNavigationEvent = new onWarmupCompleted();
        onExtraCallbackWithResult(new reject(javaScriptContextHolder, javaScriptContextHolder));
        access502.onExtraCallbackWithResult onextracallbackwithresult = new access502.onExtraCallbackWithResult();
        onextracallbackwithresult.onWarmupCompleted(new Function1() { // from class: viva.republica.toss.send.dutch.adapter.TransferDutchInviteAdapter$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return JsonWriterHelper.onWarmupCompleted(this.f$0, (Context) obj);
            }
        });
        if (onextracallbackwithresult.onWarmupCompleted() == null && onextracallbackwithresult.onNavigationEvent() == null) {
            onextracallbackwithresult.onExtraCallback(IAuthTabCallbackDefault.onExtraCallback);
        }
        onExtraCallbackWithResult(onextracallbackwithresult.onExtraCallbackWithResult());
        access502.onExtraCallbackWithResult onextracallbackwithresult2 = new access502.onExtraCallbackWithResult();
        onextracallbackwithresult2.onWarmupCompleted(new Function1() { // from class: viva.republica.toss.send.dutch.adapter.TransferDutchInviteAdapter$$ExternalSyntheticLambda1
            public final Object invoke(Object obj) {
                return JsonWriterHelper.IAuthTabCallback((Context) obj);
            }
        });
        onextracallbackwithresult2.IAuthTabCallback(new Function2() { // from class: viva.republica.toss.send.dutch.adapter.TransferDutchInviteAdapter$$ExternalSyntheticLambda2
            public final Object invoke(Object obj, Object obj2) {
                return JsonWriterHelper.onExtraCallback(javaScriptContextHolder, (AppMsgReceiver2) obj, (JsonWriterHelper.IAuthTabCallback) obj2);
            }
        });
        if (onextracallbackwithresult2.onWarmupCompleted() == null && onextracallbackwithresult2.onNavigationEvent() == null) {
            onextracallbackwithresult2.onExtraCallback(asBinder.onNavigationEvent);
        }
        onExtraCallbackWithResult(onextracallbackwithresult2.onExtraCallbackWithResult());
    }

    public static final class IAuthTabCallbackDefault implements Function1<Object, Boolean> {
        public static final IAuthTabCallbackDefault onExtraCallback = new IAuthTabCallbackDefault();

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return Boolean.valueOf(obj instanceof onExtraCallback);
        }
    }

    public static final class asBinder implements Function1<Object, Boolean> {
        public static final asBinder onNavigationEvent = new asBinder();

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return Boolean.valueOf(obj instanceof IAuthTabCallback);
        }
    }

    public static View onWarmupCompleted(final JsonWriterHelper jsonWriterHelper, Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        TdsListRowV1View tdsListRowV1View = new TdsListRowV1View(context, (AttributeSet) null, 0, false, 14, (DefaultConstructorMarker) null);
        tdsListRowV1View.setLeftType(TdsListRowV1View.asInterface.IMAGE);
        tdsListRowV1View.setLeftImage(R.drawable.ic_icon_plus_circle);
        tdsListRowV1View.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW1B);
        tdsListRowV1View.setCenterText1(context.getString(R.string.app_transfer_dutchpay_add_friend_without_number));
        tdsListRowV1View.setBorder(true);
        tdsListRowV1View.setBorderType(ProtocolCompanion.LEFT24);
        tdsListRowV1View.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.send.dutch.adapter.TransferDutchInviteAdapter$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                JsonWriterHelper.onWarmupCompleted(this.f$0, view);
            }
        });
        return tdsListRowV1View;
    }

    public static void onWarmupCompleted(JsonWriterHelper jsonWriterHelper, View view) {
        jsonWriterHelper.asInterface.invoke();
    }

    public static View IAuthTabCallback(Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        TdsListRowV1View tdsListRowV1View = new TdsListRowV1View(context, (AttributeSet) null, 0, false, 14, (DefaultConstructorMarker) null);
        tdsListRowV1View.setLeftType(TdsListRowV1View.asInterface.IMAGE);
        tdsListRowV1View.setLeftImage(RecomposerrecompositionRunner2.IAuthTabCallback(new RecomposerawaitIdle2.onNavigationEvent(tdsListRowV1View.getContext()).onExtraCallback(Integer.valueOf(im.toss.core.R.drawable.icn_phone_color)), new SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1[]{new PluginInfo(0.0f, 0.0f, 0.0f, (Integer) null, 0, (Integer) null, 63, (DefaultConstructorMarker) null)}));
        tdsListRowV1View.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW2A);
        tdsListRowV1View.setRightType(TdsListRowV1View.asBinder.ROW1A);
        return tdsListRowV1View;
    }

    public static Unit onExtraCallback(final JavaScriptContextHolder javaScriptContextHolder, AppMsgReceiver2 appMsgReceiver2, final IAuthTabCallback iAuthTabCallback) {
        int iOnPostMessage;
        Intrinsics.checkNotNullParameter(appMsgReceiver2, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        TdsListRowV1View tdsListRowV1View = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent;
        Intrinsics.checkNotNull(tdsListRowV1View, "");
        final TdsListRowV1View tdsListRowV1View2 = tdsListRowV1View;
        tdsListRowV1View2.setCenterText1(VideoConfig.onWarmupCompleted(iAuthTabCallback.onNavigationEvent(), (String) null, 1, (Object) null));
        tdsListRowV1View2.setCenterText2((CharSequence) null);
        final boolean z = iAuthTabCallback.onNavigationEvent().length() >= 10;
        if (z) {
            Context context = tdsListRowV1View2.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Configuration configuration = context.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            iOnPostMessage = new getUrlokhttp(new onExtraCallbackWithResult(configuration)).onRelationshipValidationResult();
        } else {
            Context context2 = tdsListRowV1View2.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            Configuration configuration2 = context2.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration2, "");
            iOnPostMessage = new getUrlokhttp(new onNavigationEvent(configuration2)).onPostMessage();
        }
        tdsListRowV1View2.setCenterText1Color(iOnPostMessage);
        tdsListRowV1View2.setRightArrow(z);
        tdsListRowV1View2.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.send.dutch.adapter.TransferDutchInviteAdapter$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                JsonWriterHelper.onNavigationEvent(z, tdsListRowV1View2, javaScriptContextHolder, iAuthTabCallback, view);
            }
        });
        return Unit.INSTANCE;
    }

    public static void onNavigationEvent(boolean z, TdsListRowV1View tdsListRowV1View, JavaScriptContextHolder javaScriptContextHolder, IAuthTabCallback iAuthTabCallback, View view) {
        if (!z) {
            CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(tdsListRowV1View.getContext(), new Function1() { // from class: viva.republica.toss.send.dutch.adapter.TransferDutchInviteAdapter$$ExternalSyntheticLambda4
                public final Object invoke(Object obj) {
                    return JsonWriterHelper.onExtraCallbackWithResult((CommonModule_setLeftEdgeTouchEnabled) obj);
                }
            });
        } else {
            javaScriptContextHolder.IAuthTabCallback(iAuthTabCallback.onNavigationEvent());
        }
    }

    public static Unit onExtraCallbackWithResult(CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(commonModule_setLeftEdgeTouchEnabled.onWarmupCompleted().getString(R.string.app_transfer_dutchpay_invalid_phone_title));
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(commonModule_setLeftEdgeTouchEnabled.onWarmupCompleted().getString(R.string.app_transfer_dutchpay_enter_phone_message));
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, (CommonModule_setLeftEdgeTouchEnabled.onExtraCallback) CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 408502489, new Object[]{commonModule_setLeftEdgeTouchEnabled, null, 1, null}, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -408502489, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult())};
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        return Unit.INSTANCE;
    }

    public final void onExtraCallback(@NotNull List<onSwitchToDarkTheme> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.IAuthTabCallback.clear();
        this.IAuthTabCallback.addAll(list);
    }

    public final void onWarmupCompleted(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        getFilter().filter(charSequence);
    }

    final class onWarmupCompleted extends Filter {
        private static final byte[] $$a = {40, 108, -113, 75};
        private static final int $$b = 247;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int IAuthTabCallback = 1;
        private static char[] onWarmupCompleted = {44307};
        private static long onNavigationEvent = 3148928277284663861L;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(int r6, int r7, short r8) {
            /*
                int r7 = r7 * 4
                int r7 = r7 + 4
                byte[] r0 = o.JsonWriterHelper.onWarmupCompleted.$$a
                int r6 = r6 * 4
                int r6 = 1 - r6
                int r8 = r8 * 4
                int r8 = r8 + 97
                byte[] r1 = new byte[r6]
                r2 = 0
                if (r0 != 0) goto L16
                r3 = r7
                r4 = r2
                goto L26
            L16:
                r3 = r2
            L17:
                int r4 = r3 + 1
                byte r5 = (byte) r8
                r1[r3] = r5
                if (r4 != r6) goto L24
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L24:
                r3 = r0[r7]
            L26:
                int r7 = r7 + 1
                int r3 = -r3
                int r8 = r8 + r3
                r3 = r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: o.JsonWriterHelper.onWarmupCompleted.$$c(int, int, short):java.lang.String");
        }

        public onWarmupCompleted() {
        }

        private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
            int i3 = 2 % 2;
            TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
            long[] jArr = new long[i2];
            timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
            while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
                int i4 = $10 + 19;
                $11 = i4 % 128;
                int i5 = i4 % 2;
                int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(onWarmupCompleted[i + i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - (ViewConfiguration.getTapTimeout() >> 16)), 17 - ExpandableListView.getPackedPositionType(0L), 10973 - TextUtils.indexOf("", ""), 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(onNavigationEvent), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTouchSlop() >> 8) + 46134), (ViewConfiguration.getEdgeSlop() >> 16) + 31, (ViewConfiguration.getScrollBarSize() >> 8) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback3 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "") + 49123), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 44, (ViewConfiguration.getJumpTapTimeout() >> 16) + 1494, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr = new char[i2];
            timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
            while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
                int i7 = $11 + 13;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                    Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback4 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), KeyEvent.keyCodeFromString("") + 44, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1494, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    int i8 = 54 / 0;
                } else {
                    cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                    Object[] objArr6 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback5 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 49124), TextUtils.getOffsetBefore("", 0) + 44, (ViewConfiguration.getJumpTapTimeout() >> 16) + 1494, -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback5).invoke(null, objArr6);
                }
            }
            objArr[0] = new String(cArr);
        }

        @Override // android.widget.Filter
        protected Filter.FilterResults performFiltering(@NotNull CharSequence charSequence) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(charSequence, "");
            ArrayList arrayList = new ArrayList();
            Filter.FilterResults filterResults = new Filter.FilterResults();
            filterResults.values = arrayList;
            if (TextUtils.isEmpty(charSequence)) {
                int i2 = onExtraCallbackWithResult + 41;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    arrayList.addAll(JsonWriterHelper.this.IAuthTabCallback);
                    int i3 = 69 / 0;
                } else {
                    arrayList.addAll(JsonWriterHelper.this.IAuthTabCallback);
                }
            } else {
                ArrayList arrayList2 = JsonWriterHelper.this.IAuthTabCallback;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : arrayList2) {
                    if (!(!onExtraCallbackWithResult((onSwitchToDarkTheme) obj, charSequence))) {
                        int i4 = IAuthTabCallback + 13;
                        onExtraCallbackWithResult = i4 % 128;
                        if (i4 % 2 != 0) {
                            arrayList3.add(obj);
                            throw null;
                        }
                        arrayList3.add(obj);
                    }
                }
                arrayList.addAll(arrayList3);
            }
            filterResults.count = arrayList.size();
            return filterResults;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
        @Override // android.widget.Filter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        protected void publishResults(@org.jetbrains.annotations.Nullable java.lang.CharSequence r9, @org.jetbrains.annotations.Nullable android.widget.Filter.FilterResults r10) throws java.lang.Throwable {
            /*
                r8 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = o.JsonWriterHelper.onWarmupCompleted.IAuthTabCallback
                int r1 = r1 + 15
                int r2 = r1 % 128
                o.JsonWriterHelper.onWarmupCompleted.onExtraCallbackWithResult = r2
                int r1 = r1 % r0
                r1 = 0
                if (r10 == 0) goto L12
                java.lang.Object r2 = r10.values
                goto L13
            L12:
                r2 = r1
            L13:
                if (r2 == 0) goto Le2
                java.lang.Object r10 = r10.values
                java.lang.String r2 = ""
                kotlin.jvm.internal.Intrinsics.checkNotNull(r10, r2)
                java.util.ArrayList r10 = (java.util.ArrayList) r10
                o.JsonWriterHelper r3 = o.JsonWriterHelper.this
                java.util.ArrayList r3 = o.JsonWriterHelper.onExtraCallback(r3)
                r3.clear()
                o.JsonWriterHelper r3 = o.JsonWriterHelper.this
                java.util.ArrayList r3 = o.JsonWriterHelper.onExtraCallback(r3)
                o.JsonWriterHelper$onExtraCallback r4 = new o.JsonWriterHelper$onExtraCallback
                o.JsonWriterHelper r5 = o.JsonWriterHelper.this
                r4.<init>()
                r3.add(r4)
                if (r9 == 0) goto Lc5
                int r3 = r9.length()
                if (r3 == 0) goto Lc5
                o.JsonWriterHelper r3 = o.JsonWriterHelper.this
                java.util.ArrayList r3 = o.JsonWriterHelper.onExtraCallback(r3)
                r3.addAll(r10)
                o.JsonWriterHelper r10 = o.JsonWriterHelper.this
                java.util.ArrayList r10 = o.JsonWriterHelper.onExtraCallback(r10)
                boolean r10 = r10.isEmpty()
                if (r10 == 0) goto Ld4
                int r10 = o.JsonWriterHelper.onWarmupCompleted.onExtraCallbackWithResult
                int r10 = r10 + 57
                int r3 = r10 % 128
                o.JsonWriterHelper.onWarmupCompleted.IAuthTabCallback = r3
                int r10 = r10 % r0
                r3 = 1
                r4 = 0
                if (r10 != 0) goto L6b
                boolean r10 = android.text.TextUtils.isDigitsOnly(r9)
                r5 = 24
                int r5 = r5 / r4
                if (r10 == 0) goto Ld4
                goto L72
            L6b:
                boolean r10 = android.text.TextUtils.isDigitsOnly(r9)
                r10 = r10 ^ r3
                if (r10 == r3) goto Ld4
            L72:
                r10 = 16777216(0x1000000, float:2.3509887E-38)
                int r5 = android.graphics.Color.rgb(r4, r4, r4)
                int r5 = r5 + r10
                r6 = 0
                int r10 = android.widget.ExpandableListView.getPackedPositionType(r6)
                int r10 = r10 + r3
                int r2 = android.view.MotionEvent.axisFromString(r2)
                int r2 = 16630 - r2
                char r2 = (char) r2
                java.lang.Object[] r3 = new java.lang.Object[r3]
                a(r5, r10, r2, r3)
                r10 = r3[r4]
                java.lang.String r10 = (java.lang.String) r10
                java.lang.String r10 = r10.intern()
                boolean r10 = kotlin.text.StringsKt.startsWith$default(r9, r10, r4, r0, r1)
                if (r10 != 0) goto Lb4
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r1 = "010"
                r10.append(r1)
                r10.append(r9)
                java.lang.String r9 = r10.toString()
                int r10 = o.JsonWriterHelper.onWarmupCompleted.onExtraCallbackWithResult
                int r10 = r10 + 11
                int r1 = r10 % 128
                o.JsonWriterHelper.onWarmupCompleted.IAuthTabCallback = r1
                int r10 = r10 % r0
            Lb4:
                o.JsonWriterHelper r10 = o.JsonWriterHelper.this
                java.util.ArrayList r10 = o.JsonWriterHelper.onExtraCallback(r10)
                o.JsonWriterHelper$IAuthTabCallback r0 = new o.JsonWriterHelper$IAuthTabCallback
                o.JsonWriterHelper r1 = o.JsonWriterHelper.this
                r0.<init>(r1, r9)
                r10.add(r0)
                goto Ld4
            Lc5:
                o.JsonWriterHelper r9 = o.JsonWriterHelper.this
                java.util.ArrayList r9 = o.JsonWriterHelper.onExtraCallback(r9)
                o.JsonWriterHelper r10 = o.JsonWriterHelper.this
                java.util.ArrayList r10 = o.JsonWriterHelper.IAuthTabCallback(r10)
                r9.addAll(r10)
            Ld4:
                o.JsonWriterHelper r9 = o.JsonWriterHelper.this
                java.util.ArrayList r10 = o.JsonWriterHelper.onExtraCallback(r9)
                r9.onNavigationEvent(r10)
                o.JsonWriterHelper r9 = o.JsonWriterHelper.this
                r9.notifyDataSetChanged()
            Le2:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.JsonWriterHelper.onWarmupCompleted.publishResults(java.lang.CharSequence, android.widget.Filter$FilterResults):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x004b A[RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final boolean onExtraCallbackWithResult(o.onSwitchToDarkTheme r7, java.lang.CharSequence r8) {
            /*
                r6 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = o.JsonWriterHelper.onWarmupCompleted.IAuthTabCallback
                int r1 = r1 + 113
                int r2 = r1 % 128
                o.JsonWriterHelper.onWarmupCompleted.onExtraCallbackWithResult = r2
                int r1 = r1 % r0
                r2 = 0
                if (r1 != 0) goto L4d
                o.getSignForPKCS7V3NoContents r1 = o.getSignForPKCS7V3NoContents.IAuthTabCallback
                java.lang.String r3 = r7.onExtraCallback()
                java.lang.String r4 = r8.toString()
                boolean r1 = r1.onNavigationEvent(r3, r4)
                java.lang.String r8 = o.mergeParams.onNavigationEvent(r8)
                int r3 = r8.length()
                r4 = 1
                r5 = 0
                if (r3 <= 0) goto L35
                java.lang.String r7 = r7.IAuthTabCallbackStub()
                boolean r7 = kotlin.text.StringsKt.contains$default(r7, r8, r5, r0, r2)
                if (r7 == 0) goto L35
                r7 = r4
                goto L36
            L35:
                r7 = r5
            L36:
                if (r1 != 0) goto L4c
                int r8 = o.JsonWriterHelper.onWarmupCompleted.onExtraCallbackWithResult
                int r8 = r8 + 87
                int r1 = r8 % 128
                o.JsonWriterHelper.onWarmupCompleted.IAuthTabCallback = r1
                int r8 = r8 % r0
                if (r8 != 0) goto L49
                r8 = 99
                int r8 = r8 / r5
                if (r7 != 0) goto L4c
                goto L4b
            L49:
                if (r7 != 0) goto L4c
            L4b:
                return r5
            L4c:
                return r4
            L4d:
                o.getSignForPKCS7V3NoContents r0 = o.getSignForPKCS7V3NoContents.IAuthTabCallback
                java.lang.String r7 = r7.onExtraCallback()
                java.lang.String r1 = r8.toString()
                r0.onNavigationEvent(r7, r1)
                java.lang.String r7 = o.mergeParams.onNavigationEvent(r8)
                r7.length()
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: o.JsonWriterHelper.onWarmupCompleted.onExtraCallbackWithResult(o.onSwitchToDarkTheme, java.lang.CharSequence):boolean");
        }
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        return this.onNavigationEvent;
    }

    public final class IAuthTabCallback {
        final /* synthetic */ JsonWriterHelper onExtraCallbackWithResult;
        private final CharSequence onWarmupCompleted;

        public IAuthTabCallback(@NotNull JsonWriterHelper jsonWriterHelper, CharSequence charSequence) {
            Intrinsics.checkNotNullParameter(charSequence, "");
            this.onExtraCallbackWithResult = jsonWriterHelper;
            this.onWarmupCompleted = charSequence;
        }

        public final CharSequence onNavigationEvent() {
            return this.onWarmupCompleted;
        }
    }

    final class onExtraCallback {
        public onExtraCallback() {
        }
    }
}
