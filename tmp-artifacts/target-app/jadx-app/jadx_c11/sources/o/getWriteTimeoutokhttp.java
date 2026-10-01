package o;

import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.tds.view.component.anim.text.AnimateText;
import im.toss.tds.view.component.anim.top.AnimateTop;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.getWriteTimeoutokhttp;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public abstract class getWriteTimeoutokhttp {
    private static int asBinder = 1;
    private static int asInterface;
    private Function0<Unit> IAuthTabCallback;
    private boolean IAuthTabCallbackStub;
    private final Function0<Unit> onExtraCallback;
    private AnimateTop onExtraCallbackWithResult;
    private int onNavigationEvent;
    private final Function0<Unit> onTransact;
    private AnimateText.onNavigationEvent onWarmupCompleted;

    public /* synthetic */ getWriteTimeoutokhttp(int i, AnimateText.onNavigationEvent onnavigationevent, boolean z, Function0 function0, Function0 function02, Function0 function03, AnimateTop animateTop, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, onnavigationevent, z, function0, function02, function03, animateTop);
    }

    public static /* synthetic */ Unit IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 41;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAccess100 = access100();
        int i4 = asInterface + 5;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unitAccess100;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i;
        int i9 = ~i4;
        int i10 = (~(i8 | i9)) | i7;
        int i11 = ~(i8 | i6 | i4);
        int i12 = (~(i4 | i6)) | (~(i7 | i9)) | i8;
        int i13 = i6 + i + i2 + ((-1422066268) * i5) + ((-2108786386) * i3);
        int i14 = i13 * i13;
        int i15 = ((-1583913924) * i6) + 967573504 + (322476998 * i) + (i10 * 1194288187) + (1194288187 * i11) + ((-1194288187) * i12) + (1516765184 * i2) + ((-1298137088) * i5) + (1722810368 * i3) + (518782976 * i14);
        int i16 = (i6 * 793895740) + 1353643607 + (i * 793896262) + (i10 * (-261)) + (i11 * (-261)) + (i12 * 261) + (i2 * 793896001) + (i5 * 692483748) + (i3 * (-1016611666)) + (i14 * 166461440);
        int i17 = i15 + (i16 * i16 * 1997799424);
        return i17 != 1 ? i17 != 2 ? IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr) : onWarmupCompleted(objArr);
    }

    public static /* synthetic */ Unit onExtraCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 49;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy();
        int i4 = asBinder + 57;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackStubProxy;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asInterface + 87;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback3 = OverseasRrnInputTextField.IAuthTabCallback();
        Unit unit = (Unit) onExtraCallback(-63462995, iIAuthTabCallback2, OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback, new Object[0], iIAuthTabCallback3, 63462997);
        int i4 = asInterface + 83;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private getWriteTimeoutokhttp(int i, AnimateText.onNavigationEvent onnavigationevent, boolean z, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, AnimateTop animateTop) {
        this.onNavigationEvent = i;
        this.onWarmupCompleted = onnavigationevent;
        this.IAuthTabCallbackStub = z;
        this.onTransact = function0;
        this.IAuthTabCallback = function02;
        this.onExtraCallback = function03;
        this.onExtraCallbackWithResult = animateTop;
    }

    public final int onTransact() {
        int i = 2 % 2;
        int i2 = asInterface + 67;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        int i5 = this.onNavigationEvent;
        int i6 = i3 + 51;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        getWriteTimeoutokhttp getwritetimeoutokhttp = (getWriteTimeoutokhttp) objArr[0];
        int i = 2 % 2;
        int i2 = asBinder + 111;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        AnimateText.onNavigationEvent onnavigationevent = getwritetimeoutokhttp.onWarmupCompleted;
        int i5 = i3 + 111;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return onnavigationevent;
        }
        throw null;
    }

    public final boolean asInterface() {
        int i = 2 % 2;
        int i2 = asInterface + 97;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return this.IAuthTabCallbackStub;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ getWriteTimeoutokhttp(int i, AnimateText.onNavigationEvent onnavigationevent, boolean z, Function0 function0, Function0 function02, Function0 function03, AnimateTop animateTop, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        Function0 function04;
        Function0 function05;
        AnimateTop animateTop2;
        if ((i2 & 8) != 0) {
            int i3 = 2 % 2;
            function04 = new Function0() { // from class: im.toss.tds.view.component.anim.top.AnimateTopParam$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke() {
                    int i4 = 2 % 2;
                    int i5 = onExtraCallbackWithResult + 37;
                    IAuthTabCallback = i5 % 128;
                    if (i5 % 2 != 0) {
                        return getWriteTimeoutokhttp.IAuthTabCallback();
                    }
                    getWriteTimeoutokhttp.IAuthTabCallback();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            };
        } else {
            function04 = function0;
        }
        if ((i2 & 16) != 0) {
            Function0 function06 = new Function0() { // from class: im.toss.tds.view.component.anim.top.AnimateTopParam$$ExternalSyntheticLambda1
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke() {
                    int i4 = 2 % 2;
                    int i5 = onExtraCallback + 3;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    Unit unitOnExtraCallbackWithResult = getWriteTimeoutokhttp.onExtraCallbackWithResult();
                    int i7 = onExtraCallbackWithResult + 69;
                    onExtraCallback = i7 % 128;
                    int i8 = i7 % 2;
                    return unitOnExtraCallbackWithResult;
                }
            };
            int i4 = asInterface + 75;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            function05 = function06;
        } else {
            function05 = function02;
        }
        Function0 function07 = (i2 & 32) != 0 ? new Function0() { // from class: im.toss.tds.view.component.anim.top.AnimateTopParam$$ExternalSyntheticLambda2
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i7 = 2 % 2;
                int i8 = onWarmupCompleted + 109;
                onExtraCallback = i8 % 128;
                int i9 = i8 % 2;
                Unit unitOnExtraCallback = getWriteTimeoutokhttp.onExtraCallback();
                int i10 = onExtraCallback + 81;
                onWarmupCompleted = i10 % 128;
                int i11 = i10 % 2;
                return unitOnExtraCallback;
            }
        } : function03;
        if ((i2 & 64) != 0) {
            int i7 = asBinder + 11;
            asInterface = i7 % 128;
            int i8 = i7 % 2;
            animateTop2 = null;
        } else {
            animateTop2 = animateTop;
        }
        this(i, onnavigationevent, z, function04, function05, function07, animateTop2, null);
    }

    private static final Unit access100() {
        int i = 2 % 2;
        int i2 = asBinder + 13;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i3 = asInterface + 95;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    public final Function0<Unit> IAuthTabCallbackStub() {
        Function0<Unit> function0;
        int i = 2 % 2;
        int i2 = asInterface + 55;
        int i3 = i2 % 128;
        asBinder = i3;
        if (i2 % 2 == 0) {
            function0 = this.onTransact;
            int i4 = 33 / 0;
        } else {
            function0 = this.onTransact;
        }
        int i5 = i3 + 53;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 16 / 0;
        }
        return function0;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int i = 2 % 2;
        int i2 = asInterface + 33;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            int i4 = 46 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        getWriteTimeoutokhttp getwritetimeoutokhttp = (getWriteTimeoutokhttp) objArr[0];
        Function0<Unit> function0 = (Function0) objArr[1];
        int i = 2 % 2;
        int i2 = asInterface + 97;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function0, "");
            getwritetimeoutokhttp.IAuthTabCallback = function0;
            int i3 = 51 / 0;
        } else {
            Intrinsics.checkNotNullParameter(function0, "");
            getwritetimeoutokhttp.IAuthTabCallback = function0;
        }
        int i4 = asInterface + 21;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public final Function0<Unit> IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = asBinder + 41;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        Function0<Unit> function0 = this.IAuthTabCallback;
        int i5 = i3 + 1;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return function0;
    }

    private static final Unit IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = asInterface + 19;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 47;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public final Function0<Unit> asBinder() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 37;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Function0<Unit> function0 = this.onExtraCallback;
        int i5 = i2 + 53;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return function0;
    }

    public final AnimateTop onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asBinder + 49;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onExtraCallbackWithResult;
        }
        throw null;
    }

    public final void onWarmupCompleted(@Nullable AnimateTop animateTop) {
        int i = 2 % 2;
        int i2 = asBinder + 51;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallbackWithResult = animateTop;
        if (i3 != 0) {
            throw null;
        }
    }

    public static final class onWarmupCompleted extends getWriteTimeoutokhttp {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        private final boolean IAuthTabCallback;
        private final CharSequence onExtraCallback;
        private final readTimeout onExtraCallbackWithResult;

        public static /* synthetic */ Unit IAuthTabCallbackStubProxy() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 55;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return writeTypedObject();
            }
            writeTypedObject();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ Unit IAuthTabCallback_Parcel() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 53;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return extraCallbackWithResult();
            }
            extraCallbackWithResult();
            throw null;
        }

        public static /* synthetic */ Unit access100() {
            Unit typedObject;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 5;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                typedObject = readTypedObject();
                int i3 = 75 / 0;
            } else {
                typedObject = readTypedObject();
            }
            int i4 = onWarmupCompleted + 103;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return typedObject;
            }
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onWarmupCompleted(@NotNull CharSequence charSequence, @NotNull readTimeout readtimeout, int i, @NotNull AnimateText.onNavigationEvent onnavigationevent, boolean z, boolean z2, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @NotNull Function0<Unit> function03) {
            super(i, onnavigationevent, z, function02, function0, function03, null, 64, null);
            Intrinsics.checkNotNullParameter(charSequence, "");
            Intrinsics.checkNotNullParameter(readtimeout, "");
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            Intrinsics.checkNotNullParameter(function0, "");
            Intrinsics.checkNotNullParameter(function02, "");
            Intrinsics.checkNotNullParameter(function03, "");
            this.onExtraCallback = charSequence;
            this.onExtraCallbackWithResult = readtimeout;
            this.IAuthTabCallback = z2;
        }

        public /* synthetic */ onWarmupCompleted(CharSequence charSequence, readTimeout readtimeout, int i, AnimateText.onNavigationEvent onnavigationevent, boolean z, boolean z2, Function0 function0, Function0 function02, Function0 function03, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            AnimateText.onNavigationEvent onnavigationevent2;
            Function0 function04;
            Function0 function05;
            int i3 = (i2 & 4) != 0 ? 0 : i;
            if ((i2 & 8) != 0) {
                int i4 = onWarmupCompleted + 109;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    AnimateText.onNavigationEvent onnavigationevent3 = AnimateText.onNavigationEvent.TOP_LEFT;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                onnavigationevent2 = AnimateText.onNavigationEvent.TOP_LEFT;
            } else {
                onnavigationevent2 = onnavigationevent;
            }
            boolean z3 = (i2 & 16) != 0 ? false : z;
            boolean z4 = (i2 & 32) != 0 ? false : z2;
            if ((i2 & 64) != 0) {
                Function0 function06 = new Function0() { // from class: im.toss.tds.view.component.anim.top.AnimateTopParam$AnimateTextToParams$$ExternalSyntheticLambda0
                    private static int onExtraCallback = 1;
                    private static int onExtraCallbackWithResult;

                    public final Object invoke() {
                        int i5 = 2 % 2;
                        int i6 = onExtraCallback + 117;
                        onExtraCallbackWithResult = i6 % 128;
                        int i7 = i6 % 2;
                        Unit unitAccess100 = getWriteTimeoutokhttp.onWarmupCompleted.access100();
                        int i8 = onExtraCallbackWithResult + 67;
                        onExtraCallback = i8 % 128;
                        int i9 = i8 % 2;
                        return unitAccess100;
                    }
                };
                int i5 = onNavigationEvent + 81;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 4 / 3;
                } else {
                    int i7 = 2 % 2;
                }
                function04 = function06;
            } else {
                function04 = function0;
            }
            Function0 function07 = (i2 & 128) != 0 ? new Function0() { // from class: im.toss.tds.view.component.anim.top.AnimateTopParam$AnimateTextToParams$$ExternalSyntheticLambda1
                private static int onExtraCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke() {
                    int i8 = 2 % 2;
                    int i9 = onWarmupCompleted + 57;
                    onExtraCallback = i9 % 128;
                    int i10 = i9 % 2;
                    Unit unitIAuthTabCallbackStubProxy = getWriteTimeoutokhttp.onWarmupCompleted.IAuthTabCallbackStubProxy();
                    int i11 = onExtraCallback + 97;
                    onWarmupCompleted = i11 % 128;
                    int i12 = i11 % 2;
                    return unitIAuthTabCallbackStubProxy;
                }
            } : function02;
            if ((i2 & 256) != 0) {
                Function0 function08 = new Function0() { // from class: im.toss.tds.view.component.anim.top.AnimateTopParam$AnimateTextToParams$$ExternalSyntheticLambda2
                    private static int onExtraCallbackWithResult = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke() {
                        int i8 = 2 % 2;
                        int i9 = onExtraCallbackWithResult + 115;
                        onNavigationEvent = i9 % 128;
                        int i10 = i9 % 2;
                        Unit unitIAuthTabCallback_Parcel = getWriteTimeoutokhttp.onWarmupCompleted.IAuthTabCallback_Parcel();
                        if (i10 == 0) {
                            int i11 = 59 / 0;
                        }
                        return unitIAuthTabCallback_Parcel;
                    }
                };
                int i8 = onNavigationEvent + 49;
                onWarmupCompleted = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 2 % 2;
                }
                function05 = function08;
            } else {
                function05 = function03;
            }
            this(charSequence, readtimeout, i3, onnavigationevent2, z3, z4, function04, function07, function05);
        }

        public final CharSequence access000() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 23;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            CharSequence charSequence = this.onExtraCallback;
            int i5 = i3 + 125;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return charSequence;
        }

        public final readTimeout getInterfaceDescriptor() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 5;
            onWarmupCompleted = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            readTimeout readtimeout = this.onExtraCallbackWithResult;
            int i4 = i2 + 29;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return readtimeout;
            }
            throw null;
        }

        public final boolean extraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 103;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            boolean z = this.IAuthTabCallback;
            int i5 = i2 + 47;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return z;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static final Unit readTypedObject() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 7;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Unit unit = Unit.INSTANCE;
            int i4 = onWarmupCompleted + 51;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        private static final Unit writeTypedObject() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 9;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                int i4 = 42 / 0;
            }
            return unit;
        }

        private static final Unit extraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 29;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Unit unit = Unit.INSTANCE;
            int i4 = onWarmupCompleted + 1;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }
    }

    private static final Unit getInterfaceDescriptor() {
        int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback3 = OverseasRrnInputTextField.IAuthTabCallback();
        return (Unit) onExtraCallback(-63462995, iIAuthTabCallback2, OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback, new Object[0], iIAuthTabCallback3, 63462997);
    }

    public final AnimateText.onNavigationEvent onNavigationEvent() {
        int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback3 = OverseasRrnInputTextField.IAuthTabCallback();
        return (AnimateText.onNavigationEvent) onExtraCallback(1819973442, iIAuthTabCallback2, OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback, new Object[]{this}, iIAuthTabCallback3, -1819973442);
    }

    public final void onExtraCallbackWithResult(@NotNull Function0<Unit> function0) {
        int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback3 = OverseasRrnInputTextField.IAuthTabCallback();
        onExtraCallback(967777866, iIAuthTabCallback2, OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback, new Object[]{this, function0}, iIAuthTabCallback3, -967777865);
    }

    public static final class onNavigationEvent extends getWriteTimeoutokhttp {
        private static int IAuthTabCallbackStub = 1;
        private static int asInterface;
        private int IAuthTabCallback;
        private final List<CharSequence> onExtraCallback;
        private final Integer onExtraCallbackWithResult;
        private final String onNavigationEvent;
        private final readTimeout onWarmupCompleted;

        public static /* synthetic */ Unit IAuthTabCallbackStubProxy() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 25;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnMinimized = onMinimized();
            int i4 = IAuthTabCallbackStub + 11;
            asInterface = i4 % 128;
            if (i4 % 2 == 0) {
                return unitOnMinimized;
            }
            throw null;
        }

        public static /* synthetic */ Unit access100() {
            int i = 2 % 2;
            int i2 = asInterface + 123;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = alertWithArgs.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = alertWithArgs.onExtraCallbackWithResult();
            Unit unit = (Unit) onExtraCallback(iOnExtraCallbackWithResult, alertWithArgs.onExtraCallbackWithResult(), 1778928941, new Object[0], iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, -1778928940);
            int i4 = asInterface + 63;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public static /* synthetic */ Unit getInterfaceDescriptor() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 3;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[0];
            int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = alertWithArgs.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = alertWithArgs.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult4 = alertWithArgs.onExtraCallbackWithResult();
            if (i3 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Unit unit = (Unit) onExtraCallback(iOnExtraCallbackWithResult, iOnExtraCallbackWithResult4, -367815246, objArr, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, 367815246);
            int i4 = IAuthTabCallbackStub + 25;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
            int i7 = ~i6;
            int i8 = ~i3;
            int i9 = ~i;
            int i10 = (~(i8 | i9)) | i7;
            int i11 = ~(i8 | i6 | i);
            int i12 = (~(i | i6)) | (~(i7 | i9)) | i8;
            int i13 = i6 + i3 + i5 + ((-1422066268) * i4) + ((-2108786386) * i2);
            int i14 = i13 * i13;
            int i15 = ((-1583913924) * i6) + 967573504 + (322476998 * i3) + (i10 * 1194288187) + (1194288187 * i11) + ((-1194288187) * i12) + (1516765184 * i5) + ((-1298137088) * i4) + (1722810368 * i2) + (518782976 * i14);
            int i16 = (i6 * 793895740) + 1353643607 + (i3 * 793896262) + (i10 * (-261)) + (i11 * (-261)) + (i12 * 261) + (i5 * 793896001) + (i4 * 692483748) + (i2 * (-1016611666)) + (i14 * 166461440);
            return i15 + ((i16 * i16) * 1997799424) != 1 ? IAuthTabCallback(objArr) : onExtraCallback(objArr);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public onNavigationEvent(@NotNull List<? extends CharSequence> list, @NotNull readTimeout readtimeout, int i, int i2, @NotNull String str, @NotNull AnimateText.onNavigationEvent onnavigationevent, boolean z, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @NotNull Function0<Unit> function03, @Nullable Integer num) {
            super(i, onnavigationevent, z, function0, function02, function03, null, 64, null);
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(readtimeout, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            Intrinsics.checkNotNullParameter(function0, "");
            Intrinsics.checkNotNullParameter(function02, "");
            Intrinsics.checkNotNullParameter(function03, "");
            this.onExtraCallback = list;
            this.onWarmupCompleted = readtimeout;
            this.IAuthTabCallback = i2;
            this.onNavigationEvent = str;
            this.onExtraCallbackWithResult = num;
        }

        public /* synthetic */ onNavigationEvent(List list, readTimeout readtimeout, int i, int i2, String str, AnimateText.onNavigationEvent onnavigationevent, boolean z, Function0 function0, Function0 function02, Function0 function03, Integer num, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            int i4;
            int i5;
            boolean z2;
            Function0 function04;
            Integer num2;
            if ((i3 & 4) != 0) {
                int i6 = 2 % 2;
                i4 = 0;
            } else {
                i4 = i;
            }
            if ((i3 & 8) != 0) {
                int i7 = asInterface + 103;
                IAuthTabCallbackStub = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 2 % 2;
                }
                i5 = 0;
            } else {
                i5 = i2;
            }
            String str2 = (i3 & 16) != 0 ? "infinite" : str;
            AnimateText.onNavigationEvent onnavigationevent2 = (i3 & 32) != 0 ? AnimateText.onNavigationEvent.TOP_LEFT : onnavigationevent;
            if ((i3 & 64) != 0) {
                int i9 = asInterface + 67;
                IAuthTabCallbackStub = i9 % 128;
                int i10 = i9 % 2;
                z2 = false;
            } else {
                z2 = z;
            }
            Function0 function05 = (i3 & 128) != 0 ? new Function0() { // from class: im.toss.tds.view.component.anim.top.AnimateTopParam$AnimateTextTickerParams$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 1;
                private static int onNavigationEvent;

                public final Object invoke() {
                    int i11 = 2 % 2;
                    int i12 = onNavigationEvent + 23;
                    IAuthTabCallback = i12 % 128;
                    int i13 = i12 % 2;
                    Unit unitAccess100 = getWriteTimeoutokhttp.onNavigationEvent.access100();
                    int i14 = onNavigationEvent + 83;
                    IAuthTabCallback = i14 % 128;
                    int i15 = i14 % 2;
                    return unitAccess100;
                }
            } : function0;
            if ((i3 & 256) != 0) {
                Function0 function06 = new Function0() { // from class: im.toss.tds.view.component.anim.top.AnimateTopParam$AnimateTextTickerParams$$ExternalSyntheticLambda1
                    private static int IAuthTabCallback = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke() {
                        int i11 = 2 % 2;
                        int i12 = IAuthTabCallback + 73;
                        onNavigationEvent = i12 % 128;
                        if (i12 % 2 != 0) {
                            return getWriteTimeoutokhttp.onNavigationEvent.getInterfaceDescriptor();
                        }
                        getWriteTimeoutokhttp.onNavigationEvent.getInterfaceDescriptor();
                        throw null;
                    }
                };
                int i11 = asInterface + 105;
                IAuthTabCallbackStub = i11 % 128;
                int i12 = i11 % 2;
                int i13 = 2 % 2;
                function04 = function06;
            } else {
                function04 = function02;
            }
            Function0 function07 = (i3 & 512) != 0 ? new Function0() { // from class: im.toss.tds.view.component.anim.top.AnimateTopParam$AnimateTextTickerParams$$ExternalSyntheticLambda2
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke() {
                    int i14 = 2 % 2;
                    int i15 = onNavigationEvent + 35;
                    IAuthTabCallback = i15 % 128;
                    int i16 = i15 % 2;
                    Unit unitIAuthTabCallbackStubProxy = getWriteTimeoutokhttp.onNavigationEvent.IAuthTabCallbackStubProxy();
                    int i17 = IAuthTabCallback + 113;
                    onNavigationEvent = i17 % 128;
                    if (i17 % 2 == 0) {
                        int i18 = 39 / 0;
                    }
                    return unitIAuthTabCallbackStubProxy;
                }
            } : function03;
            if ((i3 & 1024) != 0) {
                int i14 = asInterface + 71;
                IAuthTabCallbackStub = i14 % 128;
                int i15 = i14 % 2;
                num2 = null;
            } else {
                num2 = num;
            }
            this(list, readtimeout, i4, i5, str2, onnavigationevent2, z2, function05, function04, function07, num2);
        }

        public final List<CharSequence> extraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = asInterface + 105;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            int i4 = i2 % 2;
            List<CharSequence> list = this.onExtraCallback;
            int i5 = i3 + 79;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            return list;
        }

        public final readTimeout IAuthTabCallback_Parcel() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 73;
            int i3 = i2 % 128;
            asInterface = i3;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            readTimeout readtimeout = this.onWarmupCompleted;
            int i4 = i3 + 109;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            return readtimeout;
        }

        public final int access000() {
            int i = 2 % 2;
            int i2 = asInterface;
            int i3 = i2 + 51;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            int i5 = this.IAuthTabCallback;
            int i6 = i2 + 3;
            IAuthTabCallbackStub = i6 % 128;
            if (i6 % 2 != 0) {
                return i5;
            }
            throw null;
        }

        public final void onExtraCallback(int i) {
            int i2 = 2 % 2;
            int i3 = asInterface + 5;
            int i4 = i3 % 128;
            IAuthTabCallbackStub = i4;
            int i5 = i3 % 2;
            this.IAuthTabCallback = i;
            int i6 = i4 + 31;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
        }

        public final String extraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 93;
            int i3 = i2 % 128;
            asInterface = i3;
            int i4 = i2 % 2;
            String str = this.onNavigationEvent;
            int i5 = i3 + 89;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            throw null;
        }

        private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
            Unit unit;
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 83;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                unit = Unit.INSTANCE;
                int i3 = 96 / 0;
            } else {
                unit = Unit.INSTANCE;
            }
            int i4 = asInterface + 109;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 41;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            Unit unit = Unit.INSTANCE;
            int i4 = asInterface + 73;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 != 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static final Unit onMinimized() {
            Unit unit;
            int i = 2 % 2;
            int i2 = asInterface + 53;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 == 0) {
                unit = Unit.INSTANCE;
                int i3 = 41 / 0;
            } else {
                unit = Unit.INSTANCE;
            }
            int i4 = IAuthTabCallbackStub + 119;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final Integer ICustomTabsCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 93;
            int i3 = i2 % 128;
            asInterface = i3;
            int i4 = i2 % 2;
            Integer num = this.onExtraCallbackWithResult;
            int i5 = i3 + 23;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            return num;
        }

        private static final Unit writeTypedObject() {
            int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = alertWithArgs.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = alertWithArgs.onExtraCallbackWithResult();
            return (Unit) onExtraCallback(iOnExtraCallbackWithResult, alertWithArgs.onExtraCallbackWithResult(), 1778928941, new Object[0], iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, -1778928940);
        }

        private static final Unit readTypedObject() {
            int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = alertWithArgs.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = alertWithArgs.onExtraCallbackWithResult();
            return (Unit) onExtraCallback(iOnExtraCallbackWithResult, alertWithArgs.onExtraCallbackWithResult(), -367815246, new Object[0], iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, 367815246);
        }
    }

    public static final class IAuthTabCallback extends getWriteTimeoutokhttp {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private final CharSequence IAuthTabCallback;
        private final String onExtraCallback;
        private final setAuthenticatorokhttp onWarmupCompleted;

        public static /* synthetic */ Unit IAuthTabCallback_Parcel() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 47;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                writeTypedObject();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Unit unitWriteTypedObject = writeTypedObject();
            int i3 = onExtraCallbackWithResult + 121;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 48 / 0;
            }
            return unitWriteTypedObject;
        }

        public static /* synthetic */ Unit access100() {
            Unit unitExtraCallback;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 17;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                unitExtraCallback = extraCallback();
                int i3 = 47 / 0;
            } else {
                unitExtraCallback = extraCallback();
            }
            int i4 = onNavigationEvent + 53;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 5 / 0;
            }
            return unitExtraCallback;
        }

        public static /* synthetic */ Unit getInterfaceDescriptor() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 111;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Unit unitICustomTabsCallback = ICustomTabsCallback();
            int i4 = onExtraCallbackWithResult + 115;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 63 / 0;
            }
            return unitICustomTabsCallback;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallback(@NotNull CharSequence charSequence, @NotNull setAuthenticatorokhttp setauthenticatorokhttp, int i, boolean z, @NotNull String str, @NotNull AnimateText.onNavigationEvent onnavigationevent, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @NotNull Function0<Unit> function03) {
            super(i, onnavigationevent, z, function0, function02, function03, null, 64, null);
            Intrinsics.checkNotNullParameter(charSequence, "");
            Intrinsics.checkNotNullParameter(setauthenticatorokhttp, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            Intrinsics.checkNotNullParameter(function0, "");
            Intrinsics.checkNotNullParameter(function02, "");
            Intrinsics.checkNotNullParameter(function03, "");
            this.IAuthTabCallback = charSequence;
            this.onWarmupCompleted = setauthenticatorokhttp;
            this.onExtraCallback = str;
        }

        public /* synthetic */ IAuthTabCallback(CharSequence charSequence, setAuthenticatorokhttp setauthenticatorokhttp, int i, boolean z, String str, AnimateText.onNavigationEvent onnavigationevent, Function0 function0, Function0 function02, Function0 function03, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            String str2;
            AnimateText.onNavigationEvent onnavigationevent2;
            Function0 function04;
            int i3 = (i2 & 4) != 0 ? 0 : i;
            boolean z2 = (i2 & 8) != 0 ? false : z;
            if ((i2 & 16) != 0) {
                int i4 = onExtraCallbackWithResult + 39;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
                str2 = "infinite";
            } else {
                str2 = str;
            }
            if ((i2 & 32) != 0) {
                int i7 = onNavigationEvent + 25;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                onnavigationevent2 = AnimateText.onNavigationEvent.TOP_LEFT;
            } else {
                onnavigationevent2 = onnavigationevent;
            }
            if ((i2 & 64) != 0) {
                int i9 = 2 % 2;
                function04 = new Function0() { // from class: im.toss.tds.view.component.anim.top.AnimateTopParam$AnimateTextInfiniteParams$$ExternalSyntheticLambda0
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    public final Object invoke() {
                        int i10 = 2 % 2;
                        int i11 = IAuthTabCallback + 103;
                        onExtraCallbackWithResult = i11 % 128;
                        if (i11 % 2 == 0) {
                            getWriteTimeoutokhttp.IAuthTabCallback.access100();
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        Unit unitAccess100 = getWriteTimeoutokhttp.IAuthTabCallback.access100();
                        int i12 = onExtraCallbackWithResult + 5;
                        IAuthTabCallback = i12 % 128;
                        if (i12 % 2 != 0) {
                            int i13 = 1 / 0;
                        }
                        return unitAccess100;
                    }
                };
            } else {
                function04 = function0;
            }
            this(charSequence, setauthenticatorokhttp, i3, z2, str2, onnavigationevent2, function04, (i2 & 128) != 0 ? new Function0() { // from class: im.toss.tds.view.component.anim.top.AnimateTopParam$AnimateTextInfiniteParams$$ExternalSyntheticLambda1
                private static int onExtraCallback = 1;
                private static int onNavigationEvent;

                public final Object invoke() {
                    Unit interfaceDescriptor;
                    int i10 = 2 % 2;
                    int i11 = onNavigationEvent + 35;
                    onExtraCallback = i11 % 128;
                    if (i11 % 2 == 0) {
                        interfaceDescriptor = getWriteTimeoutokhttp.IAuthTabCallback.getInterfaceDescriptor();
                        int i12 = 90 / 0;
                    } else {
                        interfaceDescriptor = getWriteTimeoutokhttp.IAuthTabCallback.getInterfaceDescriptor();
                    }
                    int i13 = onNavigationEvent + 67;
                    onExtraCallback = i13 % 128;
                    if (i13 % 2 != 0) {
                        return interfaceDescriptor;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            } : function02, (i2 & 256) != 0 ? new Function0() { // from class: im.toss.tds.view.component.anim.top.AnimateTopParam$AnimateTextInfiniteParams$$ExternalSyntheticLambda2
                private static int IAuthTabCallback = 1;
                private static int onWarmupCompleted;

                public final Object invoke() {
                    int i10 = 2 % 2;
                    int i11 = IAuthTabCallback + 71;
                    onWarmupCompleted = i11 % 128;
                    int i12 = i11 % 2;
                    Unit unitIAuthTabCallback_Parcel = getWriteTimeoutokhttp.IAuthTabCallback.IAuthTabCallback_Parcel();
                    int i13 = onWarmupCompleted + 61;
                    IAuthTabCallback = i13 % 128;
                    int i14 = i13 % 2;
                    return unitIAuthTabCallback_Parcel;
                }
            } : function03);
        }

        public final CharSequence readTypedObject() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 49;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            CharSequence charSequence = this.IAuthTabCallback;
            int i5 = i3 + 43;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return charSequence;
            }
            throw null;
        }

        public final setAuthenticatorokhttp IAuthTabCallbackStubProxy() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 41;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            setAuthenticatorokhttp setauthenticatorokhttp = this.onWarmupCompleted;
            int i5 = i3 + 75;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 47 / 0;
            }
            return setauthenticatorokhttp;
        }

        public final String access000() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 95;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            String str = this.onExtraCallback;
            int i5 = i2 + 27;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static final Unit extraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 81;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Unit unit = Unit.INSTANCE;
            int i4 = onNavigationEvent + 115;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return unit;
            }
            throw null;
        }

        private static final Unit ICustomTabsCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 37;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static final Unit writeTypedObject() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 75;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                int i4 = 92 / 0;
            }
            return unit;
        }
    }
}
