package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import im.toss.features.home.legacy.view.consumption.analysis.list.delegate.SectionHeaderDelegate$;
import im.toss.tds.view.component.atom.text.BaseTextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.access502;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.R;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class hasPermissionModel {
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 1;
    private static int asInterface = 1;
    private static int onWarmupCompleted;
    private final Function2<AppMsgReceiver2<onExtraCallback>, onExtraCallback, Unit> IAuthTabCallback;
    private final onExtraCallbackWithResult onExtraCallbackWithResult;
    private final exitAllPages<NativeKeyboardObserverSpec> onNavigationEvent;
    public static final onWarmupCompleted Companion = new onWarmupCompleted((DefaultConstructorMarker) null);
    private static final int onExtraCallback = R.layout.row_consumption_section_header;

    public static /* synthetic */ Unit onNavigationEvent(hasPermissionModel haspermissionmodel, AppMsgReceiver2 appMsgReceiver2, onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = asBinder + 33;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(haspermissionmodel, appMsgReceiver2, onextracallback);
        if (i3 != 0) {
            int i4 = 10 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static final class onNavigationEvent implements Function1<Object, Boolean> {
        private static int IAuthTabCallback = 0;
        public static final onNavigationEvent onExtraCallback = new onNavigationEvent();
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        static {
            int i = onNavigationEvent + 73;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 99;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Boolean boolOnExtraCallback = onExtraCallback(obj);
            int i4 = onWarmupCompleted + 53;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return boolOnExtraCallback;
        }

        public final Boolean onExtraCallback(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 5;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(obj, "");
            Boolean boolValueOf = Boolean.valueOf(obj instanceof onExtraCallback);
            int i4 = IAuthTabCallback + 77;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return boolValueOf;
        }
    }

    public hasPermissionModel(@NotNull exitAllPages<NativeKeyboardObserverSpec> exitallpages, @NotNull onExtraCallbackWithResult onextracallbackwithresult) {
        Intrinsics.checkNotNullParameter(exitallpages, "");
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        this.onNavigationEvent = exitallpages;
        this.onExtraCallbackWithResult = onextracallbackwithresult;
        this.IAuthTabCallback = new SectionHeaderDelegate$.ExternalSyntheticLambda0(this);
    }

    private static final Unit onWarmupCompleted(hasPermissionModel haspermissionmodel, AppMsgReceiver2 appMsgReceiver2, onExtraCallback onextracallback) {
        int i = 2 % 2;
        String str = "";
        Intrinsics.checkNotNullParameter(appMsgReceiver2, "");
        Intrinsics.checkNotNullParameter(onextracallback, "");
        View view = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent;
        int i2 = R.id.homeConsumptionSectionHeaderBorder;
        View viewFindViewById = (View) appMsgReceiver2.onWarmupCompleted().get(i2);
        if (viewFindViewById == null) {
            viewFindViewById = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent.findViewById(i2);
            if (viewFindViewById != null) {
                appMsgReceiver2.onWarmupCompleted().put(i2, viewFindViewById);
            } else {
                appMsgReceiver2.onWarmupCompleted().remove(i2);
            }
        }
        if (viewFindViewById != null) {
            int i3 = R.id.homeConsumptionSectionHeaderTitle;
            BaseTextView baseTextViewFindViewById = (BaseTextView) appMsgReceiver2.onWarmupCompleted().get(i3);
            if (baseTextViewFindViewById == null) {
                int i4 = asBinder + 21;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                baseTextViewFindViewById = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent.findViewById(i3);
                if (baseTextViewFindViewById != null) {
                    appMsgReceiver2.onWarmupCompleted().put(i3, baseTextViewFindViewById);
                } else {
                    appMsgReceiver2.onWarmupCompleted().remove(i3);
                }
            }
            if (baseTextViewFindViewById != null) {
                int i6 = R.id.homeConsumptionSectionHeaderValue;
                BaseTextView baseTextViewFindViewById2 = (BaseTextView) appMsgReceiver2.onWarmupCompleted().get(i6);
                if (baseTextViewFindViewById2 == null) {
                    baseTextViewFindViewById2 = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent.findViewById(i6);
                    if (baseTextViewFindViewById2 != null) {
                        int i7 = asBinder + 123;
                        onWarmupCompleted = i7 % 128;
                        int i8 = i7 % 2;
                        appMsgReceiver2.onWarmupCompleted().put(i6, baseTextViewFindViewById2);
                    } else {
                        appMsgReceiver2.onWarmupCompleted().remove(i6);
                    }
                }
                if (baseTextViewFindViewById2 != null) {
                    int i9 = asBinder + 103;
                    onWarmupCompleted = i9 % 128;
                    if (i9 % 2 != 0) {
                        onExtraCallbackWithResult onextracallbackwithresult = haspermissionmodel.onExtraCallbackWithResult;
                        onextracallback.onExtraCallback();
                        onextracallback.onExtraCallback().onExtraCallback();
                        str.hashCode();
                        throw null;
                    }
                    onExtraCallbackWithResult onextracallbackwithresult2 = haspermissionmodel.onExtraCallbackWithResult;
                    removePlugin removepluginOnExtraCallback = onextracallback.onExtraCallback();
                    accessgetVALUEScp accessgetvaluescpOnExtraCallback = onextracallback.onExtraCallback().onExtraCallback();
                    if (accessgetvaluescpOnExtraCallback != null) {
                        int i10 = asBinder + 89;
                        onWarmupCompleted = i10 % 128;
                        int i11 = i10 % 2;
                        String strOnWarmupCompleted = accessgetvaluescpOnExtraCallback.onWarmupCompleted();
                        if (strOnWarmupCompleted != null) {
                            str = strOnWarmupCompleted;
                        }
                    }
                    onextracallbackwithresult2.onNavigationEvent(removepluginOnExtraCallback, str);
                    if (onextracallback.onExtraCallbackWithResult()) {
                        int i12 = onWarmupCompleted + 43;
                        asBinder = i12 % 128;
                        int i13 = i12 % 2;
                        viewFindViewById.setVisibility(0);
                    } else {
                        viewFindViewById.setVisibility(8);
                    }
                    accessgetVALUEScp accessgetvaluescpOnExtraCallback2 = onextracallback.onExtraCallback().onExtraCallback();
                    baseTextViewFindViewById.setText(accessgetvaluescpOnExtraCallback2 != null ? accessgetvaluescpOnExtraCallback2.onWarmupCompleted() : null);
                    accessgetVALUEScp accessgetvaluescpOnExtraCallback3 = onextracallback.onExtraCallback().onExtraCallback();
                    baseTextViewFindViewById2.setText(accessgetvaluescpOnExtraCallback3 != null ? accessgetvaluescpOnExtraCallback3.onNavigationEvent() : null);
                    if (baseTextViewFindViewById2.length() == 0) {
                        int i14 = asBinder + 61;
                        onWarmupCompleted = i14 % 128;
                        int i15 = i14 % 2;
                        baseTextViewFindViewById2.setVisibility(8);
                    } else {
                        baseTextViewFindViewById2.setVisibility(0);
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }

    public final access502<onExtraCallback, NativeKeyboardObserverSpec> onNavigationEvent() {
        int i = 2 % 2;
        access502<onExtraCallback, NativeKeyboardObserverSpec> access502VarIAuthTabCallback = new access502.onNavigationEvent().onExtraCallbackWithResult(onNavigationEvent.onExtraCallback).onNavigationEvent(onExtraCallback).onExtraCallback(this.IAuthTabCallback).IAuthTabCallback();
        int i2 = onWarmupCompleted + 55;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return access502VarIAuthTabCallback;
        }
        throw null;
    }

    static {
        int i = asInterface + 49;
        IAuthTabCallbackStub = i % 128;
        int i2 = i % 2;
    }
}
