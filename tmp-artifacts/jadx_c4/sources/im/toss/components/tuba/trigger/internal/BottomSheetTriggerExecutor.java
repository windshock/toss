package im.toss.components.tuba.trigger.internal;

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.ExpandableListView;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.components.tuba.trigger.R;
import im.toss.components.tuba.trigger.internal.BottomSheetTriggerExecutor;
import im.toss.components.tuba.trigger.internal.BottomSheetTriggerExecutor$TubaBottomSheetDialog$;
import im.toss.core.tracker.entry.TrackEvent;
import im.toss.core.tuba.Trigger;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CarouselKtCarousel4ExternalSyntheticLambda0;
import o.ConvertByteArrayToFloatArray;
import o.OkHttpNetworkFetcherExternalSyntheticLambda3;
import o.RecomposerawaitIdle2;
import o.Recomposerjoin2;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.UtilsKtExternalSyntheticLambda9;
import o.access8100;
import o.getWrite;
import o.getWriteEnabled;
import o.mergeParams;
import o.r8lambdaaf6h4gyIT_zMU5_zL59OQo83yI;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.main.more.notification.NotificationSettingAdapter$;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class BottomSheetTriggerExecutor extends getWriteEnabled {
    public static final onNavigationEvent Companion;
    private static int IAuthTabCallbackDefault;
    private static char onExtraCallback;
    private static int onNavigationEvent;
    private static long onWarmupCompleted;
    private final UtilsKtExternalSyntheticLambda9 IAuthTabCallback;
    private static final byte[] $$a = {46, -35, 45, 111};
    private static final int $$b = 229;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onTransact = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int asInterface = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, byte b, short s) {
        int i2;
        int i3;
        int i4 = 4 - (b * 3);
        int i5 = s + 109;
        byte[] bArr = $$a;
        int i6 = (i * 4) + 1;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i7 = i5;
            int i8 = 0;
            int i9 = i4;
            int i10 = i9 + 1;
            int i11 = (-i4) + i7;
            i2 = i8;
            i5 = i11;
            i4 = i10;
            bArr2[i2] = (byte) i5;
            i3 = i2 + 1;
            if (i3 == i6) {
                return new String(bArr2, 0);
            }
            int i12 = i5;
            i9 = i4;
            i4 = bArr[i4];
            i8 = i3;
            i7 = i12;
            int i102 = i9 + 1;
            int i112 = (-i4) + i7;
            i2 = i8;
            i5 = i112;
            i4 = i102;
            bArr2[i2] = (byte) i5;
            i3 = i2 + 1;
            if (i3 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i5;
            i3 = i2 + 1;
            if (i3 == i6) {
            }
        }
    }

    static {
        IAuthTabCallbackDefault = 0;
        onExtraCallback();
        Companion = new onNavigationEvent(null);
        int i = asInterface + 113;
        IAuthTabCallbackDefault = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetTriggerExecutor(@NotNull OkHttpNetworkFetcherExternalSyntheticLambda3 okHttpNetworkFetcherExternalSyntheticLambda3, @NotNull UtilsKtExternalSyntheticLambda9 utilsKtExternalSyntheticLambda9) {
        super(okHttpNetworkFetcherExternalSyntheticLambda3, "BOTTOMSHEET", 100L);
        Intrinsics.checkNotNullParameter(okHttpNetworkFetcherExternalSyntheticLambda3, "");
        Intrinsics.checkNotNullParameter(utilsKtExternalSyntheticLambda9, "");
        this.IAuthTabCallback = utilsKtExternalSyntheticLambda9;
    }

    @Override // o.getWriteEnabled
    public void onWarmupCompleted(@NotNull Activity activity, @NotNull Trigger trigger, @NotNull String str) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 97;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(trigger, "");
        Intrinsics.checkNotNullParameter(str, "");
        onExtraCallback(activity, trigger, str);
        int i4 = onTransact + 13;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class TubaBottomSheetDialog extends r8lambdaaf6h4gyIT_zMU5_zL59OQo83yI {
        private static int onActivityResized = 0;
        private static int onPostMessage = 1;
        private final String IAuthTabCallback;
        private final Lazy IAuthTabCallbackDefault;
        private final Lazy IAuthTabCallbackStubProxy;
        private final Integer IAuthTabCallback_Parcel;
        private final Function0<Unit> ICustomTabsCallback;
        private final String access000;
        private final String access100;
        private final Lazy asBinder;
        private final Lazy asInterface;
        private final Function0<Unit> extraCallback;
        private final String extraCallbackWithResult;
        private final Map<String, Object> getInterfaceDescriptor;
        private final String onExtraCallback;
        private final Activity onExtraCallbackWithResult;
        private final String onNavigationEvent;
        private final String onTransact;
        private final UtilsKtExternalSyntheticLambda9 readTypedObject;
        private final String writeTypedObject;

        public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
            int i7 = ~i5;
            int i8 = ~i6;
            int i9 = ~i3;
            int i10 = (~(i8 | i9)) | i7;
            int i11 = ~(i8 | i5 | i3);
            int i12 = (~(i3 | i5)) | (~(i7 | i9)) | i8;
            int i13 = i5 + i6 + i + ((-1422066268) * i2) + ((-2108786386) * i4);
            int i14 = i13 * i13;
            int i15 = ((-1583913924) * i5) + 967573504 + (322476998 * i6) + (i10 * 1194288187) + (1194288187 * i11) + ((-1194288187) * i12) + (1516765184 * i) + ((-1298137088) * i2) + (1722810368 * i4) + (518782976 * i14);
            int i16 = (i5 * 793895740) + 1353643607 + (i6 * 793896262) + (i10 * (-261)) + (i11 * (-261)) + (i12 * 261) + (i * 793896001) + (i2 * 692483748) + (i4 * (-1016611666)) + (i14 * 166461440);
            int i17 = i15 + (i16 * i16 * 1997799424);
            return i17 != 1 ? i17 != 2 ? i17 != 3 ? onNavigationEvent(objArr) : IAuthTabCallback(objArr) : onExtraCallback(objArr) : onExtraCallbackWithResult(objArr);
        }

        public static /* synthetic */ TdsBottomCtaV1View onExtraCallback(TubaBottomSheetDialog tubaBottomSheetDialog) {
            int i = 2 % 2;
            int i2 = onPostMessage + 113;
            onActivityResized = i2 % 128;
            int i3 = i2 % 2;
            int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
            TdsBottomCtaV1View tdsBottomCtaV1View = (TdsBottomCtaV1View) IAuthTabCallback(NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), iOnWarmupCompleted, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), 1320031008, -1320031005, new Object[]{tubaBottomSheetDialog});
            int i4 = onPostMessage + 31;
            onActivityResized = i4 % 128;
            int i5 = i4 % 2;
            return tdsBottomCtaV1View;
        }

        public static /* synthetic */ void onExtraCallback(TubaBottomSheetDialog tubaBottomSheetDialog, View view) throws Throwable {
            int i = 2 % 2;
            int i2 = onPostMessage + 65;
            onActivityResized = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback(tubaBottomSheetDialog, view);
            int i4 = onPostMessage + 5;
            onActivityResized = i4 % 128;
            int i5 = i4 % 2;
        }

        public static /* synthetic */ BaseTextView onExtraCallbackWithResult(TubaBottomSheetDialog tubaBottomSheetDialog) {
            int i = 2 % 2;
            int i2 = onActivityResized + 91;
            onPostMessage = i2 % 128;
            int i3 = i2 % 2;
            BaseTextView baseTextViewAsBinder = asBinder(tubaBottomSheetDialog);
            int i4 = onActivityResized + 125;
            onPostMessage = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 23 / 0;
            }
            return baseTextViewAsBinder;
        }

        public static /* synthetic */ Unit onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onPostMessage + 9;
            onActivityResized = i2 % 128;
            int i3 = i2 % 2;
            Unit typedObject = readTypedObject();
            if (i3 != 0) {
                int i4 = 97 / 0;
            }
            return typedObject;
        }

        public static /* synthetic */ void onExtraCallbackWithResult(TubaBottomSheetDialog tubaBottomSheetDialog, DialogInterface dialogInterface) {
            int i = 2 % 2;
            int i2 = onPostMessage + 19;
            onActivityResized = i2 % 128;
            int i3 = i2 % 2;
            int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
            IAuthTabCallback(NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), iOnWarmupCompleted, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), -1104140451, 1104140452, new Object[]{tubaBottomSheetDialog, dialogInterface});
            int i4 = onActivityResized + 23;
            onPostMessage = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ BaseTextView onNavigationEvent(TubaBottomSheetDialog tubaBottomSheetDialog) {
            int i = 2 % 2;
            int i2 = onPostMessage + 75;
            onActivityResized = i2 % 128;
            if (i2 % 2 != 0) {
                asInterface(tubaBottomSheetDialog);
                throw null;
            }
            BaseTextView baseTextViewAsInterface = asInterface(tubaBottomSheetDialog);
            int i3 = onActivityResized + 37;
            onPostMessage = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 79 / 0;
            }
            return baseTextViewAsInterface;
        }

        public static /* synthetic */ void onNavigationEvent(TubaBottomSheetDialog tubaBottomSheetDialog, DialogInterface dialogInterface) {
            int i = 2 % 2;
            int i2 = onActivityResized + 87;
            onPostMessage = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback(tubaBottomSheetDialog, dialogInterface);
            int i4 = onPostMessage + 79;
            onActivityResized = i4 % 128;
            int i5 = i4 % 2;
        }

        public static /* synthetic */ void onNavigationEvent(TubaBottomSheetDialog tubaBottomSheetDialog, View view) throws Throwable {
            int i = 2 % 2;
            int i2 = onActivityResized + 97;
            onPostMessage = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult(tubaBottomSheetDialog, view);
            int i4 = onActivityResized + 5;
            onPostMessage = i4 % 128;
            int i5 = i4 % 2;
        }

        public static /* synthetic */ TdsImageView onWarmupCompleted(TubaBottomSheetDialog tubaBottomSheetDialog) {
            int i = 2 % 2;
            int i2 = onActivityResized + 57;
            onPostMessage = i2 % 128;
            int i3 = i2 % 2;
            int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
            TdsImageView tdsImageView = (TdsImageView) IAuthTabCallback(NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), iOnWarmupCompleted, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), 1577820330, -1577820330, new Object[]{tubaBottomSheetDialog});
            int i4 = onActivityResized + 29;
            onPostMessage = i4 % 128;
            int i5 = i4 % 2;
            return tdsImageView;
        }

        public static /* synthetic */ Unit onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onActivityResized + 111;
            onPostMessage = i2 % 128;
            if (i2 % 2 != 0) {
                return extraCallbackWithResult();
            }
            extraCallbackWithResult();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TubaBottomSheetDialog(@NotNull Activity activity, @NotNull UtilsKtExternalSyntheticLambda9 utilsKtExternalSyntheticLambda9, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable Integer num, @NotNull String str8, @NotNull Map<String, Object> map, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02) {
            super(activity, 0, false, false, 14, (DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(activity, "");
            Intrinsics.checkNotNullParameter(utilsKtExternalSyntheticLambda9, "");
            Intrinsics.checkNotNullParameter(str8, "");
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(function0, "");
            Intrinsics.checkNotNullParameter(function02, "");
            this.onExtraCallbackWithResult = activity;
            this.readTypedObject = utilsKtExternalSyntheticLambda9;
            this.extraCallbackWithResult = str;
            this.writeTypedObject = str2;
            this.onNavigationEvent = str3;
            this.IAuthTabCallback = str4;
            this.onExtraCallback = str5;
            this.onTransact = str6;
            this.access000 = str7;
            this.IAuthTabCallback_Parcel = num;
            this.access100 = str8;
            this.getInterfaceDescriptor = map;
            this.extraCallback = function0;
            this.ICustomTabsCallback = function02;
            this.IAuthTabCallbackStubProxy = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.tuba.trigger.internal.BottomSheetTriggerExecutor$TubaBottomSheetDialog$$ExternalSyntheticLambda4
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 63;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    BaseTextView baseTextViewOnExtraCallbackWithResult = BottomSheetTriggerExecutor.TubaBottomSheetDialog.onExtraCallbackWithResult(this.f$0);
                    int i4 = IAuthTabCallback + 53;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    return baseTextViewOnExtraCallbackWithResult;
                }
            });
            this.asInterface = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.tuba.trigger.internal.BottomSheetTriggerExecutor$TubaBottomSheetDialog$$ExternalSyntheticLambda5
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 117;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    BaseTextView baseTextViewOnNavigationEvent = BottomSheetTriggerExecutor.TubaBottomSheetDialog.onNavigationEvent(this.f$0);
                    int i4 = onExtraCallback + 81;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    return baseTextViewOnNavigationEvent;
                }
            });
            this.asBinder = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.tuba.trigger.internal.BottomSheetTriggerExecutor$TubaBottomSheetDialog$$ExternalSyntheticLambda6
                private static int onExtraCallback = 1;
                private static int onNavigationEvent;

                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 25;
                    onNavigationEvent = i2 % 128;
                    if (i2 % 2 != 0) {
                        BottomSheetTriggerExecutor.TubaBottomSheetDialog.onExtraCallback(this.f$0);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    TdsBottomCtaV1View tdsBottomCtaV1ViewOnExtraCallback = BottomSheetTriggerExecutor.TubaBottomSheetDialog.onExtraCallback(this.f$0);
                    int i3 = onNavigationEvent + 121;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                    return tdsBottomCtaV1ViewOnExtraCallback;
                }
            });
            this.IAuthTabCallbackDefault = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.tuba.trigger.internal.BottomSheetTriggerExecutor$TubaBottomSheetDialog$$ExternalSyntheticLambda7
                private static int onExtraCallback = 1;
                private static int onNavigationEvent;

                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 65;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    TdsImageView tdsImageViewOnWarmupCompleted = BottomSheetTriggerExecutor.TubaBottomSheetDialog.onWarmupCompleted(this.f$0);
                    int i4 = onExtraCallback + 93;
                    onNavigationEvent = i4 % 128;
                    if (i4 % 2 == 0) {
                        return tdsImageViewOnWarmupCompleted;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            });
        }

        public /* synthetic */ TubaBottomSheetDialog(Activity activity, UtilsKtExternalSyntheticLambda9 utilsKtExternalSyntheticLambda9, String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, String str8, Map map, Function0 function0, Function0 function02, int i, DefaultConstructorMarker defaultConstructorMarker) {
            String str9;
            String str10;
            String str11;
            String str12;
            Function0 function03;
            if ((i & 4) != 0) {
                int i2 = 2 % 2;
                str9 = null;
            } else {
                str9 = str;
            }
            if ((i & 8) != 0) {
                int i3 = 2 % 2;
                str10 = null;
            } else {
                str10 = str2;
            }
            String str13 = (i & 16) != 0 ? null : str3;
            String str14 = (i & 32) != 0 ? null : str4;
            if ((i & 64) != 0) {
                int i4 = onPostMessage + 59;
                onActivityResized = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
                str11 = null;
            } else {
                str11 = str5;
            }
            if ((i & 128) != 0) {
                int i7 = onPostMessage + 121;
                int i8 = i7 % 128;
                onActivityResized = i8;
                int i9 = i7 % 2;
                int i10 = i8 + 81;
                onPostMessage = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 2 % 2;
                }
                str12 = null;
            } else {
                str12 = str6;
            }
            String str15 = (i & 256) != 0 ? null : str7;
            Function0 function04 = (i & 4096) != 0 ? new Function0() { // from class: im.toss.components.tuba.trigger.internal.BottomSheetTriggerExecutor$TubaBottomSheetDialog$$ExternalSyntheticLambda8
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke() {
                    int i12 = 2 % 2;
                    int i13 = onNavigationEvent + 97;
                    onExtraCallbackWithResult = i13 % 128;
                    int i14 = i13 % 2;
                    Unit unitOnExtraCallbackWithResult = BottomSheetTriggerExecutor.TubaBottomSheetDialog.onExtraCallbackWithResult();
                    int i15 = onExtraCallbackWithResult + 29;
                    onNavigationEvent = i15 % 128;
                    int i16 = i15 % 2;
                    return unitOnExtraCallbackWithResult;
                }
            } : function0;
            if ((i & 8192) != 0) {
                int i12 = 2 % 2;
                function03 = new Function0() { // from class: im.toss.components.tuba.trigger.internal.BottomSheetTriggerExecutor$TubaBottomSheetDialog$$ExternalSyntheticLambda9
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallbackWithResult;

                    public final Object invoke() {
                        int i13 = 2 % 2;
                        int i14 = IAuthTabCallback + 93;
                        onExtraCallbackWithResult = i14 % 128;
                        if (i14 % 2 == 0) {
                            return BottomSheetTriggerExecutor.TubaBottomSheetDialog.onWarmupCompleted();
                        }
                        BottomSheetTriggerExecutor.TubaBottomSheetDialog.onWarmupCompleted();
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                };
            } else {
                function03 = function02;
            }
            this(activity, utilsKtExternalSyntheticLambda9, str9, str10, str13, str14, str11, str12, str15, num, str8, map, function04, function03);
        }

        private static final Unit readTypedObject() {
            int i = 2 % 2;
            int i2 = onPostMessage + 45;
            onActivityResized = i2 % 128;
            int i3 = i2 % 2;
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static final Unit extraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onActivityResized + 93;
            onPostMessage = i2 % 128;
            int i3 = i2 % 2;
            Unit unit = Unit.INSTANCE;
            int i4 = onPostMessage + 85;
            onActivityResized = i4 % 128;
            if (i4 % 2 == 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static final BaseTextView asBinder(TubaBottomSheetDialog tubaBottomSheetDialog) {
            int i = 2 % 2;
            int i2 = onPostMessage + 95;
            onActivityResized = i2 % 128;
            int i3 = i2 % 2;
            BaseTextView baseTextViewFindViewById = tubaBottomSheetDialog.findViewById(R.id.dialogTitleContentTitle);
            Intrinsics.checkNotNull(baseTextViewFindViewById);
            BaseTextView baseTextView = baseTextViewFindViewById;
            int i4 = onPostMessage + 23;
            onActivityResized = i4 % 128;
            if (i4 % 2 == 0) {
                return baseTextView;
            }
            throw null;
        }

        private final BaseTextView onMinimized() {
            int i = 2 % 2;
            int i2 = onActivityResized + 109;
            onPostMessage = i2 % 128;
            int i3 = i2 % 2;
            Object value = this.IAuthTabCallbackStubProxy.getValue();
            if (i3 != 0) {
                return (BaseTextView) value;
            }
            int i4 = 49 / 0;
            return (BaseTextView) value;
        }

        private static final BaseTextView asInterface(TubaBottomSheetDialog tubaBottomSheetDialog) {
            int i = 2 % 2;
            int i2 = onActivityResized + 13;
            onPostMessage = i2 % 128;
            int i3 = i2 % 2;
            BaseTextView baseTextViewFindViewById = tubaBottomSheetDialog.findViewById(R.id.dialogTitleContentContent);
            Intrinsics.checkNotNull(baseTextViewFindViewById);
            BaseTextView baseTextView = baseTextViewFindViewById;
            int i4 = onActivityResized + 111;
            onPostMessage = i4 % 128;
            int i5 = i4 % 2;
            return baseTextView;
        }

        private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
            TubaBottomSheetDialog tubaBottomSheetDialog = (TubaBottomSheetDialog) objArr[0];
            int i = 2 % 2;
            int i2 = onActivityResized + 119;
            onPostMessage = i2 % 128;
            int i3 = i2 % 2;
            BaseTextView baseTextView = (BaseTextView) tubaBottomSheetDialog.asInterface.getValue();
            int i4 = onPostMessage + 97;
            onActivityResized = i4 % 128;
            if (i4 % 2 == 0) {
                return baseTextView;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
            TubaBottomSheetDialog tubaBottomSheetDialog = (TubaBottomSheetDialog) objArr[0];
            int i = 2 % 2;
            int i2 = onPostMessage + 89;
            onActivityResized = i2 % 128;
            int i3 = i2 % 2;
            TdsBottomCtaV1View tdsBottomCtaV1ViewFindViewById = tubaBottomSheetDialog.findViewById(R.id.dialogTitleContentButton);
            Intrinsics.checkNotNull(tdsBottomCtaV1ViewFindViewById);
            TdsBottomCtaV1View tdsBottomCtaV1View = tdsBottomCtaV1ViewFindViewById;
            if (i3 == 0) {
                return tdsBottomCtaV1View;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private final TdsBottomCtaV1View writeTypedObject() {
            int i = 2 % 2;
            int i2 = onActivityResized + 73;
            onPostMessage = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            TdsBottomCtaV1View tdsBottomCtaV1View = (TdsBottomCtaV1View) this.asBinder.getValue();
            int i3 = onPostMessage + 9;
            onActivityResized = i3 % 128;
            int i4 = i3 % 2;
            return tdsBottomCtaV1View;
        }

        private final TdsImageView onActivityResized() {
            int i = 2 % 2;
            int i2 = onPostMessage + 31;
            onActivityResized = i2 % 128;
            int i3 = i2 % 2;
            TdsImageView tdsImageView = (TdsImageView) this.IAuthTabCallbackDefault.getValue();
            int i4 = onActivityResized + 109;
            onPostMessage = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 7 / 0;
            }
            return tdsImageView;
        }

        private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
            TubaBottomSheetDialog tubaBottomSheetDialog = (TubaBottomSheetDialog) objArr[0];
            int i = 2 % 2;
            int i2 = onPostMessage + 119;
            onActivityResized = i2 % 128;
            int i3 = i2 % 2;
            TdsImageView tdsImageViewFindViewById = tubaBottomSheetDialog.findViewById(R.id.dialogTitleContentImage);
            Intrinsics.checkNotNull(tdsImageViewFindViewById);
            TdsImageView tdsImageView = tdsImageViewFindViewById;
            int i4 = onActivityResized + 23;
            onPostMessage = i4 % 128;
            int i5 = i4 % 2;
            return tdsImageView;
        }

        private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
            TubaBottomSheetDialog tubaBottomSheetDialog = (TubaBottomSheetDialog) objArr[0];
            int i = 2 % 2;
            int i2 = onPostMessage + 1;
            onActivityResized = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                tubaBottomSheetDialog.extraCallback.invoke();
                throw null;
            }
            tubaBottomSheetDialog.extraCallback.invoke();
            int i3 = onActivityResized + 27;
            onPostMessage = i3 % 128;
            if (i3 % 2 != 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }

        private static final void IAuthTabCallback(TubaBottomSheetDialog tubaBottomSheetDialog, DialogInterface dialogInterface) {
            int i = 2 % 2;
            int i2 = onPostMessage + 21;
            onActivityResized = i2 % 128;
            int i3 = i2 % 2;
            ConvertByteArrayToFloatArray.onWarmupCompleted("tuba_trigger_bottomsheet_cancel", false, tubaBottomSheetDialog.access100, null, tubaBottomSheetDialog.getInterfaceDescriptor, null, 42, null);
            tubaBottomSheetDialog.ICustomTabsCallback.invoke();
            int i4 = onPostMessage + 33;
            onActivityResized = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static final void IAuthTabCallback(TubaBottomSheetDialog tubaBottomSheetDialog, View view) throws Throwable {
            int i = 2 % 2;
            int i2 = onActivityResized + 45;
            onPostMessage = i2 % 128;
            int i3 = i2 % 2;
            tubaBottomSheetDialog.dismiss();
            String str = tubaBottomSheetDialog.IAuthTabCallback;
            if (str != null) {
                int i4 = onActivityResized + 45;
                onPostMessage = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 72 / 0;
                    if (str.length() != 0) {
                        tubaBottomSheetDialog.readTypedObject.start(tubaBottomSheetDialog.onExtraCallbackWithResult, tubaBottomSheetDialog.IAuthTabCallback);
                    }
                } else if (str.length() != 0) {
                }
            }
            new TrackEvent("tuba_trigger_bottomsheet_button1", tubaBottomSheetDialog.getInterfaceDescriptor, (List) null, tubaBottomSheetDialog.access100, 4, (DefaultConstructorMarker) null).onWarmupCompleted(true);
            int i6 = onActivityResized + 1;
            onPostMessage = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 79 / 0;
            }
        }

        private static final void onExtraCallbackWithResult(TubaBottomSheetDialog tubaBottomSheetDialog, View view) throws Throwable {
            int i = 2 % 2;
            int i2 = onActivityResized + 65;
            onPostMessage = i2 % 128;
            int i3 = i2 % 2;
            tubaBottomSheetDialog.dismiss();
            String str = tubaBottomSheetDialog.onTransact;
            if (str != null) {
                int i4 = onPostMessage + 9;
                onActivityResized = i4 % 128;
                int i5 = i4 % 2;
                if (mergeParams.onExtraCallbackWithResult(str)) {
                    tubaBottomSheetDialog.readTypedObject.start(tubaBottomSheetDialog.onExtraCallbackWithResult, tubaBottomSheetDialog.onTransact);
                    int i6 = onActivityResized + 95;
                    onPostMessage = i6 % 128;
                    int i7 = i6 % 2;
                }
            }
            new TrackEvent("tuba_trigger_bottomsheet_button2", tubaBottomSheetDialog.getInterfaceDescriptor, (List) null, tubaBottomSheetDialog.access100, 4, (DefaultConstructorMarker) null).onWarmupCompleted(true);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0113  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0147  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0164  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onCreate(@Nullable Bundle bundle) {
            String string;
            String string2;
            int i = 2 % 2;
            super/*o.BrickModuleImplExternalSyntheticLambda0*/.onCreate(bundle);
            setContentView(R.layout.tuba_trigger_dialog_title_content);
            setOnDismissListener(new BottomSheetTriggerExecutor$TubaBottomSheetDialog$.ExternalSyntheticLambda0(this));
            setOnCancelListener(new BottomSheetTriggerExecutor$TubaBottomSheetDialog$.ExternalSyntheticLambda1(this));
            onMinimized().setText(this.extraCallbackWithResult);
            ((BaseTextView) IAuthTabCallback(NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), 1753208743, -1753208741, new Object[]{this})).setText(this.writeTypedObject);
            BaseTextView baseTextView = (BaseTextView) IAuthTabCallback(NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), 1753208743, -1753208741, new Object[]{this});
            String str = this.writeTypedObject;
            baseTextView.setVisibility((str == null || str.length() <= 0) ? 8 : 0);
            Object obj = null;
            if (URLUtil.isNetworkUrl(this.access000) && this.IAuthTabCallback_Parcel != null) {
                int i2 = onActivityResized + 107;
                onPostMessage = i2 % 128;
                if (i2 % 2 == 0) {
                    onActivityResized().getLayoutParams();
                    obj.hashCode();
                    throw null;
                }
                TdsImageView tdsImageViewOnActivityResized = onActivityResized();
                ViewGroup.LayoutParams layoutParams = tdsImageViewOnActivityResized.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult = (ConstraintLayout.onExtraCallbackWithResult) layoutParams;
                Integer num = this.IAuthTabCallback_Parcel;
                DisplayMetrics displayMetrics = this.onExtraCallbackWithResult.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
                ((ViewGroup.MarginLayoutParams) onextracallbackwithresult).height = varyMatches.onNavigationEvent(num, displayMetrics);
                tdsImageViewOnActivityResized.setLayoutParams(onextracallbackwithresult);
                TdsImageView tdsImageViewOnActivityResized2 = onActivityResized();
                CarouselKtCarousel4ExternalSyntheticLambda0.onExtraCallbackWithResult(tdsImageViewOnActivityResized2.getContext()).onWarmupCompleted(Recomposerjoin2.onExtraCallback(new RecomposerawaitIdle2.onNavigationEvent(tdsImageViewOnActivityResized2.getContext()).onExtraCallback(this.access000), tdsImageViewOnActivityResized2).onExtraCallbackWithResult());
                onActivityResized().setVisibility(0);
            }
            TdsBottomCtaV1View tdsBottomCtaV1ViewWriteTypedObject = writeTypedObject();
            String str2 = this.onNavigationEvent;
            if (str2 != null) {
                int i3 = onActivityResized + 59;
                onPostMessage = i3 % 128;
                int i4 = i3 % 2;
                string = str2.length() != 0 ? this.onNavigationEvent : this.onExtraCallbackWithResult.getString(im.toss.uikit.R.string.uikit_confirm);
            }
            String str3 = string;
            Intrinsics.checkNotNull(str3);
            TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1ViewWriteTypedObject, str3, new BottomSheetTriggerExecutor$TubaBottomSheetDialog$.ExternalSyntheticLambda2(this), (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
            String str4 = this.onExtraCallback;
            if (str4 != null) {
                int i5 = onPostMessage + 73;
                onActivityResized = i5 % 128;
                if (i5 % 2 != 0) {
                    str4.length();
                    throw null;
                }
                if (str4.length() == 0) {
                    String str5 = this.onTransact;
                    if (str5 != null) {
                        int i6 = onActivityResized + 105;
                        onPostMessage = i6 % 128;
                        if (i6 % 2 != 0 ? mergeParams.onExtraCallbackWithResult(str5) : mergeParams.onExtraCallbackWithResult(str5)) {
                            String str6 = this.onExtraCallback;
                            if (str6 == null || str6.length() == 0) {
                                string2 = this.onExtraCallbackWithResult.getString(im.toss.uikit.R.string.uikit_cancel);
                            } else {
                                int i7 = onPostMessage + 59;
                                onActivityResized = i7 % 128;
                                if (i7 % 2 != 0) {
                                    string2 = this.onExtraCallback;
                                    int i8 = 49 / 0;
                                } else {
                                    string2 = this.onExtraCallback;
                                }
                            }
                            String str7 = string2;
                            Intrinsics.checkNotNull(str7);
                            TdsBottomCtaV1View.setSecondary$default(tdsBottomCtaV1ViewWriteTypedObject, str7, new BottomSheetTriggerExecutor$TubaBottomSheetDialog$.ExternalSyntheticLambda3(this), (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
                        }
                    }
                }
            }
            ConvertByteArrayToFloatArray.onExtraCallback(1014169L, true, this.access100, this.getInterfaceDescriptor, null, 16, null);
        }

        private static final TdsBottomCtaV1View IAuthTabCallback(TubaBottomSheetDialog tubaBottomSheetDialog) {
            int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
            return (TdsBottomCtaV1View) IAuthTabCallback(NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), iOnWarmupCompleted, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), 1320031008, -1320031005, new Object[]{tubaBottomSheetDialog});
        }

        private static final TdsImageView IAuthTabCallbackStub(TubaBottomSheetDialog tubaBottomSheetDialog) {
            int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
            return (TdsImageView) IAuthTabCallback(NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), iOnWarmupCompleted, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), 1577820330, -1577820330, new Object[]{tubaBottomSheetDialog});
        }

        private final BaseTextView onPostMessage() {
            int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
            return (BaseTextView) IAuthTabCallback(NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), iOnWarmupCompleted, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), 1753208743, -1753208741, new Object[]{this});
        }

        private static final void onWarmupCompleted(TubaBottomSheetDialog tubaBottomSheetDialog, DialogInterface dialogInterface) {
            int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
            IAuthTabCallback(NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), iOnWarmupCompleted, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), -1104140451, 1104140452, new Object[]{tubaBottomSheetDialog, dialogInterface});
        }
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        int i3 = $11 + 111;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), 43 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), KeyEvent.getDeadChar(0, 0) + 1451, 228868077, false, $$c(b, b2, (byte) (b2 + 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 49123), 45 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0, 0) + 1495, 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23972 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), 50 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), ((byte) KeyEvent.getModifierMetaStateMask()) + 22940, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45848 - Color.argb(0, 0, 0, 0)), ExpandableListView.getPackedPositionType(0L) + 29, 12577 - Color.green(0), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] ^ cArr4[iIntValue2]) ^ (onWarmupCompleted ^ 7798559133331975163L)) ^ ((int) (onNavigationEvent ^ 7798559133331975163L))) ^ ((char) (onExtraCallback ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i5 = $11 + 27;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        objArr[0] = str;
    }

    private final void onExtraCallback(Activity activity, Trigger trigger, String str) throws Throwable {
        int i = 2 % 2;
        Map<String, Object> mapAsInterface = trigger.asInterface();
        Map mapIAuthTabCallback = access8100.IAuthTabCallback(new Pair[]{getWrite.IAuthTabCallback("trigger_id", trigger.onNavigationEvent()), getWrite.IAuthTabCallback("trigger_name", trigger.onWarmupCompleted())});
        Object[] objArr = new Object[1];
        a((char) (3804 - KeyEvent.getDeadChar(0, 0)), 999769628 - (ViewConfiguration.getFadingEdgeLength() >> 16), new char[]{13652, 26984, 31532, 6571, 52172}, new char[]{0, 0, 0, 0}, new char[]{7320, 38726, 56379, 17422}, objArr);
        String str2 = (String) mapAsInterface.get(((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        a((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ViewConfiguration.getTouchSlop() >> 8) + 12498502, new char[]{41444, 3682, 38352, 26804, 664, 27632, 59298}, new char[]{0, 0, 0, 0}, new char[]{17940, 48822, 14592, 52901}, objArr2);
        String str3 = (String) mapAsInterface.get(((String) objArr2[0]).intern());
        String str4 = (String) mapAsInterface.get("button1Text");
        String str5 = (String) mapAsInterface.get("button1Url");
        String str6 = (String) mapAsInterface.get("button2Text");
        String str7 = (String) mapAsInterface.get("button2Url");
        Object[] objArr3 = new Object[1];
        a((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1, new char[]{49563, 62642, 64251, 42999, 21389, 33543, 37378, 23954}, new char[]{0, 0, 0, 0}, new char[]{61185, 42561, 45040, 17305}, objArr3);
        new TubaBottomSheetDialog(activity, this.IAuthTabCallback, str2, str3, str4, str5, str6, str7, (String) mapAsInterface.get(((String) objArr3[0]).intern()), (Integer) mapAsInterface.get("imagePlaceholderSize"), str, mapIAuthTabCallback, null, null, 12288, null).show();
        int i2 = onTransact + 75;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
    }

    static void onExtraCallback() {
        onWarmupCompleted = 7798559133331975163L;
        onNavigationEvent = -1776194565;
        onExtraCallback = (char) 58153;
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }
}
