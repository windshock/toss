package o;

import android.content.SharedPreferences;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Deprecated;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.rx2.RxConvertKt;
import o.TextRoundCornerProgressBar2;
import o.getByteBuffer;
import o.getSecondaryProgressColor;
import o.serializeRaw;
import o.setApTextSize;
import o.writeBinary;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class TextRoundCornerProgressBar2 implements TextRoundCornerProgressBarSavedState1 {
    private static int asBinder = 0;
    private static int onTransact = 1;
    private AppSetIdAndScope1 IAuthTabCallback;
    private final SharedPreferences asInterface;
    private final Map<Class<?>, Parcelable.Creator<?>> onExtraCallback;
    private final getByteBuffer<String> onExtraCallbackWithResult;
    private final previewLayout onNavigationEvent;
    private final setOnProgressChangedListener onWarmupCompleted;

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        TextRoundCornerProgressBar2 textRoundCornerProgressBar2 = (TextRoundCornerProgressBar2) objArr[0];
        writeBinary writebinary = (writeBinary) objArr[1];
        int i = 2 % 2;
        int i2 = asBinder + 65;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(textRoundCornerProgressBar2, writebinary);
        if (i3 == 0) {
            throw null;
        }
        int i4 = onTransact + 77;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static /* synthetic */ void IAuthTabCallback(TextRoundCornerProgressBar2 textRoundCornerProgressBar2, SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        int i = 2 % 2;
        int i2 = asBinder + 95;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(textRoundCornerProgressBar2, onSharedPreferenceChangeListener);
        if (i3 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ boolean IAuthTabCallback(String str, String str2) {
        int i = 2 % 2;
        int i2 = asBinder + 87;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback(str, str2);
        }
        onExtraCallback(str, str2);
        throw null;
    }

    public static /* synthetic */ boolean IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 53;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult(function1, obj);
        }
        onExtraCallbackWithResult(function1, obj);
        throw null;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = (~(i7 | i2)) | (~(i5 | i2));
        int i9 = i5 | i;
        int i10 = (~(i | (~i2))) | (~(i7 | (~i5))) | (~i9);
        int i11 = i5 + i2 + i6 + (1350191703 * i3) + ((-44904237) * i4);
        int i12 = i11 * i11;
        int i13 = ((i5 * (-560584373)) - 948043776) + ((-560584373) * i2) + ((-826660534) * i8) + (i9 * 826660534) + (826660534 * i10) + (266076160 * i6) + ((-71041024) * i3) + ((-766246912) * i4) + (1339949056 * i12);
        int i14 = (i5 * 1657715387) + 2046152777 + (i2 * 1657715387) + (i8 * (-918)) + (i9 * 918) + (i10 * 918) + (i6 * 1657716305) + (i3 * 1507858311) + (i4 * 1845144771) + (i12 * 155058176);
        int i15 = i13 + (i14 * i14 * 417464320);
        if (i15 != 1) {
            return i15 != 2 ? i15 != 3 ? i15 != 4 ? IAuthTabCallback(objArr) : onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr) : onExtraCallback(objArr);
        }
        TextRoundCornerProgressBar2 textRoundCornerProgressBar2 = (TextRoundCornerProgressBar2) objArr[0];
        String str = (String) objArr[1];
        drawPadding drawpadding = (drawPadding) objArr[2];
        int i16 = 2 % 2;
        int i17 = asBinder + 39;
        onTransact = i17 % 128;
        int i18 = i17 % 2;
        serializeRaw serializeraw = (serializeRaw) onExtraCallback(setApTextSize.onNavigationEvent.4.onNavigationEvent(), -1899126499, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{textRoundCornerProgressBar2, str, drawpadding}, setApTextSize.onNavigationEvent.4.onNavigationEvent(), 1899126503, setApTextSize.onNavigationEvent.4.onNavigationEvent());
        int i19 = onTransact + 1;
        asBinder = i19 % 128;
        int i20 = i19 % 2;
        return serializeraw;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        getByteBuffer getbytebuffer = (getByteBuffer) objArr[1];
        int i = 2 % 2;
        int i2 = onTransact + 25;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            IAuthTabCallback(function1, getbytebuffer);
            obj.hashCode();
            throw null;
        }
        serializeRaw serializerawIAuthTabCallback = IAuthTabCallback(function1, getbytebuffer);
        int i3 = onTransact + 47;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            return serializerawIAuthTabCallback;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ getSecondaryProgressColor onExtraCallback(TextRoundCornerProgressBar2 textRoundCornerProgressBar2, String str, drawPadding drawpadding, String str2) {
        int i = 2 % 2;
        int i2 = onTransact + 59;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        getSecondaryProgressColor getsecondaryprogresscolorIAuthTabCallback = IAuthTabCallback(textRoundCornerProgressBar2, str, drawpadding, str2);
        int i4 = onTransact + 79;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return getsecondaryprogresscolorIAuthTabCallback;
    }

    public static /* synthetic */ boolean onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 61;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(function1, obj);
        }
        onNavigationEvent(function1, obj);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
        TextRoundCornerProgressBar2 textRoundCornerProgressBar2 = (TextRoundCornerProgressBar2) objArr[1];
        String str = (String) objArr[2];
        drawPadding drawpadding = (drawPadding) objArr[3];
        getByteBuffer getbytebuffer = (getByteBuffer) objArr[4];
        int i = 2 % 2;
        int i2 = asBinder + 41;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        serializeRaw serializerawIAuthTabCallback = IAuthTabCallback(zBooleanValue, textRoundCornerProgressBar2, str, drawpadding, getbytebuffer);
        int i4 = asBinder + 41;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return serializerawIAuthTabCallback;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(writeBinary writebinary, SharedPreferences sharedPreferences, String str) {
        int i = 2 % 2;
        int i2 = asBinder + 119;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(writebinary, sharedPreferences, str);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ getSecondaryProgressColor onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 105;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        getSecondaryProgressColor getsecondaryprogresscolorAsBinder = asBinder(function1, obj);
        int i4 = onTransact + 103;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 17 / 0;
        }
        return getsecondaryprogresscolorAsBinder;
    }

    public static /* synthetic */ boolean onWarmupCompleted(String str, String str2) {
        int i = 2 % 2;
        int i2 = onTransact + 5;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallbackDefault(str, str2);
        }
        IAuthTabCallbackDefault(str, str2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public TextRoundCornerProgressBar2(@NotNull SharedPreferences sharedPreferences, @NotNull setOnProgressChangedListener setonprogresschangedlistener) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "");
        Intrinsics.checkNotNullParameter(setonprogresschangedlistener, "");
        this.asInterface = sharedPreferences;
        this.onWarmupCompleted = setonprogresschangedlistener;
        AppSetIdAndScope1 appSetIdAndScope1OnExtraCallbackWithResult = ea10.onExtraCallbackWithResult("Prefser");
        Intrinsics.checkNotNullExpressionValue(appSetIdAndScope1OnExtraCallbackWithResult, "");
        this.IAuthTabCallback = appSetIdAndScope1OnExtraCallbackWithResult;
        this.onNavigationEvent = new removeLayoutParamsRule(sharedPreferences);
        this.onExtraCallbackWithResult = getByteBuffer.IAuthTabCallback(new serializeObject() { // from class: im.toss.core.prefser.BasePrefser$$ExternalSyntheticLambda6
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final void subscribe(writeBinary writebinary) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 67;
                onExtraCallbackWithResult = i2 % 128;
                Object obj = null;
                if (i2 % 2 != 0) {
                    Object[] objArr = {this.f$0, writebinary};
                    TextRoundCornerProgressBar2.onExtraCallback(setApTextSize.onNavigationEvent.4.onNavigationEvent(), 532192240, setApTextSize.onNavigationEvent.4.onNavigationEvent(), objArr, setApTextSize.onNavigationEvent.4.onNavigationEvent(), -532192240, setApTextSize.onNavigationEvent.4.onNavigationEvent());
                    throw null;
                }
                Object[] objArr2 = {this.f$0, writebinary};
                TextRoundCornerProgressBar2.onExtraCallback(setApTextSize.onNavigationEvent.4.onNavigationEvent(), 532192240, setApTextSize.onNavigationEvent.4.onNavigationEvent(), objArr2, setApTextSize.onNavigationEvent.4.onNavigationEvent(), -532192240, setApTextSize.onNavigationEvent.4.onNavigationEvent());
                int i3 = IAuthTabCallback + 53;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        }).IAuthTabCallbackStubProxy();
        this.onExtraCallback = new LinkedHashMap();
    }

    public /* bridge */ Boolean onExtraCallback(@NotNull String str) {
        int i = 2 % 2;
        int i2 = asBinder + 53;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            super.onExtraCallback(str);
            throw null;
        }
        Boolean boolOnExtraCallback = super.onExtraCallback(str);
        int i3 = asBinder + 67;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 30 / 0;
        }
        return boolOnExtraCallback;
    }

    public /* bridge */ Integer onExtraCallbackWithResult(@NotNull String str) {
        int i = 2 % 2;
        int i2 = asBinder + 5;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return super.onExtraCallbackWithResult(str);
        }
        super.onExtraCallbackWithResult(str);
        throw null;
    }

    public /* bridge */ String onExtraCallbackWithResult(@NotNull String str, @NotNull String str2) {
        int i = 2 % 2;
        int i2 = asBinder + 57;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        String strOnExtraCallbackWithResult = super.onExtraCallbackWithResult(str, str2);
        int i4 = onTransact + 111;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return strOnExtraCallbackWithResult;
    }

    public /* bridge */ Long onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = asBinder + 99;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Long lOnWarmupCompleted = super.onWarmupCompleted(str);
        int i4 = asBinder + 3;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 15 / 0;
        }
        return lOnWarmupCompleted;
    }

    public /* synthetic */ TextRoundCornerProgressBar2(SharedPreferences sharedPreferences, setOnProgressChangedListener setonprogresschangedlistener, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            setonprogresschangedlistener = new getProgressBackgroundColor();
            int i2 = onTransact + 87;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 % 2;
            }
        }
        this(sharedPreferences, setonprogresschangedlistener);
    }

    private static final void IAuthTabCallback(writeBinary writebinary, SharedPreferences sharedPreferences, String str) {
        int i = 2 % 2;
        int i2 = onTransact + 25;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (str != null) {
            writebinary.IAuthTabCallback(str);
            int i3 = onTransact + 107;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    private static final void onWarmupCompleted(TextRoundCornerProgressBar2 textRoundCornerProgressBar2, SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        int i = 2 % 2;
        int i2 = onTransact + 27;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        textRoundCornerProgressBar2.asInterface.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        if (i3 != 0) {
            throw null;
        }
    }

    private static final void onExtraCallbackWithResult(final TextRoundCornerProgressBar2 textRoundCornerProgressBar2, final writeBinary writebinary) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(writebinary, "");
        final SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: im.toss.core.prefser.BasePrefser$$ExternalSyntheticLambda8
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 17;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 != 0) {
                    TextRoundCornerProgressBar2.onExtraCallbackWithResult(writebinary, sharedPreferences, str);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                TextRoundCornerProgressBar2.onExtraCallbackWithResult(writebinary, sharedPreferences, str);
                int i4 = onNavigationEvent + 111;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 48 / 0;
                }
            }
        };
        writebinary.onWarmupCompleted(new deserializeFloatArray() { // from class: im.toss.core.prefser.BasePrefser$$ExternalSyntheticLambda9
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final void cancel() {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 25;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                TextRoundCornerProgressBar2.IAuthTabCallback(this.f$0, onSharedPreferenceChangeListener);
                int i5 = onExtraCallback + 21;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }
        });
        textRoundCornerProgressBar2.asInterface.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        int i2 = asBinder + 115;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 82 / 0;
        }
    }

    public static final class onWarmupCompleted implements IAnimation<Unit> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ IAnimation onExtraCallbackWithResult;

        /* renamed from: o.TextRoundCornerProgressBar2$onWarmupCompleted$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements setRipple {
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;
            final /* synthetic */ setRipple onExtraCallbackWithResult;

            /* renamed from: o.TextRoundCornerProgressBar2$onWarmupCompleted$3$5, reason: invalid class name */
            public static final class AnonymousClass5 extends ContinuationImpl {
                private static int onExtraCallback = 1;
                private static int onNavigationEvent;
                int I$0;
                Object L$0;
                Object L$1;
                Object L$2;
                Object L$3;
                int label;
                /* synthetic */ Object result;

                public AnonymousClass5(access13800 access13800Var) {
                    super(access13800Var);
                }

                public final Object invokeSuspend(Object obj) {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 121;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    Object obj2 = null;
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                    if (i3 == 0) {
                        anonymousClass3.emit(null, this);
                        obj2.hashCode();
                        throw null;
                    }
                    Object objEmit = anonymousClass3.emit(null, this);
                    int i4 = onExtraCallback + 81;
                    onNavigationEvent = i4 % 128;
                    if (i4 % 2 == 0) {
                        return objEmit;
                    }
                    obj2.hashCode();
                    throw null;
                }
            }

            public AnonymousClass3(setRipple setripple) {
                this.onExtraCallbackWithResult = setripple;
            }

            /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, access13800 access13800Var) {
                AnonymousClass5 anonymousClass5;
                int i = 2 % 2;
                int i2 = onWarmupCompleted;
                int i3 = i2 + 3;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0) {
                    boolean z = access13800Var instanceof AnonymousClass5;
                    throw null;
                }
                if (access13800Var instanceof AnonymousClass5) {
                    int i4 = i2 + 91;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    anonymousClass5 = (AnonymousClass5) access13800Var;
                    int i6 = anonymousClass5.label;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        int i7 = onNavigationEvent + 43;
                        onWarmupCompleted = i7 % 128;
                        if (i7 % 2 != 0) {
                            anonymousClass5.label = i6 >> Integer.MIN_VALUE;
                        } else {
                            anonymousClass5.label = i6 - 2147483648;
                        }
                    } else {
                        anonymousClass5 = new AnonymousClass5(access13800Var);
                    }
                }
                Object obj2 = anonymousClass5.result;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i8 = anonymousClass5.label;
                if (i8 != 0) {
                    int i9 = onNavigationEvent + 81;
                    onWarmupCompleted = i9 % 128;
                    if (i9 % 2 == 0 ? i8 != 1 : i8 != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj2);
                    int i10 = onNavigationEvent + 21;
                    onWarmupCompleted = i10 % 128;
                    int i11 = i10 % 2;
                } else {
                    ResultKt.onNavigationEvent(obj2);
                    setRipple setripple = this.onExtraCallbackWithResult;
                    Unit unit = Unit.INSTANCE;
                    anonymousClass5.L$0 = access15400.onNavigationEvent(obj);
                    anonymousClass5.L$1 = access15400.onNavigationEvent(anonymousClass5);
                    anonymousClass5.L$2 = access15400.onNavigationEvent(obj);
                    anonymousClass5.L$3 = access15400.onNavigationEvent(setripple);
                    anonymousClass5.I$0 = 0;
                    anonymousClass5.label = 1;
                    if (setripple.emit(unit, anonymousClass5) == objOnWarmupCompleted) {
                        int i12 = onWarmupCompleted + 17;
                        onNavigationEvent = i12 % 128;
                        if (i12 % 2 != 0) {
                            return objOnWarmupCompleted;
                        }
                        throw null;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        public onWarmupCompleted(IAnimation iAnimation) {
            this.onExtraCallbackWithResult = iAnimation;
        }

        public Object collect(setRipple setripple, access13800 access13800Var) {
            int i = 2 % 2;
            Object objCollect = this.onExtraCallbackWithResult.collect(new AnonymousClass3(setripple), access13800Var);
            if (objCollect == access14300.onWarmupCompleted()) {
                int i2 = onWarmupCompleted + 35;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return objCollect;
            }
            Unit unit = Unit.INSTANCE;
            int i4 = onNavigationEvent + 11;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }
    }

    private static final boolean onExtraCallback(String str, String str2) {
        int i = 2 % 2;
        int i2 = onTransact + 61;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str2, "");
        boolean zAreEqual = Intrinsics.areEqual(str2, str);
        int i4 = asBinder + 81;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return zAreEqual;
        }
        throw null;
    }

    private static final boolean onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 55;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        boolean zBooleanValue = ((Boolean) function1.invoke(obj)).booleanValue();
        int i4 = onTransact + 43;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return zBooleanValue;
        }
        throw null;
    }

    @Override // o.TextRoundCornerProgressBarSavedState1
    public SharedPreferences onExtraCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 93;
        int i3 = i2 % 128;
        asBinder = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        SharedPreferences sharedPreferences = this.asInterface;
        int i4 = i3 + 97;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return sharedPreferences;
        }
        throw null;
    }

    public boolean onNavigationEvent(@NotNull String str) {
        int i = 2 % 2;
        int i2 = asBinder + 75;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.asInterface.contains(str);
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        boolean zContains = this.asInterface.contains(str);
        int i3 = onTransact + 41;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return zContains;
    }

    public getByteBuffer<String> asInterface() {
        getByteBuffer<String> getbytebuffer;
        int i = 2 % 2;
        int i2 = asBinder + 43;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            getbytebuffer = this.onExtraCallbackWithResult;
            Intrinsics.checkNotNullExpressionValue(getbytebuffer, "");
            int i3 = 59 / 0;
        } else {
            getbytebuffer = this.onExtraCallbackWithResult;
            Intrinsics.checkNotNullExpressionValue(getbytebuffer, "");
        }
        int i4 = asBinder + 123;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return getbytebuffer;
    }

    @Override // o.TextRoundCornerProgressBarSavedState1
    public <T> getByteBuffer<getSecondaryProgressColor<T>> onWarmupCompleted(@NotNull String str, @NotNull Class<T> cls, boolean z) {
        int i = 2 % 2;
        int i2 = asBinder + 59;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(cls, "");
        getByteBuffer<getSecondaryProgressColor<T>> getbytebufferIAuthTabCallback = IAuthTabCallback(str, drawPadding.Companion.onExtraCallbackWithResult(cls), z);
        int i4 = onTransact + 109;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return getbytebufferIAuthTabCallback;
        }
        throw null;
    }

    private static final serializeRaw IAuthTabCallback(Function1 function1, getByteBuffer getbytebuffer) {
        serializeRaw serializeraw;
        int i = 2 % 2;
        int i2 = asBinder + 17;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(getbytebuffer, "");
            serializeraw = (serializeRaw) function1.invoke(getbytebuffer);
            int i3 = 81 / 0;
        } else {
            Intrinsics.checkNotNullParameter(getbytebuffer, "");
            serializeraw = (serializeRaw) function1.invoke(getbytebuffer);
        }
        int i4 = asBinder + 93;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return serializeraw;
    }

    public <T> getByteBuffer<getSecondaryProgressColor<T>> IAuthTabCallback(@NotNull final String str, @NotNull final drawPadding<T> drawpadding, final boolean z) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(drawpadding, "");
        getByteBuffer<getSecondaryProgressColor<T>> getbytebufferOnWarmupCompleted = onWarmupCompleted(str, drawpadding);
        final Function1 function1 = new Function1() { // from class: im.toss.core.prefser.BasePrefser$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 33;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    throw null;
                }
                serializeRaw serializeraw = (serializeRaw) TextRoundCornerProgressBar2.onExtraCallback(setApTextSize.onNavigationEvent.4.onNavigationEvent(), 861037642, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{Boolean.valueOf(z), this, str, drawpadding, (getByteBuffer) obj}, setApTextSize.onNavigationEvent.4.onNavigationEvent(), -861037639, setApTextSize.onNavigationEvent.4.onNavigationEvent());
                int i4 = IAuthTabCallback + 65;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return serializeraw;
            }
        };
        getByteBuffer<getSecondaryProgressColor<T>> getbytebufferOnExtraCallback = getbytebufferOnWarmupCompleted.onExtraCallback(new MapConverter1() { // from class: im.toss.core.prefser.BasePrefser$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final serializeRaw apply(getByteBuffer getbytebuffer) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 57;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr = {function1, getbytebuffer};
                serializeRaw serializeraw = (serializeRaw) TextRoundCornerProgressBar2.onExtraCallback(setApTextSize.onNavigationEvent.4.onNavigationEvent(), 1866102522, setApTextSize.onNavigationEvent.4.onNavigationEvent(), objArr, setApTextSize.onNavigationEvent.4.onNavigationEvent(), -1866102520, setApTextSize.onNavigationEvent.4.onNavigationEvent());
                int i5 = onExtraCallbackWithResult + 123;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return serializeraw;
            }
        });
        Intrinsics.checkNotNullExpressionValue(getbytebufferOnExtraCallback, "");
        int i2 = asBinder + 51;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return getbytebufferOnExtraCallback;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i = 2 % 2;
        getByteBuffer getbytebufferOnWarmupCompleted = getByteBuffer.onWarmupCompleted(new getSecondaryProgressColor((TextRoundCornerProgressBar2) objArr[0], (String) objArr[1], (drawPadding) objArr[2]));
        int i2 = onTransact + 7;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return getbytebufferOnWarmupCompleted;
    }

    private static final serializeRaw IAuthTabCallback(boolean z, final TextRoundCornerProgressBar2 textRoundCornerProgressBar2, final String str, final drawPadding drawpadding, getByteBuffer getbytebuffer) {
        int i = 2 % 2;
        int i2 = onTransact + 65;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(getbytebuffer, "");
        if (z) {
            getByteBuffer getbytebufferOnWarmupCompleted = getByteBuffer.onWarmupCompleted(new Callable() { // from class: im.toss.core.prefser.BasePrefser$$ExternalSyntheticLambda7
                private static int onExtraCallbackWithResult = 1;
                private static int onWarmupCompleted;

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    int i4 = 2 % 2;
                    int i5 = onWarmupCompleted + 73;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    Object[] objArr = {this.f$0, str, drawpadding};
                    serializeRaw serializeraw = (serializeRaw) TextRoundCornerProgressBar2.onExtraCallback(setApTextSize.onNavigationEvent.4.onNavigationEvent(), 541328244, setApTextSize.onNavigationEvent.4.onNavigationEvent(), objArr, setApTextSize.onNavigationEvent.4.onNavigationEvent(), -541328243, setApTextSize.onNavigationEvent.4.onNavigationEvent());
                    int i7 = onWarmupCompleted + 87;
                    onExtraCallbackWithResult = i7 % 128;
                    if (i7 % 2 != 0) {
                        return serializeraw;
                    }
                    throw null;
                }
            });
            Intrinsics.checkNotNullExpressionValue(getbytebufferOnWarmupCompleted, "");
            return getbytebuffer.asBinder(getbytebufferOnWarmupCompleted);
        }
        int i4 = asBinder + 101;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return getbytebuffer;
        }
        throw null;
    }

    private static final boolean IAuthTabCallbackDefault(String str, String str2) {
        int i = 2 % 2;
        int i2 = onTransact + 97;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str2, "");
        boolean zAreEqual = Intrinsics.areEqual(str, str2);
        int i4 = onTransact + 13;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return zAreEqual;
    }

    private static final boolean onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 75;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        boolean zBooleanValue = ((Boolean) function1.invoke(obj)).booleanValue();
        int i4 = onTransact + 21;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    private static final getSecondaryProgressColor asBinder(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 53;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        getSecondaryProgressColor getsecondaryprogresscolor = (getSecondaryProgressColor) function1.invoke(obj);
        int i4 = onTransact + 83;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return getsecondaryprogresscolor;
    }

    private final <T> getByteBuffer<getSecondaryProgressColor<T>> onWarmupCompleted(final String str, final drawPadding<T> drawpadding) {
        int i = 2 % 2;
        getByteBuffer<String> getbytebufferAsInterface = asInterface();
        final Function1 function1 = new Function1() { // from class: im.toss.core.prefser.BasePrefser$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 11;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Boolean boolValueOf = Boolean.valueOf(TextRoundCornerProgressBar2.onWarmupCompleted(str, (String) obj));
                int i5 = IAuthTabCallback + 25;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return boolValueOf;
            }
        };
        getByteBuffer getbytebufferOnWarmupCompleted = getbytebufferAsInterface.onWarmupCompleted(new deserializeLongCollection() { // from class: im.toss.core.prefser.BasePrefser$$ExternalSyntheticLambda3
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final boolean test(Object obj) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 11;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Function1 function12 = function1;
                if (i4 != 0) {
                    return TextRoundCornerProgressBar2.IAuthTabCallback(function12, obj);
                }
                TextRoundCornerProgressBar2.IAuthTabCallback(function12, obj);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        });
        final Function1 function12 = new Function1() { // from class: im.toss.core.prefser.BasePrefser$$ExternalSyntheticLambda4
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 53;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                getSecondaryProgressColor getsecondaryprogresscolorOnExtraCallback = TextRoundCornerProgressBar2.onExtraCallback(this.f$0, str, drawpadding, (String) obj);
                int i5 = onNavigationEvent + 57;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    return getsecondaryprogresscolorOnExtraCallback;
                }
                throw null;
            }
        };
        getByteBuffer<getSecondaryProgressColor<T>> getbytebufferAsInterface2 = getbytebufferOnWarmupCompleted.asInterface(new deserializeIntNullableCollection() { // from class: im.toss.core.prefser.BasePrefser$$ExternalSyntheticLambda5
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object apply(Object obj) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 81;
                onNavigationEvent = i3 % 128;
                Object obj2 = null;
                if (i3 % 2 != 0) {
                    TextRoundCornerProgressBar2.onWarmupCompleted(function12, obj);
                    obj2.hashCode();
                    throw null;
                }
                getSecondaryProgressColor getsecondaryprogresscolorOnWarmupCompleted = TextRoundCornerProgressBar2.onWarmupCompleted(function12, obj);
                int i4 = IAuthTabCallback + 77;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    return getsecondaryprogresscolorOnWarmupCompleted;
                }
                throw null;
            }
        });
        Intrinsics.checkNotNullExpressionValue(getbytebufferAsInterface2, "");
        int i2 = onTransact + 79;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return getbytebufferAsInterface2;
    }

    private static final getSecondaryProgressColor IAuthTabCallback(TextRoundCornerProgressBar2 textRoundCornerProgressBar2, String str, drawPadding drawpadding, String str2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str2, "");
        getSecondaryProgressColor getsecondaryprogresscolor = new getSecondaryProgressColor(textRoundCornerProgressBar2, str, drawpadding);
        int i2 = asBinder + 35;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return getsecondaryprogresscolor;
    }

    @Override // o.TextRoundCornerProgressBarSavedState1
    @Deprecated
    public <T> T onNavigationEvent(@NotNull String str, @NotNull Class<T> cls, @Nullable T t) {
        int i = 2 % 2;
        int i2 = asBinder + 117;
        onTransact = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(cls, "");
            onNavigationEvent(str);
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(cls, "");
        if (!onNavigationEvent(str) && t == null) {
            int i3 = asBinder + 91;
            onTransact = i3 % 128;
            if (i3 % 2 != 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        T t2 = (T) onWarmupCompleted(str, (drawPadding<drawPadding<T>>) drawPadding.Companion.onExtraCallbackWithResult(cls), (drawPadding<T>) t);
        int i4 = onTransact + 87;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return t2;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0048, code lost:
    
        if (r4 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004b, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0037, code lost:
    
        if (r4 == null) goto L13;
     */
    @Override // o.TextRoundCornerProgressBarSavedState1
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <T> T onExtraCallback(@NotNull String str, @NotNull T t) {
        T t2;
        int i = 2 % 2;
        int i2 = asBinder + 27;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(t, "");
        if (onNavigationEvent(str)) {
            int i4 = onTransact + 123;
            asBinder = i4 % 128;
            if (i4 % 2 != 0) {
                t2 = (T) onWarmupCompleted(str, (drawPadding<drawPadding<T>>) drawPadding.Companion.onExtraCallbackWithResult(t.getClass()), (drawPadding<T>) t);
                int i5 = 90 / 0;
            } else {
                t2 = (T) onWarmupCompleted(str, (drawPadding<drawPadding<T>>) drawPadding.Companion.onExtraCallbackWithResult(t.getClass()), (drawPadding<T>) t);
            }
        }
        int i6 = asBinder + 23;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        return t;
    }

    @Override // o.TextRoundCornerProgressBarSavedState1
    @Deprecated
    public <T> T onWarmupCompleted(@NotNull String str, @NotNull drawPadding<T> drawpadding, @Nullable T t) {
        drawProgressReverse<?> drawprogressreverse;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(drawpadding, "");
        Type typeOnNavigationEvent = drawpadding.onNavigationEvent();
        drawProgressReverse<?> drawprogressreverse2 = this.onNavigationEvent.onExtraCallback().get(typeOnNavigationEvent);
        Object obj = null;
        if (!(drawprogressreverse2 instanceof drawProgressReverse)) {
            drawprogressreverse = null;
        } else {
            int i2 = onTransact + 121;
            int i3 = i2 % 128;
            asBinder = i3;
            int i4 = i2 % 2;
            drawprogressreverse = drawprogressreverse2;
            int i5 = i3 + 51;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
        }
        if (drawprogressreverse == null) {
            return onNavigationEvent(str) ? (T) this.onWarmupCompleted.IAuthTabCallback(this.asInterface.getString(str, null), typeOnNavigationEvent) : t;
        }
        int i7 = asBinder + 17;
        onTransact = i7 % 128;
        if (i7 % 2 != 0) {
            return (T) drawprogressreverse.onNavigationEvent(str, t);
        }
        drawprogressreverse.onNavigationEvent(str, t);
        obj.hashCode();
        throw null;
    }

    @Override // o.TextRoundCornerProgressBarSavedState1
    @Deprecated
    public <T> void IAuthTabCallback(@NotNull String str, @NotNull T t) {
        int i = 2 % 2;
        int i2 = onTransact + 57;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(t, "");
        onExtraCallback(str, (String) t, (drawPadding<String>) drawPadding.Companion.onWarmupCompleted(t), false);
        int i4 = onTransact + 83;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 98 / 0;
        }
    }

    @Override // o.TextRoundCornerProgressBarSavedState1
    @Deprecated
    public <T> void onWarmupCompleted(@NotNull String str, @NotNull T t, boolean z) {
        int i = 2 % 2;
        int i2 = onTransact + 89;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(t, "");
        onExtraCallback(str, (String) t, (drawPadding<String>) drawPadding.Companion.onWarmupCompleted(t), z);
        int i4 = asBinder + 113;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    @Deprecated
    public <T> void onExtraCallback(@NotNull String str, @NotNull T t, @NotNull drawPadding<T> drawpadding, boolean z) {
        drawProgressReverse<?> drawprogressreverse;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(drawpadding, "");
        if (!this.onNavigationEvent.onExtraCallback().containsKey(t.getClass())) {
            int i2 = asBinder + 1;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            String strOnWarmupCompleted = this.onWarmupCompleted.onWarmupCompleted(t, drawpadding.onNavigationEvent());
            SharedPreferences.Editor editorEdit = this.asInterface.edit();
            editorEdit.putString(str, strOnWarmupCompleted);
            if (z) {
                editorEdit.commit();
                return;
            } else {
                editorEdit.apply();
                return;
            }
        }
        drawProgressReverse<?> drawprogressreverse2 = this.onNavigationEvent.onExtraCallback().get(t.getClass());
        if (!(!(drawprogressreverse2 instanceof drawProgressReverse))) {
            drawprogressreverse = drawprogressreverse2;
            int i4 = asBinder + 17;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
        } else {
            drawprogressreverse = null;
        }
        if (drawprogressreverse != null) {
            int i6 = asBinder + 61;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            drawprogressreverse.onExtraCallbackWithResult(str, t, z);
        }
    }

    public long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 5;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            this.asInterface.getAll().size();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long size = this.asInterface.getAll().size();
        int i3 = asBinder + 119;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return size;
    }

    public Collection<String> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onTransact + 75;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Map<String, ?> all = this.asInterface.getAll();
        if (i3 == 0) {
            return all.keySet();
        }
        all.keySet();
        throw null;
    }

    public String IAuthTabCallback(@NotNull String str) {
        int i = 2 % 2;
        int i2 = asBinder + 35;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            return this.asInterface.getString(str, null);
        }
        Intrinsics.checkNotNullParameter(str, "");
        int i3 = 9 / 0;
        return this.asInterface.getString(str, null);
    }

    public int onWarmupCompleted(@NotNull String str, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 95;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        int i5 = this.asInterface.getInt(str, i);
        int i6 = asBinder + 93;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public boolean onExtraCallback(@NotNull String str, boolean z) {
        int i = 2 % 2;
        int i2 = asBinder + 83;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.asInterface.getBoolean(str, z);
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        boolean z2 = this.asInterface.getBoolean(str, z);
        int i3 = onTransact + 109;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return z2;
    }

    public float onExtraCallback(@NotNull String str, float f) {
        int i = 2 % 2;
        int i2 = asBinder + 71;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        float f2 = this.asInterface.getFloat(str, f);
        int i4 = asBinder + 31;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return f2;
        }
        throw null;
    }

    public long onExtraCallback(@NotNull String str, long j) {
        int i = 2 % 2;
        int i2 = asBinder + 81;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        long j2 = this.asInterface.getLong(str, j);
        int i4 = onTransact + 107;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return j2;
        }
        throw null;
    }

    public <T extends Parcelable> void onWarmupCompleted(@NotNull String str, @NotNull T t) {
        int i = 2 % 2;
        int i2 = asBinder + 91;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(t, "");
        SharedPreferences.Editor editorEdit = this.asInterface.edit();
        Parcel parcelObtain = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(parcelObtain, "");
        t.writeToParcel(parcelObtain, 0);
        parcelObtain.setDataPosition(0);
        editorEdit.putString(str, Base64.encodeToString(parcelObtain.marshall(), 0));
        editorEdit.apply();
        parcelObtain.recycle();
        int i4 = asBinder + 119;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0026 A[PHI: r1
      0x0026: PHI (r1v5 java.util.Map) = (r1v4 java.util.Map), (r1v7 java.util.Map) binds: [B:8:0x0024, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final <T extends Parcelable> Parcelable.Creator<T> IAuthTabCallback(Class<T> cls) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        Map map;
        Object obj;
        int i = 2 % 2;
        int i2 = asBinder + 125;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            map = this.onExtraCallback;
            obj = map.get(cls);
            if (obj == null) {
            }
        } else {
            map = this.onExtraCallback;
            obj = map.get(cls);
            int i3 = 26 / 0;
            if (obj == null) {
                Field declaredField = cls.getDeclaredField("CREATOR");
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(null);
                Intrinsics.checkNotNull(obj2, "");
                obj = (Parcelable.Creator) obj2;
                map.put(cls, obj);
            }
        }
        Intrinsics.checkNotNull(obj, "");
        Parcelable.Creator<T> creator = (Parcelable.Creator) obj;
        int i4 = onTransact + 21;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return creator;
        }
        throw null;
    }

    public <T extends Parcelable> T IAuthTabCallback(@NotNull String str, @NotNull Class<T> cls, @Nullable T t) {
        int i = 2 % 2;
        int i2 = onTransact + 9;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(cls, "");
            this.asInterface.getString(str, null);
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(cls, "");
        String string = this.asInterface.getString(str, null);
        if (string == null) {
            int i3 = asBinder + 103;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            return null;
        }
        byte[] bArrDecode = Base64.decode(string, 0);
        Parcel parcelObtain = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(parcelObtain, "");
        parcelObtain.unmarshall(bArrDecode, 0, bArrDecode.length);
        parcelObtain.setDataPosition(0);
        T tCreateFromParcel = IAuthTabCallback(cls).createFromParcel(parcelObtain);
        parcelObtain.recycle();
        int i5 = onTransact + 83;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return tCreateFromParcel;
    }

    public void onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder + 13;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        this.asInterface.edit().commit();
        int i4 = onTransact + 21;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BasePrefser(prefs=" + this.asInterface + ")";
        int i2 = onTransact + 85;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public IAnimation<Unit> IAuthTabCallbackStub(@NotNull final String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        getByteBuffer<String> getbytebuffer = this.onExtraCallbackWithResult;
        final Function1 function1 = new Function1() { // from class: im.toss.core.prefser.BasePrefser$$ExternalSyntheticLambda10
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 95;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Boolean boolValueOf = Boolean.valueOf(TextRoundCornerProgressBar2.IAuthTabCallback(str, (String) obj));
                int i5 = onWarmupCompleted + 71;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    return boolValueOf;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        };
        getByteBuffer getbytebufferOnWarmupCompleted = getbytebuffer.onWarmupCompleted(new deserializeLongCollection() { // from class: im.toss.core.prefser.BasePrefser$$ExternalSyntheticLambda11
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final boolean test(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 125;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                boolean zOnExtraCallback = TextRoundCornerProgressBar2.onExtraCallback(function1, obj);
                int i5 = onExtraCallbackWithResult + 35;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return zOnExtraCallback;
            }
        });
        Intrinsics.checkNotNullExpressionValue(getbytebufferOnWarmupCompleted, "");
        onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(RxConvertKt.IAuthTabCallback(getbytebufferOnWarmupCompleted));
        int i2 = asBinder + 117;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return onwarmupcompleted;
    }

    public void onNavigationEvent(@NotNull String str, @NotNull String str2) {
        int i = 2 % 2;
        int i2 = onTransact + 25;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        SharedPreferences.Editor editorEdit = this.asInterface.edit();
        editorEdit.putString(str, str2);
        editorEdit.apply();
        int i4 = asBinder + 125;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public void IAuthTabCallback(@NotNull String str, @NotNull String str2, boolean z) {
        int i = 2 % 2;
        int i2 = asBinder + 27;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.asInterface.edit().putString(str, str2);
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        SharedPreferences.Editor editorEdit = this.asInterface.edit();
        editorEdit.putString(str, str2);
        if (!z) {
            editorEdit.apply();
            return;
        }
        editorEdit.commit();
        int i3 = asBinder + 27;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    public void onExtraCallback(@NotNull String str, int i, boolean z) {
        int i2 = 2 % 2;
        int i3 = asBinder + 29;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.asInterface.edit().putInt(str, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        SharedPreferences.Editor editorEdit = this.asInterface.edit();
        editorEdit.putInt(str, i);
        if (z) {
            editorEdit.commit();
            int i4 = onTransact + 95;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        editorEdit.apply();
        int i6 = asBinder + 41;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
    }

    public void onExtraCallbackWithResult(@NotNull String str, boolean z, boolean z2) {
        int i = 2 % 2;
        int i2 = asBinder + 35;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        SharedPreferences.Editor editorEdit = this.asInterface.edit();
        editorEdit.putBoolean(str, z);
        if (z2) {
            editorEdit.commit();
            return;
        }
        editorEdit.apply();
        int i4 = asBinder + 39;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onExtraCallback(@NotNull String str, long j, boolean z) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        SharedPreferences.Editor editorEdit = this.asInterface.edit();
        editorEdit.putLong(str, j);
        if (!z) {
            editorEdit.apply();
            return;
        }
        int i2 = onTransact + 15;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        editorEdit.commit();
        int i4 = onTransact + 125;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onTransact(@NotNull String str) {
        int i = 2 % 2;
        int i2 = asBinder + 93;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            SharedPreferences.Editor editorEdit = this.asInterface.edit();
            editorEdit.remove(str);
            editorEdit.apply();
            int i3 = 94 / 0;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            SharedPreferences.Editor editorEdit2 = this.asInterface.edit();
            editorEdit2.remove(str);
            editorEdit2.apply();
        }
        int i4 = asBinder + 55;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asBinder + 99;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            SharedPreferences.Editor editorEdit = this.asInterface.edit();
            editorEdit.clear();
            editorEdit.apply();
            int i3 = onTransact + 115;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        SharedPreferences.Editor editorEdit2 = this.asInterface.edit();
        editorEdit2.clear();
        editorEdit2.apply();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onExtraCallbackWithResult(@NotNull String str, int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 35;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        SharedPreferences.Editor editorEdit = this.asInterface.edit();
        editorEdit.putInt(str, i);
        editorEdit.apply();
        int i5 = asBinder + 49;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 91 / 0;
        }
    }

    public void onNavigationEvent(@NotNull String str, boolean z) {
        int i = 2 % 2;
        int i2 = onTransact + 55;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            SharedPreferences.Editor editorEdit = this.asInterface.edit();
            editorEdit.putBoolean(str, z);
            editorEdit.apply();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        SharedPreferences.Editor editorEdit2 = this.asInterface.edit();
        editorEdit2.putBoolean(str, z);
        editorEdit2.apply();
        int i3 = asBinder + 31;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
    }

    public void onExtraCallbackWithResult(@NotNull String str, float f) {
        int i = 2 % 2;
        int i2 = onTransact + 57;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        SharedPreferences.Editor editorEdit = this.asInterface.edit();
        editorEdit.putFloat(str, f);
        editorEdit.apply();
        int i4 = onTransact + 67;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onNavigationEvent(@NotNull String str, long j) {
        int i = 2 % 2;
        int i2 = onTransact + 9;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            SharedPreferences.Editor editorEdit = this.asInterface.edit();
            editorEdit.putLong(str, j);
            editorEdit.apply();
            int i3 = 74 / 0;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            SharedPreferences.Editor editorEdit2 = this.asInterface.edit();
            editorEdit2.putLong(str, j);
            editorEdit2.apply();
        }
        int i4 = onTransact + 83;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ serializeRaw onExtraCallbackWithResult(Function1 function1, getByteBuffer getbytebuffer) {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        return (serializeRaw) onExtraCallback(iOnNavigationEvent, 1866102522, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{function1, getbytebuffer}, setApTextSize.onNavigationEvent.4.onNavigationEvent(), -1866102520, iOnNavigationEvent2);
    }

    public static /* synthetic */ serializeRaw onNavigationEvent(boolean z, TextRoundCornerProgressBar2 textRoundCornerProgressBar2, String str, drawPadding drawpadding, getByteBuffer getbytebuffer) {
        Object[] objArr = {Boolean.valueOf(z), textRoundCornerProgressBar2, str, drawpadding, getbytebuffer};
        return (serializeRaw) onExtraCallback(setApTextSize.onNavigationEvent.4.onNavigationEvent(), 861037642, setApTextSize.onNavigationEvent.4.onNavigationEvent(), objArr, setApTextSize.onNavigationEvent.4.onNavigationEvent(), -861037639, setApTextSize.onNavigationEvent.4.onNavigationEvent());
    }

    public static /* synthetic */ serializeRaw IAuthTabCallback(TextRoundCornerProgressBar2 textRoundCornerProgressBar2, String str, drawPadding drawpadding) {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        return (serializeRaw) onExtraCallback(iOnNavigationEvent, 541328244, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{textRoundCornerProgressBar2, str, drawpadding}, setApTextSize.onNavigationEvent.4.onNavigationEvent(), -541328243, iOnNavigationEvent2);
    }

    public static /* synthetic */ void onNavigationEvent(TextRoundCornerProgressBar2 textRoundCornerProgressBar2, writeBinary writebinary) {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        onExtraCallback(iOnNavigationEvent, 532192240, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{textRoundCornerProgressBar2, writebinary}, setApTextSize.onNavigationEvent.4.onNavigationEvent(), -532192240, iOnNavigationEvent2);
    }

    private static final serializeRaw onExtraCallbackWithResult(TextRoundCornerProgressBar2 textRoundCornerProgressBar2, String str, drawPadding drawpadding) {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        return (serializeRaw) onExtraCallback(iOnNavigationEvent, -1899126499, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{textRoundCornerProgressBar2, str, drawpadding}, setApTextSize.onNavigationEvent.4.onNavigationEvent(), 1899126503, iOnNavigationEvent2);
    }
}
